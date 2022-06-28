package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class StringUtils {
	@OriginalMember(owner = "client!ag", name = "ab", descriptor = "Lclient!na;")
	public static final JagString aClass100_17 = JagString.parse("0");
	@OriginalMember(owner = "client!ca", name = "cb", descriptor = "Lclient!na;")
	public static final JagString nonBreakingSpace = JagString.getNbsp();
	@OriginalMember(owner = "client!rm", name = "i", descriptor = "Lclient!na;")
	public static final JagString ASTERISK = JagString.parse("(Z");
	@OriginalMember(owner = "client!fm", name = "W", descriptor = "Lclient!na;")
	public static final JagString aClass100_453 = JagString.parse(")2");
	@OriginalMember(owner = "client!cg", name = "h", descriptor = "Lclient!na;")
	public static final JagString aClass100_185 = JagString.parse(")3");
	@OriginalMember(owner = "client!tl", name = "i", descriptor = "Lclient!na;")
	public static final JagString aClass100_1017 = JagString.parse(")1");

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)Lclient!na;")
	public static JagString toString(@OriginalArg(0) int arg0) {
		return arg0 >= 999999999 ? ASTERISK : JagString.parseInt(arg0);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZIJI)Lclient!na;")
	public static JagString formatNumber(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(9) JagString local9 = JagString.allocate(0);
		if (arg3 < 0L) {
			arg3 = -arg3;
			local9.method3113(aClass100_453);
		}
		@Pc(26) JagString local26 = aClass100_1017;
		@Pc(28) JagString local28 = aClass100_185;
		if (arg0 == 1) {
			local26 = aClass100_185;
			local28 = aClass100_1017;
		}
		if (arg0 == 2) {
			local28 = aClass100_1017;
			local26 = nonBreakingSpace;
		}
		if (arg0 == 3) {
			local26 = aClass100_185;
			local28 = aClass100_1017;
		}
		@Pc(59) JagString local59 = JagString.allocate(0);
		@Pc(61) int local61;
		for (local61 = 0; local61 < arg2; local61++) {
			local59.method3113(JagString.parseInt((int) (arg3 % 10L)));
			arg3 /= 10L;
		}
		local61 = 0;
		@Pc(137) JagString local137;
		if (arg3 == 0L) {
			local137 = aClass100_17;
		} else {
			@Pc(95) JagString local95 = JagString.allocate(0);
			while (arg3 > 0L) {
				if (arg1 && local61 != 0 && local61 % 3 == 0) {
					local95.method3113(local26);
				}
				local95.method3113(JagString.parseInt((int) (arg3 % 10L)));
				local61++;
				arg3 /= 10L;
			}
			local137 = local95;
		}
		if (local59.length() > 0) {
			local59.method3113(local28);
		}
		return JagString.concatenate(new JagString[]{local9, local137.method3124(), local59.method3124()});
	}
}
