import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
	public static int anInt1951 = -1;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "Lclient!na;")
	public static final JagString aClass100_435 = JagString.parse("<img=0>");

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!wa;I)Lclient!na;")
	public static JagString formatChatMessage(@OriginalArg(0) Buffer arg0) {
		return Static254.method4350(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)I")
	public static int method1498(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(36) int local36 = Static115.method2309(4, arg1 + 45365, arg0 - -91923) + (Static115.method2309(2, arg1 + 10294, arg0 + 37821) - 128 >> 1) + (Static115.method2309(1, arg1, arg0) + -128 >> 2) - 128;
		local36 = (int) ((double) local36 * 0.3D) + 35;
		if (local36 < 10) {
			local36 = 10;
		} else if (local36 > 60) {
			local36 = 60;
		}
		return local36;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "()V")
	public static void method1500() {
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

}
