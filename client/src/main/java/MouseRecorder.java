import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class MouseRecorder implements Runnable {

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Z")
	public boolean aBoolean151 = true;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
	public int anInt2990 = 0;

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "[I")
	public final int[] anIntArray279 = new int[500];

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "[I")
	public final int[] anIntArray280 = new int[500];

	@OriginalMember(owner = "client!jd", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		while (this.aBoolean151) {
			@Pc(12) Object local12 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt2990 < 500) {
					this.anIntArray280[this.anInt2990] = Static215.anInt4873;
					this.anIntArray279[this.anInt2990] = Static223.anInt5032;
					this.anInt2990++;
				}
			}
			Static231.method3983(50L);
		}
	}
}
