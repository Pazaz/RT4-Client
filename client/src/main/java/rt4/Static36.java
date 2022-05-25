package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int anInt1885;
	@OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
	public static int anInt660 = -1;
    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public static int anInt3337 = 0;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!be;)Lclient!be;")
	public static Component method938(@OriginalArg(0) Component arg0) {
		@Pc(4) int local4 = InterfaceList.getServerActiveProperties(arg0).method505();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = InterfaceList.getComponent(arg0.layer);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!be;IIIIIII)V")
	public static void method946(@OriginalArg(0) Component[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Component component = arg0[local1];
			if (component != null && component.layer == arg1 && (!component.usingScripts || component.type == 0 || component.aBoolean25 || InterfaceList.getServerActiveProperties(component).accessMask != 0 || component == Static40.aClass13_1 || component.anInt453 == 1338) && (!component.usingScripts || !method947(component))) {
				@Pc(50) int local50 = component.x + arg6;
				@Pc(55) int local55 = component.y + arg7;
				@Pc(61) int local61;
				@Pc(63) int local63;
				@Pc(65) int local65;
				@Pc(67) int local67;
				if (component.type == 2) {
					local61 = arg2;
					local63 = arg3;
					local65 = arg4;
					local67 = arg5;
				} else {
					@Pc(73) int local73 = local50 + component.width;
					@Pc(78) int local78 = local55 + component.height;
					if (component.type == 9) {
						local73++;
						local78++;
					}
					local61 = local50 > arg2 ? local50 : arg2;
					local63 = local55 > arg3 ? local55 : arg3;
					local65 = local73 < arg4 ? local73 : arg4;
					local67 = local78 < arg5 ? local78 : arg5;
				}
				if (component == Static40.aClass13_14) {
					Static44.aBoolean83 = true;
					Static124.anInt3075 = local50;
					anInt660 = local55;
				}
				if (!component.usingScripts || local61 < local65 && local63 < local67) {
					if (component.type == 0) {
						if (!component.usingScripts && method947(component) && Static180.aClass13_22 != component) {
							continue;
						}
						if (component.noClickThrough && Mouse.anInt4873 >= local61 && Mouse.anInt5032 >= local63 && Mouse.anInt4873 < local65 && Mouse.anInt5032 < local67) {
							for (@Pc(164) HookRequest local164 = (HookRequest) InterfaceList.lowPriorityRequests.head(); local164 != null; local164 = (HookRequest) InterfaceList.lowPriorityRequests.next()) {
								if (local164.aBoolean158) {
									local164.unlink();
									local164.source.aBoolean19 = false;
								}
							}
							if (Static40.anInt4851 == 0) {
								Static40.aClass13_14 = null;
								Static40.aClass13_1 = null;
							}
							anInt3337 = 0;
						}
					}
					if (component.usingScripts) {
						@Pc(207) boolean local207;
						if (Mouse.anInt4873 >= local61 && Mouse.anInt5032 >= local63 && Mouse.anInt4873 < local65 && Mouse.anInt5032 < local67) {
							local207 = true;
						} else {
							local207 = false;
						}
						@Pc(212) boolean local212 = false;
						if (Mouse.pressedButton == 1 && local207) {
							local212 = true;
						}
						@Pc(221) boolean local221 = false;
						if (Mouse.clickButton == 1 && Mouse.clickX >= local61 && Mouse.clickY >= local63 && Mouse.clickX < local65 && Mouse.clickY < local67) {
							local221 = true;
						}
						@Pc(243) int i;
						@Pc(322) int k;
						if (component.aByteArray8 != null) {
							for (i = 0; i < component.aByteArray8.length; i++) {
								if (Keyboard.pressedKeys[component.aByteArray8[i]]) {
									if (component.anIntArray49 == null || client.loop >= component.anIntArray49[i]) {
										@Pc(279) byte local279 = component.aByteArray7[i];
										if (local279 == 0 || ((local279 & 0x2) == 0 || Keyboard.pressedKeys[Keyboard.KEY_ALT]) && ((local279 & 0x1) == 0 || Keyboard.pressedKeys[Keyboard.KEY_CTRL]) && ((local279 & 0x4) == 0 || Keyboard.pressedKeys[Keyboard.KEY_SHIFT])) {
											ClientProt.method4512(JagString.EMPTY, -1, i + 1, component.id);
											k = component.anIntArray46[i];
											if (component.anIntArray49 == null) {
												component.anIntArray49 = new int[component.aByteArray8.length];
											}
											if (k == 0) {
												component.anIntArray49[i] = Integer.MAX_VALUE;
											} else {
												component.anIntArray49[i] = client.loop + k;
											}
										}
									}
								} else if (component.anIntArray49 != null) {
									component.anIntArray49[i] = 0;
								}
							}
						}
						if (local221) {
							Static40.method1015(Mouse.clickY - local55, Mouse.clickX - local50, component);
						}
						if (Static40.aClass13_14 != null && Static40.aClass13_14 != component && local207 && InterfaceList.getServerActiveProperties(component).method509()) {
							Static56.aClass13_12 = component;
						}
						if (component == Static40.aClass13_1) {
							Static146.aBoolean174 = true;
							Static81.anInt2225 = local50;
							Static228.anInt5103 = local55;
						}
						if (component.aBoolean25 || component.anInt453 != 0) {
							@Pc(399) HookRequest request;
							if (local207 && MouseWheel.wheelRotation != 0 && component.onScroll != null) {
								request = new HookRequest();
								request.aBoolean158 = true;
								request.source = component;
								request.mouseY = MouseWheel.wheelRotation;
								request.arguments = component.onScroll;
								InterfaceList.lowPriorityRequests.addTail(request);
							}
							if (Static40.aClass13_14 != null || Static118.aClass13_15 != null || Static40.aBoolean108 || component.anInt453 != 1400 && anInt3337 > 0) {
								local221 = false;
								local212 = false;
								local207 = false;
							}
							@Pc(508) int skill;
							if (component.anInt453 != 0) {
								if (component.anInt453 == 1337) {
									Static280.aClass13_26 = component;
									InterfaceList.redraw(component);
									continue;
								}
								if (component.anInt453 == 1338) {
									if (local221) {
										Static1.anInt5 = Mouse.clickX - local50;
										Static107.anInt2878 = Mouse.clickY - local55;
									}
									continue;
								}
								if (component.anInt453 == 1400) {
									WorldMap.component = component;
									if (local221) {
										if (Keyboard.pressedKeys[Keyboard.KEY_CTRL] && LoginManager.staffModLevel > 0) {
											i = (int) ((double) (Mouse.clickX - local50 - component.width / 2) * 2.0D / (double) WorldMap.zoom);
											skill = (int) ((double) (Mouse.clickY - local55 - component.height / 2) * 2.0D / (double) WorldMap.zoom);
											k = WorldMap.anInt435 + i;
											@Pc(516) int local516 = WorldMap.anInt919 + skill;
											@Pc(520) int local520 = k + WorldMap.originX;
											@Pc(528) int local528 = WorldMap.length + WorldMap.originZ - local516 - 1;
											Cheat.teleport(local520, local528, 0);
											ClientProt.closeWidget();
											continue;
										}
										anInt3337 = 1;
										Static40.anInt5388 = Mouse.anInt4873;
										Static40.anInt4035 = Mouse.anInt5032;
										continue;
									}
									if (local212 && anInt3337 > 0) {
										if (anInt3337 == 1 && (Static40.anInt5388 != Mouse.anInt4873 || Static40.anInt4035 != Mouse.anInt5032)) {
											Static197.anInt4620 = WorldMap.anInt435;
											anInt1885 = WorldMap.anInt919;
											anInt3337 = 2;
										}
										if (anInt3337 == 2) {
											WorldMap.method1964(Static197.anInt4620 + (int) ((double) (Static40.anInt5388 - Mouse.anInt4873) * 2.0D / (double) WorldMap.targetZoom));
											WorldMap.method4641(anInt1885 + (int) ((double) (Static40.anInt4035 - Mouse.anInt5032) * 2.0D / (double) WorldMap.targetZoom));
										}
										continue;
									}
									anInt3337 = 0;
									continue;
								}
								if (component.anInt453 == 1401) {
									if (local212) {
										WorldMap.method2387(component.width, Mouse.anInt5032 - local55, Mouse.anInt4873 - local50, component.height);
									}
									continue;
								}
								if (component.anInt453 == 1402) {
									if (!GlRenderer.enabled) {
										InterfaceList.redraw(component);
									}
									continue;
								}
							}
							if (!component.aBoolean24 && local221) {
								component.aBoolean24 = true;
								if (component.onClickRepeat != null) {
									request = new HookRequest();
									request.aBoolean158 = true;
									request.source = component;
									request.mouseX = Mouse.clickX - local50;
									request.mouseY = Mouse.clickY - local55;
									request.arguments = component.onClickRepeat;
									InterfaceList.lowPriorityRequests.addTail(request);
								}
							}
							if (component.aBoolean24 && local212 && component.onDrag != null) {
								request = new HookRequest();
								request.aBoolean158 = true;
								request.source = component;
								request.mouseX = Mouse.anInt4873 - local50;
								request.mouseY = Mouse.anInt5032 - local55;
								request.arguments = component.onDrag;
								InterfaceList.lowPriorityRequests.addTail(request);
							}
							if (component.aBoolean24 && !local212) {
								component.aBoolean24 = false;
								if (component.onRelease != null) {
									request = new HookRequest();
									request.aBoolean158 = true;
									request.source = component;
									request.mouseX = Mouse.anInt4873 - local50;
									request.mouseY = Mouse.anInt5032 - local55;
									request.arguments = component.onRelease;
									Static115.mediumPriorityRequests.addTail(request);
								}
							}
							if (local212 && component.onHold != null) {
								request = new HookRequest();
								request.aBoolean158 = true;
								request.source = component;
								request.mouseX = Mouse.anInt4873 - local50;
								request.mouseY = Mouse.anInt5032 - local55;
								request.arguments = component.onHold;
								InterfaceList.lowPriorityRequests.addTail(request);
							}
							if (!component.aBoolean19 && local207) {
								component.aBoolean19 = true;
								if (component.onMouseOver != null) {
									request = new HookRequest();
									request.aBoolean158 = true;
									request.source = component;
									request.mouseX = Mouse.anInt4873 - local50;
									request.mouseY = Mouse.anInt5032 - local55;
									request.arguments = component.onMouseOver;
									InterfaceList.lowPriorityRequests.addTail(request);
								}
							}
							if (component.aBoolean19 && local207 && component.onMouseRepeat != null) {
								request = new HookRequest();
								request.aBoolean158 = true;
								request.source = component;
								request.mouseX = Mouse.anInt4873 - local50;
								request.mouseY = Mouse.anInt5032 - local55;
								request.arguments = component.onMouseRepeat;
								InterfaceList.lowPriorityRequests.addTail(request);
							}
							if (component.aBoolean19 && !local207) {
								component.aBoolean19 = false;
								if (component.onMouseLeave != null) {
									request = new HookRequest();
									request.aBoolean158 = true;
									request.source = component;
									request.mouseX = Mouse.anInt4873 - local50;
									request.mouseY = Mouse.anInt5032 - local55;
									request.arguments = component.onMouseLeave;
									Static115.mediumPriorityRequests.addTail(request);
								}
							}
							if (component.onTimer != null) {
								request = new HookRequest();
								request.source = component;
								request.arguments = component.onTimer;
								Static4.highPriorityRequests.addTail(request);
							}
							@Pc(966) HookRequest request2;
							if (component.onVarcTransmit != null && VarcDomain.updatedVarcsWriterIndex > component.updatedVarcsReaderIndex) {
								if (component.varcTriggers == null || VarcDomain.updatedVarcsWriterIndex - component.updatedVarcsReaderIndex > 32) {
									request = new HookRequest();
									request.source = component;
									request.arguments = component.onVarcTransmit;
									InterfaceList.lowPriorityRequests.addTail(request);
								} else {
									label563: for (i = component.updatedVarcsReaderIndex; i < VarcDomain.updatedVarcsWriterIndex; i++) {
										skill = VarcDomain.updatedVarcs[i & 0x1F];
										for (k = 0; k < component.varcTriggers.length; k++) {
											if (component.varcTriggers[k] == skill) {
												request2 = new HookRequest();
												request2.source = component;
												request2.arguments = component.onVarcTransmit;
												InterfaceList.lowPriorityRequests.addTail(request2);
												break label563;
											}
										}
									}
								}
								component.updatedVarcsReaderIndex = VarcDomain.updatedVarcsWriterIndex;
							}
							if (component.onVarcstrTransmit != null && VarcDomain.updatedVarcstrsWriterIndex > component.updatedVarcstrsReaderIndex) {
								if (component.varcstrTriggers == null || VarcDomain.updatedVarcstrsWriterIndex - component.updatedVarcstrsReaderIndex > 32) {
									request = new HookRequest();
									request.source = component;
									request.arguments = component.onVarcstrTransmit;
									InterfaceList.lowPriorityRequests.addTail(request);
								} else {
									label539: for (i = component.updatedVarcstrsReaderIndex; i < VarcDomain.updatedVarcstrsWriterIndex; i++) {
										skill = VarcDomain.updatedVarcstrs[i & 0x1F];
										for (k = 0; k < component.varcstrTriggers.length; k++) {
											if (component.varcstrTriggers[k] == skill) {
												request2 = new HookRequest();
												request2.source = component;
												request2.arguments = component.onVarcstrTransmit;
												InterfaceList.lowPriorityRequests.addTail(request2);
												break label539;
											}
										}
									}
								}
								component.updatedVarcstrsReaderIndex = VarcDomain.updatedVarcstrsWriterIndex;
							}
							if (component.onVarpTransmit != null && VarpDomain.updatedVarpsWriterIndex > component.updatedVarpsReaderIndex) {
								if (component.varpTriggers == null || VarpDomain.updatedVarpsWriterIndex - component.updatedVarpsReaderIndex > 32) {
									request = new HookRequest();
									request.source = component;
									request.arguments = component.onVarpTransmit;
									InterfaceList.lowPriorityRequests.addTail(request);
								} else {
									label515: for (i = component.updatedVarpsReaderIndex; i < VarpDomain.updatedVarpsWriterIndex; i++) {
										skill = VarpDomain.updatedVarps[i & 0x1F];
										for (k = 0; k < component.varpTriggers.length; k++) {
											if (component.varpTriggers[k] == skill) {
												request2 = new HookRequest();
												request2.source = component;
												request2.arguments = component.onVarpTransmit;
												InterfaceList.lowPriorityRequests.addTail(request2);
												break label515;
											}
										}
									}
								}
								component.updatedVarpsReaderIndex = VarpDomain.updatedVarpsWriterIndex;
							}
							if (component.onInvTransmit != null && Inv.updatedInventoriesWriterIndex > component.updatedInventoriesReaderIndex) {
								if (component.inventoryTriggers == null || Inv.updatedInventoriesWriterIndex - component.updatedInventoriesReaderIndex > 32) {
									request = new HookRequest();
									request.source = component;
									request.arguments = component.onInvTransmit;
									InterfaceList.lowPriorityRequests.addTail(request);
								} else {
									outer:
									for (i = component.updatedInventoriesReaderIndex; i < Inv.updatedInventoriesWriterIndex; i++) {
										skill = Inv.updatedInventories[i & 0x1F];
										for (k = 0; k < component.inventoryTriggers.length; k++) {
											if (component.inventoryTriggers[k] == skill) {
												request2 = new HookRequest();
												request2.source = component;
												request2.arguments = component.onInvTransmit;
												InterfaceList.lowPriorityRequests.addTail(request2);
												break outer;
											}
										}
									}
								}
								component.updatedInventoriesReaderIndex = Inv.updatedInventoriesWriterIndex;
							}
							if (component.onStatTransmit != null && PlayerSkillXpTable.updatedStatsWriterIndex > component.updatedStatsReaderIndex) {
								if (component.statTriggers == null || PlayerSkillXpTable.updatedStatsWriterIndex - component.updatedStatsReaderIndex > 32) {
									request = new HookRequest();
									request.source = component;
									request.arguments = component.onStatTransmit;
									InterfaceList.lowPriorityRequests.addTail(request);
								} else {
									outer:
									for (i = component.updatedStatsReaderIndex; i < PlayerSkillXpTable.updatedStatsWriterIndex; i++) {
										skill = PlayerSkillXpTable.updatedStats[i & 0x1F];
										for (k = 0; k < component.statTriggers.length; k++) {
											if (component.statTriggers[k] == skill) {
												request2 = new HookRequest();
												request2.source = component;
												request2.arguments = component.onStatTransmit;
												InterfaceList.lowPriorityRequests.addTail(request2);
												break outer;
											}
										}
									}
								}
								component.updatedStatsReaderIndex = PlayerSkillXpTable.updatedStatsWriterIndex;
							}
							if (Chat.transmitAt > component.lastTransmitTimer && component.onMsg != null) {
								request = new HookRequest();
								request.source = component;
								request.arguments = component.onMsg;
								InterfaceList.lowPriorityRequests.addTail(request);
							}
							if (FriendsList.transmitAt > component.lastTransmitTimer && component.onFriendTransmit != null) {
								request = new HookRequest();
								request.source = component;
								request.arguments = component.onFriendTransmit;
								InterfaceList.lowPriorityRequests.addTail(request);
							}
							if (ClanChat.transmitAt > component.lastTransmitTimer && component.onClanTransmit != null) {
								request = new HookRequest();
								request.source = component;
								request.arguments = component.onClanTransmit;
								InterfaceList.lowPriorityRequests.addTail(request);
							}
							if (StockMarketManager.transmitAt > component.lastTransmitTimer && component.onStockTransmit != null) {
								request = new HookRequest();
								request.source = component;
								request.arguments = component.onStockTransmit;
								InterfaceList.lowPriorityRequests.addTail(request);
							}
							if (InterfaceList.miscTransmitAt > component.lastTransmitTimer && component.onMiscTransmit != null) {
								request = new HookRequest();
								request.source = component;
								request.arguments = component.onMiscTransmit;
								InterfaceList.lowPriorityRequests.addTail(request);
							}
							component.lastTransmitTimer = InterfaceList.transmitTimer;
							if (component.onKey != null) {
								for (i = 0; i < InterfaceList.keyQueueSize; i++) {
									@Pc(1430) HookRequest local1430 = new HookRequest();
									local1430.source = component;
									local1430.keyCode = InterfaceList.keyCodes[i];
									local1430.keyChar = InterfaceList.keyChars[i];
									local1430.arguments = component.onKey;
									InterfaceList.lowPriorityRequests.addTail(local1430);
								}
							}
							if (Camera.aBoolean16 && component.onMinimapUnlock != null) {
								request = new HookRequest();
								request.source = component;
								request.arguments = component.onMinimapUnlock;
								InterfaceList.lowPriorityRequests.addTail(request);
							}
						}
					}
					if (!component.usingScripts && Static40.aClass13_14 == null && Static118.aClass13_15 == null && !Static40.aBoolean108) {
						if ((component.anInt470 >= 0 || component.anInt480 != 0) && Mouse.anInt4873 >= local61 && Mouse.anInt5032 >= local63 && Mouse.anInt4873 < local65 && Mouse.anInt5032 < local67) {
							if (component.anInt470 >= 0) {
								Static180.aClass13_22 = arg0[component.anInt470];
							} else {
								Static180.aClass13_22 = component;
							}
						}
						if (component.type == 8 && Mouse.anInt4873 >= local61 && Mouse.anInt5032 >= local63 && Mouse.anInt4873 < local65 && Mouse.anInt5032 < local67) {
							Static43.aClass13_11 = component;
						}
						if (component.scrollMaxV > component.height) {
							Static236.method4049(Mouse.anInt5032, component.height, component, Mouse.anInt4873, local50 + component.width, local55, component.scrollMaxV);
						}
					}
					if (component.type == 0) {
						method946(arg0, component.id, local61, local63, local65, local67, local50 - component.scrollX, local55 - component.scrollY);
						if (component.createdComponents != null) {
							method946(component.createdComponents, component.id, local61, local63, local65, local67, local50 - component.scrollX, local55 - component.scrollY);
						}
						@Pc(1595) ComponentPointer local1595 = (ComponentPointer) InterfaceList.openInterfaces.get((long) component.id);
						if (local1595 != null) {
							Static57.method1320(local50, local63, local55, local65, local1595.anInt5878, local61, local67);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!be;)Z")
	public static boolean method947(@OriginalArg(0) Component arg0) {
		if (Static121.aBoolean154) {
			if (InterfaceList.getServerActiveProperties(arg0).accessMask != 0) {
				return false;
			}
			if (arg0.type == 0) {
				return false;
			}
		}
		return arg0.hidden;
	}
}
