package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static258 {

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)Z")
	public static boolean method4428(@OriginalArg(0) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(BI)V")
	public static void method4444(@OriginalArg(1) int arg0) {
		Static9.anInt172 = arg0;
		Static91.anInt2428 = 20;
		Static201.anInt1864 = 3;
	}
}
