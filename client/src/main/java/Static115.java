import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
	public static int anInt2940;

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "Lclient!ih;")
	public static final LinkedList mediumPriorityRequests = new LinkedList();

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
	public static int anInt2937 = 0;

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "Lclient!na;")
	public static final JagString aClass100_579 = JagString.parse("Fps:");

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "[Lclient!wa;")
	public static final Buffer[] aClass3_Sub15Array1 = new Buffer[2048];

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
	public static int anInt2939 = 0;

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
	public static int anInt2941 = -1;

	@OriginalMember(owner = "client!ja", name = "s", descriptor = "Lclient!na;")
	public static final JagString aClass100_582 = JagString.parse("http:)4)4");

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
			Sprites.crosses[Static17.milliseconds / 100].method1423(Static122.x - 8, Static25.y + -8);
		}
		if (Static70.type == 2) {
			Sprites.crosses[Static17.milliseconds / 100 + 4].method1423(Static122.x - 8, Static25.y + -8);
		}
		Static256.method4392();
	}

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)V")
	public static void method2312(@OriginalArg(0) int arg0) {
		GameShell.VARIABLE_RENDER_RATE = 1000 / arg0;
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
	public static void clear() {
		Fonts.p12Full = null;
		Sprites.hitmarks = null;
		Sprites.crosses = null;
		Sprites.nameIcons = null;
		Fonts.p11FullSoftware = null;
		Sprites.mapfunctions = null;
		Static67.mapfuncs = null;
		Sprites.mapmarkhints = null;
		Sprites.headiconPrayers = null;
		Fonts.b12Full = null;
		Static106.compass = null;
		Sprites.mapdots = null;
		Fonts.p11Full = null;
		Sprites.mapflags = null;
		Sprites.hitbars = null;
		Static277.hintMapEdge = null;
		Sprites.headhints = null;
		Sprites.headiconPks = null;
		Sprites.scrollbars = null;
	}
}
