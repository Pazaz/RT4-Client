package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIILclient!th;IZJ)Z")
	public static boolean method2256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Entity arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		@Pc(6) boolean local6 = SceneGraph.tileHeights == SceneGraph.underwaterTileHeights;
		@Pc(8) int local8 = 0;
		@Pc(17) int local17;
		for (@Pc(10) int local10 = arg1; local10 < arg1 + arg3; local10++) {
			for (local17 = arg2; local17 < arg2 + arg4; local17++) {
				if (local10 < 0 || local17 < 0 || local10 >= SceneGraph.width || local17 >= SceneGraph.length) {
					return false;
				}
				@Pc(42) Tile local42 = SceneGraph.tiles[arg0][local10][local17];
				if (local42 != null && local42.sceneryLen >= 5) {
					return false;
				}
			}
		}
		@Pc(58) Scenery local58 = new Scenery();
		local58.key = arg11;
		local58.level = arg0;
		local58.anInt1699 = arg5;
		local58.anInt1703 = arg6;
		local58.anInt1706 = arg7;
		local58.entity = arg8;
		local58.anInt1714 = arg9;
		local58.xMin = arg1;
		local58.zMin = arg2;
		local58.xMax = arg1 + arg3 - 1;
		local58.zMax = arg2 + arg4 - 1;
		@Pc(108) int local108;
		for (local17 = arg1; local17 < arg1 + arg3; local17++) {
			for (local108 = arg2; local108 < arg2 + arg4; local108++) {
				@Pc(115) int local115 = 0;
				if (local17 > arg1) {
					local115++;
				}
				if (local17 < arg1 + arg3 - 1) {
					local115 += 4;
				}
				if (local108 > arg2) {
					local115 += 8;
				}
				if (local108 < arg2 + arg4 - 1) {
					local115 += 2;
				}
				for (@Pc(141) int local141 = arg0; local141 >= 0; local141--) {
					if (SceneGraph.tiles[local141][local17][local108] == null) {
						SceneGraph.tiles[local141][local17][local108] = new Tile(local141, local17, local108);
					}
				}
				@Pc(174) Tile local174 = SceneGraph.tiles[arg0][local17][local108];
				local174.scenery[local174.sceneryLen] = local58;
				local174.interiorFlags[local174.sceneryLen] = local115;
				local174.allInteriorFlags |= local115;
				local174.sceneryLen++;
				if (local6 && SceneGraph.anIntArrayArray11[local17][local108] != 0) {
					local8 = SceneGraph.anIntArrayArray11[local17][local108];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local17 = arg1; local17 < arg1 + arg3; local17++) {
				for (local108 = arg2; local108 < arg2 + arg4; local108++) {
					if (SceneGraph.anIntArrayArray11[local17][local108] == 0) {
						SceneGraph.anIntArrayArray11[local17][local108] = local8;
					}
				}
			}
		}
		if (arg10) {
			SceneGraph.scenery[SceneGraph.sceneryLen++] = local58;
		}
		return true;
	}
}
