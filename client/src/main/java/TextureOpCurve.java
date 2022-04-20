import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class TextureOpCurve extends TextureOp {

	@OriginalMember(owner = "client!wi", name = "Q", descriptor = "[I")
	private int[] anIntArray566;

	@OriginalMember(owner = "client!wi", name = "gb", descriptor = "[I")
	private int[] anIntArray567;

	@OriginalMember(owner = "client!wi", name = "ib", descriptor = "[[I")
	private int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!wi", name = "cb", descriptor = "[S")
	private final short[] aShortArray96 = new short[257];

	@OriginalMember(owner = "client!wi", name = "Z", descriptor = "I")
	private int anInt5852 = 0;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
	public TextureOpCurve() {
		super(1, true);
	}

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "(I)V")
	private void method4639() {
		@Pc(8) int local8 = this.anInt5852;
		@Pc(29) int local29;
		@Pc(27) int local27;
		@Pc(59) int[] local59;
		@Pc(52) int[] local52;
		@Pc(68) int local68;
		@Pc(76) int local76;
		@Pc(72) int local72;
		@Pc(89) int local89;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local27 = local8 << 4;
				for (local29 = 1; this.anIntArrayArray47.length - 1 > local29 && this.anIntArrayArray47[local29][0] <= local27; local29++) {
				}
				local52 = this.anIntArrayArray47[local29];
				local59 = this.anIntArrayArray47[local29 - 1];
				local68 = this.method4643(local29 - 2)[1];
				local72 = local52[1];
				local76 = local59[1];
				@Pc(80) int local80 = local72 - local68;
				local89 = this.method4643(local29 + 1)[1];
				@Pc(107) int local107 = (local27 - local59[0] << 12) / (local52[0] - local59[0]);
				@Pc(117) int local117 = local89 + local76 - local72 - local68;
				@Pc(123) int local123 = local107 * local107 >> 12;
				@Pc(130) int local130 = local68 - local76 - local117;
				@Pc(136) int local136 = local80 * local107 >> 12;
				@Pc(142) int local142 = local123 * local130 >> 12;
				@Pc(154) int local154 = local123 * (local107 * local117 >> 12) >> 12;
				@Pc(162) int local162 = local76 + local142 + local154 + local136;
				if (local162 <= -32768) {
					local162 = -32767;
				}
				if (local162 >= 32768) {
					local162 = 32767;
				}
				this.aShortArray96[local8] = (short) local162;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local27 = local8 << 4;
				for (local29 = 1; local29 < this.anIntArrayArray47.length - 1 && this.anIntArrayArray47[local29][0] <= local27; local29++) {
				}
				local59 = this.anIntArrayArray47[local29 - 1];
				local52 = this.anIntArrayArray47[local29];
				local68 = (local27 - local59[0] << 12) / (local52[0] - local59[0]);
				local76 = 4096 - Static130.anIntArray299[local68 >> 5 & 0xFF] >> 1;
				local72 = 4096 - local76;
				local89 = local76 * local52[1] + local59[1] * local72 >> 12;
				if (local89 <= -32768) {
					local89 = -32767;
				}
				if (local89 >= 32768) {
					local89 = 32767;
				}
				this.aShortArray96[local8] = (short) local89;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local27 = local8 << 4;
				for (local29 = 1; this.anIntArrayArray47.length - 1 > local29 && this.anIntArrayArray47[local29][0] <= local27; local29++) {
				}
				local52 = this.anIntArrayArray47[local29];
				local59 = this.anIntArrayArray47[local29 - 1];
				local68 = (local27 - local59[0] << 12) / (local52[0] - local59[0]);
				local76 = 4096 - local68;
				local72 = local52[1] * local68 + local76 * local59[1] >> 12;
				if (local72 <= -32768) {
					local72 = -32767;
				}
				if (local72 >= 32768) {
					local72 = 32767;
				}
				this.aShortArray96[local8] = (short) local72;
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] method4626(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.aClass121_41.method3445(arg0);
		if (this.aClass121_41.aBoolean221) {
			@Pc(29) int[] local29 = this.method4624(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static189.anInt4457; local31++) {
				@Pc(44) int local44 = local29[local31] >> 4;
				if (local44 < 0) {
					local44 = 0;
				}
				if (local44 > 256) {
					local44 = 256;
				}
				local19[local31] = this.aShortArray96[local44];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "(I)V")
	@Override
	public final void method4630() {
		if (this.anIntArrayArray47 == null) {
			this.anIntArrayArray47 = new int[][] { { 0, 0 }, { 4096, 4096 } };
		}
		if (this.anIntArrayArray47.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt5852 == 2) {
			this.method4642();
		}
		Static9.method185();
		this.method4639();
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
	private void method4642() {
		@Pc(8) int[] local8 = this.anIntArrayArray47[0];
		@Pc(20) int[] local20 = this.anIntArrayArray47[1];
		@Pc(29) int[] local29 = this.anIntArrayArray47[this.anIntArrayArray47.length - 2];
		@Pc(38) int[] local38 = this.anIntArrayArray47[this.anIntArrayArray47.length - 1];
		this.anIntArray566 = new int[] { local8[0] + local8[0] - local20[0], -local20[1] + local8[1] + local8[1] };
		this.anIntArray567 = new int[] { local29[0] + local29[0] - local38[0], -local38[1] - -local29[1] + local29[1] };
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt5852 = arg1.g1();
		this.anIntArrayArray47 = new int[arg1.g1()][2];
		for (@Pc(23) int local23 = 0; local23 < this.anIntArrayArray47.length; local23++) {
			this.anIntArrayArray47[local23][0] = arg1.g2();
			this.anIntArrayArray47[local23][1] = arg1.g2();
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)[I")
	private int[] method4643(@OriginalArg(1) int arg0) {
		if (arg0 >= 0) {
			return arg0 >= this.anIntArrayArray47.length ? this.anIntArray567 : this.anIntArrayArray47[arg0];
		} else {
			return this.anIntArray566;
		}
	}
}
