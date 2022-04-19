import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!ol", name = "U", descriptor = "Lclient!ve;")
	public static Class153 aClass153_78;

	@OriginalMember(owner = "client!ol", name = "ib", descriptor = "I")
	public static int anInt4358;

	@OriginalMember(owner = "client!ol", name = "S", descriptor = "Lclient!na;")
	public static final Class100 aClass100_817 = Static28.method790("Connexion perdue)3");

	@OriginalMember(owner = "client!ol", name = "V", descriptor = "I")
	public static int anInt4348 = 0;

	@OriginalMember(owner = "client!ol", name = "X", descriptor = "Lclient!na;")
	private static final Class100 aClass100_818 = Static28.method790(" is already on your ignore list)3");

	@OriginalMember(owner = "client!ol", name = "Y", descriptor = "Lclient!na;")
	public static final Class100 aClass100_819 = Static28.method790("<col=00ff80>");

	@OriginalMember(owner = "client!ol", name = "db", descriptor = "Lclient!na;")
	public static Class100 aClass100_820 = aClass100_818;

	@OriginalMember(owner = "client!ol", name = "fb", descriptor = "I")
	public static int anInt4355 = 500;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIILclient!th;IJIIII)Z")
	public static boolean method3387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Entity arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static105.method2256(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIZI)I")
	public static int method3388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 1023 - arg0;
		} else if (local3 == 2) {
			return 1023 - arg2;
		} else {
			return arg0;
		}
	}
}
