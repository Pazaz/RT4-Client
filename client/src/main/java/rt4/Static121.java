package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
	public static int anInt3038;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
	public static int anInt3039;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
	public static int anInt3041;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "Z")
	public static boolean aBoolean154 = false;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBIII)V")
	public static void method2407(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < InterfaceList.anInt766; local3++) {
			if (arg0 < Static264.anIntArray410[local3] + Static224.anIntArray443[local3] && arg0 + arg3 > Static264.anIntArray410[local3] && Static50.anIntArray133[local3] + Static67.anIntArray320[local3] > arg1 && Static50.anIntArray133[local3] < arg2 + arg1) {
				InterfaceList.rectangleRedraw[local3] = true;
			}
		}
	}
}
