import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!pm", name = "cb", descriptor = "[[[Lclient!bj;")
	public static Tile[][][] surfaceGroundTiles;

	@OriginalMember(owner = "client!pm", name = "hb", descriptor = "I")
	public static int anInt4620;

	@OriginalMember(owner = "client!pm", name = "Y", descriptor = "Lclient!na;")
	public static final JagString aClass100_872 = JagString.parse("<br>");

	@OriginalMember(owner = "client!pm", name = "ab", descriptor = "Z")
	public static boolean aBoolean228 = true;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILsignlink!ll;)[Lclient!od;")
	public static Class114[] method3558(@OriginalArg(1) SignLink arg0) {
		if (!arg0.isFullScreenSupported()) {
			return new Class114[0];
		}
		@Pc(17) PrivilegedRequest local17 = arg0.getDisplayModes();
		while (local17.status == 0) {
			ThreadUtils.sleep(10L);
		}
		if (local17.status == 2) {
			return new Class114[0];
		}
		@Pc(39) int[] local39 = (int[]) local17.result;
		@Pc(45) Class114[] local45 = new Class114[local39.length >> 2];
		for (@Pc(47) int local47 = 0; local47 < local45.length; local47++) {
			@Pc(59) Class114 local59 = new Class114();
			local45[local47] = local59;
			local59.anInt4248 = local39[local47 << 2];
			local59.anInt4250 = local39[(local47 << 2) + 1];
			local59.anInt4251 = local39[(local47 << 2) + 2];
			local59.anInt4249 = local39[(local47 << 2) + 3];
		}
		return local45;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZIZIZII)V")
	public static void setWindowMode(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2) {
			GlRenderer.quit();
		}
		if (GameShell.fullScreenFrame != null && (arg1 != 3 || arg4 != Preferences.fullScreenWidth || arg5 != Preferences.fullScreenHeight)) {
			DisplayMode.exitFullScreen(GameShell.fullScreenFrame, GameShell.signLink);
			GameShell.fullScreenFrame = null;
		}
		if (arg1 == 3 && GameShell.fullScreenFrame == null) {
			GameShell.fullScreenFrame = Static169.method3176(0, arg5, arg4, GameShell.signLink);
			if (GameShell.fullScreenFrame != null) {
				Preferences.fullScreenHeight = arg5;
				Preferences.fullScreenWidth = arg4;
				Preferences.write(GameShell.signLink);
			}
		}
		if (arg1 == 3 && GameShell.fullScreenFrame == null) {
			setWindowMode(true, Preferences.favoriteWorlds, true, arg3, -1, -1);
			return;
		}
		@Pc(85) Container local85;
		if (GameShell.fullScreenFrame != null) {
			local85 = GameShell.fullScreenFrame;
		} else if (GameShell.frame == null) {
			local85 = GameShell.signLink.applet;
		} else {
			local85 = GameShell.frame;
		}
		GameShell.frameWidth = local85.getSize().width;
		GameShell.frameHeight = local85.getSize().height;
		@Pc(109) Insets local109;
		if (GameShell.frame == local85) {
			local109 = GameShell.frame.getInsets();
			GameShell.frameWidth -= local109.right + local109.left;
			GameShell.frameHeight -= local109.bottom + local109.top;
		}
		if (arg1 >= 2) {
			GameShell.canvasWidth = GameShell.frameWidth;
			GameShell.canvasHeight = GameShell.frameHeight;
			GameShell.leftMargin = 0;
			GameShell.topMargin = 0;
		} else {
			GameShell.topMargin = 0;
			GameShell.leftMargin = (GameShell.frameWidth - 765) / 2;
			GameShell.canvasWidth = 765;
			GameShell.canvasHeight = 503;
		}
		if (arg0) {
			Keyboard.stop(GameShell.canvas);
			Mouse.stop(GameShell.canvas);
			if (client.mouseWheel != null) {
				client.mouseWheel.stop(GameShell.canvas);
			}
			client.instance.addCanvas();
			Keyboard.start(GameShell.canvas);
			Mouse.start(GameShell.canvas);
			if (client.mouseWheel != null) {
				client.mouseWheel.start(GameShell.canvas);
			}
		} else {
			if (GlRenderer.enabled) {
				GlRenderer.setCanvasSize(GameShell.canvasWidth, GameShell.canvasHeight);
			}
			GameShell.canvas.setSize(GameShell.canvasWidth, GameShell.canvasHeight);
			if (GameShell.frame == local85) {
				local109 = GameShell.frame.getInsets();
				GameShell.canvas.setLocation(local109.left + GameShell.leftMargin, local109.top + GameShell.topMargin);
			} else {
				GameShell.canvas.setLocation(GameShell.leftMargin, GameShell.topMargin);
			}
		}
		if (arg1 == 0 && arg3 > 0) {
			GlRenderer.createAndDestroyContext(GameShell.canvas);
		}
		if (arg2 && arg1 > 0) {
			GameShell.canvas.setIgnoreRepaint(true);
			if (!Static211.aBoolean73) {
				Static65.method1500();
				client.frameBuffer = null;
				client.frameBuffer = Static131.create(GameShell.canvasHeight, GameShell.canvasWidth, GameShell.canvas);
				SoftwareRaster.clear();
				if (client.gameState == 5) {
					LoadingBar.render(true, Fonts.b12Full);
				} else {
					Static114.drawTextOnScreen(false, LocalizedText.LOADING);
				}
				try {
					@Pc(269) Graphics local269 = GameShell.canvas.getGraphics();
					client.frameBuffer.draw(local269);
				} catch (@Pc(277) Exception local277) {
				}
				Static139.method2704();
				if (arg3 == 0) {
					client.frameBuffer = Static131.create(503, 765, GameShell.canvas);
				} else {
					client.frameBuffer = null;
				}
				@Pc(300) PrivilegedRequest local300 = GameShell.signLink.loadGlNatives(client.instance.getClass());
				while (local300.status == 0) {
					ThreadUtils.sleep(100L);
				}
				if (local300.status == 1) {
					Static211.aBoolean73 = true;
				}
			}
			if (Static211.aBoolean73) {
				GlRenderer.init(GameShell.canvas, Preferences.antiAliasingMode * 2);
			}
		}
		if (!GlRenderer.enabled && arg1 > 0) {
			setWindowMode(true, 0, true, arg3, -1, -1);
			return;
		}
		if (arg1 > 0 && arg3 == 0) {
			GameShell.thread.setPriority(5);
			client.frameBuffer = null;
			Static268.method4580();
			((Js5GlTextureProvider) Rasteriser.textureProvider).method3248(200);
			if (Preferences.highDetailLighting) {
				Rasteriser.setBrightness(0.7F);
			}
			Static114.method4637();
		} else if (arg1 == 0 && arg3 > 0) {
			GameShell.thread.setPriority(1);
			client.frameBuffer = Static131.create(503, 765, GameShell.canvas);
			Static268.method4583();
			Static76.method1643();
			((Js5GlTextureProvider) Rasteriser.textureProvider).method3248(20);
			if (Preferences.highDetailLighting) {
				if (Preferences.brightness == 1) {
					Rasteriser.setBrightness(0.9F);
				}
				if (Preferences.brightness == 2) {
					Rasteriser.setBrightness(0.8F);
				}
				if (Preferences.brightness == 3) {
					Rasteriser.setBrightness(0.7F);
				}
				if (Preferences.brightness == 4) {
					Rasteriser.setBrightness(0.6F);
				}
			}
			Static95.method1939();
			Static114.method4637();
		}
		Static87.aBoolean130 = !SceneGraph.allLevelsAreVisible();
		if (arg2) {
			Static141.method2721();
		}
		if (arg1 >= 2) {
			Static124.aBoolean156 = true;
		} else {
			Static124.aBoolean156 = false;
		}
		if (InterfaceList.topLevelInterface != -1) {
			Static210.method3712(true);
		}
		if (Protocol.socket != null && (client.gameState == 30 || client.gameState == 25)) {
			Static59.method1373();
		}
		for (@Pc(466) int local466 = 0; local466 < 100; local466++) {
			Static186.aBooleanArray100[local466] = true;
		}
		GameShell.fullRedraw = true;
	}
}
