import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!dm", name = "j", descriptor = "Lclient!na;")
	public static final JagString aClass100_351 = Static28.parse(" ");

	@OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
	public static int anInt1459 = 0;

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "Lclient!na;")
	public static final JagString aClass100_352 = Static28.parse("(U");

	@OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
	public static int anInt1462 = 0;

	@OriginalMember(owner = "client!dm", name = "u", descriptor = "I")
	public static int anInt1464 = 0;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BII[B)Z")
	public static boolean method1201(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(15) boolean local15 = true;
		@Pc(17) int local17 = -1;
		@Pc(22) Buffer local22 = new Buffer(arg2);
		label70: while (true) {
			@Pc(26) int local26 = local22.gVarSmart();
			if (local26 == 0) {
				return local15;
			}
			@Pc(33) int local33 = 0;
			local17 += local26;
			@Pc(39) boolean local39 = false;
			while (true) {
				@Pc(78) int local78;
				@Pc(95) LocType local95;
				do {
					@Pc(72) int local72;
					@Pc(68) int local68;
					do {
						do {
							do {
								do {
									@Pc(45) int local45;
									while (local39) {
										local45 = local22.gSmart1or2();
										if (local45 == 0) {
											continue label70;
										}
										local22.g1();
									}
									local45 = local22.gSmart1or2();
									if (local45 == 0) {
										continue label70;
									}
									local33 += local45 - 1;
									@Pc(58) int local58 = local33 & 0x3F;
									@Pc(64) int local64 = local33 >> 6 & 0x3F;
									local68 = arg1 + local58;
									local72 = arg0 + local64;
									local78 = local22.g1() >> 2;
								} while (local72 <= 0);
							} while (local68 <= 0);
						} while (local72 >= 103);
					} while (local68 >= 103);
					local95 = Static271.method4601(local17);
				} while (local78 == 22 && !Static250.aBoolean283 && local95.anInt4429 == 0 && local95.anInt4435 != 1 && !local95.aBoolean206);
				local39 = true;
				if (!local95.method3426()) {
					local15 = false;
					Static271.anInt5804++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
	public static void method1202() {
		Static57.aClass3_Sub15_Sub1_3.method2233();
		@Pc(13) int local13 = Static57.aClass3_Sub15_Sub1_3.method2238(8);
		@Pc(22) int local22;
		if (Static272.anInt5214 > local13) {
			for (local22 = local13; local22 < Static272.anInt5214; local22++) {
				Static52.anIntArray136[Static240.anInt5335++] = Static33.anIntArray79[local22];
			}
		}
		if (Static272.anInt5214 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static272.anInt5214 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(61) int local61 = Static33.anIntArray79[local22];
			@Pc(65) Npc local65 = Static175.aClass8_Sub4_Sub2Array1[local61];
			@Pc(70) int local70 = Static57.aClass3_Sub15_Sub1_3.method2238(1);
			if (local70 == 0) {
				Static33.anIntArray79[Static272.anInt5214++] = local61;
				local65.anInt3430 = Static83.anInt372;
			} else {
				@Pc(92) int local92 = Static57.aClass3_Sub15_Sub1_3.method2238(2);
				if (local92 == 0) {
					Static33.anIntArray79[Static272.anInt5214++] = local61;
					local65.anInt3430 = Static83.anInt372;
					Static44.anIntArray106[Static116.anInt2951++] = local61;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local92 == 1) {
						Static33.anIntArray79[Static272.anInt5214++] = local61;
						local65.anInt3430 = Static83.anInt372;
						local139 = Static57.aClass3_Sub15_Sub1_3.method2238(3);
						local65.method2684(1, local139);
						local149 = Static57.aClass3_Sub15_Sub1_3.method2238(1);
						if (local149 == 1) {
							Static44.anIntArray106[Static116.anInt2951++] = local61;
						}
					} else if (local92 == 2) {
						Static33.anIntArray79[Static272.anInt5214++] = local61;
						local65.anInt3430 = Static83.anInt372;
						if (Static57.aClass3_Sub15_Sub1_3.method2238(1) == 1) {
							local139 = Static57.aClass3_Sub15_Sub1_3.method2238(3);
							local65.method2684(2, local139);
							local149 = Static57.aClass3_Sub15_Sub1_3.method2238(3);
							local65.method2684(2, local149);
						} else {
							local139 = Static57.aClass3_Sub15_Sub1_3.method2238(3);
							local65.method2684(0, local139);
						}
						local139 = Static57.aClass3_Sub15_Sub1_3.method2238(1);
						if (local139 == 1) {
							Static44.anIntArray106[Static116.anInt2951++] = local61;
						}
					} else if (local92 == 3) {
						Static52.anIntArray136[Static240.anInt5335++] = local61;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IBIII)V")
	public static void method1206(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 0;
		Static131.method2576(Static71.anIntArrayArray10[arg3], arg0 - arg1, arg0 - -arg1, arg2);
		@Pc(32) int local32 = -arg1;
		@Pc(34) int local34 = arg1;
		@Pc(36) int local36 = -1;
		while (local15 < local34) {
			local15++;
			local36 += 2;
			local32 += local36;
			if (local32 >= 0) {
				local34--;
				local32 -= local34 << 1;
				@Pc(65) int[] local65 = Static71.anIntArrayArray10[arg3 + local34];
				@Pc(71) int[] local71 = Static71.anIntArrayArray10[arg3 - local34];
				@Pc(76) int local76 = arg0 + local15;
				@Pc(81) int local81 = arg0 - local15;
				Static131.method2576(local65, local81, local76, arg2);
				Static131.method2576(local71, local81, local76, arg2);
			}
			@Pc(97) int local97 = local34 + arg0;
			@Pc(102) int local102 = arg0 - local34;
			@Pc(109) int[] local109 = Static71.anIntArrayArray10[arg3 + local15];
			@Pc(116) int[] local116 = Static71.anIntArrayArray10[arg3 - local15];
			Static131.method2576(local109, local102, local97, arg2);
			Static131.method2576(local116, local102, local97, arg2);
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!be;III)V")
	public static void method1207(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static231.anInt5204 < 2 && Static260.anInt5014 == 0 && !Static241.aBoolean302) {
			return;
		}
		@Pc(24) JagString local24 = Static13.method471();
		if (arg0 == null) {
			@Pc(40) int local40 = Static280.aClass3_Sub2_Sub9_43.method2859(local24, arg2 + 4, arg1 - -15, Static39.aRandom1, Static60.anInt1895);
			Static133.method4012(arg2 + 4, Static280.aClass3_Sub2_Sub9_43.method2858(local24) + local40, arg1, 15);
			return;
		}
		@Pc(59) Font local59 = arg0.method491(Static159.aClass36Array12);
		if (local59 == null) {
			local59 = Static280.aClass3_Sub2_Sub9_43;
		}
		local59.method2878(local24, arg2, arg1, arg0.anInt445, arg0.anInt459, arg0.anInt474, arg0.anInt513, arg0.anInt460, arg0.anInt478, Static39.aRandom1, Static60.anInt1895, Static50.anIntArray132);
		Static133.method4012(Static50.anIntArray132[0], Static50.anIntArray132[2], Static50.anIntArray132[1], Static50.anIntArray132[3]);
	}

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)V")
	public static void method1208() {
		Static224.aBoolean247 = false;
		Static231.anInt5202 = 0;
		Static266.anInt5336 = -3;
		Static92.anInt2430 = 0;
		Static184.anInt4348 = 1;
		Static276.anInt5816 = 0;
		Static204.anInt4765 = -1;
	}
}
