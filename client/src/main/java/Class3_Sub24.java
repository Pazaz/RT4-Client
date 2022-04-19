import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public final class Class3_Sub24 extends Node {

	@OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
	public final int anInt3524;

	@OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
	public final int anInt3522;

	@OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
	public final int anInt3523;

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
	public final int anInt3520;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(IIII)V")
	public Class3_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3524 = arg3;
		this.anInt3522 = arg1;
		this.anInt3523 = arg2;
		this.anInt3520 = arg0;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BII)Z")
	public final boolean method2760(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt3520 && this.anInt3523 >= arg1 && this.anInt3522 <= arg0 && arg0 <= this.anInt3524;
	}
}
