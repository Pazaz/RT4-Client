import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!le", name = "c", descriptor = "Lclient!rf;")
	public static Song aClass3_Sub29_1;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "I")
	public static int anInt3490 = 0;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "Z")
	public static boolean aBoolean173 = false;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIIIII)V")
	public static void method2735(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) int local9 = arg3 - arg5;
		@Pc(14) int local14 = arg1 - arg2;
		if (Static48.anInt1449 > arg3) {
			local9++;
		}
		if (Static181.anInt4296 > arg1) {
			local14++;
		}
		@Pc(32) int local32;
		@Pc(47) int local47;
		@Pc(57) int local57;
		@Pc(62) int local62;
		@Pc(71) int local71;
		@Pc(104) int local104;
		@Pc(145) int local145;
		@Pc(157) int local157;
		@Pc(162) int local162;
		@Pc(211) int local211;
		@Pc(222) int local222;
		@Pc(233) int local233;
		@Pc(254) int local254;
		@Pc(270) int local270;
		@Pc(276) int local276;
		@Pc(312) int local312;
		@Pc(372) int local372;
		@Pc(185) int[][] local185;
		for (local32 = 0; local32 < local9; local32++) {
			local47 = local32 * arg7 >> 16;
			local57 = (local32 + 1) * arg7 >> 16;
			local62 = local57 - local47;
			if (local62 > 0) {
				local71 = local32 + arg5 >> 6;
				if (local71 >= 0 && Static248.anIntArrayArrayArray17.length - 1 >= local71) {
					local47 += arg4;
					local185 = Static248.anIntArrayArrayArray17[local71];
					@Pc(189) byte[][] local189 = Static34.aByteArrayArrayArray3[local71];
					@Pc(193) byte[][] local193 = Static90.aByteArrayArrayArray8[local71];
					@Pc(197) byte[][] local197 = Static70.aByteArrayArrayArray7[local71];
					@Pc(201) byte[][] local201 = Static125.aByteArrayArrayArray10[local71];
					local57 += arg4;
					@Pc(209) byte[][] local209 = Static229.aByteArrayArrayArray12[local71];
					for (local211 = 0; local211 < local14; local211++) {
						local222 = arg6 * local211 >> 16;
						local233 = (local211 + 1) * arg6 >> 16;
						@Pc(238) int local238 = local233 - local222;
						if (local238 > 0) {
							local233 += arg0;
							local254 = arg2 + local211 >> 6;
							@Pc(260) int local260 = arg2 + local211 & 0x3F;
							local222 += arg0;
							local270 = local32 + arg5 & 0x3F;
							local276 = (local260 << 6) + local270;
							if (local254 < 0 || local185.length - 1 < local254 || local185[local254] == null) {
								if (Static269.aClass3_Sub2_Sub4_2.anInt759 != -1) {
									local312 = Static269.aClass3_Sub2_Sub4_2.anInt759;
								} else if ((local211 + arg2 & 0x4) == (arg5 + local32 & 0x4)) {
									local312 = Static145.anIntArray330[Static26.anInt865 + 1];
								} else {
									local312 = 4936552;
								}
								if (local254 < 0 || local254 > local185.length - 1) {
									if (local312 == 0) {
										local312 = 1;
									}
									Static129.method2495(local47, local222, local62, local238, local312);
									continue;
								}
							} else {
								local312 = local185[local254][local276];
							}
							local372 = local189[local254] == null ? 0 : Static145.anIntArray330[local189[local254][local276] & 0xFF];
							if (local312 == 0) {
								local312 = 1;
							}
							@Pc(395) int local395 = local209[local254] == null ? 0 : Static145.anIntArray330[local209[local254][local276] & 0xFF];
							@Pc(437) int local437;
							if (local372 == 0 && local395 == 0) {
								Static129.method2495(local47, local222, local62, local238, local312);
							} else {
								@Pc(433) byte local433;
								if (local372 != 0) {
									if (local372 == -1) {
										local372 = 1;
									}
									local433 = local193[local254] == null ? 0 : local193[local254][local276];
									local437 = local433 & 0xFC;
									if (local437 == 0 || local62 <= 1 || local238 <= 1) {
										Static129.method2495(local47, local222, local62, local238, local372);
									} else {
										Static280.method4667(Static129.anIntArray297, local372, local47, local433 & 0x3, local312, local437 >> 2, local238, local62, local222, true);
									}
								}
								if (local395 != 0) {
									if (local395 == -1) {
										local395 = local312;
									}
									local433 = local201[local254][local276];
									local437 = local433 & 0xFC;
									if (local437 == 0 || local62 <= 1 || local238 <= 1) {
										Static129.method2495(local47, local222, local62, local238, local395);
									}
									Static280.method4667(Static129.anIntArray297, local395, local47, local433 & 0x3, 0, local437 >> 2, local238, local62, local222, local372 == 0);
								}
							}
							if (local197[local254] != null) {
								@Pc(546) int local546 = local197[local254][local276] & 0xFF;
								if (local546 != 0) {
									if (local62 == 1) {
										local437 = local47;
									} else {
										local437 = local57 - 1;
									}
									@Pc(569) int local569;
									if (local238 == 1) {
										local569 = local222;
									} else {
										local569 = local233 - 1;
									}
									@Pc(575) int local575 = 13421772;
									if (local546 >= 5 && local546 <= 8 || local546 >= 13 && local546 <= 16 || local546 >= 21 && local546 <= 24 || local546 == 27 || local546 == 28) {
										local575 = 13369344;
										local546 -= 4;
									}
									if (local546 == 1) {
										Static129.method2490(local47, local222, local238, local575);
									} else if (local546 == 2) {
										Static129.method2489(local47, local222, local62, local575);
									} else if (local546 == 3) {
										Static129.method2490(local437, local222, local238, local575);
									} else if (local546 == 4) {
										Static129.method2489(local47, local569, local62, local575);
									} else if (local546 == 9) {
										Static129.method2490(local47, local222, local238, 16777215);
										Static129.method2489(local47, local222, local62, local575);
									} else if (local546 == 10) {
										Static129.method2490(local437, local222, local238, 16777215);
										Static129.method2489(local47, local222, local62, local575);
									} else if (local546 == 11) {
										Static129.method2490(local437, local222, local238, 16777215);
										Static129.method2489(local47, local569, local62, local575);
									} else if (local546 == 12) {
										Static129.method2490(local47, local222, local238, 16777215);
										Static129.method2489(local47, local569, local62, local575);
									} else if (local546 == 17) {
										Static129.method2489(local47, local222, 1, local575);
									} else if (local546 == 18) {
										Static129.method2489(local437, local222, 1, local575);
									} else if (local546 == 19) {
										Static129.method2489(local437, local569, 1, local575);
									} else if (local546 == 20) {
										Static129.method2489(local47, local569, 1, local575);
									} else {
										@Pc(705) int local705;
										if (local546 == 25) {
											for (local705 = 0; local705 < local238; local705++) {
												Static129.method2489(local705 + local47, -local705 + local569, 1, local575);
											}
										} else if (local546 == 26) {
											for (local705 = 0; local705 < local238; local705++) {
												Static129.method2489(local705 + local47, local222 + local705, 1, local575);
											}
										}
									}
								}
							}
						}
					}
				} else {
					local47 += arg4;
					for (@Pc(90) int local90 = 0; local90 < local14; local90++) {
						if (Static269.aClass3_Sub2_Sub4_2.anInt759 != -1) {
							local104 = Static269.aClass3_Sub2_Sub4_2.anInt759;
						} else if ((local32 + arg5 & 0x4) == (local90 + arg2 & 0x4)) {
							local104 = Static145.anIntArray330[Static26.anInt865 + 1];
						} else {
							local104 = 4936552;
						}
						if (local104 == 0) {
							local104 = 1;
						}
						local145 = (arg6 * local90 >> 16) + arg0;
						local157 = arg0 + ((local90 + 1) * arg6 >> 16);
						local162 = local157 - local145;
						Static129.method2495(local47, local145, local62, local162, local104);
					}
				}
			}
		}
		for (local32 = -2; local32 < local9 + 2; local32++) {
			local47 = local32 * arg7 >> 16;
			local57 = arg7 * (local32 + 1) >> 16;
			local62 = local57 - local47;
			if (local62 > 0) {
				local47 += arg4;
				local71 = arg5 + local32 >> 6;
				if (local71 >= 0 && Static58.anIntArrayArrayArray5.length - 1 >= local71) {
					local185 = Static58.anIntArrayArrayArray5[local71];
					for (local104 = -2; local104 < local14 + 2; local104++) {
						local145 = local104 * arg6 >> 16;
						local157 = (local104 + 1) * arg6 >> 16;
						local162 = local157 - local145;
						if (local162 > 0) {
							local145 += arg0;
							@Pc(931) int local931 = local104 + arg2 >> 6;
							if (local931 >= 0 && local931 <= local185.length - 1) {
								local211 = ((arg2 + local104 & 0x3F) << 6) + (local32 + arg5 & 0x3F);
								if (local185[local931] != null) {
									local222 = local185[local931][local211];
									local233 = local222 & 0x3FFF;
									if (local233 != 0) {
										local254 = local222 >> 14 & 0x3;
										@Pc(998) Class2 local998 = Static40.method1013(local233 - 1);
										@Pc(1003) SoftwareIndexedSprite local1003 = local998.method9(local254);
										if (local1003 != null) {
											local276 = local162 * local1003.anInt4278 / 4;
											local270 = local62 * local1003.anInt4270 / 4;
											if (local998.aBoolean2) {
												local312 = local222 >> 16 & 0xF;
												local372 = local222 >> 20 & 0xF;
												if ((local254 & 0x1) == 1) {
													local254 = local312;
													local312 = local372;
													local372 = local254;
												}
												local270 = local62 * local312;
												local276 = local162 * local372;
											}
											if (local270 != 0 && local276 != 0) {
												if (local998.anInt11 == 0) {
													local1003.method1398(local47, local145 + local162 - local276, local270, local276);
												} else {
													local1003.method1390(local47, local145 + local162 - local276, local270, local276, local998.anInt11);
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

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)I")
	public static int method2736() {
		if (Static69.aFrame2 != null) {
			return 3;
		} else if (GlRenderer.enabled && Static124.aBoolean156) {
			return 2;
		} else if (GlRenderer.enabled && !Static124.aBoolean156) {
			return 1;
		} else {
			return 0;
		}
	}
}
