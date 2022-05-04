package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static251 {

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
	public static int anInt5449;

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
	public static int anInt5457;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "[F")
	public static final float[] aFloatArray28 = new float[4];

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
	public static int anInt5459 = 0;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V")
	public static void method4278(@OriginalArg(0) int arg0) {
		if (Static241.anIntArray522 == null || Static241.anIntArray522.length < arg0) {
			Static241.anIntArray522 = new int[arg0];
		}
	}

}
