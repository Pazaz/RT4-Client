import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ve;Lclient!ve;Z)V")
	public static void init(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1) {
		Static86.aClass153_37 = arg0;
		Static58.aClass153_28 = arg1;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BILclient!jl;)V")
	public static void method1818(@OriginalArg(1) int maxCycles, @OriginalArg(2) HookRequest request) {
		@Pc(4) Object[] local4 = request.arguments;
		@Pc(10) int sid = (Integer) local4[0];
		@Pc(14) ClientScript script = Static91.getCs2ById(sid);
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
			Static180.stringLocals = new JagString[script.anInt4671];
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
					if (value.strEquals(Static15.EVENT_OPBASE)) {
						value = request.opBase;
					}
					Static180.stringLocals[stringLocalIndex++] = value;
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
				@Pc(803) int local803;
				@Pc(652) int local652;
				@Pc(809) int type;
				@Pc(609) JagString string;
				if (opcode < 100) {
					if (opcode == 0) {
						Static254.intStack[isp++] = intOperands[pc];
						continue;
					}
					if (opcode == 1) {
						id = intOperands[pc];
						Static254.intStack[isp++] = Static7.varps[id];
						continue;
					}
					if (opcode == 2) {
						id = intOperands[pc];
						isp--;
						Static148.method2766(id, Static254.intStack[isp]);
						continue;
					}
					if (opcode == 3) {
						Static3.stringStack[ssp++] = script.stringOperands[pc];
						continue;
					}
					if (opcode == 6) {
						pc += intOperands[pc];
						continue;
					}
					if (opcode == 7) {
						isp -= 2;
						if (Static254.intStack[isp] != Static254.intStack[isp + 1]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 8) {
						isp -= 2;
						if (Static254.intStack[isp + 1] == Static254.intStack[isp]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 9) {
						isp -= 2;
						if (Static254.intStack[isp] < Static254.intStack[isp + 1]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 10) {
						isp -= 2;
						if (Static254.intStack[isp + 1] < Static254.intStack[isp]) {
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
						Static180.stringLocals = frame.stringLocals;
						intOperands = script.intOperands;
						continue;
					}
					if (opcode == 25) {
						id = intOperands[pc];
						Static254.intStack[isp++] = Static155.getVarbit(id);
						continue;
					}
					if (opcode == 27) {
						id = intOperands[pc];
						isp--;
						Static202.setVarbitClient(id, Static254.intStack[isp]);
						continue;
					}
					if (opcode == 31) {
						isp -= 2;
						if (Static254.intStack[isp + 1] >= Static254.intStack[isp]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 32) {
						isp -= 2;
						if (Static254.intStack[isp] >= Static254.intStack[isp + 1]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 33) {
						Static254.intStack[isp++] = Static215.intLocals[intOperands[pc]];
						continue;
					}
					@Pc(555) int local;
					if (opcode == 34) {
						local = intOperands[pc];
						isp--;
						Static215.intLocals[local] = Static254.intStack[isp];
						continue;
					}
					if (opcode == 35) {
						Static3.stringStack[ssp++] = Static180.stringLocals[intOperands[pc]];
						continue;
					}
					if (opcode == 36) {
						local = intOperands[pc];
						ssp--;
						Static180.stringLocals[local] = Static3.stringStack[ssp];
						continue;
					}
					if (opcode == 37) {
						id = intOperands[pc];
						ssp -= id;
						string = Static118.method2355(ssp, id, Static3.stringStack);
						Static3.stringStack[ssp++] = string;
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
						@Pc(642) ClientScript local642 = Static91.getCs2ById(id);
						@Pc(646) int[] local646 = new int[local642.anInt4667];
						@Pc(650) JagString[] local650 = new JagString[local642.anInt4671];
						for (local652 = 0; local652 < local642.anInt4665; local652++) {
							local646[local652] = Static254.intStack[local652 + isp - local642.anInt4665];
						}
						for (local652 = 0; local652 < local642.anInt4669; local652++) {
							local650[local652] = Static3.stringStack[local652 + ssp - local642.anInt4669];
						}
						isp -= local642.anInt4665;
						ssp -= local642.anInt4669;
						@Pc(705) GoSubFrame local705 = new GoSubFrame();
						local705.stringLocals = Static180.stringLocals;
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
						Static180.stringLocals = local650;
						continue;
					}
					if (opcode == 42) {
						Static254.intStack[isp++] = Static155.varcs[intOperands[pc]];
						continue;
					}
					if (opcode == 43) {
						id = intOperands[pc];
						isp--;
						Static155.varcs[id] = Static254.intStack[isp];
						Static4.method24(id);
						continue;
					}
					if (opcode == 44) {
						id = intOperands[pc] >> 16;
						isp--;
						local803 = Static254.intStack[isp];
						type = intOperands[pc] & 0xFFFF;
						if (local803 >= 0 && local803 <= 5000) {
							Static55.anIntArray140[id] = local803;
							@Pc(828) byte local828 = -1;
							if (type == 105) {
								local828 = 0;
							}
							local652 = 0;
							while (true) {
								if (local803 <= local652) {
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
						type = Static254.intStack[isp];
						if (type >= 0 && type < Static55.anIntArray140[id]) {
							Static254.intStack[isp++] = Static179.anIntArrayArray33[id][type];
							continue;
						}
						throw new RuntimeException();
					}
					if (opcode == 46) {
						id = intOperands[pc];
						isp -= 2;
						type = Static254.intStack[isp];
						if (type >= 0 && type < Static55.anIntArray140[id]) {
							Static179.anIntArrayArray33[id][type] = Static254.intStack[isp + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (opcode == 47) {
						value = Static226.varcstrs[intOperands[pc]];
						if (value == null) {
							value = Static254.aClass100_1061;
						}
						Static3.stringStack[ssp++] = value;
						continue;
					}
					if (opcode == 48) {
						id = intOperands[pc];
						ssp--;
						Static226.varcstrs[id] = Static3.stringStack[ssp];
						Static89.method1840(id);
						continue;
					}
					if (opcode == 51) {
						@Pc(992) HashTable local992 = script.aClass133Array1[intOperands[pc]];
						isp--;
						@Pc(1002) IntNode local1002 = (IntNode) local992.get((long) Static254.intStack[isp]);
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
				@Pc(1052) int local1052;
				@Pc(1063) Component local1063;
				@Pc(1087) int local1087;
				@Pc(1256) Component local1256;
				if (opcode < 300) {
					if (opcode == 100) {
						isp -= 3;
						type = Static254.intStack[isp];
						local803 = Static254.intStack[isp + 1];
						local1052 = Static254.intStack[isp + 2];
						if (local803 != 0) {
							local1063 = Static5.getComponent(type);
							if (local1063.createdComponents == null) {
								local1063.createdComponents = new Component[local1052 + 1];
							}
							if (local1052 >= local1063.createdComponents.length) {
								@Pc(1085) Component[] local1085 = new Component[local1052 + 1];
								for (local1087 = 0; local1087 < local1063.createdComponents.length; local1087++) {
									local1085[local1087] = local1063.createdComponents[local1087];
								}
								local1063.createdComponents = local1085;
							}
							if (local1052 > 0 && local1063.createdComponents[local1052 - 1] == null) {
								throw new RuntimeException("Gap at:" + (local1052 - 1));
							}
							@Pc(1137) Component local1137 = new Component();
							local1137.aBoolean32 = true;
							local1137.createdComponentId = local1052;
							local1137.layer = local1137.id = local1063.id;
							local1137.type = local803;
							local1063.createdComponents[local1052] = local1137;
							if (local1020) {
								Static274.staticActiveComponent1 = local1137;
							} else {
								Static227.staticActiveComponent2 = local1137;
							}
							Static43.redraw(local1063);
							continue;
						}
						throw new RuntimeException();
					}
					@Pc(1204) Component local1204;
					if (opcode == 101) {
						component = local1020 ? Static274.staticActiveComponent1 : Static227.staticActiveComponent2;
						if (component.createdComponentId == -1) {
							if (!local1020) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local1204 = Static5.getComponent(component.id);
						local1204.createdComponents[component.createdComponentId] = null;
						Static43.redraw(local1204);
						continue;
					}
					if (opcode == 102) {
						isp--;
						component = Static5.getComponent(Static254.intStack[isp]);
						component.createdComponents = null;
						Static43.redraw(component);
						continue;
					}
					if (opcode == 200) {
						isp -= 2;
						type = Static254.intStack[isp];
						local803 = Static254.intStack[isp + 1];
						local1256 = Static201.method1418(type, local803);
						if (local1256 != null && local803 != -1) {
							Static254.intStack[isp++] = 1;
							if (local1020) {
								Static274.staticActiveComponent1 = local1256;
							} else {
								Static227.staticActiveComponent2 = local1256;
							}
							continue;
						}
						Static254.intStack[isp++] = 0;
						continue;
					}
					if (opcode == 201) {
						isp--;
						type = Static254.intStack[isp];
						local1204 = Static5.getComponent(type);
						if (local1204 == null) {
							Static254.intStack[isp++] = 0;
						} else {
							Static254.intStack[isp++] = 1;
							if (local1020) {
								Static274.staticActiveComponent1 = local1204;
							} else {
								Static227.staticActiveComponent2 = local1204;
							}
						}
						continue;
					}
				} else {
					@Pc(12388) boolean local12388;
					if (opcode < 500) {
						if (opcode == 403) {
							isp -= 2;
							local803 = Static254.intStack[isp + 1];
							type = Static254.intStack[isp];
							for (local1052 = 0; local1052 < Static204.anIntArray425.length; local1052++) {
								if (type == Static204.anIntArray425[local1052]) {
									Static173.self.aClass59_1.method1953(local1052, local803);
									continue nextOp;
								}
							}
							local1052 = 0;
							while (true) {
								if (local1052 >= Static153.anIntArray351.length) {
									continue nextOp;
								}
								if (type == Static153.anIntArray351[local1052]) {
									Static173.self.aClass59_1.method1953(local1052, local803);
									continue nextOp;
								}
								local1052++;
							}
						}
						if (opcode == 404) {
							isp -= 2;
							type = Static254.intStack[isp];
							local803 = Static254.intStack[isp + 1];
							Static173.self.aClass59_1.method1951(type, local803);
							continue;
						}
						if (opcode == 410) {
							isp--;
							local12388 = Static254.intStack[isp] != 0;
							Static173.self.aClass59_1.method1948(local12388);
							continue;
						}
					} else {
						@Pc(1552) boolean local1552;
						if ((opcode < 1000 || opcode >= 1100) && (opcode < 2000 || opcode >= 2100)) {
							@Pc(2522) JagString local2522;
							if (opcode >= 1100 && opcode < 1200 || !(opcode < 2100 || opcode >= 2200)) {
								if (opcode < 2000) {
									component = local1020 ? Static274.staticActiveComponent1 : Static227.staticActiveComponent2;
								} else {
									opcode -= 1000;
									isp--;
									component = Static5.getComponent(Static254.intStack[isp]);
								}
								if (opcode == 1100) {
									isp -= 2;
									component.anInt489 = Static254.intStack[isp];
									if (component.anInt489 > component.anInt486 - component.anInt445) {
										component.anInt489 = component.anInt486 - component.anInt445;
									}
									if (component.anInt489 < 0) {
										component.anInt489 = 0;
									}
									component.scrollY = Static254.intStack[isp + 1];
									if (component.scrollY > component.anInt491 - component.anInt459) {
										component.scrollY = component.anInt491 - component.anInt459;
									}
									if (component.scrollY < 0) {
										component.scrollY = 0;
									}
									Static43.redraw(component);
									if (component.createdComponentId == -1) {
										Static118.method2353(component.id);
									}
									continue;
								}
								if (opcode == 1101) {
									isp--;
									component.anInt474 = Static254.intStack[isp];
									Static43.redraw(component);
									if (component.createdComponentId == -1) {
										Static245.method4224(component.id);
									}
									continue;
								}
								if (opcode == 1102) {
									isp--;
									component.aBoolean30 = Static254.intStack[isp] == 1;
									Static43.redraw(component);
									continue;
								}
								if (opcode == 1103) {
									isp--;
									component.anInt476 = Static254.intStack[isp];
									Static43.redraw(component);
									continue;
								}
								if (opcode == 1104) {
									isp--;
									component.anInt490 = Static254.intStack[isp];
									Static43.redraw(component);
									continue;
								}
								if (opcode == 1105) {
									isp--;
									component.anInt477 = Static254.intStack[isp];
									Static43.redraw(component);
									continue;
								}
								if (opcode == 1106) {
									isp--;
									component.anInt521 = Static254.intStack[isp];
									Static43.redraw(component);
									continue;
								}
								if (opcode == 1107) {
									isp--;
									component.aBoolean23 = Static254.intStack[isp] == 1;
									Static43.redraw(component);
									continue;
								}
								if (opcode == 1108) {
									component.modelType = 1;
									isp--;
									component.modelId = Static254.intStack[isp];
									Static43.redraw(component);
									if (component.createdComponentId == -1) {
										Static271.method4600(component.id);
									}
									continue;
								}
								if (opcode == 1109) {
									isp -= 6;
									component.modelXOffset = Static254.intStack[isp];
									component.modelZOffset = Static254.intStack[isp + 1];
									component.modelXAngle = Static254.intStack[isp + 2];
									component.modelYAngle = Static254.intStack[isp + 3];
									component.modelYOffset = Static254.intStack[isp + 4];
									component.modelZoom = Static254.intStack[isp + 5];
									Static43.redraw(component);
									if (component.createdComponentId == -1) {
										Static153.method2910(component.id);
										Static180.method3328(component.id);
									}
									continue;
								}
								if (opcode == 1110) {
									isp--;
									local803 = Static254.intStack[isp];
									if (component.anInt522 != local803) {
										component.anInt522 = local803;
										component.anInt510 = 0;
										component.anInt500 = 0;
										component.anInt496 = 1;
										Static43.redraw(component);
									}
									if (component.createdComponentId == -1) {
										Static181.method3345(component.id);
									}
									continue;
								}
								if (opcode == 1111) {
									isp--;
									component.aBoolean22 = Static254.intStack[isp] == 1;
									Static43.redraw(component);
									continue;
								}
								if (opcode == 1112) {
									ssp--;
									local2522 = Static3.stringStack[ssp];
									if (!local2522.strEquals(component.aClass100_84)) {
										component.aClass100_84 = local2522;
										Static43.redraw(component);
									}
									if (component.createdComponentId == -1) {
										Static163.method3096(component.id);
									}
									continue;
								}
								if (opcode == 1113) {
									isp--;
									component.anInt502 = Static254.intStack[isp];
									Static43.redraw(component);
									continue;
								}
								if (opcode == 1114) {
									isp -= 3;
									component.anInt460 = Static254.intStack[isp];
									component.anInt478 = Static254.intStack[isp + 1];
									component.anInt467 = Static254.intStack[isp + 2];
									Static43.redraw(component);
									continue;
								}
								if (opcode == 1115) {
									isp--;
									component.aBoolean28 = Static254.intStack[isp] == 1;
									Static43.redraw(component);
									continue;
								}
								if (opcode == 1116) {
									isp--;
									component.anInt514 = Static254.intStack[isp];
									Static43.redraw(component);
									continue;
								}
								if (opcode == 1117) {
									isp--;
									component.anInt513 = Static254.intStack[isp];
									Static43.redraw(component);
									continue;
								}
								if (opcode == 1118) {
									isp--;
									component.aBoolean21 = Static254.intStack[isp] == 1;
									Static43.redraw(component);
									continue;
								}
								if (opcode == 1119) {
									isp--;
									component.aBoolean26 = Static254.intStack[isp] == 1;
									Static43.redraw(component);
									continue;
								}
								if (opcode == 1120) {
									isp -= 2;
									component.anInt486 = Static254.intStack[isp];
									component.anInt491 = Static254.intStack[isp + 1];
									Static43.redraw(component);
									if (component.type == 0) {
										Static17.method531(component, false);
									}
									continue;
								}
								if (opcode == 1121) {
									isp -= 2;
									component.aShort11 = (short) Static254.intStack[isp];
									component.aShort10 = (short) Static254.intStack[isp + 1];
									Static43.redraw(component);
									continue;
								}
								if (opcode == 1122) {
									isp--;
									component.aBoolean18 = Static254.intStack[isp] == 1;
									Static43.redraw(component);
									continue;
								}
								if (opcode == 1123) {
									isp--;
									component.modelZoom = Static254.intStack[isp];
									Static43.redraw(component);
									if (component.createdComponentId == -1) {
										Static153.method2910(component.id);
									}
									continue;
								}
							} else if (opcode >= 1200 && opcode < 1300 || !(opcode < 2200 || opcode >= 2300)) {
								if (opcode < 2000) {
									component = local1020 ? Static274.staticActiveComponent1 : Static227.staticActiveComponent2;
								} else {
									isp--;
									component = Static5.getComponent(Static254.intStack[isp]);
									opcode -= 1000;
								}
								Static43.redraw(component);
								if (opcode == 1200 || opcode == 1205) {
									isp -= 2;
									local1052 = Static254.intStack[isp + 1];
									local803 = Static254.intStack[isp];
									if (component.createdComponentId == -1) {
										Static251.method4279(component.id);
										Static153.method2910(component.id);
										Static180.method3328(component.id);
									}
									if (local803 == -1) {
										component.modelId = -1;
										component.modelType = 1;
										component.objId = -1;
									} else {
										component.objId = local803;
										component.objCount = local1052;
										@Pc(13416) ObjType local13416 = Static71.method1439(local803);
										component.modelYOffset = local13416.anInt2339;
										component.modelXOffset = local13416.anInt2359;
										component.modelXAngle = local13416.anInt2353;
										component.modelZOffset = local13416.anInt2319;
										component.modelYAngle = local13416.anInt2369;
										component.modelZoom = local13416.anInt2375;
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
									component.modelId = Static254.intStack[isp];
									if (component.createdComponentId == -1) {
										Static271.method4600(component.id);
									}
									continue;
								}
								if (opcode == 1202) {
									component.modelType = 3;
									component.modelId = Static173.self.aClass59_1.method1952();
									if (component.createdComponentId == -1) {
										Static271.method4600(component.id);
									}
									continue;
								}
								if (opcode == 1203) {
									component.modelType = 6;
									isp--;
									component.modelId = Static254.intStack[isp];
									if (component.createdComponentId == -1) {
										Static271.method4600(component.id);
									}
									continue;
								}
								if (opcode == 1204) {
									component.modelType = 5;
									isp--;
									component.modelId = Static254.intStack[isp];
									if (component.createdComponentId == -1) {
										Static271.method4600(component.id);
									}
									continue;
								}
							} else if (opcode >= 1300 && opcode < 1400 || opcode >= 2300 && opcode < 2400) {
								if (opcode >= 2000) {
									isp--;
									component = Static5.getComponent(Static254.intStack[isp]);
									opcode -= 1000;
								} else {
									component = local1020 ? Static274.staticActiveComponent1 : Static227.staticActiveComponent2;
								}
								if (opcode == 1300) {
									isp--;
									local803 = Static254.intStack[isp] - 1;
									if (local803 >= 0 && local803 <= 9) {
										ssp--;
										component.method480(Static3.stringStack[ssp], local803);
										continue;
									}
									ssp--;
									continue;
								}
								if (opcode == 1301) {
									isp -= 2;
									local1052 = Static254.intStack[isp + 1];
									local803 = Static254.intStack[isp];
									component.aClass13_5 = Static201.method1418(local803, local1052);
									continue;
								}
								if (opcode == 1302) {
									isp--;
									component.aBoolean27 = Static254.intStack[isp] == 1;
									continue;
								}
								if (opcode == 1303) {
									isp--;
									component.anInt472 = Static254.intStack[isp];
									continue;
								}
								if (opcode == 1304) {
									isp--;
									component.anInt447 = Static254.intStack[isp];
									continue;
								}
								if (opcode == 1305) {
									ssp--;
									component.aClass100_88 = Static3.stringStack[ssp];
									continue;
								}
								if (opcode == 1306) {
									ssp--;
									component.aClass100_86 = Static3.stringStack[ssp];
									continue;
								}
								if (opcode == 1307) {
									component.aClass100Array18 = null;
									continue;
								}
								if (opcode == 1308) {
									isp--;
									component.anInt484 = Static254.intStack[isp];
									isp--;
									component.anInt499 = Static254.intStack[isp];
									continue;
								}
								if (opcode == 1309) {
									isp--;
									local803 = Static254.intStack[isp];
									isp--;
									local1052 = Static254.intStack[isp];
									if (local1052 >= 1 && local1052 <= 10) {
										component.method477(local1052 - 1, local803);
									}
									continue;
								}
							} else {
								@Pc(4859) int c;
								if (opcode >= 1400 && opcode < 1500 || opcode >= 2400 && opcode < 2500) {
									if (opcode < 2000) {
										component = local1020 ? Static274.staticActiveComponent1 : Static227.staticActiveComponent2;
									} else {
										opcode -= 1000;
										isp--;
										component = Static5.getComponent(Static254.intStack[isp]);
									}
									@Pc(12937) int[] local12937 = null;
									ssp--;
									local2522 = Static3.stringStack[ssp];
									if (local2522.length() > 0 && local2522.charAt(local2522.length() - 1) == 89) {
										isp--;
										local652 = Static254.intStack[isp];
										if (local652 > 0) {
											local12937 = new int[local652];
											while (local652-- > 0) {
												isp--;
												local12937[local652] = Static254.intStack[isp];
											}
										}
										local2522 = local2522.substring(local2522.length() - 1, 0);
									}
									@Pc(13000) Object[] local13000 = new Object[local2522.length() + 1];
									for (c = local13000.length - 1; c >= 1; c--) {
										if (local2522.charAt(c - 1) == 115) {
											ssp--;
											local13000[c] = Static3.stringStack[ssp];
										} else {
											isp--;
											local13000[c] = Integer.valueOf(Static254.intStack[isp]);
										}
									}
									isp--;
									c = Static254.intStack[isp];
									if (c == -1) {
										local13000 = null;
									} else {
										local13000[0] = Integer.valueOf(c);
									}
									component.aBoolean25 = true;
									if (opcode == 1400) {
										component.anObjectArray5 = local13000;
									} else if (opcode == 1401) {
										component.anObjectArray9 = local13000;
									} else if (opcode == 1402) {
										component.anObjectArray18 = local13000;
									} else if (opcode == 1403) {
										component.anObjectArray19 = local13000;
									} else if (opcode == 1404) {
										component.anObjectArray24 = local13000;
									} else if (opcode == 1405) {
										component.anObjectArray26 = local13000;
									} else if (opcode == 1406) {
										component.anObjectArray27 = local13000;
									} else if (opcode == 1407) {
										component.anIntArray44 = local12937;
										component.anObjectArray25 = local13000;
									} else if (opcode == 1408) {
										component.anObjectArray22 = local13000;
									} else if (opcode == 1409) {
										component.anObjectArray29 = local13000;
									} else if (opcode == 1410) {
										component.anObjectArray16 = local13000;
									} else if (opcode == 1411) {
										component.anObjectArray6 = local13000;
									} else if (opcode == 1412) {
										component.anObjectArray23 = local13000;
									} else if (opcode == 1414) {
										component.anIntArray34 = local12937;
										component.anObjectArray7 = local13000;
									} else if (opcode == 1415) {
										component.anIntArray42 = local12937;
										component.anObjectArray2 = local13000;
									} else if (opcode == 1416) {
										component.anObjectArray11 = local13000;
									} else if (opcode == 1417) {
										component.anObjectArray10 = local13000;
									} else if (opcode == 1418) {
										component.anObjectArray20 = local13000;
									} else if (opcode == 1419) {
										component.anObjectArray14 = local13000;
									} else if (opcode == 1420) {
										component.anObjectArray1 = local13000;
									} else if (opcode == 1421) {
										component.anObjectArray28 = local13000;
									} else if (opcode == 1422) {
										component.anObjectArray30 = local13000;
									} else if (opcode == 1423) {
										component.anObjectArray12 = local13000;
									} else if (opcode == 1424) {
										component.anObjectArray8 = local13000;
									} else if (opcode == 1425) {
										component.anObjectArray21 = local13000;
									} else if (opcode == 1426) {
										component.anObjectArray13 = local13000;
									} else if (opcode == 1427) {
										component.anObjectArray17 = local13000;
									} else if (opcode == 1428) {
										component.anObjectArray4 = local13000;
										component.anIntArray38 = local12937;
									} else if (opcode == 1429) {
										component.anIntArray35 = local12937;
										component.anObjectArray15 = local13000;
									}
									continue;
								}
								if (opcode < 1600) {
									component = local1020 ? Static274.staticActiveComponent1 : Static227.staticActiveComponent2;
									if (opcode == 1500) {
										Static254.intStack[isp++] = component.x;
										continue;
									}
									if (opcode == 1501) {
										Static254.intStack[isp++] = component.y;
										continue;
									}
									if (opcode == 1502) {
										Static254.intStack[isp++] = component.anInt445;
										continue;
									}
									if (opcode == 1503) {
										Static254.intStack[isp++] = component.anInt459;
										continue;
									}
									if (opcode == 1504) {
										Static254.intStack[isp++] = component.hidden ? 1 : 0;
										continue;
									}
									if (opcode == 1505) {
										Static254.intStack[isp++] = component.layer;
										continue;
									}
								} else if (opcode < 1700) {
									component = local1020 ? Static274.staticActiveComponent1 : Static227.staticActiveComponent2;
									if (opcode == 1600) {
										Static254.intStack[isp++] = component.anInt489;
										continue;
									}
									if (opcode == 1601) {
										Static254.intStack[isp++] = component.scrollY;
										continue;
									}
									if (opcode == 1602) {
										Static3.stringStack[ssp++] = component.aClass100_84;
										continue;
									}
									if (opcode == 1603) {
										Static254.intStack[isp++] = component.anInt486;
										continue;
									}
									if (opcode == 1604) {
										Static254.intStack[isp++] = component.anInt491;
										continue;
									}
									if (opcode == 1605) {
										Static254.intStack[isp++] = component.modelZoom;
										continue;
									}
									if (opcode == 1606) {
										Static254.intStack[isp++] = component.modelXAngle;
										continue;
									}
									if (opcode == 1607) {
										Static254.intStack[isp++] = component.modelYOffset;
										continue;
									}
									if (opcode == 1608) {
										Static254.intStack[isp++] = component.modelYAngle;
										continue;
									}
									if (opcode == 1609) {
										Static254.intStack[isp++] = component.anInt476;
										continue;
									}
									if (opcode == 1610) {
										Static254.intStack[isp++] = component.modelXOffset;
										continue;
									}
									if (opcode == 1611) {
										Static254.intStack[isp++] = component.modelZOffset;
										continue;
									}
									if (opcode == 1612) {
										Static254.intStack[isp++] = component.anInt477;
										continue;
									}
								} else if (opcode < 1800) {
									component = local1020 ? Static274.staticActiveComponent1 : Static227.staticActiveComponent2;
									if (opcode == 1700) {
										Static254.intStack[isp++] = component.objId;
										continue;
									}
									if (opcode == 1701) {
										if (component.objId == -1) {
											Static254.intStack[isp++] = 0;
										} else {
											Static254.intStack[isp++] = component.objCount;
										}
										continue;
									}
									if (opcode == 1702) {
										Static254.intStack[isp++] = component.createdComponentId;
										continue;
									}
								} else if (opcode < 1900) {
									component = local1020 ? Static274.staticActiveComponent1 : Static227.staticActiveComponent2;
									if (opcode == 1800) {
										Static254.intStack[isp++] = Static36.method940(component).method512();
										continue;
									}
									if (opcode == 1801) {
										isp--;
										local803 = Static254.intStack[isp];
										local803--;
										if (component.aClass100Array18 != null && local803 < component.aClass100Array18.length && component.aClass100Array18[local803] != null) {
											Static3.stringStack[ssp++] = component.aClass100Array18[local803];
											continue;
										}
										Static3.stringStack[ssp++] = Static72.EMPTY_STRING;
										continue;
									}
									if (opcode == 1802) {
										if (component.aClass100_88 == null) {
											Static3.stringStack[ssp++] = Static72.EMPTY_STRING;
										} else {
											Static3.stringStack[ssp++] = component.aClass100_88;
										}
										continue;
									}
								} else if (opcode < 2600) {
									isp--;
									component = Static5.getComponent(Static254.intStack[isp]);
									if (opcode == 2500) {
										Static254.intStack[isp++] = component.x;
										continue;
									}
									if (opcode == 2501) {
										Static254.intStack[isp++] = component.y;
										continue;
									}
									if (opcode == 2502) {
										Static254.intStack[isp++] = component.anInt445;
										continue;
									}
									if (opcode == 2503) {
										Static254.intStack[isp++] = component.anInt459;
										continue;
									}
									if (opcode == 2504) {
										Static254.intStack[isp++] = component.hidden ? 1 : 0;
										continue;
									}
									if (opcode == 2505) {
										Static254.intStack[isp++] = component.layer;
										continue;
									}
								} else if (opcode < 2700) {
									isp--;
									component = Static5.getComponent(Static254.intStack[isp]);
									if (opcode == 2600) {
										Static254.intStack[isp++] = component.anInt489;
										continue;
									}
									if (opcode == 2601) {
										Static254.intStack[isp++] = component.scrollY;
										continue;
									}
									if (opcode == 2602) {
										Static3.stringStack[ssp++] = component.aClass100_84;
										continue;
									}
									if (opcode == 2603) {
										Static254.intStack[isp++] = component.anInt486;
										continue;
									}
									if (opcode == 2604) {
										Static254.intStack[isp++] = component.anInt491;
										continue;
									}
									if (opcode == 2605) {
										Static254.intStack[isp++] = component.modelZoom;
										continue;
									}
									if (opcode == 2606) {
										Static254.intStack[isp++] = component.modelXAngle;
										continue;
									}
									if (opcode == 2607) {
										Static254.intStack[isp++] = component.modelYOffset;
										continue;
									}
									if (opcode == 2608) {
										Static254.intStack[isp++] = component.modelYAngle;
										continue;
									}
									if (opcode == 2609) {
										Static254.intStack[isp++] = component.anInt476;
										continue;
									}
									if (opcode == 2610) {
										Static254.intStack[isp++] = component.modelXOffset;
										continue;
									}
									if (opcode == 2611) {
										Static254.intStack[isp++] = component.modelZOffset;
										continue;
									}
									if (opcode == 2612) {
										Static254.intStack[isp++] = component.anInt477;
										continue;
									}
								} else if (opcode < 2800) {
									if (opcode == 2700) {
										isp--;
										component = Static5.getComponent(Static254.intStack[isp]);
										Static254.intStack[isp++] = component.objId;
										continue;
									}
									if (opcode == 2701) {
										isp--;
										component = Static5.getComponent(Static254.intStack[isp]);
										if (component.objId == -1) {
											Static254.intStack[isp++] = 0;
										} else {
											Static254.intStack[isp++] = component.objCount;
										}
										continue;
									}
									if (opcode == 2702) {
										isp--;
										type = Static254.intStack[isp];
										@Pc(12566) Class3_Sub31 local12566 = (Class3_Sub31) Static119.aClass133_9.get((long) type);
										if (local12566 == null) {
											Static254.intStack[isp++] = 0;
										} else {
											Static254.intStack[isp++] = 1;
										}
										continue;
									}
									if (opcode == 2703) {
										isp--;
										component = Static5.getComponent(Static254.intStack[isp]);
										if (component.createdComponents == null) {
											Static254.intStack[isp++] = 0;
											continue;
										}
										local803 = component.createdComponents.length;
										for (local1052 = 0; local1052 < component.createdComponents.length; local1052++) {
											if (component.createdComponents[local1052] == null) {
												local803 = local1052;
												break;
											}
										}
										Static254.intStack[isp++] = local803;
										continue;
									}
									if (opcode == 2704 || opcode == 2705) {
										isp -= 2;
										type = Static254.intStack[isp];
										local803 = Static254.intStack[isp + 1];
										@Pc(12663) Class3_Sub31 local12663 = (Class3_Sub31) Static119.aClass133_9.get((long) type);
										if (local12663 != null && local12663.anInt5878 == local803) {
											Static254.intStack[isp++] = 1;
											continue;
										}
										Static254.intStack[isp++] = 0;
										continue;
									}
								} else if (opcode < 2900) {
									isp--;
									component = Static5.getComponent(Static254.intStack[isp]);
									if (opcode == 2800) {
										Static254.intStack[isp++] = Static36.method940(component).method512();
										continue;
									}
									if (opcode == 2801) {
										isp--;
										local803 = Static254.intStack[isp];
										local803--;
										if (component.aClass100Array18 != null && component.aClass100Array18.length > local803 && component.aClass100Array18[local803] != null) {
											Static3.stringStack[ssp++] = component.aClass100Array18[local803];
											continue;
										}
										Static3.stringStack[ssp++] = Static72.EMPTY_STRING;
										continue;
									}
									if (opcode == 2802) {
										if (component.aClass100_88 == null) {
											Static3.stringStack[ssp++] = Static72.EMPTY_STRING;
										} else {
											Static3.stringStack[ssp++] = component.aClass100_88;
										}
										continue;
									}
								} else if (opcode < 3200) {
									if (opcode == 3100) {
										ssp--;
										string = Static3.stringStack[ssp];
										Static103.method2231(Static72.EMPTY_STRING, 0, string);
										continue;
									}
									if (opcode == 3101) {
										isp -= 2;
										Static186.method3415(Static254.intStack[isp + 1], Static254.intStack[isp], Static173.self);
										continue;
									}
									if (opcode == 3103) {
										Static153.method2909();
										continue;
									}
									if (opcode == 3104) {
										ssp--;
										string = Static3.stringStack[ssp];
										local803 = 0;
										if (string.isInt()) {
											local803 = string.parseInt();
										}
										Static6.outboundBuffer.p1isaac(23);
										Static6.outboundBuffer.p4(local803);
										continue;
									}
									if (opcode == 3105) {
										ssp--;
										string = Static3.stringStack[ssp];
										Static6.outboundBuffer.p1isaac(244);
										Static6.outboundBuffer.p8(string.encode37());
										continue;
									}
									if (opcode == 3106) {
										ssp--;
										string = Static3.stringStack[ssp];
										Static6.outboundBuffer.p1isaac(65);
										Static6.outboundBuffer.p1(string.length() + 1);
										Static6.outboundBuffer.pjstr(string);
										continue;
									}
									if (opcode == 3107) {
										isp--;
										type = Static254.intStack[isp];
										ssp--;
										local2522 = Static3.stringStack[ssp];
										Static276.method4613(type, local2522);
										continue;
									}
									if (opcode == 3108) {
										isp -= 3;
										local803 = Static254.intStack[isp + 1];
										type = Static254.intStack[isp];
										local1052 = Static254.intStack[isp + 2];
										local1063 = Static5.getComponent(local1052);
										Static40.method1015(local803, type, local1063);
										continue;
									}
									if (opcode == 3109) {
										isp -= 2;
										type = Static254.intStack[isp];
										local1256 = local1020 ? Static274.staticActiveComponent1 : Static227.staticActiveComponent2;
										local803 = Static254.intStack[isp + 1];
										Static40.method1015(local803, type, local1256);
										continue;
									}
									if (opcode == 3110) {
										isp--;
										type = Static254.intStack[isp];
										Static6.outboundBuffer.p1isaac(111);
										Static6.outboundBuffer.p2(type);
										continue;
									}
								} else if (opcode < 3300) {
									if (opcode == 3200) {
										isp -= 3;
										Static26.method744(Static254.intStack[isp + 1], Static254.intStack[isp], Static254.intStack[isp + 2]);
										continue;
									}
									if (opcode == 3201) {
										isp--;
										Static148.method2765(Static254.intStack[isp]);
										continue;
									}
									if (opcode == 3202) {
										isp -= 2;
										Static278.method4650(Static254.intStack[isp + 1], Static254.intStack[isp]);
										continue;
									}
								} else if (opcode < 3400) {
									if (opcode == 3300) {
										Static254.intStack[isp++] = Static83.loop;
										continue;
									}
									if (opcode == 3301) {
										isp -= 2;
										type = Static254.intStack[isp];
										local803 = Static254.intStack[isp + 1];
										Static254.intStack[isp++] = Static15.method484(type, local803);
										continue;
									}
									if (opcode == 3302) {
										isp -= 2;
										local803 = Static254.intStack[isp + 1];
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = Static23.method647(type, local803);
										continue;
									}
									if (opcode == 3303) {
										isp -= 2;
										local803 = Static254.intStack[isp + 1];
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = Static278.method4652(type, local803);
										continue;
									}
									if (opcode == 3304) {
										isp--;
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = Static246.list(type).size;
										continue;
									}
									if (opcode == 3305) {
										isp--;
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = Static99.anIntArray240[type];
										continue;
									}
									if (opcode == 3306) {
										isp--;
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = Static141.anIntArray326[type];
										continue;
									}
									if (opcode == 3307) {
										isp--;
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = Static227.anIntArray446[type];
										continue;
									}
									if (opcode == 3308) {
										type = Static55.level;
										local803 = Static225.originX + (Static173.self.xFine >> 7);
										local1052 = (Static173.self.zFine >> 7) + Static142.originZ;
										Static254.intStack[isp++] = (type << 28) - (-(local803 << 14) - local1052);
										continue;
									}
									if (opcode == 3309) {
										isp--;
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = type >> 14 & 0x3FFF;
										continue;
									}
									if (opcode == 3310) {
										isp--;
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = type >> 28;
										continue;
									}
									if (opcode == 3311) {
										isp--;
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = type & 0x3FFF;
										continue;
									}
									if (opcode == 3312) {
										Static254.intStack[isp++] = Static2.aBoolean1 ? 1 : 0;
										continue;
									}
									if (opcode == 3313) {
										isp -= 2;
										type = Static254.intStack[isp] + 32768;
										local803 = Static254.intStack[isp + 1];
										Static254.intStack[isp++] = Static15.method484(type, local803);
										continue;
									}
									if (opcode == 3314) {
										isp -= 2;
										type = Static254.intStack[isp] + 32768;
										local803 = Static254.intStack[isp + 1];
										Static254.intStack[isp++] = Static23.method647(type, local803);
										continue;
									}
									if (opcode == 3315) {
										isp -= 2;
										type = Static254.intStack[isp] + 32768;
										local803 = Static254.intStack[isp + 1];
										Static254.intStack[isp++] = Static278.method4652(type, local803);
										continue;
									}
									if (opcode == 3316) {
										if (Static191.staffModLevel < 2) {
											Static254.intStack[isp++] = 0;
										} else {
											Static254.intStack[isp++] = Static191.staffModLevel;
										}
										continue;
									}
									if (opcode == 3317) {
										Static254.intStack[isp++] = Static60.rebootTimer;
										continue;
									}
									if (opcode == 3318) {
										Static254.intStack[isp++] = Static125.worldId;
										continue;
									}
									if (opcode == 3321) {
										Static254.intStack[isp++] = Static12.anInt400;
										continue;
									}
									if (opcode == 3322) {
										Static254.intStack[isp++] = Static251.anInt5456;
										continue;
									}
									if (opcode == 3323) {
										if (Static249.anInt5431 >= 5 && Static249.anInt5431 <= 9) {
											Static254.intStack[isp++] = 1;
											continue;
										}
										Static254.intStack[isp++] = 0;
										continue;
									}
									if (opcode == 3324) {
										if (Static249.anInt5431 >= 5 && Static249.anInt5431 <= 9) {
											Static254.intStack[isp++] = Static249.anInt5431;
											continue;
										}
										Static254.intStack[isp++] = 0;
										continue;
									}
									if (opcode == 3325) {
										Static254.intStack[isp++] = Static202.aBoolean233 ? 1 : 0;
										continue;
									}
									if (opcode == 3326) {
										Static254.intStack[isp++] = Static173.self.anInt1652;
										continue;
									}
									if (opcode == 3327) {
										Static254.intStack[isp++] = Static173.self.aClass59_1.aBoolean141 ? 1 : 0;
										continue;
									}
									if (opcode == 3328) {
										Static254.intStack[isp++] = Static124.aBoolean157 && !Static207.aBoolean236 ? 1 : 0;
										continue;
									}
									if (opcode == 3329) {
										Static254.intStack[isp++] = Static86.aBoolean129 ? 1 : 0;
										continue;
									}
									if (opcode == 3330) {
										isp--;
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = Static11.getFreeSpaces(type);
										continue;
									}
									if (opcode == 3331) {
										isp -= 2;
										local803 = Static254.intStack[isp + 1];
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = Static178.getTotalParam(false, type, local803);
										continue;
									}
									if (opcode == 3332) {
										isp -= 2;
										type = Static254.intStack[isp];
										local803 = Static254.intStack[isp + 1];
										Static254.intStack[isp++] = Static178.getTotalParam(true, type, local803);
										continue;
									}
									if (opcode == 3333) {
										Static254.intStack[isp++] = Static5.anInt39;
										continue;
									}
									if (opcode == 3335) {
										Static254.intStack[isp++] = Static141.language;
										continue;
									}
									if (opcode == 3336) {
										isp -= 4;
										local803 = Static254.intStack[isp + 1];
										type = Static254.intStack[isp];
										type += local803 << 14;
										local652 = Static254.intStack[isp + 3];
										local1052 = Static254.intStack[isp + 2];
										type += local1052 << 28;
										type += local652;
										Static254.intStack[isp++] = type;
										continue;
									}
									if (opcode == 3337) {
										Static254.intStack[isp++] = Static204.affiliate;
										continue;
									}
								} else if (opcode < 3500) {
									@Pc(3422) EnumType local3422;
									if (opcode == 3400) {
										isp -= 2;
										type = Static254.intStack[isp];
										local803 = Static254.intStack[isp + 1];
										local3422 = Static253.method4330(type);
										if (local3422.valueType == 115) {
										}
										Static3.stringStack[ssp++] = local3422.getString(local803);
										continue;
									}
									if (opcode == 3408) {
										isp -= 4;
										type = Static254.intStack[isp];
										local803 = Static254.intStack[isp + 1];
										local652 = Static254.intStack[isp + 3];
										local1052 = Static254.intStack[isp + 2];
										@Pc(3469) EnumType local3469 = Static253.method4330(local1052);
										if (local3469.keyType == type && local3469.valueType == local803) {
											if (local803 == 115) {
												Static3.stringStack[ssp++] = local3469.getString(local652);
											} else {
												Static254.intStack[isp++] = local3469.getInt(local652);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (opcode == 3409) {
										isp -= 3;
										local803 = Static254.intStack[isp + 1];
										local1052 = Static254.intStack[isp + 2];
										type = Static254.intStack[isp];
										if (local803 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(3549) EnumType local3549 = Static253.method4330(local803);
										if (local3549.valueType != type) {
											throw new RuntimeException("C3409-1");
										}
										Static254.intStack[isp++] = local3549.containsValue(local1052) ? 1 : 0;
										continue;
									}
									if (opcode == 3410) {
										isp--;
										type = Static254.intStack[isp];
										ssp--;
										local2522 = Static3.stringStack[ssp];
										if (type == -1) {
											throw new RuntimeException("C3410-2");
										}
										local3422 = Static253.method4330(type);
										if (local3422.valueType != 115) {
											throw new RuntimeException("C3410-1");
										}
										Static254.intStack[isp++] = local3422.containsValue(local2522) ? 1 : 0;
										continue;
									}
									if (opcode == 3411) {
										isp--;
										type = Static254.intStack[isp];
										@Pc(3645) EnumType local3645 = Static253.method4330(type);
										Static254.intStack[isp++] = local3645.table.method3864();
										continue;
									}
								} else if (opcode < 3700) {
									if (opcode == 3600) {
										if (Static166.anInt4054 == 0) {
											Static254.intStack[isp++] = -2;
										} else if (Static166.anInt4054 == 1) {
											Static254.intStack[isp++] = -1;
										} else {
											Static254.intStack[isp++] = Static9.anInt178;
										}
										continue;
									}
									if (opcode == 3601) {
										isp--;
										type = Static254.intStack[isp];
										if (Static166.anInt4054 == 2 && type < Static9.anInt178) {
											Static3.stringStack[ssp++] = Static122.aClass100Array92[type];
											continue;
										}
										Static3.stringStack[ssp++] = Static72.EMPTY_STRING;
										continue;
									}
									if (opcode == 3602) {
										isp--;
										type = Static254.intStack[isp];
										if (Static166.anInt4054 == 2 && Static9.anInt178 > type) {
											Static254.intStack[isp++] = Static104.anIntArray255[type];
											continue;
										}
										Static254.intStack[isp++] = 0;
										continue;
									}
									if (opcode == 3603) {
										isp--;
										type = Static254.intStack[isp];
										if (Static166.anInt4054 == 2 && Static9.anInt178 > type) {
											Static254.intStack[isp++] = Static106.anIntArray258[type];
											continue;
										}
										Static254.intStack[isp++] = 0;
										continue;
									}
									if (opcode == 3604) {
										isp--;
										local803 = Static254.intStack[isp];
										ssp--;
										string = Static3.stringStack[ssp];
										Static171.method3221(string, local803);
										continue;
									}
									if (opcode == 3605) {
										ssp--;
										string = Static3.stringStack[ssp];
										Static64.method1496(string.encode37());
										continue;
									}
									if (opcode == 3606) {
										ssp--;
										string = Static3.stringStack[ssp];
										Static193.method3500(string.encode37());
										continue;
									}
									if (opcode == 3607) {
										ssp--;
										string = Static3.stringStack[ssp];
										Static140.method2707(string.encode37());
										continue;
									}
									if (opcode == 3608) {
										ssp--;
										string = Static3.stringStack[ssp];
										Static69.method1542(string.encode37());
										continue;
									}
									if (opcode == 3609) {
										ssp--;
										string = Static3.stringStack[ssp];
										if (string.startsWith(Static72.aClass100_446) || string.startsWith(Static101.aClass100_537)) {
											string = string.substring(7);
										}
										Static254.intStack[isp++] = Static98.method1965(string) ? 1 : 0;
										continue;
									}
									if (opcode == 3610) {
										isp--;
										type = Static254.intStack[isp];
										if (Static166.anInt4054 == 2 && Static9.anInt178 > type) {
											Static3.stringStack[ssp++] = Static214.aClass100Array170[type];
											continue;
										}
										Static3.stringStack[ssp++] = Static72.EMPTY_STRING;
										continue;
									}
									if (opcode == 3611) {
										if (Static15.aClass100_87 == null) {
											Static3.stringStack[ssp++] = Static72.EMPTY_STRING;
										} else {
											Static3.stringStack[ssp++] = Static15.aClass100_87.method3125();
										}
										continue;
									}
									if (opcode == 3612) {
										if (Static15.aClass100_87 == null) {
											Static254.intStack[isp++] = 0;
										} else {
											Static254.intStack[isp++] = Static214.anInt5577;
										}
										continue;
									}
									if (opcode == 3613) {
										isp--;
										type = Static254.intStack[isp];
										if (Static15.aClass100_87 != null && Static214.anInt5577 > type) {
											Static3.stringStack[ssp++] = Static199.aClass3_Sub22Array1[type].aClass100_636.method3125();
											continue;
										}
										Static3.stringStack[ssp++] = Static72.EMPTY_STRING;
										continue;
									}
									if (opcode == 3614) {
										isp--;
										type = Static254.intStack[isp];
										if (Static15.aClass100_87 != null && type < Static214.anInt5577) {
											Static254.intStack[isp++] = Static199.aClass3_Sub22Array1[type].anInt3340;
											continue;
										}
										Static254.intStack[isp++] = 0;
										continue;
									}
									if (opcode == 3615) {
										isp--;
										type = Static254.intStack[isp];
										if (Static15.aClass100_87 != null && Static214.anInt5577 > type) {
											Static254.intStack[isp++] = Static199.aClass3_Sub22Array1[type].aByte9;
											continue;
										}
										Static254.intStack[isp++] = 0;
										continue;
									}
									if (opcode == 3616) {
										Static254.intStack[isp++] = Static50.aByte6;
										continue;
									}
									if (opcode == 3617) {
										ssp--;
										string = Static3.stringStack[ssp];
										Static178.method3318(string);
										continue;
									}
									if (opcode == 3618) {
										Static254.intStack[isp++] = Static160.aByte14;
										continue;
									}
									if (opcode == 3619) {
										ssp--;
										string = Static3.stringStack[ssp];
										Static156.method2956(string.encode37());
										continue;
									}
									if (opcode == 3620) {
										Static134.method2623();
										continue;
									}
									if (opcode == 3621) {
										if (Static166.anInt4054 == 0) {
											Static254.intStack[isp++] = -1;
										} else {
											Static254.intStack[isp++] = Static35.anInt1093;
										}
										continue;
									}
									if (opcode == 3622) {
										isp--;
										type = Static254.intStack[isp];
										if (Static166.anInt4054 != 0 && Static35.anInt1093 > type) {
											Static3.stringStack[ssp++] = Static79.decode37(Static190.aLongArray6[type]).method3125();
											continue;
										}
										Static3.stringStack[ssp++] = Static72.EMPTY_STRING;
										continue;
									}
									if (opcode == 3623) {
										ssp--;
										string = Static3.stringStack[ssp];
										if (string.startsWith(Static72.aClass100_446) || string.startsWith(Static101.aClass100_537)) {
											string = string.substring(7);
										}
										Static254.intStack[isp++] = Static238.method4144(string) ? 1 : 0;
										continue;
									}
									if (opcode == 3624) {
										isp--;
										type = Static254.intStack[isp];
										if (Static199.aClass3_Sub22Array1 != null && Static214.anInt5577 > type && Static199.aClass3_Sub22Array1[type].aClass100_636.method3111(Static173.self.aClass100_364)) {
											Static254.intStack[isp++] = 1;
											continue;
										}
										Static254.intStack[isp++] = 0;
										continue;
									}
									if (opcode == 3625) {
										if (Static270.aClass100_1094 == null) {
											Static3.stringStack[ssp++] = Static72.EMPTY_STRING;
										} else {
											Static3.stringStack[ssp++] = Static270.aClass100_1094.method3125();
										}
										continue;
									}
									if (opcode == 3626) {
										isp--;
										type = Static254.intStack[isp];
										if (Static15.aClass100_87 != null && Static214.anInt5577 > type) {
											Static3.stringStack[ssp++] = Static199.aClass3_Sub22Array1[type].aClass100_635;
											continue;
										}
										Static3.stringStack[ssp++] = Static72.EMPTY_STRING;
										continue;
									}
									if (opcode == 3627) {
										isp--;
										type = Static254.intStack[isp];
										if (Static166.anInt4054 == 2 && type >= 0 && type < Static9.anInt178) {
											Static254.intStack[isp++] = Static3.aBooleanArray135[type] ? 1 : 0;
											continue;
										}
										Static254.intStack[isp++] = 0;
										continue;
									}
									if (opcode == 3628) {
										ssp--;
										string = Static3.stringStack[ssp];
										if (string.startsWith(Static72.aClass100_446) || string.startsWith(Static101.aClass100_537)) {
											string = string.substring(7);
										}
										Static254.intStack[isp++] = Static4.method25(string);
										continue;
									}
									if (opcode == 3629) {
										Static254.intStack[isp++] = Static279.country;
										continue;
									}
								} else if (opcode < 4000) {
									if (opcode == 3903) {
										isp--;
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = Static229.aClass136Array1[type].method3905();
										continue;
									}
									if (opcode == 3904) {
										isp--;
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = Static229.aClass136Array1[type].anInt5094;
										continue;
									}
									if (opcode == 3905) {
										isp--;
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = Static229.aClass136Array1[type].anInt5099;
										continue;
									}
									if (opcode == 3906) {
										isp--;
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = Static229.aClass136Array1[type].anInt5090;
										continue;
									}
									if (opcode == 3907) {
										isp--;
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = Static229.aClass136Array1[type].anInt5089;
										continue;
									}
									if (opcode == 3908) {
										isp--;
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = Static229.aClass136Array1[type].anInt5092;
										continue;
									}
									if (opcode == 3910) {
										isp--;
										type = Static254.intStack[isp];
										local803 = Static229.aClass136Array1[type].method3904();
										Static254.intStack[isp++] = local803 == 0 ? 1 : 0;
										continue;
									}
									if (opcode == 3911) {
										isp--;
										type = Static254.intStack[isp];
										local803 = Static229.aClass136Array1[type].method3904();
										Static254.intStack[isp++] = local803 == 2 ? 1 : 0;
										continue;
									}
									if (opcode == 3912) {
										isp--;
										type = Static254.intStack[isp];
										local803 = Static229.aClass136Array1[type].method3904();
										Static254.intStack[isp++] = local803 == 5 ? 1 : 0;
										continue;
									}
									if (opcode == 3913) {
										isp--;
										type = Static254.intStack[isp];
										local803 = Static229.aClass136Array1[type].method3904();
										Static254.intStack[isp++] = local803 == 1 ? 1 : 0;
										continue;
									}
								} else if (opcode < 4100) {
									if (opcode == 4000) {
										isp -= 2;
										type = Static254.intStack[isp];
										local803 = Static254.intStack[isp + 1];
										Static254.intStack[isp++] = local803 + type;
										continue;
									}
									if (opcode == 4001) {
										isp -= 2;
										type = Static254.intStack[isp];
										local803 = Static254.intStack[isp + 1];
										Static254.intStack[isp++] = type - local803;
										continue;
									}
									if (opcode == 4002) {
										isp -= 2;
										type = Static254.intStack[isp];
										local803 = Static254.intStack[isp + 1];
										Static254.intStack[isp++] = local803 * type;
										continue;
									}
									if (opcode == 4003) {
										isp -= 2;
										type = Static254.intStack[isp];
										local803 = Static254.intStack[isp + 1];
										Static254.intStack[isp++] = type / local803;
										continue;
									}
									if (opcode == 4004) {
										isp--;
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = (int) ((double) type * Math.random());
										continue;
									}
									if (opcode == 4005) {
										isp--;
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = (int) (Math.random() * (double) (type + 1));
										continue;
									}
									if (opcode == 4006) {
										isp -= 5;
										type = Static254.intStack[isp];
										local803 = Static254.intStack[isp + 1];
										local652 = Static254.intStack[isp + 3];
										local1052 = Static254.intStack[isp + 2];
										c = Static254.intStack[isp + 4];
										Static254.intStack[isp++] = (local803 - type) * (c + -local1052) / (local652 - local1052) + type;
										continue;
									}
									@Pc(4899) long local4899;
									@Pc(4892) long local4892;
									if (opcode == 4007) {
										isp -= 2;
										local4892 = Static254.intStack[isp];
										local4899 = Static254.intStack[isp + 1];
										Static254.intStack[isp++] = (int) (local4892 * local4899 / 100L + local4892);
										continue;
									}
									if (opcode == 4008) {
										isp -= 2;
										type = Static254.intStack[isp];
										local803 = Static254.intStack[isp + 1];
										Static254.intStack[isp++] = type | 0x1 << local803;
										continue;
									}
									if (opcode == 4009) {
										isp -= 2;
										type = Static254.intStack[isp];
										local803 = Static254.intStack[isp + 1];
										Static254.intStack[isp++] = -(0x1 << local803) - 1 & type;
										continue;
									}
									if (opcode == 4010) {
										isp -= 2;
										type = Static254.intStack[isp];
										local803 = Static254.intStack[isp + 1];
										Static254.intStack[isp++] = (type & 0x1 << local803) == 0 ? 0 : 1;
										continue;
									}
									if (opcode == 4011) {
										isp -= 2;
										local803 = Static254.intStack[isp + 1];
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = type % local803;
										continue;
									}
									if (opcode == 4012) {
										isp -= 2;
										local803 = Static254.intStack[isp + 1];
										type = Static254.intStack[isp];
										if (type == 0) {
											Static254.intStack[isp++] = 0;
										} else {
											Static254.intStack[isp++] = (int) Math.pow((double) type, (double) local803);
										}
										continue;
									}
									if (opcode == 4013) {
										isp -= 2;
										local803 = Static254.intStack[isp + 1];
										type = Static254.intStack[isp];
										if (type == 0) {
											Static254.intStack[isp++] = 0;
										} else if (local803 == 0) {
											Static254.intStack[isp++] = Integer.MAX_VALUE;
										} else {
											Static254.intStack[isp++] = (int) Math.pow((double) type, 1.0D / (double) local803);
										}
										continue;
									}
									if (opcode == 4014) {
										isp -= 2;
										local803 = Static254.intStack[isp + 1];
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = local803 & type;
										continue;
									}
									if (opcode == 4015) {
										isp -= 2;
										type = Static254.intStack[isp];
										local803 = Static254.intStack[isp + 1];
										Static254.intStack[isp++] = type | local803;
										continue;
									}
									if (opcode == 4016) {
										isp -= 2;
										type = Static254.intStack[isp];
										local803 = Static254.intStack[isp + 1];
										Static254.intStack[isp++] = type < local803 ? type : local803;
										continue;
									}
									if (opcode == 4017) {
										isp -= 2;
										local803 = Static254.intStack[isp + 1];
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = local803 >= type ? local803 : type;
										continue;
									}
									if (opcode == 4018) {
										isp -= 3;
										local4892 = Static254.intStack[isp];
										local4899 = Static254.intStack[isp + 1];
										@Pc(5251) long local5251 = (long) Static254.intStack[isp + 2];
										Static254.intStack[isp++] = (int) (local4892 * local5251 / local4899);
										continue;
									}
								} else if (opcode >= 4200) {
									@Pc(5294) ParamType local5294;
									if (opcode < 4300) {
										if (opcode == 4200) {
											isp--;
											type = Static254.intStack[isp];
											Static3.stringStack[ssp++] = Static71.method1439(type).aClass100_495;
											continue;
										}
										@Pc(11269) ObjType local11269;
										if (opcode == 4201) {
											isp -= 2;
											type = Static254.intStack[isp];
											local803 = Static254.intStack[isp + 1];
											local11269 = Static71.method1439(type);
											if (local803 >= 1 && local803 <= 5 && local11269.aClass100Array72[local803 - 1] != null) {
												Static3.stringStack[ssp++] = local11269.aClass100Array72[local803 - 1];
												continue;
											}
											Static3.stringStack[ssp++] = Static72.EMPTY_STRING;
											continue;
										}
										if (opcode == 4202) {
											isp -= 2;
											type = Static254.intStack[isp];
											local803 = Static254.intStack[isp + 1];
											local11269 = Static71.method1439(type);
											if (local803 >= 1 && local803 <= 5 && local11269.aClass100Array71[local803 - 1] != null) {
												Static3.stringStack[ssp++] = local11269.aClass100Array71[local803 - 1];
												continue;
											}
											Static3.stringStack[ssp++] = Static72.EMPTY_STRING;
											continue;
										}
										if (opcode == 4203) {
											isp--;
											type = Static254.intStack[isp];
											Static254.intStack[isp++] = Static71.method1439(type).anInt2325;
											continue;
										}
										if (opcode == 4204) {
											isp--;
											type = Static254.intStack[isp];
											Static254.intStack[isp++] = Static71.method1439(type).anInt2336 == 1 ? 1 : 0;
											continue;
										}
										@Pc(11417) ObjType local11417;
										if (opcode == 4205) {
											isp--;
											type = Static254.intStack[isp];
											local11417 = Static71.method1439(type);
											if (local11417.anInt2358 == -1 && local11417.anInt2356 >= 0) {
												Static254.intStack[isp++] = local11417.anInt2356;
												continue;
											}
											Static254.intStack[isp++] = type;
											continue;
										}
										if (opcode == 4206) {
											isp--;
											type = Static254.intStack[isp];
											local11417 = Static71.method1439(type);
											if (local11417.anInt2358 >= 0 && local11417.anInt2356 >= 0) {
												Static254.intStack[isp++] = local11417.anInt2356;
												continue;
											}
											Static254.intStack[isp++] = type;
											continue;
										}
										if (opcode == 4207) {
											isp--;
											type = Static254.intStack[isp];
											Static254.intStack[isp++] = Static71.method1439(type).aBoolean131 ? 1 : 0;
											continue;
										}
										if (opcode == 4208) {
											isp -= 2;
											type = Static254.intStack[isp];
											local803 = Static254.intStack[isp + 1];
											local5294 = Static110.method2277(local803);
											if (local5294.method2078()) {
												Static3.stringStack[ssp++] = Static71.method1439(type).method1819(local5294.aClass100_544, local803);
											} else {
												Static254.intStack[isp++] = Static71.method1439(type).method1829(local5294.anInt2667, local803);
											}
											continue;
										}
										if (opcode == 4210) {
											ssp--;
											string = Static3.stringStack[ssp];
											isp--;
											local803 = Static254.intStack[isp];
											Static155.method2941(local803 == 1, string);
											Static254.intStack[isp++] = Static111.anInt2905;
											continue;
										}
										if (opcode == 4211) {
											if (Static169.aShortArray52 != null && Static67.anInt3356 < Static111.anInt2905) {
												Static254.intStack[isp++] = Static169.aShortArray52[Static67.anInt3356++] & 0xFFFF;
												continue;
											}
											Static254.intStack[isp++] = -1;
											continue;
										}
										if (opcode == 4212) {
											Static67.anInt3356 = 0;
											continue;
										}
									} else if (opcode < 4400) {
										if (opcode == 4300) {
											isp -= 2;
											type = Static254.intStack[isp];
											local803 = Static254.intStack[isp + 1];
											local5294 = Static110.method2277(local803);
											if (local5294.method2078()) {
												Static3.stringStack[ssp++] = Static214.method4363(type).method2938(local803, local5294.aClass100_544);
											} else {
												Static254.intStack[isp++] = Static214.method4363(type).method2936(local803, local5294.anInt2667);
											}
											continue;
										}
									} else if (opcode >= 4500) {
										if (opcode >= 4600) {
											if (opcode < 5100) {
												if (opcode == 5000) {
													Static254.intStack[isp++] = Static59.anInt1812;
													continue;
												}
												if (opcode == 5001) {
													isp -= 3;
													Static59.anInt1812 = Static254.intStack[isp];
													Static49.anInt1459 = Static254.intStack[isp + 1];
													Static84.anInt2256 = Static254.intStack[isp + 2];
													Static6.outboundBuffer.p1isaac(157);
													Static6.outboundBuffer.p1(Static59.anInt1812);
													Static6.outboundBuffer.p1(Static49.anInt1459);
													Static6.outboundBuffer.p1(Static84.anInt2256);
													continue;
												}
												if (opcode == 5002) {
													ssp--;
													string = Static3.stringStack[ssp];
													isp -= 2;
													local803 = Static254.intStack[isp];
													local1052 = Static254.intStack[isp + 1];
													Static6.outboundBuffer.p1isaac(99);
													Static6.outboundBuffer.p8(string.encode37());
													Static6.outboundBuffer.p1(local803 - 1);
													Static6.outboundBuffer.p1(local1052);
													continue;
												}
												if (opcode == 5003) {
													local2522 = null;
													isp--;
													type = Static254.intStack[isp];
													if (type < 100) {
														local2522 = Static230.aClass100Array158[type];
													}
													if (local2522 == null) {
														local2522 = Static72.EMPTY_STRING;
													}
													Static3.stringStack[ssp++] = local2522;
													continue;
												}
												if (opcode == 5004) {
													isp--;
													type = Static254.intStack[isp];
													local803 = -1;
													if (type < 100 && Static230.aClass100Array158[type] != null) {
														local803 = Static26.anIntArray67[type];
													}
													Static254.intStack[isp++] = local803;
													continue;
												}
												if (opcode == 5005) {
													Static254.intStack[isp++] = Static49.anInt1459;
													continue;
												}
												if (opcode == 5008) {
													ssp--;
													string = Static3.stringStack[ssp];
													if (!string.startsWith(Static12.aClass100_74)) {
														if (Static191.staffModLevel == 0 && (Static124.aBoolean157 && !Static207.aBoolean236 || Static86.aBoolean129)) {
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
														} else if (Static141.language != 0) {
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
														} else if (Static141.language != 0) {
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
														Static6.outboundBuffer.p1isaac(237);
														Static6.outboundBuffer.p1(0);
														c = Static6.outboundBuffer.offset;
														Static6.outboundBuffer.p1(local5555);
														Static6.outboundBuffer.p1(local5943);
														Static146.method2748(Static6.outboundBuffer, string);
														Static6.outboundBuffer.p1len(Static6.outboundBuffer.offset - c);
														continue;
													}
													Static127.method2470(string);
													continue;
												}
												if (opcode == 5009) {
													ssp -= 2;
													local2522 = Static3.stringStack[ssp + 1];
													string = Static3.stringStack[ssp];
													if (Static191.staffModLevel != 0 || (!Static124.aBoolean157 || Static207.aBoolean236) && !Static86.aBoolean129) {
														Static6.outboundBuffer.p1isaac(201);
														Static6.outboundBuffer.p1(0);
														local1052 = Static6.outboundBuffer.offset;
														Static6.outboundBuffer.p8(string.encode37());
														Static146.method2748(Static6.outboundBuffer, local2522);
														Static6.outboundBuffer.p1len(Static6.outboundBuffer.offset - local1052);
													}
													continue;
												}
												if (opcode == 5010) {
													isp--;
													type = Static254.intStack[isp];
													local2522 = null;
													if (type < 100) {
														local2522 = Static153.aClass100Array112[type];
													}
													if (local2522 == null) {
														local2522 = Static72.EMPTY_STRING;
													}
													Static3.stringStack[ssp++] = local2522;
													continue;
												}
												if (opcode == 5011) {
													isp--;
													type = Static254.intStack[isp];
													local2522 = null;
													if (type < 100) {
														local2522 = Static64.aClass100Array62[type];
													}
													if (local2522 == null) {
														local2522 = Static72.EMPTY_STRING;
													}
													Static3.stringStack[ssp++] = local2522;
													continue;
												}
												if (opcode == 5012) {
													isp--;
													type = Static254.intStack[isp];
													local803 = -1;
													if (type < 100) {
														local803 = Static241.anIntArray521[type];
													}
													Static254.intStack[isp++] = local803;
													continue;
												}
												if (opcode == 5015) {
													if (Static173.self == null || Static173.self.aClass100_364 == null) {
														string = Static186.username;
													} else {
														string = Static173.self.method1264();
													}
													Static3.stringStack[ssp++] = string;
													continue;
												}
												if (opcode == 5016) {
													Static254.intStack[isp++] = Static84.anInt2256;
													continue;
												}
												if (opcode == 5017) {
													Static254.intStack[isp++] = Static62.anInt1941;
													continue;
												}
												if (opcode == 5050) {
													isp--;
													type = Static254.intStack[isp];
													Static3.stringStack[ssp++] = Static235.method4045(type).aClass100_79;
													continue;
												}
												@Pc(6378) QuickChatCatType local6378;
												if (opcode == 5051) {
													isp--;
													type = Static254.intStack[isp];
													local6378 = Static235.method4045(type);
													if (local6378.anIntArray30 == null) {
														Static254.intStack[isp++] = 0;
													} else {
														Static254.intStack[isp++] = local6378.anIntArray30.length;
													}
													continue;
												}
												if (opcode == 5052) {
													isp -= 2;
													type = Static254.intStack[isp];
													local803 = Static254.intStack[isp + 1];
													@Pc(6416) QuickChatCatType local6416 = Static235.method4045(type);
													local652 = local6416.anIntArray30[local803];
													Static254.intStack[isp++] = local652;
													continue;
												}
												if (opcode == 5053) {
													isp--;
													type = Static254.intStack[isp];
													local6378 = Static235.method4045(type);
													if (local6378.anIntArray32 == null) {
														Static254.intStack[isp++] = 0;
													} else {
														Static254.intStack[isp++] = local6378.anIntArray32.length;
													}
													continue;
												}
												if (opcode == 5054) {
													isp -= 2;
													local803 = Static254.intStack[isp + 1];
													type = Static254.intStack[isp];
													Static254.intStack[isp++] = Static235.method4045(type).anIntArray32[local803];
													continue;
												}
												if (opcode == 5055) {
													isp--;
													type = Static254.intStack[isp];
													Static3.stringStack[ssp++] = Static230.method3953(type).method769();
													continue;
												}
												if (opcode == 5056) {
													isp--;
													type = Static254.intStack[isp];
													@Pc(6527) QuickChatPhraseType local6527 = Static230.method3953(type);
													if (local6527.anIntArray72 == null) {
														Static254.intStack[isp++] = 0;
													} else {
														Static254.intStack[isp++] = local6527.anIntArray72.length;
													}
													continue;
												}
												if (opcode == 5057) {
													isp -= 2;
													local803 = Static254.intStack[isp + 1];
													type = Static254.intStack[isp];
													Static254.intStack[isp++] = Static230.method3953(type).anIntArray72[local803];
													continue;
												}
												if (opcode == 5058) {
													Static122.aClass12_1 = new QuickChatPhrase();
													isp--;
													Static122.aClass12_1.anInt439 = Static254.intStack[isp];
													Static122.aClass12_1.aClass3_Sub2_Sub6_1 = Static230.method3953(Static122.aClass12_1.anInt439);
													Static122.aClass12_1.anIntArray33 = new int[Static122.aClass12_1.aClass3_Sub2_Sub6_1.method767()];
													continue;
												}
												if (opcode == 5059) {
													Static6.outboundBuffer.p1isaac(167);
													Static6.outboundBuffer.p1(0);
													type = Static6.outboundBuffer.offset;
													Static6.outboundBuffer.p1(0);
													Static6.outboundBuffer.p2(Static122.aClass12_1.anInt439);
													Static122.aClass12_1.aClass3_Sub2_Sub6_1.method760(Static6.outboundBuffer, Static122.aClass12_1.anIntArray33);
													Static6.outboundBuffer.p1len(Static6.outboundBuffer.offset - type);
													continue;
												}
												if (opcode == 5060) {
													ssp--;
													string = Static3.stringStack[ssp];
													Static6.outboundBuffer.p1isaac(178);
													Static6.outboundBuffer.p1(0);
													local803 = Static6.outboundBuffer.offset;
													Static6.outboundBuffer.p8(string.encode37());
													Static6.outboundBuffer.p2(Static122.aClass12_1.anInt439);
													Static122.aClass12_1.aClass3_Sub2_Sub6_1.method760(Static6.outboundBuffer, Static122.aClass12_1.anIntArray33);
													Static6.outboundBuffer.p1len(Static6.outboundBuffer.offset - local803);
													continue;
												}
												if (opcode == 5061) {
													Static6.outboundBuffer.p1isaac(167);
													Static6.outboundBuffer.p1(0);
													type = Static6.outboundBuffer.offset;
													Static6.outboundBuffer.p1(1);
													Static6.outboundBuffer.p2(Static122.aClass12_1.anInt439);
													Static122.aClass12_1.aClass3_Sub2_Sub6_1.method760(Static6.outboundBuffer, Static122.aClass12_1.anIntArray33);
													Static6.outboundBuffer.p1len(Static6.outboundBuffer.offset - type);
													continue;
												}
												if (opcode == 5062) {
													isp -= 2;
													local803 = Static254.intStack[isp + 1];
													type = Static254.intStack[isp];
													Static254.intStack[isp++] = Static235.method4045(type).anIntArray31[local803];
													continue;
												}
												if (opcode == 5063) {
													isp -= 2;
													local803 = Static254.intStack[isp + 1];
													type = Static254.intStack[isp];
													Static254.intStack[isp++] = Static235.method4045(type).anIntArray29[local803];
													continue;
												}
												if (opcode == 5064) {
													isp -= 2;
													local803 = Static254.intStack[isp + 1];
													type = Static254.intStack[isp];
													if (local803 == -1) {
														Static254.intStack[isp++] = -1;
													} else {
														Static254.intStack[isp++] = Static235.method4045(type).method469(local803);
													}
													continue;
												}
												if (opcode == 5065) {
													isp -= 2;
													type = Static254.intStack[isp];
													local803 = Static254.intStack[isp + 1];
													if (local803 == -1) {
														Static254.intStack[isp++] = -1;
													} else {
														Static254.intStack[isp++] = Static235.method4045(type).method466(local803);
													}
													continue;
												}
												if (opcode == 5066) {
													isp--;
													type = Static254.intStack[isp];
													Static254.intStack[isp++] = Static230.method3953(type).method767();
													continue;
												}
												if (opcode == 5067) {
													isp -= 2;
													local803 = Static254.intStack[isp + 1];
													type = Static254.intStack[isp];
													local1052 = Static230.method3953(type).method765(local803);
													Static254.intStack[isp++] = local1052;
													continue;
												}
												if (opcode == 5068) {
													isp -= 2;
													type = Static254.intStack[isp];
													local803 = Static254.intStack[isp + 1];
													Static122.aClass12_1.anIntArray33[type] = local803;
													continue;
												}
												if (opcode == 5069) {
													isp -= 2;
													type = Static254.intStack[isp];
													local803 = Static254.intStack[isp + 1];
													Static122.aClass12_1.anIntArray33[type] = local803;
													continue;
												}
												if (opcode == 5070) {
													isp -= 3;
													type = Static254.intStack[isp];
													local1052 = Static254.intStack[isp + 2];
													local803 = Static254.intStack[isp + 1];
													@Pc(6996) QuickChatPhraseType local6996 = Static230.method3953(type);
													if (local6996.method765(local803) != 0) {
														throw new RuntimeException("bad command");
													}
													Static254.intStack[isp++] = local6996.method764(local1052, local803);
													continue;
												}
												if (opcode == 5071) {
													ssp--;
													string = Static3.stringStack[ssp];
													isp--;
													local1552 = Static254.intStack[isp] == 1;
													Static24.method668(local1552, string);
													Static254.intStack[isp++] = Static111.anInt2905;
													continue;
												}
												if (opcode == 5072) {
													if (Static169.aShortArray52 != null && Static67.anInt3356 < Static111.anInt2905) {
														Static254.intStack[isp++] = Static169.aShortArray52[Static67.anInt3356++] & 0xFFFF;
														continue;
													}
													Static254.intStack[isp++] = -1;
													continue;
												}
												if (opcode == 5073) {
													Static67.anInt3356 = 0;
													continue;
												}
											} else if (opcode < 5200) {
												if (opcode == 5100) {
													if (Keyboard.pressedKeys[Keyboard.KEY_ALT]) {
														Static254.intStack[isp++] = 1;
													} else {
														Static254.intStack[isp++] = 0;
													}
													continue;
												}
												if (opcode == 5101) {
													if (Keyboard.pressedKeys[Keyboard.KEY_CTRL]) {
														Static254.intStack[isp++] = 1;
													} else {
														Static254.intStack[isp++] = 0;
													}
													continue;
												}
												if (opcode == 5102) {
													if (Keyboard.pressedKeys[Keyboard.KEY_SHIFT]) {
														Static254.intStack[isp++] = 1;
													} else {
														Static254.intStack[isp++] = 0;
													}
													continue;
												}
											} else {
												@Pc(7566) boolean local7566;
												if (opcode < 5300) {
													if (opcode == 5200) {
														isp--;
														Static155.method2940(Static254.intStack[isp]);
														continue;
													}
													if (opcode == 5201) {
														Static254.intStack[isp++] = Static91.method1874();
														continue;
													}
													if (opcode == 5202) {
														isp--;
														Static258.method4444(Static254.intStack[isp]);
														continue;
													}
													if (opcode == 5203) {
														ssp--;
														Static3.method4656(Static3.stringStack[ssp]);
														continue;
													}
													if (opcode == 5204) {
														Static3.stringStack[ssp - 1] = Static211.method923(Static3.stringStack[ssp - 1]);
														continue;
													}
													if (opcode == 5205) {
														ssp--;
														Static90.method1853(Static3.stringStack[ssp]);
														continue;
													}
													if (opcode == 5206) {
														isp--;
														type = Static254.intStack[isp];
														@Pc(7264) Map local7264 = Static29.method803(type >> 14 & 0x3FFF, type & 0x3FFF);
														if (local7264 == null) {
															Static3.stringStack[ssp++] = Static72.EMPTY_STRING;
														} else {
															Static3.stringStack[ssp++] = local7264.aClass100_138;
														}
														continue;
													}
													@Pc(7293) Map local7293;
													if (opcode == 5207) {
														ssp--;
														local7293 = Static124.method2434(Static3.stringStack[ssp]);
														if (local7293 != null && local7293.aClass100_137 != null) {
															Static3.stringStack[ssp++] = local7293.aClass100_137;
															continue;
														}
														Static3.stringStack[ssp++] = Static72.EMPTY_STRING;
														continue;
													}
													if (opcode == 5208) {
														Static254.intStack[isp++] = Static89.anInt2387;
														Static254.intStack[isp++] = Static37.anInt1176;
														continue;
													}
													if (opcode == 5209) {
														Static254.intStack[isp++] = Static158.anInt3846 + Static13.anInt435;
														Static254.intStack[isp++] = Static2.anInt13 + Static181.anInt4296 - Static28.anInt919 - 1;
														continue;
													}
													if (opcode == 5210) {
														local7293 = Static214.method4361();
														if (local7293 == null) {
															Static254.intStack[isp++] = 0;
															Static254.intStack[isp++] = 0;
														} else {
															Static254.intStack[isp++] = local7293.anInt769 * 64;
															Static254.intStack[isp++] = local7293.anInt764 * 64;
														}
														continue;
													}
													if (opcode == 5211) {
														local7293 = Static214.method4361();
														if (local7293 == null) {
															Static254.intStack[isp++] = 0;
															Static254.intStack[isp++] = 0;
														} else {
															Static254.intStack[isp++] = local7293.anInt770 - local7293.anInt763;
															Static254.intStack[isp++] = local7293.anInt758 - local7293.anInt771;
														}
														continue;
													}
													if (opcode == 5212) {
														type = Static118.method2352();
														local1052 = 0;
														if (type == -1) {
															local2522 = Static72.EMPTY_STRING;
														} else {
															local2522 = Static203.aClass134_1.aClass100Array153[type];
															local1052 = Static203.aClass134_1.method3894(type);
														}
														local2522 = local2522.method3140(Static67.aClass100_639, Static5.aClass100_10);
														Static3.stringStack[ssp++] = local2522;
														Static254.intStack[isp++] = local1052;
														continue;
													}
													if (opcode == 5213) {
														local1052 = 0;
														type = Static119.method2385();
														if (type == -1) {
															local2522 = Static72.EMPTY_STRING;
														} else {
															local2522 = Static203.aClass134_1.aClass100Array153[type];
															local1052 = Static203.aClass134_1.method3894(type);
														}
														local2522 = local2522.method3140(Static67.aClass100_639, Static5.aClass100_10);
														Static3.stringStack[ssp++] = local2522;
														Static254.intStack[isp++] = local1052;
														continue;
													}
													if (opcode == 5214) {
														isp--;
														type = Static254.intStack[isp];
														Static80.method3616(type >> 14 & 0x3FFF, type & 0x3FFF);
														continue;
													}
													if (opcode == 5215) {
														isp--;
														type = Static254.intStack[isp];
														ssp--;
														local2522 = Static3.stringStack[ssp];
														local7566 = false;
														@Pc(7577) SecondaryLinkedList local7577 = Static183.method3333(type >> 14 & 0x3FFF, type & 0x3FFF);
														for (@Pc(7582) Map local7582 = (Map) local7577.method795(); local7582 != null; local7582 = (Map) local7577.method797()) {
															if (local7582.aClass100_138.method3111(local2522)) {
																local7566 = true;
																break;
															}
														}
														if (local7566) {
															Static254.intStack[isp++] = 1;
														} else {
															Static254.intStack[isp++] = 0;
														}
														continue;
													}
													if (opcode == 5216) {
														isp--;
														type = Static254.intStack[isp];
														Static253.method4332(type);
														continue;
													}
													if (opcode == 5217) {
														isp--;
														type = Static254.intStack[isp];
														if (Static90.method1855(type)) {
															Static254.intStack[isp++] = 1;
														} else {
															Static254.intStack[isp++] = 0;
														}
														continue;
													}
													if (opcode == 5218) {
														local7293 = Static214.method4361();
														if (local7293 == null) {
															Static254.intStack[isp++] = -1;
														} else {
															Static254.intStack[isp++] = local7293.anInt772;
														}
														continue;
													}
													if (opcode == 5219) {
														ssp--;
														Static44.method1149(Static3.stringStack[ssp]);
														continue;
													}
													if (opcode == 5220) {
														Static254.intStack[isp++] = Static41.anInt1309 == 100 ? 1 : 0;
														continue;
													}
												} else if (opcode < 5400) {
													if (opcode == 5300) {
														isp -= 2;
														local803 = Static254.intStack[isp + 1];
														type = Static254.intStack[isp];
														Static241.setWindowMode(false, 3, type, local803);
														Static254.intStack[isp++] = GameShell.fullScreenFrame == null ? 0 : 1;
														continue;
													}
													if (opcode == 5301) {
														if (GameShell.fullScreenFrame != null) {
															Static241.setWindowMode(false, Static214.windowMode, -1, -1);
														}
														continue;
													}
													if (opcode == 5302) {
														@Pc(7780) Class114[] local7780 = Static3.method4660();
														Static254.intStack[isp++] = local7780.length;
														continue;
													}
													if (opcode == 5303) {
														isp--;
														type = Static254.intStack[isp];
														@Pc(7800) Class114[] local7800 = Static3.method4660();
														Static254.intStack[isp++] = local7800[type].anInt4248;
														Static254.intStack[isp++] = local7800[type].anInt4250;
														continue;
													}
													if (opcode == 5305) {
														local803 = Static22.anInt729;
														type = Static114.anInt5831;
														local1052 = -1;
														@Pc(7833) Class114[] local7833 = Static3.method4660();
														for (c = 0; c < local7833.length; c++) {
															@Pc(7843) Class114 local7843 = local7833[c];
															if (type == local7843.anInt4248 && local7843.anInt4250 == local803) {
																local1052 = c;
																break;
															}
														}
														Static254.intStack[isp++] = local1052;
														continue;
													}
													if (opcode == 5306) {
														Static254.intStack[isp++] = Static144.getWindowMode();
														continue;
													}
													if (opcode == 5307) {
														isp--;
														type = Static254.intStack[isp];
														if (type < 0 || type > 2) {
															type = 0;
														}
														Static241.setWindowMode(false, type, -1, -1);
														continue;
													}
													if (opcode == 5308) {
														Static254.intStack[isp++] = Static214.windowMode;
														continue;
													}
													if (opcode == 5309) {
														isp--;
														type = Static254.intStack[isp];
														if (type < 0 || type > 2) {
															type = 0;
														}
														Static214.windowMode = type;
														Static203.savePreferences(GameShell.signLink);
														continue;
													}
												} else if (opcode < 5500) {
													if (opcode == 5400) {
														ssp -= 2;
														string = Static3.stringStack[ssp];
														local2522 = Static3.stringStack[ssp + 1];
														isp--;
														local1052 = Static254.intStack[isp];
														Static6.outboundBuffer.p1isaac(117);
														Static6.outboundBuffer.p1(Static229.method3937(string) + Static229.method3937(local2522) + 1);
														Static6.outboundBuffer.pjstr(string);
														Static6.outboundBuffer.pjstr(local2522);
														Static6.outboundBuffer.p1(local1052);
														continue;
													}
													if (opcode == 5401) {
														isp -= 2;
														Static259.aShortArray88[Static254.intStack[isp]] = (short) Static105.method2253(Static254.intStack[isp + 1]);
														Static211.method924();
														Static269.clearObjectSpriteCache();
														Static278.method4649();
														Static11.method443();
														Static87.method1807();
														continue;
													}
													if (opcode == 5405) {
														isp -= 2;
														type = Static254.intStack[isp];
														local803 = Static254.intStack[isp + 1];
														if (type >= 0 && type < 2) {
															Static107.anIntArrayArrayArray9[type] = new int[local803 << 1][4];
														}
														continue;
													}
													if (opcode == 5406) {
														isp -= 7;
														type = Static254.intStack[isp];
														local803 = Static254.intStack[isp + 1] << 1;
														local652 = Static254.intStack[isp + 3];
														local1052 = Static254.intStack[isp + 2];
														c = Static254.intStack[isp + 4];
														@Pc(8108) int local8108 = Static254.intStack[isp + 6];
														local1087 = Static254.intStack[isp + 5];
														if (type >= 0 && type < 2 && Static107.anIntArrayArrayArray9[type] != null && local803 >= 0 && Static107.anIntArrayArrayArray9[type].length > local803) {
															Static107.anIntArrayArrayArray9[type][local803] = new int[] { (local1052 >> 14 & 0x3FFF) * 128, local652, (local1052 & 0x3FFF) * 128, local8108 };
															Static107.anIntArrayArrayArray9[type][local803 + 1] = new int[] { (c >> 14 & 0x3FFF) * 128, local1087, (c & 0x3FFF) * 128 };
														}
														continue;
													}
													if (opcode == 5407) {
														isp--;
														type = Static107.anIntArrayArrayArray9[Static254.intStack[isp]].length >> 1;
														Static254.intStack[isp++] = type;
														continue;
													}
													if (opcode == 5411) {
														if (GameShell.fullScreenFrame != null) {
															Static241.setWindowMode(false, Static214.windowMode, -1, -1);
														}
														if (GameShell.frame == null) {
															Static169.openUrl(Static15.method479(), false);
														} else {
															System.exit(0);
														}
														continue;
													}
													if (opcode == 5419) {
														string = Static72.EMPTY_STRING;
														if (Static232.aClass212_5 != null) {
															string = Static181.method3341(Static232.aClass212_5.intArg2);
															try {
																if (Static232.aClass212_5.result != null) {
																	@Pc(8281) byte[] local8281 = ((String) Static232.aClass212_5.result).getBytes("ISO-8859-1");
																	string = Static10.decodeString(local8281, local8281.length, 0);
																}
															} catch (@Pc(8290) UnsupportedEncodingException local8290) {
															}
														}
														Static3.stringStack[ssp++] = string;
														continue;
													}
													if (opcode == 5420) {
														Static254.intStack[isp++] = SignLink.anInt5928 == 3 ? 1 : 0;
														continue;
													}
													if (opcode == 5421) {
														if (GameShell.fullScreenFrame != null) {
															Static241.setWindowMode(false, Static214.windowMode, -1, -1);
														}
														isp--;
														local1552 = Static254.intStack[isp] == 1;
														ssp--;
														string = Static3.stringStack[ssp];
														@Pc(8356) JagString local8356 = Static34.concatenate(new JagString[] { Static15.method479(), string });
														if (GameShell.frame != null || local1552 && SignLink.anInt5928 != 3 && SignLink.osName.startsWith("win") && !Static178.haveIe6) {
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
														local1052 = Static254.intStack[isp];
														ssp -= 2;
														local2522 = Static3.stringStack[ssp + 1];
														string = Static3.stringStack[ssp];
														if (string.length() > 0) {
															if (Static103.aClass100Array88 == null) {
																Static103.aClass100Array88 = new JagString[Static132.anIntArray309[Static266.game]];
															}
															Static103.aClass100Array88[local1052] = string;
														}
														if (local2522.length() > 0) {
															if (Static263.aClass100Array174 == null) {
																Static263.aClass100Array174 = new JagString[Static132.anIntArray309[Static266.game]];
															}
															Static263.aClass100Array174[local1052] = local2522;
														}
														continue;
													}
													if (opcode == 5423) {
														ssp--;
														Static3.stringStack[ssp].method3129();
														continue;
													}
													if (opcode == 5424) {
														isp -= 11;
														Static40.anInt1275 = Static254.intStack[isp];
														Static111.anInt2910 = Static254.intStack[isp + 1];
														Static251.anInt5457 = Static254.intStack[isp + 2];
														Static232.anInt5208 = Static254.intStack[isp + 3];
														Static55.anInt1736 = Static254.intStack[isp + 4];
														Static169.anInt4073 = Static254.intStack[isp + 5];
														Static85.anInt2261 = Static254.intStack[isp + 6];
														Static136.anInt3324 = Static254.intStack[isp + 7];
														Static254.anInt5556 = Static254.intStack[isp + 8];
														Static195.anInt4581 = Static254.intStack[isp + 9];
														Static262.anInt5752 = Static254.intStack[isp + 10];
														Static209.js5Archive8.isFileReady(Static55.anInt1736);
														Static209.js5Archive8.isFileReady(Static169.anInt4073);
														Static209.js5Archive8.isFileReady(Static85.anInt2261);
														Static209.js5Archive8.isFileReady(Static136.anInt3324);
														Static209.js5Archive8.isFileReady(Static254.anInt5556);
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
														Static270.anInt5794 = Static254.intStack[isp];
														continue;
													}
													if (opcode == 5427) {
														isp -= 2;
														Static169.anInt4075 = Static254.intStack[isp];
														Static225.anInt5073 = Static254.intStack[isp + 1];
														continue;
													}
												} else if (opcode < 5600) {
													if (opcode == 5500) {
														isp -= 4;
														type = Static254.intStack[isp];
														local652 = Static254.intStack[isp + 3];
														local1052 = Static254.intStack[isp + 2];
														local803 = Static254.intStack[isp + 1];
														Static141.method2722(false, local1052, local803, local652, (type & 0x3FFF) - Static142.originZ, (type >> 14 & 0x3FFF) - Static225.originX);
														continue;
													}
													if (opcode == 5501) {
														isp -= 4;
														local803 = Static254.intStack[isp + 1];
														type = Static254.intStack[isp];
														local652 = Static254.intStack[isp + 3];
														local1052 = Static254.intStack[isp + 2];
														Static260.method3849(local803, (type & 0x3FFF) - Static142.originZ, local1052, (type >> 14 & 0x3FFF) - Static225.originX, local652);
														continue;
													}
													if (opcode == 5502) {
														isp -= 6;
														type = Static254.intStack[isp];
														if (type >= 2) {
															throw new RuntimeException();
														}
														Static155.anInt3718 = type;
														local803 = Static254.intStack[isp + 1];
														if (Static107.anIntArrayArrayArray9[Static155.anInt3718].length >> 1 <= local803 + 1) {
															throw new RuntimeException();
														}
														Static127.anInt3125 = local803;
														Static233.anInt5224 = 0;
														Static228.anInt5101 = Static254.intStack[isp + 2];
														Static114.anInt5843 = Static254.intStack[isp + 3];
														local1052 = Static254.intStack[isp + 4];
														if (local1052 >= 2) {
															throw new RuntimeException();
														}
														Static52.anInt1694 = local1052;
														local652 = Static254.intStack[isp + 5];
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
														Camera.pitchTarget = Static254.intStack[isp];
														Camera.yawTarget = Static254.intStack[isp + 1];
														if (Static227.cameraType == 2) {
															Static184.cameraYaw = Camera.getYaw();
															Static240.cameraPitch = Camera.getPitch();
														}
														Camera.clampCameraAngle();
														continue;
													}
													if (opcode == 5505) {
														Static254.intStack[isp++] = Camera.getPitch();
														continue;
													}
													if (opcode == 5506) {
														Static254.intStack[isp++] = Camera.getYaw();
														continue;
													}
												} else if (opcode < 5700) {
													if (opcode == 5600) {
														ssp -= 2;
														string = Static3.stringStack[ssp];
														local2522 = Static3.stringStack[ssp + 1];
														isp--;
														local1052 = Static254.intStack[isp];
														if (Static244.gameState == 10 && Static219.anInt4937 == 0 && Static184.loginStep == 0 && Static179.accountCreationStep == 0 && Static82.anInt2231 == 0) {
															Static225.method3896(string, local2522, local1052);
														}
														continue;
													}
													if (opcode == 5601) {
														Static185.method3395();
														continue;
													}
													if (opcode == 5602) {
														if (Static184.loginStep == 0) {
															Static266.reply = -2;
														}
														continue;
													}
													if (opcode == 5603) {
														isp -= 4;
														if (Static244.gameState == 10 && Static219.anInt4937 == 0 && Static184.loginStep == 0 && Static179.accountCreationStep == 0 && Static82.anInt2231 == 0) {
															Static125.method2448(Static254.intStack[isp + 2], Static254.intStack[isp + 3], Static254.intStack[isp], Static254.intStack[isp + 1]);
														}
														continue;
													}
													if (opcode == 5604) {
														ssp--;
														if (Static244.gameState == 10 && Static219.anInt4937 == 0 && Static184.loginStep == 0 && Static179.accountCreationStep == 0 && Static82.anInt2231 == 0) {
															Static78.method1691(Static3.stringStack[ssp].encode37());
														}
														continue;
													}
													if (opcode == 5605) {
														isp -= 4;
														ssp -= 2;
														if (Static244.gameState == 10 && Static219.anInt4937 == 0 && Static184.loginStep == 0 && Static179.accountCreationStep == 0 && Static82.anInt2231 == 0) {
															Static40.method1016(Static254.intStack[isp], Static254.intStack[isp + 3], Static254.intStack[isp + 1], Static3.stringStack[ssp + 1], Static3.stringStack[ssp].encode37(), Static254.intStack[isp + 2]);
														}
														continue;
													}
													if (opcode == 5606) {
														if (Static179.accountCreationStep == 0) {
															Static223.anInt5034 = -2;
														}
														continue;
													}
													if (opcode == 5607) {
														Static254.intStack[isp++] = Static266.reply;
														continue;
													}
													if (opcode == 5608) {
														Static254.intStack[isp++] = Static231.anInt5202;
														continue;
													}
													if (opcode == 5609) {
														Static254.intStack[isp++] = Static223.anInt5034;
														continue;
													}
													if (opcode == 5610) {
														for (type = 0; type < 5; type++) {
															Static3.stringStack[ssp++] = Static229.aClass100Array156.length > type ? Static229.aClass100Array156[type].method3125() : Static72.EMPTY_STRING;
														}
														Static229.aClass100Array156 = null;
														continue;
													}
													if (opcode == 5611) {
														Static254.intStack[isp++] = Static204.anInt4765;
														continue;
													}
												} else if (opcode < 6100) {
													if (opcode == 6001) {
														isp--;
														type = Static254.intStack[isp];
														if (type < 1) {
															type = 1;
														}
														if (type > 4) {
															type = 4;
														}
														Static113.brightness = type;
														if (!GlRenderer.enabled || !Static178.highDetailLighting) {
															if (Static113.brightness == 1) {
																Rasteriser.setBrightness(0.9F);
															}
															if (Static113.brightness == 2) {
																Rasteriser.setBrightness(0.8F);
															}
															if (Static113.brightness == 3) {
																Rasteriser.setBrightness(0.7F);
															}
															if (Static113.brightness == 4) {
																Rasteriser.setBrightness(0.6F);
															}
														}
														if (GlRenderer.enabled) {
															Static86.setInstantFade();
															if (!Static178.highDetailLighting) {
																Static145.method2742();
															}
														}
														Static269.clearObjectSpriteCache();
														Static203.savePreferences(GameShell.signLink);
														Static18.serverUpdatedPreferences = false;
														continue;
													}
													if (opcode == 6002) {
														isp--;
														Static53.setAllVisibleLevels(Static254.intStack[isp] == 1);
														Static90.clearLocCache();
														Static145.method2742();
														Static269.method2218();
														Static203.savePreferences(GameShell.signLink);
														Static18.serverUpdatedPreferences = false;
														continue;
													}
													if (opcode == 6003) {
														isp--;
														Static80.removeRoofsSelectively = Static254.intStack[isp] == 1;
														Static269.method2218();
														Static203.savePreferences(GameShell.signLink);
														Static18.serverUpdatedPreferences = false;
														continue;
													}
													if (opcode == 6005) {
														isp--;
														Static250.showGroundDecorations = Static254.intStack[isp] == 1;
														Static145.method2742();
														Static203.savePreferences(GameShell.signLink);
														Static18.serverUpdatedPreferences = false;
														continue;
													}
													if (opcode == 6006) {
														isp--;
														Static53.highDetailTextures = Static254.intStack[isp] == 1;
														((Js5GlTextureProvider) Rasteriser.textureProvider).method3245(!Static53.highDetailTextures);
														Static203.savePreferences(GameShell.signLink);
														Static18.serverUpdatedPreferences = false;
														continue;
													}
													if (opcode == 6007) {
														isp--;
														Static15.manyIdleAnimations = Static254.intStack[isp] == 1;
														Static203.savePreferences(GameShell.signLink);
														Static18.serverUpdatedPreferences = false;
														continue;
													}
													if (opcode == 6008) {
														isp--;
														Static11.flickeringEffectsOn = Static254.intStack[isp] == 1;
														Static203.savePreferences(GameShell.signLink);
														Static18.serverUpdatedPreferences = false;
														continue;
													}
													if (opcode == 6009) {
														isp--;
														Static159.manyGroundTextures = Static254.intStack[isp] == 1;
														Static203.savePreferences(GameShell.signLink);
														Static18.serverUpdatedPreferences = false;
														continue;
													}
													if (opcode == 6010) {
														isp--;
														Static209.characterShadowsOn = Static254.intStack[isp] == 1;
														Static203.savePreferences(GameShell.signLink);
														Static18.serverUpdatedPreferences = false;
														continue;
													}
													if (opcode == 6011) {
														isp--;
														type = Static254.intStack[isp];
														if (type < 0 || type > 2) {
															type = 0;
														}
														Static139.sceneryShadowsType = type;
														Static203.savePreferences(GameShell.signLink);
														Static18.serverUpdatedPreferences = false;
														continue;
													}
													if (opcode == 6012) {
														if (GlRenderer.enabled) {
															Static27.setMaterial(0, 0);
														}
														isp--;
														Static178.highDetailLighting = Static254.intStack[isp] == 1;
														if (GlRenderer.enabled && Static178.highDetailLighting) {
															Rasteriser.setBrightness(0.7F);
														} else {
															if (Static113.brightness == 1) {
																Rasteriser.setBrightness(0.9F);
															}
															if (Static113.brightness == 2) {
																Rasteriser.setBrightness(0.8F);
															}
															if (Static113.brightness == 3) {
																Rasteriser.setBrightness(0.7F);
															}
															if (Static113.brightness == 4) {
																Rasteriser.setBrightness(0.6F);
															}
														}
														Static145.method2742();
														Static203.savePreferences(GameShell.signLink);
														Static18.serverUpdatedPreferences = false;
														continue;
													}
													if (opcode == 6014) {
														isp--;
														Static220.highWaterDetail = Static254.intStack[isp] == 1;
														if (GlRenderer.enabled) {
															Static145.method2742();
														}
														Static203.savePreferences(GameShell.signLink);
														Static18.serverUpdatedPreferences = false;
														continue;
													}
													if (opcode == 6015) {
														isp--;
														Static71.fogEnabled = Static254.intStack[isp] == 1;
														if (GlRenderer.enabled) {
															Static86.setInstantFade();
														}
														Static203.savePreferences(GameShell.signLink);
														Static18.serverUpdatedPreferences = false;
														continue;
													}
													if (opcode == 6016) {
														isp--;
														type = Static254.intStack[isp];
														if (GlRenderer.enabled) {
															GameShell.replaceCanvas = true;
														}
														if (type < 0 || type > 2) {
															type = 0;
														}
														Static186.antiAliasingMode = type;
														continue;
													}
													if (opcode == 6017) {
														isp--;
														Static99.stereo = Static254.intStack[isp] == 1;
														Static211.method930();
														Static203.savePreferences(GameShell.signLink);
														Static18.serverUpdatedPreferences = false;
														continue;
													}
													if (opcode == 6018) {
														isp--;
														type = Static254.intStack[isp];
														if (type < 0) {
															type = 0;
														}
														if (type > 127) {
															type = 127;
														}
														Static125.soundEffectVolume = type;
														Static203.savePreferences(GameShell.signLink);
														Static18.serverUpdatedPreferences = false;
														continue;
													}
													if (opcode == 6019) {
														isp--;
														type = Static254.intStack[isp];
														if (type < 0) {
															type = 0;
														}
														if (type > 255) {
															type = 255;
														}
														if (type != Static12.musicVolume) {
															if (Static12.musicVolume == 0 && Static221.anInt4363 != -1) {
																Static122.method2410(Static130.js5Archive6, Static221.anInt4363, type);
																Static144.aBoolean173 = false;
															} else if (type == 0) {
																Static241.method4548();
																Static144.aBoolean173 = false;
															} else {
																Static230.method3956(type);
															}
															Static12.musicVolume = type;
														}
														Static203.savePreferences(GameShell.signLink);
														Static18.serverUpdatedPreferences = false;
														continue;
													}
													if (opcode == 6020) {
														isp--;
														type = Static254.intStack[isp];
														if (type < 0) {
															type = 0;
														}
														if (type > 127) {
															type = 127;
														}
														Static30.ambientSoundsVolume = type;
														Static203.savePreferences(GameShell.signLink);
														Static18.serverUpdatedPreferences = false;
														continue;
													}
													if (opcode == 6021) {
														isp--;
														Static127.neverRemoveRoofs = Static254.intStack[isp] == 1;
														Static269.method2218();
														continue;
													}
													if (opcode == 6023) {
														isp--;
														type = Static254.intStack[isp];
														if (type < 0) {
															type = 0;
														}
														if (type > 2) {
															type = 2;
														}
														local1552 = false;
														if (GameShell.maxMemory < 96) {
															local1552 = true;
															type = 0;
														}
														Static76.setParticles(type);
														Static203.savePreferences(GameShell.signLink);
														Static18.serverUpdatedPreferences = false;
														Static254.intStack[isp++] = local1552 ? 0 : 1;
														continue;
													}
													if (opcode == 6024) {
														isp--;
														type = Static254.intStack[isp];
														if (type < 0 || type > 2) {
															type = 0;
														}
														Static102.windowMode = type;
														Static203.savePreferences(GameShell.signLink);
														continue;
													}
													if (opcode == 6028) {
														isp--;
														Static64.cursorsEnabled = Static254.intStack[isp] != 0;
														Static203.savePreferences(GameShell.signLink);
														continue;
													}
												} else if (opcode < 6200) {
													if (opcode == 6101) {
														Static254.intStack[isp++] = Static113.brightness;
														continue;
													}
													if (opcode == 6102) {
														Static254.intStack[isp++] = Static138.allLevelsAreVisible() ? 1 : 0;
														continue;
													}
													if (opcode == 6103) {
														Static254.intStack[isp++] = Static80.removeRoofsSelectively ? 1 : 0;
														continue;
													}
													if (opcode == 6105) {
														Static254.intStack[isp++] = Static250.showGroundDecorations ? 1 : 0;
														continue;
													}
													if (opcode == 6106) {
														Static254.intStack[isp++] = Static53.highDetailTextures ? 1 : 0;
														continue;
													}
													if (opcode == 6107) {
														Static254.intStack[isp++] = Static15.manyIdleAnimations ? 1 : 0;
														continue;
													}
													if (opcode == 6108) {
														Static254.intStack[isp++] = Static11.flickeringEffectsOn ? 1 : 0;
														continue;
													}
													if (opcode == 6109) {
														Static254.intStack[isp++] = Static159.manyGroundTextures ? 1 : 0;
														continue;
													}
													if (opcode == 6110) {
														Static254.intStack[isp++] = Static209.characterShadowsOn ? 1 : 0;
														continue;
													}
													if (opcode == 6111) {
														Static254.intStack[isp++] = Static139.sceneryShadowsType;
														continue;
													}
													if (opcode == 6112) {
														Static254.intStack[isp++] = Static178.highDetailLighting ? 1 : 0;
														continue;
													}
													if (opcode == 6114) {
														Static254.intStack[isp++] = Static220.highWaterDetail ? 1 : 0;
														continue;
													}
													if (opcode == 6115) {
														Static254.intStack[isp++] = Static71.fogEnabled ? 1 : 0;
														continue;
													}
													if (opcode == 6116) {
														Static254.intStack[isp++] = Static186.antiAliasingMode;
														continue;
													}
													if (opcode == 6117) {
														Static254.intStack[isp++] = Static99.stereo ? 1 : 0;
														continue;
													}
													if (opcode == 6118) {
														Static254.intStack[isp++] = Static125.soundEffectVolume;
														continue;
													}
													if (opcode == 6119) {
														Static254.intStack[isp++] = Static12.musicVolume;
														continue;
													}
													if (opcode == 6120) {
														Static254.intStack[isp++] = Static30.ambientSoundsVolume;
														continue;
													}
													if (opcode == 6121) {
														if (GlRenderer.enabled) {
															Static254.intStack[isp++] = GlRenderer.arbMultisampleSupported ? 1 : 0;
														} else {
															Static254.intStack[isp++] = 0;
														}
														continue;
													}
													if (opcode == 6123) {
														Static254.intStack[isp++] = Static76.getParticleSetting();
														continue;
													}
													if (opcode == 6124) {
														Static254.intStack[isp++] = Static102.windowMode;
														continue;
													}
													if (opcode == 6128) {
														Static254.intStack[isp++] = Static64.cursorsEnabled ? 1 : 0;
														continue;
													}
												} else if (opcode < 6300) {
													if (opcode == 6200) {
														isp -= 2;
														Static178.aShort25 = (short) Static254.intStack[isp];
														if (Static178.aShort25 <= 0) {
															Static178.aShort25 = 256;
														}
														Static10.aShort9 = (short) Static254.intStack[isp + 1];
														if (Static10.aShort9 <= 0) {
															Static10.aShort9 = 205;
														}
														continue;
													}
													if (opcode == 6201) {
														isp -= 2;
														Static263.aShort30 = (short) Static254.intStack[isp];
														if (Static263.aShort30 <= 0) {
															Static263.aShort30 = 256;
														}
														Static187.aShort27 = (short) Static254.intStack[isp + 1];
														if (Static187.aShort27 <= 0) {
															Static187.aShort27 = 320;
														}
														continue;
													}
													if (opcode == 6202) {
														isp -= 4;
														Static153.aShort22 = (short) Static254.intStack[isp];
														if (Static153.aShort22 <= 0) {
															Static153.aShort22 = 1;
														}
														Static4.aShort1 = (short) Static254.intStack[isp + 1];
														if (Static4.aShort1 <= 0) {
															Static4.aShort1 = 32767;
														} else if (Static153.aShort22 > Static4.aShort1) {
															Static4.aShort1 = Static153.aShort22;
														}
														Static55.aShort12 = (short) Static254.intStack[isp + 2];
														if (Static55.aShort12 <= 0) {
															Static55.aShort12 = 1;
														}
														Static131.aShort21 = (short) Static254.intStack[isp + 3];
														if (Static131.aShort21 <= 0) {
															Static131.aShort21 = 32767;
														} else if (Static131.aShort21 < Static55.aShort12) {
															Static131.aShort21 = Static55.aShort12;
														}
														continue;
													}
													if (opcode == 6203) {
														Static115.method2314(Static280.aClass13_26.anInt445, 0, Static280.aClass13_26.anInt459, 0, false);
														Static254.intStack[isp++] = Static166.anInt4055;
														Static254.intStack[isp++] = Static245.anInt5377;
														continue;
													}
													if (opcode == 6204) {
														Static254.intStack[isp++] = Static263.aShort30;
														Static254.intStack[isp++] = Static187.aShort27;
														continue;
													}
													if (opcode == 6205) {
														Static254.intStack[isp++] = Static178.aShort25;
														Static254.intStack[isp++] = Static10.aShort9;
														continue;
													}
												} else if (opcode < 6400) {
													if (opcode == 6300) {
														Static254.intStack[isp++] = (int) (MonotonicClock.currentTimeMillis() / 60000L);
														continue;
													}
													if (opcode == 6301) {
														Static254.intStack[isp++] = (int) (MonotonicClock.currentTimeMillis() / 86400000L) - 11745;
														continue;
													}
													if (opcode == 6302) {
														isp -= 3;
														local1052 = Static254.intStack[isp + 2];
														local803 = Static254.intStack[isp + 1];
														type = Static254.intStack[isp];
														Static102.aCalendar2.clear();
														Static102.aCalendar2.set(11, 12);
														Static102.aCalendar2.set(local1052, local803, type);
														Static254.intStack[isp++] = (int) (Static102.aCalendar2.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (opcode == 6303) {
														Static102.aCalendar2.clear();
														Static102.aCalendar2.setTime(new Date(MonotonicClock.currentTimeMillis()));
														Static254.intStack[isp++] = Static102.aCalendar2.get(1);
														continue;
													}
													if (opcode == 6304) {
														local1552 = true;
														isp--;
														type = Static254.intStack[isp];
														if (type < 0) {
															local1552 = (type + 1) % 4 == 0;
														} else if (type < 1582) {
															local1552 = type % 4 == 0;
														} else if (type % 4 != 0) {
															local1552 = false;
														} else if (type % 100 != 0) {
															local1552 = true;
														} else if (type % 400 != 0) {
															local1552 = false;
														}
														Static254.intStack[isp++] = local1552 ? 1 : 0;
														continue;
													}
												} else if (opcode < 6500) {
													if (opcode == 6405) {
														Static254.intStack[isp++] = Static87.showVideoAd() ? 1 : 0;
														continue;
													}
													if (opcode == 6406) {
														Static254.intStack[isp++] = Static267.isShowingVideoAd() ? 1 : 0;
														continue;
													}
												} else if (opcode < 6600) {
													if (opcode == 6500) {
														if (Static244.gameState == 10 && Static219.anInt4937 == 0 && Static184.loginStep == 0 && Static179.accountCreationStep == 0) {
															Static254.intStack[isp++] = Static207.fetch() == -1 ? 0 : 1;
															continue;
														}
														Static254.intStack[isp++] = 1;
														continue;
													}
													@Pc(10247) Class32 local10247;
													@Pc(10191) World world;
													if (opcode == 6501) {
														world = Static18.getFirstWorld();
														if (world == null) {
															Static254.intStack[isp++] = -1;
															Static254.intStack[isp++] = 0;
															Static3.stringStack[ssp++] = Static72.EMPTY_STRING;
															Static254.intStack[isp++] = 0;
															Static3.stringStack[ssp++] = Static72.EMPTY_STRING;
															Static254.intStack[isp++] = 0;
														} else {
															Static254.intStack[isp++] = world.anInt382;
															Static254.intStack[isp++] = world.flags;
															Static3.stringStack[ssp++] = world.aClass100_69;
															local10247 = world.getWorldInfo();
															Static254.intStack[isp++] = local10247.anInt1739;
															Static3.stringStack[ssp++] = local10247.aClass100_378;
															Static254.intStack[isp++] = world.players;
														}
														continue;
													}
													if (opcode == 6502) {
														world = getNextWorld();
														if (world == null) {
															Static254.intStack[isp++] = -1;
															Static254.intStack[isp++] = 0;
															Static3.stringStack[ssp++] = Static72.EMPTY_STRING;
															Static254.intStack[isp++] = 0;
															Static3.stringStack[ssp++] = Static72.EMPTY_STRING;
															Static254.intStack[isp++] = 0;
														} else {
															Static254.intStack[isp++] = world.anInt382;
															Static254.intStack[isp++] = world.flags;
															Static3.stringStack[ssp++] = world.aClass100_69;
															local10247 = world.getWorldInfo();
															Static254.intStack[isp++] = local10247.anInt1739;
															Static3.stringStack[ssp++] = local10247.aClass100_378;
															Static254.intStack[isp++] = world.players;
														}
														continue;
													}
													if (opcode == 6503) {
														isp--;
														type = Static254.intStack[isp];
														if (Static244.gameState == 10 && Static219.anInt4937 == 0 && Static184.loginStep == 0 && Static179.accountCreationStep == 0) {
															Static254.intStack[isp++] = Static176.hopWorld(type) ? 1 : 0;
															continue;
														}
														Static254.intStack[isp++] = 0;
														continue;
													}
													if (opcode == 6504) {
														isp--;
														Static164.lastWorldId = Static254.intStack[isp];
														Static203.savePreferences(GameShell.signLink);
														continue;
													}
													if (opcode == 6505) {
														Static254.intStack[isp++] = Static164.lastWorldId;
														continue;
													}
													if (opcode == 6506) {
														isp--;
														type = Static254.intStack[isp];
														@Pc(10440) World local10440 = Static54.getWorld(type);
														if (local10440 == null) {
															Static254.intStack[isp++] = -1;
															Static3.stringStack[ssp++] = Static72.EMPTY_STRING;
															Static254.intStack[isp++] = 0;
															Static3.stringStack[ssp++] = Static72.EMPTY_STRING;
															Static254.intStack[isp++] = 0;
														} else {
															Static254.intStack[isp++] = local10440.flags;
															Static3.stringStack[ssp++] = local10440.aClass100_69;
															@Pc(10458) Class32 local10458 = local10440.getWorldInfo();
															Static254.intStack[isp++] = local10458.anInt1739;
															Static3.stringStack[ssp++] = local10458.aClass100_378;
															Static254.intStack[isp++] = local10440.players;
														}
														continue;
													}
													if (opcode == 6507) {
														isp -= 4;
														local1052 = Static254.intStack[isp + 2];
														type = Static254.intStack[isp];
														local7566 = Static254.intStack[isp + 3] == 1;
														local1552 = Static254.intStack[isp + 1] == 1;
														Static228.sortWorldList(local1052, local1552, type, local7566);
														continue;
													}
												} else if (opcode < 6700) {
													if (opcode == 6600) {
														isp--;
														Static33.aBoolean63 = Static254.intStack[isp] == 1;
														Static203.savePreferences(GameShell.signLink);
														continue;
													}
													if (opcode == 6601) {
														Static254.intStack[isp++] = Static33.aBoolean63 ? 1 : 0;
														continue;
													}
												}
											}
										} else if (opcode == 4500) {
											isp -= 2;
											type = Static254.intStack[isp];
											local803 = Static254.intStack[isp + 1];
											local5294 = Static110.method2277(local803);
											if (local5294.method2078()) {
												Static3.stringStack[ssp++] = Static123.method2417(type).method2802(local5294.aClass100_544, local803);
											} else {
												Static254.intStack[isp++] = Static123.method2417(type).method2798(local803, local5294.anInt2667);
											}
											continue;
										}
									} else if (opcode == 4400) {
										isp -= 2;
										local803 = Static254.intStack[isp + 1];
										type = Static254.intStack[isp];
										local5294 = Static110.method2277(local803);
										if (local5294.method2078()) {
											Static3.stringStack[ssp++] = Static271.method4601(type).method3430(local5294.aClass100_544, local803);
										} else {
											Static254.intStack[isp++] = Static271.method4601(type).method3423(local5294.anInt2667, local803);
										}
										continue;
									}
								} else {
									if (opcode == 4100) {
										ssp--;
										string = Static3.stringStack[ssp];
										isp--;
										local803 = Static254.intStack[isp];
										Static3.stringStack[ssp++] = Static34.concatenate(new JagString[] { string, Static123.parseInt(local803) });
										continue;
									}
									if (opcode == 4101) {
										ssp -= 2;
										local2522 = Static3.stringStack[ssp + 1];
										string = Static3.stringStack[ssp];
										Static3.stringStack[ssp++] = Static34.concatenate(new JagString[] { string, local2522 });
										continue;
									}
									if (opcode == 4102) {
										ssp--;
										string = Static3.stringStack[ssp];
										isp--;
										local803 = Static254.intStack[isp];
										Static3.stringStack[ssp++] = Static34.concatenate(new JagString[] { string, Static110.method2285(local803) });
										continue;
									}
									if (opcode == 4103) {
										ssp--;
										string = Static3.stringStack[ssp];
										Static3.stringStack[ssp++] = string.toLowerCase();
										continue;
									}
									if (opcode == 4104) {
										isp--;
										type = Static254.intStack[isp];
										@Pc(11770) long local11770 = (long) type * 86400000L + 1014768000000L;
										Static102.aCalendar2.setTime(new Date(local11770));
										local652 = Static102.aCalendar2.get(5);
										c = Static102.aCalendar2.get(2);
										local1087 = Static102.aCalendar2.get(1);
										Static3.stringStack[ssp++] = Static34.concatenate(new JagString[] { Static123.parseInt(local652), Static163.aClass100_767, Static34.aClass100Array40[c], Static163.aClass100_767, Static123.parseInt(local1087) });
										continue;
									}
									if (opcode == 4105) {
										ssp -= 2;
										local2522 = Static3.stringStack[ssp + 1];
										string = Static3.stringStack[ssp];
										if (Static173.self.aClass59_1 != null && Static173.self.aClass59_1.aBoolean141) {
											Static3.stringStack[ssp++] = local2522;
											continue;
										}
										Static3.stringStack[ssp++] = string;
										continue;
									}
									if (opcode == 4106) {
										isp--;
										type = Static254.intStack[isp];
										Static3.stringStack[ssp++] = Static123.parseInt(type);
										continue;
									}
									if (opcode == 4107) {
										ssp -= 2;
										Static254.intStack[isp++] = Static3.stringStack[ssp].method3126(Static3.stringStack[ssp + 1]);
										continue;
									}
									if (opcode == 4108) {
										ssp--;
										string = Static3.stringStack[ssp];
										isp -= 2;
										local1052 = Static254.intStack[isp + 1];
										local803 = Static254.intStack[isp];
										Static254.intStack[isp++] = Static148.method2768(local1052).getParagraphLineCount(string, local803);
										continue;
									}
									if (opcode == 4109) {
										isp -= 2;
										ssp--;
										string = Static3.stringStack[ssp];
										local1052 = Static254.intStack[isp + 1];
										local803 = Static254.intStack[isp];
										Static254.intStack[isp++] = Static148.method2768(local1052).method2856(string, local803);
										continue;
									}
									if (opcode == 4110) {
										ssp -= 2;
										string = Static3.stringStack[ssp];
										local2522 = Static3.stringStack[ssp + 1];
										isp--;
										if (Static254.intStack[isp] == 1) {
											Static3.stringStack[ssp++] = string;
										} else {
											Static3.stringStack[ssp++] = local2522;
										}
										continue;
									}
									if (opcode == 4111) {
										ssp--;
										string = Static3.stringStack[ssp];
										Static3.stringStack[ssp++] = Static218.method2862(string);
										continue;
									}
									if (opcode == 4112) {
										ssp--;
										string = Static3.stringStack[ssp];
										isp--;
										local803 = Static254.intStack[isp];
										if (local803 == -1) {
											throw new RuntimeException("null char");
										}
										Static3.stringStack[ssp++] = string.method3128(local803);
										continue;
									}
									if (opcode == 4113) {
										isp--;
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = Static273.method3213(type) ? 1 : 0;
										continue;
									}
									if (opcode == 4114) {
										isp--;
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = Static83.method433(type) ? 1 : 0;
										continue;
									}
									if (opcode == 4115) {
										isp--;
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = Static258.method4428(type) ? 1 : 0;
										continue;
									}
									if (opcode == 4116) {
										isp--;
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = Static24.method671(type) ? 1 : 0;
										continue;
									}
									if (opcode == 4117) {
										ssp--;
										string = Static3.stringStack[ssp];
										if (string == null) {
											Static254.intStack[isp++] = 0;
										} else {
											Static254.intStack[isp++] = string.length();
										}
										continue;
									}
									if (opcode == 4118) {
										isp -= 2;
										ssp--;
										string = Static3.stringStack[ssp];
										local803 = Static254.intStack[isp];
										local1052 = Static254.intStack[isp + 1];
										Static3.stringStack[ssp++] = string.substring(local1052, local803);
										continue;
									}
									if (opcode == 4119) {
										ssp--;
										string = Static3.stringStack[ssp];
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
										Static3.stringStack[ssp++] = local2522;
										continue;
									}
									if (opcode == 4120) {
										isp -= 2;
										ssp--;
										string = Static3.stringStack[ssp];
										local803 = Static254.intStack[isp];
										local1052 = Static254.intStack[isp + 1];
										Static254.intStack[isp++] = string.indexOf(local803, local1052);
										continue;
									}
									if (opcode == 4121) {
										ssp -= 2;
										string = Static3.stringStack[ssp];
										local2522 = Static3.stringStack[ssp + 1];
										isp--;
										local1052 = Static254.intStack[isp];
										Static254.intStack[isp++] = string.indexOf(local2522, local1052);
										continue;
									}
									if (opcode == 4122) {
										isp--;
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = Static231.toLowerCase(type);
										continue;
									}
									if (opcode == 4123) {
										isp--;
										type = Static254.intStack[isp];
										Static254.intStack[isp++] = Static143.toUpperCase(type);
										continue;
									}
									if (opcode == 4124) {
										isp--;
										local12388 = Static254.intStack[isp] != 0;
										isp--;
										local803 = Static254.intStack[isp];
										Static3.stringStack[ssp++] = Static182.valueToBase10String(Static141.language, local12388, 0, (long) local803);
										continue;
									}
								}
							}
						} else {
							if (opcode < 2000) {
								component = local1020 ? Static274.staticActiveComponent1 : Static227.staticActiveComponent2;
							} else {
								isp--;
								component = Static5.getComponent(Static254.intStack[isp]);
								opcode -= 1000;
							}
							if (opcode == 1000) {
								isp -= 4;
								component.baseX = Static254.intStack[isp];
								component.baseY = Static254.intStack[isp + 1];
								local1052 = Static254.intStack[isp + 3];
								if (local1052 < 0) {
									local1052 = 0;
								} else if (local1052 > 5) {
									local1052 = 5;
								}
								local803 = Static254.intStack[isp + 2];
								if (local803 < 0) {
									local803 = 0;
								} else if (local803 > 5) {
									local803 = 5;
								}
								component.xMode = (byte) local1052;
								component.yMode = (byte) local803;
								Static43.redraw(component);
								Static74.update(component);
								if (component.createdComponentId == -1) {
									Static280.method4675(component.id);
								}
								continue;
							}
							if (opcode == 1001) {
								isp -= 4;
								component.baseWidth = Static254.intStack[isp];
								component.baseHeight = Static254.intStack[isp + 1];
								component.anInt451 = 0;
								component.anInt526 = 0;
								local803 = Static254.intStack[isp + 2];
								local1052 = Static254.intStack[isp + 3];
								if (local1052 < 0) {
									local1052 = 0;
								} else if (local1052 > 4) {
									local1052 = 4;
								}
								component.dynamicHeightValue = (byte) local1052;
								if (local803 < 0) {
									local803 = 0;
								} else if (local803 > 4) {
									local803 = 4;
								}
								component.dynamicWidthValue = (byte) local803;
								Static43.redraw(component);
								Static74.update(component);
								if (component.type == 0) {
									Static17.method531(component, false);
								}
								continue;
							}
							if (opcode == 1003) {
								isp--;
								local1552 = Static254.intStack[isp] == 1;
								if (local1552 != component.hidden) {
									component.hidden = local1552;
									Static43.redraw(component);
								}
								if (component.createdComponentId == -1) {
									Static93.method1906(component.id);
								}
								continue;
							}
							if (opcode == 1004) {
								isp -= 2;
								component.aspectWidth = Static254.intStack[isp];
								component.aspectHeight = Static254.intStack[isp + 1];
								Static43.redraw(component);
								Static74.update(component);
								if (component.type == 0) {
									Static17.method531(component, false);
								}
								continue;
							}
							if (opcode == 1005) {
								isp--;
								component.noClickThrough = Static254.intStack[isp] == 1;
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(14378) Exception ex) {
			if (script.name == null) {
				if (Static83.modeWhere != 0) {
					Static103.method2231(Static72.EMPTY_STRING, 0, Static136.CS_ERROR);
				}
				Static89.report("CS2 - scr:" + script.key + " op:" + op, ex);
			} else {
				@Pc(14385) JagString str = Static87.allocate(30);
				str.method3113(Static219.aClass100_928).method3113(script.name);
				for (cycles = Static138.fp - 1; cycles >= 0; cycles--) {
					str.method3113(Static40.aClass100_253).method3113(Static67.callStack[cycles].script.name);
				}
				if (op == 40) {
					cycles = intOperands[pc];
					str.method3113(Static176.aClass100_802).method3113(Static123.parseInt(cycles));
				}
				if (Static83.modeWhere != 0) {
					Static103.method2231(Static72.EMPTY_STRING, 0, Static34.concatenate(new JagString[] { Static167.aClass100_780, script.name}));
				}
				Static89.report("CS2 - scr:" + script.key + " op:" + op + new String(str.method3148()), ex);
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)Lclient!ba;")
	public static World getNextWorld() {
		return Static101.worlds.length > Static51.worldPos ? Static101.worlds[Static51.worldPos++] : null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void start(@OriginalArg(0) java.awt.Component arg0) {
		arg0.addMouseListener(Static93.instance);
		arg0.addMouseMotionListener(Static93.instance);
		arg0.addFocusListener(Static93.instance);
	}
}
