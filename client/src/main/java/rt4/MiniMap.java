package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class MiniMap {
    @OriginalMember(owner = "client!ke", name = "T", descriptor = "[[I")
	public static final int[][] anIntArrayArray24 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
    @OriginalMember(owner = "client!wc", name = "h", descriptor = "[[I")
    public static final int[][] anIntArrayArray46 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };
    @OriginalMember(owner = "client!qc", name = "ab", descriptor = "[I")
    public static final int[] locId = new int[1000];
    @OriginalMember(owner = "client!lf", name = "d", descriptor = "[I")
    public static final int[] locX = new int[1000];
    @OriginalMember(owner = "client!he", name = "eb", descriptor = "[I")
    public static final int[] locZ = new int[1000];
    @OriginalMember(owner = "client!ef", name = "j", descriptor = "Lclient!mm;")
    public static SoftwareSprite softwareSprite;
    @OriginalMember(owner = "client!ha", name = "i", descriptor = "Lclient!qf;")
    public static Sprite sprite;
    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int locs = 0;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([IIIIII)V")
    public static void renderTile(@OriginalArg(0) int[] pixels, @OriginalArg(1) int index, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
        @Pc(7) Tile local7 = SceneGraph.tiles[arg2][arg3][arg4];
        if (local7 == null) {
            return;
        }
        @Pc(13) PlainTile local13 = local7.plainTile;
        @Pc(23) int local23;
        if (local13 != null) {
            @Pc(18) int local18 = local13.anInt4871;
            if (local18 != 0) {
                for (local23 = 0; local23 < 4; local23++) {
                    pixels[index] = local18;
                    pixels[index + 1] = local18;
                    pixels[index + 2] = local18;
                    pixels[index + 3] = local18;
                    index += 512;
                }
            }
            return;
        }
        @Pc(58) ShapedTile local58 = local7.shapedTile;
        if (local58 == null) {
            return;
        }
        local23 = local58.anInt1966;
        @Pc(67) int local67 = local58.anInt1967;
        @Pc(70) int local70 = local58.anInt1969;
        @Pc(73) int local73 = local58.anInt1968;
        @Pc(77) int[] local77 = anIntArrayArray24[local23];
        @Pc(81) int[] local81 = anIntArrayArray46[local67];
        @Pc(83) int local83 = 0;
        @Pc(87) int local87;
        if (local70 != 0) {
            for (local87 = 0; local87 < 4; local87++) {
                pixels[index] = local77[local81[local83++]] == 0 ? local70 : local73;
                pixels[index + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
                pixels[index + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
                pixels[index + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
                index += 512;
            }
            return;
        }
        for (local87 = 0; local87 < 4; local87++) {
            if (local77[local81[local83++]] != 0) {
                pixels[index] = local73;
            }
            if (local77[local81[local83++]] != 0) {
                pixels[index + 1] = local73;
            }
            if (local77[local81[local83++]] != 0) {
                pixels[index + 2] = local73;
            }
            if (local77[local81[local83++]] != 0) {
                pixels[index + 3] = local73;
            }
            index += 512;
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)Z")
    public static boolean renderMap(@OriginalArg(1) int arg0) {
        @Pc(35) int local35;
        @Pc(37) int local37;
        @Pc(76) int local76;
        @Pc(80) int local80;
        if (softwareSprite == null) {
            if (GlRenderer.enabled || sprite == null) {
                softwareSprite = new SoftwareSprite(512, 512);
            } else {
                softwareSprite = (SoftwareSprite) sprite;
            }
            @Pc(32) int[] local32 = softwareSprite.pixels;
            local35 = local32.length;
            for (local37 = 0; local37 < local35; local37++) {
                local32[local37] = 1;
            }
            for (local37 = 1; local37 < 103; local37++) {
                local76 = 4 * 512 * (103 - local37) + 24628;
                for (local80 = 1; local80 < 103; local80++) {
                    if ((Static12.tileSettings[arg0][local80][local37] & 0x18) == 0) {
                        renderTile(local32, local76, arg0, local80, local37);
                    }
                    if (arg0 < 3 && (Static12.tileSettings[arg0 + 1][local80][local37] & 0x8) != 0) {
                        renderTile(local32, local76, arg0 + 1, local80, local37);
                    }
                    local76 += 4;
                }
            }
            locs = 0;
            for (local37 = 0; local37 < 104; local37++) {
                for (local76 = 0; local76 < 104; local76++) {
                    @Pc(169) long local169 = Static20.method602(Player.level, local37 + 0, local76);
                    if (local169 != 0L) {
                        @Pc(184) LocType local184 = LocTypeList.get((int) (local169 >>> 32) & Integer.MAX_VALUE);
                        @Pc(187) int local187 = local184.mapElement;
                        @Pc(194) int local194;
                        if (local184.multiLocs != null) {
                            for (local194 = 0; local194 < local184.multiLocs.length; local194++) {
                                if (local184.multiLocs[local194] != -1) {
                                    @Pc(216) LocType local216 = LocTypeList.get(local184.multiLocs[local194]);
                                    if (local216.mapElement >= 0) {
                                        local187 = local216.mapElement;
                                        break;
                                    }
                                }
                            }
                        }
                        if (local187 >= 0) {
                            @Pc(237) int local237 = local76;
                            local194 = local37;
                            if (local187 != 22 && local187 != 29 && local187 != 34 && local187 != 36 && local187 != 46 && local187 != 47 && local187 != 48) {
                                @Pc(269) int[][] local269 = PathFinder.collisionMaps[Player.level].anIntArrayArray30;
                                for (@Pc(271) int local271 = 0; local271 < 10; local271++) {
                                    @Pc(281) int local281 = (int) (Math.random() * 4.0D);
                                    if (local281 == 0 && local194 > 0 && local37 - 3 < local194 && (local269[local194 - 1][local237] & 0x12C0108) == 0) {
                                        local194--;
                                    }
                                    if (local281 == 1 && local194 < 103 && local37 + 3 > local194 && (local269[local194 + 1][local237] & 0x12C0180) == 0) {
                                        local194++;
                                    }
                                    if (local281 == 2 && local237 > 0 && local76 - 3 < local237 && (local269[local194][local237 - 1] & 0x12C0102) == 0) {
                                        local237--;
                                    }
                                    if (local281 == 3 && local237 < 103 && local237 < local76 + 3 && (local269[local194][local237 + 1] & 0x12C0120) == 0) {
                                        local237++;
                                    }
                                }
                            }
                            locId[locs] = local184.id;
                            locX[locs] = local194;
                            locZ[locs] = local237;
                            locs++;
                        }
                    }
                }
            }
        }
        softwareSprite.makeTarget();
        @Pc(455) int local455 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 228;
        local35 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (local37 = 1; local37 < 103; local37++) {
            for (local76 = 1; local76 < 103; local76++) {
                if ((Static12.tileSettings[arg0][local76][local37] & 0x18) == 0 && !Static164.method3109(local76, local455, local37, local35, arg0)) {
                    if (GlRenderer.enabled) {
                        SoftwareRaster.pixels = null;
                    } else {
                        SoftwareRaster.frameBuffer.makeTarget();
                    }
                    return false;
                }
                if (arg0 < 3 && (Static12.tileSettings[arg0 + 1][local76][local37] & 0x8) != 0 && !Static164.method3109(local76, local455, local37, local35, arg0 + 1)) {
                    if (GlRenderer.enabled) {
                        SoftwareRaster.pixels = null;
                    } else {
                        SoftwareRaster.frameBuffer.makeTarget();
                    }
                    return false;
                }
            }
        }
        if (GlRenderer.enabled) {
            @Pc(576) int[] local576 = softwareSprite.pixels;
            local76 = local576.length;
            for (local80 = 0; local80 < local76; local80++) {
                if (local576[local80] == 0) {
                    local576[local80] = 1;
                }
            }
            sprite = new GlSprite(softwareSprite);
        } else {
            sprite = softwareSprite;
        }
        if (GlRenderer.enabled) {
            SoftwareRaster.pixels = null;
        } else {
            SoftwareRaster.frameBuffer.makeTarget();
        }
        softwareSprite = null;
        return true;
    }
}
