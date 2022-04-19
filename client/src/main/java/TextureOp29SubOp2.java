import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class TextureOp29SubOp2 extends TextureOp29SubOp {

	@OriginalMember(owner = "client!kc", name = "B", descriptor = "I")
	private final int anInt3168;

	@OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
	private final int anInt3165;

	@OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
	private final int anInt3163;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	private final int anInt3159;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(IIIIIII)V")
	public TextureOp29SubOp2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3168 = arg3;
		this.anInt3165 = arg0;
		this.anInt3163 = arg1;
		this.anInt3159 = arg2;
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(III)V")
	@Override
	public final void method4013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt3165 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt3159 >> 12;
		@Pc(24) int local24 = this.anInt3163 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt3168 * arg1 >> 12;
		Static165.method3163(this.anInt5228, local31, local10, local24, local17);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZI)V")
	@Override
	public final void method4009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V")
	@Override
	public final void method4007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt3165 >> 12;
		@Pc(23) int local23 = this.anInt3168 * arg0 >> 12;
		@Pc(30) int local30 = this.anInt3163 * arg0 >> 12;
		@Pc(37) int local37 = this.anInt3159 * arg1 >> 12;
		Static74.method1623(this.anInt5231, local6, local30, local23, this.anInt5229, this.anInt5228, local37);
	}
}
