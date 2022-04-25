package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
	public static int originZ;

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
		for (local5 = -1; local5 < PlayerList.size + Static272.anInt5214; local5++) {
			@Pc(17) PathingEntity local17;
			if (local5 == -1) {
				local17 = PlayerList.self;
			} else if (PlayerList.size > local5) {
				local17 = PlayerList.players[PlayerList.ids[local5]];
			} else {
				local17 = NpcList.npcs[Static33.anIntArray79[local5 - PlayerList.size]];
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
							Sprites.headiconPrayers[local58.prayerIcon].method1423(arg2 + Static65.anInt1951 - 12, arg0 + -30 - -Static16.anInt548);
						}
					}
					@Pc(308) Class102[] local308 = Static143.aClass102Array1;
					for (local310 = 0; local310 < local308.length; local310++) {
						@Pc(322) Class102 local322 = local308[local310];
						if (local322 != null && local322.anInt4058 == 1 && local322.anInt4057 == Static33.anIntArray79[local5 - PlayerList.size] && client.loop % 20 < 10) {
							if (local58.anInt3730 == -1) {
								local359 = local17.method2691() + 15;
							} else {
								local359 = local58.anInt3730 + 15;
							}
							Static180.method3326(arg4 >> 1, arg3, local17, arg5, local359, arg1 >> 1);
							if (Static65.anInt1951 > -1) {
								Sprites.headhints[local322.anInt4048].method1423(arg2 + Static65.anInt1951 - 12, Static16.anInt548 + -28 + arg0);
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
								Sprites.headiconPks[local77.anInt1669].method1423(Static65.anInt1951 + arg2 - 12, arg0 + -30 + Static16.anInt548);
								local74 += 25;
							}
							if (local77.anInt1649 != -1) {
								Sprites.headiconPrayers[local77.anInt1649].method1423(arg2 + Static65.anInt1951 - 12, arg0 - (-Static16.anInt548 + local74));
								local74 += 25;
							}
						}
					}
					if (local5 >= 0) {
						@Pc(159) Class102[] local159 = Static143.aClass102Array1;
						for (local161 = 0; local161 < local159.length; local161++) {
							@Pc(173) Class102 local173 = local159[local161];
							if (local173 != null && local173.anInt4058 == 10 && PlayerList.ids[local5] == local173.anInt4057) {
								Static180.method3326(arg4 >> 1, arg3, local17, arg5, local17.method2691() + 15, arg1 >> 1);
								if (Static65.anInt1951 > -1) {
									Sprites.headhints[local173.anInt4048].method1423(arg2 + Static65.anInt1951 - 12, arg0 + (Static16.anInt548 - local74));
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
					Static180.method3326(arg4 >> 1, arg3, local17, arg5, local508.anInt1859 + local310 + 10, arg1 >> 1);
					if (Static65.anInt1951 > -1) {
						local161 = Static65.anInt1951 + arg2 - (local508.anInt1867 >> 1);
						local359 = Static16.anInt548 + arg0 - 3;
						local508.method1423(local161, local359);
						local639 = local508.anInt1867 * local17.hitpointsBar / 255;
						local642 = local508.anInt1859;
						if (GlRenderer.enabled) {
							Static46.method1183(local161, local359, local161 + local639, local359 + local642);
						} else {
							SoftwareRaster.method2498(local161, local359, local161 + local639, local642 + local359);
						}
						local512.method1423(local161, local359);
						if (GlRenderer.enabled) {
							Static46.method1187(arg2, arg0, arg1 + arg2, arg0 - -arg4);
						} else {
							SoftwareRaster.method2496(arg2, arg0, arg1 + arg2, arg4 + arg0);
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
							Sprites.hitmarks[local17.anIntArray321[local74]].method1423(arg2 + Static65.anInt1951 - 12, arg0 + Static16.anInt548 - 12);
							Fonts.p11Full.renderCenter(Static123.parseInt(local17.anIntArray322[local74]), Static65.anInt1951 + arg2 - 1, Static16.anInt548 + 3 + arg0, 16777215, 0);
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
						Static46.method1183(Static65.anInt1951 + arg2 - 50, arg0, Static65.anInt1951 + arg2 + 50, arg4 + arg0);
					} else {
						SoftwareRaster.method2498(arg2 + Static65.anInt1951 - 50, arg0, Static65.anInt1951 + arg2 + 50, arg4 + arg0);
					}
					Fonts.b12Full.method2857(local962, arg2 + Static65.anInt1951 + 50 - local642, arg0 + Static16.anInt548, local639, 0);
					if (GlRenderer.enabled) {
						Static46.method1187(arg2, arg0, arg1 + arg2, arg4 + arg0);
					} else {
						SoftwareRaster.method2496(arg2, arg0, arg2 + arg1, arg0 + arg4);
					}
				}
				if (Static191.anIntArray391[local5] == 5) {
					@Pc(1372) int local1372 = 0;
					local642 = 150 - Static191.anIntArray384[local5];
					if (GlRenderer.enabled) {
						Static46.method1183(arg2, Static16.anInt548 + arg0 - Fonts.b12Full.lineHeight - 1, arg1 + arg2, arg0 + Static16.anInt548 + 5);
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
						Static46.method1187(arg2, arg0, arg2 + arg1, arg0 + arg4);
					} else {
						SoftwareRaster.method2496(arg2, arg0, arg2 + arg1, arg0 + arg4);
					}
				}
			} else {
				Fonts.b12Full.renderCenter(local962, arg2 + Static65.anInt1951, arg0 + Static16.anInt548, 16776960, 0);
			}
		}
	}

}
