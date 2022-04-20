import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
	public static int anInt2940;

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "Lclient!ih;")
	public static final LinkedList aClass69_70 = new LinkedList();

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
	public static int anInt2937 = 0;

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "Lclient!na;")
	public static final JagString aClass100_579 = Static28.parse("Fps:");

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "[Lclient!wa;")
	public static final Buffer[] aClass3_Sub15Array1 = new Buffer[2048];

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
	public static int anInt2939 = 0;

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
	public static int anInt2941 = -1;

	@OriginalMember(owner = "client!ja", name = "s", descriptor = "Lclient!na;")
	public static final JagString aClass100_582 = Static28.parse("http:)4)4");

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "([II)[I")
	public static int[] method2308(@OriginalArg(0) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) int[] local18 = new int[arg0.length];
			Static289.method2613(arg0, 0, local18, 0, arg0.length);
			return local18;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)I")
	public static int method2309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 / arg0;
		@Pc(11) int local11 = arg2 / arg0;
		@Pc(17) int local17 = arg2 & arg0 - 1;
		@Pc(23) int local23 = arg0 - 1 & arg1;
		@Pc(28) int local28 = Static24.method670(local7, local11);
		@Pc(35) int local35 = Static24.method670(local7 + 1, local11);
		@Pc(42) int local42 = Static24.method670(local7, local11 + 1);
		@Pc(56) int local56 = Static24.method670(local7 + 1, local11 + 1);
		@Pc(63) int local63 = Static170.method2569(local28, local35, local23, arg0);
		@Pc(70) int local70 = Static170.method2569(local42, local56, local23, arg0);
		return Static170.method2569(local63, local70, local17, arg0);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIB)V")
	public static void method2310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static70.type == 1) {
			Static240.aClass3_Sub2_Sub1Array10[Static17.milliseconds / 100].method1423(Static122.x - 8, Static25.y + -8);
		}
		if (Static70.type == 2) {
			Static240.aClass3_Sub2_Sub1Array10[Static17.milliseconds / 100 + 4].method1423(Static122.x - 8, Static25.y + -8);
		}
		Static256.method4392();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!ve;Lclient!ve;I)V")
	public static void method2311(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1) {
		Static87.aClass153_38 = arg1;
		Static29.aClass153_19 = arg0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)V")
	public static void method2312(@OriginalArg(0) int arg0) {
		Static11.anInt386 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIZ)V")
	public static void method2314(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (GlRenderer.enabled) {
			@Pc(25) int local25 = arg2 - 334;
			if (local25 < 0) {
				local25 = 0;
			} else if (local25 > 100) {
				local25 = 100;
			}
			@Pc(51) int local51 = local25 * (Static10.aShort9 - Static178.aShort25) / 100 + Static178.aShort25;
			if (Static153.aShort22 > local51) {
				local51 = Static153.aShort22;
			} else if (Static4.aShort1 < local51) {
				local51 = Static4.aShort1;
			}
			@Pc(73) int local73 = local51 * arg2 * 512 / (arg0 * 334);
			@Pc(115) int local115;
			@Pc(122) int local122;
			@Pc(86) short local86;
			if (local73 < Static55.aShort12) {
				local86 = Static55.aShort12;
				local51 = arg0 * 334 * local86 / (arg2 * 512);
				if (Static4.aShort1 < local51) {
					local51 = Static4.aShort1;
					local115 = arg2 * 512 * local51 / (local86 * 334);
					local122 = (arg0 - local115) / 2;
					if (arg4) {
						Static46.method1177();
						Static46.method1186(arg3, arg1, local122, arg2, 0);
						Static46.method1186(arg0 + arg3 - local122, arg1, local122, arg2, 0);
					}
					arg3 += local122;
					arg0 -= local122 * 2;
				}
			} else if (Static131.aShort21 < local73) {
				local86 = Static131.aShort21;
				local51 = local86 * arg0 * 334 / (arg2 * 512);
				if (Static153.aShort22 > local51) {
					local51 = Static153.aShort22;
					local115 = local86 * arg0 * 334 / (local51 * 512);
					local122 = (arg2 - local115) / 2;
					if (arg4) {
						Static46.method1177();
						Static46.method1186(arg3, arg1, arg0, local122, 0);
						Static46.method1186(arg3, arg1 + arg2 - local122, arg0, local122, 0);
					}
					arg2 -= local122 * 2;
					arg1 += local122;
				}
			}
			Static223.anInt5029 = local51 * arg2 / 334;
		}
		Static166.anInt4055 = (short) arg0;
		Static245.anInt5377 = (short) arg2;
		Static24.anInt773 = arg1;
		Static7.anInt983 = arg3;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
	public static void method2315() {
		Static215.aClass3_Sub2_Sub9_32 = null;
		Static213.aClass3_Sub2_Sub1Array8 = null;
		Static240.aClass3_Sub2_Sub1Array10 = null;
		Static159.aClass36Array12 = null;
		Static265.aClass3_Sub2_Sub9_Sub1_2 = null;
		Static173.aClass3_Sub2_Sub1_Sub1Array9 = null;
		Static67.aClass3_Sub2_Sub1Array4 = null;
		Static149.aClass3_Sub2_Sub1Array7 = null;
		Static138.aClass3_Sub2_Sub1Array5 = null;
		Static280.aClass3_Sub2_Sub9_43 = null;
		Static106.aClass3_Sub2_Sub1_7 = null;
		Static139.aClass3_Sub2_Sub1Array6 = null;
		Static114.aClass3_Sub2_Sub9_42 = null;
		Static84.aClass3_Sub2_Sub1_4 = null;
		Static116.aClass3_Sub2_Sub1Array3 = null;
		Static277.aClass3_Sub2_Sub1Array12 = null;
		Static276.aClass3_Sub2_Sub1Array11 = null;
		Static219.aClass3_Sub2_Sub1Array9 = null;
		Static241.aClass36Array16 = null;
	}
}
