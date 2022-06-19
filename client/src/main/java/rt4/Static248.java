package rt4;

import com.jogamp.opengl.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
	public static int anInt4229 = 2;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III[[[BIBII)V")
	public static void method3292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		Static13.anInt437++;
		Static211.anInt1142 = 0;
		@Pc(9) int local9 = arg6 - 16;
		@Pc(13) int local13 = arg6 + 16;
		@Pc(17) int local17 = arg7 - 16;
		@Pc(21) int local21 = arg7 + 16;
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(183) int local183;
		for (@Pc(23) int local23 = Static235.anInt5276; local23 < SceneGraph.anInt3114; local23++) {
			@Pc(30) Tile[][] local30 = SceneGraph.tiles[local23];
			for (local32 = Static31.anInt987; local32 < Static2.anInt15; local32++) {
				for (local37 = Static80.anInt4698; local37 < Static215.anInt4866; local37++) {
					@Pc(46) Tile local46 = local30[local32][local37];
					if (local46 != null) {
						if (SceneGraph.aBooleanArrayArray1[local32 + SceneGraph.visibility - Static167.anInt4069][local37 + SceneGraph.visibility - Static193.anInt4539] && (arg3 == null || local23 < arg4 || arg3[local23][local32][local37] != arg5)) {
							local46.aBoolean45 = true;
							local46.aBoolean46 = true;
							if (local46.sceneryLen > 0) {
								local46.aBoolean47 = true;
							} else {
								local46.aBoolean47 = false;
							}
							Static211.anInt1142++;
						} else {
							local46.aBoolean45 = false;
							local46.aBoolean46 = false;
							local46.anInt663 = 0;
							if (local32 >= local9 && local32 <= local13 && local37 >= local17 && local37 <= local21) {
								if (local46.wall != null) {
									@Pc(103) Wall local103 = local46.wall;
									local103.primary.method4545(0, local23, local103.anInt3051, local103.anInt3048, local103.anInt3044);
									if (local103.aClass8_6 != null) {
										local103.aClass8_6.method4545(0, local23, local103.anInt3051, local103.anInt3048, local103.anInt3044);
									}
								}
								if (local46.wallDecor != null) {
									@Pc(134) WallDecor local134 = local46.wallDecor;
									local134.primary.method4545(local134.anInt1388, local23, local134.anInt1391, local134.anInt1390, local134.anInt1393);
									if (local134.aClass8_2 != null) {
										local134.aClass8_2.method4545(local134.anInt1388, local23, local134.anInt1391, local134.anInt1390, local134.anInt1393);
									}
								}
								if (local46.groundDecor != null) {
									@Pc(167) GroundDecor local167 = local46.groundDecor;
									local167.primary.method4545(0, local23, local167.anInt733, local167.anInt732, local167.anInt736);
								}
								if (local46.scenery != null) {
									for (local183 = 0; local183 < local46.sceneryLen; local183++) {
										@Pc(192) Scenery local192 = local46.scenery[local183];
										local192.primary.method4545(local192.anInt1714, local23, local192.anInt1706, local192.anInt1699, local192.anInt1703);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(240) boolean local240 = SceneGraph.tileHeights == SceneGraph.underwaterTileHeights;
		if (GlRenderer.enabled) {
			@Pc(244) GL2 gl = GlRenderer.gl;
			gl.glPushMatrix();
			gl.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
			if (local240) {
				UnderwaterMaterialRenderer.applyFogFade();
				MaterialManager.setMaterial(-1, 3);
				MaterialManager.renderingUnderwater = true;
				UnderwaterMaterialRenderer.method4609();
				Static152.anInt3604 = -1;
				Static247.anInt730 = -1;
				for (local32 = 0; local32 < SceneGraph.underwaterHdTiles[0].length; local32++) {
					@Pc(285) GlTile local285 = SceneGraph.underwaterHdTiles[0][local32];
					@Pc(294) float local294 = 251.5F - (local285.blend ? 1.0F : 0.5F);
					if (local285.underwaterColor != Static152.anInt3604) {
						Static152.anInt3604 = local285.underwaterColor;
						WaterMaterialRenderer.method619(local285.underwaterColor);
						FogManager.method3066(WaterMaterialRenderer.method2422());
					}
					local285.method1944(SceneGraph.tiles, local294, false);
				}
				UnderwaterMaterialRenderer.method4608();
			} else {
				local32 = Static235.anInt5276;
				while (true) {
					if (local32 >= SceneGraph.anInt3114) {
						LightingManager.method2402(Static167.anInt4069, Static193.anInt4539, SceneGraph.tiles);
						break;
					}
					for (local37 = 0; local37 < SceneGraph.underwaterHdTiles[local32].length; local37++) {
						@Pc(336) GlTile local336 = SceneGraph.underwaterHdTiles[local32][local37];
						@Pc(350) float local350 = 201.5F - (float) local32 * 50.0F - (local336.blend ? 1.0F : 0.5F);
						if (local336.texture != -1 && Rasteriser.textureProvider.getMaterialType(local336.texture) == MaterialManager.WATER && Preferences.highWaterDetail) {
							WaterMaterialRenderer.method619(local336.underwaterColor);
						}
						local336.method1944(SceneGraph.tiles, local350, false);
					}
					if (local32 == 0 && Preferences.sceneryShadowsType > 0) {
						GlRenderer.method4159(101.5F);
						Static242.method4198(Static167.anInt4069, Static193.anInt4539, SceneGraph.visibility, arg1, SceneGraph.aBooleanArrayArray1, SceneGraph.tileHeights[0]);
					}
					local32++;
				}
			}
			gl.glPopMatrix();
		}
		@Pc(434) int local434;
		@Pc(438) int local438;
		@Pc(450) Tile local450;
		@Pc(399) int local399;
		@Pc(406) Tile[][] local406;
		@Pc(415) int local415;
		@Pc(428) int local428;
		for (local399 = Static235.anInt5276; local399 < SceneGraph.anInt3114; local399++) {
			local406 = SceneGraph.tiles[local399];
			for (local37 = -SceneGraph.visibility; local37 <= 0; local37++) {
				local415 = Static167.anInt4069 + local37;
				local183 = Static167.anInt4069 - local37;
				if (local415 >= Static31.anInt987 || local183 < Static2.anInt15) {
					for (local428 = -SceneGraph.visibility; local428 <= 0; local428++) {
						local434 = Static193.anInt4539 + local428;
						local438 = Static193.anInt4539 - local428;
						if (local415 >= Static31.anInt987) {
							if (local434 >= Static80.anInt4698) {
								local450 = local406[local415][local434];
								if (local450 != null && local450.aBoolean45) {
									Static247.method4245(local450, true);
								}
							}
							if (local438 < Static215.anInt4866) {
								local450 = local406[local415][local438];
								if (local450 != null && local450.aBoolean45) {
									Static247.method4245(local450, true);
								}
							}
						}
						if (local183 < Static2.anInt15) {
							if (local434 >= Static80.anInt4698) {
								local450 = local406[local183][local434];
								if (local450 != null && local450.aBoolean45) {
									Static247.method4245(local450, true);
								}
							}
							if (local438 < Static215.anInt4866) {
								local450 = local406[local183][local438];
								if (local450 != null && local450.aBoolean45) {
									Static247.method4245(local450, true);
								}
							}
						}
						if (Static211.anInt1142 == 0) {
							if (!local240) {
								MiniMenu.aBoolean187 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (local399 = Static235.anInt5276; local399 < SceneGraph.anInt3114; local399++) {
			local406 = SceneGraph.tiles[local399];
			for (local37 = -SceneGraph.visibility; local37 <= 0; local37++) {
				local415 = Static167.anInt4069 + local37;
				local183 = Static167.anInt4069 - local37;
				if (local415 >= Static31.anInt987 || local183 < Static2.anInt15) {
					for (local428 = -SceneGraph.visibility; local428 <= 0; local428++) {
						local434 = Static193.anInt4539 + local428;
						local438 = Static193.anInt4539 - local428;
						if (local415 >= Static31.anInt987) {
							if (local434 >= Static80.anInt4698) {
								local450 = local406[local415][local434];
								if (local450 != null && local450.aBoolean45) {
									Static247.method4245(local450, false);
								}
							}
							if (local438 < Static215.anInt4866) {
								local450 = local406[local415][local438];
								if (local450 != null && local450.aBoolean45) {
									Static247.method4245(local450, false);
								}
							}
						}
						if (local183 < Static2.anInt15) {
							if (local434 >= Static80.anInt4698) {
								local450 = local406[local183][local434];
								if (local450 != null && local450.aBoolean45) {
									Static247.method4245(local450, false);
								}
							}
							if (local438 < Static215.anInt4866) {
								local450 = local406[local183][local438];
								if (local450 != null && local450.aBoolean45) {
									Static247.method4245(local450, false);
								}
							}
						}
						if (Static211.anInt1142 == 0) {
							if (!local240) {
								MiniMenu.aBoolean187 = false;
							}
							return;
						}
					}
				}
			}
		}
		MiniMenu.aBoolean187 = false;
	}
}