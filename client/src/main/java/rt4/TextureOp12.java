package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class TextureOp12 extends TextureOp {

	@OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
	private int anInt100 = 0;

	@OriginalMember(owner = "client!ag", name = "X", descriptor = "I")
	private int anInt105 = 0;

	@OriginalMember(owner = "client!ag", name = "W", descriptor = "I")
	private int anInt104 = 1;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
	public TextureOp12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.monochromeImageCache.get(arg0);
		if (this.monochromeImageCache.invalid) {
			@Pc(20) int local20 = Texture.heightFractions[arg0];
			@Pc(26) int local26 = local20 - 2048 >> 1;
			for (@Pc(28) int local28 = 0; local28 < Texture.width; local28++) {
				@Pc(35) int local35 = Texture.widthFractions[local28];
				@Pc(41) int local41 = local35 - 2048 >> 1;
				@Pc(68) int local68;
				if (this.anInt105 == 0) {
					local68 = (local35 - local20) * this.anInt104;
				} else {
					@Pc(58) int local58 = local41 * local41 + local26 * local26 >> 12;
					local68 = (int) (Math.sqrt((float) local58 / 4096.0F) * 4096.0D);
					local68 = (int) ((double) (local68 * this.anInt104) * 3.141592653589793D);
				}
				local68 -= local68 & 0xFFFFF000;
				if (this.anInt100 == 0) {
					local68 = TextureOp.SINE[local68 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt100 == 2) {
					local68 -= 2048;
					if (local68 < 0) {
						local68 = -local68;
					}
					local68 = 2048 - local68 << 1;
				}
				local11[local28] = local68;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "(I)V")
	@Override
	public final void postDecode() {
		TextureOp.createTrigonometryTables();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt105 = arg1.g1();
		} else if (arg0 == 1) {
			this.anInt100 = arg1.g1();
		} else if (arg0 == 3) {
			this.anInt104 = arg1.g1();
		}
	}
}
