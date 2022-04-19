import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ba", name = "D", descriptor = "Lclient!vh;")
	public static Class62 aClass62_1;

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "Lclient!na;")
	private static final Class100 aClass100_68 = Static28.method790("Loaded update list");

	@OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
	public static int anInt384 = 0;

	@OriginalMember(owner = "client!ba", name = "x", descriptor = "Z")
	public static boolean aBoolean15 = true;

	@OriginalMember(owner = "client!ba", name = "z", descriptor = "Lclient!na;")
	public static Class100 aClass100_70 = aClass100_68;

	@OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
	public static int anInt386 = 20;

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "Lclient!na;")
	public static final Class100 aClass100_72 = Static28.method790("Stufe: ");

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V")
	public static void method443() {
		Static262.aClass99_35.method3104();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)I")
	public static int method446(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(17) Class3_Sub27 local17 = (Class3_Sub27) Static20.aClass133_2.method3863((long) arg0);
		if (local17 == null) {
			return Static246.method4241(arg0).anInt3706;
		}
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = 0; local33 < local17.anIntArray420.length; local33++) {
			if (local17.anIntArray420[local33] == -1) {
				local31++;
			}
		}
		return local31 + Static246.method4241(arg0).anInt3706 - local17.anIntArray420.length;
	}
}
