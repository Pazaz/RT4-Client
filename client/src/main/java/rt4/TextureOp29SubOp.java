package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public abstract class TextureOp29SubOp {

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
	public final int anInt5229;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
	protected final int anInt5231;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
	public final int anInt5228;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(III)V")
	protected TextureOp29SubOp(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5229 = arg1;
		this.anInt5231 = arg2;
		this.anInt5228 = arg0;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)V")
	public abstract void method4007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZI)V")
	public abstract void method4009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(III)V")
	public abstract void method4013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
