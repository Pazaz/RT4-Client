package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static130 {

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "[I")
	public static int[] anIntArray299;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "[I")
	public static final int[] anIntArray300 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!ve;I)Lclient!qf;")
	public static Sprite loadSpriteAutoDetect(@OriginalArg(1) Js5 arg0, @OriginalArg(2) int arg1) {
		return SpriteLoader.decode(arg0, arg1) ? SpriteLoader.method1764() : null;
	}
}
