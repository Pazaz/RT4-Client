package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

    @OriginalMember(owner = "client!bi", name = "jb", descriptor = "Z")
    public static boolean aBoolean43 = true;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIZIII)V")
	public static void method4326(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static136.anInt3325++;
		Static210.method3711();
		if (!arg1) {
			Static38.method964(true);
			Static173.method3240(true);
			Static38.method964(false);
		}
		Static173.method3240(false);
		if (!arg1) {
			Static195.method3532();
		}
		Static246.method4239();
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
			if (Static176.customCameraActive[4] && Static276.cameraAmplitude[4] + 128 > local59) {
				local59 = Static276.cameraAmplitude[4] + 128;
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
				local171 = (int) ((double) -Camera.cameraJitter[local127] + (double) (Camera.cameraJitter[local127] * 2 + 1) * Math.random() + Math.sin((double) Static31.anIntArray76[local127] * ((double) Static202.cameraFrequency[local127] / 100.0D)) * (double) Static276.cameraAmplitude[local127]);
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
		@Pc(387) byte local387 = Static236.method4047() == 2 ? (byte) Static136.anInt3325 : 1;
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
        Static277.anInt5854 = 0;
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
                    if (Static65.anInt1951 > -1 && Static277.anInt5854 < Static191.anInt4506) {
                        Static191.anIntArray389[Static277.anInt5854] = Fonts.b12Full.getStringWidth(local17.chatMessage) / 2;
                        Static191.anIntArray387[Static277.anInt5854] = Fonts.b12Full.lineHeight;
                        Static191.anIntArray385[Static277.anInt5854] = Static65.anInt1951;
                        Static191.anIntArray392[Static277.anInt5854] = Static16.anInt548;
                        Static191.anIntArray390[Static277.anInt5854] = local17.chatColor;
                        Static191.anIntArray391[Static277.anInt5854] = local17.chatEffect;
                        Static191.anIntArray384[Static277.anInt5854] = local17.chatLoops;
                        Static191.aClass100Array132[Static277.anInt5854] = local17.chatMessage;
                        Static277.anInt5854++;
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
        for (local5 = 0; local5 < Static277.anInt5854; local5++) {
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
                    local639 = Static136.anInt3325 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (Static191.anIntArray390[local5] == 7) {
                    local639 = Static136.anInt3325 % 20 < 10 ? 255 : 65535;
                }
                if (Static191.anIntArray390[local5] == 8) {
                    local639 = Static136.anInt3325 % 20 >= 10 ? 8454016 : 45056;
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
                    Fonts.b12Full.renderWave(local962, arg2 + Static65.anInt1951, Static16.anInt548 + arg0, local639, Static136.anInt3325);
                }
                if (Static191.anIntArray391[local5] == 2) {
                    Fonts.b12Full.renderWave2(local962, arg2 + Static65.anInt1951, arg0 - -Static16.anInt548, local639, Static136.anInt3325);
                }
                if (Static191.anIntArray391[local5] == 3) {
                    Fonts.b12Full.renderShake(local962, arg2 + Static65.anInt1951, Static16.anInt548 + arg0, local639, Static136.anInt3325, 150 - Static191.anIntArray384[local5]);
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
}
