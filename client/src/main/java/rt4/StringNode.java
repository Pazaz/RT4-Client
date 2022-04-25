package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public final class StringNode extends Node {

	@OriginalMember(owner = "client!sj", name = "A", descriptor = "Lclient!na;")
	public JagString value;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
	public StringNode() {
	}

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!na;)V")
	public StringNode(@OriginalArg(0) JagString arg0) {
		this.value = arg0;
	}
}
