package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "[I")
	public static int[] anIntArray476 = new int[2];

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!sc;ZLclient!wl;)Lclient!hg;")
	public static GlTile method4212(@OriginalArg(0) HashTable arg0, @OriginalArg(2) FloType arg1) {
		@Pc(23) long local23 = (long) ((arg1.texture + 1 << 16) + arg1.anInt5885) + ((long) arg1.anInt5897 << 56) + ((long) arg1.anInt5889 << 32);
		@Pc(38) GlTile local38 = (GlTile) arg0.get(local23);
		if (local38 == null) {
			local38 = new GlTile(arg1.texture, (float) arg1.anInt5885, true, false, arg1.anInt5889);
			arg0.put(local38, local23);
		}
		return local38;
	}

}
