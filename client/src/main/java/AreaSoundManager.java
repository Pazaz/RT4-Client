import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class AreaSoundManager {
    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!e;I)V")
    public static void remove(@OriginalArg(0) Player arg0) {
        @Pc(10) AreaSound local10 = (AreaSound) Static93.aClass133_7.get(arg0.username.encode37());
        if (local10 == null) {
            return;
        }
        if (local10.primaryStream != null) {
            client.soundStream.removeSubStream(local10.primaryStream);
            local10.primaryStream = null;
        }
        local10.unlink();
    }
}
