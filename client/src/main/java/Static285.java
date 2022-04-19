import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([I[BIIIIIII)V")
	public static void method1137(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			@Pc(16) int local16;
			for (local16 = local4; local16 < 0; local16++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			for (local16 = local9; local16 < 0; local16++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([I[BIIIIIIIII[I[I)V")
	public static void method1138(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12) {
		@Pc(3) int local3 = arg2 - Static129.anInt3145;
		@Pc(7) int local7 = arg3 - Static129.anInt3147;
		for (@Pc(9) int local9 = local7; local9 < local7 + arg5; local9++) {
			@Pc(18) int local18 = arg11[local9];
			@Pc(22) int local22 = arg12[local9];
			@Pc(24) int local24 = arg4;
			@Pc(31) int local31;
			if (local3 > local18) {
				local31 = local3 - local18;
				if (local31 >= local22) {
					arg7 += arg4 + arg10;
					arg8 += arg4 + arg9;
					continue;
				}
				local22 -= local31;
			} else {
				local31 = local18 - local3;
				if (local31 >= arg4) {
					arg7 += arg4 + arg10;
					arg8 += arg4 + arg9;
					continue;
				}
				arg7 += local31;
				local24 = arg4 - local31;
				arg8 += local31;
			}
			local31 = 0;
			if (local24 < local22) {
				local22 = local24;
			} else {
				local31 = local24 - local22;
			}
			for (@Pc(99) int local99 = -local22; local99 < 0; local99++) {
				if (arg1[arg7++] == 0) {
					arg8++;
				} else {
					Static129.anIntArray297[arg8++] = arg6;
				}
			}
			arg7 += local31 + arg10;
			arg8 += local31 + arg9;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([I[BIIIIIIII)V")
	public static void method1139(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(17) int local17 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		@Pc(21) int local21 = 256 - arg9;
		for (@Pc(24) int local24 = -arg6; local24 < 0; local24++) {
			for (@Pc(29) int local29 = -arg5; local29 < 0; local29++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(40) int local40 = arg0[arg4];
					arg0[arg4++] = (((local40 & 0xFF00FF) * local21 & 0xFF00FF00) + ((local40 & 0xFF00) * local21 & 0xFF0000) >> 8) + local17;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}
}
