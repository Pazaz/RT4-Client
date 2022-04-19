import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public final class Js5CacheRequest extends Js5Request {

	@OriginalMember(owner = "client!c", name = "X", descriptor = "Lclient!ge;")
	public Cache aClass49_3;

	@OriginalMember(owner = "client!c", name = "ab", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!c", name = "cb", descriptor = "I")
	public int anInt824;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)[B")
	@Override
	public final byte[] method3554() {
		if (this.aBoolean226) {
			throw new RuntimeException();
		}
		return this.aByteArray11;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)I")
	@Override
	public final int method3553() {
		return this.aBoolean226 ? 0 : 100;
	}
}
