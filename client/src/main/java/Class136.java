import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public final class Class136 {

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "B")
	private byte aByte17;

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
	public int anInt5089;

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
	public int anInt5090;

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
	public int anInt5092;

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
	public int anInt5094;

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
	public int anInt5099;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
	public Class136() {
	}

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!wa;)V")
	public Class136(@OriginalArg(0) Class3_Sub15 arg0) {
		this.aByte17 = arg0.method2186();
		this.anInt5094 = arg0.method2163();
		this.anInt5099 = arg0.method2174();
		this.anInt5090 = arg0.method2174();
		this.anInt5089 = arg0.method2174();
		this.anInt5092 = arg0.method2174();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)I")
	public final int method3904() {
		return this.aByte17 & 0x7;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)I")
	public final int method3905() {
		return (this.aByte17 & 0x8) == 8 ? 1 : 0;
	}
}