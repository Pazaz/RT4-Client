import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!he", name = "cb", descriptor = "Lclient!ve;")
	public static Js5 aClass153_41;

	@OriginalMember(owner = "client!he", name = "V", descriptor = "Lclient!n;")
	public static final SoftLruHashTable aClass99_13 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!he", name = "Y", descriptor = "I")
	public static volatile int anInt2467 = 0;

	@OriginalMember(owner = "client!he", name = "ab", descriptor = "Lclient!sc;")
	public static final HashTable aClass133_7 = new HashTable(16);

	@OriginalMember(owner = "client!he", name = "bb", descriptor = "Lclient!ug;")
	public static Mouse aClass150_1 = new Mouse();

	@OriginalMember(owner = "client!he", name = "db", descriptor = "Lclient!na;")
	public static final JagString aClass100_517 = Static28.parse("");

	@OriginalMember(owner = "client!he", name = "eb", descriptor = "[I")
	public static final int[] anIntArray219 = new int[1000];

	@OriginalMember(owner = "client!he", name = "fb", descriptor = "Lclient!n;")
	public static final SoftLruHashTable aClass99_14 = new SoftLruHashTable(30);

	@OriginalMember(owner = "client!he", name = "gb", descriptor = "Lclient!na;")
	public static final JagString aClass100_518 = Static28.parse("www");

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(II)V")
	public static void method1906(@OriginalArg(1) int arg0) {
		@Pc(12) DelayedStateChange local12 = Static238.method4143(7, arg0);
		local12.method1007();
	}
}
