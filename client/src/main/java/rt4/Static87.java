package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

    @OriginalMember(owner = "client!bj", name = "V", descriptor = "I")
    public static final int anInt671 = 0x332d25;

	@OriginalMember(owner = "client!rl", name = "Z", descriptor = "I")
	public static final int anInt4938 = 0x766654;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
	public static final int anInt1704 = 0x4d4233;

	@OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
	public static final int anInt4306 = 0x23201b;

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
			local9 = LoginManager.underWaterMapFilesBuffer;
		} else {
			local7 = 4;
			local9 = LoginManager.mapFilesBuffer;
		}
		@Pc(18) int local18 = local9.length;
		@Pc(20) int local20;
		@Pc(38) int local38;
		@Pc(49) int local49;
		@Pc(53) byte[] local53;
		for (local20 = 0; local20 < local18; local20++) {
			local38 = (LoginManager.regionBitPacked[local20] >> 8) * 64 - Camera.originX;
			local49 = (LoginManager.regionBitPacked[local20] & 0xFF) * 64 - Camera.originZ;
			local53 = local9[local20];
			if (local53 != null) {
				client.audioLoop();
				Static269.method2203(PathFinder.collisionMaps, arg0, LoginManager.centralZoneX * 8 - 48, local49, local38, (LoginManager.centralZoneZ - 6) * 8, local53);
			}
		}
		for (local20 = 0; local20 < local18; local20++) {
			local38 = (LoginManager.regionBitPacked[local20] >> 8) * 64 - Camera.originX;
			local49 = (LoginManager.regionBitPacked[local20] & 0xFF) * 64 - Camera.originZ;
			local53 = local9[local20];
			if (local53 == null && LoginManager.centralZoneZ < 800) {
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
			InterfaceList.aBooleanArray100[local11] = true;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III[Lclient!be;IIIIBI)V")
	public static void method1809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component[] components, @OriginalArg(4) int arg4, @OriginalArg(5) int layer, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int parentRectangle) {
		if (GlRenderer.enabled) {
			GlRaster.setClip(arg0, arg6, arg4, arg7);
		} else {
			SoftwareRaster.setClip(arg0, arg6, arg4, arg7);
			Rasteriser.prepare();
		}
		for (@Pc(18) int i = 0; i < components.length; i++) {
			@Pc(30) Component component = components[i];
			if (component != null && (component.layer == layer || layer == 0xabcdabcd && component == Static40.aClass13_14)) {
				@Pc(57) int rectangle;
				if (parentRectangle == -1) {
					InterfaceList.rectangleX[InterfaceList.rectangles] = arg2 + component.x;
					InterfaceList.rectangleY[InterfaceList.rectangles] = component.y + arg1;
					InterfaceList.rectangleWidth[InterfaceList.rectangles] = component.width;
					InterfaceList.rectangleHeight[InterfaceList.rectangles] = component.height;
					rectangle = InterfaceList.rectangles++;
				} else {
					rectangle = parentRectangle;
				}
				component.rectangleLoop = client.loop;
				component.rectangle = rectangle;
				if (!component.if3 || !Static36.method947(component)) {
					if (component.clientCode > 0) {
						Static2.method13(component);
					}
					@Pc(114) int local114 = arg1 + component.y;
					@Pc(117) int alpha = component.alpha;
					@Pc(123) int local123 = component.x + arg2;
					if (Static121.qaOpTest && (InterfaceList.getServerActiveProperties(component).events != 0 || component.type == 0) && alpha > 127) {
						alpha = 127;
					}
					@Pc(166) int local166;
					@Pc(164) int local164;
					if (component == Static40.aClass13_14) {
						if (layer != 0xabcdabcd && !component.dragRenderBehavior) {
							Static80.anInt4696 = arg2;
							Static127.anInt3126 = arg1;
							Static241.aClass13Array13 = components;
							continue;
						}
						if (Static40.aBoolean172 && Static146.aBoolean174) {
							local164 = Mouse.lastMouseY;
							local166 = Mouse.lastMouseX;
							local164 -= Static40.anInt4035;
							if (local164 < Static228.anInt5103) {
								local164 = Static228.anInt5103;
							}
							if (local164 + component.height > Static40.aClass13_1.height + Static228.anInt5103) {
								local164 = Static40.aClass13_1.height + Static228.anInt5103 - component.height;
							}
							local114 = local164;
							local166 -= Static40.anInt5388;
							if (Static81.anInt2225 > local166) {
								local166 = Static81.anInt2225;
							}
							if (Static40.aClass13_1.width + Static81.anInt2225 < component.width + local166) {
								local166 = Static40.aClass13_1.width + Static81.anInt2225 - component.width;
							}
							local123 = local166;
						}
						if (!component.dragRenderBehavior) {
							alpha = 128;
						}
					}
					@Pc(302) int local302;
					@Pc(291) int local291;
					@Pc(270) int local270;
					@Pc(276) int local276;
					if (component.type == 2) {
						local291 = arg7;
						local302 = arg4;
						local164 = arg6;
						local166 = arg0;
					} else {
						local164 = local114 > arg6 ? local114 : arg6;
						local166 = arg0 < local123 ? local123 : arg0;
						local270 = component.width + local123;
						local276 = local114 + component.height;
						if (component.type == 9) {
							local276++;
							local270++;
						}
						local291 = arg7 <= local276 ? arg7 : local276;
						local302 = local270 >= arg4 ? arg4 : local270;
					}
					if (!component.if3 || local302 > local166 && local164 < local291) {
						@Pc(468) int local468;
						@Pc(503) int memory;
						@Pc(514) int color;
						@Pc(518) int cardMemory;
						@Pc(556) int local556;
						@Pc(563) int local563;
						@Pc(571) int local571;
						@Pc(545) int objId;
						if (component.clientCode != 0) {
							if (component.clientCode == 1337 || component.clientCode == 1403 && GlRenderer.enabled) {
								Static280.aClass13_26 = component;
								Static214.anInt5574 = local114;
								Static97.anInt2503 = local123;
								Static253.method4326(component.height, component.clientCode == 1403, local123, component.width, local114);
								if (GlRenderer.enabled) {
									GlRaster.setClip(arg0, arg6, arg4, arg7);
								} else {
									SoftwareRaster.setClip(arg0, arg6, arg4, arg7);
								}
								continue;
							}
							if (component.clientCode == 1338) {
								if (!component.method478()) {
									continue;
								}
								MiniMap.render(rectangle, local114, local123, component);
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
								local468 = component.anIntArray37[local276];
								if (local270 < local468 || local270 > local468 + component.anIntArray45[local276]) {
									continue;
								}
								local276 -= component.height / 2;
								memory = (int)Camera.yawTarget + MiniMap.anInt1814 & 0x7FF;
								local270 -= component.width / 2;
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
										MiniMenu.add(MiniMenu.anInt5393, 1L, MiniMenu.aClass100_961, local563, (short) 11, MiniMenu.aClass100_545, local571);
									}
									continue;
								}
								if (client.game == 1) {
									MiniMenu.add(-1, 1L, JagString.EMPTY, local563, (short) 36, LocalizedText.FACEHERE, local571);
								}
								MiniMenu.add(-1, 1L, JagString.EMPTY, local563, (short) 60, MiniMenu.walkText, local571);
								continue;
							}
							if (component.clientCode == 1339) {
								if (component.method478()) {
									Static160.method3047(local123, local114, component, rectangle);
									if (GlRenderer.enabled) {
										GlRaster.setClip(arg0, arg6, arg4, arg7);
									} else {
										SoftwareRaster.setClip(arg0, arg6, arg4, arg7);
									}
								}
								continue;
							}
							if (component.clientCode == 1400) {
								Static269.method2225(local123, local114, component.height, component.width);
								InterfaceList.aBooleanArray100[rectangle] = true;
								InterfaceList.rectangleRedraw[rectangle] = true;
								if (GlRenderer.enabled) {
									GlRaster.setClip(arg0, arg6, arg4, arg7);
								} else {
									SoftwareRaster.setClip(arg0, arg6, arg4, arg7);
								}
								continue;
							}
							if (component.clientCode == 1401) {
								Static1.method4(local123, component.height, component.width, local114);
								InterfaceList.aBooleanArray100[rectangle] = true;
								InterfaceList.rectangleRedraw[rectangle] = true;
								if (GlRenderer.enabled) {
									GlRaster.setClip(arg0, arg6, arg4, arg7);
								} else {
									SoftwareRaster.setClip(arg0, arg6, arg4, arg7);
								}
								continue;
							}
							if (component.clientCode == 1402) {
								if (!GlRenderer.enabled) {
									Static221.method3392(local123, local114);
									InterfaceList.aBooleanArray100[rectangle] = true;
									InterfaceList.rectangleRedraw[rectangle] = true;
								}
								continue;
							}
							if (component.clientCode == 1405) {
								if (!Cheat.displayFps) {
									continue;
								}
								local270 = component.width + local123;
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
								@Pc(968) JagString local968 = JagString.concatenate(new JagString[] { Cheat.DEBUG_CAHE, StringUtils.formatNumber(0, true, 2, (long) local571), Static147.aClass100_672, JagString.parseInt(local563), Static14.aClass100_80 });
								Fonts.p11Full.renderRight(local968, local270, local276, 16776960, 0);
								local276 += 12;
								InterfaceList.aBooleanArray100[rectangle] = true;
								InterfaceList.rectangleRedraw[rectangle] = true;
								continue;
							}
							if (component.clientCode == 1406) {
								Static143.anInt3484 = local114;
								Static201.aClass13_13 = component;
								Static131.anInt3260 = local123;
								continue;
							}
						}
						if (!Static40.aBoolean108) {
							if (component.type == 0 && component.noClickThrough && Static155.anInt3751 >= local166 && Static60.anInt1892 >= local164 && Static155.anInt3751 < local302 && local291 > Static60.anInt1892 && !Static121.qaOpTest) {
								MiniMenu.size = 1;
								MiniMenu.cursors[0] = Static35.anInt1092;
								MiniMenu.ops[0] = LocalizedText.CANCEL;
								MiniMenu.opBases[0] = JagString.EMPTY;
								MiniMenu.actions[0] = 1005;
							}
							if (local166 <= Static155.anInt3751 && local164 <= Static60.anInt1892 && local302 > Static155.anInt3751 && local291 > Static60.anInt1892) {
								MiniMenu.addComponentEntries(Static60.anInt1892 - local114, -local123 + Static155.anInt3751, component);
							}
						}
						if (component.type == 0) {
							if (!component.if3 && Static36.method947(component) && Static180.aClass13_22 != component) {
								continue;
							}
							if (!component.if3) {
								if (component.scrollMaxV - component.height < component.scrollY) {
									component.scrollY = component.scrollMaxV - component.height;
								}
								if (component.scrollY < 0) {
									component.scrollY = 0;
								}
							}
							method1809(local166, local114 - component.scrollY, -component.scrollX + local123, components, local302, component.id, local164, local291, rectangle);
							if (component.createdComponents != null) {
								method1809(local166, local114 - component.scrollY, -component.scrollX + local123, component.createdComponents, local302, component.id, local164, local291, rectangle);
							}
							@Pc(1186) ComponentPointer local1186 = (ComponentPointer) InterfaceList.openInterfaces.get((long) component.id);
							if (local1186 != null) {
								if (local1186.anInt5879 == 0 && !Static40.aBoolean108 && Static155.anInt3751 >= local166 && local164 <= Static60.anInt1892 && local302 > Static155.anInt3751 && Static60.anInt1892 < local291 && !Static121.qaOpTest) {
									MiniMenu.ops[0] = LocalizedText.CANCEL;
									MiniMenu.size = 1;
									MiniMenu.cursors[0] = Static35.anInt1092;
									MiniMenu.actions[0] = 1005;
									MiniMenu.opBases[0] = JagString.EMPTY;
								}
								Static6.method86(local1186.anInt5878, local166, local302, local123, rectangle, local291, local164, local114);
							}
							if (GlRenderer.enabled) {
								GlRaster.setClip(arg0, arg6, arg4, arg7);
							} else {
								SoftwareRaster.setClip(arg0, arg6, arg4, arg7);
								Rasteriser.prepare();
							}
						}
						if (Static223.aBooleanArray116[rectangle] || Cheat.rectDebug > 1) {
							if (component.type == 0 && !component.if3 && component.scrollMaxV > component.height) {
								method1624(component.scrollY, component.scrollMaxV, component.width + local123, local114, component.height);
							}

							if (component.type != 1) {
								if (component.type == 2) {
									local270 = 0;
									for (local276 = 0; local276 < component.baseHeight; local276++) {
										for (local468 = 0; local468 < component.baseWidth; local468++) {
											int y = local114 + local276 * (component.anInt516 + 32);
											int x = (component.anInt512 + 32) * local468 + local123;
											if (local270 < 20) {
												y += component.anIntArray47[local270];
												x += component.anIntArray41[local270];
											}
											if (component.objTypes[local270] > 0) {
												objId = component.objTypes[local270] - 1;
												if (arg0 < x + 32 && x < arg4 && arg6 < y + 32 && y < arg7 || component == Static118.clickedInventoryComponent && Static4.mouseOverInventoryObjectIndex == local270) {
													@Pc(1476) Sprite sprite;

													if (MiniMenu.anInt5014 == 1 && Static185.anInt4370 == local270 && component.id == Static224.anInt5062) {
														sprite = Inv.getObjectSprite(2, objId, component.objDrawText, component.objCounts[local270], 0);
													} else {
														sprite = Inv.getObjectSprite(1, objId, component.objDrawText, component.objCounts[local270], 3153952);
													}

													if (Rasteriser.textureHasTransparency) {
														InterfaceList.aBooleanArray100[rectangle] = true;
													}

													if (sprite == null) {
														InterfaceList.redraw(component);
													} else if (Static118.clickedInventoryComponent == component && local270 == Static4.mouseOverInventoryObjectIndex) {
														int dragX = Mouse.lastMouseX - Static149.clickedInventoryComponentX;
														int dragY = Mouse.lastMouseY - Static206.clickedInventoryComponentY;

														if (dragY < 5 && dragY > -5) {
															dragY = 0;
														}

														if (dragX < 5 && dragX > -5) {
															dragX = 0;
														}

														if (Static78.clickedInventoryComponentCycle < 5) {
															dragX = 0;
															dragY = 0;
														}

														// draw dragged icon (at half opacity)
														sprite.renderAlpha(x + dragX, y + dragY, 128);

														if (layer != -1) {
															@Pc(1571) Component local1571 = components[layer & 0xFFFF];
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
																Static206.clickedInventoryComponentY += local1611;
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
																Static206.clickedInventoryComponentY -= local1611;
																InterfaceList.redraw(local1571);
															}
														}
													} else if (component == MiniMenu.pressedInventoryComponent && local270 == MiniMenu.anInt5444) {
														sprite.renderAlpha(x, y, 128);
													} else {
														sprite.render(x, y);
														// downscale:
														// sprite.renderResized(x, y, 36, 32);
													}
												}
											} else if (component.anIntArray36 != null && local270 < 20) {
												@Pc(1381) Sprite local1381 = component.method482(local270);
												if (local1381 != null) {
													local1381.render(x, y);
												} else if (Component.aBoolean72) {
													InterfaceList.redraw(component);
												}
											}

											local270++;
										}
									}
								} else if (component.type == 3) {
									if (Static154.method2926(component)) {
										local270 = component.anInt492;
										if (Static180.aClass13_22 == component && component.anInt475 != 0) {
											local270 = component.anInt475;
										}
									} else {
										local270 = component.color;
										if (component == Static180.aClass13_22 && component.anInt480 != 0) {
											local270 = component.anInt480;
										}
									}
									if (alpha == 0) {
										if (component.filled) {
											if (GlRenderer.enabled) {
												GlRaster.method1186(local123, local114, component.width, component.height, local270);
											} else {
												SoftwareRaster.fillRect(local123, local114, component.width, component.height, local270);
											}
										} else if (GlRenderer.enabled) {
											GlRaster.method1179(local123, local114, component.width, component.height, local270);
										} else {
											SoftwareRaster.drawRect(local123, local114, component.width, component.height, local270);
										}
									} else if (component.filled) {
										if (GlRenderer.enabled) {
											GlRaster.fillRectAlpha(local123, local114, component.width, component.height, local270, 256 - (alpha & 0xFF));
										} else {
											SoftwareRaster.fillRectAlpha(local123, local114, component.width, component.height, local270, 256 - (alpha & 0xFF));
										}
									} else if (GlRenderer.enabled) {
										GlRaster.method1180(local123, local114, component.width, component.height, local270, 256 - (alpha & 0xFF));
									} else {
										SoftwareRaster.method2487(local123, local114, component.width, component.height, local270, 256 - (alpha & 0xFF));
									}
								} else {
									@Pc(1921) Font local1921;
									if (component.type == 4) {
										local1921 = component.method491(Sprites.nameIcons);
										if (local1921 != null) {
											@Pc(1934) JagString local1934 = component.text;
											if (Static154.method2926(component)) {
												local276 = component.anInt492;
												if (Static180.aClass13_22 == component && component.anInt475 != 0) {
													local276 = component.anInt475;
												}
												if (component.aClass100_82.length() > 0) {
													local1934 = component.aClass100_82;
												}
											} else {
												local276 = component.color;
												if (Static180.aClass13_22 == component && component.anInt480 != 0) {
													local276 = component.anInt480;
												}
											}
											if (component.if3 && component.objId != -1) {
												@Pc(1989) ObjType local1989 = ObjTypeList.get(component.objId);
												local1934 = local1989.name;
												if (local1934 == null) {
													local1934 = MiniMenu.NULL;
												}
												if ((local1989.stackable == 1 || component.objCount != 1) && component.objCount != -1) {
													local1934 = JagString.concatenate(new JagString[] { MiniMenu.aClass100_32, local1934, Static54.aClass100_375, Static70.method1548(component.objCount) });
												}
											}
											if (Static39.aClass13_10 == component) {
												local276 = component.color;
												local1934 = LocalizedText.PLEASEWAIT;
											}
											if (!component.if3) {
												local1934 = JagString.method2465(component, local1934);
											}
											local1921.method2852(local1934, local123, local114, component.width, component.height, local276, component.textAntiMacro ? 0 : -1, component.anInt460, component.anInt478, component.anInt467);
										} else if (Component.aBoolean72) {
											InterfaceList.redraw(component);
										}
									} else if (component.type == 5) {
										@Pc(2094) Sprite sprite = null;
										if (component.if3) {
											if (component.objId == -1) {
												sprite = component.method489(false);
											} else {
												sprite = Inv.getObjectSprite(component.outlineThickness, component.objId, component.objDrawText, component.objCount, component.shadowColor);
											}

											if (sprite != null) {
												local276 = sprite.anInt1860;
												local468 = sprite.anInt1866;

												if (component.spriteTiling) {
													memory = (local276 + component.width - 1) / local276;
													color = (component.height + local468 - 1) / local468;

													if (GlRenderer.enabled) {
														GlRaster.method1183(local123, local114, component.width + local123, component.height + local114);

														@Pc(2274) boolean local2274 = Static209.method3702(sprite.width);
														@Pc(2279) boolean local2279 = Static209.method3702(sprite.height);
														@Pc(2282) GlSprite local2282 = (GlSprite) sprite;
														if (local2274 && local2279) {
															if (alpha == 0) {
																local2282.method1429(local123, local114, memory, color);
															} else {
																local2282.method1426(local123, local114, 256 - (alpha & 0xFF), memory, color);
															}
														} else if (local2274) {
															for (local563 = 0; local563 < color; local563++) {
																if (alpha == 0) {
																	local2282.method1429(local123, local563 * local468 + local114, memory, 1);
																} else {
																	local2282.method1426(local123, local114 + local563 * local468, -(alpha & 0xFF) + 256, memory, 1);
																}
															}
														} else if (local2279) {
															for (local563 = 0; local563 < memory; local563++) {
																if (alpha == 0) {
																	local2282.method1429(local276 * local563 + local123, local114, 1, color);
																} else {
																	local2282.method1426(local276 * local563 + local123, local114, 256 - (alpha & 0xFF), 1, color);
																}
															}
														} else {
															for (local563 = 0; local563 < memory; local563++) {
																for (local571 = 0; local571 < color; local571++) {
																	if (alpha == 0) {
																		sprite.render(local123 + local276 * local563, local468 * local571 + local114);
																	} else {
																		sprite.renderAlpha(local563 * local276 + local123, local468 * local571 + local114, 256 - (alpha & 0xFF));
																	}
																}
															}
														}

														GlRaster.setClip(arg0, arg6, arg4, arg7);
													} else {
														SoftwareRaster.method2498(local123, local114, local123 + component.width, local114 - -component.height);
														for (cardMemory = 0; cardMemory < memory; cardMemory++) {
															for (local556 = 0; local556 < color; local556++) {
																if (component.angle2d != 0) {
																	sprite.method1420(local114 + local468 * local556 + local468 / 2, component.angle2d, 4096, cardMemory * local276 + local123 + local276 / 2);
																} else if (alpha == 0) {
																	sprite.render(cardMemory * local276 + local123, local468 * local556 + local114);
																} else {
																	sprite.renderAlpha(cardMemory * local276 + local123, local114 + local556 * local468, 256 - (alpha & 0xFF));
																}
															}
														}

														SoftwareRaster.setClip(arg0, arg6, arg4, arg7);
													}
												} else {
													memory = component.width * 4096 / local276;
													if (component.angle2d != 0) {
														sprite.method1420(local114 + component.height / 2, component.angle2d, memory, local123 + component.width / 2);
													} else if (alpha != 0) {
														sprite.method1422(local123, local114, component.width, component.height, 256 - (alpha & 0xFF));
													} else if (local276 == component.width && local468 == component.height) {
														sprite.render(local123, local114);
													} else {
														// render icons in a container i.e bank icons
														sprite.renderResized(local123, local114, component.width, component.height);
													}
												}
											} else if (Component.aBoolean72) {
												InterfaceList.redraw(component);
											}
										} else {
											sprite = component.method489(Static154.method2926(component));
											if (sprite != null) {
												sprite.render(local123, local114);
											} else if (Component.aBoolean72) {
												InterfaceList.redraw(component);
											}
										}
									} else {
										@Pc(2611) ObjType local2611;
										if (component.type == 6) {
											@Pc(2587) boolean local2587 = Static154.method2926(component);
											@Pc(2589) Model local2589 = null;
											if (local2587) {
												local276 = component.anInt462;
											} else {
												local276 = component.modelSeqId;
											}
											memory = 0;
											if (component.objId != -1) {
												local2611 = ObjTypeList.get(component.objId);
												if (local2611 != null) {
													local2611 = local2611.method1820(component.objCount);
													@Pc(2630) SeqType local2630 = local276 == -1 ? null : SeqTypeList.get(local276);
													local2589 = local2611.getModel(component.anInt496, component.anInt500, local2630, 1, component.anInt510);
													if (local2589 == null) {
														InterfaceList.redraw(component);
													} else {
														memory = -local2589.getMinY() / 2;
													}
												}
											} else if (component.modelType == 5) {
												if (component.modelId == -1) {
													local2589 = PlayerAppearance.DEFAULT.method1954(null, -1, null, null, 0, -1, 0, -1, -1);
												} else {
													color = component.modelId & 0x7FF;
													if (color == PlayerList.selfId) {
														color = 2047;
													}
													@Pc(2751) Player local2751 = PlayerList.players[color];
													@Pc(2760) SeqType local2760 = local276 == -1 ? null : SeqTypeList.get(local276);
													if (local2751 != null && (int) local2751.username.encode37() << 11 == (component.modelId & 0xFFFFF800)) {
														local2589 = local2751.appearance.method1954(null, -1, null, local2760, 0, -1, 0, component.anInt510, 0);
													}
												}
											} else if (local276 == -1) {
												local2589 = component.method488(-1, null, -1, 0, local2587, PlayerList.self.appearance);
												if (local2589 == null && Component.aBoolean72) {
													InterfaceList.redraw(component);
												}
											} else {
												@Pc(2689) SeqType local2689 = SeqTypeList.get(local276);
												local2589 = component.method488(component.anInt496, local2689, component.anInt510, component.anInt500, local2587, PlayerList.self.appearance);
												if (local2589 == null && Component.aBoolean72) {
													InterfaceList.redraw(component);
												}
											}
											if (local2589 != null) {
												if (component.anInt451 > 0) {
													color = (component.width << 8) / component.anInt451;
												} else {
													color = 256;
												}
												if (component.anInt526 <= 0) {
													cardMemory = 256;
												} else {
													cardMemory = (component.height << 8) / component.anInt526;
												}
												local556 = local123 + component.width / 2 + (color * component.anInt495 >> 8);
												objId = component.height / 2 + local114 + (cardMemory * component.anInt481 >> 8);
												if (GlRenderer.enabled) {
													if (component.modelOrtho) {
														GlRenderer.method4182(local556, objId, component.modelZoom, component.aShort11, color, cardMemory);
													} else {
														GlRenderer.method4148(local556, objId, color, cardMemory);
														GlRenderer.method4152((float) component.aShort10, (float) component.aShort11 * 1.5F);
													}
													GlRenderer.restoreLighting();
													GlRenderer.setDepthTestEnabled(true);
													GlRenderer.setFogEnabled(false);
													FogManager.method3935(Preferences.brightness);
													if (Static263.aBoolean299) {
														GlRaster.method1177();
														GlRenderer.clearDepthBuffer();
														GlRaster.setClip(arg0, arg6, arg4, arg7);
														Static263.aBoolean299 = false;
													}
													if (component.aBoolean34) {
														GlRenderer.disableDepthMask();
													}
													local563 = MathUtils.sin[component.modelXAngle] * component.modelZoom >> 16;
													local571 = component.modelZoom * MathUtils.cos[component.modelXAngle] >> 16;
													if (component.if3) {
														local2589.setCamera(component.modelYAngle, component.modelYOffset, component.modelXAngle, component.modelXOffset, component.modelZOffset + local563 + memory, component.modelZOffset + local571, -1L);
													} else {
														local2589.setCamera(component.modelYAngle, 0, component.modelXAngle, 0, local563, local571, -1L);
													}
													if (component.aBoolean34) {
														GlRenderer.enableDepthMask();
													}
												} else {
													Rasteriser.setBounds(local556, objId);
													local563 = MathUtils.sin[component.modelXAngle] * component.modelZoom >> 16;
													local571 = component.modelZoom * MathUtils.cos[component.modelXAngle] >> 16;
													if (!component.if3) {
														local2589.setCamera(component.modelYAngle, 0, component.modelXAngle, 0, local563, local571, -1L);
													} else if (component.modelOrtho) {
														((SoftwareModel) local2589).method4591(component.modelYAngle, component.modelYOffset, component.modelXAngle, component.modelXOffset, component.modelZOffset + memory + local563, local571 + component.modelZOffset, component.modelZoom);
													} else {
														local2589.setCamera(component.modelYAngle, component.modelYOffset, component.modelXAngle, component.modelXOffset, component.modelZOffset + local563 + memory, local571 + component.modelZOffset, -1L);
													}
													Rasteriser.prepareOffsets();
												}
											}
										} else {
											if (component.type == 7) {
												local1921 = component.method491(Sprites.nameIcons);
												if (local1921 == null) {
													if (Component.aBoolean72) {
														InterfaceList.redraw(component);
													}
													continue;
												}
												local276 = 0;
												for (local468 = 0; local468 < component.baseHeight; local468++) {
													for (memory = 0; memory < component.baseWidth; memory++) {
														if (component.objTypes[local276] > 0) {
															local2611 = ObjTypeList.get(component.objTypes[local276] - 1);
															@Pc(3159) JagString local3159;
															if (local2611.stackable != 1 && component.objCounts[local276] == 1) {
																local3159 = JagString.concatenate(new JagString[] { MiniMenu.aClass100_32, local2611.name, Static70.aClass100_978 });
															} else {
																local3159 = JagString.concatenate(new JagString[] { MiniMenu.aClass100_32, local2611.name, Static54.aClass100_375, Static70.method1548(component.objCounts[local276]) });
															}
															local556 = local123 + memory * (component.anInt512 + 115);
															objId = (component.anInt516 + 12) * local468 + local114;
															if (component.anInt460 == 0) {
																local1921.renderLeft(local3159, local556, objId, component.color, component.textAntiMacro ? 0 : -1);
															} else if (component.anInt460 == 1) {
																local1921.renderCenter(local3159, local556 + 57, objId, component.color, component.textAntiMacro ? 0 : -1);
															} else {
																local1921.renderRight(local3159, local556 + 115 - 1, objId, component.color, component.textAntiMacro ? 0 : -1);
															}
														}
														local276++;
													}
												}
											}
											if (component.type == 8 && Static43.aClass13_11 == component && Static133.anInt5235 == Static191.anInt4504) {
												local276 = 0;
												local270 = 0;
												@Pc(3297) JagString local3297 = component.text;
												@Pc(3299) Font local3299 = Fonts.p12Full;
												local3297 = JagString.method2465(component, local3297);
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
												local556 = local114 + component.height + 5;
												local270 += 6;
												local276 += 7;
												if (local556 + local276 > arg7) {
													local556 = arg7 - local276;
												}
												cardMemory = local123 + component.width - local270 - 5;
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
												local3297 = component.text;
												objId = local556 + local3299.lineHeight + 2;
												local3297 = JagString.method2465(component, local3297);
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
											if (component.type == 9) {
												if (component.aBoolean20) {
													local468 = local123 + component.width;
													local276 = local114 + component.height;
													memory = local114;
												} else {
													local276 = local114;
													memory = local114 + component.height;
													local468 = local123 + component.width;
												}
												if (component.lineWidth == 1) {
													if (GlRenderer.enabled) {
														GlRaster.method1185(local123, local276, local468, memory, component.color);
													} else {
														SoftwareRaster.method2500(local123, local276, local468, memory, component.color);
													}
												} else if (GlRenderer.enabled) {
													GlRaster.method1181(local123, local276, local468, memory, component.color, component.lineWidth);
												} else {
													SoftwareRaster.method2494(local123, local276, local468, memory, component.color, component.lineWidth);
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

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BIIIII)V")
	public static void method1624(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Sprites.scrollbars[0].renderTransparent(arg2, arg3);
		Sprites.scrollbars[1].renderTransparent(arg2, arg4 + arg3 - 16);
		@Pc(35) int local35 = arg4 * (arg4 - 32) / arg1;
		if (local35 < 8) {
			local35 = 8;
		}
		@Pc(54) int local54 = arg0 * (arg4 - local35 - 32) / (arg1 - arg4);
		if (!GlRenderer.enabled) {
			SoftwareRaster.fillRect(arg2, arg3 + 16, 16, arg4 - 32, anInt4306);
			SoftwareRaster.fillRect(arg2, local54 + arg3 + 16, 16, local35, anInt1704);
			SoftwareRaster.drawVerticalLine(arg2, local54 + arg3 + 16, local35, anInt4938);
			SoftwareRaster.drawVerticalLine(arg2 + 1, local54 + 16 + arg3, local35, anInt4938);
			SoftwareRaster.drawHorizontalLine(arg2, arg3 + local54 + 16, 16, anInt4938);
			SoftwareRaster.drawHorizontalLine(arg2, arg3 + local54 + 17, 16, anInt4938);
			SoftwareRaster.drawVerticalLine(arg2 + 15, local54 + 16 + arg3, local35, anInt671);
			SoftwareRaster.drawVerticalLine(arg2 + 14, arg3 - -17 - -local54, local35 - 1, anInt671);
			SoftwareRaster.drawHorizontalLine(arg2, local35 + arg3 + local54 + 15, 16, anInt671);
			SoftwareRaster.drawHorizontalLine(arg2 + 1, local35 + arg3 - (-local54 + -14), 15, anInt671);
			return;
		}
		GlRaster.method1186(arg2, arg3 + 16, 16, arg4 - 32, anInt4306);
		GlRaster.method1186(arg2, arg3 + local54 + 16, 16, local35, anInt1704);
		GlRaster.method1176(arg2, local54 + arg3 + 16, local35, anInt4938);
		GlRaster.method1176(arg2 + 1, local54 + 16 + arg3, local35, anInt4938);
		GlRaster.method1174(arg2, local54 + arg3 + 16, 16, anInt4938);
		GlRaster.method1174(arg2, local54 + arg3 + 17, 16, anInt4938);
		GlRaster.method1176(arg2 + 15, arg3 + (16 - -local54), local35, anInt671);
		GlRaster.method1176(arg2 + 14, arg3 - -local54 + 17, local35 - 1, anInt671);
		GlRaster.method1174(arg2, local35 + arg3 + local54 + 15, 16, anInt671);
		GlRaster.method1174(arg2 + 1, arg3 + 14 - -local54 + local35, 15, anInt671);
	}
}
