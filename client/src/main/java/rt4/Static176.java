package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Lclient!ve;")
	public static Js5 aClass153_76;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray95 = new boolean[5];

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "Lclient!na;")
	public static final JagString aClass100_800 = JagString.parse("");

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "Lclient!na;")
	private static final JagString aClass100_801 = JagString.parse(")4a=");

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "Lclient!na;")
	public static final JagString aClass100_802 = JagString.parse("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB)Z")
	public static boolean hopWorld(@OriginalArg(0) int arg0) {
		@Pc(3) World local3 = Static54.getWorld(arg0);
		if (local3 == null) {
			return false;
		} else if (SignLink.anInt5928 == 1 || SignLink.anInt5928 == 2 || client.modeWhere == 2) {
			@Pc(31) byte[] local31 = local3.hostname.method3148();
			client.hostname = new String(local31, 0, local31.length);
			Player.worldId = local3.id;
			if (client.modeWhere != 0) {
				client.defaultPort = Player.worldId + 43594; // 40000;
				client.port = client.defaultPort;
				client.alternatePort = Player.worldId + 43594; // 50000;
			}
			return true;
		} else {
			@Pc(62) JagString local62 = Static211.aClass100_230;
			if (client.modeWhere != 0) {
				local62 = JagString.concatenate(new JagString[] { Static31.aClass100_193, Static123.parseInt(local3.id + 7000) });
			}
			@Pc(89) JagString local89 = Static211.aClass100_230;
			if (client.settings != null) {
				local89 = JagString.concatenate(new JagString[] { Static167.aClass100_783, client.settings});
			}
			@Pc(182) JagString local182 = JagString.concatenate(new JagString[] { Static115.aClass100_582, local3.hostname, local62, Static279.aClass100_1107, Static123.parseInt(client.language), aClass100_801, Static123.parseInt(client.affiliate), local89, Static139.aClass100_659, client.objectTag ? Static30.aClass100_184 : Static260.aClass100_945, Static60.aClass100_420, client.javaScript ? Static30.aClass100_184 : Static260.aClass100_945, Static198.aClass100_260, client.advertSuppressed ? Static30.aClass100_184 : Static260.aClass100_945 });
			try {
				client.instance.getAppletContext().showDocument(local182.method3107(), "_self");
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
			@Pc(13) int local13 = Static148.screenUpperY;
			local15 = Static1.screenLowerY;
			@Pc(17) int local17 = Static247.screenUpperX;
			@Pc(19) int local19 = Static240.screenLowerX;
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
				if (client.game == 1) {
					Static98.method1966(-1, 0L, JagString.EMPTY, local33, (short) 36, LocalizedText.FACEHERE, local47);
				}
				Static98.method1966(-1, 0L, JagString.EMPTY, local33, (short) 60, Static195.aClass100_859, local47);
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
				if (local133 == 2 && Static257.method523(Player.level, local47, local147, local121)) {
					@Pc(172) LocType local172 = LocTypeList.get(local140);
					if (local172.multiLocs != null) {
						local172 = local172.getMultiLoc();
					}
					if (local172 == null) {
						continue;
					}
					if (Static260.anInt5014 == 1) {
						Static98.method1966(Static169.anInt4075, local121, JagString.concatenate(new JagString[] { Static34.aClass100_203, Static27.aClass100_164, local172.name}), local47, (short) 14, LocalizedText.USE, local147);
					} else if (Static241.aBoolean302) {
						@Pc(363) ParamType local363 = Static121.anInt3039 == -1 ? null : ParamTypeList.get(Static121.anInt3039);
						if ((Static274.anInt4999 & 0x4) != 0 && (local363 == null || local172.getParam(local363.defaultInt, Static121.anInt3039) != local363.defaultInt)) {
							Static98.method1966(Static246.anInt5393, local121, JagString.concatenate(new JagString[] { Static78.aClass100_466, Static27.aClass100_164, local172.name}), local47, (short) 38, Static102.aClass100_545, local147);
						}
					} else {
						@Pc(228) JagString[] local228 = local172.ops;
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
									if (local172.cursor1Op == local240) {
										local268 = local172.cursor1;
									}
									if (local240 == 3) {
										local254 = 46;
									}
									if (local240 == local172.cursor2Op) {
										local268 = local172.cursor2;
									}
									if (local240 == 4) {
										local254 = 1001;
									}
									Static98.method1966(local268, local121, JagString.concatenate(new JagString[] { Static240.aClass100_1008, local172.name}), local47, local254, local228[local240], local147);
								}
							}
						}
						Static98.method1966(Static225.anInt5073, (long) local172.id, JagString.concatenate(new JagString[] { Static240.aClass100_1008, local172.name}), local47, (short) 1004, LocalizedText.EXAMINE, local147);
					}
				}
				@Pc(514) int local514;
				@Pc(526) int local526;
				@Pc(479) int local479;
				@Pc(493) int local493;
				@Pc(502) Npc local502;
				@Pc(597) Player local597;
				if (local133 == 1) {
					@Pc(421) Npc local421 = NpcList.npcs[local140];
					if ((local421.type.soze & 0x1) == 0 && (local421.xFine & 0x7F) == 0 && (local421.zFine & 0x7F) == 0 || (local421.type.soze & 0x1) == 1 && (local421.xFine & 0x7F) == 64 && (local421.zFine & 0x7F) == 64) {
						local479 = local421.xFine + 64 - local421.type.soze * 64;
						local240 = local421.zFine - (local421.type.soze - 1) * 64;
						for (local493 = 0; local493 < Static272.anInt5214; local493++) {
							local502 = NpcList.npcs[Static33.anIntArray79[local493]];
							local514 = local502.xFine + 64 - local502.type.soze * 64;
							local526 = local502.zFine + 64 - local502.type.soze * 64;
							if (local502 != null && local421 != local502 && local514 >= local479 && local421.type.soze - (local514 - local479 >> 7) >= local502.type.soze && local240 <= local526 && local502.type.soze <= local421.type.soze - (local526 - local240 >> 7)) {
								Static246.method4240(local502.type, local47, Static33.anIntArray79[local493], local147);
							}
						}
						for (local493 = 0; local493 < PlayerList.size; local493++) {
							local597 = PlayerList.players[PlayerList.ids[local493]];
							local514 = local597.xFine + 64 - local597.getSize() * 64;
							local526 = local597.zFine + 64 - local597.getSize() * 64;
							if (local597 != null && local514 >= local479 && local597.getSize() <= local421.type.soze - (local514 - local479 >> 7) && local526 >= local240 && local597.getSize() <= local421.type.soze - (local526 - local240 >> 7)) {
								Static217.method3767(PlayerList.ids[local493], local147, local597, local47);
							}
						}
					}
					Static246.method4240(local421.type, local47, local140, local147);
				}
				if (local133 == 0) {
					@Pc(688) Player local688 = PlayerList.players[local140];
					if ((local688.xFine & 0x7F) == 64 && (local688.zFine & 0x7F) == 64) {
						local479 = local688.xFine - (local688.getSize() - 1) * 64;
						local240 = local688.zFine + 64 - local688.getSize() * 64;
						for (local493 = 0; local493 < Static272.anInt5214; local493++) {
							local502 = NpcList.npcs[Static33.anIntArray79[local493]];
							local514 = local502.xFine + 64 - local502.type.soze * 64;
							local526 = local502.zFine + 64 - local502.type.soze * 64;
							if (local502 != null && local514 >= local479 && local502.type.soze <= local688.getSize() - (local514 - local479 >> 7) && local526 >= local240 && local502.type.soze <= local688.getSize() - (local526 - local240 >> 7)) {
								Static246.method4240(local502.type, local47, Static33.anIntArray79[local493], local147);
							}
						}
						for (local493 = 0; local493 < PlayerList.size; local493++) {
							local597 = PlayerList.players[PlayerList.ids[local493]];
							local514 = local597.xFine - (local597.getSize() - 1) * 64;
							local526 = local597.zFine + 64 - local597.getSize() * 64;
							if (local597 != null && local597 != local688 && local479 <= local514 && local597.getSize() <= local688.getSize() - (local514 - local479 >> 7) && local526 >= local240 && local597.getSize() <= local688.getSize() - (local526 - local240 >> 7)) {
								Static217.method3767(PlayerList.ids[local493], local147, local597, local47);
							}
						}
					}
					Static217.method3767(local140, local147, local688, local47);
				}
				if (local133 == 3) {
					@Pc(931) LinkedList local931 = Static159.aClass69ArrayArrayArray1[Player.level][local47][local147];
					if (local931 != null) {
						for (@Pc(940) ObjStackNode local940 = (ObjStackNode) local931.method2279(); local940 != null; local940 = (ObjStackNode) local931.method2286()) {
							local240 = local940.aClass8_Sub7_1.anInt5555;
							@Pc(951) ObjType local951 = ObjTypeList.get(local240);
							if (Static260.anInt5014 == 1) {
								Static98.method1966(Static169.anInt4075, (long) local240, JagString.concatenate(new JagString[] { Static34.aClass100_203, Static223.aClass100_947, local951.name}), local47, (short) 33, LocalizedText.USE, local147);
							} else if (Static241.aBoolean302) {
								@Pc(1142) ParamType local1142 = Static121.anInt3039 == -1 ? null : ParamTypeList.get(Static121.anInt3039);
								if ((Static274.anInt4999 & 0x1) != 0 && (local1142 == null || local951.getParam(local1142.defaultInt, Static121.anInt3039) != local1142.defaultInt)) {
									Static98.method1966(Static246.anInt5393, (long) local240, JagString.concatenate(new JagString[] { Static78.aClass100_466, Static223.aClass100_947, local951.name}), local47, (short) 39, Static102.aClass100_545, local147);
								}
							} else {
								@Pc(997) JagString[] local997 = local951.ops;
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
										if (local514 == local951.cursor1Op) {
											local1041 = local951.cursor1;
										}
										if (local514 == 2) {
											local1025 = 18;
										}
										if (local951.cursor2Op == local514) {
											local1041 = local951.cursor2;
										}
										if (local514 == 3) {
											local1025 = 20;
										}
										if (local514 == 4) {
											local1025 = 24;
										}
										Static98.method1966(local1041, (long) local240, JagString.concatenate(new JagString[] { Static8.aClass100_32, local951.name}), local47, local1025, local997[local514], local147);
									}
								}
								Static98.method1966(Static225.anInt5073, (long) local240, JagString.concatenate(new JagString[] { Static8.aClass100_32, local951.name}), local47, (short) 1002, LocalizedText.EXAMINE, local147);
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
				if (SceneGraph.tiles[local14][arg1][arg2] == null) {
					SceneGraph.tiles[local14][arg1][arg2] = new Tile(local14, arg1, arg2);
				}
			}
			SceneGraph.tiles[arg0][arg1][arg2].plainTile = local12;
		} else if (arg3 == 1) {
			local12 = new PlainTile(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (SceneGraph.tiles[local14][arg1][arg2] == null) {
					SceneGraph.tiles[local14][arg1][arg2] = new Tile(local14, arg1, arg2);
				}
			}
			SceneGraph.tiles[arg0][arg1][arg2].plainTile = local12;
		} else {
			@Pc(134) ShapedTile local134 = new ShapedTile(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (SceneGraph.tiles[local14][arg1][arg2] == null) {
					SceneGraph.tiles[local14][arg1][arg2] = new Tile(local14, arg1, arg2);
				}
			}
			SceneGraph.tiles[arg0][arg1][arg2].shapedTile = local134;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIII)V")
	public static void method3308(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(8) int local8 = arg2; local8 <= arg0; local8++) {
			Static131.method2576(Static71.anIntArrayArray10[local8], arg3, arg1, arg4);
		}
	}
}
