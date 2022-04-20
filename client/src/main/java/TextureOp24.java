import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class TextureOp24 extends TextureOp {

	@OriginalMember(owner = "client!pk", name = "U", descriptor = "[I")
	private final int[] anIntArray406 = new int[3];

	@OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
	private int anInt4577 = 3216;

	@OriginalMember(owner = "client!pk", name = "X", descriptor = "I")
	private int anInt4580 = 4096;

	@OriginalMember(owner = "client!pk", name = "db", descriptor = "I")
	private int anInt4584 = 3216;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	public TextureOp24() {
		super(1, true);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
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
	public final void method4630() {
		this.method3533();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] method4626(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.aClass121_41.method3445(arg0);
		if (this.aClass121_41.aBoolean221) {
			@Pc(30) int local30 = Static165.anInt4042 * this.anInt4580 >> 12;
			@Pc(40) int[] local40 = this.method4624(0, Static141.anInt3473 & arg0 - 1);
			@Pc(46) int[] local46 = this.method4624(0, arg0);
			@Pc(56) int[] local56 = this.method4624(0, arg0 + 1 & Static141.anInt3473);
			for (@Pc(58) int local58 = 0; local58 < Static189.anInt4457; local58++) {
				@Pc(81) int local81 = (local46[Static34.anInt1060 & local58 - 1] - local46[local58 + 1 & Static34.anInt1060]) * local30 >> 12;
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
		@Pc(7) double local7 = Math.cos((double) ((float) this.anInt4584 / 4096.0F));
		this.anIntArray406[0] = (int) (local7 * 4096.0D * Math.sin((double) ((float) this.anInt4577 / 4096.0F)));
		this.anIntArray406[1] = (int) (Math.cos((double) ((float) this.anInt4577 / 4096.0F)) * local7 * 4096.0D);
		this.anIntArray406[2] = (int) (Math.sin((double) ((float) this.anInt4584 / 4096.0F)) * 4096.0D);
		@Pc(73) int local73 = this.anIntArray406[2] * this.anIntArray406[2] >> 12;
		@Pc(85) int local85 = this.anIntArray406[1] * this.anIntArray406[1] >> 12;
		@Pc(97) int local97 = this.anIntArray406[0] * this.anIntArray406[0] >> 12;
		@Pc(111) int local111 = (int) (Math.sqrt((double) (local97 + local85 + local73 >> 12)) * 4096.0D);
		if (local111 != 0) {
			this.anIntArray406[2] = (this.anIntArray406[2] << 12) / local111;
			this.anIntArray406[0] = (this.anIntArray406[0] << 12) / local111;
			this.anIntArray406[1] = (this.anIntArray406[1] << 12) / local111;
		}
	}
}
