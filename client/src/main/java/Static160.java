import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "Lclient!fd;")
	public static WorldMapFont aClass41_4;

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "B")
	public static byte aByte14;

	@OriginalMember(owner = "client!mj", name = "C", descriptor = "[S")
	public static short[] aShortArray41;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "[Lclient!na;")
	public static final JagString[] aClass100Array121 = new JagString[8];

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "Lclient!na;")
	public static final JagString aClass100_761 = Static28.parse("(U3");

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
	public static int anInt3902 = 0;

	@OriginalMember(owner = "client!mj", name = "A", descriptor = "J")
	public static long aLong134 = 0L;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILclient!be;IB)V")
	public static void method3047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		if (GlRenderer.enabled) {
			Static46.method1187(arg0, arg1, arg2.anInt445 + arg0, arg2.anInt459 + arg1);
		}
		if (Static270.anInt5795 >= 3) {
			if (GlRenderer.enabled) {
				@Pc(44) Sprite local44 = arg2.method489(false);
				if (local44 != null) {
					local44.method1423(arg0, arg1);
				}
			} else {
				Static129.method2504(arg0, arg1, arg2.anIntArray37, arg2.anIntArray45);
			}
		} else if (GlRenderer.enabled) {
			((GlSprite) Static106.aClass3_Sub2_Sub1_7).method1427(arg0, arg1, arg2.anInt445, arg2.anInt459, Static106.aClass3_Sub2_Sub1_7.anInt1867 / 2, Static106.aClass3_Sub2_Sub1_7.anInt1859 / 2, Static57.anInt1747, 256, (GlSprite) arg2.method489(false));
		} else {
			((SoftwareSprite) Static106.aClass3_Sub2_Sub1_7).method313(arg0, arg1, arg2.anInt445, arg2.anInt459, Static106.aClass3_Sub2_Sub1_7.anInt1867 / 2, Static106.aClass3_Sub2_Sub1_7.anInt1859 / 2, Static57.anInt1747, arg2.anIntArray37, arg2.anIntArray45);
		}
		Static31.aBooleanArray29[arg3] = true;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII)Z")
	public static boolean method3049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg3 * Static231.anInt5205 + arg0 * Static81.anInt2222 >> 16;
		@Pc(19) int local19 = arg3 * Static81.anInt2222 - arg0 * Static231.anInt5205 >> 16;
		@Pc(29) int local29 = arg1 * Static109.anInt2886 + local19 * Static121.anInt3038 >> 16;
		@Pc(39) int local39 = arg1 * Static121.anInt3038 - local19 * Static109.anInt2886 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static109.anInt2886 + local19 * Static121.anInt3038 >> 16;
		@Pc(76) int local76 = arg2 * Static121.anInt3038 - local19 * Static109.anInt2886 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > arg4 && local66 > arg4) {
			return false;
		} else if (local50 < Static240.anInt5334 && local87 < Static240.anInt5334) {
			return false;
		} else if (local50 > Static247.anInt5405 && local87 > Static247.anInt5405) {
			return false;
		} else if (local56 < Static1.anInt4 && local93 < Static1.anInt4) {
			return false;
		} else {
			return local56 <= Static148.anInt3535 || local93 <= Static148.anInt3535;
		}
	}
}
