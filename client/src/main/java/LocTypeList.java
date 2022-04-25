import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class LocTypeList {
    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Lclient!n;")
    public static final SoftLruHashTable types = new SoftLruHashTable(64);
    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Lclient!n;")
    public static final SoftLruHashTable aClass99_24 = new SoftLruHashTable(500);
    @OriginalMember(owner = "client!he", name = "fb", descriptor = "Lclient!n;")
    public static final SoftLruHashTable aClass99_14 = new SoftLruHashTable(30);
    @OriginalMember(owner = "client!vf", name = "l", descriptor = "Lclient!n;")
    public static final SoftLruHashTable aClass99_36 = new SoftLruHashTable(50);
    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Z")
    public static boolean allowMembers;
    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Lclient!ve;")
    public static Js5 locsArchive;
    @OriginalMember(owner = "client!jg", name = "j", descriptor = "Lclient!ve;")
    public static Js5 modelsArchive;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Lclient!pb;")
    public static LocType get(@OriginalArg(1) int id) {
        @Pc(15) LocType local15 = (LocType) types.get((long) id);
        if (local15 != null) {
            return local15;
        }
        @Pc(30) byte[] local30 = locsArchive.getFile(getGroupId(id), getFileId(id));
        local15 = new LocType();
        local15.id = id;
        if (local30 != null) {
            local15.decode(new Buffer(local30));
        }
        local15.postDecode();
        if (!allowMembers && local15.members) {
            local15.ops = null;
        }
        if (local15.aBoolean210) {
            local15.anInt4435 = 0;
            local15.aBoolean207 = false;
        }
        types.put(local15, (long) id);
        return local15;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(II)I")
    public static int getGroupId(@OriginalArg(0) int arg0) {
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)I")
	public static int getFileId(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILclient!ve;Lclient!ve;Z)V")
    public static void init(@OriginalArg(1) Js5 arg0, @OriginalArg(2) Js5 arg1) {
        allowMembers = true;
        modelsArchive = arg1;
        locsArchive = arg0;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public static void method3323() {
        types.method3103();
        aClass99_24.method3103();
        aClass99_14.method3103();
        aClass99_36.method3103();
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)V")
    public static void clean() {
        types.clean(5);
        aClass99_24.clean(5);
        aClass99_14.clean(5);
        aClass99_36.clean(5);
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
    public static void clear() {
        types.clear();
        aClass99_24.clear();
        aClass99_14.clear();
        aClass99_36.clear();
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BZ)V")
    public static void setAllowMembers(@OriginalArg(1) boolean arg0) {
        if (arg0 != allowMembers) {
            allowMembers = arg0;
            clear();
        }
    }
}
