import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "F")
	public static float aFloat10;

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "Lclient!ve;")
	public static Js5 aClass153_35;

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
	public static int anInt2257;

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "Lclient!qf;")
	public static Sprite aClass3_Sub2_Sub1_4;

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "[I")
	public static final int[] anIntArray209 = new int[4096];

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "Z")
	public static boolean aBoolean127 = false;

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
	public static int anInt2255 = 0;

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
	public static int anInt2256 = 0;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIBLclient!e;)V")
	public static void method1768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Player arg2) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(24) int local24;
		if ((arg0 & 0x80) != 0) {
			local13 = Static57.aClass3_Sub15_Sub1_3.g2le();
			local17 = Static57.aClass3_Sub15_Sub1_3.g1();
			@Pc(21) int local21 = Static57.aClass3_Sub15_Sub1_3.g1();
			local24 = Static57.aClass3_Sub15_Sub1_3.offset;
			@Pc(35) boolean local35 = (local13 & 0x8000) != 0;
			if (arg2.aClass100_364 != null && arg2.aClass59_1 != null) {
				@Pc(48) long local48 = arg2.aClass100_364.encode37();
				@Pc(50) boolean local50 = false;
				if (local17 <= 1) {
					if (!local35 && (Static124.aBoolean157 && !Static207.aBoolean236 || Static86.aBoolean129)) {
						local50 = true;
					} else {
						for (@Pc(69) int local69 = 0; local69 < Static35.anInt1093; local69++) {
							if (Static190.aLongArray6[local69] == local48) {
								local50 = true;
								break;
							}
						}
					}
				}
				if (!local50 && Static11.anInt384 == 0) {
					Static270.aClass3_Sub15_9.offset = 0;
					Static57.aClass3_Sub15_Sub1_3.gBytesRev(local21, Static270.aClass3_Sub15_9.data);
					Static270.aClass3_Sub15_9.offset = 0;
					@Pc(106) int local106 = -1;
					@Pc(127) JagString local127;
					if (local35) {
						@Pc(112) Class12 local112 = Static264.method3568(Static270.aClass3_Sub15_9);
						local13 &= 0x7FFF;
						local106 = local112.anInt439;
						local127 = local112.aClass3_Sub2_Sub6_1.method770(Static270.aClass3_Sub15_9);
					} else {
						local127 = Static218.method2862(Static65.method1497(Static270.aClass3_Sub15_9).method3116());
					}
					arg2.aClass100_640 = local127.method3144();
					arg2.anInt3352 = local13 & 0xFF;
					arg2.anInt3408 = 150;
					arg2.anInt3429 = local13 >> 8;
					if (local17 == 2) {
						Static154.method2928(local106, local35 ? 17 : 1, local127, null, Static34.method882(new JagString[] { Static44.aClass100_336, arg2.method1264() }));
					} else if (local17 == 1) {
						Static154.method2928(local106, local35 ? 17 : 1, local127, null, Static34.method882(new JagString[] { Static65.aClass100_435, arg2.method1264() }));
					} else {
						Static154.method2928(local106, local35 ? 17 : 2, local127, null, arg2.method1264());
					}
				}
			}
			Static57.aClass3_Sub15_Sub1_3.offset = local24 + local21;
		}
		if ((arg0 & 0x1) != 0) {
			local13 = Static57.aClass3_Sub15_Sub1_3.gSmart1or2();
			local17 = Static57.aClass3_Sub15_Sub1_3.g1add();
			arg2.method2686(local17, Static83.anInt372, local13);
			arg2.anInt3378 = Static83.anInt372 + 300;
			arg2.anInt3372 = Static57.aClass3_Sub15_Sub1_3.g1ssub();
		}
		if ((arg0 & 0x8) != 0) {
			local13 = Static57.aClass3_Sub15_Sub1_3.g2();
			if (local13 == 65535) {
				local13 = -1;
			}
			local17 = Static57.aClass3_Sub15_Sub1_3.g1();
			Static186.method3415(local17, local13, arg2);
		}
		if ((arg0 & 0x4) != 0) {
			local13 = Static57.aClass3_Sub15_Sub1_3.g1add();
			@Pc(309) byte[] local309 = new byte[local13];
			@Pc(314) Buffer local314 = new Buffer(local309);
			Static57.aClass3_Sub15_Sub1_3.gBytes(local13, local309);
			Static115.aClass3_Sub15Array1[arg1] = local314;
			arg2.method1262(local314);
		}
		if ((arg0 & 0x2) != 0) {
			arg2.anInt3370 = Static57.aClass3_Sub15_Sub1_3.g2sub();
			if (arg2.anInt3370 == 65535) {
				arg2.anInt3370 = -1;
			}
		}
		if ((arg0 & 0x400) != 0) {
			arg2.anInt3380 = Static57.aClass3_Sub15_Sub1_3.p1neg();
			arg2.anInt3428 = Static57.aClass3_Sub15_Sub1_3.g1();
			arg2.anInt3416 = Static57.aClass3_Sub15_Sub1_3.g1add();
			arg2.anInt3392 = Static57.aClass3_Sub15_Sub1_3.g1();
			arg2.anInt3395 = Static57.aClass3_Sub15_Sub1_3.g2le() + Static83.anInt372;
			arg2.anInt3386 = Static57.aClass3_Sub15_Sub1_3.g2le() + Static83.anInt372;
			arg2.anInt3431 = Static57.aClass3_Sub15_Sub1_3.p1neg();
			arg2.anInt3409 = 1;
			arg2.anInt3405 = 0;
		}
		if ((arg0 & 0x20) != 0) {
			arg2.aClass100_640 = Static57.aClass3_Sub15_Sub1_3.gjstr();
			if (arg2.aClass100_640.method3149(0) == 126) {
				arg2.aClass100_640 = arg2.aClass100_640.method3136(1);
				Static103.method2231(arg2.method1264(), 2, arg2.aClass100_640);
			} else if (arg2 == Static173.self) {
				Static103.method2231(arg2.method1264(), 2, arg2.aClass100_640);
			}
			arg2.anInt3352 = 0;
			arg2.anInt3429 = 0;
			arg2.anInt3408 = 150;
		}
		if ((arg0 & 0x200) != 0) {
			local13 = Static57.aClass3_Sub15_Sub1_3.gSmart1or2();
			local17 = Static57.aClass3_Sub15_Sub1_3.g1ssub();
			arg2.method2686(local17, Static83.anInt372, local13);
		}
		if ((arg0 & 0x800) != 0) {
			local13 = Static57.aClass3_Sub15_Sub1_3.p1neg();
			@Pc(502) int[] local502 = new int[local13];
			@Pc(505) int[] local505 = new int[local13];
			@Pc(508) int[] local508 = new int[local13];
			for (@Pc(510) int local510 = 0; local510 < local13; local510++) {
				@Pc(521) int local521 = Static57.aClass3_Sub15_Sub1_3.g2le();
				if (local521 == 65535) {
					local521 = -1;
				}
				local502[local510] = local521;
				local505[local510] = Static57.aClass3_Sub15_Sub1_3.g1add();
				local508[local510] = Static57.aClass3_Sub15_Sub1_3.g2();
			}
			Static32.method865(local505, local502, arg2, local508);
		}
		if ((arg0 & 0x100) != 0) {
			local13 = Static57.aClass3_Sub15_Sub1_3.g2le();
			if (local13 == 65535) {
				local13 = -1;
			}
			local17 = Static57.aClass3_Sub15_Sub1_3.p4rme();
			@Pc(573) boolean local573 = true;
			if (local13 != -1 && arg2.anInt3432 != -1 && Static36.method941(Static34.method877(local13).anInt1754).anInt5355 < Static36.method941(Static34.method877(arg2.anInt3432).anInt1754).anInt5355) {
				local573 = false;
			}
			if (local573) {
				arg2.anInt3359 = (local17 & 0xFFFF) + Static83.anInt372;
				arg2.anInt3361 = 0;
				arg2.anInt3399 = 0;
				arg2.anInt3432 = local13;
				if (arg2.anInt3359 > Static83.anInt372) {
					arg2.anInt3399 = -1;
				}
				arg2.anInt3394 = local17 >> 16;
				arg2.anInt3418 = 1;
				if (arg2.anInt3432 != -1 && Static83.anInt372 == arg2.anInt3359) {
					local24 = Static34.method877(arg2.anInt3432).anInt1754;
					if (local24 != -1) {
						@Pc(663) SeqType local663 = Static36.method941(local24);
						if (local663 != null && local663.anIntArray473 != null) {
							Static152.method2836(arg2.anInt3421, local663, arg2.anInt3412, arg2 == Static173.self, 0);
						}
					}
				}
			}
		}
		if ((arg0 & 0x40) != 0) {
			arg2.anInt3382 = Static57.aClass3_Sub15_Sub1_3.g2();
			arg2.anInt3363 = Static57.aClass3_Sub15_Sub1_3.g2leadd();
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([BI)V")
	public static void method1770(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Buffer local4 = new Buffer(arg0);
		local4.offset = arg0.length - 2;
		Static165.anInt4038 = local4.g2();
		Static26.anIntArray66 = new int[Static165.anInt4038];
		Static254.anIntArray488 = new int[Static165.anInt4038];
		Static274.anIntArray440 = new int[Static165.anInt4038];
		Static159.aBooleanArray87 = new boolean[Static165.anInt4038];
		Static64.aByteArrayArray9 = new byte[Static165.anInt4038][];
		Static269.anIntArray252 = new int[Static165.anInt4038];
		Static7.aByteArrayArray5 = new byte[Static165.anInt4038][];
		local4.offset = arg0.length - Static165.anInt4038 * 8 - 7;
		Static124.anInt3080 = local4.g2();
		Static227.anInt5091 = local4.g2();
		@Pc(66) int local66 = (local4.g1() & 0xFF) + 1;
		@Pc(68) int local68;
		for (local68 = 0; local68 < Static165.anInt4038; local68++) {
			Static274.anIntArray440[local68] = local4.g2();
		}
		for (local68 = 0; local68 < Static165.anInt4038; local68++) {
			Static269.anIntArray252[local68] = local4.g2();
		}
		for (local68 = 0; local68 < Static165.anInt4038; local68++) {
			Static254.anIntArray488[local68] = local4.g2();
		}
		for (local68 = 0; local68 < Static165.anInt4038; local68++) {
			Static26.anIntArray66[local68] = local4.g2();
		}
		local4.offset = arg0.length + 3 - Static165.anInt4038 * 8 - local66 * 3 - 7;
		Static259.anIntArray513 = new int[local66];
		for (local68 = 1; local68 < local66; local68++) {
			Static259.anIntArray513[local68] = local4.g3();
			if (Static259.anIntArray513[local68] == 0) {
				Static259.anIntArray513[local68] = 1;
			}
		}
		local4.offset = 0;
		for (local68 = 0; local68 < Static165.anInt4038; local68++) {
			@Pc(195) int local195 = Static254.anIntArray488[local68];
			@Pc(199) int local199 = Static26.anIntArray66[local68];
			@Pc(203) int local203 = local195 * local199;
			@Pc(206) byte[] local206 = new byte[local203];
			@Pc(208) boolean local208 = false;
			Static7.aByteArrayArray5[local68] = local206;
			@Pc(215) byte[] local215 = new byte[local203];
			Static64.aByteArrayArray9[local68] = local215;
			@Pc(223) int local223 = local4.g1();
			@Pc(232) int local232;
			if ((local223 & 0x1) == 0) {
				for (local232 = 0; local232 < local203; local232++) {
					local206[local232] = local4.g1s();
				}
				if ((local223 & 0x2) != 0) {
					for (local232 = 0; local232 < local203; local232++) {
						@Pc(343) byte local343 = local215[local232] = local4.g1s();
						local208 |= local343 != -1;
					}
				}
			} else {
				local232 = 0;
				label88: while (true) {
					@Pc(241) int local241;
					if (local232 >= local195) {
						if ((local223 & 0x2) == 0) {
							break;
						}
						local232 = 0;
						while (true) {
							if (local232 >= local195) {
								break label88;
							}
							for (local241 = 0; local241 < local199; local241++) {
								@Pc(291) byte local291 = local215[local195 * local241 + local232] = local4.g1s();
								local208 |= local291 != -1;
							}
							local232++;
						}
					}
					for (local241 = 0; local241 < local199; local241++) {
						local206[local232 + local241 * local195] = local4.g1s();
					}
					local232++;
				}
			}
			Static159.aBooleanArray87[local68] = local208;
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V")
	public static void method1771() {
		Static62.anIntArray150 = Static206.method3679(0.4F);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!rg;Lclient!rg;B)V")
	public static void method1772(@OriginalArg(0) SecondaryNode arg0, @OriginalArg(1) SecondaryNode arg1) {
		if (arg1.aClass3_Sub2_66 != null) {
			arg1.method4365();
		}
		arg1.aClass3_Sub2_66 = arg0;
		arg1.aClass3_Sub2_67 = arg0.aClass3_Sub2_67;
		arg1.aClass3_Sub2_66.aClass3_Sub2_67 = arg1;
		arg1.aClass3_Sub2_67.aClass3_Sub2_66 = arg1;
	}
}
