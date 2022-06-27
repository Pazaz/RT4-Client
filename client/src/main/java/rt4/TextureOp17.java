package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class TextureOp17 extends TextureOp {

	@OriginalMember(owner = "client!hk", name = "Q", descriptor = "I")
	private int anInt2543;

	@OriginalMember(owner = "client!hk", name = "Z", descriptor = "I")
	private int anInt2551;

	@OriginalMember(owner = "client!hk", name = "cb", descriptor = "I")
	private int anInt2553;

	@OriginalMember(owner = "client!hk", name = "gb", descriptor = "I")
	private int anInt2554;

	@OriginalMember(owner = "client!hk", name = "ib", descriptor = "I")
	private int anInt2556;

	@OriginalMember(owner = "client!hk", name = "jb", descriptor = "I")
	private int anInt2557;

	@OriginalMember(owner = "client!hk", name = "T", descriptor = "I")
	private int anInt2546 = 0;

	@OriginalMember(owner = "client!hk", name = "U", descriptor = "I")
	private int anInt2547 = 0;

	@OriginalMember(owner = "client!hk", name = "X", descriptor = "I")
	private int anInt2549 = 0;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
	public TextureOp17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt2546 = arg1.g2b();
		} else if (arg0 == 1) {
			this.anInt2549 = (arg1.g1b() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt2547 = (arg1.g1b() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)V")
	private void method1991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) int local35 = arg0 <= 2048 ? arg0 * (arg1 + 4096) >> 12 : arg0 + arg1 - (arg0 * arg1 >> 12);
		if (local35 <= 0) {
			this.anInt2554 = this.anInt2543 = this.anInt2553 = arg0;
			return;
		}
		@Pc(44) int local44 = arg2 * 6;
		@Pc(51) int local51 = arg0 + arg0 - local35;
		@Pc(55) int local55 = local44 >> 12;
		@Pc(64) int local64 = (local35 - local51 << 12) / local35;
		@Pc(70) int local70 = local44 - (local55 << 12);
		@Pc(78) int local78 = local35 * local64 >> 12;
		@Pc(84) int local84 = local78 * local70 >> 12;
		@Pc(88) int local88 = local84 + local51;
		@Pc(93) int local93 = local35 - local84;
		if (local55 == 0) {
			this.anInt2553 = local51;
			this.anInt2554 = local35;
			this.anInt2543 = local88;
		} else if (local55 == 1) {
			this.anInt2553 = local51;
			this.anInt2543 = local35;
			this.anInt2554 = local93;
		} else if (local55 == 2) {
			this.anInt2554 = local51;
			this.anInt2543 = local35;
			this.anInt2553 = local88;
		} else if (local55 == 3) {
			this.anInt2543 = local93;
			this.anInt2553 = local35;
			this.anInt2554 = local51;
		} else if (local55 == 4) {
			this.anInt2553 = local35;
			this.anInt2554 = local88;
			this.anInt2543 = local51;
		} else if (local55 == 5) {
			this.anInt2543 = local51;
			this.anInt2554 = local35;
			this.anInt2553 = local93;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BIII)V")
	private void method1992(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 > arg1 ? arg0 : arg1;
		@Pc(31) int local31 = arg2 <= local12 ? local12 : arg2;
		@Pc(38) int local38 = arg1 > arg0 ? arg0 : arg1;
		@Pc(49) int local49 = arg2 >= local38 ? local38 : arg2;
		@Pc(54) int local54 = local31 - local49;
		if (local54 > 0) {
			@Pc(65) int local65 = (local31 - arg1 << 12) / local54;
			@Pc(74) int local74 = (local31 - arg0 << 12) / local54;
			@Pc(83) int local83 = (local31 - arg2 << 12) / local54;
			if (arg0 == local31) {
				this.anInt2551 = local49 == arg1 ? local83 + 20480 : -local65 + 4096;
			} else if (local31 == arg1) {
				this.anInt2551 = local49 == arg2 ? local74 + 4096 : -local83 + 12288;
			} else {
				this.anInt2551 = local49 == arg0 ? local65 + 12288 : -local74 + 20480;
			}
			this.anInt2551 /= 6;
		} else {
			this.anInt2551 = 0;
		}
		this.anInt2556 = (local49 + local31) / 2;
		if (this.anInt2556 > 0 && this.anInt2556 < 4096) {
			this.anInt2557 = (local54 << 12) / (this.anInt2556 > 2048 ? 8192 - this.anInt2556 * 2 : this.anInt2556 * 2);
		} else {
			this.anInt2557 = 0;
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = this.colorImageCache.get(arg0);
		if (this.colorImageCache.invalid) {
			@Pc(28) int[][] local28 = this.getChildColorOutput(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local17[1];
			@Pc(48) int[] local48 = local17[2];
			@Pc(52) int[] local52 = local17[0];
			for (@Pc(54) int local54 = 0; local54 < Texture.width; local54++) {
				this.method1992(local32[local54], local36[local54], local40[local54]);
				this.anInt2556 += this.anInt2547;
				if (this.anInt2556 < 0) {
					this.anInt2556 = 0;
				}
				this.anInt2557 += this.anInt2549;
				if (this.anInt2556 > 4096) {
					this.anInt2556 = 4096;
				}
				if (this.anInt2557 < 0) {
					this.anInt2557 = 0;
				}
				if (this.anInt2557 > 4096) {
					this.anInt2557 = 4096;
				}
				for (this.anInt2551 += this.anInt2546; this.anInt2551 < 0; this.anInt2551 += 4096) {
				}
				while (this.anInt2551 > 4096) {
					this.anInt2551 -= 4096;
				}
				this.method1991(this.anInt2556, this.anInt2557, this.anInt2551);
				local52[local54] = this.anInt2554;
				local44[local54] = this.anInt2543;
				local48[local54] = this.anInt2553;
			}
		}
		return local17;
	}
}
