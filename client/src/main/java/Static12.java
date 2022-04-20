import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
	public static int anInt406;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "[[[B")
	public static final byte[][][] aByteArrayArrayArray2 = new byte[4][104][104];

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "Lclient!na;")
	public static final JagString aClass100_73 = Static28.parse("runes");

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	public static int anInt391 = 255;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "[[B")
	public static final byte[][] aByteArrayArray2 = new byte[250][];

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "Lclient!na;")
	public static final JagString aClass100_74 = Static28.parse("::");

	@OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
	public static int anInt400 = 0;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	public static void method447() {
		if (Static83.aFloat3 < Static138.aFloat14) {
			Static83.aFloat3 = (float) ((double) Static83.aFloat3 + (double) Static83.aFloat3 / 30.0D);
			if (Static138.aFloat14 < Static83.aFloat3) {
				Static83.aFloat3 = Static138.aFloat14;
			}
			Static38.method965();
		} else if (Static138.aFloat14 < Static83.aFloat3) {
			Static83.aFloat3 = (float) ((double) Static83.aFloat3 - (double) Static83.aFloat3 / 30.0D);
			if (Static138.aFloat14 > Static83.aFloat3) {
				Static83.aFloat3 = Static138.aFloat14;
			}
			Static38.method965();
		}
		if (Static142.anInt3482 == -1 || Static217.anInt4901 == -1) {
			return;
		}
		@Pc(60) int local60 = Static142.anInt3482 - Static13.anInt435;
		if (local60 < 2 || local60 > 2) {
			local60 >>= 0x4;
		}
		@Pc(78) int local78 = Static217.anInt4901 - Static28.anInt919;
		if (local78 < 2 || local78 > 2) {
			local78 >>= 0x4;
		}
		Static28.anInt919 -= -local78;
		Static13.anInt435 += local60;
		if (local60 == 0 && local78 == 0) {
			Static142.anInt3482 = -1;
			Static217.anInt4901 = -1;
		}
		Static38.method965();
	}

}
