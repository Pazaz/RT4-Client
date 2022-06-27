package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!ka", name = "t", descriptor = "[I")
	public static final int[] anIntArray294 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
	@OriginalMember(owner = "client!uj", name = "A", descriptor = "[I")
	public static final int[] anIntArray489 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
	@OriginalMember(owner = "client!gm", name = "gb", descriptor = "[I")
	public static final int[] anIntArray211 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
	@OriginalMember(owner = "client!kd", name = "sb", descriptor = "[I")
	public static final int[] anIntArray307 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
	@OriginalMember(owner = "client!hb", name = "t", descriptor = "[I")
	public static final int[] anIntArray215 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
	@OriginalMember(owner = "client!km", name = "Rc", descriptor = "[I")
	public static final int[] anIntArray324 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
	@OriginalMember(owner = "client!bl", name = "X", descriptor = "I")
	public static int anInt730 = -1;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIII)V")
	public static void method4244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (TextureOp29.anInt4164 <= arg1 && TextureOp29.anInt5063 >= arg3 && TextureOp29.anInt5773 <= arg2 && arg4 <= TextureOp29.anInt2869) {
			if (arg5 == 1) {
				Static134.method2622(arg0, arg3, arg2, arg4, arg1);
			} else {
				method3334(arg3, arg2, arg0, arg4, arg5, arg1);
			}
		} else if (arg5 == 1) {
			Static173.method3246(arg0, arg1, arg4, arg3, arg2);
		} else {
			Static10.method352(arg4, arg5, arg3, arg1, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!bj;Z)V")
	public static void method4245(@OriginalArg(0) Tile arg0, @OriginalArg(1) boolean arg1) {
		Static7.aClass69_32.addTail(arg0);
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
												local8 = (Tile) Static7.aClass69_32.removeHead();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean46);
											local18 = local8.anInt669;
											local21 = local8.anInt666;
											local24 = local8.anInt672;
											local27 = local8.anInt668;
											local31 = SceneGraph.tiles[local24];
											@Pc(33) float local33 = 0.0F;
											if (GlRenderer.enabled) {
												if (SceneGraph.underwaterTileHeights == SceneGraph.tileHeights) {
													var9 = SceneGraph.anIntArrayArray11[local18][local21];
													var10 = var9 & 0xFFFFFF;
													if (var10 != Static152.anInt3604) {
														Static152.anInt3604 = var10;
														WaterMaterialRenderer.method619(var10);
														FogManager.method3066(WaterMaterialRenderer.method2422());
													}
													local65 = var9 >>> 24 << 3;
													if (local65 != anInt730) {
														anInt730 = local65;
														Static147.method2761(local65);
													}
													local115 = SceneGraph.surfaceTileHeights[0][local18][local21] + SceneGraph.surfaceTileHeights[0][local18 + 1][local21] + SceneGraph.surfaceTileHeights[0][local18][local21 + 1] + SceneGraph.surfaceTileHeights[0][local18 + 1][local21 + 1] >> 2;
													MaterialManager.setMaterial(-local115, 3);
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
													local153 = SceneGraph.tiles[local24 - 1][local18][local21];
													if (local153 != null && local153.aBoolean46) {
														continue;
													}
												}
												if (local18 <= Static123.anInt4069 && local18 > LightingManager.anInt987) {
													local153 = local31[local18 - 1][local21];
													if (local153 != null && local153.aBoolean46 && (local153.aBoolean45 || (local8.allInteriorFlags & 0x1) == 0)) {
														continue;
													}
												}
												if (local18 >= Static123.anInt4069 && local18 < LightingManager.anInt15 - 1) {
													local153 = local31[local18 + 1][local21];
													if (local153 != null && local153.aBoolean46 && (local153.aBoolean45 || (local8.allInteriorFlags & 0x4) == 0)) {
														continue;
													}
												}
												if (local21 <= Static193.anInt4539 && local21 > LightingManager.anInt4698) {
													local153 = local31[local18][local21 - 1];
													if (local153 != null && local153.aBoolean46 && (local153.aBoolean45 || (local8.allInteriorFlags & 0x8) == 0)) {
														continue;
													}
												}
												if (local21 >= Static193.anInt4539 && local21 < LightingManager.anInt4866 - 1) {
													local153 = local31[local18][local21 + 1];
													if (local153 != null && local153.aBoolean46 && (local153.aBoolean45 || (local8.allInteriorFlags & 0x2) == 0)) {
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
												if (local153.plainTile == null) {
													if (local153.shapedTile != null) {
														if (Static9.method187(0, local18, local21)) {
															Static147.method2762(local153.shapedTile, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local18, local21, true);
														} else {
															Static147.method2762(local153.shapedTile, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local18, local21, false);
														}
													}
												} else if (Static9.method187(0, local18, local21)) {
													method2610(local153.plainTile, 0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local18, local21, true);
												} else {
													method2610(local153.plainTile, 0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local18, local21, false);
												}
												var22 = local153.wall;
												if (var22 != null) {
													if (GlRenderer.enabled) {
														if ((var22.anInt3049 & local8.anInt670) == 0) {
															LightingManager.method2393(Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local24, local18, local21);
														} else {
															LightingManager.method2388(var22.anInt3049, Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local27, local18, local21);
														}
													}
													var22.primary.render(0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, var22.xFine - Static123.anInt3555, var22.anInt3051 - Static123.anInt3947, var22.zFine - Static217.anInt4903, var22.key, local24, null);
												}
												for (local65 = 0; local65 < local153.sceneryLen; local65++) {
													var25 = local153.scenery[local65];
													if (var25 != null) {
														if (GlRenderer.enabled) {
															LightingManager.method2393(Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local24, local18, local21);
														}
														var25.entity.render(var25.anInt1714, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, var25.anInt1699 - Static123.anInt3555, var25.anInt1706 - Static123.anInt3947, var25.anInt1703 - Static217.anInt4903, var25.key, local24, null);
													}
												}
												if (GlRenderer.enabled) {
													GlRenderer.method4159(local33);
												}
											}
											var24 = false;
											if (local8.plainTile == null) {
												if (local8.shapedTile != null) {
													if (Static9.method187(local27, local18, local21)) {
														Static147.method2762(local8.shapedTile, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local18, local21, true);
													} else {
														var24 = true;
														Static147.method2762(local8.shapedTile, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local18, local21, false);
													}
												}
											} else if (Static9.method187(local27, local18, local21)) {
												method2610(local8.plainTile, local27, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local18, local21, true);
											} else {
												var24 = true;
												if (local8.plainTile.anInt4865 != 12345678 || MiniMenu.aBoolean187 && local24 <= MiniMenu.anInt3902) {
													method2610(local8.plainTile, local27, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local18, local21, false);
												}
											}
											if (var24) {
												@Pc(549) GroundDecor local549 = local8.groundDecor;
												if (local549 != null && (local549.key & 0x80000000L) != 0L) {
													if (GlRenderer.enabled && local549.aBoolean49) {
														GlRenderer.method4159(local33 + 50.0F - 1.5F);
													}
													if (GlRenderer.enabled) {
														LightingManager.method2393(Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local24, local18, local21);
													}
													local549.entity.render(0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local549.xFine - Static123.anInt3555, local549.anInt733 - Static123.anInt3947, local549.zFine - Static217.anInt4903, local549.key, local24, null);
													if (GlRenderer.enabled && local549.aBoolean49) {
														GlRenderer.method4159(local33);
													}
												}
											}
											var10 = 0;
											local65 = 0;
											@Pc(616) Wall local616 = local8.wall;
											@Pc(619) WallDecor local619 = local8.wallDecor;
											if (local616 != null || local619 != null) {
												if (Static123.anInt4069 == local18) {
													var10++;
												} else if (Static123.anInt4069 < local18) {
													var10 += 2;
												}
												if (Static193.anInt4539 == local21) {
													var10 += 3;
												} else if (Static193.anInt4539 > local21) {
													var10 += 6;
												}
												local65 = anIntArray324[var10];
												local8.anInt670 = Static191.anIntArray386[var10];
											}
											if (local616 != null) {
												if ((local616.anInt3049 & anIntArray215[var10]) == 0) {
													local8.anInt663 = 0;
												} else if (local616.anInt3049 == 16) {
													local8.anInt663 = 3;
													local8.anInt665 = anIntArray294[var10];
													local8.anInt667 = 3 - local8.anInt665;
												} else if (local616.anInt3049 == 32) {
													local8.anInt663 = 6;
													local8.anInt665 = anIntArray489[var10];
													local8.anInt667 = 6 - local8.anInt665;
												} else if (local616.anInt3049 == 64) {
													local8.anInt663 = 12;
													local8.anInt665 = anIntArray211[var10];
													local8.anInt667 = 12 - local8.anInt665;
												} else {
													local8.anInt663 = 9;
													local8.anInt665 = anIntArray307[var10];
													local8.anInt667 = 9 - local8.anInt665;
												}
												if ((local616.anInt3049 & local65) != 0 && !method3850(local27, local18, local21, local616.anInt3049)) {
													if (GlRenderer.enabled) {
														LightingManager.method2393(Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local24, local18, local21);
													}
													local616.primary.render(0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local616.xFine - Static123.anInt3555, local616.anInt3051 - Static123.anInt3947, local616.zFine - Static217.anInt4903, local616.key, local24, null);
												}
												if ((local616.anInt3052 & local65) != 0 && !method3850(local27, local18, local21, local616.anInt3052)) {
													if (GlRenderer.enabled) {
														LightingManager.method2393(Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local24, local18, local21);
													}
													local616.secondary.render(0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local616.xFine - Static123.anInt3555, local616.anInt3051 - Static123.anInt3947, local616.zFine - Static217.anInt4903, local616.key, local24, null);
												}
											}
											if (local619 != null && !method4611(local27, local18, local21, local619.primary.getMinY())) {
												if (GlRenderer.enabled) {
													GlRenderer.method4159(local33 - 0.5F);
												}
												if ((local619.anInt1395 & local65) != 0) {
													if (GlRenderer.enabled) {
														LightingManager.method2393(Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local24, local18, local21);
													}
													local619.primary.render(0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local619.anInt1390 + local619.anInt1394 - Static123.anInt3555, local619.anInt1391 - Static123.anInt3947, local619.anInt1393 + local619.anInt1392 - Static217.anInt4903, local619.key, local24, null);
												} else if (local619.anInt1395 == 256) {
													local894 = local619.anInt1390 - Static123.anInt3555;
													local899 = local619.anInt1391 - Static123.anInt3947;
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
															LightingManager.method2393(Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local24, local18, local21);
														}
														local619.primary.render(0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local894 + local619.anInt1394, local899, local904 + local619.anInt1392, local619.key, local24, null);
													} else if (local619.secondary != null) {
														if (GlRenderer.enabled) {
															LightingManager.method2393(Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local24, local18, local21);
														}
														local619.secondary.render(0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local894, local899, local904, local619.key, local24, null);
													}
												}
												if (GlRenderer.enabled) {
													GlRenderer.method4159(local33);
												}
											}
											if (var24) {
												@Pc(1001) GroundDecor local1001 = local8.groundDecor;
												if (local1001 != null && (local1001.key & 0x80000000L) == 0L) {
													if (GlRenderer.enabled && local1001.aBoolean49) {
														GlRenderer.method4159(local33 + 50.0F - 1.5F);
													}
													if (GlRenderer.enabled) {
														LightingManager.method2393(Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local24, local18, local21);
													}
													local1001.entity.render(0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local1001.xFine - Static123.anInt3555, local1001.anInt733 - Static123.anInt3947, local1001.zFine - Static217.anInt4903, local1001.key, local24, null);
													if (GlRenderer.enabled && local1001.aBoolean49) {
														GlRenderer.method4159(local33);
													}
												}
												@Pc(1064) ObjStackEntity local1064 = local8.aClass79_1;
												if (local1064 != null && local1064.anInt3063 == 0) {
													if (GlRenderer.enabled) {
														LightingManager.method2393(Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local24, local18, local21);
													}
													if (local1064.aClass8_7 != null) {
														local1064.aClass8_7.render(0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local1064.anInt3064 - Static123.anInt3555, local1064.anInt3057 - Static123.anInt3947, local1064.anInt3061 - Static217.anInt4903, local1064.aLong108, local24, null);
													}
													if (local1064.aClass8_8 != null) {
														local1064.aClass8_8.render(0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local1064.anInt3064 - Static123.anInt3555, local1064.anInt3057 - Static123.anInt3947, local1064.anInt3061 - Static217.anInt4903, local1064.aLong108, local24, null);
													}
													if (local1064.aClass8_9 != null) {
														local1064.aClass8_9.render(0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local1064.anInt3064 - Static123.anInt3555, local1064.anInt3057 - Static123.anInt3947, local1064.anInt3061 - Static217.anInt4903, local1064.aLong108, local24, null);
													}
												}
											}
											local894 = local8.allInteriorFlags;
											if (local894 != 0) {
												if (local18 < Static123.anInt4069 && (local894 & 0x4) != 0) {
													var32 = local31[local18 + 1][local21];
													if (var32 != null && var32.aBoolean46) {
														Static7.aClass69_32.addTail(var32);
													}
												}
												if (local21 < Static193.anInt4539 && (local894 & 0x2) != 0) {
													var32 = local31[local18][local21 + 1];
													if (var32 != null && var32.aBoolean46) {
														Static7.aClass69_32.addTail(var32);
													}
												}
												if (local18 > Static123.anInt4069 && (local894 & 0x1) != 0) {
													var32 = local31[local18 - 1][local21];
													if (var32 != null && var32.aBoolean46) {
														Static7.aClass69_32.addTail(var32);
													}
												}
												if (local21 > Static193.anInt4539 && (local894 & 0x8) != 0) {
													var32 = local31[local18][local21 - 1];
													if (var32 != null && var32.aBoolean46) {
														Static7.aClass69_32.addTail(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt663 != 0) {
											var24 = true;
											for (var10 = 0; var10 < local8.sceneryLen; var10++) {
												if (local8.scenery[var10].anInt1707 != Static156.anInt437 && (local8.interiorFlags[var10] & local8.anInt663) == local8.anInt665) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												var22 = local8.wall;
												if (!method3850(local27, local18, local21, var22.anInt3049)) {
													if (GlRenderer.enabled) {
														label882: {
															if ((var22.key & 0xFC000L) == 16384L) {
																local65 = var22.xFine - Static123.anInt3555;
																local115 = var22.zFine - Static217.anInt4903;
																local1332 = (int) (var22.key >> 20 & 0x3L);
																if (local1332 == 0) {
																	local65 -= 64;
																	local115 += 64;
																	if (local115 < local65 && local18 > 0 && local21 < SceneGraph.length - 1) {
																		LightingManager.method2393(Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local24, local18 - 1, local21 + 1);
																		break label882;
																	}
																} else if (local1332 == 1) {
																	local65 += 64;
																	local115 += 64;
																	if (local115 < -local65 && local18 < SceneGraph.width - 1 && local21 < SceneGraph.length - 1) {
																		LightingManager.method2393(Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local24, local18 + 1, local21 + 1);
																		break label882;
																	}
																} else if (local1332 == 2) {
																	local65 += 64;
																	local115 -= 64;
																	if (local115 > local65 && local18 < SceneGraph.width - 1 && local21 > 0) {
																		LightingManager.method2393(Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local24, local18 + 1, local21 - 1);
																		break label882;
																	}
																} else if (local1332 == 3) {
																	local65 -= 64;
																	local115 -= 64;
																	if (local115 > -local65 && local18 > 0 && local21 > 0) {
																		LightingManager.method2393(Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local24, local18 - 1, local21 - 1);
																		break label882;
																	}
																}
															}
															LightingManager.method2393(Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local24, local18, local21);
														}
													}
													var22.primary.render(0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, var22.xFine - Static123.anInt3555, var22.anInt3051 - Static123.anInt3947, var22.zFine - Static217.anInt4903, var22.key, local24, null);
												}
												local8.anInt663 = 0;
											}
										}
										if (!local8.aBoolean47) {
											break;
										}
										try {
											var9 = local8.sceneryLen;
											local8.aBoolean47 = false;
											var10 = 0;
											label767: for (local65 = 0; local65 < var9; local65++) {
												var25 = local8.scenery[local65];
												if (var25.anInt1707 != Static156.anInt437) {
													for (local1332 = var25.xMin; local1332 <= var25.xMax; local1332++) {
														for (local894 = var25.zMin; local894 <= var25.zMax; local894++) {
															var32 = local31[local1332][local894];
															if (var32.aBoolean45) {
																local8.aBoolean47 = true;
																continue label767;
															}
															if (var32.anInt663 != 0) {
																local904 = 0;
																if (local1332 > var25.xMin) {
																	local904++;
																}
																if (local1332 < var25.xMax) {
																	local904 += 4;
																}
																if (local894 > var25.zMin) {
																	local904 += 8;
																}
																if (local894 < var25.zMax) {
																	local904 += 2;
																}
																if ((local904 & var32.anInt663) == local8.anInt667) {
																	local8.aBoolean47 = true;
																	continue label767;
																}
															}
														}
													}
													SceneGraph.aClass31Array2[var10++] = var25;
													local1332 = Static123.anInt4069 - var25.xMin;
													local894 = var25.xMax - Static123.anInt4069;
													if (local894 > local1332) {
														local1332 = local894;
													}
													local899 = Static193.anInt4539 - var25.zMin;
													local904 = var25.zMax - Static193.anInt4539;
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
													@Pc(1628) Scenery local1628 = SceneGraph.aClass31Array2[local1332];
													if (local1628.anInt1707 != Static156.anInt437) {
														if (local1628.anInt1705 > local65) {
															local65 = local1628.anInt1705;
															local115 = local1332;
														} else if (local1628.anInt1705 == local65) {
															local899 = local1628.anInt1699 - Static123.anInt3555;
															local904 = local1628.anInt1703 - Static217.anInt4903;
															var17 = SceneGraph.aClass31Array2[local115].anInt1699 - Static123.anInt3555;
															var18 = SceneGraph.aClass31Array2[local115].anInt1703 - Static217.anInt4903;
															if (local899 * local899 + local904 * local904 > var17 * var17 + var18 * var18) {
																local115 = local1332;
															}
														}
													}
												}
												if (local115 == -1) {
													break;
												}
												@Pc(1697) Scenery local1697 = SceneGraph.aClass31Array2[local115];
												local1697.anInt1707 = Static156.anInt437;
												if (!Static73.method1599(local27, local1697.xMin, local1697.xMax, local1697.zMin, local1697.zMax, local1697.entity.getMinY())) {
													if (GlRenderer.enabled) {
														if ((local1697.key & 0xFC000L) == 147456L) {
															LightingManager.method2393(Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local24, local18, local21);
															local894 = local1697.anInt1699 - Static123.anInt3555;
															local899 = local1697.anInt1703 - Static217.anInt4903;
															local904 = (int) (local1697.key >> 20 & 0x3L);
															if (local904 == 1 || local904 == 3) {
																if (local899 > -local894) {
																	LightingManager.method2397(local24, local18, local21 - 1, local18 - 1, local21);
																} else {
																	LightingManager.method2397(local24, local18, local21 + 1, local18 + 1, local21);
																}
															} else if (local899 > local894) {
																LightingManager.method2397(local24, local18, local21 - 1, local18 + 1, local21);
															} else {
																LightingManager.method2397(local24, local18, local21 + 1, local18 - 1, local21);
															}
														} else {
															LightingManager.method2391(Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local24, local1697.xMin, local1697.zMin, local1697.xMax, local1697.zMax);
														}
													}
													local1697.entity.render(local1697.anInt1714, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local1697.anInt1699 - Static123.anInt3555, local1697.anInt1706 - Static123.anInt3947, local1697.anInt1703 - Static217.anInt4903, local1697.key, local24, null);
												}
												for (local894 = local1697.xMin; local894 <= local1697.xMax; local894++) {
													for (local899 = local1697.zMin; local899 <= local1697.zMax; local899++) {
														@Pc(1863) Tile local1863 = local31[local894][local899];
														if (local1863.anInt663 != 0) {
															Static7.aClass69_32.addTail(local1863);
														} else if ((local894 != local18 || local899 != local21) && local1863.aBoolean46) {
															Static7.aClass69_32.addTail(local1863);
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
							if (local18 > Static123.anInt4069 || local18 <= LightingManager.anInt987) {
								break;
							}
							local153 = local31[local18 - 1][local21];
						} while (local153 != null && local153.aBoolean46);
						if (local18 < Static123.anInt4069 || local18 >= LightingManager.anInt15 - 1) {
							break;
						}
						local153 = local31[local18 + 1][local21];
					} while (local153 != null && local153.aBoolean46);
					if (local21 > Static193.anInt4539 || local21 <= LightingManager.anInt4698) {
						break;
					}
					local153 = local31[local18][local21 - 1];
				} while (local153 != null && local153.aBoolean46);
				if (local21 < Static193.anInt4539 || local21 >= LightingManager.anInt4866 - 1) {
					break;
				}
				local153 = local31[local18][local21 + 1];
			} while (local153 != null && local153.aBoolean46);
			local8.aBoolean46 = false;
			Static156.anInt1142--;
			@Pc(1999) ObjStackEntity local1999 = local8.aClass79_1;
			if (local1999 != null && local1999.anInt3063 != 0) {
				if (GlRenderer.enabled) {
					LightingManager.method2393(Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local24, local18, local21);
				}
				if (local1999.aClass8_7 != null) {
					local1999.aClass8_7.render(0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local1999.anInt3064 - Static123.anInt3555, local1999.anInt3057 - Static123.anInt3947 - local1999.anInt3063, local1999.anInt3061 - Static217.anInt4903, local1999.aLong108, local24, null);
				}
				if (local1999.aClass8_8 != null) {
					local1999.aClass8_8.render(0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local1999.anInt3064 - Static123.anInt3555, local1999.anInt3057 - Static123.anInt3947 - local1999.anInt3063, local1999.anInt3061 - Static217.anInt4903, local1999.aLong108, local24, null);
				}
				if (local1999.aClass8_9 != null) {
					local1999.aClass8_9.render(0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local1999.anInt3064 - Static123.anInt3555, local1999.anInt3057 - Static123.anInt3947 - local1999.anInt3063, local1999.anInt3061 - Static217.anInt4903, local1999.aLong108, local24, null);
				}
			}
			if (local8.anInt670 != 0) {
				@Pc(2109) WallDecor local2109 = local8.wallDecor;
				if (local2109 != null && !method4611(local27, local18, local21, local2109.primary.getMinY())) {
					if ((local2109.anInt1395 & local8.anInt670) != 0) {
						if (GlRenderer.enabled) {
							LightingManager.method2393(Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local24, local18, local21);
						}
						local2109.primary.render(0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local2109.anInt1390 + local2109.anInt1394 - Static123.anInt3555, local2109.anInt1391 - Static123.anInt3947, local2109.anInt1393 + local2109.anInt1392 - Static217.anInt4903, local2109.key, local24, null);
					} else if (local2109.anInt1395 == 256) {
						local65 = local2109.anInt1390 - Static123.anInt3555;
						local115 = local2109.anInt1391 - Static123.anInt3947;
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
								LightingManager.method2393(Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local24, local18, local21);
							}
							local2109.primary.render(0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local65 + local2109.anInt1394, local115, local1332 + local2109.anInt1392, local2109.key, local24, null);
						} else if (local2109.secondary != null) {
							if (GlRenderer.enabled) {
								LightingManager.method2393(Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local24, local18, local21);
							}
							local2109.secondary.render(0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local65, local115, local1332, local2109.key, local24, null);
						}
					}
				}
				@Pc(2275) Wall local2275 = local8.wall;
				if (local2275 != null) {
					if ((local2275.anInt3052 & local8.anInt670) != 0 && !method3850(local27, local18, local21, local2275.anInt3052)) {
						if (GlRenderer.enabled) {
							LightingManager.method2388(local2275.anInt3052, Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local27, local18, local21);
						}
						local2275.secondary.render(0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local2275.xFine - Static123.anInt3555, local2275.anInt3051 - Static123.anInt3947, local2275.zFine - Static217.anInt4903, local2275.key, local24, null);
					}
					if ((local2275.anInt3049 & local8.anInt670) != 0 && !method3850(local27, local18, local21, local2275.anInt3049)) {
						if (GlRenderer.enabled) {
							LightingManager.method2388(local2275.anInt3049, Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local27, local18, local21);
						}
						local2275.primary.render(0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local2275.xFine - Static123.anInt3555, local2275.anInt3051 - Static123.anInt3947, local2275.zFine - Static217.anInt4903, local2275.key, local24, null);
					}
				}
			}
			@Pc(2388) Tile local2388;
			if (local24 < SceneGraph.levels - 1) {
				local2388 = SceneGraph.tiles[local24 + 1][local18][local21];
				if (local2388 != null && local2388.aBoolean46) {
					Static7.aClass69_32.addTail(local2388);
				}
			}
			if (local18 < Static123.anInt4069) {
				local2388 = local31[local18 + 1][local21];
				if (local2388 != null && local2388.aBoolean46) {
					Static7.aClass69_32.addTail(local2388);
				}
			}
			if (local21 < Static193.anInt4539) {
				local2388 = local31[local18][local21 + 1];
				if (local2388 != null && local2388.aBoolean46) {
					Static7.aClass69_32.addTail(local2388);
				}
			}
			if (local18 > Static123.anInt4069) {
				local2388 = local31[local18 - 1][local21];
				if (local2388 != null && local2388.aBoolean46) {
					Static7.aClass69_32.addTail(local2388);
				}
			}
			if (local21 > Static193.anInt4539) {
				local2388 = local31[local18][local21 - 1];
				if (local2388 != null && local2388.aBoolean46) {
					Static7.aClass69_32.addTail(local2388);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIIIIII)V")
	public static void method4246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Component local8 = InterfaceList.method1418(arg0, arg1);
		if (local8 != null && local8.onUse != null) {
			@Pc(19) HookRequest local19 = new HookRequest();
			local19.source = local8;
			local19.arguments = local8.onUse;
			ScriptRunner.run(local19);
		}
		MiniMenu.anInt506 = arg1;
		Static121.anInt3039 = arg3;
		MiniMenu.anInt2512 = arg0;
		MiniMenu.anInt4999 = arg2;
		Static241.aBoolean302 = true;
		MiniMenu.anInt5393 = arg4;
		MiniMenu.anInt1092 = arg5;
		InterfaceList.redraw(local8);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)I")
	public static int method4247(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIII)Z")
	public static boolean method4611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static9.method187(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return SceneGraph.method4394(local10 + 1, SceneGraph.tileHeights[arg0][arg1][arg2] + arg3, local14 + 1) && SceneGraph.method4394(local10 + 128 - 1, SceneGraph.tileHeights[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && SceneGraph.method4394(local10 + 128 - 1, SceneGraph.tileHeights[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && SceneGraph.method4394(local10 + 1, SceneGraph.tileHeights[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIII)Z")
    public static boolean method3850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        if (!Static9.method187(arg0, arg1, arg2)) {
            return false;
        }
        @Pc(10) int local10 = arg1 << 7;
        @Pc(14) int local14 = arg2 << 7;
        @Pc(24) int local24 = SceneGraph.tileHeights[arg0][arg1][arg2] - 1;
        @Pc(28) int local28 = local24 - 120;
        @Pc(32) int local32 = local24 - 230;
        @Pc(36) int local36 = local24 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (local10 > Static123.anInt3555) {
                    if (!SceneGraph.method4394(local10, local24, local14)) {
                        return false;
                    }
                    if (!SceneGraph.method4394(local10, local24, local14 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!SceneGraph.method4394(local10, local28, local14)) {
                        return false;
                    }
                    if (!SceneGraph.method4394(local10, local28, local14 + 128)) {
                        return false;
                    }
                }
                if (!SceneGraph.method4394(local10, local32, local14)) {
                    return false;
                }
                if (!SceneGraph.method4394(local10, local32, local14 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (local14 < Static217.anInt4903) {
                    if (!SceneGraph.method4394(local10, local24, local14 + 128)) {
                        return false;
                    }
                    if (!SceneGraph.method4394(local10 + 128, local24, local14 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!SceneGraph.method4394(local10, local28, local14 + 128)) {
                        return false;
                    }
                    if (!SceneGraph.method4394(local10 + 128, local28, local14 + 128)) {
                        return false;
                    }
                }
                if (!SceneGraph.method4394(local10, local32, local14 + 128)) {
                    return false;
                }
                if (!SceneGraph.method4394(local10 + 128, local32, local14 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (local10 < Static123.anInt3555) {
                    if (!SceneGraph.method4394(local10 + 128, local24, local14)) {
                        return false;
                    }
                    if (!SceneGraph.method4394(local10 + 128, local24, local14 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!SceneGraph.method4394(local10 + 128, local28, local14)) {
                        return false;
                    }
                    if (!SceneGraph.method4394(local10 + 128, local28, local14 + 128)) {
                        return false;
                    }
                }
                if (!SceneGraph.method4394(local10 + 128, local32, local14)) {
                    return false;
                }
                if (!SceneGraph.method4394(local10 + 128, local32, local14 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (local14 > Static217.anInt4903) {
                    if (!SceneGraph.method4394(local10, local24, local14)) {
                        return false;
                    }
                    if (!SceneGraph.method4394(local10 + 128, local24, local14)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!SceneGraph.method4394(local10, local28, local14)) {
                        return false;
                    }
                    if (!SceneGraph.method4394(local10 + 128, local28, local14)) {
                        return false;
                    }
                }
                if (!SceneGraph.method4394(local10, local32, local14)) {
                    return false;
                }
                if (!SceneGraph.method4394(local10 + 128, local32, local14)) {
                    return false;
                }
                return true;
            }
        }
        if (!SceneGraph.method4394(local10 + 64, local36, local14 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return SceneGraph.method4394(local10, local32, local14 + 128);
        } else if (arg3 == 32) {
            return SceneGraph.method4394(local10 + 128, local32, local14 + 128);
        } else if (arg3 == 64) {
            return SceneGraph.method4394(local10 + 128, local32, local14);
        } else if (arg3 == 128) {
            return SceneGraph.method4394(local10, local32, local14);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!rh;IIIIIIIZ)V")
    public static void method2610(@OriginalArg(0) PlainTile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
        @Pc(6) int local6;
        @Pc(7) int local7 = local6 = (arg6 << 7) - Static123.anInt3555;
        @Pc(14) int local14;
        @Pc(15) int local15 = local14 = (arg7 << 7) - Static217.anInt4903;
        @Pc(20) int local20;
        @Pc(21) int local21 = local20 = local7 + 128;
        @Pc(26) int local26;
        @Pc(27) int local27 = local26 = local15 + 128;
        @Pc(37) int local37 = SceneGraph.tileHeights[arg1][arg6][arg7] - Static123.anInt3947;
        @Pc(49) int local49 = SceneGraph.tileHeights[arg1][arg6 + 1][arg7] - Static123.anInt3947;
        @Pc(63) int local63 = SceneGraph.tileHeights[arg1][arg6 + 1][arg7 + 1] - Static123.anInt3947;
        @Pc(75) int local75 = SceneGraph.tileHeights[arg1][arg6][arg7 + 1] - Static123.anInt3947;
        @Pc(85) int local85 = local15 * arg4 + local7 * arg5 >> 16;
        @Pc(95) int local95 = local15 * arg5 - local7 * arg4 >> 16;
        @Pc(97) int local97 = local85;
        @Pc(107) int local107 = local37 * arg3 - local95 * arg2 >> 16;
        @Pc(117) int local117 = local37 * arg2 + local95 * arg3 >> 16;
        @Pc(119) int local119 = local107;
        if (local117 < 50) {
            return;
        }
        local85 = local14 * arg4 + local21 * arg5 >> 16;
        @Pc(143) int local143 = local14 * arg5 - local21 * arg4 >> 16;
        local21 = local85;
        local85 = local49 * arg3 - local143 * arg2 >> 16;
        @Pc(165) int local165 = local49 * arg2 + local143 * arg3 >> 16;
        local49 = local85;
        if (local165 < 50) {
            return;
        }
        local85 = local27 * arg4 + local20 * arg5 >> 16;
        local27 = local27 * arg5 - local20 * arg4 >> 16;
        @Pc(193) int local193 = local85;
        local85 = local63 * arg3 - local27 * arg2 >> 16;
        local27 = local63 * arg2 + local27 * arg3 >> 16;
        local63 = local85;
        if (local27 < 50) {
            return;
        }
        local85 = local26 * arg4 + local6 * arg5 >> 16;
        @Pc(239) int local239 = local26 * arg5 - local6 * arg4 >> 16;
        @Pc(241) int local241 = local85;
        local85 = local75 * arg3 - local239 * arg2 >> 16;
        @Pc(261) int local261 = local75 * arg2 + local239 * arg3 >> 16;
        if (local261 < 50) {
            return;
        }
        @Pc(275) int local275 = Rasteriser.centerX + (local97 << 9) / local117;
        @Pc(283) int local283 = Rasteriser.centerY + (local119 << 9) / local117;
        @Pc(291) int local291 = Rasteriser.centerX + (local21 << 9) / local165;
        @Pc(299) int local299 = Rasteriser.centerY + (local49 << 9) / local165;
        @Pc(307) int local307 = Rasteriser.centerX + (local193 << 9) / local27;
        @Pc(315) int local315 = Rasteriser.centerY + (local63 << 9) / local27;
        @Pc(323) int local323 = Rasteriser.centerX + (local241 << 9) / local261;
        @Pc(331) int local331 = Rasteriser.centerY + (local85 << 9) / local261;
        Rasteriser.alpha = 0;
        @Pc(475) int local475;
        if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
            if (MiniMenu.aBoolean187 && Static147.method583(MiniMenu.anInt2388 + Rasteriser.centerX, MiniMenu.anInt3259 + Rasteriser.centerY, local315, local331, local299, local307, local323, local291)) {
                MiniMenu.anInt1742 = arg6;
                MiniMenu.anInt2954 = arg7;
            }
            if (!GlRenderer.enabled && !arg8) {
                Rasteriser.testX = false;
                if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Rasteriser.width || local323 > Rasteriser.width || local291 > Rasteriser.width) {
                    Rasteriser.testX = true;
                }
                if (arg0.anInt4869 == -1) {
                    if (arg0.anInt4865 != 12345678) {
                        Rasteriser.fillGouraudTriangle(local315, local331, local299, local307, local323, local291, arg0.anInt4865, arg0.anInt4864, arg0.anInt4867);
                    }
                } else if (!Preferences.manyGroundTextures) {
                    local475 = Rasteriser.textureProvider.getAverageColor(arg0.anInt4869);
                    Rasteriser.fillGouraudTriangle(local315, local331, local299, local307, local323, local291, Static147.method1640(local475, arg0.anInt4865), Static147.method1640(local475, arg0.anInt4864), Static147.method1640(local475, arg0.anInt4867));
                } else if (arg0.aBoolean241) {
                    Rasteriser.fillTexturedTriangle(local315, local331, local299, local307, local323, local291, arg0.anInt4865, arg0.anInt4864, arg0.anInt4867, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4869);
                } else {
                    Rasteriser.fillTexturedTriangle(local315, local331, local299, local307, local323, local291, arg0.anInt4865, arg0.anInt4864, arg0.anInt4867, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt4869);
                }
            }
        }
        if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
            return;
        }
        if (MiniMenu.aBoolean187 && Static147.method583(MiniMenu.anInt2388 + Rasteriser.centerX, MiniMenu.anInt3259 + Rasteriser.centerY, local283, local299, local331, local275, local291, local323)) {
            MiniMenu.anInt1742 = arg6;
            MiniMenu.anInt2954 = arg7;
        }
        if (GlRenderer.enabled || arg8) {
            return;
        }
        Rasteriser.testX = false;
        if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Rasteriser.width || local291 > Rasteriser.width || local323 > Rasteriser.width) {
            Rasteriser.testX = true;
        }
        if (arg0.anInt4869 == -1) {
            if (arg0.anInt4872 != 12345678) {
                Rasteriser.fillGouraudTriangle(local283, local299, local331, local275, local291, local323, arg0.anInt4872, arg0.anInt4867, arg0.anInt4864);
            }
        } else if (Preferences.manyGroundTextures) {
            Rasteriser.fillTexturedTriangle(local283, local299, local331, local275, local291, local323, arg0.anInt4872, arg0.anInt4867, arg0.anInt4864, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4869);
        } else {
            local475 = Rasteriser.textureProvider.getAverageColor(arg0.anInt4869);
            Rasteriser.fillGouraudTriangle(local283, local299, local331, local275, local291, local323, Static147.method1640(local475, arg0.anInt4872), Static147.method1640(local475, arg0.anInt4867), Static147.method1640(local475, arg0.anInt4864));
        }
    }

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIII)V")
	public static void method3334(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = arg4 + arg1;
		@Pc(14) int local14 = arg3 - arg4;
		@Pc(29) int local29 = arg4 + arg5;
		@Pc(31) int local31;
		for (local31 = arg1; local31 < local5; local31++) {
			TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[local31], arg5, arg0, arg2);
		}
		for (local31 = arg3; local31 > local14; local31--) {
			TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[local31], arg5, arg0, arg2);
		}
		@Pc(70) int local70 = arg0 - arg4;
		for (local31 = local5; local31 <= local14; local31++) {
			@Pc(83) int[] local83 = TextureOp29SubOp4.anIntArrayArray10[local31];
			TextureOp29SubOp4.method2576(local83, arg5, local29, arg2);
			TextureOp29SubOp4.method2576(local83, local70, arg0, arg2);
		}
	}
}
