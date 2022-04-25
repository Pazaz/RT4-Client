package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
	public static int anInt5062;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
	public static int anInt5064 = 0;

	@OriginalMember(owner = "client!sd", name = "V", descriptor = "[I")
	public static final int[] anIntArray443 = new int[100];

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(II)V")
	public static void method3884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Tile local7 = SceneGraph.tiles[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(30) Tile local30 = SceneGraph.tiles[local9][arg0][arg1] = SceneGraph.tiles[local9 + 1][arg0][arg1];
			if (local30 != null) {
				local30.anInt672--;
				for (@Pc(40) int local40 = 0; local40 < local30.anInt662; local40++) {
					@Pc(49) Scenery local49 = local30.aClass31Array1[local40];
					if ((local49.aLong56 >> 29 & 0x3L) == 2L && local49.anInt1701 == arg0 && local49.anInt1696 == arg1) {
						local49.anInt1709--;
					}
				}
			}
		}
		if (SceneGraph.tiles[0][arg0][arg1] == null) {
			SceneGraph.tiles[0][arg0][arg1] = new Tile(0, arg0, arg1);
		}
		SceneGraph.tiles[0][arg0][arg1].aClass3_Sub5_1 = local7;
		SceneGraph.tiles[3][arg0][arg1] = null;
	}

}
