package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class TextureOp29SubOp2 extends TextureOp29SubOp {

	@OriginalMember(owner = "client!th", name = "o", descriptor = "[I")
	public static int[] anIntArray522;
	@OriginalMember(owner = "client!kc", name = "B", descriptor = "I")
	private final int anInt3168;

	@OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
	private final int anInt3165;

	@OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
	private final int anInt3163;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	private final int anInt3159;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(IIIIIII)V")
	public TextureOp29SubOp2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3168 = arg3;
		this.anInt3165 = arg0;
		this.anInt3163 = arg1;
		this.anInt3159 = arg2;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!wa;B)Lclient!kc;")
	public static TextureOp29SubOp2 create(@OriginalArg(0) Buffer arg0) {
		return new TextureOp29SubOp2(arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.g3(), arg0.g3(), arg0.g1());
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method1623(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == arg6) {
			method2826(arg0, arg2, arg5, arg6, arg1, arg4);
		} else if (arg1 - arg6 >= TextureOp29.anInt4164 && arg6 + arg1 <= TextureOp29.anInt5063 && TextureOp29.anInt5773 <= arg2 - arg3 && TextureOp29.anInt2869 >= arg2 + arg3) {
			method4594(arg5, arg1, arg2, arg4, arg6, arg3, arg0);
		} else {
			TextureOp29.method3981(arg6, arg5, arg4, arg0, arg2, arg1, arg3);
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
		ArrayUtils.fillRange(local166, arg1 - arg4, -local16 + arg1, arg3);
		ArrayUtils.fillRange(local166, arg1 - local16, arg1 - -local16, arg0);
		ArrayUtils.fillRange(local166, arg1 + local16, arg4 + arg1, arg3);
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
				ArrayUtils.fillRange(TextureOp29SubOp4.anIntArrayArray10[local348], local365, local376, arg3);
				ArrayUtils.fillRange(TextureOp29SubOp4.anIntArrayArray10[local348], local376, local371, arg0);
				ArrayUtils.fillRange(TextureOp29SubOp4.anIntArrayArray10[local348], local371, local352, arg3);
				ArrayUtils.fillRange(TextureOp29SubOp4.anIntArrayArray10[local360], local365, local376, arg3);
				ArrayUtils.fillRange(TextureOp29SubOp4.anIntArrayArray10[local360], local376, local371, arg0);
				ArrayUtils.fillRange(TextureOp29SubOp4.anIntArrayArray10[local360], local371, local352, arg3);
			} else {
				ArrayUtils.fillRange(TextureOp29SubOp4.anIntArrayArray10[local348], local365, local352, arg3);
				ArrayUtils.fillRange(TextureOp29SubOp4.anIntArrayArray10[local360], local365, local352, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIBIIII)V")
	public static void method2826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 - arg3 >= TextureOp29.anInt4164 && TextureOp29.anInt5063 >= arg4 + arg3 && TextureOp29.anInt5773 <= arg1 - arg3 && TextureOp29.anInt2869 >= arg3 + arg1) {
			method120(arg5, arg0, arg1, arg2, arg3, arg4);
		} else {
			method4670(arg2, arg1, arg3, arg5, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIZIII)V")
	public static void method120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		method4278(arg4);
		@Pc(8) int local8 = arg4 - arg1;
		@Pc(10) int local10 = 0;
		if (local8 < 0) {
			local8 = 0;
		}
		@Pc(21) int local21 = -arg4;
		@Pc(23) int local23 = arg4;
		@Pc(25) int local25 = local8;
		@Pc(28) int local28 = -local8;
		@Pc(30) int local30 = -1;
		@Pc(34) int[] local34 = TextureOp29SubOp4.anIntArrayArray10[arg2];
		@Pc(39) int local39 = arg5 + local8;
		@Pc(41) int local41 = -1;
		@Pc(46) int local46 = arg5 - local8;
		ArrayUtils.fillRange(local34, arg5 - arg4, local46, arg0);
		ArrayUtils.fillRange(local34, local46, local39, arg3);
		ArrayUtils.fillRange(local34, local39, arg5 + arg4, arg0);
		while (local10 < local23) {
			local30 += 2;
			local28 += local30;
			if (local28 >= 0 && local25 >= 1) {
				anIntArray522[local25] = local10;
				local25--;
				local28 -= local25 << 1;
			}
			local10++;
			local41 += 2;
			local21 += local41;
			@Pc(142) int[] local142;
			@Pc(149) int[] local149;
			@Pc(162) int local162;
			@Pc(158) int local158;
			@Pc(154) int local154;
			@Pc(171) int local171;
			@Pc(167) int local167;
			if (local21 >= 0) {
				local23--;
				local21 -= local23 << 1;
				if (local8 > local23) {
					local142 = TextureOp29SubOp4.anIntArrayArray10[local23 + arg2];
					local149 = TextureOp29SubOp4.anIntArrayArray10[arg2 - local23];
					local154 = arg5 - local10;
					local158 = local10 + arg5;
					local162 = anIntArray522[local23];
					local167 = arg5 - local162;
					local171 = local162 + arg5;
					ArrayUtils.fillRange(local142, local154, local167, arg0);
					ArrayUtils.fillRange(local142, local167, local171, arg3);
					ArrayUtils.fillRange(local142, local171, local158, arg0);
					ArrayUtils.fillRange(local149, local154, local167, arg0);
					ArrayUtils.fillRange(local149, local167, local171, arg3);
					ArrayUtils.fillRange(local149, local171, local158, arg0);
				} else {
					local142 = TextureOp29SubOp4.anIntArrayArray10[arg2 + local23];
					local149 = TextureOp29SubOp4.anIntArrayArray10[arg2 - local23];
					local162 = local10 + arg5;
					local158 = arg5 - local10;
					ArrayUtils.fillRange(local142, local158, local162, arg0);
					ArrayUtils.fillRange(local149, local158, local162, arg0);
				}
			}
			local142 = TextureOp29SubOp4.anIntArrayArray10[arg2 + local10];
			local149 = TextureOp29SubOp4.anIntArrayArray10[arg2 - local10];
			local162 = local23 + arg5;
			local158 = arg5 - local23;
			if (local8 <= local10) {
				ArrayUtils.fillRange(local142, local158, local162, arg0);
				ArrayUtils.fillRange(local149, local158, local162, arg0);
			} else {
				local154 = local10 <= local25 ? local25 : anIntArray522[local10];
				local171 = local154 + arg5;
				local167 = arg5 - local154;
				ArrayUtils.fillRange(local142, local158, local167, arg0);
				ArrayUtils.fillRange(local142, local167, local171, arg3);
				ArrayUtils.fillRange(local142, local171, local162, arg0);
				ArrayUtils.fillRange(local149, local158, local167, arg0);
				ArrayUtils.fillRange(local149, local167, local171, arg3);
				ArrayUtils.fillRange(local149, local171, local162, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IBIIIII)V")
	public static void method4670(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = arg2 - arg4;
		method4278(arg2);
		@Pc(23) int local23 = 0;
		if (local18 < 0) {
			local18 = 0;
		}
		@Pc(32) int local32 = arg2;
		@Pc(35) int local35 = -arg2;
		@Pc(38) int local38 = -local18;
		@Pc(40) int local40 = local18;
		@Pc(42) int local42 = -1;
		@Pc(61) int local61;
		@Pc(69) int local69;
		@Pc(78) int local78;
		@Pc(87) int local87;
		if (arg1 >= TextureOp29.anInt5773 && TextureOp29.anInt2869 >= arg1) {
			@Pc(52) int[] local52 = TextureOp29SubOp4.anIntArrayArray10[arg1];
			local61 = IntUtils.clamp(TextureOp29.anInt5063, arg5 - arg2, TextureOp29.anInt4164);
			local69 = IntUtils.clamp(TextureOp29.anInt5063, arg2 + arg5, TextureOp29.anInt4164);
			local78 = IntUtils.clamp(TextureOp29.anInt5063, arg5 - local18, TextureOp29.anInt4164);
			local87 = IntUtils.clamp(TextureOp29.anInt5063, arg5 + local18, TextureOp29.anInt4164);
			ArrayUtils.fillRange(local52, local61, local78, arg3);
			ArrayUtils.fillRange(local52, local78, local87, arg0);
			ArrayUtils.fillRange(local52, local87, local69, arg3);
		}
		@Pc(107) int local107 = -1;
		while (local23 < local32) {
			local42 += 2;
			local107 += 2;
			local38 += local107;
			local35 += local42;
			if (local38 >= 0 && local40 >= 1) {
				local40--;
				anIntArray522[local40] = local23;
				local38 -= local40 << 1;
			}
			local23++;
			@Pc(264) int local264;
			@Pc(273) int local273;
			@Pc(280) int[] local280;
			@Pc(161) int local161;
			if (local35 >= 0) {
				local32--;
				local35 -= local32 << 1;
				local161 = arg1 - local32;
				local61 = arg1 + local32;
				if (TextureOp29.anInt5773 <= local61 && TextureOp29.anInt2869 >= local161) {
					if (local32 >= local18) {
						local69 = IntUtils.clamp(TextureOp29.anInt5063, local23 + arg5, TextureOp29.anInt4164);
						local78 = IntUtils.clamp(TextureOp29.anInt5063, arg5 - local23, TextureOp29.anInt4164);
						if (TextureOp29.anInt2869 >= local61) {
							ArrayUtils.fillRange(TextureOp29SubOp4.anIntArrayArray10[local61], local78, local69, arg3);
						}
						if (local161 >= TextureOp29.anInt5773) {
							ArrayUtils.fillRange(TextureOp29SubOp4.anIntArrayArray10[local161], local78, local69, arg3);
						}
					} else {
						local69 = anIntArray522[local32];
						local78 = IntUtils.clamp(TextureOp29.anInt5063, local23 + arg5, TextureOp29.anInt4164);
						local87 = IntUtils.clamp(TextureOp29.anInt5063, arg5 - local23, TextureOp29.anInt4164);
						local264 = IntUtils.clamp(TextureOp29.anInt5063, arg5 + local69, TextureOp29.anInt4164);
						local273 = IntUtils.clamp(TextureOp29.anInt5063, arg5 - local69, TextureOp29.anInt4164);
						if (TextureOp29.anInt2869 >= local61) {
							local280 = TextureOp29SubOp4.anIntArrayArray10[local61];
							ArrayUtils.fillRange(local280, local87, local273, arg3);
							ArrayUtils.fillRange(local280, local273, local264, arg0);
							ArrayUtils.fillRange(local280, local264, local78, arg3);
						}
						if (local161 >= TextureOp29.anInt5773) {
							local280 = TextureOp29SubOp4.anIntArrayArray10[local161];
							ArrayUtils.fillRange(local280, local87, local273, arg3);
							ArrayUtils.fillRange(local280, local273, local264, arg0);
							ArrayUtils.fillRange(local280, local264, local78, arg3);
						}
					}
				}
			}
			local161 = arg1 - local23;
			local61 = arg1 + local23;
			if (TextureOp29.anInt5773 <= local61 && TextureOp29.anInt2869 >= local161) {
				local69 = arg5 + local32;
				local78 = arg5 - local32;
				if (local69 >= TextureOp29.anInt4164 && TextureOp29.anInt5063 >= local78) {
					local69 = IntUtils.clamp(TextureOp29.anInt5063, local69, TextureOp29.anInt4164);
					local78 = IntUtils.clamp(TextureOp29.anInt5063, local78, TextureOp29.anInt4164);
					if (local23 < local18) {
						local87 = local40 >= local23 ? local40 : anIntArray522[local23];
						local264 = IntUtils.clamp(TextureOp29.anInt5063, local87 + arg5, TextureOp29.anInt4164);
						local273 = IntUtils.clamp(TextureOp29.anInt5063, arg5 - local87, TextureOp29.anInt4164);
						if (TextureOp29.anInt2869 >= local61) {
							local280 = TextureOp29SubOp4.anIntArrayArray10[local61];
							ArrayUtils.fillRange(local280, local78, local273, arg3);
							ArrayUtils.fillRange(local280, local273, local264, arg0);
							ArrayUtils.fillRange(local280, local264, local69, arg3);
						}
						if (local161 >= TextureOp29.anInt5773) {
							local280 = TextureOp29SubOp4.anIntArrayArray10[local161];
							ArrayUtils.fillRange(local280, local78, local273, arg3);
							ArrayUtils.fillRange(local280, local273, local264, arg0);
							ArrayUtils.fillRange(local280, local264, local69, arg3);
						}
					} else {
						if (TextureOp29.anInt2869 >= local61) {
							ArrayUtils.fillRange(TextureOp29SubOp4.anIntArrayArray10[local61], local78, local69, arg3);
						}
						if (local161 >= TextureOp29.anInt5773) {
							ArrayUtils.fillRange(TextureOp29SubOp4.anIntArrayArray10[local161], local78, local69, arg3);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V")
	public static void method4278(@OriginalArg(0) int arg0) {
		if (anIntArray522 == null || anIntArray522.length < arg0) {
			anIntArray522 = new int[arg0];
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

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIB)V")
	public static void method1760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 - arg0 >= TextureOp29.anInt4164 && TextureOp29.anInt5063 >= arg0 + arg1 && arg3 - arg0 >= TextureOp29.anInt5773 && TextureOp29.anInt2869 >= arg0 + arg3) {
			TextureOp29SubOp4.method1206(arg1, arg0, arg2, arg3);
		} else {
			method1843(arg2, arg3, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
	public static void method1843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = IntUtils.clamp(TextureOp29.anInt5063, arg2 + arg3, TextureOp29.anInt4164);
		@Pc(30) int local30 = IntUtils.clamp(TextureOp29.anInt5063, arg3 - arg2, TextureOp29.anInt4164);
		ArrayUtils.fillRange(TextureOp29SubOp4.anIntArrayArray10[arg1], local30, local22, arg0);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(58) int local58;
			@Pc(68) int local68;
			@Pc(84) int local84;
			@Pc(93) int local93;
			if (local12 > 0) {
				local9--;
				local58 = arg1 - local9;
				local12 -= local9 << 1;
				local68 = arg1 + local9;
				if (local68 >= TextureOp29.anInt5773 && local58 <= TextureOp29.anInt2869) {
					local84 = IntUtils.clamp(TextureOp29.anInt5063, arg3 + local7, TextureOp29.anInt4164);
					local93 = IntUtils.clamp(TextureOp29.anInt5063, arg3 - local7, TextureOp29.anInt4164);
					if (TextureOp29.anInt2869 >= local68) {
						ArrayUtils.fillRange(TextureOp29SubOp4.anIntArrayArray10[local68], local93, local84, arg0);
					}
					if (TextureOp29.anInt5773 <= local58) {
						ArrayUtils.fillRange(TextureOp29SubOp4.anIntArrayArray10[local58], local93, local84, arg0);
					}
				}
			}
			local7++;
			local58 = arg1 - local7;
			local68 = local7 + arg1;
			if (local68 >= TextureOp29.anInt5773 && TextureOp29.anInt2869 >= local58) {
				local84 = IntUtils.clamp(TextureOp29.anInt5063, arg3 + local9, TextureOp29.anInt4164);
				local93 = IntUtils.clamp(TextureOp29.anInt5063, arg3 - local9, TextureOp29.anInt4164);
				if (local68 <= TextureOp29.anInt2869) {
					ArrayUtils.fillRange(TextureOp29SubOp4.anIntArrayArray10[local68], local93, local84, arg0);
				}
				if (local58 >= TextureOp29.anInt5773) {
					ArrayUtils.fillRange(TextureOp29SubOp4.anIntArrayArray10[local58], local93, local84, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIII)V")
	public static void method1568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		ArrayUtils.fillRange(TextureOp29SubOp4.anIntArrayArray10[arg0], arg1 - arg2, arg2 + arg1, arg4);
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
			ArrayUtils.fillRange(TextureOp29SubOp4.anIntArrayArray10[local109], local179, local160, arg4);
			ArrayUtils.fillRange(TextureOp29SubOp4.anIntArrayArray10[local105], local179, local160, arg4);
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
			local95 = IntUtils.clamp(TextureOp29.anInt5063, arg2 + arg3, TextureOp29.anInt4164);
			local104 = IntUtils.clamp(TextureOp29.anInt5063, arg3 - arg2, TextureOp29.anInt4164);
			ArrayUtils.fillRange(TextureOp29SubOp4.anIntArrayArray10[arg4], local104, local95, arg0);
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
				@Pc(213) int local213 = IntUtils.clamp(TextureOp29.anInt5063, local15 + arg3, TextureOp29.anInt4164);
				@Pc(222) int local222 = IntUtils.clamp(TextureOp29.anInt5063, arg3 - local15, TextureOp29.anInt4164);
				if (local95 >= TextureOp29.anInt5773) {
					ArrayUtils.fillRange(TextureOp29SubOp4.anIntArrayArray10[local95], local222, local213, arg0);
				}
				if (TextureOp29.anInt2869 >= local104) {
					ArrayUtils.fillRange(TextureOp29SubOp4.anIntArrayArray10[local104], local222, local213, arg0);
				}
			}
			local118 -= local67;
		}
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(III)V")
	@Override
	public final void method4013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt3165 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt3159 >> 12;
		@Pc(24) int local24 = this.anInt3163 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt3168 * arg1 >> 12;
		method3163(this.anInt5228, local31, local10, local24, local17);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZI)V")
	@Override
	public final void method4009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V")
	@Override
	public final void method4007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt3165 >> 12;
		@Pc(23) int local23 = this.anInt3168 * arg0 >> 12;
		@Pc(30) int local30 = this.anInt3163 * arg0 >> 12;
		@Pc(37) int local37 = this.anInt3159 * arg1 >> 12;
		method1623(this.anInt5231, local6, local30, local23, this.anInt5229, this.anInt5228, local37);
	}
}
