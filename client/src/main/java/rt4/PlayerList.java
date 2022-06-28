package rt4;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class PlayerList {
	@OriginalMember(owner = "client!ja", name = "l", descriptor = "[Lclient!wa;")
	public static final Buffer[] appearanceCache = new Buffer[2048];
	@OriginalMember(owner = "client!mi", name = "S", descriptor = "[Lclient!e;")
	public static final Player[] players = new Player[2048];
	@OriginalMember(owner = "client!ib", name = "f", descriptor = "[I")
	public static final int[] ids = new int[2048];
	@OriginalMember(owner = "client!ke", name = "Y", descriptor = "[I")
	public static final int[] anIntArray309 = new int[]{1, 4};
	@OriginalMember(owner = "client!nk", name = "O", descriptor = "Lclient!e;")
	public static Player self;
	@OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
	public static int selfId = -1;
	@OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
	public static int size = 0;
	@OriginalMember(owner = "client!i", name = "Ub", descriptor = "[Lclient!na;")
	public static JagString[] playerNames;
	@OriginalMember(owner = "client!vg", name = "a", descriptor = "[Lclient!na;")
	public static JagString[] playerNames2;

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
	public static void method1444() {
		for (@Pc(7) int local7 = -1; local7 < size; local7++) {
			@Pc(21) int local21;
			if (local7 == -1) {
				local21 = 2047;
			} else {
				local21 = ids[local7];
			}
			@Pc(31) Player local31 = players[local21];
			if (local31 != null) {
				NpcList.method4514(local31.getSize(), local31);
			}
		}
	}
}
