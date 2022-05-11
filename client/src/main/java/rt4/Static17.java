package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!be;ZI)V")
	public static void method531(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		@Pc(20) int local20 = arg0.scrollMaxH == 0 ? arg0.width : arg0.scrollMaxH;
		@Pc(32) int local32 = arg0.scrollMaxV == 0 ? arg0.height : arg0.scrollMaxV;
		Static266.method4190(arg0.id, arg1, local20, local32, InterfaceList.components[arg0.id >> 16]);
		if (arg0.createdComponents != null) {
			Static266.method4190(arg0.id, arg1, local20, local32, arg0.createdComponents);
		}
		@Pc(66) ComponentPointer local66 = (ComponentPointer) InterfaceList.openInterfaces.get((long) arg0.id);
		if (local66 != null) {
			Static234.method4017(local32, arg1, local66.anInt5878, local20);
		}
	}
}
