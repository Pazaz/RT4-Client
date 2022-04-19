import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class VorbisMapping {

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
	public final int anInt5563;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
	public int anInt5562;

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "[I")
	public final int[] anIntArray490;

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "[I")
	public final int[] anIntArray491;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V")
	public VorbisMapping() {
		Static117.method2350(16);
		this.anInt5563 = Static117.method2346() == 0 ? 1 : Static117.method2350(4) + 1;
		if (Static117.method2346() != 0) {
			Static117.method2350(8);
		}
		Static117.method2350(2);
		if (this.anInt5563 > 1) {
			this.anInt5562 = Static117.method2350(4);
		}
		this.anIntArray490 = new int[this.anInt5563];
		this.anIntArray491 = new int[this.anInt5563];
		for (@Pc(42) int local42 = 0; local42 < this.anInt5563; local42++) {
			Static117.method2350(8);
			this.anIntArray490[local42] = Static117.method2350(8);
			this.anIntArray491[local42] = Static117.method2350(8);
		}
	}
}
