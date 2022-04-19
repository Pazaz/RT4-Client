import java.awt.event.ActionEvent;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!la", name = "i", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "Lclient!ce;")
	public static final Class16 aClass16_7 = new Class16();

	@OriginalMember(owner = "client!la", name = "g", descriptor = "Lclient!na;")
	public static final Class100 aClass100_660 = Static28.method790(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!la", name = "k", descriptor = "Lclient!na;")
	public static final Class100 aClass100_661 = Static28.method790("Chargement du module texte )2 ");

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!wa;Z)V")
	public static void method2705(@OriginalArg(0) Class3_Sub15 arg0) {
		@Pc(15) byte[] local15 = new byte[24];
		if (Static121.aClass38_3 != null) {
			try {
				Static121.aClass38_3.method1459(0L);
				Static121.aClass38_3.method1457(local15);
				@Pc(28) int local28;
				for (local28 = 0; local28 < 24 && local15[local28] == 0; local28++) {
				}
				if (local28 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(55) Exception local55) {
				for (@Pc(57) int local57 = 0; local57 < 24; local57++) {
					local15[local57] = -1;
				}
			}
		}
		arg0.method2179(local15, 24);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!e;)I")
	public static int method2706(@OriginalArg(1) Class8_Sub4_Sub1 arg0) {
		@Pc(14) int local14 = arg0.anInt1654;
		@Pc(18) Class20 local18 = arg0.method2681();
		if (local18.anInt1037 == arg0.anInt3366) {
			local14 = arg0.anInt1648;
		} else if (local18.anInt1058 == arg0.anInt3366 || arg0.anInt3366 == local18.anInt1054 || arg0.anInt3366 == local18.anInt1045 || local18.anInt1043 == arg0.anInt3366) {
			local14 = arg0.anInt1670;
		} else if (arg0.anInt3366 == local18.anInt1062 || arg0.anInt3366 == local18.anInt1042 || arg0.anInt3366 == local18.anInt1048 || arg0.anInt3366 == local18.anInt1066) {
			local14 = arg0.anInt1658;
		}
		return local14;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IJ)V")
	public static void method2707(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static35.anInt1093 >= 100) {
			Static103.method2231(Static186.aClass100_827, 0, Static246.aClass100_1028);
			return;
		}
		@Pc(34) Class100 local34 = Static79.method1702(arg0).method3125();
		@Pc(36) int local36;
		for (local36 = 0; local36 < Static35.anInt1093; local36++) {
			if (Static190.aLongArray6[local36] == arg0) {
				Static103.method2231(Static186.aClass100_827, 0, Static34.method882(new Class100[] { local34, Static184.aClass100_820 }));
				return;
			}
		}
		for (local36 = 0; local36 < Static9.anInt178; local36++) {
			if (Static92.aLongArray3[local36] == arg0) {
				Static103.method2231(Static186.aClass100_827, 0, Static34.method882(new Class100[] { Static71.aClass100_418, local34, Static197.aClass100_873 }));
				return;
			}
		}
		if (local34.method3108(Static173.aClass8_Sub4_Sub1_2.aClass100_364)) {
			Static103.method2231(Static186.aClass100_827, 0, Static165.aClass100_774);
			return;
		}
		Static190.aLongArray6[Static35.anInt1093] = arg0;
		Static193.aClass100Array134[Static35.anInt1093++] = Static79.method1702(arg0);
		Static185.anInt4369 = Static119.anInt3028;
		Static6.aClass3_Sub15_Sub1_1.method2242(34);
		Static6.aClass3_Sub15_Sub1_1.method2166(arg0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lsignlink!ll;Ljava/lang/Object;I)V")
	public static void method2708(@OriginalArg(0) Class213 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 50 && arg0.anEventQueue1.peekEvent() != null; local19++) {
			Static231.method3983(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Lclient!ic;")
	public static Class65 method2709(@OriginalArg(1) int arg0) {
		@Pc(10) Class65 local10 = (Class65) Static220.aClass99_28.method3106((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static85.aClass153_36.method4495(31, arg0);
		local10 = new Class65();
		if (local26 != null) {
			local10.method2257(new Class3_Sub15(local26), arg0);
		}
		Static220.aClass99_28.method3095(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!na;Lclient!ve;)Lclient!se;")
	public static Class134 method2711(@OriginalArg(1) Class100 arg0, @OriginalArg(2) Class153 arg1) {
		@Pc(10) int local10 = arg1.method4482(arg0);
		if (local10 == -1) {
			return new Class134(0);
		}
		@Pc(29) int[] local29 = arg1.method4503(local10);
		@Pc(35) Class134 local35 = new Class134(local29.length);
		for (@Pc(37) int local37 = 0; local37 < local35.anInt5074; local37++) {
			@Pc(56) Class3_Sub15 local56 = new Class3_Sub15(arg1.method4495(local10, local29[local37]));
			local35.aClass100Array153[local37] = local56.method2202();
			local35.aByteArray69[local37] = local56.method2186();
			local35.aShortArray73[local37] = (short) local56.method2163();
			local35.aShortArray72[local37] = (short) local56.method2163();
			local35.anIntArray444[local37] = local56.method2174();
		}
		return local35;
	}
}
