package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class MaterialManager_Class106_Sub1_Sub1 extends MaterialManager_Class106_Sub1 {

	@OriginalMember(owner = "client!ng", name = "O", descriptor = "[B")
	private byte[] aByteArray58;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	public MaterialManager_Class106_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(III)[B")
	public final byte[] method3215() {
		this.aByteArray58 = new byte[524288];
		this.method3841();
		return this.aByteArray58;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)V")
	@Override
	protected final void method3209(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray58[local10] = (byte) (local7 * 3 >> 5);
		this.aByteArray58[local11] = (byte) (local7 >> 2);
	}
}
