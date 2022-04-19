import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class TextureOp29SubOp4 extends TextureOp29SubOp {

	@OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
	private final int anInt5247;

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
	private final int anInt5238;

	@OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
	private final int anInt5246;

	@OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
	private final int anInt5244;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(IIIIIII)V")
	public TextureOp29SubOp4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5247 = arg1;
		this.anInt5238 = arg2;
		this.anInt5246 = arg0;
		this.anInt5244 = arg3;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZI)V")
	@Override
	public final void method4009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5238 >> 12;
		@Pc(17) int local17 = this.anInt5244 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt5246 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt5247 * arg0 >> 12;
		Static247.method4244(this.anInt5229, local24, local31, local10, local17, this.anInt5231);
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(III)V")
	@Override
	public final void method4013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt5246 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt5238 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt5247 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt5244 >> 12;
		Static230.method3950(local10, this.anInt5228, local31, local17, local24);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V")
	@Override
	public final void method4007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 * this.anInt5246 >> 12;
		@Pc(21) int local21 = this.anInt5247 * arg0 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt5238 >> 12;
		@Pc(35) int local35 = this.anInt5244 * arg0 >> 12;
		Static22.method644(this.anInt5231, local35, this.anInt5228, this.anInt5229, local21, local28, local14);
	}
}
