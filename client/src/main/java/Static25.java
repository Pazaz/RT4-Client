import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!c", name = "bb", descriptor = "[Lclient!ec;")
	public static Class31[] aClass31Array2;

	@OriginalMember(owner = "client!c", name = "W", descriptor = "Lclient!na;")
	private static final Class100 aClass100_153 = Static28.method790(" has logged in)3");

	@OriginalMember(owner = "client!c", name = "Y", descriptor = "Lclient!na;")
	public static final Class100 aClass100_154 = Static28.method790("Mem:");

	@OriginalMember(owner = "client!c", name = "Z", descriptor = "Lclient!na;")
	public static Class100 aClass100_155 = aClass100_153;

	@OriginalMember(owner = "client!c", name = "eb", descriptor = "I")
	public static int anInt826 = 0;

	@OriginalMember(owner = "client!c", name = "hb", descriptor = "Z")
	public static boolean aBoolean57 = false;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)Z")
	public static boolean method712() {
		@Pc(6) Class149 local6 = Static10.aClass149_1;
		synchronized (Static10.aClass149_1) {
			if (Static228.anInt5105 == Static102.anInt2678) {
				return false;
			} else {
				Static102.anInt2681 = Static221.anIntArray375[Static102.anInt2678];
				Static193.anInt4542 = Static264.anIntArray413[Static102.anInt2678];
				Static102.anInt2678 = Static102.anInt2678 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/awt/Frame;ZLsignlink!ll;)V")
	public static void method714(@OriginalArg(0) Frame arg0, @OriginalArg(2) Class213 arg1) {
		while (true) {
			@Pc(16) Class212 local16 = arg1.method5115(arg0);
			while (local16.anInt5925 == 0) {
				Static231.method3983(10L);
			}
			if (local16.anInt5925 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static231.method3983(100L);
		}
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(II)V")
	public static void method715() {
		Static220.aClass99_28.method3102(5);
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(II)V")
	public static void method716() {
		Static79.aClass99_11.method3102(5);
		Static7.aClass99_5.method3102(5);
	}
}
