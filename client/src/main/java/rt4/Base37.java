package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Base37 {
    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IJ)Lclient!na;")
    public static JagString decode37(@OriginalArg(1) long arg0) {
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            @Pc(32) int local32 = 0;
            @Pc(34) long local34 = arg0;
            while (local34 != 0L) {
                local34 /= 37L;
                local32++;
            }
            @Pc(48) byte[] local48 = new byte[local32];
            while (arg0 != 0L) {
                @Pc(65) long local65 = arg0;
                arg0 /= 37L;
                local32--;
                local48[local32] = Static31.aByteArray12[(int) (local65 - arg0 * 37L)];
            }
            @Pc(88) JagString local88 = new JagString();
            local88.chars = local48;
            local88.length = local48.length;
            return local88;
        }
    }
}
