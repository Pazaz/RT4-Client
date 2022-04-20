import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "Z")
	public static boolean aBoolean61;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "Lclient!na;")
	public static final JagString aClass100_184 = Static28.parse("1");

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
	public static int anInt978 = 127;

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "Lclient!na;")
	public static final JagString aClass100_185 = Static28.parse(")3");

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZILclient!ve;I)[Lclient!ek;")
	private static SoftwareIndexedSprite[] method837(@OriginalArg(1) int arg0, @OriginalArg(2) Js5 arg1) {
		return Static234.method4016(arg1, 0, arg0) ? Static121.method2406() : null;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILclient!ve;)V")
	public static void method839(@OriginalArg(1) Js5 arg0) {
		Static173.aClass3_Sub2_Sub1_Sub1Array9 = Static265.method4523(Static280.anInt5900, arg0);
		Static213.aClass3_Sub2_Sub1Array8 = Static209.method3708(Static131.anInt3261, arg0);
		Static116.aClass3_Sub2_Sub1Array3 = Static209.method3708(Static36.anInt1165, arg0);
		Static219.aClass3_Sub2_Sub1Array9 = Static209.method3708(Static214.anInt5579, arg0);
		Static138.aClass3_Sub2_Sub1Array5 = Static209.method3708(Static34.anInt1049, arg0);
		Static276.aClass3_Sub2_Sub1Array11 = Static209.method3708(Static202.anInt4741, arg0);
		Static149.aClass3_Sub2_Sub1Array7 = Static209.method3708(Static149.anInt3551, arg0);
		Static84.aClass3_Sub2_Sub1_4 = Static150.method2800(Static19.anInt647, arg0);
		Static240.aClass3_Sub2_Sub1Array10 = Static131.method2580(Static32.anInt1016, arg0);
		Static139.aClass3_Sub2_Sub1Array6 = Static131.method2580(Static78.anInt2147, arg0);
		Static241.aClass36Array16 = Static146.method2749(arg0, Static124.anInt3083);
		Static159.aClass36Array12 = Static146.method2749(arg0, Static224.anInt5057);
		Static114.aClass3_Sub2_Sub9_42.method2873(Static159.aClass36Array12, null);
		Static215.aClass3_Sub2_Sub9_32.method2873(Static159.aClass36Array12, null);
		Static280.aClass3_Sub2_Sub9_43.method2873(Static159.aClass36Array12, null);
		if (GlRenderer.enabled) {
			Static242.aClass36_Sub1Array2 = method837(Static84.anInt2257, arg0);
			for (@Pc(101) int local101 = 0; local101 < Static242.aClass36_Sub1Array2.length; local101++) {
				Static242.aClass36_Sub1Array2[local101].method1396();
			}
		}
		@Pc(124) SoftwareSprite local124 = Static78.method1693(0, arg0, Static163.anInt3962);
		local124.method311();
		if (GlRenderer.enabled) {
			Static106.aClass3_Sub2_Sub1_7 = new GlSprite(local124);
		} else {
			Static106.aClass3_Sub2_Sub1_7 = local124;
		}
		@Pc(143) SoftwareSprite[] local143 = Static265.method4523(Static128.anInt3143, arg0);
		@Pc(145) int local145;
		for (local145 = 0; local145 < local143.length; local145++) {
			local143[local145].method311();
		}
		if (GlRenderer.enabled) {
			Static277.aClass3_Sub2_Sub1Array12 = new Sprite[local143.length];
			for (local145 = 0; local145 < local143.length; local145++) {
				Static277.aClass3_Sub2_Sub1Array12[local145] = new GlSprite(local143[local145]);
			}
		} else {
			Static277.aClass3_Sub2_Sub1Array12 = local143;
		}
		@Pc(196) int local196 = (int) ((double) 21 * Math.random()) - 10;
		local145 = (int) (Math.random() * 21.0D) - 10;
		@Pc(210) int local210 = (int) (Math.random() * 21.0D) - 10;
		@Pc(217) int local217 = (int) (Math.random() * 41.0D) - 20;
		@Pc(219) int local219;
		for (local219 = 0; local219 < Static173.aClass3_Sub2_Sub1_Sub1Array9.length; local219++) {
			Static173.aClass3_Sub2_Sub1_Sub1Array9[local219].method315(local145 + local217, local217 + local196, local217 + local210);
		}
		if (GlRenderer.enabled) {
			Static67.aClass3_Sub2_Sub1Array4 = new Sprite[Static173.aClass3_Sub2_Sub1_Sub1Array9.length];
			for (local219 = 0; local219 < Static173.aClass3_Sub2_Sub1_Sub1Array9.length; local219++) {
				Static67.aClass3_Sub2_Sub1Array4[local219] = new GlSprite(Static173.aClass3_Sub2_Sub1_Sub1Array9[local219]);
			}
		} else {
			Static67.aClass3_Sub2_Sub1Array4 = Static173.aClass3_Sub2_Sub1_Sub1Array9;
		}
	}
}
