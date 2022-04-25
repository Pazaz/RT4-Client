package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static179 {

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
	public static int mouseRecorderPrevY = 0;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
	public static int anInt4254 = 0;

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray33 = new int[5][5000];

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
	public static int anInt4262 = 1;

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "Lclient!na;")
	public static final JagString aClass100_807 = JagString.parse("n");

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)I")
	public static int method3322(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

}
