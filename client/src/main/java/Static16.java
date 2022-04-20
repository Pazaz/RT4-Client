import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "Lclient!ve;")
	public static Js5 aClass153_9;

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
	public static int anInt548 = -1;

	@OriginalMember(owner = "client!bf", name = "C", descriptor = "[I")
	public static final int[] anIntArray51 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
	public static int anInt549 = -1;

	@OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
	public static int anInt551 = 0;

	@OriginalMember(owner = "client!bf", name = "I", descriptor = "[I")
	public static final int[] anIntArray52 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
	public static void method501() {
		if (!GlRenderer.enabled || Static231.aBoolean252) {
			return;
		}
		@Pc(14) Tile[][][] local14 = Static130.aClass3_Sub5ArrayArrayArray1;
		for (@Pc(22) int local22 = 0; local22 < local14.length; local22++) {
			@Pc(30) Tile[][] local30 = local14[local22];
			for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
				for (@Pc(42) int local42 = 0; local42 < local30[local32].length; local42++) {
					@Pc(54) Tile local54 = local30[local32][local42];
					if (local54 != null) {
						@Pc(71) GlModel local71;
						if (local54.aClass15_1 != null && local54.aClass15_1.aClass8_1 instanceof GlModel) {
							local71 = (GlModel) local54.aClass15_1.aClass8_1;
							if ((local54.aClass15_1.aLong26 & Long.MIN_VALUE) == 0L) {
								local71.method4111(false, true, true, false, true, true);
							} else {
								local71.method4111(true, true, true, true, true, true);
							}
						}
						if (local54.aClass24_1 != null) {
							if (local54.aClass24_1.aClass8_3 instanceof GlModel) {
								local71 = (GlModel) local54.aClass24_1.aClass8_3;
								if ((local54.aClass24_1.aLong52 & Long.MIN_VALUE) == 0L) {
									local71.method4111(false, true, true, false, true, true);
								} else {
									local71.method4111(true, true, true, true, true, true);
								}
							}
							if (local54.aClass24_1.aClass8_2 instanceof GlModel) {
								local71 = (GlModel) local54.aClass24_1.aClass8_2;
								if ((Long.MIN_VALUE & local54.aClass24_1.aLong52) == 0L) {
									local71.method4111(false, true, true, false, true, true);
								} else {
									local71.method4111(true, true, true, true, true, true);
								}
							}
						}
						if (local54.aClass77_1 != null) {
							if (local54.aClass77_1.aClass8_5 instanceof GlModel) {
								local71 = (GlModel) local54.aClass77_1.aClass8_5;
								if ((local54.aClass77_1.aLong107 & Long.MIN_VALUE) == 0L) {
									local71.method4111(false, true, true, false, true, true);
								} else {
									local71.method4111(true, true, true, true, true, true);
								}
							}
							if (local54.aClass77_1.aClass8_6 instanceof GlModel) {
								local71 = (GlModel) local54.aClass77_1.aClass8_6;
								if ((Long.MIN_VALUE & local54.aClass77_1.aLong107) == 0L) {
									local71.method4111(false, true, true, false, true, true);
								} else {
									local71.method4111(true, true, true, true, true, true);
								}
							}
						}
						for (@Pc(270) int local270 = 0; local270 < local54.anInt662; local270++) {
							if (local54.aClass31Array1[local270].aClass8_4 instanceof GlModel) {
								@Pc(293) GlModel local293 = (GlModel) local54.aClass31Array1[local270].aClass8_4;
								if ((Long.MIN_VALUE & local54.aClass31Array1[local270].aLong56) == 0L) {
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
