import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!qg", name = "R", descriptor = "I")
	public static int anInt4741;

	@OriginalMember(owner = "client!qg", name = "ab", descriptor = "Lclient!ve;")
	public static Js5 aClass153_84;

	@OriginalMember(owner = "client!qg", name = "U", descriptor = "Lclient!na;")
	public static final JagString aClass100_891 = Static28.parse("");

	@OriginalMember(owner = "client!qg", name = "W", descriptor = "Z")
	public static boolean aBoolean233 = false;

	@OriginalMember(owner = "client!qg", name = "Y", descriptor = "[I")
	public static final int[] anIntArray424 = new int[5];

	@OriginalMember(owner = "client!qg", name = "Z", descriptor = "Lclient!na;")
	public static final JagString aClass100_892 = Static28.parse("mem=");

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "(I)V")
	public static void method3653() {
		Static231.aClass99_29.method3104();
		Static219.aClass99_27.method3104();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lsignlink!ll;Lclient!wa;IB)V")
	public static void method3654(@OriginalArg(0) SignLink arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(2) int arg2) {
		@Pc(17) ReflectionCheck local17 = new ReflectionCheck();
		local17.anInt1725 = arg1.g1();
		local17.anInt1732 = arg1.g4();
		local17.aClass212Array1 = new PrivilegedRequest[local17.anInt1725];
		local17.anIntArray138 = new int[local17.anInt1725];
		local17.aByteArrayArrayArray6 = new byte[local17.anInt1725][][];
		local17.aClass212Array2 = new PrivilegedRequest[local17.anInt1725];
		local17.anIntArray139 = new int[local17.anInt1725];
		local17.anIntArray137 = new int[local17.anInt1725];
		for (@Pc(59) int local59 = 0; local59 < local17.anInt1725; local59++) {
			try {
				@Pc(71) int local71 = arg1.g1();
				@Pc(93) String local93;
				@Pc(104) String local104;
				@Pc(95) int local95;
				if (local71 == 0 || local71 == 1 || local71 == 2) {
					local93 = new String(arg1.gjstr().method3148());
					local95 = 0;
					local104 = new String(arg1.gjstr().method3148());
					if (local71 == 1) {
						local95 = arg1.g4();
					}
					local17.anIntArray139[local59] = local71;
					local17.anIntArray137[local59] = local95;
					local17.aClass212Array2[local59] = arg0.method5126(local104, Static6.method85(local93));
				} else if (local71 == 3 || local71 == 4) {
					local93 = new String(arg1.gjstr().method3148());
					local104 = new String(arg1.gjstr().method3148());
					local95 = arg1.g1();
					@Pc(171) String[] local171 = new String[local95];
					for (@Pc(173) int local173 = 0; local173 < local95; local173++) {
						local171[local173] = new String(arg1.gjstr().method3148());
					}
					@Pc(193) byte[][] local193 = new byte[local95][];
					@Pc(210) int local210;
					if (local71 == 3) {
						for (@Pc(199) int local199 = 0; local199 < local95; local199++) {
							local210 = arg1.g4();
							local193[local199] = new byte[local210];
							arg1.gBytes(local210, local193[local199]);
						}
					}
					local17.anIntArray139[local59] = local71;
					@Pc(234) Class[] local234 = new Class[local95];
					for (local210 = 0; local210 < local95; local210++) {
						local234[local210] = Static6.method85(local171[local210]);
					}
					local17.aClass212Array1[local59] = arg0.method5122(Static6.method85(local93), local234, local104);
					local17.aByteArrayArrayArray6[local59] = local193;
				}
			} catch (@Pc(269) ClassNotFoundException local269) {
				local17.anIntArray138[local59] = -1;
			} catch (@Pc(276) SecurityException local276) {
				local17.anIntArray138[local59] = -2;
			} catch (@Pc(283) NullPointerException local283) {
				local17.anIntArray138[local59] = -3;
			} catch (@Pc(290) Exception local290) {
				local17.anIntArray138[local59] = -4;
			} catch (@Pc(297) Throwable local297) {
				local17.anIntArray138[local59] = -5;
			}
		}
		Static204.aClass69_113.method2282(local17);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZI)V")
	public static void method3655(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class85 local7 = Static125.method2449(arg0);
		@Pc(10) int local10 = local7.anInt3323;
		@Pc(16) int local16 = local7.anInt3318;
		@Pc(19) int local19 = local7.anInt3327;
		@Pc(25) int local25 = Class3_Sub9.anIntArray135[local10 - local16];
		if (arg1 < 0 || arg1 > local25) {
			arg1 = 0;
		}
		local25 <<= local16;
		Static148.method2766(local19, local25 & arg1 << local16 | Static7.anIntArray75[local19] & ~local25);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "([Lclient!na;[SI)V")
	public static void method3656(@OriginalArg(0) JagString[] arg0, @OriginalArg(1) short[] arg1) {
		Static54.method1307(arg1, arg0.length - 1, arg0, 0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBII)I")
	public static int method3659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(II)Lclient!ia;")
	public static Class63 method3660(@OriginalArg(0) int arg0) {
		@Pc(10) Class63 local10 = (Class63) Static79.aClass99_11.method3106((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static153.aClass153_57.method4495(33, arg0);
		local10 = new Class63();
		if (local20 != null) {
			local10.method2249(new Buffer(local20), arg0);
		}
		Static79.aClass99_11.method3095(local10, (long) arg0);
		return local10;
	}
}
