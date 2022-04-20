import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
	public static int anInt2147;

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "Lclient!ve;")
	public static Js5 aClass153_32;

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "Lclient!qf;")
	public static Sprite aClass3_Sub2_Sub1_3;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "Lclient!na;")
	public static final JagString aClass100_464 = Static28.parse("null");

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Lclient!na;")
	public static final JagString aClass100_465 = Static28.parse(")0");

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "[I")
	public static final int[] anIntArray204 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "Lclient!na;")
	public static JagString aClass100_466 = null;

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
	public static int anInt2145 = 0;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIBI)I")
	public static int method1690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return arg2 > arg1 ? arg2 : arg1 > arg0 ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(JI)V")
	public static void method1691(@OriginalArg(0) long name) {
		Static6.outboundBuffer.offset = 0;
		Static6.outboundBuffer.p1(186);
		if (GlobalConfig.LOGIN_USE_STRINGS) {
			Static6.outboundBuffer.pjstr(Static79.decode37(name));
		} else {
			Static6.outboundBuffer.p8(name);
		}
		Static179.anInt4261 = 1;
		Static226.anInt5079 = 0;
		Static57.anInt1758 = 0;
		Static223.anInt5034 = -3;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!ve;II)Lclient!mm;")
	public static SoftwareSprite method1693(@OriginalArg(0) int arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(3) int arg2) {
		return Static234.method4016(arg1, arg0, arg2) ? Static196.method3537() : null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public static void method1694() {
		Static125.aClass99_19.method3103();
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	public static void method1695() {
		Static220.aClass99_28.method3104();
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
	public static void method1696() {
		Static7.method842(false);
		Static175.anInt4220 = 0;
		@Pc(12) boolean local12 = true;
		@Pc(14) int local14;
		for (local14 = 0; local14 < Static273.aByteArrayArray13.length; local14++) {
			if (Static36.anIntArray84[local14] != -1 && Static273.aByteArrayArray13[local14] == null) {
				Static273.aByteArrayArray13[local14] = Static26.aClass153_16.method4495(Static36.anIntArray84[local14], 0);
				if (Static273.aByteArrayArray13[local14] == null) {
					Static175.anInt4220++;
					local12 = false;
				}
			}
			if (Static172.anIntArray366[local14] != -1 && Static156.aByteArrayArray11[local14] == null) {
				Static156.aByteArrayArray11[local14] = Static26.aClass153_16.method4488(Static172.anIntArray366[local14], Static72.anIntArrayArray14[local14], 0);
				if (Static156.aByteArrayArray11[local14] == null) {
					local12 = false;
					Static175.anInt4220++;
				}
			}
			if (GlRenderer.enabled) {
				if (Static99.anIntArray239[local14] != -1 && Static186.aByteArrayArray14[local14] == null) {
					Static186.aByteArrayArray14[local14] = Static26.aClass153_16.method4495(Static99.anIntArray239[local14], 0);
					if (Static186.aByteArrayArray14[local14] == null) {
						local12 = false;
						Static175.anInt4220++;
					}
				}
				if (Static35.anIntArray82[local14] != -1 && Static19.aByteArrayArray4[local14] == null) {
					Static19.aByteArrayArray4[local14] = Static26.aClass153_16.method4495(Static35.anIntArray82[local14], 0);
					if (Static19.aByteArrayArray4[local14] == null) {
						Static175.anInt4220++;
						local12 = false;
					}
				}
			}
			if (Static175.anIntArray371 != null && Static191.aByteArrayArray15[local14] == null && Static175.anIntArray371[local14] != -1) {
				Static191.aByteArrayArray15[local14] = Static26.aClass153_16.method4488(Static175.anIntArray371[local14], Static72.anIntArrayArray14[local14], 0);
				if (Static191.aByteArrayArray15[local14] == null) {
					Static175.anInt4220++;
					local12 = false;
				}
			}
		}
		if (Static235.aClass134_2 == null) {
			if (Static158.aClass3_Sub2_Sub4_3 == null || !Static227.aClass153_94.method4497(Static34.method882(new JagString[] { Static158.aClass3_Sub2_Sub4_3.aClass100_138, Static50.aClass100_363 }))) {
				Static235.aClass134_2 = new Class134(0);
			} else if (Static227.aClass153_94.method4489(Static34.method882(new JagString[] { Static158.aClass3_Sub2_Sub4_3.aClass100_138, Static50.aClass100_363 }))) {
				Static235.aClass134_2 = Static140.method2711(Static34.method882(new JagString[] { Static158.aClass3_Sub2_Sub4_3.aClass100_138, Static50.aClass100_363 }), Static227.aClass153_94);
			} else {
				local12 = false;
				Static175.anInt4220++;
			}
		}
		if (!local12) {
			Static233.anInt5223 = 1;
			return;
		}
		Static271.anInt5804 = 0;
		local12 = true;
		@Pc(320) int local320;
		@Pc(309) int local309;
		for (local14 = 0; local14 < Static273.aByteArrayArray13.length; local14++) {
			@Pc(294) byte[] local294 = Static156.aByteArrayArray11[local14];
			if (local294 != null) {
				local309 = (Static238.anIntArray470[local14] & 0xFF) * 64 - Static142.originZ;
				local320 = (Static238.anIntArray470[local14] >> 8) * 64 - Static225.originX;
				if (Static230.aBoolean250) {
					local309 = 10;
					local320 = 10;
				}
				local12 &= Static49.method1201(local320, local309, local294);
			}
			if (GlRenderer.enabled) {
				local294 = Static19.aByteArrayArray4[local14];
				if (local294 != null) {
					local320 = (Static238.anIntArray470[local14] >> 8) * 64 - Static225.originX;
					local309 = (Static238.anIntArray470[local14] & 0xFF) * 64 - Static142.originZ;
					if (Static230.aBoolean250) {
						local309 = 10;
						local320 = 10;
					}
					local12 &= Static49.method1201(local320, local309, local294);
				}
			}
		}
		if (!local12) {
			Static233.anInt5223 = 2;
			return;
		}
		if (Static233.anInt5223 != 0) {
			Static114.method4636(true, Static34.method882(new JagString[] { LocalizedText.LOADING, Static18.aClass100_108 }));
		}
		Static107.method2261();
		Static217.method3768();
		@Pc(420) boolean local420 = false;
		@Pc(427) int local427;
		if (GlRenderer.enabled && Static220.aBoolean244) {
			for (local427 = 0; local427 < Static273.aByteArrayArray13.length; local427++) {
				if (Static19.aByteArrayArray4[local427] != null || Static186.aByteArrayArray14[local427] != null) {
					local420 = true;
					break;
				}
			}
		}
		Static28.method792(GlRenderer.enabled ? 28 : 25, local420);
		for (local427 = 0; local427 < 4; local427++) {
			Static148.aClass97Array1[local427].method3050();
		}
		for (local427 = 0; local427 < 4; local427++) {
			for (local320 = 0; local320 < 104; local320++) {
				for (local309 = 0; local309 < 104; local309++) {
					Static12.aByteArrayArrayArray2[local427][local320][local309] = 0;
				}
			}
		}
		Static260.method3852(false);
		if (GlRenderer.enabled) {
			Static242.aClass36_Sub1_4.method1392();
			for (local427 = 0; local427 < 13; local427++) {
				for (local320 = 0; local320 < 13; local320++) {
					Static242.aClass165ArrayArray1[local427][local320].aBoolean313 = true;
				}
			}
		}
		if (GlRenderer.enabled) {
			Static120.method2404();
		}
		if (GlRenderer.enabled) {
			Static75.method1632();
		}
		Static107.method2261();
		System.gc();
		Static7.method842(true);
		Static196.method3535(false);
		if (!Static230.aBoolean250) {
			Static87.method1805(false);
			Static7.method842(true);
			if (GlRenderer.enabled) {
				local427 = Static173.self.movementQueueX[0] >> 3;
				local320 = Static173.self.movementQueueZ[0] >> 3;
				Static73.method1597(local320, local427);
			}
			Static26.method743(false);
			if (Static191.aByteArrayArray15 != null) {
				Static158.method3013();
			}
		}
		if (Static230.aBoolean250) {
			Static89.method1835(false);
			Static7.method842(true);
			if (GlRenderer.enabled) {
				local427 = Static173.self.movementQueueX[0] >> 3;
				local320 = Static173.self.movementQueueZ[0] >> 3;
				Static73.method1597(local320, local427);
			}
			Static233.method4002(false);
		}
		Static217.method3768();
		Static7.method842(true);
		Static45.method1169(Static148.aClass97Array1, false);
		if (GlRenderer.enabled) {
			Static120.method2395();
		}
		Static7.method842(true);
		local427 = Static146.anInt3508;
		if (local427 > Static55.level) {
			local427 = Static55.level;
		}
		if (local427 < Static55.level - 1) {
		}
		if (Static138.method2697()) {
			Static146.method2750(0);
		} else {
			Static146.method2750(Static146.anInt3508);
		}
		Static105.method2255();
		if (GlRenderer.enabled && local420) {
			Static278.method4648(true);
			Static196.method3535(true);
			if (!Static230.aBoolean250) {
				Static87.method1805(true);
				Static7.method842(true);
				Static26.method743(true);
			}
			if (Static230.aBoolean250) {
				Static89.method1835(true);
				Static7.method842(true);
				Static233.method4002(true);
			}
			Static217.method3768();
			Static7.method842(true);
			Static45.method1169(Static148.aClass97Array1, true);
			Static7.method842(true);
			Static105.method2255();
			Static278.method4648(false);
		}
		if (GlRenderer.enabled) {
			for (local320 = 0; local320 < 13; local320++) {
				for (local309 = 0; local309 < 13; local309++) {
					Static242.aClass165ArrayArray1[local320][local309].method4676(Static83.anIntArrayArrayArray4[0], local320 * 8, local309 * 8);
				}
			}
		}
		for (local320 = 0; local320 < 104; local320++) {
			for (local309 = 0; local309 < 104; local309++) {
				Static220.method3797(local309, local320);
			}
		}
		Static269.method2218();
		Static107.method2261();
		Static219.method3796();
		Static217.method3768();
		Static231.aBoolean252 = false;
		if (Static39.aFrame1 != null && Static124.socket != null && Static244.anInt5370 == 25) {
			Static6.outboundBuffer.p1isaac(20);
			Static6.outboundBuffer.p4(1057001181);
		}
		if (!Static230.aBoolean250) {
			@Pc(815) int local815 = (Static52.anInt1695 + 6) / 8;
			@Pc(821) int local821 = (Static52.anInt1695 - 6) / 8;
			local320 = (Static80.anInt4701 - 6) / 8;
			local309 = (Static80.anInt4701 + 6) / 8;
			for (@Pc(837) int local837 = local320 - 1; local837 <= local309 + 1; local837++) {
				for (@Pc(850) int local850 = local821 - 1; local850 <= local815 + 1; local850++) {
					if (local837 < local320 || local837 > local309 || local850 < local821 || local850 > local815) {
						Static26.aClass153_16.method4486(Static34.method882(new JagString[] { Static103.aClass100_558, Static123.method2423(local837), Static86.aClass100_488, Static123.method2423(local850) }));
						Static26.aClass153_16.method4486(Static34.method882(new JagString[] { Static270.aClass100_1090, Static123.method2423(local837), Static86.aClass100_488, Static123.method2423(local850) }));
					}
				}
			}
		}
		if (Static244.anInt5370 == 28) {
			Static196.method3534(10);
		} else {
			Static196.method3534(30);
			if (Static124.socket != null) {
				Static6.outboundBuffer.p1isaac(110);
			}
		}
		Static141.method2720();
		Static107.method2261();
		Static234.method4020();
	}
}
