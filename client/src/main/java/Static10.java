import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!an", name = "ab", descriptor = "Lclient!uf;")
	public static Keyboard aClass149_1 = new Keyboard();

	@OriginalMember(owner = "client!an", name = "db", descriptor = "S")
	public static short aShort9 = 205;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "([BIII)Lclient!na;")
	public static JagString decodeString(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) JagString local7 = new JagString();
		local7.aByteArray52 = new byte[arg1];
		local7.anInt4030 = 0;
		for (@Pc(22) int local22 = arg2; local22 < arg1 + arg2; local22++) {
			if (arg0[local22] != 0) {
				local7.aByteArray52[local7.anInt4030++] = arg0[local22];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BI)I")
	public static int method347(@OriginalArg(1) int arg0) {
		if (Static124.socket != null) {
			Static124.socket.method2834();
			Static124.socket = null;
		}
		Static127.anInt3132++;
		if (Static127.anInt3132 > 4) {
			Static82.anInt2231 = 0;
			Static127.anInt3132 = 0;
			return arg0;
		}
		Static82.anInt2231 = 0;
		if (Static208.worldListPort == Static249.worldListDefaultPort) {
			Static208.worldListPort = Static97.worldListAlternatePort;
		} else {
			Static208.worldListPort = Static249.worldListDefaultPort;
		}
		return -1;
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(III)V")
	public static void method348(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static189.anInt4457 != arg1) {
			Static173.anIntArray367 = new int[arg1];
			for (@Pc(10) int local10 = 0; local10 < arg1; local10++) {
				Static173.anIntArray367[local10] = (local10 << 12) / arg1;
			}
			Static165.anInt4042 = arg1 == 64 ? 2048 : 4096;
			Static34.anInt1060 = arg1 - 1;
			Static189.anInt4457 = arg1;
		}
		if (Static172.anInt4165 == arg0) {
			return;
		}
		if (Static189.anInt4457 == arg0) {
			Static64.anIntArray153 = Static173.anIntArray367;
		} else {
			Static64.anIntArray153 = new int[arg0];
			for (@Pc(61) int local61 = 0; local61 < arg0; local61++) {
				Static64.anIntArray153[local61] = (local61 << 12) / arg0;
			}
		}
		Static172.anInt4165 = arg0;
		Static141.anInt3473 = arg0 - 1;
	}

	@OriginalMember(owner = "client!an", name = "h", descriptor = "(I)Z")
	public static boolean readPacket() {
		try {
			return Static4.method26();
		} catch (@Pc(14) IOException local14) {
			Static175.method3279();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(61) String local61 = "T2 - " + Static164.anInt3985 + "," + Static5.anInt45 + "," + Static49.anInt1462 + " - " + Static223.anInt5028 + "," + (Static225.originX + Static173.self.movementQueueX[0]) + "," + (Static173.self.movementQueueZ[0] + Static142.originZ) + " - ";
			for (@Pc(63) int local63 = 0; local63 < Static223.anInt5028 && local63 < 50; local63++) {
				local61 = local61 + Static57.aClass3_Sub15_Sub1_3.data[local63] + ",";
			}
			Static89.method1839(local61, local19);
			Static278.method4653();
			return true;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V")
	public static void method350() {
		Static142.aClass99_23.method3104();
		Static267.aClass99_37.method3104();
	}

	@OriginalMember(owner = "client!an", name = "i", descriptor = "(I)V")
	public static void method351() {
		Static79.aClass99_11.method3104();
		Static7.aClass99_5.method3104();
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIIII)V")
	public static void method352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static78.method1690(Static106.anInt2869, arg5, Static267.anInt5773);
		@Pc(17) int local17 = Static78.method1690(Static106.anInt2869, arg0, Static267.anInt5773);
		@Pc(23) int local23 = Static78.method1690(Static224.anInt5063, arg3, Static172.anInt4164);
		@Pc(29) int local29 = Static78.method1690(Static224.anInt5063, arg2, Static172.anInt4164);
		@Pc(42) int local42 = Static78.method1690(Static106.anInt2869, arg5 + arg1, Static267.anInt5773);
		@Pc(51) int local51 = Static78.method1690(Static106.anInt2869, arg0 - arg1, Static267.anInt5773);
		@Pc(53) int local53;
		for (local53 = local11; local53 < local42; local53++) {
			Static131.method2576(Static71.anIntArrayArray10[local53], local23, local29, arg4);
		}
		for (local53 = local17; local53 > local51; local53--) {
			Static131.method2576(Static71.anIntArrayArray10[local53], local23, local29, arg4);
		}
		@Pc(95) int local95 = Static78.method1690(Static224.anInt5063, arg1 + arg3, Static172.anInt4164);
		@Pc(104) int local104 = Static78.method1690(Static224.anInt5063, arg2 - arg1, Static172.anInt4164);
		for (local53 = local42; local53 <= local51; local53++) {
			@Pc(117) int[] local117 = Static71.anIntArrayArray10[local53];
			Static131.method2576(local117, local23, local95, arg4);
			Static131.method2576(local117, local104, local29, arg4);
		}
	}
}
