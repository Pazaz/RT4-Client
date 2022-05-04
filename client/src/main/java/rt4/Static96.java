package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static96 {

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "[I")
	public static int[] anIntArray234;

	@OriginalMember(owner = "client!hh", name = "r", descriptor = "[I")
	public static int[] anIntArray235;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V")
	public static void method1949(@OriginalArg(1) int arg0) {
		if (InterfaceList.load(arg0)) {
			Static118.method2354(-1, InterfaceList.components[arg0]);
		}
	}

}
