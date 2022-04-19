import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public final class Class3_Sub1_Sub31 extends Class3_Sub1 {

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] method4626(@OriginalArg(0) int arg0) {
		return Static173.anIntArray367;
	}
}
