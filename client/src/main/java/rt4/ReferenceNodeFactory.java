package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public abstract class ReferenceNodeFactory {

	@OriginalMember(owner = "client!uh", name = "ab", descriptor = "Lclient!q;")
	public static final ReferenceNodeFactory SOFT_REFERENCE_NODE_FACTORY = createSoftReferenceNodeFactory();

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)Lclient!q;")
	public static ReferenceNodeFactory createSoftReferenceNodeFactory() {
		try {
			return new SoftReferenceNodeFactory();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!gf;I)Lclient!gf;")
	public abstract ReferenceNode create(@OriginalArg(0) ReferenceNode arg0);
}
