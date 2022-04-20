import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static57 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
	public static int anInt1744;

	@OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
	public static int anInt1757;

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
	public static int anInt1747 = 0;

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "Lclient!i;")
	public static final Packet aClass3_Sub15_Sub1_3 = new Packet(65536);

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
	public static int anInt1758 = 0;

	@OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
	public static volatile int anInt1759 = 0;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static245.load(arg4)) {
			Static36.method946(Static241.components[arg4], -1, arg5, arg1, arg3, arg6, arg0, arg2);
		}
	}
}
