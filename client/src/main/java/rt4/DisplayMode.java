package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

public class DisplayMode {
    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/awt/Frame;ZLsignlink!ll;)V")
    public static void exitFullScreen(@OriginalArg(0) Frame arg0, @OriginalArg(2) SignLink arg1) {
        while (true) {
            @Pc(16) PrivilegedRequest local16 = arg1.exitFullScreen(arg0);
            while (local16.status == 0) {
                ThreadUtils.sleep(10L);
            }
            if (local16.status == 1) {
                arg0.setVisible(false);
                arg0.dispose();
                return;
            }
            ThreadUtils.sleep(100L);
        }
    }
}
