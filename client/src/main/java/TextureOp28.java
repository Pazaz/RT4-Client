import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class TextureOp28 extends TextureOp {

	@OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
	private int anInt4971 = 585;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
	public TextureOp28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] method4626(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.aClass121_41.method3445(arg0);
		if (this.aClass121_41.aBoolean221) {
			@Pc(28) int local28 = Static64.anIntArray153[arg0];
			for (@Pc(30) int local30 = 0; local30 < Static189.anInt4457; local30++) {
				@Pc(41) int local41 = Static173.anIntArray367[local30];
				@Pc(76) int local76;
				if (local41 > this.anInt4971 && 4096 - this.anInt4971 > local41 && 2048 - this.anInt4971 < local28 && local28 < this.anInt4971 + 2048) {
					local76 = 2048 - local41;
					local76 = local76 < 0 ? -local76 : local76;
					local76 <<= 0xC;
					local76 /= 2048 - this.anInt4971;
					local19[local30] = 4096 - local76;
				} else if (local41 > 2048 - this.anInt4971 && local41 < this.anInt4971 + 2048) {
					local76 = local28 - 2048;
					local76 = local76 >= 0 ? local76 : -local76;
					local76 -= this.anInt4971;
					local76 <<= 0xC;
					local19[local30] = local76 / (2048 - this.anInt4971);
				} else if (local28 < this.anInt4971 || 4096 - this.anInt4971 < local28) {
					local76 = local41 - 2048;
					@Pc(188) int local188 = local76 < 0 ? -local76 : local76;
					@Pc(193) int local193 = local188 - this.anInt4971;
					@Pc(197) int local197 = local193 << 12;
					local19[local30] = local197 / (2048 - this.anInt4971);
				} else if (this.anInt4971 <= local41 && local41 <= 4096 - this.anInt4971) {
					local19[local30] = 0;
				} else {
					local76 = 2048 - local28;
					local76 = local76 < 0 ? -local76 : local76;
					local76 <<= 0xC;
					local76 /= 2048 - this.anInt4971;
					local19[local30] = 4096 - local76;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt4971 = arg1.g2();
		}
	}
}
