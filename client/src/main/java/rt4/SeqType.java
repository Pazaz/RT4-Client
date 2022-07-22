package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class SeqType {

	@OriginalMember(owner = "client!qi", name = "v", descriptor = "Z")
	public static boolean applyTweening = GlobalConfig.USE_TWEENING;

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "[I")
	public int[] frames;

	@OriginalMember(owner = "client!tk", name = "n", descriptor = "[Z")
	public boolean[] framegroup;

	@OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!tk", name = "C", descriptor = "[[I")
	public int[][] soundeffect;

	@OriginalMember(owner = "client!tk", name = "G", descriptor = "[I")
	public int[] frameDelay;

	@OriginalMember(owner = "client!tk", name = "I", descriptor = "[I")
	private int[] frameset;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
	public int exactmove = 2;

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "Z")
	public boolean tween = false;

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
	public int movetype = -1;

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
	public int offhand = -1;

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "Z")
	public boolean aBoolean278 = false;

	@OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
	public int replaycount = 99;

	@OriginalMember(owner = "client!tk", name = "z", descriptor = "I")
	public int replayoff = -1;

	@OriginalMember(owner = "client!tk", name = "B", descriptor = "I")
	public int looptype = -1;

	@OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
	public int priority = 5;

	@OriginalMember(owner = "client!tk", name = "r", descriptor = "Z")
	public boolean stretches = false;

	@OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
	public int mainhand = -1;

	@OriginalMember(owner = "client!tk", name = "L", descriptor = "Z")
	public boolean aBoolean280 = false;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!wa;B)V")
	public void decode(@OriginalArg(0) Buffer buffer) {
		while (true) {
			@Pc(19) int opcode = buffer.g1();
			if (opcode == 0) {
				return;
			}
			this.decode(opcode, buffer);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIILclient!ak;II)Lclient!ak;")
	public Model method4214(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Model arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = this.frameDelay[arg0];
		@Pc(15) int local15 = this.frames[arg0];
		@Pc(23) AnimFrameset local23 = SeqTypeList.getAnimFrameset(local15 >> 16);
		@Pc(27) int local27 = local15 & 0xFFFF;
		if (local23 == null) {
			return arg2.method4568(true, true, true);
		}
		@Pc(39) int local39 = arg3 & 0x3;
		@Pc(41) AnimFrameset local41 = null;
		if ((this.tween || applyTweening) && arg1 != -1 && this.frames.length > arg1) {
			@Pc(69) int local69 = this.frames[arg1];
			local41 = SeqTypeList.getAnimFrameset(local69 >> 16);
			arg1 = local69 & 0xFFFF;
		}
		@Pc(124) Model local124;
		if (local41 == null) {
			local124 = arg2.method4568(!local23.isAlphaTransformed(local27), !local23.isColorTransformed(local27), !this.aBoolean278);
		} else {
			local124 = arg2.method4568(!local23.isAlphaTransformed(local27) & !local41.isAlphaTransformed(arg1), !local23.isColorTransformed(local27) & !local41.isColorTransformed(arg1), !this.aBoolean278);
		}
		if (GlRenderer.enabled && this.aBoolean278) {
			if (local39 == 1) {
				((GlModel) local124).method4093();
			} else if (local39 == 2) {
				((GlModel) local124).method4102();
			} else if (local39 == 3) {
				((GlModel) local124).method4116();
			}
		} else if (local39 == 1) {
			local124.method4578();
		} else if (local39 == 2) {
			local124.method4552();
		} else if (local39 == 3) {
			local124.rotateCounterClockwise();
		}
		local124.method4558(local23, local27, local41, arg1, arg4 - 1, local10, this.aBoolean278);
		if (GlRenderer.enabled && this.aBoolean278) {
			if (local39 == 1) {
				((GlModel) local124).method4116();
			} else if (local39 == 2) {
				((GlModel) local124).method4102();
			} else if (local39 == 3) {
				((GlModel) local124).method4093();
			}
		} else if (local39 == 1) {
			local124.rotateCounterClockwise();
		} else if (local39 == 2) {
			local124.method4552();
		} else if (local39 == 3) {
			local124.method4578();
		}
		return local124;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!ak;BIII)Lclient!ak;")
	public Model method4215(@OriginalArg(0) Model arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.frames[arg3];
		@Pc(13) int local13 = this.frameDelay[arg3];
		@Pc(19) AnimFrameset local19 = SeqTypeList.getAnimFrameset(local8 >> 16);
		@Pc(23) int local23 = local8 & 0xFFFF;
		if (local19 == null) {
			return arg0.method4572(true, true, true);
		}
		@Pc(34) AnimFrameset local34 = null;
		if ((this.tween || applyTweening) && arg1 != -1 && arg1 < this.frames.length) {
			@Pc(59) int local59 = this.frames[arg1];
			local34 = SeqTypeList.getAnimFrameset(local59 >> 16);
			arg1 = local59 & 0xFFFF;
		}
		@Pc(71) AnimFrameset local71 = null;
		@Pc(81) AnimFrameset local81 = null;
		@Pc(83) int local83 = 0;
		@Pc(85) int local85 = 0;
		if (this.frameset != null) {
			if (this.frameset.length > arg3) {
				local83 = this.frameset[arg3];
				if (local83 != 65535) {
					local71 = SeqTypeList.getAnimFrameset(local83 >> 16);
					local83 &= 0xFFFF;
				}
			}
			if ((this.tween || applyTweening) && arg1 != -1 && this.frameset.length > arg1) {
				local85 = this.frameset[arg1];
				if (local85 != 65535) {
					local81 = SeqTypeList.getAnimFrameset(local85 >> 16);
					local85 &= 0xFFFF;
				}
			}
		}
		@Pc(163) boolean local163 = !local19.isAlphaTransformed(local23);
		@Pc(172) boolean local172 = !local19.isColorTransformed(local23);
		if (local71 != null) {
			local163 &= !local71.isAlphaTransformed(local83);
			local172 &= !local71.isColorTransformed(local83);
		}
		if (local34 != null) {
			local163 &= !local34.isAlphaTransformed(arg1);
			local172 &= !local34.isColorTransformed(arg1);
		}
		if (local81 != null) {
			local163 &= !local81.isAlphaTransformed(local85);
			local172 &= !local81.isColorTransformed(local85);
		}
		@Pc(258) Model local258 = arg0.method4572(local163, local172, !this.aBoolean278);
		local258.method4558(local19, local23, local34, arg1, arg2 - 1, local13, this.aBoolean278);
		if (local71 != null) {
			local258.method4558(local71, local83, local81, local85, arg2 - 1, local13, this.aBoolean278);
		}
		return local258;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIILclient!ak;I)Lclient!ak;")
	public Model method4216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Model arg4) {
		@Pc(6) int local6 = this.frameDelay[arg1];
		@Pc(11) int local11 = this.frames[arg1];
		@Pc(19) AnimFrameset local19 = SeqTypeList.getAnimFrameset(local11 >> 16);
		@Pc(27) int local27 = local11 & 0xFFFF;
		if (local19 == null) {
			return arg4.method4572(true, true, true);
		}
		@Pc(40) int local40 = arg3 & 0x3;
		@Pc(42) AnimFrameset local42 = null;
		if ((this.tween || applyTweening) && arg0 != -1 && arg0 < this.frames.length) {
			@Pc(66) int local66 = this.frames[arg0];
			local42 = SeqTypeList.getAnimFrameset(local66 >> 16);
			arg0 = local66 & 0xFFFF;
		}
		@Pc(106) Model local106;
		if (local42 == null) {
			local106 = arg4.method4572(!local19.isAlphaTransformed(local27), !local19.isColorTransformed(local27), !this.aBoolean278);
		} else {
			local106 = arg4.method4572(!local19.isAlphaTransformed(local27) & !local42.isAlphaTransformed(arg0), !local19.isColorTransformed(local27) & !local42.isColorTransformed(arg0), !this.aBoolean278);
		}
		if (this.aBoolean278 && GlRenderer.enabled) {
			if (local40 == 1) {
				((GlModel) local106).method4093();
			} else if (local40 == 2) {
				((GlModel) local106).method4102();
			} else if (local40 == 3) {
				((GlModel) local106).method4116();
			}
		} else if (local40 == 1) {
			local106.method4578();
		} else if (local40 == 2) {
			local106.method4552();
		} else if (local40 == 3) {
			local106.rotateCounterClockwise();
		}
		local106.method4558(local19, local27, local42, arg0, arg2 - 1, local6, this.aBoolean278);
		if (this.aBoolean278 && GlRenderer.enabled) {
			if (local40 == 1) {
				((GlModel) local106).method4116();
			} else if (local40 == 2) {
				((GlModel) local106).method4102();
			} else if (local40 == 3) {
				((GlModel) local106).method4093();
			}
		} else if (local40 == 1) {
			local106.rotateCounterClockwise();
		} else if (local40 == 2) {
			local106.method4552();
		} else if (local40 == 3) {
			local106.method4578();
		}
		return local106;
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)V")
	public void postDecode() {
		if (this.looptype == -1) {
			if (this.framegroup == null) {
				this.looptype = 0;
			} else {
				this.looptype = 2;
			}
		}

		if (this.movetype == -1) {
			if (this.framegroup == null) {
				this.movetype = 0;
			} else {
				this.movetype = 2;
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIBLclient!ak;)Lclient!ak;")
	public Model method4219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Model arg3) {
		@Pc(16) int local16 = this.frameDelay[arg2];
		@Pc(21) int local21 = this.frames[arg2];
		@Pc(27) AnimFrameset local27 = SeqTypeList.getAnimFrameset(local21 >> 16);
		@Pc(31) int local31 = local21 & 0xFFFF;
		if (local27 == null) {
			return arg3.method4560(true, true, true);
		}
		@Pc(42) AnimFrameset local42 = null;
		if ((this.tween || applyTweening) && arg0 != -1 && this.frames.length > arg0) {
			@Pc(65) int local65 = this.frames[arg0];
			local42 = SeqTypeList.getAnimFrameset(local65 >> 16);
			arg0 = local65 & 0xFFFF;
		}
		@Pc(103) Model local103;
		if (local42 == null) {
			local103 = arg3.method4560(!local27.isAlphaTransformed(local31), !local27.isColorTransformed(local31), !this.aBoolean278);
		} else {
			local103 = arg3.method4560(!local27.isAlphaTransformed(local31) & !local42.isAlphaTransformed(arg0), !local27.isColorTransformed(local31) & !local42.isColorTransformed(arg0), !this.aBoolean278);
		}
		local103.method4558(local27, local31, local42, arg0, arg1 - 1, local16, this.aBoolean278);
		return local103;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IBLclient!wa;)V")
	private void decode(@OriginalArg(0) int opcode, @OriginalArg(2) Buffer buffer) {
		@Pc(8) int count;
		@Pc(14) int i;

		if (opcode == 1) {
			count = buffer.g2();
			this.frameDelay = new int[count];
			for (i = 0; i < count; i++) {
				this.frameDelay[i] = buffer.g2();
			}
			this.frames = new int[count];
			for (i = 0; i < count; i++) {
				this.frames[i] = buffer.g2();
			}
			for (i = 0; i < count; i++) {
				this.frames[i] += buffer.g2() << 16;
			}
		} else if (opcode == 2) {
			this.replayoff = buffer.g2();
		} else if (opcode == 3) {
			this.framegroup = new boolean[256];
			count = buffer.g1();
			for (i = 0; i < count; i++) {
				this.framegroup[buffer.g1()] = true;
			}
		} else if (opcode == 4) {
			this.stretches = true;
		} else if (opcode == 5) {
			this.priority = buffer.g1();
		} else if (opcode == 6) {
			this.mainhand = buffer.g2();
		} else if (opcode == 7) {
			this.offhand = buffer.g2();
		} else if (opcode == 8) {
			this.replaycount = buffer.g1();
		} else if (opcode == 9) { // TODO: confirm
			this.looptype = buffer.g1();
		} else if (opcode == 10) { // TODO: confirm
			this.movetype = buffer.g1();
		} else if (opcode == 11) { // TODO: confirm
			this.exactmove = buffer.g1();
		} else if (opcode == 12) { // TODO: confirm
			count = buffer.g1();
			this.frameset = new int[count];
			for (i = 0; i < count; i++) {
				this.frameset[i] = buffer.g2();
			}
			for (i = 0; i < count; i++) {
				this.frameset[i] += buffer.g2() << 16;
			}
		} else if (opcode == 13) {
			count = buffer.g2();
			this.soundeffect = new int[count][];
			for (i = 0; i < count; i++) {
				@Pc(163) int count2 = buffer.g1();
				if (count2 > 0) {
					this.soundeffect[i] = new int[count2];
					this.soundeffect[i][0] = buffer.g3();
					for (@Pc(182) int j = 1; j < count2; j++) {
						this.soundeffect[i][j] = buffer.g2();
					}
				}
			}
		} else if (opcode == 14) {
			this.aBoolean278 = true;
		} else if (opcode == 15) { // TODO: (probably) not an authentic name
			this.tween = true;
		} else if (opcode == 16) {
			this.aBoolean280 = true;
		}
	}
}
