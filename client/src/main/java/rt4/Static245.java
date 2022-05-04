package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
	public static int anInt5375;

	@OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
	public static int anInt5377 = 0;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)V")
	public static void method4224(@OriginalArg(0) int arg0) {
		@Pc(16) DelayedStateChange local16 = Static238.method4143(6, arg0);
		local16.pushClient();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(III[Lclient!mj;IB[BIIIZ)V")
	public static void method4228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) CollisionMap[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		@Pc(17) int local17;
		if (!arg9) {
			for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
				for (local17 = 0; local17 < 8; local17++) {
					if (arg1 + local10 > 0 && local10 + arg1 < 103 && local17 + arg4 > 0 && arg4 + local17 < 103) {
						arg3[arg2].flags[local10 + arg1][local17 + arg4] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(87) byte local87;
		if (arg9) {
			local87 = 1;
		} else {
			local87 = 4;
		}
		@Pc(96) Buffer local96 = new Buffer(arg5);
		@Pc(103) int local103;
		@Pc(108) int local108;
		for (local17 = 0; local17 < local87; local17++) {
			for (local103 = 0; local103 < 64; local103++) {
				for (local108 = 0; local108 < 64; local108++) {
					if (arg6 == local17 && arg8 <= local103 && arg8 + 8 > local103 && arg7 <= local108 && local108 < arg7 + 8) {
						Static278.readTile(0, 0, arg9, local96, Static202.method3659(arg0, local103 & 0x7, local108 & 0x7) + arg4, Static214.method4360(arg0, local108 & 0x7, local103 & 0x7) + arg1, arg0, arg2);
					} else {
						Static278.readTile(0, 0, arg9, local96, -1, -1, 0, 0);
					}
				}
			}
		}
		@Pc(232) int local232;
		@Pc(417) int local417;
		@Pc(255) int local255;
		@Pc(266) int local266;
		@Pc(316) int local316;
		while (local96.data.length > local96.offset) {
			local103 = local96.g1();
			if (local103 != 129) {
				local96.offset--;
				break;
			}
			for (local108 = 0; local108 < 4; local108++) {
				@Pc(223) byte local223 = local96.g1s();
				@Pc(237) int local237;
				if (local223 == 0) {
					if (local108 <= arg6) {
						local237 = arg1 + 7;
						local232 = arg1;
						local255 = arg4 + 7;
						if (local255 < 0) {
							local255 = 0;
						} else if (local255 >= 104) {
							local255 = 104;
						}
						if (local237 < 0) {
							local237 = 0;
						} else if (local237 >= 104) {
							local237 = 104;
						}
						local417 = arg4;
						if (arg4 < 0) {
							local417 = 0;
						} else if (arg4 >= 104) {
							local417 = 104;
						}
						if (arg1 < 0) {
							local232 = 0;
						} else if (arg1 >= 104) {
							local232 = 104;
						}
						while (local237 > local232) {
							while (local417 < local255) {
								Static232.aByteArrayArrayArray13[arg2][local232][local417] = 0;
								local417++;
							}
							local232++;
						}
					}
				} else if (local223 == 1) {
					for (local232 = 0; local232 < 64; local232 += 4) {
						for (local237 = 0; local237 < 64; local237 += 4) {
							@Pc(246) byte local246 = local96.g1s();
							if (local108 <= arg6) {
								for (local255 = local232; local255 < local232 + 4; local255++) {
									for (local266 = local237; local266 < local237 + 4; local266++) {
										if (local255 >= arg8 && local255 < arg8 + 8 && local266 >= arg7 && arg7 + 8 > arg7) {
											local316 = arg1 + Static214.method4360(arg0, local266 & 0x7, local255 & 0x7);
											@Pc(328) int local328 = Static202.method3659(arg0, local255 & 0x7, local266 & 0x7) + arg4;
											if (local316 >= 0 && local316 < 104 && local328 >= 0 && local328 < 104) {
												Static232.aByteArrayArrayArray13[arg2][local316][local328] = local246;
											}
										}
									}
								}
							}
						}
					}
				} else if (local223 == 2) {
				}
			}
		}
		@Pc(497) int local497;
		if (GlRenderer.enabled && !arg9) {
			@Pc(472) Environment local472 = null;
			label207: while (true) {
				label200: do {
					while (local96.data.length > local96.offset) {
						local108 = local96.g1();
						if (local108 != 0) {
							if (local108 != 1) {
								throw new IllegalStateException();
							}
							local497 = local96.g1();
							continue label200;
						}
						local472 = new Environment(local96);
					}
					if (local472 == null) {
						local472 = new Environment();
					}
					Static192.aClass92ArrayArray1[arg1 >> 3][arg4 >> 3] = local472;
					break label207;
				} while (local497 <= 0);
				for (local232 = 0; local232 < local497; local232++) {
					@Pc(517) Light local517 = new Light(local96);
					if (local517.anInt2243 == 31) {
						@Pc(529) LightType local529 = LightTypeList.get(local96.g2());
						local517.method1762(local529.anInt2865, local529.anInt2873, local529.anInt2867, local529.anInt2872);
					}
					local417 = local517.anInt2240 >> 7;
					local255 = local517.anInt2245 >> 7;
					if (arg6 == local517.anInt2241 && local417 >= arg8 && arg8 + 8 > local417 && arg7 <= local255 && arg7 + 8 > local255) {
						local266 = Static204.method3675(arg0, local517.anInt2240 & 0x3FF, local517.anInt2245 & 0x3FF) + (arg1 << 7);
						local316 = Static184.method3388(local517.anInt2240 & 0x3FF, arg0, local517.anInt2245 & 0x3FF) + (arg4 << 7);
						local517.anInt2240 = local266;
						local517.anInt2245 = local316;
						local417 = local517.anInt2240 >> 7;
						local255 = local517.anInt2245 >> 7;
						if (local417 >= 0 && local255 >= 0 && local417 < 104 && local255 < 104) {
							local517.aBoolean125 = (SceneGraph.tileFlags[1][local417][local255] & 0x2) != 0;
							local517.anInt2235 = SceneGraph.tileHeights[local517.anInt2241][local417][local255] - local517.anInt2235;
							Static120.method2389(local517);
						}
					}
				}
			}
		}
		local103 = arg1 + 7;
		local108 = arg4 + 7;
		for (local497 = arg1; local497 < local103; local497++) {
			for (local232 = arg4; local232 < local108; local232++) {
				Static232.aByteArrayArrayArray13[arg2][local497][local232] = 0;
			}
		}
	}
}
