import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!sa", name = "R", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!sa", name = "Q", descriptor = "[I")
	public static final int[] anIntArray437 = new int[5];

	@OriginalMember(owner = "client!sa", name = "W", descriptor = "Z")
	public static boolean aBoolean246 = true;

	@OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
	public static volatile int anInt4973 = 0;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(III)I")
	public static int method3825(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (arg0 + local12) / arg1 - local12;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIBI)V")
	public static void method3826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			Static131.method2576(Static71.anIntArrayArray10[arg1], arg3, arg2, arg0);
		} else {
			Static131.method2576(Static71.anIntArrayArray10[arg1], arg2, arg3, arg0);
		}
	}
}
