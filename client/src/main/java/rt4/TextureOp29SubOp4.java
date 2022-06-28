package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class TextureOp29SubOp4 extends TextureOp29SubOp {

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
	private final int anInt5247;

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
	private final int anInt5238;

	@OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
	private final int anInt5246;

	@OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
	private final int anInt5244;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(IIIIIII)V")
	public TextureOp29SubOp4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5247 = arg1;
		this.anInt5238 = arg2;
		this.anInt5246 = arg0;
		this.anInt5244 = arg3;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIIII)V")
	public static void method644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (TextureOp29.anInt4164 <= arg6 && TextureOp29.anInt5063 >= arg5 && arg4 >= TextureOp29.anInt5773 && arg1 <= TextureOp29.anInt2869) {
			method2907(arg3, arg4, arg1, arg2, arg0, arg5, arg6);
		} else {
			method4222(arg5, arg2, arg1, arg0, arg3, arg4, arg6);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2907(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg4 + arg1;
		@Pc(13) int local13 = arg4 + arg6;
		@Pc(15) int local15;
		for (local15 = arg1; local15 < local9; local15++) {
			ArrayUtils.fillRange(anIntArrayArray10[local15], arg6, arg5, arg0);
		}
		@Pc(34) int local34 = arg2 - arg4;
		@Pc(39) int local39 = arg5 - arg4;
		for (local15 = arg2; local15 > local34; local15--) {
			ArrayUtils.fillRange(anIntArrayArray10[local15], arg6, arg5, arg0);
		}
		for (local15 = local9; local15 <= local34; local15++) {
			@Pc(72) int[] local72 = anIntArrayArray10[local15];
			ArrayUtils.fillRange(local72, arg6, local13, arg0);
			ArrayUtils.fillRange(local72, local13, local39, arg3);
			ArrayUtils.fillRange(local72, local39, arg5, arg0);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = IntUtils.clamp(TextureOp29.anInt2869, arg5, TextureOp29.anInt5773);
		@Pc(17) int local17 = IntUtils.clamp(TextureOp29.anInt2869, arg2, TextureOp29.anInt5773);
		@Pc(23) int local23 = IntUtils.clamp(TextureOp29.anInt5063, arg6, TextureOp29.anInt4164);
		@Pc(29) int local29 = IntUtils.clamp(TextureOp29.anInt5063, arg0, TextureOp29.anInt4164);
		@Pc(37) int local37 = IntUtils.clamp(TextureOp29.anInt2869, arg3 + arg5, TextureOp29.anInt5773);
		@Pc(46) int local46 = IntUtils.clamp(TextureOp29.anInt2869, arg2 - arg3, TextureOp29.anInt5773);
		@Pc(48) int local48;
		for (local48 = local11; local48 < local37; local48++) {
			ArrayUtils.fillRange(anIntArrayArray10[local48], local23, local29, arg4);
		}
		for (local48 = local17; local48 > local46; local48--) {
			ArrayUtils.fillRange(anIntArrayArray10[local48], local23, local29, arg4);
		}
		@Pc(94) int local94 = IntUtils.clamp(TextureOp29.anInt5063, arg3 + arg6, TextureOp29.anInt4164);
		@Pc(103) int local103 = IntUtils.clamp(TextureOp29.anInt5063, arg0 - arg3, TextureOp29.anInt4164);
		for (local48 = local37; local48 <= local46; local48++) {
			@Pc(122) int[] local122 = anIntArrayArray10[local48];
			ArrayUtils.fillRange(local122, local23, local94, arg4);
			ArrayUtils.fillRange(local122, local94, local103, arg1);
			ArrayUtils.fillRange(local122, local103, local29, arg4);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIBIII)V")
	public static void method3950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 >= TextureOp29.anInt4164 && arg3 <= TextureOp29.anInt5063 && TextureOp29.anInt5773 <= arg4 && TextureOp29.anInt2869 >= arg2) {
			method3308(arg2, arg3, arg4, arg0, arg1);
		} else {
			method3105(arg1, arg3, arg4, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIII)V")
	public static void method3308(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(8) int local8 = arg2; local8 <= arg0; local8++) {
			ArrayUtils.fillRange(anIntArrayArray10[local8], arg3, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIII)V")
	public static void method3105(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = IntUtils.clamp(TextureOp29.anInt2869, arg2, TextureOp29.anInt5773);
		@Pc(17) int local17 = IntUtils.clamp(TextureOp29.anInt2869, arg4, TextureOp29.anInt5773);
		@Pc(23) int local23 = IntUtils.clamp(TextureOp29.anInt5063, arg3, TextureOp29.anInt4164);
		@Pc(35) int local35 = IntUtils.clamp(TextureOp29.anInt5063, arg1, TextureOp29.anInt4164);
		for (@Pc(37) int local37 = local11; local37 <= local17; local37++) {
			ArrayUtils.fillRange(anIntArrayArray10[local37], local23, local35, arg0);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLclient!wa;)Lclient!ta;")
	public static TextureOp29SubOp4 create(@OriginalArg(1) Buffer arg0) {
		return new TextureOp29SubOp4(arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.g3(), arg0.g3(), arg0.g1());
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IBIII)V")
	public static void method1206(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 0;
		ArrayUtils.fillRange(anIntArrayArray10[arg3], arg0 - arg1, arg0 - -arg1, arg2);
		@Pc(32) int local32 = -arg1;
		@Pc(34) int local34 = arg1;
		@Pc(36) int local36 = -1;
		while (local15 < local34) {
			local15++;
			local36 += 2;
			local32 += local36;
			if (local32 >= 0) {
				local34--;
				local32 -= local34 << 1;
				@Pc(65) int[] local65 = anIntArrayArray10[arg3 + local34];
				@Pc(71) int[] local71 = anIntArrayArray10[arg3 - local34];
				@Pc(76) int local76 = arg0 + local15;
				@Pc(81) int local81 = arg0 - local15;
				ArrayUtils.fillRange(local65, local81, local76, arg2);
				ArrayUtils.fillRange(local71, local81, local76, arg2);
			}
			@Pc(97) int local97 = local34 + arg0;
			@Pc(102) int local102 = arg0 - local34;
			@Pc(109) int[] local109 = anIntArrayArray10[arg3 + local15];
			@Pc(116) int[] local116 = anIntArrayArray10[arg3 - local15];
			ArrayUtils.fillRange(local109, local102, local97, arg2);
			ArrayUtils.fillRange(local116, local102, local97, arg2);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIBI)V")
	public static void fillRange(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			ArrayUtils.fillRange(anIntArrayArray10[arg1], arg3, arg2, arg0);
		} else {
			ArrayUtils.fillRange(anIntArrayArray10[arg1], arg2, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIII)V")
	public static void method2054(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8;
		if (arg0 <= arg2) {
			for (local8 = arg0; local8 < arg2; local8++) {
				anIntArrayArray10[local8][arg1] = arg3;
			}
		} else {
			for (local8 = arg2; local8 < arg0; local8++) {
				anIntArrayArray10[local8][arg1] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BIIIII)V")
	public static void method4547(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg1 - arg2;
		@Pc(14) int local14 = arg3 - arg4;
		if (local14 == 0) {
			if (local9 != 0) {
				method2054(arg2, arg4, arg1, arg0);
			}
		} else if (local9 == 0) {
			fillRange(arg0, arg2, arg3, arg4);
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
					anIntArrayArray10[local136][local74] = arg0;
					local116 += local111;
					if (local116 > 0) {
						local74 += local123;
						local116 -= local78;
					}
				}
			} else {
				for (local136 = arg4; local136 <= arg3; local136++) {
					local116 += local111;
					anIntArrayArray10[local74][local136] = arg0;
					if (local116 > 0) {
						local74 += local123;
						local116 -= local78;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIII)V")
	public static void method4244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (TextureOp29.anInt4164 <= arg1 && TextureOp29.anInt5063 >= arg3 && TextureOp29.anInt5773 <= arg2 && arg4 <= TextureOp29.anInt2869) {
			if (arg5 == 1) {
				method2622(arg0, arg3, arg2, arg4, arg1);
			} else {
				method3334(arg3, arg2, arg0, arg4, arg5, arg1);
			}
		} else if (arg5 == 1) {
			method3246(arg0, arg1, arg4, arg3, arg2);
		} else {
			method352(arg4, arg5, arg3, arg1, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIBII)V")
	public static void method2622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg2 + 1;
		ArrayUtils.fillRange(anIntArrayArray10[arg2], arg4, arg1, arg0);
		@Pc(17) int local17 = arg3 - 1;
		ArrayUtils.fillRange(anIntArrayArray10[arg3], arg4, arg1, arg0);
		for (@Pc(29) int local29 = local8; local29 <= local17; local29++) {
			@Pc(40) int[] local40 = anIntArrayArray10[local29];
			local40[arg4] = local40[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIII)V")
	public static void method3334(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = arg4 + arg1;
		@Pc(14) int local14 = arg3 - arg4;
		@Pc(29) int local29 = arg4 + arg5;
		@Pc(31) int local31;
		for (local31 = arg1; local31 < local5; local31++) {
			ArrayUtils.fillRange(anIntArrayArray10[local31], arg5, arg0, arg2);
		}
		for (local31 = arg3; local31 > local14; local31--) {
			ArrayUtils.fillRange(anIntArrayArray10[local31], arg5, arg0, arg2);
		}
		@Pc(70) int local70 = arg0 - arg4;
		for (local31 = local5; local31 <= local14; local31++) {
			@Pc(83) int[] local83 = anIntArrayArray10[local31];
			ArrayUtils.fillRange(local83, arg5, local29, arg2);
			ArrayUtils.fillRange(local83, local70, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIB)V")
	public static void method3246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 > TextureOp29.anInt2869 || arg2 < TextureOp29.anInt5773) {
			return;
		}
		@Pc(24) boolean local24;
		if (TextureOp29.anInt4164 > arg1) {
			local24 = false;
			arg1 = TextureOp29.anInt4164;
		} else if (TextureOp29.anInt5063 >= arg1) {
			local24 = true;
		} else {
			local24 = false;
			arg1 = TextureOp29.anInt5063;
		}
		@Pc(43) boolean local43;
		if (arg3 < TextureOp29.anInt4164) {
			arg3 = TextureOp29.anInt4164;
			local43 = false;
		} else if (arg3 > TextureOp29.anInt5063) {
			arg3 = TextureOp29.anInt5063;
			local43 = false;
		} else {
			local43 = true;
		}
		if (TextureOp29.anInt5773 > arg4) {
			arg4 = TextureOp29.anInt5773;
		} else {
			ArrayUtils.fillRange(anIntArrayArray10[arg4++], arg1, arg3, arg0);
		}
		if (arg2 <= TextureOp29.anInt2869) {
			ArrayUtils.fillRange(anIntArrayArray10[arg2--], arg1, arg3, arg0);
		} else {
			arg2 = TextureOp29.anInt2869;
		}
		@Pc(98) int local98;
		if (local24 && local43) {
			for (local98 = arg4; local98 <= arg2; local98++) {
				@Pc(105) int[] local105 = anIntArrayArray10[local98];
				local105[arg1] = local105[arg3] = arg0;
			}
		} else if (local24) {
			for (local98 = arg4; local98 <= arg2; local98++) {
				anIntArrayArray10[local98][arg1] = arg0;
			}
		} else if (local43) {
			for (local98 = arg4; local98 <= arg2; local98++) {
				anIntArrayArray10[local98][arg3] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIIII)V")
	public static void method352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = IntUtils.clamp(TextureOp29.anInt2869, arg5, TextureOp29.anInt5773);
		@Pc(17) int local17 = IntUtils.clamp(TextureOp29.anInt2869, arg0, TextureOp29.anInt5773);
		@Pc(23) int local23 = IntUtils.clamp(TextureOp29.anInt5063, arg3, TextureOp29.anInt4164);
		@Pc(29) int local29 = IntUtils.clamp(TextureOp29.anInt5063, arg2, TextureOp29.anInt4164);
		@Pc(42) int local42 = IntUtils.clamp(TextureOp29.anInt2869, arg5 + arg1, TextureOp29.anInt5773);
		@Pc(51) int local51 = IntUtils.clamp(TextureOp29.anInt2869, arg0 - arg1, TextureOp29.anInt5773);
		@Pc(53) int local53;
		for (local53 = local11; local53 < local42; local53++) {
			ArrayUtils.fillRange(anIntArrayArray10[local53], local23, local29, arg4);
		}
		for (local53 = local17; local53 > local51; local53--) {
			ArrayUtils.fillRange(anIntArrayArray10[local53], local23, local29, arg4);
		}
		@Pc(95) int local95 = IntUtils.clamp(TextureOp29.anInt5063, arg1 + arg3, TextureOp29.anInt4164);
		@Pc(104) int local104 = IntUtils.clamp(TextureOp29.anInt5063, arg2 - arg1, TextureOp29.anInt4164);
		for (local53 = local42; local53 <= local51; local53++) {
			@Pc(117) int[] local117 = anIntArrayArray10[local53];
			ArrayUtils.fillRange(local117, local23, local95, arg4);
			ArrayUtils.fillRange(local117, local104, local29, arg4);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([[IZ)V")
	public static void method1751(@OriginalArg(0) int[][] arg0) {
		anIntArrayArray10 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZI)V")
	@Override
	public final void method4009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5238 >> 12;
		@Pc(17) int local17 = this.anInt5244 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt5246 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt5247 * arg0 >> 12;
		method4244(this.anInt5229, local24, local31, local10, local17, this.anInt5231);
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(III)V")
	@Override
	public final void method4013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt5246 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt5238 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt5247 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt5244 >> 12;
		method3950(local10, this.anInt5228, local31, local17, local24);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V")
	@Override
	public final void method4007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 * this.anInt5246 >> 12;
		@Pc(21) int local21 = this.anInt5247 * arg0 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt5238 >> 12;
		@Pc(35) int local35 = this.anInt5244 * arg0 >> 12;
		method644(this.anInt5231, local35, this.anInt5228, this.anInt5229, local21, local28, local14);
	}
}
