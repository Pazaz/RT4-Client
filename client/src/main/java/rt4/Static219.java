package rt4;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

    @OriginalMember(owner = "client!rl", name = "T", descriptor = "Lclient!na;")
	private static final JagString aClass100_921 = JagString.parse("Sat");

	@OriginalMember(owner = "client!rl", name = "U", descriptor = "Lclient!na;")
	private static final JagString aClass100_922 = JagString.parse("Mon");

	@OriginalMember(owner = "client!rl", name = "W", descriptor = "Lclient!na;")
	private static final JagString aClass100_923 = JagString.parse("Fri");

    @OriginalMember(owner = "client!rl", name = "db", descriptor = "Lclient!na;")
	private static final JagString aClass100_927 = JagString.parse("Sun");

	@OriginalMember(owner = "client!rl", name = "cb", descriptor = "Lclient!na;")
	private static final JagString aClass100_926 = JagString.parse("Tue");

	@OriginalMember(owner = "client!rl", name = "ab", descriptor = "Lclient!na;")
	private static final JagString aClass100_924 = JagString.parse("Wed");

	@OriginalMember(owner = "client!rl", name = "bb", descriptor = "Lclient!na;")
	private static final JagString aClass100_925 = JagString.parse("Thu");

	@OriginalMember(owner = "client!rl", name = "Y", descriptor = "[Lclient!na;")
	public static final JagString[] aClass100Array149 = new JagString[] { aClass100_927, aClass100_922, aClass100_926, aClass100_924, aClass100_925, aClass100_923, aClass100_921 };

	@OriginalMember(owner = "client!rl", name = "Z", descriptor = "I")
	public static final int anInt4938 = 7759444;

	@OriginalMember(owner = "client!rl", name = "eb", descriptor = "Lclient!na;")
	public static final JagString aClass100_928 = JagString.parse("(U0a )2 in: ");

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "(I)V")
	public static void method3796() {
		for (@Pc(10) Class3_Sub7 local10 = (Class3_Sub7) Static26.aClass69_27.method2289(); local10 != null; local10 = (Class3_Sub7) Static26.aClass69_27.method2288()) {
			if (local10.anInt924 == -1) {
				local10.anInt925 = 0;
				Static226.method3898(local10);
			} else {
				local10.unlink();
			}
		}
	}
}
