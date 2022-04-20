import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "Lclient!ve;")
	public static Js5 aClass153_28;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "Z")
	public static boolean aBoolean101 = false;

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
	public static int wheelRotation = 0;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
	public static void method1321() {
		@Pc(8) int[] local8 = new int[Static170.anInt3245];
		@Pc(10) int local10 = 0;
		@Pc(12) int local12;
		for (local12 = 0; local12 < Static170.anInt3245; local12++) {
			@Pc(19) ObjType local19 = Static71.method1439(local12);
			if (local19.anInt2360 >= 0 || local19.anInt2331 >= 0) {
				local8[local10++] = local12;
			}
		}
		Static234.anIntArray455 = new int[local10];
		for (local12 = 0; local12 < local10; local12++) {
			Static234.anIntArray455[local12] = local8[local12];
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!ve;I)V")
	public static void method1322(@OriginalArg(0) Js5 arg0) {
		Static23.aClass153_11 = arg0;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[[I[[FI[[FIBIIBZBI[[FILclient!hg;)V")
	public static void method1324(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) float[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) byte arg10, @OriginalArg(12) int arg11, @OriginalArg(13) float[][] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class3_Sub14 arg14) {
		@Pc(11) int local11 = (arg0 << 8) + 255;
		@Pc(17) int local17 = (arg5 << 8) + 255;
		@Pc(23) int local23 = (arg8 << 8) + 255;
		@Pc(29) int local29 = (arg13 << 8) + 255;
		@Pc(33) int[] local33 = Static228.anIntArrayArray35[arg10];
		@Pc(39) int[] local39 = new int[local33.length >> 1];
		@Pc(41) int local41;
		for (local41 = 0; local41 < local39.length; local41++) {
			local39[local41] = Static207.method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, false, arg14, arg2, arg11, local33[local41 + local41], arg4, local33[local41 + local41 + 1]);
		}
		@Pc(87) int[] local87 = null;
		if (arg9) {
			@Pc(191) int local191;
			if (arg10 == 1) {
				local41 = Static207.method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 64, arg4, 128);
				local191 = Static207.method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 128, arg4, 64);
				local87 = new int[] { local191, local41, local39[2], local41, local39[0], local39[2] };
			} else if (arg10 == 2) {
				local87 = new int[6];
				local41 = Static207.method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 128, arg4, 128);
				local191 = Static207.method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 64, arg4, 0);
				local87[2] = local41;
				local87[0] = local39[0];
				local87[5] = local39[0];
				local87[3] = local41;
				local87[1] = local191;
				local87[4] = local39[1];
			} else if (arg10 == 3) {
				local87 = new int[6];
				local41 = Static207.method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 0, arg4, 128);
				local191 = Static207.method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 64, arg4, 0);
				local87[4] = local191;
				local87[1] = local39[1];
				local87[0] = local39[2];
				local87[3] = local41;
				local87[2] = local41;
				local87[5] = local39[2];
			} else if (arg10 == 4) {
				local87 = new int[3];
				local41 = Static207.method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 0, arg4, 128);
				local87[0] = local39[3];
				local87[2] = local39[0];
				local87[1] = local41;
			} else if (arg10 == 5) {
				local87 = new int[3];
				local41 = Static207.method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 128, arg4, 128);
				local87[1] = local41;
				local87[0] = local39[2];
				local87[2] = local39[3];
			} else if (arg10 == 6) {
				local87 = new int[6];
				local41 = Static207.method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 128, arg4, 0);
				local191 = Static207.method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 128, arg4, 128);
				local87[1] = local41;
				local87[0] = local39[3];
				local87[2] = local191;
				local87[4] = local39[0];
				local87[3] = local191;
				local87[5] = local39[3];
			} else if (arg10 == 7) {
				local87 = new int[6];
				local41 = Static207.method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 0, arg4, 128);
				local191 = Static207.method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 128, arg4, 0);
				local87[3] = local41;
				local87[2] = local41;
				local87[0] = local39[1];
				local87[4] = local39[2];
				local87[1] = local191;
				local87[5] = local39[1];
			} else if (arg10 == 8) {
				local87 = new int[3];
				local41 = Static207.method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 0, arg4, 0);
				local87[2] = local39[4];
				local87[0] = local39[3];
				local87[1] = local41;
			} else if (arg10 == 9) {
				local41 = Static207.method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 128, arg4, 64);
				local191 = Static207.method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 96, arg4, 32);
				@Pc(715) int local715 = Static207.method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 64, arg4, 0);
				local87 = new int[] { local191, local41, local39[4], local191, local39[4], local39[3], local191, local39[3], local39[2], local191, local39[2], local39[1], local191, local39[1], local715 };
			} else if (arg10 == 10) {
				local87 = new int[9];
				local41 = Static207.method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 0, arg4, 128);
				local87[0] = local39[2];
				local87[8] = local39[0];
				local87[1] = local41;
				local87[4] = local41;
				local87[2] = local39[3];
				local87[7] = local41;
				local87[3] = local39[3];
				local87[5] = local39[4];
				local87[6] = local39[4];
			} else if (arg10 == 11) {
				local87 = new int[12];
				local41 = Static207.method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 0, arg4, 64);
				local191 = Static207.method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 128, arg4, 64);
				local87[5] = local41;
				local87[1] = local41;
				local87[8] = local41;
				local87[0] = local39[3];
				local87[2] = local39[0];
				local87[11] = local191;
				local87[6] = local39[2];
				local87[7] = local191;
				local87[10] = local39[1];
				local87[3] = local39[3];
				local87[4] = local39[2];
				local87[9] = local39[2];
			}
		}
		arg14.method1945(arg7, arg3, arg11, local39, local87, false);
	}
}
