package rt4;

import java.awt.Point;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!gg", name = "Z", descriptor = "I")
	public static int anInt2222;

	@OriginalMember(owner = "client!gg", name = "db", descriptor = "I")
	public static int anInt2225 = -1;

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(II)V")
	public static void method1750(@OriginalArg(0) int arg0) {
		if (!Preferences.cursorsEnabled) {
			arg0 = -1;
		}
		if (arg0 == Static115.anInt2941) {
			return;
		}
		if (arg0 != -1) {
			@Pc(24) CursorType local24 = CursorTypeList.get(arg0);
			@Pc(28) SoftwareSprite local28 = local24.getSprite();
			if (local28 == null) {
				arg0 = -1;
			} else {
				GameShell.signLink.setCursor(local28.method301(), local28.anInt1860, GameShell.canvas, new Point(local24.hotSpotX, local24.hotSpotY), local28.anInt1866);
				Static115.anInt2941 = arg0;
			}
		}
		if (arg0 == -1 && Static115.anInt2941 != -1) {
			GameShell.signLink.setCursor(null, -1, GameShell.canvas, new Point(), -1);
			Static115.anInt2941 = -1;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([[IZ)V")
	public static void method1751(@OriginalArg(0) int[][] arg0) {
		Static71.anIntArrayArray10 = arg0;
	}

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "(II)V")
	public static void method1753(@OriginalArg(0) int arg0) {
		if (!InterfaceList.load(arg0)) {
			return;
		}
		@Pc(15) Component[] local15 = InterfaceList.components[arg0];
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(29) Component local29 = local15[local17];
			if (local29 != null) {
				local29.anInt496 = 1;
				local29.anInt510 = 0;
				local29.anInt500 = 0;
			}
		}
	}

}
