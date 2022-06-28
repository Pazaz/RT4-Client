package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.Component;

@OriginalClass("client!uc")
public abstract class MouseWheel {

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
	public static int wheelRotation = 0;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)Lclient!uc;")
	public static MouseWheel create() {
		try {
			return new JavaMouseWheel();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)I")
	public abstract int getRotation();

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public abstract void stop(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void start(@OriginalArg(0) Component arg0);
}
