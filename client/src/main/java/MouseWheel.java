import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class MouseWheel {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)I")
	public abstract int method3287();

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public abstract void method3291(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void start(@OriginalArg(0) Component arg0);
}
