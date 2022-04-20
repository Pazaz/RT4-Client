import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
	public static int port;

	@OriginalMember(owner = "client!ra", name = "K", descriptor = "Lclient!ve;")
	public static Js5 aClass153_86;

	@OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
	public static int miscTransmitAt = 0;

	@OriginalMember(owner = "client!ra", name = "R", descriptor = "Z")
	public static boolean aBoolean240 = true;

	@OriginalMember(owner = "client!ra", name = "jb", descriptor = "J")
	public static volatile long aLong161 = 0L;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!pb;BII)V")
	public static void method3701(@OriginalArg(0) int arg0, @OriginalArg(1) LocType arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) AreaSound local10 = (AreaSound) Static3.aClass69_135.method2289(); local10 != null; local10 = (AreaSound) Static3.aClass69_135.method2288()) {
			if (arg3 == local10.anInt2033 && local10.anInt2041 == arg0 * 128 && local10.anInt2029 == arg2 * 128 && arg1.anInt4426 == local10.aClass118_1.anInt4426) {
				if (local10.aClass3_Sub3_Sub1_1 != null) {
					Static204.aClass3_Sub3_Sub2_1.method1347(local10.aClass3_Sub3_Sub1_1);
					local10.aClass3_Sub3_Sub1_1 = null;
				}
				if (local10.aClass3_Sub3_Sub1_2 != null) {
					Static204.aClass3_Sub3_Sub2_1.method1347(local10.aClass3_Sub3_Sub1_2);
					local10.aClass3_Sub3_Sub1_2 = null;
				}
				local10.method4658();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)Z")
	public static boolean method3702(@OriginalArg(1) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(BI)V")
	public static void method3706() {
		Static93.aClass99_13.method3102(5);
		Static125.aClass99_18.method3102(5);
		Static262.aClass99_35.method3102(5);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BIII)V")
	public static void method3707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) DelayedStateChange local12 = Static238.method4143(9, arg0);
		local12.method1017();
		local12.intArg1 = arg2;
		local12.intArg3 = arg1;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBILclient!ve;)[Lclient!qf;")
	public static Sprite[] method3708(@OriginalArg(2) int arg0, @OriginalArg(3) Js5 arg1) {
		return Static234.method4016(arg1, 0, arg0) ? Static213.method3730() : null;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(III)I")
	public static int method3709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local15 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return local15 * arg1;
		} else {
			return local15;
		}
	}
}
