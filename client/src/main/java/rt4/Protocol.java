package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

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
    @OriginalMember(owner = "client!tl", name = "f", descriptor = "Lclient!na;")
	public static final JagString ASSIST = JagString.parse(":assist:");
    @OriginalMember(owner = "client!pl", name = "f", descriptor = "Lclient!na;")
    public static final JagString TRADEREQ = JagString.parse(":tradereq:");
    @OriginalMember(owner = "client!lb", name = "s", descriptor = "Lclient!na;")
	public static final JagString CLAN = JagString.parse(":clan:");
    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Lclient!na;")
    public static final JagString DUELFRIEND = JagString.parse(":duelfriend:");
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
    @OriginalMember(owner = "client!ck", name = "eb", descriptor = "Z")
    public static boolean verifyIdChanged = false;
    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public static int opcode4 = 0;
    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
	public static int opcode3 = 0;
    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
	public static int opcode2 = 0;
    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    public static int anInt659 = 2;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
    public static void readLocationPacket() {
        if (opcode == ServerProt.LOCATION_PACKET_195) {
            int local15 = inboundBuffer.g1neg();
            int local19 = local15 & 0x3;
            int local23 = local15 >> 2;
            int local27 = Loc.LAYERS[local23];
            int local31 = inboundBuffer.g1();
            int local39 = (local31 >> 4 & 0x7) + Static115.currentChunkX;
            int local45 = (local31 & 0x7) + Static180.currentChunkZ;
            if (local39 >= 0 && local45 >= 0 && local39 < 104 && local45 < 104) {
                ChangeLocRequest.push(Player.level, local45, local19, local39, -1, -1, local27, local23, 0);
            }
        } else if (opcode == ServerProt.LOCATION_PACKET_33) {
            int local15 = inboundBuffer.g2le();
            int local23 = inboundBuffer.g1();
            int local27 = (local23 & 0x7) + Static180.currentChunkZ;
            int local19 = (local23 >> 4 & 0x7) + Static115.currentChunkX;
            int local31 = inboundBuffer.g2sub();
            if (local19 >= 0 && local27 >= 0 && local19 < 104 && local27 < 104) {
                @Pc(122) ObjStack local122 = new ObjStack();
                local122.anInt5550 = local31;
                local122.type = local15;
                if (SceneGraph.objStacks[Player.level][local19][local27] == null) {
                    SceneGraph.objStacks[Player.level][local19][local27] = new LinkedList();
                }
                SceneGraph.objStacks[Player.level][local19][local27].addTail(new ObjStackNode(local122));
                Static220.spawnGroundObject(local27, local19);
            }
        } else if (opcode == ServerProt.LOCATION_PACKET_121) {
            int local15 = inboundBuffer.g1();
            int local23 = Static115.currentChunkX * 2 + (local15 >> 4 & 0xF);
            int local19 = (local15 & 0xF) + Static180.currentChunkZ * 2;
            int local27 = local23 + inboundBuffer.g1s();
            int local31 = inboundBuffer.g1s() + local19;
            int local39 = inboundBuffer.g2s();
            int local45 = inboundBuffer.g2();
            int local218 = inboundBuffer.g1() * 4;
            int local224 = inboundBuffer.g1() * 4;
            int local228 = inboundBuffer.g2();
            int local232 = inboundBuffer.g2();
            int local236 = inboundBuffer.g1();
            if (local236 == 255) {
                local236 = -1;
            }
            int local247 = inboundBuffer.g1();
            if (local23 >= 0 && local19 >= 0 && local23 < 208 && local19 < 208 && local27 >= 0 && local31 >= 0 && local27 < 208 && local31 < 208 && local45 != 65535) {
                local31 *= 64;
                local27 = local27 * 64;
                local19 = local19 * 64;
                local23 = local23 * 64;
                ProjAnim local317 = new ProjAnim(local45, Player.level, local23, local19, SceneGraph.getTileHeight(Player.level, local23, local19) - local218, client.loop + local228, local232 + client.loop, local236, local247, local39, local224);
                local317.method3705(local31, client.loop + local228, -local224 + SceneGraph.getTileHeight(Player.level, local27, local31), local27);
                Static217.aClass69_116.addTail(new ProjAnimNode(local317));
            }
        } else if (opcode == ServerProt.LOCATION_PACKET_17) {
            int local15 = inboundBuffer.g1();
            int local23 = Static115.currentChunkX + (local15 >> 4 & 0x7);
            int local19 = Static180.currentChunkZ + (local15 & 0x7);
            int local27 = inboundBuffer.g2();
            int local31 = inboundBuffer.g1();
            int local39 = inboundBuffer.g2();
            if (local23 >= 0 && local19 >= 0 && local23 < 104 && local19 < 104) {
                local23 = local23 * 128 + 64;
                local19 = local19 * 128 + 64;
                @Pc(427) SpotAnim local427 = new SpotAnim(local27, Player.level, local23, local19, SceneGraph.getTileHeight(Player.level, local23, local19) - local31, local39, client.loop);
                Static99.aClass69_64.addTail(new SpotAnimNode(local427));
            }
        } else if (opcode == ServerProt.LOCATION_PACKET_179) {
            int local15 = inboundBuffer.g1add();
            int local23 = local15 >> 2;
            int local19 = local15 & 0x3;
            int local27 = Loc.LAYERS[local23];
            int local31 = inboundBuffer.g1();
            int local39 = Static115.currentChunkX + (local31 >> 4 & 0x7);
            int local45 = (local31 & 0x7) + Static180.currentChunkZ;
            int local218 = inboundBuffer.g2sub();
            if (local39 >= 0 && local45 >= 0 && local39 < 104 && local45 < 104) {
                ChangeLocRequest.push(Player.level, local45, local19, local39, -1, local218, local27, local23, 0);
            }
        } else if (opcode == ServerProt.LOCATION_PACKET_20) {
            int local15 = inboundBuffer.g1ssub();
            int local23 = (local15 >> 4 & 0x7) + Static115.currentChunkX;
            int local19 = Static180.currentChunkZ + (local15 & 0x7);
            int local27 = inboundBuffer.g1ssub();
            int local31 = local27 >> 2;
            int local39 = local27 & 0x3;
            int local45 = Loc.LAYERS[local31];
            int local218 = inboundBuffer.g2le();
            if (local218 == 65535) {
                local218 = -1;
            }
            Static92.method1881(Player.level, local39, local31, local19, local45, local23, local218);
        } else if (opcode == ServerProt.LOCATION_PACKET_202) {
            int local15 = inboundBuffer.g1();
            int local23 = local15 >> 2;
            int local19 = local15 & 0x3;
            int local27 = inboundBuffer.g1();
            int local31 = (local27 >> 4 & 0x7) + Static115.currentChunkX;
            int local39 = (local27 & 0x7) + Static180.currentChunkZ;
            @Pc(605) byte local605 = inboundBuffer.p1sub();
            @Pc(609) byte local609 = inboundBuffer.p1sub();
            @Pc(613) byte local613 = inboundBuffer.g1sub();
            int local228 = inboundBuffer.g2sub();
            int local232 = inboundBuffer.g2le();
            @Pc(625) byte local625 = inboundBuffer.g1s();
            int local247 = inboundBuffer.g2();
            int local633 = inboundBuffer.g2lesadd();
            if (!GlRenderer.enabled) {
                Static170.method2574(local625, local247, local633, local232, local39, local613, local19, local605, local31, local23, local609, local228);
            }
        } else if (opcode == ServerProt.LOCATION_PACKET_14) {
            int local15 = inboundBuffer.g1();
            int local19 = Static180.currentChunkZ + (local15 & 0x7);
            int local23 = (local15 >> 4 & 0x7) + Static115.currentChunkX;
            int local27 = inboundBuffer.g2();
            int local31 = inboundBuffer.g2();
            int local39 = inboundBuffer.g2();
            if (local23 >= 0 && local19 >= 0 && local23 < 104 && local19 < 104) {
                @Pc(710) LinkedList local710 = SceneGraph.objStacks[Player.level][local23][local19];
                if (local710 != null) {
                    for (@Pc(718) ObjStackNode local718 = (ObjStackNode) local710.head(); local718 != null; local718 = (ObjStackNode) local710.next()) {
                        @Pc(723) ObjStack local723 = local718.value;
                        if ((local27 & 0x7FFF) == local723.type && local31 == local723.anInt5550) {
                            local723.anInt5550 = local39;
                            break;
                        }
                    }
                    Static220.spawnGroundObject(local19, local23);
                }
            }
        } else if (opcode == ServerProt.LOCATION_PACKET_135) {
            int local15 = inboundBuffer.g2leadd();
            int local23 = inboundBuffer.g1neg();
            int local27 = Static180.currentChunkZ + (local23 & 0x7);
            int local19 = (local23 >> 4 & 0x7) + Static115.currentChunkX;
            int local31 = inboundBuffer.g2le();
            int local39 = inboundBuffer.g2le();
            if (local19 >= 0 && local27 >= 0 && local19 < 104 && local27 < 104 && PlayerList.selfId != local15) {
                @Pc(812) ObjStack local812 = new ObjStack();
                local812.anInt5550 = local31;
                local812.type = local39;
                if (SceneGraph.objStacks[Player.level][local19][local27] == null) {
                    SceneGraph.objStacks[Player.level][local19][local27] = new LinkedList();
                }
                SceneGraph.objStacks[Player.level][local19][local27].addTail(new ObjStackNode(local812));
                Static220.spawnGroundObject(local27, local19);
            }
        } else if (opcode == ServerProt.LOCATION_PACKET_16) {
            int local15 = inboundBuffer.g1();
            int local23 = Static115.currentChunkX + (local15 >> 4 & 0x7);
            int local19 = (local15 & 0x7) + Static180.currentChunkZ;
            int local27 = local23 + inboundBuffer.g1s();
            int local31 = inboundBuffer.g1s() + local19;
            int local39 = inboundBuffer.g2s();
            int local45 = inboundBuffer.g2();
            int local218 = inboundBuffer.g1() * 4;
            int local224 = inboundBuffer.g1() * 4;
            int local228 = inboundBuffer.g2();
            int local232 = inboundBuffer.g2();
            int local236 = inboundBuffer.g1();
            int local247 = inboundBuffer.g1();
            if (local236 == 255) {
                local236 = -1;
            }
            if (local23 >= 0 && local19 >= 0 && local23 < 104 && local19 < 104 && local27 >= 0 && local31 >= 0 && local27 < 104 && local31 < 104 && local45 != 65535) {
                local31 = local31 * 128 + 64;
                local19 = local19 * 128 + 64;
                local23 = local23 * 128 + 64;
                local27 = local27 * 128 + 64;
                ProjAnim local317 = new ProjAnim(local45, Player.level, local23, local19, SceneGraph.getTileHeight(Player.level, local23, local19) - local218, local228 + client.loop, local232 + client.loop, local236, local247, local39, local224);
                local317.method3705(local31, client.loop + local228, SceneGraph.getTileHeight(Player.level, local27, local31) - local224, local27);
                Static217.aClass69_116.addTail(new ProjAnimNode(local317));
            }
        } else if (opcode == ServerProt.LOCATION_PACKET_104) {
            int local15 = inboundBuffer.g1();
            int local19 = Static180.currentChunkZ * 2 + (local15 & 0xF);
            int local23 = Static115.currentChunkX * 2 + (local15 >> 4 & 0xF);
            int local27 = inboundBuffer.g1s() + local23;
            int local31 = inboundBuffer.g1s() + local19;
            int local39 = inboundBuffer.g2s();
            int local45 = inboundBuffer.g2s();
            int local218 = inboundBuffer.g2();
            int local224 = inboundBuffer.g1s();
            int local228 = inboundBuffer.g1() * 4;
            int local232 = inboundBuffer.g2();
            int local236 = inboundBuffer.g2();
            int local247 = inboundBuffer.g1();
            int local633 = inboundBuffer.g1();
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
                        @Pc(1232) BasType local1232 = local1198.getBasType();
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
            int local15 = inboundBuffer.g1();
            int local23 = Static115.currentChunkX + (local15 >> 4 & 0x7);
            int local19 = Static180.currentChunkZ + (local15 & 0x7);
            int local27 = inboundBuffer.g2();
            if (local27 == 65535) {
                local27 = -1;
            }
            int local31 = inboundBuffer.g1();
            int local39 = local31 >> 4 & 0xF;
            int local218 = inboundBuffer.g1();
            int local45 = local31 & 0x7;
            if (local23 >= 0 && local19 >= 0 && local23 < 104 && local19 < 104) {
                int local224 = local39 + 1;
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
            int local15 = inboundBuffer.g1ssub();
            int local19 = Static180.currentChunkZ + (local15 & 0x7);
            int local23 = (local15 >> 4 & 0x7) + Static115.currentChunkX;
            int local27 = inboundBuffer.g2();
            if (local23 >= 0 && local19 >= 0 && local23 < 104 && local19 < 104) {
                @Pc(1565) LinkedList local1565 = SceneGraph.objStacks[Player.level][local23][local19];
                if (local1565 != null) {
                    for (@Pc(1572) ObjStackNode local1572 = (ObjStackNode) local1565.head(); local1572 != null; local1572 = (ObjStackNode) local1565.next()) {
                        if (local1572.value.type == (local27 & 0x7FFF)) {
                            local1572.unlink();
                            break;
                        }
                    }
                    if (local1565.head() == null) {
                        SceneGraph.objStacks[Player.level][local23][local19] = null;
                    }
                    Static220.spawnGroundObject(local19, local23);
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
                    Static72.regionsXteaKeys[local26][local31] = inboundBuffer.g4me();
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
                        Static36.mapFileIds[local20] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { Static103.aClass100_558, JagString.parseInt(local138), Static86.UNDERSCORE, JagString.parseInt(local151) }));
                        Static172.locationsMapFileIds[local20] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { Static270.aClass100_1090, JagString.parseInt(local138), Static86.UNDERSCORE, JagString.parseInt(local151) }));
                        Static99.underWaterMapFileIds[local20] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { Static165.aClass100_772, JagString.parseInt(local138), Static86.UNDERSCORE, JagString.parseInt(local151) }));
                        Static35.underWaterLocationsMapFileIds[local20] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { Static278.aClass100_1103, JagString.parseInt(local138), Static86.UNDERSCORE, JagString.parseInt(local151) }));
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
                Static72.regionsXteaKeys[local64][local391] = inboundBuffer.g4me();
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
                            Static36.mapFileIds[local60] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { Static103.aClass100_558, JagString.parseInt(local573), Static86.UNDERSCORE, JagString.parseInt(local609) }));
                            Static172.locationsMapFileIds[local60] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { Static270.aClass100_1090, JagString.parseInt(local573), Static86.UNDERSCORE, JagString.parseInt(local609) }));
                            Static99.underWaterMapFileIds[local60] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { Static165.aClass100_772, JagString.parseInt(local573), Static86.UNDERSCORE, JagString.parseInt(local609) }));
                            Static35.underWaterLocationsMapFileIds[local60] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { Static278.aClass100_1103, JagString.parseInt(local573), Static86.UNDERSCORE, JagString.parseInt(local609) }));
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
                        Chat.add(local106, local35 ? 17 : 1, message, null, JagString.concatenate(new JagString[] { Static44.IMG1, player.getName() }));
                    } else if (int2 == 1) {
                        Chat.add(local106, local35 ? 17 : 1, message, null, JagString.concatenate(new JagString[] { Static65.IMG0, player.getName() }));
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
            player.anInt3380 = inboundBuffer.g1neg();
            player.anInt3428 = inboundBuffer.g1();
            player.anInt3416 = inboundBuffer.g1add();
            player.anInt3392 = inboundBuffer.g1();
            player.anInt3395 = inboundBuffer.g2le() + client.loop;
            player.anInt3386 = inboundBuffer.g2le() + client.loop;
            player.anInt3431 = inboundBuffer.g1neg();
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
            int1 = inboundBuffer.g1neg();
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
            int2 = inboundBuffer.g4me();
            @Pc(573) boolean local573 = true;
            if (int1 != -1 && player.spotAnimId != -1 && SeqTypeList.get(SpotAnimTypeList.get(int1).seqId).forcedPriority < SeqTypeList.get(SpotAnimTypeList.get(player.spotAnimId).seqId).forcedPriority) {
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
        } else if (length == -2) {
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
        opcode4 = opcode3;
        opcode3 = opcode2;
        opcode2 = opcode;
        Static201.anInt1862 = 0;

        if (opcode == ServerProt.VARP_SMALL) {
            int id = inboundBuffer.g2sub();
            @Pc(137) byte value = inboundBuffer.g1sneg();
            VarpDomain.set(value, id);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.RUN_CS2) {
            int tracknum = inboundBuffer.g2();
            JagString argTypes = inboundBuffer.gjstr();
            @Pc(163) Object[] scriptArgs = new Object[argTypes.length() + 1];
            for (int i = argTypes.length() - 1; i >= 0; i--) {
                if (argTypes.charAt(i) == 115) {
                    scriptArgs[i + 1] = inboundBuffer.gjstr();
                } else {
                    scriptArgs[i + 1] = inboundBuffer.g4();
                }
            }
            scriptArgs[0] = inboundBuffer.g4();
            setVerifyId(tracknum);
            @Pc(226) HookRequest request = new HookRequest();
            request.arguments = scriptArgs;
            ScriptRunner.run(request);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.MESSAGE_GAME) {
            @Pc(245) JagString message = inboundBuffer.gjstr();
            if (message.endsWith(TRADEREQ)) {
                JagString name = message.substring(message.indexOf(Static264.COLON), 0);
                long name37 = name.encode37();
                boolean ignored = false;
                for (int i = 0; i < IgnoreList.size; i++) {
                    if (IgnoreList.encodedUsernames[i] == name37) {
                        ignored = true;
                        break;
                    }
                }
                if (!ignored && Player.inTutorialIsland == 0) {
                    Chat.add(name, 4, LocalizedText.TRADEREQ);
                }
            } else if (message.endsWith(Static61.CHALREQ)) {
                JagString name = message.substring(message.indexOf(Static264.COLON), 0);
                long name37 = name.encode37();
                boolean ignored = false;
                for (int i = 0; i < IgnoreList.size; i++) {
                    if (IgnoreList.encodedUsernames[i] == name37) {
                        ignored = true;
                        break;
                    }
                }
                if (!ignored && Player.inTutorialIsland == 0) {
                    JagString local506 = message.substring(message.length() - 9, message.indexOf(Static264.COLON) + 1);
                    Chat.add(name, 8, local506);
                }
            } else if (message.endsWith(Static191.ASSISTREQ)) {
                JagString name = message.substring(message.indexOf(Static264.COLON), 0);
                long name37 = name.encode37();
                boolean ignored = false;
                for (int i = 0; i < IgnoreList.size; i++) {
                    if (name37 == IgnoreList.encodedUsernames[i]) {
                        ignored = true;
                        break;
                    }
                }
                if (!ignored && Player.inTutorialIsland == 0) {
                    Chat.add(name, 10, JagString.EMPTY);
                }
            } else if (message.endsWith(CLAN)) {
                JagString name = message.substring(message.indexOf(CLAN), 0);
                Chat.add(JagString.EMPTY, 11, name);
            } else if (message.endsWith(Static138.TRADE)) {
                JagString name = message.substring(message.indexOf(Static138.TRADE), 0);
                if (Player.inTutorialIsland == 0) {
                    Chat.add(JagString.EMPTY, 12, name);
                }
            } else if (message.endsWith(ASSIST)) {
                JagString name = message.substring(message.indexOf(ASSIST), 0);
                if (Player.inTutorialIsland == 0) {
                    Chat.add(JagString.EMPTY, 13, name);
                }
            } else if (message.endsWith(Static56.DUELSTAKE)) {
                JagString name = message.substring(message.indexOf(Static264.COLON), 0);
                long name37 = name.encode37();
                boolean ignored = false;
                for (int i = 0; i < IgnoreList.size; i++) {
                    if (name37 == IgnoreList.encodedUsernames[i]) {
                        ignored = true;
                        break;
                    }
                }
                if (!ignored && Player.inTutorialIsland == 0) {
                    Chat.add(name, 14, JagString.EMPTY);
                }
            } else if (message.endsWith(DUELFRIEND)) {
                JagString name = message.substring(message.indexOf(Static264.COLON), 0);
                long name37 = name.encode37();
                boolean ignored = false;
                for (int local277 = 0; local277 < IgnoreList.size; local277++) {
                    if (IgnoreList.encodedUsernames[local277] == name37) {
                        ignored = true;
                        break;
                    }
                }
                if (!ignored && Player.inTutorialIsland == 0) {
                    Chat.add(name, 15, JagString.EMPTY);
                }
            } else if (message.endsWith(Static217.aClass100_916)) {
                JagString name = message.substring(message.indexOf(Static264.COLON), 0);
                long name37 = name.encode37();
                boolean ignored = false;
                for (int i = 0; i < IgnoreList.size; i++) {
                    if (name37 == IgnoreList.encodedUsernames[i]) {
                        ignored = true;
                        break;
                    }
                }
                if (!ignored && Player.inTutorialIsland == 0) {
                    Chat.add(name, 16, JagString.EMPTY);
                }
            } else if (message.endsWith(Static164.aClass100_770)) {
                JagString name = message.substring(message.indexOf(Static264.COLON), 0);
                long name37 = name.encode37();
                boolean ignored = false;
                for (int i = 0; i < IgnoreList.size; i++) {
                    if (IgnoreList.encodedUsernames[i] == name37) {
                        ignored = true;
                        break;
                    }
                }
                if (!ignored && Player.inTutorialIsland == 0) {
                    JagString local506 = message.substring(message.length() - 9, message.indexOf(Static264.COLON) + 1);
                    Chat.add(name, 21, local506);
                }
            } else {
                Chat.add(JagString.EMPTY, 0, message);
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.IF_SETTEXT3) {
            int id = inboundBuffer.g2le();
            int tracknum = inboundBuffer.g2sub();
            JagString value = inboundBuffer.gjstr();
            setVerifyId(tracknum);
            DelayedStateChange.method3498(value, id);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.BATCH_LOCATION_PACKET) {
            Static180.currentChunkZ = inboundBuffer.g1add();
            Static115.currentChunkX = inboundBuffer.g1ssub();
            while (length > inboundBuffer.offset) {
                opcode = inboundBuffer.g1();
                readLocationPacket();
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.CLEAR_MINIMAP_FLAG) {
            opcode = -1;
            Static115.mapFlagX = 0;
            return true;
        } else if (opcode == ServerProt.IF_SETSCROLLPOS) {
            int id = inboundBuffer.g4me();
            int pos = inboundBuffer.g2le();
            int tracknum = inboundBuffer.g2();
            setVerifyId(tracknum);
            DelayedStateChange.method3938(pos, id);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.CLAN_QUICK_CHAT) {
            long name37 = inboundBuffer.g8();
            inboundBuffer.g1s();
            long clan37 = inboundBuffer.g8();
            int top = inboundBuffer.g2();
            int bot = inboundBuffer.g3();
            int rights = inboundBuffer.g1();
            int quickchatId = inboundBuffer.g2();

            @Pc(910) boolean ignored = false;
            @Pc(922) long messageId = ((long)top << 32) + bot;
            @Pc(924) int n = 0;

            check:
            while (true) {
                if (n < 100) {
                    if (messageId != Chat.recentMessages[n]) {
                        n++;
                        continue;
                    }
                    ignored = true;
                    break;
                }
                if (rights <= 1) {
                    for (n = 0; n < IgnoreList.size; n++) {
                        if (IgnoreList.encodedUsernames[n] == name37) {
                            ignored = true;
                            break check;
                        }
                    }
                }
                break;
            }
            if (!ignored && Player.inTutorialIsland == 0) {
                Chat.recentMessages[Chat.messageCounter] = messageId;
                Chat.messageCounter = (Chat.messageCounter + 1) % 100;
                @Pc(999) JagString message = QuickChatPhraseTypeList.get(quickchatId).decodeMessage(inboundBuffer);
                if (rights == 2 || rights == 3) {
                    Chat.add(quickchatId, 20, message, Base37.decode37(clan37).toTitleCase(), JagString.concatenate(new JagString[] { Static44.IMG1, Base37.decode37(name37).toTitleCase() }));
                } else if (rights == 1) {
                    Chat.add(quickchatId, 20, message, Base37.decode37(clan37).toTitleCase(), JagString.concatenate(new JagString[] { Static65.IMG0, Base37.decode37(name37).toTitleCase() }));
                } else {
                    Chat.add(quickchatId, 20, message, Base37.decode37(clan37).toTitleCase(), Base37.decode37(name37).toTitleCase());
                }
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.JOIN_CLAN_CHAT) {
            ClanChat.transmitAt = InterfaceList.transmitTimer;
            long owner37 = inboundBuffer.g8();
            if (owner37 == 0L) {
                ClanChat.owner = null;
                opcode = -1;
                ClanChat.name = null;
                ClanChat.members = null;
                ClanChat.size = 0;
                return true;
            }

            long name37 = inboundBuffer.g8();
            ClanChat.name = Base37.decode37(name37);
            ClanChat.owner = Base37.decode37(owner37);
            ClanChat.minKick = inboundBuffer.g1s();
            int clanSize = inboundBuffer.g1();
            if (clanSize == 255) {
                opcode = -1;
                return true;
            }

            ClanChat.size = clanSize;
            @Pc(1158) ClanMember[] members = new ClanMember[100];
            for (int i = 0; i < ClanChat.size; i++) {
                members[i] = new ClanMember();
                members[i].key = inboundBuffer.g8();
                members[i].username = Base37.decode37(members[i].key);
                members[i].world = inboundBuffer.g2();
                members[i].rank = inboundBuffer.g1s();
                members[i].worldName = inboundBuffer.gjstr();
                if (members[i].key == Player.name37) {
                    ClanChat.rank = members[i].rank;
                }
            }

            int count = ClanChat.size;
            while (count > 0) {
                boolean local1245 = true;
                count--;
                for (int i = 0; i < count; i++) {
                    if (members[i].username.method3139(members[i + 1].username) > 0) {
                        local1245 = false;
                        @Pc(1279) ClanMember member = members[i];
                        members[i] = members[i + 1];
                        members[i + 1] = member;
                    }
                }
                if (local1245) {
                    break;
                }
            }
            ClanChat.members = members;
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.LAST_LOGIN_INFO) {
            int ip32 = inboundBuffer.g4rme();
            Player.lastLogAddress = GameShell.signLink.getReverseDns(ip32);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.PLAYER_INFO) {
            readPlayerInfoPacket();
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.IF_SETTEXT2) {
            int tracknum = inboundBuffer.g2();
            JagString text = inboundBuffer.gjstr();
            int id = inboundBuffer.g2leadd();
            setVerifyId(tracknum);
            DelayedStateChange.method3498(text, id);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.CHAT_FILTER_SETTINGS) {
            Chat.publicFilter = inboundBuffer.g1();
            Chat.privateFilter = inboundBuffer.g1();
            Chat.tradeFilter = inboundBuffer.g1();
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.SET_INTERACTION) {
            int cursor = inboundBuffer.g2leadd();
            if (cursor == 65535) {
                cursor = -1;
            }
            int top = inboundBuffer.g1();
            int optId = inboundBuffer.g1();
            JagString option = inboundBuffer.gjstr();
            if (optId >= 1 && optId <= 8) {
                if (option.equalsIgnoreCase(Static92.NULL)) {
                    option = null;
                }
                Player.options[optId - 1] = option;
                Player.cursors[optId - 1] = cursor;
                Player.secondaryOptions[optId - 1] = top == 0;
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.VARP_LARGE) {
            int value = inboundBuffer.g4();
            int id = inboundBuffer.g2sub();
            VarpDomain.set(value, id);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.IF_SETHIDE) {
            int parent = inboundBuffer.g1neg();
            int tracknum = inboundBuffer.g2();
            int reset = inboundBuffer.g4le();
            setVerifyId(tracknum);
            DelayedStateChange.method2905(reset, parent);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.IF_OPENSUB) {
            int parent = inboundBuffer.g2leadd();
            int reset = inboundBuffer.g1add();
            int tracknum = inboundBuffer.g2leadd();
            setVerifyId(tracknum);
            if (reset == 2) {
                WorldMap.reset();
            }
            InterfaceList.topLevelInterface = parent;
            Static81.method1753(parent);
            Static210.method3712(false);
            Static74.method1626(InterfaceList.topLevelInterface);
            for (int i = 0; i < 100; i++) {
                Static186.aBooleanArray100[i] = true;
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.CLIENT_SETVARC_LARGE) {
            int tracknum = inboundBuffer.g2leadd();
            int value = inboundBuffer.g4();
            int id = inboundBuffer.g2sub();
            setVerifyId(tracknum);
            DelayedStateChange.updateVarC(id, value);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.MESSAGE_QUICKCHAT_PRIVATE_ECHO) {
            long name37 = inboundBuffer.g8();
            int chatId = inboundBuffer.g2();
            JagString message = QuickChatPhraseTypeList.get(chatId).decodeMessage(inboundBuffer);
            Chat.add(chatId, 19, message, null, Base37.decode37(name37).toTitleCase());
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.UPDATE_UID192) {
            Static271.writeRandom(inboundBuffer);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.RESET_CLIENT_VARCACHE) {
            VarpDomain.reset();
            InterfaceList.redrawActiveInterfaces();
            VarpDomain.updatedVarpsWriterIndex += 32;
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.CAM_LOOKAT) {
            int tracknum = inboundBuffer.g2();
            int tx = inboundBuffer.g1();
            int tz = inboundBuffer.g1();
            int cy = inboundBuffer.g2();
            int step = inboundBuffer.g1();
            int dur = inboundBuffer.g1();
            setVerifyId(tracknum);
            Camera.method3849(cy, tz, step, tx, dur);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.IF_SETANIM) {
            int id = inboundBuffer.g4me();
            int value = inboundBuffer.g2les();
            int tracknum = inboundBuffer.g2sub();
            setVerifyId(tracknum);
            DelayedStateChange.method3893(id, value);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.WIDGETSTRUCT_SETTING) {
            int value = inboundBuffer.g2leadd();
            int parent = inboundBuffer.g4le();
            int tracknum = inboundBuffer.g2sub();
            int end = inboundBuffer.g2le();
            if (end == 65535) {
                end = -1;
            }
            int start = inboundBuffer.g2sub();
            if (start == 65535) {
                start = -1;
            }
            setVerifyId(tracknum);
            ServerActiveProperties properties;
            for (int slot = start; slot <= end; slot++) {
                long ptr = (long) slot + ((long) parent << 32);
                ServerActiveProperties prev = (ServerActiveProperties) InterfaceList.properties.get(ptr);
                if (prev != null) {
                    properties = new ServerActiveProperties(prev.accessMask, value);
                    prev.unlink();
                } else if (slot == -1) {
                    properties = new ServerActiveProperties(InterfaceList.getComponent(parent).properties.accessMask, value);
                } else {
                    properties = new ServerActiveProperties(0, value);
                }
                InterfaceList.properties.put(properties, ptr);
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.SPOTANIM_SPECIFIC) {
            int delay = inboundBuffer.g2();
            int height = inboundBuffer.g2le();
            int target = inboundBuffer.g4rme();
            int gfxId = inboundBuffer.g2leadd();
            if (target >> 30 == 0) {
                @Pc(1994) SeqType seq;
                if (target >> 29 != 0) {
                    int npcId = target & 0xFFFF;
                    @Pc(1894) Npc npc = NpcList.npcs[npcId];
                    if (npc != null) {
                        if (gfxId == 65535) {
                            gfxId = -1;
                        }
                        boolean animated = gfxId == -1 || npc.spotAnimId == -1 || SeqTypeList.get(SpotAnimTypeList.get(gfxId).seqId).forcedPriority >= SeqTypeList.get(SpotAnimTypeList.get(npc.spotAnimId).seqId).forcedPriority;
                        if (animated) {
                            npc.anInt3361 = 0;
                            npc.spotAnimId = gfxId;
                            npc.spotAnimStart = client.loop + delay;
                            npc.anInt3399 = 0;
                            if (npc.spotAnimStart > client.loop) {
                                npc.anInt3399 = -1;
                            }
                            npc.spotAnimY = height;
                            npc.anInt3418 = 1;
                            if (npc.spotAnimId != -1 && client.loop == npc.spotAnimStart) {
                                int seqId = SpotAnimTypeList.get(npc.spotAnimId).seqId;
                                if (seqId != -1) {
                                    seq = SeqTypeList.get(seqId);
                                    if (seq.frames != null) {
                                        SoundPlayer.playSeqSound(npc.zFine, seq, npc.xFine, false, 0);
                                    }
                                }
                            }
                        }
                    }
                } else if (target >> 28 != 0) {
                    int playerId = target & 0xFFFF;
                    @Pc(2033) Player player;
                    if (PlayerList.selfId == playerId) {
                        player = PlayerList.self;
                    } else {
                        player = PlayerList.players[playerId];
                    }
                    if (player != null) {
                        if (gfxId == 65535) {
                            gfxId = -1;
                        }
                        boolean animated = gfxId == -1 || player.spotAnimId == -1 || SeqTypeList.get(SpotAnimTypeList.get(gfxId).seqId).forcedPriority >= SeqTypeList.get(SpotAnimTypeList.get(player.spotAnimId).seqId).forcedPriority;
                        if (animated) {
                            player.spotAnimStart = delay + client.loop;
                            player.spotAnimY = height;
                            player.spotAnimId = gfxId;
                            player.anInt3418 = 1;
                            player.anInt3361 = 0;
                            player.anInt3399 = 0;
                            if (player.spotAnimStart > client.loop) {
                                player.anInt3399 = -1;
                            }
                            if (player.spotAnimId != -1 && player.spotAnimStart == client.loop) {
                                int seqId = SpotAnimTypeList.get(player.spotAnimId).seqId;
                                if (seqId != -1) {
                                    seq = SeqTypeList.get(seqId);
                                    if (seq.frames != null) {
                                        SoundPlayer.playSeqSound(player.zFine, seq, player.xFine, player == PlayerList.self, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                int plane = target >> 28 & 0x3;
                int posX = (target >> 14 & 0x3FFF) - Camera.originX;
                int posZ = (target & 0x3FFF) - Camera.originZ;
                if (posX >= 0 && posZ >= 0 && posX < 104 && posZ < 104) {
                    posZ = posZ * 128 + 64;
                    posX = posX * 128 + 64;
                    @Pc(2241) SpotAnim spotAnim = new SpotAnim(gfxId, plane, posX, posZ, SceneGraph.getTileHeight(plane, posX, posZ) - height, delay, client.loop);
                    Static99.aClass69_64.addTail(new SpotAnimNode(spotAnim));
                }
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.INTERFACE_ANIMATE_ROTATE) {
            int ptr = inboundBuffer.g4me();
            int tracknum = inboundBuffer.g2sub();
            int pitchStep = inboundBuffer.g2();
            int yawStep = inboundBuffer.g2sub();
            setVerifyId(tracknum);
            DelayedStateChange.setComponentModelRotationSpeedServer(yawStep + (pitchStep << 16), ptr);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.UPDATE_STAT) {
            InterfaceList.redrawActiveInterfaces();
            int level = inboundBuffer.g1add();
            int xp = inboundBuffer.g4rme();
            int skill = inboundBuffer.g1();
            PlayerSkillXpTable.experience[skill] = xp;
            PlayerSkillXpTable.boostedLevels[skill] = level;
            PlayerSkillXpTable.baseLevels[skill] = 1;
            for (int i = 0; i < 98; i++) {
                if (PlayerSkillXpTable.xpLevelLookup[i] <= xp) {
                    PlayerSkillXpTable.baseLevels[skill] = i + 2;
                }
            }
            PlayerSkillXpTable.updatedStats[PlayerSkillXpTable.updatedStatsWriterIndex++ & 0x1F] = skill;
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.LOCATION_PACKET_104 || opcode == ServerProt.LOCATION_PACKET_121 || opcode == ServerProt.LOCATION_PACKET_97 || opcode == ServerProt.LOCATION_PACKET_14 || opcode == ServerProt.LOCATION_PACKET_202 || opcode == ServerProt.LOCATION_PACKET_135 || opcode == ServerProt.LOCATION_PACKET_17 || opcode == ServerProt.LOCATION_PACKET_16 || opcode == ServerProt.LOCATION_PACKET_240 || opcode == ServerProt.LOCATION_PACKET_33 || opcode == ServerProt.LOCATION_PACKET_20 || opcode == ServerProt.LOCATION_PACKET_195 || opcode == ServerProt.LOCATION_PACKET_179) {
            readLocationPacket();
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.IF_CLOSESUB) {
            int tracknum = inboundBuffer.g2();
            int id = inboundBuffer.g4();
            setVerifyId(tracknum);
            @Pc(2441) ComponentPointer pointer = (ComponentPointer) InterfaceList.openInterfaces.get(id);
            if (pointer != null) {
                Static132.closeInterface(true, pointer);
            }
            if (Static39.aClass13_10 != null) {
                InterfaceList.redraw(Static39.aClass13_10);
                Static39.aClass13_10 = null;
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.CAM_FORCEANGLE) {
            int yaw = inboundBuffer.g2le();
            int tracknum = inboundBuffer.g2();
            int pitch = inboundBuffer.g2();
            setVerifyId(tracknum);
            Camera.yawTarget = yaw;
            Camera.pitchTarget = pitch;
            if (Camera.cameraType == 2) {
                Camera.cameraPitch = (int)Camera.pitchTarget;
                Camera.cameraYaw = (int)Camera.yawTarget;
            }
            Camera.clampCameraAngle();
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.IF_SETANGLE) {
            int pitch = inboundBuffer.g2();
            int tracknum = inboundBuffer.g2sub();
            int scale = inboundBuffer.g2leadd();
            int yaw = inboundBuffer.g2leadd();
            int ptr = inboundBuffer.g4();
            setVerifyId(tracknum);
            DelayedStateChange.updateView(scale, ptr, yaw, pitch);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.CLEAR_GROUND_ITEMS) {
            Static115.currentChunkX = inboundBuffer.g1();
            Static180.currentChunkZ = inboundBuffer.g1neg();
            for (int x = Static115.currentChunkX; x < Static115.currentChunkX + 8; x++) {
                for (int z = Static180.currentChunkZ; z < Static180.currentChunkZ + 8; z++) {
                    if (SceneGraph.objStacks[Player.level][x][z] != null) {
                        SceneGraph.objStacks[Player.level][x][z] = null;
                        Static220.spawnGroundObject(z, x);
                    }
                }
            }
            for (@Pc(2604) SceneryStack loc = (SceneryStack) Static26.sceneryList.head(); loc != null; loc = (SceneryStack) Static26.sceneryList.next()) {
                if (loc.x >= Static115.currentChunkX && Static115.currentChunkX + 8 > loc.x && loc.z >= Static180.currentChunkZ && loc.z < Static180.currentChunkZ + 8 && loc.level == Player.level) {
                    loc.anInt924 = 0;
                }
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.INTERFACE_ITEMS_CLEAR) {
            int id = inboundBuffer.g4me();
            @Pc(2666) Component component = InterfaceList.getComponent(id);
            for (int i = 0; i < component.objTypes.length; i++) {
                component.objTypes[i] = -1;
                component.objTypes[i] = 0;
            }
            InterfaceList.redraw(component);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.IF_SETMODEL) {
            int id = inboundBuffer.g4le();
            int tracknum = inboundBuffer.g2leadd();
            int modelId = inboundBuffer.g2sub();
            if (modelId == 65535) {
                modelId = -1;
            }
            setVerifyId(tracknum);
            DelayedStateChange.updateComponentModel(-1, 1, id, modelId);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.SET_MINIMAP_STATE) {
            MiniMap.state = inboundBuffer.g1();
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.TELEPORT_LOCAL_PLAYER) {
            int pos1 = inboundBuffer.g1ssub();
            int flags = inboundBuffer.g1add();
            int pos2 = inboundBuffer.g1();
            Player.level = flags >> 1;
            PlayerList.self.teleport(pos1, (flags & 0x1) == 1, pos2);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.UPDATE_FRIENDLIST) {
            long name37 = inboundBuffer.g8();
            int worldId = inboundBuffer.g2();
            int x = inboundBuffer.g1();
            boolean ignored = true;
            if (name37 < 0L) {
                name37 &= Long.MAX_VALUE;
                ignored = false;
            }
            JagString worldName = JagString.EMPTY;
            if (worldId > 0) {
                worldName = inboundBuffer.gjstr();
            }
            @Pc(2834) JagString name = Base37.decode37(name37).toTitleCase();
            for (int i = 0; i < FriendsList.size; i++) {
                if (name37 == FriendsList.encodedUsernames[i]) {
                    if (worldId != FriendsList.worlds[i]) {
                        FriendsList.worlds[i] = worldId;
                        if (worldId > 0) {
                            Chat.add(JagString.EMPTY, 5, JagString.concatenate(new JagString[] { name, LocalizedText.FRIENDLOGIN}));
                        }
                        if (worldId == 0) {
                            Chat.add(JagString.EMPTY, 5, JagString.concatenate(new JagString[] { name, LocalizedText.FRIENDLOGOUT}));
                        }
                    }
                    FriendsList.worldNames[i] = worldName;
                    FriendsList.ranks[i] = x;
                    name = null;
                    FriendsList.aBooleanArray135[i] = ignored;
                    break;
                }
            }
            if (name != null && FriendsList.size < 200) {
                FriendsList.encodedUsernames[FriendsList.size] = name37;
                FriendsList.usernames[FriendsList.size] = name;
                FriendsList.worlds[FriendsList.size] = worldId;
                FriendsList.worldNames[FriendsList.size] = worldName;
                FriendsList.ranks[FriendsList.size] = x;
                FriendsList.aBooleanArray135[FriendsList.size] = ignored;
                FriendsList.size++;
            }
            FriendsList.transmitAt = InterfaceList.transmitTimer;
            int friendCount = FriendsList.size;
            while (friendCount > 0) {
                friendCount--;
                @Pc(2961) boolean sorting = true;
                for (int i = 0; i < friendCount; i++) {
                    if (FriendsList.worlds[i] != Player.worldId && Player.worldId == FriendsList.worlds[i + 1] || FriendsList.worlds[i] == 0 && FriendsList.worlds[i + 1] != 0) {
                        sorting = false;
                        int local3002 = FriendsList.worlds[i];
                        FriendsList.worlds[i] = FriendsList.worlds[i + 1];
                        FriendsList.worlds[i + 1] = local3002;
                        JagString local3020 = FriendsList.worldNames[i];
                        FriendsList.worldNames[i] = FriendsList.worldNames[i + 1];
                        FriendsList.worldNames[i + 1] = local3020;
                        JagString local3038 = FriendsList.usernames[i];
                        FriendsList.usernames[i] = FriendsList.usernames[i + 1];
                        FriendsList.usernames[i + 1] = local3038;
                        @Pc(3056) long local3056 = FriendsList.encodedUsernames[i];
                        FriendsList.encodedUsernames[i] = FriendsList.encodedUsernames[i + 1];
                        FriendsList.encodedUsernames[i + 1] = local3056;
                        @Pc(3074) int local3074 = FriendsList.ranks[i];
                        FriendsList.ranks[i] = FriendsList.ranks[i + 1];
                        FriendsList.ranks[i + 1] = local3074;
                        @Pc(3092) boolean local3092 = FriendsList.aBooleanArray135[i];
                        FriendsList.aBooleanArray135[i] = FriendsList.aBooleanArray135[i + 1];
                        FriendsList.aBooleanArray135[i + 1] = local3092;
                    }
                }
                if (sorting) {
                    break;
                }
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.SET_WALK_TEXT) {
            if (length == 0) {
                Static195.walkText = LocalizedText.WALKHERE;
            } else {
                Static195.walkText = inboundBuffer.gjstr();
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.FORCE_VARP_REFRESH) {
            for (int i = 0; i < VarpDomain.activeVarps.length; i++) {
                if (VarpDomain.varp[i] != VarpDomain.activeVarps[i]) {
                    VarpDomain.activeVarps[i] = VarpDomain.varp[i];
                    Static85.refreshMagicVarp(i);
                    VarpDomain.updatedVarps[VarpDomain.updatedVarpsWriterIndex++ & 0x1F] = i;
                }
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.CAMERA_DETACH) {
            int tracknum = inboundBuffer.g2();
            int local786 = inboundBuffer.g1();
            int modelId = inboundBuffer.g1();
            int counter = inboundBuffer.g2();
            int local1146 = inboundBuffer.g1();
            int local277 = inboundBuffer.g1();
            setVerifyId(tracknum);
            Camera.method2722(true, local1146, counter, local277, modelId, local786);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.MESSAGE_QUICKCHAT_PRIVATE) {
            long name = inboundBuffer.g8();
            int top = inboundBuffer.g2();
            int bot = inboundBuffer.g3();
            int rights = inboundBuffer.g1();
            int chatId = inboundBuffer.g2();

            @Pc(3263) boolean ignore = false;
            @Pc(3270) long messageId = ((long)top << 32) + bot;
            @Pc(3272) int ix = 0;

            check:
            while (true) {
                if (ix < 100) {
                    if (messageId != Chat.recentMessages[ix]) {
                        ix++;
                        continue;
                    }
                    ignore = true;
                    break;
                }
                if (rights <= 1) {
                    for (ix = 0; ix < IgnoreList.size; ix++) {
                        if (name == IgnoreList.encodedUsernames[ix]) {
                            ignore = true;
                            break check;
                        }
                    }
                }
                break;
            }
            if (!ignore && Player.inTutorialIsland == 0) {
                Chat.recentMessages[Chat.messageCounter] = messageId;
                Chat.messageCounter = (Chat.messageCounter + 1) % 100;
                JagString message = QuickChatPhraseTypeList.get(chatId).decodeMessage(inboundBuffer);
                if (rights == 2) {
                    Chat.add(chatId, 18, message, null, JagString.concatenate(new JagString[] { Static44.IMG1, Base37.decode37(name).toTitleCase() }));
                } else if (rights == 1) {
                    Chat.add(chatId, 18, message, null, JagString.concatenate(new JagString[] { Static65.IMG0, Base37.decode37(name).toTitleCase() }));
                } else {
                    Chat.add(chatId, 18, message, null, Base37.decode37(name).toTitleCase());
                }
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.SWITCH_WIDGET) {
            int source = inboundBuffer.g4rme();
            int tracknum = inboundBuffer.g2sub();
            int target = inboundBuffer.g4rme();
            setVerifyId(tracknum);
            @Pc(3449) ComponentPointer src = (ComponentPointer) InterfaceList.openInterfaces.get((long) source);
            ComponentPointer tgt = (ComponentPointer) InterfaceList.openInterfaces.get((long) target);
            if (tgt != null) {
                Static132.closeInterface(src == null || tgt.anInt5878 != src.anInt5878, tgt);
            }
            if (src != null) {
                src.unlink();
                InterfaceList.openInterfaces.put(src, (long) target);
            }
            @Pc(3490) Component component = InterfaceList.getComponent(source);
            if (component != null) {
                InterfaceList.redraw(component);
            }
            component = InterfaceList.getComponent(target);
            if (component != null) {
                InterfaceList.redraw(component);
                Static17.method531(component, true);
            }
            if (InterfaceList.topLevelInterface != -1) {
                Static54.runScripts(1, InterfaceList.topLevelInterface);
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.CAM_SHAKE) {
            int tracknum = inboundBuffer.g2();
            int cameraId = inboundBuffer.g1();
            int jitter = inboundBuffer.g1();
            int amplitude = inboundBuffer.g1();
            int frequency = inboundBuffer.g1();
            int shake4 = inboundBuffer.g2();
            setVerifyId(tracknum);
            Static176.customCameraActive[cameraId] = true;
            Camera.cameraJitter[cameraId] = jitter;
            Static276.cameraAmplitude[cameraId] = amplitude;
            Static202.cameraFrequency[cameraId] = frequency;
            Static31.anIntArray76[cameraId] = shake4;
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.IF_SETCOLOUR) {
            int id = inboundBuffer.g4rme();
            int tracknum = inboundBuffer.g2sub();
            int color = inboundBuffer.g2leadd();
            setVerifyId(tracknum);
            DelayedStateChange.setColor(color, id);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.UPDATE_REBOOT_TIMER) {
            Player.rebootTimer = inboundBuffer.g2() * 30;
            opcode = -1;
            InterfaceList.miscTransmitAt = InterfaceList.transmitTimer;
            return true;
        } else if (opcode == ServerProt.REFLECTION_CHEAT_CHECK) {
            ReflectionCheck.method3654(GameShell.signLink, inboundBuffer, length);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.CLIENT_SETVARC_SMALL) {
            int tracknum = inboundBuffer.g2le();
            int value = inboundBuffer.g1neg();
            int id = inboundBuffer.g2leadd();
            setVerifyId(tracknum);
            DelayedStateChange.updateVarC(id, value);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.UPDATE_RUNENERGY) {
            InterfaceList.redrawActiveInterfaces();
            Player.runEnergy = inboundBuffer.g1();
            InterfaceList.miscTransmitAt = InterfaceList.transmitTimer;
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.GAME_FRAME_UNK) {
            if (InterfaceList.topLevelInterface != -1) {
                Static54.runScripts(0, InterfaceList.topLevelInterface);
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.DELETE_INVENTORY) {
            int id = inboundBuffer.g2le();
            Inv.delete(id);
            Inv.updatedInventories[Inv.updatedInventoriesWriterIndex++ & 0x1F] = id & 0x7FFF;
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.NPC_ANIM_SPECIFIC) {
            int npcId = inboundBuffer.g2le();
            int value = inboundBuffer.g1ssub();
            int seqId = inboundBuffer.g2();
            @Pc(3766) Npc npc = NpcList.npcs[npcId];
            if (npc != null) {
                Static223.animateNpc(value, seqId, npc);
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.UPDATE_RUNWEIGHT) {
            InterfaceList.redrawActiveInterfaces();
            Player.weight = inboundBuffer.g2s();
            InterfaceList.miscTransmitAt = InterfaceList.transmitTimer;
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.MESSAGE_PRIVATE_ECHO) {
            long name37 = inboundBuffer.g8();
            JagString message = Font.escape(Static65.formatChatMessage(inboundBuffer).encodeMessage());
            Chat.add(Base37.decode37(name37).toTitleCase(), 6, message);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.URL_OPEN) {
            if (GameShell.fullScreenFrame != null) {
                DisplayMode.setWindowMode(false, Preferences.favoriteWorlds, -1, -1);
            }
            @Pc(3848) byte[] data = new byte[length];
            inboundBuffer.gBytesIsaac(data, length);
            JagString url = JagString.decodeString(data, length, 0);
            if (GameShell.frame == null && (SignLink.anInt5928 == 3 || !SignLink.osName.startsWith("win") || client.haveIe6)) {
                Static169.openUrl(url, true);
            } else {
                Static175.url = url;
                Static164.newTab = true;
                Static33.openUrlRequest = GameShell.signLink.openUrl(new String(url.method3148(), StandardCharsets.ISO_8859_1));
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.GENERATE_CHAT_HEAD_FROM_BODY) {
            int tracknum = inboundBuffer.g2sub();
            int id = inboundBuffer.g4me();
            int value1 = inboundBuffer.g2leadd();
            int value2 = inboundBuffer.g2le();
            int value3 = inboundBuffer.g2leadd();
            setVerifyId(tracknum);
            DelayedStateChange.updateComponentModel(value1, 7, id, value2 << 16 | value3);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.VARBIT_SMALL) {
            int value = inboundBuffer.g1add();
            int id = inboundBuffer.g2le();
            Static272.setVarbit(value, id);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.IF_OPENTOP) {
            int type = inboundBuffer.g1();
            int pointer = inboundBuffer.g4me();
            int tracknum = inboundBuffer.g2sub();
            int component = inboundBuffer.g2();
            setVerifyId(tracknum);
            ComponentPointer ptr = (ComponentPointer) InterfaceList.openInterfaces.get(pointer);
            if (ptr != null) {
                Static132.closeInterface(ptr.anInt5878 != component, ptr);
            }
            Static44.method1148(component, pointer, type);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.RESET_ANIMS) {
            for (int i = 0; i < PlayerList.players.length; i++) {
                if (PlayerList.players[i] != null) {
                    PlayerList.players[i].seqId = -1;
                }
            }
            for (int i = 0; i < NpcList.npcs.length; i++) {
                if (NpcList.npcs[i] != null) {
                    NpcList.npcs[i].seqId = -1;
                }
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.HINT_ARROW) {
            int flags = inboundBuffer.g1();
            @Pc(4084) MapMarker mapMarker = new MapMarker();
            int slot = flags >> 6;
            mapMarker.type = flags & 0x3F;
            mapMarker.anInt4048 = inboundBuffer.g1();
            if (mapMarker.anInt4048 >= 0 && mapMarker.anInt4048 < Sprites.headhints.length) {
                if (mapMarker.type == 1 || mapMarker.type == 10) {
                    mapMarker.actorTargetId = inboundBuffer.g2();
                    inboundBuffer.offset += 3;
                } else if (mapMarker.type >= 2 && mapMarker.type <= 6) {
                    if (mapMarker.type == 2) {
                        mapMarker.anInt4045 = 64;
                        mapMarker.anInt4047 = 64;
                    }
                    if (mapMarker.type == 3) {
                        mapMarker.anInt4045 = 0;
                        mapMarker.anInt4047 = 64;
                    }
                    if (mapMarker.type == 4) {
                        mapMarker.anInt4045 = 128;
                        mapMarker.anInt4047 = 64;
                    }
                    if (mapMarker.type == 5) {
                        mapMarker.anInt4045 = 64;
                        mapMarker.anInt4047 = 0;
                    }
                    if (mapMarker.type == 6) {
                        mapMarker.anInt4045 = 64;
                        mapMarker.anInt4047 = 128;
                    }
                    mapMarker.type = 2;
                    mapMarker.targetX = inboundBuffer.g2();
                    mapMarker.anInt4046 = inboundBuffer.g2();
                    mapMarker.anInt4050 = inboundBuffer.g1();
                }
                mapMarker.playerModelId = inboundBuffer.g2();
                if (mapMarker.playerModelId == 65535) {
                    mapMarker.playerModelId = -1;
                }
                Static143.hintMapMarkers[slot] = mapMarker;
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.UPDATE_IGNORELIST) {
            IgnoreList.size = length / 8;
            for (int i = 0; i < IgnoreList.size; i++) {
                IgnoreList.encodedUsernames[i] = inboundBuffer.g8();
                IgnoreList.aClass100Array134[i] = Base37.decode37(IgnoreList.encodedUsernames[i]);
            }
            FriendsList.transmitAt = InterfaceList.transmitTimer;
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.NPC_INFO) {
            readNpcPacket();
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.IF_SETPOSITION) {
            int tracknum = inboundBuffer.g2sub();
            int ptr = inboundBuffer.g4le();
            int x = inboundBuffer.g2s();
            int y = inboundBuffer.g2sadd();
            setVerifyId(tracknum);
            DelayedStateChange.method4666(x, ptr, y);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.LOC_ANIM_SPECIFIC) {
            int slot = inboundBuffer.g1ssub();
            int type = slot >> 2;
            int rotation = slot & 0x3;
            int type2 = Loc.LAYERS[type];
            int seqId = inboundBuffer.g2();
            int pos = inboundBuffer.g4();
            if (seqId == 65535) {
                seqId = -1;
            }
            int z = pos & 0x3FFF;
            int x = pos >> 14 & 0x3FFF;
            x -= Camera.originX;
            z -= Camera.originZ;
            int plane = pos >> 28 & 0x3;
            Static92.method1881(plane, rotation, type, z, type2, x, seqId);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.MESSAGE_PRIVATE) {
            long name37 = inboundBuffer.g8();
            int top = inboundBuffer.g2();
            int bot = inboundBuffer.g3();
            int rights = inboundBuffer.g1();
            @Pc(4425) boolean ignored = false;
            @Pc(4431) long messageId = bot + ((long)top << 32);
            int ix = 0;
            check: while (true) {
                if (ix >= 100) {
                    if (rights <= 1) {
                        if (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat) {
                            ignored = true;
                        } else {
                            for (ix = 0; ix < IgnoreList.size; ix++) {
                                if (name37 == IgnoreList.encodedUsernames[ix]) {
                                    ignored = true;
                                    break check;
                                }
                            }
                        }
                    }
                    break;
                }
                if (messageId == Chat.recentMessages[ix]) {
                    ignored = true;
                    break;
                }
                ix++;
            }
            if (!ignored && Player.inTutorialIsland == 0) {
                Chat.recentMessages[Chat.messageCounter] = messageId;
                Chat.messageCounter = (Chat.messageCounter + 1) % 100;
                @Pc(4518) JagString message = Font.escape(Static65.formatChatMessage(inboundBuffer).encodeMessage());
                if (rights == 2 || rights == 3) {
                    Chat.add(JagString.concatenate(new JagString[] { Static44.IMG1, Base37.decode37(name37).toTitleCase() }), 7, message);
                } else if (rights == 1) {
                    Chat.add(JagString.concatenate(new JagString[] { Static65.IMG0, Base37.decode37(name37).toTitleCase() }), 7, message);
                } else {
                    Chat.add(Base37.decode37(name37).toTitleCase(), 3, message);
                }
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.MESSAGE_CLANCHANNEL) {
            long name37 = inboundBuffer.g8();
            inboundBuffer.g1s();
            long chat37 = inboundBuffer.g8();
            int top = inboundBuffer.g2();
            int bot = inboundBuffer.g3();
            @Pc(4626) long local4626 = ((long)top << 32) + bot;
            int rights = inboundBuffer.g1();
            @Pc(4632) boolean ignored = false;
            @Pc(4634) int ix = 0;
            check: while (true) {
                if (ix >= 100) {
                    if (rights <= 1) {
                        if (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat) {
                            ignored = true;
                        } else {
                            for (ix = 0; ix < IgnoreList.size; ix++) {
                                if (IgnoreList.encodedUsernames[ix] == name37) {
                                    ignored = true;
                                    break check;
                                }
                            }
                        }
                    }
                    break;
                }
                if (Chat.recentMessages[ix] == local4626) {
                    ignored = true;
                    break;
                }
                ix++;
            }
            if (!ignored && Player.inTutorialIsland == 0) {
                Chat.recentMessages[Chat.messageCounter] = local4626;
                Chat.messageCounter = (Chat.messageCounter + 1) % 100;
                JagString message = Font.escape(Static65.formatChatMessage(inboundBuffer).encodeMessage());
                if (rights == 2 || rights == 3) {
                    Static73.method1598(message, JagString.concatenate(new JagString[] { Static44.IMG1, Base37.decode37(name37).toTitleCase() }), Base37.decode37(chat37).toTitleCase());
                } else if (rights == 1) {
                    Static73.method1598(message, JagString.concatenate(new JagString[] { Static65.IMG0, Base37.decode37(name37).toTitleCase() }), Base37.decode37(chat37).toTitleCase());
                } else {
                    Static73.method1598(message, Base37.decode37(name37).toTitleCase(), Base37.decode37(chat37).toTitleCase());
                }
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.DYNAMIC_SCENE_GRAPH) {
            readRebuildPacket(true);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.SYNTH_SOUND) {
            int trackId = inboundBuffer.g2();
            int volume = inboundBuffer.g1();
            if (trackId == 65535) {
                trackId = -1;
            }
            int delay = inboundBuffer.g2();
            SoundPlayer.play(volume, trackId, delay);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.IF_SETPLAYERHEAD) {
            int tracknum = inboundBuffer.g2leadd();
            int id = inboundBuffer.g4rme();
            setVerifyId(tracknum);
            int set = 0;
            if (PlayerList.self.appearance != null) {
                set = PlayerList.self.appearance.method1952();
            }
            DelayedStateChange.updateComponentModel(-1, 3, id, set);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.IF_SETTEXT1) {
            int id = inboundBuffer.g4me();
            JagString text = inboundBuffer.gjstr();
            int tracknum = inboundBuffer.g2sub();
            setVerifyId(tracknum);
            DelayedStateChange.method3617(text, id);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.VARBIT_LARGE) {
            int value = inboundBuffer.g4le();
            int id = inboundBuffer.g2leadd();
            Static272.setVarbit(value, id);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.UPDATE_INV_PARTIAL) {
            int componentHash = inboundBuffer.g4();
            int containerId = inboundBuffer.g2();
            if (componentHash < -70000) {
                containerId += 32768;
            }
            Component component;
            if (componentHash < 0) {
                component = null;
            } else {
                component = InterfaceList.getComponent(componentHash);
            }
            while (inboundBuffer.offset < length) {
                int slot = inboundBuffer.gSmart1or2();
                int amount = inboundBuffer.g2();
                int id = 0;
                if (amount != 0) {
                    id = inboundBuffer.g1();
                    if (id == 255) {
                        id = inboundBuffer.g4();
                    }
                }
                if (component != null && slot >= 0 && component.objTypes.length > slot) {
                    component.objTypes[slot] = amount;
                    component.objCounts[slot] = id;
                }
                Inv.updateContainer(amount - 1, slot, id, containerId);
            }
            if (component != null) {
                InterfaceList.redraw(component);
            }
            InterfaceList.redrawActiveInterfaces();
            Inv.updatedInventories[Inv.updatedInventoriesWriterIndex++ & 0x1F] = containerId & 0x7FFF;
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.CAM_RESET) {
            int tracknum = inboundBuffer.g2();
            setVerifyId(tracknum);
            Camera.resetCameraEffects();
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.LOGOUT) {
            Static278.processLogout();
            opcode = -1;
            return false;
        } else if (opcode == ServerProt.GRAND_EXCHANGE_OFFERS) {
            int offer = inboundBuffer.g1();
            if (inboundBuffer.g1() == 0) {
                StockMarketManager.offers[offer] = new StockMarketOffer();
            } else {
                inboundBuffer.offset--;
                StockMarketManager.offers[offer] = new StockMarketOffer(inboundBuffer);
            }
            opcode = -1;
            StockMarketManager.transmitAt = InterfaceList.transmitTimer;
            return true;
        } else if (opcode == ServerProt.IF_SETNPCHEAD) {
            int npcId = inboundBuffer.g2sub();
            int id = inboundBuffer.g4le();
            if (npcId == 65535) {
                npcId = -1;
            }
            int tracknum = inboundBuffer.g2le();
            setVerifyId(tracknum);
            DelayedStateChange.updateComponentModel(-1, 2, id, npcId);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.UPDATE_SCENE_GRAPH) {
            readRebuildPacket(false);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.SET_INTERFACE_SETTINGS) {
            int tracknum = inboundBuffer.g2le();
            int end = inboundBuffer.g2le();
            if (end == 65535) {
                end = -1;
            }
            int pointer = inboundBuffer.g4();
            int start = inboundBuffer.g2sub();
            int accessMask = inboundBuffer.g4rme();
            if (start == 65535) {
                start = -1;
            }
            setVerifyId(tracknum);
            for (int local277 = start; local277 <= end; local277++) {
                long local904 = ((long) pointer << 32) + ((long) local277);
                ServerActiveProperties properties = (ServerActiveProperties) InterfaceList.properties.get(local904);
                ServerActiveProperties target;
                if (properties != null) {
                    target = new ServerActiveProperties(accessMask, properties.anInt540);
                    properties.unlink();
                } else if (local277 == -1) {
                    target = new ServerActiveProperties(accessMask, InterfaceList.getComponent(pointer).properties.anInt540);
                } else {
                    target = new ServerActiveProperties(accessMask, -1);
                }
                InterfaceList.properties.put(target, local904);
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.FRIENDLIST_LOADED) {
            FriendsList.state = inboundBuffer.g1();
            FriendsList.transmitAt = InterfaceList.transmitTimer;
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.UPDATE_CLAN) {
            long name37 = inboundBuffer.g8();
            int worldId = inboundBuffer.g2();
            @Pc(5325) byte rights = inboundBuffer.g1s();
            boolean ignored = false;
            if ((Long.MIN_VALUE & name37) != 0L) {
                ignored = true;
            }
            if (ignored) {
                if (ClanChat.size == 0) {
                    opcode = -1;
                    return true;
                }
                name37 &= Long.MAX_VALUE;
                int i;
                for (i = 0; ClanChat.size > i && (name37 != ClanChat.members[i].key || worldId != ClanChat.members[i].world); i++) {
                }
                if (i < ClanChat.size) {
                    while (ClanChat.size - 1 > i) {
                        ClanChat.members[i] = ClanChat.members[i + 1];
                        i++;
                    }
                    ClanChat.size--;
                    ClanChat.members[ClanChat.size] = null;
                }
            } else {
                JagString worldName = inboundBuffer.gjstr();
                @Pc(5347) ClanMember member = new ClanMember();
                member.key = name37;
                member.username = Base37.decode37(member.key);
                member.rank = rights;
                member.worldName = worldName;
                member.world = worldId;
                int n;
                for (n = ClanChat.size - 1; n >= 0; n--) {
                    int m = ClanChat.members[n].username.method3139(member.username);
                    if (m == 0) {
                        ClanChat.members[n].world = worldId;
                        ClanChat.members[n].rank = rights;
                        ClanChat.members[n].worldName = worldName;
                        if (name37 == Player.name37) {
                            ClanChat.rank = rights;
                        }
                        ClanChat.transmitAt = InterfaceList.transmitTimer;
                        opcode = -1;
                        return true;
                    }
                    if (m < 0) {
                        break;
                    }
                }
                if (ClanChat.members.length <= ClanChat.size) {
                    opcode = -1;
                    return true;
                }
                for (int i = ClanChat.size - 1; i > n; i--) {
                    ClanChat.members[i + 1] = ClanChat.members[i];
                }
                if (ClanChat.size == 0) {
                    ClanChat.members = new ClanMember[100];
                }
                ClanChat.members[n + 1] = member;
                if (Player.name37 == name37) {
                    ClanChat.rank = rights;
                }
                ClanChat.size++;
            }
            opcode = -1;
            ClanChat.transmitAt = InterfaceList.transmitTimer;
            return true;
        } else if (opcode == ServerProt.IF_SETOBJECT) {
            int slot = inboundBuffer.g4();
            int id = inboundBuffer.g4me();
            int itemId = inboundBuffer.g2leadd();
            if (itemId == 65535) {
                itemId = -1;
            }
            int tracknum = inboundBuffer.g2le();
            setVerifyId(tracknum);
            @Pc(5603) Component component = InterfaceList.getComponent(id);
            @Pc(5615) ObjType objType;
            if (component.usingScripts) {
                DelayedStateChange.method3707(id, slot, itemId);
                objType = ObjTypeList.get(itemId);
                DelayedStateChange.updateView(objType.zoom2d, id, objType.yAngle2d, objType.xAngle2d);
                DelayedStateChange.method2745(id, objType.zAngle2d, objType.yOffset2d, objType.xOffset2d);
            } else if (itemId == -1) {
                component.modelType = 0;
                opcode = -1;
                return true;
            } else {
                objType = ObjTypeList.get(itemId);
                component.modelXAngle = objType.xAngle2d;
                component.modelZoom = objType.zoom2d * 100 / slot;
                component.modelType = 4;
                component.modelId = itemId;
                component.modelYAngle = objType.yAngle2d;
                InterfaceList.redraw(component);
            }
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.UPDATE_INV_FULL) {
            int componentHash = inboundBuffer.g4();
            int containerId = inboundBuffer.g2();
            if (componentHash < -70000) {
                containerId += 32768;
            }
            Component component;
            if (componentHash >= 0) {
                component = InterfaceList.getComponent(componentHash);
            } else {
                component = null;
            }
            if (component != null) {
                for (int i = 0; i < component.objTypes.length; i++) {
                    component.objTypes[i] = 0;
                    component.objCounts[i] = 0;
                }
            }
            Static14.method475(containerId);
            int total = inboundBuffer.g2();
            for (int slot = 0; slot < total; slot++) {
                int amount = inboundBuffer.g1ssub();
                if (amount == 255) {
                    amount = inboundBuffer.g4();
                }
                int itemId = inboundBuffer.g2();
                if (component != null && slot < component.objTypes.length) {
                    component.objTypes[slot] = itemId;
                    component.objCounts[slot] = amount;
                }
                Inv.updateContainer(itemId - 1, slot, amount, containerId);
            }
            if (component != null) {
                InterfaceList.redraw(component);
            }
            InterfaceList.redrawActiveInterfaces();
            Inv.updatedInventories[Inv.updatedInventoriesWriterIndex++ & 0x1F] = containerId & 0x7FFF;
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.SET_SETTINGS_STRING) {
            Static230.method3954(inboundBuffer.gjstr());
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.UPDATE_CURRENT_LOCATION) {
            Static115.currentChunkX = inboundBuffer.g1neg();
            Static180.currentChunkZ = inboundBuffer.g1();
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.MIDI_SONG) {
            int id = inboundBuffer.g2leadd();
            if (id == 65535) {
                id = -1;
            }
            MusicPlayer.playSong(id);
            opcode = -1;
            return true;
        } else if (opcode == ServerProt.MIDI_JINGLE) {
            int volume = inboundBuffer.g3le();
            int id = inboundBuffer.g2le();
            if (id == 65535) {
                id = -1;
            }
            MusicPlayer.playJingle(volume, id);
            opcode = -1;
            return true;
        } else {
            TracingException.report("T1 - " + opcode + "," + opcode3 + "," + opcode4 + " - " + length, null);
            Static278.processLogout();
            return true;
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
            @Pc(61) String local61 = "T2 - " + opcode + "," + opcode3 + "," + opcode4 + " - " + length + "," + (Camera.originX + PlayerList.self.movementQueueX[0]) + "," + (PlayerList.self.movementQueueZ[0] + Camera.originZ) + " - ";
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
                    if (Static264.mouseRecorderPrevX != x || y != MouseRecorder.mouseRecorderPrevY) {
                        dx = x - Static264.mouseRecorderPrevX;
                        Static264.mouseRecorderPrevX = x;
                        dy = y - MouseRecorder.mouseRecorderPrevY;
                        MouseRecorder.mouseRecorderPrevY = y;
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
        NpcList.method2274();
        OverheadChat.loop();
        if (WorldMap.component != null) {
            WorldMap.method447();
        }
        // VarpDomain
        for (i = Static38.poll(true); i != -1; i = Static38.poll(false)) {
            Static85.refreshMagicVarp(i);
            VarpDomain.updatedVarps[VarpDomain.updatedVarpsWriterIndex++ & 0x1F] = i;
        }
        @Pc(782) int modelId;
        // DelayedStateChange
        for (@Pc(709) DelayedStateChange change = DelayedStateChange.poll(); change != null; change = DelayedStateChange.poll()) {
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
                        InterfaceList.redraw(component);
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
                        InterfaceList.redraw(component);
                    }
                } else if (type == 5) {
                    component = InterfaceList.getComponent(i);
                    if (component.modelSeqId != change.intArg1 || change.intArg1 == -1) {
                        component.anInt496 = 1;
                        component.anInt500 = 0;
                        component.modelSeqId = change.intArg1;
                        component.anInt510 = 0;
                        InterfaceList.redraw(component);
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
                        InterfaceList.redraw(local1189);
                    }
                } else if (type == 7) {
                    component = InterfaceList.getComponent(i);
                    @Pc(1145) boolean hidden = change.intArg1 == 1;
                    if (component != null && hidden != component.hidden) {
                        component.hidden = hidden;
                        InterfaceList.redraw(component);
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
                        InterfaceList.redraw(component);
                    }
                } else if (type == 9) {
                    component = InterfaceList.getComponent(i);
                    if (change.intArg1 != component.objId || component.objCount != change.intArg3) {
                        component.objId = change.intArg1;
                        component.objCount = change.intArg3;
                        InterfaceList.redraw(component);
                    }
                } else if (type == 10) {
                    component = InterfaceList.getComponent(i);
                    if (component.modelXOffset != change.intArg1 || change.intArg3 != component.modelZOffset || component.modelYOffset != change.intArg2) {
                        component.modelZOffset = change.intArg3;
                        component.modelYOffset = change.intArg2;
                        component.modelXOffset = change.intArg1;
                        InterfaceList.redraw(component);
                    }
                } else if (type == 11) {
                    component = InterfaceList.getComponent(i);
                    component.x = component.baseX = change.intArg1;
                    component.yMode = 0;
                    component.xMode = 0;
                    component.y = component.baseY = change.intArg3;
                    InterfaceList.redraw(component);
                } else if (type == 12) {
                    component = InterfaceList.getComponent(i);
                    x = change.intArg1;
                    if (component != null && component.type == 0) {
                        if (x > component.scrollMaxV - component.height) {
                            x = component.scrollMaxV - component.height;
                        }
                        if (x < 0) {
                            x = 0;
                        }
                        if (x != component.scrollY) {
                            component.scrollY = x;
                            InterfaceList.redraw(component);
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
        if (MiniMenu.aClass13_7 != null) {
            MiniMenu.anInt2043++;
            if (MiniMenu.anInt2043 >= 15) {
                InterfaceList.redraw(MiniMenu.aClass13_7);
                MiniMenu.aClass13_7 = null;
            }
        }
        @Pc(1361) Component local1361;
        if (Static118.aClass13_15 != null) {
            InterfaceList.redraw(Static118.aClass13_15);
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
                } else if ((Static116.anInt2952 == 1 || Static277.method4640(MiniMenu.size - 1)) && MiniMenu.size > 2) {
                    Static226.method3901();
                } else if (MiniMenu.size > 0) {
                    Static59.method1372();
                }
                Mouse.clickButton = 0;
                MiniMenu.anInt2043 = 10;
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
                                            if (Static40.aClass13_14 != null) {
                                                ClientProt.method28();
                                            }
                                            if (LoginManager.staffModLevel > 0 && Keyboard.pressedKeys[Keyboard.KEY_CTRL] && Keyboard.pressedKeys[Keyboard.KEY_SHIFT] && MouseWheel.wheelRotation != 0) {
                                                y = Player.level - MouseWheel.wheelRotation;
                                                if (y < 0) {
                                                    y = 0;
                                                } else if (y > 3) {
                                                    y = 3;
                                                }
                                                // Cheat
                                                Cheat.teleport(PlayerList.self.movementQueueX[0] + Camera.originX, PlayerList.self.movementQueueZ[0] + Camera.originZ, y);
                                            }
                                            if (LoginManager.staffModLevel > 0 && Keyboard.pressedKeys[Keyboard.KEY_CTRL] && Keyboard.pressedKeys[Keyboard.KEY_SHIFT]) {
                                                if (MiniMenu.anInt1742 != -1) {
                                                    Cheat.teleport(Camera.originX + MiniMenu.anInt1742, Camera.originZ - -MiniMenu.anInt2954, Player.level);
                                                }
                                                Static187.anInt4422 = 0;
                                                Static125.anInt3096 = 0;
                                            } else if (Static125.anInt3096 == 2) {
                                                if (MiniMenu.anInt1742 != -1) {
                                                    outboundBuffer.p1isaac(131);
                                                    outboundBuffer.p4me(MiniMenu.anInt2512);
                                                    outboundBuffer.p2add(Camera.originX + MiniMenu.anInt1742);
                                                    outboundBuffer.p2leadd(MiniMenu.anInt506);
                                                    outboundBuffer.p2add(MiniMenu.anInt2954 + Camera.originZ);
                                                    Cross.type = 1;
                                                    Cross.milliseconds = 0;
                                                    Cross.y = Mouse.clickY;
                                                    Cross.x = Mouse.clickX;
                                                }
                                                Static125.anInt3096 = 0;
                                            } else if (Static187.anInt4422 == 2) {
                                                if (MiniMenu.anInt1742 != -1) {
                                                    outboundBuffer.p1isaac(179);
                                                    outboundBuffer.p2(Camera.originZ + MiniMenu.anInt2954);
                                                    outboundBuffer.p2(MiniMenu.anInt1742 + Camera.originX);
                                                    Cross.milliseconds = 0;
                                                    Cross.type = 1;
                                                    Cross.x = Mouse.clickX;
                                                    Cross.y = Mouse.clickY;
                                                }
                                                Static187.anInt4422 = 0;
                                            } else if (MiniMenu.anInt1742 != -1 && Static125.anInt3096 == 0 && Static187.anInt4422 == 0) {
                                                @Pc(1871) boolean local1871 = PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 0, true, 0, MiniMenu.anInt1742, 0, 0, 0, MiniMenu.anInt2954, PlayerList.self.movementQueueX[0]);
                                                if (local1871) {
                                                    Cross.y = Mouse.clickY;
                                                    Cross.milliseconds = 0;
                                                    Cross.x = Mouse.clickX;
                                                    Cross.type = 1;
                                                }
                                            }
                                            MiniMenu.anInt1742 = -1;
                                            Static7.method843();
                                            if (Static180.aClass13_22 != local1361) {
                                                if (local1361 != null) {
                                                    InterfaceList.redraw(local1361);
                                                }
                                                if (Static180.aClass13_22 != null) {
                                                    InterfaceList.redraw(Static180.aClass13_22);
                                                }
                                            }
                                            if (local1508 != Static43.aClass13_11 && Static191.anInt4504 == Static133.anInt5235) {
                                                if (local1508 != null) {
                                                    InterfaceList.redraw(local1508);
                                                }
                                                if (Static43.aClass13_11 != null) {
                                                    InterfaceList.redraw(Static43.aClass13_11);
                                                }
                                            }
                                            if (Static43.aClass13_11 == null) {
                                                if (Static133.anInt5235 > 0) {
                                                    Static133.anInt5235--;
                                                }
                                            } else if (Static133.anInt5235 < Static191.anInt4504) {
                                                Static133.anInt5235++;
                                                if (Static191.anInt4504 == Static133.anInt5235) {
                                                    InterfaceList.redraw(Static43.aClass13_11);
                                                }
                                            }
                                            if (Camera.cameraType == 1) {
                                                Static250.method4273();
                                            } else if (Camera.cameraType == 2) {
                                                Camera.updateLockedCamera();
                                            } else {
                                                Camera.updateLoginScreenCamera();
                                            }
                                            for (y = 0; y < 5; y++) {
                                                @Pc(2001) int local2001 = Static31.anIntArray76[y]++;
                                            }
                                            y = Mouse.getIdleLoops();
                                            x = Keyboard.getIdleLoops();
                                            if (y > 15000 && x > 15000) {
                                                Static267.anInt5775 = 250;
                                                Mouse.setIdleLoops(14500);
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
                                                    Static206.anInt4774 += anInt659;
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
                                                    MiniMap.anInt4130 += Static179.anInt4262;
                                                }
                                            }
                                            if (Static132.anInt3291 < -50) {
                                                Static248.anInt4229 = 2;
                                            }
                                            if (Static59.anInt1814 < -60) {
                                                Static263.anInt5755 = 2;
                                            }
                                            if (MiniMap.anInt4130 < -20) {
                                                Static179.anInt4262 = 1;
                                            }
                                            if (Static206.anInt4774 < -55) {
                                                anInt659 = 2;
                                            }
                                            if (Static206.anInt4774 > 55) {
                                                anInt659 = -2;
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
                                            if (MiniMap.anInt4130 > 10) {
                                                Static179.anInt4262 = -1;
                                            }
                                            if (Static59.anInt1814 > 60) {
                                                Static263.anInt5755 = -2;
                                            }
                                            if (Static131.anInt3251 > 50) {
                                                outboundBuffer.p1isaac(93);
                                            }
                                            if (verifyIdChanged) {
                                                transmitVerifyId();
                                                verifyIdChanged = false;
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
                                    ScriptRunner.run(priorityRequest);
                                }
                            }
                            prioritySource = priorityRequest.source;
                            if (prioritySource.createdComponentId < 0) {
                                break;
                            }
                            priorityComponent = InterfaceList.getComponent(prioritySource.layer);
                        } while (priorityComponent == null || priorityComponent.createdComponents == null || priorityComponent.createdComponents.length <= prioritySource.createdComponentId || priorityComponent.createdComponents[prioritySource.createdComponentId] != prioritySource);
                        ScriptRunner.run(priorityRequest);
                    }
                }
                prioritySource = priorityRequest.source;
                if (prioritySource.createdComponentId < 0) {
                    break;
                }
                priorityComponent = InterfaceList.getComponent(prioritySource.layer);
            } while (priorityComponent == null || priorityComponent.createdComponents == null || prioritySource.createdComponentId >= priorityComponent.createdComponents.length || priorityComponent.createdComponents[prioritySource.createdComponentId] != prioritySource);
            ScriptRunner.run(priorityRequest);
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
                local47 = inboundBuffer.g1neg();
                local14.addHit(local47, client.loop, local43);
                local14.hitpointsBarVisibleUntil = client.loop + 300;
                local14.hitpointsBar = inboundBuffer.g1ssub();
            }
            if ((local18 & 0x2) != 0) {
                local43 = inboundBuffer.g1neg();
                local47 = inboundBuffer.g1ssub();
                local14.addHit(local47, client.loop, local43);
            }
            if ((local18 & 0x10) != 0) {
                local43 = inboundBuffer.g2();
                local47 = inboundBuffer.g1();
                if (local43 == 65535) {
                    local43 = -1;
                }
                Static223.animateNpc(local47, local43, local14);
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
                local47 = inboundBuffer.g4le();
                @Pc(147) boolean local147 = true;
                if (local43 != -1 && local14.spotAnimId != -1 && SeqTypeList.get(SpotAnimTypeList.get(local43).seqId).forcedPriority < SeqTypeList.get(SpotAnimTypeList.get(local14.spotAnimId).seqId).forcedPriority) {
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
                local14.setNpcType(NpcTypeList.get(inboundBuffer.g2le()));
                local14.method2692(local14.type.size);
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
                local43 = inboundBuffer.g1neg();
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
    public static void readNpcPacket() {
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
                NpcList.npcs[local30].setNpcType(null);
                NpcList.npcs[local30] = null;
            }
        }
        if (length != inboundBuffer.offset) {
            throw new RuntimeException("gnp1 pos:" + inboundBuffer.offset + " psize:" + length);
        }
        for (local19 = 0; local19 < NpcList.size; local19++) {
            if (NpcList.npcs[NpcList.ids[local19]] == null) {
                throw new RuntimeException("gnp2 pos:" + local19 + " size:" + NpcList.size);
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public static void method1202() {
        inboundBuffer.accessBits();
        @Pc(13) int local13 = inboundBuffer.gBits(8);
        @Pc(22) int local22;
        if (NpcList.size > local13) {
            for (local22 = local13; local22 < NpcList.size; local22++) {
                removedIds[removedCount++] = NpcList.ids[local22];
            }
        }
        if (NpcList.size < local13) {
            throw new RuntimeException("gnpov1");
        }
        NpcList.size = 0;
        for (local22 = 0; local22 < local13; local22++) {
            @Pc(61) int local61 = NpcList.ids[local22];
            @Pc(65) Npc local65 = NpcList.npcs[local61];
            @Pc(70) int local70 = inboundBuffer.gBits(1);
            if (local70 == 0) {
                NpcList.ids[NpcList.size++] = local61;
                local65.lastSeenLoop = client.loop;
            } else {
                @Pc(92) int local92 = inboundBuffer.gBits(2);
                if (local92 == 0) {
                    NpcList.ids[NpcList.size++] = local61;
                    local65.lastSeenLoop = client.loop;
                    extendedIds[extendedCount++] = local61;
                } else {
                    @Pc(139) int local139;
                    @Pc(149) int local149;
                    if (local92 == 1) {
                        NpcList.ids[NpcList.size++] = local61;
                        local65.lastSeenLoop = client.loop;
                        local139 = inboundBuffer.gBits(3);
                        local65.move(1, local139);
                        local149 = inboundBuffer.gBits(1);
                        if (local149 == 1) {
                            extendedIds[extendedCount++] = local61;
                        }
                    } else if (local92 == 2) {
                        NpcList.ids[NpcList.size++] = local61;
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
                    NpcList.ids[NpcList.size++] = local14;
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
                    local37.setNpcType(NpcTypeList.get(inboundBuffer.gBits(14)));
                    if (local105 > 15) {
                        local105 -= 32;
                    }
                    @Pc(124) int local124 = inboundBuffer.gBits(5);
                    if (local124 > 15) {
                        local124 -= 32;
                    }
                    local37.method2692(local37.type.size);
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
        verifyIdChanged = true;
        return true;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
    public static void transmitVerifyId() {
        outboundBuffer.p1isaac(177);
        outboundBuffer.p2(verifyId);
    }
}
