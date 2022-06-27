package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
	public static int anInt3502 = -1;
    @OriginalMember(owner = "client!vg", name = "e", descriptor = "[I")
    public static int[] anIntArray516;
    @OriginalMember(owner = "client!ri", name = "d", descriptor = "[I")
    public static int[] anIntArray188;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	public static void method2742() {
		if (client.gameState == 10 && GlRenderer.enabled) {
			client.setGameState(28);
		}
		if (client.gameState == 30) {
			client.setGameState(25);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!ve;)V")
	public static void method2743(@OriginalArg(1) Js5 arg0) {
		Static233.aClass36_Sub1Array1 = SpriteLoader.method3088(Flames.anInt3443, arg0);
		Static221.anIntArray235 = new int[256];
		@Pc(15) int local15;
		for (local15 = 0; local15 < 3; local15++) {
			@Pc(30) int local30 = Flames.anIntArray445[local15 + 1] >> 16 & 0xFF;
			@Pc(39) float local39 = (float) (Flames.anIntArray445[local15] >> 16 & 0xFF);
			@Pc(48) float local48 = (float) (Flames.anIntArray445[local15] >> 8 & 0xFF);
			@Pc(55) float local55 = (float) (Flames.anIntArray445[local15] & 0xFF);
			@Pc(62) float local62 = ((float) local30 - local39) / 64.0F;
			@Pc(72) int local72 = Flames.anIntArray445[local15 + 1] >> 8 & 0xFF;
			@Pc(80) float local80 = ((float) local72 - local48) / 64.0F;
			@Pc(88) int local88 = Flames.anIntArray445[local15 + 1] & 0xFF;
			@Pc(95) float local95 = ((float) local88 - local55) / 64.0F;
			for (@Pc(97) int local97 = 0; local97 < 64; local97++) {
				Static221.anIntArray235[local97 + local15 * 64] = (int) local55 | (int) local48 << 8 | (int) local39 << 16;
				local48 += local80;
				local55 += local95;
				local39 += local62;
			}
		}
		for (local15 = 192; local15 < 255; local15++) {
			Static221.anIntArray235[local15] = Flames.anIntArray445[3];
		}
		Static267.anIntArray562 = new int[32768];
		anIntArray516 = new int[32768];
		Static69.method1545(null);
		Static103.anIntArray254 = new int[32768];
		anIntArray188 = new int[32768];
		Static221.aClass3_Sub2_Sub1_Sub1_3 = new SoftwareSprite(128, 254);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
	public static void method2744() {
		@Pc(3) int local3 = InterfaceList.anInt5138;
		@Pc(9) int local9 = InterfaceList.anInt761;
		@Pc(11) int local11 = InterfaceList.anInt4271;
		@Pc(15) int local15 = InterfaceList.anInt436;
		if (GlRenderer.enabled) {
			GlRaster.method1186(local11, local3, local9, local15, 6116423);
			GlRaster.method1186(local11 + 1, local3 + 1, local9 - 2, 16, 0);
			GlRaster.method1179(local11 + 1, local3 + 18, local9 - 2, local15 + -19, 0);
		} else {
			SoftwareRaster.fillRect(local11, local3, local9, local15, 6116423);
			SoftwareRaster.fillRect(local11 + 1, local3 + 1, local9 - 2, 16, 0);
			SoftwareRaster.drawRect(local11 + 1, local3 + 18, local9 - 2, local15 + -19, 0);
		}
		Fonts.b12Full.renderLeft(LocalizedText.CHOOSE_OPTION, local11 + 3, local3 + 14, 6116423, -1);
		@Pc(96) int local96 = Mouse.lastMouseY;
		@Pc(98) int local98 = Mouse.lastMouseX;
		for (@Pc(107) int local107 = 0; local107 < MiniMenu.size; local107++) {
			@Pc(127) int local127 = (MiniMenu.size - local107 - 1) * 15 + local3 + 31;
			@Pc(129) int local129 = 16777215;
			if (local11 < local98 && local98 < local11 + local9 && local127 - 13 < local96 && local96 < local127 + 3) {
				local129 = 16776960;
			}
			Fonts.b12Full.renderLeft(MiniMenu.getOp(local107), local11 + 3, local127, local129, 0);
		}
		Static121.method2407(InterfaceList.anInt4271, InterfaceList.anInt5138, InterfaceList.anInt436, InterfaceList.anInt761);
	}

}
