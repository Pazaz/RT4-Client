package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@OriginalClass("signlink!qm")
public final class FileOnDisk {

	@OriginalMember(owner = "signlink!qm", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile randomAccessFile;

	@OriginalMember(owner = "signlink!qm", name = "b", descriptor = "Ljava/io/File;")
	private final File file;

	@OriginalMember(owner = "signlink!qm", name = "a", descriptor = "J")
	private final long maxLength;

	@OriginalMember(owner = "signlink!qm", name = "d", descriptor = "J")
	private long offset;

	@OriginalMember(owner = "signlink!qm", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public FileOnDisk(@OriginalArg(0) File file, @OriginalArg(1) String mode, @OriginalArg(2) long maxLength) throws IOException {
		if (maxLength == -1L) {
			maxLength = Long.MAX_VALUE;
		}
		if (maxLength <= file.length()) {
			file.delete();
		}
		this.randomAccessFile = new RandomAccessFile(file, mode);
		this.file = file;
		this.maxLength = maxLength;
		this.offset = 0L;
		@Pc(42) int firstByte = this.randomAccessFile.read();
		if (firstByte != -1 && !mode.equals("r")) {
			this.randomAccessFile.seek(0L);
			this.randomAccessFile.write(firstByte);
		}
		this.randomAccessFile.seek(0L);
	}

	@OriginalMember(owner = "signlink!qm", name = "a", descriptor = "(BJ)V")
	public final void seek(@OriginalArg(1) long offset) throws IOException {
		this.randomAccessFile.seek(offset);
		this.offset = offset;
	}

	@OriginalMember(owner = "signlink!qm", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.randomAccessFile != null) {
			System.out.println("Warning! fileondisk " + this.file + " not closed correctly using close(). Auto-closing instead. ");
			this.close();
		}
	}

	@OriginalMember(owner = "signlink!qm", name = "a", descriptor = "(I[BII)V")
	public final void write(@OriginalArg(1) byte[] src, @OriginalArg(2) int len, @OriginalArg(3) int off) throws IOException {
		if (this.offset + (long) len > this.maxLength) {
			this.randomAccessFile.seek(this.maxLength + 1L);
			this.randomAccessFile.write(1);
			throw new EOFException();
		} else {
			this.randomAccessFile.write(src, off, len);
			this.offset += len;
		}
	}

	@OriginalMember(owner = "signlink!qm", name = "a", descriptor = "(III[B)I")
	public final int read(@OriginalArg(0) int off, @OriginalArg(2) int len, @OriginalArg(3) byte[] bytes) throws IOException {
		@Pc(6) int n = this.randomAccessFile.read(bytes, off, len);
		if (n > 0) {
			this.offset += n;
		}
		return n;
	}

	@OriginalMember(owner = "signlink!qm", name = "b", descriptor = "(I)V")
	public final void close() throws IOException {
		if (this.randomAccessFile != null) {
			this.randomAccessFile.close();
			this.randomAccessFile = null;
		}
	}

	@OriginalMember(owner = "signlink!qm", name = "c", descriptor = "(I)J")
	public final long length() throws IOException {
		return this.randomAccessFile.length();
	}

	@OriginalMember(owner = "signlink!qm", name = "a", descriptor = "(I)Ljava/io/File;")
	public final File getFile() {
		return this.file;
	}
}
