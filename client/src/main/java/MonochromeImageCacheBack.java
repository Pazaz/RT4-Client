import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class MonochromeImageCacheBack {

	@OriginalMember(owner = "client!a", name = "b", descriptor = "[I")
	public static final int[] anIntArray1 = new int[4096];

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray1[local4] = Static273.method3211(local4);
		}
	}
}
