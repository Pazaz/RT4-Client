package rt4;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
	public static int anInt548 = -1;

	@OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
	public static int anInt551 = 0;

	@OriginalMember(owner = "client!bf", name = "I", descriptor = "[I")
	public static final int[] anIntArray52 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
	public static void method501() {
		if (!GlRenderer.enabled || Static231.aBoolean252) {
			return;
		}
		@Pc(14) Tile[][][] local14 = SceneGraph.tiles;
		for (@Pc(22) int local22 = 0; local22 < local14.length; local22++) {
			@Pc(30) Tile[][] local30 = local14[local22];
			for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
				for (@Pc(42) int local42 = 0; local42 < local30[local32].length; local42++) {
					@Pc(54) Tile local54 = local30[local32][local42];
					if (local54 != null) {
						@Pc(71) GlModel local71;
						if (local54.groundDecor != null && local54.groundDecor.entity instanceof GlModel) {
							local71 = (GlModel) local54.groundDecor.entity;
							if ((local54.groundDecor.key & Long.MIN_VALUE) == 0L) {
								local71.method4111(false, true, true, false, true, true);
							} else {
								local71.method4111(true, true, true, true, true, true);
							}
						}
						if (local54.wallDecor != null) {
							if (local54.wallDecor.primary instanceof GlModel) {
								local71 = (GlModel) local54.wallDecor.primary;
								if ((local54.wallDecor.key & Long.MIN_VALUE) == 0L) {
									local71.method4111(false, true, true, false, true, true);
								} else {
									local71.method4111(true, true, true, true, true, true);
								}
							}
							if (local54.wallDecor.secondary instanceof GlModel) {
								local71 = (GlModel) local54.wallDecor.secondary;
								if ((Long.MIN_VALUE & local54.wallDecor.key) == 0L) {
									local71.method4111(false, true, true, false, true, true);
								} else {
									local71.method4111(true, true, true, true, true, true);
								}
							}
						}
						if (local54.wall != null) {
							if (local54.wall.primary instanceof GlModel) {
								local71 = (GlModel) local54.wall.primary;
								if ((local54.wall.key & Long.MIN_VALUE) == 0L) {
									local71.method4111(false, true, true, false, true, true);
								} else {
									local71.method4111(true, true, true, true, true, true);
								}
							}
							if (local54.wall.secondary instanceof GlModel) {
								local71 = (GlModel) local54.wall.secondary;
								if ((Long.MIN_VALUE & local54.wall.key) == 0L) {
									local71.method4111(false, true, true, false, true, true);
								} else {
									local71.method4111(true, true, true, true, true, true);
								}
							}
						}
						for (@Pc(270) int local270 = 0; local270 < local54.sceneryLen; local270++) {
							if (local54.scenery[local270].entity instanceof GlModel) {
								@Pc(293) GlModel local293 = (GlModel) local54.scenery[local270].entity;
								if ((Long.MIN_VALUE & local54.scenery[local270].key) == 0L) {
									local293.method4111(false, true, true, false, true, true);
								} else {
									local293.method4111(true, true, true, true, true, true);
								}
							}
						}
					}
				}
			}
		}
		Static231.aBoolean252 = true;
	}
}
