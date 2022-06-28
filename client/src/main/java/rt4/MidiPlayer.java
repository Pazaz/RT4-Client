package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class MidiPlayer {
	@OriginalMember(owner = "client!le", name = "k", descriptor = "Z")
	public static boolean jingle = false;
	@OriginalMember(owner = "client!cb", name = "hb", descriptor = "Lclient!le;")
	public static SoundBank soundBank;
	@OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
	public static int state = 0;
	@OriginalMember(owner = "client!uh", name = "P", descriptor = "Lclient!ve;")
	public static Js5 vorbisArchive;
	@OriginalMember(owner = "client!ui", name = "R", descriptor = "I")
	public static int volume;
	@OriginalMember(owner = "client!wi", name = "ab", descriptor = "I")
	public static int songGroupId;
	@OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
	public static int volumeFadeRate;
	@OriginalMember(owner = "client!fl", name = "u", descriptor = "Z")
	public static boolean aBoolean116;
	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Lclient!ve;")
	public static Js5 instrumentsArchive;
	@OriginalMember(owner = "client!gd", name = "m", descriptor = "Lclient!ve;")
	public static Js5 synthArchive;
	@OriginalMember(owner = "client!le", name = "c", descriptor = "Lclient!rf;")
	public static Song song;
	@OriginalMember(owner = "client!nj", name = "g", descriptor = "Lclient!ve;")
	public static Js5 songArchive;
	@OriginalMember(owner = "client!nj", name = "e", descriptor = "Lclient!va;")
	public static MidiPcmStream stream;
	@OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
	public static int songFileId;

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(Z)Z")
	public static boolean method2699() {
		try {
			if (state == 2) {
				if (song == null) {
					song = Song.create(songArchive, songGroupId, songFileId);
					if (song == null) {
						return false;
					}
				}
				if (soundBank == null) {
					soundBank = new SoundBank(synthArchive, vorbisArchive);
				}
				if (stream.isSongReady(song, instrumentsArchive, soundBank)) {
					stream.releaseInstruments();
					stream.setVolume(volume);
					stream.method4431(aBoolean116, song);
					state = 0;
					song = null;
					soundBank = null;
					songArchive = null;
					return true;
				}
			}
		} catch (@Pc(68) Exception ex) {
			ex.printStackTrace();
			stream.method4446();
			songArchive = null;
			song = null;
			state = 0;
			soundBank = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V")
	public static void playFadeOut() {
		volume = 0;
		songFileId = -1;
		state = 1;
		volumeFadeRate = 2;
		aBoolean116 = false;
		songArchive = null;
		songGroupId = -1;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZIILclient!ve;ZII)V")
	public static void playFadeOut(@OriginalArg(1) int group, @OriginalArg(3) Js5 archive, @OriginalArg(5) int arg2) {
		songArchive = archive;
		songFileId = 0;
		songGroupId = group;
		aBoolean116 = false;
		state = 1;
		volumeFadeRate = 2;
		volume = arg2;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!va;Lclient!ve;Lclient!ve;Lclient!ve;)Z")
	public static boolean init(@OriginalArg(1) MidiPcmStream pcmStream, @OriginalArg(2) Js5 instruments, @OriginalArg(3) Js5 vorbis, @OriginalArg(4) Js5 synth) {
		instrumentsArchive = instruments;
		synthArchive = synth;
		vorbisArchive = vorbis;
		stream = pcmStream;
		return true;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V")
	public static void loop() {
		try {
			if (state == 1) {
				@Pc(16) int volume = stream.getVolume();
				if (volume > 0 && stream.isValid()) {
					volume -= volumeFadeRate;
					if (volume < 0) {
						volume = 0;
					}
					stream.setVolume(volume);
					return;
				}
				stream.method4446();
				stream.clearInstruments();
				song = null;
				soundBank = null;
				if (songArchive == null) {
					state = 0;
				} else {
					state = 2;
				}
			}
		} catch (@Pc(62) Exception ex) {
			ex.printStackTrace();
			stream.method4446();
			songArchive = null;
			song = null;
			state = 0;
			soundBank = null;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Z")
	public static boolean isPlaying() {
		return state != 0 || stream.isValid();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!ve;ZIIZI)V")
	public static void playImmediate(@OriginalArg(0) Js5 archive, @OriginalArg(2) int group, @OriginalArg(5) int vol) {
		songArchive = archive;
		state = 1;
		volume = vol;
		songFileId = 0;
		songGroupId = group;
		aBoolean116 = false;
		volumeFadeRate = 10000;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V")
	public static void method4548() {
		stream.method4446();
		state = 1;
		songArchive = null;
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(II)V")
	public static void method3956(@OriginalArg(0) int arg0) {
		if (state == 0) {
			stream.setVolume(arg0);
		} else {
			volume = arg0;
		}
	}
}
