package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Random;

@OriginalClass("client!ol")
public final class TextureOp28 extends TextureOp {

	@OriginalMember(owner = "client!ol", name = "gb", descriptor = "I")
	private int anInt4356;

	@OriginalMember(owner = "client!ol", name = "R", descriptor = "I")
	private int anInt4346 = 819;

	@OriginalMember(owner = "client!ol", name = "ab", descriptor = "I")
	private int anInt4351 = 0;

	@OriginalMember(owner = "client!ol", name = "Z", descriptor = "I")
	private int anInt4350 = 2048;

	@OriginalMember(owner = "client!ol", name = "T", descriptor = "I")
	private int anInt4347 = 1024;

	@OriginalMember(owner = "client!ol", name = "Q", descriptor = "I")
	private int anInt4345 = 1024;

	@OriginalMember(owner = "client!ol", name = "cb", descriptor = "I")
	private int anInt4353 = 409;

	@OriginalMember(owner = "client!ol", name = "kb", descriptor = "I")
	private int anInt4360 = 1024;

	@OriginalMember(owner = "client!ol", name = "P", descriptor = "I")
	private int anInt4344 = 1024;

	@OriginalMember(owner = "client!ol", name = "eb", descriptor = "I")
	private int anInt4354 = 0;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
	public TextureOp28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)V")
	@Override
	public final void postDecode() {
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.monochromeImageCache.get(arg0);
		if (!this.monochromeImageCache.invalid) {
			return local19;
		}
		@Pc(29) int[][] local29 = this.monochromeImageCache.method3446();
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) boolean local41 = true;
		@Pc(43) boolean local43 = true;
		@Pc(45) int local45 = 0;
		@Pc(47) int local47 = 0;
		@Pc(54) int local54 = Texture.width * this.anInt4345 >> 12;
		@Pc(61) int local61 = Texture.width * this.anInt4350 >> 12;
		@Pc(68) int local68 = this.anInt4346 * Texture.height >> 12;
		@Pc(75) int local75 = Texture.height * this.anInt4353 >> 12;
		if (local68 <= 1) {
			return local29[arg0];
		}
		@Pc(88) int local88 = Texture.width / local54 + 1;
		this.anInt4356 = Texture.width / 8 * this.anInt4347 >> 12;
		@Pc(102) int[][] local102 = new int[local88][3];
		@Pc(106) int[][] local106 = new int[local88][3];
		@Pc(113) Random local113 = new Random(this.anInt4354);
		while (true) {
			while (true) {
				@Pc(123) int local123 = local54 + RandomUtils.nextInt(local61 - local54, local113);
				@Pc(133) int local133 = RandomUtils.nextInt(local68 - local75, local113) + local75;
				@Pc(137) int local137 = local31 + local123;
				if (Texture.width < local137) {
					local137 = Texture.width;
					local123 = Texture.width - local31;
				}
				@Pc(158) int local158;
				@Pc(160) int local160;
				if (local43) {
					local158 = 0;
				} else {
					@Pc(150) int local150 = local39;
					@Pc(154) int[] local154 = local102[local39];
					local158 = local154[2];
					local160 = 0;
					@Pc(164) int local164 = local35 + local137;
					if (local164 < 0) {
						local164 += Texture.width;
					}
					if (Texture.width < local164) {
						local164 -= Texture.width;
					}
					while (true) {
						@Pc(186) int[] local186 = local102[local150];
						if (local164 >= local186[0] && local186[1] >= local164) {
							if (local39 != local150) {
								@Pc(224) int local224 = local35 + local31;
								if (local224 < 0) {
									local224 += Texture.width;
								}
								if (local224 > Texture.width) {
									local224 -= Texture.width;
								}
								@Pc(243) int local243;
								@Pc(258) int[] local258;
								for (local243 = 1; local243 <= local160; local243++) {
									local258 = local102[(local39 + local243) % local45];
									local158 = Math.max(local158, local258[2]);
								}
								for (local243 = 0; local243 <= local160; local243++) {
									local258 = local102[(local39 + local243) % local45];
									@Pc(285) int local285 = local258[2];
									if (local285 != local158) {
										@Pc(297) int local297 = local258[0];
										@Pc(301) int local301 = local258[1];
										@Pc(312) int local312;
										@Pc(316) int local316;
										if (local164 > local224) {
											local312 = Math.max(local224, local297);
											local316 = Math.min(local164, local301);
										} else if (local297 == 0) {
											local316 = Math.min(local164, local301);
											local312 = 0;
										} else {
											local312 = Math.max(local224, local297);
											local316 = Texture.width;
										}
										this.method3386(local285, local113, local33 + local312, -local312 + local316, local158 - local285, local29);
									}
								}
							}
							local39 = local150;
							break;
						}
						local160++;
						local150++;
						if (local150 >= local45) {
							local150 = 0;
						}
					}
				}
				if (Texture.height >= local158 + local133) {
					local41 = false;
				} else {
					local133 = Texture.height - local158;
				}
				@Pc(407) int[] local407;
				if (local137 == Texture.width) {
					this.method3386(local158, local113, local37 + local31, local123, local133, local29);
					if (local41) {
						return local19;
					}
					local41 = true;
					local33 = local37;
					local43 = false;
					local407 = local106[local47++];
					local407[0] = local31;
					local39 = 0;
					local45 = local47;
					local47 = 0;
					local407[2] = local133 + local158;
					local407[1] = local137;
					local37 = RandomUtils.nextInt(Texture.width, local113);
					local35 = local37 - local33;
					@Pc(439) int[][] local439 = local102;
					local31 = 0;
					local102 = local106;
					local160 = local35;
					if (local35 < 0) {
						local160 = local35 + Texture.width;
					}
					local106 = local439;
					if (Texture.width < local160) {
						local160 -= Texture.width;
					}
					while (true) {
						@Pc(469) int[] local469 = local102[local39];
						if (local469[0] <= local160 && local469[1] >= local160) {
							break;
						}
						local39++;
						if (local45 <= local39) {
							local39 = 0;
						}
					}
				} else {
					local407 = local106[local47++];
					local407[1] = local137;
					local407[2] = local133 + local158;
					local407[0] = local31;
					this.method3386(local158, local113, local31 + local37, local123, local133, local29);
					local31 = local137;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILjava/util/Random;IIBI[[I)V")
	private void method3386(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(26) int local26 = this.anInt4360 > 0 ? 4096 - RandomUtils.nextInt(this.anInt4360, arg1) : 4096;
		@Pc(34) int local34 = this.anInt4344 * this.anInt4356 >> 12;
		@Pc(47) int local47 = this.anInt4356 - (local34 > 0 ? RandomUtils.nextInt(local34, arg1) : 0);
		if (Texture.width <= arg2) {
			arg2 -= Texture.width;
		}
		@Pc(68) int local68;
		@Pc(72) int local72;
		if (local47 > 0) {
			if (arg4 <= 0 || arg3 <= 0) {
				return;
			}
			local68 = arg3 / 2;
			local72 = arg4 / 2;
			@Pc(79) int local79 = local68 < local47 ? local68 : local47;
			@Pc(90) int local90 = local72 >= local47 ? local47 : local72;
			@Pc(97) int local97 = arg3 - local79 * 2;
			@Pc(101) int local101 = local79 + arg2;
			for (@Pc(103) int local103 = 0; local103 < arg4; local103++) {
				@Pc(112) int[] local112 = arg5[arg0 + local103];
				@Pc(125) int local125;
				@Pc(133) int local133;
				@Pc(142) int local142;
				if (local103 < local90) {
					local125 = local103 * local26 / local90;
					if (this.anInt4351 == 0) {
						for (local133 = 0; local133 < local79; local133++) {
							local142 = local133 * local26 / local79;
							local112[Texture.widthMask & local133 + arg2] = local112[arg3 + arg2 - local133 - 1 & Texture.widthMask] = local142 * local125 >> 12;
						}
					} else {
						for (local133 = 0; local133 < local79; local133++) {
							local142 = local133 * local26 / local79;
							local112[Texture.widthMask & arg2 + local133] = local112[Texture.widthMask & arg3 + arg2 - local133 - 1] = local125 <= local142 ? local125 : local142;
						}
					}
					if (Texture.width >= local97 + local101) {
						ArrayUtils.fill(local112, local101, local97, local125);
					} else {
						local133 = Texture.width - local101;
						ArrayUtils.fill(local112, local101, local133, local125);
						ArrayUtils.fill(local112, 0, local97 - local133, local125);
					}
				} else {
					local125 = arg4 - local103 - 1;
					if (local125 >= local90) {
						for (local133 = 0; local133 < local79; local133++) {
							local112[Texture.widthMask & arg2 + local133] = local112[arg2 + arg3 - local133 - 1 & Texture.widthMask] = local26 * local133 / local79;
						}
						if (local101 + local97 > Texture.width) {
							local133 = Texture.width - local101;
							ArrayUtils.fill(local112, local101, local133, local26);
							ArrayUtils.fill(local112, 0, local97 - local133, local26);
						} else {
							ArrayUtils.fill(local112, local101, local97, local26);
						}
					} else {
						local133 = local125 * local26 / local90;
						@Pc(288) int local288;
						if (this.anInt4351 == 0) {
							for (local142 = 0; local142 < local79; local142++) {
								local288 = local26 * local142 / local79;
								local112[Texture.widthMask & arg2 + local142] = local112[Texture.widthMask & arg2 + arg3 - local142 - 1] = local288 * local133 >> 12;
							}
						} else {
							for (local142 = 0; local142 < local79; local142++) {
								local288 = local142 * local26 / local79;
								local112[arg2 + local142 & Texture.widthMask] = local112[arg3 + arg2 - local142 - 1 & Texture.widthMask] = local133 <= local288 ? local133 : local288;
							}
						}
						if (local97 + local101 > Texture.width) {
							local142 = Texture.width - local101;
							ArrayUtils.fill(local112, local101, local142, local133);
							ArrayUtils.fill(local112, 0, local97 - local142, local133);
						} else {
							ArrayUtils.fill(local112, local101, local97, local133);
						}
					}
				}
			}
		} else if (Texture.width >= arg2 + arg3) {
			for (local68 = 0; local68 < arg4; local68++) {
				ArrayUtils.fill(arg5[arg0 + local68], arg2, arg3, local26);
			}
		} else {
			local68 = Texture.width - arg2;
			for (local72 = 0; local72 < arg4; local72++) {
				@Pc(522) int[] local522 = arg5[local72 + arg0];
				ArrayUtils.fill(local522, arg2, local68, local26);
				ArrayUtils.fill(local522, 0, arg3 - local68, local26);
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt4354 = arg1.g1();
		} else if (arg0 == 1) {
			this.anInt4345 = arg1.g2();
		} else if (arg0 == 2) {
			this.anInt4350 = arg1.g2();
		} else if (arg0 == 3) {
			this.anInt4353 = arg1.g2();
		} else if (arg0 == 4) {
			this.anInt4346 = arg1.g2();
		} else if (arg0 == 5) {
			this.anInt4347 = arg1.g2();
		} else if (arg0 == 6) {
			this.anInt4351 = arg1.g1();
		} else if (arg0 == 7) {
			this.anInt4344 = arg1.g2();
		} else if (arg0 == 8) {
			this.anInt4360 = arg1.g2();
		}
	}
}
