import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
	public static int anInt917;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "Lclient!ve;")
	public static Js5 js5Archive25;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!na;")
	public static JagString parse(@OriginalArg(0) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(13) JagString local13 = new JagString();
		@Pc(15) int local15 = 0;
		local13.chars = new byte[local9];
		while (local9 > local15) {
			@Pc(29) int local29 = local6[local15++] & 0xFF;
			if (local29 <= 45 && local29 >= 40) {
				if (local15 >= local9) {
					break;
				}
				@Pc(51) int local51 = local6[local15++] & 0xFF;
				local13.chars[local13.length++] = (byte) (local51 + (local29 + -40) * 43 - 48);
			} else if (local29 != 0) {
				local13.chars[local13.length++] = (byte) local29;
			}
		}
		local13.method3156();
		return local13.method3151();
	}

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
