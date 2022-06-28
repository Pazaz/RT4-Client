package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public abstract class ByteArray {

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "Z")
	public static boolean directBuffersUnsupported = false;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILjava/lang/Object;Z)[B")
	public static byte[] unwrap(@OriginalArg(1) Object in, @OriginalArg(2) boolean copy) {
		if (in == null) {
			return null;
		} else if (in instanceof byte[]) {
			@Pc(14) byte[] bytes = (byte[]) in;
			return copy ? copy(bytes) : bytes;
		} else if (in instanceof ByteArray) {
			@Pc(34) ByteArray array = (ByteArray) in;
			return array.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(B[B)[B")
	public static byte[] copy(@OriginalArg(1) byte[] in) {
		@Pc(6) int len = in.length;
		@Pc(9) byte[] out = new byte[len];
		JagString.copy(in, 0, out, 0, len);
		return out;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
	public static Object wrap(@OriginalArg(2) byte[] bytes) {
		if (bytes == null) {
			return null;
		}
		if (bytes.length > 136 && !directBuffersUnsupported) {
			try {
				@Pc(27) ByteArray array = new DirectByteArray();
				array.set(bytes);
				return array;
			} catch (@Pc(34) Throwable ex) {
				directBuffersUnsupported = true;
			}
		}
		return bytes;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)[B")
	public abstract byte[] get();

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I[B)V")
	public abstract void set(@OriginalArg(1) byte[] bytes);
}
