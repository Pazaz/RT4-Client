package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!gf", name = "K", descriptor = "I")
	public static int anInt4696;

	@OriginalMember(owner = "client!gf", name = "M", descriptor = "I")
	public static int anInt4698;

	@OriginalMember(owner = "client!gf", name = "O", descriptor = "[[[I")
	public static int[][][] underWaterTileHeightMap;

	@OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
	public static int centralZoneX;

	@OriginalMember(owner = "client!gf", name = "S", descriptor = "[I")
	public static final int[] anIntArray419 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BII)V")
	public static void method3616(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		WorldMap.anInt3482 = arg0 - WorldMap.originX;
		@Pc(24) int local24 = WorldMap.anInt3482 - (int) ((float) WorldMap.component.anInt445 / WorldMap.zoom);
		@Pc(33) int local33 = WorldMap.anInt3482 + (int) ((float) WorldMap.component.anInt445 / WorldMap.zoom);
		if (local24 < 0) {
			WorldMap.anInt3482 = (int) ((float) WorldMap.component.anInt445 / WorldMap.zoom);
		}
		WorldMap.anInt4901 = WorldMap.length + WorldMap.originZ - arg1 - 1;
		@Pc(61) int local61 = (int) ((float) WorldMap.component.anInt459 / WorldMap.zoom) + WorldMap.anInt4901;
		@Pc(70) int local70 = WorldMap.anInt4901 - (int) ((float) WorldMap.component.anInt459 / WorldMap.zoom);
		if (local33 > WorldMap.width) {
			WorldMap.anInt3482 = WorldMap.width - (int) ((float) WorldMap.component.anInt445 / WorldMap.zoom);
		}
		if (local70 < 0) {
			WorldMap.anInt4901 = (int) ((float) WorldMap.component.anInt459 / WorldMap.zoom);
		}
		if (WorldMap.length < local61) {
			WorldMap.anInt4901 = WorldMap.length - (int) ((float) WorldMap.component.anInt459 / WorldMap.zoom);
		}
	}

}
