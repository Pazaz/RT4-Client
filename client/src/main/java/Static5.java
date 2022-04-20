import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "Lclient!ve;")
	public static Js5 aClass153_1;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "I")
	public static int anInt40;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "I")
	public static int anInt39 = -1;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "Lclient!na;")
	public static final JagString aClass100_9 = Static28.parse("hint_mapedge");

	@OriginalMember(owner = "client!af", name = "k", descriptor = "I")
	public static int anInt45 = 0;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "[S")
	public static final short[] aShortArray2 = new short[] { 30, 6, 31, 29, 10, 44, 37, 57 };

	@OriginalMember(owner = "client!af", name = "m", descriptor = "Lclient!na;")
	public static final JagString aClass100_10 = Static28.parse("<br>");

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method31(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static40.method1014("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)Lclient!be;")
	public static Component getComponent(@OriginalArg(1) int id) {
		@Pc(7) int interfaceId = id >> 16;
		@Pc(18) int componentId = id & 0xFFFF;
		if (Static241.components[interfaceId] == null || Static241.components[interfaceId][componentId] == null) {
			@Pc(33) boolean success = Static245.load(interfaceId);
			if (!success) {
				return null;
			}
			// todo: this should not be necessary, data/server-related?
			if (Static241.components.length <= interfaceId || Static241.components[interfaceId].length <= componentId) {
				return null;
			}
		}
		return Static241.components[interfaceId][componentId];
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
	public static void method34() {
		Static116.method2325(false);
		System.gc();
		Static196.method3534(25);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIILclient!th;IJ)Z")
	public static boolean method35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Entity arg6, @OriginalArg(8) long arg7) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static105.method2256(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, 0, false, arg7);
		}
	}
}
