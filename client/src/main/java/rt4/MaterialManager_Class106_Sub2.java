package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public class MaterialManager_Class106_Sub2 extends MaterialManager_Class106 {

	@OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
	private int anInt5010;

	@OriginalMember(owner = "client!vd", name = "H", descriptor = "[B")
	private byte[] aByteArray67;

	@OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
	private int anInt5017;

	@OriginalMember(owner = "client!vd", name = "G", descriptor = "[I")
	private final int[] anIntArray441 = new int[this.anInt5008];

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(IIIIIF)V")
	protected MaterialManager_Class106_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < this.anInt5008; local15++) {
			this.anIntArray441[local15] = (short) (Math.pow(arg5, local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V")
	@Override
	protected final void method3848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5010 += arg0 * this.anIntArray441[arg1] >> 12;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	@Override
	protected final void method3844() {
		this.anInt5017 = 0;
		this.anInt5010 = 0;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)V")
	protected void method3853(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray67[this.anInt5017++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	@Override
	protected final void method3842() {
		this.anInt5010 = Math.abs(this.anInt5010);
		if (this.anInt5010 >= 4096) {
			this.anInt5010 = 4095;
		}
		this.method3853(this.anInt5017++, (byte) (this.anInt5010 >> 4));
		this.anInt5010 = 0;
	}
}
