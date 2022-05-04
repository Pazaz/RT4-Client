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

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int cameraZ;
    @OriginalMember(owner = "client!gg", name = "bb", descriptor = "I")
    public static int cameraX;

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
        @Pc(33) int local33 = cameraX >> 7;
        @Pc(37) int local37 = cameraZ >> 7;
        @Pc(43) int local43 = SceneGraph.getTileHeight(Player.level, cameraX, cameraZ);
        @Pc(45) int local45 = 0;
        @Pc(64) int local64;
        if (local33 > 3 && local37 > 3 && local33 < 100 && local37 < 100) {
            for (local64 = local33 - 4; local64 <= local33 + 4; local64++) {
                for (@Pc(73) int local73 = local37 - 4; local73 <= local37 + 4; local73++) {
                    @Pc(80) int local80 = Player.level;
                    if (local80 < 3 && (SceneGraph.tileFlags[1][local64][local73] & 0x2) == 2) {
                        local80++;
                    }
                    @Pc(117) int local117 = (Static232.aByteArrayArrayArray13[local80][local64][local73] & 0xFF) * 8 + local43 - SceneGraph.tileHeights[local80][local64][local73];
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

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V")
    public static void updateLockedCamera() {
        @Pc(9) int local9 = Static248.anInt4232 * 128 + 64;
        @Pc(15) int local15 = Static245.anInt5375 * 128 + 64;
        @Pc(23) int local23 = SceneGraph.getTileHeight(Player.level, local15, local9) - Static231.anInt5203;
        if (Static113.anInt4612 >= 100) {
            Static138.renderX = Static245.anInt5375 * 128 + 64;
            Static134.renderZ = Static248.anInt4232 * 128 + 64;
            Static5.anInt40 = SceneGraph.getTileHeight(Player.level, Static138.renderX, Static134.renderZ) - Static231.anInt5203;
        } else {
            if (Static138.renderX < local15) {
                Static138.renderX += Static233.anInt5225 + Static113.anInt4612 * (local15 - Static138.renderX) / 1000;
                if (Static138.renderX > local15) {
                    Static138.renderX = local15;
                }
            }
            if (Static5.anInt40 < local23) {
                Static5.anInt40 += (local23 - Static5.anInt40) * Static113.anInt4612 / 1000 + Static233.anInt5225;
                if (Static5.anInt40 > local23) {
                    Static5.anInt40 = local23;
                }
            }
            if (Static138.renderX > local15) {
                Static138.renderX -= Static233.anInt5225 + (Static138.renderX - local15) * Static113.anInt4612 / 1000;
                if (Static138.renderX < local15) {
                    Static138.renderX = local15;
                }
            }
            if (Static134.renderZ < local9) {
                Static134.renderZ += Static233.anInt5225 + Static113.anInt4612 * (local9 - Static134.renderZ) / 1000;
                if (local9 < Static134.renderZ) {
                    Static134.renderZ = local9;
                }
            }
            if (local23 < Static5.anInt40) {
                Static5.anInt40 -= (Static5.anInt40 - local23) * Static113.anInt4612 / 1000 + Static233.anInt5225;
                if (local23 > Static5.anInt40) {
                    Static5.anInt40 = local23;
                }
            }
            if (Static134.renderZ > local9) {
                Static134.renderZ -= Static233.anInt5225 + (Static134.renderZ - local9) * Static113.anInt4612 / 1000;
                if (local9 > Static134.renderZ) {
                    Static134.renderZ = local9;
                }
            }
        }
        local9 = Static265.anInt5765 * 128 + 64;
        local15 = Static251.anInt5449 * 128 + 64;
        local23 = SceneGraph.getTileHeight(Player.level, local15, local9) - Static260.anInt1744;
        @Pc(236) int local236 = local23 - Static5.anInt40;
        @Pc(241) int local241 = local9 - Static134.renderZ;
        @Pc(246) int local246 = local15 - Static138.renderX;
        @Pc(257) int local257 = (int) Math.sqrt((double) (local246 * local246 + local241 * local241));
        @Pc(268) int local268 = (int) (Math.atan2((double) local236, (double) local257) * 325.949D) & 0x7FF;
        if (local268 < 128) {
            local268 = 128;
        }
        if (local268 > 383) {
            local268 = 383;
        }
        @Pc(292) int local292 = (int) (-325.949D * Math.atan2((double) local246, (double) local241)) & 0x7FF;
        if (Static240.cameraPitch < local268) {
            Static240.cameraPitch += Static133.anInt5230 + Static233.anInt5217 * (local268 - Static240.cameraPitch) / 1000;
            if (Static240.cameraPitch > local268) {
                Static240.cameraPitch = local268;
            }
        }
        if (Static240.cameraPitch > local268) {
            Static240.cameraPitch -= (Static240.cameraPitch - local268) * Static233.anInt5217 / 1000 + Static133.anInt5230;
            if (Static240.cameraPitch < local268) {
                Static240.cameraPitch = local268;
            }
        }
        @Pc(350) int local350 = local292 - Static184.cameraYaw;
        if (local350 > 1024) {
            local350 -= 2048;
        }
        if (local350 < -1024) {
            local350 += 2048;
        }
        if (local350 > 0) {
            Static184.cameraYaw += local350 * Static233.anInt5217 / 1000 + Static133.anInt5230;
            Static184.cameraYaw &= 0x7FF;
        }
        if (local350 < 0) {
            Static184.cameraYaw -= Static233.anInt5217 * -local350 / 1000 + Static133.anInt5230;
            Static184.cameraYaw &= 0x7FF;
        }
        @Pc(404) int local404 = local292 - Static184.cameraYaw;
        if (local404 > 1024) {
            local404 -= 2048;
        }
        if (local404 < -1024) {
            local404 += 2048;
        }
        if (local404 < 0 && local350 > 0 || local404 > 0 && local350 < 0) {
            Static184.cameraYaw = local292;
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
    public static void updateLoginScreenCamera() {
        if (Static155.anInt3718 == -1 || Static52.anInt1694 == -1) {
            return;
        }
        @Pc(27) int local27 = (Static233.anInt5224 * (Static114.anInt5843 - Static228.anInt5101) >> 16) + Static228.anInt5101;
        @Pc(30) float[] renderCoordinates = new float[3];
        Static233.anInt5224 += local27;
        if (Static233.anInt5224 >= 65535) {
            Static233.anInt5224 = 65535;
            if (Static186.aBoolean205) {
                Static13.aBoolean16 = false;
            } else {
                Static13.aBoolean16 = true;
            }
            Static186.aBoolean205 = true;
        } else {
            Static186.aBoolean205 = false;
            Static13.aBoolean16 = false;
        }
        @Pc(66) float local66 = (float) Static233.anInt5224 / 65535.0F;
        @Pc(70) int local70 = Static127.anInt3125 * 2;
        @Pc(141) int local141;
        @Pc(131) int local131;
        @Pc(111) int local111;
        @Pc(119) int local119;
        @Pc(146) int local146;
        @Pc(155) int local155;
        @Pc(173) int local173;
        for (@Pc(72) int local72 = 0; local72 < 3; local72++) {
            local111 = (Static107.anIntArrayArrayArray9[Static155.anInt3718][local70 + 2][local72] + Static107.anIntArrayArrayArray9[Static155.anInt3718][local70 + 2][local72] - Static107.anIntArrayArrayArray9[Static155.anInt3718][local70 + 3][local72]) * 3;
            local119 = Static107.anIntArrayArrayArray9[Static155.anInt3718][local70][local72];
            local131 = Static107.anIntArrayArrayArray9[Static155.anInt3718][local70 + 1][local72] * 3;
            local141 = Static107.anIntArrayArrayArray9[Static155.anInt3718][local70][local72] * 3;
            local146 = local131 - local141;
            local155 = local111 + local141 - local131 * 2;
            local173 = Static107.anIntArrayArrayArray9[Static155.anInt3718][local70 + 2][local72] + local131 - local119 - local111;
            renderCoordinates[local72] = (float) local119 + (((float) local173 * local66 + (float) local155) * local66 + (float) local146) * local66;
        }
        Static5.anInt40 = (int) renderCoordinates[1] * -1;
        Static138.renderX = (int) renderCoordinates[0] - Static225.originX * 128;
        Static134.renderZ = (int) renderCoordinates[2] - Static142.originZ * 128;
        @Pc(226) float[] local226 = new float[3];
        local141 = Static75.anInt2119 * 2;
        for (local131 = 0; local131 < 3; local131++) {
            local111 = Static107.anIntArrayArrayArray9[Static52.anInt1694][local141][local131] * 3;
            local146 = (Static107.anIntArrayArrayArray9[Static52.anInt1694][local141 + 2][local131] + Static107.anIntArrayArrayArray9[Static52.anInt1694][local141 + 2][local131] - Static107.anIntArrayArrayArray9[Static52.anInt1694][local141 + 3][local131]) * 3;
            local155 = Static107.anIntArrayArrayArray9[Static52.anInt1694][local141][local131];
            local119 = Static107.anIntArrayArrayArray9[Static52.anInt1694][local141 + 1][local131] * 3;
            local173 = local119 - local111;
            @Pc(313) int local313 = local146 + local111 - local119 * 2;
            @Pc(331) int local331 = Static107.anIntArrayArrayArray9[Static52.anInt1694][local141 + 2][local131] + local119 - local146 - local155;
            local226[local131] = (float) local155 + local66 * (local66 * (local66 * (float) local331 + (float) local313) + (float) local173);
        }
        @Pc(363) float local363 = local226[0] - renderCoordinates[0];
        @Pc(371) float local371 = local226[2] - renderCoordinates[2];
        @Pc(382) float local382 = (local226[1] - renderCoordinates[1]) * -1.0F;
        @Pc(392) double local392 = Math.sqrt((double) (local371 * local371 + local363 * local363));
        Static146.aFloat15 = (float) Math.atan2((double) local382, local392);
        Static84.aFloat10 = -((float) Math.atan2((double) local363, (double) local371));
        Static240.cameraPitch = (int) ((double) Static146.aFloat15 * 325.949D) & 0x7FF;
        Static184.cameraYaw = (int) ((double) Static84.aFloat10 * 325.949D) & 0x7FF;
    }
}
