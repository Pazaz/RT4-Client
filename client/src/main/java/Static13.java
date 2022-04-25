import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
	public static int anInt436;

	@OriginalMember(owner = "client!bc", name = "Z", descriptor = "I")
	public static int anInt437;

	@OriginalMember(owner = "client!bc", name = "I", descriptor = "Z")
	public static boolean aBoolean16 = false;

	@OriginalMember(owner = "client!bc", name = "N", descriptor = "Lclient!lb;")
	public static final Class3_Sub23 aClass3_Sub23_1 = new Class3_Sub23(0, 0);

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "(B)Lclient!na;")
	public static JagString method471() {
		@Pc(32) JagString local32;
		if (Static260.anInt5014 == 1 && Static231.anInt5204 < 2) {
			local32 = JagString.concatenate(new JagString[] { LocalizedText.USE, LocalizedText.MINISEPARATOR, Static34.aClass100_203, Static225.aClass100_961 });
		} else if (Static241.aBoolean302 && Static231.anInt5204 < 2) {
			local32 = JagString.concatenate(new JagString[] { Static102.aClass100_545, LocalizedText.MINISEPARATOR, Static78.aClass100_466, Static225.aClass100_961 });
		} else if (Cheat.shiftClick && Keyboard.pressedKeys[Keyboard.KEY_SHIFT] && Static231.anInt5204 > 2) {
			local32 = Static269.method2228(Static231.anInt5204 - 2);
		} else {
			local32 = Static269.method2228(Static231.anInt5204 - 1);
		}
		if (Static231.anInt5204 > 2) {
			local32 = JagString.concatenate(new JagString[] { local32, Static1.aClass100_2, Static123.parseInt(Static231.anInt5204 - 2), LocalizedText.MOREOPTIONS});
		}
		return local32;
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(II)V")
	public static void method472(@OriginalArg(0) int arg0) {
		@Pc(14) Inv local14 = (Inv) Static20.objectContainerCache.get((long) arg0);
		if (local14 != null) {
			local14.unlink();
		}
	}

}
