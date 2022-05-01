package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class SceneGraph {
    @OriginalMember(owner = "client!bb", name = "g", descriptor = "[[[B")
    public static final byte[][][] tileFlags = new byte[4][104][104];
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
            @Pc(14) Wall local14 = local7.aClass77_1;
            local7.aClass77_1 = null;
            return local14;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "()V")
    public static void clear() {
        @Pc(3) int local3;
        @Pc(9) int local9;
        @Pc(14) int local14;
        if (Static197.surfaceGroundTiles != null) {
            for (local3 = 0; local3 < Static197.surfaceGroundTiles.length; local3++) {
                for (local9 = 0; local9 < Static152.mapSizeX; local9++) {
                    for (local14 = 0; local14 < Static99.mapSizeZ; local14++) {
                        Static197.surfaceGroundTiles[local3][local9][local14] = null;
                    }
                }
            }
        }
        Static36.surfaceHdTiles = null;
        if (Static276.underWaterGroundTiles != null) {
            for (local3 = 0; local3 < Static276.underWaterGroundTiles.length; local3++) {
                for (local9 = 0; local9 < Static152.mapSizeX; local9++) {
                    for (local14 = 0; local14 < Static99.mapSizeZ; local14++) {
                        Static276.underWaterGroundTiles[local3][local9][local14] = null;
                    }
                }
            }
        }
        Static195.underWaterHdTiles = null;
        Static28.anInt917 = 0;
        if (Static91.aClass120Array1 != null) {
            for (local3 = 0; local3 < Static28.anInt917; local3++) {
                Static91.aClass120Array1[local3] = null;
            }
        }
        if (Static243.aClass31Array3 != null) {
            for (local3 = 0; local3 < Static22.anInt726; local3++) {
                Static243.aClass31Array3[local3] = null;
            }
            Static22.anInt726 = 0;
        }
        if (Static25.aClass31Array2 != null) {
            for (local3 = 0; local3 < Static25.aClass31Array2.length; local3++) {
                Static25.aClass31Array2[local3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)Lclient!jh;")
    public static Wall getWall(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(7) Tile local7 = tiles[arg0][arg1][arg2];
        return local7 == null ? null : local7.aClass77_1;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)Lclient!df;")
    public static WallDecor getWallDecor(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(7) Tile local7 = tiles[arg0][arg1][arg2];
        return local7 == null ? null : local7.aClass24_1;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(III)Lclient!ec;")
    public static Scenery getScenery(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(7) Tile local7 = tiles[arg0][arg1][arg2];
        if (local7 == null) {
            return null;
        }
        for (@Pc(13) int local13 = 0; local13 < local7.anInt662; local13++) {
            @Pc(22) Scenery local22 = local7.aClass31Array1[local13];
            if ((local22.aLong56 >> 29 & 0x3L) == 2L && local22.anInt1701 == arg1 && local22.anInt1696 == arg2) {
                return local22;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)Lclient!bm;")
    public static GroundDecor getGroundDecor(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(7) Tile local7 = tiles[arg0][arg1][arg2];
        return local7 == null || local7.aClass15_1 == null ? null : local7.aClass15_1;
    }
}
