import java.awt.event.ActionEvent;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!la", name = "i", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "Lclient!ce;")
	public static final SecondaryLinkedList aClass16_7 = new SecondaryLinkedList();

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!wa;Z)V")
	public static void method2705(@OriginalArg(0) Buffer arg0) {
		@Pc(15) byte[] local15 = new byte[24];
		if (Static121.uid != null) {
			try {
				Static121.uid.method1459(0L);
				Static121.uid.method1457(local15);
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
		arg0.pBytes(local15, 24);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!e;)I")
	public static int method2706(@OriginalArg(1) Player arg0) {
		@Pc(14) int local14 = arg0.anInt1654;
		@Pc(18) BasType local18 = arg0.method2681();
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
			Static103.method2231(Static186.aClass100_827, 0, LocalizedText.IGNORELISTFULL);
			return;
		}
		@Pc(34) JagString local34 = Static79.decode37(arg0).method3125();
		@Pc(36) int local36;
		for (local36 = 0; local36 < Static35.anInt1093; local36++) {
			if (Static190.aLongArray6[local36] == arg0) {
				Static103.method2231(Static186.aClass100_827, 0, Static34.method882(new JagString[] { local34, LocalizedText.IGNORELISTDUPE}));
				return;
			}
		}
		for (local36 = 0; local36 < Static9.anInt178; local36++) {
			if (Static92.aLongArray3[local36] == arg0) {
				Static103.method2231(Static186.aClass100_827, 0, Static34.method882(new JagString[] { LocalizedText.REMOVESOCIAL2, local34, LocalizedText.REMOVEFRIEND}));
				return;
			}
		}
		if (local34.method3108(Static173.self.aClass100_364)) {
			Static103.method2231(Static186.aClass100_827, 0, LocalizedText.IGNORECANTADDSELF);
			return;
		}
		Static190.aLongArray6[Static35.anInt1093] = arg0;
		Static193.aClass100Array134[Static35.anInt1093++] = Static79.decode37(arg0);
		Static185.anInt4369 = Static119.transmitTimer;
		Static6.outboundBuffer.p1isaac(34);
		Static6.outboundBuffer.p8(arg0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lsignlink!ll;Ljava/lang/Object;I)V")
	public static void method2708(@OriginalArg(0) SignLink arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 50 && arg0.anEventQueue1.peekEvent() != null; local19++) {
			Static231.sleep(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Lclient!ic;")
	public static LightType method2709(@OriginalArg(1) int arg0) {
		@Pc(10) LightType local10 = (LightType) Static220.aClass99_28.method3106((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static85.aClass153_36.method4495(31, arg0);
		local10 = new LightType();
		if (local26 != null) {
			local10.method2257(new Buffer(local26), arg0);
		}
		Static220.aClass99_28.method3095(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!na;Lclient!ve;)Lclient!se;")
	public static Class134 method2711(@OriginalArg(1) JagString arg0, @OriginalArg(2) Js5 arg1) {
		@Pc(10) int local10 = arg1.method4482(arg0);
		if (local10 == -1) {
			return new Class134(0);
		}
		@Pc(29) int[] local29 = arg1.method4503(local10);
		@Pc(35) Class134 local35 = new Class134(local29.length);
		for (@Pc(37) int local37 = 0; local37 < local35.anInt5074; local37++) {
			@Pc(56) Buffer local56 = new Buffer(arg1.method4495(local10, local29[local37]));
			local35.aClass100Array153[local37] = local56.gjstr();
			local35.aByteArray69[local37] = local56.g1s();
			local35.aShortArray73[local37] = (short) local56.g2();
			local35.aShortArray72[local37] = (short) local56.g2();
			local35.anIntArray444[local37] = local56.g4();
		}
		return local35;
	}
}
