package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Random;

public class RandomUtils {
	@OriginalMember(owner = "client!d", name = "c", descriptor = "(III)I")
	public static int shuffle(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg1 - 1 & arg0 >> 31;
		return local11 + (arg0 + (arg0 >>> 31)) % arg1;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BILjava/util/Random;)I")
	public static int nextInt(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (IntUtils.isPowerOfTwo(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(38) int local38 = Integer.MIN_VALUE - (int) (0x100000000L % (long) arg0);
			@Pc(41) int local41;
			do {
				local41 = arg1.nextInt();
			} while (local38 <= local41);
			return shuffle(local41, arg0);
		}
	}
}
