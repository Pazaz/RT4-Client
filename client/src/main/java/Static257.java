import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!v", name = "b", descriptor = "Lclient!be;")
	public static Component aClass13_7;

	@OriginalMember(owner = "client!v", name = "f", descriptor = "Lclient!al;")
	public static Js5MasterIndex aClass9_2;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "Lclient!na;")
	public static final JagString aClass100_98 = Static28.parse(")4a=");

	@OriginalMember(owner = "client!v", name = "c", descriptor = "[F")
	public static final float[] aFloatArray2 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

	@OriginalMember(owner = "client!v", name = "d", descriptor = "Lclient!na;")
	public static final JagString aClass100_99 = Static28.parse("::clientdrop");

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Tile local7 = Static130.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass77_1 != null && local7.aClass77_1.aLong107 == arg3) {
			return true;
		} else if (local7.aClass24_1 != null && local7.aClass24_1.aLong52 == arg3) {
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

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZIILclient!ve;ZII)V")
	public static void method526(@OriginalArg(1) int arg0, @OriginalArg(3) Js5 arg1, @OriginalArg(5) int arg2) {
		Static172.aClass153_70 = arg1;
		Static226.anInt5085 = 0;
		Static277.anInt5853 = arg0;
		Static72.aBoolean116 = false;
		Static14.anInt441 = 1;
		Static57.anInt1757 = 2;
		Static253.anInt5527 = arg2;
	}
}
