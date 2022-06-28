package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class ObjStack extends Entity {

	@OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
	public int amount;

	@OriginalMember(owner = "client!uj", name = "D", descriptor = "I")
	public int type;

	@OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
	private int minY = -32768;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method4545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIIJILclient!ga;)V")
	@Override
	public final void render(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) ParticleSystem arg10) {
		@Pc(16) Model local16 = ObjTypeList.get(this.type).getModel(-1, 0, null, this.amount, 0);
		if (local16 != null) {
			local16.render(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
			this.minY = local16.getMinY();
		}
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "()I")
	@Override
	public final int getMinY() {
		return this.minY;
	}
}
