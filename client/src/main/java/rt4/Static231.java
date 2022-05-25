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
