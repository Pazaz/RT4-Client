package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;

public class ClientProt {
    @OriginalMember(owner = "client!e", name = "Dc", descriptor = "Lclient!na;")
    public static final JagString aClass100_363 = JagString.parse("_labels");
    @OriginalMember(owner = "client!bh", name = "C", descriptor = "Lclient!na;")
	public static final JagString COMPLETE_PERCENT = JagString.parse("<br>(X100(U(Y");
    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int anInt5804 = 0;
    @OriginalMember(owner = "client!nm", name = "U", descriptor = "I")
    public static int mapFilesMissingCount = 0;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!na;IIBI)V")
    public static void method4512(@OriginalArg(0) JagString arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
        @Pc(8) Component local8 = InterfaceList.method1418(arg3, arg1);
        if (local8 == null) {
            return;
        }
        if (local8.onOptionClick != null) {
            @Pc(19) HookRequest local19 = new HookRequest();
            local19.arguments = local8.onOptionClick;
            local19.source = local8;
            local19.opBase = arg0;
            local19.op = arg2;
            ScriptRunner.run(local19);
        }
        @Pc(37) boolean local37 = true;
        if (local8.clientCode > 0) {
            local37 = MiniMenu.method4265(local8);
        }
        if (!local37 || !InterfaceList.getServerActiveProperties(local8).method503(arg2 - 1)) {
            return;
        }
        if (arg2 == 1) {
            Protocol.outboundBuffer.p1isaac(155);
            Protocol.outboundBuffer.p4(arg3);
            Protocol.outboundBuffer.p2(arg1);
        }
        if (arg2 == 2) {
            Protocol.outboundBuffer.p1isaac(196);
            Protocol.outboundBuffer.p4(arg3);
            Protocol.outboundBuffer.p2(arg1);
        }
        if (arg2 == 3) {
            Protocol.outboundBuffer.p1isaac(124);
            Protocol.outboundBuffer.p4(arg3);
            Protocol.outboundBuffer.p2(arg1);
        }
        if (arg2 == 4) {
            Protocol.outboundBuffer.p1isaac(199);
            Protocol.outboundBuffer.p4(arg3);
            Protocol.outboundBuffer.p2(arg1);
        }
        if (arg2 == 5) {
            Protocol.outboundBuffer.p1isaac(234);
            Protocol.outboundBuffer.p4(arg3);
            Protocol.outboundBuffer.p2(arg1);
        }
        if (arg2 == 6) {
            Protocol.outboundBuffer.p1isaac(168);
            Protocol.outboundBuffer.p4(arg3);
            Protocol.outboundBuffer.p2(arg1);
        }
        if (arg2 == 7) {
            Protocol.outboundBuffer.p1isaac(166);
            Protocol.outboundBuffer.p4(arg3);
            Protocol.outboundBuffer.p2(arg1);
        }
        if (arg2 == 8) {
            Protocol.outboundBuffer.p1isaac(64);
            Protocol.outboundBuffer.p4(arg3);
            Protocol.outboundBuffer.p2(arg1);
        }
        if (arg2 == 9) {
            Protocol.outboundBuffer.p1isaac(53);
            Protocol.outboundBuffer.p4(arg3);
            Protocol.outboundBuffer.p2(arg1);
        }
        if (arg2 == 10) {
            Protocol.outboundBuffer.p1isaac(9);
            Protocol.outboundBuffer.p4(arg3);
            Protocol.outboundBuffer.p2(arg1);
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(III)V")
    public static void method3502(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
        @Pc(13) int local13 = arg0;
        if (arg0 > 25) {
            local13 = 25;
        }
        arg0--;
        @Pc(23) int local23 = PathFinder.queueX[arg0];
        @Pc(27) int local27 = PathFinder.queueZ[arg0];
        if (arg1 == 0) {
            Protocol.outboundBuffer.p1isaac(215);
            Protocol.outboundBuffer.p1(local13 + local13 + 3);
        }
        if (arg1 == 1) {
            Protocol.outboundBuffer.p1isaac(39);
            Protocol.outboundBuffer.p1(local13 + local13 + 3 + 14);
        }
        if (arg1 == 2) {
            Protocol.outboundBuffer.p1isaac(77);
            Protocol.outboundBuffer.p1(local13 + local13 + 3);
        }
        Protocol.outboundBuffer.p1add(Keyboard.pressedKeys[Keyboard.KEY_CTRL] ? 1 : 0);
        Protocol.outboundBuffer.p2(Camera.originX + local23);
        Protocol.outboundBuffer.p2add(Camera.originZ + local27);
        LoginManager.mapFlagZ = PathFinder.queueZ[0];
        LoginManager.mapFlagX = PathFinder.queueX[0];
        for (@Pc(126) int local126 = 1; local126 < local13; local126++) {
            arg0--;
            Protocol.outboundBuffer.p1add(PathFinder.queueX[arg0] - local23);
            Protocol.outboundBuffer.p1sub(PathFinder.queueZ[arg0] - local27);
        }
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(B)V")
    public static void closeWidget() {
        Protocol.outboundBuffer.p1isaac(184);
        for (@Pc(18) ComponentPointer local18 = (ComponentPointer) InterfaceList.openInterfaces.head(); local18 != null; local18 = (ComponentPointer) InterfaceList.openInterfaces.next()) {
            if (local18.anInt5879 == 0) {
                InterfaceList.closeInterface(true, local18);
            }
        }
        if (Static44.aClass13_10 != null) {
            InterfaceList.redraw(Static44.aClass13_10);
            Static44.aClass13_10 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILclient!na;)V")
    public static void clickPlayerOption(@OriginalArg(0) int arg0, @OriginalArg(2) JagString arg1) {
        @Pc(7) JagString local7 = arg1.method3159().toTitleCase();
        @Pc(13) boolean local13 = false;
        for (@Pc(15) int local15 = 0; local15 < PlayerList.size; local15++) {
            @Pc(28) Player local28 = PlayerList.players[PlayerList.ids[local15]];
            if (local28 != null && local28.username != null && local28.username.equalsIgnoreCase(local7)) {
                local13 = true;
                PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local28.movementQueueX[0], 1, 0, 2, local28.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
                if (arg0 == 1) {
                    Protocol.outboundBuffer.p1isaac(68);
                    Protocol.outboundBuffer.ip2add(PlayerList.ids[local15]);
                } else if (arg0 == 4) {
                    Protocol.outboundBuffer.p1isaac(180);
                    Protocol.outboundBuffer.ip2add(PlayerList.ids[local15]);
                } else if (arg0 == 5) {
                    Protocol.outboundBuffer.p1isaac(4);
                    Protocol.outboundBuffer.ip2(PlayerList.ids[local15]);
                } else if (arg0 == 6) {
                    Protocol.outboundBuffer.p1isaac(133);
                    Protocol.outboundBuffer.ip2(PlayerList.ids[local15]);
                } else if (arg0 == 7) {
                    Protocol.outboundBuffer.p1isaac(114);
                    Protocol.outboundBuffer.ip2add(PlayerList.ids[local15]);
                }
                break;
            }
        }
        if (!local13) {
            Chat.add(JagString.EMPTY, 0, JagString.concatenate(new JagString[] { LocalizedText.UNABLETOFIND, local7 }));
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
    public static void rebuildMap() {
        ping(false);
        mapFilesMissingCount = 0;
        @Pc(12) boolean fileExists = true;
        @Pc(14) int id;
        for (id = 0; id < LoginManager.mapFilesBuffer.length; id++) {
            if (LoginManager.mapFileIds[id] != -1 && LoginManager.mapFilesBuffer[id] == null) {
                LoginManager.mapFilesBuffer[id] = client.js5Archive5.fetchFile(LoginManager.mapFileIds[id], 0);
                if (LoginManager.mapFilesBuffer[id] == null) {
                    mapFilesMissingCount++;
                    fileExists = false;
                }
            }
            if (LoginManager.locationsMapFileIds[id] != -1 && LoginManager.locationMapFilesBuffer[id] == null) {
                LoginManager.locationMapFilesBuffer[id] = client.js5Archive5.fetchFile(LoginManager.locationsMapFileIds[id], LoginManager.regionsXteaKeys[id], 0);
                if (LoginManager.locationMapFilesBuffer[id] == null) {
                    fileExists = false;
                    mapFilesMissingCount++;
                }
            }

            if (GlRenderer.enabled) {
                if (LoginManager.underWaterMapFileIds[id] != -1 && LoginManager.underWaterMapFilesBuffer[id] == null) {
                    LoginManager.underWaterMapFilesBuffer[id] = client.js5Archive5.fetchFile(LoginManager.underWaterMapFileIds[id], 0);
                    if (LoginManager.underWaterMapFilesBuffer[id] == null) {
                        fileExists = false;
                        mapFilesMissingCount++;
                    }
                }
                if (LoginManager.underWaterLocationsMapFileIds[id] != -1 && LoginManager.underWaterLocationsMapFilesBuffer[id] == null) {
                    LoginManager.underWaterLocationsMapFilesBuffer[id] = client.js5Archive5.fetchFile(LoginManager.underWaterLocationsMapFileIds[id], 0);
                    if (LoginManager.underWaterLocationsMapFilesBuffer[id] == null) {
                        mapFilesMissingCount++;
                        fileExists = false;
                    }
                }
            }

            if (LoginManager.npcSpawnsFileIds != null && LoginManager.npcSpawnsFilesBuffer[id] == null && LoginManager.npcSpawnsFileIds[id] != -1) {
                LoginManager.npcSpawnsFilesBuffer[id] = client.js5Archive5.fetchFile(LoginManager.npcSpawnsFileIds[id], LoginManager.regionsXteaKeys[id], 0);
                if (LoginManager.npcSpawnsFilesBuffer[id] == null) {
                    mapFilesMissingCount++;
                    fileExists = false;
                }
            }
        }

        if (LoginManager.mapElementList == null) {
            if (LoginManager.map == null || !client.js5Archive23.isGroupNameValid(JagString.concatenate(new JagString[] { LoginManager.map.group, aClass100_363 }))) {
                LoginManager.mapElementList = new MapElementList(0);
            } else if (client.js5Archive23.isGroupReady(JagString.concatenate(new JagString[] { LoginManager.map.group, aClass100_363 }))) {
                LoginManager.mapElementList = MapElementList.create(JagString.concatenate(new JagString[] { LoginManager.map.group, aClass100_363 }), client.js5Archive23);
            } else {
                fileExists = false;
                mapFilesMissingCount++;
            }
        }

        if (!fileExists) {
            Static233.loadingScreenState = 1;
            return;
        }

        anInt5804 = 0;
        fileExists = true;
        @Pc(320) int chunkX;
        @Pc(309) int chunkZ;
        for (id = 0; id < LoginManager.mapFilesBuffer.length; id++) {
            @Pc(294) byte[] local294 = LoginManager.locationMapFilesBuffer[id];
            if (local294 != null) {
                chunkZ = (LoginManager.regionBitPacked[id] & 0xFF) * 64 - Camera.originZ;
                chunkX = (LoginManager.regionBitPacked[id] >> 8) * 64 - Camera.originX;
                if (LoginManager.dynamicMapRegion) {
                    chunkZ = 10;
                    chunkX = 10;
                }
                fileExists &= Static49.method1201(chunkX, chunkZ, local294);
            }
            if (GlRenderer.enabled) {
                local294 = LoginManager.underWaterLocationsMapFilesBuffer[id];
                if (local294 != null) {
                    chunkX = (LoginManager.regionBitPacked[id] >> 8) * 64 - Camera.originX;
                    chunkZ = (LoginManager.regionBitPacked[id] & 0xFF) * 64 - Camera.originZ;
                    if (LoginManager.dynamicMapRegion) {
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
            Static114.drawTextOnScreen(true, JagString.concatenate(new JagString[] { LocalizedText.LOADING, COMPLETE_PERCENT}));
        }

        client.audioLoop();
        client.method3768();
        @Pc(420) boolean hasUnderWaterMap = false;
        @Pc(427) int i;
        if (GlRenderer.enabled && Preferences.highWaterDetail) {
            for (i = 0; i < LoginManager.mapFilesBuffer.length; i++) {
                if (LoginManager.underWaterLocationsMapFilesBuffer[i] != null || LoginManager.underWaterMapFilesBuffer[i] != null) {
                    hasUnderWaterMap = true;
                    break;
                }
            }
        }
        SceneGraph.init(GlRenderer.enabled ? GlobalConfig.TILE_DISTANCE : 25, hasUnderWaterMap);
        for (i = 0; i < 4; i++) {
            PathFinder.collisionMaps[i].clear();
        }
        for (i = 0; i < 4; i++) {
            for (chunkX = 0; chunkX < 104; chunkX++) {
                for (chunkZ = 0; chunkZ < 104; chunkZ++) {
                    SceneGraph.tileFlags[i][chunkX][chunkZ] = 0;
                }
            }
        }
        AreaSoundManager.clear(false);
        if (GlRenderer.enabled) {
            ShadowManager.shadowMapImage.clear();
            for (i = 0; i < 13; i++) {
                for (chunkX = 0; chunkX < 13; chunkX++) {
                    ShadowManager.shadows[i][chunkX].outputToSprite = true;
                }
            }
        }
        if (GlRenderer.enabled) {
            LightingManager.method2404();
        }
        if (GlRenderer.enabled) {
            setDefaultChunksAtmosphere();
        }
        client.audioLoop();
        System.gc();
        ping(true);
        SceneGraph.load(false);
        if (!LoginManager.dynamicMapRegion) {
            Static87.method1805(false);
            ping(true);
            if (GlRenderer.enabled) {
                i = PlayerList.self.movementQueueX[0] >> 3;
                chunkX = PlayerList.self.movementQueueZ[0] >> 3;
                Static73.setLightPosition(chunkX, i);
            }
            LoginManager.method743(false);
            if (LoginManager.npcSpawnsFilesBuffer != null) {
                Static158.decodeNpcFiles();
            }
        }
        if (LoginManager.dynamicMapRegion) {
            Static89.method1835(false);
            ping(true);
            if (GlRenderer.enabled) {
                i = PlayerList.self.movementQueueX[0] >> 3;
                chunkX = PlayerList.self.movementQueueZ[0] >> 3;
                Static73.setLightPosition(chunkX, i);
            }
            Static233.method4002(false);
        }
        client.method3768();
        ping(true);
        SceneGraph.method1169(PathFinder.collisionMaps, false);
        if (GlRenderer.enabled) {
            LightingManager.method2395();
        }
        ping(true);
        i = SceneGraph.firstVisibleLevel;
        if (i > Player.level) {
            i = Player.level;
        }
        if (i < Player.level - 1) {
        }
        if (SceneGraph.allLevelsAreVisible()) {
            SceneGraph.method2750(0);
        } else {
            SceneGraph.method2750(SceneGraph.firstVisibleLevel);
        }
        SceneGraph.unload();
        if (GlRenderer.enabled && hasUnderWaterMap) {
            SceneGraph.setUnderwater(true);
            SceneGraph.load(true);
            if (!LoginManager.dynamicMapRegion) {
                Static87.method1805(true);
                ping(true);
                LoginManager.method743(true);
            }
            if (LoginManager.dynamicMapRegion) {
                Static89.method1835(true);
                ping(true);
                Static233.method4002(true);
            }
            client.method3768();
            ping(true);
            SceneGraph.method1169(PathFinder.collisionMaps, true);
            ping(true);
            SceneGraph.unload();
            SceneGraph.setUnderwater(false);
        }
        if (GlRenderer.enabled) {
            for (chunkX = 0; chunkX < 13; chunkX++) {
                for (chunkZ = 0; chunkZ < 13; chunkZ++) {
                    ShadowManager.shadows[chunkX][chunkZ].method4676(SceneGraph.tileHeights[0], chunkX * 8, chunkZ * 8);
                }
            }
        }
        for (chunkX = 0; chunkX < 104; chunkX++) {
            for (chunkZ = 0; chunkZ < 104; chunkZ++) {
                Protocol.spawnGroundObject(chunkZ, chunkX);
            }
        }
        ScriptRunner.method2218();
        client.audioLoop();
        ChangeLocRequest.flush();
        client.method3768();
        Static231.aBoolean252 = false;
        if (GameShell.frame != null && Protocol.socket != null && client.gameState == 25) {
            Protocol.outboundBuffer.p1isaac(20);
            Protocol.outboundBuffer.p4(1057001181);
        }
        if (!LoginManager.dynamicMapRegion) {
            @Pc(815) int local815 = (LoginManager.centralZoneZ + 6) / 8;
            @Pc(821) int local821 = (LoginManager.centralZoneZ - 6) / 8;
            chunkX = (LoginManager.centralZoneX - 6) / 8;
            chunkZ = (LoginManager.centralZoneX + 6) / 8;
            for (@Pc(837) int local837 = chunkX - 1; local837 <= chunkZ + 1; local837++) {
                for (@Pc(850) int local850 = local821 - 1; local850 <= local815 + 1; local850++) {
                    if (local837 < chunkX || local837 > chunkZ || local850 < local821 || local850 > local815) {
                        client.js5Archive5.prefetchGroup(JagString.concatenate(new JagString[] { LoginManager.aClass100_558, JagString.parseInt(local837), LoginManager.UNDERSCORE, JagString.parseInt(local850) }));
                        client.js5Archive5.prefetchGroup(JagString.concatenate(new JagString[] { LoginManager.aClass100_1090, JagString.parseInt(local837), LoginManager.UNDERSCORE, JagString.parseInt(local850) }));
                    }
                }
            }
        }
        if (client.gameState == 28) {
            client.setGameState(10);
        } else {
            client.setGameState(30);
            if (Protocol.socket != null) {
                Protocol.outboundBuffer.p1isaac(110);
            }
        }
        WorldMap.method2720();
        client.audioLoop();
        GameShell.resetTimer();
    }

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "(I)V")
    public static void method1373() {
        Protocol.outboundBuffer.p1isaac(243);
        Protocol.outboundBuffer.p1(DisplayMode.getWindowMode());
        Protocol.outboundBuffer.p2(GameShell.canvasWidth);
        Protocol.outboundBuffer.p2(GameShell.canvasHeight);
        Protocol.outboundBuffer.p1(Preferences.antiAliasingMode);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BZ)V")
	public static void ping(@OriginalArg(1) boolean arg0) {
		client.audioLoop();
		if (client.gameState != 30 && client.gameState != 25) {
			return;
		}
		Static131.anInt3251++;
		if (Static131.anInt3251 < 50 && !arg0) {
			return;
		}
		Static131.anInt3251 = 0;
		if (!LoginManager.aBoolean247 && Protocol.socket != null) {
			Protocol.outboundBuffer.p1isaac(93);
			try {
				Protocol.socket.write(Protocol.outboundBuffer.data, Protocol.outboundBuffer.offset);
				Protocol.outboundBuffer.offset = 0;
			} catch (@Pc(53) IOException local53) {
				LoginManager.aBoolean247 = true;
			}
		}
		client.audioLoop();
	}

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public static void method28() {
        InterfaceList.redraw(Static40.aClass13_14);
        Static40.anInt4851++;
        if (Static44.aBoolean83 && Static146.aBoolean174) {
            @Pc(30) int local30 = Mouse.lastMouseX;
            local30 -= Static40.anInt5388;
            if (Static81.anInt2225 > local30) {
                local30 = Static81.anInt2225;
            }
            @Pc(41) int local41 = Mouse.lastMouseY;
            if (Static81.anInt2225 + Static40.aClass13_1.width < local30 - -Static40.aClass13_14.width) {
                local30 = Static81.anInt2225 + Static40.aClass13_1.width - Static40.aClass13_14.width;
            }
            local41 -= Static40.anInt4035;
            if (local41 < InterfaceList.anInt5103) {
                local41 = InterfaceList.anInt5103;
            }
            if (InterfaceList.anInt5103 + Static40.aClass13_1.height < local41 - -Static40.aClass13_14.height) {
                local41 = InterfaceList.anInt5103 + Static40.aClass13_1.height - Static40.aClass13_14.height;
            }
            @Pc(109) int local109 = local41 - Static36.anInt660;
            @Pc(114) int local114 = local30 - Static36.anInt3075;
            @Pc(122) int local122 = local30 + Static40.aClass13_1.scrollX - Static81.anInt2225;
            @Pc(130) int local130 = Static40.aClass13_1.scrollY + local41 - InterfaceList.anInt5103;
            @Pc(133) int local133 = Static40.aClass13_14.dragDeadzone;
            if (Static40.anInt4851 > Static40.aClass13_14.dragDeadtime && (local133 < local114 || -local133 > local114 || local109 > local133 || local109 < -local133)) {
                Static40.aBoolean172 = true;
            }
            @Pc(176) HookRequest local176;
            if (Static40.aClass13_14.onDragStart != null && Static40.aBoolean172) {
                local176 = new HookRequest();
                local176.source = Static40.aClass13_14;
                local176.arguments = Static40.aClass13_14.onDragStart;
                local176.mouseX = local122;
                local176.mouseY = local130;
                ScriptRunner.run(local176);
            }
            if (Mouse.pressedButton == 0) {
                if (Static40.aBoolean172) {
                    if (Static40.aClass13_14.onDragRelease != null) {
                        local176 = new HookRequest();
                        local176.mouseY = local130;
                        local176.target = InterfaceList.aClass13_12;
                        local176.mouseX = local122;
                        local176.arguments = Static40.aClass13_14.onDragRelease;
                        local176.source = Static40.aClass13_14;
                        ScriptRunner.run(local176);
                    }
                    if (InterfaceList.aClass13_12 != null && Static36.method938(Static40.aClass13_14) != null) {
                        Protocol.outboundBuffer.p1isaac(79);
                        Protocol.outboundBuffer.mp4(Static40.aClass13_14.id);
                        Protocol.outboundBuffer.ip2(InterfaceList.aClass13_12.createdComponentId);
                        Protocol.outboundBuffer.p4(InterfaceList.aClass13_12.id);
                        Protocol.outboundBuffer.ip2(Static40.aClass13_14.createdComponentId);
                    }
                } else if ((VarpDomain.anInt2952 == 1 || MiniMenu.method4640(MiniMenu.size - 1)) && MiniMenu.size > 2) {
                    Static226.method3901();
                } else if (MiniMenu.size > 0) {
                    Static59.method1372();
                }
                Static40.aClass13_14 = null;
            }
        } else if (Static40.anInt4851 > 1) {
            Static40.aClass13_14 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZI)V")
    public static void method10(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
        Protocol.outboundBuffer.p1isaac(132);
        Protocol.outboundBuffer.imp4(arg1);
        Protocol.outboundBuffer.ip2(arg0);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	public static void setDefaultChunksAtmosphere() {
		@Pc(9) Environment local9 = new Environment();
		for (@Pc(18) int local18 = 0; local18 < 13; local18++) {
			for (@Pc(25) int local25 = 0; local25 < 13; local25++) {
				Static73.aClass92ArrayArray1[local18][local25] = local9;
			}
		}
	}
}
