package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static143 {

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "[Lclient!nc;")
	public static final MapMarker[] hintMapMarkers = new MapMarker[4];

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
	public static int anInt3484 = -1;

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "Lclient!na;")
	public static final JagString aClass100_668 = JagString.parse("Hidden)2use");

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
	public static int anInt3486 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIZI)V")
	public static void method2731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static230.anInt5158 = arg1;
		Static59.anInt1815 = arg4;
		Static254.anInt5559 = arg0;
		Static12.anInt406 = arg3;
		Static199.anInt4675 = arg2;
	}

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)I")
	public static int toUpperCase(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
			return arg0 - 32;
		} else if (arg0 == 255) {
			return 159;
		} else if (arg0 == 156) {
			return 140;
		} else {
			return arg0;
		}
	}
}
