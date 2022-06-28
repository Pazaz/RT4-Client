package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class LoadingBar {
	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BZLclient!rk;)V")
	public static void render(@OriginalArg(1) boolean arg0, @OriginalArg(2) Font arg1) {
		@Pc(9) int local9;
		if (GlRenderer.enabled || arg0) {
			local9 = GameShell.canvasHeight;
			@Pc(15) int local15 = local9 * 956 / 503;
			TitleScreen.titleBg.renderResized((GameShell.canvasWidth - local15) / 2, 0, local15, local9);
			TitleScreen.logo.renderTransparent(GameShell.canvasWidth / 2 - TitleScreen.logo.width / 2, 18);
		}
		arg1.renderCenter(LocalizedText.GAME0_LOADING, GameShell.canvasWidth / 2, GameShell.canvasHeight / 2 - 26, 16777215, -1);
		local9 = GameShell.canvasHeight / 2 - 18;
		if (GlRenderer.enabled) {
			GlRaster.drawRect(GameShell.canvasWidth / 2 - 152, local9, 304, 34, 9179409);
			GlRaster.drawRect(GameShell.canvasWidth / 2 - 151, local9 - -1, 302, 32, 0);
			GlRaster.fillRect(GameShell.canvasWidth / 2 - 150, local9 + 2, client.mainLoadPercentage * 3, 30, 9179409);
			GlRaster.fillRect(GameShell.canvasWidth / 2 + client.mainLoadPercentage * 3 - 150, local9 + 2, 300 - client.mainLoadPercentage * 3, 30, 0);
		} else {
			SoftwareRaster.drawRect(GameShell.canvasWidth / 2 - 152, local9, 304, 34, 9179409);
			SoftwareRaster.drawRect(GameShell.canvasWidth / 2 - 151, local9 + 1, 302, 32, 0);
			SoftwareRaster.fillRect(GameShell.canvasWidth / 2 - 150, local9 + 2, client.mainLoadPercentage * 3, 30, 9179409);
			SoftwareRaster.fillRect(client.mainLoadPercentage * 3 + GameShell.canvasWidth / 2 - 150, local9 + 2, 300 - client.mainLoadPercentage * 3, 30, 0);
		}
		arg1.renderCenter(client.mainLoadSecondaryText, GameShell.canvasWidth / 2, GameShell.canvasHeight / 2 + 4, 16777215, -1);
	}
}
