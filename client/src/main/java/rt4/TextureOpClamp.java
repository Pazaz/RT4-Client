package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class TextureOpClamp extends TextureOp {

	@OriginalMember(owner = "client!aj", name = "V", descriptor = "I")
	private int anInt148 = 0;

	@OriginalMember(owner = "client!aj", name = "ab", descriptor = "I")
	private int anInt151 = 4096;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
	public TextureOpClamp() {
		super(1, false);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt148 = arg1.g2();
		} else if (arg0 == 1) {
			this.anInt151 = arg1.g2();
		} else if (arg0 == 2) {
			this.monochrome = arg1.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(1) int arg0) {
		@Pc(22) int[][] local22 = this.colorImageCache.get(arg0);
		if (this.colorImageCache.invalid) {
			@Pc(32) int[][] local32 = this.getChildColorOutput(arg0, 0);
			@Pc(36) int[] local36 = local32[1];
			@Pc(40) int[] local40 = local32[2];
			@Pc(44) int[] local44 = local32[0];
			@Pc(48) int[] local48 = local22[0];
			@Pc(52) int[] local52 = local22[1];
			@Pc(56) int[] local56 = local22[2];
			for (@Pc(58) int local58 = 0; local58 < Texture.width; local58++) {
				@Pc(69) int local69 = local36[local58];
				@Pc(73) int local73 = local44[local58];
				@Pc(77) int local77 = local40[local58];
				if (this.anInt148 > local73) {
					local48[local58] = this.anInt148;
				} else if (local73 > this.anInt151) {
					local48[local58] = this.anInt151;
				} else {
					local48[local58] = local73;
				}
				if (this.anInt148 > local69) {
					local52[local58] = this.anInt148;
				} else if (local69 <= this.anInt151) {
					local52[local58] = local69;
				} else {
					local52[local58] = this.anInt151;
				}
				if (local77 < this.anInt148) {
					local56[local58] = this.anInt148;
				} else if (this.anInt151 >= local77) {
					local56[local58] = local77;
				} else {
					local56[local58] = this.anInt151;
				}
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.monochromeImageCache.get(arg0);
		if (this.monochromeImageCache.invalid) {
			@Pc(29) int[] local29 = this.getChildMonochromeOutput(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Texture.width; local31++) {
				@Pc(38) int local38 = local29[local31];
				if (this.anInt148 > local38) {
					local19[local31] = this.anInt148;
				} else if (this.anInt151 >= local38) {
					local19[local31] = local38;
				} else {
					local19[local31] = this.anInt151;
				}
			}
		}
		return local19;
	}
}
