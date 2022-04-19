import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public final class Class134 {

	@OriginalMember(owner = "client!se", name = "i", descriptor = "I")
	public final int anInt5074;

	@OriginalMember(owner = "client!se", name = "j", descriptor = "[Lclient!na;")
	public final JagString[] aClass100Array153;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "[S")
	public final short[] aShortArray72;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "[I")
	public final int[] anIntArray444;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "[B")
	public final byte[] aByteArray69;

	@OriginalMember(owner = "client!se", name = "q", descriptor = "[S")
	public final short[] aShortArray73;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(I)V")
	public Class134(@OriginalArg(0) int arg0) {
		this.anInt5074 = arg0;
		this.aClass100Array153 = new JagString[this.anInt5074];
		this.aShortArray72 = new short[this.anInt5074];
		this.anIntArray444 = new int[this.anInt5074];
		this.aByteArray69 = new byte[this.anInt5074];
		this.aShortArray73 = new short[this.anInt5074];
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)Z")
	public final boolean method3890(@OriginalArg(0) int arg0) {
		return (this.aByteArray69[arg0] & 0x8) != 0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)Z")
	public final boolean method3892(@OriginalArg(0) int arg0) {
		return (this.aByteArray69[arg0] & 0x4) != 0;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(II)I")
	public final int method3894(@OriginalArg(0) int arg0) {
		return this.aByteArray69[arg0] & 0x3;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(II)Z")
	public final boolean method3897(@OriginalArg(0) int arg0) {
		return (this.aByteArray69[arg0] & 0x10) == 0;
	}
}
