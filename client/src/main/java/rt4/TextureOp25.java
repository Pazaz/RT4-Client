package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class TextureOp25 extends TextureOp {

	@OriginalMember(owner = "client!sk", name = "Y", descriptor = "I")
	private int anInt5197 = 4096;

	@OriginalMember(owner = "client!sk", name = "X", descriptor = "I")
	private int anInt5196 = 4096;

	@OriginalMember(owner = "client!sk", name = "fb", descriptor = "I")
	private int anInt5201 = 4096;

	@OriginalMember(owner = "client!sk", name = "W", descriptor = "I")
	private int anInt5195 = 409;

	@OriginalMember(owner = "client!sk", name = "V", descriptor = "[I")
	private final int[] anIntArray450 = new int[3];

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
	public TextureOp25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt5195 = arg1.g2();
		} else if (arg0 == 1) {
			this.anInt5196 = arg1.g2();
		} else if (arg0 == 2) {
			this.anInt5197 = arg1.g2();
		} else if (arg0 == 3) {
			this.anInt5201 = arg1.g2();
		} else if (arg0 == 4) {
			@Pc(65) int local65 = arg1.g3();
			this.anIntArray450[2] = local65 >> 12 & 0x0;
			this.anIntArray450[1] = local65 >> 4 & 0xFF0;
			this.anIntArray450[0] = (local65 & 0xFF0000) << 4;
		}
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = this.colorImageCache.get(arg0);
		if (this.colorImageCache.invalid) {
			@Pc(25) int[][] local25 = this.getChildColorOutput(arg0, 0);
			@Pc(29) int[] local29 = local25[0];
			@Pc(33) int[] local33 = local25[1];
			@Pc(37) int[] local37 = local25[2];
			@Pc(41) int[] local41 = local15[0];
			@Pc(45) int[] local45 = local15[1];
			@Pc(49) int[] local49 = local15[2];
			for (@Pc(51) int local51 = 0; local51 < Texture.width; local51++) {
				@Pc(58) int local58 = local29[local51];
				@Pc(66) int local66 = local58 - this.anIntArray450[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (this.anInt5195 < local66) {
					local41[local51] = local58;
					local45[local51] = local33[local51];
					local49[local51] = local37[local51];
				} else {
					@Pc(100) int local100 = local33[local51];
					local66 = local100 - this.anIntArray450[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (local66 > this.anInt5195) {
						local41[local51] = local58;
						local45[local51] = local100;
						local49[local51] = local37[local51];
					} else {
						@Pc(141) int local141 = local37[local51];
						local66 = local141 - this.anIntArray450[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (local66 <= this.anInt5195) {
							local41[local51] = this.anInt5201 * local58 >> 12;
							local45[local51] = this.anInt5197 * local100 >> 12;
							local49[local51] = this.anInt5196 * local141 >> 12;
						} else {
							local41[local51] = local58;
							local45[local51] = local100;
							local49[local51] = local141;
						}
					}
				}
			}
		}
		return local15;
	}
}
