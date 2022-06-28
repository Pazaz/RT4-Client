package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!wi", name = "hb", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][]{{true, true, true}, {false, false}, {false, true}, {true, false}, {false, true, true}, {true, false, true}, {false, true, false}, {true, false, false}};
	@OriginalMember(owner = "client!kc", name = "s", descriptor = "[I")
	public static final int[] anIntArray300 = new int[]{1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5};
	@OriginalMember(owner = "client!sh", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray35 = new int[][]{{0, 128, 0, 0, 128, 0, 128, 128}, {0, 128, 0, 0, 128, 0}, {0, 0, 64, 128, 0, 128}, {128, 128, 64, 128, 128, 0}, {0, 0, 128, 0, 128, 128, 64, 128}, {0, 128, 0, 0, 128, 0, 64, 128}, {64, 128, 0, 128, 0, 0, 64, 0}, {0, 0, 64, 0, 0, 64}, {128, 0, 128, 128, 0, 128, 0, 64, 64, 0}, {0, 128, 0, 0, 32, 64, 64, 96, 128, 128}, {0, 0, 128, 0, 128, 128, 64, 96, 32, 64}, {0, 0, 128, 0, 96, 32, 32, 32}};
	@OriginalMember(owner = "client!gf", name = "S", descriptor = "[I")
	public static final int[] anIntArray419 = new int[]{0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1};
	@OriginalMember(owner = "client!a", name = "h", descriptor = "I")
	public static int anInt5;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Lclient!na;")
	public static final JagString TITLE_SONG = JagString.parse("scape main");

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
	public static int anInt2882;
	@OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
	public static int anInt2884;
	@OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
	public static int anInt2428;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([[F[[F[[II[[F[[B[[II[[B[[B[[B[[[B)[Lclient!hg;")
	public static GlTile[] method2(@OriginalArg(0) float[][] arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) byte[][][] arg10) {
		@Pc(10) HashTable local10 = new HashTable(128);
		@Pc(12) int local12;
		@Pc(17) int local17;
		@Pc(30) int local30;
		@Pc(38) int local38;
		@Pc(131) int local131;
		@Pc(168) int local168;
		@Pc(143) int local143;
		@Pc(163) int local163;
		@Pc(153) int local153;
		@Pc(190) int local190;
		@Pc(180) int local180;
		@Pc(214) int local214;
		@Pc(202) int local202;
		@Pc(226) int local226;
		@Pc(274) byte local274;
		@Pc(299) int local299;
		@Pc(317) int local317;
		@Pc(127) int local127;
		@Pc(133) int local133;
		@Pc(777) int local777;
		@Pc(1035) int local1035;
		@Pc(1055) boolean[] local1055;
		@Pc(1068) boolean[] local1068;
		@Pc(1086) boolean[] local1086;
		for (local12 = 1; local12 <= 102; local12++) {
			for (local17 = 1; local17 <= 102; local17++) {
				local30 = arg8[local12][local17] & 0xFF;
				local38 = arg9[local12][local17] & 0xFF;
				if (local38 != 0) {
					@Pc(50) FloType local50 = FloTypeList.method4395(local38 - 1);
					if (local50.anInt5899 == -1) {
						continue;
					}
					@Pc(61) GlTile local61 = method4212(local10, local50);
					@Pc(67) byte local67 = arg7[local12][local17];
					@Pc(71) int[] local71 = anIntArrayArray35[local67];
					local61.anInt2482 += local71.length / 2;
					local61.anInt2484++;
					if (local50.aBoolean310 && local30 != 0) {
						local61.anInt2482 += anIntArray419[local67];
					}
				}
				if ((arg8[local12][local17] & 0xFF) != 0 || local38 != 0 && arg7[local12][local17] == 0) {
					local127 = 0;
					@Pc(129) int local129 = 0;
					local131 = 0;
					local133 = 0;
					local143 = arg9[local12][local17 + 1] & 0xFF;
					local153 = arg9[local12][local17 - 1] & 0xFF;
					local163 = arg9[local12 - 1][local17] & 0xFF;
					@Pc(166) int[] local166 = new int[8];
					local168 = 0;
					local180 = arg9[local12 - 1][local17 + 1] & 0xFF;
					local190 = arg9[local12 + 1][local17] & 0xFF;
					local202 = arg9[local12 + 1][local17 - 1] & 0xFF;
					local214 = arg9[local12 - 1][local17 - 1] & 0xFF;
					local226 = arg9[local12 + 1][local17 + 1] & 0xFF;
					@Pc(242) FloType local242;
					@Pc(264) byte local264;
					@Pc(287) int local287;
					if (local180 != 0 && local38 != local180) {
						local242 = FloTypeList.method4395(local180 - 1);
						if (local242.aBoolean310 && local242.anInt5899 != -1) {
							local264 = arg5[local12 - 1][local17 + 1];
							local274 = arg7[local12 - 1][local17 + 1];
							local287 = anIntArray300[local274 * 4 + (local264 + 2 & 0x3)];
							local299 = anIntArray300[(local264 + 3 & 0x3) + local274 * 4];
							if (!aBooleanArrayArray4[local299][1] || !aBooleanArrayArray4[local287][0]) {
								for (local317 = 0; local317 < 8; local317++) {
									if (local317 == 0) {
										local127++;
										local166[0] = local180;
										break;
									}
									if (local180 == local166[local317]) {
										break;
									}
								}
							}
						}
					}
					if (local214 != 0 && local214 != local38) {
						local242 = FloTypeList.method4395(local214 - 1);
						if (local242.aBoolean310 && local242.anInt5899 != -1) {
							local264 = arg5[local12 - 1][local17 - 1];
							local274 = arg7[local12 - 1][local17 - 1];
							local287 = anIntArray300[local274 * 4 + (local264 & 0x3)];
							local299 = anIntArray300[(local264 + 3 & 0x3) + local274 * 4];
							if (!aBooleanArrayArray4[local287][1] || !aBooleanArrayArray4[local299][0]) {
								for (local317 = 0; local317 < 8; local317++) {
									if (local127 == local317) {
										local166[local127++] = local214;
										break;
									}
									if (local166[local317] == local214) {
										break;
									}
								}
							}
						}
					}
					if (local202 != 0 && local38 != local202) {
						local242 = FloTypeList.method4395(local202 - 1);
						if (local242.aBoolean310 && local242.anInt5899 != -1) {
							local264 = arg5[local12 + 1][local17 - 1];
							local274 = arg7[local12 + 1][local17 - 1];
							local299 = anIntArray300[local274 * 4 + (local264 + 1 & 0x3)];
							local287 = anIntArray300[local274 * 4 + (local264 & 0x3)];
							if (!aBooleanArrayArray4[local299][1] || !aBooleanArrayArray4[local287][0]) {
								for (local317 = 0; local317 < 8; local317++) {
									if (local127 == local317) {
										local166[local127++] = local202;
										break;
									}
									if (local202 == local166[local317]) {
										break;
									}
								}
							}
						}
					}
					if (local226 != 0 && local226 != local38) {
						local242 = FloTypeList.method4395(local226 - 1);
						if (local242.aBoolean310 && local242.anInt5899 != -1) {
							local264 = arg5[local12 + 1][local17 + 1];
							local274 = arg7[local12 + 1][local17 + 1];
							local299 = anIntArray300[local274 * 4 + (local264 + 1 & 0x3)];
							local287 = anIntArray300[local274 * 4 + (local264 + 2 & 0x3)];
							if (!aBooleanArrayArray4[local287][1] || !aBooleanArrayArray4[local299][0]) {
								for (local317 = 0; local317 < 8; local317++) {
									if (local127 == local317) {
										local166[local127++] = local226;
										break;
									}
									if (local226 == local166[local317]) {
										break;
									}
								}
							}
						}
					}
					if (local143 != 0 && local38 != local143) {
						local242 = FloTypeList.method4395(local143 - 1);
						if (local242.aBoolean310 && local242.anInt5899 != -1) {
							local129 = anIntArray300[arg7[local12][local17 + 1] * 4 + (arg5[local12][local17 + 1] + 2 & 0x3)];
							for (local777 = 0; local777 < 8; local777++) {
								if (local127 == local777) {
									local166[local127++] = local143;
									break;
								}
								if (local166[local777] == local143) {
									break;
								}
							}
						}
					}
					if (local163 != 0 && local38 != local163) {
						local242 = FloTypeList.method4395(local163 - 1);
						if (local242.aBoolean310 && local242.anInt5899 != -1) {
							local133 = anIntArray300[(arg5[local12 - 1][local17] + 3 & 0x3) + arg7[local12 - 1][local17] * 4];
							for (local777 = 0; local777 < 8; local777++) {
								if (local127 == local777) {
									local166[local127++] = local163;
									break;
								}
								if (local163 == local166[local777]) {
									break;
								}
							}
						}
					}
					if (local153 != 0 && local38 != local153) {
						local242 = FloTypeList.method4395(local153 - 1);
						if (local242.aBoolean310 && local242.anInt5899 != -1) {
							local131 = anIntArray300[(arg5[local12][local17 - 1] & 0x3) + arg7[local12][local17 - 1] * 4];
							for (local777 = 0; local777 < 8; local777++) {
								if (local777 == local127) {
									local166[local127++] = local153;
									break;
								}
								if (local153 == local166[local777]) {
									break;
								}
							}
						}
					}
					if (local190 != 0 && local38 != local190) {
						local242 = FloTypeList.method4395(local190 - 1);
						if (local242.aBoolean310 && local242.anInt5899 != -1) {
							local168 = anIntArray300[(arg5[local12 + 1][local17] + 1 & 0x3) + arg7[local12 + 1][local17] * 4];
							for (local777 = 0; local777 < 8; local777++) {
								if (local127 == local777) {
									local166[local127++] = local190;
									break;
								}
								if (local166[local777] == local190) {
									break;
								}
							}
						}
					}
					for (local1035 = 0; local1035 < local127; local1035++) {
						local777 = local166[local1035];
						local1055 = aBooleanArrayArray4[local163 == local777 ? local133 : 0];
						local1068 = aBooleanArrayArray4[local777 == local153 ? local131 : 0];
						@Pc(1077) boolean[] local1077 = aBooleanArrayArray4[local143 == local777 ? local129 : 0];
						local1086 = aBooleanArrayArray4[local190 == local777 ? local168 : 0];
						@Pc(1092) FloType local1092 = FloTypeList.method4395(local777 - 1);
						@Pc(1097) GlTile local1097 = method4212(local10, local1092);
						local1097.anInt2482 += 5;
						local1097.anInt2482 += local1077.length - 2;
						local1097.anInt2482 += local1055.length - 2;
						local1097.anInt2482 += local1068.length - 2;
						local1097.anInt2482 += local1086.length - 2;
						local1097.anInt2484++;
					}
				}
			}
		}
		@Pc(1161) GlTile local1161;
		for (local1161 = (GlTile) local10.head(); local1161 != null; local1161 = (GlTile) local10.next()) {
			local1161.method1940();
		}
		for (local12 = 1; local12 <= 102; local12++) {
			for (local17 = 1; local17 <= 102; local17++) {
				local38 = arg8[local12][local17] & 0xFF;
				local127 = arg9[local12][local17] & 0xFF;
				if ((arg10[arg3][local12][local17] & 0x8) != 0) {
					local30 = 0;
				} else if ((arg10[1][local12][local17] & 0x2) == 2 && arg3 > 0) {
					local30 = arg3 - 1;
				} else {
					local30 = arg3;
				}
				if (local127 != 0) {
					@Pc(1250) FloType local1250 = FloTypeList.method4395(local127 - 1);
					if (local1250.anInt5899 == -1) {
						continue;
					}
					@Pc(1261) GlTile local1261 = method4212(local10, local1250);
					@Pc(1267) byte local1267 = arg7[local12][local17];
					@Pc(1273) byte local1273 = arg5[local12][local17];
					local168 = method588(local1250.texture, local1250.anInt5899, arg6[local12][local17]);
					local143 = method588(local1250.texture, local1250.anInt5899, arg6[local12 + 1][local17]);
					local163 = method588(local1250.texture, local1250.anInt5899, arg6[local12 + 1][local17 + 1]);
					local153 = method588(local1250.texture, local1250.anInt5899, arg6[local12][local17 + 1]);
					method1324(local168, arg2, arg1, local12, arg0, local143, local1273, local30, local163, local38 != 0 && local1250.aBoolean310, local1267, local17, arg4, local153, local1261);
				}
				if ((arg8[local12][local17] & 0xFF) != 0 || local127 != 0 && arg7[local12][local17] == 0) {
					@Pc(1382) int[] local1382 = new int[8];
					local133 = 0;
					@Pc(1386) int local1386 = 0;
					local131 = 0;
					local168 = 0;
					local163 = arg9[local12][local17 + 1] & 0xFF;
					local143 = 0;
					local153 = arg9[local12 - 1][local17] & 0xFF;
					local180 = arg9[local12 + 1][local17] & 0xFF;
					local190 = arg9[local12][local17 - 1] & 0xFF;
					local214 = arg9[local12 - 1][local17 + 1] & 0xFF;
					local202 = arg9[local12 - 1][local17 - 1] & 0xFF;
					local226 = arg9[local12 + 1][local17 - 1] & 0xFF;
					local1035 = arg9[local12 + 1][local17 + 1] & 0xFF;
					@Pc(1527) byte local1527;
					@Pc(1496) FloType local1496;
					@Pc(1571) int local1571;
					if (local214 == 0 || local214 == local127) {
						local214 = 0;
					} else {
						local1496 = FloTypeList.method4395(local214 - 1);
						if (local1496.aBoolean310 && local1496.anInt5899 != -1) {
							local274 = arg5[local12 - 1][local17 + 1];
							local1527 = arg7[local12 - 1][local17 + 1];
							local299 = anIntArray300[local1527 * 4 + (local274 + 2 & 0x3)];
							local317 = anIntArray300[local1527 * 4 + (local274 + 3 & 0x3)];
							if (aBooleanArrayArray4[local317][1] && aBooleanArrayArray4[local299][0]) {
								local214 = 0;
							} else {
								for (local1571 = 0; local1571 < 8; local1571++) {
									if (local1571 == 0) {
										local1386++;
										local1382[0] = local214;
										break;
									}
									if (local1382[local1571] == local214) {
										break;
									}
								}
							}
						} else {
							local214 = 0;
						}
					}
					if (local202 == 0 || local127 == local202) {
						local202 = 0;
					} else {
						local1496 = FloTypeList.method4395(local202 - 1);
						if (local1496.aBoolean310 && local1496.anInt5899 != -1) {
							local274 = arg5[local12 - 1][local17 - 1];
							local1527 = arg7[local12 - 1][local17 - 1];
							local299 = anIntArray300[(local274 & 0x3) + local1527 * 4];
							local317 = anIntArray300[(local274 + 3 & 0x3) + local1527 * 4];
							if (aBooleanArrayArray4[local299][1] && aBooleanArrayArray4[local317][0]) {
								local202 = 0;
							} else {
								for (local1571 = 0; local1571 < 8; local1571++) {
									if (local1571 == local1386) {
										local1382[local1386++] = local202;
										break;
									}
									if (local202 == local1382[local1571]) {
										break;
									}
								}
							}
						} else {
							local202 = 0;
						}
					}
					if (local226 == 0 || local226 == local127) {
						local226 = 0;
					} else {
						local1496 = FloTypeList.method4395(local226 - 1);
						if (local1496.aBoolean310 && local1496.anInt5899 != -1) {
							local274 = arg5[local12 + 1][local17 - 1];
							local1527 = arg7[local12 + 1][local17 - 1];
							local317 = anIntArray300[(local274 + 1 & 0x3) + local1527 * 4];
							local299 = anIntArray300[local1527 * 4 + (local274 & 0x3)];
							if (aBooleanArrayArray4[local317][1] && aBooleanArrayArray4[local299][0]) {
								local226 = 0;
							} else {
								for (local1571 = 0; local1571 < 8; local1571++) {
									if (local1571 == local1386) {
										local1382[local1386++] = local226;
										break;
									}
									if (local1382[local1571] == local226) {
										break;
									}
								}
							}
						} else {
							local226 = 0;
						}
					}
					if (local1035 == 0 || local127 == local1035) {
						local1035 = 0;
					} else {
						local1496 = FloTypeList.method4395(local1035 - 1);
						if (local1496.aBoolean310 && local1496.anInt5899 != -1) {
							local1527 = arg7[local12 + 1][local17 + 1];
							local274 = arg5[local12 + 1][local17 + 1];
							local299 = anIntArray300[(local274 + 2 & 0x3) + local1527 * 4];
							local317 = anIntArray300[(local274 + 1 & 0x3) + local1527 * 4];
							if (aBooleanArrayArray4[local299][1] && aBooleanArrayArray4[local317][0]) {
								local1035 = 0;
							} else {
								for (local1571 = 0; local1571 < 8; local1571++) {
									if (local1571 == local1386) {
										local1382[local1386++] = local1035;
										break;
									}
									if (local1382[local1571] == local1035) {
										break;
									}
								}
							}
						} else {
							local1035 = 0;
						}
					}
					@Pc(2003) int local2003;
					if (local163 != 0 && local163 != local127) {
						local1496 = FloTypeList.method4395(local163 - 1);
						if (local1496.aBoolean310 && local1496.anInt5899 != -1) {
							local133 = anIntArray300[arg7[local12][local17 + 1] * 4 + (arg5[local12][local17 + 1] + 2 & 0x3)];
							for (local2003 = 0; local2003 < 8; local2003++) {
								if (local2003 == local1386) {
									local1382[local1386++] = local163;
									break;
								}
								if (local1382[local2003] == local163) {
									break;
								}
							}
						}
					}
					if (local153 != 0 && local127 != local153) {
						local1496 = FloTypeList.method4395(local153 - 1);
						if (local1496.aBoolean310 && local1496.anInt5899 != -1) {
							local131 = anIntArray300[(arg5[local12 - 1][local17] + 3 & 0x3) + arg7[local12 - 1][local17] * 4];
							for (local2003 = 0; local2003 < 8; local2003++) {
								if (local1386 == local2003) {
									local1382[local1386++] = local153;
									break;
								}
								if (local153 == local1382[local2003]) {
									break;
								}
							}
						}
					}
					if (local190 != 0 && local190 != local127) {
						local1496 = FloTypeList.method4395(local190 - 1);
						if (local1496.aBoolean310 && local1496.anInt5899 != -1) {
							local168 = anIntArray300[(arg5[local12][local17 - 1] & 0x3) + arg7[local12][local17 - 1] * 4];
							for (local2003 = 0; local2003 < 8; local2003++) {
								if (local1386 == local2003) {
									local1382[local1386++] = local190;
									break;
								}
								if (local190 == local1382[local2003]) {
									break;
								}
							}
						}
					}
					if (local180 != 0 && local180 != local127) {
						local1496 = FloTypeList.method4395(local180 - 1);
						if (local1496.aBoolean310 && local1496.anInt5899 != -1) {
							local143 = anIntArray300[arg7[local12 + 1][local17] * 4 + (arg5[local12 + 1][local17] + 1 & 0x3)];
							for (local2003 = 0; local2003 < 8; local2003++) {
								if (local2003 == local1386) {
									local1382[local1386++] = local180;
									break;
								}
								if (local1382[local2003] == local180) {
									break;
								}
							}
						}
					}
					for (local777 = 0; local777 < local1386; local777++) {
						local2003 = local1382[local777];
						local1055 = aBooleanArrayArray4[local2003 == local163 ? local133 : 0];
						local1068 = aBooleanArrayArray4[local153 == local2003 ? local131 : 0];
						local1086 = aBooleanArrayArray4[local2003 == local190 ? local168 : 0];
						@Pc(2318) boolean[] local2318 = aBooleanArrayArray4[local2003 == local180 ? local143 : 0];
						@Pc(2324) FloType local2324 = FloTypeList.method4395(local2003 - 1);
						@Pc(2329) GlTile local2329 = method4212(local10, local2324);
						@Pc(2345) int local2345 = method588(local2324.texture, local2324.anInt5899, arg6[local12][local17]) << 8 | 0xFF;
						@Pc(2365) int local2365 = method588(local2324.texture, local2324.anInt5899, arg6[local12 + 1][local17]) << 8 | 0xFF;
						@Pc(2385) int local2385 = method588(local2324.texture, local2324.anInt5899, arg6[local12 + 1][local17 + 1]) << 8 | 0xFF;
						@Pc(2403) int local2403 = method588(local2324.texture, local2324.anInt5899, arg6[local12][local17 + 1]) << 8 | 0xFF;
						@Pc(2422) boolean local2422 = local2003 != local202 && local1086[0] && local1068[1];
						@Pc(2441) boolean local2441 = local2003 != local1035 && local1055[0] && local2318[1];
						@Pc(2456) boolean local2456 = local214 != local2003 && local1068[0] && local1055[1];
						@Pc(2463) int local2463 = local1055.length + 6 - 2;
						@Pc(2482) boolean local2482 = local2003 != local226 && local2318[0] && local1086[1];
						@Pc(2489) int local2489 = local2463 + local1068.length - 2;
						@Pc(2496) int local2496 = local2489 + local1086.length - 2;
						@Pc(2503) int local2503 = local2496 + local2318.length - 2;
						@Pc(2524) int local2524 = method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, true, local2329, arg1, local17, 64, arg0, 64);
						@Pc(2527) int[] local2527 = new int[local2503];
						@Pc(2529) byte local2529 = 0;
						@Pc(2550) int local2550 = method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, local2456, local2329, arg1, local17, 0, arg0, 128);
						@Pc(2571) int local2571 = method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, local2441, local2329, arg1, local17, 128, arg0, 128);
						@Pc(2592) int local2592 = method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, local2422, local2329, arg1, local17, 0, arg0, 0);
						@Pc(2613) int local2613 = method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, local2482, local2329, arg1, local17, 128, arg0, 0);
						@Pc(2616) int local2616 = local2529 + 1;
						local2527[0] = local2524;
						@Pc(2621) int local2621 = local2616 + 1;
						local2527[1] = local2571;
						if (local1055.length > 2) {
							local2621++;
							local2527[2] = method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, local1055[2], local2329, arg1, local17, 64, arg0, 128);
						}
						local2527[local2621++] = local2550;
						if (local1068.length > 2) {
							local2527[local2621++] = method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, local1068[2], local2329, arg1, local17, 0, arg0, 64);
						}
						local2527[local2621++] = local2592;
						if (local1086.length > 2) {
							local2527[local2621++] = method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, local1086[2], local2329, arg1, local17, 64, arg0, 0);
						}
						local2527[local2621++] = local2613;
						if (local2318.length > 2) {
							local2527[local2621++] = method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, local2318[2], local2329, arg1, local17, 128, arg0, 64);
						}
						local2527[local2621++] = local2571;
						local2329.method1945(local30, local12, local17, local2527, null, true);
					}
				}
			}
		}
		for (local1161 = (GlTile) local10.head(); local1161 != null; local1161 = (GlTile) local10.next()) {
			if (local1161.anInt2483 == 0) {
				local1161.unlink();
			} else {
				local1161.method1943();
			}
		}
		local12 = local10.size();
		@Pc(2823) GlTile[] local2823 = new GlTile[local12];
		@Pc(2826) long[] local2826 = new long[local12];
		local10.method3865(local2823);
		for (local38 = 0; local38 < local12; local38++) {
			local2826[local38] = local2823[local38].key;
		}
		Static4.method23(local2826, local2823);
		return local2823;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIII)V")
	public static void method4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (GlRenderer.enabled) {
			GlRaster.setClip(arg0, arg3, arg2 + arg0, arg1 + arg3);
			GlRaster.fillRect(arg0, arg3, arg2, arg1, 0);
		} else {
			SoftwareRaster.setClip(arg0, arg3, arg2 + arg0, arg3 + arg1);
			SoftwareRaster.fillRect(arg0, arg3, arg2, arg1, 0);
		}
		if (WorldMap.loadPercentage < 100) {
			return;
		}
		if (WorldMap.aClass3_Sub2_Sub1_2 == null || arg2 != WorldMap.aClass3_Sub2_Sub1_2.width || WorldMap.aClass3_Sub2_Sub1_2.height != arg1) {
			@Pc(63) SoftwareSprite local63 = new SoftwareSprite(arg2, arg1);
			SoftwareRaster.setSize(local63.pixels, arg2, arg1);
			WorldMap.method4364(arg2, 0, WorldMap.width, 0, 0, WorldMap.length, arg1, 0);
			if (GlRenderer.enabled) {
				WorldMap.aClass3_Sub2_Sub1_2 = new GlSprite(local63);
			} else {
				WorldMap.aClass3_Sub2_Sub1_2 = local63;
			}
			if (GlRenderer.enabled) {
				SoftwareRaster.pixels = null;
			} else {
				SoftwareRaster.frameBuffer.makeTarget();
			}
		}
		WorldMap.aClass3_Sub2_Sub1_2.drawPixels(arg0, arg3);
		@Pc(147) int local147 = arg1 * anInt2884 / WorldMap.length + arg3;
		@Pc(153) int local153 = WorldMap.anInt1176 * arg1 / WorldMap.length;
		@Pc(161) int local161 = arg0 + arg2 * anInt2882 / WorldMap.width;
		@Pc(167) int local167 = arg2 * WorldMap.anInt2387 / WorldMap.width;
		@Pc(169) int local169 = 16711680;
		if (client.game == 1) {
			local169 = 16777215;
		}
		if (GlRenderer.enabled) {
			GlRaster.fillRectAlpha(local161, local147, local167, local153, local169, 128);
			GlRaster.drawRect(local161, local147, local167, local153, local169);
		} else {
			SoftwareRaster.fillRectAlpha(local161, local147, local167, local153, local169, 128);
			SoftwareRaster.drawRect(local161, local147, local167, local153, local169);
		}
		if (WorldMap.anInt1864 <= 0) {
			return;
		}
		@Pc(225) int local225;
		if (anInt2428 > 10) {
			local225 = (20 - anInt2428) * 25;
		} else {
			local225 = anInt2428 * 25;
		}
		for (@Pc(238) MapElement local238 = (MapElement) WorldMap.mapElements.head(); local238 != null; local238 = (MapElement) WorldMap.mapElements.next()) {
			if (local238.id == Static9.anInt172) {
				@Pc(258) int local258 = arg3 + local238.anInt4314 * arg1 / WorldMap.length;
				@Pc(267) int local267 = arg2 * local238.anInt4307 / WorldMap.width + arg0;
				if (GlRenderer.enabled) {
					GlRaster.fillRectAlpha(local267 - 2, local258 + -2, 4, 4, 16776960, local225);
				} else {
					SoftwareRaster.fillRectAlpha(local267 - 2, local258 + -2, 4, 4, 16776960, local225);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!sc;ZLclient!wl;)Lclient!hg;")
	public static GlTile method4212(@OriginalArg(0) HashTable arg0, @OriginalArg(2) FloType arg1) {
		@Pc(23) long local23 = (long) ((arg1.texture + 1 << 16) + arg1.anInt5885) + ((long) arg1.anInt5897 << 56) + ((long) arg1.anInt5889 << 32);
		@Pc(38) GlTile local38 = (GlTile) arg0.get(local23);
		if (local38 == null) {
			local38 = new GlTile(arg1.texture, (float) arg1.anInt5885, true, false, arg1.anInt5889);
			arg0.put(local38, local23);
		}
		return local38;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIBI)I")
	public static int method588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int local19 = Rasteriser.palette[SoftwareModel.method4585(arg1, arg2)];
		if (arg0 > 0) {
			@Pc(31) int local31 = Rasteriser.textureProvider.method3238(arg0 & 0xFFFF);
			@Pc(49) int local49;
			@Pc(73) int local73;
			if (local31 != 0) {
				if (arg2 < 0) {
					local49 = 0;
				} else if (arg2 > 127) {
					local49 = 16777215;
				} else {
					local49 = arg2 * 131586;
				}
				if (local31 == 256) {
					local19 = local49;
				} else {
					local73 = 256 - local31;
					local19 = ((local49 & 0xFF00) * local31 + local73 * (local19 & 0xFF00) & 0xFF0000) + (local31 * (local49 & 0xFF00FF) + ((local19 & 0xFF00FF) * local73) & 0xFF00FF00) >> 8;
				}
			}
			local49 = Rasteriser.textureProvider.method3229(arg0 & 0xFFFF);
			if (local49 != 0) {
				local49 += 256;
				@Pc(125) int local125 = (local19 >> 16 & 0xFF) * local49;
				if (local125 > 65535) {
					local125 = 65535;
				}
				local73 = (local19 >> 8 & 0xFF) * local49;
				if (local73 > 65535) {
					local73 = 65535;
				}
				@Pc(150) int local150 = local49 * (local19 & 0xFF);
				if (local150 > 65535) {
					local150 = 65535;
				}
				local19 = (local150 >> 8) + (local73 & 0xFF00) + (local125 << 8 & 0xFF001F);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[[I[[FI[[FIBIIBZBI[[FILclient!hg;)V")
	public static void method1324(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) float[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) byte arg10, @OriginalArg(12) int arg11, @OriginalArg(13) float[][] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) GlTile arg14) {
		@Pc(11) int local11 = (arg0 << 8) + 255;
		@Pc(17) int local17 = (arg5 << 8) + 255;
		@Pc(23) int local23 = (arg8 << 8) + 255;
		@Pc(29) int local29 = (arg13 << 8) + 255;
		@Pc(33) int[] local33 = anIntArrayArray35[arg10];
		@Pc(39) int[] local39 = new int[local33.length >> 1];
		@Pc(41) int local41;
		for (local41 = 0; local41 < local39.length; local41++) {
			local39[local41] = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, false, arg14, arg2, arg11, local33[local41 + local41], arg4, local33[local41 + local41 + 1]);
		}
		@Pc(87) int[] local87 = null;
		if (arg9) {
			@Pc(191) int local191;
			if (arg10 == 1) {
				local41 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 64, arg4, 128);
				local191 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 128, arg4, 64);
				local87 = new int[]{local191, local41, local39[2], local41, local39[0], local39[2]};
			} else if (arg10 == 2) {
				local87 = new int[6];
				local41 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 128, arg4, 128);
				local191 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 64, arg4, 0);
				local87[2] = local41;
				local87[0] = local39[0];
				local87[5] = local39[0];
				local87[3] = local41;
				local87[1] = local191;
				local87[4] = local39[1];
			} else if (arg10 == 3) {
				local87 = new int[6];
				local41 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 0, arg4, 128);
				local191 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 64, arg4, 0);
				local87[4] = local191;
				local87[1] = local39[1];
				local87[0] = local39[2];
				local87[3] = local41;
				local87[2] = local41;
				local87[5] = local39[2];
			} else if (arg10 == 4) {
				local87 = new int[3];
				local41 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 0, arg4, 128);
				local87[0] = local39[3];
				local87[2] = local39[0];
				local87[1] = local41;
			} else if (arg10 == 5) {
				local87 = new int[3];
				local41 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 128, arg4, 128);
				local87[1] = local41;
				local87[0] = local39[2];
				local87[2] = local39[3];
			} else if (arg10 == 6) {
				local87 = new int[6];
				local41 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 128, arg4, 0);
				local191 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 128, arg4, 128);
				local87[1] = local41;
				local87[0] = local39[3];
				local87[2] = local191;
				local87[4] = local39[0];
				local87[3] = local191;
				local87[5] = local39[3];
			} else if (arg10 == 7) {
				local87 = new int[6];
				local41 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 0, arg4, 128);
				local191 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 128, arg4, 0);
				local87[3] = local41;
				local87[2] = local41;
				local87[0] = local39[1];
				local87[4] = local39[2];
				local87[1] = local191;
				local87[5] = local39[1];
			} else if (arg10 == 8) {
				local87 = new int[3];
				local41 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 0, arg4, 0);
				local87[2] = local39[4];
				local87[0] = local39[3];
				local87[1] = local41;
			} else if (arg10 == 9) {
				local41 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 128, arg4, 64);
				local191 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 96, arg4, 32);
				@Pc(715) int local715 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 64, arg4, 0);
				local87 = new int[]{local191, local41, local39[4], local191, local39[4], local39[3], local191, local39[3], local39[2], local191, local39[2], local39[1], local191, local39[1], local715};
			} else if (arg10 == 10) {
				local87 = new int[9];
				local41 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 0, arg4, 128);
				local87[0] = local39[2];
				local87[8] = local39[0];
				local87[1] = local41;
				local87[4] = local41;
				local87[2] = local39[3];
				local87[7] = local41;
				local87[3] = local39[3];
				local87[5] = local39[4];
				local87[6] = local39[4];
			} else if (arg10 == 11) {
				local87 = new int[12];
				local41 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 0, arg4, 64);
				local191 = method3683(local29, 0.0F, local11, local17, null, arg1, arg3, arg12, local23, arg6, true, arg14, arg2, arg11, 128, arg4, 64);
				local87[5] = local41;
				local87[1] = local41;
				local87[8] = local41;
				local87[0] = local39[3];
				local87[2] = local39[0];
				local87[11] = local191;
				local87[6] = local39[2];
				local87[7] = local191;
				local87[10] = local39[1];
				local87[3] = local39[3];
				local87[4] = local39[2];
				local87[9] = local39[2];
			}
		}
		arg14.method1945(arg7, arg3, arg11, local39, local87, false);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IFII[[I[[II[[FIBIZLclient!hg;[[FII[[FI)I")
	public static int method3683(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[][] arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) GlTile arg11, @OriginalArg(13) float[][] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) float[][] arg15, @OriginalArg(17) int arg16) {
		@Pc(20) int local20;
		if (arg9 == 1) {
			local20 = arg14;
			arg14 = arg16;
			arg16 = 128 - local20;
		} else if (arg9 == 2) {
			arg16 = 128 - arg16;
			arg14 = 128 - arg14;
		} else if (arg9 == 3) {
			local20 = arg14;
			arg14 = 128 - arg16;
			arg16 = local20;
		}
		@Pc(66) float local66;
		@Pc(72) float local72;
		@Pc(80) int local80;
		@Pc(78) float local78;
		if (arg14 == 0 && arg16 == 0) {
			local66 = arg15[arg6][arg13];
			local72 = arg7[arg6][arg13];
			local78 = arg12[arg6][arg13];
			local80 = arg2;
		} else if (arg14 == 128 && arg16 == 0) {
			local80 = arg3;
			local66 = arg15[arg6 + 1][arg13];
			local72 = arg7[arg6 + 1][arg13];
			local78 = arg12[arg6 + 1][arg13];
		} else if (arg14 == 128 && arg16 == 128) {
			local72 = arg7[arg6 + 1][arg13 + 1];
			local78 = arg12[arg6 + 1][arg13 + 1];
			local66 = arg15[arg6 + 1][arg13 + 1];
			local80 = arg8;
		} else if (arg14 == 0 && arg16 == 128) {
			local72 = arg7[arg6][arg13 + 1];
			local66 = arg15[arg6][arg13 + 1];
			local78 = arg12[arg6][arg13 + 1];
			local80 = arg0;
		} else {
			local78 = arg12[arg6][arg13];
			local66 = arg15[arg6][arg13];
			@Pc(219) float local219 = (float) arg16 / 128.0F;
			@Pc(224) float local224 = (float) arg14 / 128.0F;
			@Pc(238) float local238 = local78 + (arg12[arg6 + 1][arg13] - local78) * local224;
			@Pc(253) float local253 = local66 + (arg15[arg6 + 1][arg13] - local66) * local224;
			@Pc(261) float local261 = arg12[arg6][arg13 + 1];
			@Pc(269) float local269 = arg15[arg6][arg13 + 1];
			@Pc(286) float local286 = local269 + (arg15[arg6 + 1][arg13 + 1] - local269) * local224;
			local72 = arg7[arg6][arg13];
			local66 = local253 + local219 * (local286 - local253);
			@Pc(309) float local309 = arg7[arg6][arg13 + 1];
			@Pc(326) float local326 = local261 + (arg12[arg6 + 1][arg13 + 1] - local261) * local224;
			local78 = local238 + local219 * (local326 - local238);
			@Pc(352) float local352 = local309 + (arg7[arg6 + 1][arg13 + 1] - local309) * local224;
			@Pc(367) float local367 = local72 + (arg7[arg6 + 1][arg13] - local72) * local224;
			local72 = local367 + (local352 - local367) * local219;
			@Pc(382) int local382 = Static69.method1540(arg14, arg2, arg3);
			@Pc(388) int local388 = Static69.method1540(arg14, arg0, arg8);
			local80 = Static69.method1540(arg16, local382, local388);
		}
		@Pc(405) int local405 = arg16 + (arg13 << 7);
		@Pc(413) int local413 = Static182.method3361(arg14, arg13, arg5, arg6, arg16);
		@Pc(420) int local420 = (arg6 << 7) + arg14;
		return arg11.method1941(local420, local413, local405, local78, local66, local72, arg10 ? local80 & 0xFFFFFF00 : local80, arg4 == null ? 0.0F : (float) (local413 - Static182.method3361(arg14, arg13, arg4, arg6, arg16)) / arg1);
	}
}
