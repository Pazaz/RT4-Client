import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
	public static int anInt2512;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!na;B)Z")
	public static boolean method1965(@OriginalArg(0) JagString arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < Static9.anInt178; local12++) {
			if (arg0.equalsIgnoreCase(Static122.aClass100Array92[local12])) {
				return true;
			}
		}
		if (arg0.equalsIgnoreCase(PlayerList.self.username)) {
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IJBLclient!na;ISLclient!na;I)V")
	public static void method1966(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(3) JagString arg2, @OriginalArg(4) int arg3, @OriginalArg(5) short arg4, @OriginalArg(6) JagString arg5, @OriginalArg(7) int arg6) {
		if (Static60.aBoolean108 || Static231.anInt5204 >= 500) {
			return;
		}
		Static254.aClass100Array168[Static231.anInt5204] = arg5;
		Static233.aClass100Array160[Static231.anInt5204] = arg2;
		Static190.anIntArray382[Static231.anInt5204] = arg0 == -1 ? Static35.anInt1092 : arg0;
		Static39.aShortArray6[Static231.anInt5204] = arg4;
		Static159.aLongArray5[Static231.anInt5204] = arg1;
		Static196.anIntArray408[Static231.anInt5204] = arg3;
		Static56.anIntArray142[Static231.anInt5204] = arg6;
		Static231.anInt5204++;
	}
}
