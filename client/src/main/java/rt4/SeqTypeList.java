package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class SeqTypeList {
    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Lclient!n;")
    public static final SoftLruHashTable types = new SoftLruHashTable(64);
    @OriginalMember(owner = "client!vl", name = "a", descriptor = "Lclient!n;")
    public static final SoftLruHashTable animFramesets = new SoftLruHashTable(100);
    @OriginalMember(owner = "client!tk", name = "s", descriptor = "Lclient!ve;")
    public static Js5 archive;
    @OriginalMember(owner = "client!af", name = "a", descriptor = "Lclient!ve;")
    public static Js5 basesArchive;
    @OriginalMember(owner = "client!se", name = "l", descriptor = "Lclient!ve;")
    public static Js5 animsArchive;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Lclient!tk;")
    public static SeqType get(@OriginalArg(0) int id) {
        @Pc(17) SeqType local17 = (SeqType) types.get((long) id);
        if (local17 != null) {
            return local17;
        }
        @Pc(32) byte[] local32 = archive.fetchFile(getGroupId(id), getFileId(id));
        local17 = new SeqType();
        local17.id = id;
        if (local32 != null) {
            local17.decode(new Buffer(local32));
        }
        local17.postDecode();
        types.put(local17, (long) id);
        return local17;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)I")
    public static int getGroupId(@OriginalArg(0) int arg0) {
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I")
    public static int getFileId(@OriginalArg(1) int arg0) {
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!ve;Lclient!ve;ILclient!ve;)V")
    public static void init(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(3) Js5 arg2) {
        archive = arg1;
        basesArchive = arg0;
        animsArchive = arg2;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V")
    public static void method350() {
        types.clear();
        animFramesets.clear();
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static void method3903() {
        types.method3103();
        animFramesets.method3103();
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)V")
    public static void clean() {
        types.clean(5);
        animFramesets.clean(5);
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)Lclient!cl;")
    public static AnimFrameset getAnimFrameset(@OriginalArg(0) int id) {
        @Pc(19) AnimFrameset frameset = (AnimFrameset) animFramesets.get((long) id);
        if (frameset != null) {
            return frameset;
        }
        frameset = AnimFrameset.create(animsArchive, basesArchive, id);
        if (frameset != null) {
            animFramesets.put(frameset, (long) id);
        }
        return frameset;
    }
}
