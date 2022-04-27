package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class NanoTimer extends Timer {

	@OriginalMember(owner = "client!om", name = "k", descriptor = "J")
	private long aLong142 = System.nanoTime();

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
	@Override
	public final void reset() {
		this.aLong142 = System.nanoTime();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(III)I")
	@Override
	public final int sleep(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) long local9 = (long) arg0 * 1000000L;
		@Pc(14) long local14 = this.aLong142 - System.nanoTime();
		if (local9 > local14) {
			local14 = local9;
		}
		ThreadUtils.sleep(local14 / 1000000L);
		@Pc(31) int local31 = 0;
		@Pc(33) long local33 = System.nanoTime();
		while (local31 < 10 && (local31 < 1 || this.aLong142 < local33)) {
			local31++;
			this.aLong142 += (long) arg1 * 1000000L;
		}
		if (local33 > this.aLong142) {
			this.aLong142 = local33;
		}
		return local31;
	}

	@Override
	public int count(int arg0, int arg1) {
		@Pc(9) long local9 = (long) arg0 * 1000000L;
		@Pc(14) long local14 = this.aLong142 - System.nanoTime();
		if (local9 > local14) {
			local14 = local9;
		}
		@Pc(31) int local31 = 0;
		@Pc(33) long local33 = System.nanoTime();
		while (local31 < 10 && (local31 < 1 || this.aLong142 < local33)) {
			local31++;
			this.aLong142 += (long) arg1 * 1000000L;
		}
		if (local33 > this.aLong142) {
			this.aLong142 = local33;
		}
		return local31;
	}
}
