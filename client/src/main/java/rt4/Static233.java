package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!t", name = "o", descriptor = "I")
	public static int anInt5217;

	@OriginalMember(owner = "client!t", name = "A", descriptor = "I")
	public static int anInt5225;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIZIII)V")
	public static void method4000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = 0;
		@Pc(5) MapMarker[] local5 = MiniMap.hintMapMarkers;
		while (local5.length > local3) {
			@Pc(17) MapMarker local17 = local5[local3];
			if (local17 != null && local17.type == 2) {
				ScriptRunner.method1026(arg0 >> 1, arg4, (local17.anInt4046 - Camera.originZ << 7) + local17.anInt4047, local17.anInt4050 * 2, arg2 >> 1, local17.anInt4045 + (local17.targetX - Camera.originX << 7), arg3);
				if (ScriptRunner.anInt1951 > -1 && client.loop % 20 < 10) {
					Sprites.headhints[local17.anInt4048].render(arg1 + ScriptRunner.anInt1951 - 12, arg5 + -28 - -ScriptRunner.anInt548);
				}
			}
			local3++;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZB)V")
	public static void method4002(@OriginalArg(0) boolean arg0) {
		@Pc(19) byte local19;
		@Pc(21) byte[][] local21;
		if (GlRenderer.enabled && arg0) {
			local21 = LoginManager.underWaterLocationsMapFilesBuffer;
			local19 = 1;
		} else {
			local19 = 4;
			local21 = LoginManager.locationMapFilesBuffer;
		}
		for (@Pc(29) int local29 = 0; local29 < local19; local29++) {
			client.audioLoop();
			for (@Pc(36) int local36 = 0; local36 < 13; local36++) {
				for (@Pc(43) int local43 = 0; local43 < 13; local43++) {
					@Pc(56) int local56 = Protocol.anIntArrayArrayArray18[local29][local36][local43];
					if (local56 != -1) {
						@Pc(67) int local67 = local56 >> 24 & 0x3;
						if (!arg0 || local67 == 0) {
							@Pc(77) int local77 = local56 >> 1 & 0x3;
							@Pc(83) int local83 = local56 >> 14 & 0x3FF;
							@Pc(89) int local89 = local56 >> 3 & 0x7FF;
							@Pc(99) int local99 = local89 / 8 + (local83 / 8 << 8);
							for (@Pc(101) int local101 = 0; local101 < LoginManager.regionBitPacked.length; local101++) {
								if (LoginManager.regionBitPacked[local101] == local99 && local21[local101] != null) {
									method3771(PathFinder.collisionMaps, local29, local21[local101], local67, local77, local36 * 8, local43 * 8, arg0, (local83 & 0x7) * 8, (local89 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "([Lclient!mj;I[BIIIIZIIB)V")
	public static void method3771(@OriginalArg(0) CollisionMap[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = -1;
		@Pc(12) Buffer local12 = new Buffer(arg2);
		while (true) {
			@Pc(20) int local20 = local12.gVarSmart();
			if (local20 == 0) {
				return;
			}
			local7 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local12.gsmarts();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(50) int local50 = local31 & 0x3F;
				@Pc(56) int local56 = local31 >> 6 & 0x3F;
				@Pc(60) int local60 = local31 >> 12;
				@Pc(64) int local64 = local12.g1();
				@Pc(68) int local68 = local64 >> 2;
				@Pc(72) int local72 = local64 & 0x3;
				if (arg3 == local60 && local56 >= arg8 && local56 < arg8 + 8 && arg9 <= local50 && arg9 + 8 > local50) {
					@Pc(103) LocType local103 = LocTypeList.get(local7);
					@Pc(120) int local120 = method1286(local50 & 0x7, arg4, local72, local103.length, local103.width, local56 & 0x7) + arg5;
					@Pc(137) int local137 = method4541(local103.width, arg4, local103.length, local56 & 0x7, local72, local50 & 0x7) + arg6;
					if (local120 > 0 && local137 > 0 && local120 < 103 && local137 < 103) {
						@Pc(154) CollisionMap local154 = null;
						if (!arg7) {
							@Pc(159) int local159 = arg1;
							if ((SceneGraph.tileFlags[1][local120][local137] & 0x2) == 2) {
								local159 = arg1 - 1;
							}
							if (local159 >= 0) {
								local154 = arg0[local159];
							}
						}
						SceneGraph.method3397(arg1, !arg7, arg1, arg7, local154, local7, local68, local120, local137, local72 + arg4 & 0x3);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIII)I")
	public static int method1286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(10) int local10 = arg4;
			arg4 = arg3;
			arg3 = local10;
		}
		@Pc(18) int local18 = arg1 & 0x3;
		if (local18 == 0) {
			return arg5;
		} else if (local18 == 1) {
			return arg0;
		} else if (local18 == 2) {
			return 7 + 1 - arg5 - arg4;
		} else {
			return 7 + 1 - arg0 - arg3;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIBIIII)I")
	public static int method4541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(9) int local9 = arg0;
			arg0 = arg2;
			arg2 = local9;
		}
		@Pc(29) int local29 = arg1 & 0x3;
		if (local29 == 0) {
			return arg5;
		} else if (local29 == 1) {
			return 7 + 1 - arg3 - arg0;
		} else if (local29 == 2) {
			return 1 + 7 - arg2 - arg5;
		} else {
			return arg3;
		}
	}
}
