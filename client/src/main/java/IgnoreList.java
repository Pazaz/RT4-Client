import org.openrs2.deob.annotation.OriginalMember;

public class IgnoreList {
    @OriginalMember(owner = "client!pf", name = "h", descriptor = "[J")
    public static final long[] encodedUsernames = new long[100];
}
