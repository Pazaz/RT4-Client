package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;
import java.net.Socket;

public class LoginManager {
	@OriginalMember(owner = "client!bg", name = "g", descriptor = "Lclient!i;")
	public static final Packet buffer = new Packet(5000);
	@OriginalMember(owner = "client!nd", name = "r", descriptor = "Lclient!na;")
	public static final JagString ZAP = JagString.parse("zap");
	@OriginalMember(owner = "client!ef", name = "h", descriptor = "Lclient!na;")
	public static final JagString UNZAP = JagString.parse("unzap");
	@OriginalMember(owner = "client!wj", name = "f", descriptor = "Lclient!na;")
	public static final JagString aClass100_1103 = JagString.parse("ul");
	@OriginalMember(owner = "client!i", name = "ic", descriptor = "Lclient!na;")
	public static final JagString aClass100_558 = JagString.parse("m");
	@OriginalMember(owner = "client!wb", name = "e", descriptor = "Lclient!na;")
	public static final JagString aClass100_1090 = JagString.parse("l");
	@OriginalMember(owner = "client!oe", name = "o", descriptor = "Lclient!na;")
	public static final JagString aClass100_807 = JagString.parse("n");
	@OriginalMember(owner = "client!nb", name = "a", descriptor = "Lclient!na;")
	public static final JagString aClass100_772 = JagString.parse("um");
	@OriginalMember(owner = "client!gm", name = "W", descriptor = "Lclient!na;")
	public static final JagString UNDERSCORE = JagString.parse("_");
	@OriginalMember(owner = "client!gd", name = "h", descriptor = "[I")
	public static final int[] anIntArray204 = new int[]{16, 32, 64, 128};
	@OriginalMember(owner = "client!rj", name = "Z", descriptor = "[I")
	public static final int[] anIntArray434 = new int[64];
	@OriginalMember(owner = "client!rl", name = "X", descriptor = "I")
	public static int anInt4937 = 0;
	@OriginalMember(owner = "client!sd", name = "X", descriptor = "Z")
	public static boolean aBoolean247 = false;
	@OriginalMember(owner = "client!sk", name = "ib", descriptor = "I")
	public static int hopTime = 0;
	@OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
	public static int reply = -2;
	@OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
	public static int loops = 0;
	@OriginalMember(owner = "client!ol", name = "V", descriptor = "I")
	public static int step = 0;
	@OriginalMember(owner = "client!qi", name = "A", descriptor = "I")
	public static int disallowResult = -1;
	@OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
	public static int errors = 0;
	@OriginalMember(owner = "client!bj", name = "Y", descriptor = "I")
	public static int anInt673 = 0;
	@OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
	public static int anInt4587 = 0;
	@OriginalMember(owner = "client!pi", name = "P", descriptor = "J")
	public static long serverKey = 0L;
	@OriginalMember(owner = "client!af", name = "c", descriptor = "I")
	public static int anInt39 = -1;
	@OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
	public static int staffModLevel = 0;
	@OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
	public static int blackmarks = 0;
	@OriginalMember(owner = "client!jk", name = "G", descriptor = "Z")
	public static boolean playerUnderage = false;
	@OriginalMember(owner = "client!ql", name = "c", descriptor = "Z")
	public static boolean parentalChatConsent = false;
	@OriginalMember(owner = "client!qg", name = "W", descriptor = "Z")
	public static boolean playerMember = false;
	@OriginalMember(owner = "client!aa", name = "l", descriptor = "Z")
	public static boolean mapMembers = false;
	@OriginalMember(owner = "client!gm", name = "bb", descriptor = "Z")
	public static boolean mapQuickChat = false;
	@OriginalMember(owner = "client!c", name = "hb", descriptor = "Z")
	public static boolean parentalAdvertConsent = false;
	@OriginalMember(owner = "client!we", name = "H", descriptor = "[[B")
	public static byte[][] mapFilesBuffer;
	@OriginalMember(owner = "client!mf", name = "O", descriptor = "[[B")
	public static byte[][] locationMapFilesBuffer;
	@OriginalMember(owner = "client!cl", name = "V", descriptor = "[I")
	public static int[] underWaterLocationsMapFileIds;
	@OriginalMember(owner = "client!pg", name = "jb", descriptor = "[[B")
	public static byte[][] npcSpawnsFilesBuffer;
	@OriginalMember(owner = "client!client", name = "lb", descriptor = "[I")
	public static int[] mapFileIds;
	@OriginalMember(owner = "client!pa", name = "L", descriptor = "[[B")
	public static byte[][] underWaterMapFilesBuffer;
	@OriginalMember(owner = "client!fl", name = "D", descriptor = "[[I")
	public static int[][] regionsXteaKeys;
	@OriginalMember(owner = "client!te", name = "H", descriptor = "[I")
	public static int[] regionBitPacked;
	@OriginalMember(owner = "client!nm", name = "P", descriptor = "[I")
	public static int[] npcSpawnsFileIds;
	@OriginalMember(owner = "client!hk", name = "bb", descriptor = "[I")
	public static int[] underWaterMapFileIds;
	@OriginalMember(owner = "client!nj", name = "j", descriptor = "[I")
	public static int[] locationsMapFileIds;
	@OriginalMember(owner = "client!bi", name = "Y", descriptor = "[[B")
	public static byte[][] underWaterLocationsMapFilesBuffer;
	@OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
	public static int centralZoneX;
	@OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
	public static int centralZoneZ;
	@OriginalMember(owner = "client!dc", name = "ab", descriptor = "I")
	public static int centralPlane = 0;
	@OriginalMember(owner = "client!mh", name = "hb", descriptor = "Lclient!bn;")
	public static Map map;
	@OriginalMember(owner = "client!tb", name = "X", descriptor = "Lclient!se;")
	public static MapElementList mapElementList;
	@OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
	public static int mapFlagX = 0;
	@OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
	public static int mapFlagZ = 0;
	@OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
	public static int anInt1862 = 0;
	@OriginalMember(owner = "client!sj", name = "u", descriptor = "Z")
	public static boolean dynamicMapRegion = false;
	@OriginalMember(owner = "client!nm", name = "U", descriptor = "I")
	public static int mapFilesMissingCount = 0;
	@OriginalMember(owner = "client!t", name = "y", descriptor = "I")
	public static int loadingScreenState = 0;
	@OriginalMember(owner = "client!sk", name = "lb", descriptor = "Z")
	public static boolean aBoolean252 = false;
	@OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
	public static int anInt3811 = 0;
	@OriginalMember(owner = "client!mf", name = "X", descriptor = "I")
	public static int loginScreenId;
	@OriginalMember(owner = "client!hd", name = "e", descriptor = "Lclient!qf;")
	public static Sprite aClass3_Sub2_Sub1_6;
	@OriginalMember(owner = "client!d", name = "ib", descriptor = "Lclient!qf;")
	public static Sprite aClass3_Sub2_Sub1_1;
	@OriginalMember(owner = "client!oi", name = "h", descriptor = "Lclient!qf;")
	public static Sprite aClass3_Sub2_Sub1_9;
	@OriginalMember(owner = "client!qi", name = "z", descriptor = "Lclient!qf;")
	public static Sprite aClass3_Sub2_Sub1_10;
	@OriginalMember(owner = "client!nb", name = "i", descriptor = "Lclient!qf;")
	public static Sprite aClass3_Sub2_Sub1_8;
	@OriginalMember(owner = "client!qf", name = "X", descriptor = "Lclient!be;")
	public static Component aClass13_13 = null;
	@OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
	public static int anInt5752;
	@OriginalMember(owner = "client!pk", name = "Y", descriptor = "I")
	public static int anInt4581;
	@OriginalMember(owner = "client!da", name = "ab", descriptor = "I")
	public static int anInt1275;
	@OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
	public static int anInt2910;
	@OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
	public static int anInt5457;
	@OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
	public static int anInt5208;
	@OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
	public static int anInt1736;
	@OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
	public static int anInt2261;
	@OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
	public static int anInt4073;
	@OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
	public static int anInt3324;
	@OriginalMember(owner = "client!uj", name = "E", descriptor = "I")
	public static int anInt5556;

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)V")
	public static void clear() {
		aBoolean247 = false;
		hopTime = 0;
		reply = -3;
		loops = 0;
		step = 1;
		errors = 0;
		disallowResult = -1;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V")
	public static void loopAuto() {
		if (anInt4937 == 0) {
			return;
		}
		try {
			if (++anInt673 > 1500) {
				if (Protocol.socket != null) {
					Protocol.socket.close();
					Protocol.socket = null;
				}
				if (anInt4587 >= 1) {
					reply = -5;
					anInt4937 = 0;
					return;
				}
				anInt673 = 0;
				anInt4587++;
				anInt4937 = 1;
				if (client.worldListPort == client.worldListDefaultPort) {
					client.worldListPort = client.worldListAlternatePort;
				} else {
					client.worldListPort = client.worldListDefaultPort;
				}
			}
			if (anInt4937 == 1) {
				Protocol.socketRequest = GameShell.signLink.openSocket(client.worldListHostname, client.worldListPort);
				anInt4937 = 2;
			}
			@Pc(126) int local126;
			if (anInt4937 == 2) {
				if (Protocol.socketRequest.status == 2) {
					throw new IOException();
				}
				if (Protocol.socketRequest.status != 1) {
					return;
				}
				Protocol.socket = new BufferedSocket((Socket) Protocol.socketRequest.result, GameShell.signLink);
				Protocol.socketRequest = null;
				Protocol.socket.write(Protocol.outboundBuffer.data, Protocol.outboundBuffer.offset);
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
					reply = local126;
					anInt4937 = 0;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				}
				anInt4937 = 3;
			}
			if (anInt4937 == 3) {
				if (Protocol.socket.available() < 2) {
					return;
				}
				local126 = Protocol.socket.read() << 8 | Protocol.socket.read();
				WorldList.hopWorld(local126);
				if (Player.worldId == -1) {
					anInt4937 = 0;
					reply = 6;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				}
				anInt4937 = 0;
				Protocol.socket.close();
				Protocol.socket = null;
				clear();
			}
		} catch (@Pc(210) IOException local210) {
			if (Protocol.socket != null) {
				Protocol.socket.close();
				Protocol.socket = null;
			}
			if (anInt4587 < 1) {
				if (client.worldListPort == client.worldListDefaultPort) {
					client.worldListPort = client.worldListAlternatePort;
				} else {
					client.worldListPort = client.worldListDefaultPort;
				}
				anInt4937 = 1;
				anInt673 = 0;
				anInt4587++;
			} else {
				reply = -4;
				anInt4937 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
	public static void loop() {
		if (step == 0 || step == 5) {
			return;
		}
		try {
			if (++loops > 2000) {
				if (Protocol.socket != null) {
					Protocol.socket.close();
					Protocol.socket = null;
				}
				if (errors >= 1) {
					reply = -5;
					step = 0;
					return;
				}
				loops = 0;
				if (client.port == client.defaultPort) {
					client.port = client.alternatePort;
				} else {
					client.port = client.defaultPort;
				}
				step = 1;
				errors++;
			}
			if (step == 1) {
				if (GlobalJsonConfig.instance != null) {
					client.hostname = GlobalJsonConfig.instance.ip_management;
					client.port = GlobalJsonConfig.instance.server_port + client.worldListId;
				}
				Protocol.socketRequest = GameShell.signLink.openSocket(client.hostname, client.port);
				step = 2;
			}
			if (step == 2) {
				if (Protocol.socketRequest.status == 2) {
					throw new IOException();
				}
				if (Protocol.socketRequest.status != 1) {
					return;
				}
				Protocol.socket = new BufferedSocket((Socket) Protocol.socketRequest.result, GameShell.signLink);
				Protocol.socketRequest = null;
				@Pc(106) long local106 = Player.name37 = Player.usernameInput.encode37();
				Protocol.outboundBuffer.offset = 0;
				Protocol.outboundBuffer.p1(14);
				@Pc(120) int local120 = (int) (local106 >> 16 & 0x1FL);
				Protocol.outboundBuffer.p1(local120);
				Protocol.socket.write(Protocol.outboundBuffer.data, 2);
				if (client.musicChannel != null) {
					client.musicChannel.method3571();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method3571();
				}
				@Pc(150) int local150 = Protocol.socket.read();
				if (client.musicChannel != null) {
					client.musicChannel.method3571();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method3571();
				}
				if (local150 != 0) {
					reply = local150;
					step = 0;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				}
				step = 3;
			}
			if (step == 3) {
				if (Protocol.socket.available() < 8) {
					return;
				}
				Protocol.socket.read(0, 8, Protocol.inboundBuffer.data);
				Protocol.inboundBuffer.offset = 0;
				serverKey = Protocol.inboundBuffer.g8();
				@Pc(210) int[] key = new int[4];
				Protocol.outboundBuffer.offset = 0;
				key[2] = (int) (serverKey >> 32);
				key[3] = (int) serverKey;
				key[1] = (int) (Math.random() * 9.9999999E7D);
				key[0] = (int) (Math.random() * 9.9999999E7D);
				Protocol.outboundBuffer.p1(10);
				Protocol.outboundBuffer.p4(key[0]);
				Protocol.outboundBuffer.p4(key[1]);
				Protocol.outboundBuffer.p4(key[2]);
				Protocol.outboundBuffer.p4(key[3]);
				Protocol.outboundBuffer.p8(Player.usernameInput.encode37());
				Protocol.outboundBuffer.pjstr(Player.password);
				if (GlobalConfig.LOGIN_EXTRA_INFO) {
					Protocol.outboundBuffer.pjstr(JagString.parse(""));
					Protocol.outboundBuffer.pjstr(JagString.parse(""));
					Protocol.outboundBuffer.pjstr(JagString.parse(""));
				}
				Protocol.outboundBuffer.rsaenc(GlobalConfig.RSA_EXPONENT, GlobalConfig.RSA_MODULUS);
				buffer.offset = 0;
				if (client.gameState == 40) {
					buffer.p1(18);
				} else {
					buffer.p1(16);
				}
				int offset = 0;
				if (GlobalConfig.LOGIN_FAKE_IDX28) {
					// pretend that we're loading the archive so we don't throw the packet size off
					offset = 4;
				}
				buffer.p2(Protocol.outboundBuffer.offset + Buffer.gjstrlen(client.settings) + (159 + offset));
				buffer.p4(530);
				buffer.p1(anInt39);
				buffer.p1(client.advertSuppressed ? 1 : 0);
				buffer.p1(1);
				buffer.p1(DisplayMode.getWindowMode());
				buffer.p2(GameShell.canvasWidth);
				buffer.p2(GameShell.canvasHeight);
				buffer.p1(Preferences.antiAliasingMode);
				client.writeUid(buffer);
				buffer.pjstr(client.settings);
				buffer.p4(client.affiliate);
				buffer.p4(Preferences.toInt());
				Preferences.sentToServer = true;
				buffer.p2(Protocol.verifyId);
				buffer.p4(client.js5Archive0.getChecksum());
				buffer.p4(client.js5Archive1.getChecksum());
				buffer.p4(client.js5Archive2.getChecksum());
				buffer.p4(client.js5Archive3.getChecksum());
				buffer.p4(client.js5Archive4.getChecksum());
				buffer.p4(client.js5Archive5.getChecksum());
				buffer.p4(client.js5Archive6.getChecksum());
				buffer.p4(client.js5Archive7.getChecksum());
				buffer.p4(client.js5Archive8.getChecksum());
				buffer.p4(client.js5Archive9.getChecksum());
				buffer.p4(client.js5Archive10.getChecksum());
				buffer.p4(client.js5Archive11.getChecksum());
				buffer.p4(client.js5Archive12.getChecksum());
				buffer.p4(client.js5Archive13.getChecksum());
				buffer.p4(client.js5Archive14.getChecksum());
				buffer.p4(client.js5Archive15.getChecksum());
				buffer.p4(client.js5Archive16.getChecksum());
				buffer.p4(client.js5Archive17.getChecksum());
				buffer.p4(client.js5Archive18.getChecksum());
				buffer.p4(client.js5Archive19.getChecksum());
				buffer.p4(client.js5Archive20.getChecksum());
				buffer.p4(client.js5Archive21.getChecksum());
				buffer.p4(client.js5Archive22.getChecksum());
				buffer.p4(client.js5Archive23.getChecksum());
				buffer.p4(client.js5Archive24.getChecksum());
				buffer.p4(client.js5Archive25.getChecksum());
				buffer.p4(client.js5Archive26.getChecksum());
				buffer.p4(client.js5Archive27.getChecksum());
				if (GlobalConfig.LOGIN_FAKE_IDX28) {
					buffer.p4(0);
				}
				buffer.pdata(Protocol.outboundBuffer.data, Protocol.outboundBuffer.offset);
				Protocol.socket.write(buffer.data, buffer.offset);
				Protocol.outboundBuffer.setKey(key);
				for (@Pc(583) int local583 = 0; local583 < 4; local583++) {
					key[local583] += 50;
				}
				Protocol.inboundBuffer.setKey(key);
				step = 4;
			}
			if (step == 4) {
				if (Protocol.socket.available() < 1) {
					return;
				}
				@Pc(623) int local623 = Protocol.socket.read();
				if (local623 == 21) {
					step = 7;
				} else if (local623 == 29) {
					step = 10;
				} else if (local623 == 1) {
					step = 5;
					reply = local623;
					return;
				} else if (local623 == 2) {
					step = 8;
				} else if (local623 == 15) {
					step = 0;
					reply = local623;
					return;
				} else if (local623 == 23 && errors < 1) {
					step = 1;
					errors++;
					loops = 0;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				} else {
					reply = local623;
					step = 0;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				}
			}
			if (step == 6) {
				Protocol.outboundBuffer.offset = 0;
				Protocol.outboundBuffer.p1isaac(17);
				Protocol.socket.write(Protocol.outboundBuffer.data, Protocol.outboundBuffer.offset);
				step = 4;
				return;
			}
			if (step == 7) {
				if (Protocol.socket.available() >= 1) {
					hopTime = (Protocol.socket.read() + 3) * 60;
					step = 0;
					reply = 21;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				}
				return;
			}
			if (step == 10) {
				if (Protocol.socket.available() >= 1) {
					disallowResult = Protocol.socket.read();
					step = 0;
					reply = 29;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				}
				return;
			}
			if (step == 8) {
				if (Protocol.socket.available() < 14) {
					return;
				}
				Protocol.socket.read(0, 14, Protocol.inboundBuffer.data);
				Protocol.inboundBuffer.offset = 0;
				staffModLevel = Protocol.inboundBuffer.g1();
				blackmarks = Protocol.inboundBuffer.g1();
				playerUnderage = Protocol.inboundBuffer.g1() == 1;
				parentalChatConsent = Protocol.inboundBuffer.g1() == 1;
				parentalAdvertConsent = Protocol.inboundBuffer.g1() == 1;
				mapQuickChat = Protocol.inboundBuffer.g1() == 1;
				MouseRecorder.enabled = Protocol.inboundBuffer.g1() == 1;
				PlayerList.selfId = Protocol.inboundBuffer.g2();
				playerMember = Protocol.inboundBuffer.g1() == 1;
				mapMembers = Protocol.inboundBuffer.g1() == 1;
				LocTypeList.setAllowMembers(mapMembers);
				ObjTypeList.setAllowMembers(mapMembers);
				if (!client.advertSuppressed) {
					if (playerUnderage && !parentalAdvertConsent || playerMember) {
						try {
							ZAP.browserControlCall(GameShell.signLink.applet);
						} catch (@Pc(910) Throwable local910) {
						}
					} else {
						try {
							UNZAP.browserControlCall(GameShell.signLink.applet);
						} catch (@Pc(920) Throwable local920) {
						}
					}
				}
				Protocol.opcode = Protocol.inboundBuffer.g1isaac();
				Protocol.length = Protocol.inboundBuffer.g2();
				step = 9;
			}
			if (step == 9) {
				if (Protocol.socket.available() < Protocol.length) {
					return;
				}
				Protocol.inboundBuffer.offset = 0;
				Protocol.socket.read(0, Protocol.length, Protocol.inboundBuffer.data);
				reply = 2;
				step = 0;
				client.method4221();
				centralZoneX = -1;
				Protocol.readRebuildPacket(false);
				Protocol.opcode = -1;
			}
		} catch (@Pc(977) IOException ex) {
			if (Protocol.socket != null) {
				Protocol.socket.close();
				Protocol.socket = null;
			}
			if (errors >= 1) {
				step = 0;
				reply = -4;
			} else {
				step = 1;
				loops = 0;
				errors++;
				if (client.defaultPort == client.port) {
					client.port = client.alternatePort;
				} else {
					client.port = client.defaultPort;
				}
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public static void method3395() {
		if (step == 5) {
			step = 6;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!na;Lclient!na;IB)V")
	public static void method3896(@OriginalArg(0) JagString arg0, @OriginalArg(1) JagString arg1, @OriginalArg(2) int arg2) {
		Player.password = arg1;
		anInt39 = arg2;
		Player.usernameInput = arg0;
		if (Player.usernameInput.strEquals(JagString.EMPTY) || Player.password.strEquals(JagString.EMPTY)) {
			reply = 3;
		} else if (Player.worldId == -1) {
			anInt673 = 0;
			anInt4587 = 0;
			reply = -3;
			anInt4937 = 1;
			@Pc(43) Buffer local43 = new Buffer(128);
			local43.p1(10);
			local43.p2((int) (Math.random() * 99999.0D));
			local43.p2(530);
			local43.p8(Player.usernameInput.encode37());
			local43.p4((int) (Math.random() * 9.9999999E7D));
			local43.pjstr(Player.password);
			local43.p4((int) (Math.random() * 9.9999999E7D));
			local43.rsaenc(GlobalConfig.RSA_EXPONENT, GlobalConfig.RSA_MODULUS);
			Protocol.outboundBuffer.offset = 0;
			Protocol.outboundBuffer.p1(210);
			Protocol.outboundBuffer.p1(local43.offset);
			Protocol.outboundBuffer.pdata(local43.data, local43.offset);
		} else {
			clear();
		}
	}

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "(I)V")
	public static void setupLoadingScreenRegion() {
		@Pc(10) int local10 = (Camera.renderX >> 10) + (Camera.originX >> 3);
		@Pc(23) int local23 = (Camera.renderZ >> 10) + (Camera.originZ >> 3);
		locationMapFilesBuffer = new byte[18][];
		underWaterLocationsMapFileIds = new int[18];
		npcSpawnsFilesBuffer = new byte[18][];
		mapFileIds = new int[18];
		regionsXteaKeys = new int[18][4];
		underWaterMapFilesBuffer = new byte[18][];
		regionBitPacked = new int[18];
		mapFilesBuffer = new byte[18][];
		npcSpawnsFileIds = new int[18];
		underWaterMapFileIds = new int[18];
		locationsMapFileIds = new int[18];
		underWaterLocationsMapFilesBuffer = new byte[18][];
		@Pc(74) int local74 = 0;
		@Pc(80) int local80;
		for (local80 = (local10 - 6) / 8; local80 <= (local10 + 6) / 8; local80++) {
			for (@Pc(97) int local97 = (local23 - 6) / 8; local97 <= (local23 + 6) / 8; local97++) {
				@Pc(115) int local115 = (local80 << 8) + local97;
				regionBitPacked[local74] = local115;
				mapFileIds[local74] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[]{aClass100_558, JagString.parseInt(local80), UNDERSCORE, JagString.parseInt(local97)}));
				locationsMapFileIds[local74] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[]{aClass100_1090, JagString.parseInt(local80), UNDERSCORE, JagString.parseInt(local97)}));
				npcSpawnsFileIds[local74] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[]{aClass100_807, JagString.parseInt(local80), UNDERSCORE, JagString.parseInt(local97)}));
				underWaterMapFileIds[local74] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[]{aClass100_772, JagString.parseInt(local80), UNDERSCORE, JagString.parseInt(local97)}));
				underWaterLocationsMapFileIds[local74] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[]{aClass100_1103, JagString.parseInt(local80), UNDERSCORE, JagString.parseInt(local97)}));
				if (npcSpawnsFileIds[local74] == -1) {
					mapFileIds[local74] = -1;
					locationsMapFileIds[local74] = -1;
					underWaterMapFileIds[local74] = -1;
					underWaterLocationsMapFileIds[local74] = -1;
				}
				local74++;
			}
		}
		for (local80 = local74; local80 < npcSpawnsFileIds.length; local80++) {
			npcSpawnsFileIds[local80] = -1;
			mapFileIds[local80] = -1;
			locationsMapFileIds[local80] = -1;
			underWaterMapFileIds[local80] = -1;
			underWaterLocationsMapFileIds[local80] = -1;
		}
		method2463(0, local23, local10, 8, true, 8);
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V")
	public static void processLogout() {
		if (Protocol.socket != null) {
			Protocol.socket.close();
			Protocol.socket = null;
		}
		client.method3768();
		SceneGraph.clear();
		@Pc(19) int local19;
		for (local19 = 0; local19 < 4; local19++) {
			PathFinder.collisionMaps[local19].clear();
		}
		WorldMap.clear(false);
		System.gc();
		MidiPlayer.playFadeOut();
		MidiPlayer.jingle = false;
		MusicPlayer.groupId = -1;
		AreaSoundManager.clear(true);
		dynamicMapRegion = false;
		Camera.originZ = 0;
		centralZoneX = 0;
		centralZoneZ = 0;
		Camera.originX = 0;
		for (local19 = 0; local19 < MiniMap.hintMapMarkers.length; local19++) {
			MiniMap.hintMapMarkers[local19] = null;
		}
		PlayerList.size = 0;
		NpcList.size = 0;
		for (local19 = 0; local19 < 2048; local19++) {
			PlayerList.players[local19] = null;
			PlayerList.appearanceCache[local19] = null;
		}
		for (local19 = 0; local19 < 32768; local19++) {
			NpcList.npcs[local19] = null;
		}
		for (local19 = 0; local19 < 4; local19++) {
			for (@Pc(115) int local115 = 0; local115 < 104; local115++) {
				for (@Pc(122) int local122 = 0; local122 < 104; local122++) {
					SceneGraph.objStacks[local19][local115][local122] = null;
				}
			}
		}
		Camera.resetCameraEffects();
		Protocol.verifyId = 0;
		VarpDomain.reset();
		InterfaceList.method1596(true);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIZIZ)V")
	public static void method2463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (centralZoneX == arg2 && arg1 == centralZoneZ && (centralPlane == arg0 || SceneGraph.allLevelsAreVisible())) {
			return;
		}
		centralZoneX = arg2;
		centralZoneZ = arg1;
		centralPlane = arg0;
		if (SceneGraph.allLevelsAreVisible()) {
			centralPlane = 0;
		}
		if (arg4) {
			client.setGameState(28);
		} else {
			client.setGameState(25);
		}
		Fonts.drawTextOnScreen(true, LocalizedText.LOADING);
		@Pc(53) int local53 = Camera.originZ;
		@Pc(55) int local55 = Camera.originX;
		Camera.originZ = arg1 * 8 - 48;
		Camera.originX = (arg2 - 6) * 8;
		map = MapList.getContainingSource(centralZoneX * 8, centralZoneZ * 8);
		@Pc(81) int local81 = Camera.originZ - local53;
		@Pc(86) int local86 = Camera.originX - local55;
		mapElementList = null;
		@Pc(96) int local96;
		@Pc(103) Npc local103;
		@Pc(109) int local109;
		if (arg4) {
			NpcList.size = 0;
			for (local96 = 0; local96 < 32768; local96++) {
				local103 = NpcList.npcs[local96];
				if (local103 != null) {
					local103.xFine -= local86 * 128;
					local103.zFine -= local81 * 128;
					if (local103.xFine >= 0 && local103.xFine <= 13184 && local103.zFine >= 0 && local103.zFine <= 13184) {
						for (local109 = 0; local109 < 10; local109++) {
							local103.movementQueueX[local109] -= local86;
							local103.movementQueueZ[local109] -= local81;
						}
						NpcList.ids[NpcList.size++] = local96;
					} else {
						NpcList.npcs[local96].setNpcType(null);
						NpcList.npcs[local96] = null;
					}
				}
			}
		} else {
			for (local96 = 0; local96 < 32768; local96++) {
				local103 = NpcList.npcs[local96];
				if (local103 != null) {
					for (local109 = 0; local109 < 10; local109++) {
						local103.movementQueueX[local109] -= local86;
						local103.movementQueueZ[local109] -= local81;
					}
					local103.xFine -= local86 * 128;
					local103.zFine -= local81 * 128;
				}
			}
		}
		for (local96 = 0; local96 < 2048; local96++) {
			@Pc(265) Player local265 = PlayerList.players[local96];
			if (local265 != null) {
				for (local109 = 0; local109 < 10; local109++) {
					local265.movementQueueX[local109] -= local86;
					local265.movementQueueZ[local109] -= local81;
				}
				local265.xFine -= local86 * 128;
				local265.zFine -= local81 * 128;
			}
		}
		Player.level = arg0;
		PlayerList.self.teleport(arg5, false, arg3);
		@Pc(322) byte local322 = 104;
		@Pc(324) byte local324 = 0;
		@Pc(326) byte local326 = 0;
		@Pc(328) byte local328 = 1;
		@Pc(330) byte local330 = 104;
		@Pc(332) byte local332 = 1;
		if (local81 < 0) {
			local328 = -1;
			local330 = -1;
			local326 = 103;
		}
		if (local86 < 0) {
			local332 = -1;
			local324 = 103;
			local322 = -1;
		}
		for (@Pc(358) int local358 = local324; local358 != local322; local358 += local332) {
			for (@Pc(367) int local367 = local326; local367 != local330; local367 += local328) {
				@Pc(378) int local378 = local86 + local358;
				@Pc(382) int local382 = local367 + local81;
				for (@Pc(384) int local384 = 0; local384 < 4; local384++) {
					if (local378 >= 0 && local382 >= 0 && local378 < 104 && local382 < 104) {
						SceneGraph.objStacks[local384][local358][local367] = SceneGraph.objStacks[local384][local378][local382];
					} else {
						SceneGraph.objStacks[local384][local358][local367] = null;
					}
				}
			}
		}
		for (@Pc(451) ChangeLocRequest local451 = (ChangeLocRequest) ChangeLocRequest.queue.head(); local451 != null; local451 = (ChangeLocRequest) ChangeLocRequest.queue.next()) {
			local451.z -= local81;
			local451.x -= local86;
			if (local451.x < 0 || local451.z < 0 || local451.x >= 104 || local451.z >= 104) {
				local451.unlink();
			}
		}
		if (arg4) {
			Camera.renderX -= local86 * 128;
			Camera.renderZ -= local81 * 128;
			Camera.anInt4232 -= local81;
			Camera.anInt5449 -= local86;
			Camera.anInt5765 -= local81;
			Camera.anInt5375 -= local86;
		} else {
			Camera.cameraType = 1;
		}
		SoundPlayer.size = 0;
		if (mapFlagX != 0) {
			mapFlagZ -= local81;
			mapFlagX -= local86;
		}
		if (GlRenderer.enabled && arg4 && (Math.abs(local86) > 104 || Math.abs(local81) > 104)) {
			FogManager.setInstantFade();
		}
		LightingManager.anInt2875 = -1;
		SceneGraph.spotanims.clear();
		SceneGraph.projectiles.clear();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
	public static void reconnect() {
		Protocol.outboundBuffer.offset = 0;
		Protocol.opcode3 = -1;
		Cs1ScriptRunner.aBoolean108 = false;
		Protocol.length = 0;
		mapFlagX = 0;
		MiniMenu.size = 0;
		Protocol.opcode2 = -1;
		MiniMap.state = 0;
		Player.rebootTimer = 0;
		Protocol.opcode4 = -1;
		Protocol.inboundBuffer.offset = 0;
		anInt1862 = 0;
		Protocol.opcode = -1;
		@Pc(35) int local35;
		for (local35 = 0; local35 < PlayerList.players.length; local35++) {
			if (PlayerList.players[local35] != null) {
				PlayerList.players[local35].faceEntity = -1;
			}
		}
		for (local35 = 0; local35 < NpcList.npcs.length; local35++) {
			if (NpcList.npcs[local35] != null) {
				NpcList.npcs[local35].faceEntity = -1;
			}
		}
		Inv.method2073();
		Camera.cameraType = 1;
		client.setGameState(30);
		for (local35 = 0; local35 < 100; local35++) {
			InterfaceList.aBooleanArray100[local35] = true;
		}
		ClientProt.method1373();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZI)V")
	public static void method743(@OriginalArg(0) boolean arg0) {
		@Pc(13) int local13 = mapFilesBuffer.length;
		@Pc(19) byte[][] local19;
		if (GlRenderer.enabled && arg0) {
			local19 = underWaterLocationsMapFilesBuffer;
		} else {
			local19 = locationMapFilesBuffer;
		}
		for (@Pc(25) int local25 = 0; local25 < local13; local25++) {
			@Pc(32) byte[] local32 = local19[local25];
			if (local32 != null) {
				@Pc(45) int local45 = (regionBitPacked[local25] >> 8) * 64 - Camera.originX;
				@Pc(56) int local56 = (regionBitPacked[local25] & 0xFF) * 64 - Camera.originZ;
				client.audioLoop();
				SceneGraph.method2437(local45, arg0, local32, local56, PathFinder.collisionMaps);
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
	public static void rebuildMap() {
		ClientProt.ping(false);
		mapFilesMissingCount = 0;
		@Pc(12) boolean fileExists = true;
		@Pc(14) int id;
		for (id = 0; id < mapFilesBuffer.length; id++) {
			if (mapFileIds[id] != -1 && mapFilesBuffer[id] == null) {
				mapFilesBuffer[id] = client.js5Archive5.fetchFile(mapFileIds[id], 0);
				if (mapFilesBuffer[id] == null) {
					mapFilesMissingCount++;
					fileExists = false;
				}
			}
			if (locationsMapFileIds[id] != -1 && locationMapFilesBuffer[id] == null) {
				locationMapFilesBuffer[id] = client.js5Archive5.fetchFile(locationsMapFileIds[id], regionsXteaKeys[id], 0);
				if (locationMapFilesBuffer[id] == null) {
					fileExists = false;
					mapFilesMissingCount++;
				}
			}

			if (GlRenderer.enabled) {
				if (underWaterMapFileIds[id] != -1 && underWaterMapFilesBuffer[id] == null) {
					underWaterMapFilesBuffer[id] = client.js5Archive5.fetchFile(underWaterMapFileIds[id], 0);
					if (underWaterMapFilesBuffer[id] == null) {
						fileExists = false;
						mapFilesMissingCount++;
					}
				}
				if (underWaterLocationsMapFileIds[id] != -1 && underWaterLocationsMapFilesBuffer[id] == null) {
					underWaterLocationsMapFilesBuffer[id] = client.js5Archive5.fetchFile(underWaterLocationsMapFileIds[id], 0);
					if (underWaterLocationsMapFilesBuffer[id] == null) {
						mapFilesMissingCount++;
						fileExists = false;
					}
				}
			}

			if (npcSpawnsFileIds != null && npcSpawnsFilesBuffer[id] == null && npcSpawnsFileIds[id] != -1) {
				npcSpawnsFilesBuffer[id] = client.js5Archive5.fetchFile(npcSpawnsFileIds[id], regionsXteaKeys[id], 0);
				if (npcSpawnsFilesBuffer[id] == null) {
					mapFilesMissingCount++;
					fileExists = false;
				}
			}
		}

		if (mapElementList == null) {
			if (map == null || !client.js5Archive23.isGroupNameValid(JagString.concatenate(new JagString[]{map.group, ClientProt.aClass100_363}))) {
				mapElementList = new MapElementList(0);
			} else if (client.js5Archive23.isGroupReady(JagString.concatenate(new JagString[]{map.group, ClientProt.aClass100_363}))) {
				mapElementList = MapElementList.create(JagString.concatenate(new JagString[]{map.group, ClientProt.aClass100_363}), client.js5Archive23);
			} else {
				fileExists = false;
				mapFilesMissingCount++;
			}
		}

		if (!fileExists) {
			loadingScreenState = 1;
			return;
		}

		ClientProt.anInt5804 = 0;
		fileExists = true;
		@Pc(320) int chunkX;
		@Pc(309) int chunkZ;
		for (id = 0; id < mapFilesBuffer.length; id++) {
			@Pc(294) byte[] local294 = locationMapFilesBuffer[id];
			if (local294 != null) {
				chunkZ = (regionBitPacked[id] & 0xFF) * 64 - Camera.originZ;
				chunkX = (regionBitPacked[id] >> 8) * 64 - Camera.originX;
				if (dynamicMapRegion) {
					chunkZ = 10;
					chunkX = 10;
				}
				fileExists &= method1201(chunkX, chunkZ, local294);
			}
			if (GlRenderer.enabled) {
				local294 = underWaterLocationsMapFilesBuffer[id];
				if (local294 != null) {
					chunkX = (regionBitPacked[id] >> 8) * 64 - Camera.originX;
					chunkZ = (regionBitPacked[id] & 0xFF) * 64 - Camera.originZ;
					if (dynamicMapRegion) {
						chunkZ = 10;
						chunkX = 10;
					}
					fileExists &= method1201(chunkX, chunkZ, local294);
				}
			}
		}
		if (!fileExists) {
			loadingScreenState = 2;
			return;
		}

		if (loadingScreenState != 0) {
			Fonts.drawTextOnScreen(true, JagString.concatenate(new JagString[]{LocalizedText.LOADING, ClientProt.COMPLETE_PERCENT}));
		}

		client.audioLoop();
		client.method3768();
		@Pc(420) boolean hasUnderWaterMap = false;
		@Pc(427) int i;
		if (GlRenderer.enabled && Preferences.highWaterDetail) {
			for (i = 0; i < mapFilesBuffer.length; i++) {
				if (underWaterLocationsMapFilesBuffer[i] != null || underWaterMapFilesBuffer[i] != null) {
					hasUnderWaterMap = true;
					break;
				}
			}
		}
		SceneGraph.init(GlRenderer.enabled ? GlobalConfig.TILE_DISTANCE : 25, hasUnderWaterMap);
		for (i = 0; i < 4; i++) {
			PathFinder.collisionMaps[i].clear();
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
			ShadowManager.shadowMapImage.clear();
			for (i = 0; i < 13; i++) {
				for (chunkX = 0; chunkX < 13; chunkX++) {
					ShadowManager.shadows[i][chunkX].outputToSprite = true;
				}
			}
		}
		if (GlRenderer.enabled) {
			LightingManager.method2404();
		}
		if (GlRenderer.enabled) {
			ClientProt.setDefaultChunksAtmosphere();
		}
		client.audioLoop();
		System.gc();
		ClientProt.ping(true);
		SceneGraph.load(false);
		if (!dynamicMapRegion) {
			method1805(false);
			ClientProt.ping(true);
			if (GlRenderer.enabled) {
				i = PlayerList.self.movementQueueX[0] >> 3;
				chunkX = PlayerList.self.movementQueueZ[0] >> 3;
				FogManager.setLightPosition(chunkX, i);
			}
			method743(false);
			if (npcSpawnsFilesBuffer != null) {
				decodeNpcFiles();
			}
		}
		if (dynamicMapRegion) {
			method1835(false);
			ClientProt.ping(true);
			if (GlRenderer.enabled) {
				i = PlayerList.self.movementQueueX[0] >> 3;
				chunkX = PlayerList.self.movementQueueZ[0] >> 3;
				FogManager.setLightPosition(chunkX, i);
			}
			method4002(false);
		}
		client.method3768();
		ClientProt.ping(true);
		SceneGraph.method1169(PathFinder.collisionMaps, false);
		if (GlRenderer.enabled) {
			LightingManager.method2395();
		}
		ClientProt.ping(true);
		i = SceneGraph.firstVisibleLevel;
		if (i > Player.level) {
			i = Player.level;
		}
		if (i < Player.level - 1) {
		}
		if (SceneGraph.allLevelsAreVisible()) {
			SceneGraph.method2750(0);
		} else {
			SceneGraph.method2750(SceneGraph.firstVisibleLevel);
		}
		SceneGraph.unload();
		if (GlRenderer.enabled && hasUnderWaterMap) {
			SceneGraph.setUnderwater(true);
			SceneGraph.load(true);
			if (!dynamicMapRegion) {
				method1805(true);
				ClientProt.ping(true);
				method743(true);
			}
			if (dynamicMapRegion) {
				method1835(true);
				ClientProt.ping(true);
				method4002(true);
			}
			client.method3768();
			ClientProt.ping(true);
			SceneGraph.method1169(PathFinder.collisionMaps, true);
			ClientProt.ping(true);
			SceneGraph.unload();
			SceneGraph.setUnderwater(false);
		}
		if (GlRenderer.enabled) {
			for (chunkX = 0; chunkX < 13; chunkX++) {
				for (chunkZ = 0; chunkZ < 13; chunkZ++) {
					ShadowManager.shadows[chunkX][chunkZ].method4676(SceneGraph.tileHeights[0], chunkX * 8, chunkZ * 8);
				}
			}
		}
		for (chunkX = 0; chunkX < 104; chunkX++) {
			for (chunkZ = 0; chunkZ < 104; chunkZ++) {
				Protocol.spawnGroundObject(chunkZ, chunkX);
			}
		}
		ScriptRunner.method2218();
		client.audioLoop();
		ChangeLocRequest.flush();
		client.method3768();
		aBoolean252 = false;
		if (GameShell.frame != null && Protocol.socket != null && client.gameState == 25) {
			Protocol.outboundBuffer.p1isaac(20);
			Protocol.outboundBuffer.p4(1057001181);
		}
		if (!dynamicMapRegion) {
			@Pc(815) int local815 = (centralZoneZ + 6) / 8;
			@Pc(821) int local821 = (centralZoneZ - 6) / 8;
			chunkX = (centralZoneX - 6) / 8;
			chunkZ = (centralZoneX + 6) / 8;
			for (@Pc(837) int local837 = chunkX - 1; local837 <= chunkZ + 1; local837++) {
				for (@Pc(850) int local850 = local821 - 1; local850 <= local815 + 1; local850++) {
					if (local837 < chunkX || local837 > chunkZ || local850 < local821 || local850 > local815) {
						client.js5Archive5.prefetchGroup(JagString.concatenate(new JagString[]{aClass100_558, JagString.parseInt(local837), UNDERSCORE, JagString.parseInt(local850)}));
						client.js5Archive5.prefetchGroup(JagString.concatenate(new JagString[]{aClass100_1090, JagString.parseInt(local837), UNDERSCORE, JagString.parseInt(local850)}));
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
		WorldMap.method2720();
		client.audioLoop();
		GameShell.resetTimer();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BII[B)Z")
	public static boolean method1201(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(15) boolean local15 = true;
		@Pc(17) int local17 = -1;
		@Pc(22) Buffer local22 = new Buffer(arg2);
		label70:
		while (true) {
			@Pc(26) int local26 = local22.gVarSmart();
			if (local26 == 0) {
				return local15;
			}
			@Pc(33) int local33 = 0;
			local17 += local26;
			@Pc(39) boolean local39 = false;
			while (true) {
				@Pc(78) int local78;
				@Pc(95) LocType local95;
				do {
					@Pc(72) int local72;
					@Pc(68) int local68;
					do {
						do {
							do {
								do {
									@Pc(45) int local45;
									while (local39) {
										local45 = local22.gsmarts();
										if (local45 == 0) {
											continue label70;
										}
										local22.g1();
									}
									local45 = local22.gsmarts();
									if (local45 == 0) {
										continue label70;
									}
									local33 += local45 - 1;
									@Pc(58) int local58 = local33 & 0x3F;
									@Pc(64) int local64 = local33 >> 6 & 0x3F;
									local68 = arg1 + local58;
									local72 = arg0 + local64;
									local78 = local22.g1() >> 2;
								} while (local72 <= 0);
							} while (local68 <= 0);
						} while (local72 >= 103);
					} while (local68 >= 103);
					local95 = LocTypeList.get(local17);
				} while (local78 == 22 && !Preferences.showGroundDecorations && local95.anInt4429 == 0 && local95.anInt4435 != 1 && !local95.aBoolean206);
				local39 = true;
				if (!local95.isReady()) {
					local15 = false;
					ClientProt.anInt5804++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZB)V")
	public static void method4002(@OriginalArg(0) boolean arg0) {
		@Pc(19) byte local19;
		@Pc(21) byte[][] local21;
		if (GlRenderer.enabled && arg0) {
			local21 = underWaterLocationsMapFilesBuffer;
			local19 = 1;
		} else {
			local19 = 4;
			local21 = locationMapFilesBuffer;
		}
		for (@Pc(29) int local29 = 0; local29 < local19; local29++) {
			client.audioLoop();
			for (@Pc(36) int local36 = 0; local36 < 13; local36++) {
				for (@Pc(43) int local43 = 0; local43 < 13; local43++) {
					@Pc(56) int local56 = Protocol.anIntArrayArrayArray18[local29][local36][local43];
					if (local56 != -1) {
						@Pc(67) int local67 = local56 >> 24 & 0x3;
						if (!arg0 || local67 == 0) {
							@Pc(77) int local77 = local56 >> 1 & 0x3;
							@Pc(83) int local83 = local56 >> 14 & 0x3FF;
							@Pc(89) int local89 = local56 >> 3 & 0x7FF;
							@Pc(99) int local99 = local89 / 8 + (local83 / 8 << 8);
							for (@Pc(101) int local101 = 0; local101 < regionBitPacked.length; local101++) {
								if (regionBitPacked[local101] == local99 && local21[local101] != null) {
									method3771(PathFinder.collisionMaps, local29, local21[local101], local67, local77, local36 * 8, local43 * 8, arg0, (local83 & 0x7) * 8, (local89 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "([Lclient!mj;I[BIIIIZIIB)V")
	public static void method3771(@OriginalArg(0) CollisionMap[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = -1;
		@Pc(12) Buffer local12 = new Buffer(arg2);
		while (true) {
			@Pc(20) int local20 = local12.gVarSmart();
			if (local20 == 0) {
				return;
			}
			local7 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local12.gsmarts();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(50) int local50 = local31 & 0x3F;
				@Pc(56) int local56 = local31 >> 6 & 0x3F;
				@Pc(60) int local60 = local31 >> 12;
				@Pc(64) int local64 = local12.g1();
				@Pc(68) int local68 = local64 >> 2;
				@Pc(72) int local72 = local64 & 0x3;
				if (arg3 == local60 && local56 >= arg8 && local56 < arg8 + 8 && arg9 <= local50 && arg9 + 8 > local50) {
					@Pc(103) LocType local103 = LocTypeList.get(local7);
					@Pc(120) int local120 = method1286(local50 & 0x7, arg4, local72, local103.length, local103.width, local56 & 0x7) + arg5;
					@Pc(137) int local137 = method4541(local103.width, arg4, local103.length, local56 & 0x7, local72, local50 & 0x7) + arg6;
					if (local120 > 0 && local137 > 0 && local120 < 103 && local137 < 103) {
						@Pc(154) CollisionMap local154 = null;
						if (!arg7) {
							@Pc(159) int local159 = arg1;
							if ((SceneGraph.tileFlags[1][local120][local137] & 0x2) == 2) {
								local159 = arg1 - 1;
							}
							if (local159 >= 0) {
								local154 = arg0[local159];
							}
						}
						SceneGraph.method3397(arg1, !arg7, arg1, arg7, local154, local7, local68, local120, local137, local72 + arg4 & 0x3);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIII)I")
	public static int method1286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(10) int local10 = arg4;
			arg4 = arg3;
			arg3 = local10;
		}
		@Pc(18) int local18 = arg1 & 0x3;
		if (local18 == 0) {
			return arg5;
		} else if (local18 == 1) {
			return arg0;
		} else if (local18 == 2) {
			return 7 + 1 - arg5 - arg4;
		} else {
			return 7 + 1 - arg0 - arg3;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIBIIII)I")
	public static int method4541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(9) int local9 = arg0;
			arg0 = arg2;
			arg2 = local9;
		}
		@Pc(29) int local29 = arg1 & 0x3;
		if (local29 == 0) {
			return arg5;
		} else if (local29 == 1) {
			return 7 + 1 - arg3 - arg0;
		} else if (local29 == 2) {
			return 1 + 7 - arg2 - arg5;
		} else {
			return arg3;
		}
	}

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "(B)V")
	public static void decodeNpcFiles() {
		@Pc(10) int local10 = npcSpawnsFilesBuffer.length;
		for (@Pc(16) int local16 = 0; local16 < local10; local16++) {
			if (npcSpawnsFilesBuffer[local16] != null) {
				@Pc(25) int local25 = -1;
				for (@Pc(27) int local27 = 0; local27 < anInt3811; local27++) {
					if (anIntArray434[local27] == regionBitPacked[local16]) {
						local25 = local27;
						break;
					}
				}
				if (local25 == -1) {
					anIntArray434[anInt3811] = regionBitPacked[local16];
					local25 = anInt3811++;
				}
				@Pc(67) int local67 = 0;
				@Pc(74) Buffer local74 = new Buffer(npcSpawnsFilesBuffer[local16]);
				while (local74.offset < npcSpawnsFilesBuffer[local16].length && local67 < 511) {
					@Pc(97) int local97 = local67++ << 6 | local25;
					@Pc(103) int local103 = local74.g2();
					@Pc(107) int local107 = local103 >> 14;
					@Pc(113) int local113 = local103 >> 7 & 0x3F;
					@Pc(125) int local125 = local113 + (regionBitPacked[local16] >> 8) * 64 - Camera.originX;
					@Pc(129) int local129 = local103 & 0x3F;
					@Pc(142) int local142 = local129 + (regionBitPacked[local16] & 0xFF) * 64 - Camera.originZ;
					@Pc(148) NpcType local148 = NpcTypeList.get(local74.g2());
					if (NpcList.npcs[local97] == null && (local148.aByte10 & 0x1) > 0 && local107 == centralPlane && local125 >= 0 && local148.size + local125 < 104 && local142 >= 0 && local142 + local148.size < 104) {
						NpcList.npcs[local97] = new Npc();
						@Pc(198) Npc local198 = NpcList.npcs[local97];
						NpcList.ids[NpcList.size++] = local97;
						local198.lastSeenLoop = client.loop;
						local198.setNpcType(local148);
						local198.setSize(local198.type.size);
						local198.anInt3400 = local198.anInt3381 = PathingEntity.ANGLES[local198.type.aByte11];
						local198.anInt3376 = local198.type.anInt3733;
						if (local198.anInt3376 == 0) {
							local198.anInt3381 = 0;
						}
						local198.anInt3365 = local198.type.basId;
						local198.method2683(local198.getSize(), local125, local142, true);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZB)V")
	public static void method1835(@OriginalArg(0) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(13) byte[][] local13;
		if (GlRenderer.enabled && arg0) {
			local11 = 1;
			local13 = underWaterMapFilesBuffer;
		} else {
			local13 = mapFilesBuffer;
			local11 = 4;
		}
		for (@Pc(21) int local21 = 0; local21 < local11; local21++) {
			client.audioLoop();
			for (@Pc(32) int local32 = 0; local32 < 13; local32++) {
				for (@Pc(39) int local39 = 0; local39 < 13; local39++) {
					@Pc(52) int local52 = Protocol.anIntArrayArrayArray18[local21][local32][local39];
					@Pc(54) boolean local54 = false;
					if (local52 != -1) {
						@Pc(65) int local65 = local52 >> 24 & 0x3;
						if (!arg0 || local65 == 0) {
							@Pc(76) int local76 = local52 >> 3 & 0x7FF;
							@Pc(82) int local82 = local52 >> 1 & 0x3;
							@Pc(88) int local88 = local52 >> 14 & 0x3FF;
							@Pc(98) int local98 = (local88 / 8 << 8) + local76 / 8;
							for (@Pc(100) int local100 = 0; local100 < regionBitPacked.length; local100++) {
								if (regionBitPacked[local100] == local98 && local13[local100] != null) {
									method4228(local82, local32 * 8, local21, PathFinder.collisionMaps, local39 * 8, local13[local100], local65, (local76 & 0x7) * 8, (local88 & 0x7) * 8, arg0);
									local54 = true;
									break;
								}
							}
						}
					}
					if (!local54) {
						method645(local21, local39 * 8, local32 * 8, 8, 8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public static void method1841() {
		if (!Cs1ScriptRunner.aBoolean108) {
			if (MiniMenu.anInt3953 != 0) {
				ScriptRunner.anInt3751 = Mouse.anInt5850;
				ScriptRunner.anInt1892 = Mouse.anInt5895;
			} else if (Mouse.clickButton == 0) {
				ScriptRunner.anInt3751 = Mouse.lastMouseX;
				ScriptRunner.anInt1892 = Mouse.lastMouseY;
			} else {
				ScriptRunner.anInt3751 = Mouse.clickX;
				ScriptRunner.anInt1892 = Mouse.clickY;
			}
			MiniMenu.size = 1;
			MiniMenu.ops[0] = LocalizedText.CANCEL;
			MiniMenu.opBases[0] = JagString.EMPTY;
			MiniMenu.actions[0] = 1005;
			MiniMenu.cursors[0] = MiniMenu.anInt1092;
		}
		if (InterfaceList.topLevelInterface != -1) {
			InterfaceList.method1949(InterfaceList.topLevelInterface);
		}
		@Pc(60) int local60;
		for (local60 = 0; local60 < InterfaceList.rectangles; local60++) {
			if (InterfaceList.aBooleanArray100[local60]) {
				InterfaceList.rectangleRedraw[local60] = true;
			}
			InterfaceList.aBooleanArray116[local60] = InterfaceList.aBooleanArray100[local60];
			InterfaceList.aBooleanArray100[local60] = false;
		}
		aClass13_13 = null;
		Cs1ScriptRunner.anInt2503 = -1;
		InterfaceList.anInt5574 = -1;
		InterfaceList.mouseOverInventoryInterface = null;
		if (GlRenderer.enabled) {
			ScriptRunner.aBoolean299 = true;
		}
		InterfaceList.anInt4311 = client.loop;
		if (InterfaceList.topLevelInterface != -1) {
			InterfaceList.rectangles = 0;
			Cs1ScriptRunner.method182();
		}
		if (GlRenderer.enabled) {
			GlRaster.method1177();
		} else {
			SoftwareRaster.method2503();
		}
		MiniMenu.sort();
		if (Cs1ScriptRunner.aBoolean108) {
			if (InterfaceList.aBoolean298) {
				method2297();
			} else {
				method2744();
			}
		} else if (aClass13_13 != null) {
			MiniMenu.method1207(aClass13_13, Cs1ScriptRunner.anInt3484, Cs1ScriptRunner.anInt3260);
		} else if (Cs1ScriptRunner.anInt2503 != -1) {
			MiniMenu.method1207(null, InterfaceList.anInt5574, Cs1ScriptRunner.anInt2503);
		}
		local60 = Cs1ScriptRunner.aBoolean108 ? -1 : method4044();
		if (local60 == -1) {
			local60 = ScriptRunner.anInt5794;
		}
		InterfaceList.method1750(local60);
		if (MiniMenu.anInt3096 == 1) {
			MiniMenu.anInt3096 = 2;
		}
		if (Protocol.anInt4422 == 1) {
			Protocol.anInt4422 = 2;
		}
		if (Cheat.rectDebug == 3) {
			for (@Pc(189) int local189 = 0; local189 < InterfaceList.rectangles; local189++) {
				if (InterfaceList.aBooleanArray116[local189]) {
					if (GlRenderer.enabled) {
						GlRaster.fillRectAlpha(InterfaceList.rectangleX[local189], InterfaceList.rectangleY[local189], InterfaceList.rectangleWidth[local189], InterfaceList.rectangleHeight[local189], 16711935, 128);
					} else {
						SoftwareRaster.fillRectAlpha(InterfaceList.rectangleX[local189], InterfaceList.rectangleY[local189], InterfaceList.rectangleWidth[local189], InterfaceList.rectangleHeight[local189], 16711935, 128);
					}
				} else if (InterfaceList.rectangleRedraw[local189]) {
					if (GlRenderer.enabled) {
						GlRaster.fillRectAlpha(InterfaceList.rectangleX[local189], InterfaceList.rectangleY[local189], InterfaceList.rectangleWidth[local189], InterfaceList.rectangleHeight[local189], 16711680, 128);
					} else {
						SoftwareRaster.fillRectAlpha(InterfaceList.rectangleX[local189], InterfaceList.rectangleY[local189], InterfaceList.rectangleWidth[local189], InterfaceList.rectangleHeight[local189], 16711680, 128);
					}
				}
			}
		}
		AreaSoundManager.redraw(Protocol.anInt4247, PlayerList.self.xFine, PlayerList.self.zFine, Player.level);
		Protocol.anInt4247 = 0;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(III[Lclient!mj;IB[BIIIZ)V")
	public static void method4228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) CollisionMap[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		@Pc(17) int local17;
		if (!arg9) {
			for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
				for (local17 = 0; local17 < 8; local17++) {
					if (arg1 + local10 > 0 && local10 + arg1 < 103 && local17 + arg4 > 0 && arg4 + local17 < 103) {
						arg3[arg2].flags[local10 + arg1][local17 + arg4] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(87) byte local87;
		if (arg9) {
			local87 = 1;
		} else {
			local87 = 4;
		}
		@Pc(96) Buffer local96 = new Buffer(arg5);
		@Pc(103) int local103;
		@Pc(108) int local108;
		for (local17 = 0; local17 < local87; local17++) {
			for (local103 = 0; local103 < 64; local103++) {
				for (local108 = 0; local108 < 64; local108++) {
					if (arg6 == local17 && arg8 <= local103 && arg8 + 8 > local103 && arg7 <= local108 && local108 < arg7 + 8) {
						SceneGraph.readTile(0, 0, arg9, local96, method3659(arg0, local103 & 0x7, local108 & 0x7) + arg4, method4360(arg0, local108 & 0x7, local103 & 0x7) + arg1, arg0, arg2);
					} else {
						SceneGraph.readTile(0, 0, arg9, local96, -1, -1, 0, 0);
					}
				}
			}
		}
		@Pc(232) int local232;
		@Pc(417) int local417;
		@Pc(255) int local255;
		@Pc(266) int local266;
		@Pc(316) int local316;
		while (local96.data.length > local96.offset) {
			local103 = local96.g1();
			if (local103 != 129) {
				local96.offset--;
				break;
			}
			for (local108 = 0; local108 < 4; local108++) {
				@Pc(223) byte local223 = local96.g1b();
				@Pc(237) int local237;
				if (local223 == 0) {
					if (local108 <= arg6) {
						local237 = arg1 + 7;
						local232 = arg1;
						local255 = arg4 + 7;
						if (local255 < 0) {
							local255 = 0;
						} else if (local255 >= 104) {
							local255 = 104;
						}
						if (local237 < 0) {
							local237 = 0;
						} else if (local237 >= 104) {
							local237 = 104;
						}
						local417 = arg4;
						if (arg4 < 0) {
							local417 = 0;
						} else if (arg4 >= 104) {
							local417 = 104;
						}
						if (arg1 < 0) {
							local232 = 0;
						} else if (arg1 >= 104) {
							local232 = 104;
						}
						while (local237 > local232) {
							while (local417 < local255) {
								SceneGraph.aByteArrayArrayArray13[arg2][local232][local417] = 0;
								local417++;
							}
							local232++;
						}
					}
				} else if (local223 == 1) {
					for (local232 = 0; local232 < 64; local232 += 4) {
						for (local237 = 0; local237 < 64; local237 += 4) {
							@Pc(246) byte local246 = local96.g1b();
							if (local108 <= arg6) {
								for (local255 = local232; local255 < local232 + 4; local255++) {
									for (local266 = local237; local266 < local237 + 4; local266++) {
										if (local255 >= arg8 && local255 < arg8 + 8 && local266 >= arg7 && arg7 + 8 > arg7) {
											local316 = arg1 + method4360(arg0, local266 & 0x7, local255 & 0x7);
											@Pc(328) int local328 = method3659(arg0, local255 & 0x7, local266 & 0x7) + arg4;
											if (local316 >= 0 && local316 < 104 && local328 >= 0 && local328 < 104) {
												SceneGraph.aByteArrayArrayArray13[arg2][local316][local328] = local246;
											}
										}
									}
								}
							}
						}
					}
				} else if (local223 == 2) {
				}
			}
		}
		@Pc(497) int local497;
		if (GlRenderer.enabled && !arg9) {
			@Pc(472) Environment local472 = null;
			label207:
			while (true) {
				label200:
				do {
					while (local96.data.length > local96.offset) {
						local108 = local96.g1();
						if (local108 != 0) {
							if (local108 != 1) {
								throw new IllegalStateException();
							}
							local497 = local96.g1();
							continue label200;
						}
						local472 = new Environment(local96);
					}
					if (local472 == null) {
						local472 = new Environment();
					}
					FogManager.chunksAtmosphere[arg1 >> 3][arg4 >> 3] = local472;
					break label207;
				} while (local497 <= 0);
				for (local232 = 0; local232 < local497; local232++) {
					@Pc(517) Light local517 = new Light(local96);
					if (local517.anInt2243 == 31) {
						@Pc(529) LightType local529 = LightTypeList.get(local96.g2());
						local517.method1762(local529.anInt2865, local529.anInt2873, local529.anInt2867, local529.anInt2872);
					}
					local417 = local517.x >> 7;
					local255 = local517.z >> 7;
					if (arg6 == local517.level && local417 >= arg8 && arg8 + 8 > local417 && arg7 <= local255 && arg7 + 8 > local255) {
						local266 = method3675(arg0, local517.x & 0x3FF, local517.z & 0x3FF) + (arg1 << 7);
						local316 = method3388(local517.x & 0x3FF, arg0, local517.z & 0x3FF) + (arg4 << 7);
						local517.x = local266;
						local517.z = local316;
						local417 = local517.x >> 7;
						local255 = local517.z >> 7;
						if (local417 >= 0 && local255 >= 0 && local417 < 104 && local255 < 104) {
							local517.aBoolean125 = (SceneGraph.tileFlags[1][local417][local255] & 0x2) != 0;
							local517.y = SceneGraph.tileHeights[local517.level][local417][local255] - local517.y;
							LightingManager.method2389(local517);
						}
					}
				}
			}
		}
		local103 = arg1 + 7;
		local108 = arg4 + 7;
		for (local497 = arg1; local497 < local103; local497++) {
			for (local232 = arg4; local232 < local108; local232++) {
				SceneGraph.aByteArrayArrayArray13[arg2][local497][local232] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)I")
	public static int method4044() {
		return Cheat.shiftClick && Keyboard.pressedKeys[Keyboard.KEY_SHIFT] && MiniMenu.size > 2 ? MiniMenu.cursors[MiniMenu.size - 2] : MiniMenu.cursors[MiniMenu.size - 1];
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZII)I")
	public static int method4360(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBII)I")
	public static int method3659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIBI)I")
	public static int method3675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIZI)I")
	public static int method3388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 1023 - arg0;
		} else if (local3 == 2) {
			return 1023 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
	public static void method2297() {
		@Pc(3) int local3 = InterfaceList.anInt4271;
		@Pc(9) int local9 = InterfaceList.anInt5138;
		@Pc(11) int local11 = InterfaceList.anInt436;
		@Pc(13) int local13 = InterfaceList.anInt761;
		if (aClass3_Sub2_Sub1_1 == null || aClass3_Sub2_Sub1_9 == null) {
			if (client.js5Archive8.isFileReady(anInt1736) && client.js5Archive8.isFileReady(anInt4073)) {
				aClass3_Sub2_Sub1_1 = SoftwareSprite.loadSoftwareAlphaSprite(client.js5Archive8, anInt1736);
				aClass3_Sub2_Sub1_9 = SoftwareSprite.loadSoftwareAlphaSprite(client.js5Archive8, anInt4073);
				if (GlRenderer.enabled) {
					if (aClass3_Sub2_Sub1_1 instanceof SoftwareAlphaSprite) {
						aClass3_Sub2_Sub1_1 = new GlAlphaSprite((SoftwareSprite) aClass3_Sub2_Sub1_1);
					} else {
						aClass3_Sub2_Sub1_1 = new GlSprite((SoftwareSprite) aClass3_Sub2_Sub1_1);
					}
					if (aClass3_Sub2_Sub1_9 instanceof SoftwareAlphaSprite) {
						aClass3_Sub2_Sub1_9 = new GlAlphaSprite((SoftwareSprite) aClass3_Sub2_Sub1_9);
					} else {
						aClass3_Sub2_Sub1_9 = new GlSprite((SoftwareSprite) aClass3_Sub2_Sub1_9);
					}
				}
			} else if (GlRenderer.enabled) {
				GlRaster.fillRectAlpha(local3, local9, local13, 20, anInt1275, 256 - anInt2910);
			} else {
				SoftwareRaster.fillRectAlpha(local3, local9, local13, 20, anInt1275, 256 - anInt2910);
			}
		}
		@Pc(112) int local112;
		@Pc(114) int local114;
		if (aClass3_Sub2_Sub1_1 != null && aClass3_Sub2_Sub1_9 != null) {
			local112 = local13 / aClass3_Sub2_Sub1_1.width;
			for (local114 = 0; local114 < local112; local114++) {
				aClass3_Sub2_Sub1_1.render(local114 * aClass3_Sub2_Sub1_1.width + local3, local9);
			}
			aClass3_Sub2_Sub1_9.render(local3, local9);
			aClass3_Sub2_Sub1_9.renderHorizontalFlip(local3 + local13 - aClass3_Sub2_Sub1_9.width, local9);
		}
		Fonts.b12Full.renderLeft(LocalizedText.CHOOSE_OPTION, local3 + 3, local9 + 14, anInt4581, -1);
		if (GlRenderer.enabled) {
			GlRaster.fillRectAlpha(local3, local9 + 20, local13, local11 - 20, anInt1275, 256 - anInt2910);
		} else {
			SoftwareRaster.fillRectAlpha(local3, local9 + 20, local13, local11 - 20, anInt1275, 256 - anInt2910);
		}
		local114 = Mouse.lastMouseY;
		local112 = Mouse.lastMouseX;
		@Pc(203) int local203;
		@Pc(219) int local219;
		for (local203 = 0; local203 < MiniMenu.size; local203++) {
			local219 = (MiniMenu.size - local203 - 1) * 15 + local9 + 35;
			if (local3 < local112 && local112 < local3 + local13 && local114 > local219 - 13 && local114 < local219 + 3) {
				if (GlRenderer.enabled) {
					GlRaster.fillRectAlpha(local3, local219 - 13, local13, 16, anInt5457, 256 - anInt5208);
				} else {
					SoftwareRaster.fillRectAlpha(local3, local219 - 13, local13, 16, anInt5457, 256 - anInt5208);
				}
			}
		}
		if ((aClass3_Sub2_Sub1_8 == null || aClass3_Sub2_Sub1_6 == null || aClass3_Sub2_Sub1_10 == null) && client.js5Archive8.isFileReady(anInt2261) && client.js5Archive8.isFileReady(anInt3324) && client.js5Archive8.isFileReady(anInt5556)) {
			aClass3_Sub2_Sub1_8 = SoftwareSprite.loadSoftwareAlphaSprite(client.js5Archive8, anInt2261);
			aClass3_Sub2_Sub1_6 = SoftwareSprite.loadSoftwareAlphaSprite(client.js5Archive8, anInt3324);
			aClass3_Sub2_Sub1_10 = SoftwareSprite.loadSoftwareAlphaSprite(client.js5Archive8, anInt5556);
			if (GlRenderer.enabled) {
				if (aClass3_Sub2_Sub1_8 instanceof SoftwareAlphaSprite) {
					aClass3_Sub2_Sub1_8 = new GlAlphaSprite((SoftwareSprite) aClass3_Sub2_Sub1_8);
				} else {
					aClass3_Sub2_Sub1_8 = new GlSprite((SoftwareSprite) aClass3_Sub2_Sub1_8);
				}
				if (aClass3_Sub2_Sub1_6 instanceof SoftwareAlphaSprite) {
					aClass3_Sub2_Sub1_6 = new GlAlphaSprite((SoftwareSprite) aClass3_Sub2_Sub1_6);
				} else {
					aClass3_Sub2_Sub1_6 = new GlSprite((SoftwareSprite) aClass3_Sub2_Sub1_6);
				}
				if (aClass3_Sub2_Sub1_10 instanceof SoftwareAlphaSprite) {
					aClass3_Sub2_Sub1_10 = new GlAlphaSprite((SoftwareSprite) aClass3_Sub2_Sub1_10);
				} else {
					aClass3_Sub2_Sub1_10 = new GlSprite((SoftwareSprite) aClass3_Sub2_Sub1_10);
				}
			}
		}
		@Pc(418) int local418;
		if (aClass3_Sub2_Sub1_8 != null && aClass3_Sub2_Sub1_6 != null && aClass3_Sub2_Sub1_10 != null) {
			local203 = local13 / aClass3_Sub2_Sub1_8.width;
			for (local219 = 0; local219 < local203; local219++) {
				aClass3_Sub2_Sub1_8.render(local3 + aClass3_Sub2_Sub1_8.width * local219, local11 + local9 + -aClass3_Sub2_Sub1_8.height);
			}
			local219 = (local11 - 20) / aClass3_Sub2_Sub1_6.height;
			for (local418 = 0; local418 < local219; local418++) {
				aClass3_Sub2_Sub1_6.render(local3, local9 + local418 * aClass3_Sub2_Sub1_6.height + 20);
				aClass3_Sub2_Sub1_6.renderHorizontalFlip(local3 + local13 - aClass3_Sub2_Sub1_6.width, local9 + 20 + local418 * aClass3_Sub2_Sub1_6.height);
			}
			aClass3_Sub2_Sub1_10.render(local3, local11 + local9 - aClass3_Sub2_Sub1_10.height);
			aClass3_Sub2_Sub1_10.renderHorizontalFlip(local3 + local13 - aClass3_Sub2_Sub1_10.width, local9 - -local11 + -aClass3_Sub2_Sub1_10.height);
		}
		for (local203 = 0; local203 < MiniMenu.size; local203++) {
			local219 = (MiniMenu.size - local203 - 1) * 15 + local9 + 35;
			local418 = anInt4581;
			if (local3 < local112 && local13 + local3 > local112 && local219 - 13 < local114 && local114 < local219 + 3) {
				local418 = anInt5752;
			}
			Fonts.b12Full.renderLeft(MiniMenu.getOp(local203), local3 + 3, local219, local418, 0);
		}
		InterfaceList.forceRedrawScreen(InterfaceList.anInt4271, InterfaceList.anInt5138, InterfaceList.anInt436, InterfaceList.anInt761);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
	public static void method2744() {
		@Pc(3) int local3 = InterfaceList.anInt5138;
		@Pc(9) int local9 = InterfaceList.anInt761;
		@Pc(11) int local11 = InterfaceList.anInt4271;
		@Pc(15) int local15 = InterfaceList.anInt436;
		if (GlRenderer.enabled) {
			GlRaster.fillRect(local11, local3, local9, local15, 6116423);
			GlRaster.fillRect(local11 + 1, local3 + 1, local9 - 2, 16, 0);
			GlRaster.drawRect(local11 + 1, local3 + 18, local9 - 2, local15 + -19, 0);
		} else {
			SoftwareRaster.fillRect(local11, local3, local9, local15, 6116423);
			SoftwareRaster.fillRect(local11 + 1, local3 + 1, local9 - 2, 16, 0);
			SoftwareRaster.drawRect(local11 + 1, local3 + 18, local9 - 2, local15 + -19, 0);
		}
		Fonts.b12Full.renderLeft(LocalizedText.CHOOSE_OPTION, local11 + 3, local3 + 14, 6116423, -1);
		@Pc(96) int local96 = Mouse.lastMouseY;
		@Pc(98) int local98 = Mouse.lastMouseX;
		for (@Pc(107) int local107 = 0; local107 < MiniMenu.size; local107++) {
			@Pc(127) int local127 = (MiniMenu.size - local107 - 1) * 15 + local3 + 31;
			@Pc(129) int local129 = 16777215;
			if (local11 < local98 && local98 < local11 + local9 && local127 - 13 < local96 && local96 < local127 + 3) {
				local129 = 16776960;
			}
			Fonts.b12Full.renderLeft(MiniMenu.getOp(local107), local11 + 3, local127, local129, 0);
		}
		InterfaceList.forceRedrawScreen(InterfaceList.anInt4271, InterfaceList.anInt5138, InterfaceList.anInt436, InterfaceList.anInt761);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZI)V")
	public static void method1805(@OriginalArg(0) boolean arg0) {
		@Pc(7) byte local7;
		@Pc(9) byte[][] local9;
		if (GlRenderer.enabled && arg0) {
			local7 = 1;
			local9 = underWaterMapFilesBuffer;
		} else {
			local7 = 4;
			local9 = mapFilesBuffer;
		}
		@Pc(18) int local18 = local9.length;
		@Pc(20) int local20;
		@Pc(38) int local38;
		@Pc(49) int local49;
		@Pc(53) byte[] local53;
		for (local20 = 0; local20 < local18; local20++) {
			local38 = (regionBitPacked[local20] >> 8) * 64 - Camera.originX;
			local49 = (regionBitPacked[local20] & 0xFF) * 64 - Camera.originZ;
			local53 = local9[local20];
			if (local53 != null) {
				client.audioLoop();
				method2203(PathFinder.collisionMaps, arg0, centralZoneX * 8 - 48, local49, local38, (centralZoneZ - 6) * 8, local53);
			}
		}
		for (local20 = 0; local20 < local18; local20++) {
			local38 = (regionBitPacked[local20] >> 8) * 64 - Camera.originX;
			local49 = (regionBitPacked[local20] & 0xFF) * 64 - Camera.originZ;
			local53 = local9[local20];
			if (local53 == null && centralZoneZ < 800) {
				client.audioLoop();
				for (@Pc(130) int local130 = 0; local130 < local7; local130++) {
					method645(local130, local49, local38, 64, 64);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([Lclient!mj;ZIIIII[B)V")
	public static void method2203(@OriginalArg(0) CollisionMap[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6) {
		@Pc(14) int local14;
		@Pc(21) int local21;
		if (!arg1) {
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				for (local14 = 0; local14 < 64; local14++) {
					for (local21 = 0; local21 < 64; local21++) {
						if (arg4 + local14 > 0 && local14 + arg4 < 103 && arg3 + local21 > 0 && local21 + arg3 < 103) {
							arg0[local9].flags[local14 + arg4][arg3 + local21] &= 0xFEFFFFFF;
						}
					}
				}
			}
		}
		@Pc(95) Buffer local95 = new Buffer(arg6);
		@Pc(99) byte local99;
		if (arg1) {
			local99 = 1;
		} else {
			local99 = 4;
		}
		@Pc(117) int local117;
		for (local14 = 0; local14 < local99; local14++) {
			for (local21 = 0; local21 < 64; local21++) {
				for (local117 = 0; local117 < 64; local117++) {
					SceneGraph.readTile(arg2, arg5, arg1, local95, local117 + arg3, arg4 + local21, 0, local14);
				}
			}
		}
		@Pc(146) boolean local146 = false;
		@Pc(243) int local243;
		@Pc(188) int local188;
		@Pc(190) int local190;
		@Pc(194) int local194;
		while (local95.offset < local95.data.length) {
			local21 = local95.g1();
			if (local21 != 129) {
				local95.offset--;
				break;
			}
			for (local117 = 0; local117 < 4; local117++) {
				@Pc(168) byte local168 = local95.g1b();
				if (local168 == 0) {
					local243 = arg4;
					if (arg4 < 0) {
						local243 = 0;
					} else if (arg4 >= 104) {
						local243 = 104;
					}
					local190 = arg3;
					if (arg3 < 0) {
						local190 = 0;
					} else if (arg3 >= 104) {
						local190 = 104;
					}
					local188 = arg4 + 64;
					local194 = arg3 + 64;
					if (local194 < 0) {
						local194 = 0;
					} else if (local194 >= 104) {
						local194 = 104;
					}
					if (local188 < 0) {
						local188 = 0;
					} else if (local188 >= 104) {
						local188 = 104;
					}
					while (local243 < local188) {
						while (local190 < local194) {
							SceneGraph.aByteArrayArrayArray13[local117][local243][local190] = 0;
							local190++;
						}
						local243++;
					}
				} else if (local168 == 1) {
					for (local243 = 0; local243 < 64; local243 += 4) {
						for (local188 = 0; local188 < 64; local188 += 4) {
							@Pc(305) byte local305 = local95.g1b();
							for (local194 = local243 + arg4; local194 < arg4 + local243 + 4; local194++) {
								for (@Pc(320) int local320 = arg3 + local188; local320 < arg3 + local188 + 4; local320++) {
									if (local194 >= 0 && local194 < 104 && local320 >= 0 && local320 < 104) {
										SceneGraph.aByteArrayArrayArray13[local117][local194][local320] = local305;
									}
								}
							}
						}
					}
				} else if (local168 == 2 && local117 > 0) {
					local188 = arg4 + 64;
					local190 = arg3;
					local194 = arg3 + 64;
					if (local188 < 0) {
						local188 = 0;
					} else if (local188 >= 104) {
						local188 = 104;
					}
					if (arg3 < 0) {
						local190 = 0;
					} else if (arg3 >= 104) {
						local190 = 104;
					}
					if (local194 < 0) {
						local194 = 0;
					} else if (local194 >= 104) {
						local194 = 104;
					}
					local243 = arg4;
					if (arg4 < 0) {
						local243 = 0;
					} else if (arg4 >= 104) {
						local243 = 104;
					}
					while (local188 > local243) {
						while (local190 < local194) {
							SceneGraph.aByteArrayArrayArray13[local117][local243][local190] = SceneGraph.aByteArrayArrayArray13[local117 - 1][local243][local190];
							local190++;
						}
						local243++;
					}
				}
			}
			local146 = true;
		}
		@Pc(515) int local515;
		if (GlRenderer.enabled && !arg1) {
			@Pc(490) Environment local490 = null;
			label270:
			while (true) {
				label263:
				do {
					while (local95.offset < local95.data.length) {
						local117 = local95.g1();
						if (local117 != 0) {
							if (local117 != 1) {
								throw new IllegalStateException();
							}
							local515 = local95.g1();
							continue label263;
						}
						local490 = new Environment(local95);
					}
					if (local490 == null) {
						local490 = new Environment();
					}
					for (local117 = 0; local117 < 8; local117++) {
						for (local515 = 0; local515 < 8; local515++) {
							local243 = local117 + (arg4 >> 3);
							local188 = (arg3 >> 3) + local515;
							if (local243 >= 0 && local243 < 13 && local188 >= 0 && local188 < 13) {
								FogManager.chunksAtmosphere[local243][local188] = local490;
							}
						}
					}
					break label270;
				} while (local515 <= 0);
				for (local243 = 0; local243 < local515; local243++) {
					@Pc(529) Light local529 = new Light(local95);
					if (local529.anInt2243 == 31) {
						@Pc(541) LightType local541 = LightTypeList.get(local95.g2());
						local529.method1762(local541.anInt2865, local541.anInt2873, local541.anInt2867, local541.anInt2872);
					}
					local529.z += arg3 << 7;
					local529.x += arg4 << 7;
					local194 = local529.z >> 7;
					local190 = local529.x >> 7;
					if (local190 >= 0 && local194 >= 0 && local190 < 104 && local194 < 104) {
						local529.aBoolean125 = (SceneGraph.tileFlags[1][local190][local194] & 0x2) != 0;
						local529.y = SceneGraph.tileHeights[local529.level][local190][local194] - local529.y;
						LightingManager.method2389(local529);
					}
				}
			}
		}
		if (local146) {
			return;
		}
		for (local21 = 0; local21 < 4; local21++) {
			for (local117 = 0; local117 < 16; local117++) {
				for (local515 = 0; local515 < 16; local515++) {
					local243 = (arg4 >> 2) + local117;
					local188 = local515 + (arg3 >> 2);
					if (local243 >= 0 && local243 < 26 && local188 >= 0 && local188 < 26) {
						SceneGraph.aByteArrayArrayArray13[local21][local243][local188] = 0;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IBIIII)V")
	public static void method645(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3;
		@Pc(10) int local10;
		for (local3 = arg1; local3 <= arg3 + arg1; local3++) {
			for (local10 = arg2; local10 <= arg4 + arg2; local10++) {
				if (local10 >= 0 && local10 < 104 && local3 >= 0 && local3 < 104) {
					SceneGraph.aByteArrayArrayArray9[arg0][local10][local3] = 127;
				}
			}
		}
		for (local3 = arg1; local3 < arg3 + arg1; local3++) {
			for (local10 = arg2; local10 < arg2 + arg4; local10++) {
				if (local10 >= 0 && local10 < 104 && local3 >= 0 && local3 < 104) {
					SceneGraph.tileHeights[arg0][local10][local3] = arg0 <= 0 ? 0 : SceneGraph.tileHeights[arg0 - 1][local10][local3];
				}
			}
		}
		if (arg2 > 0 && arg2 < 104) {
			for (local3 = arg1 + 1; local3 < arg1 + arg3; local3++) {
				if (local3 >= 0 && local3 < 104) {
					SceneGraph.tileHeights[arg0][arg2][local3] = SceneGraph.tileHeights[arg0][arg2 - 1][local3];
				}
			}
		}
		if (arg1 > 0 && arg1 < 104) {
			for (local3 = arg2 + 1; local3 < arg2 + arg4; local3++) {
				if (local3 >= 0 && local3 < 104) {
					SceneGraph.tileHeights[arg0][local3][arg1] = SceneGraph.tileHeights[arg0][local3][arg1 - 1];
				}
			}
		}
		if (arg2 < 0 || arg1 < 0 || arg2 >= 104 || arg1 >= 104) {
			return;
		}
		if (arg0 == 0) {
			if (arg2 > 0 && SceneGraph.tileHeights[arg0][arg2 - 1][arg1] != 0) {
				SceneGraph.tileHeights[arg0][arg2][arg1] = SceneGraph.tileHeights[arg0][arg2 - 1][arg1];
			} else if (arg1 > 0 && SceneGraph.tileHeights[arg0][arg2][arg1 - 1] != 0) {
				SceneGraph.tileHeights[arg0][arg2][arg1] = SceneGraph.tileHeights[arg0][arg2][arg1 - 1];
			} else if (arg2 > 0 && arg1 > 0 && SceneGraph.tileHeights[arg0][arg2 - 1][arg1 - 1] != 0) {
				SceneGraph.tileHeights[arg0][arg2][arg1] = SceneGraph.tileHeights[arg0][arg2 - 1][arg1 - 1];
			}
		} else if (arg2 > 0 && SceneGraph.tileHeights[arg0 - 1][arg2 - 1][arg1] != SceneGraph.tileHeights[arg0][arg2 - 1][arg1]) {
			SceneGraph.tileHeights[arg0][arg2][arg1] = SceneGraph.tileHeights[arg0][arg2 - 1][arg1];
		} else if (arg1 > 0 && SceneGraph.tileHeights[arg0][arg2][arg1 - 1] != SceneGraph.tileHeights[arg0 - 1][arg2][arg1 - 1]) {
			SceneGraph.tileHeights[arg0][arg2][arg1] = SceneGraph.tileHeights[arg0][arg2][arg1 - 1];
		} else if (arg2 > 0 && arg1 > 0 && SceneGraph.tileHeights[arg0][arg2 - 1][arg1 - 1] != SceneGraph.tileHeights[arg0 - 1][arg2 - 1][arg1 - 1]) {
			SceneGraph.tileHeights[arg0][arg2][arg1] = SceneGraph.tileHeights[arg0][arg2 - 1][arg1 - 1];
		}
	}

	@OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V")
	public static void method4637() {
		aClass3_Sub2_Sub1_8 = null;
		aClass3_Sub2_Sub1_1 = null;
		aClass3_Sub2_Sub1_6 = null;
		aClass3_Sub2_Sub1_9 = null;
		aClass3_Sub2_Sub1_10 = null;
	}
}
