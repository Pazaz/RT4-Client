import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "Lclient!ve;")
	public static Js5 aClass153_93;

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
	public static int anInt5080;

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
	public static int anInt5085;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
	public static int anInt5079 = 0;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
	public static int anInt5081 = 1;

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "Lclient!na;")
	public static final JagString aClass100_965 = Static28.parse("<col=ffff00>");

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "[Lclient!na;")
	public static final JagString[] varcstrs = new JagString[1000];

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
	public static int anInt5084 = 0;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!cd;)V")
	public static void method3898(@OriginalArg(1) Class3_Sub7 arg0) {
		@Pc(5) long local5 = 0L;
		@Pc(7) int local7 = -1;
		@Pc(14) int local14 = 0;
		if (arg0.anInt927 == 0) {
			local5 = Static265.method4521(arg0.anInt918, arg0.anInt928, arg0.anInt916);
		}
		@Pc(31) int local31 = 0;
		if (arg0.anInt927 == 1) {
			local5 = Static139.method2703(arg0.anInt918, arg0.anInt928, arg0.anInt916);
		}
		if (arg0.anInt927 == 2) {
			local5 = Static35.method899(arg0.anInt918, arg0.anInt928, arg0.anInt916);
		}
		if (arg0.anInt927 == 3) {
			local5 = Static20.method602(arg0.anInt918, arg0.anInt928, arg0.anInt916);
		}
		if (local5 != 0L) {
			local7 = Integer.MAX_VALUE & (int) (local5 >>> 32);
			local31 = (int) local5 >> 20 & 0x3;
			local14 = (int) local5 >> 14 & 0x1F;
		}
		arg0.anInt921 = local7;
		arg0.anInt920 = local14;
		arg0.anInt923 = local31;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLclient!ve;)V")
	public static void method3899(@OriginalArg(1) Js5 arg0) {
		Static39.aClass153_23 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
	public static void method3901() {
		@Pc(16) int local16 = Static280.aClass3_Sub2_Sub9_43.method2858(LocalizedText.CHOOSE_OPTION);
		@Pc(18) int local18;
		@Pc(27) int local27;
		for (local18 = 0; local18 < Static231.anInt5204; local18++) {
			local27 = Static280.aClass3_Sub2_Sub9_43.method2858(Static269.method2228(local18));
			if (local27 > local16) {
				local16 = local27;
			}
		}
		local18 = Static231.anInt5204 * 15 + 21;
		@Pc(43) int local43 = Static60.anInt1892;
		local16 += 8;
		local27 = Static155.anInt3751 - local16 / 2;
		if (local43 + local18 > Static254.anInt5554) {
			local43 = Static254.anInt5554 - local18;
		}
		if (Static48.anInt1448 < local27 + local16) {
			local27 = Static48.anInt1448 - local16;
		}
		if (local27 < 0) {
			local27 = 0;
		}
		if (local43 < 0) {
			local43 = 0;
		}
		if (Static162.anInt3953 == 1) {
			if (Static155.anInt3751 == Static277.anInt5850 && Static280.anInt5895 == Static60.anInt1892) {
				Static13.anInt436 = Static231.anInt5204 * 15 + (Static261.aBoolean298 ? 26 : 22);
				Static162.anInt3953 = 0;
				Static229.anInt5138 = local43;
				Static183.anInt4271 = local27;
				Static60.aBoolean108 = true;
				Static24.anInt761 = local16;
			}
		} else if (Static155.anInt3751 == Static7.clickX && Static60.anInt1892 == Static60.clickY) {
			Static183.anInt4271 = local27;
			Static162.anInt3953 = 0;
			Static24.anInt761 = local16;
			Static229.anInt5138 = local43;
			Static13.anInt436 = (Static261.aBoolean298 ? 26 : 22) + Static231.anInt5204 * 15;
			Static60.aBoolean108 = true;
		} else {
			Static280.anInt5895 = Static60.clickY;
			Static277.anInt5850 = Static7.clickX;
			Static162.anInt3953 = 1;
		}
	}
}
