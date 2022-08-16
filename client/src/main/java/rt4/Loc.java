package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Loc extends Entity {

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "[I")
	public static final int[] LAYERS = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "Lclient!ek;")
	public static SoftwareIndexedSprite sprite1 = null;

	@OriginalMember(owner = "client!dc", name = "U", descriptor = "Lclient!ga;")
	private ParticleSystem particles;

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
	private int anInt1296 = 0;

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
	private int anInt1294 = 0;

	@OriginalMember(owner = "client!dc", name = "B", descriptor = "Z")
	private boolean aBoolean81 = true;

	@OriginalMember(owner = "client!dc", name = "Q", descriptor = "Lclient!ek;")
	private SoftwareIndexedSprite sprite2 = null;

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
	public Loc(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int seqId, @OriginalArg(7) boolean arg7, @OriginalArg(8) Entity arg8) {
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
				local67 = LocTypeList.get(this.anInt1299);
				if (local67.multiLocs != null) {
					local67 = local67.getMultiLoc();
				}
				if (local67 != null) {
					method181(local67, 0, this.anInt1295, 0, this.anInt1307, this.anInt1308, this.anInt1300, this.anInt1303);
				}
			}
		}
		if (seqId != -1) {
			this.aClass144_2 = SeqTypeList.get(seqId);
			this.anInt1297 = 0;
			if (this.aClass144_2.frames.length <= 1) {
				this.anInt1304 = 0;
			} else {
				this.anInt1304 = 1;
			}
			this.anInt1317 = 1;
			this.anInt1320 = client.loop - 1;
			if (this.aClass144_2.exactmove == 0 && arg8 != null && arg8 instanceof Loc) {
				@Pc(142) Loc local142 = (Loc) arg8;
				if (this.aClass144_2 == local142.aClass144_2) {
					this.anInt1297 = local142.anInt1297;
					this.anInt1320 = local142.anInt1320;
					this.anInt1317 = local142.anInt1317;
					this.anInt1304 = local142.anInt1304;
					return;
				}
			}
			if (arg7 && this.aClass144_2.replayoff != -1) {
				this.anInt1297 = (int) (Math.random() * (double) this.aClass144_2.frames.length);
				this.anInt1304 = this.anInt1297 + 1;
				if (this.anInt1304 >= this.aClass144_2.frames.length) {
					this.anInt1304 -= this.aClass144_2.replayoff;
					if (this.anInt1304 < 0 || this.anInt1304 >= this.aClass144_2.frames.length) {
						this.anInt1304 = -1;
					}
				}
				this.anInt1317 = (int) (Math.random() * (double) this.aClass144_2.frameDelay[this.anInt1297]) + 1;
				this.anInt1320 = client.loop - this.anInt1317;
			}
		}
		if (GlRenderer.enabled && arg8 != null) {
			this.method1048(true);
		}
		if (arg8 == null) {
			local67 = LocTypeList.get(this.anInt1299);
			if (local67.multiLocs != null) {
				this.aBoolean80 = true;
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!pb;BIIIIIII)V")
	public static void method181(@OriginalArg(0) LocType arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(5) int local5 = arg2 & 0x3;
		@Pc(28) int local28;
		@Pc(31) int local31;
		if (local5 == 1 || local5 == 3) {
			local28 = arg0.length;
			local31 = arg0.width;
		} else {
			local31 = arg0.length;
			local28 = arg0.width;
		}
		@Pc(53) int local53;
		@Pc(51) int local51;
		if (arg6 + local31 > 104) {
			local51 = arg6 + 1;
			local53 = arg6;
		} else {
			local53 = arg6 + (local31 >> 1);
			local51 = arg6 + (local31 + 1 >> 1);
		}
		@Pc(80) int local80 = (arg5 << 7) + (local28 << 6);
		@Pc(88) int local88 = (arg6 << 7) + (local31 << 6);
		@Pc(96) int local96;
		@Pc(100) int local100;
		if (arg5 + local28 > 104) {
			local96 = arg5;
			local100 = arg5 + 1;
		} else {
			local96 = arg5 + (local28 >> 1);
			local100 = (local28 + 1 >> 1) + arg5;
		}
		@Pc(120) int[][] local120 = SceneGraph.tileHeights[arg7];
		@Pc(122) int local122 = 0;
		@Pc(148) int local148 = local120[local96][local51] + local120[local96][local53] + local120[local100][local53] + local120[local100][local51] >> 2;
		@Pc(158) int[][] local158;
		if (arg7 != 0) {
			local158 = SceneGraph.tileHeights[0];
			local122 = local148 - (local158[local96][local51] + local158[local100][local53] + local158[local96][local53] + local158[local100][local51] >> 2);
		}
		local158 = null;
		if (arg7 < 3) {
			local158 = SceneGraph.tileHeights[arg7 + 1];
		}
		@Pc(215) LocEntity local215 = arg0.method3428(arg2, local80, local120, arg4, local148, local158, false, null, true, local88);
		ShadowManager.method4207(local215.sprite, local80 - arg3, local122, local88 - arg1);
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
	public final void render(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) ParticleSystem arg10) {
		@Pc(3) Entity local3 = this.method1049();
		if (local3 != null) {
			local3.render(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.particles);
		}
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
	public final void method1046() {
		if (this.sprite2 != null) {
			ShadowManager.method4207(this.sprite2, this.anInt1296, this.anInt1294, this.anInt1319);
		}
		this.anInt1321 = -1;
		this.anInt1322 = -1;
		this.sprite2 = null;
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
		@Pc(10) int local10 = client.loop - this.anInt1320;
		if (local10 > 100 && this.aClass144_2.replayoff > 0) {
			@Pc(29) int local29 = this.aClass144_2.frames.length - this.aClass144_2.replayoff;
			while (this.anInt1297 < local29 && this.aClass144_2.frameDelay[this.anInt1297] < local10) {
				local10 -= this.aClass144_2.frameDelay[this.anInt1297];
				this.anInt1297++;
			}
			if (this.anInt1297 >= local29) {
				@Pc(77) int local77 = 0;
				for (@Pc(79) int local79 = local29; local79 < this.aClass144_2.frames.length; local79++) {
					local77 += this.aClass144_2.frameDelay[local79];
				}
				local10 %= local77;
			}
			this.anInt1304 = this.anInt1297 + 1;
			if (this.anInt1304 >= this.aClass144_2.frames.length) {
				this.anInt1304 -= this.aClass144_2.replayoff;
				if (this.anInt1304 < 0 || this.aClass144_2.frames.length <= this.anInt1304) {
					this.anInt1304 = -1;
				}
			}
		}
		while (local10 > this.aClass144_2.frameDelay[this.anInt1297]) {
			SoundPlayer.playSeqSound(arg0, this.aClass144_2, arg1, false, this.anInt1297);
			local10 -= this.aClass144_2.frameDelay[this.anInt1297];
			this.anInt1297++;
			if (this.aClass144_2.frames.length <= this.anInt1297) {
				this.anInt1297 -= this.aClass144_2.replayoff;
				if (this.anInt1297 < 0 || this.aClass144_2.frames.length <= this.anInt1297) {
					this.aClass144_2 = null;
					break;
				}
			}
			this.anInt1304 = this.anInt1297 + 1;
			if (this.aClass144_2.frames.length <= this.anInt1304) {
				this.anInt1304 -= this.aClass144_2.replayoff;
				if (this.anInt1304 < 0 || this.anInt1304 >= this.aClass144_2.frames.length) {
					this.anInt1304 = -1;
				}
			}
		}
		this.anInt1317 = local10;
		this.anInt1320 = client.loop - local10;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)Lclient!th;")
	private Entity method1048(@OriginalArg(0) boolean arg0) {
		@Pc(12) boolean local12 = SceneGraph.surfaceTileHeights != SceneGraph.tileHeights;
		@Pc(19) LocType local19 = LocTypeList.get(this.anInt1299);
		@Pc(22) int local22 = local19.anim;
		if (local19.multiLocs != null) {
			local19 = local19.getMultiLoc();
		}
		if (local19 == null) {
			if (GlRenderer.enabled && !local12) {
				this.method1046();
			}
			return null;
		}
		@Pc(69) int local69;
		if (client.game != 0 && this.aBoolean80 && (this.aClass144_2 == null || this.aClass144_2 != null && this.aClass144_2.id != local19.anim)) {
			local69 = local19.anim;
			if (local19.anim == -1) {
				local69 = local22;
			}
			if (local69 == -1) {
				this.aClass144_2 = null;
			} else {
				this.aClass144_2 = SeqTypeList.get(local69);
			}
			if (this.aClass144_2 != null) {
				if (local19.allowrandomizedanimation && this.aClass144_2.replayoff != -1) {
					this.anInt1297 = (int) (Math.random() * (double) this.aClass144_2.frames.length);
					this.anInt1320 -= (int) (Math.random() * (double) this.aClass144_2.frameDelay[this.anInt1297]);
				} else {
					this.anInt1297 = 0;
					this.anInt1320 = client.loop - 1;
				}
			}
		}
		local69 = this.anInt1295 & 0x3;
		@Pc(160) int local160;
		@Pc(157) int local157;
		if (local69 == 1 || local69 == 3) {
			local157 = local19.width;
			local160 = local19.length;
		} else {
			local160 = local19.width;
			local157 = local19.length;
		}
		@Pc(178) int local178 = this.anInt1308 + (local160 + 1 >> 1);
		@Pc(185) int local185 = (local160 >> 1) + this.anInt1308;
		@Pc(192) int local192 = (local157 >> 1) + this.anInt1300;
		@Pc(201) int local201 = (local157 + 1 >> 1) + this.anInt1300;
		this.method1047(local192 * 128, local185 * 128);
		@Pc(256) boolean local256 = !local12 && local19.castshadow && (local19.id != this.anInt1321 || (this.anInt1297 != this.anInt1322 || this.aClass144_2 != null && (this.aClass144_2.aBoolean280 || SeqType.applyTweening) && this.anInt1297 != this.anInt1304) && Preferences.sceneryShadowsType >= 2);
		if (arg0 && !local256) {
			return null;
		}
		@Pc(267) int[][] local267 = SceneGraph.tileHeights[this.anInt1303];
		@Pc(293) int local293 = local267[local178][local201] + local267[local185][local201] + local267[local185][local192] + local267[local178][local192] >> 2;
		@Pc(302) int local302 = (local160 << 6) + (this.anInt1308 << 7);
		@Pc(311) int local311 = (local157 << 6) + (this.anInt1300 << 7);
		@Pc(314) int[][] local314 = null;
		if (local12) {
			local314 = SceneGraph.surfaceTileHeights[0];
		} else if (this.anInt1303 < 3) {
			local314 = SceneGraph.tileHeights[this.anInt1303 + 1];
		}
		if (GlRenderer.enabled && local256) {
			ShadowManager.method4207(this.sprite2, this.anInt1296, this.anInt1294, this.anInt1319);
		}
		@Pc(356) boolean local356 = this.sprite2 == null;
		@Pc(389) LocEntity local389;
		if (this.aClass144_2 == null) {
			local389 = local19.method3428(this.anInt1295, local302, local267, this.anInt1307, local293, local314, false, local356 ? sprite1 : this.sprite2, local256, local311);
		} else {
			local389 = local19.method3429(local311, local302, local356 ? sprite1 : this.sprite2, local293, this.aClass144_2, this.anInt1295, local267, local256, this.anInt1297, local314, this.anInt1304, this.anInt1307, this.anInt1317);
		}
		if (local389 == null) {
			return null;
		}
		if (GlRenderer.enabled && local256) {
			if (local356) {
				sprite1 = local389.sprite;
			}
			@Pc(429) int local429 = 0;
			if (this.anInt1303 != 0) {
				@Pc(439) int[][] local439 = SceneGraph.tileHeights[0];
				local429 = local293 - (local439[local178][local192] + local439[local185][local192] + local439[local185][local201] + local439[local178][local201] >> 2);
			}
			@Pc(471) SoftwareIndexedSprite local471 = local389.sprite;
			if (this.aBoolean81 && ShadowManager.method4209(local471, local302, local429, local311)) {
				this.aBoolean81 = false;
			}
			if (!this.aBoolean81) {
				ShadowManager.method4211(local471, local302, local429, local311);
				this.sprite2 = local471;
				this.anInt1319 = local311;
				if (local356) {
					sprite1 = null;
				}
				this.anInt1294 = local429;
				this.anInt1296 = local302;
			}
			this.anInt1321 = local19.id;
			this.anInt1322 = this.anInt1297;
		}
		return local389.model;
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)Lclient!th;")
	public final Entity method1049() {
		return this.method1048(false);
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "()I")
	@Override
	public final int getMinY() {
		return this.anInt1311;
	}
}
