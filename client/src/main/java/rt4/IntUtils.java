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
}
