import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "[I")
	public static int[] anIntArray367;

	@OriginalMember(owner = "client!nk", name = "E", descriptor = "I")
	public static int anInt4183;

	@OriginalMember(owner = "client!nk", name = "L", descriptor = "[Lclient!mm;")
	public static SoftwareSprite[] aClass3_Sub2_Sub1_Sub1Array9;

	@OriginalMember(owner = "client!nk", name = "O", descriptor = "Lclient!e;")
	public static Player self;

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "[Lclient!sl;")
	public static final SynthSound[] aClass138Array1 = new SynthSound[50];

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(IZ)V")
	public static void method3240(@OriginalArg(1) boolean arg0) {
		@Pc(7) int local7;
		@Pc(16) Npc local16;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(133) int local133;
		@Pc(149) int local149;
		@Pc(158) int local158;
		@Pc(171) int local171;
		for (local7 = 0; local7 < Static272.anInt5214; local7++) {
			local16 = Static175.aClass8_Sub4_Sub2Array1[Static33.anIntArray79[local7]];
			if (local16 != null && local16.method2682() && local16.aClass96_1.aBoolean182 == arg0 && local16.aClass96_1.method2933()) {
				@Pc(42) int local42 = local16.method2693();
				@Pc(97) int local97;
				if (local42 == 1) {
					if ((local16.anInt3412 & 0x7F) == 64 && (local16.anInt3421 & 0x7F) == 64) {
						local97 = local16.anInt3412 >> 7;
						local107 = local16.anInt3421 >> 7;
						if (local97 >= 0 && local97 < 104 && local107 >= 0 && local107 < 104) {
							local171 = Static31.anIntArrayArray6[local97][local107]++;
						}
					}
				} else if (((local42 & 0x1) != 0 || (local16.anInt3412 & 0x7F) == 0 && (local16.anInt3421 & 0x7F) == 0) && ((local42 & 0x1) != 1 || (local16.anInt3412 & 0x7F) == 64 && (local16.anInt3421 & 0x7F) == 64)) {
					local97 = local16.anInt3412 - local42 * 64 >> 7;
					local107 = local16.anInt3421 - local42 * 64 >> 7;
					local113 = local16.method2693() + local97;
					if (local97 < 0) {
						local97 = 0;
					}
					if (local113 > 104) {
						local113 = 104;
					}
					local133 = local107 + local16.method2693();
					if (local107 < 0) {
						local107 = 0;
					}
					if (local133 > 104) {
						local133 = 104;
					}
					for (local149 = local97; local149 < local113; local149++) {
						for (local158 = local107; local158 < local133; local158++) {
							local171 = Static31.anIntArrayArray6[local149][local158]++;
						}
					}
				}
			}
		}
		label200: for (local7 = 0; local7 < Static272.anInt5214; local7++) {
			local16 = Static175.aClass8_Sub4_Sub2Array1[Static33.anIntArray79[local7]];
			@Pc(262) long local262 = (long) Static33.anIntArray79[local7] << 32 | 0x20000000L;
			if (local16 != null && local16.method2682() && local16.aClass96_1.aBoolean182 == arg0 && local16.aClass96_1.method2933()) {
				local107 = local16.method2693();
				if (local107 == 1) {
					if ((local16.anInt3412 & 0x7F) == 64 && (local16.anInt3421 & 0x7F) == 64) {
						local113 = local16.anInt3412 >> 7;
						local133 = local16.anInt3421 >> 7;
						if (local113 < 0 || local113 >= 104 || local133 < 0 || local133 >= 104) {
							continue;
						}
						if (Static31.anIntArrayArray6[local113][local133] > 1) {
							local171 = Static31.anIntArrayArray6[local113][local133]--;
							continue;
						}
					}
				} else if ((local107 & 0x1) == 0 && (local16.anInt3412 & 0x7F) == 0 && (local16.anInt3421 & 0x7F) == 0 || (local107 & 0x1) == 1 && (local16.anInt3412 & 0x7F) == 64 && (local16.anInt3421 & 0x7F) == 64) {
					local113 = local16.anInt3412 - local107 * 64 >> 7;
					local133 = local16.anInt3421 - local107 * 64 >> 7;
					local158 = local133 + local107;
					if (local133 < 0) {
						local133 = 0;
					}
					@Pc(368) boolean local368 = true;
					local149 = local113 + local107;
					if (local158 > 104) {
						local158 = 104;
					}
					if (local113 < 0) {
						local113 = 0;
					}
					if (local149 > 104) {
						local149 = 104;
					}
					@Pc(396) int local396;
					@Pc(401) int local401;
					for (local396 = local113; local396 < local149; local396++) {
						for (local401 = local133; local401 < local158; local401++) {
							if (Static31.anIntArrayArray6[local396][local401] <= 1) {
								local368 = false;
								break;
							}
						}
					}
					if (local368) {
						local396 = local113;
						while (true) {
							if (local396 >= local149) {
								continue label200;
							}
							for (local401 = local133; local401 < local158; local401++) {
								local171 = Static31.anIntArrayArray6[local396][local401]--;
							}
							local396++;
						}
					}
				}
				if (!local16.aClass96_1.aBoolean183) {
					local262 |= Long.MIN_VALUE;
				}
				local16.anInt3424 = Static207.method3685(Static55.level, local16.anInt3412, local16.anInt3421);
				Static43.method1141(Static55.level, local16.anInt3412, local16.anInt3421, local16.anInt3424, local107 * 64 + 60 - 64, local16, local16.anInt3381, local262, local16.aBoolean171);
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z[J[I)V")
	public static void method3243(@OriginalArg(1) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static83.method436(arg0, 0, arg0.length - 1, arg1);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIB)V")
	public static void method3246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 > Static106.anInt2869 || arg2 < Static267.anInt5773) {
			return;
		}
		@Pc(24) boolean local24;
		if (Static172.anInt4164 > arg1) {
			local24 = false;
			arg1 = Static172.anInt4164;
		} else if (Static224.anInt5063 >= arg1) {
			local24 = true;
		} else {
			local24 = false;
			arg1 = Static224.anInt5063;
		}
		@Pc(43) boolean local43;
		if (arg3 < Static172.anInt4164) {
			arg3 = Static172.anInt4164;
			local43 = false;
		} else if (arg3 > Static224.anInt5063) {
			arg3 = Static224.anInt5063;
			local43 = false;
		} else {
			local43 = true;
		}
		if (Static267.anInt5773 > arg4) {
			arg4 = Static267.anInt5773;
		} else {
			Static131.method2576(Static71.anIntArrayArray10[arg4++], arg1, arg3, arg0);
		}
		if (arg2 <= Static106.anInt2869) {
			Static131.method2576(Static71.anIntArrayArray10[arg2--], arg1, arg3, arg0);
		} else {
			arg2 = Static106.anInt2869;
		}
		@Pc(98) int local98;
		if (local24 && local43) {
			for (local98 = arg4; local98 <= arg2; local98++) {
				@Pc(105) int[] local105 = Static71.anIntArrayArray10[local98];
				local105[arg1] = local105[arg3] = arg0;
			}
		} else if (local24) {
			for (local98 = arg4; local98 <= arg2; local98++) {
				Static71.anIntArrayArray10[local98][arg1] = arg0;
			}
		} else if (local43) {
			for (local98 = arg4; local98 <= arg2; local98++) {
				Static71.anIntArrayArray10[local98][arg3] = arg0;
			}
		}
	}
}
