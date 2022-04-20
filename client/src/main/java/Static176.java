import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Lclient!ve;")
	public static Js5 aClass153_76;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray95 = new boolean[5];

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "Lclient!na;")
	public static final JagString aClass100_800 = Static28.parse("");

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "Lclient!na;")
	private static final JagString aClass100_801 = Static28.parse(")4a=");

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "Lclient!na;")
	public static final JagString aClass100_802 = Static28.parse("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	public static void method3302() {
		Static27.aClass99_4.method3104();
		Static244.aClass99_32.method3104();
		Static118.aClass99_16.method3104();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB)Z")
	public static boolean method3303(@OriginalArg(0) int arg0) {
		@Pc(3) World local3 = Static54.method1310(arg0);
		if (local3 == null) {
			return false;
		} else if (SignLink.anInt5928 == 1 || SignLink.anInt5928 == 2 || Static83.modeWhere == 2) {
			@Pc(31) byte[] local31 = local3.aClass100_71.method3148();
			Static60.hostname = new String(local31, 0, local31.length);
			Static125.worldId = local3.anInt382;
			if (Static83.modeWhere != 0) {
				Static271.defaultPort = Static125.worldId + 43594; // 40000;
				Static209.port = Static271.defaultPort;
				Static55.alternatePort = Static125.worldId + 43594; // 50000;
			}
			return true;
		} else {
			@Pc(62) JagString local62 = Static211.aClass100_230;
			if (Static83.modeWhere != 0) {
				local62 = Static34.method882(new JagString[] { Static31.aClass100_193, Static123.method2423(local3.anInt382 + 7000) });
			}
			@Pc(89) JagString local89 = Static211.aClass100_230;
			if (Static47.aClass100_991 != null) {
				local89 = Static34.method882(new JagString[] { Static167.aClass100_783, Static47.aClass100_991 });
			}
			@Pc(182) JagString local182 = Static34.method882(new JagString[] { Static115.aClass100_582, local3.aClass100_71, local62, Static279.aClass100_1107, Static123.method2423(Static141.anInt3470), aClass100_801, Static123.method2423(Static204.anInt4760), local89, Static139.aClass100_659, Static150.aBoolean175 ? Static30.aClass100_184 : Static260.aClass100_945, Static60.aClass100_420, Static233.aBoolean254 ? Static30.aClass100_184 : Static260.aClass100_945, Static198.aClass100_260, Static249.aBoolean282 ? Static30.aClass100_184 : Static260.aClass100_945 });
			try {
				Static215.aClient1.getAppletContext().showDocument(local182.method3107(), "_self");
				return true;
			} catch (@Pc(191) Exception local191) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIB)V")
	public static void method3304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(15) int local15;
		@Pc(47) int local47;
		if (Static260.anInt5014 == 0) {
			@Pc(13) int local13 = Static148.anInt3535;
			local15 = Static1.anInt4;
			@Pc(17) int local17 = Static247.anInt5405;
			@Pc(19) int local19 = Static240.anInt5334;
			@Pc(33) int local33 = (arg5 - arg3) * (local17 - local19) / arg1 + local19;
			local47 = local15 + (local13 - local15) * (arg4 - arg0) / arg2;
			if (Static241.aBoolean302 && (Static274.anInt4999 & 0x40) != 0) {
				@Pc(61) Component local61 = Static201.method1418(Static98.anInt2512, Static15.anInt506);
				if (local61 == null) {
					Static53.method1294();
				} else {
					Static98.method1966(Static246.anInt5393, 0L, Static225.aClass100_961, local33, (short) 11, Static102.aClass100_545, local47);
				}
			} else {
				if (Static266.game == 1) {
					Static98.method1966(-1, 0L, Static186.aClass100_827, local33, (short) 36, LocalizedText.FACEHERE, local47);
				}
				Static98.method1966(-1, 0L, Static186.aClass100_827, local33, (short) 60, Static195.aClass100_859, local47);
			}
		}
		@Pc(112) long local112 = -1L;
		for (local15 = 0; local15 < Static2.anInt7; local15++) {
			@Pc(121) long local121 = Static259.aLongArray11[local15];
			local47 = (int) local121 & 0x7F;
			@Pc(133) int local133 = (int) local121 >> 29 & 0x3;
			@Pc(140) int local140 = (int) (local121 >>> 32) & Integer.MAX_VALUE;
			@Pc(147) int local147 = (int) local121 >> 7 & 0x7F;
			if (local121 != local112) {
				local112 = local121;
				@Pc(240) int local240;
				if (local133 == 2 && Static257.method523(Static55.level, local47, local147, local121)) {
					@Pc(172) LocType local172 = Static271.method4601(local140);
					if (local172.anIntArray380 != null) {
						local172 = local172.method3417();
					}
					if (local172 == null) {
						continue;
					}
					if (Static260.anInt5014 == 1) {
						Static98.method1966(Static169.anInt4075, local121, Static34.method882(new JagString[] { Static34.aClass100_203, Static27.aClass100_164, local172.aClass100_830 }), local47, (short) 14, LocalizedText.USE, local147);
					} else if (Static241.aBoolean302) {
						@Pc(363) Class3_Sub2_Sub12 local363 = Static121.anInt3039 == -1 ? null : Static110.method2277(Static121.anInt3039);
						if ((Static274.anInt4999 & 0x4) != 0 && (local363 == null || local172.method3423(local363.anInt2667, Static121.anInt3039) != local363.anInt2667)) {
							Static98.method1966(Static246.anInt5393, local121, Static34.method882(new JagString[] { Static78.aClass100_466, Static27.aClass100_164, local172.aClass100_830 }), local47, (short) 38, Static102.aClass100_545, local147);
						}
					} else {
						@Pc(228) JagString[] local228 = local172.aClass100Array130;
						if (Static208.aBoolean237) {
							local228 = Static279.method4664(local228);
						}
						if (local228 != null) {
							for (local240 = 4; local240 >= 0; local240--) {
								if (local228[local240] != null) {
									@Pc(254) short local254 = 0;
									if (local240 == 0) {
										local254 = 42;
									}
									if (local240 == 1) {
										local254 = 50;
									}
									@Pc(268) int local268 = -1;
									if (local240 == 2) {
										local254 = 49;
									}
									if (local172.anInt4406 == local240) {
										local268 = local172.anInt4416;
									}
									if (local240 == 3) {
										local254 = 46;
									}
									if (local240 == local172.anInt4420) {
										local268 = local172.anInt4423;
									}
									if (local240 == 4) {
										local254 = 1001;
									}
									Static98.method1966(local268, local121, Static34.method882(new JagString[] { Static240.aClass100_1008, local172.aClass100_830 }), local47, local254, local228[local240], local147);
								}
							}
						}
						Static98.method1966(Static225.anInt5073, (long) local172.anInt4426, Static34.method882(new JagString[] { Static240.aClass100_1008, local172.aClass100_830 }), local47, (short) 1004, LocalizedText.EXAMINE, local147);
					}
				}
				@Pc(514) int local514;
				@Pc(526) int local526;
				@Pc(479) int local479;
				@Pc(493) int local493;
				@Pc(502) Npc local502;
				@Pc(597) Player local597;
				if (local133 == 1) {
					@Pc(421) Npc local421 = Static175.aClass8_Sub4_Sub2Array1[local140];
					if ((local421.aClass96_1.anInt3713 & 0x1) == 0 && (local421.anInt3412 & 0x7F) == 0 && (local421.anInt3421 & 0x7F) == 0 || (local421.aClass96_1.anInt3713 & 0x1) == 1 && (local421.anInt3412 & 0x7F) == 64 && (local421.anInt3421 & 0x7F) == 64) {
						local479 = local421.anInt3412 + 64 - local421.aClass96_1.anInt3713 * 64;
						local240 = local421.anInt3421 - (local421.aClass96_1.anInt3713 - 1) * 64;
						for (local493 = 0; local493 < Static272.anInt5214; local493++) {
							local502 = Static175.aClass8_Sub4_Sub2Array1[Static33.anIntArray79[local493]];
							local514 = local502.anInt3412 + 64 - local502.aClass96_1.anInt3713 * 64;
							local526 = local502.anInt3421 + 64 - local502.aClass96_1.anInt3713 * 64;
							if (local502 != null && local421 != local502 && local514 >= local479 && local421.aClass96_1.anInt3713 - (local514 - local479 >> 7) >= local502.aClass96_1.anInt3713 && local240 <= local526 && local502.aClass96_1.anInt3713 <= local421.aClass96_1.anInt3713 - (local526 - local240 >> 7)) {
								Static246.method4240(local502.aClass96_1, local47, Static33.anIntArray79[local493], local147);
							}
						}
						for (local493 = 0; local493 < Static267.anInt5774; local493++) {
							local597 = Static159.aClass8_Sub4_Sub1Array1[Static105.anIntArray256[local493]];
							local514 = local597.anInt3412 + 64 - local597.method2693() * 64;
							local526 = local597.anInt3421 + 64 - local597.method2693() * 64;
							if (local597 != null && local514 >= local479 && local597.method2693() <= local421.aClass96_1.anInt3713 - (local514 - local479 >> 7) && local526 >= local240 && local597.method2693() <= local421.aClass96_1.anInt3713 - (local526 - local240 >> 7)) {
								Static217.method3767(Static105.anIntArray256[local493], local147, local597, local47);
							}
						}
					}
					Static246.method4240(local421.aClass96_1, local47, local140, local147);
				}
				if (local133 == 0) {
					@Pc(688) Player local688 = Static159.aClass8_Sub4_Sub1Array1[local140];
					if ((local688.anInt3412 & 0x7F) == 64 && (local688.anInt3421 & 0x7F) == 64) {
						local479 = local688.anInt3412 - (local688.method2693() - 1) * 64;
						local240 = local688.anInt3421 + 64 - local688.method2693() * 64;
						for (local493 = 0; local493 < Static272.anInt5214; local493++) {
							local502 = Static175.aClass8_Sub4_Sub2Array1[Static33.anIntArray79[local493]];
							local514 = local502.anInt3412 + 64 - local502.aClass96_1.anInt3713 * 64;
							local526 = local502.anInt3421 + 64 - local502.aClass96_1.anInt3713 * 64;
							if (local502 != null && local514 >= local479 && local502.aClass96_1.anInt3713 <= local688.method2693() - (local514 - local479 >> 7) && local526 >= local240 && local502.aClass96_1.anInt3713 <= local688.method2693() - (local526 - local240 >> 7)) {
								Static246.method4240(local502.aClass96_1, local47, Static33.anIntArray79[local493], local147);
							}
						}
						for (local493 = 0; local493 < Static267.anInt5774; local493++) {
							local597 = Static159.aClass8_Sub4_Sub1Array1[Static105.anIntArray256[local493]];
							local514 = local597.anInt3412 - (local597.method2693() - 1) * 64;
							local526 = local597.anInt3421 + 64 - local597.method2693() * 64;
							if (local597 != null && local597 != local688 && local479 <= local514 && local597.method2693() <= local688.method2693() - (local514 - local479 >> 7) && local526 >= local240 && local597.method2693() <= local688.method2693() - (local526 - local240 >> 7)) {
								Static217.method3767(Static105.anIntArray256[local493], local147, local597, local47);
							}
						}
					}
					Static217.method3767(local140, local147, local688, local47);
				}
				if (local133 == 3) {
					@Pc(931) LinkedList local931 = Static159.aClass69ArrayArrayArray1[Static55.level][local47][local147];
					if (local931 != null) {
						for (@Pc(940) ObjStackNode local940 = (ObjStackNode) local931.method2279(); local940 != null; local940 = (ObjStackNode) local931.method2286()) {
							local240 = local940.aClass8_Sub7_1.anInt5555;
							@Pc(951) ObjType local951 = Static71.method1439(local240);
							if (Static260.anInt5014 == 1) {
								Static98.method1966(Static169.anInt4075, (long) local240, Static34.method882(new JagString[] { Static34.aClass100_203, Static223.aClass100_947, local951.aClass100_495 }), local47, (short) 33, LocalizedText.USE, local147);
							} else if (Static241.aBoolean302) {
								@Pc(1142) Class3_Sub2_Sub12 local1142 = Static121.anInt3039 == -1 ? null : Static110.method2277(Static121.anInt3039);
								if ((Static274.anInt4999 & 0x1) != 0 && (local1142 == null || local951.method1829(local1142.anInt2667, Static121.anInt3039) != local1142.anInt2667)) {
									Static98.method1966(Static246.anInt5393, (long) local240, Static34.method882(new JagString[] { Static78.aClass100_466, Static223.aClass100_947, local951.aClass100_495 }), local47, (short) 39, Static102.aClass100_545, local147);
								}
							} else {
								@Pc(997) JagString[] local997 = local951.aClass100Array72;
								if (Static208.aBoolean237) {
									local997 = Static279.method4664(local997);
								}
								for (local514 = 4; local514 >= 0; local514--) {
									if (local997 != null && local997[local514] != null) {
										@Pc(1025) byte local1025 = 0;
										if (local514 == 0) {
											local1025 = 21;
										}
										if (local514 == 1) {
											local1025 = 34;
										}
										@Pc(1041) int local1041 = -1;
										if (local514 == local951.anInt2338) {
											local1041 = local951.anInt2327;
										}
										if (local514 == 2) {
											local1025 = 18;
										}
										if (local951.anInt2355 == local514) {
											local1041 = local951.anInt2321;
										}
										if (local514 == 3) {
											local1025 = 20;
										}
										if (local514 == 4) {
											local1025 = 24;
										}
										Static98.method1966(local1041, (long) local240, Static34.method882(new JagString[] { Static8.aClass100_32, local951.aClass100_495 }), local47, local1025, local997[local514], local147);
									}
								}
								Static98.method1966(Static225.anInt5073, (long) local240, Static34.method882(new JagString[] { Static8.aClass100_32, local951.aClass100_495 }), local47, (short) 1002, LocalizedText.EXAMINE, local147);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method3305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) PlainTile local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new PlainTile(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static130.aClass3_Sub5ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static130.aClass3_Sub5ArrayArrayArray1[local14][arg1][arg2] = new Tile(local14, arg1, arg2);
				}
			}
			Static130.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2].aClass131_1 = local12;
		} else if (arg3 == 1) {
			local12 = new PlainTile(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static130.aClass3_Sub5ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static130.aClass3_Sub5ArrayArrayArray1[local14][arg1][arg2] = new Tile(local14, arg1, arg2);
				}
			}
			Static130.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2].aClass131_1 = local12;
		} else {
			@Pc(134) ShapedTile local134 = new ShapedTile(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static130.aClass3_Sub5ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static130.aClass3_Sub5ArrayArrayArray1[local14][arg1][arg2] = new Tile(local14, arg1, arg2);
				}
			}
			Static130.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2].aClass43_1 = local134;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIII)V")
	public static void method3308(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(8) int local8 = arg2; local8 <= arg0; local8++) {
			Static131.method2576(Static71.anIntArrayArray10[local8], arg3, arg1, arg4);
		}
	}
}
