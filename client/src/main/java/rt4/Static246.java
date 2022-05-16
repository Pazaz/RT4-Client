package rt4;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!u", name = "i", descriptor = "I")
	public static int anInt5393;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
	public static void method4239() {
		for (@Pc(9) SpotAnimNode local9 = (SpotAnimNode) Static99.aClass69_64.head(); local9 != null; local9 = (SpotAnimNode) Static99.aClass69_64.next()) {
			@Pc(15) SpotAnim local15 = local9.aClass8_Sub2_1;
			if (local15.anInt606 != Player.level || local15.aBoolean41) {
				local9.unlink();
			} else if (local15.anInt590 <= client.loop) {
				local15.method558(Static178.anInt4247);
				if (local15.aBoolean41) {
					local9.unlink();
				} else {
					Static43.method1141(local15.anInt606, local15.anInt604, local15.anInt598, local15.anInt599, 60, local15, 0, -1L, false);
				}
			}
		}
	}

}
