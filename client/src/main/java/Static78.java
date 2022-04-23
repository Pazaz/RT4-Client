import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
	public static int anInt2147;

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "Lclient!ve;")
	public static Js5 aClass153_32;

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "Lclient!qf;")
	public static Sprite aClass3_Sub2_Sub1_3;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "Lclient!na;")
	public static final JagString aClass100_464 = Static28.parse("null");

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Lclient!na;")
	public static final JagString aClass100_465 = Static28.parse(")0");

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "[I")
	public static final int[] anIntArray204 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "Lclient!na;")
	public static JagString aClass100_466 = null;

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
	public static int anInt2145 = 0;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIBI)I")
	public static int method1690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return arg2 > arg1 ? arg2 : arg1 > arg0 ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(JI)V")
	public static void method1691(@OriginalArg(0) long name) {
		Static6.outboundBuffer.offset = 0;
		Static6.outboundBuffer.p1(186);
		if (GlobalConfig.LOGIN_USE_STRINGS) {
			Static6.outboundBuffer.pjstr(Static79.decode37(name));
		} else {
			Static6.outboundBuffer.p8(name);
		}
		Static179.accountCreationStep = 1;
		Static226.anInt5079 = 0;
		Static57.anInt1758 = 0;
		Static223.anInt5034 = -3;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!ve;II)Lclient!mm;")
	public static SoftwareSprite method1693(@OriginalArg(0) int arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(3) int arg2) {
		return Static234.method4016(arg1, arg0, arg2) ? Static196.method3537() : null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public static void method1694() {
		Static125.aClass99_19.method3103();
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	public static void method1695() {
		Static220.aClass99_28.method3104();
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
	public static void rebuildMap() {
		Static7.ping(false);
		Static175.mapFilesMissingCount = 0;
		@Pc(12) boolean fileExists = true;
		@Pc(14) int id;
		for (id = 0; id < Static273.mapFilesBuffer.length; id++) {
			if (Static36.mapFileIds[id] != -1 && Static273.mapFilesBuffer[id] == null) {
				Static273.mapFilesBuffer[id] = Static26.js5Archive5.getFile(Static36.mapFileIds[id], 0);
				if (Static273.mapFilesBuffer[id] == null) {
					Static175.mapFilesMissingCount++;
					fileExists = false;
				}
			}
			if (Static172.locationsMapFileIds[id] != -1 && Static156.locationMapFilesBuffer[id] == null) {
				Static156.locationMapFilesBuffer[id] = Static26.js5Archive5.getFileXTEA(Static172.locationsMapFileIds[id], Static72.regionsXteaKeys[id], 0);
				if (Static156.locationMapFilesBuffer[id] == null) {
					fileExists = false;
					Static175.mapFilesMissingCount++;
				}
			}

			if (GlRenderer.enabled) {
				if (Static99.underWaterMapFileIds[id] != -1 && Static186.underWaterMapFilesBuffer[id] == null) {
					Static186.underWaterMapFilesBuffer[id] = Static26.js5Archive5.getFile(Static99.underWaterMapFileIds[id], 0);
					if (Static186.underWaterMapFilesBuffer[id] == null) {
						fileExists = false;
						Static175.mapFilesMissingCount++;
					}
				}
				if (Static35.underWaterLocationsMapFileIds[id] != -1 && Static19.underWaterLocationsMapFilesBuffer[id] == null) {
					Static19.underWaterLocationsMapFilesBuffer[id] = Static26.js5Archive5.getFile(Static35.underWaterLocationsMapFileIds[id], 0);
					if (Static19.underWaterLocationsMapFilesBuffer[id] == null) {
						Static175.mapFilesMissingCount++;
						fileExists = false;
					}
				}
			}

			if (Static175.npcSpawnsFileIds != null && Static191.npcSpawnsFilesBuffer[id] == null && Static175.npcSpawnsFileIds[id] != -1) {
				Static191.npcSpawnsFilesBuffer[id] = Static26.js5Archive5.getFileXTEA(Static175.npcSpawnsFileIds[id], Static72.regionsXteaKeys[id], 0);
				if (Static191.npcSpawnsFilesBuffer[id] == null) {
					Static175.mapFilesMissingCount++;
					fileExists = false;
				}
			}
		}

		if (Static235.mapFunctionGroup == null) {
			if (Static158.aClass3_Sub2_Sub4_3 == null || !Static227.js5Archive23.method4497(Static34.concatenate(new JagString[] { Static158.aClass3_Sub2_Sub4_3.aClass100_138, Static50.aClass100_363 }))) {
				Static235.mapFunctionGroup = new Class134(0);
			} else if (Static227.js5Archive23.allFilesComplete(Static34.concatenate(new JagString[] { Static158.aClass3_Sub2_Sub4_3.aClass100_138, Static50.aClass100_363 }))) {
				Static235.mapFunctionGroup = Static140.createMapFunctionGroup(Static34.concatenate(new JagString[] { Static158.aClass3_Sub2_Sub4_3.aClass100_138, Static50.aClass100_363 }), Static227.js5Archive23);
			} else {
				fileExists = false;
				Static175.mapFilesMissingCount++;
			}
		}

		if (!fileExists) {
			Static233.loadingScreenState = 1;
			return;
		}

		Static271.anInt5804 = 0;
		fileExists = true;
		@Pc(320) int chunkX;
		@Pc(309) int chunkZ;
		for (id = 0; id < Static273.mapFilesBuffer.length; id++) {
			@Pc(294) byte[] local294 = Static156.locationMapFilesBuffer[id];
			if (local294 != null) {
				chunkZ = (Static238.regionBitPacked[id] & 0xFF) * 64 - Static142.originZ;
				chunkX = (Static238.regionBitPacked[id] >> 8) * 64 - Static225.originX;
				if (Static230.dynamicMapRegion) {
					chunkZ = 10;
					chunkX = 10;
				}
				fileExists &= Static49.method1201(chunkX, chunkZ, local294);
			}
			if (GlRenderer.enabled) {
				local294 = Static19.underWaterLocationsMapFilesBuffer[id];
				if (local294 != null) {
					chunkX = (Static238.regionBitPacked[id] >> 8) * 64 - Static225.originX;
					chunkZ = (Static238.regionBitPacked[id] & 0xFF) * 64 - Static142.originZ;
					if (Static230.dynamicMapRegion) {
						chunkZ = 10;
						chunkX = 10;
					}
					fileExists &= Static49.method1201(chunkX, chunkZ, local294);
				}
			}
		}
		if (!fileExists) {
			Static233.loadingScreenState = 2;
			return;
		}

		if (Static233.loadingScreenState != 0) {
			Static114.drawTextOnScreen(true, Static34.concatenate(new JagString[] { LocalizedText.LOADING, Static18.COMPLETE_PERCENT}));
		}

		Static107.method2261();
		Static217.method3768();
		@Pc(420) boolean hasUnderWaterMap = false;
		@Pc(427) int i;
		if (GlRenderer.enabled && Static220.highWaterDetail) {
			for (i = 0; i < Static273.mapFilesBuffer.length; i++) {
				if (Static19.underWaterLocationsMapFilesBuffer[i] != null || Static186.underWaterMapFilesBuffer[i] != null) {
					hasUnderWaterMap = true;
					break;
				}
			}
		}
		Static28.method792(GlRenderer.enabled ? 28 : 25, hasUnderWaterMap);
		for (i = 0; i < 4; i++) {
			Static148.collisionMaps[i].resetFlags();
		}
		for (i = 0; i < 4; i++) {
			for (chunkX = 0; chunkX < 104; chunkX++) {
				for (chunkZ = 0; chunkZ < 104; chunkZ++) {
					Static12.tileSettings[i][chunkX][chunkZ] = 0;
				}
			}
		}
		Static260.clearAmbientSounds(false);
		if (GlRenderer.enabled) {
			Static242.shadowMapImage.method1392();
			for (i = 0; i < 13; i++) {
				for (chunkX = 0; chunkX < 13; chunkX++) {
					Static242.shadows[i][chunkX].outputToSprite = true;
				}
			}
		}
		if (GlRenderer.enabled) {
			Static120.method2404();
		}
		if (GlRenderer.enabled) {
			Static75.setDefaultChunksAtmosphere();
		}
		Static107.method2261();
		System.gc();
		Static7.ping(true);
		Static196.method3535(false);
		if (!Static230.dynamicMapRegion) {
			Static87.method1805(false);
			Static7.ping(true);
			if (GlRenderer.enabled) {
				i = Static173.self.movementQueueX[0] >> 3;
				chunkX = Static173.self.movementQueueZ[0] >> 3;
				Static73.setLightPosition(chunkX, i);
			}
			Static26.method743(false);
			if (Static191.npcSpawnsFilesBuffer != null) {
				Static158.decodeNpcFiles();
			}
		}
		if (Static230.dynamicMapRegion) {
			Static89.method1835(false);
			Static7.ping(true);
			if (GlRenderer.enabled) {
				i = Static173.self.movementQueueX[0] >> 3;
				chunkX = Static173.self.movementQueueZ[0] >> 3;
				Static73.setLightPosition(chunkX, i);
			}
			Static233.method4002(false);
		}
		Static217.method3768();
		Static7.ping(true);
		Static45.method1169(Static148.collisionMaps, false);
		if (GlRenderer.enabled) {
			Static120.method2395();
		}
		Static7.ping(true);
		i = Static146.anInt3508;
		if (i > Static55.level) {
			i = Static55.level;
		}
		if (i < Static55.level - 1) {
		}
		if (Static138.allLevelsAreVisible()) {
			Static146.method2750(0);
		} else {
			Static146.method2750(Static146.anInt3508);
		}
		Static105.method2255();
		if (GlRenderer.enabled && hasUnderWaterMap) {
			Static278.setRenderTiles(true);
			Static196.method3535(true);
			if (!Static230.dynamicMapRegion) {
				Static87.method1805(true);
				Static7.ping(true);
				Static26.method743(true);
			}
			if (Static230.dynamicMapRegion) {
				Static89.method1835(true);
				Static7.ping(true);
				Static233.method4002(true);
			}
			Static217.method3768();
			Static7.ping(true);
			Static45.method1169(Static148.collisionMaps, true);
			Static7.ping(true);
			Static105.method2255();
			Static278.setRenderTiles(false);
		}
		if (GlRenderer.enabled) {
			for (chunkX = 0; chunkX < 13; chunkX++) {
				for (chunkZ = 0; chunkZ < 13; chunkZ++) {
					Static242.shadows[chunkX][chunkZ].method4676(Static83.activeTileHeightMap[0], chunkX * 8, chunkZ * 8);
				}
			}
		}
		for (chunkX = 0; chunkX < 104; chunkX++) {
			for (chunkZ = 0; chunkZ < 104; chunkZ++) {
				Static220.spawnGroundObject(chunkZ, chunkX);
			}
		}
		Static269.method2218();
		Static107.method2261();
		Static219.method3796();
		Static217.method3768();
		Static231.aBoolean252 = false;
		if (GameShell.frame != null && Static124.socket != null && Static244.gameState == 25) {
			Static6.outboundBuffer.p1isaac(20);
			Static6.outboundBuffer.p4(1057001181);
		}
		if (!Static230.dynamicMapRegion) {
			@Pc(815) int local815 = (Static52.anInt1695 + 6) / 8;
			@Pc(821) int local821 = (Static52.anInt1695 - 6) / 8;
			chunkX = (Static80.anInt4701 - 6) / 8;
			chunkZ = (Static80.anInt4701 + 6) / 8;
			for (@Pc(837) int local837 = chunkX - 1; local837 <= chunkZ + 1; local837++) {
				for (@Pc(850) int local850 = local821 - 1; local850 <= local815 + 1; local850++) {
					if (local837 < chunkX || local837 > chunkZ || local850 < local821 || local850 > local815) {
						Static26.js5Archive5.method4486(Static34.concatenate(new JagString[] { Static103.aClass100_558, Static123.parseInt(local837), Static86.aClass100_488, Static123.parseInt(local850) }));
						Static26.js5Archive5.method4486(Static34.concatenate(new JagString[] { Static270.aClass100_1090, Static123.parseInt(local837), Static86.aClass100_488, Static123.parseInt(local850) }));
					}
				}
			}
		}
		if (Static244.gameState == 28) {
			Static196.setGameState(10);
		} else {
			Static196.setGameState(30);
			if (Static124.socket != null) {
				Static6.outboundBuffer.p1isaac(110);
			}
		}
		Static141.method2720();
		Static107.method2261();
		Static234.method4020();
	}
}
