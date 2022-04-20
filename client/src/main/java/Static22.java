import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static22 {

	@OriginalMember(owner = "client!bl", name = "P", descriptor = "I")
	public static int js5ConnectDelay = 0;

	@OriginalMember(owner = "client!bl", name = "Q", descriptor = "I")
	public static int anInt723 = 0;

	@OriginalMember(owner = "client!bl", name = "T", descriptor = "I")
	public static int anInt726 = 0;

	@OriginalMember(owner = "client!bl", name = "W", descriptor = "I")
	public static int anInt729 = 0;

	@OriginalMember(owner = "client!bl", name = "X", descriptor = "I")
	public static int anInt730 = -1;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIIII)V")
	public static void method644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static172.anInt4164 <= arg6 && Static224.anInt5063 >= arg5 && arg4 >= Static267.anInt5773 && arg1 <= Static106.anInt2869) {
			Static153.method2907(arg3, arg4, arg1, arg2, arg0, arg5, arg6);
		} else {
			Static244.method4222(arg5, arg2, arg1, arg0, arg3, arg4, arg6);
		}
	}
}
