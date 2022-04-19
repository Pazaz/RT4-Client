import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!pk", name = "R", descriptor = "[[Lclient!hg;")
	public static Class3_Sub14[][] aClass3_Sub14ArrayArray3;

	@OriginalMember(owner = "client!pk", name = "Y", descriptor = "I")
	public static int anInt4581;

	@OriginalMember(owner = "client!pk", name = "Z", descriptor = "Lclient!ve;")
	public static Js5 aClass153_80;

	@OriginalMember(owner = "client!pk", name = "bb", descriptor = "Lclient!na;")
	public static Class100 aClass100_859;

	@OriginalMember(owner = "client!pk", name = "Q", descriptor = "Lclient!na;")
	public static final Class100 aClass100_858 = Static28.method790("glissement:");

	@OriginalMember(owner = "client!pk", name = "V", descriptor = "[S")
	public static final short[] aShortArray64 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!pk", name = "eb", descriptor = "Lclient!na;")
	public static final Class100 aClass100_860 = Static28.method790("Angreifen");

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "(B)I")
	public static int method3531() {
		return Static229.anInt5140;
	}

	@OriginalMember(owner = "client!pk", name = "i", descriptor = "(I)V")
	public static void method3532() {
		for (@Pc(16) Class3_Sub2_Sub19 local16 = (Class3_Sub2_Sub19) Static217.aClass69_116.method2289(); local16 != null; local16 = (Class3_Sub2_Sub19) Static217.aClass69_116.method2288()) {
			@Pc(21) ProjAnim local21 = local16.aClass8_Sub6_1;
			if (Static55.anInt1735 != local21.anInt4810 || local21.anInt4800 < Static83.anInt372) {
				local16.method4658();
			} else if (Static83.anInt372 >= local21.anInt4822) {
				if (local21.anInt4819 > 0) {
					@Pc(54) Class8_Sub4_Sub2 local54 = Static175.aClass8_Sub4_Sub2Array1[local21.anInt4819 - 1];
					if (local54 != null && local54.anInt3412 >= 0 && local54.anInt3412 < 13312 && local54.anInt3421 >= 0 && local54.anInt3421 < 13312) {
						local21.method3705(local54.anInt3421, Static83.anInt372, Static207.method3685(local21.anInt4810, local54.anInt3412, local54.anInt3421) - local21.anInt4805, local54.anInt3412);
					}
				}
				if (local21.anInt4819 < 0) {
					@Pc(102) int local102 = -local21.anInt4819 - 1;
					@Pc(107) Class8_Sub4_Sub1 local107;
					if (Static16.anInt549 == local102) {
						local107 = Static173.aClass8_Sub4_Sub1_2;
					} else {
						local107 = Static159.aClass8_Sub4_Sub1Array1[local102];
					}
					if (local107 != null && local107.anInt3412 >= 0 && local107.anInt3412 < 13312 && local107.anInt3421 >= 0 && local107.anInt3421 < 13312) {
						local21.method3705(local107.anInt3421, Static83.anInt372, Static207.method3685(local21.anInt4810, local107.anInt3412, local107.anInt3421) - local21.anInt4805, local107.anInt3412);
					}
				}
				local21.method3704(Static178.anInt4247);
				Static43.method1141(Static55.anInt1735, (int) local21.aDouble8, (int) local21.aDouble3, (int) local21.aDouble6, 60, local21, local21.anInt4821, -1L, false);
			}
		}
	}
}
