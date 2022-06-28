package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

public class Fonts {
	@OriginalMember(owner = "client!j", name = "x", descriptor = "Lclient!rk;")
	public static Font p11Full;
	@OriginalMember(owner = "client!rh", name = "h", descriptor = "Lclient!rk;")
	public static Font p12Full;
	@OriginalMember(owner = "client!wl", name = "q", descriptor = "Lclient!rk;")
	public static Font b12Full;
	@OriginalMember(owner = "client!vj", name = "j", descriptor = "Lclient!dd;")
	public static SoftwareFont p11FullSoftware;

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

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)I")
	public static int getTotal() {
		return 6;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!ve;ILclient!ve;)V")
	public static void load(@OriginalArg(0) Js5 arg0, @OriginalArg(2) Js5 arg1) {
		p11Full = Font.method2462(Sprites.p11FullId, arg1, arg0);
		if (GlRenderer.enabled) {
			p11FullSoftware = SoftwareFont.method2412(Sprites.p11FullId, arg0, arg1);
		} else {
			p11FullSoftware = (SoftwareFont) p11Full;
		}
		p12Full = Font.method2462(Sprites.p12FullId, arg1, arg0);
		b12Full = Font.method2462(Sprites.b12FullId, arg1, arg0);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BZLclient!na;)V")
	public static void drawTextOnScreen(@OriginalArg(1) boolean arg0, @OriginalArg(2) JagString arg1) {
		@Pc(24) int local24 = p12Full.getMaxLineWidth(arg1, 250);
		@Pc(31) int local31 = p12Full.getParagraphLineCount(arg1, 250) * 13;
		if (GlRenderer.enabled) {
			GlRaster.fillRect(6, 6, local24 + 4 + 4, local31 + 8, 0);
			GlRaster.drawRect(6, 6, local24 + 4 + 4, local31 + 4 + 4, 16777215);
		} else {
			SoftwareRaster.fillRect(6, 6, local24 + 4 + 4, local31 + 8, 0);
			SoftwareRaster.drawRect(6, 6, local24 + 8, 4 + 4 + local31, 16777215);
		}
		p12Full.drawInterfaceText(arg1, 10, 10, local24, local31, 16777215, -1, 1, 1, 0);
		InterfaceList.redrawScreen(6, local24 + 8, 6, local31 + 4 + 4);
		if (!arg0) {
			InterfaceList.forceRedrawScreen(10, 10, local31, local24);
		} else if (GlRenderer.enabled) {
			GlRenderer.swapBuffers();
		} else {
			try {
				@Pc(159) Graphics local159 = GameShell.canvas.getGraphics();
				SoftwareRaster.frameBuffer.draw(local159);
			} catch (@Pc(167) Exception local167) {
				GameShell.canvas.repaint();
			}
		}
	}
}
