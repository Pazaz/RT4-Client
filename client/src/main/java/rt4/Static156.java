package rt4;

import com.jogamp.opengl.GL2;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "I")
	public static int loginScreenId;
    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
	public static int anInt5276 = 0;
    @OriginalMember(owner = "client!bc", name = "Z", descriptor = "I")
    public static int anInt437;
    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int anInt1142 = 0;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
	public static void method2954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= SceneGraph.width * 128) {
			arg0 = SceneGraph.width * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= SceneGraph.length * 128) {
			arg2 = SceneGraph.length * 128 - 1;
		}
		Static160.anInt2886 = MathUtils.sin[arg3];
		Static121.anInt3038 = MathUtils.cos[arg3];
		Static231.anInt5205 = MathUtils.sin[arg4];
		Static81.anInt2222 = MathUtils.cos[arg4];
		Static123.anInt3555 = arg0;
		Static123.anInt3947 = arg1;
		Static217.anInt4903 = arg2;
		Static123.anInt4069 = arg0 / 128;
		Static193.anInt4539 = arg2 / 128;
		LightingManager.anInt987 = Static123.anInt4069 - SceneGraph.visibility;
		if (LightingManager.anInt987 < 0) {
			LightingManager.anInt987 = 0;
		}
		LightingManager.anInt4698 = Static193.anInt4539 - SceneGraph.visibility;
		if (LightingManager.anInt4698 < 0) {
			LightingManager.anInt4698 = 0;
		}
		LightingManager.anInt15 = Static123.anInt4069 + SceneGraph.visibility;
		if (LightingManager.anInt15 > SceneGraph.width) {
			LightingManager.anInt15 = SceneGraph.width;
		}
		LightingManager.anInt4866 = Static193.anInt4539 + SceneGraph.visibility;
		if (LightingManager.anInt4866 > SceneGraph.length) {
			LightingManager.anInt4866 = SceneGraph.length;
		}
		@Pc(99) short local99;
		if (GlRenderer.enabled) {
			local99 = (short)GlobalConfig.VIEW_DISTANCE;
		} else {
			local99 = 3500;
		}
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (local104 = 0; local104 < SceneGraph.visibility + SceneGraph.visibility + 2; local104++) {
			for (local113 = 0; local113 < SceneGraph.visibility + SceneGraph.visibility + 2; local113++) {
				@Pc(130) int local130 = (local104 - SceneGraph.visibility << 7) - (Static123.anInt3555 & 0x7F);
				@Pc(140) int local140 = (local113 - SceneGraph.visibility << 7) - (Static217.anInt4903 & 0x7F);
				@Pc(146) int local146 = Static123.anInt4069 + local104 - SceneGraph.visibility;
				@Pc(152) int local152 = Static193.anInt4539 + local113 - SceneGraph.visibility;
				if (local146 >= 0 && local152 >= 0 && local146 < SceneGraph.width && local152 < SceneGraph.length) {
					@Pc(176) int local176;
					if (SceneGraph.underwaterTileHeights == null) {
						local176 = SceneGraph.surfaceTileHeights[0][local146][local152] + 128 - Static123.anInt3947;
					} else {
						local176 = SceneGraph.underwaterTileHeights[0][local146][local152] + 128 - Static123.anInt3947;
					}
					@Pc(201) int local201 = SceneGraph.surfaceTileHeights[3][local146][local152] - Static123.anInt3947 - 1000;
					SceneGraph.aBooleanArrayArray3[local104][local113] = Static160.method3049(local130, local201, local176, local140, local99);
				} else {
					SceneGraph.aBooleanArrayArray3[local104][local113] = false;
				}
			}
		}
		for (local104 = 0; local104 < SceneGraph.visibility + SceneGraph.visibility + 1; local104++) {
			for (local113 = 0; local113 < SceneGraph.visibility + SceneGraph.visibility + 1; local113++) {
				SceneGraph.aBooleanArrayArray1[local104][local113] = SceneGraph.aBooleanArrayArray3[local104][local113] || SceneGraph.aBooleanArrayArray3[local104 + 1][local113] || SceneGraph.aBooleanArrayArray3[local104][local113 + 1] || SceneGraph.aBooleanArrayArray3[local104 + 1][local113 + 1];
			}
		}
		Static8.anIntArray8 = arg6;
		Static123.anIntArray292 = arg7;
		Static96.anIntArray234 = arg8;
		Static123.anIntArray454 = arg9;
		Static123.anIntArray427 = arg10;
		Static123.method2419();
		if (SceneGraph.underWaterGroundTiles != null) {
			SceneGraph.setUnderwater(true);
			method3292(arg0, arg1, arg2, null, 0, (byte) 0, arg13, arg14);
			if (GlRenderer.enabled) {
				MaterialManager.renderingUnderwater = false;
				MaterialManager.setMaterial(0, 0);
				FogManager.method3066(null);
				LightingManager.method2390();
			}
			SceneGraph.setUnderwater(false);
		}
		method3292(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLclient!wa;)Lclient!ta;")
	public static TextureOp29SubOp4 method2960(@OriginalArg(1) Buffer arg0) {
		return new TextureOp29SubOp4(arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.g3(), arg0.g3(), arg0.g1());
	}

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III[[[BIBII)V")
    public static void method3292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
        anInt437++;
        anInt1142 = 0;
        @Pc(9) int local9 = arg6 - 16;
        @Pc(13) int local13 = arg6 + 16;
        @Pc(17) int local17 = arg7 - 16;
        @Pc(21) int local21 = arg7 + 16;
        @Pc(32) int local32;
        @Pc(37) int local37;
        @Pc(183) int local183;
        for (@Pc(23) int local23 = anInt5276; local23 < SceneGraph.levels; local23++) {
            @Pc(30) Tile[][] local30 = SceneGraph.tiles[local23];
            for (local32 = LightingManager.anInt987; local32 < LightingManager.anInt15; local32++) {
                for (local37 = LightingManager.anInt4698; local37 < LightingManager.anInt4866; local37++) {
                    @Pc(46) Tile local46 = local30[local32][local37];
                    if (local46 != null) {
                        if (SceneGraph.aBooleanArrayArray1[local32 + SceneGraph.visibility - Static123.anInt4069][local37 + SceneGraph.visibility - Static193.anInt4539] && (arg3 == null || local23 < arg4 || arg3[local23][local32][local37] != arg5)) {
                            local46.aBoolean45 = true;
                            local46.aBoolean46 = true;
                            if (local46.sceneryLen > 0) {
                                local46.aBoolean47 = true;
                            } else {
                                local46.aBoolean47 = false;
                            }
                            anInt1142++;
                        } else {
                            local46.aBoolean45 = false;
                            local46.aBoolean46 = false;
                            local46.anInt663 = 0;
                            if (local32 >= local9 && local32 <= local13 && local37 >= local17 && local37 <= local21) {
                                if (local46.wall != null) {
                                    @Pc(103) Wall local103 = local46.wall;
                                    local103.primary.method4545(0, local23, local103.anInt3051, local103.xFine, local103.zFine);
                                    if (local103.secondary != null) {
                                        local103.secondary.method4545(0, local23, local103.anInt3051, local103.xFine, local103.zFine);
                                    }
                                }
                                if (local46.wallDecor != null) {
                                    @Pc(134) WallDecor local134 = local46.wallDecor;
                                    local134.primary.method4545(local134.anInt1388, local23, local134.anInt1391, local134.anInt1390, local134.anInt1393);
                                    if (local134.secondary != null) {
                                        local134.secondary.method4545(local134.anInt1388, local23, local134.anInt1391, local134.anInt1390, local134.anInt1393);
                                    }
                                }
                                if (local46.groundDecor != null) {
                                    @Pc(167) GroundDecor local167 = local46.groundDecor;
                                    local167.entity.method4545(0, local23, local167.anInt733, local167.xFine, local167.zFine);
                                }
                                if (local46.scenery != null) {
                                    for (local183 = 0; local183 < local46.sceneryLen; local183++) {
                                        @Pc(192) Scenery local192 = local46.scenery[local183];
                                        local192.entity.method4545(local192.anInt1714, local23, local192.anInt1706, local192.anInt1699, local192.anInt1703);
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
                local32 = anInt5276;
                while (true) {
                    if (local32 >= SceneGraph.levels) {
                        LightingManager.method2402(Static123.anInt4069, Static193.anInt4539, SceneGraph.tiles);
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
                        ShadowManager.method4198(Static123.anInt4069, Static193.anInt4539, SceneGraph.visibility, arg1, SceneGraph.aBooleanArrayArray1, SceneGraph.tileHeights[0]);
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
        for (local399 = anInt5276; local399 < SceneGraph.levels; local399++) {
            local406 = SceneGraph.tiles[local399];
            for (local37 = -SceneGraph.visibility; local37 <= 0; local37++) {
                local415 = Static123.anInt4069 + local37;
                local183 = Static123.anInt4069 - local37;
                if (local415 >= LightingManager.anInt987 || local183 < LightingManager.anInt15) {
                    for (local428 = -SceneGraph.visibility; local428 <= 0; local428++) {
                        local434 = Static193.anInt4539 + local428;
                        local438 = Static193.anInt4539 - local428;
                        if (local415 >= LightingManager.anInt987) {
                            if (local434 >= LightingManager.anInt4698) {
                                local450 = local406[local415][local434];
                                if (local450 != null && local450.aBoolean45) {
                                    Static247.method4245(local450, true);
                                }
                            }
                            if (local438 < LightingManager.anInt4866) {
                                local450 = local406[local415][local438];
                                if (local450 != null && local450.aBoolean45) {
                                    Static247.method4245(local450, true);
                                }
                            }
                        }
                        if (local183 < LightingManager.anInt15) {
                            if (local434 >= LightingManager.anInt4698) {
                                local450 = local406[local183][local434];
                                if (local450 != null && local450.aBoolean45) {
                                    Static247.method4245(local450, true);
                                }
                            }
                            if (local438 < LightingManager.anInt4866) {
                                local450 = local406[local183][local438];
                                if (local450 != null && local450.aBoolean45) {
                                    Static247.method4245(local450, true);
                                }
                            }
                        }
                        if (anInt1142 == 0) {
                            if (!local240) {
                                MiniMenu.aBoolean187 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (local399 = anInt5276; local399 < SceneGraph.levels; local399++) {
            local406 = SceneGraph.tiles[local399];
            for (local37 = -SceneGraph.visibility; local37 <= 0; local37++) {
                local415 = Static123.anInt4069 + local37;
                local183 = Static123.anInt4069 - local37;
                if (local415 >= LightingManager.anInt987 || local183 < LightingManager.anInt15) {
                    for (local428 = -SceneGraph.visibility; local428 <= 0; local428++) {
                        local434 = Static193.anInt4539 + local428;
                        local438 = Static193.anInt4539 - local428;
                        if (local415 >= LightingManager.anInt987) {
                            if (local434 >= LightingManager.anInt4698) {
                                local450 = local406[local415][local434];
                                if (local450 != null && local450.aBoolean45) {
                                    Static247.method4245(local450, false);
                                }
                            }
                            if (local438 < LightingManager.anInt4866) {
                                local450 = local406[local415][local438];
                                if (local450 != null && local450.aBoolean45) {
                                    Static247.method4245(local450, false);
                                }
                            }
                        }
                        if (local183 < LightingManager.anInt15) {
                            if (local434 >= LightingManager.anInt4698) {
                                local450 = local406[local183][local434];
                                if (local450 != null && local450.aBoolean45) {
                                    Static247.method4245(local450, false);
                                }
                            }
                            if (local438 < LightingManager.anInt4866) {
                                local450 = local406[local183][local438];
                                if (local450 != null && local450.aBoolean45) {
                                    Static247.method4245(local450, false);
                                }
                            }
                        }
                        if (anInt1142 == 0) {
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
