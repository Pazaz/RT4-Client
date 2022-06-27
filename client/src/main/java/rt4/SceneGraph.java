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
    public static int[] rowCount;
    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int firstVisibleLevel = 99;
    @OriginalMember(owner = "client!ug", name = "d", descriptor = "[I")
    public static int[] rowChroma;
    @OriginalMember(owner = "client!l", name = "l", descriptor = "[I")
    public static int[] rowSaturation;
    @OriginalMember(owner = "client!s", name = "i", descriptor = "[I")
    public static int[] rowWeightedHue;
    @OriginalMember(owner = "client!jd", name = "d", descriptor = "[[[B")
    public static byte[][][] aByteArrayArrayArray9;
    @OriginalMember(owner = "client!wk", name = "v", descriptor = "[I")
    public static int[] rowLightness;
    @OriginalMember(owner = "client!ub", name = "h", descriptor = "[Lclient!pe;")
    public static SceneGraph_Class120[] aClass120Array2;
    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int anInt4870 = 0;
    @OriginalMember(owner = "client!bl", name = "T", descriptor = "I")
	public static int sceneryLen = 0;
    @OriginalMember(owner = "client!pm", name = "cb", descriptor = "[[[Lclient!bj;")
    public static Tile[][][] surfaceGroundTiles;
    @OriginalMember(owner = "client!client", name = "kb", descriptor = "[[Lclient!hg;")
    public static GlTile[][] surfaceHdTiles;
    @OriginalMember(owner = "client!wh", name = "c", descriptor = "[[[Lclient!bj;")
    public static Tile[][][] underWaterGroundTiles;
    @OriginalMember(owner = "client!pk", name = "R", descriptor = "[[Lclient!hg;")
    public static GlTile[][] underWaterHdTiles;
    @OriginalMember(owner = "client!hc", name = "O", descriptor = "[Lclient!pe;")
    public static SceneGraph_Class120[] aClass120Array1;
    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int width;
    @OriginalMember(owner = "client!hk", name = "Y", descriptor = "I")
    public static int length;
    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int anInt917;
    @OriginalMember(owner = "client!tk", name = "D", descriptor = "[Lclient!ec;")
	public static Scenery[] scenery;
    @OriginalMember(owner = "client!c", name = "bb", descriptor = "[Lclient!ec;")
    public static Scenery[] aClass31Array2;
    @OriginalMember(owner = "client!gf", name = "O", descriptor = "[[[I")
    public static int[][][] underwaterTileHeights;
    @OriginalMember(owner = "client!oj", name = "E", descriptor = "[[Lclient!hg;")
    public static GlTile[][] underwaterHdTiles;
    @OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
    public static int levels;
    @OriginalMember(owner = "client!sm", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;
    @OriginalMember(owner = "client!wi", name = "db", descriptor = "I")
	public static int visibility;
    @OriginalMember(owner = "client!f", name = "ab", descriptor = "[[I")
    public static int[][] anIntArrayArray11;
    @OriginalMember(owner = "client!la", name = "i", descriptor = "[[[I")
    public static int[][][] anIntArrayArrayArray12;
    @OriginalMember(owner = "client!dl", name = "h", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;
    @OriginalMember(owner = "client!ha", name = "k", descriptor = "[[Z")
    public static boolean[][] aBooleanArrayArray3;
    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int currentChunkZ;
    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int currentChunkX;
    @OriginalMember(owner = "client!gm", name = "R", descriptor = "I")
	public static int anInt2293 = (int) (Math.random() * 17.0D) - 8;
    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int anInt4272 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "(I)Z")
    public static boolean allLevelsAreVisible() {
        return GlRenderer.enabled || Preferences.allLevelsVisible;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIII)I")
    public static int getTileHeight(@OriginalArg(0) int level, @OriginalArg(2) int xFine, @OriginalArg(3) int zFine) {
        if (tileHeights == null) {
            return 0;
        }
        @Pc(12) int x = xFine >> 7;
        @Pc(16) int z = zFine >> 7;
        if (x < 0 || z < 0 || x > 103 || z > 103) {
            return 0;
        }
        @Pc(36) int xFine2 = xFine & 0x7F;
        @Pc(40) int zFine2 = zFine & 0x7F;
        @Pc(42) int virtualLevel = level;
        if (level < 3 && (tileFlags[1][x][z] & 0x2) == 2) {
            virtualLevel = level + 1;
        }
        @Pc(91) int heightZ0 = xFine2 * tileHeights[virtualLevel][x + 1][z + 1] + tileHeights[virtualLevel][x][z + 1] * (128 - xFine2) >> 7;
        @Pc(118) int heightZ1 = xFine2 * tileHeights[virtualLevel][x + 1][z] + (128 - xFine2) * tileHeights[virtualLevel][x][z] >> 7;
        return zFine2 * heightZ0 + (128 - zFine2) * heightZ1 >> 7;
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
                for (local9 = 0; local9 < width; local9++) {
                    for (local14 = 0; local14 < length; local14++) {
                        surfaceGroundTiles[local3][local9][local14] = null;
                    }
                }
            }
        }
        surfaceHdTiles = null;
        if (underWaterGroundTiles != null) {
            for (local3 = 0; local3 < underWaterGroundTiles.length; local3++) {
                for (local9 = 0; local9 < width; local9++) {
                    for (local14 = 0; local14 < length; local14++) {
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
        if (scenery != null) {
            for (local3 = 0; local3 < sceneryLen; local3++) {
                scenery[local3] = null;
            }
            sceneryLen = 0;
        }
        if (aClass31Array2 != null) {
            for (local3 = 0; local3 < aClass31Array2.length; local3++) {
                aClass31Array2[local3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)Lclient!jh;")
    public static Wall getWall(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
        @Pc(7) Tile tile = tiles[level][x][z];
        return tile == null ? null : tile.wall;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)Lclient!df;")
    public static WallDecor getWallDecor(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
        @Pc(7) Tile tile = tiles[level][x][z];
        return tile == null ? null : tile.wallDecor;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(III)Lclient!ec;")
    public static Scenery getScenery(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
        @Pc(7) Tile tile = tiles[level][x][z];
        if (tile == null) {
            return null;
        }
        for (@Pc(13) int i = 0; i < tile.sceneryLen; i++) {
            @Pc(22) Scenery scenery = tile.scenery[i];
            if ((scenery.key >> 29 & 0x3L) == 2L && scenery.xMin == x && scenery.zMin == z) {
                return scenery;
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
    public static void load(@OriginalArg(0) boolean underwater) {
        rowWeightedHue = new int[104];
        rowSaturation = new int[104];
        firstVisibleLevel = 99;
        rowChroma = new int[104];
        @Pc(14) byte plane;
        if (underwater) {
            plane = 1;
        } else {
            plane = 4;
        }
        tileShapes = new byte[plane][104][104];
        rowCount = new int[104];
        anIntArrayArrayArray6 = new int[plane][105][105];
        aByteArrayArrayArray9 = new byte[plane][105][105];
        tileOverlays = new byte[plane][104][104];
        rowLightness = new int[104];
        tileAngles = new byte[plane][104][104];
        tileUnderlays = new byte[plane][104][104];
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public static void unload() {
        rowChroma = null;
        anIntArrayArrayArray6 = null;
        rowCount = null;
        tileShapes = null;
        tileAngles = null;
        aByteArrayArrayArray9 = null;
        tileOverlays = null;
        tileUnderlays = null;
        rowSaturation = null;
        rowWeightedHue = null;
        rowLightness = null;
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(III)Z")
    public static boolean method4394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        for (@Pc(1) int local1 = 0; local1 < anInt4870; local1++) {
            @Pc(8) SceneGraph_Class120 local8 = aClass120Array2[local1];
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
	public static long getGroundDecorKey(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[level][x][z];
		return tile == null || tile.groundDecor == null ? 0L : tile.groundDecor.key;
	}

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V")
    public static void setUnderwater(@OriginalArg(0) boolean underwater) {
        if (underwater) {
            tiles = underWaterGroundTiles;
            tileHeights = underwaterTileHeights;
            underwaterHdTiles = underWaterHdTiles;
        } else {
            tiles = surfaceGroundTiles;
            tileHeights = surfaceTileHeights;
            underwaterHdTiles = surfaceHdTiles;
        }
        levels = tiles.length;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIZLclient!wa;IIBII)V")
    public static void readTile(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Buffer buffer, @OriginalArg(4) int z, @OriginalArg(5) int x, @OriginalArg(7) int angle, @OriginalArg(8) int level) {
        @Pc(32) int opcode;
        if (x < 0 || x >= 104 || z < 0 || z >= 104) {
            while (true) {
                opcode = buffer.g1();
                if (opcode == 0) {
                    break;
                }
                if (opcode == 1) {
                    buffer.g1();
                    break;
                }
                if (opcode <= 49) {
                    buffer.g1();
                }
            }
            return;
        }
        if (!arg2) {
            tileFlags[level][x][z] = 0;
        }
        while (true) {
            opcode = buffer.g1();
            if (opcode == 0) {
                if (arg2) {
                    tileHeights[0][x][z] = surfaceTileHeights[0][x][z];
                } else if (level == 0) {
                    tileHeights[0][x][z] = -PerlinNoise.getTileHeight(z + arg1 + 556238, arg0 + x + 932731) * 8;
                } else {
                    tileHeights[level][x][z] = tileHeights[level - 1][x][z] - 240;
                }
                break;
            }
            if (opcode == 1) {
                @Pc(111) int height = buffer.g1();
                if (arg2) {
                    tileHeights[0][x][z] = surfaceTileHeights[0][x][z] + height * 8;
                } else {
                    if (height == 1) {
                        height = 0;
                    }
                    if (level == 0) {
                        tileHeights[0][x][z] = -height * 8;
                    } else {
                        tileHeights[level][x][z] = tileHeights[level - 1][x][z] - height * 8;
                    }
                }
                break;
            }
            if (opcode <= 49) {
                tileOverlays[level][x][z] = buffer.g1b();
                tileShapes[level][x][z] = (byte) ((opcode - 2) / 4);
                tileAngles[level][x][z] = (byte) (opcode + angle - 2 & 0x3);
            } else if (opcode > 81) {
                tileUnderlays[level][x][z] = (byte) (opcode - 81);
            } else if (!arg2) {
                tileFlags[level][x][z] = (byte) (opcode - 49);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIII)V")
    public static void method1881(@OriginalArg(0) int level, @OriginalArg(2) int arg1, @OriginalArg(3) int shape, @OriginalArg(4) int z, @OriginalArg(5) int layer, @OriginalArg(6) int x, @OriginalArg(7) int arg6) {
        if (x < 0 || z < 0 || x >= 103 || z >= 103) {
            return;
        }
        @Pc(38) int locId;
        if (layer == 0) {
            @Pc(28) Wall wall = getWall(level, x, z);
            if (wall != null) {
                locId = Integer.MAX_VALUE & (int) (wall.key >>> 32);
                if (shape == 2) {
                    wall.primary = new Loc(locId, 2, arg1 + 4, level, x, z, arg6, false, wall.primary);
                    wall.secondary = new Loc(locId, 2, arg1 + 1 & 0x3, level, x, z, arg6, false, wall.secondary);
                } else {
                    wall.primary = new Loc(locId, shape, arg1, level, x, z, arg6, false, wall.primary);
                }
            }
        }
        if (layer == 1) {
            @Pc(106) WallDecor wallDecor = getWallDecor(level, x, z);
            if (wallDecor != null) {
                locId = (int) (wallDecor.key >>> 32) & Integer.MAX_VALUE;
                if (shape == 4 || shape == 5) {
                    wallDecor.primary = new Loc(locId, 4, arg1, level, x, z, arg6, false, wallDecor.primary);
                } else if (shape == 6) {
                    wallDecor.primary = new Loc(locId, 4, arg1 + 4, level, x, z, arg6, false, wallDecor.primary);
                } else if (shape == 7) {
                    wallDecor.primary = new Loc(locId, 4, (arg1 + 2 & 0x3) + 4, level, x, z, arg6, false, wallDecor.primary);
                } else if (shape == 8) {
                    wallDecor.primary = new Loc(locId, 4, arg1 + 4, level, x, z, arg6, false, wallDecor.primary);
                    wallDecor.secondary = new Loc(locId, 4, (arg1 + 2 & 0x3) + 4, level, x, z, arg6, false, wallDecor.secondary);
                }
            }
        }
        if (layer == 2) {
            if (shape == 11) {
                shape = 10;
            }
            @Pc(255) Scenery scenery = getScenery(level, x, z);
            if (scenery != null) {
                scenery.entity = new Loc((int) (scenery.key >>> 32) & Integer.MAX_VALUE, shape, arg1, level, x, z, arg6, false, scenery.entity);
            }
        }
        if (layer == 3) {
            @Pc(290) GroundDecor groundDecor = getGroundDecor(level, x, z);
            if (groundDecor != null) {
                groundDecor.entity = new Loc(Integer.MAX_VALUE & (int) (groundDecor.key >>> 32), 22, arg1, level, x, z, arg6, false, groundDecor.entity);
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIILclient!th;JZ)V")
    public static void setGroundDecor(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) int arg3, @OriginalArg(4) Entity entity, @OriginalArg(5) long key, @OriginalArg(6) boolean arg6) {
        if (entity == null) {
            return;
        }
        @Pc(6) GroundDecor groundDecor = new GroundDecor();
        groundDecor.entity = entity;
        groundDecor.xFine = x * 128 + 64;
        groundDecor.zFine = z * 128 + 64;
        groundDecor.anInt733 = arg3;
        groundDecor.key = key;
        groundDecor.aBoolean49 = arg6;
        if (tiles[level][x][z] == null) {
            tiles[level][x][z] = new Tile(level, x, z);
        }
        tiles[level][x][z].groundDecor = groundDecor;
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
    public static void setWall(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) int arg3, @OriginalArg(4) Entity primary, @OriginalArg(5) Entity secondary, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long key) {
        if (primary == null && secondary == null) {
            return;
        }
        @Pc(8) Wall wall = new Wall();
        wall.key = key;
        wall.xFine = x * 128 + 64;
        wall.zFine = z * 128 + 64;
        wall.anInt3051 = arg3;
        wall.primary = primary;
        wall.secondary = secondary;
        wall.anInt3049 = arg6;
        wall.anInt3052 = arg7;
        for (@Pc(42) int level0 = level; level0 >= 0; level0--) {
            if (tiles[level0][x][z] == null) {
                tiles[level0][x][z] = new Tile(level0, x, z);
            }
        }
        tiles[level][x][z].wall = wall;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIZ)V")
    public static void init(@OriginalArg(3) int tileVisibility, @OriginalArg(4) boolean hasUnderWaterMap) {
        width = 104;
        length = 104;
        visibility = tileVisibility;
        surfaceGroundTiles = new Tile[4][width][length];
        surfaceTileHeights = new int[4][width + 1][length + 1];
        if (GlRenderer.enabled) {
            surfaceHdTiles = new GlTile[4][];
        }
        if (hasUnderWaterMap) {
            underWaterGroundTiles = new Tile[1][width][length];
            anIntArrayArray11 = new int[width][length];
            underwaterTileHeights = new int[1][width + 1][length + 1];
            if (GlRenderer.enabled) {
                underWaterHdTiles = new GlTile[1][];
            }
        } else {
            underWaterGroundTiles = null;
            anIntArrayArray11 = null;
            underwaterTileHeights = null;
            underWaterHdTiles = null;
        }
        setUnderwater(false);
        aClass120Array1 = new SceneGraph_Class120[500];
        anInt917 = 0;
        aClass120Array2 = new SceneGraph_Class120[500];
        anInt4870 = 0;
        anIntArrayArrayArray12 = new int[4][width + 1][length + 1];
        scenery = new Scenery[5000];
        sceneryLen = 0;
        aClass31Array2 = new Scenery[100];
        aBooleanArrayArray1 = new boolean[visibility + visibility + 1][visibility + visibility + 1];
        aBooleanArrayArray3 = new boolean[visibility + visibility + 2][visibility + visibility + 2];
        aByteArrayArrayArray13 = new byte[4][width][length];
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)J")
	public static long getWallKey(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[level][x][z];
		return tile == null || tile.wall == null ? 0L : tile.wall.key;
	}

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)J")
	public static long getWallDecorKey(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[level][x][z];
		return tile == null || tile.wallDecor == null ? 0L : tile.wallDecor.key;
	}

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)J")
    public static long getSceneryKey(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
        @Pc(7) Tile tile = tiles[level][x][z];
        if (tile == null) {
            return 0L;
        }
        for (@Pc(13) int i = 0; i < tile.sceneryLen; i++) {
            @Pc(22) Scenery scenery = tile.scenery[i];
            if ((scenery.key >> 29 & 0x3L) == 2L && scenery.xMin == x && scenery.zMin == z) {
                return scenery.key;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)Lclient!df;")
    public static WallDecor removeWallDecor(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
        @Pc(7) Tile tile = tiles[level][x][z];
        if (tile == null) {
            return null;
        } else {
            @Pc(14) WallDecor wallDecor = tile.wallDecor;
            tile.wallDecor = null;
            return wallDecor;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)Lclient!ec;")
	public static Scenery removeScenery(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[level][x][z];
		if (tile == null) {
			return null;
		}
		for (@Pc(13) int i = 0; i < tile.sceneryLen; i++) {
			@Pc(22) Scenery scenery = tile.scenery[i];
			if ((scenery.key >> 29 & 0x3L) == 2L && scenery.xMin == x && scenery.zMin == z) {
				removeScenery(scenery);
				return scenery;
			}
		}
		return null;
	}

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)Lclient!bm;")
    public static GroundDecor removeGroundDecor(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
        @Pc(7) Tile tile = tiles[level][x][z];
        if (tile == null) {
            return null;
        } else {
            @Pc(14) GroundDecor groundDecor = tile.groundDecor;
            tile.groundDecor = null;
            return groundDecor;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!ec;)V")
    public static void removeScenery(@OriginalArg(0) Scenery scenery) {
        for (@Pc(2) int x = scenery.xMin; x <= scenery.xMax; x++) {
            for (@Pc(9) int z = scenery.zMin; z <= scenery.zMax; z++) {
                @Pc(22) Tile tile = tiles[scenery.level][x][z];
                if (tile != null) {
                    @Pc(26) int i;
                    for (i = 0; i < tile.sceneryLen; i++) {
                        if (tile.scenery[i] == scenery) {
                            tile.sceneryLen--;
                            for (@Pc(44) int j = i; j < tile.sceneryLen; j++) {
                                tile.scenery[j] = tile.scenery[j + 1];
                                tile.interiorFlags[j] = tile.interiorFlags[j + 1];
                            }
                            tile.scenery[tile.sceneryLen] = null;
                            break;
                        }
                    }
                    tile.allInteriorFlags = 0;
                    for (i = 0; i < tile.sceneryLen; i++) {
                        tile.allInteriorFlags |= tile.interiorFlags[i];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([Lclient!mj;ZI)V")
	public static void method1169(@OriginalArg(0) CollisionMap[] collisionMaps, @OriginalArg(1) boolean underwater) {
		@Pc(10) int level;
		@Pc(15) int x;
		if (!underwater) {
			for (level = 0; level < 4; level++) {
				for (x = 0; x < 104; x++) {
					for (@Pc(22) int z = 0; z < 104; z++) {
						if ((tileFlags[level][x][z] & 0x1) == 1) {
							@Pc(43) int transformedLevel = level;
							if ((tileFlags[1][x][z] & 0x2) == 2) {
								transformedLevel = level - 1;
							}
							if (transformedLevel >= 0) {
								collisionMaps[transformedLevel].flagTile(z, x);
							}
						}
					}
				}
			}
			anInt4272 += (int) (Math.random() * 5.0D) - 2;
			if (anInt4272 < -16) {
				anInt4272 = -16;
			}
			if (anInt4272 > 16) {
				anInt4272 = 16;
			}
			anInt2293 += (int) (Math.random() * 5.0D) - 2;
			if (anInt2293 < -8) {
				anInt2293 = -8;
			}
			if (anInt2293 > 8) {
				anInt2293 = 8;
			}
		}
		@Pc(128) byte levels;
		if (underwater) {
			levels = 1;
		} else {
			levels = 4;
		}
		level = anInt2293 >> 2 << 10;
		@Pc(142) int[][] local142 = new int[104][104];
		@Pc(146) int[][] local146 = new int[104][104];
		x = anInt4272 >> 1;
		@Pc(152) int local152;
		@Pc(168) int local168;
		@Pc(173) int local173;
		@Pc(178) int local178;
		@Pc(194) int overlay;
		@Pc(200) int local200;
		@Pc(202) int local202;
		@Pc(209) int local209;
		@Pc(349) int local349;
		@Pc(234) int local234;
		@Pc(254) int local254;
		@Pc(267) int local267;
		for (local152 = 0; local152 < levels; local152++) {
			@Pc(159) byte[][] local159 = aByteArrayArrayArray9[local152];
			@Pc(273) int local273;
			@Pc(326) int local326;
			@Pc(332) int local332;
			@Pc(322) int local322;
			if (!GlRenderer.enabled) {
				local168 = (int) Math.sqrt(5100.0D);
				local173 = local168 * 768 >> 8;
				for (local178 = 1; local178 < 103; local178++) {
					for (overlay = 1; overlay < 103; overlay++) {
						local209 = tileHeights[local152][overlay][local178 + 1] - tileHeights[local152][overlay][local178 - 1];
						local202 = tileHeights[local152][overlay + 1][local178] - tileHeights[local152][overlay - 1][local178];
						local349 = (int) Math.sqrt((double) (local202 * local202 + local209 * local209 + 65536));
						local267 = (local209 << 8) / local349;
						local254 = -65536 / local349;
						local234 = (local202 << 8) / local349;
						local273 = (local159[overlay][local178] >> 1) + (local159[overlay][local178 - 1] >> 2) + (local159[overlay - -1][local178] >> 3) + (local159[overlay - 1][local178] >> 2) + (local159[overlay][local178 + 1] >> 3);
						local200 = (local267 * -50 + local234 * -50 + local254 * -10) / local173 + 74;
						local146[overlay][local178] = local200 - local273;
					}
				}
			} else if (Preferences.highDetailLighting) {
				for (local168 = 1; local168 < 103; local168++) {
					for (local173 = 1; local173 < 103; local173++) {
						overlay = (local159[local173 + 1][local168] >> 3) + (local159[local173 - 1][local168] >> 2) + (local159[local173][local168 + -1] >> 2) + (local159[local173][local168 + 1] >> 3) + (local159[local173][local168] >> 1);
						local146[local173][local168] = 74 - overlay;
					}
				}
			} else {
				local168 = (int) FogManager.aFloatArray18[0];
				local173 = (int) FogManager.aFloatArray18[1];
				local178 = (int) FogManager.aFloatArray18[2];
				overlay = (int) Math.sqrt((double) (local173 * local173 + local168 * local168 + local178 * local178));
				local200 = overlay * 1024 >> 8;
				for (local202 = 1; local202 < 103; local202++) {
					for (local209 = 1; local209 < 103; local209++) {
						local234 = tileHeights[local152][local209 + 1][local202] - tileHeights[local152][local209 - 1][local202];
						local254 = tileHeights[local152][local209][local202 + 1] - tileHeights[local152][local209][local202 - 1];
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
                rowWeightedHue[local168] = 0;
                rowSaturation[local168] = 0;
                rowLightness[local168] = 0;
                rowChroma[local168] = 0;
                rowCount[local168] = 0;
			}
			for (local168 = -5; local168 < 104; local168++) {
				for (local173 = 0; local173 < 104; local173++) {
					local178 = local168 + 5;
					@Pc(729) int local729;
					if (local178 < 104) {
						overlay = tileUnderlays[local152][local178][local173] & 0xFF;
						if (overlay > 0) {
							@Pc(693) FluType type = FluTypeList.get(overlay - 1);
							rowWeightedHue[local173] += type.weightedHue;
							rowSaturation[local173] += type.saturation;
							rowLightness[local173] += type.lightness;
							rowChroma[local173] += type.chroma;
							local729 = rowCount[local173]++;
						}
					}
					overlay = local168 - 5;
					if (overlay >= 0) {
						local200 = tileUnderlays[local152][overlay][local173] & 0xFF;
						if (local200 > 0) {
							@Pc(758) FluType local758 = FluTypeList.get(local200 - 1);
							rowWeightedHue[local173] -= local758.weightedHue;
							rowSaturation[local173] -= local758.saturation;
							rowLightness[local173] -= local758.lightness;
							rowChroma[local173] -= local758.chroma;
							local729 = rowCount[local173]--;
						}
					}
				}
				if (local168 >= 0) {
					local173 = 0;
					overlay = 0;
					local178 = 0;
					local200 = 0;
					local202 = 0;
					for (local209 = -5; local209 < 104; local209++) {
						local349 = local209 + 5;
						if (local349 < 104) {
							local178 += rowSaturation[local349];
							local202 += rowCount[local349];
							local173 += rowWeightedHue[local349];
							local200 += rowChroma[local349];
							overlay += rowLightness[local349];
						}
						local234 = local209 - 5;
						if (local234 >= 0) {
							local178 -= rowSaturation[local234];
							local200 -= rowChroma[local234];
							local173 -= rowWeightedHue[local234];
							local202 -= rowCount[local234];
							overlay -= rowLightness[local234];
						}
						if (local209 >= 0 && local202 > 0) {
							local142[local168][local209] = Static54.method1309(overlay / local202, local178 / local202, local173 * 256 / local200);
						}
					}
				}
			}
			for (local168 = 1; local168 < 103; local168++) {
				label771: for (local173 = 1; local173 < 103; local173++) {
					if (underwater || allLevelsAreVisible() || (tileFlags[0][local168][local173] & 0x2) != 0 || (tileFlags[local152][local168][local173] & 0x10) == 0 && Static4.method22(local173, local168, local152) == LoginManager.centralPlane) {
						if (firstVisibleLevel > local152) {
							firstVisibleLevel = local152;
						}
						local178 = tileUnderlays[local152][local168][local173] & 0xFF;
						overlay = tileOverlays[local152][local168][local173] & 0xFF;
						if (local178 > 0 || overlay > 0) {
							local202 = tileHeights[local152][local168 + 1][local173];
							local200 = tileHeights[local152][local168][local173];
							local349 = tileHeights[local152][local168][local173 + 1];
							local209 = tileHeights[local152][local168 + 1][local173 + 1];
							if (local152 > 0) {
								@Pc(1067) boolean local1067 = true;
								if (local178 == 0 && tileShapes[local152][local168][local173] != 0) {
									local1067 = false;
								}
								if (overlay > 0 && !FloTypeList.method4395(overlay - 1).aBoolean312) {
									local1067 = false;
								}
								if (local1067 && local200 == local202 && local200 == local209 && local349 == local200) {
									anIntArrayArrayArray6[local152][local168][local173] |= 0x4;
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
								local254 = Rasteriser.palette[ColorUtils.multiplyLightnessSafe(96, local273)];
							}
							local267 = local146[local168][local173];
							local332 = local146[local168][local173 + 1];
							local273 = local146[local168 + 1][local173];
							local326 = local146[local168 + 1][local173 + 1];
							if (overlay == 0) {
								setTile(local152, local168, local173, 0, 0, -1, local200, local202, local209, local349, ColorUtils.multiplyLightnessSafe(local267, local234), ColorUtils.multiplyLightnessSafe(local273, local234), ColorUtils.multiplyLightnessSafe(local326, local234), ColorUtils.multiplyLightnessSafe(local332, local234), 0, 0, 0, 0, local254, 0);
								if (GlRenderer.enabled && local152 > 0 && local234 != -1 && FluTypeList.get(local178 - 1).aBoolean198) {
									Static242.method4197(0, 0, true, false, local168, local173, local200 - tileHeights[0][local168][local173], -tileHeights[0][local168 + 1][local173] + local202, local209 - tileHeights[0][local168 + 1][local173 + 1], local349 - tileHeights[0][local168][local173 + 1]);
								}
								if (GlRenderer.enabled && !underwater && anIntArrayArray11 != null && local152 == 0) {
									for (local322 = local168 - 1; local322 <= local168 + 1; local322++) {
										for (@Pc(1794) int local1794 = local173 - 1; local1794 <= local173 + 1; local1794++) {
											if ((local322 != local168 || local173 != local1794) && local322 >= 0 && local322 < 104 && local1794 >= 0 && local1794 < 104) {
												@Pc(1834) int local1834 = tileOverlays[local152][local322][local1794] & 0xFF;
												if (local1834 != 0) {
													@Pc(1842) FloType local1842 = FloTypeList.method4395(local1834 - 1);
													if (local1842.texture != -1 && Rasteriser.textureProvider.getMaterialType(local1842.texture) == MaterialManager.WATER) {
														anIntArrayArray11[local168][local173] = local1842.anInt5889 + (local1842.anInt5898 << 24);
														continue label771;
													}
												}
											}
										}
									}
								}
							} else {
								local322 = tileShapes[local152][local168][local173] + 1;
								@Pc(1242) byte local1242 = tileAngles[local152][local168][local173];
								@Pc(1248) FloType local1248 = FloTypeList.method4395(overlay - 1);
								@Pc(1301) int local1301;
								@Pc(1353) int local1353;
								@Pc(1288) int texture;
								if (GlRenderer.enabled && !underwater && anIntArrayArray11 != null && local152 == 0) {
									if (local1248.texture != -1 && Rasteriser.textureProvider.getMaterialType(local1248.texture) == MaterialManager.WATER) {
										anIntArrayArray11[local168][local173] = (local1248.anInt5898 << 24) + local1248.anInt5889;
									} else {
										label737: for (texture = local168 - 1; texture <= local168 + 1; texture++) {
											for (local1301 = local173 - 1; local1301 <= local173 + 1; local1301++) {
												if ((local168 != texture || local1301 != local173) && texture >= 0 && texture < 104 && local1301 >= 0 && local1301 < 104) {
													local1353 = tileOverlays[local152][texture][local1301] & 0xFF;
													if (local1353 != 0) {
														@Pc(1366) FloType local1366 = FloTypeList.method4395(local1353 - 1);
														if (local1366.texture != -1 && Rasteriser.textureProvider.getMaterialType(local1366.texture) == MaterialManager.WATER) {
															anIntArrayArray11[local168][local173] = local1366.anInt5889 + (local1366.anInt5898 << 24);
															break label737;
														}
													}
												}
											}
										}
									}
								}
								texture = local1248.texture;
								if (texture >= 0 && !Rasteriser.textureProvider.method3236(texture)) {
									texture = -1;
								}
								@Pc(1458) int local1458;
								@Pc(1429) int local1429;
								if (texture >= 0) {
									local1301 = -1;
									local1353 = Rasteriser.palette[ColorUtils.multiplyLightnessGrayscale(Rasteriser.textureProvider.getAverageColor(texture), 96)];
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
									local1353 = Rasteriser.palette[ColorUtils.multiplyLightnessGrayscale(local1458, 96)];
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
									local1353 = Rasteriser.palette[ColorUtils.multiplyLightnessGrayscale(local1529, 96)];
								}
								setTile(local152, local168, local173, local322, local1242, texture, local200, local202, local209, local349, ColorUtils.multiplyLightnessSafe(local267, local234), ColorUtils.multiplyLightnessSafe(local273, local234), ColorUtils.multiplyLightnessSafe(local326, local234), ColorUtils.multiplyLightnessSafe(local332, local234), ColorUtils.multiplyLightnessGrayscale(local1301, local267), ColorUtils.multiplyLightnessGrayscale(local1301, local273), ColorUtils.multiplyLightnessGrayscale(local1301, local326), ColorUtils.multiplyLightnessGrayscale(local1301, local332), local254, local1353);
								if (GlRenderer.enabled && local152 > 0) {
									Static242.method4197(local322, local1242, local1301 == -2 || !local1248.aBoolean311, local234 == -1 || !FluTypeList.get(local178 - 1).aBoolean198, local168, local173, local200 - tileHeights[0][local168][local173], local202 - tileHeights[0][local168 + 1][local173], local209 - tileHeights[0][local168 + 1][local173 + 1], -tileHeights[0][local168][local173 + 1] + local349);
								}
							}
						}
					}
				}
			}
			if (GlRenderer.enabled) {
				@Pc(1888) float[][] local1888 = new float[105][105];
				@Pc(1892) int[][] local1892 = tileHeights[local152];
				@Pc(1896) float[][] local1896 = new float[105][105];
				@Pc(1900) float[][] local1900 = new float[105][105];
				local200 = 1;
				while (true) {
					if (local200 > 103) {
						@Pc(2025) GlTile[] local2025;
						if (underwater) {
							local2025 = Static193.method3501(tileFlags, tileShapes[local152], tileUnderlays[local152], local146, local1896, anIntArrayArray11, tileOverlays[local152], tileAngles[local152], local1888, local152, local1900, local142, tileHeights[local152], surfaceTileHeights[0]);
							method2280(local152, local2025);
							break;
						}
						local2025 = Static193.method3501(tileFlags, tileShapes[local152], tileUnderlays[local152], local146, local1896, null, tileOverlays[local152], tileAngles[local152], local1888, local152, local1900, local142, tileHeights[local152], null);
						@Pc(2049) GlTile[] local2049 = Static1.method2(local1896, local1888, tileHeights[local152], local152, local1900, tileAngles[local152], local146, tileShapes[local152], tileUnderlays[local152], tileOverlays[local152], tileFlags);
						@Pc(2057) GlTile[] local2057 = new GlTile[local2025.length + local2049.length];
						for (local349 = 0; local349 < local2025.length; local349++) {
							local2057[local349] = local2025[local349];
						}
						for (local349 = 0; local349 < local2049.length; local349++) {
							local2057[local2025.length + local349] = local2049[local349];
						}
						method2280(local152, local2057);
						Static221.method3393(local1900, tileUnderlays[local152], tileAngles[local152], LightingManager.lights, local152, LightingManager.lightCount, local1896, tileShapes[local152], tileOverlays[local152], tileHeights[local152], local1888);
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
			tileUnderlays[local152] = null;
			tileOverlays[local152] = null;
			tileShapes[local152] = null;
			tileAngles[local152] = null;
			aByteArrayArrayArray9[local152] = null;
		}
		method3801();
		if (underwater) {
			return;
		}
		@Pc(2204) int local2204;
		for (local152 = 0; local152 < 104; local152++) {
			for (local2204 = 0; local2204 < 104; local2204++) {
				if ((tileFlags[1][local152][local2204] & 0x2) == 2) {
					Static224.method3884(local152, local2204);
				}
			}
		}
		for (local152 = 0; local152 < 4; local152++) {
			for (local2204 = 0; local2204 <= 104; local2204++) {
				for (local168 = 0; local168 <= 104; local168++) {
					if ((anIntArrayArrayArray6[local152][local168][local2204] & 0x1) != 0) {
						local200 = local152;
						for (local173 = local2204; local173 > 0 && (anIntArrayArrayArray6[local152][local168][local173 - 1] & 0x1) != 0; local173--) {
						}
						overlay = local152;
						for (local178 = local2204; local178 < 104 && (anIntArrayArrayArray6[local152][local168][local178 + 1] & 0x1) != 0; local178++) {
						}
						label454: while (overlay > 0) {
							for (local202 = local173; local202 <= local178; local202++) {
								if ((anIntArrayArrayArray6[overlay - 1][local168][local202] & 0x1) == 0) {
									break label454;
								}
							}
							overlay--;
						}
						label443: while (local200 < 3) {
							for (local202 = local173; local202 <= local178; local202++) {
								if ((anIntArrayArrayArray6[local200 + 1][local168][local202] & 0x1) == 0) {
									break label443;
								}
							}
							local200++;
						}
						local202 = (local200 + 1 - overlay) * (-local173 + (local178 - -1));
						if (local202 >= 8) {
							local349 = tileHeights[local200][local168][local173] - 240;
							local234 = tileHeights[overlay][local168][local173];
							SceneGraph_Class120.method4647(1, local168 * 128, local168 * 128, local173 * 128, local178 * 128 + 128, local349, local234);
							for (local254 = overlay; local254 <= local200; local254++) {
								for (local267 = local173; local267 <= local178; local267++) {
									anIntArrayArrayArray6[local254][local168][local267] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((anIntArrayArrayArray6[local152][local168][local2204] & 0x2) != 0) {
						for (local173 = local168; local173 > 0 && (anIntArrayArrayArray6[local152][local173 - 1][local2204] & 0x2) != 0; local173--) {
						}
						local200 = local152;
						overlay = local152;
						for (local178 = local168; local178 < 104 && (anIntArrayArrayArray6[local152][local178 + 1][local2204] & 0x2) != 0; local178++) {
						}
						label508: while (overlay > 0) {
							for (local202 = local173; local202 <= local178; local202++) {
								if ((anIntArrayArrayArray6[overlay - 1][local202][local2204] & 0x2) == 0) {
									break label508;
								}
							}
							overlay--;
						}
						label497: while (local200 < 3) {
							for (local202 = local173; local202 <= local178; local202++) {
								if ((anIntArrayArrayArray6[local200 + 1][local202][local2204] & 0x2) == 0) {
									break label497;
								}
							}
							local200++;
						}
						local202 = (local178 + 1 - local173) * (-overlay + local200 - -1);
						if (local202 >= 8) {
							local349 = tileHeights[local200][local173][local2204] - 240;
							local234 = tileHeights[overlay][local173][local2204];
							SceneGraph_Class120.method4647(2, local173 * 128, local178 * 128 + 128, local2204 * 128, local2204 * 128, local349, local234);
							for (local254 = overlay; local254 <= local200; local254++) {
								for (local267 = local173; local267 <= local178; local267++) {
									anIntArrayArrayArray6[local254][local267][local2204] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((anIntArrayArrayArray6[local152][local168][local2204] & 0x4) != 0) {
						local173 = local168;
						local178 = local168;
						for (overlay = local2204; overlay > 0 && (anIntArrayArrayArray6[local152][local168][overlay - 1] & 0x4) != 0; overlay--) {
						}
						for (local200 = local2204; local200 < 104 && (anIntArrayArrayArray6[local152][local168][local200 + 1] & 0x4) != 0; local200++) {
						}
						label562: while (local173 > 0) {
							for (local202 = overlay; local202 <= local200; local202++) {
								if ((anIntArrayArrayArray6[local152][local173 - 1][local202] & 0x4) == 0) {
									break label562;
								}
							}
							local173--;
						}
						label551: while (local178 < 104) {
							for (local202 = overlay; local202 <= local200; local202++) {
								if ((anIntArrayArrayArray6[local152][local178 + 1][local202] & 0x4) == 0) {
									break label551;
								}
							}
							local178++;
						}
						if ((local178 + 1 - local173) * (local200 - (overlay - 1)) >= 4) {
							local202 = tileHeights[local152][local173][overlay];
							SceneGraph_Class120.method4647(4, local173 * 128, local178 * 128 + 128, overlay * 128, local200 * 128 + 128, local202, local202);
							for (local209 = local173; local209 <= local178; local209++) {
								for (local349 = overlay; local349 <= local200; local349++) {
									anIntArrayArrayArray6[local152][local209][local349] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[Lclient!hg;)V")
    public static void method2280(@OriginalArg(0) int arg0, @OriginalArg(1) GlTile[] arg1) {
        underwaterHdTiles[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static void setTile(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
        @Pc(12) PlainTile local12;
        @Pc(14) int local14;
        if (arg3 == 0) {
            local12 = new PlainTile(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (local14 = arg0; local14 >= 0; local14--) {
                if (tiles[local14][arg1][arg2] == null) {
                    tiles[local14][arg1][arg2] = new Tile(local14, arg1, arg2);
                }
            }
            tiles[arg0][arg1][arg2].plainTile = local12;
        } else if (arg3 == 1) {
            local12 = new PlainTile(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (local14 = arg0; local14 >= 0; local14--) {
                if (tiles[local14][arg1][arg2] == null) {
                    tiles[local14][arg1][arg2] = new Tile(local14, arg1, arg2);
                }
            }
            tiles[arg0][arg1][arg2].plainTile = local12;
        } else {
            @Pc(134) ShapedTile local134 = new ShapedTile(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (local14 = arg0; local14 >= 0; local14--) {
                if (tiles[local14][arg1][arg2] == null) {
                    tiles[local14][arg1][arg2] = new Tile(local14, arg1, arg2);
                }
            }
            tiles[arg0][arg1][arg2].shapedTile = local134;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V")
    public static void method3801() {
        for (@Pc(1) int level = 0; level < levels; level++) {
            for (@Pc(6) int x = 0; x < width; x++) {
                for (@Pc(11) int z = 0; z < length; z++) {
                    @Pc(22) Tile local22 = tiles[level][x][z];
                    if (local22 != null) {
                        @Pc(27) Wall local27 = local22.wall;
                        if (local27 != null && local27.primary.method4543()) {
                            Static69.method1544(local27.primary, level, x, z, 1, 1);
                            if (local27.secondary != null && local27.secondary.method4543()) {
                                Static69.method1544(local27.secondary, level, x, z, 1, 1);
                                local27.primary.method4544(local27.secondary, 0, 0, 0, false);
                                local27.secondary = local27.secondary.createModel();
                            }
                            local27.primary = local27.primary.createModel();
                        }
                        for (@Pc(83) int local83 = 0; local83 < local22.sceneryLen; local83++) {
                            @Pc(92) Scenery local92 = local22.scenery[local83];
                            if (local92 != null && local92.entity.method4543()) {
                                Static69.method1544(local92.entity, level, x, z, local92.xMax + 1 - local92.xMin, local92.zMax - local92.zMin + 1);
                                local92.entity = local92.entity.createModel();
                            }
                        }
                        @Pc(131) GroundDecor local131 = local22.groundDecor;
                        if (local131 != null && local131.entity.method4543()) {
                            Static264.method3574(local131.entity, level, x, z);
                            local131.entity = local131.entity.createModel();
                        }
                    }
                }
            }
        }
    }
}
