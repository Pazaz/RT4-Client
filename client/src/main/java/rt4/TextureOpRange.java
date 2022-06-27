package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class TextureOpRange extends TextureOp {

	@OriginalMember(owner = "client!fh", name = "jb", descriptor = "I")
	private int anInt2007 = 1024;

	@OriginalMember(owner = "client!fh", name = "db", descriptor = "I")
	private int anInt2001 = 2048;

	@OriginalMember(owner = "client!fh", name = "eb", descriptor = "I")
	private int anInt2002 = 3072;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
	public TextureOpRange() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt2007 = arg1.g2();
		} else if (arg0 == 1) {
			this.anInt2002 = arg1.g2();
		} else if (arg0 == 2) {
			this.monochrome = arg1.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.monochromeImageCache.get(arg0);
		if (this.monochromeImageCache.invalid) {
			@Pc(30) int[] local30 = this.getChildMonochromeOutput(0, arg0);
			for (@Pc(32) int local32 = 0; local32 < Texture.width; local32++) {
				local19[local32] = this.anInt2007 + (local30[local32] * this.anInt2001 >> 12);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = this.colorImageCache.get(arg0);
		if (this.colorImageCache.invalid) {
			@Pc(17) int[][] local17 = this.getChildColorOutput(arg0, 0);
			@Pc(21) int[] local21 = local17[1];
			@Pc(25) int[] local25 = local17[2];
			@Pc(29) int[] local29 = local17[0];
			@Pc(33) int[] local33 = local7[0];
			@Pc(37) int[] local37 = local7[1];
			@Pc(41) int[] local41 = local7[2];
			for (@Pc(43) int local43 = 0; local43 < Texture.width; local43++) {
				local33[local43] = this.anInt2007 + (this.anInt2001 * local29[local43] >> 12);
				local37[local43] = (this.anInt2001 * local21[local43] >> 12) + this.anInt2007;
				local41[local43] = this.anInt2007 + (this.anInt2001 * local25[local43] >> 12);
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)V")
	@Override
	public final void postDecode() {
		this.anInt2001 = this.anInt2002 - this.anInt2007;
	}
}
