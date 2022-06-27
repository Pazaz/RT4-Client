package rt4;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
	public static int anInt5084 = 0;
    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "I")
    public static int anInt3953 = 0;
    @OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
    public static int anInt5895 = 0;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
	public static void method3901() {
		@Pc(16) int local16 = Fonts.b12Full.getStringWidth(LocalizedText.CHOOSE_OPTION);
		@Pc(18) int local18;
		@Pc(27) int local27;
		for (local18 = 0; local18 < MiniMenu.size; local18++) {
			local27 = Fonts.b12Full.getStringWidth(MiniMenu.getOp(local18));
			if (local27 > local16) {
				local16 = local27;
			}
		}
		local18 = MiniMenu.size * 15 + 21;
		@Pc(43) int local43 = ScriptRunner.anInt1892;
		local16 += 8;
		local27 = ScriptRunner.anInt3751 - local16 / 2;
		if (local43 + local18 > GameShell.canvasHeight) {
			local43 = GameShell.canvasHeight - local18;
		}
		if (GameShell.canvasWidth < local27 + local16) {
			local27 = GameShell.canvasWidth - local16;
		}
		if (local27 < 0) {
			local27 = 0;
		}
		if (local43 < 0) {
			local43 = 0;
		}
		if (anInt3953 == 1) {
			if (ScriptRunner.anInt3751 == Mouse.anInt5850 && anInt5895 == ScriptRunner.anInt1892) {
				InterfaceList.anInt436 = MiniMenu.size * 15 + (Static40.aBoolean298 ? 26 : 22);
				anInt3953 = 0;
				InterfaceList.anInt5138 = local43;
				InterfaceList.anInt4271 = local27;
				Static40.aBoolean108 = true;
				InterfaceList.anInt761 = local16;
			}
		} else if (ScriptRunner.anInt3751 == Mouse.clickX && ScriptRunner.anInt1892 == Mouse.clickY) {
			InterfaceList.anInt4271 = local27;
			anInt3953 = 0;
			InterfaceList.anInt761 = local16;
			InterfaceList.anInt5138 = local43;
			InterfaceList.anInt436 = (Static40.aBoolean298 ? 26 : 22) + MiniMenu.size * 15;
			Static40.aBoolean108 = true;
		} else {
			anInt5895 = Mouse.clickY;
			Mouse.anInt5850 = Mouse.clickX;
			anInt3953 = 1;
		}
	}
}
