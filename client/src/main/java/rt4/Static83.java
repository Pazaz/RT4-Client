package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([JII[II)V")
	public static void method436(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(20) int local20 = arg1;
		@Pc(26) int local26 = (arg2 + arg1) / 2;
		@Pc(30) long local30 = arg0[local26];
		arg0[local26] = arg0[arg2];
		arg0[arg2] = local30;
		@Pc(44) int local44 = arg3[local26];
		arg3[local26] = arg3[arg2];
		arg3[arg2] = local44;
		for (@Pc(56) int local56 = arg1; local56 < arg2; local56++) {
			if (arg0[local56] < local30 + (long) (local56 & 0x1)) {
				@Pc(76) long local76 = arg0[local56];
				arg0[local56] = arg0[local20];
				arg0[local20] = local76;
				@Pc(90) int local90 = arg3[local56];
				arg3[local56] = arg3[local20];
				arg3[local20++] = local90;
			}
		}
		arg0[arg2] = arg0[local20];
		arg0[local20] = local30;
		arg3[arg2] = arg3[local20];
		arg3[local20] = local44;
		method436(arg0, arg1, local20 - 1, arg3);
		method436(arg0, local20 + 1, arg2, arg3);
	}

}