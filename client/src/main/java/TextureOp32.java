import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class TextureOp32 extends TextureOp {

	@OriginalMember(owner = "client!ui", name = "U", descriptor = "[I")
	private int[] anIntArray483;

	@OriginalMember(owner = "client!ui", name = "gb", descriptor = "I")
	private int anInt5535;

	@OriginalMember(owner = "client!ui", name = "ib", descriptor = "I")
	private int anInt5536;

	@OriginalMember(owner = "client!ui", name = "lb", descriptor = "I")
	private int anInt5539 = -1;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
	public TextureOp32() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] method4638(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = this.aClass103_41.method3173(arg0);
		if (this.aClass103_41.aBoolean195 && this.method4327()) {
			@Pc(42) int local42 = (this.anInt5536 == Static172.anInt4165 ? arg0 : this.anInt5536 * arg0 / Static172.anInt4165) * this.anInt5535;
			@Pc(46) int[] local46 = local17[0];
			@Pc(50) int[] local50 = local17[1];
			@Pc(54) int[] local54 = local17[2];
			@Pc(64) int local64;
			@Pc(73) int local73;
			if (Static189.anInt4457 == this.anInt5535) {
				for (local64 = 0; local64 < Static189.anInt4457; local64++) {
					local73 = this.anIntArray483[local42++];
					local54[local64] = (local73 & 0xFF) << 4;
					local50[local64] = local73 >> 4 & 0xFF0;
					local46[local64] = local73 >> 12 & 0xFF0;
				}
			} else {
				for (local64 = 0; local64 < Static189.anInt4457; local64++) {
					local73 = this.anInt5535 * local64 / Static189.anInt4457;
					@Pc(122) int local122 = this.anIntArray483[local42 + local73];
					local54[local64] = (local122 & 0xFF) << 4;
					local50[local64] = local122 >> 4 & 0xFF0;
					local46[local64] = local122 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)Z")
	private boolean method4327() {
		if (this.anIntArray483 != null) {
			return true;
		} else if (this.anInt5539 < 0) {
			return false;
		} else {
			@Pc(22) int local22 = Static189.anInt4457;
			@Pc(24) int local24 = Static172.anInt4165;
			@Pc(34) int local34 = Static37.anInterface1_1.method3233(this.anInt5539) ? 64 : 128;
			this.anIntArray483 = Static37.anInterface1_1.method3235(this.anInt5539);
			this.anInt5536 = local34;
			this.anInt5535 = local34;
			Static10.method348(local24, local22);
			return this.anIntArray483 != null;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt5539 = arg1.g2();
		}
	}

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "(B)V")
	@Override
	public final void method4633() {
		super.method4633();
		this.anIntArray483 = null;
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(B)I")
	@Override
	public final int method4627() {
		return this.anInt5539;
	}
}
