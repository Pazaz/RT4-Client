import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "[I")
	public static int[] anIntArray374;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "[I")
	public static int[] anIntArray376;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	public static int anInt4363 = -1;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "I")
	public static int anInt4364 = 0;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "[I")
	public static final int[] anIntArray375 = new int[128];

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Lclient!na;")
	public static final JagString aClass100_821 = Static28.parse("document)3cookie=(R");

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)I")
	public static int method3389(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(III)V")
	public static void method3392(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static250.anInt5434 > 0) {
			Static267.method4528(Static250.anInt5434);
			Static250.anInt5434 = 0;
		}
		@Pc(20) int local20 = 0;
		@Pc(24) int local24 = Static129.anInt3144 * arg1;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 1; local28 < 255; local28++) {
			@Pc(43) int local43 = (256 - local28) * Static35.anIntArray83[local28] / 256;
			if (local43 < 0) {
				local43 = 0;
			}
			local20 += local43;
			@Pc(55) int local55;
			for (local55 = local43; local55 < 128; local55++) {
				@Pc(65) int local65 = Static129.anIntArray297[local24++ + arg0];
				@Pc(70) int local70 = Static216.anIntArray188[local20++];
				if (local70 == 0) {
					Static167.aClass3_Sub2_Sub1_Sub1_3.anIntArray20[local26++] = local65;
				} else {
					@Pc(76) int local76 = local70 + 18;
					if (local76 > 255) {
						local76 = 255;
					}
					@Pc(89) int local89 = 256 - local70 - 18;
					if (local89 > 255) {
						local89 = 255;
					}
					local70 = Static96.anIntArray235[local70];
					Static167.aClass3_Sub2_Sub1_Sub1_3.anIntArray20[local26++] = (local89 * (local65 & 0xFF00FF) + (local70 & 0xFF00FF) * local76 & 0xFF00FF00) + ((local70 & 0xFF00) * local76 + ((local65 & 0xFF00) * local89) & 0xFF0000) >> 8;
				}
			}
			for (local55 = 0; local55 < local43; local55++) {
				Static167.aClass3_Sub2_Sub1_Sub1_3.anIntArray20[local26++] = Static129.anIntArray297[arg0 + local24++];
			}
			local24 += Static129.anInt3144 - 128;
		}
		if (GlRenderer.enabled) {
			Static46.method1178(Static167.aClass3_Sub2_Sub1_Sub1_3.anIntArray20, arg0, arg1, Static167.aClass3_Sub2_Sub1_Sub1_3.anInt1867, Static167.aClass3_Sub2_Sub1_Sub1_3.anInt1859);
		} else {
			Static167.aClass3_Sub2_Sub1_Sub1_3.method1415(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([[F[[B[[B[Lclient!gi;II[[F[[B[[B[[II[[F)V")
	public static void method3393(@OriginalArg(0) float[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) Light[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[][] arg6, @OriginalArg(7) byte[][] arg7, @OriginalArg(8) byte[][] arg8, @OriginalArg(9) int[][] arg9, @OriginalArg(11) float[][] arg10) {
		for (@Pc(7) int local7 = 0; local7 < arg5; local7++) {
			@Pc(18) Light local18 = arg3[local7];
			if (local18.anInt2241 == arg4) {
				@Pc(24) int local24 = 0;
				@Pc(28) Class45 local28 = new Class45();
				@Pc(37) int local37 = (local18.anInt2240 >> 7) - local18.anInt2236;
				@Pc(46) int local46 = (local18.anInt2245 >> 7) - local18.anInt2236;
				if (local46 < 0) {
					local24 = -local46;
					local46 = 0;
				}
				@Pc(65) int local65 = local18.anInt2236 + (local18.anInt2245 >> 7);
				if (local65 > 103) {
					local65 = 103;
				}
				@Pc(72) int local72;
				@Pc(84) short local84;
				@Pc(90) int local90;
				@Pc(99) int local99;
				@Pc(114) int local114;
				@Pc(133) int local133;
				@Pc(328) boolean local328;
				@Pc(355) int local355;
				for (local72 = local46; local72 <= local65; local72++) {
					local84 = local18.aShortArray30[local24];
					local90 = local37 + (local84 >> 8);
					local99 = local90 + (local84 & 0xFF) - 1;
					if (local99 > 103) {
						local99 = 103;
					}
					if (local90 < 0) {
						local90 = 0;
					}
					for (local114 = local90; local114 <= local99; local114++) {
						@Pc(125) int local125 = arg1[local114][local72] & 0xFF;
						local133 = arg8[local114][local72] & 0xFF;
						@Pc(135) boolean local135 = false;
						@Pc(151) FloType local151;
						@Pc(176) int[] local176;
						@Pc(234) int[] local234;
						if (local125 == 0) {
							if (local133 == 0) {
								continue;
							}
							local151 = Static256.method4395(local133 - 1);
							if (local151.anInt5899 == -1) {
								continue;
							}
							if (arg7[local114][local72] != 0) {
								local176 = Static228.anIntArrayArray35[arg7[local114][local72]];
								local28.anInt2016 += ((local176.length >> 1) - 2) * 3;
								local28.anInt2019 += local176.length >> 1;
								continue;
							}
						} else if (local133 != 0) {
							local151 = Static256.method4395(local133 - 1);
							@Pc(224) byte local224;
							if (local151.anInt5899 == -1) {
								local224 = arg7[local114][local72];
								if (local224 != 0) {
									local234 = Static53.anIntArrayArray8[local224];
									local28.anInt2016 += ((local234.length >> 1) - 2) * 3;
									local28.anInt2019 += local234.length >> 1;
								}
								continue;
							}
							local224 = arg7[local114][local72];
							if (local224 != 0) {
								local135 = true;
							}
						}
						@Pc(275) Scenery local275 = Static133.method4008(arg4, local114, local72);
						if (local275 != null) {
							@Pc(287) int local287 = (int) (local275.aLong56 >> 14) & 0x3F;
							if (local287 == 9) {
								local234 = null;
								@Pc(302) int local302 = (int) (local275.aLong56 >> 20) & 0x3;
								@Pc(315) boolean local315;
								@Pc(343) short local343;
								@Pc(349) int local349;
								if ((local302 & 0x1) == 0) {
									local328 = local99 >= local114 + 1;
									local315 = local114 - 1 >= local90;
									if (!local315 && local72 + 1 <= local65) {
										local343 = local18.aShortArray30[local24 + 1];
										local349 = local37 + (local343 >> 8);
										local355 = local349 + (local343 & 0xFF);
										local315 = local349 < local114 && local114 < local355;
									}
									if (!local328 && local72 - 1 >= local46) {
										local343 = local18.aShortArray30[local24 - 1];
										local349 = local37 + (local343 >> 8);
										local355 = local349 + (local343 & 0xFF);
										local328 = local114 > local349 && local114 < local355;
									}
									if (local315 && local328) {
										local234 = Static228.anIntArrayArray35[0];
									} else if (local315) {
										local234 = Static228.anIntArrayArray35[1];
									} else if (local328) {
										local234 = Static228.anIntArrayArray35[1];
									}
								} else {
									local315 = local90 <= local114 - 1;
									local328 = local114 + 1 <= local99;
									if (!local315 && local72 - 1 >= local46) {
										local343 = local18.aShortArray30[local24 - 1];
										local349 = (local343 >> 8) + local37;
										local355 = local349 + (local343 & 0xFF);
										local315 = local349 < local114 && local114 < local355;
									}
									if (!local328 && local72 + 1 <= local65) {
										local343 = local18.aShortArray30[local24 + 1];
										local349 = (local343 >> 8) + local37;
										local355 = local349 + (local343 & 0xFF);
										local328 = local349 < local114 && local355 > local114;
									}
									if (local315 && local328) {
										local234 = Static228.anIntArrayArray35[0];
									} else if (local315) {
										local234 = Static228.anIntArrayArray35[1];
									} else if (local328) {
										local234 = Static228.anIntArrayArray35[1];
									}
								}
								if (local234 != null) {
									local28.anInt2016 += (local234.length >> 1) * 3 - 6;
									local28.anInt2019 += local234.length >> 1;
								}
								continue;
							}
						}
						if (local135) {
							local234 = Static53.anIntArrayArray8[arg7[local114][local72]];
							local176 = Static228.anIntArrayArray35[arg7[local114][local72]];
							local28.anInt2016 += ((local176.length >> 1) - 2) * 3;
							local28.anInt2016 += ((local234.length >> 1) - 2) * 3;
							local28.anInt2019 += local176.length >> 1;
							local28.anInt2019 += local234.length >> 1;
						} else {
							local176 = Static228.anIntArrayArray35[0];
							local28.anInt2016 += ((local176.length >> 1) - 2) * 3;
							local28.anInt2019 += local176.length >> 1;
						}
					}
					local24++;
				}
				local24 = 0;
				local28.method1555();
				if ((local18.anInt2245 >> 7) - local18.anInt2236 < 0) {
					local24 = local18.anInt2236 - (local18.anInt2245 >> 7);
				}
				for (local72 = local46; local72 <= local65; local72++) {
					local84 = local18.aShortArray30[local24];
					local90 = (local84 >> 8) + local37;
					local99 = (local84 & 0xFF) + local90 - 1;
					if (local99 > 103) {
						local99 = 103;
					}
					if (local90 < 0) {
						local90 = 0;
					}
					for (local114 = local90; local114 <= local99; local114++) {
						@Pc(775) int local775 = arg8[local114][local72] & 0xFF;
						local133 = arg1[local114][local72] & 0xFF;
						@Pc(789) byte local789 = arg2[local114][local72];
						@Pc(791) boolean local791 = false;
						@Pc(805) FloType local805;
						if (local133 == 0) {
							if (local775 == 0) {
								continue;
							}
							local805 = Static256.method4395(local775 - 1);
							if (local805.anInt5899 == -1) {
								continue;
							}
							if (arg7[local114][local72] != 0) {
								Static131.method2578(arg0, arg9, local114, arg6, local72, Static228.anIntArrayArray35[arg7[local114][local72]], local28, local18, arg10, arg2[local114][local72]);
								continue;
							}
						} else if (local775 != 0) {
							local805 = Static256.method4395(local775 - 1);
							if (local805.anInt5899 == -1) {
								Static131.method2578(arg0, arg9, local114, arg6, local72, Static53.anIntArrayArray8[arg7[local114][local72]], local28, local18, arg10, arg2[local114][local72]);
								continue;
							}
							@Pc(815) byte local815 = arg7[local114][local72];
							if (local815 != 0) {
								local791 = true;
							}
						}
						@Pc(899) Scenery local899 = Static133.method4008(arg4, local114, local72);
						if (local899 != null) {
							@Pc(911) int local911 = (int) (local899.aLong56 >> 14) & 0x3F;
							if (local911 == 9) {
								@Pc(917) int[] local917 = null;
								@Pc(925) int local925 = (int) (local899.aLong56 >> 20) & 0x3;
								@Pc(973) int local973;
								@Pc(947) boolean local947;
								@Pc(961) short local961;
								if ((local925 & 0x1) == 0) {
									local328 = local114 - 1 >= local90;
									local947 = local99 >= local114 + 1;
									if (!local328 && local65 >= local72 + 1) {
										local961 = local18.aShortArray30[local24 + 1];
										local355 = (local961 >> 8) + local37;
										local973 = (local961 & 0xFF) + local355;
										local328 = local114 > local355 && local973 > local114;
									}
									if (!local947 && local72 - 1 >= local46) {
										local961 = local18.aShortArray30[local24 - 1];
										local355 = local37 + (local961 >> 8);
										local973 = (local961 & 0xFF) + local355;
										local947 = local355 < local114 && local973 > local114;
									}
									if (local328 && local947) {
										local917 = Static228.anIntArrayArray35[0];
									} else if (local328) {
										local917 = Static228.anIntArrayArray35[1];
										local789 = 1;
									} else if (local947) {
										local917 = Static228.anIntArrayArray35[1];
										local789 = 3;
									}
								} else {
									local328 = local114 - 1 >= local90;
									local947 = local99 >= local114 + 1;
									if (!local328 && local46 <= local72 - 1) {
										local961 = local18.aShortArray30[local24 - 1];
										local355 = local37 + (local961 >> 8);
										local973 = (local961 & 0xFF) + local355;
										local328 = local114 > local355 && local973 > local114;
									}
									if (!local947 && local65 >= local72 + 1) {
										local961 = local18.aShortArray30[local24 + 1];
										local355 = local37 + (local961 >> 8);
										local973 = (local961 & 0xFF) + local355;
										local947 = local114 > local355 && local973 > local114;
									}
									if (local328 && local947) {
										local917 = Static228.anIntArrayArray35[0];
									} else if (local328) {
										local789 = 0;
										local917 = Static228.anIntArrayArray35[1];
									} else if (local947) {
										local917 = Static228.anIntArrayArray35[1];
										local789 = 2;
									}
								}
								if (local917 != null) {
									Static131.method2578(arg0, arg9, local114, arg6, local72, local917, local28, local18, arg10, local789);
								}
								continue;
							}
						}
						if (local791) {
							Static131.method2578(arg0, arg9, local114, arg6, local72, Static53.anIntArrayArray8[arg7[local114][local72]], local28, local18, arg10, arg2[local114][local72]);
							Static131.method2578(arg0, arg9, local114, arg6, local72, Static228.anIntArrayArray35[arg7[local114][local72]], local28, local18, arg10, arg2[local114][local72]);
						} else {
							Static131.method2578(arg0, arg9, local114, arg6, local72, Static228.anIntArrayArray35[0], local28, local18, arg10, local789);
						}
					}
					local24++;
				}
				if (local28.anInt2017 > 0 && local28.anInt2018 > 0) {
					local28.method1554();
					local18.aClass45_1 = local28;
				}
			}
		}
	}
}
