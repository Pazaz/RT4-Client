package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

import java.awt.Component;
import java.awt.*;

@OriginalClass("client!tm")
public final class GameCanvas extends Canvas {

	@OriginalMember(owner = "client!tm", name = "m", descriptor = "Ljava/awt/Component;")
	private final Component component;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public GameCanvas(@OriginalArg(0) Component component) {
		this.component = component;
	}

	@OriginalMember(owner = "client!tm", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics graphics) {
		this.component.update(graphics);
	}

	@OriginalMember(owner = "client!tm", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics graphics) {
		this.component.paint(graphics);
	}
}
