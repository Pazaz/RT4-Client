package rt4;

import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!j", name = "z", descriptor = "Lclient!na;")
	public static final JagString aClass100_1099 = JagString.parse("::shiftclick");

	@OriginalMember(owner = "client!j", name = "K", descriptor = "I")
	public static int anInt5843 = 0;

	@OriginalMember(owner = "client!j", name = "M", descriptor = "Lclient!na;")
	public static final JagString aClass100_1100 = JagString.parse("::replacecanvas");

	@OriginalMember(owner = "client!j", name = "O", descriptor = "[I")
	public static final int[] anIntArray565 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
	public static void method4625() {
		Static204.aClass69_113 = new LinkedList();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([BI)Lclient!dd;")
	public static SoftwareFont method4635(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(22) SoftwareFont local22 = new SoftwareFont(arg0, SpriteLoader.xOffsets, SpriteLoader.yOffsets, SpriteLoader.innerWidths, SpriteLoader.innerHeights, SpriteLoader.pixels);
			SpriteLoader.clear();
			return local22;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BZLclient!na;)V")
	public static void drawTextOnScreen(@OriginalArg(1) boolean arg0, @OriginalArg(2) JagString arg1) {
		@Pc(24) int local24 = Fonts.p12Full.method2856(arg1, 250);
		@Pc(31) int local31 = Fonts.p12Full.getParagraphLineCount(arg1, 250) * 13;
		if (GlRenderer.enabled) {
			Static46.method1186(6, 6, local24 + 4 + 4, local31 + 8, 0);
			Static46.method1179(6, 6, local24 + 4 + 4, local31 + 4 + 4, 16777215);
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

	@OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V")
	public static void method4637() {
		Static165.aClass3_Sub2_Sub1_8 = null;
		Static39.aClass3_Sub2_Sub1_1 = null;
		Static92.aClass3_Sub2_Sub1_6 = null;
		Static181.aClass3_Sub2_Sub1_9 = null;
		Static204.aClass3_Sub2_Sub1_10 = null;
	}
}
