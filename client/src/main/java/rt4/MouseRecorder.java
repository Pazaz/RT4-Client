package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class MouseRecorder implements Runnable {

	@OriginalMember(owner = "client!od", name = "f", descriptor = "Lclient!jd;")
	public static MouseRecorder instance;
	@OriginalMember(owner = "client!tm", name = "e", descriptor = "Z")
	public static boolean enabled = false;
	@OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
	public static int mouseRecorderPrevY = 0;
	@OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
	public static int mouseRecorderPrevX = 0;
	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Z")
	public boolean running = true;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "Ljava/lang/Object;")
	public final Object lock = new Object();

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
	public int samples = 0;

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "[I")
	public final int[] y = new int[500];

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "[I")
	public final int[] x = new int[500];

	@OriginalMember(owner = "client!jd", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		while (this.running) {
			@Pc(12) Object local12 = this.lock;
			synchronized (this.lock) {
				if (this.samples < 500) {
					this.x[this.samples] = Mouse.lastMouseX;
					this.y[this.samples] = Mouse.lastMouseY;
					this.samples++;
				}
			}
			ThreadUtils.sleep(50L);
		}
	}
}
