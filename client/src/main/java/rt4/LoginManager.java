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
    @OriginalMember(owner = "client!hk", name = "W", descriptor = "Lclient!ih;")
	public static final LinkedList aClass69_64 = new LinkedList();
    @OriginalMember(owner = "client!gd", name = "h", descriptor = "[I")
    public static final int[] anIntArray204 = new int[] { 16, 32, 64, 128 };
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
                Static176.hopWorld(local126);
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
                return;
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
				mapFileIds[local74] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { aClass100_558, JagString.parseInt(local80), UNDERSCORE, JagString.parseInt(local97) }));
				locationsMapFileIds[local74] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { aClass100_1090, JagString.parseInt(local80), UNDERSCORE, JagString.parseInt(local97) }));
				npcSpawnsFileIds[local74] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { aClass100_807, JagString.parseInt(local80), UNDERSCORE, JagString.parseInt(local97) }));
				underWaterMapFileIds[local74] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { aClass100_772, JagString.parseInt(local80), UNDERSCORE, JagString.parseInt(local97) }));
				underWaterLocationsMapFileIds[local74] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { aClass100_1103, JagString.parseInt(local80), UNDERSCORE, JagString.parseInt(local97) }));
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
        Static114.drawTextOnScreen(true, LocalizedText.LOADING);
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
            Static103.setInstantFade();
        }
        LightingManager.anInt2875 = -1;
        aClass69_64.clear();
        Static217.aClass69_116.clear();
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
    public static void reconnect() {
        Protocol.outboundBuffer.offset = 0;
        Protocol.opcode3 = -1;
        Static40.aBoolean108 = false;
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
                method2437(local45, arg0, local32, local56, PathFinder.collisionMaps);
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZ[BII[Lclient!mj;)V")
    public static void method2437(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) CollisionMap[] arg4) {
        @Pc(10) Buffer local10 = new Buffer(arg2);
        @Pc(12) int local12 = -1;
        while (true) {
            @Pc(16) int local16 = local10.gVarSmart();
            if (local16 == 0) {
                return;
            }
            local12 += local16;
            @Pc(27) int local27 = 0;
            while (true) {
                @Pc(31) int local31 = local10.gsmarts();
                if (local31 == 0) {
                    break;
                }
                local27 += local31 - 1;
                @Pc(46) int local46 = local27 & 0x3F;
                @Pc(50) int local50 = local27 >> 12;
                @Pc(56) int local56 = local27 >> 6 & 0x3F;
                @Pc(60) int local60 = local10.g1();
                @Pc(64) int local64 = local60 >> 2;
                @Pc(68) int local68 = local60 & 0x3;
                @Pc(72) int local72 = arg0 + local56;
                @Pc(76) int local76 = local46 + arg3;
                if (local72 > 0 && local76 > 0 && local72 < 103 && local76 < 103) {
                    @Pc(90) CollisionMap local90 = null;
                    if (!arg1) {
                        @Pc(95) int local95 = local50;
                        if ((SceneGraph.tileFlags[1][local72][local76] & 0x2) == 2) {
                            local95 = local50 - 1;
                        }
                        if (local95 >= 0) {
                            local90 = arg4[local95];
                        }
                    }
                    method3397(local50, !arg1, local50, arg1, local90, local12, local64, local72, local76, local68);
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IZIZLclient!mj;IIIBII)V")
	public static void method3397(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) CollisionMap arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg1 && !SceneGraph.allLevelsAreVisible() && (SceneGraph.tileFlags[0][arg7][arg8] & 0x2) == 0) {
			if ((SceneGraph.tileFlags[arg2][arg7][arg8] & 0x10) != 0) {
				return;
			}
			if (Static4.method22(arg8, arg7, arg2) != centralPlane) {
				return;
			}
		}
		if (arg2 < SceneGraph.firstVisibleLevel) {
			SceneGraph.firstVisibleLevel = arg2;
		}
		@Pc(62) LocType local62 = LocTypeList.get(arg5);
		if (GlRenderer.enabled && local62.aBoolean216) {
			return;
		}
		@Pc(84) int local84;
		@Pc(81) int local81;
		if (arg9 == 1 || arg9 == 3) {
			local81 = local62.width;
			local84 = local62.length;
		} else {
			local84 = local62.width;
			local81 = local62.length;
		}
		@Pc(103) int local103;
		@Pc(112) int local112;
		if (arg7 + local84 <= 104) {
			local103 = arg7 + (local84 >> 1);
			local112 = arg7 + (local84 + 1 >> 1);
		} else {
			local112 = arg7 + 1;
			local103 = arg7;
		}
		@Pc(129) int local129;
		@Pc(133) int local133;
		if (local81 + arg8 > 104) {
			local129 = arg8;
			local133 = arg8 + 1;
		} else {
			local129 = (local81 >> 1) + arg8;
			local133 = arg8 + (local81 + 1 >> 1);
		}
		@Pc(153) int[][] local153 = SceneGraph.tileHeights[arg0];
		@Pc(165) int local165 = (local84 << 6) + (arg7 << 7);
		@Pc(173) int local173 = (local81 << 6) + (arg8 << 7);
		@Pc(199) int local199 = local153[local103][local133] + local153[local112][local129] + local153[local103][local129] + local153[local112][local133] >> 2;
		@Pc(201) int local201 = 0;
		@Pc(213) int[][] local213;
		if (GlRenderer.enabled && arg0 != 0) {
			local213 = SceneGraph.tileHeights[0];
			local201 = local199 - (local213[local112][local133] + local213[local112][local129] + local213[local103][local129] + local213[local103][local133] >> 2);
		}
		local213 = null;
		@Pc(261) long local261 = (long) (arg7 | 0x40000000 | arg8 << 7 | arg6 << 14 | arg9 << 20);
		if (arg3) {
			local213 = SceneGraph.surfaceTileHeights[0];
		} else if (arg0 < 3) {
			local213 = SceneGraph.tileHeights[arg0 + 1];
		}
		if (local62.anInt4429 == 0 || arg3) {
			local261 |= Long.MIN_VALUE;
		}
		if (local62.anInt4438 == 1) {
			local261 |= 0x400000L;
		}
		if (local62.aBoolean213) {
			local261 |= 0x80000000L;
		}
		if (local62.hasAreaSound()) {
			AreaSoundManager.add(arg8, local62, arg9, null, arg7, arg2, null);
		}
		@Pc(330) boolean local330 = local62.aBoolean212 & !arg3;
		local261 |= (long) arg5 << 32;
		@Pc(387) Entity local387;
		@Pc(403) Loc_Class139 local403;
		if (arg6 == 22) {
			if (Preferences.showGroundDecorations || local62.anInt4429 != 0 || local62.anInt4435 == 1 || local62.aBoolean206) {
				if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
					local403 = local62.method3428(arg9, local165, local153, 22, local199, local213, arg1, null, local330, local173);
					if (GlRenderer.enabled && local330) {
						ShadowManager.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
					}
					local387 = local403.aClass8_10;
				} else {
					local387 = new Loc(arg5, 22, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
				}
				SceneGraph.setGroundDecor(arg2, arg7, arg8, local199, local387, local261, local62.aBoolean211);
				if (local62.anInt4435 == 1 && arg4 != null) {
					arg4.flagGroundDecor(arg7, arg8);
				}
			}
		} else if (arg6 == 10 || arg6 == 11) {
			if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
				local403 = local62.method3428(arg6 == 11 ? arg9 + 4 : arg9, local165, local153, 10, local199, local213, arg1, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					ShadowManager.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
				}
				local387 = local403.aClass8_10;
			} else {
				local387 = new Loc(arg5, 10, arg6 == 11 ? arg9 + 4 : arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
			}
			if (local387 != null) {
				@Pc(531) boolean local531 = Static5.method35(arg2, arg7, arg8, local199, local84, local81, local387, local261);
				if (local62.aBoolean215 && local531 && arg1) {
					@Pc(541) int local541 = 15;
					if (local387 instanceof Model) {
						local541 = ((Model) local387).method4566() / 4;
						if (local541 > 30) {
							local541 = 30;
						}
					}
					for (@Pc(560) int local560 = 0; local560 <= local84; local560++) {
						for (@Pc(565) int local565 = 0; local565 <= local81; local565++) {
							if (SceneGraph.aByteArrayArrayArray9[arg2][arg7 + local560][local565 + arg8] < local541) {
								SceneGraph.aByteArrayArrayArray9[arg2][arg7 + local560][arg8 + local565] = (byte) local541;
							}
						}
					}
				}
			}
			if (local62.anInt4435 != 0 && arg4 != null) {
				arg4.flagScenery(arg7, local62.aBoolean207, arg8, local84, local81);
			}
		} else if (arg6 >= 12) {
			if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
				local403 = local62.method3428(arg9, local165, local153, arg6, local199, local213, arg1, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					ShadowManager.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
				}
				local387 = local403.aClass8_10;
			} else {
				local387 = new Loc(arg5, arg6, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
			}
			Static5.method35(arg2, arg7, arg8, local199, 1, 1, local387, local261);
			if (arg1 && arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg2 > 0) {
				SceneGraph.anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x4;
			}
			if (local62.anInt4435 != 0 && arg4 != null) {
				arg4.flagScenery(arg7, local62.aBoolean207, arg8, local84, local81);
			}
		} else if (arg6 == 0) {
			if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
				local403 = local62.method3428(arg9, local165, local153, 0, local199, local213, arg1, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					ShadowManager.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
				}
				local387 = local403.aClass8_10;
			} else {
				local387 = new Loc(arg5, 0, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
			}
			SceneGraph.setWall(arg2, arg7, arg8, local199, local387, null, Static267.anIntArray517[arg9], 0, local261);
			if (arg1) {
				if (arg9 == 0) {
					if (local62.aBoolean215) {
						SceneGraph.aByteArrayArrayArray9[arg2][arg7][arg8] = 50;
						SceneGraph.aByteArrayArrayArray9[arg2][arg7][arg8 + 1] = 50;
					}
					if (local62.aBoolean220) {
						SceneGraph.anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x1;
					}
				} else if (arg9 == 1) {
					if (local62.aBoolean215) {
						SceneGraph.aByteArrayArrayArray9[arg2][arg7][arg8 + 1] = 50;
						SceneGraph.aByteArrayArrayArray9[arg2][arg7 + 1][arg8 + 1] = 50;
					}
					if (local62.aBoolean220) {
						SceneGraph.anIntArrayArrayArray6[arg2][arg7][arg8 + 1] |= 0x2;
					}
				} else if (arg9 == 2) {
					if (local62.aBoolean215) {
						SceneGraph.aByteArrayArrayArray9[arg2][arg7 + 1][arg8] = 50;
						SceneGraph.aByteArrayArrayArray9[arg2][arg7 + 1][arg8 + 1] = 50;
					}
					if (local62.aBoolean220) {
						SceneGraph.anIntArrayArrayArray6[arg2][arg7 + 1][arg8] |= 0x1;
					}
				} else if (arg9 == 3) {
					if (local62.aBoolean215) {
						SceneGraph.aByteArrayArrayArray9[arg2][arg7][arg8] = 50;
						SceneGraph.aByteArrayArrayArray9[arg2][arg7 + 1][arg8] = 50;
					}
					if (local62.aBoolean220) {
						SceneGraph.anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x2;
					}
				}
			}
			if (local62.anInt4435 != 0 && arg4 != null) {
				arg4.flagWall(arg9, arg6, local62.aBoolean207, arg8, arg7);
			}
			if (local62.wallDecorOffsetScale != 16) {
				Static18.method559(arg2, arg7, arg8, local62.wallDecorOffsetScale);
			}
		} else if (arg6 == 1) {
			if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
				local403 = local62.method3428(arg9, local165, local153, 1, local199, local213, arg1, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					ShadowManager.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
				}
				local387 = local403.aClass8_10;
			} else {
				local387 = new Loc(arg5, 1, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
			}
			SceneGraph.setWall(arg2, arg7, arg8, local199, local387, null, anIntArray204[arg9], 0, local261);
			if (local62.aBoolean215 && arg1) {
				if (arg9 == 0) {
					SceneGraph.aByteArrayArrayArray9[arg2][arg7][arg8 + 1] = 50;
				} else if (arg9 == 1) {
					SceneGraph.aByteArrayArrayArray9[arg2][arg7 + 1][arg8 + 1] = 50;
				} else if (arg9 == 2) {
					SceneGraph.aByteArrayArrayArray9[arg2][arg7 + 1][arg8] = 50;
				} else if (arg9 == 3) {
					SceneGraph.aByteArrayArrayArray9[arg2][arg7][arg8] = 50;
				}
			}
			if (local62.anInt4435 != 0 && arg4 != null) {
				arg4.flagWall(arg9, arg6, local62.aBoolean207, arg8, arg7);
			}
		} else {
			@Pc(1226) int local1226;
			if (arg6 == 2) {
				local1226 = arg9 + 1 & 0x3;
				@Pc(1269) Entity local1269;
				@Pc(1254) Entity local1254;
				if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
					@Pc(1287) Loc_Class139 local1287 = local62.method3428(arg9 + 4, local165, local153, 2, local199, local213, arg1, null, local330, local173);
					if (GlRenderer.enabled && local330) {
						ShadowManager.method4211(local1287.aClass36_Sub1_3, local165, local201, local173);
					}
					local1254 = local1287.aClass8_10;
					local1287 = local62.method3428(local1226, local165, local153, 2, local199, local213, arg1, null, local330, local173);
					if (GlRenderer.enabled && local330) {
						ShadowManager.method4211(local1287.aClass36_Sub1_3, local165, local201, local173);
					}
					local1269 = local1287.aClass8_10;
				} else {
					local1254 = new Loc(arg5, 2, arg9 + 4, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
					local1269 = new Loc(arg5, 2, local1226, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
				}
				SceneGraph.setWall(arg2, arg7, arg8, local199, local1254, local1269, Static267.anIntArray517[arg9], Static267.anIntArray517[local1226], local261);
				if (local62.aBoolean220 && arg1) {
					if (arg9 == 0) {
						SceneGraph.anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x1;
						SceneGraph.anIntArrayArrayArray6[arg2][arg7][arg8 + 1] |= 0x2;
					} else if (arg9 == 1) {
						SceneGraph.anIntArrayArrayArray6[arg2][arg7][arg8 + 1] |= 0x2;
						SceneGraph.anIntArrayArrayArray6[arg2][arg7 + 1][arg8] |= 0x1;
					} else if (arg9 == 2) {
						SceneGraph.anIntArrayArrayArray6[arg2][arg7 + 1][arg8] |= 0x1;
						SceneGraph.anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x2;
					} else if (arg9 == 3) {
						SceneGraph.anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x2;
						SceneGraph.anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x1;
					}
				}
				if (local62.anInt4435 != 0 && arg4 != null) {
					arg4.flagWall(arg9, arg6, local62.aBoolean207, arg8, arg7);
				}
				if (local62.wallDecorOffsetScale != 16) {
					Static18.method559(arg2, arg7, arg8, local62.wallDecorOffsetScale);
				}
			} else if (arg6 == 3) {
				if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
					local403 = local62.method3428(arg9, local165, local153, 3, local199, local213, arg1, null, local330, local173);
					if (GlRenderer.enabled && local330) {
						ShadowManager.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
					}
					local387 = local403.aClass8_10;
				} else {
					local387 = new Loc(arg5, 3, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
				}
				SceneGraph.setWall(arg2, arg7, arg8, local199, local387, null, anIntArray204[arg9], 0, local261);
				if (local62.aBoolean215 && arg1) {
					if (arg9 == 0) {
						SceneGraph.aByteArrayArrayArray9[arg2][arg7][arg8 + 1] = 50;
					} else if (arg9 == 1) {
						SceneGraph.aByteArrayArrayArray9[arg2][arg7 + 1][arg8 + 1] = 50;
					} else if (arg9 == 2) {
						SceneGraph.aByteArrayArrayArray9[arg2][arg7 + 1][arg8] = 50;
					} else if (arg9 == 3) {
						SceneGraph.aByteArrayArrayArray9[arg2][arg7][arg8] = 50;
					}
				}
				if (local62.anInt4435 != 0 && arg4 != null) {
					arg4.flagWall(arg9, arg6, local62.aBoolean207, arg8, arg7);
				}
			} else if (arg6 == 9) {
				if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
					local403 = local62.method3428(arg9, local165, local153, arg6, local199, local213, arg1, null, local330, local173);
					if (GlRenderer.enabled && local330) {
						ShadowManager.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
					}
					local387 = local403.aClass8_10;
				} else {
					local387 = new Loc(arg5, arg6, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
				}
				Static5.method35(arg2, arg7, arg8, local199, 1, 1, local387, local261);
				if (local62.anInt4435 != 0 && arg4 != null) {
					arg4.flagScenery(arg7, local62.aBoolean207, arg8, local84, local81);
				}
				if (local62.wallDecorOffsetScale != 16) {
					Static18.method559(arg2, arg7, arg8, local62.wallDecorOffsetScale);
				}
			} else if (arg6 == 4) {
				if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
					local403 = local62.method3428(arg9, local165, local153, 4, local199, local213, arg1, null, local330, local173);
					if (GlRenderer.enabled && local330) {
						ShadowManager.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
					}
					local387 = local403.aClass8_10;
				} else {
					local387 = new Loc(arg5, 4, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
				}
				Static185.method1880(arg2, arg7, arg8, local199, local387, null, Static267.anIntArray517[arg9], 0, 0, 0, local261);
			} else {
				@Pc(1889) long local1889;
				@Pc(1934) Entity local1934;
				@Pc(1950) Loc_Class139 local1950;
				if (arg6 == 5) {
					local1226 = 16;
					local1889 = SceneGraph.getWallKey(arg2, arg7, arg8);
					if (local1889 != 0L) {
						local1226 = LocTypeList.get(Integer.MAX_VALUE & (int) (local1889 >>> 32)).wallDecorOffsetScale;
					}
					if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
						local1950 = local62.method3428(arg9, local165, local153, 4, local199, local213, arg1, null, local330, local173);
						if (GlRenderer.enabled && local330) {
							ShadowManager.method4211(local1950.aClass36_Sub1_3, local165 - Static34.anIntArray80[arg9] * 8, local201, local173 - SceneGraph.anIntArray469[arg9] * 8);
						}
						local1934 = local1950.aClass8_10;
					} else {
						local1934 = new Loc(arg5, 4, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
					}
					Static185.method1880(arg2, arg7, arg8, local199, local1934, null, Static267.anIntArray517[arg9], 0, local1226 * Static34.anIntArray80[arg9], SceneGraph.anIntArray469[arg9] * local1226, local261);
				} else if (arg6 == 6) {
					local1226 = 8;
					local1889 = SceneGraph.getWallKey(arg2, arg7, arg8);
					if (local1889 != 0L) {
						local1226 = LocTypeList.get(Integer.MAX_VALUE & (int) (local1889 >>> 32)).wallDecorOffsetScale / 2;
					}
					if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
						local1950 = local62.method3428(arg9 + 4, local165, local153, 4, local199, local213, arg1, null, local330, local173);
						if (GlRenderer.enabled && local330) {
							ShadowManager.method4211(local1950.aClass36_Sub1_3, local165 - Static114.anIntArray565[arg9] * 8, local201, local173 - SceneGraph.anIntArray154[arg9] * 8);
						}
						local1934 = local1950.aClass8_10;
					} else {
						local1934 = new Loc(arg5, 4, arg9 + 4, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
					}
					Static185.method1880(arg2, arg7, arg8, local199, local1934, null, 256, arg9, local1226 * Static114.anIntArray565[arg9], local1226 * SceneGraph.anIntArray154[arg9], local261);
				} else if (arg6 == 7) {
					@Pc(2137) int local2137 = arg9 + 2 & 0x3;
					if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
						@Pc(2183) Loc_Class139 local2183 = local62.method3428(local2137 + 4, local165, local153, 4, local199, local213, arg1, null, local330, local173);
						if (GlRenderer.enabled && local330) {
							ShadowManager.method4211(local2183.aClass36_Sub1_3, local165, local201, local173);
						}
						local387 = local2183.aClass8_10;
					} else {
						local387 = new Loc(arg5, 4, local2137 + 4, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
					}
					Static185.method1880(arg2, arg7, arg8, local199, local387, null, 256, local2137, 0, 0, local261);
				} else if (arg6 == 8) {
					local1226 = 8;
					local1889 = SceneGraph.getWallKey(arg2, arg7, arg8);
					if (local1889 != 0L) {
						local1226 = LocTypeList.get(Integer.MAX_VALUE & (int) (local1889 >>> 32)).wallDecorOffsetScale / 2;
					}
					@Pc(2244) int local2244 = arg9 + 2 & 0x3;
					@Pc(2289) Entity local2289;
					if (local62.anInt4430 == -1 && local62.multiLocs == null && !local62.aBoolean214) {
						@Pc(2297) int local2297 = SceneGraph.anIntArray154[arg9] * 8;
						@Pc(2303) int local2303 = Static114.anIntArray565[arg9] * 8;
						@Pc(2319) Loc_Class139 local2319 = local62.method3428(arg9 + 4, local165, local153, 4, local199, local213, arg1, null, local330, local173);
						if (GlRenderer.enabled && local330) {
							ShadowManager.method4211(local2319.aClass36_Sub1_3, local165 - local2303, local201, local173 - local2297);
						}
						local1934 = local2319.aClass8_10;
						local2319 = local62.method3428(local2244 + 4, local165, local153, 4, local199, local213, arg1, null, local330, local173);
						if (GlRenderer.enabled && local330) {
							ShadowManager.method4211(local2319.aClass36_Sub1_3, local165 - local2303, local201, local173 - local2297);
						}
						local2289 = local2319.aClass8_10;
					} else {
						local1934 = new Loc(arg5, 4, arg9 + 4, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
						local2289 = new Loc(arg5, 4, local2244 + 4, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
					}
					Static185.method1880(arg2, arg7, arg8, local199, local1934, local2289, 256, arg9, local1226 * Static114.anIntArray565[arg9], SceneGraph.anIntArray154[arg9] * local1226, local261);
				}
			}
		}
	}
}
