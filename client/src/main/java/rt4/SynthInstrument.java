package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Random;

@OriginalClass("client!pj")
public final class SynthInstrument {

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "[I")
	public static final int[] samples = new int[220500];
	@OriginalMember(owner = "client!pj", name = "p", descriptor = "[I")
	public static final int[] oscillatorIntervalRanges = new int[5];
	@OriginalMember(owner = "client!pj", name = "q", descriptor = "[I")
	public static final int[] oscillatorMinIntervals = new int[5];
	@OriginalMember(owner = "client!pj", name = "r", descriptor = "[I")
	public static final int[] oscillatorTimes = new int[5];
	@OriginalMember(owner = "client!pj", name = "s", descriptor = "[I")
	public static final int[] oscillatorStartSamples = new int[5];
	@OriginalMember(owner = "client!pj", name = "t", descriptor = "[I")
	public static final int[] scaledOscillatorAmplitudes = new int[5];
	@OriginalMember(owner = "client!pj", name = "k", descriptor = "[I")
	private static final int[] NOISE = new int[32768];

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "[I")
	private static final int[] SINE;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "Lclient!ff;")
	private SynthEnvelope amplitudeModulationAmplitudeEnvelope;

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "Lclient!ff;")
	private SynthEnvelope gateClosedPhaseEnvelope;

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "Lclient!ff;")
	private SynthEnvelope amplitudeEnvelope;

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "Lclient!ff;")
	private SynthEnvelope gateOpenPhaseEnvelope;

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "Lclient!ff;")
	private SynthEnvelope phaseEnvelope;

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "Lclient!ff;")
	private SynthEnvelope filterEnvelope;

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "Lclient!ff;")
	private SynthEnvelope amplitudeModulationEnvelope;

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "Lclient!nl;")
	private SynthFilter filter;

	@OriginalMember(owner = "client!pj", name = "x", descriptor = "Lclient!ff;")
	private SynthEnvelope phaseModulationAmplitudeEnvelope;

	@OriginalMember(owner = "client!pj", name = "y", descriptor = "Lclient!ff;")
	private SynthEnvelope phaseModulationEnvelope;

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
	public int length = 500;

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
	private int reverbDelay = 0;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
	public int start = 0;

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "[I")
	private final int[] harmonicVolume = new int[]{0, 0, 0, 0, 0};

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "[I")
	private final int[] harmonicDelay = new int[]{0, 0, 0, 0, 0};

	@OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
	private int reverbVolume = 100;

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "[I")
	private final int[] harmonicSemitone = new int[]{0, 0, 0, 0, 0};

	static {
		@Pc(7) Random rand = new Random(0L);
		@Pc(9) int local9;
		for (local9 = 0; local9 < 32768; local9++) {
			NOISE[local9] = (rand.nextInt() & 0x2) - 1;
		}
		SINE = new int[32768];
		for (local9 = 0; local9 < 32768; local9++) {
			SINE[local9] = (int) (Math.sin((double) local9 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)I")
	private int method3504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return SINE[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return NOISE[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[I")
	public final int[] getSamples(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		ArrayUtils.clear(samples, 0, arg0);
		if (arg1 < 10) {
			return samples;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.phaseEnvelope.reset();
		this.amplitudeEnvelope.reset();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.phaseModulationEnvelope != null) {
			this.phaseModulationEnvelope.reset();
			this.phaseModulationAmplitudeEnvelope.reset();
			local24 = (int) ((double) (this.phaseModulationEnvelope.maxInterval - this.phaseModulationEnvelope.minInterval) * 32.768D / local16);
			local26 = (int) ((double) this.phaseModulationEnvelope.minInterval * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.amplitudeModulationEnvelope != null) {
			this.amplitudeModulationEnvelope.reset();
			this.amplitudeModulationAmplitudeEnvelope.reset();
			local63 = (int) ((double) (this.amplitudeModulationEnvelope.maxInterval - this.amplitudeModulationEnvelope.minInterval) * 32.768D / local16);
			local65 = (int) ((double) this.amplitudeModulationEnvelope.minInterval * 32.768D / local16);
		}
		@Pc(102) int local102;
		for (local102 = 0; local102 < 5; local102++) {
			if (this.harmonicVolume[local102] != 0) {
				oscillatorTimes[local102] = 0;
				oscillatorStartSamples[local102] = (int) ((double) this.harmonicDelay[local102] * local16);
				scaledOscillatorAmplitudes[local102] = (this.harmonicVolume[local102] << 14) / 100;
				oscillatorIntervalRanges[local102] = (int) ((double) (this.phaseEnvelope.maxInterval - this.phaseEnvelope.minInterval) * 32.768D * Math.pow(1.0057929410678534D, this.harmonicSemitone[local102]) / local16);
				oscillatorMinIntervals[local102] = (int) ((double) this.phaseEnvelope.minInterval * 32.768D / local16);
			}
		}
		@Pc(185) int local185;
		@Pc(190) int local190;
		@Pc(198) int local198;
		@Pc(203) int local203;
		for (local102 = 0; local102 < arg0; local102++) {
			local185 = this.phaseEnvelope.nextLevel(arg0);
			local190 = this.amplitudeEnvelope.nextLevel(arg0);
			if (this.phaseModulationEnvelope != null) {
				local198 = this.phaseModulationEnvelope.nextLevel(arg0);
				local203 = this.phaseModulationAmplitudeEnvelope.nextLevel(arg0);
				local185 += this.method3504(local28, local203, this.phaseModulationEnvelope.wavetable) >> 1;
				local28 += (local198 * local24 >> 16) + local26;
			}
			if (this.amplitudeModulationEnvelope != null) {
				local198 = this.amplitudeModulationEnvelope.nextLevel(arg0);
				local203 = this.amplitudeModulationAmplitudeEnvelope.nextLevel(arg0);
				local190 = local190 * ((this.method3504(local67, local203, this.amplitudeModulationEnvelope.wavetable) >> 1) + 32768) >> 15;
				local67 += (local198 * local63 >> 16) + local65;
			}
			for (local198 = 0; local198 < 5; local198++) {
				if (this.harmonicVolume[local198] != 0) {
					local203 = local102 + oscillatorStartSamples[local198];
					if (local203 < arg0) {
						samples[local203] += this.method3504(oscillatorTimes[local198], local190 * scaledOscillatorAmplitudes[local198] >> 15, this.phaseEnvelope.wavetable);
						oscillatorTimes[local198] += (local185 * oscillatorIntervalRanges[local198] >> 16) + oscillatorMinIntervals[local198];
					}
				}
			}
		}
		@Pc(356) int local356;
		if (this.gateClosedPhaseEnvelope != null) {
			this.gateClosedPhaseEnvelope.reset();
			this.gateOpenPhaseEnvelope.reset();
			local102 = 0;
			@Pc(341) boolean local341 = true;
			for (local198 = 0; local198 < arg0; local198++) {
				local203 = this.gateClosedPhaseEnvelope.nextLevel(arg0);
				local356 = this.gateOpenPhaseEnvelope.nextLevel(arg0);
				if (local341) {
					local185 = this.gateClosedPhaseEnvelope.minInterval + ((this.gateClosedPhaseEnvelope.maxInterval - this.gateClosedPhaseEnvelope.minInterval) * local203 >> 8);
				} else {
					local185 = this.gateClosedPhaseEnvelope.minInterval + ((this.gateClosedPhaseEnvelope.maxInterval - this.gateClosedPhaseEnvelope.minInterval) * local356 >> 8);
				}
				local102 += 256;
				if (local102 >= local185) {
					local102 = 0;
					local341 = !local341;
				}
				if (local341) {
					samples[local198] = 0;
				}
			}
		}
		if (this.reverbDelay > 0 && this.reverbVolume > 0) {
			local102 = (int) ((double) this.reverbDelay * local16);
			for (local185 = local102; local185 < arg0; local185++) {
				samples[local185] += samples[local185 - local102] * this.reverbVolume / 100;
			}
		}
		if (this.filter.pairs[0] > 0 || this.filter.pairs[1] > 0) {
			this.filterEnvelope.reset();
			local102 = this.filterEnvelope.nextLevel(arg0 + 1);
			local185 = this.filter.compute(0, (float) local102 / 65536.0F);
			local190 = this.filter.compute(1, (float) local102 / 65536.0F);
			if (arg0 >= local185 + local190) {
				local198 = 0;
				local203 = local190;
				if (local190 > arg0 - local185) {
					local203 = arg0 - local185;
				}
				@Pc(523) int local523;
				while (local198 < local203) {
					local356 = (int) ((long) samples[local198 + local185] * (long) SynthFilter.inverseA0 >> 16);
					for (local523 = 0; local523 < local185; local523++) {
						local356 += (int) ((long) samples[local198 + local185 - local523 - 1] * (long) SynthFilter.coefficients[0][local523] >> 16);
					}
					for (local523 = 0; local523 < local198; local523++) {
						local356 -= (int) ((long) samples[local198 - local523 - 1] * (long) SynthFilter.coefficients[1][local523] >> 16);
					}
					samples[local198] = local356;
					local102 = this.filterEnvelope.nextLevel(arg0 + 1);
					local198++;
				}
				local203 = 128;
				while (true) {
					if (local203 > arg0 - local185) {
						local203 = arg0 - local185;
					}
					while (local198 < local203) {
						local356 = (int) ((long) samples[local198 + local185] * (long) SynthFilter.inverseA0 >> 16);
						for (local523 = 0; local523 < local185; local523++) {
							local356 += (int) ((long) samples[local198 + local185 - local523 - 1] * (long) SynthFilter.coefficients[0][local523] >> 16);
						}
						for (local523 = 0; local523 < local190; local523++) {
							local356 -= (int) ((long) samples[local198 - local523 - 1] * (long) SynthFilter.coefficients[1][local523] >> 16);
						}
						samples[local198] = local356;
						local102 = this.filterEnvelope.nextLevel(arg0 + 1);
						local198++;
					}
					if (local198 >= arg0 - local185) {
						while (local198 < arg0) {
							local356 = 0;
							for (local523 = local198 + local185 - arg0; local523 < local185; local523++) {
								local356 += (int) ((long) samples[local198 + local185 - local523 - 1] * (long) SynthFilter.coefficients[0][local523] >> 16);
							}
							for (local523 = 0; local523 < local190; local523++) {
								local356 -= (int) ((long) samples[local198 - local523 - 1] * (long) SynthFilter.coefficients[1][local523] >> 16);
							}
							samples[local198] = local356;
							this.filterEnvelope.nextLevel(arg0 + 1);
							local198++;
						}
						break;
					}
					local185 = this.filter.compute(0, (float) local102 / 65536.0F);
					local190 = this.filter.compute(1, (float) local102 / 65536.0F);
					local203 += 128;
				}
			}
		}
		for (local102 = 0; local102 < arg0; local102++) {
			if (samples[local102] < -32768) {
				samples[local102] = -32768;
			}
			if (samples[local102] > 32767) {
				samples[local102] = 32767;
			}
		}
		return samples;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!wa;)V")
	public final void method3506(@OriginalArg(0) Buffer arg0) {
		this.phaseEnvelope = new SynthEnvelope();
		this.phaseEnvelope.decode(arg0);
		this.amplitudeEnvelope = new SynthEnvelope();
		this.amplitudeEnvelope.decode(arg0);
		@Pc(21) int local21 = arg0.g1();
		if (local21 != 0) {
			arg0.offset--;
			this.phaseModulationEnvelope = new SynthEnvelope();
			this.phaseModulationEnvelope.decode(arg0);
			this.phaseModulationAmplitudeEnvelope = new SynthEnvelope();
			this.phaseModulationAmplitudeEnvelope.decode(arg0);
		}
		local21 = arg0.g1();
		if (local21 != 0) {
			arg0.offset--;
			this.amplitudeModulationEnvelope = new SynthEnvelope();
			this.amplitudeModulationEnvelope.decode(arg0);
			this.amplitudeModulationAmplitudeEnvelope = new SynthEnvelope();
			this.amplitudeModulationAmplitudeEnvelope.decode(arg0);
		}
		local21 = arg0.g1();
		if (local21 != 0) {
			arg0.offset--;
			this.gateClosedPhaseEnvelope = new SynthEnvelope();
			this.gateClosedPhaseEnvelope.decode(arg0);
			this.gateOpenPhaseEnvelope = new SynthEnvelope();
			this.gateOpenPhaseEnvelope.decode(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(116) int local116 = arg0.gsmarts();
			if (local116 == 0) {
				break;
			}
			this.harmonicVolume[local109] = local116;
			this.harmonicSemitone[local109] = arg0.gsmart();
			this.harmonicDelay[local109] = arg0.gsmarts();
		}
		this.reverbDelay = arg0.gsmarts();
		this.reverbVolume = arg0.gsmarts();
		this.length = arg0.g2();
		this.start = arg0.g2();
		this.filter = new SynthFilter();
		this.filterEnvelope = new SynthEnvelope();
		this.filter.decode(arg0, this.filterEnvelope);
	}
}
