import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

    @OriginalMember(owner = "client!gm", name = "R", descriptor = "I")
	public static int anInt2293 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!gm", name = "W", descriptor = "Lclient!na;")
	public static final JagString aClass100_488 = JagString.parse("_");

    @OriginalMember(owner = "client!gm", name = "gb", descriptor = "[I")
	public static final int[] anIntArray211 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "(B)V")
	public static void setInstantFade() {
		Static222.instantScreenFade = true;
	}

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "(I)V")
	public static void method1800() {
		Static116.anInt2951 = 0;
		Static240.anInt5335 = 0;
		Static49.method1202();
		Static278.method4645();
		Static234.method4014();
		@Pc(19) int local19;
		for (local19 = 0; local19 < Static240.anInt5335; local19++) {
			@Pc(30) int local30 = Static52.anIntArray136[local19];
			if (Static175.npcs[local30].anInt3430 != Static83.loop) {
				if (Static175.npcs[local30].type.hasAreaSound()) {
					Static91.method1877(Static175.npcs[local30]);
				}
				Static175.npcs[local30].method2698(null);
				Static175.npcs[local30] = null;
			}
		}
		if (Protocol.length != Protocol.inboundBuffer.offset) {
			throw new RuntimeException("gnp1 pos:" + Protocol.inboundBuffer.offset + " psize:" + Protocol.length);
		}
		for (local19 = 0; local19 < Static272.anInt5214; local19++) {
			if (Static175.npcs[Static33.anIntArray79[local19]] == null) {
				throw new RuntimeException("gnp2 pos:" + local19 + " size:" + Static272.anInt5214);
			}
		}
	}
}
