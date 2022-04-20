import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public class AudioChannel {

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "Lclient!qb;")
	private PcmStream aClass3_Sub3_6;

	@OriginalMember(owner = "client!vh", name = "n", descriptor = "[I")
	public int[] anIntArray411;

	@OriginalMember(owner = "client!vh", name = "D", descriptor = "I")
	private int anInt4637;

	@OriginalMember(owner = "client!vh", name = "H", descriptor = "I")
	public int anInt4641;

	@OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
	public int anInt4644;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
	private final int anInt4621 = 32;

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "J")
	private long aLong151 = MonotonicClock.currentTimeMillis();

	@OriginalMember(owner = "client!vh", name = "w", descriptor = "[Lclient!qb;")
	private final PcmStream[] aClass3_Sub3Array5 = new PcmStream[8];

	@OriginalMember(owner = "client!vh", name = "x", descriptor = "I")
	private int anInt4634 = 0;

	@OriginalMember(owner = "client!vh", name = "v", descriptor = "J")
	private long aLong152 = 0L;

	@OriginalMember(owner = "client!vh", name = "E", descriptor = "I")
	private int anInt4638 = 0;

	@OriginalMember(owner = "client!vh", name = "A", descriptor = "Z")
	private boolean aBoolean229 = true;

	@OriginalMember(owner = "client!vh", name = "z", descriptor = "[Lclient!qb;")
	private final PcmStream[] aClass3_Sub3Array6 = new PcmStream[8];

	@OriginalMember(owner = "client!vh", name = "y", descriptor = "J")
	private long aLong153 = 0L;

	@OriginalMember(owner = "client!vh", name = "G", descriptor = "I")
	private int anInt4640 = 0;

	@OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
	private int anInt4636 = 0;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "()V")
	protected void method3561() throws Exception {
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	public void method3562(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "()V")
	protected void method3563() throws Exception {
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "([II)V")
	private void method3564(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static164.aBoolean192) {
			local1 = 512;
		}
		Static289.method2618(arg0, 0, local1);
		this.anInt4638 -= 256;
		if (this.aClass3_Sub3_6 != null && this.anInt4638 <= 0) {
			this.anInt4638 += Static44.anInt1404 >> 4;
			Static167.method3170(this.aClass3_Sub3_6);
			this.method3567(this.aClass3_Sub3_6, this.aClass3_Sub3_6.method4407());
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = 255;
			@Pc(49) int local49 = 7;
			label106: while (local47 != 0) {
				@Pc(57) int local57;
				@Pc(62) int local62;
				if (local49 < 0) {
					local57 = local49 & 0x3;
					local62 = -(local49 >> 2);
				} else {
					local57 = local49;
					local62 = 0;
				}
				for (@Pc(73) int local73 = local47 >>> local57 & 0x11111111; local73 != 0; local73 >>>= 0x4) {
					if ((local73 & 0x1) != 0) {
						local47 &= ~(0x1 << local57);
						@Pc(91) PcmStream local91 = null;
						@Pc(96) PcmStream local96 = this.aClass3_Sub3Array5[local57];
						label100: while (true) {
							while (true) {
								if (local96 == null) {
									break label100;
								}
								@Pc(101) Sound local101 = local96.aClass3_Sub16_5;
								if (local101 == null || local101.anInt3313 <= local62) {
									local96.aBoolean292 = true;
									@Pc(125) int local125 = local96.method4404();
									local45 += local125;
									if (local101 != null) {
										local101.anInt3313 += local125;
									}
									if (local45 >= this.anInt4621) {
										break label106;
									}
									@Pc(145) PcmStream local145 = local96.method4406();
									if (local145 != null) {
										@Pc(150) int local150 = local96.anInt5626;
										while (local145 != null) {
											this.method3567(local145, local150 * local145.method4407() >> 8);
											local145 = local96.method4409();
										}
									}
									@Pc(169) PcmStream local169 = local96.aClass3_Sub3_8;
									local96.aClass3_Sub3_8 = null;
									if (local91 == null) {
										this.aClass3_Sub3Array5[local57] = local169;
									} else {
										local91.aClass3_Sub3_8 = local169;
									}
									if (local169 == null) {
										this.aClass3_Sub3Array6[local57] = local91;
									}
									local96 = local169;
								} else {
									local47 |= 0x1 << local57;
									local91 = local96;
									local96 = local96.aClass3_Sub3_8;
								}
							}
						}
					}
					local57 += 4;
					local62++;
				}
				local49--;
			}
			for (local49 = 0; local49 < 8; local49++) {
				@Pc(212) PcmStream local212 = this.aClass3_Sub3Array5[local49];
				this.aClass3_Sub3Array5[local49] = this.aClass3_Sub3Array6[local49] = null;
				while (local212 != null) {
					@Pc(227) PcmStream local227 = local212.aClass3_Sub3_8;
					local212.aClass3_Sub3_8 = null;
					local212 = local227;
				}
			}
		}
		if (this.anInt4638 < 0) {
			this.anInt4638 = 0;
		}
		if (this.aClass3_Sub3_6 != null) {
			this.aClass3_Sub3_6.method4408(arg0, 0, 256);
		}
		this.aLong151 = MonotonicClock.currentTimeMillis();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
	public final synchronized void method3565() {
		if (this.anIntArray411 == null) {
			return;
		}
		@Pc(14) long local14 = MonotonicClock.currentTimeMillis();
		try {
			if (this.aLong153 != 0L) {
				if (local14 < this.aLong153) {
					return;
				}
				this.method3562(this.anInt4644);
				this.aBoolean229 = true;
				this.aLong153 = 0L;
			}
			@Pc(38) int local38 = this.method3569();
			if (this.anInt4634 < this.anInt4636 - local38) {
				this.anInt4634 = this.anInt4636 - local38;
			}
			@Pc(65) int local65 = this.anInt4641 + this.anInt4637;
			if (local65 + 256 > 16384) {
				local65 = 16128;
			}
			if (this.anInt4644 < local65 + 256) {
				this.anInt4644 += 1024;
				if (this.anInt4644 > 16384) {
					this.anInt4644 = 16384;
				}
				this.method3572();
				local38 = 0;
				this.method3562(this.anInt4644);
				if (this.anInt4644 < local65 + 256) {
					local65 = this.anInt4644 - 256;
					this.anInt4637 = local65 - this.anInt4641;
				}
				this.aBoolean229 = true;
			}
			while (local65 > local38) {
				local38 += 256;
				this.method3564(this.anIntArray411);
				this.method3561();
			}
			if (local14 > this.aLong152) {
				if (this.aBoolean229) {
					this.aBoolean229 = false;
				} else if (this.anInt4634 == 0 && this.anInt4640 == 0) {
					this.method3572();
					this.aLong153 = local14 + 2000L;
					return;
				} else {
					this.anInt4637 = Math.min(this.anInt4640, this.anInt4634);
					this.anInt4640 = this.anInt4634;
				}
				this.aLong152 = local14 + 2000L;
				this.anInt4634 = 0;
			}
			this.anInt4636 = local38;
		} catch (@Pc(202) Exception local202) {
			this.method3572();
			this.aLong153 = local14 + 2000L;
		}
		try {
			if (local14 > this.aLong151 + 500000L) {
				local14 = this.aLong151;
			}
			while (local14 > this.aLong151 + 5000L) {
				this.method3573();
				this.aLong151 += 256000 / Static44.anInt1404;
			}
		} catch (@Pc(247) Exception local247) {
			this.aLong151 = local14;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!qb;)V")
	public final synchronized void method3566(@OriginalArg(1) PcmStream arg0) {
		this.aClass3_Sub3_6 = arg0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!qb;IB)V")
	private void method3567(@OriginalArg(0) PcmStream arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg1 >> 5;
		@Pc(21) PcmStream local21 = this.aClass3_Sub3Array6[local16];
		if (local21 == null) {
			this.aClass3_Sub3Array5[local16] = arg0;
		} else {
			local21.aClass3_Sub3_8 = arg0;
		}
		this.aClass3_Sub3Array6[local16] = arg0;
		arg0.anInt5626 = arg1;
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "()I")
	protected int method3569() throws Exception {
		return this.anInt4644;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V")
	public final synchronized void method3570() {
		this.aBoolean229 = true;
		try {
			this.method3563();
		} catch (@Pc(10) Exception local10) {
			this.method3572();
			this.aLong153 = MonotonicClock.currentTimeMillis() + 2000L;
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
	public final void method3571() {
		this.aBoolean229 = true;
	}

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "()V")
	protected void method3572() {
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V")
	private void method3573() {
		this.anInt4638 -= 256;
		if (this.anInt4638 < 0) {
			this.anInt4638 = 0;
		}
		if (this.aClass3_Sub3_6 != null) {
			this.aClass3_Sub3_6.method4410(256);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V")
	public final synchronized void method3575() {
		if (Static60.aClass19_1 != null) {
			@Pc(6) boolean local6 = true;
			for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
				if (Static60.aClass19_1.aClass62Array1[local8] == this) {
					Static60.aClass19_1.aClass62Array1[local8] = null;
				}
				if (Static60.aClass19_1.aClass62Array1[local8] != null) {
					local6 = false;
				}
			}
			if (local6) {
				Static60.aClass19_1.aBoolean62 = true;
				while (Static60.aClass19_1.aBoolean64) {
					Static231.sleep(50L);
				}
				Static60.aClass19_1 = null;
			}
		}
		this.method3572();
		this.anIntArray411 = null;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method3576(@OriginalArg(0) Component arg0) throws Exception {
	}
}
