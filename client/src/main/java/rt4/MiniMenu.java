package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class MiniMenu {
    @OriginalMember(owner = "client!df", name = "l", descriptor = "Lclient!na;")
    public static final JagString COLOR_GREEN = JagString.parse("<col=00ff00>");
    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Lclient!na;")
	public static final JagString aClass100_947 = JagString.parse(" )2> <col=ff9040>");
    @OriginalMember(owner = "client!uj", name = "C", descriptor = "[Lclient!na;")
    public static final JagString[] ops = new JagString[500];
    @OriginalMember(owner = "client!t", name = "v", descriptor = "[Lclient!na;")
    public static final JagString[] opBases = new JagString[500];
    @OriginalMember(owner = "client!d", name = "eb", descriptor = "[S")
    public static final short[] actions = new short[500];
    @OriginalMember(owner = "client!pf", name = "r", descriptor = "[I")
    public static final int[] cursors = new int[500];
    @OriginalMember(owner = "client!mi", name = "U", descriptor = "[J")
	public static final long[] keys = new long[500];
    @OriginalMember(owner = "client!pl", name = "e", descriptor = "[I")
	public static final int[] intArgs1 = new int[500];
    @OriginalMember(owner = "client!ef", name = "c", descriptor = "[I")
    public static final int[] intArgs2 = new int[500];
    @OriginalMember(owner = "client!nm", name = "bb", descriptor = "Lclient!na;")
    public static final JagString aClass100_798 = JagString.parse("<col=ff0000>");
    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Lclient!na;")
	public static final JagString aClass100_433 = JagString.parse("<col=ff3000>");
    @OriginalMember(owner = "client!sc", name = "D", descriptor = "Lclient!na;")
    public static final JagString aClass100_951 = JagString.parse("<col=ff7000>");
    @OriginalMember(owner = "client!si", name = "Z", descriptor = "Lclient!na;")
    public static final JagString aClass100_972 = JagString.parse("<col=ffb000>");
    @OriginalMember(owner = "client!ag", name = "bb", descriptor = "Lclient!na;")
    public static final JagString aClass100_18 = JagString.parse("<col=40ff00>");
    @OriginalMember(owner = "client!dc", name = "v", descriptor = "Lclient!na;")
	public static final JagString aClass100_266 = JagString.parse("<col=c0ff00>");
    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Lclient!na;")
    public static final JagString aClass100_965 = JagString.parse("<col=ffff00>");
    @OriginalMember(owner = "client!vg", name = "f", descriptor = "Lclient!na;")
    public static final JagString aClass100_1081 = JagString.parse("<col=80ff00>");
    @OriginalMember(owner = "client!ck", name = "D", descriptor = "Lclient!na;")
	public static JagString aClass100_203 = null;
    @OriginalMember(owner = "client!hn", name = "W", descriptor = "Lclient!na;")
    public static JagString aClass100_545 = null;
    @OriginalMember(owner = "client!sk", name = "kb", descriptor = "I")
	public static int size = 0;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZILclient!be;)V")
    public static void addComponentEntries(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component component) {
        if (component.anInt530 == 1) {
            add(-1, 0L, JagString.EMPTY, 0, (short) 8, component.aClass100_89, component.id);
        }
        @Pc(47) JagString local47;
        if (component.anInt530 == 2 && !Static241.aBoolean302) {
            local47 = Static97.getTargetVerb(component);
            if (local47 != null) {
                add(-1, 0L, JagString.concatenate(new JagString[] {COLOR_GREEN, component.aClass100_85 }), -1, (short) 32, local47, component.id);
            }
        }
        if (component.anInt530 == 3) {
            add(-1, 0L, JagString.EMPTY, 0, (short) 28, LocalizedText.CLOSE, component.id);
        }
        if (component.anInt530 == 4) {
            add(-1, 0L, JagString.EMPTY, 0, (short) 59, component.aClass100_89, component.id);
        }
        if (component.anInt530 == 5) {
            add(-1, 0L, JagString.EMPTY, 0, (short) 51, component.aClass100_89, component.id);
        }
        if (component.anInt530 == 6 && Static39.aClass13_10 == null) {
            add(-1, 0L, JagString.EMPTY, -1, (short) 41, component.aClass100_89, component.id);
        }
        @Pc(173) int local173;
        @Pc(171) int local171;
        if (component.type == 2) {
            local171 = 0;
            for (local173 = 0; local173 < component.baseHeight; local173++) {
                for (@Pc(183) int local183 = 0; local183 < component.baseWidth; local183++) {
                    @Pc(195) int local195 = (component.anInt512 + 32) * local183;
                    @Pc(202) int local202 = (component.anInt516 + 32) * local173;
                    if (local171 < 20) {
                        local202 += component.anIntArray47[local171];
                        local195 += component.anIntArray41[local171];
                    }
                    if (arg1 >= local195 && local202 <= arg0 && local195 + 32 > arg1 && local202 + 32 > arg0) {
                        Static169.aClass13_18 = component;
                        Static18.anInt588 = local171;
                        if (component.objTypes[local171] > 0) {
                            @Pc(267) ServerActiveProperties local267 = InterfaceList.getServerActiveProperties(component);
                            @Pc(276) ObjType local276 = ObjTypeList.get(component.objTypes[local171] - 1);
                            if (Static260.anInt5014 == 1 && local267.isObjOpsEnabled()) {
                                if (Static224.anInt5062 != component.id || Static185.anInt4370 != local171) {
                                    add(-1, (long) local276.anInt2354, JagString.concatenate(new JagString[] { aClass100_203, aClass100_947, local276.name}), local171, (short) 40, LocalizedText.USE, component.id);
                                }
                            } else if (Static241.aBoolean302 && local267.isObjOpsEnabled()) {
                                @Pc(596) ParamType local596 = Static121.anInt3039 == -1 ? null : ParamTypeList.get(Static121.anInt3039);
                                if ((Static274.anInt4999 & 0x10) != 0 && (local596 == null || local276.getParam(local596.defaultInt, Static121.anInt3039) != local596.defaultInt)) {
                                    add(Static246.anInt5393, (long) local276.anInt2354, JagString.concatenate(new JagString[] { Static78.aClass100_466, aClass100_947, local276.name}), local171, (short) 3, aClass100_545, component.id);
                                }
                            } else {
                                @Pc(296) JagString[] local296 = local276.inventoryOps;
                                if (Static208.aBoolean237) {
                                    local296 = Static279.method4664(local296);
                                }
                                @Pc(309) int local309;
                                @Pc(334) byte local334;
                                if (local267.isObjOpsEnabled()) {
                                    for (local309 = 4; local309 >= 3; local309--) {
                                        if (local296 != null && local296[local309] != null) {
                                            if (local309 == 3) {
                                                local334 = 35;
                                            } else {
                                                local334 = 58;
                                            }
                                            add(-1, (long) local276.anInt2354, JagString.concatenate(new JagString[] { Static8.aClass100_32, local276.name}), local171, local334, local296[local309], component.id);
                                        }
                                    }
                                }
                                if (local267.method507()) {
                                    add(Static169.anInt4075, (long) local276.anInt2354, JagString.concatenate(new JagString[] { Static8.aClass100_32, local276.name}), local171, (short) 22, LocalizedText.USE, component.id);
                                }
                                if (local267.isObjOpsEnabled() && local296 != null) {
                                    for (local309 = 2; local309 >= 0; local309--) {
                                        if (local296[local309] != null) {
                                            local334 = 0;
                                            if (local309 == 0) {
                                                local334 = 47;
                                            }
                                            if (local309 == 1) {
                                                local334 = 5;
                                            }
                                            if (local309 == 2) {
                                                local334 = 43;
                                            }
                                            add(-1, (long) local276.anInt2354, JagString.concatenate(new JagString[] { Static8.aClass100_32, local276.name}), local171, local334, local296[local309], component.id);
                                        }
                                    }
                                }
                                local296 = component.aClass100Array19;
                                if (Static208.aBoolean237) {
                                    local296 = Static279.method4664(local296);
                                }
                                if (local296 != null) {
                                    for (local309 = 4; local309 >= 0; local309--) {
                                        if (local296[local309] != null) {
                                            local334 = 0;
                                            if (local309 == 0) {
                                                local334 = 25;
                                            }
                                            if (local309 == 1) {
                                                local334 = 23;
                                            }
                                            if (local309 == 2) {
                                                local334 = 48;
                                            }
                                            if (local309 == 3) {
                                                local334 = 7;
                                            }
                                            if (local309 == 4) {
                                                local334 = 13;
                                            }
                                            add(-1, (long) local276.anInt2354, JagString.concatenate(new JagString[] { Static8.aClass100_32, local276.name}), local171, local334, local296[local309], component.id);
                                        }
                                    }
                                }
                                add(Static225.anInt5073, (long) local276.anInt2354, JagString.concatenate(new JagString[] { Static8.aClass100_32, local276.name}), local171, (short) 1006, LocalizedText.EXAMINE, component.id);
                            }
                        }
                    }
                    local171++;
                }
            }
        }
        if (!component.usingScripts) {
            return;
        }
        if (!Static241.aBoolean302) {
            for (local171 = 9; local171 >= 5; local171--) {
                @Pc(765) JagString local765 = InterfaceList.getOp(component, local171);
                if (local765 != null) {
                    add(Static8.getOpCursor(local171, component), (long) (local171 + 1), component.opBase, component.createdComponentId, (short) 1003, local765, component.id);
                }
            }
            local47 = Static97.getTargetVerb(component);
            if (local47 != null) {
                add(-1, 0L, component.opBase, component.createdComponentId, (short) 32, local47, component.id);
            }
            for (local173 = 4; local173 >= 0; local173--) {
                @Pc(828) JagString local828 = InterfaceList.getOp(component, local173);
                if (local828 != null) {
                    add(Static8.getOpCursor(local173, component), (long) (local173 + 1), component.opBase, component.createdComponentId, (short) 9, local828, component.id);
                }
            }
            if (InterfaceList.getServerActiveProperties(component).method506()) {
                add(-1, 0L, JagString.EMPTY, component.createdComponentId, (short) 41, LocalizedText.CONTINUE, component.id);
            }
        } else if (InterfaceList.getServerActiveProperties(component).method508() && (Static274.anInt4999 & 0x20) != 0) {
            add(Static246.anInt5393, 0L, JagString.concatenate(new JagString[] { Static78.aClass100_466, Static201.aClass100_408, component.opBase}), component.createdComponentId, (short) 12, aClass100_545, component.id);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IJBLclient!na;ISLclient!na;I)V")
    public static void add(@OriginalArg(0) int cursor, @OriginalArg(1) long arg1, @OriginalArg(3) JagString arg2, @OriginalArg(4) int arg3, @OriginalArg(5) short arg4, @OriginalArg(6) JagString arg5, @OriginalArg(7) int arg6) {
        if (Static60.aBoolean108 || size >= 500) {
            return;
        }
        ops[size] = arg5;
        opBases[size] = arg2;
        cursors[size] = cursor == -1 ? Static35.anInt1092 : cursor;
        actions[size] = arg4;
        keys[size] = arg1;
        intArgs1[size] = arg3;
        intArgs2[size] = arg6;
        size++;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
    public static void sort() {
        @Pc(3) boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (@Pc(13) int i = 0; i < size - 1; i++) {
                if (actions[i] < 1000 && actions[i + 1] > 1000) {
                    @Pc(41) JagString local41 = opBases[i];
                    sorted = false;
                    opBases[i] = opBases[i + 1];
                    opBases[i + 1] = local41;
                    @Pc(61) JagString local61 = ops[i];
                    ops[i] = ops[i + 1];
                    ops[i + 1] = local61;
                    @Pc(79) int local79 = intArgs1[i];
                    intArgs1[i] = intArgs1[i + 1];
                    intArgs1[i + 1] = local79;
                    @Pc(97) int local97 = intArgs2[i];
                    intArgs2[i] = intArgs2[i + 1];
                    intArgs2[i + 1] = local97;
                    @Pc(115) int local115 = cursors[i];
                    cursors[i] = cursors[i + 1];
                    cursors[i + 1] = local115;
                    @Pc(133) short local133 = actions[i];
                    actions[i] = actions[i + 1];
                    actions[i + 1] = local133;
                    @Pc(151) long local151 = keys[i];
                    keys[i] = keys[i + 1];
                    keys[i + 1] = local151;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)V")
	public static void remove(@OriginalArg(1) int i) {
		size--;
		if (size == i) {
			return;
		}
		ArrayUtils.copy(ops, i + 1, ops, i, size - i);
		ArrayUtils.copy(opBases, i + 1, opBases, i, size - i);
		ArrayUtils.copy(cursors, i + 1, cursors, i, size - i);
		ArrayUtils.copy(actions, i + 1, actions, i, size - i);
		ArrayUtils.copy(keys, i + 1, keys, i, size - i);
		ArrayUtils.copy(intArgs1, i + 1, intArgs1, i, size - i);
		ArrayUtils.copy(intArgs2, i + 1, intArgs2, i, size - i);
	}

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)Lclient!na;")
    public static JagString getOp(@OriginalArg(0) int i) {
        return opBases[i].length() > 0 ? JagString.concatenate(new JagString[] { ops[i], LocalizedText.MINISEPARATOR, opBases[i] }) : ops[i];
    }

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(II)V")
    public static void doAction(@OriginalArg(1) int arg0) {
        if (arg0 < 0) {
            return;
        }
        @Pc(15) int local15 = intArgs1[arg0];
        @Pc(19) int local19 = intArgs2[arg0];
        @Pc(23) int local23 = actions[arg0];
        if (local23 >= 2000) {
            local23 -= 2000;
        }
        @Pc(31) long local31 = keys[arg0];
        @Pc(36) int local36 = (int) keys[arg0];
        @Pc(43) Player local43;
        if (local23 == 31) {
            local43 = PlayerList.players[local36];
            if (local43 != null) {
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
                Cross.type = 2;
                Cross.milliseconds = 0;
                Cross.x = Mouse.clickX;
                Cross.y = Mouse.clickY;
                Protocol.outboundBuffer.p1isaac(71);
                Protocol.outboundBuffer.p2leadd(local36);
            }
        }
        if (local23 == 46) {
            PathFinder.findPathToLoc(local31, local19, local15);
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
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
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
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
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
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
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
            PathFinder.findPathToLoc(local31, local19, local15);
            Protocol.outboundBuffer.p1isaac(254);
            Protocol.outboundBuffer.p2le(local15 + Static225.originX);
            Protocol.outboundBuffer.p2add((int) (local31 >>> 32) & Integer.MAX_VALUE);
            Protocol.outboundBuffer.p2(local19 + Static142.originZ);
        }
        if (local23 == 28) {
            ClientProt.method2909();
        }
        if (local23 == 45) {
            local192 = NpcList.npcs[local36];
            if (local192 != null) {
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
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
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
            } else {
                local560 = PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, PlayerList.self.movementQueueX[0]);
                if (!local560) {
                    PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
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
            PathFinder.findPathToLoc(local31, local19, local15);
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
                } else if (PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 0, true, 0, local15, 0, 0, 1, local19, PlayerList.self.movementQueueX[0])) {
                    Protocol.outboundBuffer.p1(Static1.anInt5);
                    Protocol.outboundBuffer.p1(Static107.anInt2878);
                    Protocol.outboundBuffer.p2((int)Camera.yawTarget);
                    Protocol.outboundBuffer.p1(57);
                    Protocol.outboundBuffer.p1(Static59.anInt1814);
                    Protocol.outboundBuffer.p1(Static273.anInt4130);
                    Protocol.outboundBuffer.p1(89);
                    Protocol.outboundBuffer.p2(PlayerList.self.xFine);
                    Protocol.outboundBuffer.p2(PlayerList.self.zFine);
                    Protocol.outboundBuffer.p1(PathFinder.anInt4364);
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
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
                Cross.type = 2;
                Cross.y = Mouse.clickY;
                Cross.x = Mouse.clickX;
                Cross.milliseconds = 0;
                Protocol.outboundBuffer.p1isaac(4);
                Protocol.outboundBuffer.p2le(local36);
            }
        }
        if (local23 == 41 && Static39.aClass13_10 == null) {
            ClientProt.method10(local15, local19);
            Static39.aClass13_10 = Static201.method1418(local19, local15);
            InterfaceList.redraw(Static39.aClass13_10);
        }
        if (local23 == 49) {
            PathFinder.findPathToLoc(local31, local19, local15);
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
        if (local23 == 14 && PathFinder.findPathToLoc(local31, local19, local15)) {
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
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
                Cross.milliseconds = 0;
                Cross.type = 2;
                Cross.y = Mouse.clickY;
                Cross.x = Mouse.clickX;
                Protocol.outboundBuffer.p1isaac(114);
                Protocol.outboundBuffer.p2leadd(local36);
            }
        }
        if (local23 == 9 || local23 == 1003) {
            ClientProt.method4512(opBases[arg0], local15, local36, local19);
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
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
            } else {
                local560 = PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, PlayerList.self.movementQueueX[0]);
                if (!local560) {
                    PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
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
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
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
                aClass100_545 = Static97.getTargetVerb(local693);
                if (aClass100_545 == null) {
                    aClass100_545 = Static250.aClass100_1042;
                }
                if (local693.usingScripts) {
                    Static78.aClass100_466 = JagString.concatenate(new JagString[] { local693.opBase, Static204.aClass100_896 });
                } else {
                    Static78.aClass100_466 = JagString.concatenate(new JagString[] {COLOR_GREEN, local693.aClass100_85, Static204.aClass100_896 });
                }
            }
            return;
        }
        if (local23 == 29) {
            local43 = PlayerList.players[local36];
            if (local43 != null) {
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
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
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
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
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
            } else {
                local560 = PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, PlayerList.self.movementQueueX[0]);
                if (!local560) {
                    PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
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
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
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
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
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
            local560 = PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, PlayerList.self.movementQueueX[0]);
            if (!local560) {
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
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
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
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
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
            } else {
                local560 = PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, PlayerList.self.movementQueueX[0]);
                if (!local560) {
                    PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
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
        if (local23 == 38 && PathFinder.findPathToLoc(local31, local19, local15)) {
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
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
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
            aClass100_203 = JagString.concatenate(new JagString[] { Static8.aClass100_32, ObjTypeList.get(local36).name, Static204.aClass100_896 });
            if (aClass100_203 == null) {
                aClass100_203 = Static92.NULL;
            }
            return;
        }
        if (local23 == 50) {
            PathFinder.findPathToLoc(local31, local19, local15);
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
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
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
            local560 = PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, PlayerList.self.movementQueueX[0]);
            if (!local560) {
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
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
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
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
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
            } else {
                local560 = PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, PlayerList.self.movementQueueX[0]);
                if (!local560) {
                    PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
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
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
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

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBI)Lclient!na;")
    public static JagString getCombatLevelColor(@OriginalArg(0) int otherLevel, @OriginalArg(2) int selfLevel) {
        @Pc(4) int delta = selfLevel - otherLevel;
        if (delta < -9) {
            return aClass100_798;
        } else if (delta < -6) {
            return aClass100_433;
        } else if (delta < -3) {
            return aClass100_951;
        } else if (delta < 0) {
            return aClass100_972;
        } else if (delta > 9) {
            return COLOR_GREEN;
        } else if (delta > 6) {
            return aClass100_18;
        } else if (delta <= 3) {
            return delta > 0 ? aClass100_266 : aClass100_965;
        } else {
            return aClass100_1081;
        }
    }
}
