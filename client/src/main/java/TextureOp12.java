import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class TextureOp12 extends TextureOp {

	@OriginalMember(owner = "client!gm", name = "Z", descriptor = "I")
	private int anInt2298 = 1365;

	@OriginalMember(owner = "client!gm", name = "ab", descriptor = "I")
	private int anInt2299 = 0;

	@OriginalMember(owner = "client!gm", name = "V", descriptor = "I")
	private int anInt2296 = 0;

	@OriginalMember(owner = "client!gm", name = "Y", descriptor = "I")
	private int anInt2297 = 20;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V")
	public TextureOp12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt2298 = arg1.g2();
		} else if (arg0 == 1) {
			this.anInt2297 = arg1.g2();
		} else if (arg0 == 2) {
			this.anInt2296 = arg1.g2();
		} else if (arg0 == 3) {
			this.anInt2299 = arg1.g2();
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] method4626(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.aClass121_41.method3445(arg0);
		if (this.aClass121_41.aBoolean221) {
			for (@Pc(26) int local26 = 0; local26 < Static189.anInt4457; local26++) {
				@Pc(45) int local45 = this.anInt2299 + (Static64.anIntArray153[arg0] << 12) / this.anInt2298;
				@Pc(57) int local57 = this.anInt2296 + (Static173.anIntArray367[local26] << 12) / this.anInt2298;
				@Pc(61) int local61 = local57;
				@Pc(65) int local65 = local45;
				@Pc(67) int local67 = 0;
				@Pc(73) int local73 = local57 * local57 >> 12;
				@Pc(79) int local79 = local45 * local45 >> 12;
				while (local73 + local79 < 16384 && this.anInt2297 > local67) {
					local65 = (local61 * local65 >> 12) * 2 + local45;
					local67++;
					local61 = local73 + local57 - local79;
					local79 = local65 * local65 >> 12;
					local73 = local61 * local61 >> 12;
				}
				local19[local26] = local67 >= this.anInt2297 - 1 ? 0 : (local67 << 12) / this.anInt2297;
			}
		}
		return local19;
	}
}
