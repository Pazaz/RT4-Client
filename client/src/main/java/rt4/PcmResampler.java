package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class PcmResampler {

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
	private int outputRate;

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
	private int inputRate;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(II)V")
	public PcmResampler(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = gcd(arg1, arg0);
			@Pc(16) int local16 = arg1 / local12;
			this.outputRate = local16;
			@Pc(23) int local23 = arg0 / local12;
			this.anIntArrayArray40 = new int[local23][14];
			this.inputRate = local23;
			for (@Pc(33) int local33 = 0; local33 < local23; local33++) {
				@Pc(41) int[] local41 = this.anIntArrayArray40[local33];
				@Pc(49) double local49 = (double) local33 / (double) local23 + 6.0D;
				@Pc(55) double local55 = (double) local16 / (double) local23;
				@Pc(63) int local63 = (int) Math.floor(local49 + 1.0D - 7.0D);
				@Pc(69) int local69 = (int) Math.ceil(local49 + 7.0D);
				if (local63 < 0) {
					local63 = 0;
				}
				if (local69 > 14) {
					local69 = 14;
				}
				while (local63 < local69) {
					@Pc(91) double local91 = ((double) local63 - local49) * 3.141592653589793D;
					@Pc(93) double local93 = local55;
					if (-1.0E-4D > local91 || local91 > 1.0E-4D) {
						local93 = local55 * (Math.sin(local91) / local91);
					}
					local93 *= Math.cos(((double) local63 - local49) * 0.2243994752564138D) * 0.46D + 0.54D;
					local41[local63] = (int) Math.floor(local93 * 65536.0D + 0.5D);
					local63++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)I")
	public static int gcd(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(21) int local21 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local21;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([BB)[B")
	public final byte[] method4520(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray40 != null) {
			@Pc(31) int local31 = (int) ((long) arg0.length * (long) this.outputRate / (long) this.inputRate) + 14;
			@Pc(34) int[] local34 = new int[local31];
			@Pc(36) int local36 = 0;
			@Pc(38) int local38 = 0;
			@Pc(40) int local40;
			for (local40 = 0; local40 < arg0.length; local40++) {
				@Pc(53) int[] local53 = this.anIntArrayArray40[local38];
				@Pc(57) byte local57 = arg0[local40];
				@Pc(59) int local59;
				for (local59 = 0; local59 < 14; local59++) {
					local34[local36 + local59] += local53[local59] * local57;
				}
				local38 += this.outputRate;
				local59 = local38 / this.inputRate;
				local36 += local59;
				local38 -= local59 * this.inputRate;
			}
			arg0 = new byte[local31];
			for (local40 = 0; local40 < local31; local40++) {
				@Pc(119) int local119 = local34[local40] + 32768 >> 16;
				if (local119 < -128) {
					arg0[local40] = -128;
				} else if (local119 <= 127) {
					arg0[local40] = (byte) local119;
				} else {
					arg0[local40] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)I")
	public final int scaleRate(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray40 != null) {
			arg0 = (int) ((long) this.outputRate * (long) arg0 / (long) this.inputRate);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZI)I")
	public final int scalePosition(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray40 != null) {
			arg0 = (int) ((long) this.outputRate * (long) arg0 / (long) this.inputRate) + 6;
		}
		return arg0;
	}
}
