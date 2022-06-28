package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public class MusicPlayer {
	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	public static int groupId = -1;
	@OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
	public static int titleSong;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZI)V")
	public static void playSong(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !MidiPlayer.jingle) {
			MidiPlayer.method4548();
		} else if (arg0 != -1 && (groupId != arg0 || !MidiPlayer.isPlaying()) && Preferences.musicVolume != 0 && !MidiPlayer.jingle) {
			MidiPlayer.playFadeOut(arg0, client.js5Archive6, Preferences.musicVolume);
		}
		groupId = arg0;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIB)V")
	public static void playJingle(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Preferences.musicVolume != 0 && arg1 != -1) {
			MidiPlayer.playImmediate(client.js5Archive11, arg1, Preferences.musicVolume);
			MidiPlayer.jingle = true;
		}
	}
}
