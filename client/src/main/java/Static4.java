import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
	public static int anInt30 = 0;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "Lclient!ih;")
	public static final Class69 aClass69_2 = new Class69();

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "S")
	public static short aShort1 = 32767;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "Lclient!ck;")
	public static final Class20 aClass20_1 = new Class20();

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "Lclient!na;")
	public static final Class100 aClass100_7 = Static28.method790("overlay");

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
	public static int anInt36 = 0;

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
	public static int anInt37 = 0;

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Lclient!be;")
	public static Class13 aClass13_1 = null;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)I")
	public static int method22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static12.aByteArrayArrayArray2[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static12.aByteArrayArrayArray2[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([J[Ljava/lang/Object;I)V")
	public static void method23(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Static228.method3909(arg0.length - 1, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)V")
	public static void method24(@OriginalArg(1) int arg0) {
		@Pc(16) Class3_Sub2_Sub8 local16 = Static238.method4143(1, arg0);
		local16.method1007();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!na;I)I")
	public static int method25(@OriginalArg(0) Class100 arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < Static9.anInt178; local20++) {
			if (arg0.method3111(Static122.aClass100Array92[local20])) {
				return local20;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)Z")
	public static boolean method26() throws IOException {
		if (Static124.aClass95_2 == null) {
			return false;
		}
		@Pc(14) int local14 = Static124.aClass95_2.method2831();
		if (local14 == 0) {
			return false;
		}
		if (Static164.anInt3985 == -1) {
			local14--;
			Static124.aClass95_2.method2827(0, 1, Static57.aClass3_Sub15_Sub1_3.aByteArray40);
			Static57.aClass3_Sub15_Sub1_3.anInt2792 = 0;
			Static164.anInt3985 = Static57.aClass3_Sub15_Sub1_3.method2243();
			Static223.anInt5028 = Static234.anIntArray456[Static164.anInt3985];
		}
		if (Static223.anInt5028 == -1) {
			if (local14 <= 0) {
				return false;
			}
			Static124.aClass95_2.method2827(0, 1, Static57.aClass3_Sub15_Sub1_3.aByteArray40);
			local14--;
			Static223.anInt5028 = Static57.aClass3_Sub15_Sub1_3.aByteArray40[0] & 0xFF;
		}
		if (Static223.anInt5028 == -2) {
			if (local14 <= 1) {
				return false;
			}
			local14 -= 2;
			Static124.aClass95_2.method2827(0, 2, Static57.aClass3_Sub15_Sub1_3.aByteArray40);
			Static57.aClass3_Sub15_Sub1_3.anInt2792 = 0;
			Static223.anInt5028 = Static57.aClass3_Sub15_Sub1_3.method2163();
		}
		if (Static223.anInt5028 > local14) {
			return false;
		}
		Static57.aClass3_Sub15_Sub1_3.anInt2792 = 0;
		Static124.aClass95_2.method2827(0, Static223.anInt5028, Static57.aClass3_Sub15_Sub1_3.aByteArray40);
		Static49.anInt1462 = Static5.anInt45;
		Static5.anInt45 = Static230.anInt5152;
		Static230.anInt5152 = Static164.anInt3985;
		Static201.anInt1862 = 0;
		@Pc(133) int local133;
		if (Static164.anInt3985 == 60) {
			local133 = Static57.aClass3_Sub15_Sub1_3.method2184();
			@Pc(137) byte local137 = Static57.aClass3_Sub15_Sub1_3.method2189();
			Static170.method2575(local137, local133);
			Static164.anInt3985 = -1;
			return true;
		}
		@Pc(171) int local171;
		@Pc(156) Class100 local156;
		if (Static164.anInt3985 == 115) {
			local133 = Static57.aClass3_Sub15_Sub1_3.method2163();
			local156 = Static57.aClass3_Sub15_Sub1_3.method2202();
			@Pc(163) Object[] local163 = new Object[local156.method3120() + 1];
			for (local171 = local156.method3120() - 1; local171 >= 0; local171--) {
				if (local156.method3149(local171) == 115) {
					local163[local171 + 1] = Static57.aClass3_Sub15_Sub1_3.method2202();
				} else {
					local163[local171 + 1] = Integer.valueOf(Static57.aClass3_Sub15_Sub1_3.method2174());
				}
			}
			local163[0] = Integer.valueOf(Static57.aClass3_Sub15_Sub1_3.method2174());
			if (Static248.method3288(local133)) {
				@Pc(226) Class3_Sub19 local226 = new Class3_Sub19();
				local226.anObjectArray31 = local163;
				Static82.method1767(local226);
			}
			Static164.anInt3985 = -1;
			return true;
		}
		@Pc(275) long local275;
		@Pc(262) boolean local262;
		@Pc(277) int local277;
		@Pc(506) Class100 local506;
		if (Static164.anInt3985 == 70) {
			@Pc(245) Class100 local245 = Static57.aClass3_Sub15_Sub1_3.method2202();
			if (local245.method3130(Static196.aClass100_863)) {
				local156 = local245.method3137(local245.method3131(Static264.aClass100_875), 0);
				local275 = local156.method3158();
				local262 = false;
				for (local277 = 0; local277 < Static35.anInt1093; local277++) {
					if (Static190.aLongArray6[local277] == local275) {
						local262 = true;
						break;
					}
				}
				if (!local262 && Static11.anInt384 == 0) {
					Static103.method2231(local156, 4, Static51.aClass100_367);
				}
			} else if (local245.method3130(Static61.aClass100_423)) {
				local156 = local245.method3137(local245.method3131(Static264.aClass100_875), 0);
				local275 = local156.method3158();
				local262 = false;
				for (local277 = 0; local277 < Static35.anInt1093; local277++) {
					if (Static190.aLongArray6[local277] == local275) {
						local262 = true;
						break;
					}
				}
				if (!local262 && Static11.anInt384 == 0) {
					local506 = local245.method3137(local245.method3120() - 9, local245.method3131(Static264.aClass100_875) + 1);
					Static103.method2231(local156, 8, local506);
				}
			} else if (local245.method3130(Static191.aClass100_845)) {
				local262 = false;
				local156 = local245.method3137(local245.method3131(Static264.aClass100_875), 0);
				local275 = local156.method3158();
				for (local277 = 0; local277 < Static35.anInt1093; local277++) {
					if (local275 == Static190.aLongArray6[local277]) {
						local262 = true;
						break;
					}
				}
				if (!local262 && Static11.anInt384 == 0) {
					Static103.method2231(local156, 10, Static186.aClass100_827);
				}
			} else if (local245.method3130(Static141.aClass100_664)) {
				local156 = local245.method3137(local245.method3131(Static141.aClass100_664), 0);
				Static103.method2231(Static186.aClass100_827, 11, local156);
			} else if (local245.method3130(Static138.aClass100_654)) {
				local156 = local245.method3137(local245.method3131(Static138.aClass100_654), 0);
				if (Static11.anInt384 == 0) {
					Static103.method2231(Static186.aClass100_827, 12, local156);
				}
			} else if (local245.method3130(Static244.aClass100_1014)) {
				local156 = local245.method3137(local245.method3131(Static244.aClass100_1014), 0);
				if (Static11.anInt384 == 0) {
					Static103.method2231(Static186.aClass100_827, 13, local156);
				}
			} else if (local245.method3130(Static56.aClass100_379)) {
				local262 = false;
				local156 = local245.method3137(local245.method3131(Static264.aClass100_875), 0);
				local275 = local156.method3158();
				for (local277 = 0; local277 < Static35.anInt1093; local277++) {
					if (local275 == Static190.aLongArray6[local277]) {
						local262 = true;
						break;
					}
				}
				if (!local262 && Static11.anInt384 == 0) {
					Static103.method2231(local156, 14, Static186.aClass100_827);
				}
			} else if (local245.method3130(Static112.aClass100_574)) {
				local156 = local245.method3137(local245.method3131(Static264.aClass100_875), 0);
				local262 = false;
				local275 = local156.method3158();
				for (local277 = 0; local277 < Static35.anInt1093; local277++) {
					if (Static190.aLongArray6[local277] == local275) {
						local262 = true;
						break;
					}
				}
				if (!local262 && Static11.anInt384 == 0) {
					Static103.method2231(local156, 15, Static186.aClass100_827);
				}
			} else if (local245.method3130(Static217.aClass100_916)) {
				local156 = local245.method3137(local245.method3131(Static264.aClass100_875), 0);
				local275 = local156.method3158();
				local262 = false;
				for (local277 = 0; local277 < Static35.anInt1093; local277++) {
					if (local275 == Static190.aLongArray6[local277]) {
						local262 = true;
						break;
					}
				}
				if (!local262 && Static11.anInt384 == 0) {
					Static103.method2231(local156, 16, Static186.aClass100_827);
				}
			} else if (local245.method3130(Static164.aClass100_770)) {
				local156 = local245.method3137(local245.method3131(Static264.aClass100_875), 0);
				local262 = false;
				local275 = local156.method3158();
				for (local277 = 0; local277 < Static35.anInt1093; local277++) {
					if (Static190.aLongArray6[local277] == local275) {
						local262 = true;
						break;
					}
				}
				if (!local262 && Static11.anInt384 == 0) {
					local506 = local245.method3137(local245.method3120() - 9, local245.method3131(Static264.aClass100_875) + 1);
					Static103.method2231(local156, 21, local506);
				}
			} else {
				Static103.method2231(Static186.aClass100_827, 0, local245);
			}
			Static164.anInt3985 = -1;
			return true;
		}
		@Pc(786) int local786;
		@Pc(790) Class100 local790;
		if (Static164.anInt3985 == 123) {
			local133 = Static57.aClass3_Sub15_Sub1_3.method2192();
			local786 = Static57.aClass3_Sub15_Sub1_3.method2184();
			local790 = Static57.aClass3_Sub15_Sub1_3.method2202();
			if (Static248.method3288(local786)) {
				Static193.method3498(local790, local133);
			}
			Static164.anInt3985 = -1;
			return true;
		} else if (Static164.anInt3985 == 230) {
			Static180.anInt4264 = Static57.aClass3_Sub15_Sub1_3.method2177();
			Static115.anInt2940 = Static57.aClass3_Sub15_Sub1_3.method2180();
			while (Static223.anInt5028 > Static57.aClass3_Sub15_Sub1_3.anInt2792) {
				Static164.anInt3985 = Static57.aClass3_Sub15_Sub1_3.method2229();
				Static75.method1634();
			}
			Static164.anInt3985 = -1;
			return true;
		} else if (Static164.anInt3985 == 153) {
			Static164.anInt3985 = -1;
			Static115.anInt2939 = 0;
			return true;
		} else {
			@Pc(864) int local864;
			if (Static164.anInt3985 == 220) {
				local133 = Static57.aClass3_Sub15_Sub1_3.method2224();
				local786 = Static57.aClass3_Sub15_Sub1_3.method2192();
				local864 = Static57.aClass3_Sub15_Sub1_3.method2163();
				if (Static248.method3288(local864)) {
					Static229.method3938(local786, local133);
				}
				Static164.anInt3985 = -1;
				return true;
			}
			@Pc(884) long local884;
			@Pc(908) int local908;
			@Pc(916) int local916;
			@Pc(899) long local899;
			@Pc(904) long local904;
			if (Static164.anInt3985 == 81) {
				local884 = Static57.aClass3_Sub15_Sub1_3.method2182();
				Static57.aClass3_Sub15_Sub1_3.method2186();
				local275 = Static57.aClass3_Sub15_Sub1_3.method2182();
				local899 = Static57.aClass3_Sub15_Sub1_3.method2163();
				local904 = Static57.aClass3_Sub15_Sub1_3.method2220();
				local908 = Static57.aClass3_Sub15_Sub1_3.method2229();
				@Pc(910) boolean local910 = false;
				local916 = Static57.aClass3_Sub15_Sub1_3.method2163();
				@Pc(922) long local922 = (local899 << 32) + local904;
				@Pc(924) int local924 = 0;
				label1320: while (true) {
					if (local924 < 100) {
						if (local922 != Static233.aLongArray9[local924]) {
							local924++;
							continue;
						}
						local910 = true;
						break;
					}
					if (local908 <= 1) {
						for (local924 = 0; local924 < Static35.anInt1093; local924++) {
							if (Static190.aLongArray6[local924] == local884) {
								local910 = true;
								break label1320;
							}
						}
					}
					break;
				}
				if (!local910 && Static11.anInt384 == 0) {
					Static233.aLongArray9[Static251.anInt5447] = local922;
					Static251.anInt5447 = (Static251.anInt5447 + 1) % 100;
					@Pc(999) Class100 local999 = Static230.method3953(local916).method770(Static57.aClass3_Sub15_Sub1_3);
					if (local908 == 2 || local908 == 3) {
						Static154.method2928(local916, 20, local999, Static79.method1702(local275).method3125(), Static34.method882(new Class100[] { Static44.aClass100_336, Static79.method1702(local884).method3125() }));
					} else if (local908 == 1) {
						Static154.method2928(local916, 20, local999, Static79.method1702(local275).method3125(), Static34.method882(new Class100[] { Static65.aClass100_435, Static79.method1702(local884).method3125() }));
					} else {
						Static154.method2928(local916, 20, local999, Static79.method1702(local275).method3125(), Static79.method1702(local884).method3125());
					}
				}
				Static164.anInt3985 = -1;
				return true;
			}
			@Pc(1146) int local1146;
			@Pc(1160) int local1160;
			@Pc(1245) boolean local1245;
			if (Static164.anInt3985 == 55) {
				Static278.anInt5867 = Static119.anInt3028;
				local884 = Static57.aClass3_Sub15_Sub1_3.method2182();
				if (local884 == 0L) {
					Static270.aClass100_1094 = null;
					Static164.anInt3985 = -1;
					Static15.aClass100_87 = null;
					Static199.aClass3_Sub22Array1 = null;
					Static214.anInt5577 = 0;
					return true;
				}
				local275 = Static57.aClass3_Sub15_Sub1_3.method2182();
				Static15.aClass100_87 = Static79.method1702(local275);
				Static270.aClass100_1094 = Static79.method1702(local884);
				Static50.aByte6 = Static57.aClass3_Sub15_Sub1_3.method2186();
				local1146 = Static57.aClass3_Sub15_Sub1_3.method2229();
				if (local1146 == 255) {
					Static164.anInt3985 = -1;
					return true;
				}
				Static214.anInt5577 = local1146;
				@Pc(1158) Class3_Sub22[] local1158 = new Class3_Sub22[100];
				for (local1160 = 0; local1160 < Static214.anInt5577; local1160++) {
					local1158[local1160] = new Class3_Sub22();
					local1158[local1160].aLong192 = Static57.aClass3_Sub15_Sub1_3.method2182();
					local1158[local1160].aClass100_636 = Static79.method1702(local1158[local1160].aLong192);
					local1158[local1160].anInt3340 = Static57.aClass3_Sub15_Sub1_3.method2163();
					local1158[local1160].aByte9 = Static57.aClass3_Sub15_Sub1_3.method2186();
					local1158[local1160].aClass100_635 = Static57.aClass3_Sub15_Sub1_3.method2202();
					if (Static101.aLong98 == local1158[local1160].aLong192) {
						Static160.aByte14 = local1158[local1160].aByte9;
					}
				}
				local908 = Static214.anInt5577;
				while (local908 > 0) {
					local1245 = true;
					local908--;
					for (local916 = 0; local916 < local908; local916++) {
						if (local1158[local916].aClass100_636.method3139(local1158[local916 + 1].aClass100_636) > 0) {
							local1245 = false;
							@Pc(1279) Class3_Sub22 local1279 = local1158[local916];
							local1158[local916] = local1158[local916 + 1];
							local1158[local916 + 1] = local1279;
						}
					}
					if (local1245) {
						break;
					}
				}
				Static199.aClass3_Sub22Array1 = local1158;
				Static164.anInt3985 = -1;
				return true;
			} else if (Static164.anInt3985 == 164) {
				local133 = Static57.aClass3_Sub15_Sub1_3.method2206();
				Static232.aClass212_5 = Static71.aClass213_3.method5128(local133);
				Static164.anInt3985 = -1;
				return true;
			} else if (Static164.anInt3985 == 225) {
				Static64.method1495();
				Static164.anInt3985 = -1;
				return true;
			} else if (Static164.anInt3985 == 48) {
				local133 = Static57.aClass3_Sub15_Sub1_3.method2163();
				local156 = Static57.aClass3_Sub15_Sub1_3.method2202();
				local864 = Static57.aClass3_Sub15_Sub1_3.method2207();
				if (Static248.method3288(local133)) {
					Static193.method3498(local156, local864);
				}
				Static164.anInt3985 = -1;
				return true;
			} else if (Static164.anInt3985 == 232) {
				Static59.anInt1812 = Static57.aClass3_Sub15_Sub1_3.method2229();
				Static49.anInt1459 = Static57.aClass3_Sub15_Sub1_3.method2229();
				Static84.anInt2256 = Static57.aClass3_Sub15_Sub1_3.method2229();
				Static164.anInt3985 = -1;
				return true;
			} else {
				@Pc(1409) Class100 local1409;
				if (Static164.anInt3985 == 44) {
					local133 = Static57.aClass3_Sub15_Sub1_3.method2207();
					if (local133 == 65535) {
						local133 = -1;
					}
					local786 = Static57.aClass3_Sub15_Sub1_3.method2229();
					local864 = Static57.aClass3_Sub15_Sub1_3.method2229();
					local1409 = Static57.aClass3_Sub15_Sub1_3.method2202();
					if (local864 >= 1 && local864 <= 8) {
						if (local1409.method3111(Static92.aClass100_510)) {
							local1409 = null;
						}
						Static160.aClass100Array121[local864 - 1] = local1409;
						Static191.anIntArray388[local864 - 1] = local133;
						Static1.aBooleanArray1[local864 - 1] = local786 == 0;
					}
					Static164.anInt3985 = -1;
					return true;
				} else if (Static164.anInt3985 == 226) {
					local133 = Static57.aClass3_Sub15_Sub1_3.method2174();
					local786 = Static57.aClass3_Sub15_Sub1_3.method2184();
					Static170.method2575(local133, local786);
					Static164.anInt3985 = -1;
					return true;
				} else if (Static164.anInt3985 == 21) {
					local133 = Static57.aClass3_Sub15_Sub1_3.method2212();
					local786 = Static57.aClass3_Sub15_Sub1_3.method2163();
					local864 = Static57.aClass3_Sub15_Sub1_3.method2208();
					if (Static248.method3288(local786)) {
						Static153.method2905(local864, local133);
					}
					Static164.anInt3985 = -1;
					return true;
				} else if (Static164.anInt3985 == 145) {
					local133 = Static57.aClass3_Sub15_Sub1_3.method2207();
					local786 = Static57.aClass3_Sub15_Sub1_3.method2177();
					local864 = Static57.aClass3_Sub15_Sub1_3.method2207();
					if (Static248.method3288(local864)) {
						if (local786 == 2) {
							Static5.method34();
						}
						Static154.anInt3711 = local133;
						Static81.method1753(local133);
						Static210.method3712(false);
						Static74.method1626(Static154.anInt3711);
						for (local171 = 0; local171 < 100; local171++) {
							Static186.aBooleanArray100[local171] = true;
						}
					}
					Static164.anInt3985 = -1;
					return true;
				} else if (Static164.anInt3985 == 69) {
					local133 = Static57.aClass3_Sub15_Sub1_3.method2207();
					local786 = Static57.aClass3_Sub15_Sub1_3.method2174();
					local864 = Static57.aClass3_Sub15_Sub1_3.method2184();
					if (Static248.method3288(local133)) {
						Static132.method2606(local864, local786);
					}
					Static164.anInt3985 = -1;
					return true;
				} else if (Static164.anInt3985 == 141) {
					local884 = Static57.aClass3_Sub15_Sub1_3.method2182();
					local864 = Static57.aClass3_Sub15_Sub1_3.method2163();
					local1409 = Static230.method3953(local864).method770(Static57.aClass3_Sub15_Sub1_3);
					Static154.method2928(local864, 19, local1409, null, Static79.method1702(local884).method3125());
					Static164.anInt3985 = -1;
					return true;
				} else if (Static164.anInt3985 == 169) {
					Static271.method4598(Static57.aClass3_Sub15_Sub1_3);
					Static164.anInt3985 = -1;
					return true;
				} else if (Static164.anInt3985 == 89) {
					Static8.method121();
					Static103.method2245();
					Static70.anInt2015 += 32;
					Static164.anInt3985 = -1;
					return true;
				} else if (Static164.anInt3985 == 125) {
					local133 = Static57.aClass3_Sub15_Sub1_3.method2163();
					local786 = Static57.aClass3_Sub15_Sub1_3.method2229();
					local864 = Static57.aClass3_Sub15_Sub1_3.method2229();
					local171 = Static57.aClass3_Sub15_Sub1_3.method2163();
					local1146 = Static57.aClass3_Sub15_Sub1_3.method2229();
					local277 = Static57.aClass3_Sub15_Sub1_3.method2229();
					if (Static248.method3288(local133)) {
						Static260.method3849(local171, local864, local1146, local786, local277);
					}
					Static164.anInt3985 = -1;
					return true;
				} else if (Static164.anInt3985 == 36) {
					local133 = Static57.aClass3_Sub15_Sub1_3.method2224();
					local786 = Static57.aClass3_Sub15_Sub1_3.method2217();
					local864 = Static57.aClass3_Sub15_Sub1_3.method2184();
					if (Static248.method3288(local864)) {
						Static225.method3893(local133, local786);
					}
					Static164.anInt3985 = -1;
					return true;
				} else {
					@Pc(1814) Class3_Sub4 local1814;
					@Pc(1804) Class3_Sub4 local1804;
					if (Static164.anInt3985 == 9) {
						local133 = Static57.aClass3_Sub15_Sub1_3.method2207();
						local786 = Static57.aClass3_Sub15_Sub1_3.method2208();
						local864 = Static57.aClass3_Sub15_Sub1_3.method2184();
						local171 = Static57.aClass3_Sub15_Sub1_3.method2192();
						if (local171 == 65535) {
							local171 = -1;
						}
						local1146 = Static57.aClass3_Sub15_Sub1_3.method2184();
						if (local1146 == 65535) {
							local1146 = -1;
						}
						if (Static248.method3288(local864)) {
							for (local277 = local1146; local277 <= local171; local277++) {
								local904 = (long) local277 + ((long) local786 << 32);
								local1804 = (Class3_Sub4) Static210.aClass133_21.method3863(local904);
								if (local1804 != null) {
									local1814 = new Class3_Sub4(local1804.anInt546, local133);
									local1804.method4658();
								} else if (local277 == -1) {
									local1814 = new Class3_Sub4(Static5.method32(local786).aClass3_Sub4_1.anInt546, local133);
								} else {
									local1814 = new Class3_Sub4(0, local133);
								}
								Static210.aClass133_21.method3862(local1814, local904);
							}
						}
						Static164.anInt3985 = -1;
						return true;
					}
					@Pc(1986) int local1986;
					if (Static164.anInt3985 == 56) {
						local133 = Static57.aClass3_Sub15_Sub1_3.method2163();
						local786 = Static57.aClass3_Sub15_Sub1_3.method2192();
						local864 = Static57.aClass3_Sub15_Sub1_3.method2206();
						local171 = Static57.aClass3_Sub15_Sub1_3.method2207();
						if (local864 >> 30 == 0) {
							@Pc(1994) Class144 local1994;
							if (local864 >> 29 != 0) {
								local1146 = local864 & 0xFFFF;
								@Pc(1894) Class8_Sub4_Sub2 local1894 = Static175.aClass8_Sub4_Sub2Array1[local1146];
								if (local1894 != null) {
									if (local171 == 65535) {
										local171 = -1;
									}
									local1245 = true;
									if (local171 != -1 && local1894.anInt3432 != -1 && Static36.method941(Static34.method877(local171).anInt1754).anInt5355 < Static36.method941(Static34.method877(local1894.anInt3432).anInt1754).anInt5355) {
										local1245 = false;
									}
									if (local1245) {
										local1894.anInt3361 = 0;
										local1894.anInt3432 = local171;
										local1894.anInt3359 = Static83.anInt372 + local133;
										local1894.anInt3399 = 0;
										if (local1894.anInt3359 > Static83.anInt372) {
											local1894.anInt3399 = -1;
										}
										local1894.anInt3394 = local786;
										local1894.anInt3418 = 1;
										if (local1894.anInt3432 != -1 && Static83.anInt372 == local1894.anInt3359) {
											local1986 = Static34.method877(local1894.anInt3432).anInt1754;
											if (local1986 != -1) {
												local1994 = Static36.method941(local1986);
												if (local1994 != null && local1994.anIntArray473 != null) {
													Static152.method2836(local1894.anInt3421, local1994, local1894.anInt3412, false, 0);
												}
											}
										}
									}
								}
							} else if (local864 >> 28 != 0) {
								local1146 = local864 & 0xFFFF;
								@Pc(2033) Class8_Sub4_Sub1 local2033;
								if (Static16.anInt549 == local1146) {
									local2033 = Static173.aClass8_Sub4_Sub1_2;
								} else {
									local2033 = Static159.aClass8_Sub4_Sub1Array1[local1146];
								}
								if (local2033 != null) {
									if (local171 == 65535) {
										local171 = -1;
									}
									local1245 = true;
									if (local171 != -1 && local2033.anInt3432 != -1 && Static36.method941(Static34.method877(local171).anInt1754).anInt5355 < Static36.method941(Static34.method877(local2033.anInt3432).anInt1754).anInt5355) {
										local1245 = false;
									}
									if (local1245) {
										local2033.anInt3359 = local133 + Static83.anInt372;
										local2033.anInt3394 = local786;
										local2033.anInt3432 = local171;
										if (local2033.anInt3432 == 65535) {
											local2033.anInt3432 = -1;
										}
										local2033.anInt3418 = 1;
										local2033.anInt3361 = 0;
										local2033.anInt3399 = 0;
										if (local2033.anInt3359 > Static83.anInt372) {
											local2033.anInt3399 = -1;
										}
										if (local2033.anInt3432 != -1 && local2033.anInt3359 == Static83.anInt372) {
											local1986 = Static34.method877(local2033.anInt3432).anInt1754;
											if (local1986 != -1) {
												local1994 = Static36.method941(local1986);
												if (local1994 != null && local1994.anIntArray473 != null) {
													Static152.method2836(local2033.anInt3421, local1994, local2033.anInt3412, local2033 == Static173.aClass8_Sub4_Sub1_2, 0);
												}
											}
										}
									}
								}
							}
						} else {
							local1146 = local864 >> 28 & 0x3;
							local277 = (local864 >> 14 & 0x3FFF) - Static225.anInt5068;
							local1160 = (local864 & 0x3FFF) - Static142.anInt3483;
							if (local277 >= 0 && local1160 >= 0 && local277 < 104 && local1160 < 104) {
								local1160 = local1160 * 128 + 64;
								local277 = local277 * 128 + 64;
								@Pc(2241) Class8_Sub2 local2241 = new Class8_Sub2(local171, local1146, local277, local1160, Static207.method3685(local1146, local277, local1160) - local786, local133, Static83.anInt372);
								Static99.aClass69_64.method2282(new Class3_Sub2_Sub3(local2241));
							}
						}
						Static164.anInt3985 = -1;
						return true;
					} else if (Static164.anInt3985 == 207) {
						local133 = Static57.aClass3_Sub15_Sub1_3.method2224();
						local786 = Static57.aClass3_Sub15_Sub1_3.method2184();
						local864 = Static57.aClass3_Sub15_Sub1_3.method2163();
						local171 = Static57.aClass3_Sub15_Sub1_3.method2184();
						if (Static248.method3288(local786)) {
							Static190.method3444(local171 + (local864 << 16), local133);
						}
						Static164.anInt3985 = -1;
						return true;
					} else if (Static164.anInt3985 == 38) {
						Static103.method2245();
						local133 = Static57.aClass3_Sub15_Sub1_3.method2177();
						local786 = Static57.aClass3_Sub15_Sub1_3.method2206();
						local864 = Static57.aClass3_Sub15_Sub1_3.method2229();
						Static227.anIntArray446[local864] = local786;
						Static99.anIntArray240[local864] = local133;
						Static141.anIntArray326[local864] = 1;
						for (local171 = 0; local171 < 98; local171++) {
							if (Class55.anIntArray213[local171] <= local786) {
								Static141.anIntArray326[local864] = local171 + 2;
							}
						}
						Static249.anIntArray478[Static89.anInt2385++ & 0x1F] = local864;
						Static164.anInt3985 = -1;
						return true;
					} else if (Static164.anInt3985 == 104 || Static164.anInt3985 == 121 || Static164.anInt3985 == 97 || Static164.anInt3985 == 14 || Static164.anInt3985 == 202 || Static164.anInt3985 == 135 || Static164.anInt3985 == 17 || Static164.anInt3985 == 16 || Static164.anInt3985 == 240 || Static164.anInt3985 == 33 || Static164.anInt3985 == 20 || Static164.anInt3985 == 195 || Static164.anInt3985 == 179) {
						Static75.method1634();
						Static164.anInt3985 = -1;
						return true;
					} else if (Static164.anInt3985 == 149) {
						local133 = Static57.aClass3_Sub15_Sub1_3.method2163();
						local786 = Static57.aClass3_Sub15_Sub1_3.method2174();
						if (Static248.method3288(local133)) {
							@Pc(2441) Class3_Sub31 local2441 = (Class3_Sub31) Static119.aClass133_9.method3863((long) local786);
							if (local2441 != null) {
								Static132.method2605(true, local2441);
							}
							if (Static39.aClass13_10 != null) {
								Static43.method1143(Static39.aClass13_10);
								Static39.aClass13_10 = null;
							}
						}
						Static164.anInt3985 = -1;
						return true;
					} else if (Static164.anInt3985 == 187) {
						local133 = Static57.aClass3_Sub15_Sub1_3.method2192();
						local786 = Static57.aClass3_Sub15_Sub1_3.method2163();
						local864 = Static57.aClass3_Sub15_Sub1_3.method2163();
						if (Static248.method3288(local786)) {
							Static57.anInt1747 = local133;
							Static72.anInt2031 = local864;
							if (Static227.anInt5096 == 2) {
								Static240.anInt5333 = Static72.anInt2031;
								Static184.anInt4358 = Static57.anInt1747;
							}
							Static87.method1812();
						}
						Static164.anInt3985 = -1;
						return true;
					} else if (Static164.anInt3985 == 132) {
						local133 = Static57.aClass3_Sub15_Sub1_3.method2163();
						local786 = Static57.aClass3_Sub15_Sub1_3.method2184();
						local864 = Static57.aClass3_Sub15_Sub1_3.method2207();
						local171 = Static57.aClass3_Sub15_Sub1_3.method2207();
						local1146 = Static57.aClass3_Sub15_Sub1_3.method2174();
						if (Static248.method3288(local786)) {
							Static261.method4505(local864, local1146, local171, local133);
						}
						Static164.anInt3985 = -1;
						return true;
					} else if (Static164.anInt3985 == 112) {
						Static115.anInt2940 = Static57.aClass3_Sub15_Sub1_3.method2229();
						Static180.anInt4264 = Static57.aClass3_Sub15_Sub1_3.method2212();
						for (local133 = Static115.anInt2940; local133 < Static115.anInt2940 + 8; local133++) {
							for (local786 = Static180.anInt4264; local786 < Static180.anInt4264 + 8; local786++) {
								if (Static159.aClass69ArrayArrayArray1[Static55.anInt1735][local133][local786] != null) {
									Static159.aClass69ArrayArrayArray1[Static55.anInt1735][local133][local786] = null;
									Static220.method3797(local786, local133);
								}
							}
						}
						for (@Pc(2604) Class3_Sub7 local2604 = (Class3_Sub7) Static26.aClass69_27.method2289(); local2604 != null; local2604 = (Class3_Sub7) Static26.aClass69_27.method2288()) {
							if (local2604.anInt928 >= Static115.anInt2940 && Static115.anInt2940 + 8 > local2604.anInt928 && local2604.anInt916 >= Static180.anInt4264 && local2604.anInt916 < Static180.anInt4264 + 8 && local2604.anInt918 == Static55.anInt1735) {
								local2604.anInt924 = 0;
							}
						}
						Static164.anInt3985 = -1;
						return true;
					} else if (Static164.anInt3985 == 144) {
						local133 = Static57.aClass3_Sub15_Sub1_3.method2224();
						@Pc(2666) Class13 local2666 = Static5.method32(local133);
						for (local864 = 0; local864 < local2666.anIntArray40.length; local864++) {
							local2666.anIntArray40[local864] = -1;
							local2666.anIntArray40[local864] = 0;
						}
						Static43.method1143(local2666);
						Static164.anInt3985 = -1;
						return true;
					} else if (Static164.anInt3985 == 130) {
						local133 = Static57.aClass3_Sub15_Sub1_3.method2208();
						local786 = Static57.aClass3_Sub15_Sub1_3.method2207();
						local864 = Static57.aClass3_Sub15_Sub1_3.method2184();
						if (local864 == 65535) {
							local864 = -1;
						}
						if (Static248.method3288(local786)) {
							Static132.method2607(-1, 1, local133, local864);
						}
						Static164.anInt3985 = -1;
						return true;
					} else if (Static164.anInt3985 == 192) {
						Static270.anInt5795 = Static57.aClass3_Sub15_Sub1_3.method2229();
						Static164.anInt3985 = -1;
						return true;
					} else if (Static164.anInt3985 == 13) {
						local133 = Static57.aClass3_Sub15_Sub1_3.method2180();
						local786 = Static57.aClass3_Sub15_Sub1_3.method2177();
						local864 = Static57.aClass3_Sub15_Sub1_3.method2229();
						Static55.anInt1735 = local786 >> 1;
						Static173.aClass8_Sub4_Sub1_2.method1265(local133, (local786 & 0x1) == 1, local864);
						Static164.anInt3985 = -1;
						return true;
					} else {
						@Pc(3002) int local3002;
						@Pc(3038) Class100 local3038;
						@Pc(3020) Class100 local3020;
						if (Static164.anInt3985 == 62) {
							local884 = Static57.aClass3_Sub15_Sub1_3.method2182();
							local864 = Static57.aClass3_Sub15_Sub1_3.method2163();
							local171 = Static57.aClass3_Sub15_Sub1_3.method2229();
							local262 = true;
							if (local884 < 0L) {
								local884 &= Long.MAX_VALUE;
								local262 = false;
							}
							local506 = Static186.aClass100_827;
							if (local864 > 0) {
								local506 = Static57.aClass3_Sub15_Sub1_3.method2202();
							}
							@Pc(2834) Class100 local2834 = Static79.method1702(local884).method3125();
							for (local1986 = 0; local1986 < Static9.anInt178; local1986++) {
								if (local884 == Static92.aLongArray3[local1986]) {
									if (local864 != Static104.anIntArray255[local1986]) {
										Static104.anIntArray255[local1986] = local864;
										if (local864 > 0) {
											Static103.method2231(Static186.aClass100_827, 5, Static34.method882(new Class100[] { local2834, Static25.aClass100_155 }));
										}
										if (local864 == 0) {
											Static103.method2231(Static186.aClass100_827, 5, Static34.method882(new Class100[] { local2834, Static92.aClass100_507 }));
										}
									}
									Static214.aClass100Array170[local1986] = local506;
									Static106.anIntArray258[local1986] = local171;
									local2834 = null;
									Static3.aBooleanArray135[local1986] = local262;
									break;
								}
							}
							if (local2834 != null && Static9.anInt178 < 200) {
								Static92.aLongArray3[Static9.anInt178] = local884;
								Static122.aClass100Array92[Static9.anInt178] = local2834;
								Static104.anIntArray255[Static9.anInt178] = local864;
								Static214.aClass100Array170[Static9.anInt178] = local506;
								Static106.anIntArray258[Static9.anInt178] = local171;
								Static3.aBooleanArray135[Static9.anInt178] = local262;
								Static9.anInt178++;
							}
							Static185.anInt4369 = Static119.anInt3028;
							local908 = Static9.anInt178;
							while (local908 > 0) {
								local908--;
								@Pc(2961) boolean local2961 = true;
								for (local916 = 0; local916 < local908; local916++) {
									if (Static104.anIntArray255[local916] != Static125.anInt3103 && Static125.anInt3103 == Static104.anIntArray255[local916 + 1] || Static104.anIntArray255[local916] == 0 && Static104.anIntArray255[local916 + 1] != 0) {
										local2961 = false;
										local3002 = Static104.anIntArray255[local916];
										Static104.anIntArray255[local916] = Static104.anIntArray255[local916 + 1];
										Static104.anIntArray255[local916 + 1] = local3002;
										local3020 = Static214.aClass100Array170[local916];
										Static214.aClass100Array170[local916] = Static214.aClass100Array170[local916 + 1];
										Static214.aClass100Array170[local916 + 1] = local3020;
										local3038 = Static122.aClass100Array92[local916];
										Static122.aClass100Array92[local916] = Static122.aClass100Array92[local916 + 1];
										Static122.aClass100Array92[local916 + 1] = local3038;
										@Pc(3056) long local3056 = Static92.aLongArray3[local916];
										Static92.aLongArray3[local916] = Static92.aLongArray3[local916 + 1];
										Static92.aLongArray3[local916 + 1] = local3056;
										@Pc(3074) int local3074 = Static106.anIntArray258[local916];
										Static106.anIntArray258[local916] = Static106.anIntArray258[local916 + 1];
										Static106.anIntArray258[local916 + 1] = local3074;
										@Pc(3092) boolean local3092 = Static3.aBooleanArray135[local916];
										Static3.aBooleanArray135[local916] = Static3.aBooleanArray135[local916 + 1];
										Static3.aBooleanArray135[local916 + 1] = local3092;
									}
								}
								if (local2961) {
									break;
								}
							}
							Static164.anInt3985 = -1;
							return true;
						} else if (Static164.anInt3985 == 160) {
							if (Static223.anInt5028 == 0) {
								Static195.aClass100_859 = Static105.aClass100_560;
							} else {
								Static195.aClass100_859 = Static57.aClass3_Sub15_Sub1_3.method2202();
							}
							Static164.anInt3985 = -1;
							return true;
						} else if (Static164.anInt3985 == 128) {
							for (local133 = 0; local133 < Static7.anIntArray75.length; local133++) {
								if (Static106.anIntArray257[local133] != Static7.anIntArray75[local133]) {
									Static7.anIntArray75[local133] = Static106.anIntArray257[local133];
									Static85.method1775(local133);
									Static83.anIntArray23[Static70.anInt2015++ & 0x1F] = local133;
								}
							}
							Static164.anInt3985 = -1;
							return true;
						} else if (Static164.anInt3985 == 154) {
							local133 = Static57.aClass3_Sub15_Sub1_3.method2163();
							local786 = Static57.aClass3_Sub15_Sub1_3.method2229();
							local864 = Static57.aClass3_Sub15_Sub1_3.method2229();
							local171 = Static57.aClass3_Sub15_Sub1_3.method2163();
							local1146 = Static57.aClass3_Sub15_Sub1_3.method2229();
							local277 = Static57.aClass3_Sub15_Sub1_3.method2229();
							if (Static248.method3288(local133)) {
								Static141.method2722(true, local1146, local171, local277, local864, local786);
							}
							Static164.anInt3985 = -1;
							return true;
						} else if (Static164.anInt3985 == 247) {
							local884 = Static57.aClass3_Sub15_Sub1_3.method2182();
							local275 = Static57.aClass3_Sub15_Sub1_3.method2163();
							local899 = Static57.aClass3_Sub15_Sub1_3.method2220();
							local1160 = Static57.aClass3_Sub15_Sub1_3.method2229();
							local1986 = Static57.aClass3_Sub15_Sub1_3.method2163();
							@Pc(3263) boolean local3263 = false;
							@Pc(3270) long local3270 = (local275 << 32) + local899;
							@Pc(3272) int local3272 = 0;
							label1402: while (true) {
								if (local3272 < 100) {
									if (local3270 != Static233.aLongArray9[local3272]) {
										local3272++;
										continue;
									}
									local3263 = true;
									break;
								}
								if (local1160 <= 1) {
									for (local3272 = 0; local3272 < Static35.anInt1093; local3272++) {
										if (local884 == Static190.aLongArray6[local3272]) {
											local3263 = true;
											break label1402;
										}
									}
								}
								break;
							}
							if (!local3263 && Static11.anInt384 == 0) {
								Static233.aLongArray9[Static251.anInt5447] = local3270;
								Static251.anInt5447 = (Static251.anInt5447 + 1) % 100;
								local3020 = Static230.method3953(local1986).method770(Static57.aClass3_Sub15_Sub1_3);
								if (local1160 == 2) {
									Static154.method2928(local1986, 18, local3020, null, Static34.method882(new Class100[] { Static44.aClass100_336, Static79.method1702(local884).method3125() }));
								} else if (local1160 == 1) {
									Static154.method2928(local1986, 18, local3020, null, Static34.method882(new Class100[] { Static65.aClass100_435, Static79.method1702(local884).method3125() }));
								} else {
									Static154.method2928(local1986, 18, local3020, null, Static79.method1702(local884).method3125());
								}
							}
							Static164.anInt3985 = -1;
							return true;
						} else {
							@Pc(3456) Class3_Sub31 local3456;
							if (Static164.anInt3985 == 176) {
								local133 = Static57.aClass3_Sub15_Sub1_3.method2206();
								local786 = Static57.aClass3_Sub15_Sub1_3.method2184();
								local864 = Static57.aClass3_Sub15_Sub1_3.method2206();
								if (Static248.method3288(local786)) {
									@Pc(3449) Class3_Sub31 local3449 = (Class3_Sub31) Static119.aClass133_9.method3863((long) local133);
									local3456 = (Class3_Sub31) Static119.aClass133_9.method3863((long) local864);
									if (local3456 != null) {
										Static132.method2605(local3449 == null || local3456.anInt5878 != local3449.anInt5878, local3456);
									}
									if (local3449 != null) {
										local3449.method4658();
										Static119.aClass133_9.method3862(local3449, (long) local864);
									}
									@Pc(3490) Class13 local3490 = Static5.method32(local133);
									if (local3490 != null) {
										Static43.method1143(local3490);
									}
									local3490 = Static5.method32(local864);
									if (local3490 != null) {
										Static43.method1143(local3490);
										Static17.method531(local3490, true);
									}
									if (Static154.anInt3711 != -1) {
										Static54.method1304(1, Static154.anInt3711);
									}
								}
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 27) {
								local133 = Static57.aClass3_Sub15_Sub1_3.method2163();
								local786 = Static57.aClass3_Sub15_Sub1_3.method2229();
								local864 = Static57.aClass3_Sub15_Sub1_3.method2229();
								local171 = Static57.aClass3_Sub15_Sub1_3.method2229();
								local1146 = Static57.aClass3_Sub15_Sub1_3.method2229();
								local277 = Static57.aClass3_Sub15_Sub1_3.method2163();
								if (Static248.method3288(local133)) {
									Static176.aBooleanArray95[local786] = true;
									Static222.anIntArray437[local786] = local864;
									Static276.anIntArray564[local786] = local171;
									Static202.anIntArray424[local786] = local1146;
									Static31.anIntArray76[local786] = local277;
								}
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 2) {
								local133 = Static57.aClass3_Sub15_Sub1_3.method2206();
								local786 = Static57.aClass3_Sub15_Sub1_3.method2184();
								local864 = Static57.aClass3_Sub15_Sub1_3.method2207();
								if (Static248.method3288(local786)) {
									Static136.method2649(local864, local133);
								}
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 85) {
								Static60.anInt1894 = Static57.aClass3_Sub15_Sub1_3.method2163() * 30;
								Static164.anInt3985 = -1;
								Static209.anInt4808 = Static119.anInt3028;
								return true;
							} else if (Static164.anInt3985 == 114) {
								Static202.method3654(Static71.aClass213_3, Static57.aClass3_Sub15_Sub1_3, Static223.anInt5028);
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 65) {
								local133 = Static57.aClass3_Sub15_Sub1_3.method2192();
								local786 = Static57.aClass3_Sub15_Sub1_3.method2212();
								local864 = Static57.aClass3_Sub15_Sub1_3.method2207();
								if (Static248.method3288(local133)) {
									Static132.method2606(local864, local786);
								}
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 234) {
								Static103.method2245();
								Static12.anInt400 = Static57.aClass3_Sub15_Sub1_3.method2229();
								Static209.anInt4808 = Static119.anInt3028;
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 209) {
								if (Static154.anInt3711 != -1) {
									Static54.method1304(0, Static154.anInt3711);
								}
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 191) {
								local133 = Static57.aClass3_Sub15_Sub1_3.method2192();
								Static13.method472(local133);
								Static27.anIntArray70[Static111.anInt2901++ & 0x1F] = local133 & 0x7FFF;
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 102) {
								local133 = Static57.aClass3_Sub15_Sub1_3.method2192();
								local786 = Static57.aClass3_Sub15_Sub1_3.method2180();
								local864 = Static57.aClass3_Sub15_Sub1_3.method2163();
								@Pc(3766) Class8_Sub4_Sub2 local3766 = Static175.aClass8_Sub4_Sub2Array1[local133];
								if (local3766 != null) {
									Static223.method3855(local786, local864, local3766);
								}
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 159) {
								Static103.method2245();
								Static251.anInt5456 = Static57.aClass3_Sub15_Sub1_3.method2213();
								Static209.anInt4808 = Static119.anInt3028;
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 71) {
								local884 = Static57.aClass3_Sub15_Sub1_3.method2182();
								local790 = Static218.method2862(Static65.method1497(Static57.aClass3_Sub15_Sub1_3).method3116());
								Static103.method2231(Static79.method1702(local884).method3125(), 6, local790);
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 42) {
								if (Static69.aFrame2 != null) {
									Static241.method4540(false, Static214.anInt5581, -1, -1);
								}
								@Pc(3848) byte[] local3848 = new byte[Static223.anInt5028];
								Static57.aClass3_Sub15_Sub1_3.method2237(local3848, Static223.anInt5028);
								local156 = Static10.method346(local3848, Static223.anInt5028, 0);
								if (Static39.aFrame1 == null && (SignLink.anInt5928 == 3 || !SignLink.aString15.startsWith("win") || Static178.aBoolean203)) {
									Static169.method3175(local156, true);
								} else {
									Static175.aClass100_797 = local156;
									Static164.aBoolean194 = true;
									Static33.aClass212_1 = Static71.aClass213_3.method5131(new String(local156.method3148(), "ISO-8859-1"));
								}
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 111) {
								local133 = Static57.aClass3_Sub15_Sub1_3.method2184();
								local786 = Static57.aClass3_Sub15_Sub1_3.method2224();
								local864 = Static57.aClass3_Sub15_Sub1_3.method2207();
								local171 = Static57.aClass3_Sub15_Sub1_3.method2192();
								local1146 = Static57.aClass3_Sub15_Sub1_3.method2207();
								if (Static248.method3288(local133)) {
									Static132.method2607(local864, 7, local786, local171 << 16 | local1146);
								}
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 37) {
								local133 = Static57.aClass3_Sub15_Sub1_3.method2177();
								local786 = Static57.aClass3_Sub15_Sub1_3.method2192();
								Static272.method3995(local133, local786);
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 155) {
								local133 = Static57.aClass3_Sub15_Sub1_3.method2229();
								local786 = Static57.aClass3_Sub15_Sub1_3.method2224();
								local864 = Static57.aClass3_Sub15_Sub1_3.method2184();
								local171 = Static57.aClass3_Sub15_Sub1_3.method2163();
								if (Static248.method3288(local864)) {
									local3456 = (Class3_Sub31) Static119.aClass133_9.method3863((long) local786);
									if (local3456 != null) {
										Static132.method2605(local3456.anInt5878 != local171, local3456);
									}
									Static44.method1148(local171, local786, local133);
								}
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 131) {
								for (local133 = 0; local133 < Static159.aClass8_Sub4_Sub1Array1.length; local133++) {
									if (Static159.aClass8_Sub4_Sub1Array1[local133] != null) {
										Static159.aClass8_Sub4_Sub1Array1[local133].anInt3369 = -1;
									}
								}
								for (local133 = 0; local133 < Static175.aClass8_Sub4_Sub2Array1.length; local133++) {
									if (Static175.aClass8_Sub4_Sub2Array1[local133] != null) {
										Static175.aClass8_Sub4_Sub2Array1[local133].anInt3369 = -1;
									}
								}
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 217) {
								local133 = Static57.aClass3_Sub15_Sub1_3.method2229();
								@Pc(4084) Class102 local4084 = new Class102();
								local786 = local133 >> 6;
								local4084.anInt4058 = local133 & 0x3F;
								local4084.anInt4048 = Static57.aClass3_Sub15_Sub1_3.method2229();
								if (local4084.anInt4048 >= 0 && local4084.anInt4048 < Static276.aClass3_Sub2_Sub1Array11.length) {
									if (local4084.anInt4058 == 1 || local4084.anInt4058 == 10) {
										local4084.anInt4057 = Static57.aClass3_Sub15_Sub1_3.method2163();
										Static57.aClass3_Sub15_Sub1_3.anInt2792 += 3;
									} else if (local4084.anInt4058 >= 2 && local4084.anInt4058 <= 6) {
										if (local4084.anInt4058 == 2) {
											local4084.anInt4045 = 64;
											local4084.anInt4047 = 64;
										}
										if (local4084.anInt4058 == 3) {
											local4084.anInt4045 = 0;
											local4084.anInt4047 = 64;
										}
										if (local4084.anInt4058 == 4) {
											local4084.anInt4045 = 128;
											local4084.anInt4047 = 64;
										}
										if (local4084.anInt4058 == 5) {
											local4084.anInt4045 = 64;
											local4084.anInt4047 = 0;
										}
										if (local4084.anInt4058 == 6) {
											local4084.anInt4045 = 64;
											local4084.anInt4047 = 128;
										}
										local4084.anInt4058 = 2;
										local4084.anInt4053 = Static57.aClass3_Sub15_Sub1_3.method2163();
										local4084.anInt4046 = Static57.aClass3_Sub15_Sub1_3.method2163();
										local4084.anInt4050 = Static57.aClass3_Sub15_Sub1_3.method2229();
									}
									local4084.anInt4052 = Static57.aClass3_Sub15_Sub1_3.method2163();
									if (local4084.anInt4052 == 65535) {
										local4084.anInt4052 = -1;
									}
									Static143.aClass102Array1[local786] = local4084;
								}
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 126) {
								Static35.anInt1093 = Static223.anInt5028 / 8;
								for (local133 = 0; local133 < Static35.anInt1093; local133++) {
									Static190.aLongArray6[local133] = Static57.aClass3_Sub15_Sub1_3.method2182();
									Static193.aClass100Array134[local133] = Static79.method1702(Static190.aLongArray6[local133]);
								}
								Static185.anInt4369 = Static119.anInt3028;
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 32) {
								Static86.method1800();
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 119) {
								local133 = Static57.aClass3_Sub15_Sub1_3.method2184();
								local786 = Static57.aClass3_Sub15_Sub1_3.method2208();
								local864 = Static57.aClass3_Sub15_Sub1_3.method2213();
								local171 = Static57.aClass3_Sub15_Sub1_3.method2173();
								if (Static248.method3288(local133)) {
									Static280.method4666(local864, local786, local171);
								}
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 235) {
								local133 = Static57.aClass3_Sub15_Sub1_3.method2180();
								local786 = local133 >> 2;
								local864 = local133 & 0x3;
								local171 = Static133.anIntArray453[local786];
								local1146 = Static57.aClass3_Sub15_Sub1_3.method2163();
								local277 = Static57.aClass3_Sub15_Sub1_3.method2174();
								if (local1146 == 65535) {
									local1146 = -1;
								}
								local908 = local277 & 0x3FFF;
								local1986 = local277 >> 14 & 0x3FFF;
								local1986 -= Static225.anInt5068;
								local908 -= Static142.anInt3483;
								local1160 = local277 >> 28 & 0x3;
								Static92.method1881(local1160, local864, local786, local908, local171, local1986, local1146);
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 0) {
								local884 = Static57.aClass3_Sub15_Sub1_3.method2182();
								local275 = Static57.aClass3_Sub15_Sub1_3.method2163();
								local899 = Static57.aClass3_Sub15_Sub1_3.method2220();
								local1160 = Static57.aClass3_Sub15_Sub1_3.method2229();
								@Pc(4425) boolean local4425 = false;
								@Pc(4431) long local4431 = local899 + (local275 << 32);
								local3002 = 0;
								label1450: while (true) {
									if (local3002 >= 100) {
										if (local1160 <= 1) {
											if (Static124.aBoolean157 && !Static207.aBoolean236 || Static86.aBoolean129) {
												local4425 = true;
											} else {
												for (local3002 = 0; local3002 < Static35.anInt1093; local3002++) {
													if (local884 == Static190.aLongArray6[local3002]) {
														local4425 = true;
														break label1450;
													}
												}
											}
										}
										break;
									}
									if (local4431 == Static233.aLongArray9[local3002]) {
										local4425 = true;
										break;
									}
									local3002++;
								}
								if (!local4425 && Static11.anInt384 == 0) {
									Static233.aLongArray9[Static251.anInt5447] = local4431;
									Static251.anInt5447 = (Static251.anInt5447 + 1) % 100;
									@Pc(4518) Class100 local4518 = Static218.method2862(Static65.method1497(Static57.aClass3_Sub15_Sub1_3).method3116());
									if (local1160 == 2 || local1160 == 3) {
										Static103.method2231(Static34.method882(new Class100[] { Static44.aClass100_336, Static79.method1702(local884).method3125() }), 7, local4518);
									} else if (local1160 == 1) {
										Static103.method2231(Static34.method882(new Class100[] { Static65.aClass100_435, Static79.method1702(local884).method3125() }), 7, local4518);
									} else {
										Static103.method2231(Static79.method1702(local884).method3125(), 3, local4518);
									}
								}
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 54) {
								local884 = Static57.aClass3_Sub15_Sub1_3.method2182();
								Static57.aClass3_Sub15_Sub1_3.method2186();
								local275 = Static57.aClass3_Sub15_Sub1_3.method2182();
								local899 = Static57.aClass3_Sub15_Sub1_3.method2163();
								local904 = Static57.aClass3_Sub15_Sub1_3.method2220();
								@Pc(4626) long local4626 = (local899 << 32) + local904;
								local908 = Static57.aClass3_Sub15_Sub1_3.method2229();
								@Pc(4632) boolean local4632 = false;
								@Pc(4634) int local4634 = 0;
								label1575: while (true) {
									if (local4634 >= 100) {
										if (local908 <= 1) {
											if (Static124.aBoolean157 && !Static207.aBoolean236 || Static86.aBoolean129) {
												local4632 = true;
											} else {
												for (local4634 = 0; local4634 < Static35.anInt1093; local4634++) {
													if (Static190.aLongArray6[local4634] == local884) {
														local4632 = true;
														break label1575;
													}
												}
											}
										}
										break;
									}
									if (Static233.aLongArray9[local4634] == local4626) {
										local4632 = true;
										break;
									}
									local4634++;
								}
								if (!local4632 && Static11.anInt384 == 0) {
									Static233.aLongArray9[Static251.anInt5447] = local4626;
									Static251.anInt5447 = (Static251.anInt5447 + 1) % 100;
									local3038 = Static218.method2862(Static65.method1497(Static57.aClass3_Sub15_Sub1_3).method3116());
									if (local908 == 2 || local908 == 3) {
										Static73.method1598(local3038, Static34.method882(new Class100[] { Static44.aClass100_336, Static79.method1702(local884).method3125() }), Static79.method1702(local275).method3125());
									} else if (local908 == 1) {
										Static73.method1598(local3038, Static34.method882(new Class100[] { Static65.aClass100_435, Static79.method1702(local884).method3125() }), Static79.method1702(local275).method3125());
									} else {
										Static73.method1598(local3038, Static79.method1702(local884).method3125(), Static79.method1702(local275).method3125());
									}
								}
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 214) {
								Static75.method1629(true);
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 172) {
								local133 = Static57.aClass3_Sub15_Sub1_3.method2163();
								local786 = Static57.aClass3_Sub15_Sub1_3.method2229();
								if (local133 == 65535) {
									local133 = -1;
								}
								local864 = Static57.aClass3_Sub15_Sub1_3.method2163();
								Static26.method744(local786, local133, local864);
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 66) {
								local133 = Static57.aClass3_Sub15_Sub1_3.method2207();
								local786 = Static57.aClass3_Sub15_Sub1_3.method2206();
								if (Static248.method3288(local133)) {
									local864 = 0;
									if (Static173.aClass8_Sub4_Sub1_2.aClass59_1 != null) {
										local864 = Static173.aClass8_Sub4_Sub1_2.aClass59_1.method1952();
									}
									Static132.method2607(-1, 3, local786, local864);
								}
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 171) {
								local133 = Static57.aClass3_Sub15_Sub1_3.method2224();
								local156 = Static57.aClass3_Sub15_Sub1_3.method2202();
								local864 = Static57.aClass3_Sub15_Sub1_3.method2184();
								if (Static248.method3288(local864)) {
									Static80.method3617(local156, local133);
								}
								Static164.anInt3985 = -1;
								return true;
							} else if (Static164.anInt3985 == 84) {
								local133 = Static57.aClass3_Sub15_Sub1_3.method2208();
								local786 = Static57.aClass3_Sub15_Sub1_3.method2207();
								Static272.method3995(local133, local786);
								Static164.anInt3985 = -1;
								return true;
							} else {
								@Pc(4956) Class13 local4956;
								if (Static164.anInt3985 == 22) {
									local133 = Static57.aClass3_Sub15_Sub1_3.method2174();
									local786 = Static57.aClass3_Sub15_Sub1_3.method2163();
									if (local133 < -70000) {
										local786 += 32768;
									}
									if (local133 < 0) {
										local4956 = null;
									} else {
										local4956 = Static5.method32(local133);
									}
									while (Static57.aClass3_Sub15_Sub1_3.anInt2792 < Static223.anInt5028) {
										local171 = Static57.aClass3_Sub15_Sub1_3.method2204();
										local1146 = Static57.aClass3_Sub15_Sub1_3.method2163();
										local277 = 0;
										if (local1146 != 0) {
											local277 = Static57.aClass3_Sub15_Sub1_3.method2229();
											if (local277 == 255) {
												local277 = Static57.aClass3_Sub15_Sub1_3.method2174();
											}
										}
										if (local4956 != null && local171 >= 0 && local4956.anIntArray40.length > local171) {
											local4956.anIntArray40[local171] = local1146;
											local4956.anIntArray50[local171] = local277;
										}
										Static280.method4672(local1146 - 1, local171, local277, local786);
									}
									if (local4956 != null) {
										Static43.method1143(local4956);
									}
									Static103.method2245();
									Static27.anIntArray70[Static111.anInt2901++ & 0x1F] = local786 & 0x7FFF;
									Static164.anInt3985 = -1;
									return true;
								} else if (Static164.anInt3985 == 24) {
									local133 = Static57.aClass3_Sub15_Sub1_3.method2163();
									if (Static248.method3288(local133)) {
										Static35.method902();
									}
									Static164.anInt3985 = -1;
									return true;
								} else if (Static164.anInt3985 == 86) {
									Static278.method4653();
									Static164.anInt3985 = -1;
									return false;
								} else if (Static164.anInt3985 == 116) {
									local133 = Static57.aClass3_Sub15_Sub1_3.method2229();
									if (Static57.aClass3_Sub15_Sub1_3.method2229() == 0) {
										Static229.aClass136Array1[local133] = new StockMarketOffer();
									} else {
										Static57.aClass3_Sub15_Sub1_3.anInt2792--;
										Static229.aClass136Array1[local133] = new StockMarketOffer(Static57.aClass3_Sub15_Sub1_3);
									}
									Static164.anInt3985 = -1;
									Static207.anInt4778 = Static119.anInt3028;
									return true;
								} else if (Static164.anInt3985 == 73) {
									local133 = Static57.aClass3_Sub15_Sub1_3.method2184();
									local786 = Static57.aClass3_Sub15_Sub1_3.method2208();
									if (local133 == 65535) {
										local133 = -1;
									}
									local864 = Static57.aClass3_Sub15_Sub1_3.method2192();
									if (Static248.method3288(local864)) {
										Static132.method2607(-1, 2, local786, local133);
									}
									Static164.anInt3985 = -1;
									return true;
								} else if (Static164.anInt3985 == 162) {
									Static75.method1629(false);
									Static164.anInt3985 = -1;
									return true;
								} else if (Static164.anInt3985 == 165) {
									local133 = Static57.aClass3_Sub15_Sub1_3.method2192();
									local786 = Static57.aClass3_Sub15_Sub1_3.method2192();
									if (local786 == 65535) {
										local786 = -1;
									}
									local864 = Static57.aClass3_Sub15_Sub1_3.method2174();
									local171 = Static57.aClass3_Sub15_Sub1_3.method2184();
									local1146 = Static57.aClass3_Sub15_Sub1_3.method2206();
									if (local171 == 65535) {
										local171 = -1;
									}
									if (Static248.method3288(local133)) {
										for (local277 = local171; local277 <= local786; local277++) {
											local904 = ((long) local864 << 32) + ((long) local277);
											local1804 = (Class3_Sub4) Static210.aClass133_21.method3863(local904);
											if (local1804 != null) {
												local1814 = new Class3_Sub4(local1146, local1804.anInt540);
												local1804.method4658();
											} else if (local277 == -1) {
												local1814 = new Class3_Sub4(local1146, Static5.method32(local864).aClass3_Sub4_1.anInt540);
											} else {
												local1814 = new Class3_Sub4(local1146, -1);
											}
											Static210.aClass133_21.method3862(local1814, local904);
										}
									}
									Static164.anInt3985 = -1;
									return true;
								} else if (Static164.anInt3985 == 197) {
									Static166.anInt4054 = Static57.aClass3_Sub15_Sub1_3.method2229();
									Static185.anInt4369 = Static119.anInt3028;
									Static164.anInt3985 = -1;
									return true;
								} else if (Static164.anInt3985 == 196) {
									local884 = Static57.aClass3_Sub15_Sub1_3.method2182();
									local864 = Static57.aClass3_Sub15_Sub1_3.method2163();
									@Pc(5325) byte local5325 = Static57.aClass3_Sub15_Sub1_3.method2186();
									local262 = false;
									if ((Long.MIN_VALUE & local884) != 0L) {
										local262 = true;
									}
									if (local262) {
										if (Static214.anInt5577 == 0) {
											Static164.anInt3985 = -1;
											return true;
										}
										local884 &= Long.MAX_VALUE;
										for (local277 = 0; Static214.anInt5577 > local277 && (local884 != Static199.aClass3_Sub22Array1[local277].aLong192 || local864 != Static199.aClass3_Sub22Array1[local277].anInt3340); local277++) {
										}
										if (local277 < Static214.anInt5577) {
											while (Static214.anInt5577 - 1 > local277) {
												Static199.aClass3_Sub22Array1[local277] = Static199.aClass3_Sub22Array1[local277 + 1];
												local277++;
											}
											Static214.anInt5577--;
											Static199.aClass3_Sub22Array1[Static214.anInt5577] = null;
										}
									} else {
										local506 = Static57.aClass3_Sub15_Sub1_3.method2202();
										@Pc(5347) Class3_Sub22 local5347 = new Class3_Sub22();
										local5347.aLong192 = local884;
										local5347.aClass100_636 = Static79.method1702(local5347.aLong192);
										local5347.aByte9 = local5325;
										local5347.aClass100_635 = local506;
										local5347.anInt3340 = local864;
										for (local1986 = Static214.anInt5577 - 1; local1986 >= 0; local1986--) {
											local908 = Static199.aClass3_Sub22Array1[local1986].aClass100_636.method3139(local5347.aClass100_636);
											if (local908 == 0) {
												Static199.aClass3_Sub22Array1[local1986].anInt3340 = local864;
												Static199.aClass3_Sub22Array1[local1986].aByte9 = local5325;
												Static199.aClass3_Sub22Array1[local1986].aClass100_635 = local506;
												if (local884 == Static101.aLong98) {
													Static160.aByte14 = local5325;
												}
												Static278.anInt5867 = Static119.anInt3028;
												Static164.anInt3985 = -1;
												return true;
											}
											if (local908 < 0) {
												break;
											}
										}
										if (Static199.aClass3_Sub22Array1.length <= Static214.anInt5577) {
											Static164.anInt3985 = -1;
											return true;
										}
										for (local908 = Static214.anInt5577 - 1; local908 > local1986; local908--) {
											Static199.aClass3_Sub22Array1[local908 + 1] = Static199.aClass3_Sub22Array1[local908];
										}
										if (Static214.anInt5577 == 0) {
											Static199.aClass3_Sub22Array1 = new Class3_Sub22[100];
										}
										Static199.aClass3_Sub22Array1[local1986 + 1] = local5347;
										if (Static101.aLong98 == local884) {
											Static160.aByte14 = local5325;
										}
										Static214.anInt5577++;
									}
									Static164.anInt3985 = -1;
									Static278.anInt5867 = Static119.anInt3028;
									return true;
								} else if (Static164.anInt3985 == 50) {
									local133 = Static57.aClass3_Sub15_Sub1_3.method2174();
									local786 = Static57.aClass3_Sub15_Sub1_3.method2224();
									local864 = Static57.aClass3_Sub15_Sub1_3.method2207();
									if (local864 == 65535) {
										local864 = -1;
									}
									local171 = Static57.aClass3_Sub15_Sub1_3.method2192();
									if (Static248.method3288(local171)) {
										@Pc(5603) Class13 local5603 = Static5.method32(local786);
										@Pc(5615) Class55 local5615;
										if (local5603.aBoolean32) {
											Static209.method3707(local786, local133, local864);
											local5615 = Static71.method1439(local864);
											Static261.method4505(local5615.anInt2375, local786, local5615.anInt2369, local5615.anInt2353);
											Static145.method2745(local786, local5615.anInt2339, local5615.anInt2319, local5615.anInt2359);
										} else if (local864 == -1) {
											local5603.anInt464 = 0;
											Static164.anInt3985 = -1;
											return true;
										} else {
											local5615 = Static71.method1439(local864);
											local5603.anInt450 = local5615.anInt2353;
											local5603.anInt443 = local5615.anInt2375 * 100 / local133;
											local5603.anInt464 = 4;
											local5603.anInt463 = local864;
											local5603.anInt524 = local5615.anInt2369;
											Static43.method1143(local5603);
										}
									}
									Static164.anInt3985 = -1;
									return true;
								} else if (Static164.anInt3985 == 105) {
									local133 = Static57.aClass3_Sub15_Sub1_3.method2174();
									local786 = Static57.aClass3_Sub15_Sub1_3.method2163();
									if (local133 < -70000) {
										local786 += 32768;
									}
									if (local133 >= 0) {
										local4956 = Static5.method32(local133);
									} else {
										local4956 = null;
									}
									if (local4956 != null) {
										for (local171 = 0; local171 < local4956.anIntArray40.length; local171++) {
											local4956.anIntArray40[local171] = 0;
											local4956.anIntArray50[local171] = 0;
										}
									}
									Static14.method475(local786);
									local171 = Static57.aClass3_Sub15_Sub1_3.method2163();
									for (local1146 = 0; local1146 < local171; local1146++) {
										local277 = Static57.aClass3_Sub15_Sub1_3.method2180();
										if (local277 == 255) {
											local277 = Static57.aClass3_Sub15_Sub1_3.method2174();
										}
										local1160 = Static57.aClass3_Sub15_Sub1_3.method2163();
										if (local4956 != null && local1146 < local4956.anIntArray40.length) {
											local4956.anIntArray40[local1146] = local1160;
											local4956.anIntArray50[local1146] = local277;
										}
										Static280.method4672(local1160 - 1, local1146, local277, local786);
									}
									if (local4956 != null) {
										Static43.method1143(local4956);
									}
									Static103.method2245();
									Static27.anIntArray70[Static111.anInt2901++ & 0x1F] = local786 & 0x7FFF;
									Static164.anInt3985 = -1;
									return true;
								} else if (Static164.anInt3985 == 142) {
									Static230.method3954(Static57.aClass3_Sub15_Sub1_3.method2202());
									Static164.anInt3985 = -1;
									return true;
								} else if (Static164.anInt3985 == 26) {
									Static115.anInt2940 = Static57.aClass3_Sub15_Sub1_3.method2212();
									Static180.anInt4264 = Static57.aClass3_Sub15_Sub1_3.method2229();
									Static164.anInt3985 = -1;
									return true;
								} else if (Static164.anInt3985 == 4) {
									local133 = Static57.aClass3_Sub15_Sub1_3.method2207();
									if (local133 == 65535) {
										local133 = -1;
									}
									Static148.method2765(local133);
									Static164.anInt3985 = -1;
									return true;
								} else if (Static164.anInt3985 == 208) {
									local133 = Static57.aClass3_Sub15_Sub1_3.method2181();
									local786 = Static57.aClass3_Sub15_Sub1_3.method2192();
									if (local786 == 65535) {
										local786 = -1;
									}
									Static278.method4650(local133, local786);
									Static164.anInt3985 = -1;
									return true;
								} else {
									Static89.method1839("T1 - " + Static164.anInt3985 + "," + Static5.anInt45 + "," + Static49.anInt1462 + " - " + Static223.anInt5028, null);
									Static278.method4653();
									return true;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
	public static void method28() {
		Static43.method1143(Static105.aClass13_14);
		Static213.anInt4851++;
		if (Static44.aBoolean83 && Static146.aBoolean174) {
			@Pc(30) int local30 = Static215.anInt4873;
			local30 -= Static246.anInt5388;
			if (Static81.anInt2225 > local30) {
				local30 = Static81.anInt2225;
			}
			@Pc(41) int local41 = Static223.anInt5032;
			if (Static81.anInt2225 + aClass13_1.anInt445 < local30 - -Static105.aClass13_14.anInt445) {
				local30 = Static81.anInt2225 + aClass13_1.anInt445 - Static105.aClass13_14.anInt445;
			}
			local41 -= Static165.anInt4035;
			if (local41 < Static228.anInt5103) {
				local41 = Static228.anInt5103;
			}
			if (Static228.anInt5103 + aClass13_1.anInt459 < local41 - -Static105.aClass13_14.anInt459) {
				local41 = Static228.anInt5103 + aClass13_1.anInt459 - Static105.aClass13_14.anInt459;
			}
			@Pc(109) int local109 = local41 - Static20.anInt660;
			@Pc(114) int local114 = local30 - Static124.anInt3075;
			@Pc(122) int local122 = local30 + aClass13_1.anInt489 - Static81.anInt2225;
			@Pc(130) int local130 = aClass13_1.anInt468 + local41 - Static228.anInt5103;
			@Pc(133) int local133 = Static105.aClass13_14.anInt472;
			if (Static213.anInt4851 > Static105.aClass13_14.anInt447 && (local133 < local114 || -local133 > local114 || local109 > local133 || local109 < -local133)) {
				Static138.aBoolean172 = true;
			}
			@Pc(176) Class3_Sub19 local176;
			if (Static105.aClass13_14.anObjectArray26 != null && Static138.aBoolean172) {
				local176 = new Class3_Sub19();
				local176.aClass13_17 = Static105.aClass13_14;
				local176.anObjectArray31 = Static105.aClass13_14.anObjectArray26;
				local176.anInt3102 = local122;
				local176.anInt3097 = local130;
				Static82.method1767(local176);
			}
			if (Static22.anInt723 == 0) {
				if (Static138.aBoolean172) {
					if (Static105.aClass13_14.anObjectArray16 != null) {
						local176 = new Class3_Sub19();
						local176.anInt3097 = local130;
						local176.aClass13_16 = Static56.aClass13_12;
						local176.anInt3102 = local122;
						local176.anObjectArray31 = Static105.aClass13_14.anObjectArray16;
						local176.aClass13_17 = Static105.aClass13_14;
						Static82.method1767(local176);
					}
					if (Static56.aClass13_12 != null && Static36.method938(Static105.aClass13_14) != null) {
						Static6.aClass3_Sub15_Sub1_1.method2242(79);
						Static6.aClass3_Sub15_Sub1_1.method2185(Static105.aClass13_14.anInt507);
						Static6.aClass3_Sub15_Sub1_1.method2222(Static56.aClass13_12.anInt457);
						Static6.aClass3_Sub15_Sub1_1.method2164(Static56.aClass13_12.anInt507);
						Static6.aClass3_Sub15_Sub1_1.method2222(Static105.aClass13_14.anInt457);
					}
				} else if ((Static116.anInt2952 == 1 || Static277.method4640(Static231.anInt5204 - 1)) && Static231.anInt5204 > 2) {
					Static226.method3901();
				} else if (Static231.anInt5204 > 0) {
					Static59.method1372();
				}
				Static105.aClass13_14 = null;
			}
		} else if (Static213.anInt4851 > 1) {
			Static105.aClass13_14 = null;
		}
	}
}
