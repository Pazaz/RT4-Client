package rt4;

import org.openrs2.deob.annotation.OriginalMember;

public class NpcList {
    @OriginalMember(owner = "client!nm", name = "S", descriptor = "[Lclient!km;")
    public static final Npc[] npcs = new Npc[32768];
    @OriginalMember(owner = "client!cj", name = "i", descriptor = "[I")
    public static final int[] ids = new int[32768];
    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
	public static int size = 0;
}
