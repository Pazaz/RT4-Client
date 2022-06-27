package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class SoftReferenceNodeFactory extends ReferenceNodeFactory {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!gf;I)Lclient!gf;")
	@Override
	public final ReferenceNode create(@OriginalArg(0) ReferenceNode arg0) {
		return new SoftReferenceNode(arg0.get());
	}
}
