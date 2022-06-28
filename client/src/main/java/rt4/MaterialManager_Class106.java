package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Random;

@OriginalClass("client!wf")
public abstract class MaterialManager_Class106 {

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "[S")
	private short[] aShortArray70;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "[S")
	private final short[] aShortArray69 = new short[512];

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
	private int anInt5000 = 0;

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
	private int anInt5003 = 4;

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
	private int anInt5002 = 4;

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
	private int anInt5007 = 4;

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
	protected int anInt5008 = 4;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(IIIII)V")
	protected MaterialManager_Class106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5002 = arg3;
		this.anInt5008 = arg1;
		this.anInt5000 = arg0;
		this.anInt5007 = arg4;
		this.anInt5003 = arg2;
		this.method3843();
		this.method3847();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIZ)I")
	public static int method3891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8 = arg3 & 0xF;
		@Pc(29) int local29 = local8 >= 4 ? (local8 == 12 || local8 == 14 ? arg0 : arg1) : arg2;
		@Pc(42) int local42 = local8 < 8 ? arg0 : arg2;
		return ((local8 & 0x1) == 0 ? local42 : -local42) + ((local8 & 0x2) == 0 ? local29 : -local29);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIII)V")
	protected final void method3841() {
		@Pc(8) int[] local8 = new int[64];
		@Pc(11) int[] local11 = new int[64];
		@Pc(14) int[] local14 = new int[64];
		@Pc(16) int local16;
		for (local16 = 0; local16 < 64; local16++) {
			local8[local16] = (local16 << 12) / 64;
		}
		for (local16 = 0; local16 < 64; local16++) {
			local11[local16] = (local16 << 12) / 64;
		}
		for (local16 = 0; local16 < 64; local16++) {
			local14[local16] = (local16 << 12) / 64;
		}
		this.method3844();
		for (@Pc(77) int local77 = 0; local77 < 64; local77++) {
			for (@Pc(82) int local82 = 0; local82 < 64; local82++) {
				for (@Pc(91) int local91 = 0; local91 < 64; local91++) {
					for (@Pc(96) int local96 = 0; local96 < this.anInt5008; local96++) {
						local16 = this.aShortArray70[local96] << 12;
						@Pc(118) int local118 = this.anInt5003 * local16 >> 12;
						@Pc(126) int local126 = local16 * local14[local77] >> 12;
						@Pc(133) int local133 = local16 * this.anInt5002 >> 12;
						@Pc(138) int local138 = local126 * this.anInt5007;
						@Pc(145) int local145 = local16 * this.anInt5007 >> 12;
						@Pc(153) int local153 = local8[local91] * local16 >> 12;
						@Pc(158) int local158 = local153 * this.anInt5003;
						@Pc(162) int local162 = local158 >> 12;
						@Pc(166) int local166 = local158 & 0xFFF;
						@Pc(170) int local170 = local138 >> 12;
						@Pc(174) int local174 = local166 - 4096;
						@Pc(178) int local178 = local162 + 1;
						@Pc(182) int local182 = local170 + 1;
						@Pc(190) int local190 = local11[local82] * local16 >> 12;
						@Pc(194) int local194 = MonochromeImageCache.anIntArray1[local166];
						@Pc(199) int local199 = local190 * this.anInt5002;
						@Pc(203) int local203 = local170 & 0xFF;
						@Pc(207) int local207 = local162 & 0xFF;
						if (local145 <= local182) {
							local182 = 0;
						} else {
							local182 &= 0xFF;
						}
						@Pc(222) int local222 = local199 >> 12;
						@Pc(227) short local227 = this.aShortArray69[local203];
						@Pc(232) short local232 = this.aShortArray69[local182];
						@Pc(236) int local236 = local222 + 1;
						if (local133 > local236) {
							local236 &= 0xFF;
						} else {
							local236 = 0;
						}
						local190 = local199 & 0xFFF;
						@Pc(259) short local259 = this.aShortArray69[local236 + local232];
						local126 = local138 & 0xFFF;
						local222 &= 0xFF;
						@Pc(271) int local271 = MonochromeImageCache.anIntArray1[local126];
						@Pc(278) short local278 = this.aShortArray69[local222 + local232];
						@Pc(285) short local285 = this.aShortArray69[local227 + local222];
						if (local118 <= local178) {
							local178 = 0;
						} else {
							local178 &= 0xFF;
						}
						@Pc(300) int local300 = local190 - 4096;
						@Pc(304) int local304 = MonochromeImageCache.anIntArray1[local190];
						@Pc(308) int local308 = local126 - 4096;
						@Pc(315) short local315 = this.aShortArray69[local227 + local236];
						@Pc(327) int local327 = method3891(local166, local126, local190, this.aShortArray69[local285 + local207]);
						@Pc(340) int local340 = method3891(local174, local126, local190, this.aShortArray69[local178 + local285]);
						@Pc(351) int local351 = local327 + (local194 * (local340 - local327) >> 12);
						@Pc(363) int local363 = method3891(local166, local126, local300, this.aShortArray69[local315 + local207]);
						@Pc(375) int local375 = method3891(local174, local126, local300, this.aShortArray69[local178 + local315]);
						@Pc(386) int local386 = local363 + (local194 * (local375 - local363) >> 12);
						@Pc(397) int local397 = ((local386 - local351) * local304 >> 12) + local351;
						@Pc(409) int local409 = method3891(local166, local308, local190, this.aShortArray69[local207 + local278]);
						@Pc(421) int local421 = method3891(local174, local308, local190, this.aShortArray69[local178 + local278]);
						@Pc(432) int local432 = (local194 * (local421 - local409) >> 12) + local409;
						@Pc(445) int local445 = method3891(local166, local308, local300, this.aShortArray69[local207 + local259]);
						@Pc(457) int local457 = method3891(local174, local308, local300, this.aShortArray69[local178 + local259]);
						@Pc(468) int local468 = local445 + ((local457 - local445) * local194 >> 12);
						@Pc(480) int local480 = local432 + ((local468 - local432) * local304 >> 12);
						this.method3848(((local480 - local397) * local271 >> 12) + local397, local96);
					}
					this.method3842();
				}
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
	protected abstract void method3842();

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V")
	private void method3843() {
		this.aShortArray70 = new short[this.anInt5008];
		for (@Pc(12) int local12 = 0; local12 < this.anInt5008; local12++) {
			this.aShortArray70[local12] = (short) Math.pow(2.0D, local12);
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	protected abstract void method3844();

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
	private void method3847() {
		@Pc(12) Random local12 = new Random(this.anInt5000);
		@Pc(14) int local14;
		for (local14 = 0; local14 < 255; local14++) {
			this.aShortArray69[local14] = (short) local14;
		}
		for (local14 = 0; local14 < 255; local14++) {
			@Pc(41) int local41 = 255 - local14;
			@Pc(46) int local46 = RandomUtils.nextInt(local41, local12);
			@Pc(51) short local51 = this.aShortArray69[local46];
			this.aShortArray69[local46] = this.aShortArray69[local41];
			this.aShortArray69[local41] = this.aShortArray69[local41 + 256] = local51;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V")
	protected abstract void method3848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
