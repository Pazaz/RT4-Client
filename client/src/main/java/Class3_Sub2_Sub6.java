import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class3_Sub2_Sub6 extends SecondaryNode {

	@OriginalMember(owner = "client!cb", name = "L", descriptor = "[I")
	private int[] anIntArray71;

	@OriginalMember(owner = "client!cb", name = "M", descriptor = "[I")
	public int[] anIntArray72;

	@OriginalMember(owner = "client!cb", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!cb", name = "V", descriptor = "[Lclient!na;")
	private JagString[] aClass100Array35;

	@OriginalMember(owner = "client!cb", name = "O", descriptor = "Z")
	public boolean aBoolean60 = true;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!wa;[IZ)V")
	public final void method760(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray71 == null) {
			return;
		}
		for (@Pc(14) int local14 = 0; this.anIntArray71.length > local14 && local14 < arg1.length; local14++) {
			@Pc(38) int local38 = Static143.anIntArray329[this.method765(local14)];
			if (local38 > 0) {
				arg0.pVarLong(local38, (long) arg1[local14]);
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!wa;I)V")
	public final void method761(@OriginalArg(0) Buffer arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.g1();
			if (local9 == 0) {
				return;
			}
			this.method768(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V")
	public final void method763() {
		if (this.anIntArray72 != null) {
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray72.length; local7++) {
				this.anIntArray72[local7] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)I")
	public final int method764(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray71 == null || arg1 < 0 || arg1 > this.anIntArray71.length) {
			return -1;
		} else if (this.anIntArrayArray5[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray5[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray5[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(II)I")
	public final int method765(@OriginalArg(1) int arg0) {
		return this.anIntArray71 == null || arg0 < 0 || arg0 > this.anIntArray71.length ? -1 : this.anIntArray71[arg0];
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)I")
	public final int method767() {
		return this.anIntArray71 == null ? 0 : this.anIntArray71.length;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!wa;II)V")
	private void method768(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aClass100Array35 = arg0.gjstr().method3147(60);
			return;
		}
		@Pc(32) int local32;
		@Pc(42) int local42;
		if (arg1 == 2) {
			local32 = arg0.g1();
			this.anIntArray72 = new int[local32];
			for (local42 = 0; local42 < local32; local42++) {
				this.anIntArray72[local42] = arg0.g2();
			}
		} else if (arg1 == 3) {
			local32 = arg0.g1();
			this.anIntArray71 = new int[local32];
			this.anIntArrayArray5 = new int[local32][];
			for (local42 = 0; local42 < local32; local42++) {
				@Pc(49) int local49 = arg0.g2();
				this.anIntArray71[local42] = local49;
				this.anIntArrayArray5[local42] = new int[Static264.anIntArray412[local49]];
				for (@Pc(64) int local64 = 0; local64 < Static264.anIntArray412[local49]; local64++) {
					this.anIntArrayArray5[local42][local64] = arg0.g2();
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean60 = false;
		}
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)Lclient!na;")
	public final JagString method769() {
		@Pc(15) JagString local15 = Static87.method1804(80);
		if (this.aClass100Array35 == null) {
			return Static202.aClass100_891;
		}
		local15.method3113(this.aClass100Array35[0]);
		for (@Pc(31) int local31 = 1; local31 < this.aClass100Array35.length; local31++) {
			local15.method3113(Static211.aClass100_231);
			local15.method3113(this.aClass100Array35[local31]);
		}
		return local15.method3156();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!wa;)Lclient!na;")
	public final JagString method770(@OriginalArg(1) Buffer arg0) {
		@Pc(17) JagString local17 = Static87.method1804(80);
		if (this.anIntArray71 != null) {
			for (@Pc(22) int local22 = 0; local22 < this.anIntArray71.length; local22++) {
				local17.method3113(this.aClass100Array35[local22]);
				local17.method3113(Static89.method1838(this.anIntArrayArray5[local22], arg0.gVarLong(Static16.anIntArray51[this.anIntArray71[local22]]), this.anIntArray71[local22]));
			}
		}
		local17.method3113(this.aClass100Array35[this.aClass100Array35.length - 1]);
		return local17.method3156();
	}
}
