package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class LocType {

	// Loc Shapes
	public static final int WALL_STRAIGHT = 0;
	public static final int WALL_DIAGONALCORNER = 1;
	public static final int WALL_L = 2;
	public static final int WALL_SQUARECORNER = 3;
	public static final int WALL_DIAGONAL = 9;

	public static final int WALLDECOR_STRAIGHT_XOFFSET = 4;
	public static final int WALLDECOR_STRAIGHT_ZOFFSET = 5;
	public static final int WALLDECOR_DIAGONAL_XOFFSET = 6;
	public static final int WALLDECOR_DIAGONAL_ZOFFSET = 7;
	public static final int WALLDECOR_DIAGONAL_BOTH = 8;

	public static final int ROOF_STRAIGHT = 12;
	public static final int ROOF_DIAGONAL_WITH_ROOFEDGE = 13;
	public static final int ROOF_DIAGONAL = 14;
	public static final int ROOF_L_CONCAVE = 15;
	public static final int ROOF_L_CONVEX = 16;
	public static final int ROOF_FLAT = 17;

	public static final int ROOFEDGE_STRAIGHT = 18;
	public static final int ROOFEDGE_DIAGONALCORNER = 19;
	public static final int ROOFEDGE_L = 20;
	public static final int ROOFEDGE_SQUARECORNER = 21;

	public static final int CENTREPIECE_STRAIGHT = 10;
	public static final int CENTREPIECE_DIAGONAL = 11;
	public static final int GROUNDDECOR = 22;

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "[Lclient!gb;")
	public static final RawModel[] tempModels = new RawModel[4];

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "Lclient!sm;")
	public static LocEntity aClass139_1 = new LocEntity();

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "[S")
	private short[] retex_s;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "[S")
	private short[] recol_s;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "[I")
	private int[] shapes;

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "[S")
	private short[] retex_d;

	@OriginalMember(owner = "client!pb", name = "B", descriptor = "Lclient!sc;")
	private HashTable params;

	@OriginalMember(owner = "client!pb", name = "H", descriptor = "[S")
	private short[] recol_d;

	@OriginalMember(owner = "client!pb", name = "P", descriptor = "[B")
	public byte[] recol_p;

	@OriginalMember(owner = "client!pb", name = "X", descriptor = "[I")
	private int[] models;

	@OriginalMember(owner = "client!pb", name = "db", descriptor = "[I")
	public int[] multiLocs;

	@OriginalMember(owner = "client!pb", name = "hb", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!pb", name = "wb", descriptor = "[I")
	public int[] bgsounds;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
	public int width = 1;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "Z")
	public boolean forcedecor = false;

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
	public int length = 1;

	@OriginalMember(owner = "client!pb", name = "C", descriptor = "Z")
	public boolean aBoolean211 = false;

	@OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
	private int ambient = 0;

	@OriginalMember(owner = "client!gg", name = "W", descriptor = "Lclient!na;")
	public static final JagString aClass100_475 = JagString.parse("null");
	@OriginalMember(owner = "client!pb", name = "E", descriptor = "Lclient!na;")
	public JagString name = aClass100_475;

	@OriginalMember(owner = "client!pb", name = "D", descriptor = "Z")
	public boolean castshadow = true;

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
	public int cursor1Op = -1;

	@OriginalMember(owner = "client!pb", name = "R", descriptor = "I")
	public int bgsoundmax = 0;

	@OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
	public int mapscene = -1;

	@OriginalMember(owner = "client!pb", name = "G", descriptor = "B")
	private byte hillskewType = 0;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "Z")
	public boolean members = false;

	@OriginalMember(owner = "client!pb", name = "T", descriptor = "I")
	public int cursor1 = -1;

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
	private int xoff = 0;

	@OriginalMember(owner = "client!pb", name = "W", descriptor = "I")
	public int bgsoundmin = 0;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
	public int mapfunction = -1;

	@OriginalMember(owner = "client!pb", name = "L", descriptor = "Z")
	public boolean aBoolean214 = false;

	@OriginalMember(owner = "client!pb", name = "Y", descriptor = "I")
	public int cursor2Op = -1;

	@OriginalMember(owner = "client!pb", name = "A", descriptor = "S")
	public short hillskewAmount = -1;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
	private int resizez = 128;

	@OriginalMember(owner = "client!pb", name = "z", descriptor = "[Lclient!na;")
	public JagString[] ops = new JagString[5];

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
	private int resizex = 128;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "Z")
	public boolean allowrandomizedanimation = true;

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
	private int resizey = 128;

	@OriginalMember(owner = "client!pb", name = "y", descriptor = "Z")
	public boolean breakroutefinding = false;

	@OriginalMember(owner = "client!pb", name = "kb", descriptor = "I")
	public int interactable = -1;

	@OriginalMember(owner = "client!pb", name = "lb", descriptor = "Z")
	public boolean render = false;

	@OriginalMember(owner = "client!pb", name = "fb", descriptor = "Z")
	public boolean active = true;

	@OriginalMember(owner = "client!pb", name = "nb", descriptor = "I")
	private int multiLocVarp = -1;

	@OriginalMember(owner = "client!pb", name = "bb", descriptor = "I")
	public int cursor2 = -1;

	@OriginalMember(owner = "client!pb", name = "pb", descriptor = "I")
	public int blocksides = 0;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "Z")
	public boolean blockrange = true;

	@OriginalMember(owner = "client!pb", name = "qb", descriptor = "I")
	private int zoff = 0;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
	public int mapSceneAngleOffset = 0;

	@OriginalMember(owner = "client!pb", name = "jb", descriptor = "I")
	public int walloff = 16;

	@OriginalMember(owner = "client!pb", name = "tb", descriptor = "Z")
	public boolean mapSceneRotated = false;

	@OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
	private int yoff = 0;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
	public int bgsoundrange = 0;

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
	private int contrast = 0;

	@OriginalMember(owner = "client!pb", name = "mb", descriptor = "I")
	public int anim = -1;

	@OriginalMember(owner = "client!pb", name = "I", descriptor = "Z")
	public boolean hasanimation = false;

	@OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
	public int bgsound = -1;

	@OriginalMember(owner = "client!pb", name = "ub", descriptor = "I")
	public int blockwalk = 2;

	@OriginalMember(owner = "client!pb", name = "sb", descriptor = "Z")
	private boolean mirror = false;

	@OriginalMember(owner = "client!pb", name = "gb", descriptor = "I")
	private int multiLocVarbit = -1;

	@OriginalMember(owner = "client!pb", name = "yb", descriptor = "I")
	public int supportitems = -1;

	@OriginalMember(owner = "client!pb", name = "zb", descriptor = "Z")
	private boolean computeVertexColors = false;

	@OriginalMember(owner = "client!pb", name = "Ab", descriptor = "Z")
	public boolean occlude = false;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Z")
	public boolean isReady(@OriginalArg(1) int shape) {
		if (this.shapes != null) {
			for (@Pc(18) int i = 0; i < this.shapes.length; i++) {
				if (shape == this.shapes[i]) {
					return LocTypeList.modelsArchive.isFileReady(0, this.models[i] & 0xFFFF);
				}
			}
			return true;
		} else if (this.models == null) {
			return true;
		} else if (shape == LocType.CENTREPIECE_STRAIGHT) {
			@Pc(71) boolean ready = true;
			for (@Pc(73) int i = 0; i < this.models.length; i++) {
				ready &= LocTypeList.modelsArchive.isFileReady(0, this.models[i] & 0xFFFF);
			}
			return ready;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Lclient!pb;")
	public LocType getMultiLoc() {
		@Pc(26) int local26 = -1;
		if (this.multiLocVarbit != -1) {
			local26 = VarpDomain.getVarbit(this.multiLocVarbit);
		} else if (this.multiLocVarp != -1) {
			local26 = VarpDomain.activeVarps[this.multiLocVarp];
		}
		if (local26 < 0 || local26 >= this.multiLocs.length - 1 || this.multiLocs[local26] == -1) {
			@Pc(84) int local84 = this.multiLocs[this.multiLocs.length - 1];
			return local84 == -1 ? null : LocTypeList.get(local84);
		} else {
			return LocTypeList.get(this.multiLocs[local26]);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)Lclient!gb;")
	private RawModel getRawModel(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) RawModel local7 = null;
		@Pc(10) boolean local10 = this.mirror;
		if (arg1 == 2 && arg0 > 3) {
			local10 = !local10;
		}
		@Pc(46) int local46;
		@Pc(48) int local48;
		if (this.shapes == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.models == null) {
				return null;
			}
			local46 = this.models.length;
			for (local48 = 0; local48 < local46; local48++) {
				@Pc(60) int local60 = this.models[local48];
				if (local10) {
					local60 += 65536;
				}
				local7 = (RawModel) LocTypeList.aClass99_24.get(local60);
				if (local7 == null) {
					local7 = RawModel.create(LocTypeList.modelsArchive, local60 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local10) {
						local7.method1673();
					}
					LocTypeList.aClass99_24.put(local7, local60);
				}
				if (local46 > 1) {
					tempModels[local48] = local7;
				}
			}
			if (local46 > 1) {
				local7 = new RawModel(tempModels, local46);
			}
		} else {
			local46 = -1;
			for (local48 = 0; local48 < this.shapes.length; local48++) {
				if (arg1 == this.shapes[local48]) {
					local46 = local48;
					break;
				}
			}
			if (local46 == -1) {
				return null;
			}
			local48 = this.models[local46];
			if (local10) {
				local48 += 65536;
			}
			local7 = (RawModel) LocTypeList.aClass99_24.get(local48);
			if (local7 == null) {
				local7 = RawModel.create(LocTypeList.modelsArchive, local48 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local10) {
					local7.method1673();
				}
				LocTypeList.aClass99_24.put(local7, local48);
			}
		}
		@Pc(211) boolean local211;
		local211 = this.resizex != 128 || this.resizey != 128 || this.resizez != 128;
		@Pc(230) boolean local230;
		local230 = this.xoff != 0 || this.yoff != 0 || this.zoff != 0;
		@Pc(265) RawModel local265 = new RawModel(local7, arg0 == 0 && !local211 && !local230, this.recol_s == null, this.retex_s == null, true);
		if (arg1 == 4 && arg0 > 3) {
			local265.method1682();
			local265.translate(45, 0, -45);
		}
		@Pc(285) int local285 = arg0 & 0x3;
		if (local285 == 1) {
			local265.swapXz();
		} else if (local285 == 2) {
			local265.negateXz();
		} else if (local285 == 3) {
			local265.method1689();
		}
		@Pc(315) int local315;
		if (this.recol_s != null) {
			for (local315 = 0; local315 < this.recol_s.length; local315++) {
				if (this.recol_p == null || this.recol_p.length <= local315) {
					local265.recolor(this.recol_s[local315], this.recol_d[local315]);
				} else {
					local265.recolor(this.recol_s[local315], client.aShortArray19[this.recol_p[local315] & 0xFF]);
				}
			}
		}
		if (this.retex_s != null) {
			for (local315 = 0; local315 < this.retex_s.length; local315++) {
				local265.retexture(this.retex_s[local315], this.retex_d[local315]);
			}
		}
		if (local211) {
			local265.resize(this.resizex, this.resizey, this.resizez);
		}
		if (local230) {
			local265.translate(this.xoff, this.yoff, this.zoff);
		}
		return local265;
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V")
	public void postDecode() {
		if (this.interactable == -1) {
			this.interactable = 0;
			if (this.models != null && (this.shapes == null || this.shapes[0] == LocType.CENTREPIECE_STRAIGHT)) {
				this.interactable = 1;
			}
			for (@Pc(30) int i = 0; i < 5; i++) {
				if (this.ops[i] != null) {
					this.interactable = 1;
					break;
				}
			}
		}
		if (this.supportitems == -1) {
			this.supportitems = this.blockwalk == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)Z")
	public boolean hasAreaSound() {
		if (this.multiLocs == null) {
			return this.bgsound != -1 || this.bgsounds != null;
		}
		for (@Pc(44) int i = 0; i < this.multiLocs.length; i++) {
			if (this.multiLocs[i] != -1) {
				@Pc(70) LocType type = LocTypeList.get(this.multiLocs[i]);
				if (type.bgsound != -1 || type.bgsounds != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIB)I")
	public int getParam(@OriginalArg(0) int defaultValue, @OriginalArg(1) int key) {
		if (this.params == null) {
			return defaultValue;
		} else {
			@Pc(21) IntNode value = (IntNode) this.params.get(key);
			return value == null ? defaultValue : value.value;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!wa;)V")
	public void decode(@OriginalArg(1) Buffer buffer) {
		while (true) {
			@Pc(9) int opcode = buffer.g1();
			if (opcode == 0) {
				return;
			}
			this.decode(buffer, opcode);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!wa;II)V")
	private void decode(@OriginalArg(0) Buffer buffer, @OriginalArg(1) int opcode) {
		@Pc(18) int count;
		@Pc(38) int len;
		if (opcode == 1) {
			count = buffer.g1();
			if (count > 0) {
				if (this.models == null || SceneGraph.aBoolean130) {
					this.shapes = new int[count];
					this.models = new int[count];
					for (len = 0; len < count; len++) {
						this.models[len] = buffer.g2();
						this.shapes[len] = buffer.g1();
					}
				} else {
					buffer.offset += count * 3;
				}
			}
		} else if (opcode == 2) {
			this.name = buffer.gjstr();
		} else if (opcode == 5) {
			count = buffer.g1();
			if (count > 0) {
				if (this.models == null || SceneGraph.aBoolean130) {
					this.models = new int[count];
					this.shapes = null;
					for (len = 0; len < count; len++) {
						this.models[len] = buffer.g2();
					}
				} else {
					buffer.offset += count * 2;
				}
			}
		} else if (opcode == 14) {
			this.width = buffer.g1();
		} else if (opcode == 15) {
			this.length = buffer.g1();
		} else if (opcode == 17) {
			this.blockwalk = 0;
			this.blockrange = false;
		} else if (opcode == 18) {
			this.blockrange = false;
		} else if (opcode == 19) {
			this.interactable = buffer.g1();
		} else if (opcode == 21) {
			this.hillskewType = 1;
		} else if (opcode == 22) { // sharelight
			this.computeVertexColors = true;
		} else if (opcode == 23) {
			this.occlude = true;
		} else if (opcode == 24) {
			this.anim = buffer.g2();
			if (this.anim == 65535) {
				this.anim = -1;
			}
		} else if (opcode == 27) {
			this.blockwalk = 1;
		} else if (opcode == 28) {
			this.walloff = buffer.g1();
		} else if (opcode == 29) {
			this.ambient = buffer.g1b();
		} else if (opcode == 39) {
			this.contrast = buffer.g1b() * 5;
		} else if (opcode >= 30 && opcode < 35) {
			this.ops[opcode - 30] = buffer.gjstr();
			if (this.ops[opcode - 30].equalsIgnoreCase(LocalizedText.HIDDEN)) {
				this.ops[opcode - 30] = null;
			}
		} else if (opcode == 40) {
			count = buffer.g1();
			this.recol_s = new short[count];
			this.recol_d = new short[count];
			for (len = 0; len < count; len++) {
				this.recol_s[len] = (short) buffer.g2();
				this.recol_d[len] = (short) buffer.g2();
			}
		} else if (opcode == 41) {
			count = buffer.g1();
			this.retex_d = new short[count];
			this.retex_s = new short[count];
			for (len = 0; len < count; len++) {
				this.retex_s[len] = (short) buffer.g2();
				this.retex_d[len] = (short) buffer.g2();
			}
		} else if (opcode == 42) {
			count = buffer.g1();
			this.recol_p = new byte[count];
			for (len = 0; len < count; len++) {
				this.recol_p[len] = buffer.g1b();
			}
		} else if (opcode == 60) {
			this.mapfunction = buffer.g2();
		} else if (opcode == 62) {
			this.mirror = true;
		} else if (opcode == 64) {
			this.active = false;
		} else if (opcode == 65) {
			this.resizex = buffer.g2();
		} else if (opcode == 66) {
			this.resizey = buffer.g2();
		} else if (opcode == 67) {
			this.resizez = buffer.g2();
		} else if (opcode == 69) {
			this.blocksides = buffer.g1();
		} else if (opcode == 70) {
			this.xoff = buffer.g2b();
		} else if (opcode == 71) {
			this.yoff = buffer.g2b();
		} else if (opcode == 72) {
			this.zoff = buffer.g2b();
		} else if (opcode == 73) {
			this.forcedecor = true;
		} else if (opcode == 74) {
			this.breakroutefinding = true;
		} else if (opcode == 75) {
			this.supportitems = buffer.g1();
		} else if (opcode == 77 || opcode == 92) {
			count = -1;
			this.multiLocVarbit = buffer.g2();
			if (this.multiLocVarbit == 65535) {
				this.multiLocVarbit = -1;
			}
			this.multiLocVarp = buffer.g2();
			if (this.multiLocVarp == 65535) {
				this.multiLocVarp = -1;
			}
			if (opcode == 92) {
				count = buffer.g2();
				if (count == 65535) {
					count = -1;
				}
			}
			len = buffer.g1();
			this.multiLocs = new int[len + 2];
			for (@Pc(790) int i = 0; i <= len; i++) {
				this.multiLocs[i] = buffer.g2();
				if (this.multiLocs[i] == 65535) {
					this.multiLocs[i] = -1;
				}
			}
			this.multiLocs[len + 1] = count;
		} else if (opcode == 78) {
			this.bgsound = buffer.g2();
			this.bgsoundrange = buffer.g1();
		} else if (opcode == 79) {
			this.bgsoundmin = buffer.g2(); // interval
			this.bgsoundmax = buffer.g2(); // interval
			this.bgsoundrange = buffer.g1();

			count = buffer.g1();
			this.bgsounds = new int[count];
			for (len = 0; len < count; len++) {
				this.bgsounds[len] = buffer.g2();
			}
		} else if (opcode == 81) { // sethillskew
			this.hillskewType = 2;
			this.hillskewAmount = (short) (buffer.g1() * 256);
		} else if (opcode == 82) {
			this.render = true;
		} else if (opcode == 88) {
			this.castshadow = false;
		} else if (opcode == 89) {
			this.allowrandomizedanimation = false;
		} else if (opcode == 90) {
			this.aBoolean211 = true;
		} else if (opcode == 91) {
			this.members = true;
		} else if (opcode == 93) {
			this.hillskewType = 3;
			this.hillskewAmount = (short) buffer.g2();
		} else if (opcode == 94) {
			this.hillskewType = 4;
		} else if (opcode == 95) {
			this.hillskewType = 5;
		} else if (opcode == 96) {
			this.hasanimation = true;
		} else if (opcode == 97) {
			this.mapSceneRotated = true;
		} else if (opcode == 98) {
			this.aBoolean214 = true;
		} else if (opcode == 99) {
			this.cursor1Op = buffer.g1();
			this.cursor1 = buffer.g2();
		} else if (opcode == 100) {
			this.cursor2Op = buffer.g1();
			this.cursor2 = buffer.g2();
		} else if (opcode == 101) {
			this.mapSceneAngleOffset = buffer.g1();
		} else if (opcode == 102) {
			this.mapscene = buffer.g2();
		} else if (opcode == 249) {
			count = buffer.g1();
			if (this.params == null) {
				len = IntUtils.clp2(count);
				this.params = new HashTable(len);
			}
			for (len = 0; len < count; len++) {
				@Pc(576) boolean isString = buffer.g1() == 1;
				@Pc(580) int key = buffer.g3();
				@Pc(589) Node value;
				if (isString) {
					value = new StringNode(buffer.gjstr());
				} else {
					value = new IntNode(buffer.g4());
				}
				this.params.put(value, key);
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Z")
	public boolean isReady() {
		if (this.models == null) {
			return true;
		}
		@Pc(13) boolean ready = true;
		for (@Pc(15) int i = 0; i < this.models.length; i++) {
			ready &= LocTypeList.modelsArchive.isFileReady(0, this.models[i] & 0xFFFF);
		}
		return ready;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZZI)Lclient!td;")
	private GlModel getGlModel(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = this.ambient + 64;
		@Pc(17) int local17 = this.contrast * 5 + 768;
		@Pc(79) GlModel local79;
		@Pc(24) int local24;
		@Pc(177) int local177;
		if (this.shapes == null) {
			if (arg2 != 10) {
				return null;
			}
			if (this.models == null) {
				return null;
			}
			local24 = this.models.length;
			if (local24 == 0) {
				return null;
			}
			@Pc(135) long local135 = 0L;
			for (@Pc(137) int local137 = 0; local137 < local24; local137++) {
				local135 = (long) this.models[local137] + local135 * 67783L;
			}
			if (arg1) {
				local135 = ~local135;
			}
			local79 = (GlModel) LocTypeList.aClass99_24.get(local135);
			if (local79 == null) {
				@Pc(175) RawModel local175 = null;
				for (local177 = 0; local177 < local24; local177++) {
					local175 = RawModel.create(LocTypeList.modelsArchive, this.models[local177] & 0xFFFF);
					if (local175 == null) {
						return null;
					}
					if (local24 > 1) {
						tempModels[local177] = local175;
					}
				}
				if (local24 > 1) {
					local175 = new RawModel(tempModels, local24);
				}
				local79 = new GlModel(local175, local10, local17, arg1);
				LocTypeList.aClass99_24.put(local79, local135);
			}
		} else {
			local24 = -1;
			@Pc(26) int local26;
			for (local26 = 0; local26 < this.shapes.length; local26++) {
				if (this.shapes[local26] == arg2) {
					local24 = local26;
					break;
				}
			}
			if (local24 == -1) {
				return null;
			}
			local26 = this.models[local24];
			if (arg1) {
				local26 += 65536;
			}
			local79 = (GlModel) LocTypeList.aClass99_24.get(local26);
			if (local79 == null) {
				@Pc(90) RawModel local90 = RawModel.create(LocTypeList.modelsArchive, local26 & 0xFFFF);
				if (local90 == null) {
					return null;
				}
				local79 = new GlModel(local90, local10, local17, arg1);
				LocTypeList.aClass99_24.put(local79, local26);
			}
		}
		@Pc(236) boolean local236 = this.mirror;
		if (arg2 == 2 && arg0 > 3) {
			local236 = !local236;
		}
		@Pc(264) boolean local264 = this.resizey == 128 && this.yoff == 0;
		@Pc(294) boolean local294 = arg0 == 0 && this.resizex == 128 && this.resizez == 128 && this.xoff == 0 && this.zoff == 0 && !local236;
		@Pc(351) GlModel local351 = local79.method4117(local294, local264, this.recol_s == null, local79.method4094() == local10, arg0 == 0 && !local236, true, local17 == local79.method4115(), !local236, this.retex_s == null);
		if (local236) {
			local351.method4122();
		}
		if (arg2 == 4 && arg0 > 3) {
			local351.method4123();
			local351.translate(45, 0, -45);
		}
		@Pc(374) int local374 = arg0 & 0x3;
		if (local374 == 1) {
			local351.method4116();
		} else if (local374 == 2) {
			local351.method4102();
		} else if (local374 == 3) {
			local351.method4093();
		}
		if (this.recol_s != null) {
			for (local177 = 0; local177 < this.recol_s.length; local177++) {
				local351.method4109(this.recol_s[local177], this.recol_d[local177]);
			}
		}
		if (this.retex_s != null) {
			for (local177 = 0; local177 < this.retex_s.length; local177++) {
				local351.method4107(this.retex_s[local177], this.retex_d[local177]);
			}
		}
		if (this.resizex != 128 || this.resizey != 128 || this.resizez != 128) {
			local351.resize(this.resizex, this.resizey, this.resizez);
		}
		if (this.xoff != 0 || this.yoff != 0 || this.zoff != 0) {
			local351.translate(this.xoff, this.yoff, this.zoff);
		}
		if (local10 != local351.method4094()) {
			local351.method4105(local10);
		}
		if (local351.method4115() != local17) {
			local351.method4100(local17);
		}
		return local351;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II[[III[[IZLclient!ek;BZI)Lclient!sm;")
	public LocEntity method3428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) SoftwareIndexedSprite arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		@Pc(29) long local29;
		if (GlRenderer.enabled) {
			if (this.shapes == null) {
				local29 = (this.id << 10) + arg0;
			} else {
				local29 = arg0 + (this.id << 10) + (arg3 << 3);
			}
			@Pc(225) LocEntity local225 = (LocEntity) LocTypeList.aClass99_14.get(local29);
			@Pc(235) GlModel local235;
			@Pc(265) SoftwareIndexedSprite local265;
			if (local225 == null) {
				local235 = this.getGlModel(arg0, false, arg3);
				if (local235 == null) {
					aClass139_1.model = null;
					aClass139_1.sprite = null;
					return aClass139_1;
				}
				if (arg3 == 10 && arg0 > 3) {
					local235.rotateY(256);
				}
				if (arg8) {
					local265 = local235.method4124(arg7);
				} else {
					local265 = null;
				}
				local225 = new LocEntity();
				local225.model = local235;
				local225.sprite = local265;
				LocTypeList.aClass99_14.put(local225, local29);
			} else {
				local235 = (GlModel) local225.model;
				local265 = local225.sprite;
			}
			@Pc(298) boolean local298 = this.computeVertexColors & arg6;
			@Pc(330) GlModel local330 = local235.method4117(this.hillskewType != 3, this.hillskewType == 0, true, true, true, !local298, true, true, true);
			if (this.hillskewType != 0) {
				local330.method4110(this.hillskewType, this.hillskewAmount, local235, arg2, arg5, arg1, arg4, arg9);
			}
			local330.method4111(this.interactable == 0 && !this.aBoolean214, true, true, this.interactable == 0, true, false);
			aClass139_1.model = local330;
			local330.aBoolean259 = local298;
			aClass139_1.sprite = local265;
			return aClass139_1;
		}
		if (this.shapes == null) {
			local29 = (this.id << 10) + arg0;
		} else {
			local29 = (arg3 << 3) + ((this.id << 10) + arg0);
		}
		@Pc(50) boolean local50;
		if (arg6 && this.computeVertexColors) {
			local29 |= Long.MIN_VALUE;
			local50 = true;
		} else {
			local50 = false;
		}
		@Pc(60) Entity local60 = (Entity) LocTypeList.aClass99_14.get(local29);
		if (local60 == null) {
			@Pc(69) RawModel local69 = this.getRawModel(arg0, arg3);
			if (local69 == null) {
				aClass139_1.model = null;
				return aClass139_1;
			}
			local69.resetBones();
			if (arg3 == 10 && arg0 > 3) {
				local69.method1682();
			}
			if (local50) {
				local69.aShort19 = (short) (this.ambient + 64);
				local60 = local69;
				local69.aShort18 = (short) (this.contrast * 5 + 768);
				local69.calculateNormals();
			} else {
				local60 = new SoftwareModel(local69, this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
			}
			LocTypeList.aClass99_14.put(local60, local29);
		}
		if (local50) {
			local60 = ((RawModel) local60).method1675();
		}
		if (this.hillskewType != 0) {
			if (local60 instanceof SoftwareModel) {
				local60 = ((SoftwareModel) local60).method4586(this.hillskewType, this.hillskewAmount, arg2, arg5, arg1, arg4, arg9, true);
			} else if (local60 instanceof RawModel) {
				local60 = ((RawModel) local60).method1670(this.hillskewType, this.hillskewAmount, arg2, arg5, arg1, arg4, arg9);
			}
		}
		aClass139_1.model = local60;
		return aClass139_1;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILclient!ek;ILclient!tk;I[[IZII[[IIII)Lclient!sm;")
	public LocEntity method3429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) SoftwareIndexedSprite arg2, @OriginalArg(3) int arg3, @OriginalArg(4) SeqType arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int[][] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(30) long local30;
		if (!GlRenderer.enabled) {
			if (this.shapes == null) {
				local30 = (this.id << 10) + arg5;
			} else {
				local30 = arg5 + (this.id << 10) + (arg11 << 3);
			}
			@Pc(195) SoftwareModel local195 = (SoftwareModel) LocTypeList.aClass99_36.get(local30);
			if (local195 == null) {
				@Pc(204) RawModel local204 = this.getRawModel(arg5, arg11);
				if (local204 == null) {
					return null;
				}
				local195 = new SoftwareModel(local204, this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
				LocTypeList.aClass99_36.put(local195, local30);
			}
			@Pc(234) boolean local234 = false;
			if (arg4 != null) {
				local234 = true;
				local195 = (SoftwareModel) arg4.method4214(arg8, arg10, local195, arg5, arg12);
			}
			if (arg11 == 10 && arg5 > 3) {
				if (!local234) {
					local234 = true;
					local195 = (SoftwareModel) local195.method4568(true, true, true);
				}
				local195.rotateY(256);
			}
			if (this.hillskewType != 0) {
				if (!local234) {
					local195 = (SoftwareModel) local195.method4568(true, true, true);
				}
				local195 = local195.method4586(this.hillskewType, this.hillskewAmount, arg6, arg9, arg1, arg3, arg0, false);
			}
			aClass139_1.model = local195;
			return aClass139_1;
		}
		if (this.shapes == null) {
			local30 = arg5 + (this.id << 10);
		} else {
			local30 = (arg11 << 3) + ((this.id << 10) + arg5);
		}
		@Pc(46) GlModel local46 = (GlModel) LocTypeList.aClass99_36.get(local30);
		if (local46 == null) {
			local46 = this.getGlModel(arg5, true, arg11);
			if (local46 == null) {
				return null;
			}
			local46.createBones();
			local46.method4111(false, false, false, false, false, true);
			LocTypeList.aClass99_36.put(local46, local30);
		}
		@Pc(80) boolean local80 = false;
		@Pc(82) GlModel local82 = local46;
		if (arg4 != null) {
			local82 = (GlModel) arg4.method4216(arg10, arg8, arg12, arg5, local46);
			local80 = true;
		}
		if (arg11 == 10 && arg5 > 3) {
			if (!local80) {
				local82 = (GlModel) local82.method4568(true, true, true);
				local80 = true;
			}
			local82.rotateY(256);
		}
		if (arg7) {
			aClass139_1.sprite = local82.method4124(arg2);
		} else {
			aClass139_1.sprite = null;
		}
		if (this.hillskewType != 0) {
			if (!local80) {
				local82 = (GlModel) local82.method4568(true, true, true);
			}
			local82.method4110(this.hillskewType, this.hillskewAmount, local46, arg6, arg9, arg1, arg3, arg0);
		}
		aClass139_1.model = local82;
		return aClass139_1;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!na;II)Lclient!na;")
	public JagString getParam(@OriginalArg(0) JagString defaultValue, @OriginalArg(2) int key) {
		if (this.params == null) {
			return defaultValue;
		} else {
			@Pc(26) StringNode value = (StringNode) this.params.get(key);
			return value == null ? defaultValue : value.value;
		}
	}
}
