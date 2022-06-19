package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class MathUtils {

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "[I")
	public static final int[] sin = new int[2048];

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "[I")
	public static final int[] reciprical16 = new int[2048];

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "[I")
	private static final int[] reciprical15 = new int[512];

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "[I")
	public static final int[] cos = new int[2048];

	static {
		@Pc(33) int i;
		for (i = 1; i < 512; i++) {
			reciprical15[i] = 32768 / i;
		}
		for (i = 1; i < 2048; i++) {
			reciprical16[i] = 65536 / i;
		}
		for (i = 0; i < 2048; i++) {
			sin[i] = (int) (Math.sin((double) i * 0.0030679615D) * 65536.0D);
			cos[i] = (int) (Math.cos((double) i * 0.0030679615D) * 65536.0D);
		}
	}

	public static int clamp(int min, int max, int value) {
		return Math.max(min, Math.min(max, value));
	}
}
