package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public final class LocEntity {

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "Lclient!ek;")
	public SoftwareIndexedSprite sprite;

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "Lclient!th;")
	public Entity model;

}
