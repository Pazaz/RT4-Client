package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class MillisTimer extends Timer {

	@OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
	private int anInt3549;

	@OriginalMember(owner = "client!lj", name = "x", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
	private int anInt3550 = 256;

	@OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
	private int anInt3552 = 1;

	@OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
	private int anInt3553 = 0;

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "J")
	private long aLong122 = MonotonicClock.currentTimeMillis();

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	public MillisTimer() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray4[local22] = this.aLong122;
		}
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V")
	@Override
	public final void reset() {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			this.aLongArray4[local7] = 0L;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)I")
	@Override
	public final int sleep(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = this.anInt3552;
		@Pc(20) int local20 = this.anInt3550;
		this.anInt3550 = 300;
		this.anInt3552 = 1;
		this.aLong122 = MonotonicClock.currentTimeMillis();
		if (this.aLongArray4[this.anInt3549] == 0L) {
			this.anInt3550 = local20;
			this.anInt3552 = local17;
		} else if (this.aLongArray4[this.anInt3549] < this.aLong122) {
			this.anInt3550 = (int) ((long) (arg1 * 2560) / (this.aLong122 - this.aLongArray4[this.anInt3549]));
		}
		if (this.anInt3550 < 25) {
			this.anInt3550 = 25;
		}
		if (this.anInt3550 > 256) {
			this.anInt3550 = 256;
			this.anInt3552 = (int) ((long) arg1 - (this.aLong122 - this.aLongArray4[this.anInt3549]) / 10L);
		}
		if (arg1 < this.anInt3552) {
			this.anInt3552 = arg1;
		}
		this.aLongArray4[this.anInt3549] = this.aLong122;
		this.anInt3549 = (this.anInt3549 + 1) % 10;
		@Pc(139) int local139;
		if (this.anInt3552 > 1) {
			for (local139 = 0; local139 < 10; local139++) {
				if (this.aLongArray4[local139] != 0L) {
					this.aLongArray4[local139] += this.anInt3552;
				}
			}
		}
		if (arg0 > this.anInt3552) {
			this.anInt3552 = arg0;
		}
		ThreadUtils.sleep(this.anInt3552);
		local139 = 0;
		while (this.anInt3553 < 256) {
			this.anInt3553 += this.anInt3550;
			local139++;
		}
		this.anInt3553 &= 0xFF;
		return local139;
	}

	public int count(int arg0, int arg1) {
		return 1;
	}
}
