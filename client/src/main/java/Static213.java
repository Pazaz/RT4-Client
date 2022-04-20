import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!re", name = "w", descriptor = "[Lclient!qf;")
	public static Sprite[] aClass3_Sub2_Sub1Array8;

	@OriginalMember(owner = "client!re", name = "y", descriptor = "I")
	public static int anInt4851;

	@OriginalMember(owner = "client!re", name = "B", descriptor = "Lclient!ve;")
	public static Js5 aClass153_88;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public static void method3729() {
		Static8.method119();
		Static71.method1443();
		Static238.method4142();
		Static258.method4415();
		Static209.method3706();
		Static190.method3447();
		Static72.method1570();
		Static137.method2666();
		Static269.method2221();
		Static24.method666();
		Static19.method586();
		Static276.method4615();
		Static25.method715();
		Static25.method716();
		Static279.method4662();
		Static53.method1289();
		Static158.method3010();
		Static134.method2621();
		Static73.aClass99_10.method3102(5);
		Static139.aClass99_22.method3102(5);
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)[Lclient!qf;")
	public static Sprite[] method3730() {
		@Pc(14) Sprite[] local14 = new Sprite[Static165.anInt4038];
		for (@Pc(16) int local16 = 0; local16 < Static165.anInt4038; local16++) {
			@Pc(23) byte[] local23 = Static7.aByteArrayArray5[local16];
			@Pc(31) int local31 = Static26.anIntArray66[local16] * Static254.anIntArray488[local16];
			if (Static159.aBooleanArray87[local16]) {
				@Pc(38) int[] local38 = new int[local31];
				@Pc(42) byte[] local42 = Static64.aByteArrayArray9[local16];
				for (@Pc(44) int local44 = 0; local44 < local31; local44++) {
					local38[local44] = Static259.anIntArray513[local23[local44] & 0xFF] | (local42[local44] & 0xFF) << 24;
				}
				if (GlRenderer.enabled) {
					local14[local16] = new GlAlphaSprite(Static124.anInt3080, Static227.anInt5091, Static274.anIntArray440[local16], Static269.anIntArray252[local16], Static254.anIntArray488[local16], Static26.anIntArray66[local16], local38);
				} else {
					local14[local16] = new SoftwareAlphaSprite(Static124.anInt3080, Static227.anInt5091, Static274.anIntArray440[local16], Static269.anIntArray252[local16], Static254.anIntArray488[local16], Static26.anIntArray66[local16], local38);
				}
			} else {
				@Pc(119) int[] local119 = new int[local31];
				for (@Pc(121) int local121 = 0; local121 < local31; local121++) {
					local119[local121] = Static259.anIntArray513[local23[local121] & 0xFF];
				}
				if (GlRenderer.enabled) {
					local14[local16] = new GlSprite(Static124.anInt3080, Static227.anInt5091, Static274.anIntArray440[local16], Static269.anIntArray252[local16], Static254.anIntArray488[local16], Static26.anIntArray66[local16], local119);
				} else {
					local14[local16] = new SoftwareSprite(Static124.anInt3080, Static227.anInt5091, Static274.anIntArray440[local16], Static269.anIntArray252[local16], Static254.anIntArray488[local16], Static26.anIntArray66[local16], local119);
				}
			}
		}
		Static75.method1631();
		return local14;
	}
}
