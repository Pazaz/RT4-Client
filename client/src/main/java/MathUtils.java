import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class MathUtils {

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "[I")
	public static final int[] anIntArray223 = new int[2048];

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "[I")
	public static final int[] anIntArray224 = new int[2048];

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "[I")
	private static final int[] anIntArray222 = new int[512];

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "[I")
	public static final int[] anIntArray225 = new int[2048];

	static {
		@Pc(33) int local33;
		for (local33 = 1; local33 < 512; local33++) {
			anIntArray222[local33] = 32768 / local33;
		}
		for (local33 = 1; local33 < 2048; local33++) {
			anIntArray224[local33] = 65536 / local33;
		}
		for (local33 = 0; local33 < 2048; local33++) {
			anIntArray223[local33] = (int) (Math.sin((double) local33 * 0.0030679615D) * 65536.0D);
			anIntArray225[local33] = (int) (Math.cos((double) local33 * 0.0030679615D) * 65536.0D);
		}
	}
}
