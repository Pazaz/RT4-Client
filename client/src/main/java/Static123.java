import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "Lclient!na;")
	public static final JagString aClass100_592 = Static28.parse("headicons_pk");

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
	public static int anInt3058 = 0;

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "Lclient!na;")
	public static final JagString aClass100_593 = Static28.parse(" (X");

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "Z")
	public static boolean aBoolean155 = false;

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "Lclient!na;")
	public static final JagString aClass100_594 = Static28.parse("<)4col>");

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)Lclient!lk;")
	public static StructType method2417(@OriginalArg(1) int arg0) {
		@Pc(10) StructType local10 = (StructType) Static231.aClass54_13.method1806((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static23.aClass153_11.method4495(26, arg0);
		local10 = new StructType();
		if (local26 != null) {
			local10.method2806(new Buffer(local26));
		}
		Static231.aClass54_13.method1811(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V")
	public static void method2418() {
		if (!Static249.aBoolean282 && Static83.modeWhere != 2) {
			try {
				Static206.aClass100_900.method3157(Static215.aClient1);
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
				local14 = local10.anInt4452 + Static277.anInt5855 - Static167.anInt4069;
				if (local14 >= 0 && local14 <= Static277.anInt5855 + Static277.anInt5855) {
					local115 = local10.anInt4461 + Static277.anInt5855 - Static193.anInt4539;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt4464 + Static277.anInt5855 - Static193.anInt4539;
					if (local126 > Static277.anInt5855 + Static277.anInt5855) {
						local126 = Static277.anInt5855 + Static277.anInt5855;
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
						local10.anInt4459 = (local10.anInt4444 - Static162.anInt3947 << 8) / local158;
						local10.anInt4463 = (local10.anInt4447 - Static162.anInt3947 << 8) / local158;
						Static247.aClass120Array2[Static215.anInt4870++] = local10;
					}
				}
			} else if (local10.anInt4453 == 2) {
				local14 = local10.anInt4461 + Static277.anInt5855 - Static193.anInt4539;
				if (local14 >= 0 && local14 <= Static277.anInt5855 + Static277.anInt5855) {
					local115 = local10.anInt4452 + Static277.anInt5855 - Static167.anInt4069;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt4446 + Static277.anInt5855 - Static167.anInt4069;
					if (local126 > Static277.anInt5855 + Static277.anInt5855) {
						local126 = Static277.anInt5855 + Static277.anInt5855;
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
						local10.anInt4459 = (local10.anInt4444 - Static162.anInt3947 << 8) / local158;
						local10.anInt4463 = (local10.anInt4447 - Static162.anInt3947 << 8) / local158;
						Static247.aClass120Array2[Static215.anInt4870++] = local10;
					}
				}
			} else if (local10.anInt4453 == 4) {
				local14 = local10.anInt4444 - Static162.anInt3947;
				if (local14 > 128) {
					local115 = local10.anInt4461 + Static277.anInt5855 - Static193.anInt4539;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt4464 + Static277.anInt5855 - Static193.anInt4539;
					if (local126 > Static277.anInt5855 + Static277.anInt5855) {
						local126 = Static277.anInt5855 + Static277.anInt5855;
					}
					if (local115 <= local126) {
						@Pc(408) int local408 = local10.anInt4452 + Static277.anInt5855 - Static167.anInt4069;
						if (local408 < 0) {
							local408 = 0;
						}
						local158 = local10.anInt4446 + Static277.anInt5855 - Static167.anInt4069;
						if (local158 > Static277.anInt5855 + Static277.anInt5855) {
							local158 = Static277.anInt5855 + Static277.anInt5855;
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

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBI)Lclient!na;")
	public static JagString method2420(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - arg0;
		if (local4 < -9) {
			return Static175.aClass100_798;
		} else if (local4 < -6) {
			return Static64.aClass100_433;
		} else if (local4 < -3) {
			return Static223.aClass100_951;
		} else if (local4 < 0) {
			return Static229.aClass100_972;
		} else if (local4 > 9) {
			return Static42.aClass100_332;
		} else if (local4 > 6) {
			return Static6.aClass100_18;
		} else if (local4 <= 3) {
			return local4 > 0 ? Static41.aClass100_266 : Static226.aClass100_965;
		} else {
			return Static263.aClass100_1081;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)[F")
	public static float[] method2422() {
		@Pc(3) float local3 = Static161.method3068() + Static161.method3059();
		@Pc(9) int local9 = Static161.method3064();
		@Pc(18) float local18 = (float) (local9 >> 16 & 0xFF) / 255.0F;
		Static251.aFloatArray28[3] = 1.0F;
		@Pc(37) float local37 = (float) (local9 >> 8 & 0xFF) / 255.0F;
		@Pc(39) float local39 = 0.58823526F;
		@Pc(46) float local46 = (float) (local9 & 0xFF) / 255.0F;
		Static251.aFloatArray28[2] = Static257.aFloatArray2[2] * local46 * local39 * local3;
		Static251.aFloatArray28[0] = Static257.aFloatArray2[0] * local18 * local39 * local3;
		Static251.aFloatArray28[1] = local3 * local39 * local37 * Static257.aFloatArray2[1];
		return Static251.aFloatArray28;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(BI)Lclient!na;")
	public static JagString method2423(@OriginalArg(1) int arg0) {
		return Static198.method1025(false, arg0);
	}
}
