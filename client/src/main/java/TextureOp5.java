import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class TextureOp5 extends TextureOp {

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
	public TextureOp5() {
		super(3, false);
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] method4638(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = this.aClass103_41.method3173(arg0);
		if (this.aClass103_41.aBoolean195) {
			@Pc(27) int[] local27 = this.method4624(2, arg0);
			@Pc(33) int[][] local33 = this.method4634(arg0, 0);
			@Pc(39) int[][] local39 = this.method4634(arg0, 1);
			@Pc(43) int[] local43 = local16[2];
			@Pc(47) int[] local47 = local16[1];
			@Pc(51) int[] local51 = local33[0];
			@Pc(55) int[] local55 = local33[1];
			@Pc(59) int[] local59 = local16[0];
			@Pc(63) int[] local63 = local39[0];
			@Pc(67) int[] local67 = local33[2];
			@Pc(71) int[] local71 = local39[2];
			@Pc(75) int[] local75 = local39[1];
			for (@Pc(77) int local77 = 0; local77 < Static189.anInt4457; local77++) {
				@Pc(88) int local88 = local27[local77];
				if (local88 == 4096) {
					local59[local77] = local51[local77];
					local47[local77] = local55[local77];
					local43[local77] = local67[local77];
				} else if (local88 == 0) {
					local59[local77] = local63[local77];
					local47[local77] = local75[local77];
					local43[local77] = local71[local77];
				} else {
					@Pc(99) int local99 = 4096 - local88;
					local59[local77] = local99 * local63[local77] + local88 * local51[local77] >> 12;
					local47[local77] = local99 * local75[local77] + local55[local77] * local88 >> 12;
					local43[local77] = local71[local77] * local99 + local67[local77] * local88 >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.aBoolean309 = arg1.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] method4626(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass121_41.method3445(arg0);
		if (this.aClass121_41.aBoolean221) {
			@Pc(30) int[] local30 = this.method4624(0, arg0);
			@Pc(36) int[] local36 = this.method4624(1, arg0);
			@Pc(42) int[] local42 = this.method4624(2, arg0);
			for (@Pc(44) int local44 = 0; local44 < Static189.anInt4457; local44++) {
				@Pc(55) int local55 = local42[local44];
				if (local55 == 4096) {
					local11[local44] = local30[local44];
				} else if (local55 == 0) {
					local11[local44] = local36[local44];
				} else {
					local11[local44] = local55 * local30[local44] + (4096 - local55) * local36[local44] >> 12;
				}
			}
		}
		return local11;
	}
}
