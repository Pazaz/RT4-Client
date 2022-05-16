package rt4;

import org.openrs2.deob.annotation.OriginalMember;

public final class Static175 {

    @OriginalMember(owner = "client!nm", name = "W", descriptor = "Lclient!na;")
	public static JagString url;

	@OriginalMember(owner = "client!nm", name = "U", descriptor = "I")
	public static int mapFilesMissingCount = 0;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V")
	public static void method3279() {
		if (Static267.anInt5775 > 0) {
			LoginManager.processLogout();
		} else {
			Static233.aClass95_4 = Protocol.socket;
			Protocol.socket = null;
			client.setGameState(40);
		}
	}
}
