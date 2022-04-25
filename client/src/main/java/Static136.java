import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
	public static int anInt3324;

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
	public static int logoId = -1;

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
	public static int anInt3325 = 0;

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "Lclient!na;")
	public static final JagString CS_ERROR = JagString.parse("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIB)V")
	public static void method2649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) DelayedStateChange local4 = Static238.method4143(6, arg1);
		local4.pushServer();
		local4.intArg1 = arg0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Z")
	public static boolean method2655() {
		return Static14.anInt441 == 0 ? Static172.aClass3_Sub3_Sub4_2.method4414() : true;
	}
}
