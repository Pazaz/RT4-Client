package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

public class InterfaceList {
	@OriginalMember(owner = "client!p", name = "c", descriptor = "Lclient!ih;")
	public static final LinkedList lowPriorityRequests = new LinkedList();
	@OriginalMember(owner = "client!ch", name = "y", descriptor = "[Z")
	public static final boolean[] rectangleRedraw = new boolean[100];
	@OriginalMember(owner = "client!qj", name = "i", descriptor = "[I")
	public static final int[] keyChars = new int[128];
	@OriginalMember(owner = "client!sg", name = "q", descriptor = "[I")
	public static final int[] keyCodes = new int[128];
	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!sc;")
	public static final HashTable properties = new HashTable(512);
	@OriginalMember(owner = "client!vh", name = "b", descriptor = "[I")
	public static final int[] rectangleX = new int[100];
	@OriginalMember(owner = "client!e", name = "sc", descriptor = "[I")
	public static final int[] rectangleY = new int[100];
	@OriginalMember(owner = "client!sd", name = "V", descriptor = "[I")
	public static final int[] rectangleWidth = new int[100];
	@OriginalMember(owner = "client!fe", name = "lb", descriptor = "[I")
	public static final int[] rectangleHeight = new int[100];
	@OriginalMember(owner = "client!pa", name = "R", descriptor = "[Z")
	public static final boolean[] aBooleanArray100 = new boolean[100];
	@OriginalMember(owner = "client!ql", name = "h", descriptor = "Lclient!na;")
	public static final JagString aClass100_903 = JagString.parse("Hidden)2");
	@OriginalMember(owner = "client!ja", name = "f", descriptor = "Lclient!ih;")
	public static final LinkedList mediumPriorityRequests = new LinkedList();
	@OriginalMember(owner = "client!ac", name = "i", descriptor = "Lclient!ih;")
	public static final LinkedList highPriorityRequests = new LinkedList();
	@OriginalMember(owner = "client!sc", name = "z", descriptor = "[Z")
	public static final boolean[] aBooleanArray116 = new boolean[100];
	@OriginalMember(owner = "client!bn", name = "V", descriptor = "I")
	public static int rectangles = 0;
	@OriginalMember(owner = "client!md", name = "W", descriptor = "I")
	public static int topLevelInterface = -1;
	@OriginalMember(owner = "client!bm", name = "f", descriptor = "Lclient!ve;")
	public static Js5 aClass153_12;
	@OriginalMember(owner = "client!nd", name = "v", descriptor = "Lclient!ve;")
	public static Js5 aClass153_64;
	@OriginalMember(owner = "client!qg", name = "ab", descriptor = "Lclient!ve;")
	public static Js5 aClass153_84;
	@OriginalMember(owner = "client!qh", name = "g", descriptor = "Lclient!ve;")
	public static Js5 aClass153_85;
	@OriginalMember(owner = "client!th", name = "j", descriptor = "[[Lclient!be;")
	public static Component[][] components;
	@OriginalMember(owner = "client!sc", name = "m", descriptor = "[Z")
	public static boolean[] aBooleanArray115;
	@OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
	public static int keyQueueSize = 0;
	@OriginalMember(owner = "client!je", name = "fb", descriptor = "I")
	public static int transmitTimer = 1;
	@OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
	public static int miscTransmitAt = 0;
	@OriginalMember(owner = "client!je", name = "T", descriptor = "Lclient!sc;")
	public static HashTable openInterfaces = new HashTable(8);
	@OriginalMember(owner = "client!wl", name = "h", descriptor = "Lclient!be;")
	public static Component aClass13_26 = null;
	@OriginalMember(owner = "client!jd", name = "i", descriptor = "Lclient!be;")
	public static Component clickedInventoryComponent;
	@OriginalMember(owner = "client!nf", name = "h", descriptor = "Lclient!be;")
	public static Component mouseOverInventoryInterface;
	@OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
	public static int clickedInventoryComponentY = 0;
	@OriginalMember(owner = "client!ef", name = "r", descriptor = "Lclient!be;")
	public static Component aClass13_12 = null;
	@OriginalMember(owner = "client!bn", name = "O", descriptor = "I")
	public static int anInt761;
	@OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
	public static int anInt436;
	@OriginalMember(owner = "client!si", name = "ab", descriptor = "I")
	public static int anInt5138;
	@OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
	public static int anInt5103 = -1;
	@OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
	public static int clickedInventoryComponentCycle = 0;
	@OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
	public static int clickedInventoryComponentX = 0;
	@OriginalMember(owner = "client!og", name = "e", descriptor = "Lclient!be;")
	public static Component aClass13_22;
	@OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
	public static int anInt4271;
	@OriginalMember(owner = "client!lg", name = "b", descriptor = "Z")
	public static boolean aBoolean174 = false;
	@OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
	public static int mouseOverInventoryObjectIndex = 0;
	@OriginalMember(owner = "client!jj", name = "j", descriptor = "Z")
	public static boolean draggingClickedInventoryObject = false;
	@OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
	public static int anInt5574 = -1;
	@OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
	public static int anInt4311 = -2;
	@OriginalMember(owner = "client!pm", name = "hb", descriptor = "I")
	public static int anInt4620;
	@OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
	public static int anInt1885;
	@OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
	public static int anInt660 = -1;
	@OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
	public static int anInt3337 = 0;
	@OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
	public static int anInt3075 = -1;
	@OriginalMember(owner = "client!df", name = "n", descriptor = "I")
	public static int anInt1396 = 0;
	@OriginalMember(owner = "client!di", name = "H", descriptor = "Z")
	public static boolean aBoolean84 = false;
	@OriginalMember(owner = "client!dh", name = "a", descriptor = "Z")
	public static boolean aBoolean83 = false;
	@OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
	public static int anInt2941 = -1;
	@OriginalMember(owner = "client!a", name = "h", descriptor = "I")
	public static int anInt5;
	@OriginalMember(owner = "client!ve", name = "w", descriptor = "Z")
	public static boolean aBoolean298 = false;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZLclient!ve;Lclient!ve;Lclient!ve;Lclient!ve;)V")
	public static void init(@OriginalArg(1) Js5 arg0, @OriginalArg(2) Js5 arg1, @OriginalArg(3) Js5 arg2, @OriginalArg(4) Js5 arg3) {
		aClass153_12 = arg1;
		aClass153_64 = arg0;
		aClass153_84 = arg2;
		aClass153_85 = arg3;
		components = new Component[aClass153_84.capacity()][];
		aBooleanArray115 = new boolean[aClass153_84.capacity()];
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)V")
	public static void method2275(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !aBooleanArray115[arg0]) {
			return;
		}
		aClass153_84.discardUnpacked(arg0);
		if (components[arg0] == null) {
			return;
		}
		@Pc(27) boolean local27 = true;
		for (@Pc(29) int local29 = 0; local29 < components[arg0].length; local29++) {
			if (components[arg0][local29] != null) {
				if (components[arg0][local29].type == 2) {
					local27 = false;
				} else {
					components[arg0][local29] = null;
				}
			}
		}
		if (local27) {
			components[arg0] = null;
		}
		aBooleanArray115[arg0] = false;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(II)Z")
	public static boolean load(@OriginalArg(0) int arg0) {
		if (aBooleanArray115[arg0]) {
			return true;
		}

		if (aClass153_84.isGroupReady(arg0)) {
			@Pc(25) int local25 = aClass153_84.getGroupCapacity(arg0);
			if (local25 == 0) {
				aBooleanArray115[arg0] = true;
				return true;
			}
			if (components[arg0] == null) {
				components[arg0] = new Component[local25];
			}
			for (@Pc(46) int local46 = 0; local46 < local25; local46++) {
				if (components[arg0][local46] == null) {
					@Pc(62) byte[] local62 = aClass153_84.fetchFile(arg0, local46);
					if (local62 != null) {
						@Pc(74) Component local74 = components[arg0][local46] = new Component();
						local74.id = local46 + (arg0 << 16);
						if (local62[0] == -1) {
							local74.decodeIf3(new Buffer(local62));
						} else {
							local74.decodeIf1(new Buffer(local62));
						}
					}
				}
			}
			aBooleanArray115[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
	public static void method1287() {
		components = new Component[aClass153_84.capacity()][];
		aBooleanArray115 = new boolean[aClass153_84.capacity()];
	}

	@OriginalMember(owner = "client!i", name = "i", descriptor = "(Z)V")
	public static void redrawActiveInterfaces() {
		for (@Pc(6) ComponentPointer local6 = (ComponentPointer) openInterfaces.head(); local6 != null; local6 = (ComponentPointer) openInterfaces.next()) {
			@Pc(14) int local14 = local6.interfaceId;
			if (load(local14)) {
				@Pc(21) boolean local21 = true;
				@Pc(25) Component[] local25 = components[local14];
				@Pc(27) int local27;
				for (local27 = 0; local27 < local25.length; local27++) {
					if (local25[local27] != null) {
						local21 = local25[local27].if3;
						break;
					}
				}
				if (!local21) {
					local27 = (int) local6.key;
					@Pc(60) Component local60 = getComponent(local27);
					if (local60 != null) {
						redraw(local60);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)Lclient!be;")
	public static Component getComponent(@OriginalArg(1) int id) {
		try {
			@Pc(7) int parent = id >> 16;
			@Pc(18) int child = id & 0xFFFF;
			if (components.length <= parent || parent < 0) {
				return null;
			}
			if (components[parent] == null || components[parent].length <= child || components[parent][child] == null) {
				@Pc(33) boolean success = load(parent);
				if (!success) {
					return null;
				}
			}
			if (components[parent].length <= child) {
				return null;
			}
			return components[parent][child];
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!be;)Lclient!bf;")
	public static ServerActiveProperties getServerActiveProperties(@OriginalArg(0) Component arg0) {
		@Pc(13) ServerActiveProperties local13 = (ServerActiveProperties) properties.get(((long) arg0.id << 32) + (long) arg0.createdComponentId);
		return local13 == null ? arg0.properties : local13;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILclient!be;)V")
	public static void redraw(@OriginalArg(1) Component arg0) {
		if (anInt4311 == arg0.rectangleLoop) {
			aBooleanArray100[arg0.rectangle] = true;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!be;BI)Lclient!na;")
	public static JagString getOp(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1) {
		if (!getServerActiveProperties(arg0).isButtonEnabled(arg1) && arg0.onOptionClick == null) {
			return null;
		} else if (arg0.ops == null || arg0.ops.length <= arg1 || arg0.ops[arg1] == null || arg0.ops[arg1].trim().length() == 0) {
			return Cheat.qaOpTest ? JagString.concatenate(new JagString[]{aClass100_903, JagString.parseInt(arg1)}) : null;
		} else {
			return arg0.ops[arg1];
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BII)Lclient!be;")
	public static Component method1418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Component local7 = getComponent(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.createdComponents == null || local7.createdComponents.length <= arg1) {
			return null;
		} else {
			return local7.createdComponents[arg1];
		}
	}

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "(II)V")
	public static void method1753(@OriginalArg(0) int arg0) {
		if (!load(arg0)) {
			return;
		}
		@Pc(15) Component[] local15 = components[arg0];
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(29) Component local29 = local15[local17];
			if (local29 != null) {
				local29.anInt496 = 1;
				local29.anInt510 = 0;
				local29.anInt500 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZB)V")
	public static void method3712(@OriginalArg(0) boolean arg0) {
		method4017(GameShell.canvasHeight, arg0, topLevelInterface, GameShell.canvasWidth);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZIII)V")
	public static void method4017(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (load(arg2)) {
			method4190(-1, arg1, arg3, arg0, components[arg2]);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!be;ZI)V")
	public static void method531(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		@Pc(20) int local20 = arg0.scrollMaxH == 0 ? arg0.width : arg0.scrollMaxH;
		@Pc(32) int local32 = arg0.scrollMaxV == 0 ? arg0.height : arg0.scrollMaxV;
		method4190(arg0.id, arg1, local20, local32, components[arg0.id >> 16]);
		if (arg0.createdComponents != null) {
			method4190(arg0.id, arg1, local20, local32, arg0.createdComponents);
		}
		@Pc(66) ComponentPointer local66 = (ComponentPointer) openInterfaces.get(arg0.id);
		if (local66 != null) {
			method4017(local32, arg1, local66.interfaceId, local20);
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZIII[Lclient!be;)V")
	public static void method4190(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Component[] arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg4.length; local3++) {
			@Pc(19) Component local19 = arg4[local3];
			if (local19 != null && local19.overlayer == arg0) {
				method2801(arg3, arg2, local19, arg1);
				method2291(local19, arg3, arg2);
				if (local19.scrollMaxH - local19.width < local19.scrollX) {
					local19.scrollX = local19.scrollMaxH - local19.width;
				}
				if (local19.scrollY > local19.scrollMaxV - local19.height) {
					local19.scrollY = local19.scrollMaxV - local19.height;
				}
				if (local19.scrollY < 0) {
					local19.scrollY = 0;
				}
				if (local19.scrollX < 0) {
					local19.scrollX = 0;
				}
				if (local19.type == 0) {
					method531(local19, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(II)V")
	public static void method1626(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !load(arg0)) {
			return;
		}
		@Pc(31) Component[] local31 = components[arg0];
		for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
			@Pc(41) Component local41 = local31[local33];
			if (local41.anObjectArray3 != null) {
				@Pc(50) HookRequest local50 = new HookRequest();
				local50.arguments = local41.anObjectArray3;
				local50.source = local41;
				ScriptRunner.run(2000000, local50);
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZLclient!wk;Z)V")
	public static void closeInterface(@OriginalArg(0) boolean arg0, @OriginalArg(1) ComponentPointer arg1) {
		@Pc(9) int local9 = (int) arg1.key;
		@Pc(16) int local16 = arg1.interfaceId;
		arg1.unlink();
		if (arg0) {
			method2275(local16);
		}
		method3214(local16);
		@Pc(32) Component local32 = getComponent(local9);
		if (local32 != null) {
			redraw(local32);
		}
		@Pc(41) int local41 = MiniMenu.size;
		@Pc(43) int local43;
		for (local43 = 0; local43 < local41; local43++) {
			if (method5(MiniMenu.actions[local43])) {
				MiniMenu.remove(local43);
			}
		}
		if (MiniMenu.size == 1) {
			Cs1ScriptRunner.aBoolean108 = false;
			redrawScreen(anInt4271, anInt761, anInt5138, anInt436);
		} else {
			redrawScreen(anInt4271, anInt761, anInt5138, anInt436);
			local43 = Fonts.b12Full.getStringWidth(LocalizedText.CHOOSE_OPTION);
			for (@Pc(75) int local75 = 0; local75 < MiniMenu.size; local75++) {
				@Pc(88) int local88 = Fonts.b12Full.getStringWidth(MiniMenu.getOp(local75));
				if (local43 < local88) {
					local43 = local88;
				}
			}
			anInt436 = MiniMenu.size * 15 + (aBoolean298 ? 26 : 22);
			anInt761 = local43 + 8;
		}
		if (topLevelInterface != -1) {
			runScripts(1, topLevelInterface);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!be;III)V")
	public static void method2291(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.xMode == 0) {
			arg0.y = arg0.baseY;
		} else if (arg0.xMode == 1) {
			arg0.y = (arg1 - arg0.height) / 2 + arg0.baseY;
		} else if (arg0.xMode == 2) {
			arg0.y = arg1 - arg0.height - arg0.baseY;
		} else if (arg0.xMode == 3) {
			arg0.y = arg0.baseY * arg1 >> 14;
		} else if (arg0.xMode == 4) {
			arg0.y = (arg1 * arg0.baseY >> 14) + (arg1 - arg0.height) / 2;
		} else {
			arg0.y = arg1 - (arg1 * arg0.baseY >> 14) - arg0.height;
		}
		if (arg0.yMode == 0) {
			arg0.x = arg0.baseX;
		} else if (arg0.yMode == 1) {
			arg0.x = arg0.baseX + (arg2 - arg0.width) / 2;
		} else if (arg0.yMode == 2) {
			arg0.x = arg2 - arg0.baseX - arg0.width;
		} else if (arg0.yMode == 3) {
			arg0.x = arg0.baseX * arg2 >> 14;
		} else if (arg0.yMode == 4) {
			arg0.x = (arg0.baseX * arg2 >> 14) + (arg2 - arg0.width) / 2;
		} else {
			arg0.x = arg2 - (arg2 * arg0.baseX >> 14) - arg0.width;
		}
		if (!Cheat.qaOpTest || getServerActiveProperties(arg0).events == 0 && arg0.type != 0) {
			return;
		}
		if (arg0.y < 0) {
			arg0.y = 0;
		} else if (arg0.height + arg0.y > arg1) {
			arg0.y = arg1 - arg0.height;
		}
		if (arg0.x < 0) {
			arg0.x = 0;
		} else if (arg2 < arg0.x + arg0.width) {
			arg0.x = arg2 - arg0.width;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!be;)V")
	public static void update(@OriginalArg(1) Component arg0) {
		@Pc(7) Component local7 = method4668(arg0);
		@Pc(19) int local19;
		@Pc(17) int local17;
		if (local7 == null) {
			local17 = GameShell.canvasHeight;
			local19 = GameShell.canvasWidth;
		} else {
			local17 = local7.height;
			local19 = local7.width;
		}
		method2801(local17, local19, arg0, false);
		method2291(arg0, local17, local19);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIILclient!be;Z)V")
	public static void method2801(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) boolean arg3) {
		@Pc(4) int local4 = arg2.width;
		@Pc(7) int local7 = arg2.height;
		if (arg2.dynamicWidthValue == 0) {
			arg2.width = arg2.baseWidth;
		} else if (arg2.dynamicWidthValue == 1) {
			arg2.width = arg1 - arg2.baseWidth;
		} else if (arg2.dynamicWidthValue == 2) {
			arg2.width = arg2.baseWidth * arg1 >> 14;
		} else if (arg2.dynamicWidthValue == 3) {
			if (arg2.type == 2) {
				arg2.width = arg2.baseWidth * 32 + (arg2.baseWidth - 1) * arg2.invMarginX;
			} else if (arg2.type == 7) {
				arg2.width = arg2.baseWidth * 115 + arg2.invMarginX * (arg2.baseWidth - 1);
			}
		}
		if (arg2.dynamicHeightValue == 0) {
			arg2.height = arg2.baseHeight;
		} else if (arg2.dynamicHeightValue == 1) {
			arg2.height = arg0 - arg2.baseHeight;
		} else if (arg2.dynamicHeightValue == 2) {
			arg2.height = arg0 * arg2.baseHeight >> 14;
		} else if (arg2.dynamicHeightValue == 3) {
			if (arg2.type == 2) {
				arg2.height = (arg2.baseHeight - 1) * arg2.invMarginY + arg2.baseHeight * 32;
			} else if (arg2.type == 7) {
				arg2.height = arg2.baseHeight * 12 + (arg2.baseHeight - 1) * arg2.invMarginY;
			}
		}
		if (arg2.dynamicWidthValue == 4) {
			arg2.width = arg2.aspectWidth * arg2.height / arg2.aspectHeight;
		}
		if (arg2.dynamicHeightValue == 4) {
			arg2.height = arg2.aspectHeight * arg2.width / arg2.aspectWidth;
		}
		if (Cheat.qaOpTest && (getServerActiveProperties(arg2).events != 0 || arg2.type == 0)) {
			if (arg2.height < 5 && arg2.width < 5) {
				arg2.height = 5;
				arg2.width = 5;
			} else {
				if (arg2.width <= 0) {
					arg2.width = 5;
				}
				if (arg2.height <= 0) {
					arg2.height = 5;
				}
			}
		}
		if (arg2.clientCode == 1337) {
			aClass13_26 = arg2;
		}
		if (arg3 && arg2.onResize != null && (local4 != arg2.width || arg2.height != local7)) {
			@Pc(305) HookRequest local305 = new HookRequest();
			local305.arguments = arg2.onResize;
			local305.source = arg2;
			lowPriorityRequests.addTail(local305);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!be;I)Lclient!be;")
	public static Component method4668(@OriginalArg(0) Component arg0) {
		if (arg0.overlayer != -1) {
			return getComponent(arg0.overlayer);
		}
		@Pc(28) int local28 = arg0.id >>> 16;
		@Pc(33) HashTableIterator local33 = new HashTableIterator(openInterfaces);
		for (@Pc(38) ComponentPointer local38 = (ComponentPointer) local33.method2701(); local38 != null; local38 = (ComponentPointer) local33.method2700()) {
			if (local28 == local38.interfaceId) {
				return getComponent((int) local38.key);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIBII)V")
	public static void redrawScreen(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) int local12 = 0; local12 < rectangles; local12++) {
			if (rectangleWidth[local12] + rectangleX[local12] > arg0 && arg1 + arg0 > rectangleX[local12] && arg2 < rectangleHeight[local12] + rectangleY[local12] && rectangleY[local12] < arg2 + arg3) {
				aBooleanArray100[local12] = true;
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(BI)V")
	public static void method3214(@OriginalArg(1) int arg0) {
		for (@Pc(11) Node local11 = properties.head(); local11 != null; local11 = properties.next()) {
			if ((local11.key >> 48 & 0xFFFFL) == (long) arg0) {
				local11.unlink();
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V")
	public static void runScripts(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (load(arg1)) {
			method7(components[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "([Lclient!be;ZI)V")
	public static void method7(@OriginalArg(0) Component[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(23) Component local23 = arg0[local11];
			if (local23 != null) {
				if (local23.type == 0) {
					if (local23.createdComponents != null) {
						method7(local23.createdComponents, arg1);
					}
					@Pc(49) ComponentPointer local49 = (ComponentPointer) openInterfaces.get(local23.id);
					if (local49 != null) {
						runScripts(arg1, local49.interfaceId);
					}
				}
				@Pc(72) HookRequest local72;
				if (arg1 == 0 && local23.onDialogAbort != null) {
					local72 = new HookRequest();
					local72.arguments = local23.onDialogAbort;
					local72.source = local23;
					ScriptRunner.run(local72);
				}
				if (arg1 == 1 && local23.onWidgetsOpenClose != null) {
					if (local23.createdComponentId >= 0) {
						@Pc(103) Component local103 = getComponent(local23.id);
						if (local103 == null || local103.createdComponents == null || local23.createdComponentId >= local103.createdComponents.length || local103.createdComponents[local23.createdComponentId] != local23) {
							continue;
						}
					}
					local72 = new HookRequest();
					local72.arguments = local23.onWidgetsOpenClose;
					local72.source = local23;
					ScriptRunner.run(local72);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (load(arg4)) {
			method946(components[arg4], -1, arg5, arg1, arg3, arg6, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!be;IIIIIII)V")
	public static void method946(@OriginalArg(0) Component[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Component component = arg0[local1];
			if (component != null && component.overlayer == arg1 && (!component.if3 || component.type == 0 || component.aBoolean25 || getServerActiveProperties(component).events != 0 || component == Cs1ScriptRunner.aClass13_1 || component.clientCode == 1338) && (!component.if3 || !method947(component))) {
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
				if (component == Cs1ScriptRunner.aClass13_14) {
					aBoolean83 = true;
					anInt3075 = local50;
					anInt660 = local55;
				}
				if (!component.if3 || local61 < local65 && local63 < local67) {
					if (component.type == 0) {
						if (!component.if3 && method947(component) && aClass13_22 != component) {
							continue;
						}
						if (component.noClickThrough && Mouse.lastMouseX >= local61 && Mouse.lastMouseY >= local63 && Mouse.lastMouseX < local65 && Mouse.lastMouseY < local67) {
							for (@Pc(164) HookRequest local164 = (HookRequest) lowPriorityRequests.head(); local164 != null; local164 = (HookRequest) lowPriorityRequests.next()) {
								if (local164.aBoolean158) {
									local164.unlink();
									local164.source.aBoolean19 = false;
								}
							}
							if (Cs1ScriptRunner.anInt4851 == 0) {
								Cs1ScriptRunner.aClass13_14 = null;
								Cs1ScriptRunner.aClass13_1 = null;
							}
							anInt3337 = 0;
						}
					}
					if (component.if3) {
						@Pc(207) boolean local207;
						local207 = Mouse.lastMouseX >= local61 && Mouse.lastMouseY >= local63 && Mouse.lastMouseX < local65 && Mouse.lastMouseY < local67;
						@Pc(212) boolean local212 = Mouse.pressedButton == 1 && local207;
						@Pc(221) boolean local221 = Mouse.clickButton == 1 && Mouse.clickX >= local61 && Mouse.clickY >= local63 && Mouse.clickX < local65 && Mouse.clickY < local67;
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
							Cs1ScriptRunner.method1015(Mouse.clickY - local55, Mouse.clickX - local50, component);
						}
						if (Cs1ScriptRunner.aClass13_14 != null && Cs1ScriptRunner.aClass13_14 != component && local207 && getServerActiveProperties(component).isDragTarget()) {
							aClass13_12 = component;
						}
						if (component == Cs1ScriptRunner.aClass13_1) {
							aBoolean174 = true;
							Cs1ScriptRunner.anInt2225 = local50;
							anInt5103 = local55;
						}
						if (component.aBoolean25 || component.clientCode != 0) {
							@Pc(399) HookRequest request;
							if (local207 && MouseWheel.wheelRotation != 0 && component.onScroll != null) {
								request = new HookRequest();
								request.aBoolean158 = true;
								request.source = component;
								request.mouseY = MouseWheel.wheelRotation;
								request.arguments = component.onScroll;
								lowPriorityRequests.addTail(request);
							}
							if (Cs1ScriptRunner.aClass13_14 != null || clickedInventoryComponent != null || Cs1ScriptRunner.aBoolean108 || component.clientCode != 1400 && anInt3337 > 0) {
								local221 = false;
								local212 = false;
								local207 = false;
							}
							@Pc(508) int skill;
							if (component.clientCode != 0) {
								if (component.clientCode == 1337) {
									aClass13_26 = component;
									redraw(component);
									continue;
								}
								if (component.clientCode == 1338) {
									if (local221) {
										anInt5 = Mouse.clickX - local50;
										MiniMenu.anInt2878 = Mouse.clickY - local55;
									}
									continue;
								}
								if (component.clientCode == 1400) {
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
										Cs1ScriptRunner.anInt5388 = Mouse.lastMouseX;
										Cs1ScriptRunner.anInt4035 = Mouse.lastMouseY;
										continue;
									}
									if (local212 && anInt3337 > 0) {
										if (anInt3337 == 1 && (Cs1ScriptRunner.anInt5388 != Mouse.lastMouseX || Cs1ScriptRunner.anInt4035 != Mouse.lastMouseY)) {
											anInt4620 = WorldMap.anInt435;
											anInt1885 = WorldMap.anInt919;
											anInt3337 = 2;
										}
										if (anInt3337 == 2) {
											WorldMap.method1964(anInt4620 + (int) ((double) (Cs1ScriptRunner.anInt5388 - Mouse.lastMouseX) * 2.0D / (double) WorldMap.targetZoom));
											WorldMap.method4641(anInt1885 + (int) ((double) (Cs1ScriptRunner.anInt4035 - Mouse.lastMouseY) * 2.0D / (double) WorldMap.targetZoom));
										}
										continue;
									}
									anInt3337 = 0;
									continue;
								}
								if (component.clientCode == 1401) {
									if (local212) {
										WorldMap.method2387(component.width, Mouse.lastMouseY - local55, Mouse.lastMouseX - local50, component.height);
									}
									continue;
								}
								if (component.clientCode == 1402) {
									if (!GlRenderer.enabled) {
										redraw(component);
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
									lowPriorityRequests.addTail(request);
								}
							}
							if (component.aBoolean24 && local212 && component.onDrag != null) {
								request = new HookRequest();
								request.aBoolean158 = true;
								request.source = component;
								request.mouseX = Mouse.lastMouseX - local50;
								request.mouseY = Mouse.lastMouseY - local55;
								request.arguments = component.onDrag;
								lowPriorityRequests.addTail(request);
							}
							if (component.aBoolean24 && !local212) {
								component.aBoolean24 = false;
								if (component.onRelease != null) {
									request = new HookRequest();
									request.aBoolean158 = true;
									request.source = component;
									request.mouseX = Mouse.lastMouseX - local50;
									request.mouseY = Mouse.lastMouseY - local55;
									request.arguments = component.onRelease;
									mediumPriorityRequests.addTail(request);
								}
							}
							if (local212 && component.onHold != null) {
								request = new HookRequest();
								request.aBoolean158 = true;
								request.source = component;
								request.mouseX = Mouse.lastMouseX - local50;
								request.mouseY = Mouse.lastMouseY - local55;
								request.arguments = component.onHold;
								lowPriorityRequests.addTail(request);
							}
							if (!component.aBoolean19 && local207) {
								component.aBoolean19 = true;
								if (component.onMouseOver != null) {
									request = new HookRequest();
									request.aBoolean158 = true;
									request.source = component;
									request.mouseX = Mouse.lastMouseX - local50;
									request.mouseY = Mouse.lastMouseY - local55;
									request.arguments = component.onMouseOver;
									lowPriorityRequests.addTail(request);
								}
							}
							if (component.aBoolean19 && local207 && component.onMouseRepeat != null) {
								request = new HookRequest();
								request.aBoolean158 = true;
								request.source = component;
								request.mouseX = Mouse.lastMouseX - local50;
								request.mouseY = Mouse.lastMouseY - local55;
								request.arguments = component.onMouseRepeat;
								lowPriorityRequests.addTail(request);
							}
							if (component.aBoolean19 && !local207) {
								component.aBoolean19 = false;
								if (component.onMouseLeave != null) {
									request = new HookRequest();
									request.aBoolean158 = true;
									request.source = component;
									request.mouseX = Mouse.lastMouseX - local50;
									request.mouseY = Mouse.lastMouseY - local55;
									request.arguments = component.onMouseLeave;
									mediumPriorityRequests.addTail(request);
								}
							}
							if (component.onTimer != null) {
								request = new HookRequest();
								request.source = component;
								request.arguments = component.onTimer;
								highPriorityRequests.addTail(request);
							}
							@Pc(966) HookRequest request2;
							if (component.onVarcTransmit != null && VarcDomain.updatedVarcsWriterIndex > component.updatedVarcsReaderIndex) {
								if (component.varcTriggers == null || VarcDomain.updatedVarcsWriterIndex - component.updatedVarcsReaderIndex > 32) {
									request = new HookRequest();
									request.source = component;
									request.arguments = component.onVarcTransmit;
									lowPriorityRequests.addTail(request);
								} else {
									label563:
									for (i = component.updatedVarcsReaderIndex; i < VarcDomain.updatedVarcsWriterIndex; i++) {
										skill = VarcDomain.updatedVarcs[i & 0x1F];
										for (k = 0; k < component.varcTriggers.length; k++) {
											if (component.varcTriggers[k] == skill) {
												request2 = new HookRequest();
												request2.source = component;
												request2.arguments = component.onVarcTransmit;
												lowPriorityRequests.addTail(request2);
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
									lowPriorityRequests.addTail(request);
								} else {
									label539:
									for (i = component.updatedVarcstrsReaderIndex; i < VarcDomain.updatedVarcstrsWriterIndex; i++) {
										skill = VarcDomain.updatedVarcstrs[i & 0x1F];
										for (k = 0; k < component.varcstrTriggers.length; k++) {
											if (component.varcstrTriggers[k] == skill) {
												request2 = new HookRequest();
												request2.source = component;
												request2.arguments = component.onVarcstrTransmit;
												lowPriorityRequests.addTail(request2);
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
									lowPriorityRequests.addTail(request);
								} else {
									label515:
									for (i = component.updatedVarpsReaderIndex; i < VarpDomain.updatedVarpsWriterIndex; i++) {
										skill = VarpDomain.updatedVarps[i & 0x1F];
										for (k = 0; k < component.varpTriggers.length; k++) {
											if (component.varpTriggers[k] == skill) {
												request2 = new HookRequest();
												request2.source = component;
												request2.arguments = component.onVarpTransmit;
												lowPriorityRequests.addTail(request2);
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
									lowPriorityRequests.addTail(request);
								} else {
									outer:
									for (i = component.updatedInventoriesReaderIndex; i < Inv.updatedInventoriesWriterIndex; i++) {
										skill = Inv.updatedInventories[i & 0x1F];
										for (k = 0; k < component.inventoryTriggers.length; k++) {
											if (component.inventoryTriggers[k] == skill) {
												request2 = new HookRequest();
												request2.source = component;
												request2.arguments = component.onInvTransmit;
												lowPriorityRequests.addTail(request2);
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
									lowPriorityRequests.addTail(request);
								} else {
									outer:
									for (i = component.updatedStatsReaderIndex; i < PlayerSkillXpTable.updatedStatsWriterIndex; i++) {
										skill = PlayerSkillXpTable.updatedStats[i & 0x1F];
										for (k = 0; k < component.statTriggers.length; k++) {
											if (component.statTriggers[k] == skill) {
												request2 = new HookRequest();
												request2.source = component;
												request2.arguments = component.onStatTransmit;
												lowPriorityRequests.addTail(request2);
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
								lowPriorityRequests.addTail(request);
							}
							if (FriendsList.transmitAt > component.lastTransmitTimer && component.onFriendTransmit != null) {
								request = new HookRequest();
								request.source = component;
								request.arguments = component.onFriendTransmit;
								lowPriorityRequests.addTail(request);
							}
							if (ClanChat.transmitAt > component.lastTransmitTimer && component.onClanTransmit != null) {
								request = new HookRequest();
								request.source = component;
								request.arguments = component.onClanTransmit;
								lowPriorityRequests.addTail(request);
							}
							if (StockMarketManager.transmitAt > component.lastTransmitTimer && component.onStockTransmit != null) {
								request = new HookRequest();
								request.source = component;
								request.arguments = component.onStockTransmit;
								lowPriorityRequests.addTail(request);
							}
							if (miscTransmitAt > component.lastTransmitTimer && component.onMiscTransmit != null) {
								request = new HookRequest();
								request.source = component;
								request.arguments = component.onMiscTransmit;
								lowPriorityRequests.addTail(request);
							}
							component.lastTransmitTimer = transmitTimer;
							if (component.onKey != null) {
								for (i = 0; i < keyQueueSize; i++) {
									@Pc(1430) HookRequest local1430 = new HookRequest();
									local1430.source = component;
									local1430.keyCode = keyCodes[i];
									local1430.keyChar = keyChars[i];
									local1430.arguments = component.onKey;
									lowPriorityRequests.addTail(local1430);
								}
							}
							if (Camera.aBoolean16 && component.onMinimapUnlock != null) {
								request = new HookRequest();
								request.source = component;
								request.arguments = component.onMinimapUnlock;
								lowPriorityRequests.addTail(request);
							}
						}
					}
					if (!component.if3 && Cs1ScriptRunner.aClass13_14 == null && clickedInventoryComponent == null && !Cs1ScriptRunner.aBoolean108) {
						if ((component.anInt470 >= 0 || component.overColor != 0) && Mouse.lastMouseX >= local61 && Mouse.lastMouseY >= local63 && Mouse.lastMouseX < local65 && Mouse.lastMouseY < local67) {
							if (component.anInt470 >= 0) {
								aClass13_22 = arg0[component.anInt470];
							} else {
								aClass13_22 = component;
							}
						}
						if (component.type == 8 && Mouse.lastMouseX >= local61 && Mouse.lastMouseY >= local63 && Mouse.lastMouseX < local65 && Mouse.lastMouseY < local67) {
							Protocol.aClass13_11 = component;
						}
						if (component.scrollMaxV > component.height) {
							method4049(Mouse.lastMouseY, component.height, component, Mouse.lastMouseX, local50 + component.width, local55, component.scrollMaxV);
						}
					}
					if (component.type == 0) {
						method946(arg0, component.id, local61, local63, local65, local67, local50 - component.scrollX, local55 - component.scrollY);
						if (component.createdComponents != null) {
							method946(component.createdComponents, component.id, local61, local63, local65, local67, local50 - component.scrollX, local55 - component.scrollY);
						}
						@Pc(1595) ComponentPointer local1595 = (ComponentPointer) openInterfaces.get(component.id);
						if (local1595 != null) {
							method1320(local50, local63, local55, local65, local1595.interfaceId, local61, local67);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(SI)Z")
	public static boolean method5(@OriginalArg(0) short arg0) {
		if (arg0 == 47 || arg0 == 5 || arg0 == 43 || arg0 == 35 || arg0 == 58 || arg0 == 22 || arg0 == 40 || arg0 == 3) {
			return true;
		} else if (arg0 == 9 || arg0 == 12 || arg0 == 1006 || arg0 == 1003) {
			return true;
		} else if (arg0 == 25 || arg0 == 23 || arg0 == 48 || arg0 == 7 || arg0 == 13) {
			return true;
		} else {
			return arg0 == 8 || arg0 == 32 || arg0 == 28 || arg0 == 59 || arg0 == 51 || arg0 == 41;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZI)V")
	public static void method1596(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (topLevelInterface != -1) {
				method2275(topLevelInterface);
			}
			for (@Pc(18) ComponentPointer local18 = (ComponentPointer) openInterfaces.head(); local18 != null; local18 = (ComponentPointer) openInterfaces.next()) {
				closeInterface(true, local18);
			}
			topLevelInterface = -1;
			openInterfaces = new HashTable(8);
			method1287();
			topLevelInterface = LoginManager.loginScreenId;
			method3712(false);
			ScriptRunner.method1807();
			method1626(topLevelInterface);
		}
		MiniMenu.anInt1092 = -1;
		method1750(ScriptRunner.anInt5794);
		PlayerList.self = new Player();
		PlayerList.self.zFine = 3000;
		PlayerList.self.xFine = 3000;
		if (!GlRenderer.enabled) {
			Flames.load(client.js5Archive8);
			client.setGameState(10);
			return;
		}
		if (Camera.cameraType == 2) {
			Camera.renderX = Camera.anInt5375 << 7;
			Camera.renderZ = Camera.anInt4232 << 7;
		} else {
			Camera.updateLoginScreenCamera();
		}
		FogManager.setInstantFade();
		LoginManager.setupLoadingScreenRegion();
		client.setGameState(28);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBIII)V")
	public static void forceRedrawScreen(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < rectangles; local3++) {
			if (arg0 < rectangleX[local3] + rectangleWidth[local3] && arg0 + arg3 > rectangleX[local3] && rectangleY[local3] + rectangleHeight[local3] > arg1 && rectangleY[local3] < arg2 + arg1) {
				rectangleRedraw[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V")
	public static void method2460() {
		if (topLevelInterface != -1) {
			method1949(topLevelInterface);
		}
		for (@Pc(15) int local15 = 0; local15 < rectangles; local15++) {
			if (aBooleanArray100[local15]) {
				rectangleRedraw[local15] = true;
			}
			aBooleanArray116[local15] = aBooleanArray100[local15];
			aBooleanArray100[local15] = false;
		}
		Cs1ScriptRunner.anInt2503 = -1;
		mouseOverInventoryInterface = null;
		anInt4311 = client.loop;
		if (GlRenderer.enabled) {
			ScriptRunner.aBoolean299 = true;
		}
		anInt5574 = -1;
		if (topLevelInterface != -1) {
			rectangles = 0;
			Cs1ScriptRunner.method182();
		}
		if (GlRenderer.enabled) {
			GlRaster.method1177();
		} else {
			SoftwareRaster.method2503();
		}
		Protocol.sceneDelta = 0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!be;)Lclient!be;")
	public static Component method938(@OriginalArg(0) Component arg0) {
		@Pc(4) int local4 = getServerActiveProperties(arg0).getDragDepth();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = getComponent(arg0.overlayer);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!be;)Z")
	public static boolean method947(@OriginalArg(0) Component arg0) {
		if (Cheat.qaOpTest) {
			if (getServerActiveProperties(arg0).events != 0) {
				return false;
			}
			if (arg0.type == 0) {
				return false;
			}
		}
		return arg0.hidden;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILclient!be;BIIII)V")
	public static void method4049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (aBoolean84) {
			anInt1396 = 32;
		} else {
			anInt1396 = 0;
		}
		aBoolean84 = false;
		@Pc(139) int local139;
		if (Mouse.pressedButton != 0) {
			if (arg4 <= arg3 && arg4 + 16 > arg3 && arg0 >= arg5 && arg5 + 16 > arg0) {
				arg2.scrollY -= 4;
				redraw(arg2);
			} else if (arg3 >= arg4 && arg3 < arg4 + 16 && arg0 >= arg1 + arg5 - 16 && arg1 + arg5 > arg0) {
				arg2.scrollY += 4;
				redraw(arg2);
			} else if (arg3 >= arg4 - anInt1396 && arg3 < arg4 + anInt1396 + 16 && arg0 >= arg5 + 16 && arg1 + arg5 - 16 > arg0) {
				local139 = arg1 * (arg1 - 32) / arg6;
				if (local139 < 8) {
					local139 = 8;
				}
				@Pc(150) int local150 = arg1 - local139 - 32;
				@Pc(162) int local162 = arg0 - local139 / 2 - arg5 - 16;
				arg2.scrollY = (arg6 - arg1) * local162 / local150;
				redraw(arg2);
				aBoolean84 = true;
			}
		}
		if (MouseWheel.wheelRotation == 0) {
			return;
		}
		local139 = arg2.width;
		if (arg4 - local139 <= arg3 && arg5 <= arg0 && arg3 < arg4 + 16 && arg1 + arg5 >= arg0) {
			arg2.scrollY += MouseWheel.wheelRotation * 45;
			redraw(arg2);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V")
	public static void method1949(@OriginalArg(1) int arg0) {
		if (load(arg0)) {
			method2354(-1, components[arg0]);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II[Lclient!be;)V")
	public static void method2354(@OriginalArg(1) int arg0, @OriginalArg(2) Component[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(15) Component local15 = arg1[local7];
			if (local15 != null && local15.overlayer == arg0 && (!local15.if3 || !method947(local15))) {
				if (local15.type == 0) {
					if (!local15.if3 && method947(local15) && local15 != aClass13_22) {
						continue;
					}
					method2354(local15.id, arg1);
					if (local15.createdComponents != null) {
						method2354(local15.id, local15.createdComponents);
					}
					@Pc(73) ComponentPointer local73 = (ComponentPointer) openInterfaces.get(local15.id);
					if (local73 != null) {
						method1949(local73.interfaceId);
					}
				}
				if (local15.type == 6) {
					@Pc(105) int local105;
					if (local15.modelSeqId != -1 || local15.activeModelSeqId != -1) {
						@Pc(100) boolean local100 = Cs1ScriptRunner.isTrue(local15);
						if (local100) {
							local105 = local15.activeModelSeqId;
						} else {
							local105 = local15.modelSeqId;
						}
						if (local105 != -1) {
							@Pc(118) SeqType local118 = SeqTypeList.get(local105);
							if (local118 != null) {
								local15.anInt500 += Protocol.sceneDelta;
								while (local15.anInt500 > local118.frameDelay[local15.anInt510]) {
									local15.anInt500 -= local118.frameDelay[local15.anInt510];
									local15.anInt510++;
									if (local118.frames.length <= local15.anInt510) {
										local15.anInt510 -= local118.replayoff;
										if (local15.anInt510 < 0 || local118.frames.length <= local15.anInt510) {
											local15.anInt510 = 0;
										}
									}
									local15.anInt496 = local15.anInt510 + 1;
									if (local118.frames.length <= local15.anInt496) {
										local15.anInt496 -= local118.replayoff;
										if (local15.anInt496 < 0 || local118.frames.length <= local15.anInt496) {
											local15.anInt496 = -1;
										}
									}
									redraw(local15);
								}
							}
						}
					}
					if (local15.modelRotationSpeed != 0 && !local15.if3) {
						@Pc(239) int local239 = local15.modelRotationSpeed >> 16;
						@Pc(243) int local243 = local239 * Protocol.sceneDelta;
						local105 = local15.modelRotationSpeed << 16 >> 16;
						local15.modelXAngle = local243 + local15.modelXAngle & 0x7FF;
						local105 *= Protocol.sceneDelta;
						local15.modelYAngle = local15.modelYAngle + local105 & 0x7FF;
						redraw(local15);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(II)V")
	public static void method1750(@OriginalArg(0) int arg0) {
		if (!Preferences.cursorsEnabled) {
			arg0 = -1;
		}
		if (arg0 == anInt2941) {
			return;
		}
		if (arg0 != -1) {
			@Pc(24) CursorType local24 = CursorTypeList.get(arg0);
			@Pc(28) SoftwareSprite local28 = local24.getSprite();
			if (local28 == null) {
				arg0 = -1;
			} else {
				GameShell.signLink.setCursor(local28.method301(), local28.anInt1860, GameShell.canvas, new Point(local24.hotSpotX, local24.hotSpotY), local28.anInt1866);
				anInt2941 = arg0;
			}
		}
		if (arg0 == -1 && anInt2941 != -1) {
			GameShell.signLink.setCursor(null, -1, GameShell.canvas, new Point(), -1);
			anInt2941 = -1;
		}
	}
}
