package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "[I")
	public static int[] anIntArray479;

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
	public static int anInt5449;

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
	public static int anInt5457;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "[F")
	public static final float[] aFloatArray28 = new float[4];

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
	public static int anInt5447 = 0;

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
	public static int anInt5459 = 0;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V")
	public static void method4278(@OriginalArg(0) int arg0) {
		if (Static241.anIntArray522 == null || Static241.anIntArray522.length < arg0) {
			Static241.anIntArray522 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)V")
	public static void method4279(@OriginalArg(0) int arg0) {
		@Pc(14) DelayedStateChange local14 = Static238.method4143(9, arg0);
		local14.pushClient();
	}
}
