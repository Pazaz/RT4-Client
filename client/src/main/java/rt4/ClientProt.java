package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;

public class ClientProt {

	public static final int CLIENT_CHEAT = 44;
	public static final int CLAN_JOINCHAT_LEAVECHAT = 104;
	public static final int CLAN_KICKUSER = 162; // or CLANCHANNEL_KICKUSER
	public static final int FRIENDLIST_ADD = 120;
	public static final int FRIENDLIST_DEL = 57;
	public static final int FRIEND_SETRANK = 188;
	public static final int IGNORELIST_ADD = 34;
	public static final int IGNORELIST_DEL = 213;
	public static final int WINDOW_STATUS = 243; // assumed
	public static final int TRANSMITVAR_VERIFYID = 177;
	public static final int EVENT_MOUSE_MOVE = 123;
	public static final int EVENT_MOUSE_CLICK = 75;
	public static final int EVENT_CAMERA_POSITION = 21;
	public static final int EVENT_APPLET_FOCUS = 22;
	public static final int RESUME_P_COUNTDIALOG = 23;
	public static final int RESUME_P_NAMEDIALOG = 244;
	public static final int RESUME_P_STRINGDIALOG = 65;
	public static final int SET_CHATFILTERSETTINGS = 157;
	public static final int BUG_REPORT = 99;
	public static final int SOUND_SONGEND = 137;
	public static final int MOVE_GAMECLICK = 215;
	public static final int MOVE_MINIMAPCLICK = 39;
	public static final int CLOSE_MODAL = 184;
	public static final int NO_TIMEOUT = 93; // assumed

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
			Protocol.outboundBuffer.p1isaac(ClientProt.MOVE_GAMECLICK);
			Protocol.outboundBuffer.p1(local13 + local13 + 3);
		}
		if (arg1 == 1) {
			Protocol.outboundBuffer.p1isaac(ClientProt.MOVE_MINIMAPCLICK);
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
		Protocol.outboundBuffer.p1isaac(ClientProt.CLOSE_MODAL);
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
	public static void sendWindowDetails() {
		Protocol.outboundBuffer.p1isaac(ClientProt.WINDOW_STATUS);
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
			Protocol.outboundBuffer.p1isaac(ClientProt.NO_TIMEOUT);
			try {
				Protocol.socket.write(Protocol.outboundBuffer.data, Protocol.outboundBuffer.offset);
				Protocol.outboundBuffer.offset = 0;
			} catch (@Pc(53) IOException local53) {
				LoginManager.aBoolean247 = true;
			}
		}
		client.audioLoop();
	}

}
