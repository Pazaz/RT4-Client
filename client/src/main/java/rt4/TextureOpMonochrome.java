package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class TextureOpMonochrome extends TextureOp {

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
	public TextureOpMonochrome() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.monochromeImageCache.get(arg0);
		if (this.monochromeImageCache.invalid) {
			@Pc(30) int[][] local30 = this.getChildColorOutput(arg0, 0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[2];
			@Pc(42) int[] local42 = local30[1];
			for (@Pc(44) int local44 = 0; local44 < Texture.width; local44++) {
				local19[local44] = (local38[local44] + local34[local44] + local42[local44]) / 3;
			}
		}
		return local19;
	}
}
