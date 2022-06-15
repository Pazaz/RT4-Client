package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Js5Compression {

	@OriginalMember(owner = "client!mf", name = "x", descriptor = "Lclient!ha;")
	public static final GzipDecompressor GZIP_DECOMPRESSOR = new GzipDecompressor();

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
	public static final int MAX_LENGTH = 0;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B[B)[B")
	public static byte[] uncompress(@OriginalArg(1) byte[] in) {
		@Pc(17) Buffer buffer = new Buffer(in);
		@Pc(21) int type = buffer.g1();
		@Pc(25) int len = buffer.g4();
		if (len < 0 || MAX_LENGTH != 0 && MAX_LENGTH < len) {
			throw new RuntimeException();
		} else if (type == 0) {
			@Pc(53) byte[] bytes = new byte[len];
			buffer.gdata(len, bytes);
			return bytes;
		} else {
			@Pc(65) int uncompressedLen = buffer.g4();
			if (uncompressedLen < 0 || MAX_LENGTH != 0 && MAX_LENGTH < uncompressedLen) {
				throw new RuntimeException();
			}
			@Pc(85) byte[] out = new byte[uncompressedLen];
			if (type == 1) {
				Bzip2Decompressor.bunzip2(out, uncompressedLen, in, len);
			} else {
				GZIP_DECOMPRESSOR.method1842(out, buffer);
			}
			return out;
		}
	}
}
