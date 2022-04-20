import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "[I")
	public static int[] anIntArray153;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Lclient!na;")
	public static final JagString aClass100_431 = Static28.method790("; Max)2Age=");

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "Lclient!na;")
	public static final JagString aClass100_432 = Static28.method790("M");

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "[Lclient!na;")
	public static final JagString[] aClass100Array62 = new JagString[100];

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Z")
	public static boolean aBoolean111 = true;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "Lclient!na;")
	public static final JagString aClass100_433 = Static28.method790("<col=ff3000>");

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "[I")
	public static final int[] anIntArray154 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
	public static void method1495() {
		Static116.anInt2951 = 0;
		Static240.anInt5335 = 0;
		Static17.method527();
		Static41.method1050();
		Static225.method3889();
		Static245.method4226();
		@Pc(23) int local23;
		for (local23 = 0; local23 < Static240.anInt5335; local23++) {
			@Pc(30) int local30 = Static52.anIntArray136[local23];
			if (Static83.anInt372 != Static159.aClass8_Sub4_Sub1Array1[local30].anInt3430) {
				if (Static159.aClass8_Sub4_Sub1Array1[local30].anInt1664 > 0) {
					Static271.method4597(Static159.aClass8_Sub4_Sub1Array1[local30]);
				}
				Static159.aClass8_Sub4_Sub1Array1[local30] = null;
			}
		}
		if (Static223.anInt5028 != Static57.aClass3_Sub15_Sub1_3.offset) {
			throw new RuntimeException("gpp1 pos:" + Static57.aClass3_Sub15_Sub1_3.offset + " psize:" + Static223.anInt5028);
		}
		for (local23 = 0; local23 < Static267.anInt5774; local23++) {
			if (Static159.aClass8_Sub4_Sub1Array1[Static105.anIntArray256[local23]] == null) {
				throw new RuntimeException("gpp2 pos:" + local23 + " size:" + Static267.anInt5774);
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(JB)V")
	public static void method1496(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static9.anInt178 >= 100 && !Static202.aBoolean233 || Static9.anInt178 >= 200) {
			Static103.method2231(Static186.aClass100_827, 0, Static233.aClass100_995);
			return;
		}
		@Pc(35) JagString local35 = Static79.method1702(arg0).method3125();
		@Pc(42) int local42;
		for (local42 = 0; local42 < Static9.anInt178; local42++) {
			if (Static92.aLongArray3[local42] == arg0) {
				Static103.method2231(Static186.aClass100_827, 0, Static34.method882(new JagString[] { local35, Static150.aClass100_691 }));
				return;
			}
		}
		for (local42 = 0; local42 < Static35.anInt1093; local42++) {
			if (arg0 == Static190.aLongArray6[local42]) {
				Static103.method2231(Static186.aClass100_827, 0, Static34.method882(new JagString[] { Static71.aClass100_417, local35, Static211.aClass100_227 }));
				return;
			}
		}
		if (local35.method3108(Static173.aClass8_Sub4_Sub1_2.aClass100_364)) {
			Static103.method2231(Static186.aClass100_827, 0, Static111.aClass100_573);
			return;
		}
		Static122.aClass100Array92[Static9.anInt178] = local35;
		Static92.aLongArray3[Static9.anInt178] = arg0;
		Static104.anIntArray255[Static9.anInt178] = 0;
		Static214.aClass100Array170[Static9.anInt178] = Static186.aClass100_827;
		Static106.anIntArray258[Static9.anInt178] = 0;
		Static3.aBooleanArray135[Static9.anInt178] = false;
		Static9.anInt178++;
		Static185.anInt4369 = Static119.anInt3028;
		Static6.aClass3_Sub15_Sub1_1.method2242(120);
		Static6.aClass3_Sub15_Sub1_1.p8(arg0);
	}
}
