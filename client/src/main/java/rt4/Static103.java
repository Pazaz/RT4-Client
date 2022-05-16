package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "[[Lclient!li;")
	public static final Environment[][] aClass92ArrayArray1 = new Environment[13][13];
	@OriginalMember(owner = "client!i", name = "ec", descriptor = "[I")
	public static int[] anIntArray254;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
	public static int anInt2883;
	@OriginalMember(owner = "client!jm", name = "s", descriptor = "F")
	public static float aFloat13;
	@OriginalMember(owner = "client!ui", name = "mb", descriptor = "F")
	public static float aFloat37;
	@OriginalMember(owner = "client!ej", name = "bb", descriptor = "F")
	public static float aFloat6;
	@OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
	public static int anInt4623;
	@OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
	public static int anInt4153;
	@OriginalMember(owner = "client!be", name = "Vb", descriptor = "F")
	public static float aFloat4;
	@OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
	public static int anInt5868 = 0;
	@OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
	public static int anInt5080;
	@OriginalMember(owner = "client!kd", name = "ub", descriptor = "I")
	public static int anInt3255;
	@OriginalMember(owner = "client!aj", name = "X", descriptor = "F")
	public static float aFloat1;
	@OriginalMember(owner = "client!p", name = "g", descriptor = "F")
	public static float aFloat23;
	@OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
	public static int anInt4044;
	@OriginalMember(owner = "client!bm", name = "a", descriptor = "F")
	public static float aFloat5;
	@OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
	public static int anInt5731;
	@OriginalMember(owner = "client!md", name = "S", descriptor = "I")
	public static int anInt3709;
	@OriginalMember(owner = "client!ui", name = "T", descriptor = "F")
	public static float aFloat36;
	@OriginalMember(owner = "client!en", name = "z", descriptor = "F")
	public static float aFloat7;
	@OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
	public static int anInt2161;
	@OriginalMember(owner = "client!sa", name = "W", descriptor = "Z")
	public static boolean instantScreenFade = true;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(IIIII)I")
	public static int method2235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (instantScreenFade) {
			arg0 = 1000000;
			instantScreenFade = false;
		}
		@Pc(15) Environment local15 = aClass92ArrayArray1[arg3][arg1];
		@Pc(25) float local25 = ((float) arg2 * 0.1F + 0.7F) * local15.aFloat16;
		@Pc(28) float local28 = local15.aFloat18;
		@Pc(31) int local31 = local15.anInt3526;
		@Pc(34) int local34 = local15.anInt3529;
		@Pc(37) int local37 = local15.anInt3525;
		if (!Preferences.fogEnabled) {
			local34 = 0;
		}
		@Pc(44) float local44 = local15.aFloat17;
		if (local31 != anInt2883 || aFloat13 != local25 || aFloat1 != local28 || local44 != aFloat4 || anInt4044 != local37 || anInt5080 != local34) {
			aFloat13 = local25;
			aFloat37 = aFloat36;
			aFloat6 = aFloat7;
			anInt2883 = local31;
			anInt4623 = anInt3709;
			anInt4153 = anInt2161;
			aFloat4 = local44;
			anInt5868 = 0;
			anInt3255 = anInt5731;
			anInt5080 = local34;
			aFloat1 = local28;
			anInt4044 = local37;
			aFloat23 = aFloat5;
		}
		if (anInt5868 < 65536) {
			anInt5868 += arg0 * 250;
			if (anInt5868 >= 65536) {
				anInt5868 = 65536;
			}
			@Pc(114) float local114 = (float) anInt5868 / 65536.0F;
			@Pc(118) int local118 = anInt5868 >> 8;
			@Pc(125) int local125 = 65536 - anInt5868 >> 8;
			anInt3709 = (local118 * (anInt4044 & 0xFF00FF) + (anInt4623 & 0xFF00FF) * local125 & 0xFF00FF00) + (local125 * (anInt4623 & 0xFF00) + (anInt4044 & 0xFF00) * local118 & 0xFF0000) >> 8;
			@Pc(162) float local162 = (float) (65536 - anInt5868) / 65536.0F;
			aFloat7 = local162 * aFloat6 + local114 * aFloat13;
			aFloat36 = aFloat37 * local162 + local114 * aFloat1;
			aFloat5 = local114 * aFloat4 + local162 * aFloat23;
			anInt5731 = ((anInt2883 & 0xFF00) * local118 + local125 * (anInt3255 & 0xFF00) & 0xFF0000) + ((anInt3255 & 0xFF00FF) * local125 + ((anInt2883 & 0xFF00FF) * local118) & 0xFF00FF00) >> 8;
			anInt2161 = local118 * anInt5080 + local125 * anInt4153 >> 8;
		}
		FogManager.method3060(anInt5731, aFloat7, aFloat36, aFloat5);
		FogManager.method3062(anInt3709, anInt2161);
		FogManager.method3063((float) Static85.anInt2263, (float) Static159.anInt3893, (float) Static148.anInt3534);
		FogManager.method3058();
		return anInt3709;
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(BI)I")
	public static int method2236(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "(B)V")
	public static void setInstantFade() {
		instantScreenFade = true;
	}
}
