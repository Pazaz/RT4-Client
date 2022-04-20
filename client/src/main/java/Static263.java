import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "[Lclient!na;")
	public static JagString[] aClass100Array174;

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "[I")
	public static int[] anIntArray516;

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "S")
	public static short aShort30 = 256;

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "Z")
	public static boolean aBoolean299 = false;

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
	public static int anInt5755 = 2;

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "Lclient!na;")
	public static final JagString aClass100_1081 = Static28.parse("<col=80ff00>");

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "Lclient!na;")
	public static final JagString aClass100_1082 = Static28.parse("; Expires=");

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I[S)[S")
	public static short[] method4511(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) short[] local19 = new short[arg0.length];
			Static289.method2616(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!na;IIBI)V")
	public static void method4512(@OriginalArg(0) JagString arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Component local8 = Static201.method1418(arg3, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray29 != null) {
			@Pc(19) HookRequest local19 = new HookRequest();
			local19.anObjectArray31 = local8.anObjectArray29;
			local19.source = local8;
			local19.aClass100_598 = arg0;
			local19.anInt3101 = arg2;
			Static82.method1767(local19);
		}
		@Pc(37) boolean local37 = true;
		if (local8.anInt453 > 0) {
			local37 = Static249.method4265(local8);
		}
		if (!local37 || !Static36.method940(local8).method503(arg2 - 1)) {
			return;
		}
		if (arg2 == 1) {
			Static6.outboundBuffer.p1isaac(155);
			Static6.outboundBuffer.p4(arg3);
			Static6.outboundBuffer.p2(arg1);
		}
		if (arg2 == 2) {
			Static6.outboundBuffer.p1isaac(196);
			Static6.outboundBuffer.p4(arg3);
			Static6.outboundBuffer.p2(arg1);
		}
		if (arg2 == 3) {
			Static6.outboundBuffer.p1isaac(124);
			Static6.outboundBuffer.p4(arg3);
			Static6.outboundBuffer.p2(arg1);
		}
		if (arg2 == 4) {
			Static6.outboundBuffer.p1isaac(199);
			Static6.outboundBuffer.p4(arg3);
			Static6.outboundBuffer.p2(arg1);
		}
		if (arg2 == 5) {
			Static6.outboundBuffer.p1isaac(234);
			Static6.outboundBuffer.p4(arg3);
			Static6.outboundBuffer.p2(arg1);
		}
		if (arg2 == 6) {
			Static6.outboundBuffer.p1isaac(168);
			Static6.outboundBuffer.p4(arg3);
			Static6.outboundBuffer.p2(arg1);
		}
		if (arg2 == 7) {
			Static6.outboundBuffer.p1isaac(166);
			Static6.outboundBuffer.p4(arg3);
			Static6.outboundBuffer.p2(arg1);
		}
		if (arg2 == 8) {
			Static6.outboundBuffer.p1isaac(64);
			Static6.outboundBuffer.p4(arg3);
			Static6.outboundBuffer.p2(arg1);
		}
		if (arg2 == 9) {
			Static6.outboundBuffer.p1isaac(53);
			Static6.outboundBuffer.p4(arg3);
			Static6.outboundBuffer.p2(arg1);
		}
		if (arg2 == 10) {
			Static6.outboundBuffer.p1isaac(9);
			Static6.outboundBuffer.p4(arg3);
			Static6.outboundBuffer.p2(arg1);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILclient!fe;)V")
	public static void method4514(@OriginalArg(0) int arg0, @OriginalArg(2) PathingEntity arg1) {
		if (Static83.anInt372 < arg1.anInt3395) {
			Static18.method553(arg1);
		} else if (arg1.anInt3386 >= Static83.anInt372) {
			Static280.method4665(arg1);
		} else {
			Static104.method2247(arg1);
		}
		if (arg1.anInt3412 < 128 || arg1.anInt3421 < 128 || arg1.anInt3412 >= 13184 || arg1.anInt3421 >= 13184) {
			arg1.anInt3369 = -1;
			arg1.anInt3432 = -1;
			arg1.anInt3395 = 0;
			arg1.anInt3386 = 0;
			arg1.anInt3412 = arg1.movementQueueX[0] * 128 + arg1.method2693() * 64;
			arg1.anInt3421 = arg1.movementQueueZ[0] * 128 + arg1.method2693() * 64;
			arg1.method2689();
		}
		if (arg1 == Static173.self && (arg1.anInt3412 < 1536 || arg1.anInt3421 < 1536 || arg1.anInt3412 >= 11776 || arg1.anInt3421 >= 11776)) {
			arg1.anInt3432 = -1;
			arg1.anInt3395 = 0;
			arg1.anInt3386 = 0;
			arg1.anInt3369 = -1;
			arg1.anInt3412 = arg1.movementQueueX[0] * 128 + arg1.method2693() * 64;
			arg1.anInt3421 = arg1.movementQueueZ[0] * 128 + arg1.method2693() * 64;
			arg1.method2689();
		}
		Static37.method949(arg1);
		Static34.method879(arg1);
	}
}
