package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class SynthEnvelope {

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
	public int wavetable;

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
	public int minInterval;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
	public int maxInterval;

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
	private int phase;

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
	private int level;

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
	private int slope;

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
	private int nextTime;

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
	private int time;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
	private int stages = 2;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "[I")
	private int[] times = new int[2];

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "[I")
	private int[] levels = new int[2];

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
	public SynthEnvelope() {
		this.times[0] = 0;
		this.times[1] = 65535;
		this.levels[0] = 0;
		this.levels[1] = 65535;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)I")
	public final int nextLevel(@OriginalArg(0) int arg0) {
		if (this.time >= this.nextTime) {
			this.level = this.levels[this.phase++] << 15;
			if (this.phase >= this.stages) {
				this.phase = this.stages - 1;
			}
			this.nextTime = (int) ((double) this.times[this.phase] / 65536.0D * (double) arg0);
			if (this.nextTime > this.time) {
				this.slope = ((this.levels[this.phase] << 15) - this.level) / (this.nextTime - this.time);
			}
		}
		this.level += this.slope;
		this.time++;
		return this.level - this.slope >> 15;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "()V")
	public final void reset() {
		this.nextTime = 0;
		this.phase = 0;
		this.slope = 0;
		this.level = 0;
		this.time = 0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!wa;)V")
	public final void decodeStages(@OriginalArg(0) Buffer arg0) {
		this.stages = arg0.g1();
		this.times = new int[this.stages];
		this.levels = new int[this.stages];
		for (@Pc(16) int local16 = 0; local16 < this.stages; local16++) {
			this.times[local16] = arg0.g2();
			this.levels[local16] = arg0.g2();
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(Lclient!wa;)V")
	public final void decode(@OriginalArg(0) Buffer arg0) {
		this.wavetable = arg0.g1();
		this.minInterval = arg0.g4();
		this.maxInterval = arg0.g4();
		this.decodeStages(arg0);
	}
}
