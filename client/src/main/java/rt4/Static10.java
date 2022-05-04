package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!an", name = "db", descriptor = "S")
	public static short aShort9 = 205;

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(III)V")
	public static void method348(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static189.anInt4457 != arg1) {
			Static173.anIntArray367 = new int[arg1];
			for (@Pc(10) int local10 = 0; local10 < arg1; local10++) {
				Static173.anIntArray367[local10] = (local10 << 12) / arg1;
			}
			Static165.anInt4042 = arg1 == 64 ? 2048 : 4096;
			Static34.anInt1060 = arg1 - 1;
			Static189.anInt4457 = arg1;
		}
		if (Static172.anInt4165 == arg0) {
			return;
		}
		if (Static189.anInt4457 == arg0) {
			Static64.anIntArray153 = Static173.anIntArray367;
		} else {
			Static64.anIntArray153 = new int[arg0];
			for (@Pc(61) int local61 = 0; local61 < arg0; local61++) {
				Static64.anIntArray153[local61] = (local61 << 12) / arg0;
			}
		}
		Static172.anInt4165 = arg0;
		Static141.anInt3473 = arg0 - 1;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIIII)V")
	public static void method352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static78.method1690(TextureOp29.anInt2869, arg5, TextureOp29.anInt5773);
		@Pc(17) int local17 = Static78.method1690(TextureOp29.anInt2869, arg0, TextureOp29.anInt5773);
		@Pc(23) int local23 = Static78.method1690(TextureOp29.anInt5063, arg3, TextureOp29.anInt4164);
		@Pc(29) int local29 = Static78.method1690(TextureOp29.anInt5063, arg2, TextureOp29.anInt4164);
		@Pc(42) int local42 = Static78.method1690(TextureOp29.anInt2869, arg5 + arg1, TextureOp29.anInt5773);
		@Pc(51) int local51 = Static78.method1690(TextureOp29.anInt2869, arg0 - arg1, TextureOp29.anInt5773);
		@Pc(53) int local53;
		for (local53 = local11; local53 < local42; local53++) {
			Static131.method2576(Static71.anIntArrayArray10[local53], local23, local29, arg4);
		}
		for (local53 = local17; local53 > local51; local53--) {
			Static131.method2576(Static71.anIntArrayArray10[local53], local23, local29, arg4);
		}
		@Pc(95) int local95 = Static78.method1690(TextureOp29.anInt5063, arg1 + arg3, TextureOp29.anInt4164);
		@Pc(104) int local104 = Static78.method1690(TextureOp29.anInt5063, arg2 - arg1, TextureOp29.anInt4164);
		for (local53 = local42; local53 <= local51; local53++) {
			@Pc(117) int[] local117 = Static71.anIntArrayArray10[local53];
			Static131.method2576(local117, local23, local95, arg4);
			Static131.method2576(local117, local104, local29, arg4);
		}
	}
}
