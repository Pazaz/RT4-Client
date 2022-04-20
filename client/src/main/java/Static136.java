import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
	public static int anInt3324;

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
	public static int anInt3322 = -1;

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
	public static int anInt3325 = 0;

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "Lclient!na;")
	public static final JagString aClass100_633 = Static28.parse("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIB)V")
	public static void method2649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) DelayedStateChange local4 = Static238.method4143(6, arg1);
		local4.method1017();
		local4.intArg1 = arg0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZLjava/awt/event/KeyEvent;)I")
	public static int method2650(@OriginalArg(1) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 == 8364) {
			return 128;
		} else {
			if (local6 <= 0 || local6 >= 256) {
				local6 = -1;
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(Lclient!wa;I)V")
	public static void method2654(@OriginalArg(0) Buffer arg0) {
		if (arg0.data.length - arg0.offset < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.g1();
		if (local21 < 0 || local21 > 11) {
			return;
		}
		@Pc(34) byte local34;
		if (local21 == 11) {
			local34 = 33;
		} else if (local21 == 10) {
			local34 = 32;
		} else if (local21 == 9) {
			local34 = 31;
		} else if (local21 == 8) {
			local34 = 30;
		} else if (local21 == 7) {
			local34 = 29;
		} else if (local21 == 6) {
			local34 = 28;
		} else if (local21 == 5) {
			local34 = 28;
		} else if (local21 == 4) {
			local34 = 24;
		} else if (local21 == 3) {
			local34 = 23;
		} else if (local21 == 2) {
			local34 = 22;
		} else if (local21 == 1) {
			local34 = 23;
		} else {
			local34 = 19;
		}
		if (arg0.data.length - arg0.offset < local34) {
			return;
		}
		Static113.anInt4609 = arg0.g1();
		if (Static113.anInt4609 < 1) {
			Static113.anInt4609 = 1;
		} else if (Static113.anInt4609 > 4) {
			Static113.anInt4609 = 4;
		}
		Static53.method1293(arg0.g1() == 1);
		Static80.aBoolean231 = arg0.g1() == 1;
		Static250.aBoolean283 = arg0.g1() == 1;
		Static53.aBoolean99 = arg0.g1() == 1;
		Static15.aBoolean33 = arg0.g1() == 1;
		Static11.aBoolean15 = arg0.g1() == 1;
		Static159.aBoolean189 = arg0.g1() == 1;
		Static209.aBoolean240 = arg0.g1() == 1;
		Static139.anInt3451 = arg0.g1();
		if (Static139.anInt3451 > 2) {
			Static139.anInt3451 = 2;
		}
		if (local21 < 2) {
			Static178.highDetailLighting = arg0.g1() == 1;
			arg0.g1();
		} else {
			Static178.highDetailLighting = arg0.g1() == 1;
		}
		Static220.aBoolean244 = arg0.g1() == 1;
		Static71.aBoolean107 = arg0.g1() == 1;
		Static102.anInt2679 = arg0.g1();
		if (Static102.anInt2679 > 2) {
			Static102.anInt2679 = 2;
		}
		Static186.anInt4392 = Static102.anInt2679;
		Static99.aBoolean143 = arg0.g1() == 1;
		Static125.anInt3104 = arg0.g1();
		if (Static125.anInt3104 > 127) {
			Static125.anInt3104 = 127;
		}
		Static12.anInt391 = arg0.g1();
		Static30.anInt978 = arg0.g1();
		if (Static30.anInt978 > 127) {
			Static30.anInt978 = 127;
		}
		if (local21 >= 1) {
			Static114.anInt5831 = arg0.g2();
			Static22.anInt729 = arg0.g2();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.g1();
		}
		if (local21 >= 4) {
			@Pc(386) int local386 = arg0.g1();
			if (Static238.anInt5316 < 96) {
				local386 = 0;
			}
			Static76.method1645(local386);
		}
		if (local21 >= 5) {
			Static164.anInt3988 = arg0.g4();
		}
		if (local21 >= 6) {
			Static214.anInt5581 = arg0.g1();
		}
		if (local21 >= 7) {
			Static164.aBoolean191 = arg0.g1() == 1;
		}
		if (local21 >= 8) {
			Static33.aBoolean63 = arg0.g1() == 1;
		}
		if (local21 >= 9) {
			Static141.anInt3474 = arg0.g1();
		}
		if (local21 >= 10) {
			Static127.aBoolean159 = arg0.g1() != 0;
		}
		if (local21 >= 11) {
			Static64.aBoolean111 = arg0.g1() != 0;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Z")
	public static boolean method2655() {
		return Static14.anInt441 == 0 ? Static172.aClass3_Sub3_Sub4_2.method4414() : true;
	}
}
