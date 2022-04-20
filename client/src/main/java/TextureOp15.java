import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class TextureOp15 extends TextureOp {

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
	public TextureOp15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IBI)V")
	private void method2382(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static173.anIntArray367[arg1];
		@Pc(17) int local17 = Static64.anIntArray153[arg0];
		@Pc(28) float local28 = (float) Math.atan2((double) (local13 - 2048), (double) (local17 - 2048));
		if ((double) local28 >= -3.141592653589793D && -2.356194490192345D >= (double) local28) {
			Static92.anInt2433 = arg0;
			Static267.anInt5776 = arg1;
		} else if ((double) local28 <= -1.5707963267948966D && -2.356194490192345D <= (double) local28) {
			Static267.anInt5776 = arg0;
			Static92.anInt2433 = arg1;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static267.anInt5776 = Static189.anInt4457 - arg0;
			Static92.anInt2433 = arg1;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static267.anInt5776 = arg1;
			Static92.anInt2433 = Static172.anInt4165 - arg0;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static267.anInt5776 = Static189.anInt4457 - arg1;
			Static92.anInt2433 = Static172.anInt4165 - arg0;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static267.anInt5776 = Static189.anInt4457 - arg0;
			Static92.anInt2433 = Static172.anInt4165 - arg1;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static92.anInt2433 = Static172.anInt4165 - arg1;
			Static267.anInt5776 = arg0;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static267.anInt5776 = Static189.anInt4457 - arg1;
			Static92.anInt2433 = arg0;
		}
		Static267.anInt5776 &= Static34.anInt1060;
		Static92.anInt2433 &= Static141.anInt3473;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.aBoolean309 = arg1.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] method4626(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.aClass121_41.method3445(arg0);
		if (this.aClass121_41.aBoolean221) {
			for (@Pc(26) int local26 = 0; local26 < Static189.anInt4457; local26++) {
				this.method2382(arg0, local26);
				@Pc(40) int[] local40 = this.method4624(0, Static92.anInt2433);
				local19[local26] = local40[Static267.anInt5776];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] method4638(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = this.aClass103_41.method3173(arg0);
		if (this.aClass103_41.aBoolean195) {
			@Pc(28) int[] local28 = local15[0];
			@Pc(32) int[] local32 = local15[2];
			@Pc(36) int[] local36 = local15[1];
			for (@Pc(38) int local38 = 0; local38 < Static189.anInt4457; local38++) {
				this.method2382(arg0, local38);
				@Pc(52) int[][] local52 = this.method4634(Static92.anInt2433, 0);
				local28[local38] = local52[0][Static267.anInt5776];
				local36[local38] = local52[1][Static267.anInt5776];
				local32[local38] = local52[2][Static267.anInt5776];
			}
		}
		return local15;
	}
}
