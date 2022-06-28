package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class ProjAnimNode extends SecondaryNode {

	@OriginalMember(owner = "client!ud", name = "R", descriptor = "Lclient!ra;")
	public final ProjAnim value;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!ra;)V")
	public ProjAnimNode(@OriginalArg(0) ProjAnim value) {
		this.value = value;
	}
}
