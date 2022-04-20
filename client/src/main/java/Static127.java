import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!k", name = "j", descriptor = "I")
	public static int anInt3126;

	@OriginalMember(owner = "client!k", name = "l", descriptor = "[I")
	public static int[] anIntArray292;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "Z")
	public static boolean aBoolean159 = false;

	@OriginalMember(owner = "client!k", name = "i", descriptor = "I")
	public static int anInt3125 = 0;

	@OriginalMember(owner = "client!k", name = "m", descriptor = "Z")
	public static boolean aBoolean160 = false;

	@OriginalMember(owner = "client!k", name = "t", descriptor = "I")
	public static int anInt3132 = 0;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIBLclient!ve;Lclient!ve;)Lclient!rk;")
	public static Font method2462(@OriginalArg(1) int arg0, @OriginalArg(3) Js5 arg1, @OriginalArg(4) Js5 arg2) {
		return Static234.method4016(arg1, 0, arg0) ? Static29.method799(arg2.method4495(arg0, 0)) : null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIZIZ)V")
	public static void method2463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (Static80.anInt4701 == arg2 && arg1 == Static52.anInt1695 && (Static41.anInt1316 == arg0 || Static138.method2697())) {
			return;
		}
		Static80.anInt4701 = arg2;
		Static52.anInt1695 = arg1;
		Static41.anInt1316 = arg0;
		if (Static138.method2697()) {
			Static41.anInt1316 = 0;
		}
		if (arg4) {
			Static196.method3534(28);
		} else {
			Static196.method3534(25);
		}
		Static114.method4636(true, LocalizedText.LOADING);
		@Pc(53) int local53 = Static142.originZ;
		@Pc(55) int local55 = Static225.originX;
		Static142.originZ = arg1 * 8 - 48;
		Static225.originX = (arg2 - 6) * 8;
		Static158.aClass3_Sub2_Sub4_3 = Static29.method803(Static80.anInt4701 * 8, Static52.anInt1695 * 8);
		@Pc(81) int local81 = Static142.originZ - local53;
		@Pc(86) int local86 = Static225.originX - local55;
		Static235.aClass134_2 = null;
		@Pc(96) int local96;
		@Pc(103) Npc local103;
		@Pc(109) int local109;
		if (arg4) {
			Static272.anInt5214 = 0;
			for (local96 = 0; local96 < 32768; local96++) {
				local103 = Static175.aClass8_Sub4_Sub2Array1[local96];
				if (local103 != null) {
					local103.anInt3412 -= local86 * 128;
					local103.anInt3421 -= local81 * 128;
					if (local103.anInt3412 >= 0 && local103.anInt3412 <= 13184 && local103.anInt3421 >= 0 && local103.anInt3421 <= 13184) {
						for (local109 = 0; local109 < 10; local109++) {
							local103.movementQueueX[local109] -= local86;
							local103.movementQueueZ[local109] -= local81;
						}
						Static33.anIntArray79[Static272.anInt5214++] = local96;
					} else {
						Static175.aClass8_Sub4_Sub2Array1[local96].method2698(null);
						Static175.aClass8_Sub4_Sub2Array1[local96] = null;
					}
				}
			}
		} else {
			for (local96 = 0; local96 < 32768; local96++) {
				local103 = Static175.aClass8_Sub4_Sub2Array1[local96];
				if (local103 != null) {
					for (local109 = 0; local109 < 10; local109++) {
						local103.movementQueueX[local109] -= local86;
						local103.movementQueueZ[local109] -= local81;
					}
					local103.anInt3412 -= local86 * 128;
					local103.anInt3421 -= local81 * 128;
				}
			}
		}
		for (local96 = 0; local96 < 2048; local96++) {
			@Pc(265) Player local265 = Static159.aClass8_Sub4_Sub1Array1[local96];
			if (local265 != null) {
				for (local109 = 0; local109 < 10; local109++) {
					local265.movementQueueX[local109] -= local86;
					local265.movementQueueZ[local109] -= local81;
				}
				local265.anInt3412 -= local86 * 128;
				local265.anInt3421 -= local81 * 128;
			}
		}
		Static55.level = arg0;
		Static173.self.method1265(arg5, false, arg3);
		@Pc(322) byte local322 = 104;
		@Pc(324) byte local324 = 0;
		@Pc(326) byte local326 = 0;
		@Pc(328) byte local328 = 1;
		@Pc(330) byte local330 = 104;
		@Pc(332) byte local332 = 1;
		if (local81 < 0) {
			local328 = -1;
			local330 = -1;
			local326 = 103;
		}
		if (local86 < 0) {
			local332 = -1;
			local324 = 103;
			local322 = -1;
		}
		for (@Pc(358) int local358 = local324; local358 != local322; local358 += local332) {
			for (@Pc(367) int local367 = local326; local367 != local330; local367 += local328) {
				@Pc(378) int local378 = local86 + local358;
				@Pc(382) int local382 = local367 + local81;
				for (@Pc(384) int local384 = 0; local384 < 4; local384++) {
					if (local378 >= 0 && local382 >= 0 && local378 < 104 && local382 < 104) {
						Static159.aClass69ArrayArrayArray1[local384][local358][local367] = Static159.aClass69ArrayArrayArray1[local384][local378][local382];
					} else {
						Static159.aClass69ArrayArrayArray1[local384][local358][local367] = null;
					}
				}
			}
		}
		for (@Pc(451) Class3_Sub7 local451 = (Class3_Sub7) Static26.aClass69_27.method2289(); local451 != null; local451 = (Class3_Sub7) Static26.aClass69_27.method2288()) {
			local451.anInt916 -= local81;
			local451.anInt928 -= local86;
			if (local451.anInt928 < 0 || local451.anInt916 < 0 || local451.anInt928 >= 104 || local451.anInt916 >= 104) {
				local451.method4658();
			}
		}
		if (arg4) {
			Static138.anInt3439 -= local86 * 128;
			Static134.anInt3302 -= local81 * 128;
			Static248.anInt4232 -= local81;
			Static251.anInt5449 -= local86;
			Static265.anInt5765 -= local81;
			Static245.anInt5375 -= local86;
		} else {
			Static227.anInt5096 = 1;
		}
		Static189.anInt4451 = 0;
		if (Static115.anInt2939 != 0) {
			Static84.anInt2255 -= local81;
			Static115.anInt2939 -= local86;
		}
		if (GlRenderer.enabled && arg4 && (Math.abs(local86) > 104 || Math.abs(local81) > 104)) {
			Static86.method1799();
		}
		Static107.anInt2875 = -1;
		Static99.aClass69_64.method2278();
		Static217.aClass69_116.method2278();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)Lclient!da;")
	public static DelayedStateChange poll() {
		@Pc(10) DelayedStateChange local10 = (DelayedStateChange) Static215.aClass16_9.method795();
		if (local10 != null) {
			local10.method4658();
			local10.method4365();
			return local10;
		}
		do {
			local10 = (DelayedStateChange) Static140.aClass16_7.method795();
			if (local10 == null) {
				return null;
			}
			if (local10.method1009() > MonotonicClock.currentTimeMillis()) {
				return null;
			}
			local10.method4658();
			local10.method4365();
		} while ((Long.MIN_VALUE & local10.aLong185) == 0L);
		return local10;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!be;Lclient!na;I)Lclient!na;")
	public static JagString method2465(@OriginalArg(0) Component arg0, @OriginalArg(1) JagString arg1) {
		if (arg1.indexOf(Static49.aClass100_352) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(14) int local14 = arg1.indexOf(Static23.aClass100_133);
			if (local14 == -1) {
				while (true) {
					local14 = arg1.indexOf(Static276.aClass100_1097);
					if (local14 == -1) {
						while (true) {
							local14 = arg1.indexOf(Static160.aClass100_761);
							if (local14 == -1) {
								while (true) {
									local14 = arg1.indexOf(Static96.aClass100_520);
									if (local14 == -1) {
										while (true) {
											local14 = arg1.indexOf(Static235.aClass100_1002);
											if (local14 == -1) {
												while (true) {
													local14 = arg1.indexOf(Static122.aClass100_591);
													if (local14 == -1) {
														return arg1;
													}
													@Pc(246) JagString local246 = Static186.aClass100_827;
													if (Static232.aClass212_5 != null) {
														local246 = Static181.method3341(Static232.aClass212_5.anInt5926);
														try {
															if (Static232.aClass212_5.result != null) {
																@Pc(265) byte[] local265 = ((String) Static232.aClass212_5.result).getBytes("ISO-8859-1");
																local246 = Static10.decodeString(local265, local265.length, 0);
															}
														} catch (@Pc(274) UnsupportedEncodingException local274) {
														}
													}
													arg1 = Static34.method882(new JagString[] { arg1.substring(local14, 0), local246, arg1.method3136(local14 + 4) });
												}
											}
											arg1 = Static34.method882(new JagString[] { arg1.substring(local14, 0), Static262.method4510(Static273.method3212(4, arg0)), arg1.method3136(local14 + 2) });
										}
									}
									arg1 = Static34.method882(new JagString[] { arg1.substring(local14, 0), Static262.method4510(Static273.method3212(3, arg0)), arg1.method3136(local14 + 2) });
								}
							}
							arg1 = Static34.method882(new JagString[] { arg1.substring(local14, 0), Static262.method4510(Static273.method3212(2, arg0)), arg1.method3136(local14 + 2) });
						}
					}
					arg1 = Static34.method882(new JagString[] { arg1.substring(local14, 0), Static262.method4510(Static273.method3212(1, arg0)), arg1.method3136(local14 + 2) });
				}
			}
			arg1 = Static34.method882(new JagString[] { arg1.substring(local14, 0), Static262.method4510(Static273.method3212(0, arg0)), arg1.method3136(local14 + 2) });
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!na;Z)V")
	public static void method2470(@OriginalArg(0) JagString arg0) {
		if (Static191.staffModLevel >= 2) {
			@Pc(18) int local18;
			@Pc(38) int local38;
			@Pc(29) Runtime local29;
			if (arg0.method3111(Static81.aClass100_476)) {
				Static119.method2380();
				for (local18 = 0; local18 < 10; local18++) {
					System.gc();
				}
				local29 = Runtime.getRuntime();
				local38 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
				Static103.method2231(null, 0, Static34.method882(new JagString[] { Static202.aClass100_892, Static123.method2423(local38), Static17.aClass100_101 }));
			}
			@Pc(117) int local117;
			if (arg0.method3111(Static154.aClass100_735)) {
				Static119.method2380();
				for (local18 = 0; local18 < 10; local18++) {
					System.gc();
				}
				local29 = Runtime.getRuntime();
				local38 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
				Static103.method2231(null, 0, Static34.method882(new JagString[] { Static203.aClass100_893, Static123.method2423(local38), Static17.aClass100_101 }));
				Static16.method501();
				Static119.method2380();
				for (local117 = 0; local117 < 10; local117++) {
					System.gc();
				}
				local38 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
				Static103.method2231(null, 0, Static34.method882(new JagString[] { Static270.aClass100_1093, Static123.method2423(local38), Static17.aClass100_101 }));
			}
			if (arg0.method3111(Static240.aClass100_1009)) {
				Static103.method2231(null, 0, Static34.method882(new JagString[] { Static44.aClass100_335, Static123.method2423(Static198.method1029()) }));
			}
			if (GlRenderer.enabled && arg0.method3111(Static201.aClass100_406)) {
				System.out.println("oncard_geometry:" + Static63.anInt1945);
				System.out.println("oncard_2d:" + Static63.anInt1944);
				System.out.println("oncard_texture:" + Static63.anInt1942);
			}
			if (arg0.method3111(Static257.aClass100_99)) {
				Static175.method3279();
			}
			if (arg0.method3111(Static279.aClass100_1106)) {
				Static107.js5NetQueue.method2329();
			}
			if (arg0.method3111(Static185.aClass100_823)) {
				Static107.js5NetQueue.method2319();
			}
			if (arg0.method3111(Static165.aClass100_775)) {
				Static71.signLink.method5110();
				Static124.socket.method2833();
				Static107.js5NetQueue.method2323();
			}
			if (arg0.method3111(Static114.aClass100_1100)) {
				Static35.aBoolean66 = true;
			}
			if (arg0.method3111(Static148.aClass100_677)) {
				Static196.method3534(25);
			}
			if (arg0.method3111(Static107.aClass100_566)) {
				Static43.displayFps = true;
			}
			if (arg0.method3111(Static61.aClass100_422)) {
				Static43.displayFps = false;
			}
			if (arg0.method3111(Static96.aClass100_522)) {
				Static241.method4540(false, 0, -1, -1);
			}
			if (arg0.method3111(Static181.aClass100_811)) {
				Static241.method4540(false, 1, -1, -1);
			}
			if (arg0.method3111(Static207.aClass100_904)) {
				Static241.method4540(false, 2, -1, -1);
			}
			if (arg0.method3111(Static99.aClass100_529)) {
				Static241.method4540(false, 3, 1024, 768);
			}
			if (arg0.method3111(Static69.aClass100_443)) {
				for (local18 = 0; local18 < 4; local18++) {
					for (local38 = 1; local38 < 103; local38++) {
						for (local117 = 1; local117 < 103; local117++) {
							Static148.aClass97Array1[local18].anIntArrayArray30[local38][local117] = 0;
						}
					}
				}
			}
			if (arg0.method3138(Static241.aClass100_1088)) {
				Static76.method1645(arg0.method3136(15).method3132());
				Static203.method3663(Static71.signLink);
				Static18.sentToServer = false;
			}
			if (arg0.method3138(Static170.aClass100_623) && Static83.modeWhere != 0) {
				Static115.method2312(arg0.method3136(6).method3132());
			}
			if (arg0.method3111(Static272.aClass100_990)) {
				throw new RuntimeException();
			}
			if (arg0.method3138(Static211.aClass100_232)) {
				Static199.anInt4672 = arg0.method3136(12).method3144().method3132();
				Static103.method2231(null, 0, Static34.method882(new JagString[] { Static276.aClass100_1096, Static123.method2423(Static199.anInt4672) }));
			}
			if (arg0.method3111(Static181.aClass100_810)) {
				Static121.aBoolean154 = true;
			}
			if (arg0.method3111(Static124.aClass100_596)) {
				if (Static204.aBoolean234) {
					Static204.aBoolean234 = false;
					Static103.method2231(null, 0, Static274.aClass100_943);
				} else {
					Static204.aBoolean234 = true;
					Static103.method2231(null, 0, Static50.aClass100_362);
				}
			}
			if (arg0.method3111(Static114.aClass100_1099)) {
				if (Static172.shiftClick) {
					Static154.aClass100_736.method3129();
					Static172.shiftClick = false;
				} else {
					Static43.aClass100_333.method3129();
					Static172.shiftClick = true;
				}
			}
		}
		Static6.outboundBuffer.p1isaac(44);
		Static6.outboundBuffer.p1(arg0.length() - 1);
		Static6.outboundBuffer.pjstr(arg0.method3136(2));
	}
}
