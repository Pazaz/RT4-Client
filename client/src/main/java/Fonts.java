import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Fonts {
    @OriginalMember(owner = "client!j", name = "x", descriptor = "Lclient!rk;")
    public static Font p11Full;
    @OriginalMember(owner = "client!rh", name = "h", descriptor = "Lclient!rk;")
    public static Font p12Full;
    @OriginalMember(owner = "client!wl", name = "q", descriptor = "Lclient!rk;")
    public static Font b12Full;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!ve;Lclient!ve;Z)I")
    public static int getReady(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1) {
        @Pc(5) int ready = 0;
        if (arg0.isFileReady(Sprites.p11FullId)) {
            ready++;
        }
        if (arg0.isFileReady(Sprites.p12FullId)) {
            ready++;
        }
        if (arg0.isFileReady(Sprites.b12FullId)) {
            ready++;
        }
        if (arg1.isFileReady(Sprites.p11FullId)) {
            ready++;
        }
        if (arg1.isFileReady(Sprites.p12FullId)) {
            ready++;
        }
        if (arg1.isFileReady(Sprites.b12FullId)) {
            ready++;
        }
        return ready;
    }
}
