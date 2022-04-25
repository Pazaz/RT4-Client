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
	public static final JagString aClass100_1081 = JagString.parse("<col=80ff00>");

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
			local19.arguments = local8.anObjectArray29;
			local19.source = local8;
			local19.opBase = arg0;
			local19.op = arg2;
			Static82.method1767(local19);
		}
		@Pc(37) boolean local37 = true;
		if (local8.anInt453 > 0) {
			local37 = Static249.method4265(local8);
		}
		if (!local37 || !InterfaceList.getServerActiveProperties(local8).method503(arg2 - 1)) {
			return;
		}
		if (arg2 == 1) {
			Protocol.outboundBuffer.p1isaac(155);
			Protocol.outboundBuffer.p4(arg3);
			Protocol.outboundBuffer.p2(arg1);
		}
		if (arg2 == 2) {
			Protocol.outboundBuffer.p1isaac(196);
			Protocol.outboundBuffer.p4(arg3);
			Protocol.outboundBuffer.p2(arg1);
		}
		if (arg2 == 3) {
			Protocol.outboundBuffer.p1isaac(124);
			Protocol.outboundBuffer.p4(arg3);
			Protocol.outboundBuffer.p2(arg1);
		}
		if (arg2 == 4) {
			Protocol.outboundBuffer.p1isaac(199);
			Protocol.outboundBuffer.p4(arg3);
			Protocol.outboundBuffer.p2(arg1);
		}
		if (arg2 == 5) {
			Protocol.outboundBuffer.p1isaac(234);
			Protocol.outboundBuffer.p4(arg3);
			Protocol.outboundBuffer.p2(arg1);
		}
		if (arg2 == 6) {
			Protocol.outboundBuffer.p1isaac(168);
			Protocol.outboundBuffer.p4(arg3);
			Protocol.outboundBuffer.p2(arg1);
		}
		if (arg2 == 7) {
			Protocol.outboundBuffer.p1isaac(166);
			Protocol.outboundBuffer.p4(arg3);
			Protocol.outboundBuffer.p2(arg1);
		}
		if (arg2 == 8) {
			Protocol.outboundBuffer.p1isaac(64);
			Protocol.outboundBuffer.p4(arg3);
			Protocol.outboundBuffer.p2(arg1);
		}
		if (arg2 == 9) {
			Protocol.outboundBuffer.p1isaac(53);
			Protocol.outboundBuffer.p4(arg3);
			Protocol.outboundBuffer.p2(arg1);
		}
		if (arg2 == 10) {
			Protocol.outboundBuffer.p1isaac(9);
			Protocol.outboundBuffer.p4(arg3);
			Protocol.outboundBuffer.p2(arg1);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILclient!fe;)V")
	public static void method4514(@OriginalArg(0) int arg0, @OriginalArg(2) PathingEntity arg1) {
		if (client.loop < arg1.anInt3395) {
			Static18.method553(arg1);
		} else if (arg1.anInt3386 >= client.loop) {
			Static280.method4665(arg1);
		} else {
			Static104.method2247(arg1);
		}
		if (arg1.xFine < 128 || arg1.zFine < 128 || arg1.xFine >= 13184 || arg1.zFine >= 13184) {
			arg1.seqId = -1;
			arg1.spotAnimId = -1;
			arg1.anInt3395 = 0;
			arg1.anInt3386 = 0;
			arg1.xFine = arg1.movementQueueX[0] * 128 + arg1.getSize() * 64;
			arg1.zFine = arg1.movementQueueZ[0] * 128 + arg1.getSize() * 64;
			arg1.method2689();
		}
		if (arg1 == PlayerList.self && (arg1.xFine < 1536 || arg1.zFine < 1536 || arg1.xFine >= 11776 || arg1.zFine >= 11776)) {
			arg1.spotAnimId = -1;
			arg1.anInt3395 = 0;
			arg1.anInt3386 = 0;
			arg1.seqId = -1;
			arg1.xFine = arg1.movementQueueX[0] * 128 + arg1.getSize() * 64;
			arg1.zFine = arg1.movementQueueZ[0] * 128 + arg1.getSize() * 64;
			arg1.method2689();
		}
		Static37.method949(arg1);
		Static34.method879(arg1);
	}
}
