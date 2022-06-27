package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class TextureOp11 extends TextureOp {

	@OriginalMember(owner = "client!mg", name = "R", descriptor = "I")
	private int anInt3812 = 4096;

	@OriginalMember(owner = "client!mg", name = "Z", descriptor = "I")
	private int anInt3816 = 4096;

	@OriginalMember(owner = "client!mg", name = "X", descriptor = "I")
	private int anInt3815 = 4096;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
	public TextureOp11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt3816 = arg1.g2();
		} else if (arg0 == 1) {
			this.anInt3812 = arg1.g2();
		} else if (arg0 == 2) {
			this.anInt3815 = arg1.g2();
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = this.colorImageCache.get(arg0);
		if (this.colorImageCache.invalid) {
			@Pc(27) int[][] local27 = this.getChildColorOutput(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local16[1];
			@Pc(47) int[] local47 = local16[0];
			@Pc(51) int[] local51 = local16[2];
			for (@Pc(53) int local53 = 0; local53 < Texture.width; local53++) {
				@Pc(64) int local64 = local31[local53];
				@Pc(68) int local68 = local35[local53];
				@Pc(72) int local72 = local39[local53];
				if (local64 == local72 && local68 == local72) {
					local47[local53] = this.anInt3816 * local64 >> 12;
					local43[local53] = local72 * this.anInt3812 >> 12;
					local51[local53] = local68 * this.anInt3815 >> 12;
				} else {
					local47[local53] = this.anInt3816;
					local43[local53] = this.anInt3812;
					local51[local53] = this.anInt3815;
				}
			}
		}
		return local16;
	}
}
