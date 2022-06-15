package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class Js5ResourceProvider {

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	protected Js5ResourceProvider() {
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)Lclient!ii;")
	public abstract Js5Index fetchIndex();

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
	public abstract void prefetchGroup(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)I")
	public abstract int getPercentageComplete(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(II)[B")
	public abstract byte[] fetchGroup(@OriginalArg(0) int arg0);
}
