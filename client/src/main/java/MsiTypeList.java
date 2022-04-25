import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class MsiTypeList {
    @OriginalMember(owner = "client!da", name = "c", descriptor = "(II)Lclient!aa;")
    public static MsiType get(@OriginalArg(0) int arg0) {
        @Pc(10) MsiType local10 = (MsiType) Static231.aClass99_29.get((long) arg0);
        if (local10 != null) {
            return local10;
        }
        @Pc(20) byte[] local20 = Static98.aClass153_42.getFile(34, arg0);
        local10 = new MsiType();
        if (local20 != null) {
            local10.decode(new Buffer(local20), arg0);
        }
        Static231.aClass99_29.put(local10, (long) arg0);
        return local10;
    }
}
