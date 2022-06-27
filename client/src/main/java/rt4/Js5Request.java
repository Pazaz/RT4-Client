package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public abstract class Js5Request extends SecondaryNode {

	@OriginalMember(owner = "client!il", name = "L", descriptor = "Z")
	public boolean urgent;

	@OriginalMember(owner = "client!il", name = "T", descriptor = "Z")
	public boolean orphan;

	@OriginalMember(owner = "client!il", name = "P", descriptor = "Z")
	public volatile boolean incomplete = true;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)I")
	public abstract int getPercentageComplete();

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(Z)[B")
	public abstract byte[] getData();
}
