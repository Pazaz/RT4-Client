import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("signlink!qm")
public final class FileOnDisk {

	@OriginalMember(owner = "signlink!qm", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "signlink!qm", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "signlink!qm", name = "a", descriptor = "J")
	private final long aLong1315;

	@OriginalMember(owner = "signlink!qm", name = "d", descriptor = "J")
	private long aLong1316;

	@OriginalMember(owner = "signlink!qm", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public FileOnDisk(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong1315 = arg2;
		this.aLong1316 = 0L;
		@Pc(42) int local42 = this.aRandomAccessFile1.read();
		if (local42 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local42);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "signlink!qm", name = "a", descriptor = "(BJ)V")
	public final void method5133(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong1316 = arg0;
	}

	@OriginalMember(owner = "signlink!qm", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5136();
		}
	}

	@OriginalMember(owner = "signlink!qm", name = "a", descriptor = "(I[BII)V")
	public final void method5134(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong1316 + (long) arg1 > this.aLong1315) {
			this.aRandomAccessFile1.seek(this.aLong1315 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong1316 += arg1;
		}
	}

	@OriginalMember(owner = "signlink!qm", name = "a", descriptor = "(III[B)I")
	public final int method5135(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local6 > 0) {
			this.aLong1316 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "signlink!qm", name = "b", descriptor = "(I)V")
	public final void method5136() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "signlink!qm", name = "c", descriptor = "(I)J")
	public final long method5137() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "signlink!qm", name = "a", descriptor = "(I)Ljava/io/File;")
	public final File method5138() {
		return this.aFile1;
	}
}
