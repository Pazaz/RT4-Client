package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class TextureOp23 extends TextureOp {

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
	public static int anInt2433 = 0;
	@OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
	public static int anInt5776 = 0;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
	public TextureOp23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IBI)V")
	private void method2382(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Texture.widthFractions[arg1];
		@Pc(17) int local17 = Texture.heightFractions[arg0];
		@Pc(28) float local28 = (float) Math.atan2(local13 - 2048, local17 - 2048);
		if ((double) local28 >= -3.141592653589793D && -2.356194490192345D >= (double) local28) {
			anInt2433 = arg0;
			anInt5776 = arg1;
		} else if ((double) local28 <= -1.5707963267948966D && -2.356194490192345D <= (double) local28) {
			anInt5776 = arg0;
			anInt2433 = arg1;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			anInt5776 = Texture.width - arg0;
			anInt2433 = arg1;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			anInt5776 = arg1;
			anInt2433 = Texture.height - arg0;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			anInt5776 = Texture.width - arg1;
			anInt2433 = Texture.height - arg0;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			anInt5776 = Texture.width - arg0;
			anInt2433 = Texture.height - arg1;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			anInt2433 = Texture.height - arg1;
			anInt5776 = arg0;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			anInt5776 = Texture.width - arg1;
			anInt2433 = arg0;
		}
		anInt5776 &= Texture.widthMask;
		anInt2433 &= Texture.heightMask;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.monochrome = arg1.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.monochromeImageCache.get(arg0);
		if (this.monochromeImageCache.invalid) {
			for (@Pc(26) int local26 = 0; local26 < Texture.width; local26++) {
				this.method2382(arg0, local26);
				@Pc(40) int[] local40 = this.getChildMonochromeOutput(0, anInt2433);
				local19[local26] = local40[anInt5776];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = this.colorImageCache.get(arg0);
		if (this.colorImageCache.invalid) {
			@Pc(28) int[] local28 = local15[0];
			@Pc(32) int[] local32 = local15[2];
			@Pc(36) int[] local36 = local15[1];
			for (@Pc(38) int local38 = 0; local38 < Texture.width; local38++) {
				this.method2382(arg0, local38);
				@Pc(52) int[][] local52 = this.getChildColorOutput(anInt2433, 0);
				local28[local38] = local52[0][anInt5776];
				local36[local38] = local52[1][anInt5776];
				local32[local38] = local52[2][anInt5776];
			}
		}
		return local15;
	}
}
