import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class85 {

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
	public int anInt3318;

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
	public int anInt3323;

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
	public int anInt3327;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!wa;I)V")
	public final void method2651(@OriginalArg(0) Buffer arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.g1();
			if (local9 == 0) {
				return;
			}
			this.method2653(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!wa;II)V")
	private void method2653(@OriginalArg(0) Buffer arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3327 = arg0.g2();
			this.anInt3318 = arg0.g1();
			this.anInt3323 = arg0.g1();
		}
	}
}
