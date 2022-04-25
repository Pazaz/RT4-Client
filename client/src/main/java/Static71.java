import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
	public static int anInt1885;

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray10;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "[I")
	public static final int[] anIntArray147 = new int[14];

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "([BIZ)I")
	public static int method1442(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static169.crc32(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
	public static void method1444() {
		for (@Pc(7) int local7 = -1; local7 < Static267.anInt5774; local7++) {
			@Pc(21) int local21;
			if (local7 == -1) {
				local21 = 2047;
			} else {
				local21 = Static105.anIntArray256[local7];
			}
			@Pc(31) Player local31 = Static159.players[local21];
			if (local31 != null) {
				Static263.method4514(local31.getSize(), local31);
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
	public static void transmitVerifyId() {
		Protocol.outboundBuffer.p1isaac(177);
		Protocol.outboundBuffer.p2(Protocol.verifyId);
	}
}
