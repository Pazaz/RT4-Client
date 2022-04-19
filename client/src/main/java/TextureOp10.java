import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class TextureOp10 extends TextureOp {

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
	public TextureOp10() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] method4626(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.aClass121_41.method3445(arg0);
		if (this.aClass121_41.aBoolean221) {
			@Pc(30) int[][] local30 = this.method4634(arg0, 0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[2];
			@Pc(42) int[] local42 = local30[1];
			for (@Pc(44) int local44 = 0; local44 < Static189.anInt4457; local44++) {
				local19[local44] = (local38[local44] + local34[local44] + local42[local44]) / 3;
			}
		}
		return local19;
	}
}
