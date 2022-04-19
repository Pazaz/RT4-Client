import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class ProjAnimNode extends SecondaryNode {

	@OriginalMember(owner = "client!ud", name = "R", descriptor = "Lclient!ra;")
	public final ProjAnim aClass8_Sub6_1;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!ra;)V")
	public ProjAnimNode(@OriginalArg(0) ProjAnim arg0) {
		this.aClass8_Sub6_1 = arg0;
	}
}
