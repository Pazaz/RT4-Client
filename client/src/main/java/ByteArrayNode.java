import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class ByteArrayNode extends SecondaryNode {

	@OriginalMember(owner = "client!hc", name = "Q", descriptor = "[B")
	public final byte[] aByteArray37;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "([B)V")
	public ByteArrayNode(@OriginalArg(0) byte[] arg0) {
		this.aByteArray37 = arg0;
	}
}
