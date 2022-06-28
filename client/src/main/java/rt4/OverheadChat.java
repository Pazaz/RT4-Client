package rt4;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class OverheadChat {
	@OriginalMember(owner = "client!bf", name = "I", descriptor = "[I")
	public static final int[] COLORS = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};

	@OriginalMember(owner = "client!pg", name = "fb", descriptor = "I")
	public static final int CAPACITY = 50;

	@OriginalMember(owner = "client!pg", name = "cb", descriptor = "[I")
	public static final int[] anIntArray389 = new int[CAPACITY];

	@OriginalMember(owner = "client!pg", name = "Z", descriptor = "[I")
	public static final int[] anIntArray387 = new int[CAPACITY];

	@OriginalMember(owner = "client!pg", name = "kb", descriptor = "[I")
	public static final int[] effects = new int[CAPACITY];

	@OriginalMember(owner = "client!pg", name = "Q", descriptor = "[I")
	public static final int[] loops = new int[CAPACITY];

	@OriginalMember(owner = "client!pg", name = "eb", descriptor = "[I")
	public static final int[] colors = new int[CAPACITY];

	@OriginalMember(owner = "client!pg", name = "lb", descriptor = "[I")
	public static final int[] anIntArray392 = new int[CAPACITY];

	@OriginalMember(owner = "client!pg", name = "R", descriptor = "[I")
	public static final int[] anIntArray385 = new int[CAPACITY];

	@OriginalMember(owner = "client!pg", name = "P", descriptor = "[Lclient!na;")
	public static final JagString[] messages = new JagString[CAPACITY];

	@OriginalMember(owner = "client!wi", name = "bb", descriptor = "I")
	public static int size = 0;

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "(B)V")
	public static void loop() {
		@Pc(11) int i;
		for (i = -1; i < PlayerList.size; i++) {
			@Pc(22) int id;
			if (i == -1) {
				id = 2047;
			} else {
				id = PlayerList.ids[i];
			}
			@Pc(30) Player player = PlayerList.players[id];
			if (player != null && player.chatLoops > 0) {
				player.chatLoops--;
				if (player.chatLoops == 0) {
					player.chatMessage = null;
				}
			}
		}
		for (i = 0; i < NpcList.size; i++) {
			@Pc(68) int id = NpcList.ids[i];
			@Pc(72) Npc npc = NpcList.npcs[id];
			if (npc != null && npc.chatLoops > 0) {
				npc.chatLoops--;
				if (npc.chatLoops == 0) {
					npc.chatMessage = null;
				}
			}
		}
	}
}
