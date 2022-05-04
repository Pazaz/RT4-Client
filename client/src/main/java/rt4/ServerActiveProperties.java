package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public final class ServerActiveProperties extends Node {

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
	public final int anInt540;

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
	public final int accessMask;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(II)V")
	public ServerActiveProperties(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt540 = arg1;
		this.accessMask = arg0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)Z")
	public final boolean method503(@OriginalArg(0) int arg0) {
		return (this.accessMask >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)Z")
	public final boolean isObjReplaceEnabled() {
		return (this.accessMask >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(B)I")
	public final int method505() {
		return this.accessMask >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)Z")
	public final boolean method506() {
		return (this.accessMask & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)Z")
	public final boolean method507() {
		return (this.accessMask >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "(I)Z")
	public final boolean method508() {
		return (this.accessMask >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)Z")
	public final boolean method509() {
		return (this.accessMask >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "(I)Z")
	public final boolean isObjOpsEnabled() {
		return (this.accessMask >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(B)Z")
	public final boolean method511() {
		return (this.accessMask >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "(I)I")
	public final int getTargetMask() {
		return Static199.method3594(this.accessMask);
	}
}
