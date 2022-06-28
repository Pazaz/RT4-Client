package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;
import java.awt.image.BufferedImage;

@OriginalClass("signlink!g")
public final class CursorManager {

	@OriginalMember(owner = "signlink!g", name = "b", descriptor = "Ljava/awt/Component;")
	private Component component;

	@OriginalMember(owner = "signlink!g", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot robot = new Robot();

	@OriginalMember(owner = "signlink!g", name = "<init>", descriptor = "()V")
	public CursorManager() throws Exception {
	}

	@OriginalMember(owner = "signlink!g", name = "a", descriptor = "(BLjava/awt/Point;ILjava/awt/Component;I[I)V")
	public final void setCursor(@OriginalArg(1) Point hotSpot, @OriginalArg(2) int width, @OriginalArg(3) Component component, @OriginalArg(4) int height, @OriginalArg(5) int[] pixels) {
		if (pixels == null) {
			component.setCursor(null);
		} else {
			@Pc(13) BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			image.setRGB(0, 0, width, height, pixels, 0, width);
			component.setCursor(component.getToolkit().createCustomCursor(image, hotSpot, null));
		}
	}

	@OriginalMember(owner = "signlink!g", name = "a", descriptor = "(III)V")
	public final void setPosition(@OriginalArg(0) int x, @OriginalArg(2) int y) {
		this.robot.mouseMove(x, y);
	}

	@OriginalMember(owner = "signlink!g", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
	public final void setComponent(@OriginalArg(0) Component component, @OriginalArg(2) boolean reset) {
		if (reset) {
			component = null;
		} else if (component == null) {
			throw new NullPointerException();
		}
		if (component == this.component) {
			return;
		}
		if (this.component != null) {
			this.component.setCursor(null);
			this.component = null;
		}
		if (component != null) {
			component.setCursor(component.getToolkit().createCustomCursor(new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB), new Point(0, 0), null));
			this.component = component;
		}
	}
}
