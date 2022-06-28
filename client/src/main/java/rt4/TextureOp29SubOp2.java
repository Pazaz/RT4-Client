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
	public static TextureOp29SubOp2 method2664(@OriginalArg(0) Buffer arg0) {
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

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(III)V")
	@Override
	public final void method4013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt3165 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt3159 >> 12;
		@Pc(24) int local24 = this.anInt3163 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt3168 * arg1 >> 12;
		Static165.method3163(this.anInt5228, local31, local10, local24, local17);
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
