package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class SoundPlayer {
	@OriginalMember(owner = "client!qe", name = "t", descriptor = "[I")
	public static final int[] ids = new int[50];
	@OriginalMember(owner = "client!wh", name = "g", descriptor = "[I")
	public static final int[] loops = new int[50];
	@OriginalMember(owner = "client!na", name = "mb", descriptor = "[I")
	public static final int[] delays = new int[50];
	@OriginalMember(owner = "client!nk", name = "n", descriptor = "[Lclient!sl;")
	public static final SynthSound[] sounds = new SynthSound[50];
	@OriginalMember(owner = "client!ca", name = "fb", descriptor = "[I")
	public static final int[] positions = new int[50];
	@OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
	public static int size = 0;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!tk;IIZI)V")
	public static void playSeqSound(@OriginalArg(0) int zFine, @OriginalArg(1) SeqType seqType, @OriginalArg(3) int xFine, @OriginalArg(4) boolean self, @OriginalArg(5) int index) {
		if (size >= 50 || (seqType.soundeffect == null || index >= seqType.soundeffect.length || seqType.soundeffect[index] == null)) {
			return;
		}
		@Pc(36) int sound = seqType.soundeffect[index][0];
		@Pc(40) int id = sound >> 8;
		if (seqType.soundeffect[index].length > 1) {
			int alternativeIdIndex = (int) ((double) seqType.soundeffect[index].length * Math.random());
			if (alternativeIdIndex > 0) {
				id = seqType.soundeffect[index][alternativeIdIndex];
			}
		}
		@Pc(73) int loops = sound >> 5 & 0x7;
		@Pc(77) int minDistance = sound & 0x1F;
		if (minDistance == 0) {
			if (self) {
				play(loops, id, 0);
			}
		} else if (Preferences.ambientSoundsVolume != 0) {
			ids[size] = id;
			SoundPlayer.loops[size] = loops;
			@Pc(111) int z = (zFine - 64) / 128;
			int x = (xFine - 64) / 128;
			delays[size] = 0;
			sounds[size] = null;
			positions[size] = minDistance + (x << 16) + (z << 8);
			size++;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII)V")
	public static void play(@OriginalArg(0) int loops, @OriginalArg(1) int id, @OriginalArg(2) int delay) {
		if (Preferences.soundEffectVolume == 0 || loops == 0 || size >= 50 || id == -1) {
			return;
		}
		ids[size] = id;
		SoundPlayer.loops[size] = loops;
		delays[size] = delay;
		sounds[size] = null;
		positions[size] = 0;
		size++;
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)V")
	public static void loop() {
		for (@Pc(5) int i = 0; i < size; i++) {
			@Pc(12) int local12 = delays[i]--;
			if (delays[i] >= -10) {
				@Pc(79) SynthSound sound = sounds[i];
				if (sound == null) {
					sound = SynthSound.create(client.js5Archive4, ids[i], 0);
					if (sound == null) {
						continue;
					}
					delays[i] += sound.getStart();
					sounds[i] = sound;
				}
				if (delays[i] < 0) {
					@Pc(209) int volume;
					if (positions[i] == 0) {
						volume = Preferences.soundEffectVolume;
					} else {
						@Pc(125) int minDistance = (positions[i] & 0xFF) * 128;
						@Pc(133) int z = positions[i] >> 8 & 0xFF;
						@Pc(141) int x = positions[i] >> 16 & 0xFF;
						@Pc(151) int zFine = z * 128 + 64 - PlayerList.self.zFine;
						if (zFine < 0) {
							zFine = -zFine;
						}
						@Pc(167) int xFine = x * 128 + 64 - PlayerList.self.xFine;
						if (xFine < 0) {
							xFine = -xFine;
						}
						@Pc(180) int distance = xFine + zFine - 128;
						if (minDistance < distance) {
							delays[i] = -100;
							continue;
						}
						if (distance < 0) {
							distance = 0;
						}
						volume = Preferences.ambientSoundsVolume * (minDistance - distance) / minDistance;
					}
					if (volume > 0) {
						@Pc(223) PcmSound pcmSound = sound.toPcmSound().resample(client.resampler);
						@Pc(228) SoundPcmStream stream = SoundPcmStream.create(pcmSound, volume);
						stream.setLoops(loops[i] - 1);
						client.soundStream.addSubStream(stream);
					}
					delays[i] = -100;
				}
			} else {
				size--;
				for (@Pc(28) int j = i; j < size; j++) {
					ids[j] = ids[j + 1];
					sounds[j] = sounds[j + 1];
					loops[j] = loops[j + 1];
					delays[j] = delays[j + 1];
					positions[j] = positions[j + 1];
				}
				i--;
			}
		}
		if (MidiPlayer.jingle && !MidiPlayer.isPlaying()) {
			if (Preferences.musicVolume != 0 && MusicPlayer.groupId != -1) {
				MidiPlayer.playImmediate(client.js5Archive6, MusicPlayer.groupId, Preferences.musicVolume);
			}
			MidiPlayer.jingle = false;
		} else if (Preferences.musicVolume != 0 && MusicPlayer.groupId != -1 && !MidiPlayer.isPlaying()) {
			sendTrackEndPacket();
		}
	}

	public static void sendTrackEndPacket() {
		Protocol.outboundBuffer.p1isaac(ClientProt.SOUND_SONGEND);
		Protocol.outboundBuffer.p4(MusicPlayer.groupId);
		MusicPlayer.groupId = -1;
	}
}
