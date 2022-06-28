package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!t", name = "o", descriptor = "I")
	public static int anInt5217;

	@OriginalMember(owner = "client!t", name = "A", descriptor = "I")
	public static int anInt5225;

	@OriginalMember(owner = "client!t", name = "G", descriptor = "[Lclient!ek;")
	public static SoftwareIndexedSprite[] aClass36_Sub1Array1;

	@OriginalMember(owner = "client!t", name = "y", descriptor = "I")
	public static int loadingScreenState = 0;

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
									Static217.method3771(PathFinder.collisionMaps, local29, local21[local101], local67, local77, local36 * 8, local43 * 8, arg0, (local83 & 0x7) * 8, (local89 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

}
