package rt4;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "Lclient!qf;")
	public static Sprite aClass3_Sub2_Sub1_6;
	@OriginalMember(owner = "client!d", name = "ib", descriptor = "Lclient!qf;")
	public static Sprite aClass3_Sub2_Sub1_1;
	@OriginalMember(owner = "client!oi", name = "h", descriptor = "Lclient!qf;")
	public static Sprite aClass3_Sub2_Sub1_9;
	@OriginalMember(owner = "client!qi", name = "z", descriptor = "Lclient!qf;")
	public static Sprite aClass3_Sub2_Sub1_10;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
	public static void method2297() {
		@Pc(3) int local3 = InterfaceList.anInt4271;
		@Pc(9) int local9 = InterfaceList.anInt5138;
		@Pc(11) int local11 = InterfaceList.anInt436;
		@Pc(13) int local13 = InterfaceList.anInt761;
		if (aClass3_Sub2_Sub1_1 == null || aClass3_Sub2_Sub1_9 == null) {
			if (client.js5Archive8.isFileReady(Static40.anInt1736) && client.js5Archive8.isFileReady(Static40.anInt4073)) {
				aClass3_Sub2_Sub1_1 = SoftwareSprite.loadSoftwareAlphaSprite(client.js5Archive8, Static40.anInt1736);
				aClass3_Sub2_Sub1_9 = SoftwareSprite.loadSoftwareAlphaSprite(client.js5Archive8, Static40.anInt4073);
				if (GlRenderer.enabled) {
					if (aClass3_Sub2_Sub1_1 instanceof SoftwareAlphaSprite) {
						aClass3_Sub2_Sub1_1 = new GlAlphaSprite((SoftwareSprite) aClass3_Sub2_Sub1_1);
					} else {
						aClass3_Sub2_Sub1_1 = new GlSprite((SoftwareSprite) aClass3_Sub2_Sub1_1);
					}
					if (aClass3_Sub2_Sub1_9 instanceof SoftwareAlphaSprite) {
						aClass3_Sub2_Sub1_9 = new GlAlphaSprite((SoftwareSprite) aClass3_Sub2_Sub1_9);
					} else {
						aClass3_Sub2_Sub1_9 = new GlSprite((SoftwareSprite) aClass3_Sub2_Sub1_9);
					}
				}
			} else if (GlRenderer.enabled) {
				GlRaster.fillRectAlpha(local3, local9, local13, 20, Static40.anInt1275, 256 - Static40.anInt2910);
			} else {
				SoftwareRaster.fillRectAlpha(local3, local9, local13, 20, Static40.anInt1275, 256 - Static40.anInt2910);
			}
		}
		@Pc(112) int local112;
		@Pc(114) int local114;
		if (aClass3_Sub2_Sub1_1 != null && aClass3_Sub2_Sub1_9 != null) {
			local112 = local13 / aClass3_Sub2_Sub1_1.width;
			for (local114 = 0; local114 < local112; local114++) {
				aClass3_Sub2_Sub1_1.render(local114 * aClass3_Sub2_Sub1_1.width + local3, local9);
			}
			aClass3_Sub2_Sub1_9.render(local3, local9);
			aClass3_Sub2_Sub1_9.renderHorizontalFlip(local3 + local13 - aClass3_Sub2_Sub1_9.width, local9);
		}
		Fonts.b12Full.renderLeft(LocalizedText.CHOOSE_OPTION, local3 + 3, local9 + 14, Static40.anInt4581, -1);
		if (GlRenderer.enabled) {
			GlRaster.fillRectAlpha(local3, local9 + 20, local13, local11 - 20, Static40.anInt1275, 256 - Static40.anInt2910);
		} else {
			SoftwareRaster.fillRectAlpha(local3, local9 + 20, local13, local11 - 20, Static40.anInt1275, 256 - Static40.anInt2910);
		}
		local114 = Mouse.lastMouseY;
		local112 = Mouse.lastMouseX;
		@Pc(203) int local203;
		@Pc(219) int local219;
		for (local203 = 0; local203 < MiniMenu.size; local203++) {
			local219 = (MiniMenu.size - local203 - 1) * 15 + local9 + 35;
			if (local3 < local112 && local112 < local3 + local13 && local114 > local219 - 13 && local114 < local219 + 3) {
				if (GlRenderer.enabled) {
					GlRaster.fillRectAlpha(local3, local219 - 13, local13, 16, Static40.anInt5457, 256 - Static40.anInt5208);
				} else {
					SoftwareRaster.fillRectAlpha(local3, local219 - 13, local13, 16, Static40.anInt5457, 256 - Static40.anInt5208);
				}
			}
		}
		if ((Static165.aClass3_Sub2_Sub1_8 == null || aClass3_Sub2_Sub1_6 == null || aClass3_Sub2_Sub1_10 == null) && client.js5Archive8.isFileReady(Static40.anInt2261) && client.js5Archive8.isFileReady(Static40.anInt3324) && client.js5Archive8.isFileReady(Static40.anInt5556)) {
			Static165.aClass3_Sub2_Sub1_8 = SoftwareSprite.loadSoftwareAlphaSprite(client.js5Archive8, Static40.anInt2261);
			aClass3_Sub2_Sub1_6 = SoftwareSprite.loadSoftwareAlphaSprite(client.js5Archive8, Static40.anInt3324);
			aClass3_Sub2_Sub1_10 = SoftwareSprite.loadSoftwareAlphaSprite(client.js5Archive8, Static40.anInt5556);
			if (GlRenderer.enabled) {
				if (Static165.aClass3_Sub2_Sub1_8 instanceof SoftwareAlphaSprite) {
					Static165.aClass3_Sub2_Sub1_8 = new GlAlphaSprite((SoftwareSprite) Static165.aClass3_Sub2_Sub1_8);
				} else {
					Static165.aClass3_Sub2_Sub1_8 = new GlSprite((SoftwareSprite) Static165.aClass3_Sub2_Sub1_8);
				}
				if (aClass3_Sub2_Sub1_6 instanceof SoftwareAlphaSprite) {
					aClass3_Sub2_Sub1_6 = new GlAlphaSprite((SoftwareSprite) aClass3_Sub2_Sub1_6);
				} else {
					aClass3_Sub2_Sub1_6 = new GlSprite((SoftwareSprite) aClass3_Sub2_Sub1_6);
				}
				if (aClass3_Sub2_Sub1_10 instanceof SoftwareAlphaSprite) {
					aClass3_Sub2_Sub1_10 = new GlAlphaSprite((SoftwareSprite) aClass3_Sub2_Sub1_10);
				} else {
					aClass3_Sub2_Sub1_10 = new GlSprite((SoftwareSprite) aClass3_Sub2_Sub1_10);
				}
			}
		}
		@Pc(418) int local418;
		if (Static165.aClass3_Sub2_Sub1_8 != null && aClass3_Sub2_Sub1_6 != null && aClass3_Sub2_Sub1_10 != null) {
			local203 = local13 / Static165.aClass3_Sub2_Sub1_8.width;
			for (local219 = 0; local219 < local203; local219++) {
				Static165.aClass3_Sub2_Sub1_8.render(local3 + Static165.aClass3_Sub2_Sub1_8.width * local219, local11 + local9 + -Static165.aClass3_Sub2_Sub1_8.height);
			}
			local219 = (local11 - 20) / aClass3_Sub2_Sub1_6.height;
			for (local418 = 0; local418 < local219; local418++) {
				aClass3_Sub2_Sub1_6.render(local3, local9 + local418 * aClass3_Sub2_Sub1_6.height + 20);
				aClass3_Sub2_Sub1_6.renderHorizontalFlip(local3 + local13 - aClass3_Sub2_Sub1_6.width, local9 + 20 + local418 * aClass3_Sub2_Sub1_6.height);
			}
			aClass3_Sub2_Sub1_10.render(local3, local11 + local9 - aClass3_Sub2_Sub1_10.height);
			aClass3_Sub2_Sub1_10.renderHorizontalFlip(local3 + local13 - aClass3_Sub2_Sub1_10.width, local9 - -local11 + -aClass3_Sub2_Sub1_10.height);
		}
		for (local203 = 0; local203 < MiniMenu.size; local203++) {
			local219 = (MiniMenu.size - local203 - 1) * 15 + local9 + 35;
			local418 = Static40.anInt4581;
			if (local3 < local112 && local13 + local3 > local112 && local219 - 13 < local114 && local114 < local219 + 3) {
				local418 = Static40.anInt5752;
			}
			Fonts.b12Full.renderLeft(MiniMenu.getOp(local203), local3 + 3, local219, local418, 0);
		}
		Static121.method2407(InterfaceList.anInt4271, InterfaceList.anInt5138, InterfaceList.anInt436, InterfaceList.anInt761);
	}

}
