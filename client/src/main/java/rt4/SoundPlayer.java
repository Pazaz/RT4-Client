package rt4;

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

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)V")
    public static void loop() {
        for (@Pc(5) int local5 = 0; local5 < anInt4451; local5++) {
            @Pc(12) int local12 = anIntArray362[local5]--;
            if (anIntArray362[local5] >= -10) {
                @Pc(79) SynthSound local79 = aClass138Array1[local5];
                if (local79 == null) {
                    local79 = SynthSound.create(client.js5Archive4, anIntArray421[local5], 0);
                    if (local79 == null) {
                        continue;
                    }
                    anIntArray362[local5] += local79.method3990();
                    aClass138Array1[local5] = local79;
                }
                if (anIntArray362[local5] < 0) {
                    @Pc(209) int local209;
                    if (anIntArray68[local5] == 0) {
                        local209 = Preferences.soundEffectVolume;
                    } else {
                        @Pc(125) int local125 = (anIntArray68[local5] & 0xFF) * 128;
                        @Pc(133) int local133 = anIntArray68[local5] >> 8 & 0xFF;
                        @Pc(141) int local141 = anIntArray68[local5] >> 16 & 0xFF;
                        @Pc(151) int local151 = local133 * 128 + 64 - PlayerList.self.zFine;
                        if (local151 < 0) {
                            local151 = -local151;
                        }
                        @Pc(167) int local167 = local141 * 128 + 64 - PlayerList.self.xFine;
                        if (local167 < 0) {
                            local167 = -local167;
                        }
                        @Pc(180) int local180 = local167 + local151 - 128;
                        if (local125 < local180) {
                            anIntArray362[local5] = -100;
                            continue;
                        }
                        if (local180 < 0) {
                            local180 = 0;
                        }
                        local209 = Preferences.ambientSoundsVolume * (local125 - local180) / local125;
                    }
                    if (local209 > 0) {
                        @Pc(223) PcmSound local223 = local79.method3989().method2648(client.resampler);
                        @Pc(228) SoundPcmStream local228 = Static284.method404(local223, local209);
                        local228.method396(anIntArray563[local5] - 1);
                        client.soundStream.method1343(local228);
                    }
                    anIntArray362[local5] = -100;
                }
            } else {
                anInt4451--;
                for (@Pc(28) int local28 = local5; local28 < anInt4451; local28++) {
                    anIntArray421[local28] = anIntArray421[local28 + 1];
                    aClass138Array1[local28] = aClass138Array1[local28 + 1];
                    anIntArray563[local28] = anIntArray563[local28 + 1];
                    anIntArray362[local28] = anIntArray362[local28 + 1];
                    anIntArray68[local28] = anIntArray68[local28 + 1];
                }
                local5--;
            }
        }
        if (MidiPlayer.jingle && !Static136.method2655()) {
            if (Preferences.musicVolume != 0 && MusicPlayer.groupId != -1) {
                Static122.method2410(client.js5Archive6, MusicPlayer.groupId, Preferences.musicVolume);
            }
            MidiPlayer.jingle = false;
        } else if (Preferences.musicVolume != 0 && MusicPlayer.groupId != -1 && !Static136.method2655()) {
            Protocol.outboundBuffer.p1isaac(137);
            Protocol.outboundBuffer.p4(MusicPlayer.groupId);
            MusicPlayer.groupId = -1;
        }
    }
}
