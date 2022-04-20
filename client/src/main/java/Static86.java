import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!gm", name = "T", descriptor = "Lclient!k;")
	public static Js5CacheQueue js5CacheQueue;

	@OriginalMember(owner = "client!gm", name = "ib", descriptor = "Lclient!ve;")
	public static Js5 aClass153_37;

	@OriginalMember(owner = "client!gm", name = "R", descriptor = "I")
	public static int anInt2293 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!gm", name = "W", descriptor = "Lclient!na;")
	public static final JagString aClass100_488 = Static28.parse("_");

	@OriginalMember(owner = "client!gm", name = "bb", descriptor = "Z")
	public static boolean aBoolean129 = false;

	@OriginalMember(owner = "client!gm", name = "db", descriptor = "Lclient!na;")
	public static final JagString aClass100_490 = Static28.parse("cross");

	@OriginalMember(owner = "client!gm", name = "gb", descriptor = "[I")
	public static final int[] anIntArray211 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "(B)V")
	public static void method1799() {
		Static222.aBoolean246 = true;
	}

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "(I)V")
	public static void method1800() {
		Static116.anInt2951 = 0;
		Static240.anInt5335 = 0;
		Static49.method1202();
		Static278.method4645();
		Static234.method4014();
		@Pc(19) int local19;
		for (local19 = 0; local19 < Static240.anInt5335; local19++) {
			@Pc(30) int local30 = Static52.anIntArray136[local19];
			if (Static175.aClass8_Sub4_Sub2Array1[local30].anInt3430 != Static83.anInt372) {
				if (Static175.aClass8_Sub4_Sub2Array1[local30].aClass96_1.method2935()) {
					Static91.method1877(Static175.aClass8_Sub4_Sub2Array1[local30]);
				}
				Static175.aClass8_Sub4_Sub2Array1[local30].method2698(null);
				Static175.aClass8_Sub4_Sub2Array1[local30] = null;
			}
		}
		if (Static223.anInt5028 != Static57.aClass3_Sub15_Sub1_3.offset) {
			throw new RuntimeException("gnp1 pos:" + Static57.aClass3_Sub15_Sub1_3.offset + " psize:" + Static223.anInt5028);
		}
		for (local19 = 0; local19 < Static272.anInt5214; local19++) {
			if (Static175.aClass8_Sub4_Sub2Array1[Static33.anIntArray79[local19]] == null) {
				throw new RuntimeException("gnp2 pos:" + local19 + " size:" + Static272.anInt5214);
			}
		}
	}
}
