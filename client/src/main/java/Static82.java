import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "Lclient!na;")
	private static final JagString aClass100_479 = Static28.method790("Unable to find ");

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "Lclient!na;")
	public static JagString aClass100_478 = aClass100_479;

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
	public static int anInt2231 = 0;

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "Lclient!na;")
	public static final JagString aClass100_480 = Static28.method790("clignotant3:");

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "Lclient!na;")
	public static final JagString aClass100_481 = Static28.method790("blaugr-Un:");

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "Lclient!na;")
	public static final JagString aClass100_482 = Static28.method790("Chargement de la liste des serveurs");

	@OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
	public static int anInt2252 = 0;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIB)V")
	public static void method1760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 - arg0 >= Static172.anInt4164 && Static224.anInt5063 >= arg0 + arg1 && arg3 - arg0 >= Static267.anInt5773 && Static106.anInt2869 >= arg0 + arg3) {
			Static49.method1206(arg1, arg0, arg2, arg3);
		} else {
			Static89.method1843(arg2, arg3, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)Lclient!qf;")
	public static Sprite method1764() {
		@Pc(9) byte[] local9 = Static7.aByteArrayArray5[0];
		@Pc(17) int local17 = Static254.anIntArray488[0] * Static26.anIntArray66[0];
		@Pc(20) int[] local20 = new int[local17];
		for (@Pc(28) int local28 = 0; local28 < local17; local28++) {
			local20[local28] = Static259.anIntArray513[local9[local28] & 0xFF];
		}
		@Pc(69) Sprite local69;
		if (Static239.aBoolean269) {
			local69 = new GlSprite(Static124.anInt3080, Static227.anInt5091, Static274.anIntArray440[0], Static269.anIntArray252[0], Static254.anIntArray488[0], Static26.anIntArray66[0], local20);
		} else {
			local69 = new SoftwareSprite(Static124.anInt3080, Static227.anInt5091, Static274.anIntArray440[0], Static269.anIntArray252[0], Static254.anIntArray488[0], Static26.anIntArray66[0], local20);
		}
		Static75.method1631();
		return local69;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!jl;)V")
	public static void method1767(@OriginalArg(1) Class3_Sub19 arg0) {
		Static88.method1818(200000, arg0);
	}
}
