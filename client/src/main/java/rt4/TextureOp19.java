package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class TextureOp19 extends TextureOp {

	@OriginalMember(owner = "client!ke", name = "V", descriptor = "I")
	private int anInt3292 = 32768;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
	public TextureOp19() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = this.colorImageCache.get(arg0);
		if (this.colorImageCache.invalid) {
			@Pc(28) int[] local28 = this.getChildMonochromeOutput(1, arg0);
			@Pc(34) int[] local34 = this.getChildMonochromeOutput(2, arg0);
			@Pc(38) int[] local38 = local17[2];
			@Pc(42) int[] local42 = local17[1];
			@Pc(46) int[] local46 = local17[0];
			for (@Pc(48) int local48 = 0; local48 < Texture.width; local48++) {
				@Pc(61) int local61 = local28[local48] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = local34[local48] * this.anInt3292 >> 12;
				@Pc(78) int local78 = local70 * TextureOp.COSINE[local61] >> 12;
				@Pc(86) int local86 = TextureOp.SINE[local61] * local70 >> 12;
				@Pc(94) int local94 = (local78 >> 12) + local48 & Texture.widthMask;
				@Pc(103) int local103 = Texture.heightMask & arg0 + (local86 >> 12);
				@Pc(109) int[][] local109 = this.getChildColorOutput(local103, 0);
				local46[local48] = local109[0][local94];
				local42[local48] = local109[1][local94];
				local38[local48] = local109[2][local94];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.monochromeImageCache.get(arg0);
		if (this.monochromeImageCache.invalid) {
			@Pc(29) int[] local29 = this.getChildMonochromeOutput(1, arg0);
			@Pc(35) int[] local35 = this.getChildMonochromeOutput(2, arg0);
			for (@Pc(37) int local37 = 0; local37 < Texture.width; local37++) {
				@Pc(49) int local49 = this.anInt3292 * local35[local37] >> 12;
				@Pc(57) int local57 = local29[local37] >> 4 & 0xFF;
				@Pc(65) int local65 = TextureOp.COSINE[local57] * local49 >> 12;
				@Pc(73) int local73 = TextureOp.SINE[local57] * local49 >> 12;
				@Pc(81) int local81 = Texture.widthMask & (local65 >> 12) + local37;
				@Pc(89) int local89 = Texture.heightMask & (local73 >> 12) + arg0;
				@Pc(95) int[] local95 = this.getChildMonochromeOutput(0, local89);
				local19[local37] = local95[local81];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt3292 = arg1.g2() << 4;
		} else if (arg0 == 1) {
			this.monochrome = arg1.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)V")
	@Override
	public final void postDecode() {
		TextureOp.createTrigonometryTables();
	}
}
