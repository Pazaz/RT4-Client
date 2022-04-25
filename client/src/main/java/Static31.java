import org.openrs2.deob.annotation.OriginalMember;

public final class Static31 {

	@OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
	public static int anInt987;

	@OriginalMember(owner = "client!ch", name = "v", descriptor = "[B")
	public static final byte[] aByteArray12 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!ch", name = "x", descriptor = "Lclient!na;")
	public static final JagString aClass100_193 = JagString.parse(":");

	@OriginalMember(owner = "client!ch", name = "z", descriptor = "[I")
	public static final int[] anIntArray76 = new int[5];

	@OriginalMember(owner = "client!ch", name = "C", descriptor = "[[I")
	public static final int[][] anIntArrayArray6 = new int[104][104];

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
	public static void method846() {
		if (!SceneGraph.allLevelsAreVisible() && Static41.anInt1316 != Player.level) {
			Static127.method2463(Player.level, Static52.anInt1695, Static80.centralZoneX, PlayerList.self.movementQueueZ[0], false, PlayerList.self.movementQueueX[0]);
		} else if (Player.level != Static107.anInt2875 && Static137.method2665(Player.level)) {
			Static107.anInt2875 = Player.level;
			Static269.method2218();
		}
	}

}
