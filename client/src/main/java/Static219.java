import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!rl", name = "V", descriptor = "[Lclient!qf;")
	public static Sprite[] aClass3_Sub2_Sub1Array9;

	@OriginalMember(owner = "client!rl", name = "P", descriptor = "Lclient!n;")
	public static final SoftLruHashTable aClass99_27 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!rl", name = "S", descriptor = "Lclient!na;")
	public static final JagString aClass100_920 = Static28.parse("hitmarks");

	@OriginalMember(owner = "client!rl", name = "T", descriptor = "Lclient!na;")
	private static final JagString aClass100_921 = Static28.parse("Sat");

	@OriginalMember(owner = "client!rl", name = "U", descriptor = "Lclient!na;")
	private static final JagString aClass100_922 = Static28.parse("Mon");

	@OriginalMember(owner = "client!rl", name = "W", descriptor = "Lclient!na;")
	private static final JagString aClass100_923 = Static28.parse("Fri");

	@OriginalMember(owner = "client!rl", name = "X", descriptor = "I")
	public static int anInt4937 = 0;

	@OriginalMember(owner = "client!rl", name = "db", descriptor = "Lclient!na;")
	private static final JagString aClass100_927 = Static28.parse("Sun");

	@OriginalMember(owner = "client!rl", name = "cb", descriptor = "Lclient!na;")
	private static final JagString aClass100_926 = Static28.parse("Tue");

	@OriginalMember(owner = "client!rl", name = "ab", descriptor = "Lclient!na;")
	private static final JagString aClass100_924 = Static28.parse("Wed");

	@OriginalMember(owner = "client!rl", name = "bb", descriptor = "Lclient!na;")
	private static final JagString aClass100_925 = Static28.parse("Thu");

	@OriginalMember(owner = "client!rl", name = "Y", descriptor = "[Lclient!na;")
	public static final JagString[] aClass100Array149 = new JagString[] { aClass100_927, aClass100_922, aClass100_926, aClass100_924, aClass100_925, aClass100_923, aClass100_921 };

	@OriginalMember(owner = "client!rl", name = "Z", descriptor = "I")
	public static final int anInt4938 = 7759444;

	@OriginalMember(owner = "client!rl", name = "eb", descriptor = "Lclient!na;")
	public static final JagString aClass100_928 = Static28.parse("(U0a )2 in: ");

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "(I)V")
	public static void method3796() {
		for (@Pc(10) Class3_Sub7 local10 = (Class3_Sub7) Static26.aClass69_27.method2289(); local10 != null; local10 = (Class3_Sub7) Static26.aClass69_27.method2288()) {
			if (local10.anInt924 == -1) {
				local10.anInt925 = 0;
				Static226.method3898(local10);
			} else {
				local10.method4658();
			}
		}
	}
}
