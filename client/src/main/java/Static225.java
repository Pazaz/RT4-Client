import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "I")
	public static int anInt5068;

	@OriginalMember(owner = "client!se", name = "l", descriptor = "Lclient!ve;")
	public static Class153 aClass153_92;

	@OriginalMember(owner = "client!se", name = "b", descriptor = "Lclient!na;")
	private static final Class100 aClass100_959 = Static28.method790("Prepared sound engine");

	@OriginalMember(owner = "client!se", name = "h", descriptor = "I")
	public static int anInt5073 = -1;

	@OriginalMember(owner = "client!se", name = "o", descriptor = "Lclient!na;")
	private static final Class100 aClass100_962 = Static28.method790("Select");

	@OriginalMember(owner = "client!se", name = "k", descriptor = "Lclient!na;")
	public static Class100 aClass100_960 = aClass100_962;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "Lclient!na;")
	public static final Class100 aClass100_961 = Static28.method790(" )2>");

	@OriginalMember(owner = "client!se", name = "s", descriptor = "Lclient!na;")
	public static final Class100 aClass100_963 = Static28.method790("Eingabeprozedur geladen)3");

	@OriginalMember(owner = "client!se", name = "t", descriptor = "[I")
	public static final int[] anIntArray445 = new int[] { 12543016, 15504954, 15914854, 16773818 };

	@OriginalMember(owner = "client!se", name = "v", descriptor = "Lclient!na;")
	public static Class100 aClass100_964 = aClass100_959;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	public static void method3889() {
		while (true) {
			if (Static57.aClass3_Sub15_Sub1_3.method2241(Static223.anInt5028) >= 11) {
				@Pc(20) int local20 = Static57.aClass3_Sub15_Sub1_3.method2238(11);
				if (local20 != 2047) {
					@Pc(27) boolean local27 = false;
					if (Static159.aClass8_Sub4_Sub1Array1[local20] == null) {
						Static159.aClass8_Sub4_Sub1Array1[local20] = new Class8_Sub4_Sub1();
						local27 = true;
						if (Static115.aClass3_Sub15Array1[local20] != null) {
							Static159.aClass8_Sub4_Sub1Array1[local20].method1262(Static115.aClass3_Sub15Array1[local20]);
						}
					}
					Static105.anIntArray256[Static267.anInt5774++] = local20;
					@Pc(65) Class8_Sub4_Sub1 local65 = Static159.aClass8_Sub4_Sub1Array1[local20];
					local65.anInt3430 = Static83.anInt372;
					@Pc(73) int local73 = Static57.aClass3_Sub15_Sub1_3.method2238(1);
					if (local73 == 1) {
						Static44.anIntArray106[Static116.anInt2951++] = local20;
					}
					@Pc(92) int local92 = Static57.aClass3_Sub15_Sub1_3.method2238(5);
					@Pc(99) int local99 = Static56.anIntArray141[Static57.aClass3_Sub15_Sub1_3.method2238(3)];
					if (local92 > 15) {
						local92 -= 32;
					}
					if (local27) {
						local65.anInt3400 = local65.anInt3381 = local99;
					}
					@Pc(116) int local116 = Static57.aClass3_Sub15_Sub1_3.method2238(1);
					@Pc(121) int local121 = Static57.aClass3_Sub15_Sub1_3.method2238(5);
					if (local121 > 15) {
						local121 -= 32;
					}
					local65.method1265(local92 + Static173.aClass8_Sub4_Sub1_2.anIntArray318[0], local116 == 1, Static173.aClass8_Sub4_Sub1_2.anIntArray317[0] + local121);
					continue;
				}
			}
			Static57.aClass3_Sub15_Sub1_3.method2244();
			return;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIZ)I")
	public static int method3891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8 = arg3 & 0xF;
		@Pc(29) int local29 = local8 >= 4 ? (local8 == 12 || local8 == 14 ? arg0 : arg1) : arg2;
		@Pc(42) int local42 = local8 < 8 ? arg0 : arg2;
		return ((local8 & 0x1) == 0 ? local42 : -local42) + ((local8 & 0x2) == 0 ? local29 : -local29);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
	public static void method3893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class3_Sub2_Sub8 local14 = Static238.method4143(5, arg0);
		local14.method1017();
		local14.anInt1271 = arg1;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!na;Lclient!na;IB)V")
	public static void method3896(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) int arg2) {
		Static186.aClass100_828 = arg1;
		Static5.anInt39 = arg2;
		Static186.aClass100_829 = arg0;
		if (Static186.aClass100_829.method3108(Static186.aClass100_827) || Static186.aClass100_828.method3108(Static186.aClass100_827)) {
			Static266.anInt5336 = 3;
		} else if (Static125.anInt3103 == -1) {
			Static20.anInt673 = 0;
			Static196.anInt4587 = 0;
			Static266.anInt5336 = -3;
			Static219.anInt4937 = 1;
			@Pc(43) Class3_Sub15 local43 = new Class3_Sub15(128);
			local43.method2178(10);
			local43.method2230((int) (Math.random() * 99999.0D));
			local43.method2230(530);
			local43.method2166(Static186.aClass100_829.method3158());
			local43.method2164((int) (Math.random() * 9.9999999E7D));
			local43.method2171(Static186.aClass100_828);
			local43.method2164((int) (Math.random() * 9.9999999E7D));
			local43.method2226(Static86.aBigInteger1, Static256.aBigInteger2);
			Static6.aClass3_Sub15_Sub1_1.anInt2792 = 0;
			Static6.aClass3_Sub15_Sub1_1.method2178(210);
			Static6.aClass3_Sub15_Sub1_1.method2178(local43.anInt2792);
			Static6.aClass3_Sub15_Sub1_1.method2179(local43.aByteArray40, local43.anInt2792);
		} else {
			Static49.method1208();
		}
	}
}
