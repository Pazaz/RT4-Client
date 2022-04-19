import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public final class Class3_Sub21 extends Node {

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
	public int anInt3141;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	public Class3_Sub21() {
	}

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(I)V")
	public Class3_Sub21(@OriginalArg(0) int arg0) {
		this.anInt3141 = arg0;
	}
}
