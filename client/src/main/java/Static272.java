import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Lclient!gn;")
	public static final LruHashTable aClass54_14 = new LruHashTable(64);

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "[I")
	public static final int[] anIntArray451 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "Lclient!na;")
	public static final JagString aClass100_989 = Static28.parse("cookieprefix");

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "Lclient!na;")
	public static final JagString aClass100_990 = Static28.parse("::errortest");

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
	public static int anInt5214 = 0;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BII)V")
	public static void method3995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class85 local14 = Static125.method2449(arg1);
		@Pc(17) int local17 = local14.anInt3327;
		@Pc(20) int local20 = local14.anInt3323;
		@Pc(23) int local23 = local14.anInt3318;
		@Pc(29) int local29 = Class3_Sub9.anIntArray135[local20 - local23];
		if (arg0 < 0 || local29 < arg0) {
			arg0 = 0;
		}
		local29 <<= local23;
		Static170.method2575(arg0 << local23 & local29 | ~local29 & Static106.anIntArray257[local17], local17);
	}
}
