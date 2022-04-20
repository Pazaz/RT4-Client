import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!rj", name = "R", descriptor = "I")
	public static int anInt4903;

	@OriginalMember(owner = "client!rj", name = "Y", descriptor = "J")
	public static long js5ConnectTime;

	@OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
	public static int anInt4901 = -1;

	@OriginalMember(owner = "client!rj", name = "U", descriptor = "Lclient!ih;")
	public static final LinkedList aClass69_116 = new LinkedList();

	@OriginalMember(owner = "client!rj", name = "Z", descriptor = "[I")
	public static final int[] anIntArray434 = new int[64];

	@OriginalMember(owner = "client!rj", name = "ab", descriptor = "Lclient!na;")
	public static final JagString aClass100_916 = Static28.parse(":clanreq:");

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIILclient!e;I)V")
	public static void method3767(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Player arg2, @OriginalArg(4) int arg3) {
		if (Static173.self == arg2 || Static231.anInt5204 >= 400) {
			return;
		}
		@Pc(158) JagString local158;
		if (arg2.anInt1671 == 0) {
			@Pc(22) boolean local22 = true;
			if (Static173.self.anInt1667 != -1 && arg2.anInt1667 != -1) {
				@Pc(43) int local43 = arg2.anInt1652 < Static173.self.anInt1652 ? Static173.self.anInt1652 : arg2.anInt1652;
				@Pc(58) int local58 = Static173.self.anInt1667 < arg2.anInt1667 ? Static173.self.anInt1667 : arg2.anInt1667;
				@Pc(69) int local69 = local43 * 10 / 100 + local58 + 5;
				@Pc(76) int local76 = Static173.self.anInt1652 - arg2.anInt1652;
				if (local76 < 0) {
					local76 = -local76;
				}
				if (local69 < local76) {
					local22 = false;
				}
			}
			@Pc(95) JagString local95 = Static266.game == 1 ? LocalizedText.RATING : LocalizedText.LEVEL;
			if (arg2.anInt1652 < arg2.anInt1656) {
				local158 = Static34.method882(new JagString[] { arg2.method1264(), local22 ? Static123.method2420(arg2.anInt1652, Static173.self.anInt1652) : Static204.aClass100_896, Static123.aClass100_593, local95, Static123.method2423(arg2.anInt1652), Static78.aClass100_465, Static123.method2423(arg2.anInt1656 - arg2.anInt1652), Static72.aClass100_448 });
			} else {
				local158 = Static34.method882(new JagString[] { arg2.method1264(), local22 ? Static123.method2420(arg2.anInt1652, Static173.self.anInt1652) : Static204.aClass100_896, Static123.aClass100_593, local95, Static123.method2423(arg2.anInt1652), Static72.aClass100_448 });
			}
		} else {
			local158 = Static34.method882(new JagString[] { arg2.method1264(), Static123.aClass100_593, LocalizedText.SKILL, Static123.method2423(arg2.anInt1671), Static72.aClass100_448 });
		}
		@Pc(275) int local275;
		if (Static260.anInt5014 == 1) {
			Static98.method1966(Static169.anInt4075, (long) arg0, Static34.method882(new JagString[] { Static34.aClass100_203, Static105.aClass100_561, local158 }), arg3, (short) 1, LocalizedText.USE, arg1);
		} else if (!Static241.aBoolean302) {
			for (local275 = 7; local275 >= 0; local275--) {
				if (Static160.aClass100Array121[local275] != null) {
					@Pc(291) short local291 = 0;
					if (Static266.game == 0 && Static160.aClass100Array121[local275].method3111(LocalizedText.ATTACK)) {
						if (arg2.anInt1652 > Static173.self.anInt1652) {
							local291 = 2000;
						}
						if (Static173.self.anInt1650 != 0 && arg2.anInt1650 != 0) {
							if (Static173.self.anInt1650 == arg2.anInt1650) {
								local291 = 2000;
							} else {
								local291 = 0;
							}
						}
					} else if (Static1.aBooleanArray1[local275]) {
						local291 = 2000;
					}
					@Pc(353) short local353 = Static5.aShortArray2[local275];
					@Pc(358) short local358 = (short) (local353 + local291);
					Static98.method1966(Static191.anIntArray388[local275], (long) arg0, Static34.method882(new JagString[] { Static204.aClass100_896, local158 }), arg3, local358, Static160.aClass100Array121[local275], arg1);
				}
			}
		} else if ((Static274.anInt4999 & 0x8) != 0) {
			Static98.method1966(Static246.anInt5393, (long) arg0, Static34.method882(new JagString[] { Static78.aClass100_466, Static105.aClass100_561, local158 }), arg3, (short) 15, Static102.aClass100_545, arg1);
		}
		for (local275 = 0; local275 < Static231.anInt5204; local275++) {
			if (Static39.aShortArray6[local275] == 60) {
				Static233.aClass100Array160[local275] = Static34.method882(new JagString[] { Static204.aClass100_896, local158 });
				break;
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "(B)V")
	public static void method3768() {
		Static276.method4612();
		Static54.method1308();
		Static233.method3999();
		Static90.method1854();
		Static204.method3673();
		Static176.method3302();
		Static10.method350();
		Static247.method4249();
		Static53.method1295();
		Static249.method4266();
		Static124.method2433();
		Static202.method3653();
		Static78.method1695();
		Static10.method351();
		Static230.method3947();
		Static147.method2764();
		if (Static81.modeWhat != 0) {
			for (@Pc(54) int local54 = 0; local54 < Static51.aByteArrayArray8.length; local54++) {
				Static51.aByteArrayArray8[local54] = null;
			}
			Static105.anInt2863 = 0;
		}
		Static181.method3347();
		Static90.method1857();
		Static139.aClass99_22.method3104();
		if (!GlRenderer.enabled) {
			((Js5GlTextureProvider) Rasteriser.anInterface1_2).method3247();
		}
		Static105.aClass54_9.method1815();
		Static213.aClass153_88.method4499();
		Static249.aClass153_100.method4499();
		Static41.aClass153_25.method4499();
		Static248.aClass153_75.method4499();
		Static26.aClass153_16.method4499();
		Static130.aClass153_47.method4499();
		Static267.aClass153_109.method4499();
		Static209.aClass153_86.method4499();
		Static184.aClass153_78.method4499();
		Static214.aClass153_106.method4499();
		Static16.aClass153_9.method4499();
		Static73.aClass99_10.method3104();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "([Lclient!mj;I[BIIIIZIIB)V")
	public static void method3771(@OriginalArg(0) CollisionMap[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = -1;
		@Pc(12) Buffer local12 = new Buffer(arg2);
		while (true) {
			@Pc(20) int local20 = local12.gVarSmart();
			if (local20 == 0) {
				return;
			}
			local7 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local12.gSmart1or2();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(50) int local50 = local31 & 0x3F;
				@Pc(56) int local56 = local31 >> 6 & 0x3F;
				@Pc(60) int local60 = local31 >> 12;
				@Pc(64) int local64 = local12.g1();
				@Pc(68) int local68 = local64 >> 2;
				@Pc(72) int local72 = local64 & 0x3;
				if (arg3 == local60 && local56 >= arg8 && local56 < arg8 + 8 && arg9 <= local50 && arg9 + 8 > local50) {
					@Pc(103) LocType local103 = Static271.method4601(local7);
					@Pc(120) int local120 = Static52.method1286(local50 & 0x7, arg4, local72, local103.anInt4403, local103.anInt4397, local56 & 0x7) + arg5;
					@Pc(137) int local137 = Static241.method4541(local103.anInt4397, arg4, local103.anInt4403, local56 & 0x7, local72, local50 & 0x7) + arg6;
					if (local120 > 0 && local137 > 0 && local120 < 103 && local137 < 103) {
						@Pc(154) CollisionMap local154 = null;
						if (!arg7) {
							@Pc(159) int local159 = arg1;
							if ((Static12.aByteArrayArrayArray2[1][local120][local137] & 0x2) == 2) {
								local159 = arg1 - 1;
							}
							if (local159 >= 0) {
								local154 = arg0[local159];
							}
						}
						Static185.method3397(arg1, !arg7, arg1, arg7, local154, local7, local68, local120, local137, local72 + arg4 & 0x3);
					}
				}
			}
		}
	}
}
