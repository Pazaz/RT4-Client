package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Component {

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "Lclient!n;")
	public static final SoftLruHashTable sprites = new SoftLruHashTable(200);

	@OriginalMember(owner = "client!jk", name = "z", descriptor = "Lclient!n;")
	public static final SoftLruHashTable models = new SoftLruHashTable(50);

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "Lclient!n;")
	public static final SoftLruHashTable fonts = new SoftLruHashTable(20);

	@OriginalMember(owner = "client!rc", name = "C", descriptor = "Z")
	public static boolean aBoolean72 = false;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "[Ljava/lang/Object;")
	public Object[] onFriendTransmit;

	@OriginalMember(owner = "client!be", name = "d", descriptor = "[Ljava/lang/Object;")
	public Object[] onStatTransmit;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "[Ljava/lang/Object;")
	public Object[] anObjectArray3;

	@OriginalMember(owner = "client!be", name = "g", descriptor = "[Ljava/lang/Object;")
	public Object[] onVarcTransmit;

	@OriginalMember(owner = "client!be", name = "k", descriptor = "[Ljava/lang/Object;")
	public Object[] onClickRepeat;

	@OriginalMember(owner = "client!be", name = "p", descriptor = "[Ljava/lang/Object;")
	public Object[] onDrag;

	@OriginalMember(owner = "client!be", name = "q", descriptor = "[Lclient!na;")
	public JagString[] ops;

	@OriginalMember(owner = "client!be", name = "s", descriptor = "[Lclient!na;")
	public JagString[] invOptions;

	@OriginalMember(owner = "client!be", name = "t", descriptor = "[Ljava/lang/Object;")
	public Object[] onInvTransmit;

	@OriginalMember(owner = "client!be", name = "u", descriptor = "[I")
	public int[] inventoryTriggers;

	@OriginalMember(owner = "client!be", name = "v", descriptor = "[Ljava/lang/Object;")
	public Object[] onWidgetsOpenClose;

	@OriginalMember(owner = "client!be", name = "x", descriptor = "Z")
	public boolean vFlip;

	@OriginalMember(owner = "client!be", name = "z", descriptor = "[Ljava/lang/Object;")
	public Object[] onHold;

	@OriginalMember(owner = "client!be", name = "E", descriptor = "[Ljava/lang/Object;")
	public Object[] onScroll;

	@OriginalMember(owner = "client!be", name = "G", descriptor = "[I")
	public int[] varcstrTriggers;

	@OriginalMember(owner = "client!be", name = "I", descriptor = "I")
	public int type;

	@OriginalMember(owner = "client!be", name = "V", descriptor = "[I")
	public int[] invSprite;

	@OriginalMember(owner = "client!be", name = "X", descriptor = "Z")
	public boolean hFlip;

	@OriginalMember(owner = "client!be", name = "Z", descriptor = "I")
	public int modelId;

	@OriginalMember(owner = "client!be", name = "bb", descriptor = "[Ljava/lang/Object;")
	public Object[] onUse;

	@OriginalMember(owner = "client!be", name = "fb", descriptor = "[Ljava/lang/Object;")
	public Object[] onDialogAbort;

	@OriginalMember(owner = "client!be", name = "gb", descriptor = "[I")
	public int[] anIntArray37;

	@OriginalMember(owner = "client!be", name = "kb", descriptor = "[I")
	public int[] varcTriggers;

	@OriginalMember(owner = "client!be", name = "qb", descriptor = "[Ljava/lang/Object;")
	public Object[] onMinimapUnlock;

	@OriginalMember(owner = "client!be", name = "tb", descriptor = "[Ljava/lang/Object;")
	public Object[] onKey;

	@OriginalMember(owner = "client!be", name = "ub", descriptor = "[Ljava/lang/Object;")
	public Object[] onVarcstrTransmit;

	@OriginalMember(owner = "client!be", name = "Db", descriptor = "[Ljava/lang/Object;")
	public Object[] onDragRelease;

	@OriginalMember(owner = "client!be", name = "Fb", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!be", name = "Jb", descriptor = "[Ljava/lang/Object;")
	public Object[] onResize;

	@OriginalMember(owner = "client!be", name = "Nb", descriptor = "[Ljava/lang/Object;")
	public Object[] onRelease;

	@OriginalMember(owner = "client!be", name = "Xb", descriptor = "[Ljava/lang/Object;")
	public Object[] onMouseOver;

	@OriginalMember(owner = "client!be", name = "Yb", descriptor = "[I")
	public int[] anIntArray39;

	@OriginalMember(owner = "client!be", name = "dc", descriptor = "[I")
	public int[] objTypes;

	@OriginalMember(owner = "client!be", name = "fc", descriptor = "[Ljava/lang/Object;")
	public Object[] onMsg;

	@OriginalMember(owner = "client!be", name = "lc", descriptor = "[Lclient!be;")
	public Component[] createdComponents;

	@OriginalMember(owner = "client!be", name = "mc", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!be", name = "rc", descriptor = "[Ljava/lang/Object;")
	public Object[] onStockTransmit;

	@OriginalMember(owner = "client!be", name = "tc", descriptor = "[Ljava/lang/Object;")
	public Object[] onTimer;

	@OriginalMember(owner = "client!be", name = "yc", descriptor = "[I")
	public int[] invOffsetX;

	@OriginalMember(owner = "client!be", name = "Ac", descriptor = "[I")
	public int[] statTriggers;

	@OriginalMember(owner = "client!be", name = "Bc", descriptor = "[I")
	public int[] cs1ComparisonOpcodes;

	@OriginalMember(owner = "client!be", name = "Cc", descriptor = "[Ljava/lang/Object;")
	public Object[] onMouseRepeat;

	@OriginalMember(owner = "client!be", name = "Ic", descriptor = "[Ljava/lang/Object;")
	public Object[] onMouseLeave;

	@OriginalMember(owner = "client!be", name = "Jc", descriptor = "[Ljava/lang/Object;")
	public Object[] onVarpTransmit;

	@OriginalMember(owner = "client!be", name = "Nc", descriptor = "[I")
	public int[] varpTriggers;

	@OriginalMember(owner = "client!be", name = "Tc", descriptor = "[I")
	public int[] anIntArray45;

	@OriginalMember(owner = "client!be", name = "Xc", descriptor = "[Ljava/lang/Object;")
	public Object[] onDragStart;

	@OriginalMember(owner = "client!be", name = "ad", descriptor = "[[I")
	public int[][] cs1Scripts;

	@OriginalMember(owner = "client!be", name = "bd", descriptor = "[I")
	public int[] anIntArray46;

	@OriginalMember(owner = "client!be", name = "cd", descriptor = "[I")
	public int[] invOffsetY;

	@OriginalMember(owner = "client!be", name = "gd", descriptor = "[Ljava/lang/Object;")
	public Object[] onUseWith;

	@OriginalMember(owner = "client!be", name = "kd", descriptor = "[I")
	public int[] cs1ComparisonOperands;

	@OriginalMember(owner = "client!be", name = "nd", descriptor = "[I")
	public int[] anIntArray49;

	@OriginalMember(owner = "client!be", name = "qd", descriptor = "[Ljava/lang/Object;")
	public Object[] onClanTransmit;

	@OriginalMember(owner = "client!be", name = "rd", descriptor = "[Ljava/lang/Object;")
	public Object[] onOptionClick;

	@OriginalMember(owner = "client!be", name = "sd", descriptor = "[Ljava/lang/Object;")
	public Object[] onMiscTransmit;

	@OriginalMember(owner = "client!be", name = "wd", descriptor = "[I")
	public int[] objCounts;

	@OriginalMember(owner = "client!be", name = "H", descriptor = "Z")
	public boolean spriteTiling = false;

	@OriginalMember(owner = "client!be", name = "f", descriptor = "I")
	public int aspectHeight = 1;

	@OriginalMember(owner = "client!be", name = "R", descriptor = "I")
	public int height = 0;

	@OriginalMember(owner = "client!be", name = "S", descriptor = "I")
	public int halign = 0;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "I")
	public int modelZoom = 100;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "B")
	public byte xMode = 0;

	@OriginalMember(owner = "client!be", name = "jb", descriptor = "I")
	public int y = 0;

	@OriginalMember(owner = "client!be", name = "nb", descriptor = "I")
	public int dragDeadzone = 0;

	@OriginalMember(owner = "client!be", name = "W", descriptor = "I")
	public int activeModelSeqId = -1;

	@OriginalMember(owner = "client!be", name = "o", descriptor = "S")
	public short aShort10 = 3000;

	@OriginalMember(owner = "client!be", name = "D", descriptor = "I")
	public int modelXAngle = 0;

	@OriginalMember(owner = "client!be", name = "Eb", descriptor = "I")
	public int anInt481 = 0;

	@OriginalMember(owner = "client!be", name = "A", descriptor = "Z")
	public boolean modelOrtho = false;

	@OriginalMember(owner = "client!be", name = "zb", descriptor = "Z")
	public boolean filled = false;

	@OriginalMember(owner = "client!be", name = "y", descriptor = "I")
	public int dragDeadtime = 0;

	@OriginalMember(owner = "client!be", name = "hb", descriptor = "I")
	public int scrollY = 0;

	@OriginalMember(owner = "client!be", name = "xb", descriptor = "I")
	public int spriteId = -1;

	@OriginalMember(owner = "client!be", name = "eb", descriptor = "I")
	public int vpadding = 0;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Z")
	public boolean hidden = false;

	@OriginalMember(owner = "client!be", name = "Zb", descriptor = "I")
	public int lineWidth = 1;

	@OriginalMember(owner = "client!be", name = "Mb", descriptor = "I")
	public int anInt484 = -1;

	@OriginalMember(owner = "client!be", name = "O", descriptor = "I")
	public int createdComponentId = -1;

	@OriginalMember(owner = "client!be", name = "J", descriptor = "Z")
	public boolean aBoolean24 = false;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "Lclient!na;")
	public static final JagString EMPTY_STRING = JagString.parse("");
	@OriginalMember(owner = "client!be", name = "Sb", descriptor = "Lclient!na;")
	public JagString optionSuffix = EMPTY_STRING;

	@OriginalMember(owner = "client!be", name = "i", descriptor = "Z")
	public boolean aBoolean19 = false;

	@OriginalMember(owner = "client!be", name = "yb", descriptor = "I")
	public int valign = 0;

	@OriginalMember(owner = "client!be", name = "lb", descriptor = "I")
	public int anInt470 = -1;

	@OriginalMember(owner = "client!be", name = "m", descriptor = "Z")
	public boolean aBoolean20 = false;

	@OriginalMember(owner = "client!be", name = "pc", descriptor = "I")
	public int anInt499 = -1;

	@OriginalMember(owner = "client!be", name = "Qb", descriptor = "B")
	public byte dynamicHeightValue = 0;

	@OriginalMember(owner = "client!be", name = "bc", descriptor = "I")
	public int scrollMaxV = 0;

	@OriginalMember(owner = "client!be", name = "Y", descriptor = "Z")
	public boolean dragRenderBehavior = false;

	@OriginalMember(owner = "client!be", name = "ob", descriptor = "Z")
	public boolean shadowed = false;

	@OriginalMember(owner = "client!be", name = "cb", descriptor = "I")
	public int rectangleLoop = -1;

	@OriginalMember(owner = "client!be", name = "jc", descriptor = "I")
	public int anInt496 = 1;

	@OriginalMember(owner = "client!be", name = "Cb", descriptor = "I")
	public int overColor = 0;

	@OriginalMember(owner = "client!be", name = "Hb", descriptor = "Z")
	public boolean if3 = false;

	@OriginalMember(owner = "client!di", name = "F", descriptor = "Lclient!bf;")
	public static final ServerActiveProperties DEFAULT_SERVER_ACTIVE_PROPERTIES = new ServerActiveProperties(0, -1);

	@OriginalMember(owner = "client!be", name = "gc", descriptor = "Lclient!bf;")
	public ServerActiveProperties properties = DEFAULT_SERVER_ACTIVE_PROPERTIES;

	@OriginalMember(owner = "client!be", name = "cc", descriptor = "I")
	public int activeColor = 0;

	@OriginalMember(owner = "client!be", name = "Gb", descriptor = "Lclient!na;")
	public JagString text = EMPTY_STRING;

	@OriginalMember(owner = "client!be", name = "n", descriptor = "I")
	public int width = 0;

	@OriginalMember(owner = "client!be", name = "Wb", descriptor = "I")
	public int scrollX = 0;

	@OriginalMember(owner = "client!be", name = "sb", descriptor = "Z")
	public boolean noClickThrough = false;

	@OriginalMember(owner = "client!be", name = "U", descriptor = "I")
	private int activeModelId = -1;

	@OriginalMember(owner = "client!be", name = "N", descriptor = "I")
	public int overlayer = -1;

	@OriginalMember(owner = "client!be", name = "pb", descriptor = "I")
	public int aspectWidth = 1;

	@OriginalMember(owner = "client!be", name = "Q", descriptor = "I")
	public int objId = -1;

	@OriginalMember(owner = "client!be", name = "vb", descriptor = "I")
	public int anInt475 = 0;

	@OriginalMember(owner = "client!be", name = "nc", descriptor = "I")
	public int modelZOffset = 0;

	@OriginalMember(owner = "client!be", name = "Dc", descriptor = "Lclient!na;")
	public JagString optionBase = EMPTY_STRING;

	@OriginalMember(owner = "client!be", name = "Lc", descriptor = "I")
	public int updatedVarcsReaderIndex = 0;

	@OriginalMember(owner = "client!be", name = "w", descriptor = "I")
	public int baseWidth = 0;

	@OriginalMember(owner = "client!be", name = "Mc", descriptor = "I")
	public int invMarginX = 0;

	@OriginalMember(owner = "client!be", name = "Ib", descriptor = "I")
	public int lastTransmitTimer = -1;

	@OriginalMember(owner = "client!be", name = "c", descriptor = "Z")
	public boolean hasAlpha = false;

	@OriginalMember(owner = "client!be", name = "F", descriptor = "I")
	public int anInt451 = 0;

	@OriginalMember(owner = "client!be", name = "wb", descriptor = "I")
	public int alpha = 0;

	@OriginalMember(owner = "client!be", name = "hc", descriptor = "I")
	public int modelXOffset = 0;

	@OriginalMember(owner = "client!be", name = "Ub", descriptor = "Lclient!na;")
	public JagString optionCircumfix = EMPTY_STRING;

	@OriginalMember(owner = "client!be", name = "Lb", descriptor = "I")
	public int modelRotationSpeed = 0;

	@OriginalMember(owner = "client!be", name = "r", descriptor = "Lclient!na;")
	public JagString activeText = EMPTY_STRING;

	@OriginalMember(owner = "client!be", name = "Pc", descriptor = "I")
	public int outlineThickness = 0;

	@OriginalMember(owner = "client!be", name = "oc", descriptor = "I")
	public int anInt498 = -1;

	@OriginalMember(owner = "client!be", name = "Rb", descriptor = "I")
	public int updatedVarcstrsReaderIndex = 0;

	@OriginalMember(owner = "client!be", name = "ic", descriptor = "I")
	public int anInt495 = 0;

	@OriginalMember(owner = "client!be", name = "Sc", descriptor = "I")
	public int invMarginY = 0;

	@OriginalMember(owner = "client!be", name = "Tb", descriptor = "I")
	public int baseHeight = 0;

	@OriginalMember(owner = "client!be", name = "Fc", descriptor = "I")
	public int id = -1;

	@OriginalMember(owner = "client!be", name = "Yc", descriptor = "I")
	public int activeSpriteId = -1;

	@OriginalMember(owner = "client!be", name = "zc", descriptor = "B")
	public byte yMode = 0;

	@OriginalMember(owner = "client!be", name = "qc", descriptor = "I")
	public int anInt500 = 0;

	@OriginalMember(owner = "client!be", name = "uc", descriptor = "I")
	public int font = -1;

	@OriginalMember(owner = "client!be", name = "Pb", descriptor = "I")
	public int scrollMaxH = 0;

	@OriginalMember(owner = "client!be", name = "ec", descriptor = "I")
	public int updatedInventoriesReaderIndex = 0;

	@OriginalMember(owner = "client!be", name = "Vc", descriptor = "S")
	public short aShort11 = 0;

	@OriginalMember(owner = "client!be", name = "ed", descriptor = "I")
	public int angle2d = 0;

	@OriginalMember(owner = "client!be", name = "id", descriptor = "I")
	public int modelSeqId = -1;

	@OriginalMember(owner = "client!be", name = "Rc", descriptor = "Lclient!na;")
	public JagString option = LocalizedText.OK;

	@OriginalMember(owner = "client!be", name = "Gc", descriptor = "I")
	public int modelYOffset = 0;

	@OriginalMember(owner = "client!be", name = "vc", descriptor = "I")
	public int objCount = 0;

	@OriginalMember(owner = "client!be", name = "Uc", descriptor = "I")
	public int rectangle = -1;

	@OriginalMember(owner = "client!be", name = "K", descriptor = "I")
	public int clientCode = 0;

	@OriginalMember(owner = "client!be", name = "Oc", descriptor = "I")
	public int shadowColor = 0;

	@OriginalMember(owner = "client!be", name = "fd", descriptor = "Lclient!be;")
	public Component aClass13_5 = null;

	@OriginalMember(owner = "client!be", name = "od", descriptor = "I")
	public int updatedStatsReaderIndex = 0;

	@OriginalMember(owner = "client!be", name = "ab", descriptor = "I")
	public int modelType = 1;

	@OriginalMember(owner = "client!be", name = "md", descriptor = "Z")
	public boolean aBoolean34 = false;

	@OriginalMember(owner = "client!be", name = "hd", descriptor = "B")
	public byte dynamicWidthValue = 0;

	@OriginalMember(owner = "client!be", name = "Wc", descriptor = "I")
	private int activeModelType = 1;

	@OriginalMember(owner = "client!be", name = "pd", descriptor = "I")
	public int anInt526 = 0;

	@OriginalMember(owner = "client!be", name = "ld", descriptor = "I")
	public int modelYAngle = 0;

	@OriginalMember(owner = "client!be", name = "T", descriptor = "Z")
	public boolean aBoolean25 = false;

	@OriginalMember(owner = "client!be", name = "vd", descriptor = "I")
	public int baseX = 0;

	@OriginalMember(owner = "client!be", name = "jd", descriptor = "I")
	public int x = 0;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "I")
	public int baseY = 0;

	@OriginalMember(owner = "client!be", name = "Bb", descriptor = "Z")
	public boolean objDrawText = true;

	@OriginalMember(owner = "client!be", name = "Kc", descriptor = "I")
	public int anInt510 = 0;

	@OriginalMember(owner = "client!be", name = "mb", descriptor = "I")
	public int updatedVarpsReaderIndex = 0;

	@OriginalMember(owner = "client!be", name = "rb", descriptor = "I")
	public int color = 0;

	@OriginalMember(owner = "client!be", name = "xd", descriptor = "I")
	public int buttonType = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V")
	public static void clean() {
		sprites.clean(50);
		models.clean(50);
		fonts.clean(50);
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)V")
	public static void clear() {
		sprites.clear();
		models.clear();
		fonts.clear();
	}

	@OriginalMember(owner = "client!da", name = "h", descriptor = "(B)V")
	public static void removeSoft() {
		sprites.removeSoft();
		models.removeSoft();
		fonts.removeSoft();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIB)V")
	public final void method477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray39 == null || this.anIntArray39.length <= arg0) {
			@Pc(18) int[] local18 = new int[arg0 + 1];
			if (this.anIntArray39 != null) {
				@Pc(24) int local24;
				for (local24 = 0; local24 < this.anIntArray39.length; local24++) {
					local18[local24] = this.anIntArray39[local24];
				}
				for (local24 = this.anIntArray39.length; local24 < arg0; local24++) {
					local18[local24] = -1;
				}
			}
			this.anIntArray39 = local18;
		}
		this.anIntArray39[arg0] = arg1;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)Z")
	public final boolean method478() {
		if (this.anIntArray37 != null) {
			return true;
		}
		@Pc(18) SoftwareIndexedSprite local18 = SpriteLoader.loadSoftwareIndexedSprite(this.spriteId, InterfaceList.aClass153_12);
		if (local18 == null) {
			return false;
		}
		local18.trim();
		this.anIntArray37 = new int[local18.height];
		this.anIntArray45 = new int[local18.height];
		for (@Pc(37) int local37 = 0; local37 < local18.height; local37++) {
			@Pc(47) int local47 = 0;
			@Pc(50) int local50 = local18.width;
			@Pc(52) int local52;
			for (local52 = 0; local52 < local18.width; local52++) {
				if (local18.pixels[local18.width * local37 + local52] != 0) {
					local47 = local52;
					break;
				}
			}
			for (local52 = local47; local52 < local18.width; local52++) {
				if (local18.pixels[local37 * local18.width + local52] == 0) {
					local50 = local52;
					break;
				}
			}
			this.anIntArray37[local37] = local47;
			this.anIntArray45[local37] = local50 - local47;
		}
		return true;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BLclient!na;I)V")
	public final void method480(@OriginalArg(1) JagString arg0, @OriginalArg(2) int arg1) {
		if (this.ops == null || this.ops.length <= arg1) {
			@Pc(23) JagString[] local23 = new JagString[arg1 + 1];
			if (this.ops != null) {
				for (@Pc(30) int local30 = 0; local30 < this.ops.length; local30++) {
					local23[local30] = this.ops[local30];
				}
			}
			this.ops = local23;
		}
		this.ops[arg1] = arg0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!wa;)V")
	public final void decodeIf1(@OriginalArg(1) Buffer buffer) {
		this.if3 = false;
		this.type = buffer.g1();
		this.buttonType = buffer.g1();
		this.clientCode = buffer.g2();
		this.baseX = buffer.g2b();
		this.baseY = buffer.g2b();
		this.baseWidth = buffer.g2();
		this.baseHeight = buffer.g2();
		this.dynamicWidthValue = 0;
		this.dynamicHeightValue = 0;
		this.yMode = 0;
		this.xMode = 0;
		this.alpha = buffer.g1();
		this.overlayer = buffer.g2();
		if (this.overlayer == 65535) {
			this.overlayer = -1;
		} else {
			this.overlayer += this.id & 0xFFFF0000;
		}
		this.anInt470 = buffer.g2();
		if (this.anInt470 == 65535) {
			this.anInt470 = -1;
		}
		@Pc(109) int local109 = buffer.g1();
		@Pc(125) int local125;
		if (local109 > 0) {
			this.cs1ComparisonOperands = new int[local109];
			this.cs1ComparisonOpcodes = new int[local109];
			for (local125 = 0; local125 < local109; local125++) {
				this.cs1ComparisonOpcodes[local125] = buffer.g1();
				this.cs1ComparisonOperands[local125] = buffer.g2();
			}
		}
		local125 = buffer.g1();
		@Pc(164) int local164;
		@Pc(175) int local175;
		@Pc(183) int local183;
		if (local125 > 0) {
			this.cs1Scripts = new int[local125][];
			for (local164 = 0; local164 < local125; local164++) {
				local175 = buffer.g2();
				this.cs1Scripts[local164] = new int[local175];
				for (local183 = 0; local183 < local175; local183++) {
					this.cs1Scripts[local164][local183] = buffer.g2();
					if (this.cs1Scripts[local164][local183] == 65535) {
						this.cs1Scripts[local164][local183] = -1;
					}
				}
			}
		}
		if (this.type == 0) {
			this.scrollMaxV = buffer.g2();
			this.hidden = buffer.g1() == 1;
		}
		if (this.type == 1) {
			buffer.g2();
			buffer.g1();
		}
		local164 = 0;
		if (this.type == 2) {
			this.dynamicHeightValue = 3;
			this.objCounts = new int[this.baseWidth * this.baseHeight];
			this.objTypes = new int[this.baseHeight * this.baseWidth];
			this.dynamicWidthValue = 3;
			local175 = buffer.g1();
			local183 = buffer.g1();
			if (local175 == 1) {
				local164 = 268435456;
			}
			@Pc(312) int local312 = buffer.g1();
			if (local183 == 1) {
				local164 |= 0x40000000;
			}
			if (local312 == 1) {
				local164 |= Integer.MIN_VALUE;
			}
			@Pc(333) int local333 = buffer.g1();
			if (local333 == 1) {
				local164 |= 0x20000000;
			}
			this.invMarginX = buffer.g1();
			this.invMarginY = buffer.g1();
			this.invOffsetY = new int[20];
			this.invOffsetX = new int[20];
			this.invSprite = new int[20];
			@Pc(364) int i;
			for (i = 0; i < 20; i++) {
				@Pc(371) int hasSprite = buffer.g1();
				if (hasSprite == 1) {
					this.invOffsetX[i] = buffer.g2b();
					this.invOffsetY[i] = buffer.g2b();
					this.invSprite[i] = buffer.g4();
				} else {
					this.invSprite[i] = -1;
				}
			}
			this.invOptions = new JagString[5];
			for (i = 0; i < 5; i++) {
				@Pc(418) JagString option = buffer.gjstr();
				if (option.length() > 0) {
					this.invOptions[i] = option;
					local164 |= 0x1 << i + 23;
				}
			}
		}
		if (this.type == 3) {
			this.filled = buffer.g1() == 1;
		}
		if (this.type == 4 || this.type == 1) {
			this.halign = buffer.g1();
			this.valign = buffer.g1(); // this is an educated guess, follow arg8 in Font.renderParagraphAlpha
			this.vpadding = buffer.g1(); // this is an educated guess, follow arg9 in Font.renderParagraphAlpha
			this.font = buffer.g2();
			if (this.font == 65535) {
				this.font = -1;
			}
			this.shadowed = buffer.g1() == 1;
		}
		if (this.type == 4) {
			this.text = buffer.gjstr();
			this.activeText = buffer.gjstr();
		}
		if (this.type == 1 || this.type == 3 || this.type == 4) {
			this.color = buffer.g4();
		}
		if (this.type == 3 || this.type == 4) {
			this.activeColor = buffer.g4();
			this.overColor = buffer.g4();
			this.anInt475 = buffer.g4();
		}
		if (this.type == 5) {
			this.spriteId = buffer.g4();
			this.activeSpriteId = buffer.g4();
		}
		if (this.type == 6) {
			this.modelType = 1;
			this.modelId = buffer.g2();
			if (this.modelId == 65535) {
				this.modelId = -1;
			}
			this.activeModelType = 1;
			this.activeModelId = buffer.g2();
			if (this.activeModelId == 65535) {
				this.activeModelId = -1;
			}
			this.modelSeqId = buffer.g2();
			if (this.modelSeqId == 65535) {
				this.modelSeqId = -1;
			}
			this.activeModelSeqId = buffer.g2();
			if (this.activeModelSeqId == 65535) {
				this.activeModelSeqId = -1;
			}
			this.modelZoom = buffer.g2();
			this.modelXAngle = buffer.g2();
			this.modelYAngle = buffer.g2();
		}
		if (this.type == 7) {
			this.dynamicHeightValue = 3;
			this.dynamicWidthValue = 3;
			this.objCounts = new int[this.baseHeight * this.baseWidth];
			this.objTypes = new int[this.baseWidth * this.baseHeight];
			this.halign = buffer.g1();
			this.font = buffer.g2();
			if (this.font == 65535) {
				this.font = -1;
			}
			this.shadowed = buffer.g1() == 1;
			this.color = buffer.g4();
			this.invMarginX = buffer.g2b();
			this.invMarginY = buffer.g2b();
			int invHasOptions = buffer.g1();
			if (invHasOptions == 1) {
				local164 |= 0x40000000;
			}
			this.invOptions = new JagString[5];
			for (int i = 0; i < 5; i++) {
				@Pc(756) JagString option = buffer.gjstr();
				if (option.length() > 0) {
					this.invOptions[i] = option;
					local164 |= 0x1 << i + 23;
				}
			}
		}
		if (this.type == 8) {
			this.text = buffer.gjstr();
		}
		if (this.buttonType == 2 || this.type == 2) {
			this.optionCircumfix = buffer.gjstr();
			this.optionSuffix = buffer.gjstr();
			local175 = buffer.g2() & 0x3F;
			local164 |= local175 << 11;
		}
		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) {
			this.option = buffer.gjstr();
			if (this.option.length() == 0) {
				if (this.buttonType == 1) {
					this.option = LocalizedText.OK;
				}
				if (this.buttonType == 4) {
					this.option = LocalizedText.SELECT;
				}
				if (this.buttonType == 5) {
					this.option = LocalizedText.SELECT;
				}
				if (this.buttonType == 6) {
					this.option = LocalizedText.CONTINUE;
				}
			}
		}
		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) {
			local164 |= 0x400000;
		}
		if (this.buttonType == 6) {
			local164 |= 0x1;
		}
		this.properties = new ServerActiveProperties(local164, -1);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)Lclient!qf;")
	public final Sprite method482(@OriginalArg(1) int arg0) {
		aBoolean72 = false;
		if (arg0 < 0 || arg0 >= this.invSprite.length) {
			return null;
		}
		@Pc(29) int local29 = this.invSprite[arg0];
		if (local29 == -1) {
			return null;
		}
		@Pc(43) Sprite local43 = (Sprite) sprites.get(local29);
		if (local43 != null) {
			return local43;
		}
		local43 = SpriteLoader.loadSprites(local29, InterfaceList.aClass153_12);
		if (local43 == null) {
			aBoolean72 = true;
		} else {
			sprites.put(local43, local29);
		}
		return local43;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(ILclient!wa;)[Ljava/lang/Object;")
	private Object[] method485(@OriginalArg(1) Buffer arg0) {
		@Pc(11) int local11 = arg0.g1();
		if (local11 == 0) {
			return null;
		}
		@Pc(26) Object[] local26 = new Object[local11];
		for (@Pc(28) int local28 = 0; local28 < local11; local28++) {
			@Pc(35) int local35 = arg0.g1();
			if (local35 == 0) {
				local26[local28] = Integer.valueOf(arg0.g4());
			} else if (local35 == 1) {
				local26[local28] = arg0.gjstr();
			}
		}
		this.aBoolean25 = true;
		return local26;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!wa;Z)[I")
	private int[] method486(@OriginalArg(0) Buffer arg0) {
		@Pc(9) int local9 = arg0.g1();
		if (local9 == 0) {
			return null;
		}
		@Pc(19) int[] local19 = new int[local9];
		for (@Pc(26) int local26 = 0; local26 < local9; local26++) {
			local19[local26] = arg0.g4();
		}
		return local19;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(III)V")
	public final void swapObjs(@OriginalArg(0) int oldIndex, @OriginalArg(1) int newIndex) {
		@Pc(8) int tmpObj = this.objTypes[newIndex];
		this.objTypes[newIndex] = this.objTypes[oldIndex];
		this.objTypes[oldIndex] = tmpObj;

		@Pc(34) int tmpCount = this.objCounts[newIndex];
		this.objCounts[newIndex] = this.objCounts[oldIndex];
		this.objCounts[oldIndex] = tmpCount;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!tk;IIIZLclient!hh;)Lclient!ak;")
	public final Model method488(@OriginalArg(0) int arg0, @OriginalArg(1) SeqType arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) PlayerAppearance arg5) {
		aBoolean72 = false;
		@Pc(10) int local10;
		@Pc(13) int local13;
		if (arg4) {
			local10 = this.activeModelType;
			local13 = this.activeModelId;
		} else {
			local13 = this.modelId;
			local10 = this.modelType;
		}
		if (local10 == 0) {
			return null;
		} else if (local10 == 1 && local13 == -1) {
			return null;
		} else {
			@Pc(61) Model local61;
			if (local10 == 1) {
				local61 = (Model) models.get((local10 << 16) + local13);
				if (local61 == null) {
					@Pc(69) RawModel local69 = RawModel.create(InterfaceList.aClass153_85, local13);
					if (local69 == null) {
						aBoolean72 = true;
						return null;
					}
					local61 = local69.createModel(64, 768, -50, -10, -50);
					models.put(local61, local13 + (local10 << 16));
				}
				if (arg1 != null) {
					local61 = arg1.method4215(local61, arg0, arg3, arg2);
				}
				return local61;
			} else if (local10 == 2) {
				local61 = NpcTypeList.get(local13).getHeadModel(arg1, arg3, arg0, arg2);
				if (local61 == null) {
					aBoolean72 = true;
					return null;
				} else {
					return local61;
				}
			} else if (local10 == 3) {
				if (arg5 == null) {
					return null;
				}
				local61 = arg5.method1956(arg3, arg1, arg2, arg0);
				if (local61 == null) {
					aBoolean72 = true;
					return null;
				} else {
					return local61;
				}
			} else if (local10 == 4) {
				@Pc(164) ObjType local164 = ObjTypeList.get(local13);
				@Pc(173) Model local173 = local164.getModel(arg0, arg3, arg1, 10, arg2);
				if (local173 == null) {
					aBoolean72 = true;
					return null;
				} else {
					return local173;
				}
			} else if (local10 == 6) {
				local61 = NpcTypeList.get(local13).getBodyModel(null, 0, 0, arg0, arg3, arg2, null, 0, arg1);
				if (local61 == null) {
					aBoolean72 = true;
					return null;
				} else {
					return local61;
				}
			} else if (local10 != 7) {
				return null;
			} else if (arg5 == null) {
				return null;
			} else {
				@Pc(227) int local227 = this.modelId >>> 16;
				@Pc(232) int local232 = this.modelId & 0xFFFF;
				@Pc(235) int local235 = this.anInt498;
				@Pc(246) Model local246 = arg5.method1946(arg0, local235, local227, arg3, arg1, arg2, local232);
				if (local246 == null) {
					aBoolean72 = true;
					return null;
				} else {
					return local246;
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BZ)Lclient!qf;")
	public final Sprite method489(@OriginalArg(1) boolean arg0) {
		aBoolean72 = false;
		@Pc(12) int local12;
		if (arg0) {
			local12 = this.activeSpriteId;
		} else {
			local12 = this.spriteId;
		}
		if (local12 == -1) {
			return null;
		}
		@Pc(66) long local66 = ((this.vFlip ? 1L : 0L) << 38) + ((this.hasAlpha ? 1L : 0L) << 35) + (long) local12 + ((long) this.outlineThickness << 36) + ((this.hFlip ? 1L : 0L) << 39) + ((long) this.shadowColor << 40);
		@Pc(72) Sprite local72 = (Sprite) sprites.get(local66);
		if (local72 != null) {
			return local72;
		}
		@Pc(85) SoftwareSprite local85;
		if (this.hasAlpha) {
			local85 = SoftwareSprite.loadSoftwareAlphaSprite(InterfaceList.aClass153_12, local12);
		} else {
			local85 = SpriteLoader.loadSoftwareSprite(0, InterfaceList.aClass153_12, local12);
		}
		if (local85 == null) {
			aBoolean72 = true;
			return null;
		}
		if (this.vFlip) {
			local85.method309();
		}
		if (this.hFlip) {
			local85.method299();
		}
		if (this.outlineThickness > 0) {
			local85.method298(this.outlineThickness);
		}
		if (this.outlineThickness >= 1) {
			local85.drawOutline(1);
		}
		if (this.outlineThickness >= 2) {
			local85.drawOutline(16777215);
		}
		if (this.shadowColor != 0) {
			local85.drawShadow(this.shadowColor);
		}
		if (!GlRenderer.enabled) {
			local72 = local85;
		} else if (local85 instanceof SoftwareAlphaSprite) {
			local72 = new GlAlphaSprite(local85);
		} else {
			local72 = new GlSprite(local85);
		}
		sprites.put(local72, local66);
		return local72;
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(ILclient!wa;)V")
	public final void decodeIf3(@OriginalArg(1) Buffer buffer) {
		this.if3 = true;
		buffer.offset++;
		this.type = buffer.g1();
		if ((this.type & 0x80) != 0) {
			this.type &= 0x7F;
			buffer.gjstr();
		}
		this.clientCode = buffer.g2();
		this.baseX = buffer.g2b();
		this.baseY = buffer.g2b();
		this.baseWidth = buffer.g2();
		this.baseHeight = buffer.g2();
		this.dynamicWidthValue = buffer.g1b();
		this.dynamicHeightValue = buffer.g1b();
		this.yMode = buffer.g1b();
		this.xMode = buffer.g1b();
		this.overlayer = buffer.g2();
		if (this.overlayer == 65535) {
			this.overlayer = -1;
		} else {
			this.overlayer = (this.id & 0xFFFF0000) + this.overlayer;
		}
		this.hidden = buffer.g1() == 1;
		if (this.type == 0) {
			this.scrollMaxH = buffer.g2();
			this.scrollMaxV = buffer.g2();
			this.noClickThrough = buffer.g1() == 1;
		}
		@Pc(175) int local175;
		if (this.type == 5) {
			this.spriteId = buffer.g4();
			this.angle2d = buffer.g2();
			local175 = buffer.g1();
			this.hasAlpha = (local175 & 0x2) != 0;
			this.spriteTiling = (local175 & 0x1) != 0;
			this.alpha = buffer.g1();
			this.outlineThickness = buffer.g1();
			this.shadowColor = buffer.g4();
			this.vFlip = buffer.g1() == 1;
			this.hFlip = buffer.g1() == 1;
		}
		if (this.type == 6) {
			this.modelType = 1;
			this.modelId = buffer.g2();
			if (this.modelId == 65535) {
				this.modelId = -1;
			}
			this.anInt495 = buffer.g2b();
			this.anInt481 = buffer.g2b();
			this.modelXAngle = buffer.g2();
			this.modelYAngle = buffer.g2();
			this.modelYOffset = buffer.g2();
			this.modelZoom = buffer.g2();
			this.modelSeqId = buffer.g2();
			if (this.modelSeqId == 65535) {
				this.modelSeqId = -1;
			}
			this.modelOrtho = buffer.g1() == 1;
			this.aShort11 = (short) buffer.g2();
			this.aShort10 = (short) buffer.g2();
			this.aBoolean34 = buffer.g1() == 1;
			if (this.dynamicWidthValue != 0) {
				this.anInt451 = buffer.g2();
			}
			if (this.dynamicHeightValue != 0) {
				this.anInt526 = buffer.g2();
			}
		}
		if (this.type == 4) {
			this.font = buffer.g2();
			if (this.font == 65535) {
				this.font = -1;
			}
			this.text = buffer.gjstr();
			this.vpadding = buffer.g1();
			this.halign = buffer.g1();
			this.valign = buffer.g1();
			this.shadowed = buffer.g1() == 1;
			this.color = buffer.g4();
		}
		if (this.type == 3) {
			this.color = buffer.g4();
			this.filled = buffer.g1() == 1;
			this.alpha = buffer.g1();
		}
		if (this.type == 9) {
			this.lineWidth = buffer.g1();
			this.color = buffer.g4();
			this.aBoolean20 = buffer.g1() == 1;
		}
		local175 = buffer.g3();
		@Pc(471) int local471 = buffer.g1();
		@Pc(497) int local497;
		if (local471 != 0) {
			this.anIntArray46 = new int[10];
			this.aByteArray8 = new byte[10];
			this.aByteArray7 = new byte[10];
			while (local471 != 0) {
				local497 = (local471 >> 4) - 1;
				local471 = buffer.g1() | local471 << 8;
				local471 &= 0xFFF;
				if (local471 == 4095) {
					this.anIntArray46[local497] = -1;
				} else {
					this.anIntArray46[local497] = local471;
				}
				this.aByteArray8[local497] = buffer.g1b();
				this.aByteArray7[local497] = buffer.g1b();
				local471 = buffer.g1();
			}
		}
		this.optionBase = buffer.gjstr();
		local497 = buffer.g1();
		@Pc(557) int local557 = local497 & 0xF;
		@Pc(567) int local567;
		if (local557 > 0) {
			this.ops = new JagString[local557];
			for (local567 = 0; local567 < local557; local567++) {
				this.ops[local567] = buffer.gjstr();
			}
		}
		@Pc(584) int local584 = local497 >> 4;
		if (local584 > 0) {
			local567 = buffer.g1();
			this.anIntArray39 = new int[local567 + 1];
			for (@Pc(599) int local599 = 0; local599 < this.anIntArray39.length; local599++) {
				this.anIntArray39[local599] = -1;
			}
			this.anIntArray39[local567] = buffer.g2();
		}
		if (local584 > 1) {
			local567 = buffer.g1();
			this.anIntArray39[local567] = buffer.g2();
		}
		this.dragDeadzone = buffer.g1();
		this.dragDeadtime = buffer.g1();
		this.dragRenderBehavior = buffer.g1() == 1;
		local567 = -1;
		this.optionCircumfix = buffer.gjstr();
		if (ServerActiveProperties.getTargetMask(local175) != 0) {
			local567 = buffer.g2();
			this.anInt499 = buffer.g2();
			if (local567 == 65535) {
				local567 = -1;
			}
			if (this.anInt499 == 65535) {
				this.anInt499 = -1;
			}
			this.anInt484 = buffer.g2();
			if (this.anInt484 == 65535) {
				this.anInt484 = -1;
			}
		}
		this.properties = new ServerActiveProperties(local175, local567);
		this.anObjectArray3 = this.method485(buffer);
		this.onMouseOver = this.method485(buffer);
		this.onMouseLeave = this.method485(buffer);
		this.onUseWith = this.method485(buffer);
		this.onUse = this.method485(buffer);
		this.onVarpTransmit = this.method485(buffer);
		this.onInvTransmit = this.method485(buffer);
		this.onStatTransmit = this.method485(buffer);
		this.onTimer = this.method485(buffer);
		this.onOptionClick = this.method485(buffer);
		this.onMouseRepeat = this.method485(buffer);
		this.onClickRepeat = this.method485(buffer);
		this.onDrag = this.method485(buffer);
		this.onRelease = this.method485(buffer);
		this.onHold = this.method485(buffer);
		this.onDragStart = this.method485(buffer);
		this.onDragRelease = this.method485(buffer);
		this.onScroll = this.method485(buffer);
		this.onVarcTransmit = this.method485(buffer);
		this.onVarcstrTransmit = this.method485(buffer);
		this.varpTriggers = this.method486(buffer);
		this.inventoryTriggers = this.method486(buffer);
		this.statTriggers = this.method486(buffer);
		this.varcTriggers = this.method486(buffer);
		this.varcstrTriggers = this.method486(buffer);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([Lclient!ok;I)Lclient!rk;")
	public final Font method491(@OriginalArg(0) IndexedSprite[] arg0) {
		aBoolean72 = false;
		if (this.font == -1) {
			return null;
		}
		@Pc(21) Font local21 = (Font) fonts.get(this.font);
		if (local21 != null) {
			return local21;
		}
		local21 = Font.method2462(this.font, InterfaceList.aClass153_12, InterfaceList.aClass153_64);
		if (local21 == null) {
			aBoolean72 = true;
		} else {
			local21.setNameIcons(arg0, null);
			fonts.put(local21, this.font);
		}
		return local21;
	}
}
