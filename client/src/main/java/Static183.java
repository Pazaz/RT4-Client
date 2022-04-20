import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
	public static int anInt4271;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
	public static int anInt4272 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "J")
	public static long prevClickTime = 0L;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!ab;Lclient!ab;I)V")
	public static void method3331(@OriginalArg(0) Node arg0, @OriginalArg(1) Node arg1) {
		if (arg0.aClass3_223 != null) {
			arg0.method4658();
		}
		arg0.aClass3_222 = arg1;
		arg0.aClass3_223 = arg1.aClass3_223;
		arg0.aClass3_223.aClass3_222 = arg0;
		arg0.aClass3_222.aClass3_223 = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIB)Lclient!ce;")
	public static SecondaryLinkedList method3333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) SecondaryLinkedList local9 = new SecondaryLinkedList();
		for (@Pc(14) Map local14 = (Map) Static228.aClass69_120.method2289(); local14 != null; local14 = (Map) Static228.aClass69_120.method2288()) {
			if (local14.aBoolean50 && local14.method664(arg1, arg0)) {
				local9.method798(local14);
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIII)V")
	public static void method3334(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = arg4 + arg1;
		@Pc(14) int local14 = arg3 - arg4;
		@Pc(29) int local29 = arg4 + arg5;
		@Pc(31) int local31;
		for (local31 = arg1; local31 < local5; local31++) {
			Static131.method2576(Static71.anIntArrayArray10[local31], arg5, arg0, arg2);
		}
		for (local31 = arg3; local31 > local14; local31--) {
			Static131.method2576(Static71.anIntArrayArray10[local31], arg5, arg0, arg2);
		}
		@Pc(70) int local70 = arg0 - arg4;
		for (local31 = local5; local31 <= local14; local31++) {
			@Pc(83) int[] local83 = Static71.anIntArrayArray10[local31];
			Static131.method2576(local83, arg5, local29, arg2);
			Static131.method2576(local83, local70, arg0, arg2);
		}
	}
}
