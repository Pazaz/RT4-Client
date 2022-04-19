import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class57 {

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
	public int anInt2431;

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
	public int anInt2432;

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
	public int anInt2436;

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
	public int anInt2437;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	public Class57() {
	}

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class57(@OriginalArg(0) Class57 arg0) {
		this.anInt2432 = arg0.anInt2432;
		this.anInt2437 = arg0.anInt2437;
		this.anInt2431 = arg0.anInt2431;
		this.anInt2436 = arg0.anInt2436;
	}
}
