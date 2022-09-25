package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import plugin.PluginRepository;
import plugin.api.API;
import plugin.api.MiniMenuEntry;

public class MiniMenu {
	@OriginalMember(owner = "client!df", name = "l", descriptor = "Lclient!na;")
	public static final JagString COLOR_GREEN = JagString.parse("<col=00ff00>");
	@OriginalMember(owner = "client!sc", name = "g", descriptor = "Lclient!na;")
	public static final JagString aClass100_947 = JagString.parse(" )2> <col=ff9040>");
	@OriginalMember(owner = "client!uj", name = "C", descriptor = "[Lclient!na;")
	public static final JagString[] ops = new JagString[500];
	@OriginalMember(owner = "client!t", name = "v", descriptor = "[Lclient!na;")
	public static final JagString[] opBases = new JagString[500];
	@OriginalMember(owner = "client!d", name = "eb", descriptor = "[S")
	public static final short[] actions = new short[500];
	@OriginalMember(owner = "client!pf", name = "r", descriptor = "[I")
	public static final int[] cursors = new int[500];
	@OriginalMember(owner = "client!mi", name = "U", descriptor = "[J")
	public static final long[] keys = new long[500];
	@OriginalMember(owner = "client!pl", name = "e", descriptor = "[I")
	public static final int[] intArgs1 = new int[500];
	@OriginalMember(owner = "client!ef", name = "c", descriptor = "[I")
	public static final int[] intArgs2 = new int[500];
	@OriginalMember(owner = "client!nm", name = "bb", descriptor = "Lclient!na;")
	public static final JagString aClass100_798 = JagString.parse("<col=ff0000>");
	@OriginalMember(owner = "client!fb", name = "p", descriptor = "Lclient!na;")
	public static final JagString aClass100_433 = JagString.parse("<col=ff3000>");
	@OriginalMember(owner = "client!sc", name = "D", descriptor = "Lclient!na;")
	public static final JagString aClass100_951 = JagString.parse("<col=ff7000>");
	@OriginalMember(owner = "client!si", name = "Z", descriptor = "Lclient!na;")
	public static final JagString aClass100_972 = JagString.parse("<col=ffb000>");
	@OriginalMember(owner = "client!ag", name = "bb", descriptor = "Lclient!na;")
	public static final JagString aClass100_18 = JagString.parse("<col=40ff00>");
	@OriginalMember(owner = "client!dc", name = "v", descriptor = "Lclient!na;")
	public static final JagString aClass100_266 = JagString.parse("<col=c0ff00>");
	@OriginalMember(owner = "client!sf", name = "g", descriptor = "Lclient!na;")
	public static final JagString aClass100_965 = JagString.parse("<col=ffff00>");
	@OriginalMember(owner = "client!vg", name = "f", descriptor = "Lclient!na;")
	public static final JagString aClass100_1081 = JagString.parse("<col=80ff00>");
	@OriginalMember(owner = "client!r", name = "d", descriptor = "Z")
	public static final boolean aBoolean237 = false;
	@OriginalMember(owner = "client!se", name = "m", descriptor = "Lclient!na;")
	public static final JagString aClass100_961 = JagString.parse(" )2>");
	@OriginalMember(owner = "client!a", name = "j", descriptor = "Lclient!na;")
	public static final JagString aClass100_2 = JagString.parse("<col=ffffff> )4 ");
	@OriginalMember(owner = "client!cb", name = "fb", descriptor = "Lclient!na;")
	public static final JagString aClass100_168 = JagString.parse(": ");
	@OriginalMember(owner = "client!qf", name = "Q", descriptor = "Lclient!na;")
	public static final JagString aClass100_407 = JagString.parse(" )2> <col=ffff00>");
	@OriginalMember(owner = "client!qf", name = "R", descriptor = "Lclient!na;")
	public static final JagString aClass100_408 = JagString.parse(" )2> ");
	@OriginalMember(owner = "client!aj", name = "R", descriptor = "Lclient!na;")
	public static final JagString aClass100_32 = JagString.parse("<col=ff9040>");
	@OriginalMember(owner = "client!fl", name = "V", descriptor = "Lclient!na;")
	public static final JagString CLOSE_PARENTHESIS = JagString.parse("(Y");
	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Lclient!na;")
	public static final JagString PLUS = JagString.parse(")0");
	@OriginalMember(owner = "client!jj", name = "g", descriptor = "Lclient!na;")
	public static final JagString OPEN_PARENTHESIS = JagString.parse(" (X");
	@OriginalMember(owner = "client!qi", name = "B", descriptor = "Lclient!na;")
	public static final JagString COLOR_WHITE = JagString.parse("<col=ffffff>");
	@OriginalMember(owner = "client!cb", name = "ab", descriptor = "Lclient!na;")
	public static final JagString aClass100_164 = JagString.parse(" )2> <col=00ffff>");
	@OriginalMember(owner = "client!ud", name = "Q", descriptor = "Lclient!na;")
	public static final JagString aClass100_1039 = JagString.parse(" x ");
	@OriginalMember(owner = "client!hd", name = "l", descriptor = "Lclient!na;")
	public static final JagString NULL = JagString.parse("null");
	@OriginalMember(owner = "client!ib", name = "k", descriptor = "Lclient!na;")
	public static final JagString aClass100_561 = JagString.parse(" )2> <col=ffffff>");
	@OriginalMember(owner = "client!tg", name = "e", descriptor = "Lclient!na;")
	public static final JagString aClass100_1008 = JagString.parse("<col=00ffff>");
	@OriginalMember(owner = "client!uf", name = "q", descriptor = "Lclient!na;")
	public static final JagString aClass100_1042 = JagString.parse("Null");
	@OriginalMember(owner = "client!e", name = "pc", descriptor = "[I")
	public static final int[] anIntArray132 = new int[4];
	@OriginalMember(owner = "client!af", name = "l", descriptor = "[S")
	public static final short[] aShortArray2 = new short[]{30, 6, 31, 29, 10, 44, 37, 57};
	@OriginalMember(owner = "client!ck", name = "D", descriptor = "Lclient!na;")
	public static JagString aClass100_203 = null;
	@OriginalMember(owner = "client!hn", name = "W", descriptor = "Lclient!na;")
	public static JagString aClass100_545 = null;
	@OriginalMember(owner = "client!sk", name = "kb", descriptor = "I")
	public static int size = 0;
	@OriginalMember(owner = "client!v", name = "b", descriptor = "Lclient!be;")
	public static Component pressedInventoryComponent;
	@OriginalMember(owner = "client!gd", name = "i", descriptor = "Lclient!na;")
	public static JagString aClass100_466 = null;
	@OriginalMember(owner = "client!vd", name = "C", descriptor = "I")
	public static int anInt5014 = 0;
	@OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
	public static int anInt4999;
	@OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
	public static int anInt4997;
	@OriginalMember(owner = "client!be", name = "Ec", descriptor = "I")
	public static int anInt506 = -1;
	@OriginalMember(owner = "client!fl", name = "P", descriptor = "I")
	public static int anInt2043 = 0;
	@OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
	public static int anInt2512;
	@OriginalMember(owner = "client!mh", name = "Y", descriptor = "Z")
	public static boolean aBoolean187 = false;
	@OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
	public static int anInt3902 = 0;
	@OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
	public static int anInt2388 = 0;
	@OriginalMember(owner = "client!kd", name = "zb", descriptor = "I")
	public static int anInt3259 = 0;
	@OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
	public static int anInt1742 = -1;
	@OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
	public static int anInt2954 = -1;
	@OriginalMember(owner = "client!id", name = "k", descriptor = "I")
	public static int anInt2878;
	@OriginalMember(owner = "client!u", name = "i", descriptor = "I")
	public static int anInt5393;
	@OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
	public static int anInt5444 = 0;
	@OriginalMember(owner = "client!pk", name = "bb", descriptor = "Lclient!na;")
	public static JagString walkText;
	@OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
	public static int anInt3096 = 0;
	@OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
	public static int anInt7 = 0;
	@OriginalMember(owner = "client!cl", name = "Y", descriptor = "I")
	public static int anInt1092 = -1;
	@OriginalMember(owner = "client!p", name = "e", descriptor = "I")
	public static int anInt4370;
	@OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
	public static int anInt3039;
	@OriginalMember(owner = "client!th", name = "n", descriptor = "Z")
	public static boolean aBoolean302 = false;
	@OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
	public static int clickedInventoryIndex = 0;
	@OriginalMember(owner = "client!em", name = "D", descriptor = "I")
	public static int gregorianDateSeed;
	@OriginalMember(owner = "client!ml", name = "Q", descriptor = "I")
	public static int anInt3953 = 0;

	/***********************
	 *   Action Constants  *
	 ***********************/
	/* Tiles */
	public static final int WALK_HERE = 60;
	/* NPCs */
	public static final int NPC_ACTION_1 = 17;
	public static final int NPC_ACTION_2 = 16;
	public static final int NPC_ACTION_3 = 4;
	public static final int NPC_ACTION_4 = 19;
	public static final int NPC_ACTION_5 = 2;
	public static final int NPC_EXAMINE = 1007;
	/* Players */
	public static final int PLAYER_ACTION_1 = 30;
	public static final int PLAYER_ACTION_BLOCK = 34;
	public static final int PLAYER_ACTION_TRADE = 29;
	public static final int PLAYER_REQ_ASSIST_ACTION = 37;
	public static final int PLAYER_FOLLOW_ACTION = 31;
	public static final int PLAYER_ACTION_5 = 57;
	/* Objects */
	public static final int OBJ_ACTION_1 = 47;
	public static final int OBJ_EQUIP_ACTION = 5;
	public static final int OBJ_ACTION_4 = 35;
	public static final int OBJ_OPERATE_ACTION = 23;
	public static final int OBJ_ACTION_5 = 58;
	public static final int OBJ_EXAMINE = 1002;
	public static final int OBJ_PLAYER_ACTION = 1;
	public static final int OBJ_OBJSTACK_ACTION = 33;
	public static final int OBJ_NPC_ACTION = 26;
	public static final int OBJ_LOC_ACTION = 14;
	public static final int OBJ_OBJ_ACTION = 40;
	/* Object Stacks */
	public static final int OBJSTACK_ACTION_1 = 18;
	public static final int OBJSTACK_ACTION_2 = 20;
	/* Locations */
	public static final int LOC_ACTION_1 = 42;
	public static final int LOC_ACTION_2 = 50;
	public static final int LOC_ACTION_3 = 49;
	public static final int LOC_ACTION_4 = 46;
	public static final int LOC_ACTION_5 = 1001;
	public static final int LOC_ACTION_EXAMINE = 1004;
	/* Components */
	public static final int COMPONENT_ACTION_CLOSE = 28;
	public static final int COMPONENT_OBJSTACK_ACTION = 39;
	public static final int OBJ_IN_COMPONENT_ACTION_4 = 43;
	public static final int COMPONENT_LOC_ACTION = 38;
	public static final int LOGOUT_ACTION_2 = 59;
	public static final int LOGOUT_ACTION = 51;
	public static final int OBJ_IN_COMPONENT_ACTION_1 = 25;
	public static final int COMPONENT_PLAYER_ACTION = 15;
	public static final int COMPONENT_OBJ_ACTION = 3;
	public static final int COMPONENT_NPC_ACTION = 45;
	public static final int OBJ_EXAMINE_IN_COMPONENT = 1006;
	/* Unknown/Unidentified */
	public static final int UNKNOWN_13 = 13;
	public static final int UNKNOWN_22 = 22;
	public static final int UNKNOWN_48 = 48;
	public static final int UNKNOWN_12 = 12;
	public static final int UNKNOWN_36 = 36;
	public static final int UNKNOWN_6 = 6;
	public static final int UNKNOWN_24 = 24;
	public static final int UNKNOWN_7 = 7;
	public static final int UNKNOWN_8 = 8;
	public static final int UNKNOWN_11 = 11;
	public static final int UNKNOWN_32 = 32;
	public static final int UNKNOWN_21 = 21;
	public static final int UNKNOWN_9 = 9;
	public static final int UNKNOWN_1003 = 1003;
	public static final int UNKNOWN_41 = 41;
	public static final int UNKNOWN_10 = 10;
	public static final int UNKNOWN_44 = 44;


	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IZILclient!be;)V")
	public static void addComponentEntries(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component component) {
		if (component.buttonType == 1) {
			add(-1, 0L, JagString.EMPTY, 0, (short) 8, component.option, component.id);
		}
		@Pc(47) JagString local47;
		if (component.buttonType == 2 && !aBoolean302) {
			local47 = MiniMap.getTargetVerb(component);
			if (local47 != null) {
				add(-1, 0L, JagString.concatenate(new JagString[]{COLOR_GREEN, component.optionSuffix}), -1, (short) 32, local47, component.id);
			}
		}
		if (component.buttonType == 3) {
			add(-1, 0L, JagString.EMPTY, 0, (short) 28, LocalizedText.CLOSE, component.id);
		}
		if (component.buttonType == 4) {
			add(-1, 0L, JagString.EMPTY, 0, (short) 59, component.option, component.id);
		}
		if (component.buttonType == 5) {
			add(-1, 0L, JagString.EMPTY, 0, (short) 51, component.option, component.id);
		}
		if (component.buttonType == 6 && Cs1ScriptRunner.aClass13_10 == null) {
			add(-1, 0L, JagString.EMPTY, -1, (short) 41, component.option, component.id);
		}
		@Pc(173) int local173;
		@Pc(171) int local171;
		if (component.type == 2) {
			local171 = 0;
			for (local173 = 0; local173 < component.baseHeight; local173++) {
				for (@Pc(183) int local183 = 0; local183 < component.baseWidth; local183++) {
					@Pc(195) int local195 = (component.invMarginX + 32) * local183;
					@Pc(202) int local202 = (component.invMarginY + 32) * local173;
					if (local171 < 20) {
						local202 += component.invOffsetY[local171];
						local195 += component.invOffsetX[local171];
					}
					if (arg1 >= local195 && local202 <= arg0 && local195 + 32 > arg1 && local202 + 32 > arg0) {
						InterfaceList.mouseOverInventoryInterface = component;
						clickedInventoryIndex = local171;
						if (component.objTypes[local171] > 0) {
							@Pc(267) ServerActiveProperties local267 = InterfaceList.getServerActiveProperties(component);
							@Pc(276) ObjType local276 = ObjTypeList.get(component.objTypes[local171] - 1);
							if (anInt5014 == 1 && local267.isObjOpsEnabled()) {
								if (MiniMap.anInt5062 != component.id || anInt4370 != local171) {
									add(-1, local276.id, JagString.concatenate(new JagString[]{aClass100_203, aClass100_947, local276.name}), local171, (short) 40, LocalizedText.USE, component.id);
								}
							} else if (aBoolean302 && local267.isObjOpsEnabled()) {
								@Pc(596) ParamType local596 = anInt3039 == -1 ? null : ParamTypeList.get(anInt3039);
								if ((anInt4999 & 0x10) != 0 && (local596 == null || local276.getParam(local596.defaultInt, anInt3039) != local596.defaultInt)) {
									add(anInt5393, local276.id, JagString.concatenate(new JagString[]{aClass100_466, aClass100_947, local276.name}), local171, (short) 3, aClass100_545, component.id);
								}
							} else {
								@Pc(296) JagString[] local296 = local276.iops;
								if (aBoolean237) {
									local296 = annotateOps(local296);
								}
								@Pc(309) int local309;
								@Pc(334) byte local334;
								if (local267.isObjOpsEnabled()) {
									for (local309 = 4; local309 >= 3; local309--) {
										if (local296 != null && local296[local309] != null) {
											if (local309 == 3) {
												local334 = 35;
											} else {
												local334 = 58;
											}
											add(-1, local276.id, JagString.concatenate(new JagString[]{aClass100_32, local276.name}), local171, local334, local296[local309], component.id);
										}
									}
								}
								if (local267.isObjUseEnabled()) {
									add(MiniMap.anInt4075, local276.id, JagString.concatenate(new JagString[]{aClass100_32, local276.name}), local171, (short) 22, LocalizedText.USE, component.id);
								}
								if (local267.isObjOpsEnabled() && local296 != null) {
									for (local309 = 2; local309 >= 0; local309--) {
										if (local296[local309] != null) {
											local334 = 0;
											if (local309 == 0) {
												local334 = 47;
											}
											if (local309 == 1) {
												local334 = 5;
											}
											if (local309 == 2) {
												local334 = 43;
											}
											add(-1, local276.id, JagString.concatenate(new JagString[]{aClass100_32, local276.name}), local171, local334, local296[local309], component.id);
										}
									}
								}
								local296 = component.invOptions;
								if (aBoolean237) {
									local296 = annotateOps(local296);
								}
								if (local296 != null) {
									for (local309 = 4; local309 >= 0; local309--) {
										if (local296[local309] != null) {
											local334 = 0;
											if (local309 == 0) {
												local334 = 25;
											}
											if (local309 == 1) {
												local334 = 23;
											}
											if (local309 == 2) {
												local334 = 48;
											}
											if (local309 == 3) {
												local334 = 7;
											}
											if (local309 == 4) {
												local334 = 13;
											}
											add(-1, local276.id, JagString.concatenate(new JagString[]{aClass100_32, local276.name}), local171, local334, local296[local309], component.id);
										}
									}
								}
								add(MiniMap.anInt5073, local276.id, JagString.concatenate(new JagString[]{aClass100_32, local276.name}), local171, (short) 1006, LocalizedText.EXAMINE, component.id);
							}
						}
					}
					local171++;
				}
			}
		}
		if (!component.if3) {
			return;
		}
		if (!aBoolean302) {
			for (local171 = 9; local171 >= 5; local171--) {
				@Pc(765) JagString local765 = InterfaceList.getOp(component, local171);
				if (local765 != null) {
					add(getOpCursor(local171, component), local171 + 1, component.optionBase, component.createdComponentId, (short) 1003, local765, component.id);
				}
			}
			local47 = MiniMap.getTargetVerb(component);
			if (local47 != null) {
				add(-1, 0L, component.optionBase, component.createdComponentId, (short) 32, local47, component.id);
			}
			for (local173 = 4; local173 >= 0; local173--) {
				@Pc(828) JagString local828 = InterfaceList.getOp(component, local173);
				if (local828 != null) {
					add(getOpCursor(local173, component), local173 + 1, component.optionBase, component.createdComponentId, (short) 9, local828, component.id);
				}
			}
			if (InterfaceList.getServerActiveProperties(component).isResumePauseButtonEnabled()) {
				add(-1, 0L, JagString.EMPTY, component.createdComponentId, (short) 41, LocalizedText.CONTINUE, component.id);
			}
		} else if (InterfaceList.getServerActiveProperties(component).isUseTarget() && (anInt4999 & 0x20) != 0) {
			add(anInt5393, 0L, JagString.concatenate(new JagString[]{aClass100_466, aClass100_408, component.optionBase}), component.createdComponentId, (short) 12, aClass100_545, component.id);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IJBLclient!na;ISLclient!na;I)V")
	public static void add(@OriginalArg(0) int cursor, @OriginalArg(1) long arg1, @OriginalArg(3) JagString opName, @OriginalArg(4) int arg3, @OriginalArg(5) short arg4, @OriginalArg(6) JagString arg5, @OriginalArg(7) int arg6) {
		if (Cs1ScriptRunner.aBoolean108 || size >= 500) {
			return;
		}
		ops[size] = arg5;
		opBases[size] = opName;
		cursors[size] = cursor == -1 ? anInt1092 : cursor;
		actions[size] = arg4;
		keys[size] = arg1;
		intArgs1[size] = arg3;
		intArgs2[size] = arg6;
		PluginRepository.DrawMiniMenu(new MiniMenuEntry(size));
		size++;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
	public static void sort() {
		@Pc(3) boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (@Pc(13) int i = 0; i < size - 1; i++) {
				if ((actions[i] < 1000 && actions[i + 1] > 1000) || (actions[i] > 7000 && actions[i + 1] > actions[i])) {
					@Pc(41) JagString local41 = opBases[i];
					sorted = false;
					opBases[i] = opBases[i + 1];
					opBases[i + 1] = local41;
					@Pc(61) JagString local61 = ops[i];
					ops[i] = ops[i + 1];
					ops[i + 1] = local61;
					@Pc(79) int local79 = intArgs1[i];
					intArgs1[i] = intArgs1[i + 1];
					intArgs1[i + 1] = local79;
					@Pc(97) int local97 = intArgs2[i];
					intArgs2[i] = intArgs2[i + 1];
					intArgs2[i + 1] = local97;
					@Pc(115) int local115 = cursors[i];
					cursors[i] = cursors[i + 1];
					cursors[i + 1] = local115;
					@Pc(133) short local133 = actions[i];
					actions[i] = actions[i + 1];
					actions[i + 1] = local133;
					@Pc(151) long local151 = keys[i];
					keys[i] = keys[i + 1];
					keys[i + 1] = local151;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)V")
	public static void remove(@OriginalArg(1) int i) {
		size--;
		if (size == i) {
			return;
		}
		ArrayUtils.copy(ops, i + 1, ops, i, size - i);
		ArrayUtils.copy(opBases, i + 1, opBases, i, size - i);
		ArrayUtils.copy(cursors, i + 1, cursors, i, size - i);
		ArrayUtils.copy(actions, i + 1, actions, i, size - i);
		ArrayUtils.copy(keys, i + 1, keys, i, size - i);
		ArrayUtils.copy(intArgs1, i + 1, intArgs1, i, size - i);
		ArrayUtils.copy(intArgs2, i + 1, intArgs2, i, size - i);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)Lclient!na;")
	public static JagString getOp(@OriginalArg(0) int i) {
		try {
			return opBases[i].length() > 0 ? JagString.concatenate(new JagString[]{ops[i], LocalizedText.MINISEPARATOR, opBases[i]}) : ops[i];
		} catch (NullPointerException npe) {
			int ui = 4;
			return JagString.EMPTY;
		}
	}

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(II)V")
	public static void doAction(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(15) int local15 = intArgs1[arg0];
		@Pc(19) int local19 = intArgs2[arg0];
		@Pc(23) int actionCode = actions[arg0];
		if (actionCode >= 2000) {
			actionCode -= 2000;
		}
		@Pc(31) long local31 = keys[arg0];
		@Pc(36) int local36 = (int) keys[arg0];
		@Pc(43) Player local43;
		if (actionCode == PLAYER_FOLLOW_ACTION) {
			local43 = PlayerList.players[local36];
			if (local43 != null) {
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
				Cross.type = 2;
				Cross.milliseconds = 0;
				Cross.x = Mouse.clickX;
				Cross.y = Mouse.clickY;
				Protocol.outboundBuffer.p1isaac(71);
				Protocol.outboundBuffer.ip2add(local36);
			}
		}
		if (actionCode == LOC_ACTION_4) {
			PathFinder.findPathToLoc(local31, local19, local15);
			Protocol.outboundBuffer.p1isaac(247);
			Protocol.outboundBuffer.ip2(Camera.originZ + local19);
			Protocol.outboundBuffer.ip2add(local15 + Camera.originX);
			Protocol.outboundBuffer.p2(Integer.MAX_VALUE & (int) (local31 >>> 32));
		}
		if (actionCode == OBJ_OBJ_ACTION) {
			Protocol.outboundBuffer.p1isaac(27);
			Protocol.outboundBuffer.p2(anInt4370);
			Protocol.outboundBuffer.ip4(local19);
			Protocol.outboundBuffer.ip2(local15);
			Protocol.outboundBuffer.ip4(MiniMap.anInt5062);
			Protocol.outboundBuffer.ip2add(anInt4997);
			Protocol.outboundBuffer.ip2add(local36);
			anInt2043 = 0;
			pressedInventoryComponent = InterfaceList.getComponent(local19);
			anInt5444 = local15;
		}
		@Pc(192) Npc local192;
		if (actionCode == NPC_ACTION_4) {
			local192 = NpcList.npcs[local36];
			if (local192 != null) {
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
				Cross.x = Mouse.clickX;
				Cross.type = 2;
				Cross.milliseconds = 0;
				Cross.y = Mouse.clickY;
				Protocol.outboundBuffer.p1isaac(30);
				Protocol.outboundBuffer.p2(local36);
			}
		}
		if (actionCode == NPC_ACTION_1) {
			local192 = NpcList.npcs[local36];
			if (local192 != null) {
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
				Cross.x = Mouse.clickX;
				Cross.milliseconds = 0;
				Cross.type = 2;
				Cross.y = Mouse.clickY;
				Protocol.outboundBuffer.p1isaac(78);
				Protocol.outboundBuffer.ip2(local36);
			}
		}
		if (actionCode == UNKNOWN_44) {
			local43 = PlayerList.players[local36];
			if (local43 != null) {
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
				Cross.x = Mouse.clickX;
				Cross.type = 2;
				Cross.y = Mouse.clickY;
				Cross.milliseconds = 0;
				Protocol.outboundBuffer.p1isaac(133);
				Protocol.outboundBuffer.ip2(local36);
			}
		}
		if (actionCode == OBJ_ACTION_5) {
			Protocol.outboundBuffer.p1isaac(135);
			Protocol.outboundBuffer.p2add(local36);
			Protocol.outboundBuffer.p2add(local15);
			Protocol.outboundBuffer.mp4(local19);
			anInt2043 = 0;
			pressedInventoryComponent = InterfaceList.getComponent(local19);
			anInt5444 = local15;
		}
		if (actionCode == LOC_ACTION_1) {
			PathFinder.findPathToLoc(local31, local19, local15);
			Protocol.outboundBuffer.p1isaac(254);
			Protocol.outboundBuffer.ip2(local15 + Camera.originX);
			Protocol.outboundBuffer.p2add((int) (local31 >>> 32) & Integer.MAX_VALUE);
			Protocol.outboundBuffer.p2(local19 + Camera.originZ);
		}
		if (actionCode == COMPONENT_ACTION_CLOSE) {
			ClientProt.closeWidget();
		}
		if (actionCode == COMPONENT_NPC_ACTION) {
			local192 = NpcList.npcs[local36];
			if (local192 != null) {
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
				Cross.x = Mouse.clickX;
				Cross.type = 2;
				Cross.milliseconds = 0;
				Cross.y = Mouse.clickY;
				Protocol.outboundBuffer.p1isaac(239);
				Protocol.outboundBuffer.ip4(anInt2512);
				Protocol.outboundBuffer.p2add(anInt506);
				Protocol.outboundBuffer.ip2add(local36);
			}
		}
		@Pc(560) boolean local560;
		if (actionCode == OBJSTACK_ACTION_1) {
			if (client.game == 1) {
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
			} else {
				local560 = PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, PlayerList.self.movementQueueX[0]);
				if (!local560) {
					PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
				}
			}
			Cross.x = Mouse.clickX;
			Cross.milliseconds = 0;
			Cross.type = 2;
			Cross.y = Mouse.clickY;
			Protocol.outboundBuffer.p1isaac(66);
			Protocol.outboundBuffer.ip2(Camera.originX + local15);
			Protocol.outboundBuffer.p2(local36);
			Protocol.outboundBuffer.ip2add(local19 + Camera.originZ);
		}
		if (actionCode == LOC_ACTION_5) {
			PathFinder.findPathToLoc(local31, local19, local15);
			Protocol.outboundBuffer.p1isaac(170);
			Protocol.outboundBuffer.ip2add(Integer.MAX_VALUE & (int) (local31 >>> 32));
			Protocol.outboundBuffer.ip2add(local15 + Camera.originX);
			Protocol.outboundBuffer.ip2add(local19 + Camera.originZ);
		}
		if (actionCode == OBJ_EXAMINE) {
			Cross.type = 2;
			Cross.x = Mouse.clickX;
			Cross.y = Mouse.clickY;
			Cross.milliseconds = 0;
			Protocol.outboundBuffer.p1isaac(92);
			Protocol.outboundBuffer.ip2add(local36);
		}
		@Pc(693) Component local693;
		if (actionCode == OBJ_EXAMINE_IN_COMPONENT) {
			local693 = InterfaceList.getComponent(local19);
			if (local693 == null || local693.objCounts[local15] < 100000) {
				Protocol.outboundBuffer.p1isaac(92);
				Protocol.outboundBuffer.ip2add(local36);
			} else {
				Chat.add(JagString.EMPTY, 0, JagString.concatenate(new JagString[]{JagString.parseInt(local693.objCounts[local15]), aClass100_1039, ObjTypeList.get(local36).name}));
			}
			anInt2043 = 0;
			pressedInventoryComponent = InterfaceList.getComponent(local19);
			anInt5444 = local15;
		}
		if (actionCode == WALK_HERE) {
			if (local36 == 0) {
				method3556(Player.plane, local15, local19);
			} else if (local36 == 1) {
				if (LoginManager.staffModLevel > 0 && Keyboard.pressedKeys[Keyboard.KEY_CTRL] && Keyboard.pressedKeys[Keyboard.KEY_SHIFT]) {
					Cheat.teleport(Camera.originX + local15, Camera.originZ + local19, Player.plane);
				} else if (PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 0, true, 0, local15, 0, 0, 1, local19, PlayerList.self.movementQueueX[0])) {
					Protocol.outboundBuffer.p1(InterfaceList.anInt5);
					Protocol.outboundBuffer.p1(anInt2878);
					Protocol.outboundBuffer.p2((int) Camera.yawTarget);
					Protocol.outboundBuffer.p1(57);
					Protocol.outboundBuffer.p1(MiniMap.anInt1814);
					Protocol.outboundBuffer.p1(MiniMap.anInt4130);
					Protocol.outboundBuffer.p1(89);
					Protocol.outboundBuffer.p2(PlayerList.self.xFine);
					Protocol.outboundBuffer.p2(PlayerList.self.zFine);
					Protocol.outboundBuffer.p1(PathFinder.anInt4364);
					Protocol.outboundBuffer.p1(63);
				}
			}
		}
		if (actionCode == NPC_EXAMINE) {
			Cross.milliseconds = 0;
			Cross.type = 2;
			Cross.y = Mouse.clickY;
			Cross.x = Mouse.clickX;
			local192 = NpcList.npcs[local36];
			if (local192 != null) {
				@Pc(884) NpcType local884 = local192.type;
				if (local884.multiNpcs != null) {
					local884 = local884.getMultiNpc();
				}
				if (local884 != null) {
					Protocol.outboundBuffer.p1isaac(72);
					Protocol.outboundBuffer.p2(local884.id);
				}
			}
		}
		if (actionCode == OBJ_ACTION_1) {
			Protocol.outboundBuffer.p1isaac(156);
			Protocol.outboundBuffer.ip2add(local15);
			Protocol.outboundBuffer.p2add(local36);
			Protocol.outboundBuffer.ip4(local19);
			anInt2043 = 0;
			pressedInventoryComponent = InterfaceList.getComponent(local19);
			anInt5444 = local15;
		}
		if (actionCode == COMPONENT_OBJ_ACTION) {
			Protocol.outboundBuffer.p1isaac(253);
			Protocol.outboundBuffer.ip4(anInt2512);
			Protocol.outboundBuffer.ip2add(local15);
			Protocol.outboundBuffer.ip4(local19);
			Protocol.outboundBuffer.p2add(local36);
			Protocol.outboundBuffer.ip2(anInt506);
			anInt2043 = 0;
			pressedInventoryComponent = InterfaceList.getComponent(local19);
			anInt5444 = local15;
		}
		if (actionCode == UNKNOWN_10) {
			local43 = PlayerList.players[local36];
			if (local43 != null) {
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
				Cross.type = 2;
				Cross.y = Mouse.clickY;
				Cross.x = Mouse.clickX;
				Cross.milliseconds = 0;
				Protocol.outboundBuffer.p1isaac(4);
				Protocol.outboundBuffer.ip2(local36);
			}
		}
		if (actionCode == UNKNOWN_41 && Cs1ScriptRunner.aClass13_10 == null) {
			method10(local15, local19);
			Cs1ScriptRunner.aClass13_10 = InterfaceList.method1418(local19, local15);
			InterfaceList.redraw(Cs1ScriptRunner.aClass13_10);
		}
		if (actionCode == LOC_ACTION_3) {
			PathFinder.findPathToLoc(local31, local19, local15);
			Protocol.outboundBuffer.p1isaac(84);
			Protocol.outboundBuffer.ip2add(Integer.MAX_VALUE & (int) (local31 >>> 32));
			Protocol.outboundBuffer.ip2add(Camera.originZ + local19);
			Protocol.outboundBuffer.ip2(local15 + Camera.originX);
		}
		if (actionCode == OBJ_OPERATE_ACTION) {
			Protocol.outboundBuffer.p1isaac(206);
			Protocol.outboundBuffer.p2add(local36);
			Protocol.outboundBuffer.ip2(local15);
			Protocol.outboundBuffer.ip4(local19);
			anInt2043 = 0;
			pressedInventoryComponent = InterfaceList.getComponent(local19);
			anInt5444 = local15;
		}
		if (actionCode == OBJ_LOC_ACTION && PathFinder.findPathToLoc(local31, local19, local15)) {
			Protocol.outboundBuffer.p1isaac(134);
			Protocol.outboundBuffer.p2add(Camera.originX + local15);
			Protocol.outboundBuffer.p2(anInt4997);
			Protocol.outboundBuffer.ip2(local19 + Camera.originZ);
			Protocol.outboundBuffer.p2(anInt4370);
			Protocol.outboundBuffer.mp4(MiniMap.anInt5062);
			Protocol.outboundBuffer.p2add((int) (local31 >>> 32) & Integer.MAX_VALUE);
		}
		if (actionCode == PLAYER_REQ_ASSIST_ACTION) {
			local43 = PlayerList.players[local36];
			if (local43 != null) {
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
				Cross.milliseconds = 0;
				Cross.type = 2;
				Cross.y = Mouse.clickY;
				Cross.x = Mouse.clickX;
				Protocol.outboundBuffer.p1isaac(114);
				Protocol.outboundBuffer.ip2add(local36);
			}
		}
		if (actionCode == UNKNOWN_9 || actionCode == UNKNOWN_1003) {
			ClientProt.method4512(opBases[arg0], local15, local36, local19);
		}
		if (actionCode == OBJ_EQUIP_ACTION) {
			Protocol.outboundBuffer.p1isaac(55);
			Protocol.outboundBuffer.ip2(local36);
			Protocol.outboundBuffer.p2add(local15);
			Protocol.outboundBuffer.imp4(local19);
			anInt2043 = 0;
			pressedInventoryComponent = InterfaceList.getComponent(local19);
			anInt5444 = local15;
		}
		if (actionCode == UNKNOWN_21) {
			if (client.game == 1) {
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
			} else {
				local560 = PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, PlayerList.self.movementQueueX[0]);
				if (!local560) {
					PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
				}
			}
			Cross.type = 2;
			Cross.x = Mouse.clickX;
			Cross.milliseconds = 0;
			Cross.y = Mouse.clickY;
			Protocol.outboundBuffer.p1isaac(228);
			Protocol.outboundBuffer.p2(local36);
			Protocol.outboundBuffer.ip2(Camera.originX + local15);
			Protocol.outboundBuffer.ip2add(Camera.originZ + local19);
		}
		if (actionCode == NPC_ACTION_3) {
			local192 = NpcList.npcs[local36];
			if (local192 != null) {
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
				Cross.type = 2;
				Cross.milliseconds = 0;
				Cross.y = Mouse.clickY;
				Cross.x = Mouse.clickX;
				Protocol.outboundBuffer.p1isaac(148);
				Protocol.outboundBuffer.p2add(local36);
			}
		}
		if (actionCode == UNKNOWN_32) {
			local693 = InterfaceList.method1418(local19, local15);
			if (local693 != null) {
				method1294();
				@Pc(1493) ServerActiveProperties local1493 = InterfaceList.getServerActiveProperties(local693);
				method4246(local19, local15, local1493.getTargetMask(), local1493.targetParam, local693.anInt499, local693.anInt484);
				anInt5014 = 0;
				aClass100_545 = MiniMap.getTargetVerb(local693);
				if (aClass100_545 == null) {
					aClass100_545 = aClass100_1042;
				}
				if (local693.if3) {
					aClass100_466 = JagString.concatenate(new JagString[]{local693.optionBase, COLOR_WHITE});
				} else {
					aClass100_466 = JagString.concatenate(new JagString[]{COLOR_GREEN, local693.optionSuffix, COLOR_WHITE});
				}
			}
			return;
		}
		if (actionCode == PLAYER_ACTION_TRADE) {
			local43 = PlayerList.players[local36];
			if (local43 != null) {
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
				Cross.y = Mouse.clickY;
				Cross.milliseconds = 0;
				Cross.type = 2;
				Cross.x = Mouse.clickX;
				Protocol.outboundBuffer.p1isaac(180);
				Protocol.outboundBuffer.ip2add(local36);
			}
		}
		if (actionCode == OBJ_ACTION_4) {
			Protocol.outboundBuffer.p1isaac(161);
			Protocol.outboundBuffer.ip4(local19);
			Protocol.outboundBuffer.ip2add(local36);
			Protocol.outboundBuffer.ip2add(local15);
			anInt2043 = 0;
			pressedInventoryComponent = InterfaceList.getComponent(local19);
			anInt5444 = local15;
		}
		if (actionCode == COMPONENT_PLAYER_ACTION) {
			local43 = PlayerList.players[local36];
			if (local43 != null) {
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
				Cross.milliseconds = 0;
				Cross.type = 2;
				Cross.x = Mouse.clickX;
				Cross.y = Mouse.clickY;
				Protocol.outboundBuffer.p1isaac(195);
				Protocol.outboundBuffer.p2add(anInt506);
				Protocol.outboundBuffer.ip4(anInt2512);
				Protocol.outboundBuffer.ip2add(local36);
			}
		}
		if (actionCode == PLAYER_ACTION_BLOCK) {
			if (client.game == 1) {
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
			} else {
				local560 = PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, PlayerList.self.movementQueueX[0]);
				if (!local560) {
					PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
				}
			}
			Cross.x = Mouse.clickX;
			Cross.type = 2;
			Cross.y = Mouse.clickY;
			Cross.milliseconds = 0;
			Protocol.outboundBuffer.p1isaac(109);
			Protocol.outboundBuffer.ip2(local19 + Camera.originZ);
			Protocol.outboundBuffer.p2(local15 + Camera.originX);
			Protocol.outboundBuffer.ip2add(local36);
		}
		if (actionCode == OBJ_IN_COMPONENT_ACTION_1) {
			Protocol.outboundBuffer.p1isaac(81);
			Protocol.outboundBuffer.p2add(local15);
			Protocol.outboundBuffer.p2(local36);
			Protocol.outboundBuffer.imp4(local19);
			anInt2043 = 0;
			pressedInventoryComponent = InterfaceList.getComponent(local19);
			anInt5444 = local15;
		}
		if (actionCode == NPC_ACTION_5) {
			local192 = NpcList.npcs[local36];
			if (local192 != null) {
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
				Cross.y = Mouse.clickY;
				Cross.type = 2;
				Cross.x = Mouse.clickX;
				Cross.milliseconds = 0;
				Protocol.outboundBuffer.p1isaac(218);
				Protocol.outboundBuffer.ip2(local36);
			}
		}
		@Pc(1955) int local1955;
		if (actionCode == LOGOUT_ACTION) {
			Protocol.outboundBuffer.p1isaac(10);
			Protocol.outboundBuffer.p4(local19);
			local693 = InterfaceList.getComponent(local19);
			if (local693.cs1Scripts != null && local693.cs1Scripts[0][0] == 5) {
				local1955 = local693.cs1Scripts[0][1];
				if (VarpDomain.activeVarps[local1955] != local693.cs1ComparisonOperands[0]) {
					VarpDomain.activeVarps[local1955] = local693.cs1ComparisonOperands[0];
					VarpDomain.refreshMagicVarp(local1955);
				}
			}
		}
		if (actionCode == OBJ_NPC_ACTION) {
			local192 = NpcList.npcs[local36];
			if (local192 != null) {
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
				Cross.type = 2;
				Cross.milliseconds = 0;
				Cross.y = Mouse.clickY;
				Cross.x = Mouse.clickX;
				Protocol.outboundBuffer.p1isaac(115);
				Protocol.outboundBuffer.mp4(MiniMap.anInt5062);
				Protocol.outboundBuffer.ip2(anInt4370);
				Protocol.outboundBuffer.ip2(local36);
				Protocol.outboundBuffer.ip2add(anInt4997);
			}
		}
		if (actionCode == LOGOUT_ACTION_2) {
			Protocol.outboundBuffer.p1isaac(10);
			Protocol.outboundBuffer.p4(local19);
			local693 = InterfaceList.getComponent(local19);
			if (local693.cs1Scripts != null && local693.cs1Scripts[0][0] == 5) {
				local1955 = local693.cs1Scripts[0][1];
				VarpDomain.activeVarps[local1955] = 1 - VarpDomain.activeVarps[local1955];
				VarpDomain.refreshMagicVarp(local1955);
			}
		}
		if (actionCode == OBJ_OBJSTACK_ACTION) {
			local560 = PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, PlayerList.self.movementQueueX[0]);
			if (!local560) {
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
			}
			Cross.x = Mouse.clickX;
			Cross.milliseconds = 0;
			Cross.y = Mouse.clickY;
			Cross.type = 2;
			Protocol.outboundBuffer.p1isaac(101);
			Protocol.outboundBuffer.ip2add(local15 + Camera.originX);
			Protocol.outboundBuffer.ip2(anInt4370);
			Protocol.outboundBuffer.ip2(anInt4997);
			Protocol.outboundBuffer.ip2(local36);
			Protocol.outboundBuffer.ip2add(Camera.originZ + local19);
			Protocol.outboundBuffer.mp4(MiniMap.anInt5062);
		}
		if (actionCode == LOC_ACTION_EXAMINE) {
			Cross.milliseconds = 0;
			Cross.x = Mouse.clickX;
			Cross.type = 2;
			Cross.y = Mouse.clickY;
			Protocol.outboundBuffer.p1isaac(94);
			Protocol.outboundBuffer.ip2add(local36);
		}
		if (actionCode == UNKNOWN_11) {
			if (local36 == 0) {
				anInt3096 = 1;
				method3556(Player.plane, local15, local19);
			} else if (local36 == 1) {
				Protocol.outboundBuffer.p1isaac(131);
				Protocol.outboundBuffer.mp4(anInt2512);
				Protocol.outboundBuffer.p2add(Camera.originX + local15);
				Protocol.outboundBuffer.ip2add(anInt506);
				Protocol.outboundBuffer.p2add(local19 + Camera.originZ);
			}
		}
		if (actionCode == UNKNOWN_8) {
			local693 = InterfaceList.getComponent(local19);
			@Pc(2287) boolean local2287 = true;
			if (local693.clientCode > 0) {
				local2287 = method4265(local693);
			}
			if (local2287) {
				Protocol.outboundBuffer.p1isaac(10);
				Protocol.outboundBuffer.p4(local19);
			}
		}
		if (actionCode == OBJ_PLAYER_ACTION) {
			local43 = PlayerList.players[local36];
			if (local43 != null) {
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
				Cross.milliseconds = 0;
				Cross.y = Mouse.clickY;
				Cross.type = 2;
				Cross.x = Mouse.clickX;
				Protocol.outboundBuffer.p1isaac(248);
				Protocol.outboundBuffer.ip2add(local36);
				Protocol.outboundBuffer.p2(anInt4997);
				Protocol.outboundBuffer.p2(anInt4370);
				Protocol.outboundBuffer.mp4(MiniMap.anInt5062);
			}
		}
		if (actionCode == UNKNOWN_7) {
			Protocol.outboundBuffer.p1isaac(85);
			Protocol.outboundBuffer.imp4(local19);
			Protocol.outboundBuffer.p2(local15);
			Protocol.outboundBuffer.p2add(local36);
			anInt2043 = 0;
			pressedInventoryComponent = InterfaceList.getComponent(local19);
			anInt5444 = local15;
		}
		if (actionCode == UNKNOWN_24) {
			if (client.game == 1) {
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
			} else {
				local560 = PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, PlayerList.self.movementQueueX[0]);
				if (!local560) {
					PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
				}
			}
			Cross.type = 2;
			Cross.y = Mouse.clickY;
			Cross.x = Mouse.clickX;
			Cross.milliseconds = 0;
			Protocol.outboundBuffer.p1isaac(48);
			Protocol.outboundBuffer.p2add(local15 + Camera.originX);
			Protocol.outboundBuffer.ip2add(local36);
			Protocol.outboundBuffer.ip2(Camera.originZ + local19);
		}
		if (actionCode == COMPONENT_LOC_ACTION && PathFinder.findPathToLoc(local31, local19, local15)) {
			Protocol.outboundBuffer.p1isaac(233);
			Protocol.outboundBuffer.ip2add(local19 + Camera.originZ);
			Protocol.outboundBuffer.p2add(Camera.originX + local15);
			Protocol.outboundBuffer.ip2add(anInt506);
			Protocol.outboundBuffer.imp4(anInt2512);
			Protocol.outboundBuffer.p2add((int) (local31 >>> 32) & Integer.MAX_VALUE);
		}
		if (actionCode == UNKNOWN_13) {
			Protocol.outboundBuffer.p1isaac(6);
			Protocol.outboundBuffer.p4(local19);
			Protocol.outboundBuffer.p2add(local15);
			Protocol.outboundBuffer.ip2(local36);
			anInt2043 = 0;
			pressedInventoryComponent = InterfaceList.getComponent(local19);
			anInt5444 = local15;
		}
		if (actionCode == PLAYER_ACTION_5) {
			local43 = PlayerList.players[local36];
			if (local43 != null) {
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
				Cross.type = 2;
				Cross.y = Mouse.clickY;
				Cross.x = Mouse.clickX;
				Cross.milliseconds = 0;
				Protocol.outboundBuffer.p1isaac(175);
				Protocol.outboundBuffer.p2add(local36);
			}
		}
		if (actionCode == UNKNOWN_22) {
			method1294();
			local693 = InterfaceList.getComponent(local19);
			MiniMap.anInt5062 = local19;
			anInt4370 = local15;
			anInt5014 = 1;
			anInt4997 = local36;
			InterfaceList.redraw(local693);
			aClass100_203 = JagString.concatenate(new JagString[]{aClass100_32, ObjTypeList.get(local36).name, COLOR_WHITE});
			if (aClass100_203 == null) {
				aClass100_203 = NULL;
			}
			return;
		}
		if (actionCode == LOC_ACTION_2) {
			PathFinder.findPathToLoc(local31, local19, local15);
			Protocol.outboundBuffer.p1isaac(194);
			Protocol.outboundBuffer.ip2add(local19 + Camera.originZ);
			Protocol.outboundBuffer.ip2(Camera.originX + local15);
			Protocol.outboundBuffer.p2((int) (local31 >>> 32) & Integer.MAX_VALUE);
		}
		if (actionCode == UNKNOWN_48) {
			Protocol.outboundBuffer.p1isaac(154);
			Protocol.outboundBuffer.ip2(local15);
			Protocol.outboundBuffer.imp4(local19);
			Protocol.outboundBuffer.ip2add(local36);
			anInt2043 = 0;
			pressedInventoryComponent = InterfaceList.getComponent(local19);
			anInt5444 = local15;
		}
		if (actionCode == PLAYER_ACTION_1) {
			local43 = PlayerList.players[local36];
			if (local43 != null) {
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
				Cross.milliseconds = 0;
				Cross.x = Mouse.clickX;
				Cross.y = Mouse.clickY;
				Cross.type = 2;
				Protocol.outboundBuffer.p1isaac(68);
				Protocol.outboundBuffer.ip2add(local36);
			}
		}
		if (actionCode == OBJ_IN_COMPONENT_ACTION_4) {
			Protocol.outboundBuffer.p1isaac(153);
			Protocol.outboundBuffer.ip4(local19);
			Protocol.outboundBuffer.ip2(local15);
			Protocol.outboundBuffer.ip2(local36);
			anInt2043 = 0;
			pressedInventoryComponent = InterfaceList.getComponent(local19);
			anInt5444 = local15;
		}
		if (actionCode == COMPONENT_OBJSTACK_ACTION) {
			local560 = PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, PlayerList.self.movementQueueX[0]);
			if (!local560) {
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
			}
			Cross.y = Mouse.clickY;
			Cross.x = Mouse.clickX;
			Cross.type = 2;
			Cross.milliseconds = 0;
			Protocol.outboundBuffer.p1isaac(73);
			Protocol.outboundBuffer.imp4(anInt2512);
			Protocol.outboundBuffer.p2(Camera.originZ + local19);
			Protocol.outboundBuffer.ip2add(local36);
			Protocol.outboundBuffer.ip2add(local15 + Camera.originX);
			Protocol.outboundBuffer.ip2(anInt506);
		}
		if (actionCode == UNKNOWN_12) {
			Protocol.outboundBuffer.p1isaac(82);
			Protocol.outboundBuffer.p2(anInt506);
			Protocol.outboundBuffer.imp4(local19);
			Protocol.outboundBuffer.p4(anInt2512);
			Protocol.outboundBuffer.ip2add(local15);
		}
		if (actionCode == UNKNOWN_36) {
			if (local36 == 0) {
				Protocol.anInt4422 = 1;
				method3556(Player.plane, local15, local19);
			} else if (LoginManager.staffModLevel > 0 && Keyboard.pressedKeys[Keyboard.KEY_CTRL] && Keyboard.pressedKeys[Keyboard.KEY_SHIFT]) {
				Cheat.teleport(local15 + Camera.originX, Camera.originZ - -local19, Player.plane);
			} else {
				Protocol.outboundBuffer.p1isaac(179);
				Protocol.outboundBuffer.p2(local19 + Camera.originZ);
				Protocol.outboundBuffer.p2(local15 + Camera.originX);
			}
		}
		if (actionCode == UNKNOWN_6) {
			local43 = PlayerList.players[local36];
			if (local43 != null) {
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
				Cross.y = Mouse.clickY;
				Cross.milliseconds = 0;
				Cross.type = 2;
				Cross.x = Mouse.clickX;
				Protocol.outboundBuffer.p1isaac(106);
				Protocol.outboundBuffer.p2(local36);
			}
		}
		if (actionCode == OBJSTACK_ACTION_2) {
			if (client.game == 1) {
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
			} else {
				local560 = PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, PlayerList.self.movementQueueX[0]);
				if (!local560) {
					PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, PlayerList.self.movementQueueX[0]);
				}
			}
			Cross.y = Mouse.clickY;
			Cross.milliseconds = 0;
			Cross.x = Mouse.clickX;
			Cross.type = 2;
			Protocol.outboundBuffer.p1isaac(33);
			Protocol.outboundBuffer.p2(local36);
			Protocol.outboundBuffer.p2(Camera.originX + local15);
			Protocol.outboundBuffer.ip2(Camera.originZ + local19);
		}
		if (actionCode == NPC_ACTION_2) {
			local192 = NpcList.npcs[local36];
			if (local192 != null) {
				PathFinder.findPath(PlayerList.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], PlayerList.self.movementQueueX[0]);
				Cross.x = Mouse.clickX;
				Cross.milliseconds = 0;
				Cross.y = Mouse.clickY;
				Cross.type = 2;
				Protocol.outboundBuffer.p1isaac(3);
				Protocol.outboundBuffer.ip2add(local36);
			}
		}
		if (actionCode >= 7990 && actionCode <= 7999) {
			int index = actionCode - 7990;
			API.miniMenuCustomActions[index].run();
		}
		if (anInt5014 != 0) {
			anInt5014 = 0;
			InterfaceList.redraw(InterfaceList.getComponent(MiniMap.anInt5062));
		}
		if (aBoolean302) {
			method1294();
		}
		if (pressedInventoryComponent != null && anInt2043 == 0) {
			InterfaceList.redraw(pressedInventoryComponent);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBI)Lclient!na;")
	public static JagString getCombatLevelColor(@OriginalArg(0) int otherLevel, @OriginalArg(2) int selfLevel) {
		@Pc(4) int delta = selfLevel - otherLevel;
		if (delta < -9) {
			return aClass100_798;
		} else if (delta < -6) {
			return aClass100_433;
		} else if (delta < -3) {
			return aClass100_951;
		} else if (delta < 0) {
			return aClass100_972;
		} else if (delta > 9) {
			return COLOR_GREEN;
		} else if (delta > 6) {
			return aClass100_18;
		} else if (delta <= 3) {
			return delta > 0 ? aClass100_266 : aClass100_965;
		} else {
			return aClass100_1081;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIB)V")
	public static void addEntries(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(15) int local15;
		@Pc(47) int x;
		if (anInt5014 == 0) {
			@Pc(13) int local13 = Rasteriser.screenUpperY;
			local15 = Rasteriser.screenLowerY;
			@Pc(17) int local17 = Rasteriser.screenUpperX;
			@Pc(19) int local19 = Rasteriser.screenLowerX;
			@Pc(33) int local33 = (arg5 - arg3) * (local17 - local19) / arg1 + local19;
			x = local15 + (local13 - local15) * (arg4 - arg0) / arg2;
			if (aBoolean302 && (anInt4999 & 0x40) != 0) {
				@Pc(61) Component local61 = InterfaceList.method1418(anInt2512, anInt506);
				if (local61 == null) {
					method1294();
				} else {
					add(anInt5393, 0L, aClass100_961, local33, (short) 11, aClass100_545, x);
				}
			} else {
				if (client.game == 1) {
					add(-1, 0L, JagString.EMPTY, local33, (short) 36, LocalizedText.FACEHERE, x);
				}
				add(-1, 0L, JagString.EMPTY, local33, (short) 60, walkText, x);
			}
		}
		@Pc(112) long local112 = -1L;
		for (local15 = 0; local15 < anInt7; local15++) {
			@Pc(121) long local121 = Model.aLongArray11[local15];
			x = (int) local121 & 0x7F;
			@Pc(133) int local133 = (int) local121 >> 29 & 0x3;
			@Pc(140) int local140 = (int) (local121 >>> 32) & Integer.MAX_VALUE;
			@Pc(147) int z = (int) local121 >> 7 & 0x7F;
			if (local121 != local112) {
				local112 = local121;
				@Pc(240) int local240;
				if (local133 == 2 && SceneGraph.isLocValid(Player.plane, x, z, local121)) {
					@Pc(172) LocType local172 = LocTypeList.get(local140);
					if (local172.multiLocs != null) {
						local172 = local172.getMultiLoc();
					}
					if (local172 == null) {
						continue;
					}
					if (anInt5014 == 1) {
						add(MiniMap.anInt4075, local121, JagString.concatenate(new JagString[]{aClass100_203, aClass100_164, local172.name}), x, (short) 14, LocalizedText.USE, z);
					} else if (aBoolean302) {
						@Pc(363) ParamType local363 = anInt3039 == -1 ? null : ParamTypeList.get(anInt3039);
						if ((anInt4999 & 0x4) != 0 && (local363 == null || local172.getParam(local363.defaultInt, anInt3039) != local363.defaultInt)) {
							add(anInt5393, local121, JagString.concatenate(new JagString[]{aClass100_466, aClass100_164, local172.name}), x, (short) 38, aClass100_545, z);
						}
					} else {
						@Pc(228) JagString[] local228 = local172.ops;
						if (aBoolean237) {
							local228 = annotateOps(local228);
						}
						if (local228 != null) {
							for (local240 = 4; local240 >= 0; local240--) {
								if (local228[local240] != null) {
									@Pc(254) short local254 = 0;
									if (local240 == 0) {
										local254 = 42;
									}
									if (local240 == 1) {
										local254 = 50;
									}
									@Pc(268) int local268 = -1;
									if (local240 == 2) {
										local254 = 49;
									}
									if (local172.cursor1Op == local240) {
										local268 = local172.cursor1;
									}
									if (local240 == 3) {
										local254 = 46;
									}
									if (local240 == local172.cursor2Op) {
										local268 = local172.cursor2;
									}
									if (local240 == 4) {
										local254 = 1001;
									}
									add(local268, local121, JagString.concatenate(new JagString[]{aClass100_1008, local172.name}), x, local254, local228[local240], z);
								}
							}
						}
						add(MiniMap.anInt5073, local172.id, JagString.concatenate(new JagString[]{aClass100_1008, local172.name}), x, (short) 1004, LocalizedText.EXAMINE, z);
					}
				}
				@Pc(514) int local514;
				@Pc(526) int local526;
				@Pc(479) int local479;
				@Pc(493) int local493;
				@Pc(502) Npc local502;
				@Pc(597) Player local597;
				if (local133 == 1) {
					@Pc(421) Npc local421 = NpcList.npcs[local140];
					if ((local421.type.size & 0x1) == 0 && (local421.xFine & 0x7F) == 0 && (local421.zFine & 0x7F) == 0 || (local421.type.size & 0x1) == 1 && (local421.xFine & 0x7F) == 64 && (local421.zFine & 0x7F) == 64) {
						local479 = local421.xFine + 64 - local421.type.size * 64;
						local240 = local421.zFine - (local421.type.size - 1) * 64;
						for (local493 = 0; local493 < NpcList.size; local493++) {
							local502 = NpcList.npcs[NpcList.ids[local493]];
							local514 = local502.xFine + 64 - local502.type.size * 64;
							local526 = local502.zFine + 64 - local502.type.size * 64;
							if (local502 != null && local421 != local502 && local514 >= local479 && local421.type.size - (local514 - local479 >> 7) >= local502.type.size && local240 <= local526 && local502.type.size <= local421.type.size - (local526 - local240 >> 7)) {
								addNpcEntries(local502.type, x, NpcList.ids[local493], z);
							}
						}
						for (local493 = 0; local493 < PlayerList.size; local493++) {
							local597 = PlayerList.players[PlayerList.ids[local493]];
							local514 = local597.xFine + 64 - local597.getSize() * 64;
							local526 = local597.zFine + 64 - local597.getSize() * 64;
							if (local597 != null && local514 >= local479 && local597.getSize() <= local421.type.size - (local514 - local479 >> 7) && local526 >= local240 && local597.getSize() <= local421.type.size - (local526 - local240 >> 7)) {
								addPlayerEntries(PlayerList.ids[local493], z, local597, x);
							}
						}
					}
					addNpcEntries(local421.type, x, local140, z);
				}
				if (local133 == 0) {
					@Pc(688) Player player = PlayerList.players[local140];
					if ((player.xFine & 0x7F) == 64 && (player.zFine & 0x7F) == 64) {
						local479 = player.xFine - (player.getSize() - 1) * 64;
						local240 = player.zFine + 64 - player.getSize() * 64;
						for (local493 = 0; local493 < NpcList.size; local493++) {
							local502 = NpcList.npcs[NpcList.ids[local493]];
							local514 = local502.xFine + 64 - local502.type.size * 64;
							local526 = local502.zFine + 64 - local502.type.size * 64;
							if (local502 != null && local514 >= local479 && local502.type.size <= player.getSize() - (local514 - local479 >> 7) && local526 >= local240 && local502.type.size <= player.getSize() - (local526 - local240 >> 7)) {
								addNpcEntries(local502.type, x, NpcList.ids[local493], z);
							}
						}
						for (local493 = 0; local493 < PlayerList.size; local493++) {
							local597 = PlayerList.players[PlayerList.ids[local493]];
							local514 = local597.xFine - (local597.getSize() - 1) * 64;
							local526 = local597.zFine + 64 - local597.getSize() * 64;
							if (local597 != null && local597 != player && local479 <= local514 && local597.getSize() <= player.getSize() - (local514 - local479 >> 7) && local526 >= local240 && local597.getSize() <= player.getSize() - (local526 - local240 >> 7)) {
								addPlayerEntries(PlayerList.ids[local493], z, local597, x);
							}
						}
					}
					addPlayerEntries(local140, z, player, x);
				}
				if (local133 == 3) {
					@Pc(931) LinkedList objStacks = SceneGraph.objStacks[Player.plane][x][z];
					if (objStacks != null) {
						for (@Pc(940) ObjStackNode node = (ObjStackNode) objStacks.tail(); node != null; node = (ObjStackNode) objStacks.prev()) {
							local240 = node.value.type;
							@Pc(951) ObjType local951 = ObjTypeList.get(local240);
							if (anInt5014 == 1) {
								add(MiniMap.anInt4075, local240, JagString.concatenate(new JagString[]{aClass100_203, aClass100_947, local951.name}), x, (short) 33, LocalizedText.USE, z);
							} else if (aBoolean302) {
								@Pc(1142) ParamType local1142 = anInt3039 == -1 ? null : ParamTypeList.get(anInt3039);
								if ((anInt4999 & 0x1) != 0 && (local1142 == null || local951.getParam(local1142.defaultInt, anInt3039) != local1142.defaultInt)) {
									add(anInt5393, local240, JagString.concatenate(new JagString[]{aClass100_466, aClass100_947, local951.name}), x, (short) 39, aClass100_545, z);
								}
							} else {
								@Pc(997) JagString[] local997 = local951.ops;
								if (aBoolean237) {
									local997 = annotateOps(local997);
								}
								for (local514 = 4; local514 >= 0; local514--) {
									if (local997 != null && local997[local514] != null) {
										@Pc(1025) byte local1025 = 0;
										if (local514 == 0) {
											local1025 = 21;
										}
										if (local514 == 1) {
											local1025 = 34;
										}
										@Pc(1041) int local1041 = -1;
										if (local514 == local951.cursor1Op) {
											local1041 = local951.cursor1;
										}
										if (local514 == 2) {
											local1025 = 18;
										}
										if (local951.cursor2Op == local514) {
											local1041 = local951.cursor2;
										}
										if (local514 == 3) {
											local1025 = 20;
										}
										if (local514 == 4) {
											local1025 = 24;
										}
										add(local1041, local240, JagString.concatenate(new JagString[]{aClass100_32, local951.name}), x, local1025, local997[local514], z);
									}
								}
								add(MiniMap.anInt5073, local240, JagString.concatenate(new JagString[]{aClass100_32, local951.name}), x, (short) 1002, LocalizedText.EXAMINE, z);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "(B)Lclient!na;")
	public static JagString method471() {
		@Pc(32) JagString local32;
		if (anInt5014 == 1 && size < 2) {
			local32 = JagString.concatenate(new JagString[]{LocalizedText.USE, LocalizedText.MINISEPARATOR, aClass100_203, aClass100_961});
		} else if (aBoolean302 && size < 2) {
			local32 = JagString.concatenate(new JagString[]{aClass100_545, LocalizedText.MINISEPARATOR, aClass100_466, aClass100_961});
		} else if (Cheat.shiftClick && Keyboard.pressedKeys[Keyboard.KEY_SHIFT] && size > 2) {
			local32 = getOp(size - 2);
		} else {
			local32 = getOp(size - 1);
		}
		if (size > 2) {
			local32 = JagString.concatenate(new JagString[]{local32, aClass100_2, JagString.parseInt(size - 2), LocalizedText.MOREOPTIONS});
		}
		return local32;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I[Lclient!na;)[Lclient!na;")
	public static JagString[] annotateOps(@OriginalArg(1) JagString[] ops) {
		@Pc(8) JagString[] annotatedOps = new JagString[5];
		for (@Pc(15) int i = 0; i < 5; i++) {
			annotatedOps[i] = JagString.concatenate(new JagString[]{JagString.parseInt(i), aClass100_168});
			if (ops != null && ops[i] != null) {
				annotatedOps[i] = JagString.concatenate(new JagString[]{annotatedOps[i], ops[i]});
			}
		}
		return annotatedOps;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!me;IIII)V")
	public static void addNpcEntries(@OriginalArg(0) NpcType arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (size >= 400) {
			return;
		}
		if (arg0.multiNpcs != null) {
			arg0 = arg0.getMultiNpc();
		}
		if (arg0 == null || !arg0.interactive) {
			return;
		}
		@Pc(35) JagString local35 = arg0.name;
		if (arg0.combatLevel != 0) {
			@Pc(47) JagString local47 = client.game == 1 ? LocalizedText.RATING : LocalizedText.LEVEL;
			local35 = JagString.concatenate(new JagString[]{local35, getCombatLevelColor(arg0.combatLevel, PlayerList.self.combatLevel), OPEN_PARENTHESIS, local47, JagString.parseInt(arg0.combatLevel), CLOSE_PARENTHESIS});
		}
		if (anInt5014 == 1) {
			add(MiniMap.anInt4075, arg2, JagString.concatenate(new JagString[]{aClass100_203, aClass100_407, local35}), arg1, (short) 26, LocalizedText.USE, arg3);
		} else if (aBoolean302) {
			@Pc(378) ParamType local378 = anInt3039 == -1 ? null : ParamTypeList.get(anInt3039);
			if ((anInt4999 & 0x2) != 0 && (local378 == null || arg0.getParam(anInt3039, local378.defaultInt) != local378.defaultInt)) {
				add(anInt5393, arg2, JagString.concatenate(new JagString[]{aClass100_466, aClass100_407, local35}), arg1, (short) 45, aClass100_545, arg3);
			}
		} else {
			@Pc(129) JagString[] local129 = arg0.ops;
			if (aBoolean237) {
				local129 = annotateOps(local129);
			}
			@Pc(140) int local140;
			if (local129 != null) {
				for (local140 = 4; local140 >= 0; local140--) {
					if (local129[local140] != null && (client.game != 0 || !local129[local140].equalsIgnoreCase(LocalizedText.ATTACK))) {
						@Pc(161) byte local161 = 0;
						if (local140 == 0) {
							local161 = 17;
						}
						if (local140 == 1) {
							local161 = 16;
						}
						@Pc(176) int local176 = -1;
						if (local140 == 2) {
							local161 = 4;
						}
						if (local140 == 3) {
							local161 = 19;
						}
						if (arg0.cursor1Op == local140) {
							local176 = arg0.cursor1;
						}
						if (local140 == arg0.cursor2Op) {
							local176 = arg0.cursor2;
						}
						if (local140 == 4) {
							local161 = 2;
						}
						add(local176, arg2, JagString.concatenate(new JagString[]{aClass100_965, local35}), arg1, local161, local129[local140], arg3);
					}
				}
			}
			if (client.game == 0 && local129 != null) {
				for (local140 = 4; local140 >= 0; local140--) {
					if (local129[local140] != null && local129[local140].equalsIgnoreCase(LocalizedText.ATTACK)) {
						@Pc(271) short local271 = 0;
						if (arg0.combatLevel > PlayerList.self.combatLevel) {
							local271 = 2000; //THIS iS FOR LEFT CLICK ATTACK
						}
						@Pc(281) short local281 = 0;
						if (local140 == 0) {
							local281 = 17;
						}
						if (local140 == 1) {
							local281 = 16;
						}
						if (local140 == 2) {
							local281 = 4;
						}
						if (local140 == 3) {
							local281 = 19;
						}
						if (local140 == 4) {
							local281 = 2;
						}
						if (local281 != 0) {
							local281 += local271;
						}
						add(arg0.attackCursor, arg2, JagString.concatenate(new JagString[]{aClass100_965, local35}), arg1, local281, local129[local140], arg3);
					}
				}
			}
			add(MiniMap.anInt5073, arg2, JagString.concatenate(new JagString[]{aClass100_965, local35}), arg1, (short) 1007, LocalizedText.EXAMINE, arg3);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIILclient!e;I)V")
	public static void addPlayerEntries(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Player other, @OriginalArg(4) int arg3) {
		if (PlayerList.self == other || size >= 400) {
			return;
		}
		@Pc(158) JagString string;
		if (other.skill == 0) {
			@Pc(22) boolean markCombatDifference = true;
			if (PlayerList.self.combatRange != -1 && other.combatRange != -1) {
				@Pc(43) int highestCombatLevel = Math.max(other.combatLevel, PlayerList.self.combatLevel);
				@Pc(58) int highestCombatRange = Math.min(other.combatRange, PlayerList.self.combatRange);
				@Pc(69) int calc = (highestCombatLevel * 10) / 100 + highestCombatRange + 5;
				@Pc(76) int combatDelta = PlayerList.self.combatLevel - other.combatLevel;
				if (combatDelta < 0) {
					combatDelta = -combatDelta;
				}
				if (combatDelta < calc) {
					markCombatDifference = false;
				}
			}
			@Pc(95) JagString local95 = client.game == 1 ? LocalizedText.RATING : LocalizedText.LEVEL;
			if (other.combatLevelWithSummoning > other.combatLevel) {
				string = JagString.concatenate(new JagString[]{other.getName(), markCombatDifference ? getCombatLevelColor(other.combatLevel, PlayerList.self.combatLevel) : COLOR_WHITE, OPEN_PARENTHESIS, local95, JagString.parseInt(other.combatLevel), PLUS, JagString.parseInt(other.combatLevelWithSummoning - other.combatLevel), CLOSE_PARENTHESIS});
			} else {
				string = JagString.concatenate(new JagString[]{other.getName(), markCombatDifference ? getCombatLevelColor(other.combatLevel, PlayerList.self.combatLevel) : COLOR_WHITE, OPEN_PARENTHESIS, local95, JagString.parseInt(other.combatLevel), CLOSE_PARENTHESIS});
			}
		} else {
			string = JagString.concatenate(new JagString[]{other.getName(), OPEN_PARENTHESIS, LocalizedText.SKILL, JagString.parseInt(other.skill), CLOSE_PARENTHESIS});
		}
		@Pc(275) int local275;
		if (anInt5014 == 1) {
			add(MiniMap.anInt4075, arg0, JagString.concatenate(new JagString[]{aClass100_203, aClass100_561, string}), arg3, (short) 1, LocalizedText.USE, arg1);
		} else if (!aBoolean302) {
			for (local275 = 7; local275 >= 0; local275--) {
				if (Player.options[local275] != null) {
					@Pc(291) short local291 = 0;
					if (client.game == 0 && Player.options[local275].equalsIgnoreCase(LocalizedText.ATTACK)) {
						if (other.combatLevel > PlayerList.self.combatLevel) {
							local291 = 2000;
						}
						if (PlayerList.self.anInt1650 != 0 && other.anInt1650 != 0) {
							if (PlayerList.self.anInt1650 == other.anInt1650) {
								local291 = 2000;
							} else {
								local291 = 0;
							}
						}
					} else if (Player.secondaryOptions[local275]) {
						local291 = 2000;
					}
					@Pc(353) short local353 = aShortArray2[local275];
					@Pc(358) short local358 = (short) (local353 + local291);
					add(Player.cursors[local275], arg0, JagString.concatenate(new JagString[]{COLOR_WHITE, string}), arg3, local358, Player.options[local275], arg1);
				}
			}
		} else if ((anInt4999 & 0x8) != 0) {
			add(anInt5393, arg0, JagString.concatenate(new JagString[]{aClass100_466, aClass100_561, string}), arg3, (short) 15, aClass100_545, arg1);
		}
		for (local275 = 0; local275 < size; local275++) {
			if (actions[local275] == 60) {
				opBases[local275] = JagString.concatenate(new JagString[]{COLOR_WHITE, string});
				break;
			}
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BILclient!be;)I")
	public static int getOpCursor(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1) {
		if (!InterfaceList.getServerActiveProperties(arg1).isButtonEnabled(arg0) && arg1.onOptionClick == null) {
			return -1;
		} else if (arg1.anIntArray39 == null || arg0 >= arg1.anIntArray39.length) {
			return -1;
		} else {
			return arg1.anIntArray39[arg0];
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V")
	public static void method3556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		aBoolean187 = true;
		anInt3902 = arg0;
		anInt2388 = arg1;
		anInt3259 = arg2;
		anInt1742 = -1;
		anInt2954 = -1;
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(II)Z")
	public static boolean method4640(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(12) int local12 = actions[arg0];
		if (local12 >= 2000) {
			local12 -= 2000;
		}
		return local12 == 1003;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!be;)Z")
	public static boolean method4265(@OriginalArg(1) Component arg0) {
		if (arg0.clientCode == 205) {
			Protocol.anInt5775 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public static void method1294() {
		if (!aBoolean302) {
			return;
		}
		@Pc(19) Component local19 = InterfaceList.method1418(anInt2512, anInt506);
		if (local19 != null && local19.onUseWith != null) {
			@Pc(29) HookRequest local29 = new HookRequest();
			local29.arguments = local19.onUseWith;
			local29.source = local19;
			ScriptRunner.run(local29);
		}
		aBoolean302 = false;
		anInt1092 = -1;
		InterfaceList.redraw(local19);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIIIIII)V")
	public static void method4246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Component local8 = InterfaceList.method1418(arg0, arg1);
		if (local8 != null && local8.onUse != null) {
			@Pc(19) HookRequest local19 = new HookRequest();
			local19.source = local8;
			local19.arguments = local8.onUse;
			ScriptRunner.run(local19);
		}
		anInt506 = arg1;
		anInt3039 = arg3;
		anInt2512 = arg0;
		anInt4999 = arg2;
		aBoolean302 = true;
		anInt5393 = arg4;
		anInt1092 = arg5;
		InterfaceList.redraw(local8);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!be;III)V")
	public static void method1207(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (size < 2 && anInt5014 == 0 && !aBoolean302) {
			return;
		}
		@Pc(24) JagString local24 = method471();
		if (arg0 == null) {
			@Pc(40) int local40 = Fonts.b12Full.method2859(local24, arg2 + 4, arg1 - -15, client.aRandom1, gregorianDateSeed);
			InterfaceList.redrawScreen(arg2 + 4, Fonts.b12Full.getStringWidth(local24) + local40, arg1, 15);
			return;
		}
		@Pc(59) Font local59 = arg0.method491(Sprites.nameIcons);
		if (local59 == null) {
			local59 = Fonts.b12Full;
		}
		local59.method2878(local24, arg2, arg1, arg0.width, arg0.height, arg0.color, arg0.shadowColor, arg0.halign, arg0.valign, client.aRandom1, gregorianDateSeed, anIntArray132);
		InterfaceList.redrawScreen(anIntArray132[0], anIntArray132[2], anIntArray132[1], anIntArray132[3]);
	}

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "(I)V")
	public static void method1372() {
		if (anInt3953 == 2) {
			if (ScriptRunner.anInt3751 == Mouse.anInt5850 && ScriptRunner.anInt1892 == Mouse.anInt5895) {
				anInt3953 = 0;
				if (Cheat.shiftClick && Keyboard.pressedKeys[Keyboard.KEY_SHIFT] && size > 2) {
					doAction(size - 2);
				} else {
					doAction(size - 1);
				}
			}
		} else if (ScriptRunner.anInt3751 == Mouse.clickX && ScriptRunner.anInt1892 == Mouse.clickY) {
			anInt3953 = 0;
			if (Cheat.shiftClick && Keyboard.pressedKeys[Keyboard.KEY_SHIFT] && size > 2) {
				doAction(size - 2);
			} else {
				doAction(size - 1);
			}
		} else {
			Mouse.anInt5895 = Mouse.clickY;
			anInt3953 = 2;
			Mouse.anInt5850 = Mouse.clickX;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZI)V")
	public static void method10(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Protocol.outboundBuffer.p1isaac(132);
		Protocol.outboundBuffer.imp4(arg1);
		Protocol.outboundBuffer.ip2(arg0);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
	public static void drawA() {
		@Pc(3) int local3 = InterfaceList.anInt5138;
		@Pc(9) int local9 = InterfaceList.anInt761;
		@Pc(11) int local11 = InterfaceList.anInt4271;
		@Pc(15) int local15 = InterfaceList.anInt436;
		if (GlRenderer.enabled) {
			GlRaster.fillRect(local11, local3, local9, local15, 6116423);
			GlRaster.fillRect(local11 + 1, local3 + 1, local9 - 2, 16, 0);
			GlRaster.drawRect(local11 + 1, local3 + 18, local9 - 2, local15 + -19, 0);
		} else {
			SoftwareRaster.fillRect(local11, local3, local9, local15, 6116423);
			SoftwareRaster.fillRect(local11 + 1, local3 + 1, local9 - 2, 16, 0);
			SoftwareRaster.drawRect(local11 + 1, local3 + 18, local9 - 2, local15 + -19, 0);
		}
		Fonts.b12Full.renderLeft(LocalizedText.CHOOSE_OPTION, local11 + 3, local3 + 14, 6116423, -1);
		@Pc(96) int local96 = Mouse.lastMouseY;
		@Pc(98) int local98 = Mouse.lastMouseX;
		for (@Pc(107) int local107 = 0; local107 < size; local107++) {
			@Pc(127) int local127 = (size - local107 - 1) * 15 + local3 + 31;
			@Pc(129) int color = 16777215; //WHITE
			if (local11 < local98 && local98 < local11 + local9 && local127 - 13 < local96 && local96 < local127 + 3) {
				color = 16776960; //YELLOW
			}
			Fonts.b12Full.renderLeft(getOp(local107), local11 + 3, local127, color, 0);
		}
		InterfaceList.forceRedrawScreen(InterfaceList.anInt4271, InterfaceList.anInt5138, InterfaceList.anInt436, InterfaceList.anInt761);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
	public static void drawB() {
		@Pc(3) int local3 = InterfaceList.anInt4271;
		@Pc(9) int local9 = InterfaceList.anInt5138;
		@Pc(11) int local11 = InterfaceList.anInt436;
		@Pc(13) int local13 = InterfaceList.anInt761;
		if (LoginManager.aClass3_Sub2_Sub1_1 == null || LoginManager.aClass3_Sub2_Sub1_9 == null) {
			if (client.js5Archive8.isFileReady(LoginManager.anInt1736) && client.js5Archive8.isFileReady(LoginManager.anInt4073)) {
				LoginManager.aClass3_Sub2_Sub1_1 = SoftwareSprite.loadSoftwareAlphaSprite(client.js5Archive8, LoginManager.anInt1736);
				LoginManager.aClass3_Sub2_Sub1_9 = SoftwareSprite.loadSoftwareAlphaSprite(client.js5Archive8, LoginManager.anInt4073);
				if (GlRenderer.enabled) {
					if (LoginManager.aClass3_Sub2_Sub1_1 instanceof SoftwareAlphaSprite) {
						LoginManager.aClass3_Sub2_Sub1_1 = new GlAlphaSprite((SoftwareSprite) LoginManager.aClass3_Sub2_Sub1_1);
					} else {
						LoginManager.aClass3_Sub2_Sub1_1 = new GlSprite((SoftwareSprite) LoginManager.aClass3_Sub2_Sub1_1);
					}
					if (LoginManager.aClass3_Sub2_Sub1_9 instanceof SoftwareAlphaSprite) {
						LoginManager.aClass3_Sub2_Sub1_9 = new GlAlphaSprite((SoftwareSprite) LoginManager.aClass3_Sub2_Sub1_9);
					} else {
						LoginManager.aClass3_Sub2_Sub1_9 = new GlSprite((SoftwareSprite) LoginManager.aClass3_Sub2_Sub1_9);
					}
				}
			} else if (GlRenderer.enabled) {
				GlRaster.fillRectAlpha(local3, local9, local13, 20, LoginManager.anInt1275, 256 - LoginManager.anInt2910);
			} else {
				SoftwareRaster.fillRectAlpha(local3, local9, local13, 20, LoginManager.anInt1275, 256 - LoginManager.anInt2910);
			}
		}
		@Pc(112) int local112;
		@Pc(114) int local114;
		if (LoginManager.aClass3_Sub2_Sub1_1 != null && LoginManager.aClass3_Sub2_Sub1_9 != null) {
			local112 = local13 / LoginManager.aClass3_Sub2_Sub1_1.width;
			for (local114 = 0; local114 < local112; local114++) {
				LoginManager.aClass3_Sub2_Sub1_1.render(local114 * LoginManager.aClass3_Sub2_Sub1_1.width + local3, local9);
			}
			LoginManager.aClass3_Sub2_Sub1_9.render(local3, local9);
			LoginManager.aClass3_Sub2_Sub1_9.renderHorizontalFlip(local3 + local13 - LoginManager.aClass3_Sub2_Sub1_9.width, local9);
		}
		Fonts.b12Full.renderLeft(LocalizedText.CHOOSE_OPTION, local3 + 3, local9 + 14, LoginManager.anInt4581, -1);
		if (GlRenderer.enabled) {
			GlRaster.fillRectAlpha(local3, local9 + 20, local13, local11 - 20, LoginManager.anInt1275, 256 - LoginManager.anInt2910);
		} else {
			SoftwareRaster.fillRectAlpha(local3, local9 + 20, local13, local11 - 20, LoginManager.anInt1275, 256 - LoginManager.anInt2910);
		}
		local114 = Mouse.lastMouseY;
		local112 = Mouse.lastMouseX;
		@Pc(203) int local203;
		@Pc(219) int local219;
		for (local203 = 0; local203 < size; local203++) {
			local219 = (size - local203 - 1) * 15 + local9 + 35;
			if (local3 < local112 && local112 < local3 + local13 && local114 > local219 - 13 && local114 < local219 + 3) {
				if (GlRenderer.enabled) {
					GlRaster.fillRectAlpha(local3, local219 - 13, local13, 16, LoginManager.anInt5457, 256 - LoginManager.anInt5208);
				} else {
					SoftwareRaster.fillRectAlpha(local3, local219 - 13, local13, 16, LoginManager.anInt5457, 256 - LoginManager.anInt5208);
				}
			}
		}
		if ((LoginManager.aClass3_Sub2_Sub1_8 == null || LoginManager.aClass3_Sub2_Sub1_6 == null || LoginManager.aClass3_Sub2_Sub1_10 == null) && client.js5Archive8.isFileReady(LoginManager.anInt2261) && client.js5Archive8.isFileReady(LoginManager.anInt3324) && client.js5Archive8.isFileReady(LoginManager.anInt5556)) {
			LoginManager.aClass3_Sub2_Sub1_8 = SoftwareSprite.loadSoftwareAlphaSprite(client.js5Archive8, LoginManager.anInt2261);
			LoginManager.aClass3_Sub2_Sub1_6 = SoftwareSprite.loadSoftwareAlphaSprite(client.js5Archive8, LoginManager.anInt3324);
			LoginManager.aClass3_Sub2_Sub1_10 = SoftwareSprite.loadSoftwareAlphaSprite(client.js5Archive8, LoginManager.anInt5556);
			if (GlRenderer.enabled) {
				if (LoginManager.aClass3_Sub2_Sub1_8 instanceof SoftwareAlphaSprite) {
					LoginManager.aClass3_Sub2_Sub1_8 = new GlAlphaSprite((SoftwareSprite) LoginManager.aClass3_Sub2_Sub1_8);
				} else {
					LoginManager.aClass3_Sub2_Sub1_8 = new GlSprite((SoftwareSprite) LoginManager.aClass3_Sub2_Sub1_8);
				}
				if (LoginManager.aClass3_Sub2_Sub1_6 instanceof SoftwareAlphaSprite) {
					LoginManager.aClass3_Sub2_Sub1_6 = new GlAlphaSprite((SoftwareSprite) LoginManager.aClass3_Sub2_Sub1_6);
				} else {
					LoginManager.aClass3_Sub2_Sub1_6 = new GlSprite((SoftwareSprite) LoginManager.aClass3_Sub2_Sub1_6);
				}
				if (LoginManager.aClass3_Sub2_Sub1_10 instanceof SoftwareAlphaSprite) {
					LoginManager.aClass3_Sub2_Sub1_10 = new GlAlphaSprite((SoftwareSprite) LoginManager.aClass3_Sub2_Sub1_10);
				} else {
					LoginManager.aClass3_Sub2_Sub1_10 = new GlSprite((SoftwareSprite) LoginManager.aClass3_Sub2_Sub1_10);
				}
			}
		}
		@Pc(418) int local418;
		if (LoginManager.aClass3_Sub2_Sub1_8 != null && LoginManager.aClass3_Sub2_Sub1_6 != null && LoginManager.aClass3_Sub2_Sub1_10 != null) {
			local203 = local13 / LoginManager.aClass3_Sub2_Sub1_8.width;
			for (local219 = 0; local219 < local203; local219++) {
				LoginManager.aClass3_Sub2_Sub1_8.render(local3 + LoginManager.aClass3_Sub2_Sub1_8.width * local219, local11 + local9 + -LoginManager.aClass3_Sub2_Sub1_8.height);
			}
			local219 = (local11 - 20) / LoginManager.aClass3_Sub2_Sub1_6.height;
			for (local418 = 0; local418 < local219; local418++) {
				LoginManager.aClass3_Sub2_Sub1_6.render(local3, local9 + local418 * LoginManager.aClass3_Sub2_Sub1_6.height + 20);
				LoginManager.aClass3_Sub2_Sub1_6.renderHorizontalFlip(local3 + local13 - LoginManager.aClass3_Sub2_Sub1_6.width, local9 + 20 + local418 * LoginManager.aClass3_Sub2_Sub1_6.height);
			}
			LoginManager.aClass3_Sub2_Sub1_10.render(local3, local11 + local9 - LoginManager.aClass3_Sub2_Sub1_10.height);
			LoginManager.aClass3_Sub2_Sub1_10.renderHorizontalFlip(local3 + local13 - LoginManager.aClass3_Sub2_Sub1_10.width, local9 - -local11 + -LoginManager.aClass3_Sub2_Sub1_10.height);
		}
		for (local203 = 0; local203 < size; local203++) {
			local219 = (size - local203 - 1) * 15 + local9 + 35;
			local418 = LoginManager.anInt4581;
			if (local3 < local112 && local13 + local3 > local112 && local219 - 13 < local114 && local114 < local219 + 3) {
				local418 = LoginManager.anInt5752;
			}
			Fonts.b12Full.renderLeft(getOp(local203), local3 + 3, local219, local418, 0);
		}
		InterfaceList.forceRedrawScreen(InterfaceList.anInt4271, InterfaceList.anInt5138, InterfaceList.anInt436, InterfaceList.anInt761);
	}
}
