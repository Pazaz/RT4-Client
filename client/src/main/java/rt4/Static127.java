package rt4;

import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!k", name = "j", descriptor = "I")
	public static int anInt3126;

	@OriginalMember(owner = "client!k", name = "l", descriptor = "[I")
	public static int[] anIntArray292;

	@OriginalMember(owner = "client!k", name = "i", descriptor = "I")
	public static int anInt3125 = 0;

	@OriginalMember(owner = "client!k", name = "m", descriptor = "Z")
	public static boolean neverRemoveRoofs = false;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIBLclient!ve;Lclient!ve;)Lclient!rk;")
	public static Font method2462(@OriginalArg(1) int arg0, @OriginalArg(3) Js5 arg1, @OriginalArg(4) Js5 arg2) {
		return SpriteLoader.decode(arg1, 0, arg0) ? Static29.method799(arg2.getFile(arg0, 0)) : null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIZIZ)V")
	public static void method2463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (Static80.centralZoneX == arg2 && arg1 == Static52.anInt1695 && (Static41.anInt1316 == arg0 || SceneGraph.allLevelsAreVisible())) {
			return;
		}
		Static80.centralZoneX = arg2;
		Static52.anInt1695 = arg1;
		Static41.anInt1316 = arg0;
		if (SceneGraph.allLevelsAreVisible()) {
			Static41.anInt1316 = 0;
		}
		if (arg4) {
			client.setGameState(28);
		} else {
			client.setGameState(25);
		}
		Static114.drawTextOnScreen(true, LocalizedText.LOADING);
		@Pc(53) int local53 = Static142.originZ;
		@Pc(55) int local55 = Static225.originX;
		Static142.originZ = arg1 * 8 - 48;
		Static225.originX = (arg2 - 6) * 8;
		Static158.aClass3_Sub2_Sub4_3 = MapList.getContainingSource(Static80.centralZoneX * 8, Static52.anInt1695 * 8);
		@Pc(81) int local81 = Static142.originZ - local53;
		@Pc(86) int local86 = Static225.originX - local55;
		Static235.mapElementList = null;
		@Pc(96) int local96;
		@Pc(103) Npc local103;
		@Pc(109) int local109;
		if (arg4) {
			Static272.anInt5214 = 0;
			for (local96 = 0; local96 < 32768; local96++) {
				local103 = NpcList.npcs[local96];
				if (local103 != null) {
					local103.xFine -= local86 * 128;
					local103.zFine -= local81 * 128;
					if (local103.xFine >= 0 && local103.xFine <= 13184 && local103.zFine >= 0 && local103.zFine <= 13184) {
						for (local109 = 0; local109 < 10; local109++) {
							local103.movementQueueX[local109] -= local86;
							local103.movementQueueZ[local109] -= local81;
						}
						Static33.anIntArray79[Static272.anInt5214++] = local96;
					} else {
						NpcList.npcs[local96].setNpcType(null);
						NpcList.npcs[local96] = null;
					}
				}
			}
		} else {
			for (local96 = 0; local96 < 32768; local96++) {
				local103 = NpcList.npcs[local96];
				if (local103 != null) {
					for (local109 = 0; local109 < 10; local109++) {
						local103.movementQueueX[local109] -= local86;
						local103.movementQueueZ[local109] -= local81;
					}
					local103.xFine -= local86 * 128;
					local103.zFine -= local81 * 128;
				}
			}
		}
		for (local96 = 0; local96 < 2048; local96++) {
			@Pc(265) Player local265 = PlayerList.players[local96];
			if (local265 != null) {
				for (local109 = 0; local109 < 10; local109++) {
					local265.movementQueueX[local109] -= local86;
					local265.movementQueueZ[local109] -= local81;
				}
				local265.xFine -= local86 * 128;
				local265.zFine -= local81 * 128;
			}
		}
		Player.level = arg0;
		PlayerList.self.teleport(arg5, false, arg3);
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
		for (@Pc(451) SceneryStack local451 = (SceneryStack) Static26.sceneryList.start(); local451 != null; local451 = (SceneryStack) Static26.sceneryList.next()) {
			local451.z -= local81;
			local451.x -= local86;
			if (local451.x < 0 || local451.z < 0 || local451.x >= 104 || local451.z >= 104) {
				local451.unlink();
			}
		}
		if (arg4) {
			Static138.renderX -= local86 * 128;
			Static134.renderZ -= local81 * 128;
			Static248.anInt4232 -= local81;
			Static251.anInt5449 -= local86;
			Static265.anInt5765 -= local81;
			Static245.anInt5375 -= local86;
		} else {
			Static227.cameraType = 1;
		}
		SoundPlayer.anInt4451 = 0;
		if (Static115.mapFlagX != 0) {
			Static84.anInt2255 -= local81;
			Static115.mapFlagX -= local86;
		}
		if (GlRenderer.enabled && arg4 && (Math.abs(local86) > 104 || Math.abs(local81) > 104)) {
			Static86.setInstantFade();
		}
		Static107.anInt2875 = -1;
		Static99.aClass69_64.clear();
		Static217.aClass69_116.clear();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)Lclient!da;")
	public static DelayedStateChange poll() {
		@Pc(10) DelayedStateChange local10 = (DelayedStateChange) DelayedStateChange.serverQueue.method795();
		if (local10 != null) {
			local10.unlink();
			local10.method4365();
			return local10;
		}
		do {
			local10 = (DelayedStateChange) DelayedStateChange.clientQueue.method795();
			if (local10 == null) {
				return null;
			}
			if (local10.getTime() > MonotonicClock.currentTimeMillis()) {
				return null;
			}
			local10.unlink();
			local10.method4365();
		} while ((Long.MIN_VALUE & local10.secondaryKey) == 0L);
		return local10;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!be;Lclient!na;I)Lclient!na;")
	public static JagString method2465(@OriginalArg(0) Component arg0, @OriginalArg(1) JagString arg1) {
		if (arg1.indexOf(Static49.PERCENT_SIGN) == -1) {
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
													@Pc(246) JagString local246 = JagString.EMPTY;
													if (Player.lastLogAddress != null) {
														local246 = Static181.method3341(Player.lastLogAddress.intArg2);
														try {
															if (Player.lastLogAddress.result != null) {
																@Pc(265) byte[] local265 = ((String) Player.lastLogAddress.result).getBytes("ISO-8859-1");
																local246 = Static10.decodeString(local265, local265.length, 0);
															}
														} catch (@Pc(274) UnsupportedEncodingException local274) {
														}
													}
													arg1 = JagString.concatenate(new JagString[] { arg1.substring(local14, 0), local246, arg1.substring(local14 + 4) });
												}
											}
											arg1 = JagString.concatenate(new JagString[] { arg1.substring(local14, 0), Static262.method4510(Static273.method3212(4, arg0)), arg1.substring(local14 + 2) });
										}
									}
									arg1 = JagString.concatenate(new JagString[] { arg1.substring(local14, 0), Static262.method4510(Static273.method3212(3, arg0)), arg1.substring(local14 + 2) });
								}
							}
							arg1 = JagString.concatenate(new JagString[] { arg1.substring(local14, 0), Static262.method4510(Static273.method3212(2, arg0)), arg1.substring(local14 + 2) });
						}
					}
					arg1 = JagString.concatenate(new JagString[] { arg1.substring(local14, 0), Static262.method4510(Static273.method3212(1, arg0)), arg1.substring(local14 + 2) });
				}
			}
			arg1 = JagString.concatenate(new JagString[] { arg1.substring(local14, 0), Static262.method4510(Static273.method3212(0, arg0)), arg1.substring(local14 + 2) });
		}
	}

}
