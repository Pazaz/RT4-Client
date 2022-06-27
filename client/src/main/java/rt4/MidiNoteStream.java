package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class MidiNoteStream extends PcmStream {

	@OriginalMember(owner = "client!te", name = "w", descriptor = "Lclient!ih;")
	public final LinkedList notes = new LinkedList();

	@OriginalMember(owner = "client!te", name = "K", descriptor = "Lclient!ei;")
	public final MixerPcmStream mixer = new MixerPcmStream();

	@OriginalMember(owner = "client!te", name = "E", descriptor = "Lclient!va;")
	private final MidiPcmStream parent;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!va;)V")
	public MidiNoteStream(@OriginalArg(0) MidiPcmStream parent) {
		this.parent = parent;
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "()Lclient!qb;")
	@Override
	public final PcmStream nextSubStream() {
		@Pc(9) MidiNote note;
		do {
			note = (MidiNote) this.notes.next();
			if (note == null) {
				return null;
			}
		} while (note.stream == null);
		return note.stream;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "()Lclient!qb;")
	@Override
	public final PcmStream firstSubStream() {
		@Pc(9) MidiNote note = (MidiNote) this.notes.head();
		if (note == null) {
			return null;
		} else if (note.stream == null) {
			return this.nextSubStream();
		} else {
			return note.stream;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!mf;II)V")
	private void skip(@OriginalArg(0) MidiNote instrument, @OriginalArg(2) int len) {
		if ((this.parent.channelFlags[instrument.channel] & 0x4) != 0 && instrument.anInt3767 < 0) {
			@Pc(27) int local27 = this.parent.anIntArray503[instrument.channel] / AudioChannel.sampleRate;
			@Pc(37) int local37 = (local27 + 1048575 - instrument.anInt3775) / local27;
			instrument.anInt3775 = local27 * len + instrument.anInt3775 & 0xFFFFF;
			if (len >= local37) {
				if (this.parent.anIntArray509[instrument.channel] == 0) {
					instrument.stream = SoundPcmStream.create(instrument.sound, instrument.stream.method405(), instrument.stream.getVolume(), instrument.stream.getPan());
				} else {
					instrument.stream = SoundPcmStream.create(instrument.sound, instrument.stream.method405(), 0, instrument.stream.getPan());
					this.parent.method4442(instrument, instrument.instrument.aShortArray36[instrument.anInt3779] < 0);
				}
				if (instrument.instrument.aShortArray36[instrument.anInt3779] < 0) {
					instrument.stream.setLoops(-1);
				}
				len = instrument.anInt3775 / local27;
			}
		}
		instrument.stream.skip(len);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "()I")
	@Override
	public final int method4404() {
		return 0;
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
	@Override
	public final void skip(@OriginalArg(0) int len) {
		this.mixer.skip(len);
		for (@Pc(15) MidiNote note = (MidiNote) this.notes.head(); note != null; note = (MidiNote) this.notes.next()) {
			if (!this.parent.method4445(note)) {
				@Pc(27) int len2 = len;
				do {
					if (len2 <= note.anInt3771) {
						this.skip(note, len2);
						note.anInt3771 -= len2;
						break;
					}
					this.skip(note, note.anInt3771);
					len2 -= note.anInt3771;
				} while (!this.parent.method4433(len2, 0, note, null));
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "([III)V")
	@Override
	public final void read(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.mixer.read(arg0, arg1, arg2);
		for (@Pc(17) MidiNote local17 = (MidiNote) this.notes.head(); local17 != null; local17 = (MidiNote) this.notes.next()) {
			if (!this.parent.method4445(local17)) {
				@Pc(29) int local29 = arg2;
				@Pc(31) int local31 = arg1;
				do {
					if (local29 <= local17.anInt3771) {
						this.method4146(arg0, local17, local31, local29, local31 + local29);
						local17.anInt3771 -= local29;
						break;
					}
					this.method4146(arg0, local17, local31, local17.anInt3771, local29 + local31);
					local29 -= local17.anInt3771;
					local31 += local17.anInt3771;
				} while (!this.parent.method4433(local29, local31, local17, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "([ILclient!mf;IIIB)V")
	private void method4146(@OriginalArg(0) int[] arg0, @OriginalArg(1) MidiNote arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if ((this.parent.channelFlags[arg1.channel] & 0x4) != 0 && arg1.anInt3767 < 0) {
			@Pc(26) int local26 = this.parent.anIntArray503[arg1.channel] / AudioChannel.sampleRate;
			while (true) {
				@Pc(36) int local36 = (local26 + 1048575 - arg1.anInt3775) / local26;
				if (arg3 < local36) {
					arg1.anInt3775 += arg3 * local26;
					break;
				}
				arg3 -= local36;
				arg1.stream.read(arg0, arg2, local36);
				@Pc(55) int local55 = AudioChannel.sampleRate / 100;
				@Pc(58) SoundPcmStream local58 = arg1.stream;
				@Pc(62) int local62 = 262144 / local26;
				if (local62 < local55) {
					local55 = local62;
				}
				arg1.anInt3775 += local26 * local36 - 1048576;
				if (this.parent.anIntArray509[arg1.channel] == 0) {
					arg1.stream = SoundPcmStream.create(arg1.sound, local58.method405(), local58.getVolume(), local58.getPan());
				} else {
					arg1.stream = SoundPcmStream.create(arg1.sound, local58.method405(), 0, local58.getPan());
					this.parent.method4442(arg1, arg1.instrument.aShortArray36[arg1.anInt3779] < 0);
					arg1.stream.method398(local55, local58.getVolume());
				}
				if (arg1.instrument.aShortArray36[arg1.anInt3779] < 0) {
					arg1.stream.setLoops(-1);
				}
				arg2 += local36;
				local58.method384(local55);
				local58.read(arg0, arg2, arg4 - arg2);
				if (local58.method412()) {
					this.mixer.addSubStream(local58);
				}
			}
		}
		arg1.stream.read(arg0, arg2, arg3);
	}
}
