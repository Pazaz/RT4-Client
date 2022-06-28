package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class TextureOp32 extends TextureOp {

	@OriginalMember(owner = "client!pk", name = "U", descriptor = "[I")
	private final int[] anIntArray406 = new int[3];

	@OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
	private int anInt4577 = 3216;

	@OriginalMember(owner = "client!pk", name = "X", descriptor = "I")
	private int anInt4580 = 4096;

	@OriginalMember(owner = "client!pk", name = "db", descriptor = "I")
	private int anInt4584 = 3216;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	public TextureOp32() {
		super(1, true);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt4580 = arg1.g2();
		} else if (arg0 == 1) {
			this.anInt4577 = arg1.g2();
		} else if (arg0 == 2) {
			this.anInt4584 = arg1.g2();
		}
	}

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "(I)V")
	@Override
	public final void postDecode() {
		this.method3533();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.monochromeImageCache.get(arg0);
		if (this.monochromeImageCache.invalid) {
			@Pc(30) int local30 = Texture.anInt4042 * this.anInt4580 >> 12;
			@Pc(40) int[] local40 = this.getChildMonochromeOutput(0, Texture.heightMask & arg0 - 1);
			@Pc(46) int[] local46 = this.getChildMonochromeOutput(0, arg0);
			@Pc(56) int[] local56 = this.getChildMonochromeOutput(0, arg0 + 1 & Texture.heightMask);
			for (@Pc(58) int local58 = 0; local58 < Texture.width; local58++) {
				@Pc(81) int local81 = (local46[Texture.widthMask & local58 - 1] - local46[local58 + 1 & Texture.widthMask]) * local30 >> 12;
				@Pc(94) int local94 = local30 * (local56[local58] - local40[local58]) >> 12;
				@Pc(98) int local98 = local81 >> 4;
				if (local98 < 0) {
					local98 = -local98;
				}
				if (local98 > 255) {
					local98 = 255;
				}
				@Pc(113) int local113 = local94 >> 4;
				if (local113 < 0) {
					local113 = -local113;
				}
				if (local113 > 255) {
					local113 = 255;
				}
				@Pc(142) int local142 = MonochromeImageCache.aByteArray53[(local113 * (local113 + 1) >> 1) + local98] & 0xFF;
				@Pc(148) int local148 = local94 * local142 >> 8;
				@Pc(154) int local154 = local142 * local81 >> 8;
				@Pc(163) int local163 = local148 * this.anIntArray406[1] >> 12;
				@Pc(172) int local172 = this.anIntArray406[0] * local154 >> 12;
				@Pc(178) int local178 = local142 * 4096 >> 8;
				@Pc(187) int local187 = local178 * this.anIntArray406[2] >> 12;
				local19[local58] = local187 + local163 + local172;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "(B)V")
	private void method3533() {
		@Pc(7) double local7 = Math.cos((float) this.anInt4584 / 4096.0F);
		this.anIntArray406[0] = (int) (local7 * 4096.0D * Math.sin((float) this.anInt4577 / 4096.0F));
		this.anIntArray406[1] = (int) (Math.cos((float) this.anInt4577 / 4096.0F) * local7 * 4096.0D);
		this.anIntArray406[2] = (int) (Math.sin((float) this.anInt4584 / 4096.0F) * 4096.0D);
		@Pc(73) int local73 = this.anIntArray406[2] * this.anIntArray406[2] >> 12;
		@Pc(85) int local85 = this.anIntArray406[1] * this.anIntArray406[1] >> 12;
		@Pc(97) int local97 = this.anIntArray406[0] * this.anIntArray406[0] >> 12;
		@Pc(111) int local111 = (int) (Math.sqrt(local97 + local85 + local73 >> 12) * 4096.0D);
		if (local111 != 0) {
			this.anIntArray406[2] = (this.anIntArray406[2] << 12) / local111;
			this.anIntArray406[0] = (this.anIntArray406[0] << 12) / local111;
			this.anIntArray406[1] = (this.anIntArray406[1] << 12) / local111;
		}
	}
}
