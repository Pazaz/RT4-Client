package rt4;

import org.openrs2.deob.annotation.OriginalMember;

public class PlayerSkillXpTable {
    @OriginalMember(owner = "client!ud", name = "T", descriptor = "[I")
	public static final int[] updatedStats = new int[32];
    @OriginalMember(owner = "client!lb", name = "p", descriptor = "[I")
    public static final int[] baseLevels = new int[25];
    @OriginalMember(owner = "client!hk", name = "fb", descriptor = "[I")
	public static final int[] boostedLevels = new int[25];
    @OriginalMember(owner = "client!sg", name = "b", descriptor = "[I")
	public static final int[] experience = new int[25];
    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int updatedStatsWriterIndex = 0;
}
