import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class VorbisCodebook {

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "[I")
	private int[] anIntArray288;

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
	public final int anInt3055;

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
	private final int anInt3056;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "[I")
	private final int[] anIntArray286;

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "[I")
	private int[] anIntArray287;

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
	public VorbisCodebook() {
		Static117.method2350(24);
		this.anInt3055 = Static117.method2350(16);
		this.anInt3056 = Static117.method2350(24);
		this.anIntArray286 = new int[this.anInt3056];
		@Pc(23) boolean local23 = Static117.method2346() != 0;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(46) int local46;
		if (local23) {
			local27 = 0;
			local32 = Static117.method2350(5) + 1;
			while (local27 < this.anInt3056) {
				@Pc(44) int local44 = Static117.method2350(Static204.method3674(this.anInt3056 - local27));
				for (local46 = 0; local46 < local44; local46++) {
					this.anIntArray286[local27++] = local32;
				}
				local32++;
			}
		} else {
			@Pc(66) boolean local66 = Static117.method2346() != 0;
			for (local32 = 0; local32 < this.anInt3056; local32++) {
				if (local66 && Static117.method2346() == 0) {
					this.anIntArray286[local32] = 0;
				} else {
					this.anIntArray286[local32] = Static117.method2350(5) + 1;
				}
			}
		}
		this.method2414();
		local27 = Static117.method2350(4);
		if (local27 > 0) {
			@Pc(103) float local103 = Static117.method2340(Static117.method2350(32));
			@Pc(107) float local107 = Static117.method2340(Static117.method2350(32));
			local46 = Static117.method2350(4) + 1;
			@Pc(118) boolean local118 = Static117.method2346() != 0;
			@Pc(127) int local127;
			if (local27 == 1) {
				local127 = Static288.method2416(this.anInt3056, this.anInt3055);
			} else {
				local127 = this.anInt3056 * this.anInt3055;
			}
			this.anIntArray287 = new int[local127];
			@Pc(140) int local140;
			for (local140 = 0; local140 < local127; local140++) {
				this.anIntArray287[local140] = Static117.method2350(local46);
			}
			this.aFloatArrayArray1 = new float[this.anInt3056][this.anInt3055];
			@Pc(169) float local169;
			@Pc(171) int local171;
			@Pc(173) int local173;
			if (local27 == 1) {
				for (local140 = 0; local140 < this.anInt3056; local140++) {
					local169 = 0.0F;
					local171 = 1;
					for (local173 = 0; local173 < this.anInt3055; local173++) {
						@Pc(183) int local183 = local140 / local171 % local127;
						@Pc(195) float local195 = (float) this.anIntArray287[local183] * local107 + local103 + local169;
						this.aFloatArrayArray1[local140][local173] = local195;
						if (local118) {
							local169 = local195;
						}
						local171 *= local127;
					}
				}
			} else {
				for (local140 = 0; local140 < this.anInt3056; local140++) {
					local169 = 0.0F;
					local171 = local140 * this.anInt3055;
					for (local173 = 0; local173 < this.anInt3055; local173++) {
						@Pc(246) float local246 = (float) this.anIntArray287[local171] * local107 + local103 + local169;
						this.aFloatArrayArray1[local140][local173] = local246;
						if (local118) {
							local169 = local246;
						}
						local171++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "()[F")
	public final float[] method2413() {
		return this.aFloatArrayArray1[this.method2415()];
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "()V")
	private void method2414() {
		@Pc(3) int[] local3 = new int[this.anInt3056];
		@Pc(6) int[] local6 = new int[33];
		@Pc(8) int local8;
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(44) int local44;
		@Pc(53) int local53;
		@Pc(69) int local69;
		for (local8 = 0; local8 < this.anInt3056; local8++) {
			local17 = this.anIntArray286[local8];
			if (local17 != 0) {
				local26 = 0x1 << 32 - local17;
				local30 = local6[local17];
				local3[local8] = local30;
				@Pc(60) int local60;
				if ((local30 & local26) == 0) {
					local44 = local30 | local26;
					for (local53 = local17 - 1; local53 >= 1; local53--) {
						local60 = local6[local53];
						if (local60 != local30) {
							break;
						}
						local69 = 0x1 << 32 - local53;
						if ((local60 & local69) != 0) {
							local6[local53] = local6[local53 - 1];
							break;
						}
						local6[local53] = local60 | local69;
					}
				} else {
					local44 = local6[local17 - 1];
				}
				local6[local17] = local44;
				for (local53 = local17 + 1; local53 <= 32; local53++) {
					local60 = local6[local53];
					if (local60 == local30) {
						local6[local53] = local44;
					}
				}
			}
		}
		this.anIntArray288 = new int[8];
		@Pc(122) int local122 = 0;
		for (local8 = 0; local8 < this.anInt3056; local8++) {
			local17 = this.anIntArray286[local8];
			if (local17 != 0) {
				local26 = local3[local8];
				local30 = 0;
				for (local44 = 0; local44 < local17; local44++) {
					local53 = Integer.MIN_VALUE >>> local44;
					if ((local26 & local53) == 0) {
						local30++;
					} else {
						if (this.anIntArray288[local30] == 0) {
							this.anIntArray288[local30] = local122;
						}
						local30 = this.anIntArray288[local30];
					}
					if (local30 >= this.anIntArray288.length) {
						@Pc(184) int[] local184 = new int[this.anIntArray288.length * 2];
						for (local69 = 0; local69 < this.anIntArray288.length; local69++) {
							local184[local69] = this.anIntArray288[local69];
						}
						this.anIntArray288 = local184;
					}
				}
				this.anIntArray288[local30] = ~local8;
				if (local30 >= local122) {
					local122 = local30 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "()I")
	public final int method2415() {
		@Pc(1) int local1;
		for (local1 = 0; this.anIntArray288[local1] >= 0; local1 = Static117.method2346() == 0 ? local1 + 1 : this.anIntArray288[local1]) {
		}
		return ~this.anIntArray288[local1];
	}
}
