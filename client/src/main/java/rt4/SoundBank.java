package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class SoundBank {

	@OriginalMember(owner = "client!le", name = "d", descriptor = "Lclient!sc;")
	private final HashTable vorbisCache = new HashTable(256);

	@OriginalMember(owner = "client!le", name = "l", descriptor = "Lclient!sc;")
	private final HashTable cache = new HashTable(256);

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Lclient!ve;")
	private final Js5 synthArchive;

	@OriginalMember(owner = "client!le", name = "i", descriptor = "Lclient!ve;")
	private final Js5 vorbisArchive;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!ve;Lclient!ve;)V")
	public SoundBank(@OriginalArg(0) Js5 synthArchive, @OriginalArg(1) Js5 vorbisArchive) {
		this.synthArchive = synthArchive;
		this.vorbisArchive = vorbisArchive;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "([IIII)Lclient!kj;")
	private PcmSound getSynthSound(@OriginalArg(0) int[] samplingRates, @OriginalArg(2) int group, @OriginalArg(3) int file) {
		@Pc(21) int key1 = file ^ (group >>> 12 | group << 4 & 0xFFF3);
		@Pc(27) int key2 = key1 | group << 16;
		@Pc(30) long key = key2;
		@Pc(37) PcmSound sound = (PcmSound) this.cache.get(key);
		if (sound != null) {
			return sound;
		} else if (samplingRates == null || samplingRates[0] > 0) {
			@Pc(59) SynthSound synthSound = SynthSound.create(this.synthArchive, group, file);
			if (synthSound == null) {
				return null;
			}
			sound = synthSound.toPcmSound();
			this.cache.put(sound, key);
			if (samplingRates != null) {
				samplingRates[0] -= sound.samples.length;
			}
			return sound;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II[I)Lclient!kj;")
	public final PcmSound getSynthSound(@OriginalArg(0) int id, @OriginalArg(2) int[] samplingRates) {
		if (this.synthArchive.capacity() == 1) {
			return this.getSynthSound(samplingRates, 0, id);
		} else if (this.synthArchive.getGroupCapacity(id) == 1) {
			return this.getSynthSound(samplingRates, id, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I[IIB)Lclient!kj;")
	private PcmSound getVorbisSound(@OriginalArg(0) int group, @OriginalArg(1) int[] samplingRates, @OriginalArg(2) int file) {
		@Pc(15) int key1 = file ^ (group >>> 12 | group << 4 & 0xFFF3);
		@Pc(21) int key2 = key1 | group << 16;
		@Pc(26) long key = (long) key2 ^ 0x100000000L;
		@Pc(33) PcmSound sound = (PcmSound) this.cache.get(key);
		if (sound != null) {
			return sound;
		} else if (samplingRates == null || samplingRates[0] > 0) {
			@Pc(53) VorbisSound vorbisSound = (VorbisSound) this.vorbisCache.get(key);
			if (vorbisSound == null) {
				vorbisSound = VorbisSound.create(this.vorbisArchive, group, file);
				if (vorbisSound == null) {
					return null;
				}
				this.vorbisCache.put(vorbisSound, key);
			}
			sound = vorbisSound.toPcmSound(samplingRates);
			if (sound == null) {
				return null;
			} else {
				vorbisSound.unlink();
				this.cache.put(sound, key);
				return sound;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(II[I)Lclient!kj;")
	public final PcmSound getVorbisSound(@OriginalArg(1) int id, @OriginalArg(2) int[] samplingRates) {
		if (this.vorbisArchive.capacity() == 1) {
			return this.getVorbisSound(0, samplingRates, id);
		} else if (this.vorbisArchive.getGroupCapacity(id) == 1) {
			return this.getVorbisSound(id, samplingRates, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
