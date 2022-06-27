package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class TextureOpInvert extends TextureOp {

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	public TextureOpInvert() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = this.monochromeImageCache.get(arg0);
		if (this.monochromeImageCache.invalid) {
			@Pc(21) int[] local21 = this.getChildMonochromeOutput(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Texture.width; local23++) {
				local7[local23] = 4096 - local21[local23];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.monochrome = arg1.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = this.colorImageCache.get(arg0);
		if (this.colorImageCache.invalid) {
			@Pc(28) int[][] local28 = this.getChildColorOutput(arg0, 0);
			@Pc(32) int[] local32 = local28[2];
			@Pc(36) int[] local36 = local28[0];
			@Pc(40) int[] local40 = local28[1];
			@Pc(44) int[] local44 = local18[0];
			@Pc(48) int[] local48 = local18[1];
			@Pc(52) int[] local52 = local18[2];
			for (@Pc(54) int local54 = 0; local54 < Texture.width; local54++) {
				local44[local54] = 4096 - local36[local54];
				local48[local54] = 4096 - local40[local54];
				local52[local54] = 4096 - local32[local54];
			}
		}
		return local18;
	}
}
