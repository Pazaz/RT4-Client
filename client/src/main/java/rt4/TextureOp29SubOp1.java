package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class TextureOp29SubOp1 extends TextureOp29SubOp {

	@OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
	private final int anInt1015;

	@OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
	private final int anInt1012;

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
	private final int anInt1010;

	@OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
	private final int anInt1017;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(IIIIII)V")
	public TextureOp29SubOp1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt1015 = arg3;
		this.anInt1012 = arg1;
		this.anInt1010 = arg0;
		this.anInt1017 = arg2;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ILclient!wa;)Lclient!ci;")
	public static TextureOp29SubOp1 create(@OriginalArg(1) Buffer arg0) {
		return new TextureOp29SubOp1(arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.g3(), arg0.g1());
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)V")
	@Override
	public final void method4007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(III)V")
	@Override
	public final void method4013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZI)V")
	@Override
	public final void method4009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt1010 >> 12;
		@Pc(25) int local25 = this.anInt1017 * arg1 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt1012 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt1015 >> 12;
		TextureOp29.method3982(this.anInt5229, local39, local10, local32, local25);
	}
}
