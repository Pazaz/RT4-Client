import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "Lclient!na;")
	public static final JagString aClass100_1101 = Static28.parse(" <col=ffff00>");

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "Lclient!na;")
	public static JagString mainLoadPrimaryText = null;

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "Lclient!na;")
	public static final JagString aClass100_1103 = Static28.parse("ul");

	@OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
	public static int anInt5867 = 0;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
	public static void method4645() {
		while (true) {
			if (Static57.aClass3_Sub15_Sub1_3.method2241(Static223.anInt5028) >= 27) {
				@Pc(14) int local14 = Static57.aClass3_Sub15_Sub1_3.method2238(15);
				if (local14 != 32767) {
					@Pc(19) boolean local19 = false;
					if (Static175.aClass8_Sub4_Sub2Array1[local14] == null) {
						local19 = true;
						Static175.aClass8_Sub4_Sub2Array1[local14] = new Npc();
					}
					@Pc(37) Npc local37 = Static175.aClass8_Sub4_Sub2Array1[local14];
					Static33.anIntArray79[Static272.anInt5214++] = local14;
					local37.anInt3430 = Static83.anInt372;
					if (local37.aClass96_1 != null && local37.aClass96_1.method2935()) {
						Static91.method1877(local37);
					}
					@Pc(66) int local66 = Static57.aClass3_Sub15_Sub1_3.method2238(1);
					@Pc(73) int local73 = Static56.anIntArray141[Static57.aClass3_Sub15_Sub1_3.method2238(3)];
					if (local19) {
						local37.anInt3400 = local37.anInt3381 = local73;
					}
					@Pc(86) int local86 = Static57.aClass3_Sub15_Sub1_3.method2238(1);
					if (local86 == 1) {
						Static44.anIntArray106[Static116.anInt2951++] = local14;
					}
					@Pc(105) int local105 = Static57.aClass3_Sub15_Sub1_3.method2238(5);
					local37.method2698(Static214.method4363(Static57.aClass3_Sub15_Sub1_3.method2238(14)));
					if (local105 > 15) {
						local105 -= 32;
					}
					@Pc(124) int local124 = Static57.aClass3_Sub15_Sub1_3.method2238(5);
					if (local124 > 15) {
						local124 -= 32;
					}
					local37.method2692(local37.aClass96_1.anInt3713);
					local37.anInt3365 = local37.aClass96_1.anInt3737;
					local37.anInt3376 = local37.aClass96_1.anInt3733;
					if (local37.anInt3376 == 0) {
						local37.anInt3381 = 0;
					}
					local37.method2683(local37.method2693(), Static173.self.movementQueueX[0] + local124, local105 + Static173.self.movementQueueZ[0], local66 == 1);
					if (local37.aClass96_1.method2935()) {
						Static122.method2411(local37.movementQueueZ[0], null, 0, local37, local37.movementQueueX[0], Static55.level, null);
					}
					continue;
				}
			}
			Static57.aClass3_Sub15_Sub1_3.method2244();
			return;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIII)V")
	public static void method4647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class120 local3 = new Class120();
		local3.anInt4452 = arg1 / 128;
		local3.anInt4446 = arg2 / 128;
		local3.anInt4461 = arg3 / 128;
		local3.anInt4464 = arg4 / 128;
		local3.anInt4453 = arg0;
		local3.anInt4460 = arg1;
		local3.anInt4445 = arg2;
		local3.anInt4458 = arg3;
		local3.anInt4449 = arg4;
		local3.anInt4444 = arg5;
		local3.anInt4447 = arg6;
		Static91.aClass120Array1[Static28.anInt917++] = local3;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V")
	public static void method4648(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static130.aClass3_Sub5ArrayArrayArray1 = Static276.aClass3_Sub5ArrayArrayArray3;
			Static83.anIntArrayArrayArray4 = Static80.anIntArrayArrayArray19;
			Static182.aClass3_Sub14ArrayArray2 = Static195.aClass3_Sub14ArrayArray3;
		} else {
			Static130.aClass3_Sub5ArrayArrayArray1 = Static197.aClass3_Sub5ArrayArrayArray2;
			Static83.anIntArrayArrayArray4 = Static107.anIntArrayArrayArray10;
			Static182.aClass3_Sub14ArrayArray2 = Static36.aClass3_Sub14ArrayArray1;
		}
		Static126.anInt3114 = Static130.aClass3_Sub5ArrayArrayArray1.length;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
	public static void method4649() {
		Static125.aClass99_18.method3104();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIB)V")
	public static void method4650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static12.anInt391 != 0 && arg1 != -1) {
			Static122.method2410(Static214.aClass153_106, arg1, Static12.anInt391);
			Static144.aBoolean173 = true;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIZLclient!wa;IIBII)V")
	public static void method4651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Buffer arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(32) int local32;
		if (arg5 < 0 || arg5 >= 104 || arg4 < 0 || arg4 >= 104) {
			while (true) {
				local32 = arg3.g1();
				if (local32 == 0) {
					break;
				}
				if (local32 == 1) {
					arg3.g1();
					break;
				}
				if (local32 <= 49) {
					arg3.g1();
				}
			}
			return;
		}
		if (!arg2) {
			Static12.aByteArrayArrayArray2[arg7][arg5][arg4] = 0;
		}
		while (true) {
			local32 = arg3.g1();
			if (local32 == 0) {
				if (arg2) {
					Static83.anIntArrayArrayArray4[0][arg5][arg4] = Static107.anIntArrayArrayArray10[0][arg5][arg4];
				} else if (arg7 == 0) {
					Static83.anIntArrayArrayArray4[0][arg5][arg4] = -Static65.method1498(arg4 + arg1 + 556238, arg0 + arg5 + 932731) * 8;
				} else {
					Static83.anIntArrayArrayArray4[arg7][arg5][arg4] = Static83.anIntArrayArrayArray4[arg7 - 1][arg5][arg4] - 240;
				}
				break;
			}
			if (local32 == 1) {
				@Pc(111) int local111 = arg3.g1();
				if (arg2) {
					Static83.anIntArrayArrayArray4[0][arg5][arg4] = Static107.anIntArrayArrayArray10[0][arg5][arg4] + local111 * 8;
				} else {
					if (local111 == 1) {
						local111 = 0;
					}
					if (arg7 == 0) {
						Static83.anIntArrayArrayArray4[0][arg5][arg4] = -local111 * 8;
					} else {
						Static83.anIntArrayArrayArray4[arg7][arg5][arg4] = Static83.anIntArrayArrayArray4[arg7 - 1][arg5][arg4] - local111 * 8;
					}
				}
				break;
			}
			if (local32 <= 49) {
				Static240.aByteArrayArrayArray14[arg7][arg5][arg4] = arg3.g1s();
				Static163.aByteArrayArrayArray11[arg7][arg5][arg4] = (byte) ((local32 - 2) / 4);
				Static4.aByteArrayArrayArray1[arg7][arg5][arg4] = (byte) (local32 + arg6 - 2 & 0x3);
			} else if (local32 > 81) {
				Static253.aByteArrayArrayArray16[arg7][arg5][arg4] = (byte) (local32 - 81);
			} else if (!arg2) {
				Static12.aByteArrayArrayArray2[arg7][arg5][arg4] = (byte) (local32 - 49);
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BII)I")
	public static int method4652(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Inv local8 = (Inv) Static20.aClass133_2.method3863((long) arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(25) int local25 = 0;
			for (@Pc(27) int local27 = 0; local27 < local8.anIntArray422.length; local27++) {
				if (arg1 == local8.anIntArray420[local27]) {
					local25 += local8.anIntArray422[local27];
				}
			}
			return local25;
		}
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V")
	public static void method4653() {
		if (Static124.socket != null) {
			Static124.socket.method2834();
			Static124.socket = null;
		}
		Static217.method3768();
		Static65.method1500();
		@Pc(19) int local19;
		for (local19 = 0; local19 < 4; local19++) {
			Static148.aClass97Array1[local19].method3050();
		}
		Static116.method2325(false);
		System.gc();
		Static29.method801();
		Static144.aBoolean173 = false;
		Static221.anInt4363 = -1;
		Static260.method3852(true);
		Static230.aBoolean250 = false;
		Static142.originZ = 0;
		Static80.anInt4701 = 0;
		Static52.anInt1695 = 0;
		Static225.originX = 0;
		for (local19 = 0; local19 < Static143.aClass102Array1.length; local19++) {
			Static143.aClass102Array1[local19] = null;
		}
		Static267.anInt5774 = 0;
		Static272.anInt5214 = 0;
		for (local19 = 0; local19 < 2048; local19++) {
			Static159.aClass8_Sub4_Sub1Array1[local19] = null;
			Static115.aClass3_Sub15Array1[local19] = null;
		}
		for (local19 = 0; local19 < 32768; local19++) {
			Static175.aClass8_Sub4_Sub2Array1[local19] = null;
		}
		for (local19 = 0; local19 < 4; local19++) {
			for (@Pc(115) int local115 = 0; local115 < 104; local115++) {
				for (@Pc(122) int local122 = 0; local122 < 104; local122++) {
					Static159.aClass69ArrayArrayArray1[local19][local115][local122] = null;
				}
			}
		}
		Static35.method902();
		Static189.anInt4443 = 0;
		Static8.method121();
		Static73.method1596(true);
	}
}
