package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!kl", name = "u", descriptor = "Lclient!na;")
	public static final JagString aClass100_637 = JagString.parse("<col=ffffff>");
	@OriginalMember(owner = "client!ol", name = "Y", descriptor = "Lclient!na;")
	public static final JagString aClass100_819 = JagString.parse("<col=00ff80>");
	@OriginalMember(owner = "client!ib", name = "g", descriptor = "Lclient!na;")
	public static final JagString aClass100_559 = JagString.parse("<col=ffff00>");
	@OriginalMember(owner = "client!jj", name = "m", descriptor = "Lclient!na;")
	public static final JagString aClass100_594 = JagString.parse("<)4col>");

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIII)I")
	public static int method1286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(10) int local10 = arg4;
			arg4 = arg3;
			arg3 = local10;
		}
		@Pc(18) int local18 = arg1 & 0x3;
		if (local18 == 0) {
			return arg5;
		} else if (local18 == 1) {
			return arg0;
		} else if (local18 == 2) {
			return 7 + 1 - arg5 - arg4;
		} else {
			return 7 + 1 - arg0 - arg3;
		}
	}

}
