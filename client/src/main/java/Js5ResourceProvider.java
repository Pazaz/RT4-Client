import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class Js5ResourceProvider {

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	protected Js5ResourceProvider() {
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)Lclient!ii;")
	public abstract Js5Index method521();

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
	public abstract void method522(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)I")
	public abstract int method524(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(II)[B")
	public abstract byte[] method525(@OriginalArg(0) int arg0);
}
