package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method1623(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == arg6) {
			method2826(arg0, arg2, arg5, arg6, arg1, arg4);
		} else if (arg1 - arg6 >= TextureOp29.anInt4164 && arg6 + arg1 <= TextureOp29.anInt5063 && TextureOp29.anInt5773 <= arg2 - arg3 && TextureOp29.anInt2869 >= arg2 + arg3) {
			method4594(arg5, arg1, arg2, arg4, arg6, arg3, arg0);
		} else {
			method3981(arg6, arg5, arg4, arg0, arg2, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg4 - arg6;
		@Pc(20) int local20 = arg4 * arg4;
		@Pc(25) int local25 = arg5 - arg6;
		@Pc(29) int local29 = arg5 * arg5;
		@Pc(33) int local33 = local25 * local25;
		@Pc(37) int local37 = local29 << 1;
		@Pc(41) int local41 = local20 << 1;
		@Pc(45) int local45 = local33 << 1;
		@Pc(49) int local49 = local16 * local16;
		@Pc(53) int local53 = local49 << 1;
		@Pc(57) int local57 = arg5 << 1;
		@Pc(61) int local61 = local25 << 1;
		@Pc(70) int local70 = local29 - (local57 - 1) * local41;
		@Pc(80) int local80 = local49 * (1 - local61) + local45;
		@Pc(89) int local89 = (1 - local57) * local20 + local37;
		@Pc(93) int local93 = local20 << 2;
		@Pc(102) int local102 = local33 - local53 * (local61 - 1);
		@Pc(106) int local106 = local49 << 2;
		@Pc(110) int local110 = local29 << 2;
		@Pc(114) int local114 = local33 << 2;
		@Pc(120) int local120 = (local57 - 3) * local41;
		@Pc(124) int local124 = local37 * 3;
		@Pc(130) int local130 = (local61 - 3) * local53;
		@Pc(134) int local134 = local45 * 3;
		@Pc(136) int local136 = local110;
		@Pc(138) int local138 = local114;
		@Pc(144) int local144 = (local25 - 1) * local106;
		@Pc(162) int local162 = (arg5 - 1) * local93;
		@Pc(166) int[] local166 = TextureOp29SubOp4.anIntArrayArray10[arg2];
		TextureOp29SubOp4.method2576(local166, arg1 - arg4, -local16 + arg1, arg3);
		TextureOp29SubOp4.method2576(local166, arg1 - local16, arg1 - -local16, arg0);
		TextureOp29SubOp4.method2576(local166, arg1 + local16, arg4 + arg1, arg3);
		while (local9 > 0) {
			if (local89 < 0) {
				while (local89 < 0) {
					local70 += local136;
					local89 += local124;
					local7++;
					local136 += local110;
					local124 += local110;
				}
			}
			if (local70 < 0) {
				local89 += local124;
				local7++;
				local124 += local110;
				local70 += local136;
				local136 += local110;
			}
			@Pc(258) boolean local258 = local9 <= local25;
			if (local258) {
				if (local80 < 0) {
					while (local80 < 0) {
						local80 += local134;
						local134 += local114;
						local11++;
						local102 += local138;
						local138 += local114;
					}
				}
				if (local102 < 0) {
					local80 += local134;
					local11++;
					local134 += local114;
					local102 += local138;
					local138 += local114;
				}
				local102 += -local130;
				local130 -= local106;
				local80 += -local144;
				local144 -= local106;
			}
			local89 += -local162;
			local70 += -local120;
			local120 -= local93;
			local9--;
			@Pc(348) int local348 = arg2 - local9;
			@Pc(352) int local352 = local7 + arg1;
			local162 -= local93;
			@Pc(360) int local360 = local9 + arg2;
			@Pc(365) int local365 = arg1 - local7;
			if (local258) {
				@Pc(371) int local371 = arg1 + local11;
				@Pc(376) int local376 = arg1 - local11;
				TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[local348], local365, local376, arg3);
				TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[local348], local376, local371, arg0);
				TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[local348], local371, local352, arg3);
				TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[local360], local365, local376, arg3);
				TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[local360], local376, local371, arg0);
				TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[local360], local371, local352, arg3);
			} else {
				TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[local348], local365, local352, arg3);
				TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[local360], local365, local352, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIBIIII)V")
	public static void method2826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 - arg3 >= TextureOp29.anInt4164 && TextureOp29.anInt5063 >= arg4 + arg3 && TextureOp29.anInt5773 <= arg1 - arg3 && TextureOp29.anInt2869 >= arg3 + arg1) {
			Static8.method120(arg5, arg0, arg1, arg2, arg3, arg4);
		} else {
			Static152.method4670(arg2, arg1, arg3, arg5, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIBIII)V")
	public static void method3981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = arg0 - arg3;
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = arg6;
		@Pc(20) int local20 = arg6 * arg6;
		@Pc(25) int local25 = arg6 - arg3;
		@Pc(29) int local29 = arg0 * arg0;
		@Pc(33) int local33 = local20 << 1;
		@Pc(37) int local37 = local25 * local25;
		@Pc(41) int local41 = local12 * local12;
		@Pc(45) int local45 = local29 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local41 << 1;
		@Pc(57) int local57 = local25 << 1;
		@Pc(61) int local61 = arg6 << 1;
		@Pc(70) int local70 = local33 + local29 * (1 - local61);
		@Pc(79) int local79 = local20 - (local61 - 1) * local45;
		@Pc(88) int local88 = local49 + local41 * (1 - local57);
		@Pc(96) int local96 = local37 - local53 * (local57 - 1);
		@Pc(100) int local100 = local20 << 2;
		@Pc(104) int local104 = local29 << 2;
		@Pc(108) int local108 = local37 << 2;
		@Pc(112) int local112 = local33 * 3;
		@Pc(118) int local118 = (local61 - 3) * local45;
		@Pc(130) int local130 = local41 << 2;
		@Pc(134) int local134 = local49 * 3;
		@Pc(140) int local140 = (local57 - 3) * local53;
		@Pc(146) int local146 = (arg6 - 1) * local104;
		@Pc(148) int local148 = local108;
		@Pc(150) int local150 = local100;
		@Pc(156) int local156 = (local25 - 1) * local130;
		@Pc(174) int local174;
		@Pc(183) int local183;
		@Pc(192) int local192;
		@Pc(201) int local201;
		if (arg4 >= TextureOp29.anInt5773 && TextureOp29.anInt2869 >= arg4) {
			@Pc(166) int[] local166 = TextureOp29SubOp4.anIntArrayArray10[arg4];
			local174 = Static231.method1690(TextureOp29.anInt5063, arg5 - arg0, TextureOp29.anInt4164);
			local183 = Static231.method1690(TextureOp29.anInt5063, arg5 + arg0, TextureOp29.anInt4164);
			local192 = Static231.method1690(TextureOp29.anInt5063, arg5 - local12, TextureOp29.anInt4164);
			local201 = Static231.method1690(TextureOp29.anInt5063, arg5 + local12, TextureOp29.anInt4164);
			TextureOp29SubOp4.method2576(local166, local174, local192, arg2);
			TextureOp29SubOp4.method2576(local166, local192, local201, arg1);
			TextureOp29SubOp4.method2576(local166, local201, local183, arg2);
		}
		while (local16 > 0) {
			if (local70 < 0) {
				while (local70 < 0) {
					local70 += local112;
					local112 += local100;
					local7++;
					local79 += local150;
					local150 += local100;
				}
			}
			@Pc(255) boolean local255 = local16 <= local25;
			if (local79 < 0) {
				local79 += local150;
				local70 += local112;
				local7++;
				local150 += local100;
				local112 += local100;
			}
			if (local255) {
				if (local88 < 0) {
					while (local88 < 0) {
						local14++;
						local96 += local148;
						local148 += local108;
						local88 += local134;
						local134 += local108;
					}
				}
				if (local96 < 0) {
					local14++;
					local96 += local148;
					local88 += local134;
					local148 += local108;
					local134 += local108;
				}
				local88 += -local156;
				local156 -= local130;
				local96 += -local140;
				local140 -= local130;
			}
			local79 += -local118;
			local70 += -local146;
			local146 -= local104;
			local118 -= local104;
			local16--;
			local183 = arg4 + local16;
			local174 = arg4 - local16;
			if (TextureOp29.anInt5773 <= local183 && TextureOp29.anInt2869 >= local174) {
				local192 = Static231.method1690(TextureOp29.anInt5063, arg5 + local7, TextureOp29.anInt4164);
				local201 = Static231.method1690(TextureOp29.anInt5063, arg5 - local7, TextureOp29.anInt4164);
				if (local255) {
					@Pc(404) int local404 = Static231.method1690(TextureOp29.anInt5063, arg5 + local14, TextureOp29.anInt4164);
					@Pc(412) int local412 = Static231.method1690(TextureOp29.anInt5063, arg5 - local14, TextureOp29.anInt4164);
					@Pc(420) int[] local420;
					if (TextureOp29.anInt5773 <= local174) {
						local420 = TextureOp29SubOp4.anIntArrayArray10[local174];
						TextureOp29SubOp4.method2576(local420, local201, local412, arg2);
						TextureOp29SubOp4.method2576(local420, local412, local404, arg1);
						TextureOp29SubOp4.method2576(local420, local404, local192, arg2);
					}
					if (local183 <= TextureOp29.anInt2869) {
						local420 = TextureOp29SubOp4.anIntArrayArray10[local183];
						TextureOp29SubOp4.method2576(local420, local201, local412, arg2);
						TextureOp29SubOp4.method2576(local420, local412, local404, arg1);
						TextureOp29SubOp4.method2576(local420, local404, local192, arg2);
					}
				} else {
					if (TextureOp29.anInt5773 <= local174) {
						TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[local174], local201, local192, arg2);
					}
					if (TextureOp29.anInt2869 >= local183) {
						TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[local183], local201, local192, arg2);
					}
				}
			}
		}
	}
}
