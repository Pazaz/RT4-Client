package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public final class LongNode extends Node {

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "J")
	public long value;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(J)V")
	public LongNode(@OriginalArg(0) long arg0) {
		this.value = arg0;
	}
}
