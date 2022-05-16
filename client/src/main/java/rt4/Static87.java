package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "Z")
	public static boolean aBoolean130 = false;

	@OriginalMember(owner = "client!gn", name = "v", descriptor = "Lclient!na;")
	public static final JagString NULL = JagString.parse("null");

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)Z")
	public static boolean showVideoAd() {
		if (client.objectTag) {
			try {
				Static9.aClass100_35.browserControlCall(GameShell.signLink.applet);
				return true;
			} catch (@Pc(14) Throwable local14) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BI)Lclient!na;")
	public static JagString allocate(@OriginalArg(1) int arg0) {
		@Pc(13) JagString local13 = new JagString();
		local13.length = 0;
		local13.chars = new byte[arg0];
		return local13;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZI)V")
	public static void method1805(@OriginalArg(0) boolean arg0) {
		@Pc(7) byte local7;
		@Pc(9) byte[][] local9;
		if (GlRenderer.enabled && arg0) {
			local7 = 1;
			local9 = Static186.underWaterMapFilesBuffer;
		} else {
			local7 = 4;
			local9 = Static273.mapFilesBuffer;
		}
		@Pc(18) int local18 = local9.length;
		@Pc(20) int local20;
		@Pc(38) int local38;
		@Pc(49) int local49;
		@Pc(53) byte[] local53;
		for (local20 = 0; local20 < local18; local20++) {
			local38 = (Static238.regionBitPacked[local20] >> 8) * 64 - Camera.originX;
			local49 = (Static238.regionBitPacked[local20] & 0xFF) * 64 - Camera.originZ;
			local53 = local9[local20];
			if (local53 != null) {
				client.audioLoop();
				Static269.method2203(PathFinder.collisionMaps, arg0, Static80.centralZoneX * 8 - 48, local49, local38, (Static52.anInt1695 - 6) * 8, local53);
			}
		}
		for (local20 = 0; local20 < local18; local20++) {
			local38 = (Static238.regionBitPacked[local20] >> 8) * 64 - Camera.originX;
			local49 = (Static238.regionBitPacked[local20] & 0xFF) * 64 - Camera.originZ;
			local53 = local9[local20];
			if (local53 == null && Static52.anInt1695 < 800) {
				client.audioLoop();
				for (@Pc(130) int local130 = 0; local130 < local7; local130++) {
					Static23.method645(local130, local49, local38, 64, 64);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(Z)V")
	public static void method1807() {
		for (@Pc(11) int local11 = 0; local11 < 100; local11++) {
			Static186.aBooleanArray100[local11] = true;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III[Lclient!be;IIIIBI)V")
	public static void method1809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (GlRenderer.enabled) {
			GlRaster.setClip(arg0, arg6, arg4, arg7);
		} else {
			SoftwareRaster.setClip(arg0, arg6, arg4, arg7);
			Rasteriser.prepare();
		}
		for (@Pc(18) int local18 = 0; local18 < arg3.length; local18++) {
			@Pc(30) Component local30 = arg3[local18];
			if (local30 != null && (local30.layer == arg5 || arg5 == -1412584499 && local30 == Static40.aClass13_14)) {
				@Pc(57) int local57;
				if (arg8 == -1) {
					Static264.anIntArray410[InterfaceList.anInt766] = arg2 + local30.x;
					Static50.anIntArray133[InterfaceList.anInt766] = local30.y + arg1;
					Static224.anIntArray443[InterfaceList.anInt766] = local30.width;
					Static67.anIntArray320[InterfaceList.anInt766] = local30.height;
					local57 = InterfaceList.anInt766++;
				} else {
					local57 = arg8;
				}
				local30.anInt465 = client.loop;
				local30.anInt517 = local57;
				if (!local30.usingScripts || !Static36.method947(local30)) {
					if (local30.anInt453 > 0) {
						Static2.method13(local30);
					}
					@Pc(114) int local114 = arg1 + local30.y;
					@Pc(117) int local117 = local30.alpha;
					@Pc(123) int local123 = local30.x + arg2;
					if (Static121.aBoolean154 && (InterfaceList.getServerActiveProperties(local30).accessMask != 0 || local30.type == 0) && local117 > 127) {
						local117 = 127;
					}
					@Pc(166) int local166;
					@Pc(164) int local164;
					if (local30 == Static40.aClass13_14) {
						if (arg5 != -1412584499 && !local30.dragRenderBehavior) {
							Static80.anInt4696 = arg2;
							Static127.anInt3126 = arg1;
							Static241.aClass13Array13 = arg3;
							continue;
						}
						if (Static40.aBoolean172 && Static146.aBoolean174) {
							local164 = Mouse.anInt5032;
							local166 = Mouse.anInt4873;
							local164 -= Static40.anInt4035;
							if (local164 < Static228.anInt5103) {
								local164 = Static228.anInt5103;
							}
							if (local164 + local30.height > Static40.aClass13_1.height + Static228.anInt5103) {
								local164 = Static40.aClass13_1.height + Static228.anInt5103 - local30.height;
							}
							local114 = local164;
							local166 -= Static40.anInt5388;
							if (Static81.anInt2225 > local166) {
								local166 = Static81.anInt2225;
							}
							if (Static40.aClass13_1.width + Static81.anInt2225 < local30.width + local166) {
								local166 = Static40.aClass13_1.width + Static81.anInt2225 - local30.width;
							}
							local123 = local166;
						}
						if (!local30.dragRenderBehavior) {
							local117 = 128;
						}
					}
					@Pc(302) int local302;
					@Pc(291) int local291;
					@Pc(270) int local270;
					@Pc(276) int local276;
					if (local30.type == 2) {
						local291 = arg7;
						local302 = arg4;
						local164 = arg6;
						local166 = arg0;
					} else {
						local164 = local114 > arg6 ? local114 : arg6;
						local166 = arg0 < local123 ? local123 : arg0;
						local270 = local30.width + local123;
						local276 = local114 + local30.height;
						if (local30.type == 9) {
							local276++;
							local270++;
						}
						local291 = arg7 <= local276 ? arg7 : local276;
						local302 = local270 >= arg4 ? arg4 : local270;
					}
					if (!local30.usingScripts || local302 > local166 && local164 < local291) {
						@Pc(468) int local468;
						@Pc(503) int memory;
						@Pc(514) int color;
						@Pc(518) int cardMemory;
						@Pc(556) int local556;
						@Pc(563) int local563;
						@Pc(571) int local571;
						@Pc(545) int objId;
						if (local30.anInt453 != 0) {
							if (local30.anInt453 == 1337 || local30.anInt453 == 1403 && GlRenderer.enabled) {
								Static280.aClass13_26 = local30;
								Static214.anInt5574 = local114;
								Static97.anInt2503 = local123;
								Static253.method4326(local30.height, local30.anInt453 == 1403, local123, local30.width, local114);
								if (GlRenderer.enabled) {
									GlRaster.setClip(arg0, arg6, arg4, arg7);
								} else {
									SoftwareRaster.setClip(arg0, arg6, arg4, arg7);
								}
								continue;
							}
							if (local30.anInt453 == 1338) {
								if (!local30.method478()) {
									continue;
								}
								MiniMap.render(local57, local114, local123, local30);
								if (GlRenderer.enabled) {
									GlRaster.setClip(arg0, arg6, arg4, arg7);
								} else {
									SoftwareRaster.setClip(arg0, arg6, arg4, arg7);
								}
								if (MiniMap.state != 0 && MiniMap.state != 3 || Static40.aBoolean108 || local166 > Static155.anInt3751 || Static60.anInt1892 < local164 || Static155.anInt3751 >= local302 || local291 <= Static60.anInt1892) {
									continue;
								}
								local270 = Static155.anInt3751 - local123;
								local276 = Static60.anInt1892 - local114;
								local468 = local30.anIntArray37[local276];
								if (local270 < local468 || local270 > local468 + local30.anIntArray45[local276]) {
									continue;
								}
								local276 -= local30.height / 2;
								memory = (int)Camera.yawTarget + Static59.anInt1814 & 0x7FF;
								local270 -= local30.width / 2;
								color = MathUtils.sin[memory];
								cardMemory = MathUtils.cos[memory];
								color = (MiniMap.anInt4130 + 256) * color >> 8;
								cardMemory = (MiniMap.anInt4130 + 256) * cardMemory >> 8;
								objId = cardMemory * local276 - color * local270 >> 11;
								local556 = local276 * color + local270 * cardMemory >> 11;
								local563 = PlayerList.self.xFine + local556 >> 7;
								local571 = PlayerList.self.zFine - objId >> 7;
								if (Static241.aBoolean302 && (MiniMenu.anInt4999 & 0x40) != 0) {
									@Pc(583) Component local583 = InterfaceList.method1418(MiniMenu.anInt2512, MiniMenu.anInt506);
									if (local583 == null) {
										Static53.method1294();
									} else {
										MiniMenu.add(Static246.anInt5393, 1L, MiniMenu.aClass100_961, local563, (short) 11, MiniMenu.aClass100_545, local571);
									}
									continue;
								}
								if (client.game == 1) {
									MiniMenu.add(-1, 1L, JagString.EMPTY, local563, (short) 36, LocalizedText.FACEHERE, local571);
								}
								MiniMenu.add(-1, 1L, JagString.EMPTY, local563, (short) 60, Static195.walkText, local571);
								continue;
							}
							if (local30.anInt453 == 1339) {
								if (local30.method478()) {
									Static160.method3047(local123, local114, local30, local57);
									if (GlRenderer.enabled) {
										GlRaster.setClip(arg0, arg6, arg4, arg7);
									} else {
										SoftwareRaster.setClip(arg0, arg6, arg4, arg7);
									}
								}
								continue;
							}
							if (local30.anInt453 == 1400) {
								Static269.method2225(local123, local114, local30.height, local30.width);
								Static186.aBooleanArray100[local57] = true;
								InterfaceList.rectangleRedraw[local57] = true;
								if (GlRenderer.enabled) {
									GlRaster.setClip(arg0, arg6, arg4, arg7);
								} else {
									SoftwareRaster.setClip(arg0, arg6, arg4, arg7);
								}
								continue;
							}
							if (local30.anInt453 == 1401) {
								Static1.method4(local123, local30.height, local30.width, local114);
								Static186.aBooleanArray100[local57] = true;
								InterfaceList.rectangleRedraw[local57] = true;
								if (GlRenderer.enabled) {
									GlRaster.setClip(arg0, arg6, arg4, arg7);
								} else {
									SoftwareRaster.setClip(arg0, arg6, arg4, arg7);
								}
								continue;
							}
							if (local30.anInt453 == 1402) {
								if (!GlRenderer.enabled) {
									Static221.method3392(local123, local114);
									Static186.aBooleanArray100[local57] = true;
									InterfaceList.rectangleRedraw[local57] = true;
								}
								continue;
							}
							if (local30.anInt453 == 1405) {
								if (!Cheat.displayFps) {
									continue;
								}
								local270 = local30.width + local123;
								local276 = local114 + 15;
								Fonts.p12Full.renderRight(JagString.concatenate(new JagString[] { Cheat.DEBUG_FPS2, JagString.parseInt((int)GameShell.framesPerSecond) }), local270, local276, 16776960, 0);
								local276 += 15;
								@Pc(795) Runtime runtime = Runtime.getRuntime();
								memory = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L / 1024L);
								color = 16776960;
								if (memory > 128) {
									color = 16711680;
								}
								Fonts.p12Full.renderRight(JagString.concatenate(new JagString[] { Cheat.DEBUG_MEM, JagString.parseInt(memory), Cheat.DEBUG_MEM_UNIT}), local270, local276, color, 0);
								local276 += 15;
								if (GlRenderer.enabled) {
									color = 16776960;
									cardMemory = (GlCleaner.onCardTexture + GlCleaner.onCardGeometry + GlCleaner.onCard2d) / 1024 / 1024;
									if (cardMemory > 64) {
										color = 16711680;
									}
									Fonts.p12Full.renderRight(JagString.concatenate(new JagString[] { Cheat.DEBUG_CARD, JagString.parseInt(cardMemory), Cheat.DEBUG_MEM_UNIT}), local270, local276, color, 0);
									local276 += 15;
								}
								cardMemory = 0;
								objId = 0;
								local556 = 0;
								for (local563 = 0; local563 < 28; local563++) {
									cardMemory += client.js5Providers[local563].method535();
									local556 += client.js5Providers[local563].method529();
									objId += client.js5Providers[local563].method533();
								}
								local571 = local556 * 10000 / cardMemory;
								local563 = objId * 100 / cardMemory;
								@Pc(968) JagString local968 = JagString.concatenate(new JagString[] { Cheat.DEBUG_CAHE, Static182.formatNumber(0, true, 2, (long) local571), Static147.aClass100_672, JagString.parseInt(local563), Static14.aClass100_80 });
								Fonts.p11Full.renderRight(local968, local270, local276, 16776960, 0);
								local276 += 12;
								Static186.aBooleanArray100[local57] = true;
								InterfaceList.rectangleRedraw[local57] = true;
								continue;
							}
							if (local30.anInt453 == 1406) {
								Static143.anInt3484 = local114;
								Static201.aClass13_13 = local30;
								Static131.anInt3260 = local123;
								continue;
							}
						}
						if (!Static40.aBoolean108) {
							if (local30.type == 0 && local30.noClickThrough && Static155.anInt3751 >= local166 && Static60.anInt1892 >= local164 && Static155.anInt3751 < local302 && local291 > Static60.anInt1892 && !Static121.aBoolean154) {
								MiniMenu.size = 1;
								MiniMenu.cursors[0] = Static35.anInt1092;
								MiniMenu.ops[0] = LocalizedText.CANCEL;
								MiniMenu.opBases[0] = JagString.EMPTY;
								MiniMenu.actions[0] = 1005;
							}
							if (local166 <= Static155.anInt3751 && local164 <= Static60.anInt1892 && local302 > Static155.anInt3751 && local291 > Static60.anInt1892) {
								MiniMenu.addComponentEntries(Static60.anInt1892 - local114, -local123 + Static155.anInt3751, local30);
							}
						}
						if (local30.type == 0) {
							if (!local30.usingScripts && Static36.method947(local30) && Static180.aClass13_22 != local30) {
								continue;
							}
							if (!local30.usingScripts) {
								if (local30.scrollMaxV - local30.height < local30.scrollY) {
									local30.scrollY = local30.scrollMaxV - local30.height;
								}
								if (local30.scrollY < 0) {
									local30.scrollY = 0;
								}
							}
							method1809(local166, local114 - local30.scrollY, -local30.scrollX + local123, arg3, local302, local30.id, local164, local291, local57);
							if (local30.createdComponents != null) {
								method1809(local166, local114 - local30.scrollY, -local30.scrollX + local123, local30.createdComponents, local302, local30.id, local164, local291, local57);
							}
							@Pc(1186) ComponentPointer local1186 = (ComponentPointer) InterfaceList.openInterfaces.get((long) local30.id);
							if (local1186 != null) {
								if (local1186.anInt5879 == 0 && !Static40.aBoolean108 && Static155.anInt3751 >= local166 && local164 <= Static60.anInt1892 && local302 > Static155.anInt3751 && Static60.anInt1892 < local291 && !Static121.aBoolean154) {
									MiniMenu.ops[0] = LocalizedText.CANCEL;
									MiniMenu.size = 1;
									MiniMenu.cursors[0] = Static35.anInt1092;
									MiniMenu.actions[0] = 1005;
									MiniMenu.opBases[0] = JagString.EMPTY;
								}
								Static6.method86(local1186.anInt5878, local166, local302, local123, local57, local291, local164, local114);
							}
							if (GlRenderer.enabled) {
								GlRaster.setClip(arg0, arg6, arg4, arg7);
							} else {
								SoftwareRaster.setClip(arg0, arg6, arg4, arg7);
								Rasteriser.prepare();
							}
						}
						if (Static223.aBooleanArray116[local57] || Cheat.rectDebug > 1) {
							if (local30.type == 0 && !local30.usingScripts && local30.scrollMaxV > local30.height) {
								Static74.method1624(local30.scrollY, local30.scrollMaxV, local30.width + local123, local114, local30.height);
							}

							if (local30.type != 1) {
								if (local30.type == 2) {
									local270 = 0;
									for (local276 = 0; local276 < local30.baseHeight; local276++) {
										for (local468 = 0; local468 < local30.baseWidth; local468++) {
											int y = local114 + local276 * (local30.anInt516 + 32);
											int x = (local30.anInt512 + 32) * local468 + local123;
											if (local270 < 20) {
												y += local30.anIntArray47[local270];
												x += local30.anIntArray41[local270];
											}
											if (local30.objTypes[local270] > 0) {
												objId = local30.objTypes[local270] - 1;
												if (arg0 < x + 32 && x < arg4 && arg6 < y + 32 && y < arg7 || local30 == Static118.aClass13_15 && Static4.anInt36 == local270) {
													@Pc(1476) Sprite sprite;

													if (MiniMenu.anInt5014 == 1 && Static185.anInt4370 == local270 && local30.id == Static224.anInt5062) {
														sprite = Inv.getObjectSprite(2, objId, local30.objDrawText, local30.objCounts[local270], 0);
													} else {
														sprite = Inv.getObjectSprite(1, objId, local30.objDrawText, local30.objCounts[local270], 3153952);
													}

													if (Rasteriser.textureHasTransparency) {
														Static186.aBooleanArray100[local57] = true;
													}

													if (sprite == null) {
														InterfaceList.redraw(local30);
													} else if (Static118.aClass13_15 == local30 && local270 == Static4.anInt36) {
														int dragX = Mouse.anInt4873 - Static149.anInt3554;
														int dragY = Mouse.anInt5032 - Static206.anInt4773;
														if (dragY < 5 && dragY > -5) {
															dragY = 0;
														}

														if (dragX < 5 && dragX > -5) {
															dragX = 0;
														}

														if (Static78.anInt2145 < 5) {
															dragX = 0;
															dragY = 0;
														}

														// draw dragged icon (at half opacity)
														sprite.renderAlpha(x + dragX, y + dragY, 128);

														if (arg5 != -1) {
															@Pc(1571) Component local1571 = arg3[arg5 & 0xFFFF];
															@Pc(1577) int top;
															@Pc(1575) int bottom;

															if (GlRenderer.enabled) {
																bottom = GlRaster.clipBottom;
																top = GlRaster.clipTop;
															} else {
																top = SoftwareRaster.clipTop;
																bottom = SoftwareRaster.clipBottom;
															}

															@Pc(1611) int local1611;
															if (top > dragY + y && local1571.scrollY > 0) {
																local1611 = Static178.anInt4247 * (top - dragY - y) / 3;
																if (local1611 > Static178.anInt4247 * 10) {
																	local1611 = Static178.anInt4247 * 10;
																}

																if (local1611 > local1571.scrollY) {
																	local1611 = local1571.scrollY;
																}

																local1571.scrollY -= local1611;
																Static206.anInt4773 += local1611;
																InterfaceList.redraw(local1571);
															}

															if (bottom < dragY + y + 32 && local1571.scrollY < local1571.scrollMaxV - local1571.height) {
																local1611 = (y + dragY + 32 - bottom) * Static178.anInt4247 / 3;
																if (local1611 > Static178.anInt4247 * 10) {
																	local1611 = Static178.anInt4247 * 10;
																}

																if (local1571.scrollMaxV - local1571.scrollY - local1571.height < local1611) {
																	local1611 = local1571.scrollMaxV - local1571.height - local1571.scrollY;
																}

																local1571.scrollY += local1611;
																Static206.anInt4773 -= local1611;
																InterfaceList.redraw(local1571);
															}
														}
													} else if (local30 == MiniMenu.aClass13_7 && local270 == Static250.anInt5444) {
														sprite.renderAlpha(x, y, 128);
													} else {
														sprite.render(x, y);
														// downscale:
														// sprite.renderResized(x, y, 36, 32);
													}
												}
											} else if (local30.anIntArray36 != null && local270 < 20) {
												@Pc(1381) Sprite local1381 = local30.method482(local270);
												if (local1381 != null) {
													local1381.render(x, y);
												} else if (Static211.aBoolean72) {
													InterfaceList.redraw(local30);
												}
											}

											local270++;
										}
									}
								} else if (local30.type == 3) {
									if (Static154.method2926(local30)) {
										local270 = local30.anInt492;
										if (Static180.aClass13_22 == local30 && local30.anInt475 != 0) {
											local270 = local30.anInt475;
										}
									} else {
										local270 = local30.color;
										if (local30 == Static180.aClass13_22 && local30.anInt480 != 0) {
											local270 = local30.anInt480;
										}
									}
									if (local117 == 0) {
										if (local30.filled) {
											if (GlRenderer.enabled) {
												GlRaster.method1186(local123, local114, local30.width, local30.height, local270);
											} else {
												SoftwareRaster.fillRect(local123, local114, local30.width, local30.height, local270);
											}
										} else if (GlRenderer.enabled) {
											GlRaster.method1179(local123, local114, local30.width, local30.height, local270);
										} else {
											SoftwareRaster.drawRect(local123, local114, local30.width, local30.height, local270);
										}
									} else if (local30.filled) {
										if (GlRenderer.enabled) {
											GlRaster.fillRectAlpha(local123, local114, local30.width, local30.height, local270, 256 - (local117 & 0xFF));
										} else {
											SoftwareRaster.fillRectAlpha(local123, local114, local30.width, local30.height, local270, 256 - (local117 & 0xFF));
										}
									} else if (GlRenderer.enabled) {
										GlRaster.method1180(local123, local114, local30.width, local30.height, local270, 256 - (local117 & 0xFF));
									} else {
										SoftwareRaster.method2487(local123, local114, local30.width, local30.height, local270, 256 - (local117 & 0xFF));
									}
								} else {
									@Pc(1921) Font local1921;
									if (local30.type == 4) {
										local1921 = local30.method491(Sprites.nameIcons);
										if (local1921 != null) {
											@Pc(1934) JagString local1934 = local30.text;
											if (Static154.method2926(local30)) {
												local276 = local30.anInt492;
												if (Static180.aClass13_22 == local30 && local30.anInt475 != 0) {
													local276 = local30.anInt475;
												}
												if (local30.aClass100_82.length() > 0) {
													local1934 = local30.aClass100_82;
												}
											} else {
												local276 = local30.color;
												if (Static180.aClass13_22 == local30 && local30.anInt480 != 0) {
													local276 = local30.anInt480;
												}
											}
											if (local30.usingScripts && local30.objId != -1) {
												@Pc(1989) ObjType local1989 = ObjTypeList.get(local30.objId);
												local1934 = local1989.name;
												if (local1934 == null) {
													local1934 = Static92.NULL;
												}
												if ((local1989.stackable == 1 || local30.objCount != 1) && local30.objCount != -1) {
													local1934 = JagString.concatenate(new JagString[] { MiniMenu.aClass100_32, local1934, Static54.aClass100_375, Static70.method1548(local30.objCount) });
												}
											}
											if (Static39.aClass13_10 == local30) {
												local276 = local30.color;
												local1934 = LocalizedText.PLEASEWAIT;
											}
											if (!local30.usingScripts) {
												local1934 = Static127.method2465(local30, local1934);
											}
											local1921.method2852(local1934, local123, local114, local30.width, local30.height, local276, local30.textAntiMacro ? 0 : -1, local30.anInt460, local30.anInt478, local30.anInt467);
										} else if (Static211.aBoolean72) {
											InterfaceList.redraw(local30);
										}
									} else if (local30.type == 5) {
										@Pc(2094) Sprite sprite = null;
										if (local30.usingScripts) {
											if (local30.objId == -1) {
												sprite = local30.method489(false);
											} else {
												sprite = Inv.getObjectSprite(local30.outlineThickness, local30.objId, local30.objDrawText, local30.objCount, local30.shadowColor);
											}

											if (sprite != null) {
												local276 = sprite.anInt1860;
												local468 = sprite.anInt1866;

												if (local30.spriteTiling) {
													memory = (local276 + local30.width - 1) / local276;
													color = (local30.height + local468 - 1) / local468;

													if (GlRenderer.enabled) {
														GlRaster.method1183(local123, local114, local30.width + local123, local30.height + local114);

														@Pc(2274) boolean local2274 = Static209.method3702(sprite.width);
														@Pc(2279) boolean local2279 = Static209.method3702(sprite.height);
														@Pc(2282) GlSprite local2282 = (GlSprite) sprite;
														if (local2274 && local2279) {
															if (local117 == 0) {
																local2282.method1429(local123, local114, memory, color);
															} else {
																local2282.method1426(local123, local114, 256 - (local117 & 0xFF), memory, color);
															}
														} else if (local2274) {
															for (local563 = 0; local563 < color; local563++) {
																if (local117 == 0) {
																	local2282.method1429(local123, local563 * local468 + local114, memory, 1);
																} else {
																	local2282.method1426(local123, local114 + local563 * local468, -(local117 & 0xFF) + 256, memory, 1);
																}
															}
														} else if (local2279) {
															for (local563 = 0; local563 < memory; local563++) {
																if (local117 == 0) {
																	local2282.method1429(local276 * local563 + local123, local114, 1, color);
																} else {
																	local2282.method1426(local276 * local563 + local123, local114, 256 - (local117 & 0xFF), 1, color);
																}
															}
														} else {
															for (local563 = 0; local563 < memory; local563++) {
																for (local571 = 0; local571 < color; local571++) {
																	if (local117 == 0) {
																		sprite.render(local123 + local276 * local563, local468 * local571 + local114);
																	} else {
																		sprite.renderAlpha(local563 * local276 + local123, local468 * local571 + local114, 256 - (local117 & 0xFF));
																	}
																}
															}
														}

														GlRaster.setClip(arg0, arg6, arg4, arg7);
													} else {
														SoftwareRaster.method2498(local123, local114, local123 + local30.width, local114 - -local30.height);
														for (cardMemory = 0; cardMemory < memory; cardMemory++) {
															for (local556 = 0; local556 < color; local556++) {
																if (local30.angle2d != 0) {
																	sprite.method1420(local114 + local468 * local556 + local468 / 2, local30.angle2d, 4096, cardMemory * local276 + local123 + local276 / 2);
																} else if (local117 == 0) {
																	sprite.render(cardMemory * local276 + local123, local468 * local556 + local114);
																} else {
																	sprite.renderAlpha(cardMemory * local276 + local123, local114 + local556 * local468, 256 - (local117 & 0xFF));
																}
															}
														}

														SoftwareRaster.setClip(arg0, arg6, arg4, arg7);
													}
												} else {
													memory = local30.width * 4096 / local276;
													if (local30.angle2d != 0) {
														sprite.method1420(local114 + local30.height / 2, local30.angle2d, memory, local123 + local30.width / 2);
													} else if (local117 != 0) {
														sprite.method1422(local123, local114, local30.width, local30.height, 256 - (local117 & 0xFF));
													} else if (local276 == local30.width && local468 == local30.height) {
														sprite.render(local123, local114);
													} else {
														// render icons in a container i.e bank icons
														sprite.renderResized(local123, local114, local30.width, local30.height);
													}
												}
											} else if (Static211.aBoolean72) {
												InterfaceList.redraw(local30);
											}
										} else {
											sprite = local30.method489(Static154.method2926(local30));
											if (sprite != null) {
												sprite.render(local123, local114);
											} else if (Static211.aBoolean72) {
												InterfaceList.redraw(local30);
											}
										}
									} else {
										@Pc(2611) ObjType local2611;
										if (local30.type == 6) {
											@Pc(2587) boolean local2587 = Static154.method2926(local30);
											@Pc(2589) Model local2589 = null;
											if (local2587) {
												local276 = local30.anInt462;
											} else {
												local276 = local30.modelSeqId;
											}
											memory = 0;
											if (local30.objId != -1) {
												local2611 = ObjTypeList.get(local30.objId);
												if (local2611 != null) {
													local2611 = local2611.method1820(local30.objCount);
													@Pc(2630) SeqType local2630 = local276 == -1 ? null : SeqTypeList.get(local276);
													local2589 = local2611.getModel(local30.anInt496, local30.anInt500, local2630, 1, local30.anInt510);
													if (local2589 == null) {
														InterfaceList.redraw(local30);
													} else {
														memory = -local2589.getMaxY() / 2;
													}
												}
											} else if (local30.modelType == 5) {
												if (local30.modelId == -1) {
													local2589 = PlayerAppearance.DEFAULT.method1954(null, -1, null, null, 0, -1, 0, -1, -1);
												} else {
													color = local30.modelId & 0x7FF;
													if (color == PlayerList.selfId) {
														color = 2047;
													}
													@Pc(2751) Player local2751 = PlayerList.players[color];
													@Pc(2760) SeqType local2760 = local276 == -1 ? null : SeqTypeList.get(local276);
													if (local2751 != null && (int) local2751.username.encode37() << 11 == (local30.modelId & 0xFFFFF800)) {
														local2589 = local2751.appearance.method1954(null, -1, null, local2760, 0, -1, 0, local30.anInt510, 0);
													}
												}
											} else if (local276 == -1) {
												local2589 = local30.method488(-1, null, -1, 0, local2587, PlayerList.self.appearance);
												if (local2589 == null && Static211.aBoolean72) {
													InterfaceList.redraw(local30);
												}
											} else {
												@Pc(2689) SeqType local2689 = SeqTypeList.get(local276);
												local2589 = local30.method488(local30.anInt496, local2689, local30.anInt510, local30.anInt500, local2587, PlayerList.self.appearance);
												if (local2589 == null && Static211.aBoolean72) {
													InterfaceList.redraw(local30);
												}
											}
											if (local2589 != null) {
												if (local30.anInt451 > 0) {
													color = (local30.width << 8) / local30.anInt451;
												} else {
													color = 256;
												}
												if (local30.anInt526 <= 0) {
													cardMemory = 256;
												} else {
													cardMemory = (local30.height << 8) / local30.anInt526;
												}
												local556 = local123 + local30.width / 2 + (color * local30.anInt495 >> 8);
												objId = local30.height / 2 + local114 + (cardMemory * local30.anInt481 >> 8);
												if (GlRenderer.enabled) {
													if (local30.modelOrtho) {
														GlRenderer.method4182(local556, objId, local30.modelZoom, local30.aShort11, color, cardMemory);
													} else {
														GlRenderer.method4148(local556, objId, color, cardMemory);
														GlRenderer.method4152((float) local30.aShort10, (float) local30.aShort11 * 1.5F);
													}
													GlRenderer.restoreLighting();
													GlRenderer.setDepthTestEnabled(true);
													GlRenderer.setFogEnabled(false);
													Static229.method3935(Preferences.brightness);
													if (Static263.aBoolean299) {
														GlRaster.method1177();
														GlRenderer.clearDepthBuffer();
														GlRaster.setClip(arg0, arg6, arg4, arg7);
														Static263.aBoolean299 = false;
													}
													if (local30.aBoolean34) {
														GlRenderer.disableDepthMask();
													}
													local563 = MathUtils.sin[local30.modelXAngle] * local30.modelZoom >> 16;
													local571 = local30.modelZoom * MathUtils.cos[local30.modelXAngle] >> 16;
													if (local30.usingScripts) {
														local2589.setCamera(local30.modelYAngle, local30.modelYOffset, local30.modelXAngle, local30.modelXOffset, local30.modelZOffset + local563 + memory, local30.modelZOffset + local571, -1L);
													} else {
														local2589.setCamera(local30.modelYAngle, 0, local30.modelXAngle, 0, local563, local571, -1L);
													}
													if (local30.aBoolean34) {
														GlRenderer.enableDepthMask();
													}
												} else {
													Rasteriser.setBounds(local556, objId);
													local563 = MathUtils.sin[local30.modelXAngle] * local30.modelZoom >> 16;
													local571 = local30.modelZoom * MathUtils.cos[local30.modelXAngle] >> 16;
													if (!local30.usingScripts) {
														local2589.setCamera(local30.modelYAngle, 0, local30.modelXAngle, 0, local563, local571, -1L);
													} else if (local30.modelOrtho) {
														((SoftwareModel) local2589).method4591(local30.modelYAngle, local30.modelYOffset, local30.modelXAngle, local30.modelXOffset, local30.modelZOffset + memory + local563, local571 + local30.modelZOffset, local30.modelZoom);
													} else {
														local2589.setCamera(local30.modelYAngle, local30.modelYOffset, local30.modelXAngle, local30.modelXOffset, local30.modelZOffset + local563 + memory, local571 + local30.modelZOffset, -1L);
													}
													Rasteriser.prepareOffsets();
												}
											}
										} else {
											if (local30.type == 7) {
												local1921 = local30.method491(Sprites.nameIcons);
												if (local1921 == null) {
													if (Static211.aBoolean72) {
														InterfaceList.redraw(local30);
													}
													continue;
												}
												local276 = 0;
												for (local468 = 0; local468 < local30.baseHeight; local468++) {
													for (memory = 0; memory < local30.baseWidth; memory++) {
														if (local30.objTypes[local276] > 0) {
															local2611 = ObjTypeList.get(local30.objTypes[local276] - 1);
															@Pc(3159) JagString local3159;
															if (local2611.stackable != 1 && local30.objCounts[local276] == 1) {
																local3159 = JagString.concatenate(new JagString[] { MiniMenu.aClass100_32, local2611.name, Static70.aClass100_978 });
															} else {
																local3159 = JagString.concatenate(new JagString[] { MiniMenu.aClass100_32, local2611.name, Static54.aClass100_375, Static70.method1548(local30.objCounts[local276]) });
															}
															local556 = local123 + memory * (local30.anInt512 + 115);
															objId = (local30.anInt516 + 12) * local468 + local114;
															if (local30.anInt460 == 0) {
																local1921.renderLeft(local3159, local556, objId, local30.color, local30.textAntiMacro ? 0 : -1);
															} else if (local30.anInt460 == 1) {
																local1921.renderCenter(local3159, local556 + 57, objId, local30.color, local30.textAntiMacro ? 0 : -1);
															} else {
																local1921.renderRight(local3159, local556 + 115 - 1, objId, local30.color, local30.textAntiMacro ? 0 : -1);
															}
														}
														local276++;
													}
												}
											}
											if (local30.type == 8 && Static43.aClass13_11 == local30 && Static133.anInt5235 == Static191.anInt4504) {
												local276 = 0;
												local270 = 0;
												@Pc(3297) JagString local3297 = local30.text;
												@Pc(3299) Font local3299 = Fonts.p12Full;
												local3297 = Static127.method2465(local30, local3297);
												@Pc(3325) JagString local3325;
												while (local3297.length() > 0) {
													cardMemory = local3297.indexOf(Static269.aClass100_556);
													if (cardMemory == -1) {
														local3325 = local3297;
														local3297 = JagString.EMPTY;
													} else {
														local3325 = local3297.substring(cardMemory, 0);
														local3297 = local3297.substring(cardMemory + 4);
													}
													local556 = local3299.getStringWidth(local3325);
													local276 += local3299.lineHeight + 1;
													if (local270 < local556) {
														local270 = local556;
													}
												}
												local556 = local114 + local30.height + 5;
												local270 += 6;
												local276 += 7;
												if (local556 + local276 > arg7) {
													local556 = arg7 - local276;
												}
												cardMemory = local123 + local30.width - local270 - 5;
												if (cardMemory < local123 + 5) {
													cardMemory = local123 + 5;
												}
												if (local270 + cardMemory > arg4) {
													cardMemory = arg4 - local270;
												}
												if (GlRenderer.enabled) {
													GlRaster.method1186(cardMemory, local556, local270, local276, 16777120);
													GlRaster.method1179(cardMemory, local556, local270, local276, 0);
												} else {
													SoftwareRaster.fillRect(cardMemory, local556, local270, local276, 16777120);
													SoftwareRaster.drawRect(cardMemory, local556, local270, local276, 0);
												}
												local3297 = local30.text;
												objId = local556 + local3299.lineHeight + 2;
												local3297 = Static127.method2465(local30, local3297);
												while (local3297.length() > 0) {
													local563 = local3297.indexOf(Static269.aClass100_556);
													if (local563 == -1) {
														local3325 = local3297;
														local3297 = JagString.EMPTY;
													} else {
														local3325 = local3297.substring(local563, 0);
														local3297 = local3297.substring(local563 + 4);
													}
													local3299.renderLeft(local3325, cardMemory + 3, objId, 0, -1);
													objId += local3299.lineHeight + 1;
												}
											}
											if (local30.type == 9) {
												if (local30.aBoolean20) {
													local468 = local123 + local30.width;
													local276 = local114 + local30.height;
													memory = local114;
												} else {
													local276 = local114;
													memory = local114 + local30.height;
													local468 = local123 + local30.width;
												}
												if (local30.lineWidth == 1) {
													if (GlRenderer.enabled) {
														GlRaster.method1185(local123, local276, local468, memory, local30.color);
													} else {
														SoftwareRaster.method2500(local123, local276, local468, memory, local30.color);
													}
												} else if (GlRenderer.enabled) {
													GlRaster.method1181(local123, local276, local468, memory, local30.color, local30.lineWidth);
												} else {
													SoftwareRaster.method2494(local123, local276, local468, memory, local30.color, local30.lineWidth);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZI)I")
	public static int method1814(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
