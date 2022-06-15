package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class EnumTypeList {
    @OriginalMember(owner = "client!lj", name = "p", descriptor = "Lclient!gn;")
    public static final LruHashTable types = new LruHashTable(128);
    @OriginalMember(owner = "client!gk", name = "e", descriptor = "Lclient!ve;")
    public static Js5 archive;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!ve;I)V")
    public static void init(@OriginalArg(0) Js5 arg0) {
        archive = arg0;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZ)Lclient!ml;")
    public static EnumType get(@OriginalArg(0) int arg0) {
        @Pc(10) EnumType local10 = (EnumType) types.get((long) arg0);
        if (local10 != null) {
            return local10;
        }
        @Pc(24) byte[] local24 = archive.fetchFile(Static97.method1959(arg0), Static103.method2236(arg0));
        local10 = new EnumType();
        if (local24 != null) {
            local10.decode(new Buffer(local24));
        }
        types.put(local10, (long) arg0);
        return local10;
    }
}
