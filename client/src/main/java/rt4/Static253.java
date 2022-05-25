package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

    @OriginalMember(owner = "client!bi", name = "jb", descriptor = "Z")
    public static boolean aBoolean43 = true;
    @OriginalMember(owner = "client!wi", name = "bb", descriptor = "I")
    public static int anInt5854 = 0;
    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
	public static int anInt3325 = 0;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIZIII)V")
	public static void method4326(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		anInt3325++;
		method3711();
		if (!arg1) {
			method964(true);
			method3240(true);
			method964(false);
		}
		method3240(false);
		if (!arg1) {
			method3532();
		}
		method4239();
		if (GlRenderer.enabled) {
			Static115.method2314(arg3, arg4, arg0, arg2, true);
			arg2 = Static115.anInt983;
			arg4 = Static115.anInt773;
			arg3 = Static115.anInt4055;
			arg0 = Static115.anInt5377;
		}
		@Pc(59) int local59;
		@Pc(57) int local57;
		if (Camera.cameraType == 1) {
			local57 = Static230.anInt5161 + (int)Camera.yawTarget & 0x7FF;
			local59 = (int)Camera.pitchTarget;
			if (local59 < Static234.anInt5245 / 256) {
				local59 = Static234.anInt5245 / 256;
			}
			if (Static176.customCameraActive[4] && Camera.cameraAmplitude[4] + 128 > local59) {
				local59 = Camera.cameraAmplitude[4] + 128;
			}
			Static18.method555(Camera.cameraX, arg0, SceneGraph.getTileHeight(Player.level, PlayerList.self.xFine, PlayerList.self.zFine) - 50, 600 - -(local59 * 3), local57, Camera.cameraZ, local59);
		}
		local57 = Static5.anInt40;
		local59 = Camera.renderX;
		@Pc(121) int local121 = Camera.renderZ;
		@Pc(123) int local123 = Camera.cameraPitch;
		@Pc(125) int local125 = Camera.cameraYaw;
		@Pc(127) int local127;
		@Pc(171) int local171;
		for (local127 = 0; local127 < 5; local127++) {
			if (Static176.customCameraActive[local127]) {
				local171 = (int) ((double) -Camera.cameraJitter[local127] + (double) (Camera.cameraJitter[local127] * 2 + 1) * Math.random() + Math.sin((double) Static31.anIntArray76[local127] * ((double) Camera.cameraFrequency[local127] / 100.0D)) * (double) Camera.cameraAmplitude[local127]);
				if (local127 == 3) {
					Camera.cameraYaw = local171 + Camera.cameraYaw & 0x7FF;
				}
				if (local127 == 4) {
					Camera.cameraPitch += local171;
					if (Camera.cameraPitch < 128) {
						Camera.cameraPitch = 128;
					}
					if (Camera.cameraPitch > 383) {
						Camera.cameraPitch = 383;
					}
				}
				if (local127 == 2) {
					Camera.renderZ += local171;
				}
				if (local127 == 1) {
					Static5.anInt40 += local171;
				}
				if (local127 == 0) {
					Camera.renderX += local171;
				}
			}
		}
		Static252.method4302();
		if (GlRenderer.enabled) {
			GlRaster.setClip(arg2, arg4, arg2 + arg3, arg4 - -arg0);
			@Pc(248) float local248 = (float) Camera.cameraPitch * 0.17578125F;
			@Pc(253) float local253 = (float) Camera.cameraYaw * 0.17578125F;
			if (Camera.cameraType == 3) {
				local248 = Static146.aFloat15 * 360.0F / 6.2831855F;
				local253 = Static84.aFloat10 * 360.0F / 6.2831855F;
			}
			GlRenderer.method4171(arg2, arg4, arg3, arg0, arg3 / 2 + arg2, arg4 - -(arg0 / 2), local248, local253, Static115.anInt5029, Static115.anInt5029);
		} else {
			SoftwareRaster.setClip(arg2, arg4, arg3 + arg2, arg0 + arg4);
			Rasteriser.prepare();
		}
		if (Static40.aBoolean108 || Static155.anInt3751 < arg2 || Static155.anInt3751 >= arg3 + arg2 || arg4 > Static60.anInt1892 || arg0 + arg4 <= Static60.anInt1892) {
			Static39.aBoolean77 = false;
			Static2.anInt7 = 0;
		} else {
			Static39.aBoolean77 = true;
			Static2.anInt7 = 0;
			local171 = Rasteriser.screenUpperX;
			@Pc(344) int local344 = Rasteriser.screenLowerY;
			local127 = Rasteriser.screenLowerX;
			Static150.anInt3582 = local127 + (local171 - local127) * (-arg2 + Static155.anInt3751) / arg3;
			@Pc(361) int local361 = Rasteriser.screenUpperY;
			Static34.anInt1053 = (local361 - local344) * (Static60.anInt1892 - arg4) / arg0 + local344;
		}
		client.audioLoop();
		@Pc(387) byte local387 = Static236.method4047() == 2 ? (byte) anInt3325 : 1;
		if (GlRenderer.enabled) {
			GlRenderer.restoreLighting();
			GlRenderer.setDepthTestEnabled(true);
			GlRenderer.setFogEnabled(true);
			if (client.gameState == 10) {
				local171 = Static103.method2235(Static178.anInt4247, Camera.renderZ >> 10, Preferences.brightness, Camera.renderX >> 10);
			} else {
				local171 = Static103.method2235(Static178.anInt4247, PlayerList.self.movementQueueZ[0] >> 3, Preferences.brightness, PlayerList.self.movementQueueX[0] >> 3);
			}
			LightingManager.method2394(client.loop, !Preferences.flickeringEffectsOn);
			GlRenderer.clearColorAndDepthBuffers(local171);
			Static143.method2731(Camera.cameraPitch, Camera.renderZ, Static5.anInt40, Camera.renderX, Camera.cameraYaw);
			GlRenderer.anInt5323 = client.loop;
			Static156.method2954(Camera.renderX, Static5.anInt40, Camera.renderZ, Camera.cameraPitch, Camera.cameraYaw, Static266.aByteArrayArrayArray15, Static79.anIntArray205, Static149.anIntArray338, Static267.anIntArray518, Static50.anIntArray134, Static243.anIntArray476, Player.level + 1, local387, PlayerList.self.xFine >> 7, PlayerList.self.zFine >> 7);
			Static263.aBoolean299 = true;
			LightingManager.method2390();
			Static143.method2731(0, 0, 0, 0, 0);
			client.audioLoop();
			Static223.method3858();
			method2726(arg4, arg3, arg2, Static115.anInt5029, arg0, Static115.anInt5029);
			Static233.method4000(arg3, arg2, arg0, Static115.anInt5029, Static115.anInt5029, arg4);
		} else {
			SoftwareRaster.fillRect(arg2, arg4, arg3, arg0, 0);
			Static156.method2954(Camera.renderX, Static5.anInt40, Camera.renderZ, Camera.cameraPitch, Camera.cameraYaw, Static266.aByteArrayArrayArray15, Static79.anIntArray205, Static149.anIntArray338, Static267.anIntArray518, Static50.anIntArray134, Static243.anIntArray476, Player.level + 1, local387, PlayerList.self.xFine >> 7, PlayerList.self.zFine >> 7);
			client.audioLoop();
			Static223.method3858();
			method2726(arg4, arg3, arg2, 256, arg0, 256);
			Static233.method4000(arg3, arg2, arg0, 256, 256, arg4);
		}
		((Js5GlTextureProvider) Rasteriser.textureProvider).method3239(Static178.anInt4247);
		Static115.method2310(arg3, arg4, arg0, arg2);
		Camera.cameraPitch = local123;
		Camera.renderZ = local121;
		Static5.anInt40 = local57;
		Camera.renderX = local59;
		Camera.cameraYaw = local125;
		if (aBoolean43 && client.js5NetQueue.method2328() == 0) {
			aBoolean43 = false;
		}
		if (aBoolean43) {
			if (GlRenderer.enabled) {
				GlRaster.method1186(arg2, arg4, arg3, arg0, 0);
			} else {
				SoftwareRaster.fillRect(arg2, arg4, arg3, arg0, 0);
			}
			Static114.drawTextOnScreen(false, LocalizedText.LOADING);
		}
		if (!arg1 && !aBoolean43 && !Static40.aBoolean108 && arg2 <= Static155.anInt3751 && arg3 + arg2 > Static155.anInt3751 && arg4 <= Static60.anInt1892 && arg0 + arg4 > Static60.anInt1892) {
			MiniMenu.addEntries(arg4, arg3, arg0, arg2, Static60.anInt1892, Static155.anInt3751);
		}
	}

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII)V")
    public static void method2726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
        anInt5854 = 0;
        @Pc(5) int local5;
        @Pc(642) int local642;
        @Pc(74) int local74;
        @Pc(265) int local265;
        @Pc(310) int local310;
        @Pc(359) int local359;
        @Pc(639) int local639;
        for (local5 = -1; local5 < PlayerList.size + NpcList.size; local5++) {
            @Pc(17) PathingEntity local17;
            if (local5 == -1) {
                local17 = PlayerList.self;
            } else if (PlayerList.size > local5) {
                local17 = PlayerList.players[PlayerList.ids[local5]];
            } else {
                local17 = NpcList.npcs[NpcList.ids[local5 - PlayerList.size]];
            }
            if (local17 != null && local17.method2682()) {
                @Pc(58) NpcType local58;
                if (local17 instanceof Npc) {
                    local58 = ((Npc) local17).type;
                    if (local58.multiNpcs != null) {
                        local58 = local58.getMultiNpc();
                    }
                    if (local58 == null) {
                        continue;
                    }
                }
                @Pc(161) int local161;
                if (local5 >= PlayerList.size) {
                    local58 = ((Npc) local17).type;
                    if (local58.multiNpcs != null) {
                        local58 = local58.getMultiNpc();
                    }
                    if (local58.prayerIcon >= 0 && Sprites.headiconPrayers.length > local58.prayerIcon) {
                        if (local58.anInt3730 == -1) {
                            local265 = local17.method2691() + 15;
                        } else {
                            local265 = local58.anInt3730 + 15;
                        }
                        Static180.method3326(arg4 >> 1, arg3, local17, arg5, local265, arg1 >> 1);
                        if (Static65.anInt1951 > -1) {
                            Sprites.headiconPrayers[local58.prayerIcon].render(arg2 + Static65.anInt1951 - 12, arg0 + -30 - -Static16.anInt548);
                        }
                    }
                    @Pc(308) MapMarker[] local308 = Static143.hintMapMarkers;
                    for (local310 = 0; local310 < local308.length; local310++) {
                        @Pc(322) MapMarker local322 = local308[local310];
                        if (local322 != null && local322.type == 1 && local322.actorTargetId == NpcList.ids[local5 - PlayerList.size] && client.loop % 20 < 10) {
                            if (local58.anInt3730 == -1) {
                                local359 = local17.method2691() + 15;
                            } else {
                                local359 = local58.anInt3730 + 15;
                            }
                            Static180.method3326(arg4 >> 1, arg3, local17, arg5, local359, arg1 >> 1);
                            if (Static65.anInt1951 > -1) {
                                Sprites.headhints[local322.anInt4048].render(arg2 + Static65.anInt1951 - 12, Static16.anInt548 + -28 + arg0);
                            }
                        }
                    }
                } else {
                    local74 = 30;
                    @Pc(77) Player local77 = (Player) local17;
                    if (local77.anInt1669 != -1 || local77.anInt1649 != -1) {
                        Static180.method3326(arg4 >> 1, arg3, local17, arg5, local17.method2691() + 15, arg1 >> 1);
                        if (Static65.anInt1951 > -1) {
                            if (local77.anInt1669 != -1) {
                                Sprites.headiconPks[local77.anInt1669].render(Static65.anInt1951 + arg2 - 12, arg0 + -30 + Static16.anInt548);
                                local74 += 25;
                            }
                            if (local77.anInt1649 != -1) {
                                Sprites.headiconPrayers[local77.anInt1649].render(arg2 + Static65.anInt1951 - 12, arg0 - (-Static16.anInt548 + local74));
                                local74 += 25;
                            }
                        }
                    }
                    if (local5 >= 0) {
                        @Pc(159) MapMarker[] local159 = Static143.hintMapMarkers;
                        for (local161 = 0; local161 < local159.length; local161++) {
                            @Pc(173) MapMarker local173 = local159[local161];
                            if (local173 != null && local173.type == 10 && PlayerList.ids[local5] == local173.actorTargetId) {
                                Static180.method3326(arg4 >> 1, arg3, local17, arg5, local17.method2691() + 15, arg1 >> 1);
                                if (Static65.anInt1951 > -1) {
                                    Sprites.headhints[local173.anInt4048].render(arg2 + Static65.anInt1951 - 12, arg0 + (Static16.anInt548 - local74));
                                }
                            }
                        }
                    }
                }
                if (local17.chatMessage != null && (local5 >= PlayerList.size || Chat.publicFilter == 0 || Chat.publicFilter == 3 || Chat.publicFilter == 1 && FriendsList.contains(((Player) local17).username))) {
                    Static180.method3326(arg4 >> 1, arg3, local17, arg5, local17.method2691(), arg1 >> 1);
                    if (Static65.anInt1951 > -1 && anInt5854 < Static191.anInt4506) {
                        Static191.anIntArray389[anInt5854] = Fonts.b12Full.getStringWidth(local17.chatMessage) / 2;
                        Static191.anIntArray387[anInt5854] = Fonts.b12Full.lineHeight;
                        Static191.anIntArray385[anInt5854] = Static65.anInt1951;
                        Static191.anIntArray392[anInt5854] = Static16.anInt548;
                        Static191.anIntArray390[anInt5854] = local17.chatColor;
                        Static191.anIntArray391[anInt5854] = local17.chatEffect;
                        Static191.anIntArray384[anInt5854] = local17.chatLoops;
                        Static191.aClass100Array132[anInt5854] = local17.chatMessage;
                        anInt5854++;
                    }
                }
                if (local17.hitpointsBarVisibleUntil > client.loop) {
                    @Pc(508) Sprite local508 = Sprites.hitbars[0];
                    @Pc(512) Sprite local512 = Sprites.hitbars[1];
                    if (local17 instanceof Npc) {
                        @Pc(518) Npc local518 = (Npc) local17;
                        @Pc(528) Sprite[] local528 = (Sprite[]) HitBarList.hitBars.get((long) local518.type.hitBarId);
                        if (local528 == null) {
                            local528 = SpriteLoader.loadAlphaSprites(local518.type.hitBarId, client.js5Archive8);
                            if (local528 != null) {
                                HitBarList.hitBars.put(local528, (long) local518.type.hitBarId);
                            }
                        }
                        if (local528 != null && local528.length == 2) {
                            local512 = local528[1];
                            local508 = local528[0];
                        }
                        @Pc(571) NpcType local571 = local518.type;
                        if (local571.anInt3730 == -1) {
                            local310 = local17.method2691();
                        } else {
                            local310 = local571.anInt3730;
                        }
                    } else {
                        local310 = local17.method2691();
                    }
                    Static180.method3326(arg4 >> 1, arg3, local17, arg5, local508.height + local310 + 10, arg1 >> 1);
                    if (Static65.anInt1951 > -1) {
                        local161 = Static65.anInt1951 + arg2 - (local508.width >> 1);
                        local359 = Static16.anInt548 + arg0 - 3;
                        local508.render(local161, local359);
                        local639 = local508.width * local17.hitpointsBar / 255;
                        local642 = local508.height;
                        if (GlRenderer.enabled) {
                            GlRaster.method1183(local161, local359, local161 + local639, local359 + local642);
                        } else {
                            SoftwareRaster.method2498(local161, local359, local161 + local639, local642 + local359);
                        }
                        local512.render(local161, local359);
                        if (GlRenderer.enabled) {
                            GlRaster.setClip(arg2, arg0, arg1 + arg2, arg0 - -arg4);
                        } else {
                            SoftwareRaster.setClip(arg2, arg0, arg1 + arg2, arg4 + arg0);
                        }
                    }
                }
                for (local74 = 0; local74 < 4; local74++) {
                    if (local17.anIntArray319[local74] > client.loop) {
                        if (local17 instanceof Npc) {
                            @Pc(725) Npc local725 = (Npc) local17;
                            @Pc(728) NpcType local728 = local725.type;
                            if (local728.anInt3730 == -1) {
                                local265 = local17.method2691() / 2;
                            } else {
                                local265 = local728.anInt3730 / 2;
                            }
                        } else {
                            local265 = local17.method2691() / 2;
                        }
                        Static180.method3326(arg4 >> 1, arg3, local17, arg5, local265, arg1 >> 1);
                        if (Static65.anInt1951 > -1) {
                            if (local74 == 1) {
                                Static16.anInt548 -= 20;
                            }
                            if (local74 == 2) {
                                Static16.anInt548 -= 10;
                                Static65.anInt1951 -= 15;
                            }
                            if (local74 == 3) {
                                Static16.anInt548 -= 10;
                                Static65.anInt1951 += 15;
                            }
                            Sprites.hitmarks[local17.anIntArray321[local74]].render(arg2 + Static65.anInt1951 - 12, arg0 + Static16.anInt548 - 12);
                            Fonts.p11Full.renderCenter(JagString.parseInt(local17.anIntArray322[local74]), Static65.anInt1951 + arg2 - 1, Static16.anInt548 + 3 + arg0, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (local5 = 0; local5 < anInt5854; local5++) {
            local74 = Static191.anIntArray392[local5];
            @Pc(859) int local859 = Static191.anIntArray385[local5];
            local310 = Static191.anIntArray387[local5];
            local265 = Static191.anIntArray389[local5];
            @Pc(869) boolean local869 = true;
            while (local869) {
                local869 = false;
                for (local359 = 0; local359 < local5; local359++) {
                    if (Static191.anIntArray392[local359] - Static191.anIntArray387[local359] < local74 + 2 && local74 - local310 < Static191.anIntArray392[local359] - -2 && local859 - local265 < Static191.anIntArray385[local359] + Static191.anIntArray389[local359] && Static191.anIntArray385[local359] - Static191.anIntArray389[local359] < local265 + local859 && Static191.anIntArray392[local359] - Static191.anIntArray387[local359] < local74) {
                        local74 = Static191.anIntArray392[local359] - Static191.anIntArray387[local359];
                        local869 = true;
                    }
                }
            }
            Static65.anInt1951 = Static191.anIntArray385[local5];
            Static16.anInt548 = Static191.anIntArray392[local5] = local74;
            @Pc(962) JagString local962 = Static191.aClass100Array132[local5];
            if (Static79.anInt2157 == 0) {
                local639 = 16776960;
                if (Static191.anIntArray390[local5] < 6) {
                    local639 = Static16.anIntArray52[Static191.anIntArray390[local5]];
                }
                if (Static191.anIntArray390[local5] == 6) {
                    local639 = anInt3325 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (Static191.anIntArray390[local5] == 7) {
                    local639 = anInt3325 % 20 < 10 ? 255 : 65535;
                }
                if (Static191.anIntArray390[local5] == 8) {
                    local639 = anInt3325 % 20 >= 10 ? 8454016 : 45056;
                }
                if (Static191.anIntArray390[local5] == 9) {
                    local642 = 150 - Static191.anIntArray384[local5];
                    if (local642 < 50) {
                        local639 = local642 * 1280 + 16711680;
                    } else if (local642 < 100) {
                        local639 = 16776960 + 16384000 - local642 * 327680;
                    } else if (local642 < 150) {
                        local639 = local642 * 5 + 65280 - 500;
                    }
                }
                if (Static191.anIntArray390[local5] == 10) {
                    local642 = 150 - Static191.anIntArray384[local5];
                    if (local642 < 50) {
                        local639 = local642 * 5 + 16711680;
                    } else if (local642 < 100) {
                        local639 = 16711935 - (local642 - 50) * 327680;
                    } else if (local642 < 150) {
                        local639 = local642 * 327680 + 255 + 500 - local642 * 5 - 32768000;
                    }
                }
                if (Static191.anIntArray390[local5] == 11) {
                    local642 = 150 - Static191.anIntArray384[local5];
                    if (local642 < 50) {
                        local639 = 16777215 - local642 * 327685;
                    } else if (local642 < 100) {
                        local639 = local642 * 327685 + 65280 - 16384250;
                    } else if (local642 < 150) {
                        local639 = 16777215 + 32768000 - local642 * 327680;
                    }
                }
                if (Static191.anIntArray391[local5] == 0) {
                    Fonts.b12Full.renderCenter(local962, Static65.anInt1951 + arg2, arg0 + Static16.anInt548, local639, 0);
                }
                if (Static191.anIntArray391[local5] == 1) {
                    Fonts.b12Full.renderWave(local962, arg2 + Static65.anInt1951, Static16.anInt548 + arg0, local639, anInt3325);
                }
                if (Static191.anIntArray391[local5] == 2) {
                    Fonts.b12Full.renderWave2(local962, arg2 + Static65.anInt1951, arg0 - -Static16.anInt548, local639, anInt3325);
                }
                if (Static191.anIntArray391[local5] == 3) {
                    Fonts.b12Full.renderShake(local962, arg2 + Static65.anInt1951, Static16.anInt548 + arg0, local639, anInt3325, 150 - Static191.anIntArray384[local5]);
                }
                if (Static191.anIntArray391[local5] == 4) {
                    local642 = (150 - Static191.anIntArray384[local5]) * (Fonts.b12Full.getStringWidth(local962) + 100) / 150;
                    if (GlRenderer.enabled) {
                        GlRaster.method1183(Static65.anInt1951 + arg2 - 50, arg0, Static65.anInt1951 + arg2 + 50, arg4 + arg0);
                    } else {
                        SoftwareRaster.method2498(arg2 + Static65.anInt1951 - 50, arg0, Static65.anInt1951 + arg2 + 50, arg4 + arg0);
                    }
                    Fonts.b12Full.renderLeft(local962, arg2 + Static65.anInt1951 + 50 - local642, arg0 + Static16.anInt548, local639, 0);
                    if (GlRenderer.enabled) {
                        GlRaster.setClip(arg2, arg0, arg1 + arg2, arg4 + arg0);
                    } else {
                        SoftwareRaster.setClip(arg2, arg0, arg2 + arg1, arg0 + arg4);
                    }
                }
                if (Static191.anIntArray391[local5] == 5) {
                    @Pc(1372) int local1372 = 0;
                    local642 = 150 - Static191.anIntArray384[local5];
                    if (GlRenderer.enabled) {
                        GlRaster.method1183(arg2, Static16.anInt548 + arg0 - Fonts.b12Full.lineHeight - 1, arg1 + arg2, arg0 + Static16.anInt548 + 5);
                    } else {
                        SoftwareRaster.method2498(arg2, Static16.anInt548 + arg0 - Fonts.b12Full.lineHeight - 1, arg2 + arg1, Static16.anInt548 + arg0 + 5);
                    }
                    if (local642 < 25) {
                        local1372 = local642 - 25;
                    } else if (local642 > 125) {
                        local1372 = local642 - 125;
                    }
                    Fonts.b12Full.renderCenter(local962, Static65.anInt1951 + arg2, local1372 + arg0 + Static16.anInt548, local639, 0);
                    if (GlRenderer.enabled) {
                        GlRaster.setClip(arg2, arg0, arg2 + arg1, arg0 + arg4);
                    } else {
                        SoftwareRaster.setClip(arg2, arg0, arg2 + arg1, arg0 + arg4);
                    }
                }
            } else {
                Fonts.b12Full.renderCenter(local962, arg2 + Static65.anInt1951, arg0 + Static16.anInt548, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static void method3711() {
        for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
            for (@Pc(14) int local14 = 0; local14 < 104; local14++) {
                Static31.anIntArrayArray6[local7][local14] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(ZI)V")
    public static void method964(@OriginalArg(0) boolean arg0) {
        @Pc(3) int local3 = PlayerList.size;
        if (LoginManager.mapFlagX == PlayerList.self.xFine >> 7 && PlayerList.self.zFine >> 7 == LoginManager.mapFlagZ) {
            LoginManager.mapFlagX = 0;
        }
        if (arg0) {
            local3 = 1;
        }
        @Pc(28) int local28;
        @Pc(39) Player local39;
        @Pc(82) int local82;
        @Pc(182) int local182;
        @Pc(200) int local200;
        @Pc(214) int local214;
        @Pc(223) int local223;
        @Pc(106) int local106;
        for (local28 = 0; local28 < local3; local28++) {
            if (arg0) {
                local39 = PlayerList.self;
            } else {
                local39 = PlayerList.players[PlayerList.ids[local28]];
            }
            if (local39 != null && local39.method2682()) {
                @Pc(55) int local55 = local39.getSize();
                @Pc(77) int local77;
                if (local55 == 1) {
                    if ((local39.xFine & 0x7F) == 64 && (local39.zFine & 0x7F) == 64) {
                        local77 = local39.xFine >> 7;
                        local82 = local39.zFine >> 7;
                        if (local77 >= 0 && local77 < 104 && local82 >= 0 && local82 < 104) {
                            local106 = Static31.anIntArrayArray6[local77][local82]++;
                        }
                    }
                } else if (((local55 & 0x1) != 0 || (local39.xFine & 0x7F) == 0 && (local39.zFine & 0x7F) == 0) && ((local55 & 0x1) != 1 || (local39.xFine & 0x7F) == 64 && (local39.zFine & 0x7F) == 64)) {
                    local77 = local39.xFine - local55 * 64 >> 7;
                    local82 = local39.zFine - local55 * 64 >> 7;
                    local182 = local39.getSize() + local77;
                    if (local182 > 104) {
                        local182 = 104;
                    }
                    if (local77 < 0) {
                        local77 = 0;
                    }
                    local200 = local82 + local39.getSize();
                    if (local82 < 0) {
                        local82 = 0;
                    }
                    if (local200 > 104) {
                        local200 = 104;
                    }
                    for (local214 = local77; local214 < local182; local214++) {
                        for (local223 = local82; local223 < local200; local223++) {
                            local106 = Static31.anIntArrayArray6[local214][local223]++;
                        }
                    }
                }
            }
        }
        label220: for (local28 = 0; local28 < local3; local28++) {
            @Pc(272) long local272;
            if (arg0) {
                local39 = PlayerList.self;
                local272 = 8791798054912L;
            } else {
                local39 = PlayerList.players[PlayerList.ids[local28]];
                local272 = (long) PlayerList.ids[local28] << 32;
            }
            if (local39 != null && local39.method2682()) {
                local39.aBoolean98 = false;
                if ((Preferences.manyIdleAnimations && PlayerList.size > 200 || PlayerList.size > 50) && !arg0 && local39.movementSeqId == local39.getBasType().idleAnimationId) {
                    local39.aBoolean98 = true;
                }
                local82 = local39.getSize();
                if (local82 == 1) {
                    if ((local39.xFine & 0x7F) == 64 && (local39.zFine & 0x7F) == 64) {
                        local182 = local39.xFine >> 7;
                        local200 = local39.zFine >> 7;
                        if (local182 < 0 || local182 >= 104 || local200 < 0 || local200 >= 104) {
                            continue;
                        }
                        if (Static31.anIntArrayArray6[local182][local200] > 1) {
                            local106 = Static31.anIntArrayArray6[local182][local200]--;
                            continue;
                        }
                    }
                } else if ((local82 & 0x1) == 0 && (local39.xFine & 0x7F) == 0 && (local39.zFine & 0x7F) == 0 || (local82 & 0x1) == 1 && (local39.xFine & 0x7F) == 64 && (local39.zFine & 0x7F) == 0) {
                    local182 = local39.xFine - local82 * 64 >> 7;
                    local214 = local82 + local182;
                    local200 = local39.zFine - local82 * 64 >> 7;
                    if (local214 > 104) {
                        local214 = 104;
                    }
                    if (local182 < 0) {
                        local182 = 0;
                    }
                    local223 = local82 + local200;
                    if (local200 < 0) {
                        local200 = 0;
                    }
                    @Pc(468) boolean local468 = true;
                    if (local223 > 104) {
                        local223 = 104;
                    }
                    @Pc(476) int local476;
                    @Pc(485) int local485;
                    for (local476 = local182; local476 < local214; local476++) {
                        for (local485 = local200; local485 < local223; local485++) {
                            if (Static31.anIntArrayArray6[local476][local485] <= 1) {
                                local468 = false;
                                break;
                            }
                        }
                    }
                    if (local468) {
                        local476 = local182;
                        while (true) {
                            if (local476 >= local214) {
                                continue label220;
                            }
                            for (local485 = local200; local485 < local223; local485++) {
                                local106 = Static31.anIntArrayArray6[local476][local485]--;
                            }
                            local476++;
                        }
                    }
                }
                if (local39.attachment == null || client.loop < local39.anInt3390 || local39.anInt3375 <= client.loop) {
                    local39.anInt3424 = SceneGraph.getTileHeight(Player.level, local39.xFine, local39.zFine);
                    Static43.method1141(Player.level, local39.xFine, local39.zFine, local39.anInt3424, (local82 - 1) * 64 + 60, local39, local39.anInt3381, local272, local39.aBoolean171);
                } else {
                    local39.aBoolean98 = false;
                    local39.anInt3424 = SceneGraph.getTileHeight(Player.level, local39.xFine, local39.zFine);
                    Static184.method3387(Player.level, local39.xFine, local39.zFine, local39.anInt3424, local39, local39.anInt3381, local272, local39.atachmentX0, local39.attachmentZ0, local39.attachmentX1, local39.attachmentZ1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(IZ)V")
	public static void method3240(@OriginalArg(1) boolean arg0) {
		@Pc(7) int local7;
		@Pc(16) Npc local16;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(133) int local133;
		@Pc(149) int local149;
		@Pc(158) int local158;
		@Pc(171) int local171;
		for (local7 = 0; local7 < NpcList.size; local7++) {
			local16 = NpcList.npcs[NpcList.ids[local7]];
			if (local16 != null && local16.method2682() && local16.type.aBoolean182 == arg0 && local16.type.isMultiNpcValid()) {
				@Pc(42) int local42 = local16.getSize();
				@Pc(97) int local97;
				if (local42 == 1) {
					if ((local16.xFine & 0x7F) == 64 && (local16.zFine & 0x7F) == 64) {
						local97 = local16.xFine >> 7;
						local107 = local16.zFine >> 7;
						if (local97 >= 0 && local97 < 104 && local107 >= 0 && local107 < 104) {
							local171 = Static31.anIntArrayArray6[local97][local107]++;
						}
					}
				} else if (((local42 & 0x1) != 0 || (local16.xFine & 0x7F) == 0 && (local16.zFine & 0x7F) == 0) && ((local42 & 0x1) != 1 || (local16.xFine & 0x7F) == 64 && (local16.zFine & 0x7F) == 64)) {
					local97 = local16.xFine - local42 * 64 >> 7;
					local107 = local16.zFine - local42 * 64 >> 7;
					local113 = local16.getSize() + local97;
					if (local97 < 0) {
						local97 = 0;
					}
					if (local113 > 104) {
						local113 = 104;
					}
					local133 = local107 + local16.getSize();
					if (local107 < 0) {
						local107 = 0;
					}
					if (local133 > 104) {
						local133 = 104;
					}
					for (local149 = local97; local149 < local113; local149++) {
						for (local158 = local107; local158 < local133; local158++) {
							local171 = Static31.anIntArrayArray6[local149][local158]++;
						}
					}
				}
			}
		}
		label200: for (local7 = 0; local7 < NpcList.size; local7++) {
			local16 = NpcList.npcs[NpcList.ids[local7]];
			@Pc(262) long local262 = (long) NpcList.ids[local7] << 32 | 0x20000000L;
			if (local16 != null && local16.method2682() && local16.type.aBoolean182 == arg0 && local16.type.isMultiNpcValid()) {
				local107 = local16.getSize();
				if (local107 == 1) {
					if ((local16.xFine & 0x7F) == 64 && (local16.zFine & 0x7F) == 64) {
						local113 = local16.xFine >> 7;
						local133 = local16.zFine >> 7;
						if (local113 < 0 || local113 >= 104 || local133 < 0 || local133 >= 104) {
							continue;
						}
						if (Static31.anIntArrayArray6[local113][local133] > 1) {
							local171 = Static31.anIntArrayArray6[local113][local133]--;
							continue;
						}
					}
				} else if ((local107 & 0x1) == 0 && (local16.xFine & 0x7F) == 0 && (local16.zFine & 0x7F) == 0 || (local107 & 0x1) == 1 && (local16.xFine & 0x7F) == 64 && (local16.zFine & 0x7F) == 64) {
					local113 = local16.xFine - local107 * 64 >> 7;
					local133 = local16.zFine - local107 * 64 >> 7;
					local158 = local133 + local107;
					if (local133 < 0) {
						local133 = 0;
					}
					@Pc(368) boolean local368 = true;
					local149 = local113 + local107;
					if (local158 > 104) {
						local158 = 104;
					}
					if (local113 < 0) {
						local113 = 0;
					}
					if (local149 > 104) {
						local149 = 104;
					}
					@Pc(396) int local396;
					@Pc(401) int local401;
					for (local396 = local113; local396 < local149; local396++) {
						for (local401 = local133; local401 < local158; local401++) {
							if (Static31.anIntArrayArray6[local396][local401] <= 1) {
								local368 = false;
								break;
							}
						}
					}
					if (local368) {
						local396 = local113;
						while (true) {
							if (local396 >= local149) {
								continue label200;
							}
							for (local401 = local133; local401 < local158; local401++) {
								local171 = Static31.anIntArrayArray6[local396][local401]--;
							}
							local396++;
						}
					}
				}
				if (!local16.type.aBoolean183) {
					local262 |= Long.MIN_VALUE;
				}
				local16.anInt3424 = SceneGraph.getTileHeight(Player.level, local16.xFine, local16.zFine);
				Static43.method1141(Player.level, local16.xFine, local16.zFine, local16.anInt3424, local107 * 64 + 60 - 64, local16, local16.anInt3381, local262, local16.aBoolean171);
			}
		}
	}

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "(I)V")
	public static void method3532() {
		for (@Pc(16) ProjAnimNode local16 = (ProjAnimNode) Static217.aClass69_116.head(); local16 != null; local16 = (ProjAnimNode) Static217.aClass69_116.next()) {
			@Pc(21) ProjAnim local21 = local16.aClass8_Sub6_1;
			if (Player.level != local21.anInt4810 || local21.anInt4800 < client.loop) {
				local16.unlink();
			} else if (client.loop >= local21.anInt4822) {
				if (local21.anInt4819 > 0) {
					@Pc(54) Npc local54 = NpcList.npcs[local21.anInt4819 - 1];
					if (local54 != null && local54.xFine >= 0 && local54.xFine < 13312 && local54.zFine >= 0 && local54.zFine < 13312) {
						local21.method3705(local54.zFine, client.loop, SceneGraph.getTileHeight(local21.anInt4810, local54.xFine, local54.zFine) - local21.anInt4805, local54.xFine);
					}
				}
				if (local21.anInt4819 < 0) {
					@Pc(102) int local102 = -local21.anInt4819 - 1;
					@Pc(107) Player local107;
					if (PlayerList.selfId == local102) {
						local107 = PlayerList.self;
					} else {
						local107 = PlayerList.players[local102];
					}
					if (local107 != null && local107.xFine >= 0 && local107.xFine < 13312 && local107.zFine >= 0 && local107.zFine < 13312) {
						local21.method3705(local107.zFine, client.loop, SceneGraph.getTileHeight(local21.anInt4810, local107.xFine, local107.zFine) - local21.anInt4805, local107.xFine);
					}
				}
				local21.method3704(Static178.anInt4247);
				Static43.method1141(Player.level, (int) local21.aDouble8, (int) local21.aDouble3, (int) local21.aDouble6, 60, local21, local21.anInt4821, -1L, false);
			}
		}
	}

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
	public static void method4239() {
		for (@Pc(9) SpotAnimNode local9 = (SpotAnimNode) Static99.aClass69_64.head(); local9 != null; local9 = (SpotAnimNode) Static99.aClass69_64.next()) {
			@Pc(15) SpotAnim local15 = local9.aClass8_Sub2_1;
			if (local15.anInt606 != Player.level || local15.aBoolean41) {
				local9.unlink();
			} else if (local15.anInt590 <= client.loop) {
				local15.method558(Static178.anInt4247);
				if (local15.aBoolean41) {
					local9.unlink();
				} else {
					Static43.method1141(local15.anInt606, local15.anInt604, local15.anInt598, local15.anInt599, 60, local15, 0, -1L, false);
				}
			}
		}
	}
}
