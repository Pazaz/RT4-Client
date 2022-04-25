import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class SoundPlayer {
    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!tk;IIZI)V")
    public static void playSeqSound(@OriginalArg(0) int arg0, @OriginalArg(1) SeqType arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
        if (Static189.anInt4451 >= 50 || (arg1.anIntArrayArray38 == null || arg4 >= arg1.anIntArrayArray38.length || arg1.anIntArrayArray38[arg4] == null)) {
            return;
        }
        @Pc(36) int local36 = arg1.anIntArrayArray38[arg4][0];
        @Pc(40) int local40 = local36 >> 8;
        @Pc(57) int local57;
        if (arg1.anIntArrayArray38[arg4].length > 1) {
            local57 = (int) ((double) arg1.anIntArrayArray38[arg4].length * Math.random());
            if (local57 > 0) {
                local40 = arg1.anIntArrayArray38[arg4][local57];
            }
        }
        @Pc(73) int local73 = local36 >> 5 & 0x7;
        @Pc(77) int local77 = local36 & 0x1F;
        if (local77 == 0) {
            if (arg3) {
                Static26.method744(local73, local40, 0);
            }
        } else if (Preferences.ambientSoundsVolume != 0) {
            Static200.anIntArray421[Static189.anInt4451] = local40;
            Static276.anIntArray563[Static189.anInt4451] = local73;
            @Pc(111) int local111 = (arg0 - 64) / 128;
            local57 = (arg2 - 64) / 128;
            Static164.anIntArray362[Static189.anInt4451] = 0;
            Static173.aClass138Array1[Static189.anInt4451] = null;
            Static26.anIntArray68[Static189.anInt4451] = local77 + (local57 << 16) + (local111 << 8);
            Static189.anInt4451++;
        }
    }
}
