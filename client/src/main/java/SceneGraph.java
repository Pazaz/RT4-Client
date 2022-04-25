import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class SceneGraph {
    @OriginalMember(owner = "client!km", name = "f", descriptor = "(I)Z")
    public static boolean allLevelsAreVisible() {
        return GlRenderer.enabled || Preferences.allLevelsVisible;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIII)I")
    public static int getTileHeight(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
        if (Static83.activeTileHeightMap == null) {
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
        if (arg0 < 3 && (Static12.tileSettings[1][local12][local16] & 0x2) == 2) {
            local42 = arg0 + 1;
        }
        @Pc(91) int local91 = local36 * Static83.activeTileHeightMap[local42][local12 + 1][local16 + 1] + Static83.activeTileHeightMap[local42][local12][local16 + 1] * (128 - local36) >> 7;
        @Pc(118) int local118 = local36 * Static83.activeTileHeightMap[local42][local12 + 1][local16] + (128 - local36) * Static83.activeTileHeightMap[local42][local12][local16] >> 7;
        return local40 * local91 + (128 - local40) * local118 >> 7;
    }
}
