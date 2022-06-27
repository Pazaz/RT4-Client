package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public abstract class ReferenceNode extends SecondaryNode {

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
	protected ReferenceNode() {
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public abstract Object get();

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)Z")
	public abstract boolean isSoft();
}
