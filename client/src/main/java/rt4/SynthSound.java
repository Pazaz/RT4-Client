package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class SynthSound {

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "[Lclient!pj;")
	private final SynthInstrument[] instruments = new SynthInstrument[10];

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
	private int start;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
	private int end;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!wa;)V")
	public SynthSound(@OriginalArg(0) Buffer arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(14) int local14 = arg0.g1();
			if (local14 != 0) {
				arg0.offset--;
				this.instruments[local7] = new SynthInstrument();
				this.instruments[local7].method3506(arg0);
			}
		}
		this.start = arg0.g2();
		this.end = arg0.g2();
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!ve;II)Lclient!sl;")
	public static SynthSound create(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.fetchFile(arg1, arg2);
		return local5 == null ? null : new SynthSound(new Buffer(local5));
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "()[B")
	private byte[] getSamples() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.instruments[local3] != null && this.instruments[local3].length + this.instruments[local3].start > local1) {
				local1 = this.instruments[local3].length + this.instruments[local3].start;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		local3 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local3];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.instruments[local54] != null) {
				@Pc(72) int local72 = this.instruments[local54].length * 22050 / 1000;
				@Pc(82) int local82 = this.instruments[local54].start * 22050 / 1000;
				@Pc(94) int[] local94 = this.instruments[local54].getSamples(local72, this.instruments[local54].length);
				for (@Pc(96) int local96 = 0; local96 < local72; local96++) {
					@Pc(111) int local111 = local52[local96 + local82] + (local94[local96] >> 8);
					if ((local111 + 128 & 0xFFFFFF00) != 0) {
						local111 = local111 >> 31 ^ 0x7F;
					}
					local52[local96 + local82] = (byte) local111;
				}
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "()Lclient!kj;")
	public final PcmSound toPcmSound() {
		@Pc(2) byte[] local2 = this.getSamples();
		return new PcmSound(22050, local2, this.start * 22050 / 1000, this.end * 22050 / 1000);
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "()I")
	public final int getStart() {
		@Pc(1) int local1 = 9999999;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.instruments[local3] != null && this.instruments[local3].start / 20 < local1) {
				local1 = this.instruments[local3].start / 20;
			}
		}
		if (this.start < this.end && this.start / 20 < local1) {
			local1 = this.start / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (local3 = 0; local3 < 10; local3++) {
			if (this.instruments[local3] != null) {
				this.instruments[local3].start -= local1 * 20;
			}
		}
		if (this.start < this.end) {
			this.start -= local1 * 20;
			this.end -= local1 * 20;
		}
		return local1;
	}
}
