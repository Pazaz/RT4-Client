import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!th", name = "f", descriptor = "[Lclient!ok;")
	public static IndexedSprite[] aClass36Array16;

	@OriginalMember(owner = "client!th", name = "j", descriptor = "[[Lclient!be;")
	public static Component[][] components;

	@OriginalMember(owner = "client!th", name = "m", descriptor = "[Lclient!be;")
	public static Component[] aClass13Array13;

	@OriginalMember(owner = "client!th", name = "o", descriptor = "[I")
	public static int[] anIntArray522;

	@OriginalMember(owner = "client!th", name = "p", descriptor = "[Lclient!mm;")
	public static SoftwareSprite[] aClass3_Sub2_Sub1_Sub1Array13;

	@OriginalMember(owner = "client!th", name = "h", descriptor = "Lclient!na;")
	public static final JagString aClass100_1088 = Static28.parse("::setparticles");

	@OriginalMember(owner = "client!th", name = "i", descriptor = "[I")
	public static final int[] anIntArray520 = new int[14];

	@OriginalMember(owner = "client!th", name = "l", descriptor = "[I")
	public static final int[] anIntArray521 = new int[100];

	@OriginalMember(owner = "client!th", name = "n", descriptor = "Z")
	public static boolean aBoolean302 = false;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(DI)V")
	public static void method4537(@OriginalArg(0) double arg0) {
		if (Static122.aDouble1 == arg0) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(25) int local25 = (int) (Math.pow((double) local12 / 255.0D, arg0) * 255.0D);
			Static103.anIntArray253[local12] = local25 > 255 ? 255 : local25;
		}
		Static122.aDouble1 = arg0;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZIIII)V")
	public static void method4540(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static97.aLong89 = 0L;
		@Pc(4) int local4 = Static144.method2736();
		if (arg1 == 3 || local4 == 3) {
			arg0 = true;
		}
		@Pc(44) boolean local44 = false;
		if (local4 > 0 != arg1 > 0) {
			local44 = true;
		}
		if (arg0 && arg1 > 0) {
			local44 = true;
		}
		Static197.method3560(arg0, arg1, local44, local4, arg2, arg3);
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

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZBLclient!ve;Lclient!dd;Lclient!ve;)V")
	public static void method4542(@OriginalArg(2) Js5 arg0, @OriginalArg(3) SoftwareFont arg1, @OriginalArg(4) Js5 arg2) {
		Static240.aBoolean276 = true;
		Static230.aClass153_95 = arg2;
		Static167.aClass153_61 = arg0;
		@Pc(23) int local23 = Static167.aClass153_61.method4483() - 1;
		Static170.anInt3245 = Static167.aClass153_61.method4504(local23) + local23 * 256;
		Static143.aClass100Array104 = new JagString[] { null, null, null, null, LocalizedText.DROP};
		Static269.aClass100Array87 = new JagString[] { null, null, LocalizedText.TAKE, null, null };
		Static256.aClass3_Sub2_Sub9_Sub1_1 = arg1;
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
		Static14.anInt441 = 1;
		Static172.aClass153_70 = null;
	}
}
