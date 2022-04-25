import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(13) int local13 = arg2 - arg6;
		@Pc(17) int local17 = arg3 - arg7;
		@Pc(26) int local26 = (arg0 - arg1 << 16) / local13;
		@Pc(35) int local35 = (arg4 - arg5 << 16) / local17;
		Static232.method3991(arg1, arg3, arg2, local35, arg6, local26, arg7, arg5);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V")
	public static void setIdleLoops(@OriginalArg(1) int arg0) {
		@Pc(10) Mouse local10 = Static93.instance;
		synchronized (Static93.instance) {
			Static93.anInt2467 = arg0;
		}
	}
}
