package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class NpcTypeList {
    @OriginalMember(owner = "client!he", name = "V", descriptor = "Lclient!n;")
    public static final SoftLruHashTable types = new SoftLruHashTable(64);
    @OriginalMember(owner = "client!jl", name = "x", descriptor = "Lclient!n;")
    public static final SoftLruHashTable aClass99_18 = new SoftLruHashTable(50);
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
        @Pc(26) byte[] local26 = archive.getFile(Static60.method1447(arg0), Static179.method3322(arg0));
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
        types.method3103();
        aClass99_18.method3103();
        headModels.method3103();
    }

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "(B)V")
    public static void method3673() {
        types.clear();
        aClass99_18.clear();
        headModels.clear();
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(BI)V")
    public static void clean() {
        types.clean(5);
        aClass99_18.clean(5);
        headModels.clean(5);
    }
}
