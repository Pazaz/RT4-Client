package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("signlink!im")
public final class PrivilegedRequest {

	@OriginalMember(owner = "signlink!im", name = "e", descriptor = "Ljava/lang/Object;")
	public volatile Object result;

	@OriginalMember(owner = "signlink!im", name = "f", descriptor = "I")
	public int type;

	@OriginalMember(owner = "signlink!im", name = "b", descriptor = "Lsignlink!im;")
	public PrivilegedRequest next;

	@OriginalMember(owner = "signlink!im", name = "c", descriptor = "Ljava/lang/Object;")
	public Object objectArg;

	@OriginalMember(owner = "signlink!im", name = "a", descriptor = "I")
	public int intArg2;

	@OriginalMember(owner = "signlink!im", name = "g", descriptor = "I")
	public int intArg1;

	@OriginalMember(owner = "signlink!im", name = "d", descriptor = "I")
	public volatile int status = 0;
}
