package rt4;

import org.openrs2.deob.annotation.OriginalMember;

// Has no usages.

public final class DeadClass {

	@OriginalMember(owner = "client!ul", name = "I", descriptor = "Lclient!gn;")
	public static final LruHashTable cache = new LruHashTable(4);
}
