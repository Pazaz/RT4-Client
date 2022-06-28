package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.zip.Inflater;

@OriginalClass("client!ha")
public final class GzipDecompressor {

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
	public GzipDecompressor() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(III)V")
	private GzipDecompressor(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([BLclient!wa;Z)V")
	public final void method1842(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Buffer arg1) {
		if (arg1.data[arg1.offset] != 31 || arg1.data[arg1.offset + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.data, arg1.offset + 10, -8 - (arg1.offset + 10) + arg1.data.length);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(64) Exception local64) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
