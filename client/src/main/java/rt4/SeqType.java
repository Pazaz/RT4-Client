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
	public boolean[] aBooleanArray123;

	@OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!tk", name = "C", descriptor = "[[I")
	public int[][] sounds;

	@OriginalMember(owner = "client!tk", name = "G", descriptor = "[I")
	public int[] anIntArray474;

	@OriginalMember(owner = "client!tk", name = "I", descriptor = "[I")
	private int[] anIntArray475;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
	public int anInt5347 = 2;

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "Z")
	public boolean tween = false;

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
	public int anInt5349 = -1;

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
	public int anInt5348 = -1;

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "Z")
	public boolean aBoolean278 = false;

	@OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
	public int anInt5357 = 99;

	@OriginalMember(owner = "client!tk", name = "z", descriptor = "I")
	public int anInt5362 = -1;

	@OriginalMember(owner = "client!tk", name = "B", descriptor = "I")
	public int anInt5363 = -1;

	@OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
	public int forcedPriority = 5;

	@OriginalMember(owner = "client!tk", name = "r", descriptor = "Z")
	public boolean aBoolean279 = false;

	@OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
	public int anInt5353 = -1;

	@OriginalMember(owner = "client!tk", name = "L", descriptor = "Z")
	public boolean aBoolean280 = false;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!wa;B)V")
	public final void decode(@OriginalArg(0) Buffer arg0) {
		while (true) {
			@Pc(19) int local19 = arg0.g1();
			if (local19 == 0) {
				return;
			}
			this.decode(local19, arg0);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIILclient!ak;II)Lclient!ak;")
	public final Model method4214(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Model arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = this.anIntArray474[arg0];
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
			local124.method4563();
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
			local124.method4563();
		} else if (local39 == 2) {
			local124.method4552();
		} else if (local39 == 3) {
			local124.method4578();
		}
		return local124;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!ak;BIII)Lclient!ak;")
	public final Model method4215(@OriginalArg(0) Model arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.frames[arg3];
		@Pc(13) int local13 = this.anIntArray474[arg3];
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
		if (this.anIntArray475 != null) {
			if (this.anIntArray475.length > arg3) {
				local83 = this.anIntArray475[arg3];
				if (local83 != 65535) {
					local71 = SeqTypeList.getAnimFrameset(local83 >> 16);
					local83 &= 0xFFFF;
				}
			}
			if ((this.tween || applyTweening) && arg1 != -1 && this.anIntArray475.length > arg1) {
				local85 = this.anIntArray475[arg1];
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
	public final Model method4216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Model arg4) {
		@Pc(6) int local6 = this.anIntArray474[arg1];
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
			local106.method4563();
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
			local106.method4563();
		} else if (local40 == 2) {
			local106.method4552();
		} else if (local40 == 3) {
			local106.method4578();
		}
		return local106;
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)V")
	public final void postDecode() {
		if (this.anInt5363 == -1) {
			if (this.aBooleanArray123 == null) {
				this.anInt5363 = 0;
			} else {
				this.anInt5363 = 2;
			}
		}
		if (this.anInt5349 != -1) {
			return;
		}
		if (this.aBooleanArray123 == null) {
			this.anInt5349 = 0;
		} else {
			this.anInt5349 = 2;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIBLclient!ak;)Lclient!ak;")
	public final Model method4219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Model arg3) {
		@Pc(16) int local16 = this.anIntArray474[arg2];
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
	private void decode(@OriginalArg(0) int arg0, @OriginalArg(2) Buffer arg1) {
		@Pc(8) int local8;
		@Pc(14) int local14;
		if (arg0 == 1) {
			local8 = arg1.g2();
			this.anIntArray474 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray474[local14] = arg1.g2();
			}
			this.frames = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.frames[local14] = arg1.g2();
			}
			for (local14 = 0; local14 < local8; local14++) {
				this.frames[local14] += arg1.g2() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt5362 = arg1.g2();
		} else if (arg0 == 3) {
			this.aBooleanArray123 = new boolean[256];
			local8 = arg1.g1();
			for (local14 = 0; local14 < local8; local14++) {
				this.aBooleanArray123[arg1.g1()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean279 = true;
		} else if (arg0 == 5) {
			this.forcedPriority = arg1.g1();
		} else if (arg0 == 6) {
			this.anInt5353 = arg1.g2();
		} else if (arg0 == 7) {
			this.anInt5348 = arg1.g2();
		} else if (arg0 == 8) {
			this.anInt5357 = arg1.g1();
		} else if (arg0 == 9) {
			this.anInt5363 = arg1.g1();
		} else if (arg0 == 10) {
			this.anInt5349 = arg1.g1();
		} else if (arg0 == 11) {
			this.anInt5347 = arg1.g1();
		} else if (arg0 == 12) {
			local8 = arg1.g1();
			this.anIntArray475 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray475[local14] = arg1.g2();
			}
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray475[local14] += arg1.g2() << 16;
			}
		} else if (arg0 == 13) {
			local8 = arg1.g2();
			this.sounds = new int[local8][];
			for (local14 = 0; local14 < local8; local14++) {
				@Pc(163) int local163 = arg1.g1();
				if (local163 > 0) {
					this.sounds[local14] = new int[local163];
					this.sounds[local14][0] = arg1.g3();
					for (@Pc(182) int local182 = 1; local182 < local163; local182++) {
						this.sounds[local14][local182] = arg1.g2();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean278 = true;
		} else if (arg0 == 15) {
			this.tween = true;
		} else if (arg0 == 16) {
			this.aBoolean280 = true;
		}
	}
}
