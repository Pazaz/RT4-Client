import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "Lclient!ve;")
	public static Js5 aClass153_107;

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
	public static int anInt5731;

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
	public static int anInt5741;

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "Z")
	public static boolean aBoolean298 = false;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BIIII)V")
	public static void method4505(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) DelayedStateChange local8 = Static238.method4143(8, arg1);
		local8.method1017();
		local8.intArg2 = arg0;
		local8.intArg1 = arg3;
		local8.intArg3 = arg2;
	}
}
