package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "Lclient!ih;")
	public static final LinkedList highPriorityRequests = new LinkedList();

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
	public static int mouseOverInventoryObjectIndex = 0;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)I")
	public static int method22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((SceneGraph.tileFlags[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (SceneGraph.tileFlags[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([J[Ljava/lang/Object;I)V")
	public static void method23(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		method3909(arg0.length - 1, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I[JII[Ljava/lang/Object;)V")
	public static void method3909(@OriginalArg(0) int arg0, @OriginalArg(1) long[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(16) int local16 = arg2;
		@Pc(23) int local23 = (arg2 + arg0) / 2;
		@Pc(27) long local27 = arg1[local23];
		arg1[local23] = arg1[arg0];
		arg1[arg0] = local27;
		@Pc(41) Object local41 = arg3[local23];
		arg3[local23] = arg3[arg0];
		arg3[arg0] = local41;
		for (@Pc(53) int local53 = arg2; local53 < arg0; local53++) {
			if (local27 + (long) (local53 & 0x1) > arg1[local53]) {
				@Pc(72) long local72 = arg1[local53];
				arg1[local53] = arg1[local16];
				arg1[local16] = local72;
				@Pc(86) Object local86 = arg3[local53];
				arg3[local53] = arg3[local16];
				arg3[local16++] = local86;
			}
		}
		arg1[arg0] = arg1[local16];
		arg1[local16] = local27;
		arg3[arg0] = arg3[local16];
		arg3[local16] = local41;
		method3909(local16 - 1, arg1, arg2, arg3);
		method3909(arg0, arg1, local16 + 1, arg3);
	}
}
