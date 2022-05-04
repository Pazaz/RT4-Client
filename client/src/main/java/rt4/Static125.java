package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static125 {

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
	public static int anInt3096 = 0;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIII)V")
	public static void method2448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Protocol.outboundBuffer.offset = 0;
		Protocol.outboundBuffer.p1(147);
		Protocol.outboundBuffer.p1(arg2);
		Protocol.outboundBuffer.p1(arg3);
		Protocol.outboundBuffer.p2(arg0);
		Protocol.outboundBuffer.p2(arg1);
		CreateManager.loops = 0;
		CreateManager.errors = 0;
		CreateManager.step = 1;
		CreateManager.reply = -3;
	}

}
