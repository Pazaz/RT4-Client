import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "Lclient!ve;")
	public static Class153 aClass153_1;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "I")
	public static int anInt40;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "I")
	public static int anInt39 = -1;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "Lclient!na;")
	public static final Class100 aClass100_8 = Static28.method790("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!af", name = "g", descriptor = "Lclient!na;")
	public static final Class100 aClass100_9 = Static28.method790("hint_mapedge");

	@OriginalMember(owner = "client!af", name = "k", descriptor = "I")
	public static int anInt45 = 0;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "[S")
	public static final short[] aShortArray2 = new short[] { 30, 6, 31, 29, 10, 44, 37, 57 };

	@OriginalMember(owner = "client!af", name = "m", descriptor = "Lclient!na;")
	public static final Class100 aClass100_10 = Static28.method790("<br>");

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method31(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static40.method1014("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)Lclient!be;")
	public static Class13 method32(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(18) int local18 = arg0 & 0xFFFF;
		if (Static241.aClass13ArrayArray12[local7] == null || Static241.aClass13ArrayArray12[local7][local18] == null) {
			@Pc(33) boolean local33 = Static245.method4225(local7);
			if (!local33) {
				return null;
			}
		}
		return Static241.aClass13ArrayArray12[local7][local18];
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
	public static void method34() {
		Static116.method2325(false);
		System.gc();
		Static196.method3534(25);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIILclient!th;IJ)Z")
	public static boolean method35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8 arg6, @OriginalArg(8) long arg7) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static105.method2256(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, 0, false, arg7);
		}
	}
}
