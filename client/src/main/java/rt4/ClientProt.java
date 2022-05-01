package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;

public class ClientProt {
    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!na;IIBI)V")
    public static void method4512(@OriginalArg(0) JagString arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
        @Pc(8) Component local8 = Static201.method1418(arg3, arg1);
        if (local8 == null) {
            return;
        }
        if (local8.anObjectArray29 != null) {
            @Pc(19) HookRequest local19 = new HookRequest();
            local19.arguments = local8.anObjectArray29;
            local19.source = local8;
            local19.opBase = arg0;
            local19.op = arg2;
            ScriptRunner.run(local19);
        }
        @Pc(37) boolean local37 = true;
        if (local8.anInt453 > 0) {
            local37 = Static249.method4265(local8);
        }
        if (!local37 || !InterfaceList.getServerActiveProperties(local8).method503(arg2 - 1)) {
            return;
        }
        if (arg2 == 1) {
            Protocol.outboundBuffer.p1isaac(155);
            Protocol.outboundBuffer.p4(arg3);
            Protocol.outboundBuffer.p2(arg1);
        }
        if (arg2 == 2) {
            Protocol.outboundBuffer.p1isaac(196);
            Protocol.outboundBuffer.p4(arg3);
            Protocol.outboundBuffer.p2(arg1);
        }
        if (arg2 == 3) {
            Protocol.outboundBuffer.p1isaac(124);
            Protocol.outboundBuffer.p4(arg3);
            Protocol.outboundBuffer.p2(arg1);
        }
        if (arg2 == 4) {
            Protocol.outboundBuffer.p1isaac(199);
            Protocol.outboundBuffer.p4(arg3);
            Protocol.outboundBuffer.p2(arg1);
        }
        if (arg2 == 5) {
            Protocol.outboundBuffer.p1isaac(234);
            Protocol.outboundBuffer.p4(arg3);
            Protocol.outboundBuffer.p2(arg1);
        }
        if (arg2 == 6) {
            Protocol.outboundBuffer.p1isaac(168);
            Protocol.outboundBuffer.p4(arg3);
            Protocol.outboundBuffer.p2(arg1);
        }
        if (arg2 == 7) {
            Protocol.outboundBuffer.p1isaac(166);
            Protocol.outboundBuffer.p4(arg3);
            Protocol.outboundBuffer.p2(arg1);
        }
        if (arg2 == 8) {
            Protocol.outboundBuffer.p1isaac(64);
            Protocol.outboundBuffer.p4(arg3);
            Protocol.outboundBuffer.p2(arg1);
        }
        if (arg2 == 9) {
            Protocol.outboundBuffer.p1isaac(53);
            Protocol.outboundBuffer.p4(arg3);
            Protocol.outboundBuffer.p2(arg1);
        }
        if (arg2 == 10) {
            Protocol.outboundBuffer.p1isaac(9);
            Protocol.outboundBuffer.p4(arg3);
            Protocol.outboundBuffer.p2(arg1);
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(III)V")
    public static void method3502(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
        @Pc(13) int local13 = arg0;
        if (arg0 > 25) {
            local13 = 25;
        }
        arg0--;
        @Pc(23) int local23 = Static259.anIntArray514[arg0];
        @Pc(27) int local27 = Static84.anIntArray209[arg0];
        if (arg1 == 0) {
            Protocol.outboundBuffer.p1isaac(215);
            Protocol.outboundBuffer.p1(local13 + local13 + 3);
        }
        if (arg1 == 1) {
            Protocol.outboundBuffer.p1isaac(39);
            Protocol.outboundBuffer.p1(local13 + local13 + 3 + 14);
        }
        if (arg1 == 2) {
            Protocol.outboundBuffer.p1isaac(77);
            Protocol.outboundBuffer.p1(local13 + local13 + 3);
        }
        Protocol.outboundBuffer.p1a(Keyboard.pressedKeys[Keyboard.KEY_CTRL] ? 1 : 0);
        Protocol.outboundBuffer.p2(Static225.originX + local23);
        Protocol.outboundBuffer.p2add(Static142.originZ + local27);
        Static84.anInt2255 = Static84.anIntArray209[0];
        Static115.mapFlagX = Static259.anIntArray514[0];
        for (@Pc(126) int local126 = 1; local126 < local13; local126++) {
            arg0--;
            Protocol.outboundBuffer.p1a(Static259.anIntArray514[arg0] - local23);
            Protocol.outboundBuffer.p1sub(Static84.anIntArray209[arg0] - local27);
        }
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(B)V")
    public static void method2909() {
        Protocol.outboundBuffer.p1isaac(184);
        for (@Pc(18) ComponentPointer local18 = (ComponentPointer) InterfaceList.openInterfaces.head(); local18 != null; local18 = (ComponentPointer) InterfaceList.openInterfaces.next()) {
            if (local18.anInt5879 == 0) {
                Static132.closeInterface(true, local18);
            }
        }
        if (Static39.aClass13_10 != null) {
            InterfaceList.redraw(Static39.aClass13_10);
            Static39.aClass13_10 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILclient!na;)V")
    public static void method4613(@OriginalArg(0) int arg0, @OriginalArg(2) JagString arg1) {
        @Pc(7) JagString local7 = arg1.method3159().toTitleCase();
        @Pc(13) boolean local13 = false;
        for (@Pc(15) int local15 = 0; local15 < PlayerList.size; local15++) {
            @Pc(28) Player local28 = PlayerList.players[PlayerList.ids[local15]];
            if (local28 != null && local28.username != null && local28.username.equalsIgnoreCase(local7)) {
                local13 = true;
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local28.movementQueueX[0], 1, 0, 2, local28.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
                if (arg0 == 1) {
                    Protocol.outboundBuffer.p1isaac(68);
                    Protocol.outboundBuffer.p2leadd(PlayerList.ids[local15]);
                } else if (arg0 == 4) {
                    Protocol.outboundBuffer.p1isaac(180);
                    Protocol.outboundBuffer.p2leadd(PlayerList.ids[local15]);
                } else if (arg0 == 5) {
                    Protocol.outboundBuffer.p1isaac(4);
                    Protocol.outboundBuffer.p2le(PlayerList.ids[local15]);
                } else if (arg0 == 6) {
                    Protocol.outboundBuffer.p1isaac(133);
                    Protocol.outboundBuffer.p2le(PlayerList.ids[local15]);
                } else if (arg0 == 7) {
                    Protocol.outboundBuffer.p1isaac(114);
                    Protocol.outboundBuffer.p2leadd(PlayerList.ids[local15]);
                }
                break;
            }
        }
        if (!local13) {
            Chat.add(JagString.EMPTY, 0, JagString.concatenate(new JagString[] { LocalizedText.UNABLETOFIND, local7 }));
        }
    }

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(II)V")
    public static void method2232(@OriginalArg(1) int arg0) {
        if (arg0 < 0) {
            return;
        }
        @Pc(15) int local15 = Static196.anIntArray408[arg0];
        @Pc(19) int local19 = Static56.anIntArray142[arg0];
        @Pc(23) int local23 = Static39.aShortArray6[arg0];
        if (local23 >= 2000) {
            local23 -= 2000;
        }
        @Pc(31) long local31 = Static159.aLongArray5[arg0];
        @Pc(36) int local36 = (int) Static159.aLongArray5[arg0];
        @Pc(43) Player local43;
        if (local23 == 31) {
            local43 = PlayerList.players[local36];
            if (local43 != null) {
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
                Cross.type = 2;
                Cross.milliseconds = 0;
                Cross.x = Mouse.clickX;
                Cross.y = Mouse.clickY;
                Protocol.outboundBuffer.p1isaac(71);
                Protocol.outboundBuffer.p2leadd(local36);
            }
        }
        if (local23 == 46) {
            Static233.method4003(local31, local19, local15);
            Protocol.outboundBuffer.p1isaac(247);
            Protocol.outboundBuffer.p2le(Static142.originZ + local19);
            Protocol.outboundBuffer.p2leadd(local15 + Static225.originX);
            Protocol.outboundBuffer.p2(Integer.MAX_VALUE & (int) (local31 >>> 32));
        }
        if (local23 == 40) {
            Protocol.outboundBuffer.p1isaac(27);
            Protocol.outboundBuffer.p2(Static185.anInt4370);
            Protocol.outboundBuffer.p4le2(local19);
            Protocol.outboundBuffer.p2le(local15);
            Protocol.outboundBuffer.p4le2(Static224.anInt5062);
            Protocol.outboundBuffer.p2leadd(Static274.anInt4997);
            Protocol.outboundBuffer.p2leadd(local36);
            Static72.anInt2043 = 0;
            Static257.aClass13_7 = InterfaceList.getComponent(local19);
            Static250.anInt5444 = local15;
        }
        @Pc(192) Npc local192;
        if (local23 == 19) {
            local192 = NpcList.npcs[local36];
            if (local192 != null) {
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
                Cross.x = Mouse.clickX;
                Cross.type = 2;
                Cross.milliseconds = 0;
                Cross.y = Mouse.clickY;
                Protocol.outboundBuffer.p1isaac(30);
                Protocol.outboundBuffer.p2(local36);
            }
        }
        if (local23 == 17) {
            local192 = NpcList.npcs[local36];
            if (local192 != null) {
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
                Cross.x = Mouse.clickX;
                Cross.milliseconds = 0;
                Cross.type = 2;
                Cross.y = Mouse.clickY;
                Protocol.outboundBuffer.p1isaac(78);
                Protocol.outboundBuffer.p2le(local36);
            }
        }
        if (local23 == 44) {
            local43 = PlayerList.players[local36];
            if (local43 != null) {
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
                Cross.x = Mouse.clickX;
                Cross.type = 2;
                Cross.y = Mouse.clickY;
                Cross.milliseconds = 0;
                Protocol.outboundBuffer.p1isaac(133);
                Protocol.outboundBuffer.p2le(local36);
            }
        }
        if (local23 == 58) {
            Protocol.outboundBuffer.p1isaac(135);
            Protocol.outboundBuffer.p2add(local36);
            Protocol.outboundBuffer.p2add(local15);
            Protocol.outboundBuffer.p4me(local19);
            Static72.anInt2043 = 0;
            Static257.aClass13_7 = InterfaceList.getComponent(local19);
            Static250.anInt5444 = local15;
        }
        if (local23 == 42) {
            Static233.method4003(local31, local19, local15);
            Protocol.outboundBuffer.p1isaac(254);
            Protocol.outboundBuffer.p2le(local15 + Static225.originX);
            Protocol.outboundBuffer.p2add((int) (local31 >>> 32) & Integer.MAX_VALUE);
            Protocol.outboundBuffer.p2(local19 + Static142.originZ);
        }
        if (local23 == 28) {
            method2909();
        }
        if (local23 == 45) {
            local192 = NpcList.npcs[local36];
            if (local192 != null) {
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
                Cross.x = Mouse.clickX;
                Cross.type = 2;
                Cross.milliseconds = 0;
                Cross.y = Mouse.clickY;
                Protocol.outboundBuffer.p1isaac(239);
                Protocol.outboundBuffer.p4le2(Static98.anInt2512);
                Protocol.outboundBuffer.p2add(Static15.anInt506);
                Protocol.outboundBuffer.p2leadd(local36);
            }
        }
        @Pc(560) boolean local560;
        if (local23 == 18) {
            if (client.game == 1) {
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
            } else {
                local560 = Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, PlayerList.self.movementQueueX[0]);
                if (!local560) {
                    Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
                }
            }
            Cross.x = Mouse.clickX;
            Cross.milliseconds = 0;
            Cross.type = 2;
            Cross.y = Mouse.clickY;
            Protocol.outboundBuffer.p1isaac(66);
            Protocol.outboundBuffer.p2le(Static225.originX + local15);
            Protocol.outboundBuffer.p2(local36);
            Protocol.outboundBuffer.p2leadd(local19 + Static142.originZ);
        }
        if (local23 == 1001) {
            Static233.method4003(local31, local19, local15);
            Protocol.outboundBuffer.p1isaac(170);
            Protocol.outboundBuffer.p2leadd(Integer.MAX_VALUE & (int) (local31 >>> 32));
            Protocol.outboundBuffer.p2leadd(local15 + Static225.originX);
            Protocol.outboundBuffer.p2leadd(local19 + Static142.originZ);
        }
        if (local23 == 1002) {
            Cross.type = 2;
            Cross.x = Mouse.clickX;
            Cross.y = Mouse.clickY;
            Cross.milliseconds = 0;
            Protocol.outboundBuffer.p1isaac(92);
            Protocol.outboundBuffer.p2leadd(local36);
        }
        @Pc(693) Component local693;
        if (local23 == 1006) {
            local693 = InterfaceList.getComponent(local19);
            if (local693 == null || local693.objCounts[local15] < 100000) {
                Protocol.outboundBuffer.p1isaac(92);
                Protocol.outboundBuffer.p2leadd(local36);
            } else {
                Chat.add(JagString.EMPTY, 0, JagString.concatenate(new JagString[] { Static123.parseInt(local693.objCounts[local15]), Static249.aClass100_1039, ObjTypeList.get(local36).name}));
            }
            Static72.anInt2043 = 0;
            Static257.aClass13_7 = InterfaceList.getComponent(local19);
            Static250.anInt5444 = local15;
        }
        if (local23 == 60) {
            if (local36 == 0) {
                Static113.method3556(Player.level, local15, local19);
            } else if (local36 == 1) {
                if (LoginManager.staffModLevel > 0 && Keyboard.pressedKeys[Keyboard.KEY_CTRL] && Keyboard.pressedKeys[Keyboard.KEY_SHIFT]) {
                    Cheat.teleport(Static225.originX + local15, Static142.originZ + local19, Player.level);
                } else if (Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 0, true, 0, local15, 0, 0, 1, local19, PlayerList.self.movementQueueX[0])) {
                    Protocol.outboundBuffer.p1(Static1.anInt5);
                    Protocol.outboundBuffer.p1(Static107.anInt2878);
                    Protocol.outboundBuffer.p2((int)Camera.yawTarget);
                    Protocol.outboundBuffer.p1(57);
                    Protocol.outboundBuffer.p1(Static59.anInt1814);
                    Protocol.outboundBuffer.p1(Static273.anInt4130);
                    Protocol.outboundBuffer.p1(89);
                    Protocol.outboundBuffer.p2(PlayerList.self.xFine);
                    Protocol.outboundBuffer.p2(PlayerList.self.zFine);
                    Protocol.outboundBuffer.p1(Static221.anInt4364);
                    Protocol.outboundBuffer.p1(63);
                }
            }
        }
        if (local23 == 1007) {
            Cross.milliseconds = 0;
            Cross.type = 2;
            Cross.y = Mouse.clickY;
            Cross.x = Mouse.clickX;
            local192 = NpcList.npcs[local36];
            if (local192 != null) {
                @Pc(884) NpcType local884 = local192.type;
                if (local884.multiNpcs != null) {
                    local884 = local884.getMultiNpc();
                }
                if (local884 != null) {
                    Protocol.outboundBuffer.p1isaac(72);
                    Protocol.outboundBuffer.p2(local884.id);
                }
            }
        }
        if (local23 == 47) {
            Protocol.outboundBuffer.p1isaac(156);
            Protocol.outboundBuffer.p2leadd(local15);
            Protocol.outboundBuffer.p2add(local36);
            Protocol.outboundBuffer.p4le2(local19);
            Static72.anInt2043 = 0;
            Static257.aClass13_7 = InterfaceList.getComponent(local19);
            Static250.anInt5444 = local15;
        }
        if (local23 == 3) {
            Protocol.outboundBuffer.p1isaac(253);
            Protocol.outboundBuffer.p4le2(Static98.anInt2512);
            Protocol.outboundBuffer.p2leadd(local15);
            Protocol.outboundBuffer.p4le2(local19);
            Protocol.outboundBuffer.p2add(local36);
            Protocol.outboundBuffer.p2le(Static15.anInt506);
            Static72.anInt2043 = 0;
            Static257.aClass13_7 = InterfaceList.getComponent(local19);
            Static250.anInt5444 = local15;
        }
        if (local23 == 10) {
            local43 = PlayerList.players[local36];
            if (local43 != null) {
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
                Cross.type = 2;
                Cross.y = Mouse.clickY;
                Cross.x = Mouse.clickX;
                Cross.milliseconds = 0;
                Protocol.outboundBuffer.p1isaac(4);
                Protocol.outboundBuffer.p2le(local36);
            }
        }
        if (local23 == 41 && Static39.aClass13_10 == null) {
            method10(local15, local19);
            Static39.aClass13_10 = Static201.method1418(local19, local15);
            InterfaceList.redraw(Static39.aClass13_10);
        }
        if (local23 == 49) {
            Static233.method4003(local31, local19, local15);
            Protocol.outboundBuffer.p1isaac(84);
            Protocol.outboundBuffer.p2leadd(Integer.MAX_VALUE & (int) (local31 >>> 32));
            Protocol.outboundBuffer.p2leadd(Static142.originZ + local19);
            Protocol.outboundBuffer.p2le(local15 + Static225.originX);
        }
        if (local23 == 23) {
            Protocol.outboundBuffer.p1isaac(206);
            Protocol.outboundBuffer.p2add(local36);
            Protocol.outboundBuffer.p2le(local15);
            Protocol.outboundBuffer.p4le2(local19);
            Static72.anInt2043 = 0;
            Static257.aClass13_7 = InterfaceList.getComponent(local19);
            Static250.anInt5444 = local15;
        }
        if (local23 == 14 && Static233.method4003(local31, local19, local15)) {
            Protocol.outboundBuffer.p1isaac(134);
            Protocol.outboundBuffer.p2add(Static225.originX + local15);
            Protocol.outboundBuffer.p2(Static274.anInt4997);
            Protocol.outboundBuffer.p2le(local19 + Static142.originZ);
            Protocol.outboundBuffer.p2(Static185.anInt4370);
            Protocol.outboundBuffer.p4me(Static224.anInt5062);
            Protocol.outboundBuffer.p2add((int) (local31 >>> 32) & Integer.MAX_VALUE);
        }
        if (local23 == 37) {
            local43 = PlayerList.players[local36];
            if (local43 != null) {
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
                Cross.milliseconds = 0;
                Cross.type = 2;
                Cross.y = Mouse.clickY;
                Cross.x = Mouse.clickX;
                Protocol.outboundBuffer.p1isaac(114);
                Protocol.outboundBuffer.p2leadd(local36);
            }
        }
        if (local23 == 9 || local23 == 1003) {
            method4512(Static233.aClass100Array160[arg0], local15, local36, local19);
        }
        if (local23 == 5) {
            Protocol.outboundBuffer.p1isaac(55);
            Protocol.outboundBuffer.p2le(local36);
            Protocol.outboundBuffer.p2add(local15);
            Protocol.outboundBuffer.p4rme(local19);
            Static72.anInt2043 = 0;
            Static257.aClass13_7 = InterfaceList.getComponent(local19);
            Static250.anInt5444 = local15;
        }
        if (local23 == 21) {
            if (client.game == 1) {
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
            } else {
                local560 = Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, PlayerList.self.movementQueueX[0]);
                if (!local560) {
                    Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
                }
            }
            Cross.type = 2;
            Cross.x = Mouse.clickX;
            Cross.milliseconds = 0;
            Cross.y = Mouse.clickY;
            Protocol.outboundBuffer.p1isaac(228);
            Protocol.outboundBuffer.p2(local36);
            Protocol.outboundBuffer.p2le(Static225.originX + local15);
            Protocol.outboundBuffer.p2leadd(Static142.originZ + local19);
        }
        if (local23 == 4) {
            local192 = NpcList.npcs[local36];
            if (local192 != null) {
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
                Cross.type = 2;
                Cross.milliseconds = 0;
                Cross.y = Mouse.clickY;
                Cross.x = Mouse.clickX;
                Protocol.outboundBuffer.p1isaac(148);
                Protocol.outboundBuffer.p2add(local36);
            }
        }
        if (local23 == 32) {
            local693 = Static201.method1418(local19, local15);
            if (local693 != null) {
                Static53.method1294();
                @Pc(1493) ServerActiveProperties local1493 = InterfaceList.getServerActiveProperties(local693);
                Static247.method4246(local19, local15, local1493.getTargetMask(), local1493.anInt540, local693.anInt499, local693.anInt484);
                Static260.anInt5014 = 0;
                Static102.aClass100_545 = Static97.method1963(local693);
                if (Static102.aClass100_545 == null) {
                    Static102.aClass100_545 = Static250.aClass100_1042;
                }
                if (local693.usingScripts) {
                    Static78.aClass100_466 = JagString.concatenate(new JagString[] { local693.opBase, Static204.aClass100_896 });
                } else {
                    Static78.aClass100_466 = JagString.concatenate(new JagString[] { MiniMenu.COLOR_GREEN, local693.aClass100_85, Static204.aClass100_896 });
                }
            }
            return;
        }
        if (local23 == 29) {
            local43 = PlayerList.players[local36];
            if (local43 != null) {
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
                Cross.y = Mouse.clickY;
                Cross.milliseconds = 0;
                Cross.type = 2;
                Cross.x = Mouse.clickX;
                Protocol.outboundBuffer.p1isaac(180);
                Protocol.outboundBuffer.p2leadd(local36);
            }
        }
        if (local23 == 35) {
            Protocol.outboundBuffer.p1isaac(161);
            Protocol.outboundBuffer.p4le2(local19);
            Protocol.outboundBuffer.p2leadd(local36);
            Protocol.outboundBuffer.p2leadd(local15);
            Static72.anInt2043 = 0;
            Static257.aClass13_7 = InterfaceList.getComponent(local19);
            Static250.anInt5444 = local15;
        }
        if (local23 == 15) {
            local43 = PlayerList.players[local36];
            if (local43 != null) {
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
                Cross.milliseconds = 0;
                Cross.type = 2;
                Cross.x = Mouse.clickX;
                Cross.y = Mouse.clickY;
                Protocol.outboundBuffer.p1isaac(195);
                Protocol.outboundBuffer.p2add(Static15.anInt506);
                Protocol.outboundBuffer.p4le2(Static98.anInt2512);
                Protocol.outboundBuffer.p2leadd(local36);
            }
        }
        if (local23 == 34) {
            if (client.game == 1) {
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
            } else {
                local560 = Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, PlayerList.self.movementQueueX[0]);
                if (!local560) {
                    Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
                }
            }
            Cross.x = Mouse.clickX;
            Cross.type = 2;
            Cross.y = Mouse.clickY;
            Cross.milliseconds = 0;
            Protocol.outboundBuffer.p1isaac(109);
            Protocol.outboundBuffer.p2le(local19 + Static142.originZ);
            Protocol.outboundBuffer.p2(local15 + Static225.originX);
            Protocol.outboundBuffer.p2leadd(local36);
        }
        if (local23 == 25) {
            Protocol.outboundBuffer.p1isaac(81);
            Protocol.outboundBuffer.p2add(local15);
            Protocol.outboundBuffer.p2(local36);
            Protocol.outboundBuffer.p4rme(local19);
            Static72.anInt2043 = 0;
            Static257.aClass13_7 = InterfaceList.getComponent(local19);
            Static250.anInt5444 = local15;
        }
        if (local23 == 2) {
            local192 = NpcList.npcs[local36];
            if (local192 != null) {
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
                Cross.y = Mouse.clickY;
                Cross.type = 2;
                Cross.x = Mouse.clickX;
                Cross.milliseconds = 0;
                Protocol.outboundBuffer.p1isaac(218);
                Protocol.outboundBuffer.p2le(local36);
            }
        }
        @Pc(1955) int local1955;
        if (local23 == 51) {
            Protocol.outboundBuffer.p1isaac(10);
            Protocol.outboundBuffer.p4(local19);
            local693 = InterfaceList.getComponent(local19);
            if (local693.anIntArrayArray4 != null && local693.anIntArrayArray4[0][0] == 5) {
                local1955 = local693.anIntArrayArray4[0][1];
                if (VarpDomain.activeVarps[local1955] != local693.anIntArray48[0]) {
                    VarpDomain.activeVarps[local1955] = local693.anIntArray48[0];
                    Static85.refreshMagicVarp(local1955);
                }
            }
        }
        if (local23 == 26) {
            local192 = NpcList.npcs[local36];
            if (local192 != null) {
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
                Cross.type = 2;
                Cross.milliseconds = 0;
                Cross.y = Mouse.clickY;
                Cross.x = Mouse.clickX;
                Protocol.outboundBuffer.p1isaac(115);
                Protocol.outboundBuffer.p4me(Static224.anInt5062);
                Protocol.outboundBuffer.p2le(Static185.anInt4370);
                Protocol.outboundBuffer.p2le(local36);
                Protocol.outboundBuffer.p2leadd(Static274.anInt4997);
            }
        }
        if (local23 == 59) {
            Protocol.outboundBuffer.p1isaac(10);
            Protocol.outboundBuffer.p4(local19);
            local693 = InterfaceList.getComponent(local19);
            if (local693.anIntArrayArray4 != null && local693.anIntArrayArray4[0][0] == 5) {
                local1955 = local693.anIntArrayArray4[0][1];
                VarpDomain.activeVarps[local1955] = 1 - VarpDomain.activeVarps[local1955];
                Static85.refreshMagicVarp(local1955);
            }
        }
        if (local23 == 33) {
            local560 = Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, PlayerList.self.movementQueueX[0]);
            if (!local560) {
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
            }
            Cross.x = Mouse.clickX;
            Cross.milliseconds = 0;
            Cross.y = Mouse.clickY;
            Cross.type = 2;
            Protocol.outboundBuffer.p1isaac(101);
            Protocol.outboundBuffer.p2leadd(local15 + Static225.originX);
            Protocol.outboundBuffer.p2le(Static185.anInt4370);
            Protocol.outboundBuffer.p2le(Static274.anInt4997);
            Protocol.outboundBuffer.p2le(local36);
            Protocol.outboundBuffer.p2leadd(Static142.originZ + local19);
            Protocol.outboundBuffer.p4me(Static224.anInt5062);
        }
        if (local23 == 1004) {
            Cross.milliseconds = 0;
            Cross.x = Mouse.clickX;
            Cross.type = 2;
            Cross.y = Mouse.clickY;
            Protocol.outboundBuffer.p1isaac(94);
            Protocol.outboundBuffer.p2leadd(local36);
        }
        if (local23 == 11) {
            if (local36 == 0) {
                Static125.anInt3096 = 1;
                Static113.method3556(Player.level, local15, local19);
            } else if (local36 == 1) {
                Protocol.outboundBuffer.p1isaac(131);
                Protocol.outboundBuffer.p4me(Static98.anInt2512);
                Protocol.outboundBuffer.p2add(Static225.originX + local15);
                Protocol.outboundBuffer.p2leadd(Static15.anInt506);
                Protocol.outboundBuffer.p2add(local19 + Static142.originZ);
            }
        }
        if (local23 == 8) {
            local693 = InterfaceList.getComponent(local19);
            @Pc(2287) boolean local2287 = true;
            if (local693.anInt453 > 0) {
                local2287 = Static249.method4265(local693);
            }
            if (local2287) {
                Protocol.outboundBuffer.p1isaac(10);
                Protocol.outboundBuffer.p4(local19);
            }
        }
        if (local23 == 1) {
            local43 = PlayerList.players[local36];
            if (local43 != null) {
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
                Cross.milliseconds = 0;
                Cross.y = Mouse.clickY;
                Cross.type = 2;
                Cross.x = Mouse.clickX;
                Protocol.outboundBuffer.p1isaac(248);
                Protocol.outboundBuffer.p2leadd(local36);
                Protocol.outboundBuffer.p2(Static274.anInt4997);
                Protocol.outboundBuffer.p2(Static185.anInt4370);
                Protocol.outboundBuffer.p4me(Static224.anInt5062);
            }
        }
        if (local23 == 7) {
            Protocol.outboundBuffer.p1isaac(85);
            Protocol.outboundBuffer.p4rme(local19);
            Protocol.outboundBuffer.p2(local15);
            Protocol.outboundBuffer.p2add(local36);
            Static72.anInt2043 = 0;
            Static257.aClass13_7 = InterfaceList.getComponent(local19);
            Static250.anInt5444 = local15;
        }
        if (local23 == 24) {
            if (client.game == 1) {
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
            } else {
                local560 = Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, PlayerList.self.movementQueueX[0]);
                if (!local560) {
                    Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
                }
            }
            Cross.type = 2;
            Cross.y = Mouse.clickY;
            Cross.x = Mouse.clickX;
            Cross.milliseconds = 0;
            Protocol.outboundBuffer.p1isaac(48);
            Protocol.outboundBuffer.p2add(local15 + Static225.originX);
            Protocol.outboundBuffer.p2leadd(local36);
            Protocol.outboundBuffer.p2le(Static142.originZ + local19);
        }
        if (local23 == 38 && Static233.method4003(local31, local19, local15)) {
            Protocol.outboundBuffer.p1isaac(233);
            Protocol.outboundBuffer.p2leadd(local19 + Static142.originZ);
            Protocol.outboundBuffer.p2add(Static225.originX + local15);
            Protocol.outboundBuffer.p2leadd(Static15.anInt506);
            Protocol.outboundBuffer.p4rme(Static98.anInt2512);
            Protocol.outboundBuffer.p2add((int) (local31 >>> 32) & Integer.MAX_VALUE);
        }
        if (local23 == 13) {
            Protocol.outboundBuffer.p1isaac(6);
            Protocol.outboundBuffer.p4(local19);
            Protocol.outboundBuffer.p2add(local15);
            Protocol.outboundBuffer.p2le(local36);
            Static72.anInt2043 = 0;
            Static257.aClass13_7 = InterfaceList.getComponent(local19);
            Static250.anInt5444 = local15;
        }
        if (local23 == 57) {
            local43 = PlayerList.players[local36];
            if (local43 != null) {
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
                Cross.type = 2;
                Cross.y = Mouse.clickY;
                Cross.x = Mouse.clickX;
                Cross.milliseconds = 0;
                Protocol.outboundBuffer.p1isaac(175);
                Protocol.outboundBuffer.p2add(local36);
            }
        }
        if (local23 == 22) {
            Static53.method1294();
            local693 = InterfaceList.getComponent(local19);
            Static224.anInt5062 = local19;
            Static185.anInt4370 = local15;
            Static260.anInt5014 = 1;
            Static274.anInt4997 = local36;
            InterfaceList.redraw(local693);
            Static34.aClass100_203 = JagString.concatenate(new JagString[] { Static8.aClass100_32, ObjTypeList.get(local36).name, Static204.aClass100_896 });
            if (Static34.aClass100_203 == null) {
                Static34.aClass100_203 = Static92.NULL;
            }
            return;
        }
        if (local23 == 50) {
            Static233.method4003(local31, local19, local15);
            Protocol.outboundBuffer.p1isaac(194);
            Protocol.outboundBuffer.p2leadd(local19 + Static142.originZ);
            Protocol.outboundBuffer.p2le(Static225.originX + local15);
            Protocol.outboundBuffer.p2((int) (local31 >>> 32) & Integer.MAX_VALUE);
        }
        if (local23 == 48) {
            Protocol.outboundBuffer.p1isaac(154);
            Protocol.outboundBuffer.p2le(local15);
            Protocol.outboundBuffer.p4rme(local19);
            Protocol.outboundBuffer.p2leadd(local36);
            Static72.anInt2043 = 0;
            Static257.aClass13_7 = InterfaceList.getComponent(local19);
            Static250.anInt5444 = local15;
        }
        if (local23 == 30) {
            local43 = PlayerList.players[local36];
            if (local43 != null) {
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
                Cross.milliseconds = 0;
                Cross.x = Mouse.clickX;
                Cross.y = Mouse.clickY;
                Cross.type = 2;
                Protocol.outboundBuffer.p1isaac(68);
                Protocol.outboundBuffer.p2leadd(local36);
            }
        }
        if (local23 == 43) {
            Protocol.outboundBuffer.p1isaac(153);
            Protocol.outboundBuffer.p4le2(local19);
            Protocol.outboundBuffer.p2le(local15);
            Protocol.outboundBuffer.p2le(local36);
            Static72.anInt2043 = 0;
            Static257.aClass13_7 = InterfaceList.getComponent(local19);
            Static250.anInt5444 = local15;
        }
        if (local23 == 39) {
            local560 = Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, PlayerList.self.movementQueueX[0]);
            if (!local560) {
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
            }
            Cross.y = Mouse.clickY;
            Cross.x = Mouse.clickX;
            Cross.type = 2;
            Cross.milliseconds = 0;
            Protocol.outboundBuffer.p1isaac(73);
            Protocol.outboundBuffer.p4rme(Static98.anInt2512);
            Protocol.outboundBuffer.p2(Static142.originZ + local19);
            Protocol.outboundBuffer.p2leadd(local36);
            Protocol.outboundBuffer.p2leadd(local15 + Static225.originX);
            Protocol.outboundBuffer.p2le(Static15.anInt506);
        }
        if (local23 == 12) {
            Protocol.outboundBuffer.p1isaac(82);
            Protocol.outboundBuffer.p2(Static15.anInt506);
            Protocol.outboundBuffer.p4rme(local19);
            Protocol.outboundBuffer.p4(Static98.anInt2512);
            Protocol.outboundBuffer.p2leadd(local15);
        }
        if (local23 == 36) {
            if (local36 == 0) {
                Static187.anInt4422 = 1;
                Static113.method3556(Player.level, local15, local19);
            } else if (LoginManager.staffModLevel > 0 && Keyboard.pressedKeys[Keyboard.KEY_CTRL] && Keyboard.pressedKeys[Keyboard.KEY_SHIFT]) {
                Cheat.teleport(local15 + Static225.originX, Static142.originZ - -local19, Player.level);
            } else {
                Protocol.outboundBuffer.p1isaac(179);
                Protocol.outboundBuffer.p2(local19 + Static142.originZ);
                Protocol.outboundBuffer.p2(local15 + Static225.originX);
            }
        }
        if (local23 == 6) {
            local43 = PlayerList.players[local36];
            if (local43 != null) {
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
                Cross.y = Mouse.clickY;
                Cross.milliseconds = 0;
                Cross.type = 2;
                Cross.x = Mouse.clickX;
                Protocol.outboundBuffer.p1isaac(106);
                Protocol.outboundBuffer.p2(local36);
            }
        }
        if (local23 == 20) {
            if (client.game == 1) {
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
            } else {
                local560 = Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, PlayerList.self.movementQueueX[0]);
                if (!local560) {
                    Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
                }
            }
            Cross.y = Mouse.clickY;
            Cross.milliseconds = 0;
            Cross.x = Mouse.clickX;
            Cross.type = 2;
            Protocol.outboundBuffer.p1isaac(33);
            Protocol.outboundBuffer.p2(local36);
            Protocol.outboundBuffer.p2(Static225.originX + local15);
            Protocol.outboundBuffer.p2le(Static142.originZ + local19);
        }
        if (local23 == 16) {
            local192 = NpcList.npcs[local36];
            if (local192 != null) {
                Static102.method2075(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
                Cross.x = Mouse.clickX;
                Cross.milliseconds = 0;
                Cross.y = Mouse.clickY;
                Cross.type = 2;
                Protocol.outboundBuffer.p1isaac(3);
                Protocol.outboundBuffer.p2leadd(local36);
            }
        }
        if (Static260.anInt5014 != 0) {
            Static260.anInt5014 = 0;
            InterfaceList.redraw(InterfaceList.getComponent(Static224.anInt5062));
        }
        if (Static241.aBoolean302) {
            Static53.method1294();
        }
        if (Static257.aClass13_7 != null && Static72.anInt2043 == 0) {
            InterfaceList.redraw(Static257.aClass13_7);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(JI)V")
    public static void method1691(@OriginalArg(0) long name) {
        Protocol.outboundBuffer.offset = 0;
        Protocol.outboundBuffer.p1(186);
        if (GlobalConfig.LOGIN_USE_STRINGS) {
            Protocol.outboundBuffer.pjstr(Base37.decode37(name));
        } else {
            Protocol.outboundBuffer.p8(name);
        }
        CreateManager.step = 1;
        CreateManager.loops = 0;
        CreateManager.errors = 0;
        CreateManager.reply = -3;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
    public static void rebuildMap() {
        ping(false);
        Static175.mapFilesMissingCount = 0;
        @Pc(12) boolean fileExists = true;
        @Pc(14) int id;
        for (id = 0; id < Static273.mapFilesBuffer.length; id++) {
            if (Static36.mapFileIds[id] != -1 && Static273.mapFilesBuffer[id] == null) {
                Static273.mapFilesBuffer[id] = client.js5Archive5.getFile(Static36.mapFileIds[id], 0);
                if (Static273.mapFilesBuffer[id] == null) {
                    Static175.mapFilesMissingCount++;
                    fileExists = false;
                }
            }
            if (Static172.locationsMapFileIds[id] != -1 && Static156.locationMapFilesBuffer[id] == null) {
                Static156.locationMapFilesBuffer[id] = client.js5Archive5.getFileXTEA(Static172.locationsMapFileIds[id], Static72.regionsXteaKeys[id], 0);
                if (Static156.locationMapFilesBuffer[id] == null) {
                    fileExists = false;
                    Static175.mapFilesMissingCount++;
                }
            }

            if (GlRenderer.enabled) {
                if (Static99.underWaterMapFileIds[id] != -1 && Static186.underWaterMapFilesBuffer[id] == null) {
                    Static186.underWaterMapFilesBuffer[id] = client.js5Archive5.getFile(Static99.underWaterMapFileIds[id], 0);
                    if (Static186.underWaterMapFilesBuffer[id] == null) {
                        fileExists = false;
                        Static175.mapFilesMissingCount++;
                    }
                }
                if (Static35.underWaterLocationsMapFileIds[id] != -1 && Static19.underWaterLocationsMapFilesBuffer[id] == null) {
                    Static19.underWaterLocationsMapFilesBuffer[id] = client.js5Archive5.getFile(Static35.underWaterLocationsMapFileIds[id], 0);
                    if (Static19.underWaterLocationsMapFilesBuffer[id] == null) {
                        Static175.mapFilesMissingCount++;
                        fileExists = false;
                    }
                }
            }

            if (Static175.npcSpawnsFileIds != null && Static191.npcSpawnsFilesBuffer[id] == null && Static175.npcSpawnsFileIds[id] != -1) {
                Static191.npcSpawnsFilesBuffer[id] = client.js5Archive5.getFileXTEA(Static175.npcSpawnsFileIds[id], Static72.regionsXteaKeys[id], 0);
                if (Static191.npcSpawnsFilesBuffer[id] == null) {
                    Static175.mapFilesMissingCount++;
                    fileExists = false;
                }
            }
        }

        if (Static235.mapElementList == null) {
            if (Static158.aClass3_Sub2_Sub4_3 == null || !client.js5Archive23.isGroupNameValid(JagString.concatenate(new JagString[] { Static158.aClass3_Sub2_Sub4_3.group, Static50.aClass100_363 }))) {
                Static235.mapElementList = new MapElementList(0);
            } else if (client.js5Archive23.allFilesComplete(JagString.concatenate(new JagString[] { Static158.aClass3_Sub2_Sub4_3.group, Static50.aClass100_363 }))) {
                Static235.mapElementList = MapElementList.create(JagString.concatenate(new JagString[] { Static158.aClass3_Sub2_Sub4_3.group, Static50.aClass100_363 }), client.js5Archive23);
            } else {
                fileExists = false;
                Static175.mapFilesMissingCount++;
            }
        }

        if (!fileExists) {
            Static233.loadingScreenState = 1;
            return;
        }

        Static271.anInt5804 = 0;
        fileExists = true;
        @Pc(320) int chunkX;
        @Pc(309) int chunkZ;
        for (id = 0; id < Static273.mapFilesBuffer.length; id++) {
            @Pc(294) byte[] local294 = Static156.locationMapFilesBuffer[id];
            if (local294 != null) {
                chunkZ = (Static238.regionBitPacked[id] & 0xFF) * 64 - Static142.originZ;
                chunkX = (Static238.regionBitPacked[id] >> 8) * 64 - Static225.originX;
                if (Static230.dynamicMapRegion) {
                    chunkZ = 10;
                    chunkX = 10;
                }
                fileExists &= Static49.method1201(chunkX, chunkZ, local294);
            }
            if (GlRenderer.enabled) {
                local294 = Static19.underWaterLocationsMapFilesBuffer[id];
                if (local294 != null) {
                    chunkX = (Static238.regionBitPacked[id] >> 8) * 64 - Static225.originX;
                    chunkZ = (Static238.regionBitPacked[id] & 0xFF) * 64 - Static142.originZ;
                    if (Static230.dynamicMapRegion) {
                        chunkZ = 10;
                        chunkX = 10;
                    }
                    fileExists &= Static49.method1201(chunkX, chunkZ, local294);
                }
            }
        }
        if (!fileExists) {
            Static233.loadingScreenState = 2;
            return;
        }

        if (Static233.loadingScreenState != 0) {
            Static114.drawTextOnScreen(true, JagString.concatenate(new JagString[] { LocalizedText.LOADING, Static18.COMPLETE_PERCENT}));
        }

        client.audioLoop();
        client.method3768();
        @Pc(420) boolean hasUnderWaterMap = false;
        @Pc(427) int i;
        if (GlRenderer.enabled && Preferences.highWaterDetail) {
            for (i = 0; i < Static273.mapFilesBuffer.length; i++) {
                if (Static19.underWaterLocationsMapFilesBuffer[i] != null || Static186.underWaterMapFilesBuffer[i] != null) {
                    hasUnderWaterMap = true;
                    break;
                }
            }
        }
        Static28.method792(GlRenderer.enabled ? GlobalConfig.TILE_DISTANCE : 25, hasUnderWaterMap);
        for (i = 0; i < 4; i++) {
            PathFinder.collisionMaps[i].resetFlags();
        }
        for (i = 0; i < 4; i++) {
            for (chunkX = 0; chunkX < 104; chunkX++) {
                for (chunkZ = 0; chunkZ < 104; chunkZ++) {
                    SceneGraph.tileFlags[i][chunkX][chunkZ] = 0;
                }
            }
        }
        AreaSoundManager.clear(false);
        if (GlRenderer.enabled) {
            Static242.shadowMapImage.method1392();
            for (i = 0; i < 13; i++) {
                for (chunkX = 0; chunkX < 13; chunkX++) {
                    Static242.shadows[i][chunkX].outputToSprite = true;
                }
            }
        }
        if (GlRenderer.enabled) {
            Static120.method2404();
        }
        if (GlRenderer.enabled) {
            Static75.setDefaultChunksAtmosphere();
        }
        client.audioLoop();
        System.gc();
        ping(true);
        Static196.method3535(false);
        if (!Static230.dynamicMapRegion) {
            Static87.method1805(false);
            ping(true);
            if (GlRenderer.enabled) {
                i = PlayerList.self.movementQueueX[0] >> 3;
                chunkX = PlayerList.self.movementQueueZ[0] >> 3;
                Static73.setLightPosition(chunkX, i);
            }
            Static26.method743(false);
            if (Static191.npcSpawnsFilesBuffer != null) {
                Static158.decodeNpcFiles();
            }
        }
        if (Static230.dynamicMapRegion) {
            Static89.method1835(false);
            ping(true);
            if (GlRenderer.enabled) {
                i = PlayerList.self.movementQueueX[0] >> 3;
                chunkX = PlayerList.self.movementQueueZ[0] >> 3;
                Static73.setLightPosition(chunkX, i);
            }
            Static233.method4002(false);
        }
        client.method3768();
        ping(true);
        Static45.method1169(PathFinder.collisionMaps, false);
        if (GlRenderer.enabled) {
            Static120.method2395();
        }
        ping(true);
        i = Static146.anInt3508;
        if (i > Player.level) {
            i = Player.level;
        }
        if (i < Player.level - 1) {
        }
        if (SceneGraph.allLevelsAreVisible()) {
            Static146.method2750(0);
        } else {
            Static146.method2750(Static146.anInt3508);
        }
        Static105.method2255();
        if (GlRenderer.enabled && hasUnderWaterMap) {
            Static278.setRenderTiles(true);
            Static196.method3535(true);
            if (!Static230.dynamicMapRegion) {
                Static87.method1805(true);
                ping(true);
                Static26.method743(true);
            }
            if (Static230.dynamicMapRegion) {
                Static89.method1835(true);
                ping(true);
                Static233.method4002(true);
            }
            client.method3768();
            ping(true);
            Static45.method1169(PathFinder.collisionMaps, true);
            ping(true);
            Static105.method2255();
            Static278.setRenderTiles(false);
        }
        if (GlRenderer.enabled) {
            for (chunkX = 0; chunkX < 13; chunkX++) {
                for (chunkZ = 0; chunkZ < 13; chunkZ++) {
                    Static242.shadows[chunkX][chunkZ].method4676(SceneGraph.tileHeights[0], chunkX * 8, chunkZ * 8);
                }
            }
        }
        for (chunkX = 0; chunkX < 104; chunkX++) {
            for (chunkZ = 0; chunkZ < 104; chunkZ++) {
                Static220.spawnGroundObject(chunkZ, chunkX);
            }
        }
        Static269.method2218();
        client.audioLoop();
        Static219.method3796();
        client.method3768();
        Static231.aBoolean252 = false;
        if (GameShell.frame != null && Protocol.socket != null && client.gameState == 25) {
            Protocol.outboundBuffer.p1isaac(20);
            Protocol.outboundBuffer.p4(1057001181);
        }
        if (!Static230.dynamicMapRegion) {
            @Pc(815) int local815 = (Static52.anInt1695 + 6) / 8;
            @Pc(821) int local821 = (Static52.anInt1695 - 6) / 8;
            chunkX = (Static80.centralZoneX - 6) / 8;
            chunkZ = (Static80.centralZoneX + 6) / 8;
            for (@Pc(837) int local837 = chunkX - 1; local837 <= chunkZ + 1; local837++) {
                for (@Pc(850) int local850 = local821 - 1; local850 <= local815 + 1; local850++) {
                    if (local837 < chunkX || local837 > chunkZ || local850 < local821 || local850 > local815) {
                        client.js5Archive5.method4486(JagString.concatenate(new JagString[] { Static103.aClass100_558, Static123.parseInt(local837), Static86.aClass100_488, Static123.parseInt(local850) }));
                        client.js5Archive5.method4486(JagString.concatenate(new JagString[] { Static270.aClass100_1090, Static123.parseInt(local837), Static86.aClass100_488, Static123.parseInt(local850) }));
                    }
                }
            }
        }
        if (client.gameState == 28) {
            client.setGameState(10);
        } else {
            client.setGameState(30);
            if (Protocol.socket != null) {
                Protocol.outboundBuffer.p1isaac(110);
            }
        }
        Static141.method2720();
        client.audioLoop();
        GameShell.resetTimer();
    }

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "(I)V")
    public static void method1373() {
        Protocol.outboundBuffer.p1isaac(243);
        Protocol.outboundBuffer.p1(Static144.getWindowMode());
        Protocol.outboundBuffer.p2(GameShell.canvasWidth);
        Protocol.outboundBuffer.p2(GameShell.canvasHeight);
        Protocol.outboundBuffer.p1(Preferences.antiAliasingMode);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BZ)V")
	public static void ping(@OriginalArg(1) boolean arg0) {
		client.audioLoop();
		if (client.gameState != 30 && client.gameState != 25) {
			return;
		}
		Static131.anInt3251++;
		if (Static131.anInt3251 < 50 && !arg0) {
			return;
		}
		Static131.anInt3251 = 0;
		if (!LoginManager.aBoolean247 && Protocol.socket != null) {
			Protocol.outboundBuffer.p1isaac(93);
			try {
				Protocol.socket.write(Protocol.outboundBuffer.data, Protocol.outboundBuffer.offset);
				Protocol.outboundBuffer.offset = 0;
			} catch (@Pc(53) IOException local53) {
				LoginManager.aBoolean247 = true;
			}
		}
		client.audioLoop();
	}

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public static void method28() {
        InterfaceList.redraw(Static105.aClass13_14);
        Static213.anInt4851++;
        if (Static44.aBoolean83 && Static146.aBoolean174) {
            @Pc(30) int local30 = Mouse.anInt4873;
            local30 -= Static246.anInt5388;
            if (Static81.anInt2225 > local30) {
                local30 = Static81.anInt2225;
            }
            @Pc(41) int local41 = Mouse.anInt5032;
            if (Static81.anInt2225 + Static4.aClass13_1.anInt445 < local30 - -Static105.aClass13_14.anInt445) {
                local30 = Static81.anInt2225 + Static4.aClass13_1.anInt445 - Static105.aClass13_14.anInt445;
            }
            local41 -= Static165.anInt4035;
            if (local41 < Static228.anInt5103) {
                local41 = Static228.anInt5103;
            }
            if (Static228.anInt5103 + Static4.aClass13_1.anInt459 < local41 - -Static105.aClass13_14.anInt459) {
                local41 = Static228.anInt5103 + Static4.aClass13_1.anInt459 - Static105.aClass13_14.anInt459;
            }
            @Pc(109) int local109 = local41 - Static20.anInt660;
            @Pc(114) int local114 = local30 - Static124.anInt3075;
            @Pc(122) int local122 = local30 + Static4.aClass13_1.anInt489 - Static81.anInt2225;
            @Pc(130) int local130 = Static4.aClass13_1.scrollY + local41 - Static228.anInt5103;
            @Pc(133) int local133 = Static105.aClass13_14.anInt472;
            if (Static213.anInt4851 > Static105.aClass13_14.anInt447 && (local133 < local114 || -local133 > local114 || local109 > local133 || local109 < -local133)) {
                Static138.aBoolean172 = true;
            }
            @Pc(176) HookRequest local176;
            if (Static105.aClass13_14.anObjectArray26 != null && Static138.aBoolean172) {
                local176 = new HookRequest();
                local176.source = Static105.aClass13_14;
                local176.arguments = Static105.aClass13_14.anObjectArray26;
                local176.mouseX = local122;
                local176.mouseY = local130;
                ScriptRunner.run(local176);
            }
            if (Mouse.pressedButton == 0) {
                if (Static138.aBoolean172) {
                    if (Static105.aClass13_14.anObjectArray16 != null) {
                        local176 = new HookRequest();
                        local176.mouseY = local130;
                        local176.target = Static56.aClass13_12;
                        local176.mouseX = local122;
                        local176.arguments = Static105.aClass13_14.anObjectArray16;
                        local176.source = Static105.aClass13_14;
                        ScriptRunner.run(local176);
                    }
                    if (Static56.aClass13_12 != null && Static36.method938(Static105.aClass13_14) != null) {
                        Protocol.outboundBuffer.p1isaac(79);
                        Protocol.outboundBuffer.p4me(Static105.aClass13_14.id);
                        Protocol.outboundBuffer.p2le(Static56.aClass13_12.createdComponentId);
                        Protocol.outboundBuffer.p4(Static56.aClass13_12.id);
                        Protocol.outboundBuffer.p2le(Static105.aClass13_14.createdComponentId);
                    }
                } else if ((Static116.anInt2952 == 1 || Static277.method4640(Static231.anInt5204 - 1)) && Static231.anInt5204 > 2) {
                    Static226.method3901();
                } else if (Static231.anInt5204 > 0) {
                    Static59.method1372();
                }
                Static105.aClass13_14 = null;
            }
        } else if (Static213.anInt4851 > 1) {
            Static105.aClass13_14 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZI)V")
    public static void method10(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
        Protocol.outboundBuffer.p1isaac(132);
        Protocol.outboundBuffer.p4rme(arg1);
        Protocol.outboundBuffer.p2le(arg0);
    }
}
