package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@OriginalClass("client!ma")
public final class BufferedSocket implements Runnable {

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "[B")
	private byte[] buffer;

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "Lsignlink!im;")
	private PrivilegedRequest thread;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
	private int readPointer = 0;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
	private int writePointer = 0;

	@OriginalMember(owner = "client!ma", name = "v", descriptor = "Z")
	private boolean closed = false;

	@OriginalMember(owner = "client!ma", name = "y", descriptor = "Z")
	private boolean error = false;

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "Lsignlink!ll;")
	private final SignLink signLink;

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "Ljava/net/Socket;")
	private final Socket socket;

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "Ljava/io/InputStream;")
	private InputStream in;

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream out;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Ljava/net/Socket;Lsignlink!ll;)V")
	public BufferedSocket(@OriginalArg(0) Socket socket, @OriginalArg(1) SignLink signLink) throws IOException {
		this.signLink = signLink;
		this.socket = socket;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.in = this.socket.getInputStream();
		this.out = this.socket.getOutputStream();
	}

	@OriginalMember(owner = "client!ma", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			while (true) {
				@Pc(39) int len;
				@Pc(24) int off;
				ready:
				{
					synchronized (this) {
						close:
						{
							if (this.writePointer == this.readPointer) {
								if (this.closed) {
									break close;
								}
								try {
									this.wait();
								} catch (@Pc(21) InterruptedException ex) {
								}
							}
							off = this.readPointer;
							if (this.readPointer > this.writePointer) {
								len = 5000 - this.readPointer;
							} else {
								len = this.writePointer - this.readPointer;
							}
							break ready;
						}
					}
					try {
						if (this.in != null) {
							this.in.close();
						}
						if (this.out != null) {
							this.out.close();
						}
						if (this.socket != null) {
							this.socket.close();
						}
					} catch (@Pc(119) IOException ex) {
					}
					this.buffer = null;
					break;
				}
				if (len > 0) {
					try {
						this.out.write(this.buffer, off, len);
					} catch (@Pc(67) IOException ex) {
						this.error = true;
					}
					this.readPointer = (len + this.readPointer) % 5000;
					try {
						if (this.writePointer == this.readPointer) {
							this.out.flush();
						}
					} catch (@Pc(92) IOException ex) {
						this.error = true;
					}
				}
			}
		} catch (@Pc(124) Exception ex) {
			TracingException.report(null, ex);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III[B)V")
	public final void read(@OriginalArg(0) int off, @OriginalArg(1) int len, @OriginalArg(3) byte[] b) throws IOException {
		if (this.closed) {
			return;
		}
		while (len > 0) {
			@Pc(23) int n = this.in.read(b, off, len);
			if (n <= 0) {
				throw new EOFException();
			}
			off += n;
			len -= n;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)I")
	public final int read() throws IOException {
		return this.closed ? 0 : this.in.read();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZI[BI)V")
	public final void write(@OriginalArg(2) byte[] src, @OriginalArg(3) int len) throws IOException {
		if (this.closed) {
			return;
		}
		if (this.error) {
			this.error = false;
			throw new IOException();
		}
		if (this.buffer == null) {
			this.buffer = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(34) int i = 0; i < len; i++) {
				this.buffer[this.writePointer] = src[i];
				this.writePointer = (this.writePointer + 1) % 5000;
				if (this.writePointer == (this.readPointer + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.thread == null) {
				this.thread = this.signLink.startThread(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		this.close();
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)I")
	public final int available() throws IOException {
		return this.closed ? 0 : this.in.available();
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)V")
	public final void checkError() throws IOException {
		if (!this.closed && this.error) {
			this.error = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
	public final void breakConnection() {
		if (!this.closed) {
			this.in = new BrokenInputStream();
			this.out = new BrokenOutputStream();
		}
	}

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V")
	public final void close() {
		if (this.closed) {
			return;
		}
		synchronized (this) {
			this.closed = true;
			this.notifyAll();
		}
		if (this.thread != null) {
			while (this.thread.status == 0) {
				ThreadUtils.sleep(1L);
			}
			if (this.thread.status == 1) {
				try {
					((Thread) this.thread.result).join();
				} catch (@Pc(59) InterruptedException ex) {
				}
			}
		}
		this.thread = null;
	}
}
