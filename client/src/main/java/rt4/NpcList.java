package rt4;

import org.openrs2.deob.annotation.OriginalMember;

public class NpcList {
    @OriginalMember(owner = "client!nm", name = "S", descriptor = "[Lclient!km;")
    public static final Npc[] npcs = new Npc[32768];
}
