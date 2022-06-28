package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public final class ByteArrayNode extends Node {

	@OriginalMember(owner = "client!ea", name = "t", descriptor = "[B")
	public final byte[] value;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([B)V")
	public ByteArrayNode(@OriginalArg(0) byte[] value) {
		this.value = value;
	}
}
