package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "[I")
	public static int[] anIntArray454;

	@OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
	public static int anInt5245 = 0;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIZII)V")
	public static void method4019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= TextureOp29.anInt5773 && arg3 <= TextureOp29.anInt2869) {
			@Pc(15) int local15 = Static78.method1690(TextureOp29.anInt5063, arg0, TextureOp29.anInt4164);
			@Pc(21) int local21 = Static78.method1690(TextureOp29.anInt5063, arg2, TextureOp29.anInt4164);
			Static222.method3826(arg1, arg3, local21, local15);
		}
	}

}
