import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "[I")
	public static int[] anIntArray234;

	@OriginalMember(owner = "client!hh", name = "r", descriptor = "[I")
	public static int[] anIntArray235;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "Lclient!na;")
	public static final JagString aClass100_520 = Static28.parse("(U4");

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "Lclient!na;")
	public static final JagString aClass100_521 = Static28.parse("::tele ");

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "Lclient!na;")
	public static final JagString aClass100_522 = Static28.parse("::wm0");

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V")
	public static void method1949(@OriginalArg(1) int arg0) {
		if (Static245.load(arg0)) {
			Static118.method2354(-1, Static241.components[arg0]);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBIIIIIIIIIZI)Z")
	public static boolean method1955(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int arg11) {
		@Pc(3) int local3;
		@Pc(10) int local10;
		for (local3 = 0; local3 < 104; local3++) {
			for (local10 = 0; local10 < 104; local10++) {
				Static145.anIntArrayArray25[local3][local10] = 0;
				Static167.anIntArrayArray31[local3][local10] = 99999999;
			}
		}
		local3 = arg8;
		local10 = arg11;
		Static145.anIntArrayArray25[arg8][arg11] = 99;
		Static167.anIntArrayArray31[arg8][arg11] = 0;
		@Pc(53) byte local53 = 0;
		Static259.anIntArray514[0] = arg8;
		@Pc(65) int local65 = local53 + 1;
		Static84.anIntArray209[0] = arg11;
		@Pc(69) int local69 = 0;
		@Pc(71) boolean local71 = false;
		@Pc(76) int[][] local76 = Static148.aClass97Array1[Static55.level].anIntArrayArray30;
		@Pc(201) int local201;
		@Pc(242) int local242;
		label397: while (local69 != local65) {
			local3 = Static259.anIntArray514[local69];
			local10 = Static84.anIntArray209[local69];
			local69 = local69 + 1 & 0xFFF;
			if (arg5 == local3 && local10 == arg0) {
				local71 = true;
				break;
			}
			if (arg6 != 0) {
				if ((arg6 < 5 || arg6 == 10) && Static148.aClass97Array1[Static55.level].method3042(arg0, local3, local10, arg5, arg6 - 1, arg4, arg3)) {
					local71 = true;
					break;
				}
				if (arg6 < 10 && Static148.aClass97Array1[Static55.level].method3046(arg0, arg6 - 1, arg5, local10, arg4, arg3, local3)) {
					local71 = true;
					break;
				}
			}
			if (arg1 != 0 && arg9 != 0 && Static148.aClass97Array1[Static55.level].method3052(arg5, local10, local3, arg4, arg1, arg7, arg0, arg9)) {
				local71 = true;
				break;
			}
			local201 = Static167.anIntArrayArray31[local3][local10] + 1;
			if (local3 > 0 && Static145.anIntArrayArray25[local3 - 1][local10] == 0 && (local76[local3 - 1][local10] & 0x12C010E) == 0 && (local76[local3 - 1][arg4 + local10 - 1] & 0x12C0138) == 0) {
				local242 = 1;
				while (true) {
					if (arg4 - 1 <= local242) {
						Static259.anIntArray514[local65] = local3 - 1;
						Static84.anIntArray209[local65] = local10;
						Static145.anIntArrayArray25[local3 - 1][local10] = 2;
						local65 = local65 + 1 & 0xFFF;
						Static167.anIntArrayArray31[local3 - 1][local10] = local201;
						break;
					}
					if ((local76[local3 - 1][local10 + local242] & 0x12C013E) != 0) {
						break;
					}
					local242++;
				}
			}
			if (local3 < 102 && Static145.anIntArrayArray25[local3 + 1][local10] == 0 && (local76[local3 + arg4][local10] & 0x12C0183) == 0 && (local76[arg4 + local3][local10 + arg4 - 1] & 0x12C01E0) == 0) {
				local242 = 1;
				while (true) {
					if (local242 >= arg4 - 1) {
						Static259.anIntArray514[local65] = local3 + 1;
						Static84.anIntArray209[local65] = local10;
						Static145.anIntArrayArray25[local3 + 1][local10] = 8;
						Static167.anIntArrayArray31[local3 + 1][local10] = local201;
						local65 = local65 + 1 & 0xFFF;
						break;
					}
					if ((local76[arg4 + local3][local10 + local242] & 0x12C01E3) != 0) {
						break;
					}
					local242++;
				}
			}
			if (local10 > 0 && Static145.anIntArrayArray25[local3][local10 - 1] == 0 && (local76[local3][local10 - 1] & 0x12C010E) == 0 && (local76[arg4 + local3 - 1][local10 - 1] & 0x12C0183) == 0) {
				local242 = 1;
				while (true) {
					if (arg4 - 1 <= local242) {
						Static259.anIntArray514[local65] = local3;
						Static84.anIntArray209[local65] = local10 - 1;
						Static145.anIntArrayArray25[local3][local10 - 1] = 1;
						local65 = local65 + 1 & 0xFFF;
						Static167.anIntArrayArray31[local3][local10 - 1] = local201;
						break;
					}
					if ((local76[local3 + local242][local10 - 1] & 0x12C018F) != 0) {
						break;
					}
					local242++;
				}
			}
			if (local10 < 102 && Static145.anIntArrayArray25[local3][local10 + 1] == 0 && (local76[local3][local10 + arg4] & 0x12C0138) == 0 && (local76[local3 + arg4 - 1][arg4 + local10] & 0x12C01E0) == 0) {
				local242 = 1;
				while (true) {
					if (local242 >= arg4 - 1) {
						Static259.anIntArray514[local65] = local3;
						Static84.anIntArray209[local65] = local10 + 1;
						Static145.anIntArrayArray25[local3][local10 + 1] = 4;
						Static167.anIntArrayArray31[local3][local10 + 1] = local201;
						local65 = local65 + 1 & 0xFFF;
						break;
					}
					if ((local76[local3 + local242][arg4 + local10] & 0x12C01F8) != 0) {
						break;
					}
					local242++;
				}
			}
			if (local3 > 0 && local10 > 0 && Static145.anIntArrayArray25[local3 - 1][local10 - 1] == 0 && (local76[local3 - 1][arg4 + local10 - 1 - 1] & 0x12C0138) == 0 && (local76[local3 - 1][local10 - 1] & 0x12C010E) == 0 && (local76[arg4 + local3 - 1 - 1][local10 - 1] & 0x12C0183) == 0) {
				local242 = 1;
				while (true) {
					if (arg4 - 1 <= local242) {
						Static259.anIntArray514[local65] = local3 - 1;
						Static84.anIntArray209[local65] = local10 - 1;
						local65 = local65 + 1 & 0xFFF;
						Static145.anIntArrayArray25[local3 - 1][local10 - 1] = 3;
						Static167.anIntArrayArray31[local3 - 1][local10 - 1] = local201;
						break;
					}
					if ((local76[local3 - 1][local10 + local242 - 1] & 0x12C013E) != 0 || (local76[local242 + local3 - 1][local10 - 1] & 0x12C018F) != 0) {
						break;
					}
					local242++;
				}
			}
			if (local3 < 102 && local10 > 0 && Static145.anIntArrayArray25[local3 + 1][local10 - 1] == 0 && (local76[local3 + 1][local10 - 1] & 0x12C010E) == 0 && (local76[arg4 + local3][local10 - 1] & 0x12C0183) == 0 && (local76[local3 + arg4][local10 + arg4 - 1 - 1] & 0x12C01E0) == 0) {
				local242 = 1;
				while (true) {
					if (local242 >= arg4 - 1) {
						Static259.anIntArray514[local65] = local3 + 1;
						Static84.anIntArray209[local65] = local10 - 1;
						local65 = local65 + 1 & 0xFFF;
						Static145.anIntArrayArray25[local3 + 1][local10 - 1] = 9;
						Static167.anIntArrayArray31[local3 + 1][local10 - 1] = local201;
						break;
					}
					if ((local76[local3 + arg4][local10 + local242 - 1] & 0x12C01E3) != 0 || (local76[local242 + local3 + 1][local10 - 1] & 0x12C018F) != 0) {
						break;
					}
					local242++;
				}
			}
			if (local3 > 0 && local10 < 102 && Static145.anIntArrayArray25[local3 - 1][local10 + 1] == 0 && (local76[local3 - 1][local10 + 1] & 0x12C010E) == 0 && (local76[local3 - 1][local10 + arg4] & 0x12C0138) == 0 && (local76[local3][local10 + arg4] & 0x12C01E0) == 0) {
				local242 = 1;
				while (true) {
					if (arg4 - 1 <= local242) {
						Static259.anIntArray514[local65] = local3 - 1;
						Static84.anIntArray209[local65] = local10 + 1;
						local65 = local65 + 1 & 0xFFF;
						Static145.anIntArrayArray25[local3 - 1][local10 + 1] = 6;
						Static167.anIntArrayArray31[local3 - 1][local10 + 1] = local201;
						break;
					}
					if ((local76[local3 - 1][local10 + local242 + 1] & 0x12C013E) != 0 || (local76[local242 + local3 - 1][arg4 + local10] & 0x12C01F8) != 0) {
						break;
					}
					local242++;
				}
			}
			if (local3 < 102 && local10 < 102 && Static145.anIntArrayArray25[local3 + 1][local10 + 1] == 0 && (local76[local3 + 1][local10 + arg4] & 0x12C0138) == 0 && (local76[local3 + arg4][local10 + arg4] & 0x12C01E0) == 0 && (local76[arg4 + local3][local10 + 1] & 0x12C0183) == 0) {
				for (local242 = 1; local242 < arg4 - 1; local242++) {
					if ((local76[local242 + local3 + 1][local10 + arg4] & 0x12C01F8) != 0 || (local76[arg4 + local3][local242 + local10 + 1] & 0x12C01E3) != 0) {
						continue label397;
					}
				}
				Static259.anIntArray514[local65] = local3 + 1;
				Static84.anIntArray209[local65] = local10 + 1;
				Static145.anIntArrayArray25[local3 + 1][local10 + 1] = 12;
				Static167.anIntArrayArray31[local3 + 1][local10 + 1] = local201;
				local65 = local65 + 1 & 0xFFF;
			}
		}
		Static221.anInt4364 = 0;
		if (!local71) {
			if (!arg10) {
				return false;
			}
			local201 = 1000;
			local242 = 100;
			for (@Pc(1247) int local1247 = arg5 - 10; local1247 <= arg5 + 10; local1247++) {
				for (@Pc(1257) int local1257 = arg0 - 10; local1257 <= arg0 + 10; local1257++) {
					if (local1247 >= 0 && local1257 >= 0 && local1247 < 104 && local1257 < 104 && Static167.anIntArrayArray31[local1247][local1257] < 100) {
						@Pc(1295) int local1295 = 0;
						if (arg5 > local1247) {
							local1295 = arg5 - local1247;
						} else if (arg5 + arg1 - 1 < local1247) {
							local1295 = local1247 + 1 - arg1 - arg5;
						}
						@Pc(1334) int local1334 = 0;
						if (local1257 < arg0) {
							local1334 = arg0 - local1257;
						} else if (arg0 + arg9 - 1 < local1257) {
							local1334 = local1257 + 1 - arg0 - arg9;
						}
						@Pc(1377) int local1377 = local1295 * local1295 + local1334 * local1334;
						if (local1377 < local201 || local1377 == local201 && local242 > Static167.anIntArrayArray31[local1247][local1257]) {
							local242 = Static167.anIntArrayArray31[local1247][local1257];
							local3 = local1247;
							local201 = local1377;
							local10 = local1257;
						}
					}
				}
			}
			if (local201 == 1000) {
				return false;
			}
			if (local3 == arg8 && arg11 == local10) {
				return false;
			}
			Static221.anInt4364 = 1;
		}
		@Pc(1438) byte local1438 = 0;
		Static259.anIntArray514[0] = local3;
		local69 = local1438 + 1;
		Static84.anIntArray209[0] = local10;
		local201 = local242 = Static145.anIntArrayArray25[local3][local10];
		while (local3 != arg8 || arg11 != local10) {
			if (local242 != local201) {
				Static259.anIntArray514[local69] = local3;
				local242 = local201;
				Static84.anIntArray209[local69++] = local10;
			}
			if ((local201 & 0x2) != 0) {
				local3++;
			} else if ((local201 & 0x8) != 0) {
				local3--;
			}
			if ((local201 & 0x1) != 0) {
				local10++;
			} else if ((local201 & 0x4) != 0) {
				local10--;
			}
			local201 = Static145.anIntArrayArray25[local3][local10];
		}
		if (local69 > 0) {
			Static193.method3502(local69, arg2);
			return true;
		} else if (arg2 == 1) {
			return false;
		} else {
			return true;
		}
	}
}
