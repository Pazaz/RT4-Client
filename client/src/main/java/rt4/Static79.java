package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 1 || arg4 < 1 || arg1 > 102 || arg4 > 102) {
			return;
		}
		@Pc(39) int local39;
		if (!SceneGraph.allLevelsAreVisible() && (SceneGraph.tileFlags[0][arg1][arg4] & 0x2) == 0) {
			local39 = arg2;
			if ((SceneGraph.tileFlags[arg2][arg1][arg4] & 0x8) != 0) {
				local39 = 0;
			}
			if (local39 != LoginManager.centralPlane) {
				return;
			}
		}
		local39 = arg2;
		if (arg2 < 3 && (SceneGraph.tileFlags[1][arg1][arg4] & 0x2) == 2) {
			local39 = arg2 + 1;
		}
		SceneGraph.method1144(arg4, arg1, arg2, arg6, local39, PathFinder.collisionMaps[arg2]);
		if (arg0 >= 0) {
			@Pc(92) boolean local92 = Preferences.showGroundDecorations;
			Preferences.showGroundDecorations = true;
			SceneGraph.method3397(local39, false, arg2, false, PathFinder.collisionMaps[arg2], arg0, arg5, arg1, arg4, arg3);
			Preferences.showGroundDecorations = local92;
		}
	}

}
