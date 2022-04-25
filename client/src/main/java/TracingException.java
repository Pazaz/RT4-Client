import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.DataInputStream;
import java.net.URL;

@OriginalClass("client!ld")
public final class TracingException extends RuntimeException {

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "Ljava/lang/Throwable;")
	public Throwable aThrowable1;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V")
    public static void report(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
        try {
            @Pc(13) String local13 = "";
            if (arg1 != null) {
                local13 = Static97.method1961(arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    local13 = local13 + " | ";
                }
                local13 = local13 + arg0;
            }
            Static5.method31(local13);
            local13 = Static40.method1014(":", "%3a", local13);
            local13 = Static40.method1014("@", "%40", local13);
            local13 = Static40.method1014("&", "%26", local13);
            local13 = Static40.method1014("#", "%23", local13);
            if (Static69.signLink.applet == null) {
                return;
            }
            @Pc(109) PrivilegedRequest local109 = Static69.signLink.openUrlStream(new URL(Static69.signLink.applet.getCodeBase(), "clienterror.ws?c=" + GameShell.anInt3252 + "&u=" + Static101.aLong98 + "&v1=" + SignLink.javaVendor + "&v2=" + SignLink.javaVersion + "&e=" + local13));
            while (local109.status == 0) {
                ThreadUtils.sleep(1L);
            }
            if (local109.status == 1) {
                @Pc(128) DataInputStream local128 = (DataInputStream) local109.result;
                local128.read();
                local128.close();
            }
        } catch (@Pc(135) Exception local135) {
        }
    }
}
