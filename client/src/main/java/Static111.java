import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
	public static int anInt2900;

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
	public static int anInt2903;

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
	public static int anInt2905;

	@OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
	public static int anInt2910;

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
	public static int anInt2901 = 0;

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "Lclient!na;")
	public static final JagString aClass100_570 = Static28.parse(")2");

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!be;III)V")
	public static void method2291(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.xMode == 0) {
			arg0.y = arg0.baseY;
		} else if (arg0.xMode == 1) {
			arg0.y = (arg1 - arg0.anInt459) / 2 + arg0.baseY;
		} else if (arg0.xMode == 2) {
			arg0.y = arg1 - arg0.anInt459 - arg0.baseY;
		} else if (arg0.xMode == 3) {
			arg0.y = arg0.baseY * arg1 >> 14;
		} else if (arg0.xMode == 4) {
			arg0.y = (arg1 * arg0.baseY >> 14) + (arg1 - arg0.anInt459) / 2;
		} else {
			arg0.y = arg1 - (arg1 * arg0.baseY >> 14) - arg0.anInt459;
		}
		if (arg0.yMode == 0) {
			arg0.x = arg0.baseX;
		} else if (arg0.yMode == 1) {
			arg0.x = arg0.baseX + (arg2 - arg0.anInt445) / 2;
		} else if (arg0.yMode == 2) {
			arg0.x = arg2 - arg0.baseX - arg0.anInt445;
		} else if (arg0.yMode == 3) {
			arg0.x = arg0.baseX * arg2 >> 14;
		} else if (arg0.yMode == 4) {
			arg0.x = (arg0.baseX * arg2 >> 14) + (arg2 - arg0.anInt445) / 2;
		} else {
			arg0.x = arg2 - (arg2 * arg0.baseX >> 14) - arg0.anInt445;
		}
		if (!Static121.aBoolean154 || Static36.method940(arg0).anInt546 == 0 && arg0.anInt452 != 0) {
			return;
		}
		if (arg0.y < 0) {
			arg0.y = 0;
		} else if (arg0.anInt459 + arg0.y > arg1) {
			arg0.y = arg1 - arg0.anInt459;
		}
		if (arg0.x < 0) {
			arg0.x = 0;
		} else if (arg2 < arg0.x + arg0.anInt445) {
			arg0.x = arg2 - arg0.anInt445;
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
	public static void method2292() {
		@Pc(2) Mouse local2 = Static93.aClass150_1;
		synchronized (Static93.aClass150_1) {
			Static22.anInt723 = Static57.anInt1759;
			Static215.anInt4873 = Static147.anInt3521;
			Static223.anInt5032 = Static165.anInt4039;
			Static150.clickButton = Static41.anInt1313;
			Static7.clickX = Static34.anInt1034;
			Static93.anInt2467++;
			Static60.clickY = Static222.anInt4973;
			Static133.clickTime = Static209.aLong161;
			Static41.anInt1313 = 0;
		}
	}
}
