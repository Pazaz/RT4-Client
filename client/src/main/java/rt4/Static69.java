package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!fh", name = "cb", descriptor = "Lsignlink!ll;")
	public static SignLink signLink;

	@OriginalMember(owner = "client!fh", name = "U", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][]{new boolean[0], {true, false, true}, {true, false, false, true}, {false, false, true, true}, {true, true, false}, {false, true, true}, {true, false, false, true}, {false, false, false, true, true}, {false, true, true}, {true, false, true, true, true}, {false, true, true, true, true}, {false, true, true, true, true, false}};

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIII)I")
	public static int method1540(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg2) {
			return arg1;
		} else {
			@Pc(17) int local17 = 128 - arg0;
			@Pc(50) int local50 = arg0 * (arg2 >>> 7 & 0x1FE01FE) + local17 * (arg1 >>> 7 & 0x1FE01FE) & 0xFF00FF00;
			@Pc(65) int local65 = local17 * (arg1 & 0xFF00FF) + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00;
			return local50 + (local65 >> 7);
		}
	}

}
