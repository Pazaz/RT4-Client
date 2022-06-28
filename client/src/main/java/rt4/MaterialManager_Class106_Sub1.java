package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class MaterialManager_Class106_Sub1 extends MaterialManager_Class106 {

	@OriginalMember(owner = "client!we", name = "B", descriptor = "I")
	private int anInt4135;

	@OriginalMember(owner = "client!we", name = "D", descriptor = "I")
	private int anInt4137;

	@OriginalMember(owner = "client!we", name = "F", descriptor = "[B")
	private byte[] aByteArray57;

	@OriginalMember(owner = "client!we", name = "J", descriptor = "I")
	private int anInt4141;

	@OriginalMember(owner = "client!we", name = "L", descriptor = "I")
	private int anInt4143;

	@OriginalMember(owner = "client!we", name = "A", descriptor = "I")
	private final int anInt4134;

	@OriginalMember(owner = "client!we", name = "G", descriptor = "I")
	private final int anInt4139;

	@OriginalMember(owner = "client!we", name = "z", descriptor = "I")
	private final int anInt4133;

	@OriginalMember(owner = "client!we", name = "u", descriptor = "I")
	private int anInt4129;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected MaterialManager_Class106_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt4134 = (int) (arg7 * 4096.0F);
		this.anInt4139 = (int) (arg6 * 4096.0F);
		this.anInt4129 = this.anInt4133 = (int) (Math.pow(0.5D, -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)V")
	protected void method3209(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray57[arg0] = arg1;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
	@Override
	protected final void method3842() {
		this.anInt4129 = this.anInt4133;
		this.anInt4143 >>= 0x4;
		if (this.anInt4143 < 0) {
			this.anInt4143 = 0;
		} else if (this.anInt4143 > 255) {
			this.anInt4143 = 255;
		}
		this.method3209(this.anInt4141++, (byte) this.anInt4143);
		this.anInt4143 = 0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V")
	@Override
	protected final void method3848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4135 = 4096;
			this.anInt4137 = this.anInt4139 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt4137 = this.anInt4137 * this.anInt4137 >> 12;
			this.anInt4143 = this.anInt4137;
			return;
		}
		this.anInt4135 = this.anInt4134 * this.anInt4137 >> 12;
		if (this.anInt4135 < 0) {
			this.anInt4135 = 0;
		} else if (this.anInt4135 > 4096) {
			this.anInt4135 = 4096;
		}
		this.anInt4137 = this.anInt4139 - (arg0 >= 0 ? arg0 : -arg0);
		this.anInt4137 = this.anInt4137 * this.anInt4137 >> 12;
		this.anInt4137 = this.anInt4137 * this.anInt4135 >> 12;
		this.anInt4143 += this.anInt4129 * this.anInt4137 >> 12;
		this.anInt4129 = this.anInt4133 * this.anInt4129 >> 12;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	@Override
	protected final void method3844() {
		this.anInt4141 = 0;
		this.anInt4143 = 0;
	}
}
