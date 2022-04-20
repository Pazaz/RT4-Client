import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!pa", name = "L", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!pa", name = "K", descriptor = "Z")
	public static boolean aBoolean205 = false;

	@OriginalMember(owner = "client!pa", name = "N", descriptor = "I")
	public static int anInt4392 = 0;

	@OriginalMember(owner = "client!pa", name = "O", descriptor = "Lclient!na;")
	public static final JagString aClass100_827 = Static28.parse("");

	@OriginalMember(owner = "client!pa", name = "P", descriptor = "Lclient!na;")
	public static JagString password = aClass100_827;

	@OriginalMember(owner = "client!pa", name = "R", descriptor = "[Z")
	public static final boolean[] aBooleanArray100 = new boolean[100];

	@OriginalMember(owner = "client!pa", name = "S", descriptor = "Lclient!na;")
	public static JagString username = aClass100_827;

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
	public static void method3413() {
		if (Static269.aClass3_Sub2_Sub4_2 == null) {
			return;
		}
		if (Static41.anInt1309 < 10) {
			if (!Static119.aClass153_44.method4489(Static269.aClass3_Sub2_Sub4_2.aClass100_138)) {
				Static41.anInt1309 = Static227.aClass153_94.method4478(Static269.aClass3_Sub2_Sub4_2.aClass100_138) / 10;
				return;
			}
			Static6.method84();
			Static41.anInt1309 = 10;
		}
		if (Static41.anInt1309 == 10) {
			Static158.anInt3846 = Static269.aClass3_Sub2_Sub4_2.anInt763 >> 6 << 6;
			Static2.anInt13 = Static269.aClass3_Sub2_Sub4_2.anInt771 >> 6 << 6;
			Static181.anInt4296 = (Static269.aClass3_Sub2_Sub4_2.anInt758 >> 6 << 6) + 64 - Static2.anInt13;
			Static48.anInt1449 = (Static269.aClass3_Sub2_Sub4_2.anInt770 >> 6 << 6) + 64 - Static158.anInt3846;
			if (Static269.aClass3_Sub2_Sub4_2.anInt772 == 37) {
				Static83.aFloat3 = 3.0F;
				Static138.aFloat14 = 3.0F;
			} else if (Static269.aClass3_Sub2_Sub4_2.anInt772 == 50) {
				Static83.aFloat3 = 4.0F;
				Static138.aFloat14 = 4.0F;
			} else if (Static269.aClass3_Sub2_Sub4_2.anInt772 == 75) {
				Static83.aFloat3 = 6.0F;
				Static138.aFloat14 = 6.0F;
			} else if (Static269.aClass3_Sub2_Sub4_2.anInt772 == 100) {
				Static83.aFloat3 = 8.0F;
				Static138.aFloat14 = 8.0F;
			} else if (Static269.aClass3_Sub2_Sub4_2.anInt772 == 200) {
				Static83.aFloat3 = 16.0F;
				Static138.aFloat14 = 16.0F;
			} else {
				Static83.aFloat3 = 8.0F;
				Static138.aFloat14 = 8.0F;
			}
			@Pc(144) int local144 = (Static173.self.anInt3412 >> 7) + Static225.originX - Static158.anInt3846;
			@Pc(153) int local153 = local144 + (int) (Math.random() * 10.0D) - 5;
			@Pc(168) int local168 = Static2.anInt13 + Static181.anInt4296 - Static142.originZ - (Static173.self.anInt3421 >> 7) - 1;
			@Pc(177) int local177 = local168 + (int) (Math.random() * 10.0D) - 5;
			if (local153 >= 0 && Static48.anInt1449 > local153 && local177 >= 0 && local177 < Static181.anInt4296) {
				Static13.anInt435 = local153;
				Static28.anInt919 = local177;
			} else {
				Static28.anInt919 = Static2.anInt13 + Static181.anInt4296 - Static269.aClass3_Sub2_Sub4_2.anInt764 * 64 - 1;
				Static13.anInt435 = Static269.aClass3_Sub2_Sub4_2.anInt769 * 64 - Static158.anInt3846;
			}
			Static38.method965();
			Static145.anIntArray330 = new int[Static98.anInt2510 + 1];
			@Pc(235) int local235 = Static181.anInt4296 >> 6;
			@Pc(239) int local239 = Static48.anInt1449 >> 6;
			Static90.aByteArrayArrayArray8 = new byte[local239][local235][];
			@Pc(249) int local249 = Static86.anInt2293 >> 2 << 10;
			Static70.aByteArrayArrayArray7 = new byte[local239][local235][];
			Static83.anIntArrayArrayArray3 = new int[local239][local235][];
			Static34.aByteArrayArrayArray3 = new byte[local239][local235][];
			Static248.anIntArrayArrayArray17 = new int[local239][local235][];
			Static229.aByteArrayArrayArray12 = new byte[local239][local235][];
			@Pc(273) int local273 = Static183.anInt4272 >> 1;
			Static125.aByteArrayArrayArray10 = new byte[local239][local235][];
			Static58.anIntArrayArrayArray5 = new int[local239][local235][];
			Static70.method1549(local273, local249);
			Static41.anInt1309 = 20;
		} else if (Static41.anInt1309 == 20) {
			Static33.method868(new Buffer(Static119.aClass153_44.method4485(Static166.aClass100_779, Static269.aClass3_Sub2_Sub4_2.aClass100_138)));
			Static41.anInt1309 = 30;
			Static7.method842(true);
			Static234.method4020();
		} else if (Static41.anInt1309 == 30) {
			Static47.method3998(new Buffer(Static119.aClass153_44.method4485(Static4.aClass100_7, Static269.aClass3_Sub2_Sub4_2.aClass100_138)));
			Static41.anInt1309 = 40;
			Static234.method4020();
		} else if (Static41.anInt1309 == 40) {
			Static231.method3980(new Buffer(Static119.aClass153_44.method4485(Static73.aClass100_455, Static269.aClass3_Sub2_Sub4_2.aClass100_138)));
			Static41.anInt1309 = 50;
			Static234.method4020();
		} else if (Static41.anInt1309 == 50) {
			Static166.method3166(new Buffer(Static119.aClass153_44.method4485(Static42.aClass100_331, Static269.aClass3_Sub2_Sub4_2.aClass100_138)));
			Static41.anInt1309 = 60;
			Static7.method842(true);
			Static234.method4020();
		} else if (Static41.anInt1309 == 60) {
			if (Static119.aClass153_44.method4497(Static34.method882(new JagString[] { Static269.aClass3_Sub2_Sub4_2.aClass100_138, Static265.aClass100_1086 }))) {
				if (!Static119.aClass153_44.method4489(Static34.method882(new JagString[] { Static269.aClass3_Sub2_Sub4_2.aClass100_138, Static265.aClass100_1086 }))) {
					return;
				}
				Static203.aClass134_1 = Static140.method2711(Static34.method882(new JagString[] { Static269.aClass3_Sub2_Sub4_2.aClass100_138, Static265.aClass100_1086 }), Static119.aClass153_44);
			} else {
				Static203.aClass134_1 = new Class134(0);
			}
			Static41.anInt1309 = 70;
			Static234.method4020();
		} else if (Static41.anInt1309 == 70) {
			Static273.aClass41_7 = new WorldMapFont(11, true, Static154.canvas);
			Static41.anInt1309 = 73;
			Static7.method842(true);
			Static234.method4020();
		} else if (Static41.anInt1309 == 73) {
			Static152.aClass41_3 = new WorldMapFont(12, true, Static154.canvas);
			Static41.anInt1309 = 76;
			Static7.method842(true);
			Static234.method4020();
		} else if (Static41.anInt1309 == 76) {
			Static169.aClass41_5 = new WorldMapFont(14, true, Static154.canvas);
			Static41.anInt1309 = 79;
			Static7.method842(true);
			Static234.method4020();
		} else if (Static41.anInt1309 == 79) {
			Static130.aClass41_1 = new WorldMapFont(17, true, Static154.canvas);
			Static41.anInt1309 = 82;
			Static7.method842(true);
			Static234.method4020();
		} else if (Static41.anInt1309 == 82) {
			Static203.aClass41_8 = new WorldMapFont(19, true, Static154.canvas);
			Static41.anInt1309 = 85;
			Static7.method842(true);
			Static234.method4020();
		} else if (Static41.anInt1309 == 85) {
			Static130.aClass41_2 = new WorldMapFont(22, true, Static154.canvas);
			Static41.anInt1309 = 88;
			Static7.method842(true);
			Static234.method4020();
		} else if (Static41.anInt1309 == 88) {
			Static270.aClass41_9 = new WorldMapFont(26, true, Static154.canvas);
			Static41.anInt1309 = 91;
			Static7.method842(true);
			Static234.method4020();
		} else {
			Static160.aClass41_4 = new WorldMapFont(30, true, Static154.canvas);
			Static41.anInt1309 = 100;
			Static7.method842(true);
			Static234.method4020();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIILclient!e;)V")
	public static void method3415(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Player arg2) {
		if (arg1 == arg2.anInt3369 && arg1 != -1) {
			@Pc(89) SeqType local89 = Static36.method941(arg1);
			@Pc(92) int local92 = local89.anInt5347;
			if (local92 == 1) {
				arg2.anInt3420 = arg0;
				arg2.anInt3360 = 0;
				arg2.anInt3373 = 1;
				arg2.anInt3425 = 0;
				arg2.anInt3371 = 0;
				Static152.method2836(arg2.anInt3421, local89, arg2.anInt3412, Static173.self == arg2, arg2.anInt3425);
			}
			if (local92 == 2) {
				arg2.anInt3371 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt3369 == -1 || Static36.method941(arg1).anInt5355 >= Static36.method941(arg2.anInt3369).anInt5355) {
			arg2.anInt3373 = 1;
			arg2.anInt3425 = 0;
			arg2.anInt3420 = arg0;
			arg2.anInt3405 = arg2.anInt3409;
			arg2.anInt3371 = 0;
			arg2.anInt3360 = 0;
			arg2.anInt3369 = arg1;
			if (arg2.anInt3369 != -1) {
				Static152.method2836(arg2.anInt3421, Static36.method941(arg2.anInt3369), arg2.anInt3412, arg2 == Static173.self, arg2.anInt3425);
			}
		}
	}
}
