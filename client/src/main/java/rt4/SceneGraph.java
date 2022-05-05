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
}
