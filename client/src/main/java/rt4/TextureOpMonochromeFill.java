package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class TextureOpMonochromeFill extends TextureOp {

	@OriginalMember(owner = "client!mi", name = "bb", descriptor = "I")
	private int anInt3894;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(I)V")
	private TextureOpMonochromeFill(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt3894 = 4096;
		this.anInt3894 = arg0;
	}

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public TextureOpMonochromeFill() {
		this(4096);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt3894 = (arg1.g1() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.monochromeImageCache.get(arg0);
		if (this.monochromeImageCache.invalid) {
			ArrayUtils.fill(local17, 0, Texture.width, this.anInt3894);
		}
		return local17;
	}
}
