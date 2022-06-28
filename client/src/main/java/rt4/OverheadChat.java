package rt4;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class OverheadChat {
	@OriginalMember(owner = "client!bi", name = "f", descriptor = "(B)V")
	public static void loop() {
		@Pc(11) int local11;
		for (local11 = -1; local11 < PlayerList.size; local11++) {
			@Pc(22) int local22;
			if (local11 == -1) {
				local22 = 2047;
			} else {
				local22 = PlayerList.ids[local11];
			}
			@Pc(30) Player local30 = PlayerList.players[local22];
			if (local30 != null && local30.chatLoops > 0) {
				local30.chatLoops--;
				if (local30.chatLoops == 0) {
					local30.chatMessage = null;
				}
			}
		}
		for (local11 = 0; local11 < NpcList.size; local11++) {
			@Pc(68) int local68 = NpcList.ids[local11];
			@Pc(72) Npc local72 = NpcList.npcs[local68];
			if (local72 != null && local72.chatLoops > 0) {
				local72.chatLoops--;
				if (local72.chatLoops == 0) {
					local72.chatMessage = null;
				}
			}
		}
	}
}
