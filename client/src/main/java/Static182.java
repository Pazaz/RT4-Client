import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!oj", name = "t", descriptor = "[I")
	public static int[] anIntArray372;

	@OriginalMember(owner = "client!oj", name = "x", descriptor = "Lclient!ve;")
	public static Js5 aClass153_77;

	@OriginalMember(owner = "client!oj", name = "E", descriptor = "[[Lclient!hg;")
	public static Class3_Sub14[][] aClass3_Sub14ArrayArray2;

	@OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
	public static final int anInt4306 = 2301979;

	@OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
	public static int anInt4311 = -2;

	@OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
	public static int keyQueueSize = 0;

	@OriginalMember(owner = "client!oj", name = "z", descriptor = "[Z")
	public static final boolean[] aBooleanArray97 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BZLclient!rk;)V")
	public static void method3359(@OriginalArg(1) boolean arg0, @OriginalArg(2) Font arg1) {
		@Pc(9) int local9;
		if (GlRenderer.enabled || arg0) {
			local9 = Static254.anInt5554;
			@Pc(15) int local15 = local9 * 956 / 503;
			Static78.aClass3_Sub2_Sub1_3.method1419((Static48.anInt1448 - local15) / 2, 0, local15, local9);
			Static243.aClass36_1.method3336(Static48.anInt1448 / 2 - Static243.aClass36_1.anInt4270 / 2, 18);
		}
		arg1.method2875(LocalizedText.GAME0_LOADING, Static48.anInt1448 / 2, Static254.anInt5554 / 2 - 26, 16777215, -1);
		local9 = Static254.anInt5554 / 2 - 18;
		if (GlRenderer.enabled) {
			Static46.method1179(Static48.anInt1448 / 2 - 152, local9, 304, 34, 9179409);
			Static46.method1179(Static48.anInt1448 / 2 - 151, local9 - -1, 302, 32, 0);
			Static46.method1186(Static48.anInt1448 / 2 - 150, local9 + 2, Static199.anInt4670 * 3, 30, 9179409);
			Static46.method1186(Static48.anInt1448 / 2 + Static199.anInt4670 * 3 - 150, local9 + 2, 300 - Static199.anInt4670 * 3, 30, 0);
		} else {
			Static129.method2483(Static48.anInt1448 / 2 - 152, local9, 304, 34, 9179409);
			Static129.method2483(Static48.anInt1448 / 2 - 151, local9 + 1, 302, 32, 0);
			Static129.method2495(Static48.anInt1448 / 2 - 150, local9 + 2, Static199.anInt4670 * 3, 30, 9179409);
			Static129.method2495(Static199.anInt4670 * 3 + Static48.anInt1448 / 2 - 150, local9 + 2, 300 - Static199.anInt4670 * 3, 30, 0);
		}
		arg1.method2875(Static126.aClass100_602, Static48.anInt1448 / 2, Static254.anInt5554 / 2 + 4, 16777215, -1);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZIJI)Lclient!na;")
	public static JagString method3360(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(9) JagString local9 = Static87.method1804(0);
		if (arg3 < 0L) {
			arg3 = -arg3;
			local9.method3113(Static73.aClass100_453);
		}
		@Pc(26) JagString local26 = Static244.aClass100_1017;
		@Pc(28) JagString local28 = Static30.aClass100_185;
		if (arg0 == 1) {
			local26 = Static30.aClass100_185;
			local28 = Static244.aClass100_1017;
		}
		if (arg0 == 2) {
			local28 = Static244.aClass100_1017;
			local26 = Static26.aClass100_160;
		}
		if (arg0 == 3) {
			local26 = Static30.aClass100_185;
			local28 = Static244.aClass100_1017;
		}
		@Pc(59) JagString local59 = Static87.method1804(0);
		@Pc(61) int local61;
		for (local61 = 0; local61 < arg2; local61++) {
			local59.method3113(Static123.method2423((int) (arg3 % 10L)));
			arg3 /= 10L;
		}
		local61 = 0;
		@Pc(137) JagString local137;
		if (arg3 == 0L) {
			local137 = Static6.aClass100_17;
		} else {
			@Pc(95) JagString local95 = Static87.method1804(0);
			while (arg3 > 0L) {
				if (arg1 && local61 != 0 && local61 % 3 == 0) {
					local95.method3113(local26);
				}
				local95.method3113(Static123.method2423((int) (arg3 % 10L)));
				local61++;
				arg3 /= 10L;
			}
			local137 = local95;
		}
		if (local59.length() > 0) {
			local59.method3113(local28);
		}
		return Static34.method882(new JagString[] { local9, local137.method3124(), local59.method3124() });
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBI[[III)I")
	public static int method3361(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(25) int local25 = arg0 * arg2[arg3 + 1][arg1] + (128 - arg0) * arg2[arg3][arg1] >> 7;
		@Pc(52) int local52 = arg2[arg3][arg1 + 1] * (128 - arg0) + arg2[arg3 + 1][arg1 + 1] * arg0 >> 7;
		return local25 * (128 - arg4) + arg4 * local52 >> 7;
	}
}
