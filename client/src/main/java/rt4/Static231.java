package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!sk", name = "jb", descriptor = "I")
	public static int anInt5203;

	@OriginalMember(owner = "client!sk", name = "mb", descriptor = "I")
	public static int anInt5205;


    @OriginalMember(owner = "client!sk", name = "kb", descriptor = "I")
	public static int anInt5204 = 0;

	@OriginalMember(owner = "client!sk", name = "lb", descriptor = "Z")
	public static boolean aBoolean252 = false;

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
			@Pc(166) int[] local166 = Static71.anIntArrayArray10[arg4];
			local174 = Static78.method1690(TextureOp29.anInt5063, arg5 - arg0, TextureOp29.anInt4164);
			local183 = Static78.method1690(TextureOp29.anInt5063, arg5 + arg0, TextureOp29.anInt4164);
			local192 = Static78.method1690(TextureOp29.anInt5063, arg5 - local12, TextureOp29.anInt4164);
			local201 = Static78.method1690(TextureOp29.anInt5063, arg5 + local12, TextureOp29.anInt4164);
			Static131.method2576(local166, local174, local192, arg2);
			Static131.method2576(local166, local192, local201, arg1);
			Static131.method2576(local166, local201, local183, arg2);
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
				local192 = Static78.method1690(TextureOp29.anInt5063, arg5 + local7, TextureOp29.anInt4164);
				local201 = Static78.method1690(TextureOp29.anInt5063, arg5 - local7, TextureOp29.anInt4164);
				if (local255) {
					@Pc(404) int local404 = Static78.method1690(TextureOp29.anInt5063, arg5 + local14, TextureOp29.anInt4164);
					@Pc(412) int local412 = Static78.method1690(TextureOp29.anInt5063, arg5 - local14, TextureOp29.anInt4164);
					@Pc(420) int[] local420;
					if (TextureOp29.anInt5773 <= local174) {
						local420 = Static71.anIntArrayArray10[local174];
						Static131.method2576(local420, local201, local412, arg2);
						Static131.method2576(local420, local412, local404, arg1);
						Static131.method2576(local420, local404, local192, arg2);
					}
					if (local183 <= TextureOp29.anInt2869) {
						local420 = Static71.anIntArrayArray10[local183];
						Static131.method2576(local420, local201, local412, arg2);
						Static131.method2576(local420, local412, local404, arg1);
						Static131.method2576(local420, local404, local192, arg2);
					}
				} else {
					if (TextureOp29.anInt5773 <= local174) {
						Static131.method2576(Static71.anIntArrayArray10[local174], local201, local192, arg2);
					}
					if (TextureOp29.anInt2869 >= local183) {
						Static131.method2576(Static71.anIntArrayArray10[local183], local201, local192, arg2);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIII)V")
	public static void method3982(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = arg4 - arg2;
		@Pc(19) int local19 = arg1 - arg3;
		if (local15 == 0) {
			if (local19 != 0) {
				Static54.method1306(arg1, arg3, arg0, arg2);
			}
		} else if (local19 == 0) {
			Static234.method4019(arg2, arg0, arg4, arg3);
		} else {
			@Pc(50) int local50 = (local19 << 12) / local15;
			@Pc(59) int local59 = arg3 - (local50 * arg2 >> 12);
			@Pc(68) int local68;
			@Pc(76) int local76;
			if (TextureOp29.anInt4164 > arg2) {
				local68 = TextureOp29.anInt4164;
				local76 = (TextureOp29.anInt4164 * local50 >> 12) + local59;
			} else if (arg2 > TextureOp29.anInt5063) {
				local76 = (TextureOp29.anInt5063 * local50 >> 12) + local59;
				local68 = TextureOp29.anInt5063;
			} else {
				local68 = arg2;
				local76 = arg3;
			}
			@Pc(109) int local109;
			@Pc(118) int local118;
			if (arg4 < TextureOp29.anInt4164) {
				local109 = TextureOp29.anInt4164;
				local118 = local59 + (local50 * TextureOp29.anInt4164 >> 12);
			} else if (TextureOp29.anInt5063 < arg4) {
				local109 = TextureOp29.anInt5063;
				local118 = local59 + (local50 * TextureOp29.anInt5063 >> 12);
			} else {
				local118 = arg1;
				local109 = arg4;
			}
			if (TextureOp29.anInt5773 > local118) {
				local109 = (TextureOp29.anInt5773 - local59 << 12) / local50;
				local118 = TextureOp29.anInt5773;
			} else if (local118 > TextureOp29.anInt2869) {
				local118 = TextureOp29.anInt2869;
				local109 = (TextureOp29.anInt2869 - local59 << 12) / local50;
			}
			if (local76 < TextureOp29.anInt5773) {
				local76 = TextureOp29.anInt5773;
				local68 = (TextureOp29.anInt5773 - local59 << 12) / local50;
			} else if (TextureOp29.anInt2869 < local76) {
				local76 = TextureOp29.anInt2869;
				local68 = (TextureOp29.anInt2869 - local59 << 12) / local50;
			}
			Static241.method4547(arg0, local118, local76, local109, local68);
		}
	}

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(II)I")
	public static int toLowerCase(@OriginalArg(1) int arg0) {
		if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
			return arg0 + 32;
		} else if (arg0 == 159) {
			return 255;
		} else if (arg0 == 140) {
			return 156;
		} else {
			return arg0;
		}
	}

}
