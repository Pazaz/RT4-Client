package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class NpcType {

	@OriginalMember(owner = "client!me", name = "b", descriptor = "[S")
	private short[] retextureSource;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "[B")
	private byte[] aByteArray51;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "[S")
	private short[] recolorDestination;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "[I")
	private int[] anIntArray354;

	@OriginalMember(owner = "client!me", name = "o", descriptor = "[S")
	private short[] recolorSource;

	@OriginalMember(owner = "client!me", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!me", name = "z", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!me", name = "J", descriptor = "[S")
	private short[] retextureDestination;

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
	public boolean aBoolean183 = true;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "I")
	public int size = 1;

	@OriginalMember(owner = "client!me", name = "q", descriptor = "Z")
	public boolean aBoolean181 = true;

	@OriginalMember(owner = "client!me", name = "O", descriptor = "I")
	public int runSound = -1;

	@OriginalMember(owner = "client!me", name = "r", descriptor = "S")
	public short aShort23 = 0;

	@OriginalMember(owner = "client!me", name = "L", descriptor = "Lclient!na;")
	public JagString name = Static266.aClass100_1010;

	@OriginalMember(owner = "client!me", name = "x", descriptor = "I")
	public int combatLevel = -1;

	@OriginalMember(owner = "client!me", name = "Z", descriptor = "Z")
	public boolean aBoolean184 = true;

	@OriginalMember(owner = "client!me", name = "l", descriptor = "I")
	public int cursor1 = -1;

	@OriginalMember(owner = "client!me", name = "U", descriptor = "I")
	private int anInt3738 = 0;

	@OriginalMember(owner = "client!me", name = "V", descriptor = "I")
	public int anInt3739 = -1;

	@OriginalMember(owner = "client!me", name = "C", descriptor = "I")
	private int anInt3729 = 128;

	@OriginalMember(owner = "client!me", name = "N", descriptor = "B")
	public byte aByte12 = -16;

	@OriginalMember(owner = "client!me", name = "H", descriptor = "I")
	public int prayerIcon = -1;

	@OriginalMember(owner = "client!me", name = "F", descriptor = "B")
	public byte aByte10 = 0;

	@OriginalMember(owner = "client!me", name = "e", descriptor = "Z")
	public boolean shadow = true;

	@OriginalMember(owner = "client!me", name = "ab", descriptor = "S")
	public short aShort24 = 0;

	@OriginalMember(owner = "client!me", name = "db", descriptor = "I")
	public int cursor2Op = -1;

	@OriginalMember(owner = "client!me", name = "R", descriptor = "I")
	public int hitBarId = -1;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "I")
	private int anInt3715 = 0;

	@OriginalMember(owner = "client!me", name = "B", descriptor = "Z")
	public boolean aBoolean182 = false;

	@OriginalMember(owner = "client!me", name = "M", descriptor = "I")
	public int anInt3733 = 32;

	@OriginalMember(owner = "client!me", name = "u", descriptor = "[Lclient!na;")
	public final JagString[] ops = new JagString[5];

	@OriginalMember(owner = "client!me", name = "ib", descriptor = "I")
	public int walkSound = -1;

	@OriginalMember(owner = "client!me", name = "bb", descriptor = "B")
	public byte aByte13 = -96;

	@OriginalMember(owner = "client!me", name = "G", descriptor = "B")
	public byte aByte11 = 7;

	@OriginalMember(owner = "client!me", name = "S", descriptor = "I")
	public int basId = -1;

	@OriginalMember(owner = "client!me", name = "mb", descriptor = "I")
	public int cursor1Op = -1;

	@OriginalMember(owner = "client!me", name = "gb", descriptor = "I")
	public int soundRadius = 0;

	@OriginalMember(owner = "client!me", name = "E", descriptor = "I")
	private int anInt3731 = 128;

	@OriginalMember(owner = "client!me", name = "s", descriptor = "I")
	private int multiNpcVarbit = -1;

	@OriginalMember(owner = "client!me", name = "fb", descriptor = "I")
	public int crawlSound = -1;

	@OriginalMember(owner = "client!me", name = "D", descriptor = "I")
	public int anInt3730 = -1;

	@OriginalMember(owner = "client!me", name = "Q", descriptor = "I")
	public int cursor2 = -1;

	@OriginalMember(owner = "client!me", name = "lb", descriptor = "I")
	private int multiNpcVarp = -1;

	@OriginalMember(owner = "client!me", name = "ob", descriptor = "I")
	public int anInt3752 = -1;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)Lclient!me;")
	public final NpcType getMultiNpc() {
		@Pc(5) int local5 = -1;
		if (this.multiNpcVarbit != -1) {
			local5 = Static155.getVarbit(this.multiNpcVarbit);
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
			local16 = Static155.getVarbit(this.multiNpcVarbit);
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
			@Pc(18) IntNode local18 = (IntNode) this.params.get((long) arg0);
			return local18 == null ? arg1 : local18.value;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([Lclient!ub;IBIIIILclient!tk;ILclient!tk;)Lclient!ak;")
	public final Model getBodyModel(@OriginalArg(0) Npc_Class147[] seqs, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) SeqType seqType1, @OriginalArg(8) int arg7, @OriginalArg(9) SeqType seqType2) {
		if (this.multiNpcs != null) {
			@Pc(13) NpcType local13 = this.getMultiNpc();
			return local13 == null ? null : local13.getBodyModel(seqs, arg1, arg2, arg3, arg4, arg5, seqType1, arg7, seqType2);
		}
		@Pc(40) Model local40 = (Model) NpcTypeList.aClass99_18.get((long) this.id);
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
					local84[local86] = Static77.create(NpcTypeList.modelsArchive, this.modelIndices[local86]);
					if (this.anIntArrayArray29 != null && this.anIntArrayArray29[local86] != null && local84[local86] != null) {
						local84[local86].translate(this.anIntArrayArray29[local86][0], this.anIntArrayArray29[local86][1], this.anIntArrayArray29[local86][2]);
					}
				}
			}
			@Pc(156) BasType local156 = null;
			if (this.basId != -1) {
				local156 = BasTypeList.get(this.basId);
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
			if (this.recolorDestination != null) {
				for (local173 = 0; local173 < this.recolorDestination.length; local173++) {
					if (this.aByteArray51 == null || this.aByteArray51.length <= local173) {
						local593.recolor(this.recolorDestination[local173], this.recolorSource[local173]);
					} else {
						local593.recolor(this.recolorDestination[local173], client.aShortArray74[this.aByteArray51[local173] & 0xFF]);
					}
				}
			}
			if (this.retextureDestination != null) {
				for (local173 = 0; local173 < this.retextureDestination.length; local173++) {
					local593.retexture(this.retextureDestination[local173], this.retextureSource[local173]);
				}
			}
			local40 = local593.createModel(this.anInt3715 + 64, this.anInt3738 + 850, -30, -50, -30);
			if (GlRenderer.enabled) {
				((GlModel) local40).method4111(false, false, false, false, false, true);
			}
			NpcTypeList.aClass99_18.put(local40, (long) this.id);
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
					Static146.aClass144Array1[local235] = local753;
					local207 = seqs[local235].anInt5398;
					local46 = true;
					local200 = seqs[local235].anInt5399;
					local214 = local753.frames[local200];
					Static6.aClass3_Sub2_Sub7Array1[local235] = SeqTypeList.getAnimFrameset(local214 >>> 16);
					local214 &= 0xFFFF;
					Static107.anIntArray259[local235] = local214;
					if (Static6.aClass3_Sub2_Sub7Array1[local235] != null) {
						local723 |= Static6.aClass3_Sub2_Sub7Array1[local235].isColorTransformed(local214);
						local721 |= Static6.aClass3_Sub2_Sub7Array1[local235].isAlphaTransformed(local214);
						local725 |= local753.aBoolean278;
					}
					if ((local753.tween || SeqType.applyTweening) && local207 != -1 && local753.frames.length > local207) {
						Static71.anIntArray147[local235] = local753.anIntArray474[local200];
						Static214.anIntArray492[local235] = seqs[local235].anInt5404;
						local228 = local753.frames[local207];
						Static131.aClass3_Sub2_Sub7Array5[local235] = SeqTypeList.getAnimFrameset(local228 >>> 16);
						local228 &= 0xFFFF;
						Static61.anIntArray148[local235] = local228;
						if (Static131.aClass3_Sub2_Sub7Array5[local235] != null) {
							local723 |= Static131.aClass3_Sub2_Sub7Array5[local235].isColorTransformed(local228);
							local721 |= Static131.aClass3_Sub2_Sub7Array5[local235].isAlphaTransformed(local228);
						}
					} else {
						Static71.anIntArray147[local235] = 0;
						Static214.anIntArray492[local235] = 0;
						Static131.aClass3_Sub2_Sub7Array5[local235] = null;
						Static61.anIntArray148[local235] = -1;
					}
				}
			}
		}
		if (!local46 && seqType2 == null && seqType1 == null) {
			@Pc(933) Model local933 = local40.method4572(true, true, true);
			if (this.anInt3729 != 128 || this.anInt3731 != 128) {
				local933.resize(this.anInt3729, this.anInt3731, this.anInt3729);
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
				local200 = seqType2.anIntArray474[arg5];
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
				local300 = seqType1.anIntArray474[arg2];
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
			if (Static6.aClass3_Sub2_Sub7Array1[local318] != null) {
				local1218.method4565(Static6.aClass3_Sub2_Sub7Array1[local318], Static107.anIntArray259[local318], Static131.aClass3_Sub2_Sub7Array5[local318], Static61.anIntArray148[local318], Static214.anIntArray492[local318] - 1, Static71.anIntArray147[local318], local330, Static146.aClass144Array1[local318].aBoolean278, this.anIntArrayArray28[local318]);
			}
			local330 <<= 0x1;
		}
		if (local962 != null && local1088 != null) {
			local1218.method4570(local962, local235, local964, local221, arg4 - 1, local200, local1088, local228, local1092, local1040, arg7 - 1, local300, seqType2.aBooleanArray123, seqType2.aBoolean278 | seqType1.aBoolean278);
		} else if (local962 != null) {
			local1218.method4558(local962, local235, local964, local221, arg4 - 1, local200, seqType2.aBoolean278);
		} else if (local1088 != null) {
			local1218.method4558(local1088, local228, local1092, local1040, arg7 - 1, local300, seqType1.aBoolean278);
		}
		for (local318 = 0; local318 < local173; local318++) {
			Static6.aClass3_Sub2_Sub7Array1[local318] = null;
			Static131.aClass3_Sub2_Sub7Array5[local318] = null;
			Static146.aClass144Array1[local318] = null;
		}
		if (this.anInt3729 != 128 || this.anInt3731 != 128) {
			local1218.resize(this.anInt3729, this.anInt3731, this.anInt3729);
		}
		return local1218;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!na;Z)Lclient!na;")
	public final JagString getParam(@OriginalArg(0) int arg0, @OriginalArg(1) JagString arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			@Pc(18) StringNode local18 = (StringNode) this.params.get((long) arg0);
			return local18 == null ? arg1 : local18.value;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!wa;I)V")
	public final void decode(@OriginalArg(0) Buffer arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.g1();
			if (local9 == 0) {
				return;
			}
			this.decode(local9, arg0);
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
		} else if (this.anIntArray354 == null) {
			return null;
		} else {
			@Pc(41) Model local41 = (Model) NpcTypeList.headModels.get((long) this.id);
			if (local41 == null) {
				@Pc(46) boolean local46 = false;
				for (@Pc(48) int local48 = 0; local48 < this.anIntArray354.length; local48++) {
					if (!NpcTypeList.modelsArchive.isFileReady(0, this.anIntArray354[local48])) {
						local46 = true;
					}
				}
				if (local46) {
					return null;
				}
				@Pc(82) RawModel[] local82 = new RawModel[this.anIntArray354.length];
				for (@Pc(84) int local84 = 0; local84 < this.anIntArray354.length; local84++) {
					local82[local84] = Static77.create(NpcTypeList.modelsArchive, this.anIntArray354[local84]);
				}
				@Pc(119) RawModel local119;
				if (local82.length == 1) {
					local119 = local82[0];
				} else {
					local119 = new RawModel(local82, local82.length);
				}
				@Pc(130) int local130;
				if (this.recolorDestination != null) {
					for (local130 = 0; local130 < this.recolorDestination.length; local130++) {
						if (this.aByteArray51 == null || local130 >= this.aByteArray51.length) {
							local119.recolor(this.recolorDestination[local130], this.recolorSource[local130]);
						} else {
							local119.recolor(this.recolorDestination[local130], client.aShortArray74[this.aByteArray51[local130] & 0xFF]);
						}
					}
				}
				if (this.retextureDestination != null) {
					for (local130 = 0; local130 < this.retextureDestination.length; local130++) {
						local119.retexture(this.retextureDestination[local130], this.retextureSource[local130]);
					}
				}
				local41 = local119.createModel(64, 768, -50, -10, -50);
				NpcTypeList.headModels.put(local41, (long) this.id);
			}
			if (arg0 != null) {
				local41 = arg0.method4215(local41, arg2, arg1, arg3);
			}
			return local41;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IILclient!wa;)V")
	private void decode(@OriginalArg(1) int arg0, @OriginalArg(2) Buffer arg1) {
		@Pc(12) int count;
		@Pc(18) int local18;
		if (arg0 == 1) {
			count = arg1.g1();
			this.modelIndices = new int[count];
			for (local18 = 0; local18 < count; local18++) {
				this.modelIndices[local18] = arg1.g2();
				if (this.modelIndices[local18] == 65535) {
					this.modelIndices[local18] = -1;
				}
			}
		} else if (arg0 == 2) {
			this.name = arg1.gjstr();
		} else if (arg0 == 12) {
			this.size = arg1.g1();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.ops[arg0 - 30] = arg1.gjstr();
			if (this.ops[arg0 - 30].equalsIgnoreCase(LocalizedText.HIDDEN)) {
				this.ops[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			count = arg1.g1();
			this.recolorSource = new short[count];
			this.recolorDestination = new short[count];
			for (local18 = 0; local18 < count; local18++) {
				this.recolorDestination[local18] = (short) arg1.g2();
				this.recolorSource[local18] = (short) arg1.g2();
			}
		} else if (arg0 == 41) {
			count = arg1.g1();
			this.retextureSource = new short[count];
			this.retextureDestination = new short[count];
			for (local18 = 0; local18 < count; local18++) {
				this.retextureDestination[local18] = (short) arg1.g2();
				this.retextureSource[local18] = (short) arg1.g2();
			}
		} else if (arg0 == 42) {
			count = arg1.g1();
			this.aByteArray51 = new byte[count];
			for (local18 = 0; local18 < count; local18++) {
				this.aByteArray51[local18] = arg1.g1s();
			}
		} else if (arg0 == 60) {
			count = arg1.g1();
			this.anIntArray354 = new int[count];
			for (local18 = 0; local18 < count; local18++) {
				this.anIntArray354[local18] = arg1.g2();
			}
		} else if (arg0 == 93) {
			this.aBoolean184 = false;
		} else if (arg0 == 95) {
			this.combatLevel = arg1.g2();
		} else if (arg0 == 97) {
			this.anInt3729 = arg1.g2();
		} else if (arg0 == 98) {
			this.anInt3731 = arg1.g2();
		} else if (arg0 == 99) {
			this.aBoolean182 = true;
		} else if (arg0 == 100) {
			this.anInt3715 = arg1.g1s();
		} else if (arg0 == 101) {
			this.anInt3738 = arg1.g1s() * 5;
		} else if (arg0 == 102) {
			this.prayerIcon = arg1.g2();
		} else if (arg0 == 103) {
			this.anInt3733 = arg1.g2();
		} else {
			@Pc(297) int local297;
			if (arg0 == 106 || arg0 == 118) {
				this.multiNpcVarbit = arg1.g2();
				count = -1;
				if (this.multiNpcVarbit == 65535) {
					this.multiNpcVarbit = -1;
				}
				this.multiNpcVarp = arg1.g2();
				if (this.multiNpcVarp == 65535) {
					this.multiNpcVarp = -1;
				}
				if (arg0 == 118) {
					count = arg1.g2();
					if (count == 65535) {
						count = -1;
					}
				}
				local18 = arg1.g1();
				this.multiNpcs = new int[local18 + 2];
				for (local297 = 0; local297 <= local18; local297++) {
					this.multiNpcs[local297] = arg1.g2();
					if (this.multiNpcs[local297] == 65535) {
						this.multiNpcs[local297] = -1;
					}
				}
				this.multiNpcs[local18 + 1] = count;
			} else if (arg0 == 107) {
				this.aBoolean183 = false;
			} else if (arg0 == 109) {
				this.aBoolean181 = false;
			} else if (arg0 == 111) {
				this.shadow = false;
			} else if (arg0 == 113) {
				this.aShort24 = (short) arg1.g2();
				this.aShort23 = (short) arg1.g2();
			} else if (arg0 == 114) {
				this.aByte13 = arg1.g1s();
				this.aByte12 = arg1.g1s();
			} else if (arg0 == 115) {
				arg1.g1();
				arg1.g1();
			} else if (arg0 == 119) {
				this.aByte10 = arg1.g1s();
			} else if (arg0 == 121) {
				this.anIntArrayArray29 = new int[this.modelIndices.length][];
				count = arg1.g1();
				for (local18 = 0; local18 < count; local18++) {
					local297 = arg1.g1();
					@Pc(439) int[] local439 = this.anIntArrayArray29[local297] = new int[3];
					local439[0] = arg1.g1s();
					local439[1] = arg1.g1s();
					local439[2] = arg1.g1s();
				}
			} else if (arg0 == 122) {
				this.hitBarId = arg1.g2();
			} else if (arg0 == 123) {
				this.anInt3730 = arg1.g2();
			} else if (arg0 == 125) {
				this.aByte11 = arg1.g1s();
			} else if (arg0 == 126) {
				this.anInt3739 = arg1.g2();
			} else if (arg0 == 127) {
				this.basId = arg1.g2();
			} else if (arg0 == 128) {
				arg1.g1();
			} else if (arg0 == 134) {
				this.idleSound = arg1.g2();
				if (this.idleSound == 65535) {
					this.idleSound = -1;
				}
				this.crawlSound = arg1.g2();
				if (this.crawlSound == 65535) {
					this.crawlSound = -1;
				}
				this.walkSound = arg1.g2();
				if (this.walkSound == 65535) {
					this.walkSound = -1;
				}
				this.runSound = arg1.g2();
				if (this.runSound == 65535) {
					this.runSound = -1;
				}
				this.soundRadius = arg1.g1();
			} else if (arg0 == 135) {
				this.cursor1Op = arg1.g1();
				this.cursor1 = arg1.g2();
			} else if (arg0 == 136) {
				this.cursor2Op = arg1.g1();
				this.cursor2 = arg1.g2();
			} else if (arg0 == 137) {
				this.anInt3752 = arg1.g2();
			} else if (arg0 == 249) {
				count = arg1.g1();
				if (this.params == null) {
					local18 = Static165.clp2(count);
					this.params = new HashTable(local18);
				}
				for (local18 = 0; local18 < count; local18++) {
					@Pc(592) boolean local592 = arg1.g1() == 1;
					@Pc(596) int local596 = arg1.g3();
					@Pc(605) Node local605;
					if (local592) {
						local605 = new StringNode(arg1.gjstr());
					} else {
						local605 = new IntNode(arg1.g4());
					}
					this.params.put(local605, (long) local596);
				}
			}
		}
	}
}
