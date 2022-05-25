package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static28 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIZ)V")
	public static void method792(@OriginalArg(3) int tileVisibility, @OriginalArg(4) boolean hasUnderWaterMap) {
		SceneGraph.mapSizeX = 104;
		SceneGraph.mapSizeZ = 104;
		Static123.tileVisibilityDistance = tileVisibility;
		SceneGraph.surfaceGroundTiles = new Tile[4][SceneGraph.mapSizeX][SceneGraph.mapSizeZ];
		SceneGraph.surfaceTileHeights = new int[4][SceneGraph.mapSizeX + 1][SceneGraph.mapSizeZ + 1];
		if (GlRenderer.enabled) {
			SceneGraph.surfaceHdTiles = new GlTile[4][];
		}
		if (hasUnderWaterMap) {
			SceneGraph.underWaterGroundTiles = new Tile[1][SceneGraph.mapSizeX][SceneGraph.mapSizeZ];
			Static62.anIntArrayArray11 = new int[SceneGraph.mapSizeX][SceneGraph.mapSizeZ];
			SceneGraph.underwaterTileHeights = new int[1][SceneGraph.mapSizeX + 1][SceneGraph.mapSizeZ + 1];
			if (GlRenderer.enabled) {
				SceneGraph.underWaterHdTiles = new GlTile[1][];
			}
		} else {
			SceneGraph.underWaterGroundTiles = null;
			Static62.anIntArrayArray11 = null;
			SceneGraph.underwaterTileHeights = null;
			SceneGraph.underWaterHdTiles = null;
		}
		SceneGraph.setRenderTiles(false);
		SceneGraph.aClass120Array1 = new Class120[500];
		SceneGraph.anInt917 = 0;
		SceneGraph.aClass120Array2 = new Class120[500];
		SceneGraph.anInt4870 = 0;
		Static140.anIntArrayArrayArray12 = new int[4][SceneGraph.mapSizeX + 1][SceneGraph.mapSizeZ + 1];
		SceneGraph.aClass31Array3 = new Scenery[5000];
		SceneGraph.anInt726 = 0;
		SceneGraph.aClass31Array2 = new Scenery[100];
		Static48.aBooleanArrayArray1 = new boolean[Static123.tileVisibilityDistance + Static123.tileVisibilityDistance + 1][Static123.tileVisibilityDistance + Static123.tileVisibilityDistance + 1];
		Static89.aBooleanArrayArray3 = new boolean[Static123.tileVisibilityDistance + Static123.tileVisibilityDistance + 2][Static123.tileVisibilityDistance + Static123.tileVisibilityDistance + 2];
		SceneGraph.aByteArrayArrayArray13 = new byte[4][SceneGraph.mapSizeX][SceneGraph.mapSizeZ];
	}
}
