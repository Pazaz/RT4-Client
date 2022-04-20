import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!aj", name = "X", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!aj", name = "Z", descriptor = "[I")
	public static int[] anIntArray8;

	@OriginalMember(owner = "client!aj", name = "R", descriptor = "Lclient!na;")
	public static final JagString aClass100_32 = Static28.parse("<col=ff9040>");

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BILclient!be;)I")
	public static int method118(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1) {
		if (!Static36.method940(arg1).method503(arg0) && arg1.anObjectArray29 == null) {
			return -1;
		} else if (arg1.anIntArray39 == null || arg0 >= arg1.anIntArray39.length) {
			return -1;
		} else {
			return arg1.anIntArray39[arg0];
		}
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(II)V")
	public static void method119() {
		Static233.aClass99_31.method3102(5);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIZIII)V")
	public static void method120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static251.method4278(arg4);
		@Pc(8) int local8 = arg4 - arg1;
		@Pc(10) int local10 = 0;
		if (local8 < 0) {
			local8 = 0;
		}
		@Pc(21) int local21 = -arg4;
		@Pc(23) int local23 = arg4;
		@Pc(25) int local25 = local8;
		@Pc(28) int local28 = -local8;
		@Pc(30) int local30 = -1;
		@Pc(34) int[] local34 = Static71.anIntArrayArray10[arg2];
		@Pc(39) int local39 = arg5 + local8;
		@Pc(41) int local41 = -1;
		@Pc(46) int local46 = arg5 - local8;
		Static131.method2576(local34, arg5 - arg4, local46, arg0);
		Static131.method2576(local34, local46, local39, arg3);
		Static131.method2576(local34, local39, arg5 + arg4, arg0);
		while (local10 < local23) {
			local30 += 2;
			local28 += local30;
			if (local28 >= 0 && local25 >= 1) {
				Static241.anIntArray522[local25] = local10;
				local25--;
				local28 -= local25 << 1;
			}
			local10++;
			local41 += 2;
			local21 += local41;
			@Pc(142) int[] local142;
			@Pc(149) int[] local149;
			@Pc(162) int local162;
			@Pc(158) int local158;
			@Pc(154) int local154;
			@Pc(171) int local171;
			@Pc(167) int local167;
			if (local21 >= 0) {
				local23--;
				local21 -= local23 << 1;
				if (local8 > local23) {
					local142 = Static71.anIntArrayArray10[local23 + arg2];
					local149 = Static71.anIntArrayArray10[arg2 - local23];
					local154 = arg5 - local10;
					local158 = local10 + arg5;
					local162 = Static241.anIntArray522[local23];
					local167 = arg5 - local162;
					local171 = local162 + arg5;
					Static131.method2576(local142, local154, local167, arg0);
					Static131.method2576(local142, local167, local171, arg3);
					Static131.method2576(local142, local171, local158, arg0);
					Static131.method2576(local149, local154, local167, arg0);
					Static131.method2576(local149, local167, local171, arg3);
					Static131.method2576(local149, local171, local158, arg0);
				} else {
					local142 = Static71.anIntArrayArray10[arg2 + local23];
					local149 = Static71.anIntArrayArray10[arg2 - local23];
					local162 = local10 + arg5;
					local158 = arg5 - local10;
					Static131.method2576(local142, local158, local162, arg0);
					Static131.method2576(local149, local158, local162, arg0);
				}
			}
			local142 = Static71.anIntArrayArray10[arg2 + local10];
			local149 = Static71.anIntArrayArray10[arg2 - local10];
			local162 = local23 + arg5;
			local158 = arg5 - local23;
			if (local8 <= local10) {
				Static131.method2576(local142, local158, local162, arg0);
				Static131.method2576(local149, local158, local162, arg0);
			} else {
				local154 = local10 <= local25 ? local25 : Static241.anIntArray522[local10];
				local171 = local154 + arg5;
				local167 = arg5 - local154;
				Static131.method2576(local142, local158, local167, arg0);
				Static131.method2576(local142, local167, local171, arg3);
				Static131.method2576(local142, local171, local162, arg0);
				Static131.method2576(local149, local158, local167, arg0);
				Static131.method2576(local149, local167, local171, arg3);
				Static131.method2576(local149, local171, local162, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "(I)V")
	public static void method121() {
		for (@Pc(3) int local3 = 0; local3 < Static165.anInt4043; local3++) {
			@Pc(19) Class35 local19 = Static247.method4248(local3);
			if (local19 != null && local19.anInt1765 == 0) {
				Static106.anIntArray257[local3] = 0;
				Static7.anIntArray75[local3] = 0;
			}
		}
		Static199.aClass133_20 = new HashTable(16);
	}
}
