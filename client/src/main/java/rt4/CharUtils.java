package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public class CharUtils {
	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)Z")
	public static boolean isLetter(@OriginalArg(0) int c) {
		return c >= 97 && c <= 122 || c >= 65 && c <= 90;
	}

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "(II)Z")
	public static boolean isDigit(@OriginalArg(1) int c) {
		return c >= 48 && c <= 57;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)Z")
	public static boolean isLetterOrDigit(@OriginalArg(0) int c) {
		if (c >= 97 && c <= 122) {
			return true;
		} else if (c >= 65 && c <= 90) {
			return true;
		} else {
			return c >= 48 && c <= 57;
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(II)Z")
	public static boolean isValidChar(@OriginalArg(1) int c) {
		if (c >= 32 && c <= 126) {
			return true;
		} else if (c >= 160 && c <= 255) {
			return true;
		} else {
			return c == 128 || c == 140 || c == 151 || c == 156 || c == 159;
		}
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
}
