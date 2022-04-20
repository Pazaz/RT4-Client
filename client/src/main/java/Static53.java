import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
	public static int anInt1716;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Lclient!gn;")
	public static final LruHashTable aClass54_5 = new LruHashTable(16);

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
	public static final int anInt1704 = 5063219;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "Z")
	public static boolean aBoolean99 = true;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
	public static int anInt1708 = 0;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "[[I")
	public static final int[][] anIntArrayArray8 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V")
	public static void method1289() {
		Static190.aClass99_26.method3102(50);
		Static124.aClass99_17.method3102(50);
		Static87.aClass99_12.method3102(50);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([[IZILclient!hg;[IIIIZ[[FZI[[FIIIZ[[I[[FBI[Z)V")
	public static void method1291(@OriginalArg(0) int[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub14 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) float[][] arg9, @OriginalArg(10) boolean arg10, @OriginalArg(12) float[][] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) boolean arg15, @OriginalArg(17) int[][] arg16, @OriginalArg(18) float[][] arg17, @OriginalArg(19) byte arg18, @OriginalArg(20) int arg19, @OriginalArg(21) boolean[] arg20) {
		@Pc(11) int local11 = (arg2 << 8) + (arg1 ? 255 : 0);
		@Pc(25) int local25 = (arg8 ? 255 : 0) + (arg14 << 8);
		@Pc(31) int[] local31 = new int[arg4.length / 2];
		@Pc(41) int local41 = (arg10 ? 255 : 0) + (arg13 << 8);
		@Pc(51) int local51 = (arg19 << 8) + (arg15 ? 255 : 0);
		for (@Pc(53) int local53 = 0; local53 < local31.length; local53++) {
			@Pc(67) int local67 = arg4[local53 + local53];
			@Pc(80) int[][] local80 = arg0 == null || arg20 == null || !arg20[local53] ? arg16 : arg0;
			@Pc(88) int local88 = arg4[local53 + local53 + 1];
			local31[local53] = Static207.method3683(local41, (float) arg12, local11, local51, arg0, local80, arg7, arg17, local25, arg18, false, arg3, arg9, arg5, local67, arg11, local88);
		}
		arg3.method1945(arg6, arg7, arg5, local31, null, false);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([Ljava/lang/Object;I[III)V")
	public static void method1292(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(11) int local11 = (arg3 + arg1) / 2;
		@Pc(15) int local15 = arg2[local11];
		@Pc(17) int local17 = arg3;
		arg2[local11] = arg2[arg1];
		arg2[arg1] = local15;
		@Pc(31) Object local31 = arg0[local11];
		arg0[local11] = arg0[arg1];
		arg0[arg1] = local31;
		for (@Pc(43) int local43 = arg3; local43 < arg1; local43++) {
			if ((local43 & 0x1) + local15 > arg2[local43]) {
				@Pc(67) int local67 = arg2[local43];
				arg2[local43] = arg2[local17];
				arg2[local17] = local67;
				@Pc(81) Object local81 = arg0[local43];
				arg0[local43] = arg0[local17];
				arg0[local17++] = local81;
			}
		}
		arg2[arg1] = arg2[local17];
		arg2[local17] = local15;
		arg0[arg1] = arg0[local17];
		arg0[local17] = local31;
		method1292(arg0, local17 - 1, arg2, arg3);
		method1292(arg0, arg1, arg2, local17 + 1);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)V")
	public static void method1293(@OriginalArg(1) boolean arg0) {
		Static162.aBoolean190 = arg0;
		Static87.aBoolean130 = !Static138.method2697();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public static void method1294() {
		if (!Static241.aBoolean302) {
			return;
		}
		@Pc(19) Component local19 = Static201.method1418(Static98.anInt2512, Static15.anInt506);
		if (local19 != null && local19.anObjectArray27 != null) {
			@Pc(29) HookRequest local29 = new HookRequest();
			local29.anObjectArray31 = local19.anObjectArray27;
			local29.source = local19;
			Static82.method1767(local29);
		}
		Static241.aBoolean302 = false;
		Static35.anInt1092 = -1;
		Static43.method1143(local19);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	public static void method1295() {
		Static125.aClass99_19.method3104();
	}
}
