package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
	public static int anInt3038;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "Z")
	public static boolean qaOpTest = false;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBIII)V")
	public static void method2407(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < InterfaceList.rectangles; local3++) {
			if (arg0 < InterfaceList.rectangleX[local3] + InterfaceList.rectangleWidth[local3] && arg0 + arg3 > InterfaceList.rectangleX[local3] && InterfaceList.rectangleY[local3] + InterfaceList.rectangleHeight[local3] > arg1 && InterfaceList.rectangleY[local3] < arg2 + arg1) {
				InterfaceList.rectangleRedraw[local3] = true;
			}
		}
	}
}
