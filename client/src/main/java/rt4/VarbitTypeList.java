package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class VarbitTypeList {
    @OriginalMember(owner = "client!jl", name = "G", descriptor = "Lclient!n;")
    public static final SoftLruHashTable types = new SoftLruHashTable(64);
    @OriginalMember(owner = "client!nj", name = "c", descriptor = "Lclient!ve;")
    public static Js5 archive;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!ve;I)V")
    public static void init(@OriginalArg(0) Js5 arg0) {
        archive = arg0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)Lclient!kk;")
    public static VarbitType get(@OriginalArg(0) int arg0) {
        @Pc(10) VarbitType local10 = (VarbitType) types.get((long) arg0);
        if (local10 != null) {
            return local10;
        }
        @Pc(31) byte[] local31 = archive.getFile(method4349(arg0), method3845(arg0));
        local10 = new VarbitType();
        if (local31 != null) {
            local10.decode(new Buffer(local31));
        }
        types.put(local10, (long) arg0);
        return local10;
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(BI)V")
    public static void clean() {
        types.clean(5);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method1694() {
        types.method3103();
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
    public static void method1295() {
        types.clear();
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)I")
    public static int method3845(@OriginalArg(0) int arg0) {
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)I")
    public static int method4349(@OriginalArg(0) int arg0) {
        return arg0 >>> 10;
    }
}
