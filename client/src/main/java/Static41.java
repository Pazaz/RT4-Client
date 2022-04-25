import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "Lclient!na;")
	public static final JagString aClass100_266 = JagString.parse("<col=c0ff00>");

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "Lclient!na;")
	private static final JagString aClass100_267 = JagString.parse("wave:");

	@OriginalMember(owner = "client!dc", name = "M", descriptor = "Lclient!na;")
	public static final JagString aClass100_268 = JagString.parse(")4");

	@OriginalMember(owner = "client!dc", name = "R", descriptor = "Lclient!na;")
	private static final JagString aClass100_269 = JagString.parse("Drop");

	@OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
	public static volatile int anInt1313 = 0;

	@OriginalMember(owner = "client!dc", name = "ab", descriptor = "I")
	public static int anInt1316 = 0;

	@OriginalMember(owner = "client!dc", name = "db", descriptor = "[[B")
	public static final byte[][] aByteArrayArray6 = new byte[50][];

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)V")
	public static void method1050() {
		@Pc(6) int local6 = Protocol.inboundBuffer.method2238(8);
		@Pc(20) int local20;
		if (Static267.anInt5774 > local6) {
			for (local20 = local6; local20 < Static267.anInt5774; local20++) {
				Static52.anIntArray136[Static240.anInt5335++] = Static105.anIntArray256[local20];
			}
		}
		if (local6 > Static267.anInt5774) {
			throw new RuntimeException("gppov1");
		}
		Static267.anInt5774 = 0;
		for (local20 = 0; local20 < local6; local20++) {
			@Pc(75) int local75 = Static105.anIntArray256[local20];
			@Pc(79) Player local79 = Static159.players[local75];
			@Pc(84) int local84 = Protocol.inboundBuffer.method2238(1);
			if (local84 == 0) {
				Static105.anIntArray256[Static267.anInt5774++] = local75;
				local79.anInt3430 = Static83.loop;
			} else {
				@Pc(107) int local107 = Protocol.inboundBuffer.method2238(2);
				if (local107 == 0) {
					Static105.anIntArray256[Static267.anInt5774++] = local75;
					local79.anInt3430 = Static83.loop;
					Static44.anIntArray106[Static116.anInt2951++] = local75;
				} else {
					@Pc(153) int local153;
					@Pc(163) int local163;
					if (local107 == 1) {
						Static105.anIntArray256[Static267.anInt5774++] = local75;
						local79.anInt3430 = Static83.loop;
						local153 = Protocol.inboundBuffer.method2238(3);
						local79.method2684(1, local153);
						local163 = Protocol.inboundBuffer.method2238(1);
						if (local163 == 1) {
							Static44.anIntArray106[Static116.anInt2951++] = local75;
						}
					} else if (local107 == 2) {
						Static105.anIntArray256[Static267.anInt5774++] = local75;
						local79.anInt3430 = Static83.loop;
						if (Protocol.inboundBuffer.method2238(1) == 1) {
							local153 = Protocol.inboundBuffer.method2238(3);
							local79.method2684(2, local153);
							local163 = Protocol.inboundBuffer.method2238(3);
							local79.method2684(2, local163);
						} else {
							local153 = Protocol.inboundBuffer.method2238(3);
							local79.method2684(0, local153);
						}
						local153 = Protocol.inboundBuffer.method2238(1);
						if (local153 == 1) {
							Static44.anIntArray106[Static116.anInt2951++] = local75;
						}
					} else if (local107 == 3) {
						Static52.anIntArray136[Static240.anInt5335++] = local75;
					}
				}
			}
		}
	}
}
