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
    @OriginalMember(owner = "client!qc", name = "K", descriptor = "Lclient!sc;")
    public static HashTable aClass133_20 = new HashTable(16);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BII)V")
    public static void set(@OriginalArg(1) int value, @OriginalArg(2) int id) {
        varp[id] = value;
        @Pc(20) LongNode local20 = (LongNode) aClass133_20.get((long) id);
        if (local20 == null) {
            local20 = new LongNode(4611686018427387905L);
            aClass133_20.put(local20, (long) id);
        } else if (local20.value != 4611686018427387905L) {
            local20.value = MonotonicClock.currentTimeMillis() + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "(I)V")
    public static void reset() {
        for (@Pc(3) int local3 = 0; local3 < VarpTypeList.anInt4043; local3++) {
            @Pc(19) VarpType local19 = VarpTypeList.get(local3);
            if (local19 != null && local19.clientCode == 0) {
                varp[local3] = 0;
                activeVarps[local3] = 0;
            }
        }
        aClass133_20 = new HashTable(16);
    }
}
