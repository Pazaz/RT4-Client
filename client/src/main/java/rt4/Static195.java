package rt4;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!pk", name = "R", descriptor = "[[Lclient!hg;")
	public static GlTile[][] underWaterHdTiles;

	@OriginalMember(owner = "client!pk", name = "Y", descriptor = "I")
	public static int anInt4581;

    @OriginalMember(owner = "client!pk", name = "bb", descriptor = "Lclient!na;")
	public static JagString aClass100_859;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "(I)V")
	public static void method3532() {
		for (@Pc(16) ProjAnimNode local16 = (ProjAnimNode) Static217.aClass69_116.method2289(); local16 != null; local16 = (ProjAnimNode) Static217.aClass69_116.method2288()) {
			@Pc(21) ProjAnim local21 = local16.aClass8_Sub6_1;
			if (Player.level != local21.anInt4810 || local21.anInt4800 < client.loop) {
				local16.unlink();
			} else if (client.loop >= local21.anInt4822) {
				if (local21.anInt4819 > 0) {
					@Pc(54) Npc local54 = NpcList.npcs[local21.anInt4819 - 1];
					if (local54 != null && local54.xFine >= 0 && local54.xFine < 13312 && local54.zFine >= 0 && local54.zFine < 13312) {
						local21.method3705(local54.zFine, client.loop, SceneGraph.getTileHeight(local21.anInt4810, local54.xFine, local54.zFine) - local21.anInt4805, local54.xFine);
					}
				}
				if (local21.anInt4819 < 0) {
					@Pc(102) int local102 = -local21.anInt4819 - 1;
					@Pc(107) Player local107;
					if (PlayerList.selfId == local102) {
						local107 = PlayerList.self;
					} else {
						local107 = PlayerList.players[local102];
					}
					if (local107 != null && local107.xFine >= 0 && local107.xFine < 13312 && local107.zFine >= 0 && local107.zFine < 13312) {
						local21.method3705(local107.zFine, client.loop, SceneGraph.getTileHeight(local21.anInt4810, local107.xFine, local107.zFine) - local21.anInt4805, local107.xFine);
					}
				}
				local21.method3704(Static178.anInt4247);
				Static43.method1141(Player.level, (int) local21.aDouble8, (int) local21.aDouble3, (int) local21.aDouble6, 60, local21, local21.anInt4821, -1L, false);
			}
		}
	}
}
