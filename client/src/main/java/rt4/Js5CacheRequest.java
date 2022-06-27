package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public final class Js5CacheRequest extends Js5Request {

	@OriginalMember(owner = "client!c", name = "X", descriptor = "Lclient!ge;")
	public Cache cache;

	@OriginalMember(owner = "client!c", name = "ab", descriptor = "[B")
	public byte[] data;

	@OriginalMember(owner = "client!c", name = "cb", descriptor = "I")
	public int type;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)[B")
	@Override
	public final byte[] getData() {
		if (this.incomplete) {
			throw new RuntimeException();
		}
		return this.data;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)I")
	@Override
	public final int getPercentageComplete() {
		return this.incomplete ? 0 : 100;
	}
}
