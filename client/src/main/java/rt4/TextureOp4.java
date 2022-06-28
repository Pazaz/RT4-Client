package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Random;

@OriginalClass("client!mc")
public final class TextureOp4 extends TextureOp {

	@OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
	private int anInt3670;

	@OriginalMember(owner = "client!mc", name = "V", descriptor = "I")
	private int anInt3671;

	@OriginalMember(owner = "client!mc", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!mc", name = "cb", descriptor = "[I")
	private int[] anIntArray352;

	@OriginalMember(owner = "client!mc", name = "jb", descriptor = "I")
	private int anInt3679;

	@OriginalMember(owner = "client!mc", name = "sb", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
	private int anInt3667 = 204;

	@OriginalMember(owner = "client!mc", name = "bb", descriptor = "I")
	private int anInt3673 = 1024;

	@OriginalMember(owner = "client!mc", name = "eb", descriptor = "I")
	private int anInt3675 = 0;

	@OriginalMember(owner = "client!mc", name = "lb", descriptor = "I")
	private int anInt3681 = 409;

	@OriginalMember(owner = "client!mc", name = "hb", descriptor = "I")
	private int anInt3677 = 8;

	@OriginalMember(owner = "client!mc", name = "W", descriptor = "I")
	private int anInt3672 = 81;

	@OriginalMember(owner = "client!mc", name = "ub", descriptor = "I")
	private int anInt3685 = 4;

	@OriginalMember(owner = "client!mc", name = "ib", descriptor = "I")
	private int anInt3678 = 1024;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
	public TextureOp4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V")
	@Override
	public final void postDecode() {
		this.method2908();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt3685 = arg1.g1();
		} else if (arg0 == 1) {
			this.anInt3677 = arg1.g1();
		} else if (arg0 == 2) {
			this.anInt3681 = arg1.g2();
		} else if (arg0 == 3) {
			this.anInt3667 = arg1.g2();
		} else if (arg0 == 4) {
			this.anInt3678 = arg1.g2();
		} else if (arg0 == 5) {
			this.anInt3675 = arg1.g2();
		} else if (arg0 == 6) {
			this.anInt3672 = arg1.g2();
		} else if (arg0 == 7) {
			this.anInt3673 = arg1.g2();
		}
	}

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "(I)V")
	private void method2908() {
		@Pc(8) Random local8 = new Random(this.anInt3677);
		this.anInt3670 = 4096 / this.anInt3677;
		this.anInt3671 = this.anInt3672 / 2;
		this.anIntArrayArray26 = new int[this.anInt3677][this.anInt3685 + 1];
		@Pc(34) int local34 = this.anInt3670 / 2;
		this.anIntArray352 = new int[this.anInt3677 + 1];
		this.anIntArrayArray27 = new int[this.anInt3677][this.anInt3685];
		this.anInt3679 = 4096 / this.anInt3685;
		this.anIntArray352[0] = 0;
		@Pc(64) int local64 = this.anInt3679 / 2;
		for (@Pc(66) int local66 = 0; local66 < this.anInt3677; local66++) {
			@Pc(82) int local82;
			@Pc(94) int local94;
			if (local66 > 0) {
				local82 = this.anInt3670;
				local94 = (RandomUtils.nextInt(4096, local8) - 2048) * this.anInt3667 >> 12;
				@Pc(102) int local102 = local82 + (local94 * local34 >> 12);
				this.anIntArray352[local66] = this.anIntArray352[local66 - 1] + local102;
			}
			this.anIntArrayArray26[local66][0] = 0;
			for (local82 = 0; local82 < this.anInt3685; local82++) {
				if (local82 > 0) {
					local94 = this.anInt3679;
					@Pc(150) int local150 = (RandomUtils.nextInt(4096, local8) - 2048) * this.anInt3681 >> 12;
					local94 += local64 * local150 >> 12;
					this.anIntArrayArray26[local66][local82] = this.anIntArrayArray26[local66][local82 - 1] + local94;
				}
				this.anIntArrayArray27[local66][local82] = this.anInt3673 <= 0 ? 4096 : 4096 - RandomUtils.nextInt(this.anInt3673, local8);
			}
			this.anIntArrayArray26[local66][this.anInt3685] = 4096;
		}
		this.anIntArray352[this.anInt3677] = 4096;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.monochromeImageCache.get(arg0);
		if (this.monochromeImageCache.invalid) {
			@Pc(18) int local18 = 0;
			@Pc(25) int local25;
			for (local25 = Texture.heightFractions[arg0] + this.anInt3675; local25 < 0; local25 += 4096) {
			}
			while (local25 > 4096) {
				local25 -= 4096;
			}
			while (this.anInt3677 > local18 && local25 >= this.anIntArray352[local18]) {
				local18++;
			}
			@Pc(60) int local60 = local18 - 1;
			@Pc(65) int local65 = this.anIntArray352[local18];
			@Pc(74) boolean local74 = (local18 & 0x1) == 0;
			@Pc(81) int local81 = this.anIntArray352[local18 - 1];
			if (local81 + this.anInt3671 < local25 && local65 - this.anInt3671 > local25) {
				for (@Pc(100) int local100 = 0; local100 < Texture.width; local100++) {
					@Pc(105) int local105 = 0;
					@Pc(114) int local114 = local74 ? this.anInt3678 : -this.anInt3678;
					@Pc(126) int local126;
					for (local126 = Texture.widthFractions[local100] + (this.anInt3679 * local114 >> 12); local126 < 0; local126 += 4096) {
					}
					while (local126 > 4096) {
						local126 -= 4096;
					}
					while (this.anInt3685 > local105 && local126 >= this.anIntArrayArray26[local60][local105]) {
						local105++;
					}
					@Pc(172) int local172 = this.anIntArrayArray26[local60][local105];
					@Pc(176) int local176 = local105 - 1;
					@Pc(183) int local183 = this.anIntArrayArray26[local60][local176];
					if (local183 + this.anInt3671 < local126 && local172 - this.anInt3671 > local126) {
						local11[local100] = this.anIntArrayArray27[local60][local176];
					} else {
						local11[local100] = 0;
					}
				}
			} else {
				ArrayUtils.fill(local11, 0, Texture.width, 0);
			}
		}
		return local11;
	}
}
