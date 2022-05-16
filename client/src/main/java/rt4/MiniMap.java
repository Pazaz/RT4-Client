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
    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int state = 0;
    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public static int anInt4130 = 0;

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
                    if ((SceneGraph.tileFlags[arg0][local80][local37] & 0x18) == 0) {
                        renderTile(local32, local76, arg0, local80, local37);
                    }
                    if (arg0 < 3 && (SceneGraph.tileFlags[arg0 + 1][local80][local37] & 0x8) != 0) {
                        renderTile(local32, local76, arg0 + 1, local80, local37);
                    }
                    local76 += 4;
                }
            }
            locs = 0;
            for (local37 = 0; local37 < 104; local37++) {
                for (local76 = 0; local76 < 104; local76++) {
                    @Pc(169) long local169 = SceneGraph.method602(Player.level, local37 + 0, local76);
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
                                @Pc(269) int[][] local269 = PathFinder.collisionMaps[Player.level].flags;
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
                if ((SceneGraph.tileFlags[arg0][local76][local37] & 0x18) == 0 && !Static164.method3109(local76, local455, local37, local35, arg0)) {
                    if (GlRenderer.enabled) {
                        SoftwareRaster.pixels = null;
                    } else {
                        SoftwareRaster.frameBuffer.makeTarget();
                    }
                    return false;
                }
                if (arg0 < 3 && (SceneGraph.tileFlags[arg0 + 1][local76][local37] & 0x8) != 0 && !Static164.method3109(local76, local455, local37, local35, arg0 + 1)) {
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

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBIILclient!be;)V")
    public static void render(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3) {
        client.audioLoop();
        if (GlRenderer.enabled) {
            GlRaster.setClip(arg2, arg1, arg2 + arg3.width, arg1 + arg3.height);
        } else {
            SoftwareRaster.setClip(arg2, arg1, arg2 + arg3.width, arg1 + arg3.height);
        }
        if (state != 2 && state != 5 && sprite != null) {
            @Pc(48) int local48 = Static59.anInt1814 + (int)Camera.yawTarget & 0x7FF;
            @Pc(57) int local57 = PlayerList.self.xFine / 32 + 48;
            @Pc(67) int local67 = 464 - PlayerList.self.zFine / 32;
            if (GlRenderer.enabled) {
                ((GlSprite) sprite).renderRotatedTransparent(arg2, arg1, arg3.width, arg3.height, local57, local67, local48, anInt4130 + 256, (GlSprite) arg3.method489(false));
            } else {
                ((SoftwareSprite) sprite).renderRotated(arg2, arg1, arg3.width, arg3.height, local57, local67, local48, anInt4130 + 256, arg3.anIntArray37, arg3.anIntArray45);
            }
            @Pc(146) int local146;
            @Pc(181) int local181;
            @Pc(150) int local150;
            @Pc(154) int local154;
            @Pc(231) int local231;
            @Pc(200) int local200;
            @Pc(239) int local239;
            @Pc(271) int local271;
            if (Static235.mapElementList != null) {
                for (@Pc(117) int local117 = 0; local117 < Static235.mapElementList.anInt5074; local117++) {
                    if (Static235.mapElementList.method3892(local117)) {
                        local146 = (Static235.mapElementList.aShortArray73[local117] - Camera.originX) * 4 + 2 - PlayerList.self.xFine / 32;
                        local150 = MathUtils.sin[local48];
                        local154 = MathUtils.cos[local48];
                        @Pc(156) Font local156 = Fonts.p11Full;
                        @Pc(164) int local164 = local150 * 256 / (anInt4130 + 256);
                        local181 = (Static235.mapElementList.aShortArray72[local117] - Camera.originZ) * 4 + 2 - PlayerList.self.zFine / 32;
                        @Pc(189) int local189 = local154 * 256 / (anInt4130 + 256);
                        local200 = local181 * local189 - local146 * local164 >> 16;
                        if (Static235.mapElementList.method3894(local117) == 1) {
                            local156 = Fonts.p12Full;
                        }
                        if (Static235.mapElementList.method3894(local117) == 2) {
                            local156 = Fonts.b12Full;
                        }
                        local231 = local164 * local181 + local189 * local146 >> 16;
                        local239 = local156.getMaxLineWidth(Static235.mapElementList.aClass100Array153[local117], 100);
                        @Pc(245) int local245 = local231 - local239 / 2;
                        if (local245 >= -arg3.width && local245 <= arg3.width && local200 >= -arg3.height && local200 <= arg3.height) {
                            local271 = 16777215;
                            if (Static235.mapElementList.anIntArray444[local117] != -1) {
                                local271 = Static235.mapElementList.anIntArray444[local117];
                            }
                            if (GlRenderer.enabled) {
                                GlFont.method1188((GlSprite) arg3.method489(false));
                            } else {
                                SoftwareRaster.method2486(arg3.anIntArray37, arg3.anIntArray45);
                            }
                            local156.renderParagraphAlpha(Static235.mapElementList.aClass100Array153[local117], arg2 + local245 + arg3.width / 2, arg1 + arg3.height / 2 + -local200, local239, 50, local271, 0, 1, 0, 0);
                            if (GlRenderer.enabled) {
                                GlFont.method1173();
                            } else {
                                SoftwareRaster.method2482();
                            }
                        }
                    }
                }
            }
            for (local146 = 0; local146 < locs; local146++) {
                local181 = locX[local146] * 4 + 2 - PlayerList.self.xFine / 32;
                local150 = locZ[local146] * 4 + 2 - PlayerList.self.zFine / 32;
                @Pc(382) LocType local382 = LocTypeList.get(locId[local146]);
                if (local382.multiLocs != null) {
                    local382 = local382.getMultiLoc();
                    if (local382 == null || local382.mapElement == -1) {
                        continue;
                    }
                }
                method1446(arg3, Static67.mapfuncs[local382.mapElement], local150, local181, arg1, arg2);
            }
            for (local146 = 0; local146 < 104; local146++) {
                for (local181 = 0; local181 < 104; local181++) {
                    @Pc(439) LinkedList local439 = SceneGraph.objStacks[Player.level][local146][local181];
                    if (local439 != null) {
                        local154 = local146 * 4 + 2 - PlayerList.self.xFine / 32;
                        local231 = local181 * 4 + 2 - PlayerList.self.zFine / 32;
                        method1446(arg3, Sprites.mapdots[0], local231, local154, arg1, arg2);
                    }
                }
            }
            for (local146 = 0; local146 < NpcList.size; local146++) {
                @Pc(498) Npc local498 = NpcList.npcs[NpcList.ids[local146]];
                if (local498 != null && local498.method2682()) {
                    @Pc(507) NpcType local507 = local498.type;
                    if (local507 != null && local507.multiNpcs != null) {
                        local507 = local507.getMultiNpc();
                    }
                    if (local507 != null && local507.aBoolean184 && local507.aBoolean183) {
                        local154 = local498.xFine / 32 - PlayerList.self.xFine / 32;
                        local231 = local498.zFine / 32 - PlayerList.self.zFine / 32;
                        if (local507.anInt3739 == -1) {
                            method1446(arg3, Sprites.mapdots[1], local231, local154, arg1, arg2);
                        } else {
                            method1446(arg3, Static67.mapfuncs[local507.anInt3739], local231, local154, arg1, arg2);
                        }
                    }
                }
            }
            for (local146 = 0; local146 < PlayerList.size; local146++) {
                @Pc(591) Player local591 = PlayerList.players[PlayerList.ids[local146]];
                if (local591 != null && local591.method2682()) {
                    local154 = local591.zFine / 32 - PlayerList.self.zFine / 32;
                    local150 = local591.xFine / 32 - PlayerList.self.xFine / 32;
                    @Pc(624) long local624 = local591.username.encode37();
                    @Pc(626) boolean local626 = false;
                    for (local239 = 0; local239 < FriendsList.size; local239++) {
                        if (local624 == FriendsList.encodedUsernames[local239] && FriendsList.worlds[local239] != 0) {
                            local626 = true;
                            break;
                        }
                    }
                    @Pc(660) boolean local660 = false;
                    for (local271 = 0; local271 < ClanChat.size; local271++) {
                        if (local624 == ClanChat.members[local271].key) {
                            local660 = true;
                            break;
                        }
                    }
                    @Pc(682) boolean local682 = false;
                    if (PlayerList.self.anInt1650 != 0 && local591.anInt1650 != 0 && local591.anInt1650 == PlayerList.self.anInt1650) {
                        local682 = true;
                    }
                    if (local626) {
                        method1446(arg3, Sprites.mapdots[3], local154, local150, arg1, arg2);
                    } else if (local660) {
                        method1446(arg3, Sprites.mapdots[5], local154, local150, arg1, arg2);
                    } else if (local682) {
                        method1446(arg3, Sprites.mapdots[4], local154, local150, arg1, arg2);
                    } else {
                        method1446(arg3, Sprites.mapdots[2], local154, local150, arg1, arg2);
                    }
                }
            }
            @Pc(756) MapMarker[] local756 = Static143.hintMapMarkers;
            for (local181 = 0; local181 < local756.length; local181++) {
                @Pc(770) MapMarker local770 = local756[local181];
                if (local770 != null && local770.type != 0 && client.loop % 20 < 10) {
                    if (local770.type == 1 && local770.actorTargetId >= 0 && local770.actorTargetId < NpcList.npcs.length) {
                        @Pc(804) Npc local804 = NpcList.npcs[local770.actorTargetId];
                        if (local804 != null) {
                            local231 = local804.xFine / 32 - PlayerList.self.xFine / 32;
                            local200 = local804.zFine / 32 - PlayerList.self.zFine / 32;
                            Static97.method1960(local770.anInt4048, arg1, arg2, local231, local200, arg3);
                        }
                    }
                    if (local770.type == 2) {
                        local154 = (local770.targetX - Camera.originX) * 4 + 2 - PlayerList.self.xFine / 32;
                        local231 = (-Camera.originZ + local770.anInt4046) * 4 + 2 - PlayerList.self.zFine / 32;
                        Static97.method1960(local770.anInt4048, arg1, arg2, local154, local231, arg3);
                    }
                    if (local770.type == 10 && local770.actorTargetId >= 0 && PlayerList.players.length > local770.actorTargetId) {
                        @Pc(905) Player local905 = PlayerList.players[local770.actorTargetId];
                        if (local905 != null) {
                            local200 = local905.zFine / 32 - PlayerList.self.zFine / 32;
                            local231 = local905.xFine / 32 - PlayerList.self.xFine / 32;
                            Static97.method1960(local770.anInt4048, arg1, arg2, local231, local200, arg3);
                        }
                    }
                }
            }
            if (Static115.mapFlagX != 0) {
                local146 = Static115.mapFlagX * 4 + 2 - PlayerList.self.xFine / 32;
                local181 = Static84.anInt2255 * 4 + 2 - PlayerList.self.zFine / 32;
                method1446(arg3, Sprites.mapflags, local181, local146, arg1, arg2);
            }
            if (GlRenderer.enabled) {
                GlRaster.method1186(arg2 + arg3.width / 2 - 1, arg1 + -1 - -(arg3.height / 2), 3, 3, 16777215);
            } else {
                SoftwareRaster.fillRect(arg3.width / 2 + arg2 - 1, arg3.height / 2 + -1 + arg1, 3, 3, 16777215);
            }
        } else if (GlRenderer.enabled) {
            @Pc(1041) Sprite local1041 = arg3.method489(false);
            if (local1041 != null) {
                local1041.render(arg2, arg1);
            }
        } else {
            SoftwareRaster.method2504(arg2, arg1, arg3.anIntArray37, arg3.anIntArray45);
        }
        InterfaceList.rectangleRedraw[arg0] = true;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!be;Lclient!qf;IIIBI)V")
	public static void method1446(@OriginalArg(0) Component arg0, @OriginalArg(1) Sprite arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == null) {
			return;
		}
		@Pc(21) int local21 = arg3 * arg3 + arg2 * arg2;
		@Pc(27) int local27 = Static59.anInt1814 + (int)Camera.yawTarget & 0x7FF;
		@Pc(39) int local39 = Math.max(arg0.width / 2, arg0.height / 2) + 10;
		if (local39 * local39 < local21) {
			return;
		}
		@Pc(50) int local50 = MathUtils.sin[local27];
		@Pc(58) int local58 = local50 * 256 / (anInt4130 + 256);
		@Pc(62) int local62 = MathUtils.cos[local27];
		@Pc(70) int local70 = local62 * 256 / (anInt4130 + 256);
		@Pc(81) int local81 = local58 * arg2 + arg3 * local70 >> 16;
		@Pc(92) int local92 = local70 * arg2 - arg3 * local58 >> 16;
		if (GlRenderer.enabled) {
			((GlSprite) arg1).method1425(arg0.width / 2 + arg5 + local81 - arg1.anInt1860 / 2, arg0.height / 2 + arg4 - (local92 + arg1.anInt1866 / 2), (GlSprite) arg0.method489(false));
		} else {
			((SoftwareSprite) arg1).method312(arg0.width / 2 + arg5 + local81 - arg1.anInt1860 / 2, -(arg1.anInt1866 / 2) + arg0.height / 2 + arg4 + -local92, arg0.anIntArray37, arg0.anIntArray45);
		}
	}
}
