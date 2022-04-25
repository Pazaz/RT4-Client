package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public abstract class AbstractWorld {

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
	public int country;

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
	public int players;

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
	public int flags;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)Z")
	public final boolean isMembers() {
		return (this.flags & 0x1) != 0;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)Z")
	public final boolean isPvp() {
		return (this.flags & 0x4) != 0;
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)Z")
	public final boolean isLootShare() {
		return (this.flags & 0x8) != 0;
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)Z")
	public final boolean isQuickChat() {
		return (this.flags & 0x2) != 0;
	}
}
