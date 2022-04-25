package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public final class PlainTile {

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "Z")
	public boolean aBoolean241 = true;

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
	public final int anInt4867;

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
	public final int anInt4865;

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
	public final int anInt4872;

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
	public final int anInt4871;

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
	public final int anInt4864;

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
	public final int anInt4869;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(IIIIIIZ)V")
	public PlainTile(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt4867 = arg1;
		this.anInt4865 = arg2;
		this.anInt4872 = arg0;
		this.anInt4871 = arg5;
		this.aBoolean241 = arg6;
		this.anInt4864 = arg3;
		this.anInt4869 = arg4;
	}
}
