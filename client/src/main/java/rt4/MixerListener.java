package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class MixerListener extends Node {

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
	public int anInt905;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ei;)I")
	public abstract int method779(@OriginalArg(0) MixerPcmStream arg0);

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "()V")
	public abstract void method780();
}
