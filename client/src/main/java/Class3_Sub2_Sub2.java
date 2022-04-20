import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class3_Sub2_Sub2 extends SecondaryNode {

	@OriginalMember(owner = "client!bc", name = "O", descriptor = "[I")
	public int[] anIntArray29;

	@OriginalMember(owner = "client!bc", name = "P", descriptor = "[I")
	public int[] anIntArray30;

	@OriginalMember(owner = "client!bc", name = "T", descriptor = "[I")
	public int[] anIntArray31;

	@OriginalMember(owner = "client!bc", name = "Y", descriptor = "Lclient!na;")
	public JagString aClass100_79;

	@OriginalMember(owner = "client!bc", name = "ab", descriptor = "[I")
	public int[] anIntArray32;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
	public final void method465() {
		@Pc(8) int local8;
		if (this.anIntArray32 != null) {
			for (local8 = 0; local8 < this.anIntArray32.length; local8++) {
				this.anIntArray32[local8] |= 0x8000;
			}
		}
		if (this.anIntArray30 != null) {
			for (local8 = 0; local8 < this.anIntArray30.length; local8++) {
				this.anIntArray30[local8] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(II)I")
	public final int method466(@OriginalArg(0) int arg0) {
		if (this.anIntArray32 == null) {
			return -1;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray32.length; local13++) {
			if (arg0 == this.anIntArray29[local13]) {
				return this.anIntArray32[local13];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!wa;II)V")
	private void method467(@OriginalArg(0) Buffer arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aClass100_79 = arg0.gjstr();
			return;
		}
		@Pc(28) int local28;
		@Pc(38) int local38;
		if (arg1 == 2) {
			local28 = arg0.g1();
			this.anIntArray30 = new int[local28];
			this.anIntArray31 = new int[local28];
			for (local38 = 0; local38 < local28; local38++) {
				this.anIntArray30[local38] = arg0.g2();
				this.anIntArray31[local38] = Static229.method3933(arg0.g1s());
			}
		} else if (arg1 == 3) {
			local28 = arg0.g1();
			this.anIntArray32 = new int[local28];
			this.anIntArray29 = new int[local28];
			for (local38 = 0; local38 < local28; local38++) {
				this.anIntArray32[local38] = arg0.g2();
				this.anIntArray29[local38] = Static229.method3933(arg0.g1s());
			}
		} else if (arg1 == 4) {
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)I")
	public final int method469(@OriginalArg(1) int arg0) {
		if (this.anIntArray30 == null) {
			return -1;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray30.length; local21++) {
			if (this.anIntArray31[local21] == arg0) {
				return this.anIntArray30[local21];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!wa;B)V")
	public final void method470(@OriginalArg(0) Buffer arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.g1();
			if (local12 == 0) {
				return;
			}
			this.method467(arg0, local12);
		}
	}
}
