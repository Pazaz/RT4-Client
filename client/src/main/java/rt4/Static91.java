package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!hc", name = "O", descriptor = "[Lclient!pe;")
	public static Class120[] aClass120Array1;

	@OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
	public static int anInt2428;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!na;Z)I")
	public static int method1879(@OriginalArg(0) JagString arg0) {
		if (WorldMap.labels == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < WorldMap.labels.anInt5074; local20++) {
			if (WorldMap.labels.aClass100Array153[local20].method3140(Static101.aClass100_538, Static197.aClass100_872).strEquals(arg0)) {
				return local20;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIILclient!th;Lclient!th;IIIIJ)V")
	public static void method1880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Entity arg4, @OriginalArg(5) Entity arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) WallDecor local6 = new WallDecor();
		local6.key = arg10;
		local6.anInt1390 = arg1 * 128 + 64;
		local6.anInt1393 = arg2 * 128 + 64;
		local6.anInt1391 = arg3;
		local6.aClass8_3 = arg4;
		local6.aClass8_2 = arg5;
		local6.anInt1395 = arg6;
		local6.anInt1388 = arg7;
		local6.anInt1394 = arg8;
		local6.anInt1392 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (SceneGraph.tiles[local46][arg1][arg2] == null) {
				SceneGraph.tiles[local46][arg1][arg2] = new Tile(local46, arg1, arg2);
			}
		}
		SceneGraph.tiles[arg0][arg1][arg2].aClass24_1 = local6;
	}
}
