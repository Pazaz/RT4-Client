package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class TextureOp5 extends TextureOp {

	@OriginalMember(owner = "client!nm", name = "V", descriptor = "I")
	private int anInt4221 = 1;

	@OriginalMember(owner = "client!nm", name = "Z", descriptor = "I")
	private int anInt4223 = 1;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
	public TextureOp5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.monochromeImageCache.get(arg0);
		if (this.monochromeImageCache.invalid) {
			@Pc(31) int local31 = this.anInt4223 + this.anInt4223 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt4221 + this.anInt4221 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][] local50 = new int[local31][];
			@Pc(56) int local56;
			for (local56 = arg0 - this.anInt4223; local56 <= arg0 + this.anInt4223; local56++) {
				@Pc(75) int[] local75 = this.getChildMonochromeOutput(0, local56 & Texture.heightMask);
				@Pc(78) int[] local78 = new int[Texture.width];
				@Pc(80) int local80 = 0;
				@Pc(84) int local84;
				for (local84 = -this.anInt4221; local84 <= this.anInt4221; local84++) {
					local80 += local75[local84 & Texture.widthMask];
				}
				local84 = 0;
				while (Texture.width > local84) {
					local78[local84] = local47 * local80 >> 16;
					local80 -= local75[Texture.widthMask & local84 - this.anInt4221];
					local84++;
					local80 += local75[Texture.widthMask & this.anInt4221 + local84];
				}
				local50[this.anInt4223 + local56 - arg0] = local78;
			}
			for (local56 = 0; local56 < Texture.width; local56++) {
				@Pc(169) int local169 = 0;
				for (@Pc(171) int local171 = 0; local171 < local31; local171++) {
					local169 += local50[local171][local56];
				}
				local19[local56] = local35 * local169 >> 16;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = this.colorImageCache.get(arg0);
		if (this.colorImageCache.invalid) {
			@Pc(30) int local30 = this.anInt4221 + this.anInt4221 + 1;
			@Pc(34) int local34 = 65536 / local30;
			@Pc(42) int local42 = this.anInt4223 + this.anInt4223 + 1;
			@Pc(46) int local46 = 65536 / local42;
			@Pc(49) int[][][] local49 = new int[local42][][];
			@Pc(70) int local70;
			@Pc(72) int local72;
			@Pc(78) int local78;
			for (@Pc(54) int local54 = arg0 - this.anInt4223; local54 <= this.anInt4223 + arg0; local54++) {
				@Pc(68) int[][] local68 = this.getChildColorOutput(Texture.heightMask & local54, 0);
				local70 = 0;
				local72 = 0;
				@Pc(76) int[][] local76 = new int[3][Texture.width];
				local78 = 0;
				@Pc(82) int[] local82 = local68[0];
				@Pc(86) int[] local86 = local68[1];
				@Pc(90) int[] local90 = local68[2];
				for (@Pc(94) int local94 = -this.anInt4221; local94 <= this.anInt4221; local94++) {
					@Pc(102) int local102 = local94 & Texture.widthMask;
					local72 += local86[local102];
					local70 += local82[local102];
					local78 += local90[local102];
				}
				@Pc(127) int[] local127 = local76[2];
				@Pc(131) int[] local131 = local76[0];
				@Pc(135) int[] local135 = local76[1];
				@Pc(137) int local137 = 0;
				while (Texture.width > local137) {
					local131[local137] = local70 * local34 >> 16;
					local135[local137] = local72 * local34 >> 16;
					local127[local137] = local34 * local78 >> 16;
					@Pc(172) int local172 = Texture.widthMask & local137 - this.anInt4221;
					local78 -= local90[local172];
					local137++;
					local70 -= local82[local172];
					local72 -= local86[local172];
					@Pc(198) int local198 = this.anInt4221 + local137 & Texture.widthMask;
					local78 += local90[local198];
					local72 += local86[local198];
					local70 += local82[local198];
				}
				local49[this.anInt4223 + local54 - arg0] = local76;
			}
			@Pc(235) int[] local235 = local13[0];
			@Pc(239) int[] local239 = local13[1];
			@Pc(243) int[] local243 = local13[2];
			for (local70 = 0; local70 < Texture.width; local70++) {
				local78 = 0;
				local72 = 0;
				@Pc(258) int local258 = 0;
				for (@Pc(260) int local260 = 0; local260 < local42; local260++) {
					@Pc(271) int[][] local271 = local49[local260];
					local258 += local271[2][local70];
					local78 += local271[1][local70];
					local72 += local271[0][local70];
				}
				local235[local70] = local46 * local72 >> 16;
				local239[local70] = local46 * local78 >> 16;
				local243[local70] = local258 * local46 >> 16;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt4221 = arg1.g1();
		} else if (arg0 == 1) {
			this.anInt4223 = arg1.g1();
		} else if (arg0 == 2) {
			this.monochrome = arg1.g1() == 1;
		}
	}
}
