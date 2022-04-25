package rt4;

import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
	public static int anInt4073;

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "Lclient!be;")
	public static Component aClass13_18;

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
				Static287.method1758(GameShell.signLink.applet, "openjs", new Object[] { arg0.method3127(GameShell.instance.getCodeBase()).toString() });
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
		@Pc(20) Class114[] local20 = Static197.method3558(arg3);
		if (local20 == null) {
			return null;
		}
		@Pc(27) boolean local27 = false;
		for (@Pc(29) int local29 = 0; local29 < local20.length; local29++) {
			if (arg2 == local20[local29].anInt4248 && arg1 == local20[local29].anInt4250 && (!local27 || local20[local29].anInt4251 > arg0)) {
				arg0 = local20[local29].anInt4251;
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

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[BB)I")
	public static int crc32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(15) int local15 = arg0; local15 < arg1; local15++) {
			local5 = local5 >>> 8 ^ HuffmanCodec.anIntArray175[(local5 ^ arg2[local15]) & 0xFF];
		}
		return ~local5;
	}
}
