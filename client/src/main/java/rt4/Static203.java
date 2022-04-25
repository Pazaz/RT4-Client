package rt4;

import java.awt.Container;
import java.awt.Insets;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Lclient!na;")
	public static final JagString aClass100_893 = JagString.parse("Memory before cleanup=");

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "Lclient!na;")
	public static final JagString aClass100_894 = JagString.parse("Mem:");

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
		if (Static144.getWindowMode() >= 2) {
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
		if (InterfaceList.topLevelInterface != -1) {
			Static210.method3712(true);
		}
		Static139.method2704();
	}

}
