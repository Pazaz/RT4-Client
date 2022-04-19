import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("signlink!g")
public final class CursorManager {

	@OriginalMember(owner = "signlink!g", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "signlink!g", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "signlink!g", name = "<init>", descriptor = "()V")
	public CursorManager() throws Exception {
	}

	@OriginalMember(owner = "signlink!g", name = "a", descriptor = "(BLjava/awt/Point;ILjava/awt/Component;I[I)V")
	public final void method5107(@OriginalArg(1) Point arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if (arg4 == null) {
			arg2.setCursor(null);
		} else {
			@Pc(13) BufferedImage local13 = new BufferedImage(arg1, arg3, 2);
			local13.setRGB(0, 0, arg1, arg3, arg4, 0, arg1);
			arg2.setCursor(arg2.getToolkit().createCustomCursor(local13, arg0, null));
		}
	}

	@OriginalMember(owner = "signlink!g", name = "a", descriptor = "(III)V")
	public final void method5108(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}

	@OriginalMember(owner = "signlink!g", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
	public final void method5109(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			arg0 = null;
		} else if (arg0 == null) {
			throw new NullPointerException();
		}
		if (arg0 == this.aComponent5) {
			return;
		}
		if (this.aComponent5 != null) {
			this.aComponent5.setCursor(null);
			this.aComponent5 = null;
		}
		if (arg0 != null) {
			arg0.setCursor(arg0.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
			this.aComponent5 = arg0;
		}
	}
}
