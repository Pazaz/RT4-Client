import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Loc extends Entity {

	@OriginalMember(owner = "client!dc", name = "U", descriptor = "Lclient!ga;")
	private ParticleSystem aClass47_Sub1_2;

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
	private int anInt1296 = 0;

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
	private int anInt1294 = 0;

	@OriginalMember(owner = "client!dc", name = "B", descriptor = "Z")
	private boolean aBoolean81 = true;

	@OriginalMember(owner = "client!dc", name = "Q", descriptor = "Lclient!ek;")
	private SoftwareIndexedSprite aClass36_Sub1_2 = null;

	@OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
	private final int anInt1311 = -32768;

	@OriginalMember(owner = "client!dc", name = "eb", descriptor = "I")
	private int anInt1319 = 0;

	@OriginalMember(owner = "client!dc", name = "gb", descriptor = "I")
	private int anInt1321 = -1;

	@OriginalMember(owner = "client!dc", name = "ib", descriptor = "I")
	private int anInt1322 = -1;

	@OriginalMember(owner = "client!dc", name = "H", descriptor = "I")
	private final int anInt1303;

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
	private final int anInt1295;

	@OriginalMember(owner = "client!dc", name = "N", descriptor = "I")
	private final int anInt1308;

	@OriginalMember(owner = "client!dc", name = "L", descriptor = "I")
	private final int anInt1307;

	@OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
	private final int anInt1299;

	@OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
	private final int anInt1300;

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "Lclient!tk;")
	private SeqType aClass144_2;

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
	private int anInt1297;

	@OriginalMember(owner = "client!dc", name = "I", descriptor = "I")
	private int anInt1304;

	@OriginalMember(owner = "client!dc", name = "bb", descriptor = "I")
	private int anInt1317;

	@OriginalMember(owner = "client!dc", name = "fb", descriptor = "I")
	private int anInt1320;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(IIIIIIIZLclient!th;)V")
	public Loc(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Entity arg8) {
		this.anInt1303 = arg3;
		this.anInt1295 = arg2;
		this.anInt1308 = arg4;
		this.anInt1307 = arg1;
		this.anInt1299 = arg0;
		this.anInt1300 = arg5;
		@Pc(67) LocType local67;
		if (GlRenderer.enabled && arg8 != null) {
			if (arg8 instanceof Loc) {
				((Loc) arg8).method1046();
			} else {
				local67 = Static271.method4601(this.anInt1299);
				if (local67.anIntArray380 != null) {
					local67 = local67.method3417();
				}
				if (local67 != null) {
					Static9.method181(local67, 0, this.anInt1295, 0, this.anInt1307, this.anInt1308, this.anInt1300, this.anInt1303);
				}
			}
		}
		if (arg6 != -1) {
			this.aClass144_2 = Static36.method941(arg6);
			this.anInt1297 = 0;
			if (this.aClass144_2.anIntArray473.length <= 1) {
				this.anInt1304 = 0;
			} else {
				this.anInt1304 = 1;
			}
			this.anInt1317 = 1;
			this.anInt1320 = Static83.anInt372 - 1;
			if (this.aClass144_2.anInt5347 == 0 && arg8 != null && arg8 instanceof Loc) {
				@Pc(142) Loc local142 = (Loc) arg8;
				if (this.aClass144_2 == local142.aClass144_2) {
					this.anInt1297 = local142.anInt1297;
					this.anInt1320 = local142.anInt1320;
					this.anInt1317 = local142.anInt1317;
					this.anInt1304 = local142.anInt1304;
					return;
				}
			}
			if (arg7 && this.aClass144_2.anInt5362 != -1) {
				this.anInt1297 = (int) (Math.random() * (double) this.aClass144_2.anIntArray473.length);
				this.anInt1304 = this.anInt1297 + 1;
				if (this.anInt1304 >= this.aClass144_2.anIntArray473.length) {
					this.anInt1304 -= this.aClass144_2.anInt5362;
					if (this.anInt1304 < 0 || this.anInt1304 >= this.aClass144_2.anIntArray473.length) {
						this.anInt1304 = -1;
					}
				}
				this.anInt1317 = (int) (Math.random() * (double) this.aClass144_2.anIntArray474[this.anInt1297]) + 1;
				this.anInt1320 = Static83.anInt372 - this.anInt1317;
			}
		}
		if (GlRenderer.enabled && arg8 != null) {
			this.method1048(true);
		}
		if (arg8 == null) {
			local67 = Static271.method4601(this.anInt1299);
			if (local67.anIntArray380 != null) {
				this.aBoolean80 = true;
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method4545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (GlRenderer.enabled) {
			this.method1048(true);
		} else {
			this.method1047(arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIIIJILclient!ga;)V")
	@Override
	public final void method4546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) ParticleSystem arg10) {
		@Pc(3) Entity local3 = this.method1049();
		if (local3 != null) {
			local3.method4546(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass47_Sub1_2);
		}
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
	public final void method1046() {
		if (this.aClass36_Sub1_2 != null) {
			Static242.method4207(this.aClass36_Sub1_2, this.anInt1296, this.anInt1294, this.anInt1319);
		}
		this.anInt1321 = -1;
		this.anInt1322 = -1;
		this.aClass36_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!dc", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(III)V")
	private void method1047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass144_2 == null) {
			return;
		}
		@Pc(10) int local10 = Static83.anInt372 - this.anInt1320;
		if (local10 > 100 && this.aClass144_2.anInt5362 > 0) {
			@Pc(29) int local29 = this.aClass144_2.anIntArray473.length - this.aClass144_2.anInt5362;
			while (this.anInt1297 < local29 && this.aClass144_2.anIntArray474[this.anInt1297] < local10) {
				local10 -= this.aClass144_2.anIntArray474[this.anInt1297];
				this.anInt1297++;
			}
			if (this.anInt1297 >= local29) {
				@Pc(77) int local77 = 0;
				for (@Pc(79) int local79 = local29; local79 < this.aClass144_2.anIntArray473.length; local79++) {
					local77 += this.aClass144_2.anIntArray474[local79];
				}
				local10 %= local77;
			}
			this.anInt1304 = this.anInt1297 + 1;
			if (this.anInt1304 >= this.aClass144_2.anIntArray473.length) {
				this.anInt1304 -= this.aClass144_2.anInt5362;
				if (this.anInt1304 < 0 || this.aClass144_2.anIntArray473.length <= this.anInt1304) {
					this.anInt1304 = -1;
				}
			}
		}
		while (local10 > this.aClass144_2.anIntArray474[this.anInt1297]) {
			Static152.method2836(arg0, this.aClass144_2, arg1, false, this.anInt1297);
			local10 -= this.aClass144_2.anIntArray474[this.anInt1297];
			this.anInt1297++;
			if (this.aClass144_2.anIntArray473.length <= this.anInt1297) {
				this.anInt1297 -= this.aClass144_2.anInt5362;
				if (this.anInt1297 < 0 || this.aClass144_2.anIntArray473.length <= this.anInt1297) {
					this.aClass144_2 = null;
					break;
				}
			}
			this.anInt1304 = this.anInt1297 + 1;
			if (this.aClass144_2.anIntArray473.length <= this.anInt1304) {
				this.anInt1304 -= this.aClass144_2.anInt5362;
				if (this.anInt1304 < 0 || this.anInt1304 >= this.aClass144_2.anIntArray473.length) {
					this.anInt1304 = -1;
				}
			}
		}
		this.anInt1317 = local10;
		this.anInt1320 = Static83.anInt372 - local10;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)Lclient!th;")
	private Entity method1048(@OriginalArg(0) boolean arg0) {
		@Pc(12) boolean local12 = Static107.anIntArrayArrayArray10 != Static83.anIntArrayArrayArray4;
		@Pc(19) LocType local19 = Static271.method4601(this.anInt1299);
		@Pc(22) int local22 = local19.anInt4430;
		if (local19.anIntArray380 != null) {
			local19 = local19.method3417();
		}
		if (local19 == null) {
			if (GlRenderer.enabled && !local12) {
				this.method1046();
			}
			return null;
		}
		@Pc(69) int local69;
		if (Static266.game != 0 && this.aBoolean80 && (this.aClass144_2 == null || this.aClass144_2 != null && this.aClass144_2.anInt5361 != local19.anInt4430)) {
			local69 = local19.anInt4430;
			if (local19.anInt4430 == -1) {
				local69 = local22;
			}
			if (local69 == -1) {
				this.aClass144_2 = null;
			} else {
				this.aClass144_2 = Static36.method941(local69);
			}
			if (this.aClass144_2 != null) {
				if (local19.aBoolean209 && this.aClass144_2.anInt5362 != -1) {
					this.anInt1297 = (int) (Math.random() * (double) this.aClass144_2.anIntArray473.length);
					this.anInt1320 -= (int) (Math.random() * (double) this.aClass144_2.anIntArray474[this.anInt1297]);
				} else {
					this.anInt1297 = 0;
					this.anInt1320 = Static83.anInt372 - 1;
				}
			}
		}
		local69 = this.anInt1295 & 0x3;
		@Pc(160) int local160;
		@Pc(157) int local157;
		if (local69 == 1 || local69 == 3) {
			local157 = local19.anInt4397;
			local160 = local19.anInt4403;
		} else {
			local160 = local19.anInt4397;
			local157 = local19.anInt4403;
		}
		@Pc(178) int local178 = this.anInt1308 + (local160 + 1 >> 1);
		@Pc(185) int local185 = (local160 >> 1) + this.anInt1308;
		@Pc(192) int local192 = (local157 >> 1) + this.anInt1300;
		@Pc(201) int local201 = (local157 + 1 >> 1) + this.anInt1300;
		this.method1047(local192 * 128, local185 * 128);
		@Pc(256) boolean local256 = !local12 && local19.aBoolean212 && (local19.anInt4426 != this.anInt1321 || (this.anInt1297 != this.anInt1322 || this.aClass144_2 != null && (this.aClass144_2.aBoolean280 || Static204.aBoolean234) && this.anInt1297 != this.anInt1304) && Static139.anInt3451 >= 2);
		if (arg0 && !local256) {
			return null;
		}
		@Pc(267) int[][] local267 = Static83.anIntArrayArrayArray4[this.anInt1303];
		@Pc(293) int local293 = local267[local178][local201] + local267[local185][local201] + local267[local185][local192] + local267[local178][local192] >> 2;
		@Pc(302) int local302 = (local160 << 6) + (this.anInt1308 << 7);
		@Pc(311) int local311 = (local157 << 6) + (this.anInt1300 << 7);
		@Pc(314) int[][] local314 = null;
		if (local12) {
			local314 = Static107.anIntArrayArrayArray10[0];
		} else if (this.anInt1303 < 3) {
			local314 = Static83.anIntArrayArrayArray4[this.anInt1303 + 1];
		}
		if (GlRenderer.enabled && local256) {
			Static242.method4207(this.aClass36_Sub1_2, this.anInt1296, this.anInt1294, this.anInt1319);
		}
		@Pc(356) boolean local356 = this.aClass36_Sub1_2 == null;
		@Pc(389) Class139 local389;
		if (this.aClass144_2 == null) {
			local389 = local19.method3428(this.anInt1295, local302, local267, this.anInt1307, local293, local314, false, local356 ? Static32.aClass36_Sub1_1 : this.aClass36_Sub1_2, local256, local311);
		} else {
			local389 = local19.method3429(local311, local302, local356 ? Static32.aClass36_Sub1_1 : this.aClass36_Sub1_2, local293, this.aClass144_2, this.anInt1295, local267, local256, this.anInt1297, local314, this.anInt1304, this.anInt1307, this.anInt1317);
		}
		if (local389 == null) {
			return null;
		}
		if (GlRenderer.enabled && local256) {
			if (local356) {
				Static32.aClass36_Sub1_1 = local389.aClass36_Sub1_3;
			}
			@Pc(429) int local429 = 0;
			if (this.anInt1303 != 0) {
				@Pc(439) int[][] local439 = Static83.anIntArrayArrayArray4[0];
				local429 = local293 - (local439[local178][local192] + local439[local185][local192] + local439[local185][local201] + local439[local178][local201] >> 2);
			}
			@Pc(471) SoftwareIndexedSprite local471 = local389.aClass36_Sub1_3;
			if (this.aBoolean81 && Static242.method4209(local471, local302, local429, local311)) {
				this.aBoolean81 = false;
			}
			if (!this.aBoolean81) {
				Static242.method4211(local471, local302, local429, local311);
				this.aClass36_Sub1_2 = local471;
				this.anInt1319 = local311;
				if (local356) {
					Static32.aClass36_Sub1_1 = null;
				}
				this.anInt1294 = local429;
				this.anInt1296 = local302;
			}
			this.anInt1321 = local19.anInt4426;
			this.anInt1322 = this.anInt1297;
		}
		return local389.aClass8_10;
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)Lclient!th;")
	public final Entity method1049() {
		return this.method1048(false);
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "()I")
	@Override
	public final int method4549() {
		return this.anInt1311;
	}
}
