import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "[I")
	public static final int[] anIntArray215 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(Lclient!na;I)V")
	public static void method1853(@OriginalArg(0) JagString arg0) {
		Static116.method2325(false);
		Static133.method4011(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
	public static void method1854() {
		Static179.aClass99_25.method3104();
		Static169.aClass99_24.method3104();
		Static93.aClass99_14.method3104();
		Static262.aClass99_36.method3104();
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)Z")
	public static boolean method1855(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && Static258.aBooleanArray130.length > arg0 ? Static258.aBooleanArray130[arg0] : false;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)Lclient!ck;")
	public static BasType method1856(@OriginalArg(1) int arg0) {
		@Pc(10) BasType local10 = (BasType) Static262.aClass99_34.method3106((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static167.aClass153_62.method4495(32, arg0);
		local10 = new BasType();
		if (local21 != null) {
			local10.method880(new Buffer(local21));
		}
		local10.method878();
		Static262.aClass99_34.method3095(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
	public static void method1857() {
		Static45.aClass99_6.method3104();
	}
}
