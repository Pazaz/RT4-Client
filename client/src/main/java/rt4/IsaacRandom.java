package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class IsaacRandom {

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
	private int c;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
	private int b;

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
	private int count;

	@OriginalMember(owner = "client!ij", name = "i", descriptor = "[I")
	private final int[] rsl = new int[256];

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "[I")
	private final int[] mem = new int[256];

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
	private int a;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "([I)V")
	public IsaacRandom(@OriginalArg(0) int[] seed) {
		for (@Pc(13) int i = 0; i < seed.length; i++) {
			this.rsl[i] = seed[i];
		}
		this.init();
	}

	public static final int GOLDEN_RATIO = 0x9e3779b9;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
	private void init() {
		@Pc(14) int local14 = GOLDEN_RATIO;
		@Pc(16) int local16 = GOLDEN_RATIO;
		@Pc(18) int local18 = GOLDEN_RATIO;
		@Pc(20) int local20 = GOLDEN_RATIO;
		@Pc(22) int local22 = GOLDEN_RATIO;
		@Pc(24) int local24 = GOLDEN_RATIO;
		@Pc(26) int local26 = GOLDEN_RATIO;
		@Pc(27) int local27 = GOLDEN_RATIO;
		@Pc(29) int local29;
		for (local29 = 0; local29 < 4; local29++) {
			local27 ^= local26 << 11;
			local22 += local27;
			local26 += local24;
			local26 ^= local24 >>> 2;
			local24 += local22;
			local24 ^= local22 << 8;
			local18 += local24;
			local20 += local26;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 << 10;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local16 += local14;
			local16 ^= local14 << 8;
			local26 += local16;
			local27 += local18;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local22 += this.rsl[local29 + 3];
			local20 += this.rsl[local29 + 4];
			local16 += this.rsl[local29 + 6];
			local27 += this.rsl[local29];
			local24 += this.rsl[local29 + 2];
			local18 += this.rsl[local29 + 5];
			local14 += this.rsl[local29 + 7];
			local26 += this.rsl[local29 + 1];
			local27 ^= local26 << 11;
			local26 += local24;
			local26 ^= local24 >>> 2;
			local22 += local27;
			local24 += local22;
			local24 ^= local22 << 8;
			local20 += local26;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local18 += local24;
			local20 += local18;
			local20 ^= local18 << 10;
			local14 += local20;
			local16 += local22;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local16 += local14;
			local16 ^= local14 << 8;
			local27 += local18;
			local14 += local27;
			local26 += local16;
			local14 ^= local27 >>> 9;
			local27 += local26;
			this.mem[local29] = local27;
			this.mem[local29 + 1] = local26;
			local24 += local14;
			this.mem[local29 + 2] = local24;
			this.mem[local29 + 3] = local22;
			this.mem[local29 + 4] = local20;
			this.mem[local29 + 5] = local18;
			this.mem[local29 + 6] = local16;
			this.mem[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local16 += this.mem[local29 + 6];
			local18 += this.mem[local29 + 5];
			local20 += this.mem[local29 + 4];
			local26 += this.mem[local29 + 1];
			local24 += this.mem[local29 + 2];
			local27 += this.mem[local29];
			local27 ^= local26 << 11;
			local22 += this.mem[local29 + 3];
			local14 += this.mem[local29 + 7];
			local22 += local27;
			local26 += local24;
			local26 ^= local24 >>> 2;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 << 8;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local20 += local18;
			local20 ^= local18 << 10;
			local16 += local22;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local14 += local20;
			local16 += local14;
			local27 += local18;
			local16 ^= local14 << 8;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
			this.mem[local29] = local27;
			this.mem[local29 + 1] = local26;
			this.mem[local29 + 2] = local24;
			this.mem[local29 + 3] = local22;
			this.mem[local29 + 4] = local20;
			this.mem[local29 + 5] = local18;
			this.mem[local29 + 6] = local16;
			this.mem[local29 + 7] = local14;
		}
		this.isaac();
		this.count = 256;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)I")
	public final int getNextKey() {
		if (GlobalConfig.USE_ISAAC) {
			if (this.count-- == 0) {
				this.isaac();
				this.count = 255;
			}
			return this.rsl[this.count];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
	private void isaac() {
		this.b += ++this.c;
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(33) int local33 = this.mem[local17];
			if ((local17 & 0x2) == 0) {
				if ((local17 & 0x1) == 0) {
					this.a ^= this.a << 13;
				} else {
					this.a ^= this.a >>> 6;
				}
			} else if ((local17 & 0x1) == 0) {
				this.a ^= this.a << 2;
			} else {
				this.a ^= this.a >>> 16;
			}
			this.a += this.mem[local17 + 128 & 0xFF];
			@Pc(119) int local119;
			this.mem[local17] = local119 = this.b + this.a + this.mem[local33 >> 2 & 0xFF];
			this.rsl[local17] = this.b = local33 + this.mem[local119 >> 8 >> 2 & 0xFF];
		}
	}
}
