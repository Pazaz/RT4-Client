import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static28 {

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
	public static int anInt917;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIZ)V")
	public static void method792(@OriginalArg(3) int tileVisibility, @OriginalArg(4) boolean hasUnderWaterMap) {
		Static152.mapSizeX = 104;
		Static99.mapSizeZ = 104;
		Static277.tileVisibilityDistance = tileVisibility;
		Static197.surfaceGroundTiles = new Tile[4][Static152.mapSizeX][Static99.mapSizeZ];
		Static107.surfaceTileHeightMap = new int[4][Static152.mapSizeX + 1][Static99.mapSizeZ + 1];
		if (GlRenderer.enabled) {
			Static36.surfaceHdTiles = new GlTile[4][];
		}
		if (hasUnderWaterMap) {
			Static276.underWaterGroundTiles = new Tile[1][Static152.mapSizeX][Static99.mapSizeZ];
			Static62.anIntArrayArray11 = new int[Static152.mapSizeX][Static99.mapSizeZ];
			Static80.underWaterTileHeightMap = new int[1][Static152.mapSizeX + 1][Static99.mapSizeZ + 1];
			if (GlRenderer.enabled) {
				Static195.underWaterHdTiles = new GlTile[1][];
			}
		} else {
			Static276.underWaterGroundTiles = null;
			Static62.anIntArrayArray11 = null;
			Static80.underWaterTileHeightMap = null;
			Static195.underWaterHdTiles = null;
		}
		Static278.setRenderTiles(false);
		Static91.aClass120Array1 = new Class120[500];
		anInt917 = 0;
		Static247.aClass120Array2 = new Class120[500];
		Static215.anInt4870 = 0;
		Static140.anIntArrayArrayArray12 = new int[4][Static152.mapSizeX + 1][Static99.mapSizeZ + 1];
		Static243.aClass31Array3 = new Scenery[5000];
		Static22.anInt726 = 0;
		Static25.aClass31Array2 = new Scenery[100];
		Static48.aBooleanArrayArray1 = new boolean[Static277.tileVisibilityDistance + Static277.tileVisibilityDistance + 1][Static277.tileVisibilityDistance + Static277.tileVisibilityDistance + 1];
		Static89.aBooleanArrayArray3 = new boolean[Static277.tileVisibilityDistance + Static277.tileVisibilityDistance + 2][Static277.tileVisibilityDistance + Static277.tileVisibilityDistance + 2];
		Static232.aByteArrayArrayArray13 = new byte[4][Static152.mapSizeX][Static99.mapSizeZ];
	}
}
