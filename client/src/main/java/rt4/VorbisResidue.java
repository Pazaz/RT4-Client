package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class VorbisResidue {

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	private final int type = VorbisSound.readBits(16);

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
	private final int begin = VorbisSound.readBits(24);

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
	private final int end = VorbisSound.readBits(24);

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
	private final int partitionSize = VorbisSound.readBits(24) + 1;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
	private final int classifications = VorbisSound.readBits(6) + 1;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
	private final int classBook = VorbisSound.readBits(8);

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "[I")
	private final int[] books;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
	public VorbisResidue() {
		@Pc(33) int[] local33 = new int[this.classifications];
		@Pc(35) int local35;
		for (local35 = 0; local35 < this.classifications; local35++) {
			@Pc(41) int local41 = 0;
			@Pc(44) int local44 = VorbisSound.readBits(3);
			@Pc(50) boolean local50 = VorbisSound.readBit() != 0;
			if (local50) {
				local41 = VorbisSound.readBits(5);
			}
			local33[local35] = local41 << 3 | local44;
		}
		this.books = new int[this.classifications * 8];
		for (local35 = 0; local35 < this.classifications * 8; local35++) {
			this.books[local35] = (local33[local35 >> 3] & 0x1 << (local35 & 0x7)) == 0 ? -1 : VorbisSound.readBits(8);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([FIZ)V")
	public final void synthesize(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		local1 = VorbisSound.codebooks[this.classBook].dimensions;
		@Pc(25) int local25 = this.end - this.begin;
		@Pc(30) int local30 = local25 / this.partitionSize;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(40) int local40 = 0;
			while (local40 < local30) {
				@Pc(51) int local51;
				@Pc(55) int local55;
				if (local35 == 0) {
					local51 = VorbisSound.codebooks[this.classBook].decodeScalar();
					for (local55 = local1 - 1; local55 >= 0; local55--) {
						if (local40 + local55 < local30) {
							local33[local40 + local55] = local51 % this.classifications;
						}
						local51 /= this.classifications;
					}
				}
				for (local51 = 0; local51 < local1; local51++) {
					local55 = local33[local40];
					@Pc(96) int local96 = this.books[local55 * 8 + local35];
					if (local96 >= 0) {
						@Pc(106) int local106 = this.begin + local40 * this.partitionSize;
						@Pc(110) VorbisCodebook local110 = VorbisSound.codebooks[local96];
						@Pc(119) int local119;
						if (this.type == 0) {
							local119 = this.partitionSize / local110.dimensions;
							for (@Pc(121) int local121 = 0; local121 < local119; local121++) {
								@Pc(127) float[] local127 = local110.decodeVq();
								for (@Pc(129) int local129 = 0; local129 < local110.dimensions; local129++) {
									arg0[local106 + local121 + local129 * local119] += local127[local129];
								}
							}
						} else {
							local119 = 0;
							while (local119 < this.partitionSize) {
								@Pc(162) float[] local162 = local110.decodeVq();
								for (@Pc(164) int local164 = 0; local164 < local110.dimensions; local164++) {
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
