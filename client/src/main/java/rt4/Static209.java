package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)Z")
	public static boolean method3702(@OriginalArg(1) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BIII)V")
	public static void method3707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) DelayedStateChange local12 = Static238.method4143(9, arg0);
		local12.pushServer();
		local12.intArg1 = arg2;
		local12.intArg3 = arg1;
	}

}
