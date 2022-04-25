import java.io.IOException;
import java.net.Socket;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
	public static int anInt987;

	@OriginalMember(owner = "client!ch", name = "v", descriptor = "[B")
	public static final byte[] aByteArray12 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!ch", name = "x", descriptor = "Lclient!na;")
	public static final JagString aClass100_193 = Static28.parse(":");

	@OriginalMember(owner = "client!ch", name = "z", descriptor = "[I")
	public static final int[] anIntArray76 = new int[5];

	@OriginalMember(owner = "client!ch", name = "C", descriptor = "[[I")
	public static final int[][] anIntArrayArray6 = new int[104][104];

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
	public static void method846() {
		if (!SceneGraph.allLevelsAreVisible() && Static41.anInt1316 != Static55.level) {
			Static127.method2463(Static55.level, Static52.anInt1695, Static80.anInt4701, PlayerList.self.movementQueueZ[0], false, PlayerList.self.movementQueueX[0]);
		} else if (Static55.level != Static107.anInt2875 && Static137.method2665(Static55.level)) {
			Static107.anInt2875 = Static55.level;
			Static269.method2218();
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V")
	public static void loopAuto() {
		if (Static219.anInt4937 == 0) {
			return;
		}
		try {
			if (++Static20.anInt673 > 1500) {
				if (Protocol.socket != null) {
					Protocol.socket.close();
					Protocol.socket = null;
				}
				if (Static196.anInt4587 >= 1) {
					Static266.reply = -5;
					Static219.anInt4937 = 0;
					return;
				}
				Static20.anInt673 = 0;
				Static196.anInt4587++;
				Static219.anInt4937 = 1;
				if (Static208.worldListPort == Static249.worldListDefaultPort) {
					Static208.worldListPort = Static97.worldListAlternatePort;
				} else {
					Static208.worldListPort = Static249.worldListDefaultPort;
				}
			}
			if (Static219.anInt4937 == 1) {
				Static72.aClass212_3 = GameShell.signLink.openSocket(Static143.worldListHostname, Static208.worldListPort);
				Static219.anInt4937 = 2;
			}
			@Pc(126) int local126;
			if (Static219.anInt4937 == 2) {
				if (Static72.aClass212_3.status == 2) {
					throw new IOException();
				}
				if (Static72.aClass212_3.status != 1) {
					return;
				}
				Protocol.socket = new BufferedSocket((Socket) Static72.aClass212_3.result, GameShell.signLink);
				Static72.aClass212_3 = null;
				Protocol.socket.write(Static6.outboundBuffer.data, Static6.outboundBuffer.offset);
				if (client.musicChannel != null) {
					client.musicChannel.method3571();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method3571();
				}
				local126 = Protocol.socket.read();
				if (client.musicChannel != null) {
					client.musicChannel.method3571();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method3571();
				}
				if (local126 != 101) {
					Static266.reply = local126;
					Static219.anInt4937 = 0;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				}
				Static219.anInt4937 = 3;
			}
			if (Static219.anInt4937 == 3) {
				if (Protocol.socket.available() < 2) {
					return;
				}
				local126 = Protocol.socket.read() << 8 | Protocol.socket.read();
				Static176.hopWorld(local126);
				if (Static125.worldId == -1) {
					Static219.anInt4937 = 0;
					Static266.reply = 6;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				}
				Static219.anInt4937 = 0;
				Protocol.socket.close();
				Protocol.socket = null;
				Static49.method1208();
				return;
			}
		} catch (@Pc(210) IOException local210) {
			if (Protocol.socket != null) {
				Protocol.socket.close();
				Protocol.socket = null;
			}
			if (Static196.anInt4587 < 1) {
				if (Static208.worldListPort == Static249.worldListDefaultPort) {
					Static208.worldListPort = Static97.worldListAlternatePort;
				} else {
					Static208.worldListPort = Static249.worldListDefaultPort;
				}
				Static219.anInt4937 = 1;
				Static20.anInt673 = 0;
				Static196.anInt4587++;
			} else {
				Static266.reply = -4;
				Static219.anInt4937 = 0;
			}
		}
	}
}
