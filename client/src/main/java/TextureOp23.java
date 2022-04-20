import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class TextureOp23 extends TextureOp {

	@OriginalMember(owner = "client!pg", name = "U", descriptor = "I")
	private int anInt4503 = 4096;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	public TextureOp23() {
		super(1, true);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] method4626(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.aClass121_41.method3445(arg0);
		if (this.aClass121_41.aBoolean221) {
			@Pc(34) int[] local34 = this.method4624(0, arg0 - 1 & Static141.anInt3473);
			@Pc(40) int[] local40 = this.method4624(0, arg0);
			@Pc(50) int[] local50 = this.method4624(0, Static141.anInt3473 & arg0 + 1);
			for (@Pc(52) int local52 = 0; local52 < Static189.anInt4457; local52++) {
				@Pc(67) int local67 = (local50[local52] - local34[local52]) * this.anInt4503;
				@Pc(87) int local87 = this.anInt4503 * (local40[Static34.anInt1060 & local52 + 1] - local40[local52 - 1 & Static34.anInt1060]);
				@Pc(91) int local91 = local87 >> 12;
				@Pc(95) int local95 = local67 >> 12;
				@Pc(101) int local101 = local91 * local91 >> 12;
				@Pc(107) int local107 = local95 * local95 >> 12;
				@Pc(121) int local121 = (int) (Math.sqrt((double) ((float) (local107 + local101 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(130) int local130 = local121 == 0 ? 0 : 16777216 / local121;
				local19[local52] = 4096 - local130;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt4503 = arg1.g2();
		}
	}
}
