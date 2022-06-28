package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class LocType {

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "[Lclient!gb;")
	public static final RawModel[] tempModels = new RawModel[4];
	@OriginalMember(owner = "client!ni", name = "n", descriptor = "Lclient!sm;")
	public static Loc_Class139 aClass139_1 = new Loc_Class139();
	@OriginalMember(owner = "client!pb", name = "a", descriptor = "[S")
	private short[] retextureSource;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "[S")
	private short[] recolorSource;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "[I")
	private int[] shapes;

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "[S")
	private short[] retextureDestination;

	@OriginalMember(owner = "client!pb", name = "B", descriptor = "Lclient!sc;")
	private HashTable params;

	@OriginalMember(owner = "client!pb", name = "H", descriptor = "[S")
	private short[] recolorDestination;

	@OriginalMember(owner = "client!pb", name = "P", descriptor = "[B")
	private byte[] aByteArray63;

	@OriginalMember(owner = "client!pb", name = "X", descriptor = "[I")
	private int[] models;

	@OriginalMember(owner = "client!pb", name = "db", descriptor = "[I")
	public int[] multiLocs;

	@OriginalMember(owner = "client!pb", name = "hb", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!pb", name = "wb", descriptor = "[I")
	public int[] anIntArray381;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
	public int width = 1;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "Z")
	public boolean aBoolean206 = false;

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
	public int length = 1;

	@OriginalMember(owner = "client!pb", name = "C", descriptor = "Z")
	public boolean aBoolean211 = false;

	@OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
	private int anInt4407 = 0;

	@OriginalMember(owner = "client!gg", name = "W", descriptor = "Lclient!na;")
	public static final JagString aClass100_475 = JagString.parse("null");
	@OriginalMember(owner = "client!pb", name = "E", descriptor = "Lclient!na;")
	public JagString name = aClass100_475;

	@OriginalMember(owner = "client!pb", name = "D", descriptor = "Z")
	public boolean aBoolean212 = true;

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
	public int cursor1Op = -1;

	@OriginalMember(owner = "client!pb", name = "R", descriptor = "I")
	public int anInt4414 = 0;

	@OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
	public int mapSceneId = -1;

	@OriginalMember(owner = "client!pb", name = "G", descriptor = "B")
	private byte aByte15 = 0;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "Z")
	public boolean members = false;

	@OriginalMember(owner = "client!pb", name = "T", descriptor = "I")
	public int cursor1 = -1;

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
	private int translateX = 0;

	@OriginalMember(owner = "client!pb", name = "W", descriptor = "I")
	public int anInt4419 = 0;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
	public int mapElement = -1;

	@OriginalMember(owner = "client!pb", name = "L", descriptor = "Z")
	public boolean aBoolean214 = false;

	@OriginalMember(owner = "client!pb", name = "Y", descriptor = "I")
	public int cursor2Op = -1;

	@OriginalMember(owner = "client!pb", name = "A", descriptor = "S")
	private short aShort26 = -1;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
	private int resizeZ = 128;

	@OriginalMember(owner = "client!pb", name = "z", descriptor = "[Lclient!na;")
	public JagString[] ops = new JagString[5];

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
	private int resizeX = 128;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "Z")
	public boolean aBoolean209 = true;

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
	private int resizeY = 128;

	@OriginalMember(owner = "client!pb", name = "y", descriptor = "Z")
	public boolean breakroutefinding = false;

	@OriginalMember(owner = "client!pb", name = "kb", descriptor = "I")
	public int anInt4429 = -1;

	@OriginalMember(owner = "client!pb", name = "lb", descriptor = "Z")
	public boolean aBoolean216 = false;

	@OriginalMember(owner = "client!pb", name = "fb", descriptor = "Z")
	public boolean aBoolean215 = true;

	@OriginalMember(owner = "client!pb", name = "nb", descriptor = "I")
	private int multiLocVarp = -1;

	@OriginalMember(owner = "client!pb", name = "bb", descriptor = "I")
	public int cursor2 = -1;

	@OriginalMember(owner = "client!pb", name = "pb", descriptor = "I")
	public int blockedSides = 0;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "Z")
	public boolean aBoolean207 = true;

	@OriginalMember(owner = "client!pb", name = "qb", descriptor = "I")
	private int translateZ = 0;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
	public int mapSceneAngleOffset = 0;

	@OriginalMember(owner = "client!pb", name = "jb", descriptor = "I")
	public int wallDecorOffsetScale = 16;

	@OriginalMember(owner = "client!pb", name = "tb", descriptor = "Z")
	public boolean mapSceneRotated = false;

	@OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
	private int translateY = 0;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
	public int soundRadius = 0;

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
	private int anInt4405 = 0;

	@OriginalMember(owner = "client!pb", name = "mb", descriptor = "I")
	public int anInt4430 = -1;

	@OriginalMember(owner = "client!pb", name = "I", descriptor = "Z")
	public boolean aBoolean213 = false;

	@OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
	public int sound = -1;

	@OriginalMember(owner = "client!pb", name = "ub", descriptor = "I")
	public int anInt4435 = 2;

	@OriginalMember(owner = "client!pb", name = "sb", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!pb", name = "gb", descriptor = "I")
	private int multiLocVarbit = -1;

	@OriginalMember(owner = "client!pb", name = "yb", descriptor = "I")
	public int anInt4438 = -1;

	@OriginalMember(owner = "client!pb", name = "zb", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "client!pb", name = "Ab", descriptor = "Z")
	public boolean aBoolean220 = false;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Z")
	public final boolean isReady(@OriginalArg(1) int arg0) {
		if (this.shapes != null) {
			for (@Pc(18) int local18 = 0; local18 < this.shapes.length; local18++) {
				if (arg0 == this.shapes[local18]) {
					return LocTypeList.modelsArchive.isFileReady(0, this.models[local18] & 0xFFFF);
				}
			}
			return true;
		} else if (this.models == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(71) boolean local71 = true;
			for (@Pc(73) int local73 = 0; local73 < this.models.length; local73++) {
				local71 &= LocTypeList.modelsArchive.isFileReady(0, this.models[local73] & 0xFFFF);
			}
			return local71;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Lclient!pb;")
	public final LocType getMultiLoc() {
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
	private RawModel method3418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) RawModel local7 = null;
		@Pc(10) boolean local10 = this.aBoolean217;
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
		local211 = this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128;
		@Pc(230) boolean local230;
		local230 = this.translateX != 0 || this.translateY != 0 || this.translateZ != 0;
		@Pc(265) RawModel local265 = new RawModel(local7, arg0 == 0 && !local211 && !local230, this.recolorSource == null, this.retextureSource == null, true);
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
		if (this.recolorSource != null) {
			for (local315 = 0; local315 < this.recolorSource.length; local315++) {
				if (this.aByteArray63 == null || this.aByteArray63.length <= local315) {
					local265.recolor(this.recolorSource[local315], this.recolorDestination[local315]);
				} else {
					local265.recolor(this.recolorSource[local315], client.aShortArray19[this.aByteArray63[local315] & 0xFF]);
				}
			}
		}
		if (this.retextureSource != null) {
			for (local315 = 0; local315 < this.retextureSource.length; local315++) {
				local265.retexture(this.retextureSource[local315], this.retextureDestination[local315]);
			}
		}
		if (local211) {
			local265.resize(this.resizeX, this.resizeY, this.resizeZ);
		}
		if (local230) {
			local265.translate(this.translateX, this.translateY, this.translateZ);
		}
		return local265;
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V")
	public final void postDecode() {
		if (this.anInt4429 == -1) {
			this.anInt4429 = 0;
			if (this.models != null && (this.shapes == null || this.shapes[0] == 10)) {
				this.anInt4429 = 1;
			}
			for (@Pc(30) int local30 = 0; local30 < 5; local30++) {
				if (this.ops[local30] != null) {
					this.anInt4429 = 1;
					break;
				}
			}
		}
		if (this.anInt4438 == -1) {
			this.anInt4438 = this.anInt4435 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)Z")
	public final boolean hasAreaSound() {
		if (this.multiLocs == null) {
			return this.sound != -1 || this.anIntArray381 != null;
		}
		for (@Pc(44) int local44 = 0; local44 < this.multiLocs.length; local44++) {
			if (this.multiLocs[local44] != -1) {
				@Pc(70) LocType local70 = LocTypeList.get(this.multiLocs[local44]);
				if (local70.sound != -1 || local70.anIntArray381 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIB)I")
	public final int getParam(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.params == null) {
			return arg0;
		} else {
			@Pc(21) IntNode local21 = (IntNode) this.params.get(arg1);
			return local21 == null ? arg0 : local21.value;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!wa;)V")
	public final void decode(@OriginalArg(1) Buffer arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.g1();
			if (local9 == 0) {
				return;
			}
			this.decode(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!wa;II)V")
	private void decode(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int defaultMultiLoc;
		@Pc(38) int len;
		if (arg1 == 1) {
			defaultMultiLoc = arg0.g1();
			if (defaultMultiLoc > 0) {
				if (this.models == null || SceneGraph.aBoolean130) {
					this.shapes = new int[defaultMultiLoc];
					this.models = new int[defaultMultiLoc];
					for (len = 0; len < defaultMultiLoc; len++) {
						this.models[len] = arg0.g2();
						this.shapes[len] = arg0.g1();
					}
				} else {
					arg0.offset += defaultMultiLoc * 3;
				}
			}
		} else if (arg1 == 2) {
			this.name = arg0.gjstr();
		} else if (arg1 == 5) {
			defaultMultiLoc = arg0.g1();
			if (defaultMultiLoc > 0) {
				if (this.models == null || SceneGraph.aBoolean130) {
					this.models = new int[defaultMultiLoc];
					this.shapes = null;
					for (len = 0; len < defaultMultiLoc; len++) {
						this.models[len] = arg0.g2();
					}
				} else {
					arg0.offset += defaultMultiLoc * 2;
				}
			}
		} else if (arg1 == 14) {
			this.width = arg0.g1();
		} else if (arg1 == 15) {
			this.length = arg0.g1();
		} else if (arg1 == 17) {
			this.anInt4435 = 0;
			this.aBoolean207 = false;
		} else if (arg1 == 18) {
			this.aBoolean207 = false;
		} else if (arg1 == 19) {
			this.anInt4429 = arg0.g1();
		} else if (arg1 == 21) {
			this.aByte15 = 1;
		} else if (arg1 == 22) {
			this.aBoolean219 = true;
		} else if (arg1 == 23) {
			this.aBoolean220 = true;
		} else if (arg1 == 24) {
			this.anInt4430 = arg0.g2();
			if (this.anInt4430 == 65535) {
				this.anInt4430 = -1;
			}
		} else if (arg1 == 27) {
			this.anInt4435 = 1;
		} else if (arg1 == 28) {
			this.wallDecorOffsetScale = arg0.g1();
		} else if (arg1 == 29) {
			this.anInt4407 = arg0.g1b();
		} else if (arg1 == 39) {
			this.anInt4405 = arg0.g1b() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.ops[arg1 - 30] = arg0.gjstr();
			if (this.ops[arg1 - 30].equalsIgnoreCase(LocalizedText.HIDDEN)) {
				this.ops[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			defaultMultiLoc = arg0.g1();
			this.recolorSource = new short[defaultMultiLoc];
			this.recolorDestination = new short[defaultMultiLoc];
			for (len = 0; len < defaultMultiLoc; len++) {
				this.recolorSource[len] = (short) arg0.g2();
				this.recolorDestination[len] = (short) arg0.g2();
			}
		} else if (arg1 == 41) {
			defaultMultiLoc = arg0.g1();
			this.retextureDestination = new short[defaultMultiLoc];
			this.retextureSource = new short[defaultMultiLoc];
			for (len = 0; len < defaultMultiLoc; len++) {
				this.retextureSource[len] = (short) arg0.g2();
				this.retextureDestination[len] = (short) arg0.g2();
			}
		} else if (arg1 == 42) {
			defaultMultiLoc = arg0.g1();
			this.aByteArray63 = new byte[defaultMultiLoc];
			for (len = 0; len < defaultMultiLoc; len++) {
				this.aByteArray63[len] = arg0.g1b();
			}
		} else if (arg1 == 60) {
			this.mapElement = arg0.g2();
		} else if (arg1 == 62) {
			this.aBoolean217 = true;
		} else if (arg1 == 64) {
			this.aBoolean215 = false;
		} else if (arg1 == 65) {
			this.resizeX = arg0.g2();
		} else if (arg1 == 66) {
			this.resizeY = arg0.g2();
		} else if (arg1 == 67) {
			this.resizeZ = arg0.g2();
		} else if (arg1 == 69) {
			this.blockedSides = arg0.g1();
		} else if (arg1 == 70) {
			this.translateX = arg0.g2b();
		} else if (arg1 == 71) {
			this.translateY = arg0.g2b();
		} else if (arg1 == 72) {
			this.translateZ = arg0.g2b();
		} else if (arg1 == 73) {
			this.aBoolean206 = true;
		} else if (arg1 == 74) {
			this.breakroutefinding = true;
		} else if (arg1 == 75) {
			this.anInt4438 = arg0.g1();
		} else if (arg1 == 77 || arg1 == 92) {
			defaultMultiLoc = -1;
			this.multiLocVarbit = arg0.g2();
			if (this.multiLocVarbit == 65535) {
				this.multiLocVarbit = -1;
			}
			this.multiLocVarp = arg0.g2();
			if (this.multiLocVarp == 65535) {
				this.multiLocVarp = -1;
			}
			if (arg1 == 92) {
				defaultMultiLoc = arg0.g2();
				if (defaultMultiLoc == 65535) {
					defaultMultiLoc = -1;
				}
			}
			len = arg0.g1();
			this.multiLocs = new int[len + 2];
			for (@Pc(790) int local790 = 0; local790 <= len; local790++) {
				this.multiLocs[local790] = arg0.g2();
				if (this.multiLocs[local790] == 65535) {
					this.multiLocs[local790] = -1;
				}
			}
			this.multiLocs[len + 1] = defaultMultiLoc;
		} else if (arg1 == 78) {
			this.sound = arg0.g2();
			this.soundRadius = arg0.g1();
		} else if (arg1 == 79) {
			this.anInt4419 = arg0.g2();
			this.anInt4414 = arg0.g2();
			this.soundRadius = arg0.g1();
			defaultMultiLoc = arg0.g1();
			this.anIntArray381 = new int[defaultMultiLoc];
			for (len = 0; len < defaultMultiLoc; len++) {
				this.anIntArray381[len] = arg0.g2();
			}
		} else if (arg1 == 81) {
			this.aByte15 = 2;
			this.aShort26 = (short) (arg0.g1() * 256);
		} else if (arg1 == 82) {
			this.aBoolean216 = true;
		} else if (arg1 == 88) {
			this.aBoolean212 = false;
		} else if (arg1 == 89) {
			this.aBoolean209 = false;
		} else if (arg1 == 90) {
			this.aBoolean211 = true;
		} else if (arg1 == 91) {
			this.members = true;
		} else if (arg1 == 93) {
			this.aByte15 = 3;
			this.aShort26 = (short) arg0.g2();
		} else if (arg1 == 94) {
			this.aByte15 = 4;
		} else if (arg1 == 95) {
			this.aByte15 = 5;
		} else if (arg1 == 96) {
			this.aBoolean213 = true;
		} else if (arg1 == 97) {
			this.mapSceneRotated = true;
		} else if (arg1 == 98) {
			this.aBoolean214 = true;
		} else if (arg1 == 99) {
			this.cursor1Op = arg0.g1();
			this.cursor1 = arg0.g2();
		} else if (arg1 == 100) {
			this.cursor2Op = arg0.g1();
			this.cursor2 = arg0.g2();
		} else if (arg1 == 101) {
			this.mapSceneAngleOffset = arg0.g1();
		} else if (arg1 == 102) {
			this.mapSceneId = arg0.g2();
		} else if (arg1 == 249) {
			defaultMultiLoc = arg0.g1();
			if (this.params == null) {
				len = IntUtils.clp2(defaultMultiLoc);
				this.params = new HashTable(len);
			}
			for (len = 0; len < defaultMultiLoc; len++) {
				@Pc(576) boolean local576 = arg0.g1() == 1;
				@Pc(580) int local580 = arg0.g3();
				@Pc(589) Node local589;
				if (local576) {
					local589 = new StringNode(arg0.gjstr());
				} else {
					local589 = new IntNode(arg0.g4());
				}
				this.params.put(local589, local580);
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Z")
	public final boolean isReady() {
		if (this.models == null) {
			return true;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.models.length; local15++) {
			local13 &= LocTypeList.modelsArchive.isFileReady(0, this.models[local15] & 0xFFFF);
		}
		return local13;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZZI)Lclient!td;")
	private GlModel method3427(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = this.anInt4407 + 64;
		@Pc(17) int local17 = this.anInt4405 * 5 + 768;
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
		@Pc(236) boolean local236 = this.aBoolean217;
		if (arg2 == 2 && arg0 > 3) {
			local236 = !local236;
		}
		@Pc(264) boolean local264 = this.resizeY == 128 && this.translateY == 0;
		@Pc(294) boolean local294 = arg0 == 0 && this.resizeX == 128 && this.resizeZ == 128 && this.translateX == 0 && this.translateZ == 0 && !local236;
		@Pc(351) GlModel local351 = local79.method4117(local294, local264, this.recolorSource == null, local79.method4094() == local10, arg0 == 0 && !local236, true, local17 == local79.method4115(), !local236, this.retextureSource == null);
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
		if (this.recolorSource != null) {
			for (local177 = 0; local177 < this.recolorSource.length; local177++) {
				local351.method4109(this.recolorSource[local177], this.recolorDestination[local177]);
			}
		}
		if (this.retextureSource != null) {
			for (local177 = 0; local177 < this.retextureSource.length; local177++) {
				local351.method4107(this.retextureSource[local177], this.retextureDestination[local177]);
			}
		}
		if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
			local351.resize(this.resizeX, this.resizeY, this.resizeZ);
		}
		if (this.translateX != 0 || this.translateY != 0 || this.translateZ != 0) {
			local351.translate(this.translateX, this.translateY, this.translateZ);
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
	public final Loc_Class139 method3428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) SoftwareIndexedSprite arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		@Pc(29) long local29;
		if (GlRenderer.enabled) {
			if (this.shapes == null) {
				local29 = (this.id << 10) + arg0;
			} else {
				local29 = arg0 + (this.id << 10) + (arg3 << 3);
			}
			@Pc(225) Loc_Class139 local225 = (Loc_Class139) LocTypeList.aClass99_14.get(local29);
			@Pc(235) GlModel local235;
			@Pc(265) SoftwareIndexedSprite local265;
			if (local225 == null) {
				local235 = this.method3427(arg0, false, arg3);
				if (local235 == null) {
					aClass139_1.aClass8_10 = null;
					aClass139_1.aClass36_Sub1_3 = null;
					return aClass139_1;
				}
				if (arg3 == 10 && arg0 > 3) {
					local235.method4554(256);
				}
				if (arg8) {
					local265 = local235.method4124(arg7);
				} else {
					local265 = null;
				}
				local225 = new Loc_Class139();
				local225.aClass8_10 = local235;
				local225.aClass36_Sub1_3 = local265;
				LocTypeList.aClass99_14.put(local225, local29);
			} else {
				local235 = (GlModel) local225.aClass8_10;
				local265 = local225.aClass36_Sub1_3;
			}
			@Pc(298) boolean local298 = this.aBoolean219 & arg6;
			@Pc(330) GlModel local330 = local235.method4117(this.aByte15 != 3, this.aByte15 == 0, true, true, true, !local298, true, true, true);
			if (this.aByte15 != 0) {
				local330.method4110(this.aByte15, this.aShort26, local235, arg2, arg5, arg1, arg4, arg9);
			}
			local330.method4111(this.anInt4429 == 0 && !this.aBoolean214, true, true, this.anInt4429 == 0, true, false);
			aClass139_1.aClass8_10 = local330;
			local330.aBoolean259 = local298;
			aClass139_1.aClass36_Sub1_3 = local265;
			return aClass139_1;
		}
		if (this.shapes == null) {
			local29 = (this.id << 10) + arg0;
		} else {
			local29 = (arg3 << 3) + ((this.id << 10) + arg0);
		}
		@Pc(50) boolean local50;
		if (arg6 && this.aBoolean219) {
			local29 |= Long.MIN_VALUE;
			local50 = true;
		} else {
			local50 = false;
		}
		@Pc(60) Entity local60 = (Entity) LocTypeList.aClass99_14.get(local29);
		if (local60 == null) {
			@Pc(69) RawModel local69 = this.method3418(arg0, arg3);
			if (local69 == null) {
				aClass139_1.aClass8_10 = null;
				return aClass139_1;
			}
			local69.resetBones();
			if (arg3 == 10 && arg0 > 3) {
				local69.method1682();
			}
			if (local50) {
				local69.aShort19 = (short) (this.anInt4407 + 64);
				local60 = local69;
				local69.aShort18 = (short) (this.anInt4405 * 5 + 768);
				local69.calculateNormals();
			} else {
				local60 = new SoftwareModel(local69, this.anInt4407 + 64, this.anInt4405 * 5 + 768, -50, -10, -50);
			}
			LocTypeList.aClass99_14.put(local60, local29);
		}
		if (local50) {
			local60 = ((RawModel) local60).method1675();
		}
		if (this.aByte15 != 0) {
			if (local60 instanceof SoftwareModel) {
				local60 = ((SoftwareModel) local60).method4586(this.aByte15, this.aShort26, arg2, arg5, arg1, arg4, arg9, true);
			} else if (local60 instanceof RawModel) {
				local60 = ((RawModel) local60).method1670(this.aByte15, this.aShort26, arg2, arg5, arg1, arg4, arg9);
			}
		}
		aClass139_1.aClass8_10 = local60;
		return aClass139_1;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILclient!ek;ILclient!tk;I[[IZII[[IIII)Lclient!sm;")
	public final Loc_Class139 method3429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) SoftwareIndexedSprite arg2, @OriginalArg(3) int arg3, @OriginalArg(4) SeqType arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int[][] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(30) long local30;
		if (!GlRenderer.enabled) {
			if (this.shapes == null) {
				local30 = (this.id << 10) + arg5;
			} else {
				local30 = arg5 + (this.id << 10) + (arg11 << 3);
			}
			@Pc(195) SoftwareModel local195 = (SoftwareModel) LocTypeList.aClass99_36.get(local30);
			if (local195 == null) {
				@Pc(204) RawModel local204 = this.method3418(arg5, arg11);
				if (local204 == null) {
					return null;
				}
				local195 = new SoftwareModel(local204, this.anInt4407 + 64, this.anInt4405 * 5 + 768, -50, -10, -50);
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
				local195.method4554(256);
			}
			if (this.aByte15 != 0) {
				if (!local234) {
					local195 = (SoftwareModel) local195.method4568(true, true, true);
				}
				local195 = local195.method4586(this.aByte15, this.aShort26, arg6, arg9, arg1, arg3, arg0, false);
			}
			aClass139_1.aClass8_10 = local195;
			return aClass139_1;
		}
		if (this.shapes == null) {
			local30 = arg5 + (this.id << 10);
		} else {
			local30 = (arg11 << 3) + ((this.id << 10) + arg5);
		}
		@Pc(46) GlModel local46 = (GlModel) LocTypeList.aClass99_36.get(local30);
		if (local46 == null) {
			local46 = this.method3427(arg5, true, arg11);
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
			local82.method4554(256);
		}
		if (arg7) {
			aClass139_1.aClass36_Sub1_3 = local82.method4124(arg2);
		} else {
			aClass139_1.aClass36_Sub1_3 = null;
		}
		if (this.aByte15 != 0) {
			if (!local80) {
				local82 = (GlModel) local82.method4568(true, true, true);
			}
			local82.method4110(this.aByte15, this.aShort26, local46, arg6, arg9, arg1, arg3, arg0);
		}
		aClass139_1.aClass8_10 = local82;
		return aClass139_1;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!na;II)Lclient!na;")
	public final JagString method3430(@OriginalArg(0) JagString arg0, @OriginalArg(2) int arg1) {
		if (this.params == null) {
			return arg0;
		} else {
			@Pc(26) StringNode local26 = (StringNode) this.params.get(arg1);
			return local26 == null ? arg0 : local26.value;
		}
	}
}
