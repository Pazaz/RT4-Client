package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;

public class ClientProt {
	@OriginalMember(owner = "client!e", name = "Dc", descriptor = "Lclient!na;")
	public static final JagString aClass100_363 = JagString.parse("_labels");
	@OriginalMember(owner = "client!bh", name = "C", descriptor = "Lclient!na;")
	public static final JagString COMPLETE_PERCENT = JagString.parse("<br>(X100(U(Y");
	@OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
	public static int anInt5804 = 0;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!na;IIBI)V")
	public static void method4512(@OriginalArg(0) JagString arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Component local8 = InterfaceList.method1418(arg3, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.onOptionClick != null) {
			@Pc(19) HookRequest local19 = new HookRequest();
			local19.arguments = local8.onOptionClick;
			local19.source = local8;
			local19.opBase = arg0;
			local19.op = arg2;
			ScriptRunner.run(local19);
		}
		@Pc(37) boolean local37 = true;
		if (local8.clientCode > 0) {
			local37 = MiniMenu.method4265(local8);
		}
		if (!local37 || !InterfaceList.getServerActiveProperties(local8).isButtonEnabled(arg2 - 1)) {
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
		@Pc(23) int local23 = PathFinder.queueX[arg0];
		@Pc(27) int local27 = PathFinder.queueZ[arg0];
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
		Protocol.outboundBuffer.p1add(Keyboard.pressedKeys[Keyboard.KEY_CTRL] ? 1 : 0);
		Protocol.outboundBuffer.p2(Camera.originX + local23);
		Protocol.outboundBuffer.p2add(Camera.originZ + local27);
		LoginManager.mapFlagZ = PathFinder.queueZ[0];
		LoginManager.mapFlagX = PathFinder.queueX[0];
		for (@Pc(126) int local126 = 1; local126 < local13; local126++) {
			arg0--;
			Protocol.outboundBuffer.p1add(PathFinder.queueX[arg0] - local23);
			Protocol.outboundBuffer.p1sub(PathFinder.queueZ[arg0] - local27);
		}
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(B)V")
	public static void closeWidget() {
		Protocol.outboundBuffer.p1isaac(184);
		for (@Pc(18) ComponentPointer local18 = (ComponentPointer) InterfaceList.openInterfaces.head(); local18 != null; local18 = (ComponentPointer) InterfaceList.openInterfaces.next()) {
			if (local18.anInt5879 == 0) {
				InterfaceList.closeInterface(true, local18);
			}
		}
		if (Cs1ScriptRunner.aClass13_10 != null) {
			InterfaceList.redraw(Cs1ScriptRunner.aClass13_10);
			Cs1ScriptRunner.aClass13_10 = null;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILclient!na;)V")
	public static void clickPlayerOption(@OriginalArg(0) int arg0, @OriginalArg(2) JagString arg1) {
		@Pc(7) JagString local7 = arg1.method3159().toTitleCase();
		@Pc(13) boolean local13 = false;
		for (@Pc(15) int local15 = 0; local15 < PlayerList.size; local15++) {
			@Pc(28) Player local28 = PlayerList.players[PlayerList.ids[local15]];
			if (local28 != null && local28.username != null && local28.username.equalsIgnoreCase(local7)) {
				local13 = true;
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local28.movementQueueX[0], 1, 0, 2, local28.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
				if (arg0 == 1) {
					Protocol.outboundBuffer.p1isaac(68);
					Protocol.outboundBuffer.ip2add(PlayerList.ids[local15]);
				} else if (arg0 == 4) {
					Protocol.outboundBuffer.p1isaac(180);
					Protocol.outboundBuffer.ip2add(PlayerList.ids[local15]);
				} else if (arg0 == 5) {
					Protocol.outboundBuffer.p1isaac(4);
					Protocol.outboundBuffer.ip2(PlayerList.ids[local15]);
				} else if (arg0 == 6) {
					Protocol.outboundBuffer.p1isaac(133);
					Protocol.outboundBuffer.ip2(PlayerList.ids[local15]);
				} else if (arg0 == 7) {
					Protocol.outboundBuffer.p1isaac(114);
					Protocol.outboundBuffer.ip2add(PlayerList.ids[local15]);
				}
				break;
			}
		}
		if (!local13) {
			Chat.add(JagString.EMPTY, 0, JagString.concatenate(new JagString[]{LocalizedText.UNABLETOFIND, local7}));
		}
	}

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "(I)V")
	public static void method1373() {
		Protocol.outboundBuffer.p1isaac(243);
		Protocol.outboundBuffer.p1(DisplayMode.getWindowMode());
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
		Protocol.anInt3251++;
		if (Protocol.anInt3251 < 50 && !arg0) {
			return;
		}
		Protocol.anInt3251 = 0;
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
		InterfaceList.redraw(Cs1ScriptRunner.aClass13_14);
		Cs1ScriptRunner.anInt4851++;
		if (InterfaceList.aBoolean83 && InterfaceList.aBoolean174) {
			@Pc(30) int local30 = Mouse.lastMouseX;
			local30 -= Cs1ScriptRunner.anInt5388;
			if (Cs1ScriptRunner.anInt2225 > local30) {
				local30 = Cs1ScriptRunner.anInt2225;
			}
			@Pc(41) int local41 = Mouse.lastMouseY;
			if (Cs1ScriptRunner.anInt2225 + Cs1ScriptRunner.aClass13_1.width < local30 - -Cs1ScriptRunner.aClass13_14.width) {
				local30 = Cs1ScriptRunner.anInt2225 + Cs1ScriptRunner.aClass13_1.width - Cs1ScriptRunner.aClass13_14.width;
			}
			local41 -= Cs1ScriptRunner.anInt4035;
			if (local41 < InterfaceList.anInt5103) {
				local41 = InterfaceList.anInt5103;
			}
			if (InterfaceList.anInt5103 + Cs1ScriptRunner.aClass13_1.height < local41 - -Cs1ScriptRunner.aClass13_14.height) {
				local41 = InterfaceList.anInt5103 + Cs1ScriptRunner.aClass13_1.height - Cs1ScriptRunner.aClass13_14.height;
			}
			@Pc(109) int local109 = local41 - InterfaceList.anInt660;
			@Pc(114) int local114 = local30 - InterfaceList.anInt3075;
			@Pc(122) int local122 = local30 + Cs1ScriptRunner.aClass13_1.scrollX - Cs1ScriptRunner.anInt2225;
			@Pc(130) int local130 = Cs1ScriptRunner.aClass13_1.scrollY + local41 - InterfaceList.anInt5103;
			@Pc(133) int local133 = Cs1ScriptRunner.aClass13_14.dragDeadzone;
			if (Cs1ScriptRunner.anInt4851 > Cs1ScriptRunner.aClass13_14.dragDeadtime && (local133 < local114 || -local133 > local114 || local109 > local133 || local109 < -local133)) {
				Cs1ScriptRunner.aBoolean172 = true;
			}
			@Pc(176) HookRequest local176;
			if (Cs1ScriptRunner.aClass13_14.onDragStart != null && Cs1ScriptRunner.aBoolean172) {
				local176 = new HookRequest();
				local176.source = Cs1ScriptRunner.aClass13_14;
				local176.arguments = Cs1ScriptRunner.aClass13_14.onDragStart;
				local176.mouseX = local122;
				local176.mouseY = local130;
				ScriptRunner.run(local176);
			}
			if (Mouse.pressedButton == 0) {
				if (Cs1ScriptRunner.aBoolean172) {
					if (Cs1ScriptRunner.aClass13_14.onDragRelease != null) {
						local176 = new HookRequest();
						local176.mouseY = local130;
						local176.target = InterfaceList.aClass13_12;
						local176.mouseX = local122;
						local176.arguments = Cs1ScriptRunner.aClass13_14.onDragRelease;
						local176.source = Cs1ScriptRunner.aClass13_14;
						ScriptRunner.run(local176);
					}
					if (InterfaceList.aClass13_12 != null && InterfaceList.method938(Cs1ScriptRunner.aClass13_14) != null) {
						Protocol.outboundBuffer.p1isaac(79);
						Protocol.outboundBuffer.mp4(Cs1ScriptRunner.aClass13_14.id);
						Protocol.outboundBuffer.ip2(InterfaceList.aClass13_12.createdComponentId);
						Protocol.outboundBuffer.p4(InterfaceList.aClass13_12.id);
						Protocol.outboundBuffer.ip2(Cs1ScriptRunner.aClass13_14.createdComponentId);
					}
				} else if ((VarpDomain.anInt2952 == 1 || MiniMenu.method4640(MiniMenu.size - 1)) && MiniMenu.size > 2) {
					ScriptRunner.method3901();
				} else if (MiniMenu.size > 0) {
					MiniMenu.method1372();
				}
				Cs1ScriptRunner.aClass13_14 = null;
			}
		} else if (Cs1ScriptRunner.anInt4851 > 1) {
			Cs1ScriptRunner.aClass13_14 = null;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZI)V")
	public static void method10(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Protocol.outboundBuffer.p1isaac(132);
		Protocol.outboundBuffer.imp4(arg1);
		Protocol.outboundBuffer.ip2(arg0);
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	public static void setDefaultChunksAtmosphere() {
		@Pc(9) Environment local9 = new Environment();
		for (@Pc(18) int local18 = 0; local18 < 13; local18++) {
			for (@Pc(25) int local25 = 0; local25 < 13; local25++) {
				FogManager.chunksAtmosphere[local18][local25] = local9;
			}
		}
	}
}
