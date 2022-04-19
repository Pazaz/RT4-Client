import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "[I")
	public static int[] anIntArray293;

	@OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
	public static int anInt3143;

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "Lclient!ih;")
	public static final LinkedList aClass69_77 = new LinkedList();

	@OriginalMember(owner = "client!ka", name = "t", descriptor = "[I")
	public static final int[] anIntArray294 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
	public static void method2481(@OriginalArg(1) int arg0) {
		if (arg0 == Static48.anInt1447) {
			@Pc(12) MaterialRenderer local12 = Static2.anInterface4Array1[arg0];
			local12.method4604(Static158.anInt3857);
		}
	}
}
