import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!cl", name = "J", descriptor = "Lclient!ve;")
	public static Js5 aClass153_22;

	@OriginalMember(owner = "client!cl", name = "V", descriptor = "[I")
	public static int[] anIntArray82;

	@OriginalMember(owner = "client!cl", name = "X", descriptor = "I")
	public static int anInt1091;

	@OriginalMember(owner = "client!cl", name = "K", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!cl", name = "Y", descriptor = "I")
	public static int anInt1092 = -1;

	@OriginalMember(owner = "client!cl", name = "Z", descriptor = "I")
	public static int anInt1093 = 0;

	@OriginalMember(owner = "client!cl", name = "ab", descriptor = "[I")
	public static final int[] anIntArray83 = new int[256];

	@OriginalMember(owner = "client!cl", name = "bb", descriptor = "Z")
	public static volatile boolean aBoolean66 = false;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIBII)V")
	public static void method898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg1;
		@Pc(21) int local21 = local13 << 1;
		@Pc(25) int local25 = arg1 * arg1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(33) int local33 = local25 << 1;
		@Pc(42) int local42 = local13 * (1 - local29) + local33;
		@Pc(51) int local51 = local25 - local21 * (local29 - 1);
		@Pc(55) int local55 = local25 << 2;
		@Pc(63) int local63 = local33 * 3;
		@Pc(67) int local67 = local13 << 2;
		@Pc(75) int local75 = ((arg1 << 1) - 3) * local21;
		@Pc(81) int local81 = local55;
		@Pc(95) int local95;
		@Pc(104) int local104;
		if (arg4 >= Static267.anInt5773 && Static106.anInt2869 >= arg4) {
			local95 = Static78.method1690(Static224.anInt5063, arg2 + arg3, Static172.anInt4164);
			local104 = Static78.method1690(Static224.anInt5063, arg3 - arg2, Static172.anInt4164);
			Static131.method2576(Static71.anIntArrayArray10[arg4], local104, local95, arg0);
		}
		@Pc(118) int local118 = local67 * (arg1 - 1);
		while (local17 > 0) {
			local17--;
			if (local42 < 0) {
				while (local42 < 0) {
					local15++;
					local42 += local63;
					local51 += local81;
					local81 += local55;
					local63 += local55;
				}
			}
			local95 = arg4 - local17;
			if (local51 < 0) {
				local51 += local81;
				local42 += local63;
				local63 += local55;
				local81 += local55;
				local15++;
			}
			local51 += -local75;
			local75 -= local67;
			local42 += -local118;
			local104 = local17 + arg4;
			if (Static267.anInt5773 <= local104 && Static106.anInt2869 >= local95) {
				@Pc(213) int local213 = Static78.method1690(Static224.anInt5063, local15 + arg3, Static172.anInt4164);
				@Pc(222) int local222 = Static78.method1690(Static224.anInt5063, arg3 - local15, Static172.anInt4164);
				if (local95 >= Static267.anInt5773) {
					Static131.method2576(Static71.anIntArrayArray10[local95], local222, local213, arg0);
				}
				if (Static106.anInt2869 >= local104) {
					Static131.method2576(Static71.anIntArrayArray10[local104], local222, local213, arg0);
				}
			}
			local118 -= local67;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)J")
	public static long method899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Tile local7 = Static130.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt662; local13++) {
			@Pc(22) Scenery local22 = local7.aClass31Array1[local13];
			if ((local22.aLong56 >> 29 & 0x3L) == 2L && local22.anInt1701 == arg1 && local22.anInt1696 == arg2) {
				return local22.aLong56;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V")
	public static void method902() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static176.aBooleanArray95[local3] = false;
		}
		Static133.anInt5230 = 0;
		Static233.anInt5217 = 0;
		Static155.anInt3718 = -1;
		Static52.anInt1694 = -1;
		Static227.anInt5096 = 1;
	}
}
