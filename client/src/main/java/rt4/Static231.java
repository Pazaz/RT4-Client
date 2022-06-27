package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!sk", name = "jb", descriptor = "I")
	public static int anInt5203;

	@OriginalMember(owner = "client!sk", name = "mb", descriptor = "I")
	public static int anInt5205;

	@OriginalMember(owner = "client!sk", name = "lb", descriptor = "Z")
	public static boolean aBoolean252 = false;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIII)V")
	public static void method3982(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = arg4 - arg2;
		@Pc(19) int local19 = arg1 - arg3;
		if (local15 == 0) {
			if (local19 != 0) {
				method1306(arg1, arg3, arg0, arg2);
			}
		} else if (local19 == 0) {
			method4019(arg2, arg0, arg4, arg3);
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

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIZII)V")
	public static void method4019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= TextureOp29.anInt5773 && arg3 <= TextureOp29.anInt2869) {
			@Pc(15) int local15 = method1690(TextureOp29.anInt5063, arg0, TextureOp29.anInt4164);
			@Pc(21) int local21 = method1690(TextureOp29.anInt5063, arg2, TextureOp29.anInt4164);
			method3826(arg1, arg3, local21, local15);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIBI)I")
	public static int method1690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return arg2 > arg1 ? arg2 : arg1 > arg0 ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIBI)V")
	public static void method3826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[arg1], arg3, arg2, arg0);
		} else {
			TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[arg1], arg2, arg3, arg0);
		}
	}

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZIIII)V")
	public static void method1306(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= TextureOp29.anInt4164 && arg3 <= TextureOp29.anInt5063) {
			@Pc(22) int local22 = method1690(TextureOp29.anInt2869, arg1, TextureOp29.anInt5773);
			@Pc(28) int local28 = method1690(TextureOp29.anInt2869, arg0, TextureOp29.anInt5773);
			method2054(local22, arg3, local28, arg2);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIII)V")
	public static void method2054(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8;
		if (arg0 <= arg2) {
			for (local8 = arg0; local8 < arg2; local8++) {
				TextureOp29SubOp4.anIntArrayArray10[local8][arg1] = arg3;
			}
		} else {
			for (local8 = arg2; local8 < arg0; local8++) {
				TextureOp29SubOp4.anIntArrayArray10[local8][arg1] = arg3;
			}
		}
	}
}
