package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "Lclient!na;")
    public static final JagString aClass100_1017 = JagString.parse(")1");
    @OriginalMember(owner = "client!cg", name = "h", descriptor = "Lclient!na;")
    public static final JagString aClass100_185 = JagString.parse(")3");
    @OriginalMember(owner = "client!oj", name = "t", descriptor = "[I")
	public static int[] anIntArray372;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
	public static int anInt4311 = -2;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "[Z")
	public static final boolean[] aBooleanArray97 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBI[[III)I")
	public static int method3361(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(25) int local25 = arg0 * arg2[arg3 + 1][arg1] + (128 - arg0) * arg2[arg3][arg1] >> 7;
		@Pc(52) int local52 = arg2[arg3][arg1 + 1] * (128 - arg0) + arg2[arg3 + 1][arg1 + 1] * arg0 >> 7;
		return local25 * (128 - arg4) + arg4 * local52 >> 7;
	}
}
