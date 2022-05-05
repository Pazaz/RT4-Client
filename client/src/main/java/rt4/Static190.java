package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZIII)Lclient!qf;")
	public static Sprite method3443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(27) int local27 = (arg2 ? 65536 : 0) + arg1 + (arg0 << 17) + (arg4 << 19);
		@Pc(37) long local37 = (long) local27 * 3849834839L + (long) arg3 * 3147483667L;
		@Pc(43) Sprite local43 = (Sprite) ObjTypeList.objectSpriteCache.get(local37);
		if (local43 != null) {
			return local43;
		}
		Rasteriser.textureHasTransparency = false;
		local43 = Static164.method3150(arg4, false, arg1, arg2, arg0, arg3, false);
		if (local43 != null && !Rasteriser.textureHasTransparency) {
			ObjTypeList.objectSpriteCache.put(local43, local37);
		}
		return local43;
	}

}
