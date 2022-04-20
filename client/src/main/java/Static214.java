import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
	public static int anInt5577;

	@OriginalMember(owner = "client!rg", name = "z", descriptor = "Lclient!ve;")
	public static Js5 aClass153_106;

	@OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
	public static int anInt5579;

	@OriginalMember(owner = "client!rg", name = "r", descriptor = "[Lclient!na;")
	public static final JagString[] aClass100Array170 = new JagString[200];

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
	public static int anInt5574 = -1;

	@OriginalMember(owner = "client!rg", name = "A", descriptor = "[I")
	public static final int[] anIntArray492 = new int[14];

	@OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
	public static int anInt5581 = 0;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!e;I)V")
	public static void method4359(@OriginalArg(0) Player arg0) {
		@Pc(12) AreaSound local12 = (AreaSound) Static93.aClass133_7.method3863(arg0.aClass100_364.encode37());
		if (local12 == null) {
			Static122.method2411(arg0.movementQueueZ[0], null, 0, null, arg0.movementQueueX[0], Static55.level, arg0);
		} else {
			local12.method1567();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZII)I")
	public static int method4360(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)Lclient!bn;")
	public static Map method4361() {
		return Static269.aClass3_Sub2_Sub4_2;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)Lclient!me;")
	public static NpcType method4363(@OriginalArg(0) int arg0) {
		@Pc(10) NpcType local10 = (NpcType) Static93.aClass99_13.method3106((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static58.aClass153_28.method4495(Static60.method1447(arg0), Static179.method3322(arg0));
		local10 = new NpcType();
		local10.anInt3741 = arg0;
		if (local26 != null) {
			local10.method2939(new Buffer(local26));
		}
		local10.method2942();
		Static93.aClass99_13.method3095(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(7) int local7 = arg2 - arg7;
		@Pc(16) int local16 = (arg0 - arg4 << 16) / local7;
		@Pc(21) int local21 = arg5 - arg3;
		@Pc(30) int local30 = (arg6 - arg1 << 16) / local21;
		Static144.method2735(arg1, arg5, arg3, arg2, arg4, arg7, local30, local16);
	}
}
