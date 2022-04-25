import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;
import java.net.Socket;

public class WorldList {
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
    public static Class32[] countries;
    @OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
    public static int minId;
    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
	public static int maxId;
    @OriginalMember(owner = "client!pl", name = "a", descriptor = "[Lclient!ba;")
    public static World[] worlds;
    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    public static int errors = 0;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)I")
    public static int fetch() {
        try {
            if (step == 0) {
                if (MonotonicClock.currentTimeMillis() - 5000L < closeTime) {
                    return 0;
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
                    @Pc(247) World local247 = Static54.getWorld(local240);
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
        @Pc(9) int countryCount = buffer.gSmart1or2();
        countries = new Class32[countryCount];
        @Pc(14) int i;
        for (i = 0; i < countryCount; i++) {
            countries[i] = new Class32();
            countries[i].flag = buffer.gSmart1or2();
            countries[i].name = buffer.gjstr2();
        }
        minId = buffer.gSmart1or2();
        maxId = buffer.gSmart1or2();
        size = buffer.gSmart1or2();
        worlds = new World[maxId + 1 - minId];
        for (i = 0; i < size; i++) {
            @Pc(77) int offset = buffer.gSmart1or2();
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
            @Pc(18) int local18 = arg0.gSmart1or2();
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
        return sorted.length > Static51.worldPos ? sorted[Static51.worldPos++] : null;
    }
}
