package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "Lclient!qf;")
	public static Sprite aClass3_Sub2_Sub1_6;

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "Lclient!na;")
	public static final JagString NULL = JagString.parse("null");

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1881(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 0 || arg3 < 0 || arg5 >= 103 || arg3 >= 103) {
			return;
		}
		@Pc(38) int local38;
		if (arg4 == 0) {
			@Pc(28) Wall local28 = SceneGraph.getWall(arg0, arg5, arg3);
			if (local28 != null) {
				local38 = Integer.MAX_VALUE & (int) (local28.key >>> 32);
				if (arg2 == 2) {
					local28.primary = new Loc(local38, 2, arg1 + 4, arg0, arg5, arg3, arg6, false, local28.primary);
					local28.aClass8_6 = new Loc(local38, 2, arg1 + 1 & 0x3, arg0, arg5, arg3, arg6, false, local28.aClass8_6);
				} else {
					local28.primary = new Loc(local38, arg2, arg1, arg0, arg5, arg3, arg6, false, local28.primary);
				}
			}
		}
		if (arg4 == 1) {
			@Pc(106) WallDecor local106 = SceneGraph.getWallDecor(arg0, arg5, arg3);
			if (local106 != null) {
				local38 = (int) (local106.key >>> 32) & Integer.MAX_VALUE;
				if (arg2 == 4 || arg2 == 5) {
					local106.primary = new Loc(local38, 4, arg1, arg0, arg5, arg3, arg6, false, local106.primary);
				} else if (arg2 == 6) {
					local106.primary = new Loc(local38, 4, arg1 + 4, arg0, arg5, arg3, arg6, false, local106.primary);
				} else if (arg2 == 7) {
					local106.primary = new Loc(local38, 4, (arg1 + 2 & 0x3) + 4, arg0, arg5, arg3, arg6, false, local106.primary);
				} else if (arg2 == 8) {
					local106.primary = new Loc(local38, 4, arg1 + 4, arg0, arg5, arg3, arg6, false, local106.primary);
					local106.aClass8_2 = new Loc(local38, 4, (arg1 + 2 & 0x3) + 4, arg0, arg5, arg3, arg6, false, local106.aClass8_2);
				}
			}
		}
		if (arg4 == 2) {
			if (arg2 == 11) {
				arg2 = 10;
			}
			@Pc(255) Scenery local255 = SceneGraph.getScenery(arg0, arg5, arg3);
			if (local255 != null) {
				local255.primary = new Loc((int) (local255.aLong56 >>> 32) & Integer.MAX_VALUE, arg2, arg1, arg0, arg5, arg3, arg6, false, local255.primary);
			}
		}
		if (arg4 == 3) {
			@Pc(290) GroundDecor local290 = SceneGraph.getGroundDecor(arg0, arg5, arg3);
			if (local290 != null) {
				local290.primary = new Loc(Integer.MAX_VALUE & (int) (local290.aLong26 >>> 32), 22, arg1, arg0, arg5, arg3, arg6, false, local290.primary);
			}
		}
	}

}
