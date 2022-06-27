package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public final class Js5NetRequest extends Js5Request {

	@OriginalMember(owner = "client!pm", name = "U", descriptor = "B")
	public byte trailerLen;

	@OriginalMember(owner = "client!pm", name = "Z", descriptor = "I")
	public int blockPosition;

	@OriginalMember(owner = "client!pm", name = "bb", descriptor = "Lclient!wa;")
	public Buffer buffer;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)I")
	@Override
	public final int getPercentageComplete() {
		return this.buffer == null ? 0 : this.buffer.offset * 100 / (this.buffer.data.length - this.trailerLen);
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(Z)[B")
	@Override
	public final byte[] getData() {
		if (this.incomplete || this.buffer.offset < this.buffer.data.length - this.trailerLen) {
			throw new RuntimeException();
		}
		return this.buffer.data;
	}
}
