import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!uj", name = "x", descriptor = "[I")
	public static int[] anIntArray488;

	@OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
	public static int anInt5554;

	@OriginalMember(owner = "client!uj", name = "E", descriptor = "I")
	public static int anInt5556;

	@OriginalMember(owner = "client!uj", name = "H", descriptor = "I")
	public static int anInt5559;

	@OriginalMember(owner = "client!uj", name = "J", descriptor = "Lclient!ve;")
	public static Js5 aClass153_105;

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "Lclient!na;")
	public static final JagString aClass100_1061 = Static28.parse("null");

	@OriginalMember(owner = "client!uj", name = "t", descriptor = "[I")
	public static final int[] anIntArray487 = new int[1000];

	@OriginalMember(owner = "client!uj", name = "A", descriptor = "[I")
	public static final int[] anIntArray489 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!uj", name = "C", descriptor = "[Lclient!na;")
	public static final JagString[] aClass100Array168 = new JagString[500];

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLclient!ve;I)Z")
	public static boolean method4346(@OriginalArg(1) Js5 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method4500(arg1);
		if (local13 == null) {
			return false;
		} else {
			Static84.method1770(local13);
			return true;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BZII[[[Lclient!bj;I)Z")
	public static boolean method4348(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Tile[][][] arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg0 ? 1 : (byte) (Static136.anInt3325 & 0xFF);
		if (local14 == Static266.aByteArrayArrayArray15[Static55.level][arg1][arg2]) {
			return false;
		} else if ((Static12.aByteArrayArrayArray2[Static55.level][arg1][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(47) int local47 = 0;
			@Pc(49) byte local49 = 0;
			Static259.anIntArray514[0] = arg1;
			@Pc(69) int local69 = local49 + 1;
			Static84.anIntArray209[0] = arg2;
			Static266.aByteArrayArrayArray15[Static55.level][arg1][arg2] = local14;
			while (local47 != local69) {
				@Pc(94) int local94 = Static259.anIntArray514[local47] >> 16 & 0xFF;
				@Pc(102) int local102 = Static259.anIntArray514[local47] >> 24 & 0xFF;
				@Pc(108) int local108 = Static259.anIntArray514[local47] & 0xFFFF;
				@Pc(116) int local116 = Static84.anIntArray209[local47] >> 16 & 0xFF;
				@Pc(122) int local122 = Static84.anIntArray209[local47] & 0xFFFF;
				local47 = local47 + 1 & 0xFFF;
				@Pc(130) boolean local130 = false;
				@Pc(132) boolean local132 = false;
				if ((Static12.aByteArrayArrayArray2[Static55.level][local108][local122] & 0x4) == 0) {
					local130 = true;
				}
				@Pc(150) int local150;
				@Pc(191) int local191;
				label238: for (local150 = Static55.level + 1; local150 <= 3; local150++) {
					if ((Static12.aByteArrayArrayArray2[local150][local108][local122] & 0x8) == 0) {
						@Pc(227) int local227;
						@Pc(358) int local358;
						if (local130 && arg3[local150][local108][local122] != null) {
							if (arg3[local150][local108][local122].aClass77_1 != null) {
								local191 = Static104.method2251(local94);
								if (arg3[local150][local108][local122].aClass77_1.anInt3049 == local191 || arg3[local150][local108][local122].aClass77_1.anInt3052 == local191) {
									continue;
								}
								if (local102 != 0) {
									local227 = Static104.method2251(local102);
									if (local227 == arg3[local150][local108][local122].aClass77_1.anInt3049 || arg3[local150][local108][local122].aClass77_1.anInt3052 == local227) {
										continue;
									}
								}
								if (local116 != 0) {
									local227 = Static104.method2251(local116);
									if (local227 == arg3[local150][local108][local122].aClass77_1.anInt3049 || local227 == arg3[local150][local108][local122].aClass77_1.anInt3052) {
										continue;
									}
								}
							}
							if (arg3[local150][local108][local122].aClass31Array1 != null) {
								for (local191 = 0; local191 < arg3[local150][local108][local122].anInt662; local191++) {
									local227 = (int) (arg3[local150][local108][local122].aClass31Array1[local191].aLong56 >> 14 & 0x3FL);
									if (local227 == 21) {
										local227 = 19;
									}
									@Pc(352) int local352 = (int) (arg3[local150][local108][local122].aClass31Array1[local191].aLong56 >> 20 & 0x3L);
									local358 = local227 | local352 << 6;
									if (local358 == local94 || local102 != 0 && local358 == local102 || local116 != 0 && local116 == local358) {
										continue label238;
									}
								}
							}
						}
						local132 = true;
						@Pc(395) Tile local395 = arg3[local150][local108][local122];
						if (local395 != null && local395.anInt662 > 0) {
							for (local227 = 0; local227 < local395.anInt662; local227++) {
								@Pc(418) Scenery local418 = local395.aClass31Array1[local227];
								if (local418.anInt1713 != local418.anInt1701 || local418.anInt1698 != local418.anInt1696) {
									for (local358 = local418.anInt1701; local358 <= local418.anInt1713; local358++) {
										for (@Pc(450) int local450 = local418.anInt1696; local450 <= local418.anInt1698; local450++) {
											Static266.aByteArrayArrayArray15[local150][local358][local450] = local14;
										}
									}
								}
							}
						}
						Static266.aByteArrayArrayArray15[local150][local108][local122] = local14;
					}
				}
				if (local132) {
					if (Static83.anIntArrayArrayArray4[Static55.level + 1][local108][local122] > Static79.anIntArray205[arg4]) {
						Static79.anIntArray205[arg4] = Static83.anIntArrayArrayArray4[Static55.level + 1][local108][local122];
					}
					local150 = local108 << 7;
					if (local150 < Static149.anIntArray338[arg4]) {
						Static149.anIntArray338[arg4] = local150;
					} else if (Static267.anIntArray518[arg4] < local150) {
						Static267.anIntArray518[arg4] = local150;
					}
					local191 = local122 << 7;
					if (Static243.anIntArray476[arg4] > local191) {
						Static243.anIntArray476[arg4] = local191;
					} else if (Static50.anIntArray134[arg4] < local191) {
						Static50.anIntArray134[arg4] = local191;
					}
				}
				if (!local130) {
					if (local108 >= 1 && Static266.aByteArrayArrayArray15[Static55.level][local108 - 1][local122] != local14) {
						Static259.anIntArray514[local69] = local108 - 1 | 0x120000 | 0xD3000000;
						Static84.anIntArray209[local69] = local122 | 0x130000;
						local69 = local69 + 1 & 0xFFF;
						Static266.aByteArrayArrayArray15[Static55.level][local108 - 1][local122] = local14;
					}
					local122++;
					if (local122 < 104) {
						if (local108 - 1 >= 0 && local14 != Static266.aByteArrayArrayArray15[Static55.level][local108 - 1][local122] && (Static12.aByteArrayArrayArray2[Static55.level][local108][local122] & 0x4) == 0 && (Static12.aByteArrayArrayArray2[Static55.level][local108 - 1][local122 - 1] & 0x4) == 0) {
							Static259.anIntArray514[local69] = 0x52000000 | 0x120000 | local108 - 1;
							Static84.anIntArray209[local69] = local122 | 0x130000;
							Static266.aByteArrayArrayArray15[Static55.level][local108 - 1][local122] = local14;
							local69 = local69 + 1 & 0xFFF;
						}
						if (local14 != Static266.aByteArrayArrayArray15[Static55.level][local108][local122]) {
							Static259.anIntArray514[local69] = local108 | 0x13000000 | 0x520000;
							Static84.anIntArray209[local69] = local122 | 0x530000;
							local69 = local69 + 1 & 0xFFF;
							Static266.aByteArrayArrayArray15[Static55.level][local108][local122] = local14;
						}
						if (local108 + 1 < 104 && Static266.aByteArrayArrayArray15[Static55.level][local108 + 1][local122] != local14 && (Static12.aByteArrayArrayArray2[Static55.level][local108][local122] & 0x4) == 0 && (Static12.aByteArrayArrayArray2[Static55.level][local108 + 1][local122 - 1] & 0x4) == 0) {
							Static259.anIntArray514[local69] = 0x92000000 | 0x520000 | local108 + 1;
							Static84.anIntArray209[local69] = local122 | 0x530000;
							Static266.aByteArrayArrayArray15[Static55.level][local108 + 1][local122] = local14;
							local69 = local69 + 1 & 0xFFF;
						}
					}
					local122--;
					if (local108 + 1 < 104 && local14 != Static266.aByteArrayArrayArray15[Static55.level][local108 + 1][local122]) {
						Static259.anIntArray514[local69] = local108 + 1 | 0x920000 | 0x53000000;
						Static84.anIntArray209[local69] = local122 | 0x930000;
						Static266.aByteArrayArrayArray15[Static55.level][local108 + 1][local122] = local14;
						local69 = local69 + 1 & 0xFFF;
					}
					local122--;
					if (local122 >= 0) {
						if (local108 - 1 >= 0 && Static266.aByteArrayArrayArray15[Static55.level][local108 - 1][local122] != local14 && (Static12.aByteArrayArrayArray2[Static55.level][local108][local122] & 0x4) == 0 && (Static12.aByteArrayArrayArray2[Static55.level][local108 - 1][local122 + 1] & 0x4) == 0) {
							Static259.anIntArray514[local69] = local108 - 1 | 0xD20000 | 0x12000000;
							Static84.anIntArray209[local69] = local122 | 0xD30000;
							Static266.aByteArrayArrayArray15[Static55.level][local108 - 1][local122] = local14;
							local69 = local69 + 1 & 0xFFF;
						}
						if (local14 != Static266.aByteArrayArrayArray15[Static55.level][local108][local122]) {
							Static259.anIntArray514[local69] = local108 | 0xD20000 | 0x93000000;
							Static84.anIntArray209[local69] = local122 | 0xD30000;
							local69 = local69 + 1 & 0xFFF;
							Static266.aByteArrayArrayArray15[Static55.level][local108][local122] = local14;
						}
						if (local108 + 1 < 104 && Static266.aByteArrayArrayArray15[Static55.level][local108 + 1][local122] != local14 && (Static12.aByteArrayArrayArray2[Static55.level][local108][local122] & 0x4) == 0 && (Static12.aByteArrayArrayArray2[Static55.level][local108 + 1][local122 + 1] & 0x4) == 0) {
							Static259.anIntArray514[local69] = local108 + 1 | 0xD2000000 | 0x920000;
							Static84.anIntArray209[local69] = local122 | 0x930000;
							Static266.aByteArrayArrayArray15[Static55.level][local108 + 1][local122] = local14;
							local69 = local69 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static79.anIntArray205[arg4] != -1000000) {
				Static79.anIntArray205[arg4] += 10;
				Static149.anIntArray338[arg4] -= 50;
				Static267.anIntArray518[arg4] += 50;
				Static50.anIntArray134[arg4] += 50;
				Static243.anIntArray476[arg4] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)I")
	public static int method4349(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!wa;II)Lclient!na;")
	public static JagString method4350(@OriginalArg(0) Buffer arg0) {
		try {
			@Pc(7) int local7 = arg0.gSmart1or2();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.offset += Static62.aClass44_1.method1552(0, local7, local15, arg0.data, arg0.offset);
			return Static10.decodeString(local15, local7, 0);
		} catch (@Pc(47) Exception local47) {
			return Static267.aClass100_1087;
		}
	}
}
