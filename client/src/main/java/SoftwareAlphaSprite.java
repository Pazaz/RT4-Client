import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class SoftwareAlphaSprite extends SoftwareSprite {

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(IIIIII[I)V")
	public SoftwareAlphaSprite(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIIDI)V")
	@Override
	public final void method306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(6) double arg2) {
		try {
			@Pc(15) int local15 = (int) (Math.sin(arg2) * 65536.0D);
			@Pc(21) int local21 = (int) (Math.cos(arg2) * 65536.0D);
			@Pc(27) int local27 = local15 * 256 >> 8;
			@Pc(33) int local33 = local21 * 256 >> 8;
			@Pc(45) int local45 = local27 * -10 + local33 * -10 + 983040;
			@Pc(57) int local57 = local33 * -10 + 983040 - local27 * -10;
			@Pc(63) int local63 = arg0 + arg1 * Static129.anInt3144;
			for (@Pc(65) int local65 = 0; local65 < 20; local65++) {
				@Pc(70) int local70 = local63;
				@Pc(72) int local72 = local45;
				@Pc(74) int local74 = local57;
				for (@Pc(77) int local77 = -20; local77 < 0; local77++) {
					@Pc(93) int local93 = this.anIntArray20[(local72 >> 16) + (local74 >> 16) * this.anInt1867];
					@Pc(97) int local97 = Static129.anIntArray297[local70];
					@Pc(101) int local101 = local93 >>> 24;
					@Pc(105) int local105 = 256 - local101;
					Static129.anIntArray297[local70++] = ((local93 & 0xFF00FF) * local101 + (local97 & 0xFF00FF) * local105 & 0xFF00FF00) + ((local93 & 0xFF00) * local101 + (local97 & 0xFF00) * local105 & 0xFF0000) >>> 8;
					local72 += local33;
					local74 -= local27;
				}
				local45 += local27;
				local57 += local33;
				local63 += Static129.anInt3144;
			}
		} catch (@Pc(164) Exception local164) {
		}
	}

	@OriginalMember(owner = "client!am", name = "e", descriptor = "(II)V")
	@Override
	public final void method1423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt1863;
		arg1 += this.anInt1861;
		@Pc(15) int local15 = arg0 + arg1 * Static129.anInt3144;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt1859;
		@Pc(23) int local23 = this.anInt1867;
		@Pc(27) int local27 = Static129.anInt3144 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static129.anInt3147) {
			local36 = Static129.anInt3147 - arg1;
			local20 -= local36;
			arg1 = Static129.anInt3147;
			local17 = local36 * local23;
			local15 += local36 * Static129.anInt3144;
		}
		if (arg1 + local20 > Static129.anInt3149) {
			local20 -= arg1 + local20 - Static129.anInt3149;
		}
		if (arg0 < Static129.anInt3145) {
			local36 = Static129.anInt3145 - arg0;
			local23 -= local36;
			arg0 = Static129.anInt3145;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static129.anInt3148) {
			local36 = arg0 + local23 - Static129.anInt3148;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static283.method319(Static129.anIntArray297, this.anIntArray20, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(II)V")
	@Override
	public final void method1415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt1863;
		arg1 += this.anInt1861;
		@Pc(15) int local15 = arg0 + arg1 * Static129.anInt3144;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt1859;
		@Pc(23) int local23 = this.anInt1867;
		@Pc(27) int local27 = Static129.anInt3144 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static129.anInt3147) {
			local36 = Static129.anInt3147 - arg1;
			local20 -= local36;
			arg1 = Static129.anInt3147;
			local17 = local36 * local23;
			local15 += local36 * Static129.anInt3144;
		}
		if (arg1 + local20 > Static129.anInt3149) {
			local20 -= arg1 + local20 - Static129.anInt3149;
		}
		if (arg0 < Static129.anInt3145) {
			local36 = Static129.anInt3145 - arg0;
			local23 -= local36;
			arg0 = Static129.anInt3145;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static129.anInt3148) {
			local36 = arg0 + local23 - Static129.anInt3148;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static283.method319(Static129.anIntArray297, this.anIntArray20, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIII)V")
	@Override
	protected final void method1416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg5 == 0) {
			return;
		}
		@Pc(9) int local9 = arg0 - (this.anInt1863 << 4);
		@Pc(16) int local16 = arg1 - (this.anInt1861 << 4);
		@Pc(23) double local23 = (double) (arg4 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(33) int local33 = (int) Math.floor(Math.sin(local23) * (double) arg5 + 0.5D);
		@Pc(43) int local43 = (int) Math.floor(Math.cos(local23) * (double) arg5 + 0.5D);
		@Pc(53) int local53 = -local9 * local43 + -local16 * local33;
		@Pc(64) int local64 = --local9 * local33 + -local16 * local43;
		@Pc(78) int local78 = ((this.anInt1867 << 4) - local9) * local43 + -local16 * local33;
		@Pc(93) int local93 = -((this.anInt1867 << 4) - local9) * local33 + -local16 * local43;
		@Pc(107) int local107 = -local9 * local43 + ((this.anInt1859 << 4) - local16) * local33;
		@Pc(122) int local122 = --local9 * local33 + ((this.anInt1859 << 4) - local16) * local43;
		@Pc(140) int local140 = ((this.anInt1867 << 4) - local9) * local43 + ((this.anInt1859 << 4) - local16) * local33;
		@Pc(159) int local159 = -((this.anInt1867 << 4) - local9) * local33 + ((this.anInt1859 << 4) - local16) * local43;
		@Pc(164) int local164;
		@Pc(166) int local166;
		if (local53 < local78) {
			local164 = local53;
			local166 = local78;
		} else {
			local164 = local78;
			local166 = local53;
		}
		if (local107 < local164) {
			local164 = local107;
		}
		if (local140 < local164) {
			local164 = local140;
		}
		if (local107 > local166) {
			local166 = local107;
		}
		if (local140 > local166) {
			local166 = local140;
		}
		@Pc(196) int local196;
		@Pc(198) int local198;
		if (local64 < local93) {
			local196 = local64;
			local198 = local93;
		} else {
			local196 = local93;
			local198 = local64;
		}
		if (local122 < local196) {
			local196 = local122;
		}
		if (local159 < local196) {
			local196 = local159;
		}
		if (local122 > local198) {
			local198 = local122;
		}
		if (local159 > local198) {
			local198 = local159;
		}
		local164 >>= 0xC;
		local166 = local166 + 4095 >> 12;
		local196 >>= 0xC;
		local198 = local198 + 4095 >> 12;
		local164 += arg2;
		local166 += arg2;
		local196 += arg3;
		local198 += arg3;
		local164 >>= 0x4;
		local166 = local166 + 15 >> 4;
		local196 >>= 0x4;
		local198 = local198 + 15 >> 4;
		if (local164 < Static129.anInt3145) {
			local164 = Static129.anInt3145;
		}
		if (local166 > Static129.anInt3148) {
			local166 = Static129.anInt3148;
		}
		if (local196 < Static129.anInt3147) {
			local196 = Static129.anInt3147;
		}
		if (local198 > Static129.anInt3149) {
			local198 = Static129.anInt3149;
		}
		local166 = local164 - local166;
		if (local166 >= 0) {
			return;
		}
		local198 = local196 - local198;
		if (local198 >= 0) {
			return;
		}
		@Pc(319) int local319 = local196 * Static129.anInt3144 + local164;
		@Pc(324) double local324 = 1.6777216E7D / (double) arg5;
		@Pc(333) int local333 = (int) Math.floor(Math.sin(local23) * local324 + 0.5D);
		@Pc(342) int local342 = (int) Math.floor(Math.cos(local23) * local324 + 0.5D);
		@Pc(350) int local350 = (local164 << 4) + 8 - arg2;
		@Pc(358) int local358 = (local196 << 4) + 8 - arg3;
		@Pc(368) int local368 = (local9 << 8) - (local358 * local333 >> 4);
		@Pc(378) int local378 = (local16 << 8) + (local358 * local342 >> 4);
		@Pc(384) int local384;
		@Pc(388) int local388;
		@Pc(504) int local504;
		@Pc(394) int local394;
		@Pc(432) int local432;
		@Pc(436) int local436;
		@Pc(440) int local440;
		@Pc(444) int local444;
		@Pc(532) int local532;
		if (local342 != 0) {
			@Pc(802) int local802;
			if (local342 < 0) {
				if (local333 == 0) {
					local384 = local198;
					while (local384 < 0) {
						local388 = local319;
						local802 = local368 + (local350 * local342 >> 4);
						local394 = local166;
						if (local378 >= 0 && local378 - (this.anInt1859 << 12) < 0) {
							@Pc(825) int local825;
							if ((local825 = local802 - (this.anInt1867 << 12)) >= 0) {
								local532 = (local342 - local825) / local342;
								local394 = local166 + local532;
								local802 += local342 * local532;
								local388 = local319 + local532;
							}
							@Pc(853) int local853;
							if ((local853 = (local802 - local342) / local342) > local394) {
								local394 = local853;
							}
							while (local394 < 0) {
								local432 = this.anIntArray20[(local378 >> 12) * this.anInt1867 + (local802 >> 12)];
								local436 = Static129.anIntArray297[local388];
								local440 = local432 >>> 24;
								local444 = 256 - local440;
								Static129.anIntArray297[local388++] = ((local432 & 0xFF00FF) * local440 + (local436 & 0xFF00FF) * local444 & 0xFF00FF00) + ((local432 & 0xFF00) * local440 + (local436 & 0xFF00) * local444 & 0xFF0000) >>> 8;
								local802 += local342;
								local394++;
							}
						}
						local384++;
						local378 += local342;
						local319 += Static129.anInt3144;
					}
				} else if (local333 < 0) {
					local384 = local198;
					while (local384 < 0) {
						local388 = local319;
						local802 = local368 + (local350 * local342 >> 4);
						local504 = local378 + (local350 * local333 >> 4);
						local394 = local166;
						@Pc(969) int local969;
						if ((local969 = local802 - (this.anInt1867 << 12)) >= 0) {
							local532 = (local342 - local969) / local342;
							local394 = local166 + local532;
							local802 += local342 * local532;
							local504 += local333 * local532;
							local388 = local319 + local532;
						}
						@Pc(1003) int local1003;
						if ((local1003 = (local802 - local342) / local342) > local394) {
							local394 = local1003;
						}
						@Pc(1015) int local1015;
						if ((local1015 = local504 - (this.anInt1859 << 12)) >= 0) {
							local532 = (local333 - local1015) / local333;
							local394 += local532;
							local802 += local342 * local532;
							local504 += local333 * local532;
							local388 += local532;
						}
						@Pc(1049) int local1049;
						if ((local1049 = (local504 - local333) / local333) > local394) {
							local394 = local1049;
						}
						while (local394 < 0) {
							local432 = this.anIntArray20[(local504 >> 12) * this.anInt1867 + (local802 >> 12)];
							local436 = Static129.anIntArray297[local388];
							local440 = local432 >>> 24;
							local444 = 256 - local440;
							Static129.anIntArray297[local388++] = ((local432 & 0xFF00FF) * local440 + (local436 & 0xFF00FF) * local444 & 0xFF00FF00) + ((local432 & 0xFF00) * local440 + (local436 & 0xFF00) * local444 & 0xFF0000) >>> 8;
							local802 += local342;
							local504 += local333;
							local394++;
						}
						local384++;
						local368 -= local333;
						local378 += local342;
						local319 += Static129.anInt3144;
					}
				} else {
					local384 = local198;
					while (local384 < 0) {
						local388 = local319;
						local802 = local368 + (local350 * local342 >> 4);
						local504 = local378 + (local350 * local333 >> 4);
						local394 = local166;
						@Pc(1171) int local1171;
						if ((local1171 = local802 - (this.anInt1867 << 12)) >= 0) {
							local532 = (local342 - local1171) / local342;
							local394 = local166 + local532;
							local802 += local342 * local532;
							local504 += local333 * local532;
							local388 = local319 + local532;
						}
						@Pc(1205) int local1205;
						if ((local1205 = (local802 - local342) / local342) > local394) {
							local394 = local1205;
						}
						if (local504 < 0) {
							local532 = (local333 - local504 - 1) / local333;
							local394 += local532;
							local802 += local342 * local532;
							local504 += local333 * local532;
							local388 += local532;
						}
						@Pc(1253) int local1253;
						if ((local1253 = (local504 + 1 - (this.anInt1859 << 12) - local333) / local333) > local394) {
							local394 = local1253;
						}
						while (local394 < 0) {
							local432 = this.anIntArray20[(local504 >> 12) * this.anInt1867 + (local802 >> 12)];
							local436 = Static129.anIntArray297[local388];
							local440 = local432 >>> 24;
							local444 = 256 - local440;
							Static129.anIntArray297[local388++] = ((local432 & 0xFF00FF) * local440 + (local436 & 0xFF00FF) * local444 & 0xFF00FF00) + ((local432 & 0xFF00) * local440 + (local436 & 0xFF00) * local444 & 0xFF0000) >>> 8;
							local802 += local342;
							local504 += local333;
							local394++;
						}
						local384++;
						local368 -= local333;
						local378 += local342;
						local319 += Static129.anInt3144;
					}
				}
			} else if (local333 == 0) {
				local384 = local198;
				while (local384 < 0) {
					local388 = local319;
					local802 = local368 + (local350 * local342 >> 4);
					local394 = local166;
					if (local378 >= 0 && local378 - (this.anInt1859 << 12) < 0) {
						if (local802 < 0) {
							local532 = (local342 - local802 - 1) / local342;
							local394 = local166 + local532;
							local802 += local342 * local532;
							local388 = local319 + local532;
						}
						@Pc(1412) int local1412;
						if ((local1412 = (local802 + 1 - (this.anInt1867 << 12) - local342) / local342) > local394) {
							local394 = local1412;
						}
						while (local394 < 0) {
							local432 = this.anIntArray20[(local378 >> 12) * this.anInt1867 + (local802 >> 12)];
							local436 = Static129.anIntArray297[local388];
							local440 = local432 >>> 24;
							local444 = 256 - local440;
							Static129.anIntArray297[local388++] = ((local432 & 0xFF00FF) * local440 + (local436 & 0xFF00FF) * local444 & 0xFF00FF00) + ((local432 & 0xFF00) * local440 + (local436 & 0xFF00) * local444 & 0xFF0000) >>> 8;
							local802 += local342;
							local394++;
						}
					}
					local384++;
					local378 += local342;
					local319 += Static129.anInt3144;
				}
			} else if (local333 < 0) {
				local384 = local198;
				while (local384 < 0) {
					local388 = local319;
					local802 = local368 + (local350 * local342 >> 4);
					local504 = local378 + (local350 * local333 >> 4);
					local394 = local166;
					if (local802 < 0) {
						local532 = (local342 - local802 - 1) / local342;
						local394 = local166 + local532;
						local802 += local342 * local532;
						local504 += local333 * local532;
						local388 = local319 + local532;
					}
					@Pc(1564) int local1564;
					if ((local1564 = (local802 + 1 - (this.anInt1867 << 12) - local342) / local342) > local394) {
						local394 = local1564;
					}
					@Pc(1576) int local1576;
					if ((local1576 = local504 - (this.anInt1859 << 12)) >= 0) {
						local532 = (local333 - local1576) / local333;
						local394 += local532;
						local802 += local342 * local532;
						local504 += local333 * local532;
						local388 += local532;
					}
					@Pc(1610) int local1610;
					if ((local1610 = (local504 - local333) / local333) > local394) {
						local394 = local1610;
					}
					while (local394 < 0) {
						local432 = this.anIntArray20[(local504 >> 12) * this.anInt1867 + (local802 >> 12)];
						local436 = Static129.anIntArray297[local388];
						local440 = local432 >>> 24;
						local444 = 256 - local440;
						Static129.anIntArray297[local388++] = ((local432 & 0xFF00FF) * local440 + (local436 & 0xFF00FF) * local444 & 0xFF00FF00) + ((local432 & 0xFF00) * local440 + (local436 & 0xFF00) * local444 & 0xFF0000) >>> 8;
						local802 += local342;
						local504 += local333;
						local394++;
					}
					local384++;
					local368 -= local333;
					local378 += local342;
					local319 += Static129.anInt3144;
				}
			} else {
				local384 = local198;
				while (local384 < 0) {
					local388 = local319;
					local802 = local368 + (local350 * local342 >> 4);
					local504 = local378 + (local350 * local333 >> 4);
					local394 = local166;
					if (local802 < 0) {
						local532 = (local342 - local802 - 1) / local342;
						local394 = local166 + local532;
						local802 += local342 * local532;
						local504 += local333 * local532;
						local388 = local319 + local532;
					}
					@Pc(1768) int local1768;
					if ((local1768 = (local802 + 1 - (this.anInt1867 << 12) - local342) / local342) > local394) {
						local394 = local1768;
					}
					if (local504 < 0) {
						local532 = (local333 - local504 - 1) / local333;
						local394 += local532;
						local802 += local342 * local532;
						local504 += local333 * local532;
						local388 += local532;
					}
					@Pc(1816) int local1816;
					if ((local1816 = (local504 + 1 - (this.anInt1859 << 12) - local333) / local333) > local394) {
						local394 = local1816;
					}
					while (local394 < 0) {
						local432 = this.anIntArray20[(local504 >> 12) * this.anInt1867 + (local802 >> 12)];
						local436 = Static129.anIntArray297[local388];
						local440 = local432 >>> 24;
						local444 = 256 - local440;
						Static129.anIntArray297[local388++] = ((local432 & 0xFF00FF) * local440 + (local436 & 0xFF00FF) * local444 & 0xFF00FF00) + ((local432 & 0xFF00) * local440 + (local436 & 0xFF00) * local444 & 0xFF0000) >>> 8;
						local802 += local342;
						local504 += local333;
						local394++;
					}
					local384++;
					local368 -= local333;
					local378 += local342;
					local319 += Static129.anInt3144;
				}
			}
		} else if (local333 == 0) {
			local384 = local198;
			while (local384 < 0) {
				local388 = local319;
				local394 = local166;
				if (local368 >= 0 && local378 >= 0 && local368 - (this.anInt1867 << 12) < 0 && local378 - (this.anInt1859 << 12) < 0) {
					while (local394 < 0) {
						local432 = this.anIntArray20[(local378 >> 12) * this.anInt1867 + (local368 >> 12)];
						local436 = Static129.anIntArray297[local388];
						local440 = local432 >>> 24;
						local444 = 256 - local440;
						Static129.anIntArray297[local388++] = ((local432 & 0xFF00FF) * local440 + (local436 & 0xFF00FF) * local444 & 0xFF00FF00) + ((local432 & 0xFF00) * local440 + (local436 & 0xFF00) * local444 & 0xFF0000) >>> 8;
						local394++;
					}
				}
				local384++;
				local319 += Static129.anInt3144;
			}
		} else if (local333 < 0) {
			local384 = local198;
			while (local384 < 0) {
				local388 = local319;
				local504 = local378 + (local350 * local333 >> 4);
				local394 = local166;
				if (local368 >= 0 && local368 - (this.anInt1867 << 12) < 0) {
					@Pc(525) int local525;
					if ((local525 = local504 - (this.anInt1859 << 12)) >= 0) {
						local532 = (local333 - local525) / local333;
						local394 = local166 + local532;
						local504 += local333 * local532;
						local388 = local319 + local532;
					}
					@Pc(553) int local553;
					if ((local553 = (local504 - local333) / local333) > local394) {
						local394 = local553;
					}
					while (local394 < 0) {
						local432 = this.anIntArray20[(local504 >> 12) * this.anInt1867 + (local368 >> 12)];
						local436 = Static129.anIntArray297[local388];
						local440 = local432 >>> 24;
						local444 = 256 - local440;
						Static129.anIntArray297[local388++] = ((local432 & 0xFF00FF) * local440 + (local436 & 0xFF00FF) * local444 & 0xFF00FF00) + ((local432 & 0xFF00) * local440 + (local436 & 0xFF00) * local444 & 0xFF0000) >>> 8;
						local504 += local333;
						local394++;
					}
				}
				local384++;
				local368 -= local333;
				local319 += Static129.anInt3144;
			}
		} else {
			local384 = local198;
			while (local384 < 0) {
				local388 = local319;
				local504 = local378 + (local350 * local333 >> 4);
				local394 = local166;
				if (local368 >= 0 && local368 - (this.anInt1867 << 12) < 0) {
					if (local504 < 0) {
						local532 = (local333 - local504 - 1) / local333;
						local394 = local166 + local532;
						local504 += local333 * local532;
						local388 = local319 + local532;
					}
					@Pc(702) int local702;
					if ((local702 = (local504 + 1 - (this.anInt1859 << 12) - local333) / local333) > local394) {
						local394 = local702;
					}
					while (local394 < 0) {
						local432 = this.anIntArray20[(local504 >> 12) * this.anInt1867 + (local368 >> 12)];
						local436 = Static129.anIntArray297[local388];
						local440 = local432 >>> 24;
						local444 = 256 - local440;
						Static129.anIntArray297[local388++] = ((local432 & 0xFF00FF) * local440 + (local436 & 0xFF00FF) * local444 & 0xFF00FF00) + ((local432 & 0xFF00) * local440 + (local436 & 0xFF00) * local444 & 0xFF0000) >>> 8;
						local504 += local333;
						local394++;
					}
				}
				local384++;
				local368 -= local333;
				local319 += Static129.anInt3144;
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIIII[I[I)V")
	@Override
	public final void method310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9) {
		try {
			@Pc(4) int local4 = -arg2 / 2;
			@Pc(9) int local9 = -arg3 / 2;
			@Pc(18) int local18 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
			@Pc(27) int local27 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
			@Pc(33) int local33 = local18 * arg7 >> 8;
			@Pc(39) int local39 = local27 * arg7 >> 8;
			@Pc(51) int local51 = (arg4 << 16) + local9 * local33 + local4 * local39;
			@Pc(63) int local63 = (arg5 << 16) + (local9 * local39 - local4 * local33);
			@Pc(69) int local69 = arg0 + arg1 * Static129.anInt3144;
			for (@Pc(71) int local71 = 0; local71 < arg3; local71++) {
				@Pc(78) int local78 = arg8[local71];
				@Pc(82) int local82 = local69 + local78;
				@Pc(88) int local88 = local51 + local39 * local78;
				@Pc(94) int local94 = local63 - local33 * local78;
				for (@Pc(99) int local99 = -arg9[local71]; local99 < 0; local99++) {
					@Pc(115) int local115 = this.anIntArray20[(local88 >> 16) + (local94 >> 16) * this.anInt1867];
					@Pc(119) int local119 = Static129.anIntArray297[local82];
					@Pc(123) int local123 = local115 >>> 24;
					@Pc(127) int local127 = 256 - local123;
					Static129.anIntArray297[local82++] = ((local115 & 0xFF00FF) * local123 + (local119 & 0xFF00FF) * local127 & 0xFF00FF00) + ((local115 & 0xFF00) * local123 + (local119 & 0xFF00) * local127 & 0xFF0000) >>> 8;
					local88 += local39;
					local94 -= local33;
				}
				local51 += local33;
				local63 += local39;
				local69 += Static129.anInt3144;
			}
		} catch (@Pc(186) Exception local186) {
		}
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(IIIIIIII[I[I)V")
	@Override
	public final void method313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int[] arg8) {
		try {
			@Pc(4) int local4 = -arg2 / 2;
			@Pc(9) int local9 = -arg3 / 2;
			@Pc(18) int local18 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
			@Pc(27) int local27 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
			@Pc(33) int local33 = local18 * 256 >> 8;
			@Pc(39) int local39 = local27 * 256 >> 8;
			@Pc(51) int local51 = (arg4 << 16) + local9 * local33 + local4 * local39;
			@Pc(63) int local63 = (arg5 << 16) + (local9 * local39 - local4 * local33);
			@Pc(69) int local69 = arg0 + arg1 * Static129.anInt3144;
			for (@Pc(71) int local71 = 0; local71 < arg3; local71++) {
				@Pc(78) int local78 = arg7[local71];
				@Pc(82) int local82 = local69 + local78;
				@Pc(88) int local88 = local51 + local39 * local78;
				@Pc(94) int local94 = local63 - local33 * local78;
				for (@Pc(99) int local99 = -arg8[local71]; local99 < 0; local99++) {
					@Pc(115) int local115 = this.anIntArray20[(local88 >> 16) + (local94 >> 16) * this.anInt1867];
					@Pc(119) int local119 = Static129.anIntArray297[local82];
					@Pc(123) int local123 = local115 >>> 24;
					@Pc(127) int local127 = 256 - local123;
					Static129.anIntArray297[local82++] = ((local115 & 0xFF00FF) * local123 + (local119 & 0xFF00FF) * local127 & 0xFF00FF00) + ((local115 & 0xFF00) * local123 + (local119 & 0xFF00) * local127 & 0xFF0000) >>> 8;
					local88 += local39;
					local94 -= local33;
				}
				local51 += local33;
				local63 += local39;
				local69 += Static129.anInt3144;
			}
		} catch (@Pc(186) Exception local186) {
		}
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(IIIII)V")
	@Override
	public final void method1422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(7) int local7 = this.anInt1867;
		@Pc(10) int local10 = this.anInt1859;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(17) int local17 = this.anInt1860;
		@Pc(20) int local20 = this.anInt1866;
		@Pc(26) int local26 = (local17 << 16) / arg2;
		@Pc(32) int local32 = (local20 << 16) / arg3;
		@Pc(46) int local46;
		if (this.anInt1863 > 0) {
			local46 = ((this.anInt1863 << 16) + local26 - 1) / local26;
			arg0 += local46;
			local12 = local46 * local26 - (this.anInt1863 << 16);
		}
		if (this.anInt1861 > 0) {
			local46 = ((this.anInt1861 << 16) + local32 - 1) / local32;
			arg1 += local46;
			local14 = local46 * local32 - (this.anInt1861 << 16);
		}
		if (local7 < local17) {
			arg2 = ((local7 << 16) + local26 - local12 - 1) / local26;
		}
		if (local10 < local20) {
			arg3 = ((local10 << 16) + local32 - local14 - 1) / local32;
		}
		local46 = arg0 + arg1 * Static129.anInt3144;
		@Pc(130) int local130 = Static129.anInt3144 - arg2;
		if (arg1 + arg3 > Static129.anInt3149) {
			arg3 -= arg1 + arg3 - Static129.anInt3149;
		}
		@Pc(150) int local150;
		if (arg1 < Static129.anInt3147) {
			local150 = Static129.anInt3147 - arg1;
			arg3 -= local150;
			local46 += local150 * Static129.anInt3144;
			local14 += local32 * local150;
		}
		if (arg0 + arg2 > Static129.anInt3148) {
			local150 = arg0 + arg2 - Static129.anInt3148;
			arg2 -= local150;
			local130 += local150;
		}
		if (arg0 < Static129.anInt3145) {
			local150 = Static129.anInt3145 - arg0;
			arg2 -= local150;
			local46 += local150;
			local12 += local26 * local150;
			local130 += local150;
		}
		Static283.method317(Static129.anIntArray297, this.anIntArray20, local12, local14, local46, local130, arg2, arg3, local26, local32, local7, arg4);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method1419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(7) int local7 = this.anInt1867;
		@Pc(10) int local10 = this.anInt1859;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(17) int local17 = this.anInt1860;
		@Pc(20) int local20 = this.anInt1866;
		@Pc(26) int local26 = (local17 << 16) / arg2;
		@Pc(32) int local32 = (local20 << 16) / arg3;
		@Pc(46) int local46;
		if (this.anInt1863 > 0) {
			local46 = ((this.anInt1863 << 16) + local26 - 1) / local26;
			arg0 += local46;
			local12 = local46 * local26 - (this.anInt1863 << 16);
		}
		if (this.anInt1861 > 0) {
			local46 = ((this.anInt1861 << 16) + local32 - 1) / local32;
			arg1 += local46;
			local14 = local46 * local32 - (this.anInt1861 << 16);
		}
		if (local7 < local17) {
			arg2 = ((local7 << 16) + local26 - local12 - 1) / local26;
		}
		if (local10 < local20) {
			arg3 = ((local10 << 16) + local32 - local14 - 1) / local32;
		}
		local46 = arg0 + arg1 * Static129.anInt3144;
		@Pc(130) int local130 = Static129.anInt3144 - arg2;
		if (arg1 + arg3 > Static129.anInt3149) {
			arg3 -= arg1 + arg3 - Static129.anInt3149;
		}
		@Pc(150) int local150;
		if (arg1 < Static129.anInt3147) {
			local150 = Static129.anInt3147 - arg1;
			arg3 -= local150;
			local46 += local150 * Static129.anInt3144;
			local14 += local32 * local150;
		}
		if (arg0 + arg2 > Static129.anInt3148) {
			local150 = arg0 + arg2 - Static129.anInt3148;
			arg2 -= local150;
			local130 += local150;
		}
		if (arg0 < Static129.anInt3145) {
			local150 = Static129.anInt3145 - arg0;
			arg2 -= local150;
			local46 += local150;
			local12 += local26 * local150;
			local130 += local150;
		}
		Static283.method321(Static129.anIntArray297, this.anIntArray20, local12, local14, local46, local130, arg2, arg3, local26, local32, local7);
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "(II)V")
	@Override
	public final void method1421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt1860 - this.anInt1867 - this.anInt1863;
		arg1 += this.anInt1861;
		@Pc(21) int local21 = arg0 + arg1 * Static129.anInt3144;
		@Pc(26) int local26 = this.anInt1867 - 1;
		@Pc(29) int local29 = this.anInt1859;
		@Pc(32) int local32 = this.anInt1867;
		@Pc(36) int local36 = Static129.anInt3144 - local32;
		@Pc(40) int local40 = local32 + local32;
		@Pc(47) int local47;
		if (arg1 < Static129.anInt3147) {
			local47 = Static129.anInt3147 - arg1;
			local29 -= local47;
			arg1 = Static129.anInt3147;
			local26 += local47 * local32;
			local21 += local47 * Static129.anInt3144;
		}
		if (arg1 + local29 > Static129.anInt3149) {
			local29 -= arg1 + local29 - Static129.anInt3149;
		}
		if (arg0 < Static129.anInt3145) {
			local47 = Static129.anInt3145 - arg0;
			local32 -= local47;
			arg0 = Static129.anInt3145;
			local26 -= local47;
			local21 += local47;
			local40 -= local47;
			local36 += local47;
		}
		if (arg0 + local32 > Static129.anInt3148) {
			local47 = arg0 + local32 - Static129.anInt3148;
			local32 -= local47;
			local40 -= local47;
			local36 += local47;
		}
		if (local32 > 0 && local29 > 0) {
			Static283.method318(Static129.anIntArray297, this.anIntArray20, local26, local21, local32, local29, local36, local40);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(III)V")
	@Override
	public final void method1417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt1863;
		arg1 += this.anInt1861;
		@Pc(15) int local15 = arg0 + arg1 * Static129.anInt3144;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt1859;
		@Pc(23) int local23 = this.anInt1867;
		@Pc(27) int local27 = Static129.anInt3144 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static129.anInt3147) {
			local36 = Static129.anInt3147 - arg1;
			local20 -= local36;
			arg1 = Static129.anInt3147;
			local17 = local36 * local23;
			local15 += local36 * Static129.anInt3144;
		}
		if (arg1 + local20 > Static129.anInt3149) {
			local20 -= arg1 + local20 - Static129.anInt3149;
		}
		if (arg0 < Static129.anInt3145) {
			local36 = Static129.anInt3145 - arg0;
			local23 -= local36;
			arg0 = Static129.anInt3145;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static129.anInt3148) {
			local36 = arg0 + local23 - Static129.anInt3148;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static283.method320(Static129.anIntArray297, this.anIntArray20, local17, local15, local23, local20, local27, local29, arg2);
		}
	}
}
