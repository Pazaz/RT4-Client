import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class VarbitType {

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
	public int startBit;

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
	public int endBit;

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
	public int baseVar;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!wa;I)V")
	public final void decode(@OriginalArg(0) Buffer arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.g1();
			if (local9 == 0) {
				return;
			}
			this.decode(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!wa;II)V")
	private void decode(@OriginalArg(0) Buffer arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.baseVar = arg0.g2();
			this.startBit = arg0.g1();
			this.endBit = arg0.g1();
		}
	}
}
