import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
	public static int anInt435;

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
			local32 = Static34.method882(new JagString[] { LocalizedText.USE, LocalizedText.MINISEPARATOR, Static34.aClass100_203, Static225.aClass100_961 });
		} else if (Static241.aBoolean302 && Static231.anInt5204 < 2) {
			local32 = Static34.method882(new JagString[] { Static102.aClass100_545, LocalizedText.MINISEPARATOR, Static78.aClass100_466, Static225.aClass100_961 });
		} else if (Static172.shiftClick && Static187.pressedKeys[81] && Static231.anInt5204 > 2) {
			local32 = Static269.method2228(Static231.anInt5204 - 2);
		} else {
			local32 = Static269.method2228(Static231.anInt5204 - 1);
		}
		if (Static231.anInt5204 > 2) {
			local32 = Static34.method882(new JagString[] { local32, Static1.aClass100_2, Static123.method2423(Static231.anInt5204 - 2), LocalizedText.MOREOPTIONS});
		}
		return local32;
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(II)V")
	public static void method472(@OriginalArg(0) int arg0) {
		@Pc(14) Inv local14 = (Inv) Static20.aClass133_2.method3863((long) arg0);
		if (local14 != null) {
			local14.method4658();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/Color;ZZLclient!na;I)V")
	public static void method473(@OriginalArg(0) Color arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) JagString arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(6) Graphics local6 = Static154.canvas.getGraphics();
			if (Static222.aFont1 == null) {
				Static222.aFont1 = new Font("Helvetica", 1, 13);
				Static240.aFontMetrics1 = Static154.canvas.getFontMetrics(Static222.aFont1);
			}
			if (arg1) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static48.anInt1448, Static254.anInt5554);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (Static149.anImage3 == null) {
					Static149.anImage3 = Static154.canvas.createImage(304, 34);
				}
				@Pc(56) Graphics local56 = Static149.anImage3.getGraphics();
				local56.setColor(arg0);
				local56.drawRect(0, 0, 303, 33);
				local56.fillRect(2, 2, arg3 * 3, 30);
				local56.setColor(Color.black);
				local56.drawRect(1, 1, 301, 31);
				local56.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
				local56.setFont(Static222.aFont1);
				local56.setColor(Color.white);
				arg2.method3112(22, (304 - arg2.method3155(Static240.aFontMetrics1)) / 2, local56);
				local6.drawImage(Static149.anImage3, Static48.anInt1448 / 2 - 152, Static254.anInt5554 / 2 + -18, null);
			} catch (@Pc(134) Exception local134) {
				@Pc(140) int local140 = Static48.anInt1448 / 2 - 152;
				@Pc(146) int local146 = Static254.anInt5554 / 2 - 18;
				local6.setColor(arg0);
				local6.drawRect(local140, local146, 303, 33);
				local6.fillRect(local140 + 2, local146 + 2, arg3 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local140 + 1, local146 - -1, 301, 31);
				local6.fillRect(arg3 * 3 + local140 + 2, local146 + 2, 300 - arg3 * 3, 30);
				local6.setFont(Static222.aFont1);
				local6.setColor(Color.white);
				arg2.method3112(local146 + 22, local140 + (-arg2.method3155(Static240.aFontMetrics1) + 304) / 2, local6);
			}
			if (Static278.mainLoadPrimaryText != null) {
				local6.setFont(Static222.aFont1);
				local6.setColor(Color.white);
				Static278.mainLoadPrimaryText.method3112(Static254.anInt5554 / 2 - 26, Static48.anInt1448 / 2 - Static278.mainLoadPrimaryText.method3155(Static240.aFontMetrics1) / 2, local6);
			}
		} catch (@Pc(252) Exception local252) {
			Static154.canvas.repaint();
		}
	}
}
