package rt4;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import static rt4.MathUtils.clamp;

@OriginalClass("client!o")
public final class JavaMouseWheel extends MouseWheel implements MouseWheelListener {

	@OriginalMember(owner = "client!o", name = "g", descriptor = "I")
	private int anInt4233 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	@Override
	public final void stop(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)I")
	@Override
	public final synchronized int getRotation() {
		@Pc(2) int local2 = this.anInt4233;
		this.anInt4233 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!o", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public final synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		int previous = this.anInt4233;
		this.anInt4233 += arg0.getWheelRotation();
		int diff = this.anInt4233 - previous;

		if (((GlobalJsonConfig.instance != null && GlobalJsonConfig.instance.mouseWheelZoom) || (GlobalJsonConfig.instance == null && GlobalConfig.MOUSEWHEEL_ZOOM)) && Keyboard.pressedKeys[Keyboard.KEY_SHIFT]) {
			Camera.ZOOM = clamp(200, 1200, Camera.ZOOM + (diff >= 0 ? 50: -50));
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public final void start(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
