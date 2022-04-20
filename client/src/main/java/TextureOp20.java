import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class TextureOp20 extends TextureOp {

	@OriginalMember(owner = "client!mi", name = "bb", descriptor = "I")
	private int anInt3894;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(I)V")
	private TextureOp20(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt3894 = 4096;
		this.anInt3894 = arg0;
	}

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public TextureOp20() {
		this(4096);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt3894 = (arg1.g1() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] method4626(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass121_41.method3445(arg0);
		if (this.aClass121_41.aBoolean221) {
			Static289.method2614(local17, 0, Static189.anInt4457, this.anInt3894);
		}
		return local17;
	}
}
