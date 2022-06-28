package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Packet extends Buffer {

	@OriginalMember(owner = "client!bh", name = "G", descriptor = "[I")
	public static final int[] BIT_MASKS = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};

	@OriginalMember(owner = "client!i", name = "Xb", descriptor = "Lclient!ij;")
	private IsaacRandom isaac;

	@OriginalMember(owner = "client!i", name = "fc", descriptor = "I")
	private int bitOffset;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(I)V")
	public Packet(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!i", name = "q", descriptor = "(B)V")
	public final void accessBits() {
		this.bitOffset = this.offset * 8;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BI[BI)V")
	public final void gBytesIsaac(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(17) int local17 = 0; local17 < arg1; local17++) {
			arg0[local17] = (byte) (this.data[this.offset++] - this.isaac.getNextKey());
		}
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "(BI)I")
	public final int gBits(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = this.bitOffset >> 3;
		@Pc(14) int local14 = 8 - (this.bitOffset & 0x7);
		@Pc(16) int local16 = 0;
		this.bitOffset += arg0;
		while (local14 < arg0) {
			local16 += (BIT_MASKS[local14] & this.data[local6++]) << arg0 - local14;
			arg0 -= local14;
			local14 = 8;
		}
		if (local14 == arg0) {
			local16 += this.data[local6] & BIT_MASKS[local14];
		} else {
			local16 += this.data[local6] >> local14 - arg0 & BIT_MASKS[arg0];
		}
		return local16;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([IZ)V")
	public final void setKey(@OriginalArg(0) int[] arg0) {
		this.isaac = new IsaacRandom(arg0);
	}

	@OriginalMember(owner = "client!i", name = "q", descriptor = "(II)I")
	public final int method2241(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.bitOffset;
	}

	@OriginalMember(owner = "client!i", name = "r", descriptor = "(II)V")
	public final void p1isaac(@OriginalArg(1) int arg0) {
		this.data[this.offset++] = (byte) (arg0 + this.isaac.getNextKey());
	}

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)I")
	public final int g1isaac() {
		return this.data[this.offset++] - this.isaac.getNextKey() & 0xFF;
	}

	@OriginalMember(owner = "client!i", name = "h", descriptor = "(Z)V")
	public final void accessBytes() {
		this.offset = (this.bitOffset + 7) / 8;
	}
}
