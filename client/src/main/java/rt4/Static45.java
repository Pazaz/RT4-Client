package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!di", name = "q", descriptor = "[Lclient!na;")
	public static final JagString[] aClass100Array53 = new JagString[5];

	@OriginalMember(owner = "client!di", name = "H", descriptor = "Z")
	public static boolean aBoolean84 = false;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "([Lclient!mj;ZI)V")
	public static void method1169(@OriginalArg(0) CollisionMap[] collisionMaps, @OriginalArg(1) boolean underwater) {
		@Pc(10) int level;
		@Pc(15) int x;
		if (!underwater) {
			for (level = 0; level < 4; level++) {
				for (x = 0; x < 104; x++) {
					for (@Pc(22) int z = 0; z < 104; z++) {
						if ((SceneGraph.tileFlags[level][x][z] & 0x1) == 1) {
							@Pc(43) int transformedLevel = level;
							if ((SceneGraph.tileFlags[1][x][z] & 0x2) == 2) {
								transformedLevel = level - 1;
							}
							if (transformedLevel >= 0) {
								collisionMaps[transformedLevel].addRangeableFlag(z, x);
							}
						}
					}
				}
			}
			Static183.anInt4272 += (int) (Math.random() * 5.0D) - 2;
			if (Static183.anInt4272 < -16) {
				Static183.anInt4272 = -16;
			}
			if (Static183.anInt4272 > 16) {
				Static183.anInt4272 = 16;
			}
			Static86.anInt2293 += (int) (Math.random() * 5.0D) - 2;
			if (Static86.anInt2293 < -8) {
				Static86.anInt2293 = -8;
			}
			if (Static86.anInt2293 > 8) {
				Static86.anInt2293 = 8;
			}
		}
		@Pc(128) byte local128;
		if (underwater) {
			local128 = 1;
		} else {
			local128 = 4;
		}
		level = Static86.anInt2293 >> 2 << 10;
		@Pc(142) int[][] local142 = new int[104][104];
		@Pc(146) int[][] local146 = new int[104][104];
		x = Static183.anInt4272 >> 1;
		@Pc(152) int local152;
		@Pc(168) int local168;
		@Pc(173) int local173;
		@Pc(178) int local178;
		@Pc(194) int local194;
		@Pc(200) int local200;
		@Pc(202) int local202;
		@Pc(209) int local209;
		@Pc(349) int local349;
		@Pc(234) int local234;
		@Pc(254) int local254;
		@Pc(267) int local267;
		for (local152 = 0; local152 < local128; local152++) {
			@Pc(159) byte[][] local159 = Static118.aByteArrayArrayArray9[local152];
			@Pc(273) int local273;
			@Pc(326) int local326;
			@Pc(332) int local332;
			@Pc(322) int local322;
			if (!GlRenderer.enabled) {
				local168 = (int) Math.sqrt(5100.0D);
				local173 = local168 * 768 >> 8;
				for (local178 = 1; local178 < 103; local178++) {
					for (local194 = 1; local194 < 103; local194++) {
						local209 = SceneGraph.tileHeights[local152][local194][local178 + 1] - SceneGraph.tileHeights[local152][local194][local178 - 1];
						local202 = SceneGraph.tileHeights[local152][local194 + 1][local178] - SceneGraph.tileHeights[local152][local194 - 1][local178];
						local349 = (int) Math.sqrt((double) (local202 * local202 + local209 * local209 + 65536));
						local267 = (local209 << 8) / local349;
						local254 = -65536 / local349;
						local234 = (local202 << 8) / local349;
						local273 = (local159[local194][local178] >> 1) + (local159[local194][local178 - 1] >> 2) + (local159[local194 - -1][local178] >> 3) + (local159[local194 - 1][local178] >> 2) + (local159[local194][local178 + 1] >> 3);
						local200 = (local267 * -50 + local234 * -50 + local254 * -10) / local173 + 74;
						local146[local194][local178] = local200 - local273;
					}
				}
			} else if (Preferences.highDetailLighting) {
				for (local168 = 1; local168 < 103; local168++) {
					for (local173 = 1; local173 < 103; local173++) {
						local194 = (local159[local173 + 1][local168] >> 3) + (local159[local173 - 1][local168] >> 2) + (local159[local173][local168 + -1] >> 2) + (local159[local173][local168 + 1] >> 3) + (local159[local173][local168] >> 1);
						local146[local173][local168] = 74 - local194;
					}
				}
			} else {
				local168 = (int) Static161.aFloatArray18[0];
				local173 = (int) Static161.aFloatArray18[1];
				local178 = (int) Static161.aFloatArray18[2];
				local194 = (int) Math.sqrt((double) (local173 * local173 + local168 * local168 + local178 * local178));
				local200 = local194 * 1024 >> 8;
				for (local202 = 1; local202 < 103; local202++) {
					for (local209 = 1; local209 < 103; local209++) {
						local234 = SceneGraph.tileHeights[local152][local209 + 1][local202] - SceneGraph.tileHeights[local152][local209 - 1][local202];
						local254 = SceneGraph.tileHeights[local152][local209][local202 + 1] - SceneGraph.tileHeights[local152][local209][local202 - 1];
						local267 = (int) Math.sqrt((double) (local234 * local234 + local254 * local254 + 65536));
						local273 = (local234 << 8) / local267;
						local322 = (local159[local209][local202 + 1] >> 3) + (local159[local209][local202 - 1] >> 2) + (local159[local209 - 1][local202] >> 2) + (local159[local209 + 1][local202] >> 3) + (local159[local209][local202] >> 1);
						local326 = -65536 / local267;
						local332 = (local254 << 8) / local267;
						local349 = (local178 * local332 + local168 * local273 + local326 * local173) / local200 + 96;
						local146[local209][local202] = local349 - (int) ((float) local322 * 1.7F);
					}
				}
			}
			for (local168 = 0; local168 < 104; local168++) {
				Static221.anIntArray376[local168] = 0;
				Static139.anIntArray325[local168] = 0;
				Static279.anIntArray568[local168] = 0;
				Static251.anIntArray479[local168] = 0;
				Static128.anIntArray293[local168] = 0;
			}
			for (local168 = -5; local168 < 104; local168++) {
				for (local173 = 0; local173 < 104; local173++) {
					local178 = local168 + 5;
					@Pc(729) int local729;
					if (local178 < 104) {
						local194 = SceneGraph.tileUnderlays[local152][local178][local173] & 0xFF;
						if (local194 > 0) {
							@Pc(693) FluType local693 = FluTypeList.get(local194 - 1);
							Static221.anIntArray376[local173] += local693.weightedHue;
							Static139.anIntArray325[local173] += local693.saturation;
							Static279.anIntArray568[local173] += local693.lightness;
							Static251.anIntArray479[local173] += local693.chroma;
							local729 = Static128.anIntArray293[local173]++;
						}
					}
					local194 = local168 - 5;
					if (local194 >= 0) {
						local200 = SceneGraph.tileUnderlays[local152][local194][local173] & 0xFF;
						if (local200 > 0) {
							@Pc(758) FluType local758 = FluTypeList.get(local200 - 1);
							Static221.anIntArray376[local173] -= local758.weightedHue;
							Static139.anIntArray325[local173] -= local758.saturation;
							Static279.anIntArray568[local173] -= local758.lightness;
							Static251.anIntArray479[local173] -= local758.chroma;
							local729 = Static128.anIntArray293[local173]--;
						}
					}
				}
				if (local168 >= 0) {
					local173 = 0;
					local194 = 0;
					local178 = 0;
					local200 = 0;
					local202 = 0;
					for (local209 = -5; local209 < 104; local209++) {
						local349 = local209 + 5;
						if (local349 < 104) {
							local178 += Static139.anIntArray325[local349];
							local202 += Static128.anIntArray293[local349];
							local173 += Static221.anIntArray376[local349];
							local200 += Static251.anIntArray479[local349];
							local194 += Static279.anIntArray568[local349];
						}
						local234 = local209 - 5;
						if (local234 >= 0) {
							local178 -= Static139.anIntArray325[local234];
							local200 -= Static251.anIntArray479[local234];
							local173 -= Static221.anIntArray376[local234];
							local202 -= Static128.anIntArray293[local234];
							local194 -= Static279.anIntArray568[local234];
						}
						if (local209 >= 0 && local202 > 0) {
							local142[local168][local209] = Static54.method1309(local194 / local202, local178 / local202, local173 * 256 / local200);
						}
					}
				}
			}
			for (local168 = 1; local168 < 103; local168++) {
				label771: for (local173 = 1; local173 < 103; local173++) {
					if (underwater || SceneGraph.allLevelsAreVisible() || (SceneGraph.tileFlags[0][local168][local173] & 0x2) != 0 || (SceneGraph.tileFlags[local152][local168][local173] & 0x10) == 0 && Static4.method22(local173, local168, local152) == Static41.anInt1316) {
						if (Static146.anInt3508 > local152) {
							Static146.anInt3508 = local152;
						}
						local178 = SceneGraph.tileUnderlays[local152][local168][local173] & 0xFF;
						local194 = SceneGraph.tileOverlays[local152][local168][local173] & 0xFF;
						if (local178 > 0 || local194 > 0) {
							local202 = SceneGraph.tileHeights[local152][local168 + 1][local173];
							local200 = SceneGraph.tileHeights[local152][local168][local173];
							local349 = SceneGraph.tileHeights[local152][local168][local173 + 1];
							local209 = SceneGraph.tileHeights[local152][local168 + 1][local173 + 1];
							if (local152 > 0) {
								@Pc(1067) boolean local1067 = true;
								if (local178 == 0 && SceneGraph.tileShapes[local152][local168][local173] != 0) {
									local1067 = false;
								}
								if (local194 > 0 && !FloTypeList.method4395(local194 - 1).aBoolean312) {
									local1067 = false;
								}
								if (local1067 && local200 == local202 && local200 == local209 && local349 == local200) {
									Static60.anIntArrayArrayArray6[local152][local168][local173] |= 0x4;
								}
							}
							if (local178 <= 0) {
								local234 = -1;
								local254 = 0;
							} else {
								local234 = local142[local168][local173];
								local267 = (local234 & 0x7F) + x;
								if (local267 < 0) {
									local267 = 0;
								} else if (local267 > 127) {
									local267 = 127;
								}
								local273 = (local234 & 0x380) + (local234 + level & 0xFC00) + local267;
								local254 = Rasteriser.palette[Static87.method1814(96, local273)];
							}
							local267 = local146[local168][local173];
							local332 = local146[local168][local173 + 1];
							local273 = local146[local168 + 1][local173];
							local326 = local146[local168 + 1][local173 + 1];
							if (local194 == 0) {
								Static176.method3305(local152, local168, local173, 0, 0, -1, local200, local202, local209, local349, Static87.method1814(local267, local234), Static87.method1814(local273, local234), Static87.method1814(local326, local234), Static87.method1814(local332, local234), 0, 0, 0, 0, local254, 0);
								if (GlRenderer.enabled && local152 > 0 && local234 != -1 && FluTypeList.get(local178 - 1).aBoolean198) {
									Static242.method4197(0, 0, true, false, local168, local173, local200 - SceneGraph.tileHeights[0][local168][local173], -SceneGraph.tileHeights[0][local168 + 1][local173] + local202, local209 - SceneGraph.tileHeights[0][local168 + 1][local173 + 1], local349 - SceneGraph.tileHeights[0][local168][local173 + 1]);
								}
								if (GlRenderer.enabled && !underwater && Static62.anIntArrayArray11 != null && local152 == 0) {
									for (local322 = local168 - 1; local322 <= local168 + 1; local322++) {
										for (@Pc(1794) int local1794 = local173 - 1; local1794 <= local173 + 1; local1794++) {
											if ((local322 != local168 || local173 != local1794) && local322 >= 0 && local322 < 104 && local1794 >= 0 && local1794 < 104) {
												@Pc(1834) int local1834 = SceneGraph.tileOverlays[local152][local322][local1794] & 0xFF;
												if (local1834 != 0) {
													@Pc(1842) FloType local1842 = FloTypeList.method4395(local1834 - 1);
													if (local1842.texture != -1 && Rasteriser.textureProvider.method3237(local1842.texture) == 4) {
														Static62.anIntArrayArray11[local168][local173] = local1842.anInt5889 + (local1842.anInt5898 << 24);
														continue label771;
													}
												}
											}
										}
									}
								}
							} else {
								local322 = SceneGraph.tileShapes[local152][local168][local173] + 1;
								@Pc(1242) byte local1242 = SceneGraph.tileAngles[local152][local168][local173];
								@Pc(1248) FloType local1248 = FloTypeList.method4395(local194 - 1);
								@Pc(1301) int local1301;
								@Pc(1353) int local1353;
								@Pc(1288) int local1288;
								if (GlRenderer.enabled && !underwater && Static62.anIntArrayArray11 != null && local152 == 0) {
									if (local1248.texture != -1 && Rasteriser.textureProvider.method3237(local1248.texture) == 4) {
										Static62.anIntArrayArray11[local168][local173] = (local1248.anInt5898 << 24) + local1248.anInt5889;
									} else {
										label737: for (local1288 = local168 - 1; local1288 <= local168 + 1; local1288++) {
											for (local1301 = local173 - 1; local1301 <= local173 + 1; local1301++) {
												if ((local168 != local1288 || local1301 != local173) && local1288 >= 0 && local1288 < 104 && local1301 >= 0 && local1301 < 104) {
													local1353 = SceneGraph.tileOverlays[local152][local1288][local1301] & 0xFF;
													if (local1353 != 0) {
														@Pc(1366) FloType local1366 = FloTypeList.method4395(local1353 - 1);
														if (local1366.texture != -1 && Rasteriser.textureProvider.method3237(local1366.texture) == 4) {
															Static62.anIntArrayArray11[local168][local173] = local1366.anInt5889 + (local1366.anInt5898 << 24);
															break label737;
														}
													}
												}
											}
										}
									}
								}
								local1288 = local1248.texture;
								if (local1288 >= 0 && !Rasteriser.textureProvider.method3236(local1288)) {
									local1288 = -1;
								}
								@Pc(1458) int local1458;
								@Pc(1429) int local1429;
								if (local1288 >= 0) {
									local1301 = -1;
									local1353 = Rasteriser.palette[Static230.method3949(Rasteriser.textureProvider.getAverageColor(local1288), 96)];
								} else if (local1248.anInt5899 == -1) {
									local1301 = -2;
									local1353 = 0;
								} else {
									local1301 = local1248.anInt5899;
									local1429 = x + (local1301 & 0x7F);
									if (local1429 < 0) {
										local1429 = 0;
									} else if (local1429 > 127) {
										local1429 = 127;
									}
									local1458 = (local1301 & 0x380) + ((local1301 + level & 0xFC00) + local1429);
									local1353 = Rasteriser.palette[Static230.method3949(local1458, 96)];
								}
								if (local1248.anInt5894 >= 0) {
									local1429 = local1248.anInt5894;
									local1458 = x + (local1429 & 0x7F);
									if (local1458 < 0) {
										local1458 = 0;
									} else if (local1458 > 127) {
										local1458 = 127;
									}
									@Pc(1529) int local1529 = (local1429 & 0x380) + ((local1429 + level & 0xFC00) + local1458);
									local1353 = Rasteriser.palette[Static230.method3949(local1529, 96)];
								}
								Static176.method3305(local152, local168, local173, local322, local1242, local1288, local200, local202, local209, local349, Static87.method1814(local267, local234), Static87.method1814(local273, local234), Static87.method1814(local326, local234), Static87.method1814(local332, local234), Static230.method3949(local1301, local267), Static230.method3949(local1301, local273), Static230.method3949(local1301, local326), Static230.method3949(local1301, local332), local254, local1353);
								if (GlRenderer.enabled && local152 > 0) {
									Static242.method4197(local322, local1242, local1301 == -2 || !local1248.aBoolean311, local234 == -1 || !FluTypeList.get(local178 - 1).aBoolean198, local168, local173, local200 - SceneGraph.tileHeights[0][local168][local173], local202 - SceneGraph.tileHeights[0][local168 + 1][local173], local209 - SceneGraph.tileHeights[0][local168 + 1][local173 + 1], -SceneGraph.tileHeights[0][local168][local173 + 1] + local349);
								}
							}
						}
					}
				}
			}
			if (GlRenderer.enabled) {
				@Pc(1888) float[][] local1888 = new float[105][105];
				@Pc(1892) int[][] local1892 = SceneGraph.tileHeights[local152];
				@Pc(1896) float[][] local1896 = new float[105][105];
				@Pc(1900) float[][] local1900 = new float[105][105];
				local200 = 1;
				while (true) {
					if (local200 > 103) {
						@Pc(2025) GlTile[] local2025;
						if (underwater) {
							local2025 = Static193.method3501(SceneGraph.tileFlags, SceneGraph.tileShapes[local152], SceneGraph.tileUnderlays[local152], local146, local1896, Static62.anIntArrayArray11, SceneGraph.tileOverlays[local152], SceneGraph.tileAngles[local152], local1888, local152, local1900, local142, SceneGraph.tileHeights[local152], SceneGraph.surfaceTileHeights[0]);
							Static110.method2280(local152, local2025);
							break;
						}
						local2025 = Static193.method3501(SceneGraph.tileFlags, SceneGraph.tileShapes[local152], SceneGraph.tileUnderlays[local152], local146, local1896, null, SceneGraph.tileOverlays[local152], SceneGraph.tileAngles[local152], local1888, local152, local1900, local142, SceneGraph.tileHeights[local152], null);
						@Pc(2049) GlTile[] local2049 = Static1.method2(local1896, local1888, SceneGraph.tileHeights[local152], local152, local1900, SceneGraph.tileAngles[local152], local146, SceneGraph.tileShapes[local152], SceneGraph.tileUnderlays[local152], SceneGraph.tileOverlays[local152], SceneGraph.tileFlags);
						@Pc(2057) GlTile[] local2057 = new GlTile[local2025.length + local2049.length];
						for (local349 = 0; local349 < local2025.length; local349++) {
							local2057[local349] = local2025[local349];
						}
						for (local349 = 0; local349 < local2049.length; local349++) {
							local2057[local2025.length + local349] = local2049[local349];
						}
						Static110.method2280(local152, local2057);
						Static221.method3393(local1900, SceneGraph.tileUnderlays[local152], SceneGraph.tileAngles[local152], LightingManager.lights, local152, LightingManager.lightCount, local1896, SceneGraph.tileShapes[local152], SceneGraph.tileOverlays[local152], SceneGraph.tileHeights[local152], local1888);
						break;
					}
					for (local202 = 1; local202 <= 103; local202++) {
						local349 = local1892[local202][local200 + 1] - local1892[local202][local200 - 1];
						local209 = local1892[local202 + 1][local200] - local1892[local202 - 1][local200];
						@Pc(1962) float local1962 = (float) Math.sqrt((double) (local209 * local209 + local349 * local349 + 65536));
						local1888[local202][local200] = (float) local209 / local1962;
						local1896[local202][local200] = -256.0F / local1962;
						local1900[local202][local200] = (float) local349 / local1962;
					}
					local200++;
				}
			}
			SceneGraph.tileUnderlays[local152] = null;
			SceneGraph.tileOverlays[local152] = null;
			SceneGraph.tileShapes[local152] = null;
			SceneGraph.tileAngles[local152] = null;
			Static118.aByteArrayArrayArray9[local152] = null;
		}
		Static220.method3801();
		if (underwater) {
			return;
		}
		@Pc(2204) int local2204;
		for (local152 = 0; local152 < 104; local152++) {
			for (local2204 = 0; local2204 < 104; local2204++) {
				if ((SceneGraph.tileFlags[1][local152][local2204] & 0x2) == 2) {
					Static224.method3884(local152, local2204);
				}
			}
		}
		for (local152 = 0; local152 < 4; local152++) {
			for (local2204 = 0; local2204 <= 104; local2204++) {
				for (local168 = 0; local168 <= 104; local168++) {
					if ((Static60.anIntArrayArrayArray6[local152][local168][local2204] & 0x1) != 0) {
						local200 = local152;
						for (local173 = local2204; local173 > 0 && (Static60.anIntArrayArrayArray6[local152][local168][local173 - 1] & 0x1) != 0; local173--) {
						}
						local194 = local152;
						for (local178 = local2204; local178 < 104 && (Static60.anIntArrayArrayArray6[local152][local168][local178 + 1] & 0x1) != 0; local178++) {
						}
						label454: while (local194 > 0) {
							for (local202 = local173; local202 <= local178; local202++) {
								if ((Static60.anIntArrayArrayArray6[local194 - 1][local168][local202] & 0x1) == 0) {
									break label454;
								}
							}
							local194--;
						}
						label443: while (local200 < 3) {
							for (local202 = local173; local202 <= local178; local202++) {
								if ((Static60.anIntArrayArrayArray6[local200 + 1][local168][local202] & 0x1) == 0) {
									break label443;
								}
							}
							local200++;
						}
						local202 = (local200 + 1 - local194) * (-local173 + (local178 - -1));
						if (local202 >= 8) {
							local349 = SceneGraph.tileHeights[local200][local168][local173] - 240;
							local234 = SceneGraph.tileHeights[local194][local168][local173];
							Static278.method4647(1, local168 * 128, local168 * 128, local173 * 128, local178 * 128 + 128, local349, local234);
							for (local254 = local194; local254 <= local200; local254++) {
								for (local267 = local173; local267 <= local178; local267++) {
									Static60.anIntArrayArrayArray6[local254][local168][local267] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static60.anIntArrayArrayArray6[local152][local168][local2204] & 0x2) != 0) {
						for (local173 = local168; local173 > 0 && (Static60.anIntArrayArrayArray6[local152][local173 - 1][local2204] & 0x2) != 0; local173--) {
						}
						local200 = local152;
						local194 = local152;
						for (local178 = local168; local178 < 104 && (Static60.anIntArrayArrayArray6[local152][local178 + 1][local2204] & 0x2) != 0; local178++) {
						}
						label508: while (local194 > 0) {
							for (local202 = local173; local202 <= local178; local202++) {
								if ((Static60.anIntArrayArrayArray6[local194 - 1][local202][local2204] & 0x2) == 0) {
									break label508;
								}
							}
							local194--;
						}
						label497: while (local200 < 3) {
							for (local202 = local173; local202 <= local178; local202++) {
								if ((Static60.anIntArrayArrayArray6[local200 + 1][local202][local2204] & 0x2) == 0) {
									break label497;
								}
							}
							local200++;
						}
						local202 = (local178 + 1 - local173) * (-local194 + local200 - -1);
						if (local202 >= 8) {
							local349 = SceneGraph.tileHeights[local200][local173][local2204] - 240;
							local234 = SceneGraph.tileHeights[local194][local173][local2204];
							Static278.method4647(2, local173 * 128, local178 * 128 + 128, local2204 * 128, local2204 * 128, local349, local234);
							for (local254 = local194; local254 <= local200; local254++) {
								for (local267 = local173; local267 <= local178; local267++) {
									Static60.anIntArrayArrayArray6[local254][local267][local2204] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static60.anIntArrayArrayArray6[local152][local168][local2204] & 0x4) != 0) {
						local173 = local168;
						local178 = local168;
						for (local194 = local2204; local194 > 0 && (Static60.anIntArrayArrayArray6[local152][local168][local194 - 1] & 0x4) != 0; local194--) {
						}
						for (local200 = local2204; local200 < 104 && (Static60.anIntArrayArrayArray6[local152][local168][local200 + 1] & 0x4) != 0; local200++) {
						}
						label562: while (local173 > 0) {
							for (local202 = local194; local202 <= local200; local202++) {
								if ((Static60.anIntArrayArrayArray6[local152][local173 - 1][local202] & 0x4) == 0) {
									break label562;
								}
							}
							local173--;
						}
						label551: while (local178 < 104) {
							for (local202 = local194; local202 <= local200; local202++) {
								if ((Static60.anIntArrayArrayArray6[local152][local178 + 1][local202] & 0x4) == 0) {
									break label551;
								}
							}
							local178++;
						}
						if ((local178 + 1 - local173) * (local200 - (local194 - 1)) >= 4) {
							local202 = SceneGraph.tileHeights[local152][local173][local194];
							Static278.method4647(4, local173 * 128, local178 * 128 + 128, local194 * 128, local200 * 128 + 128, local202, local202);
							for (local209 = local173; local209 <= local178; local209++) {
								for (local349 = local194; local349 <= local200; local349++) {
									Static60.anIntArrayArrayArray6[local152][local209][local349] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

}
