import org.openrs2.deob.annotation.OriginalMember;

public class PlayerSkillXpTable {
    @OriginalMember(owner = "client!ud", name = "T", descriptor = "[I")
	public static final int[] updatedStats = new int[32];
    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int updatedStatsWriterIndex = 0;
}
