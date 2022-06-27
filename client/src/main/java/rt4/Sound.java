package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public abstract class Sound extends Node {

	@OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
	public int position;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
	protected Sound() {
	}
}
