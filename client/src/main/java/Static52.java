import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
	public static int anInt1695;

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "[I")
	public static final int[] anIntArray136 = new int[1000];

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
	public static int anInt1694 = -1;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIII)I")
	public static int method1286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(10) int local10 = arg4;
			arg4 = arg3;
			arg3 = local10;
		}
		@Pc(18) int local18 = arg1 & 0x3;
		if (local18 == 0) {
			return arg5;
		} else if (local18 == 1) {
			return arg0;
		} else if (local18 == 2) {
			return 7 + 1 - arg5 - arg4;
		} else {
			return 7 + 1 - arg0 - arg3;
		}
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
	public static void method1287() {
		Static241.components = new Component[Static202.aClass153_84.method4483()][];
		Static223.aBooleanArray115 = new boolean[Static202.aClass153_84.method4483()];
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)Lclient!na;")
	public static JagString method1288(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static34.method882(new JagString[] { Static105.aClass100_559, Static123.method2423(arg0), Static123.aClass100_594 });
		} else if (arg0 >= 10000000) {
			return Static34.method882(new JagString[] { Static184.aClass100_819, Static123.method2423(arg0 / 1000000), LocalizedText.MILLION, Static123.aClass100_594 });
		} else {
			return Static34.method882(new JagString[] { Static137.aClass100_637, Static123.method2423(arg0 / 1000), LocalizedText.THOUSAND, Static123.aClass100_594 });
		}
	}
}
