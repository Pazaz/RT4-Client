package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class SecondaryHashTable {

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "[Lclient!rg;")
	private final SecondaryNode[] buckets;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(I)V")
	public SecondaryHashTable(@OriginalArg(0) int arg0) {
		this.buckets = new SecondaryNode[arg0];
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			@Pc(23) SecondaryNode local23 = this.buckets[local7] = new SecondaryNode();
			local23.secondaryPrev = local23;
			local23.secondaryNext = local23;
		}
	}
}
