import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "[Z")
	public static boolean[] aBooleanArray60;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "[I")
	public static int[] anIntArray264;

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "[I")
	public static int[] anIntArray266;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "[I")
	public static final int[] anIntArray267 = new int[] { 256, 128, 86, 64 };

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([II)I")
	public static int method2268(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0[arg1];
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MIN_VALUE;
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			@Pc(16) int local16 = arg0[local9];
			if (local16 < local3 && local16 > local7) {
				local5 = local9;
				local7 = local16;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "([II)I")
	public static int method2270(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0[arg1];
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			@Pc(16) int local16 = arg0[local9];
			if (local16 > local3 && local16 < local7) {
				local5 = local9;
				local7 = local16;
			}
		}
		return local5;
	}
}
