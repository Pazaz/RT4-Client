package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class NpcTypeList {
    @OriginalMember(owner = "client!he", name = "V", descriptor = "Lclient!n;")
    public static final SoftLruHashTable types = new SoftLruHashTable(64);
    @OriginalMember(owner = "client!jl", name = "x", descriptor = "Lclient!n;")
    public static final SoftLruHashTable models = new SoftLruHashTable(50);
    @OriginalMember(owner = "client!vf", name = "k", descriptor = "Lclient!n;")
    public static final SoftLruHashTable headModels = new SoftLruHashTable(5);
    @OriginalMember(owner = "client!gm", name = "ib", descriptor = "Lclient!ve;")
	public static Js5 modelsArchive;
    @OriginalMember(owner = "client!eh", name = "f", descriptor = "Lclient!ve;")
    public static Js5 archive;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ve;Lclient!ve;Z)V")
    public static void init(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1) {
        modelsArchive = arg0;
        archive = arg1;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)Lclient!me;")
    public static NpcType get(@OriginalArg(0) int arg0) {
        @Pc(10) NpcType local10 = (NpcType) types.get((long) arg0);
        if (local10 != null) {
            return local10;
        }
        @Pc(26) byte[] local26 = archive.fetchFile(method1447(arg0), method3322(arg0));
        local10 = new NpcType();
        local10.id = arg0;
        if (local26 != null) {
            local10.decode(new Buffer(local26));
        }
        local10.method2942();
        types.put(local10, (long) arg0);
        return local10;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
    public static void method4001() {
        types.removeSoft();
        models.removeSoft();
        headModels.removeSoft();
    }

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "(B)V")
    public static void method3673() {
        types.clear();
        models.clear();
        headModels.clear();
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(BI)V")
    public static void clean() {
        types.clean(5);
        models.clean(5);
        headModels.clean(5);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)I")
    public static int method1447(@OriginalArg(0) int arg0) {
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)I")
    public static int method3322(@OriginalArg(0) int arg0) {
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
    public static void clearModels() {
        models.clear();
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V")
    public static void clearHeadModels() {
        headModels.clear();
    }
}
