import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!ui", name = "Q", descriptor = "I")
	public static int anInt5526;

	@OriginalMember(owner = "client!ui", name = "R", descriptor = "I")
	public static int anInt5527;

	@OriginalMember(owner = "client!ui", name = "T", descriptor = "F")
	public static float aFloat36;

	@OriginalMember(owner = "client!ui", name = "cb", descriptor = "Lclient!ve;")
	public static Js5 aClass153_104;

	@OriginalMember(owner = "client!ui", name = "eb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!ui", name = "mb", descriptor = "F")
	public static float aFloat37;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIZIII)V")
	public static void method4326(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static136.anInt3325++;
		Static210.method3711();
		if (!arg1) {
			Static38.method964(true);
			Static173.method3240(true);
			Static38.method964(false);
		}
		Static173.method3240(false);
		if (!arg1) {
			Static195.method3532();
		}
		Static246.method4239();
		if (GlRenderer.enabled) {
			Static115.method2314(arg3, arg4, arg0, arg2, true);
			arg2 = Static7.anInt983;
			arg4 = Static24.anInt773;
			arg3 = Static166.anInt4055;
			arg0 = Static245.anInt5377;
		}
		@Pc(59) int local59;
		@Pc(57) int local57;
		if (Static227.anInt5096 == 1) {
			local57 = Static230.anInt5161 + Static57.anInt1747 & 0x7FF;
			local59 = Static72.anInt2031;
			if (local59 < Static234.anInt5245 / 256) {
				local59 = Static234.anInt5245 / 256;
			}
			if (Static176.aBooleanArray95[4] && Static276.anIntArray564[4] + 128 > local59) {
				local59 = Static276.anIntArray564[4] + 128;
			}
			Static18.method555(Static81.anInt2223, arg0, Static207.method3685(Static55.level, Static173.self.anInt3412, Static173.self.anInt3421) - 50, 600 - -(local59 * 3), local57, Static111.anInt2900, local59);
		}
		local57 = Static5.anInt40;
		local59 = Static138.anInt3439;
		@Pc(121) int local121 = Static134.anInt3302;
		@Pc(123) int local123 = Static240.anInt5333;
		@Pc(125) int local125 = Static184.anInt4358;
		@Pc(127) int local127;
		@Pc(171) int local171;
		for (local127 = 0; local127 < 5; local127++) {
			if (Static176.aBooleanArray95[local127]) {
				local171 = (int) ((double) -Static222.anIntArray437[local127] + (double) (Static222.anIntArray437[local127] * 2 + 1) * Math.random() + Math.sin((double) Static31.anIntArray76[local127] * ((double) Static202.anIntArray424[local127] / 100.0D)) * (double) Static276.anIntArray564[local127]);
				if (local127 == 3) {
					Static184.anInt4358 = local171 + Static184.anInt4358 & 0x7FF;
				}
				if (local127 == 4) {
					Static240.anInt5333 += local171;
					if (Static240.anInt5333 < 128) {
						Static240.anInt5333 = 128;
					}
					if (Static240.anInt5333 > 383) {
						Static240.anInt5333 = 383;
					}
				}
				if (local127 == 2) {
					Static134.anInt3302 += local171;
				}
				if (local127 == 1) {
					Static5.anInt40 += local171;
				}
				if (local127 == 0) {
					Static138.anInt3439 += local171;
				}
			}
		}
		Static252.method4302();
		if (GlRenderer.enabled) {
			Static46.method1187(arg2, arg4, arg2 + arg3, arg4 - -arg0);
			@Pc(248) float local248 = (float) Static240.anInt5333 * 0.17578125F;
			@Pc(253) float local253 = (float) Static184.anInt4358 * 0.17578125F;
			if (Static227.anInt5096 == 3) {
				local248 = Static146.aFloat15 * 360.0F / 6.2831855F;
				local253 = Static84.aFloat10 * 360.0F / 6.2831855F;
			}
			GlRenderer.method4171(arg2, arg4, arg3, arg0, arg3 / 2 + arg2, arg4 - -(arg0 / 2), local248, local253, Static223.anInt5029, Static223.anInt5029);
		} else {
			Static129.method2496(arg2, arg4, arg3 + arg2, arg0 + arg4);
			Rasteriser.method1908();
		}
		if (Static60.aBoolean108 || Static155.anInt3751 < arg2 || Static155.anInt3751 >= arg3 + arg2 || arg4 > Static60.anInt1892 || arg0 + arg4 <= Static60.anInt1892) {
			Static39.aBoolean77 = false;
			Static2.anInt7 = 0;
		} else {
			Static39.aBoolean77 = true;
			Static2.anInt7 = 0;
			local171 = Static247.anInt5405;
			@Pc(344) int local344 = Static1.anInt4;
			local127 = Static240.anInt5334;
			Static150.anInt3582 = local127 + (local171 - local127) * (-arg2 + Static155.anInt3751) / arg3;
			@Pc(361) int local361 = Static148.anInt3535;
			Static34.anInt1053 = (local361 - local344) * (Static60.anInt1892 - arg4) / arg0 + local344;
		}
		Static107.method2261();
		@Pc(387) byte local387 = Static236.method4047() == 2 ? (byte) Static136.anInt3325 : 1;
		if (GlRenderer.enabled) {
			GlRenderer.method4173();
			GlRenderer.setDepthTestEnabled(true);
			GlRenderer.setFogEnabled(true);
			if (Static244.anInt5370 == 10) {
				local171 = Static103.method2235(Static178.anInt4247, Static134.anInt3302 >> 10, Static113.anInt4609, Static138.anInt3439 >> 10);
			} else {
				local171 = Static103.method2235(Static178.anInt4247, Static173.self.movementQueueZ[0] >> 3, Static113.anInt4609, Static173.self.movementQueueX[0] >> 3);
			}
			Static120.method2394(Static83.anInt372, !Static11.aBoolean15);
			GlRenderer.clearColorAndDepthBuffers(local171);
			Static143.method2731(Static240.anInt5333, Static134.anInt3302, Static5.anInt40, Static138.anInt3439, Static184.anInt4358);
			GlRenderer.anInt5323 = Static83.anInt372;
			Static156.method2954(Static138.anInt3439, Static5.anInt40, Static134.anInt3302, Static240.anInt5333, Static184.anInt4358, Static266.aByteArrayArrayArray15, Static79.anIntArray205, Static149.anIntArray338, Static267.anIntArray518, Static50.anIntArray134, Static243.anIntArray476, Static55.level + 1, local387, Static173.self.anInt3412 >> 7, Static173.self.anInt3421 >> 7);
			Static263.aBoolean299 = true;
			Static120.method2390();
			Static143.method2731(0, 0, 0, 0, 0);
			Static107.method2261();
			Static223.method3858();
			Static142.method2726(arg4, arg3, arg2, Static223.anInt5029, arg0, Static223.anInt5029);
			Static233.method4000(arg3, arg2, arg0, Static223.anInt5029, Static223.anInt5029, arg4);
		} else {
			Static129.method2495(arg2, arg4, arg3, arg0, 0);
			Static156.method2954(Static138.anInt3439, Static5.anInt40, Static134.anInt3302, Static240.anInt5333, Static184.anInt4358, Static266.aByteArrayArrayArray15, Static79.anIntArray205, Static149.anIntArray338, Static267.anIntArray518, Static50.anIntArray134, Static243.anIntArray476, Static55.level + 1, local387, Static173.self.anInt3412 >> 7, Static173.self.anInt3421 >> 7);
			Static107.method2261();
			Static223.method3858();
			Static142.method2726(arg4, arg3, arg2, 256, arg0, 256);
			Static233.method4000(arg3, arg2, arg0, 256, 256, arg4);
		}
		((Js5GlTextureProvider) Rasteriser.anInterface1_2).method3239(Static178.anInt4247);
		Static115.method2310(arg3, arg4, arg0, arg2);
		Static240.anInt5333 = local123;
		Static134.anInt3302 = local121;
		Static5.anInt40 = local57;
		Static138.anInt3439 = local59;
		Static184.anInt4358 = local125;
		if (Static19.aBoolean43 && Static107.js5NetQueue.method2328() == 0) {
			Static19.aBoolean43 = false;
		}
		if (Static19.aBoolean43) {
			if (GlRenderer.enabled) {
				Static46.method1186(arg2, arg4, arg3, arg0, 0);
			} else {
				Static129.method2495(arg2, arg4, arg3, arg0, 0);
			}
			Static114.method4636(false, LocalizedText.LOADING);
		}
		if (!arg1 && !Static19.aBoolean43 && !Static60.aBoolean108 && arg2 <= Static155.anInt3751 && arg3 + arg2 > Static155.anInt3751 && arg4 <= Static60.anInt1892 && arg0 + arg4 > Static60.anInt1892) {
			Static176.method3304(arg4, arg3, arg0, arg2, Static60.anInt1892, Static155.anInt3751);
		}
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(II)I")
	public static int method4328(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZ)Lclient!ml;")
	public static EnumType method4330(@OriginalArg(0) int arg0) {
		@Pc(10) EnumType local10 = (EnumType) Static149.aClass54_10.method1806((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static84.aClass153_35.method4495(Static97.method1959(arg0), Static103.method2236(arg0));
		local10 = new EnumType();
		if (local24 != null) {
			local10.method3094(new Buffer(local24));
		}
		Static149.aClass54_10.method1811(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "(I)[Lclient!ok;")
	public static IndexedSprite[] method4331() {
		@Pc(8) IndexedSprite[] local8 = new IndexedSprite[Static165.anInt4038];
		for (@Pc(10) int local10 = 0; local10 < Static165.anInt4038; local10++) {
			if (GlRenderer.enabled) {
				local8[local10] = new GlIndexedSprite(Static124.anInt3080, Static227.anInt5091, Static274.anIntArray440[local10], Static269.anIntArray252[local10], Static254.anIntArray488[local10], Static26.anIntArray66[local10], Static7.aByteArrayArray5[local10], Static259.anIntArray513);
			} else {
				local8[local10] = new SoftwareIndexedSprite(Static124.anInt3080, Static227.anInt5091, Static274.anIntArray440[local10], Static269.anIntArray252[local10], Static254.anIntArray488[local10], Static26.anIntArray66[local10], Static7.aByteArrayArray5[local10], Static259.anIntArray513);
			}
		}
		Static75.method1631();
		return local8;
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(II)V")
	public static void method4332(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && Static258.aBooleanArray130.length > arg0) {
			Static258.aBooleanArray130[arg0] = !Static258.aBooleanArray130[arg0];
		}
	}
}
