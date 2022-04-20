import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("signlink!ad")
public final class MonotonicClock {

	@OriginalMember(owner = "signlink!ad", name = "a", descriptor = "J")
	private static long aLong1312;

	@OriginalMember(owner = "signlink!ad", name = "b", descriptor = "J")
	private static long aLong1313;

	@OriginalMember(owner = "signlink!ad", name = "a", descriptor = "(B)J")
	public static synchronized long currentTimeMillis() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong1313 > local1) {
			aLong1312 += aLong1313 - local1;
		}
		aLong1313 = local1;
		return aLong1312 + local1;
	}
}
