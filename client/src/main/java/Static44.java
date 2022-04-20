import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
	public static int anInt1404;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "Z")
	public static boolean aBoolean83 = false;

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "[I")
	public static final int[] anIntArray106 = new int[2048];

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "Lclient!na;")
	public static final JagString aClass100_335 = Static28.parse("Number of player models in cache:");

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "Lclient!na;")
	public static final JagString aClass100_336 = Static28.parse("<img=1>");

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
	public static void method1146() {
		Static6.outboundBuffer.offset = 0;
		Static5.anInt45 = -1;
		Static60.aBoolean108 = false;
		Static223.anInt5028 = 0;
		Static115.anInt2939 = 0;
		Static231.anInt5204 = 0;
		Static230.anInt5152 = -1;
		Static270.anInt5795 = 0;
		Static60.rebootTimer = 0;
		Static49.anInt1462 = -1;
		Static57.aClass3_Sub15_Sub1_3.offset = 0;
		Static201.anInt1862 = 0;
		Static164.anInt3985 = -1;
		@Pc(35) int local35;
		for (local35 = 0; local35 < Static159.aClass8_Sub4_Sub1Array1.length; local35++) {
			if (Static159.aClass8_Sub4_Sub1Array1[local35] != null) {
				Static159.aClass8_Sub4_Sub1Array1[local35].anInt3370 = -1;
			}
		}
		for (local35 = 0; local35 < Static175.aClass8_Sub4_Sub2Array1.length; local35++) {
			if (Static175.aClass8_Sub4_Sub2Array1[local35] != null) {
				Static175.aClass8_Sub4_Sub2Array1[local35].anInt3370 = -1;
			}
		}
		Static102.method2073();
		Static227.anInt5096 = 1;
		Static196.method3534(30);
		for (local35 = 0; local35 < 100; local35++) {
			Static186.aBooleanArray100[local35] = true;
		}
		Static59.method1373();
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)Lclient!q;")
	public static ReferenceNodeFactory method1147() {
		try {
			return (ReferenceNodeFactory) Class.forName("SoftReferenceNodeFactory").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIII)Lclient!wk;")
	public static Class3_Sub31 method1148(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class3_Sub31 local9 = new Class3_Sub31();
		local9.anInt5879 = arg2;
		local9.anInt5878 = arg0;
		Static119.aClass133_9.method3862(local9, (long) arg1);
		Static81.method1753(arg0);
		@Pc(28) Component local28 = Static5.getComponent(arg1);
		if (local28 != null) {
			Static43.method1143(local28);
		}
		if (Static39.aClass13_10 != null) {
			Static43.method1143(Static39.aClass13_10);
			Static39.aClass13_10 = null;
		}
		@Pc(45) int local45 = Static231.anInt5204;
		@Pc(53) int local53;
		for (local53 = 0; local53 < local45; local53++) {
			if (Static2.method5(Static39.aShortArray6[local53])) {
				Static200.method3628(local53);
			}
		}
		if (Static231.anInt5204 == 1) {
			Static60.aBoolean108 = false;
			Static133.method4012(Static183.anInt4271, Static24.anInt761, Static229.anInt5138, Static13.anInt436);
		} else {
			Static133.method4012(Static183.anInt4271, Static24.anInt761, Static229.anInt5138, Static13.anInt436);
			local53 = Static280.aClass3_Sub2_Sub9_43.method2858(LocalizedText.CHOOSE_OPTION);
			for (@Pc(95) int local95 = 0; local95 < Static231.anInt5204; local95++) {
				@Pc(104) int local104 = Static280.aClass3_Sub2_Sub9_43.method2858(Static269.method2228(local95));
				if (local104 > local53) {
					local53 = local104;
				}
			}
			Static24.anInt761 = local53 + 8;
			Static13.anInt436 = Static231.anInt5204 * 15 + (Static261.aBoolean298 ? 26 : 22);
		}
		if (local28 != null) {
			Static17.method531(local28, false);
		}
		Static74.method1626(arg0);
		if (Static154.topLevelInterace != -1) {
			Static54.method1304(1, Static154.topLevelInterace);
		}
		return local9;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!na;I)V")
	public static void method1149(@OriginalArg(0) JagString arg0) {
		@Pc(7) int local7 = Static91.method1879(arg0);
		if (local7 != -1) {
			Static80.method3616(Static203.aClass134_1.aShortArray73[local7], Static203.aClass134_1.aShortArray72[local7]);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)Lclient!uc;")
	public static MouseWheel create() {
		try {
			return (MouseWheel) Class.forName("JavaMouseWheel").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}
}
