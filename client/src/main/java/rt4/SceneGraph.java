package rt4;

import com.jogamp.opengl.GL2;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class SceneGraph {
	@OriginalMember(owner = "client!bb", name = "g", descriptor = "[[[B")
	public static final byte[][][] tileFlags = new byte[4][104][104];
	@OriginalMember(owner = "client!mi", name = "Y", descriptor = "[[[Lclient!ih;")
	public static final LinkedList[][][] objStacks = new LinkedList[4][104][104];
	@OriginalMember(owner = "client!te", name = "B", descriptor = "[I")
	public static final int[] anIntArray469 = new int[]{0, -1, 0, 1};
	@OriginalMember(owner = "client!fb", name = "q", descriptor = "[I")
	public static final int[] anIntArray154 = new int[]{-1, -1, 1, 1};
	@OriginalMember(owner = "client!j", name = "O", descriptor = "[I")
	public static final int[] anIntArray565 = new int[]{1, -1, -1, 1};
	@OriginalMember(owner = "client!vl", name = "e", descriptor = "[I")
	public static final int[] anIntArray517 = new int[]{1, 2, 4, 8};
	@OriginalMember(owner = "client!pg", name = "T", descriptor = "[I")
	public static final int[] anIntArray386 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
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
							local142[local168][local209] = method1309(overlay / local202, local178 / local202, local173 * 256 / local200);
						}
					}
				}
			}
			for (local168 = 1; local168 < 103; local168++) {
				label771:
				for (local173 = 1; local173 < 103; local173++) {
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
								@Pc(1067) boolean local1067 = local178 != 0 || tileShapes[local152][local168][local173] == 0;
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
										label737:
										for (texture = local168 - 1; texture <= local168 + 1; texture++) {
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
									ShadowManager.method4197(local322, local1242, local1301 == -2 || !local1248.aBoolean311, local234 == -1 || !FluTypeList.get(local178 - 1).aBoolean198, local168, local173, local200 - tileHeights[0][local168][local173], local202 - tileHeights[0][local168 + 1][local173], local209 - tileHeights[0][local168 + 1][local173 + 1], -tileHeights[0][local168][local173 + 1] + local349);
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
					method3884(local152, local2204);
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
						label454:
						while (overlay > 0) {
							for (local202 = local173; local202 <= local178; local202++) {
								if ((anIntArrayArrayArray6[overlay - 1][local168][local202] & 0x1) == 0) {
									break label454;
								}
							}
							overlay--;
						}
						label443:
						while (local200 < 3) {
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
						label508:
						while (overlay > 0) {
							for (local202 = local173; local202 <= local178; local202++) {
								if ((anIntArrayArrayArray6[overlay - 1][local202][local2204] & 0x2) == 0) {
									break label508;
								}
							}
							overlay--;
						}
						label497:
						while (local200 < 3) {
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
						label562:
						while (local173 > 0) {
							for (local202 = overlay; local202 <= local200; local202++) {
								if ((anIntArrayArrayArray6[local152][local173 - 1][local202] & 0x4) == 0) {
									break label562;
								}
							}
							local173--;
						}
						label551:
						while (local178 < 104) {
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
	public static boolean method1141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Entity arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
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
			if (type.anInt4435 != 0) {
				collision.unflagWall(angle, type.aBoolean207, z, shape, x);
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
			if (type.anInt4435 != 0 && type.width + x < 104 && type.width + z < 104 && x + type.length < 104 && z + type.length < 104) {
				collision.unflagScenery(x, type.width, type.aBoolean207, angle, type.length, z);
			}
		} else if (arg3 == 3) {
			@Pc(211) GroundDecor groundDecor = removeGroundDecor(level, x, z);
			if (groundDecor != null) {
				local100 = groundDecor.entity;
			}
			if (type.anInt4435 == 1) {
				collision.unflagGroundDecor(z, x);
			}
		}
		if (!GlRenderer.enabled || !type.aBoolean212) {
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
				Loc.method181(type, anIntArray469[angle] * 8, angle, Static34.anIntArray80[angle] * 8, 4, x, z, arg4);
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

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)I")
	public static int method1309(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg1 >>= 0x4;
		} else if (arg0 > 217) {
			arg1 >>= 0x3;
		} else if (arg0 > 192) {
			arg1 >>= 0x2;
		} else if (arg0 > 179) {
			arg1 >>= 0x1;
		}
		return (arg0 >> 1) + (arg1 >> 5 << 7) + (arg2 >> 2 << 10);
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
					if (anIntArrayArrayArray12[arg0][local16][local20] == -Static156.anInt437) {
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
		} else if (Static9.method187(arg0, arg1, arg3)) {
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
	public static ObjStackEntity method3420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Tile local7 = tiles[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) ObjStackEntity local14 = local7.aClass79_1;
			local7.aClass79_1 = null;
			return local14;
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
											local31 = tiles[local24];
											@Pc(33) float local33 = 0.0F;
											if (GlRenderer.enabled) {
												if (underwaterTileHeights == tileHeights) {
													var9 = anIntArrayArray11[local18][local21];
													var10 = var9 & 0xFFFFFF;
													if (var10 != Static152.anInt3604) {
														Static152.anInt3604 = var10;
														WaterMaterialRenderer.method619(var10);
														FogManager.setFogColor(WaterMaterialRenderer.method2422());
													}
													local65 = var9 >>> 24 << 3;
													if (local65 != Static247.anInt730) {
														Static247.anInt730 = local65;
														Static147.method2761(local65);
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
														Static147.method2762(local153.shapedTile, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local18, local21, Static9.method187(0, local18, local21));
													}
												} else
													Static247.method2610(local153.plainTile, 0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local18, local21, Static9.method187(0, local18, local21));
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
												Static247.method2610(local8.plainTile, local27, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local18, local21, true);
											} else {
												var24 = true;
												if (local8.plainTile.anInt4865 != 12345678 || MiniMenu.aBoolean187 && local24 <= MiniMenu.anInt3902) {
													Static247.method2610(local8.plainTile, local27, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local18, local21, false);
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
												local65 = Static247.anIntArray324[var10];
												local8.anInt670 = anIntArray386[var10];
											}
											if (local616 != null) {
												if ((local616.anInt3049 & Static247.anIntArray215[var10]) == 0) {
													local8.anInt663 = 0;
												} else if (local616.anInt3049 == 16) {
													local8.anInt663 = 3;
													local8.anInt665 = Static247.anIntArray294[var10];
													local8.anInt667 = 3 - local8.anInt665;
												} else if (local616.anInt3049 == 32) {
													local8.anInt663 = 6;
													local8.anInt665 = Static247.anIntArray489[var10];
													local8.anInt667 = 6 - local8.anInt665;
												} else if (local616.anInt3049 == 64) {
													local8.anInt663 = 12;
													local8.anInt665 = Static247.anIntArray211[var10];
													local8.anInt667 = 12 - local8.anInt665;
												} else {
													local8.anInt663 = 9;
													local8.anInt665 = Static247.anIntArray307[var10];
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
													local619.primary.render(0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local619.xFine + local619.xOffset - Static123.anInt3555, local619.anInt1391 - Static123.anInt3947, local619.zFine + local619.zOffset - Static217.anInt4903, local619.key, local24, null);
												} else if (local619.anInt1395 == 256) {
													local894 = local619.xFine - Static123.anInt3555;
													local899 = local619.anInt1391 - Static123.anInt3947;
													local904 = local619.zFine - Static217.anInt4903;
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
														local619.primary.render(0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local894 + local619.xOffset, local899, local904 + local619.zOffset, local619.key, local24, null);
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
														label882:
														{
															if ((var22.key & 0xFC000L) == 16384L) {
																local65 = var22.xFine - Static123.anInt3555;
																local115 = var22.zFine - Static217.anInt4903;
																local1332 = (int) (var22.key >> 20 & 0x3L);
																if (local1332 == 0) {
																	local65 -= 64;
																	local115 += 64;
																	if (local115 < local65 && local18 > 0 && local21 < length - 1) {
																		LightingManager.method2393(Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local24, local18 - 1, local21 + 1);
																		break label882;
																	}
																} else if (local1332 == 1) {
																	local65 += 64;
																	local115 += 64;
																	if (local115 < -local65 && local18 < width - 1 && local21 < length - 1) {
																		LightingManager.method2393(Static123.anInt3555, Static123.anInt3947, Static217.anInt4903, local24, local18 + 1, local21 + 1);
																		break label882;
																	}
																} else if (local1332 == 2) {
																	local65 += 64;
																	local115 -= 64;
																	if (local115 > local65 && local18 < width - 1 && local21 > 0) {
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
											label767:
											for (local65 = 0; local65 < var9; local65++) {
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
													aClass31Array2[var10++] = var25;
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
													@Pc(1628) Scenery local1628 = aClass31Array2[local1332];
													if (local1628.anInt1707 != Static156.anInt437) {
														if (local1628.anInt1705 > local65) {
															local65 = local1628.anInt1705;
															local115 = local1332;
														} else if (local1628.anInt1705 == local65) {
															local899 = local1628.anInt1699 - Static123.anInt3555;
															local904 = local1628.anInt1703 - Static217.anInt4903;
															var17 = aClass31Array2[local115].anInt1699 - Static123.anInt3555;
															var18 = aClass31Array2[local115].anInt1703 - Static217.anInt4903;
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
												local1697.anInt1707 = Static156.anInt437;
												if (!method1599(local27, local1697.xMin, local1697.xMax, local1697.zMin, local1697.zMax, local1697.entity.getMinY())) {
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
						local2109.primary.render(0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local2109.xFine + local2109.xOffset - Static123.anInt3555, local2109.anInt1391 - Static123.anInt3947, local2109.zFine + local2109.zOffset - Static217.anInt4903, local2109.key, local24, null);
					} else if (local2109.anInt1395 == 256) {
						local65 = local2109.xFine - Static123.anInt3555;
						local115 = local2109.anInt1391 - Static123.anInt3947;
						local1332 = local2109.zFine - Static217.anInt4903;
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
							local2109.primary.render(0, Static160.anInt2886, Static121.anInt3038, Static231.anInt5205, Static81.anInt2222, local65 + local2109.xOffset, local115, local1332 + local2109.zOffset, local2109.key, local24, null);
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
			if (local24 < levels - 1) {
				local2388 = tiles[local24 + 1][local18][local21];
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

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIII)Z")
	public static boolean method4611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static9.method187(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return method4394(local10 + 1, tileHeights[arg0][arg1][arg2] + arg3, local14 + 1) && method4394(local10 + 128 - 1, tileHeights[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && method4394(local10 + 128 - 1, tileHeights[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && method4394(local10 + 1, tileHeights[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
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
		@Pc(24) int local24 = tileHeights[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static123.anInt3555) {
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
				if (local14 < Static217.anInt4903) {
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
				if (local10 < Static123.anInt3555) {
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
				if (local14 > Static217.anInt4903) {
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
	public static void method3397(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) CollisionMap arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg1 && !allLevelsAreVisible() && (tileFlags[0][arg7][arg8] & 0x2) == 0) {
			if ((tileFlags[arg2][arg7][arg8] & 0x10) != 0) {
				return;
			}
			if (Static4.method22(arg8, arg7, arg2) != LoginManager.centralPlane) {
				return;
			}
		}
		if (arg2 < firstVisibleLevel) {
			firstVisibleLevel = arg2;
		}
		@Pc(62) LocType local62 = LocTypeList.get(arg5);
		if (GlRenderer.enabled && local62.aBoolean216) {
			return;
		}
		@Pc(84) int local84;
		@Pc(81) int local81;
		if (arg9 == 1 || arg9 == 3) {
			local81 = local62.width;
			local84 = local62.length;
		} else {
			local84 = local62.width;
			local81 = local62.length;
		}
		@Pc(103) int local103;
		@Pc(112) int local112;
		if (arg7 + local84 <= 104) {
			local103 = arg7 + (local84 >> 1);
			local112 = arg7 + (local84 + 1 >> 1);
		} else {
			local112 = arg7 + 1;
			local103 = arg7;
		}
		@Pc(129) int local129;
		@Pc(133) int local133;
		if (local81 + arg8 > 104) {
			local129 = arg8;
			local133 = arg8 + 1;
		} else {
			local129 = (local81 >> 1) + arg8;
			local133 = arg8 + (local81 + 1 >> 1);
		}
		@Pc(153) int[][] local153 = tileHeights[arg0];
		@Pc(165) int local165 = (local84 << 6) + (arg7 << 7);
		@Pc(173) int local173 = (local81 << 6) + (arg8 << 7);
		@Pc(199) int local199 = local153[local103][local133] + local153[local112][local129] + local153[local103][local129] + local153[local112][local133] >> 2;
		@Pc(201) int local201 = 0;
		@Pc(213) int[][] local213;
		if (GlRenderer.enabled && arg0 != 0) {
			local213 = tileHeights[0];
			local201 = local199 - (local213[local112][local133] + local213[local112][local129] + local213[local103][local129] + local213[local103][local133] >> 2);
		}
		local213 = null;
		@Pc(261) long local261 = arg7 | 0x40000000 | arg8 << 7 | arg6 << 14 | arg9 << 20;
		if (arg3) {
			local213 = surfaceTileHeights[0];
		} else if (arg0 < 3) {
			local213 = tileHeights[arg0 + 1];
		}
		if (local62.anInt4429 == 0 || arg3) {
			local261 |= Long.MIN_VALUE;
		}
		if (local62.anInt4438 == 1) {
			local261 |= 0x400000L;
		}
		if (local62.aBoolean213) {
			local261 |= 0x80000000L;
		}
		if (local62.hasAreaSound()) {
			AreaSoundManager.add(arg8, local62, arg9, null, arg7, arg2, null);
		}
		@Pc(330) boolean local330 = local62.aBoolean212 & !arg3;
		local261 |= (long) arg5 << 32;
		@Pc(387) Entity local387;
		@Pc(403) Loc_Class139 local403;
		if (arg6 == 22) {
			if (Preferences.showGroundDecorations || local62.anInt4429 != 0 || local62.anInt4435 == 1 || local62.aBoolean206) {
				if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
					local403 = local62.method3428(arg9, local165, local153, 22, local199, local213, arg1, null, local330, local173);
					if (GlRenderer.enabled && local330) {
						ShadowManager.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
					}
					local387 = local403.aClass8_10;
				} else {
					local387 = new Loc(arg5, 22, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
				}
				setGroundDecor(arg2, arg7, arg8, local199, local387, local261, local62.aBoolean211);
				if (local62.anInt4435 == 1 && arg4 != null) {
					arg4.flagGroundDecor(arg7, arg8);
				}
			}
		} else if (arg6 == 10 || arg6 == 11) {
			if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
				local403 = local62.method3428(arg6 == 11 ? arg9 + 4 : arg9, local165, local153, 10, local199, local213, arg1, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					ShadowManager.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
				}
				local387 = local403.aClass8_10;
			} else {
				local387 = new Loc(arg5, 10, arg6 == 11 ? arg9 + 4 : arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
			}
			if (local387 != null) {
				@Pc(531) boolean local531 = Static5.method35(arg2, arg7, arg8, local199, local84, local81, local387, local261);
				if (local62.aBoolean215 && local531 && arg1) {
					@Pc(541) int local541 = 15;
					if (local387 instanceof Model) {
						local541 = ((Model) local387).method4566() / 4;
						if (local541 > 30) {
							local541 = 30;
						}
					}
					for (@Pc(560) int local560 = 0; local560 <= local84; local560++) {
						for (@Pc(565) int local565 = 0; local565 <= local81; local565++) {
							if (aByteArrayArrayArray9[arg2][arg7 + local560][local565 + arg8] < local541) {
								aByteArrayArrayArray9[arg2][arg7 + local560][arg8 + local565] = (byte) local541;
							}
						}
					}
				}
			}
			if (local62.anInt4435 != 0 && arg4 != null) {
				arg4.flagScenery(arg7, local62.aBoolean207, arg8, local84, local81);
			}
		} else if (arg6 >= 12) {
			if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
				local403 = local62.method3428(arg9, local165, local153, arg6, local199, local213, arg1, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					ShadowManager.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
				}
				local387 = local403.aClass8_10;
			} else {
				local387 = new Loc(arg5, arg6, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
			}
			Static5.method35(arg2, arg7, arg8, local199, 1, 1, local387, local261);
			if (arg1 && arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg2 > 0) {
				anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x4;
			}
			if (local62.anInt4435 != 0 && arg4 != null) {
				arg4.flagScenery(arg7, local62.aBoolean207, arg8, local84, local81);
			}
		} else if (arg6 == 0) {
			if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
				local403 = local62.method3428(arg9, local165, local153, 0, local199, local213, arg1, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					ShadowManager.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
				}
				local387 = local403.aClass8_10;
			} else {
				local387 = new Loc(arg5, 0, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
			}
			setWall(arg2, arg7, arg8, local199, local387, null, anIntArray517[arg9], 0, local261);
			if (arg1) {
				if (arg9 == 0) {
					if (local62.aBoolean215) {
						aByteArrayArrayArray9[arg2][arg7][arg8] = 50;
						aByteArrayArrayArray9[arg2][arg7][arg8 + 1] = 50;
					}
					if (local62.aBoolean220) {
						anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x1;
					}
				} else if (arg9 == 1) {
					if (local62.aBoolean215) {
						aByteArrayArrayArray9[arg2][arg7][arg8 + 1] = 50;
						aByteArrayArrayArray9[arg2][arg7 + 1][arg8 + 1] = 50;
					}
					if (local62.aBoolean220) {
						anIntArrayArrayArray6[arg2][arg7][arg8 + 1] |= 0x2;
					}
				} else if (arg9 == 2) {
					if (local62.aBoolean215) {
						aByteArrayArrayArray9[arg2][arg7 + 1][arg8] = 50;
						aByteArrayArrayArray9[arg2][arg7 + 1][arg8 + 1] = 50;
					}
					if (local62.aBoolean220) {
						anIntArrayArrayArray6[arg2][arg7 + 1][arg8] |= 0x1;
					}
				} else if (arg9 == 3) {
					if (local62.aBoolean215) {
						aByteArrayArrayArray9[arg2][arg7][arg8] = 50;
						aByteArrayArrayArray9[arg2][arg7 + 1][arg8] = 50;
					}
					if (local62.aBoolean220) {
						anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x2;
					}
				}
			}
			if (local62.anInt4435 != 0 && arg4 != null) {
				arg4.flagWall(arg9, arg6, local62.aBoolean207, arg8, arg7);
			}
			if (local62.wallDecorOffsetScale != 16) {
				method559(arg2, arg7, arg8, local62.wallDecorOffsetScale);
			}
		} else if (arg6 == 1) {
			if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
				local403 = local62.method3428(arg9, local165, local153, 1, local199, local213, arg1, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					ShadowManager.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
				}
				local387 = local403.aClass8_10;
			} else {
				local387 = new Loc(arg5, 1, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
			}
			setWall(arg2, arg7, arg8, local199, local387, null, LoginManager.anIntArray204[arg9], 0, local261);
			if (local62.aBoolean215 && arg1) {
				if (arg9 == 0) {
					aByteArrayArrayArray9[arg2][arg7][arg8 + 1] = 50;
				} else if (arg9 == 1) {
					aByteArrayArrayArray9[arg2][arg7 + 1][arg8 + 1] = 50;
				} else if (arg9 == 2) {
					aByteArrayArrayArray9[arg2][arg7 + 1][arg8] = 50;
				} else if (arg9 == 3) {
					aByteArrayArrayArray9[arg2][arg7][arg8] = 50;
				}
			}
			if (local62.anInt4435 != 0 && arg4 != null) {
				arg4.flagWall(arg9, arg6, local62.aBoolean207, arg8, arg7);
			}
		} else {
			@Pc(1226) int local1226;
			if (arg6 == 2) {
				local1226 = arg9 + 1 & 0x3;
				@Pc(1269) Entity local1269;
				@Pc(1254) Entity local1254;
				if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
					@Pc(1287) Loc_Class139 local1287 = local62.method3428(arg9 + 4, local165, local153, 2, local199, local213, arg1, null, local330, local173);
					if (GlRenderer.enabled && local330) {
						ShadowManager.method4211(local1287.aClass36_Sub1_3, local165, local201, local173);
					}
					local1254 = local1287.aClass8_10;
					local1287 = local62.method3428(local1226, local165, local153, 2, local199, local213, arg1, null, local330, local173);
					if (GlRenderer.enabled && local330) {
						ShadowManager.method4211(local1287.aClass36_Sub1_3, local165, local201, local173);
					}
					local1269 = local1287.aClass8_10;
				} else {
					local1254 = new Loc(arg5, 2, arg9 + 4, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
					local1269 = new Loc(arg5, 2, local1226, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
				}
				setWall(arg2, arg7, arg8, local199, local1254, local1269, anIntArray517[arg9], anIntArray517[local1226], local261);
				if (local62.aBoolean220 && arg1) {
					if (arg9 == 0) {
						anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x1;
						anIntArrayArrayArray6[arg2][arg7][arg8 + 1] |= 0x2;
					} else if (arg9 == 1) {
						anIntArrayArrayArray6[arg2][arg7][arg8 + 1] |= 0x2;
						anIntArrayArrayArray6[arg2][arg7 + 1][arg8] |= 0x1;
					} else if (arg9 == 2) {
						anIntArrayArrayArray6[arg2][arg7 + 1][arg8] |= 0x1;
						anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x2;
					} else if (arg9 == 3) {
						anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x2;
						anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x1;
					}
				}
				if (local62.anInt4435 != 0 && arg4 != null) {
					arg4.flagWall(arg9, arg6, local62.aBoolean207, arg8, arg7);
				}
				if (local62.wallDecorOffsetScale != 16) {
					method559(arg2, arg7, arg8, local62.wallDecorOffsetScale);
				}
			} else if (arg6 == 3) {
				if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
					local403 = local62.method3428(arg9, local165, local153, 3, local199, local213, arg1, null, local330, local173);
					if (GlRenderer.enabled && local330) {
						ShadowManager.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
					}
					local387 = local403.aClass8_10;
				} else {
					local387 = new Loc(arg5, 3, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
				}
				setWall(arg2, arg7, arg8, local199, local387, null, LoginManager.anIntArray204[arg9], 0, local261);
				if (local62.aBoolean215 && arg1) {
					if (arg9 == 0) {
						aByteArrayArrayArray9[arg2][arg7][arg8 + 1] = 50;
					} else if (arg9 == 1) {
						aByteArrayArrayArray9[arg2][arg7 + 1][arg8 + 1] = 50;
					} else if (arg9 == 2) {
						aByteArrayArrayArray9[arg2][arg7 + 1][arg8] = 50;
					} else if (arg9 == 3) {
						aByteArrayArrayArray9[arg2][arg7][arg8] = 50;
					}
				}
				if (local62.anInt4435 != 0 && arg4 != null) {
					arg4.flagWall(arg9, arg6, local62.aBoolean207, arg8, arg7);
				}
			} else if (arg6 == 9) {
				if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
					local403 = local62.method3428(arg9, local165, local153, arg6, local199, local213, arg1, null, local330, local173);
					if (GlRenderer.enabled && local330) {
						ShadowManager.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
					}
					local387 = local403.aClass8_10;
				} else {
					local387 = new Loc(arg5, arg6, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
				}
				Static5.method35(arg2, arg7, arg8, local199, 1, 1, local387, local261);
				if (local62.anInt4435 != 0 && arg4 != null) {
					arg4.flagScenery(arg7, local62.aBoolean207, arg8, local84, local81);
				}
				if (local62.wallDecorOffsetScale != 16) {
					method559(arg2, arg7, arg8, local62.wallDecorOffsetScale);
				}
			} else if (arg6 == 4) {
				if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
					local403 = local62.method3428(arg9, local165, local153, 4, local199, local213, arg1, null, local330, local173);
					if (GlRenderer.enabled && local330) {
						ShadowManager.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
					}
					local387 = local403.aClass8_10;
				} else {
					local387 = new Loc(arg5, 4, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
				}
				setWallDecor(arg2, arg7, arg8, local199, local387, null, anIntArray517[arg9], 0, 0, 0, local261);
			} else {
				@Pc(1889) long local1889;
				@Pc(1934) Entity local1934;
				@Pc(1950) Loc_Class139 local1950;
				if (arg6 == 5) {
					local1226 = 16;
					local1889 = getWallKey(arg2, arg7, arg8);
					if (local1889 != 0L) {
						local1226 = LocTypeList.get(Integer.MAX_VALUE & (int) (local1889 >>> 32)).wallDecorOffsetScale;
					}
					if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
						local1950 = local62.method3428(arg9, local165, local153, 4, local199, local213, arg1, null, local330, local173);
						if (GlRenderer.enabled && local330) {
							ShadowManager.method4211(local1950.aClass36_Sub1_3, local165 - Static34.anIntArray80[arg9] * 8, local201, local173 - anIntArray469[arg9] * 8);
						}
						local1934 = local1950.aClass8_10;
					} else {
						local1934 = new Loc(arg5, 4, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
					}
					setWallDecor(arg2, arg7, arg8, local199, local1934, null, anIntArray517[arg9], 0, local1226 * Static34.anIntArray80[arg9], anIntArray469[arg9] * local1226, local261);
				} else if (arg6 == 6) {
					local1226 = 8;
					local1889 = getWallKey(arg2, arg7, arg8);
					if (local1889 != 0L) {
						local1226 = LocTypeList.get(Integer.MAX_VALUE & (int) (local1889 >>> 32)).wallDecorOffsetScale / 2;
					}
					if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
						local1950 = local62.method3428(arg9 + 4, local165, local153, 4, local199, local213, arg1, null, local330, local173);
						if (GlRenderer.enabled && local330) {
							ShadowManager.method4211(local1950.aClass36_Sub1_3, local165 - anIntArray565[arg9] * 8, local201, local173 - anIntArray154[arg9] * 8);
						}
						local1934 = local1950.aClass8_10;
					} else {
						local1934 = new Loc(arg5, 4, arg9 + 4, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
					}
					setWallDecor(arg2, arg7, arg8, local199, local1934, null, 256, arg9, local1226 * anIntArray565[arg9], local1226 * anIntArray154[arg9], local261);
				} else if (arg6 == 7) {
					@Pc(2137) int local2137 = arg9 + 2 & 0x3;
					if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
						@Pc(2183) Loc_Class139 local2183 = local62.method3428(local2137 + 4, local165, local153, 4, local199, local213, arg1, null, local330, local173);
						if (GlRenderer.enabled && local330) {
							ShadowManager.method4211(local2183.aClass36_Sub1_3, local165, local201, local173);
						}
						local387 = local2183.aClass8_10;
					} else {
						local387 = new Loc(arg5, 4, local2137 + 4, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
					}
					setWallDecor(arg2, arg7, arg8, local199, local387, null, 256, local2137, 0, 0, local261);
				} else if (arg6 == 8) {
					local1226 = 8;
					local1889 = getWallKey(arg2, arg7, arg8);
					if (local1889 != 0L) {
						local1226 = LocTypeList.get(Integer.MAX_VALUE & (int) (local1889 >>> 32)).wallDecorOffsetScale / 2;
					}
					@Pc(2244) int local2244 = arg9 + 2 & 0x3;
					@Pc(2289) Entity local2289;
					if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
						@Pc(2297) int local2297 = anIntArray154[arg9] * 8;
						@Pc(2303) int local2303 = anIntArray565[arg9] * 8;
						@Pc(2319) Loc_Class139 local2319 = local62.method3428(arg9 + 4, local165, local153, 4, local199, local213, arg1, null, local330, local173);
						if (GlRenderer.enabled && local330) {
							ShadowManager.method4211(local2319.aClass36_Sub1_3, local165 - local2303, local201, local173 - local2297);
						}
						local1934 = local2319.aClass8_10;
						local2319 = local62.method3428(local2244 + 4, local165, local153, 4, local199, local213, arg1, null, local330, local173);
						if (GlRenderer.enabled && local330) {
							ShadowManager.method4211(local2319.aClass36_Sub1_3, local165 - local2303, local201, local173 - local2297);
						}
						local2289 = local2319.aClass8_10;
					} else {
						local1934 = new Loc(arg5, 4, arg9 + 4, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
						local2289 = new Loc(arg5, 4, local2244 + 4, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
					}
					setWallDecor(arg2, arg7, arg8, local199, local1934, local2289, 256, arg9, local1226 * anIntArray565[arg9], anIntArray154[arg9] * local1226, local261);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
	public static void method846() {
		if (!allLevelsAreVisible() && LoginManager.centralPlane != Player.level) {
			LoginManager.method2463(Player.level, LoginManager.centralZoneZ, LoginManager.centralZoneX, PlayerList.self.movementQueueZ[0], false, PlayerList.self.movementQueueX[0]);
		} else if (Player.level != LightingManager.anInt2875 && MiniMap.renderMap(Player.level)) {
			LightingManager.anInt2875 = Player.level;
			ScriptRunner.method2218();
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZ[BII[Lclient!mj;)V")
	public static void method2437(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) CollisionMap[] arg4) {
		@Pc(10) Buffer local10 = new Buffer(arg2);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.gVarSmart();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(31) int local31 = local10.gsmarts();
				if (local31 == 0) {
					break;
				}
				local27 += local31 - 1;
				@Pc(46) int local46 = local27 & 0x3F;
				@Pc(50) int local50 = local27 >> 12;
				@Pc(56) int local56 = local27 >> 6 & 0x3F;
				@Pc(60) int local60 = local10.g1();
				@Pc(64) int local64 = local60 >> 2;
				@Pc(68) int local68 = local60 & 0x3;
				@Pc(72) int local72 = arg0 + local56;
				@Pc(76) int local76 = local46 + arg3;
				if (local72 > 0 && local76 > 0 && local72 < 103 && local76 < 103) {
					@Pc(90) CollisionMap local90 = null;
					if (!arg1) {
						@Pc(95) int local95 = local50;
						if ((tileFlags[1][local72][local76] & 0x2) == 2) {
							local95 = local50 - 1;
						}
						if (local95 >= 0) {
							local90 = arg4[local95];
						}
					}
					method3397(local50, !arg1, local50, arg1, local90, local12, local64, local72, local76, local68);
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
		Static160.anInt2886 = MathUtils.sin[arg3];
		Static121.anInt3038 = MathUtils.cos[arg3];
		Static231.anInt5205 = MathUtils.sin[arg4];
		Static81.anInt2222 = MathUtils.cos[arg4];
		Static123.anInt3555 = arg0;
		Static123.anInt3947 = arg1;
		Static217.anInt4903 = arg2;
		Static123.anInt4069 = arg0 / 128;
		Static193.anInt4539 = arg2 / 128;
		LightingManager.anInt987 = Static123.anInt4069 - visibility;
		if (LightingManager.anInt987 < 0) {
			LightingManager.anInt987 = 0;
		}
		LightingManager.anInt4698 = Static193.anInt4539 - visibility;
		if (LightingManager.anInt4698 < 0) {
			LightingManager.anInt4698 = 0;
		}
		LightingManager.anInt15 = Static123.anInt4069 + visibility;
		if (LightingManager.anInt15 > width) {
			LightingManager.anInt15 = width;
		}
		LightingManager.anInt4866 = Static193.anInt4539 + visibility;
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
				@Pc(130) int local130 = (local104 - visibility << 7) - (Static123.anInt3555 & 0x7F);
				@Pc(140) int local140 = (local113 - visibility << 7) - (Static217.anInt4903 & 0x7F);
				@Pc(146) int local146 = Static123.anInt4069 + local104 - visibility;
				@Pc(152) int local152 = Static193.anInt4539 + local113 - visibility;
				if (local146 >= 0 && local152 >= 0 && local146 < width && local152 < length) {
					@Pc(176) int local176;
					if (underwaterTileHeights == null) {
						local176 = surfaceTileHeights[0][local146][local152] + 128 - Static123.anInt3947;
					} else {
						local176 = underwaterTileHeights[0][local146][local152] + 128 - Static123.anInt3947;
					}
					@Pc(201) int local201 = surfaceTileHeights[3][local146][local152] - Static123.anInt3947 - 1000;
					aBooleanArrayArray3[local104][local113] = Static160.method3049(local130, local201, local176, local140, local99);
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
		Static8.anIntArray8 = arg6;
		Static123.anIntArray292 = arg7;
		Static96.anIntArray234 = arg8;
		Static123.anIntArray454 = arg9;
		Static123.anIntArray427 = arg10;
		Static123.method2419();
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
		Static156.anInt437++;
		Static156.anInt1142 = 0;
		@Pc(9) int local9 = arg6 - 16;
		@Pc(13) int local13 = arg6 + 16;
		@Pc(17) int local17 = arg7 - 16;
		@Pc(21) int local21 = arg7 + 16;
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(183) int local183;
		for (@Pc(23) int local23 = Static156.anInt5276; local23 < levels; local23++) {
			@Pc(30) Tile[][] local30 = tiles[local23];
			for (local32 = LightingManager.anInt987; local32 < LightingManager.anInt15; local32++) {
				for (local37 = LightingManager.anInt4698; local37 < LightingManager.anInt4866; local37++) {
					@Pc(46) Tile local46 = local30[local32][local37];
					if (local46 != null) {
						if (aBooleanArrayArray1[local32 + visibility - Static123.anInt4069][local37 + visibility - Static193.anInt4539] && (arg3 == null || local23 < arg4 || arg3[local23][local32][local37] != arg5)) {
							local46.aBoolean45 = true;
							local46.aBoolean46 = true;
							local46.aBoolean47 = local46.sceneryLen > 0;
							Static156.anInt1142++;
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
				Static152.anInt3604 = -1;
				Static247.anInt730 = -1;
				for (local32 = 0; local32 < underwaterHdTiles[0].length; local32++) {
					@Pc(285) GlTile local285 = underwaterHdTiles[0][local32];
					@Pc(294) float local294 = 251.5F - (local285.blend ? 1.0F : 0.5F);
					if (local285.underwaterColor != Static152.anInt3604) {
						Static152.anInt3604 = local285.underwaterColor;
						WaterMaterialRenderer.method619(local285.underwaterColor);
						FogManager.setFogColor(WaterMaterialRenderer.method2422());
					}
					local285.method1944(tiles, local294, false);
				}
				UnderwaterMaterialRenderer.method4608();
			} else {
				local32 = Static156.anInt5276;
				while (true) {
					if (local32 >= levels) {
						LightingManager.method2402(Static123.anInt4069, Static193.anInt4539, tiles);
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
						ShadowManager.method4198(Static123.anInt4069, Static193.anInt4539, visibility, arg1, aBooleanArrayArray1, tileHeights[0]);
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
		for (local399 = Static156.anInt5276; local399 < levels; local399++) {
			local406 = tiles[local399];
			for (local37 = -visibility; local37 <= 0; local37++) {
				local415 = Static123.anInt4069 + local37;
				local183 = Static123.anInt4069 - local37;
				if (local415 >= LightingManager.anInt987 || local183 < LightingManager.anInt15) {
					for (local428 = -visibility; local428 <= 0; local428++) {
						local434 = Static193.anInt4539 + local428;
						local438 = Static193.anInt4539 - local428;
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
						if (Static156.anInt1142 == 0) {
							if (!local240) {
								MiniMenu.aBoolean187 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (local399 = Static156.anInt5276; local399 < levels; local399++) {
			local406 = tiles[local399];
			for (local37 = -visibility; local37 <= 0; local37++) {
				local415 = Static123.anInt4069 + local37;
				local183 = Static123.anInt4069 - local37;
				if (local415 >= LightingManager.anInt987 || local183 < LightingManager.anInt15) {
					for (local428 = -visibility; local428 <= 0; local428++) {
						local434 = Static193.anInt4539 + local428;
						local438 = Static193.anInt4539 - local428;
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
						if (Static156.anInt1142 == 0) {
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
		Static156.anInt5276 = arg0;
		for (@Pc(3) int local3 = 0; local3 < width; local3++) {
			for (@Pc(8) int local8 = 0; local8 < length; local8++) {
				if (tiles[arg0][local3][local8] == null) {
					tiles[arg0][local3][local8] = new Tile(arg0, local3, local8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIILclient!th;JLclient!th;Lclient!th;)V")
	public static void method1543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Entity arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Entity arg6, @OriginalArg(7) Entity arg7) {
		@Pc(3) ObjStackEntity local3 = new ObjStackEntity();
		local3.aClass8_9 = arg4;
		local3.anInt3064 = arg1 * 128 + 64;
		local3.anInt3061 = arg2 * 128 + 64;
		local3.anInt3057 = arg3;
		local3.aLong108 = arg5;
		local3.aClass8_7 = arg6;
		local3.aClass8_8 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Tile local42 = tiles[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.sceneryLen; local46++) {
				@Pc(55) Scenery local55 = local42.scenery[local46];
				if ((local55.key & 0x400000L) == 4194304L) {
					@Pc(66) int local66 = local55.entity.getMinY();
					if (local66 != -32768 && local66 < local34) {
						local34 = local66;
					}
				}
			}
		}
		local3.anInt3063 = -local34;
		if (tiles[arg0][arg1][arg2] == null) {
			tiles[arg0][arg1][arg2] = new Tile(arg0, arg1, arg2);
		}
		tiles[arg0][arg1][arg2].aClass79_1 = local3;
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
	public static void method559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
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
							if (local151.anInt5899 == -1) {
								continue;
							}
							if (arg7[local114][local72] != 0) {
								local176 = Static1.anIntArrayArray35[arg7[local114][local72]];
								local28.anInt2016 += ((local176.length >> 1) - 2) * 3;
								local28.anInt2019 += local176.length >> 1;
								continue;
							}
						} else if (local133 != 0) {
							local151 = FloTypeList.method4395(local133 - 1);
							@Pc(224) byte local224;
							if (local151.anInt5899 == -1) {
								local224 = arg7[local114][local72];
								if (local224 != 0) {
									local234 = Static193.anIntArrayArray8[local224];
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
										local234 = Static1.anIntArrayArray35[0];
									} else if (local315) {
										local234 = Static1.anIntArrayArray35[1];
									} else if (local328) {
										local234 = Static1.anIntArrayArray35[1];
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
										local234 = Static1.anIntArrayArray35[0];
									} else if (local315) {
										local234 = Static1.anIntArrayArray35[1];
									} else if (local328) {
										local234 = Static1.anIntArrayArray35[1];
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
							local234 = Static193.anIntArrayArray8[arg7[local114][local72]];
							local176 = Static1.anIntArrayArray35[arg7[local114][local72]];
							local28.anInt2016 += ((local176.length >> 1) - 2) * 3;
							local28.anInt2016 += ((local234.length >> 1) - 2) * 3;
							local28.anInt2019 += local176.length >> 1;
							local28.anInt2019 += local234.length >> 1;
						} else {
							local176 = Static1.anIntArrayArray35[0];
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
							if (local805.anInt5899 == -1) {
								continue;
							}
							if (arg7[local114][local72] != 0) {
								Static131.method2578(arg0, arg9, local114, arg6, local72, Static1.anIntArrayArray35[arg7[local114][local72]], local28, local18, arg10, arg2[local114][local72]);
								continue;
							}
						} else if (local775 != 0) {
							local805 = FloTypeList.method4395(local775 - 1);
							if (local805.anInt5899 == -1) {
								Static131.method2578(arg0, arg9, local114, arg6, local72, Static193.anIntArrayArray8[arg7[local114][local72]], local28, local18, arg10, arg2[local114][local72]);
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
										local917 = Static1.anIntArrayArray35[0];
									} else if (local328) {
										local917 = Static1.anIntArrayArray35[1];
										local789 = 1;
									} else if (local947) {
										local917 = Static1.anIntArrayArray35[1];
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
										local917 = Static1.anIntArrayArray35[0];
									} else if (local328) {
										local789 = 0;
										local917 = Static1.anIntArrayArray35[1];
									} else if (local947) {
										local917 = Static1.anIntArrayArray35[1];
										local789 = 2;
									}
								}
								if (local917 != null) {
									Static131.method2578(arg0, arg9, local114, arg6, local72, local917, local28, local18, arg10, local789);
								}
								continue;
							}
						}
						if (local791) {
							Static131.method2578(arg0, arg9, local114, arg6, local72, Static193.anIntArrayArray8[arg7[local114][local72]], local28, local18, arg10, arg2[local114][local72]);
							Static131.method2578(arg0, arg9, local114, arg6, local72, Static1.anIntArrayArray35[arg7[local114][local72]], local28, local18, arg10, arg2[local114][local72]);
						} else {
							Static131.method2578(arg0, arg9, local114, arg6, local72, Static1.anIntArrayArray35[0], local28, local18, arg10, local789);
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
}
