package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class IntHashTable {

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "[I")
	private final int[] anIntArray285;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "([I)V")
	public IntHashTable(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray285 = new int[local5 + local5];
		@Pc(28) int local28;
		for (local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray285[local28] = -1;
		}
		local28 = 0;
		while (arg0.length > local28) {
			@Pc(55) int local55;
			for (local55 = local5 - 1 & arg0[local28]; this.anIntArray285[local55 + local55 + 1] != -1; local55 = local5 - 1 & local55 + 1) {
			}
			this.anIntArray285[local55 + local55] = arg0[local28];
			this.anIntArray285[local55 + local55 + 1] = local28++;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)I")
	public final int get(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = (this.anIntArray285.length >> 1) - 1;
		@Pc(20) int local20 = local16 & arg0;
		while (true) {
			@Pc(29) int local29 = this.anIntArray285[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray285[local20 + local20]) {
				return local29;
			}
			local20 = local20 + 1 & local16;
		}
	}
}
