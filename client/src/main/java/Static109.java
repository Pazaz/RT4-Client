import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
	public static int anInt2882;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
	public static int anInt2883;

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
	public static int anInt2884;

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
	public static int anInt2886;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
	public static void method2274() {
		for (@Pc(7) int local7 = 0; local7 < Static272.anInt5214; local7++) {
			@Pc(18) int local18 = Static33.anIntArray79[local7];
			@Pc(22) Npc local22 = NpcList.npcs[local18];
			if (local22 != null) {
				Static263.method4514(local22.type.soze, local22);
			}
		}
	}

}
