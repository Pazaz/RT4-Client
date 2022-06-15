package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class IntUtils {
    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(III)I")
    public static int pow(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        @Pc(15) int local15 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                local15 *= arg1;
            }
            arg1 *= arg1;
            arg0 >>= 0x1;
        }
        if (arg0 == 1) {
            return local15 * arg1;
        } else {
            return local15;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)I")
    public static int clp2(@OriginalArg(1) int arg0) {
        @Pc(0) int local0 = arg0 - 1;
        @Pc(6) int local6 = local0 | local0 >>> 1;
        @Pc(22) int local22 = local6 | local6 >>> 2;
        @Pc(28) int local28 = local22 | local22 >>> 4;
        @Pc(34) int local34 = local28 | local28 >>> 8;
        @Pc(40) int local40 = local34 | local34 >>> 16;
        return local40 + 1;
    }
}
