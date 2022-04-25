import org.openrs2.deob.annotation.OriginalMember;

public class PlayerList {
    @OriginalMember(owner = "client!nk", name = "O", descriptor = "Lclient!e;")
    public static Player self;
    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public static int selfId = -1;
}
