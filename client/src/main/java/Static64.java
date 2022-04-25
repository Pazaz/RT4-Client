import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "[I")
	public static int[] anIntArray153;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Lclient!na;")
	public static final JagString aClass100_431 = JagString.parse("; Max)2Age=");

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Lclient!na;")
	public static final JagString aClass100_433 = JagString.parse("<col=ff3000>");

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "[I")
	public static final int[] anIntArray154 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(JB)V")
	public static void method1496(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static9.anInt178 >= 100 && !LoginManager.playerMember || Static9.anInt178 >= 200) {
			Chat.add(JagString.EMPTY, 0, LocalizedText.FRIENDLISTFULL);
			return;
		}
		@Pc(35) JagString local35 = Base37.decodeLowerCase(arg0).method3125();
		@Pc(42) int local42;
		for (local42 = 0; local42 < Static9.anInt178; local42++) {
			if (Static92.aLongArray3[local42] == arg0) {
				Chat.add(JagString.EMPTY, 0, JagString.concatenate(new JagString[] { local35, LocalizedText.FRIENDLISTDUPE}));
				return;
			}
		}
		for (local42 = 0; local42 < Static35.anInt1093; local42++) {
			if (arg0 == IgnoreList.encodedUsernames[local42]) {
				Chat.add(JagString.EMPTY, 0, JagString.concatenate(new JagString[] { LocalizedText.REMOVESOCIAL1, local35, LocalizedText.REMOVEIGNORE}));
				return;
			}
		}
		if (local35.strEquals(PlayerList.self.username)) {
			Chat.add(JagString.EMPTY, 0, LocalizedText.FRIENDCANTADDSELF);
			return;
		}
		Static122.aClass100Array92[Static9.anInt178] = local35;
		Static92.aLongArray3[Static9.anInt178] = arg0;
		Static104.anIntArray255[Static9.anInt178] = 0;
		Static214.aClass100Array170[Static9.anInt178] = JagString.EMPTY;
		Static106.anIntArray258[Static9.anInt178] = 0;
		Static3.aBooleanArray135[Static9.anInt178] = false;
		Static9.anInt178++;
		FriendsList.transmitAt = InterfaceList.transmitTimer;
		Protocol.outboundBuffer.p1isaac(120);
		Protocol.outboundBuffer.p8(arg0);
	}
}
