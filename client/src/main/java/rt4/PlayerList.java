package rt4;

import org.openrs2.deob.annotation.OriginalMember;

public class PlayerList {
    @OriginalMember(owner = "client!ja", name = "l", descriptor = "[Lclient!wa;")
    public static final Buffer[] appearanceCache = new Buffer[2048];
    @OriginalMember(owner = "client!mi", name = "S", descriptor = "[Lclient!e;")
    public static final Player[] players = new Player[2048];
    @OriginalMember(owner = "client!ib", name = "f", descriptor = "[I")
    public static final int[] ids = new int[2048];
    @OriginalMember(owner = "client!nk", name = "O", descriptor = "Lclient!e;")
    public static Player self;
    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public static int selfId = -1;
    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int size = 0;
}
