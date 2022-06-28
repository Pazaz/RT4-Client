package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class PerlinNoise {
	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)I")
	public static int getTileHeight(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(36) int local36 = interpolatedNoise(4, arg1 + 45365, arg0 - -91923) + (interpolatedNoise(2, arg1 + 10294, arg0 + 37821) - 128 >> 1) + (interpolatedNoise(1, arg1, arg0) + -128 >> 2) - 128;
		local36 = (int) ((double) local36 * 0.3D) + 35;
		if (local36 < 10) {
			local36 = 10;
		} else if (local36 > 60) {
			local36 = 60;
		}
		return local36;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)I")
	public static int interpolatedNoise(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 / arg0;
		@Pc(11) int local11 = arg2 / arg0;
		@Pc(17) int local17 = arg2 & arg0 - 1;
		@Pc(23) int local23 = arg0 - 1 & arg1;
		@Pc(28) int local28 = smoothNoise(local7, local11);
		@Pc(35) int local35 = smoothNoise(local7 + 1, local11);
		@Pc(42) int local42 = smoothNoise(local7, local11 + 1);
		@Pc(56) int local56 = smoothNoise(local7 + 1, local11 + 1);
		@Pc(63) int local63 = interpolate(local28, local35, local23, arg0);
		@Pc(70) int local70 = interpolate(local42, local56, local23, arg0);
		return interpolate(local63, local70, local17, arg0);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIB)I")
	public static int smoothNoise(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(47) int local47 = noise(arg0 - 1, arg1 + -1) + noise(arg0 + 1, arg1 + -1) + noise(arg0 + -1, arg1 - -1) + noise(arg0 + 1, arg1 - -1);
		@Pc(76) int local76 = noise(arg0 - 1, arg1) + noise(arg0 + 1, arg1) + noise(arg0, arg1 + -1) + noise(arg0, arg1 + 1);
		@Pc(81) int local81 = noise(arg0, arg1);
		return local76 / 8 + local47 / 16 + local81 / 4;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)I")
	public static int interpolate(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22 = 65536 - MathUtils.cos[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local22) >> 16) + (arg1 * local22 >> 16);
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(III)I")
	public static int noise(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local14 ^ local14 << 13;
		@Pc(34) int local34 = Integer.MAX_VALUE & (local20 * local20 * 15731 + 789221) * local20 + 1376312589;
		return local34 >> 19 & 0xFF;
	}
}
