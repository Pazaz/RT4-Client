package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static209 {

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)Z")
	public static boolean method3702(@OriginalArg(1) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

}
