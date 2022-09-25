package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class NpcType {

	@OriginalMember(owner = "client!id", name = "e", descriptor = "[I")
	public static final int[] anIntArray259 = new int[14];
	@OriginalMember(owner = "client!lg", name = "c", descriptor = "[Lclient!tk;")
	public static final SeqType[] aClass144Array1 = new SeqType[14];
	@OriginalMember(owner = "client!ag", name = "cb", descriptor = "[Lclient!cl;")
	public static final AnimFrameset[] aClass3_Sub2_Sub7Array1 = new AnimFrameset[14];
	@OriginalMember(owner = "client!fk", name = "k", descriptor = "[I")
	public static final int[] anIntArray147 = new int[14];
	@OriginalMember(owner = "client!rg", name = "A", descriptor = "[I")
	public static final int[] anIntArray492 = new int[14];
	@OriginalMember(owner = "client!kd", name = "mb", descriptor = "[Lclient!cl;")
	public static final AnimFrameset[] aClass3_Sub2_Sub7Array5 = new AnimFrameset[14];
	@OriginalMember(owner = "client!en", name = "t", descriptor = "[I")
	public static final int[] anIntArray148 = new int[14];
	@OriginalMember(owner = "client!me", name = "b", descriptor = "[S")
	private short[] retex_d;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "[B")
	private byte[] recol_p;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "[S")
	private short[] recol_s;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "[I")
	private int[] headmodels;

	@OriginalMember(owner = "client!me", name = "o", descriptor = "[S")
	private short[] recol_d;

	@OriginalMember(owner = "client!me", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!me", name = "z", descriptor = "[[I")
	private int[][] modeloffsets;

	@OriginalMember(owner = "client!me", name = "J", descriptor = "[S")
	private short[] retex_s;

	@OriginalMember(owner = "client!me", name = "K", descriptor = "Lclient!sc;")
	private HashTable params;

	@OriginalMember(owner = "client!me", name = "X", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!me", name = "cb", descriptor = "[I")
	private int[] modelIndices;

	@OriginalMember(owner = "client!me", name = "hb", descriptor = "[I")
	public int[] multiNpcs;

	@OriginalMember(owner = "client!me", name = "A", descriptor = "I")
	public int idleSound = -1;

	@OriginalMember(owner = "client!me", name = "I", descriptor = "Z")
	public boolean interactive = true;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "I")
	public int size = 1;

	@OriginalMember(owner = "client!me", name = "q", descriptor = "Z")
	public boolean rotationflag = true;

	@OriginalMember(owner = "client!me", name = "O", descriptor = "I")
	public int runSound = -1;

	@OriginalMember(owner = "client!me", name = "r", descriptor = "S")
	public short shadowcolor2 = 0;

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "Lclient!na;")
	public static final JagString aClass100_1010 = JagString.parse("null");
	@OriginalMember(owner = "client!me", name = "L", descriptor = "Lclient!na;")
	public JagString name = aClass100_1010;

	@OriginalMember(owner = "client!me", name = "x", descriptor = "I")
	public int combatLevel = -1;

	@OriginalMember(owner = "client!me", name = "Z", descriptor = "Z")
	public boolean minimapdisplay = true;

	@OriginalMember(owner = "client!me", name = "l", descriptor = "I")
	public int cursor1 = -1;

	@OriginalMember(owner = "client!me", name = "U", descriptor = "I")
	private int contrast = 0;

	@OriginalMember(owner = "client!me", name = "V", descriptor = "I")
	public int minimapmarkerobjectentry = -1;

	@OriginalMember(owner = "client!me", name = "C", descriptor = "I")
	private int resizeX = 128;

	@OriginalMember(owner = "client!me", name = "N", descriptor = "B")
	public byte shadowcolormodifier2 = -16;

	@OriginalMember(owner = "client!me", name = "H", descriptor = "I")
	public int headicon = -1;

	@OriginalMember(owner = "client!me", name = "F", descriptor = "B")
	public byte loginscreenproperties = 0;

	@OriginalMember(owner = "client!me", name = "e", descriptor = "Z")
	public boolean hasshadow = true;

	@OriginalMember(owner = "client!me", name = "ab", descriptor = "S")
	public short shadowcolor1 = 0;

	@OriginalMember(owner = "client!me", name = "db", descriptor = "I")
	public int cursor2Op = -1;

	@OriginalMember(owner = "client!me", name = "R", descriptor = "I")
	public int hitBarId = -1;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "I")
	private int ambient = 0;

	@OriginalMember(owner = "client!me", name = "B", descriptor = "Z")
	public boolean toprenderpriority = false;

	@OriginalMember(owner = "client!me", name = "M", descriptor = "I")
	public int rotationspeed = 32;

	@OriginalMember(owner = "client!me", name = "u", descriptor = "[Lclient!na;")
	public final JagString[] ops = new JagString[5];

	@OriginalMember(owner = "client!me", name = "ib", descriptor = "I")
	public int walkSound = -1;

	@OriginalMember(owner = "client!me", name = "bb", descriptor = "B")
	public byte shadowcolormodifier1 = -96;

	@OriginalMember(owner = "client!me", name = "G", descriptor = "B")
	public byte spawndirection = 7;

	@OriginalMember(owner = "client!me", name = "S", descriptor = "I")
	public int bastypeid = -1;

	@OriginalMember(owner = "client!me", name = "mb", descriptor = "I")
	public int cursor1Op = -1;

	@OriginalMember(owner = "client!me", name = "gb", descriptor = "I")
	public int soundRadius = 0;

	@OriginalMember(owner = "client!me", name = "E", descriptor = "I")
	private int resizeY = 128;

	@OriginalMember(owner = "client!me", name = "s", descriptor = "I")
	public int multiNpcVarbit = -1;

	@OriginalMember(owner = "client!me", name = "fb", descriptor = "I")
	public int crawlSound = -1;

	@OriginalMember(owner = "client!me", name = "D", descriptor = "I")
	public int iconHeight = -1;

	@OriginalMember(owner = "client!me", name = "Q", descriptor = "I")
	public int cursor2 = -1;

	@OriginalMember(owner = "client!me", name = "lb", descriptor = "I")
	private int multiNpcVarp = -1;

	@OriginalMember(owner = "client!me", name = "ob", descriptor = "I")
	public int attackCursor = -1;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)Lclient!me;")
	public final NpcType getMultiNpc() {
		@Pc(5) int local5 = -1;
		if (this.multiNpcVarbit != -1) {
			local5 = VarpDomain.getVarbit(this.multiNpcVarbit);
		} else if (this.multiNpcVarp != -1) {
			local5 = VarpDomain.activeVarps[this.multiNpcVarp];
		}
		if (local5 < 0 || local5 >= this.multiNpcs.length - 1 || this.multiNpcs[local5] == -1) {
			@Pc(55) int local55 = this.multiNpcs[this.multiNpcs.length - 1];
			return local55 == -1 ? null : NpcTypeList.get(local55);
		} else {
			return NpcTypeList.get(this.multiNpcs[local5]);
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(B)Z")
	public final boolean isMultiNpcValid() {
		if (this.multiNpcs == null) {
			return true;
		}
		@Pc(16) int local16 = -1;
		if (this.multiNpcVarbit != -1) {
			local16 = VarpDomain.getVarbit(this.multiNpcVarbit);
		} else if (this.multiNpcVarp != -1) {
			local16 = VarpDomain.activeVarps[this.multiNpcVarp];
		}
		if (local16 < 0 || local16 >= this.multiNpcs.length - 1 || this.multiNpcs[local16] == -1) {
			@Pc(62) int local62 = this.multiNpcs[this.multiNpcs.length - 1];
			return local62 != -1;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)Z")
	public final boolean hasAreaSound() {
		if (this.multiNpcs == null) {
			return this.idleSound != -1 || this.walkSound != -1 || this.runSound != -1;
		}
		for (@Pc(35) int local35 = 0; local35 < this.multiNpcs.length; local35++) {
			if (this.multiNpcs[local35] != -1) {
				@Pc(60) NpcType local60 = NpcTypeList.get(this.multiNpcs[local35]);
				if (local60.idleSound != -1 || local60.walkSound != -1 || local60.runSound != -1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(III)I")
	public final int getParam(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			@Pc(18) IntNode local18 = (IntNode) this.params.get(arg0);
			return local18 == null ? arg1 : local18.value;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([Lclient!ub;IBIIIILclient!tk;ILclient!tk;)Lclient!ak;")
	public final Model getBodyModel(@OriginalArg(0) PathingEntity_Class147[] seqs, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) SeqType seqType1, @OriginalArg(8) int arg7, @OriginalArg(9) SeqType seqType2) {
		if (this.multiNpcs != null) {
			@Pc(13) NpcType local13 = this.getMultiNpc();
			return local13 == null ? null : local13.getBodyModel(seqs, arg1, arg2, arg3, arg4, arg5, seqType1, arg7, seqType2);
		}
		@Pc(40) Model local40 = (Model) NpcTypeList.models.get(this.id);
		@Pc(46) boolean local46;
		@Pc(173) int local173;
		@Pc(235) int local235;
		@Pc(221) int local221;
		@Pc(200) int local200;
		@Pc(207) int local207;
		@Pc(214) int local214;
		@Pc(228) int local228;
		@Pc(300) int local300;
		@Pc(324) int local324;
		@Pc(318) int local318;
		@Pc(330) int local330;
		if (local40 == null) {
			local46 = false;
			for (@Pc(48) int local48 = 0; local48 < this.modelIndices.length; local48++) {
				if (this.modelIndices[local48] != -1 && !NpcTypeList.modelsArchive.isFileReady(0, this.modelIndices[local48])) {
					local46 = true;
				}
			}
			if (local46) {
				return null;
			}
			@Pc(84) RawModel[] local84 = new RawModel[this.modelIndices.length];
			for (@Pc(86) int local86 = 0; local86 < this.modelIndices.length; local86++) {
				if (this.modelIndices[local86] != -1) {
					local84[local86] = RawModel.create(NpcTypeList.modelsArchive, this.modelIndices[local86]);
					if (this.modeloffsets != null && this.modeloffsets[local86] != null && local84[local86] != null) {
						local84[local86].translate(this.modeloffsets[local86][0], this.modeloffsets[local86][1], this.modeloffsets[local86][2]);
					}
				}
			}
			@Pc(156) BasType local156 = null;
			if (this.bastypeid != -1) {
				local156 = BasTypeList.get(this.bastypeid);
			}
			if (local156 != null && local156.modelRotateTranslate != null) {
				for (local173 = 0; local173 < local156.modelRotateTranslate.length; local173++) {
					if (local156.modelRotateTranslate[local173] != null && local84.length > local173 && local84[local173] != null) {
						local200 = local156.modelRotateTranslate[local173][2];
						local207 = local156.modelRotateTranslate[local173][3];
						local214 = local156.modelRotateTranslate[local173][4];
						local221 = local156.modelRotateTranslate[local173][1];
						local228 = local156.modelRotateTranslate[local173][5];
						local235 = local156.modelRotateTranslate[local173][0];
						if (this.anIntArrayArray28 == null) {
							this.anIntArrayArray28 = new int[local156.modelRotateTranslate.length][];
						}
						if (this.anIntArrayArray28[local173] == null) {
							@Pc(259) int[] local259 = this.anIntArrayArray28[local173] = new int[15];
							if (local207 == 0 && local214 == 0 && local228 == 0) {
								local259[13] = -local221;
								local259[14] = -local200;
								local259[0] = local259[4] = local259[8] = 32768;
								local259[12] = -local235;
							} else {
								local300 = MathUtils.cos[local207] >> 1;
								@Pc(306) int local306 = MathUtils.sin[local207] >> 1;
								@Pc(312) int local312 = MathUtils.cos[local214] >> 1;
								local318 = MathUtils.cos[local228] >> 1;
								local324 = MathUtils.sin[local214] >> 1;
								local330 = MathUtils.sin[local228] >> 1;
								local259[3] = local300 * local330 + 16384 >> 15;
								local259[8] = local300 * local312 + 16384 >> 15;
								local259[5] = -local306;
								@Pc(363) int local363 = local306 * local330 + 16384 >> 15;
								@Pc(371) int local371 = local318 * local306 + 16384 >> 15;
								local259[1] = -local330 * local312 + local371 * local324 + 16384 >> 15;
								local259[2] = local324 * local300 + 16384 >> 15;
								local259[6] = -local324 * local318 + local363 * local312 + 16384 >> 15;
								local259[14] = local259[8] * -local200 + -local221 * local259[5] + local259[2] * -local235 + 16384 >> 15;
								local259[4] = local300 * local318 + 16384 >> 15;
								local259[7] = -local324 * -local330 + local371 * local312 + 16384 >> 15;
								local259[0] = local324 * local363 + local312 * local318 + 16384 >> 15;
								local259[12] = local259[6] * -local200 + local259[3] * -local221 + -local235 * local259[0] + 16384 >> 15;
								local259[13] = -local200 * local259[7] + -local235 * local259[1] + -local221 * local259[4] + 16384 >> 15;
							}
							local259[10] = local221;
							local259[9] = local235;
							local259[11] = local200;
						}
						if (local207 != 0 || local214 != 0 || local228 != 0) {
							local84[local173].method1684(local207, local214, local228);
						}
						if (local235 != 0 || local221 != 0 || local200 != 0) {
							local84[local173].translate(local235, local221, local200);
						}
					}
				}
			}
			@Pc(593) RawModel local593;
			if (local84.length == 1) {
				local593 = local84[0];
			} else {
				local593 = new RawModel(local84, local84.length);
			}
			if (this.recol_s != null) {
				for (local173 = 0; local173 < this.recol_s.length; local173++) {
					if (this.recol_p == null || this.recol_p.length <= local173) {
						local593.recolor(this.recol_s[local173], this.recol_d[local173]);
					} else {
						local593.recolor(this.recol_s[local173], client.aShortArray74[this.recol_p[local173] & 0xFF]);
					}
				}
			}
			if (this.retex_s != null) {
				for (local173 = 0; local173 < this.retex_s.length; local173++) {
					local593.retexture(this.retex_s[local173], this.retex_d[local173]);
				}
			}
			local40 = local593.createModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
			if (GlRenderer.enabled) {
				((GlModel) local40).method4111(false, false, false, false, false, true);
			}
			NpcTypeList.models.put(local40, this.id);
		}
		local46 = false;
		@Pc(721) boolean local721 = false;
		@Pc(723) boolean local723 = false;
		@Pc(725) boolean local725 = false;
		local173 = seqs == null ? 0 : seqs.length;
		for (local235 = 0; local235 < local173; local235++) {
			if (seqs[local235] != null) {
				@Pc(753) SeqType local753 = SeqTypeList.get(seqs[local235].anInt5396);
				if (local753.frames != null) {
					aClass144Array1[local235] = local753;
					local207 = seqs[local235].anInt5398;
					local46 = true;
					local200 = seqs[local235].anInt5399;
					local214 = local753.frames[local200];
					aClass3_Sub2_Sub7Array1[local235] = SeqTypeList.getAnimFrameset(local214 >>> 16);
					local214 &= 0xFFFF;
					anIntArray259[local235] = local214;
					if (aClass3_Sub2_Sub7Array1[local235] != null) {
						local723 |= aClass3_Sub2_Sub7Array1[local235].isColorTransformed(local214);
						local721 |= aClass3_Sub2_Sub7Array1[local235].isAlphaTransformed(local214);
						local725 |= local753.aBoolean278;
					}
					if ((local753.tween || SeqType.applyTweening) && local207 != -1 && local753.frames.length > local207) {
						anIntArray147[local235] = local753.frameDelay[local200];
						anIntArray492[local235] = seqs[local235].anInt5404;
						local228 = local753.frames[local207];
						aClass3_Sub2_Sub7Array5[local235] = SeqTypeList.getAnimFrameset(local228 >>> 16);
						local228 &= 0xFFFF;
						anIntArray148[local235] = local228;
						if (aClass3_Sub2_Sub7Array5[local235] != null) {
							local723 |= aClass3_Sub2_Sub7Array5[local235].isColorTransformed(local228);
							local721 |= aClass3_Sub2_Sub7Array5[local235].isAlphaTransformed(local228);
						}
					} else {
						anIntArray147[local235] = 0;
						anIntArray492[local235] = 0;
						aClass3_Sub2_Sub7Array5[local235] = null;
						anIntArray148[local235] = -1;
					}
				}
			}
		}
		if (!local46 && seqType2 == null && seqType1 == null) {
			@Pc(933) Model local933 = local40.method4572(true, true, true);
			if (this.resizeX != 128 || this.resizeY != 128) {
				local933.resize(this.resizeX, this.resizeY, this.resizeX);
			}
			return local933;
		}
		local221 = -1;
		local235 = -1;
		local200 = 0;
		@Pc(962) AnimFrameset local962 = null;
		@Pc(964) AnimFrameset local964 = null;
		@Pc(1040) int local1040;
		if (seqType2 != null) {
			local235 = seqType2.frames[arg5];
			local228 = local235 >>> 16;
			local235 &= 0xFFFF;
			local962 = SeqTypeList.getAnimFrameset(local228);
			if (local962 != null) {
				local723 |= local962.isColorTransformed(local235);
				local721 |= local962.isAlphaTransformed(local235);
				local725 |= seqType2.aBoolean278;
			}
			if ((seqType2.tween || SeqType.applyTweening) && arg3 != -1 && seqType2.frames.length > arg3) {
				local200 = seqType2.frameDelay[arg5];
				local221 = seqType2.frames[arg3];
				local1040 = local221 >>> 16;
				local221 &= 0xFFFF;
				if (local228 == local1040) {
					local964 = local962;
				} else {
					local964 = SeqTypeList.getAnimFrameset(local221 >>> 16);
				}
				if (local964 != null) {
					local723 |= local964.isColorTransformed(local221);
					local721 |= local964.isAlphaTransformed(local221);
				}
			}
		}
		local228 = -1;
		local1040 = -1;
		@Pc(1088) AnimFrameset local1088 = null;
		local300 = 0;
		@Pc(1092) AnimFrameset local1092 = null;
		if (seqType1 != null) {
			local228 = seqType1.frames[arg2];
			local324 = local228 >>> 16;
			local228 &= 0xFFFF;
			local1088 = SeqTypeList.getAnimFrameset(local324);
			if (local1088 != null) {
				local723 |= local1088.isColorTransformed(local228);
				local721 |= local1088.isAlphaTransformed(local228);
				local725 |= seqType1.aBoolean278;
			}
			if ((seqType1.tween || SeqType.applyTweening) && arg1 != -1 && arg1 < seqType1.frames.length) {
				local300 = seqType1.frameDelay[arg2];
				local1040 = seqType1.frames[arg1];
				local318 = local1040 >>> 16;
				local1040 &= 0xFFFF;
				if (local318 == local324) {
					local1092 = local1088;
				} else {
					local1092 = SeqTypeList.getAnimFrameset(local1040 >>> 16);
				}
				if (local1092 != null) {
					local723 |= local1092.isColorTransformed(local1040);
					local721 |= local1092.isAlphaTransformed(local1040);
				}
			}
		}
		@Pc(1218) Model local1218 = local40.method4572(!local721, !local723, !local725);
		local330 = 1;
		for (local318 = 0; local318 < local173; local318++) {
			if (aClass3_Sub2_Sub7Array1[local318] != null) {
				local1218.method4565(aClass3_Sub2_Sub7Array1[local318], anIntArray259[local318], aClass3_Sub2_Sub7Array5[local318], anIntArray148[local318], anIntArray492[local318] - 1, anIntArray147[local318], local330, aClass144Array1[local318].aBoolean278, this.anIntArrayArray28[local318]);
			}
			local330 <<= 0x1;
		}
		if (local962 != null && local1088 != null) {
			local1218.method4570(local962, local235, local964, local221, arg4 - 1, local200, local1088, local228, local1092, local1040, arg7 - 1, local300, seqType2.framegroup, seqType2.aBoolean278 | seqType1.aBoolean278);
		} else if (local962 != null) {
			local1218.method4558(local962, local235, local964, local221, arg4 - 1, local200, seqType2.aBoolean278);
		} else if (local1088 != null) {
			local1218.method4558(local1088, local228, local1092, local1040, arg7 - 1, local300, seqType1.aBoolean278);
		}
		for (local318 = 0; local318 < local173; local318++) {
			aClass3_Sub2_Sub7Array1[local318] = null;
			aClass3_Sub2_Sub7Array5[local318] = null;
			aClass144Array1[local318] = null;
		}
		if (this.resizeX != 128 || this.resizeY != 128) {
			local1218.resize(this.resizeX, this.resizeY, this.resizeX);
		}
		return local1218;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!na;Z)Lclient!na;")
	public final JagString getParam(@OriginalArg(0) int arg0, @OriginalArg(1) JagString arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			@Pc(18) StringNode local18 = (StringNode) this.params.get(arg0);
			return local18 == null ? arg1 : local18.value;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!wa;I)V")
	public final void decode(@OriginalArg(0) Buffer buffer) {
		while (true) {
			@Pc(9) int opcode = buffer.g1();
			if (opcode == 0) {
				return;
			}
			this.decode(opcode, buffer);
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	public final void method2942() {
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!tk;IIII)Lclient!ak;")
	public final Model getHeadModel(@OriginalArg(0) SeqType arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.multiNpcs != null) {
			@Pc(13) NpcType local13 = this.getMultiNpc();
			return local13 == null ? null : local13.getHeadModel(arg0, arg1, arg2, arg3);
		} else if (this.headmodels == null) {
			return null;
		} else {
			@Pc(41) Model local41 = (Model) NpcTypeList.headModels.get(this.id);
			if (local41 == null) {
				@Pc(46) boolean local46 = false;
				for (@Pc(48) int local48 = 0; local48 < this.headmodels.length; local48++) {
					if (!NpcTypeList.modelsArchive.isFileReady(0, this.headmodels[local48])) {
						local46 = true;
					}
				}
				if (local46) {
					return null;
				}
				@Pc(82) RawModel[] local82 = new RawModel[this.headmodels.length];
				for (@Pc(84) int local84 = 0; local84 < this.headmodels.length; local84++) {
					local82[local84] = RawModel.create(NpcTypeList.modelsArchive, this.headmodels[local84]);
				}
				@Pc(119) RawModel local119;
				if (local82.length == 1) {
					local119 = local82[0];
				} else {
					local119 = new RawModel(local82, local82.length);
				}
				@Pc(130) int local130;
				if (this.recol_s != null) {
					for (local130 = 0; local130 < this.recol_s.length; local130++) {
						if (this.recol_p == null || local130 >= this.recol_p.length) {
							local119.recolor(this.recol_s[local130], this.recol_d[local130]);
						} else {
							local119.recolor(this.recol_s[local130], client.aShortArray74[this.recol_p[local130] & 0xFF]);
						}
					}
				}
				if (this.retex_s != null) {
					for (local130 = 0; local130 < this.retex_s.length; local130++) {
						local119.retexture(this.retex_s[local130], this.retex_d[local130]);
					}
				}
				local41 = local119.createModel(64, 768, -50, -10, -50);
				NpcTypeList.headModels.put(local41, this.id);
			}
			if (arg0 != null) {
				local41 = arg0.method4215(local41, arg2, arg1, arg3);
			}
			return local41;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IILclient!wa;)V")
	private void decode(@OriginalArg(1) int opcode, @OriginalArg(2) Buffer buffer) {
		@Pc(12) int count;
		@Pc(18) int i;
		if (opcode == 1) {
			count = buffer.g1();
			this.modelIndices = new int[count];
			for (i = 0; i < count; i++) {
				this.modelIndices[i] = buffer.g2();
				if (this.modelIndices[i] == 65535) {
					this.modelIndices[i] = -1;
				}
			}
		} else if (opcode == 2) {
			this.name = buffer.gjstr();
		} else if (opcode == 12) {
			this.size = buffer.g1();
		} else if (opcode >= 30 && opcode < 35) {
			this.ops[opcode - 30] = buffer.gjstr();
			if (this.ops[opcode - 30].equalsIgnoreCase(LocalizedText.HIDDEN)) {
				this.ops[opcode - 30] = null;
			}
		} else if (opcode == 40) {
			count = buffer.g1();
			this.recol_d = new short[count];
			this.recol_s = new short[count];
			for (i = 0; i < count; i++) {
				this.recol_s[i] = (short) buffer.g2();
				this.recol_d[i] = (short) buffer.g2();
			}
		} else if (opcode == 41) {
			count = buffer.g1();
			this.retex_d = new short[count];
			this.retex_s = new short[count];
			for (i = 0; i < count; i++) {
				this.retex_s[i] = (short) buffer.g2();
				this.retex_d[i] = (short) buffer.g2();
			}
		} else if (opcode == 42) {
			count = buffer.g1();
			this.recol_p = new byte[count];
			for (i = 0; i < count; i++) {
				this.recol_p[i] = buffer.g1b();
			}
		} else if (opcode == 60) {
			count = buffer.g1();
			this.headmodels = new int[count];
			for (i = 0; i < count; i++) {
				this.headmodels[i] = buffer.g2();
			}
		} else if (opcode == 93) {
			this.minimapdisplay = false;
		} else if (opcode == 95) {
			this.combatLevel = buffer.g2();
		} else if (opcode == 97) {
			this.resizeX = buffer.g2();
		} else if (opcode == 98) {
			this.resizeY = buffer.g2();
		} else if (opcode == 99) {
			this.toprenderpriority = true;
		} else if (opcode == 100) {
			this.ambient = buffer.g1b();
		} else if (opcode == 101) {
			this.contrast = buffer.g1b() * 5;
		} else if (opcode == 102) {
			this.headicon = buffer.g2();
		} else if (opcode == 103) {
			this.rotationspeed = buffer.g2();
		} else {
			@Pc(297) int local297;
			if (opcode == 106 || opcode == 118) {
				this.multiNpcVarbit = buffer.g2();
				count = -1;
				if (this.multiNpcVarbit == 65535) {
					this.multiNpcVarbit = -1;
				}
				this.multiNpcVarp = buffer.g2();
				if (this.multiNpcVarp == 65535) {
					this.multiNpcVarp = -1;
				}
				if (opcode == 118) {
					count = buffer.g2();
					if (count == 65535) {
						count = -1;
					}
				}
				i = buffer.g1();
				this.multiNpcs = new int[i + 2];
				for (local297 = 0; local297 <= i; local297++) {
					this.multiNpcs[local297] = buffer.g2();
					if (this.multiNpcs[local297] == 65535) {
						this.multiNpcs[local297] = -1;
					}
				}
				this.multiNpcs[i + 1] = count;
			} else if (opcode == 107) {
				this.interactive = false;
			} else if (opcode == 109) {
				this.rotationflag = false;
			} else if (opcode == 111) {
				this.hasshadow = false;
			} else if (opcode == 113) {
				this.shadowcolor1 = (short) buffer.g2();
				this.shadowcolor2 = (short) buffer.g2();
			} else if (opcode == 114) {
				this.shadowcolormodifier1 = buffer.g1b();
				this.shadowcolormodifier2 = buffer.g1b();
			} else if (opcode == 115) {
				buffer.g1();
				buffer.g1();
			} else if (opcode == 119) {
				this.loginscreenproperties = buffer.g1b();
			} else if (opcode == 121) {
				this.modeloffsets = new int[this.modelIndices.length][];
				count = buffer.g1();
				for (i = 0; i < count; i++) {
					local297 = buffer.g1();
					@Pc(439) int[] tempArray = this.modeloffsets[local297] = new int[3];
					tempArray[0] = buffer.g1b();
					tempArray[1] = buffer.g1b();
					tempArray[2] = buffer.g1b();
				}
			} else if (opcode == 122) {
				this.hitBarId = buffer.g2();
			} else if (opcode == 123) {
				this.iconHeight = buffer.g2();
			} else if (opcode == 125) {
				this.spawndirection = buffer.g1b();
			} else if (opcode == 126) {
				this.minimapmarkerobjectentry = buffer.g2();
			} else if (opcode == 127) {
				this.bastypeid = buffer.g2();
			} else if (opcode == 128) {
				buffer.g1();
			} else if (opcode == 134) {
				this.idleSound = buffer.g2();
				if (this.idleSound == 65535) {
					this.idleSound = -1;
				}
				this.crawlSound = buffer.g2();
				if (this.crawlSound == 65535) {
					this.crawlSound = -1;
				}
				this.walkSound = buffer.g2();
				if (this.walkSound == 65535) {
					this.walkSound = -1;
				}
				this.runSound = buffer.g2();
				if (this.runSound == 65535) {
					this.runSound = -1;
				}
				this.soundRadius = buffer.g1();
			} else if (opcode == 135) {
				this.cursor1Op = buffer.g1();
				this.cursor1 = buffer.g2();
			} else if (opcode == 136) {
				this.cursor2Op = buffer.g1();
				this.cursor2 = buffer.g2();
			} else if (opcode == 137) {
				this.attackCursor = buffer.g2();
			} else if (opcode == 249) {
				count = buffer.g1();
				if (this.params == null) {
					i = IntUtils.clp2(count);
					this.params = new HashTable(i);
				}
				for (i = 0; i < count; i++) {
					@Pc(592) boolean isString = buffer.g1() == 1;
					@Pc(596) int key = buffer.g3();
					@Pc(605) Node value;
					if (isString) {
						value = new StringNode(buffer.gjstr());
					} else {
						value = new IntNode(buffer.g4());
					}
					this.params.put(value, key);
				}
			}
		}
	}
}
