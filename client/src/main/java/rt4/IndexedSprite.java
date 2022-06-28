package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class IndexedSprite {

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
	public int width;

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
	public int yOffset;

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
	public int innerHeight;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
	public int height;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
	public int innerWidth;

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
	public int xOffset;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
	protected IndexedSprite() {
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)V")
	public abstract void method3335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)V")
	public abstract void renderTransparent(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
