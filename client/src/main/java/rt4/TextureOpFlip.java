package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class TextureOpFlip extends TextureOp {

	@OriginalMember(owner = "client!ej", name = "P", descriptor = "Z")
	private boolean aBoolean104 = true;

	@OriginalMember(owner = "client!ej", name = "Y", descriptor = "Z")
	private boolean aBoolean105 = true;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
	public TextureOpFlip() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.aBoolean104 = arg1.g1() == 1;
		} else if (arg0 == 1) {
			this.aBoolean105 = arg1.g1() == 1;
		} else if (arg0 == 2) {
			this.monochrome = arg1.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = this.colorImageCache.get(arg0);
		if (this.colorImageCache.invalid) {
			@Pc(39) int[][] local39 = this.getChildColorOutput(this.aBoolean105 ? Texture.heightMask - arg0 : arg0, 0);
			@Pc(43) int[] local43 = local39[0];
			@Pc(47) int[] local47 = local39[2];
			@Pc(51) int[] local51 = local39[1];
			@Pc(55) int[] local55 = local20[1];
			@Pc(59) int[] local59 = local20[2];
			@Pc(63) int[] local63 = local20[0];
			@Pc(68) int local68;
			if (this.aBoolean104) {
				for (local68 = 0; local68 < Texture.width; local68++) {
					local63[local68] = local43[Texture.widthMask - local68];
					local55[local68] = local51[Texture.widthMask - local68];
					local59[local68] = local47[Texture.widthMask - local68];
				}
			} else {
				for (local68 = 0; local68 < Texture.width; local68++) {
					local63[local68] = local43[local68];
					local55[local68] = local51[local68];
					local59[local68] = local47[local68];
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = this.monochromeImageCache.get(arg0);
		if (this.monochromeImageCache.invalid) {
			@Pc(38) int[] local38 = this.getChildMonochromeOutput(0, this.aBoolean105 ? Texture.heightMask - arg0 : arg0);
			if (this.aBoolean104) {
				for (@Pc(51) int local51 = 0; local51 < Texture.width; local51++) {
					local15[local51] = local38[Texture.widthMask - local51];
				}
			} else {
				ArrayUtils.copy(local38, 0, local15, 0, Texture.width);
			}
		}
		return local15;
	}
}
