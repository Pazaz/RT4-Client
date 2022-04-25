import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)Lclient!ec;")
	public static Scenery method3996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Tile local7 = SceneGraph.tiles[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt662; local13++) {
			@Pc(22) Scenery local22 = local7.aClass31Array1[local13];
			if ((local22.aLong56 >> 29 & 0x3L) == 2L && local22.anInt1701 == arg1 && local22.anInt1696 == arg2) {
				Static266.method4193(local22);
				return local22;
			}
		}
		return null;
	}

}
