import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!mc", name = "Q", descriptor = "Lclient!na;")
	public static JagString aClass100_724;

	@OriginalMember(owner = "client!mc", name = "S", descriptor = "Lclient!mm;")
	public static SoftwareSprite aClass3_Sub2_Sub1_Sub1_2;

	@OriginalMember(owner = "client!mc", name = "Z", descriptor = "Lclient!ve;")
	public static Js5 aClass153_57;

	@OriginalMember(owner = "client!mc", name = "Y", descriptor = "[Lclient!na;")
	public static final JagString[] aClass100Array112 = new JagString[100];

	@OriginalMember(owner = "client!mc", name = "ab", descriptor = "[I")
	public static final int[] anIntArray351 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!mc", name = "fb", descriptor = "Lclient!na;")
	private static final JagString aClass100_725 = Static28.parse("pt");

	@OriginalMember(owner = "client!mc", name = "mb", descriptor = "Lclient!na;")
	private static final JagString aClass100_726 = Static28.parse("en");

	@OriginalMember(owner = "client!mc", name = "vb", descriptor = "Lclient!na;")
	private static final JagString aClass100_728 = Static28.parse("de");

	@OriginalMember(owner = "client!mc", name = "pb", descriptor = "Lclient!na;")
	private static final JagString aClass100_727 = Static28.parse("fr");

	@OriginalMember(owner = "client!mc", name = "ob", descriptor = "[Lclient!na;")
	public static final JagString[] aClass100Array113 = new JagString[] { aClass100_726, aClass100_728, aClass100_727, aClass100_725 };

	@OriginalMember(owner = "client!mc", name = "tb", descriptor = "S")
	public static short aShort22 = 1;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(III)V")
	public static void method2905(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) DelayedStateChange local14 = Static238.method4143(7, arg0);
		local14.method1017();
		local14.intArg1 = arg1;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2907(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg4 + arg1;
		@Pc(13) int local13 = arg4 + arg6;
		@Pc(15) int local15;
		for (local15 = arg1; local15 < local9; local15++) {
			Static131.method2576(Static71.anIntArrayArray10[local15], arg6, arg5, arg0);
		}
		@Pc(34) int local34 = arg2 - arg4;
		@Pc(39) int local39 = arg5 - arg4;
		for (local15 = arg2; local15 > local34; local15--) {
			Static131.method2576(Static71.anIntArrayArray10[local15], arg6, arg5, arg0);
		}
		for (local15 = local9; local15 <= local34; local15++) {
			@Pc(72) int[] local72 = Static71.anIntArrayArray10[local15];
			Static131.method2576(local72, arg6, local13, arg0);
			Static131.method2576(local72, local13, local39, arg3);
			Static131.method2576(local72, local39, arg5, arg0);
		}
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(B)V")
	public static void method2909() {
		Static6.outboundBuffer.p1isaac(184);
		for (@Pc(18) Class3_Sub31 local18 = (Class3_Sub31) Static119.aClass133_9.method3859(); local18 != null; local18 = (Class3_Sub31) Static119.aClass133_9.method3861()) {
			if (local18.anInt5879 == 0) {
				Static132.method2605(true, local18);
			}
		}
		if (Static39.aClass13_10 != null) {
			Static43.method1143(Static39.aClass13_10);
			Static39.aClass13_10 = null;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)V")
	public static void method2910(@OriginalArg(1) int arg0) {
		@Pc(4) DelayedStateChange local4 = Static238.method4143(8, arg0);
		local4.method1007();
	}
}
