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
                        for (@Pc(69) int local69 = 0; local69 < Static35.anInt1093; local69++) {
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
                        message = Static218.escape(Static65.formatChatMessage(chatBuffer).encodeMessage());
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
                    @Pc(99) int local99 = Static56.anIntArray141[inboundBuffer.gBits(3)];
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
        if (opcode == 60) {
            local133 = inboundBuffer.g2sub();
            @Pc(137) byte local137 = inboundBuffer.g1neg();
            Static170.method2575(local137, local133);
            opcode = -1;
            return true;
        }
        @Pc(171) int local171;
        @Pc(156) JagString local156;
        if (opcode == 115) {
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
            if (Static248.method3288(local133)) {
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
        if (opcode == 70) {
            @Pc(245) JagString local245 = inboundBuffer.gjstr();
            if (local245.method3130(Static196.aClass100_863)) {
                local156 = local245.substring(local245.indexOf(Static264.aClass100_875), 0);
                local275 = local156.encode37();
                local262 = false;
                for (local277 = 0; local277 < Static35.anInt1093; local277++) {
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
                for (local277 = 0; local277 < Static35.anInt1093; local277++) {
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
                for (local277 = 0; local277 < Static35.anInt1093; local277++) {
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
                for (local277 = 0; local277 < Static35.anInt1093; local277++) {
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
                for (local277 = 0; local277 < Static35.anInt1093; local277++) {
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
                for (local277 = 0; local277 < Static35.anInt1093; local277++) {
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
                for (local277 = 0; local277 < Static35.anInt1093; local277++) {
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
        if (opcode == 123) {
            local133 = inboundBuffer.g2le();
            local786 = inboundBuffer.g2sub();
            local790 = inboundBuffer.gjstr();
            if (Static248.method3288(local786)) {
                Static193.method3498(local790, local133);
            }
            opcode = -1;
            return true;
        } else if (opcode == 230) {
            Static180.anInt4264 = inboundBuffer.g1add();
            Static115.anInt2940 = inboundBuffer.g1ssub();
            while (length > inboundBuffer.offset) {
                opcode = inboundBuffer.g1();
                Static75.method1634();
            }
            opcode = -1;
            return true;
        } else if (opcode == 153) {
            opcode = -1;
            Static115.anInt2939 = 0;
            return true;
        } else {
            @Pc(864) int local864;
            if (opcode == 220) {
                local133 = inboundBuffer.p4rme();
                local786 = inboundBuffer.g2le();
                local864 = inboundBuffer.g2();
                if (Static248.method3288(local864)) {
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
            if (opcode == 81) {
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
                        for (local924 = 0; local924 < Static35.anInt1093; local924++) {
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
                        Chat.add(local916, 20, local999, Base37.decodeLowerCase(local275).method3125(), JagString.concatenate(new JagString[] { Static44.aClass100_336, Base37.decodeLowerCase(local884).method3125() }));
                    } else if (local908 == 1) {
                        Chat.add(local916, 20, local999, Base37.decodeLowerCase(local275).method3125(), JagString.concatenate(new JagString[] { Static65.aClass100_435, Base37.decodeLowerCase(local884).method3125() }));
                    } else {
                        Chat.add(local916, 20, local999, Base37.decodeLowerCase(local275).method3125(), Base37.decodeLowerCase(local884).method3125());
                    }
                }
                opcode = -1;
                return true;
            }
            @Pc(1146) int local1146;
            @Pc(1160) int local1160;
            @Pc(1245) boolean local1245;
            if (opcode == 55) {
                ClanChat.transmitAt = InterfaceList.transmitTimer;
                local884 = inboundBuffer.g8();
                if (local884 == 0L) {
                    Static270.aClass100_1094 = null;
                    opcode = -1;
                    Static15.aClass100_87 = null;
                    Static199.aClass3_Sub22Array1 = null;
                    Static214.anInt5577 = 0;
                    return true;
                }
                local275 = inboundBuffer.g8();
                Static15.aClass100_87 = Base37.decodeLowerCase(local275);
                Static270.aClass100_1094 = Base37.decodeLowerCase(local884);
                Static50.aByte6 = inboundBuffer.g1s();
                local1146 = inboundBuffer.g1();
                if (local1146 == 255) {
                    opcode = -1;
                    return true;
                }
                Static214.anInt5577 = local1146;
                @Pc(1158) Class3_Sub22[] local1158 = new Class3_Sub22[100];
                for (local1160 = 0; local1160 < Static214.anInt5577; local1160++) {
                    local1158[local1160] = new Class3_Sub22();
                    local1158[local1160].key = inboundBuffer.g8();
                    local1158[local1160].aClass100_636 = Base37.decodeLowerCase(local1158[local1160].key);
                    local1158[local1160].anInt3340 = inboundBuffer.g2();
                    local1158[local1160].aByte9 = inboundBuffer.g1s();
                    local1158[local1160].aClass100_635 = inboundBuffer.gjstr();
                    if (Static101.aLong98 == local1158[local1160].key) {
                        Static160.aByte14 = local1158[local1160].aByte9;
                    }
                }
                local908 = Static214.anInt5577;
                while (local908 > 0) {
                    local1245 = true;
                    local908--;
                    for (local916 = 0; local916 < local908; local916++) {
                        if (local1158[local916].aClass100_636.method3139(local1158[local916 + 1].aClass100_636) > 0) {
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
                Static199.aClass3_Sub22Array1 = local1158;
                opcode = -1;
                return true;
            } else if (opcode == 164) {
                local133 = inboundBuffer.g4rme();
                Static232.aClass212_5 = GameShell.signLink.getReverseDns(local133);
                opcode = -1;
                return true;
            } else if (opcode == 225) {
                readPlayerInfoPacket();
                opcode = -1;
                return true;
            } else if (opcode == 48) {
                local133 = inboundBuffer.g2();
                local156 = inboundBuffer.gjstr();
                local864 = inboundBuffer.g2leadd();
                if (Static248.method3288(local133)) {
                    Static193.method3498(local156, local864);
                }
                opcode = -1;
                return true;
            } else if (opcode == 232) {
                Static59.anInt1812 = inboundBuffer.g1();
                Static49.anInt1459 = inboundBuffer.g1();
                Static84.anInt2256 = inboundBuffer.g1();
                opcode = -1;
                return true;
            } else {
                @Pc(1409) JagString local1409;
                if (opcode == 44) {
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
                } else if (opcode == 226) {
                    local133 = inboundBuffer.g4();
                    local786 = inboundBuffer.g2sub();
                    Static170.method2575(local133, local786);
                    opcode = -1;
                    return true;
                } else if (opcode == 21) {
                    local133 = inboundBuffer.p1neg();
                    local786 = inboundBuffer.g2();
                    local864 = inboundBuffer.g4me();
                    if (Static248.method3288(local786)) {
                        Static153.method2905(local864, local133);
                    }
                    opcode = -1;
                    return true;
                } else if (opcode == 145) {
                    local133 = inboundBuffer.g2leadd();
                    local786 = inboundBuffer.g1add();
                    local864 = inboundBuffer.g2leadd();
                    if (Static248.method3288(local864)) {
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
                } else if (opcode == 69) {
                    local133 = inboundBuffer.g2leadd();
                    local786 = inboundBuffer.g4();
                    local864 = inboundBuffer.g2sub();
                    if (Static248.method3288(local133)) {
                        Static132.method2606(local864, local786);
                    }
                    opcode = -1;
                    return true;
                } else if (opcode == 141) {
                    local884 = inboundBuffer.g8();
                    local864 = inboundBuffer.g2();
                    local1409 = QuickChatPhraseTypeList.get(local864).decodeMessage(inboundBuffer);
                    Chat.add(local864, 19, local1409, null, Base37.decodeLowerCase(local884).method3125());
                    opcode = -1;
                    return true;
                } else if (opcode == 169) {
                    Static271.method4598(inboundBuffer);
                    opcode = -1;
                    return true;
                } else if (opcode == 89) {
                    Static8.method121();
                    InterfaceList.method2245();
                    VarpDomain.updatedVarpsWriterIndex += 32;
                    opcode = -1;
                    return true;
                } else if (opcode == 125) {
                    local133 = inboundBuffer.g2();
                    local786 = inboundBuffer.g1();
                    local864 = inboundBuffer.g1();
                    local171 = inboundBuffer.g2();
                    local1146 = inboundBuffer.g1();
                    local277 = inboundBuffer.g1();
                    if (Static248.method3288(local133)) {
                        Static260.method3849(local171, local864, local1146, local786, local277);
                    }
                    opcode = -1;
                    return true;
                } else if (opcode == 36) {
                    local133 = inboundBuffer.p4rme();
                    local786 = inboundBuffer.g2les();
                    local864 = inboundBuffer.g2sub();
                    if (Static248.method3288(local864)) {
                        Static225.method3893(local133, local786);
                    }
                    opcode = -1;
                    return true;
                } else {
                    @Pc(1814) ServerActiveProperties local1814;
                    @Pc(1804) ServerActiveProperties local1804;
                    if (opcode == 9) {
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
                        if (Static248.method3288(local864)) {
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
                    if (opcode == 56) {
                        local133 = inboundBuffer.g2();
                        local786 = inboundBuffer.g2le();
                        local864 = inboundBuffer.g4rme();
                        local171 = inboundBuffer.g2leadd();
                        if (local864 >> 30 == 0) {
                            @Pc(1994) SeqType local1994;
                            if (local864 >> 29 != 0) {
                                local1146 = local864 & 0xFFFF;
                                @Pc(1894) Npc local1894 = Static175.npcs[local1146];
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
                    } else if (opcode == 207) {
                        local133 = inboundBuffer.p4rme();
                        local786 = inboundBuffer.g2sub();
                        local864 = inboundBuffer.g2();
                        local171 = inboundBuffer.g2sub();
                        if (Static248.method3288(local786)) {
                            Static190.method3444(local171 + (local864 << 16), local133);
                        }
                        opcode = -1;
                        return true;
                    } else if (opcode == 38) {
                        InterfaceList.method2245();
                        local133 = inboundBuffer.g1add();
                        local786 = inboundBuffer.g4rme();
                        local864 = inboundBuffer.g1();
                        Static227.anIntArray446[local864] = local786;
                        Static99.anIntArray240[local864] = local133;
                        Static141.anIntArray326[local864] = 1;
                        for (local171 = 0; local171 < 98; local171++) {
                            if (ObjType.anIntArray213[local171] <= local786) {
                                Static141.anIntArray326[local864] = local171 + 2;
                            }
                        }
                        PlayerSkillXpTable.updatedStats[PlayerSkillXpTable.updatedStatsWriterIndex++ & 0x1F] = local864;
                        opcode = -1;
                        return true;
                    } else if (opcode == 104 || opcode == 121 || opcode == 97 || opcode == 14 || opcode == 202 || opcode == 135 || opcode == 17 || opcode == 16 || opcode == 240 || opcode == 33 || opcode == 20 || opcode == 195 || opcode == 179) {
                        Static75.method1634();
                        opcode = -1;
                        return true;
                    } else if (opcode == 149) {
                        local133 = inboundBuffer.g2();
                        local786 = inboundBuffer.g4();
                        if (Static248.method3288(local133)) {
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
                    } else if (opcode == 187) {
                        local133 = inboundBuffer.g2le();
                        local786 = inboundBuffer.g2();
                        local864 = inboundBuffer.g2();
                        if (Static248.method3288(local786)) {
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
                    } else if (opcode == 132) {
                        local133 = inboundBuffer.g2();
                        local786 = inboundBuffer.g2sub();
                        local864 = inboundBuffer.g2leadd();
                        local171 = inboundBuffer.g2leadd();
                        local1146 = inboundBuffer.g4();
                        if (Static248.method3288(local786)) {
                            Static261.method4505(local864, local1146, local171, local133);
                        }
                        opcode = -1;
                        return true;
                    } else if (opcode == 112) {
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
                    } else if (opcode == 144) {
                        local133 = inboundBuffer.p4rme();
                        @Pc(2666) Component local2666 = InterfaceList.getComponent(local133);
                        for (local864 = 0; local864 < local2666.objTypes.length; local864++) {
                            local2666.objTypes[local864] = -1;
                            local2666.objTypes[local864] = 0;
                        }
                        Static43.redraw(local2666);
                        opcode = -1;
                        return true;
                    } else if (opcode == 130) {
                        local133 = inboundBuffer.g4me();
                        local786 = inboundBuffer.g2leadd();
                        local864 = inboundBuffer.g2sub();
                        if (local864 == 65535) {
                            local864 = -1;
                        }
                        if (Static248.method3288(local786)) {
                            Static132.method2607(-1, 1, local133, local864);
                        }
                        opcode = -1;
                        return true;
                    } else if (opcode == 192) {
                        Static270.anInt5795 = inboundBuffer.g1();
                        opcode = -1;
                        return true;
                    } else if (opcode == 13) {
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
                        if (opcode == 62) {
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
                            @Pc(2834) JagString local2834 = Base37.decodeLowerCase(local884).method3125();
                            for (local1986 = 0; local1986 < Static9.anInt178; local1986++) {
                                if (local884 == Static92.aLongArray3[local1986]) {
                                    if (local864 != Static104.anIntArray255[local1986]) {
                                        Static104.anIntArray255[local1986] = local864;
                                        if (local864 > 0) {
                                            Chat.add(JagString.EMPTY, 5, JagString.concatenate(new JagString[] { local2834, LocalizedText.FRIENDLOGIN}));
                                        }
                                        if (local864 == 0) {
                                            Chat.add(JagString.EMPTY, 5, JagString.concatenate(new JagString[] { local2834, LocalizedText.FRIENDLOGOUT}));
                                        }
                                    }
                                    Static214.aClass100Array170[local1986] = local506;
                                    Static106.anIntArray258[local1986] = local171;
                                    local2834 = null;
                                    Static3.aBooleanArray135[local1986] = local262;
                                    break;
                                }
                            }
                            if (local2834 != null && Static9.anInt178 < 200) {
                                Static92.aLongArray3[Static9.anInt178] = local884;
                                Static122.aClass100Array92[Static9.anInt178] = local2834;
                                Static104.anIntArray255[Static9.anInt178] = local864;
                                Static214.aClass100Array170[Static9.anInt178] = local506;
                                Static106.anIntArray258[Static9.anInt178] = local171;
                                Static3.aBooleanArray135[Static9.anInt178] = local262;
                                Static9.anInt178++;
                            }
                            FriendsList.transmitAt = InterfaceList.transmitTimer;
                            local908 = Static9.anInt178;
                            while (local908 > 0) {
                                local908--;
                                @Pc(2961) boolean local2961 = true;
                                for (local916 = 0; local916 < local908; local916++) {
                                    if (Static104.anIntArray255[local916] != Static125.worldId && Static125.worldId == Static104.anIntArray255[local916 + 1] || Static104.anIntArray255[local916] == 0 && Static104.anIntArray255[local916 + 1] != 0) {
                                        local2961 = false;
                                        local3002 = Static104.anIntArray255[local916];
                                        Static104.anIntArray255[local916] = Static104.anIntArray255[local916 + 1];
                                        Static104.anIntArray255[local916 + 1] = local3002;
                                        local3020 = Static214.aClass100Array170[local916];
                                        Static214.aClass100Array170[local916] = Static214.aClass100Array170[local916 + 1];
                                        Static214.aClass100Array170[local916 + 1] = local3020;
                                        local3038 = Static122.aClass100Array92[local916];
                                        Static122.aClass100Array92[local916] = Static122.aClass100Array92[local916 + 1];
                                        Static122.aClass100Array92[local916 + 1] = local3038;
                                        @Pc(3056) long local3056 = Static92.aLongArray3[local916];
                                        Static92.aLongArray3[local916] = Static92.aLongArray3[local916 + 1];
                                        Static92.aLongArray3[local916 + 1] = local3056;
                                        @Pc(3074) int local3074 = Static106.anIntArray258[local916];
                                        Static106.anIntArray258[local916] = Static106.anIntArray258[local916 + 1];
                                        Static106.anIntArray258[local916 + 1] = local3074;
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
                        } else if (opcode == 160) {
                            if (length == 0) {
                                Static195.aClass100_859 = LocalizedText.WALKHERE;
                            } else {
                                Static195.aClass100_859 = inboundBuffer.gjstr();
                            }
                            opcode = -1;
                            return true;
                        } else if (opcode == 128) {
                            for (local133 = 0; local133 < Static7.varps.length; local133++) {
                                if (Static106.anIntArray257[local133] != Static7.varps[local133]) {
                                    Static7.varps[local133] = Static106.anIntArray257[local133];
                                    Static85.method1775(local133);
                                    VarpDomain.updatedVarps[VarpDomain.updatedVarpsWriterIndex++ & 0x1F] = local133;
                                }
                            }
                            opcode = -1;
                            return true;
                        } else if (opcode == 154) {
                            local133 = inboundBuffer.g2();
                            local786 = inboundBuffer.g1();
                            local864 = inboundBuffer.g1();
                            local171 = inboundBuffer.g2();
                            local1146 = inboundBuffer.g1();
                            local277 = inboundBuffer.g1();
                            if (Static248.method3288(local133)) {
                                Static141.method2722(true, local1146, local171, local277, local864, local786);
                            }
                            opcode = -1;
                            return true;
                        } else if (opcode == 247) {
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
                                    for (local3272 = 0; local3272 < Static35.anInt1093; local3272++) {
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
                                    Chat.add(local1986, 18, local3020, null, JagString.concatenate(new JagString[] { Static44.aClass100_336, Base37.decodeLowerCase(local884).method3125() }));
                                } else if (local1160 == 1) {
                                    Chat.add(local1986, 18, local3020, null, JagString.concatenate(new JagString[] { Static65.aClass100_435, Base37.decodeLowerCase(local884).method3125() }));
                                } else {
                                    Chat.add(local1986, 18, local3020, null, Base37.decodeLowerCase(local884).method3125());
                                }
                            }
                            opcode = -1;
                            return true;
                        } else {
                            @Pc(3456) Class3_Sub31 local3456;
                            if (opcode == 176) {
                                local133 = inboundBuffer.g4rme();
                                local786 = inboundBuffer.g2sub();
                                local864 = inboundBuffer.g4rme();
                                if (Static248.method3288(local786)) {
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
                            } else if (opcode == 27) {
                                local133 = inboundBuffer.g2();
                                local786 = inboundBuffer.g1();
                                local864 = inboundBuffer.g1();
                                local171 = inboundBuffer.g1();
                                local1146 = inboundBuffer.g1();
                                local277 = inboundBuffer.g2();
                                if (Static248.method3288(local133)) {
                                    Static176.aBooleanArray95[local786] = true;
                                    Static222.anIntArray437[local786] = local864;
                                    Static276.anIntArray564[local786] = local171;
                                    Static202.anIntArray424[local786] = local1146;
                                    Static31.anIntArray76[local786] = local277;
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == 2) {
                                local133 = inboundBuffer.g4rme();
                                local786 = inboundBuffer.g2sub();
                                local864 = inboundBuffer.g2leadd();
                                if (Static248.method3288(local786)) {
                                    Static136.method2649(local864, local133);
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == 85) {
                                Static60.rebootTimer = inboundBuffer.g2() * 30;
                                opcode = -1;
                                InterfaceList.miscTransmitAt = InterfaceList.transmitTimer;
                                return true;
                            } else if (opcode == 114) {
                                Static202.method3654(GameShell.signLink, inboundBuffer, length);
                                opcode = -1;
                                return true;
                            } else if (opcode == 65) {
                                local133 = inboundBuffer.g2le();
                                local786 = inboundBuffer.p1neg();
                                local864 = inboundBuffer.g2leadd();
                                if (Static248.method3288(local133)) {
                                    Static132.method2606(local864, local786);
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == 234) {
                                InterfaceList.method2245();
                                Static12.anInt400 = inboundBuffer.g1();
                                InterfaceList.miscTransmitAt = InterfaceList.transmitTimer;
                                opcode = -1;
                                return true;
                            } else if (opcode == 209) {
                                if (InterfaceList.topLevelInterface != -1) {
                                    Static54.method1304(0, InterfaceList.topLevelInterface);
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == 191) {
                                local133 = inboundBuffer.g2le();
                                Static13.method472(local133);
                                Inv.updatedInventories[Static111.updatedInventoriesWriterIndex++ & 0x1F] = local133 & 0x7FFF;
                                opcode = -1;
                                return true;
                            } else if (opcode == 102) {
                                local133 = inboundBuffer.g2le();
                                local786 = inboundBuffer.g1ssub();
                                local864 = inboundBuffer.g2();
                                @Pc(3766) Npc local3766 = Static175.npcs[local133];
                                if (local3766 != null) {
                                    Static223.method3855(local786, local864, local3766);
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == 159) {
                                InterfaceList.method2245();
                                Static251.anInt5456 = inboundBuffer.g2s();
                                InterfaceList.miscTransmitAt = InterfaceList.transmitTimer;
                                opcode = -1;
                                return true;
                            } else if (opcode == 71) {
                                local884 = inboundBuffer.g8();
                                local790 = Static218.escape(Static65.formatChatMessage(inboundBuffer).encodeMessage());
                                Chat.add(Base37.decodeLowerCase(local884).method3125(), 6, local790);
                                opcode = -1;
                                return true;
                            } else if (opcode == 42) {
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
                            } else if (opcode == 111) {
                                local133 = inboundBuffer.g2sub();
                                local786 = inboundBuffer.p4rme();
                                local864 = inboundBuffer.g2leadd();
                                local171 = inboundBuffer.g2le();
                                local1146 = inboundBuffer.g2leadd();
                                if (Static248.method3288(local133)) {
                                    Static132.method2607(local864, 7, local786, local171 << 16 | local1146);
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == 37) {
                                local133 = inboundBuffer.g1add();
                                local786 = inboundBuffer.g2le();
                                Static272.method3995(local133, local786);
                                opcode = -1;
                                return true;
                            } else if (opcode == 155) {
                                local133 = inboundBuffer.g1();
                                local786 = inboundBuffer.p4rme();
                                local864 = inboundBuffer.g2sub();
                                local171 = inboundBuffer.g2();
                                if (Static248.method3288(local864)) {
                                    local3456 = (Class3_Sub31) Static119.aClass133_9.get((long) local786);
                                    if (local3456 != null) {
                                        Static132.method2605(local3456.anInt5878 != local171, local3456);
                                    }
                                    Static44.method1148(local171, local786, local133);
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == 131) {
                                for (local133 = 0; local133 < PlayerList.players.length; local133++) {
                                    if (PlayerList.players[local133] != null) {
                                        PlayerList.players[local133].seqId = -1;
                                    }
                                }
                                for (local133 = 0; local133 < Static175.npcs.length; local133++) {
                                    if (Static175.npcs[local133] != null) {
                                        Static175.npcs[local133].seqId = -1;
                                    }
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == 217) {
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
                            } else if (opcode == 126) {
                                Static35.anInt1093 = length / 8;
                                for (local133 = 0; local133 < Static35.anInt1093; local133++) {
                                    IgnoreList.encodedUsernames[local133] = inboundBuffer.g8();
                                    Static193.aClass100Array134[local133] = Base37.decodeLowerCase(IgnoreList.encodedUsernames[local133]);
                                }
                                FriendsList.transmitAt = InterfaceList.transmitTimer;
                                opcode = -1;
                                return true;
                            } else if (opcode == 32) {
                                Static86.method1800();
                                opcode = -1;
                                return true;
                            } else if (opcode == 119) {
                                local133 = inboundBuffer.g2sub();
                                local786 = inboundBuffer.g4me();
                                local864 = inboundBuffer.g2s();
                                local171 = inboundBuffer.g2sadd();
                                if (Static248.method3288(local133)) {
                                    Static280.method4666(local864, local786, local171);
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == 235) {
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
                            } else if (opcode == 0) {
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
                                                for (local3002 = 0; local3002 < Static35.anInt1093; local3002++) {
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
                                    @Pc(4518) JagString local4518 = Static218.escape(Static65.formatChatMessage(inboundBuffer).encodeMessage());
                                    if (local1160 == 2 || local1160 == 3) {
                                        Chat.add(JagString.concatenate(new JagString[] { Static44.aClass100_336, Base37.decodeLowerCase(local884).method3125() }), 7, local4518);
                                    } else if (local1160 == 1) {
                                        Chat.add(JagString.concatenate(new JagString[] { Static65.aClass100_435, Base37.decodeLowerCase(local884).method3125() }), 7, local4518);
                                    } else {
                                        Chat.add(Base37.decodeLowerCase(local884).method3125(), 3, local4518);
                                    }
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == 54) {
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
                                                for (local4634 = 0; local4634 < Static35.anInt1093; local4634++) {
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
                                    local3038 = Static218.escape(Static65.formatChatMessage(inboundBuffer).encodeMessage());
                                    if (local908 == 2 || local908 == 3) {
                                        Static73.method1598(local3038, JagString.concatenate(new JagString[] { Static44.aClass100_336, Base37.decodeLowerCase(local884).method3125() }), Base37.decodeLowerCase(local275).method3125());
                                    } else if (local908 == 1) {
                                        Static73.method1598(local3038, JagString.concatenate(new JagString[] { Static65.aClass100_435, Base37.decodeLowerCase(local884).method3125() }), Base37.decodeLowerCase(local275).method3125());
                                    } else {
                                        Static73.method1598(local3038, Base37.decodeLowerCase(local884).method3125(), Base37.decodeLowerCase(local275).method3125());
                                    }
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == 214) {
                                readRebuildPacket(true);
                                opcode = -1;
                                return true;
                            } else if (opcode == 172) {
                                local133 = inboundBuffer.g2();
                                local786 = inboundBuffer.g1();
                                if (local133 == 65535) {
                                    local133 = -1;
                                }
                                local864 = inboundBuffer.g2();
                                SoundPlayer.play(local786, local133, local864);
                                opcode = -1;
                                return true;
                            } else if (opcode == 66) {
                                local133 = inboundBuffer.g2leadd();
                                local786 = inboundBuffer.g4rme();
                                if (Static248.method3288(local133)) {
                                    local864 = 0;
                                    if (PlayerList.self.appearance != null) {
                                        local864 = PlayerList.self.appearance.method1952();
                                    }
                                    Static132.method2607(-1, 3, local786, local864);
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == 171) {
                                local133 = inboundBuffer.p4rme();
                                local156 = inboundBuffer.gjstr();
                                local864 = inboundBuffer.g2sub();
                                if (Static248.method3288(local864)) {
                                    Static80.method3617(local156, local133);
                                }
                                opcode = -1;
                                return true;
                            } else if (opcode == 84) {
                                local133 = inboundBuffer.g4me();
                                local786 = inboundBuffer.g2leadd();
                                Static272.method3995(local133, local786);
                                opcode = -1;
                                return true;
                            } else {
                                @Pc(4956) Component local4956;
                                if (opcode == 22) {
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
                                } else if (opcode == 24) {
                                    local133 = inboundBuffer.g2();
                                    if (Static248.method3288(local133)) {
                                        Static35.resetCameraEffects();
                                    }
                                    opcode = -1;
                                    return true;
                                } else if (opcode == 86) {
                                    Static278.processLogout();
                                    opcode = -1;
                                    return false;
                                } else if (opcode == 116) {
                                    local133 = inboundBuffer.g1();
                                    if (inboundBuffer.g1() == 0) {
                                        StockMarketManager.aClass136Array1[local133] = new StockMarketOffer();
                                    } else {
                                        inboundBuffer.offset--;
                                        StockMarketManager.aClass136Array1[local133] = new StockMarketOffer(inboundBuffer);
                                    }
                                    opcode = -1;
                                    StockMarketManager.transmitAt = InterfaceList.transmitTimer;
                                    return true;
                                } else if (opcode == 73) {
                                    local133 = inboundBuffer.g2sub();
                                    local786 = inboundBuffer.g4me();
                                    if (local133 == 65535) {
                                        local133 = -1;
                                    }
                                    local864 = inboundBuffer.g2le();
                                    if (Static248.method3288(local864)) {
                                        Static132.method2607(-1, 2, local786, local133);
                                    }
                                    opcode = -1;
                                    return true;
                                } else if (opcode == 162) {
                                    readRebuildPacket(false);
                                    opcode = -1;
                                    return true;
                                } else if (opcode == 165) {
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
                                    if (Static248.method3288(local133)) {
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
                                } else if (opcode == 197) {
                                    Static166.anInt4054 = inboundBuffer.g1();
                                    FriendsList.transmitAt = InterfaceList.transmitTimer;
                                    opcode = -1;
                                    return true;
                                } else if (opcode == 196) {
                                    local884 = inboundBuffer.g8();
                                    local864 = inboundBuffer.g2();
                                    @Pc(5325) byte local5325 = inboundBuffer.g1s();
                                    local262 = false;
                                    if ((Long.MIN_VALUE & local884) != 0L) {
                                        local262 = true;
                                    }
                                    if (local262) {
                                        if (Static214.anInt5577 == 0) {
                                            opcode = -1;
                                            return true;
                                        }
                                        local884 &= Long.MAX_VALUE;
                                        for (local277 = 0; Static214.anInt5577 > local277 && (local884 != Static199.aClass3_Sub22Array1[local277].key || local864 != Static199.aClass3_Sub22Array1[local277].anInt3340); local277++) {
                                        }
                                        if (local277 < Static214.anInt5577) {
                                            while (Static214.anInt5577 - 1 > local277) {
                                                Static199.aClass3_Sub22Array1[local277] = Static199.aClass3_Sub22Array1[local277 + 1];
                                                local277++;
                                            }
                                            Static214.anInt5577--;
                                            Static199.aClass3_Sub22Array1[Static214.anInt5577] = null;
                                        }
                                    } else {
                                        local506 = inboundBuffer.gjstr();
                                        @Pc(5347) Class3_Sub22 local5347 = new Class3_Sub22();
                                        local5347.key = local884;
                                        local5347.aClass100_636 = Base37.decodeLowerCase(local5347.key);
                                        local5347.aByte9 = local5325;
                                        local5347.aClass100_635 = local506;
                                        local5347.anInt3340 = local864;
                                        for (local1986 = Static214.anInt5577 - 1; local1986 >= 0; local1986--) {
                                            local908 = Static199.aClass3_Sub22Array1[local1986].aClass100_636.method3139(local5347.aClass100_636);
                                            if (local908 == 0) {
                                                Static199.aClass3_Sub22Array1[local1986].anInt3340 = local864;
                                                Static199.aClass3_Sub22Array1[local1986].aByte9 = local5325;
                                                Static199.aClass3_Sub22Array1[local1986].aClass100_635 = local506;
                                                if (local884 == Static101.aLong98) {
                                                    Static160.aByte14 = local5325;
                                                }
                                                ClanChat.transmitAt = InterfaceList.transmitTimer;
                                                opcode = -1;
                                                return true;
                                            }
                                            if (local908 < 0) {
                                                break;
                                            }
                                        }
                                        if (Static199.aClass3_Sub22Array1.length <= Static214.anInt5577) {
                                            opcode = -1;
                                            return true;
                                        }
                                        for (local908 = Static214.anInt5577 - 1; local908 > local1986; local908--) {
                                            Static199.aClass3_Sub22Array1[local908 + 1] = Static199.aClass3_Sub22Array1[local908];
                                        }
                                        if (Static214.anInt5577 == 0) {
                                            Static199.aClass3_Sub22Array1 = new Class3_Sub22[100];
                                        }
                                        Static199.aClass3_Sub22Array1[local1986 + 1] = local5347;
                                        if (Static101.aLong98 == local884) {
                                            Static160.aByte14 = local5325;
                                        }
                                        Static214.anInt5577++;
                                    }
                                    opcode = -1;
                                    ClanChat.transmitAt = InterfaceList.transmitTimer;
                                    return true;
                                } else if (opcode == 50) {
                                    local133 = inboundBuffer.g4();
                                    local786 = inboundBuffer.p4rme();
                                    local864 = inboundBuffer.g2leadd();
                                    if (local864 == 65535) {
                                        local864 = -1;
                                    }
                                    local171 = inboundBuffer.g2le();
                                    if (Static248.method3288(local171)) {
                                        @Pc(5603) Component local5603 = InterfaceList.getComponent(local786);
                                        @Pc(5615) ObjType local5615;
                                        if (local5603.aBoolean32) {
                                            Static209.method3707(local786, local133, local864);
                                            local5615 = ObjTypeList.get(local864);
                                            Static261.method4505(local5615.zoom2d, local786, local5615.yAngle2d, local5615.xAngle2d);
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
                                } else if (opcode == 105) {
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
                                } else if (opcode == 142) {
                                    Static230.method3954(inboundBuffer.gjstr());
                                    opcode = -1;
                                    return true;
                                } else if (opcode == 26) {
                                    Static115.anInt2940 = inboundBuffer.p1neg();
                                    Static180.anInt4264 = inboundBuffer.g1();
                                    opcode = -1;
                                    return true;
                                } else if (opcode == 4) {
                                    local133 = inboundBuffer.g2leadd();
                                    if (local133 == 65535) {
                                        local133 = -1;
                                    }
                                    Static148.method2765(local133);
                                    opcode = -1;
                                    return true;
                                } else if (opcode == 208) {
                                    local133 = inboundBuffer.g3le();
                                    local786 = inboundBuffer.g2le();
                                    if (local786 == 65535) {
                                        local786 = -1;
                                    }
                                    Static278.method4650(local133, local786);
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
}
