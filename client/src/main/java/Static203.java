import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "Lclient!se;")
	public static Class134 aClass134_1;

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "Lclient!fd;")
	public static WorldMapFont aClass41_8;

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "[Lclient!ee;")
	public static Class32[] aClass32Array1;

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "Lclient!ve;")
	public static Js5 aClass153_85;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "Lclient!na;")
	public static final JagString aClass100_893 = Static28.parse("Memory before cleanup=");

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "Lclient!na;")
	public static final JagString aClass100_894 = Static28.parse("Mem:");

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
	public static void method3662() {
		@Pc(8) Container local8;
		if (GameShell.fullScreenFrame != null) {
			local8 = GameShell.fullScreenFrame;
		} else if (GameShell.frame == null) {
			local8 = GameShell.signLink.applet;
		} else {
			local8 = GameShell.frame;
		}
		GameShell.frameWidth = local8.getSize().width;
		GameShell.frameHeight = local8.getSize().height;
		@Pc(35) Insets local35;
		if (local8 == GameShell.frame) {
			local35 = GameShell.frame.getInsets();
			GameShell.frameHeight -= local35.bottom + local35.top;
			GameShell.frameWidth -= local35.right + local35.left;
		}
		if (Static144.method2736() >= 2) {
			GameShell.canvasWidth = GameShell.frameWidth;
			GameShell.leftMargin = 0;
			GameShell.topMargin = 0;
			GameShell.canvasHeight = GameShell.frameHeight;
		} else {
			GameShell.topMargin = 0;
			GameShell.leftMargin = (GameShell.frameWidth - 765) / 2;
			GameShell.canvasHeight = 503;
			GameShell.canvasWidth = 765;
		}
		if (GlRenderer.enabled) {
			GlRenderer.setCanvasSize(GameShell.canvasWidth, GameShell.canvasHeight);
		}
		GameShell.canvas.setSize(GameShell.canvasWidth, GameShell.canvasHeight);
		if (local8 == GameShell.frame) {
			local35 = GameShell.frame.getInsets();
			GameShell.canvas.setLocation(local35.left + GameShell.leftMargin, GameShell.topMargin + local35.top);
		} else {
			GameShell.canvas.setLocation(GameShell.leftMargin, GameShell.topMargin);
		}
		if (Static154.topLevelInterface != -1) {
			Static210.method3712(true);
		}
		Static139.method2704();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lsignlink!ll;B)V")
	public static void savePreferences(@OriginalArg(0) SignLink arg0) {
		@Pc(11) FileOnDisk local11 = null;
		try {
			@Pc(16) PrivilegedRequest local16 = arg0.openPreferences("runescape");
			while (local16.status == 0) {
				Static231.sleep(1L);
			}
			if (local16.status == 1) {
				local11 = (FileOnDisk) local16.result;
				@Pc(39) Buffer local39 = Static48.method1196();
				local11.write(local39.data, local39.offset, 0);
			}
		} catch (@Pc(49) Exception local49) {
		}
		try {
			if (local11 != null) {
				local11.close();
			}
		} catch (@Pc(56) Exception local56) {
		}
	}
}
