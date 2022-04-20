import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
	public static int anInt3045;

	@OriginalMember(owner = "client!jh", name = "n", descriptor = "Lclient!bd;")
	public static Class12 aClass12_1;

	@OriginalMember(owner = "client!jh", name = "p", descriptor = "Lclient!ve;")
	public static Js5 aClass153_46;

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "[Lclient!na;")
	public static final JagString[] aClass100Array92 = new JagString[200];

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!jh", name = "g", descriptor = "Lclient!na;")
	public static final JagString aClass100_591 = Static28.parse("(Udns");

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
	public static int x = 0;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!ve;ZIIZI)V")
	public static void method2410(@OriginalArg(0) Js5 arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
		Static172.aClass153_70 = arg0;
		Static14.anInt441 = 1;
		Static253.anInt5527 = arg2;
		Static226.anInt5085 = 0;
		Static277.anInt5853 = arg1;
		Static72.aBoolean116 = false;
		Static57.anInt1757 = 10000;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZLclient!pb;ILclient!km;IILclient!e;)V")
	public static void method2411(@OriginalArg(0) int arg0, @OriginalArg(2) LocType arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Npc arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Player arg6) {
		@Pc(13) AreaSound local13 = new AreaSound();
		local13.anInt2029 = arg0 * 128;
		local13.anInt2041 = arg4 * 128;
		local13.anInt2033 = arg5;
		if (arg1 != null) {
			local13.anIntArray181 = arg1.anIntArray381;
			local13.anInt2042 = arg1.anInt4402 * 128;
			local13.anInt2040 = arg1.anInt4414;
			local13.aClass118_1 = arg1;
			local13.anInt2044 = arg1.anInt4412;
			local13.anInt2032 = arg1.anInt4419;
			@Pc(57) int local57 = arg1.anInt4397;
			@Pc(60) int local60 = arg1.anInt4403;
			if (arg2 == 1 || arg2 == 3) {
				local57 = arg1.anInt4403;
				local60 = arg1.anInt4397;
			}
			local13.anInt2028 = (local60 + arg0) * 128;
			local13.anInt2037 = (arg4 + local57) * 128;
			if (arg1.anIntArray380 != null) {
				local13.aBoolean117 = true;
				local13.method1567();
			}
			if (local13.anIntArray181 != null) {
				local13.anInt2034 = local13.anInt2032 + (int) (Math.random() * (double) (local13.anInt2040 - local13.anInt2032));
			}
			Static3.aClass69_135.method2282(local13);
		} else if (arg3 != null) {
			local13.aClass8_Sub4_Sub2_1 = arg3;
			@Pc(138) NpcType local138 = arg3.aClass96_1;
			if (local138.anIntArray357 != null) {
				local13.aBoolean117 = true;
				local138 = local138.method2932();
			}
			if (local138 != null) {
				local13.anInt2028 = (local138.anInt3713 + arg0) * 128;
				local13.anInt2037 = (arg4 + local138.anInt3713) * 128;
				local13.anInt2044 = Static112.method2299(arg3);
				local13.anInt2042 = local138.anInt3746 * 128;
			}
			Static152.aClass69_87.method2282(local13);
		} else if (arg6 != null) {
			local13.aClass8_Sub4_Sub1_1 = arg6;
			local13.anInt2037 = (arg6.method2693() + arg4) * 128;
			local13.anInt2028 = (arg6.method2693() + arg0) * 128;
			local13.anInt2044 = Static140.method2706(arg6);
			local13.anInt2042 = arg6.anInt1664 * 128;
			Static93.aClass133_7.method3862(local13, arg6.aClass100_364.encode37());
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILclient!ve;Lclient!ve;I)Lclient!dd;")
	public static SoftwareFont method2412(@OriginalArg(0) int arg0, @OriginalArg(2) Js5 arg1, @OriginalArg(3) Js5 arg2) {
		return Static234.method4016(arg2, 0, arg0) ? Static114.method4635(arg1.method4495(arg0, 0)) : null;
	}
}
