import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!v", name = "b", descriptor = "Lclient!be;")
	public static Component aClass13_7;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "Lclient!na;")
	public static final JagString aClass100_98 = JagString.parse(")4a=");

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Tile local7 = SceneGraph.tiles[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass77_1 != null && local7.aClass77_1.key == arg3) {
			return true;
		} else if (local7.aClass24_1 != null && local7.aClass24_1.key == arg3) {
			return true;
		} else if (local7.aClass15_1 != null && local7.aClass15_1.aLong26 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt662; local46++) {
				if (local7.aClass31Array1[local46].aLong56 == arg3) {
					return true;
				}
			}
			return false;
		}
	}

}
