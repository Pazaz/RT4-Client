import org.openrs2.deob.annotation.OriginalMember;

public final class Static86 {

    @OriginalMember(owner = "client!gm", name = "R", descriptor = "I")
	public static int anInt2293 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!gm", name = "W", descriptor = "Lclient!na;")
	public static final JagString aClass100_488 = JagString.parse("_");

    @OriginalMember(owner = "client!gm", name = "gb", descriptor = "[I")
	public static final int[] anIntArray211 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "(B)V")
	public static void setInstantFade() {
		Static222.instantScreenFade = true;
	}

}
