import java.awt.Point;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!gg", name = "Z", descriptor = "I")
	public static int anInt2222;

	@OriginalMember(owner = "client!gg", name = "ab", descriptor = "Lclient!ve;")
	public static Js5 aClass153_34;

	@OriginalMember(owner = "client!gg", name = "bb", descriptor = "I")
	public static int anInt2223;

	@OriginalMember(owner = "client!gg", name = "Q", descriptor = "Lclient!na;")
	public static final JagString aClass100_474 = Static28.method790(" s(West connect-B)3");

	@OriginalMember(owner = "client!gg", name = "U", descriptor = "I")
	public static int anInt2219 = 0;

	@OriginalMember(owner = "client!gg", name = "W", descriptor = "Lclient!na;")
	public static final JagString aClass100_475 = Static28.method790("null");

	@OriginalMember(owner = "client!gg", name = "Y", descriptor = "Lclient!na;")
	public static final JagString aClass100_476 = Static28.method790("::gc");

	@OriginalMember(owner = "client!gg", name = "db", descriptor = "I")
	public static int anInt2225 = -1;

	@OriginalMember(owner = "client!gg", name = "jb", descriptor = "Lclient!na;")
	public static final JagString aClass100_477 = Static28.method790(" est d-Bj-9 dans votre liste noire)3");

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(II)V")
	public static void method1750(@OriginalArg(0) int arg0) {
		if (!Static64.aBoolean111) {
			arg0 = -1;
		}
		if (arg0 == Static115.anInt2941) {
			return;
		}
		if (arg0 != -1) {
			@Pc(24) Class63 local24 = Static202.method3660(arg0);
			@Pc(28) SoftwareSprite local28 = local24.method2246();
			if (local28 == null) {
				arg0 = -1;
			} else {
				Static71.aClass213_3.method5113(local28.method301(), local28.anInt1860, Static154.aCanvas1, new Point(local24.anInt2852, local24.anInt2850), local28.anInt1866);
				Static115.anInt2941 = arg0;
			}
		}
		if (arg0 == -1 && Static115.anInt2941 != -1) {
			Static71.aClass213_3.method5113(null, -1, Static154.aCanvas1, new Point(), -1);
			Static115.anInt2941 = -1;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([[IZ)V")
	public static void method1751(@OriginalArg(0) int[][] arg0) {
		Static71.anIntArrayArray10 = arg0;
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(II)Lclient!dm;")
	public static IdkType method1752(@OriginalArg(0) int arg0) {
		@Pc(10) IdkType local10 = (IdkType) Static67.aClass99_20.method3106((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static216.aClass153_31.method4495(3, arg0);
		local10 = new IdkType();
		if (local21 != null) {
			local10.method1209(new Buffer(local21));
		}
		Static67.aClass99_20.method3095(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "(II)V")
	public static void method1753(@OriginalArg(0) int arg0) {
		if (!Static245.method4225(arg0)) {
			return;
		}
		@Pc(15) Component[] local15 = Static241.aClass13ArrayArray12[arg0];
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(29) Component local29 = local15[local17];
			if (local29 != null) {
				local29.anInt496 = 1;
				local29.anInt510 = 0;
				local29.anInt500 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!ve;)V")
	public static void method1754(@OriginalArg(1) Js5 arg0) {
		Static138.anInt3443 = arg0.method4482(Static12.aClass100_73);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
	public static void method1756() {
		if (Static267.anInt5775 > 0) {
			Static267.anInt5775--;
		}
		if (Static60.anInt1894 > 1) {
			Static60.anInt1894--;
			Static209.anInt4808 = Static119.anInt3028;
		}
		if (Static224.aBoolean247) {
			Static224.aBoolean247 = false;
			Static175.method3279();
			return;
		}
		@Pc(34) int local34;
		for (local34 = 0; local34 < 100 && Static10.method349(); local34++) {
		}
		if (Static244.anInt5370 != 30) {
			return;
		}
		Static233.method4005(Static6.aClass3_Sub15_Sub1_1);
		@Pc(60) Object local60 = Static178.aClass74_1.anObject4;
		@Pc(86) int local86;
		@Pc(79) int local79;
		@Pc(88) int local88;
		@Pc(106) int local106;
		@Pc(111) int local111;
		@Pc(182) int local182;
		@Pc(189) int local189;
		synchronized (Static178.aClass74_1.anObject4) {
			if (!Static245.aBoolean281) {
				Static178.aClass74_1.anInt2990 = 0;
			} else if (Static150.anInt3585 != 0 || Static178.aClass74_1.anInt2990 >= 40) {
				Static6.aClass3_Sub15_Sub1_1.method2242(123);
				local79 = 0;
				Static6.aClass3_Sub15_Sub1_1.method2178(0);
				local86 = Static6.aClass3_Sub15_Sub1_1.anInt2792;
				for (local88 = 0; Static178.aClass74_1.anInt2990 > local88 && Static6.aClass3_Sub15_Sub1_1.anInt2792 - local86 < 240; local88++) {
					local79++;
					local106 = Static178.aClass74_1.anIntArray279[local88];
					local111 = Static178.aClass74_1.anIntArray280[local88];
					if (local106 < 0) {
						local106 = 0;
					} else if (local106 > 65534) {
						local106 = 65534;
					}
					if (local111 < 0) {
						local111 = 0;
					} else if (local111 > 65534) {
						local111 = 65534;
					}
					@Pc(142) boolean local142 = false;
					if (Static178.aClass74_1.anIntArray279[local88] == -1 && Static178.aClass74_1.anIntArray280[local88] == -1) {
						local142 = true;
						local106 = -1;
						local111 = -1;
					}
					if (Static264.anInt4632 != local111 || local106 != Static179.anInt4253) {
						local182 = local111 - Static264.anInt4632;
						Static264.anInt4632 = local111;
						local189 = local106 - Static179.anInt4253;
						Static179.anInt4253 = local106;
						if (Static204.anInt4762 < 8 && local182 >= -32 && local182 <= 31 && local189 >= -32 && local189 <= 31) {
							local189 += 32;
							local182 += 32;
							Static6.aClass3_Sub15_Sub1_1.method2230(local189 + (Static204.anInt4762 << 12) + (local182 << 6));
							Static204.anInt4762 = 0;
						} else if (Static204.anInt4762 < 32 && local182 >= -128 && local182 <= 127 && local189 >= -128 && local189 <= 127) {
							Static6.aClass3_Sub15_Sub1_1.method2178(Static204.anInt4762 + 128);
							local189 += 128;
							local182 += 128;
							Static6.aClass3_Sub15_Sub1_1.method2230((local182 << 8) + local189);
							Static204.anInt4762 = 0;
						} else if (Static204.anInt4762 < 32) {
							Static6.aClass3_Sub15_Sub1_1.method2178(Static204.anInt4762 + 192);
							if (local142) {
								Static6.aClass3_Sub15_Sub1_1.method2164(Integer.MIN_VALUE);
							} else {
								Static6.aClass3_Sub15_Sub1_1.method2164(local111 | local106 << 16);
							}
							Static204.anInt4762 = 0;
						} else {
							Static6.aClass3_Sub15_Sub1_1.method2230(Static204.anInt4762 + 57344);
							if (local142) {
								Static6.aClass3_Sub15_Sub1_1.method2164(Integer.MIN_VALUE);
							} else {
								Static6.aClass3_Sub15_Sub1_1.method2164(local111 | local106 << 16);
							}
							Static204.anInt4762 = 0;
						}
					} else if (Static204.anInt4762 < 2047) {
						Static204.anInt4762++;
					}
				}
				Static6.aClass3_Sub15_Sub1_1.method2195(Static6.aClass3_Sub15_Sub1_1.anInt2792 - local86);
				if (Static178.aClass74_1.anInt2990 > local79) {
					Static178.aClass74_1.anInt2990 -= local79;
					for (local88 = 0; local88 < Static178.aClass74_1.anInt2990; local88++) {
						Static178.aClass74_1.anIntArray280[local88] = Static178.aClass74_1.anIntArray280[local79 + local88];
						Static178.aClass74_1.anIntArray279[local88] = Static178.aClass74_1.anIntArray279[local88 + local79];
					}
				} else {
					Static178.aClass74_1.anInt2990 = 0;
				}
			}
		}
		if (Static150.anInt3585 != 0) {
			@Pc(411) long local411 = (Static133.aLong175 - Static183.aLong139) / 50L;
			local79 = Static60.anInt1893;
			if (local79 < 0) {
				local79 = 0;
			} else if (local79 > 65535) {
				local79 = 65535;
			}
			if (local411 > 32767L) {
				local411 = 32767L;
			}
			local88 = Static7.anInt985;
			Static183.aLong139 = Static133.aLong175;
			@Pc(437) byte local437 = 0;
			if (local88 < 0) {
				local88 = 0;
			} else if (local88 > 65535) {
				local88 = 65535;
			}
			local111 = (int) local411;
			if (Static150.anInt3585 == 2) {
				local437 = 1;
			}
			Static6.aClass3_Sub15_Sub1_1.method2242(75);
			Static6.aClass3_Sub15_Sub1_1.method2191(local437 << 15 | local111);
			Static6.aClass3_Sub15_Sub1_1.method2185(local88 | local79 << 16);
		}
		if (Static16.anInt551 > 0) {
			Static16.anInt551--;
		}
		if (Static33.aBoolean63) {
			for (local34 = 0; local34 < Static182.anInt4313; local34++) {
				local86 = Static227.anIntArray447[local34];
				if (local86 == 98 || local86 == 99 || local86 == 96 || local86 == 97) {
					Static197.aBoolean228 = true;
					break;
				}
			}
		} else if (Static187.aBooleanArray101[96] || Static187.aBooleanArray101[97] || Static187.aBooleanArray101[98] || Static187.aBooleanArray101[99]) {
			Static197.aBoolean228 = true;
		}
		if (Static197.aBoolean228 && Static16.anInt551 <= 0) {
			Static16.anInt551 = 20;
			Static197.aBoolean228 = false;
			Static6.aClass3_Sub15_Sub1_1.method2242(21);
			Static6.aClass3_Sub15_Sub1_1.method2209(Static72.anInt2031);
			Static6.aClass3_Sub15_Sub1_1.method2222(Static57.anInt1747);
		}
		if (Static26.aBoolean59 && !Static67.aBoolean168) {
			Static67.aBoolean168 = true;
			Static6.aClass3_Sub15_Sub1_1.method2242(22);
			Static6.aClass3_Sub15_Sub1_1.method2178(1);
		}
		if (!Static26.aBoolean59 && Static67.aBoolean168) {
			Static67.aBoolean168 = false;
			Static6.aClass3_Sub15_Sub1_1.method2242(22);
			Static6.aClass3_Sub15_Sub1_1.method2178(0);
		}
		if (!Static18.aBoolean39) {
			Static6.aClass3_Sub15_Sub1_1.method2242(98);
			Static6.aClass3_Sub15_Sub1_1.method2164(Static145.method2746());
			Static18.aBoolean39 = true;
		}
		Static31.method846();
		if (Static244.anInt5370 != 30) {
			return;
		}
		Static251.method4274();
		Static192.method3473();
		Static54.method1312();
		Static201.anInt1862++;
		if (Static201.anInt1862 > 750) {
			Static175.method3279();
			return;
		}
		Static71.method1444();
		Static109.method2274();
		Static19.method587();
		if (Static24.aClass13_8 != null) {
			Static12.method447();
		}
		for (local34 = Static38.method963(true); local34 != -1; local34 = Static38.method963(false)) {
			Static85.method1775(local34);
			Static83.anIntArray23[Static70.anInt2015++ & 0x1F] = local34;
		}
		@Pc(782) int local782;
		for (@Pc(709) DelayedStateChange local709 = Static127.method2464(); local709 != null; local709 = Static127.method2464()) {
			local79 = local709.method1011();
			local88 = local709.method1012();
			if (local79 == 1) {
				Static155.anIntArray355[local88] = local709.anInt1271;
				Static138.anIntArray323[Static4.anInt37++ & 0x1F] = local88;
			} else if (local79 == 2) {
				Static226.aClass100Array154[local88] = local709.aClass100_254;
				Static233.anIntArray452[Static72.anInt2036++ & 0x1F] = local88;
			} else {
				@Pc(773) Component local773;
				if (local79 == 3) {
					local773 = Static5.method32(local88);
					if (!local709.aClass100_254.method3108(local773.aClass100_84)) {
						local773.aClass100_84 = local709.aClass100_254;
						Static43.method1143(local773);
					}
				} else if (local79 == 4) {
					local773 = Static5.method32(local88);
					local111 = local709.anInt1271;
					local182 = local709.anInt1269;
					local782 = local709.anInt1270;
					if (local773.anInt464 != local111 || local773.anInt463 != local782 || local182 != local773.anInt498) {
						local773.anInt463 = local782;
						local773.anInt498 = local182;
						local773.anInt464 = local111;
						Static43.method1143(local773);
					}
				} else if (local79 == 5) {
					local773 = Static5.method32(local88);
					if (local773.anInt522 != local709.anInt1271 || local709.anInt1271 == -1) {
						local773.anInt496 = 1;
						local773.anInt500 = 0;
						local773.anInt522 = local709.anInt1271;
						local773.anInt510 = 0;
						Static43.method1143(local773);
					}
				} else if (local79 == 6) {
					local106 = local709.anInt1271;
					local111 = local106 >> 10 & 0x1F;
					local182 = local106 & 0x1F;
					local782 = local106 >> 5 & 0x1F;
					@Pc(1189) Component local1189 = Static5.method32(local88);
					local189 = (local182 << 3) + (local782 << 11) + (local111 << 19);
					if (local189 != local1189.anInt474) {
						local1189.anInt474 = local189;
						Static43.method1143(local1189);
					}
				} else if (local79 == 7) {
					local773 = Static5.method32(local88);
					@Pc(1145) boolean local1145 = local709.anInt1271 == 1;
					if (local1145 != local773.aBoolean17) {
						local773.aBoolean17 = local1145;
						Static43.method1143(local773);
					}
				} else if (local79 == 8) {
					local773 = Static5.method32(local88);
					if (local709.anInt1271 != local773.anInt450 || local773.anInt524 != local709.anInt1270 || local709.anInt1269 != local773.anInt443) {
						local773.anInt450 = local709.anInt1271;
						local773.anInt443 = local709.anInt1269;
						local773.anInt524 = local709.anInt1270;
						if (local773.anInt458 != -1) {
							if (local773.anInt451 > 0) {
								local773.anInt443 = local773.anInt443 * 32 / local773.anInt451;
							} else if (local773.anInt446 > 0) {
								local773.anInt443 = local773.anInt443 * 32 / local773.anInt446;
							}
						}
						Static43.method1143(local773);
					}
				} else if (local79 == 9) {
					local773 = Static5.method32(local88);
					if (local709.anInt1271 != local773.anInt458 || local773.anInt503 != local709.anInt1270) {
						local773.anInt458 = local709.anInt1271;
						local773.anInt503 = local709.anInt1270;
						Static43.method1143(local773);
					}
				} else if (local79 == 10) {
					local773 = Static5.method32(local88);
					if (local773.anInt494 != local709.anInt1271 || local709.anInt1270 != local773.anInt497 || local773.anInt508 != local709.anInt1269) {
						local773.anInt497 = local709.anInt1270;
						local773.anInt508 = local709.anInt1269;
						local773.anInt494 = local709.anInt1271;
						Static43.method1143(local773);
					}
				} else if (local79 == 11) {
					local773 = Static5.method32(local88);
					local773.anInt523 = local773.anInt529 = local709.anInt1271;
					local773.aByte4 = 0;
					local773.aByte2 = 0;
					local773.anInt469 = local773.anInt444 = local709.anInt1270;
					Static43.method1143(local773);
				} else if (local79 == 12) {
					local773 = Static5.method32(local88);
					local111 = local709.anInt1271;
					if (local773 != null && local773.anInt452 == 0) {
						if (local111 > local773.anInt491 - local773.anInt459) {
							local111 = local773.anInt491 - local773.anInt459;
						}
						if (local111 < 0) {
							local111 = 0;
						}
						if (local111 != local773.anInt468) {
							local773.anInt468 = local111;
							Static43.method1143(local773);
						}
					}
				} else if (local79 == 13) {
					local773 = Static5.method32(local88);
					local773.anInt483 = local709.anInt1271;
				}
			}
		}
		if (Static70.anInt2013 != 0) {
			Static17.anInt577 += 20;
			if (Static17.anInt577 >= 400) {
				Static70.anInt2013 = 0;
			}
		}
		Static178.anInt4247++;
		if (Static257.aClass13_7 != null) {
			Static72.anInt2043++;
			if (Static72.anInt2043 >= 15) {
				Static43.method1143(Static257.aClass13_7);
				Static257.aClass13_7 = null;
			}
		}
		@Pc(1361) Component local1361;
		if (Static118.aClass13_15 != null) {
			Static43.method1143(Static118.aClass13_15);
			if (Static149.anInt3554 + 5 < Static215.anInt4873 || Static215.anInt4873 < Static149.anInt3554 - 5 || Static206.anInt4773 + 5 < Static223.anInt5032 || Static206.anInt4773 - 5 > Static223.anInt5032) {
				Static123.aBoolean155 = true;
			}
			Static78.anInt2145++;
			if (Static22.anInt723 == 0) {
				if (Static123.aBoolean155 && Static78.anInt2145 >= 5) {
					if (Static118.aClass13_15 == Static169.aClass13_18 && Static4.anInt36 != Static18.anInt588) {
						local1361 = Static118.aClass13_15;
						@Pc(1363) byte local1363 = 0;
						if (Static179.anInt4254 == 1 && local1361.anInt453 == 206) {
							local1363 = 1;
						}
						if (local1361.anIntArray40[Static18.anInt588] <= 0) {
							local1363 = 0;
						}
						if (Static36.method940(local1361).method504()) {
							local106 = Static4.anInt36;
							local111 = Static18.anInt588;
							local1361.anIntArray40[local111] = local1361.anIntArray40[local106];
							local1361.anIntArray50[local111] = local1361.anIntArray50[local106];
							local1361.anIntArray40[local106] = -1;
							local1361.anIntArray50[local106] = 0;
						} else if (local1363 == 1) {
							local111 = Static18.anInt588;
							local106 = Static4.anInt36;
							while (local111 != local106) {
								if (local106 > local111) {
									local1361.method487(local106 - 1, local106);
									local106--;
								} else if (local111 > local106) {
									local1361.method487(local106 + 1, local106);
									local106++;
								}
							}
						} else {
							local1361.method487(Static18.anInt588, Static4.anInt36);
						}
						Static6.aClass3_Sub15_Sub1_1.method2242(231);
						Static6.aClass3_Sub15_Sub1_1.method2230(Static4.anInt36);
						Static6.aClass3_Sub15_Sub1_1.method2211(Static118.aClass13_15.anInt507);
						Static6.aClass3_Sub15_Sub1_1.method2209(Static18.anInt588);
						Static6.aClass3_Sub15_Sub1_1.method2169(local1363);
					}
				} else if ((Static116.anInt2952 == 1 || Static277.method4640(Static231.anInt5204 - 1)) && Static231.anInt5204 > 2) {
					Static226.method3901();
				} else if (Static231.anInt5204 > 0) {
					Static59.method1372();
				}
				Static150.anInt3585 = 0;
				Static72.anInt2043 = 10;
				Static118.aClass13_15 = null;
			}
		}
		Static146.aBoolean174 = false;
		Static56.aClass13_12 = null;
		Static44.aBoolean83 = false;
		Static182.anInt4313 = 0;
		local1361 = Static180.aClass13_22;
		Static180.aClass13_22 = null;
		@Pc(1508) Component local1508 = Static43.aClass13_11;
		Static43.aClass13_11 = null;
		while (Static25.method712() && Static182.anInt4313 < 128) {
			Static227.anIntArray447[Static182.anInt4313] = Static102.anInt2681;
			Static205.anIntArray426[Static182.anInt4313] = Static193.anInt4542;
			Static182.anInt4313++;
		}
		Static24.aClass13_8 = null;
		if (Static154.anInt3711 != -1) {
			Static57.method1320(0, 0, 0, Static48.anInt1448, Static154.anInt3711, 0, Static254.anInt5554);
		}
		Static119.anInt3028++;
		while (true) {
			@Pc(1569) Component local1569;
			@Pc(1560) Component local1560;
			@Pc(1555) HookRequest local1555;
			do {
				local1555 = (HookRequest) Static4.aClass69_2.method2287();
				if (local1555 == null) {
					while (true) {
						do {
							local1555 = (HookRequest) Static115.aClass69_70.method2287();
							if (local1555 == null) {
								while (true) {
									do {
										local1555 = (HookRequest) Static185.aClass69_101.method2287();
										if (local1555 == null) {
											if (Static24.aClass13_8 == null) {
												Static137.anInt3337 = 0;
											}
											if (Static105.aClass13_14 != null) {
												Static4.method28();
											}
											if (Static191.anInt4502 > 0 && Static187.aBooleanArray101[82] && Static187.aBooleanArray101[81] && Static58.anInt1766 != 0) {
												local106 = Static55.anInt1735 - Static58.anInt1766;
												if (local106 < 0) {
													local106 = 0;
												} else if (local106 > 3) {
													local106 = 3;
												}
												Static61.method1454(Static173.aClass8_Sub4_Sub1_2.anIntArray318[0] + Static225.anInt5068, Static173.aClass8_Sub4_Sub1_2.anIntArray317[0] + Static142.anInt3483, local106);
											}
											if (Static191.anInt4502 > 0 && Static187.aBooleanArray101[82] && Static187.aBooleanArray101[81]) {
												if (Static56.anInt1742 != -1) {
													Static61.method1454(Static225.anInt5068 + Static56.anInt1742, Static142.anInt3483 - -Static116.anInt2954, Static55.anInt1735);
												}
												Static187.anInt4422 = 0;
												Static125.anInt3096 = 0;
											} else if (Static125.anInt3096 == 2) {
												if (Static56.anInt1742 != -1) {
													Static6.aClass3_Sub15_Sub1_1.method2242(131);
													Static6.aClass3_Sub15_Sub1_1.method2185(Static98.anInt2512);
													Static6.aClass3_Sub15_Sub1_1.method2209(Static225.anInt5068 + Static56.anInt1742);
													Static6.aClass3_Sub15_Sub1_1.method2191(Static15.anInt506);
													Static6.aClass3_Sub15_Sub1_1.method2209(Static116.anInt2954 + Static142.anInt3483);
													Static70.anInt2013 = 1;
													Static17.anInt577 = 0;
													Static25.anInt826 = Static60.anInt1893;
													Static122.anInt3047 = Static7.anInt985;
												}
												Static125.anInt3096 = 0;
											} else if (Static187.anInt4422 == 2) {
												if (Static56.anInt1742 != -1) {
													Static6.aClass3_Sub15_Sub1_1.method2242(179);
													Static6.aClass3_Sub15_Sub1_1.method2230(Static142.anInt3483 + Static116.anInt2954);
													Static6.aClass3_Sub15_Sub1_1.method2230(Static56.anInt1742 + Static225.anInt5068);
													Static17.anInt577 = 0;
													Static70.anInt2013 = 1;
													Static122.anInt3047 = Static7.anInt985;
													Static25.anInt826 = Static60.anInt1893;
												}
												Static187.anInt4422 = 0;
											} else if (Static56.anInt1742 != -1 && Static125.anInt3096 == 0 && Static187.anInt4422 == 0) {
												@Pc(1871) boolean local1871 = Static102.method2075(Static173.aClass8_Sub4_Sub1_2.anIntArray317[0], 0, 0, true, 0, Static56.anInt1742, 0, 0, 0, Static116.anInt2954, Static173.aClass8_Sub4_Sub1_2.anIntArray318[0]);
												if (local1871) {
													Static25.anInt826 = Static60.anInt1893;
													Static17.anInt577 = 0;
													Static122.anInt3047 = Static7.anInt985;
													Static70.anInt2013 = 1;
												}
											}
											Static56.anInt1742 = -1;
											Static7.method843();
											if (Static180.aClass13_22 != local1361) {
												if (local1361 != null) {
													Static43.method1143(local1361);
												}
												if (Static180.aClass13_22 != null) {
													Static43.method1143(Static180.aClass13_22);
												}
											}
											if (local1508 != Static43.aClass13_11 && Static191.anInt4504 == Static133.anInt5235) {
												if (local1508 != null) {
													Static43.method1143(local1508);
												}
												if (Static43.aClass13_11 != null) {
													Static43.method1143(Static43.aClass13_11);
												}
											}
											if (Static43.aClass13_11 == null) {
												if (Static133.anInt5235 > 0) {
													Static133.anInt5235--;
												}
											} else if (Static133.anInt5235 < Static191.anInt4504) {
												Static133.anInt5235++;
												if (Static191.anInt4504 == Static133.anInt5235) {
													Static43.method1143(Static43.aClass13_11);
												}
											}
											if (Static227.anInt5096 == 1) {
												Static250.method4273();
											} else if (Static227.anInt5096 == 2) {
												Static125.method2450();
											} else {
												Static40.method1008();
											}
											for (local106 = 0; local106 < 5; local106++) {
												@Pc(2001) int local2001 = Static31.anIntArray76[local106]++;
											}
											local106 = Static142.method2727();
											local111 = Static195.method3531();
											if (local106 > 15000 && local111 > 15000) {
												Static267.anInt5775 = 250;
												Static48.method1197(14500);
												Static6.aClass3_Sub15_Sub1_1.method2242(245);
											}
											if (Static33.aClass212_1 != null && Static33.aClass212_1.anInt5925 == 1) {
												if (Static33.aClass212_1.anObject6 != null) {
													Static169.method3175(Static175.aClass100_797, Static164.aBoolean194);
												}
												Static175.aClass100_797 = null;
												Static33.aClass212_1 = null;
												Static164.aBoolean194 = false;
											}
											Static131.anInt3251++;
											Static82.anInt2252++;
											Static143.anInt3486++;
											if (Static143.anInt3486 > 500) {
												Static143.anInt3486 = 0;
												local782 = (int) (Math.random() * 8.0D);
												if ((local782 & 0x4) == 4) {
													Static230.anInt5161 += Static220.anInt4941;
												}
												if ((local782 & 0x2) == 2) {
													Static206.anInt4774 += Static20.anInt659;
												}
												if ((local782 & 0x1) == 1) {
													Static132.anInt3291 += Static248.anInt4229;
												}
											}
											if (Static82.anInt2252 > 500) {
												Static82.anInt2252 = 0;
												local782 = (int) (Math.random() * 8.0D);
												if ((local782 & 0x1) == 1) {
													Static59.anInt1814 += Static263.anInt5755;
												}
												if ((local782 & 0x2) == 2) {
													Static273.anInt4130 += Static179.anInt4262;
												}
											}
											if (Static132.anInt3291 < -50) {
												Static248.anInt4229 = 2;
											}
											if (Static59.anInt1814 < -60) {
												Static263.anInt5755 = 2;
											}
											if (Static273.anInt4130 < -20) {
												Static179.anInt4262 = 1;
											}
											if (Static206.anInt4774 < -55) {
												Static20.anInt659 = 2;
											}
											if (Static206.anInt4774 > 55) {
												Static20.anInt659 = -2;
											}
											if (Static230.anInt5161 < -40) {
												Static220.anInt4941 = 1;
											}
											if (Static132.anInt3291 > 50) {
												Static248.anInt4229 = -2;
											}
											if (Static230.anInt5161 > 40) {
												Static220.anInt4941 = -1;
											}
											if (Static273.anInt4130 > 10) {
												Static179.anInt4262 = -1;
											}
											if (Static59.anInt1814 > 60) {
												Static263.anInt5755 = -2;
											}
											if (Static131.anInt3251 > 50) {
												Static6.aClass3_Sub15_Sub1_1.method2242(93);
											}
											if (Static34.aBoolean65) {
												Static71.method1445();
												Static34.aBoolean65 = false;
											}
											try {
												if (Static124.aClass95_2 != null && Static6.aClass3_Sub15_Sub1_1.anInt2792 > 0) {
													Static124.aClass95_2.method2830(Static6.aClass3_Sub15_Sub1_1.aByteArray40, Static6.aClass3_Sub15_Sub1_1.anInt2792);
													Static131.anInt3251 = 0;
													Static6.aClass3_Sub15_Sub1_1.anInt2792 = 0;
												}
											} catch (@Pc(2266) IOException local2266) {
												Static175.method3279();
											}
											return;
										}
										local1560 = local1555.aClass13_17;
										if (local1560.anInt457 < 0) {
											break;
										}
										local1569 = Static5.method32(local1560.anInt456);
									} while (local1569 == null || local1569.aClass13Array3 == null || local1560.anInt457 >= local1569.aClass13Array3.length || local1560 != local1569.aClass13Array3[local1560.anInt457]);
									Static82.method1767(local1555);
								}
							}
							local1560 = local1555.aClass13_17;
							if (local1560.anInt457 < 0) {
								break;
							}
							local1569 = Static5.method32(local1560.anInt456);
						} while (local1569 == null || local1569.aClass13Array3 == null || local1569.aClass13Array3.length <= local1560.anInt457 || local1569.aClass13Array3[local1560.anInt457] != local1560);
						Static82.method1767(local1555);
					}
				}
				local1560 = local1555.aClass13_17;
				if (local1560.anInt457 < 0) {
					break;
				}
				local1569 = Static5.method32(local1560.anInt456);
			} while (local1569 == null || local1569.aClass13Array3 == null || local1560.anInt457 >= local1569.aClass13Array3.length || local1569.aClass13Array3[local1560.anInt457] != local1560);
			Static82.method1767(local1555);
		}
	}
}
