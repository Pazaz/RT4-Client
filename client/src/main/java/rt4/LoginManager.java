package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import plugin.PluginRepository;

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
	@OriginalMember(owner = "client!e", name = "Dc", descriptor = "Lclient!na;")
	public static final JagString aClass100_363 = JagString.parse("_labels");
	@OriginalMember(owner = "client!bh", name = "C", descriptor = "Lclient!na;")
	public static final JagString COMPLETE_PERCENT = JagString.parse("<br>(X100(U(Y");
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
	@OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
	public static int anInt5804 = 0;

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
				for (@Pc(583) int i = 0; i < 4; i++) {
					key[i] += 50;
				}
				Protocol.inboundBuffer.setKey(key);
				step = 4;
			}
			if (step == 4) {
				if (Protocol.socket.available() < 1) {
					return;
				}
				@Pc(623) int reply = Protocol.socket.read();
				if (reply == 21) {
					step = 7;
				} else if (reply == 29) {
					step = 10;
				} else if (reply == 1) {
					step = 5;
					LoginManager.reply = reply;
					return;
				} else if (reply == 2) {
					step = 8;
				} else if (reply == 15) {
					step = 0;
					LoginManager.reply = reply;
					return;
				} else if (reply == 23 && errors < 1) {
					step = 1;
					errors++;
					loops = 0;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				} else {
					LoginManager.reply = reply;
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
						} catch (@Pc(910) Throwable ignored) {
						}
					} else {
						try {
							UNZAP.browserControlCall(GameShell.signLink.applet);
						} catch (@Pc(920) Throwable ignored) {
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
				SceneGraph.centralZoneX = -1;
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
		client.unload();
		SceneGraph.clear();
		@Pc(19) int i;
		for (i = 0; i < 4; i++) {
			PathFinder.collisionMaps[i].clear();
		}
		WorldMap.clear(false);
		System.gc();
		MidiPlayer.playFadeOut();
		MidiPlayer.jingle = false;
		MusicPlayer.groupId = -1;
		AreaSoundManager.clear(true);
		SceneGraph.dynamicMapRegion = false;
		Camera.originZ = 0;
		SceneGraph.centralZoneX = 0;
		SceneGraph.centralZoneZ = 0;
		Camera.originX = 0;
		for (i = 0; i < MiniMap.hintMapMarkers.length; i++) {
			MiniMap.hintMapMarkers[i] = null;
		}
		PlayerList.size = 0;
		NpcList.size = 0;
		for (i = 0; i < 2048; i++) {
			PlayerList.players[i] = null;
			PlayerList.appearanceCache[i] = null;
		}
		for (i = 0; i < 32768; i++) {
			NpcList.npcs[i] = null;
		}
		for (int level = 0; level < 4; level++) {
			for (@Pc(115) int x = 0; x < 104; x++) {
				for (@Pc(122) int z = 0; z < 104; z++) {
					SceneGraph.objStacks[level][x][z] = null;
				}
			}
		}
		Camera.resetCameraEffects();
		Protocol.verifyId = 0;
		VarpDomain.reset();
		InterfaceList.method1596(true);
		PluginRepository.OnLogout();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIZIZ)V")
	public static void method2463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (SceneGraph.centralZoneX == arg2 && arg1 == SceneGraph.centralZoneZ && (SceneGraph.centralPlane == arg0 || SceneGraph.allLevelsAreVisible())) {
			return;
		}
		SceneGraph.centralZoneX = arg2;
		SceneGraph.centralZoneZ = arg1;
		SceneGraph.centralPlane = arg0;
		if (SceneGraph.allLevelsAreVisible()) {
			SceneGraph.centralPlane = 0;
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
		map = MapList.getContainingSource(SceneGraph.centralZoneX * 8, SceneGraph.centralZoneZ * 8);
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
		Player.plane = arg0;
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
		@Pc(35) int i;
		for (i = 0; i < PlayerList.players.length; i++) {
			if (PlayerList.players[i] != null) {
				PlayerList.players[i].faceEntity = -1;
			}
		}
		for (i = 0; i < NpcList.npcs.length; i++) {
			if (NpcList.npcs[i] != null) {
				NpcList.npcs[i].faceEntity = -1;
			}
		}
		Inv.clear();
		Camera.cameraType = 1;
		client.setGameState(30);
		for (i = 0; i < 100; i++) {
			InterfaceList.aBooleanArray100[i] = true;
		}
		ClientProt.sendWindowDetails();
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
				SceneGraph.readLocs(local45, arg0, local32, local56, PathFinder.collisionMaps);
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
			if (map == null || !client.js5Archive23.isGroupNameValid(JagString.concatenate(new JagString[]{map.group, aClass100_363}))) {
				mapElementList = new MapElementList(0);
			} else if (client.js5Archive23.isGroupReady(JagString.concatenate(new JagString[]{map.group, aClass100_363}))) {
				mapElementList = MapElementList.create(JagString.concatenate(new JagString[]{map.group, aClass100_363}), client.js5Archive23);
			} else {
				fileExists = false;
				mapFilesMissingCount++;
			}
		}

		if (!fileExists) {
			loadingScreenState = 1;
			return;
		}

		anInt5804 = 0;
		fileExists = true;
		@Pc(320) int chunkX;
		@Pc(309) int chunkZ;
		for (id = 0; id < mapFilesBuffer.length; id++) {
			@Pc(294) byte[] local294 = locationMapFilesBuffer[id];
			if (local294 != null) {
				chunkZ = (regionBitPacked[id] & 0xFF) * 64 - Camera.originZ;
				chunkX = (regionBitPacked[id] >> 8) * 64 - Camera.originX;
				if (SceneGraph.dynamicMapRegion) {
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
					if (SceneGraph.dynamicMapRegion) {
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
			Fonts.drawTextOnScreen(true, JagString.concatenate(new JagString[]{LocalizedText.LOADING, COMPLETE_PERCENT}));
		}

		client.audioLoop();
		client.unload();
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
					SceneGraph.renderFlags[i][chunkX][chunkZ] = 0;
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
			FogManager.setDefaultChunksAtmosphere();
		}
		client.audioLoop();
		System.gc();
		ClientProt.ping(true);
		SceneGraph.load(false);
		if (!SceneGraph.dynamicMapRegion) {
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
		if (SceneGraph.dynamicMapRegion) {
			method1835(false);
			ClientProt.ping(true);
			if (GlRenderer.enabled) {
				i = PlayerList.self.movementQueueX[0] >> 3;
				chunkX = PlayerList.self.movementQueueZ[0] >> 3;
				FogManager.setLightPosition(chunkX, i);
			}
			method4002(false);
		}
		client.unload();
		ClientProt.ping(true);
		SceneGraph.method1169(PathFinder.collisionMaps, false);
		if (GlRenderer.enabled) {
			LightingManager.method2395();
		}
		ClientProt.ping(true);
		i = SceneGraph.firstVisibleLevel;
		if (i > Player.plane) {
			i = Player.plane;
		}
		if (i < Player.plane - 1) {
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
			if (!SceneGraph.dynamicMapRegion) {
				method1805(true);
				ClientProt.ping(true);
				method743(true);
			}
			if (SceneGraph.dynamicMapRegion) {
				method1835(true);
				ClientProt.ping(true);
				method4002(true);
			}
			client.unload();
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
		client.unload();
		aBoolean252 = false;
		if (GameShell.frame != null && Protocol.socket != null && client.gameState == 25) {
			Protocol.outboundBuffer.p1isaac(20);
			Protocol.outboundBuffer.p4(1057001181);
		}
		if (!SceneGraph.dynamicMapRegion) {
			@Pc(815) int local815 = (SceneGraph.centralZoneZ + 6) / 8;
			@Pc(821) int local821 = (SceneGraph.centralZoneZ - 6) / 8;
			chunkX = (SceneGraph.centralZoneX - 6) / 8;
			chunkZ = (SceneGraph.centralZoneX + 6) / 8;
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
				} while (local78 == 22 && !Preferences.showGroundDecorations && local95.interactable == 0 && local95.blockwalk != 1 && !local95.forcedecor);
				local39 = true;
				if (!local95.isReady()) {
					local15 = false;
					anInt5804++;
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
							if ((SceneGraph.renderFlags[1][local120][local137] & 0x2) == 2) {
								local159 = arg1 - 1;
							}
							if (local159 >= 0) {
								local154 = arg0[local159];
							}
						}
						SceneGraph.addLoc(arg1, !arg7, arg1, arg7, local154, local7, local68, local120, local137, local72 + arg4 & 0x3);
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
					if (NpcList.npcs[local97] == null && (local148.loginscreenproperties & 0x1) > 0 && local107 == SceneGraph.centralPlane && local125 >= 0 && local148.size + local125 < 104 && local142 >= 0 && local142 + local148.size < 104) {
						NpcList.npcs[local97] = new Npc();
						@Pc(198) Npc local198 = NpcList.npcs[local97];
						NpcList.ids[NpcList.size++] = local97;
						local198.lastSeenLoop = client.loop;
						local198.setNpcType(local148);
						local198.setSize(local198.type.size);
						local198.anInt3400 = local198.anInt3381 = PathingEntity.ANGLES[local198.type.spawndirection];
						local198.anInt3376 = local198.type.rotationspeed;
						if (local198.anInt3376 == 0) {
							local198.anInt3381 = 0;
						}
						local198.anInt3365 = local198.type.bastypeid;
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
									SceneGraph.method4228(local82, local32 * 8, local21, PathFinder.collisionMaps, local39 * 8, local13[local100], local65, (local76 & 0x7) * 8, (local88 & 0x7) * 8, arg0);
									local54 = true;
									break;
								}
							}
						}
					}
					if (!local54) {
						SceneGraph.method645(local21, local39 * 8, local32 * 8, 8, 8);
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
		if (!Cs1ScriptRunner.aBoolean108) {
			PluginRepository.OnMiniMenuCreate();
		}
		MiniMenu.sort();
		if (Cs1ScriptRunner.aBoolean108) {
			if (InterfaceList.aBoolean298) {
				MiniMenu.drawB();
			} else {
				MiniMenu.drawA();
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
		AreaSoundManager.redraw(Protocol.sceneDelta, PlayerList.self.xFine, PlayerList.self.zFine, Player.plane);
		Protocol.sceneDelta = 0;
	}

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)I")
	public static int method4044() {
		return Cheat.shiftClick && Keyboard.pressedKeys[Keyboard.KEY_SHIFT] && MiniMenu.size > 2 ? MiniMenu.cursors[MiniMenu.size - 2] : MiniMenu.cursors[MiniMenu.size - 1];
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
				SceneGraph.method2203(PathFinder.collisionMaps, arg0, SceneGraph.centralZoneX * 8 - 48, local49, local38, (SceneGraph.centralZoneZ - 6) * 8, local53);
			}
		}
		for (local20 = 0; local20 < local18; local20++) {
			local38 = (regionBitPacked[local20] >> 8) * 64 - Camera.originX;
			local49 = (regionBitPacked[local20] & 0xFF) * 64 - Camera.originZ;
			local53 = local9[local20];
			if (local53 == null && SceneGraph.centralZoneZ < 800) {
				client.audioLoop();
				for (@Pc(130) int local130 = 0; local130 < local7; local130++) {
					SceneGraph.method645(local130, local49, local38, 64, 64);
				}
			}
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
