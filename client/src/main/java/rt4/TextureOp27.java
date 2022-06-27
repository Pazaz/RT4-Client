package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class TextureOp27 extends TextureOp {

	@OriginalMember(owner = "client!d", name = "U", descriptor = "[I")
	private int[] anIntArray86;

	@OriginalMember(owner = "client!d", name = "W", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!d", name = "Q", descriptor = "I")
	private int anInt1234 = 0;

	@OriginalMember(owner = "client!d", name = "P", descriptor = "I")
	private int anInt1233 = 10;

	@OriginalMember(owner = "client!d", name = "bb", descriptor = "I")
	private int anInt1240 = 2048;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
	public TextureOp27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V")
	@Override
	public final void postDecode() {
		this.method991();
	}

	@OriginalMember(owner = "client!d", name = "h", descriptor = "(I)V")
	private void method991() {
		@Pc(7) int local7 = 0;
		this.anIntArray87 = new int[this.anInt1233 + 1];
		@Pc(23) int local23 = 4096 / this.anInt1233;
		this.anIntArray86 = new int[this.anInt1233 + 1];
		@Pc(37) int local37 = this.anInt1240 * local23 >> 12;
		for (@Pc(39) int local39 = 0; local39 < this.anInt1233; local39++) {
			this.anIntArray86[local39] = local7;
			this.anIntArray87[local39] = local7 + local37;
			local7 += local23;
		}
		this.anIntArray86[this.anInt1233] = 4096;
		this.anIntArray87[this.anInt1233] = this.anIntArray87[0] + 4096;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt1233 = arg1.g1();
		} else if (arg0 == 1) {
			this.anInt1240 = arg1.g2();
		} else if (arg0 == 2) {
			this.anInt1234 = arg1.g1();
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.monochromeImageCache.get(arg0);
		if (this.monochromeImageCache.invalid) {
			@Pc(28) int local28 = Texture.heightFractions[arg0];
			@Pc(36) int local36;
			if (this.anInt1234 == 0) {
				@Pc(34) short local34 = 0;
				for (local36 = 0; local36 < this.anInt1233; local36++) {
					if (this.anIntArray86[local36] <= local28 && local28 < this.anIntArray86[local36 + 1]) {
						if (local28 < this.anIntArray87[local36]) {
							local34 = 4096;
						}
						break;
					}
				}
				ArrayUtils.fill(local19, 0, Texture.width, local34);
			} else {
				for (@Pc(85) int local85 = 0; local85 < Texture.width; local85++) {
					@Pc(96) int local96 = Texture.widthFractions[local85];
					local36 = 0;
					@Pc(101) int local101 = this.anInt1234;
					if (local101 == 1) {
						local36 = local96;
					} else if (local101 == 2) {
						local36 = (local96 + local28 - 4096 >> 1) + 2048;
					} else if (local101 == 3) {
						local36 = (local96 - local28 >> 1) + 2048;
					}
					@Pc(143) short local143 = 0;
					for (local101 = 0; local101 < this.anInt1233; local101++) {
						if (this.anIntArray86[local101] <= local36 && local36 < this.anIntArray86[local101 + 1]) {
							if (local36 < this.anIntArray87[local101]) {
								local143 = 4096;
							}
							break;
						}
					}
					local19[local85] = local143;
				}
			}
		}
		return local19;
	}
}
