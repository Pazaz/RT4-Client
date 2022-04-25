package rt4;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class ChangeLocRequest {
    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static void loop() {
        for (@Pc(10) Class3_Sub7 local10 = (Class3_Sub7) Static26.aClass69_27.method2289(); local10 != null; local10 = (Class3_Sub7) Static26.aClass69_27.method2288()) {
            if (local10.anInt924 > 0) {
                local10.anInt924--;
            }
            if (local10.anInt924 != 0) {
                if (local10.anInt925 > 0) {
                    local10.anInt925--;
                }
                if (local10.anInt925 == 0 && local10.anInt928 >= 1 && local10.anInt916 >= 1 && local10.anInt928 <= 102 && local10.anInt916 <= 102 && (local10.anInt929 < 0 || Static113.method3557(local10.anInt929, local10.anInt926))) {
                    Static79.method1698(local10.anInt929, local10.anInt928, local10.anInt918, local10.anInt922, local10.anInt916, local10.anInt926, local10.anInt927);
                    local10.anInt925 = -1;
                    if (local10.anInt921 == local10.anInt929 && local10.anInt921 == -1) {
                        local10.unlink();
                    } else if (local10.anInt929 == local10.anInt921 && local10.anInt922 == local10.anInt923 && local10.anInt920 == local10.anInt926) {
                        local10.unlink();
                    }
                }
            } else if (local10.anInt921 < 0 || Static113.method3557(local10.anInt921, local10.anInt920)) {
                Static79.method1698(local10.anInt921, local10.anInt928, local10.anInt918, local10.anInt923, local10.anInt916, local10.anInt920, local10.anInt927);
                local10.unlink();
            }
        }
    }
}
