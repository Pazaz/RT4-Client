package rt4;

import org.openrs2.deob.annotation.OriginalMember;

public final class Static11 {

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V")
	public static void clearNpcHeadCache() {
		NpcTypeList.headModels.clear();
	}

}
