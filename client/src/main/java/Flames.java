import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public class Flames {
    @OriginalMember(owner = "client!se", name = "t", descriptor = "[I")
    public static final int[] anIntArray445 = new int[] { 12543016, 15504954, 15914854, 16773818 };
    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Lclient!na;")
    public static final JagString RUNES = JagString.parse("runes");
    @OriginalMember(owner = "client!km", name = "Yc", descriptor = "I")
    public static int anInt3443;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!ve;)V")
    public static void init(@OriginalArg(1) Js5 arg0) {
        anInt3443 = arg0.getGroupId(RUNES);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!ve;I)Z")
    public static boolean isReady(@OriginalArg(0) Js5 arg0) {
        return arg0.isFileReady(anInt3443);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
    public static void update() {
        Static250.anInt5434++;
    }
}
