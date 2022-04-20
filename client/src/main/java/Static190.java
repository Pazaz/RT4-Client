import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "Lclient!en;")
	public static BufferedFile cacheMasterIndex;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "Lclient!n;")
	public static final SoftLruHashTable aClass99_26 = new SoftLruHashTable(200);

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "[J")
	public static final long[] aLongArray6 = new long[100];

	@OriginalMember(owner = "client!pf", name = "r", descriptor = "[I")
	public static final int[] anIntArray382 = new int[500];

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[F")
	public static float[] method3441(@OriginalArg(0) int arg0) {
		@Pc(7) float local7 = Static161.method3068() + Static161.method3059();
		@Pc(9) int local9 = Static161.method3064();
		@Pc(11) float local11 = 0.58823526F;
		Static251.aFloatArray28[3] = 1.0F;
		@Pc(24) float local24 = (float) (local9 >> 16 & 0xFF) / 255.0F;
		@Pc(33) float local33 = (float) (local9 >> 8 & 0xFF) / 255.0F;
		Static251.aFloatArray28[1] = local7 * (float) (arg0 >> 8 & 0xFF) / 255.0F * local33 * local11;
		Static251.aFloatArray28[0] = local7 * local11 * local24 * ((float) (arg0 >> 16 & 0xFF) / 255.0F);
		@Pc(74) float local74 = (float) (local9 & 0xFF) / 255.0F;
		Static251.aFloatArray28[2] = (float) (arg0 & 0xFF) / 255.0F * local74 * local11 * local7;
		return Static251.aFloatArray28;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZIII)Lclient!qf;")
	public static Sprite method3443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(27) int local27 = (arg2 ? 65536 : 0) + arg1 + (arg0 << 17) + (arg4 << 19);
		@Pc(37) long local37 = (long) local27 * 3849834839L + (long) arg3 * 3147483667L;
		@Pc(43) Sprite local43 = (Sprite) Static118.aClass99_16.method3106(local37);
		if (local43 != null) {
			return local43;
		}
		Rasteriser.aBoolean134 = false;
		local43 = Static164.method3150(arg4, false, arg1, arg2, arg0, arg3, false);
		if (local43 != null && !Rasteriser.aBoolean134) {
			Static118.aClass99_16.method3095(local43, local37);
		}
		return local43;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
	public static void method3444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) DelayedStateChange local14 = Static238.method4143(13, arg1);
		local14.method1017();
		local14.intArg1 = arg0;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(II)V")
	public static void method3447() {
		Static27.aClass99_4.method3102(5);
		Static244.aClass99_32.method3102(5);
		Static118.aClass99_16.method3102(5);
	}
}
