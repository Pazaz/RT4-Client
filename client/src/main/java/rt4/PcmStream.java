package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public abstract class PcmStream extends Node {

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
	public int anInt5626;

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "Lclient!ik;")
	public Sound aClass3_Sub16_5;

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "Lclient!qb;")
	public PcmStream aClass3_Sub3_8;

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "Z")
	public volatile boolean aBoolean292 = true;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "()I")
	public abstract int method4404();

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([III)V")
	protected final void method4405(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean292) {
			this.read(arg0, arg1, arg2);
		} else {
			this.skip(arg2);
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "()Lclient!qb;")
	public abstract PcmStream method4406();

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "()I")
	public int method4407() {
		return 255;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "([III)V")
	public abstract void read(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "()Lclient!qb;")
	public abstract PcmStream method4409();

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	public abstract void skip(@OriginalArg(0) int arg0);
}
