import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "([I[B[IIIIIIIIII)V")
	public static void method1391(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		@Pc(1) int local1 = arg3;
		for (@Pc(4) int local4 = -arg8; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg4 >> 16) * arg11;
			for (@Pc(15) int local15 = -arg7; local15 < 0; local15++) {
				@Pc(25) byte local25 = arg1[(arg3 >> 16) + local12];
				if (local25 == 0) {
					arg5++;
				} else {
					arg0[arg5++] = arg2[local25 & 0xFF];
				}
				arg3 += arg9;
			}
			arg4 += arg10;
			arg3 = local1;
			arg5 += arg6;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "([I[B[IIIIIIII)V")
	public static void method1393(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(23) byte local23;
			for (local16 = local4; local16 < 0; local16++) {
				local23 = arg1[arg3++];
				if (local23 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local23 & 0xFF];
				}
				local23 = arg1[arg3++];
				if (local23 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local23 & 0xFF];
				}
				local23 = arg1[arg3++];
				if (local23 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local23 & 0xFF];
				}
				local23 = arg1[arg3++];
				if (local23 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local23 & 0xFF];
				}
			}
			for (local16 = local9; local16 < 0; local16++) {
				local23 = arg1[arg3++];
				if (local23 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local23 & 0xFF];
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "([I[B[IIIIIIIIIII)V")
	public static void method1394(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		@Pc(1) int local1 = arg3;
		@Pc(7) int local7 = arg12 >> 16 & 0xFF;
		@Pc(13) int local13 = arg12 >> 8 & 0xFF;
		@Pc(17) int local17 = arg12 & 0xFF;
		for (@Pc(20) int local20 = -arg8; local20 < 0; local20++) {
			@Pc(28) int local28 = (arg4 >> 16) * arg11;
			for (@Pc(31) int local31 = -arg7; local31 < 0; local31++) {
				@Pc(41) byte local41 = arg1[(arg3 >> 16) + local28];
				if (local41 == 0) {
					arg5++;
				} else {
					@Pc(49) int local49 = arg2[local41 & 0xFF];
					@Pc(55) int local55 = local49 >> 16 & 0xFF;
					@Pc(61) int local61 = local49 >> 8 & 0xFF;
					@Pc(65) int local65 = local49 & 0xFF;
					arg0[arg5++] = (local55 * local7 >> 8 << 16) + (local61 * local13 >> 8 << 8) + (local65 * local17 >> 8);
				}
				arg3 += arg9;
			}
			arg4 += arg10;
			arg3 = local1;
			arg5 += arg6;
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "([I[B[IIIIIIII)V")
	public static void method1397(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(3) int local3 = 256 - arg9;
		for (@Pc(6) int local6 = -arg6; local6 < 0; local6++) {
			for (@Pc(11) int local11 = -arg5; local11 < 0; local11++) {
				@Pc(18) byte local18 = arg1[arg3++];
				if (local18 == 0) {
					arg4++;
				} else {
					@Pc(26) int local26 = arg2[local18 & 0xFF];
					@Pc(30) int local30 = arg0[arg4];
					arg0[arg4++] = ((local26 & 0xFF00FF) * arg9 + (local30 & 0xFF00FF) * local3 & 0xFF00FF00) + ((local26 & 0xFF00) * arg9 + (local30 & 0xFF00) * local3 & 0xFF0000) >> 8;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}
}
