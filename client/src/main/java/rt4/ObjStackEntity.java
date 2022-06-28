package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public final class ObjStackEntity {

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "Lclient!th;")
	public Entity secondary;

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
	public int anInt3057;

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "Lclient!th;")
	public Entity tertiary;

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "Lclient!th;")
	public Entity primary;

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
	public int zFine;

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
	public int anInt3063;

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
	public int xFine;

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "J")
	public long key;
}
