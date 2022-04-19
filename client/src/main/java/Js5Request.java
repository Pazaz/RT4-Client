import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public abstract class Js5Request extends SecondaryNode {

	@OriginalMember(owner = "client!il", name = "L", descriptor = "Z")
	public boolean aBoolean225;

	@OriginalMember(owner = "client!il", name = "T", descriptor = "Z")
	public boolean aBoolean227;

	@OriginalMember(owner = "client!il", name = "P", descriptor = "Z")
	public volatile boolean aBoolean226 = true;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)I")
	public abstract int method3553();

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(Z)[B")
	public abstract byte[] method3554();
}
