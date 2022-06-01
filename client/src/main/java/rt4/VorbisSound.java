package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class VorbisSound extends Node {

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "[F")
    public static float[] aFloatArray9;
    @OriginalMember(owner = "client!jc", name = "q", descriptor = "[F")
    public static float[] aFloatArray10;
    @OriginalMember(owner = "client!jc", name = "t", descriptor = "[I")
    public static int[] anIntArray276;
    @OriginalMember(owner = "client!jc", name = "u", descriptor = "[Lclient!vb;")
    public static VorbisResidue[] aClass152Array1;
    @OriginalMember(owner = "client!jc", name = "v", descriptor = "[Z")
    public static boolean[] aBooleanArray63;
    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public static int anInt2975;
    @OriginalMember(owner = "client!jc", name = "A", descriptor = "[Lclient!uk;")
    public static VorbisMapping[] aClass151Array1;
    @OriginalMember(owner = "client!jc", name = "B", descriptor = "[F")
    public static float[] aFloatArray12;
    @OriginalMember(owner = "client!jc", name = "C", descriptor = "[F")
    public static float[] aFloatArray13;
    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    public static int anInt2978;
    @OriginalMember(owner = "client!jc", name = "F", descriptor = "[F")
    public static float[] aFloatArray14;
    @OriginalMember(owner = "client!jc", name = "I", descriptor = "[Lclient!ji;")
    public static VorbisCodebook[] aClass78Array1;
    @OriginalMember(owner = "client!jc", name = "J", descriptor = "[Lclient!ie;")
    public static VorbisRange[] aClass67Array1;
    @OriginalMember(owner = "client!jc", name = "L", descriptor = "[I")
    public static int[] anIntArray277;
    @OriginalMember(owner = "client!jc", name = "P", descriptor = "[F")
    public static float[] aFloatArray15;
    @OriginalMember(owner = "client!jc", name = "S", descriptor = "[F")
    public static float[] aFloatArray16;
    @OriginalMember(owner = "client!jc", name = "W", descriptor = "[I")
    public static int[] anIntArray278;
    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    private static int anInt2979;
    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    private static int anInt2982;
    @OriginalMember(owner = "client!jc", name = "T", descriptor = "[B")
    private static byte[] aByteArray42;
    @OriginalMember(owner = "client!jc", name = "H", descriptor = "Z")
    private static boolean aBoolean149 = false;
    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
	private int anInt2973;

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
	private int anInt2974;

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "[F")
	private float[] aFloatArray11;

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "Z")
	private boolean aBoolean148;

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
	private int anInt2976;

	@OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
	private int anInt2977;

	@OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
	private int anInt2980;

	@OriginalMember(owner = "client!jc", name = "M", descriptor = "[[B")
	private byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!jc", name = "N", descriptor = "Z")
	private boolean aBoolean150;

	@OriginalMember(owner = "client!jc", name = "O", descriptor = "I")
	private int anInt2981;

	@OriginalMember(owner = "client!jc", name = "R", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
	private int anInt2983;

	@OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
	private int anInt2984;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([B)V")
	public VorbisSound(@OriginalArg(0) byte[] arg0) {
		this.method2342(arg0);
	}

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)F")
    public static float method2340(@OriginalArg(0) int arg0) {
        @Pc(3) int local3 = arg0 & 0x1FFFFF;
        @Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
        @Pc(13) int local13 = arg0 >> 21 & 0x3FF;
        if (local7 != 0) {
            local3 = -local3;
        }
        return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ve;)Z")
    private static boolean method2344(@OriginalArg(0) Js5 arg0) {
        if (!aBoolean149) {
            @Pc(7) byte[] local7 = arg0.getFile(0, 0);
            if (local7 == null) {
                return false;
            }
            method2349(local7);
            aBoolean149 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ve;II)Lclient!jc;")
    public static VorbisSound method2345(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        if (method2344(arg0)) {
            @Pc(16) byte[] local16 = arg0.getFile(arg1, arg2);
            return local16 == null ? null : new VorbisSound(local16);
        } else {
            arg0.isFileReady(arg2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "()I")
    public static int method2346() {
        @Pc(7) int local7 = aByteArray42[anInt2979] >> anInt2982 & 0x1;
        anInt2982++;
        anInt2979 += anInt2982 >> 3;
        anInt2982 &= 0x7;
        return local7;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([BI)V")
    public static void method2347(@OriginalArg(0) byte[] arg0) {
        aByteArray42 = arg0;
        anInt2979 = 0;
        anInt2982 = 0;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "([B)V")
    private static void method2349(@OriginalArg(0) byte[] arg0) {
        method2347(arg0);
        anInt2978 = 0x1 << method2350(4);
        anInt2975 = 0x1 << method2350(4);
        aFloatArray14 = new float[anInt2975];
        @Pc(17) int local17;
        @Pc(26) int local26;
        @Pc(30) int local30;
        @Pc(34) int local34;
        @Pc(38) int local38;
        for (local17 = 0; local17 < 2; local17++) {
            local26 = local17 == 0 ? anInt2978 : anInt2975;
            local30 = local26 >> 1;
            local34 = local26 >> 2;
            local38 = local26 >> 3;
            @Pc(41) float[] local41 = new float[local30];
            for (@Pc(43) int local43 = 0; local43 < local34; local43++) {
                local41[local43 * 2] = (float) Math.cos((double) (local43 * 4) * 3.141592653589793D / (double) local26);
                local41[local43 * 2 + 1] = -((float) Math.sin((double) (local43 * 4) * 3.141592653589793D / (double) local26));
            }
            @Pc(86) float[] local86 = new float[local30];
            for (@Pc(88) int local88 = 0; local88 < local34; local88++) {
                local86[local88 * 2] = (float) Math.cos((double) (local88 * 2 + 1) * 3.141592653589793D / (double) (local26 * 2));
                local86[local88 * 2 + 1] = (float) Math.sin((double) (local88 * 2 + 1) * 3.141592653589793D / (double) (local26 * 2));
            }
            @Pc(138) float[] local138 = new float[local34];
            for (@Pc(140) int local140 = 0; local140 < local38; local140++) {
                local138[local140 * 2] = (float) Math.cos((double) (local140 * 4 + 2) * 3.141592653589793D / (double) local26);
                local138[local140 * 2 + 1] = -((float) Math.sin((double) (local140 * 4 + 2) * 3.141592653589793D / (double) local26));
            }
            @Pc(187) int[] local187 = new int[local38];
            @Pc(193) int local193 = Static204.method3674(local38 - 1);
            for (@Pc(195) int local195 = 0; local195 < local38; local195++) {
                local187[local195] = method667(local193, local195);
            }
            if (local17 == 0) {
                aFloatArray13 = local41;
                aFloatArray15 = local86;
                aFloatArray16 = local138;
                anIntArray276 = local187;
            } else {
                aFloatArray12 = local41;
                aFloatArray9 = local86;
                aFloatArray10 = local138;
                anIntArray277 = local187;
            }
        }
        local17 = method2350(8) + 1;
        aClass78Array1 = new VorbisCodebook[local17];
        for (local26 = 0; local26 < local17; local26++) {
            aClass78Array1[local26] = new VorbisCodebook();
        }
        local26 = method2350(6) + 1;
        for (local30 = 0; local30 < local26; local30++) {
            method2350(16);
        }
        local26 = method2350(6) + 1;
        aClass67Array1 = new VorbisRange[local26];
        for (local30 = 0; local30 < local26; local30++) {
            aClass67Array1[local30] = new VorbisRange();
        }
        local30 = method2350(6) + 1;
        aClass152Array1 = new VorbisResidue[local30];
        for (local34 = 0; local34 < local30; local34++) {
            aClass152Array1[local34] = new VorbisResidue();
        }
        local34 = method2350(6) + 1;
        aClass151Array1 = new VorbisMapping[local34];
        for (local38 = 0; local38 < local34; local38++) {
            aClass151Array1[local38] = new VorbisMapping();
        }
        local38 = method2350(6) + 1;
        aBooleanArray63 = new boolean[local38];
        anIntArray278 = new int[local38];
        for (@Pc(340) int local340 = 0; local340 < local38; local340++) {
            aBooleanArray63[local340] = method2346() != 0;
            method2350(16);
            method2350(16);
            anIntArray278[local340] = method2350(8);
        }
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)I")
    public static int method2350(@OriginalArg(0) int arg0) {
        @Pc(1) int local1 = 0;
        @Pc(3) int local3 = 0;
        @Pc(12) int local12;
        while (arg0 >= 8 - anInt2982) {
            local12 = 8 - anInt2982;
            @Pc(18) int local18 = (0x1 << local12) - 1;
            local1 += (aByteArray42[anInt2979] >> anInt2982 & local18) << local3;
            anInt2982 = 0;
            anInt2979++;
            local3 += local12;
            arg0 -= local12;
        }
        if (arg0 > 0) {
            local12 = (0x1 << arg0) - 1;
            local1 += (aByteArray42[anInt2979] >> anInt2982 & local12) << local3;
            anInt2982 += arg0;
        }
        return local1;
    }

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)I")
	public static int method667(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = 0;
		while (arg0 > 0) {
			local8 = local8 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local8;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([I)Lclient!kj;")
	public final PcmSound method2341(@OriginalArg(0) int[] arg0) {
		if (arg0 != null && arg0[0] <= 0) {
			return null;
		}
		if (this.aByteArray41 == null) {
			this.anInt2973 = 0;
			this.aFloatArray11 = new float[anInt2975];
			this.aByteArray41 = new byte[this.anInt2974];
			this.anInt2984 = 0;
			this.anInt2983 = 0;
		}
		while (this.anInt2983 < this.aByteArrayArray10.length) {
			if (arg0 != null && arg0[0] <= 0) {
				return null;
			}
			@Pc(47) float[] local47 = this.method2348(this.anInt2983);
			if (local47 != null) {
				@Pc(52) int local52 = this.anInt2984;
				@Pc(55) int local55 = local47.length;
				if (local55 > this.anInt2974 - local52) {
					local55 = this.anInt2974 - local52;
				}
				for (@Pc(68) int local68 = 0; local68 < local55; local68++) {
					@Pc(80) int local80 = (int) (local47[local68] * 128.0F + 128.0F);
					if ((local80 & 0xFFFFFF00) != 0) {
						local80 = ~local80 >> 31;
					}
					this.aByteArray41[local52++] = (byte) (local80 - 128);
				}
				if (arg0 != null) {
					arg0[0] -= local52 - this.anInt2984;
				}
				this.anInt2984 = local52;
			}
			this.anInt2983++;
		}
		this.aFloatArray11 = null;
		@Pc(129) byte[] local129 = this.aByteArray41;
		this.aByteArray41 = null;
		return new PcmSound(this.anInt2980, local129, this.anInt2976, this.anInt2977, this.aBoolean148);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([B)V")
	private void method2342(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Buffer local4 = new Buffer(arg0);
		this.anInt2980 = local4.g4();
		this.anInt2974 = local4.g4();
		this.anInt2976 = local4.g4();
		this.anInt2977 = local4.g4();
		if (this.anInt2977 < 0) {
			this.anInt2977 = ~this.anInt2977;
			this.aBoolean148 = true;
		}
		@Pc(40) int local40 = local4.g4();
		this.aByteArrayArray10 = new byte[local40][];
		for (@Pc(46) int local46 = 0; local46 < local40; local46++) {
			@Pc(51) int local51 = 0;
			@Pc(55) int local55;
			do {
				local55 = local4.g1();
				local51 += local55;
			} while (local55 >= 255);
			@Pc(67) byte[] local67 = new byte[local51];
			local4.gBytes(local51, local67);
			this.aByteArrayArray10[local46] = local67;
		}
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)[F")
	private float[] method2348(@OriginalArg(0) int arg0) {
		method2347(this.aByteArrayArray10[arg0]);
		method2346();
		@Pc(15) int local15 = method2350(Static204.method3674(anIntArray278.length - 1));
		@Pc(19) boolean local19 = aBooleanArray63[local15];
		@Pc(25) int local25 = local19 ? anInt2975 : anInt2978;
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		if (local19) {
			local27 = method2346() != 0;
			local29 = method2346() != 0;
		}
		@Pc(47) int local47 = local25 >> 1;
		@Pc(59) int local59;
		@Pc(67) int local67;
		@Pc(71) int local71;
		if (local19 && !local27) {
			local59 = (local25 >> 2) - (anInt2978 >> 2);
			local67 = (local25 >> 2) + (anInt2978 >> 2);
			local71 = anInt2978 >> 1;
		} else {
			local59 = 0;
			local67 = local47;
			local71 = local25 >> 1;
		}
		@Pc(94) int local94;
		@Pc(104) int local104;
		@Pc(108) int local108;
		if (local19 && !local29) {
			local94 = local25 - (local25 >> 2) - (anInt2978 >> 2);
			local104 = local25 + (anInt2978 >> 2) - (local25 >> 2);
			local108 = anInt2978 >> 1;
		} else {
			local94 = local47;
			local104 = local25;
			local108 = local25 >> 1;
		}
		@Pc(123) VorbisMapping local123 = aClass151Array1[anIntArray278[local15]];
		@Pc(126) int local126 = local123.anInt5562;
		@Pc(131) int local131 = local123.anIntArray490[local126];
		@Pc(140) boolean local140 = !aClass67Array1[local131].method2272();
		for (@Pc(144) int local144 = 0; local144 < local123.anInt5563; local144++) {
			@Pc(155) VorbisResidue local155 = aClass152Array1[local123.anIntArray491[local144]];
			@Pc(157) float[] local157 = aFloatArray14;
			local155.method4450(local157, local25 >> 1, local140);
		}
		@Pc(176) int local176;
		if (!local140) {
			local131 = local123.anInt5562;
			local176 = local123.anIntArray490[local131];
			aClass67Array1[local176].method2269(aFloatArray14, local25 >> 1);
		}
		@Pc(212) int local212;
		if (local140) {
			for (local131 = local25 >> 1; local131 < local25; local131++) {
				aFloatArray14[local131] = 0.0F;
			}
		} else {
			local131 = local25 >> 1;
			local176 = local25 >> 2;
			local212 = local25 >> 3;
			@Pc(214) float[] local214 = aFloatArray14;
			@Pc(216) int local216;
			for (local216 = 0; local216 < local131; local216++) {
				local214[local216] *= 0.5F;
			}
			for (local216 = local131; local216 < local25; local216++) {
				local214[local216] = -local214[local25 - local216 - 1];
			}
			@Pc(252) float[] local252 = local19 ? aFloatArray12 : aFloatArray13;
			@Pc(258) float[] local258 = local19 ? aFloatArray9 : aFloatArray15;
			@Pc(264) float[] local264 = local19 ? aFloatArray10 : aFloatArray16;
			@Pc(270) int[] local270 = local19 ? anIntArray277 : anIntArray276;
			@Pc(272) int local272;
			@Pc(291) float local291;
			@Pc(309) float local309;
			@Pc(315) float local315;
			@Pc(323) float local323;
			for (local272 = 0; local272 < local176; local272++) {
				local291 = local214[local272 * 4] - local214[local25 - local272 * 4 - 1];
				local309 = local214[local272 * 4 + 2] - local214[local25 - local272 * 4 - 3];
				local315 = local252[local272 * 2];
				local323 = local252[local272 * 2 + 1];
				local214[local25 - local272 * 4 - 1] = local291 * local315 - local309 * local323;
				local214[local25 - local272 * 4 - 3] = local291 * local323 + local309 * local315;
			}
			@Pc(432) float local432;
			@Pc(442) float local442;
			for (local272 = 0; local272 < local212; local272++) {
				local291 = local214[local131 + local272 * 4 + 3];
				local309 = local214[local131 + local272 * 4 + 1];
				local315 = local214[local272 * 4 + 3];
				local323 = local214[local272 * 4 + 1];
				local214[local131 + local272 * 4 + 3] = local291 + local315;
				local214[local131 + local272 * 4 + 1] = local309 + local323;
				local432 = local252[local131 - local272 * 4 - 4];
				local442 = local252[local131 - local272 * 4 - 3];
				local214[local272 * 4 + 3] = (local291 - local315) * local432 - (local309 - local323) * local442;
				local214[local272 * 4 + 1] = (local309 - local323) * local432 + (local291 - local315) * local442;
			}
			local272 = Static204.method3674(local25 - 1);
			@Pc(488) int local488;
			@Pc(499) int local499;
			@Pc(503) int local503;
			@Pc(505) int local505;
			for (local488 = 0; local488 < local272 - 3; local488++) {
				local499 = local25 >> local488 + 2;
				local503 = 0x8 << local488;
				for (local505 = 0; local505 < 0x2 << local488; local505++) {
					@Pc(518) int local518 = local25 - local499 * 2 * local505;
					@Pc(528) int local528 = local25 - local499 * (local505 * 2 + 1);
					for (@Pc(530) int local530 = 0; local530 < local25 >> local488 + 4; local530++) {
						@Pc(541) int local541 = local530 * 4;
						@Pc(549) float local549 = local214[local518 - local541 - 1];
						@Pc(557) float local557 = local214[local518 - local541 - 3];
						@Pc(565) float local565 = local214[local528 - local541 - 1];
						@Pc(573) float local573 = local214[local528 - local541 - 3];
						local214[local518 - local541 - 1] = local549 + local565;
						local214[local518 - local541 - 3] = local557 + local573;
						@Pc(599) float local599 = local252[local530 * local503];
						@Pc(607) float local607 = local252[local530 * local503 + 1];
						local214[local528 - local541 - 1] = (local549 - local565) * local599 - (local557 - local573) * local607;
						local214[local528 - local541 - 3] = (local557 - local573) * local599 + (local549 - local565) * local607;
					}
				}
			}
			for (local488 = 1; local488 < local212 - 1; local488++) {
				local499 = local270[local488];
				if (local488 < local499) {
					local503 = local488 * 8;
					local505 = local499 * 8;
					local432 = local214[local503 + 1];
					local214[local503 + 1] = local214[local505 + 1];
					local214[local505 + 1] = local432;
					local432 = local214[local503 + 3];
					local214[local503 + 3] = local214[local505 + 3];
					local214[local505 + 3] = local432;
					local432 = local214[local503 + 5];
					local214[local503 + 5] = local214[local505 + 5];
					local214[local505 + 5] = local432;
					local432 = local214[local503 + 7];
					local214[local503 + 7] = local214[local505 + 7];
					local214[local505 + 7] = local432;
				}
			}
			for (local488 = 0; local488 < local131; local488++) {
				local214[local488] = local214[local488 * 2 + 1];
			}
			for (local488 = 0; local488 < local212; local488++) {
				local214[local25 - local488 * 2 - 1] = local214[local488 * 4];
				local214[local25 - local488 * 2 - 2] = local214[local488 * 4 + 1];
				local214[local25 - local176 - local488 * 2 - 1] = local214[local488 * 4 + 2];
				local214[local25 - local176 - local488 * 2 - 2] = local214[local488 * 4 + 3];
			}
			for (local488 = 0; local488 < local212; local488++) {
				local309 = local264[local488 * 2];
				local315 = local264[local488 * 2 + 1];
				local323 = local214[local131 + local488 * 2];
				local432 = local214[local131 + local488 * 2 + 1];
				local442 = local214[local25 - local488 * 2 - 2];
				@Pc(908) float local908 = local214[local25 - local488 * 2 - 1];
				@Pc(920) float local920 = local315 * (local323 - local442) + local309 * (local432 + local908);
				local214[local131 + local488 * 2] = (local323 + local442 + local920) * 0.5F;
				local214[local25 - local488 * 2 - 2] = (local323 + local442 - local920) * 0.5F;
				@Pc(962) float local962 = local315 * (local432 + local908) - local309 * (local323 - local442);
				local214[local131 + local488 * 2 + 1] = (local432 + local962 - local908) * 0.5F;
				local214[local25 - local488 * 2 - 1] = (local908 + local962 - local432) * 0.5F;
			}
			for (local488 = 0; local488 < local176; local488++) {
				local214[local488] = local214[local488 * 2 + local131] * local258[local488 * 2] + local214[local488 * 2 + local131 + 1] * local258[local488 * 2 + 1];
				local214[local131 - local488 - 1] = local214[local488 * 2 + local131] * local258[local488 * 2 + 1] - local214[local488 * 2 + local131 + 1] * local258[local488 * 2];
			}
			for (local488 = 0; local488 < local176; local488++) {
				local214[local25 + local488 - local176] = -local214[local488];
			}
			for (local488 = 0; local488 < local176; local488++) {
				local214[local488] = local214[local176 + local488];
			}
			for (local488 = 0; local488 < local176; local488++) {
				local214[local176 + local488] = -local214[local176 - local488 - 1];
			}
			for (local488 = 0; local488 < local176; local488++) {
				local214[local131 + local488] = local214[local25 - local488 - 1];
			}
			for (local488 = local59; local488 < local67; local488++) {
				local309 = (float) Math.sin(((double) (local488 - local59) + 0.5D) / (double) local71 * 0.5D * 3.141592653589793D);
				aFloatArray14[local488] *= (float) Math.sin((double) local309 * 1.5707963267948966D * (double) local309);
			}
			for (local488 = local94; local488 < local104; local488++) {
				local309 = (float) Math.sin(((double) (local488 - local94) + 0.5D) / (double) local108 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				aFloatArray14[local488] *= (float) Math.sin((double) local309 * 1.5707963267948966D * (double) local309);
			}
		}
		@Pc(1228) float[] local1228 = null;
		if (this.anInt2973 > 0) {
			local176 = this.anInt2973 + local25 >> 2;
			local1228 = new float[local176];
			@Pc(1257) int local1257;
			if (!this.aBoolean150) {
				for (local212 = 0; local212 < this.anInt2981; local212++) {
					local1257 = (this.anInt2973 >> 1) + local212;
					local1228[local212] += this.aFloatArray11[local1257];
				}
			}
			if (!local140) {
				for (local212 = local59; local212 < local25 >> 1; local212++) {
					local1257 = local1228.length + local212 - (local25 >> 1);
					local1228[local1257] += aFloatArray14[local212];
				}
			}
		}
		@Pc(1301) float[] local1301 = this.aFloatArray11;
		this.aFloatArray11 = aFloatArray14;
		aFloatArray14 = local1301;
		this.anInt2973 = local25;
		this.anInt2981 = local104 - (local25 >> 1);
		this.aBoolean150 = local140;
		return local1228;
	}
}
