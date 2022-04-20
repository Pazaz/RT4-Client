import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "Z")
	public static boolean aBoolean63;

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "Lsignlink!im;")
	public static PrivilegedRequest openUrlRequest;

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "[I")
	public static final int[] anIntArray79 = new int[32768];

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!pb;ZIIII)Z")
	public static boolean method867(@OriginalArg(0) int arg0, @OriginalArg(1) LocType arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(10) Class2 local10 = Static40.method1013(arg1.anInt4415);
		if (local10.anInt12 == -1) {
			return true;
		}
		if (arg1.aBoolean218) {
			@Pc(24) int local24 = arg3 + arg1.anInt4395;
			arg3 = local24 & 0x3;
		} else {
			arg3 = 0;
		}
		@Pc(42) SoftwareIndexedSprite local42 = local10.method9(arg3);
		if (local42 == null) {
			return false;
		}
		@Pc(49) int local49 = arg1.anInt4397;
		@Pc(52) int local52 = arg1.anInt4403;
		if ((arg3 & 0x1) == 1) {
			local49 = arg1.anInt4403;
			local52 = arg1.anInt4397;
		}
		@Pc(66) int local66 = local42.anInt4279;
		@Pc(69) int local69 = local42.anInt4276;
		if (local10.aBoolean2) {
			local69 = local52 * 4;
			local66 = local49 * 4;
		}
		if (local10.anInt11 == 0) {
			local42.method1398(arg0 * 4 + 48, (-local52 + -arg2 + 104) * 4 + 48, local66, local69);
		} else {
			local42.method1390(arg0 * 4 + 48, (-local52 + -arg2 + 104) * 4 + 48, local66, local69, local10.anInt11);
		}
		return true;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLclient!wa;)V")
	public static void method868(@OriginalArg(1) Buffer arg0) {
		@Pc(13) int local13 = Static266.anInt5338 >> 1;
		@Pc(19) int local19 = Static131.anInt3254 >> 2 << 10;
		@Pc(23) byte[][] local23 = new byte[Static48.anInt1449][Static181.anInt4296];
		@Pc(33) int local33;
		@Pc(102) int local102;
		@Pc(114) int local114;
		while (arg0.offset < arg0.data.length) {
			@Pc(31) int local31 = 0;
			local33 = 0;
			@Pc(35) boolean local35 = false;
			if (arg0.g1() == 1) {
				local33 = arg0.g1();
				local31 = arg0.g1();
				local35 = true;
			}
			@Pc(57) int local57 = arg0.g1();
			@Pc(61) int local61 = arg0.g1();
			@Pc(68) int local68 = local57 * 64 - Static158.anInt3846;
			@Pc(78) int local78 = Static181.anInt4296 + Static2.anInt13 - local61 * 64 - 1;
			if (local68 >= 0 && local78 - 63 >= 0 && Static48.anInt1449 > local68 + 63 && Static181.anInt4296 > local78) {
				for (local102 = 0; local102 < 64; local102++) {
					@Pc(112) byte[] local112 = local23[local68 + local102];
					for (local114 = 0; local114 < 64; local114++) {
						if (!local35 || local102 >= local33 * 8 && local33 * 8 + 8 > local102 && local114 >= local31 * 8 && local114 < local31 * 8 + 8) {
							local112[local78 - local114] = arg0.g1s();
						}
					}
				}
			} else if (local35) {
				arg0.offset += 64;
			} else {
				arg0.offset += 4096;
			}
		}
		@Pc(175) int local175 = Static48.anInt1449;
		local33 = Static181.anInt4296;
		@Pc(180) int[] local180 = new int[local33];
		@Pc(183) int[] local183 = new int[local33];
		@Pc(186) int[] local186 = new int[local33];
		@Pc(189) int[] local189 = new int[local33];
		@Pc(192) int[] local192 = new int[local33];
		for (local102 = -5; local102 < local175; local102++) {
			@Pc(225) int local225;
			@Pc(293) int local293;
			for (@Pc(203) int local203 = 0; local203 < local33; local203++) {
				local114 = local102 + 5;
				@Pc(272) int local272;
				if (local175 > local114) {
					local225 = local23[local114][local203] & 0xFF;
					if (local225 > 0) {
						@Pc(236) FluType local236 = Static199.method3593(local225 - 1);
						local183[local203] += local236.anInt4154;
						local180[local203] += local236.anInt4149;
						local186[local203] += local236.anInt4158;
						local189[local203] += local236.anInt4161;
						local272 = local192[local203]++;
					}
				}
				local225 = local102 - 5;
				if (local225 >= 0) {
					local293 = local23[local225][local203] & 0xFF;
					if (local293 > 0) {
						@Pc(302) FluType local302 = Static199.method3593(local293 - 1);
						local183[local203] -= local302.anInt4154;
						local180[local203] -= local302.anInt4149;
						local186[local203] -= local302.anInt4158;
						local189[local203] -= local302.anInt4161;
						local272 = local192[local203]--;
					}
				}
			}
			if (local102 >= 0) {
				@Pc(355) int[][] local355 = Static248.anIntArrayArrayArray17[local102 >> 6];
				local114 = 0;
				local225 = 0;
				@Pc(361) int local361 = 0;
				@Pc(363) int local363 = 0;
				local293 = 0;
				for (@Pc(367) int local367 = -5; local367 < local33; local367++) {
					@Pc(378) int local378 = local367 + 5;
					if (local33 > local378) {
						local363 += local192[local378];
						local225 += local180[local378];
						local293 += local186[local378];
						local114 += local183[local378];
						local361 += local189[local378];
					}
					@Pc(415) int local415 = local367 - 5;
					if (local415 >= 0) {
						local293 -= local186[local415];
						local361 -= local189[local415];
						local114 -= local183[local415];
						local363 -= local192[local415];
						local225 -= local180[local415];
					}
					if (local367 >= 0 && local363 > 0) {
						@Pc(462) int[] local462 = local355[local367 >> 6];
						@Pc(480) int local480 = local361 == 0 ? 0 : Static54.method1309(local293 / local363, local225 / local363, local114 * 256 / local361);
						if (local23[local102][local367] != 0) {
							if (local462 == null) {
								local462 = local355[local367 >> 6] = new int[4096];
							}
							@Pc(519) int local519 = local13 + (local480 & 0x7F);
							if (local519 < 0) {
								local519 = 0;
							} else if (local519 > 127) {
								local519 = 127;
							}
							@Pc(541) int local541 = local519 + (local480 & 0x380) + (local480 + local19 & 0xFC00);
							local462[((local367 & 0x3F) << 6) + (local102 & 0x3F)] = Rasteriser.anIntArray220[Static87.method1814(96, local541)];
						} else if (local462 != null) {
							local462[((local367 & 0x3F) << 6) + (local102 & 0x3F)] = 0;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
	public static Object method869(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static84.aBoolean127) {
			try {
				@Pc(27) ByteArray local27 = (ByteArray) Class.forName("DirectByteArray").getDeclaredConstructor().newInstance();
				local27.method4238(arg0);
				return local27;
			} catch (@Pc(34) Throwable local34) {
				Static84.aBoolean127 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)[Lclient!qf;")
	public static Sprite[] method870() {
		@Pc(6) Sprite[] local6 = new Sprite[Static165.anInt4038];
		for (@Pc(15) int local15 = 0; local15 < Static165.anInt4038; local15++) {
			@Pc(30) int local30 = Static254.anIntArray488[local15] * Static26.anIntArray66[local15];
			@Pc(34) byte[] local34 = Static7.aByteArrayArray5[local15];
			@Pc(37) int[] local37 = new int[local30];
			for (@Pc(39) int local39 = 0; local39 < local30; local39++) {
				local37[local39] = Static259.anIntArray513[local34[local39] & 0xFF];
			}
			if (GlRenderer.enabled) {
				local6[local15] = new GlSprite(Static124.anInt3080, Static227.anInt5091, Static274.anIntArray440[local15], Static269.anIntArray252[local15], Static254.anIntArray488[local15], Static26.anIntArray66[local15], local37);
			} else {
				local6[local15] = new SoftwareSprite(Static124.anInt3080, Static227.anInt5091, Static274.anIntArray440[local15], Static269.anIntArray252[local15], Static254.anIntArray488[local15], Static26.anIntArray66[local15], local37);
			}
		}
		Static75.method1631();
		return local6;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)I")
	public static int method872(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(JB)Lclient!na;")
	public static JagString method873(@OriginalArg(0) long arg0) {
		Static35.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static35.aCalendar1.get(7);
		@Pc(17) int local17 = Static35.aCalendar1.get(5);
		@Pc(21) int local21 = Static35.aCalendar1.get(2);
		@Pc(32) int local32 = Static35.aCalendar1.get(1);
		@Pc(36) int local36 = Static35.aCalendar1.get(11);
		@Pc(40) int local40 = Static35.aCalendar1.get(12);
		@Pc(44) int local44 = Static35.aCalendar1.get(13);
		return Static34.method882(new JagString[] { Static219.aClass100Array149[local13 - 1], Static74.aClass100_461, Static123.method2423(local17 / 10), Static123.method2423(local17 % 10), Static270.aClass100_1089, Static138.aClass100Array102[local21], Static270.aClass100_1089, Static123.method2423(local32), Static49.aClass100_351, Static123.method2423(local36 / 10), Static123.method2423(local36 % 10), Static264.aClass100_875, Static123.method2423(local40 / 10), Static123.method2423(local40 % 10), Static264.aClass100_875, Static123.method2423(local44 / 10), Static123.method2423(local44 % 10), Static55.aClass100_376 });
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZIIIIIIFB)[[I")
	public static int[][] method874(@OriginalArg(7) float arg0) {
		@Pc(15) int[][] local15 = new int[256][64];
		@Pc(19) TextureOp4 local19 = new TextureOp4();
		local19.anInt648 = (int) (arg0 * 4096.0F);
		local19.anInt642 = 3;
		local19.anInt641 = 4;
		local19.aBoolean44 = false;
		local19.anInt646 = 8;
		local19.method4630();
		Static10.method348(256, 64);
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			local19.method584(local46, local15[local46]);
		}
		return local15;
	}
}
