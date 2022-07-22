package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class ProjAnim extends Entity {

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "D")
	private double velocityX;

	@OriginalMember(owner = "client!ra", name = "A", descriptor = "D")
	public double y;

	@OriginalMember(owner = "client!ra", name = "N", descriptor = "D")
	private double accelerationZ;

	@OriginalMember(owner = "client!ra", name = "Q", descriptor = "Lclient!ga;")
	private ParticleSystem particleSystem;

	@OriginalMember(owner = "client!ra", name = "U", descriptor = "D")
	private double velocityZ;

	@OriginalMember(owner = "client!ra", name = "X", descriptor = "D")
	public double z;

	@OriginalMember(owner = "client!ra", name = "ab", descriptor = "I")
	private int pitch;

	@OriginalMember(owner = "client!ra", name = "bb", descriptor = "D")
	private double velocityY;

	@OriginalMember(owner = "client!ra", name = "db", descriptor = "D")
	public double x;

	@OriginalMember(owner = "client!ra", name = "eb", descriptor = "D")
	private double velocity;

	@OriginalMember(owner = "client!ra", name = "hb", descriptor = "I")
	public int yaw;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
	private int frameCycle = 0;

	@OriginalMember(owner = "client!ra", name = "I", descriptor = "Z")
	private boolean isMobile = false;

	@OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
	private int anInt4798 = -1;

	@OriginalMember(owner = "client!ra", name = "fb", descriptor = "I")
	private int seqFrame = 0;

	@OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
	private int minY = -32768;

	@OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
	public final int lastCycle;

	@OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
	private final int sourceX;

	@OriginalMember(owner = "client!ra", name = "cb", descriptor = "I")
	public final int targetIndex;

	@OriginalMember(owner = "client!ra", name = "Y", descriptor = "I")
	private final int spotanimId;

	@OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
	public final int currentPlane;

	@OriginalMember(owner = "client!ra", name = "mb", descriptor = "I")
	private final int elevationPitch;

	@OriginalMember(owner = "client!ra", name = "Z", descriptor = "I")
	private final int sourceY;

	@OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
	public final int baseZ;

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
	private final int arcScale;

	@OriginalMember(owner = "client!ra", name = "ib", descriptor = "I")
	public final int firstCycle;

	@OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
	private final int sourceZ;

	@OriginalMember(owner = "client!ra", name = "gb", descriptor = "Lclient!tk;")
	private final SeqType seq;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public ProjAnim(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.lastCycle = arg6;
		this.sourceX = arg2;
		this.targetIndex = arg9;
		this.spotanimId = arg0;
		this.currentPlane = arg1;
		this.elevationPitch = arg7;
		this.sourceY = arg3;
		this.isMobile = false;
		this.baseZ = arg10;
		this.arcScale = arg8;
		this.firstCycle = arg5;
		this.sourceZ = arg4;
		@Pc(58) int seqId = SpotAnimTypeList.get(this.spotanimId).seqId;
		if (seqId == -1) {
			this.seq = null;
		} else {
			this.seq = SeqTypeList.get(seqId);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method4545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)Lclient!ak;")
	private Model method3703() {
		@Pc(14) SpotAnimType seq = SpotAnimTypeList.get(this.spotanimId);
		@Pc(24) Model model = seq.constructModel(this.anInt4798, this.seqFrame, this.frameCycle);
		if (model == null) {
			return null;
		} else {
			model.rotateX(this.pitch);
			return model;
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(BI)V")
	public final void update(@OriginalArg(1) int arg0) {
		this.x += this.velocityX * (double) arg0;
		this.y += this.velocityY * (double) arg0;
		this.isMobile = true;
		if (this.elevationPitch == -1) {
			this.z += this.velocityZ * (double) arg0;
		} else {
			this.z += (double) arg0 * this.accelerationZ * 0.5D * (double) arg0 + (double) arg0 * this.velocityZ;
			this.velocityZ += this.accelerationZ * (double) arg0;
		}
		this.yaw = (int) (Math.atan2(this.velocityX, this.velocityY) * 325.949D) + 1024 & 0x7FF;
		this.pitch = (int) (Math.atan2(this.velocityZ, this.velocity) * 325.949D) & 0x7FF;
		if (this.seq == null) {
			return;
		}
		this.frameCycle += arg0;
		while (true) {
			do {
				do {
					if (this.frameCycle <= this.seq.frameDelay[this.seqFrame]) {
						return;
					}
					this.frameCycle -= this.seq.frameDelay[this.seqFrame];
					this.seqFrame++;
					if (this.seqFrame >= this.seq.frames.length) {
						this.seqFrame -= this.seq.replayoff;
						if (this.seqFrame < 0 || this.seq.frames.length <= this.seqFrame) {
							this.seqFrame = 0;
						}
					}
					this.anInt4798 = this.seqFrame + 1;
				} while (this.seq.frames.length > this.anInt4798);
				this.anInt4798 -= this.seq.replayoff;
			} while (this.anInt4798 >= 0 && this.anInt4798 < this.seq.frames.length);
			this.anInt4798 = -1;
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(IIIII)V")
	public final void setTarget(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) double local17;
		if (!this.isMobile) {
			@Pc(10) double local10 = arg0 - this.sourceY;
			local17 = arg3 - this.sourceX;
			@Pc(26) double local26 = Math.sqrt(local17 * local17 + local10 * local10);
			this.z = this.sourceZ;
			this.y = local10 * (double) this.arcScale / local26 + (double) this.sourceY;
			this.x = (double) this.arcScale * local17 / local26 + (double) this.sourceX;
		}
		local17 = this.lastCycle + 1 - arg1;
		this.velocityY = ((double) arg0 - this.y) / local17;
		this.velocityX = ((double) arg3 - this.x) / local17;
		this.velocity = Math.sqrt(this.velocityY * this.velocityY + this.velocityX * this.velocityX);
		if (this.elevationPitch == -1) {
			this.velocityZ = ((double) arg2 - this.z) / local17;
		} else {
			if (!this.isMobile) {
				this.velocityZ = -this.velocity * Math.tan((double) this.elevationPitch * 0.02454369D);
			}
			this.accelerationZ = ((double) arg2 - this.z - this.velocityZ * local17) * 2.0D / (local17 * local17);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIIIJILclient!ga;)V")
	@Override
	public final void render(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) ParticleSystem arg10) {
		@Pc(3) Model local3 = this.method3703();
		if (local3 != null) {
			local3.render(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.particleSystem);
			this.minY = local3.getMinY();
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "()I")
	@Override
	public final int getMinY() {
		return this.minY;
	}
}
