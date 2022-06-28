package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class HuffmanCodec {

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "[I")
	private int[] symbolTree;

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "[I")
	private final int[] codewords;

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "[B")
	private final byte[] bits;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "([B)V")
	public HuffmanCodec(@OriginalArg(0) byte[] bits) {
		@Pc(6) int[] nextCodewords = new int[33];
		@Pc(9) int symbols = bits.length;
		this.symbolTree = new int[8];
		this.codewords = new int[symbols];
		this.bits = bits;
		@Pc(22) int nextNode = 0;
		for (@Pc(24) int symbol = 0; symbol < symbols; symbol++) {
			@Pc(35) byte codewordBits = bits[symbol];
			if (codewordBits != 0) {
				@Pc(49) int bit = 0x1 << 32 - codewordBits;
				@Pc(53) int codeword = nextCodewords[codewordBits];
				this.codewords[symbol] = codeword;
				@Pc(121) int local121;
				@Pc(67) int local67;
				@Pc(76) int local76;
				@Pc(92) int local92;
				if ((codeword & bit) == 0) {
					for (local67 = codewordBits - 1; local67 >= 1; local67--) {
						local76 = nextCodewords[local67];
						if (codeword != local76) {
							break;
						}
						local92 = 0x1 << 32 - local67;
						if ((local76 & local92) != 0) {
							nextCodewords[local67] = nextCodewords[local67 - 1];
							break;
						}
						nextCodewords[local67] = local92 | local76;
					}
					local121 = codeword | bit;
				} else {
					local121 = nextCodewords[codewordBits - 1];
				}
				nextCodewords[codewordBits] = local121;
				for (local67 = codewordBits + 1; local67 <= 32; local67++) {
					if (codeword == nextCodewords[local67]) {
						nextCodewords[local67] = local121;
					}
				}
				local67 = 0;
				for (local76 = 0; local76 < codewordBits; local76++) {
					local92 = Integer.MIN_VALUE >>> local76;
					if ((codeword & local92) == 0) {
						local67++;
					} else {
						if (this.symbolTree[local67] == 0) {
							this.symbolTree[local67] = nextNode;
						}
						local67 = this.symbolTree[local67];
					}
					if (this.symbolTree.length <= local67) {
						@Pc(206) int[] local206 = new int[this.symbolTree.length * 2];
						for (@Pc(208) int local208 = 0; local208 < this.symbolTree.length; local208++) {
							local206[local208] = this.symbolTree[local208];
						}
						this.symbolTree = local206;
					}
				}
				this.symbolTree[local67] = ~symbol;
				if (local67 >= nextNode) {
					nextNode = local67 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II[B[BII)I")
	public final int encode(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg4 << 3;
		while (local5 > arg3) {
			@Pc(24) int local24 = arg2[arg3] & 0xFF;
			@Pc(29) int local29 = this.codewords[local24];
			@Pc(34) byte local34 = this.bits[local24];
			if (local34 == 0) {
				throw new RuntimeException("No codeword for data value " + local24);
			}
			@Pc(54) int local54 = local15 >> 3;
			@Pc(58) int local58 = local15 & 0x7;
			local15 += local34;
			@Pc(72) int local72 = local54 + (local58 + local34 - 1 >> 3);
			local11 &= -local58 >> 31;
			@Pc(80) int local80 = local58 + 24;
			arg1[local54] = (byte) (local11 |= local29 >>> local80);
			if (local54 < local72) {
				local54++;
				local58 = local80 - 8;
				arg1[local54] = (byte) (local11 = local29 >>> local58);
				if (local54 < local72) {
					local58 -= 8;
					local54++;
					arg1[local54] = (byte) (local11 = local29 >>> local58);
					if (local72 > local54) {
						local58 -= 8;
						local54++;
						arg1[local54] = (byte) (local11 = local29 >>> local58);
						if (local72 > local54) {
							local54++;
							local58 -= 8;
							arg1[local54] = (byte) (local11 = local29 << -local58);
						}
					}
				}
			}
			arg3++;
		}
		return (local15 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II[BI[BI)I")
	public final int decode(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = arg1;
		@Pc(21) int local21 = arg4;
		while (true) {
			@Pc(25) byte local25 = arg3[local21];
			if (local25 < 0) {
				local15 = this.symbolTree[local15];
			} else {
				local15++;
			}
			@Pc(41) int local41;
			if ((local41 = this.symbolTree[local15]) < 0) {
				arg2[arg0++] = (byte) ~local41;
				if (arg0 >= local19) {
					break;
				}
				local15 = 0;
			}
			if ((local25 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.symbolTree[local15];
			}
			@Pc(78) int local78;
			if ((local78 = this.symbolTree[local15]) < 0) {
				arg2[arg0++] = (byte) ~local78;
				if (local19 <= arg0) {
					break;
				}
				local15 = 0;
			}
			if ((local25 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.symbolTree[local15];
			}
			@Pc(118) int local118;
			if ((local118 = this.symbolTree[local15]) < 0) {
				arg2[arg0++] = (byte) ~local118;
				if (local19 <= arg0) {
					break;
				}
				local15 = 0;
			}
			if ((local25 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.symbolTree[local15];
			}
			@Pc(156) int local156;
			if ((local156 = this.symbolTree[local15]) < 0) {
				arg2[arg0++] = (byte) ~local156;
				if (arg0 >= local19) {
					break;
				}
				local15 = 0;
			}
			if ((local25 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.symbolTree[local15];
			}
			@Pc(195) int local195;
			if ((local195 = this.symbolTree[local15]) < 0) {
				arg2[arg0++] = (byte) ~local195;
				if (local19 <= arg0) {
					break;
				}
				local15 = 0;
			}
			if ((local25 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.symbolTree[local15];
			}
			@Pc(233) int local233;
			if ((local233 = this.symbolTree[local15]) < 0) {
				arg2[arg0++] = (byte) ~local233;
				if (arg0 >= local19) {
					break;
				}
				local15 = 0;
			}
			if ((local25 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.symbolTree[local15];
			}
			@Pc(276) int local276;
			if ((local276 = this.symbolTree[local15]) < 0) {
				arg2[arg0++] = (byte) ~local276;
				if (arg0 >= local19) {
					break;
				}
				local15 = 0;
			}
			if ((local25 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.symbolTree[local15];
			}
			@Pc(318) int local318;
			if ((local318 = this.symbolTree[local15]) < 0) {
				arg2[arg0++] = (byte) ~local318;
				if (arg0 >= local19) {
					break;
				}
				local15 = 0;
			}
			local21++;
		}
		return local21 + 1 - arg4;
	}
}
