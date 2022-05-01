package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static200 {

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)V")
	public static void method3628(@OriginalArg(1) int arg0) {
		Static231.anInt5204--;
		if (Static231.anInt5204 == arg0) {
			return;
		}
		ArrayUtils.copy(Static254.aClass100Array168, arg0 + 1, Static254.aClass100Array168, arg0, Static231.anInt5204 - arg0);
		ArrayUtils.copy(Static233.aClass100Array160, arg0 + 1, Static233.aClass100Array160, arg0, Static231.anInt5204 - arg0);
		ArrayUtils.copy(Static190.anIntArray382, arg0 + 1, Static190.anIntArray382, arg0, Static231.anInt5204 - arg0);
		ArrayUtils.copy(Static39.aShortArray6, arg0 + 1, Static39.aShortArray6, arg0, Static231.anInt5204 - arg0);
		ArrayUtils.copy(Static159.aLongArray5, arg0 + 1, Static159.aLongArray5, arg0, Static231.anInt5204 - arg0);
		ArrayUtils.copy(Static196.anIntArray408, arg0 + 1, Static196.anIntArray408, arg0, Static231.anInt5204 - arg0);
		ArrayUtils.copy(Static56.anIntArray142, arg0 + 1, Static56.anIntArray142, arg0, Static231.anInt5204 - arg0);
	}
}
