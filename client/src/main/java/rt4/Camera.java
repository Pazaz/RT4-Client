package rt4;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Camera {
    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
	public static double pitchTarget = 128;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static double yawTarget = 0;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static double pitchAccel = 0;

    public static double mod(double a, double b) {
        return ((a % b) + b) % b;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(B)V")
    public static void clampCameraAngle() {
        if (pitchTarget < 128) {
            pitchTarget = 128;
        }
        if (pitchTarget > 383) {
            pitchTarget = 383;
        }
        yawTarget = mod(yawTarget, 2047.0d);
        @Pc(33) int local33 = Static81.cameraX >> 7;
        @Pc(37) int local37 = Static111.cameraZ >> 7;
        @Pc(43) int local43 = SceneGraph.getTileHeight(Player.level, Static81.cameraX, Static111.cameraZ);
        @Pc(45) int local45 = 0;
        @Pc(64) int local64;
        if (local33 > 3 && local37 > 3 && local33 < 100 && local37 < 100) {
            for (local64 = local33 - 4; local64 <= local33 + 4; local64++) {
                for (@Pc(73) int local73 = local37 - 4; local73 <= local37 + 4; local73++) {
                    @Pc(80) int local80 = Player.level;
                    if (local80 < 3 && (Static12.tileSettings[1][local64][local73] & 0x2) == 2) {
                        local80++;
                    }
                    @Pc(117) int local117 = (Static232.aByteArrayArrayArray13[local80][local64][local73] & 0xFF) * 8 + local43 - SceneGraph.activeTileHeightMap[local80][local64][local73];
                    if (local117 > local45) {
                        local45 = local117;
                    }
                }
            }
        }
        local64 = local45 * 192;
        if (local64 > 98048) {
            local64 = 98048;
        }
        if (local64 < 32768) {
            local64 = 32768;
        }
        if (Static234.anInt5245 < local64) {
            Static234.anInt5245 += (local64 - Static234.anInt5245) / 24;
        } else if (local64 < Static234.anInt5245) {
            Static234.anInt5245 += (local64 - Static234.anInt5245) / 80;
        }
    }
}
