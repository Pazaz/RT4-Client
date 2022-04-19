import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static21 {

	@OriginalMember(owner = "client!bk", name = "I", descriptor = "Lclient!na;")
	private static final JagString aClass100_121 = Static28.method790("yellow:");

	@OriginalMember(owner = "client!bk", name = "K", descriptor = "Lclient!na;")
	private static final JagString aClass100_122 = Static28.method790("Loading config )2 ");

	@OriginalMember(owner = "client!bk", name = "L", descriptor = "Lclient!na;")
	public static JagString aClass100_123 = aClass100_121;

	@OriginalMember(owner = "client!bk", name = "N", descriptor = "Lclient!na;")
	public static JagString aClass100_124 = aClass100_122;

	@OriginalMember(owner = "client!bk", name = "P", descriptor = "Lclient!na;")
	public static final JagString aClass100_125 = Static28.method790("Speicher wird zugewiesen)3");

	@OriginalMember(owner = "client!bk", name = "R", descriptor = "Lclient!na;")
	public static final JagString aClass100_126 = aClass100_121;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)V")
	public static void method619(@OriginalArg(1) int arg0) {
		Static257.aFloatArray2[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		Static257.aFloatArray2[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		Static257.aFloatArray2[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static128.method2481(3);
		Static128.method2481(4);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLclient!wa;)Lclient!re;")
	public static Class18_Sub3 method620(@OriginalArg(1) Buffer arg0) {
		return new Class18_Sub3(arg0.method2213(), arg0.method2213(), arg0.method2213(), arg0.method2213(), arg0.method2213(), arg0.method2213(), arg0.method2213(), arg0.method2213(), arg0.method2220(), arg0.method2229());
	}
}
