import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class MidiPlayer {
    @OriginalMember(owner = "client!le", name = "k", descriptor = "Z")
    public static boolean jingle = false;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(Z)Z")
    public static boolean method2699() {
        try {
            if (Static14.anInt441 == 2) {
                if (Static144.aClass3_Sub29_1 == null) {
                    Static144.aClass3_Sub29_1 = Song.create(Static172.aClass153_70, Static277.anInt5853, Static226.anInt5085);
                    if (Static144.aClass3_Sub29_1 == null) {
                        return false;
                    }
                }
                if (Static27.aClass89_1 == null) {
                    Static27.aClass89_1 = new SoundBank(Static78.aClass153_32, Static252.aClass153_103);
                }
                if (Static172.aClass3_Sub3_Sub4_2.method4411(Static144.aClass3_Sub29_1, Static210.aClass153_87, Static27.aClass89_1)) {
                    Static172.aClass3_Sub3_Sub4_2.method4412();
                    Static172.aClass3_Sub3_Sub4_2.method4447(Static253.anInt5527);
                    Static172.aClass3_Sub3_Sub4_2.method4431(Static72.aBoolean116, Static144.aClass3_Sub29_1);
                    Static14.anInt441 = 0;
                    Static144.aClass3_Sub29_1 = null;
                    Static27.aClass89_1 = null;
                    Static172.aClass153_70 = null;
                    return true;
                }
            }
        } catch (@Pc(68) Exception local68) {
            local68.printStackTrace();
            Static172.aClass3_Sub3_Sub4_2.method4446();
            Static172.aClass153_70 = null;
            Static144.aClass3_Sub29_1 = null;
            Static14.anInt441 = 0;
            Static27.aClass89_1 = null;
        }
        return false;
    }
}
