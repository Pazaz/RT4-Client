package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class ChangeLocRequest {
    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static void loop() {
        for (@Pc(10) SceneryStack local10 = (SceneryStack) Static26.sceneryList.head(); local10 != null; local10 = (SceneryStack) Static26.sceneryList.next()) {
            if (local10.anInt924 > 0) {
                local10.anInt924--;
            }
            if (local10.anInt924 != 0) {
                if (local10.anInt925 > 0) {
                    local10.anInt925--;
                }
                if (local10.anInt925 == 0 && local10.x >= 1 && local10.z >= 1 && local10.x <= 102 && local10.z <= 102 && (local10.anInt929 < 0 || Static113.method3557(local10.anInt929, local10.anInt926))) {
                    Static79.method1698(local10.anInt929, local10.x, local10.level, local10.anInt922, local10.z, local10.anInt926, local10.anInt927);
                    local10.anInt925 = -1;
                    if (local10.anInt921 == local10.anInt929 && local10.anInt921 == -1) {
                        local10.unlink();
                    } else if (local10.anInt929 == local10.anInt921 && local10.anInt922 == local10.anInt923 && local10.anInt920 == local10.anInt926) {
                        local10.unlink();
                    }
                }
            } else if (local10.anInt921 < 0 || Static113.method3557(local10.anInt921, local10.anInt920)) {
                Static79.method1698(local10.anInt921, local10.x, local10.level, local10.anInt923, local10.z, local10.anInt920, local10.anInt927);
                local10.unlink();
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIIIII)V")
    public static void push(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
        @Pc(9) SceneryStack local9 = null;
        for (@Pc(14) SceneryStack local14 = (SceneryStack) Static26.sceneryList.head(); local14 != null; local14 = (SceneryStack) Static26.sceneryList.next()) {
            if (local14.level == arg0 && arg3 == local14.x && local14.z == arg1 && arg6 == local14.anInt927) {
                local9 = local14;
                break;
            }
        }
        if (local9 == null) {
            local9 = new SceneryStack();
            local9.x = arg3;
            local9.z = arg1;
            local9.level = arg0;
            local9.anInt927 = arg6;
            Static226.method3898(local9);
            Static26.sceneryList.addTail(local9);
        }
        local9.anInt926 = arg7;
        local9.anInt925 = arg8;
        local9.anInt924 = arg4;
        local9.anInt929 = arg5;
        local9.anInt922 = arg2;
    }
}
