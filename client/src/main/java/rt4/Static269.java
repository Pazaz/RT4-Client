package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!wa", name = "pb", descriptor = "Lclient!na;")
	public static final JagString aClass100_556 = JagString.parse("<br>");

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([Lclient!mj;ZIIIII[B)V")
	public static void method2203(@OriginalArg(0) CollisionMap[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6) {
		@Pc(14) int local14;
		@Pc(21) int local21;
		if (!arg1) {
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				for (local14 = 0; local14 < 64; local14++) {
					for (local21 = 0; local21 < 64; local21++) {
						if (arg4 + local14 > 0 && local14 + arg4 < 103 && arg3 + local21 > 0 && local21 + arg3 < 103) {
							arg0[local9].flags[local14 + arg4][arg3 + local21] &= 0xFEFFFFFF;
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
					SceneGraph.readTile(arg2, arg5, arg1, local95, local117 + arg3, arg4 + local21, 0, local14);
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
							SceneGraph.aByteArrayArrayArray13[local117][local243][local190] = 0;
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
										SceneGraph.aByteArrayArrayArray13[local117][local194][local320] = local305;
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
							SceneGraph.aByteArrayArrayArray13[local117][local243][local190] = SceneGraph.aByteArrayArrayArray13[local117 - 1][local243][local190];
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
								Static103.aClass92ArrayArray1[local243][local188] = local490;
							}
						}
					}
					break label270;
				} while (local515 <= 0);
				for (local243 = 0; local243 < local515; local243++) {
					@Pc(529) Light local529 = new Light(local95);
					if (local529.anInt2243 == 31) {
						@Pc(541) LightType local541 = LightTypeList.get(local95.g2());
						local529.method1762(local541.anInt2865, local541.anInt2873, local541.anInt2867, local541.anInt2872);
					}
					local529.anInt2245 += arg3 << 7;
					local529.anInt2240 += arg4 << 7;
					local194 = local529.anInt2245 >> 7;
					local190 = local529.anInt2240 >> 7;
					if (local190 >= 0 && local194 >= 0 && local190 < 104 && local194 < 104) {
						local529.aBoolean125 = (SceneGraph.tileFlags[1][local190][local194] & 0x2) != 0;
						local529.anInt2235 = SceneGraph.tileHeights[local529.anInt2241][local190][local194] - local529.anInt2235;
						LightingManager.method2389(local529);
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
						SceneGraph.aByteArrayArrayArray13[local21][local243][local188] = 0;
					}
				}
			}
		}
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
			Static38.method960((byte) (Static253.anInt3325 - 4 & 0xFF));
			Static232.method3993(2);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIII)V")
	public static void method2225(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (WorldMap.loadPercentage < 100) {
			WorldMap.method3413();
		}
		if (GlRenderer.enabled) {
			GlRaster.setClip(arg0, arg1, arg0 + arg3, arg2 + arg1);
		} else {
			SoftwareRaster.setClip(arg0, arg1, arg0 + arg3, arg2 + arg1);
		}
		@Pc(50) int local50;
		@Pc(61) int local61;
		if (WorldMap.loadPercentage < 100) {
			local50 = arg0 + arg3 / 2;
			local61 = arg2 / 2 + arg1 - 18 - 20;
			if (GlRenderer.enabled) {
				GlRaster.method1186(arg0, arg1, arg3, arg2, 0);
				GlRaster.method1179(local50 - 152, local61, 304, 34, 9179409);
				GlRaster.method1179(local50 - 151, local61 + 1, 302, 32, 0);
				GlRaster.method1186(local50 - 150, local61 + 2, WorldMap.loadPercentage * 3, 30, 9179409);
				GlRaster.method1186(local50 + WorldMap.loadPercentage * 3 - 150, local61 - -2, 300 - WorldMap.loadPercentage * 3, 30, 0);
			} else {
				SoftwareRaster.fillRect(arg0, arg1, arg3, arg2, 0);
				SoftwareRaster.drawRect(local50 - 152, local61, 304, 34, 9179409);
				SoftwareRaster.drawRect(local50 - 151, local61 + 1, 302, 32, 0);
				SoftwareRaster.fillRect(local50 - 150, local61 + 2, WorldMap.loadPercentage * 3, 30, 9179409);
				SoftwareRaster.fillRect(WorldMap.loadPercentage * 3 + local50 - 150, local61 - -2, 300 - WorldMap.loadPercentage * 3, 30, 0);
			}
			Fonts.b12Full.renderCenter(LocalizedText.LOADINGDOTDOTDOT, local50, local61 + 20, 16777215, -1);
			return;
		}
		WorldMap.anInt1176 = (int) ((float) (arg2 * 2) / WorldMap.zoom);
		Static109.anInt2882 = WorldMap.anInt435 - (int) ((float) arg3 / WorldMap.zoom);
		@Pc(211) int local211 = WorldMap.anInt435 - (int) ((float) arg3 / WorldMap.zoom);
		local50 = WorldMap.anInt919 - (int) ((float) arg2 / WorldMap.zoom);
		Static109.anInt2884 = WorldMap.anInt919 - (int) ((float) arg2 / WorldMap.zoom);
		@Pc(236) int local236 = WorldMap.anInt919 + (int) ((float) arg2 / WorldMap.zoom);
		local61 = (int) ((float) arg3 / WorldMap.zoom) + WorldMap.anInt435;
		WorldMap.anInt2387 = (int) ((float) (arg3 * 2) / WorldMap.zoom);
		if (GlRenderer.enabled) {
			if (WorldMap.aClass3_Sub2_Sub1_Sub1_2 == null || WorldMap.aClass3_Sub2_Sub1_Sub1_2.width != arg3 || WorldMap.aClass3_Sub2_Sub1_Sub1_2.height != arg2) {
				WorldMap.aClass3_Sub2_Sub1_Sub1_2 = null;
				WorldMap.aClass3_Sub2_Sub1_Sub1_2 = new SoftwareSprite(arg3, arg2);
			}
			SoftwareRaster.setSize(WorldMap.aClass3_Sub2_Sub1_Sub1_2.pixels, arg3, arg2);
			Static214.method4364(arg3, 0, local61, local50, 0, local236, arg2, local211);
			method1195(arg3, 0, local61, local236, arg2, 0, local211, local50);
			Static38.method959(0, 0, local211, arg3, local236, local50, local61, arg2);
			GlRaster.method1178(WorldMap.aClass3_Sub2_Sub1_Sub1_2.pixels, arg0, arg1, arg3, arg2);
			SoftwareRaster.pixels = null;
		} else {
			Static214.method4364(arg3 + arg0, arg1, local61, local50, arg0, local236, arg1 + arg2, local211);
			method1195(arg0 + arg3, arg0, local61, local236, arg2 + arg1, arg1, local211, local50);
			Static38.method959(arg0, arg1, local211, arg0 + arg3, local236, local50, local61, arg2 + arg1);
		}
		if (Static201.anInt1864 > 0) {
			Static91.anInt2428--;
			if (Static91.anInt2428 == 0) {
				Static91.anInt2428 = 20;
				Static201.anInt1864--;
			}
		}

		if (Cheat.displayFps) {
			@Pc(405) int local405 = arg1 + arg2 - 8;
			@Pc(412) int local412 = arg0 + arg3 - 5;
			Fonts.p12Full.renderRight(JagString.concatenate(new JagString[]{Cheat.DEBUG_FPS, JagString.parseInt((int)GameShell.framesPerSecond)}), local412, local405, 16776960, -1);
			@Pc(434) Runtime runtime = Runtime.getRuntime();
			@Pc(443) int memory = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L / 1024L);
			@Pc(445) int color = 16776960;
			@Pc(446) int local446 = local405 - 15;
			if (memory > 95) {
				color = 16711680;
			}
			Fonts.p12Full.renderRight(JagString.concatenate(new JagString[]{Cheat.DEBUG_MEMORY, JagString.parseInt(memory), Cheat.DEBUG_MEMORY_UNIT}), local412, local446, color, -1);
			local405 = local446 - 15;
		}
	}

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIIII)V")
    public static void method1195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
        @Pc(13) int local13 = arg2 - arg6;
        @Pc(17) int local17 = arg3 - arg7;
        @Pc(26) int local26 = (arg0 - arg1 << 16) / local13;
        @Pc(35) int local35 = (arg4 - arg5 << 16) / local17;
        Static232.method3991(arg1, arg3, arg2, local35, arg6, local26, arg7, arg5);
    }
}
