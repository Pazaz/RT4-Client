import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "Lclient!be;")
	public static Component aClass13_11;

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "Lclient!na;")
	public static final JagString aClass100_333 = Static28.parse("Shift)2click ENABLED(Q");

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "[[S")
	public static final short[][] aShortArrayArray5 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "Lclient!na;")
	public static final JagString aClass100_334 = Static28.parse("Cache:");

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "Z")
	public static boolean displayFps = false;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIILclient!th;IJZ)Z")
	public static boolean method1141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Entity arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static105.method2256(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILclient!be;)V")
	public static void method1143(@OriginalArg(1) Component arg0) {
		if (Static182.anInt4311 == arg0.anInt465) {
			Static186.aBooleanArray100[arg0.anInt517] = true;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIILclient!mj;)V")
	public static void method1144(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) CollisionMap arg5) {
		@Pc(9) long local9 = 0L;
		if (arg3 == 0) {
			local9 = Static265.method4521(arg2, arg1, arg0);
		} else if (arg3 == 1) {
			local9 = Static139.method2703(arg2, arg1, arg0);
		} else if (arg3 == 2) {
			local9 = Static35.method899(arg2, arg1, arg0);
		} else if (arg3 == 3) {
			local9 = Static20.method602(arg2, arg1, arg0);
		}
		@Pc(57) int local57 = (int) local9 >> 14 & 0x1F;
		@Pc(70) int local70 = (int) (local9 >>> 32) & Integer.MAX_VALUE;
		@Pc(74) LocType local74 = Static271.method4601(local70);
		if (local74.method3422()) {
			Static209.method3701(arg1, local74, arg0, arg2);
		}
		@Pc(92) int local92 = (int) local9 >> 20 & 0x3;
		if (local9 == 0L) {
			return;
		}
		@Pc(100) Entity local100 = null;
		@Pc(102) Entity local102 = null;
		if (arg3 == 0) {
			@Pc(110) Wall local110 = Static110.method2276(arg2, arg1, arg0);
			if (local110 != null) {
				local100 = local110.aClass8_5;
				local102 = local110.aClass8_6;
			}
			if (local74.anInt4435 != 0) {
				arg5.method3039(local92, local74.aBoolean207, arg0, local57, arg1);
			}
		} else if (arg3 == 1) {
			@Pc(233) WallDecor local233 = Static75.method1633(arg2, arg1, arg0);
			if (local233 != null) {
				local100 = local233.aClass8_3;
				local102 = local233.aClass8_2;
			}
		} else if (arg3 == 2) {
			@Pc(148) Scenery local148 = Static47.method3996(arg2, arg1, arg0);
			if (local148 != null) {
				local100 = local148.aClass8_4;
			}
			if (local74.anInt4435 != 0 && local74.anInt4397 + arg1 < 104 && local74.anInt4397 + arg0 < 104 && arg1 + local74.anInt4403 < 104 && arg0 + local74.anInt4403 < 104) {
				arg5.method3056(arg1, local74.anInt4397, local74.aBoolean207, local92, local74.anInt4403, arg0);
			}
		} else if (arg3 == 3) {
			@Pc(211) GroundDecor local211 = Static267.method4526(arg2, arg1, arg0);
			if (local211 != null) {
				local100 = local211.aClass8_1;
			}
			if (local74.anInt4435 == 1) {
				arg5.method3053(arg0, arg1);
			}
		}
		if (!GlRenderer.enabled || !local74.aBoolean212) {
			return;
		}
		if (local57 == 2) {
			if (local100 instanceof Loc) {
				((Loc) local100).method1046();
			} else {
				Static9.method181(local74, 0, local92 + 4, 0, local57, arg1, arg0, arg4);
			}
			if (local102 instanceof Loc) {
				((Loc) local102).method1046();
			} else {
				Static9.method181(local74, 0, local92 + 1 & 0x3, 0, local57, arg1, arg0, arg4);
			}
		} else if (local57 == 5) {
			if (local100 instanceof Loc) {
				((Loc) local100).method1046();
			} else {
				Static9.method181(local74, Static238.anIntArray469[local92] * 8, local92, Static34.anIntArray80[local92] * 8, 4, arg1, arg0, arg4);
			}
		} else if (local57 == 6) {
			if (local100 instanceof Loc) {
				((Loc) local100).method1046();
			} else {
				Static9.method181(local74, Static64.anIntArray154[local92] * 8, local92 + 4, Static114.anIntArray565[local92] * 8, 4, arg1, arg0, arg4);
			}
		} else if (local57 == 7) {
			if (local100 instanceof Loc) {
				((Loc) local100).method1046();
			} else {
				Static9.method181(local74, 0, (local92 + 2 & 0x3) + 4, 0, 4, arg1, arg0, arg4);
			}
		} else if (local57 == 8) {
			if (local100 instanceof Loc) {
				((Loc) local100).method1046();
			} else {
				Static9.method181(local74, Static64.anIntArray154[local92] * 8, local92 + 4, Static114.anIntArray565[local92] * 8, 4, arg1, arg0, arg4);
			}
			if (local102 instanceof Loc) {
				((Loc) local102).method1046();
			} else {
				Static9.method181(local74, Static64.anIntArray154[local92] * 8, (local92 + 2 & 0x3) + 4, Static114.anIntArray565[local92] * 8, 4, arg1, arg0, arg4);
			}
		} else if (local57 == 11) {
			if (local100 instanceof Loc) {
				((Loc) local100).method1046();
			} else {
				Static9.method181(local74, 0, local92 + 4, 0, 10, arg1, arg0, arg4);
			}
		} else if (local100 instanceof Loc) {
			((Loc) local100).method1046();
		} else {
			Static9.method181(local74, 0, local92, 0, local57, arg1, arg0, arg4);
		}
	}
}
