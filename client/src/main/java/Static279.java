import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!wk", name = "v", descriptor = "[I")
	public static int[] anIntArray568;

	@OriginalMember(owner = "client!wk", name = "w", descriptor = "I")
	public static int anInt5880;

	@OriginalMember(owner = "client!wk", name = "t", descriptor = "Lclient!n;")
	public static final SoftLruHashTable aClass99_38 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!wk", name = "u", descriptor = "Lclient!na;")
	public static final JagString aClass100_1106 = Static28.parse("::clientjs5drop");

	@OriginalMember(owner = "client!wk", name = "x", descriptor = "Lclient!na;")
	public static final JagString aClass100_1107 = Static28.parse(")4l=");

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(II)V")
	public static void method4662() {
		Static250.aClass99_33.method3102(5);
		Static139.aClass99_21.method3102(5);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I[Lclient!na;)[Lclient!na;")
	public static JagString[] method4664(@OriginalArg(1) JagString[] arg0) {
		@Pc(8) JagString[] local8 = new JagString[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = Static34.method882(new JagString[] { Static123.method2423(local15), Static27.aClass100_168 });
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = Static34.method882(new JagString[] { local8[local15], arg0[local15] });
			}
		}
		return local8;
	}
}
