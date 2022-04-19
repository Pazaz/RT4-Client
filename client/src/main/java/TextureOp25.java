import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class TextureOp25 extends TextureOp {

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
	public TextureOp25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] method4626(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = this.aClass121_41.method3445(arg0);
		if (this.aClass121_41.aBoolean221) {
			Static289.method2614(local9, 0, Static189.anInt4457, Static64.anIntArray153[arg0]);
		}
		return local9;
	}
}
