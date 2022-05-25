package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public class StringUtils {
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
}
