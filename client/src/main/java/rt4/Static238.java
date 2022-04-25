package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

    @OriginalMember(owner = "client!te", name = "H", descriptor = "[I")
	public static int[] regionBitPacked;

	@OriginalMember(owner = "client!te", name = "B", descriptor = "[I")
	public static final int[] anIntArray469 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(III)Lclient!da;")
	public static DelayedStateChange method4143(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) DelayedStateChange local13 = (DelayedStateChange) DelayedStateChange.changes.get((long) arg1 | (long) arg0 << 32);
		if (local13 == null) {
			local13 = new DelayedStateChange(arg0, arg1);
			DelayedStateChange.changes.put(local13, local13.key);
		}
		return local13;
	}

}
