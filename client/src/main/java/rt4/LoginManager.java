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
                Protocol.outboundBuffer.encryptRsa(GlobalConfig.RSA_EXPONENT, GlobalConfig.RSA_MODULUS);
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
                buffer.p2(Protocol.outboundBuffer.offset + Buffer.getStringLength(client.settings) + (159 + offset));
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
                buffer.pBytes(Protocol.outboundBuffer.data, Protocol.outboundBuffer.offset);
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
            local43.encryptRsa(GlobalConfig.RSA_EXPONENT, GlobalConfig.RSA_MODULUS);
            Protocol.outboundBuffer.offset = 0;
            Protocol.outboundBuffer.p1(210);
            Protocol.outboundBuffer.p1(local43.offset);
            Protocol.outboundBuffer.pBytes(local43.data, local43.offset);
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
            PathFinder.collisionMaps[local19].resetFlags();
        }
        WorldMap.clear(false);
        System.gc();
        MidiPlayer.method801();
        MidiPlayer.jingle = false;
        MusicPlayer.groupId = -1;
        AreaSoundManager.clear(true);
        Static230.dynamicMapRegion = false;
        Camera.originZ = 0;
        centralZoneX = 0;
        centralZoneZ = 0;
        Camera.originX = 0;
        for (local19 = 0; local19 < Static143.hintMapMarkers.length; local19++) {
            Static143.hintMapMarkers[local19] = null;
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
        Static73.method1596(true);
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
        for (@Pc(451) SceneryStack local451 = (SceneryStack) Static26.sceneryList.head(); local451 != null; local451 = (SceneryStack) Static26.sceneryList.next()) {
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
        SoundPlayer.anInt4451 = 0;
        if (mapFlagX != 0) {
            mapFlagZ -= local81;
            mapFlagX -= local86;
        }
        if (GlRenderer.enabled && arg4 && (Math.abs(local86) > 104 || Math.abs(local81) > 104)) {
            Static103.setInstantFade();
        }
        Static107.anInt2875 = -1;
        Static99.aClass69_64.clear();
        Static217.aClass69_116.clear();
    }
}
