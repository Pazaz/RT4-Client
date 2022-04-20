import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static189 {

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
	public static int anInt4457;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
	public static int anInt4443 = 0;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
	public static int anInt4451 = 0;

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "Lclient!na;")
	public static final JagString aClass100_835 = Static28.parse("hint_mapmarkers");

	@OriginalMember(owner = "client!pe", name = "z", descriptor = "Lclient!na;")
	public static final JagString aClass100_837 = Static28.parse("mapdots");

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BZ)V")
	public static void method3438(@OriginalArg(1) boolean arg0) {
		if (arg0 != Static30.aBoolean61) {
			Static30.aBoolean61 = arg0;
			Static90.method1854();
		}
	}
}
