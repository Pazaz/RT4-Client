import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!gn", name = "t", descriptor = "Lclient!ve;")
	public static Js5 aClass153_38;

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "Z")
	public static boolean aBoolean130 = false;

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "Lclient!n;")
	public static final SoftLruHashTable aClass99_12 = new SoftLruHashTable(20);

	@OriginalMember(owner = "client!gn", name = "v", descriptor = "Lclient!na;")
	public static final JagString aClass100_494 = Static28.parse("null");

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)Z")
	public static boolean method1802() {
		if (Static150.aBoolean175) {
			try {
				Static9.aClass100_35.method3157(Static71.signLink.anApplet2);
				return true;
			} catch (@Pc(14) Throwable local14) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!ve;ZLclient!ve;BI)Lclient!cl;")
	public static AnimFrameset method1803(@OriginalArg(0) Js5 arg0, @OriginalArg(2) Js5 arg1, @OriginalArg(4) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(16) int[] local16 = arg0.method4503(arg2);
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(30) byte[] local30 = arg0.method4502(local16[local18], arg2);
			if (local30 == null) {
				local5 = false;
			} else {
				@Pc(49) int local49 = (local30[0] & 0xFF) << 8 | local30[1] & 0xFF;
				@Pc(57) byte[] local57 = arg1.method4502(0, local49);
				if (local57 == null) {
					local5 = false;
				}
			}
		}
		if (!local5) {
			return null;
		}
		try {
			return new AnimFrameset(arg0, arg1, arg2, false);
		} catch (@Pc(84) Exception local84) {
			return null;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BI)Lclient!na;")
	public static JagString method1804(@OriginalArg(1) int arg0) {
		@Pc(13) JagString local13 = new JagString();
		local13.anInt4030 = 0;
		local13.aByteArray52 = new byte[arg0];
		return local13;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZI)V")
	public static void method1805(@OriginalArg(0) boolean arg0) {
		@Pc(7) byte local7;
		@Pc(9) byte[][] local9;
		if (GlRenderer.enabled && arg0) {
			local7 = 1;
			local9 = Static186.aByteArrayArray14;
		} else {
			local7 = 4;
			local9 = Static273.aByteArrayArray13;
		}
		@Pc(18) int local18 = local9.length;
		@Pc(20) int local20;
		@Pc(38) int local38;
		@Pc(49) int local49;
		@Pc(53) byte[] local53;
		for (local20 = 0; local20 < local18; local20++) {
			local38 = (Static238.anIntArray470[local20] >> 8) * 64 - Static225.originX;
			local49 = (Static238.anIntArray470[local20] & 0xFF) * 64 - Static142.originZ;
			local53 = local9[local20];
			if (local53 != null) {
				Static107.method2261();
				Static269.method2203(Static148.aClass97Array1, arg0, Static80.anInt4701 * 8 - 48, local49, local38, (Static52.anInt1695 - 6) * 8, local53);
			}
		}
		for (local20 = 0; local20 < local18; local20++) {
			local38 = (Static238.anIntArray470[local20] >> 8) * 64 - Static225.originX;
			local49 = (Static238.anIntArray470[local20] & 0xFF) * 64 - Static142.originZ;
			local53 = local9[local20];
			if (local53 == null && Static52.anInt1695 < 800) {
				Static107.method2261();
				for (@Pc(130) int local130 = 0; local130 < local7; local130++) {
					Static23.method645(local130, local49, local38, 64, 64);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(Z)V")
	public static void method1807() {
		for (@Pc(11) int local11 = 0; local11 < 100; local11++) {
			Static186.aBooleanArray100[local11] = true;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III[Lclient!be;IIIIBI)V")
	public static void method1809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (GlRenderer.enabled) {
			Static46.method1187(arg0, arg6, arg4, arg7);
		} else {
			Static129.method2496(arg0, arg6, arg4, arg7);
			Rasteriser.method1908();
		}
		for (@Pc(18) int local18 = 0; local18 < arg3.length; local18++) {
			@Pc(30) Component local30 = arg3[local18];
			if (local30 != null && (local30.layer == arg5 || arg5 == -1412584499 && local30 == Static105.aClass13_14)) {
				@Pc(57) int local57;
				if (arg8 == -1) {
					Static264.anIntArray410[Static24.anInt766] = arg2 + local30.x;
					Static50.anIntArray133[Static24.anInt766] = local30.y + arg1;
					Static224.anIntArray443[Static24.anInt766] = local30.anInt445;
					Static67.anIntArray320[Static24.anInt766] = local30.anInt459;
					local57 = Static24.anInt766++;
				} else {
					local57 = arg8;
				}
				local30.anInt465 = Static83.anInt372;
				local30.anInt517 = local57;
				if (!local30.aBoolean32 || !Static36.method947(local30)) {
					if (local30.anInt453 > 0) {
						Static2.method13(local30);
					}
					@Pc(114) int local114 = arg1 + local30.y;
					@Pc(117) int local117 = local30.anInt476;
					@Pc(123) int local123 = local30.x + arg2;
					if (Static121.aBoolean154 && (Static36.method940(local30).anInt546 != 0 || local30.anInt452 == 0) && local117 > 127) {
						local117 = 127;
					}
					@Pc(166) int local166;
					@Pc(164) int local164;
					if (local30 == Static105.aClass13_14) {
						if (arg5 != -1412584499 && !local30.aBoolean27) {
							Static80.anInt4696 = arg2;
							Static127.anInt3126 = arg1;
							Static241.aClass13Array13 = arg3;
							continue;
						}
						if (Static138.aBoolean172 && Static146.aBoolean174) {
							local164 = Static223.anInt5032;
							local166 = Static215.anInt4873;
							local164 -= Static165.anInt4035;
							if (local164 < Static228.anInt5103) {
								local164 = Static228.anInt5103;
							}
							if (local164 + local30.anInt459 > Static4.aClass13_1.anInt459 + Static228.anInt5103) {
								local164 = Static4.aClass13_1.anInt459 + Static228.anInt5103 - local30.anInt459;
							}
							local114 = local164;
							local166 -= Static246.anInt5388;
							if (Static81.anInt2225 > local166) {
								local166 = Static81.anInt2225;
							}
							if (Static4.aClass13_1.anInt445 + Static81.anInt2225 < local30.anInt445 + local166) {
								local166 = Static4.aClass13_1.anInt445 + Static81.anInt2225 - local30.anInt445;
							}
							local123 = local166;
						}
						if (!local30.aBoolean27) {
							local117 = 128;
						}
					}
					@Pc(302) int local302;
					@Pc(291) int local291;
					@Pc(270) int local270;
					@Pc(276) int local276;
					if (local30.anInt452 == 2) {
						local291 = arg7;
						local302 = arg4;
						local164 = arg6;
						local166 = arg0;
					} else {
						local164 = local114 > arg6 ? local114 : arg6;
						local166 = arg0 < local123 ? local123 : arg0;
						local270 = local30.anInt445 + local123;
						local276 = local114 + local30.anInt459;
						if (local30.anInt452 == 9) {
							local276++;
							local270++;
						}
						local291 = arg7 <= local276 ? arg7 : local276;
						local302 = local270 >= arg4 ? arg4 : local270;
					}
					if (!local30.aBoolean32 || local302 > local166 && local164 < local291) {
						@Pc(468) int local468;
						@Pc(503) int local503;
						@Pc(514) int local514;
						@Pc(518) int local518;
						@Pc(556) int local556;
						@Pc(563) int local563;
						@Pc(571) int local571;
						@Pc(545) int local545;
						if (local30.anInt453 != 0) {
							if (local30.anInt453 == 1337 || local30.anInt453 == 1403 && GlRenderer.enabled) {
								Static280.aClass13_26 = local30;
								Static214.anInt5574 = local114;
								Static97.anInt2503 = local123;
								Static253.method4326(local30.anInt459, local30.anInt453 == 1403, local123, local30.anInt445, local114);
								if (GlRenderer.enabled) {
									Static46.method1187(arg0, arg6, arg4, arg7);
								} else {
									Static129.method2496(arg0, arg6, arg4, arg7);
								}
								continue;
							}
							if (local30.anInt453 == 1338) {
								if (!local30.method478()) {
									continue;
								}
								Static54.method1305(local57, local114, local123, local30);
								if (GlRenderer.enabled) {
									Static46.method1187(arg0, arg6, arg4, arg7);
								} else {
									Static129.method2496(arg0, arg6, arg4, arg7);
								}
								if (Static270.anInt5795 != 0 && Static270.anInt5795 != 3 || Static60.aBoolean108 || local166 > Static155.anInt3751 || Static60.anInt1892 < local164 || Static155.anInt3751 >= local302 || local291 <= Static60.anInt1892) {
									continue;
								}
								local270 = Static155.anInt3751 - local123;
								local276 = Static60.anInt1892 - local114;
								local468 = local30.anIntArray37[local276];
								if (local270 < local468 || local270 > local468 + local30.anIntArray45[local276]) {
									continue;
								}
								local276 -= local30.anInt459 / 2;
								local503 = Static57.anInt1747 + Static59.anInt1814 & 0x7FF;
								local270 -= local30.anInt445 / 2;
								local514 = MathUtils.anIntArray223[local503];
								local518 = MathUtils.anIntArray225[local503];
								local514 = (Static273.anInt4130 + 256) * local514 >> 8;
								local518 = (Static273.anInt4130 + 256) * local518 >> 8;
								local545 = local518 * local276 - local514 * local270 >> 11;
								local556 = local276 * local514 + local270 * local518 >> 11;
								local563 = Static173.self.anInt3412 + local556 >> 7;
								local571 = Static173.self.anInt3421 - local545 >> 7;
								if (Static241.aBoolean302 && (Static274.anInt4999 & 0x40) != 0) {
									@Pc(583) Component local583 = Static201.method1418(Static98.anInt2512, Static15.anInt506);
									if (local583 == null) {
										Static53.method1294();
									} else {
										Static98.method1966(Static246.anInt5393, 1L, Static225.aClass100_961, local563, (short) 11, Static102.aClass100_545, local571);
									}
									continue;
								}
								if (Static266.game == 1) {
									Static98.method1966(-1, 1L, Static186.aClass100_827, local563, (short) 36, LocalizedText.FACEHERE, local571);
								}
								Static98.method1966(-1, 1L, Static186.aClass100_827, local563, (short) 60, Static195.aClass100_859, local571);
								continue;
							}
							if (local30.anInt453 == 1339) {
								if (local30.method478()) {
									Static160.method3047(local123, local114, local30, local57);
									if (GlRenderer.enabled) {
										Static46.method1187(arg0, arg6, arg4, arg7);
									} else {
										Static129.method2496(arg0, arg6, arg4, arg7);
									}
								}
								continue;
							}
							if (local30.anInt453 == 1400) {
								Static269.method2225(local123, local114, local30.anInt459, local30.anInt445);
								Static186.aBooleanArray100[local57] = true;
								Static31.aBooleanArray29[local57] = true;
								if (GlRenderer.enabled) {
									Static46.method1187(arg0, arg6, arg4, arg7);
								} else {
									Static129.method2496(arg0, arg6, arg4, arg7);
								}
								continue;
							}
							if (local30.anInt453 == 1401) {
								Static1.method4(local123, local30.anInt459, local30.anInt445, local114);
								Static186.aBooleanArray100[local57] = true;
								Static31.aBooleanArray29[local57] = true;
								if (GlRenderer.enabled) {
									Static46.method1187(arg0, arg6, arg4, arg7);
								} else {
									Static129.method2496(arg0, arg6, arg4, arg7);
								}
								continue;
							}
							if (local30.anInt453 == 1402) {
								if (!GlRenderer.enabled) {
									Static221.method3392(local123, local114);
									Static186.aBooleanArray100[local57] = true;
									Static31.aBooleanArray29[local57] = true;
								}
								continue;
							}
							if (local30.anInt453 == 1405) {
								if (!Static43.displayFps) {
									continue;
								}
								local270 = local30.anInt445 + local123;
								local276 = local114 + 15;
								Static215.aClass3_Sub2_Sub9_32.method2864(Static34.method882(new JagString[] { Static101.aClass100_539, Static123.method2423(Static243.anInt5359) }), local270, local276, 16776960, -1);
								local276 += 15;
								@Pc(795) Runtime local795 = Runtime.getRuntime();
								local503 = (int) ((local795.totalMemory() - local795.freeMemory()) / 1024L);
								local514 = 16776960;
								if (local503 > 65536) {
									local514 = 16711680;
								}
								Static215.aClass3_Sub2_Sub9_32.method2864(Static34.method882(new JagString[] { Static25.aClass100_154, Static123.method2423(local503), Static17.aClass100_101 }), local270, local276, local514, -1);
								local276 += 15;
								if (GlRenderer.enabled) {
									local514 = 16776960;
									local518 = (Static63.anInt1942 + Static63.anInt1945 + Static63.anInt1944) / 1024;
									if (local518 > 65536) {
										local514 = 16711680;
									}
									Static215.aClass3_Sub2_Sub9_32.method2864(Static34.method882(new JagString[] { Static198.aClass100_264, Static123.method2423(local518), Static17.aClass100_101 }), local270, local276, local514, -1);
									local276 += 15;
								}
								local518 = 0;
								local545 = 0;
								local556 = 0;
								for (local563 = 0; local563 < 28; local563++) {
									local518 += Static269.aClass14_Sub1Array3[local563].method535();
									local556 += Static269.aClass14_Sub1Array3[local563].method529();
									local545 += Static269.aClass14_Sub1Array3[local563].method533();
								}
								local571 = local556 * 10000 / local518;
								local563 = local545 * 100 / local518;
								@Pc(968) JagString local968 = Static34.method882(new JagString[] { Static43.aClass100_334, Static182.method3360(0, true, 2, (long) local571), Static147.aClass100_672, Static123.method2423(local563), Static14.aClass100_80 });
								Static114.aClass3_Sub2_Sub9_42.method2864(local968, local270, local276, 16776960, -1);
								local276 += 12;
								Static186.aBooleanArray100[local57] = true;
								Static31.aBooleanArray29[local57] = true;
								continue;
							}
							if (local30.anInt453 == 1406) {
								Static143.anInt3484 = local114;
								Static201.aClass13_13 = local30;
								Static131.anInt3260 = local123;
								continue;
							}
						}
						if (!Static60.aBoolean108) {
							if (local30.anInt452 == 0 && local30.aBoolean29 && Static155.anInt3751 >= local166 && Static60.anInt1892 >= local164 && Static155.anInt3751 < local302 && local291 > Static60.anInt1892 && !Static121.aBoolean154) {
								Static231.anInt5204 = 1;
								Static190.anIntArray382[0] = Static35.anInt1092;
								Static254.aClass100Array168[0] = LocalizedText.CANCEL;
								Static233.aClass100Array160[0] = Static186.aClass100_827;
								Static39.aShortArray6[0] = 1005;
							}
							if (local166 <= Static155.anInt3751 && local164 <= Static60.anInt1892 && local302 > Static155.anInt3751 && local291 > Static60.anInt1892) {
								Static258.method4418(Static60.anInt1892 - local114, -local123 + Static155.anInt3751, local30);
							}
						}
						if (local30.anInt452 == 0) {
							if (!local30.aBoolean32 && Static36.method947(local30) && Static180.aClass13_22 != local30) {
								continue;
							}
							if (!local30.aBoolean32) {
								if (local30.anInt491 - local30.anInt459 < local30.scrollY) {
									local30.scrollY = local30.anInt491 - local30.anInt459;
								}
								if (local30.scrollY < 0) {
									local30.scrollY = 0;
								}
							}
							method1809(local166, local114 - local30.scrollY, -local30.anInt489 + local123, arg3, local302, local30.anInt507, local164, local291, local57);
							if (local30.createdComponents != null) {
								method1809(local166, local114 - local30.scrollY, -local30.anInt489 + local123, local30.createdComponents, local302, local30.anInt507, local164, local291, local57);
							}
							@Pc(1186) Class3_Sub31 local1186 = (Class3_Sub31) Static119.aClass133_9.method3863((long) local30.anInt507);
							if (local1186 != null) {
								if (local1186.anInt5879 == 0 && !Static60.aBoolean108 && Static155.anInt3751 >= local166 && local164 <= Static60.anInt1892 && local302 > Static155.anInt3751 && Static60.anInt1892 < local291 && !Static121.aBoolean154) {
									Static254.aClass100Array168[0] = LocalizedText.CANCEL;
									Static231.anInt5204 = 1;
									Static190.anIntArray382[0] = Static35.anInt1092;
									Static39.aShortArray6[0] = 1005;
									Static233.aClass100Array160[0] = Static186.aClass100_827;
								}
								Static6.method86(local1186.anInt5878, local166, local302, local123, local57, local291, local164, local114);
							}
							if (GlRenderer.enabled) {
								Static46.method1187(arg0, arg6, arg4, arg7);
							} else {
								Static129.method2496(arg0, arg6, arg4, arg7);
								Rasteriser.method1908();
							}
						}
						if (Static223.aBooleanArray116[local57] || Static199.anInt4672 > 1) {
							if (local30.anInt452 == 0 && !local30.aBoolean32 && local30.anInt491 > local30.anInt459) {
								Static74.method1624(local30.scrollY, local30.anInt491, local30.anInt445 + local123, local114, local30.anInt459);
							}
							if (local30.anInt452 != 1) {
								if (local30.anInt452 == 2) {
									local270 = 0;
									for (local276 = 0; local276 < local30.anInt488; local276++) {
										for (local468 = 0; local468 < local30.baseWidth; local468++) {
											local514 = local114 + local276 * (local30.anInt516 + 32);
											local503 = (local30.anInt512 + 32) * local468 + local123;
											if (local270 < 20) {
												local514 += local30.anIntArray47[local270];
												local503 += local30.anIntArray41[local270];
											}
											if (local30.objTypes[local270] > 0) {
												local545 = local30.objTypes[local270] - 1;
												if (arg0 < local503 + 32 && local503 < arg4 && arg6 < local514 + 32 && local514 < arg7 || local30 == Static118.aClass13_15 && Static4.anInt36 == local270) {
													@Pc(1476) Sprite local1476;
													if (Static260.anInt5014 == 1 && Static185.anInt4370 == local270 && local30.anInt507 == Static224.anInt5062) {
														local1476 = Static190.method3443(2, local545, local30.aBoolean31, local30.objCounts[local270], 0);
													} else {
														local1476 = Static190.method3443(1, local545, local30.aBoolean31, local30.objCounts[local270], 3153952);
													}
													if (Rasteriser.aBoolean134) {
														Static186.aBooleanArray100[local57] = true;
													}
													if (local1476 == null) {
														Static43.method1143(local30);
													} else if (Static118.aClass13_15 == local30 && local270 == Static4.anInt36) {
														local518 = Static215.anInt4873 - Static149.anInt3554;
														local556 = Static223.anInt5032 - Static206.anInt4773;
														if (local556 < 5 && local556 > -5) {
															local556 = 0;
														}
														if (local518 < 5 && local518 > -5) {
															local518 = 0;
														}
														if (Static78.anInt2145 < 5) {
															local518 = 0;
															local556 = 0;
														}
														local1476.method1417(local503 + local518, local514 - -local556, 128);
														if (arg5 != -1) {
															@Pc(1571) Component local1571 = arg3[arg5 & 0xFFFF];
															@Pc(1577) int local1577;
															@Pc(1575) int local1575;
															if (GlRenderer.enabled) {
																local1575 = Static46.anInt1441;
																local1577 = Static46.anInt1438;
															} else {
																local1577 = Static129.anInt3147;
																local1575 = Static129.anInt3149;
															}
															@Pc(1611) int local1611;
															if (local1577 > local556 + local514 && local1571.scrollY > 0) {
																local1611 = Static178.anInt4247 * (local1577 - local556 - local514) / 3;
																if (local1611 > Static178.anInt4247 * 10) {
																	local1611 = Static178.anInt4247 * 10;
																}
																if (local1611 > local1571.scrollY) {
																	local1611 = local1571.scrollY;
																}
																local1571.scrollY -= local1611;
																Static206.anInt4773 += local1611;
																Static43.method1143(local1571);
															}
															if (local1575 < local556 + local514 + 32 && local1571.scrollY < local1571.anInt491 - local1571.anInt459) {
																local1611 = (local514 + local556 + 32 - local1575) * Static178.anInt4247 / 3;
																if (local1611 > Static178.anInt4247 * 10) {
																	local1611 = Static178.anInt4247 * 10;
																}
																if (local1571.anInt491 - local1571.scrollY - local1571.anInt459 < local1611) {
																	local1611 = local1571.anInt491 - local1571.anInt459 - local1571.scrollY;
																}
																local1571.scrollY += local1611;
																Static206.anInt4773 -= local1611;
																Static43.method1143(local1571);
															}
														}
													} else if (local30 == Static257.aClass13_7 && local270 == Static250.anInt5444) {
														local1476.method1417(local503, local514, 128);
													} else {
														local1476.method1423(local503, local514);
													}
												}
											} else if (local30.anIntArray36 != null && local270 < 20) {
												@Pc(1381) Sprite local1381 = local30.method482(local270);
												if (local1381 != null) {
													local1381.method1423(local503, local514);
												} else if (Static211.aBoolean72) {
													Static43.method1143(local30);
												}
											}
											local270++;
										}
									}
								} else if (local30.anInt452 == 3) {
									if (Static154.method2926(local30)) {
										local270 = local30.anInt492;
										if (Static180.aClass13_22 == local30 && local30.anInt475 != 0) {
											local270 = local30.anInt475;
										}
									} else {
										local270 = local30.anInt474;
										if (local30 == Static180.aClass13_22 && local30.anInt480 != 0) {
											local270 = local30.anInt480;
										}
									}
									if (local117 == 0) {
										if (local30.aBoolean30) {
											if (GlRenderer.enabled) {
												Static46.method1186(local123, local114, local30.anInt445, local30.anInt459, local270);
											} else {
												Static129.method2495(local123, local114, local30.anInt445, local30.anInt459, local270);
											}
										} else if (GlRenderer.enabled) {
											Static46.method1179(local123, local114, local30.anInt445, local30.anInt459, local270);
										} else {
											Static129.method2483(local123, local114, local30.anInt445, local30.anInt459, local270);
										}
									} else if (local30.aBoolean30) {
										if (GlRenderer.enabled) {
											Static46.method1182(local123, local114, local30.anInt445, local30.anInt459, local270, 256 - (local117 & 0xFF));
										} else {
											Static129.method2484(local123, local114, local30.anInt445, local30.anInt459, local270, 256 - (local117 & 0xFF));
										}
									} else if (GlRenderer.enabled) {
										Static46.method1180(local123, local114, local30.anInt445, local30.anInt459, local270, 256 - (local117 & 0xFF));
									} else {
										Static129.method2487(local123, local114, local30.anInt445, local30.anInt459, local270, 256 - (local117 & 0xFF));
									}
								} else {
									@Pc(1921) Font local1921;
									if (local30.anInt452 == 4) {
										local1921 = local30.method491(Static159.aClass36Array12);
										if (local1921 != null) {
											@Pc(1934) JagString local1934 = local30.aClass100_84;
											if (Static154.method2926(local30)) {
												local276 = local30.anInt492;
												if (Static180.aClass13_22 == local30 && local30.anInt475 != 0) {
													local276 = local30.anInt475;
												}
												if (local30.aClass100_82.length() > 0) {
													local1934 = local30.aClass100_82;
												}
											} else {
												local276 = local30.anInt474;
												if (Static180.aClass13_22 == local30 && local30.anInt480 != 0) {
													local276 = local30.anInt480;
												}
											}
											if (local30.aBoolean32 && local30.objId != -1) {
												@Pc(1989) ObjType local1989 = Static71.method1439(local30.objId);
												local1934 = local1989.aClass100_495;
												if (local1934 == null) {
													local1934 = Static92.aClass100_510;
												}
												if ((local1989.anInt2336 == 1 || local30.objCount != 1) && local30.objCount != -1) {
													local1934 = Static34.method882(new JagString[] { Static8.aClass100_32, local1934, Static54.aClass100_375, Static70.method1548(local30.objCount) });
												}
											}
											if (Static39.aClass13_10 == local30) {
												local276 = local30.anInt474;
												local1934 = LocalizedText.PLEASEWAIT;
											}
											if (!local30.aBoolean32) {
												local1934 = Static127.method2465(local30, local1934);
											}
											local1921.method2852(local1934, local123, local114, local30.anInt445, local30.anInt459, local276, local30.aBoolean28 ? 0 : -1, local30.anInt460, local30.anInt478, local30.anInt467);
										} else if (Static211.aBoolean72) {
											Static43.method1143(local30);
										}
									} else if (local30.anInt452 == 5) {
										@Pc(2094) Sprite local2094;
										if (local30.aBoolean32) {
											if (local30.objId == -1) {
												local2094 = local30.method489(false);
											} else {
												local2094 = Static190.method3443(local30.anInt514, local30.objId, local30.aBoolean31, local30.objCount, local30.anInt513);
											}
											if (local2094 != null) {
												local276 = local2094.anInt1860;
												local468 = local2094.anInt1866;
												if (local30.aBoolean23) {
													local503 = (local276 + local30.anInt445 - 1) / local276;
													local514 = (local30.anInt459 + local468 - 1) / local468;
													if (GlRenderer.enabled) {
														Static46.method1183(local123, local114, local30.anInt445 + local123, local30.anInt459 + local114);
														@Pc(2274) boolean local2274 = Static209.method3702(local2094.anInt1867);
														@Pc(2279) boolean local2279 = Static209.method3702(local2094.anInt1859);
														@Pc(2282) GlSprite local2282 = (GlSprite) local2094;
														if (local2274 && local2279) {
															if (local117 == 0) {
																local2282.method1429(local123, local114, local503, local514);
															} else {
																local2282.method1426(local123, local114, 256 - (local117 & 0xFF), local503, local514);
															}
														} else if (local2274) {
															for (local563 = 0; local563 < local514; local563++) {
																if (local117 == 0) {
																	local2282.method1429(local123, local563 * local468 + local114, local503, 1);
																} else {
																	local2282.method1426(local123, local114 + local563 * local468, -(local117 & 0xFF) + 256, local503, 1);
																}
															}
														} else if (local2279) {
															for (local563 = 0; local563 < local503; local563++) {
																if (local117 == 0) {
																	local2282.method1429(local276 * local563 + local123, local114, 1, local514);
																} else {
																	local2282.method1426(local276 * local563 + local123, local114, 256 - (local117 & 0xFF), 1, local514);
																}
															}
														} else {
															for (local563 = 0; local563 < local503; local563++) {
																for (local571 = 0; local571 < local514; local571++) {
																	if (local117 == 0) {
																		local2094.method1423(local123 + local276 * local563, local468 * local571 + local114);
																	} else {
																		local2094.method1417(local563 * local276 + local123, local468 * local571 + local114, 256 - (local117 & 0xFF));
																	}
																}
															}
														}
														Static46.method1187(arg0, arg6, arg4, arg7);
													} else {
														Static129.method2498(local123, local114, local123 + local30.anInt445, local114 - -local30.anInt459);
														for (local518 = 0; local518 < local503; local518++) {
															for (local556 = 0; local556 < local514; local556++) {
																if (local30.anInt521 != 0) {
																	local2094.method1420(local114 + local468 * local556 + local468 / 2, local30.anInt521, 4096, local518 * local276 + local123 + local276 / 2);
																} else if (local117 == 0) {
																	local2094.method1423(local518 * local276 + local123, local468 * local556 + local114);
																} else {
																	local2094.method1417(local518 * local276 + local123, local114 + local556 * local468, 256 - (local117 & 0xFF));
																}
															}
														}
														Static129.method2496(arg0, arg6, arg4, arg7);
													}
												} else {
													local503 = local30.anInt445 * 4096 / local276;
													if (local30.anInt521 != 0) {
														local2094.method1420(local114 + local30.anInt459 / 2, local30.anInt521, local503, local123 + local30.anInt445 / 2);
													} else if (local117 != 0) {
														local2094.method1422(local123, local114, local30.anInt445, local30.anInt459, 256 - (local117 & 0xFF));
													} else if (local276 == local30.anInt445 && local468 == local30.anInt459) {
														local2094.method1423(local123, local114);
													} else {
														local2094.method1419(local123, local114, local30.anInt445, local30.anInt459);
													}
												}
											} else if (Static211.aBoolean72) {
												Static43.method1143(local30);
											}
										} else {
											local2094 = local30.method489(Static154.method2926(local30));
											if (local2094 != null) {
												local2094.method1423(local123, local114);
											} else if (Static211.aBoolean72) {
												Static43.method1143(local30);
											}
										}
									} else {
										@Pc(2611) ObjType local2611;
										if (local30.anInt452 == 6) {
											@Pc(2587) boolean local2587 = Static154.method2926(local30);
											@Pc(2589) Model local2589 = null;
											if (local2587) {
												local276 = local30.anInt462;
											} else {
												local276 = local30.anInt522;
											}
											local503 = 0;
											if (local30.objId != -1) {
												local2611 = Static71.method1439(local30.objId);
												if (local2611 != null) {
													local2611 = local2611.method1820(local30.objCount);
													@Pc(2630) SeqType local2630 = local276 == -1 ? null : Static36.method941(local276);
													local2589 = local2611.method1824(local30.anInt496, local30.anInt500, local2630, 1, local30.anInt510);
													if (local2589 == null) {
														Static43.method1143(local30);
													} else {
														local503 = -local2589.method4549() / 2;
													}
												}
											} else if (local30.modelType == 5) {
												if (local30.modelId == -1) {
													local2589 = Static134.aClass59_2.method1954(null, -1, null, null, 0, -1, 0, -1, -1);
												} else {
													local514 = local30.modelId & 0x7FF;
													if (local514 == Static16.anInt549) {
														local514 = 2047;
													}
													@Pc(2751) Player local2751 = Static159.aClass8_Sub4_Sub1Array1[local514];
													@Pc(2760) SeqType local2760 = local276 == -1 ? null : Static36.method941(local276);
													if (local2751 != null && (int) local2751.aClass100_364.encode37() << 11 == (local30.modelId & 0xFFFFF800)) {
														local2589 = local2751.aClass59_1.method1954(null, -1, null, local2760, 0, -1, 0, local30.anInt510, 0);
													}
												}
											} else if (local276 == -1) {
												local2589 = local30.method488(-1, null, -1, 0, local2587, Static173.self.aClass59_1);
												if (local2589 == null && Static211.aBoolean72) {
													Static43.method1143(local30);
												}
											} else {
												@Pc(2689) SeqType local2689 = Static36.method941(local276);
												local2589 = local30.method488(local30.anInt496, local2689, local30.anInt510, local30.anInt500, local2587, Static173.self.aClass59_1);
												if (local2589 == null && Static211.aBoolean72) {
													Static43.method1143(local30);
												}
											}
											if (local2589 != null) {
												if (local30.anInt451 > 0) {
													local514 = (local30.anInt445 << 8) / local30.anInt451;
												} else {
													local514 = 256;
												}
												if (local30.anInt526 <= 0) {
													local518 = 256;
												} else {
													local518 = (local30.anInt459 << 8) / local30.anInt526;
												}
												local556 = local123 + local30.anInt445 / 2 + (local514 * local30.anInt495 >> 8);
												local545 = local30.anInt459 / 2 + local114 + (local518 * local30.anInt481 >> 8);
												if (GlRenderer.enabled) {
													if (local30.aBoolean22) {
														GlRenderer.method4182(local556, local545, local30.modelZoom, local30.aShort11, local514, local518);
													} else {
														GlRenderer.method4148(local556, local545, local514, local518);
														GlRenderer.method4152((float) local30.aShort10, (float) local30.aShort11 * 1.5F);
													}
													GlRenderer.method4173();
													GlRenderer.setDepthTestEnabled(true);
													GlRenderer.setFogEnabled(false);
													Static229.method3935(Static113.anInt4609);
													if (Static263.aBoolean299) {
														Static46.method1177();
														GlRenderer.clearDepthBuffer();
														Static46.method1187(arg0, arg6, arg4, arg7);
														Static263.aBoolean299 = false;
													}
													if (local30.aBoolean34) {
														GlRenderer.disableDepthMask();
													}
													local563 = MathUtils.anIntArray223[local30.modelXAngle] * local30.modelZoom >> 16;
													local571 = local30.modelZoom * MathUtils.anIntArray225[local30.modelXAngle] >> 16;
													if (local30.aBoolean32) {
														local2589.method4571(local30.modelYAngle, local30.modelYOffset, local30.modelXAngle, local30.modelXOffset, local30.modelZOffset + local563 + local503, local30.modelZOffset + local571, -1L);
													} else {
														local2589.method4571(local30.modelYAngle, 0, local30.modelXAngle, 0, local563, local571, -1L);
													}
													if (local30.aBoolean34) {
														GlRenderer.enableDepthMask();
													}
												} else {
													Rasteriser.method1919(local556, local545);
													local563 = MathUtils.anIntArray223[local30.modelXAngle] * local30.modelZoom >> 16;
													local571 = local30.modelZoom * MathUtils.anIntArray225[local30.modelXAngle] >> 16;
													if (!local30.aBoolean32) {
														local2589.method4571(local30.modelYAngle, 0, local30.modelXAngle, 0, local563, local571, -1L);
													} else if (local30.aBoolean22) {
														((SoftwareModel) local2589).method4591(local30.modelYAngle, local30.modelYOffset, local30.modelXAngle, local30.modelXOffset, local30.modelZOffset + local503 + local563, local571 + local30.modelZOffset, local30.modelZoom);
													} else {
														local2589.method4571(local30.modelYAngle, local30.modelYOffset, local30.modelXAngle, local30.modelXOffset, local30.modelZOffset + local563 + local503, local571 + local30.modelZOffset, -1L);
													}
													Rasteriser.method1915();
												}
											}
										} else {
											if (local30.anInt452 == 7) {
												local1921 = local30.method491(Static159.aClass36Array12);
												if (local1921 == null) {
													if (Static211.aBoolean72) {
														Static43.method1143(local30);
													}
													continue;
												}
												local276 = 0;
												for (local468 = 0; local468 < local30.anInt488; local468++) {
													for (local503 = 0; local503 < local30.baseWidth; local503++) {
														if (local30.objTypes[local276] > 0) {
															local2611 = Static71.method1439(local30.objTypes[local276] - 1);
															@Pc(3159) JagString local3159;
															if (local2611.anInt2336 != 1 && local30.objCounts[local276] == 1) {
																local3159 = Static34.method882(new JagString[] { Static8.aClass100_32, local2611.aClass100_495, Static230.aClass100_978 });
															} else {
																local3159 = Static34.method882(new JagString[] { Static8.aClass100_32, local2611.aClass100_495, Static54.aClass100_375, Static70.method1548(local30.objCounts[local276]) });
															}
															local556 = local123 + local503 * (local30.anInt512 + 115);
															local545 = (local30.anInt516 + 12) * local468 + local114;
															if (local30.anInt460 == 0) {
																local1921.method2857(local3159, local556, local545, local30.anInt474, local30.aBoolean28 ? 0 : -1);
															} else if (local30.anInt460 == 1) {
																local1921.method2875(local3159, local556 + 57, local545, local30.anInt474, local30.aBoolean28 ? 0 : -1);
															} else {
																local1921.method2864(local3159, local556 + 115 - 1, local545, local30.anInt474, local30.aBoolean28 ? 0 : -1);
															}
														}
														local276++;
													}
												}
											}
											if (local30.anInt452 == 8 && Static43.aClass13_11 == local30 && Static133.anInt5235 == Static191.anInt4504) {
												local276 = 0;
												local270 = 0;
												@Pc(3297) JagString local3297 = local30.aClass100_84;
												@Pc(3299) Font local3299 = Static215.aClass3_Sub2_Sub9_32;
												local3297 = Static127.method2465(local30, local3297);
												@Pc(3325) JagString local3325;
												while (local3297.length() > 0) {
													local518 = local3297.indexOf(Static269.aClass100_556);
													if (local518 == -1) {
														local3325 = local3297;
														local3297 = Static186.aClass100_827;
													} else {
														local3325 = local3297.substring(local518, 0);
														local3297 = local3297.method3136(local518 + 4);
													}
													local556 = local3299.method2858(local3325);
													local276 += local3299.anInt3626 + 1;
													if (local270 < local556) {
														local270 = local556;
													}
												}
												local556 = local114 + local30.anInt459 + 5;
												local270 += 6;
												local276 += 7;
												if (local556 + local276 > arg7) {
													local556 = arg7 - local276;
												}
												local518 = local123 + local30.anInt445 - local270 - 5;
												if (local518 < local123 + 5) {
													local518 = local123 + 5;
												}
												if (local270 + local518 > arg4) {
													local518 = arg4 - local270;
												}
												if (GlRenderer.enabled) {
													Static46.method1186(local518, local556, local270, local276, 16777120);
													Static46.method1179(local518, local556, local270, local276, 0);
												} else {
													Static129.method2495(local518, local556, local270, local276, 16777120);
													Static129.method2483(local518, local556, local270, local276, 0);
												}
												local3297 = local30.aClass100_84;
												local545 = local556 + local3299.anInt3626 + 2;
												local3297 = Static127.method2465(local30, local3297);
												while (local3297.length() > 0) {
													local563 = local3297.indexOf(Static269.aClass100_556);
													if (local563 == -1) {
														local3325 = local3297;
														local3297 = Static186.aClass100_827;
													} else {
														local3325 = local3297.substring(local563, 0);
														local3297 = local3297.method3136(local563 + 4);
													}
													local3299.method2857(local3325, local518 + 3, local545, 0, -1);
													local545 += local3299.anInt3626 + 1;
												}
											}
											if (local30.anInt452 == 9) {
												if (local30.aBoolean20) {
													local468 = local123 + local30.anInt445;
													local276 = local114 + local30.anInt459;
													local503 = local114;
												} else {
													local276 = local114;
													local503 = local114 + local30.anInt459;
													local468 = local123 + local30.anInt445;
												}
												if (local30.anInt490 == 1) {
													if (GlRenderer.enabled) {
														Static46.method1185(local123, local276, local468, local503, local30.anInt474);
													} else {
														Static129.method2500(local123, local276, local468, local503, local30.anInt474);
													}
												} else if (GlRenderer.enabled) {
													Static46.method1181(local123, local276, local468, local503, local30.anInt474, local30.anInt490);
												} else {
													Static129.method2494(local123, local276, local468, local503, local30.anInt474, local30.anInt490);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(B)V")
	public static void method1812() {
		if (Static72.anInt2031 < 128) {
			Static72.anInt2031 = 128;
		}
		if (Static72.anInt2031 > 383) {
			Static72.anInt2031 = 383;
		}
		Static57.anInt1747 &= 0x7FF;
		@Pc(33) int local33 = Static81.anInt2223 >> 7;
		@Pc(37) int local37 = Static111.anInt2900 >> 7;
		@Pc(43) int local43 = Static207.method3685(Static55.level, Static81.anInt2223, Static111.anInt2900);
		@Pc(45) int local45 = 0;
		@Pc(64) int local64;
		if (local33 > 3 && local37 > 3 && local33 < 100 && local37 < 100) {
			for (local64 = local33 - 4; local64 <= local33 + 4; local64++) {
				for (@Pc(73) int local73 = local37 - 4; local73 <= local37 + 4; local73++) {
					@Pc(80) int local80 = Static55.level;
					if (local80 < 3 && (Static12.aByteArrayArrayArray2[1][local64][local73] & 0x2) == 2) {
						local80++;
					}
					@Pc(117) int local117 = (Static232.aByteArrayArrayArray13[local80][local64][local73] & 0xFF) * 8 + local43 - Static83.anIntArrayArrayArray4[local80][local64][local73];
					if (local117 > local45) {
						local45 = local117;
					}
				}
			}
		}
		local64 = local45 * 192;
		if (local64 > 98048) {
			local64 = 98048;
		}
		if (local64 < 32768) {
			local64 = 32768;
		}
		if (Static234.anInt5245 < local64) {
			Static234.anInt5245 += (local64 - Static234.anInt5245) / 24;
		} else if (local64 < Static234.anInt5245) {
			Static234.anInt5245 += (local64 - Static234.anInt5245) / 80;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZI)I")
	public static int method1814(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
