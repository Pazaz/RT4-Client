import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!we", name = "v", descriptor = "Lclient!fd;")
	public static WorldMapFont aClass41_7;

	@OriginalMember(owner = "client!we", name = "H", descriptor = "[[B")
	public static byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!we", name = "w", descriptor = "I")
	public static int anInt4130 = 0;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)I")
	public static int method3211(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(26) int local26 = arg0 * 6 - 61440;
		@Pc(34) int local34 = (arg0 * local26 >> 12) + 40960;
		return local13 * local34 >> 12;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BILclient!be;)I")
	public static int method3212(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1) {
		if (arg1.anIntArrayArray4 == null || arg0 >= arg1.anIntArrayArray4.length) {
			return -2;
		}
		try {
			@Pc(33) int[] local33 = arg1.anIntArrayArray4[arg0];
			@Pc(35) byte local35 = 0;
			@Pc(37) int local37 = 0;
			@Pc(39) int local39 = 0;
			while (true) {
				@Pc(41) int local41 = 0;
				@Pc(46) int local46 = local33[local39++];
				@Pc(48) byte local48 = 0;
				if (local46 == 0) {
					return local37;
				}
				if (local46 == 15) {
					local48 = 1;
				}
				if (local46 == 16) {
					local48 = 2;
				}
				if (local46 == 1) {
					local41 = Static99.anIntArray240[local33[local39++]];
				}
				if (local46 == 17) {
					local48 = 3;
				}
				if (local46 == 2) {
					local41 = Static141.anIntArray326[local33[local39++]];
				}
				if (local46 == 3) {
					local41 = Static227.anIntArray446[local33[local39++]];
				}
				@Pc(124) int local124;
				@Pc(135) Component local135;
				@Pc(140) int local140;
				@Pc(152) int local152;
				if (local46 == 4) {
					local124 = local33[local39++] << 16;
					@Pc(131) int local131 = local124 + local33[local39++];
					local135 = Static5.getComponent(local131);
					local140 = local33[local39++];
					if (local140 != -1 && (!Static71.method1439(local140).aBoolean131 || Static2.aBoolean1)) {
						for (local152 = 0; local152 < local135.objTypes.length; local152++) {
							if (local140 + 1 == local135.objTypes[local152]) {
								local41 += local135.objCounts[local152];
							}
						}
					}
				}
				if (local46 == 5) {
					local41 = Static7.anIntArray75[local33[local39++]];
				}
				if (local46 == 6) {
					local41 = ObjType.anIntArray213[Static141.anIntArray326[local33[local39++]] - 1];
				}
				if (local46 == 7) {
					local41 = Static7.anIntArray75[local33[local39++]] * 100 / 46875;
				}
				if (local46 == 8) {
					local41 = Static173.self.anInt1652;
				}
				if (local46 == 9) {
					for (local124 = 0; local124 < 25; local124++) {
						if (Static182.aBooleanArray97[local124]) {
							local41 += Static141.anIntArray326[local124];
						}
					}
				}
				if (local46 == 10) {
					local124 = local33[local39++] << 16;
					local124 += local33[local39++];
					local135 = Static5.getComponent(local124);
					local140 = local33[local39++];
					if (local140 != -1 && (!Static71.method1439(local140).aBoolean131 || Static2.aBoolean1)) {
						for (local152 = 0; local152 < local135.objTypes.length; local152++) {
							if (local135.objTypes[local152] == local140 + 1) {
								local41 = 999999999;
								break;
							}
						}
					}
				}
				if (local46 == 11) {
					local41 = Static12.anInt400;
				}
				if (local46 == 12) {
					local41 = Static251.anInt5456;
				}
				if (local46 == 13) {
					local124 = Static7.anIntArray75[local33[local39++]];
					@Pc(353) int local353 = local33[local39++];
					local41 = (0x1 << local353 & local124) == 0 ? 0 : 1;
				}
				if (local46 == 14) {
					local124 = local33[local39++];
					local41 = Static155.method2945(local124);
				}
				if (local46 == 18) {
					local41 = (Static173.self.anInt3412 >> 7) + Static225.originX;
				}
				if (local46 == 19) {
					local41 = (Static173.self.anInt3421 >> 7) + Static142.originZ;
				}
				if (local46 == 20) {
					local41 = local33[local39++];
				}
				if (local48 == 0) {
					if (local35 == 0) {
						local37 += local41;
					}
					if (local35 == 1) {
						local37 -= local41;
					}
					if (local35 == 2 && local41 != 0) {
						local37 /= local41;
					}
					if (local35 == 3) {
						local37 *= local41;
					}
					local35 = 0;
				} else {
					local35 = local48;
				}
			}
		} catch (@Pc(464) Exception local464) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(II)Z")
	public static boolean method3213(@OriginalArg(1) int arg0) {
		if (arg0 >= 32 && arg0 <= 126) {
			return true;
		} else if (arg0 >= 160 && arg0 <= 255) {
			return true;
		} else {
			return arg0 == 128 || arg0 == 140 || arg0 == 151 || arg0 == 156 || arg0 == 159;
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(BI)V")
	public static void method3214(@OriginalArg(1) int arg0) {
		for (@Pc(11) Node local11 = Static210.aClass133_21.method3859(); local11 != null; local11 = Static210.aClass133_21.method3861()) {
			if ((local11.aLong192 >> 48 & 0xFFFFL) == (long) arg0) {
				local11.method4658();
			}
		}
	}
}
