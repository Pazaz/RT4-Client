package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("signlink!ad")
public final class MonotonicClock {

	@OriginalMember(owner = "signlink!ad", name = "a", descriptor = "J")
	private static long leapMillis;

	@OriginalMember(owner = "signlink!ad", name = "b", descriptor = "J")
	private static long previous;

	@OriginalMember(owner = "signlink!ad", name = "a", descriptor = "(B)J")
	public static synchronized long currentTimeMillis() {
		@Pc(1) long now = System.currentTimeMillis();
		if (previous > now) {
			leapMillis += previous - now;
		}
		previous = now;
		return leapMillis + now;
	}
}
