import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "[I")
	public static int[] anIntArray330;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "Lclient!ih;")
	public static final LinkedList aClass69_84 = new LinkedList();

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "[I")
	public static final int[] anIntArray331 = new int[1000];

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
	public static int anInt3497 = 0;

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
	public static int anInt3502 = -1;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	public static void method2742() {
		if (Static244.anInt5370 == 10 && GlRenderer.enabled) {
			Static196.method3534(28);
		}
		if (Static244.anInt5370 == 30) {
			Static196.method3534(25);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!ve;)V")
	public static void method2743(@OriginalArg(1) Js5 arg0) {
		Static233.aClass36_Sub1Array1 = Static162.method3088(Static138.anInt3443, arg0);
		Static96.anIntArray235 = new int[256];
		@Pc(15) int local15;
		for (local15 = 0; local15 < 3; local15++) {
			@Pc(30) int local30 = Static225.anIntArray445[local15 + 1] >> 16 & 0xFF;
			@Pc(39) float local39 = (float) (Static225.anIntArray445[local15] >> 16 & 0xFF);
			@Pc(48) float local48 = (float) (Static225.anIntArray445[local15] >> 8 & 0xFF);
			@Pc(55) float local55 = (float) (Static225.anIntArray445[local15] & 0xFF);
			@Pc(62) float local62 = ((float) local30 - local39) / 64.0F;
			@Pc(72) int local72 = Static225.anIntArray445[local15 + 1] >> 8 & 0xFF;
			@Pc(80) float local80 = ((float) local72 - local48) / 64.0F;
			@Pc(88) int local88 = Static225.anIntArray445[local15 + 1] & 0xFF;
			@Pc(95) float local95 = ((float) local88 - local55) / 64.0F;
			for (@Pc(97) int local97 = 0; local97 < 64; local97++) {
				Static96.anIntArray235[local97 + local15 * 64] = (int) local55 | (int) local48 << 8 | (int) local39 << 16;
				local48 += local80;
				local55 += local95;
				local39 += local62;
			}
		}
		for (local15 = 192; local15 < 255; local15++) {
			Static96.anIntArray235[local15] = Static225.anIntArray445[3];
		}
		Static270.anIntArray562 = new int[32768];
		Static263.anIntArray516 = new int[32768];
		Static69.method1545(null);
		Static103.anIntArray254 = new int[32768];
		Static216.anIntArray188 = new int[32768];
		Static167.aClass3_Sub2_Sub1_Sub1_3 = new SoftwareSprite(128, 254);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
	public static void method2744() {
		@Pc(3) int local3 = Static229.anInt5138;
		@Pc(9) int local9 = Static24.anInt761;
		@Pc(11) int local11 = Static183.anInt4271;
		@Pc(15) int local15 = Static13.anInt436;
		if (GlRenderer.enabled) {
			Static46.method1186(local11, local3, local9, local15, 6116423);
			Static46.method1186(local11 + 1, local3 + 1, local9 - 2, 16, 0);
			Static46.method1179(local11 + 1, local3 + 18, local9 - 2, local15 + -19, 0);
		} else {
			Static129.method2495(local11, local3, local9, local15, 6116423);
			Static129.method2495(local11 + 1, local3 + 1, local9 - 2, 16, 0);
			Static129.method2483(local11 + 1, local3 + 18, local9 - 2, local15 + -19, 0);
		}
		Static280.aClass3_Sub2_Sub9_43.method2857(LocalizedText.CHOOSE_OPTION, local11 + 3, local3 + 14, 6116423, -1);
		@Pc(96) int local96 = Static223.anInt5032;
		@Pc(98) int local98 = Static215.anInt4873;
		for (@Pc(107) int local107 = 0; local107 < Static231.anInt5204; local107++) {
			@Pc(127) int local127 = (Static231.anInt5204 - local107 - 1) * 15 + local3 + 31;
			@Pc(129) int local129 = 16777215;
			if (local11 < local98 && local98 < local11 + local9 && local127 - 13 < local96 && local96 < local127 + 3) {
				local129 = 16776960;
			}
			Static280.aClass3_Sub2_Sub9_43.method2857(Static269.method2228(local107), local11 + 3, local127, local129, 0);
		}
		Static121.method2407(Static183.anInt4271, Static229.anInt5138, Static13.anInt436, Static24.anInt761);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIB)V")
	public static void method2745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) DelayedStateChange local8 = Static238.method4143(10, arg0);
		local8.method1017();
		local8.intArg3 = arg2;
		local8.intArg1 = arg3;
		local8.intArg2 = arg1;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)I")
	public static int method2746() {
		return ((Static99.aBoolean143 ? 1 : 0) << 19) + (((Static71.aBoolean107 ? 1 : 0) << 16) + ((Static220.aBoolean244 ? 1 : 0) << 15) + ((Static178.highDetailLighting ? 1 : 0) << 13) + ((Static209.aBoolean240 ? 1 : 0) << 10) + ((Static159.aBoolean189 ? 1 : 0) << 9) + ((Static15.aBoolean33 ? 1 : 0) << 7) + ((Static53.aBoolean99 ? 1 : 0) << 6) + ((Static250.aBoolean283 ? 1 : 0) << 5) + (((Static162.aBoolean190 ? 1 : 0) << 3) + (Static113.anInt4609 & 0x7) - (-((Static80.aBoolean231 ? 1 : 0) << 4) + -((Static11.aBoolean15 ? 1 : 0) << 8)) - (-((Static139.anInt3451 & 0x3) << 11) + -((Static125.anInt3104 == 0 ? 0 : 1) << 20) - (((Static12.anInt391 == 0 ? 0 : 1) << 21) + ((Static30.anInt978 == 0 ? 0 : 1) << 22)))) + (Static76.method1644() << 23));
	}
}
