import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "([I[IIIIIIII)V")
	public static void method300(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(23) int local23;
			for (local16 = local4; local16 < 0; local16++) {
				local23 = arg1[arg2++];
				if (local23 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local23;
				}
				local23 = arg1[arg2++];
				if (local23 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local23;
				}
				local23 = arg1[arg2++];
				if (local23 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local23;
				}
				local23 = arg1[arg2++];
				if (local23 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local23;
				}
			}
			for (local16 = local9; local16 < 0; local16++) {
				local23 = arg1[arg2++];
				if (local23 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local23;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "([I[IIIIIIII)V")
	public static void method302(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(23) int local23;
			for (local16 = local4; local16 < 0; local16++) {
				local23 = arg1[arg2--];
				if (local23 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local23;
				}
				local23 = arg1[arg2--];
				if (local23 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local23;
				}
				local23 = arg1[arg2--];
				if (local23 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local23;
				}
				local23 = arg1[arg2--];
				if (local23 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local23;
				}
			}
			for (local16 = local9; local16 < 0; local16++) {
				local23 = arg1[arg2--];
				if (local23 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local23;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "([I[IIIIIII)V")
	public static void method305(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(2) int local2 = -arg5; local2 < 0; local2++) {
			@Pc(10) int local10 = arg3 + arg4 - 3;
			while (arg3 < local10) {
				arg0[arg3++] = arg1[arg2++];
				arg0[arg3++] = arg1[arg2++];
				arg0[arg3++] = arg1[arg2++];
				arg0[arg3++] = arg1[arg2++];
			}
			local10 += 3;
			while (arg3 < local10) {
				arg0[arg3++] = arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "([I[IIIIIIIIIIII)V")
	public static void method307(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(3) int local3 = 256 - arg11;
		@Pc(5) int local5 = arg2;
		for (@Pc(8) int local8 = -arg7; local8 < 0; local8++) {
			@Pc(16) int local16 = (arg3 >> 16) * arg10;
			for (@Pc(19) int local19 = -arg6; local19 < 0; local19++) {
				@Pc(29) int local29 = arg1[(arg2 >> 16) + local16];
				if (local29 == 0) {
					arg4++;
				} else {
					@Pc(35) int local35 = arg0[arg4];
					arg0[arg4++] = ((local29 & 0xFF00FF) * arg11 + (local35 & 0xFF00FF) * local3 & 0xFF00FF00) + ((local29 & 0xFF00) * arg11 + (local35 & 0xFF00) * local3 & 0xFF0000) >> 8;
				}
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = local5;
			arg4 += arg5;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "([I[IIIIIIIII)V")
	public static void method308(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) int local3 = 256 - arg8;
		for (@Pc(6) int local6 = -arg5; local6 < 0; local6++) {
			for (@Pc(11) int local11 = -arg4; local11 < 0; local11++) {
				@Pc(18) int local18 = arg1[arg2++];
				if (local18 == 0) {
					arg3++;
				} else {
					@Pc(24) int local24 = arg0[arg3];
					arg0[arg3++] = ((local18 & 0xFF00FF) * arg8 + (local24 & 0xFF00FF) * local3 & 0xFF00FF00) + ((local18 & 0xFF00) * arg8 + (local24 & 0xFF00) * local3 & 0xFF0000) >> 8;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "([I[IIIIIIIIIII)V")
	public static void method316(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * arg10;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				@Pc(25) int local25 = arg1[(arg2 >> 16) + local12];
				if (local25 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = local25;
				}
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = local1;
			arg4 += arg5;
		}
	}
}
