import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!ej", name = "X", descriptor = "I")
	public static int anInt1815;

	@OriginalMember(owner = "client!ej", name = "bb", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!ej", name = "U", descriptor = "I")
	public static int anInt1812 = 0;

	@OriginalMember(owner = "client!ej", name = "W", descriptor = "I")
	public static int anInt1814 = 0;

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "(I)V")
	public static void method1372() {
		if (Static226.anInt3953 == 2) {
			if (Static155.anInt3751 == Static277.anInt5850 && Static60.anInt1892 == Static280.anInt5895) {
				Static226.anInt3953 = 0;
				if (Static172.shiftClick && Keyboard.pressedKeys[Keyboard.KEY_SHIFT] && Static231.anInt5204 > 2) {
					Static103.method2232(Static231.anInt5204 - 2);
				} else {
					Static103.method2232(Static231.anInt5204 - 1);
				}
			}
		} else if (Static155.anInt3751 == Mouse.clickX && Static60.anInt1892 == Mouse.clickY) {
			Static226.anInt3953 = 0;
			if (Static172.shiftClick && Keyboard.pressedKeys[Keyboard.KEY_SHIFT] && Static231.anInt5204 > 2) {
				Static103.method2232(Static231.anInt5204 - 2);
			} else {
				Static103.method2232(Static231.anInt5204 - 1);
			}
		} else {
			Static280.anInt5895 = Mouse.clickY;
			Static226.anInt3953 = 2;
			Static277.anInt5850 = Mouse.clickX;
		}
	}

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "(I)V")
	public static void method1373() {
		Protocol.outboundBuffer.p1isaac(243);
		Protocol.outboundBuffer.p1(Static144.getWindowMode());
		Protocol.outboundBuffer.p2(GameShell.canvasWidth);
		Protocol.outboundBuffer.p2(GameShell.canvasHeight);
		Protocol.outboundBuffer.p1(Preferences.antiAliasingMode);
	}

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZIJ)Lclient!na;")
	public static JagString method1376(@OriginalArg(3) long arg0) {
		@Pc(35) long local35 = arg0 / (long) 10;
		@Pc(37) int local37 = 1;
		while (local35 != 0L) {
			local37++;
			local35 /= 10;
		}
		@Pc(51) int local51 = local37;
		if (arg0 < 0L) {
			local51 = local37 + 1;
		}
		@Pc(61) byte[] local61 = new byte[local51];
		if (arg0 < 0L) {
			local61[0] = 45;
		}
		for (@Pc(79) int local79 = 0; local79 < local37; local79++) {
			@Pc(92) int local92 = (int) (arg0 % (long) 10);
			arg0 /= 10;
			if (local92 < 0) {
				local92 = -local92;
			}
			if (local92 > 9) {
				local92 += 39;
			}
			local61[local51 - local79 - 1] = (byte) (local92 + 48);
		}
		@Pc(126) JagString local126 = new JagString();
		local126.chars = local61;
		local126.length = local51;
		return local126;
	}
}
