package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!og", name = "b", descriptor = "I")
	public static int anInt4264;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "Lclient!be;")
	public static Component aClass13_22;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "[Lclient!na;")
	public static JagString[] stringLocals;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BIILclient!fe;III)V")
	public static void method3326(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) PathingEntity arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static198.method1026(arg5, arg1, arg2.zFine, arg4, arg0, arg2.xFine, arg3);
	}

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V")
	public static void method3328(@OriginalArg(0) int arg0) {
		@Pc(12) DelayedStateChange local12 = Static238.method4143(10, arg0);
		local12.pushClient();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)I")
	public static int method3330(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(21) int local21 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local21;
		}
		return arg1;
	}
}
