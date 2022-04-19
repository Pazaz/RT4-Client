import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "Lclient!ve;")
	public static Class153 aClass153_31;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "[I")
	public static int[] anIntArray188;

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "[I")
	public static final int[] anIntArray187 = new int[14];

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
	public static void method1639() {
		if (Static184.anInt4348 == 0 || Static184.anInt4348 == 5) {
			return;
		}
		try {
			if (++Static92.anInt2430 > 2000) {
				if (Static124.aClass95_2 != null) {
					Static124.aClass95_2.method2834();
					Static124.aClass95_2 = null;
				}
				if (Static276.anInt5816 >= 1) {
					Static266.anInt5336 = -5;
					Static184.anInt4348 = 0;
					return;
				}
				Static92.anInt2430 = 0;
				if (Static209.anInt4794 == Static271.anInt5800) {
					Static209.anInt4794 = Static55.anInt1738;
				} else {
					Static209.anInt4794 = Static271.anInt5800;
				}
				Static184.anInt4348 = 1;
				Static276.anInt5816++;
			}
			if (Static184.anInt4348 == 1) {
				Static72.aClass212_3 = Static71.aClass213_3.method5120(Static60.aString1, Static209.anInt4794);
				Static184.anInt4348 = 2;
			}
			if (Static184.anInt4348 == 2) {
				if (Static72.aClass212_3.anInt5925 == 2) {
					throw new IOException();
				}
				if (Static72.aClass212_3.anInt5925 != 1) {
					return;
				}
				Static124.aClass95_2 = new BufferedSocket((Socket) Static72.aClass212_3.anObject6, Static71.aClass213_3);
				Static72.aClass212_3 = null;
				@Pc(106) long local106 = Static101.aLong98 = Static186.aClass100_829.method3158();
				Static6.aClass3_Sub15_Sub1_1.anInt2792 = 0;
				Static6.aClass3_Sub15_Sub1_1.method2178(14);
				@Pc(120) int local120 = (int) (local106 >> 16 & 0x1FL);
				Static6.aClass3_Sub15_Sub1_1.method2178(local120);
				Static124.aClass95_2.method2830(Static6.aClass3_Sub15_Sub1_1.aByteArray40, 2);
				if (Static11.aClass62_1 != null) {
					Static11.aClass62_1.method3571();
				}
				if (Static147.aClass62_2 != null) {
					Static147.aClass62_2.method3571();
				}
				@Pc(150) int local150 = Static124.aClass95_2.method2828();
				if (Static11.aClass62_1 != null) {
					Static11.aClass62_1.method3571();
				}
				if (Static147.aClass62_2 != null) {
					Static147.aClass62_2.method3571();
				}
				if (local150 != 0) {
					Static266.anInt5336 = local150;
					Static184.anInt4348 = 0;
					Static124.aClass95_2.method2834();
					Static124.aClass95_2 = null;
					return;
				}
				Static184.anInt4348 = 3;
			}
			if (Static184.anInt4348 == 3) {
				if (Static124.aClass95_2.method2831() < 8) {
					return;
				}
				Static124.aClass95_2.method2827(0, 8, Static57.aClass3_Sub15_Sub1_3.aByteArray40);
				Static57.aClass3_Sub15_Sub1_3.anInt2792 = 0;
				Static193.aLong147 = Static57.aClass3_Sub15_Sub1_3.method2182();
				@Pc(210) int[] local210 = new int[4];
				Static6.aClass3_Sub15_Sub1_1.anInt2792 = 0;
				local210[2] = (int) (Static193.aLong147 >> 32);
				local210[3] = (int) Static193.aLong147;
				local210[1] = (int) (Math.random() * 9.9999999E7D);
				local210[0] = (int) (Math.random() * 9.9999999E7D);
				Static6.aClass3_Sub15_Sub1_1.method2178(10);
				Static6.aClass3_Sub15_Sub1_1.method2164(local210[0]);
				Static6.aClass3_Sub15_Sub1_1.method2164(local210[1]);
				Static6.aClass3_Sub15_Sub1_1.method2164(local210[2]);
				Static6.aClass3_Sub15_Sub1_1.method2164(local210[3]);
				Static6.aClass3_Sub15_Sub1_1.method2166(Static186.aClass100_829.method3158());
				Static6.aClass3_Sub15_Sub1_1.method2171(Static186.aClass100_828);
				Static6.aClass3_Sub15_Sub1_1.method2226(Static86.aBigInteger1, Static256.aBigInteger2);
				Static17.aClass3_Sub15_Sub1_2.anInt2792 = 0;
				if (Static244.anInt5370 == 40) {
					Static17.aClass3_Sub15_Sub1_2.method2178(18);
				} else {
					Static17.aClass3_Sub15_Sub1_2.method2178(16);
				}
				Static17.aClass3_Sub15_Sub1_2.method2230(Static6.aClass3_Sub15_Sub1_1.anInt2792 + Static229.method3937(Static47.aClass100_991) + 159);
				Static17.aClass3_Sub15_Sub1_2.method2164(530);
				Static17.aClass3_Sub15_Sub1_2.method2178(Static5.anInt39);
				Static17.aClass3_Sub15_Sub1_2.method2178(Static249.aBoolean282 ? 1 : 0);
				Static17.aClass3_Sub15_Sub1_2.method2178(1);
				Static17.aClass3_Sub15_Sub1_2.method2178(Static144.method2736());
				Static17.aClass3_Sub15_Sub1_2.method2230(Static48.anInt1448);
				Static17.aClass3_Sub15_Sub1_2.method2230(Static254.anInt5554);
				Static17.aClass3_Sub15_Sub1_2.method2178(Static186.anInt4392);
				Static140.method2705(Static17.aClass3_Sub15_Sub1_2);
				Static17.aClass3_Sub15_Sub1_2.method2171(Static47.aClass100_991);
				Static17.aClass3_Sub15_Sub1_2.method2164(Static204.anInt4760);
				Static17.aClass3_Sub15_Sub1_2.method2164(Static145.method2746());
				Static18.aBoolean39 = true;
				Static17.aClass3_Sub15_Sub1_2.method2230(Static189.anInt4443);
				Static17.aClass3_Sub15_Sub1_2.method2164(Static213.aClass153_88.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static249.aClass153_100.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static274.aClass153_90.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static41.aClass153_25.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static248.aClass153_75.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static26.aClass153_16.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static130.aClass153_47.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static267.aClass153_109.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static209.aClass153_86.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static195.aClass153_80.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static184.aClass153_78.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static214.aClass153_106.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static16.aClass153_9.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static261.aClass153_107.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static137.aClass153_49.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static138.aClass153_51.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static280.aClass153_110.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static138.aClass153_50.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static172.aClass153_71.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static171.aClass153_68.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static253.aClass153_104.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static122.aClass153_46.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static156.aClass153_59.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static227.aClass153_94.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static254.aClass153_105.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static28.aClass153_18.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static167.aClass153_63.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2164(Static226.aClass153_93.method4480());
				Static17.aClass3_Sub15_Sub1_2.method2179(Static6.aClass3_Sub15_Sub1_1.aByteArray40, Static6.aClass3_Sub15_Sub1_1.anInt2792);
				Static124.aClass95_2.method2830(Static17.aClass3_Sub15_Sub1_2.aByteArray40, Static17.aClass3_Sub15_Sub1_2.anInt2792);
				Static6.aClass3_Sub15_Sub1_1.method2240(local210);
				for (@Pc(583) int local583 = 0; local583 < 4; local583++) {
					local210[local583] += 50;
				}
				Static57.aClass3_Sub15_Sub1_3.method2240(local210);
				Static184.anInt4348 = 4;
			}
			if (Static184.anInt4348 == 4) {
				if (Static124.aClass95_2.method2831() < 1) {
					return;
				}
				@Pc(623) int local623 = Static124.aClass95_2.method2828();
				if (local623 == 21) {
					Static184.anInt4348 = 7;
				} else if (local623 == 29) {
					Static184.anInt4348 = 10;
				} else if (local623 == 1) {
					Static184.anInt4348 = 5;
					Static266.anInt5336 = local623;
					return;
				} else if (local623 == 2) {
					Static184.anInt4348 = 8;
				} else if (local623 == 15) {
					Static184.anInt4348 = 0;
					Static266.anInt5336 = local623;
					return;
				} else if (local623 == 23 && Static276.anInt5816 < 1) {
					Static184.anInt4348 = 1;
					Static276.anInt5816++;
					Static92.anInt2430 = 0;
					Static124.aClass95_2.method2834();
					Static124.aClass95_2 = null;
					return;
				} else {
					Static266.anInt5336 = local623;
					Static184.anInt4348 = 0;
					Static124.aClass95_2.method2834();
					Static124.aClass95_2 = null;
					return;
				}
			}
			if (Static184.anInt4348 == 6) {
				Static6.aClass3_Sub15_Sub1_1.anInt2792 = 0;
				Static6.aClass3_Sub15_Sub1_1.method2242(17);
				Static124.aClass95_2.method2830(Static6.aClass3_Sub15_Sub1_1.aByteArray40, Static6.aClass3_Sub15_Sub1_1.anInt2792);
				Static184.anInt4348 = 4;
				return;
			}
			if (Static184.anInt4348 == 7) {
				if (Static124.aClass95_2.method2831() >= 1) {
					Static231.anInt5202 = (Static124.aClass95_2.method2828() + 3) * 60;
					Static184.anInt4348 = 0;
					Static266.anInt5336 = 21;
					Static124.aClass95_2.method2834();
					Static124.aClass95_2 = null;
					return;
				}
				return;
			}
			if (Static184.anInt4348 == 10) {
				if (Static124.aClass95_2.method2831() >= 1) {
					Static204.anInt4765 = Static124.aClass95_2.method2828();
					Static184.anInt4348 = 0;
					Static266.anInt5336 = 29;
					Static124.aClass95_2.method2834();
					Static124.aClass95_2 = null;
					return;
				}
				return;
			}
			if (Static184.anInt4348 == 8) {
				if (Static124.aClass95_2.method2831() < 14) {
					return;
				}
				Static124.aClass95_2.method2827(0, 14, Static57.aClass3_Sub15_Sub1_3.aByteArray40);
				Static57.aClass3_Sub15_Sub1_3.anInt2792 = 0;
				Static191.anInt4502 = Static57.aClass3_Sub15_Sub1_3.method2229();
				Static249.anInt5431 = Static57.aClass3_Sub15_Sub1_3.method2229();
				Static124.aBoolean157 = Static57.aClass3_Sub15_Sub1_3.method2229() == 1;
				Static207.aBoolean236 = Static57.aClass3_Sub15_Sub1_3.method2229() == 1;
				Static25.aBoolean57 = Static57.aClass3_Sub15_Sub1_3.method2229() == 1;
				Static86.aBoolean129 = Static57.aClass3_Sub15_Sub1_3.method2229() == 1;
				Static245.aBoolean281 = Static57.aClass3_Sub15_Sub1_3.method2229() == 1;
				Static16.anInt549 = Static57.aClass3_Sub15_Sub1_3.method2163();
				Static202.aBoolean233 = Static57.aClass3_Sub15_Sub1_3.method2229() == 1;
				Static2.aBoolean1 = Static57.aClass3_Sub15_Sub1_3.method2229() == 1;
				Static189.method3438(Static2.aBoolean1);
				Static9.method186(Static2.aBoolean1);
				if (!Static249.aBoolean282) {
					if (Static124.aBoolean157 && !Static25.aBoolean57 || Static202.aBoolean233) {
						try {
							Static167.aClass100_781.method3157(Static71.aClass213_3.anApplet2);
						} catch (@Pc(910) Throwable local910) {
						}
					} else {
						try {
							Static56.aClass100_380.method3157(Static71.aClass213_3.anApplet2);
						} catch (@Pc(920) Throwable local920) {
						}
					}
				}
				Static164.anInt3985 = Static57.aClass3_Sub15_Sub1_3.method2243();
				Static223.anInt5028 = Static57.aClass3_Sub15_Sub1_3.method2163();
				Static184.anInt4348 = 9;
			}
			if (Static184.anInt4348 == 9) {
				if (Static124.aClass95_2.method2831() < Static223.anInt5028) {
					return;
				}
				Static57.aClass3_Sub15_Sub1_3.anInt2792 = 0;
				Static124.aClass95_2.method2827(0, Static223.anInt5028, Static57.aClass3_Sub15_Sub1_3.aByteArray40);
				Static266.anInt5336 = 2;
				Static184.anInt4348 = 0;
				Static243.method4221();
				Static80.anInt4701 = -1;
				Static75.method1629(false);
				Static164.anInt3985 = -1;
				return;
			}
		} catch (@Pc(977) IOException local977) {
			if (Static124.aClass95_2 != null) {
				Static124.aClass95_2.method2834();
				Static124.aClass95_2 = null;
			}
			if (Static276.anInt5816 >= 1) {
				Static184.anInt4348 = 0;
				Static266.anInt5336 = -4;
			} else {
				Static184.anInt4348 = 1;
				Static92.anInt2430 = 0;
				Static276.anInt5816++;
				if (Static271.anInt5800 == Static209.anInt4794) {
					Static209.anInt4794 = Static55.anInt1738;
				} else {
					Static209.anInt4794 = Static271.anInt5800;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)I")
	public static int method1640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
