package rt4;

import org.openrs2.deob.annotation.OriginalMember;

public final class Static59 {

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "(I)V")
	public static void method1372() {
		if (Static226.anInt3953 == 2) {
			if (ScriptRunner.anInt3751 == Mouse.anInt5850 && ScriptRunner.anInt1892 == Static226.anInt5895) {
				Static226.anInt3953 = 0;
				if (Cheat.shiftClick && Keyboard.pressedKeys[Keyboard.KEY_SHIFT] && MiniMenu.size > 2) {
					MiniMenu.doAction(MiniMenu.size - 2);
				} else {
					MiniMenu.doAction(MiniMenu.size - 1);
				}
			}
		} else if (ScriptRunner.anInt3751 == Mouse.clickX && ScriptRunner.anInt1892 == Mouse.clickY) {
			Static226.anInt3953 = 0;
			if (Cheat.shiftClick && Keyboard.pressedKeys[Keyboard.KEY_SHIFT] && MiniMenu.size > 2) {
				MiniMenu.doAction(MiniMenu.size - 2);
			} else {
				MiniMenu.doAction(MiniMenu.size - 1);
			}
		} else {
			Static226.anInt5895 = Mouse.clickY;
			Static226.anInt3953 = 2;
			Mouse.anInt5850 = Mouse.clickX;
		}
	}

}
