package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;
import java.net.Socket;

public class WorldList {
	@OriginalMember(owner = "client!nd", name = "x", descriptor = "Lclient!na;")
	public static final JagString aClass100_783 = JagString.parse(")4p=");
	@OriginalMember(owner = "client!ja", name = "s", descriptor = "Lclient!na;")
	public static final JagString HTTP_PROTOCOL = JagString.parse("http:)4)4");
	@OriginalMember(owner = "client!wk", name = "x", descriptor = "Lclient!na;")
	public static final JagString aClass100_1107 = JagString.parse(")4l=");
	@OriginalMember(owner = "client!rc", name = "G", descriptor = "Lclient!na;")
	public static final JagString aClass100_230 = JagString.parse("");
	@OriginalMember(owner = "client!ob", name = "o", descriptor = "Lclient!na;")
	public static final JagString aClass100_801 = JagString.parse(")4a=");
	@OriginalMember(owner = "client!l", name = "d", descriptor = "Lclient!na;")
	public static final JagString aClass100_659 = JagString.parse(")4j");
	@OriginalMember(owner = "client!cg", name = "e", descriptor = "Lclient!na;")
	public static final JagString aClass100_184 = JagString.parse("1");
	@OriginalMember(owner = "client!vd", name = "F", descriptor = "Lclient!na;")
	public static final JagString aClass100_945 = JagString.parse("0");
	@OriginalMember(owner = "client!em", name = "u", descriptor = "Lclient!na;")
	public static final JagString aClass100_420 = JagString.parse(")1o");
	@OriginalMember(owner = "client!q", name = "a", descriptor = "Lclient!na;")
	public static final JagString aClass100_260 = JagString.parse(")1a2)1m");
	@OriginalMember(owner = "client!ch", name = "x", descriptor = "Lclient!na;")
	public static final JagString aClass100_193 = JagString.parse(":");
	@OriginalMember(owner = "client!ii", name = "e", descriptor = "Lclient!na;")
	public static final JagString aClass100_570 = JagString.parse(")2");
	@OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
	public static int step = 0;
	@OriginalMember(owner = "client!be", name = "kc", descriptor = "J")
	public static long openTime = 0L;
	@OriginalMember(owner = "client!sk", name = "gb", descriptor = "J")
	public static long closeTime = 0L;
	@OriginalMember(owner = "client!en", name = "A", descriptor = "Z")
	public static boolean loaded = false;
	@OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
	public static int bufferLen = 0;
	@OriginalMember(owner = "client!si", name = "cb", descriptor = "[B")
	public static byte[] buffer;
	@OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
	public static int bufferOff = 0;
	@OriginalMember(owner = "client!hm", name = "fb", descriptor = "[Lclient!ba;")
	public static World[] sorted = new World[0];
	@OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
	public static int size;
	@OriginalMember(owner = "client!gf", name = "T", descriptor = "I")
	public static int checksum;
	@OriginalMember(owner = "client!qh", name = "e", descriptor = "[Lclient!ee;")
	public static WorldInfo[] countries;
	@OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
	public static int minId;
	@OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
	public static int maxId;
	@OriginalMember(owner = "client!pl", name = "a", descriptor = "[Lclient!ba;")
	public static World[] worlds;
	@OriginalMember(owner = "client!k", name = "t", descriptor = "I")
	public static int errors = 0;
	@OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
	public static int worldPos = 1;

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)I")
	public static int fetch() {
		try {
			if (step == 0) {
				if (MonotonicClock.currentTimeMillis() - 5000L < closeTime) {
					return 0;
				}
				if (GlobalJsonConfig.instance != null) {
					client.worldListHostname = GlobalJsonConfig.instance.ip_management;
					client.worldListPort = GlobalJsonConfig.instance.wl_port;
				}
				Protocol.socketRequest = GameShell.signLink.openSocket(client.worldListHostname, client.worldListPort);
				openTime = MonotonicClock.currentTimeMillis();
				step = 1;
			}
			if (openTime + 30000L < MonotonicClock.currentTimeMillis()) {
				return close(1000);
			}
			@Pc(82) int local82;
			@Pc(124) int local124;
			if (step == 1) {
				if (Protocol.socketRequest.status == 2) {
					return close(1001);
				}
				if (Protocol.socketRequest.status != 1) {
					return -1;
				}
				Protocol.socket = new BufferedSocket((Socket) Protocol.socketRequest.result, GameShell.signLink);
				Protocol.outboundBuffer.offset = 0;
				Protocol.socketRequest = null;
				local82 = 0;
				if (loaded) {
					local82 = checksum;
				}
				Protocol.outboundBuffer.p1(255);
				Protocol.outboundBuffer.p4(local82);
				Protocol.socket.write(Protocol.outboundBuffer.data, Protocol.outboundBuffer.offset);
				if (client.musicChannel != null) {
					client.musicChannel.method3571();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method3571();
				}
				local124 = Protocol.socket.read();
				if (client.musicChannel != null) {
					client.musicChannel.method3571();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method3571();
				}
				if (local124 != 0) {
					return close(local124);
				}
				step = 2;
			}
			if (step == 2) {
				if (Protocol.socket.available() < 2) {
					return -1;
				}
				bufferLen = Protocol.socket.read();
				bufferLen <<= 0x8;
				bufferLen += Protocol.socket.read();
				step = 3;
				bufferOff = 0;
				buffer = new byte[bufferLen];
			}
			if (step != 3) {
				return -1;
			}
			local82 = Protocol.socket.available();
			if (local82 < 1) {
				return -1;
			}
			if (local82 > bufferLen - bufferOff) {
				local82 = bufferLen - bufferOff;
			}
			Protocol.socket.read(bufferOff, local82, buffer);
			bufferOff += local82;
			if (bufferOff < bufferLen) {
				return -1;
			} else if (decode(buffer)) {
				sorted = new World[size];
				local124 = 0;
				for (@Pc(240) int local240 = minId; local240 <= maxId; local240++) {
					@Pc(247) World local247 = ScriptRunner.getWorld(local240);
					if (local247 != null) {
						sorted[local124++] = local247;
					}
				}
				Protocol.socket.close();
				Protocol.socket = null;
				errors = 0;
				step = 0;
				buffer = null;
				closeTime = MonotonicClock.currentTimeMillis();
				return 0;
			} else {
				return close(1002);
			}
		} catch (@Pc(277) IOException local277) {
			return close(1003);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BI)I")
	public static int close(@OriginalArg(1) int arg0) {
		if (Protocol.socket != null) {
			Protocol.socket.close();
			Protocol.socket = null;
		}
		errors++;
		if (errors > 4) {
			step = 0;
			errors = 0;
			return arg0;
		}
		step = 0;
		if (client.worldListPort == client.worldListDefaultPort) {
			client.worldListPort = client.worldListAlternatePort;
		} else {
			client.worldListPort = client.worldListDefaultPort;
		}
		return -1;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!wa;I)V")
	public static void decodeWorlds(@OriginalArg(0) Buffer buffer) {
		@Pc(9) int countryCount = buffer.gsmarts();
		countries = new WorldInfo[countryCount];
		@Pc(14) int i;
		for (i = 0; i < countryCount; i++) {
			countries[i] = new WorldInfo();
			countries[i].flag = buffer.gsmarts();
			countries[i].name = buffer.gjstr2();
		}
		minId = buffer.gsmarts();
		maxId = buffer.gsmarts();
		size = buffer.gsmarts();
		worlds = new World[maxId + 1 - minId];
		for (i = 0; i < size; i++) {
			@Pc(77) int offset = buffer.gsmarts();
			@Pc(85) World world = worlds[offset] = new World();
			world.country = buffer.g1();
			world.flags = buffer.g4();
			world.id = offset + minId;
			world.activity = buffer.gjstr2();
			world.hostname = buffer.gjstr2();
		}
		checksum = buffer.g4();
		loaded = true;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I[B)Z")
	public static boolean decode(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Buffer local13 = new Buffer(arg0);
		@Pc(17) int local17 = local13.g1();
		if (local17 != 1) {
			return false;
		}
		@Pc(33) boolean local33 = local13.g1() == 1;
		if (local33) {
			decodeWorlds(local13);
		}
		decodePlayers(local13);
		return true;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!wa;I)V")
	public static void decodePlayers(@OriginalArg(0) Buffer arg0) {
		for (@Pc(7) int local7 = 0; local7 < size; local7++) {
			@Pc(18) int local18 = arg0.gsmarts();
			@Pc(22) int local22 = arg0.g2();
			if (local22 == 65535) {
				local22 = -1;
			}
			if (worlds[local18] != null) {
				worlds[local18].players = local22;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)Lclient!ba;")
	public static World getNextWorld() {
		return sorted.length > worldPos ? sorted[worldPos++] : null;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZBIZ)V")
	public static void sortWorldList(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		method1697(arg0, arg2, sorted.length - 1, arg3, 0, arg1);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIZIZZ)V")
	public static void method1697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg2 <= arg4) {
			return;
		}
		@Pc(13) int local13 = (arg2 + arg4) / 2;
		@Pc(15) int local15 = arg4;
		@Pc(19) World local19 = sorted[local13];
		sorted[local13] = sorted[arg2];
		sorted[arg2] = local19;
		for (@Pc(31) int local31 = arg4; local31 < arg2; local31++) {
			if (method3115(local19, sorted[local31], arg0, arg1, arg3, arg5) <= 0) {
				@Pc(53) World local53 = sorted[local31];
				sorted[local31] = sorted[local15];
				sorted[local15++] = local53;
			}
		}
		sorted[arg2] = sorted[local15];
		sorted[local15] = local19;
		method1697(arg0, arg1, local15 - 1, arg3, arg4, arg5);
		method1697(arg0, arg1, arg2, arg3, local15 + 1, arg5);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)Lclient!ba;")
	public static World getFirstWorld() {
		worldPos = 0;
		return getNextWorld();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB)Z")
	public static boolean hopWorld(@OriginalArg(0) int arg0) {
		@Pc(3) World local3 = ScriptRunner.getWorld(arg0);
		if (local3 == null) {
			return false;
		} else if (SignLink.anInt5928 == 1 || SignLink.anInt5928 == 2 || client.modeWhere == 2) {
			@Pc(31) byte[] local31 = local3.hostname.method3148();
			client.hostname = new String(local31, 0, local31.length);
			Player.worldId = local3.id;
			if (client.modeWhere != 0) {
				client.defaultPort = Player.worldId + 43594; // 40000;
				client.port = client.defaultPort;
				client.alternatePort = Player.worldId + 43594; // 50000;
			}
			return true;
		} else {
			@Pc(62) JagString local62 = aClass100_230;
			if (client.modeWhere != 0) {
				local62 = JagString.concatenate(new JagString[]{aClass100_193, JagString.parseInt(local3.id + 7000)});
			}
			@Pc(89) JagString local89 = aClass100_230;
			if (client.settings != null) {
				local89 = JagString.concatenate(new JagString[]{aClass100_783, client.settings});
			}
			@Pc(182) JagString local182 = JagString.concatenate(new JagString[]{HTTP_PROTOCOL, local3.hostname, local62, aClass100_1107, JagString.parseInt(client.language), aClass100_801, JagString.parseInt(client.affiliate), local89, aClass100_659, client.objectTag ? aClass100_184 : aClass100_945, aClass100_420, client.javaScript ? aClass100_184 : aClass100_945, aClass100_260, client.advertSuppressed ? aClass100_184 : aClass100_945});
			try {
				client.instance.getAppletContext().showDocument(local182.method3107(), "_self");
				return true;
			} catch (@Pc(191) Exception local191) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!ba;Lclient!ba;IIIZZ)I")
	public static int method3115(@OriginalArg(0) World arg0, @OriginalArg(1) World arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = method4595(arg1, arg3, arg0, arg5);
		if (local8 != 0) {
			return arg5 ? -local8 : local8;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(42) int local42 = method4595(arg1, arg2, arg0, arg4);
			return arg4 ? -local42 : local42;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ba;IILclient!ba;Z)I")
	public static int method4595(@OriginalArg(0) World arg0, @OriginalArg(1) int arg1, @OriginalArg(3) World arg2, @OriginalArg(4) boolean arg3) {
		if (arg1 == 1) {
			@Pc(11) int local11 = arg0.players;
			@Pc(14) int local14 = arg2.players;
			if (!arg3) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local11 == -1) {
					local11 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg1 == 2) {
			return arg0.getWorldInfo().name.compare(arg2.getWorldInfo().name);
		} else if (arg1 == 3) {
			if (arg0.activity.strEquals(aClass100_570)) {
				if (arg2.activity.strEquals(aClass100_570)) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.activity.strEquals(aClass100_570)) {
				return arg3 ? 1 : -1;
			} else {
				return arg0.activity.compare(arg2.activity);
			}
		} else if (arg1 == 4) {
			return arg0.isLootShare() ? (arg2.isLootShare() ? 0 : 1) : arg2.isLootShare() ? -1 : 0;
		} else if (arg1 == 5) {
			return arg0.isQuickChat() ? (arg2.isQuickChat() ? 0 : 1) : (arg2.isQuickChat() ? -1 : 0);
		} else if (arg1 == 6) {
			return arg0.isPvp() ? (arg2.isPvp() ? 0 : 1) : (arg2.isPvp() ? -1 : 0);
		} else if (arg1 == 7) {
			return arg0.isMembers() ? (arg2.isMembers() ? 0 : 1) : (arg2.isMembers() ? -1 : 0);
		} else {
			return arg0.id - arg2.id;
		}
	}
}
