package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!da", name = "ab", descriptor = "I")
	public static int anInt1275;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	public static String method1014(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg2.indexOf(arg0); local5 != -1; local5 = arg2.indexOf(arg0, local5 + arg1.length())) {
			arg2 = arg2.substring(0, local5) + arg1 + arg2.substring(arg0.length() + local5);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILclient!be;)V")
	public static void method1015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) {
		if (Static105.aClass13_14 != null || Static60.aBoolean108 || (arg2 == null || Static89.method1836(arg2) == null)) {
			return;
		}
		Static105.aClass13_14 = arg2;
		Static4.aClass13_1 = Static89.method1836(arg2);
		Static246.anInt5388 = arg1;
		Static138.aBoolean172 = false;
		Static213.anInt4851 = 0;
		Static165.anInt4035 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILclient!na;JI)V")
	public static void method1016(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) JagString password, @OriginalArg(5) long name, @OriginalArg(6) int arg5) {
		@Pc(8) Buffer local8 = new Buffer(GlobalConfig.LOGIN_USE_STRINGS ? 129 : 128);
		local8.p1(10);
		local8.p2((int) (Math.random() * 99999.0D));
		local8.p2(530);
		if (GlobalConfig.LOGIN_USE_STRINGS) {
			local8.pjstr(Base37.decode37(name));
		} else {
			local8.p8(name);
		}
		local8.p4((int) (Math.random() * 9.9999999E7D));
		local8.pjstr(password);
		local8.p4((int) (Math.random() * 9.9999999E7D));
		local8.p2(client.affiliate);
		local8.p1(arg0);
		local8.p1(arg2);
		local8.p4((int) (Math.random() * 9.9999999E7D));
		local8.p2(arg5);
		local8.p2(arg1);
		local8.p4((int) (Math.random() * 9.9999999E7D));
		local8.encryptRsa(GlobalConfig.RSA_EXPONENT, GlobalConfig.RSA_MODULUS);
		Protocol.outboundBuffer.offset = 0;
		Protocol.outboundBuffer.p1(36);
		Protocol.outboundBuffer.p1(local8.offset);
		Protocol.outboundBuffer.pBytes(local8.data, local8.offset);
		CreateManager.reply = -3;
		CreateManager.step = 1;
		CreateManager.loops = 0;
		CreateManager.errors = 0;
	}

	@OriginalMember(owner = "client!da", name = "h", descriptor = "(B)V")
	public static void method1019() {
		Component.sprites.method3103();
		Component.models.method3103();
		Component.fonts.method3103();
	}
}
