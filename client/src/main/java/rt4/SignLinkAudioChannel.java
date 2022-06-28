package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

import java.awt.Component;

@OriginalClass("client!hl")
public final class SignLinkAudioChannel extends AudioChannel {

	@OriginalMember(owner = "client!hl", name = "M", descriptor = "Lsignlink!ai;")
	public static AudioSource audioSource;

	@OriginalMember(owner = "client!hl", name = "L", descriptor = "I")
	private final int channel;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lsignlink!ll;I)V")
	public SignLinkAudioChannel(@OriginalArg(0) SignLink signLink, @OriginalArg(1) int channel) {
		audioSource = signLink.getAudioSource();
		this.channel = channel;
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "()I")
	@Override
	protected final int getBufferSize() {
		return audioSource.getBufferSize(this.channel);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "()V")
	@Override
	protected final void write() {
		audioSource.write(this.channel, this.samples);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public final void init(@OriginalArg(0) Component component) throws Exception {
		audioSource.init(AudioChannel.sampleRate, component, AudioChannel.stereo);
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "()V")
	@Override
	protected final void close() {
		audioSource.close(this.channel);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	@Override
	public final void open(@OriginalArg(0) int bufferCapacity) throws Exception {
		if (bufferCapacity > 32768) {
			throw new IllegalArgumentException();
		}
		audioSource.open(this.channel, bufferCapacity);
	}

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "()V")
	@Override
	protected final void flush() {
		audioSource.flush(this.channel);
	}
}
