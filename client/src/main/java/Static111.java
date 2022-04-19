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
	public static final JagString aClass100_570 = Static28.method790(")2");

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "Lclient!na;")
	private static final JagString aClass100_571 = Static28.method790("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "Lclient!na;")
	public static final JagString aClass100_572 = Static28.method790("Interfaces charg-Bes");

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "Lclient!na;")
	public static JagString aClass100_573 = aClass100_571;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!be;III)V")
	public static void method2291(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte2 == 0) {
			arg0.anInt469 = arg0.anInt444;
		} else if (arg0.aByte2 == 1) {
			arg0.anInt469 = (arg1 - arg0.anInt459) / 2 + arg0.anInt444;
		} else if (arg0.aByte2 == 2) {
			arg0.anInt469 = arg1 - arg0.anInt459 - arg0.anInt444;
		} else if (arg0.aByte2 == 3) {
			arg0.anInt469 = arg0.anInt444 * arg1 >> 14;
		} else if (arg0.aByte2 == 4) {
			arg0.anInt469 = (arg1 * arg0.anInt444 >> 14) + (arg1 - arg0.anInt459) / 2;
		} else {
			arg0.anInt469 = arg1 - (arg1 * arg0.anInt444 >> 14) - arg0.anInt459;
		}
		if (arg0.aByte4 == 0) {
			arg0.anInt523 = arg0.anInt529;
		} else if (arg0.aByte4 == 1) {
			arg0.anInt523 = arg0.anInt529 + (arg2 - arg0.anInt445) / 2;
		} else if (arg0.aByte4 == 2) {
			arg0.anInt523 = arg2 - arg0.anInt529 - arg0.anInt445;
		} else if (arg0.aByte4 == 3) {
			arg0.anInt523 = arg0.anInt529 * arg2 >> 14;
		} else if (arg0.aByte4 == 4) {
			arg0.anInt523 = (arg0.anInt529 * arg2 >> 14) + (arg2 - arg0.anInt445) / 2;
		} else {
			arg0.anInt523 = arg2 - (arg2 * arg0.anInt529 >> 14) - arg0.anInt445;
		}
		if (!Static121.aBoolean154 || Static36.method940(arg0).anInt546 == 0 && arg0.anInt452 != 0) {
			return;
		}
		if (arg0.anInt469 < 0) {
			arg0.anInt469 = 0;
		} else if (arg0.anInt459 + arg0.anInt469 > arg1) {
			arg0.anInt469 = arg1 - arg0.anInt459;
		}
		if (arg0.anInt523 < 0) {
			arg0.anInt523 = 0;
		} else if (arg2 < arg0.anInt523 + arg0.anInt445) {
			arg0.anInt523 = arg2 - arg0.anInt445;
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
	public static void method2292() {
		@Pc(2) Mouse local2 = Static93.aClass150_1;
		synchronized (Static93.aClass150_1) {
			Static22.anInt723 = Static57.anInt1759;
			Static215.anInt4873 = Static147.anInt3521;
			Static223.anInt5032 = Static165.anInt4039;
			Static150.anInt3585 = Static41.anInt1313;
			Static7.anInt985 = Static34.anInt1034;
			Static93.anInt2467++;
			Static60.anInt1893 = Static222.anInt4973;
			Static133.aLong175 = Static209.aLong161;
			Static41.anInt1313 = 0;
		}
	}
}
