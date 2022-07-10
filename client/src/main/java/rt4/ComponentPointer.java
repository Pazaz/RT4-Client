package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public final class ComponentPointer extends Node {

	@OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
	public int interfaceId;

	@OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
	public int anInt5879;
}
