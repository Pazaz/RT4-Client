package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bn", name = "O", descriptor = "I")
	public static int anInt761;

    @OriginalMember(owner = "client!bn", name = "eb", descriptor = "I")
	public static int anInt773 = 0;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)I")
	public static int method667(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = 0;
		while (arg0 > 0) {
			local8 = local8 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local8;
	}

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "(II)Z")
	public static boolean isDigit(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}
}
