package rt4;

import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

    @OriginalMember(owner = "client!j", name = "O", descriptor = "[I")
	public static final int[] anIntArray565 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BZLclient!na;)V")
	public static void drawTextOnScreen(@OriginalArg(1) boolean arg0, @OriginalArg(2) JagString arg1) {
		@Pc(24) int local24 = Fonts.p12Full.getMaxLineWidth(arg1, 250);
		@Pc(31) int local31 = Fonts.p12Full.getParagraphLineCount(arg1, 250) * 13;
		if (GlRenderer.enabled) {
			GlRaster.method1186(6, 6, local24 + 4 + 4, local31 + 8, 0);
			GlRaster.method1179(6, 6, local24 + 4 + 4, local31 + 4 + 4, 16777215);
		} else {
			SoftwareRaster.fillRect(6, 6, local24 + 4 + 4, local31 + 8, 0);
			SoftwareRaster.drawRect(6, 6, local24 + 8, 4 + 4 + local31, 16777215);
		}
		Fonts.p12Full.method2852(arg1, 10, 10, local24, local31, 16777215, -1, 1, 1, 0);
		Static133.method4012(6, local24 + 8, 6, local31 + 4 + 4);
		if (!arg0) {
			Static121.method2407(10, 10, local31, local24);
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
