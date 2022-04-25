package rt4;

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

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILclient!na;)Lclient!bn;")
	public static Map get(@OriginalArg(1) JagString arg0) {
		for (@Pc(15) Map local15 = (Map) aClass69_120.method2289(); local15 != null; local15 = (Map) aClass69_120.method2288()) {
			if (local15.group.strEquals(arg0)) {
				return local15;
			}
		}
		return null;
	}

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBI)Lclient!bn;")
	public static Map getContainingSource(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(10) Map local10 = (Map) aClass69_120.method2289(); local10 != null; local10 = (Map) aClass69_120.method2288()) {
			if (local10.aBoolean50 && local10.method664(arg1, arg0)) {
				return local10;
			}
		}
		return null;
	}
}
