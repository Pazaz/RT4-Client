import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!oj", name = "t", descriptor = "[I")
	public static int[] anIntArray372;

	@OriginalMember(owner = "client!oj", name = "E", descriptor = "[[Lclient!hg;")
	public static GlTile[][] aClass3_Sub14ArrayArray2;

	@OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
	public static final int anInt4306 = 2301979;

	@OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
	public static int anInt4311 = -2;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "[Z")
	public static final boolean[] aBooleanArray97 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZIJI)Lclient!na;")
	public static JagString valueToBase10String(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(9) JagString local9 = Static87.allocate(0);
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
		@Pc(59) JagString local59 = Static87.allocate(0);
		@Pc(61) int local61;
		for (local61 = 0; local61 < arg2; local61++) {
			local59.method3113(Static123.parseInt((int) (arg3 % 10L)));
			arg3 /= 10L;
		}
		local61 = 0;
		@Pc(137) JagString local137;
		if (arg3 == 0L) {
			local137 = Static6.aClass100_17;
		} else {
			@Pc(95) JagString local95 = Static87.allocate(0);
			while (arg3 > 0L) {
				if (arg1 && local61 != 0 && local61 % 3 == 0) {
					local95.method3113(local26);
				}
				local95.method3113(Static123.parseInt((int) (arg3 % 10L)));
				local61++;
				arg3 /= 10L;
			}
			local137 = local95;
		}
		if (local59.length() > 0) {
			local59.method3113(local28);
		}
		return JagString.concatenate(new JagString[] { local9, local137.method3124(), local59.method3124() });
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBI[[III)I")
	public static int method3361(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(25) int local25 = arg0 * arg2[arg3 + 1][arg1] + (128 - arg0) * arg2[arg3][arg1] >> 7;
		@Pc(52) int local52 = arg2[arg3][arg1 + 1] * (128 - arg0) + arg2[arg3 + 1][arg1 + 1] * arg0 >> 7;
		return local25 * (128 - arg4) + arg4 * local52 >> 7;
	}
}
