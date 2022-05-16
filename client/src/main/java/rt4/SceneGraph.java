package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class SceneGraph {
    @OriginalMember(owner = "client!bb", name = "g", descriptor = "[[[B")
    public static final byte[][][] tileFlags = new byte[4][104][104];
    @OriginalMember(owner = "client!mi", name = "Y", descriptor = "[[[Lclient!ih;")
	public static final LinkedList[][][] objStacks = new LinkedList[4][104][104];
    @OriginalMember(owner = "client!kc", name = "o", descriptor = "[[[Lclient!bj;")
    public static Tile[][][] tiles;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "[[[I")
	public static int[][][] tileHeights;
    @OriginalMember(owner = "client!id", name = "i", descriptor = "[[[I")
    public static int[][][] surfaceTileHeights;
    @OriginalMember(owner = "client!tg", name = "g", descriptor = "[[[B")
    public static byte[][][] tileOverlays;
    @OriginalMember(owner = "client!n", name = "h", descriptor = "[[[B")
	public static byte[][][] tileShapes;
    @OriginalMember(owner = "client!ac", name = "e", descriptor = "[[[B")
    public static byte[][][] tileAngles;
    @OriginalMember(owner = "client!ui", name = "eb", descriptor = "[[[B")
    public static byte[][][] tileUnderlays;
    @OriginalMember(owner = "client!em", name = "t", descriptor = "[[[I")
    public static int[][][] anIntArrayArrayArray6;
    @OriginalMember(owner = "client!ka", name = "r", descriptor = "[I")
    public static int[] anIntArray293;
    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int firstVisibleLevel = 99;
    @OriginalMember(owner = "client!ug", name = "d", descriptor = "[I")
    public static int[] anIntArray479;
    @OriginalMember(owner = "client!l", name = "l", descriptor = "[I")
    public static int[] anIntArray325;
    @OriginalMember(owner = "client!s", name = "i", descriptor = "[I")
    public static int[] anIntArray376;
    @OriginalMember(owner = "client!jd", name = "d", descriptor = "[[[B")
    public static byte[][][] aByteArrayArrayArray9;
    @OriginalMember(owner = "client!wk", name = "v", descriptor = "[I")
    public static int[] anIntArray568;
    @OriginalMember(owner = "client!ub", name = "h", descriptor = "[Lclient!pe;")
    public static Class120[] aClass120Array2;
    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int anInt4870 = 0;
    @OriginalMember(owner = "client!bl", name = "T", descriptor = "I")
	public static int anInt726 = 0;
    @OriginalMember(owner = "client!pm", name = "cb", descriptor = "[[[Lclient!bj;")
    public static Tile[][][] surfaceGroundTiles;
    @OriginalMember(owner = "client!client", name = "kb", descriptor = "[[Lclient!hg;")
    public static GlTile[][] surfaceHdTiles;
    @OriginalMember(owner = "client!wh", name = "c", descriptor = "[[[Lclient!bj;")
    public static Tile[][][] underWaterGroundTiles;
    @OriginalMember(owner = "client!pk", name = "R", descriptor = "[[Lclient!hg;")
    public static GlTile[][] underWaterHdTiles;
    @OriginalMember(owner = "client!hc", name = "O", descriptor = "[Lclient!pe;")
    public static Class120[] aClass120Array1;
    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int mapSizeX;
    @OriginalMember(owner = "client!hk", name = "Y", descriptor = "I")
    public static int mapSizeZ;
    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int anInt917;
    @OriginalMember(owner = "client!tk", name = "D", descriptor = "[Lclient!ec;")
	public static Scenery[] aClass31Array3;
    @OriginalMember(owner = "client!c", name = "bb", descriptor = "[Lclient!ec;")
    public static Scenery[] aClass31Array2;
    @OriginalMember(owner = "client!gf", name = "O", descriptor = "[[[I")
    public static int[][][] underwaterTileHeights;
    @OriginalMember(owner = "client!oj", name = "E", descriptor = "[[Lclient!hg;")
    public static GlTile[][] underwaterHdTiles;
    @OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
    public static int anInt3114;
    @OriginalMember(owner = "client!sm", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "(I)Z")
    public static boolean allLevelsAreVisible() {
        return GlRenderer.enabled || Preferences.allLevelsVisible;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIII)I")
    public static int getTileHeight(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
        if (tileHeights == null) {
            return 0;
        }
        @Pc(12) int local12 = arg1 >> 7;
        @Pc(16) int local16 = arg2 >> 7;
        if (local12 < 0 || local16 < 0 || local12 > 103 || local16 > 103) {
            return 0;
        }
        @Pc(36) int local36 = arg1 & 0x7F;
        @Pc(40) int local40 = arg2 & 0x7F;
        @Pc(42) int local42 = arg0;
        if (arg0 < 3 && (tileFlags[1][local12][local16] & 0x2) == 2) {
            local42 = arg0 + 1;
        }
        @Pc(91) int local91 = local36 * tileHeights[local42][local12 + 1][local16 + 1] + tileHeights[local42][local12][local16 + 1] * (128 - local36) >> 7;
        @Pc(118) int local118 = local36 * tileHeights[local42][local12 + 1][local16] + (128 - local36) * tileHeights[local42][local12][local16] >> 7;
        return local40 * local91 + (128 - local40) * local118 >> 7;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)Lclient!jh;")
    public static Wall removeWall(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(7) Tile local7 = tiles[arg0][arg1][arg2];
        if (local7 == null) {
            return null;
        } else {
            @Pc(14) Wall local14 = local7.wall;
            local7.wall = null;
            return local14;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "()V")
    public static void clear() {
        @Pc(3) int local3;
        @Pc(9) int local9;
        @Pc(14) int local14;
        if (surfaceGroundTiles != null) {
            for (local3 = 0; local3 < surfaceGroundTiles.length; local3++) {
                for (local9 = 0; local9 < mapSizeX; local9++) {
                    for (local14 = 0; local14 < mapSizeZ; local14++) {
                        surfaceGroundTiles[local3][local9][local14] = null;
                    }
                }
            }
        }
        surfaceHdTiles = null;
        if (underWaterGroundTiles != null) {
            for (local3 = 0; local3 < underWaterGroundTiles.length; local3++) {
                for (local9 = 0; local9 < mapSizeX; local9++) {
                    for (local14 = 0; local14 < mapSizeZ; local14++) {
                        underWaterGroundTiles[local3][local9][local14] = null;
                    }
                }
            }
        }
        underWaterHdTiles = null;
        anInt917 = 0;
        if (aClass120Array1 != null) {
            for (local3 = 0; local3 < anInt917; local3++) {
                aClass120Array1[local3] = null;
            }
        }
        if (aClass31Array3 != null) {
            for (local3 = 0; local3 < anInt726; local3++) {
                aClass31Array3[local3] = null;
            }
            anInt726 = 0;
        }
        if (aClass31Array2 != null) {
            for (local3 = 0; local3 < aClass31Array2.length; local3++) {
                aClass31Array2[local3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)Lclient!jh;")
    public static Wall getWall(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(7) Tile local7 = tiles[arg0][arg1][arg2];
        return local7 == null ? null : local7.wall;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)Lclient!df;")
    public static WallDecor getWallDecor(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(7) Tile local7 = tiles[arg0][arg1][arg2];
        return local7 == null ? null : local7.wallDecor;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(III)Lclient!ec;")
    public static Scenery getScenery(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(7) Tile local7 = tiles[arg0][arg1][arg2];
        if (local7 == null) {
            return null;
        }
        for (@Pc(13) int local13 = 0; local13 < local7.sceneryLen; local13++) {
            @Pc(22) Scenery local22 = local7.scenery[local13];
            if ((local22.key >> 29 & 0x3L) == 2L && local22.anInt1701 == arg1 && local22.anInt1696 == arg2) {
                return local22;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)Lclient!bm;")
    public static GroundDecor getGroundDecor(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(7) Tile local7 = tiles[arg0][arg1][arg2];
        return local7 == null || local7.groundDecor == null ? null : local7.groundDecor;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIJ)Z")
    public static boolean isLocValid(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
        @Pc(7) Tile tile = tiles[arg0][arg1][arg2];
        if (tile == null) {
            return false;
        } else if (tile.wall != null && tile.wall.key == arg3) {
            return true;
        } else if (tile.wallDecor != null && tile.wallDecor.key == arg3) {
            return true;
        } else if (tile.groundDecor != null && tile.groundDecor.key == arg3) {
            return true;
        } else {
            for (@Pc(46) int local46 = 0; local46 < tile.sceneryLen; local46++) {
                if (tile.scenery[local46].key == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZI)V")
    public static void method3535(@OriginalArg(0) boolean arg0) {
        anIntArray376 = new int[104];
        anIntArray325 = new int[104];
        firstVisibleLevel = 99;
        anIntArray479 = new int[104];
        @Pc(14) byte plane;
        if (arg0) {
            plane = 1;
        } else {
            plane = 4;
        }
        tileShapes = new byte[plane][104][104];
        anIntArray293 = new int[104];
        anIntArrayArrayArray6 = new int[plane][105][105];
        aByteArrayArrayArray9 = new byte[plane][105][105];
        tileOverlays = new byte[plane][104][104];
        anIntArray568 = new int[104];
        tileAngles = new byte[plane][104][104];
        tileUnderlays = new byte[plane][104][104];
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public static void method2255() {
        anIntArray479 = null;
        anIntArrayArrayArray6 = null;
        anIntArray293 = null;
        tileShapes = null;
        tileAngles = null;
        aByteArrayArrayArray9 = null;
        tileOverlays = null;
        tileUnderlays = null;
        anIntArray325 = null;
        anIntArray376 = null;
        anIntArray568 = null;
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(III)Z")
    public static boolean method4394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        for (@Pc(1) int local1 = 0; local1 < anInt4870; local1++) {
            @Pc(8) Class120 local8 = aClass120Array2[local1];
            @Pc(17) int local17;
            @Pc(29) int local29;
            @Pc(39) int local39;
            @Pc(49) int local49;
            @Pc(59) int local59;
            if (local8.anInt4462 == 1) {
                local17 = local8.anInt4460 - arg0;
                if (local17 > 0) {
                    local29 = local8.anInt4458 + (local8.anInt4454 * local17 >> 8);
                    local39 = local8.anInt4449 + (local8.anInt4450 * local17 >> 8);
                    local49 = local8.anInt4444 + (local8.anInt4459 * local17 >> 8);
                    local59 = local8.anInt4447 + (local8.anInt4463 * local17 >> 8);
                    if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
                        return true;
                    }
                }
            } else if (local8.anInt4462 == 2) {
                local17 = arg0 - local8.anInt4460;
                if (local17 > 0) {
                    local29 = local8.anInt4458 + (local8.anInt4454 * local17 >> 8);
                    local39 = local8.anInt4449 + (local8.anInt4450 * local17 >> 8);
                    local49 = local8.anInt4444 + (local8.anInt4459 * local17 >> 8);
                    local59 = local8.anInt4447 + (local8.anInt4463 * local17 >> 8);
                    if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
                        return true;
                    }
                }
            } else if (local8.anInt4462 == 3) {
                local17 = local8.anInt4458 - arg2;
                if (local17 > 0) {
                    local29 = local8.anInt4460 + (local8.anInt4448 * local17 >> 8);
                    local39 = local8.anInt4445 + (local8.anInt4456 * local17 >> 8);
                    local49 = local8.anInt4444 + (local8.anInt4459 * local17 >> 8);
                    local59 = local8.anInt4447 + (local8.anInt4463 * local17 >> 8);
                    if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
                        return true;
                    }
                }
            } else if (local8.anInt4462 == 4) {
                local17 = arg2 - local8.anInt4458;
                if (local17 > 0) {
                    local29 = local8.anInt4460 + (local8.anInt4448 * local17 >> 8);
                    local39 = local8.anInt4445 + (local8.anInt4456 * local17 >> 8);
                    local49 = local8.anInt4444 + (local8.anInt4459 * local17 >> 8);
                    local59 = local8.anInt4447 + (local8.anInt4463 * local17 >> 8);
                    if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
                        return true;
                    }
                }
            } else if (local8.anInt4462 == 5) {
                local17 = arg1 - local8.anInt4444;
                if (local17 > 0) {
                    local29 = local8.anInt4460 + (local8.anInt4448 * local17 >> 8);
                    local39 = local8.anInt4445 + (local8.anInt4456 * local17 >> 8);
                    local49 = local8.anInt4458 + (local8.anInt4454 * local17 >> 8);
                    local59 = local8.anInt4449 + (local8.anInt4450 * local17 >> 8);
                    if (arg0 >= local29 && arg0 <= local39 && arg2 >= local49 && arg2 <= local59) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)J")
	public static long method602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Tile local7 = tiles[arg0][arg1][arg2];
		return local7 == null || local7.groundDecor == null ? 0L : local7.groundDecor.key;
	}

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V")
    public static void setRenderTiles(@OriginalArg(0) boolean arg0) {
        if (arg0) {
            tiles = underWaterGroundTiles;
            tileHeights = underwaterTileHeights;
            underwaterHdTiles = underWaterHdTiles;
        } else {
            tiles = surfaceGroundTiles;
            tileHeights = surfaceTileHeights;
            underwaterHdTiles = surfaceHdTiles;
        }
        anInt3114 = tiles.length;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIZLclient!wa;IIBII)V")
    public static void readTile(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Buffer arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
        @Pc(32) int local32;
        if (arg5 < 0 || arg5 >= 104 || arg4 < 0 || arg4 >= 104) {
            while (true) {
                local32 = arg3.g1();
                if (local32 == 0) {
                    break;
                }
                if (local32 == 1) {
                    arg3.g1();
                    break;
                }
                if (local32 <= 49) {
                    arg3.g1();
                }
            }
            return;
        }
        if (!arg2) {
            tileFlags[arg7][arg5][arg4] = 0;
        }
        while (true) {
            local32 = arg3.g1();
            if (local32 == 0) {
                if (arg2) {
                    tileHeights[0][arg5][arg4] = surfaceTileHeights[0][arg5][arg4];
                } else if (arg7 == 0) {
                    tileHeights[0][arg5][arg4] = -PerlinNoise.getTileHeight(arg4 + arg1 + 556238, arg0 + arg5 + 932731) * 8;
                } else {
                    tileHeights[arg7][arg5][arg4] = tileHeights[arg7 - 1][arg5][arg4] - 240;
                }
                break;
            }
            if (local32 == 1) {
                @Pc(111) int local111 = arg3.g1();
                if (arg2) {
                    tileHeights[0][arg5][arg4] = surfaceTileHeights[0][arg5][arg4] + local111 * 8;
                } else {
                    if (local111 == 1) {
                        local111 = 0;
                    }
                    if (arg7 == 0) {
                        tileHeights[0][arg5][arg4] = -local111 * 8;
                    } else {
                        tileHeights[arg7][arg5][arg4] = tileHeights[arg7 - 1][arg5][arg4] - local111 * 8;
                    }
                }
                break;
            }
            if (local32 <= 49) {
                tileOverlays[arg7][arg5][arg4] = arg3.g1s();
                tileShapes[arg7][arg5][arg4] = (byte) ((local32 - 2) / 4);
                tileAngles[arg7][arg5][arg4] = (byte) (local32 + arg6 - 2 & 0x3);
            } else if (local32 > 81) {
                tileUnderlays[arg7][arg5][arg4] = (byte) (local32 - 81);
            } else if (!arg2) {
                tileFlags[arg7][arg5][arg4] = (byte) (local32 - 49);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIII)V")
    public static void method1881(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
        if (arg5 < 0 || arg3 < 0 || arg5 >= 103 || arg3 >= 103) {
            return;
        }
        @Pc(38) int local38;
        if (arg4 == 0) {
            @Pc(28) Wall local28 = getWall(arg0, arg5, arg3);
            if (local28 != null) {
                local38 = Integer.MAX_VALUE & (int) (local28.key >>> 32);
                if (arg2 == 2) {
                    local28.primary = new Loc(local38, 2, arg1 + 4, arg0, arg5, arg3, arg6, false, local28.primary);
                    local28.aClass8_6 = new Loc(local38, 2, arg1 + 1 & 0x3, arg0, arg5, arg3, arg6, false, local28.aClass8_6);
                } else {
                    local28.primary = new Loc(local38, arg2, arg1, arg0, arg5, arg3, arg6, false, local28.primary);
                }
            }
        }
        if (arg4 == 1) {
            @Pc(106) WallDecor local106 = getWallDecor(arg0, arg5, arg3);
            if (local106 != null) {
                local38 = (int) (local106.key >>> 32) & Integer.MAX_VALUE;
                if (arg2 == 4 || arg2 == 5) {
                    local106.primary = new Loc(local38, 4, arg1, arg0, arg5, arg3, arg6, false, local106.primary);
                } else if (arg2 == 6) {
                    local106.primary = new Loc(local38, 4, arg1 + 4, arg0, arg5, arg3, arg6, false, local106.primary);
                } else if (arg2 == 7) {
                    local106.primary = new Loc(local38, 4, (arg1 + 2 & 0x3) + 4, arg0, arg5, arg3, arg6, false, local106.primary);
                } else if (arg2 == 8) {
                    local106.primary = new Loc(local38, 4, arg1 + 4, arg0, arg5, arg3, arg6, false, local106.primary);
                    local106.aClass8_2 = new Loc(local38, 4, (arg1 + 2 & 0x3) + 4, arg0, arg5, arg3, arg6, false, local106.aClass8_2);
                }
            }
        }
        if (arg4 == 2) {
            if (arg2 == 11) {
                arg2 = 10;
            }
            @Pc(255) Scenery local255 = getScenery(arg0, arg5, arg3);
            if (local255 != null) {
                local255.primary = new Loc((int) (local255.key >>> 32) & Integer.MAX_VALUE, arg2, arg1, arg0, arg5, arg3, arg6, false, local255.primary);
            }
        }
        if (arg4 == 3) {
            @Pc(290) GroundDecor local290 = getGroundDecor(arg0, arg5, arg3);
            if (local290 != null) {
                local290.primary = new Loc(Integer.MAX_VALUE & (int) (local290.key >>> 32), 22, arg1, arg0, arg5, arg3, arg6, false, local290.primary);
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIILclient!th;JZ)V")
    public static void method2570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Entity arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
        if (arg4 == null) {
            return;
        }
        @Pc(6) GroundDecor local6 = new GroundDecor();
        local6.primary = arg4;
        local6.anInt732 = arg1 * 128 + 64;
        local6.anInt736 = arg2 * 128 + 64;
        local6.anInt733 = arg3;
        local6.key = arg5;
        local6.aBoolean49 = arg6;
        if (tiles[arg0][arg1][arg2] == null) {
            tiles[arg0][arg1][arg2] = new Tile(arg0, arg1, arg2);
        }
        tiles[arg0][arg1][arg2].groundDecor = local6;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public static void method2574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
        @Pc(7) AttachLocRequest local7 = new AttachLocRequest();
        local7.angle = arg6;
        local7.anInt1205 = arg3;
        local7.anInt1187 = arg1;
        local7.anInt1200 = arg5;
        local7.entityId = arg2;
        local7.x = arg8;
        local7.anInt1197 = arg10;
        local7.z = arg4;
        local7.locId = arg11;
        local7.anInt1188 = arg7;
        local7.anInt1191 = arg0;
        local7.shape = arg9;
        AttachLocRequest.queue.addTail(local7);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)I")
	public static int method2251(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = arg0 & 0x3F;
		@Pc(17) int local17 = arg0 >> 6 & 0x3;
		if (local11 == 18) {
			if (local17 == 0) {
				return 1;
			}
			if (local17 == 1) {
				return 2;
			}
			if (local17 == 2) {
				return 4;
			}
			if (local17 == 3) {
				return 8;
			}
		} else if (local11 == 19 || local11 == 21) {
			if (local17 == 0) {
				return 16;
			}
			if (local17 == 1) {
				return 32;
			}
			if (local17 == 2) {
				return 64;
			}
			if (local17 == 3) {
				return 128;
			}
		}
		return 0;
	}

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIILclient!th;Lclient!th;IIJ)V")
    public static void method4508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Entity arg4, @OriginalArg(5) Entity arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        @Pc(8) Wall local8 = new Wall();
        local8.key = arg8;
        local8.anInt3048 = arg1 * 128 + 64;
        local8.anInt3044 = arg2 * 128 + 64;
        local8.anInt3051 = arg3;
        local8.primary = arg4;
        local8.aClass8_6 = arg5;
        local8.anInt3049 = arg6;
        local8.anInt3052 = arg7;
        for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
            if (tiles[local42][arg1][arg2] == null) {
                tiles[local42][arg1][arg2] = new Tile(local42, arg1, arg2);
            }
        }
        tiles[arg0][arg1][arg2].wall = local8;
    }
}
