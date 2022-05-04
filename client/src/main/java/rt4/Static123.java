package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
	public static int anInt3058 = 0;

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "Lclient!na;")
	public static final JagString aClass100_593 = JagString.parse(" (X");

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "Z")
	public static boolean aBoolean155 = false;

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "Lclient!na;")
	public static final JagString aClass100_594 = JagString.parse("<)4col>");
	@OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
	public static int anInt3947;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V")
	public static void topBannerRefresh() {
		if (!client.advertSuppressed && client.modeWhere != 2) {
			try {
				Static206.aClass100_900.browserControlCall(client.instance);
			} catch (@Pc(26) Throwable local26) {
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "()V")
	public static void method2419() {
		Static215.anInt4870 = 0;
		label194: for (@Pc(3) int local3 = 0; local3 < Static28.anInt917; local3++) {
			@Pc(10) Class120 local10 = Static91.aClass120Array1[local3];
			@Pc(14) int local14;
			if (Static8.anIntArray8 != null) {
				for (local14 = 0; local14 < Static8.anIntArray8.length; local14++) {
					if (Static8.anIntArray8[local14] != -1000000 && (local10.anInt4444 <= Static8.anIntArray8[local14] || local10.anInt4447 <= Static8.anIntArray8[local14]) && (local10.anInt4460 <= Static96.anIntArray234[local14] || local10.anInt4445 <= Static96.anIntArray234[local14]) && (local10.anInt4460 >= Static127.anIntArray292[local14] || local10.anInt4445 >= Static127.anIntArray292[local14]) && (local10.anInt4458 <= Static234.anIntArray454[local14] || local10.anInt4449 <= Static234.anIntArray454[local14]) && (local10.anInt4458 >= Static206.anIntArray427[local14] || local10.anInt4449 >= Static206.anIntArray427[local14])) {
						continue label194;
					}
				}
			}
			@Pc(115) int local115;
			@Pc(126) int local126;
			@Pc(158) int local158;
			@Pc(137) boolean local137;
			if (local10.anInt4453 == 1) {
				local14 = local10.anInt4452 + Static277.tileVisibilityDistance - Static167.anInt4069;
				if (local14 >= 0 && local14 <= Static277.tileVisibilityDistance + Static277.tileVisibilityDistance) {
					local115 = local10.anInt4461 + Static277.tileVisibilityDistance - Static193.anInt4539;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt4464 + Static277.tileVisibilityDistance - Static193.anInt4539;
					if (local126 > Static277.tileVisibilityDistance + Static277.tileVisibilityDistance) {
						local126 = Static277.tileVisibilityDistance + Static277.tileVisibilityDistance;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static48.aBooleanArrayArray1[local14][local115++]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static149.anInt3555 - local10.anInt4460;
						if (local158 > 32) {
							local10.anInt4462 = 1;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt4462 = 2;
							local158 = -local158;
						}
						local10.anInt4454 = (local10.anInt4458 - Static217.anInt4903 << 8) / local158;
						local10.anInt4450 = (local10.anInt4449 - Static217.anInt4903 << 8) / local158;
						local10.anInt4459 = (local10.anInt4444 - anInt3947 << 8) / local158;
						local10.anInt4463 = (local10.anInt4447 - anInt3947 << 8) / local158;
						Static247.aClass120Array2[Static215.anInt4870++] = local10;
					}
				}
			} else if (local10.anInt4453 == 2) {
				local14 = local10.anInt4461 + Static277.tileVisibilityDistance - Static193.anInt4539;
				if (local14 >= 0 && local14 <= Static277.tileVisibilityDistance + Static277.tileVisibilityDistance) {
					local115 = local10.anInt4452 + Static277.tileVisibilityDistance - Static167.anInt4069;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt4446 + Static277.tileVisibilityDistance - Static167.anInt4069;
					if (local126 > Static277.tileVisibilityDistance + Static277.tileVisibilityDistance) {
						local126 = Static277.tileVisibilityDistance + Static277.tileVisibilityDistance;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static48.aBooleanArrayArray1[local115++][local14]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static217.anInt4903 - local10.anInt4458;
						if (local158 > 32) {
							local10.anInt4462 = 3;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt4462 = 4;
							local158 = -local158;
						}
						local10.anInt4448 = (local10.anInt4460 - Static149.anInt3555 << 8) / local158;
						local10.anInt4456 = (local10.anInt4445 - Static149.anInt3555 << 8) / local158;
						local10.anInt4459 = (local10.anInt4444 - anInt3947 << 8) / local158;
						local10.anInt4463 = (local10.anInt4447 - anInt3947 << 8) / local158;
						Static247.aClass120Array2[Static215.anInt4870++] = local10;
					}
				}
			} else if (local10.anInt4453 == 4) {
				local14 = local10.anInt4444 - anInt3947;
				if (local14 > 128) {
					local115 = local10.anInt4461 + Static277.tileVisibilityDistance - Static193.anInt4539;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt4464 + Static277.tileVisibilityDistance - Static193.anInt4539;
					if (local126 > Static277.tileVisibilityDistance + Static277.tileVisibilityDistance) {
						local126 = Static277.tileVisibilityDistance + Static277.tileVisibilityDistance;
					}
					if (local115 <= local126) {
						@Pc(408) int local408 = local10.anInt4452 + Static277.tileVisibilityDistance - Static167.anInt4069;
						if (local408 < 0) {
							local408 = 0;
						}
						local158 = local10.anInt4446 + Static277.tileVisibilityDistance - Static167.anInt4069;
						if (local158 > Static277.tileVisibilityDistance + Static277.tileVisibilityDistance) {
							local158 = Static277.tileVisibilityDistance + Static277.tileVisibilityDistance;
						}
						@Pc(430) boolean local430 = false;
						label166: for (@Pc(432) int local432 = local408; local432 <= local158; local432++) {
							for (@Pc(437) int local437 = local115; local437 <= local126; local437++) {
								if (Static48.aBooleanArrayArray1[local432][local437]) {
									local430 = true;
									break label166;
								}
							}
						}
						if (local430) {
							local10.anInt4462 = 5;
							local10.anInt4448 = (local10.anInt4460 - Static149.anInt3555 << 8) / local14;
							local10.anInt4456 = (local10.anInt4445 - Static149.anInt3555 << 8) / local14;
							local10.anInt4454 = (local10.anInt4458 - Static217.anInt4903 << 8) / local14;
							local10.anInt4450 = (local10.anInt4449 - Static217.anInt4903 << 8) / local14;
							Static247.aClass120Array2[Static215.anInt4870++] = local10;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(BI)Lclient!na;")
	public static JagString parseInt(@OriginalArg(1) int arg0) {
		return Static198.method1025(false, arg0);
	}
}
