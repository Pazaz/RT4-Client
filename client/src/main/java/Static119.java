import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!je", name = "eb", descriptor = "[I")
	public static int[] anIntArray282;

	@OriginalMember(owner = "client!je", name = "T", descriptor = "Lclient!sc;")
	public static HashTable aClass133_9 = new HashTable(8);

	@OriginalMember(owner = "client!je", name = "U", descriptor = "Lclient!na;")
	public static final JagString aClass100_588 = JagString.parse("showingVideoAd");

	@OriginalMember(owner = "client!je", name = "db", descriptor = "Lclient!na;")
	public static final JagString aClass100_589 = JagString.parse(" <col=ffffff>");

    @OriginalMember(owner = "client!je", name = "j", descriptor = "(I)I")
	public static int method2385() {
		if (WorldMap.labels == null) {
			return -1;
		}
		while (Static232.anInt5212 < WorldMap.labels.anInt5074) {
			if (WorldMap.labels.method3897(Static232.anInt5212)) {
				return Static232.anInt5212++;
			}
			Static232.anInt5212++;
		}
		return -1;
	}

	@OriginalMember(owner = "client!je", name = "k", descriptor = "(I)V")
	public static void method2386() {
		@Pc(6) AreaSound local6;
		for (local6 = (AreaSound) Static3.aClass69_135.method2289(); local6 != null; local6 = (AreaSound) Static3.aClass69_135.method2288()) {
			if (local6.multiLocOrNpc) {
				local6.update();
			}
		}
		for (local6 = (AreaSound) Static152.aClass69_87.method2289(); local6 != null; local6 = (AreaSound) Static152.aClass69_87.method2288()) {
			if (local6.multiLocOrNpc) {
				local6.update();
			}
		}
	}

}
