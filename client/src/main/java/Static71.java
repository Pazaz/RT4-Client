import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
	public static int anInt1885;

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "Lsignlink!ll;")
	public static SignLink aClass213_3;

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "Lclient!uc;")
	public static MouseWheel aClass111_2;

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "Lclient!na;")
	private static final Class100 aClass100_415 = Static28.method790("Please remove ");

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "Lclient!na;")
	public static final Class100 aClass100_416 = Static28.method790("V-Brification des mises -9 jour )2 ");

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "Z")
	public static boolean aBoolean107 = true;

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "Lclient!na;")
	public static Class100 aClass100_417 = aClass100_415;

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "[I")
	public static final int[] anIntArray147 = new int[14];

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "Lclient!na;")
	public static Class100 aClass100_418 = aClass100_415;

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "Lclient!na;")
	public static final Class100 aClass100_419 = Static28.method790("ondulation2:");

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IB)Lclient!h;")
	public static Class55 method1439(@OriginalArg(0) int arg0) {
		@Pc(6) Class55 local6 = (Class55) Static27.aClass99_4.method3106((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static167.aClass153_61.method4495(Static18.method554(arg0), Static247.method4247(arg0));
		local6 = new Class55();
		local6.anInt2354 = arg0;
		if (local25 != null) {
			local6.method1827(new Buffer(local25));
		}
		local6.method1826();
		if (local6.anInt2358 != -1) {
			local6.method1832(method1439(local6.anInt2356), method1439(local6.anInt2358));
		}
		if (local6.anInt2334 != -1) {
			local6.method1823(method1439(local6.anInt2363), method1439(local6.anInt2334));
		}
		if (!Static240.aBoolean276 && local6.aBoolean131) {
			local6.aClass100_495 = Static199.aClass100_881;
			local6.anInt2351 = 0;
			local6.aClass100Array71 = Static143.aClass100Array104;
			local6.aBoolean132 = false;
			local6.aClass100Array72 = Static269.aClass100Array87;
		}
		Static27.aClass99_4.method3095(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
	public static void method1441() {
		Static279.aClass99_38.method3103();
		Static56.aClass99_9.method3103();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "([BIZ)I")
	public static int method1442(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static169.method3178(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(IB)V")
	public static void method1443() {
		Static83.aClass99_3.method3102(5);
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
	public static void method1444() {
		for (@Pc(7) int local7 = -1; local7 < Static267.anInt5774; local7++) {
			@Pc(21) int local21;
			if (local7 == -1) {
				local21 = 2047;
			} else {
				local21 = Static105.anIntArray256[local7];
			}
			@Pc(31) Class8_Sub4_Sub1 local31 = Static159.aClass8_Sub4_Sub1Array1[local21];
			if (local31 != null) {
				Static263.method4514(local31.method2693(), local31);
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
	public static void method1445() {
		Static6.aClass3_Sub15_Sub1_1.method2242(177);
		Static6.aClass3_Sub15_Sub1_1.method2230(Static189.anInt4443);
	}
}
