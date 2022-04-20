import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "Lclient!ve;")
	public static Js5 aClass153_25;

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "Lclient!na;")
	public static final JagString aClass100_266 = Static28.parse("<col=c0ff00>");

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "Lclient!na;")
	private static final JagString aClass100_267 = Static28.parse("wave:");

	@OriginalMember(owner = "client!dc", name = "M", descriptor = "Lclient!na;")
	public static final JagString aClass100_268 = Static28.parse(")4");

	@OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
	public static int anInt1309 = 0;

	@OriginalMember(owner = "client!dc", name = "R", descriptor = "Lclient!na;")
	private static final JagString aClass100_269 = Static28.parse("Drop");

	@OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
	public static volatile int anInt1313 = 0;

	@OriginalMember(owner = "client!dc", name = "ab", descriptor = "I")
	public static int anInt1316 = 0;

	@OriginalMember(owner = "client!dc", name = "db", descriptor = "[[B")
	public static final byte[][] aByteArrayArray6 = new byte[50][];

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZLclient!tk;IIIIILclient!ak;IIIIB)Lclient!ak;")
	public static Model method1043(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) SeqType arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Model arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		@Pc(23) long local23 = ((long) arg4 << 48) + (long) (arg7 + (arg0 << 16) + (arg12 << 24)) + ((long) arg6 << 32);
		@Pc(33) Model local33 = (Model) Static45.aClass99_6.method3106(local23);
		@Pc(109) int local109;
		@Pc(115) int local115;
		@Pc(126) int local126;
		@Pc(130) int local130;
		@Pc(162) int local162;
		if (local33 == null) {
			@Pc(41) byte local41;
			if (arg7 == 1) {
				local41 = 9;
			} else if (arg7 == 2) {
				local41 = 12;
			} else if (arg7 == 3) {
				local41 = 15;
			} else if (arg7 == 4) {
				local41 = 18;
			} else {
				local41 = 21;
			}
			@Pc(83) int[] local83 = new int[] { 64, 96, 128 };
			@Pc(103) RawModel local103 = new RawModel(local41 * 3 + 1, -local41 + local41 * 3 * 2, 0);
			local109 = local103.method1685(0, 0);
			@Pc(113) int[][] local113 = new int[3][local41];
			for (local115 = 0; local115 < 3; local115++) {
				local126 = local83[local115];
				local130 = local83[local115];
				for (@Pc(132) int local132 = 0; local132 < local41; local132++) {
					@Pc(141) int local141 = (local132 << 11) / local41;
					@Pc(152) int local152 = arg5 + MathUtils.anIntArray225[local141] * local130 >> 16;
					local162 = arg3 + MathUtils.anIntArray223[local141] * local126 >> 16;
					local113[local115][local132] = local103.method1685(local162, local152);
				}
			}
			for (local115 = 0; local115 < 3; local115++) {
				local126 = (local115 * 256 + 128) / 3;
				local130 = 256 - local126;
				@Pc(207) byte local207 = (byte) (arg12 * local126 + arg0 * local130 >> 8);
				@Pc(252) short local252 = (short) (((arg6 & 0x7F) * local130 + (arg4 & 0x7F) * local126 & 0x7F00) + (local130 * (arg6 & 0x380) + local126 * (arg4 & 0x380) & 0x38000) + (local126 * (arg4 & 0xFC00) + (arg6 & 0xFC00) * local130 & 0xFC0000) >> 8);
				for (local162 = 0; local162 < local41; local162++) {
					if (local115 == 0) {
						local103.method1676(local109, local113[0][(local162 + 1) % local41], local113[0][local162], local252, local207);
					} else {
						local103.method1676(local113[local115 - 1][local162], local113[local115 - 1][(local162 + 1) % local41], local113[local115][(local162 + 1) % local41], local252, local207);
						local103.method1676(local113[local115 - 1][local162], local113[local115][(local162 + 1) % local41], local113[local115][local162], local252, local207);
					}
				}
			}
			local33 = local103.method1679(64, 768, -50, -10, -50);
			Static45.aClass99_6.method3095(local33, local23);
		}
		@Pc(367) int local367 = arg7 * 64 - 1;
		@Pc(376) int local376 = -local367;
		@Pc(379) int local379 = -local367;
		@Pc(381) int local381 = local367;
		@Pc(384) int local384 = arg8.method4562();
		@Pc(386) AnimFrameset local386 = null;
		local115 = arg8.method4561();
		local126 = arg8.method4576();
		local130 = arg8.method4550();
		if (arg2 != null) {
			@Pc(403) int local403 = arg2.anIntArray473[arg10];
			local386 = Static72.method1566(local403 >> 16);
			arg10 = local403 & 0xFFFF;
		}
		local109 = local367;
		if (arg1) {
			if (arg9 > 1664 || arg9 < 384) {
				local379 -= 128;
			}
			if (arg9 > 1152 && arg9 < 1920) {
				local381 = local367 + 128;
			}
			if (arg9 > 640 && arg9 < 1408) {
				local109 = local367 + 128;
			}
			if (arg9 > 128 && arg9 < 896) {
				local376 -= 128;
			}
		}
		if (local109 < local130) {
			local130 = local109;
		}
		if (local376 > local384) {
			local384 = local376;
		}
		if (local126 < local379) {
			local126 = local379;
		}
		if (local381 < local115) {
			local115 = local381;
		}
		if (local386 == null) {
			local33 = local33.method4560(true, true, true);
			local33.method4559((local115 - local384) / 2, 128, (local130 - local126) / 2);
			local33.method4575((local384 + local115) / 2, 0, (local126 + local130) / 2);
		} else {
			local33 = local33.method4560(!local386.method901(arg10), !local386.method903(arg10), true);
			local33.method4559((local115 - local384) / 2, 128, (local130 - local126) / 2);
			local33.method4575((local384 + local115) / 2, 0, (local126 + local130) / 2);
			local33.method4555(local386, arg10);
		}
		if (arg9 != 0) {
			local33.method4554(arg9);
		}
		if (GlRenderer.enabled) {
			@Pc(650) GlModel local650 = (GlModel) local33;
			if (Static207.method3685(Static55.level, arg3 + local384, local126 + arg5) != arg11 || Static207.method3685(Static55.level, local115 + arg3, arg5 - -local130) != arg11) {
				for (local162 = 0; local162 < local650.anInt5295; local162++) {
					local650.anIntArray465[local162] += Static207.method3685(Static55.level, local650.anIntArray461[local162] + arg3, arg5 + local650.anIntArray466[local162]) - arg11;
				}
				local650.aClass5_1.aBoolean3 = false;
				local650.aClass127_4.aBoolean235 = false;
			}
		} else {
			@Pc(574) SoftwareModel local574 = (SoftwareModel) local33;
			if (Static207.method3685(Static55.level, arg3 + local384, arg5 - -local126) != arg11 || arg11 != Static207.method3685(Static55.level, arg3 + local115, arg5 - -local130)) {
				for (local162 = 0; local162 < local574.anInt5788; local162++) {
					local574.anIntArray527[local162] += Static207.method3685(Static55.level, arg3 + local574.anIntArray528[local162], arg5 + local574.anIntArray531[local162]) - arg11;
				}
				local574.aBoolean305 = false;
			}
		}
		return local33;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIZ)V")
	public static void method1045(@OriginalArg(3) boolean arg0) {
		Static258.anInt5637 = 2;
		Static164.aBoolean192 = arg0;
		Static44.anInt1404 = 22050;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)V")
	public static void method1050() {
		@Pc(6) int local6 = Static57.aClass3_Sub15_Sub1_3.method2238(8);
		@Pc(20) int local20;
		if (Static267.anInt5774 > local6) {
			for (local20 = local6; local20 < Static267.anInt5774; local20++) {
				Static52.anIntArray136[Static240.anInt5335++] = Static105.anIntArray256[local20];
			}
		}
		if (local6 > Static267.anInt5774) {
			throw new RuntimeException("gppov1");
		}
		Static267.anInt5774 = 0;
		for (local20 = 0; local20 < local6; local20++) {
			@Pc(75) int local75 = Static105.anIntArray256[local20];
			@Pc(79) Player local79 = Static159.aClass8_Sub4_Sub1Array1[local75];
			@Pc(84) int local84 = Static57.aClass3_Sub15_Sub1_3.method2238(1);
			if (local84 == 0) {
				Static105.anIntArray256[Static267.anInt5774++] = local75;
				local79.anInt3430 = Static83.anInt372;
			} else {
				@Pc(107) int local107 = Static57.aClass3_Sub15_Sub1_3.method2238(2);
				if (local107 == 0) {
					Static105.anIntArray256[Static267.anInt5774++] = local75;
					local79.anInt3430 = Static83.anInt372;
					Static44.anIntArray106[Static116.anInt2951++] = local75;
				} else {
					@Pc(153) int local153;
					@Pc(163) int local163;
					if (local107 == 1) {
						Static105.anIntArray256[Static267.anInt5774++] = local75;
						local79.anInt3430 = Static83.anInt372;
						local153 = Static57.aClass3_Sub15_Sub1_3.method2238(3);
						local79.method2684(1, local153);
						local163 = Static57.aClass3_Sub15_Sub1_3.method2238(1);
						if (local163 == 1) {
							Static44.anIntArray106[Static116.anInt2951++] = local75;
						}
					} else if (local107 == 2) {
						Static105.anIntArray256[Static267.anInt5774++] = local75;
						local79.anInt3430 = Static83.anInt372;
						if (Static57.aClass3_Sub15_Sub1_3.method2238(1) == 1) {
							local153 = Static57.aClass3_Sub15_Sub1_3.method2238(3);
							local79.method2684(2, local153);
							local163 = Static57.aClass3_Sub15_Sub1_3.method2238(3);
							local79.method2684(2, local163);
						} else {
							local153 = Static57.aClass3_Sub15_Sub1_3.method2238(3);
							local79.method2684(0, local153);
						}
						local153 = Static57.aClass3_Sub15_Sub1_3.method2238(1);
						if (local153 == 1) {
							Static44.anIntArray106[Static116.anInt2951++] = local75;
						}
					} else if (local107 == 3) {
						Static52.anIntArray136[Static240.anInt5335++] = local75;
					}
				}
			}
		}
	}
}
