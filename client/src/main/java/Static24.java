import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bn", name = "N", descriptor = "Lclient!be;")
	public static Component component;

	@OriginalMember(owner = "client!bn", name = "O", descriptor = "I")
	public static int anInt761;

	@OriginalMember(owner = "client!bn", name = "V", descriptor = "I")
	public static int anInt766 = 0;

	@OriginalMember(owner = "client!bn", name = "eb", descriptor = "I")
	public static int anInt773 = 0;

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(II)V")
	public static void method666() {
		Static232.aClass99_30.method3102(5);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)I")
	public static int method667(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = 0;
		while (arg0 > 0) {
			local8 = local8 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local8;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(BZLclient!na;)V")
	public static void method668(@OriginalArg(1) boolean arg0, @OriginalArg(2) JagString arg1) {
		@Pc(9) JagString local9 = arg1.toLowerCase();
		@Pc(11) int local11 = 0;
		@Pc(22) short[] local22 = new short[16];
		@Pc(28) int local28 = arg0 ? 32768 : 0;
		@Pc(36) int local36 = (arg0 ? Static34.anInt1047 : Static144.anInt3490) + local28;
		for (@Pc(38) int local38 = local28; local38 < local36; local38++) {
			@Pc(45) Class3_Sub2_Sub6 local45 = Static230.method3953(local38);
			if (local45.aBoolean60 && local45.method769().toLowerCase().indexOf(local9) != -1) {
				if (local11 >= 50) {
					Static111.anInt2905 = -1;
					Static169.aShortArray52 = null;
					return;
				}
				if (local11 >= local22.length) {
					@Pc(79) short[] local79 = new short[local22.length * 2];
					for (@Pc(81) int local81 = 0; local81 < local11; local81++) {
						local79[local81] = local22[local81];
					}
					local22 = local79;
				}
				local22[local11++] = (short) local38;
			}
		}
		Static169.aShortArray52 = local22;
		Static111.anInt2905 = local11;
		Static67.anInt3356 = 0;
		@Pc(113) JagString[] local113 = new JagString[Static111.anInt2905];
		for (@Pc(115) int local115 = 0; local115 < Static111.anInt2905; local115++) {
			local113[local115] = Static230.method3953(local22[local115]).method769();
		}
		Static202.method3656(local113, Static169.aShortArray52);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIB)I")
	public static int method670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(47) int local47 = Static138.method2695(arg0 - 1, arg1 + -1) + Static138.method2695(arg0 + 1, arg1 + -1) + Static138.method2695(arg0 + -1, arg1 - -1) + Static138.method2695(arg0 + 1, arg1 - -1);
		@Pc(76) int local76 = Static138.method2695(arg0 - 1, arg1) + Static138.method2695(arg0 + 1, arg1) + Static138.method2695(arg0, arg1 + -1) + Static138.method2695(arg0, arg1 + 1);
		@Pc(81) int local81 = Static138.method2695(arg0, arg1);
		return local76 / 8 + local47 / 16 + local81 / 4;
	}

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "(II)Z")
	public static boolean method671(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}
}
