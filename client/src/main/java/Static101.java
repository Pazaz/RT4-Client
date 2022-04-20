import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!hm", name = "gb", descriptor = "J")
	public static long aLong98;

	@OriginalMember(owner = "client!hm", name = "R", descriptor = "Lclient!na;")
	public static final JagString aClass100_537 = Static28.parse("<img=1>");

	@OriginalMember(owner = "client!hm", name = "T", descriptor = "Lclient!na;")
	public static final JagString aClass100_538 = Static28.parse(" ");

	@OriginalMember(owner = "client!hm", name = "Y", descriptor = "Lclient!na;")
	public static final JagString aClass100_539 = Static28.parse("Fps:");

	@OriginalMember(owner = "client!hm", name = "ab", descriptor = "I")
	public static int anInt2640 = 0;

	@OriginalMember(owner = "client!hm", name = "fb", descriptor = "[Lclient!ba;")
	public static World[] aClass10_Sub1Array1 = new World[0];

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!na;B)I")
	public static int method2053(@OriginalArg(0) JagString arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static153.aClass100Array113.length; local12++) {
			if (Static153.aClass100Array113[local12].method3111(arg0)) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIII)V")
	public static void method2054(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8;
		if (arg0 <= arg2) {
			for (local8 = arg0; local8 < arg2; local8++) {
				Static71.anIntArrayArray10[local8][arg1] = arg3;
			}
		} else {
			for (local8 = arg2; local8 < arg0; local8++) {
				Static71.anIntArrayArray10[local8][arg1] = arg3;
			}
		}
	}
}
