import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
	public static int anInt13;

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
	public static int anInt15;

	@OriginalMember(owner = "client!aa", name = "t", descriptor = "[Lclient!pc;")
	public static MaterialRenderer[] anInterface4Array1;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
	public static int anInt7 = 0;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "[S")
	public static final short[] aShortArray1 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "Z")
	public static boolean aBoolean1 = false;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(SI)Z")
	public static boolean method5(@OriginalArg(0) short arg0) {
		if (arg0 == 47 || arg0 == 5 || arg0 == 43 || arg0 == 35 || arg0 == 58 || arg0 == 22 || arg0 == 40 || arg0 == 3) {
			return true;
		} else if (arg0 == 9 || arg0 == 12 || arg0 == 1006 || arg0 == 1003) {
			return true;
		} else if (arg0 == 25 || arg0 == 23 || arg0 == 48 || arg0 == 7 || arg0 == 13) {
			return true;
		} else {
			return arg0 == 8 || arg0 == 32 || arg0 == 28 || arg0 == 59 || arg0 == 51 || arg0 == 41;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "([Lclient!be;ZI)V")
	public static void method7(@OriginalArg(0) Component[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(23) Component local23 = arg0[local11];
			if (local23 != null) {
				if (local23.anInt452 == 0) {
					if (local23.createdComponents != null) {
						method7(local23.createdComponents, arg1);
					}
					@Pc(49) Class3_Sub31 local49 = (Class3_Sub31) Static119.aClass133_9.method3863((long) local23.anInt507);
					if (local49 != null) {
						Static54.method1304(arg1, local49.anInt5878);
					}
				}
				@Pc(72) HookRequest local72;
				if (arg1 == 0 && local23.anObjectArray12 != null) {
					local72 = new HookRequest();
					local72.anObjectArray31 = local23.anObjectArray12;
					local72.source = local23;
					Static82.method1767(local72);
				}
				if (arg1 == 1 && local23.anObjectArray8 != null) {
					if (local23.componentId >= 0) {
						@Pc(103) Component local103 = Static5.getComponent(local23.anInt507);
						if (local103 == null || local103.createdComponents == null || local23.componentId >= local103.createdComponents.length || local103.createdComponents[local23.componentId] != local23) {
							continue;
						}
					}
					local72 = new HookRequest();
					local72.anObjectArray31 = local23.anObjectArray8;
					local72.source = local23;
					Static82.method1767(local72);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIZIIIIII)Z")
	public static boolean method8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		@Pc(3) int local3;
		@Pc(8) int local8;
		for (local3 = 0; local3 < 104; local3++) {
			for (local8 = 0; local8 < 104; local8++) {
				Static145.anIntArrayArray25[local3][local8] = 0;
				Static167.anIntArrayArray31[local3][local8] = 99999999;
			}
		}
		Static145.anIntArrayArray25[arg10][arg3] = 99;
		Static167.anIntArrayArray31[arg10][arg3] = 0;
		local8 = arg3;
		local3 = arg10;
		@Pc(53) byte local53 = 0;
		Static259.anIntArray514[0] = arg10;
		@Pc(59) boolean local59 = false;
		@Pc(61) int local61 = 0;
		@Pc(64) int local64 = local53 + 1;
		Static84.anIntArray209[0] = arg3;
		@Pc(71) int[][] local71 = Static148.aClass97Array1[Static55.level].anIntArrayArray30;
		@Pc(193) int local193;
		while (local61 != local64) {
			local3 = Static259.anIntArray514[local61];
			local8 = Static84.anIntArray209[local61];
			local61 = local61 + 1 & 0xFFF;
			if (arg8 == local3 && arg4 == local8) {
				local59 = true;
				break;
			}
			if (arg1 != 0) {
				if ((arg1 < 5 || arg1 == 10) && Static148.aClass97Array1[Static55.level].method3042(arg4, local3, local8, arg8, arg1 - 1, 2, arg7)) {
					local59 = true;
					break;
				}
				if (arg1 < 10 && Static148.aClass97Array1[Static55.level].method3046(arg4, arg1 - 1, arg8, local8, 2, arg7, local3)) {
					local59 = true;
					break;
				}
			}
			if (arg0 != 0 && arg6 != 0 && Static148.aClass97Array1[Static55.level].method3052(arg8, local8, local3, 2, arg0, arg2, arg4, arg6)) {
				local59 = true;
				break;
			}
			local193 = Static167.anIntArrayArray31[local3][local8] + 1;
			if (local3 > 0 && Static145.anIntArrayArray25[local3 - 1][local8] == 0 && (local71[local3 - 1][local8] & 0x12C010E) == 0 && (local71[local3 - 1][local8 + 1] & 0x12C0138) == 0) {
				Static259.anIntArray514[local64] = local3 - 1;
				Static84.anIntArray209[local64] = local8;
				local64 = local64 + 1 & 0xFFF;
				Static145.anIntArrayArray25[local3 - 1][local8] = 2;
				Static167.anIntArrayArray31[local3 - 1][local8] = local193;
			}
			if (local3 < 102 && Static145.anIntArrayArray25[local3 + 1][local8] == 0 && (local71[local3 + 2][local8] & 0x12C0183) == 0 && (local71[local3 + 2][local8 + 1] & 0x12C01E0) == 0) {
				Static259.anIntArray514[local64] = local3 + 1;
				Static84.anIntArray209[local64] = local8;
				local64 = local64 + 1 & 0xFFF;
				Static145.anIntArrayArray25[local3 + 1][local8] = 8;
				Static167.anIntArrayArray31[local3 + 1][local8] = local193;
			}
			if (local8 > 0 && Static145.anIntArrayArray25[local3][local8 - 1] == 0 && (local71[local3][local8 - 1] & 0x12C010E) == 0 && (local71[local3 + 1][local8 - 1] & 0x12C0183) == 0) {
				Static259.anIntArray514[local64] = local3;
				Static84.anIntArray209[local64] = local8 - 1;
				Static145.anIntArrayArray25[local3][local8 - 1] = 1;
				Static167.anIntArrayArray31[local3][local8 - 1] = local193;
				local64 = local64 + 1 & 0xFFF;
			}
			if (local8 < 102 && Static145.anIntArrayArray25[local3][local8 + 1] == 0 && (local71[local3][local8 + 2] & 0x12C0138) == 0 && (local71[local3 + 1][local8 + 2] & 0x12C01E0) == 0) {
				Static259.anIntArray514[local64] = local3;
				Static84.anIntArray209[local64] = local8 + 1;
				Static145.anIntArrayArray25[local3][local8 + 1] = 4;
				local64 = local64 + 1 & 0xFFF;
				Static167.anIntArrayArray31[local3][local8 + 1] = local193;
			}
			if (local3 > 0 && local8 > 0 && Static145.anIntArrayArray25[local3 - 1][local8 - 1] == 0 && (local71[local3 - 1][local8] & 0x12C0138) == 0 && (local71[local3 - 1][local8 - 1] & 0x12C010E) == 0 && (local71[local3][local8 - 1] & 0x12C0183) == 0) {
				Static259.anIntArray514[local64] = local3 - 1;
				Static84.anIntArray209[local64] = local8 - 1;
				Static145.anIntArrayArray25[local3 - 1][local8 - 1] = 3;
				Static167.anIntArrayArray31[local3 - 1][local8 - 1] = local193;
				local64 = local64 + 1 & 0xFFF;
			}
			if (local3 < 102 && local8 > 0 && Static145.anIntArrayArray25[local3 + 1][local8 - 1] == 0 && (local71[local3 + 1][local8 - 1] & 0x12C010E) == 0 && (local71[local3 + 2][local8 - 1] & 0x12C0183) == 0 && (local71[local3 + 2][local8] & 0x12C01E0) == 0) {
				Static259.anIntArray514[local64] = local3 + 1;
				Static84.anIntArray209[local64] = local8 - 1;
				local64 = local64 + 1 & 0xFFF;
				Static145.anIntArrayArray25[local3 + 1][local8 - 1] = 9;
				Static167.anIntArrayArray31[local3 + 1][local8 - 1] = local193;
			}
			if (local3 > 0 && local8 < 102 && Static145.anIntArrayArray25[local3 - 1][local8 + 1] == 0 && (local71[local3 - 1][local8 + 1] & 0x12C010E) == 0 && (local71[local3 - 1][local8 + 2] & 0x12C0138) == 0 && (local71[local3][local8 + 2] & 0x12C01E0) == 0) {
				Static259.anIntArray514[local64] = local3 - 1;
				Static84.anIntArray209[local64] = local8 + 1;
				Static145.anIntArrayArray25[local3 - 1][local8 + 1] = 6;
				Static167.anIntArrayArray31[local3 - 1][local8 + 1] = local193;
				local64 = local64 + 1 & 0xFFF;
			}
			if (local3 < 102 && local8 < 102 && Static145.anIntArrayArray25[local3 + 1][local8 + 1] == 0 && (local71[local3 + 1][local8 + 2] & 0x12C0138) == 0 && (local71[local3 + 2][local8 + 2] & 0x12C01E0) == 0 && (local71[local3 + 2][local8 + 1] & 0x12C0183) == 0) {
				Static259.anIntArray514[local64] = local3 + 1;
				Static84.anIntArray209[local64] = local8 + 1;
				local64 = local64 + 1 & 0xFFF;
				Static145.anIntArrayArray25[local3 + 1][local8 + 1] = 12;
				Static167.anIntArrayArray31[local3 + 1][local8 + 1] = local193;
			}
		}
		Static221.anInt4364 = 0;
		@Pc(921) int local921;
		if (!local59) {
			if (!arg5) {
				return false;
			}
			local193 = 1000;
			local921 = 100;
			for (@Pc(928) int local928 = arg8 - 10; local928 <= arg8 + 10; local928++) {
				for (@Pc(942) int local942 = arg4 - 10; local942 <= arg4 + 10; local942++) {
					if (local928 >= 0 && local942 >= 0 && local928 < 104 && local942 < 104 && Static167.anIntArrayArray31[local928][local942] < 100) {
						@Pc(978) int local978 = 0;
						@Pc(980) int local980 = 0;
						if (local928 < arg8) {
							local978 = arg8 - local928;
						} else if (local928 > arg0 + arg8 - 1) {
							local978 = local928 + 1 - arg0 - arg8;
						}
						if (arg4 > local942) {
							local980 = arg4 - local942;
						} else if (local942 > arg4 + arg6 - 1) {
							local980 = local942 + 1 - arg4 - arg6;
						}
						@Pc(1057) int local1057 = local978 * local978 + local980 * local980;
						if (local1057 < local193 || local193 == local1057 && Static167.anIntArrayArray31[local928][local942] < local921) {
							local8 = local942;
							local921 = Static167.anIntArrayArray31[local928][local942];
							local193 = local1057;
							local3 = local928;
						}
					}
				}
			}
			if (local193 == 1000) {
				return false;
			}
			if (arg10 == local3 && local8 == arg3) {
				return false;
			}
			Static221.anInt4364 = 1;
		}
		@Pc(1121) byte local1121 = 0;
		Static259.anIntArray514[0] = local3;
		local61 = local1121 + 1;
		Static84.anIntArray209[0] = local8;
		local193 = local921 = Static145.anIntArrayArray25[local3][local8];
		while (arg10 != local3 || arg3 != local8) {
			if (local921 != local193) {
				Static259.anIntArray514[local61] = local3;
				Static84.anIntArray209[local61++] = local8;
				local921 = local193;
			}
			if ((local193 & 0x2) != 0) {
				local3++;
			} else if ((local193 & 0x8) != 0) {
				local3--;
			}
			if ((local193 & 0x1) != 0) {
				local8++;
			} else if ((local193 & 0x4) != 0) {
				local8--;
			}
			local193 = Static145.anIntArrayArray25[local3][local8];
		}
		if (local61 > 0) {
			Static193.method3502(local61, arg9);
			return true;
		} else if (arg9 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZI)V")
	public static void method10(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static6.outboundBuffer.p1isaac(132);
		Static6.outboundBuffer.p4rme(arg1);
		Static6.outboundBuffer.p2le(arg0);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLclient!be;)V")
	public static void method13(@OriginalArg(1) Component arg0) {
		@Pc(16) int local16 = arg0.anInt453;
		if (local16 == 324) {
			if (Static158.anInt3851 == -1) {
				Static158.anInt3851 = arg0.anInt477;
				Static145.anInt3502 = arg0.anInt519;
			}
			if (Static134.aClass59_2.aBoolean141) {
				arg0.anInt477 = Static158.anInt3851;
			} else {
				arg0.anInt477 = Static145.anInt3502;
			}
		} else if (local16 == 325) {
			if (Static158.anInt3851 == -1) {
				Static145.anInt3502 = arg0.anInt519;
				Static158.anInt3851 = arg0.anInt477;
			}
			if (Static134.aClass59_2.aBoolean141) {
				arg0.anInt477 = Static145.anInt3502;
			} else {
				arg0.anInt477 = Static158.anInt3851;
			}
		} else if (local16 == 327) {
			arg0.modelXAngle = 150;
			arg0.modelYAngle = (int) (Math.sin((double) Static83.anInt372 / 40.0D) * 256.0D) & 0x7FF;
			arg0.modelType = 5;
			arg0.modelId = -1;
		} else if (local16 == 328) {
			if (Static173.self.aClass100_364 == null) {
				arg0.modelId = 0;
			} else {
				arg0.modelXAngle = 150;
				arg0.modelYAngle = (int) (Math.sin((double) Static83.anInt372 / 40.0D) * 256.0D) & 0x7FF;
				arg0.modelType = 5;
				arg0.modelId = ((int) Static173.self.aClass100_364.encode37() << 11) + 2047;
				arg0.anInt496 = Static173.self.anInt3388;
				arg0.anInt500 = 0;
				arg0.anInt522 = Static173.self.anInt3366;
				arg0.anInt510 = Static173.self.anInt3407;
			}
		}
	}
}
