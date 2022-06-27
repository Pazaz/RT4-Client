package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class FluTypeList {
    @OriginalMember(owner = "client!gj", name = "p", descriptor = "Lclient!n;")
    public static final SoftLruHashTable types = new SoftLruHashTable(64);
    @OriginalMember(owner = "client!oj", name = "x", descriptor = "Lclient!ve;")
    public static Js5 archive;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI)Lclient!ni;")
    public static FluType get(@OriginalArg(1) int arg0) {
        @Pc(10) FluType local10 = (FluType) types.get((long) arg0);
        if (local10 != null) {
            return local10;
        }
        @Pc(27) byte[] local27 = archive.fetchFile(1, arg0);
        local10 = new FluType();
        if (local27 != null) {
            local10.decode(arg0, new Buffer(local27));
        }
        types.put(local10, (long) arg0);
        return local10;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ve;I)V")
    public static void init(@OriginalArg(0) Js5 arg0) {
        archive = arg0;
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(B)V")
    public static void method3885() {
        types.removeSoft();
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
    public static void method1308() {
        types.clear();
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(IB)V")
    public static void clean() {
        types.clean(5);
    }
}
