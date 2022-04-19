import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class SignLinkAudioChannel extends AudioChannel {

	@OriginalMember(owner = "client!hl", name = "L", descriptor = "I")
	private final int anInt2606;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lsignlink!ll;I)V")
	public SignLinkAudioChannel(@OriginalArg(0) SignLink arg0, @OriginalArg(1) int arg1) {
		Static100.anInterface10_1 = arg0.method5125();
		this.anInt2606 = arg1;
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "()I")
	@Override
	protected final int method3569() {
		return Static100.anInterface10_1.method5098(this.anInt2606);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "()V")
	@Override
	protected final void method3561() {
		Static100.anInterface10_1.method5102(this.anInt2606, this.anIntArray411);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public final void method3576(@OriginalArg(0) Component arg0) throws Exception {
		Static100.anInterface10_1.method5101(Static44.anInt1404, arg0, Static164.aBoolean192);
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "()V")
	@Override
	protected final void method3563() {
		Static100.anInterface10_1.method5097(this.anInt2606);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	@Override
	public final void method3562(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static100.anInterface10_1.method5099(this.anInt2606, arg0);
	}

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "()V")
	@Override
	protected final void method3572() {
		Static100.anInterface10_1.method5100(this.anInt2606);
	}
}
