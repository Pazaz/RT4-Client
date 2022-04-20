import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Mouse implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!ug", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static93.aClass150_1 != null) {
			Static93.anInt2467 = 0;
			Static147.anInt3521 = arg0.getX();
			Static165.anInt4039 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ug", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static93.aClass150_1 != null) {
			Static57.anInt1759 = 0;
		}
	}

	@OriginalMember(owner = "client!ug", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static93.aClass150_1 != null) {
			Static93.anInt2467 = 0;
			Static147.anInt3521 = arg0.getX();
			Static165.anInt4039 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ug", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static93.aClass150_1 != null) {
			Static93.anInt2467 = 0;
			Static57.anInt1759 = 0;
			@Pc(14) int local14 = arg0.getModifiers();
			if ((local14 & 0x10) == 0) {
			}
			if ((local14 & 0x4) == 0) {
			}
			if ((local14 & 0x8) == 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ug", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ug", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ug", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static93.aClass150_1 != null) {
			Static93.anInt2467 = 0;
			Static34.anInt1034 = arg0.getX();
			Static222.anInt4973 = arg0.getY();
			Static209.aLong161 = MonotonicClock.currentTimeMillis();
			if ((arg0.getModifiersEx() & MouseEvent.BUTTON3_DOWN_MASK) == 0) {
				Static41.anInt1313 = 1;
				Static57.anInt1759 = 1;
			} else {
				Static41.anInt1313 = 2;
				Static57.anInt1759 = 2;
			}
			@Pc(29) int local29 = arg0.getModifiers();
			if ((local29 & 0x10) == 0) {
			}
			if ((local29 & 0x4) != 0) {
			}
			if ((local29 & 0x8) != 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ug", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static93.aClass150_1 != null) {
			Static93.anInt2467 = 0;
			Static147.anInt3521 = -1;
			Static165.anInt4039 = -1;
		}
	}

	@OriginalMember(owner = "client!ug", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static93.aClass150_1 != null) {
			Static93.anInt2467 = 0;
			Static147.anInt3521 = arg0.getX();
			Static165.anInt4039 = arg0.getY();
		}
	}
}
