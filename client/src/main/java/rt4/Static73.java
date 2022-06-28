package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static73 {

	@OriginalMember(owner = "client!fm", name = "W", descriptor = "Lclient!na;")
	public static final JagString aClass100_453 = JagString.parse(")2");

	@OriginalMember(owner = "client!fm", name = "fb", descriptor = "[I")
	public static final int[] anIntArray183 = new int[14];
	@OriginalMember(owner = "client!ph", name = "b", descriptor = "[[Lclient!li;")
	public static final Environment[][] aClass92ArrayArray1 = new Environment[13][13];
	@OriginalMember(owner = "client!li", name = "t", descriptor = "I")
	public static int anInt3534;
	@OriginalMember(owner = "client!mi", name = "Z", descriptor = "I")
	public static int anInt3893;
	@OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
	public static int anInt2263;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZII)V")
	public static void setLightPosition(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		anInt2263 = aClass92ArrayArray1[arg1][arg0].anInt3530;
		anInt3893 = aClass92ArrayArray1[arg1][arg0].anInt3528;
		anInt3534 = aClass92ArrayArray1[arg1][arg0].anInt3527;
		FogManager.method3063((float) anInt2263, (float) anInt3893, (float) anInt3534);
	}

}
