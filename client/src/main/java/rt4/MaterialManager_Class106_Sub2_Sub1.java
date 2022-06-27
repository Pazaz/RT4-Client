package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class MaterialManager_Class106_Sub2_Sub1 extends MaterialManager_Class106_Sub2 {

	@OriginalMember(owner = "client!sb", name = "I", descriptor = "[B")
	private byte[] aByteArray68;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
	public MaterialManager_Class106_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)V")
	@Override
	protected final void method3853(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray68[local15] = local12;
		this.aByteArray68[local16] = local12;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(III)[B")
	public final byte[] method3854() {
		this.aByteArray68 = new byte[524288];
		this.method3841();
		return this.aByteArray68;
	}
}
