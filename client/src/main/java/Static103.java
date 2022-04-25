import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!i", name = "Ub", descriptor = "[Lclient!na;")
	public static JagString[] aClass100Array88;

	@OriginalMember(owner = "client!i", name = "ec", descriptor = "[I")
	public static int[] anIntArray254;

	@OriginalMember(owner = "client!i", name = "ic", descriptor = "Lclient!na;")
	public static final JagString aClass100_558 = JagString.parse("m");

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
			Static153.method2909();
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
			Static2.method10(local15, local19);
			Static39.aClass13_10 = Static201.method1418(local19, local15);
			Static43.redraw(Static39.aClass13_10);
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
			Static263.method4512(Static233.aClass100Array160[arg0], local15, local36, local19);
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
				if (local693.aBoolean32) {
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
				if (Static7.varps[local1955] != local693.anIntArray48[0]) {
					Static7.varps[local1955] = local693.anIntArray48[0];
					Static85.method1775(local1955);
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
				Static7.varps[local1955] = 1 - Static7.varps[local1955];
				Static85.method1775(local1955);
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
			Static43.redraw(local693);
			Static34.aClass100_203 = JagString.concatenate(new JagString[] { Static8.aClass100_32, ObjTypeList.get(local36).name, Static204.aClass100_896 });
			if (Static34.aClass100_203 == null) {
				Static34.aClass100_203 = Static92.aClass100_510;
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
			Static43.redraw(InterfaceList.getComponent(Static224.anInt5062));
		}
		if (Static241.aBoolean302) {
			Static53.method1294();
		}
		if (Static257.aClass13_7 != null && Static72.anInt2043 == 0) {
			Static43.redraw(Static257.aClass13_7);
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(IIIII)I")
	public static int method2235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static222.instantScreenFade) {
			arg0 = 1000000;
			Static222.instantScreenFade = false;
		}
		@Pc(15) Environment local15 = Static192.aClass92ArrayArray1[arg3][arg1];
		@Pc(25) float local25 = ((float) arg2 * 0.1F + 0.7F) * local15.aFloat16;
		@Pc(28) float local28 = local15.aFloat18;
		@Pc(31) int local31 = local15.anInt3526;
		@Pc(34) int local34 = local15.anInt3529;
		@Pc(37) int local37 = local15.anInt3525;
		if (!Preferences.fogEnabled) {
			local34 = 0;
		}
		@Pc(44) float local44 = local15.aFloat17;
		if (local31 != Static109.anInt2883 || Static126.aFloat13 != local25 || Static8.aFloat1 != local28 || local44 != Static15.aFloat4 || Static166.anInt4044 != local37 || Static226.anInt5080 != local34) {
			Static126.aFloat13 = local25;
			Static253.aFloat37 = Static253.aFloat36;
			Static59.aFloat6 = Static61.aFloat7;
			Static109.anInt2883 = local31;
			Static264.anInt4623 = Static154.anInt3709;
			Static171.anInt4153 = Static79.anInt2161;
			Static15.aFloat4 = local44;
			Static3.anInt5868 = 0;
			Static131.anInt3255 = Static261.anInt5731;
			Static226.anInt5080 = local34;
			Static8.aFloat1 = local28;
			Static166.anInt4044 = local37;
			Static185.aFloat23 = Static23.aFloat5;
		}
		if (Static3.anInt5868 < 65536) {
			Static3.anInt5868 += arg0 * 250;
			if (Static3.anInt5868 >= 65536) {
				Static3.anInt5868 = 65536;
			}
			@Pc(114) float local114 = (float) Static3.anInt5868 / 65536.0F;
			@Pc(118) int local118 = Static3.anInt5868 >> 8;
			@Pc(125) int local125 = 65536 - Static3.anInt5868 >> 8;
			Static154.anInt3709 = (local118 * (Static166.anInt4044 & 0xFF00FF) + (Static264.anInt4623 & 0xFF00FF) * local125 & 0xFF00FF00) + (local125 * (Static264.anInt4623 & 0xFF00) + (Static166.anInt4044 & 0xFF00) * local118 & 0xFF0000) >> 8;
			@Pc(162) float local162 = (float) (65536 - Static3.anInt5868) / 65536.0F;
			Static61.aFloat7 = local162 * Static59.aFloat6 + local114 * Static126.aFloat13;
			Static253.aFloat36 = Static253.aFloat37 * local162 + local114 * Static8.aFloat1;
			Static23.aFloat5 = local114 * Static15.aFloat4 + local162 * Static185.aFloat23;
			Static261.anInt5731 = ((Static109.anInt2883 & 0xFF00) * local118 + local125 * (Static131.anInt3255 & 0xFF00) & 0xFF0000) + ((Static131.anInt3255 & 0xFF00FF) * local125 + ((Static109.anInt2883 & 0xFF00FF) * local118) & 0xFF00FF00) >> 8;
			Static79.anInt2161 = local118 * Static226.anInt5080 + local125 * Static171.anInt4153 >> 8;
		}
		Static161.method3060(Static261.anInt5731, Static61.aFloat7, Static253.aFloat36, Static23.aFloat5);
		Static161.method3062(Static154.anInt3709, Static79.anInt2161);
		Static161.method3063((float) Static85.anInt2263, (float) Static159.anInt3893, (float) Static148.anInt3534);
		Static161.method3058();
		return Static154.anInt3709;
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(BI)I")
	public static int method2236(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

}
