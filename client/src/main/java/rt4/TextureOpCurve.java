package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class TextureOpCurve extends TextureOp {

	@OriginalMember(owner = "client!wi", name = "Q", descriptor = "[I")
	private int[] lastMarker;

	@OriginalMember(owner = "client!wi", name = "gb", descriptor = "[I")
	private int[] firstMarker;

	@OriginalMember(owner = "client!wi", name = "ib", descriptor = "[[I")
	private int[][] markers;

	@OriginalMember(owner = "client!wi", name = "cb", descriptor = "[S")
	private final short[] aShortArray96 = new short[257];

	@OriginalMember(owner = "client!wi", name = "Z", descriptor = "I")
	private int anInt5852 = 0;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
	public TextureOpCurve() {
		super(1, true);
	}

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "(I)V")
	private void method4639() {
		@Pc(8) int local8 = this.anInt5852;
		@Pc(29) int local29;
		@Pc(27) int local27;
		@Pc(59) int[] local59;
		@Pc(52) int[] local52;
		@Pc(68) int local68;
		@Pc(76) int local76;
		@Pc(72) int local72;
		@Pc(89) int local89;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local27 = local8 << 4;
				for (local29 = 1; this.markers.length - 1 > local29 && this.markers[local29][0] <= local27; local29++) {
				}
				local52 = this.markers[local29];
				local59 = this.markers[local29 - 1];
				local68 = this.getMarker(local29 - 2)[1];
				local72 = local52[1];
				local76 = local59[1];
				@Pc(80) int local80 = local72 - local68;
				local89 = this.getMarker(local29 + 1)[1];
				@Pc(107) int local107 = (local27 - local59[0] << 12) / (local52[0] - local59[0]);
				@Pc(117) int local117 = local89 + local76 - local72 - local68;
				@Pc(123) int local123 = local107 * local107 >> 12;
				@Pc(130) int local130 = local68 - local76 - local117;
				@Pc(136) int local136 = local80 * local107 >> 12;
				@Pc(142) int local142 = local123 * local130 >> 12;
				@Pc(154) int local154 = local123 * (local107 * local117 >> 12) >> 12;
				@Pc(162) int local162 = local76 + local142 + local154 + local136;
				if (local162 <= -32768) {
					local162 = -32767;
				}
				if (local162 >= 32768) {
					local162 = 32767;
				}
				this.aShortArray96[local8] = (short) local162;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local27 = local8 << 4;
				for (local29 = 1; local29 < this.markers.length - 1 && this.markers[local29][0] <= local27; local29++) {
				}
				local59 = this.markers[local29 - 1];
				local52 = this.markers[local29];
				local68 = (local27 - local59[0] << 12) / (local52[0] - local59[0]);
				local76 = 4096 - TextureOp.COSINE[local68 >> 5 & 0xFF] >> 1;
				local72 = 4096 - local76;
				local89 = local76 * local52[1] + local59[1] * local72 >> 12;
				if (local89 <= -32768) {
					local89 = -32767;
				}
				if (local89 >= 32768) {
					local89 = 32767;
				}
				this.aShortArray96[local8] = (short) local89;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local27 = local8 << 4;
				for (local29 = 1; this.markers.length - 1 > local29 && this.markers[local29][0] <= local27; local29++) {
				}
				local52 = this.markers[local29];
				local59 = this.markers[local29 - 1];
				local68 = (local27 - local59[0] << 12) / (local52[0] - local59[0]);
				local76 = 4096 - local68;
				local72 = local52[1] * local68 + local76 * local59[1] >> 12;
				if (local72 <= -32768) {
					local72 = -32767;
				}
				if (local72 >= 32768) {
					local72 = 32767;
				}
				this.aShortArray96[local8] = (short) local72;
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.monochromeImageCache.get(arg0);
		if (this.monochromeImageCache.invalid) {
			@Pc(29) int[] local29 = this.getChildMonochromeOutput(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Texture.width; local31++) {
				@Pc(44) int local44 = local29[local31] >> 4;
				if (local44 < 0) {
					local44 = 0;
				}
				if (local44 > 256) {
					local44 = 256;
				}
				local19[local31] = this.aShortArray96[local44];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "(I)V")
	@Override
	public final void postDecode() {
		if (this.markers == null) {
			this.markers = new int[][]{{0, 0}, {4096, 4096}};
		}
		if (this.markers.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt5852 == 2) {
			this.method4642();
		}
		TextureOp.createTrigonometryTables();
		this.method4639();
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
	private void method4642() {
		@Pc(8) int[] local8 = this.markers[0];
		@Pc(20) int[] local20 = this.markers[1];
		@Pc(29) int[] local29 = this.markers[this.markers.length - 2];
		@Pc(38) int[] local38 = this.markers[this.markers.length - 1];
		this.lastMarker = new int[]{local8[0] + local8[0] - local20[0], -local20[1] + local8[1] + local8[1]};
		this.firstMarker = new int[]{local29[0] + local29[0] - local38[0], -local38[1] - -local29[1] + local29[1]};
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt5852 = arg1.g1();
		this.markers = new int[arg1.g1()][2];
		for (@Pc(23) int local23 = 0; local23 < this.markers.length; local23++) {
			this.markers[local23][0] = arg1.g2();
			this.markers[local23][1] = arg1.g2();
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)[I")
	private int[] getMarker(@OriginalArg(1) int arg0) {
		if (arg0 >= 0) {
			return arg0 >= this.markers.length ? this.firstMarker : this.markers[arg0];
		} else {
			return this.lastMarker;
		}
	}
}
