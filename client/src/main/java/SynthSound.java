import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class SynthSound {

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "[Lclient!pj;")
	private final SynthInstrument[] aClass123Array1 = new SynthInstrument[10];

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
	private int anInt5207;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
	private int anInt5206;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!wa;)V")
	public SynthSound(@OriginalArg(0) Buffer arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(14) int local14 = arg0.g1();
			if (local14 != 0) {
				arg0.offset--;
				this.aClass123Array1[local7] = new SynthInstrument();
				this.aClass123Array1[local7].method3506(arg0);
			}
		}
		this.anInt5207 = arg0.g2();
		this.anInt5206 = arg0.g2();
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "()[B")
	private byte[] method3987() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass123Array1[local3] != null && this.aClass123Array1[local3].anInt4546 + this.aClass123Array1[local3].anInt4548 > local1) {
				local1 = this.aClass123Array1[local3].anInt4546 + this.aClass123Array1[local3].anInt4548;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		local3 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local3];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass123Array1[local54] != null) {
				@Pc(72) int local72 = this.aClass123Array1[local54].anInt4546 * 22050 / 1000;
				@Pc(82) int local82 = this.aClass123Array1[local54].anInt4548 * 22050 / 1000;
				@Pc(94) int[] local94 = this.aClass123Array1[local54].method3505(local72, this.aClass123Array1[local54].anInt4546);
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
	public final PcmSound method3989() {
		@Pc(2) byte[] local2 = this.method3987();
		return new PcmSound(22050, local2, this.anInt5207 * 22050 / 1000, this.anInt5206 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "()I")
	public final int method3990() {
		@Pc(1) int local1 = 9999999;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass123Array1[local3] != null && this.aClass123Array1[local3].anInt4548 / 20 < local1) {
				local1 = this.aClass123Array1[local3].anInt4548 / 20;
			}
		}
		if (this.anInt5207 < this.anInt5206 && this.anInt5207 / 20 < local1) {
			local1 = this.anInt5207 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass123Array1[local3] != null) {
				this.aClass123Array1[local3].anInt4548 -= local1 * 20;
			}
		}
		if (this.anInt5207 < this.anInt5206) {
			this.anInt5207 -= local1 * 20;
			this.anInt5206 -= local1 * 20;
		}
		return local1;
	}
}
