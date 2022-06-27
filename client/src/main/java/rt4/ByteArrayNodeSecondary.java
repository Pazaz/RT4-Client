package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class ByteArrayNodeSecondary extends SecondaryNode {

	@OriginalMember(owner = "client!hc", name = "Q", descriptor = "[B")
	public final byte[] value;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "([B)V")
	public ByteArrayNodeSecondary(@OriginalArg(0) byte[] value) {
		this.value = value;
	}
}
