package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class Node {

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "J")
	public long key;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "Lclient!ab;")
	public Node aClass3_222;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "Lclient!ab;")
	public Node aClass3_223;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Z")
	public final boolean isLinked() {
		return this.aClass3_223 != null;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	public final void unlink() {
		if (this.aClass3_223 != null) {
			this.aClass3_223.aClass3_222 = this.aClass3_222;
			this.aClass3_222.aClass3_223 = this.aClass3_223;
			this.aClass3_223 = null;
			this.aClass3_222 = null;
		}
	}
}
