import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "Z")
	public static boolean aBoolean256 = false;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)I")
	public static int method4047() {
		if (Static127.aBoolean160) {
			return 0;
		} else if (Static138.method2697()) {
			return Static80.aBoolean231 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILclient!be;BIIII)V")
	public static void method4049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static45.aBoolean84) {
			Static42.anInt1396 = 32;
		} else {
			Static42.anInt1396 = 0;
		}
		Static45.aBoolean84 = false;
		@Pc(139) int local139;
		if (Static22.anInt723 != 0) {
			if (arg4 <= arg3 && arg4 + 16 > arg3 && arg0 >= arg5 && arg5 + 16 > arg0) {
				arg2.scrollY -= 4;
				Static43.method1143(arg2);
			} else if (arg3 >= arg4 && arg3 < arg4 + 16 && arg0 >= arg1 + arg5 - 16 && arg1 + arg5 > arg0) {
				arg2.scrollY += 4;
				Static43.method1143(arg2);
			} else if (arg3 >= arg4 - Static42.anInt1396 && arg3 < arg4 + Static42.anInt1396 + 16 && arg0 >= arg5 + 16 && arg1 + arg5 - 16 > arg0) {
				local139 = arg1 * (arg1 - 32) / arg6;
				if (local139 < 8) {
					local139 = 8;
				}
				@Pc(150) int local150 = arg1 - local139 - 32;
				@Pc(162) int local162 = arg0 - local139 / 2 - arg5 - 16;
				arg2.scrollY = (arg6 - arg1) * local162 / local150;
				Static43.method1143(arg2);
				Static45.aBoolean84 = true;
			}
		}
		if (Static58.wheelRotation == 0) {
			return;
		}
		local139 = arg2.anInt445;
		if (arg4 - local139 <= arg3 && arg5 <= arg0 && arg3 < arg4 + 16 && arg1 + arg5 >= arg0) {
			arg2.scrollY += Static58.wheelRotation * 45;
			Static43.method1143(arg2);
		}
	}
}
