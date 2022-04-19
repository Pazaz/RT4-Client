import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class TriangleNormal {

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "[J")
	public static final long[] aLongArray7 = new long[256];

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
	public int anInt4767;

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
	public int anInt4769;

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
	public int anInt4770;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(10) long local10 = (long) local4;
			for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
				if ((local10 & 0x1L) == 1L) {
					local10 = local10 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local10 >>>= 0x1;
				}
			}
			aLongArray7[local4] = local10;
		}
	}
}
