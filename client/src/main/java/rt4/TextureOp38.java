package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Random;

@OriginalClass("client!vc")
public final class TextureOp38 extends TextureOp {

	@OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
	private int anInt5709 = 0;

	@OriginalMember(owner = "client!vc", name = "U", descriptor = "I")
	private int anInt5712 = 2000;

	@OriginalMember(owner = "client!vc", name = "Z", descriptor = "I")
	private int anInt5715 = 16;

	@OriginalMember(owner = "client!vc", name = "Y", descriptor = "I")
	private int anInt5714 = 4096;

	@OriginalMember(owner = "client!vc", name = "cb", descriptor = "I")
	private int anInt5716 = 0;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	public TextureOp38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)V")
	@Override
	public final void postDecode() {
		TextureOp.createTrigonometryTables();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt5716 = arg1.g1();
		} else if (arg0 == 1) {
			this.anInt5712 = arg1.g2();
		} else if (arg0 == 2) {
			this.anInt5715 = arg1.g1();
		} else if (arg0 == 3) {
			this.anInt5709 = arg1.g2();
		} else if (arg0 == 4) {
			this.anInt5714 = arg1.g2();
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.monochromeImageCache.get(arg0);
		if (this.monochromeImageCache.invalid) {
			@Pc(28) int local28 = this.anInt5714 >> 1;
			@Pc(33) int[][] local33 = this.monochromeImageCache.method3446();
			@Pc(40) Random local40 = new Random(this.anInt5716);
			for (@Pc(42) int local42 = 0; local42 < this.anInt5712; local42++) {
				@Pc(64) int local64 = this.anInt5714 > 0 ? this.anInt5709 + RandomUtils.nextInt(this.anInt5714, local40) - local28 : this.anInt5709;
				@Pc(69) int local69 = RandomUtils.nextInt(Texture.width, local40);
				@Pc(75) int local75 = local64 >> 4 & 0xFF;
				@Pc(80) int local80 = RandomUtils.nextInt(Texture.height, local40);
				@Pc(92) int local92 = local69 + (this.anInt5715 * TextureOp.COSINE[local75] >> 12);
				@Pc(103) int local103 = local80 + (TextureOp.SINE[local75] * this.anInt5715 >> 12);
				@Pc(107) int local107 = local92 - local69;
				@Pc(112) int local112 = local103 - local80;
				if (local107 != 0 || local112 != 0) {
					if (local107 < 0) {
						local107 = -local107;
					}
					if (local112 < 0) {
						local112 = -local112;
					}
					@Pc(146) boolean local146 = local112 > local107;
					@Pc(150) int local150;
					@Pc(152) int local152;
					if (local146) {
						local150 = local69;
						local152 = local92;
						local92 = local103;
						local103 = local152;
						local69 = local80;
						local80 = local150;
					}
					if (local69 > local92) {
						local150 = local69;
						local152 = local80;
						local69 = local92;
						local80 = local103;
						local103 = local152;
						local92 = local150;
					}
					local152 = local92 - local69;
					@Pc(190) int local190 = local103 - local80;
					local150 = local80;
					if (local190 < 0) {
						local190 = -local190;
					}
					@Pc(206) int local206 = -local152 / 2;
					@Pc(216) int local216 = 1024 - (RandomUtils.nextInt(4096, local40) >> 2);
					@Pc(227) int local227 = local103 <= local80 ? -1 : 1;
					@Pc(231) int local231 = 2048 / local152;
					for (@Pc(233) int local233 = local69; local233 < local92; local233++) {
						local206 += local190;
						@Pc(251) int local251 = local231 * (local233 - local69) + local216 + 1024;
						@Pc(255) int local255 = local150 & Texture.heightMask;
						if (local206 > 0) {
							local206 += -local152;
							local150 += local227;
						}
						@Pc(271) int local271 = Texture.widthMask & local233;
						if (local146) {
							local33[local255][local271] = local251;
						} else {
							local33[local271][local255] = local251;
						}
					}
				}
			}
		}
		return local19;
	}
}
