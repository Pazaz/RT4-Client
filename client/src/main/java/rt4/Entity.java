package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public abstract class Entity {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)Lclient!th;")
	public Entity createModel() {
		return this;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "()Z")
	public boolean method4543() {
		return false;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!th;IIIZ)V")
	public void method4544(@OriginalArg(0) Entity arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)V")
	public abstract void method4545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIIIJILclient!ga;)V")
	public abstract void render(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) ParticleSystem arg10);

	@OriginalMember(owner = "client!th", name = "b", descriptor = "()I")
	public abstract int getMinY();
}
