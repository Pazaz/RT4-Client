import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "Lclient!n;")
	public static final SoftLruHashTable aClass99_15 = new SoftLruHashTable(4);

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)Lclient!jh;")
	public static Wall method2276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Tile local7 = Static130.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Wall local14 = local7.aClass77_1;
			local7.aClass77_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)Lclient!hn;")
	public static Class3_Sub2_Sub12 method2277(@OriginalArg(1) int arg0) {
		@Pc(6) Class3_Sub2_Sub12 local6 = (Class3_Sub2_Sub12) Static272.aClass54_14.method1806((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(30) byte[] local30 = Static39.aClass153_23.method4495(11, arg0);
		local6 = new Class3_Sub2_Sub12();
		if (local30 != null) {
			local6.method2076(new Buffer(local30));
		}
		Static272.aClass54_14.method1811(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[Lclient!hg;)V")
	public static void method2280(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub14[] arg1) {
		Static182.aClass3_Sub14ArrayArray2[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIII)V")
	public static void method2281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) AreaSound local6;
		for (local6 = (AreaSound) Static3.aClass69_135.method2289(); local6 != null; local6 = (AreaSound) Static3.aClass69_135.method2288()) {
			Static150.method2804(arg1, local6, arg3, arg0, arg2);
		}
		@Pc(37) byte local37;
		@Pc(42) BasType local42;
		@Pc(141) int local141;
		for (local6 = (AreaSound) Static152.aClass69_87.method2289(); local6 != null; local6 = (AreaSound) Static152.aClass69_87.method2288()) {
			local37 = 1;
			local42 = local6.aClass8_Sub4_Sub2_1.method2681();
			if (local42.anInt1037 == local6.aClass8_Sub4_Sub2_1.anInt3366) {
				local37 = 0;
			} else if (local42.anInt1058 == local6.aClass8_Sub4_Sub2_1.anInt3366 || local42.anInt1054 == local6.aClass8_Sub4_Sub2_1.anInt3366 || local42.anInt1045 == local6.aClass8_Sub4_Sub2_1.anInt3366 || local42.anInt1043 == local6.aClass8_Sub4_Sub2_1.anInt3366) {
				local37 = 2;
			} else if (local42.anInt1062 == local6.aClass8_Sub4_Sub2_1.anInt3366 || local42.anInt1042 == local6.aClass8_Sub4_Sub2_1.anInt3366 || local6.aClass8_Sub4_Sub2_1.anInt3366 == local42.anInt1048 || local42.anInt1066 == local6.aClass8_Sub4_Sub2_1.anInt3366) {
				local37 = 3;
			}
			if (local6.anInt2038 != local37) {
				local141 = Static112.method2299(local6.aClass8_Sub4_Sub2_1);
				if (local141 != local6.anInt2044) {
					if (local6.aClass3_Sub3_Sub1_1 != null) {
						Static204.aClass3_Sub3_Sub2_1.method1347(local6.aClass3_Sub3_Sub1_1);
						local6.aClass3_Sub3_Sub1_1 = null;
					}
					local6.anInt2044 = local141;
				}
				local6.anInt2038 = local37;
			}
			local6.anInt2041 = local6.aClass8_Sub4_Sub2_1.anInt3412;
			local6.anInt2037 = local6.aClass8_Sub4_Sub2_1.anInt3412 + local6.aClass8_Sub4_Sub2_1.method2693() * 64;
			local6.anInt2029 = local6.aClass8_Sub4_Sub2_1.anInt3421;
			local6.anInt2028 = local6.aClass8_Sub4_Sub2_1.anInt3421 + local6.aClass8_Sub4_Sub2_1.method2693() * 64;
			Static150.method2804(arg1, local6, arg3, arg0, arg2);
		}
		for (local6 = (AreaSound) Static93.aClass133_7.method3859(); local6 != null; local6 = (AreaSound) Static93.aClass133_7.method3861()) {
			local37 = 1;
			local42 = local6.aClass8_Sub4_Sub1_1.method2681();
			if (local6.aClass8_Sub4_Sub1_1.anInt3366 == local42.anInt1037) {
				local37 = 0;
			} else if (local6.aClass8_Sub4_Sub1_1.anInt3366 == local42.anInt1058 || local6.aClass8_Sub4_Sub1_1.anInt3366 == local42.anInt1054 || local6.aClass8_Sub4_Sub1_1.anInt3366 == local42.anInt1045 || local42.anInt1043 == local6.aClass8_Sub4_Sub1_1.anInt3366) {
				local37 = 2;
			} else if (local42.anInt1062 == local6.aClass8_Sub4_Sub1_1.anInt3366 || local6.aClass8_Sub4_Sub1_1.anInt3366 == local42.anInt1042 || local6.aClass8_Sub4_Sub1_1.anInt3366 == local42.anInt1048 || local6.aClass8_Sub4_Sub1_1.anInt3366 == local42.anInt1066) {
				local37 = 3;
			}
			if (local6.anInt2038 != local37) {
				local141 = Static140.method2706(local6.aClass8_Sub4_Sub1_1);
				if (local6.anInt2044 != local141) {
					if (local6.aClass3_Sub3_Sub1_1 != null) {
						Static204.aClass3_Sub3_Sub2_1.method1347(local6.aClass3_Sub3_Sub1_1);
						local6.aClass3_Sub3_Sub1_1 = null;
					}
					local6.anInt2044 = local141;
				}
				local6.anInt2038 = local37;
			}
			local6.anInt2041 = local6.aClass8_Sub4_Sub1_1.anInt3412;
			local6.anInt2037 = local6.aClass8_Sub4_Sub1_1.anInt3412 + local6.aClass8_Sub4_Sub1_1.method2693() * 64;
			local6.anInt2029 = local6.aClass8_Sub4_Sub1_1.anInt3421;
			local6.anInt2028 = local6.aClass8_Sub4_Sub1_1.anInt3421 + local6.aClass8_Sub4_Sub1_1.method2693() * 64;
			Static150.method2804(arg1, local6, arg3, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZII)Lclient!na;")
	public static JagString method2285(@OriginalArg(2) int arg0) {
		return Static198.method1025(true, arg0);
	}
}
