package rt4;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;
import java.net.Socket;

public class CreateManager {
    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int step = 0;
    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int loops = 0;
    @OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
    public static int errors = 0;
    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    public static int reply = -2;
    @OriginalMember(owner = "client!si", name = "S", descriptor = "[Lclient!na;")
	public static JagString[] suggestedNames;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(B)V")
    public static void loop() {
        if (step == 0) {
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
                step = 1;
                loops = 0;
                errors++;
                if (client.port == client.defaultPort) {
                    client.port = client.alternatePort;
                } else {
                    client.port = client.defaultPort;
                }
            }
            if (step == 1) {
                Protocol.socketRequest = GameShell.signLink.openSocket(client.hostname, client.port);
                step = 2;
            }
            @Pc(120) int local120;
            if (step == 2) {
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
                local120 = Protocol.socket.read();
                if (client.musicChannel != null) {
                    client.musicChannel.method3571();
                }
                if (client.soundChannel != null) {
                    client.soundChannel.method3571();
                }
                if (local120 != 21) {
                    reply = local120;
                    step = 0;
                    Protocol.socket.close();
                    Protocol.socket = null;
                    return;
                }
                step = 3;
            }
            if (step == 3) {
                if (Protocol.socket.available() < 1) {
                    return;
                }
                suggestedNames = new JagString[Protocol.socket.read()];
                step = 4;
            }
            if (step == 4) {
                if (Protocol.socket.available() < suggestedNames.length * 8) {
                    return;
                }
                Protocol.inboundBuffer.offset = 0;
                Protocol.socket.read(0, suggestedNames.length * 8, Protocol.inboundBuffer.data);
                for (local120 = 0; local120 < suggestedNames.length; local120++) {
                    suggestedNames[local120] = Base37.decode37(Protocol.inboundBuffer.g8());
                }
                reply = 21;
                step = 0;
                Protocol.socket.close();
                Protocol.socket = null;
                return;
            }
        } catch (@Pc(238) IOException local238) {
            if (Protocol.socket != null) {
                Protocol.socket.close();
                Protocol.socket = null;
            }
            if (errors < 1) {
                errors++;
                if (client.defaultPort == client.port) {
                    client.port = client.alternatePort;
                } else {
                    client.port = client.defaultPort;
                }
                loops = 0;
                step = 1;
            } else {
                reply = -4;
                step = 0;
            }
        }
    }
}
