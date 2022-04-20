import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class HardReferenceNode extends ReferenceNode {

	@OriginalMember(owner = "client!he", name = "X", descriptor = "Ljava/lang/Object;")
	private final Object anObject3;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public HardReferenceNode(@OriginalArg(0) Object arg0) {
		this.anObject3 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public final Object method3618() {
		return this.anObject3;
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method3619() {
		return false;
	}
}
