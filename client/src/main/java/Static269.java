import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!wa", name = "z", descriptor = "[I")
	public static int[] anIntArray252;

	@OriginalMember(owner = "client!wa", name = "ub", descriptor = "Lclient!bn;")
	public static Map aClass3_Sub2_Sub4_2;

	@OriginalMember(owner = "client!wa", name = "X", descriptor = "[Lclient!na;")
	public static JagString[] aClass100Array87 = null;

	@OriginalMember(owner = "client!wa", name = "pb", descriptor = "Lclient!na;")
	public static final JagString aClass100_556 = Static28.parse("<br>");

	@OriginalMember(owner = "client!wa", name = "Eb", descriptor = "[Lclient!bg;")
	public static final Js5CachedResourceProvider[] aClass14_Sub1Array3 = new Js5CachedResourceProvider[28];

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
	public static void method2170() {
		Static250.anInt5434++;
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(B)V")
	public static void method2172() {
		Static118.aClass99_16.method3104();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([Lclient!mj;ZIIIII[B)V")
	public static void method2203(@OriginalArg(0) CollisionMap[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6) {
		@Pc(14) int local14;
		@Pc(21) int local21;
		if (!arg1) {
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				for (local14 = 0; local14 < 64; local14++) {
					for (local21 = 0; local21 < 64; local21++) {
						if (arg4 + local14 > 0 && local14 + arg4 < 103 && arg3 + local21 > 0 && local21 + arg3 < 103) {
							arg0[local9].anIntArrayArray30[local14 + arg4][arg3 + local21] &= 0xFEFFFFFF;
						}
					}
				}
			}
		}
		@Pc(95) Buffer local95 = new Buffer(arg6);
		@Pc(99) byte local99;
		if (arg1) {
			local99 = 1;
		} else {
			local99 = 4;
		}
		@Pc(117) int local117;
		for (local14 = 0; local14 < local99; local14++) {
			for (local21 = 0; local21 < 64; local21++) {
				for (local117 = 0; local117 < 64; local117++) {
					Static278.method4651(arg2, arg5, arg1, local95, local117 + arg3, arg4 + local21, 0, local14);
				}
			}
		}
		@Pc(146) boolean local146 = false;
		@Pc(243) int local243;
		@Pc(188) int local188;
		@Pc(190) int local190;
		@Pc(194) int local194;
		while (local95.offset < local95.data.length) {
			local21 = local95.g1();
			if (local21 != 129) {
				local95.offset--;
				break;
			}
			for (local117 = 0; local117 < 4; local117++) {
				@Pc(168) byte local168 = local95.g1s();
				if (local168 == 0) {
					local243 = arg4;
					if (arg4 < 0) {
						local243 = 0;
					} else if (arg4 >= 104) {
						local243 = 104;
					}
					local190 = arg3;
					if (arg3 < 0) {
						local190 = 0;
					} else if (arg3 >= 104) {
						local190 = 104;
					}
					local188 = arg4 + 64;
					local194 = arg3 + 64;
					if (local194 < 0) {
						local194 = 0;
					} else if (local194 >= 104) {
						local194 = 104;
					}
					if (local188 < 0) {
						local188 = 0;
					} else if (local188 >= 104) {
						local188 = 104;
					}
					while (local243 < local188) {
						while (local190 < local194) {
							Static232.aByteArrayArrayArray13[local117][local243][local190] = 0;
							local190++;
						}
						local243++;
					}
				} else if (local168 == 1) {
					for (local243 = 0; local243 < 64; local243 += 4) {
						for (local188 = 0; local188 < 64; local188 += 4) {
							@Pc(305) byte local305 = local95.g1s();
							for (local194 = local243 + arg4; local194 < arg4 + local243 + 4; local194++) {
								for (@Pc(320) int local320 = arg3 + local188; local320 < arg3 + local188 + 4; local320++) {
									if (local194 >= 0 && local194 < 104 && local320 >= 0 && local320 < 104) {
										Static232.aByteArrayArrayArray13[local117][local194][local320] = local305;
									}
								}
							}
						}
					}
				} else if (local168 == 2 && local117 > 0) {
					local188 = arg4 + 64;
					local190 = arg3;
					local194 = arg3 + 64;
					if (local188 < 0) {
						local188 = 0;
					} else if (local188 >= 104) {
						local188 = 104;
					}
					if (arg3 < 0) {
						local190 = 0;
					} else if (arg3 >= 104) {
						local190 = 104;
					}
					if (local194 < 0) {
						local194 = 0;
					} else if (local194 >= 104) {
						local194 = 104;
					}
					local243 = arg4;
					if (arg4 < 0) {
						local243 = 0;
					} else if (arg4 >= 104) {
						local243 = 104;
					}
					while (local188 > local243) {
						while (local190 < local194) {
							Static232.aByteArrayArrayArray13[local117][local243][local190] = Static232.aByteArrayArrayArray13[local117 - 1][local243][local190];
							local190++;
						}
						local243++;
					}
				}
			}
			local146 = true;
		}
		@Pc(515) int local515;
		if (GlRenderer.enabled && !arg1) {
			@Pc(490) Environment local490 = null;
			label270: while (true) {
				label263: do {
					while (local95.offset < local95.data.length) {
						local117 = local95.g1();
						if (local117 != 0) {
							if (local117 != 1) {
								throw new IllegalStateException();
							}
							local515 = local95.g1();
							continue label263;
						}
						local490 = new Environment(local95);
					}
					if (local490 == null) {
						local490 = new Environment();
					}
					for (local117 = 0; local117 < 8; local117++) {
						for (local515 = 0; local515 < 8; local515++) {
							local243 = local117 + (arg4 >> 3);
							local188 = (arg3 >> 3) + local515;
							if (local243 >= 0 && local243 < 13 && local188 >= 0 && local188 < 13) {
								Static192.aClass92ArrayArray1[local243][local188] = local490;
							}
						}
					}
					break label270;
				} while (local515 <= 0);
				for (local243 = 0; local243 < local515; local243++) {
					@Pc(529) Light local529 = new Light(local95);
					if (local529.anInt2243 == 31) {
						@Pc(541) LightType local541 = Static140.method2709(local95.g2());
						local529.method1762(local541.anInt2865, local541.anInt2873, local541.anInt2867, local541.anInt2872);
					}
					local529.anInt2245 += arg3 << 7;
					local529.anInt2240 += arg4 << 7;
					local194 = local529.anInt2245 >> 7;
					local190 = local529.anInt2240 >> 7;
					if (local190 >= 0 && local194 >= 0 && local190 < 104 && local194 < 104) {
						local529.aBoolean125 = (Static12.aByteArrayArrayArray2[1][local190][local194] & 0x2) != 0;
						local529.anInt2235 = Static83.anIntArrayArrayArray4[local529.anInt2241][local190][local194] - local529.anInt2235;
						Static120.method2389(local529);
					}
				}
			}
		}
		if (local146) {
			return;
		}
		for (local21 = 0; local21 < 4; local21++) {
			for (local117 = 0; local117 < 16; local117++) {
				for (local515 = 0; local515 < 16; local515++) {
					local243 = (arg4 >> 2) + local117;
					local188 = local515 + (arg3 >> 2);
					if (local243 >= 0 && local243 < 26 && local188 >= 0 && local188 < 26) {
						Static232.aByteArrayArrayArray13[local21][local243][local188] = 0;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)Lclient!bm;")
	public static GroundDecor method2210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Tile local7 = Static130.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass15_1 == null ? null : local7.aClass15_1;
	}

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "(I)V")
	public static void method2218() {
		@Pc(8) int local8 = Static236.method4047();
		if (local8 == 0) {
			Static266.aByteArrayArrayArray15 = null;
			Static232.method3993(0);
		} else if (local8 == 1) {
			Static38.method960((byte) 0);
			Static232.method3993(512);
			Static132.method2608();
		} else {
			Static38.method960((byte) (Static136.anInt3325 - 4 & 0xFF));
			Static232.method3993(2);
		}
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(BI)V")
	public static void method2221() {
		Static125.aClass99_19.method3102(5);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIII)V")
	public static void method2225(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static41.anInt1309 < 100) {
			Static186.method3413();
		}
		if (GlRenderer.enabled) {
			Static46.method1187(arg0, arg1, arg0 + arg3, arg2 + arg1);
		} else {
			Static129.method2496(arg0, arg1, arg0 + arg3, arg2 + arg1);
		}
		@Pc(50) int local50;
		@Pc(61) int local61;
		if (Static41.anInt1309 < 100) {
			local50 = arg0 + arg3 / 2;
			local61 = arg2 / 2 + arg1 - 18 - 20;
			if (GlRenderer.enabled) {
				Static46.method1186(arg0, arg1, arg3, arg2, 0);
				Static46.method1179(local50 - 152, local61, 304, 34, 9179409);
				Static46.method1179(local50 - 151, local61 + 1, 302, 32, 0);
				Static46.method1186(local50 - 150, local61 + 2, Static41.anInt1309 * 3, 30, 9179409);
				Static46.method1186(local50 + Static41.anInt1309 * 3 - 150, local61 - -2, 300 - Static41.anInt1309 * 3, 30, 0);
			} else {
				Static129.method2495(arg0, arg1, arg3, arg2, 0);
				Static129.method2483(local50 - 152, local61, 304, 34, 9179409);
				Static129.method2483(local50 - 151, local61 + 1, 302, 32, 0);
				Static129.method2495(local50 - 150, local61 + 2, Static41.anInt1309 * 3, 30, 9179409);
				Static129.method2495(Static41.anInt1309 * 3 + local50 - 150, local61 - -2, 300 - Static41.anInt1309 * 3, 30, 0);
			}
			Static280.aClass3_Sub2_Sub9_43.method2875(LocalizedText.LOADINGDOTDOTDOT, local50, local61 + 20, 16777215, -1);
			return;
		}
		Static37.anInt1176 = (int) ((float) (arg2 * 2) / Static83.aFloat3);
		Static109.anInt2882 = Static13.anInt435 - (int) ((float) arg3 / Static83.aFloat3);
		@Pc(211) int local211 = Static13.anInt435 - (int) ((float) arg3 / Static83.aFloat3);
		local50 = Static28.anInt919 - (int) ((float) arg2 / Static83.aFloat3);
		Static109.anInt2884 = Static28.anInt919 - (int) ((float) arg2 / Static83.aFloat3);
		@Pc(236) int local236 = Static28.anInt919 + (int) ((float) arg2 / Static83.aFloat3);
		local61 = (int) ((float) arg3 / Static83.aFloat3) + Static13.anInt435;
		Static89.anInt2387 = (int) ((float) (arg3 * 2) / Static83.aFloat3);
		if (GlRenderer.enabled) {
			if (Static153.aClass3_Sub2_Sub1_Sub1_2 == null || Static153.aClass3_Sub2_Sub1_Sub1_2.anInt1867 != arg3 || Static153.aClass3_Sub2_Sub1_Sub1_2.anInt1859 != arg2) {
				Static153.aClass3_Sub2_Sub1_Sub1_2 = null;
				Static153.aClass3_Sub2_Sub1_Sub1_2 = new SoftwareSprite(arg3, arg2);
			}
			Static129.method2491(Static153.aClass3_Sub2_Sub1_Sub1_2.anIntArray20, arg3, arg2);
			Static214.method4364(arg3, 0, local61, local50, 0, local236, arg2, local211);
			Static48.method1195(arg3, 0, local61, local236, arg2, 0, local211, local50);
			Static38.method959(0, 0, local211, arg3, local236, local50, local61, arg2);
			Static46.method1178(Static153.aClass3_Sub2_Sub1_Sub1_2.anIntArray20, arg0, arg1, arg3, arg2);
			Static129.anIntArray297 = null;
		} else {
			Static214.method4364(arg3 + arg0, arg1, local61, local50, arg0, local236, arg1 + arg2, local211);
			Static48.method1195(arg0 + arg3, arg0, local61, local236, arg2 + arg1, arg1, local211, local50);
			Static38.method959(arg0, arg1, local211, arg0 + arg3, local236, local50, local61, arg2 + arg1);
		}
		if (Static201.anInt1864 > 0) {
			Static91.anInt2428--;
			if (Static91.anInt2428 == 0) {
				Static91.anInt2428 = 20;
				Static201.anInt1864--;
			}
		}
		if (!Static43.displayFps) {
			return;
		}
		@Pc(405) int local405 = arg1 + arg2 - 8;
		@Pc(412) int local412 = arg0 + arg3 - 5;
		Static215.aClass3_Sub2_Sub9_32.method2864(Static34.method882(new JagString[] { Static115.aClass100_579, Static123.method2423(Static243.anInt5359) }), local412, local405, 16776960, -1);
		@Pc(434) Runtime local434 = Runtime.getRuntime();
		@Pc(443) int local443 = (int) ((local434.totalMemory() - local434.freeMemory()) / 1024L);
		@Pc(445) int local445 = 16776960;
		@Pc(446) int local446 = local405 - 15;
		if (local443 > 65536) {
			local445 = 16711680;
		}
		Static215.aClass3_Sub2_Sub9_32.method2864(Static34.method882(new JagString[] { Static203.aClass100_894, Static123.method2423(local443), Static19.aClass100_112 }), local412, local446, local445, -1);
		local405 = local446 - 15;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)Lclient!na;")
	public static JagString method2228(@OriginalArg(0) int arg0) {
		return Static233.aClass100Array160[arg0].length() > 0 ? Static34.method882(new JagString[] { Static254.aClass100Array168[arg0], LocalizedText.MINISEPARATOR, Static233.aClass100Array160[arg0] }) : Static254.aClass100Array168[arg0];
	}
}
