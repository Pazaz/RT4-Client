import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!il", name = "O", descriptor = "I")
	public static int anInt4612;

	@OriginalMember(owner = "client!il", name = "I", descriptor = "I")
	public static int anInt4609 = 3;

	@OriginalMember(owner = "client!il", name = "J", descriptor = "Lclient!na;")
	private static final JagString aClass100_868 = Static28.method790("Created gameworld");

	@OriginalMember(owner = "client!il", name = "M", descriptor = "Lclient!na;")
	public static JagString aClass100_869 = aClass100_868;

	@OriginalMember(owner = "client!il", name = "Q", descriptor = "Lclient!na;")
	public static final JagString aClass100_870 = Static28.method790("Textures charg-Bes");

	@OriginalMember(owner = "client!il", name = "R", descriptor = "Lclient!na;")
	public static final JagString aClass100_871 = Static28.method790("Liste des serveurs charg-Be");

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V")
	public static void method3556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static158.aBoolean187 = true;
		Static160.anInt3902 = arg0;
		Static89.anInt2388 = arg1;
		Static131.anInt3259 = arg2;
		Static56.anInt1742 = -1;
		Static116.anInt2954 = -1;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BII)Z")
	public static boolean method3557(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		@Pc(30) Class118 local30 = Static271.method4601(arg0);
		return local30.method3416(arg1);
	}
}
