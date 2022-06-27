package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class TextureOpVerticalGradient extends TextureOp {

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
	public TextureOpVerticalGradient() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(0) int y) {
		@Pc(9) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			ArrayUtils.fill(dest, 0, Texture.width, Texture.heightFractions[y]);
		}
		return dest;
	}
}
