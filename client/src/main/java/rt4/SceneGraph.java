package rt4;

import com.jogamp.opengl.GL2;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class SceneGraph {

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "[[[B")
	public static final byte[][][] renderFlags = new byte[4][104][104];
	@OriginalMember(owner = "client!mi", name = "Y", descriptor = "[[[Lclient!ih;")
	public static final LinkedList[][][] objStacks = new LinkedList[4][104][104];
	@OriginalMember(owner = "client!te", name = "B", descriptor = "[I")
	public static final int[] WALL_DECO_ROT_SIZE_Y_DIR = new int[]{0, -1, 0, 1};
	@OriginalMember(owner = "client!fb", name = "q", descriptor = "[I")
	public static final int[] anIntArray154 = new int[]{-1, -1, 1, 1};
	@OriginalMember(owner = "client!j", name = "O", descriptor = "[I")
	public static final int[] anIntArray565 = new int[]{1, -1, -1, 1};
	@OriginalMember(owner = "client!vl", name = "e", descriptor = "[I")
	public static final int[] WALL_ROTATION_TYPE1 = new int[]{1, 2, 4, 8};
	@OriginalMember(owner = "client!pg", name = "T", descriptor = "[I")
	public static final int[] anIntArray386 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
	@OriginalMember(owner = "client!rj", name = "U", descriptor = "Lclient!ih;")
	public static final LinkedList projectiles = new LinkedList();
	@OriginalMember(owner = "client!hk", name = "W", descriptor = "Lclient!ih;")
	public static final LinkedList spotanims = new LinkedList();
	@OriginalMember(owner = "client!ec", name = "B", descriptor = "[[I")
	public static final int[][] anIntArrayArray8 = new int[][]{new int[0], {128, 0, 128, 128, 0, 128}, {0, 0, 128, 0, 128, 128, 64, 128}, {0, 128, 0, 0, 128, 0, 64, 128}, {0, 0, 64, 128, 0, 128}, {128, 128, 64, 128, 128, 0}, {64, 0, 128, 0, 128, 128, 64, 128}, {128, 0, 128, 128, 0, 128, 0, 64, 64, 0}, {0, 0, 64, 0, 0, 64}, {0, 0, 128, 0, 128, 128, 64, 96, 32, 64}, {0, 128, 0, 0, 32, 64, 64, 96, 128, 128}, {0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128}};
	@OriginalMember(owner = "client!ck", name = "d", descriptor = "[I")
	public static final int[] WALL_DECO_ROT_SIZE_X_DIR = new int[]{1, 0, -1, 0};
	@OriginalMember(owner = "client!ka", name = "t", descriptor = "[I")
	public static final int[] anIntArray294 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
	@OriginalMember(owner = "client!uj", name = "A", descriptor = "[I")
	public static final int[] anIntArray489 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
	@OriginalMember(owner = "client!gm", name = "gb", descriptor = "[I")
	public static final int[] anIntArray211 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
	@OriginalMember(owner = "client!kd", name = "sb", descriptor = "[I")
	public static final int[] anIntArray307 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
	@OriginalMember(owner = "client!hb", name = "t", descriptor = "[I")
	public static final int[] anIntArray215 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
	@OriginalMember(owner = "client!km", name = "Rc", descriptor = "[I")
	public static final int[] anIntArray324 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
	@OriginalMember(owner = "client!fh", name = "U", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][]{new boolean[0], {true, false, true}, {true, false, false, true}, {false, false, true, true}, {true, true, false}, {false, true, true}, {true, false, false, true}, {false, false, false, true, true}, {false, true, true}, {true, false, true, true, true}, {false, true, true, true, true}, {false, true, true, true, true, false}};
	@OriginalMember(owner = "client!fg", name = "d", descriptor = "[I")
	public static final int[] anIntArray159 = new int[6];
	@OriginalMember(owner = "client!fg", name = "l", descriptor = "[I")
	public static final int[] anIntArray164 = new int[6];
	@OriginalMember(owner = "client!fg", name = "m", descriptor = "[I")
	public static final int[] anIntArray165 = new int[6];
	@OriginalMember(owner = "client!fg", name = "r", descriptor = "[I")
	public static final int[] anIntArray169 = new int[6];
	@OriginalMember(owner = "client!fg", name = "t", descriptor = "[I")
	public static final int[] anIntArray170 = new int[6];
	@OriginalMember(owner = "client!ah", name = "p", descriptor = "Lclient!ih;")
	public static final LinkedList aClass69_32 = new LinkedList();
	@OriginalMember(owner = "client!sh", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray35 = new int[][]{{0, 128, 0, 0, 128, 0, 128, 128}, {0, 128, 0, 0, 128, 0}, {0, 0, 64, 128, 0, 128}, {128, 128, 64, 128, 128, 0}, {0, 0, 128, 0, 128, 128, 64, 128}, {0, 128, 0, 0, 128, 0, 64, 128}, {64, 128, 0, 128, 0, 0, 64, 0}, {0, 0, 64, 0, 0, 64}, {128, 0, 128, 128, 0, 128, 0, 64, 64, 0}, {0, 128, 0, 0, 32, 64, 64, 96, 128, 128}, {0, 0, 128, 0, 128, 128, 64, 96, 32, 64}, {0, 0, 128, 0, 96, 32, 32, 32}};
	@OriginalMember(owner = "client!gf", name = "S", descriptor = "[I")
	public static final int[] anIntArray419 = new int[]{0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1};
	@OriginalMember(owner = "client!kc", name = "s", descriptor = "[I")
	public static final int[] anIntArray300 = new int[]{1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5};
	@OriginalMember(owner = "client!wi", name = "hb", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][]{{true, true, true}, {false, false}, {false, true}, {true, false}, {false, true, true}, {true, false, true}, {false, true, false}, {true, false, false}};
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
	public static int[][][] occludeFlags;
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
	public static byte[][][] shadowmap;
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
	@OriginalMember(owner = "client!rj", name = "R", descriptor = "I")
	public static int anInt4903;
	@OriginalMember(owner = "client!pi", name = "U", descriptor = "I")
	public static int anInt4539;
	@OriginalMember(owner = "client!sk", name = "mb", descriptor = "I")
	public static int anInt5205;
	@OriginalMember(owner = "client!bl", name = "X", descriptor = "I")
	public static int anInt730 = -1;
	@OriginalMember(owner = "client!aj", name = "Z", descriptor = "[I")
	public static int[] anIntArray8;
	@OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
	public static int anInt3038;
	@OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
	public static int anInt3604 = -1;
	@OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
	public static int anInt2886;
	@OriginalMember(owner = "client!k", name = "l", descriptor = "[I")
	public static int[] anIntArray292;
	@OriginalMember(owner = "client!ta", name = "o", descriptor = "[I")
	public static int[] anIntArray454;
	@OriginalMember(owner = "client!qk", name = "c", descriptor = "[I")
	public static int[] anIntArray427;
	@OriginalMember(owner = "client!hh", name = "p", descriptor = "[I")
	public static int[] anIntArray234;
	@OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
	public static int anInt3947;
	@OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
	public static int anInt4069;
	@OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
	public static int anInt3555;
	@OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
	public static int anInt5276 = 0;
	@OriginalMember(owner = "client!bc", name = "Z", descriptor = "I")
	public static int anInt437;
	@OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
	public static int anInt1142 = 0;
	@OriginalMember(owner = "client!gn", name = "d", descriptor = "Z")
	public static boolean aBoolean130 = false;
	@OriginalMember(owner = "client!gg", name = "Z", descriptor = "I")
	public static int anInt2222;
	@OriginalMember(owner = "client!sj", name = "u", descriptor = "Z")
	public static boolean dynamicMapRegion = false;
	@OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
	public static int centralZoneX;
	@OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
	public static int centralZoneZ;
	@OriginalMember(owner = "client!dc", name = "ab", descriptor = "I")
	public static int centralPlane = 0;

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
		if (level < 3 && (renderFlags[1][x][z] & 0x2) == 2) {
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
		occludeFlags = new int[plane][105][105];
		shadowmap = new byte[plane][105][105];
		tileOverlays = new byte[plane][104][104];
		rowLightness = new int[104];
		tileAngles = new byte[plane][104][104];
		tileUnderlays = new byte[plane][104][104];
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	public static void unload() {
		rowChroma = null;
		occludeFlags = null;
		rowCount = null;
		tileShapes = null;
		tileAngles = null;
		shadowmap = null;
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
			renderFlags[level][x][z] = 0;
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
				renderFlags[level][x][z] = (byte) (opcode - 49);
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
						if ((renderFlags[level][x][z] & 0x1) == 1) {
							@Pc(43) int transformedLevel = level;
							if ((renderFlags[1][x][z] & 0x2) == 2) {
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
			@Pc(159) byte[][] local159 = shadowmap[local152];
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
						local349 = (int) Math.sqrt(local202 * local202 + local209 * local209 + 65536);
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
				local168 = (int) FogManager.light0Position[0];
				local173 = (int) FogManager.light0Position[1];
				local178 = (int) FogManager.light0Position[2];
				overlay = (int) Math.sqrt(local173 * local173 + local168 * local168 + local178 * local178);
				local200 = overlay * 1024 >> 8;
				for (local202 = 1; local202 < 103; local202++) {
					for (local209 = 1; local209 < 103; local209++) {
						local234 = tileHeights[local152][local209 + 1][local202] - tileHeights[local152][local209 - 1][local202];
						local254 = tileHeights[local152][local209][local202 + 1] - tileHeights[local152][local209][local202 - 1];
						local267 = (int) Math.sqrt(local234 * local234 + local254 * local254 + 65536);
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
							local142[local168][local209] = ColorUtils.method1309(overlay / local202, local178 / local202, local173 * 256 / local200);
						}
					}
				}
			}
			for (local168 = 1; local168 < 103; local168++) {
				label771:
				for (local173 = 1; local173 < 103; local173++) {
					if (underwater || allLevelsAreVisible() || (renderFlags[0][local168][local173] & 0x2) != 0 || (renderFlags[local152][local168][local173] & 0x10) == 0 && getRenderLevel(local173, local168, local152) == centralPlane) {
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
								@Pc(1067) boolean local1067 = local178 != 0 || tileShapes[local152][local168][local173] == 0;
								if (overlay > 0 && !FloTypeList.method4395(overlay - 1).occludeUnderlay) {
									local1067 = false;
								}
								if (local1067 && local200 == local202 && local200 == local209 && local349 == local200) {
									occludeFlags[local152][local168][local173] |= 0x4;
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
								if (GlRenderer.enabled && local152 > 0 && local234 != -1 && FluTypeList.get(local178 - 1).blockShadow) {
									ShadowManager.method4197(0, 0, true, false, local168, local173, local200 - tileHeights[0][local168][local173], -tileHeights[0][local168 + 1][local173] + local202, local209 - tileHeights[0][local168 + 1][local173 + 1], local349 - tileHeights[0][local168][local173 + 1]);
								}
								if (GlRenderer.enabled && !underwater && anIntArrayArray11 != null && local152 == 0) {
									for (local322 = local168 - 1; local322 <= local168 + 1; local322++) {
										for (@Pc(1794) int local1794 = local173 - 1; local1794 <= local173 + 1; local1794++) {
											if ((local322 != local168 || local173 != local1794) && local322 >= 0 && local322 < 104 && local1794 >= 0 && local1794 < 104) {
												@Pc(1834) int local1834 = tileOverlays[local152][local322][local1794] & 0xFF;
												if (local1834 != 0) {
													@Pc(1842) FloType local1842 = FloTypeList.method4395(local1834 - 1);
													if (local1842.texture != -1 && Rasteriser.textureProvider.getMaterialType(local1842.texture) == MaterialManager.WATER) {
														anIntArrayArray11[local168][local173] = local1842.waterColor + (local1842.waterOpacity << 24);
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
										anIntArrayArray11[local168][local173] = (local1248.waterOpacity << 24) + local1248.waterColor;
									} else {
										label737:
										for (texture = local168 - 1; texture <= local168 + 1; texture++) {
											for (local1301 = local173 - 1; local1301 <= local173 + 1; local1301++) {
												if ((local168 != texture || local1301 != local173) && texture >= 0 && texture < 104 && local1301 >= 0 && local1301 < 104) {
													local1353 = tileOverlays[local152][texture][local1301] & 0xFF;
													if (local1353 != 0) {
														@Pc(1366) FloType local1366 = FloTypeList.method4395(local1353 - 1);
														if (local1366.texture != -1 && Rasteriser.textureProvider.getMaterialType(local1366.texture) == MaterialManager.WATER) {
															anIntArrayArray11[local168][local173] = local1366.waterColor + (local1366.waterOpacity << 24);
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
								} else if (local1248.baseColor == -1) {
									local1301 = -2;
									local1353 = 0;
								} else {
									local1301 = local1248.baseColor;
									local1429 = x + (local1301 & 0x7F);
									if (local1429 < 0) {
										local1429 = 0;
									} else if (local1429 > 127) {
										local1429 = 127;
									}
									local1458 = (local1301 & 0x380) + ((local1301 + level & 0xFC00) + local1429);
									local1353 = Rasteriser.palette[ColorUtils.multiplyLightnessGrayscale(local1458, 96)];
								}
								if (local1248.secondaryColor >= 0) {
									local1429 = local1248.secondaryColor;
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
									ShadowManager.method4197(local322, local1242, local1301 == -2 || !local1248.aBoolean311, local234 == -1 || !FluTypeList.get(local178 - 1).blockShadow, local168, local173, local200 - tileHeights[0][local168][local173], local202 - tileHeights[0][local168 + 1][local173], local209 - tileHeights[0][local168 + 1][local173 + 1], -tileHeights[0][local168][local173 + 1] + local349);
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
							local2025 = method3501(renderFlags, tileShapes[local152], tileUnderlays[local152], local146, local1896, anIntArrayArray11, tileOverlays[local152], tileAngles[local152], local1888, local152, local1900, local142, tileHeights[local152], surfaceTileHeights[0]);
							method2280(local152, local2025);
							break;
						}
						local2025 = method3501(renderFlags, tileShapes[local152], tileUnderlays[local152], local146, local1896, null, tileOverlays[local152], tileAngles[local152], local1888, local152, local1900, local142, tileHeights[local152], null);
						@Pc(2049) GlTile[] local2049 = method2(local1896, local1888, tileHeights[local152], local152, local1900, tileAngles[local152], local146, tileShapes[local152], tileUnderlays[local152], tileOverlays[local152], renderFlags);
						@Pc(2057) GlTile[] local2057 = new GlTile[local2025.length + local2049.length];
						for (local349 = 0; local349 < local2025.length; local349++) {
							local2057[local349] = local2025[local349];
						}
						for (local349 = 0; local349 < local2049.length; local349++) {
							local2057[local2025.length + local349] = local2049[local349];
						}
						method2280(local152, local2057);
						method3393(local1900, tileUnderlays[local152], tileAngles[local152], LightingManager.lights, local152, LightingManager.lightCount, local1896, tileShapes[local152], tileOverlays[local152], tileHeights[local152], local1888);
						break;
					}
					for (local202 = 1; local202 <= 103; local202++) {
						local349 = local1892[local202][local200 + 1] - local1892[local202][local200 - 1];
						local209 = local1892[local202 + 1][local200] - local1892[local202 - 1][local200];
						@Pc(1962) float local1962 = (float) Math.sqrt(local209 * local209 + local349 * local349 + 65536);
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
			shadowmap[local152] = null;
		}
		method3801();
		if (underwater) {
			return;
		}
		@Pc(2204) int local2204;
		for (local152 = 0; local152 < 104; local152++) {
			for (local2204 = 0; local2204 < 104; local2204++) {
				if ((renderFlags[1][local152][local2204] & 0x2) == 2) {
					method3884(local152, local2204);
				}
			}
		}
		for (local152 = 0; local152 < 4; local152++) {
			for (local2204 = 0; local2204 <= 104; local2204++) {
				for (local168 = 0; local168 <= 104; local168++) {
					if ((occludeFlags[local152][local168][local2204] & 0x1) != 0) {
						local200 = local152;
						for (local173 = local2204; local173 > 0 && (occludeFlags[local152][local168][local173 - 1] & 0x1) != 0; local173--) {
						}
						overlay = local152;
						for (local178 = local2204; local178 < 104 && (occludeFlags[local152][local168][local178 + 1] & 0x1) != 0; local178++) {
						}
						label454:
						while (overlay > 0) {
							for (local202 = local173; local202 <= local178; local202++) {
								if ((occludeFlags[overlay - 1][local168][local202] & 0x1) == 0) {
									break label454;
								}
							}
							overlay--;
						}
						label443:
						while (local200 < 3) {
							for (local202 = local173; local202 <= local178; local202++) {
								if ((occludeFlags[local200 + 1][local168][local202] & 0x1) == 0) {
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
									occludeFlags[local254][local168][local267] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((occludeFlags[local152][local168][local2204] & 0x2) != 0) {
						for (local173 = local168; local173 > 0 && (occludeFlags[local152][local173 - 1][local2204] & 0x2) != 0; local173--) {
						}
						local200 = local152;
						overlay = local152;
						for (local178 = local168; local178 < 104 && (occludeFlags[local152][local178 + 1][local2204] & 0x2) != 0; local178++) {
						}
						label508:
						while (overlay > 0) {
							for (local202 = local173; local202 <= local178; local202++) {
								if ((occludeFlags[overlay - 1][local202][local2204] & 0x2) == 0) {
									break label508;
								}
							}
							overlay--;
						}
						label497:
						while (local200 < 3) {
							for (local202 = local173; local202 <= local178; local202++) {
								if ((occludeFlags[local200 + 1][local202][local2204] & 0x2) == 0) {
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
									occludeFlags[local254][local267][local2204] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((occludeFlags[local152][local168][local2204] & 0x4) != 0) {
						local173 = local168;
						local178 = local168;
						for (overlay = local2204; overlay > 0 && (occludeFlags[local152][local168][overlay - 1] & 0x4) != 0; overlay--) {
						}
						for (local200 = local2204; local200 < 104 && (occludeFlags[local152][local168][local200 + 1] & 0x4) != 0; local200++) {
						}
						label562:
						while (local173 > 0) {
							for (local202 = overlay; local202 <= local200; local202++) {
								if ((occludeFlags[local152][local173 - 1][local202] & 0x4) == 0) {
									break label562;
								}
							}
							local173--;
						}
						label551:
						while (local178 < 104) {
							for (local202 = overlay; local202 <= local200; local202++) {
								if ((occludeFlags[local152][local178 + 1][local202] & 0x4) == 0) {
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
									occludeFlags[local152][local209][local349] &= 0xFFFFFFFB;
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
	public static void setTile(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) PlainTile tile;
		@Pc(14) int level0;
		if (arg3 == 0) {
			tile = new PlainTile(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (level0 = level; level0 >= 0; level0--) {
				if (tiles[level0][x][z] == null) {
					tiles[level0][x][z] = new Tile(level0, x, z);
				}
			}
			tiles[level][x][z].plainTile = tile;
		} else if (arg3 == 1) {
			tile = new PlainTile(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (level0 = level; level0 >= 0; level0--) {
				if (tiles[level0][x][z] == null) {
					tiles[level0][x][z] = new Tile(level0, x, z);
				}
			}
			tiles[level][x][z].plainTile = tile;
		} else {
			@Pc(134) ShapedTile local134 = new ShapedTile(arg3, arg4, arg5, x, z, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (level0 = level; level0 >= 0; level0--) {
				if (tiles[level0][x][z] == null) {
					tiles[level0][x][z] = new Tile(level0, x, z);
				}
			}
			tiles[level][x][z].shapedTile = local134;
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
							method1544(local27.primary, level, x, z, 1, 1);
							if (local27.secondary != null && local27.secondary.method4543()) {
								method1544(local27.secondary, level, x, z, 1, 1);
								local27.primary.method4544(local27.secondary, 0, 0, 0, false);
								local27.secondary = local27.secondary.createModel();
							}
							local27.primary = local27.primary.createModel();
						}
						for (@Pc(83) int local83 = 0; local83 < local22.sceneryLen; local83++) {
							@Pc(92) Scenery local92 = local22.scenery[local83];
							if (local92 != null && local92.entity.method4543()) {
								method1544(local92.entity, level, x, z, local92.xMax + 1 - local92.xMin, local92.zMax - local92.zMin + 1);
								local92.entity = local92.entity.createModel();
							}
						}
						@Pc(131) GroundDecor local131 = local22.groundDecor;
						if (local131 != null && local131.entity.method4543()) {
							method3574(local131.entity, level, x, z);
							local131.entity = local131.entity.createModel();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIILclient!th;IZJ)Z")
	public static boolean method2256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Entity arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		@Pc(6) boolean local6 = tileHeights == underwaterTileHeights;
		@Pc(8) int local8 = 0;
		@Pc(17) int local17;
		for (@Pc(10) int local10 = arg1; local10 < arg1 + arg3; local10++) {
			for (local17 = arg2; local17 < arg2 + arg4; local17++) {
				if (local10 < 0 || local17 < 0 || local10 >= width || local17 >= length) {
					return false;
				}
				@Pc(42) Tile local42 = tiles[arg0][local10][local17];
				if (local42 != null && local42.sceneryLen >= 5) {
					return false;
				}
			}
		}
		@Pc(58) Scenery local58 = new Scenery();
		local58.key = arg11;
		local58.level = arg0;
		local58.anInt1699 = arg5;
		local58.anInt1703 = arg6;
		local58.anInt1706 = arg7;
		local58.entity = arg8;
		local58.anInt1714 = arg9;
		local58.xMin = arg1;
		local58.zMin = arg2;
		local58.xMax = arg1 + arg3 - 1;
		local58.zMax = arg2 + arg4 - 1;
		@Pc(108) int local108;
		for (local17 = arg1; local17 < arg1 + arg3; local17++) {
			for (local108 = arg2; local108 < arg2 + arg4; local108++) {
				@Pc(115) int local115 = 0;
				if (local17 > arg1) {
					local115++;
				}
				if (local17 < arg1 + arg3 - 1) {
					local115 += 4;
				}
				if (local108 > arg2) {
					local115 += 8;
				}
				if (local108 < arg2 + arg4 - 1) {
					local115 += 2;
				}
				for (@Pc(141) int local141 = arg0; local141 >= 0; local141--) {
					if (tiles[local141][local17][local108] == null) {
						tiles[local141][local17][local108] = new Tile(local141, local17, local108);
					}
				}
				@Pc(174) Tile local174 = tiles[arg0][local17][local108];
				local174.scenery[local174.sceneryLen] = local58;
				local174.interiorFlags[local174.sceneryLen] = local115;
				local174.allInteriorFlags |= local115;
				local174.sceneryLen++;
				if (local6 && anIntArrayArray11[local17][local108] != 0) {
					local8 = anIntArrayArray11[local17][local108];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local17 = arg1; local17 < arg1 + arg3; local17++) {
				for (local108 = arg2; local108 < arg2 + arg4; local108++) {
					if (anIntArrayArray11[local17][local108] == 0) {
						anIntArrayArray11[local17][local108] = local8;
					}
				}
			}
		}
		if (arg10) {
			scenery[sceneryLen++] = local58;
		}
		return true;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIILclient!th;IJZ)Z")
	public static boolean add(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Entity arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return method2256(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIILclient!mj;)V")
	public static void method1144(@OriginalArg(1) int z, @OriginalArg(2) int x, @OriginalArg(3) int level, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) CollisionMap collision) {
		@Pc(9) long key = 0L;
		if (arg3 == 0) {
			key = getWallKey(level, x, z);
		} else if (arg3 == 1) {
			key = getWallDecorKey(level, x, z);
		} else if (arg3 == 2) {
			key = getSceneryKey(level, x, z);
		} else if (arg3 == 3) {
			key = getGroundDecorKey(level, x, z);
		}
		@Pc(57) int shape = (int) key >> 14 & 0x1F;
		@Pc(70) int id = (int) (key >>> 32) & Integer.MAX_VALUE;
		@Pc(74) LocType type = LocTypeList.get(id);
		if (type.hasAreaSound()) {
			AreaSoundManager.remove(x, type, z, level);
		}
		@Pc(92) int angle = (int) key >> 20 & 0x3;
		if (key == 0L) {
			return;
		}
		@Pc(100) Entity local100 = null;
		@Pc(102) Entity local102 = null;
		if (arg3 == 0) {
			@Pc(110) Wall wall = removeWall(level, x, z);
			if (wall != null) {
				local100 = wall.primary;
				local102 = wall.secondary;
			}
			if (type.blockwalk != 0) {
				collision.unflagWall(angle, type.blockrange, z, shape, x);
			}
		} else if (arg3 == 1) {
			@Pc(233) WallDecor wallDecor = removeWallDecor(level, x, z);
			if (wallDecor != null) {
				local100 = wallDecor.primary;
				local102 = wallDecor.secondary;
			}
		} else if (arg3 == 2) {
			@Pc(148) Scenery scenery = removeScenery(level, x, z);
			if (scenery != null) {
				local100 = scenery.entity;
			}
			if (type.blockwalk != 0 && type.width + x < 104 && type.width + z < 104 && x + type.length < 104 && z + type.length < 104) {
				collision.unflagScenery(x, type.width, type.blockrange, angle, type.length, z);
			}
		} else if (arg3 == 3) {
			@Pc(211) GroundDecor groundDecor = removeGroundDecor(level, x, z);
			if (groundDecor != null) {
				local100 = groundDecor.entity;
			}
			if (type.blockwalk == 1) {
				collision.unflagGroundDecor(z, x);
			}
		}
		if (!GlRenderer.enabled || !type.castshadow) {
			return;
		}
		if (shape == 2) {
			if (local100 instanceof Loc) {
				((Loc) local100).method1046();
			} else {
				Loc.method181(type, 0, angle + 4, 0, shape, x, z, arg4);
			}
			if (local102 instanceof Loc) {
				((Loc) local102).method1046();
			} else {
				Loc.method181(type, 0, angle + 1 & 0x3, 0, shape, x, z, arg4);
			}
		} else if (shape == 5) {
			if (local100 instanceof Loc) {
				((Loc) local100).method1046();
			} else {
				Loc.method181(type, WALL_DECO_ROT_SIZE_Y_DIR[angle] * 8, angle, WALL_DECO_ROT_SIZE_X_DIR[angle] * 8, 4, x, z, arg4);
			}
		} else if (shape == 6) {
			if (local100 instanceof Loc) {
				((Loc) local100).method1046();
			} else {
				Loc.method181(type, anIntArray154[angle] * 8, angle + 4, anIntArray565[angle] * 8, 4, x, z, arg4);
			}
		} else if (shape == 7) {
			if (local100 instanceof Loc) {
				((Loc) local100).method1046();
			} else {
				Loc.method181(type, 0, (angle + 2 & 0x3) + 4, 0, 4, x, z, arg4);
			}
		} else if (shape == 8) {
			if (local100 instanceof Loc) {
				((Loc) local100).method1046();
			} else {
				Loc.method181(type, anIntArray154[angle] * 8, angle + 4, anIntArray565[angle] * 8, 4, x, z, arg4);
			}
			if (local102 instanceof Loc) {
				((Loc) local102).method1046();
			} else {
				Loc.method181(type, anIntArray154[angle] * 8, (angle + 2 & 0x3) + 4, anIntArray565[angle] * 8, 4, x, z, arg4);
			}
		} else if (shape == 11) {
			if (local100 instanceof Loc) {
				((Loc) local100).method1046();
			} else {
				Loc.method181(type, 0, angle + 4, 0, 10, x, z, arg4);
			}
		} else if (local100 instanceof Loc) {
			((Loc) local100).method1046();
		} else {
			Loc.method181(type, 0, angle, 0, shape, x, z, arg4);
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(II)V")
	public static void method3884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Tile local7 = tiles[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(30) Tile local30 = tiles[local9][arg0][arg1] = tiles[local9 + 1][arg0][arg1];
			if (local30 != null) {
				local30.anInt672--;
				for (@Pc(40) int local40 = 0; local40 < local30.sceneryLen; local40++) {
					@Pc(49) Scenery local49 = local30.scenery[local40];
					if ((local49.key >> 29 & 0x3L) == 2L && local49.xMin == arg0 && local49.zMin == arg1) {
						local49.level--;
					}
				}
			}
		}
		if (tiles[0][arg0][arg1] == null) {
			tiles[0][arg0][arg1] = new Tile(0, arg0, arg1);
		}
		tiles[0][arg0][arg1].aClass3_Sub5_1 = local7;
		tiles[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method1599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (anIntArrayArrayArray12[arg0][local16][local20] == -anInt437) {
						return false;
					}
				}
			}
			local16 = (arg1 << 7) + 1;
			local20 = (arg3 << 7) + 2;
			@Pc(156) int local156 = tileHeights[arg0][arg1][arg3] + arg5;
			if (!method4394(local16, local156, local20)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!method4394(local169, local156, local20)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!method4394(local16, local156, local182)) {
				return false;
			} else return method4394(local169, local156, local182);
		} else if (method187(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return method4394(local16 + 1, tileHeights[arg0][arg1][arg3] + arg5, local20 + 1) && method4394(local16 + 128 - 1, tileHeights[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && method4394(local16 + 128 - 1, tileHeights[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && method4394(local16 + 1, tileHeights[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIILclient!th;Lclient!th;IIIIJ)V")
	public static void setWallDecor(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) int arg3, @OriginalArg(4) Entity primary, @OriginalArg(5) Entity secondary, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int xOffset, @OriginalArg(9) int zOffset, @OriginalArg(10) long key) {
		if (primary == null) {
			return;
		}
		@Pc(6) WallDecor wallDecor = new WallDecor();
		wallDecor.key = key;
		wallDecor.xFine = x * 128 + 64;
		wallDecor.zFine = z * 128 + 64;
		wallDecor.anInt1391 = arg3;
		wallDecor.primary = primary;
		wallDecor.secondary = secondary;
		wallDecor.anInt1395 = arg6;
		wallDecor.anInt1388 = arg7;
		wallDecor.xOffset = xOffset;
		wallDecor.zOffset = zOffset;
		for (@Pc(46) int level0 = level; level0 >= 0; level0--) {
			if (tiles[level0][x][z] == null) {
				tiles[level0][x][z] = new Tile(level0, x, z);
			}
		}
		tiles[level][x][z].wallDecor = wallDecor;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(III)Lclient!jj;")
	public static ObjStackEntity removeObjStack(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[level][x][z];
		if (tile == null) {
			return null;
		} else {
			@Pc(14) ObjStackEntity entity = tile.objStack;
			tile.objStack = null;
			return entity;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!bj;Z)V")
	public static void method4245(@OriginalArg(0) Tile arg0, @OriginalArg(1) boolean arg1) {
		aClass69_32.addTail(arg0);
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
												local8 = (Tile) aClass69_32.removeHead();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean46);
											local18 = local8.anInt669;
											local21 = local8.anInt666;
											local24 = local8.anInt672;
											local27 = local8.anInt668;
											local31 = tiles[local24];
											@Pc(33) float local33 = 0.0F;
											if (GlRenderer.enabled) {
												if (underwaterTileHeights == tileHeights) {
													var9 = anIntArrayArray11[local18][local21];
													var10 = var9 & 0xFFFFFF;
													if (var10 != anInt3604) {
														anInt3604 = var10;
														WaterMaterialRenderer.method619(var10);
														FogManager.setFogColor(WaterMaterialRenderer.method2422());
													}
													local65 = var9 >>> 24 << 3;
													if (local65 != anInt730) {
														anInt730 = local65;
														MaterialManager.method2761(local65);
													}
													local115 = surfaceTileHeights[0][local18][local21] + surfaceTileHeights[0][local18 + 1][local21] + surfaceTileHeights[0][local18][local21 + 1] + surfaceTileHeights[0][local18 + 1][local21 + 1] >> 2;
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
													local153 = tiles[local24 - 1][local18][local21];
													if (local153 != null && local153.aBoolean46) {
														continue;
													}
												}
												if (local18 <= anInt4069 && local18 > LightingManager.anInt987) {
													local153 = local31[local18 - 1][local21];
													if (local153 != null && local153.aBoolean46 && (local153.aBoolean45 || (local8.allInteriorFlags & 0x1) == 0)) {
														continue;
													}
												}
												if (local18 >= anInt4069 && local18 < LightingManager.anInt15 - 1) {
													local153 = local31[local18 + 1][local21];
													if (local153 != null && local153.aBoolean46 && (local153.aBoolean45 || (local8.allInteriorFlags & 0x4) == 0)) {
														continue;
													}
												}
												if (local21 <= anInt4539 && local21 > LightingManager.anInt4698) {
													local153 = local31[local18][local21 - 1];
													if (local153 != null && local153.aBoolean46 && (local153.aBoolean45 || (local8.allInteriorFlags & 0x8) == 0)) {
														continue;
													}
												}
												if (local21 >= anInt4539 && local21 < LightingManager.anInt4866 - 1) {
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
														method2762(local153.shapedTile, anInt2886, anInt3038, anInt5205, anInt2222, local18, local21, method187(0, local18, local21));
													}
												} else
													method2610(local153.plainTile, 0, anInt2886, anInt3038, anInt5205, anInt2222, local18, local21, method187(0, local18, local21));
												var22 = local153.wall;
												if (var22 != null) {
													if (GlRenderer.enabled) {
														if ((var22.anInt3049 & local8.anInt670) == 0) {
															LightingManager.method2393(anInt3555, anInt3947, anInt4903, local24, local18, local21);
														} else {
															LightingManager.method2388(var22.anInt3049, anInt3555, anInt3947, anInt4903, local27, local18, local21);
														}
													}
													var22.primary.render(0, anInt2886, anInt3038, anInt5205, anInt2222, var22.xFine - anInt3555, var22.anInt3051 - anInt3947, var22.zFine - anInt4903, var22.key, local24, null);
												}
												for (local65 = 0; local65 < local153.sceneryLen; local65++) {
													var25 = local153.scenery[local65];
													if (var25 != null) {
														if (GlRenderer.enabled) {
															LightingManager.method2393(anInt3555, anInt3947, anInt4903, local24, local18, local21);
														}
														var25.entity.render(var25.anInt1714, anInt2886, anInt3038, anInt5205, anInt2222, var25.anInt1699 - anInt3555, var25.anInt1706 - anInt3947, var25.anInt1703 - anInt4903, var25.key, local24, null);
													}
												}
												if (GlRenderer.enabled) {
													GlRenderer.method4159(local33);
												}
											}
											var24 = false;
											if (local8.plainTile == null) {
												if (local8.shapedTile != null) {
													if (method187(local27, local18, local21)) {
														method2762(local8.shapedTile, anInt2886, anInt3038, anInt5205, anInt2222, local18, local21, true);
													} else {
														var24 = true;
														method2762(local8.shapedTile, anInt2886, anInt3038, anInt5205, anInt2222, local18, local21, false);
													}
												}
											} else if (method187(local27, local18, local21)) {
												method2610(local8.plainTile, local27, anInt2886, anInt3038, anInt5205, anInt2222, local18, local21, true);
											} else {
												var24 = true;
												if (local8.plainTile.anInt4865 != 12345678 || MiniMenu.aBoolean187 && local24 <= MiniMenu.anInt3902) {
													method2610(local8.plainTile, local27, anInt2886, anInt3038, anInt5205, anInt2222, local18, local21, false);
												}
											}
											if (var24) {
												@Pc(549) GroundDecor local549 = local8.groundDecor;
												if (local549 != null && (local549.key & 0x80000000L) != 0L) {
													if (GlRenderer.enabled && local549.aBoolean49) {
														GlRenderer.method4159(local33 + 50.0F - 1.5F);
													}
													if (GlRenderer.enabled) {
														LightingManager.method2393(anInt3555, anInt3947, anInt4903, local24, local18, local21);
													}
													local549.entity.render(0, anInt2886, anInt3038, anInt5205, anInt2222, local549.xFine - anInt3555, local549.anInt733 - anInt3947, local549.zFine - anInt4903, local549.key, local24, null);
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
												if (anInt4069 == local18) {
													var10++;
												} else if (anInt4069 < local18) {
													var10 += 2;
												}
												if (anInt4539 == local21) {
													var10 += 3;
												} else if (anInt4539 > local21) {
													var10 += 6;
												}
												local65 = anIntArray324[var10];
												local8.anInt670 = anIntArray386[var10];
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
														LightingManager.method2393(anInt3555, anInt3947, anInt4903, local24, local18, local21);
													}
													local616.primary.render(0, anInt2886, anInt3038, anInt5205, anInt2222, local616.xFine - anInt3555, local616.anInt3051 - anInt3947, local616.zFine - anInt4903, local616.key, local24, null);
												}
												if ((local616.anInt3052 & local65) != 0 && !method3850(local27, local18, local21, local616.anInt3052)) {
													if (GlRenderer.enabled) {
														LightingManager.method2393(anInt3555, anInt3947, anInt4903, local24, local18, local21);
													}
													local616.secondary.render(0, anInt2886, anInt3038, anInt5205, anInt2222, local616.xFine - anInt3555, local616.anInt3051 - anInt3947, local616.zFine - anInt4903, local616.key, local24, null);
												}
											}
											if (local619 != null && !method4611(local27, local18, local21, local619.primary.getMinY())) {
												if (GlRenderer.enabled) {
													GlRenderer.method4159(local33 - 0.5F);
												}
												if ((local619.anInt1395 & local65) != 0) {
													if (GlRenderer.enabled) {
														LightingManager.method2393(anInt3555, anInt3947, anInt4903, local24, local18, local21);
													}
													local619.primary.render(0, anInt2886, anInt3038, anInt5205, anInt2222, local619.xFine + local619.xOffset - anInt3555, local619.anInt1391 - anInt3947, local619.zFine + local619.zOffset - anInt4903, local619.key, local24, null);
												} else if (local619.anInt1395 == 256) {
													local894 = local619.xFine - anInt3555;
													local899 = local619.anInt1391 - anInt3947;
													local904 = local619.zFine - anInt4903;
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
															LightingManager.method2393(anInt3555, anInt3947, anInt4903, local24, local18, local21);
														}
														local619.primary.render(0, anInt2886, anInt3038, anInt5205, anInt2222, local894 + local619.xOffset, local899, local904 + local619.zOffset, local619.key, local24, null);
													} else if (local619.secondary != null) {
														if (GlRenderer.enabled) {
															LightingManager.method2393(anInt3555, anInt3947, anInt4903, local24, local18, local21);
														}
														local619.secondary.render(0, anInt2886, anInt3038, anInt5205, anInt2222, local894, local899, local904, local619.key, local24, null);
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
														LightingManager.method2393(anInt3555, anInt3947, anInt4903, local24, local18, local21);
													}
													local1001.entity.render(0, anInt2886, anInt3038, anInt5205, anInt2222, local1001.xFine - anInt3555, local1001.anInt733 - anInt3947, local1001.zFine - anInt4903, local1001.key, local24, null);
													if (GlRenderer.enabled && local1001.aBoolean49) {
														GlRenderer.method4159(local33);
													}
												}
												@Pc(1064) ObjStackEntity local1064 = local8.objStack;
												if (local1064 != null && local1064.anInt3063 == 0) {
													if (GlRenderer.enabled) {
														LightingManager.method2393(anInt3555, anInt3947, anInt4903, local24, local18, local21);
													}
													if (local1064.secondary != null) {
														local1064.secondary.render(0, anInt2886, anInt3038, anInt5205, anInt2222, local1064.xFine - anInt3555, local1064.anInt3057 - anInt3947, local1064.zFine - anInt4903, local1064.key, local24, null);
													}
													if (local1064.tertiary != null) {
														local1064.tertiary.render(0, anInt2886, anInt3038, anInt5205, anInt2222, local1064.xFine - anInt3555, local1064.anInt3057 - anInt3947, local1064.zFine - anInt4903, local1064.key, local24, null);
													}
													if (local1064.primary != null) {
														local1064.primary.render(0, anInt2886, anInt3038, anInt5205, anInt2222, local1064.xFine - anInt3555, local1064.anInt3057 - anInt3947, local1064.zFine - anInt4903, local1064.key, local24, null);
													}
												}
											}
											local894 = local8.allInteriorFlags;
											if (local894 != 0) {
												if (local18 < anInt4069 && (local894 & 0x4) != 0) {
													var32 = local31[local18 + 1][local21];
													if (var32 != null && var32.aBoolean46) {
														aClass69_32.addTail(var32);
													}
												}
												if (local21 < anInt4539 && (local894 & 0x2) != 0) {
													var32 = local31[local18][local21 + 1];
													if (var32 != null && var32.aBoolean46) {
														aClass69_32.addTail(var32);
													}
												}
												if (local18 > anInt4069 && (local894 & 0x1) != 0) {
													var32 = local31[local18 - 1][local21];
													if (var32 != null && var32.aBoolean46) {
														aClass69_32.addTail(var32);
													}
												}
												if (local21 > anInt4539 && (local894 & 0x8) != 0) {
													var32 = local31[local18][local21 - 1];
													if (var32 != null && var32.aBoolean46) {
														aClass69_32.addTail(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt663 != 0) {
											var24 = true;
											for (var10 = 0; var10 < local8.sceneryLen; var10++) {
												if (local8.scenery[var10].anInt1707 != anInt437 && (local8.interiorFlags[var10] & local8.anInt663) == local8.anInt665) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												var22 = local8.wall;
												if (!method3850(local27, local18, local21, var22.anInt3049)) {
													if (GlRenderer.enabled) {
														label882:
														{
															if ((var22.key & 0xFC000L) == 16384L) {
																local65 = var22.xFine - anInt3555;
																local115 = var22.zFine - anInt4903;
																local1332 = (int) (var22.key >> 20 & 0x3L);
																if (local1332 == 0) {
																	local65 -= 64;
																	local115 += 64;
																	if (local115 < local65 && local18 > 0 && local21 < length - 1) {
																		LightingManager.method2393(anInt3555, anInt3947, anInt4903, local24, local18 - 1, local21 + 1);
																		break label882;
																	}
																} else if (local1332 == 1) {
																	local65 += 64;
																	local115 += 64;
																	if (local115 < -local65 && local18 < width - 1 && local21 < length - 1) {
																		LightingManager.method2393(anInt3555, anInt3947, anInt4903, local24, local18 + 1, local21 + 1);
																		break label882;
																	}
																} else if (local1332 == 2) {
																	local65 += 64;
																	local115 -= 64;
																	if (local115 > local65 && local18 < width - 1 && local21 > 0) {
																		LightingManager.method2393(anInt3555, anInt3947, anInt4903, local24, local18 + 1, local21 - 1);
																		break label882;
																	}
																} else if (local1332 == 3) {
																	local65 -= 64;
																	local115 -= 64;
																	if (local115 > -local65 && local18 > 0 && local21 > 0) {
																		LightingManager.method2393(anInt3555, anInt3947, anInt4903, local24, local18 - 1, local21 - 1);
																		break label882;
																	}
																}
															}
															LightingManager.method2393(anInt3555, anInt3947, anInt4903, local24, local18, local21);
														}
													}
													var22.primary.render(0, anInt2886, anInt3038, anInt5205, anInt2222, var22.xFine - anInt3555, var22.anInt3051 - anInt3947, var22.zFine - anInt4903, var22.key, local24, null);
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
											label767:
											for (local65 = 0; local65 < var9; local65++) {
												var25 = local8.scenery[local65];
												if (var25.anInt1707 != anInt437) {
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
													aClass31Array2[var10++] = var25;
													local1332 = anInt4069 - var25.xMin;
													local894 = var25.xMax - anInt4069;
													if (local894 > local1332) {
														local1332 = local894;
													}
													local899 = anInt4539 - var25.zMin;
													local904 = var25.zMax - anInt4539;
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
													@Pc(1628) Scenery local1628 = aClass31Array2[local1332];
													if (local1628.anInt1707 != anInt437) {
														if (local1628.anInt1705 > local65) {
															local65 = local1628.anInt1705;
															local115 = local1332;
														} else if (local1628.anInt1705 == local65) {
															local899 = local1628.anInt1699 - anInt3555;
															local904 = local1628.anInt1703 - anInt4903;
															var17 = aClass31Array2[local115].anInt1699 - anInt3555;
															var18 = aClass31Array2[local115].anInt1703 - anInt4903;
															if (local899 * local899 + local904 * local904 > var17 * var17 + var18 * var18) {
																local115 = local1332;
															}
														}
													}
												}
												if (local115 == -1) {
													break;
												}
												@Pc(1697) Scenery local1697 = aClass31Array2[local115];
												local1697.anInt1707 = anInt437;
												if (!method1599(local27, local1697.xMin, local1697.xMax, local1697.zMin, local1697.zMax, local1697.entity.getMinY())) {
													if (GlRenderer.enabled) {
														if ((local1697.key & 0xFC000L) == 147456L) {
															LightingManager.method2393(anInt3555, anInt3947, anInt4903, local24, local18, local21);
															local894 = local1697.anInt1699 - anInt3555;
															local899 = local1697.anInt1703 - anInt4903;
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
															LightingManager.method2391(anInt3555, anInt3947, anInt4903, local24, local1697.xMin, local1697.zMin, local1697.xMax, local1697.zMax);
														}
													}
													local1697.entity.render(local1697.anInt1714, anInt2886, anInt3038, anInt5205, anInt2222, local1697.anInt1699 - anInt3555, local1697.anInt1706 - anInt3947, local1697.anInt1703 - anInt4903, local1697.key, local24, null);
												}
												for (local894 = local1697.xMin; local894 <= local1697.xMax; local894++) {
													for (local899 = local1697.zMin; local899 <= local1697.zMax; local899++) {
														@Pc(1863) Tile local1863 = local31[local894][local899];
														if (local1863.anInt663 != 0) {
															aClass69_32.addTail(local1863);
														} else if ((local894 != local18 || local899 != local21) && local1863.aBoolean46) {
															aClass69_32.addTail(local1863);
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
							if (local18 > anInt4069 || local18 <= LightingManager.anInt987) {
								break;
							}
							local153 = local31[local18 - 1][local21];
						} while (local153 != null && local153.aBoolean46);
						if (local18 < anInt4069 || local18 >= LightingManager.anInt15 - 1) {
							break;
						}
						local153 = local31[local18 + 1][local21];
					} while (local153 != null && local153.aBoolean46);
					if (local21 > anInt4539 || local21 <= LightingManager.anInt4698) {
						break;
					}
					local153 = local31[local18][local21 - 1];
				} while (local153 != null && local153.aBoolean46);
				if (local21 < anInt4539 || local21 >= LightingManager.anInt4866 - 1) {
					break;
				}
				local153 = local31[local18][local21 + 1];
			} while (local153 != null && local153.aBoolean46);
			local8.aBoolean46 = false;
			anInt1142--;
			@Pc(1999) ObjStackEntity local1999 = local8.objStack;
			if (local1999 != null && local1999.anInt3063 != 0) {
				if (GlRenderer.enabled) {
					LightingManager.method2393(anInt3555, anInt3947, anInt4903, local24, local18, local21);
				}
				if (local1999.secondary != null) {
					local1999.secondary.render(0, anInt2886, anInt3038, anInt5205, anInt2222, local1999.xFine - anInt3555, local1999.anInt3057 - anInt3947 - local1999.anInt3063, local1999.zFine - anInt4903, local1999.key, local24, null);
				}
				if (local1999.tertiary != null) {
					local1999.tertiary.render(0, anInt2886, anInt3038, anInt5205, anInt2222, local1999.xFine - anInt3555, local1999.anInt3057 - anInt3947 - local1999.anInt3063, local1999.zFine - anInt4903, local1999.key, local24, null);
				}
				if (local1999.primary != null) {
					local1999.primary.render(0, anInt2886, anInt3038, anInt5205, anInt2222, local1999.xFine - anInt3555, local1999.anInt3057 - anInt3947 - local1999.anInt3063, local1999.zFine - anInt4903, local1999.key, local24, null);
				}
			}
			if (local8.anInt670 != 0) {
				@Pc(2109) WallDecor local2109 = local8.wallDecor;
				if (local2109 != null && !method4611(local27, local18, local21, local2109.primary.getMinY())) {
					if ((local2109.anInt1395 & local8.anInt670) != 0) {
						if (GlRenderer.enabled) {
							LightingManager.method2393(anInt3555, anInt3947, anInt4903, local24, local18, local21);
						}
						local2109.primary.render(0, anInt2886, anInt3038, anInt5205, anInt2222, local2109.xFine + local2109.xOffset - anInt3555, local2109.anInt1391 - anInt3947, local2109.zFine + local2109.zOffset - anInt4903, local2109.key, local24, null);
					} else if (local2109.anInt1395 == 256) {
						local65 = local2109.xFine - anInt3555;
						local115 = local2109.anInt1391 - anInt3947;
						local1332 = local2109.zFine - anInt4903;
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
								LightingManager.method2393(anInt3555, anInt3947, anInt4903, local24, local18, local21);
							}
							local2109.primary.render(0, anInt2886, anInt3038, anInt5205, anInt2222, local65 + local2109.xOffset, local115, local1332 + local2109.zOffset, local2109.key, local24, null);
						} else if (local2109.secondary != null) {
							if (GlRenderer.enabled) {
								LightingManager.method2393(anInt3555, anInt3947, anInt4903, local24, local18, local21);
							}
							local2109.secondary.render(0, anInt2886, anInt3038, anInt5205, anInt2222, local65, local115, local1332, local2109.key, local24, null);
						}
					}
				}
				@Pc(2275) Wall local2275 = local8.wall;
				if (local2275 != null) {
					if ((local2275.anInt3052 & local8.anInt670) != 0 && !method3850(local27, local18, local21, local2275.anInt3052)) {
						if (GlRenderer.enabled) {
							LightingManager.method2388(local2275.anInt3052, anInt3555, anInt3947, anInt4903, local27, local18, local21);
						}
						local2275.secondary.render(0, anInt2886, anInt3038, anInt5205, anInt2222, local2275.xFine - anInt3555, local2275.anInt3051 - anInt3947, local2275.zFine - anInt4903, local2275.key, local24, null);
					}
					if ((local2275.anInt3049 & local8.anInt670) != 0 && !method3850(local27, local18, local21, local2275.anInt3049)) {
						if (GlRenderer.enabled) {
							LightingManager.method2388(local2275.anInt3049, anInt3555, anInt3947, anInt4903, local27, local18, local21);
						}
						local2275.primary.render(0, anInt2886, anInt3038, anInt5205, anInt2222, local2275.xFine - anInt3555, local2275.anInt3051 - anInt3947, local2275.zFine - anInt4903, local2275.key, local24, null);
					}
				}
			}
			@Pc(2388) Tile local2388;
			if (local24 < levels - 1) {
				local2388 = tiles[local24 + 1][local18][local21];
				if (local2388 != null && local2388.aBoolean46) {
					aClass69_32.addTail(local2388);
				}
			}
			if (local18 < anInt4069) {
				local2388 = local31[local18 + 1][local21];
				if (local2388 != null && local2388.aBoolean46) {
					aClass69_32.addTail(local2388);
				}
			}
			if (local21 < anInt4539) {
				local2388 = local31[local18][local21 + 1];
				if (local2388 != null && local2388.aBoolean46) {
					aClass69_32.addTail(local2388);
				}
			}
			if (local18 > anInt4069) {
				local2388 = local31[local18 - 1][local21];
				if (local2388 != null && local2388.aBoolean46) {
					aClass69_32.addTail(local2388);
				}
			}
			if (local21 > anInt4539) {
				local2388 = local31[local18][local21 - 1];
				if (local2388 != null && local2388.aBoolean46) {
					aClass69_32.addTail(local2388);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIII)Z")
	public static boolean method4611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (method187(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return method4394(local10 + 1, tileHeights[arg0][arg1][arg2] + arg3, local14 + 1) && method4394(local10 + 128 - 1, tileHeights[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && method4394(local10 + 128 - 1, tileHeights[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && method4394(local10 + 1, tileHeights[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIII)Z")
	public static boolean method3850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!method187(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = tileHeights[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > anInt3555) {
					if (!method4394(local10, local24, local14)) {
						return false;
					}
					if (!method4394(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!method4394(local10, local28, local14)) {
						return false;
					}
					if (!method4394(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!method4394(local10, local32, local14)) {
					return false;
				}
				return method4394(local10, local32, local14 + 128);
			}
			if (arg3 == 2) {
				if (local14 < anInt4903) {
					if (!method4394(local10, local24, local14 + 128)) {
						return false;
					}
					if (!method4394(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!method4394(local10, local28, local14 + 128)) {
						return false;
					}
					if (!method4394(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!method4394(local10, local32, local14 + 128)) {
					return false;
				}
				return method4394(local10 + 128, local32, local14 + 128);
			}
			if (arg3 == 4) {
				if (local10 < anInt3555) {
					if (!method4394(local10 + 128, local24, local14)) {
						return false;
					}
					if (!method4394(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!method4394(local10 + 128, local28, local14)) {
						return false;
					}
					if (!method4394(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!method4394(local10 + 128, local32, local14)) {
					return false;
				}
				return method4394(local10 + 128, local32, local14 + 128);
			}
			if (arg3 == 8) {
				if (local14 > anInt4903) {
					if (!method4394(local10, local24, local14)) {
						return false;
					}
					if (!method4394(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!method4394(local10, local28, local14)) {
						return false;
					}
					if (!method4394(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!method4394(local10, local32, local14)) {
					return false;
				}
				return method4394(local10 + 128, local32, local14);
			}
		}
		if (!method4394(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return method4394(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return method4394(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return method4394(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return method4394(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IZIZLclient!mj;IIIBII)V")
	public static void addLoc(@OriginalArg(0) int currentPlane, @OriginalArg(1) boolean lowmem, @OriginalArg(2) int plane, @OriginalArg(3) boolean highmem, @OriginalArg(4) CollisionMap map, @OriginalArg(5) int locIndex, @OriginalArg(6) int locType, @OriginalArg(7) int x, @OriginalArg(9) int z, @OriginalArg(10) int orientation) {
		if (lowmem && !allLevelsAreVisible() && (renderFlags[0][x][z] & 0x2) == 0) {
			if ((renderFlags[plane][x][z] & 0x10) != 0 || getRenderLevel(z, x, plane) != centralPlane) {
				return;
			}
		}

		if (plane < firstVisibleLevel) {
			firstVisibleLevel = plane;
		}

		@Pc(62) LocType loc = LocTypeList.get(locIndex);
		if (GlRenderer.enabled && loc.render) {
			return;
		}

		@Pc(84) int width;
		@Pc(81) int length;
		if (orientation == 1 || orientation == 3) {
			length = loc.width;
			width = loc.length;
		} else {
			width = loc.width;
			length = loc.length;
		}

		@Pc(103) int west;
		@Pc(112) int east;
		if (x + width <= 104) {
			west = x + (width >> 1);
			east = x + (width + 1 >> 1);
		} else {
			east = x + 1;
			west = x;
		}

		@Pc(129) int south;
		@Pc(133) int north;
		if (length + z > 104) {
			south = z;
			north = z + 1;
		} else {
			south = (length >> 1) + z;
			north = z + (length + 1 >> 1);
		}

		@Pc(153) int[][] currentHeightmap = tileHeights[currentPlane];
		@Pc(165) int local165 = (width << 6) + (x << 7);
		@Pc(173) int local173 = (length << 6) + (z << 7);
		@Pc(199) int averageY = currentHeightmap[west][north] + currentHeightmap[east][south] + currentHeightmap[west][south] + currentHeightmap[east][north] >> 2;

		@Pc(201) int diffAverageY = 0;
		@Pc(213) int[][] heightmap;
		if (GlRenderer.enabled && currentPlane != 0) {
			heightmap = tileHeights[0];
			diffAverageY = averageY - (heightmap[east][north] + heightmap[east][south] + heightmap[west][south] + heightmap[west][north] >> 2);
		}
		heightmap = null;

		@Pc(261) long bitset = x | 0x40000000 | (long) z << 7 | (long) locType << 14 | (long) orientation << 20;

		if (highmem) {
			heightmap = surfaceTileHeights[0];
		} else if (currentPlane < 3) {
			heightmap = tileHeights[currentPlane + 1];
		}

		if (loc.interactable == 0 || highmem) {
			bitset |= Long.MIN_VALUE;
		}

		if (loc.supportitems == 1) {
			bitset |= 0x400000L;
		}

		if (loc.hasanimation) {
			bitset |= Integer.MIN_VALUE;
		}

		if (loc.hasAreaSound()) {
			AreaSoundManager.add(z, loc, orientation, null, x, plane, null);
		}

		@Pc(330) boolean local330 = loc.castshadow & !highmem;
		bitset |= (long) locIndex << 32;
		@Pc(387) Entity entity;
		@Pc(403) LocEntity local403;
		@Pc(1226) int local1226;
		@Pc(1889) long local1889;
		@Pc(1934) Entity local1934;
		@Pc(1950) LocEntity local1950;

		if (locType == LocType.GROUNDDECOR) {
			if (Preferences.showGroundDecorations || loc.interactable != 0 || loc.blockwalk == 1 || loc.forcedecor) {
				if (loc.anim == -1 && loc.multiLocs == null && !loc.aBoolean214) {
					local403 = loc.method3428(orientation, local165, currentHeightmap, LocType.GROUNDDECOR, averageY, heightmap, lowmem, null, local330, local173);
					if (GlRenderer.enabled && local330) {
						ShadowManager.method4211(local403.sprite, local165, diffAverageY, local173);
					}
					entity = local403.model;
				} else {
					entity = new Loc(locIndex, LocType.GROUNDDECOR, orientation, currentPlane, x, z, loc.anim, loc.allowrandomizedanimation, null);
				}

				setGroundDecor(plane, x, z, averageY, entity, bitset, loc.aBoolean211);

				if (loc.blockwalk == 1 && map != null) {
					map.flagGroundDecor(x, z);
				}
			}
		} else if (locType == LocType.CENTREPIECE_STRAIGHT || locType == LocType.CENTREPIECE_DIAGONAL) {
			if (loc.anim == -1 && loc.multiLocs == null && !loc.aBoolean214) {
				local403 = loc.method3428(locType == LocType.CENTREPIECE_DIAGONAL ? orientation + 4 : orientation, local165, currentHeightmap, LocType.CENTREPIECE_STRAIGHT, averageY, heightmap, lowmem, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					ShadowManager.method4211(local403.sprite, local165, diffAverageY, local173);
				}
				entity = local403.model;
			} else {
				entity = new Loc(locIndex, LocType.CENTREPIECE_STRAIGHT, locType == LocType.CENTREPIECE_DIAGONAL ? orientation + 4 : orientation, currentPlane, x, z, loc.anim, loc.allowrandomizedanimation, null);
			}

			if (entity != null) {
				@Pc(531) boolean local531 = method35(plane, x, z, averageY, width, length, entity, bitset);
				if (loc.active && local531 && lowmem) {
					@Pc(541) int local541 = 15;
					if (entity instanceof Model) {
						local541 = ((Model) entity).getLengthXZ() / 4;
						if (local541 > 30) {
							local541 = 30;
						}
					}
					for (@Pc(560) int local560 = 0; local560 <= width; local560++) {
						for (@Pc(565) int local565 = 0; local565 <= length; local565++) {
							if (shadowmap[plane][x + local560][local565 + z] < local541) {
								shadowmap[plane][x + local560][z + local565] = (byte) local541;
							}
						}
					}
				}
			}

			if (loc.blockwalk != 0 && map != null) {
				map.flagScenery(x, loc.blockrange, z, width, length);
			}
		} else if (locType >= LocType.ROOF_STRAIGHT) {
			if (loc.anim == -1 && loc.multiLocs == null && !loc.aBoolean214) {
				local403 = loc.method3428(orientation, local165, currentHeightmap, locType, averageY, heightmap, lowmem, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					ShadowManager.method4211(local403.sprite, local165, diffAverageY, local173);
				}
				entity = local403.model;
			} else {
				entity = new Loc(locIndex, locType, orientation, currentPlane, x, z, loc.anim, loc.allowrandomizedanimation, null);
			}

			method35(plane, x, z, averageY, 1, 1, entity, bitset);
			if (lowmem && locType <= LocType.ROOF_FLAT && locType != LocType.ROOF_DIAGONAL_WITH_ROOFEDGE && plane > 0) {
				occludeFlags[plane][x][z] |= 0x4;
			}

			if (loc.blockwalk != 0 && map != null) {
				map.flagScenery(x, loc.blockrange, z, width, length);
			}
		} else if (locType == LocType.WALL_STRAIGHT) {
			if (loc.anim == -1 && loc.multiLocs == null && !loc.aBoolean214) {
				local403 = loc.method3428(orientation, local165, currentHeightmap, LocType.WALL_STRAIGHT, averageY, heightmap, lowmem, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					ShadowManager.method4211(local403.sprite, local165, diffAverageY, local173);
				}
				entity = local403.model;
			} else {
				entity = new Loc(locIndex, LocType.WALL_STRAIGHT, orientation, currentPlane, x, z, loc.anim, loc.allowrandomizedanimation, null);
			}

			setWall(plane, x, z, averageY, entity, null, WALL_ROTATION_TYPE1[orientation], 0, bitset);

			if (lowmem) {
				if (orientation == 0) {
					if (loc.active) {
						shadowmap[plane][x][z] = 50;
						shadowmap[plane][x][z + 1] = 50;
					}

					if (loc.occlude) {
						occludeFlags[plane][x][z] |= 0x1;
					}
				} else if (orientation == 1) {
					if (loc.active) {
						shadowmap[plane][x][z + 1] = 50;
						shadowmap[plane][x + 1][z + 1] = 50;
					}

					if (loc.occlude) {
						occludeFlags[plane][x][z + 1] |= 0x2;
					}
				} else if (orientation == 2) {
					if (loc.active) {
						shadowmap[plane][x + 1][z] = 50;
						shadowmap[plane][x + 1][z + 1] = 50;
					}

					if (loc.occlude) {
						occludeFlags[plane][x + 1][z] |= 0x1;
					}
				} else if (orientation == 3) {
					if (loc.active) {
						shadowmap[plane][x][z] = 50;
						shadowmap[plane][x + 1][z] = 50;
					}

					if (loc.occlude) {
						occludeFlags[plane][x][z] |= 0x2;
					}
				}
			}

			if (loc.blockwalk != 0 && map != null) {
				map.flagWall(orientation, locType, loc.blockrange, z, x);
			}

			if (loc.walloff != 16) {
				setWallDecoration(plane, x, z, loc.walloff);
			}
		} else if (locType == LocType.WALL_DIAGONALCORNER) {
			if (loc.anim == -1 && loc.multiLocs == null && !loc.aBoolean214) {
				local403 = loc.method3428(orientation, local165, currentHeightmap, LocType.WALL_DIAGONALCORNER, averageY, heightmap, lowmem, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					ShadowManager.method4211(local403.sprite, local165, diffAverageY, local173);
				}
				entity = local403.model;
			} else {
				entity = new Loc(locIndex, LocType.WALL_DIAGONALCORNER, orientation, currentPlane, x, z, loc.anim, loc.allowrandomizedanimation, null);
			}

			setWall(plane, x, z, averageY, entity, null, LoginManager.anIntArray204[orientation], 0, bitset);
			if (loc.active && lowmem) {
				if (orientation == 0) {
					shadowmap[plane][x][z + 1] = 50;
				} else if (orientation == 1) {
					shadowmap[plane][x + 1][z + 1] = 50;
				} else if (orientation == 2) {
					shadowmap[plane][x + 1][z] = 50;
				} else if (orientation == 3) {
					shadowmap[plane][x][z] = 50;
				}
			}

			if (loc.blockwalk != 0 && map != null) {
				map.flagWall(orientation, locType, loc.blockrange, z, x);
			}
		} else if (locType == LocType.WALL_L) {
			local1226 = orientation + 1 & 0x3;
			@Pc(1269) Entity local1269;
			@Pc(1254) Entity local1254;
			if (loc.anim == -1 && loc.multiLocs == null && !loc.aBoolean214) {
				@Pc(1287) LocEntity local1287 = loc.method3428(orientation + 4, local165, currentHeightmap, LocType.WALL_L, averageY, heightmap, lowmem, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					ShadowManager.method4211(local1287.sprite, local165, diffAverageY, local173);
				}
				local1254 = local1287.model;
				local1287 = loc.method3428(local1226, local165, currentHeightmap, LocType.WALL_L, averageY, heightmap, lowmem, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					ShadowManager.method4211(local1287.sprite, local165, diffAverageY, local173);
				}
				local1269 = local1287.model;
			} else {
				local1254 = new Loc(locIndex, LocType.WALL_L, orientation + 4, currentPlane, x, z, loc.anim, loc.allowrandomizedanimation, null);
				local1269 = new Loc(locIndex, LocType.WALL_L, local1226, currentPlane, x, z, loc.anim, loc.allowrandomizedanimation, null);
			}
			setWall(plane, x, z, averageY, local1254, local1269, WALL_ROTATION_TYPE1[orientation], WALL_ROTATION_TYPE1[local1226], bitset);
			if (loc.occlude && lowmem) {
				if (orientation == 0) {
					occludeFlags[plane][x][z] |= 0x1;
					occludeFlags[plane][x][z + 1] |= 0x2;
				} else if (orientation == 1) {
					occludeFlags[plane][x][z + 1] |= 0x2;
					occludeFlags[plane][x + 1][z] |= 0x1;
				} else if (orientation == 2) {
					occludeFlags[plane][x + 1][z] |= 0x1;
					occludeFlags[plane][x][z] |= 0x2;
				} else if (orientation == 3) {
					occludeFlags[plane][x][z] |= 0x2;
					occludeFlags[plane][x][z] |= 0x1;
				}
			}
			if (loc.blockwalk != 0 && map != null) {
				map.flagWall(orientation, locType, loc.blockrange, z, x);
			}
			if (loc.walloff != 16) {
				setWallDecoration(plane, x, z, loc.walloff);
			}
		} else if (locType == LocType.WALL_SQUARECORNER) {
			if (loc.anim == -1 && loc.multiLocs == null && !loc.aBoolean214) {
				local403 = loc.method3428(orientation, local165, currentHeightmap, LocType.WALL_SQUARECORNER, averageY, heightmap, lowmem, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					ShadowManager.method4211(local403.sprite, local165, diffAverageY, local173);
				}
				entity = local403.model;
			} else {
				entity = new Loc(locIndex, LocType.WALL_SQUARECORNER, orientation, currentPlane, x, z, loc.anim, loc.allowrandomizedanimation, null);
			}
			setWall(plane, x, z, averageY, entity, null, LoginManager.anIntArray204[orientation], 0, bitset);
			if (loc.active && lowmem) {
				if (orientation == 0) {
					shadowmap[plane][x][z + 1] = 50;
				} else if (orientation == 1) {
					shadowmap[plane][x + 1][z + 1] = 50;
				} else if (orientation == 2) {
					shadowmap[plane][x + 1][z] = 50;
				} else if (orientation == 3) {
					shadowmap[plane][x][z] = 50;
				}
			}
			if (loc.blockwalk != 0 && map != null) {
				map.flagWall(orientation, locType, loc.blockrange, z, x);
			}
		} else if (locType == LocType.WALL_DIAGONAL) {
			if (loc.anim == -1 && loc.multiLocs == null && !loc.aBoolean214) {
				local403 = loc.method3428(orientation, local165, currentHeightmap, locType, averageY, heightmap, lowmem, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					ShadowManager.method4211(local403.sprite, local165, diffAverageY, local173);
				}
				entity = local403.model;
			} else {
				entity = new Loc(locIndex, locType, orientation, currentPlane, x, z, loc.anim, loc.allowrandomizedanimation, null);
			}
			method35(plane, x, z, averageY, 1, 1, entity, bitset);
			if (loc.blockwalk != 0 && map != null) {
				map.flagScenery(x, loc.blockrange, z, width, length);
			}
			if (loc.walloff != 16) {
				setWallDecoration(plane, x, z, loc.walloff);
			}
		} else if (locType == LocType.WALLDECOR_STRAIGHT_XOFFSET) {
			if (loc.anim == -1 && loc.multiLocs == null && !loc.aBoolean214) {
				local403 = loc.method3428(orientation, local165, currentHeightmap, 4, averageY, heightmap, lowmem, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					ShadowManager.method4211(local403.sprite, local165, diffAverageY, local173);
				}
				entity = local403.model;
			} else {
				entity = new Loc(locIndex, 4, orientation, currentPlane, x, z, loc.anim, loc.allowrandomizedanimation, null);
			}
			setWallDecor(plane, x, z, averageY, entity, null, WALL_ROTATION_TYPE1[orientation], 0, 0, 0, bitset);
		} else if (locType == LocType.WALLDECOR_STRAIGHT_ZOFFSET) {
			local1226 = 16;
			local1889 = getWallKey(plane, x, z);
			if (local1889 != 0L) {
				local1226 = LocTypeList.get(Integer.MAX_VALUE & (int) (local1889 >>> 32)).walloff;
			}
			if (loc.anim == -1 && loc.multiLocs == null && !loc.aBoolean214) {
				local1950 = loc.method3428(orientation, local165, currentHeightmap, 4, averageY, heightmap, lowmem, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					ShadowManager.method4211(local1950.sprite, local165 - WALL_DECO_ROT_SIZE_X_DIR[orientation] * 8, diffAverageY, local173 - WALL_DECO_ROT_SIZE_Y_DIR[orientation] * 8);
				}
				local1934 = local1950.model;
			} else {
				local1934 = new Loc(locIndex, 4, orientation, currentPlane, x, z, loc.anim, loc.allowrandomizedanimation, null);
			}
			setWallDecor(plane, x, z, averageY, local1934, null, WALL_ROTATION_TYPE1[orientation], 0, local1226 * WALL_DECO_ROT_SIZE_X_DIR[orientation], WALL_DECO_ROT_SIZE_Y_DIR[orientation] * local1226, bitset);
		} else if (locType == LocType.WALLDECOR_DIAGONAL_XOFFSET) {
			local1226 = 8;
			local1889 = getWallKey(plane, x, z);
			if (local1889 != 0L) {
				local1226 = LocTypeList.get(Integer.MAX_VALUE & (int) (local1889 >>> 32)).walloff / 2;
			}
			if (loc.anim == -1 && loc.multiLocs == null && !loc.aBoolean214) {
				local1950 = loc.method3428(orientation + 4, local165, currentHeightmap, 4, averageY, heightmap, lowmem, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					ShadowManager.method4211(local1950.sprite, local165 - anIntArray565[orientation] * 8, diffAverageY, local173 - anIntArray154[orientation] * 8);
				}
				local1934 = local1950.model;
			} else {
				local1934 = new Loc(locIndex, 4, orientation + 4, currentPlane, x, z, loc.anim, loc.allowrandomizedanimation, null);
			}
			setWallDecor(plane, x, z, averageY, local1934, null, 256, orientation, local1226 * anIntArray565[orientation], local1226 * anIntArray154[orientation], bitset);
		} else if (locType == LocType.WALLDECOR_DIAGONAL_ZOFFSET) {
			@Pc(2137) int local2137 = orientation + 2 & 0x3;
			if (loc.anim == -1 && loc.multiLocs == null && !loc.aBoolean214) {
				@Pc(2183) LocEntity local2183 = loc.method3428(local2137 + 4, local165, currentHeightmap, 4, averageY, heightmap, lowmem, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					ShadowManager.method4211(local2183.sprite, local165, diffAverageY, local173);
				}
				entity = local2183.model;
			} else {
				entity = new Loc(locIndex, 4, local2137 + 4, currentPlane, x, z, loc.anim, loc.allowrandomizedanimation, null);
			}
			setWallDecor(plane, x, z, averageY, entity, null, 256, local2137, 0, 0, bitset);
		} else if (locType == LocType.WALLDECOR_DIAGONAL_BOTH) {
			local1226 = 8;
			local1889 = getWallKey(plane, x, z);
			if (local1889 != 0L) {
				local1226 = LocTypeList.get(Integer.MAX_VALUE & (int) (local1889 >>> 32)).walloff / 2;
			}
			@Pc(2244) int local2244 = orientation + 2 & 0x3;
			@Pc(2289) Entity local2289;
			if (loc.anim == -1 && loc.multiLocs == null && !loc.aBoolean214) {
				@Pc(2297) int local2297 = anIntArray154[orientation] * 8;
				@Pc(2303) int local2303 = anIntArray565[orientation] * 8;
				@Pc(2319) LocEntity local2319 = loc.method3428(orientation + 4, local165, currentHeightmap, 4, averageY, heightmap, lowmem, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					ShadowManager.method4211(local2319.sprite, local165 - local2303, diffAverageY, local173 - local2297);
				}
				local1934 = local2319.model;
				local2319 = loc.method3428(local2244 + 4, local165, currentHeightmap, 4, averageY, heightmap, lowmem, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					ShadowManager.method4211(local2319.sprite, local165 - local2303, diffAverageY, local173 - local2297);
				}
				local2289 = local2319.model;
			} else {
				local1934 = new Loc(locIndex, 4, orientation + 4, currentPlane, x, z, loc.anim, loc.allowrandomizedanimation, null);
				local2289 = new Loc(locIndex, 4, local2244 + 4, currentPlane, x, z, loc.anim, loc.allowrandomizedanimation, null);
			}
			setWallDecor(plane, x, z, averageY, local1934, local2289, 256, orientation, local1226 * anIntArray565[orientation], anIntArray154[orientation] * local1226, bitset);
		}
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
	public static void method846() {
		if (!allLevelsAreVisible() && centralPlane != Player.plane) {
			LoginManager.method2463(Player.plane, centralZoneZ, centralZoneX, PlayerList.self.movementQueueZ[0], false, PlayerList.self.movementQueueX[0]);
		} else if (Player.plane != LightingManager.anInt2875 && MiniMap.renderMap(Player.plane)) {
			LightingManager.anInt2875 = Player.plane;
			ScriptRunner.method2218();
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZ[BII[Lclient!mj;)V")
	public static void readLocs(@OriginalArg(0) int baseX, @OriginalArg(1) boolean highmem, @OriginalArg(2) byte[] src, @OriginalArg(3) int baseZ, @OriginalArg(5) CollisionMap[] maps) {
		@Pc(10) Buffer b = new Buffer(src);

		@Pc(12) int locIndex = -1;
		while (true) {
			@Pc(16) int locOffset = b.gVarSmart();
			if (locOffset == 0) {
				return;
			}
			locIndex += locOffset;

			@Pc(27) int position = 0;
			while (true) {
				@Pc(31) int posOffset = b.gsmarts();
				if (posOffset == 0) {
					break;
				}
				position += posOffset - 1;

				@Pc(46) int z = position & 0x3F;
				@Pc(56) int x = position >> 6 & 0x3F;
				@Pc(50) int plane = position >> 12;

				@Pc(60) int flags = b.g1();
				@Pc(64) int type = flags >> 2;
				@Pc(68) int orientation = flags & 0x3;

				@Pc(72) int tileX = x + baseX;
				@Pc(76) int tileZ = z + baseZ;
				if (tileX > 0 && tileZ > 0 && tileX < 103 && tileZ < 103) {
					@Pc(90) CollisionMap map = null;
					if (!highmem) {
						@Pc(95) int markingPlane = plane;
						// might be used with bridges?
						if ((renderFlags[1][tileX][tileZ] & 0x2) == 2) {
							markingPlane--;
						}
						if (markingPlane >= 0) {
							map = maps[markingPlane];
						}
					}

					addLoc(plane, !highmem, plane, highmem, map, locIndex, type, tileX, tileZ, orientation);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!th;III)V")
	public static void method3574(@OriginalArg(0) Entity arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Tile local12;
		if (arg2 < width) {
			local12 = tiles[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.groundDecor != null && local12.groundDecor.entity.method4543()) {
				arg0.method4544(local12.groundDecor.entity, 128, 0, 0, true);
			}
		}
		if (arg3 < width) {
			local12 = tiles[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.groundDecor != null && local12.groundDecor.entity.method4543()) {
				arg0.method4544(local12.groundDecor.entity, 0, 0, 128, true);
			}
		}
		if (arg2 < width && arg3 < length) {
			local12 = tiles[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.groundDecor != null && local12.groundDecor.entity.method4543()) {
				arg0.method4544(local12.groundDecor.entity, 128, 0, 128, true);
			}
		}
		if (arg2 < width && arg3 > 0) {
			local12 = tiles[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.groundDecor != null && local12.groundDecor.entity.method4543()) {
				arg0.method4544(local12.groundDecor.entity, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
	public static void method2954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= width * 128) {
			arg0 = width * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= length * 128) {
			arg2 = length * 128 - 1;
		}
		anInt2886 = MathUtils.sin[arg3];
		anInt3038 = MathUtils.cos[arg3];
		anInt5205 = MathUtils.sin[arg4];
		anInt2222 = MathUtils.cos[arg4];
		anInt3555 = arg0;
		anInt3947 = arg1;
		anInt4903 = arg2;
		anInt4069 = arg0 / 128;
		anInt4539 = arg2 / 128;
		LightingManager.anInt987 = anInt4069 - visibility;
		if (LightingManager.anInt987 < 0) {
			LightingManager.anInt987 = 0;
		}
		LightingManager.anInt4698 = anInt4539 - visibility;
		if (LightingManager.anInt4698 < 0) {
			LightingManager.anInt4698 = 0;
		}
		LightingManager.anInt15 = anInt4069 + visibility;
		if (LightingManager.anInt15 > width) {
			LightingManager.anInt15 = width;
		}
		LightingManager.anInt4866 = anInt4539 + visibility;
		if (LightingManager.anInt4866 > length) {
			LightingManager.anInt4866 = length;
		}
		@Pc(99) short local99;
		if (GlRenderer.enabled) {
			local99 = (short) GlobalConfig.VIEW_DISTANCE;
		} else {
			local99 = 3500;
		}
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (local104 = 0; local104 < visibility + visibility + 2; local104++) {
			for (local113 = 0; local113 < visibility + visibility + 2; local113++) {
				@Pc(130) int local130 = (local104 - visibility << 7) - (anInt3555 & 0x7F);
				@Pc(140) int local140 = (local113 - visibility << 7) - (anInt4903 & 0x7F);
				@Pc(146) int local146 = anInt4069 + local104 - visibility;
				@Pc(152) int local152 = anInt4539 + local113 - visibility;
				if (local146 >= 0 && local152 >= 0 && local146 < width && local152 < length) {
					@Pc(176) int local176;
					if (underwaterTileHeights == null) {
						local176 = surfaceTileHeights[0][local146][local152] + 128 - anInt3947;
					} else {
						local176 = underwaterTileHeights[0][local146][local152] + 128 - anInt3947;
					}
					@Pc(201) int local201 = surfaceTileHeights[3][local146][local152] - anInt3947 - 1000;
					aBooleanArrayArray3[local104][local113] = method3049(local130, local201, local176, local140, local99);
				} else {
					aBooleanArrayArray3[local104][local113] = false;
				}
			}
		}
		for (local104 = 0; local104 < visibility + visibility + 1; local104++) {
			for (local113 = 0; local113 < visibility + visibility + 1; local113++) {
				aBooleanArrayArray1[local104][local113] = aBooleanArrayArray3[local104][local113] || aBooleanArrayArray3[local104 + 1][local113] || aBooleanArrayArray3[local104][local113 + 1] || aBooleanArrayArray3[local104 + 1][local113 + 1];
			}
		}
		anIntArray8 = arg6;
		anIntArray292 = arg7;
		anIntArray234 = arg8;
		anIntArray454 = arg9;
		anIntArray427 = arg10;
		method2419();
		if (underWaterGroundTiles != null) {
			setUnderwater(true);
			method3292(arg0, arg1, arg2, null, 0, (byte) 0, arg13, arg14);
			if (GlRenderer.enabled) {
				MaterialManager.renderingUnderwater = false;
				MaterialManager.setMaterial(0, 0);
				FogManager.setFogColor(null);
				LightingManager.method2390();
			}
			setUnderwater(false);
		}
		method3292(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
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
		for (@Pc(23) int local23 = anInt5276; local23 < levels; local23++) {
			@Pc(30) Tile[][] local30 = tiles[local23];
			for (local32 = LightingManager.anInt987; local32 < LightingManager.anInt15; local32++) {
				for (local37 = LightingManager.anInt4698; local37 < LightingManager.anInt4866; local37++) {
					@Pc(46) Tile local46 = local30[local32][local37];
					if (local46 != null) {
						if (aBooleanArrayArray1[local32 + visibility - anInt4069][local37 + visibility - anInt4539] && (arg3 == null || local23 < arg4 || arg3[local23][local32][local37] != arg5)) {
							local46.aBoolean45 = true;
							local46.aBoolean46 = true;
							local46.aBoolean47 = local46.sceneryLen > 0;
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
									local134.primary.method4545(local134.anInt1388, local23, local134.anInt1391, local134.xFine, local134.zFine);
									if (local134.secondary != null) {
										local134.secondary.method4545(local134.anInt1388, local23, local134.anInt1391, local134.xFine, local134.zFine);
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
		@Pc(240) boolean local240 = tileHeights == underwaterTileHeights;
		if (GlRenderer.enabled) {
			@Pc(244) GL2 gl = GlRenderer.gl;
			gl.glPushMatrix();
			gl.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
			if (local240) {
				UnderwaterMaterialRenderer.applyFogFade();
				MaterialManager.setMaterial(-1, 3);
				MaterialManager.renderingUnderwater = true;
				UnderwaterMaterialRenderer.method4609();
				anInt3604 = -1;
				anInt730 = -1;
				for (local32 = 0; local32 < underwaterHdTiles[0].length; local32++) {
					@Pc(285) GlTile local285 = underwaterHdTiles[0][local32];
					@Pc(294) float local294 = 251.5F - (local285.blend ? 1.0F : 0.5F);
					if (local285.underwaterColor != anInt3604) {
						anInt3604 = local285.underwaterColor;
						WaterMaterialRenderer.method619(local285.underwaterColor);
						FogManager.setFogColor(WaterMaterialRenderer.method2422());
					}
					local285.method1944(tiles, local294, false);
				}
				UnderwaterMaterialRenderer.method4608();
			} else {
				local32 = anInt5276;
				while (true) {
					if (local32 >= levels) {
						LightingManager.method2402(anInt4069, anInt4539, tiles);
						break;
					}
					for (local37 = 0; local37 < underwaterHdTiles[local32].length; local37++) {
						@Pc(336) GlTile local336 = underwaterHdTiles[local32][local37];
						@Pc(350) float local350 = 201.5F - (float) local32 * 50.0F - (local336.blend ? 1.0F : 0.5F);
						if (local336.texture != -1 && Rasteriser.textureProvider.getMaterialType(local336.texture) == MaterialManager.WATER && Preferences.highWaterDetail) {
							WaterMaterialRenderer.method619(local336.underwaterColor);
						}
						local336.method1944(tiles, local350, false);
					}
					if (local32 == 0 && Preferences.sceneryShadowsType > 0) {
						GlRenderer.method4159(101.5F);
						ShadowManager.method4198(anInt4069, anInt4539, visibility, arg1, aBooleanArrayArray1, tileHeights[0]);
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
		for (local399 = anInt5276; local399 < levels; local399++) {
			local406 = tiles[local399];
			for (local37 = -visibility; local37 <= 0; local37++) {
				local415 = anInt4069 + local37;
				local183 = anInt4069 - local37;
				if (local415 >= LightingManager.anInt987 || local183 < LightingManager.anInt15) {
					for (local428 = -visibility; local428 <= 0; local428++) {
						local434 = anInt4539 + local428;
						local438 = anInt4539 - local428;
						if (local415 >= LightingManager.anInt987) {
							if (local434 >= LightingManager.anInt4698) {
								local450 = local406[local415][local434];
								if (local450 != null && local450.aBoolean45) {
									method4245(local450, true);
								}
							}
							if (local438 < LightingManager.anInt4866) {
								local450 = local406[local415][local438];
								if (local450 != null && local450.aBoolean45) {
									method4245(local450, true);
								}
							}
						}
						if (local183 < LightingManager.anInt15) {
							if (local434 >= LightingManager.anInt4698) {
								local450 = local406[local183][local434];
								if (local450 != null && local450.aBoolean45) {
									method4245(local450, true);
								}
							}
							if (local438 < LightingManager.anInt4866) {
								local450 = local406[local183][local438];
								if (local450 != null && local450.aBoolean45) {
									method4245(local450, true);
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
		for (local399 = anInt5276; local399 < levels; local399++) {
			local406 = tiles[local399];
			for (local37 = -visibility; local37 <= 0; local37++) {
				local415 = anInt4069 + local37;
				local183 = anInt4069 - local37;
				if (local415 >= LightingManager.anInt987 || local183 < LightingManager.anInt15) {
					for (local428 = -visibility; local428 <= 0; local428++) {
						local434 = anInt4539 + local428;
						local438 = anInt4539 - local428;
						if (local415 >= LightingManager.anInt987) {
							if (local434 >= LightingManager.anInt4698) {
								local450 = local406[local415][local434];
								if (local450 != null && local450.aBoolean45) {
									method4245(local450, false);
								}
							}
							if (local438 < LightingManager.anInt4866) {
								local450 = local406[local415][local438];
								if (local450 != null && local450.aBoolean45) {
									method4245(local450, false);
								}
							}
						}
						if (local183 < LightingManager.anInt15) {
							if (local434 >= LightingManager.anInt4698) {
								local450 = local406[local183][local434];
								if (local450 != null && local450.aBoolean45) {
									method4245(local450, false);
								}
							}
							if (local438 < LightingManager.anInt4866) {
								local450 = local406[local183][local438];
								if (local450 != null && local450.aBoolean45) {
									method4245(local450, false);
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

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	public static void method2750(@OriginalArg(0) int arg0) {
		anInt5276 = arg0;
		for (@Pc(3) int local3 = 0; local3 < width; local3++) {
			for (@Pc(8) int local8 = 0; local8 < length; local8++) {
				if (tiles[arg0][local3][local8] == null) {
					tiles[arg0][local3][local8] = new Tile(arg0, local3, local8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIILclient!th;JLclient!th;Lclient!th;)V")
	public static void setObjStack(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) int arg3, @OriginalArg(4) Entity primary, @OriginalArg(5) long arg5, @OriginalArg(6) Entity secondary, @OriginalArg(7) Entity tertiary) {
		@Pc(3) ObjStackEntity entity = new ObjStackEntity();
		entity.primary = primary;
		entity.xFine = x * 128 + 64;
		entity.zFine = z * 128 + 64;
		entity.anInt3057 = arg3;
		entity.key = arg5;
		entity.secondary = secondary;
		entity.tertiary = tertiary;
		@Pc(34) int local34 = 0;
		@Pc(42) Tile local42 = tiles[level][x][z];
		if (local42 != null) {
			for (@Pc(46) int i = 0; i < local42.sceneryLen; i++) {
				@Pc(55) Scenery scenery = local42.scenery[i];
				if ((scenery.key & 0x400000L) == 4194304L) {
					@Pc(66) int minY = scenery.entity.getMinY();
					if (minY != -32768 && minY < local34) {
						local34 = minY;
					}
				}
			}
		}
		entity.anInt3063 = -local34;
		if (tiles[level][x][z] == null) {
			tiles[level][x][z] = new Tile(level, x, z);
		}
		tiles[level][x][z].objStack = entity;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!th;IIIII)V")
	public static void method1544(@OriginalArg(0) Entity arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != levels) {
				for (@Pc(28) int local28 = local3; local28 <= local7; local28++) {
					if (local28 >= 0 && local28 < width) {
						for (@Pc(39) int local39 = local11; local39 <= local15; local39++) {
							if (local39 >= 0 && local39 < length && (!local1 || local28 >= local7 || local39 >= local15 || local39 < arg3 && local28 != arg2)) {
								@Pc(71) Tile local71 = tiles[local17][local28][local39];
								if (local71 != null) {
									@Pc(158) int local158 = (tileHeights[local17][local28][local39] + tileHeights[local17][local28 + 1][local39] + tileHeights[local17][local28][local39 + 1] + tileHeights[local17][local28 + 1][local39 + 1]) / 4 - (tileHeights[arg1][arg2][arg3] + tileHeights[arg1][arg2 + 1][arg3] + tileHeights[arg1][arg2][arg3 + 1] + tileHeights[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(161) Wall local161 = local71.wall;
									if (local161 != null) {
										if (local161.primary.method4543()) {
											arg0.method4544(local161.primary, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local161.secondary != null && local161.secondary.method4543()) {
											arg0.method4544(local161.secondary, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(232) int local232 = 0; local232 < local71.sceneryLen; local232++) {
										@Pc(241) Scenery local241 = local71.scenery[local232];
										if (local241 != null && local241.entity.method4543() && (local28 == local241.xMin || local28 == local3) && (local39 == local241.zMin || local39 == local11)) {
											@Pc(270) int local270 = local241.xMax + 1 - local241.xMin;
											@Pc(278) int local278 = local241.zMax + 1 - local241.zMin;
											arg0.method4544(local241.entity, (local241.xMin - arg2) * 128 + (local270 - arg4) * 64, local158, (local241.zMin - arg3) * 128 + (local278 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIII)V")
	public static void setWallDecoration(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Tile local7 = tiles[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) WallDecor local13 = local7.wallDecor;
		if (local13 != null) {
			local13.xOffset = local13.xOffset * arg3 / 16;
			local13.zOffset = local13.zOffset * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([[F[[B[[B[Lclient!gi;II[[F[[B[[B[[II[[F)V")
	public static void method3393(@OriginalArg(0) float[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) Light[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[][] arg6, @OriginalArg(7) byte[][] arg7, @OriginalArg(8) byte[][] arg8, @OriginalArg(9) int[][] arg9, @OriginalArg(11) float[][] arg10) {
		for (@Pc(7) int local7 = 0; local7 < arg5; local7++) {
			@Pc(18) Light local18 = arg3[local7];
			if (local18.level == arg4) {
				@Pc(24) int local24 = 0;
				@Pc(28) Light_Class45 local28 = new Light_Class45();
				@Pc(37) int local37 = (local18.x >> 7) - local18.radius;
				@Pc(46) int local46 = (local18.z >> 7) - local18.radius;
				if (local46 < 0) {
					local24 = -local46;
					local46 = 0;
				}
				@Pc(65) int local65 = local18.radius + (local18.z >> 7);
				if (local65 > 103) {
					local65 = 103;
				}
				@Pc(72) int local72;
				@Pc(84) short local84;
				@Pc(90) int local90;
				@Pc(99) int local99;
				@Pc(114) int local114;
				@Pc(133) int local133;
				@Pc(328) boolean local328;
				@Pc(355) int local355;
				for (local72 = local46; local72 <= local65; local72++) {
					local84 = local18.aShortArray30[local24];
					local90 = local37 + (local84 >> 8);
					local99 = local90 + (local84 & 0xFF) - 1;
					if (local99 > 103) {
						local99 = 103;
					}
					if (local90 < 0) {
						local90 = 0;
					}
					for (local114 = local90; local114 <= local99; local114++) {
						@Pc(125) int local125 = arg1[local114][local72] & 0xFF;
						local133 = arg8[local114][local72] & 0xFF;
						@Pc(135) boolean local135 = false;
						@Pc(151) FloType local151;
						@Pc(176) int[] local176;
						@Pc(234) int[] local234;
						if (local125 == 0) {
							if (local133 == 0) {
								continue;
							}
							local151 = FloTypeList.method4395(local133 - 1);
							if (local151.baseColor == -1) {
								continue;
							}
							if (arg7[local114][local72] != 0) {
								local176 = anIntArrayArray35[arg7[local114][local72]];
								local28.anInt2016 += ((local176.length >> 1) - 2) * 3;
								local28.anInt2019 += local176.length >> 1;
								continue;
							}
						} else if (local133 != 0) {
							local151 = FloTypeList.method4395(local133 - 1);
							@Pc(224) byte local224;
							if (local151.baseColor == -1) {
								local224 = arg7[local114][local72];
								if (local224 != 0) {
									local234 = anIntArrayArray8[local224];
									local28.anInt2016 += ((local234.length >> 1) - 2) * 3;
									local28.anInt2019 += local234.length >> 1;
								}
								continue;
							}
							local224 = arg7[local114][local72];
							if (local224 != 0) {
								local135 = true;
							}
						}
						@Pc(275) Scenery local275 = getScenery(arg4, local114, local72);
						if (local275 != null) {
							@Pc(287) int local287 = (int) (local275.key >> 14) & 0x3F;
							if (local287 == 9) {
								local234 = null;
								@Pc(302) int local302 = (int) (local275.key >> 20) & 0x3;
								@Pc(315) boolean local315;
								@Pc(343) short local343;
								@Pc(349) int local349;
								if ((local302 & 0x1) == 0) {
									local328 = local99 >= local114 + 1;
									local315 = local114 - 1 >= local90;
									if (!local315 && local72 + 1 <= local65) {
										local343 = local18.aShortArray30[local24 + 1];
										local349 = local37 + (local343 >> 8);
										local355 = local349 + (local343 & 0xFF);
										local315 = local349 < local114 && local114 < local355;
									}
									if (!local328 && local72 - 1 >= local46) {
										local343 = local18.aShortArray30[local24 - 1];
										local349 = local37 + (local343 >> 8);
										local355 = local349 + (local343 & 0xFF);
										local328 = local114 > local349 && local114 < local355;
									}
									if (local315 && local328) {
										local234 = anIntArrayArray35[0];
									} else if (local315) {
										local234 = anIntArrayArray35[1];
									} else if (local328) {
										local234 = anIntArrayArray35[1];
									}
								} else {
									local315 = local90 <= local114 - 1;
									local328 = local114 + 1 <= local99;
									if (!local315 && local72 - 1 >= local46) {
										local343 = local18.aShortArray30[local24 - 1];
										local349 = (local343 >> 8) + local37;
										local355 = local349 + (local343 & 0xFF);
										local315 = local349 < local114 && local114 < local355;
									}
									if (!local328 && local72 + 1 <= local65) {
										local343 = local18.aShortArray30[local24 + 1];
										local349 = (local343 >> 8) + local37;
										local355 = local349 + (local343 & 0xFF);
										local328 = local349 < local114 && local355 > local114;
									}
									if (local315 && local328) {
										local234 = anIntArrayArray35[0];
									} else if (local315) {
										local234 = anIntArrayArray35[1];
									} else if (local328) {
										local234 = anIntArrayArray35[1];
									}
								}
								if (local234 != null) {
									local28.anInt2016 += (local234.length >> 1) * 3 - 6;
									local28.anInt2019 += local234.length >> 1;
								}
								continue;
							}
						}
						if (local135) {
							local234 = anIntArrayArray8[arg7[local114][local72]];
							local176 = anIntArrayArray35[arg7[local114][local72]];
							local28.anInt2016 += ((local176.length >> 1) - 2) * 3;
							local28.anInt2016 += ((local234.length >> 1) - 2) * 3;
							local28.anInt2019 += local176.length >> 1;
							local28.anInt2019 += local234.length >> 1;
						} else {
							local176 = anIntArrayArray35[0];
							local28.anInt2016 += ((local176.length >> 1) - 2) * 3;
							local28.anInt2019 += local176.length >> 1;
						}
					}
					local24++;
				}
				local24 = 0;
				local28.method1555();
				if ((local18.z >> 7) - local18.radius < 0) {
					local24 = local18.radius - (local18.z >> 7);
				}
				for (local72 = local46; local72 <= local65; local72++) {
					local84 = local18.aShortArray30[local24];
					local90 = (local84 >> 8) + local37;
					local99 = (local84 & 0xFF) + local90 - 1;
					if (local99 > 103) {
						local99 = 103;
					}
					if (local90 < 0) {
						local90 = 0;
					}
					for (local114 = local90; local114 <= local99; local114++) {
						@Pc(775) int local775 = arg8[local114][local72] & 0xFF;
						local133 = arg1[local114][local72] & 0xFF;
						@Pc(789) byte local789 = arg2[local114][local72];
						@Pc(791) boolean local791 = false;
						@Pc(805) FloType local805;
						if (local133 == 0) {
							if (local775 == 0) {
								continue;
							}
							local805 = FloTypeList.method4395(local775 - 1);
							if (local805.baseColor == -1) {
								continue;
							}
							if (arg7[local114][local72] != 0) {
								method2578(arg0, arg9, local114, arg6, local72, anIntArrayArray35[arg7[local114][local72]], local28, local18, arg10, arg2[local114][local72]);
								continue;
							}
						} else if (local775 != 0) {
							local805 = FloTypeList.method4395(local775 - 1);
							if (local805.baseColor == -1) {
								method2578(arg0, arg9, local114, arg6, local72, anIntArrayArray8[arg7[local114][local72]], local28, local18, arg10, arg2[local114][local72]);
								continue;
							}
							@Pc(815) byte local815 = arg7[local114][local72];
							if (local815 != 0) {
								local791 = true;
							}
						}
						@Pc(899) Scenery local899 = getScenery(arg4, local114, local72);
						if (local899 != null) {
							@Pc(911) int local911 = (int) (local899.key >> 14) & 0x3F;
							if (local911 == 9) {
								@Pc(917) int[] local917 = null;
								@Pc(925) int local925 = (int) (local899.key >> 20) & 0x3;
								@Pc(973) int local973;
								@Pc(947) boolean local947;
								@Pc(961) short local961;
								if ((local925 & 0x1) == 0) {
									local328 = local114 - 1 >= local90;
									local947 = local99 >= local114 + 1;
									if (!local328 && local65 >= local72 + 1) {
										local961 = local18.aShortArray30[local24 + 1];
										local355 = (local961 >> 8) + local37;
										local973 = (local961 & 0xFF) + local355;
										local328 = local114 > local355 && local973 > local114;
									}
									if (!local947 && local72 - 1 >= local46) {
										local961 = local18.aShortArray30[local24 - 1];
										local355 = local37 + (local961 >> 8);
										local973 = (local961 & 0xFF) + local355;
										local947 = local355 < local114 && local973 > local114;
									}
									if (local328 && local947) {
										local917 = anIntArrayArray35[0];
									} else if (local328) {
										local917 = anIntArrayArray35[1];
										local789 = 1;
									} else if (local947) {
										local917 = anIntArrayArray35[1];
										local789 = 3;
									}
								} else {
									local328 = local114 - 1 >= local90;
									local947 = local99 >= local114 + 1;
									if (!local328 && local46 <= local72 - 1) {
										local961 = local18.aShortArray30[local24 - 1];
										local355 = local37 + (local961 >> 8);
										local973 = (local961 & 0xFF) + local355;
										local328 = local114 > local355 && local973 > local114;
									}
									if (!local947 && local65 >= local72 + 1) {
										local961 = local18.aShortArray30[local24 + 1];
										local355 = local37 + (local961 >> 8);
										local973 = (local961 & 0xFF) + local355;
										local947 = local114 > local355 && local973 > local114;
									}
									if (local328 && local947) {
										local917 = anIntArrayArray35[0];
									} else if (local328) {
										local789 = 0;
										local917 = anIntArrayArray35[1];
									} else if (local947) {
										local917 = anIntArrayArray35[1];
										local789 = 2;
									}
								}
								if (local917 != null) {
									method2578(arg0, arg9, local114, arg6, local72, local917, local28, local18, arg10, local789);
								}
								continue;
							}
						}
						if (local791) {
							method2578(arg0, arg9, local114, arg6, local72, anIntArrayArray8[arg7[local114][local72]], local28, local18, arg10, arg2[local114][local72]);
							method2578(arg0, arg9, local114, arg6, local72, anIntArrayArray35[arg7[local114][local72]], local28, local18, arg10, arg2[local114][local72]);
						} else {
							method2578(arg0, arg9, local114, arg6, local72, anIntArrayArray35[0], local28, local18, arg10, local789);
						}
					}
					local24++;
				}
				if (local28.anInt2017 > 0 && local28.anInt2018 > 0) {
					local28.method1554();
					local18.aClass45_1 = local28;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "([[[B[[B[[B[[I[[F[[I[[B[[B[[FI[[F[[I[[I[[II)[Lclient!hg;")
	public static GlTile[] method3501(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) byte[][] arg7, @OriginalArg(8) float[][] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) float[][] arg10, @OriginalArg(11) int[][] arg11, @OriginalArg(12) int[][] arg12, @OriginalArg(13) int[][] arg13) {
		@Pc(9) int[][] local9 = new int[105][105];
		@Pc(16) int local16;
		for (@Pc(11) int local11 = 1; local11 <= 103; local11++) {
			for (local16 = 1; local16 <= 103; local16++) {
				@Pc(25) byte local25 = arg2[local11][local16];
				if (local25 == 0) {
					local25 = arg2[local11 - 1][local16];
				}
				if (local25 == 0) {
					local25 = arg2[local11][local16 - 1];
				}
				if (local25 == 0) {
					local25 = arg2[local11 - 1][local16 - 1];
				}
				if (local25 != 0) {
					@Pc(77) FluType local77 = FluTypeList.get((local25 & 0xFF) - 1);
					local9[local11][local16] = (local77.texture + 1 << 16) + local77.anInt4156;
				}
			}
		}
		@Pc(103) HashTable local103 = new HashTable(128);
		@Pc(155) int local155;
		@Pc(161) int local161;
		@Pc(169) int local169;
		@Pc(112) int local112;
		for (local16 = 1; local16 <= 102; local16++) {
			for (local112 = 1; local112 <= 102; local112++) {
				if (arg2[local16][local112] != 0) {
					@Pc(135) int[] local135;
					if (arg6[local16][local112] == 0) {
						local135 = anIntArrayArray35[0];
					} else {
						local135 = anIntArrayArray8[arg1[local16][local112]];
						if (local135.length == 0) {
							continue;
						}
					}
					local155 = 0;
					local161 = local9[local16][local112];
					local169 = local9[local16 + 1][local112];
					if (arg5 != null) {
						local155 = arg5[local16][local112] & 0xFFFFFF;
					}
					@Pc(188) long local188 = (long) local155 | (long) local169 << 32;
					@Pc(196) int local196 = local9[local16][local112 + 1];
					@Pc(206) int local206 = local9[local16 + 1][local112 + 1];
					@Pc(214) long local214 = (long) local196 << 32 | (long) local155;
					@Pc(219) int local219 = local135.length / 2;
					@Pc(227) long local227 = (long) local155 | (long) local161 << 32;
					@Pc(233) GlTile local233 = (GlTile) local103.get(local227);
					if (local233 == null) {
						local233 = new GlTile((local161 >> 16) - 1, (float) (local161 & 0xFFFF), false, arg13 != null, local155);
						local103.put(local233, local227);
					}
					local233.anInt2484++;
					local233.anInt2482 += local219;
					if (local188 != local227) {
						local233 = (GlTile) local103.get(local188);
						if (local233 == null) {
							local233 = new GlTile((local169 >> 16) - 1, (float) (local169 & 0xFFFF), false, arg13 != null, local155);
							local103.put(local233, local188);
						}
						local233.anInt2484++;
						local233.anInt2482 += local219;
					}
					@Pc(340) long local340 = (long) local206 << 32 | (long) local155;
					if (local340 != local227 && local340 != local188) {
						local233 = (GlTile) local103.get(local340);
						if (local233 == null) {
							local233 = new GlTile((local206 >> 16) - 1, (float) (local206 & 0xFFFF), false, arg13 != null, local155);
							local103.put(local233, local340);
						}
						local233.anInt2482 += local219;
						local233.anInt2484++;
					}
					if (local214 != local227 && local188 != local214 && local214 != local340) {
						local233 = (GlTile) local103.get(local214);
						if (local233 == null) {
							local233 = new GlTile((local196 >> 16) - 1, (float) (local196 & 0xFFFF), false, arg13 != null, local155);
							local103.put(local233, local214);
						}
						local233.anInt2484++;
						local233.anInt2482 += local219;
					}
				}
			}
		}
		@Pc(493) GlTile local493;
		for (local493 = (GlTile) local103.head(); local493 != null; local493 = (GlTile) local103.next()) {
			local493.method1940();
		}
		for (local16 = 1; local16 <= 102; local16++) {
			for (local112 = 1; local112 <= 102; local112++) {
				@Pc(524) byte local524 = arg2[local16][local112];
				if (local524 != 0) {
					if ((arg0[arg9][local16][local112] & 0x8) != 0) {
						local155 = 0;
					} else if ((arg0[1][local16][local112] & 0x2) == 2 && arg9 > 0) {
						local155 = arg9 - 1;
					} else {
						local155 = arg9;
					}
					local161 = 0;
					@Pc(574) boolean[] local574 = null;
					local169 = 128;
					if (arg5 != null) {
						local169 = arg5[local16][local112] >>> 24 << 3;
						local161 = arg5[local16][local112] & 0xFFFFFF;
					}
					@Pc(655) int local655;
					@Pc(712) int local712;
					@Pc(614) int[] local614;
					@Pc(628) byte local628;
					@Pc(678) int local678;
					@Pc(754) int local754;
					if (arg6[local16][local112] == 0) {
						local655 = local524 == arg2[local16 - 1][local112 - 1] ? 1 : -1;
						local614 = anIntArrayArray35[0];
						local678 = local524 == arg2[local16 + 1][local112 - 1] ? 1 : -1;
						if (arg2[local16][local112 - 1] == local524) {
							local678++;
							local655++;
						} else {
							local655--;
							local678--;
						}
						local712 = local524 == arg2[local16 + 1][local112 + 1] ? 1 : -1;
						if (local524 == arg2[local16 + 1][local112]) {
							local712++;
							local678++;
						} else {
							local678--;
							local712--;
						}
						local754 = local524 == arg2[local16 - 1][local112 + 1] ? 1 : -1;
						if (arg2[local16][local112 + 1] == local524) {
							local754++;
							local712++;
						} else {
							local712--;
							local754--;
						}
						if (arg2[local16 - 1][local112] == local524) {
							local754++;
							local655++;
						} else {
							local754--;
							local655--;
						}
						@Pc(789) int local789 = local655 - local712;
						@Pc(794) int local794 = local678 - local754;
						if (local794 < 0) {
							local794 = -local794;
						}
						if (local789 < 0) {
							local789 = -local789;
						}
						local628 = (byte) (local794 <= local789 ? 0 : 1);
						arg7[local16][local112] = local628;
					} else {
						local614 = anIntArrayArray8[arg1[local16][local112]];
						local574 = aBooleanArrayArray2[arg1[local16][local112]];
						local628 = arg7[local16][local112];
						if (local614.length == 0) {
							continue;
						}
					}
					local655 = local9[local16][local112];
					local678 = local9[local16 + 1][local112];
					local712 = local9[local16 + 1][local112 + 1];
					@Pc(861) long local861 = (long) local655 << 32 | (long) local161;
					@Pc(869) long local869 = (long) local678 << 32 | (long) local161;
					@Pc(877) long local877 = (long) local712 << 32 | (long) local161;
					@Pc(883) int local883 = arg11[local16][local112];
					local754 = local9[local16][local112 + 1];
					@Pc(901) int local901 = arg11[local16 + 1][local112 + 1];
					@Pc(909) int local909 = arg11[local16 + 1][local112];
					@Pc(917) long local917 = (long) local161 | (long) local754 << 32;
					@Pc(925) int local925 = arg11[local16][local112 + 1];
					@Pc(931) int local931 = arg3[local16][local112];
					@Pc(939) int local939 = arg3[local16 + 1][local112];
					@Pc(949) int local949 = arg3[local16 + 1][local112 + 1];
					@Pc(957) int local957 = arg3[local16][local112 + 1];
					@Pc(963) int local963 = (local678 >> 16) - 1;
					@Pc(969) int local969 = (local655 >> 16) - 1;
					@Pc(975) int local975 = (local712 >> 16) - 1;
					@Pc(981) GlTile local981 = (GlTile) local103.get(local861);
					method1291(arg13, local655 <= local655, method588(local969, local883, local931), local981, local614, local112, local155, local16, local655 <= local712, arg8, local754 >= local655, arg4, local169, method588(local969, local925, local957), method588(local969, local901, local949), local655 <= local678, arg12, arg10, local628, method588(local969, local909, local939), local574);
					@Pc(1050) int local1050 = (local754 >> 16) - 1;
					if (local869 != local861) {
						local981 = (GlTile) local103.get(local869);
						method1291(arg13, local678 <= local655, method588(local963, local883, local931), local981, local614, local112, local155, local16, local712 >= local678, arg8, local678 <= local754, arg4, local169, method588(local963, local925, local957), method588(local963, local901, local949), local678 <= local678, arg12, arg10, local628, method588(local963, local909, local939), local574);
					}
					if (local877 != local861 && local877 != local869) {
						local981 = (GlTile) local103.get(local877);
						method1291(arg13, local655 >= local712, method588(local975, local883, local931), local981, local614, local112, local155, local16, local712 <= local712, arg8, local712 <= local754, arg4, local169, method588(local975, local925, local957), method588(local975, local901, local949), local678 >= local712, arg12, arg10, local628, method588(local975, local909, local939), local574);
					}
					if (local917 != local861 && local917 != local869 && local917 != local877) {
						local981 = (GlTile) local103.get(local917);
						method1291(arg13, local754 <= local655, method588(local1050, local883, local931), local981, local614, local112, local155, local16, local754 <= local712, arg8, local754 >= local754, arg4, local169, method588(local1050, local925, local957), method588(local1050, local901, local949), local678 >= local754, arg12, arg10, local628, method588(local1050, local909, local939), local574);
					}
				}
			}
		}
		for (local493 = (GlTile) local103.head(); local493 != null; local493 = (GlTile) local103.next()) {
			if (local493.anInt2483 == 0) {
				local493.unlink();
			} else {
				local493.method1943();
			}
		}
		local16 = local103.size();
		@Pc(1348) GlTile[] local1348 = new GlTile[local16];
		local103.method3865(local1348);
		@Pc(1358) long[] local1358 = new long[local16];
		for (local155 = 0; local155 < local16; local155++) {
			local1358[local155] = local1348[local155].key;
		}
		ArrayUtils.sort(local1358, local1348);
		return local1348;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([[IZILclient!hg;[IIIIZ[[FZI[[FIIIZ[[I[[FBI[Z)V")
	public static void method1291(@OriginalArg(0) int[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) GlTile arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) float[][] arg9, @OriginalArg(10) boolean arg10, @OriginalArg(12) float[][] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) boolean arg15, @OriginalArg(17) int[][] arg16, @OriginalArg(18) float[][] arg17, @OriginalArg(19) byte arg18, @OriginalArg(20) int arg19, @OriginalArg(21) boolean[] arg20) {
		@Pc(11) int local11 = (arg2 << 8) + (arg1 ? 255 : 0);
		@Pc(25) int local25 = (arg8 ? 255 : 0) + (arg14 << 8);
		@Pc(31) int[] local31 = new int[arg4.length / 2];
		@Pc(41) int local41 = (arg10 ? 255 : 0) + (arg13 << 8);
		@Pc(51) int local51 = (arg19 << 8) + (arg15 ? 255 : 0);
		for (@Pc(53) int local53 = 0; local53 < local31.length; local53++) {
			@Pc(67) int local67 = arg4[local53 + local53];
			@Pc(80) int[][] local80 = arg0 == null || arg20 == null || !arg20[local53] ? arg16 : arg0;
			@Pc(88) int local88 = arg4[local53 + local53 + 1];
			local31[local53] = method3683(local41, (float) arg12, local11, local51, arg0, local80, arg7, arg17, local25, arg18, false, arg3, arg9, arg5, local67, arg11, local88);
		}
		arg3.method1945(arg6, arg7, arg5, local31, null, false);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 1 || arg4 < 1 || arg1 > 102 || arg4 > 102) {
			return;
		}
		@Pc(39) int local39;
		if (!allLevelsAreVisible() && (renderFlags[0][arg1][arg4] & 0x2) == 0) {
			local39 = arg2;
			if ((renderFlags[arg2][arg1][arg4] & 0x8) != 0) {
				local39 = 0;
			}
			if (local39 != centralPlane) {
				return;
			}
		}
		local39 = arg2;
		if (arg2 < 3 && (renderFlags[1][arg1][arg4] & 0x2) == 2) {
			local39 = arg2 + 1;
		}
		method1144(arg4, arg1, arg2, arg6, local39, PathFinder.collisionMaps[arg2]);
		if (arg0 >= 0) {
			@Pc(92) boolean local92 = Preferences.showGroundDecorations;
			Preferences.showGroundDecorations = true;
			addLoc(local39, false, arg2, false, PathFinder.collisionMaps[arg2], arg0, arg5, arg1, arg4, arg3);
			Preferences.showGroundDecorations = local92;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIILclient!th;IJ)Z")
	public static boolean method35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Entity arg6, @OriginalArg(8) long arg7) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return method2256(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, 0, false, arg7);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)I")
	public static int getRenderLevel(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((renderFlags[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (renderFlags[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!rh;IIIIIIIZ)V")
	public static void method2610(@OriginalArg(0) PlainTile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - anInt3555;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - anInt4903;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = tileHeights[arg1][arg6][arg7] - anInt3947;
		@Pc(49) int local49 = tileHeights[arg1][arg6 + 1][arg7] - anInt3947;
		@Pc(63) int local63 = tileHeights[arg1][arg6 + 1][arg7 + 1] - anInt3947;
		@Pc(75) int local75 = tileHeights[arg1][arg6][arg7 + 1] - anInt3947;
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
			if (MiniMenu.aBoolean187 && method583(MiniMenu.anInt2388 + Rasteriser.centerX, MiniMenu.anInt3259 + Rasteriser.centerY, local315, local331, local299, local307, local323, local291)) {
				MiniMenu.anInt1742 = arg6;
				MiniMenu.anInt2954 = arg7;
			}
			if (!GlRenderer.enabled && !arg8) {
				Rasteriser.testX = local307 < 0 || local323 < 0 || local291 < 0 || local307 > Rasteriser.width || local323 > Rasteriser.width || local291 > Rasteriser.width;
				if (arg0.anInt4869 == -1) {
					if (arg0.anInt4865 != 12345678) {
						Rasteriser.fillGouraudTriangle(local315, local331, local299, local307, local323, local291, arg0.anInt4865, arg0.anInt4864, arg0.anInt4867);
					}
				} else if (!Preferences.manyGroundTextures) {
					local475 = Rasteriser.textureProvider.getAverageColor(arg0.anInt4869);
					Rasteriser.fillGouraudTriangle(local315, local331, local299, local307, local323, local291, ColorUtils.multiplyLightness3(local475, arg0.anInt4865), ColorUtils.multiplyLightness3(local475, arg0.anInt4864), ColorUtils.multiplyLightness3(local475, arg0.anInt4867));
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
		if (MiniMenu.aBoolean187 && method583(MiniMenu.anInt2388 + Rasteriser.centerX, MiniMenu.anInt3259 + Rasteriser.centerY, local283, local299, local331, local275, local291, local323)) {
			MiniMenu.anInt1742 = arg6;
			MiniMenu.anInt2954 = arg7;
		}
		if (GlRenderer.enabled || arg8) {
			return;
		}
		Rasteriser.testX = local275 < 0 || local291 < 0 || local323 < 0 || local275 > Rasteriser.width || local291 > Rasteriser.width || local323 > Rasteriser.width;
		if (arg0.anInt4869 == -1) {
			if (arg0.anInt4872 != 12345678) {
				Rasteriser.fillGouraudTriangle(local283, local299, local331, local275, local291, local323, arg0.anInt4872, arg0.anInt4867, arg0.anInt4864);
			}
		} else if (Preferences.manyGroundTextures) {
			Rasteriser.fillTexturedTriangle(local283, local299, local331, local275, local291, local323, arg0.anInt4872, arg0.anInt4867, arg0.anInt4864, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4869);
		} else {
			local475 = Rasteriser.textureProvider.getAverageColor(arg0.anInt4869);
			Rasteriser.fillGouraudTriangle(local283, local299, local331, local275, local291, local323, ColorUtils.multiplyLightness3(local475, arg0.anInt4872), ColorUtils.multiplyLightness3(local475, arg0.anInt4867), ColorUtils.multiplyLightness3(local475, arg0.anInt4864));
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III)Z")
	public static boolean method187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = anIntArrayArrayArray12[arg0][arg1][arg2];
		if (local7 == -anInt437) {
			return false;
		} else if (local7 == anInt437) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (method4394(local22 + 1, tileHeights[arg0][arg1][arg2], local26 + 1) && method4394(local22 + 128 - 1, tileHeights[arg0][arg1 + 1][arg2], local26 + 1) && method4394(local22 + 128 - 1, tileHeights[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && method4394(local22 + 1, tileHeights[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				anIntArrayArrayArray12[arg0][arg1][arg2] = anInt437;
				return true;
			} else {
				anIntArrayArrayArray12[arg0][arg1][arg2] = -anInt437;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII)Z")
	public static boolean method3049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg3 * anInt5205 + arg0 * anInt2222 >> 16;
		@Pc(19) int local19 = arg3 * anInt2222 - arg0 * anInt5205 >> 16;
		@Pc(29) int local29 = arg1 * anInt2886 + local19 * anInt3038 >> 16;
		@Pc(39) int local39 = arg1 * anInt3038 - local19 * anInt2886 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * anInt2886 + local19 * anInt3038 >> 16;
		@Pc(76) int local76 = arg2 * anInt3038 - local19 * anInt2886 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > arg4 && local66 > arg4) {
			return false;
		} else if (local50 < Rasteriser.screenLowerX && local87 < Rasteriser.screenLowerX) {
			return false;
		} else if (local50 > Rasteriser.screenUpperX && local87 > Rasteriser.screenUpperX) {
			return false;
		} else if (local56 < Rasteriser.screenLowerY && local93 < Rasteriser.screenLowerY) {
			return false;
		} else {
			return local56 <= Rasteriser.screenUpperY || local93 <= Rasteriser.screenUpperY;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([[F[[II[[FI[ILclient!fj;BLclient!gi;[[FI)V")
	public static void method2578(@OriginalArg(0) float[][] arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) Light_Class45 arg6, @OriginalArg(8) Light arg7, @OriginalArg(9) float[][] arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int[] local7 = new int[arg5.length / 2];
		for (@Pc(13) int local13 = 0; local13 < local7.length; local13++) {
			@Pc(27) int local27 = arg5[local13 + local13];
			@Pc(35) int local35 = arg5[local13 + local13 + 1];
			@Pc(53) int local53;
			if (arg9 == 1) {
				local53 = local27;
				local27 = local35;
				local35 = 128 - local53;
			} else if (arg9 == 2) {
				local35 = 128 - local35;
				local27 = 128 - local27;
			} else if (arg9 == 3) {
				local53 = local27;
				local27 = 128 - local35;
				local35 = local53;
			}
			@Pc(123) float local123;
			@Pc(107) float local107;
			@Pc(115) float local115;
			if (local27 == 0 && local35 == 0) {
				local123 = arg3[arg2][arg4];
				local115 = arg8[arg2][arg4];
				local107 = arg0[arg2][arg4];
			} else if (local27 == 128 && local35 == 0) {
				local107 = arg0[arg2 + 1][arg4];
				local115 = arg8[arg2 + 1][arg4];
				local123 = arg3[arg2 + 1][arg4];
			} else if (local27 == 128 && local35 == 128) {
				local123 = arg3[arg2 + 1][arg4 + 1];
				local115 = arg8[arg2 + 1][arg4 + 1];
				local107 = arg0[arg2 + 1][arg4 + 1];
			} else if (local27 == 0 && local35 == 128) {
				local107 = arg0[arg2][arg4 + 1];
				local123 = arg3[arg2][arg4 + 1];
				local115 = arg8[arg2][arg4 + 1];
			} else {
				local115 = arg8[arg2][arg4];
				local107 = arg0[arg2][arg4];
				@Pc(187) float local187 = (float) local27 / 128.0F;
				local123 = arg3[arg2][arg4];
				@Pc(208) float local208 = local123 + (arg3[arg2 + 1][arg4] - local123) * local187;
				@Pc(222) float local222 = local107 + local187 * (arg0[arg2 + 1][arg4] - local107);
				@Pc(237) float local237 = local115 + (arg8[arg2 + 1][arg4] - local115) * local187;
				@Pc(245) float local245 = arg8[arg2][arg4 + 1];
				@Pc(261) float local261 = local245 + (arg8[arg2 + 1][arg4 + 1] - local245) * local187;
				@Pc(269) float local269 = arg3[arg2][arg4 + 1];
				@Pc(274) float local274 = (float) local35 / 128.0F;
				local115 = local237 + (local261 - local237) * local274;
				@Pc(291) float local291 = arg0[arg2][arg4 + 1];
				@Pc(307) float local307 = local291 + (arg0[arg2 + 1][arg4 + 1] - local291) * local187;
				@Pc(324) float local324 = local269 + (arg3[arg2 + 1][arg4 + 1] - local269) * local187;
				local123 = local208 + (local324 - local208) * local274;
				local107 = local222 + (local307 - local222) * local274;
			}
			@Pc(393) int local393 = (arg2 << 7) + local27;
			@Pc(400) int local400 = (arg4 << 7) + local35;
			@Pc(408) int local408 = method3361(local27, arg4, arg1, arg2, local35);
			local7[local13] = arg6.method1553(arg7, local393, local408, local400, local115, local123, local107);
		}
		arg6.method1557(local7);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "()V")
	public static void method2419() {
		anInt4870 = 0;
		label194:
		for (@Pc(3) int local3 = 0; local3 < anInt917; local3++) {
			@Pc(10) SceneGraph_Class120 local10 = aClass120Array1[local3];
			@Pc(14) int local14;
			if (anIntArray8 != null) {
				for (local14 = 0; local14 < anIntArray8.length; local14++) {
					if (anIntArray8[local14] != -1000000 && (local10.anInt4444 <= anIntArray8[local14] || local10.anInt4447 <= anIntArray8[local14]) && (local10.anInt4460 <= anIntArray234[local14] || local10.anInt4445 <= anIntArray234[local14]) && (local10.anInt4460 >= anIntArray292[local14] || local10.anInt4445 >= anIntArray292[local14]) && (local10.anInt4458 <= anIntArray454[local14] || local10.anInt4449 <= anIntArray454[local14]) && (local10.anInt4458 >= anIntArray427[local14] || local10.anInt4449 >= anIntArray427[local14])) {
						continue label194;
					}
				}
			}
			@Pc(115) int local115;
			@Pc(126) int local126;
			@Pc(158) int local158;
			@Pc(137) boolean local137;
			if (local10.anInt4453 == 1) {
				local14 = local10.anInt4452 + visibility - anInt4069;
				if (local14 >= 0 && local14 <= visibility + visibility) {
					local115 = local10.anInt4461 + visibility - anInt4539;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt4464 + visibility - anInt4539;
					if (local126 > visibility + visibility) {
						local126 = visibility + visibility;
					}
					local137 = false;
					while (local115 <= local126) {
						if (aBooleanArrayArray1[local14][local115++]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = anInt3555 - local10.anInt4460;
						if (local158 > 32) {
							local10.anInt4462 = 1;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt4462 = 2;
							local158 = -local158;
						}
						local10.anInt4454 = (local10.anInt4458 - anInt4903 << 8) / local158;
						local10.anInt4450 = (local10.anInt4449 - anInt4903 << 8) / local158;
						local10.anInt4459 = (local10.anInt4444 - anInt3947 << 8) / local158;
						local10.anInt4463 = (local10.anInt4447 - anInt3947 << 8) / local158;
						aClass120Array2[anInt4870++] = local10;
					}
				}
			} else if (local10.anInt4453 == 2) {
				local14 = local10.anInt4461 + visibility - anInt4539;
				if (local14 >= 0 && local14 <= visibility + visibility) {
					local115 = local10.anInt4452 + visibility - anInt4069;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt4446 + visibility - anInt4069;
					if (local126 > visibility + visibility) {
						local126 = visibility + visibility;
					}
					local137 = false;
					while (local115 <= local126) {
						if (aBooleanArrayArray1[local115++][local14]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = anInt4903 - local10.anInt4458;
						if (local158 > 32) {
							local10.anInt4462 = 3;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt4462 = 4;
							local158 = -local158;
						}
						local10.anInt4448 = (local10.anInt4460 - anInt3555 << 8) / local158;
						local10.anInt4456 = (local10.anInt4445 - anInt3555 << 8) / local158;
						local10.anInt4459 = (local10.anInt4444 - anInt3947 << 8) / local158;
						local10.anInt4463 = (local10.anInt4447 - anInt3947 << 8) / local158;
						aClass120Array2[anInt4870++] = local10;
					}
				}
			} else if (local10.anInt4453 == 4) {
				local14 = local10.anInt4444 - anInt3947;
				if (local14 > 128) {
					local115 = local10.anInt4461 + visibility - anInt4539;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt4464 + visibility - anInt4539;
					if (local126 > visibility + visibility) {
						local126 = visibility + visibility;
					}
					if (local115 <= local126) {
						@Pc(408) int local408 = local10.anInt4452 + visibility - anInt4069;
						if (local408 < 0) {
							local408 = 0;
						}
						local158 = local10.anInt4446 + visibility - anInt4069;
						if (local158 > visibility + visibility) {
							local158 = visibility + visibility;
						}
						@Pc(430) boolean local430 = false;
						label166:
						for (@Pc(432) int local432 = local408; local432 <= local158; local432++) {
							for (@Pc(437) int local437 = local115; local437 <= local126; local437++) {
								if (aBooleanArrayArray1[local432][local437]) {
									local430 = true;
									break label166;
								}
							}
						}
						if (local430) {
							local10.anInt4462 = 5;
							local10.anInt4448 = (local10.anInt4460 - anInt3555 << 8) / local14;
							local10.anInt4456 = (local10.anInt4445 - anInt3555 << 8) / local14;
							local10.anInt4454 = (local10.anInt4458 - anInt4903 << 8) / local14;
							local10.anInt4450 = (local10.anInt4449 - anInt4903 << 8) / local14;
							aClass120Array2[anInt4870++] = local10;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!fg;IIIIIIZ)V")
	public static void method2762(@OriginalArg(0) ShapedTile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray168.length;
		@Pc(5) int local5;
		@Pc(15) int local15;
		@Pc(22) int local22;
		@Pc(29) int local29;
		@Pc(39) int local39;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray168[local5] - anInt3555;
			local22 = arg0.anIntArray160[local5] - anInt3947;
			local29 = arg0.anIntArray163[local5] - anInt4903;
			local39 = local29 * arg3 + local15 * arg4 >> 16;
			@Pc(49) int local49 = local29 * arg4 - local15 * arg3 >> 16;
			@Pc(61) int local61 = local22 * arg2 - local49 * arg1 >> 16;
			@Pc(71) int local71 = local22 * arg1 + local49 * arg2 >> 16;
			if (local71 < 50) {
				return;
			}
			if (arg0.anIntArray161 != null) {
				anIntArray159[local5] = local39;
				anIntArray170[local5] = local61;
				anIntArray169[local5] = local71;
			}
			anIntArray165[local5] = Rasteriser.centerX + (local39 << 9) / local71;
			anIntArray164[local5] = Rasteriser.centerY + (local61 << 9) / local71;
		}
		Rasteriser.alpha = 0;
		local3 = arg0.anIntArray166.length;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray166[local5];
			local22 = arg0.anIntArray162[local5];
			local29 = arg0.anIntArray158[local5];
			local39 = anIntArray165[local15];
			@Pc(148) int local148 = anIntArray165[local22];
			@Pc(152) int local152 = anIntArray165[local29];
			@Pc(156) int local156 = anIntArray164[local15];
			@Pc(160) int local160 = anIntArray164[local22];
			@Pc(164) int local164 = anIntArray164[local29];
			if ((local39 - local148) * (local164 - local160) - (local156 - local160) * (local152 - local148) > 0) {
				if (MiniMenu.aBoolean187 && method583(MiniMenu.anInt2388 + Rasteriser.centerX, MiniMenu.anInt3259 + Rasteriser.centerY, local156, local160, local164, local39, local148, local152)) {
					MiniMenu.anInt1742 = arg5;
					MiniMenu.anInt2954 = arg6;
				}
				if (!GlRenderer.enabled && !arg7) {
					Rasteriser.testX = local39 < 0 || local148 < 0 || local152 < 0 || local39 > Rasteriser.width || local148 > Rasteriser.width || local152 > Rasteriser.width;
					if (arg0.anIntArray161 == null || arg0.anIntArray161[local5] == -1) {
						if (arg0.anIntArray167[local5] != 12345678) {
							Rasteriser.fillGouraudTriangle(local156, local160, local164, local39, local148, local152, arg0.anIntArray167[local5], arg0.anIntArray172[local5], arg0.anIntArray171[local5]);
						}
					} else if (!Preferences.manyGroundTextures) {
						@Pc(373) int local373 = Rasteriser.textureProvider.getAverageColor(arg0.anIntArray161[local5]);
						Rasteriser.fillGouraudTriangle(local156, local160, local164, local39, local148, local152, ColorUtils.multiplyLightness3(local373, arg0.anIntArray167[local5]), ColorUtils.multiplyLightness3(local373, arg0.anIntArray172[local5]), ColorUtils.multiplyLightness3(local373, arg0.anIntArray171[local5]));
					} else if (arg0.aBoolean113) {
						Rasteriser.fillTexturedTriangle(local156, local160, local164, local39, local148, local152, arg0.anIntArray167[local5], arg0.anIntArray172[local5], arg0.anIntArray171[local5], anIntArray159[0], anIntArray159[1], anIntArray159[3], anIntArray170[0], anIntArray170[1], anIntArray170[3], anIntArray169[0], anIntArray169[1], anIntArray169[3], arg0.anIntArray161[local5]);
					} else {
						Rasteriser.fillTexturedTriangle(local156, local160, local164, local39, local148, local152, arg0.anIntArray167[local5], arg0.anIntArray172[local5], arg0.anIntArray171[local5], anIntArray159[local15], anIntArray159[local22], anIntArray159[local29], anIntArray170[local15], anIntArray170[local22], anIntArray170[local29], anIntArray169[local15], anIntArray169[local22], anIntArray169[local29], arg0.anIntArray161[local5]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([[F[[F[[II[[F[[B[[II[[B[[B[[B[[[B)[Lclient!hg;")
	public static GlTile[] method2(@OriginalArg(0) float[][] arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) byte[][][] arg10) {
		@Pc(10) HashTable local10 = new HashTable(128);
		@Pc(12) int local12;
		@Pc(17) int local17;
		@Pc(30) int local30;
		@Pc(38) int local38;
		@Pc(131) int local131;
		@Pc(168) int local168;
		@Pc(143) int local143;
		@Pc(163) int local163;
		@Pc(153) int local153;
		@Pc(190) int local190;
		@Pc(180) int local180;
		@Pc(214) int local214;
		@Pc(202) int local202;
		@Pc(226) int local226;
		@Pc(274) byte local274;
		@Pc(299) int local299;
		@Pc(317) int local317;
		@Pc(127) int local127;
		@Pc(133) int local133;
		@Pc(777) int local777;
		@Pc(1035) int local1035;
		@Pc(1055) boolean[] local1055;
		@Pc(1068) boolean[] local1068;
		@Pc(1086) boolean[] local1086;
		for (local12 = 1; local12 <= 102; local12++) {
			for (local17 = 1; local17 <= 102; local17++) {
				local30 = arg8[local12][local17] & 0xFF;
				local38 = arg9[local12][local17] & 0xFF;
				if (local38 != 0) {
					@Pc(50) FloType local50 = FloTypeList.method4395(local38 - 1);
					if (local50.baseColor == -1) {
						continue;
					}
					@Pc(61) GlTile local61 = method4212(local10, local50);
					@Pc(67) byte local67 = arg7[local12][local17];
					@Pc(71) int[] local71 = anIntArrayArray35[local67];
					local61.anInt2482 += local71.length / 2;
					local61.anInt2484++;
					if (local50.blendTexture && local30 != 0) {
						local61.anInt2482 += anIntArray419[local67];
					}
				}
				if ((arg8[local12][local17] & 0xFF) != 0 || local38 != 0 && arg7[local12][local17] == 0) {
					local127 = 0;
					@Pc(129) int local129 = 0;
					local131 = 0;
					local133 = 0;
					local143 = arg9[local12][local17 + 1] & 0xFF;
					local153 = arg9[local12][local17 - 1] & 0xFF;
					local163 = arg9[local12 - 1][local17] & 0xFF;
					@Pc(166) int[] local166 = new int[8];
					local168 = 0;
					local180 = arg9[local12 - 1][local17 + 1] & 0xFF;
					local190 = arg9[local12 + 1][local17] & 0xFF;
					local202 = arg9[local12 + 1][local17 - 1] & 0xFF;
					local214 = arg9[local12 - 1][local17 - 1] & 0xFF;
					local226 = arg9[local12 + 1][local17 + 1] & 0xFF;
					@Pc(242) FloType local242;
					@Pc(264) byte local264;
					@Pc(287) int local287;
					if (local180 != 0 && local38 != local180) {
						local242 = FloTypeList.method4395(local180 - 1);
						if (local242.blendTexture && local242.baseColor != -1) {
							local264 = arg5[local12 - 1][local17 + 1];
							local274 = arg7[local12 - 1][local17 + 1];
							local287 = anIntArray300[local274 * 4 + (local264 + 2 & 0x3)];
							local299 = anIntArray300[(local264 + 3 & 0x3) + local274 * 4];
							if (!aBooleanArrayArray4[local299][1] || !aBooleanArrayArray4[local287][0]) {
								for (local317 = 0; local317 < 8; local317++) {
									if (local317 == 0) {
										local127++;
										local166[0] = local180;
										break;
									}
									if (local180 == local166[local317]) {
										break;
									}
								}
							}
						}
					}
					if (local214 != 0 && local214 != local38) {
						local242 = FloTypeList.method4395(local214 - 1);
						if (local242.blendTexture && local242.baseColor != -1) {
							local264 = arg5[local12 - 1][local17 - 1];
							local274 = arg7[local12 - 1][local17 - 1];
							local287 = anIntArray300[local274 * 4 + (local264 & 0x3)];
							local299 = anIntArray300[(local264 + 3 & 0x3) + local274 * 4];
							if (!aBooleanArrayArray4[local287][1] || !aBooleanArrayArray4[local299][0]) {
								for (local317 = 0; local317 < 8; local317++) {
									if (local127 == local317) {
										local166[local127++] = local214;
										break;
									}
									if (local166[local317] == local214) {
										break;
									}
								}
							}
						}
					}
					if (local202 != 0 && local38 != local202) {
						local242 = FloTypeList.method4395(local202 - 1);
						if (local242.blendTexture && local242.baseColor != -1) {
							local264 = arg5[local12 + 1][local17 - 1];
							local274 = arg7[local12 + 1][local17 - 1];
							local299 = anIntArray300[local274 * 4 + (local264 + 1 & 0x3)];
							local287 = anIntArray300[local274 * 4 + (local264 & 0x3)];
							if (!aBooleanArrayArray4[local299][1] || !aBooleanArrayArray4[local287][0]) {
								for (local317 = 0; local317 < 8; local317++) {
									if (local127 == local317) {
										local166[local127++] = local202;
										break;
									}
									if (local202 == local166[local317]) {
										break;
									}
								}
							}
						}
					}
					if (local226 != 0 && local226 != local38) {
						local242 = FloTypeList.method4395(local226 - 1);
						if (local242.blendTexture && local242.baseColor != -1) {
							local264 = arg5[local12 + 1][local17 + 1];
							local274 = arg7[local12 + 1][local17 + 1];
							local299 = anIntArray300[local274 * 4 + (local264 + 1 & 0x3)];
							local287 = anIntArray300[local274 * 4 + (local264 + 2 & 0x3)];
							if (!aBooleanArrayArray4[local287][1] || !aBooleanArrayArray4[local299][0]) {
								for (local317 = 0; local317 < 8; local317++) {
									if (local127 == local317) {
										local166[local127++] = local226;
										break;
									}
									if (local226 == local166[local317]) {
										break;
									}
								}
							}
						}
					}
					if (local143 != 0 && local38 != local143) {
						local242 = FloTypeList.method4395(local143 - 1);
						if (local242.blendTexture && local242.baseColor != -1) {
							local129 = anIntArray300[arg7[local12][local17 + 1] * 4 + (arg5[local12][local17 + 1] + 2 & 0x3)];
							for (local777 = 0; local777 < 8; local777++) {
								if (local127 == local777) {
									local166[local127++] = local143;
									break;
								}
								if (local166[local777] == local143) {
									break;
								}
							}
						}
					}
					if (local163 != 0 && local38 != local163) {
						local242 = FloTypeList.method4395(local163 - 1);
						if (local242.blendTexture && local242.baseColor != -1) {
							local133 = anIntArray300[(arg5[local12 - 1][local17] + 3 & 0x3) + arg7[local12 - 1][local17] * 4];
							for (local777 = 0; local777 < 8; local777++) {
								if (local127 == local777) {
									local166[local127++] = local163;
									break;
								}
								if (local163 == local166[local777]) {
									break;
								}
							}
						}
					}
					if (local153 != 0 && local38 != local153) {
						local242 = FloTypeList.method4395(local153 - 1);
						if (local242.blendTexture && local242.baseColor != -1) {
							local131 = anIntArray300[(arg5[local12][local17 - 1] & 0x3) + arg7[local12][local17 - 1] * 4];
							for (local777 = 0; local777 < 8; local777++) {
								if (local777 == local127) {
									local166[local127++] = local153;
									break;
								}
								if (local153 == local166[local777]) {
									break;
								}
							}
						}
					}
					if (local190 != 0 && local38 != local190) {
						local242 = FloTypeList.method4395(local190 - 1);
						if (local242.blendTexture && local242.baseColor != -1) {
							local168 = anIntArray300[(arg5[local12 + 1][local17] + 1 & 0x3) + arg7[local12 + 1][local17] * 4];
							for (local777 = 0; local777 < 8; local777++) {
								if (local127 == local777) {
									local166[local127++] = local190;
									break;
								}
								if (local166[local777] == local190) {
									break;
								}
							}
						}
					}
					for (local1035 = 0; local1035 < local127; local1035++) {
						local777 = local166[local1035];
						local1055 = aBooleanArrayArray4[local163 == local777 ? local133 : 0];
						local1068 = aBooleanArrayArray4[local777 == local153 ? local131 : 0];
						@Pc(1077) boolean[] local1077 = aBooleanArrayArray4[local143 == local777 ? local129 : 0];
						local1086 = aBooleanArrayArray4[local190 == local777 ? local168 : 0];
						@Pc(1092) FloType local1092 = FloTypeList.method4395(local777 - 1);
						@Pc(1097) GlTile local1097 = method4212(local10, local1092);
						local1097.anInt2482 += 5;
						local1097.anInt2482 += local1077.length - 2;
						local1097.anInt2482 += local1055.length - 2;
						local1097.anInt2482 += local1068.length - 2;
						local1097.anInt2482 += local1086.length - 2;
						local1097.anInt2484++;
					}
				}
			}
		}
		@Pc(1161) GlTile local1161;
		for (local1161 = (GlTile) local10.head(); local1161 != null; local1161 = (GlTile) local10.next()) {
			local1161.method1940();
		}
		for (local12 = 1; local12 <= 102; local12++) {
			for (local17 = 1; local17 <= 102; local17++) {
				local38 = arg8[local12][local17] & 0xFF;
				local127 = arg9[local12][local17] & 0xFF;
				if ((arg10[arg3][local12][local17] & 0x8) != 0) {
					local30 = 0;
				} else if ((arg10[1][local12][local17] & 0x2) == 2 && arg3 > 0) {
					local30 = arg3 - 1;
				} else {
					local30 = arg3;
				}
				if (local127 != 0) {
					@Pc(1250) FloType local1250 = FloTypeList.method4395(local127 - 1);
					if (local1250.baseColor == -1) {
						continue;
					}
					@Pc(1261) GlTile local1261 = method4212(local10, local1250);
					@Pc(1267) byte local1267 = arg7[local12][local17];
					@Pc(1273) byte local1273 = arg5[local12][local17];
					local168 = method588(local1250.texture, local1250.baseColor, arg6[local12][local17]);
					local143 = method588(local1250.texture, local1250.baseColor, arg6[local12 + 1][local17]);
					local163 = method588(local1250.texture, local1250.baseColor, arg6[local12 + 1][local17 + 1]);
					local153 = method588(local1250.texture, local1250.baseColor, arg6[local12][local17 + 1]);
					method1324(local168, arg2, arg1, local12, arg0, local143, local1273, local30, local163, local38 != 0 && local1250.blendTexture, local1267, local17, arg4, local153, local1261);
				}
				if ((arg8[local12][local17] & 0xFF) != 0 || local127 != 0 && arg7[local12][local17] == 0) {
					@Pc(1382) int[] local1382 = new int[8];
					local133 = 0;
					@Pc(1386) int local1386 = 0;
					local131 = 0;
					local168 = 0;
					local163 = arg9[local12][local17 + 1] & 0xFF;
					local143 = 0;
					local153 = arg9[local12 - 1][local17] & 0xFF;
					local180 = arg9[local12 + 1][local17] & 0xFF;
					local190 = arg9[local12][local17 - 1] & 0xFF;
					local214 = arg9[local12 - 1][local17 + 1] & 0xFF;
					local202 = arg9[local12 - 1][local17 - 1] & 0xFF;
					local226 = arg9[local12 + 1][local17 - 1] & 0xFF;
					local1035 = arg9[local12 + 1][local17 + 1] & 0xFF;
					@Pc(1527) byte local1527;
					@Pc(1496) FloType local1496;
					@Pc(1571) int local1571;
					if (local214 == 0 || local214 == local127) {
						local214 = 0;
					} else {
						local1496 = FloTypeList.method4395(local214 - 1);
						if (local1496.blendTexture && local1496.baseColor != -1) {
							local274 = arg5[local12 - 1][local17 + 1];
							local1527 = arg7[local12 - 1][local17 + 1];
							local299 = anIntArray300[local1527 * 4 + (local274 + 2 & 0x3)];
							local317 = anIntArray300[local1527 * 4 + (local274 + 3 & 0x3)];
							if (aBooleanArrayArray4[local317][1] && aBooleanArrayArray4[local299][0]) {
								local214 = 0;
							} else {
								for (local1571 = 0; local1571 < 8; local1571++) {
									if (local1571 == 0) {
										local1386++;
										local1382[0] = local214;
										break;
									}
									if (local1382[local1571] == local214) {
										break;
									}
								}
							}
						} else {
							local214 = 0;
						}
					}
					if (local202 == 0 || local127 == local202) {
						local202 = 0;
					} else {
						local1496 = FloTypeList.method4395(local202 - 1);
						if (local1496.blendTexture && local1496.baseColor != -1) {
							local274 = arg5[local12 - 1][local17 - 1];
							local1527 = arg7[local12 - 1][local17 - 1];
							local299 = anIntArray300[(local274 & 0x3) + local1527 * 4];
							local317 = anIntArray300[(local274 + 3 & 0x3) + local1527 * 4];
							if (aBooleanArrayArray4[local299][1] && aBooleanArrayArray4[local317][0]) {
								local202 = 0;
							} else {
								for (local1571 = 0; local1571 < 8; local1571++) {
									if (local1571 == local1386) {
										local1382[local1386++] = local202;
										break;
									}
									if (local202 == local1382[local1571]) {
										break;
									}
								}
							}
						} else {
							local202 = 0;
						}
					}
					if (local226 == 0 || local226 == local127) {
						local226 = 0;
					} else {
						local1496 = FloTypeList.method4395(local226 - 1);
						if (local1496.blendTexture && local1496.baseColor != -1) {
							local274 = arg5[local12 + 1][local17 - 1];
							local1527 = arg7[local12 + 1][local17 - 1];
							local317 = anIntArray300[(local274 + 1 & 0x3) + local1527 * 4];
							local299 = anIntArray300[local1527 * 4 + (local274 & 0x3)];
							if (aBooleanArrayArray4[local317][1] && aBooleanArrayArray4[local299][0]) {
								local226 = 0;
							} else {
								for (local1571 = 0; local1571 < 8; local1571++) {
									if (local1571 == local1386) {
										local1382[local1386++] = local226;
										break;
									}
									if (local1382[local1571] == local226) {
										break;
									}
								}
							}
						} else {
							local226 = 0;
						}
					}
					if (local1035 == 0 || local127 == local1035) {
						local1035 = 0;
					} else {
						local1496 = FloTypeList.method4395(local1035 - 1);
						if (local1496.blendTexture && local1496.baseColor != -1) {
							local1527 = arg7[local12 + 1][local17 + 1];
							local274 = arg5[local12 + 1][local17 + 1];
							local299 = anIntArray300[(local274 + 2 & 0x3) + local1527 * 4];
							local317 = anIntArray300[(local274 + 1 & 0x3) + local1527 * 4];
							if (aBooleanArrayArray4[local299][1] && aBooleanArrayArray4[local317][0]) {
								local1035 = 0;
							} else {
								for (local1571 = 0; local1571 < 8; local1571++) {
									if (local1571 == local1386) {
										local1382[local1386++] = local1035;
										break;
									}
									if (local1382[local1571] == local1035) {
										break;
									}
								}
							}
						} else {
							local1035 = 0;
						}
					}
					@Pc(2003) int local2003;
					if (local163 != 0 && local163 != local127) {
						local1496 = FloTypeList.method4395(local163 - 1);
						if (local1496.blendTexture && local1496.baseColor != -1) {
							local133 = anIntArray300[arg7[local12][local17 + 1] * 4 + (arg5[local12][local17 + 1] + 2 & 0x3)];
							for (local2003 = 0; local2003 < 8; local2003++) {
								if (local2003 == local1386) {
									local1382[local1386++] = local163;
									break;
								}
								if (local1382[local2003] == local163) {
									break;
								}
							}
						}
					}
					if (local153 != 0 && local127 != local153) {
						local1496 = FloTypeList.method4395(local153 - 1);
						if (local1496.blendTexture && local1496.baseColor != -1) {
							local131 = anIntArray300[(arg5[local12 - 1][local17] + 3 & 0x3) + arg7[local12 - 1][local17] * 4];
							for (local2003 = 0; local2003 < 8; local2003++) {
								if (local1386 == local2003) {
									local1382[local1386++] = local153;
									break;
								}
								if (local153 == local1382[local2003]) {
									break;
								}
							}
						}
					}
					if (local190 != 0 && local190 != local127) {
						local1496 = FloTypeList.method4395(local190 - 1);
						if (local1496.blendTexture && local1496.baseColor != -1) {
							local168 = anIntArray300[(arg5[local12][local17 - 1] & 0x3) + arg7[local12][local17 - 1] * 4];
							for (local2003 = 0; local2003 < 8; local2003++) {
								if (local1386 == local2003) {
									local1382[local1386++] = local190;
									break;
								}
								if (local190 == local1382[local2003]) {
									break;
								}
							}
						}
					}
					if (local180 != 0 && local180 != local127) {
						local1496 = FloTypeList.method4395(local180 - 1);
						if (local1496.blendTexture && local1496.baseColor != -1) {
							local143 = anIntArray300[arg7[local12 + 1][local17] * 4 + (arg5[local12 + 1][local17] + 1 & 0x3)];
							for (local2003 = 0; local2003 < 8; local2003++) {
								if (local2003 == local1386) {
									local1382[local1386++] = local180;
									break;
								}
								if (local1382[local2003] == local180) {
									break;
								}
							}
						}
					}
					for (local777 = 0; local777 < local1386; local777++) {
						local2003 = local1382[local777];
						local1055 = aBooleanArrayArray4[local2003 == local163 ? local133 : 0];
						local1068 = aBooleanArrayArray4[local153 == local2003 ? local131 : 0];
						local1086 = aBooleanArrayArray4[local2003 == local190 ? local168 : 0];
						@Pc(2318) boolean[] local2318 = aBooleanArrayArray4[local2003 == local180 ? local143 : 0];
						@Pc(2324) FloType local2324 = FloTypeList.method4395(local2003 - 1);
						@Pc(2329) GlTile local2329 = method4212(local10, local2324);
						@Pc(2345) int local2345 = method588(local2324.texture, local2324.baseColor, arg6[local12][local17]) << 8 | 0xFF;
						@Pc(2365) int local2365 = method588(local2324.texture, local2324.baseColor, arg6[local12 + 1][local17]) << 8 | 0xFF;
						@Pc(2385) int local2385 = method588(local2324.texture, local2324.baseColor, arg6[local12 + 1][local17 + 1]) << 8 | 0xFF;
						@Pc(2403) int local2403 = method588(local2324.texture, local2324.baseColor, arg6[local12][local17 + 1]) << 8 | 0xFF;
						@Pc(2422) boolean local2422 = local2003 != local202 && local1086[0] && local1068[1];
						@Pc(2441) boolean local2441 = local2003 != local1035 && local1055[0] && local2318[1];
						@Pc(2456) boolean local2456 = local214 != local2003 && local1068[0] && local1055[1];
						@Pc(2463) int local2463 = local1055.length + 6 - 2;
						@Pc(2482) boolean local2482 = local2003 != local226 && local2318[0] && local1086[1];
						@Pc(2489) int local2489 = local2463 + local1068.length - 2;
						@Pc(2496) int local2496 = local2489 + local1086.length - 2;
						@Pc(2503) int local2503 = local2496 + local2318.length - 2;
						@Pc(2524) int local2524 = method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, true, local2329, arg1, local17, 64, arg0, 64);
						@Pc(2527) int[] local2527 = new int[local2503];
						@Pc(2529) byte local2529 = 0;
						@Pc(2550) int local2550 = method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, local2456, local2329, arg1, local17, 0, arg0, 128);
						@Pc(2571) int local2571 = method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, local2441, local2329, arg1, local17, 128, arg0, 128);
						@Pc(2592) int local2592 = method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, local2422, local2329, arg1, local17, 0, arg0, 0);
						@Pc(2613) int local2613 = method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, local2482, local2329, arg1, local17, 128, arg0, 0);
						@Pc(2616) int local2616 = local2529 + 1;
						local2527[0] = local2524;
						@Pc(2621) int local2621 = local2616 + 1;
						local2527[1] = local2571;
						if (local1055.length > 2) {
							local2621++;
							local2527[2] = method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, local1055[2], local2329, arg1, local17, 64, arg0, 128);
						}
						local2527[local2621++] = local2550;
						if (local1068.length > 2) {
							local2527[local2621++] = method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, local1068[2], local2329, arg1, local17, 0, arg0, 64);
						}
						local2527[local2621++] = local2592;
						if (local1086.length > 2) {
							local2527[local2621++] = method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, local1086[2], local2329, arg1, local17, 64, arg0, 0);
						}
						local2527[local2621++] = local2613;
						if (local2318.length > 2) {
							local2527[local2621++] = method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, local2318[2], local2329, arg1, local17, 128, arg0, 64);
						}
						local2527[local2621++] = local2571;
						local2329.method1945(local30, local12, local17, local2527, null, true);
					}
				}
			}
		}
		for (local1161 = (GlTile) local10.head(); local1161 != null; local1161 = (GlTile) local10.next()) {
			if (local1161.anInt2483 == 0) {
				local1161.unlink();
			} else {
				local1161.method1943();
			}
		}
		local12 = local10.size();
		@Pc(2823) GlTile[] local2823 = new GlTile[local12];
		@Pc(2826) long[] local2826 = new long[local12];
		local10.method3865(local2823);
		for (local38 = 0; local38 < local12; local38++) {
			local2826[local38] = local2823[local38].key;
		}
		ArrayUtils.sort(local2826, local2823);
		return local2823;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!sc;ZLclient!wl;)Lclient!hg;")
	public static GlTile method4212(@OriginalArg(0) HashTable arg0, @OriginalArg(2) FloType arg1) {
		@Pc(23) long local23 = ((long) arg1.texture + 1 << 16) + arg1.anInt5885 + ((long) arg1.textureBrightness << 56) + ((long) arg1.waterColor << 32);
		@Pc(38) GlTile local38 = (GlTile) arg0.get(local23);
		if (local38 == null) {
			local38 = new GlTile(arg1.texture, (float) arg1.anInt5885, true, false, arg1.waterColor);
			arg0.put(local38, local23);
		}
		return local38;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIBI)I")
	public static int method588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int local19 = Rasteriser.palette[ColorUtils.multiplyLightness2(arg1, arg2)];
		if (arg0 > 0) {
			@Pc(31) int local31 = Rasteriser.textureProvider.method3238(arg0 & 0xFFFF);
			@Pc(49) int local49;
			@Pc(73) int local73;
			if (local31 != 0) {
				if (arg2 < 0) {
					local49 = 0;
				} else if (arg2 > 127) {
					local49 = 16777215;
				} else {
					local49 = arg2 * 131586;
				}
				if (local31 == 256) {
					local19 = local49;
				} else {
					local73 = 256 - local31;
					local19 = ((local49 & 0xFF00) * local31 + local73 * (local19 & 0xFF00) & 0xFF0000) + (local31 * (local49 & 0xFF00FF) + ((local19 & 0xFF00FF) * local73) & 0xFF00FF00) >> 8;
				}
			}
			local49 = Rasteriser.textureProvider.method3229(arg0 & 0xFFFF);
			if (local49 != 0) {
				local49 += 256;
				@Pc(125) int local125 = (local19 >> 16 & 0xFF) * local49;
				if (local125 > 65535) {
					local125 = 65535;
				}
				local73 = (local19 >> 8 & 0xFF) * local49;
				if (local73 > 65535) {
					local73 = 65535;
				}
				@Pc(150) int local150 = local49 * (local19 & 0xFF);
				if (local150 > 65535) {
					local150 = 65535;
				}
				local19 = (local150 >> 8) + (local73 & 0xFF00) + (local125 << 8 & 0xFF001F);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[[I[[FI[[FIBIIBZBI[[FILclient!hg;)V")
	public static void method1324(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) float[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) byte arg10, @OriginalArg(12) int arg11, @OriginalArg(13) float[][] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) GlTile arg14) {
		@Pc(11) int local11 = (arg0 << 8) + 255;
		@Pc(17) int local17 = (arg5 << 8) + 255;
		@Pc(23) int local23 = (arg8 << 8) + 255;
		@Pc(29) int local29 = (arg13 << 8) + 255;
		@Pc(33) int[] local33 = anIntArrayArray35[arg10];
		@Pc(39) int[] local39 = new int[local33.length >> 1];
		@Pc(41) int local41;
		for (local41 = 0; local41 < local39.length; local41++) {
			local39[local41] = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, false, arg14, arg2, arg11, local33[local41 + local41], arg4, local33[local41 + local41 + 1]);
		}
		@Pc(87) int[] local87 = null;
		if (arg9) {
			@Pc(191) int local191;
			if (arg10 == 1) {
				local41 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 64, arg4, 128);
				local191 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 128, arg4, 64);
				local87 = new int[]{local191, local41, local39[2], local41, local39[0], local39[2]};
			} else if (arg10 == 2) {
				local87 = new int[6];
				local41 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 128, arg4, 128);
				local191 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 64, arg4, 0);
				local87[2] = local41;
				local87[0] = local39[0];
				local87[5] = local39[0];
				local87[3] = local41;
				local87[1] = local191;
				local87[4] = local39[1];
			} else if (arg10 == 3) {
				local87 = new int[6];
				local41 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 0, arg4, 128);
				local191 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 64, arg4, 0);
				local87[4] = local191;
				local87[1] = local39[1];
				local87[0] = local39[2];
				local87[3] = local41;
				local87[2] = local41;
				local87[5] = local39[2];
			} else if (arg10 == 4) {
				local87 = new int[3];
				local41 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 0, arg4, 128);
				local87[0] = local39[3];
				local87[2] = local39[0];
				local87[1] = local41;
			} else if (arg10 == 5) {
				local87 = new int[3];
				local41 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 128, arg4, 128);
				local87[1] = local41;
				local87[0] = local39[2];
				local87[2] = local39[3];
			} else if (arg10 == 6) {
				local87 = new int[6];
				local41 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 128, arg4, 0);
				local191 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 128, arg4, 128);
				local87[1] = local41;
				local87[0] = local39[3];
				local87[2] = local191;
				local87[4] = local39[0];
				local87[3] = local191;
				local87[5] = local39[3];
			} else if (arg10 == 7) {
				local87 = new int[6];
				local41 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 0, arg4, 128);
				local191 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 128, arg4, 0);
				local87[3] = local41;
				local87[2] = local41;
				local87[0] = local39[1];
				local87[4] = local39[2];
				local87[1] = local191;
				local87[5] = local39[1];
			} else if (arg10 == 8) {
				local87 = new int[3];
				local41 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 0, arg4, 0);
				local87[2] = local39[4];
				local87[0] = local39[3];
				local87[1] = local41;
			} else if (arg10 == 9) {
				local41 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 128, arg4, 64);
				local191 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 96, arg4, 32);
				@Pc(715) int local715 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 64, arg4, 0);
				local87 = new int[]{local191, local41, local39[4], local191, local39[4], local39[3], local191, local39[3], local39[2], local191, local39[2], local39[1], local191, local39[1], local715};
			} else if (arg10 == 10) {
				local87 = new int[9];
				local41 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 0, arg4, 128);
				local87[0] = local39[2];
				local87[8] = local39[0];
				local87[1] = local41;
				local87[4] = local41;
				local87[2] = local39[3];
				local87[7] = local41;
				local87[3] = local39[3];
				local87[5] = local39[4];
				local87[6] = local39[4];
			} else if (arg10 == 11) {
				local87 = new int[12];
				local41 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 0, arg4, 64);
				local191 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 128, arg4, 64);
				local87[5] = local41;
				local87[1] = local41;
				local87[8] = local41;
				local87[0] = local39[3];
				local87[2] = local39[0];
				local87[11] = local191;
				local87[6] = local39[2];
				local87[7] = local191;
				local87[10] = local39[1];
				local87[3] = local39[3];
				local87[4] = local39[2];
				local87[9] = local39[2];
			}
		}
		arg14.method1945(arg7, arg3, arg11, local39, local87, false);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IFII[[I[[II[[FIBIZLclient!hg;[[FII[[FI)I")
	public static int method3683(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[][] arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) GlTile arg11, @OriginalArg(13) float[][] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) float[][] arg15, @OriginalArg(17) int arg16) {
		@Pc(20) int local20;
		if (arg9 == 1) {
			local20 = arg14;
			arg14 = arg16;
			arg16 = 128 - local20;
		} else if (arg9 == 2) {
			arg16 = 128 - arg16;
			arg14 = 128 - arg14;
		} else if (arg9 == 3) {
			local20 = arg14;
			arg14 = 128 - arg16;
			arg16 = local20;
		}
		@Pc(66) float local66;
		@Pc(72) float local72;
		@Pc(80) int local80;
		@Pc(78) float local78;
		if (arg14 == 0 && arg16 == 0) {
			local66 = arg15[arg6][arg13];
			local72 = arg7[arg6][arg13];
			local78 = arg12[arg6][arg13];
			local80 = arg2;
		} else if (arg14 == 128 && arg16 == 0) {
			local80 = arg3;
			local66 = arg15[arg6 + 1][arg13];
			local72 = arg7[arg6 + 1][arg13];
			local78 = arg12[arg6 + 1][arg13];
		} else if (arg14 == 128 && arg16 == 128) {
			local72 = arg7[arg6 + 1][arg13 + 1];
			local78 = arg12[arg6 + 1][arg13 + 1];
			local66 = arg15[arg6 + 1][arg13 + 1];
			local80 = arg8;
		} else if (arg14 == 0 && arg16 == 128) {
			local72 = arg7[arg6][arg13 + 1];
			local66 = arg15[arg6][arg13 + 1];
			local78 = arg12[arg6][arg13 + 1];
			local80 = arg0;
		} else {
			local78 = arg12[arg6][arg13];
			local66 = arg15[arg6][arg13];
			@Pc(219) float local219 = (float) arg16 / 128.0F;
			@Pc(224) float local224 = (float) arg14 / 128.0F;
			@Pc(238) float local238 = local78 + (arg12[arg6 + 1][arg13] - local78) * local224;
			@Pc(253) float local253 = local66 + (arg15[arg6 + 1][arg13] - local66) * local224;
			@Pc(261) float local261 = arg12[arg6][arg13 + 1];
			@Pc(269) float local269 = arg15[arg6][arg13 + 1];
			@Pc(286) float local286 = local269 + (arg15[arg6 + 1][arg13 + 1] - local269) * local224;
			local72 = arg7[arg6][arg13];
			local66 = local253 + local219 * (local286 - local253);
			@Pc(309) float local309 = arg7[arg6][arg13 + 1];
			@Pc(326) float local326 = local261 + (arg12[arg6 + 1][arg13 + 1] - local261) * local224;
			local78 = local238 + local219 * (local326 - local238);
			@Pc(352) float local352 = local309 + (arg7[arg6 + 1][arg13 + 1] - local309) * local224;
			@Pc(367) float local367 = local72 + (arg7[arg6 + 1][arg13] - local72) * local224;
			local72 = local367 + (local352 - local367) * local219;
			@Pc(382) int local382 = method1540(arg14, arg2, arg3);
			@Pc(388) int local388 = method1540(arg14, arg0, arg8);
			local80 = method1540(arg16, local382, local388);
		}
		@Pc(405) int local405 = arg16 + (arg13 << 7);
		@Pc(413) int local413 = method3361(arg14, arg13, arg5, arg6, arg16);
		@Pc(420) int local420 = (arg6 << 7) + arg14;
		return arg11.method1941(local420, local413, local405, local78, local66, local72, arg10 ? local80 & 0xFFFFFF00 : local80, arg4 == null ? 0.0F : (float) (local413 - method3361(arg14, arg13, arg4, arg6, arg16)) / arg1);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBI[[III)I")
	public static int method3361(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(25) int local25 = arg0 * arg2[arg3 + 1][arg1] + (128 - arg0) * arg2[arg3][arg1] >> 7;
		@Pc(52) int local52 = arg2[arg3][arg1 + 1] * (128 - arg0) + arg2[arg3 + 1][arg1 + 1] * arg0 >> 7;
		return local25 * (128 - arg4) + arg4 * local52 >> 7;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIII)I")
	public static int method1540(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg2) {
			return arg1;
		} else {
			@Pc(17) int local17 = 128 - arg0;
			@Pc(50) int local50 = arg0 * (arg2 >>> 7 & 0x1FE01FE) + local17 * (arg1 >>> 7 & 0x1FE01FE) & 0xFF00FF00;
			@Pc(65) int local65 = local17 * (arg1 & 0xFF00FF) + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00;
			return local50 + (local65 >> 7);
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IBIIII)V")
	public static void method645(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3;
		@Pc(10) int local10;
		for (local3 = arg1; local3 <= arg3 + arg1; local3++) {
			for (local10 = arg2; local10 <= arg4 + arg2; local10++) {
				if (local10 >= 0 && local10 < 104 && local3 >= 0 && local3 < 104) {
					shadowmap[arg0][local10][local3] = 127;
				}
			}
		}
		for (local3 = arg1; local3 < arg3 + arg1; local3++) {
			for (local10 = arg2; local10 < arg2 + arg4; local10++) {
				if (local10 >= 0 && local10 < 104 && local3 >= 0 && local3 < 104) {
					tileHeights[arg0][local10][local3] = arg0 <= 0 ? 0 : tileHeights[arg0 - 1][local10][local3];
				}
			}
		}
		if (arg2 > 0 && arg2 < 104) {
			for (local3 = arg1 + 1; local3 < arg1 + arg3; local3++) {
				if (local3 >= 0 && local3 < 104) {
					tileHeights[arg0][arg2][local3] = tileHeights[arg0][arg2 - 1][local3];
				}
			}
		}
		if (arg1 > 0 && arg1 < 104) {
			for (local3 = arg2 + 1; local3 < arg2 + arg4; local3++) {
				if (local3 >= 0 && local3 < 104) {
					tileHeights[arg0][local3][arg1] = tileHeights[arg0][local3][arg1 - 1];
				}
			}
		}
		if (arg2 < 0 || arg1 < 0 || arg2 >= 104 || arg1 >= 104) {
			return;
		}
		if (arg0 == 0) {
			if (arg2 > 0 && tileHeights[arg0][arg2 - 1][arg1] != 0) {
				tileHeights[arg0][arg2][arg1] = tileHeights[arg0][arg2 - 1][arg1];
			} else if (arg1 > 0 && tileHeights[arg0][arg2][arg1 - 1] != 0) {
				tileHeights[arg0][arg2][arg1] = tileHeights[arg0][arg2][arg1 - 1];
			} else if (arg2 > 0 && arg1 > 0 && tileHeights[arg0][arg2 - 1][arg1 - 1] != 0) {
				tileHeights[arg0][arg2][arg1] = tileHeights[arg0][arg2 - 1][arg1 - 1];
			}
		} else if (arg2 > 0 && tileHeights[arg0 - 1][arg2 - 1][arg1] != tileHeights[arg0][arg2 - 1][arg1]) {
			tileHeights[arg0][arg2][arg1] = tileHeights[arg0][arg2 - 1][arg1];
		} else if (arg1 > 0 && tileHeights[arg0][arg2][arg1 - 1] != tileHeights[arg0 - 1][arg2][arg1 - 1]) {
			tileHeights[arg0][arg2][arg1] = tileHeights[arg0][arg2][arg1 - 1];
		} else if (arg2 > 0 && arg1 > 0 && tileHeights[arg0][arg2 - 1][arg1 - 1] != tileHeights[arg0 - 1][arg2 - 1][arg1 - 1]) {
			tileHeights[arg0][arg2][arg1] = tileHeights[arg0][arg2 - 1][arg1 - 1];
		}
	}

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
					readTile(arg2, arg5, arg1, local95, local117 + arg3, arg4 + local21, 0, local14);
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
				@Pc(168) byte local168 = local95.g1b();
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
							aByteArrayArrayArray13[local117][local243][local190] = 0;
							local190++;
						}
						local243++;
					}
				} else if (local168 == 1) {
					for (local243 = 0; local243 < 64; local243 += 4) {
						for (local188 = 0; local188 < 64; local188 += 4) {
							@Pc(305) byte local305 = local95.g1b();
							for (local194 = local243 + arg4; local194 < arg4 + local243 + 4; local194++) {
								for (@Pc(320) int local320 = arg3 + local188; local320 < arg3 + local188 + 4; local320++) {
									if (local194 >= 0 && local194 < 104 && local320 >= 0 && local320 < 104) {
										aByteArrayArrayArray13[local117][local194][local320] = local305;
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
							aByteArrayArrayArray13[local117][local243][local190] = aByteArrayArrayArray13[local117 - 1][local243][local190];
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
			label270:
			while (true) {
				label263:
				do {
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
								FogManager.chunksAtmosphere[local243][local188] = local490;
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
					local529.z += arg3 << 7;
					local529.x += arg4 << 7;
					local194 = local529.z >> 7;
					local190 = local529.x >> 7;
					if (local190 >= 0 && local194 >= 0 && local190 < 104 && local194 < 104) {
						local529.aBoolean125 = (renderFlags[1][local190][local194] & 0x2) != 0;
						local529.y = tileHeights[local529.level][local190][local194] - local529.y;
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
						aByteArrayArrayArray13[local21][local243][local188] = 0;
					}
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
						readTile(0, 0, arg9, local96, rotateZ(arg0, local103 & 0x7, local108 & 0x7) + arg4, rotateX(arg0, local108 & 0x7, local103 & 0x7) + arg1, arg0, arg2);
					} else {
						readTile(0, 0, arg9, local96, -1, -1, 0, 0);
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
								aByteArrayArrayArray13[arg2][local232][local417] = 0;
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
											local316 = arg1 + rotateX(arg0, local266 & 0x7, local255 & 0x7);
											@Pc(328) int local328 = rotateZ(arg0, local255 & 0x7, local266 & 0x7) + arg4;
											if (local316 >= 0 && local316 < 104 && local328 >= 0 && local328 < 104) {
												aByteArrayArrayArray13[arg2][local316][local328] = local246;
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
			label207:
			while (true) {
				label200:
				do {
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
					FogManager.chunksAtmosphere[arg1 >> 3][arg4 >> 3] = local472;
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
						local266 = rotateXFine(arg0, local517.x & 0x3FF, local517.z & 0x3FF) + (arg1 << 7);
						local316 = rotateZFine(local517.x & 0x3FF, arg0, local517.z & 0x3FF) + (arg4 << 7);
						local517.x = local266;
						local517.z = local316;
						local417 = local517.x >> 7;
						local255 = local517.z >> 7;
						if (local417 >= 0 && local255 >= 0 && local417 < 104 && local255 < 104) {
							local517.aBoolean125 = (renderFlags[1][local417][local255] & 0x2) != 0;
							local517.y = tileHeights[local517.level][local417][local255] - local517.y;
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
				aByteArrayArrayArray13[arg2][local497][local232] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZII)I")
	public static int rotateX(@OriginalArg(0) int arg0, @OriginalArg(2) int z, @OriginalArg(3) int x) {
		@Pc(3) int angle = arg0 & 0x3;
		if (angle == 0) {
			return x;
		} else if (angle == 1) {
			return z;
		} else if (angle == 2) {
			return 7 - x;
		} else {
			return 7 - z;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBII)I")
	public static int rotateZ(@OriginalArg(0) int arg0, @OriginalArg(2) int x, @OriginalArg(3) int z) {
		@Pc(3) int angle = arg0 & 0x3;
		if (angle == 0) {
			return z;
		} else if (angle == 1) {
			return 7 - x;
		} else if (angle == 2) {
			return 7 - z;
		} else {
			return x;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIBI)I")
	public static int rotateXFine(@OriginalArg(0) int arg0, @OriginalArg(1) int x, @OriginalArg(3) int z) {
		@Pc(3) int angle = arg0 & 0x3;
		if (angle == 0) {
			return x;
		} else if (angle == 1) {
			return z;
		} else if (angle == 2) {
			return 1023 - x;
		} else {
			return 1023 - z;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIZI)I")
	public static int rotateZFine(@OriginalArg(0) int x, @OriginalArg(1) int arg1, @OriginalArg(3) int z) {
		@Pc(3) int angle = arg1 & 0x3;
		if (angle == 0) {
			return z;
		} else if (angle == 1) {
			return 1023 - x;
		} else if (angle == 2) {
			return 1023 - z;
		} else {
			return x;
		}
	}
}
