import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static84 {

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "F")
	public static float aFloat10;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "[I")
	public static final int[] anIntArray209 = new int[4096];

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "Z")
	public static boolean aBoolean127 = false;

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
	public static int anInt2255 = 0;

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
	public static int anInt2256 = 0;

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V")
	public static void method1771() {
		Static62.anIntArray150 = Static206.method3679(0.4F);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!rg;Lclient!rg;B)V")
	public static void method1772(@OriginalArg(0) SecondaryNode arg0, @OriginalArg(1) SecondaryNode arg1) {
		if (arg1.aClass3_Sub2_66 != null) {
			arg1.method4365();
		}
		arg1.aClass3_Sub2_66 = arg0;
		arg1.aClass3_Sub2_67 = arg0.aClass3_Sub2_67;
		arg1.aClass3_Sub2_66.aClass3_Sub2_67 = arg1;
		arg1.aClass3_Sub2_67.aClass3_Sub2_66 = arg1;
	}
}
