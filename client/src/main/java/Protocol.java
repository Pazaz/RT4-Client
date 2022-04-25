import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;

public class Protocol {
    @OriginalMember(owner = "client!eg", name = "e", descriptor = "Lclient!i;")
	public static final Packet inboundBuffer = new Packet(65536);
    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Lclient!wa;")
    public static final Buffer chatBuffer = new Buffer(new byte[5000]);
    @OriginalMember(owner = "client!ag", name = "P", descriptor = "Lclient!i;")
    public static final Packet outboundBuffer = new Packet(5000);
    @OriginalMember(owner = "client!eb", name = "p", descriptor = "[I")
    public static final int[] removedIds = new int[1000];
    @OriginalMember(owner = "client!dh", name = "d", descriptor = "[I")
    public static final int[] extendedIds = new int[2048];
    @OriginalMember(owner = "client!ta", name = "z", descriptor = "[I")
    public static final int[] PACKET_LENGTHS = new int[] { -1, 0, 8, 0, 2, 0, 0, 0, 0, 12, 0, 1, 0, 3, 7, 0, 15, 6, 0, 0, 4, 7, -2, -1, 2, 0, 2, 8, 0, 0, 0, 0, -2, 5, 0, 0, 8, 3, 6, 0, 0, 0, -1, 0, -1, 0, 0, 6, -2, 0, 12, 0, 0, 0, -1, -2, 10, 0, 0, 0, 3, 0, -1, 0, 0, 5, 6, 0, 0, 8, -1, -1, 0, 8, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 6, 2, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 5, 0, 0, -2, 0, 0, 0, 0, 0, 12, 2, 0, -2, -2, 20, 0, 0, 10, 0, 15, 0, -1, 0, 8, -2, 0, 0, 0, 8, 0, 12, 0, 0, 7, 0, 0, 0, 0, 0, -1, -1, 0, 4, 5, 0, 0, 0, 6, 0, 0, 0, 0, 8, 9, 0, 0, 0, 2, -1, 0, -2, 0, 4, 14, 0, 0, 0, 24, 0, -2, 5, 0, 0, 0, 10, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 2, 1, 0, 0, 2, -1, 1, 0, 0, 0, 0, 14, 0, 0, 0, 0, 10, 5, 0, 0, 0, 0, 0, -2, 0, 0, 9, 0, 0, 8, 0, 0, 0, 0, -2, 6, 0, 0, 0, -2, 0, 3, 0, 1, 7, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 3, 0, 0 };
    @OriginalMember(owner = "client!jk", name = "B", descriptor = "Lclient!ma;")
    public static BufferedSocket socket;
    @OriginalMember(owner = "client!fl", name = "C", descriptor = "Lsignlink!im;")
    public static PrivilegedRequest socketRequest;
    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int verifyId = 0;
    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
	public static int opcode = 0;
    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int length = 0;
    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int extendedCount = 0;
    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int removedCount = 0;
    @OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
	public static int anInt4762 = 0;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
    public static void readLocationPacket() {
        @Pc(15) int local15;
        @Pc(23) int local23;
        @Pc(19) int local19;
        @Pc(27) int local27;
        @Pc(31) int local31;
        @Pc(39) int local39;
        @Pc(45) int local45;
        if (opcode == ServerProt.LOCATION_PACKET_195) {
            local15 = inboundBuffer.p1neg();
            local19 = local15 & 0x3;
            local23 = local15 >> 2;
            local27 = Static133.anIntArray453[local23];
            local31 = inboundBuffer.g1();
            local39 = (local31 >> 4 & 0x7) + Static115.anInt2940;
            local45 = (local31 & 0x7) + Static180.anInt4264;
            if (local39 >= 0 && local45 >= 0 && local39 < 104 && local45 < 104) {
                Static29.method800(Player.level, local45, local19, local39, -1, -1, local27, local23, 0);
            }
        } else if (opcode == ServerProt.LOCATION_PACKET_33) {
            local15 = inboundBuffer.g2le();
            local23 = inboundBuffer.g1();
            local27 = (local23 & 0x7) + Static180.anInt4264;
            local19 = (local23 >> 4 & 0x7) + Static115.anInt2940;
            local31 = inboundBuffer.g2sub();
            if (local19 >= 0 && local27 >= 0 && local19 < 104 && local27 < 104) {
                @Pc(122) ObjStack local122 = new ObjStack();
                local122.anInt5550 = local31;
                local122.anInt5555 = local15;
                if (Static159.aClass69ArrayArrayArray1[Player.level][local19][local27] == null) {
                    Static159.aClass69ArrayArrayArray1[Player.level][local19][local27] = new LinkedList();
                }
                Static159.aClass69ArrayArrayArray1[Player.level][local19][local27].addTail(new ObjStackNode(local122));
                Static220.spawnGroundObject(local27, local19);
            }
        } else {
            @Pc(218) int local218;
            @Pc(228) int local228;
            @Pc(232) int local232;
            @Pc(247) int local247;
            @Pc(224) int local224;
            @Pc(236) int local236;
            @Pc(317) ProjAnim local317;
            if (opcode == ServerProt.LOCATION_PACKET_121) {
                local15 = inboundBuffer.g1();
                local23 = Static115.anInt2940 * 2 + (local15 >> 4 & 0xF);
                local19 = (local15 & 0xF) + Static180.anInt4264 * 2;
                local27 = local23 + inboundBuffer.g1s();
                local31 = inboundBuffer.g1s() + local19;
                local39 = inboundBuffer.g2s();
                local45 = inboundBuffer.g2();
                local218 = inboundBuffer.g1() * 4;
                local224 = inboundBuffer.g1() * 4;
                local228 = inboundBuffer.g2();
                local232 = inboundBuffer.g2();
                local236 = inboundBuffer.g1();
                if (local236 == 255) {
                    local236 = -1;
                }
                local247 = inboundBuffer.g1();
                if (local23 >= 0 && local19 >= 0 && local23 < 208 && local19 < 208 && local27 >= 0 && local31 >= 0 && local27 < 208 && local31 < 208 && local45 != 65535) {
                    local31 *= 64;
                    local27 = local27 * 64;
                    local19 = local19 * 64;
                    local23 = local23 * 64;
                    local317 = new ProjAnim(local45, Player.level, local23, local19, SceneGraph.getTileHeight(Player.level, local23, local19) - local218, client.loop + local228, local232 + client.loop, local236, local247, local39, local224);
                    local317.method3705(local31, client.loop + local228, -local224 + SceneGraph.getTileHeight(Player.level, local27, local31), local27);
                    Static217.aClass69_116.addTail(new ProjAnimNode(local317));
                }
            } else if (opcode == ServerProt.LOCATION_PACKET_17) {
                local15 = inboundBuffer.g1();
                local23 = Static115.anInt2940 + (local15 >> 4 & 0x7);
                local19 = Static180.anInt4264 + (local15 & 0x7);
                local27 = inboundBuffer.g2();
                local31 = inboundBuffer.g1();
                local39 = inboundBuffer.g2();
                if (local23 >= 0 && local19 >= 0 && local23 < 104 && local19 < 104) {
                    local23 = local23 * 128 + 64;
                    local19 = local19 * 128 + 64;
                    @Pc(427) SpotAnim local427 = new SpotAnim(local27, Player.level, local23, local19, SceneGraph.getTileHeight(Player.level, local23, local19) - local31, local39, client.loop);
                    Static99.aClass69_64.addTail(new SpotAnimNode(local427));
                }
            } else if (opcode == ServerProt.LOCATION_PACKET_179) {
                local15 = inboundBuffer.g1add();
                local23 = local15 >> 2;
                local19 = local15 & 0x3;
                local27 = Static133.anIntArray453[local23];
                local31 = inboundBuffer.g1();
                local39 = Static115.anInt2940 + (local31 >> 4 & 0x7);
                local45 = (local31 & 0x7) + Static180.anInt4264;
                local218 = inboundBuffer.g2sub();
                if (local39 >= 0 && local45 >= 0 && local39 < 104 && local45 < 104) {
                    Static29.method800(Player.level, local45, local19, local39, -1, local218, local27, local23, 0);
                }
            } else if (opcode == ServerProt.LOCATION_PACKET_20) {
                local15 = inboundBuffer.g1ssub();
                local23 = (local15 >> 4 & 0x7) + Static115.anInt2940;
                local19 = Static180.anInt4264 + (local15 & 0x7);
                local27 = inboundBuffer.g1ssub();
                local31 = local27 >> 2;
                local39 = local27 & 0x3;
                local45 = Static133.anIntArray453[local31];
                local218 = inboundBuffer.g2le();
                if (local218 == 65535) {
                    local218 = -1;
                }
                Static92.method1881(Player.level, local39, local31, local19, local45, local23, local218);
            } else {
                @Pc(633) int local633;
                if (opcode == ServerProt.LOCATION_PACKET_202) {
                    local15 = inboundBuffer.g1();
                    local23 = local15 >> 2;
                    local19 = local15 & 0x3;
                    local27 = inboundBuffer.g1();
                    local31 = (local27 >> 4 & 0x7) + Static115.anInt2940;
                    local39 = (local27 & 0x7) + Static180.anInt4264;
                    @Pc(605) byte local605 = inboundBuffer.p1sub();
                    @Pc(609) byte local609 = inboundBuffer.p1sub();
                    @Pc(613) byte local613 = inboundBuffer.g1sub();
                    local228 = inboundBuffer.g2sub();
                    local232 = inboundBuffer.g2le();
                    @Pc(625) byte local625 = inboundBuffer.g1s();
                    local247 = inboundBuffer.g2();
                    local633 = inboundBuffer.g2lesadd();
                    if (!GlRenderer.enabled) {
                        Static170.method2574(local625, local247, local633, local232, local39, local613, local19, local605, local31, local23, local609, local228);
                    }
                }
                if (opcode == ServerProt.LOCATION_PACKET_14) {
                    local15 = inboundBuffer.g1();
                    local19 = Static180.anInt4264 + (local15 & 0x7);
                    local23 = (local15 >> 4 & 0x7) + Static115.anInt2940;
                    local27 = inboundBuffer.g2();
                    local31 = inboundBuffer.g2();
                    local39 = inboundBuffer.g2();
                    if (local23 >= 0 && local19 >= 0 && local23 < 104 && local19 < 104) {
                        @Pc(710) LinkedList local710 = Static159.aClass69ArrayArrayArray1[Player.level][local23][local19];
                        if (local710 != null) {
                            for (@Pc(718) ObjStackNode local718 = (ObjStackNode) local710.method2289(); local718 != null; local718 = (ObjStackNode) local710.method2288()) {
                                @Pc(723) ObjStack local723 = local718.aClass8_Sub7_1;
                                if ((local27 & 0x7FFF) == local723.anInt5555 && local31 == local723.anInt5550) {
                                    local723.anInt5550 = local39;
                                    break;
                                }
                            }
                            Static220.spawnGroundObject(local19, local23);
                        }
                    }
                } else if (opcode == ServerProt.LOCATION_PACKET_135) {
                    local15 = inboundBuffer.g2leadd();
                    local23 = inboundBuffer.p1neg();
                    local27 = Static180.anInt4264 + (local23 & 0x7);
                    local19 = (local23 >> 4 & 0x7) + Static115.anInt2940;
                    local31 = inboundBuffer.g2le();
                    local39 = inboundBuffer.g2le();
                    if (local19 >= 0 && local27 >= 0 && local19 < 104 && local27 < 104 && PlayerList.selfId != local15) {
                        @Pc(812) ObjStack local812 = new ObjStack();
                        local812.anInt5550 = local31;
                        local812.anInt5555 = local39;
                        if (Static159.aClass69ArrayArrayArray1[Player.level][local19][local27] == null) {
                            Static159.aClass69ArrayArrayArray1[Player.level][local19][local27] = new LinkedList();
                        }
                        Static159.aClass69ArrayArrayArray1[Player.level][local19][local27].addTail(new ObjStackNode(local812));
                        Static220.spawnGroundObject(local27, local19);
                    }
                } else if (opcode == ServerProt.LOCATION_PACKET_16) {
                    local15 = inboundBuffer.g1();
                    local23 = Static115.anInt2940 + (local15 >> 4 & 0x7);
                    local19 = (local15 & 0x7) + Static180.anInt4264;
                    local27 = local23 + inboundBuffer.g1s();
                    local31 = inboundBuffer.g1s() + local19;
                    local39 = inboundBuffer.g2s();
                    local45 = inboundBuffer.g2();
                    local218 = inboundBuffer.g1() * 4;
                    local224 = inboundBuffer.g1() * 4;
                    local228 = inboundBuffer.g2();
                    local232 = inboundBuffer.g2();
                    local236 = inboundBuffer.g1();
                    local247 = inboundBuffer.g1();
                    if (local236 == 255) {
                        local236 = -1;
                    }
                    if (local23 >= 0 && local19 >= 0 && local23 < 104 && local19 < 104 && local27 >= 0 && local31 >= 0 && local27 < 104 && local31 < 104 && local45 != 65535) {
                        local31 = local31 * 128 + 64;
                        local19 = local19 * 128 + 64;
                        local23 = local23 * 128 + 64;
                        local27 = local27 * 128 + 64;
                        local317 = new ProjAnim(local45, Player.level, local23, local19, SceneGraph.getTileHeight(Player.level, local23, local19) - local218, local228 + client.loop, local232 + client.loop, local236, local247, local39, local224);
                        local317.method3705(local31, client.loop + local228, SceneGraph.getTileHeight(Player.level, local27, local31) - local224, local27);
                        Static217.aClass69_116.addTail(new ProjAnimNode(local317));
                    }
                } else if (opcode == ServerProt.LOCATION_PACKET_104) {
                    local15 = inboundBuffer.g1();
                    local19 = Static180.anInt4264 * 2 + (local15 & 0xF);
                    local23 = Static115.anInt2940 * 2 + (local15 >> 4 & 0xF);
                    local27 = inboundBuffer.g1s() + local23;
                    local31 = inboundBuffer.g1s() + local19;
                    local39 = inboundBuffer.g2s();
                    local45 = inboundBuffer.g2s();
                    local218 = inboundBuffer.g2();
                    local224 = inboundBuffer.g1s();
                    local228 = inboundBuffer.g1() * 4;
                    local232 = inboundBuffer.g2();
                    local236 = inboundBuffer.g2();
                    local247 = inboundBuffer.g1();
                    local633 = inboundBuffer.g1();
                    if (local247 == 255) {
                        local247 = -1;
                    }
                    if (local23 >= 0 && local19 >= 0 && local23 < 208 && local19 < 208 && local27 >= 0 && local31 >= 0 && local27 < 208 && local31 < 208 && local218 != 65535) {
                        local27 = local27 * 64;
                        local23 *= 64;
                        local31 *= 64;
                        local19 *= 64;
                        if (local39 != 0) {
                            @Pc(1194) int local1194;
                            @Pc(1198) PathingEntity local1198;
                            @Pc(1184) int local1184;
                            @Pc(1188) int local1188;
                            if (local39 >= 0) {
                                local1184 = local39 - 1;
                                local1188 = local1184 & 0x7FF;
                                local1194 = local1184 >> 11 & 0xF;
                                local1198 = NpcList.npcs[local1188];
                            } else {
                                local1184 = -local39 - 1;
                                local1194 = local1184 >> 11 & 0xF;
                                local1188 = local1184 & 0x7FF;
                                if (PlayerList.selfId == local1188) {
                                    local1198 = PlayerList.self;
                                } else {
                                    local1198 = PlayerList.players[local1188];
                                }
                            }
                            if (local1198 != null) {
                                @Pc(1232) BasType local1232 = local1198.method2681();
                                if (local1232.modelRotateTranslate != null && local1232.modelRotateTranslate[local1194] != null) {
                                    local1188 = local1232.modelRotateTranslate[local1194][0];
                                    local224 -= local1232.modelRotateTranslate[local1194][1];
                                    @Pc(1264) int local1264 = local1232.modelRotateTranslate[local1194][2];
                                    @Pc(1269) int local1269 = MathUtils.sin[local1198.anInt3381];
                                    @Pc(1274) int local1274 = MathUtils.cos[local1198.anInt3381];
                                    @Pc(1284) int local1284 = local1188 * local1274 + local1264 * local1269 >> 16;
                                    @Pc(1295) int local1295 = local1274 * local1264 - local1188 * local1269 >> 16;
                                    local19 += local1295;
                                    local23 += local1284;
                                }
                            }
                        }
                        @Pc(1331) ProjAnim local1331 = new ProjAnim(local218, Player.level, local23, local19, SceneGraph.getTileHeight(Player.level, local23, local19) - local224, local232 + client.loop, local236 + client.loop, local247, local633, local45, local228);
                        local1331.method3705(local31, local232 + client.loop, -local228 + SceneGraph.getTileHeight(Player.level, local27, local31), local27);
                        Static217.aClass69_116.addTail(new ProjAnimNode(local1331));
                    }
                } else if (opcode == ServerProt.LOCATION_PACKET_97) {
                    local15 = inboundBuffer.g1();
                    local23 = Static115.anInt2940 + (local15 >> 4 & 0x7);
                    local19 = Static180.anInt4264 + (local15 & 0x7);
                    local27 = inboundBuffer.g2();
                    if (local27 == 65535) {
                        local27 = -1;
                    }
                    local31 = inboundBuffer.g1();
                    local39 = local31 >> 4 & 0xF;
                    local218 = inboundBuffer.g1();
                    local45 = local31 & 0x7;
                    if (local23 >= 0 && local19 >= 0 && local23 < 104 && local19 < 104) {
                        local224 = local39 + 1;
                        if (PlayerList.self.movementQueueX[0] >= local23 - local224 && local224 + local23 >= PlayerList.self.movementQueueX[0] && PlayerList.self.movementQueueZ[0] >= local19 - local224 && PlayerList.self.movementQueueZ[0] <= local224 + local19 && Preferences.ambientSoundsVolume != 0 && local45 > 0 && SoundPlayer.anInt4451 < 50 && local27 != -1) {
                            SoundPlayer.anIntArray421[SoundPlayer.anInt4451] = local27;
                            SoundPlayer.anIntArray563[SoundPlayer.anInt4451] = local45;
                            SoundPlayer.anIntArray362[SoundPlayer.anInt4451] = local218;
                            SoundPlayer.aClass138Array1[SoundPlayer.anInt4451] = null;
                            SoundPlayer.anIntArray68[SoundPlayer.anInt4451] = local39 + (local23 << 16) + (local19 << 8);
                            SoundPlayer.anInt4451++;
                        }
                    }
                } else if (opcode == ServerProt.LOCATION_PACKET_240) {
                    local15 = inboundBuffer.g1ssub();
                    local19 = Static180.anInt4264 + (local15 & 0x7);
                    local23 = (local15 >> 4 & 0x7) + Static115.anInt2940;
                    local27 = inboundBuffer.g2();
                    if (local23 >= 0 && local19 >= 0 && local23 < 104 && local19 < 104) {
                        @Pc(1565) LinkedList local1565 = Static159.aClass69ArrayArrayArray1[Player.level][local23][local19];
                        if (local1565 != null) {
                            for (@Pc(1572) ObjStackNode local1572 = (ObjStackNode) local1565.method2289(); local1572 != null; local1572 = (ObjStackNode) local1565.method2288()) {
                                if (local1572.aClass8_Sub7_1.anInt5555 == (local27 & 0x7FFF)) {
                                    local1572.unlink();
                                    break;
                                }
                            }
                            if (local1565.method2289() == null) {
                                Static159.aClass69ArrayArrayArray1[Player.level][local23][local19] = null;
                            }
                            Static220.spawnGroundObject(local19, local23);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)V")
    public static void readRebuildPacket(@OriginalArg(1) boolean arg0) {
        Static230.dynamicMapRegion = arg0;
        @Pc(13) int local13;
        @Pc(20) int local20;
        @Pc(26) int local26;
        @Pc(31) int local31;
        @Pc(60) int local60;
        @Pc(64) int local64;
        @Pc(138) int local138;
        @Pc(151) int local151;
        @Pc(169) int local169;
        if (!Static230.dynamicMapRegion) {
            local13 = inboundBuffer.g2sub();
            local20 = (length - inboundBuffer.offset) / 16;
            Static72.regionsXteaKeys = new int[local20][4];
            for (local26 = 0; local26 < local20; local26++) {
                for (local31 = 0; local31 < 4; local31++) {
                    Static72.regionsXteaKeys[local26][local31] = inboundBuffer.p4rme();
                }
            }
            local26 = inboundBuffer.g1ssub();
            local31 = inboundBuffer.g2();
            local60 = inboundBuffer.g2sub();
            local64 = inboundBuffer.g2sub();
            Static238.regionBitPacked = new int[local20];
            Static273.mapFilesBuffer = new byte[local20][];
            Static191.npcSpawnsFilesBuffer = null;
            Static99.underWaterMapFileIds = new int[local20];
            Static156.locationMapFilesBuffer = new byte[local20][];
            Static19.underWaterLocationsMapFilesBuffer = new byte[local20][];
            Static175.npcSpawnsFileIds = null;
            Static36.mapFileIds = new int[local20];
            Static186.underWaterMapFilesBuffer = new byte[local20][];
            Static172.locationsMapFileIds = new int[local20];
            Static35.underWaterLocationsMapFileIds = new int[local20];
            local20 = 0;
            @Pc(100) boolean local100 = false;
            if ((local31 / 8 == 48 || local31 / 8 == 49) && local60 / 8 == 48) {
                local100 = true;
            }
            if (local31 / 8 == 48 && local60 / 8 == 148) {
                local100 = true;
            }
            for (local138 = (local31 - 6) / 8; local138 <= (local31 + 6) / 8; local138++) {
                for (local151 = (local60 - 6) / 8; local151 <= (local60 + 6) / 8; local151++) {
                    local169 = (local138 << 8) + local151;
                    if (local100 && (local151 == 49 || local151 == 149 || local151 == 147 || local138 == 50 || local138 == 49 && local151 == 47)) {
                        Static238.regionBitPacked[local20] = local169;
                        Static36.mapFileIds[local20] = -1;
                        Static172.locationsMapFileIds[local20] = -1;
                        Static99.underWaterMapFileIds[local20] = -1;
                        Static35.underWaterLocationsMapFileIds[local20] = -1;
                    } else {
                        Static238.regionBitPacked[local20] = local169;
                        Static36.mapFileIds[local20] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { Static103.aClass100_558, Static123.parseInt(local138), Static86.aClass100_488, Static123.parseInt(local151) }));
                        Static172.locationsMapFileIds[local20] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { Static270.aClass100_1090, Static123.parseInt(local138), Static86.aClass100_488, Static123.parseInt(local151) }));
                        Static99.underWaterMapFileIds[local20] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { Static165.aClass100_772, Static123.parseInt(local138), Static86.aClass100_488, Static123.parseInt(local151) }));
                        Static35.underWaterLocationsMapFileIds[local20] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { Static278.aClass100_1103, Static123.parseInt(local138), Static86.aClass100_488, Static123.parseInt(local151) }));
                    }
                    local20++;
                }
            }
            Static127.method2463(local26, local60, local31, local64, false, local13);
            return;
        }
        local13 = inboundBuffer.g2leadd();
        local20 = inboundBuffer.g2leadd();
        local26 = inboundBuffer.g1ssub();
        local31 = inboundBuffer.g2leadd();
        inboundBuffer.accessBits();
        @Pc(391) int local391;
        for (local60 = 0; local60 < 4; local60++) {
            for (local64 = 0; local64 < 13; local64++) {
                for (local391 = 0; local391 < 13; local391++) {
                    local138 = inboundBuffer.gBits(1);
                    if (local138 == 1) {
                        Static187.anIntArrayArrayArray18[local60][local64][local391] = inboundBuffer.gBits(26);
                    } else {
                        Static187.anIntArrayArrayArray18[local60][local64][local391] = -1;
                    }
                }
            }
        }
        inboundBuffer.accessBytes();
        local60 = (length - inboundBuffer.offset) / 16;
        Static72.regionsXteaKeys = new int[local60][4];
        for (local64 = 0; local64 < local60; local64++) {
            for (local391 = 0; local391 < 4; local391++) {
                Static72.regionsXteaKeys[local64][local391] = inboundBuffer.p4rme();
            }
        }
        local64 = inboundBuffer.g2();
        Static35.underWaterLocationsMapFileIds = new int[local60];
        Static172.locationsMapFileIds = new int[local60];
        Static36.mapFileIds = new int[local60];
        Static19.underWaterLocationsMapFilesBuffer = new byte[local60][];
        Static175.npcSpawnsFileIds = null;
        Static99.underWaterMapFileIds = new int[local60];
        Static156.locationMapFilesBuffer = new byte[local60][];
        Static273.mapFilesBuffer = new byte[local60][];
        Static238.regionBitPacked = new int[local60];
        Static191.npcSpawnsFilesBuffer = null;
        Static186.underWaterMapFilesBuffer = new byte[local60][];
        local60 = 0;
        for (local391 = 0; local391 < 4; local391++) {
            for (local138 = 0; local138 < 13; local138++) {
                for (local151 = 0; local151 < 13; local151++) {
                    local169 = Static187.anIntArrayArrayArray18[local391][local138][local151];
                    if (local169 != -1) {
                        @Pc(555) int local555 = local169 >> 14 & 0x3FF;
                        @Pc(561) int local561 = local169 >> 3 & 0x7FF;
                        @Pc(571) int local571 = local561 / 8 + (local555 / 8 << 8);
                        @Pc(573) int local573;
                        for (local573 = 0; local573 < local60; local573++) {
                            if (local571 == Static238.regionBitPacked[local573]) {
                                local571 = -1;
                                break;
                            }
                        }
                        if (local571 != -1) {
                            Static238.regionBitPacked[local60] = local571;
                            @Pc(609) int local609 = local571 & 0xFF;
                            local573 = local571 >> 8 & 0xFF;
                            Static36.mapFileIds[local60] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { Static103.aClass100_558, Static123.parseInt(local573), Static86.aClass100_488, Static123.parseInt(local609) }));
                            Static172.locationsMapFileIds[local60] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { Static270.aClass100_1090, Static123.parseInt(local573), Static86.aClass100_488, Static123.parseInt(local609) }));
                            Static99.underWaterMapFileIds[local60] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { Static165.aClass100_772, Static123.parseInt(local573), Static86.aClass100_488, Static123.parseInt(local609) }));
                            Static35.underWaterLocationsMapFileIds[local60] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { Static278.aClass100_1103, Static123.parseInt(local573), Static86.aClass100_488, Static123.parseInt(local609) }));
                            local60++;
                        }
                    }
                }
            }
        }
        Static127.method2463(local26, local64, local20, local31, false, local13);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIBLclient!e;)V")
    public static void readExtendedPlayerInfo(@OriginalArg(0) int flags, @OriginalArg(1) int id, @OriginalArg(3) Player player) {
        @Pc(13) int int1;
        @Pc(17) int int2;
        @Pc(24) int local24;
        if ((flags & 0x80) != 0) {
            int1 = inboundBuffer.g2le();
            int2 = inboundBuffer.g1();
            @Pc(21) int local21 = inboundBuffer.g1();
            local24 = inboundBuffer.offset;
            @Pc(35) boolean local35 = (int1 & 0x8000) != 0;
            if (player.username != null && player.appearance != null) {
                @Pc(48) long local48 = player.username.encode37();
                @Pc(50) boolean ignore = false;
                if (int2 <= 1) {
                    if (!local35 && (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat)) {
                        ignore = true;
                    } else {
                        for (@Pc(69) int local69 = 0; local69 < IgnoreList.size; local69++) {
                            if (IgnoreList.encodedUsernames[local69] == local48) {
                                ignore = true;
                                break;
                            }
                        }
                    }
                }
                if (!ignore && Player.inTutorialIsland == 0) {
                    chatBuffer.offset = 0;
                    inboundBuffer.gBytesRev(local21, chatBuffer.data);
                    chatBuffer.offset = 0;
                    @Pc(106) int local106 = -1;
                    @Pc(127) JagString message;
                    if (local35) {
                        @Pc(112) QuickChatPhrase phrase = Static264.method3568(chatBuffer);
                        int1 &= 0x7FFF;
                        local106 = phrase.id;
                        message = phrase.type.decodeMessage(chatBuffer);
                    } else {
                        message = Font.escape(Static65.formatChatMessage(chatBuffer).encodeMessage());
                    }
                    player.chatMessage = message.trim();
                    player.chatEffect = int1 & 0xFF;
                    player.chatLoops = 150;
                    player.chatColor = int1 >> 8;
                    if (int2 == 2) {
                        Chat.add(local106, local35 ? 17 : 1, message, null, JagString.concatenate(new JagString[] { Static44.aClass100_336, player.getName() }));
                    } else if (int2 == 1) {
                        Chat.add(local106, local35 ? 17 : 1, message, null, JagString.concatenate(new JagString[] { Static65.aClass100_435, player.getName() }));
                    } else {
                        Chat.add(local106, local35 ? 17 : 2, message, null, player.getName());
                    }
                }
            }
            inboundBuffer.offset = local24 + local21;
        }
        if ((flags & 0x1) != 0) {
            int1 = inboundBuffer.gSmart1or2();
            int2 = inboundBuffer.g1add();
            player.addHit(int2, client.loop, int1);
            player.hitpointsBarVisibleUntil = client.loop + 300;
            player.hitpointsBar = inboundBuffer.g1ssub();
        }
        if ((flags & 0x8) != 0) {
            int1 = inboundBuffer.g2();
            if (int1 == 65535) {
                int1 = -1;
            }
            int2 = inboundBuffer.g1();
            Player.animate(int2, int1, player);
        }
        if ((flags & 0x4) != 0) {
            int1 = inboundBuffer.g1add();
            @Pc(309) byte[] bytes = new byte[int1];
            @Pc(314) Buffer buffer = new Buffer(bytes);
            inboundBuffer.gBytes(int1, bytes);
            PlayerList.appearanceCache[id] = buffer;
            player.decodeAppearance(buffer);
        }
        if ((flags & 0x2) != 0) {
            player.faceEntity = inboundBuffer.g2sub();
            if (player.faceEntity == 65535) {
                player.faceEntity = -1;
            }
        }
        if ((flags & 0x400) != 0) {
            player.anInt3380 = inboundBuffer.p1neg();
            player.anInt3428 = inboundBuffer.g1();
            player.anInt3416 = inboundBuffer.g1add();
            player.anInt3392 = inboundBuffer.g1();
            player.anInt3395 = inboundBuffer.g2le() + client.loop;
            player.anInt3386 = inboundBuffer.g2le() + client.loop;
            player.anInt3431 = inboundBuffer.p1neg();
            player.movementQueueSize = 1;
            player.anInt3405 = 0;
        }
        if ((flags & 0x20) != 0) {
            player.chatMessage = inboundBuffer.gjstr();
            if (player.chatMessage.charAt(0) == 126) {
                player.chatMessage = player.chatMessage.substring(1);
                Chat.add(player.getName(), 2, player.chatMessage);
            } else if (player == PlayerList.self) {
                Chat.add(player.getName(), 2, player.chatMessage);
            }
            player.chatEffect = 0;
            player.chatColor = 0;
            player.chatLoops = 150;
        }
        if ((flags & 0x200) != 0) {
            int1 = inboundBuffer.gSmart1or2();
            int2 = inboundBuffer.g1ssub();
            player.addHit(int2, client.loop, int1);
        }
        if ((flags & 0x800) != 0) {
            int1 = inboundBuffer.p1neg();
            @Pc(502) int[] seqIds = new int[int1];
            @Pc(505) int[] delays = new int[int1];
            @Pc(508) int[] slotMasks = new int[int1];
            for (@Pc(510) int i = 0; i < int1; i++) {
                @Pc(521) int seqId = inboundBuffer.g2le();
                if (seqId == 65535) {
                    seqId = -1;
                }
                seqIds[i] = seqId;
                delays[i] = inboundBuffer.g1add();
                slotMasks[i] = inboundBuffer.g2();
            }
            Player.method865(delays, seqIds, player, slotMasks);
        }
        if ((flags & 0x100) != 0) {
            int1 = inboundBuffer.g2le();
            if (int1 == 65535) {
                int1 = -1;
            }
            int2 = inboundBuffer.p4rme();
            @Pc(573) boolean local573 = true;
            if (int1 != -1 && player.spotAnimId != -1 && SeqTypeList.get(SpotAnimTypeList.get(int1).seqId).anInt5355 < SeqTypeList.get(SpotAnimTypeList.get(player.spotAnimId).seqId).anInt5355) {
                local573 = false;
            }
            if (local573) {
                player.spotAnimStart = (int2 & 0xFFFF) + client.loop;
                player.anInt3361 = 0;
                player.anInt3399 = 0;
                player.spotAnimId = int1;
                if (player.spotAnimStart > client.loop) {
                    player.anInt3399 = -1;
                }
                player.spotAnimY = int2 >> 16;
                player.anInt3418 = 1;
                if (player.spotAnimId != -1 && client.loop == player.spotAnimStart) {
                    local24 = SpotAnimTypeList.get(player.spotAnimId).seqId;
                    if (local24 != -1) {
                        @Pc(663) SeqType local663 = SeqTypeList.get(local24);
                        if (local663 != null && local663.frames != null) {
                            SoundPlayer.playSeqSound(player.zFine, local663, player.xFine, player == PlayerList.self, 0);
                        }
                    }
                }
            }
        }
        if ((flags & 0x40) != 0) {
            player.faceX = inboundBuffer.g2();
            player.faceY = inboundBuffer.g2leadd();
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
    public static void readPlayerInfoPacket() {
        extendedCount = 0;
        removedCount = 0;
        readSelfPlayerInfo();
        readPlayerInfo();
        readNewPlayerInfo();
        readExtendedPlayerInfo();
        @Pc(23) int i;
        for (i = 0; i < removedCount; i++) {
            @Pc(30) int local30 = removedIds[i];
            if (client.loop != PlayerList.players[local30].lastSeenLoop) {
                if (PlayerList.players[local30].soundRadius > 0) {
                    AreaSoundManager.remove(PlayerList.players[local30]);
                }
                PlayerList.players[local30] = null;
            }
        }
        if (length != inboundBuffer.offset) {
            throw new RuntimeException("gpp1 pos:" + inboundBuffer.offset + " psize:" + length);
        }
        for (i = 0; i < PlayerList.size; i++) {
            if (PlayerList.players[PlayerList.ids[i]] == null) {
                throw new RuntimeException("gpp2 pos:" + i + " size:" + PlayerList.size);
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
	public static void readSelfPlayerInfo() {
		inboundBuffer.accessBits();
		@Pc(11) int upated = inboundBuffer.gBits(1);
		if (upated == 0) {
			return;
		}
		@Pc(23) int type = inboundBuffer.gBits(2);
		if (type == 0) {
			extendedIds[extendedCount++] = 2047;
			return;
		}
		@Pc(54) int local54;
		@Pc(64) int local64;
		if (type == 1) {
			local54 = inboundBuffer.gBits(3);
			PlayerList.self.move(1, local54);
			local64 = inboundBuffer.gBits(1);
			if (local64 == 1) {
				extendedIds[extendedCount++] = 2047;
			}
		} else if (type == 2) {
			if (inboundBuffer.gBits(1) == 1) {
				local54 = inboundBuffer.gBits(3);
				PlayerList.self.move(2, local54);
				local64 = inboundBuffer.gBits(3);
				PlayerList.self.move(2, local64);
			} else {
				local54 = inboundBuffer.gBits(3);
				PlayerList.self.move(0, local54);
			}
			local54 = inboundBuffer.gBits(1);
			if (local54 == 1) {
				extendedIds[extendedCount++] = 2047;
			}
		} else if (type == 3) {
			local54 = inboundBuffer.gBits(7);
			local64 = inboundBuffer.gBits(1);
			Player.level = inboundBuffer.gBits(2);
			@Pc(163) int local163 = inboundBuffer.gBits(1);
			if (local163 == 1) {
				extendedIds[extendedCount++] = 2047;
			}
			@Pc(181) int x = inboundBuffer.gBits(7);
			PlayerList.self.teleport(x, local64 == 1, local54);
		}
	}

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)V")
    public static void readPlayerInfo() {
        @Pc(6) int local6 = inboundBuffer.gBits(8);
        @Pc(20) int local20;
        if (PlayerList.size > local6) {
            for (local20 = local6; local20 < PlayerList.size; local20++) {
                removedIds[removedCount++] = PlayerList.ids[local20];
            }
        }
        if (local6 > PlayerList.size) {
            throw new RuntimeException("gppov1");
        }
        PlayerList.size = 0;
        for (local20 = 0; local20 < local6; local20++) {
            @Pc(75) int local75 = PlayerList.ids[local20];
            @Pc(79) Player local79 = PlayerList.players[local75];
            @Pc(84) int local84 = inboundBuffer.gBits(1);
            if (local84 == 0) {
                PlayerList.ids[PlayerList.size++] = local75;
                local79.lastSeenLoop = client.loop;
            } else {
                @Pc(107) int local107 = inboundBuffer.gBits(2);
                if (local107 == 0) {
                    PlayerList.ids[PlayerList.size++] = local75;
                    local79.lastSeenLoop = client.loop;
                    extendedIds[extendedCount++] = local75;
                } else {
                    @Pc(153) int local153;
                    @Pc(163) int local163;
                    if (local107 == 1) {
                        PlayerList.ids[PlayerList.size++] = local75;
                        local79.lastSeenLoop = client.loop;
                        local153 = inboundBuffer.gBits(3);
                        local79.move(1, local153);
                        local163 = inboundBuffer.gBits(1);
                        if (local163 == 1) {
                            extendedIds[extendedCount++] = local75;
                        }
                    } else if (local107 == 2) {
                        PlayerList.ids[PlayerList.size++] = local75;
                        local79.lastSeenLoop = client.loop;
                        if (inboundBuffer.gBits(1) == 1) {
                            local153 = inboundBuffer.gBits(3);
                            local79.move(2, local153);
                            local163 = inboundBuffer.gBits(3);
                            local79.move(2, local163);
                        } else {
                            local153 = inboundBuffer.gBits(3);
                            local79.move(0, local153);
                        }
                        local153 = inboundBuffer.gBits(1);
                        if (local153 == 1) {
                            extendedIds[extendedCount++] = local75;
                        }
                    } else if (local107 == 3) {
                        removedIds[removedCount++] = local75;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static void readNewPlayerInfo() {
        while (true) {
            if (inboundBuffer.method2241(length) >= 11) {
                @Pc(20) int local20 = inboundBuffer.gBits(11);
                if (local20 != 2047) {
                    @Pc(27) boolean local27 = false;
                    if (PlayerList.players[local20] == null) {
                        PlayerList.players[local20] = new Player();
                        local27 = true;
                        if (PlayerList.appearanceCache[local20] != null) {
                            PlayerList.players[local20].decodeAppearance(PlayerList.appearanceCache[local20]);
                        }
                    }
                    PlayerList.ids[PlayerList.size++] = local20;
                    @Pc(65) Player local65 = PlayerList.players[local20];
                    local65.lastSeenLoop = client.loop;
                    @Pc(73) int local73 = inboundBuffer.gBits(1);
                    if (local73 == 1) {
                        extendedIds[extendedCount++] = local20;
                    }
                    @Pc(92) int local92 = inboundBuffer.gBits(5);
                    @Pc(99) int local99 = PathingEntity.ANGLES[inboundBuffer.gBits(3)];
                    if (local92 > 15) {
                        local92 -= 32;
                    }
                    if (local27) {
                        local65.anInt3400 = local65.anInt3381 = local99;
                    }
                    @Pc(116) int local116 = inboundBuffer.gBits(1);
                    @Pc(121) int local121 = inboundBuffer.gBits(5);
                    if (local121 > 15) {
                        local121 -= 32;
                    }
                    local65.teleport(local92 + PlayerList.self.movementQueueX[0], local116 == 1, PlayerList.self.movementQueueZ[0] + local121);
                    continue;
                }
            }
            inboundBuffer.accessBytes();
            return;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
    public static void readExtendedPlayerInfo() {
        for (@Pc(7) int i = 0; i < extendedCount; i++) {
            @Pc(31) int id = extendedIds[i];
            @Pc(35) Player player = PlayerList.players[id];
            @Pc(39) int flags = inboundBuffer.g1();
            if ((flags & 0x10) != 0) {
                flags += inboundBuffer.g1() << 8;
            }
            readExtendedPlayerInfo(flags, id, player);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)Z")
    public static boolean readPacketInternal() throws IOException {
        if (socket == null) {
            return false;
        }
        @Pc(14) int available = socket.available();
        if (available == 0) {
            return false;
        }
        if (opcode == -1) {
            available--;
            socket.read(0, 1, inboundBuffer.data);
            inboundBuffer.offset = 0;
            opcode = inboundBuffer.g1isaac();
            length = PACKET_LENGTHS[opcode];
        }
        if (length == -1) {
            if (available <= 0) {
                return false;
            }
            socket.read(0, 1, inboundBuffer.data);
            available--;
            length = inboundBuffer.data[0] & 0xFF;
        }
        if (length == -2) {
            if (available <= 1) {
                return false;
            }
            available -= 2;
            socket.read(0, 2, inboundBuffer.data);
            inboundBuffer.offset = 0;
            length = inboundBuffer.g2();
        }
        if (length > available) {
            return false;
        }
        inboundBuffer.offset = 0;
        socket.read(0, length, inboundBuffer.data);
        Static49.opcode4 = Static5.opcode3;
        Static5.opcode3 = Static230.opcode2;
        Static230.opcode2 = opcode;
        Static201.anInt1862 = 0;
        @Pc(133) int local133;
        if (opcode == ServerProt.VARP_SMALL) {
            local133 = inboundBuffer.g2sub();
            @Pc(137) byte local137 = inboundBuffer.g1neg();
            Static170.method2575(local137, local133);
            opcode = -1;
            return true;
        }
        @Pc(171) int local171;
        @Pc(156) JagString local156;
        if (opcode == ServerProt.RUN_CS2) {
            local133 = inboundBuffer.g2();
            local156 = inboundBuffer.gjstr();
            @Pc(163) Object[] local163 = new Object[local156.length() + 1];
            for (local171 = local156.length() - 1; local171 >= 0; local171--) {
                if (local156.charAt(local171) == 115) {
                    local163[local171 + 1] = inboundBuffer.gjstr();
                } else {
                    local163[local171 + 1] = Integer.valueOf(inboundBuffer.g4());
                }
            }
            local163[0] = Integer.valueOf(inboundBuffer.g4());
            if (setVerifyId(local133)) {
                @Pc(226) HookRequest local226 = new HookRequest();
                local226.arguments = local163;
                Static82.method1767(local226);
            }
            opcode = -1;
            return true;
        }
        @Pc(275) long local275;
        @Pc(262) boolean local262;
        @Pc(277) int local277;
        @Pc(506) JagString local506;
        if (opcode == ServerProt.MESSAGE_GAME) {
            @Pc(245) JagString local245 = inboundBuffer.gjstr();
            if (local245.method3130(Static196.aClass100_863)) {
                local156 = local245.substring(local245.indexOf(Static264.aClass100_875), 0);
                local275 = local156.encode37();
                local262 = false;
                for (local277 = 0; local277 < IgnoreList.size; local277++) {
                    if (IgnoreList.encodedUsernames[local277] == local275) {
                        local262 = true;
                        break;
                    }
                }
                if (!local262 && Player.inTutorialIsland == 0) {
                    Chat.add(local156, 4, LocalizedText.TRADEREQ);
                }
            } else if (local245.method3130(Static61.aClass100_423)) {
                local156 = local245.substring(local245.indexOf(Static264.aClass100_875), 0);
                local275 = local156.encode37();
                local262 = false;
                for (local277 = 0; local277 < IgnoreList.size; local277++) {
                    if (IgnoreList.encodedUsernames[local277] == local275) {
                        local262 = true;
                        break;
                    }
                }
                if (!local262 && Player.inTutorialIsland == 0) {
                    local506 = local245.substring(local245.length() - 9, local245.indexOf(Static264.aClass100_875) + 1);
                    Chat.add(local156, 8, local506);
                }
            } else if (local245.method3130(Static191.aClass100_845)) {
                local262 = false;
                local156 = local245.substring(local245.indexOf(Static264.aClass100_875), 0);
                local275 = local156.encode37();
                for (local277 = 0; local277 < IgnoreList.size; local277++) {
                    if (local275 == IgnoreList.encodedUsernames[local277]) {
                        local262 = true;
                        break;
                    }
                }
                if (!local262 && Player.inTutorialIsland == 0) {
                    Chat.add(local156, 10, JagString.EMPTY);
                }
            } else if (local245.method3130(Static141.aClass100_664)) {
                local156 = local245.substring(local245.indexOf(Static141.aClass100_664), 0);
                Chat.add(JagString.EMPTY, 11, local156);
            } else if (local245.method3130(Static138.aClass100_654)) {
                local156 = local245.substring(local245.indexOf(Static138.aClass100_654), 0);
                if (Player.inTutorialIsland == 0) {
                    Chat.add(JagString.EMPTY, 12, local156);
                }
            } else if (local245.method3130(Static244.aClass100_1014)) {
                local156 = local245.substring(local245.indexOf(Static244.aClass100_1014), 0);
                if (Player.inTutorialIsland == 0) {
                    Chat.add(JagString.EMPTY, 13, local156);
                }
            } else if (local245.method3130(Static56.aClass100_379)) {
                local262 = false;
                local156 = local245.substring(local245.indexOf(Static264.aClass100_875), 0);
                local275 = local156.encode37();
                for (local277 = 0; local277 < IgnoreList.size; local277++) {
                    if (local275 == IgnoreList.encodedUsernames[local277]) {
                        local262 = true;
                        break;
                    }
                }
                if (!local262 && Player.inTutorialIsland == 0) {
                    Chat.add(local156, 14, JagString.EMPTY);
                }
            } else if (local245.method3130(Static112.aClass100_574)) {
                local156 = local245.substring(local245.indexOf(Static264.aClass100_875), 0);
                local262 = false;
                local275 = local156.encode37();
                for (local277 = 0; local277 < IgnoreList.size; local277++) {
                    if (IgnoreList.encodedUsernames[local277] == local275) {
                        local262 = true;
                        break;
                    }
                }
                if (!local262 && Player.inTutorialIsland == 0) {
                    Chat.add(local156, 15, JagString.EMPTY);
                }
            } else if (local245.method3130(Static217.aClass100_916)) {
                local156 = local245.substring(local245.indexOf(Static264.aClass100_875), 0);
                local275 = local156.encode37();
                local262 = false;
                for (local277 = 0; local277 < IgnoreList.size; local277++) {
                    if (local275 == IgnoreList.encodedUsernames[local277]) {
                        local262 = true;
                        break;
                    }
                }
                if (!local262 && Player.inTutorialIsland == 0) {
                    Chat.add(local156, 16, JagString.EMPTY);
                }
            } else if (local245.method3130(Static164.aClass100_770)) {
                local156 = local245.substring(local245.indexOf(Static264.aClass100_875), 0);
                local262 = false;
                local275 = local156.encode37();
                for (local277 = 0; local277 < IgnoreList.size; local277++) {
                    if (IgnoreList.encodedUsernames[local277] == local275) {
                        local262 = true;
                        break;
                    }
                }
                if (!local262 && Player.inTutorialIsland == 0) {
                    local506 = local245.substring(local245.length() - 9, local245.indexOf(Static264.aClass100_875) + 1);
                    Chat.add(local156, 21, local506);
                }
            } else {
                Chat.add(JagString.EMPTY, 0, local245);
            }
            opcode = -1;
            return true;
        }
        @Pc(786) int local786;
        @Pc(790) JagString local790;
        if (opcode == ServerProt.IF_SETTEXT3) {
            local133 = inboundBuffer.g2le();
            local786 = inboundBuffer.g2sub();
            local790 = inboundBuffer.gjstr();
            if (setVerifyId(local786)) {
                DelayedStateChange.method3498(local790, local133);
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.BATCH_LOCATION_PACKET) {
            Static180.anInt4264 = inboundBuffer.g1add();
            Static115.anInt2940 = inboundBuffer.g1ssub();
            while (length > inboundBuffer.offset) {
                opcode = inboundBuffer.g1();
                readLocationPacket();
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.CLEAR_MINIMAP_FLAG) {
            opcode = -1;
            Static115.anInt2939 = 0;
            return true;
        } else {
            @Pc(864) int local864;
            if (opcode == ServerProt.IF_SETSCROLLPOS) {
                local133 = inboundBuffer.p4rme();
                local786 = inboundBuffer.g2le();
                local864 = inboundBuffer.g2();
                if (setVerifyId(local864)) {
                    Static229.method3938(local786, local133);
                }
                opcode = -1;
                return true;
            }
            @Pc(884) long local884;
            @Pc(908) int local908;
            @Pc(916) int local916;
            @Pc(899) long local899;
            @Pc(904) long local904;
            if (opcode == ServerProt.CLAN_QUICK_CHAT) {
                local884 = inboundBuffer.g8();
                inboundBuffer.g1s();
                local275 = inboundBuffer.g8();
                local899 = inboundBuffer.g2();
                local904 = inboundBuffer.g3();
                local908 = inboundBuffer.g1();
                @Pc(910) boolean local910 = false;
                local916 = inboundBuffer.g2();
                @Pc(922) long local922 = (local899 << 32) + local904;
                @Pc(924) int local924 = 0;
                label1320: while (true) {
                    if (local924 < 100) {
                        if (local922 != Static233.aLongArray9[local924]) {
                            local924++;
                            continue;
                        }
                        local910 = true;
                        break;
                    }
                    if (local908 <= 1) {
                        for (local924 = 0; local924 < IgnoreList.size; local924++) {
                            if (IgnoreList.encodedUsernames[local924] == local884) {
                                local910 = true;
                                break label1320;
                            }
                        }
                    }
                    break;
                }
                if (!local910 && Player.inTutorialIsland == 0) {
                    Static233.aLongArray9[Static251.anInt5447] = local922;
                    Static251.anInt5447 = (Static251.anInt5447 + 1) % 100;
                    @Pc(999) JagString local999 = QuickChatPhraseTypeList.get(local916).decodeMessage(inboundBuffer);
                    if (local908 == 2 || local908 == 3) {
                        Chat.add(local916, 20, local999, Base37.decode37(local275).toTitleCase(), JagString.concatenate(new JagString[] { Static44.aClass100_336, Base37.decode37(local884).toTitleCase() }));
                    } else if (local908 == 1) {
                        Chat.add(local916, 20, local999, Base37.decode37(local275).toTitleCase(), JagString.concatenate(new JagString[] { Static65.aClass100_435, Base37.decode37(local884).toTitleCase() }));
                    } else {
                        Chat.add(local916, 20, local999, Base37.decode37(local275).toTitleCase(), Base37.decode37(local884).toTitleCase());
                    }
                }
                opcode = -1;
                return true;
            }
            @Pc(1146) int local1146;
            @Pc(1160) int local1160;
            @Pc(1245) boolean local1245;
            if (opcode == ServerProt.JOIN_CLAN_CHAT) {
                ClanChat.transmitAt = InterfaceList.transmitTimer;
                local884 = inboundBuffer.g8();
                if (local884 == 0L) {
                    ClanChat.owner = null;
                    opcode = -1;
                    ClanChat.name = null;
                    ClanChat.members = null;
                    ClanChat.size = 0;
                    return true;
                }
                local275 = inboundBuffer.g8();
                ClanChat.name = Base37.decode37(local275);
                ClanChat.owner = Base37.decode37(local884);
                ClanChat.minKick = inboundBuffer.g1s();
                local1146 = inboundBuffer.g1();
                if (local1146 == 255) {
                    opcode = -1;
                    return true;
                }
                ClanChat.size = local1146;
                @Pc(1158) Class3_Sub22[] local1158 = new Class3_Sub22[100];
                for (local1160 = 0; local1160 < ClanChat.size; local1160++) {
                    local1158[local1160] = new Class3_Sub22();
                    local1158[local1160].key = inboundBuffer.g8();
                    local1158[local1160].username = Base37.decode37(local1158[local1160].key);
                    local1158[local1160].world = inboundBuffer.g2();
                    local1158[local1160].rank = inboundBuffer.g1s();
                    local1158[local1160].aClass100_635 = inboundBuffer.gjstr();
                    if (Static101.aLong98 == local1158[local1160].key) {
                        ClanChat.rank = local1158[local1160].rank;
                    }
                }
                local908 = ClanChat.size;
                while (local908 > 0) {
                    local1245 = true;
                    local908--;
                    for (local916 = 0; local916 < local908; local916++) {
                        if (local1158[local916].username.method3139(local1158[local916 + 1].username) > 0) {
                            local1245 = false;
                            @Pc(1279) Class3_Sub22 local1279 = local1158[local916];
                            local1158[local916] = local1158[local916 + 1];
                            local1158[local916 + 1] = local1279;
                        }
                    }
                    if (local1245) {
                        break;
                    }
                }
                ClanChat.members = local1158;
                opcode = -1;
                return true;
            } else if (opcode == ServerProt.LAST_LOGIN_INFO) {
                local133 = inboundBuffer.g4rme();
                Static232.aClass212_5 = GameShell.signLink.getReverseDns(local133);
                opcode = -1;
                return true;
            } else if (opcode == ServerProt.PLAYER_INFO) {
                readPlayerInfoPacket();
                opcode = -1;
                return true;
            } else if (opcode == ServerProt.IF_SETTEXT2) {
                local133 = inboundBuffer.g2();
                local156 = inboundBuffer.gjstr();
                local864 = inboundBuffer.g2leadd();
                if (setVerifyId(local133)) {
                    DelayedStateChange.method3498(local156, local864);
                }
                opcode = -1;
                return true;
            } else if (opcode == ServerProt.CHAT_FILTER_SETTINGS) {
                Chat.publicFilter = inboundBuffer.g1();
                Chat.privateFilter = inboundBuffer.g1();
                Chat.tradeFilter = inboundBuffer.g1();
                opcode = -1;
                return true;
            } else {
                @Pc(1409) JagString local1409;
                if (opcode == ServerProt.SET_INTERACTION) {
                    local133 = inboundBuffer.g2leadd();
                    if (local133 == 65535) {
                        local133 = -1;
                    }
                    local786 = inboundBuffer.g1();
                    local864 = inboundBuffer.g1();
                    local1409 = inboundBuffer.gjstr();
                    if (local864 >= 1 && local864 <= 8) {
                        if (local1409.equalsIgnoreCase(Static92.aClass100_510)) {
                            local1409 = null;
                        }
                        Static160.aClass100Array121[local864 - 1] = local1409;
                        Static191.anIntArray388[local864 - 1] = local133;
                        Static1.aBooleanArray1[local864 - 1] = local786 == 0;
                    }
                    opcode = -1;
                    return true;
                } else if (opcode == ServerProt.VARP_LARGE) {
                    local133 = inboundBuffer.g4();
                    local786 = inboundBuffer.g2sub();
                    Static170.method2575(local133, local786);
                    opcode = -1;
                    return true;
                } else if (opcode == ServerProt.IF_SETHIDE) {
                    local133 = inboundBuffer.p1neg();
                    local786 = inboundBuffer.g2();
                    local864 = inboundBuffer.g4me();
                    if (setVerifyId(local786)) {
                        DelayedStateChange.method2905(local864, local133);
                    }
                    opcode = -1;
                    return true;
                } else if (opcode == ServerProt.IF_OPENSUB) {
                    local133 = inboundBuffer.g2leadd();
                    local786 = inboundBuffer.g1add();
                    local864 = inboundBuffer.g2leadd();
                    if (setVerifyId(local864)) {
                        if (local786 == 2) {
                            Static5.method34();
                        }
                        InterfaceList.topLevelInterface = local133;
                        Static81.method1753(local133);
                        Static210.method3712(false);
                        Static74.method1626(InterfaceList.topLevelInterface);
                        for (local171 = 0; local171 < 100; local171++) {
                            Static186.aBooleanArray100[local171] = true;
                        }
                    }
                    opcode = -1;
                    return true;
                } else if (opcode == ServerProt.CLIENT_SETVARC_LARGE) {
                    local133 = inboundBuffer.g2leadd();
                    local786 = inboundBuffer.g4();
                    local864 = inboundBuffer.g2sub();
                    if (setVerifyId(local133)) {
                        DelayedStateChange.method2606(local864, local786);
                    }
                    opcode = -1;
                    return true;
                } else if (opcode == ServerProt.MESSAGE_QUICKCHAT_PRIVATE_ECHO) {
                    local884 = inboundBuffer.g8();
                    local864 = inboundBuffer.g2();
                    local1409 = QuickChatPhraseTypeList.get(local864).decodeMessage(inboundBuffer);
                    Chat.add(local864, 19, local1409, null, Base37.decode37(local884).toTitleCase());
                    opcode = -1;
                    return true;
                } else if (opcode == ServerProt.UPDATE_UID192) {
                    Static271.method4598(inboundBuffer);
                    opcode = -1;
                    return true;
                } else if (opcode == ServerProt.RESET_CLIENT_VARCACHE) {
                    Static8.method121();
                    InterfaceList.method2245();
                    VarpDomain.updatedVarpsWriterIndex += 32;
                    opcode = -1;
                    return true;
                } else if (opcode == ServerProt.CAM_LOOKAT) {
                    local133 = inboundBuffer.g2();
                    local786 = inboundBuffer.g1();
                    local864 = inboundBuffer.g1();
                    local171 = inboundBuffer.g2();
                    local1146 = inboundBuffer.g1();
                    local277 = inboundBuffer.g1();
                    if (setVerifyId(local133)) {
                        Static260.method3849(local171, local864, local1146, local786, local277);
                    }
                    opcode = -1;
                    return true;
                } else if (opcode == ServerProt.IF_SETANIM) {
                    local133 = inboundBuffer.p4rme();
                    local786 = inboundBuffer.g2les();
                    local864 = inboundBuffer.g2sub();
                    if (setVerifyId(local864)) {
                        DelayedStateChange.method3893(local133, local786);
                    }
                    opcode = -1;
                    return true;
                } else {
                    @Pc(1814) ServerActiveProperties local1814;
                    @Pc(1804) ServerActiveProperties local1804;
                    if (opcode == ServerProt.WIDGETSTRUCT_SETTING) {
                        local133 = inboundBuffer.g2leadd();
                        local786 = inboundBuffer.g4me();
                        local864 = inboundBuffer.g2sub();
                        local171 = inboundBuffer.g2le();
                        if (local171 == 65535) {
                            local171 = -1;
                        }
                        local1146 = inboundBuffer.g2sub();
                        if (local1146 == 65535) {
                            local1146 = -1;
                        }
                        if (setVerifyId(local864)) {
                            for (local277 = local1146; local277 <= local171; local277++) {
                                local904 = (long) local277 + ((long) local786 << 32);
                                local1804 = (ServerActiveProperties) Static210.aClass133_21.get(local904);
                                if (local1804 != null) {
                                    local1814 = new ServerActiveProperties(local1804.anInt546, local133);
                                    local1804.unlink();
                                } else if (local277 == -1) {
                                    local1814 = new ServerActiveProperties(InterfaceList.getComponent(local786).aClass3_Sub4_1.anInt546, local133);
                                } else {
                                    local1814 = new ServerActiveProperties(0, local133);
                                }
                                Static210.aClass133_21.put(local1814, local904);
                            }
                        }
                        opcode = -1;
                        return true;
                    }
                    @Pc(1986) int local1986;
                    if (opcode == ServerProt.SPOTANIM_SPECIFIC) {
                        local133 = inboundBuffer.g2();
                        local786 = inboundBuffer.g2le();
                        local864 = inboundBuffer.g4rme();
                        local171 = inboundBuffer.g2leadd();
                        if (local864 >> 30 == 0) {
                            @Pc(1994) SeqType local1994;
                            if (local864 >> 29 != 0) {
                                local1146 = local864 & 0xFFFF;
                                @Pc(1894) Npc local1894 = NpcList.npcs[local1146];
                                if (local1894 != null) {
                                    if (local171 == 65535) {
                                        local171 = -1;
                                    }
                                    local1245 = true;
                                    if (local171 != -1 && local1894.spotAnimId != -1 && SeqTypeList.get(SpotAnimTypeList.get(local171).seqId).anInt5355 < SeqTypeList.get(SpotAnimTypeList.get(local1894.spotAnimId).seqId).anInt5355) {
                                        local1245 = false;
                                    }
                                    if (local1245) {
                                        local1894.anInt3361 = 0;
                                        local1894.spotAnimId = local171;
                                        local1894.spotAnimStart = client.loop + local133;
                                        local1894.anInt3399 = 0;
                                        if (local1894.spotAnimStart > client.loop) {
                                            local1894.anInt3399 = -1;
                                        }
                                        local1894.spotAnimY = local786;
                                        local1894.anInt3418 = 1;
                                        if (local1894.spotAnimId != -1 && client.loop == local1894.spotAnimStart) {
                                            local1986 = SpotAnimTypeList.get(local1894.spotAnimId).seqId;
                                            if (local1986 != -1) {
                                                local1994 = SeqTypeList.get(local1986);
                                                if (local1994 != null && local1994.frames != null) {
                                                    SoundPlayer.playSeqSound(local1894.zFine, local1994, local1894.xFine, false, 0);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (local864 >> 28 != 0) {
                                local1146 = local864 & 0xFFFF;
                                @Pc(2033) Player local2033;
                                if (PlayerList.selfId == local1146) {
                                    local2033 = PlayerList.self;
                                } else {
                                    local2033 = PlayerList.players[local1146];
                                }
                                if (local2033 != null) {
                                    if (local171 == 65535) {
                                        local171 = -1;
                                    }
                                    local1245 = true;
                                    if (local171 != -1 && local2033.spotAnimId != -1 && SeqTypeList.get(SpotAnimTypeList.get(local171).seqId).anInt5355 < SeqTypeList.get(SpotAnimTypeList.get(local2033.spotAnimId).seqId).anInt5355) {
                                        local1245 = false;
                                    }
                                    if (local1245) {
                                        local2033.spotAnimStart = local133 + client.loop;
                                        local2033.spotAnimY = local786;
                                        local2033.spotAnimId = local171;
                                        if (local2033.spotAnimId == 65535) {
                                            local2033.spotAnimId = -1;
                                        }
                                        local2033.anInt3418 = 1;
                                        local2033.anInt3361 = 0;
                                        local2033.anInt3399 = 0;
                                        if (local2033.spotAnimStart > client.loop) {
                                            local2033.anInt3399 = -1;
                                        }
                                        if (local2033.spotAnimId != -1 && local2033.spotAnimStart == client.loop) {
                                            local1986 = SpotAnimTypeList.get(local2033.spotAnimId).seqId;
                                            if (local1986 != -1) {
                                                local1994 = SeqTypeList.get(local1986);
                                                if (local1994 != null && local1994.frames != null) {
                                                    SoundPlayer.playSeqSound(local2033.zFine, local1994, local2033.xFine, local2033 == PlayerList.self, 0);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            local1146 = local864 >> 28 & 0x3;
                            local277 = (local864 >> 14 & 0x3FFF) - Static225.originX;
                            local1160 = (local864 & 0x3FFF) - Static142.originZ;
                            if (local277 >= 0 && local1160 >= 0 && local277 < 104 && local1160 < 104) {
                                local1160 = local1160 * 128 + 64;
                                local277 = local277 * 128 + 64;
                                @Pc(2241) SpotAnim local2241 = new SpotAnim(local171, local1146, local277, local1160, SceneGraph.getTileHeight(local1146, local277, local1160) - local786, local133, client.loop);
                                Static99.aClass69_64.addTail(new SpotAnimNode(local2241));
                            }
                        }
                        opcode = -1;
                        return true;
                    } else if (opcode == ServerProt.INTERFACE_ANIMATE_ROTATE) {
                        local133 = inboundBuffer.p4rme();
                        local786 = inboundBuffer.g2sub();
                        local864 = inboundBuffer.g2();
                        local171 = inboundBuffer.g2sub();
                        if (setVerifyId(local786)) {
                            DelayedStateChange.setComponentModelRotationSpeedServer(local171 + (local864 << 16), local133);
                        }
                        opcode = -1;
                        return true;
                    } else if (opcode == ServerProt.UPDATE_STAT) {
                        InterfaceList.method2245();
                        local133 = inboundBuffer.g1add();
                        local786 = inboundBuffer.g4rme();
                        local864 = inboundBuffer.g1();
                        PlayerSkillXpTable.experience[local864] = local786;
                        PlayerSkillXpTable.boostedLevels[local864] = local133;
                        PlayerSkillXpTable.baseLevels[local864] = 1;
                        for (local171 = 0; local171 < 98; local171++) {
                            if (ObjType.anIntArray213[local171] <= local786) {
                                PlayerSkillXpTable.baseLevels[local864] = local171 + 2;
                            }
                        }
                        PlayerSkillXpTable.updatedStats[PlayerSkillXpTable.updatedStatsWriterIndex++ & 0x1F] = local864;
                        opcode = -1;
                        return true;
                    } else if (opcode == ServerProt.LOCATION_PACKET_104 || opcode == ServerProt.LOCATION_PACKET_121 || opcode == ServerProt.LOCATION_PACKET_97 || opcode == ServerProt.LOCATION_PACKET_14 || opcode == ServerProt.LOCATION_PACKET_202 || opcode == ServerProt.LOCATION_PACKET_135 || opcode == ServerProt.LOCATION_PACKET_17 || opcode == ServerProt.LOCATION_PACKET_16 || opcode == ServerProt.LOCATION_PACKET_240 || opcode == ServerProt.LOCATION_PACKET_33 || opcode == ServerProt.LOCATION_PACKET_20 || opcode == ServerProt.LOCATION_PACKET_195 || opcode == ServerProt.LOCATION_PACKET_179) {
                        readLocationPacket();
                        opcode = -1;
                        return true;
                    } else if (opcode == ServerProt.IF_CLOSESUB) {
                        local133 = inboundBuffer.g2();
                        local786 = inboundBuffer.g4();
                        if (setVerifyId(local133)) {
                            @Pc(2441) Class3_Sub31 local2441 = (Class3_Sub31) Static119.aClass133_9.get((long) local786);
                            if (local2441 != null) {
                                Static132.method2605(true, local2441);
                            }
                            if (Static39.aClass13_10 != null) {
                                Static43.redraw(Static39.aClass13_10);
                                Static39.aClass13_10 = null;
                            }
                        }
                        opcode = -1;
                        return true;
                    } else if (opcode == ServerProt.CAM_FORCEANGLE) {
                        local133 = inboundBuffer.g2le();
                        local786 = inboundBuffer.g2();
                        local864 = inboundBuffer.g2();
                        if (setVerifyId(local786)) {
                            Camera.yawTarget = local133;
                            Camera.pitchTarget = local864;
                            if (Static227.cameraType == 2) {
                                Static240.cameraPitch = (int)Camera.pitchTarget;
                                Static184.cameraYaw = (int)Camera.yawTarget;
                            }
                            Camera.clampCameraAngle();
                        }
                        opcode = -1;
                        return true;
                    } else if (opcode == ServerProt.IF_SETANGLE) {
                        local133 = inboundBuffer.g2();
                        local786 = inboundBuffer.g2sub();
                        local864 = inboundBuffer.g2leadd();
                        local171 = inboundBuffer.g2leadd();
                        local1146 = inboundBuffer.g4();
                        if (setVerifyId(local786)) {
                            DelayedStateChange.method4505(local864, local1146, local171, local133);
                        }
                        opcode = -1;
                        return true;
                    } else if (opcode == ServerProt.CLEAR_GROUND_ITEMS) {
                        Static115.anInt2940 = inboundBuffer.g1();
                        Static180.anInt4264 = inboundBuffer.p1neg();
                        for (local133 = Static115.anInt2940; local133 < Static115.anInt2940 + 8; local133++) {
                            for (local786 = Static180.anInt4264; local786 < Static180.anInt4264 + 8; local786++) {
                                if (Static159.aClass69ArrayArrayArray1[Player.level][local133][local786] != null) {
                                    Static159.aClass69ArrayArrayArray1[Player.level][local133][local786] = null;
                                    Static220.spawnGroundObject(local786, local133);
                                }
                            }
                        }
                        for (@Pc(2604) Class3_Sub7 local2604 = (Class3_Sub7) Static26.aClass69_27.method2289(); local2604 != null; local2604 = (Class3_Sub7) Static26.aClass69_27.method2288()) {
                            if (local2604.anInt928 >= Static115.anInt2940 && Static115.anInt2940 + 8 > local2604.anInt928 && local2604.anInt916 >= Static180.anInt4264 && local2604.anInt916 < Static180.anInt4264 + 8 && local2604.anInt918 == Player.level) {
                                local2604.anInt924 = 0;
                            }
                        }
                        opcode = -1;
                        return true;
                    } else if (opcode == ServerProt.INTERFACE_ITEMS_CLEAR) {
                        local133 = inboundBuffer.p4rme();
                        @Pc(2666) Component local2666 = InterfaceList.getComponent(local133);
                        for (local864 = 0; local864 < local2666.objTypes.length; local864++) {
                            local2666.objTypes[local864] = -1;
                            local2666.objTypes[local864] = 0;
                        }
                        Static43.redraw(local2666);
                        opcode = -1;
                        return true;
                    } else if (opcode == ServerProt.IF_SETMODEL) {
                        local133 = inboundBuffer.g4me();
                        local786 = inboundBuffer.g2leadd();
                        local864 = inboundBuffer.g2sub();
                        if (local864 == 65535) {
                            local864 = -1;
                        }
                        if (setVerifyId(local786)) {
                            DelayedStateChange.method2607(-1, 1, local133, local864);
                        }
                        opcode = -1;
                        return true;
                    } else if (opcode == ServerProt.SET_MINIMAP_STATE) {
                        Static270.anInt5795 = inboundBuffer.g1();
                        opcode = -1;
                        return true;
                    } else if (opcode == ServerProt.TELEPORT_LOCAL_PLAYER) {
                        local133 = inboundBuffer.g1ssub();
                        local786 = inboundBuffer.g1add();
                        local864 = inboundBuffer.g1();
                        Player.level = local786 >> 1;
                        PlayerList.self.teleport(local133, (local786 & 0x1) == 1, local864);
                        opcode = -1;
                        return true;
                    } else {
                        @Pc(3002) int local3002;
                        @Pc(3038) JagString local3038;
                        @Pc(3020) JagString local3020;
                        if (opcode == ServerProt.UPDATE_FRIENDLIST) {
                            local884 = inboundBuffer.g8();
                            local864 = inboundBuffer.g2();
                            local171 = inboundBuffer.g1();
                            local262 = true;
                            if (local884 < 0L) {
                                local884 &= Long.MAX_VALUE;
                                local262 = false;
                            }
                            local506 = JagString.EMPTY;
                            if (local864 > 0) {
                                local506 = inboundBuffer.gjstr();
                            }
                            @Pc(2834) JagString local2834 = Base37.decode37(local884).toTitleCase();
                            for (local1986 = 0; local1986 < FriendsList.size; local1986++) {
                                if (local884 == FriendsList.encodedUsernames[local1986]) {
                                    if (local864 != FriendsList.worlds[local1986]) {
                                        FriendsList.worlds[local1986] = local864;
                                        if (local864 > 0) {
                                            Chat.add(JagString.EMPTY, 5, JagString.concatenate(new JagString[] { local2834, LocalizedText.FRIENDLOGIN}));
                                        }
                                        if (local864 == 0) {
                                            Chat.add(JagString.EMPTY, 5, JagString.concatenate(new JagString[] { local2834, LocalizedText.FRIENDLOGOUT}));
                                        }
                                    }
                                    FriendsList.worldNames[local1986] = local506;
                                    FriendsList.ranks[local1986] = local171;
                                    local2834 = null;
                                    Static3.aBooleanArray135[local1986] = local262;
                                    break;
                                }
                            }
                            if (local2834 != null && FriendsList.size < 200) {
                                FriendsList.encodedUsernames[FriendsList.size] = local884;
                                FriendsList.usernames[FriendsList.size] = local2834;
                                FriendsList.worlds[FriendsList.size] = local864;
                                FriendsList.worldNames[FriendsList.size] = local506;
                                FriendsList.ranks[FriendsList.size] = local171;
                                Static3.aBooleanArray135[FriendsList.size] = local262;
                                FriendsList.size++;
                            }
                            FriendsList.transmitAt = InterfaceList.transmitTimer;
                            local908 = FriendsList.size;
                            while (local908 > 0) {
                                local908--;
                                @Pc(2961) boolean local2961 = true;
                                for (local916 = 0; local916 < local908; local916++) {
                                    if (FriendsList.worlds[local916] != Player.worldId && Player.worldId == FriendsList.worlds[local916 + 1] || FriendsList.worlds[local916] == 0 && FriendsList.worlds[local916 + 1] != 0) {
                                        local2961 = false;
                                        local3002 = FriendsList.worlds[local916];
                                        FriendsList.worlds[local916] = FriendsList.worlds[local916 + 1];
                                        FriendsList.worlds[local916 + 1] = local3002;
                                        local3020 = FriendsList.worldNames[local916];
                                        FriendsList.worldNames[local916] = FriendsList.worldNames[local916 + 1];
                                        FriendsList.worldNames[local916 + 1] = local3020;
                                        local3038 = FriendsList.usernames[local916];
                                        FriendsList.usernames[local916] = FriendsList.usernames[local916 + 1];
                                        FriendsList.usernames[local916 + 1] = local3038;
                                        @Pc(3056) long local3056 = FriendsList.encodedUsernames[local916];
                                        FriendsList.encodedUsernames[local916] = FriendsList.encodedUsernames[local916 + 1];
                                        FriendsList.encodedUsernames[local916 + 1] = local3056;
                                        @Pc(3074) int local3074 = FriendsList.ranks[local916];
                                        FriendsList.ranks[local916] = FriendsList.ranks[local916 + 1];
                                        FriendsList.ranks[local916 + 1] = local3074;
                                        @Pc(3092) boolean local3092 = Static3.aBooleanArray135[local916];
                                        Static3.aBooleanArray135[local916] = Static3.aBooleanArray135[local916 + 1];
                                        Static3.aBooleanArray135[local916 + 1] = local3092;
                                    }
                                }
                                if (local2961) {
                                    break;
                                }
                            }
                            opcode = -1;
                            return true;
                        } else if (opcode == ServerProt.SET_WALK_TEXT) {
                            if (length == 0) {
                                Static195.aClass100_859 = LocalizedText.WALKHERE;
                            } else {
                                Static195.aClass100_859 = inboundBuffer.gjstr();
                            }
                            opcode = -1;
                            return true;
                        } else if (opcode == ServerProt.FORCE_VARP_REFRESH) {
                            for (local133 = 0; local133 < Static7.varps.length; local133++) {
                                if (Static106.anIntArray257[local133] != Static7.varps[local133]) {
                                    Static7.varps[local133] = Static106.anIntArray257[local133];
                                    Static85.method1775(local133);
                                    VarpDomain.updatedVarps[VarpDomain.updatedVarpsWriterIndex++ & 0x1F] = local133;
                                }
                            }
                            opcode = -1;
                            return true;
                        } else if (opcode == ServerProt.CAMERA_DETACH) {
                            local133 = inboundBuffer.g2();
                            local786 = inboundBuffer.g1();
                            local864 = inboundBuffer.g1();
                            local171 = inboundBuffer.g2();
                            local1146 = inboundBuffer.g1();
                            local277 = inboundBuffer.g1();
                            if (setVerifyId(local133)) {
                                Static141.method2722(true, local1146, local171, local277, local864, local786);
                            }
                            opcode = -1;
                            return true;
                        } else if (opcode == ServerProt.MESSAGE_QUICKCHAT_PRIVATE) {
                            local884 = inboundBuffer.g8();
                            local275 = inboundBuffer.g2();
                            local899 = inboundBuffer.g3();
                            local1160 = inboundBuffer.g1();
                            local1986 = inboundBuffer.g2();
                            @Pc(3263) boolean local3263 = false;
                            @Pc(3270) long local3270 = (local275 << 32) + local899;
                            @Pc(3272) int local3272 = 0;
                            label1402: while (true) {
                                if (local3272 < 100) {
                                    if (local3270 != Static233.aLongArray9[local3272]) {
                                        local3272++;
                                        continue;
                                    }
                                    local3263 = true;
                                    break;
                                }
                                if (local1160 <= 1) {
                                    for (local3272 = 0; local3272 < IgnoreList.size; local3272++) {
                                        if (local884 == IgnoreList.encodedUsernames[local3272]) {
                                            local3263 = true;
                                            break label1402;
                                        }
                                    }
                                }
                                break;
                            }
                            if (!local3263 && Player.inTutorialIsland == 0) {
                                Static233.aLongArray9[Static251.anInt5447] = local3270;
                                Static251.anInt5447 = (Static251.anInt5447 + 1) % 100;
                                local3020 = QuickChatPhraseTypeList.get(local1986).decodeMessage(inboundBuffer);
                                if (local1160 == 2) {
                                    Chat.add(local1986, 18, local3020, null, JagString.concatenate(new JagString[] { Static44.aClass100_336, Base37.decode37(local884).toTitleCase() }));
                                } else if (local1160 == 1) {
                                    Chat.add(local1986, 18, local3020, null, JagString.concatenate(new JagString[] { Static65.aClass100_435, Base37.decode37(local884).toTitleCase() }));
                                } else {
                                    Chat.add(local1986, 18, local3020, null, Base37.decode37(local884).toTitleCase());
                                }
                            }
                            opcode = -1;
                            return true;
                        } else {
                            @Pc(3456) Class3_Sub31 local3456;
                            if (opcode == ServerProt.SWITCH_WIDGET) {
                                local133 = inboundBuffer.g4rme();
                                local786 = inboundBuffer.g2sub();
                                local864 = inboundBuffer.g4rme();
                                if (setVerifyId(local786)) {
                                    @Pc(3449) Class3_Sub31 local3449 = (Class3_Sub31) Static119.aClass133_9.get((long) local133);
                                    local3456 = (Class3_Sub31) Static119.aClass133_9.get((long) local864);
                                    if (local3456 != null) {
                                        Static132.method2605(local3449 == null || local3456.anInt5878 != local3449.anInt5878, local3456);
                                    }
                                    if (local3449 != null) {
                                        local3449.unlink();
                                        Static119.aClass133_9.put(local3449, (long) local864);
                                    }
                                    @Pc(3490) Component local3490 = InterfaceList.getComponent(local133);
                                    if (local3490 != null) {
                                        Static43.redraw(local3490);
                                    }
                                    local3490 = InterfaceList.getComponent(local864);
                                    if (local3490 != null) {
                                        Static43.redraw(local3490);
                                        Static17.method531(local3490, true);
                                    }
                                    if (InterfaceList.topLevelInterface != -1) {
                                        Static54.method1304(1, InterfaceList.topLevelInterface);
                                    }
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.CAM_SHAKE) {
                                local133 = inboundBuffer.g2();
                                local786 = inboundBuffer.g1();
                                local864 = inboundBuffer.g1();
                                local171 = inboundBuffer.g1();
                                local1146 = inboundBuffer.g1();
                                local277 = inboundBuffer.g2();
                                if (setVerifyId(local133)) {
                                    Static176.aBooleanArray95[local786] = true;
                                    Static222.anIntArray437[local786] = local864;
                                    Static276.anIntArray564[local786] = local171;
                                    Static202.anIntArray424[local786] = local1146;
                                    Static31.anIntArray76[local786] = local277;
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.IF_SETCOLOUR) {
                                local133 = inboundBuffer.g4rme();
                                local786 = inboundBuffer.g2sub();
                                local864 = inboundBuffer.g2leadd();
                                if (setVerifyId(local786)) {
                                    DelayedStateChange.method2649(local864, local133);
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.UPDATE_REBOOT_TIMER) {
                                Player.rebootTimer = inboundBuffer.g2() * 30;
                                opcode = -1;
                                InterfaceList.miscTransmitAt = InterfaceList.transmitTimer;
                                return true;
                            } else if (opcode == ServerProt.REFLECTION_CHEAT_CHECK) {
                                Static202.method3654(GameShell.signLink, inboundBuffer, length);
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.CLIENT_SETVARC_SMALL) {
                                local133 = inboundBuffer.g2le();
                                local786 = inboundBuffer.p1neg();
                                local864 = inboundBuffer.g2leadd();
                                if (setVerifyId(local133)) {
                                    DelayedStateChange.method2606(local864, local786);
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.UPDATE_RUNENERGY) {
                                InterfaceList.method2245();
                                Player.runEnergy = inboundBuffer.g1();
                                InterfaceList.miscTransmitAt = InterfaceList.transmitTimer;
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.GAME_FRAME_UNK) {
                                if (InterfaceList.topLevelInterface != -1) {
                                    Static54.method1304(0, InterfaceList.topLevelInterface);
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.DELETE_INVENTORY) {
                                local133 = inboundBuffer.g2le();
                                Static13.method472(local133);
                                Inv.updatedInventories[Static111.updatedInventoriesWriterIndex++ & 0x1F] = local133 & 0x7FFF;
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.NPC_ANIM_SPECIFIC) {
                                local133 = inboundBuffer.g2le();
                                local786 = inboundBuffer.g1ssub();
                                local864 = inboundBuffer.g2();
                                @Pc(3766) Npc local3766 = NpcList.npcs[local133];
                                if (local3766 != null) {
                                    Static223.method3855(local786, local864, local3766);
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.UPDATE_RUNWEIGHT) {
                                InterfaceList.method2245();
                                Player.weight = inboundBuffer.g2s();
                                InterfaceList.miscTransmitAt = InterfaceList.transmitTimer;
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.MESSAGE_PRIVATE_ECHO) {
                                local884 = inboundBuffer.g8();
                                local790 = Font.escape(Static65.formatChatMessage(inboundBuffer).encodeMessage());
                                Chat.add(Base37.decode37(local884).toTitleCase(), 6, local790);
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.URL_OPEN) {
                                if (GameShell.fullScreenFrame != null) {
                                    Static241.setWindowMode(false, Preferences.favoriteWorlds, -1, -1);
                                }
                                @Pc(3848) byte[] local3848 = new byte[length];
                                inboundBuffer.method2237(local3848, length);
                                local156 = Static10.decodeString(local3848, length, 0);
                                if (GameShell.frame == null && (SignLink.anInt5928 == 3 || !SignLink.osName.startsWith("win") || client.haveIe6)) {
                                    Static169.openUrl(local156, true);
                                } else {
                                    Static175.url = local156;
                                    Static164.newTab = true;
                                    Static33.openUrlRequest = GameShell.signLink.openUrl(new String(local156.method3148(), "ISO-8859-1"));
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.GENERATE_CHAT_HEAD_FROM_BODY) {
                                local133 = inboundBuffer.g2sub();
                                local786 = inboundBuffer.p4rme();
                                local864 = inboundBuffer.g2leadd();
                                local171 = inboundBuffer.g2le();
                                local1146 = inboundBuffer.g2leadd();
                                if (setVerifyId(local133)) {
                                    DelayedStateChange.method2607(local864, 7, local786, local171 << 16 | local1146);
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.VARBIT_SMALL) {
                                local133 = inboundBuffer.g1add();
                                local786 = inboundBuffer.g2le();
                                Static272.method3995(local133, local786);
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.IF_OPENTOP) {
                                local133 = inboundBuffer.g1();
                                local786 = inboundBuffer.p4rme();
                                local864 = inboundBuffer.g2sub();
                                local171 = inboundBuffer.g2();
                                if (setVerifyId(local864)) {
                                    local3456 = (Class3_Sub31) Static119.aClass133_9.get((long) local786);
                                    if (local3456 != null) {
                                        Static132.method2605(local3456.anInt5878 != local171, local3456);
                                    }
                                    Static44.method1148(local171, local786, local133);
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.RESET_ANIMS) {
                                for (local133 = 0; local133 < PlayerList.players.length; local133++) {
                                    if (PlayerList.players[local133] != null) {
                                        PlayerList.players[local133].seqId = -1;
                                    }
                                }
                                for (local133 = 0; local133 < NpcList.npcs.length; local133++) {
                                    if (NpcList.npcs[local133] != null) {
                                        NpcList.npcs[local133].seqId = -1;
                                    }
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.HINT_ARROW) {
                                local133 = inboundBuffer.g1();
                                @Pc(4084) Class102 local4084 = new Class102();
                                local786 = local133 >> 6;
                                local4084.anInt4058 = local133 & 0x3F;
                                local4084.anInt4048 = inboundBuffer.g1();
                                if (local4084.anInt4048 >= 0 && local4084.anInt4048 < Sprites.headhints.length) {
                                    if (local4084.anInt4058 == 1 || local4084.anInt4058 == 10) {
                                        local4084.anInt4057 = inboundBuffer.g2();
                                        inboundBuffer.offset += 3;
                                    } else if (local4084.anInt4058 >= 2 && local4084.anInt4058 <= 6) {
                                        if (local4084.anInt4058 == 2) {
                                            local4084.anInt4045 = 64;
                                            local4084.anInt4047 = 64;
                                        }
                                        if (local4084.anInt4058 == 3) {
                                            local4084.anInt4045 = 0;
                                            local4084.anInt4047 = 64;
                                        }
                                        if (local4084.anInt4058 == 4) {
                                            local4084.anInt4045 = 128;
                                            local4084.anInt4047 = 64;
                                        }
                                        if (local4084.anInt4058 == 5) {
                                            local4084.anInt4045 = 64;
                                            local4084.anInt4047 = 0;
                                        }
                                        if (local4084.anInt4058 == 6) {
                                            local4084.anInt4045 = 64;
                                            local4084.anInt4047 = 128;
                                        }
                                        local4084.anInt4058 = 2;
                                        local4084.anInt4053 = inboundBuffer.g2();
                                        local4084.anInt4046 = inboundBuffer.g2();
                                        local4084.anInt4050 = inboundBuffer.g1();
                                    }
                                    local4084.anInt4052 = inboundBuffer.g2();
                                    if (local4084.anInt4052 == 65535) {
                                        local4084.anInt4052 = -1;
                                    }
                                    Static143.aClass102Array1[local786] = local4084;
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.UPDATE_IGNORELIST) {
                                IgnoreList.size = length / 8;
                                for (local133 = 0; local133 < IgnoreList.size; local133++) {
                                    IgnoreList.encodedUsernames[local133] = inboundBuffer.g8();
                                    Static193.aClass100Array134[local133] = Base37.decode37(IgnoreList.encodedUsernames[local133]);
                                }
                                FriendsList.transmitAt = InterfaceList.transmitTimer;
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.NPC_INFO) {
                                method1800();
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.IF_SETPOSITION) {
                                local133 = inboundBuffer.g2sub();
                                local786 = inboundBuffer.g4me();
                                local864 = inboundBuffer.g2s();
                                local171 = inboundBuffer.g2sadd();
                                if (setVerifyId(local133)) {
                                    DelayedStateChange.method4666(local864, local786, local171);
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.LOC_ANIM_SPECIFIC) {
                                local133 = inboundBuffer.g1ssub();
                                local786 = local133 >> 2;
                                local864 = local133 & 0x3;
                                local171 = Static133.anIntArray453[local786];
                                local1146 = inboundBuffer.g2();
                                local277 = inboundBuffer.g4();
                                if (local1146 == 65535) {
                                    local1146 = -1;
                                }
                                local908 = local277 & 0x3FFF;
                                local1986 = local277 >> 14 & 0x3FFF;
                                local1986 -= Static225.originX;
                                local908 -= Static142.originZ;
                                local1160 = local277 >> 28 & 0x3;
                                Static92.method1881(local1160, local864, local786, local908, local171, local1986, local1146);
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.MESSAGE_PRIVATE) {
                                local884 = inboundBuffer.g8();
                                local275 = inboundBuffer.g2();
                                local899 = inboundBuffer.g3();
                                local1160 = inboundBuffer.g1();
                                @Pc(4425) boolean local4425 = false;
                                @Pc(4431) long local4431 = local899 + (local275 << 32);
                                local3002 = 0;
                                label1450: while (true) {
                                    if (local3002 >= 100) {
                                        if (local1160 <= 1) {
                                            if (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat) {
                                                local4425 = true;
                                            } else {
                                                for (local3002 = 0; local3002 < IgnoreList.size; local3002++) {
                                                    if (local884 == IgnoreList.encodedUsernames[local3002]) {
                                                        local4425 = true;
                                                        break label1450;
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    if (local4431 == Static233.aLongArray9[local3002]) {
                                        local4425 = true;
                                        break;
                                    }
                                    local3002++;
                                }
                                if (!local4425 && Player.inTutorialIsland == 0) {
                                    Static233.aLongArray9[Static251.anInt5447] = local4431;
                                    Static251.anInt5447 = (Static251.anInt5447 + 1) % 100;
                                    @Pc(4518) JagString local4518 = Font.escape(Static65.formatChatMessage(inboundBuffer).encodeMessage());
                                    if (local1160 == 2 || local1160 == 3) {
                                        Chat.add(JagString.concatenate(new JagString[] { Static44.aClass100_336, Base37.decode37(local884).toTitleCase() }), 7, local4518);
                                    } else if (local1160 == 1) {
                                        Chat.add(JagString.concatenate(new JagString[] { Static65.aClass100_435, Base37.decode37(local884).toTitleCase() }), 7, local4518);
                                    } else {
                                        Chat.add(Base37.decode37(local884).toTitleCase(), 3, local4518);
                                    }
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.MESSAGE_CLANCHANNEL) {
                                local884 = inboundBuffer.g8();
                                inboundBuffer.g1s();
                                local275 = inboundBuffer.g8();
                                local899 = inboundBuffer.g2();
                                local904 = inboundBuffer.g3();
                                @Pc(4626) long local4626 = (local899 << 32) + local904;
                                local908 = inboundBuffer.g1();
                                @Pc(4632) boolean local4632 = false;
                                @Pc(4634) int local4634 = 0;
                                label1575: while (true) {
                                    if (local4634 >= 100) {
                                        if (local908 <= 1) {
                                            if (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat) {
                                                local4632 = true;
                                            } else {
                                                for (local4634 = 0; local4634 < IgnoreList.size; local4634++) {
                                                    if (IgnoreList.encodedUsernames[local4634] == local884) {
                                                        local4632 = true;
                                                        break label1575;
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    if (Static233.aLongArray9[local4634] == local4626) {
                                        local4632 = true;
                                        break;
                                    }
                                    local4634++;
                                }
                                if (!local4632 && Player.inTutorialIsland == 0) {
                                    Static233.aLongArray9[Static251.anInt5447] = local4626;
                                    Static251.anInt5447 = (Static251.anInt5447 + 1) % 100;
                                    local3038 = Font.escape(Static65.formatChatMessage(inboundBuffer).encodeMessage());
                                    if (local908 == 2 || local908 == 3) {
                                        Static73.method1598(local3038, JagString.concatenate(new JagString[] { Static44.aClass100_336, Base37.decode37(local884).toTitleCase() }), Base37.decode37(local275).toTitleCase());
                                    } else if (local908 == 1) {
                                        Static73.method1598(local3038, JagString.concatenate(new JagString[] { Static65.aClass100_435, Base37.decode37(local884).toTitleCase() }), Base37.decode37(local275).toTitleCase());
                                    } else {
                                        Static73.method1598(local3038, Base37.decode37(local884).toTitleCase(), Base37.decode37(local275).toTitleCase());
                                    }
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.DYNAMIC_SCENE_GRAPH) {
                                readRebuildPacket(true);
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.SYNTH_SOUND) {
                                local133 = inboundBuffer.g2();
                                local786 = inboundBuffer.g1();
                                if (local133 == 65535) {
                                    local133 = -1;
                                }
                                local864 = inboundBuffer.g2();
                                SoundPlayer.play(local786, local133, local864);
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.IF_SETPLAYERHEAD) {
                                local133 = inboundBuffer.g2leadd();
                                local786 = inboundBuffer.g4rme();
                                if (setVerifyId(local133)) {
                                    local864 = 0;
                                    if (PlayerList.self.appearance != null) {
                                        local864 = PlayerList.self.appearance.method1952();
                                    }
                                    DelayedStateChange.method2607(-1, 3, local786, local864);
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.IF_SETTEXT1) {
                                local133 = inboundBuffer.p4rme();
                                local156 = inboundBuffer.gjstr();
                                local864 = inboundBuffer.g2sub();
                                if (setVerifyId(local864)) {
                                    DelayedStateChange.method3617(local156, local133);
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == ServerProt.VARBIT_LARGE) {
                                local133 = inboundBuffer.g4me();
                                local786 = inboundBuffer.g2leadd();
                                Static272.method3995(local133, local786);
                                opcode = -1;
                                return true;
                            } else {
                                @Pc(4956) Component local4956;
                                if (opcode == ServerProt.UPDATE_INV_PARTIAL) {
                                    local133 = inboundBuffer.g4();
                                    local786 = inboundBuffer.g2();
                                    if (local133 < -70000) {
                                        local786 += 32768;
                                    }
                                    if (local133 < 0) {
                                        local4956 = null;
                                    } else {
                                        local4956 = InterfaceList.getComponent(local133);
                                    }
                                    while (inboundBuffer.offset < length) {
                                        local171 = inboundBuffer.gSmart1or2();
                                        local1146 = inboundBuffer.g2();
                                        local277 = 0;
                                        if (local1146 != 0) {
                                            local277 = inboundBuffer.g1();
                                            if (local277 == 255) {
                                                local277 = inboundBuffer.g4();
                                            }
                                        }
                                        if (local4956 != null && local171 >= 0 && local4956.objTypes.length > local171) {
                                            local4956.objTypes[local171] = local1146;
                                            local4956.objCounts[local171] = local277;
                                        }
                                        Static280.method4672(local1146 - 1, local171, local277, local786);
                                    }
                                    if (local4956 != null) {
                                        Static43.redraw(local4956);
                                    }
                                    InterfaceList.method2245();
                                    Inv.updatedInventories[Static111.updatedInventoriesWriterIndex++ & 0x1F] = local786 & 0x7FFF;
                                    opcode = -1;
                                    return true;
                                } else if (opcode == ServerProt.CAM_RESET) {
                                    local133 = inboundBuffer.g2();
                                    if (setVerifyId(local133)) {
                                        Static35.resetCameraEffects();
                                    }
                                    opcode = -1;
                                    return true;
                                } else if (opcode == ServerProt.LOGOUT) {
                                    Static278.processLogout();
                                    opcode = -1;
                                    return false;
                                } else if (opcode == ServerProt.GRAND_EXCHANGE_OFFERS) {
                                    local133 = inboundBuffer.g1();
                                    if (inboundBuffer.g1() == 0) {
                                        StockMarketManager.offers[local133] = new StockMarketOffer();
                                    } else {
                                        inboundBuffer.offset--;
                                        StockMarketManager.offers[local133] = new StockMarketOffer(inboundBuffer);
                                    }
                                    opcode = -1;
                                    StockMarketManager.transmitAt = InterfaceList.transmitTimer;
                                    return true;
                                } else if (opcode == ServerProt.IF_SETNPCHEAD) {
                                    local133 = inboundBuffer.g2sub();
                                    local786 = inboundBuffer.g4me();
                                    if (local133 == 65535) {
                                        local133 = -1;
                                    }
                                    local864 = inboundBuffer.g2le();
                                    if (setVerifyId(local864)) {
                                        DelayedStateChange.method2607(-1, 2, local786, local133);
                                    }
                                    opcode = -1;
                                    return true;
                                } else if (opcode == ServerProt.UPDATE_SCENE_GRAPH) {
                                    readRebuildPacket(false);
                                    opcode = -1;
                                    return true;
                                } else if (opcode == ServerProt.SET_INTERFACE_SETTINGS) {
                                    local133 = inboundBuffer.g2le();
                                    local786 = inboundBuffer.g2le();
                                    if (local786 == 65535) {
                                        local786 = -1;
                                    }
                                    local864 = inboundBuffer.g4();
                                    local171 = inboundBuffer.g2sub();
                                    local1146 = inboundBuffer.g4rme();
                                    if (local171 == 65535) {
                                        local171 = -1;
                                    }
                                    if (setVerifyId(local133)) {
                                        for (local277 = local171; local277 <= local786; local277++) {
                                            local904 = ((long) local864 << 32) + ((long) local277);
                                            local1804 = (ServerActiveProperties) Static210.aClass133_21.get(local904);
                                            if (local1804 != null) {
                                                local1814 = new ServerActiveProperties(local1146, local1804.anInt540);
                                                local1804.unlink();
                                            } else if (local277 == -1) {
                                                local1814 = new ServerActiveProperties(local1146, InterfaceList.getComponent(local864).aClass3_Sub4_1.anInt540);
                                            } else {
                                                local1814 = new ServerActiveProperties(local1146, -1);
                                            }
                                            Static210.aClass133_21.put(local1814, local904);
                                        }
                                    }
                                    opcode = -1;
                                    return true;
                                } else if (opcode == ServerProt.FRIENDLIST_LOADED) {
                                    FriendsList.state = inboundBuffer.g1();
                                    FriendsList.transmitAt = InterfaceList.transmitTimer;
                                    opcode = -1;
                                    return true;
                                } else if (opcode == ServerProt.UPDATE_CLAN) {
                                    local884 = inboundBuffer.g8();
                                    local864 = inboundBuffer.g2();
                                    @Pc(5325) byte local5325 = inboundBuffer.g1s();
                                    local262 = false;
                                    if ((Long.MIN_VALUE & local884) != 0L) {
                                        local262 = true;
                                    }
                                    if (local262) {
                                        if (ClanChat.size == 0) {
                                            opcode = -1;
                                            return true;
                                        }
                                        local884 &= Long.MAX_VALUE;
                                        for (local277 = 0; ClanChat.size > local277 && (local884 != ClanChat.members[local277].key || local864 != ClanChat.members[local277].world); local277++) {
                                        }
                                        if (local277 < ClanChat.size) {
                                            while (ClanChat.size - 1 > local277) {
                                                ClanChat.members[local277] = ClanChat.members[local277 + 1];
                                                local277++;
                                            }
                                            ClanChat.size--;
                                            ClanChat.members[ClanChat.size] = null;
                                        }
                                    } else {
                                        local506 = inboundBuffer.gjstr();
                                        @Pc(5347) Class3_Sub22 local5347 = new Class3_Sub22();
                                        local5347.key = local884;
                                        local5347.username = Base37.decode37(local5347.key);
                                        local5347.rank = local5325;
                                        local5347.aClass100_635 = local506;
                                        local5347.world = local864;
                                        for (local1986 = ClanChat.size - 1; local1986 >= 0; local1986--) {
                                            local908 = ClanChat.members[local1986].username.method3139(local5347.username);
                                            if (local908 == 0) {
                                                ClanChat.members[local1986].world = local864;
                                                ClanChat.members[local1986].rank = local5325;
                                                ClanChat.members[local1986].aClass100_635 = local506;
                                                if (local884 == Static101.aLong98) {
                                                    ClanChat.rank = local5325;
                                                }
                                                ClanChat.transmitAt = InterfaceList.transmitTimer;
                                                opcode = -1;
                                                return true;
                                            }
                                            if (local908 < 0) {
                                                break;
                                            }
                                        }
                                        if (ClanChat.members.length <= ClanChat.size) {
                                            opcode = -1;
                                            return true;
                                        }
                                        for (local908 = ClanChat.size - 1; local908 > local1986; local908--) {
                                            ClanChat.members[local908 + 1] = ClanChat.members[local908];
                                        }
                                        if (ClanChat.size == 0) {
                                            ClanChat.members = new Class3_Sub22[100];
                                        }
                                        ClanChat.members[local1986 + 1] = local5347;
                                        if (Static101.aLong98 == local884) {
                                            ClanChat.rank = local5325;
                                        }
                                        ClanChat.size++;
                                    }
                                    opcode = -1;
                                    ClanChat.transmitAt = InterfaceList.transmitTimer;
                                    return true;
                                } else if (opcode == ServerProt.IF_SETOBJECT) {
                                    local133 = inboundBuffer.g4();
                                    local786 = inboundBuffer.p4rme();
                                    local864 = inboundBuffer.g2leadd();
                                    if (local864 == 65535) {
                                        local864 = -1;
                                    }
                                    local171 = inboundBuffer.g2le();
                                    if (setVerifyId(local171)) {
                                        @Pc(5603) Component local5603 = InterfaceList.getComponent(local786);
                                        @Pc(5615) ObjType local5615;
                                        if (local5603.aBoolean32) {
                                            Static209.method3707(local786, local133, local864);
                                            local5615 = ObjTypeList.get(local864);
                                            DelayedStateChange.method4505(local5615.zoom2d, local786, local5615.yAngle2d, local5615.xAngle2d);
                                            Static145.method2745(local786, local5615.zAngle2d, local5615.yOffset2d, local5615.xOffset2d);
                                        } else if (local864 == -1) {
                                            local5603.modelType = 0;
                                            opcode = -1;
                                            return true;
                                        } else {
                                            local5615 = ObjTypeList.get(local864);
                                            local5603.modelXAngle = local5615.xAngle2d;
                                            local5603.modelZoom = local5615.zoom2d * 100 / local133;
                                            local5603.modelType = 4;
                                            local5603.modelId = local864;
                                            local5603.modelYAngle = local5615.yAngle2d;
                                            Static43.redraw(local5603);
                                        }
                                    }
                                    opcode = -1;
                                    return true;
                                } else if (opcode == ServerProt.UPDATE_INV_FULL) {
                                    local133 = inboundBuffer.g4();
                                    local786 = inboundBuffer.g2();
                                    if (local133 < -70000) {
                                        local786 += 32768;
                                    }
                                    if (local133 >= 0) {
                                        local4956 = InterfaceList.getComponent(local133);
                                    } else {
                                        local4956 = null;
                                    }
                                    if (local4956 != null) {
                                        for (local171 = 0; local171 < local4956.objTypes.length; local171++) {
                                            local4956.objTypes[local171] = 0;
                                            local4956.objCounts[local171] = 0;
                                        }
                                    }
                                    Static14.method475(local786);
                                    local171 = inboundBuffer.g2();
                                    for (local1146 = 0; local1146 < local171; local1146++) {
                                        local277 = inboundBuffer.g1ssub();
                                        if (local277 == 255) {
                                            local277 = inboundBuffer.g4();
                                        }
                                        local1160 = inboundBuffer.g2();
                                        if (local4956 != null && local1146 < local4956.objTypes.length) {
                                            local4956.objTypes[local1146] = local1160;
                                            local4956.objCounts[local1146] = local277;
                                        }
                                        Static280.method4672(local1160 - 1, local1146, local277, local786);
                                    }
                                    if (local4956 != null) {
                                        Static43.redraw(local4956);
                                    }
                                    InterfaceList.method2245();
                                    Inv.updatedInventories[Static111.updatedInventoriesWriterIndex++ & 0x1F] = local786 & 0x7FFF;
                                    opcode = -1;
                                    return true;
                                } else if (opcode == ServerProt.SET_SETTINGS_STRING) {
                                    Static230.method3954(inboundBuffer.gjstr());
                                    opcode = -1;
                                    return true;
                                } else if (opcode == ServerProt.UPDATE_CURRENT_LOCATION) {
                                    Static115.anInt2940 = inboundBuffer.p1neg();
                                    Static180.anInt4264 = inboundBuffer.g1();
                                    opcode = -1;
                                    return true;
                                } else if (opcode == ServerProt.MIDI_SONG) {
                                    local133 = inboundBuffer.g2leadd();
                                    if (local133 == 65535) {
                                        local133 = -1;
                                    }
                                    MusicPlayer.playSong(local133);
                                    opcode = -1;
                                    return true;
                                } else if (opcode == ServerProt.MIDI_JINGLE) {
                                    local133 = inboundBuffer.g3le();
                                    local786 = inboundBuffer.g2le();
                                    if (local786 == 65535) {
                                        local786 = -1;
                                    }
                                    MusicPlayer.playJingle(local133, local786);
                                    opcode = -1;
                                    return true;
                                } else {
                                    TracingException.report("T1 - " + opcode + "," + Static5.opcode3 + "," + Static49.opcode4 + " - " + length, null);
                                    Static278.processLogout();
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "h", descriptor = "(I)Z")
    public static boolean readPacket() {
        try {
            return readPacketInternal();
        } catch (@Pc(14) IOException local14) {
            Static175.method3279();
            return true;
        } catch (@Pc(19) Exception local19) {
            @Pc(61) String local61 = "T2 - " + opcode + "," + Static5.opcode3 + "," + Static49.opcode4 + " - " + length + "," + (Static225.originX + PlayerList.self.movementQueueX[0]) + "," + (PlayerList.self.movementQueueZ[0] + Static142.originZ) + " - ";
            for (@Pc(63) int local63 = 0; local63 < length && local63 < 50; local63++) {
                local61 = local61 + inboundBuffer.data[local63] + ",";
            }
            TracingException.report(local61, local19);
            Static278.processLogout();
            return true;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
    public static void method1756() {
        // todo: consolidate/rename static classes
        if (Static267.anInt5775 > 0) {
            Static267.anInt5775--;
        }
        if (Player.rebootTimer > 1) {
            Player.rebootTimer--;
            InterfaceList.miscTransmitAt = InterfaceList.transmitTimer;
        }
        if (LoginManager.aBoolean247) {
            LoginManager.aBoolean247 = false;
            Static175.method3279();
            return;
        }
        for (@Pc(34) int i = 0; i < 100 && readPacket(); i++) {
        }
        if (client.gameState != 30) {
            return;
        }
        ReflectionCheck.loop(outboundBuffer);
        @Pc(60) Object mouseRecorder = MouseRecorder.instance.lock;
        @Pc(86) int offset;
        @Pc(79) int type;
        @Pc(88) int i;
        @Pc(106) int y;
        @Pc(111) int x;
        @Pc(182) int dx;
        @Pc(189) int dy;
        synchronized (mouseRecorder) {
            if (!MouseRecorder.enabled) {
                MouseRecorder.instance.samples = 0;
            } else if (Mouse.clickButton != 0 || MouseRecorder.instance.samples >= 40) {
                outboundBuffer.p1isaac(123);
                type = 0;
                outboundBuffer.p1(0);
                offset = outboundBuffer.offset;
                for (i = 0; MouseRecorder.instance.samples > i && outboundBuffer.offset - offset < 240; i++) {
                    type++;
                    y = MouseRecorder.instance.y[i];
                    x = MouseRecorder.instance.x[i];
                    if (y < 0) {
                        y = 0;
                    } else if (y > 65534) {
                        y = 65534;
                    }
                    if (x < 0) {
                        x = 0;
                    } else if (x > 65534) {
                        x = 65534;
                    }
                    @Pc(142) boolean outsideWindow = false;
                    if (MouseRecorder.instance.y[i] == -1 && MouseRecorder.instance.x[i] == -1) {
                        outsideWindow = true;
                        y = -1;
                        x = -1;
                    }
                    if (Static264.mouseRecorderPrevX != x || y != Static179.mouseRecorderPrevY) {
                        dx = x - Static264.mouseRecorderPrevX;
                        Static264.mouseRecorderPrevX = x;
                        dy = y - Static179.mouseRecorderPrevY;
                        Static179.mouseRecorderPrevY = y;
                        if (anInt4762 < 8 && dx >= -32 && dx <= 31 && dy >= -32 && dy <= 31) {
                            dy += 32;
                            dx += 32;
                            outboundBuffer.p2(dy + (anInt4762 << 12) + (dx << 6));
                            anInt4762 = 0;
                        } else if (anInt4762 < 32 && dx >= -128 && dx <= 127 && dy >= -128 && dy <= 127) {
                            outboundBuffer.p1(anInt4762 + 128);
                            dy += 128;
                            dx += 128;
                            outboundBuffer.p2((dx << 8) + dy);
                            anInt4762 = 0;
                        } else if (anInt4762 < 32) {
                            outboundBuffer.p1(anInt4762 + 192);
                            if (outsideWindow) {
                                outboundBuffer.p4(Integer.MIN_VALUE);
                            } else {
                                outboundBuffer.p4(x | y << 16);
                            }
                            anInt4762 = 0;
                        } else {
                            outboundBuffer.p2(anInt4762 + 57344);
                            if (outsideWindow) {
                                outboundBuffer.p4(Integer.MIN_VALUE);
                            } else {
                                outboundBuffer.p4(x | y << 16);
                            }
                            anInt4762 = 0;
                        }
                    } else if (anInt4762 < 2047) {
                        anInt4762++;
                    }
                }
                outboundBuffer.p1len(outboundBuffer.offset - offset);
                if (MouseRecorder.instance.samples > type) {
                    MouseRecorder.instance.samples -= type;
                    for (i = 0; i < MouseRecorder.instance.samples; i++) {
                        MouseRecorder.instance.x[i] = MouseRecorder.instance.x[type + i];
                        MouseRecorder.instance.y[i] = MouseRecorder.instance.y[type + i];
                    }
                } else {
                    MouseRecorder.instance.samples = 0;
                }
            }
        }
        if (Mouse.clickButton != 0) {
            @Pc(411) long loops = (Mouse.clickTime - Static183.prevClickTime) / 50L;
            type = Mouse.clickY;
            if (type < 0) {
                type = 0;
            } else if (type > 65535) {
                type = 65535;
            }
            if (loops > 32767L) {
                loops = 32767L;
            }
            i = Mouse.clickX;
            Static183.prevClickTime = Mouse.clickTime;
            @Pc(437) byte button = 0;
            if (i < 0) {
                i = 0;
            } else if (i > 65535) {
                i = 65535;
            }
            x = (int) loops;
            if (Mouse.clickButton == 2) {
                button = 1;
            }
            outboundBuffer.p1isaac(75);
            outboundBuffer.p2leadd(button << 15 | x);
            outboundBuffer.p4me(i | type << 16);
        }
        if (Static16.anInt551 > 0) {
            Static16.anInt551--;
        }
        if (Preferences.aBoolean63) {
            for (i = 0; i < InterfaceList.keyQueueSize; i++) {
                offset = InterfaceList.keyCodes[i];
                if (offset == 98 || offset == 99 || offset == 96 || offset == 97) {
                    Static197.aBoolean228 = true;
                    break;
                }
            }
        } else if (Keyboard.pressedKeys[Keyboard.KEY_LEFT] || Keyboard.pressedKeys[Keyboard.KEY_RIGHT] || Keyboard.pressedKeys[Keyboard.KEY_UP] || Keyboard.pressedKeys[Keyboard.KEY_DOWN]) {
            Static197.aBoolean228 = true;
        }
        if (Static197.aBoolean228 && Static16.anInt551 <= 0) {
            Static16.anInt551 = 20;
            Static197.aBoolean228 = false;
            outboundBuffer.p1isaac(21);
            outboundBuffer.p2add((int)Camera.pitchTarget);
            outboundBuffer.p2le((int)Camera.yawTarget);
        }
        if (GameShell.focus && !Static67.prevFocus) {
            Static67.prevFocus = true;
            outboundBuffer.p1isaac(22);
            outboundBuffer.p1(1);
        }
        if (!GameShell.focus && Static67.prevFocus) {
            Static67.prevFocus = false;
            outboundBuffer.p1isaac(22);
            outboundBuffer.p1(0);
        }
        if (!Preferences.sentToServer) {
            outboundBuffer.p1isaac(98);
            outboundBuffer.p4(Preferences.toInt());
            Preferences.sentToServer = true;
        }
        Static31.method846();
        if (client.gameState != 30) {
            return;
        }
        ChangeLocRequest.loop();
        AttachLocRequest.loop();
        SoundPlayer.loop();
        Static201.anInt1862++;
        if (Static201.anInt1862 > 750) {
            Static175.method3279();
            return;
        }
        Static71.method1444();
        Static109.method2274();
        OverheadChat.loop();
        if (WorldMap.component != null) {
            Static12.method447();
        }
        // VarpDomain
        for (i = Static38.poll(true); i != -1; i = Static38.poll(false)) {
            Static85.method1775(i);
            VarpDomain.updatedVarps[VarpDomain.updatedVarpsWriterIndex++ & 0x1F] = i;
        }
        @Pc(782) int modelId;
        // DelayedStateChange
        for (@Pc(709) DelayedStateChange change = Static127.poll(); change != null; change = Static127.poll()) {
            type = change.getType();
            i = change.getId();
            if (type == 1) {
                VarcDomain.varcs[i] = change.intArg1;
                VarcDomain.updatedVarcs[VarcDomain.updatedVarcsWriterIndex++ & 0x1F] = i;
            } else if (type == 2) {
                VarcDomain.varcstrs[i] = change.stringArg;
                VarcDomain.updatedVarcstrs[VarcDomain.updatedVarcstrsWriterIndex++ & 0x1F] = i;
            } else {
                @Pc(773) Component component;
                if (type == 3) {
                    component = InterfaceList.getComponent(i);
                    if (!change.stringArg.strEquals(component.text)) {
                        component.text = change.stringArg;
                        Static43.redraw(component);
                    }
                } else if (type == 4) {
                    component = InterfaceList.getComponent(i);
                    x = change.intArg1;
                    dx = change.intArg2;
                    modelId = change.intArg3;
                    if (component.modelType != x || component.modelId != modelId || dx != component.anInt498) {
                        component.modelId = modelId;
                        component.anInt498 = dx;
                        component.modelType = x;
                        Static43.redraw(component);
                    }
                } else if (type == 5) {
                    component = InterfaceList.getComponent(i);
                    if (component.modelSeqId != change.intArg1 || change.intArg1 == -1) {
                        component.anInt496 = 1;
                        component.anInt500 = 0;
                        component.modelSeqId = change.intArg1;
                        component.anInt510 = 0;
                        Static43.redraw(component);
                    }
                } else if (type == 6) {
                    y = change.intArg1;
                    x = y >> 10 & 0x1F;
                    dx = y & 0x1F;
                    modelId = y >> 5 & 0x1F;
                    @Pc(1189) Component local1189 = InterfaceList.getComponent(i);
                    dy = (dx << 3) + (modelId << 11) + (x << 19);
                    if (dy != local1189.color) {
                        local1189.color = dy;
                        Static43.redraw(local1189);
                    }
                } else if (type == 7) {
                    component = InterfaceList.getComponent(i);
                    // todo: this should not be necessary, data/server-related?
                    if (component != null) {
                        @Pc(1145) boolean hidden = change.intArg1 == 1;
                        if (hidden != component.hidden) {
                            component.hidden = hidden;
                            Static43.redraw(component);
                        }
                    }
                } else if (type == 8) {
                    component = InterfaceList.getComponent(i);
                    if (change.intArg1 != component.modelXAngle || component.modelYAngle != change.intArg3 || change.intArg2 != component.modelZoom) {
                        component.modelXAngle = change.intArg1;
                        component.modelZoom = change.intArg2;
                        component.modelYAngle = change.intArg3;
                        if (component.objId != -1) {
                            if (component.anInt451 > 0) {
                                component.modelZoom = component.modelZoom * 32 / component.anInt451;
                            } else if (component.baseWidth > 0) {
                                component.modelZoom = component.modelZoom * 32 / component.baseWidth;
                            }
                        }
                        Static43.redraw(component);
                    }
                } else if (type == 9) {
                    component = InterfaceList.getComponent(i);
                    if (change.intArg1 != component.objId || component.objCount != change.intArg3) {
                        component.objId = change.intArg1;
                        component.objCount = change.intArg3;
                        Static43.redraw(component);
                    }
                } else if (type == 10) {
                    component = InterfaceList.getComponent(i);
                    if (component.modelXOffset != change.intArg1 || change.intArg3 != component.modelZOffset || component.modelYOffset != change.intArg2) {
                        component.modelZOffset = change.intArg3;
                        component.modelYOffset = change.intArg2;
                        component.modelXOffset = change.intArg1;
                        Static43.redraw(component);
                    }
                } else if (type == 11) {
                    component = InterfaceList.getComponent(i);
                    component.x = component.baseX = change.intArg1;
                    component.yMode = 0;
                    component.xMode = 0;
                    component.y = component.baseY = change.intArg3;
                    Static43.redraw(component);
                } else if (type == 12) {
                    component = InterfaceList.getComponent(i);
                    x = change.intArg1;
                    if (component != null && component.type == 0) {
                        if (x > component.anInt491 - component.anInt459) {
                            x = component.anInt491 - component.anInt459;
                        }
                        if (x < 0) {
                            x = 0;
                        }
                        if (x != component.scrollY) {
                            component.scrollY = x;
                            Static43.redraw(component);
                        }
                    }
                } else if (type == 13) {
                    component = InterfaceList.getComponent(i);
                    component.modelRotationSpeed = change.intArg1;
                }
            }
        }
        if (Cross.type != 0) {
            Cross.milliseconds += 20;
            if (Cross.milliseconds >= 400) {
                Cross.type = 0;
            }
        }
        Static178.anInt4247++;
        if (Static257.aClass13_7 != null) {
            Static72.anInt2043++;
            if (Static72.anInt2043 >= 15) {
                Static43.redraw(Static257.aClass13_7);
                Static257.aClass13_7 = null;
            }
        }
        @Pc(1361) Component local1361;
        if (Static118.aClass13_15 != null) {
            Static43.redraw(Static118.aClass13_15);
            if (Static149.anInt3554 + 5 < Mouse.anInt4873 || Mouse.anInt4873 < Static149.anInt3554 - 5 || Static206.anInt4773 + 5 < Mouse.anInt5032 || Static206.anInt4773 - 5 > Mouse.anInt5032) {
                Static123.aBoolean155 = true;
            }
            Static78.anInt2145++;
            if (Mouse.pressedButton == 0) {
                if (Static123.aBoolean155 && Static78.anInt2145 >= 5) {
                    if (Static118.aClass13_15 == Static169.aClass13_18 && Static4.anInt36 != Static18.anInt588) {
                        local1361 = Static118.aClass13_15;
                        @Pc(1363) byte local1363 = 0;
                        if (Static179.anInt4254 == 1 && local1361.anInt453 == 206) {
                            local1363 = 1;
                        }
                        if (local1361.objTypes[Static18.anInt588] <= 0) {
                            local1363 = 0;
                        }
                        if (InterfaceList.getServerActiveProperties(local1361).isObjReplaceEnabled()) {
                            y = Static4.anInt36;
                            x = Static18.anInt588;
                            local1361.objTypes[x] = local1361.objTypes[y];
                            local1361.objCounts[x] = local1361.objCounts[y];
                            local1361.objTypes[y] = -1;
                            local1361.objCounts[y] = 0;
                        } else if (local1363 == 1) {
                            x = Static18.anInt588;
                            y = Static4.anInt36;
                            while (x != y) {
                                if (y > x) {
                                    local1361.swapObjs(y - 1, y);
                                    y--;
                                } else if (x > y) {
                                    local1361.swapObjs(y + 1, y);
                                    y++;
                                }
                            }
                        } else {
                            local1361.swapObjs(Static18.anInt588, Static4.anInt36);
                        }
                        outboundBuffer.p1isaac(231);
                        outboundBuffer.p2(Static4.anInt36);
                        outboundBuffer.p4le2(Static118.aClass13_15.id);
                        outboundBuffer.p2add(Static18.anInt588);
                        outboundBuffer.p1sub(local1363);
                    }
                } else if ((Static116.anInt2952 == 1 || Static277.method4640(Static231.anInt5204 - 1)) && Static231.anInt5204 > 2) {
                    Static226.method3901();
                } else if (Static231.anInt5204 > 0) {
                    Static59.method1372();
                }
                Mouse.clickButton = 0;
                Static72.anInt2043 = 10;
                Static118.aClass13_15 = null;
            }
        }
        Static146.aBoolean174 = false;
        Static56.aClass13_12 = null;
        Static44.aBoolean83 = false;
        InterfaceList.keyQueueSize = 0;
        local1361 = Static180.aClass13_22;
        Static180.aClass13_22 = null;
        @Pc(1508) Component local1508 = Static43.aClass13_11;
        Static43.aClass13_11 = null;
        while (Keyboard.nextKey() && InterfaceList.keyQueueSize < 128) {
            InterfaceList.keyCodes[InterfaceList.keyQueueSize] = Keyboard.keyCode;
            InterfaceList.keyChars[InterfaceList.keyQueueSize] = Keyboard.keyChar;
            InterfaceList.keyQueueSize++;
        }
        WorldMap.component = null;
        if (InterfaceList.topLevelInterface != -1) {
            Static57.method1320(0, 0, 0, GameShell.canvasWidth, InterfaceList.topLevelInterface, 0, GameShell.canvasHeight);
        }
        InterfaceList.transmitTimer++;
        while (true) {
            @Pc(1569) Component priorityComponent;
            @Pc(1560) Component prioritySource;
            @Pc(1555) HookRequest priorityRequest;
            do {
                priorityRequest = (HookRequest) Static4.highPriorityRequests.removeHead();
                if (priorityRequest == null) {
                    while (true) {
                        do {
                            priorityRequest = (HookRequest) Static115.mediumPriorityRequests.removeHead();
                            if (priorityRequest == null) {
                                while (true) {
                                    do {
                                        priorityRequest = (HookRequest) InterfaceList.lowPriorityRequests.removeHead();
                                        if (priorityRequest == null) {
                                            if (WorldMap.component == null) {
                                                Static137.anInt3337 = 0;
                                            }
                                            if (Static105.aClass13_14 != null) {
                                                Static4.method28();
                                            }
                                            if (LoginManager.staffModLevel > 0 && Keyboard.pressedKeys[Keyboard.KEY_CTRL] && Keyboard.pressedKeys[Keyboard.KEY_SHIFT] && Static58.wheelRotation != 0) {
                                                y = Player.level - Static58.wheelRotation;
                                                if (y < 0) {
                                                    y = 0;
                                                } else if (y > 3) {
                                                    y = 3;
                                                }
                                                // Cheat
                                                Cheat.teleport(PlayerList.self.movementQueueX[0] + Static225.originX, PlayerList.self.movementQueueZ[0] + Static142.originZ, y);
                                            }
                                            if (LoginManager.staffModLevel > 0 && Keyboard.pressedKeys[Keyboard.KEY_CTRL] && Keyboard.pressedKeys[Keyboard.KEY_SHIFT]) {
                                                if (Static56.anInt1742 != -1) {
                                                    Cheat.teleport(Static225.originX + Static56.anInt1742, Static142.originZ - -Static116.anInt2954, Player.level);
                                                }
                                                Static187.anInt4422 = 0;
                                                Static125.anInt3096 = 0;
                                            } else if (Static125.anInt3096 == 2) {
                                                if (Static56.anInt1742 != -1) {
                                                    outboundBuffer.p1isaac(131);
                                                    outboundBuffer.p4me(Static98.anInt2512);
                                                    outboundBuffer.p2add(Static225.originX + Static56.anInt1742);
                                                    outboundBuffer.p2leadd(Static15.anInt506);
                                                    outboundBuffer.p2add(Static116.anInt2954 + Static142.originZ);
                                                    Cross.type = 1;
                                                    Cross.milliseconds = 0;
                                                    Cross.y = Mouse.clickY;
                                                    Cross.x = Mouse.clickX;
                                                }
                                                Static125.anInt3096 = 0;
                                            } else if (Static187.anInt4422 == 2) {
                                                if (Static56.anInt1742 != -1) {
                                                    outboundBuffer.p1isaac(179);
                                                    outboundBuffer.p2(Static142.originZ + Static116.anInt2954);
                                                    outboundBuffer.p2(Static56.anInt1742 + Static225.originX);
                                                    Cross.milliseconds = 0;
                                                    Cross.type = 1;
                                                    Cross.x = Mouse.clickX;
                                                    Cross.y = Mouse.clickY;
                                                }
                                                Static187.anInt4422 = 0;
                                            } else if (Static56.anInt1742 != -1 && Static125.anInt3096 == 0 && Static187.anInt4422 == 0) {
                                                @Pc(1871) boolean local1871 = Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 0, true, 0, Static56.anInt1742, 0, 0, 0, Static116.anInt2954, PlayerList.self.movementQueueX[0]);
                                                if (local1871) {
                                                    Cross.y = Mouse.clickY;
                                                    Cross.milliseconds = 0;
                                                    Cross.x = Mouse.clickX;
                                                    Cross.type = 1;
                                                }
                                            }
                                            Static56.anInt1742 = -1;
                                            Static7.method843();
                                            if (Static180.aClass13_22 != local1361) {
                                                if (local1361 != null) {
                                                    Static43.redraw(local1361);
                                                }
                                                if (Static180.aClass13_22 != null) {
                                                    Static43.redraw(Static180.aClass13_22);
                                                }
                                            }
                                            if (local1508 != Static43.aClass13_11 && Static191.anInt4504 == Static133.anInt5235) {
                                                if (local1508 != null) {
                                                    Static43.redraw(local1508);
                                                }
                                                if (Static43.aClass13_11 != null) {
                                                    Static43.redraw(Static43.aClass13_11);
                                                }
                                            }
                                            if (Static43.aClass13_11 == null) {
                                                if (Static133.anInt5235 > 0) {
                                                    Static133.anInt5235--;
                                                }
                                            } else if (Static133.anInt5235 < Static191.anInt4504) {
                                                Static133.anInt5235++;
                                                if (Static191.anInt4504 == Static133.anInt5235) {
                                                    Static43.redraw(Static43.aClass13_11);
                                                }
                                            }
                                            if (Static227.cameraType == 1) {
                                                Static250.method4273();
                                            } else if (Static227.cameraType == 2) {
                                                Static125.updateLockedCamera();
                                            } else {
                                                Static40.updateLoginScreenCamera();
                                            }
                                            for (y = 0; y < 5; y++) {
                                                @Pc(2001) int local2001 = Static31.anIntArray76[y]++;
                                            }
                                            y = Mouse.getIdleLoops();
                                            x = Keyboard.getIdleLoops();
                                            if (y > 15000 && x > 15000) {
                                                Static267.anInt5775 = 250;
                                                Static48.setIdleLoops(14500);
                                                outboundBuffer.p1isaac(245);
                                            }
                                            if (Static33.openUrlRequest != null && Static33.openUrlRequest.status == 1) {
                                                if (Static33.openUrlRequest.result != null) {
                                                    Static169.openUrl(Static175.url, Static164.newTab);
                                                }
                                                Static175.url = null;
                                                Static33.openUrlRequest = null;
                                                Static164.newTab = false;
                                            }
                                            Static131.anInt3251++;
                                            Static82.anInt2252++;
                                            Static143.anInt3486++;
                                            if (Static143.anInt3486 > 500) {
                                                Static143.anInt3486 = 0;
                                                modelId = (int) (Math.random() * 8.0D);
                                                if ((modelId & 0x4) == 4) {
                                                    Static230.anInt5161 += Static220.anInt4941;
                                                }
                                                if ((modelId & 0x2) == 2) {
                                                    Static206.anInt4774 += Static20.anInt659;
                                                }
                                                if ((modelId & 0x1) == 1) {
                                                    Static132.anInt3291 += Static248.anInt4229;
                                                }
                                            }
                                            if (Static82.anInt2252 > 500) {
                                                Static82.anInt2252 = 0;
                                                modelId = (int) (Math.random() * 8.0D);
                                                if ((modelId & 0x1) == 1) {
                                                    Static59.anInt1814 += Static263.anInt5755;
                                                }
                                                if ((modelId & 0x2) == 2) {
                                                    Static273.anInt4130 += Static179.anInt4262;
                                                }
                                            }
                                            if (Static132.anInt3291 < -50) {
                                                Static248.anInt4229 = 2;
                                            }
                                            if (Static59.anInt1814 < -60) {
                                                Static263.anInt5755 = 2;
                                            }
                                            if (Static273.anInt4130 < -20) {
                                                Static179.anInt4262 = 1;
                                            }
                                            if (Static206.anInt4774 < -55) {
                                                Static20.anInt659 = 2;
                                            }
                                            if (Static206.anInt4774 > 55) {
                                                Static20.anInt659 = -2;
                                            }
                                            if (Static230.anInt5161 < -40) {
                                                Static220.anInt4941 = 1;
                                            }
                                            if (Static132.anInt3291 > 50) {
                                                Static248.anInt4229 = -2;
                                            }
                                            if (Static230.anInt5161 > 40) {
                                                Static220.anInt4941 = -1;
                                            }
                                            if (Static273.anInt4130 > 10) {
                                                Static179.anInt4262 = -1;
                                            }
                                            if (Static59.anInt1814 > 60) {
                                                Static263.anInt5755 = -2;
                                            }
                                            if (Static131.anInt3251 > 50) {
                                                outboundBuffer.p1isaac(93);
                                            }
                                            if (Static34.verifyIdChanged) {
                                                Static71.transmitVerifyId();
                                                Static34.verifyIdChanged = false;
                                            }
                                            try {
                                                if (socket != null && outboundBuffer.offset > 0) {
                                                    socket.write(outboundBuffer.data, outboundBuffer.offset);
                                                    Static131.anInt3251 = 0;
                                                    outboundBuffer.offset = 0;
                                                }
                                            } catch (@Pc(2266) IOException local2266) {
                                                Static175.method3279();
                                            }
                                            return;
                                        }
                                        prioritySource = priorityRequest.source;
                                        if (prioritySource.createdComponentId < 0) {
                                            break;
                                        }
                                        priorityComponent = InterfaceList.getComponent(prioritySource.layer);
                                    } while (priorityComponent == null || priorityComponent.createdComponents == null || prioritySource.createdComponentId >= priorityComponent.createdComponents.length || prioritySource != priorityComponent.createdComponents[prioritySource.createdComponentId]);
                                    Static82.method1767(priorityRequest);
                                }
                            }
                            prioritySource = priorityRequest.source;
                            if (prioritySource.createdComponentId < 0) {
                                break;
                            }
                            priorityComponent = InterfaceList.getComponent(prioritySource.layer);
                        } while (priorityComponent == null || priorityComponent.createdComponents == null || priorityComponent.createdComponents.length <= prioritySource.createdComponentId || priorityComponent.createdComponents[prioritySource.createdComponentId] != prioritySource);
                        Static82.method1767(priorityRequest);
                    }
                }
                prioritySource = priorityRequest.source;
                if (prioritySource.createdComponentId < 0) {
                    break;
                }
                priorityComponent = InterfaceList.getComponent(prioritySource.layer);
            } while (priorityComponent == null || priorityComponent.createdComponents == null || prioritySource.createdComponentId >= priorityComponent.createdComponents.length || priorityComponent.createdComponents[prioritySource.createdComponentId] != prioritySource);
            Static82.method1767(priorityRequest);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public static void method4014() {
        for (@Pc(3) int local3 = 0; local3 < extendedCount; local3++) {
            @Pc(10) int local10 = extendedIds[local3];
            @Pc(14) Npc local14 = NpcList.npcs[local10];
            @Pc(18) int local18 = inboundBuffer.g1();
            if ((local18 & 0x8) != 0) {
                local18 += inboundBuffer.g1() << 8;
            }
            @Pc(43) int local43;
            @Pc(47) int local47;
            if ((local18 & 0x40) != 0) {
                local43 = inboundBuffer.g1();
                local47 = inboundBuffer.p1neg();
                local14.addHit(local47, client.loop, local43);
                local14.hitpointsBarVisibleUntil = client.loop + 300;
                local14.hitpointsBar = inboundBuffer.g1ssub();
            }
            if ((local18 & 0x2) != 0) {
                local43 = inboundBuffer.p1neg();
                local47 = inboundBuffer.g1ssub();
                local14.addHit(local47, client.loop, local43);
            }
            if ((local18 & 0x10) != 0) {
                local43 = inboundBuffer.g2();
                local47 = inboundBuffer.g1();
                if (local43 == 65535) {
                    local43 = -1;
                }
                Static223.method3855(local47, local43, local14);
            }
            if ((local18 & 0x4) != 0) {
                local14.faceEntity = inboundBuffer.g2sub();
                if (local14.faceEntity == 65535) {
                    local14.faceEntity = -1;
                }
            }
            if ((local18 & 0x80) != 0) {
                local43 = inboundBuffer.g2sub();
                if (local43 == 65535) {
                    local43 = -1;
                }
                local47 = inboundBuffer.g4me();
                @Pc(147) boolean local147 = true;
                if (local43 != -1 && local14.spotAnimId != -1 && SeqTypeList.get(SpotAnimTypeList.get(local43).seqId).anInt5355 < SeqTypeList.get(SpotAnimTypeList.get(local14.spotAnimId).seqId).anInt5355) {
                    local147 = false;
                }
                if (local147) {
                    local14.spotAnimId = local43;
                    local14.spotAnimStart = (local47 & 0xFFFF) + client.loop;
                    local14.anInt3361 = 0;
                    local14.anInt3399 = 0;
                    local14.spotAnimY = local47 >> 16;
                    local14.anInt3418 = 1;
                    if (local14.spotAnimStart > client.loop) {
                        local14.anInt3399 = -1;
                    }
                    if (local14.spotAnimId != -1 && local14.spotAnimStart == client.loop) {
                        @Pc(227) int local227 = SpotAnimTypeList.get(local14.spotAnimId).seqId;
                        if (local227 != -1) {
                            @Pc(236) SeqType local236 = SeqTypeList.get(local227);
                            if (local236 != null && local236.frames != null) {
                                SoundPlayer.playSeqSound(local14.zFine, local236, local14.xFine, false, 0);
                            }
                        }
                    }
                }
            }
            if ((local18 & 0x1) != 0) {
                if (local14.type.hasAreaSound()) {
                    AreaSoundManager.remove(local14);
                }
                local14.method2698(NpcTypeList.get(inboundBuffer.g2le()));
                local14.method2692(local14.type.soze);
                local14.anInt3365 = local14.type.basId;
                if (local14.type.hasAreaSound()) {
                    AreaSoundManager.add(local14.movementQueueZ[0], null, 0, local14, local14.movementQueueX[0], Player.level, null);
                }
            }
            if ((local18 & 0x20) != 0) {
                local14.chatMessage = inboundBuffer.gjstr();
                local14.chatLoops = 100;
            }
            if ((local18 & 0x100) != 0) {
                local43 = inboundBuffer.p1neg();
                @Pc(331) int[] local331 = new int[local43];
                @Pc(334) int[] local334 = new int[local43];
                @Pc(337) int[] local337 = new int[local43];
                for (@Pc(339) int local339 = 0; local339 < local43; local339++) {
                    @Pc(350) int local350 = inboundBuffer.g2le();
                    if (local350 == 65535) {
                        local350 = -1;
                    }
                    local331[local339] = local350;
                    local334[local339] = inboundBuffer.g1ssub();
                    local337[local339] = inboundBuffer.g2();
                }
                Static159.method3037(local337, local14, local334, local331);
            }
            if ((local18 & 0x200) != 0) {
                local14.faceX = inboundBuffer.g2sub();
                local14.faceY = inboundBuffer.g2();
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "(I)V")
    public static void method1800() {
        extendedCount = 0;
        removedCount = 0;
        method1202();
        method4645();
        method4014();
        @Pc(19) int local19;
        for (local19 = 0; local19 < removedCount; local19++) {
            @Pc(30) int local30 = removedIds[local19];
            if (NpcList.npcs[local30].lastSeenLoop != client.loop) {
                if (NpcList.npcs[local30].type.hasAreaSound()) {
                    AreaSoundManager.remove(NpcList.npcs[local30]);
                }
                NpcList.npcs[local30].method2698(null);
                NpcList.npcs[local30] = null;
            }
        }
        if (length != inboundBuffer.offset) {
            throw new RuntimeException("gnp1 pos:" + inboundBuffer.offset + " psize:" + length);
        }
        for (local19 = 0; local19 < Static272.anInt5214; local19++) {
            if (NpcList.npcs[Static33.anIntArray79[local19]] == null) {
                throw new RuntimeException("gnp2 pos:" + local19 + " size:" + Static272.anInt5214);
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public static void method1202() {
        inboundBuffer.accessBits();
        @Pc(13) int local13 = inboundBuffer.gBits(8);
        @Pc(22) int local22;
        if (Static272.anInt5214 > local13) {
            for (local22 = local13; local22 < Static272.anInt5214; local22++) {
                removedIds[removedCount++] = Static33.anIntArray79[local22];
            }
        }
        if (Static272.anInt5214 < local13) {
            throw new RuntimeException("gnpov1");
        }
        Static272.anInt5214 = 0;
        for (local22 = 0; local22 < local13; local22++) {
            @Pc(61) int local61 = Static33.anIntArray79[local22];
            @Pc(65) Npc local65 = NpcList.npcs[local61];
            @Pc(70) int local70 = inboundBuffer.gBits(1);
            if (local70 == 0) {
                Static33.anIntArray79[Static272.anInt5214++] = local61;
                local65.lastSeenLoop = client.loop;
            } else {
                @Pc(92) int local92 = inboundBuffer.gBits(2);
                if (local92 == 0) {
                    Static33.anIntArray79[Static272.anInt5214++] = local61;
                    local65.lastSeenLoop = client.loop;
                    extendedIds[extendedCount++] = local61;
                } else {
                    @Pc(139) int local139;
                    @Pc(149) int local149;
                    if (local92 == 1) {
                        Static33.anIntArray79[Static272.anInt5214++] = local61;
                        local65.lastSeenLoop = client.loop;
                        local139 = inboundBuffer.gBits(3);
                        local65.move(1, local139);
                        local149 = inboundBuffer.gBits(1);
                        if (local149 == 1) {
                            extendedIds[extendedCount++] = local61;
                        }
                    } else if (local92 == 2) {
                        Static33.anIntArray79[Static272.anInt5214++] = local61;
                        local65.lastSeenLoop = client.loop;
                        if (inboundBuffer.gBits(1) == 1) {
                            local139 = inboundBuffer.gBits(3);
                            local65.move(2, local139);
                            local149 = inboundBuffer.gBits(3);
                            local65.move(2, local149);
                        } else {
                            local139 = inboundBuffer.gBits(3);
                            local65.move(0, local139);
                        }
                        local139 = inboundBuffer.gBits(1);
                        if (local139 == 1) {
                            extendedIds[extendedCount++] = local61;
                        }
                    } else if (local92 == 3) {
                        removedIds[removedCount++] = local61;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public static void method4645() {
        while (true) {
            if (inboundBuffer.method2241(length) >= 27) {
                @Pc(14) int local14 = inboundBuffer.gBits(15);
                if (local14 != 32767) {
                    @Pc(19) boolean local19 = false;
                    if (NpcList.npcs[local14] == null) {
                        local19 = true;
                        NpcList.npcs[local14] = new Npc();
                    }
                    @Pc(37) Npc local37 = NpcList.npcs[local14];
                    Static33.anIntArray79[Static272.anInt5214++] = local14;
                    local37.lastSeenLoop = client.loop;
                    if (local37.type != null && local37.type.hasAreaSound()) {
                        AreaSoundManager.remove(local37);
                    }
                    @Pc(66) int local66 = inboundBuffer.gBits(1);
                    @Pc(73) int local73 = PathingEntity.ANGLES[inboundBuffer.gBits(3)];
                    if (local19) {
                        local37.anInt3400 = local37.anInt3381 = local73;
                    }
                    @Pc(86) int local86 = inboundBuffer.gBits(1);
                    if (local86 == 1) {
                        extendedIds[extendedCount++] = local14;
                    }
                    @Pc(105) int local105 = inboundBuffer.gBits(5);
                    local37.method2698(NpcTypeList.get(inboundBuffer.gBits(14)));
                    if (local105 > 15) {
                        local105 -= 32;
                    }
                    @Pc(124) int local124 = inboundBuffer.gBits(5);
                    if (local124 > 15) {
                        local124 -= 32;
                    }
                    local37.method2692(local37.type.soze);
                    local37.anInt3365 = local37.type.basId;
                    local37.anInt3376 = local37.type.anInt3733;
                    if (local37.anInt3376 == 0) {
                        local37.anInt3381 = 0;
                    }
                    local37.method2683(local37.getSize(), PlayerList.self.movementQueueX[0] + local124, local105 + PlayerList.self.movementQueueZ[0], local66 == 1);
                    if (local37.type.hasAreaSound()) {
                        AreaSoundManager.add(local37.movementQueueZ[0], null, 0, local37, local37.movementQueueX[0], Player.level, null);
                    }
                    continue;
                }
            }
            inboundBuffer.accessBytes();
            return;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)Z")
    public static boolean setVerifyId(@OriginalArg(0) int arg0) {
        verifyId = arg0 + 1 & 0xFFFF;
        Static34.verifyIdChanged = true;
        return true;
    }
}
