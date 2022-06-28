package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.nio.ByteBuffer;

@OriginalClass("client!ua")
public final class DirectByteArray extends ByteArray {

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer buffer;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[B)V")
	@Override
	public final void set(@OriginalArg(1) byte[] bytes) {
		this.buffer = ByteBuffer.allocateDirect(bytes.length);
		this.buffer.position(0);
		this.buffer.put(bytes);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)[B")
	@Override
	public final byte[] get() {
		@Pc(4) byte[] bytes = new byte[this.buffer.capacity()];
		this.buffer.position(0);
		this.buffer.get(bytes);
		return bytes;
	}
}
