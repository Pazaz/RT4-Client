package rt4;

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Lclient!gn;")
	public static final LruHashTable aClass54_5 = new LruHashTable(16);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZB)V")
	public static void method1835(@OriginalArg(0) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(13) byte[][] local13;
		if (GlRenderer.enabled && arg0) {
			local11 = 1;
			local13 = LoginManager.underWaterMapFilesBuffer;
		} else {
			local13 = LoginManager.mapFilesBuffer;
			local11 = 4;
		}
		for (@Pc(21) int local21 = 0; local21 < local11; local21++) {
			client.audioLoop();
			for (@Pc(32) int local32 = 0; local32 < 13; local32++) {
				for (@Pc(39) int local39 = 0; local39 < 13; local39++) {
					@Pc(52) int local52 = Protocol.anIntArrayArrayArray18[local21][local32][local39];
					@Pc(54) boolean local54 = false;
					if (local52 != -1) {
						@Pc(65) int local65 = local52 >> 24 & 0x3;
						if (!arg0 || local65 == 0) {
							@Pc(76) int local76 = local52 >> 3 & 0x7FF;
							@Pc(82) int local82 = local52 >> 1 & 0x3;
							@Pc(88) int local88 = local52 >> 14 & 0x3FF;
							@Pc(98) int local98 = (local88 / 8 << 8) + local76 / 8;
							for (@Pc(100) int local100 = 0; local100 < LoginManager.regionBitPacked.length; local100++) {
								if (LoginManager.regionBitPacked[local100] == local98 && local13[local100] != null) {
									method4228(local82, local32 * 8, local21, PathFinder.collisionMaps, local39 * 8, local13[local100], local65, (local76 & 0x7) * 8, (local88 & 0x7) * 8, arg0);
									local54 = true;
									break;
								}
							}
						}
					}
					if (!local54) {
						Static87.method645(local21, local39 * 8, local32 * 8, 8, 8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)[B")
	public static byte[] method1837(@OriginalArg(1) int arg0) {
		@Pc(10) ByteArrayNodeSecondary local10 = (ByteArrayNodeSecondary) aClass54_5.get((long) arg0);
		if (local10 == null) {
			@Pc(24) Random local24 = new Random((long) arg0);
			@Pc(27) byte[] local27 = new byte[512];
			@Pc(29) int local29;
			for (local29 = 0; local29 < 255; local29++) {
				local27[local29] = (byte) local29;
			}
			for (local29 = 0; local29 < 255; local29++) {
				@Pc(53) int local53 = 255 - local29;
				@Pc(58) int local58 = Texture.method3219(local53, local24);
				@Pc(62) byte local62 = local27[local58];
				local27[local58] = local27[local53];
				local27[local53] = local27[511 - local29] = local62;
			}
			local10 = new ByteArrayNodeSecondary(local27);
			aClass54_5.put(local10, (long) arg0);
		}
		return local10.value;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([IJIZ)Lclient!na;")
	public static JagString method1838(@OriginalArg(0) int[] arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		if (QuickChatPhraseTypeList.decoder != null) {
			@Pc(17) JagString local17 = QuickChatPhraseTypeList.decoder.decode(arg2, arg0, arg1);
			if (local17 != null) {
				return local17;
			}
		}
		return Protocol.method2929(arg1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public static void method1841() {
		if (!Static40.aBoolean108) {
			if (Static226.anInt3953 != 0) {
				ScriptRunner.anInt3751 = Mouse.anInt5850;
				ScriptRunner.anInt1892 = Static226.anInt5895;
			} else if (Mouse.clickButton == 0) {
				ScriptRunner.anInt3751 = Mouse.lastMouseX;
				ScriptRunner.anInt1892 = Mouse.lastMouseY;
			} else {
				ScriptRunner.anInt3751 = Mouse.clickX;
				ScriptRunner.anInt1892 = Mouse.clickY;
			}
			MiniMenu.size = 1;
			MiniMenu.ops[0] = LocalizedText.CANCEL;
			MiniMenu.opBases[0] = JagString.EMPTY;
			MiniMenu.actions[0] = 1005;
			MiniMenu.cursors[0] = MiniMenu.anInt1092;
		}
		if (InterfaceList.topLevelInterface != -1) {
			Static96.method1949(InterfaceList.topLevelInterface);
		}
		@Pc(60) int local60;
		for (local60 = 0; local60 < InterfaceList.rectangles; local60++) {
			if (InterfaceList.aBooleanArray100[local60]) {
				InterfaceList.rectangleRedraw[local60] = true;
			}
			Static126.aBooleanArray116[local60] = InterfaceList.aBooleanArray100[local60];
			InterfaceList.aBooleanArray100[local60] = false;
		}
		Static87.aClass13_13 = null;
		Static87.anInt2503 = -1;
		Static126.anInt5574 = -1;
		InterfaceList.mouseOverInventoryInterface = null;
		if (GlRenderer.enabled) {
			ScriptRunner.aBoolean299 = true;
		}
		Static182.anInt4311 = client.loop;
		if (InterfaceList.topLevelInterface != -1) {
			InterfaceList.rectangles = 0;
			Static9.method182();
		}
		if (GlRenderer.enabled) {
			GlRaster.method1177();
		} else {
			SoftwareRaster.method2503();
		}
		MiniMenu.sort();
		if (Static40.aBoolean108) {
			if (Static40.aBoolean298) {
				Static112.method2297();
			} else {
				Static145.method2744();
			}
		} else if (Static87.aClass13_13 != null) {
			Static49.method1207(Static87.aClass13_13, Static87.anInt3484, Static131.anInt3260);
		} else if (Static87.anInt2503 != -1) {
			Static49.method1207(null, Static126.anInt5574, Static87.anInt2503);
		}
		local60 = Static40.aBoolean108 ? -1 : method4044();
		if (local60 == -1) {
			local60 = ScriptRunner.anInt5794;
		}
		Static81.method1750(local60);
		if (MiniMenu.anInt3096 == 1) {
			MiniMenu.anInt3096 = 2;
		}
		if (Protocol.anInt4422 == 1) {
			Protocol.anInt4422 = 2;
		}
		if (Cheat.rectDebug == 3) {
			for (@Pc(189) int local189 = 0; local189 < InterfaceList.rectangles; local189++) {
				if (Static126.aBooleanArray116[local189]) {
					if (GlRenderer.enabled) {
						GlRaster.fillRectAlpha(InterfaceList.rectangleX[local189], InterfaceList.rectangleY[local189], InterfaceList.rectangleWidth[local189], InterfaceList.rectangleHeight[local189], 16711935, 128);
					} else {
						SoftwareRaster.fillRectAlpha(InterfaceList.rectangleX[local189], InterfaceList.rectangleY[local189], InterfaceList.rectangleWidth[local189], InterfaceList.rectangleHeight[local189], 16711935, 128);
					}
				} else if (InterfaceList.rectangleRedraw[local189]) {
					if (GlRenderer.enabled) {
						GlRaster.fillRectAlpha(InterfaceList.rectangleX[local189], InterfaceList.rectangleY[local189], InterfaceList.rectangleWidth[local189], InterfaceList.rectangleHeight[local189], 16711680, 128);
					} else {
						SoftwareRaster.fillRectAlpha(InterfaceList.rectangleX[local189], InterfaceList.rectangleY[local189], InterfaceList.rectangleWidth[local189], InterfaceList.rectangleHeight[local189], 16711680, 128);
					}
				}
			}
		}
		AreaSoundManager.redraw(Protocol.anInt4247, PlayerList.self.xFine, PlayerList.self.zFine, Player.level);
		Protocol.anInt4247 = 0;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
	public static void method1843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static231.method1690(TextureOp29.anInt5063, arg2 + arg3, TextureOp29.anInt4164);
		@Pc(30) int local30 = Static231.method1690(TextureOp29.anInt5063, arg3 - arg2, TextureOp29.anInt4164);
		TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[arg1], local30, local22, arg0);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(58) int local58;
			@Pc(68) int local68;
			@Pc(84) int local84;
			@Pc(93) int local93;
			if (local12 > 0) {
				local9--;
				local58 = arg1 - local9;
				local12 -= local9 << 1;
				local68 = arg1 + local9;
				if (local68 >= TextureOp29.anInt5773 && local58 <= TextureOp29.anInt2869) {
					local84 = Static231.method1690(TextureOp29.anInt5063, arg3 + local7, TextureOp29.anInt4164);
					local93 = Static231.method1690(TextureOp29.anInt5063, arg3 - local7, TextureOp29.anInt4164);
					if (TextureOp29.anInt2869 >= local68) {
						TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[local68], local93, local84, arg0);
					}
					if (TextureOp29.anInt5773 <= local58) {
						TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[local58], local93, local84, arg0);
					}
				}
			}
			local7++;
			local58 = arg1 - local7;
			local68 = local7 + arg1;
			if (local68 >= TextureOp29.anInt5773 && TextureOp29.anInt2869 >= local58) {
				local84 = Static231.method1690(TextureOp29.anInt5063, arg3 + local9, TextureOp29.anInt4164);
				local93 = Static231.method1690(TextureOp29.anInt5063, arg3 - local9, TextureOp29.anInt4164);
				if (local68 <= TextureOp29.anInt2869) {
					TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[local68], local93, local84, arg0);
				}
				if (local58 >= TextureOp29.anInt5773) {
					TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[local58], local93, local84, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(III[Lclient!mj;IB[BIIIZ)V")
	public static void method4228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) CollisionMap[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		@Pc(17) int local17;
		if (!arg9) {
			for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
				for (local17 = 0; local17 < 8; local17++) {
					if (arg1 + local10 > 0 && local10 + arg1 < 103 && local17 + arg4 > 0 && arg4 + local17 < 103) {
						arg3[arg2].flags[local10 + arg1][local17 + arg4] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(87) byte local87;
		if (arg9) {
			local87 = 1;
		} else {
			local87 = 4;
		}
		@Pc(96) Buffer local96 = new Buffer(arg5);
		@Pc(103) int local103;
		@Pc(108) int local108;
		for (local17 = 0; local17 < local87; local17++) {
			for (local103 = 0; local103 < 64; local103++) {
				for (local108 = 0; local108 < 64; local108++) {
					if (arg6 == local17 && arg8 <= local103 && arg8 + 8 > local103 && arg7 <= local108 && local108 < arg7 + 8) {
						SceneGraph.readTile(0, 0, arg9, local96, method3659(arg0, local103 & 0x7, local108 & 0x7) + arg4, method4360(arg0, local108 & 0x7, local103 & 0x7) + arg1, arg0, arg2);
					} else {
						SceneGraph.readTile(0, 0, arg9, local96, -1, -1, 0, 0);
					}
				}
			}
		}
		@Pc(232) int local232;
		@Pc(417) int local417;
		@Pc(255) int local255;
		@Pc(266) int local266;
		@Pc(316) int local316;
		while (local96.data.length > local96.offset) {
			local103 = local96.g1();
			if (local103 != 129) {
				local96.offset--;
				break;
			}
			for (local108 = 0; local108 < 4; local108++) {
				@Pc(223) byte local223 = local96.g1b();
				@Pc(237) int local237;
				if (local223 == 0) {
					if (local108 <= arg6) {
						local237 = arg1 + 7;
						local232 = arg1;
						local255 = arg4 + 7;
						if (local255 < 0) {
							local255 = 0;
						} else if (local255 >= 104) {
							local255 = 104;
						}
						if (local237 < 0) {
							local237 = 0;
						} else if (local237 >= 104) {
							local237 = 104;
						}
						local417 = arg4;
						if (arg4 < 0) {
							local417 = 0;
						} else if (arg4 >= 104) {
							local417 = 104;
						}
						if (arg1 < 0) {
							local232 = 0;
						} else if (arg1 >= 104) {
							local232 = 104;
						}
						while (local237 > local232) {
							while (local417 < local255) {
								SceneGraph.aByteArrayArrayArray13[arg2][local232][local417] = 0;
								local417++;
							}
							local232++;
						}
					}
				} else if (local223 == 1) {
					for (local232 = 0; local232 < 64; local232 += 4) {
						for (local237 = 0; local237 < 64; local237 += 4) {
							@Pc(246) byte local246 = local96.g1b();
							if (local108 <= arg6) {
								for (local255 = local232; local255 < local232 + 4; local255++) {
									for (local266 = local237; local266 < local237 + 4; local266++) {
										if (local255 >= arg8 && local255 < arg8 + 8 && local266 >= arg7 && arg7 + 8 > arg7) {
											local316 = arg1 + method4360(arg0, local266 & 0x7, local255 & 0x7);
											@Pc(328) int local328 = method3659(arg0, local255 & 0x7, local266 & 0x7) + arg4;
											if (local316 >= 0 && local316 < 104 && local328 >= 0 && local328 < 104) {
												SceneGraph.aByteArrayArrayArray13[arg2][local316][local328] = local246;
											}
										}
									}
								}
							}
						}
					}
				} else if (local223 == 2) {
				}
			}
		}
		@Pc(497) int local497;
		if (GlRenderer.enabled && !arg9) {
			@Pc(472) Environment local472 = null;
			label207: while (true) {
				label200: do {
					while (local96.data.length > local96.offset) {
						local108 = local96.g1();
						if (local108 != 0) {
							if (local108 != 1) {
								throw new IllegalStateException();
							}
							local497 = local96.g1();
							continue label200;
						}
						local472 = new Environment(local96);
					}
					if (local472 == null) {
						local472 = new Environment();
					}
					Static73.aClass92ArrayArray1[arg1 >> 3][arg4 >> 3] = local472;
					break label207;
				} while (local497 <= 0);
				for (local232 = 0; local232 < local497; local232++) {
					@Pc(517) Light local517 = new Light(local96);
					if (local517.anInt2243 == 31) {
						@Pc(529) LightType local529 = LightTypeList.get(local96.g2());
						local517.method1762(local529.anInt2865, local529.anInt2873, local529.anInt2867, local529.anInt2872);
					}
					local417 = local517.x >> 7;
					local255 = local517.z >> 7;
					if (arg6 == local517.level && local417 >= arg8 && arg8 + 8 > local417 && arg7 <= local255 && arg7 + 8 > local255) {
						local266 = method3675(arg0, local517.x & 0x3FF, local517.z & 0x3FF) + (arg1 << 7);
						local316 = method3388(local517.x & 0x3FF, arg0, local517.z & 0x3FF) + (arg4 << 7);
						local517.x = local266;
						local517.z = local316;
						local417 = local517.x >> 7;
						local255 = local517.z >> 7;
						if (local417 >= 0 && local255 >= 0 && local417 < 104 && local255 < 104) {
							local517.aBoolean125 = (SceneGraph.tileFlags[1][local417][local255] & 0x2) != 0;
							local517.y = SceneGraph.tileHeights[local517.level][local417][local255] - local517.y;
							LightingManager.method2389(local517);
						}
					}
				}
			}
		}
		local103 = arg1 + 7;
		local108 = arg4 + 7;
		for (local497 = arg1; local497 < local103; local497++) {
			for (local232 = arg4; local232 < local108; local232++) {
				SceneGraph.aByteArrayArrayArray13[arg2][local497][local232] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)I")
	public static int method4044() {
		return Cheat.shiftClick && Keyboard.pressedKeys[Keyboard.KEY_SHIFT] && MiniMenu.size > 2 ? MiniMenu.cursors[MiniMenu.size - 2] : MiniMenu.cursors[MiniMenu.size - 1];
	}

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZII)I")
    public static int method4360(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
        @Pc(3) int local3 = arg0 & 0x3;
        if (local3 == 0) {
            return arg2;
        } else if (local3 == 1) {
            return arg1;
        } else if (local3 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBII)I")
    public static int method3659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
        @Pc(3) int local3 = arg0 & 0x3;
        if (local3 == 0) {
            return arg2;
        } else if (local3 == 1) {
            return 7 - arg1;
        } else if (local3 == 2) {
            return 7 - arg2;
        } else {
            return arg1;
        }
    }

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIBI)I")
	public static int method3675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIZI)I")
	public static int method3388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 1023 - arg0;
		} else if (local3 == 2) {
			return 1023 - arg2;
		} else {
			return arg0;
		}
	}
}
