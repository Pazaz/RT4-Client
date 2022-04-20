import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
	public int anInt11;

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
	public int anInt12;

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "Z")
	public boolean aBoolean2 = false;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLclient!wa;I)V")
	public final void method6(@OriginalArg(1) Buffer arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.g1();
			if (local5 == 0) {
				return;
			}
			this.method11(local5, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)Lclient!ek;")
	public final SoftwareIndexedSprite method9(@OriginalArg(0) int arg0) {
		@Pc(17) SoftwareIndexedSprite local17 = (SoftwareIndexedSprite) Static219.aClass99_27.method3106((long) (arg0 << 16 | this.anInt12));
		if (local17 != null) {
			return local17;
		}
		Static250.aClass153_101.method4506(this.anInt12);
		local17 = Static164.method3119(this.anInt12, Static250.aClass153_101);
		if (local17 != null) {
			local17.method1389(Static173.anInt4183, Static85.anInt2262, Static266.anInt5344);
			local17.anInt4279 = local17.anInt4270;
			local17.anInt4276 = local17.anInt4278;
			for (@Pc(59) int local59 = 0; local59 < arg0; local59++) {
				local17.method1395();
			}
			Static219.aClass99_27.method3095(local17, (long) (arg0 << 16 | this.anInt12));
		}
		return local17;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!wa;II)V")
	private void method11(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1) {
			this.anInt12 = arg1.g2();
		} else if (arg0 == 2) {
			this.anInt11 = arg1.g3();
		} else if (arg0 == 3) {
			this.aBoolean2 = true;
		} else if (arg0 == 4) {
			this.anInt12 = -1;
		}
	}
}
