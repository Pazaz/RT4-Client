package rt4;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Equipment {
    @OriginalMember(owner = "client!ta", name = "p", descriptor = "[I")
    public static int[] anIntArray455;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void init() {
        @Pc(8) int[] local8 = new int[ObjTypeList.anInt3245];
        @Pc(10) int local10 = 0;
        @Pc(12) int local12;
        for (local12 = 0; local12 < ObjTypeList.anInt3245; local12++) {
            @Pc(19) ObjType local19 = ObjTypeList.get(local12);
            if (local19.manWear1 >= 0 || local19.womanWear1 >= 0) {
                local8[local10++] = local12;
            }
        }
        anIntArray455 = new int[local10];
        for (local12 = 0; local12 < local10; local12++) {
            anIntArray455[local12] = local8[local12];
        }
    }
}
