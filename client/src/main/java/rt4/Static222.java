package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static222 {

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIBI)V")
	public static void method3826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			Static131.method2576(Static71.anIntArrayArray10[arg1], arg3, arg2, arg0);
		} else {
			Static131.method2576(Static71.anIntArrayArray10[arg1], arg2, arg3, arg0);
		}
	}
}