package rt4;

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
	public static final MonochromeImageCache_Class3_Sub23 aClass3_Sub23_1 = new MonochromeImageCache_Class3_Sub23(0, 0);

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "(B)Lclient!na;")
	public static JagString method471() {
		@Pc(32) JagString local32;
		if (Static260.anInt5014 == 1 && MiniMenu.size < 2) {
			local32 = JagString.concatenate(new JagString[] { LocalizedText.USE, LocalizedText.MINISEPARATOR, MiniMenu.aClass100_203, Static225.aClass100_961 });
		} else if (Static241.aBoolean302 && MiniMenu.size < 2) {
			local32 = JagString.concatenate(new JagString[] { MiniMenu.aClass100_545, LocalizedText.MINISEPARATOR, Static78.aClass100_466, Static225.aClass100_961 });
		} else if (Cheat.shiftClick && Keyboard.pressedKeys[Keyboard.KEY_SHIFT] && MiniMenu.size > 2) {
			local32 = MiniMenu.getOp(MiniMenu.size - 2);
		} else {
			local32 = MiniMenu.getOp(MiniMenu.size - 1);
		}
		if (MiniMenu.size > 2) {
			local32 = JagString.concatenate(new JagString[] { local32, Static1.aClass100_2, Static123.parseInt(MiniMenu.size - 2), LocalizedText.MOREOPTIONS});
		}
		return local32;
	}

}
