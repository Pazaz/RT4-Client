package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class TextureOpNoise extends TextureOp {

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
	public TextureOpNoise() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(III)I")
	private int method3769(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = arg1 + arg0 * 57;
		@Pc(25) int local25 = local19 ^ local19 << 1;
		return 4096 - (local25 * (local25 * local25 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = this.monochromeImageCache.get(arg0);
		if (this.monochromeImageCache.invalid) {
			@Pc(27) int local27 = Texture.heightFractions[arg0];
			for (@Pc(29) int local29 = 0; local29 < Texture.width; local29++) {
				local15[local29] = this.method3769(local27, Texture.widthFractions[local29]) % 4096;
			}
		}
		return local15;
	}
}
