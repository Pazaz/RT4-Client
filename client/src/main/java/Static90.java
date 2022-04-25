import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static90 {

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "[I")
	public static final int[] anIntArray215 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(Lclient!na;I)V")
	public static void method1853(@OriginalArg(0) JagString arg0) {
		WorldMap.clear(false);
		Static133.method4011(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)Z")
	public static boolean method1855(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && MapList.aBooleanArray130.length > arg0 ? MapList.aBooleanArray130[arg0] : false;
	}

}
