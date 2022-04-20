import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class BufferedSocket implements Runnable {

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "[B")
	private byte[] aByteArray49;

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "Lsignlink!im;")
	private PrivilegedRequest aClass212_4;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
	private int anInt3596 = 0;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
	private int anInt3590 = 0;

	@OriginalMember(owner = "client!ma", name = "v", descriptor = "Z")
	private boolean aBoolean177 = false;

	@OriginalMember(owner = "client!ma", name = "y", descriptor = "Z")
	private boolean aBoolean178 = false;

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "Lsignlink!ll;")
	private final SignLink aClass213_5;

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Ljava/net/Socket;Lsignlink!ll;)V")
	public BufferedSocket(@OriginalArg(0) Socket arg0, @OriginalArg(1) SignLink arg1) throws IOException {
		this.aClass213_5 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ma", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			while (true) {
				@Pc(39) int var1;
				@Pc(24) int var2;
				label85: {
					synchronized (this) {
						label86: {
							if (this.anInt3590 == this.anInt3596) {
								if (this.aBoolean177) {
									break label86;
								}
								try {
									this.wait();
								} catch (@Pc(21) InterruptedException local21) {
								}
							}
							var2 = this.anInt3596;
							if (this.anInt3596 > this.anInt3590) {
								var1 = 5000 - this.anInt3596;
							} else {
								var1 = this.anInt3590 - this.anInt3596;
							}
							break label85;
						}
					}
					try {
						if (this.anInputStream1 != null) {
							this.anInputStream1.close();
						}
						if (this.anOutputStream1 != null) {
							this.anOutputStream1.close();
						}
						if (this.aSocket1 != null) {
							this.aSocket1.close();
						}
					} catch (@Pc(119) IOException local119) {
					}
					this.aByteArray49 = null;
					break;
				}
				if (var1 > 0) {
					try {
						this.anOutputStream1.write(this.aByteArray49, var2, var1);
					} catch (@Pc(67) IOException local67) {
						this.aBoolean178 = true;
					}
					this.anInt3596 = (var1 + this.anInt3596) % 5000;
					try {
						if (this.anInt3590 == this.anInt3596) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(92) IOException local92) {
						this.aBoolean178 = true;
					}
				}
			}
		} catch (@Pc(124) Exception local124) {
			Static89.method1839(null, local124);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III[B)V")
	public final void method2827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean177) {
			return;
		}
		while (arg1 > 0) {
			@Pc(23) int local23 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local23 <= 0) {
				throw new EOFException();
			}
			arg0 += local23;
			arg1 -= local23;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)I")
	public final int read() throws IOException {
		return this.aBoolean177 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZI[BI)V")
	public final void write(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean177) {
			return;
		}
		if (this.aBoolean178) {
			this.aBoolean178 = false;
			throw new IOException();
		}
		if (this.aByteArray49 == null) {
			this.aByteArray49 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(34) int local34 = 0; local34 < arg1; local34++) {
				this.aByteArray49[this.anInt3590] = arg0[local34];
				this.anInt3590 = (this.anInt3590 + 1) % 5000;
				if (this.anInt3590 == (this.anInt3596 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass212_4 == null) {
				this.aClass212_4 = this.aClass213_5.method5130(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		this.method2834();
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)I")
	public final int available() throws IOException {
		return this.aBoolean177 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)V")
	public final void method2832() throws IOException {
		if (!this.aBoolean177 && this.aBoolean178) {
			this.aBoolean178 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
	public final void method2833() {
		if (!this.aBoolean177) {
			this.anInputStream1 = new BrokenInputStream();
			this.anOutputStream1 = new BrokenOutputStream();
		}
	}

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V")
	public final void method2834() {
		if (this.aBoolean177) {
			return;
		}
		synchronized (this) {
			this.aBoolean177 = true;
			this.notifyAll();
		}
		if (this.aClass212_4 != null) {
			while (this.aClass212_4.status == 0) {
				Static231.sleep(1L);
			}
			if (this.aClass212_4.status == 1) {
				try {
					((Thread) this.aClass212_4.result).join();
				} catch (@Pc(59) InterruptedException local59) {
				}
			}
		}
		this.aClass212_4 = null;
	}
}
