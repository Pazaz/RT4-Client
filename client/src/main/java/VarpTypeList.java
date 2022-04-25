import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class VarpTypeList {
    @OriginalMember(owner = "client!sm", name = "c", descriptor = "Lclient!n;")
    public static final SoftLruHashTable types = new SoftLruHashTable(64);
    @OriginalMember(owner = "client!gg", name = "ab", descriptor = "Lclient!ve;")
    public static Js5 archive;
    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int anInt4043;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!ve;B)V")
    public static void init(@OriginalArg(0) Js5 arg0) {
        archive = arg0;
        anInt4043 = archive.getGroupCapacity(16);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Lclient!eh;")
    public static VarpType get(@OriginalArg(1) int arg0) {
        @Pc(10) VarpType local10 = (VarpType) types.get((long) arg0);
        if (local10 != null) {
            return local10;
        }
        @Pc(20) byte[] local20 = archive.getFile(16, arg0);
        local10 = new VarpType();
        if (local20 != null) {
            local10.decode(new Buffer(local20));
        }
        types.put(local10, (long) arg0);
        return local10;
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V")
    public static void method4266() {
        types.clear();
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V")
    public static void method4657() {
        types.method3103();
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(II)V")
    public static void clean() {
        types.clean(5);
    }
}
