package rt4;

import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "Lclient!be;")
	public static Component mouseOverInventoryInterface;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
	public static int anInt4075 = -1;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!na;BZ)V")
	public static void openUrl(@OriginalArg(0) JagString arg0, @OriginalArg(2) boolean arg1) {
		if (!arg1) {
			try {
				GameShell.instance.getAppletContext().showDocument(arg0.method3127(GameShell.instance.getCodeBase()), "_top");
			} catch (@Pc(22) Exception local22) {
			}
			return;
		}
		if (GlRenderer.enabled && GameShell.openWindowJavaScript) {
			try {
				BrowserControl.call(GameShell.signLink.applet, "openjs", new Object[] { arg0.method3127(GameShell.instance.getCodeBase()).toString() });
				return;
			} catch (@Pc(48) Throwable local48) {
			}
		}
		try {
			GameShell.instance.getAppletContext().showDocument(arg0.method3127(GameShell.instance.getCodeBase()), "_blank");
		} catch (@Pc(59) Exception local59) {
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIILsignlink!ll;)Ljava/awt/Frame;")
	public static Frame method3176(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) SignLink arg3) {
		if (!arg3.isFullScreenSupported()) {
			return null;
		}
		@Pc(20) DisplayMode[] local20 = DisplayMode.method3558(arg3);
		if (local20 == null) {
			return null;
		}
		@Pc(27) boolean local27 = false;
		for (@Pc(29) int local29 = 0; local29 < local20.length; local29++) {
			if (arg2 == local20[local29].width && arg1 == local20[local29].height && (!local27 || local20[local29].bitDepth > arg0)) {
				arg0 = local20[local29].bitDepth;
				local27 = true;
			}
		}
		if (!local27) {
			return null;
		}
		@Pc(90) PrivilegedRequest local90 = arg3.enterFullScreen(arg0, arg1, arg2);
		while (local90.status == 0) {
			ThreadUtils.sleep(10L);
		}
		@Pc(103) Frame local103 = (Frame) local90.result;
		if (local103 == null) {
			return null;
		} else if (local90.status == 2) {
			DisplayMode.exitFullScreen(local103, arg3);
			return null;
		} else {
			return local103;
		}
	}

}
