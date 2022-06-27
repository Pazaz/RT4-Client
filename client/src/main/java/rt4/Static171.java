package rt4;

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILclient!na;)I")
	public static int method3218(@OriginalArg(1) JagString arg0) {
		if (WorldMap.labels == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < WorldMap.labels.anInt5074; local20++) {
			if (WorldMap.labels.aClass100Array153[local20].method3140(WorldMap.aClass100_538, WorldMap.aClass100_872).method3142(arg0)) {
				return local20;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BILjava/util/Random;)I")
	public static int method3219(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (method3702(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(38) int local38 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(41) int local41;
			do {
				local41 = arg1.nextInt();
			} while (local38 <= local41);
			return method990(local41, arg0);
		}
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(III)I")
	public static int method990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg1 - 1 & arg0 >> 31;
		return local11 + (arg0 + (arg0 >>> 31)) % arg1;
	}

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)Z")
    public static boolean method3702(@OriginalArg(1) int arg0) {
        return arg0 == (-arg0 & arg0);
    }
}
