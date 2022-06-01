package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class AudioThread implements Runnable {

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "Lsignlink!ll;")
	public SignLink signLink;

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "[Lclient!vh;")
	public final AudioChannel[] channels = new AudioChannel[2];

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "Z")
	public volatile boolean stop = false;

	@OriginalMember(owner = "client!cj", name = "t", descriptor = "Z")
	public volatile boolean running = false;

	@OriginalMember(owner = "client!cj", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		this.running = true;
		try {
			while (!this.stop) {
				for (@Pc(9) int i = 0; i < 2; i++) {
					@Pc(19) AudioChannel channel = this.channels[i];
					if (channel != null) {
						channel.loop();
					}
				}
				ThreadUtils.sleep(10L);
				GameShell.flush(this.signLink, null);
			}
		} catch (@Pc(43) Exception ex) {
			ex.printStackTrace();
			TracingException.report(null, ex);
		} finally {
			this.running = false;
		}
	}
}
