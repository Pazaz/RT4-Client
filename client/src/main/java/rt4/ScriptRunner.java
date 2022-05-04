package rt4;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class ScriptRunner {

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "[Lclient!na;")
	public static final JagString[] stringStack = new JagString[1000];
	@OriginalMember(owner = "client!uj", name = "t", descriptor = "[I")
	public static final int[] intStack = new int[1000];
	@OriginalMember(owner = "client!fl", name = "Q", descriptor = "Lclient!na;")
	public static final JagString EMPTY_STRING = JagString.parse("");
	@OriginalMember(owner = "client!bb", name = "A", descriptor = "Lclient!na;")
	public static final JagString aClass100_74 = JagString.parse("::");
	@OriginalMember(owner = "client!be", name = "ib", descriptor = "Lclient!na;")
	public static final JagString EVENT_OPBASE = JagString.parse("event_opbase");
	@OriginalMember(owner = "client!da", name = "O", descriptor = "Lclient!na;")
	public static final JagString aClass100_253 = JagString.parse("(U0a )2 via: ");
    @OriginalMember(owner = "client!fl", name = "H", descriptor = "Lclient!na;")
	public static final JagString aClass100_446 = JagString.parse("<img=0>");
	@OriginalMember(owner = "client!nd", name = "b", descriptor = "Lclient!na;")
	public static final JagString aClass100_780 = JagString.parse("Clientscript error in: ");
	@OriginalMember(owner = "client!jh", name = "n", descriptor = "Lclient!bd;")
	public static QuickChatPhrase activePhrase;
	@OriginalMember(owner = "client!wf", name = "j", descriptor = "Lclient!be;")
	public static Component staticActiveComponent1;
	@OriginalMember(owner = "client!sg", name = "i", descriptor = "Lclient!be;")
	public static Component staticActiveComponent2;
	@OriginalMember(owner = "client!og", name = "g", descriptor = "[Lclient!na;")
	public static JagString[] stringLocals;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BILclient!jl;)V")
	public static void run(@OriginalArg(1) int maxCycles, @OriginalArg(2) HookRequest request) {
		@Pc(4) Object[] local4 = request.arguments;
		@Pc(10) int sid = (Integer) local4[0];
		@Pc(14) ClientScript script = ClientScriptList.get(sid);
		if (script == null) {
			return;
		}
		Static138.fp = 0;
		@Pc(26) int ssp = 0;
		@Pc(28) int isp = 0;
		@Pc(30) int pc = -1;
		@Pc(33) int[] intOperands = script.intOperands;
		@Pc(36) int[] opcodes = script.opcodes;
		@Pc(44) byte op = -1;
		@Pc(58) int cycles;
		try {
			Static215.intLocals = new int[script.anInt4667];
			@Pc(50) int intLocalIndex = 0;
			stringLocals = new JagString[script.anInt4671];
			@Pc(56) int stringLocalIndex = 0;
			@Pc(77) int id;
			@Pc(194) JagString value;
			for (cycles = 1; cycles < local4.length; cycles++) {
				if (local4[cycles] instanceof Integer) {
					id = (Integer) local4[cycles];
					if (id == 0x80000001) {
						id = request.mouseX;
					}
					if (id == 0x80000002) {
						id = request.mouseY;
					}
					if (id == 0x80000003) {
						id = request.source == null ? -1 : request.source.id;
					}
					if (id == 0x80000004) {
						id = request.op;
					}
					if (id == 0x80000005) {
						id = request.source == null ? -1 : request.source.createdComponentId;
					}
					if (id == 0x80000006) {
						id = request.target == null ? -1 : request.target.id;
					}
					if (id == 0x80000007) {
						id = request.target == null ? -1 : request.target.createdComponentId;
					}
					if (id == 0x80000008) {
						id = request.keyCode;
					}
					if (id == 0x80000009) {
						id = request.keyChar;
					}
					Static215.intLocals[intLocalIndex++] = id;
				} else if (local4[cycles] instanceof JagString) {
					value = (JagString) local4[cycles];
					if (value.strEquals(EVENT_OPBASE)) {
						value = request.opBase;
					}
					stringLocals[stringLocalIndex++] = value;
				}
			}
			cycles = 0;
			nextOp: while (true) {
				cycles++;
				if (maxCycles < cycles) {
					throw new RuntimeException("slow");
				}
				pc++;
				@Pc(226) int opcode = opcodes[pc];
				@Pc(803) int int3;
				@Pc(652) int local652;
				@Pc(809) int int1;
				@Pc(609) JagString string;
				if (opcode < 100) {
					if (opcode == 0) {
						intStack[isp++] = intOperands[pc];
						continue;
					}
					if (opcode == 1) {
						id = intOperands[pc];
						intStack[isp++] = VarpDomain.activeVarps[id];
						continue;
					}
					if (opcode == 2) {
						id = intOperands[pc];
						isp--;
						Static148.method2766(id, intStack[isp]);
						continue;
					}
					if (opcode == 3) {
						stringStack[ssp++] = script.stringOperands[pc];
						continue;
					}
					if (opcode == 6) {
						pc += intOperands[pc];
						continue;
					}
					if (opcode == 7) {
						isp -= 2;
						if (intStack[isp] != intStack[isp + 1]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 8) {
						isp -= 2;
						if (intStack[isp + 1] == intStack[isp]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 9) {
						isp -= 2;
						if (intStack[isp] < intStack[isp + 1]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 10) {
						isp -= 2;
						if (intStack[isp + 1] < intStack[isp]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 21) {
						if (Static138.fp == 0) {
							return;
						}
						@Pc(423) GoSubFrame frame = Static67.callStack[--Static138.fp];
						script = frame.script;
						Static215.intLocals = frame.intLocals;
						opcodes = script.opcodes;
						pc = frame.pc;
						stringLocals = frame.stringLocals;
						intOperands = script.intOperands;
						continue;
					}
					if (opcode == 25) {
						id = intOperands[pc];
						intStack[isp++] = Static155.getVarbit(id);
						continue;
					}
					if (opcode == 27) {
						id = intOperands[pc];
						isp--;
						Static202.setVarbitClient(id, intStack[isp]);
						continue;
					}
					if (opcode == 31) {
						isp -= 2;
						if (intStack[isp + 1] >= intStack[isp]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 32) {
						isp -= 2;
						if (intStack[isp] >= intStack[isp + 1]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 33) {
						intStack[isp++] = Static215.intLocals[intOperands[pc]];
						continue;
					}
					@Pc(555) int local;
					if (opcode == 34) {
						local = intOperands[pc];
						isp--;
						Static215.intLocals[local] = intStack[isp];
						continue;
					}
					if (opcode == 35) {
						stringStack[ssp++] = stringLocals[intOperands[pc]];
						continue;
					}
					if (opcode == 36) {
						local = intOperands[pc];
						ssp--;
						stringLocals[local] = stringStack[ssp];
						continue;
					}
					if (opcode == 37) {
						id = intOperands[pc];
						ssp -= id;
						string = JagString.method2355(ssp, id, stringStack);
						stringStack[ssp++] = string;
						continue;
					}
					if (opcode == 38) {
						isp--;
						continue;
					}
					if (opcode == 39) {
						ssp--;
						continue;
					}
					if (opcode == 40) {
						id = intOperands[pc];
						@Pc(642) ClientScript local642 = ClientScriptList.get(id);
						@Pc(646) int[] local646 = new int[local642.anInt4667];
						@Pc(650) JagString[] local650 = new JagString[local642.anInt4671];
						for (local652 = 0; local652 < local642.anInt4665; local652++) {
							local646[local652] = intStack[local652 + isp - local642.anInt4665];
						}
						for (local652 = 0; local652 < local642.anInt4669; local652++) {
							local650[local652] = stringStack[local652 + ssp - local642.anInt4669];
						}
						isp -= local642.anInt4665;
						ssp -= local642.anInt4669;
						@Pc(705) GoSubFrame local705 = new GoSubFrame();
						local705.stringLocals = stringLocals;
						local705.intLocals = Static215.intLocals;
						local705.pc = pc;
						local705.script = script;
						if (Static138.fp >= Static67.callStack.length) {
							throw new RuntimeException();
						}
						script = local642;
						pc = -1;
						Static67.callStack[Static138.fp++] = local705;
						Static215.intLocals = local646;
						intOperands = local642.intOperands;
						opcodes = local642.opcodes;
						stringLocals = local650;
						continue;
					}
					if (opcode == 42) {
						intStack[isp++] = VarcDomain.varcs[intOperands[pc]];
						continue;
					}
					if (opcode == 43) {
						id = intOperands[pc];
						isp--;
						VarcDomain.varcs[id] = intStack[isp];
						DelayedStateChange.method24(id);
						continue;
					}
					if (opcode == 44) {
						id = intOperands[pc] >> 16;
						isp--;
						int3 = intStack[isp];
						int1 = intOperands[pc] & 0xFFFF;
						if (int3 >= 0 && int3 <= 5000) {
							Static55.anIntArray140[id] = int3;
							@Pc(828) byte local828 = -1;
							if (int1 == 105) {
								local828 = 0;
							}
							local652 = 0;
							while (true) {
								if (int3 <= local652) {
									continue nextOp;
								}
								Static179.anIntArrayArray33[id][local652] = local828;
								local652++;
							}
						}
						throw new RuntimeException();
					}
					if (opcode == 45) {
						id = intOperands[pc];
						isp--;
						int1 = intStack[isp];
						if (int1 >= 0 && int1 < Static55.anIntArray140[id]) {
							intStack[isp++] = Static179.anIntArrayArray33[id][int1];
							continue;
						}
						throw new RuntimeException();
					}
					if (opcode == 46) {
						id = intOperands[pc];
						isp -= 2;
						int1 = intStack[isp];
						if (int1 >= 0 && int1 < Static55.anIntArray140[id]) {
							Static179.anIntArrayArray33[id][int1] = intStack[isp + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (opcode == 47) {
						value = VarcDomain.varcstrs[intOperands[pc]];
						if (value == null) {
							value = Static254.aClass100_1061;
						}
						stringStack[ssp++] = value;
						continue;
					}
					if (opcode == 48) {
						id = intOperands[pc];
						ssp--;
						VarcDomain.varcstrs[id] = stringStack[ssp];
						DelayedStateChange.method1840(id);
						continue;
					}
					if (opcode == 51) {
						@Pc(992) HashTable local992 = script.aClass133Array1[intOperands[pc]];
						isp--;
						@Pc(1002) IntNode local1002 = (IntNode) local992.get((long) intStack[isp]);
						if (local1002 != null) {
							pc += local1002.value;
						}
						continue;
					}
				}
				@Pc(1020) boolean local1020;
				if (intOperands[pc] == 1) {
					local1020 = true;
				} else {
					local1020 = false;
				}
				@Pc(1182) Component component;
				@Pc(1052) int int2;
				@Pc(1063) Component local1063;
				@Pc(1087) int local1087;
				@Pc(1256) Component local1256;
				if (opcode < 300) {
					if (opcode == 100) {
						isp -= 3;
						int1 = intStack[isp];
						int3 = intStack[isp + 1];
						int2 = intStack[isp + 2];
						if (int3 != 0) {
							local1063 = InterfaceList.getComponent(int1);
							if (local1063.createdComponents == null) {
								local1063.createdComponents = new Component[int2 + 1];
							}
							if (int2 >= local1063.createdComponents.length) {
								@Pc(1085) Component[] local1085 = new Component[int2 + 1];
								for (local1087 = 0; local1087 < local1063.createdComponents.length; local1087++) {
									local1085[local1087] = local1063.createdComponents[local1087];
								}
								local1063.createdComponents = local1085;
							}
							if (int2 > 0 && local1063.createdComponents[int2 - 1] == null) {
								throw new RuntimeException("Gap at:" + (int2 - 1));
							}
							@Pc(1137) Component local1137 = new Component();
							local1137.usingScripts = true;
							local1137.createdComponentId = int2;
							local1137.layer = local1137.id = local1063.id;
							local1137.type = int3;
							local1063.createdComponents[int2] = local1137;
							if (local1020) {
								staticActiveComponent1 = local1137;
							} else {
								staticActiveComponent2 = local1137;
							}
							InterfaceList.redraw(local1063);
							continue;
						}
						throw new RuntimeException();
					}
					@Pc(1204) Component local1204;
					if (opcode == 101) {
						component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
						if (component.createdComponentId == -1) {
							if (!local1020) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local1204 = InterfaceList.getComponent(component.id);
						local1204.createdComponents[component.createdComponentId] = null;
						InterfaceList.redraw(local1204);
						continue;
					}
					if (opcode == 102) {
						isp--;
						component = InterfaceList.getComponent(intStack[isp]);
						component.createdComponents = null;
						InterfaceList.redraw(component);
						continue;
					}
					if (opcode == 200) {
						isp -= 2;
						int1 = intStack[isp];
						int3 = intStack[isp + 1];
						local1256 = Static201.method1418(int1, int3);
						if (local1256 != null && int3 != -1) {
							intStack[isp++] = 1;
							if (local1020) {
								staticActiveComponent1 = local1256;
							} else {
								staticActiveComponent2 = local1256;
							}
							continue;
						}
						intStack[isp++] = 0;
						continue;
					}
					if (opcode == 201) {
						isp--;
						int1 = intStack[isp];
						local1204 = InterfaceList.getComponent(int1);
						if (local1204 == null) {
							intStack[isp++] = 0;
						} else {
							intStack[isp++] = 1;
							if (local1020) {
								staticActiveComponent1 = local1204;
							} else {
								staticActiveComponent2 = local1204;
							}
						}
						continue;
					}
				} else {
					@Pc(12388) boolean local12388;
					if (opcode < 500) {
						if (opcode == 403) {
							isp -= 2;
							int3 = intStack[isp + 1];
							int1 = intStack[isp];
							for (int2 = 0; int2 < PlayerAppearance.MALE_FEATURES.length; int2++) {
								if (int1 == PlayerAppearance.MALE_FEATURES[int2]) {
									PlayerList.self.appearance.method1953(int2, int3);
									continue nextOp;
								}
							}
							int2 = 0;
							while (true) {
								if (int2 >= Static153.anIntArray351.length) {
									continue nextOp;
								}
								if (int1 == Static153.anIntArray351[int2]) {
									PlayerList.self.appearance.method1953(int2, int3);
									continue nextOp;
								}
								int2++;
							}
						}
						if (opcode == 404) {
							isp -= 2;
							int1 = intStack[isp];
							int3 = intStack[isp + 1];
							PlayerList.self.appearance.method1951(int1, int3);
							continue;
						}
						if (opcode == 410) {
							isp--;
							local12388 = intStack[isp] != 0;
							PlayerList.self.appearance.method1948(local12388);
							continue;
						}
					} else {
						@Pc(1552) boolean local1552;
						if ((opcode < 1000 || opcode >= 1100) && (opcode < 2000 || opcode >= 2100)) {
							@Pc(2522) JagString local2522;
							if (opcode >= 1100 && opcode < 1200 || !(opcode < 2100 || opcode >= 2200)) {
								if (opcode < 2000) {
									component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
								} else {
									opcode -= 1000;
									isp--;
									component = InterfaceList.getComponent(intStack[isp]);
								}
								if (opcode == 1100) {
									isp -= 2;
									component.anInt489 = intStack[isp];
									if (component.anInt489 > component.anInt486 - component.anInt445) {
										component.anInt489 = component.anInt486 - component.anInt445;
									}
									if (component.anInt489 < 0) {
										component.anInt489 = 0;
									}
									component.scrollY = intStack[isp + 1];
									if (component.scrollY > component.anInt491 - component.anInt459) {
										component.scrollY = component.anInt491 - component.anInt459;
									}
									if (component.scrollY < 0) {
										component.scrollY = 0;
									}
									InterfaceList.redraw(component);
									if (component.createdComponentId == -1) {
										DelayedStateChange.method2353(component.id);
									}
									continue;
								}
								if (opcode == 1101) {
									isp--;
									component.color = intStack[isp];
									InterfaceList.redraw(component);
									if (component.createdComponentId == -1) {
										DelayedStateChange.method4224(component.id);
									}
									continue;
								}
								if (opcode == 1102) {
									isp--;
									component.aBoolean30 = intStack[isp] == 1;
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == 1103) {
									isp--;
									component.anInt476 = intStack[isp];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == 1104) {
									isp--;
									component.anInt490 = intStack[isp];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == 1105) {
									isp--;
									component.anInt477 = intStack[isp];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == 1106) {
									isp--;
									component.anInt521 = intStack[isp];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == 1107) {
									isp--;
									component.aBoolean23 = intStack[isp] == 1;
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == 1108) {
									component.modelType = 1;
									isp--;
									component.modelId = intStack[isp];
									InterfaceList.redraw(component);
									if (component.createdComponentId == -1) {
										DelayedStateChange.method4600(component.id);
									}
									continue;
								}
								if (opcode == 1109) {
									isp -= 6;
									component.modelXOffset = intStack[isp];
									component.modelZOffset = intStack[isp + 1];
									component.modelXAngle = intStack[isp + 2];
									component.modelYAngle = intStack[isp + 3];
									component.modelYOffset = intStack[isp + 4];
									component.modelZoom = intStack[isp + 5];
									InterfaceList.redraw(component);
									if (component.createdComponentId == -1) {
										DelayedStateChange.setComponentModelAngleClient(component.id);
										DelayedStateChange.setComponentModelOffsetClient(component.id);
									}
									continue;
								}
								if (opcode == 1110) {
									isp--;
									int3 = intStack[isp];
									if (component.modelSeqId != int3) {
										component.modelSeqId = int3;
										component.anInt510 = 0;
										component.anInt500 = 0;
										component.anInt496 = 1;
										InterfaceList.redraw(component);
									}
									if (component.createdComponentId == -1) {
										DelayedStateChange.method3345(component.id);
									}
									continue;
								}
								if (opcode == 1111) {
									isp--;
									component.aBoolean22 = intStack[isp] == 1;
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == 1112) {
									ssp--;
									local2522 = stringStack[ssp];
									if (!local2522.strEquals(component.text)) {
										component.text = local2522;
										InterfaceList.redraw(component);
									}
									if (component.createdComponentId == -1) {
										DelayedStateChange.method3096(component.id);
									}
									continue;
								}
								if (opcode == 1113) {
									isp--;
									component.anInt502 = intStack[isp];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == 1114) {
									isp -= 3;
									component.anInt460 = intStack[isp];
									component.anInt478 = intStack[isp + 1];
									component.anInt467 = intStack[isp + 2];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == 1115) {
									isp--;
									component.aBoolean28 = intStack[isp] == 1;
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == 1116) {
									isp--;
									component.anInt514 = intStack[isp];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == 1117) {
									isp--;
									component.anInt513 = intStack[isp];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == 1118) {
									isp--;
									component.aBoolean21 = intStack[isp] == 1;
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == 1119) {
									isp--;
									component.aBoolean26 = intStack[isp] == 1;
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == 1120) {
									isp -= 2;
									component.anInt486 = intStack[isp];
									component.anInt491 = intStack[isp + 1];
									InterfaceList.redraw(component);
									if (component.type == 0) {
										Static17.method531(component, false);
									}
									continue;
								}
								if (opcode == 1121) {
									isp -= 2;
									component.aShort11 = (short) intStack[isp];
									component.aShort10 = (short) intStack[isp + 1];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == 1122) {
									isp--;
									component.aBoolean18 = intStack[isp] == 1;
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == 1123) {
									isp--;
									component.modelZoom = intStack[isp];
									InterfaceList.redraw(component);
									if (component.createdComponentId == -1) {
										DelayedStateChange.setComponentModelAngleClient(component.id);
									}
									continue;
								}
							} else if (opcode >= 1200 && opcode < 1300 || !(opcode < 2200 || opcode >= 2300)) {
								if (opcode < 2000) {
									component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
								} else {
									isp--;
									component = InterfaceList.getComponent(intStack[isp]);
									opcode -= 1000;
								}
								InterfaceList.redraw(component);
								if (opcode == 1200 || opcode == 1205) {
									isp -= 2;
									int2 = intStack[isp + 1];
									int3 = intStack[isp];
									if (component.createdComponentId == -1) {
										DelayedStateChange.setComponentObjClient(component.id);
										DelayedStateChange.setComponentModelAngleClient(component.id);
										DelayedStateChange.setComponentModelOffsetClient(component.id);
									}
									if (int3 == -1) {
										component.modelId = -1;
										component.modelType = 1;
										component.objId = -1;
									} else {
										component.objId = int3;
										component.objCount = int2;
										@Pc(13416) ObjType local13416 = ObjTypeList.get(int3);
										component.modelYOffset = local13416.zAngle2d;
										component.modelXOffset = local13416.xOffset2d;
										component.modelXAngle = local13416.xAngle2d;
										component.modelZOffset = local13416.yOffset2d;
										component.modelYAngle = local13416.yAngle2d;
										component.modelZoom = local13416.zoom2d;
										if (component.anInt451 > 0) {
											component.modelZoom = component.modelZoom * 32 / component.anInt451;
										} else if (component.baseWidth > 0) {
											component.modelZoom = component.modelZoom * 32 / component.baseWidth;
										}
										if (opcode == 1205) {
											component.aBoolean31 = false;
										} else {
											component.aBoolean31 = true;
										}
									}
									continue;
								}
								if (opcode == 1201) {
									component.modelType = 2;
									isp--;
									component.modelId = intStack[isp];
									if (component.createdComponentId == -1) {
										DelayedStateChange.method4600(component.id);
									}
									continue;
								}
								if (opcode == 1202) {
									component.modelType = 3;
									component.modelId = PlayerList.self.appearance.method1952();
									if (component.createdComponentId == -1) {
										DelayedStateChange.method4600(component.id);
									}
									continue;
								}
								if (opcode == 1203) {
									component.modelType = 6;
									isp--;
									component.modelId = intStack[isp];
									if (component.createdComponentId == -1) {
										DelayedStateChange.method4600(component.id);
									}
									continue;
								}
								if (opcode == 1204) {
									component.modelType = 5;
									isp--;
									component.modelId = intStack[isp];
									if (component.createdComponentId == -1) {
										DelayedStateChange.method4600(component.id);
									}
									continue;
								}
							} else if (opcode >= 1300 && opcode < 1400 || opcode >= 2300 && opcode < 2400) {
								if (opcode >= 2000) {
									isp--;
									component = InterfaceList.getComponent(intStack[isp]);
									opcode -= 1000;
								} else {
									component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
								}
								if (opcode == 1300) {
									isp--;
									int3 = intStack[isp] - 1;
									if (int3 >= 0 && int3 <= 9) {
										ssp--;
										component.method480(stringStack[ssp], int3);
										continue;
									}
									ssp--;
									continue;
								}
								if (opcode == 1301) {
									isp -= 2;
									int2 = intStack[isp + 1];
									int3 = intStack[isp];
									component.aClass13_5 = Static201.method1418(int3, int2);
									continue;
								}
								if (opcode == 1302) {
									isp--;
									component.aBoolean27 = intStack[isp] == 1;
									continue;
								}
								if (opcode == 1303) {
									isp--;
									component.anInt472 = intStack[isp];
									continue;
								}
								if (opcode == 1304) {
									isp--;
									component.anInt447 = intStack[isp];
									continue;
								}
								if (opcode == 1305) {
									ssp--;
									component.opBase = stringStack[ssp];
									continue;
								}
								if (opcode == 1306) {
									ssp--;
									component.aClass100_86 = stringStack[ssp];
									continue;
								}
								if (opcode == 1307) {
									component.ops = null;
									continue;
								}
								if (opcode == 1308) {
									isp--;
									component.anInt484 = intStack[isp];
									isp--;
									component.anInt499 = intStack[isp];
									continue;
								}
								if (opcode == 1309) {
									isp--;
									int3 = intStack[isp];
									isp--;
									int2 = intStack[isp];
									if (int2 >= 1 && int2 <= 10) {
										component.method477(int2 - 1, int3);
									}
									continue;
								}
							} else {
								@Pc(4859) int c;
								if (opcode >= 1400 && opcode < 1500 || opcode >= 2400 && opcode < 2500) {
									if (opcode < 2000) {
										component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
									} else {
										opcode -= 1000;
										isp--;
										component = InterfaceList.getComponent(intStack[isp]);
									}
									@Pc(12937) int[] local12937 = null;
									ssp--;
									local2522 = stringStack[ssp];
									if (local2522.length() > 0 && local2522.charAt(local2522.length() - 1) == 89) {
										isp--;
										local652 = intStack[isp];
										if (local652 > 0) {
											local12937 = new int[local652];
											while (local652-- > 0) {
												isp--;
												local12937[local652] = intStack[isp];
											}
										}
										local2522 = local2522.substring(local2522.length() - 1, 0);
									}
									@Pc(13000) Object[] local13000 = new Object[local2522.length() + 1];
									for (c = local13000.length - 1; c >= 1; c--) {
										if (local2522.charAt(c - 1) == 115) {
											ssp--;
											local13000[c] = stringStack[ssp];
										} else {
											isp--;
											local13000[c] = Integer.valueOf(intStack[isp]);
										}
									}
									isp--;
									c = intStack[isp];
									if (c == -1) {
										local13000 = null;
									} else {
										local13000[0] = Integer.valueOf(c);
									}
									component.aBoolean25 = true;
									if (opcode == 1400) {
										component.onClickRepeat = local13000;
									} else if (opcode == 1401) {
										component.onHold = local13000;
									} else if (opcode == 1402) {
										component.onRelease = local13000;
									} else if (opcode == 1403) {
										component.onMouseOver = local13000;
									} else if (opcode == 1404) {
										component.onMouseLeave = local13000;
									} else if (opcode == 1405) {
										component.anObjectArray26 = local13000;
									} else if (opcode == 1406) {
										component.anObjectArray27 = local13000;
									} else if (opcode == 1407) {
										component.varpTriggers = local12937;
										component.onVarpTransmit = local13000;
									} else if (opcode == 1408) {
										component.onTimer = local13000;
									} else if (opcode == 1409) {
										component.anObjectArray29 = local13000;
									} else if (opcode == 1410) {
										component.anObjectArray16 = local13000;
									} else if (opcode == 1411) {
										component.anObjectArray6 = local13000;
									} else if (opcode == 1412) {
										component.onMouseRepeat = local13000;
									} else if (opcode == 1414) {
										component.inventoryTriggers = local12937;
										component.onInvTransmit = local13000;
									} else if (opcode == 1415) {
										component.statTriggers = local12937;
										component.onStatTransmit = local13000;
									} else if (opcode == 1416) {
										component.anObjectArray11 = local13000;
									} else if (opcode == 1417) {
										component.anObjectArray10 = local13000;
									} else if (opcode == 1418) {
										component.onChatTransmit = local13000;
									} else if (opcode == 1419) {
										component.onKey = local13000;
									} else if (opcode == 1420) {
										component.onFriendTransmit = local13000;
									} else if (opcode == 1421) {
										component.onClanTransmit = local13000;
									} else if (opcode == 1422) {
										component.onMiscTransmit = local13000;
									} else if (opcode == 1423) {
										component.anObjectArray12 = local13000;
									} else if (opcode == 1424) {
										component.anObjectArray8 = local13000;
									} else if (opcode == 1425) {
										component.onStockTransmit = local13000;
									} else if (opcode == 1426) {
										component.onCamFinished = local13000;
									} else if (opcode == 1427) {
										component.anObjectArray17 = local13000;
									} else if (opcode == 1428) {
										component.onVarcTransmit = local13000;
										component.varcTriggers = local12937;
									} else if (opcode == 1429) {
										component.varcstrTriggers = local12937;
										component.onVarcstrTransmit = local13000;
									}
									continue;
								}
								if (opcode < 1600) {
									component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
									if (opcode == 1500) {
										intStack[isp++] = component.x;
										continue;
									}
									if (opcode == 1501) {
										intStack[isp++] = component.y;
										continue;
									}
									if (opcode == 1502) {
										intStack[isp++] = component.anInt445;
										continue;
									}
									if (opcode == 1503) {
										intStack[isp++] = component.anInt459;
										continue;
									}
									if (opcode == 1504) {
										intStack[isp++] = component.hidden ? 1 : 0;
										continue;
									}
									if (opcode == 1505) {
										intStack[isp++] = component.layer;
										continue;
									}
								} else if (opcode < 1700) {
									component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
									if (opcode == 1600) {
										intStack[isp++] = component.anInt489;
										continue;
									}
									if (opcode == 1601) {
										intStack[isp++] = component.scrollY;
										continue;
									}
									if (opcode == 1602) {
										stringStack[ssp++] = component.text;
										continue;
									}
									if (opcode == 1603) {
										intStack[isp++] = component.anInt486;
										continue;
									}
									if (opcode == 1604) {
										intStack[isp++] = component.anInt491;
										continue;
									}
									if (opcode == 1605) {
										intStack[isp++] = component.modelZoom;
										continue;
									}
									if (opcode == 1606) {
										intStack[isp++] = component.modelXAngle;
										continue;
									}
									if (opcode == 1607) {
										intStack[isp++] = component.modelYOffset;
										continue;
									}
									if (opcode == 1608) {
										intStack[isp++] = component.modelYAngle;
										continue;
									}
									if (opcode == 1609) {
										intStack[isp++] = component.anInt476;
										continue;
									}
									if (opcode == 1610) {
										intStack[isp++] = component.modelXOffset;
										continue;
									}
									if (opcode == 1611) {
										intStack[isp++] = component.modelZOffset;
										continue;
									}
									if (opcode == 1612) {
										intStack[isp++] = component.anInt477;
										continue;
									}
								} else if (opcode < 1800) {
									component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
									if (opcode == 1700) {
										intStack[isp++] = component.objId;
										continue;
									}
									if (opcode == 1701) {
										if (component.objId == -1) {
											intStack[isp++] = 0;
										} else {
											intStack[isp++] = component.objCount;
										}
										continue;
									}
									if (opcode == 1702) {
										intStack[isp++] = component.createdComponentId;
										continue;
									}
								} else if (opcode < 1900) {
									component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
									if (opcode == 1800) {
										intStack[isp++] = InterfaceList.getServerActiveProperties(component).getTargetMask();
										continue;
									}
									if (opcode == 1801) {
										isp--;
										int3 = intStack[isp];
										int3--;
										if (component.ops != null && int3 < component.ops.length && component.ops[int3] != null) {
											stringStack[ssp++] = component.ops[int3];
											continue;
										}
										stringStack[ssp++] = EMPTY_STRING;
										continue;
									}
									if (opcode == 1802) {
										if (component.opBase == null) {
											stringStack[ssp++] = EMPTY_STRING;
										} else {
											stringStack[ssp++] = component.opBase;
										}
										continue;
									}
								} else if (opcode < 2600) {
									isp--;
									component = InterfaceList.getComponent(intStack[isp]);
									if (opcode == 2500) {
										intStack[isp++] = component.x;
										continue;
									}
									if (opcode == 2501) {
										intStack[isp++] = component.y;
										continue;
									}
									if (opcode == 2502) {
										intStack[isp++] = component.anInt445;
										continue;
									}
									if (opcode == 2503) {
										intStack[isp++] = component.anInt459;
										continue;
									}
									if (opcode == 2504) {
										intStack[isp++] = component.hidden ? 1 : 0;
										continue;
									}
									if (opcode == 2505) {
										intStack[isp++] = component.layer;
										continue;
									}
								} else if (opcode < 2700) {
									isp--;
									component = InterfaceList.getComponent(intStack[isp]);
									if (opcode == 2600) {
										intStack[isp++] = component.anInt489;
										continue;
									}
									if (opcode == 2601) {
										intStack[isp++] = component.scrollY;
										continue;
									}
									if (opcode == 2602) {
										stringStack[ssp++] = component.text;
										continue;
									}
									if (opcode == 2603) {
										intStack[isp++] = component.anInt486;
										continue;
									}
									if (opcode == 2604) {
										intStack[isp++] = component.anInt491;
										continue;
									}
									if (opcode == 2605) {
										intStack[isp++] = component.modelZoom;
										continue;
									}
									if (opcode == 2606) {
										intStack[isp++] = component.modelXAngle;
										continue;
									}
									if (opcode == 2607) {
										intStack[isp++] = component.modelYOffset;
										continue;
									}
									if (opcode == 2608) {
										intStack[isp++] = component.modelYAngle;
										continue;
									}
									if (opcode == 2609) {
										intStack[isp++] = component.anInt476;
										continue;
									}
									if (opcode == 2610) {
										intStack[isp++] = component.modelXOffset;
										continue;
									}
									if (opcode == 2611) {
										intStack[isp++] = component.modelZOffset;
										continue;
									}
									if (opcode == 2612) {
										intStack[isp++] = component.anInt477;
										continue;
									}
								} else if (opcode < 2800) {
									if (opcode == 2700) {
										isp--;
										component = InterfaceList.getComponent(intStack[isp]);
										intStack[isp++] = component.objId;
										continue;
									}
									if (opcode == 2701) {
										isp--;
										component = InterfaceList.getComponent(intStack[isp]);
										if (component.objId == -1) {
											intStack[isp++] = 0;
										} else {
											intStack[isp++] = component.objCount;
										}
										continue;
									}
									if (opcode == 2702) {
										isp--;
										int1 = intStack[isp];
										@Pc(12566) ComponentPointer local12566 = (ComponentPointer) InterfaceList.openInterfaces.get((long) int1);
										if (local12566 == null) {
											intStack[isp++] = 0;
										} else {
											intStack[isp++] = 1;
										}
										continue;
									}
									if (opcode == 2703) {
										isp--;
										component = InterfaceList.getComponent(intStack[isp]);
										if (component.createdComponents == null) {
											intStack[isp++] = 0;
											continue;
										}
										int3 = component.createdComponents.length;
										for (int2 = 0; int2 < component.createdComponents.length; int2++) {
											if (component.createdComponents[int2] == null) {
												int3 = int2;
												break;
											}
										}
										intStack[isp++] = int3;
										continue;
									}
									if (opcode == 2704 || opcode == 2705) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										@Pc(12663) ComponentPointer local12663 = (ComponentPointer) InterfaceList.openInterfaces.get((long) int1);
										if (local12663 != null && local12663.anInt5878 == int3) {
											intStack[isp++] = 1;
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
								} else if (opcode < 2900) {
									isp--;
									component = InterfaceList.getComponent(intStack[isp]);
									if (opcode == 2800) {
										intStack[isp++] = InterfaceList.getServerActiveProperties(component).getTargetMask();
										continue;
									}
									if (opcode == 2801) {
										isp--;
										int3 = intStack[isp];
										int3--;
										if (component.ops != null && component.ops.length > int3 && component.ops[int3] != null) {
											stringStack[ssp++] = component.ops[int3];
											continue;
										}
										stringStack[ssp++] = EMPTY_STRING;
										continue;
									}
									if (opcode == 2802) {
										if (component.opBase == null) {
											stringStack[ssp++] = EMPTY_STRING;
										} else {
											stringStack[ssp++] = component.opBase;
										}
										continue;
									}
								} else if (opcode < 3200) {
									if (opcode == 3100) {
										ssp--;
										string = stringStack[ssp];
										Chat.add(EMPTY_STRING, 0, string);
										continue;
									}
									if (opcode == 3101) {
										isp -= 2;
										Player.animate(intStack[isp + 1], intStack[isp], PlayerList.self);
										continue;
									}
									if (opcode == 3103) {
										ClientProt.method2909();
										continue;
									}
									if (opcode == 3104) {
										ssp--;
										string = stringStack[ssp];
										int3 = 0;
										if (string.isInt()) {
											int3 = string.parseInt();
										}
										Protocol.outboundBuffer.p1isaac(23);
										Protocol.outboundBuffer.p4(int3);
										continue;
									}
									if (opcode == 3105) {
										ssp--;
										string = stringStack[ssp];
										Protocol.outboundBuffer.p1isaac(244);
										Protocol.outboundBuffer.p8(string.encode37());
										continue;
									}
									if (opcode == 3106) {
										ssp--;
										string = stringStack[ssp];
										Protocol.outboundBuffer.p1isaac(65);
										Protocol.outboundBuffer.p1(string.length() + 1);
										Protocol.outboundBuffer.pjstr(string);
										continue;
									}
									if (opcode == 3107) {
										isp--;
										int1 = intStack[isp];
										ssp--;
										local2522 = stringStack[ssp];
										ClientProt.method4613(int1, local2522);
										continue;
									}
									if (opcode == 3108) {
										isp -= 3;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										int2 = intStack[isp + 2];
										local1063 = InterfaceList.getComponent(int2);
										Static40.method1015(int3, int1, local1063);
										continue;
									}
									if (opcode == 3109) {
										isp -= 2;
										int1 = intStack[isp];
										local1256 = local1020 ? staticActiveComponent1 : staticActiveComponent2;
										int3 = intStack[isp + 1];
										Static40.method1015(int3, int1, local1256);
										continue;
									}
									if (opcode == 3110) {
										isp--;
										int1 = intStack[isp];
										Protocol.outboundBuffer.p1isaac(111);
										Protocol.outboundBuffer.p2(int1);
										continue;
									}
								} else if (opcode < 3300) {
									if (opcode == 3200) {
										isp -= 3;
										SoundPlayer.play(intStack[isp + 1], intStack[isp], intStack[isp + 2]);
										continue;
									}
									if (opcode == 3201) {
										isp--;
										MusicPlayer.playSong(intStack[isp]);
										continue;
									}
									if (opcode == 3202) {
										isp -= 2;
										MusicPlayer.playJingle(intStack[isp + 1], intStack[isp]);
										continue;
									}
								} else if (opcode < 3400) {
									if (opcode == 3300) {
										intStack[isp++] = client.loop;
										continue;
									}
									if (opcode == 3301) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = Inv.getItemType(int1, int3);
										continue;
									}
									if (opcode == 3302) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										intStack[isp++] = Inv.getItemCount(int1, int3);
										continue;
									}
									if (opcode == 3303) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										intStack[isp++] = Inv.getSlotTotal(int1, int3);
										continue;
									}
									if (opcode == 3304) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = InvTypeList.list(int1).size;
										continue;
									}
									if (opcode == 3305) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = PlayerSkillXpTable.boostedLevels[int1];
										continue;
									}
									if (opcode == 3306) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = PlayerSkillXpTable.baseLevels[int1];
										continue;
									}
									if (opcode == 3307) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = PlayerSkillXpTable.experience[int1];
										continue;
									}
									if (opcode == 3308) {
										int1 = Player.level;
										int3 = Static225.originX + (PlayerList.self.xFine >> 7);
										int2 = (PlayerList.self.zFine >> 7) + Static142.originZ;
										intStack[isp++] = (int1 << 28) - (-(int3 << 14) - int2);
										continue;
									}
									if (opcode == 3309) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = int1 >> 14 & 0x3FFF;
										continue;
									}
									if (opcode == 3310) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = int1 >> 28;
										continue;
									}
									if (opcode == 3311) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = int1 & 0x3FFF;
										continue;
									}
									if (opcode == 3312) {
										intStack[isp++] = LoginManager.mapMembers ? 1 : 0;
										continue;
									}
									if (opcode == 3313) {
										isp -= 2;
										int1 = intStack[isp] + 32768;
										int3 = intStack[isp + 1];
										intStack[isp++] = Inv.getItemType(int1, int3);
										continue;
									}
									if (opcode == 3314) {
										isp -= 2;
										int1 = intStack[isp] + 32768;
										int3 = intStack[isp + 1];
										intStack[isp++] = Inv.getItemCount(int1, int3);
										continue;
									}
									if (opcode == 3315) {
										isp -= 2;
										int1 = intStack[isp] + 32768;
										int3 = intStack[isp + 1];
										intStack[isp++] = Inv.getSlotTotal(int1, int3);
										continue;
									}
									if (opcode == 3316) {
										if (LoginManager.staffModLevel < 2) {
											intStack[isp++] = 0;
										} else {
											intStack[isp++] = LoginManager.staffModLevel;
										}
										continue;
									}
									if (opcode == 3317) {
										intStack[isp++] = Player.rebootTimer;
										continue;
									}
									if (opcode == 3318) {
										intStack[isp++] = Player.worldId;
										continue;
									}
									if (opcode == 3321) {
										intStack[isp++] = Player.runEnergy;
										continue;
									}
									if (opcode == 3322) {
										intStack[isp++] = Player.weight;
										continue;
									}
									if (opcode == 3323) {
										if (LoginManager.playerModLevel >= 5 && LoginManager.playerModLevel <= 9) {
											intStack[isp++] = 1;
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
									if (opcode == 3324) {
										if (LoginManager.playerModLevel >= 5 && LoginManager.playerModLevel <= 9) {
											intStack[isp++] = LoginManager.playerModLevel;
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
									if (opcode == 3325) {
										intStack[isp++] = LoginManager.playerMember ? 1 : 0;
										continue;
									}
									if (opcode == 3326) {
										intStack[isp++] = PlayerList.self.combatLevel;
										continue;
									}
									if (opcode == 3327) {
										intStack[isp++] = PlayerList.self.appearance.gender ? 1 : 0;
										continue;
									}
									if (opcode == 3328) {
										intStack[isp++] = LoginManager.playerUnderage && !LoginManager.parentalChatConsent ? 1 : 0;
										continue;
									}
									if (opcode == 3329) {
										intStack[isp++] = LoginManager.mapQuickChat ? 1 : 0;
										continue;
									}
									if (opcode == 3330) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = Inv.getFreeSpace(int1);
										continue;
									}
									if (opcode == 3331) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										intStack[isp++] = Inv.getTotalParam(false, int1, int3);
										continue;
									}
									if (opcode == 3332) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = Inv.getTotalParam(true, int1, int3);
										continue;
									}
									if (opcode == 3333) {
										intStack[isp++] = LoginManager.anInt39;
										continue;
									}
									if (opcode == 3335) {
										intStack[isp++] = client.language;
										continue;
									}
									if (opcode == 3336) {
										isp -= 4;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										int1 += int3 << 14;
										local652 = intStack[isp + 3];
										int2 = intStack[isp + 2];
										int1 += int2 << 28;
										int1 += local652;
										intStack[isp++] = int1;
										continue;
									}
									if (opcode == 3337) {
										intStack[isp++] = client.affiliate;
										continue;
									}
								} else if (opcode < 3500) {
									@Pc(3422) EnumType local3422;
									if (opcode == 3400) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										local3422 = EnumTypeList.get(int1);
										if (local3422.valueType == 115) {
										}
										stringStack[ssp++] = local3422.getString(int3);
										continue;
									}
									if (opcode == 3408) {
										isp -= 4;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										local652 = intStack[isp + 3];
										int2 = intStack[isp + 2];
										@Pc(3469) EnumType local3469 = EnumTypeList.get(int2);
										if (local3469.keyType == int1 && local3469.valueType == int3) {
											if (int3 == 115) {
												stringStack[ssp++] = local3469.getString(local652);
											} else {
												intStack[isp++] = local3469.getInt(local652);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (opcode == 3409) {
										isp -= 3;
										int3 = intStack[isp + 1];
										int2 = intStack[isp + 2];
										int1 = intStack[isp];
										if (int3 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(3549) EnumType local3549 = EnumTypeList.get(int3);
										if (local3549.valueType != int1) {
											throw new RuntimeException("C3409-1");
										}
										intStack[isp++] = local3549.containsValue(int2) ? 1 : 0;
										continue;
									}
									if (opcode == 3410) {
										isp--;
										int1 = intStack[isp];
										ssp--;
										local2522 = stringStack[ssp];
										if (int1 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local3422 = EnumTypeList.get(int1);
										if (local3422.valueType != 115) {
											throw new RuntimeException("C3410-1");
										}
										intStack[isp++] = local3422.containsValue(local2522) ? 1 : 0;
										continue;
									}
									if (opcode == 3411) {
										isp--;
										int1 = intStack[isp];
										@Pc(3645) EnumType local3645 = EnumTypeList.get(int1);
										intStack[isp++] = local3645.table.size();
										continue;
									}
								} else if (opcode < 3700) {
									if (opcode == 3600) {
										if (FriendsList.state == 0) {
											intStack[isp++] = -2;
										} else if (FriendsList.state == 1) {
											intStack[isp++] = -1;
										} else {
											intStack[isp++] = FriendsList.size;
										}
										continue;
									}
									if (opcode == 3601) {
										isp--;
										int1 = intStack[isp];
										if (FriendsList.state == 2 && int1 < FriendsList.size) {
											stringStack[ssp++] = FriendsList.usernames[int1];
											continue;
										}
										stringStack[ssp++] = EMPTY_STRING;
										continue;
									}
									if (opcode == 3602) {
										isp--;
										int1 = intStack[isp];
										if (FriendsList.state == 2 && FriendsList.size > int1) {
											intStack[isp++] = FriendsList.worlds[int1];
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
									if (opcode == 3603) {
										isp--;
										int1 = intStack[isp];
										if (FriendsList.state == 2 && FriendsList.size > int1) {
											intStack[isp++] = FriendsList.ranks[int1];
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
									if (opcode == 3604) {
										isp--;
										int3 = intStack[isp];
										ssp--;
										string = stringStack[ssp];
										FriendsList.setRank(string, int3);
										continue;
									}
									if (opcode == 3605) {
										ssp--;
										string = stringStack[ssp];
										FriendsList.add(string.encode37());
										continue;
									}
									if (opcode == 3606) {
										ssp--;
										string = stringStack[ssp];
										FriendsList.remove(string.encode37());
										continue;
									}
									if (opcode == 3607) {
										ssp--;
										string = stringStack[ssp];
										IgnoreList.add(string.encode37());
										continue;
									}
									if (opcode == 3608) {
										ssp--;
										string = stringStack[ssp];
										IgnoreList.remove(string.encode37());
										continue;
									}
									if (opcode == 3609) {
										ssp--;
										string = stringStack[ssp];
										if (string.startsWith(aClass100_446) || string.startsWith(Static101.aClass100_537)) {
											string = string.substring(7);
										}
										intStack[isp++] = FriendsList.contains(string) ? 1 : 0;
										continue;
									}
									if (opcode == 3610) {
										isp--;
										int1 = intStack[isp];
										if (FriendsList.state == 2 && FriendsList.size > int1) {
											stringStack[ssp++] = FriendsList.worldNames[int1];
											continue;
										}
										stringStack[ssp++] = EMPTY_STRING;
										continue;
									}
									if (opcode == 3611) {
										if (ClanChat.name == null) {
											stringStack[ssp++] = EMPTY_STRING;
										} else {
											stringStack[ssp++] = ClanChat.name.toTitleCase();
										}
										continue;
									}
									if (opcode == 3612) {
										if (ClanChat.name == null) {
											intStack[isp++] = 0;
										} else {
											intStack[isp++] = ClanChat.size;
										}
										continue;
									}
									if (opcode == 3613) {
										isp--;
										int1 = intStack[isp];
										if (ClanChat.name != null && ClanChat.size > int1) {
											stringStack[ssp++] = ClanChat.members[int1].username.toTitleCase();
											continue;
										}
										stringStack[ssp++] = EMPTY_STRING;
										continue;
									}
									if (opcode == 3614) {
										isp--;
										int1 = intStack[isp];
										if (ClanChat.name != null && int1 < ClanChat.size) {
											intStack[isp++] = ClanChat.members[int1].world;
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
									if (opcode == 3615) {
										isp--;
										int1 = intStack[isp];
										if (ClanChat.name != null && ClanChat.size > int1) {
											intStack[isp++] = ClanChat.members[int1].rank;
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
									if (opcode == 3616) {
										intStack[isp++] = ClanChat.minKick;
										continue;
									}
									if (opcode == 3617) {
										ssp--;
										string = stringStack[ssp];
										ClanChat.kick(string);
										continue;
									}
									if (opcode == 3618) {
										intStack[isp++] = ClanChat.rank;
										continue;
									}
									if (opcode == 3619) {
										ssp--;
										string = stringStack[ssp];
										ClanChat.join(string.encode37());
										continue;
									}
									if (opcode == 3620) {
										ClanChat.leave();
										continue;
									}
									if (opcode == 3621) {
										if (FriendsList.state == 0) {
											intStack[isp++] = -1;
										} else {
											intStack[isp++] = IgnoreList.size;
										}
										continue;
									}
									if (opcode == 3622) {
										isp--;
										int1 = intStack[isp];
										if (FriendsList.state != 0 && IgnoreList.size > int1) {
											stringStack[ssp++] = Base37.decode37(IgnoreList.encodedUsernames[int1]).toTitleCase();
											continue;
										}
										stringStack[ssp++] = EMPTY_STRING;
										continue;
									}
									if (opcode == 3623) {
										ssp--;
										string = stringStack[ssp];
										if (string.startsWith(aClass100_446) || string.startsWith(Static101.aClass100_537)) {
											string = string.substring(7);
										}
										intStack[isp++] = IgnoreList.contains(string) ? 1 : 0;
										continue;
									}
									if (opcode == 3624) {
										isp--;
										int1 = intStack[isp];
										if (ClanChat.members != null && ClanChat.size > int1 && ClanChat.members[int1].username.equalsIgnoreCase(PlayerList.self.username)) {
											intStack[isp++] = 1;
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
									if (opcode == 3625) {
										if (ClanChat.owner == null) {
											stringStack[ssp++] = EMPTY_STRING;
										} else {
											stringStack[ssp++] = ClanChat.owner.toTitleCase();
										}
										continue;
									}
									if (opcode == 3626) {
										isp--;
										int1 = intStack[isp];
										if (ClanChat.name != null && ClanChat.size > int1) {
											stringStack[ssp++] = ClanChat.members[int1].worldName;
											continue;
										}
										stringStack[ssp++] = EMPTY_STRING;
										continue;
									}
									if (opcode == 3627) {
										isp--;
										int1 = intStack[isp];
										if (FriendsList.state == 2 && int1 >= 0 && int1 < FriendsList.size) {
											intStack[isp++] = FriendsList.aBooleanArray135[int1] ? 1 : 0;
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
									if (opcode == 3628) {
										ssp--;
										string = stringStack[ssp];
										if (string.startsWith(aClass100_446) || string.startsWith(Static101.aClass100_537)) {
											string = string.substring(7);
										}
										intStack[isp++] = Static4.method25(string);
										continue;
									}
									if (opcode == 3629) {
										intStack[isp++] = client.country;
										continue;
									}
								} else if (opcode < 4000) {
									if (opcode == 3903) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = StockMarketManager.offers[int1].getType();
										continue;
									}
									if (opcode == 3904) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = StockMarketManager.offers[int1].item;
										continue;
									}
									if (opcode == 3905) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = StockMarketManager.offers[int1].price;
										continue;
									}
									if (opcode == 3906) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = StockMarketManager.offers[int1].count;
										continue;
									}
									if (opcode == 3907) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = StockMarketManager.offers[int1].completedCount;
										continue;
									}
									if (opcode == 3908) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = StockMarketManager.offers[int1].completedGold;
										continue;
									}
									if (opcode == 3910) {
										isp--;
										int1 = intStack[isp];
										int3 = StockMarketManager.offers[int1].getStatus();
										intStack[isp++] = int3 == 0 ? 1 : 0;
										continue;
									}
									if (opcode == 3911) {
										isp--;
										int1 = intStack[isp];
										int3 = StockMarketManager.offers[int1].getStatus();
										intStack[isp++] = int3 == 2 ? 1 : 0;
										continue;
									}
									if (opcode == 3912) {
										isp--;
										int1 = intStack[isp];
										int3 = StockMarketManager.offers[int1].getStatus();
										intStack[isp++] = int3 == 5 ? 1 : 0;
										continue;
									}
									if (opcode == 3913) {
										isp--;
										int1 = intStack[isp];
										int3 = StockMarketManager.offers[int1].getStatus();
										intStack[isp++] = int3 == 1 ? 1 : 0;
										continue;
									}
								} else if (opcode < 4100) {
									if (opcode == 4000) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = int3 + int1;
										continue;
									}
									if (opcode == 4001) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = int1 - int3;
										continue;
									}
									if (opcode == 4002) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = int3 * int1;
										continue;
									}
									if (opcode == 4003) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = int1 / int3;
										continue;
									}
									if (opcode == 4004) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = (int) ((double) int1 * Math.random());
										continue;
									}
									if (opcode == 4005) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = (int) (Math.random() * (double) (int1 + 1));
										continue;
									}
									if (opcode == 4006) {
										isp -= 5;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										local652 = intStack[isp + 3];
										int2 = intStack[isp + 2];
										c = intStack[isp + 4];
										intStack[isp++] = (int3 - int1) * (c + -int2) / (local652 - int2) + int1;
										continue;
									}
									@Pc(4899) long local4899;
									@Pc(4892) long local4892;
									if (opcode == 4007) {
										isp -= 2;
										local4892 = intStack[isp];
										local4899 = intStack[isp + 1];
										intStack[isp++] = (int) (local4892 * local4899 / 100L + local4892);
										continue;
									}
									if (opcode == 4008) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = int1 | 0x1 << int3;
										continue;
									}
									if (opcode == 4009) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = -(0x1 << int3) - 1 & int1;
										continue;
									}
									if (opcode == 4010) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = (int1 & 0x1 << int3) == 0 ? 0 : 1;
										continue;
									}
									if (opcode == 4011) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										intStack[isp++] = int1 % int3;
										continue;
									}
									if (opcode == 4012) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										if (int1 == 0) {
											intStack[isp++] = 0;
										} else {
											intStack[isp++] = (int) Math.pow((double) int1, (double) int3);
										}
										continue;
									}
									if (opcode == 4013) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										if (int1 == 0) {
											intStack[isp++] = 0;
										} else if (int3 == 0) {
											intStack[isp++] = Integer.MAX_VALUE;
										} else {
											intStack[isp++] = (int) Math.pow((double) int1, 1.0D / (double) int3);
										}
										continue;
									}
									if (opcode == 4014) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										intStack[isp++] = int3 & int1;
										continue;
									}
									if (opcode == 4015) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = int1 | int3;
										continue;
									}
									if (opcode == 4016) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = int1 < int3 ? int1 : int3;
										continue;
									}
									if (opcode == 4017) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										intStack[isp++] = int3 >= int1 ? int3 : int1;
										continue;
									}
									if (opcode == 4018) {
										isp -= 3;
										local4892 = intStack[isp];
										local4899 = intStack[isp + 1];
										@Pc(5251) long local5251 = (long) intStack[isp + 2];
										intStack[isp++] = (int) (local4892 * local5251 / local4899);
										continue;
									}
								} else if (opcode >= 4200) {
									@Pc(5294) ParamType local5294;
									if (opcode < 4300) {
										if (opcode == 4200) {
											isp--;
											int1 = intStack[isp];
											stringStack[ssp++] = ObjTypeList.get(int1).name;
											continue;
										}
										@Pc(11269) ObjType local11269;
										if (opcode == 4201) {
											isp -= 2;
											int1 = intStack[isp];
											int3 = intStack[isp + 1];
											local11269 = ObjTypeList.get(int1);
											if (int3 >= 1 && int3 <= 5 && local11269.ops[int3 - 1] != null) {
												stringStack[ssp++] = local11269.ops[int3 - 1];
												continue;
											}
											stringStack[ssp++] = EMPTY_STRING;
											continue;
										}
										if (opcode == 4202) {
											isp -= 2;
											int1 = intStack[isp];
											int3 = intStack[isp + 1];
											local11269 = ObjTypeList.get(int1);
											if (int3 >= 1 && int3 <= 5 && local11269.inventoryOps[int3 - 1] != null) {
												stringStack[ssp++] = local11269.inventoryOps[int3 - 1];
												continue;
											}
											stringStack[ssp++] = EMPTY_STRING;
											continue;
										}
										if (opcode == 4203) {
											isp--;
											int1 = intStack[isp];
											intStack[isp++] = ObjTypeList.get(int1).cost;
											continue;
										}
										if (opcode == 4204) {
											isp--;
											int1 = intStack[isp];
											intStack[isp++] = ObjTypeList.get(int1).stackable == 1 ? 1 : 0;
											continue;
										}
										@Pc(11417) ObjType local11417;
										if (opcode == 4205) {
											isp--;
											int1 = intStack[isp];
											local11417 = ObjTypeList.get(int1);
											if (local11417.certificateTemplate == -1 && local11417.certificateLink >= 0) {
												intStack[isp++] = local11417.certificateLink;
												continue;
											}
											intStack[isp++] = int1;
											continue;
										}
										if (opcode == 4206) {
											isp--;
											int1 = intStack[isp];
											local11417 = ObjTypeList.get(int1);
											if (local11417.certificateTemplate >= 0 && local11417.certificateLink >= 0) {
												intStack[isp++] = local11417.certificateLink;
												continue;
											}
											intStack[isp++] = int1;
											continue;
										}
										if (opcode == 4207) {
											isp--;
											int1 = intStack[isp];
											intStack[isp++] = ObjTypeList.get(int1).members ? 1 : 0;
											continue;
										}
										if (opcode == 4208) {
											isp -= 2;
											int1 = intStack[isp];
											int3 = intStack[isp + 1];
											local5294 = ParamTypeList.get(int3);
											if (local5294.isString()) {
												stringStack[ssp++] = ObjTypeList.get(int1).getParam(local5294.defaultString, int3);
											} else {
												intStack[isp++] = ObjTypeList.get(int1).getParam(local5294.defaultInt, int3);
											}
											continue;
										}
										if (opcode == 4210) {
											ssp--;
											string = stringStack[ssp];
											isp--;
											int3 = intStack[isp];
											Static155.method2941(int3 == 1, string);
											intStack[isp++] = Find.index;
											continue;
										}
										if (opcode == 4211) {
											if (Find.results != null && Find.size < Find.index) {
												intStack[isp++] = Find.results[Find.size++] & 0xFFFF;
												continue;
											}
											intStack[isp++] = -1;
											continue;
										}
										if (opcode == 4212) {
											Find.size = 0;
											continue;
										}
									} else if (opcode < 4400) {
										if (opcode == 4300) {
											isp -= 2;
											int1 = intStack[isp];
											int3 = intStack[isp + 1];
											local5294 = ParamTypeList.get(int3);
											if (local5294.isString()) {
												stringStack[ssp++] = NpcTypeList.get(int1).getParam(int3, local5294.defaultString);
											} else {
												intStack[isp++] = NpcTypeList.get(int1).getParam(int3, local5294.defaultInt);
											}
											continue;
										}
									} else if (opcode >= 4500) {
										if (opcode >= 4600) {
											if (opcode < 5100) {
												if (opcode == 5000) {
													intStack[isp++] = Chat.publicFilter;
													continue;
												}
												if (opcode == 5001) {
													isp -= 3;
													Chat.publicFilter = intStack[isp];
													Chat.privateFilter = intStack[isp + 1];
													Chat.tradeFilter = intStack[isp + 2];
													Protocol.outboundBuffer.p1isaac(157);
													Protocol.outboundBuffer.p1(Chat.publicFilter);
													Protocol.outboundBuffer.p1(Chat.privateFilter);
													Protocol.outboundBuffer.p1(Chat.tradeFilter);
													continue;
												}
												if (opcode == 5002) {
													ssp--;
													string = stringStack[ssp];
													isp -= 2;
													int3 = intStack[isp];
													int2 = intStack[isp + 1];
													Protocol.outboundBuffer.p1isaac(99);
													Protocol.outboundBuffer.p8(string.encode37());
													Protocol.outboundBuffer.p1(int3 - 1);
													Protocol.outboundBuffer.p1(int2);
													continue;
												}
												if (opcode == 5003) {
													local2522 = null;
													isp--;
													int1 = intStack[isp];
													if (int1 < 100) {
														local2522 = Chat.messages[int1];
													}
													if (local2522 == null) {
														local2522 = EMPTY_STRING;
													}
													stringStack[ssp++] = local2522;
													continue;
												}
												if (opcode == 5004) {
													isp--;
													int1 = intStack[isp];
													int3 = -1;
													if (int1 < 100 && Chat.messages[int1] != null) {
														int3 = Chat.types[int1];
													}
													intStack[isp++] = int3;
													continue;
												}
												if (opcode == 5005) {
													intStack[isp++] = Chat.privateFilter;
													continue;
												}
												if (opcode == 5008) {
													ssp--;
													string = stringStack[ssp];
													if (!string.startsWith(aClass100_74)) {
														if (LoginManager.staffModLevel == 0 && (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat)) {
															continue;
														}
														local2522 = string.toLowerCase();
														@Pc(5555) byte local5555 = 0;
														if (local2522.startsWith(LocalizedText.STABLE_CHATCOL0)) {
															local5555 = 0;
															string = string.substring(LocalizedText.STABLE_CHATCOL0.length());
														} else if (local2522.startsWith(LocalizedText.STABLE_CHATCOL1)) {
															string = string.substring(LocalizedText.STABLE_CHATCOL1.length());
															local5555 = 1;
														} else if (local2522.startsWith(LocalizedText.STABLE_CHATCOL2)) {
															string = string.substring(LocalizedText.STABLE_CHATCOL2.length());
															local5555 = 2;
														} else if (local2522.startsWith(LocalizedText.STABLE_CHATCOL3)) {
															local5555 = 3;
															string = string.substring(LocalizedText.STABLE_CHATCOL3.length());
														} else if (local2522.startsWith(LocalizedText.STABLE_CHATCOL4)) {
															string = string.substring(LocalizedText.STABLE_CHATCOL4.length());
															local5555 = 4;
														} else if (local2522.startsWith(LocalizedText.STABLE_CHATCOL5)) {
															string = string.substring(LocalizedText.STABLE_CHATCOL5.length());
															local5555 = 5;
														} else if (local2522.startsWith(LocalizedText.STABLE_CHATCOL6)) {
															local5555 = 6;
															string = string.substring(LocalizedText.STABLE_CHATCOL6.length());
														} else if (local2522.startsWith(LocalizedText.STABLE_CHATCOL7)) {
															local5555 = 7;
															string = string.substring(LocalizedText.STABLE_CHATCOL7.length());
														} else if (local2522.startsWith(LocalizedText.STABLE_CHATCOL8)) {
															string = string.substring(LocalizedText.STABLE_CHATCOL8.length());
															local5555 = 8;
														} else if (local2522.startsWith(LocalizedText.STABLE_CHATCOL9)) {
															local5555 = 9;
															string = string.substring(LocalizedText.STABLE_CHATCOL9.length());
														} else if (local2522.startsWith(LocalizedText.STABLE_CHATCOL10)) {
															local5555 = 10;
															string = string.substring(LocalizedText.STABLE_CHATCOL10.length());
														} else if (local2522.startsWith(LocalizedText.STABLE_CHATCOL11)) {
															string = string.substring(LocalizedText.STABLE_CHATCOL11.length());
															local5555 = 11;
														} else if (client.language != 0) {
															if (local2522.startsWith(LocalizedText.CHATCOL0)) {
																local5555 = 0;
																string = string.substring(LocalizedText.CHATCOL0.length());
															} else if (local2522.startsWith(LocalizedText.CHATCOL1)) {
																string = string.substring(LocalizedText.CHATCOL1.length());
																local5555 = 1;
															} else if (local2522.startsWith(LocalizedText.CHATCOL2)) {
																string = string.substring(LocalizedText.CHATCOL2.length());
																local5555 = 2;
															} else if (local2522.startsWith(LocalizedText.CHATCOL3)) {
																string = string.substring(LocalizedText.CHATCOL3.length());
																local5555 = 3;
															} else if (local2522.startsWith(LocalizedText.CHATCOL4)) {
																string = string.substring(LocalizedText.CHATCOL4.length());
																local5555 = 4;
															} else if (local2522.startsWith(LocalizedText.CHATCOL5)) {
																local5555 = 5;
																string = string.substring(LocalizedText.CHATCOL5.length());
															} else if (local2522.startsWith(LocalizedText.CHATCOL6)) {
																string = string.substring(LocalizedText.CHATCOL6.length());
																local5555 = 6;
															} else if (local2522.startsWith(LocalizedText.CHATCOL7)) {
																local5555 = 7;
																string = string.substring(LocalizedText.CHATCOL7.length());
															} else if (local2522.startsWith(LocalizedText.CHATCOL8)) {
																local5555 = 8;
																string = string.substring(LocalizedText.CHATCOL8.length());
															} else if (local2522.startsWith(LocalizedText.CHATCOL9)) {
																local5555 = 9;
																string = string.substring(LocalizedText.CHATCOL9.length());
															} else if (local2522.startsWith(LocalizedText.CHATCOL10)) {
																string = string.substring(LocalizedText.CHATCOL10.length());
																local5555 = 10;
															} else if (local2522.startsWith(LocalizedText.CHATCOL11)) {
																string = string.substring(LocalizedText.CHATCOL11.length());
																local5555 = 11;
															}
														}
														@Pc(5943) byte local5943 = 0;
														local2522 = string.toLowerCase();
														if (local2522.startsWith(LocalizedText.STABLE_CHATEFFECT1)) {
															string = string.substring(LocalizedText.STABLE_CHATEFFECT1.length());
															local5943 = 1;
														} else if (local2522.startsWith(LocalizedText.STABLE_CHATEFFECT2)) {
															local5943 = 2;
															string = string.substring(LocalizedText.STABLE_CHATEFFECT2.length());
														} else if (local2522.startsWith(LocalizedText.STABLE_CHATEFFECT3)) {
															string = string.substring(LocalizedText.STABLE_CHATEFFECT3.length());
															local5943 = 3;
														} else if (local2522.startsWith(LocalizedText.STABLE_CHATEFFECT4)) {
															local5943 = 4;
															string = string.substring(LocalizedText.STABLE_CHATEFFECT4.length());
														} else if (local2522.startsWith(LocalizedText.STABLE_CHATEFFECTC5)) {
															local5943 = 5;
															string = string.substring(LocalizedText.STABLE_CHATEFFECTC5.length());
														} else if (client.language != 0) {
															if (local2522.startsWith(LocalizedText.CHATEFFECT1)) {
																string = string.substring(LocalizedText.CHATEFFECT1.length());
																local5943 = 1;
															} else if (local2522.startsWith(LocalizedText.CHATEFFECT2)) {
																local5943 = 2;
																string = string.substring(LocalizedText.CHATEFFECT2.length());
															} else if (local2522.startsWith(LocalizedText.CHATEFFECT3)) {
																local5943 = 3;
																string = string.substring(LocalizedText.CHATEFFECT3.length());
															} else if (local2522.startsWith(LocalizedText.CHATEFFECT4)) {
																local5943 = 4;
																string = string.substring(LocalizedText.CHATEFFECT4.length());
															} else if (local2522.startsWith(LocalizedText.CHATEFFECT5)) {
																string = string.substring(LocalizedText.CHATEFFECT5.length());
																local5943 = 5;
															}
														}
														Protocol.outboundBuffer.p1isaac(237);
														Protocol.outboundBuffer.p1(0);
														c = Protocol.outboundBuffer.offset;
														Protocol.outboundBuffer.p1(local5555);
														Protocol.outboundBuffer.p1(local5943);
														Static146.method2748(Protocol.outboundBuffer, string);
														Protocol.outboundBuffer.p1len(Protocol.outboundBuffer.offset - c);
														continue;
													}
													Cheat.execute(string);
													continue;
												}
												if (opcode == 5009) {
													ssp -= 2;
													local2522 = stringStack[ssp + 1];
													string = stringStack[ssp];
													if (LoginManager.staffModLevel != 0 || (!LoginManager.playerUnderage || LoginManager.parentalChatConsent) && !LoginManager.mapQuickChat) {
														Protocol.outboundBuffer.p1isaac(201);
														Protocol.outboundBuffer.p1(0);
														int2 = Protocol.outboundBuffer.offset;
														Protocol.outboundBuffer.p8(string.encode37());
														Static146.method2748(Protocol.outboundBuffer, local2522);
														Protocol.outboundBuffer.p1len(Protocol.outboundBuffer.offset - int2);
													}
													continue;
												}
												if (opcode == 5010) {
													isp--;
													int1 = intStack[isp];
													local2522 = null;
													if (int1 < 100) {
														local2522 = Chat.names[int1];
													}
													if (local2522 == null) {
														local2522 = EMPTY_STRING;
													}
													stringStack[ssp++] = local2522;
													continue;
												}
												if (opcode == 5011) {
													isp--;
													int1 = intStack[isp];
													local2522 = null;
													if (int1 < 100) {
														local2522 = Chat.clans[int1];
													}
													if (local2522 == null) {
														local2522 = EMPTY_STRING;
													}
													stringStack[ssp++] = local2522;
													continue;
												}
												if (opcode == 5012) {
													isp--;
													int1 = intStack[isp];
													int3 = -1;
													if (int1 < 100) {
														int3 = Chat.phraseIds[int1];
													}
													intStack[isp++] = int3;
													continue;
												}
												if (opcode == 5015) {
													if (PlayerList.self == null || PlayerList.self.username == null) {
														string = Player.usernameInput;
													} else {
														string = PlayerList.self.getName();
													}
													stringStack[ssp++] = string;
													continue;
												}
												if (opcode == 5016) {
													intStack[isp++] = Chat.tradeFilter;
													continue;
												}
												if (opcode == 5017) {
													intStack[isp++] = Chat.size;
													continue;
												}
												if (opcode == 5050) {
													isp--;
													int1 = intStack[isp];
													stringStack[ssp++] = QuickChatCatTypeList.get(int1).description;
													continue;
												}
												@Pc(6378) QuickChatCatType local6378;
												if (opcode == 5051) {
													isp--;
													int1 = intStack[isp];
													local6378 = QuickChatCatTypeList.get(int1);
													if (local6378.subcategories == null) {
														intStack[isp++] = 0;
													} else {
														intStack[isp++] = local6378.subcategories.length;
													}
													continue;
												}
												if (opcode == 5052) {
													isp -= 2;
													int1 = intStack[isp];
													int3 = intStack[isp + 1];
													@Pc(6416) QuickChatCatType local6416 = QuickChatCatTypeList.get(int1);
													local652 = local6416.subcategories[int3];
													intStack[isp++] = local652;
													continue;
												}
												if (opcode == 5053) {
													isp--;
													int1 = intStack[isp];
													local6378 = QuickChatCatTypeList.get(int1);
													if (local6378.phrases == null) {
														intStack[isp++] = 0;
													} else {
														intStack[isp++] = local6378.phrases.length;
													}
													continue;
												}
												if (opcode == 5054) {
													isp -= 2;
													int3 = intStack[isp + 1];
													int1 = intStack[isp];
													intStack[isp++] = QuickChatCatTypeList.get(int1).phrases[int3];
													continue;
												}
												if (opcode == 5055) {
													isp--;
													int1 = intStack[isp];
													stringStack[ssp++] = QuickChatPhraseTypeList.get(int1).getText();
													continue;
												}
												if (opcode == 5056) {
													isp--;
													int1 = intStack[isp];
													@Pc(6527) QuickChatPhraseType local6527 = QuickChatPhraseTypeList.get(int1);
													if (local6527.automaticResponses == null) {
														intStack[isp++] = 0;
													} else {
														intStack[isp++] = local6527.automaticResponses.length;
													}
													continue;
												}
												if (opcode == 5057) {
													isp -= 2;
													int3 = intStack[isp + 1];
													int1 = intStack[isp];
													intStack[isp++] = QuickChatPhraseTypeList.get(int1).automaticResponses[int3];
													continue;
												}
												if (opcode == 5058) {
													activePhrase = new QuickChatPhrase();
													isp--;
													activePhrase.id = intStack[isp];
													activePhrase.type = QuickChatPhraseTypeList.get(activePhrase.id);
													activePhrase.values = new int[activePhrase.type.getDynamicCommandCount()];
													continue;
												}
												if (opcode == 5059) {
													Protocol.outboundBuffer.p1isaac(167);
													Protocol.outboundBuffer.p1(0);
													int1 = Protocol.outboundBuffer.offset;
													Protocol.outboundBuffer.p1(0);
													Protocol.outboundBuffer.p2(activePhrase.id);
													activePhrase.type.encodeMessage(Protocol.outboundBuffer, activePhrase.values);
													Protocol.outboundBuffer.p1len(Protocol.outboundBuffer.offset - int1);
													continue;
												}
												if (opcode == 5060) {
													ssp--;
													string = stringStack[ssp];
													Protocol.outboundBuffer.p1isaac(178);
													Protocol.outboundBuffer.p1(0);
													int3 = Protocol.outboundBuffer.offset;
													Protocol.outboundBuffer.p8(string.encode37());
													Protocol.outboundBuffer.p2(activePhrase.id);
													activePhrase.type.encodeMessage(Protocol.outboundBuffer, activePhrase.values);
													Protocol.outboundBuffer.p1len(Protocol.outboundBuffer.offset - int3);
													continue;
												}
												if (opcode == 5061) {
													Protocol.outboundBuffer.p1isaac(167);
													Protocol.outboundBuffer.p1(0);
													int1 = Protocol.outboundBuffer.offset;
													Protocol.outboundBuffer.p1(1);
													Protocol.outboundBuffer.p2(activePhrase.id);
													activePhrase.type.encodeMessage(Protocol.outboundBuffer, activePhrase.values);
													Protocol.outboundBuffer.p1len(Protocol.outboundBuffer.offset - int1);
													continue;
												}
												if (opcode == 5062) {
													isp -= 2;
													int3 = intStack[isp + 1];
													int1 = intStack[isp];
													intStack[isp++] = QuickChatCatTypeList.get(int1).subcategoryShortcuts[int3];
													continue;
												}
												if (opcode == 5063) {
													isp -= 2;
													int3 = intStack[isp + 1];
													int1 = intStack[isp];
													intStack[isp++] = QuickChatCatTypeList.get(int1).phraseShortcuts[int3];
													continue;
												}
												if (opcode == 5064) {
													isp -= 2;
													int3 = intStack[isp + 1];
													int1 = intStack[isp];
													if (int3 == -1) {
														intStack[isp++] = -1;
													} else {
														intStack[isp++] = QuickChatCatTypeList.get(int1).getSubcategoryByShortcut(int3);
													}
													continue;
												}
												if (opcode == 5065) {
													isp -= 2;
													int1 = intStack[isp];
													int3 = intStack[isp + 1];
													if (int3 == -1) {
														intStack[isp++] = -1;
													} else {
														intStack[isp++] = QuickChatCatTypeList.get(int1).getPhraseByShortcut(int3);
													}
													continue;
												}
												if (opcode == 5066) {
													isp--;
													int1 = intStack[isp];
													intStack[isp++] = QuickChatPhraseTypeList.get(int1).getDynamicCommandCount();
													continue;
												}
												if (opcode == 5067) {
													isp -= 2;
													int3 = intStack[isp + 1];
													int1 = intStack[isp];
													int2 = QuickChatPhraseTypeList.get(int1).getDynamicCommand(int3);
													intStack[isp++] = int2;
													continue;
												}
												if (opcode == 5068) {
													isp -= 2;
													int1 = intStack[isp];
													int3 = intStack[isp + 1];
													activePhrase.values[int1] = int3;
													continue;
												}
												if (opcode == 5069) {
													isp -= 2;
													int1 = intStack[isp];
													int3 = intStack[isp + 1];
													activePhrase.values[int1] = int3;
													continue;
												}
												if (opcode == 5070) {
													isp -= 3;
													int1 = intStack[isp];
													int2 = intStack[isp + 2];
													int3 = intStack[isp + 1];
													@Pc(6996) QuickChatPhraseType type = QuickChatPhraseTypeList.get(int1);
													if (type.getDynamicCommand(int3) != 0) {
														throw new RuntimeException("bad command");
													}
													intStack[isp++] = type.getDynamicCommandParam(int2, int3);
													continue;
												}
												if (opcode == 5071) {
													ssp--;
													string = stringStack[ssp];
													isp--;
													local1552 = intStack[isp] == 1;
													Find.findQuickChatPhrases(local1552, string);
													intStack[isp++] = Find.index;
													continue;
												}
												if (opcode == 5072) {
													if (Find.results != null && Find.size < Find.index) {
														intStack[isp++] = Find.results[Find.size++] & 0xFFFF;
														continue;
													}
													intStack[isp++] = -1;
													continue;
												}
												if (opcode == 5073) {
													Find.size = 0;
													continue;
												}
											} else if (opcode < 5200) {
												if (opcode == 5100) {
													if (Keyboard.pressedKeys[Keyboard.KEY_ALT]) {
														intStack[isp++] = 1;
													} else {
														intStack[isp++] = 0;
													}
													continue;
												}
												if (opcode == 5101) {
													if (Keyboard.pressedKeys[Keyboard.KEY_CTRL]) {
														intStack[isp++] = 1;
													} else {
														intStack[isp++] = 0;
													}
													continue;
												}
												if (opcode == 5102) {
													if (Keyboard.pressedKeys[Keyboard.KEY_SHIFT]) {
														intStack[isp++] = 1;
													} else {
														intStack[isp++] = 0;
													}
													continue;
												}
											} else {
												@Pc(7566) boolean local7566;
												if (opcode < 5300) {
													if (opcode == 5200) {
														isp--;
														WorldMap.setTargetZoom(intStack[isp]);
														continue;
													}
													if (opcode == 5201) {
														intStack[isp++] = WorldMap.getTargetZoom();
														continue;
													}
													if (opcode == 5202) {
														isp--;
														Static258.method4444(intStack[isp]);
														continue;
													}
													if (opcode == 5203) {
														ssp--;
														Static3.method4656(stringStack[ssp]);
														continue;
													}
													if (opcode == 5204) {
														stringStack[ssp - 1] = Static211.method923(stringStack[ssp - 1]);
														continue;
													}
													if (opcode == 5205) {
														ssp--;
														WorldMap.method1853(stringStack[ssp]);
														continue;
													}
													if (opcode == 5206) {
														isp--;
														int1 = intStack[isp];
														@Pc(7264) Map local7264 = MapList.getContainingSource(int1 >> 14 & 0x3FFF, int1 & 0x3FFF);
														if (local7264 == null) {
															stringStack[ssp++] = EMPTY_STRING;
														} else {
															stringStack[ssp++] = local7264.group;
														}
														continue;
													}
													@Pc(7293) Map local7293;
													if (opcode == 5207) {
														ssp--;
														local7293 = MapList.get(stringStack[ssp]);
														if (local7293 != null && local7293.aClass100_137 != null) {
															stringStack[ssp++] = local7293.aClass100_137;
															continue;
														}
														stringStack[ssp++] = EMPTY_STRING;
														continue;
													}
													if (opcode == 5208) {
														intStack[isp++] = Static89.anInt2387;
														intStack[isp++] = Static37.anInt1176;
														continue;
													}
													if (opcode == 5209) {
														intStack[isp++] = WorldMap.originX + WorldMap.anInt435;
														intStack[isp++] = WorldMap.originZ + WorldMap.length - WorldMap.anInt919 - 1;
														continue;
													}
													if (opcode == 5210) {
														local7293 = Static214.method4361();
														if (local7293 == null) {
															intStack[isp++] = 0;
															intStack[isp++] = 0;
														} else {
															intStack[isp++] = local7293.anInt769 * 64;
															intStack[isp++] = local7293.anInt764 * 64;
														}
														continue;
													}
													if (opcode == 5211) {
														local7293 = Static214.method4361();
														if (local7293 == null) {
															intStack[isp++] = 0;
															intStack[isp++] = 0;
														} else {
															intStack[isp++] = local7293.anInt770 - local7293.anInt763;
															intStack[isp++] = local7293.anInt758 - local7293.anInt771;
														}
														continue;
													}
													if (opcode == 5212) {
														int1 = Static118.method2352();
														int2 = 0;
														if (int1 == -1) {
															local2522 = EMPTY_STRING;
														} else {
															local2522 = WorldMap.labels.aClass100Array153[int1];
															int2 = WorldMap.labels.method3894(int1);
														}
														local2522 = local2522.method3140(Static67.aClass100_639, Static5.aClass100_10);
														stringStack[ssp++] = local2522;
														intStack[isp++] = int2;
														continue;
													}
													if (opcode == 5213) {
														int2 = 0;
														int1 = Static119.method2385();
														if (int1 == -1) {
															local2522 = EMPTY_STRING;
														} else {
															local2522 = WorldMap.labels.aClass100Array153[int1];
															int2 = WorldMap.labels.method3894(int1);
														}
														local2522 = local2522.method3140(Static67.aClass100_639, Static5.aClass100_10);
														stringStack[ssp++] = local2522;
														intStack[isp++] = int2;
														continue;
													}
													if (opcode == 5214) {
														isp--;
														int1 = intStack[isp];
														Static80.method3616(int1 >> 14 & 0x3FFF, int1 & 0x3FFF);
														continue;
													}
													if (opcode == 5215) {
														isp--;
														int1 = intStack[isp];
														ssp--;
														local2522 = stringStack[ssp];
														local7566 = false;
														@Pc(7577) SecondaryLinkedList local7577 = Static183.method3333(int1 >> 14 & 0x3FFF, int1 & 0x3FFF);
														for (@Pc(7582) Map local7582 = (Map) local7577.method795(); local7582 != null; local7582 = (Map) local7577.method797()) {
															if (local7582.group.equalsIgnoreCase(local2522)) {
																local7566 = true;
																break;
															}
														}
														if (local7566) {
															intStack[isp++] = 1;
														} else {
															intStack[isp++] = 0;
														}
														continue;
													}
													if (opcode == 5216) {
														isp--;
														int1 = intStack[isp];
														Static253.method4332(int1);
														continue;
													}
													if (opcode == 5217) {
														isp--;
														int1 = intStack[isp];
														if (Static90.method1855(int1)) {
															intStack[isp++] = 1;
														} else {
															intStack[isp++] = 0;
														}
														continue;
													}
													if (opcode == 5218) {
														local7293 = Static214.method4361();
														if (local7293 == null) {
															intStack[isp++] = -1;
														} else {
															intStack[isp++] = local7293.defaultZoom;
														}
														continue;
													}
													if (opcode == 5219) {
														ssp--;
														Static44.method1149(stringStack[ssp]);
														continue;
													}
													if (opcode == 5220) {
														intStack[isp++] = WorldMap.loadPercentage == 100 ? 1 : 0;
														continue;
													}
												} else if (opcode < 5400) {
													if (opcode == 5300) {
														isp -= 2;
														int3 = intStack[isp + 1];
														int1 = intStack[isp];
														Static241.setWindowMode(false, 3, int1, int3);
														intStack[isp++] = GameShell.fullScreenFrame == null ? 0 : 1;
														continue;
													}
													if (opcode == 5301) {
														if (GameShell.fullScreenFrame != null) {
															Static241.setWindowMode(false, Preferences.favoriteWorlds, -1, -1);
														}
														continue;
													}
													if (opcode == 5302) {
														@Pc(7780) Class114[] local7780 = Static3.method4660();
														intStack[isp++] = local7780.length;
														continue;
													}
													if (opcode == 5303) {
														isp--;
														int1 = intStack[isp];
														@Pc(7800) Class114[] local7800 = Static3.method4660();
														intStack[isp++] = local7800[int1].anInt4248;
														intStack[isp++] = local7800[int1].anInt4250;
														continue;
													}
													if (opcode == 5305) {
														int3 = Preferences.fullScreenHeight;
														int1 = Preferences.fullScreenWidth;
														int2 = -1;
														@Pc(7833) Class114[] local7833 = Static3.method4660();
														for (c = 0; c < local7833.length; c++) {
															@Pc(7843) Class114 local7843 = local7833[c];
															if (int1 == local7843.anInt4248 && local7843.anInt4250 == int3) {
																int2 = c;
																break;
															}
														}
														intStack[isp++] = int2;
														continue;
													}
													if (opcode == 5306) {
														intStack[isp++] = Static144.getWindowMode();
														continue;
													}
													if (opcode == 5307) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 0 || int1 > 2) {
															int1 = 0;
														}
														Static241.setWindowMode(false, int1, -1, -1);
														continue;
													}
													if (opcode == 5308) {
														intStack[isp++] = Preferences.favoriteWorlds;
														continue;
													}
													if (opcode == 5309) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 0 || int1 > 2) {
															int1 = 0;
														}
														Preferences.favoriteWorlds = int1;
														Preferences.write(GameShell.signLink);
														continue;
													}
												} else if (opcode < 5500) {
													if (opcode == 5400) {
														ssp -= 2;
														string = stringStack[ssp];
														local2522 = stringStack[ssp + 1];
														isp--;
														int2 = intStack[isp];
														Protocol.outboundBuffer.p1isaac(117);
														Protocol.outboundBuffer.p1(Buffer.getStringLength(string) + Buffer.getStringLength(local2522) + 1);
														Protocol.outboundBuffer.pjstr(string);
														Protocol.outboundBuffer.pjstr(local2522);
														Protocol.outboundBuffer.p1(int2);
														continue;
													}
													if (opcode == 5401) {
														isp -= 2;
														client.aShortArray88[intStack[isp]] = (short) ColorUtils.rgbToHsl(intStack[isp + 1]);
														ObjTypeList.clearModels();
														ObjTypeList.clearSprites();
														NpcTypeList.clearModels();
														NpcTypeList.clearHeadModels();
														Static87.method1807();
														continue;
													}
													if (opcode == 5405) {
														isp -= 2;
														int1 = intStack[isp];
														int3 = intStack[isp + 1];
														if (int1 >= 0 && int1 < 2) {
															Static107.anIntArrayArrayArray9[int1] = new int[int3 << 1][4];
														}
														continue;
													}
													if (opcode == 5406) {
														isp -= 7;
														int1 = intStack[isp];
														int3 = intStack[isp + 1] << 1;
														local652 = intStack[isp + 3];
														int2 = intStack[isp + 2];
														c = intStack[isp + 4];
														@Pc(8108) int local8108 = intStack[isp + 6];
														local1087 = intStack[isp + 5];
														if (int1 >= 0 && int1 < 2 && Static107.anIntArrayArrayArray9[int1] != null && int3 >= 0 && Static107.anIntArrayArrayArray9[int1].length > int3) {
															Static107.anIntArrayArrayArray9[int1][int3] = new int[] { (int2 >> 14 & 0x3FFF) * 128, local652, (int2 & 0x3FFF) * 128, local8108 };
															Static107.anIntArrayArrayArray9[int1][int3 + 1] = new int[] { (c >> 14 & 0x3FFF) * 128, local1087, (c & 0x3FFF) * 128 };
														}
														continue;
													}
													if (opcode == 5407) {
														isp--;
														int1 = Static107.anIntArrayArrayArray9[intStack[isp]].length >> 1;
														intStack[isp++] = int1;
														continue;
													}
													if (opcode == 5411) {
														if (GameShell.fullScreenFrame != null) {
															Static241.setWindowMode(false, Preferences.favoriteWorlds, -1, -1);
														}
														if (GameShell.frame == null) {
															Static169.openUrl(Static15.method479(), false);
														} else {
															System.exit(0);
														}
														continue;
													}
													if (opcode == 5419) {
														string = EMPTY_STRING;
														if (Player.lastLogAddress != null) {
															string = Static181.method3341(Player.lastLogAddress.intArg2);
															try {
																if (Player.lastLogAddress.result != null) {
																	@Pc(8281) byte[] local8281 = ((String) Player.lastLogAddress.result).getBytes("ISO-8859-1");
																	string = JagString.decodeString(local8281, local8281.length, 0);
																}
															} catch (@Pc(8290) UnsupportedEncodingException local8290) {
															}
														}
														stringStack[ssp++] = string;
														continue;
													}
													if (opcode == 5420) {
														intStack[isp++] = SignLink.anInt5928 == 3 ? 1 : 0;
														continue;
													}
													if (opcode == 5421) {
														if (GameShell.fullScreenFrame != null) {
															Static241.setWindowMode(false, Preferences.favoriteWorlds, -1, -1);
														}
														isp--;
														local1552 = intStack[isp] == 1;
														ssp--;
														string = stringStack[ssp];
														@Pc(8356) JagString local8356 = JagString.concatenate(new JagString[] { Static15.method479(), string });
														if (GameShell.frame != null || local1552 && SignLink.anInt5928 != 3 && SignLink.osName.startsWith("win") && !client.haveIe6) {
															Static164.newTab = local1552;
															Static175.url = local8356;
															Static33.openUrlRequest = GameShell.signLink.openUrl(new String(local8356.method3148(), "ISO-8859-1"));
															continue;
														}
														Static169.openUrl(local8356, local1552);
														continue;
													}
													if (opcode == 5422) {
														isp--;
														int2 = intStack[isp];
														ssp -= 2;
														local2522 = stringStack[ssp + 1];
														string = stringStack[ssp];
														if (string.length() > 0) {
															if (Static103.aClass100Array88 == null) {
																Static103.aClass100Array88 = new JagString[Static132.anIntArray309[client.game]];
															}
															Static103.aClass100Array88[int2] = string;
														}
														if (local2522.length() > 0) {
															if (Static263.aClass100Array174 == null) {
																Static263.aClass100Array174 = new JagString[Static132.anIntArray309[client.game]];
															}
															Static263.aClass100Array174[int2] = local2522;
														}
														continue;
													}
													if (opcode == 5423) {
														ssp--;
														stringStack[ssp].print();
														continue;
													}
													if (opcode == 5424) {
														isp -= 11;
														Static40.anInt1275 = intStack[isp];
														Static111.anInt2910 = intStack[isp + 1];
														Static251.anInt5457 = intStack[isp + 2];
														Static232.anInt5208 = intStack[isp + 3];
														Static55.anInt1736 = intStack[isp + 4];
														Static169.anInt4073 = intStack[isp + 5];
														Static85.anInt2261 = intStack[isp + 6];
														Static136.anInt3324 = intStack[isp + 7];
														Static254.anInt5556 = intStack[isp + 8];
														Static195.anInt4581 = intStack[isp + 9];
														Static262.anInt5752 = intStack[isp + 10];
														client.js5Archive8.isFileReady(Static55.anInt1736);
														client.js5Archive8.isFileReady(Static169.anInt4073);
														client.js5Archive8.isFileReady(Static85.anInt2261);
														client.js5Archive8.isFileReady(Static136.anInt3324);
														client.js5Archive8.isFileReady(Static254.anInt5556);
														Static261.aBoolean298 = true;
														continue;
													}
													if (opcode == 5425) {
														Static114.method4637();
														Static261.aBoolean298 = false;
														continue;
													}
													if (opcode == 5426) {
														isp--;
														Static270.anInt5794 = intStack[isp];
														continue;
													}
													if (opcode == 5427) {
														isp -= 2;
														Static169.anInt4075 = intStack[isp];
														Static225.anInt5073 = intStack[isp + 1];
														continue;
													}
												} else if (opcode < 5600) {
													if (opcode == 5500) {
														isp -= 4;
														int1 = intStack[isp];
														local652 = intStack[isp + 3];
														int2 = intStack[isp + 2];
														int3 = intStack[isp + 1];
														Static141.method2722(false, int2, int3, local652, (int1 & 0x3FFF) - Static142.originZ, (int1 >> 14 & 0x3FFF) - Static225.originX);
														continue;
													}
													if (opcode == 5501) {
														isp -= 4;
														int3 = intStack[isp + 1];
														int1 = intStack[isp];
														local652 = intStack[isp + 3];
														int2 = intStack[isp + 2];
														Static260.method3849(int3, (int1 & 0x3FFF) - Static142.originZ, int2, (int1 >> 14 & 0x3FFF) - Static225.originX, local652);
														continue;
													}
													if (opcode == 5502) {
														isp -= 6;
														int1 = intStack[isp];
														if (int1 >= 2) {
															throw new RuntimeException();
														}
														Static155.anInt3718 = int1;
														int3 = intStack[isp + 1];
														if (Static107.anIntArrayArrayArray9[Static155.anInt3718].length >> 1 <= int3 + 1) {
															throw new RuntimeException();
														}
														Static127.anInt3125 = int3;
														Static233.anInt5224 = 0;
														Static228.anInt5101 = intStack[isp + 2];
														Static114.anInt5843 = intStack[isp + 3];
														int2 = intStack[isp + 4];
														if (int2 >= 2) {
															throw new RuntimeException();
														}
														Static52.anInt1694 = int2;
														local652 = intStack[isp + 5];
														if (Static107.anIntArrayArrayArray9[Static52.anInt1694].length >> 1 <= local652 + 1) {
															throw new RuntimeException();
														}
														Static75.anInt2119 = local652;
														Static227.cameraType = 3;
														continue;
													}
													if (opcode == 5503) {
														Static35.resetCameraEffects();
														continue;
													}
													if (opcode == 5504) {
														isp -= 2;
														Camera.pitchTarget = intStack[isp];
														Camera.yawTarget = intStack[isp + 1];
														if (Static227.cameraType == 2) {
															Static184.cameraYaw = (int)Camera.yawTarget;
															Static240.cameraPitch = (int)Camera.pitchTarget;
														}
														Camera.clampCameraAngle();
														continue;
													}
													if (opcode == 5505) {
														intStack[isp++] = (int)Camera.pitchTarget;
														continue;
													}
													if (opcode == 5506) {
														intStack[isp++] = (int)Camera.yawTarget;
														continue;
													}
												} else if (opcode < 5700) {
													if (opcode == 5600) {
														ssp -= 2;
														string = stringStack[ssp];
														local2522 = stringStack[ssp + 1];
														isp--;
														int2 = intStack[isp];
														if (client.gameState == 10 && LoginManager.anInt4937 == 0 && LoginManager.step == 0 && CreateManager.step == 0 && WorldList.step == 0) {
															LoginManager.method3896(string, local2522, int2);
														}
														continue;
													}
													if (opcode == 5601) {
														LoginManager.method3395();
														continue;
													}
													if (opcode == 5602) {
														if (LoginManager.step == 0) {
															LoginManager.reply = -2;
														}
														continue;
													}
													if (opcode == 5603) {
														isp -= 4;
														if (client.gameState == 10 && LoginManager.anInt4937 == 0 && LoginManager.step == 0 && CreateManager.step == 0 && WorldList.step == 0) {
															Static125.method2448(intStack[isp + 2], intStack[isp + 3], intStack[isp], intStack[isp + 1]);
														}
														continue;
													}
													if (opcode == 5604) {
														ssp--;
														if (client.gameState == 10 && LoginManager.anInt4937 == 0 && LoginManager.step == 0 && CreateManager.step == 0 && WorldList.step == 0) {
															ClientProt.method1691(stringStack[ssp].encode37());
														}
														continue;
													}
													if (opcode == 5605) {
														isp -= 4;
														ssp -= 2;
														if (client.gameState == 10 && LoginManager.anInt4937 == 0 && LoginManager.step == 0 && CreateManager.step == 0 && WorldList.step == 0) {
															Static40.method1016(intStack[isp], intStack[isp + 3], intStack[isp + 1], stringStack[ssp + 1], stringStack[ssp].encode37(), intStack[isp + 2]);
														}
														continue;
													}
													if (opcode == 5606) {
														if (CreateManager.step == 0) {
															CreateManager.reply = -2;
														}
														continue;
													}
													if (opcode == 5607) {
														intStack[isp++] = LoginManager.reply;
														continue;
													}
													if (opcode == 5608) {
														intStack[isp++] = LoginManager.hopTime;
														continue;
													}
													if (opcode == 5609) {
														intStack[isp++] = CreateManager.reply;
														continue;
													}
													if (opcode == 5610) {
														for (int1 = 0; int1 < 5; int1++) {
															stringStack[ssp++] = CreateManager.suggestedNames.length > int1 ? CreateManager.suggestedNames[int1].toTitleCase() : EMPTY_STRING;
														}
														CreateManager.suggestedNames = null;
														continue;
													}
													if (opcode == 5611) {
														intStack[isp++] = LoginManager.disallowResult;
														continue;
													}
												} else if (opcode < 6100) {
													if (opcode == 6001) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 1) {
															int1 = 1;
														}
														if (int1 > 4) {
															int1 = 4;
														}
														Preferences.brightness = int1;
														if (!GlRenderer.enabled || !Preferences.highDetailLighting) {
															if (Preferences.brightness == 1) {
																Rasteriser.setBrightness(0.9F);
															}
															if (Preferences.brightness == 2) {
																Rasteriser.setBrightness(0.8F);
															}
															if (Preferences.brightness == 3) {
																Rasteriser.setBrightness(0.7F);
															}
															if (Preferences.brightness == 4) {
																Rasteriser.setBrightness(0.6F);
															}
														}
														if (GlRenderer.enabled) {
															Static86.setInstantFade();
															if (!Preferences.highDetailLighting) {
																Static145.method2742();
															}
														}
														ObjTypeList.clearSprites();
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6002) {
														isp--;
														Preferences.setAllVisibleLevels(intStack[isp] == 1);
														LocTypeList.clear();
														Static145.method2742();
														Static269.method2218();
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6003) {
														isp--;
														Preferences.removeRoofsSelectively = intStack[isp] == 1;
														Static269.method2218();
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6005) {
														isp--;
														Preferences.showGroundDecorations = intStack[isp] == 1;
														Static145.method2742();
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6006) {
														isp--;
														Preferences.highDetailTextures = intStack[isp] == 1;
														((Js5GlTextureProvider) Rasteriser.textureProvider).method3245(!Preferences.highDetailTextures);
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6007) {
														isp--;
														Preferences.manyIdleAnimations = intStack[isp] == 1;
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6008) {
														isp--;
														Preferences.flickeringEffectsOn = intStack[isp] == 1;
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6009) {
														isp--;
														Preferences.manyGroundTextures = intStack[isp] == 1;
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6010) {
														isp--;
														Preferences.characterShadowsOn = intStack[isp] == 1;
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6011) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 0 || int1 > 2) {
															int1 = 0;
														}
														Preferences.sceneryShadowsType = int1;
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6012) {
														if (GlRenderer.enabled) {
															MaterialManager.setMaterial(0, 0);
														}
														isp--;
														Preferences.highDetailLighting = intStack[isp] == 1;
														if (GlRenderer.enabled && Preferences.highDetailLighting) {
															Rasteriser.setBrightness(0.7F);
														} else {
															if (Preferences.brightness == 1) {
																Rasteriser.setBrightness(0.9F);
															}
															if (Preferences.brightness == 2) {
																Rasteriser.setBrightness(0.8F);
															}
															if (Preferences.brightness == 3) {
																Rasteriser.setBrightness(0.7F);
															}
															if (Preferences.brightness == 4) {
																Rasteriser.setBrightness(0.6F);
															}
														}
														Static145.method2742();
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6014) {
														isp--;
														Preferences.highWaterDetail = intStack[isp] == 1;
														if (GlRenderer.enabled) {
															Static145.method2742();
														}
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6015) {
														isp--;
														Preferences.fogEnabled = intStack[isp] == 1;
														if (GlRenderer.enabled) {
															Static86.setInstantFade();
														}
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6016) {
														isp--;
														int1 = intStack[isp];
														if (GlRenderer.enabled) {
															GameShell.replaceCanvas = true;
														}
														if (int1 < 0 || int1 > 2) {
															int1 = 0;
														}
														Preferences.antiAliasingMode = int1;
														continue;
													}
													if (opcode == 6017) {
														isp--;
														Preferences.stereo = intStack[isp] == 1;
														Static211.method930();
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6018) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 0) {
															int1 = 0;
														}
														if (int1 > 127) {
															int1 = 127;
														}
														Preferences.soundEffectVolume = int1;
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6019) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 0) {
															int1 = 0;
														}
														if (int1 > 255) {
															int1 = 255;
														}
														if (int1 != Preferences.musicVolume) {
															if (Preferences.musicVolume == 0 && MusicPlayer.groupId != -1) {
																Static122.method2410(client.js5Archive6, MusicPlayer.groupId, int1);
																MidiPlayer.jingle = false;
															} else if (int1 == 0) {
																Static241.method4548();
																MidiPlayer.jingle = false;
															} else {
																Static230.method3956(int1);
															}
															Preferences.musicVolume = int1;
														}
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6020) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 0) {
															int1 = 0;
														}
														if (int1 > 127) {
															int1 = 127;
														}
														Preferences.ambientSoundsVolume = int1;
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6021) {
														isp--;
														Static127.neverRemoveRoofs = intStack[isp] == 1;
														Static269.method2218();
														continue;
													}
													if (opcode == 6023) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 0) {
															int1 = 0;
														}
														if (int1 > 2) {
															int1 = 2;
														}
														local1552 = false;
														if (GameShell.maxMemory < 96) {
															local1552 = true;
															int1 = 0;
														}
														Preferences.setParticles(int1);
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														intStack[isp++] = local1552 ? 0 : 1;
														continue;
													}
													if (opcode == 6024) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 0 || int1 > 2) {
															int1 = 0;
														}
														Preferences.windowMode = int1;
														Preferences.write(GameShell.signLink);
														continue;
													}
													if (opcode == 6028) {
														isp--;
														Preferences.cursorsEnabled = intStack[isp] != 0;
														Preferences.write(GameShell.signLink);
														continue;
													}
												} else if (opcode < 6200) {
													if (opcode == 6101) {
														intStack[isp++] = Preferences.brightness;
														continue;
													}
													if (opcode == 6102) {
														intStack[isp++] = SceneGraph.allLevelsAreVisible() ? 1 : 0;
														continue;
													}
													if (opcode == 6103) {
														intStack[isp++] = Preferences.removeRoofsSelectively ? 1 : 0;
														continue;
													}
													if (opcode == 6105) {
														intStack[isp++] = Preferences.showGroundDecorations ? 1 : 0;
														continue;
													}
													if (opcode == 6106) {
														intStack[isp++] = Preferences.highDetailTextures ? 1 : 0;
														continue;
													}
													if (opcode == 6107) {
														intStack[isp++] = Preferences.manyIdleAnimations ? 1 : 0;
														continue;
													}
													if (opcode == 6108) {
														intStack[isp++] = Preferences.flickeringEffectsOn ? 1 : 0;
														continue;
													}
													if (opcode == 6109) {
														intStack[isp++] = Preferences.manyGroundTextures ? 1 : 0;
														continue;
													}
													if (opcode == 6110) {
														intStack[isp++] = Preferences.characterShadowsOn ? 1 : 0;
														continue;
													}
													if (opcode == 6111) {
														intStack[isp++] = Preferences.sceneryShadowsType;
														continue;
													}
													if (opcode == 6112) {
														intStack[isp++] = Preferences.highDetailLighting ? 1 : 0;
														continue;
													}
													if (opcode == 6114) {
														intStack[isp++] = Preferences.highWaterDetail ? 1 : 0;
														continue;
													}
													if (opcode == 6115) {
														intStack[isp++] = Preferences.fogEnabled ? 1 : 0;
														continue;
													}
													if (opcode == 6116) {
														intStack[isp++] = Preferences.antiAliasingMode;
														continue;
													}
													if (opcode == 6117) {
														intStack[isp++] = Preferences.stereo ? 1 : 0;
														continue;
													}
													if (opcode == 6118) {
														intStack[isp++] = Preferences.soundEffectVolume;
														continue;
													}
													if (opcode == 6119) {
														intStack[isp++] = Preferences.musicVolume;
														continue;
													}
													if (opcode == 6120) {
														intStack[isp++] = Preferences.ambientSoundsVolume;
														continue;
													}
													if (opcode == 6121) {
														if (GlRenderer.enabled) {
															intStack[isp++] = GlRenderer.arbMultisampleSupported ? 1 : 0;
														} else {
															intStack[isp++] = 0;
														}
														continue;
													}
													if (opcode == 6123) {
														intStack[isp++] = Preferences.getParticleSetting();
														continue;
													}
													if (opcode == 6124) {
														intStack[isp++] = Preferences.windowMode;
														continue;
													}
													if (opcode == 6128) {
														intStack[isp++] = Preferences.cursorsEnabled ? 1 : 0;
														continue;
													}
												} else if (opcode < 6300) {
													if (opcode == 6200) {
														isp -= 2;
														Static178.aShort25 = (short) intStack[isp];
														if (Static178.aShort25 <= 0) {
															Static178.aShort25 = 256;
														}
														Static10.aShort9 = (short) intStack[isp + 1];
														if (Static10.aShort9 <= 0) {
															Static10.aShort9 = 205;
														}
														continue;
													}
													if (opcode == 6201) {
														isp -= 2;
														Static263.aShort30 = (short) intStack[isp];
														if (Static263.aShort30 <= 0) {
															Static263.aShort30 = 256;
														}
														Static187.aShort27 = (short) intStack[isp + 1];
														if (Static187.aShort27 <= 0) {
															Static187.aShort27 = 320;
														}
														continue;
													}
													if (opcode == 6202) {
														isp -= 4;
														Static153.aShort22 = (short) intStack[isp];
														if (Static153.aShort22 <= 0) {
															Static153.aShort22 = 1;
														}
														Static4.aShort1 = (short) intStack[isp + 1];
														if (Static4.aShort1 <= 0) {
															Static4.aShort1 = 32767;
														} else if (Static153.aShort22 > Static4.aShort1) {
															Static4.aShort1 = Static153.aShort22;
														}
														Static55.aShort12 = (short) intStack[isp + 2];
														if (Static55.aShort12 <= 0) {
															Static55.aShort12 = 1;
														}
														Static131.aShort21 = (short) intStack[isp + 3];
														if (Static131.aShort21 <= 0) {
															Static131.aShort21 = 32767;
														} else if (Static131.aShort21 < Static55.aShort12) {
															Static131.aShort21 = Static55.aShort12;
														}
														continue;
													}
													if (opcode == 6203) {
														Static115.method2314(Static280.aClass13_26.anInt445, 0, Static280.aClass13_26.anInt459, 0, false);
														intStack[isp++] = Static166.anInt4055;
														intStack[isp++] = Static245.anInt5377;
														continue;
													}
													if (opcode == 6204) {
														intStack[isp++] = Static263.aShort30;
														intStack[isp++] = Static187.aShort27;
														continue;
													}
													if (opcode == 6205) {
														intStack[isp++] = Static178.aShort25;
														intStack[isp++] = Static10.aShort9;
														continue;
													}
												} else if (opcode < 6400) {
													if (opcode == 6300) {
														intStack[isp++] = (int) (MonotonicClock.currentTimeMillis() / 60000L);
														continue;
													}
													if (opcode == 6301) {
														intStack[isp++] = (int) (MonotonicClock.currentTimeMillis() / 86400000L) - 11745;
														continue;
													}
													if (opcode == 6302) {
														isp -= 3;
														int2 = intStack[isp + 2];
														int3 = intStack[isp + 1];
														int1 = intStack[isp];
														Static102.aCalendar2.clear();
														Static102.aCalendar2.set(11, 12);
														Static102.aCalendar2.set(int2, int3, int1);
														intStack[isp++] = (int) (Static102.aCalendar2.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (opcode == 6303) {
														Static102.aCalendar2.clear();
														Static102.aCalendar2.setTime(new Date(MonotonicClock.currentTimeMillis()));
														intStack[isp++] = Static102.aCalendar2.get(1);
														continue;
													}
													if (opcode == 6304) {
														local1552 = true;
														isp--;
														int1 = intStack[isp];
														if (int1 < 0) {
															local1552 = (int1 + 1) % 4 == 0;
														} else if (int1 < 1582) {
															local1552 = int1 % 4 == 0;
														} else if (int1 % 4 != 0) {
															local1552 = false;
														} else if (int1 % 100 != 0) {
															local1552 = true;
														} else if (int1 % 400 != 0) {
															local1552 = false;
														}
														intStack[isp++] = local1552 ? 1 : 0;
														continue;
													}
												} else if (opcode < 6500) {
													if (opcode == 6405) {
														intStack[isp++] = Static87.showVideoAd() ? 1 : 0;
														continue;
													}
													if (opcode == 6406) {
														intStack[isp++] = Static267.isShowingVideoAd() ? 1 : 0;
														continue;
													}
												} else if (opcode < 6600) {
													if (opcode == 6500) {
														if (client.gameState == 10 && LoginManager.anInt4937 == 0 && LoginManager.step == 0 && CreateManager.step == 0) {
															intStack[isp++] = WorldList.fetch() == -1 ? 0 : 1;
															continue;
														}
														intStack[isp++] = 1;
														continue;
													}
													@Pc(10247) WorldInfo local10247;
													@Pc(10191) World world;
													if (opcode == 6501) {
														world = Static18.getFirstWorld();
														if (world == null) {
															intStack[isp++] = -1;
															intStack[isp++] = 0;
															stringStack[ssp++] = EMPTY_STRING;
															intStack[isp++] = 0;
															stringStack[ssp++] = EMPTY_STRING;
															intStack[isp++] = 0;
														} else {
															intStack[isp++] = world.id;
															intStack[isp++] = world.flags;
															stringStack[ssp++] = world.activity;
															local10247 = world.getWorldInfo();
															intStack[isp++] = local10247.flag;
															stringStack[ssp++] = local10247.name;
															intStack[isp++] = world.players;
														}
														continue;
													}
													if (opcode == 6502) {
														world = WorldList.getNextWorld();
														if (world == null) {
															intStack[isp++] = -1;
															intStack[isp++] = 0;
															stringStack[ssp++] = EMPTY_STRING;
															intStack[isp++] = 0;
															stringStack[ssp++] = EMPTY_STRING;
															intStack[isp++] = 0;
														} else {
															intStack[isp++] = world.id;
															intStack[isp++] = world.flags;
															stringStack[ssp++] = world.activity;
															local10247 = world.getWorldInfo();
															intStack[isp++] = local10247.flag;
															stringStack[ssp++] = local10247.name;
															intStack[isp++] = world.players;
														}
														continue;
													}
													if (opcode == 6503) {
														isp--;
														int1 = intStack[isp];
														if (client.gameState == 10 && LoginManager.anInt4937 == 0 && LoginManager.step == 0 && CreateManager.step == 0) {
															intStack[isp++] = Static176.hopWorld(int1) ? 1 : 0;
															continue;
														}
														intStack[isp++] = 0;
														continue;
													}
													if (opcode == 6504) {
														isp--;
														Preferences.lastWorldId = intStack[isp];
														Preferences.write(GameShell.signLink);
														continue;
													}
													if (opcode == 6505) {
														intStack[isp++] = Preferences.lastWorldId;
														continue;
													}
													if (opcode == 6506) {
														isp--;
														int1 = intStack[isp];
														@Pc(10440) World local10440 = Static54.getWorld(int1);
														if (local10440 == null) {
															intStack[isp++] = -1;
															stringStack[ssp++] = EMPTY_STRING;
															intStack[isp++] = 0;
															stringStack[ssp++] = EMPTY_STRING;
															intStack[isp++] = 0;
														} else {
															intStack[isp++] = local10440.flags;
															stringStack[ssp++] = local10440.activity;
															@Pc(10458) WorldInfo local10458 = local10440.getWorldInfo();
															intStack[isp++] = local10458.flag;
															stringStack[ssp++] = local10458.name;
															intStack[isp++] = local10440.players;
														}
														continue;
													}
													if (opcode == 6507) {
														isp -= 4;
														int2 = intStack[isp + 2];
														int1 = intStack[isp];
														local7566 = intStack[isp + 3] == 1;
														local1552 = intStack[isp + 1] == 1;
														Static228.sortWorldList(int2, local1552, int1, local7566);
														continue;
													}
												} else if (opcode < 6700) {
													if (opcode == 6600) {
														isp--;
														Preferences.aBoolean63 = intStack[isp] == 1;
														Preferences.write(GameShell.signLink);
														continue;
													}
													if (opcode == 6601) {
														intStack[isp++] = Preferences.aBoolean63 ? 1 : 0;
														continue;
													}
												}
											}
										} else if (opcode == 4500) {
											isp -= 2;
											int1 = intStack[isp];
											int3 = intStack[isp + 1];
											local5294 = ParamTypeList.get(int3);
											if (local5294.isString()) {
												stringStack[ssp++] = StructTypeList.get(int1).getParam(local5294.defaultString, int3);
											} else {
												intStack[isp++] = StructTypeList.get(int1).getParam(int3, local5294.defaultInt);
											}
											continue;
										}
									} else if (opcode == 4400) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										local5294 = ParamTypeList.get(int3);
										if (local5294.isString()) {
											stringStack[ssp++] = LocTypeList.get(int1).method3430(local5294.defaultString, int3);
										} else {
											intStack[isp++] = LocTypeList.get(int1).getParam(local5294.defaultInt, int3);
										}
										continue;
									}
								} else {
									if (opcode == 4100) {
										ssp--;
										string = stringStack[ssp];
										isp--;
										int3 = intStack[isp];
										stringStack[ssp++] = JagString.concatenate(new JagString[] { string, JagString.parseInt(int3) });
										continue;
									}
									if (opcode == 4101) {
										ssp -= 2;
										local2522 = stringStack[ssp + 1];
										string = stringStack[ssp];
										stringStack[ssp++] = JagString.concatenate(new JagString[] { string, local2522 });
										continue;
									}
									if (opcode == 4102) {
										ssp--;
										string = stringStack[ssp];
										isp--;
										int3 = intStack[isp];
										stringStack[ssp++] = JagString.concatenate(new JagString[] { string, Static110.method2285(int3) });
										continue;
									}
									if (opcode == 4103) {
										ssp--;
										string = stringStack[ssp];
										stringStack[ssp++] = string.toLowerCase();
										continue;
									}
									if (opcode == 4104) {
										isp--;
										int1 = intStack[isp];
										@Pc(11770) long local11770 = (long) int1 * 86400000L + 1014768000000L;
										Static102.aCalendar2.setTime(new Date(local11770));
										local652 = Static102.aCalendar2.get(5);
										c = Static102.aCalendar2.get(2);
										local1087 = Static102.aCalendar2.get(1);
										stringStack[ssp++] = JagString.concatenate(new JagString[] { JagString.parseInt(local652), Static163.aClass100_767, Static34.aClass100Array40[c], Static163.aClass100_767, JagString.parseInt(local1087) });
										continue;
									}
									if (opcode == 4105) {
										ssp -= 2;
										local2522 = stringStack[ssp + 1];
										string = stringStack[ssp];
										if (PlayerList.self.appearance != null && PlayerList.self.appearance.gender) {
											stringStack[ssp++] = local2522;
											continue;
										}
										stringStack[ssp++] = string;
										continue;
									}
									if (opcode == 4106) {
										isp--;
										int1 = intStack[isp];
										stringStack[ssp++] = JagString.parseInt(int1);
										continue;
									}
									if (opcode == 4107) {
										ssp -= 2;
										intStack[isp++] = stringStack[ssp].method3126(stringStack[ssp + 1]);
										continue;
									}
									if (opcode == 4108) {
										ssp--;
										string = stringStack[ssp];
										isp -= 2;
										int2 = intStack[isp + 1];
										int3 = intStack[isp];
										intStack[isp++] = FontMetricsList.get(int2).getParagraphLineCount(string, int3);
										continue;
									}
									if (opcode == 4109) {
										isp -= 2;
										ssp--;
										string = stringStack[ssp];
										int2 = intStack[isp + 1];
										int3 = intStack[isp];
										intStack[isp++] = FontMetricsList.get(int2).method2856(string, int3);
										continue;
									}
									if (opcode == 4110) {
										ssp -= 2;
										string = stringStack[ssp];
										local2522 = stringStack[ssp + 1];
										isp--;
										if (intStack[isp] == 1) {
											stringStack[ssp++] = string;
										} else {
											stringStack[ssp++] = local2522;
										}
										continue;
									}
									if (opcode == 4111) {
										ssp--;
										string = stringStack[ssp];
										stringStack[ssp++] = Font.escape(string);
										continue;
									}
									if (opcode == 4112) {
										ssp--;
										string = stringStack[ssp];
										isp--;
										int3 = intStack[isp];
										if (int3 == -1) {
											throw new RuntimeException("null char");
										}
										stringStack[ssp++] = string.method3128(int3);
										continue;
									}
									if (opcode == 4113) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = method3213(int1) ? 1 : 0;
										continue;
									}
									if (opcode == 4114) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = Static83.method433(int1) ? 1 : 0;
										continue;
									}
									if (opcode == 4115) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = Static258.method4428(int1) ? 1 : 0;
										continue;
									}
									if (opcode == 4116) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = Static24.method671(int1) ? 1 : 0;
										continue;
									}
									if (opcode == 4117) {
										ssp--;
										string = stringStack[ssp];
										if (string == null) {
											intStack[isp++] = 0;
										} else {
											intStack[isp++] = string.length();
										}
										continue;
									}
									if (opcode == 4118) {
										isp -= 2;
										ssp--;
										string = stringStack[ssp];
										int3 = intStack[isp];
										int2 = intStack[isp + 1];
										stringStack[ssp++] = string.substring(int2, int3);
										continue;
									}
									if (opcode == 4119) {
										ssp--;
										string = stringStack[ssp];
										local2522 = Static87.allocate(string.length());
										@Pc(12220) boolean local12220 = false;
										for (local652 = 0; local652 < string.length(); local652++) {
											c = string.charAt(local652);
											if (c == 60) {
												local12220 = true;
											} else if (c == 62) {
												local12220 = false;
											} else if (!local12220) {
												local2522.append(c);
											}
										}
										local2522.method3156();
										stringStack[ssp++] = local2522;
										continue;
									}
									if (opcode == 4120) {
										isp -= 2;
										ssp--;
										string = stringStack[ssp];
										int3 = intStack[isp];
										int2 = intStack[isp + 1];
										intStack[isp++] = string.indexOf(int3, int2);
										continue;
									}
									if (opcode == 4121) {
										ssp -= 2;
										string = stringStack[ssp];
										local2522 = stringStack[ssp + 1];
										isp--;
										int2 = intStack[isp];
										intStack[isp++] = string.indexOf(local2522, int2);
										continue;
									}
									if (opcode == 4122) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = Static231.toLowerCase(int1);
										continue;
									}
									if (opcode == 4123) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = Static143.toUpperCase(int1);
										continue;
									}
									if (opcode == 4124) {
										isp--;
										local12388 = intStack[isp] != 0;
										isp--;
										int3 = intStack[isp];
										stringStack[ssp++] = Static182.valueToBase10String(client.language, local12388, 0, (long) int3);
										continue;
									}
								}
							}
						} else {
							if (opcode < 2000) {
								component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
							} else {
								isp--;
								component = InterfaceList.getComponent(intStack[isp]);
								opcode -= 1000;
							}
							if (opcode == 1000) {
								isp -= 4;
								component.baseX = intStack[isp];
								component.baseY = intStack[isp + 1];
								int2 = intStack[isp + 3];
								if (int2 < 0) {
									int2 = 0;
								} else if (int2 > 5) {
									int2 = 5;
								}
								int3 = intStack[isp + 2];
								if (int3 < 0) {
									int3 = 0;
								} else if (int3 > 5) {
									int3 = 5;
								}
								component.xMode = (byte) int2;
								component.yMode = (byte) int3;
								InterfaceList.redraw(component);
								Static74.update(component);
								if (component.createdComponentId == -1) {
									DelayedStateChange.method4675(component.id);
								}
								continue;
							}
							if (opcode == 1001) {
								isp -= 4;
								component.baseWidth = intStack[isp];
								component.baseHeight = intStack[isp + 1];
								component.anInt451 = 0;
								component.anInt526 = 0;
								int3 = intStack[isp + 2];
								int2 = intStack[isp + 3];
								if (int2 < 0) {
									int2 = 0;
								} else if (int2 > 4) {
									int2 = 4;
								}
								component.dynamicHeightValue = (byte) int2;
								if (int3 < 0) {
									int3 = 0;
								} else if (int3 > 4) {
									int3 = 4;
								}
								component.dynamicWidthValue = (byte) int3;
								InterfaceList.redraw(component);
								Static74.update(component);
								if (component.type == 0) {
									Static17.method531(component, false);
								}
								continue;
							}
							if (opcode == 1003) {
								isp--;
								local1552 = intStack[isp] == 1;
								if (local1552 != component.hidden) {
									component.hidden = local1552;
									InterfaceList.redraw(component);
								}
								if (component.createdComponentId == -1) {
									DelayedStateChange.method1906(component.id);
								}
								continue;
							}
							if (opcode == 1004) {
								isp -= 2;
								component.aspectWidth = intStack[isp];
								component.aspectHeight = intStack[isp + 1];
								InterfaceList.redraw(component);
								Static74.update(component);
								if (component.type == 0) {
									Static17.method531(component, false);
								}
								continue;
							}
							if (opcode == 1005) {
								isp--;
								component.noClickThrough = intStack[isp] == 1;
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(14378) Exception ex) {
			if (script.name == null) {
				if (client.modeWhere != 0) {
					Chat.add(EMPTY_STRING, 0, Static136.CS_ERROR);
				}
				TracingException.report("CS2 - scr:" + script.key + " op:" + op, ex);
			} else {
				@Pc(14385) JagString str = Static87.allocate(30);
				str.method3113(Static219.aClass100_928).method3113(script.name);
				for (cycles = Static138.fp - 1; cycles >= 0; cycles--) {
					str.method3113(aClass100_253).method3113(Static67.callStack[cycles].script.name);
				}
				if (op == 40) {
					cycles = intOperands[pc];
					str.method3113(Static176.aClass100_802).method3113(JagString.parseInt(cycles));
				}
				if (client.modeWhere != 0) {
					Chat.add(EMPTY_STRING, 0, JagString.concatenate(new JagString[] { aClass100_780, script.name}));
				}
				TracingException.report("CS2 - scr:" + script.key + " op:" + op + new String(str.method3148()), ex);
			}
		}
	}

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!jl;)V")
	public static void run(@OriginalArg(1) HookRequest request) {
		run(200000, request);
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(II)Z")
	public static boolean method3213(@OriginalArg(1) int arg0) {
		if (arg0 >= 32 && arg0 <= 126) {
			return true;
		} else if (arg0 >= 160 && arg0 <= 255) {
			return true;
		} else {
			return arg0 == 128 || arg0 == 140 || arg0 == 151 || arg0 == 156 || arg0 == 159;
		}
	}
}
