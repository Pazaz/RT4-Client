package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class TextureOpColorGradient extends TextureOp {

	@OriginalMember(owner = "client!um", name = "R", descriptor = "[[I")
	private int[][] samples;

	@OriginalMember(owner = "client!um", name = "bb", descriptor = "[I")
	private final int[] colors = new int[257];

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	public TextureOpColorGradient() {
		super(1, false);
	}

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(I)V")
	@Override
	public final void postDecode() {
		if (this.samples == null) {
			this.setPreset(1);
		}
		this.interpolate();
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)V")
	private void setPreset(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.samples = new int[2][4];
			this.samples[0][1] = 0;
			this.samples[0][0] = 0;
			this.samples[1][0] = 4096;
			this.samples[0][3] = 0;
			this.samples[1][1] = 4096;
			this.samples[0][2] = 0;
			this.samples[1][2] = 4096;
			this.samples[1][3] = 4096;
		} else if (arg0 == 2) {
			this.samples = new int[8][4];
			this.samples[0][0] = 0;
			this.samples[1][0] = 2867;
			this.samples[2][0] = 3072;
			this.samples[0][2] = 2602;
			this.samples[3][0] = 3276;
			this.samples[0][3] = 2361;
			this.samples[1][3] = 1558;
			this.samples[4][0] = 3481;
			this.samples[5][0] = 3686;
			this.samples[2][3] = 1413;
			this.samples[3][3] = 947;
			this.samples[4][3] = 722;
			this.samples[6][0] = 3891;
			this.samples[1][2] = 1799;
			this.samples[7][0] = 4096;
			this.samples[5][3] = 1766;
			this.samples[2][2] = 1734;
			this.samples[3][2] = 1220;
			this.samples[4][2] = 963;
			this.samples[5][2] = 2152;
			this.samples[6][3] = 915;
			this.samples[7][3] = 1140;
			this.samples[0][1] = 2650;
			this.samples[6][2] = 1060;
			this.samples[1][1] = 2313;
			this.samples[2][1] = 2618;
			this.samples[3][1] = 2296;
			this.samples[4][1] = 2072;
			this.samples[7][2] = 1413;
			this.samples[5][1] = 2730;
			this.samples[6][1] = 2232;
			this.samples[7][1] = 1686;
		} else if (arg0 == 3) {
			this.samples = new int[7][4];
			this.samples[0][0] = 0;
			this.samples[0][3] = 4096;
			this.samples[1][3] = 4096;
			this.samples[2][3] = 0;
			this.samples[1][0] = 663;
			this.samples[0][1] = 0;
			this.samples[3][3] = 0;
			this.samples[1][1] = 0;
			this.samples[2][0] = 1363;
			this.samples[2][1] = 0;
			this.samples[4][3] = 0;
			this.samples[5][3] = 4096;
			this.samples[6][3] = 4096;
			this.samples[3][0] = 2048;
			this.samples[4][0] = 2727;
			this.samples[5][0] = 3411;
			this.samples[6][0] = 4096;
			this.samples[3][1] = 4096;
			this.samples[4][1] = 4096;
			this.samples[5][1] = 4096;
			this.samples[6][1] = 0;
			this.samples[0][2] = 0;
			this.samples[1][2] = 4096;
			this.samples[2][2] = 4096;
			this.samples[3][2] = 4096;
			this.samples[4][2] = 0;
			this.samples[5][2] = 0;
			this.samples[6][2] = 0;
		} else if (arg0 == 4) {
			this.samples = new int[6][4];
			this.samples[0][3] = 0;
			this.samples[0][0] = 0;
			this.samples[0][2] = 0;
			this.samples[1][0] = 1843;
			this.samples[1][2] = 0;
			this.samples[2][2] = 0;
			this.samples[1][3] = 1493;
			this.samples[2][3] = 2939;
			this.samples[3][3] = 3565;
			this.samples[3][2] = 1124;
			this.samples[4][3] = 4031;
			this.samples[0][1] = 0;
			this.samples[1][1] = 0;
			this.samples[5][3] = 4096;
			this.samples[4][2] = 3084;
			this.samples[2][0] = 2457;
			this.samples[2][1] = 0;
			this.samples[3][0] = 2781;
			this.samples[4][0] = 3481;
			this.samples[3][1] = 0;
			this.samples[4][1] = 546;
			this.samples[5][2] = 4096;
			this.samples[5][0] = 4096;
			this.samples[5][1] = 4096;
		} else if (arg0 == 5) {
			this.samples = new int[16][4];
			this.samples[0][3] = 321;
			this.samples[0][0] = 0;
			this.samples[0][2] = 192;
			this.samples[1][0] = 155;
			this.samples[1][3] = 562;
			this.samples[1][2] = 449;
			this.samples[2][0] = 389;
			this.samples[3][0] = 671;
			this.samples[2][2] = 690;
			this.samples[0][1] = 80;
			this.samples[1][1] = 321;
			this.samples[4][0] = 897;
			this.samples[3][2] = 995;
			this.samples[4][2] = 1397;
			this.samples[2][1] = 578;
			this.samples[2][3] = 803;
			this.samples[5][0] = 1175;
			this.samples[6][0] = 1368;
			this.samples[5][2] = 1429;
			this.samples[3][1] = 947;
			this.samples[7][0] = 1507;
			this.samples[4][1] = 1285;
			this.samples[6][2] = 1461;
			this.samples[8][0] = 1736;
			this.samples[3][3] = 1140;
			this.samples[9][0] = 2088;
			this.samples[7][2] = 1525;
			this.samples[4][3] = 1509;
			this.samples[5][1] = 1525;
			this.samples[6][1] = 1734;
			this.samples[5][3] = 1413;
			this.samples[8][2] = 1590;
			this.samples[10][0] = 2355;
			this.samples[9][2] = 2056;
			this.samples[7][1] = 1413;
			this.samples[11][0] = 2691;
			this.samples[12][0] = 3031;
			this.samples[6][3] = 1333;
			this.samples[10][2] = 2586;
			this.samples[11][2] = 3148;
			this.samples[13][0] = 3522;
			this.samples[14][0] = 3727;
			this.samples[7][3] = 1702;
			this.samples[8][1] = 1108;
			this.samples[9][1] = 1766;
			this.samples[10][1] = 2409;
			this.samples[15][0] = 4096;
			this.samples[12][2] = 3710;
			this.samples[11][1] = 3116;
			this.samples[13][2] = 3421;
			this.samples[12][1] = 3806;
			this.samples[13][1] = 3437;
			this.samples[14][1] = 3116;
			this.samples[15][1] = 2377;
			this.samples[8][3] = 2056;
			this.samples[9][3] = 2666;
			this.samples[14][2] = 3148;
			this.samples[15][2] = 2505;
			this.samples[10][3] = 3276;
			this.samples[11][3] = 3228;
			this.samples[12][3] = 3196;
			this.samples[13][3] = 3019;
			this.samples[14][3] = 3228;
			this.samples[15][3] = 2746;
		} else if (arg0 == 6) {
			this.samples = new int[4][4];
			this.samples[0][3] = 0;
			this.samples[0][2] = 4096;
			this.samples[1][3] = 0;
			this.samples[0][1] = 0;
			this.samples[2][3] = 0;
			this.samples[3][3] = 0;
			this.samples[0][0] = 2048;
			this.samples[1][1] = 4096;
			this.samples[1][0] = 2867;
			this.samples[2][1] = 4096;
			this.samples[1][2] = 4096;
			this.samples[2][2] = 4096;
			this.samples[3][1] = 4096;
			this.samples[2][0] = 3276;
			this.samples[3][2] = 0;
			this.samples[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(15) int local15 = arg1.g1();
		if (local15 != 0) {
			this.setPreset(local15);
			return;
		}
		this.samples = new int[arg1.g1()][4];
		for (@Pc(35) int local35 = 0; local35 < this.samples.length; local35++) {
			this.samples[local35][0] = arg1.g2();
			this.samples[local35][1] = arg1.g1() << 4;
			this.samples[local35][2] = arg1.g1() << 4;
			this.samples[local35][3] = arg1.g1() << 4;
		}
	}

	@OriginalMember(owner = "client!um", name = "h", descriptor = "(I)V")
	private void interpolate() {
		@Pc(16) int local16 = this.samples.length;
		if (local16 <= 0) {
			return;
		}
		for (@Pc(24) int local24 = 0; local24 < 257; local24++) {
			@Pc(29) int local29 = 0;
			@Pc(33) int local33 = local24 << 4;
			for (@Pc(35) int local35 = 0; local16 > local35 && local33 >= this.samples[local35][0]; local35++) {
				local29++;
			}
			@Pc(119) int local119;
			@Pc(133) int local133;
			@Pc(105) int local105;
			@Pc(60) int[] local60;
			if (local16 > local29) {
				local60 = this.samples[local29];
				if (local29 > 0) {
					@Pc(69) int[] local69 = this.samples[local29 - 1];
					@Pc(86) int local86 = (local33 - local69[0] << 12) / (local60[0] - local69[0]);
					@Pc(91) int local91 = 4096 - local86;
					local105 = local69[3] * local91 + local60[3] * local86 >> 12;
					local119 = local91 * local69[1] + local86 * local60[1] >> 12;
					local133 = local91 * local69[2] + local86 * local60[2] >> 12;
				} else {
					local119 = local60[1];
					local105 = local60[3];
					local133 = local60[2];
				}
			} else {
				local60 = this.samples[local16 - 1];
				local105 = local60[3];
				local133 = local60[2];
				local119 = local60[1];
			}
			local119 >>= 0x4;
			local133 >>= 0x4;
			if (local119 < 0) {
				local119 = 0;
			} else if (local119 > 255) {
				local119 = 255;
			}
			if (local133 < 0) {
				local133 = 0;
			} else if (local133 > 255) {
				local133 = 255;
			}
			local105 >>= 0x4;
			if (local105 < 0) {
				local105 = 0;
			} else if (local105 > 255) {
				local105 = 255;
			}
			this.colors[local24] = local105 | local133 << 8 | local119 << 16;
		}
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = this.colorImageCache.get(arg0);
		if (this.colorImageCache.invalid) {
			@Pc(31) int[] local31 = this.getChildMonochromeOutput(0, arg0);
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[2];
			for (@Pc(45) int local45 = 0; local45 < Texture.width; local45++) {
				@Pc(54) int local54 = local31[local45] >> 4;
				if (local54 < 0) {
					local54 = 0;
				}
				if (local54 > 256) {
					local54 = 256;
				}
				local54 = this.colors[local54];
				local39[local45] = local54 >> 12 & 0xFF0;
				local35[local45] = local54 >> 4 & 0xFF0;
				local43[local45] = (local54 & 0xFF) << 4;
			}
		}
		return local11;
	}
}
