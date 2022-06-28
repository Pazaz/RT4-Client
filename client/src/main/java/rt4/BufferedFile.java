package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;

@OriginalClass("client!en")
public final class BufferedFile {

	@OriginalMember(owner = "client!en", name = "m", descriptor = "J")
	private long physicalPosition;

	@OriginalMember(owner = "client!en", name = "v", descriptor = "I")
	private int readLen;

	@OriginalMember(owner = "client!en", name = "p", descriptor = "J")
	private long writePosition = -1L;

	@OriginalMember(owner = "client!en", name = "g", descriptor = "I")
	private int writeLen = 0;

	@OriginalMember(owner = "client!en", name = "w", descriptor = "J")
	private long readPosition = -1L;

	@OriginalMember(owner = "client!en", name = "s", descriptor = "Lsignlink!qm;")
	private final FileOnDisk file;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "J")
	private long physicalLength;

	@OriginalMember(owner = "client!en", name = "j", descriptor = "J")
	private long virtualLength;

	@OriginalMember(owner = "client!en", name = "q", descriptor = "[B")
	private final byte[] writeBuffer;

	@OriginalMember(owner = "client!en", name = "b", descriptor = "[B")
	private final byte[] readBuffer;

	@OriginalMember(owner = "client!en", name = "k", descriptor = "J")
	private long virtualPosition;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lsignlink!qm;II)V")
	public BufferedFile(@OriginalArg(0) FileOnDisk file, @OriginalArg(1) int readBufferSize, @OriginalArg(2) int writeBufferSize) throws IOException {
		this.file = file;
		this.virtualLength = this.physicalLength = file.length();
		this.writeBuffer = new byte[writeBufferSize];
		this.readBuffer = new byte[readBufferSize];
		this.virtualPosition = 0L;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
	private void flush() throws IOException {
		if (this.writePosition == -1L) {
			return;
		}
		if (this.writePosition != this.physicalPosition) {
			this.file.seek(this.writePosition);
			this.physicalPosition = this.writePosition;
		}
		this.file.write(this.writeBuffer, this.writeLen, 0);
		@Pc(45) long start = -1L;
		if (this.readPosition <= this.writePosition && this.readPosition + (long) this.readLen > this.writePosition) {
			start = this.writePosition;
		} else if (this.writePosition <= this.readPosition && this.readPosition < this.writePosition + (long) this.writeLen) {
			start = this.readPosition;
		}
		this.physicalPosition += this.writeLen;
		if (this.physicalLength < this.physicalPosition) {
			this.physicalLength = this.physicalPosition;
		}
		@Pc(118) long end = -1L;
		if (this.readPosition < this.writePosition + (long) this.writeLen && (long) this.readLen + this.readPosition >= (long) this.writeLen + this.writePosition) {
			end = this.writePosition + (long) this.writeLen;
		} else if (this.readPosition + (long) this.readLen > this.writePosition && (long) this.writeLen + this.writePosition >= (long) this.readLen + this.readPosition) {
			end = (long) this.readLen + this.readPosition;
		}
		if (start > -1L && end > start) {
			@Pc(208) int copyLen = (int) (end - start);
			JagString.copy(this.writeBuffer, (int) (start - this.writePosition), this.readBuffer, (int) (start - this.readPosition), copyLen);
		}
		this.writeLen = 0;
		this.writePosition = -1L;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)J")
	public final long length() {
		return this.virtualLength;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)Ljava/io/File;")
	private File getFile() {
		return this.file.getFile();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I[BII)V")
	public final void read(@OriginalArg(0) int off, @OriginalArg(1) byte[] b, @OriginalArg(2) int len) throws IOException {
		try {
			if (len > b.length) {
				throw new ArrayIndexOutOfBoundsException(len - b.length);
			}
			if (this.writePosition != -1L && this.virtualPosition >= this.writePosition && (long) this.writeLen + this.writePosition >= (long) len + this.virtualPosition) {
				JagString.copy(this.writeBuffer, (int) (this.virtualPosition - this.writePosition), b, 0, len);
				this.virtualPosition += len;
				return;
			}
			@Pc(71) long originalPosition = this.virtualPosition;
			@Pc(75) int originalLen = len;
			@Pc(102) int n;
			if (this.readPosition <= this.virtualPosition && this.readPosition + (long) this.readLen > this.virtualPosition) {
				n = (int) ((long) this.readLen + this.readPosition - this.virtualPosition);
				if (n > len) {
					n = len;
				}
				JagString.copy(this.readBuffer, (int) (this.virtualPosition - this.readPosition), b, 0, n);
				off = n;
				len -= n;
				this.virtualPosition += n;
			}
			if (this.readBuffer.length < len) {
				this.file.seek(this.virtualPosition);
				this.physicalPosition = this.virtualPosition;
				while (len > 0) {
					n = this.file.read(off, len, b);
					if (n == -1) {
						break;
					}
					this.physicalPosition += n;
					len -= n;
					off += n;
					this.virtualPosition += n;
				}
			} else if (len > 0) {
				this.fill();
				n = len;
				if (len > this.readLen) {
					n = this.readLen;
				}
				JagString.copy(this.readBuffer, 0, b, off, n);
				len -= n;
				off += n;
				this.virtualPosition += n;
			}
			if (this.writePosition != -1L) {
				if (this.virtualPosition < this.writePosition && len > 0) {
					n = (int) (this.writePosition - this.virtualPosition) + off;
					if (off + len < n) {
						n = off + len;
					}
					while (off < n) {
						b[off++] = 0;
						this.virtualPosition++;
						len--;
					}
				}
				@Pc(298) long end = -1L;
				@Pc(300) long start = -1L;
				if ((long) this.writeLen + this.writePosition > originalPosition && (long) originalLen + originalPosition >= (long) this.writeLen + this.writePosition) {
					start = (long) this.writeLen + this.writePosition;
				} else if (this.writePosition < (long) originalLen + originalPosition && (long) this.writeLen + this.writePosition >= (long) originalLen + originalPosition) {
					start = (long) originalLen + originalPosition;
				}
				if (originalPosition <= this.writePosition && originalPosition + (long) originalLen > this.writePosition) {
					end = this.writePosition;
				} else if (originalPosition >= this.writePosition && originalPosition < (long) this.writeLen + this.writePosition) {
					end = originalPosition;
				}
				if (end > -1L && start > end) {
					@Pc(426) int copyLen = (int) (start - end);
					JagString.copy(this.writeBuffer, (int) (end - this.writePosition), b, (int) (end - originalPosition), copyLen);
					if (this.virtualPosition < start) {
						len = (int) ((long) len + this.virtualPosition - start);
						this.virtualPosition = start;
					}
				}
			}
		} catch (@Pc(464) IOException ex) {
			ex.printStackTrace();
			this.physicalPosition = -1L;
			throw ex;
		}
		if (len > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)V")
	public final void method1455() throws IOException {
		this.flush();
		this.file.close();
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V")
	private void fill() throws IOException {
		this.readLen = 0;
		if (this.physicalPosition != this.virtualPosition) {
			this.file.seek(this.virtualPosition);
			this.physicalPosition = this.virtualPosition;
		}
		this.readPosition = this.virtualPosition;
		while (this.readBuffer.length > this.readLen) {
			@Pc(49) int len = this.readBuffer.length - this.readLen;
			if (len > 200000000) {
				len = 200000000;
			}
			@Pc(66) int n = this.file.read(this.readLen, len, this.readBuffer);
			if (n == -1) {
				break;
			}
			this.physicalPosition += n;
			this.readLen += n;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z[B)V")
	public final void read(@OriginalArg(1) byte[] b) throws IOException {
		this.read(0, b, b.length);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([BIII)V")
	public final void write(@OriginalArg(0) byte[] b, @OriginalArg(1) int off, @OriginalArg(3) int len) throws IOException {
		try {
			if (this.virtualLength < (long) len + this.virtualPosition) {
				this.virtualLength = (long) len + this.virtualPosition;
			}
			if (this.writePosition != -1L && (this.writePosition > this.virtualPosition || this.virtualPosition > (long) this.writeLen + this.writePosition)) {
				this.flush();
			}
			if (this.writePosition != -1L && (long) this.writeBuffer.length + this.writePosition < (long) len + this.virtualPosition) {
				@Pc(90) int n = (int) ((long) this.writeBuffer.length + this.writePosition - this.virtualPosition);
				len -= n;
				JagString.copy(b, off, this.writeBuffer, (int) (this.virtualPosition - this.writePosition), n);
				this.virtualPosition += n;
				this.writeLen = this.writeBuffer.length;
				this.flush();
				off += n;
			}
			if (this.writeBuffer.length < len) {
				if (this.virtualPosition != this.physicalPosition) {
					this.file.seek(this.virtualPosition);
					this.physicalPosition = this.virtualPosition;
				}
				this.file.write(b, len, off);
				@Pc(165) long start = -1L;
				if (this.readPosition <= this.virtualPosition && (long) this.readLen + this.readPosition > this.virtualPosition) {
					start = this.virtualPosition;
				} else if (this.virtualPosition <= this.readPosition && (long) len + this.virtualPosition > this.readPosition) {
					start = this.readPosition;
				}
				this.physicalPosition += len;
				@Pc(226) long end = -1L;
				if (this.physicalLength < this.physicalPosition) {
					this.physicalLength = this.physicalPosition;
				}
				if (this.virtualPosition + (long) len > this.readPosition && this.virtualPosition + (long) len <= this.readPosition - -((long) this.readLen)) {
					end = (long) len + this.virtualPosition;
				} else if (this.readPosition + (long) this.readLen > this.virtualPosition && this.virtualPosition + (long) len >= (long) this.readLen + this.readPosition) {
					end = (long) this.readLen + this.readPosition;
				}
				if (start > -1L && end > start) {
					@Pc(324) int copyLen = (int) (end - start);
					JagString.copy(b, (int) (start + (long) off - this.virtualPosition), this.readBuffer, (int) (start - this.readPosition), copyLen);
				}
				this.virtualPosition += len;
			} else if (len > 0) {
				if (this.writePosition == -1L) {
					this.writePosition = this.virtualPosition;
				}
				JagString.copy(b, off, this.writeBuffer, (int) (this.virtualPosition - this.writePosition), len);
				this.virtualPosition += len;
				if ((long) this.writeLen < this.virtualPosition - this.writePosition) {
					this.writeLen = (int) (this.virtualPosition - this.writePosition);
				}
			}
		} catch (@Pc(414) IOException ex) {
			ex.printStackTrace();
			this.physicalPosition = -1L;
			throw ex;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IJ)V")
	public final void seek(@OriginalArg(1) long offset) throws IOException {
		if (offset < 0L) {
			throw new IOException("Invalid seek to " + offset + " in file " + this.getFile());
		}
		this.virtualPosition = offset;
	}
}
