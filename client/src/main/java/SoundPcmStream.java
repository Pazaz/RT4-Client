import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class SoundPcmStream extends PcmStream {

	@OriginalMember(owner = "client!b", name = "v", descriptor = "I")
	public int anInt344;

	@OriginalMember(owner = "client!b", name = "y", descriptor = "I")
	public int anInt347;

	@OriginalMember(owner = "client!b", name = "z", descriptor = "I")
	public int anInt348;

	@OriginalMember(owner = "client!b", name = "C", descriptor = "I")
	private int anInt350;

	@OriginalMember(owner = "client!b", name = "D", descriptor = "I")
	private int anInt351;

	@OriginalMember(owner = "client!b", name = "E", descriptor = "I")
	public int anInt352;

	@OriginalMember(owner = "client!b", name = "G", descriptor = "I")
	public int anInt354;

	@OriginalMember(owner = "client!b", name = "H", descriptor = "I")
	public int anInt355;

	@OriginalMember(owner = "client!b", name = "w", descriptor = "I")
	private final int anInt345;

	@OriginalMember(owner = "client!b", name = "F", descriptor = "I")
	private final int anInt353;

	@OriginalMember(owner = "client!b", name = "A", descriptor = "Z")
	private final boolean aBoolean14;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "I")
	private int anInt342;

	@OriginalMember(owner = "client!b", name = "u", descriptor = "I")
	private int anInt343;

	@OriginalMember(owner = "client!b", name = "B", descriptor = "I")
	private int anInt349;

	@OriginalMember(owner = "client!b", name = "x", descriptor = "I")
	public int anInt346;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!kj;II)V")
	public SoundPcmStream(@OriginalArg(0) PcmSound arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub16_5 = arg0;
		this.anInt345 = arg0.anInt3315;
		this.anInt353 = arg0.anInt3314;
		this.aBoolean14 = arg0.aBoolean165;
		this.anInt342 = arg1;
		this.anInt343 = arg2;
		this.anInt349 = 8192;
		this.anInt346 = 0;
		this.method416();
	}

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!kj;III)V")
	public SoundPcmStream(@OriginalArg(0) PcmSound arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass3_Sub16_5 = arg0;
		this.anInt345 = arg0.anInt3315;
		this.anInt353 = arg0.anInt3314;
		this.aBoolean14 = arg0.aBoolean165;
		this.anInt342 = arg1;
		this.anInt343 = arg2;
		this.anInt349 = arg3;
		this.anInt346 = 0;
		this.method416();
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "([III)V")
	@Override
	public final synchronized void method4408(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt343 == 0 && this.anInt351 == 0) {
			this.method4410(arg2);
			return;
		}
		@Pc(13) PcmSound local13 = (PcmSound) this.aClass3_Sub16_5;
		@Pc(18) int local18 = this.anInt345 << 8;
		@Pc(23) int local23 = this.anInt353 << 8;
		@Pc(29) int local29 = local13.aByteArray47.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt350 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt346 < 0) {
			if (this.anInt342 <= 0) {
				this.method406();
				this.method4658();
				return;
			}
			this.anInt346 = 0;
		}
		if (this.anInt346 >= local29) {
			if (this.anInt342 >= 0) {
				this.method406();
				this.method4658();
				return;
			}
			this.anInt346 = local29 - 1;
		}
		if (this.anInt350 >= 0) {
			if (this.anInt350 > 0) {
				if (this.aBoolean14) {
					label131: {
						if (this.anInt342 < 0) {
							local40 = this.method403(arg0, arg1, local18, local44, local13.aByteArray47[this.anInt345]);
							if (this.anInt346 >= local18) {
								return;
							}
							this.anInt346 = local18 + local18 - this.anInt346 - 1;
							this.anInt342 = -this.anInt342;
							if (--this.anInt350 == 0) {
								break label131;
							}
						}
						do {
							local40 = this.method385(arg0, local40, local23, local44, local13.aByteArray47[this.anInt353 - 1]);
							if (this.anInt346 < local23) {
								return;
							}
							this.anInt346 = local23 + local23 - this.anInt346 - 1;
							this.anInt342 = -this.anInt342;
							if (--this.anInt350 == 0) {
								break;
							}
							local40 = this.method403(arg0, local40, local18, local44, local13.aByteArray47[this.anInt345]);
							if (this.anInt346 >= local18) {
								return;
							}
							this.anInt346 = local18 + local18 - this.anInt346 - 1;
							this.anInt342 = -this.anInt342;
						} while (--this.anInt350 != 0);
					}
				} else {
					@Pc(417) int local417;
					if (this.anInt342 < 0) {
						while (true) {
							local40 = this.method403(arg0, local40, local18, local44, local13.aByteArray47[this.anInt353 - 1]);
							if (this.anInt346 >= local18) {
								return;
							}
							local417 = (local23 - this.anInt346 - 1) / local33;
							if (local417 >= this.anInt350) {
								this.anInt346 += local33 * this.anInt350;
								this.anInt350 = 0;
								break;
							}
							this.anInt346 += local33 * local417;
							this.anInt350 -= local417;
						}
					} else {
						while (true) {
							local40 = this.method385(arg0, local40, local23, local44, local13.aByteArray47[this.anInt345]);
							if (this.anInt346 < local23) {
								return;
							}
							local417 = (this.anInt346 - local18) / local33;
							if (local417 >= this.anInt350) {
								this.anInt346 -= local33 * this.anInt350;
								this.anInt350 = 0;
								break;
							}
							this.anInt346 -= local33 * local417;
							this.anInt350 -= local417;
						}
					}
				}
			}
			if (this.anInt342 < 0) {
				this.method403(arg0, local40, 0, local44, 0);
				if (this.anInt346 < 0) {
					this.anInt346 = -1;
					this.method406();
					this.method4658();
				}
			} else {
				this.method385(arg0, local40, local29, local44, 0);
				if (this.anInt346 >= local29) {
					this.anInt346 = local29;
					this.method406();
					this.method4658();
				}
			}
		} else if (this.aBoolean14) {
			if (this.anInt342 < 0) {
				local40 = this.method403(arg0, arg1, local18, local44, local13.aByteArray47[this.anInt345]);
				if (this.anInt346 >= local18) {
					return;
				}
				this.anInt346 = local18 + local18 - this.anInt346 - 1;
				this.anInt342 = -this.anInt342;
			}
			while (true) {
				local40 = this.method385(arg0, local40, local23, local44, local13.aByteArray47[this.anInt353 - 1]);
				if (this.anInt346 < local23) {
					return;
				}
				this.anInt346 = local23 + local23 - this.anInt346 - 1;
				this.anInt342 = -this.anInt342;
				local40 = this.method403(arg0, local40, local18, local44, local13.aByteArray47[this.anInt345]);
				if (this.anInt346 >= local18) {
					return;
				}
				this.anInt346 = local18 + local18 - this.anInt346 - 1;
				this.anInt342 = -this.anInt342;
			}
		} else if (this.anInt342 < 0) {
			while (true) {
				local40 = this.method403(arg0, local40, local18, local44, local13.aByteArray47[this.anInt353 - 1]);
				if (this.anInt346 >= local18) {
					return;
				}
				this.anInt346 = local23 - (local23 - 1 - this.anInt346) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method385(arg0, local40, local23, local44, local13.aByteArray47[this.anInt345]);
				if (this.anInt346 < local23) {
					return;
				}
				this.anInt346 = local18 + (this.anInt346 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "()Z")
	private boolean method383() {
		@Pc(2) int local2 = this.anInt343;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static284.method419(local2, this.anInt349);
			local8 = Static284.method421(local2, this.anInt349);
		}
		if (this.anInt348 != local2 || this.anInt355 != local10 || this.anInt352 != local8) {
			if (this.anInt348 < local2) {
				this.anInt344 = 1;
				this.anInt351 = local2 - this.anInt348;
			} else if (this.anInt348 > local2) {
				this.anInt344 = -1;
				this.anInt351 = this.anInt348 - local2;
			} else {
				this.anInt344 = 0;
			}
			if (this.anInt355 < local10) {
				this.anInt347 = 1;
				if (this.anInt351 == 0 || this.anInt351 > local10 - this.anInt355) {
					this.anInt351 = local10 - this.anInt355;
				}
			} else if (this.anInt355 > local10) {
				this.anInt347 = -1;
				if (this.anInt351 == 0 || this.anInt351 > this.anInt355 - local10) {
					this.anInt351 = this.anInt355 - local10;
				}
			} else {
				this.anInt347 = 0;
			}
			if (this.anInt352 < local8) {
				this.anInt354 = 1;
				if (this.anInt351 == 0 || this.anInt351 > local8 - this.anInt352) {
					this.anInt351 = local8 - this.anInt352;
				}
			} else if (this.anInt352 > local8) {
				this.anInt354 = -1;
				if (this.anInt351 == 0 || this.anInt351 > this.anInt352 - local8) {
					this.anInt351 = this.anInt352 - local8;
				}
			} else {
				this.anInt354 = 0;
			}
			return false;
		} else if (this.anInt343 == Integer.MIN_VALUE) {
			this.anInt343 = 0;
			this.anInt348 = this.anInt355 = this.anInt352 = 0;
			this.method4658();
			return true;
		} else {
			this.method416();
			return false;
		}
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V")
	public final synchronized void method384(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method397();
			this.method4658();
		} else if (this.anInt355 == 0 && this.anInt352 == 0) {
			this.anInt351 = 0;
			this.anInt343 = 0;
			this.anInt348 = 0;
			this.method4658();
		} else {
			@Pc(31) int local31 = -this.anInt348;
			if (this.anInt348 > local31) {
				local31 = this.anInt348;
			}
			if (-this.anInt355 > local31) {
				local31 = -this.anInt355;
			}
			if (this.anInt355 > local31) {
				local31 = this.anInt355;
			}
			if (-this.anInt352 > local31) {
				local31 = -this.anInt352;
			}
			if (this.anInt352 > local31) {
				local31 = this.anInt352;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt351 = arg0;
			this.anInt343 = Integer.MIN_VALUE;
			this.anInt344 = -this.anInt348 / arg0;
			this.anInt347 = -this.anInt355 / arg0;
			this.anInt354 = -this.anInt352 / arg0;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([IIIII)I")
	private int method385(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt351 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt351;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt351 += arg1;
				if (this.anInt342 == 256 && (this.anInt346 & 0xFF) == 0) {
					if (Static164.aBoolean192) {
						arg1 = Static284.method393(((PcmSound) this.aClass3_Sub16_5).aByteArray47, arg0, this.anInt346, arg1, this.anInt355, this.anInt352, this.anInt347, this.anInt354, local7, arg2, this);
					} else {
						arg1 = Static284.method395(((PcmSound) this.aClass3_Sub16_5).aByteArray47, arg0, this.anInt346, arg1, this.anInt348, this.anInt344, local7, arg2, this);
					}
				} else if (Static164.aBoolean192) {
					arg1 = Static284.method388(((PcmSound) this.aClass3_Sub16_5).aByteArray47, arg0, this.anInt346, arg1, this.anInt355, this.anInt352, this.anInt347, this.anInt354, local7, arg2, this, this.anInt342, arg4);
				} else {
					arg1 = Static284.method389(((PcmSound) this.aClass3_Sub16_5).aByteArray47, arg0, this.anInt346, arg1, this.anInt348, this.anInt344, local7, arg2, this, this.anInt342, arg4);
				}
				this.anInt351 -= arg1;
				if (this.anInt351 != 0) {
					return arg1;
				}
				if (!this.method383()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt342 == 256 && (this.anInt346 & 0xFF) == 0) {
				if (Static164.aBoolean192) {
					return Static284.method387(((PcmSound) this.aClass3_Sub16_5).aByteArray47, arg0, this.anInt346, arg1, this.anInt355, this.anInt352, arg3, arg2, this);
				}
				return Static284.method391(((PcmSound) this.aClass3_Sub16_5).aByteArray47, arg0, this.anInt346, arg1, this.anInt348, arg3, arg2, this);
			}
			if (Static164.aBoolean192) {
				return Static284.method400(((PcmSound) this.aClass3_Sub16_5).aByteArray47, arg0, this.anInt346, arg1, this.anInt355, this.anInt352, arg3, arg2, this, this.anInt342, arg4);
			}
			return Static284.method422(((PcmSound) this.aClass3_Sub16_5).aByteArray47, arg0, this.anInt346, arg1, this.anInt348, arg3, arg2, this, this.anInt342, arg4);
		}
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(I)V")
	public final synchronized void method386(@OriginalArg(0) int arg0) {
		this.method408(arg0 << 6, this.method418());
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "()I")
	@Override
	public final int method4407() {
		@Pc(6) int local6 = this.anInt348 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt350 == 0) {
			local6 -= local6 * this.anInt346 / (((PcmSound) this.aClass3_Sub16_5).aByteArray47.length << 8);
		} else if (this.anInt350 >= 0) {
			local6 -= local6 * this.anInt345 / ((PcmSound) this.aClass3_Sub16_5).aByteArray47.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "()I")
	@Override
	public final int method4404() {
		return this.anInt343 == 0 && this.anInt351 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "()I")
	public final synchronized int method392() {
		return this.anInt343 == Integer.MIN_VALUE ? 0 : this.anInt343;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
	@Override
	public final synchronized void method4410(@OriginalArg(0) int arg0) {
		if (this.anInt351 > 0) {
			if (arg0 >= this.anInt351) {
				if (this.anInt343 == Integer.MIN_VALUE) {
					this.anInt343 = 0;
					this.anInt348 = this.anInt355 = this.anInt352 = 0;
					this.method4658();
					arg0 = this.anInt351;
				}
				this.anInt351 = 0;
				this.method416();
			} else {
				this.anInt348 += this.anInt344 * arg0;
				this.anInt355 += this.anInt347 * arg0;
				this.anInt352 += this.anInt354 * arg0;
				this.anInt351 -= arg0;
			}
		}
		@Pc(71) PcmSound local71 = (PcmSound) this.aClass3_Sub16_5;
		@Pc(76) int local76 = this.anInt345 << 8;
		@Pc(81) int local81 = this.anInt353 << 8;
		@Pc(87) int local87 = local71.aByteArray47.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt350 = 0;
		}
		if (this.anInt346 < 0) {
			if (this.anInt342 <= 0) {
				this.method406();
				this.method4658();
				return;
			}
			this.anInt346 = 0;
		}
		if (this.anInt346 >= local87) {
			if (this.anInt342 >= 0) {
				this.method406();
				this.method4658();
				return;
			}
			this.anInt346 = local87 - 1;
		}
		this.anInt346 += this.anInt342 * arg0;
		if (this.anInt350 >= 0) {
			if (this.anInt350 > 0) {
				if (this.aBoolean14) {
					label121: {
						if (this.anInt342 < 0) {
							if (this.anInt346 >= local76) {
								return;
							}
							this.anInt346 = local76 + local76 - this.anInt346 - 1;
							this.anInt342 = -this.anInt342;
							if (--this.anInt350 == 0) {
								break label121;
							}
						}
						do {
							if (this.anInt346 < local81) {
								return;
							}
							this.anInt346 = local81 + local81 - this.anInt346 - 1;
							this.anInt342 = -this.anInt342;
							if (--this.anInt350 == 0) {
								break;
							}
							if (this.anInt346 >= local76) {
								return;
							}
							this.anInt346 = local76 + local76 - this.anInt346 - 1;
							this.anInt342 = -this.anInt342;
						} while (--this.anInt350 != 0);
					}
				} else {
					label153: {
						@Pc(362) int local362;
						if (this.anInt342 < 0) {
							if (this.anInt346 >= local76) {
								return;
							}
							local362 = (local81 - this.anInt346 - 1) / local91;
							if (local362 >= this.anInt350) {
								this.anInt346 += local91 * this.anInt350;
								this.anInt350 = 0;
								break label153;
							}
							this.anInt346 += local91 * local362;
							this.anInt350 -= local362;
						} else if (this.anInt346 >= local81) {
							local362 = (this.anInt346 - local76) / local91;
							if (local362 >= this.anInt350) {
								this.anInt346 -= local91 * this.anInt350;
								this.anInt350 = 0;
								break label153;
							}
							this.anInt346 -= local91 * local362;
							this.anInt350 -= local362;
						} else {
							return;
						}
						return;
					}
				}
			}
			if (this.anInt342 < 0) {
				if (this.anInt346 < 0) {
					this.anInt346 = -1;
					this.method406();
					this.method4658();
				}
			} else if (this.anInt346 >= local87) {
				this.anInt346 = local87;
				this.method406();
				this.method4658();
			}
		} else if (this.aBoolean14) {
			if (this.anInt342 < 0) {
				if (this.anInt346 >= local76) {
					return;
				}
				this.anInt346 = local76 + local76 - this.anInt346 - 1;
				this.anInt342 = -this.anInt342;
			}
			while (this.anInt346 >= local81) {
				this.anInt346 = local81 + local81 - this.anInt346 - 1;
				this.anInt342 = -this.anInt342;
				if (this.anInt346 >= local76) {
					return;
				}
				this.anInt346 = local76 + local76 - this.anInt346 - 1;
				this.anInt342 = -this.anInt342;
			}
		} else if (this.anInt342 < 0) {
			if (this.anInt346 >= local76) {
				return;
			}
			this.anInt346 = local81 - (local81 - 1 - this.anInt346) % local91 - 1;
		} else if (this.anInt346 >= local81) {
			this.anInt346 = local76 + (this.anInt346 - local76) % local91;
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "(I)V")
	public final synchronized void method396(@OriginalArg(0) int arg0) {
		this.anInt350 = arg0;
	}

	@OriginalMember(owner = "client!b", name = "g", descriptor = "(I)V")
	private synchronized void method397() {
		this.method408(0, this.method418());
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(II)V")
	public final synchronized void method398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method417(arg0, arg1, this.method418());
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "()Lclient!qb;")
	@Override
	public final PcmStream method4406() {
		return null;
	}

	@OriginalMember(owner = "client!b", name = "h", descriptor = "(I)V")
	public final synchronized void method401(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((PcmSound) this.aClass3_Sub16_5).aByteArray47.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt346 = arg0;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "([IIIII)I")
	private int method403(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt351 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt351;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt351 += arg1;
				if (this.anInt342 == -256 && (this.anInt346 & 0xFF) == 0) {
					if (Static164.aBoolean192) {
						arg1 = Static284.method402(((PcmSound) this.aClass3_Sub16_5).aByteArray47, arg0, this.anInt346, arg1, this.anInt355, this.anInt352, this.anInt347, this.anInt354, local7, arg2, this);
					} else {
						arg1 = Static284.method394(((PcmSound) this.aClass3_Sub16_5).aByteArray47, arg0, this.anInt346, arg1, this.anInt348, this.anInt344, local7, arg2, this);
					}
				} else if (Static164.aBoolean192) {
					arg1 = Static284.method407(((PcmSound) this.aClass3_Sub16_5).aByteArray47, arg0, this.anInt346, arg1, this.anInt355, this.anInt352, this.anInt347, this.anInt354, local7, arg2, this, this.anInt342, arg4);
				} else {
					arg1 = Static284.method415(((PcmSound) this.aClass3_Sub16_5).aByteArray47, arg0, this.anInt346, arg1, this.anInt348, this.anInt344, local7, arg2, this, this.anInt342, arg4);
				}
				this.anInt351 -= arg1;
				if (this.anInt351 != 0) {
					return arg1;
				}
				if (!this.method383()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt342 == -256 && (this.anInt346 & 0xFF) == 0) {
				if (Static164.aBoolean192) {
					return Static284.method414(((PcmSound) this.aClass3_Sub16_5).aByteArray47, arg0, this.anInt346, arg1, this.anInt355, this.anInt352, arg3, arg2, this);
				}
				return Static284.method413(((PcmSound) this.aClass3_Sub16_5).aByteArray47, arg0, this.anInt346, arg1, this.anInt348, arg3, arg2, this);
			}
			if (Static164.aBoolean192) {
				return Static284.method420(((PcmSound) this.aClass3_Sub16_5).aByteArray47, arg0, this.anInt346, arg1, this.anInt355, this.anInt352, arg3, arg2, this, this.anInt342, arg4);
			}
			return Static284.method390(((PcmSound) this.aClass3_Sub16_5).aByteArray47, arg0, this.anInt346, arg1, this.anInt348, arg3, arg2, this, this.anInt342, arg4);
		}
	}

	@OriginalMember(owner = "client!b", name = "g", descriptor = "()I")
	public final synchronized int method405() {
		return this.anInt342 < 0 ? -this.anInt342 : this.anInt342;
	}

	@OriginalMember(owner = "client!b", name = "h", descriptor = "()V")
	private void method406() {
		if (this.anInt351 == 0) {
			return;
		}
		if (this.anInt343 == Integer.MIN_VALUE) {
			this.anInt343 = 0;
		}
		this.anInt351 = 0;
		this.method416();
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(II)V")
	private synchronized void method408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt343 = arg0;
		this.anInt349 = arg1;
		this.anInt351 = 0;
		this.method416();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V")
	public final synchronized void method409() {
		this.anInt342 = (this.anInt342 ^ this.anInt342 >> 31) + (this.anInt342 >>> 31);
		this.anInt342 = -this.anInt342;
	}

	@OriginalMember(owner = "client!b", name = "i", descriptor = "(I)V")
	public final synchronized void method410(@OriginalArg(0) int arg0) {
		if (this.anInt342 < 0) {
			this.anInt342 = -arg0;
		} else {
			this.anInt342 = arg0;
		}
	}

	@OriginalMember(owner = "client!b", name = "i", descriptor = "()Z")
	public final boolean method411() {
		return this.anInt346 < 0 || this.anInt346 >= ((PcmSound) this.aClass3_Sub16_5).aByteArray47.length << 8;
	}

	@OriginalMember(owner = "client!b", name = "j", descriptor = "()Z")
	public final boolean method412() {
		return this.anInt351 != 0;
	}

	@OriginalMember(owner = "client!b", name = "k", descriptor = "()V")
	private void method416() {
		this.anInt348 = this.anInt343;
		this.anInt355 = Static284.method419(this.anInt343, this.anInt349);
		this.anInt352 = Static284.method421(this.anInt343, this.anInt349);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III)V")
	public final synchronized void method417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method408(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static284.method419(arg1, arg2);
		@Pc(14) int local14 = Static284.method421(arg1, arg2);
		if (this.anInt355 == local10 && this.anInt352 == local14) {
			this.anInt351 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt348;
		if (this.anInt348 - arg1 > local31) {
			local31 = this.anInt348 - arg1;
		}
		if (local10 - this.anInt355 > local31) {
			local31 = local10 - this.anInt355;
		}
		if (this.anInt355 - local10 > local31) {
			local31 = this.anInt355 - local10;
		}
		if (local14 - this.anInt352 > local31) {
			local31 = local14 - this.anInt352;
		}
		if (this.anInt352 - local14 > local31) {
			local31 = this.anInt352 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt351 = arg0;
		this.anInt343 = arg1;
		this.anInt349 = arg2;
		this.anInt344 = (arg1 - this.anInt348) / arg0;
		this.anInt347 = (local10 - this.anInt355) / arg0;
		this.anInt354 = (local14 - this.anInt352) / arg0;
	}

	@OriginalMember(owner = "client!b", name = "l", descriptor = "()I")
	public final synchronized int method418() {
		return this.anInt349 < 0 ? -1 : this.anInt349;
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "()Lclient!qb;")
	@Override
	public final PcmStream method4409() {
		return null;
	}
}
