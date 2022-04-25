import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!i", name = "Ub", descriptor = "[Lclient!na;")
	public static JagString[] aClass100Array88;

	@OriginalMember(owner = "client!i", name = "ec", descriptor = "[I")
	public static int[] anIntArray254;

	@OriginalMember(owner = "client!i", name = "ic", descriptor = "Lclient!na;")
	public static final JagString aClass100_558 = JagString.parse("m");

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(IIIII)I")
	public static int method2235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static222.instantScreenFade) {
			arg0 = 1000000;
			Static222.instantScreenFade = false;
		}
		@Pc(15) Environment local15 = Static192.aClass92ArrayArray1[arg3][arg1];
		@Pc(25) float local25 = ((float) arg2 * 0.1F + 0.7F) * local15.aFloat16;
		@Pc(28) float local28 = local15.aFloat18;
		@Pc(31) int local31 = local15.anInt3526;
		@Pc(34) int local34 = local15.anInt3529;
		@Pc(37) int local37 = local15.anInt3525;
		if (!Preferences.fogEnabled) {
			local34 = 0;
		}
		@Pc(44) float local44 = local15.aFloat17;
		if (local31 != Static109.anInt2883 || Static126.aFloat13 != local25 || Static8.aFloat1 != local28 || local44 != Static15.aFloat4 || Static166.anInt4044 != local37 || Static226.anInt5080 != local34) {
			Static126.aFloat13 = local25;
			Static253.aFloat37 = Static253.aFloat36;
			Static59.aFloat6 = Static61.aFloat7;
			Static109.anInt2883 = local31;
			Static264.anInt4623 = Static154.anInt3709;
			Static171.anInt4153 = Static79.anInt2161;
			Static15.aFloat4 = local44;
			Static3.anInt5868 = 0;
			Static131.anInt3255 = Static261.anInt5731;
			Static226.anInt5080 = local34;
			Static8.aFloat1 = local28;
			Static166.anInt4044 = local37;
			Static185.aFloat23 = Static23.aFloat5;
		}
		if (Static3.anInt5868 < 65536) {
			Static3.anInt5868 += arg0 * 250;
			if (Static3.anInt5868 >= 65536) {
				Static3.anInt5868 = 65536;
			}
			@Pc(114) float local114 = (float) Static3.anInt5868 / 65536.0F;
			@Pc(118) int local118 = Static3.anInt5868 >> 8;
			@Pc(125) int local125 = 65536 - Static3.anInt5868 >> 8;
			Static154.anInt3709 = (local118 * (Static166.anInt4044 & 0xFF00FF) + (Static264.anInt4623 & 0xFF00FF) * local125 & 0xFF00FF00) + (local125 * (Static264.anInt4623 & 0xFF00) + (Static166.anInt4044 & 0xFF00) * local118 & 0xFF0000) >> 8;
			@Pc(162) float local162 = (float) (65536 - Static3.anInt5868) / 65536.0F;
			Static61.aFloat7 = local162 * Static59.aFloat6 + local114 * Static126.aFloat13;
			Static253.aFloat36 = Static253.aFloat37 * local162 + local114 * Static8.aFloat1;
			Static23.aFloat5 = local114 * Static15.aFloat4 + local162 * Static185.aFloat23;
			Static261.anInt5731 = ((Static109.anInt2883 & 0xFF00) * local118 + local125 * (Static131.anInt3255 & 0xFF00) & 0xFF0000) + ((Static131.anInt3255 & 0xFF00FF) * local125 + ((Static109.anInt2883 & 0xFF00FF) * local118) & 0xFF00FF00) >> 8;
			Static79.anInt2161 = local118 * Static226.anInt5080 + local125 * Static171.anInt4153 >> 8;
		}
		Static161.method3060(Static261.anInt5731, Static61.aFloat7, Static253.aFloat36, Static23.aFloat5);
		Static161.method3062(Static154.anInt3709, Static79.anInt2161);
		Static161.method3063((float) Static85.anInt2263, (float) Static159.anInt3893, (float) Static148.anInt3534);
		Static161.method3058();
		return Static154.anInt3709;
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(BI)I")
	public static int method2236(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

}
