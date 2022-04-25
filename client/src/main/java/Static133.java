import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
	public static int anInt5230;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "[Lclient!cl;")
	public static final AnimFrameset[] aClass3_Sub2_Sub7Array7 = new AnimFrameset[14];

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "[I")
	public static final int[] anIntArray453 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
	public static int anInt5235 = 0;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(III)Lclient!ec;")
	public static Scenery method4008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Tile local7 = SceneGraph.tiles[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt662; local13++) {
			@Pc(22) Scenery local22 = local7.aClass31Array1[local13];
			if ((local22.aLong56 >> 29 & 0x3L) == 2L && local22.anInt1701 == arg1 && local22.anInt1696 == arg2) {
				return local22;
			}
		}
		return null;
	}

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIBII)V")
	public static void method4012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) int local12 = 0; local12 < InterfaceList.anInt766; local12++) {
			if (Static224.anIntArray443[local12] + Static264.anIntArray410[local12] > arg0 && arg1 + arg0 > Static264.anIntArray410[local12] && arg2 < Static67.anIntArray320[local12] + Static50.anIntArray133[local12] && Static50.anIntArray133[local12] < arg2 + arg3) {
				Static186.aBooleanArray100[local12] = true;
			}
		}
	}
}
