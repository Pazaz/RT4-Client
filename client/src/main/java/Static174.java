import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "F")
	public static float aFloat22;

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
	public static int anInt4191;

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "[[F")
	public static final float[][] aFloatArrayArray2 = new float[2][8];

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray32 = new int[2][8];

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(F)F")
	public static float method3250(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
