package rt4;

import org.openrs2.deob.annotation.OriginalMember;

public final class Static31 {

	@OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
	public static int anInt987;

	@OriginalMember(owner = "client!ch", name = "z", descriptor = "[I")
	public static final int[] anIntArray76 = new int[5];

	@OriginalMember(owner = "client!ch", name = "C", descriptor = "[[I")
	public static final int[][] anIntArrayArray6 = new int[104][104];

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
	public static void method846() {
		if (!SceneGraph.allLevelsAreVisible() && LoginManager.centralPlane != Player.level) {
			LoginManager.method2463(Player.level, LoginManager.centralZoneZ, LoginManager.centralZoneX, PlayerList.self.movementQueueZ[0], false, PlayerList.self.movementQueueX[0]);
		} else if (Player.level != Static107.anInt2875 && MiniMap.renderMap(Player.level)) {
			Static107.anInt2875 = Player.level;
			Static269.method2218();
		}
	}

}
