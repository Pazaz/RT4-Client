import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "Lclient!na;")
	public static final JagString aClass100_1101 = JagString.parse(" <col=ffff00>");

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "Lclient!na;")
	public static JagString mainLoadPrimaryText = null;

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "Lclient!na;")
	public static final JagString aClass100_1103 = JagString.parse("ul");

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIII)V")
	public static void method4647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class120 local3 = new Class120();
		local3.anInt4452 = arg1 / 128;
		local3.anInt4446 = arg2 / 128;
		local3.anInt4461 = arg3 / 128;
		local3.anInt4464 = arg4 / 128;
		local3.anInt4453 = arg0;
		local3.anInt4460 = arg1;
		local3.anInt4445 = arg2;
		local3.anInt4458 = arg3;
		local3.anInt4449 = arg4;
		local3.anInt4444 = arg5;
		local3.anInt4447 = arg6;
		Static91.aClass120Array1[Static28.anInt917++] = local3;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V")
	public static void setRenderTiles(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			SceneGraph.tiles = Static276.underWaterGroundTiles;
			Static83.activeTileHeightMap = Static80.underWaterTileHeightMap;
			Static182.aClass3_Sub14ArrayArray2 = Static195.underWaterHdTiles;
		} else {
			SceneGraph.tiles = Static197.surfaceGroundTiles;
			Static83.activeTileHeightMap = Static107.surfaceTileHeightMap;
			Static182.aClass3_Sub14ArrayArray2 = Static36.surfaceHdTiles;
		}
		Static126.anInt3114 = SceneGraph.tiles.length;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
	public static void method4649() {
		NpcTypeList.aClass99_18.clear();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIZLclient!wa;IIBII)V")
	public static void method4651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Buffer arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(32) int local32;
		if (arg5 < 0 || arg5 >= 104 || arg4 < 0 || arg4 >= 104) {
			while (true) {
				local32 = arg3.g1();
				if (local32 == 0) {
					break;
				}
				if (local32 == 1) {
					arg3.g1();
					break;
				}
				if (local32 <= 49) {
					arg3.g1();
				}
			}
			return;
		}
		if (!arg2) {
			Static12.tileSettings[arg7][arg5][arg4] = 0;
		}
		while (true) {
			local32 = arg3.g1();
			if (local32 == 0) {
				if (arg2) {
					Static83.activeTileHeightMap[0][arg5][arg4] = Static107.surfaceTileHeightMap[0][arg5][arg4];
				} else if (arg7 == 0) {
					Static83.activeTileHeightMap[0][arg5][arg4] = -Static65.method1498(arg4 + arg1 + 556238, arg0 + arg5 + 932731) * 8;
				} else {
					Static83.activeTileHeightMap[arg7][arg5][arg4] = Static83.activeTileHeightMap[arg7 - 1][arg5][arg4] - 240;
				}
				break;
			}
			if (local32 == 1) {
				@Pc(111) int local111 = arg3.g1();
				if (arg2) {
					Static83.activeTileHeightMap[0][arg5][arg4] = Static107.surfaceTileHeightMap[0][arg5][arg4] + local111 * 8;
				} else {
					if (local111 == 1) {
						local111 = 0;
					}
					if (arg7 == 0) {
						Static83.activeTileHeightMap[0][arg5][arg4] = -local111 * 8;
					} else {
						Static83.activeTileHeightMap[arg7][arg5][arg4] = Static83.activeTileHeightMap[arg7 - 1][arg5][arg4] - local111 * 8;
					}
				}
				break;
			}
			if (local32 <= 49) {
				Static240.aByteArrayArrayArray14[arg7][arg5][arg4] = arg3.g1s();
				Static163.aByteArrayArrayArray11[arg7][arg5][arg4] = (byte) ((local32 - 2) / 4);
				Static4.aByteArrayArrayArray1[arg7][arg5][arg4] = (byte) (local32 + arg6 - 2 & 0x3);
			} else if (local32 > 81) {
				Static253.aByteArrayArrayArray16[arg7][arg5][arg4] = (byte) (local32 - 81);
			} else if (!arg2) {
				Static12.tileSettings[arg7][arg5][arg4] = (byte) (local32 - 49);
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V")
	public static void processLogout() {
		if (Protocol.socket != null) {
			Protocol.socket.close();
			Protocol.socket = null;
		}
		client.method3768();
		SceneGraph.clear();
		@Pc(19) int local19;
		for (local19 = 0; local19 < 4; local19++) {
			PathFinder.collisionMaps[local19].resetFlags();
		}
		WorldMap.clear(false);
		System.gc();
		MidiPlayer.method801();
		MidiPlayer.jingle = false;
		MusicPlayer.groupId = -1;
		Static260.clearAmbientSounds(true);
		Static230.dynamicMapRegion = false;
		Static142.originZ = 0;
		Static80.centralZoneX = 0;
		Static52.anInt1695 = 0;
		Static225.originX = 0;
		for (local19 = 0; local19 < Static143.aClass102Array1.length; local19++) {
			Static143.aClass102Array1[local19] = null;
		}
		PlayerList.size = 0;
		Static272.anInt5214 = 0;
		for (local19 = 0; local19 < 2048; local19++) {
			PlayerList.players[local19] = null;
			PlayerList.appearanceCache[local19] = null;
		}
		for (local19 = 0; local19 < 32768; local19++) {
			NpcList.npcs[local19] = null;
		}
		for (local19 = 0; local19 < 4; local19++) {
			for (@Pc(115) int local115 = 0; local115 < 104; local115++) {
				for (@Pc(122) int local122 = 0; local122 < 104; local122++) {
					Static159.aClass69ArrayArrayArray1[local19][local115][local122] = null;
				}
			}
		}
		Static35.resetCameraEffects();
		Protocol.verifyId = 0;
		Static8.method121();
		Static73.method1596(true);
	}
}
