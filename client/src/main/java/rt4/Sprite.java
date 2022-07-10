package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public abstract class Sprite extends SecondaryNode {

	@OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
	public int height;

	@OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
	public int anInt1860;

	@OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
	protected int anInt1861;

	@OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
	protected int anInt1863;

	@OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
	public int anInt1866;

	@OriginalMember(owner = "client!qf", name = "W", descriptor = "I")
	public int width;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
	protected Sprite() {
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(II)V")
	public abstract void drawPixels(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method1416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)V")
	public abstract void renderAlpha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)V")
	public abstract void renderResized(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)V")
	public final void renderAngled(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8 = this.anInt1860 << 3;
		@Pc(17) int local17 = this.anInt1866 << 3;
		@Pc(25) int local25 = (arg3 << 4) + (local8 & 0xF);
		@Pc(33) int local33 = (arg0 << 4) + (local17 & 0xF);
		this.method1416(local8, local17, local25, local33, arg1, arg2);
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(II)V")
	public abstract void renderHorizontalFlip(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIIII)V")
	public abstract void renderAlpha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "(II)V")
	public abstract void render(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
