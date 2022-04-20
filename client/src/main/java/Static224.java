import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!sd", name = "I", descriptor = "I")
	public static int anInt5057;

	@OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
	public static int anInt5062;

	@OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
	public static int anInt5063 = 100;

	@OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
	public static int anInt5064 = 0;

	@OriginalMember(owner = "client!sd", name = "V", descriptor = "[I")
	public static final int[] anIntArray443 = new int[100];

	@OriginalMember(owner = "client!sd", name = "X", descriptor = "Z")
	public static boolean aBoolean247 = false;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(II)V")
	public static void method3884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Tile local7 = Static130.aClass3_Sub5ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(30) Tile local30 = Static130.aClass3_Sub5ArrayArrayArray1[local9][arg0][arg1] = Static130.aClass3_Sub5ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local30 != null) {
				local30.anInt672--;
				for (@Pc(40) int local40 = 0; local40 < local30.anInt662; local40++) {
					@Pc(49) Scenery local49 = local30.aClass31Array1[local40];
					if ((local49.aLong56 >> 29 & 0x3L) == 2L && local49.anInt1701 == arg0 && local49.anInt1696 == arg1) {
						local49.anInt1709--;
					}
				}
			}
		}
		if (Static130.aClass3_Sub5ArrayArrayArray1[0][arg0][arg1] == null) {
			Static130.aClass3_Sub5ArrayArrayArray1[0][arg0][arg1] = new Tile(0, arg0, arg1);
		}
		Static130.aClass3_Sub5ArrayArrayArray1[0][arg0][arg1].aClass3_Sub5_1 = local7;
		Static130.aClass3_Sub5ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(B)V")
	public static void method3885() {
		Static83.aClass99_3.method3103();
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V")
	public static void method3888() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("maxMemory");
			if (local12 != null) {
				try {
					@Pc(17) Runtime local17 = Runtime.getRuntime();
					@Pc(24) Long local24 = (Long) local12.invoke(local17, (Object[]) null);
					Static238.anInt5316 = (int) (local24 / 1048576L) + 1;
				} catch (@Pc(34) Throwable local34) {
				}
			}
		} catch (@Pc(36) Exception local36) {
		}
	}
}
