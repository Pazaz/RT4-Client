import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Js5CachedResourceProvider extends Js5ResourceProvider {

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "Lclient!ii;")
	private Js5Index aClass70_1;

	@OriginalMember(owner = "client!bg", name = "w", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!bg", name = "T", descriptor = "Z")
	private boolean aBoolean36;

	@OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
	private int anInt567 = 0;

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "Lclient!sc;")
	private final HashTable aClass133_1 = new HashTable(16);

	@OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
	private int anInt578 = 0;

	@OriginalMember(owner = "client!bg", name = "R", descriptor = "Lclient!ih;")
	private final LinkedList aClass69_16 = new LinkedList();

	@OriginalMember(owner = "client!bg", name = "V", descriptor = "J")
	private long aLong20 = 0L;

	@OriginalMember(owner = "client!bg", name = "L", descriptor = "I")
	private final int anInt576;

	@OriginalMember(owner = "client!bg", name = "F", descriptor = "Lclient!ge;")
	private final Cache aClass49_2;

	@OriginalMember(owner = "client!bg", name = "Q", descriptor = "Z")
	private boolean aBoolean35;

	@OriginalMember(owner = "client!bg", name = "U", descriptor = "Lclient!ih;")
	private LinkedList aClass69_17;

	@OriginalMember(owner = "client!bg", name = "J", descriptor = "Lclient!k;")
	private final Js5CacheQueue aClass80_2;

	@OriginalMember(owner = "client!bg", name = "H", descriptor = "I")
	private final int anInt573;

	@OriginalMember(owner = "client!bg", name = "W", descriptor = "Z")
	private final boolean aBoolean37;

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "Lclient!ge;")
	private final Cache aClass49_1;

	@OriginalMember(owner = "client!bg", name = "D", descriptor = "Lclient!jb;")
	private final Js5NetQueue aClass73_2;

	@OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
	private final int anInt566;

	@OriginalMember(owner = "client!bg", name = "x", descriptor = "Lclient!il;")
	private Js5Request aClass3_Sub2_Sub5_1;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(ILclient!ge;Lclient!ge;Lclient!jb;Lclient!k;IIZ)V")
	public Js5CachedResourceProvider(@OriginalArg(0) int arg0, @OriginalArg(1) Cache arg1, @OriginalArg(2) Cache arg2, @OriginalArg(3) Js5NetQueue arg3, @OriginalArg(4) Js5CacheQueue arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt576 = arg0;
		this.aClass49_2 = arg1;
		if (this.aClass49_2 == null) {
			this.aBoolean35 = false;
		} else {
			this.aBoolean35 = true;
			this.aClass69_17 = new LinkedList();
		}
		this.aClass80_2 = arg4;
		this.anInt573 = arg5;
		this.aBoolean37 = arg7;
		this.aClass49_1 = arg2;
		this.aClass73_2 = arg3;
		this.anInt566 = arg6;
		if (this.aClass49_1 != null) {
			this.aClass3_Sub2_Sub5_1 = this.aClass80_2.method2471(this.aClass49_1, this.anInt576);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
	@Override
	public final void method522(@OriginalArg(0) int arg0) {
		if (this.aClass49_2 == null) {
			return;
		}
		@Pc(15) Node local15;
		for (local15 = this.aClass69_16.method2289(); local15 != null; local15 = this.aClass69_16.method2288()) {
			if (local15.aLong192 == (long) arg0) {
				return;
			}
		}
		local15 = new Node();
		local15.aLong192 = arg0;
		this.aClass69_16.method2282(local15);
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)Lclient!ii;")
	@Override
	public final Js5Index method521() {
		if (this.aClass70_1 != null) {
			return this.aClass70_1;
		}
		if (this.aClass3_Sub2_Sub5_1 == null) {
			if (this.aClass73_2.method2326()) {
				return null;
			}
			this.aClass3_Sub2_Sub5_1 = this.aClass73_2.method2330(255, (byte) 0, this.anInt576, true);
		}
		if (this.aClass3_Sub2_Sub5_1.aBoolean226) {
			return null;
		}
		@Pc(52) byte[] local52 = this.aClass3_Sub2_Sub5_1.method3554();
		if (this.aClass3_Sub2_Sub5_1 instanceof Js5CacheRequest) {
			try {
				if (local52 == null) {
					throw new RuntimeException();
				}
				this.aClass70_1 = new Js5Index(local52, this.anInt573);
				if (this.anInt566 != this.aClass70_1.anInt2908) {
					throw new RuntimeException();
				}
			} catch (@Pc(88) RuntimeException local88) {
				this.aClass70_1 = null;
				if (this.aClass73_2.method2326()) {
					this.aClass3_Sub2_Sub5_1 = null;
				} else {
					this.aClass3_Sub2_Sub5_1 = this.aClass73_2.method2330(255, (byte) 0, this.anInt576, true);
				}
				return null;
			}
		} else {
			try {
				if (local52 == null) {
					throw new RuntimeException();
				}
				this.aClass70_1 = new Js5Index(local52, this.anInt573);
			} catch (@Pc(131) RuntimeException local131) {
				this.aClass73_2.method2327();
				this.aClass70_1 = null;
				if (this.aClass73_2.method2326()) {
					this.aClass3_Sub2_Sub5_1 = null;
				} else {
					this.aClass3_Sub2_Sub5_1 = this.aClass73_2.method2330(255, (byte) 0, this.anInt576, true);
				}
				return null;
			}
			if (this.aClass49_1 != null) {
				this.aClass80_2.method2467(this.aClass49_1, local52, this.anInt576);
			}
		}
		if (this.aClass49_2 != null) {
			this.aByteArray9 = new byte[this.aClass70_1.anInt2907];
			this.anInt567 = 0;
		}
		this.aClass3_Sub2_Sub5_1 = null;
		return this.aClass70_1;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
	public final void method528() {
		if (this.aClass49_2 != null) {
			this.aBoolean36 = true;
			if (this.aClass69_17 == null) {
				this.aClass69_17 = new LinkedList();
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)I")
	public final int method529() {
		return this.anInt567;
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)I")
	public final int method533() {
		if (this.aClass70_1 == null) {
			return 0;
		} else if (this.aBoolean35) {
			@Pc(25) Node local25 = this.aClass69_17.method2289();
			return local25 == null ? 0 : (int) local25.aLong192;
		} else {
			return this.aClass70_1.anInt2902;
		}
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(Z)V")
	public final void method534() {
		if (this.aClass69_17 != null) {
			if (this.method521() == null) {
				return;
			}
			@Pc(32) boolean local32;
			@Pc(37) Node local37;
			@Pc(43) int local43;
			if (this.aBoolean35) {
				local32 = true;
				for (local37 = this.aClass69_17.method2289(); local37 != null; local37 = this.aClass69_17.method2288()) {
					local43 = (int) local37.aLong192;
					if (this.aByteArray9[local43] == 0) {
						this.method536(1, local43);
					}
					if (this.aByteArray9[local43] == 0) {
						local32 = false;
					} else {
						local37.method4658();
					}
				}
				while (this.aClass70_1.anIntArray272.length > this.anInt578) {
					if (this.aClass70_1.anIntArray272[this.anInt578] == 0) {
						this.anInt578++;
					} else {
						if (this.aClass80_2.anInt3131 >= 250) {
							local32 = false;
							break;
						}
						if (this.aByteArray9[this.anInt578] == 0) {
							this.method536(1, this.anInt578);
						}
						if (this.aByteArray9[this.anInt578] == 0) {
							local32 = false;
							local37 = new Node();
							local37.aLong192 = this.anInt578;
							this.aClass69_17.method2282(local37);
						}
						this.anInt578++;
					}
				}
				if (local32) {
					this.aBoolean35 = false;
					this.anInt578 = 0;
				}
			} else if (this.aBoolean36) {
				local32 = true;
				for (local37 = this.aClass69_17.method2289(); local37 != null; local37 = this.aClass69_17.method2288()) {
					local43 = (int) local37.aLong192;
					if (this.aByteArray9[local43] != 1) {
						this.method536(2, local43);
					}
					if (this.aByteArray9[local43] == 1) {
						local37.method4658();
					} else {
						local32 = false;
					}
				}
				while (this.aClass70_1.anIntArray272.length > this.anInt578) {
					if (this.aClass70_1.anIntArray272[this.anInt578] == 0) {
						this.anInt578++;
					} else {
						if (this.aClass73_2.method2316()) {
							local32 = false;
							break;
						}
						if (this.aByteArray9[this.anInt578] != 1) {
							this.method536(2, this.anInt578);
						}
						if (this.aByteArray9[this.anInt578] != 1) {
							local37 = new Node();
							local37.aLong192 = this.anInt578;
							this.aClass69_17.method2282(local37);
							local32 = false;
						}
						this.anInt578++;
					}
				}
				if (local32) {
					this.anInt578 = 0;
					this.aBoolean36 = false;
				}
			} else {
				this.aClass69_17 = null;
			}
		}
		if (!this.aBoolean37 || this.aLong20 > MonotonicClock.currentTimeMillis()) {
			return;
		}
		for (@Pc(331) Js5Request local331 = (Js5Request) this.aClass133_1.method3859(); local331 != null; local331 = (Js5Request) this.aClass133_1.method3861()) {
			if (!local331.aBoolean226) {
				if (local331.aBoolean227) {
					if (!local331.aBoolean225) {
						throw new RuntimeException();
					}
					local331.method4658();
				} else {
					local331.aBoolean227 = true;
				}
			}
		}
		this.aLong20 = MonotonicClock.currentTimeMillis() + 1000L;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)I")
	@Override
	public final int method524(@OriginalArg(0) int arg0) {
		@Pc(15) Js5Request local15 = (Js5Request) this.aClass133_1.method3863((long) arg0);
		return local15 == null ? 0 : local15.method3553();
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)I")
	public final int method535() {
		return this.aClass70_1 == null ? 0 : this.aClass70_1.anInt2902;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)Lclient!il;")
	private Js5Request method536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Js5Request local13 = (Js5Request) this.aClass133_1.method3863((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean225 && local13.aBoolean226) {
			local13.method4658();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass49_2 == null || this.aByteArray9[arg1] == -1) {
					if (this.aClass73_2.method2326()) {
						return null;
					}
					local13 = this.aClass73_2.method2330(this.anInt576, (byte) 2, arg1, true);
				} else {
					local13 = this.aClass80_2.method2471(this.aClass49_2, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass49_2 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass80_2.method2469(arg1, this.aClass49_2);
			} else if (arg0 == 2) {
				if (this.aClass49_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray9[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass73_2.method2316()) {
					return null;
				}
				local13 = this.aClass73_2.method2330(this.anInt576, (byte) 2, arg1, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass133_1.method3862(local13, (long) arg1);
		}
		if (local13.aBoolean226) {
			return null;
		}
		@Pc(161) byte[] local161 = local13.method3554();
		@Pc(199) int local199;
		@Pc(252) Js5NetRequest local252;
		if (!(local13 instanceof Js5CacheRequest)) {
			try {
				if (local161 == null || local161.length <= 2) {
					throw new RuntimeException();
				}
				Static74.aCRC32_1.reset();
				Static74.aCRC32_1.update(local161, 0, local161.length - 2);
				local199 = (int) Static74.aCRC32_1.getValue();
				if (this.aClass70_1.anIntArray268[arg1] != local199) {
					throw new RuntimeException();
				}
				this.aClass73_2.errors = 0;
				this.aClass73_2.response = 0;
			} catch (@Pc(225) RuntimeException local225) {
				this.aClass73_2.method2327();
				local13.method4658();
				if (local13.aBoolean225 && !this.aClass73_2.method2326()) {
					local252 = this.aClass73_2.method2330(this.anInt576, (byte) 2, arg1, true);
					this.aClass133_1.method3862(local252, (long) arg1);
				}
				return null;
			}
			local161[local161.length - 2] = (byte) (this.aClass70_1.anIntArray273[arg1] >>> 8);
			local161[local161.length - 1] = (byte) this.aClass70_1.anIntArray273[arg1];
			if (this.aClass49_2 != null) {
				this.aClass80_2.method2467(this.aClass49_2, local161, arg1);
				if (this.aByteArray9[arg1] != 1) {
					this.anInt567++;
					this.aByteArray9[arg1] = 1;
				}
			}
			if (!local13.aBoolean225) {
				local13.method4658();
			}
			return local13;
		}
		try {
			if (local161 == null || local161.length <= 2) {
				throw new RuntimeException();
			}
			Static74.aCRC32_1.reset();
			Static74.aCRC32_1.update(local161, 0, local161.length - 2);
			local199 = (int) Static74.aCRC32_1.getValue();
			if (this.aClass70_1.anIntArray268[arg1] != local199) {
				throw new RuntimeException();
			}
			@Pc(385) int local385 = ((local161[local161.length - 2] & 0xFF) << 8) + (local161[local161.length - 1] & 0xFF);
			if (local385 != (this.aClass70_1.anIntArray273[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray9[arg1] != 1) {
				if (this.aByteArray9[arg1] != 0) {
				}
				this.anInt567++;
				this.aByteArray9[arg1] = 1;
			}
			if (!local13.aBoolean225) {
				local13.method4658();
			}
			return local13;
		} catch (@Pc(437) Exception local437) {
			this.aByteArray9[arg1] = -1;
			local13.method4658();
			if (local13.aBoolean225 && !this.aClass73_2.method2326()) {
				local252 = this.aClass73_2.method2330(this.anInt576, (byte) 2, arg1, true);
				this.aClass133_1.method3862(local252, (long) arg1);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)V")
	public final void method537() {
		if (this.aClass69_17 == null || this.method521() == null) {
			return;
		}
		for (@Pc(21) Node local21 = this.aClass69_16.method2289(); local21 != null; local21 = this.aClass69_16.method2288()) {
			@Pc(28) int local28 = (int) local21.aLong192;
			if (local28 < 0 || this.aClass70_1.anInt2907 <= local28 || this.aClass70_1.anIntArray272[local28] == 0) {
				local21.method4658();
			} else {
				if (this.aByteArray9[local28] == 0) {
					this.method536(1, local28);
				}
				if (this.aByteArray9[local28] == -1) {
					this.method536(2, local28);
				}
				if (this.aByteArray9[local28] == 1) {
					local21.method4658();
				}
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)I")
	public final int method538() {
		if (this.method521() == null) {
			return this.aClass3_Sub2_Sub5_1 == null ? 0 : this.aClass3_Sub2_Sub5_1.method3553();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(II)[B")
	@Override
	public final byte[] method525(@OriginalArg(0) int arg0) {
		@Pc(9) Js5Request local9 = this.method536(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method3554();
			local9.method4658();
			return local17;
		}
	}
}
