import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class SoundPlayer {
    @OriginalMember(owner = "client!qe", name = "t", descriptor = "[I")
	public static final int[] anIntArray421 = new int[50];
    @OriginalMember(owner = "client!wh", name = "g", descriptor = "[I")
    public static final int[] anIntArray563 = new int[50];
    @OriginalMember(owner = "client!na", name = "mb", descriptor = "[I")
    public static final int[] anIntArray362 = new int[50];
    @OriginalMember(owner = "client!nk", name = "n", descriptor = "[Lclient!sl;")
    public static final SynthSound[] aClass138Array1 = new SynthSound[50];
    @OriginalMember(owner = "client!ca", name = "fb", descriptor = "[I")
    public static final int[] anIntArray68 = new int[50];
    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int anInt4451 = 0;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!tk;IIZI)V")
    public static void playSeqSound(@OriginalArg(0) int arg0, @OriginalArg(1) SeqType arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean self, @OriginalArg(5) int arg4) {
        if (anInt4451 >= 50 || (arg1.sounds == null || arg4 >= arg1.sounds.length || arg1.sounds[arg4] == null)) {
            return;
        }
        @Pc(36) int local36 = arg1.sounds[arg4][0];
        @Pc(40) int local40 = local36 >> 8;
        @Pc(57) int local57;
        if (arg1.sounds[arg4].length > 1) {
            local57 = (int) ((double) arg1.sounds[arg4].length * Math.random());
            if (local57 > 0) {
                local40 = arg1.sounds[arg4][local57];
            }
        }
        @Pc(73) int local73 = local36 >> 5 & 0x7;
        @Pc(77) int minDistance = local36 & 0x1F;
        if (minDistance == 0) {
            if (self) {
                play(local73, local40, 0);
            }
        } else if (Preferences.ambientSoundsVolume != 0) {
            anIntArray421[anInt4451] = local40;
            anIntArray563[anInt4451] = local73;
            @Pc(111) int local111 = (arg0 - 64) / 128;
            local57 = (arg2 - 64) / 128;
            anIntArray362[anInt4451] = 0;
            aClass138Array1[anInt4451] = null;
            anIntArray68[anInt4451] = minDistance + (local57 << 16) + (local111 << 8);
            anInt4451++;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII)V")
    public static void play(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        if (Preferences.soundEffectVolume == 0 || arg0 == 0 || anInt4451 >= 50 || arg1 == -1) {
            return;
        }
        anIntArray421[anInt4451] = arg1;
        anIntArray563[anInt4451] = arg0;
        anIntArray362[anInt4451] = arg2;
        aClass138Array1[anInt4451] = null;
        anIntArray68[anInt4451] = 0;
        anInt4451++;
    }
}
