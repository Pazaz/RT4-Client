import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
	public static int anInt917;

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
	public static int anInt919;

	@OriginalMember(owner = "client!cd", name = "B", descriptor = "Lclient!ve;")
	public static Js5 aClass153_18;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ve;B)I")
	public static int method789(@OriginalArg(0) Js5 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4506(Static280.anInt5900)) {
			local5++;
		}
		if (arg0.method4506(Static131.anInt3261)) {
			local5++;
		}
		if (arg0.method4506(Static36.anInt1165)) {
			local5++;
		}
		if (arg0.method4506(Static214.anInt5579)) {
			local5++;
		}
		if (arg0.method4506(Static34.anInt1049)) {
			local5++;
		}
		if (arg0.method4506(Static202.anInt4741)) {
			local5++;
		}
		if (arg0.method4506(Static149.anInt3551)) {
			local5++;
		}
		if (arg0.method4506(Static19.anInt647)) {
			local5++;
		}
		if (arg0.method4506(Static32.anInt1016)) {
			local5++;
		}
		if (arg0.method4506(Static78.anInt2147)) {
			local5++;
		}
		if (arg0.method4506(Static124.anInt3083)) {
			local5++;
		}
		if (arg0.method4506(Static224.anInt5057)) {
			local5++;
		}
		if (arg0.method4506(Static84.anInt2257)) {
			local5++;
		}
		if (arg0.method4506(Static163.anInt3962)) {
			local5++;
		}
		if (arg0.method4506(Static128.anInt3143)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!na;")
	public static JagString parse(@OriginalArg(0) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(13) JagString local13 = new JagString();
		@Pc(15) int local15 = 0;
		local13.aByteArray52 = new byte[local9];
		while (local9 > local15) {
			@Pc(29) int local29 = local6[local15++] & 0xFF;
			if (local29 <= 45 && local29 >= 40) {
				if (local15 >= local9) {
					break;
				}
				@Pc(51) int local51 = local6[local15++] & 0xFF;
				local13.aByteArray52[local13.anInt4030++] = (byte) (local51 + (local29 + -40) * 43 - 48);
			} else if (local29 != 0) {
				local13.aByteArray52[local13.anInt4030++] = (byte) local29;
			}
		}
		local13.method3156();
		return local13.method3151();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIZ)V")
	public static void method792(@OriginalArg(3) int arg0, @OriginalArg(4) boolean arg1) {
		Static152.anInt3594 = 104;
		Static99.anInt2550 = 104;
		Static277.anInt5855 = arg0;
		Static197.aClass3_Sub5ArrayArrayArray2 = new Tile[4][Static152.anInt3594][Static99.anInt2550];
		Static107.anIntArrayArrayArray10 = new int[4][Static152.anInt3594 + 1][Static99.anInt2550 + 1];
		if (GlRenderer.enabled) {
			Static36.aClass3_Sub14ArrayArray1 = new Class3_Sub14[4][];
		}
		if (arg1) {
			Static276.aClass3_Sub5ArrayArrayArray3 = new Tile[1][Static152.anInt3594][Static99.anInt2550];
			Static62.anIntArrayArray11 = new int[Static152.anInt3594][Static99.anInt2550];
			Static80.anIntArrayArrayArray19 = new int[1][Static152.anInt3594 + 1][Static99.anInt2550 + 1];
			if (GlRenderer.enabled) {
				Static195.aClass3_Sub14ArrayArray3 = new Class3_Sub14[1][];
			}
		} else {
			Static276.aClass3_Sub5ArrayArrayArray3 = null;
			Static62.anIntArrayArray11 = null;
			Static80.anIntArrayArrayArray19 = null;
			Static195.aClass3_Sub14ArrayArray3 = null;
		}
		Static278.method4648(false);
		Static91.aClass120Array1 = new Class120[500];
		anInt917 = 0;
		Static247.aClass120Array2 = new Class120[500];
		Static215.anInt4870 = 0;
		Static140.anIntArrayArrayArray12 = new int[4][Static152.anInt3594 + 1][Static99.anInt2550 + 1];
		Static243.aClass31Array3 = new Scenery[5000];
		Static22.anInt726 = 0;
		Static25.aClass31Array2 = new Scenery[100];
		Static48.aBooleanArrayArray1 = new boolean[Static277.anInt5855 + Static277.anInt5855 + 1][Static277.anInt5855 + Static277.anInt5855 + 1];
		Static89.aBooleanArrayArray3 = new boolean[Static277.anInt5855 + Static277.anInt5855 + 2][Static277.anInt5855 + Static277.anInt5855 + 2];
		Static232.aByteArrayArrayArray13 = new byte[4][Static152.anInt3594][Static99.anInt2550];
	}
}
