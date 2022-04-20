import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "Z")
	public static boolean aBoolean236 = false;

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
	public static int anInt4778 = 0;

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "Lclient!na;")
	public static final JagString aClass100_903 = Static28.parse("Hidden)2");

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "Lclient!na;")
	public static final JagString aClass100_904 = Static28.parse("::wm2");

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IFII[[I[[II[[FIBIZLclient!hg;[[FII[[FI)I")
	public static int method3683(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[][] arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) Class3_Sub14 arg11, @OriginalArg(13) float[][] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) float[][] arg15, @OriginalArg(17) int arg16) {
		@Pc(20) int local20;
		if (arg9 == 1) {
			local20 = arg14;
			arg14 = arg16;
			arg16 = 128 - local20;
		} else if (arg9 == 2) {
			arg16 = 128 - arg16;
			arg14 = 128 - arg14;
		} else if (arg9 == 3) {
			local20 = arg14;
			arg14 = 128 - arg16;
			arg16 = local20;
		}
		@Pc(66) float local66;
		@Pc(72) float local72;
		@Pc(80) int local80;
		@Pc(78) float local78;
		if (arg14 == 0 && arg16 == 0) {
			local66 = arg15[arg6][arg13];
			local72 = arg7[arg6][arg13];
			local78 = arg12[arg6][arg13];
			local80 = arg2;
		} else if (arg14 == 128 && arg16 == 0) {
			local80 = arg3;
			local66 = arg15[arg6 + 1][arg13];
			local72 = arg7[arg6 + 1][arg13];
			local78 = arg12[arg6 + 1][arg13];
		} else if (arg14 == 128 && arg16 == 128) {
			local72 = arg7[arg6 + 1][arg13 + 1];
			local78 = arg12[arg6 + 1][arg13 + 1];
			local66 = arg15[arg6 + 1][arg13 + 1];
			local80 = arg8;
		} else if (arg14 == 0 && arg16 == 128) {
			local72 = arg7[arg6][arg13 + 1];
			local66 = arg15[arg6][arg13 + 1];
			local78 = arg12[arg6][arg13 + 1];
			local80 = arg0;
		} else {
			local78 = arg12[arg6][arg13];
			local66 = arg15[arg6][arg13];
			@Pc(219) float local219 = (float) arg16 / 128.0F;
			@Pc(224) float local224 = (float) arg14 / 128.0F;
			@Pc(238) float local238 = local78 + (arg12[arg6 + 1][arg13] - local78) * local224;
			@Pc(253) float local253 = local66 + (arg15[arg6 + 1][arg13] - local66) * local224;
			@Pc(261) float local261 = arg12[arg6][arg13 + 1];
			@Pc(269) float local269 = arg15[arg6][arg13 + 1];
			@Pc(286) float local286 = local269 + (arg15[arg6 + 1][arg13 + 1] - local269) * local224;
			local72 = arg7[arg6][arg13];
			local66 = local253 + local219 * (local286 - local253);
			@Pc(309) float local309 = arg7[arg6][arg13 + 1];
			@Pc(326) float local326 = local261 + (arg12[arg6 + 1][arg13 + 1] - local261) * local224;
			local78 = local238 + local219 * (local326 - local238);
			@Pc(352) float local352 = local309 + (arg7[arg6 + 1][arg13 + 1] - local309) * local224;
			@Pc(367) float local367 = local72 + (arg7[arg6 + 1][arg13] - local72) * local224;
			local72 = local367 + (local352 - local367) * local219;
			@Pc(382) int local382 = Static69.method1540(arg14, arg2, arg3);
			@Pc(388) int local388 = Static69.method1540(arg14, arg0, arg8);
			local80 = Static69.method1540(arg16, local382, local388);
		}
		@Pc(405) int local405 = arg16 + (arg13 << 7);
		@Pc(413) int local413 = Static182.method3361(arg14, arg13, arg5, arg6, arg16);
		@Pc(420) int local420 = (arg6 << 7) + arg14;
		return arg11.method1941(local420, local413, local405, local78, local66, local72, arg10 ? local80 & 0xFFFFFF00 : local80, arg4 == null ? 0.0F : (float) (local413 - Static182.method3361(arg14, arg13, arg4, arg6, arg16)) / arg1);
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)I")
	public static int method3684() {
		try {
			if (Static82.anInt2231 == 0) {
				if (MonotonicClock.currentTimeMillis() - 5000L < Static231.aLong174) {
					return 0;
				}
				System.out.println(Static208.worldListPort);
				Static72.aClass212_3 = Static71.signLink.openSocket(Static143.worldListHostname, Static208.worldListPort);
				Static15.aLong18 = MonotonicClock.currentTimeMillis();
				Static82.anInt2231 = 1;
			}
			if (Static15.aLong18 + 30000L < MonotonicClock.currentTimeMillis()) {
				return Static10.method347(1000);
			}
			@Pc(82) int local82;
			@Pc(124) int local124;
			if (Static82.anInt2231 == 1) {
				if (Static72.aClass212_3.status == 2) {
					return Static10.method347(1001);
				}
				if (Static72.aClass212_3.status != 1) {
					return -1;
				}
				Static124.socket = new BufferedSocket((Socket) Static72.aClass212_3.result, Static71.signLink);
				Static6.outboundBuffer.offset = 0;
				Static72.aClass212_3 = null;
				local82 = 0;
				if (Static61.aBoolean109) {
					local82 = Static80.anInt4702;
				}
				Static6.outboundBuffer.p1(255);
				Static6.outboundBuffer.p4(local82);
				Static124.socket.write(Static6.outboundBuffer.data, Static6.outboundBuffer.offset);
				if (Static11.aClass62_1 != null) {
					Static11.aClass62_1.method3571();
				}
				if (Static147.aClass62_2 != null) {
					Static147.aClass62_2.method3571();
				}
				local124 = Static124.socket.read();
				if (Static11.aClass62_1 != null) {
					Static11.aClass62_1.method3571();
				}
				if (Static147.aClass62_2 != null) {
					Static147.aClass62_2.method3571();
				}
				if (local124 != 0) {
					return Static10.method347(local124);
				}
				Static82.anInt2231 = 2;
			}
			if (Static82.anInt2231 == 2) {
				if (Static124.socket.available() < 2) {
					return -1;
				}
				Static116.anInt2961 = Static124.socket.read();
				Static116.anInt2961 <<= 0x8;
				Static116.anInt2961 += Static124.socket.read();
				Static82.anInt2231 = 3;
				Static141.anInt3469 = 0;
				Static229.aByteArray70 = new byte[Static116.anInt2961];
			}
			if (Static82.anInt2231 != 3) {
				return -1;
			}
			local82 = Static124.socket.available();
			if (local82 < 1) {
				return -1;
			}
			if (local82 > Static116.anInt2961 - Static141.anInt3469) {
				local82 = Static116.anInt2961 - Static141.anInt3469;
			}
			Static124.socket.method2827(Static141.anInt3469, local82, Static229.aByteArray70);
			Static141.anInt3469 += local82;
			if (Static141.anInt3469 < Static116.anInt2961) {
				return -1;
			} else if (Static170.method2572(Static229.aByteArray70)) {
				Static101.aClass10_Sub1Array1 = new World[Static106.anInt2871];
				local124 = 0;
				for (@Pc(240) int local240 = Static19.anInt636; local240 <= Static171.anInt4157; local240++) {
					@Pc(247) World local247 = Static54.method1310(local240);
					if (local247 != null) {
						Static101.aClass10_Sub1Array1[local124++] = local247;
					}
				}
				Static124.socket.method2834();
				Static124.socket = null;
				Static127.anInt3132 = 0;
				Static82.anInt2231 = 0;
				Static229.aByteArray70 = null;
				Static231.aLong174 = MonotonicClock.currentTimeMillis();
				return 0;
			} else {
				return Static10.method347(1002);
			}
		} catch (@Pc(277) IOException local277) {
			return Static10.method347(1003);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIII)I")
	public static int method3685(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static83.anIntArrayArrayArray4 == null) {
			return 0;
		}
		@Pc(12) int local12 = arg1 >> 7;
		@Pc(16) int local16 = arg2 >> 7;
		if (local12 < 0 || local16 < 0 || local12 > 103 || local16 > 103) {
			return 0;
		}
		@Pc(36) int local36 = arg1 & 0x7F;
		@Pc(40) int local40 = arg2 & 0x7F;
		@Pc(42) int local42 = arg0;
		if (arg0 < 3 && (Static12.aByteArrayArrayArray2[1][local12][local16] & 0x2) == 2) {
			local42 = arg0 + 1;
		}
		@Pc(91) int local91 = local36 * Static83.anIntArrayArrayArray4[local42][local12 + 1][local16 + 1] + Static83.anIntArrayArrayArray4[local42][local12][local16 + 1] * (128 - local36) >> 7;
		@Pc(118) int local118 = local36 * Static83.anIntArrayArrayArray4[local42][local12 + 1][local16] + (128 - local36) * Static83.anIntArrayArrayArray4[local42][local12][local16] >> 7;
		return local40 * local91 + (128 - local40) * local118 >> 7;
	}
}
