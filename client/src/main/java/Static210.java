import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Lclient!ve;")
	public static Js5 aClass153_87;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!sc;")
	public static final HashTable aClass133_21 = new HashTable(512);

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public static void method3711() {
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (@Pc(14) int local14 = 0; local14 < 104; local14++) {
				Static31.anIntArrayArray6[local7][local14] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZB)V")
	public static void method3712(@OriginalArg(0) boolean arg0) {
		Static234.method4017(GameShell.canvasHeight, arg0, InterfaceList.topLevelInterface, GameShell.canvasWidth);
	}

}
