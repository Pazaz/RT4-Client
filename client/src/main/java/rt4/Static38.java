package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

    @OriginalMember(owner = "client!di", name = "q", descriptor = "[Lclient!na;")
    public static final JagString[] aClass100Array53 = new JagString[5];
    @OriginalMember(owner = "client!cn", name = "B", descriptor = "I")
	public static int anInt1196 = 1;

	@OriginalMember(owner = "client!cn", name = "L", descriptor = "I")
	public static double yawAccel = 0;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BIIIIIIII)V")
	public static void method959(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(11) int local11 = 0; local11 < WorldMap.labels.anInt5074; local11++) {
			if (WorldMap.labels.method3890(local11)) {
				@Pc(32) int local32 = WorldMap.labels.aShortArray73[local11] - WorldMap.originX;
				@Pc(43) int local43 = WorldMap.originZ + WorldMap.length - WorldMap.labels.aShortArray72[local11] - 1;
				@Pc(59) int local59 = arg0 + (arg3 - arg0) * (local32 - arg2) / (arg6 - arg2);
				@Pc(64) int local64 = WorldMap.labels.method3894(local11);
				@Pc(80) int local80 = (arg7 - arg1) * (local43 - arg5) / (arg4 - arg5) + arg1;
				@Pc(82) int local82 = 16777215;
				@Pc(84) WorldMapFont local84 = null;
				if (local64 == 0) {
					if ((double) WorldMap.zoom == 3.0D) {
						local84 = WorldMap.font11;
					}
					if ((double) WorldMap.zoom == 4.0D) {
						local84 = WorldMap.font12;
					}
					if ((double) WorldMap.zoom == 6.0D) {
						local84 = WorldMap.font14;
					}
					if ((double) WorldMap.zoom >= 8.0D) {
						local84 = WorldMap.font17;
					}
				}
				if (local64 == 1) {
					if ((double) WorldMap.zoom == 3.0D) {
						local84 = WorldMap.font14;
					}
					if ((double) WorldMap.zoom == 4.0D) {
						local84 = WorldMap.font17;
					}
					if ((double) WorldMap.zoom == 6.0D) {
						local84 = WorldMap.font19;
					}
					if ((double) WorldMap.zoom >= 8.0D) {
						local84 = WorldMap.font22;
					}
				}
				if (local64 == 2) {
					if ((double) WorldMap.zoom == 3.0D) {
						local84 = WorldMap.font19;
					}
					local82 = 16755200;
					if ((double) WorldMap.zoom == 4.0D) {
						local84 = WorldMap.font22;
					}
					if ((double) WorldMap.zoom == 6.0D) {
						local84 = WorldMap.font26;
					}
					if ((double) WorldMap.zoom >= 8.0D) {
						local84 = WorldMap.font30;
					}
				}
				if (WorldMap.labels.anIntArray444[local11] != -1) {
					local82 = WorldMap.labels.anIntArray444[local11];
				}
				if (local84 != null) {
					@Pc(211) int local211 = Fonts.p11Full.splitParagraph(WorldMap.labels.aClass100Array153[local11], null, aClass100Array53);
					local80 -= local84.method1503() * (local211 - 1) / 2;
					local80 += local84.method1511() / 2;
					for (@Pc(231) int local231 = 0; local231 < local211; local231++) {
						@Pc(242) JagString local242 = aClass100Array53[local231];
						if (local211 - 1 > local231) {
							local242.method3133(local242.length() - 4);
						}
						local84.renderStringCenter(local242, local59, local80, local82);
						local80 += local84.method1503();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BB)V")
	public static void method960(@OriginalArg(0) byte arg0) {
		if (Static266.aByteArrayArrayArray15 == null) {
			Static266.aByteArrayArrayArray15 = new byte[4][104][104];
		}
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			for (@Pc(25) int local25 = 0; local25 < 104; local25++) {
				for (@Pc(32) int local32 = 0; local32 < 104; local32++) {
					Static266.aByteArrayArrayArray15[local20][local25][local32] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method962(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg7 && arg2 == arg6 && arg4 == arg3 && arg0 == arg5) {
			Static241.method4547(arg1, arg5, arg6, arg4, arg8);
			return;
		}
		@Pc(37) int local37 = arg6;
		@Pc(39) int local39 = arg8;
		@Pc(43) int local43 = arg8 * 3;
		@Pc(47) int local47 = arg6 * 3;
		@Pc(51) int local51 = arg7 * 3;
		@Pc(55) int local55 = arg2 * 3;
		@Pc(59) int local59 = arg3 * 3;
		@Pc(63) int local63 = arg0 * 3;
		@Pc(73) int local73 = arg4 + local51 - local59 - arg8;
		@Pc(83) int local83 = arg5 + local55 - arg6 - local63;
		@Pc(93) int local93 = local43 + local59 - local51 - local51;
		@Pc(103) int local103 = local47 + local63 - local55 - local55;
		@Pc(108) int local108 = local51 - local43;
		@Pc(113) int local113 = local55 - local47;
		for (@Pc(115) int local115 = 128; local115 <= 4096; local115 += 128) {
			@Pc(126) int local126 = local115 * local115 >> 12;
			@Pc(132) int local132 = local115 * local126 >> 12;
			@Pc(136) int local136 = local83 * local132;
			@Pc(140) int local140 = local126 * local93;
			@Pc(144) int local144 = local73 * local132;
			@Pc(148) int local148 = local126 * local103;
			@Pc(152) int local152 = local108 * local115;
			@Pc(156) int local156 = local113 * local115;
			@Pc(167) int local167 = (local152 + local144 + local140 >> 12) + arg8;
			@Pc(177) int local177 = arg6 + (local156 + local136 + local148 >> 12);
			Static241.method4547(arg1, local177, local37, local167, local39);
			local39 = local167;
			local37 = local177;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZI)I")
	public static int poll(@OriginalArg(0) boolean arg0) {
		@Pc(4) long local4 = MonotonicClock.currentTimeMillis();
		for (@Pc(28) LongNode local28 = arg0 ? (LongNode) VarpDomain.aClass133_20.head() : (LongNode) VarpDomain.aClass133_20.next(); local28 != null; local28 = (LongNode) VarpDomain.aClass133_20.next()) {
			if ((local28.value & 0x3FFFFFFFFFFFFFFFL) < local4) {
				if ((local28.value & 0x4000000000000000L) != 0L) {
					@Pc(58) int local58 = (int) local28.key;
					VarpDomain.activeVarps[local58] = VarpDomain.varp[local58];
					local28.unlink();
					return local58;
				}
				local28.unlink();
			}
		}
		return -1;
	}

}