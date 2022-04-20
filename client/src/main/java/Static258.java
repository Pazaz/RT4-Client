import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!va", name = "G", descriptor = "[Z")
	public static boolean[] aBooleanArray130;

	@OriginalMember(owner = "client!va", name = "O", descriptor = "I")
	public static int anInt5637;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(II)V")
	public static void method4415() {
		Static179.aClass99_25.method3102(5);
		Static169.aClass99_24.method3102(5);
		Static93.aClass99_14.method3102(5);
		Static262.aClass99_36.method3102(5);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IZILclient!be;)V")
	public static void method4418(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		if (arg2.anInt530 == 1) {
			Static98.method1966(-1, 0L, Static186.aClass100_827, 0, (short) 8, arg2.aClass100_89, arg2.anInt507);
		}
		@Pc(47) JagString local47;
		if (arg2.anInt530 == 2 && !Static241.aBoolean302) {
			local47 = Static97.method1963(arg2);
			if (local47 != null) {
				Static98.method1966(-1, 0L, Static34.method882(new JagString[] { Static42.aClass100_332, arg2.aClass100_85 }), -1, (short) 32, local47, arg2.anInt507);
			}
		}
		if (arg2.anInt530 == 3) {
			Static98.method1966(-1, 0L, Static186.aClass100_827, 0, (short) 28, LocalizedText.CLOSE, arg2.anInt507);
		}
		if (arg2.anInt530 == 4) {
			Static98.method1966(-1, 0L, Static186.aClass100_827, 0, (short) 59, arg2.aClass100_89, arg2.anInt507);
		}
		if (arg2.anInt530 == 5) {
			Static98.method1966(-1, 0L, Static186.aClass100_827, 0, (short) 51, arg2.aClass100_89, arg2.anInt507);
		}
		if (arg2.anInt530 == 6 && Static39.aClass13_10 == null) {
			Static98.method1966(-1, 0L, Static186.aClass100_827, -1, (short) 41, arg2.aClass100_89, arg2.anInt507);
		}
		@Pc(173) int local173;
		@Pc(171) int local171;
		if (arg2.anInt452 == 2) {
			local171 = 0;
			for (local173 = 0; local173 < arg2.anInt488; local173++) {
				for (@Pc(183) int local183 = 0; local183 < arg2.baseWidth; local183++) {
					@Pc(195) int local195 = (arg2.anInt512 + 32) * local183;
					@Pc(202) int local202 = (arg2.anInt516 + 32) * local173;
					if (local171 < 20) {
						local202 += arg2.anIntArray47[local171];
						local195 += arg2.anIntArray41[local171];
					}
					if (arg1 >= local195 && local202 <= arg0 && local195 + 32 > arg1 && local202 + 32 > arg0) {
						Static169.aClass13_18 = arg2;
						Static18.anInt588 = local171;
						if (arg2.objTypes[local171] > 0) {
							@Pc(267) ServerActiveProperties local267 = Static36.method940(arg2);
							@Pc(276) ObjType local276 = Static71.method1439(arg2.objTypes[local171] - 1);
							if (Static260.anInt5014 == 1 && local267.method510()) {
								if (Static224.anInt5062 != arg2.anInt507 || Static185.anInt4370 != local171) {
									Static98.method1966(-1, (long) local276.anInt2354, Static34.method882(new JagString[] { Static34.aClass100_203, Static223.aClass100_947, local276.aClass100_495 }), local171, (short) 40, LocalizedText.USE, arg2.anInt507);
								}
							} else if (Static241.aBoolean302 && local267.method510()) {
								@Pc(596) Class3_Sub2_Sub12 local596 = Static121.anInt3039 == -1 ? null : Static110.method2277(Static121.anInt3039);
								if ((Static274.anInt4999 & 0x10) != 0 && (local596 == null || local276.method1829(local596.anInt2667, Static121.anInt3039) != local596.anInt2667)) {
									Static98.method1966(Static246.anInt5393, (long) local276.anInt2354, Static34.method882(new JagString[] { Static78.aClass100_466, Static223.aClass100_947, local276.aClass100_495 }), local171, (short) 3, Static102.aClass100_545, arg2.anInt507);
								}
							} else {
								@Pc(296) JagString[] local296 = local276.aClass100Array71;
								if (Static208.aBoolean237) {
									local296 = Static279.method4664(local296);
								}
								@Pc(309) int local309;
								@Pc(334) byte local334;
								if (local267.method510()) {
									for (local309 = 4; local309 >= 3; local309--) {
										if (local296 != null && local296[local309] != null) {
											if (local309 == 3) {
												local334 = 35;
											} else {
												local334 = 58;
											}
											Static98.method1966(-1, (long) local276.anInt2354, Static34.method882(new JagString[] { Static8.aClass100_32, local276.aClass100_495 }), local171, local334, local296[local309], arg2.anInt507);
										}
									}
								}
								if (local267.method507()) {
									Static98.method1966(Static169.anInt4075, (long) local276.anInt2354, Static34.method882(new JagString[] { Static8.aClass100_32, local276.aClass100_495 }), local171, (short) 22, LocalizedText.USE, arg2.anInt507);
								}
								if (local267.method510() && local296 != null) {
									for (local309 = 2; local309 >= 0; local309--) {
										if (local296[local309] != null) {
											local334 = 0;
											if (local309 == 0) {
												local334 = 47;
											}
											if (local309 == 1) {
												local334 = 5;
											}
											if (local309 == 2) {
												local334 = 43;
											}
											Static98.method1966(-1, (long) local276.anInt2354, Static34.method882(new JagString[] { Static8.aClass100_32, local276.aClass100_495 }), local171, local334, local296[local309], arg2.anInt507);
										}
									}
								}
								local296 = arg2.aClass100Array19;
								if (Static208.aBoolean237) {
									local296 = Static279.method4664(local296);
								}
								if (local296 != null) {
									for (local309 = 4; local309 >= 0; local309--) {
										if (local296[local309] != null) {
											local334 = 0;
											if (local309 == 0) {
												local334 = 25;
											}
											if (local309 == 1) {
												local334 = 23;
											}
											if (local309 == 2) {
												local334 = 48;
											}
											if (local309 == 3) {
												local334 = 7;
											}
											if (local309 == 4) {
												local334 = 13;
											}
											Static98.method1966(-1, (long) local276.anInt2354, Static34.method882(new JagString[] { Static8.aClass100_32, local276.aClass100_495 }), local171, local334, local296[local309], arg2.anInt507);
										}
									}
								}
								Static98.method1966(Static225.anInt5073, (long) local276.anInt2354, Static34.method882(new JagString[] { Static8.aClass100_32, local276.aClass100_495 }), local171, (short) 1006, LocalizedText.EXAMINE, arg2.anInt507);
							}
						}
					}
					local171++;
				}
			}
		}
		if (!arg2.aBoolean32) {
			return;
		}
		if (!Static241.aBoolean302) {
			for (local171 = 9; local171 >= 5; local171--) {
				@Pc(765) JagString local765 = Static205.method3677(arg2, local171);
				if (local765 != null) {
					Static98.method1966(Static8.method118(local171, arg2), (long) (local171 + 1), arg2.aClass100_88, arg2.componentId, (short) 1003, local765, arg2.anInt507);
				}
			}
			local47 = Static97.method1963(arg2);
			if (local47 != null) {
				Static98.method1966(-1, 0L, arg2.aClass100_88, arg2.componentId, (short) 32, local47, arg2.anInt507);
			}
			for (local173 = 4; local173 >= 0; local173--) {
				@Pc(828) JagString local828 = Static205.method3677(arg2, local173);
				if (local828 != null) {
					Static98.method1966(Static8.method118(local173, arg2), (long) (local173 + 1), arg2.aClass100_88, arg2.componentId, (short) 9, local828, arg2.anInt507);
				}
			}
			if (Static36.method940(arg2).method506()) {
				Static98.method1966(-1, 0L, Static186.aClass100_827, arg2.componentId, (short) 41, LocalizedText.CONTINUE, arg2.anInt507);
			}
		} else if (Static36.method940(arg2).method508() && (Static274.anInt4999 & 0x20) != 0) {
			Static98.method1966(Static246.anInt5393, 0L, Static34.method882(new JagString[] { Static78.aClass100_466, Static201.aClass100_408, arg2.aClass100_88 }), arg2.componentId, (short) 12, Static102.aClass100_545, arg2.anInt507);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)Z")
	public static boolean method4428(@OriginalArg(0) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(BI)V")
	public static void method4444(@OriginalArg(1) int arg0) {
		Static9.anInt172 = arg0;
		Static91.anInt2428 = 20;
		Static201.anInt1864 = 3;
	}
}
