import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class IsaacRandom {

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
	private int anInt2912;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
	private int anInt2914;

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
	private int anInt2916;

	@OriginalMember(owner = "client!ij", name = "i", descriptor = "[I")
	private final int[] anIntArray274 = new int[256];

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "[I")
	private final int[] anIntArray275 = new int[256];

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
	private int anInt2920;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "([I)V")
	public IsaacRandom(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray274[local13] = arg0[local13];
		}
		this.method2294();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
	private void method2294() {
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(22) int local22 = -1640531527;
		@Pc(24) int local24 = -1640531527;
		@Pc(26) int local26 = -1640531527;
		@Pc(27) int local27 = -1640531527;
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
			local22 += this.anIntArray274[local29 + 3];
			local20 += this.anIntArray274[local29 + 4];
			local16 += this.anIntArray274[local29 + 6];
			local27 += this.anIntArray274[local29];
			local24 += this.anIntArray274[local29 + 2];
			local18 += this.anIntArray274[local29 + 5];
			local14 += this.anIntArray274[local29 + 7];
			local26 += this.anIntArray274[local29 + 1];
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
			this.anIntArray275[local29] = local27;
			this.anIntArray275[local29 + 1] = local26;
			local24 += local14;
			this.anIntArray275[local29 + 2] = local24;
			this.anIntArray275[local29 + 3] = local22;
			this.anIntArray275[local29 + 4] = local20;
			this.anIntArray275[local29 + 5] = local18;
			this.anIntArray275[local29 + 6] = local16;
			this.anIntArray275[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local16 += this.anIntArray275[local29 + 6];
			local18 += this.anIntArray275[local29 + 5];
			local20 += this.anIntArray275[local29 + 4];
			local26 += this.anIntArray275[local29 + 1];
			local24 += this.anIntArray275[local29 + 2];
			local27 += this.anIntArray275[local29];
			local27 ^= local26 << 11;
			local22 += this.anIntArray275[local29 + 3];
			local14 += this.anIntArray275[local29 + 7];
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
			this.anIntArray275[local29] = local27;
			this.anIntArray275[local29 + 1] = local26;
			this.anIntArray275[local29 + 2] = local24;
			this.anIntArray275[local29 + 3] = local22;
			this.anIntArray275[local29 + 4] = local20;
			this.anIntArray275[local29 + 5] = local18;
			this.anIntArray275[local29 + 6] = local16;
			this.anIntArray275[local29 + 7] = local14;
		}
		this.method2296();
		this.anInt2916 = 256;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)I")
	public final int method2295() {
		if (GlobalConfig.USE_ISAAC) {
			if (this.anInt2916-- == 0) {
				this.method2296();
				this.anInt2916 = 255;
			}
			return this.anIntArray274[this.anInt2916];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
	private void method2296() {
		this.anInt2914 += ++this.anInt2912;
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(33) int local33 = this.anIntArray275[local17];
			if ((local17 & 0x2) == 0) {
				if ((local17 & 0x1) == 0) {
					this.anInt2920 ^= this.anInt2920 << 13;
				} else {
					this.anInt2920 ^= this.anInt2920 >>> 6;
				}
			} else if ((local17 & 0x1) == 0) {
				this.anInt2920 ^= this.anInt2920 << 2;
			} else {
				this.anInt2920 ^= this.anInt2920 >>> 16;
			}
			this.anInt2920 += this.anIntArray275[local17 + 128 & 0xFF];
			@Pc(119) int local119;
			this.anIntArray275[local17] = local119 = this.anInt2914 + this.anInt2920 + this.anIntArray275[local33 >> 2 & 0xFF];
			this.anIntArray274[local17] = this.anInt2914 = local33 + this.anIntArray275[local119 >> 8 >> 2 & 0xFF];
		}
	}
}
