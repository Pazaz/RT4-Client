package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public final class IntNode extends Node {

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
	public int value;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	public IntNode() {
	}

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(I)V")
	public IntNode(@OriginalArg(0) int arg0) {
		this.value = arg0;
	}
}
