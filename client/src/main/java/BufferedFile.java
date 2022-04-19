import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class BufferedFile {

	@OriginalMember(owner = "client!en", name = "m", descriptor = "J")
	private long aLong67;

	@OriginalMember(owner = "client!en", name = "v", descriptor = "I")
	private int anInt1906;

	@OriginalMember(owner = "client!en", name = "p", descriptor = "J")
	private long aLong68 = -1L;

	@OriginalMember(owner = "client!en", name = "g", descriptor = "I")
	private int anInt1899 = 0;

	@OriginalMember(owner = "client!en", name = "w", descriptor = "J")
	private long aLong69 = -1L;

	@OriginalMember(owner = "client!en", name = "s", descriptor = "Lsignlink!qm;")
	private final FileOnDisk aClass214_1;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "J")
	private long aLong64;

	@OriginalMember(owner = "client!en", name = "j", descriptor = "J")
	private long aLong65;

	@OriginalMember(owner = "client!en", name = "q", descriptor = "[B")
	private final byte[] aByteArray20;

	@OriginalMember(owner = "client!en", name = "b", descriptor = "[B")
	private final byte[] aByteArray19;

	@OriginalMember(owner = "client!en", name = "k", descriptor = "J")
	private long aLong66;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lsignlink!qm;II)V")
	public BufferedFile(@OriginalArg(0) FileOnDisk arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass214_1 = arg0;
		this.aLong65 = this.aLong64 = arg0.method5137();
		this.aByteArray20 = new byte[arg2];
		this.aByteArray19 = new byte[arg1];
		this.aLong66 = 0L;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
	private void method1450() throws IOException {
		if (this.aLong68 == -1L) {
			return;
		}
		if (this.aLong68 != this.aLong67) {
			this.aClass214_1.method5133(this.aLong68);
			this.aLong67 = this.aLong68;
		}
		this.aClass214_1.method5134(this.aByteArray20, this.anInt1899, 0);
		@Pc(45) long local45 = -1L;
		if (this.aLong69 <= this.aLong68 && this.aLong69 + (long) this.anInt1906 > this.aLong68) {
			local45 = this.aLong68;
		} else if (this.aLong68 <= this.aLong69 && this.aLong69 < this.aLong68 + (long) this.anInt1899) {
			local45 = this.aLong69;
		}
		this.aLong67 += this.anInt1899;
		if (this.aLong64 < this.aLong67) {
			this.aLong64 = this.aLong67;
		}
		@Pc(118) long local118 = -1L;
		if (this.aLong69 < this.aLong68 + (long) this.anInt1899 && (long) this.anInt1906 + this.aLong69 >= (long) this.anInt1899 + this.aLong68) {
			local118 = this.aLong68 + (long) this.anInt1899;
		} else if (this.aLong69 + (long) this.anInt1906 > this.aLong68 && (long) this.anInt1899 + this.aLong68 >= (long) this.anInt1906 + this.aLong69) {
			local118 = (long) this.anInt1906 + this.aLong69;
		}
		if (local45 > -1L && local118 > local45) {
			@Pc(208) int local208 = (int) (local118 - local45);
			Static289.method2612(this.aByteArray20, (int) (local45 - this.aLong68), this.aByteArray19, (int) (local45 - this.aLong69), local208);
		}
		this.anInt1899 = 0;
		this.aLong68 = -1L;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)J")
	public final long method1451() {
		return this.aLong65;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method1452() {
		return this.aClass214_1.method5138();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I[BII)V")
	public final void method1453(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg2 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong68 != -1L && this.aLong66 >= this.aLong68 && (long) this.anInt1899 + this.aLong68 >= (long) arg2 + this.aLong66) {
				Static289.method2612(this.aByteArray20, (int) (this.aLong66 - this.aLong68), arg1, 0, arg2);
				this.aLong66 += arg2;
				return;
			}
			@Pc(71) long local71 = this.aLong66;
			@Pc(75) int local75 = arg2;
			@Pc(102) int local102;
			if (this.aLong69 <= this.aLong66 && this.aLong69 + (long) this.anInt1906 > this.aLong66) {
				local102 = (int) ((long) this.anInt1906 + this.aLong69 - this.aLong66);
				if (local102 > arg2) {
					local102 = arg2;
				}
				Static289.method2612(this.aByteArray19, (int) (this.aLong66 - this.aLong69), arg1, 0, local102);
				arg0 = local102;
				arg2 -= local102;
				this.aLong66 += local102;
			}
			if (this.aByteArray19.length < arg2) {
				this.aClass214_1.method5133(this.aLong66);
				this.aLong67 = this.aLong66;
				while (arg2 > 0) {
					local102 = this.aClass214_1.method5135(arg0, arg2, arg1);
					if (local102 == -1) {
						break;
					}
					this.aLong67 += local102;
					arg2 -= local102;
					arg0 += local102;
					this.aLong66 += local102;
				}
			} else if (arg2 > 0) {
				this.method1456();
				local102 = arg2;
				if (arg2 > this.anInt1906) {
					local102 = this.anInt1906;
				}
				Static289.method2612(this.aByteArray19, 0, arg1, arg0, local102);
				arg2 -= local102;
				arg0 += local102;
				this.aLong66 += local102;
			}
			if (this.aLong68 != -1L) {
				if (this.aLong66 < this.aLong68 && arg2 > 0) {
					local102 = (int) (this.aLong68 - this.aLong66) + arg0;
					if (arg0 + arg2 < local102) {
						local102 = arg0 + arg2;
					}
					while (arg0 < local102) {
						arg1[arg0++] = 0;
						this.aLong66++;
						arg2--;
					}
				}
				@Pc(298) long local298 = -1L;
				@Pc(300) long local300 = -1L;
				if ((long) this.anInt1899 + this.aLong68 > local71 && (long) local75 + local71 >= (long) this.anInt1899 + this.aLong68) {
					local300 = (long) this.anInt1899 + this.aLong68;
				} else if (this.aLong68 < (long) local75 + local71 && (long) this.anInt1899 + this.aLong68 >= (long) local75 + local71) {
					local300 = (long) local75 + local71;
				}
				if (local71 <= this.aLong68 && local71 + (long) local75 > this.aLong68) {
					local298 = this.aLong68;
				} else if (local71 >= this.aLong68 && local71 < (long) this.anInt1899 + this.aLong68) {
					local298 = local71;
				}
				if (local298 > -1L && local300 > local298) {
					@Pc(426) int local426 = (int) (local300 - local298);
					Static289.method2612(this.aByteArray20, (int) (local298 - this.aLong68), arg1, (int) (local298 - local71), local426);
					if (this.aLong66 < local300) {
						arg2 = (int) ((long) arg2 + this.aLong66 - local300);
						this.aLong66 = local300;
					}
				}
			}
		} catch (@Pc(464) IOException local464) {
			this.aLong67 = -1L;
			throw local464;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)V")
	public final void method1455() throws IOException {
		this.method1450();
		this.aClass214_1.method5136();
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V")
	private void method1456() throws IOException {
		this.anInt1906 = 0;
		if (this.aLong67 != this.aLong66) {
			this.aClass214_1.method5133(this.aLong66);
			this.aLong67 = this.aLong66;
		}
		this.aLong69 = this.aLong66;
		while (this.aByteArray19.length > this.anInt1906) {
			@Pc(49) int local49 = this.aByteArray19.length - this.anInt1906;
			if (local49 > 200000000) {
				local49 = 200000000;
			}
			@Pc(66) int local66 = this.aClass214_1.method5135(this.anInt1906, local49, this.aByteArray19);
			if (local66 == -1) {
				break;
			}
			this.aLong67 += local66;
			this.anInt1906 += local66;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z[B)V")
	public final void method1457(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method1453(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([BIII)V")
	public final void method1458(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong65 < (long) arg2 + this.aLong66) {
				this.aLong65 = (long) arg2 + this.aLong66;
			}
			if (this.aLong68 != -1L && (this.aLong68 > this.aLong66 || this.aLong66 > (long) this.anInt1899 + this.aLong68)) {
				this.method1450();
			}
			if (this.aLong68 != -1L && (long) this.aByteArray20.length + this.aLong68 < (long) arg2 + this.aLong66) {
				@Pc(90) int local90 = (int) ((long) this.aByteArray20.length + this.aLong68 - this.aLong66);
				arg2 -= local90;
				Static289.method2612(arg0, arg1, this.aByteArray20, (int) (this.aLong66 - this.aLong68), local90);
				this.aLong66 += local90;
				this.anInt1899 = this.aByteArray20.length;
				this.method1450();
				arg1 += local90;
			}
			if (this.aByteArray20.length < arg2) {
				if (this.aLong66 != this.aLong67) {
					this.aClass214_1.method5133(this.aLong66);
					this.aLong67 = this.aLong66;
				}
				this.aClass214_1.method5134(arg0, arg2, arg1);
				@Pc(165) long local165 = -1L;
				if (this.aLong69 <= this.aLong66 && (long) this.anInt1906 + this.aLong69 > this.aLong66) {
					local165 = this.aLong66;
				} else if (this.aLong66 <= this.aLong69 && (long) arg2 + this.aLong66 > this.aLong69) {
					local165 = this.aLong69;
				}
				this.aLong67 += arg2;
				@Pc(226) long local226 = -1L;
				if (this.aLong64 < this.aLong67) {
					this.aLong64 = this.aLong67;
				}
				if (this.aLong66 + (long) arg2 > this.aLong69 && this.aLong66 + (long) arg2 <= this.aLong69 - -((long) this.anInt1906)) {
					local226 = (long) arg2 + this.aLong66;
				} else if (this.aLong69 + (long) this.anInt1906 > this.aLong66 && this.aLong66 + (long) arg2 >= (long) this.anInt1906 + this.aLong69) {
					local226 = (long) this.anInt1906 + this.aLong69;
				}
				if (local165 > -1L && local226 > local165) {
					@Pc(324) int local324 = (int) (local226 - local165);
					Static289.method2612(arg0, (int) (local165 + (long) arg1 - this.aLong66), this.aByteArray19, (int) (local165 - this.aLong69), local324);
				}
				this.aLong66 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong68 == -1L) {
					this.aLong68 = this.aLong66;
				}
				Static289.method2612(arg0, arg1, this.aByteArray20, (int) (this.aLong66 - this.aLong68), arg2);
				this.aLong66 += arg2;
				if ((long) this.anInt1899 < this.aLong66 - this.aLong68) {
					this.anInt1899 = (int) (this.aLong66 - this.aLong68);
				}
			}
		} catch (@Pc(414) IOException local414) {
			this.aLong67 = -1L;
			throw local414;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IJ)V")
	public final void method1459(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1452());
		}
		this.aLong66 = arg0;
	}
}
