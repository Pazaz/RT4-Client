import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "[Lclient!pe;")
	public static Class120[] aClass120Array2;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
	public static int anInt5405;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIII)V")
	public static void method4244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static172.anInt4164 <= arg1 && Static224.anInt5063 >= arg3 && Static267.anInt5773 <= arg2 && arg4 <= Static106.anInt2869) {
			if (arg5 == 1) {
				Static134.method2622(arg0, arg3, arg2, arg4, arg1);
			} else {
				Static183.method3334(arg3, arg2, arg0, arg4, arg5, arg1);
			}
		} else if (arg5 == 1) {
			Static173.method3246(arg0, arg1, arg4, arg3, arg2);
		} else {
			Static10.method352(arg4, arg5, arg3, arg1, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!bj;Z)V")
	public static void method4245(@OriginalArg(0) Tile arg0, @OriginalArg(1) boolean arg1) {
		Static7.aClass69_32.method2282(arg0);
		while (true) {
			@Pc(8) Tile local8;
			@Pc(18) int local18;
			@Pc(21) int local21;
			@Pc(24) int local24;
			@Pc(27) int local27;
			@Pc(31) Tile[][] local31;
			@Pc(65) int local65;
			@Pc(115) int local115;
			@Pc(894) int local894;
			@Pc(899) int local899;
			@Pc(904) int local904;
			@Pc(153) Tile local153;
			@Pc(1332) int local1332;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(44) int var9;
										@Pc(48) int var10;
										@Pc(907) int var17;
										@Pc(916) int var18;
										@Pc(363) Wall var22;
										@Pc(469) boolean var24;
										@Pc(425) Scenery var25;
										@Pc(1179) Tile var32;
										while (true) {
											do {
												local8 = (Tile) Static7.aClass69_32.method2287();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean46);
											local18 = local8.anInt669;
											local21 = local8.anInt666;
											local24 = local8.anInt672;
											local27 = local8.anInt668;
											local31 = Static130.aClass3_Sub5ArrayArrayArray1[local24];
											@Pc(33) float local33 = 0.0F;
											if (GlRenderer.enabled) {
												if (Static80.anIntArrayArrayArray19 == Static83.anIntArrayArrayArray4) {
													var9 = Static62.anIntArrayArray11[local18][local21];
													var10 = var9 & 0xFFFFFF;
													if (var10 != Static152.anInt3604) {
														Static152.anInt3604 = var10;
														Static21.method619(var10);
														Static161.method3066(Static123.method2422());
													}
													local65 = var9 >>> 24 << 3;
													if (local65 != Static22.anInt730) {
														Static22.anInt730 = local65;
														Static147.method2761(local65);
													}
													local115 = Static107.anIntArrayArrayArray10[0][local18][local21] + Static107.anIntArrayArrayArray10[0][local18 + 1][local21] + Static107.anIntArrayArrayArray10[0][local18][local21 + 1] + Static107.anIntArrayArrayArray10[0][local18 + 1][local21 + 1] >> 2;
													Static27.setMaterial(-local115, 3);
													local33 = 201.5F;
													GlRenderer.method4159(local33);
												} else {
													local33 = 201.5F - (float) (local27 + 1) * 50.0F;
													GlRenderer.method4159(local33);
												}
											}
											if (!local8.aBoolean45) {
												break;
											}
											if (arg1) {
												if (local24 > 0) {
													local153 = Static130.aClass3_Sub5ArrayArrayArray1[local24 - 1][local18][local21];
													if (local153 != null && local153.aBoolean46) {
														continue;
													}
												}
												if (local18 <= Static167.anInt4069 && local18 > Static31.anInt987) {
													local153 = local31[local18 - 1][local21];
													if (local153 != null && local153.aBoolean46 && (local153.aBoolean45 || (local8.anInt664 & 0x1) == 0)) {
														continue;
													}
												}
												if (local18 >= Static167.anInt4069 && local18 < Static2.anInt15 - 1) {
													local153 = local31[local18 + 1][local21];
													if (local153 != null && local153.aBoolean46 && (local153.aBoolean45 || (local8.anInt664 & 0x4) == 0)) {
														continue;
													}
												}
												if (local21 <= Static193.anInt4539 && local21 > Static80.anInt4698) {
													local153 = local31[local18][local21 - 1];
													if (local153 != null && local153.aBoolean46 && (local153.aBoolean45 || (local8.anInt664 & 0x8) == 0)) {
														continue;
													}
												}
												if (local21 >= Static193.anInt4539 && local21 < Static215.anInt4866 - 1) {
													local153 = local31[local18][local21 + 1];
													if (local153 != null && local153.aBoolean46 && (local153.aBoolean45 || (local8.anInt664 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean45 = false;
											if (local8.aClass3_Sub5_1 != null) {
												local153 = local8.aClass3_Sub5_1;
												if (GlRenderer.enabled) {
													GlRenderer.method4159(201.5F - (float) (local153.anInt668 + 1) * 50.0F);
												}
												if (local153.aClass131_1 == null) {
													if (local153.aClass43_1 != null) {
														if (Static9.method187(0, local18, local21)) {
															Static147.method2762(local153.aClass43_1, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local18, local21, true);
														} else {
															Static147.method2762(local153.aClass43_1, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local18, local21, false);
														}
													}
												} else if (Static9.method187(0, local18, local21)) {
													Static132.method2610(local153.aClass131_1, 0, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local18, local21, true);
												} else {
													Static132.method2610(local153.aClass131_1, 0, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local18, local21, false);
												}
												var22 = local153.aClass77_1;
												if (var22 != null) {
													if (GlRenderer.enabled) {
														if ((var22.anInt3049 & local8.anInt670) == 0) {
															Static120.method2393(Static149.anInt3555, Static162.anInt3947, Static217.anInt4903, local24, local18, local21);
														} else {
															Static120.method2388(var22.anInt3049, Static149.anInt3555, Static162.anInt3947, Static217.anInt4903, local27, local18, local21);
														}
													}
													var22.aClass8_5.method4546(0, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, var22.anInt3048 - Static149.anInt3555, var22.anInt3051 - Static162.anInt3947, var22.anInt3044 - Static217.anInt4903, var22.aLong107, local24, null);
												}
												for (local65 = 0; local65 < local153.anInt662; local65++) {
													var25 = local153.aClass31Array1[local65];
													if (var25 != null) {
														if (GlRenderer.enabled) {
															Static120.method2393(Static149.anInt3555, Static162.anInt3947, Static217.anInt4903, local24, local18, local21);
														}
														var25.aClass8_4.method4546(var25.anInt1714, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, var25.anInt1699 - Static149.anInt3555, var25.anInt1706 - Static162.anInt3947, var25.anInt1703 - Static217.anInt4903, var25.aLong56, local24, null);
													}
												}
												if (GlRenderer.enabled) {
													GlRenderer.method4159(local33);
												}
											}
											var24 = false;
											if (local8.aClass131_1 == null) {
												if (local8.aClass43_1 != null) {
													if (Static9.method187(local27, local18, local21)) {
														Static147.method2762(local8.aClass43_1, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local18, local21, true);
													} else {
														var24 = true;
														Static147.method2762(local8.aClass43_1, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local18, local21, false);
													}
												}
											} else if (Static9.method187(local27, local18, local21)) {
												Static132.method2610(local8.aClass131_1, local27, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local18, local21, true);
											} else {
												var24 = true;
												if (local8.aClass131_1.anInt4865 != 12345678 || Static158.aBoolean187 && local24 <= Static160.anInt3902) {
													Static132.method2610(local8.aClass131_1, local27, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local18, local21, false);
												}
											}
											if (var24) {
												@Pc(549) GroundDecor local549 = local8.aClass15_1;
												if (local549 != null && (local549.aLong26 & 0x80000000L) != 0L) {
													if (GlRenderer.enabled && local549.aBoolean49) {
														GlRenderer.method4159(local33 + 50.0F - 1.5F);
													}
													if (GlRenderer.enabled) {
														Static120.method2393(Static149.anInt3555, Static162.anInt3947, Static217.anInt4903, local24, local18, local21);
													}
													local549.aClass8_1.method4546(0, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local549.anInt732 - Static149.anInt3555, local549.anInt733 - Static162.anInt3947, local549.anInt736 - Static217.anInt4903, local549.aLong26, local24, null);
													if (GlRenderer.enabled && local549.aBoolean49) {
														GlRenderer.method4159(local33);
													}
												}
											}
											var10 = 0;
											local65 = 0;
											@Pc(616) Wall local616 = local8.aClass77_1;
											@Pc(619) WallDecor local619 = local8.aClass24_1;
											if (local616 != null || local619 != null) {
												if (Static167.anInt4069 == local18) {
													var10++;
												} else if (Static167.anInt4069 < local18) {
													var10 += 2;
												}
												if (Static193.anInt4539 == local21) {
													var10 += 3;
												} else if (Static193.anInt4539 > local21) {
													var10 += 6;
												}
												local65 = Static138.anIntArray324[var10];
												local8.anInt670 = Static191.anIntArray386[var10];
											}
											if (local616 != null) {
												if ((local616.anInt3049 & Static90.anIntArray215[var10]) == 0) {
													local8.anInt663 = 0;
												} else if (local616.anInt3049 == 16) {
													local8.anInt663 = 3;
													local8.anInt665 = Static128.anIntArray294[var10];
													local8.anInt667 = 3 - local8.anInt665;
												} else if (local616.anInt3049 == 32) {
													local8.anInt663 = 6;
													local8.anInt665 = Static254.anIntArray489[var10];
													local8.anInt667 = 6 - local8.anInt665;
												} else if (local616.anInt3049 == 64) {
													local8.anInt663 = 12;
													local8.anInt665 = Static86.anIntArray211[var10];
													local8.anInt667 = 12 - local8.anInt665;
												} else {
													local8.anInt663 = 9;
													local8.anInt665 = Static131.anIntArray307[var10];
													local8.anInt667 = 9 - local8.anInt665;
												}
												if ((local616.anInt3049 & local65) != 0 && !Static260.method3850(local27, local18, local21, local616.anInt3049)) {
													if (GlRenderer.enabled) {
														Static120.method2393(Static149.anInt3555, Static162.anInt3947, Static217.anInt4903, local24, local18, local21);
													}
													local616.aClass8_5.method4546(0, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local616.anInt3048 - Static149.anInt3555, local616.anInt3051 - Static162.anInt3947, local616.anInt3044 - Static217.anInt4903, local616.aLong107, local24, null);
												}
												if ((local616.anInt3052 & local65) != 0 && !Static260.method3850(local27, local18, local21, local616.anInt3052)) {
													if (GlRenderer.enabled) {
														Static120.method2393(Static149.anInt3555, Static162.anInt3947, Static217.anInt4903, local24, local18, local21);
													}
													local616.aClass8_6.method4546(0, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local616.anInt3048 - Static149.anInt3555, local616.anInt3051 - Static162.anInt3947, local616.anInt3044 - Static217.anInt4903, local616.aLong107, local24, null);
												}
											}
											if (local619 != null && !Static276.method4611(local27, local18, local21, local619.aClass8_3.method4549())) {
												if (GlRenderer.enabled) {
													GlRenderer.method4159(local33 - 0.5F);
												}
												if ((local619.anInt1395 & local65) != 0) {
													if (GlRenderer.enabled) {
														Static120.method2393(Static149.anInt3555, Static162.anInt3947, Static217.anInt4903, local24, local18, local21);
													}
													local619.aClass8_3.method4546(0, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local619.anInt1390 + local619.anInt1394 - Static149.anInt3555, local619.anInt1391 - Static162.anInt3947, local619.anInt1393 + local619.anInt1392 - Static217.anInt4903, local619.aLong52, local24, null);
												} else if (local619.anInt1395 == 256) {
													local894 = local619.anInt1390 - Static149.anInt3555;
													local899 = local619.anInt1391 - Static162.anInt3947;
													local904 = local619.anInt1393 - Static217.anInt4903;
													var17 = local619.anInt1388;
													if (var17 == 1 || var17 == 2) {
														var18 = -local894;
													} else {
														var18 = local894;
													}
													@Pc(928) int local928;
													if (var17 == 2 || var17 == 3) {
														local928 = -local904;
													} else {
														local928 = local904;
													}
													if (local928 < var18) {
														if (GlRenderer.enabled) {
															Static120.method2393(Static149.anInt3555, Static162.anInt3947, Static217.anInt4903, local24, local18, local21);
														}
														local619.aClass8_3.method4546(0, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local894 + local619.anInt1394, local899, local904 + local619.anInt1392, local619.aLong52, local24, null);
													} else if (local619.aClass8_2 != null) {
														if (GlRenderer.enabled) {
															Static120.method2393(Static149.anInt3555, Static162.anInt3947, Static217.anInt4903, local24, local18, local21);
														}
														local619.aClass8_2.method4546(0, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local894, local899, local904, local619.aLong52, local24, null);
													}
												}
												if (GlRenderer.enabled) {
													GlRenderer.method4159(local33);
												}
											}
											if (var24) {
												@Pc(1001) GroundDecor local1001 = local8.aClass15_1;
												if (local1001 != null && (local1001.aLong26 & 0x80000000L) == 0L) {
													if (GlRenderer.enabled && local1001.aBoolean49) {
														GlRenderer.method4159(local33 + 50.0F - 1.5F);
													}
													if (GlRenderer.enabled) {
														Static120.method2393(Static149.anInt3555, Static162.anInt3947, Static217.anInt4903, local24, local18, local21);
													}
													local1001.aClass8_1.method4546(0, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local1001.anInt732 - Static149.anInt3555, local1001.anInt733 - Static162.anInt3947, local1001.anInt736 - Static217.anInt4903, local1001.aLong26, local24, null);
													if (GlRenderer.enabled && local1001.aBoolean49) {
														GlRenderer.method4159(local33);
													}
												}
												@Pc(1064) ObjStackEntity local1064 = local8.aClass79_1;
												if (local1064 != null && local1064.anInt3063 == 0) {
													if (GlRenderer.enabled) {
														Static120.method2393(Static149.anInt3555, Static162.anInt3947, Static217.anInt4903, local24, local18, local21);
													}
													if (local1064.aClass8_7 != null) {
														local1064.aClass8_7.method4546(0, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local1064.anInt3064 - Static149.anInt3555, local1064.anInt3057 - Static162.anInt3947, local1064.anInt3061 - Static217.anInt4903, local1064.aLong108, local24, null);
													}
													if (local1064.aClass8_8 != null) {
														local1064.aClass8_8.method4546(0, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local1064.anInt3064 - Static149.anInt3555, local1064.anInt3057 - Static162.anInt3947, local1064.anInt3061 - Static217.anInt4903, local1064.aLong108, local24, null);
													}
													if (local1064.aClass8_9 != null) {
														local1064.aClass8_9.method4546(0, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local1064.anInt3064 - Static149.anInt3555, local1064.anInt3057 - Static162.anInt3947, local1064.anInt3061 - Static217.anInt4903, local1064.aLong108, local24, null);
													}
												}
											}
											local894 = local8.anInt664;
											if (local894 != 0) {
												if (local18 < Static167.anInt4069 && (local894 & 0x4) != 0) {
													var32 = local31[local18 + 1][local21];
													if (var32 != null && var32.aBoolean46) {
														Static7.aClass69_32.method2282(var32);
													}
												}
												if (local21 < Static193.anInt4539 && (local894 & 0x2) != 0) {
													var32 = local31[local18][local21 + 1];
													if (var32 != null && var32.aBoolean46) {
														Static7.aClass69_32.method2282(var32);
													}
												}
												if (local18 > Static167.anInt4069 && (local894 & 0x1) != 0) {
													var32 = local31[local18 - 1][local21];
													if (var32 != null && var32.aBoolean46) {
														Static7.aClass69_32.method2282(var32);
													}
												}
												if (local21 > Static193.anInt4539 && (local894 & 0x8) != 0) {
													var32 = local31[local18][local21 - 1];
													if (var32 != null && var32.aBoolean46) {
														Static7.aClass69_32.method2282(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt663 != 0) {
											var24 = true;
											for (var10 = 0; var10 < local8.anInt662; var10++) {
												if (local8.aClass31Array1[var10].anInt1707 != Static13.anInt437 && (local8.anIntArray59[var10] & local8.anInt663) == local8.anInt665) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												var22 = local8.aClass77_1;
												if (!Static260.method3850(local27, local18, local21, var22.anInt3049)) {
													if (GlRenderer.enabled) {
														label882: {
															if ((var22.aLong107 & 0xFC000L) == 16384L) {
																local65 = var22.anInt3048 - Static149.anInt3555;
																local115 = var22.anInt3044 - Static217.anInt4903;
																local1332 = (int) (var22.aLong107 >> 20 & 0x3L);
																if (local1332 == 0) {
																	local65 -= 64;
																	local115 += 64;
																	if (local115 < local65 && local18 > 0 && local21 < Static99.anInt2550 - 1) {
																		Static120.method2393(Static149.anInt3555, Static162.anInt3947, Static217.anInt4903, local24, local18 - 1, local21 + 1);
																		break label882;
																	}
																} else if (local1332 == 1) {
																	local65 += 64;
																	local115 += 64;
																	if (local115 < -local65 && local18 < Static152.anInt3594 - 1 && local21 < Static99.anInt2550 - 1) {
																		Static120.method2393(Static149.anInt3555, Static162.anInt3947, Static217.anInt4903, local24, local18 + 1, local21 + 1);
																		break label882;
																	}
																} else if (local1332 == 2) {
																	local65 += 64;
																	local115 -= 64;
																	if (local115 > local65 && local18 < Static152.anInt3594 - 1 && local21 > 0) {
																		Static120.method2393(Static149.anInt3555, Static162.anInt3947, Static217.anInt4903, local24, local18 + 1, local21 - 1);
																		break label882;
																	}
																} else if (local1332 == 3) {
																	local65 -= 64;
																	local115 -= 64;
																	if (local115 > -local65 && local18 > 0 && local21 > 0) {
																		Static120.method2393(Static149.anInt3555, Static162.anInt3947, Static217.anInt4903, local24, local18 - 1, local21 - 1);
																		break label882;
																	}
																}
															}
															Static120.method2393(Static149.anInt3555, Static162.anInt3947, Static217.anInt4903, local24, local18, local21);
														}
													}
													var22.aClass8_5.method4546(0, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, var22.anInt3048 - Static149.anInt3555, var22.anInt3051 - Static162.anInt3947, var22.anInt3044 - Static217.anInt4903, var22.aLong107, local24, null);
												}
												local8.anInt663 = 0;
											}
										}
										if (!local8.aBoolean47) {
											break;
										}
										try {
											var9 = local8.anInt662;
											local8.aBoolean47 = false;
											var10 = 0;
											label767: for (local65 = 0; local65 < var9; local65++) {
												var25 = local8.aClass31Array1[local65];
												if (var25.anInt1707 != Static13.anInt437) {
													for (local1332 = var25.anInt1701; local1332 <= var25.anInt1713; local1332++) {
														for (local894 = var25.anInt1696; local894 <= var25.anInt1698; local894++) {
															var32 = local31[local1332][local894];
															if (var32.aBoolean45) {
																local8.aBoolean47 = true;
																continue label767;
															}
															if (var32.anInt663 != 0) {
																local904 = 0;
																if (local1332 > var25.anInt1701) {
																	local904++;
																}
																if (local1332 < var25.anInt1713) {
																	local904 += 4;
																}
																if (local894 > var25.anInt1696) {
																	local904 += 8;
																}
																if (local894 < var25.anInt1698) {
																	local904 += 2;
																}
																if ((local904 & var32.anInt663) == local8.anInt667) {
																	local8.aBoolean47 = true;
																	continue label767;
																}
															}
														}
													}
													Static25.aClass31Array2[var10++] = var25;
													local1332 = Static167.anInt4069 - var25.anInt1701;
													local894 = var25.anInt1713 - Static167.anInt4069;
													if (local894 > local1332) {
														local1332 = local894;
													}
													local899 = Static193.anInt4539 - var25.anInt1696;
													local904 = var25.anInt1698 - Static193.anInt4539;
													if (local904 > local899) {
														var25.anInt1705 = local1332 + local904;
													} else {
														var25.anInt1705 = local1332 + local899;
													}
												}
											}
											while (var10 > 0) {
												local65 = -50;
												local115 = -1;
												for (local1332 = 0; local1332 < var10; local1332++) {
													@Pc(1628) Scenery local1628 = Static25.aClass31Array2[local1332];
													if (local1628.anInt1707 != Static13.anInt437) {
														if (local1628.anInt1705 > local65) {
															local65 = local1628.anInt1705;
															local115 = local1332;
														} else if (local1628.anInt1705 == local65) {
															local899 = local1628.anInt1699 - Static149.anInt3555;
															local904 = local1628.anInt1703 - Static217.anInt4903;
															var17 = Static25.aClass31Array2[local115].anInt1699 - Static149.anInt3555;
															var18 = Static25.aClass31Array2[local115].anInt1703 - Static217.anInt4903;
															if (local899 * local899 + local904 * local904 > var17 * var17 + var18 * var18) {
																local115 = local1332;
															}
														}
													}
												}
												if (local115 == -1) {
													break;
												}
												@Pc(1697) Scenery local1697 = Static25.aClass31Array2[local115];
												local1697.anInt1707 = Static13.anInt437;
												if (!Static73.method1599(local27, local1697.anInt1701, local1697.anInt1713, local1697.anInt1696, local1697.anInt1698, local1697.aClass8_4.method4549())) {
													if (GlRenderer.enabled) {
														if ((local1697.aLong56 & 0xFC000L) == 147456L) {
															Static120.method2393(Static149.anInt3555, Static162.anInt3947, Static217.anInt4903, local24, local18, local21);
															local894 = local1697.anInt1699 - Static149.anInt3555;
															local899 = local1697.anInt1703 - Static217.anInt4903;
															local904 = (int) (local1697.aLong56 >> 20 & 0x3L);
															if (local904 == 1 || local904 == 3) {
																if (local899 > -local894) {
																	Static120.method2397(local24, local18, local21 - 1, local18 - 1, local21);
																} else {
																	Static120.method2397(local24, local18, local21 + 1, local18 + 1, local21);
																}
															} else if (local899 > local894) {
																Static120.method2397(local24, local18, local21 - 1, local18 + 1, local21);
															} else {
																Static120.method2397(local24, local18, local21 + 1, local18 - 1, local21);
															}
														} else {
															Static120.method2391(Static149.anInt3555, Static162.anInt3947, Static217.anInt4903, local24, local1697.anInt1701, local1697.anInt1696, local1697.anInt1713, local1697.anInt1698);
														}
													}
													local1697.aClass8_4.method4546(local1697.anInt1714, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local1697.anInt1699 - Static149.anInt3555, local1697.anInt1706 - Static162.anInt3947, local1697.anInt1703 - Static217.anInt4903, local1697.aLong56, local24, null);
												}
												for (local894 = local1697.anInt1701; local894 <= local1697.anInt1713; local894++) {
													for (local899 = local1697.anInt1696; local899 <= local1697.anInt1698; local899++) {
														@Pc(1863) Tile local1863 = local31[local894][local899];
														if (local1863.anInt663 != 0) {
															Static7.aClass69_32.method2282(local1863);
														} else if ((local894 != local18 || local899 != local21) && local1863.aBoolean46) {
															Static7.aClass69_32.method2282(local1863);
														}
													}
												}
											}
											if (!local8.aBoolean47) {
												break;
											}
										} catch (@Pc(1895) Exception local1895) {
											local8.aBoolean47 = false;
											break;
										}
									}
								} while (!local8.aBoolean46);
							} while (local8.anInt663 != 0);
							if (local18 > Static167.anInt4069 || local18 <= Static31.anInt987) {
								break;
							}
							local153 = local31[local18 - 1][local21];
						} while (local153 != null && local153.aBoolean46);
						if (local18 < Static167.anInt4069 || local18 >= Static2.anInt15 - 1) {
							break;
						}
						local153 = local31[local18 + 1][local21];
					} while (local153 != null && local153.aBoolean46);
					if (local21 > Static193.anInt4539 || local21 <= Static80.anInt4698) {
						break;
					}
					local153 = local31[local18][local21 - 1];
				} while (local153 != null && local153.aBoolean46);
				if (local21 < Static193.anInt4539 || local21 >= Static215.anInt4866 - 1) {
					break;
				}
				local153 = local31[local18][local21 + 1];
			} while (local153 != null && local153.aBoolean46);
			local8.aBoolean46 = false;
			Static211.anInt1142--;
			@Pc(1999) ObjStackEntity local1999 = local8.aClass79_1;
			if (local1999 != null && local1999.anInt3063 != 0) {
				if (GlRenderer.enabled) {
					Static120.method2393(Static149.anInt3555, Static162.anInt3947, Static217.anInt4903, local24, local18, local21);
				}
				if (local1999.aClass8_7 != null) {
					local1999.aClass8_7.method4546(0, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local1999.anInt3064 - Static149.anInt3555, local1999.anInt3057 - Static162.anInt3947 - local1999.anInt3063, local1999.anInt3061 - Static217.anInt4903, local1999.aLong108, local24, null);
				}
				if (local1999.aClass8_8 != null) {
					local1999.aClass8_8.method4546(0, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local1999.anInt3064 - Static149.anInt3555, local1999.anInt3057 - Static162.anInt3947 - local1999.anInt3063, local1999.anInt3061 - Static217.anInt4903, local1999.aLong108, local24, null);
				}
				if (local1999.aClass8_9 != null) {
					local1999.aClass8_9.method4546(0, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local1999.anInt3064 - Static149.anInt3555, local1999.anInt3057 - Static162.anInt3947 - local1999.anInt3063, local1999.anInt3061 - Static217.anInt4903, local1999.aLong108, local24, null);
				}
			}
			if (local8.anInt670 != 0) {
				@Pc(2109) WallDecor local2109 = local8.aClass24_1;
				if (local2109 != null && !Static276.method4611(local27, local18, local21, local2109.aClass8_3.method4549())) {
					if ((local2109.anInt1395 & local8.anInt670) != 0) {
						if (GlRenderer.enabled) {
							Static120.method2393(Static149.anInt3555, Static162.anInt3947, Static217.anInt4903, local24, local18, local21);
						}
						local2109.aClass8_3.method4546(0, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local2109.anInt1390 + local2109.anInt1394 - Static149.anInt3555, local2109.anInt1391 - Static162.anInt3947, local2109.anInt1393 + local2109.anInt1392 - Static217.anInt4903, local2109.aLong52, local24, null);
					} else if (local2109.anInt1395 == 256) {
						local65 = local2109.anInt1390 - Static149.anInt3555;
						local115 = local2109.anInt1391 - Static162.anInt3947;
						local1332 = local2109.anInt1393 - Static217.anInt4903;
						local894 = local2109.anInt1388;
						if (local894 == 1 || local894 == 2) {
							local899 = -local65;
						} else {
							local899 = local65;
						}
						if (local894 == 2 || local894 == 3) {
							local904 = -local1332;
						} else {
							local904 = local1332;
						}
						if (local904 >= local899) {
							if (GlRenderer.enabled) {
								Static120.method2393(Static149.anInt3555, Static162.anInt3947, Static217.anInt4903, local24, local18, local21);
							}
							local2109.aClass8_3.method4546(0, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local65 + local2109.anInt1394, local115, local1332 + local2109.anInt1392, local2109.aLong52, local24, null);
						} else if (local2109.aClass8_2 != null) {
							if (GlRenderer.enabled) {
								Static120.method2393(Static149.anInt3555, Static162.anInt3947, Static217.anInt4903, local24, local18, local21);
							}
							local2109.aClass8_2.method4546(0, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local65, local115, local1332, local2109.aLong52, local24, null);
						}
					}
				}
				@Pc(2275) Wall local2275 = local8.aClass77_1;
				if (local2275 != null) {
					if ((local2275.anInt3052 & local8.anInt670) != 0 && !Static260.method3850(local27, local18, local21, local2275.anInt3052)) {
						if (GlRenderer.enabled) {
							Static120.method2388(local2275.anInt3052, Static149.anInt3555, Static162.anInt3947, Static217.anInt4903, local27, local18, local21);
						}
						local2275.aClass8_6.method4546(0, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local2275.anInt3048 - Static149.anInt3555, local2275.anInt3051 - Static162.anInt3947, local2275.anInt3044 - Static217.anInt4903, local2275.aLong107, local24, null);
					}
					if ((local2275.anInt3049 & local8.anInt670) != 0 && !Static260.method3850(local27, local18, local21, local2275.anInt3049)) {
						if (GlRenderer.enabled) {
							Static120.method2388(local2275.anInt3049, Static149.anInt3555, Static162.anInt3947, Static217.anInt4903, local27, local18, local21);
						}
						local2275.aClass8_5.method4546(0, Static109.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local2275.anInt3048 - Static149.anInt3555, local2275.anInt3051 - Static162.anInt3947, local2275.anInt3044 - Static217.anInt4903, local2275.aLong107, local24, null);
					}
				}
			}
			@Pc(2388) Tile local2388;
			if (local24 < Static126.anInt3114 - 1) {
				local2388 = Static130.aClass3_Sub5ArrayArrayArray1[local24 + 1][local18][local21];
				if (local2388 != null && local2388.aBoolean46) {
					Static7.aClass69_32.method2282(local2388);
				}
			}
			if (local18 < Static167.anInt4069) {
				local2388 = local31[local18 + 1][local21];
				if (local2388 != null && local2388.aBoolean46) {
					Static7.aClass69_32.method2282(local2388);
				}
			}
			if (local21 < Static193.anInt4539) {
				local2388 = local31[local18][local21 + 1];
				if (local2388 != null && local2388.aBoolean46) {
					Static7.aClass69_32.method2282(local2388);
				}
			}
			if (local18 > Static167.anInt4069) {
				local2388 = local31[local18 - 1][local21];
				if (local2388 != null && local2388.aBoolean46) {
					Static7.aClass69_32.method2282(local2388);
				}
			}
			if (local21 > Static193.anInt4539) {
				local2388 = local31[local18][local21 - 1];
				if (local2388 != null && local2388.aBoolean46) {
					Static7.aClass69_32.method2282(local2388);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIIIIII)V")
	public static void method4246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Component local8 = Static201.method1418(arg0, arg1);
		if (local8 != null && local8.anObjectArray11 != null) {
			@Pc(19) HookRequest local19 = new HookRequest();
			local19.source = local8;
			local19.anObjectArray31 = local8.anObjectArray11;
			Static82.method1767(local19);
		}
		Static15.anInt506 = arg1;
		Static121.anInt3039 = arg3;
		Static98.anInt2512 = arg0;
		Static274.anInt4999 = arg2;
		Static241.aBoolean302 = true;
		Static246.anInt5393 = arg4;
		Static35.anInt1092 = arg5;
		Static43.method1143(local8);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)I")
	public static int method4247(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Lclient!eh;")
	public static Class35 method4248(@OriginalArg(1) int arg0) {
		@Pc(10) Class35 local10 = (Class35) Static232.aClass99_30.method3106((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static81.aClass153_34.method4495(16, arg0);
		local10 = new Class35();
		if (local20 != null) {
			local10.method1323(new Buffer(local20));
		}
		Static232.aClass99_30.method3095(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
	public static void method4249() {
		Static279.aClass99_38.method3104();
		Static56.aClass99_9.method3104();
	}
}
