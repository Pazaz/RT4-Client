package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class StringUtils {
	@OriginalMember(owner = "client!ag", name = "ab", descriptor = "Lclient!na;")
	public static final JagString aClass100_17 = JagString.parse("0");
	@OriginalMember(owner = "client!ca", name = "cb", descriptor = "Lclient!na;")
	public static final JagString nonBreakingSpace = JagString.getNbsp();

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)Z")
	public static boolean isAlphaNumeric(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)Z")
	public static boolean isLetter(@OriginalArg(0) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "(II)Z")
	public static boolean isDigit(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(II)Z")
	public static boolean isValidChar(@OriginalArg(1) int arg0) {
		if (arg0 >= 32 && arg0 <= 126) {
			return true;
		} else if (arg0 >= 160 && arg0 <= 255) {
			return true;
		} else {
			return arg0 == 128 || arg0 == 140 || arg0 == 151 || arg0 == 156 || arg0 == 159;
		}
	}

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)Lclient!na;")
    public static JagString method4510(@OriginalArg(0) int arg0) {
        return arg0 >= 999999999 ? Static220.aClass100_930 : JagString.parseInt(arg0);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)I")
    public static int toUpperCase(@OriginalArg(0) int c) {
        if (c >= 97 && c <= 122 || c >= 224 && c <= 254 && c != 247) {
            return c - 32;
        } else if (c == 255) {
            return 159;
        } else if (c == 156) {
            return 140;
        } else {
            return c;
        }
    }

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(II)I")
	public static int toLowerCase(@OriginalArg(1) int c) {
		if (c >= 65 && c <= 90 || c >= 192 && c <= 222 && c != 215) {
			return c + 32;
		} else if (c == 159) {
			return 255;
		} else if (c == 140) {
			return 156;
		} else {
			return c;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZIJI)Lclient!na;")
	public static JagString formatNumber(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(9) JagString local9 = Static87.allocate(0);
		if (arg3 < 0L) {
			arg3 = -arg3;
			local9.method3113(Static73.aClass100_453);
		}
		@Pc(26) JagString local26 = Static182.aClass100_1017;
		@Pc(28) JagString local28 = Static182.aClass100_185;
		if (arg0 == 1) {
			local26 = Static182.aClass100_185;
			local28 = Static182.aClass100_1017;
		}
		if (arg0 == 2) {
			local28 = Static182.aClass100_1017;
			local26 = nonBreakingSpace;
		}
		if (arg0 == 3) {
			local26 = Static182.aClass100_185;
			local28 = Static182.aClass100_1017;
		}
		@Pc(59) JagString local59 = Static87.allocate(0);
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
			@Pc(95) JagString local95 = Static87.allocate(0);
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
		return JagString.concatenate(new JagString[] { local9, local137.method3124(), local59.method3124() });
	}
}
