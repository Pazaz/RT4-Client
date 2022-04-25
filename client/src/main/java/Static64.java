import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "[I")
	public static int[] anIntArray153;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Lclient!na;")
	public static final JagString aClass100_431 = JagString.parse("; Max)2Age=");

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "[Lclient!na;")
	public static final JagString[] aClass100Array62 = new JagString[100];

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Lclient!na;")
	public static final JagString aClass100_433 = JagString.parse("<col=ff3000>");

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
			if (Static83.loop != Static159.players[local30].anInt3430) {
				if (Static159.players[local30].soundRadius > 0) {
					Static271.method4597(Static159.players[local30]);
				}
				Static159.players[local30] = null;
			}
		}
		if (Protocol.length != Protocol.inboundBuffer.offset) {
			throw new RuntimeException("gpp1 pos:" + Protocol.inboundBuffer.offset + " psize:" + Protocol.length);
		}
		for (local23 = 0; local23 < Static267.anInt5774; local23++) {
			if (Static159.players[Static105.anIntArray256[local23]] == null) {
				throw new RuntimeException("gpp2 pos:" + local23 + " size:" + Static267.anInt5774);
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(JB)V")
	public static void method1496(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static9.anInt178 >= 100 && !LoginManager.playerMember || Static9.anInt178 >= 200) {
			Static103.method2231(JagString.EMPTY, 0, LocalizedText.FRIENDLISTFULL);
			return;
		}
		@Pc(35) JagString local35 = Base37.decodeLowerCase(arg0).method3125();
		@Pc(42) int local42;
		for (local42 = 0; local42 < Static9.anInt178; local42++) {
			if (Static92.aLongArray3[local42] == arg0) {
				Static103.method2231(JagString.EMPTY, 0, JagString.concatenate(new JagString[] { local35, LocalizedText.FRIENDLISTDUPE}));
				return;
			}
		}
		for (local42 = 0; local42 < Static35.anInt1093; local42++) {
			if (arg0 == Static190.aLongArray6[local42]) {
				Static103.method2231(JagString.EMPTY, 0, JagString.concatenate(new JagString[] { LocalizedText.REMOVESOCIAL1, local35, LocalizedText.REMOVEIGNORE}));
				return;
			}
		}
		if (local35.strEquals(PlayerList.self.aClass100_364)) {
			Static103.method2231(JagString.EMPTY, 0, LocalizedText.FRIENDCANTADDSELF);
			return;
		}
		Static122.aClass100Array92[Static9.anInt178] = local35;
		Static92.aLongArray3[Static9.anInt178] = arg0;
		Static104.anIntArray255[Static9.anInt178] = 0;
		Static214.aClass100Array170[Static9.anInt178] = JagString.EMPTY;
		Static106.anIntArray258[Static9.anInt178] = 0;
		Static3.aBooleanArray135[Static9.anInt178] = false;
		Static9.anInt178++;
		Static185.anInt4369 = InterfaceList.transmitTimer;
		Protocol.outboundBuffer.p1isaac(120);
		Protocol.outboundBuffer.p8(arg0);
	}
}
