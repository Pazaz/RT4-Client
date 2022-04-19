import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer.Info;
import javax.sound.sampled.SourceDataLine;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class JavaAudioChannel extends AudioChannel {

	@OriginalMember(owner = "client!qa", name = "L", descriptor = "I")
	private int anInt4645;

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!qa", name = "O", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!qa", name = "P", descriptor = "[B")
	private byte[] aByteArray64;

	@OriginalMember(owner = "client!qa", name = "N", descriptor = "Z")
	private boolean aBoolean230 = false;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "()V")
	@Override
	protected final void method3572() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public final void method3576(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(21) Info local21 = local1[local9];
				if (local21 != null) {
					@Pc(28) String local28 = local21.getName();
					if (local28 != null && local28.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean230 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static44.anInt1404, 16, Static164.aBoolean192 ? 2 : 1, true, false);
		this.aByteArray64 = new byte[0x100 << (Static164.aBoolean192 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	@Override
	public final void method3562(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static164.aBoolean192 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt4645 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static248.method3289(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method3562(Static165.method3164(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
	@Override
	protected final void method3563() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean230) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) javax.sound.sampled.DataLine.Info local34 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt4645 << (Static164.aBoolean192 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "()I")
	@Override
	protected final int method3569() {
		return this.anInt4645 - (this.aSourceDataLine1.available() >> (Static164.aBoolean192 ? 2 : 1));
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
	@Override
	protected final void method3561() {
		@Pc(1) short local1 = 256;
		if (Static164.aBoolean192) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray411[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray64[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray64[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray64, 0, local1 << 1);
	}
}
