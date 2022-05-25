package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "[I")
	public static int[] anIntArray516;

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "S")
	public static short aShort30 = 256;

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "Z")
	public static boolean aBoolean299 = false;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I[S)[S")
	public static short[] method4511(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) short[] local19 = new short[arg0.length];
			ArrayUtils.copy(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}

}
