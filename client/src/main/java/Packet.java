import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Packet extends Buffer {

	@OriginalMember(owner = "client!i", name = "Xb", descriptor = "Lclient!ij;")
	private IsaacRandom aClass71_1;

	@OriginalMember(owner = "client!i", name = "fc", descriptor = "I")
	private int anInt2846;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(I)V")
	public Packet(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!i", name = "q", descriptor = "(B)V")
	public final void method2233() {
		this.anInt2846 = this.offset * 8;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BI[BI)V")
	public final void method2237(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(17) int local17 = 0; local17 < arg1; local17++) {
			arg0[local17] = (byte) (this.data[this.offset++] - this.aClass71_1.method2295());
		}
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "(BI)I")
	public final int method2238(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = this.anInt2846 >> 3;
		@Pc(14) int local14 = 8 - (this.anInt2846 & 0x7);
		@Pc(16) int local16 = 0;
		this.anInt2846 += arg0;
		while (local14 < arg0) {
			local16 += (Static18.anIntArray57[local14] & this.data[local6++]) << arg0 - local14;
			arg0 -= local14;
			local14 = 8;
		}
		if (local14 == arg0) {
			local16 += this.data[local6] & Static18.anIntArray57[local14];
		} else {
			local16 += this.data[local6] >> local14 - arg0 & Static18.anIntArray57[arg0];
		}
		return local16;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([IZ)V")
	public final void method2240(@OriginalArg(0) int[] arg0) {
		this.aClass71_1 = new IsaacRandom(arg0);
	}

	@OriginalMember(owner = "client!i", name = "q", descriptor = "(II)I")
	public final int method2241(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt2846;
	}

	@OriginalMember(owner = "client!i", name = "r", descriptor = "(II)V")
	public final void p1isaac(@OriginalArg(1) int arg0) {
		this.data[this.offset++] = (byte) (arg0 + this.aClass71_1.method2295());
	}

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)I")
	public final int method2243() {
		return this.data[this.offset++] - this.aClass71_1.method2295() & 0xFF;
	}

	@OriginalMember(owner = "client!i", name = "h", descriptor = "(Z)V")
	public final void method2244() {
		this.offset = (this.anInt2846 + 7) / 8;
	}
}
