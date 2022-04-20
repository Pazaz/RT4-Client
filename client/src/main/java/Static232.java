import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
	public static int anInt5208;

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!sm", name = "k", descriptor = "Lsignlink!im;")
	public static PrivilegedRequest aClass212_5;

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
	public static int anInt5212;

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "Lclient!n;")
	public static final SoftLruHashTable aClass99_30 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "[S")
	public static short[] aShortArray74 = new short[256];

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIIIIIII)V")
	public static void method3991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7) {
		@Pc(9) int local9 = arg2 - arg4;
		@Pc(11) int local11 = -1;
		if (Static201.anInt1864 > 0) {
			if (Static91.anInt2428 <= 10) {
				local11 = Static91.anInt2428 * 5;
			} else {
				local11 = 50 - (Static91.anInt2428 - 10) * 5;
			}
		}
		@Pc(39) int local39 = arg1 - arg6;
		@Pc(43) int local43 = 983040 / arg5;
		@Pc(47) int local47 = 983040 / arg3;
		for (@Pc(50) int local50 = -local43; local50 < local9 + local43; local50++) {
			@Pc(65) int local65 = local50 * arg5 >> 16;
			@Pc(75) int local75 = arg5 * (local50 + 1) >> 16;
			@Pc(80) int local80 = local75 - local65;
			if (local80 > 0) {
				@Pc(91) int local91 = arg4 + local50 >> 6;
				local65 += arg0;
				if (local91 >= 0 && local91 <= Static83.anIntArrayArrayArray3.length - 1) {
					@Pc(116) int[][] local116 = Static83.anIntArrayArrayArray3[local91];
					for (@Pc(119) int local119 = -local47; local119 < local39 + local47; local119++) {
						@Pc(136) int local136 = arg3 * (local119 + 1) >> 16;
						@Pc(144) int local144 = local119 * arg3 >> 16;
						@Pc(149) int local149 = local136 - local144;
						if (local149 > 0) {
							local144 += arg7;
							@Pc(163) int local163 = arg6 + local119 >> 6;
							if (local163 >= 0 && local163 <= local116.length - 1 && local116[local163] != null) {
								@Pc(203) int local203 = (local50 + arg4 & 0x3F) + ((arg6 + local119 & 0x3F) << 6);
								@Pc(209) int local209 = local116[local163][local203];
								if (local209 != 0) {
									@Pc(222) LocType local222 = Static271.method4601(local209 - 1);
									if (!Static258.aBooleanArray130[local222.anInt4400]) {
										if (local11 != -1 && local222.anInt4400 == Static9.anInt172) {
											@Pc(243) Class3_Sub26 local243 = new Class3_Sub26();
											local243.anInt4307 = local65;
											local243.anInt4314 = local144;
											local243.anInt4308 = local222.anInt4400;
											Static172.aClass69_97.method2282(local243);
										} else {
											Static241.aClass3_Sub2_Sub1_Sub1Array13[local222.anInt4400].method1423(local65 - 7, local144 + -7);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (@Pc(285) Class3_Sub26 local285 = (Class3_Sub26) Static172.aClass69_97.method2289(); local285 != null; local285 = (Class3_Sub26) Static172.aClass69_97.method2288()) {
			Static129.method2502(local285.anInt4307, local285.anInt4314, 15, local11);
			Static129.method2502(local285.anInt4307, local285.anInt4314, 13, local11);
			Static129.method2502(local285.anInt4307, local285.anInt4314, 11, local11);
			Static129.method2502(local285.anInt4307, local285.anInt4314, 9, local11);
			Static241.aClass3_Sub2_Sub1_Sub1Array13[local285.anInt4308].method1423(local285.anInt4307 - 7, local285.anInt4314 + -7);
		}
		Static172.aClass69_97.method2278();
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)V")
	public static void method3993(@OriginalArg(0) int arg0) {
		Static149.anIntArray338 = new int[arg0];
		Static267.anIntArray518 = new int[arg0];
		Static243.anIntArray476 = new int[arg0];
		Static50.anIntArray134 = new int[arg0];
		Static79.anIntArray205 = new int[arg0];
	}
}
