import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class3_Sub9 extends Node {

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "[I")
	public static final int[] anIntArray135 = new int[32];

	@OriginalMember(owner = "client!ea", name = "t", descriptor = "[B")
	public final byte[] aByteArray17;

	static {
		@Pc(10) int local10 = 2;
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			anIntArray135[local12] = local10 - 1;
			local10 += local10;
		}
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([B)V")
	public Class3_Sub9(@OriginalArg(0) byte[] arg0) {
		this.aByteArray17 = arg0;
	}
}
