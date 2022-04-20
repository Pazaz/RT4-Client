import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class FloType {

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "Z")
	public boolean aBoolean310 = false;

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "Z")
	public boolean aBoolean311 = true;

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
	public int anInt5892 = -1;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
	public int anInt5885 = 128;

	@OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
	public int anInt5897 = 8;

	@OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
	public int anInt5898 = 16;

	@OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
	public int anInt5894 = -1;

	@OriginalMember(owner = "client!wl", name = "y", descriptor = "Z")
	public boolean aBoolean312 = true;

	@OriginalMember(owner = "client!wl", name = "z", descriptor = "I")
	public int anInt5899 = 0;

	@OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
	public int anInt5889 = 1190717;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILclient!wa;I)V")
	public final void method4669(@OriginalArg(1) Buffer arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.g1();
			if (local5 == 0) {
				return;
			}
			this.method4674(local5, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILclient!wa;I)V")
	private void method4674(@OriginalArg(1) int arg0, @OriginalArg(2) Buffer arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt5899 = Static15.method492(arg1.g3());
		} else if (arg0 == 2) {
			this.anInt5892 = arg1.g1();
		} else if (arg0 == 3) {
			this.anInt5892 = arg1.g2();
			if (this.anInt5892 == 65535) {
				this.anInt5892 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean312 = false;
		} else if (arg0 == 7) {
			this.anInt5894 = Static15.method492(arg1.g3());
		} else if (arg0 == 8) {
			Static26.anInt865 = arg2;
		} else if (arg0 == 9) {
			this.anInt5885 = arg1.g2();
		} else if (arg0 == 10) {
			this.aBoolean311 = false;
		} else if (arg0 == 11) {
			this.anInt5897 = arg1.g1();
		} else if (arg0 == 12) {
			this.aBoolean310 = true;
		} else if (arg0 == 13) {
			this.anInt5889 = arg1.g3();
		} else if (arg0 == 14) {
			this.anInt5898 = arg1.g1();
		}
	}
}
