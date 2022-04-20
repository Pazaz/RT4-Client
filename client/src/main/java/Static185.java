import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!p", name = "e", descriptor = "I")
	public static int anInt4370;

	@OriginalMember(owner = "client!p", name = "g", descriptor = "F")
	public static float aFloat23;

	@OriginalMember(owner = "client!p", name = "c", descriptor = "Lclient!ih;")
	public static final LinkedList aClass69_101 = new LinkedList();

	@OriginalMember(owner = "client!p", name = "d", descriptor = "I")
	public static int anInt4369 = 0;

	@OriginalMember(owner = "client!p", name = "f", descriptor = "Lclient!na;")
	public static final JagString aClass100_823 = Static28.parse("::serverjs5drop");

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public static void method3395() {
		if (Static184.anInt4348 == 5) {
			Static184.anInt4348 = 6;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IZIZLclient!mj;IIIBII)V")
	public static void method3397(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) CollisionMap arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg1 && !Static138.method2697() && (Static12.aByteArrayArrayArray2[0][arg7][arg8] & 0x2) == 0) {
			if ((Static12.aByteArrayArrayArray2[arg2][arg7][arg8] & 0x10) != 0) {
				return;
			}
			if (Static4.method22(arg8, arg7, arg2) != Static41.anInt1316) {
				return;
			}
		}
		if (arg2 < Static146.anInt3508) {
			Static146.anInt3508 = arg2;
		}
		@Pc(62) LocType local62 = Static271.method4601(arg5);
		if (GlRenderer.enabled && local62.aBoolean216) {
			return;
		}
		@Pc(84) int local84;
		@Pc(81) int local81;
		if (arg9 == 1 || arg9 == 3) {
			local81 = local62.anInt4397;
			local84 = local62.anInt4403;
		} else {
			local84 = local62.anInt4397;
			local81 = local62.anInt4403;
		}
		@Pc(103) int local103;
		@Pc(112) int local112;
		if (arg7 + local84 <= 104) {
			local103 = arg7 + (local84 >> 1);
			local112 = arg7 + (local84 + 1 >> 1);
		} else {
			local112 = arg7 + 1;
			local103 = arg7;
		}
		@Pc(129) int local129;
		@Pc(133) int local133;
		if (local81 + arg8 > 104) {
			local129 = arg8;
			local133 = arg8 + 1;
		} else {
			local129 = (local81 >> 1) + arg8;
			local133 = arg8 + (local81 + 1 >> 1);
		}
		@Pc(153) int[][] local153 = Static83.anIntArrayArrayArray4[arg0];
		@Pc(165) int local165 = (local84 << 6) + (arg7 << 7);
		@Pc(173) int local173 = (local81 << 6) + (arg8 << 7);
		@Pc(199) int local199 = local153[local103][local133] + local153[local112][local129] + local153[local103][local129] + local153[local112][local133] >> 2;
		@Pc(201) int local201 = 0;
		@Pc(213) int[][] local213;
		if (GlRenderer.enabled && arg0 != 0) {
			local213 = Static83.anIntArrayArrayArray4[0];
			local201 = local199 - (local213[local112][local133] + local213[local112][local129] + local213[local103][local129] + local213[local103][local133] >> 2);
		}
		local213 = null;
		@Pc(261) long local261 = (long) (arg7 | 0x40000000 | arg8 << 7 | arg6 << 14 | arg9 << 20);
		if (arg3) {
			local213 = Static107.anIntArrayArrayArray10[0];
		} else if (arg0 < 3) {
			local213 = Static83.anIntArrayArrayArray4[arg0 + 1];
		}
		if (local62.anInt4429 == 0 || arg3) {
			local261 |= Long.MIN_VALUE;
		}
		if (local62.anInt4438 == 1) {
			local261 |= 0x400000L;
		}
		if (local62.aBoolean213) {
			local261 |= 0x80000000L;
		}
		if (local62.method3422()) {
			Static122.method2411(arg8, local62, arg9, null, arg7, arg2, null);
		}
		@Pc(330) boolean local330 = local62.aBoolean212 & !arg3;
		local261 |= (long) arg5 << 32;
		@Pc(387) Entity local387;
		@Pc(403) Class139 local403;
		if (arg6 == 22) {
			if (Static250.aBoolean283 || local62.anInt4429 != 0 || local62.anInt4435 == 1 || local62.aBoolean206) {
				if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
					local403 = local62.method3428(arg9, local165, local153, 22, local199, local213, arg1, null, local330, local173);
					if (GlRenderer.enabled && local330) {
						Static242.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
					}
					local387 = local403.aClass8_10;
				} else {
					local387 = new Loc(arg5, 22, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
				}
				Static170.method2570(arg2, arg7, arg8, local199, local387, local261, local62.aBoolean211);
				if (local62.anInt4435 == 1 && arg4 != null) {
					arg4.method3057(arg7, arg8);
				}
			}
		} else if (arg6 == 10 || arg6 == 11) {
			if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
				local403 = local62.method3428(arg6 == 11 ? arg9 + 4 : arg9, local165, local153, 10, local199, local213, arg1, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					Static242.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
				}
				local387 = local403.aClass8_10;
			} else {
				local387 = new Loc(arg5, 10, arg6 == 11 ? arg9 + 4 : arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
			}
			if (local387 != null) {
				@Pc(531) boolean local531 = Static5.method35(arg2, arg7, arg8, local199, local84, local81, local387, local261);
				if (local62.aBoolean215 && local531 && arg1) {
					@Pc(541) int local541 = 15;
					if (local387 instanceof Model) {
						local541 = ((Model) local387).method4566() / 4;
						if (local541 > 30) {
							local541 = 30;
						}
					}
					for (@Pc(560) int local560 = 0; local560 <= local84; local560++) {
						for (@Pc(565) int local565 = 0; local565 <= local81; local565++) {
							if (Static118.aByteArrayArrayArray9[arg2][arg7 + local560][local565 + arg8] < local541) {
								Static118.aByteArrayArrayArray9[arg2][arg7 + local560][arg8 + local565] = (byte) local541;
							}
						}
					}
				}
			}
			if (local62.anInt4435 != 0 && arg4 != null) {
				arg4.method3043(arg7, local62.aBoolean207, arg8, local84, local81);
			}
		} else if (arg6 >= 12) {
			if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
				local403 = local62.method3428(arg9, local165, local153, arg6, local199, local213, arg1, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					Static242.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
				}
				local387 = local403.aClass8_10;
			} else {
				local387 = new Loc(arg5, arg6, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
			}
			Static5.method35(arg2, arg7, arg8, local199, 1, 1, local387, local261);
			if (arg1 && arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg2 > 0) {
				Static60.anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x4;
			}
			if (local62.anInt4435 != 0 && arg4 != null) {
				arg4.method3043(arg7, local62.aBoolean207, arg8, local84, local81);
			}
		} else if (arg6 == 0) {
			if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
				local403 = local62.method3428(arg9, local165, local153, 0, local199, local213, arg1, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					Static242.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
				}
				local387 = local403.aClass8_10;
			} else {
				local387 = new Loc(arg5, 0, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
			}
			Static262.method4508(arg2, arg7, arg8, local199, local387, null, Static267.anIntArray517[arg9], 0, local261);
			if (arg1) {
				if (arg9 == 0) {
					if (local62.aBoolean215) {
						Static118.aByteArrayArrayArray9[arg2][arg7][arg8] = 50;
						Static118.aByteArrayArrayArray9[arg2][arg7][arg8 + 1] = 50;
					}
					if (local62.aBoolean220) {
						Static60.anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x1;
					}
				} else if (arg9 == 1) {
					if (local62.aBoolean215) {
						Static118.aByteArrayArrayArray9[arg2][arg7][arg8 + 1] = 50;
						Static118.aByteArrayArrayArray9[arg2][arg7 + 1][arg8 + 1] = 50;
					}
					if (local62.aBoolean220) {
						Static60.anIntArrayArrayArray6[arg2][arg7][arg8 + 1] |= 0x2;
					}
				} else if (arg9 == 2) {
					if (local62.aBoolean215) {
						Static118.aByteArrayArrayArray9[arg2][arg7 + 1][arg8] = 50;
						Static118.aByteArrayArrayArray9[arg2][arg7 + 1][arg8 + 1] = 50;
					}
					if (local62.aBoolean220) {
						Static60.anIntArrayArrayArray6[arg2][arg7 + 1][arg8] |= 0x1;
					}
				} else if (arg9 == 3) {
					if (local62.aBoolean215) {
						Static118.aByteArrayArrayArray9[arg2][arg7][arg8] = 50;
						Static118.aByteArrayArrayArray9[arg2][arg7 + 1][arg8] = 50;
					}
					if (local62.aBoolean220) {
						Static60.anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x2;
					}
				}
			}
			if (local62.anInt4435 != 0 && arg4 != null) {
				arg4.method3040(arg9, arg6, local62.aBoolean207, arg8, arg7);
			}
			if (local62.anInt4428 != 16) {
				Static18.method559(arg2, arg7, arg8, local62.anInt4428);
			}
		} else if (arg6 == 1) {
			if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
				local403 = local62.method3428(arg9, local165, local153, 1, local199, local213, arg1, null, local330, local173);
				if (GlRenderer.enabled && local330) {
					Static242.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
				}
				local387 = local403.aClass8_10;
			} else {
				local387 = new Loc(arg5, 1, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
			}
			Static262.method4508(arg2, arg7, arg8, local199, local387, null, Static78.anIntArray204[arg9], 0, local261);
			if (local62.aBoolean215 && arg1) {
				if (arg9 == 0) {
					Static118.aByteArrayArrayArray9[arg2][arg7][arg8 + 1] = 50;
				} else if (arg9 == 1) {
					Static118.aByteArrayArrayArray9[arg2][arg7 + 1][arg8 + 1] = 50;
				} else if (arg9 == 2) {
					Static118.aByteArrayArrayArray9[arg2][arg7 + 1][arg8] = 50;
				} else if (arg9 == 3) {
					Static118.aByteArrayArrayArray9[arg2][arg7][arg8] = 50;
				}
			}
			if (local62.anInt4435 != 0 && arg4 != null) {
				arg4.method3040(arg9, arg6, local62.aBoolean207, arg8, arg7);
			}
		} else {
			@Pc(1226) int local1226;
			if (arg6 == 2) {
				local1226 = arg9 + 1 & 0x3;
				@Pc(1269) Entity local1269;
				@Pc(1254) Entity local1254;
				if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
					@Pc(1287) Class139 local1287 = local62.method3428(arg9 + 4, local165, local153, 2, local199, local213, arg1, null, local330, local173);
					if (GlRenderer.enabled && local330) {
						Static242.method4211(local1287.aClass36_Sub1_3, local165, local201, local173);
					}
					local1254 = local1287.aClass8_10;
					local1287 = local62.method3428(local1226, local165, local153, 2, local199, local213, arg1, null, local330, local173);
					if (GlRenderer.enabled && local330) {
						Static242.method4211(local1287.aClass36_Sub1_3, local165, local201, local173);
					}
					local1269 = local1287.aClass8_10;
				} else {
					local1254 = new Loc(arg5, 2, arg9 + 4, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
					local1269 = new Loc(arg5, 2, local1226, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
				}
				Static262.method4508(arg2, arg7, arg8, local199, local1254, local1269, Static267.anIntArray517[arg9], Static267.anIntArray517[local1226], local261);
				if (local62.aBoolean220 && arg1) {
					if (arg9 == 0) {
						Static60.anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x1;
						Static60.anIntArrayArrayArray6[arg2][arg7][arg8 + 1] |= 0x2;
					} else if (arg9 == 1) {
						Static60.anIntArrayArrayArray6[arg2][arg7][arg8 + 1] |= 0x2;
						Static60.anIntArrayArrayArray6[arg2][arg7 + 1][arg8] |= 0x1;
					} else if (arg9 == 2) {
						Static60.anIntArrayArrayArray6[arg2][arg7 + 1][arg8] |= 0x1;
						Static60.anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x2;
					} else if (arg9 == 3) {
						Static60.anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x2;
						Static60.anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x1;
					}
				}
				if (local62.anInt4435 != 0 && arg4 != null) {
					arg4.method3040(arg9, arg6, local62.aBoolean207, arg8, arg7);
				}
				if (local62.anInt4428 != 16) {
					Static18.method559(arg2, arg7, arg8, local62.anInt4428);
				}
			} else if (arg6 == 3) {
				if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
					local403 = local62.method3428(arg9, local165, local153, 3, local199, local213, arg1, null, local330, local173);
					if (GlRenderer.enabled && local330) {
						Static242.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
					}
					local387 = local403.aClass8_10;
				} else {
					local387 = new Loc(arg5, 3, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
				}
				Static262.method4508(arg2, arg7, arg8, local199, local387, null, Static78.anIntArray204[arg9], 0, local261);
				if (local62.aBoolean215 && arg1) {
					if (arg9 == 0) {
						Static118.aByteArrayArrayArray9[arg2][arg7][arg8 + 1] = 50;
					} else if (arg9 == 1) {
						Static118.aByteArrayArrayArray9[arg2][arg7 + 1][arg8 + 1] = 50;
					} else if (arg9 == 2) {
						Static118.aByteArrayArrayArray9[arg2][arg7 + 1][arg8] = 50;
					} else if (arg9 == 3) {
						Static118.aByteArrayArrayArray9[arg2][arg7][arg8] = 50;
					}
				}
				if (local62.anInt4435 != 0 && arg4 != null) {
					arg4.method3040(arg9, arg6, local62.aBoolean207, arg8, arg7);
				}
			} else if (arg6 == 9) {
				if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
					local403 = local62.method3428(arg9, local165, local153, arg6, local199, local213, arg1, null, local330, local173);
					if (GlRenderer.enabled && local330) {
						Static242.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
					}
					local387 = local403.aClass8_10;
				} else {
					local387 = new Loc(arg5, arg6, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
				}
				Static5.method35(arg2, arg7, arg8, local199, 1, 1, local387, local261);
				if (local62.anInt4435 != 0 && arg4 != null) {
					arg4.method3043(arg7, local62.aBoolean207, arg8, local84, local81);
				}
				if (local62.anInt4428 != 16) {
					Static18.method559(arg2, arg7, arg8, local62.anInt4428);
				}
			} else if (arg6 == 4) {
				if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
					local403 = local62.method3428(arg9, local165, local153, 4, local199, local213, arg1, null, local330, local173);
					if (GlRenderer.enabled && local330) {
						Static242.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
					}
					local387 = local403.aClass8_10;
				} else {
					local387 = new Loc(arg5, 4, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
				}
				Static91.method1880(arg2, arg7, arg8, local199, local387, null, Static267.anIntArray517[arg9], 0, 0, 0, local261);
			} else {
				@Pc(1889) long local1889;
				@Pc(1934) Entity local1934;
				@Pc(1950) Class139 local1950;
				if (arg6 == 5) {
					local1226 = 16;
					local1889 = Static265.method4521(arg2, arg7, arg8);
					if (local1889 != 0L) {
						local1226 = Static271.method4601(Integer.MAX_VALUE & (int) (local1889 >>> 32)).anInt4428;
					}
					if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
						local1950 = local62.method3428(arg9, local165, local153, 4, local199, local213, arg1, null, local330, local173);
						if (GlRenderer.enabled && local330) {
							Static242.method4211(local1950.aClass36_Sub1_3, local165 - Static34.anIntArray80[arg9] * 8, local201, local173 - Static238.anIntArray469[arg9] * 8);
						}
						local1934 = local1950.aClass8_10;
					} else {
						local1934 = new Loc(arg5, 4, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
					}
					Static91.method1880(arg2, arg7, arg8, local199, local1934, null, Static267.anIntArray517[arg9], 0, local1226 * Static34.anIntArray80[arg9], Static238.anIntArray469[arg9] * local1226, local261);
				} else if (arg6 == 6) {
					local1226 = 8;
					local1889 = Static265.method4521(arg2, arg7, arg8);
					if (local1889 != 0L) {
						local1226 = Static271.method4601(Integer.MAX_VALUE & (int) (local1889 >>> 32)).anInt4428 / 2;
					}
					if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
						local1950 = local62.method3428(arg9 + 4, local165, local153, 4, local199, local213, arg1, null, local330, local173);
						if (GlRenderer.enabled && local330) {
							Static242.method4211(local1950.aClass36_Sub1_3, local165 - Static114.anIntArray565[arg9] * 8, local201, local173 - Static64.anIntArray154[arg9] * 8);
						}
						local1934 = local1950.aClass8_10;
					} else {
						local1934 = new Loc(arg5, 4, arg9 + 4, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
					}
					Static91.method1880(arg2, arg7, arg8, local199, local1934, null, 256, arg9, local1226 * Static114.anIntArray565[arg9], local1226 * Static64.anIntArray154[arg9], local261);
				} else if (arg6 == 7) {
					@Pc(2137) int local2137 = arg9 + 2 & 0x3;
					if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
						@Pc(2183) Class139 local2183 = local62.method3428(local2137 + 4, local165, local153, 4, local199, local213, arg1, null, local330, local173);
						if (GlRenderer.enabled && local330) {
							Static242.method4211(local2183.aClass36_Sub1_3, local165, local201, local173);
						}
						local387 = local2183.aClass8_10;
					} else {
						local387 = new Loc(arg5, 4, local2137 + 4, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
					}
					Static91.method1880(arg2, arg7, arg8, local199, local387, null, 256, local2137, 0, 0, local261);
				} else if (arg6 == 8) {
					local1226 = 8;
					local1889 = Static265.method4521(arg2, arg7, arg8);
					if (local1889 != 0L) {
						local1226 = Static271.method4601(Integer.MAX_VALUE & (int) (local1889 >>> 32)).anInt4428 / 2;
					}
					@Pc(2244) int local2244 = arg9 + 2 & 0x3;
					@Pc(2289) Entity local2289;
					if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
						@Pc(2297) int local2297 = Static64.anIntArray154[arg9] * 8;
						@Pc(2303) int local2303 = Static114.anIntArray565[arg9] * 8;
						@Pc(2319) Class139 local2319 = local62.method3428(arg9 + 4, local165, local153, 4, local199, local213, arg1, null, local330, local173);
						if (GlRenderer.enabled && local330) {
							Static242.method4211(local2319.aClass36_Sub1_3, local165 - local2303, local201, local173 - local2297);
						}
						local1934 = local2319.aClass8_10;
						local2319 = local62.method3428(local2244 + 4, local165, local153, 4, local199, local213, arg1, null, local330, local173);
						if (GlRenderer.enabled && local330) {
							Static242.method4211(local2319.aClass36_Sub1_3, local165 - local2303, local201, local173 - local2297);
						}
						local2289 = local2319.aClass8_10;
					} else {
						local1934 = new Loc(arg5, 4, arg9 + 4, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
						local2289 = new Loc(arg5, 4, local2244 + 4, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
					}
					Static91.method1880(arg2, arg7, arg8, local199, local1934, local2289, 256, arg9, local1226 * Static114.anIntArray565[arg9], Static64.anIntArray154[arg9] * local1226, local261);
				}
			}
		}
	}
}
