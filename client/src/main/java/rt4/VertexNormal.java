package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class VertexNormal {

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
	public int y;

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
	public int magnitude;

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
	public int z;

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
	public int x;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	public VertexNormal() {
	}

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lclient!hd;)V")
	public VertexNormal(@OriginalArg(0) VertexNormal arg0) {
		this.magnitude = arg0.magnitude;
		this.x = arg0.x;
		this.y = arg0.y;
		this.z = arg0.z;
	}
}
