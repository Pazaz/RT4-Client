import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "Lclient!n;")
	public static final SoftLruHashTable aClass99_32 = new SoftLruHashTable(50);

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
	public static int anInt5370 = 0;


	@OriginalMember(owner = "client!tl", name = "f", descriptor = "Lclient!na;")
	public static final JagString aClass100_1014 = Static28.parse(":assist:");

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "Lclient!na;")
	public static final JagString aClass100_1017 = Static28.parse(")1");

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static78.method1690(Static106.anInt2869, arg5, Static267.anInt5773);
		@Pc(17) int local17 = Static78.method1690(Static106.anInt2869, arg2, Static267.anInt5773);
		@Pc(23) int local23 = Static78.method1690(Static224.anInt5063, arg6, Static172.anInt4164);
		@Pc(29) int local29 = Static78.method1690(Static224.anInt5063, arg0, Static172.anInt4164);
		@Pc(37) int local37 = Static78.method1690(Static106.anInt2869, arg3 + arg5, Static267.anInt5773);
		@Pc(46) int local46 = Static78.method1690(Static106.anInt2869, arg2 - arg3, Static267.anInt5773);
		@Pc(48) int local48;
		for (local48 = local11; local48 < local37; local48++) {
			Static131.method2576(Static71.anIntArrayArray10[local48], local23, local29, arg4);
		}
		for (local48 = local17; local48 > local46; local48--) {
			Static131.method2576(Static71.anIntArrayArray10[local48], local23, local29, arg4);
		}
		@Pc(94) int local94 = Static78.method1690(Static224.anInt5063, arg3 + arg6, Static172.anInt4164);
		@Pc(103) int local103 = Static78.method1690(Static224.anInt5063, arg0 - arg3, Static172.anInt4164);
		for (local48 = local37; local48 <= local46; local48++) {
			@Pc(122) int[] local122 = Static71.anIntArrayArray10[local48];
			Static131.method2576(local122, local23, local94, arg4);
			Static131.method2576(local122, local94, local103, arg1);
			Static131.method2576(local122, local103, local29, arg4);
		}
	}
}
