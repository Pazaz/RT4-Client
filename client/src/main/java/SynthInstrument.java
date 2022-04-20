import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class SynthInstrument {

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "[I")
	private static final int[] anIntArray395 = new int[32768];

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "[I")
	private static final int[] anIntArray394;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "Lclient!ff;")
	private SynthEnvelope aClass42_1;

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "Lclient!ff;")
	private SynthEnvelope aClass42_2;

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "Lclient!ff;")
	private SynthEnvelope aClass42_3;

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "Lclient!ff;")
	private SynthEnvelope aClass42_4;

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "Lclient!ff;")
	private SynthEnvelope aClass42_5;

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "Lclient!ff;")
	private SynthEnvelope aClass42_6;

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "Lclient!ff;")
	private SynthEnvelope aClass42_7;

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "Lclient!nl;")
	private SynthFilter aClass110_1;

	@OriginalMember(owner = "client!pj", name = "x", descriptor = "Lclient!ff;")
	private SynthEnvelope aClass42_8;

	@OriginalMember(owner = "client!pj", name = "y", descriptor = "Lclient!ff;")
	private SynthEnvelope aClass42_9;

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
	public int anInt4546 = 500;

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
	private int anInt4547 = 0;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
	public int anInt4548 = 0;

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "[I")
	private final int[] anIntArray396 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "[I")
	private final int[] anIntArray397 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
	private int anInt4549 = 100;

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "[I")
	private final int[] anIntArray404 = new int[] { 0, 0, 0, 0, 0 };

	static {
		@Pc(7) Random local7 = new Random(0L);
		@Pc(9) int local9;
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray395[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray394 = new int[32768];
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray394[local9] = (int) (Math.sin((double) local9 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)I")
	private int method3504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray394[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray395[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[I")
	public final int[] method3505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static289.method2618(Static194.anIntArray398, 0, arg0);
		if (arg1 < 10) {
			return Static194.anIntArray398;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass42_5.method1513();
		this.aClass42_3.method1513();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass42_9 != null) {
			this.aClass42_9.method1513();
			this.aClass42_8.method1513();
			local24 = (int) ((double) (this.aClass42_9.anInt1960 - this.aClass42_9.anInt1959) * 32.768D / local16);
			local26 = (int) ((double) this.aClass42_9.anInt1959 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass42_7 != null) {
			this.aClass42_7.method1513();
			this.aClass42_1.method1513();
			local63 = (int) ((double) (this.aClass42_7.anInt1960 - this.aClass42_7.anInt1959) * 32.768D / local16);
			local65 = (int) ((double) this.aClass42_7.anInt1959 * 32.768D / local16);
		}
		@Pc(102) int local102;
		for (local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray396[local102] != 0) {
				Static194.anIntArray401[local102] = 0;
				Static194.anIntArray402[local102] = (int) ((double) this.anIntArray397[local102] * local16);
				Static194.anIntArray403[local102] = (this.anIntArray396[local102] << 14) / 100;
				Static194.anIntArray399[local102] = (int) ((double) (this.aClass42_5.anInt1960 - this.aClass42_5.anInt1959) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray404[local102]) / local16);
				Static194.anIntArray400[local102] = (int) ((double) this.aClass42_5.anInt1959 * 32.768D / local16);
			}
		}
		@Pc(185) int local185;
		@Pc(190) int local190;
		@Pc(198) int local198;
		@Pc(203) int local203;
		for (local102 = 0; local102 < arg0; local102++) {
			local185 = this.aClass42_5.method1512(arg0);
			local190 = this.aClass42_3.method1512(arg0);
			if (this.aClass42_9 != null) {
				local198 = this.aClass42_9.method1512(arg0);
				local203 = this.aClass42_8.method1512(arg0);
				local185 += this.method3504(local28, local203, this.aClass42_9.anInt1958) >> 1;
				local28 += (local198 * local24 >> 16) + local26;
			}
			if (this.aClass42_7 != null) {
				local198 = this.aClass42_7.method1512(arg0);
				local203 = this.aClass42_1.method1512(arg0);
				local190 = local190 * ((this.method3504(local67, local203, this.aClass42_7.anInt1958) >> 1) + 32768) >> 15;
				local67 += (local198 * local63 >> 16) + local65;
			}
			for (local198 = 0; local198 < 5; local198++) {
				if (this.anIntArray396[local198] != 0) {
					local203 = local102 + Static194.anIntArray402[local198];
					if (local203 < arg0) {
						Static194.anIntArray398[local203] += this.method3504(Static194.anIntArray401[local198], local190 * Static194.anIntArray403[local198] >> 15, this.aClass42_5.anInt1958);
						Static194.anIntArray401[local198] += (local185 * Static194.anIntArray399[local198] >> 16) + Static194.anIntArray400[local198];
					}
				}
			}
		}
		@Pc(356) int local356;
		if (this.aClass42_2 != null) {
			this.aClass42_2.method1513();
			this.aClass42_4.method1513();
			local102 = 0;
			@Pc(341) boolean local341 = true;
			for (local198 = 0; local198 < arg0; local198++) {
				local203 = this.aClass42_2.method1512(arg0);
				local356 = this.aClass42_4.method1512(arg0);
				if (local341) {
					local185 = this.aClass42_2.anInt1959 + ((this.aClass42_2.anInt1960 - this.aClass42_2.anInt1959) * local203 >> 8);
				} else {
					local185 = this.aClass42_2.anInt1959 + ((this.aClass42_2.anInt1960 - this.aClass42_2.anInt1959) * local356 >> 8);
				}
				local102 += 256;
				if (local102 >= local185) {
					local102 = 0;
					local341 = !local341;
				}
				if (local341) {
					Static194.anIntArray398[local198] = 0;
				}
			}
		}
		if (this.anInt4547 > 0 && this.anInt4549 > 0) {
			local102 = (int) ((double) this.anInt4547 * local16);
			for (local185 = local102; local185 < arg0; local185++) {
				Static194.anIntArray398[local185] += Static194.anIntArray398[local185 - local102] * this.anInt4549 / 100;
			}
		}
		if (this.aClass110_1.anIntArray368[0] > 0 || this.aClass110_1.anIntArray368[1] > 0) {
			this.aClass42_6.method1513();
			local102 = this.aClass42_6.method1512(arg0 + 1);
			local185 = this.aClass110_1.method3251(0, (float) local102 / 65536.0F);
			local190 = this.aClass110_1.method3251(1, (float) local102 / 65536.0F);
			if (arg0 >= local185 + local190) {
				local198 = 0;
				local203 = local190;
				if (local190 > arg0 - local185) {
					local203 = arg0 - local185;
				}
				@Pc(523) int local523;
				while (local198 < local203) {
					local356 = (int) ((long) Static194.anIntArray398[local198 + local185] * (long) Static174.anInt4191 >> 16);
					for (local523 = 0; local523 < local185; local523++) {
						local356 += (int) ((long) Static194.anIntArray398[local198 + local185 - local523 - 1] * (long) Static174.anIntArrayArray32[0][local523] >> 16);
					}
					for (local523 = 0; local523 < local198; local523++) {
						local356 -= (int) ((long) Static194.anIntArray398[local198 - local523 - 1] * (long) Static174.anIntArrayArray32[1][local523] >> 16);
					}
					Static194.anIntArray398[local198] = local356;
					local102 = this.aClass42_6.method1512(arg0 + 1);
					local198++;
				}
				local203 = 128;
				while (true) {
					if (local203 > arg0 - local185) {
						local203 = arg0 - local185;
					}
					while (local198 < local203) {
						local356 = (int) ((long) Static194.anIntArray398[local198 + local185] * (long) Static174.anInt4191 >> 16);
						for (local523 = 0; local523 < local185; local523++) {
							local356 += (int) ((long) Static194.anIntArray398[local198 + local185 - local523 - 1] * (long) Static174.anIntArrayArray32[0][local523] >> 16);
						}
						for (local523 = 0; local523 < local190; local523++) {
							local356 -= (int) ((long) Static194.anIntArray398[local198 - local523 - 1] * (long) Static174.anIntArrayArray32[1][local523] >> 16);
						}
						Static194.anIntArray398[local198] = local356;
						local102 = this.aClass42_6.method1512(arg0 + 1);
						local198++;
					}
					if (local198 >= arg0 - local185) {
						while (local198 < arg0) {
							local356 = 0;
							for (local523 = local198 + local185 - arg0; local523 < local185; local523++) {
								local356 += (int) ((long) Static194.anIntArray398[local198 + local185 - local523 - 1] * (long) Static174.anIntArrayArray32[0][local523] >> 16);
							}
							for (local523 = 0; local523 < local190; local523++) {
								local356 -= (int) ((long) Static194.anIntArray398[local198 - local523 - 1] * (long) Static174.anIntArrayArray32[1][local523] >> 16);
							}
							Static194.anIntArray398[local198] = local356;
							this.aClass42_6.method1512(arg0 + 1);
							local198++;
						}
						break;
					}
					local185 = this.aClass110_1.method3251(0, (float) local102 / 65536.0F);
					local190 = this.aClass110_1.method3251(1, (float) local102 / 65536.0F);
					local203 += 128;
				}
			}
		}
		for (local102 = 0; local102 < arg0; local102++) {
			if (Static194.anIntArray398[local102] < -32768) {
				Static194.anIntArray398[local102] = -32768;
			}
			if (Static194.anIntArray398[local102] > 32767) {
				Static194.anIntArray398[local102] = 32767;
			}
		}
		return Static194.anIntArray398;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!wa;)V")
	public final void method3506(@OriginalArg(0) Buffer arg0) {
		this.aClass42_5 = new SynthEnvelope();
		this.aClass42_5.method1515(arg0);
		this.aClass42_3 = new SynthEnvelope();
		this.aClass42_3.method1515(arg0);
		@Pc(21) int local21 = arg0.g1();
		if (local21 != 0) {
			arg0.offset--;
			this.aClass42_9 = new SynthEnvelope();
			this.aClass42_9.method1515(arg0);
			this.aClass42_8 = new SynthEnvelope();
			this.aClass42_8.method1515(arg0);
		}
		local21 = arg0.g1();
		if (local21 != 0) {
			arg0.offset--;
			this.aClass42_7 = new SynthEnvelope();
			this.aClass42_7.method1515(arg0);
			this.aClass42_1 = new SynthEnvelope();
			this.aClass42_1.method1515(arg0);
		}
		local21 = arg0.g1();
		if (local21 != 0) {
			arg0.offset--;
			this.aClass42_2 = new SynthEnvelope();
			this.aClass42_2.method1515(arg0);
			this.aClass42_4 = new SynthEnvelope();
			this.aClass42_4.method1515(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(116) int local116 = arg0.gSmart1or2();
			if (local116 == 0) {
				break;
			}
			this.anIntArray396[local109] = local116;
			this.anIntArray404[local109] = arg0.gSmart1or2s();
			this.anIntArray397[local109] = arg0.gSmart1or2();
		}
		this.anInt4547 = arg0.gSmart1or2();
		this.anInt4549 = arg0.gSmart1or2();
		this.anInt4546 = arg0.g2();
		this.anInt4548 = arg0.g2();
		this.aClass110_1 = new SynthFilter();
		this.aClass42_6 = new SynthEnvelope();
		this.aClass110_1.method3249(arg0, this.aClass42_6);
	}
}
