import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!en", name = "z", descriptor = "F")
	public static float aFloat7;

	@OriginalMember(owner = "client!en", name = "e", descriptor = "Lclient!na;")
	public static final JagString aClass100_422 = JagString.parse("::fpsoff");

	@OriginalMember(owner = "client!en", name = "h", descriptor = "Lclient!na;")
	public static final JagString aClass100_423 = JagString.parse(":chalreq:");

	@OriginalMember(owner = "client!en", name = "t", descriptor = "[I")
	public static final int[] anIntArray148 = new int[14];

	@OriginalMember(owner = "client!en", name = "x", descriptor = "Lclient!na;")
	public static final JagString aClass100_424 = JagString.parse("http:)4)4");

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIB)V")
	public static void teleport(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(66) JagString local66 = JagString.concatenate(new JagString[] { Static96.aClass100_521, Static123.parseInt(arg2), Static159.aClass100_760, Static123.parseInt(arg0 >> 6), Static159.aClass100_760, Static123.parseInt(arg1 >> 6), Static159.aClass100_760, Static123.parseInt(arg0 & 0x3F), Static159.aClass100_760, Static123.parseInt(arg1 & 0x3F) });
		local66.method3129();
		Static127.method2470(local66);
	}
}
