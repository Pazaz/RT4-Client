package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class ByteArray {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)[B")
	public abstract byte[] get();

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I[B)V")
	public abstract void set(@OriginalArg(1) byte[] bytes);
}
