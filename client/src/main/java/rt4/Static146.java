package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "Z")
	public static boolean aBoolean174 = false;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	public static void method2750(@OriginalArg(0) int arg0) {
		Static235.anInt5276 = arg0;
		for (@Pc(3) int local3 = 0; local3 < SceneGraph.mapSizeX; local3++) {
			for (@Pc(8) int local8 = 0; local8 < SceneGraph.mapSizeZ; local8++) {
				if (SceneGraph.tiles[arg0][local3][local8] == null) {
					SceneGraph.tiles[arg0][local3][local8] = new Tile(arg0, local3, local8);
				}
			}
		}
	}
}
