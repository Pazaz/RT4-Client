package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!dm", name = "j", descriptor = "Lclient!na;")
	public static final JagString aClass100_351 = JagString.parse(" ");

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "Lclient!na;")
	public static final JagString PERCENT_SIGN = JagString.parse("(U");

	@OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
	public static int opcode4 = 0;

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
					local95 = LocTypeList.get(local17);
				} while (local78 == 22 && !Preferences.showGroundDecorations && local95.anInt4429 == 0 && local95.anInt4435 != 1 && !local95.aBoolean206);
				local39 = true;
				if (!local95.isReady()) {
					local15 = false;
					Static271.anInt5804++;
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
			@Pc(40) int local40 = Fonts.b12Full.method2859(local24, arg2 + 4, arg1 - -15, client.aRandom1, Static60.gregorianDateSeed);
			Static133.method4012(arg2 + 4, Fonts.b12Full.getStringWidth(local24) + local40, arg1, 15);
			return;
		}
		@Pc(59) Font local59 = arg0.method491(Sprites.nameIcons);
		if (local59 == null) {
			local59 = Fonts.b12Full;
		}
		local59.method2878(local24, arg2, arg1, arg0.anInt445, arg0.anInt459, arg0.color, arg0.anInt513, arg0.anInt460, arg0.anInt478, client.aRandom1, Static60.gregorianDateSeed, Static50.anIntArray132);
		Static133.method4012(Static50.anIntArray132[0], Static50.anIntArray132[2], Static50.anIntArray132[1], Static50.anIntArray132[3]);
	}

}
