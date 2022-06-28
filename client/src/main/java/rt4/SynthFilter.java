package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class SynthFilter {

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "[[I")
	public static final int[][] coefficients = new int[2][8];
	@OriginalMember(owner = "client!nl", name = "b", descriptor = "[[F")
	public static final float[][] floatingCoefficients = new float[2][8];
	@OriginalMember(owner = "client!nl", name = "d", descriptor = "F")
	public static float floatingInverseA0;
	@OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
	public static int inverseA0;
	@OriginalMember(owner = "client!nl", name = "e", descriptor = "[I")
	public final int[] pairs = new int[2];

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "[[[I")
	private final int[][][] gain = new int[2][2][4];

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "[[[I")
	private final int[][][] octaves = new int[2][2][4];

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "[I")
	private final int[] inverseGain = new int[2];

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(F)F")
	public static float getOctavePhase(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!wa;Lclient!ff;)V")
	public final void decode(@OriginalArg(0) Buffer arg0, @OriginalArg(1) SynthEnvelope arg1) {
		@Pc(3) int local3 = arg0.g1();
		this.pairs[0] = local3 >> 4;
		this.pairs[1] = local3 & 0xF;
		if (local3 == 0) {
			this.inverseGain[0] = this.inverseGain[1] = 0;
			return;
		}
		this.inverseGain[0] = arg0.g2();
		this.inverseGain[1] = arg0.g2();
		@Pc(37) int local37 = arg0.g1();
		@Pc(39) int local39;
		@Pc(44) int local44;
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.pairs[local39]; local44++) {
				this.octaves[local39][0][local44] = arg0.g2();
				this.gain[local39][0][local44] = arg0.g2();
			}
		}
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.pairs[local39]; local44++) {
				if ((local37 & 0x1 << local39 * 4 << local44) == 0) {
					this.octaves[local39][1][local44] = this.octaves[local39][0][local44];
					this.gain[local39][1][local44] = this.gain[local39][0][local44];
				} else {
					this.octaves[local39][1][local44] = arg0.g2();
					this.gain[local39][1][local44] = arg0.g2();
				}
			}
		}
		if (local37 != 0 || this.inverseGain[1] != this.inverseGain[0]) {
			arg1.decodeStages(arg0);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IF)I")
	public final int compute(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.inverseGain[0] + (float) (this.inverseGain[1] - this.inverseGain[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			floatingInverseA0 = (float) Math.pow(0.1D, local24 / 20.0F);
			inverseA0 = (int) (floatingInverseA0 * 65536.0F);
		}
		if (this.pairs[arg0] == 0) {
			return 0;
		}
		local20 = this.getAmplitude(arg0, 0, arg1);
		floatingCoefficients[arg0][0] = -2.0F * local20 * (float) Math.cos(this.method3254(arg0, 0, arg1));
		floatingCoefficients[arg0][1] = local20 * local20;
		@Pc(77) int local77;
		for (local77 = 1; local77 < this.pairs[arg0]; local77++) {
			local20 = this.getAmplitude(arg0, local77, arg1);
			@Pc(102) float local102 = -2.0F * local20 * (float) Math.cos(this.method3254(arg0, local77, arg1));
			@Pc(106) float local106 = local20 * local20;
			floatingCoefficients[arg0][local77 * 2 + 1] = floatingCoefficients[arg0][local77 * 2 - 1] * local106;
			floatingCoefficients[arg0][local77 * 2] = floatingCoefficients[arg0][local77 * 2 - 1] * local102 + floatingCoefficients[arg0][local77 * 2 - 2] * local106;
			for (@Pc(162) int local162 = local77 * 2 - 1; local162 >= 2; local162--) {
				floatingCoefficients[arg0][local162] += floatingCoefficients[arg0][local162 - 1] * local102 + floatingCoefficients[arg0][local162 - 2] * local106;
			}
			floatingCoefficients[arg0][1] += floatingCoefficients[arg0][0] * local102 + local106;
			floatingCoefficients[arg0][0] += local102;
		}
		if (arg0 == 0) {
			for (local77 = 0; local77 < this.pairs[0] * 2; local77++) {
				floatingCoefficients[0][local77] *= floatingInverseA0;
			}
		}
		for (local77 = 0; local77 < this.pairs[arg0] * 2; local77++) {
			coefficients[arg0][local77] = (int) (floatingCoefficients[arg0][local77] * 65536.0F);
		}
		return this.pairs[arg0] * 2;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIF)F")
	private float getAmplitude(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.gain[arg0][0][arg1] + arg2 * (float) (this.gain[arg0][1][arg1] - this.gain[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -local34 / 20.0F);
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(IIF)F")
	private float method3254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.octaves[arg0][0][arg1] + arg2 * (float) (this.octaves[arg0][1][arg1] - this.octaves[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return getOctavePhase(local34);
	}
}
