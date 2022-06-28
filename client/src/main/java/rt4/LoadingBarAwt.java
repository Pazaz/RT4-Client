package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.Font;
import java.awt.*;

public class LoadingBarAwt {
	@OriginalMember(owner = "client!tg", name = "a", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics fontMetrics;

	@OriginalMember(owner = "client!lj", name = "y", descriptor = "Ljava/awt/Image;")
	public static Image loadingBar;

	@OriginalMember(owner = "client!sa", name = "R", descriptor = "Ljava/awt/Font;")
	public static Font font;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/Color;ZZLclient!na;I)V")
	public static void render(@OriginalArg(0) Color color, @OriginalArg(2) boolean redraw, @OriginalArg(3) JagString text, @OriginalArg(4) int arg3) {
		try {
			@Pc(6) Graphics g = GameShell.canvas.getGraphics();
			if (font == null) {
				font = new Font("Helvetica", 1, 13);
				fontMetrics = GameShell.canvas.getFontMetrics(font);
			}
			if (redraw) {
				g.setColor(Color.black);
				g.fillRect(0, 0, GameShell.canvasWidth, GameShell.canvasHeight);
			}
			if (color == null) {
				color = new Color(140, 17, 17);
			}
			try {
				if (loadingBar == null) {
					loadingBar = GameShell.canvas.createImage(304, 34);
				}
				@Pc(56) Graphics loadingBarGraphics = loadingBar.getGraphics();
				loadingBarGraphics.setColor(color);
				loadingBarGraphics.drawRect(0, 0, 303, 33);
				loadingBarGraphics.fillRect(2, 2, arg3 * 3, 30);
				loadingBarGraphics.setColor(Color.black);
				loadingBarGraphics.drawRect(1, 1, 301, 31);
				loadingBarGraphics.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
				loadingBarGraphics.setFont(font);
				loadingBarGraphics.setColor(Color.white);
				text.drawString(22, (304 - text.stringWidth(fontMetrics)) / 2, loadingBarGraphics);
				g.drawImage(loadingBar, GameShell.canvasWidth / 2 - 152, GameShell.canvasHeight / 2 + -18, null);
			} catch (@Pc(134) Exception ignored) {
				@Pc(140) int x = GameShell.canvasWidth / 2 - 152;
				@Pc(146) int y = GameShell.canvasHeight / 2 - 18;
				g.setColor(color);
				g.drawRect(x, y, 303, 33);
				g.fillRect(x + 2, y + 2, arg3 * 3, 30);
				g.setColor(Color.black);
				g.drawRect(x + 1, y - -1, 301, 31);
				g.fillRect(arg3 * 3 + x + 2, y + 2, 300 - arg3 * 3, 30);
				g.setFont(font);
				g.setColor(Color.white);
				text.drawString(y + 22, x + (-text.stringWidth(fontMetrics) + 304) / 2, g);
			}
			if (client.mainLoadPrimaryText != null) {
				g.setFont(font);
				g.setColor(Color.white);
				client.mainLoadPrimaryText.drawString(GameShell.canvasHeight / 2 - 26, GameShell.canvasWidth / 2 - client.mainLoadPrimaryText.stringWidth(fontMetrics) / 2, g);
			}
		} catch (@Pc(252) Exception ignored) {
			GameShell.canvas.repaint();
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
	public static void clear() {
		fontMetrics = null;
		font = null;
		loadingBar = null;
	}
}
