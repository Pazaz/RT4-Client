package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
	public static int anInt4165;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Lclient!ih;")
	public static final LinkedList aClass69_97 = new LinkedList();

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIZ[I[I)V")
	public static void method3223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(22) int local22 = (arg1 + arg0) / 2;
		@Pc(24) int local24 = arg0;
		@Pc(28) int local28 = arg2[local22];
		arg2[local22] = arg2[arg1];
		arg2[arg1] = local28;
		@Pc(42) int local42 = arg3[local22];
		arg3[local22] = arg3[arg1];
		arg3[arg1] = local42;
		for (@Pc(54) int local54 = arg0; local54 < arg1; local54++) {
			if (arg2[local54] > (local54 & 0x1) + local28) {
				@Pc(79) int local79 = arg2[local54];
				arg2[local54] = arg2[local24];
				arg2[local24] = local79;
				@Pc(93) int local93 = arg3[local54];
				arg3[local54] = arg3[local24];
				arg3[local24++] = local93;
			}
		}
		arg2[arg1] = arg2[local24];
		arg2[local24] = local28;
		arg3[arg1] = arg3[local24];
		arg3[local24] = local42;
		method3223(arg0, local24 - 1, arg2, arg3);
		method3223(local24 + 1, arg1, arg2, arg3);
	}

}