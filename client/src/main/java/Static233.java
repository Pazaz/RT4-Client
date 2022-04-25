import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!t", name = "l", descriptor = "Lclient!ma;")
	public static BufferedSocket aClass95_4;

	@OriginalMember(owner = "client!t", name = "o", descriptor = "I")
	public static int anInt5217;

	@OriginalMember(owner = "client!t", name = "A", descriptor = "I")
	public static int anInt5225;

	@OriginalMember(owner = "client!t", name = "G", descriptor = "[Lclient!ek;")
	public static SoftwareIndexedSprite[] aClass36_Sub1Array1;

	@OriginalMember(owner = "client!t", name = "v", descriptor = "[Lclient!na;")
	public static final JagString[] aClass100Array160 = new JagString[500];

	@OriginalMember(owner = "client!t", name = "w", descriptor = "[J")
	public static final long[] aLongArray9 = new long[100];

    @OriginalMember(owner = "client!t", name = "y", descriptor = "I")
	public static int loadingScreenState = 0;

	@OriginalMember(owner = "client!t", name = "z", descriptor = "I")
	public static int anInt5224 = 0;

	@OriginalMember(owner = "client!t", name = "C", descriptor = "Lclient!na;")
	public static final JagString aClass100_994 = JagString.parse(")3");

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIZIII)V")
	public static void method4000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = 0;
		@Pc(5) Class102[] local5 = Static143.aClass102Array1;
		while (local5.length > local3) {
			@Pc(17) Class102 local17 = local5[local3];
			if (local17 != null && local17.anInt4058 == 2) {
				Static198.method1026(arg0 >> 1, arg4, (local17.anInt4046 - Static142.originZ << 7) + local17.anInt4047, local17.anInt4050 * 2, arg2 >> 1, local17.anInt4045 + (local17.anInt4053 - Static225.originX << 7), arg3);
				if (Static65.anInt1951 > -1 && client.loop % 20 < 10) {
					Sprites.headhints[local17.anInt4048].method1423(arg1 + Static65.anInt1951 - 12, arg5 + -28 - -Static16.anInt548);
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
			local21 = Static19.underWaterLocationsMapFilesBuffer;
			local19 = 1;
		} else {
			local19 = 4;
			local21 = Static156.locationMapFilesBuffer;
		}
		for (@Pc(29) int local29 = 0; local29 < local19; local29++) {
			client.audioLoop();
			for (@Pc(36) int local36 = 0; local36 < 13; local36++) {
				for (@Pc(43) int local43 = 0; local43 < 13; local43++) {
					@Pc(56) int local56 = Static187.anIntArrayArrayArray18[local29][local36][local43];
					if (local56 != -1) {
						@Pc(67) int local67 = local56 >> 24 & 0x3;
						if (!arg0 || local67 == 0) {
							@Pc(77) int local77 = local56 >> 1 & 0x3;
							@Pc(83) int local83 = local56 >> 14 & 0x3FF;
							@Pc(89) int local89 = local56 >> 3 & 0x7FF;
							@Pc(99) int local99 = local89 / 8 + (local83 / 8 << 8);
							for (@Pc(101) int local101 = 0; local101 < Static238.regionBitPacked.length; local101++) {
								if (Static238.regionBitPacked[local101] == local99 && local21[local101] != null) {
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

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BJII)Z")
	public static boolean method4003(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = (int) arg0 >> 14 & 0x1F;
		@Pc(24) int local24 = (int) arg0 >> 20 & 0x3;
		@Pc(31) int local31 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
		if (local12 == 10 || local12 == 11 || local12 == 22) {
			@Pc(46) LocType local46 = LocTypeList.get(local31);
			@Pc(62) int local62;
			@Pc(59) int local59;
			if (local24 == 0 || local24 == 2) {
				local59 = local46.length;
				local62 = local46.width;
			} else {
				local59 = local46.width;
				local62 = local46.length;
			}
			@Pc(73) int local73 = local46.blockedSides;
			if (local24 != 0) {
				local73 = (local73 << local24 & 0xF) + (local73 >> 4 - local24);
			}
			Static102.method2075(PlayerList.self.movementQueueZ[0], 0, local59, true, local73, arg2, local62, 0, 2, arg1, PlayerList.self.movementQueueX[0]);
		} else {
			Static102.method2075(PlayerList.self.movementQueueZ[0], local24, 0, true, 0, arg2, 0, local12 + 1, 2, arg1, PlayerList.self.movementQueueX[0]);
		}
		Cross.y = Mouse.clickY;
		Cross.milliseconds = 0;
		Cross.type = 2;
		Cross.x = Mouse.clickX;
		return true;
	}

}
