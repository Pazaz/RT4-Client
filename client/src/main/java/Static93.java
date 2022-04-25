import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!he", name = "db", descriptor = "Lclient!na;")
	public static final JagString aClass100_517 = JagString.parse("");

	@OriginalMember(owner = "client!he", name = "gb", descriptor = "Lclient!na;")
	public static final JagString aClass100_518 = JagString.parse("www");

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(II)V")
	public static void method1906(@OriginalArg(1) int arg0) {
		@Pc(12) DelayedStateChange local12 = Static238.method4143(7, arg0);
		local12.pushClient();
	}
}
