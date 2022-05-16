package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Camera {
    @OriginalMember(owner = "client!id", name = "d", descriptor = "[[[I")
    public static final int[][][] anIntArrayArrayArray9 = new int[2][][];
    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "[I")
    public static final int[] cameraJitter = new int[5];
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
    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int cameraPitch;
    @OriginalMember(owner = "client!ol", name = "ib", descriptor = "I")
	public static int cameraYaw;
    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
	public static int cameraType;
    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int anInt2119 = 0;
    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public static int anInt1694 = -1;
    @OriginalMember(owner = "client!j", name = "K", descriptor = "I")
    public static int anInt5843 = 0;
    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
	public static int anInt5101 = 0;
    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    public static int anInt5224 = 0;
    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int anInt3125 = 0;
    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int anInt3718 = -1;
    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int originZ;
    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int originX;
    @OriginalMember(owner = "client!bc", name = "I", descriptor = "Z")
    public static boolean aBoolean16 = false;
    @OriginalMember(owner = "client!km", name = "Pc", descriptor = "I")
    public static int renderX;
    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int renderZ;

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
            renderX = Static245.anInt5375 * 128 + 64;
            renderZ = Static248.anInt4232 * 128 + 64;
            Static5.anInt40 = SceneGraph.getTileHeight(Player.level, renderX, renderZ) - Static231.anInt5203;
        } else {
            if (renderX < local15) {
                renderX += Static233.anInt5225 + Static113.anInt4612 * (local15 - renderX) / 1000;
                if (renderX > local15) {
                    renderX = local15;
                }
            }
            if (Static5.anInt40 < local23) {
                Static5.anInt40 += (local23 - Static5.anInt40) * Static113.anInt4612 / 1000 + Static233.anInt5225;
                if (Static5.anInt40 > local23) {
                    Static5.anInt40 = local23;
                }
            }
            if (renderX > local15) {
                renderX -= Static233.anInt5225 + (renderX - local15) * Static113.anInt4612 / 1000;
                if (renderX < local15) {
                    renderX = local15;
                }
            }
            if (renderZ < local9) {
                renderZ += Static233.anInt5225 + Static113.anInt4612 * (local9 - renderZ) / 1000;
                if (local9 < renderZ) {
                    renderZ = local9;
                }
            }
            if (local23 < Static5.anInt40) {
                Static5.anInt40 -= (Static5.anInt40 - local23) * Static113.anInt4612 / 1000 + Static233.anInt5225;
                if (local23 > Static5.anInt40) {
                    Static5.anInt40 = local23;
                }
            }
            if (renderZ > local9) {
                renderZ -= Static233.anInt5225 + (renderZ - local9) * Static113.anInt4612 / 1000;
                if (local9 > renderZ) {
                    renderZ = local9;
                }
            }
        }
        local9 = Static265.anInt5765 * 128 + 64;
        local15 = Static251.anInt5449 * 128 + 64;
        local23 = SceneGraph.getTileHeight(Player.level, local15, local9) - Static260.anInt1744;
        @Pc(236) int local236 = local23 - Static5.anInt40;
        @Pc(241) int local241 = local9 - renderZ;
        @Pc(246) int local246 = local15 - renderX;
        @Pc(257) int local257 = (int) Math.sqrt((double) (local246 * local246 + local241 * local241));
        @Pc(268) int local268 = (int) (Math.atan2((double) local236, (double) local257) * 325.949D) & 0x7FF;
        if (local268 < 128) {
            local268 = 128;
        }
        if (local268 > 383) {
            local268 = 383;
        }
        @Pc(292) int local292 = (int) (-325.949D * Math.atan2((double) local246, (double) local241)) & 0x7FF;
        if (cameraPitch < local268) {
            cameraPitch += Static133.anInt5230 + Static233.anInt5217 * (local268 - cameraPitch) / 1000;
            if (cameraPitch > local268) {
                cameraPitch = local268;
            }
        }
        if (cameraPitch > local268) {
            cameraPitch -= (cameraPitch - local268) * Static233.anInt5217 / 1000 + Static133.anInt5230;
            if (cameraPitch < local268) {
                cameraPitch = local268;
            }
        }
        @Pc(350) int local350 = local292 - cameraYaw;
        if (local350 > 1024) {
            local350 -= 2048;
        }
        if (local350 < -1024) {
            local350 += 2048;
        }
        if (local350 > 0) {
            cameraYaw += local350 * Static233.anInt5217 / 1000 + Static133.anInt5230;
            cameraYaw &= 0x7FF;
        }
        if (local350 < 0) {
            cameraYaw -= Static233.anInt5217 * -local350 / 1000 + Static133.anInt5230;
            cameraYaw &= 0x7FF;
        }
        @Pc(404) int local404 = local292 - cameraYaw;
        if (local404 > 1024) {
            local404 -= 2048;
        }
        if (local404 < -1024) {
            local404 += 2048;
        }
        if (local404 < 0 && local350 > 0 || local404 > 0 && local350 < 0) {
            cameraYaw = local292;
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
    public static void updateLoginScreenCamera() {
        if (anInt3718 == -1 || anInt1694 == -1) {
            return;
        }
        @Pc(27) int local27 = (anInt5224 * (anInt5843 - anInt5101) >> 16) + anInt5101;
        @Pc(30) float[] renderCoordinates = new float[3];
        anInt5224 += local27;
        if (anInt5224 >= 65535) {
            anInt5224 = 65535;
            if (Static186.aBoolean205) {
                aBoolean16 = false;
            } else {
                aBoolean16 = true;
            }
            Static186.aBoolean205 = true;
        } else {
            Static186.aBoolean205 = false;
            aBoolean16 = false;
        }
        @Pc(66) float local66 = (float) anInt5224 / 65535.0F;
        @Pc(70) int local70 = anInt3125 * 2;
        @Pc(141) int local141;
        @Pc(131) int local131;
        @Pc(111) int local111;
        @Pc(119) int local119;
        @Pc(146) int local146;
        @Pc(155) int local155;
        @Pc(173) int local173;
        for (@Pc(72) int local72 = 0; local72 < 3; local72++) {
            local111 = (anIntArrayArrayArray9[anInt3718][local70 + 2][local72] + anIntArrayArrayArray9[anInt3718][local70 + 2][local72] - anIntArrayArrayArray9[anInt3718][local70 + 3][local72]) * 3;
            local119 = anIntArrayArrayArray9[anInt3718][local70][local72];
            local131 = anIntArrayArrayArray9[anInt3718][local70 + 1][local72] * 3;
            local141 = anIntArrayArrayArray9[anInt3718][local70][local72] * 3;
            local146 = local131 - local141;
            local155 = local111 + local141 - local131 * 2;
            local173 = anIntArrayArrayArray9[anInt3718][local70 + 2][local72] + local131 - local119 - local111;
            renderCoordinates[local72] = (float) local119 + (((float) local173 * local66 + (float) local155) * local66 + (float) local146) * local66;
        }
        Static5.anInt40 = (int) renderCoordinates[1] * -1;
        renderX = (int) renderCoordinates[0] - originX * 128;
        renderZ = (int) renderCoordinates[2] - originZ * 128;
        @Pc(226) float[] local226 = new float[3];
        local141 = anInt2119 * 2;
        for (local131 = 0; local131 < 3; local131++) {
            local111 = anIntArrayArrayArray9[anInt1694][local141][local131] * 3;
            local146 = (anIntArrayArrayArray9[anInt1694][local141 + 2][local131] + anIntArrayArrayArray9[anInt1694][local141 + 2][local131] - anIntArrayArrayArray9[anInt1694][local141 + 3][local131]) * 3;
            local155 = anIntArrayArrayArray9[anInt1694][local141][local131];
            local119 = anIntArrayArrayArray9[anInt1694][local141 + 1][local131] * 3;
            local173 = local119 - local111;
            @Pc(313) int local313 = local146 + local111 - local119 * 2;
            @Pc(331) int local331 = anIntArrayArrayArray9[anInt1694][local141 + 2][local131] + local119 - local146 - local155;
            local226[local131] = (float) local155 + local66 * (local66 * (local66 * (float) local331 + (float) local313) + (float) local173);
        }
        @Pc(363) float local363 = local226[0] - renderCoordinates[0];
        @Pc(371) float local371 = local226[2] - renderCoordinates[2];
        @Pc(382) float local382 = (local226[1] - renderCoordinates[1]) * -1.0F;
        @Pc(392) double local392 = Math.sqrt((double) (local371 * local371 + local363 * local363));
        Static146.aFloat15 = (float) Math.atan2((double) local382, local392);
        Static84.aFloat10 = -((float) Math.atan2((double) local363, (double) local371));
        cameraPitch = (int) ((double) Static146.aFloat15 * 325.949D) & 0x7FF;
        cameraYaw = (int) ((double) Static84.aFloat10 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIBI)V")
	public static void method3849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static133.anInt5230 = arg2;
		Static265.anInt5765 = arg1;
		Static233.anInt5217 = arg4;
		Static251.anInt5449 = arg3;
		Static260.anInt1744 = arg0;
		if (Static233.anInt5217 >= 100) {
			@Pc(30) int local30 = Static251.anInt5449 * 128 + 64;
			@Pc(36) int local36 = Static265.anInt5765 * 128 + 64;
			@Pc(44) int local44 = SceneGraph.getTileHeight(Player.level, local30, local36) - Static260.anInt1744;
			@Pc(49) int local49 = local44 - Static5.anInt40;
			@Pc(54) int local54 = local30 - renderX;
			@Pc(59) int local59 = local36 - renderZ;
			@Pc(70) int local70 = (int) Math.sqrt((double) (local59 * local59 + local54 * local54));
			cameraPitch = (int) (Math.atan2((double) local49, (double) local70) * 325.949D) & 0x7FF;
			cameraYaw = (int) (Math.atan2((double) local54, (double) local59) * -325.949D) & 0x7FF;
			if (cameraPitch < 128) {
				cameraPitch = 128;
			}
			if (cameraPitch > 383) {
				cameraPitch = 383;
			}
		}
		cameraType = 2;
	}

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIIBII)V")
    public static void method2722(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
        Static113.anInt4612 = arg3;
        Static231.anInt5203 = arg2;
        Static245.anInt5375 = arg5;
        Static233.anInt5225 = arg1;
        Static248.anInt4232 = arg4;
        if (arg0 && Static113.anInt4612 >= 100) {
            renderX = Static245.anInt5375 * 128 + 64;
            renderZ = Static248.anInt4232 * 128 + 64;
            Static5.anInt40 = SceneGraph.getTileHeight(Player.level, renderX, renderZ) - Static231.anInt5203;
        }
        cameraType = 2;
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V")
    public static void resetCameraEffects() {
        for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
            Static176.customCameraActive[local3] = false;
        }
        Static133.anInt5230 = 0;
        Static233.anInt5217 = 0;
        anInt3718 = -1;
        anInt1694 = -1;
        cameraType = 1;
    }
}
