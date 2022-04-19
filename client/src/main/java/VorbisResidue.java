import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class VorbisResidue {

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	private final int anInt5679 = Static117.method2350(16);

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
	private final int anInt5678 = Static117.method2350(24);

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
	private final int anInt5680 = Static117.method2350(24);

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
	private final int anInt5681 = Static117.method2350(24) + 1;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
	private final int anInt5682 = Static117.method2350(6) + 1;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
	private final int anInt5677 = Static117.method2350(8);

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "[I")
	private final int[] anIntArray511;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
	public VorbisResidue() {
		@Pc(33) int[] local33 = new int[this.anInt5682];
		@Pc(35) int local35;
		for (local35 = 0; local35 < this.anInt5682; local35++) {
			@Pc(41) int local41 = 0;
			@Pc(44) int local44 = Static117.method2350(3);
			@Pc(50) boolean local50 = Static117.method2346() != 0;
			if (local50) {
				local41 = Static117.method2350(5);
			}
			local33[local35] = local41 << 3 | local44;
		}
		this.anIntArray511 = new int[this.anInt5682 * 8];
		for (local35 = 0; local35 < this.anInt5682 * 8; local35++) {
			this.anIntArray511[local35] = (local33[local35 >> 3] & 0x1 << (local35 & 0x7)) == 0 ? -1 : Static117.method2350(8);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([FIZ)V")
	public final void method4450(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		local1 = Static117.aClass78Array1[this.anInt5677].anInt3055;
		@Pc(25) int local25 = this.anInt5680 - this.anInt5678;
		@Pc(30) int local30 = local25 / this.anInt5681;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(40) int local40 = 0;
			while (local40 < local30) {
				@Pc(51) int local51;
				@Pc(55) int local55;
				if (local35 == 0) {
					local51 = Static117.aClass78Array1[this.anInt5677].method2415();
					for (local55 = local1 - 1; local55 >= 0; local55--) {
						if (local40 + local55 < local30) {
							local33[local40 + local55] = local51 % this.anInt5682;
						}
						local51 /= this.anInt5682;
					}
				}
				for (local51 = 0; local51 < local1; local51++) {
					local55 = local33[local40];
					@Pc(96) int local96 = this.anIntArray511[local55 * 8 + local35];
					if (local96 >= 0) {
						@Pc(106) int local106 = this.anInt5678 + local40 * this.anInt5681;
						@Pc(110) VorbisCodebook local110 = Static117.aClass78Array1[local96];
						@Pc(119) int local119;
						if (this.anInt5679 == 0) {
							local119 = this.anInt5681 / local110.anInt3055;
							for (@Pc(121) int local121 = 0; local121 < local119; local121++) {
								@Pc(127) float[] local127 = local110.method2413();
								for (@Pc(129) int local129 = 0; local129 < local110.anInt3055; local129++) {
									arg0[local106 + local121 + local129 * local119] += local127[local129];
								}
							}
						} else {
							local119 = 0;
							while (local119 < this.anInt5681) {
								@Pc(162) float[] local162 = local110.method2413();
								for (@Pc(164) int local164 = 0; local164 < local110.anInt3055; local164++) {
									arg0[local106 + local119] += local162[local164];
									local119++;
								}
							}
						}
					}
					local40++;
					if (local40 >= local30) {
						break;
					}
				}
			}
		}
	}
}
