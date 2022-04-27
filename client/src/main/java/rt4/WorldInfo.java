package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public final class WorldInfo {

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
	public int flag;

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "Lclient!na;")
	public JagString name;
}
