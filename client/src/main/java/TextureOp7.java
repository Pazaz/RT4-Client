import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class TextureOp7 extends TextureOp {

	@OriginalMember(owner = "client!ej", name = "P", descriptor = "Z")
	private boolean aBoolean104 = true;

	@OriginalMember(owner = "client!ej", name = "Y", descriptor = "Z")
	private boolean aBoolean105 = true;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
	public TextureOp7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.aBoolean104 = arg1.g1() == 1;
		} else if (arg0 == 1) {
			this.aBoolean105 = arg1.g1() == 1;
		} else if (arg0 == 2) {
			this.aBoolean309 = arg1.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] method4638(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = this.aClass103_41.method3173(arg0);
		if (this.aClass103_41.aBoolean195) {
			@Pc(39) int[][] local39 = this.method4634(this.aBoolean105 ? Static141.anInt3473 - arg0 : arg0, 0);
			@Pc(43) int[] local43 = local39[0];
			@Pc(47) int[] local47 = local39[2];
			@Pc(51) int[] local51 = local39[1];
			@Pc(55) int[] local55 = local20[1];
			@Pc(59) int[] local59 = local20[2];
			@Pc(63) int[] local63 = local20[0];
			@Pc(68) int local68;
			if (this.aBoolean104) {
				for (local68 = 0; local68 < Static189.anInt4457; local68++) {
					local63[local68] = local43[Static34.anInt1060 - local68];
					local55[local68] = local51[Static34.anInt1060 - local68];
					local59[local68] = local47[Static34.anInt1060 - local68];
				}
			} else {
				for (local68 = 0; local68 < Static189.anInt4457; local68++) {
					local63[local68] = local43[local68];
					local55[local68] = local51[local68];
					local59[local68] = local47[local68];
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] method4626(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = this.aClass121_41.method3445(arg0);
		if (this.aClass121_41.aBoolean221) {
			@Pc(38) int[] local38 = this.method4624(0, this.aBoolean105 ? Static141.anInt3473 - arg0 : arg0);
			if (this.aBoolean104) {
				for (@Pc(51) int local51 = 0; local51 < Static189.anInt4457; local51++) {
					local15[local51] = local38[Static34.anInt1060 - local51];
				}
			} else {
				Static289.method2613(local38, 0, local15, 0, Static189.anInt4457);
			}
		}
		return local15;
	}
}
