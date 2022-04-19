import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static205 {

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "Lclient!na;")
	public static final JagString aClass100_897 = Static28.method790("rouge:");

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "Lclient!na;")
	public static final JagString aClass100_898 = Static28.method790("Texturen geladen)3");

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "[I")
	public static final int[] anIntArray426 = new int[128];

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!be;BI)Lclient!na;")
	public static JagString method3677(@OriginalArg(0) Class13 arg0, @OriginalArg(2) int arg1) {
		if (!Static36.method940(arg0).method503(arg1) && arg0.anObjectArray29 == null) {
			return null;
		} else if (arg0.aClass100Array18 == null || arg0.aClass100Array18.length <= arg1 || arg0.aClass100Array18[arg1] == null || arg0.aClass100Array18[arg1].method3144().method3120() == 0) {
			return Static121.aBoolean154 ? Static34.method882(new JagString[] { Static207.aClass100_903, Static123.method2423(arg1) }) : null;
		} else {
			return arg0.aClass100Array18[arg1];
		}
	}
}
