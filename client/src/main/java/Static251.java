import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "[I")
	public static int[] anIntArray479;

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
	public static int anInt5449;

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
	public static int anInt5457;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "[F")
	public static final float[] aFloatArray28 = new float[4];

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
	public static int anInt5447 = 0;

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
	public static int anInt5454 = 0;

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
	public static int anInt5456 = 0;

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
	public static int anInt5459 = 0;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
	public static void loop() {
		for (@Pc(10) Class3_Sub7 local10 = (Class3_Sub7) Static26.aClass69_27.method2289(); local10 != null; local10 = (Class3_Sub7) Static26.aClass69_27.method2288()) {
			if (local10.anInt924 > 0) {
				local10.anInt924--;
			}
			if (local10.anInt924 != 0) {
				if (local10.anInt925 > 0) {
					local10.anInt925--;
				}
				if (local10.anInt925 == 0 && local10.anInt928 >= 1 && local10.anInt916 >= 1 && local10.anInt928 <= 102 && local10.anInt916 <= 102 && (local10.anInt929 < 0 || Static113.method3557(local10.anInt929, local10.anInt926))) {
					Static79.method1698(local10.anInt929, local10.anInt928, local10.anInt918, local10.anInt922, local10.anInt916, local10.anInt926, local10.anInt927);
					local10.anInt925 = -1;
					if (local10.anInt921 == local10.anInt929 && local10.anInt921 == -1) {
						local10.method4658();
					} else if (local10.anInt929 == local10.anInt921 && local10.anInt922 == local10.anInt923 && local10.anInt920 == local10.anInt926) {
						local10.method4658();
					}
				}
			} else if (local10.anInt921 < 0 || Static113.method3557(local10.anInt921, local10.anInt920)) {
				Static79.method1698(local10.anInt921, local10.anInt928, local10.anInt918, local10.anInt923, local10.anInt916, local10.anInt920, local10.anInt927);
				local10.method4658();
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V")
	public static void method4276() {
		Static45.aClass99_6.method3103();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
	public static void method4277() {
		if (Static93.aClass150_1 != null) {
			@Pc(5) Mouse local5 = Static93.aClass150_1;
			synchronized (Static93.aClass150_1) {
				Static93.aClass150_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V")
	public static void method4278(@OriginalArg(0) int arg0) {
		if (Static241.anIntArray522 == null || Static241.anIntArray522.length < arg0) {
			Static241.anIntArray522 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)V")
	public static void method4279(@OriginalArg(0) int arg0) {
		@Pc(14) DelayedStateChange local14 = Static238.method4143(9, arg0);
		local14.method1007();
	}
}
