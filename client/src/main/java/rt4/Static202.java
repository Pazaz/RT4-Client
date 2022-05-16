package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "([Lclient!na;[SI)V")
	public static void method3656(@OriginalArg(0) JagString[] arg0, @OriginalArg(1) short[] arg1) {
		Static54.method1307(arg1, arg0.length - 1, arg0, 0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBII)I")
	public static int method3659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

}
