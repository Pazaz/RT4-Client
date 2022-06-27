package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public abstract class PcmStream extends Node {

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
	public int anInt5626;

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "Lclient!ik;")
	public Sound sound;

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "Lclient!qb;")
	public PcmStream aClass3_Sub3_8;

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "Z")
	public volatile boolean active = true;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "()I")
	public abstract int method4404();

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([III)V")
	protected final void readIfActive(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.active) {
			this.read(arg0, arg1, arg2);
		} else {
			this.skip(arg2);
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "()Lclient!qb;")
	public abstract PcmStream firstSubStream();

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "()I")
	public int method4407() {
		return 255;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "([III)V")
	public abstract void read(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "()Lclient!qb;")
	public abstract PcmStream nextSubStream();

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	public abstract void skip(@OriginalArg(0) int arg0);
}
