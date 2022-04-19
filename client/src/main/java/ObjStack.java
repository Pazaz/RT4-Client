import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class ObjStack extends Entity {

	@OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
	public int anInt5550;

	@OriginalMember(owner = "client!uj", name = "D", descriptor = "I")
	public int anInt5555;

	@OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
	private int anInt5553 = -32768;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method4545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIIJILclient!ga;)V")
	@Override
	public final void method4546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) ParticleSystem arg10) {
		@Pc(16) Model local16 = Static71.method1439(this.anInt5555).method1824(-1, 0, null, this.anInt5550, 0);
		if (local16 != null) {
			local16.method4546(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
			this.anInt5553 = local16.method4549();
		}
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "()I")
	@Override
	public final int method4549() {
		return this.anInt5553;
	}
}
