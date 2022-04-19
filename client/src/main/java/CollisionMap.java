import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class CollisionMap {

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
	private final int anInt3904;

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
	private final int anInt3907;

	@OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
	private final int anInt3912;

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
	private final int anInt3899;

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "[[I")
	public final int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(II)V")
	public CollisionMap(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3904 = arg1;
		this.anInt3907 = 0;
		this.anInt3912 = 0;
		this.anInt3899 = arg0;
		this.anIntArrayArray30 = new int[this.anInt3899][this.anInt3904];
		this.method3050();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZIIII)V")
	public final void method3039(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg4 - this.anInt3912;
		@Pc(23) int local23 = arg2 - this.anInt3907;
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method3055(local23, local4, 128);
				this.method3055(local23, local4 - 1, 8);
			}
			if (arg0 == 1) {
				this.method3055(local23, local4, 2);
				this.method3055(local23 + 1, local4, 32);
			}
			if (arg0 == 2) {
				this.method3055(local23, local4, 8);
				this.method3055(local23, local4 + 1, 128);
			}
			if (arg0 == 3) {
				this.method3055(local23, local4, 32);
				this.method3055(local23 - 1, local4, 2);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method3055(local23, local4, 1);
				this.method3055(local23 + 1, local4 + -1, 16);
			}
			if (arg0 == 1) {
				this.method3055(local23, local4, 4);
				this.method3055(local23 + 1, local4 + 1, 64);
			}
			if (arg0 == 2) {
				this.method3055(local23, local4, 16);
				this.method3055(local23 - 1, local4 - -1, 1);
			}
			if (arg0 == 3) {
				this.method3055(local23, local4, 64);
				this.method3055(local23 - 1, local4 + -1, 4);
			}
		}
		if (arg3 == 2) {
			if (arg0 == 0) {
				this.method3055(local23, local4, 130);
				this.method3055(local23, local4 - 1, 8);
				this.method3055(local23 + 1, local4, 32);
			}
			if (arg0 == 1) {
				this.method3055(local23, local4, 10);
				this.method3055(local23 + 1, local4, 32);
				this.method3055(local23, local4 + 1, 128);
			}
			if (arg0 == 2) {
				this.method3055(local23, local4, 40);
				this.method3055(local23, local4 + 1, 128);
				this.method3055(local23 - 1, local4, 2);
			}
			if (arg0 == 3) {
				this.method3055(local23, local4, 160);
				this.method3055(local23 - 1, local4, 2);
				this.method3055(local23, local4 - 1, 8);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method3055(local23, local4, 65536);
				this.method3055(local23, local4 - 1, 4096);
			}
			if (arg0 == 1) {
				this.method3055(local23, local4, 1024);
				this.method3055(local23 + 1, local4, 16384);
			}
			if (arg0 == 2) {
				this.method3055(local23, local4, 4096);
				this.method3055(local23, local4 + 1, 65536);
			}
			if (arg0 == 3) {
				this.method3055(local23, local4, 16384);
				this.method3055(local23 - 1, local4, 1024);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method3055(local23, local4, 512);
				this.method3055(local23 + 1, local4 + -1, 8192);
			}
			if (arg0 == 1) {
				this.method3055(local23, local4, 2048);
				this.method3055(local23 + 1, local4 - -1, 32768);
			}
			if (arg0 == 2) {
				this.method3055(local23, local4, 8192);
				this.method3055(local23 - 1, local4 + 1, 512);
			}
			if (arg0 == 3) {
				this.method3055(local23, local4, 32768);
				this.method3055(local23 - 1, local4 + -1, 2048);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method3055(local23, local4, 66560);
			this.method3055(local23, local4 - 1, 4096);
			this.method3055(local23 + 1, local4, 16384);
		}
		if (arg0 == 1) {
			this.method3055(local23, local4, 5120);
			this.method3055(local23 + 1, local4, 16384);
			this.method3055(local23, local4 + 1, 65536);
		}
		if (arg0 == 2) {
			this.method3055(local23, local4, 20480);
			this.method3055(local23, local4 + 1, 65536);
			this.method3055(local23 - 1, local4, 1024);
		}
		if (arg0 == 3) {
			this.method3055(local23, local4, 81920);
			this.method3055(local23 - 1, local4, 1024);
			this.method3055(local23, local4 - 1, 4096);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIZII)V")
	public final void method3040(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg4 - this.anInt3912;
		@Pc(13) int local13 = arg3 - this.anInt3907;
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method3044(128, local4, local13);
				this.method3044(8, local4 - 1, local13);
			}
			if (arg0 == 1) {
				this.method3044(2, local4, local13);
				this.method3044(32, local4, local13 + 1);
			}
			if (arg0 == 2) {
				this.method3044(8, local4, local13);
				this.method3044(128, local4 + 1, local13);
			}
			if (arg0 == 3) {
				this.method3044(32, local4, local13);
				this.method3044(2, local4, local13 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method3044(1, local4, local13);
				this.method3044(16, local4 - 1, local13 + 1);
			}
			if (arg0 == 1) {
				this.method3044(4, local4, local13);
				this.method3044(64, local4 + 1, local13 + 1);
			}
			if (arg0 == 2) {
				this.method3044(16, local4, local13);
				this.method3044(1, local4 + 1, local13 + -1);
			}
			if (arg0 == 3) {
				this.method3044(64, local4, local13);
				this.method3044(4, local4 - 1, local13 + -1);
			}
		}
		if (arg1 == 2) {
			if (arg0 == 0) {
				this.method3044(130, local4, local13);
				this.method3044(8, local4 - 1, local13);
				this.method3044(32, local4, local13 + 1);
			}
			if (arg0 == 1) {
				this.method3044(10, local4, local13);
				this.method3044(32, local4, local13 + 1);
				this.method3044(128, local4 + 1, local13);
			}
			if (arg0 == 2) {
				this.method3044(40, local4, local13);
				this.method3044(128, local4 + 1, local13);
				this.method3044(2, local4, local13 - 1);
			}
			if (arg0 == 3) {
				this.method3044(160, local4, local13);
				this.method3044(2, local4, local13 - 1);
				this.method3044(8, local4 - 1, local13);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method3044(65536, local4, local13);
				this.method3044(4096, local4 - 1, local13);
			}
			if (arg0 == 1) {
				this.method3044(1024, local4, local13);
				this.method3044(16384, local4, local13 + 1);
			}
			if (arg0 == 2) {
				this.method3044(4096, local4, local13);
				this.method3044(65536, local4 + 1, local13);
			}
			if (arg0 == 3) {
				this.method3044(16384, local4, local13);
				this.method3044(1024, local4, local13 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method3044(512, local4, local13);
				this.method3044(8192, local4 - 1, local13 + 1);
			}
			if (arg0 == 1) {
				this.method3044(2048, local4, local13);
				this.method3044(32768, local4 + 1, local13 + 1);
			}
			if (arg0 == 2) {
				this.method3044(8192, local4, local13);
				this.method3044(512, local4 + 1, local13 + -1);
			}
			if (arg0 == 3) {
				this.method3044(32768, local4, local13);
				this.method3044(2048, local4 - 1, local13 - 1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method3044(66560, local4, local13);
			this.method3044(4096, local4 - 1, local13);
			this.method3044(16384, local4, local13 + 1);
		}
		if (arg0 == 1) {
			this.method3044(5120, local4, local13);
			this.method3044(16384, local4, local13 + 1);
			this.method3044(65536, local4 + 1, local13);
		}
		if (arg0 == 2) {
			this.method3044(20480, local4, local13);
			this.method3044(65536, local4 + 1, local13);
			this.method3044(1024, local4, local13 - 1);
		}
		if (arg0 == 3) {
			this.method3044(81920, local4, local13);
			this.method3044(1024, local4, local13 - 1);
			this.method3044(4096, local4 - 1, local13);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIIIB)Z")
	private boolean method3041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 + arg2 > arg7 && arg2 < arg0 + arg7) {
			return arg3 + arg5 > arg4 && arg6 + arg4 > arg5;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIZIIIII)Z")
	public final boolean method3042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg1 == arg3 && arg2 == arg0) {
				return true;
			}
		} else if (arg1 <= arg3 && arg1 + arg5 - 1 >= arg3 && arg0 <= arg0 && arg0 <= arg5 + arg0 - 1) {
			return true;
		}
		@Pc(49) int local49 = arg2 - this.anInt3907;
		@Pc(54) int local54 = arg3 - this.anInt3912;
		@Pc(59) int local59 = arg0 - this.anInt3907;
		@Pc(64) int local64 = arg1 - this.anInt3912;
		if (arg5 == 1) {
			if (arg4 == 0) {
				if (arg6 == 0) {
					if (local64 == local54 - 1 && local49 == local59) {
						return true;
					}
					if (local64 == local54 && local59 + 1 == local49 && (this.anIntArrayArray30[local64][local49] & 0x12C0120) == 0) {
						return true;
					}
					if (local54 == local64 && local59 - 1 == local49 && (this.anIntArrayArray30[local64][local49] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local54 == local64 && local49 == local59 + 1) {
						return true;
					}
					if (local54 - 1 == local64 && local59 == local49 && (this.anIntArrayArray30[local64][local49] & 0x12C0108) == 0) {
						return true;
					}
					if (local64 == local54 + 1 && local49 == local59 && (this.anIntArrayArray30[local64][local49] & 0x12C0180) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local54 + 1 == local64 && local49 == local59) {
						return true;
					}
					if (local54 == local64 && local49 == local59 + 1 && (this.anIntArrayArray30[local64][local49] & 0x12C0120) == 0) {
						return true;
					}
					if (local54 == local64 && local59 - 1 == local49 && (this.anIntArrayArray30[local64][local49] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local64 == local54 && local59 - 1 == local49) {
						return true;
					}
					if (local54 - 1 == local64 && local59 == local49 && (this.anIntArrayArray30[local64][local49] & 0x12C0108) == 0) {
						return true;
					}
					if (local54 + 1 == local64 && local49 == local59 && (this.anIntArrayArray30[local64][local49] & 0x12C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg6 == 0) {
					if (local64 == local54 - 1 && local59 == local49) {
						return true;
					}
					if (local64 == local54 && local49 == local59 + 1) {
						return true;
					}
					if (local64 == local54 + 1 && local49 == local59 && (this.anIntArrayArray30[local64][local49] & 0x12C0180) == 0) {
						return true;
					}
					if (local54 == local64 && local49 == local59 - 1 && (this.anIntArrayArray30[local64][local49] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local64 == local54 - 1 && local59 == local49 && (this.anIntArrayArray30[local64][local49] & 0x12C0108) == 0) {
						return true;
					}
					if (local54 == local64 && local59 + 1 == local49) {
						return true;
					}
					if (local64 == local54 + 1 && local59 == local49) {
						return true;
					}
					if (local54 == local64 && local49 == local59 - 1 && (this.anIntArrayArray30[local64][local49] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local64 == local54 - 1 && local59 == local49 && (this.anIntArrayArray30[local64][local49] & 0x12C0108) == 0) {
						return true;
					}
					if (local54 == local64 && local49 == local59 + 1 && (this.anIntArrayArray30[local64][local49] & 0x12C0120) == 0) {
						return true;
					}
					if (local54 + 1 == local64 && local59 == local49) {
						return true;
					}
					if (local64 == local54 && local59 - 1 == local49) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local64 == local54 - 1 && local59 == local49) {
						return true;
					}
					if (local64 == local54 && local59 + 1 == local49 && (this.anIntArrayArray30[local64][local49] & 0x12C0120) == 0) {
						return true;
					}
					if (local64 == local54 + 1 && local59 == local49 && (this.anIntArrayArray30[local64][local49] & 0x12C0180) == 0) {
						return true;
					}
					if (local64 == local54 && local49 == local59 - 1) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local64 == local54 && local59 + 1 == local49 && (this.anIntArrayArray30[local64][local49] & 0x20) == 0) {
					return true;
				}
				if (local64 == local54 && local49 == local59 - 1 && (this.anIntArrayArray30[local64][local49] & 0x2) == 0) {
					return true;
				}
				if (local64 == local54 - 1 && local49 == local59 && (this.anIntArrayArray30[local64][local49] & 0x8) == 0) {
					return true;
				}
				if (local54 + 1 == local64 && local59 == local49 && (this.anIntArrayArray30[local64][local49] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(785) int local785 = arg5 + local64 - 1;
			@Pc(792) int local792 = local49 + arg5 - 1;
			if (arg4 == 0) {
				if (arg6 == 0) {
					if (local64 == local54 - arg5 && local49 <= local59 && local59 <= local792) {
						return true;
					}
					if (local64 <= local54 && local785 >= local54 && local59 + 1 == local49 && (this.anIntArrayArray30[local54][local49] & 0x12C0120) == 0) {
						return true;
					}
					if (local64 <= local54 && local785 >= local54 && local59 - arg5 == local49 && (this.anIntArrayArray30[local54][local792] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local54 >= local64 && local54 <= local785 && local59 + 1 == local49) {
						return true;
					}
					if (local64 == local54 - arg5 && local49 <= local59 && local792 >= local59 && (this.anIntArrayArray30[local785][local59] & 0x12C0108) == 0) {
						return true;
					}
					if (local64 == local54 + 1 && local49 <= local59 && local792 >= local59 && (this.anIntArrayArray30[local64][local59] & 0x12C0180) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local54 + 1 == local64 && local49 <= local59 && local59 <= local792) {
						return true;
					}
					if (local54 >= local64 && local785 >= local54 && local49 == local59 + 1 && (this.anIntArrayArray30[local54][local49] & 0x12C0120) == 0) {
						return true;
					}
					if (local54 >= local64 && local785 >= local54 && local59 - arg5 == local49 && (this.anIntArrayArray30[local54][local792] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local64 <= local54 && local785 >= local54 && local59 - arg5 == local49) {
						return true;
					}
					if (local64 == local54 - arg5 && local59 >= local49 && local792 >= local59 && (this.anIntArrayArray30[local785][local59] & 0x12C0108) == 0) {
						return true;
					}
					if (local54 + 1 == local64 && local49 <= local59 && local59 <= local792 && (this.anIntArrayArray30[local64][local59] & 0x12C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg6 == 0) {
					if (local64 == local54 - arg5 && local59 >= local49 && local59 <= local792) {
						return true;
					}
					if (local64 <= local54 && local785 >= local54 && local49 == local59 + 1) {
						return true;
					}
					if (local54 + 1 == local64 && local59 >= local49 && local59 <= local792 && (this.anIntArrayArray30[local64][local59] & 0x12C0180) == 0) {
						return true;
					}
					if (local54 >= local64 && local785 >= local54 && local59 - arg5 == local49 && (this.anIntArrayArray30[local54][local792] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local64 == local54 - arg5 && local59 >= local49 && local59 <= local792 && (this.anIntArrayArray30[local785][local59] & 0x12C0108) == 0) {
						return true;
					}
					if (local64 <= local54 && local785 >= local54 && local49 == local59 + 1) {
						return true;
					}
					if (local54 + 1 == local64 && local59 >= local49 && local59 <= local792) {
						return true;
					}
					if (local54 >= local64 && local54 <= local785 && local49 == local59 - arg5 && (this.anIntArrayArray30[local54][local792] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local54 - arg5 == local64 && local49 <= local59 && local792 >= local59 && (this.anIntArrayArray30[local785][local59] & 0x12C0108) == 0) {
						return true;
					}
					if (local64 <= local54 && local54 <= local785 && local49 == local59 + 1 && (this.anIntArrayArray30[local54][local49] & 0x12C0120) == 0) {
						return true;
					}
					if (local64 == local54 + 1 && local49 <= local59 && local59 <= local792) {
						return true;
					}
					if (local64 <= local54 && local785 >= local54 && local59 - arg5 == local49) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local54 - arg5 == local64 && local59 >= local49 && local59 <= local792) {
						return true;
					}
					if (local64 <= local54 && local54 <= local785 && local59 + 1 == local49 && (this.anIntArrayArray30[local54][local49] & 0x12C0120) == 0) {
						return true;
					}
					if (local64 == local54 + 1 && local59 >= local49 && local59 <= local792 && (this.anIntArrayArray30[local64][local59] & 0x12C0180) == 0) {
						return true;
					}
					if (local64 <= local54 && local785 >= local54 && local59 - arg5 == local49) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local64 <= local54 && local54 <= local785 && local49 == local59 + 1 && (this.anIntArrayArray30[local54][local49] & 0x12C0120) == 0) {
					return true;
				}
				if (local54 >= local64 && local54 <= local785 && local49 == local59 - arg5 && (this.anIntArrayArray30[local54][local792] & 0x12C0102) == 0) {
					return true;
				}
				if (local54 - arg5 == local64 && local59 >= local49 && local59 <= local792 && (this.anIntArrayArray30[local785][local59] & 0x12C0108) == 0) {
					return true;
				}
				if (local64 == local54 + 1 && local59 >= local49 && local792 >= local59 && (this.anIntArrayArray30[local64][local59] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZBIII)V")
	public final void method3043(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg2 - this.anInt3907;
		@Pc(11) int local11 = arg0 - this.anInt3912;
		@Pc(17) int local17 = 256;
		if (arg1) {
			local17 = 131328;
		}
		for (@Pc(25) int local25 = local11; local25 < local11 + arg3; local25++) {
			if (local25 >= 0 && local25 < this.anInt3899) {
				for (@Pc(47) int local47 = local6; local47 < arg4 + local6; local47++) {
					if (local47 >= 0 && this.anInt3904 > local47) {
						this.method3044(local17, local25, local47);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBII)V")
	private void method3044(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray30[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIII)Z")
	public final boolean method3046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == 1) {
			if (arg2 == arg6 && arg0 == arg3) {
				return true;
			}
		} else if (arg6 <= arg2 && arg4 + arg6 - 1 >= arg2 && arg0 <= arg0 && arg0 + arg4 - 1 >= arg0) {
			return true;
		}
		@Pc(62) int local62 = arg6 - this.anInt3912;
		@Pc(67) int local67 = arg0 - this.anInt3907;
		@Pc(72) int local72 = arg2 - this.anInt3912;
		@Pc(77) int local77 = arg3 - this.anInt3907;
		if (arg4 == 1) {
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local62 == local72 + 1 && local67 == local77 && (this.anIntArrayArray30[local62][local77] & 0x80) == 0) {
						return true;
					}
					if (local72 == local62 && local77 == local67 - 1 && (this.anIntArrayArray30[local62][local77] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local62 == local72 - 1 && local67 == local77 && (this.anIntArrayArray30[local62][local77] & 0x8) == 0) {
						return true;
					}
					if (local72 == local62 && local77 == local67 - 1 && (this.anIntArrayArray30[local62][local77] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local62 == local72 - 1 && local77 == local67 && (this.anIntArrayArray30[local62][local77] & 0x8) == 0) {
						return true;
					}
					if (local72 == local62 && local67 + 1 == local77 && (this.anIntArrayArray30[local62][local77] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local62 == local72 + 1 && local77 == local67 && (this.anIntArrayArray30[local62][local77] & 0x80) == 0) {
						return true;
					}
					if (local72 == local62 && local77 == local67 + 1 && (this.anIntArrayArray30[local62][local77] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local62 == local72 && local67 + 1 == local77 && (this.anIntArrayArray30[local62][local77] & 0x20) == 0) {
					return true;
				}
				if (local62 == local72 && local67 - 1 == local77 && (this.anIntArrayArray30[local62][local77] & 0x2) == 0) {
					return true;
				}
				if (local72 - 1 == local62 && local77 == local67 && (this.anIntArrayArray30[local62][local77] & 0x8) == 0) {
					return true;
				}
				if (local62 == local72 + 1 && local67 == local77 && (this.anIntArrayArray30[local62][local77] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(414) int local414 = local62 + arg4 - 1;
			@Pc(420) int local420 = local77 + arg4 - 1;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local72 + 1 == local62 && local77 <= local67 && local67 <= local420 && (this.anIntArrayArray30[local62][local67] & 0x80) == 0) {
						return true;
					}
					if (local72 >= local62 && local414 >= local72 && local67 - arg4 == local77 && (this.anIntArrayArray30[local72][local420] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local72 - arg4 == local62 && local67 >= local77 && local420 >= local67 && (this.anIntArrayArray30[local414][local67] & 0x8) == 0) {
						return true;
					}
					if (local72 >= local62 && local414 >= local72 && local67 - arg4 == local77 && (this.anIntArrayArray30[local72][local420] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local62 == local72 - arg4 && local67 >= local77 && local67 <= local420 && (this.anIntArrayArray30[local414][local67] & 0x8) == 0) {
						return true;
					}
					if (local62 <= local72 && local72 <= local414 && local77 == local67 + 1 && (this.anIntArrayArray30[local72][local77] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local72 + 1 == local62 && local77 <= local67 && local67 <= local420 && (this.anIntArrayArray30[local62][local67] & 0x80) == 0) {
						return true;
					}
					if (local72 >= local62 && local72 <= local414 && local77 == local67 + 1 && (this.anIntArrayArray30[local72][local77] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local62 <= local72 && local414 >= local72 && local77 == local67 + 1 && (this.anIntArrayArray30[local72][local77] & 0x20) == 0) {
					return true;
				}
				if (local72 >= local62 && local414 >= local72 && local77 == local67 - arg4 && (this.anIntArrayArray30[local72][local420] & 0x2) == 0) {
					return true;
				}
				if (local62 == local72 - arg4 && local77 <= local67 && local420 >= local67 && (this.anIntArrayArray30[local414][local67] & 0x8) == 0) {
					return true;
				}
				if (local62 == local72 + 1 && local67 >= local77 && local67 <= local420 && (this.anIntArrayArray30[local62][local67] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIZIIIII)Z")
	private boolean method3048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg5 + arg7;
		@Pc(13) int local13 = arg6 + arg8;
		@Pc(22) int local22 = arg2 + arg0;
		@Pc(27) int local27 = arg1 + arg4;
		@Pc(45) int local45;
		@Pc(52) int local52;
		if (arg5 >= arg0 && arg5 < local22) {
			if (local13 == arg1 && (arg3 & 0x4) == 0) {
				local45 = arg5;
				local52 = local22 >= local9 ? local9 : local22;
				while (local52 > local45) {
					if ((this.anIntArrayArray30[local45 - this.anInt3912][local13 - this.anInt3907 - 1] & 0x2) == 0) {
						return true;
					}
					local45++;
				}
			} else if (local27 == arg6 && (arg3 & 0x1) == 0) {
				local45 = arg5;
				local52 = local9 > local22 ? local22 : local9;
				while (local52 > local45) {
					if ((this.anIntArrayArray30[local45 - this.anInt3912][arg6 - this.anInt3907] & 0x20) == 0) {
						return true;
					}
					local45++;
				}
			}
		} else if (local9 > arg0 && local9 <= local22) {
			if (arg1 == local13 && (arg3 & 0x4) == 0) {
				for (local45 = arg0; local45 < local9; local45++) {
					if ((this.anIntArrayArray30[local45 - this.anInt3912][local13 - this.anInt3907 - 1] & 0x2) == 0) {
						return true;
					}
				}
			} else if (arg6 == local27 && (arg3 & 0x1) == 0) {
				for (local45 = arg0; local45 < local9; local45++) {
					if ((this.anIntArrayArray30[local45 - this.anInt3912][arg6 - this.anInt3907] & 0x20) == 0) {
						return true;
					}
				}
			}
		} else if (arg6 >= arg1 && local27 > arg6) {
			if (local9 == arg0 && (arg3 & 0x8) == 0) {
				local45 = arg6;
				local52 = local27 >= local13 ? local13 : local27;
				while (local45 < local52) {
					if ((this.anIntArrayArray30[local9 - this.anInt3912 - 1][local45 - this.anInt3907] & 0x8) == 0) {
						return true;
					}
					local45++;
				}
			} else if (arg5 == local22 && (arg3 & 0x2) == 0) {
				local45 = arg6;
				local52 = local27 < local13 ? local27 : local13;
				while (local45 < local52) {
					if ((this.anIntArrayArray30[arg5 - this.anInt3912][local45 - this.anInt3907] & 0x80) == 0) {
						return true;
					}
					local45++;
				}
			}
		} else if (arg1 < local13 && local27 >= local13) {
			if (local9 == arg0 && (arg3 & 0x8) == 0) {
				for (local45 = arg1; local45 < local13; local45++) {
					if ((this.anIntArrayArray30[local9 - this.anInt3912 - 1][local45 - this.anInt3907] & 0x8) == 0) {
						return true;
					}
				}
			} else if (local22 == arg5 && (arg3 & 0x2) == 0) {
				for (local45 = arg1; local45 < local13; local45++) {
					if ((this.anIntArrayArray30[arg5 - this.anInt3912][local45 - this.anInt3907] & 0x80) == 0) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
	public final void method3050() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3899; local3++) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt3904; local13++) {
				if (local3 == 0 || local13 == 0 || local3 >= this.anInt3899 - 5 || this.anInt3904 - 5 <= local13) {
					this.anIntArrayArray30[local3][local13] = 16777215;
				} else {
					this.anIntArrayArray30[local3][local13] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
	public final void method3051(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 - this.anInt3907;
		@Pc(17) int local17 = arg1 - this.anInt3912;
		this.anIntArrayArray30[local17][local12] |= 0x200000;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZIIIIIIII)Z")
	public final boolean method3052(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 > 1) {
			return this.method3041(arg3, arg4, arg0, arg7, arg1, arg6, arg3, arg2) ? true : this.method3048(arg0, arg6, arg4, arg5, arg7, arg2, arg1, arg3, arg3);
		}
		@Pc(41) int local41 = arg4 + arg0 - 1;
		@Pc(47) int local47 = arg6 + arg7 - 1;
		if (arg0 <= arg2 && local41 >= arg2 && arg6 <= arg1 && arg1 <= local47) {
			return true;
		} else if (arg0 - 1 == arg2 && arg1 >= arg6 && arg1 <= local47 && (this.anIntArrayArray30[arg2 - this.anInt3912][arg1 - this.anInt3907] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		} else if (arg2 == local41 + 1 && arg6 <= arg1 && local47 >= arg1 && (this.anIntArrayArray30[arg2 - this.anInt3912][arg1 - this.anInt3907] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		} else if (arg1 == arg6 - 1 && arg0 <= arg2 && local41 >= arg2 && (this.anIntArrayArray30[arg2 - this.anInt3912][arg1 - this.anInt3907] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		} else {
			return arg1 == local47 + 1 && arg2 >= arg0 && local41 >= arg2 && (this.anIntArrayArray30[arg2 - this.anInt3912][arg1 - this.anInt3907] & 0x20) == 0 && (arg5 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBI)V")
	public final void method3053(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt3912;
		@Pc(9) int local9 = arg0 - this.anInt3907;
		this.anIntArrayArray30[local4][local9] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(IIIII)Z")
	public final boolean method3054(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 == arg2 && arg0 == arg1) {
			return true;
		}
		@Pc(22) int local22 = arg1 - this.anInt3907;
		@Pc(33) int local33 = arg2 - this.anInt3912;
		if (local33 < 0 || this.anInt3899 <= local33 || local22 < 0 || local22 >= this.anInt3904) {
			return false;
		}
		@Pc(61) int local61 = arg0 - this.anInt3907;
		@Pc(66) int local66 = arg3 - this.anInt3912;
		@Pc(77) int local77;
		if (local33 > local66) {
			local77 = local33 - local66;
		} else {
			local77 = local66 - local33;
		}
		@Pc(96) int local96;
		if (local22 <= local61) {
			local96 = local61 - local22;
		} else {
			local96 = local22 - local61;
		}
		@Pc(117) int local117;
		@Pc(111) int local111;
		if (local77 <= local96) {
			local111 = 32768;
			local117 = local77 * 65536 / local96;
			while (local61 != local22) {
				if (local22 > local61) {
					if ((this.anIntArrayArray30[local66][local61] & 0x12C0102) != 0) {
						return false;
					}
					local61++;
				} else if (local22 < local61) {
					if ((this.anIntArrayArray30[local66][local61] & 0x12C0120) != 0) {
						return false;
					}
					local61--;
				}
				local111 += local117;
				if (local111 >= 65536) {
					local111 -= 65536;
					if (local66 < local33) {
						if ((this.anIntArrayArray30[local66][local61] & 0x12C0108) != 0) {
							return false;
						}
						local66++;
					} else if (local66 > local33) {
						if ((this.anIntArrayArray30[local66][local61] & 0x12C0180) != 0) {
							return false;
						}
						local66--;
					}
				}
			}
		} else {
			local117 = local96 * 65536 / local77;
			local111 = 32768;
			while (local33 != local66) {
				if (local66 < local33) {
					if ((this.anIntArrayArray30[local66][local61] & 0x12C0108) != 0) {
						return false;
					}
					local66++;
				} else if (local33 < local66) {
					if ((this.anIntArrayArray30[local66][local61] & 0x12C0180) != 0) {
						return false;
					}
					local66--;
				}
				local111 += local117;
				if (local111 >= 65536) {
					local111 -= 65536;
					if (local61 < local22) {
						if ((this.anIntArrayArray30[local66][local61] & 0x12C0102) != 0) {
							return false;
						}
						local61++;
					} else if (local22 < local61) {
						if ((this.anIntArrayArray30[local66][local61] & 0x12C0120) != 0) {
							return false;
						}
						local61--;
					}
				}
			}
		}
		return (this.anIntArrayArray30[local33][local22] & 0x1240100) == 0;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BIII)V")
	private void method3055(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray30[arg1][arg0] &= ~arg2;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIZIII)V")
	public final void method3056(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg0 - this.anInt3912;
		@Pc(11) int local11 = arg5 - this.anInt3907;
		@Pc(13) int local13 = 256;
		if (arg2) {
			local13 = 131328;
		}
		@Pc(40) int local40;
		if (arg3 == 1 || arg3 == 3) {
			local40 = arg1;
			arg1 = arg4;
			arg4 = local40;
		}
		for (local40 = local6; local40 < local6 + arg1; local40++) {
			if (local40 >= 0 && local40 < this.anInt3899) {
				for (@Pc(61) int local61 = local11; local61 < arg4 + local11; local61++) {
					if (local61 >= 0 && this.anInt3904 > local61) {
						this.method3055(local61, local40, local13);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(III)V")
	public final void method3057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt3907;
		@Pc(17) int local17 = arg0 - this.anInt3912;
		this.anIntArrayArray30[local17][local4] |= 0x40000;
	}
}
