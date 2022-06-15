package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "Lclient!qf;")
	public static Sprite aClass3_Sub2_Sub1_8;

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
	public static int anInt4042;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Lclient!na;")
	public static final JagString DETAILS = JagString.parse("details");

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg1 && arg8 == arg2 && arg7 == arg6 && arg4 == arg5) {
			Static231.method3982(arg3, arg4, arg0, arg8, arg6);
			return;
		}
		@Pc(32) int local32 = arg0;
		@Pc(36) int local36 = arg8 * 3;
		@Pc(40) int local40 = arg0 * 3;
		@Pc(42) int local42 = arg8;
		@Pc(46) int local46 = arg1 * 3;
		@Pc(50) int local50 = arg2 * 3;
		@Pc(54) int local54 = arg7 * 3;
		@Pc(58) int local58 = arg5 * 3;
		@Pc(66) int local66 = local46 + arg6 - local54 - arg0;
		@Pc(76) int local76 = local54 + local40 - local46 - local46;
		@Pc(85) int local85 = local50 + arg4 - local58 - arg8;
		@Pc(95) int local95 = local36 + local58 - local50 - local50;
		@Pc(100) int local100 = local46 - local40;
		@Pc(105) int local105 = local50 - local36;
		for (@Pc(107) int local107 = 128; local107 <= 4096; local107 += 128) {
			@Pc(118) int local118 = local107 * local107 >> 12;
			@Pc(124) int local124 = local107 * local118 >> 12;
			@Pc(128) int local128 = local95 * local118;
			@Pc(132) int local132 = local124 * local85;
			@Pc(136) int local136 = local118 * local76;
			@Pc(140) int local140 = local66 * local124;
			@Pc(144) int local144 = local100 * local107;
			@Pc(156) int local156 = arg0 + (local136 + local140 + local144 >> 12);
			@Pc(160) int local160 = local107 * local105;
			@Pc(172) int local172 = arg8 + (local160 + local132 + local128 >> 12);
			Static231.method3982(arg3, local172, local32, local42, local156);
			local32 = local156;
			local42 = local172;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIII)V")
	public static void method3163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == arg4) {
			method1760(arg4, arg2, arg0, arg3);
		} else if (TextureOp29.anInt4164 <= arg2 - arg4 && arg2 + arg4 <= TextureOp29.anInt5063 && arg3 - arg1 >= TextureOp29.anInt5773 && arg3 + arg1 <= TextureOp29.anInt2869) {
			method1568(arg3, arg2, arg4, arg1, arg0);
		} else {
			method898(arg0, arg1, arg4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Lclient!na;")
	public static JagString method3165() {
		@Pc(21) JagString local21 = new JagString();
		local21.length = 1;
		local21.chars = new byte[1];
		local21.chars[0] = -96;
		return local21;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIB)V")
	public static void method1760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 - arg0 >= TextureOp29.anInt4164 && TextureOp29.anInt5063 >= arg0 + arg1 && arg3 - arg0 >= TextureOp29.anInt5773 && TextureOp29.anInt2869 >= arg0 + arg3) {
			Static49.method1206(arg1, arg0, arg2, arg3);
		} else {
			Static89.method1843(arg2, arg3, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIII)V")
	public static void method1568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static131.method2576(Static71.anIntArrayArray10[arg0], arg1 - arg2, arg2 + arg1, arg4);
		@Pc(17) int local17 = 0;
		@Pc(21) int local21 = arg2 * arg2;
		@Pc(25) int local25 = arg3 * arg3;
		@Pc(27) int local27 = arg3;
		@Pc(31) int local31 = local25 << 1;
		@Pc(35) int local35 = local21 << 1;
		@Pc(39) int local39 = arg3 << 1;
		@Pc(48) int local48 = local31 + (1 - local39) * local21;
		@Pc(56) int local56 = local25 - local35 * (local39 - 1);
		@Pc(60) int local60 = local21 << 2;
		@Pc(70) int local70 = local25 << 2;
		@Pc(78) int local78 = local31 * 3;
		@Pc(86) int local86 = local35 * ((arg3 << 1) - 3);
		@Pc(92) int local92 = local70;
		@Pc(98) int local98 = local60 * (arg3 - 1);
		while (local27 > 0) {
			local27--;
			@Pc(105) int local105 = local27 + arg0;
			@Pc(109) int local109 = arg0 - local27;
			if (local48 < 0) {
				while (local48 < 0) {
					local17++;
					local48 += local78;
					local56 += local92;
					local92 += local70;
					local78 += local70;
				}
			}
			if (local56 < 0) {
				local48 += local78;
				local78 += local70;
				local56 += local92;
				local17++;
				local92 += local70;
			}
			@Pc(160) int local160 = local17 + arg1;
			local56 += -local86;
			local86 -= local60;
			local48 += -local98;
			@Pc(179) int local179 = arg1 - local17;
			local98 -= local60;
			Static131.method2576(Static71.anIntArrayArray10[local109], local179, local160, arg4);
			Static131.method2576(Static71.anIntArrayArray10[local105], local179, local160, arg4);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIBII)V")
	public static void method898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg1;
		@Pc(21) int local21 = local13 << 1;
		@Pc(25) int local25 = arg1 * arg1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(33) int local33 = local25 << 1;
		@Pc(42) int local42 = local13 * (1 - local29) + local33;
		@Pc(51) int local51 = local25 - local21 * (local29 - 1);
		@Pc(55) int local55 = local25 << 2;
		@Pc(63) int local63 = local33 * 3;
		@Pc(67) int local67 = local13 << 2;
		@Pc(75) int local75 = ((arg1 << 1) - 3) * local21;
		@Pc(81) int local81 = local55;
		@Pc(95) int local95;
		@Pc(104) int local104;
		if (arg4 >= TextureOp29.anInt5773 && TextureOp29.anInt2869 >= arg4) {
			local95 = Static78.method1690(TextureOp29.anInt5063, arg2 + arg3, TextureOp29.anInt4164);
			local104 = Static78.method1690(TextureOp29.anInt5063, arg3 - arg2, TextureOp29.anInt4164);
			Static131.method2576(Static71.anIntArrayArray10[arg4], local104, local95, arg0);
		}
		@Pc(118) int local118 = local67 * (arg1 - 1);
		while (local17 > 0) {
			local17--;
			if (local42 < 0) {
				while (local42 < 0) {
					local15++;
					local42 += local63;
					local51 += local81;
					local81 += local55;
					local63 += local55;
				}
			}
			local95 = arg4 - local17;
			if (local51 < 0) {
				local51 += local81;
				local42 += local63;
				local63 += local55;
				local81 += local55;
				local15++;
			}
			local51 += -local75;
			local75 -= local67;
			local42 += -local118;
			local104 = local17 + arg4;
			if (TextureOp29.anInt5773 <= local104 && TextureOp29.anInt2869 >= local95) {
				@Pc(213) int local213 = Static78.method1690(TextureOp29.anInt5063, local15 + arg3, TextureOp29.anInt4164);
				@Pc(222) int local222 = Static78.method1690(TextureOp29.anInt5063, arg3 - local15, TextureOp29.anInt4164);
				if (local95 >= TextureOp29.anInt5773) {
					Static131.method2576(Static71.anIntArrayArray10[local95], local222, local213, arg0);
				}
				if (TextureOp29.anInt2869 >= local104) {
					Static131.method2576(Static71.anIntArrayArray10[local104], local222, local213, arg0);
				}
			}
			local118 -= local67;
		}
	}
}
