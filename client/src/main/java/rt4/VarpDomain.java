package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class VarpDomain {
    @OriginalMember(owner = "client!gj", name = "q", descriptor = "[I")
    public static final int[] updatedVarps = new int[32];
    @OriginalMember(owner = "client!ic", name = "e", descriptor = "[I")
	public static final int[] varp = new int[3500];
    @OriginalMember(owner = "client!ah", name = "j", descriptor = "[I")
    public static final int[] activeVarps = new int[3500];
    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int updatedVarpsWriterIndex = 0;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BII)V")
    public static void set(@OriginalArg(1) int value, @OriginalArg(2) int id) {
        varp[id] = value;
        @Pc(20) LongNode local20 = (LongNode) Static199.aClass133_20.get((long) id);
        if (local20 == null) {
            local20 = new LongNode(4611686018427387905L);
            Static199.aClass133_20.put(local20, (long) id);
        } else if (local20.value != 4611686018427387905L) {
            local20.value = MonotonicClock.currentTimeMillis() + 500L | 0x4000000000000000L;
        }
    }
}
