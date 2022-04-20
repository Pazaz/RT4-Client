import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class63 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
	public int anInt2850;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
	public int anInt2852;

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
	private int anInt2857;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)Lclient!mm;")
	public final SoftwareSprite method2246() {
		@Pc(7) SoftwareSprite local7 = (SoftwareSprite) Static7.aClass99_5.method3106((long) this.anInt2857);
		if (local7 != null) {
			return local7;
		}
		local7 = Static80.method3613(Static243.aClass153_97, this.anInt2857);
		if (local7 != null) {
			Static7.aClass99_5.method3095(local7, (long) this.anInt2857);
		}
		return local7;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!wa;IB)V")
	public final void method2249(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(18) int local18 = arg0.g1();
			if (local18 == 0) {
				return;
			}
			this.method2250(arg1, local18, arg0);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIILclient!wa;)V")
	private void method2250(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Buffer arg2) {
		if (arg1 == 1) {
			this.anInt2857 = arg2.g2();
		} else if (arg1 == 2) {
			this.anInt2852 = arg2.g1();
			this.anInt2850 = arg2.g1();
		}
	}
}
