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
	@OriginalMember(owner = "client!wb", name = "b", descriptor = "[I")
	public static int[] anIntArray562;
	@OriginalMember(owner = "client!nd", name = "y", descriptor = "Lclient!mm;")
	public static SoftwareSprite aClass3_Sub2_Sub1_Sub1_3;
	@OriginalMember(owner = "client!i", name = "ec", descriptor = "[I")
	public static int[] anIntArray254;
	@OriginalMember(owner = "client!t", name = "G", descriptor = "[Lclient!ek;")
	public static SoftwareIndexedSprite[] aClass36_Sub1Array1;
	@OriginalMember(owner = "client!hh", name = "r", descriptor = "[I")
	public static int[] anIntArray235;

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
		aClass36_Sub1Array1 = SpriteLoader.method3088(Flames.anInt3443, arg0);
		anIntArray235 = new int[256];
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
				anIntArray235[local97 + local15 * 64] = (int) local55 | (int) local48 << 8 | (int) local39 << 16;
				local48 += local80;
				local55 += local95;
				local39 += local62;
			}
		}
		for (local15 = 192; local15 < 255; local15++) {
			anIntArray235[local15] = Flames.anIntArray445[3];
		}
		anIntArray562 = new int[32768];
		anIntArray516 = new int[32768];
		method1545(null);
		anIntArray254 = new int[32768];
		anIntArray188 = new int[32768];
		aClass3_Sub2_Sub1_Sub1_3 = new SoftwareSprite(128, 254);
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

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLclient!ek;)V")
	public static void method1545(@OriginalArg(1) SoftwareIndexedSprite arg0) {
		@Pc(5) int local5;
		for (local5 = 0; local5 < anIntArray562.length; local5++) {
			anIntArray562[local5] = 0;
		}
		@Pc(36) int local36;
		for (local5 = 0; local5 < 5000; local5++) {
			local36 = (int) ((double) 256 * Math.random() * 128.0D);
			anIntArray562[local36] = (int) (Math.random() * 284.0D);
		}
		@Pc(66) int local66;
		@Pc(76) int local76;
		for (local5 = 0; local5 < 20; local5++) {
			for (local36 = 1; local36 < 255; local36++) {
				for (local66 = 1; local66 < 127; local66++) {
					local76 = local66 + (local36 << 7);
					anIntArray516[local76] = (anIntArray562[local76 + 128] + anIntArray562[local76 - 1] + anIntArray562[local76 + 1] + anIntArray562[local76 + -128]) / 4;
				}
			}
			@Pc(113) int[] local113 = anIntArray562;
			anIntArray562 = anIntArray516;
			anIntArray516 = local113;
		}
		if (arg0 == null) {
			return;
		}
		local5 = 0;
		for (local36 = 0; local36 < arg0.height; local36++) {
			for (local66 = 0; local66 < arg0.width; local66++) {
				if (arg0.aByteArray18[local5++] != 0) {
					local76 = arg0.anInt4280 + local66 + 16;
					@Pc(162) int local162 = arg0.anInt4273 + local36 + 16;
					@Pc(169) int local169 = local76 + (local162 << 7);
					anIntArray562[local169] = 0;
				}
			}
		}
	}
}
