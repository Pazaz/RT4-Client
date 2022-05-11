package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static111 {

	@OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
	public static int anInt2910;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!be;III)V")
	public static void method2291(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.xMode == 0) {
			arg0.y = arg0.baseY;
		} else if (arg0.xMode == 1) {
			arg0.y = (arg1 - arg0.height) / 2 + arg0.baseY;
		} else if (arg0.xMode == 2) {
			arg0.y = arg1 - arg0.height - arg0.baseY;
		} else if (arg0.xMode == 3) {
			arg0.y = arg0.baseY * arg1 >> 14;
		} else if (arg0.xMode == 4) {
			arg0.y = (arg1 * arg0.baseY >> 14) + (arg1 - arg0.height) / 2;
		} else {
			arg0.y = arg1 - (arg1 * arg0.baseY >> 14) - arg0.height;
		}
		if (arg0.yMode == 0) {
			arg0.x = arg0.baseX;
		} else if (arg0.yMode == 1) {
			arg0.x = arg0.baseX + (arg2 - arg0.width) / 2;
		} else if (arg0.yMode == 2) {
			arg0.x = arg2 - arg0.baseX - arg0.width;
		} else if (arg0.yMode == 3) {
			arg0.x = arg0.baseX * arg2 >> 14;
		} else if (arg0.yMode == 4) {
			arg0.x = (arg0.baseX * arg2 >> 14) + (arg2 - arg0.width) / 2;
		} else {
			arg0.x = arg2 - (arg2 * arg0.baseX >> 14) - arg0.width;
		}
		if (!Static121.aBoolean154 || InterfaceList.getServerActiveProperties(arg0).accessMask == 0 && arg0.type != 0) {
			return;
		}
		if (arg0.y < 0) {
			arg0.y = 0;
		} else if (arg0.height + arg0.y > arg1) {
			arg0.y = arg1 - arg0.height;
		}
		if (arg0.x < 0) {
			arg0.x = 0;
		} else if (arg2 < arg0.x + arg0.width) {
			arg0.x = arg2 - arg0.width;
		}
	}

}
