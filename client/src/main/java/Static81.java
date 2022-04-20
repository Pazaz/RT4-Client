import java.awt.Point;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!gg", name = "Z", descriptor = "I")
	public static int anInt2222;

	@OriginalMember(owner = "client!gg", name = "ab", descriptor = "Lclient!ve;")
	public static Js5 aClass153_34;

	@OriginalMember(owner = "client!gg", name = "bb", descriptor = "I")
	public static int anInt2223;

	@OriginalMember(owner = "client!gg", name = "U", descriptor = "I")
	public static int modeWhat = 0;

	@OriginalMember(owner = "client!gg", name = "W", descriptor = "Lclient!na;")
	public static final JagString aClass100_475 = Static28.parse("null");

	@OriginalMember(owner = "client!gg", name = "Y", descriptor = "Lclient!na;")
	public static final JagString aClass100_476 = Static28.parse("::gc");

	@OriginalMember(owner = "client!gg", name = "db", descriptor = "I")
	public static int anInt2225 = -1;

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(II)V")
	public static void method1750(@OriginalArg(0) int arg0) {
		if (!Static64.aBoolean111) {
			arg0 = -1;
		}
		if (arg0 == Static115.anInt2941) {
			return;
		}
		if (arg0 != -1) {
			@Pc(24) Class63 local24 = Static202.method3660(arg0);
			@Pc(28) SoftwareSprite local28 = local24.method2246();
			if (local28 == null) {
				arg0 = -1;
			} else {
				Static71.signLink.method5113(local28.method301(), local28.anInt1860, Static154.canvas, new Point(local24.anInt2852, local24.anInt2850), local28.anInt1866);
				Static115.anInt2941 = arg0;
			}
		}
		if (arg0 == -1 && Static115.anInt2941 != -1) {
			Static71.signLink.method5113(null, -1, Static154.canvas, new Point(), -1);
			Static115.anInt2941 = -1;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([[IZ)V")
	public static void method1751(@OriginalArg(0) int[][] arg0) {
		Static71.anIntArrayArray10 = arg0;
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(II)Lclient!dm;")
	public static IdkType method1752(@OriginalArg(0) int arg0) {
		@Pc(10) IdkType local10 = (IdkType) Static67.aClass99_20.method3106((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static216.aClass153_31.method4495(3, arg0);
		local10 = new IdkType();
		if (local21 != null) {
			local10.method1209(new Buffer(local21));
		}
		Static67.aClass99_20.method3095(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "(II)V")
	public static void method1753(@OriginalArg(0) int arg0) {
		if (!Static245.load(arg0)) {
			return;
		}
		@Pc(15) Component[] local15 = Static241.components[arg0];
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(29) Component local29 = local15[local17];
			if (local29 != null) {
				local29.anInt496 = 1;
				local29.anInt510 = 0;
				local29.anInt500 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!ve;)V")
	public static void method1754(@OriginalArg(1) Js5 arg0) {
		Static138.anInt3443 = arg0.method4482(Static12.aClass100_73);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
	public static void method1756() {
		// todo: consolidate/rename static classes
		if (Static267.anInt5775 > 0) {
			Static267.anInt5775--;
		}
		if (Static60.rebootTimer > 1) {
			Static60.rebootTimer--;
			Static209.miscTransmitAt = Static119.transmitTimer;
		}
		if (Static224.aBoolean247) {
			Static224.aBoolean247 = false;
			Static175.method3279();
			return;
		}
		for (@Pc(34) int i = 0; i < 100 && Static10.readPacket(); i++) {
		}
		if (Static244.anInt5370 != 30) {
			return;
		}
		Static233.loop(Static6.outboundBuffer); // ReflectionCheck
		@Pc(60) Object mouseRecorder = Static178.instance.lock;
		@Pc(86) int offset;
		@Pc(79) int samples;
		@Pc(88) int i;
		@Pc(106) int y;
		@Pc(111) int x;
		@Pc(182) int dx;
		@Pc(189) int dy;
		synchronized (mouseRecorder) {
			if (!Static245.enabled) {
				Static178.instance.samples = 0;
			} else if (Static150.clickButton != 0 || Static178.instance.samples >= 40) {
				Static6.outboundBuffer.p1isaac(123);
				samples = 0;
				Static6.outboundBuffer.p1(0);
				offset = Static6.outboundBuffer.offset;
				for (i = 0; Static178.instance.samples > i && Static6.outboundBuffer.offset - offset < 240; i++) {
					samples++;
					y = Static178.instance.y[i];
					x = Static178.instance.x[i];
					if (y < 0) {
						y = 0;
					} else if (y > 65534) {
						y = 65534;
					}
					if (x < 0) {
						x = 0;
					} else if (x > 65534) {
						x = 65534;
					}
					@Pc(142) boolean outsideWindow = false;
					if (Static178.instance.y[i] == -1 && Static178.instance.x[i] == -1) {
						outsideWindow = true;
						y = -1;
						x = -1;
					}
					if (Static264.mouseRecorderPrevX != x || y != Static179.mouseRecorderPrevY) {
						dx = x - Static264.mouseRecorderPrevX;
						Static264.mouseRecorderPrevX = x;
						dy = y - Static179.mouseRecorderPrevY;
						Static179.mouseRecorderPrevY = y;
						if (Static204.anInt4762 < 8 && dx >= -32 && dx <= 31 && dy >= -32 && dy <= 31) {
							dy += 32;
							dx += 32;
							Static6.outboundBuffer.p2(dy + (Static204.anInt4762 << 12) + (dx << 6));
							Static204.anInt4762 = 0;
						} else if (Static204.anInt4762 < 32 && dx >= -128 && dx <= 127 && dy >= -128 && dy <= 127) {
							Static6.outboundBuffer.p1(Static204.anInt4762 + 128);
							dy += 128;
							dx += 128;
							Static6.outboundBuffer.p2((dx << 8) + dy);
							Static204.anInt4762 = 0;
						} else if (Static204.anInt4762 < 32) {
							Static6.outboundBuffer.p1(Static204.anInt4762 + 192);
							if (outsideWindow) {
								Static6.outboundBuffer.p4(Integer.MIN_VALUE);
							} else {
								Static6.outboundBuffer.p4(x | y << 16);
							}
							Static204.anInt4762 = 0;
						} else {
							Static6.outboundBuffer.p2(Static204.anInt4762 + 57344);
							if (outsideWindow) {
								Static6.outboundBuffer.p4(Integer.MIN_VALUE);
							} else {
								Static6.outboundBuffer.p4(x | y << 16);
							}
							Static204.anInt4762 = 0;
						}
					} else if (Static204.anInt4762 < 2047) {
						Static204.anInt4762++;
					}
				}
				Static6.outboundBuffer.p1len(Static6.outboundBuffer.offset - offset);
				if (Static178.instance.samples > samples) {
					Static178.instance.samples -= samples;
					for (i = 0; i < Static178.instance.samples; i++) {
						Static178.instance.x[i] = Static178.instance.x[samples + i];
						Static178.instance.y[i] = Static178.instance.y[samples + i];
					}
				} else {
					Static178.instance.samples = 0;
				}
			}
		}
		if (Static150.clickButton != 0) {
			@Pc(411) long loops = (Static133.clickTime - Static183.prevClickTime) / 50L;
			samples = Static60.clickY;
			if (samples < 0) {
				samples = 0;
			} else if (samples > 65535) {
				samples = 65535;
			}
			if (loops > 32767L) {
				loops = 32767L;
			}
			i = Static7.clickX;
			Static183.prevClickTime = Static133.clickTime;
			@Pc(437) byte button = 0;
			if (i < 0) {
				i = 0;
			} else if (i > 65535) {
				i = 65535;
			}
			x = (int) loops;
			if (Static150.clickButton == 2) {
				button = 1;
			}
			Static6.outboundBuffer.p1isaac(75);
			Static6.outboundBuffer.p2leadd(button << 15 | x);
			Static6.outboundBuffer.p4me(i | samples << 16);
		}
		if (Static16.anInt551 > 0) {
			Static16.anInt551--;
		}
		if (Static33.aBoolean63) {
			for (i = 0; i < Static182.keyQueueSize; i++) {
				offset = Static227.keyCodes[i];
				if (offset == 98 || offset == 99 || offset == 96 || offset == 97) {
					Static197.aBoolean228 = true;
					break;
				}
			}
		} else if (Static187.pressedKeys[96] || Static187.pressedKeys[97] || Static187.pressedKeys[98] || Static187.pressedKeys[99]) {
			Static197.aBoolean228 = true;
		}
		if (Static197.aBoolean228 && Static16.anInt551 <= 0) {
			Static16.anInt551 = 20;
			Static197.aBoolean228 = false;
			Static6.outboundBuffer.p1isaac(21);
			Static6.outboundBuffer.p2add(Static72.anInt2031);
			Static6.outboundBuffer.p2le(Static57.anInt1747);
		}
		if (Static26.focus && !Static67.prevFocus) {
			Static67.prevFocus = true;
			Static6.outboundBuffer.p1isaac(22);
			Static6.outboundBuffer.p1(1);
		}
		if (!Static26.focus && Static67.prevFocus) {
			Static67.prevFocus = false;
			Static6.outboundBuffer.p1isaac(22);
			Static6.outboundBuffer.p1(0);
		}
		if (!Static18.sentToServer) {
			Static6.outboundBuffer.p1isaac(98);
			Static6.outboundBuffer.p4(Static145.method2746());
			Static18.sentToServer = true;
		}
		Static31.method846();
		if (Static244.anInt5370 != 30) {
			return;
		}
		Static251.loop(); // ChangeLocRequest
		Static192.loop(); // AttachLocRequest
		Static54.loop(); // SoundPlayer
		Static201.anInt1862++;
		if (Static201.anInt1862 > 750) {
			Static175.method3279();
			return;
		}
		Static71.method1444();
		Static109.method2274();
		Static19.loop(); // OverheadChat
		if (Static24.component != null) {
			Static12.method447();
		}
		// VarpDomain
		for (i = Static38.poll(true); i != -1; i = Static38.poll(false)) {
			Static85.method1775(i);
			Static83.updatedVarps[Static70.updatedVarpsWriterIndex++ & 0x1F] = i;
		}
		@Pc(782) int modelId;
		// DelayedStateChange
		for (@Pc(709) DelayedStateChange change = Static127.poll(); change != null; change = Static127.poll()) {
			samples = change.method1011();
			i = change.method1012();
			if (samples == 1) {
				Static155.varcs[i] = change.intArg1;
				Static138.updatedVarcs[Static4.updatedVarcsWriterIndex++ & 0x1F] = i;
			} else if (samples == 2) {
				Static226.varcstrs[i] = change.stringArg;
				Static233.updatedVarcstrs[Static72.updatedVarcstrsWriterIndex++ & 0x1F] = i;
			} else {
				@Pc(773) Component component;
				if (samples == 3) {
					component = Static5.getComponent(i);
					if (!change.stringArg.method3108(component.aClass100_84)) {
						component.aClass100_84 = change.stringArg;
						Static43.method1143(component);
					}
				} else if (samples == 4) {
					component = Static5.getComponent(i);
					x = change.intArg1;
					dx = change.intArg2;
					modelId = change.intArg3;
					if (component.modelType != x || component.modelId != modelId || dx != component.anInt498) {
						component.modelId = modelId;
						component.anInt498 = dx;
						component.modelType = x;
						Static43.method1143(component);
					}
				} else if (samples == 5) {
					component = Static5.getComponent(i);
					if (component.anInt522 != change.intArg1 || change.intArg1 == -1) {
						component.anInt496 = 1;
						component.anInt500 = 0;
						component.anInt522 = change.intArg1;
						component.anInt510 = 0;
						Static43.method1143(component);
					}
				} else if (samples == 6) {
					y = change.intArg1;
					x = y >> 10 & 0x1F;
					dx = y & 0x1F;
					modelId = y >> 5 & 0x1F;
					@Pc(1189) Component local1189 = Static5.getComponent(i);
					dy = (dx << 3) + (modelId << 11) + (x << 19);
					if (dy != local1189.anInt474) {
						local1189.anInt474 = dy;
						Static43.method1143(local1189);
					}
				} else if (samples == 7) {
					component = Static5.getComponent(i);
					// todo: this should not be necessary, data/server-related?
					if (component != null) {
						@Pc(1145) boolean hidden = change.intArg1 == 1;
						if (hidden != component.hidden) {
							component.hidden = hidden;
							Static43.method1143(component);
						}
					}
				} else if (samples == 8) {
					component = Static5.getComponent(i);
					if (change.intArg1 != component.modelXAngle || component.modelYAngle != change.intArg3 || change.intArg2 != component.modelZoom) {
						component.modelXAngle = change.intArg1;
						component.modelZoom = change.intArg2;
						component.modelYAngle = change.intArg3;
						if (component.objId != -1) {
							if (component.anInt451 > 0) {
								component.modelZoom = component.modelZoom * 32 / component.anInt451;
							} else if (component.baseWidth > 0) {
								component.modelZoom = component.modelZoom * 32 / component.baseWidth;
							}
						}
						Static43.method1143(component);
					}
				} else if (samples == 9) {
					component = Static5.getComponent(i);
					if (change.intArg1 != component.objId || component.objCount != change.intArg3) {
						component.objId = change.intArg1;
						component.objCount = change.intArg3;
						Static43.method1143(component);
					}
				} else if (samples == 10) {
					component = Static5.getComponent(i);
					if (component.modelXOffset != change.intArg1 || change.intArg3 != component.modelZOffset || component.modelYOffset != change.intArg2) {
						component.modelZOffset = change.intArg3;
						component.modelYOffset = change.intArg2;
						component.modelXOffset = change.intArg1;
						Static43.method1143(component);
					}
				} else if (samples == 11) {
					component = Static5.getComponent(i);
					component.x = component.baseX = change.intArg1;
					component.yMode = 0;
					component.xMode = 0;
					component.y = component.baseY = change.intArg3;
					Static43.method1143(component);
				} else if (samples == 12) {
					component = Static5.getComponent(i);
					x = change.intArg1;
					if (component != null && component.anInt452 == 0) {
						if (x > component.anInt491 - component.anInt459) {
							x = component.anInt491 - component.anInt459;
						}
						if (x < 0) {
							x = 0;
						}
						if (x != component.scrollY) {
							component.scrollY = x;
							Static43.method1143(component);
						}
					}
				} else if (samples == 13) {
					component = Static5.getComponent(i);
					component.modelRotationSpeed = change.intArg1;
				}
			}
		}
		// Cross
		if (Static70.type != 0) {
			Static17.milliseconds += 20;
			if (Static17.milliseconds >= 400) {
				Static70.type = 0;
			}
		}
		Static178.anInt4247++;
		if (Static257.aClass13_7 != null) {
			Static72.anInt2043++;
			if (Static72.anInt2043 >= 15) {
				Static43.method1143(Static257.aClass13_7);
				Static257.aClass13_7 = null;
			}
		}
		@Pc(1361) Component local1361;
		if (Static118.aClass13_15 != null) {
			Static43.method1143(Static118.aClass13_15);
			if (Static149.anInt3554 + 5 < Static215.anInt4873 || Static215.anInt4873 < Static149.anInt3554 - 5 || Static206.anInt4773 + 5 < Static223.anInt5032 || Static206.anInt4773 - 5 > Static223.anInt5032) {
				Static123.aBoolean155 = true;
			}
			Static78.anInt2145++;
			if (Static22.anInt723 == 0) {
				if (Static123.aBoolean155 && Static78.anInt2145 >= 5) {
					if (Static118.aClass13_15 == Static169.aClass13_18 && Static4.anInt36 != Static18.anInt588) {
						local1361 = Static118.aClass13_15;
						@Pc(1363) byte local1363 = 0;
						if (Static179.anInt4254 == 1 && local1361.anInt453 == 206) {
							local1363 = 1;
						}
						if (local1361.objTypes[Static18.anInt588] <= 0) {
							local1363 = 0;
						}
						if (Static36.method940(local1361).method504()) {
							y = Static4.anInt36;
							x = Static18.anInt588;
							local1361.objTypes[x] = local1361.objTypes[y];
							local1361.objCounts[x] = local1361.objCounts[y];
							local1361.objTypes[y] = -1;
							local1361.objCounts[y] = 0;
						} else if (local1363 == 1) {
							x = Static18.anInt588;
							y = Static4.anInt36;
							while (x != y) {
								if (y > x) {
									local1361.swapObjs(y - 1, y);
									y--;
								} else if (x > y) {
									local1361.swapObjs(y + 1, y);
									y++;
								}
							}
						} else {
							local1361.swapObjs(Static18.anInt588, Static4.anInt36);
						}
						Static6.outboundBuffer.p1isaac(231);
						Static6.outboundBuffer.p2(Static4.anInt36);
						Static6.outboundBuffer.p4le2(Static118.aClass13_15.anInt507);
						Static6.outboundBuffer.p2add(Static18.anInt588);
						Static6.outboundBuffer.p1sub(local1363);
					}
				} else if ((Static116.anInt2952 == 1 || Static277.method4640(Static231.anInt5204 - 1)) && Static231.anInt5204 > 2) {
					Static226.method3901();
				} else if (Static231.anInt5204 > 0) {
					Static59.method1372();
				}
				Static150.clickButton = 0;
				Static72.anInt2043 = 10;
				Static118.aClass13_15 = null;
			}
		}
		Static146.aBoolean174 = false;
		Static56.aClass13_12 = null;
		Static44.aBoolean83 = false;
		Static182.keyQueueSize = 0;
		local1361 = Static180.aClass13_22;
		Static180.aClass13_22 = null;
		@Pc(1508) Component local1508 = Static43.aClass13_11;
		Static43.aClass13_11 = null;
		while (Static25.nextKey() && Static182.keyQueueSize < 128) {
			Static227.keyCodes[Static182.keyQueueSize] = Static102.keyCode;
			Static205.keyChars[Static182.keyQueueSize] = Static193.keyChar;
			Static182.keyQueueSize++;
		}
		// WorldMap.component
		Static24.component = null;
		if (Static154.topLevelInterace != -1) {
			Static57.method1320(0, 0, 0, Static48.anInt1448, Static154.topLevelInterace, 0, Static254.anInt5554);
		}
		Static119.transmitTimer++;
		while (true) {
			// todo: this is actually split up into low/medium/high
			@Pc(1569) Component highPriorityComponent;
			@Pc(1560) Component highPrioritySource;
			@Pc(1555) HookRequest highPriorityRequest;
			do {
				highPriorityRequest = (HookRequest) Static4.aClass69_2.method2287();
				if (highPriorityRequest == null) {
					while (true) {
						do {
							highPriorityRequest = (HookRequest) Static115.aClass69_70.method2287();
							if (highPriorityRequest == null) {
								while (true) {
									do {
										highPriorityRequest = (HookRequest) Static185.aClass69_101.method2287();
										if (highPriorityRequest == null) {
											if (Static24.component == null) {
												Static137.anInt3337 = 0;
											}
											if (Static105.aClass13_14 != null) {
												Static4.method28();
											}
											if (Static191.staffModLevel > 0 && Static187.pressedKeys[82] && Static187.pressedKeys[81] && Static58.wheelRotation != 0) {
												y = Static55.level - Static58.wheelRotation;
												if (y < 0) {
													y = 0;
												} else if (y > 3) {
													y = 3;
												}
												// Cheat
												Static61.teleport(Static173.self.movementQueueX[0] + Static225.originX, Static173.self.movementQueueZ[0] + Static142.originZ, y);
											}
											if (Static191.staffModLevel > 0 && Static187.pressedKeys[82] && Static187.pressedKeys[81]) {
												if (Static56.anInt1742 != -1) {
													Static61.teleport(Static225.originX + Static56.anInt1742, Static142.originZ - -Static116.anInt2954, Static55.level);
												}
												Static187.anInt4422 = 0;
												Static125.anInt3096 = 0;
											} else if (Static125.anInt3096 == 2) {
												if (Static56.anInt1742 != -1) {
													Static6.outboundBuffer.p1isaac(131);
													Static6.outboundBuffer.p4me(Static98.anInt2512);
													Static6.outboundBuffer.p2add(Static225.originX + Static56.anInt1742);
													Static6.outboundBuffer.p2leadd(Static15.anInt506);
													Static6.outboundBuffer.p2add(Static116.anInt2954 + Static142.originZ);
													Static70.type = 1;
													Static17.milliseconds = 0;
													Static25.y = Static60.clickY;
													Static122.x = Static7.clickX;
												}
												Static125.anInt3096 = 0;
											} else if (Static187.anInt4422 == 2) {
												if (Static56.anInt1742 != -1) {
													Static6.outboundBuffer.p1isaac(179);
													Static6.outboundBuffer.p2(Static142.originZ + Static116.anInt2954);
													Static6.outboundBuffer.p2(Static56.anInt1742 + Static225.originX);
													Static17.milliseconds = 0;
													Static70.type = 1;
													Static122.x = Static7.clickX;
													Static25.y = Static60.clickY;
												}
												Static187.anInt4422 = 0;
											} else if (Static56.anInt1742 != -1 && Static125.anInt3096 == 0 && Static187.anInt4422 == 0) {
												@Pc(1871) boolean local1871 = Static102.method2075(Static173.self.movementQueueZ[0], 0, 0, true, 0, Static56.anInt1742, 0, 0, 0, Static116.anInt2954, Static173.self.movementQueueX[0]);
												if (local1871) {
													Static25.y = Static60.clickY;
													Static17.milliseconds = 0;
													Static122.x = Static7.clickX;
													Static70.type = 1;
												}
											}
											Static56.anInt1742 = -1;
											Static7.method843();
											if (Static180.aClass13_22 != local1361) {
												if (local1361 != null) {
													Static43.method1143(local1361);
												}
												if (Static180.aClass13_22 != null) {
													Static43.method1143(Static180.aClass13_22);
												}
											}
											if (local1508 != Static43.aClass13_11 && Static191.anInt4504 == Static133.anInt5235) {
												if (local1508 != null) {
													Static43.method1143(local1508);
												}
												if (Static43.aClass13_11 != null) {
													Static43.method1143(Static43.aClass13_11);
												}
											}
											if (Static43.aClass13_11 == null) {
												if (Static133.anInt5235 > 0) {
													Static133.anInt5235--;
												}
											} else if (Static133.anInt5235 < Static191.anInt4504) {
												Static133.anInt5235++;
												if (Static191.anInt4504 == Static133.anInt5235) {
													Static43.method1143(Static43.aClass13_11);
												}
											}
											if (Static227.anInt5096 == 1) {
												Static250.method4273();
											} else if (Static227.anInt5096 == 2) {
												Static125.method2450();
											} else {
												Static40.method1008();
											}
											for (y = 0; y < 5; y++) {
												@Pc(2001) int local2001 = Static31.anIntArray76[y]++;
											}
											y = Static142.getIdleLoops(); // Mouse
											x = Static195.getIdleLoops(); // Keyboard
											if (y > 15000 && x > 15000) {
												Static267.anInt5775 = 250;
												Static48.setIdleLoops(14500);
												Static6.outboundBuffer.p1isaac(245);
											}
											if (Static33.openUrlRequest != null && Static33.openUrlRequest.status == 1) {
												if (Static33.openUrlRequest.result != null) {
													Static169.openUrl(Static175.url, Static164.newTab);
												}
												Static175.url = null;
												Static33.openUrlRequest = null;
												Static164.newTab = false;
											}
											Static131.anInt3251++;
											Static82.anInt2252++;
											Static143.anInt3486++;
											if (Static143.anInt3486 > 500) {
												Static143.anInt3486 = 0;
												modelId = (int) (Math.random() * 8.0D);
												if ((modelId & 0x4) == 4) {
													Static230.anInt5161 += Static220.anInt4941;
												}
												if ((modelId & 0x2) == 2) {
													Static206.anInt4774 += Static20.anInt659;
												}
												if ((modelId & 0x1) == 1) {
													Static132.anInt3291 += Static248.anInt4229;
												}
											}
											if (Static82.anInt2252 > 500) {
												Static82.anInt2252 = 0;
												modelId = (int) (Math.random() * 8.0D);
												if ((modelId & 0x1) == 1) {
													Static59.anInt1814 += Static263.anInt5755;
												}
												if ((modelId & 0x2) == 2) {
													Static273.anInt4130 += Static179.anInt4262;
												}
											}
											if (Static132.anInt3291 < -50) {
												Static248.anInt4229 = 2;
											}
											if (Static59.anInt1814 < -60) {
												Static263.anInt5755 = 2;
											}
											if (Static273.anInt4130 < -20) {
												Static179.anInt4262 = 1;
											}
											if (Static206.anInt4774 < -55) {
												Static20.anInt659 = 2;
											}
											if (Static206.anInt4774 > 55) {
												Static20.anInt659 = -2;
											}
											if (Static230.anInt5161 < -40) {
												Static220.anInt4941 = 1;
											}
											if (Static132.anInt3291 > 50) {
												Static248.anInt4229 = -2;
											}
											if (Static230.anInt5161 > 40) {
												Static220.anInt4941 = -1;
											}
											if (Static273.anInt4130 > 10) {
												Static179.anInt4262 = -1;
											}
											if (Static59.anInt1814 > 60) {
												Static263.anInt5755 = -2;
											}
											if (Static131.anInt3251 > 50) {
												Static6.outboundBuffer.p1isaac(93);
											}
											if (Static34.verifyIdChanged) {
												Static71.transmitVerifyId();
												Static34.verifyIdChanged = false;
											}
											try {
												if (Static124.socket != null && Static6.outboundBuffer.offset > 0) {
													Static124.socket.write(Static6.outboundBuffer.data, Static6.outboundBuffer.offset);
													Static131.anInt3251 = 0;
													Static6.outboundBuffer.offset = 0;
												}
											} catch (@Pc(2266) IOException local2266) {
												Static175.method3279();
											}
											return;
										}
										// low priority actually
										highPrioritySource = highPriorityRequest.source;
										if (highPrioritySource.componentId < 0) {
											break;
										}
										highPriorityComponent = Static5.getComponent(highPrioritySource.layer);
									} while (highPriorityComponent == null || highPriorityComponent.createdComponents == null || highPrioritySource.componentId >= highPriorityComponent.createdComponents.length || highPrioritySource != highPriorityComponent.createdComponents[highPrioritySource.componentId]);
									Static82.method1767(highPriorityRequest);
								}
							}
							highPrioritySource = highPriorityRequest.source;
							if (highPrioritySource.componentId < 0) {
								break;
							}
							highPriorityComponent = Static5.getComponent(highPrioritySource.layer);
						} while (highPriorityComponent == null || highPriorityComponent.createdComponents == null || highPriorityComponent.createdComponents.length <= highPrioritySource.componentId || highPriorityComponent.createdComponents[highPrioritySource.componentId] != highPrioritySource);
						Static82.method1767(highPriorityRequest);
					}
				}
				highPrioritySource = highPriorityRequest.source;
				if (highPrioritySource.componentId < 0) {
					break;
				}
				highPriorityComponent = Static5.getComponent(highPrioritySource.layer);
			} while (highPriorityComponent == null || highPriorityComponent.createdComponents == null || highPrioritySource.componentId >= highPriorityComponent.createdComponents.length || highPriorityComponent.createdComponents[highPrioritySource.componentId] != highPrioritySource);
			Static82.method1767(highPriorityRequest);
		}
	}
}
