import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "Lclient!ve;")
	public static Class153 aClass153_36;

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
	public static int anInt2261;

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
	public static int anInt2262;

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
	public static int anInt2263;

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "Lclient!na;")
	public static final Class100 aClass100_484 = Static28.method790("Monde de jeu cr-B-B");

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!ve;I)V")
	public static void method1774(@OriginalArg(0) Class153 arg0) {
		Static84.aClass153_35 = arg0;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V")
	public static void method1775(@OriginalArg(1) int arg0) {
		Static103.method2245();
		Static119.method2386();
		@Pc(17) int local17 = Static247.method4248(arg0).anInt1765;
		if (local17 == 0) {
			return;
		}
		@Pc(25) int local25 = Static7.anIntArray75[arg0];
		if (local17 == 6) {
			Static79.anInt2157 = local25;
		}
		if (local17 == 5) {
			Static116.anInt2952 = local25;
		}
		if (local17 == 9) {
			Static179.anInt4254 = local25;
		}
	}
}
