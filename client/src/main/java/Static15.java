import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!be", name = "Vb", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!be", name = "ib", descriptor = "Lclient!na;")
	public static final JagString aClass100_83 = Static28.parse("event_opbase");

	@OriginalMember(owner = "client!be", name = "Kb", descriptor = "Z")
	public static boolean aBoolean33 = true;

	@OriginalMember(owner = "client!be", name = "ac", descriptor = "Lclient!na;")
	public static JagString aClass100_87 = null;

	@OriginalMember(owner = "client!be", name = "kc", descriptor = "J")
	public static long aLong18 = 0L;

	@OriginalMember(owner = "client!be", name = "Ec", descriptor = "I")
	public static int anInt506 = -1;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)Lclient!na;")
	public static JagString method479() {
		@Pc(8) JagString local8 = Static93.aClass100_518;
		@Pc(10) JagString local10 = Static186.aClass100_827;
		if (Static83.modeWhere != 0) {
			local8 = Static50.aClass100_365;
		}
		if (Static47.aClass100_991 != null) {
			local10 = Static34.method882(new JagString[] { Static150.aClass100_687, Static47.aClass100_991 });
		}
		return Static34.method882(new JagString[] { Static61.aClass100_424, local8, Static80.aClass100_886, Static123.method2423(Static141.anInt3470), Static257.aClass100_98, Static123.method2423(Static204.anInt4760), local10, Static41.aClass100_268 });
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)I")
	public static int method484(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Inv local10 = (Inv) Static20.aClass133_2.method3863((long) arg0);
		if (local10 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local10.anIntArray420.length) {
			return local10.anIntArray420[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)I")
	public static int method492(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static105.method2253(arg0);
	}
}
