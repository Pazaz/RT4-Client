import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "[I")
	public static int[] anIntArray562;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "Lclient!fd;")
	public static WorldMapFont aClass41_9;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Lclient!na;")
	public static final JagString aClass100_1089 = Static28.parse(")2");

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
	public static int anInt5794 = -1;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
	public static int anInt5795 = 0;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "Lclient!na;")
	public static final JagString aClass100_1090 = Static28.parse("l");

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "Lclient!wa;")
	public static final Buffer aClass3_Sub15_9 = new Buffer(new byte[5000]);

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "Lclient!na;")
	public static final JagString aClass100_1093 = Static28.parse("Memory after cleanup=");

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "Lclient!na;")
	public static JagString aClass100_1094 = null;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg4 - arg6;
		@Pc(20) int local20 = arg4 * arg4;
		@Pc(25) int local25 = arg5 - arg6;
		@Pc(29) int local29 = arg5 * arg5;
		@Pc(33) int local33 = local25 * local25;
		@Pc(37) int local37 = local29 << 1;
		@Pc(41) int local41 = local20 << 1;
		@Pc(45) int local45 = local33 << 1;
		@Pc(49) int local49 = local16 * local16;
		@Pc(53) int local53 = local49 << 1;
		@Pc(57) int local57 = arg5 << 1;
		@Pc(61) int local61 = local25 << 1;
		@Pc(70) int local70 = local29 - (local57 - 1) * local41;
		@Pc(80) int local80 = local49 * (1 - local61) + local45;
		@Pc(89) int local89 = (1 - local57) * local20 + local37;
		@Pc(93) int local93 = local20 << 2;
		@Pc(102) int local102 = local33 - local53 * (local61 - 1);
		@Pc(106) int local106 = local49 << 2;
		@Pc(110) int local110 = local29 << 2;
		@Pc(114) int local114 = local33 << 2;
		@Pc(120) int local120 = (local57 - 3) * local41;
		@Pc(124) int local124 = local37 * 3;
		@Pc(130) int local130 = (local61 - 3) * local53;
		@Pc(134) int local134 = local45 * 3;
		@Pc(136) int local136 = local110;
		@Pc(138) int local138 = local114;
		@Pc(144) int local144 = (local25 - 1) * local106;
		@Pc(162) int local162 = (arg5 - 1) * local93;
		@Pc(166) int[] local166 = Static71.anIntArrayArray10[arg2];
		Static131.method2576(local166, arg1 - arg4, -local16 + arg1, arg3);
		Static131.method2576(local166, arg1 - local16, arg1 - -local16, arg0);
		Static131.method2576(local166, arg1 + local16, arg4 + arg1, arg3);
		while (local9 > 0) {
			if (local89 < 0) {
				while (local89 < 0) {
					local70 += local136;
					local89 += local124;
					local7++;
					local136 += local110;
					local124 += local110;
				}
			}
			if (local70 < 0) {
				local89 += local124;
				local7++;
				local124 += local110;
				local70 += local136;
				local136 += local110;
			}
			@Pc(258) boolean local258 = local9 <= local25;
			if (local258) {
				if (local80 < 0) {
					while (local80 < 0) {
						local80 += local134;
						local134 += local114;
						local11++;
						local102 += local138;
						local138 += local114;
					}
				}
				if (local102 < 0) {
					local80 += local134;
					local11++;
					local134 += local114;
					local102 += local138;
					local138 += local114;
				}
				local102 += -local130;
				local130 -= local106;
				local80 += -local144;
				local144 -= local106;
			}
			local89 += -local162;
			local70 += -local120;
			local120 -= local93;
			local9--;
			@Pc(348) int local348 = arg2 - local9;
			@Pc(352) int local352 = local7 + arg1;
			local162 -= local93;
			@Pc(360) int local360 = local9 + arg2;
			@Pc(365) int local365 = arg1 - local7;
			if (local258) {
				@Pc(371) int local371 = arg1 + local11;
				@Pc(376) int local376 = arg1 - local11;
				Static131.method2576(Static71.anIntArrayArray10[local348], local365, local376, arg3);
				Static131.method2576(Static71.anIntArrayArray10[local348], local376, local371, arg0);
				Static131.method2576(Static71.anIntArrayArray10[local348], local371, local352, arg3);
				Static131.method2576(Static71.anIntArrayArray10[local360], local365, local376, arg3);
				Static131.method2576(Static71.anIntArrayArray10[local360], local376, local371, arg0);
				Static131.method2576(Static71.anIntArrayArray10[local360], local371, local352, arg3);
			} else {
				Static131.method2576(Static71.anIntArrayArray10[local348], local365, local352, arg3);
				Static131.method2576(Static71.anIntArrayArray10[local360], local365, local352, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ba;IILclient!ba;Z)I")
	public static int method4595(@OriginalArg(0) World arg0, @OriginalArg(1) int arg1, @OriginalArg(3) World arg2, @OriginalArg(4) boolean arg3) {
		if (arg1 == 1) {
			@Pc(11) int local11 = arg0.anInt379;
			@Pc(14) int local14 = arg2.anInt379;
			if (!arg3) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local11 == -1) {
					local11 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg1 == 2) {
			return arg0.method445().aClass100_378.method3126(arg2.method445().aClass100_378);
		} else if (arg1 == 3) {
			if (arg0.aClass100_69.method3108(Static111.aClass100_570)) {
				if (arg2.aClass100_69.method3108(Static111.aClass100_570)) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aClass100_69.method3108(Static111.aClass100_570)) {
				return arg3 ? 1 : -1;
			} else {
				return arg0.aClass100_69.method3126(arg2.aClass100_69);
			}
		} else if (arg1 == 4) {
			return arg0.method441() ? (arg2.method441() ? 0 : 1) : arg2.method441() ? -1 : 0;
		} else if (arg1 == 5) {
			return arg0.method442() ? (arg2.method442() ? 0 : 1) : (arg2.method442() ? -1 : 0);
		} else if (arg1 == 6) {
			return arg0.method439() ? (arg2.method439() ? 0 : 1) : (arg2.method439() ? -1 : 0);
		} else if (arg1 == 7) {
			return arg0.method437() ? (arg2.method437() ? 0 : 1) : (arg2.method437() ? -1 : 0);
		} else {
			return arg0.anInt382 - arg2.anInt382;
		}
	}
}
