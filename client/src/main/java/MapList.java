import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class MapList {
    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Lclient!ih;")
    public static final LinkedList aClass69_120 = new LinkedList();
    @OriginalMember(owner = "client!je", name = "W", descriptor = "Lclient!ve;")
    public static Js5 archive;
    @OriginalMember(owner = "client!th", name = "p", descriptor = "[Lclient!mm;")
    public static SoftwareSprite[] sprites;
    @OriginalMember(owner = "client!va", name = "G", descriptor = "[Z")
    public static boolean[] aBooleanArray130;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lclient!mm;ILclient!ve;)V")
    public static void init(@OriginalArg(0) SoftwareSprite[] arg0, @OriginalArg(2) Js5 arg1) {
        archive = arg1;
        sprites = arg0;
        aBooleanArray130 = new boolean[sprites.length];
        aClass69_120.clear();
        @Pc(25) int local25 = archive.getGroupId(Static54.aClass100_374);
        @Pc(30) int[] local30 = archive.getFileIds(local25);
        for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
            aClass69_120.addTail(Map.create(new Buffer(archive.getFile(local25, local30[local32]))));
        }
    }
}
