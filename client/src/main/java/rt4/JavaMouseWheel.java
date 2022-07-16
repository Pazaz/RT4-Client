package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import static rt4.MathUtils.clamp;

@OriginalClass("client!o")
public final class JavaMouseWheel extends MouseWheel implements MouseWheelListener {

	@OriginalMember(owner = "client!o", name = "g", descriptor = "I")
	public int currentRotation = 0;
	public int previousRotation = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	@Override
	public final void stop(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)I")
	@Override
	public final synchronized int getRotation() {
		@Pc(2) int local2 = this.currentRotation;
		this.currentRotation = 0;
		return local2;
	}

	@OriginalMember(owner = "client!o", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public final synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.previousRotation = this.currentRotation;
		this.currentRotation += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public final void start(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
