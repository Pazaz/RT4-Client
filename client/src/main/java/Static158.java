import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
	public static int anInt3846;

	@OriginalMember(owner = "client!mh", name = "hb", descriptor = "Lclient!bn;")
	public static Map aClass3_Sub2_Sub4_3;

	@OriginalMember(owner = "client!mh", name = "X", descriptor = "I")
	public static int anInt3851 = -1;

	@OriginalMember(owner = "client!mh", name = "Y", descriptor = "Z")
	public static boolean aBoolean187 = false;

	@OriginalMember(owner = "client!mh", name = "eb", descriptor = "I")
	public static int anInt3857 = 0;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "(B)V")
	public static void method3008() {
		if (Static179.anInt4261 == 0) {
			return;
		}
		try {
			if (++Static226.anInt5079 > 2000) {
				if (Static124.socket != null) {
					Static124.socket.method2834();
					Static124.socket = null;
				}
				if (Static57.anInt1758 >= 1) {
					Static223.anInt5034 = -5;
					Static179.anInt4261 = 0;
					return;
				}
				Static179.anInt4261 = 1;
				Static226.anInt5079 = 0;
				Static57.anInt1758++;
				if (Static209.port == Static271.defaultPort) {
					Static209.port = Static55.alternatePort;
				} else {
					Static209.port = Static271.defaultPort;
				}
			}
			if (Static179.anInt4261 == 1) {
				Static72.aClass212_3 = Static71.signLink.openSocket(Static60.hostname, Static209.port);
				Static179.anInt4261 = 2;
			}
			@Pc(120) int local120;
			if (Static179.anInt4261 == 2) {
				if (Static72.aClass212_3.status == 2) {
					throw new IOException();
				}
				if (Static72.aClass212_3.status != 1) {
					return;
				}
				Static124.socket = new BufferedSocket((Socket) Static72.aClass212_3.result, Static71.signLink);
				Static72.aClass212_3 = null;
				Static124.socket.write(Static6.outboundBuffer.data, Static6.outboundBuffer.offset);
				if (Static11.aClass62_1 != null) {
					Static11.aClass62_1.method3571();
				}
				if (Static147.aClass62_2 != null) {
					Static147.aClass62_2.method3571();
				}
				local120 = Static124.socket.read();
				if (Static11.aClass62_1 != null) {
					Static11.aClass62_1.method3571();
				}
				if (Static147.aClass62_2 != null) {
					Static147.aClass62_2.method3571();
				}
				if (local120 != 21) {
					Static223.anInt5034 = local120;
					Static179.anInt4261 = 0;
					Static124.socket.method2834();
					Static124.socket = null;
					return;
				}
				Static179.anInt4261 = 3;
			}
			if (Static179.anInt4261 == 3) {
				if (Static124.socket.available() < 1) {
					return;
				}
				Static229.aClass100Array156 = new JagString[Static124.socket.read()];
				Static179.anInt4261 = 4;
			}
			if (Static179.anInt4261 == 4) {
				if (Static124.socket.available() < Static229.aClass100Array156.length * 8) {
					return;
				}
				Static57.aClass3_Sub15_Sub1_3.offset = 0;
				Static124.socket.method2827(0, Static229.aClass100Array156.length * 8, Static57.aClass3_Sub15_Sub1_3.data);
				for (local120 = 0; local120 < Static229.aClass100Array156.length; local120++) {
					Static229.aClass100Array156[local120] = Static79.decode37(Static57.aClass3_Sub15_Sub1_3.g8());
				}
				Static223.anInt5034 = 21;
				Static179.anInt4261 = 0;
				Static124.socket.method2834();
				Static124.socket = null;
				return;
			}
		} catch (@Pc(238) IOException local238) {
			if (Static124.socket != null) {
				Static124.socket.method2834();
				Static124.socket = null;
			}
			if (Static57.anInt1758 < 1) {
				Static57.anInt1758++;
				if (Static271.defaultPort == Static209.port) {
					Static209.port = Static55.alternatePort;
				} else {
					Static209.port = Static271.defaultPort;
				}
				Static226.anInt5079 = 0;
				Static179.anInt4261 = 1;
			} else {
				Static223.anInt5034 = -4;
				Static179.anInt4261 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)V")
	public static void method3010() {
		Static110.aClass99_15.method3102(5);
	}

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "(B)V")
	public static void method3013() {
		@Pc(10) int local10 = Static191.aByteArrayArray15.length;
		for (@Pc(16) int local16 = 0; local16 < local10; local16++) {
			if (Static191.aByteArrayArray15[local16] != null) {
				@Pc(25) int local25 = -1;
				for (@Pc(27) int local27 = 0; local27 < Static157.anInt3811; local27++) {
					if (Static217.anIntArray434[local27] == Static238.anIntArray470[local16]) {
						local25 = local27;
						break;
					}
				}
				if (local25 == -1) {
					Static217.anIntArray434[Static157.anInt3811] = Static238.anIntArray470[local16];
					local25 = Static157.anInt3811++;
				}
				@Pc(67) int local67 = 0;
				@Pc(74) Buffer local74 = new Buffer(Static191.aByteArrayArray15[local16]);
				while (local74.offset < Static191.aByteArrayArray15[local16].length && local67 < 511) {
					@Pc(97) int local97 = local67++ << 6 | local25;
					@Pc(103) int local103 = local74.g2();
					@Pc(107) int local107 = local103 >> 14;
					@Pc(113) int local113 = local103 >> 7 & 0x3F;
					@Pc(125) int local125 = local113 + (Static238.anIntArray470[local16] >> 8) * 64 - Static225.originX;
					@Pc(129) int local129 = local103 & 0x3F;
					@Pc(142) int local142 = local129 + (Static238.anIntArray470[local16] & 0xFF) * 64 - Static142.originZ;
					@Pc(148) NpcType local148 = Static214.method4363(local74.g2());
					if (Static175.aClass8_Sub4_Sub2Array1[local97] == null && (local148.aByte10 & 0x1) > 0 && local107 == Static41.anInt1316 && local125 >= 0 && local148.anInt3713 + local125 < 104 && local142 >= 0 && local142 + local148.anInt3713 < 104) {
						Static175.aClass8_Sub4_Sub2Array1[local97] = new Npc();
						@Pc(198) Npc local198 = Static175.aClass8_Sub4_Sub2Array1[local97];
						Static33.anIntArray79[Static272.anInt5214++] = local97;
						local198.anInt3430 = Static83.anInt372;
						local198.method2698(local148);
						local198.method2692(local198.aClass96_1.anInt3713);
						local198.anInt3400 = local198.anInt3381 = Static56.anIntArray141[local198.aClass96_1.aByte11];
						local198.anInt3376 = local198.aClass96_1.anInt3733;
						if (local198.anInt3376 == 0) {
							local198.anInt3381 = 0;
						}
						local198.anInt3365 = local198.aClass96_1.anInt3737;
						local198.method2683(local198.method2693(), local125, local142, true);
					}
				}
			}
		}
	}
}
