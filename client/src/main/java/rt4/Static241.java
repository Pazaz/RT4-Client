package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

    @OriginalMember(owner = "client!th", name = "m", descriptor = "[Lclient!be;")
	public static Component[] aClass13Array13;

	@OriginalMember(owner = "client!th", name = "o", descriptor = "[I")
	public static int[] anIntArray522;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "[I")
	public static final int[] anIntArray520 = new int[14];

    @OriginalMember(owner = "client!th", name = "n", descriptor = "Z")
	public static boolean aBoolean302 = false;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZIIII)V")
	public static void setWindowMode(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static97.aLong89 = 0L;
		@Pc(4) int mode = Static144.getWindowMode();
		if (arg1 == 3 || mode == 3) {
			arg0 = true;
		}
		@Pc(44) boolean useHd = false;
		if (mode > 0 != arg1 > 0) {
			useHd = true;
		}
		if (arg0 && arg1 > 0) {
			useHd = true;
		}
		Static197.setWindowMode(arg0, arg1, useHd, mode, arg2, arg3);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIBIIII)I")
	public static int method4541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(9) int local9 = arg0;
			arg0 = arg2;
			arg2 = local9;
		}
		@Pc(29) int local29 = arg1 & 0x3;
		if (local29 == 0) {
			return arg5;
		} else if (local29 == 1) {
			return 7 + 1 - arg3 - arg0;
		} else if (local29 == 2) {
			return 1 + 7 - arg2 - arg5;
		} else {
			return arg3;
		}
	}

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BIIIII)V")
	public static void method4547(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg1 - arg2;
		@Pc(14) int local14 = arg3 - arg4;
		if (local14 == 0) {
			if (local9 != 0) {
				Static101.method2054(arg2, arg4, arg1, arg0);
			}
		} else if (local9 == 0) {
			Static222.method3826(arg0, arg2, arg3, arg4);
		} else {
			if (local9 < 0) {
				local9 = -local9;
			}
			if (local14 < 0) {
				local14 = -local14;
			}
			@Pc(70) boolean local70 = local14 < local9;
			@Pc(74) int local74;
			@Pc(78) int local78;
			if (local70) {
				local74 = arg4;
				arg4 = arg2;
				local78 = arg3;
				arg2 = local74;
				arg3 = arg1;
				arg1 = local78;
			}
			if (arg3 < arg4) {
				local74 = arg4;
				arg4 = arg3;
				arg3 = local74;
				local78 = arg2;
				arg2 = arg1;
				arg1 = local78;
			}
			local74 = arg2;
			local78 = arg3 - arg4;
			@Pc(111) int local111 = arg1 - arg2;
			@Pc(116) int local116 = -(local78 >> 1);
			@Pc(123) int local123 = arg1 <= arg2 ? -1 : 1;
			if (local111 < 0) {
				local111 = -local111;
			}
			@Pc(136) int local136;
			if (local70) {
				for (local136 = arg4; local136 <= arg3; local136++) {
					Static71.anIntArrayArray10[local136][local74] = arg0;
					local116 += local111;
					if (local116 > 0) {
						local74 += local123;
						local116 -= local78;
					}
				}
			} else {
				for (local136 = arg4; local136 <= arg3; local136++) {
					local116 += local111;
					Static71.anIntArrayArray10[local74][local136] = arg0;
					if (local116 > 0) {
						local74 += local123;
						local116 -= local78;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V")
	public static void method4548() {
		Static172.aClass3_Sub3_Sub4_2.method4446();
		MidiPlayer.anInt441 = 1;
		Static172.aClass153_70 = null;
	}
}
