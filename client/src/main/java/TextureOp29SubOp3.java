import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class TextureOp29SubOp3 extends TextureOp29SubOp {

	@OriginalMember(owner = "client!re", name = "x", descriptor = "I")
	private final int anInt4850;

	@OriginalMember(owner = "client!re", name = "A", descriptor = "I")
	private final int anInt4853;

	@OriginalMember(owner = "client!re", name = "v", descriptor = "I")
	private final int anInt4849;

	@OriginalMember(owner = "client!re", name = "s", descriptor = "I")
	private final int anInt4846;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "I")
	private final int anInt4842;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "I")
	private final int anInt4845;

	@OriginalMember(owner = "client!re", name = "m", descriptor = "I")
	private final int anInt4841;

	@OriginalMember(owner = "client!re", name = "C", descriptor = "I")
	private final int anInt4854;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public TextureOp29SubOp3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt4850 = arg1;
		this.anInt4853 = arg6;
		this.anInt4849 = arg4;
		this.anInt4846 = arg0;
		this.anInt4842 = arg7;
		this.anInt4845 = arg5;
		this.anInt4841 = arg3;
		this.anInt4854 = arg2;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZI)V")
	@Override
	public final void method4009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt4846 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt4854 >> 12;
		@Pc(24) int local24 = this.anInt4841 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt4850 * arg0 >> 12;
		@Pc(38) int local38 = this.anInt4849 * arg1 >> 12;
		@Pc(45) int local45 = arg0 * this.anInt4845 >> 12;
		@Pc(52) int local52 = this.anInt4853 * arg1 >> 12;
		@Pc(65) int local65 = arg0 * this.anInt4842 >> 12;
		Static181.method3340(local17, local52, local45, local65, local31, local6, local38, local24, this.anInt5229);
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(III)V")
	@Override
	public final void method4013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III)V")
	@Override
	public final void method4007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
