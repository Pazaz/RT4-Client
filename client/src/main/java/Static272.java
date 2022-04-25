import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "Lclient!na;")
	public static final JagString aClass100_989 = JagString.parse("cookieprefix");

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
	public static int anInt5214 = 0;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BII)V")
	public static void method3995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) VarbitType local14 = VarbitTypeList.get(arg1);
		@Pc(17) int local17 = local14.baseVar;
		@Pc(20) int local20 = local14.endBit;
		@Pc(23) int local23 = local14.startBit;
		@Pc(29) int local29 = Class3_Sub9.anIntArray135[local20 - local23];
		if (arg0 < 0 || local29 < arg0) {
			arg0 = 0;
		}
		local29 <<= local23;
		Static170.method2575(arg0 << local23 & local29 | ~local29 & Static106.anIntArray257[local17], local17);
	}
}
