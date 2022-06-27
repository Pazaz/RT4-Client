package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class SecondaryNode extends Node {

	@OriginalMember(owner = "client!rg", name = "v", descriptor = "J")
	public long secondaryKey;

	@OriginalMember(owner = "client!rg", name = "w", descriptor = "Lclient!rg;")
	public SecondaryNode secondaryPrev;

	@OriginalMember(owner = "client!rg", name = "G", descriptor = "Lclient!rg;")
	public SecondaryNode secondaryNext;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(B)V")
	public final void unlinkSecondary() {
		if (this.secondaryPrev != null) {
			this.secondaryPrev.secondaryNext = this.secondaryNext;
			this.secondaryNext.secondaryPrev = this.secondaryPrev;
			this.secondaryNext = null;
			this.secondaryPrev = null;
		}
	}
}
