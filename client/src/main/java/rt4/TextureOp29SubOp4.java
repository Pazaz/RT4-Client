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
			method2576(anIntArrayArray10[local15], arg6, arg5, arg0);
		}
		@Pc(34) int local34 = arg2 - arg4;
		@Pc(39) int local39 = arg5 - arg4;
		for (local15 = arg2; local15 > local34; local15--) {
			method2576(anIntArrayArray10[local15], arg6, arg5, arg0);
		}
		for (local15 = local9; local15 <= local34; local15++) {
			@Pc(72) int[] local72 = anIntArrayArray10[local15];
			method2576(local72, arg6, local13, arg0);
			method2576(local72, local13, local39, arg3);
			method2576(local72, local39, arg5, arg0);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static231.method1690(TextureOp29.anInt2869, arg5, TextureOp29.anInt5773);
		@Pc(17) int local17 = Static231.method1690(TextureOp29.anInt2869, arg2, TextureOp29.anInt5773);
		@Pc(23) int local23 = Static231.method1690(TextureOp29.anInt5063, arg6, TextureOp29.anInt4164);
		@Pc(29) int local29 = Static231.method1690(TextureOp29.anInt5063, arg0, TextureOp29.anInt4164);
		@Pc(37) int local37 = Static231.method1690(TextureOp29.anInt2869, arg3 + arg5, TextureOp29.anInt5773);
		@Pc(46) int local46 = Static231.method1690(TextureOp29.anInt2869, arg2 - arg3, TextureOp29.anInt5773);
		@Pc(48) int local48;
		for (local48 = local11; local48 < local37; local48++) {
			method2576(anIntArrayArray10[local48], local23, local29, arg4);
		}
		for (local48 = local17; local48 > local46; local48--) {
			method2576(anIntArrayArray10[local48], local23, local29, arg4);
		}
		@Pc(94) int local94 = Static231.method1690(TextureOp29.anInt5063, arg3 + arg6, TextureOp29.anInt4164);
		@Pc(103) int local103 = Static231.method1690(TextureOp29.anInt5063, arg0 - arg3, TextureOp29.anInt4164);
		for (local48 = local37; local48 <= local46; local48++) {
			@Pc(122) int[] local122 = anIntArrayArray10[local48];
			method2576(local122, local23, local94, arg4);
			method2576(local122, local94, local103, arg1);
			method2576(local122, local103, local29, arg4);
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
			method2576(anIntArrayArray10[local8], arg3, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([IIIII)V")
	public static void method2576(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1--;
		@Pc(14) int local14 = arg2 - 1;
		@Pc(17) int local17 = local14 - 7;
		while (local17 > arg1) {
			@Pc(22) int local22 = arg1 + 1;
			arg0[local22] = arg3;
			@Pc(27) int local27 = local22 + 1;
			arg0[local27] = arg3;
			@Pc(32) int local32 = local27 + 1;
			arg0[local32] = arg3;
			@Pc(37) int local37 = local32 + 1;
			arg0[local37] = arg3;
			@Pc(42) int local42 = local37 + 1;
			arg0[local42] = arg3;
			@Pc(47) int local47 = local42 + 1;
			arg0[local47] = arg3;
			@Pc(52) int local52 = local47 + 1;
			arg0[local52] = arg3;
			arg1 = local52 + 1;
			arg0[arg1] = arg3;
		}
		while (local14 > arg1) {
			arg1++;
			arg0[arg1] = arg3;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIII)V")
	public static void method3105(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static231.method1690(TextureOp29.anInt2869, arg2, TextureOp29.anInt5773);
		@Pc(17) int local17 = Static231.method1690(TextureOp29.anInt2869, arg4, TextureOp29.anInt5773);
		@Pc(23) int local23 = Static231.method1690(TextureOp29.anInt5063, arg3, TextureOp29.anInt4164);
		@Pc(35) int local35 = Static231.method1690(TextureOp29.anInt5063, arg1, TextureOp29.anInt4164);
		for (@Pc(37) int local37 = local11; local37 <= local17; local37++) {
			method2576(anIntArrayArray10[local37], local23, local35, arg0);
		}
	}

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLclient!wa;)Lclient!ta;")
	public static TextureOp29SubOp4 method2960(@OriginalArg(1) Buffer arg0) {
		return new TextureOp29SubOp4(arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.g3(), arg0.g3(), arg0.g1());
	}

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZI)V")
	@Override
	public final void method4009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5238 >> 12;
		@Pc(17) int local17 = this.anInt5244 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt5246 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt5247 * arg0 >> 12;
		Static247.method4244(this.anInt5229, local24, local31, local10, local17, this.anInt5231);
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
