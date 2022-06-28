package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class SoundPcmStream extends PcmStream {

	@OriginalMember(owner = "client!b", name = "v", descriptor = "I")
	public int anInt344;

	@OriginalMember(owner = "client!b", name = "y", descriptor = "I")
	public int anInt347;

	@OriginalMember(owner = "client!b", name = "z", descriptor = "I")
	public int anInt348;

	@OriginalMember(owner = "client!b", name = "C", descriptor = "I")
	private int anInt350;

	@OriginalMember(owner = "client!b", name = "D", descriptor = "I")
	private int anInt351;

	@OriginalMember(owner = "client!b", name = "E", descriptor = "I")
	public int anInt352;

	@OriginalMember(owner = "client!b", name = "G", descriptor = "I")
	public int anInt354;

	@OriginalMember(owner = "client!b", name = "H", descriptor = "I")
	public int anInt355;

	@OriginalMember(owner = "client!b", name = "w", descriptor = "I")
	private final int start;

	@OriginalMember(owner = "client!b", name = "F", descriptor = "I")
	private final int end;

	@OriginalMember(owner = "client!b", name = "A", descriptor = "Z")
	private final boolean aBoolean14;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "I")
	private int anInt342;

	@OriginalMember(owner = "client!b", name = "u", descriptor = "I")
	private int volume;

	@OriginalMember(owner = "client!b", name = "B", descriptor = "I")
	private int pan;

	@OriginalMember(owner = "client!b", name = "x", descriptor = "I")
	public int anInt346;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!kj;II)V")
	public SoundPcmStream(@OriginalArg(0) PcmSound sound, @OriginalArg(1) int arg1, @OriginalArg(2) int volume) {
		this.sound = sound;
		this.start = sound.start;
		this.end = sound.end;
		this.aBoolean14 = sound.aBoolean165;
		this.anInt342 = arg1;
		this.volume = volume;
		this.pan = 8192;
		this.anInt346 = 0;
		this.method416();
	}

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!kj;III)V")
	public SoundPcmStream(@OriginalArg(0) PcmSound sound, @OriginalArg(1) int arg1, @OriginalArg(2) int volume, @OriginalArg(3) int pan) {
		this.sound = sound;
		this.start = sound.start;
		this.end = sound.end;
		this.aBoolean14 = sound.aBoolean165;
		this.anInt342 = arg1;
		this.volume = volume;
		this.pan = pan;
		this.anInt346 = 0;
		this.method416();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!kj;II)Lclient!b;")
	public static SoundPcmStream create(@OriginalArg(0) PcmSound sound, @OriginalArg(2) int volume) {
		return sound.samples == null || sound.samples.length == 0 ? null : new SoundPcmStream(sound, (int) ((long) sound.rate * 256L * (long) 100 / (AudioChannel.sampleRate * 100L)), volume << 6);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I[B[IIIIIIIILclient!b;)I")
	public static int method387(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) SoundPcmStream arg8) {
		arg2 >>= 0x8;
		@Pc(7) int local7 = arg7 >> 8;
		@Pc(11) int local11 = arg4 << 2;
		@Pc(15) int local15 = arg5 << 2;
		@Pc(22) int local22;
		if ((local22 = arg3 + local7 - arg2) > arg6) {
			local22 = arg6;
		}
		arg3 <<= 0x1;
		local22 <<= 0x1;
		local22 -= 6;
		@Pc(43) byte local43;
		@Pc(46) int local46;
		while (arg3 < local22) {
			@Pc(41) int local41 = arg2 + 1;
			local43 = arg0[arg2];
			local46 = arg3 + 1;
			arg1[arg3] += local43 * local11;
			@Pc(56) int local56 = local46 + 1;
			arg1[local46] += local43 * local15;
			@Pc(66) int local66 = local41 + 1;
			@Pc(68) byte local68 = arg0[local41];
			@Pc(71) int local71 = local56 + 1;
			arg1[local56] += local68 * local11;
			@Pc(81) int local81 = local71 + 1;
			arg1[local71] += local68 * local15;
			@Pc(91) int local91 = local66 + 1;
			@Pc(93) byte local93 = arg0[local66];
			@Pc(96) int local96 = local81 + 1;
			arg1[local81] += local93 * local11;
			@Pc(106) int local106 = local96 + 1;
			arg1[local96] += local93 * local15;
			arg2 = local91 + 1;
			@Pc(118) byte local118 = arg0[local91];
			@Pc(121) int local121 = local106 + 1;
			arg1[local106] += local118 * local11;
			arg3 = local121 + 1;
			arg1[local121] += local118 * local15;
		}
		local22 += 6;
		while (arg3 < local22) {
			local43 = arg0[arg2++];
			local46 = arg3 + 1;
			arg1[arg3] += local43 * local11;
			arg3 = local46 + 1;
			arg1[local46] += local43 * local15;
		}
		arg8.anInt346 = arg2 << 8;
		return arg3 >> 1;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II[B[IIIIIIIIIILclient!b;II)I")
	public static int method388(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9, @OriginalArg(13) SoundPcmStream arg10, @OriginalArg(14) int arg11, @OriginalArg(15) int arg12) {
		arg10.anInt348 -= arg10.anInt344 * arg3;
		@Pc(23) int local23;
		if (arg11 == 0 || (local23 = arg3 + (arg9 + arg11 - arg2 - 257) / arg11) > arg8) {
			local23 = arg8;
		}
		arg3 <<= 0x1;
		local23 <<= 0x1;
		@Pc(46) byte local46;
		@Pc(65) int local65;
		@Pc(62) int local62;
		@Pc(64) int local64;
		while (arg3 < local23) {
			@Pc(42) int local42 = arg2 >> 8;
			local46 = arg0[local42];
			local62 = (local46 << 8) + (arg0[local42 + 1] - local46) * (arg2 & 0xFF);
			local64 = arg3;
			local65 = arg3 + 1;
			arg1[local64] += local62 * arg4 >> 6;
			arg4 += arg6;
			@Pc(80) int local80 = local65;
			arg3 = local65 + 1;
			arg1[local80] += local62 * arg5 >> 6;
			arg5 += arg7;
			arg2 += arg11;
		}
		if (arg11 == 0 || (local23 = (arg3 >> 1) + (arg9 + arg11 - arg2 - 1) / arg11) > arg8) {
			local23 = arg8;
		}
		local23 <<= 0x1;
		while (arg3 < local23) {
			local46 = arg0[arg2 >> 8];
			local62 = (local46 << 8) + (arg12 - local46) * (arg2 & 0xFF);
			local64 = arg3;
			local65 = arg3 + 1;
			arg1[local64] += local62 * arg4 >> 6;
			arg4 += arg6;
			local64 = local65;
			arg3 = local65 + 1;
			arg1[local64] += local62 * arg5 >> 6;
			arg5 += arg7;
			arg2 += arg11;
		}
		local65 = arg3 >> 1;
		arg10.anInt348 += arg10.anInt344 * local65;
		arg10.anInt355 = arg4;
		arg10.anInt352 = arg5;
		arg10.anInt346 = arg2;
		return local65;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II[B[IIIIIIIILclient!b;II)I")
	public static int method389(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) SoundPcmStream arg8, @OriginalArg(12) int arg9, @OriginalArg(13) int arg10) {
		arg8.anInt355 -= arg8.anInt347 * arg3;
		arg8.anInt352 -= arg8.anInt354 * arg3;
		@Pc(32) int local32;
		if (arg9 == 0 || (local32 = arg3 + (arg7 + arg9 - arg2 - 257) / arg9) > arg6) {
			local32 = arg6;
		}
		@Pc(47) byte local47;
		@Pc(49) int local49;
		while (arg3 < local32) {
			@Pc(43) int local43 = arg2 >> 8;
			local47 = arg0[local43];
			local49 = arg3++;
			arg1[local49] += ((local47 << 8) + (arg0[local43 + 1] - local47) * (arg2 & 0xFF)) * arg4 >> 6;
			arg4 += arg5;
			arg2 += arg9;
		}
		if (arg9 == 0 || (local32 = arg3 + (arg7 + arg9 - arg2 - 1) / arg9) > arg6) {
			local32 = arg6;
		}
		while (arg3 < local32) {
			local47 = arg0[arg2 >> 8];
			local49 = arg3++;
			arg1[local49] += ((local47 << 8) + (arg10 - local47) * (arg2 & 0xFF)) * arg4 >> 6;
			arg4 += arg5;
			arg2 += arg9;
		}
		arg8.anInt355 += arg8.anInt347 * arg3;
		arg8.anInt352 += arg8.anInt354 * arg3;
		arg8.anInt348 = arg4;
		arg8.anInt346 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II[B[IIIIIIILclient!b;II)I")
	public static int method390(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) SoundPcmStream arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9) {
		@Pc(14) int local14;
		if (arg8 == 0 || (local14 = arg3 + (arg6 + arg8 + 256 - arg2) / arg8) > arg5) {
			local14 = arg5;
		}
		@Pc(33) int local33;
		while (arg3 < local14) {
			@Pc(25) int local25 = arg2 >> 8;
			@Pc(31) byte local31 = arg0[local25 - 1];
			local33 = arg3++;
			arg1[local33] += ((local31 << 8) + (arg0[local25] - local31) * (arg2 & 0xFF)) * arg4 >> 6;
			arg2 += arg8;
		}
		if (arg8 == 0 || (local14 = arg3 + (arg6 + arg8 - arg2) / arg8) > arg5) {
			local14 = arg5;
		}
		while (arg3 < local14) {
			local33 = arg3++;
			arg1[local33] += ((arg9 << 8) + (arg0[arg2 >> 8] - arg9) * (arg2 & 0xFF)) * arg4 >> 6;
			arg2 += arg8;
		}
		arg7.anInt346 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([B[IIIIIIILclient!b;)I")
	public static int method391(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) SoundPcmStream arg7) {
		arg2 >>= 0x8;
		@Pc(7) int local7 = arg6 >> 8;
		@Pc(11) int local11 = arg4 << 2;
		@Pc(18) int local18;
		if ((local18 = arg3 + local7 - arg2) > arg5) {
			local18 = arg5;
		}
		local18 -= 3;
		@Pc(28) int local28;
		while (arg3 < local18) {
			local28 = arg3++;
			@Pc(31) int local31 = arg1[local28];
			@Pc(34) int local34 = arg2 + 1;
			arg1[local28] = local31 + arg0[arg2] * local11;
			@Pc(41) int local41 = arg3++;
			@Pc(44) int local44 = arg1[local41];
			@Pc(47) int local47 = local34 + 1;
			arg1[local41] = local44 + arg0[local34] * local11;
			@Pc(54) int local54 = arg3++;
			@Pc(57) int local57 = arg1[local54];
			@Pc(60) int local60 = local47 + 1;
			arg1[local54] = local57 + arg0[local47] * local11;
			@Pc(67) int local67 = arg3++;
			@Pc(70) int local70 = arg1[local67];
			arg2 = local60 + 1;
			arg1[local67] = local70 + arg0[local60] * local11;
		}
		local18 += 3;
		while (arg3 < local18) {
			local28 = arg3++;
			arg1[local28] += arg0[arg2++] * local11;
		}
		arg7.anInt346 = arg2 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I[B[IIIIIIIIIILclient!b;)I")
	public static int method393(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) SoundPcmStream arg10) {
		arg2 >>= 0x8;
		@Pc(7) int local7 = arg9 >> 8;
		arg4 <<= 0x2;
		arg5 <<= 0x2;
		@Pc(19) int local19 = arg6 << 2;
		@Pc(23) int local23 = arg7 << 2;
		@Pc(30) int local30;
		if ((local30 = arg3 + local7 - arg2) > arg8) {
			local30 = arg8;
		}
		arg10.anInt348 += arg10.anInt344 * (local30 - arg3);
		arg3 <<= 0x1;
		local30 <<= 0x1;
		local30 -= 6;
		@Pc(62) byte local62;
		@Pc(65) int local65;
		while (arg3 < local30) {
			@Pc(60) int local60 = arg2 + 1;
			local62 = arg0[arg2];
			local65 = arg3 + 1;
			arg1[arg3] += local62 * arg4;
			@Pc(76) int local76 = arg4 + local19;
			@Pc(79) int local79 = local65 + 1;
			arg1[local65] += local62 * arg5;
			@Pc(90) int local90 = arg5 + local23;
			@Pc(93) int local93 = local60 + 1;
			@Pc(95) byte local95 = arg0[local60];
			@Pc(98) int local98 = local79 + 1;
			arg1[local79] += local95 * local76;
			@Pc(109) int local109 = local76 + local19;
			@Pc(112) int local112 = local98 + 1;
			arg1[local98] += local95 * local90;
			@Pc(123) int local123 = local90 + local23;
			@Pc(126) int local126 = local93 + 1;
			@Pc(128) byte local128 = arg0[local93];
			@Pc(131) int local131 = local112 + 1;
			arg1[local112] += local128 * local109;
			@Pc(142) int local142 = local109 + local19;
			@Pc(145) int local145 = local131 + 1;
			arg1[local131] += local128 * local123;
			@Pc(156) int local156 = local123 + local23;
			arg2 = local126 + 1;
			@Pc(161) byte local161 = arg0[local126];
			@Pc(164) int local164 = local145 + 1;
			arg1[local145] += local161 * local142;
			arg4 = local142 + local19;
			arg3 = local164 + 1;
			arg1[local164] += local161 * local156;
			arg5 = local156 + local23;
		}
		local30 += 6;
		while (arg3 < local30) {
			local62 = arg0[arg2++];
			local65 = arg3 + 1;
			arg1[arg3] += local62 * arg4;
			arg4 += local19;
			arg3 = local65 + 1;
			arg1[local65] += local62 * arg5;
			arg5 += local23;
		}
		arg10.anInt355 = arg4 >> 2;
		arg10.anInt352 = arg5 >> 2;
		arg10.anInt346 = arg2 << 8;
		return arg3 >> 1;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([B[IIIIIIIILclient!b;)I")
	public static int method394(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) SoundPcmStream arg8) {
		arg2 >>= 0x8;
		@Pc(7) int local7 = arg7 >> 8;
		arg4 <<= 0x2;
		@Pc(15) int local15 = arg5 << 2;
		@Pc(24) int local24;
		if ((local24 = arg3 + arg2 + 1 - local7) > arg6) {
			local24 = arg6;
		}
		arg8.anInt355 += arg8.anInt347 * (local24 - arg3);
		arg8.anInt352 += arg8.anInt354 * (local24 - arg3);
		local24 -= 3;
		@Pc(56) int local56;
		while (arg3 < local24) {
			local56 = arg3++;
			@Pc(59) int local59 = arg1[local56];
			@Pc(62) int local62 = arg2 - 1;
			arg1[local56] = local59 + arg0[arg2] * arg4;
			@Pc(71) int local71 = arg4 + local15;
			@Pc(73) int local73 = arg3++;
			@Pc(76) int local76 = arg1[local73];
			@Pc(79) int local79 = local62 - 1;
			arg1[local73] = local76 + arg0[local62] * local71;
			@Pc(88) int local88 = local71 + local15;
			@Pc(90) int local90 = arg3++;
			@Pc(93) int local93 = arg1[local90];
			@Pc(96) int local96 = local79 - 1;
			arg1[local90] = local93 + arg0[local79] * local88;
			@Pc(105) int local105 = local88 + local15;
			@Pc(107) int local107 = arg3++;
			@Pc(110) int local110 = arg1[local107];
			arg2 = local96 - 1;
			arg1[local107] = local110 + arg0[local96] * local105;
			arg4 = local105 + local15;
		}
		local24 += 3;
		while (arg3 < local24) {
			local56 = arg3++;
			arg1[local56] += arg0[arg2--] * arg4;
			arg4 += local15;
		}
		arg8.anInt348 = arg4 >> 2;
		arg8.anInt346 = arg2 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "([B[IIIIIIIILclient!b;)I")
	public static int method395(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) SoundPcmStream arg8) {
		arg2 >>= 0x8;
		@Pc(7) int local7 = arg7 >> 8;
		arg4 <<= 0x2;
		@Pc(15) int local15 = arg5 << 2;
		@Pc(22) int local22;
		if ((local22 = arg3 + local7 - arg2) > arg6) {
			local22 = arg6;
		}
		arg8.anInt355 += arg8.anInt347 * (local22 - arg3);
		arg8.anInt352 += arg8.anInt354 * (local22 - arg3);
		local22 -= 3;
		@Pc(54) int local54;
		while (arg3 < local22) {
			local54 = arg3++;
			@Pc(57) int local57 = arg1[local54];
			@Pc(60) int local60 = arg2 + 1;
			arg1[local54] = local57 + arg0[arg2] * arg4;
			@Pc(69) int local69 = arg4 + local15;
			@Pc(71) int local71 = arg3++;
			@Pc(74) int local74 = arg1[local71];
			@Pc(77) int local77 = local60 + 1;
			arg1[local71] = local74 + arg0[local60] * local69;
			@Pc(86) int local86 = local69 + local15;
			@Pc(88) int local88 = arg3++;
			@Pc(91) int local91 = arg1[local88];
			@Pc(94) int local94 = local77 + 1;
			arg1[local88] = local91 + arg0[local77] * local86;
			@Pc(103) int local103 = local86 + local15;
			@Pc(105) int local105 = arg3++;
			@Pc(108) int local108 = arg1[local105];
			arg2 = local94 + 1;
			arg1[local105] = local108 + arg0[local94] * local103;
			arg4 = local103 + local15;
		}
		local22 += 3;
		while (arg3 < local22) {
			local54 = arg3++;
			arg1[local54] += arg0[arg2++] * arg4;
			arg4 += local15;
		}
		arg8.anInt348 = arg4 >> 2;
		arg8.anInt346 = arg2 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!kj;III)Lclient!b;")
	public static SoundPcmStream create(@OriginalArg(0) PcmSound arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return arg0.samples == null || arg0.samples.length == 0 ? null : new SoundPcmStream(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(II[B[IIIIIIIILclient!b;II)I")
	public static int method400(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) SoundPcmStream arg8, @OriginalArg(12) int arg9, @OriginalArg(13) int arg10) {
		@Pc(14) int local14;
		if (arg9 == 0 || (local14 = arg3 + (arg7 + arg9 - arg2 - 257) / arg9) > arg6) {
			local14 = arg6;
		}
		arg3 <<= 0x1;
		local14 <<= 0x1;
		@Pc(37) byte local37;
		@Pc(56) int local56;
		@Pc(53) int local53;
		@Pc(55) int local55;
		while (arg3 < local14) {
			@Pc(33) int local33 = arg2 >> 8;
			local37 = arg0[local33];
			local53 = (local37 << 8) + (arg0[local33 + 1] - local37) * (arg2 & 0xFF);
			local55 = arg3;
			local56 = arg3 + 1;
			arg1[local55] += local53 * arg4 >> 6;
			@Pc(67) int local67 = local56;
			arg3 = local56 + 1;
			arg1[local67] += local53 * arg5 >> 6;
			arg2 += arg9;
		}
		if (arg9 == 0 || (local14 = (arg3 >> 1) + (arg7 + arg9 - arg2 - 1) / arg9) > arg6) {
			local14 = arg6;
		}
		local14 <<= 0x1;
		while (arg3 < local14) {
			local37 = arg0[arg2 >> 8];
			local53 = (local37 << 8) + (arg10 - local37) * (arg2 & 0xFF);
			local55 = arg3;
			local56 = arg3 + 1;
			arg1[local55] += local53 * arg4 >> 6;
			local55 = local56;
			arg3 = local56 + 1;
			arg1[local55] += local53 * arg5 >> 6;
			arg2 += arg9;
		}
		arg8.anInt346 = arg2;
		return arg3 >> 1;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(II[B[IIIIIIILclient!b;II)I")
	public static int method422(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) SoundPcmStream arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9) {
		@Pc(14) int local14;
		if (arg8 == 0 || (local14 = arg3 + (arg6 + arg8 - arg2 - 257) / arg8) > arg5) {
			local14 = arg5;
		}
		@Pc(29) byte local29;
		@Pc(31) int local31;
		while (arg3 < local14) {
			@Pc(25) int local25 = arg2 >> 8;
			local29 = arg0[local25];
			local31 = arg3++;
			arg1[local31] += ((local29 << 8) + (arg0[local25 + 1] - local29) * (arg2 & 0xFF)) * arg4 >> 6;
			arg2 += arg8;
		}
		if (arg8 == 0 || (local14 = arg3 + (arg6 + arg8 - arg2 - 1) / arg8) > arg5) {
			local14 = arg5;
		}
		while (arg3 < local14) {
			local29 = arg0[arg2 >> 8];
			local31 = arg3++;
			arg1[local31] += ((local29 << 8) + (arg9 - local29) * (arg2 & 0xFF)) * arg4 >> 6;
			arg2 += arg8;
		}
		arg7.anInt346 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(II)I")
	public static int method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(II)I")
	public static int method419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(II[B[IIIIIIIILclient!b;II)I")
	public static int method420(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) SoundPcmStream arg8, @OriginalArg(12) int arg9, @OriginalArg(13) int arg10) {
		@Pc(14) int local14;
		if (arg9 == 0 || (local14 = arg3 + (arg7 + arg9 + 256 - arg2) / arg9) > arg6) {
			local14 = arg6;
		}
		arg3 <<= 0x1;
		local14 <<= 0x1;
		@Pc(56) int local56;
		@Pc(53) int local53;
		@Pc(55) int local55;
		while (arg3 < local14) {
			@Pc(33) int local33 = arg2 >> 8;
			@Pc(39) byte local39 = arg0[local33 - 1];
			local53 = (local39 << 8) + (arg0[local33] - local39) * (arg2 & 0xFF);
			local55 = arg3;
			local56 = arg3 + 1;
			arg1[local55] += local53 * arg4 >> 6;
			@Pc(67) int local67 = local56;
			arg3 = local56 + 1;
			arg1[local67] += local53 * arg5 >> 6;
			arg2 += arg9;
		}
		if (arg9 == 0 || (local14 = (arg3 >> 1) + (arg7 + arg9 - arg2) / arg9) > arg6) {
			local14 = arg6;
		}
		local14 <<= 0x1;
		while (arg3 < local14) {
			local53 = (arg10 << 8) + (arg0[arg2 >> 8] - arg10) * (arg2 & 0xFF);
			local55 = arg3;
			local56 = arg3 + 1;
			arg1[local55] += local53 * arg4 >> 6;
			local55 = local56;
			arg3 = local56 + 1;
			arg1[local55] += local53 * arg5 >> 6;
			arg2 += arg9;
		}
		arg8.anInt346 = arg2;
		return arg3 >> 1;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "([B[IIIIIIILclient!b;)I")
	public static int method413(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) SoundPcmStream arg7) {
		arg2 >>= 0x8;
		@Pc(7) int local7 = arg6 >> 8;
		@Pc(11) int local11 = arg4 << 2;
		@Pc(20) int local20;
		if ((local20 = arg3 + arg2 + 1 - local7) > arg5) {
			local20 = arg5;
		}
		local20 -= 3;
		@Pc(30) int local30;
		while (arg3 < local20) {
			local30 = arg3++;
			@Pc(33) int local33 = arg1[local30];
			@Pc(36) int local36 = arg2 - 1;
			arg1[local30] = local33 + arg0[arg2] * local11;
			@Pc(43) int local43 = arg3++;
			@Pc(46) int local46 = arg1[local43];
			@Pc(49) int local49 = local36 - 1;
			arg1[local43] = local46 + arg0[local36] * local11;
			@Pc(56) int local56 = arg3++;
			@Pc(59) int local59 = arg1[local56];
			@Pc(62) int local62 = local49 - 1;
			arg1[local56] = local59 + arg0[local49] * local11;
			@Pc(69) int local69 = arg3++;
			@Pc(72) int local72 = arg1[local69];
			arg2 = local62 - 1;
			arg1[local69] = local72 + arg0[local62] * local11;
		}
		local20 += 3;
		while (arg3 < local20) {
			local30 = arg3++;
			arg1[local30] += arg0[arg2--] * local11;
		}
		arg7.anInt346 = arg2 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(II[B[IIIIIIIILclient!b;II)I")
	public static int method415(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) SoundPcmStream arg8, @OriginalArg(12) int arg9, @OriginalArg(13) int arg10) {
		arg8.anInt355 -= arg8.anInt347 * arg3;
		arg8.anInt352 -= arg8.anInt354 * arg3;
		@Pc(32) int local32;
		if (arg9 == 0 || (local32 = arg3 + (arg7 + arg9 + 256 - arg2) / arg9) > arg6) {
			local32 = arg6;
		}
		@Pc(51) int local51;
		while (arg3 < local32) {
			@Pc(43) int local43 = arg2 >> 8;
			@Pc(49) byte local49 = arg0[local43 - 1];
			local51 = arg3++;
			arg1[local51] += ((local49 << 8) + (arg0[local43] - local49) * (arg2 & 0xFF)) * arg4 >> 6;
			arg4 += arg5;
			arg2 += arg9;
		}
		if (arg9 == 0 || (local32 = arg3 + (arg7 + arg9 - arg2) / arg9) > arg6) {
			local32 = arg6;
		}
		while (arg3 < local32) {
			local51 = arg3++;
			arg1[local51] += ((arg10 << 8) + (arg0[arg2 >> 8] - arg10) * (arg2 & 0xFF)) * arg4 >> 6;
			arg4 += arg5;
			arg2 += arg9;
		}
		arg8.anInt355 += arg8.anInt347 * arg3;
		arg8.anInt352 += arg8.anInt354 * arg3;
		arg8.anInt348 = arg4;
		arg8.anInt346 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I[B[IIIIIIIILclient!b;)I")
	public static int method414(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) SoundPcmStream arg8) {
		arg2 >>= 0x8;
		@Pc(7) int local7 = arg7 >> 8;
		@Pc(11) int local11 = arg4 << 2;
		@Pc(15) int local15 = arg5 << 2;
		@Pc(24) int local24;
		if ((local24 = arg3 + arg2 + 1 - local7) > arg6) {
			local24 = arg6;
		}
		arg3 <<= 0x1;
		local24 <<= 0x1;
		local24 -= 6;
		@Pc(45) byte local45;
		@Pc(48) int local48;
		while (arg3 < local24) {
			@Pc(43) int local43 = arg2 - 1;
			local45 = arg0[arg2];
			local48 = arg3 + 1;
			arg1[arg3] += local45 * local11;
			@Pc(58) int local58 = local48 + 1;
			arg1[local48] += local45 * local15;
			@Pc(68) int local68 = local43 - 1;
			@Pc(70) byte local70 = arg0[local43];
			@Pc(73) int local73 = local58 + 1;
			arg1[local58] += local70 * local11;
			@Pc(83) int local83 = local73 + 1;
			arg1[local73] += local70 * local15;
			@Pc(93) int local93 = local68 - 1;
			@Pc(95) byte local95 = arg0[local68];
			@Pc(98) int local98 = local83 + 1;
			arg1[local83] += local95 * local11;
			@Pc(108) int local108 = local98 + 1;
			arg1[local98] += local95 * local15;
			arg2 = local93 - 1;
			@Pc(120) byte local120 = arg0[local93];
			@Pc(123) int local123 = local108 + 1;
			arg1[local108] += local120 * local11;
			arg3 = local123 + 1;
			arg1[local123] += local120 * local15;
		}
		local24 += 6;
		while (arg3 < local24) {
			local45 = arg0[arg2--];
			local48 = arg3 + 1;
			arg1[arg3] += local45 * local11;
			arg3 = local48 + 1;
			arg1[local48] += local45 * local15;
		}
		arg8.anInt346 = arg2 << 8;
		return arg3 >> 1;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(II[B[IIIIIIIIIILclient!b;II)I")
	public static int method407(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9, @OriginalArg(13) SoundPcmStream arg10, @OriginalArg(14) int arg11, @OriginalArg(15) int arg12) {
		arg10.anInt348 -= arg10.anInt344 * arg3;
		@Pc(23) int local23;
		if (arg11 == 0 || (local23 = arg3 + (arg9 + arg11 + 256 - arg2) / arg11) > arg8) {
			local23 = arg8;
		}
		arg3 <<= 0x1;
		local23 <<= 0x1;
		@Pc(65) int local65;
		@Pc(62) int local62;
		@Pc(64) int local64;
		while (arg3 < local23) {
			@Pc(42) int local42 = arg2 >> 8;
			@Pc(48) byte local48 = arg0[local42 - 1];
			local62 = (local48 << 8) + (arg0[local42] - local48) * (arg2 & 0xFF);
			local64 = arg3;
			local65 = arg3 + 1;
			arg1[local64] += local62 * arg4 >> 6;
			arg4 += arg6;
			@Pc(80) int local80 = local65;
			arg3 = local65 + 1;
			arg1[local80] += local62 * arg5 >> 6;
			arg5 += arg7;
			arg2 += arg11;
		}
		if (arg11 == 0 || (local23 = (arg3 >> 1) + (arg9 + arg11 - arg2) / arg11) > arg8) {
			local23 = arg8;
		}
		local23 <<= 0x1;
		while (arg3 < local23) {
			local62 = (arg12 << 8) + (arg0[arg2 >> 8] - arg12) * (arg2 & 0xFF);
			local64 = arg3;
			local65 = arg3 + 1;
			arg1[local64] += local62 * arg4 >> 6;
			arg4 += arg6;
			local64 = local65;
			arg3 = local65 + 1;
			arg1[local64] += local62 * arg5 >> 6;
			arg5 += arg7;
			arg2 += arg11;
		}
		local65 = arg3 >> 1;
		arg10.anInt348 += arg10.anInt344 * local65;
		arg10.anInt355 = arg4;
		arg10.anInt352 = arg5;
		arg10.anInt346 = arg2;
		return local65;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I[B[IIIIIIIIIILclient!b;)I")
	public static int method402(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) SoundPcmStream arg10) {
		arg2 >>= 0x8;
		@Pc(7) int local7 = arg9 >> 8;
		arg4 <<= 0x2;
		arg5 <<= 0x2;
		@Pc(19) int local19 = arg6 << 2;
		@Pc(23) int local23 = arg7 << 2;
		@Pc(32) int local32;
		if ((local32 = arg3 + arg2 + 1 - local7) > arg8) {
			local32 = arg8;
		}
		arg10.anInt348 += arg10.anInt344 * (local32 - arg3);
		arg3 <<= 0x1;
		local32 <<= 0x1;
		local32 -= 6;
		@Pc(64) byte local64;
		@Pc(67) int local67;
		while (arg3 < local32) {
			@Pc(62) int local62 = arg2 - 1;
			local64 = arg0[arg2];
			local67 = arg3 + 1;
			arg1[arg3] += local64 * arg4;
			@Pc(78) int local78 = arg4 + local19;
			@Pc(81) int local81 = local67 + 1;
			arg1[local67] += local64 * arg5;
			@Pc(92) int local92 = arg5 + local23;
			@Pc(95) int local95 = local62 - 1;
			@Pc(97) byte local97 = arg0[local62];
			@Pc(100) int local100 = local81 + 1;
			arg1[local81] += local97 * local78;
			@Pc(111) int local111 = local78 + local19;
			@Pc(114) int local114 = local100 + 1;
			arg1[local100] += local97 * local92;
			@Pc(125) int local125 = local92 + local23;
			@Pc(128) int local128 = local95 - 1;
			@Pc(130) byte local130 = arg0[local95];
			@Pc(133) int local133 = local114 + 1;
			arg1[local114] += local130 * local111;
			@Pc(144) int local144 = local111 + local19;
			@Pc(147) int local147 = local133 + 1;
			arg1[local133] += local130 * local125;
			@Pc(158) int local158 = local125 + local23;
			arg2 = local128 - 1;
			@Pc(163) byte local163 = arg0[local128];
			@Pc(166) int local166 = local147 + 1;
			arg1[local147] += local163 * local144;
			arg4 = local144 + local19;
			arg3 = local166 + 1;
			arg1[local166] += local163 * local158;
			arg5 = local158 + local23;
		}
		local32 += 6;
		while (arg3 < local32) {
			local64 = arg0[arg2--];
			local67 = arg3 + 1;
			arg1[arg3] += local64 * arg4;
			arg4 += local19;
			arg3 = local67 + 1;
			arg1[local67] += local64 * arg5;
			arg5 += local23;
		}
		arg10.anInt355 = arg4 >> 2;
		arg10.anInt352 = arg5 >> 2;
		arg10.anInt346 = arg2 << 8;
		return arg3 >> 1;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "([III)V")
	@Override
	public final synchronized void read(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.volume == 0 && this.anInt351 == 0) {
			this.skip(arg2);
			return;
		}
		@Pc(13) PcmSound local13 = (PcmSound) this.sound;
		@Pc(18) int local18 = this.start << 8;
		@Pc(23) int local23 = this.end << 8;
		@Pc(29) int local29 = local13.samples.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt350 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt346 < 0) {
			if (this.anInt342 <= 0) {
				this.method406();
				this.unlink();
				return;
			}
			this.anInt346 = 0;
		}
		if (this.anInt346 >= local29) {
			if (this.anInt342 >= 0) {
				this.method406();
				this.unlink();
				return;
			}
			this.anInt346 = local29 - 1;
		}
		if (this.anInt350 >= 0) {
			if (this.anInt350 > 0) {
				if (this.aBoolean14) {
					label131:
					{
						if (this.anInt342 < 0) {
							local40 = this.method403(arg0, arg1, local18, local44, local13.samples[this.start]);
							if (this.anInt346 >= local18) {
								return;
							}
							this.anInt346 = local18 + local18 - this.anInt346 - 1;
							this.anInt342 = -this.anInt342;
							if (--this.anInt350 == 0) {
								break label131;
							}
						}
						do {
							local40 = this.method385(arg0, local40, local23, local44, local13.samples[this.end - 1]);
							if (this.anInt346 < local23) {
								return;
							}
							this.anInt346 = local23 + local23 - this.anInt346 - 1;
							this.anInt342 = -this.anInt342;
							if (--this.anInt350 == 0) {
								break;
							}
							local40 = this.method403(arg0, local40, local18, local44, local13.samples[this.start]);
							if (this.anInt346 >= local18) {
								return;
							}
							this.anInt346 = local18 + local18 - this.anInt346 - 1;
							this.anInt342 = -this.anInt342;
						} while (--this.anInt350 != 0);
					}
				} else {
					@Pc(417) int local417;
					if (this.anInt342 < 0) {
						while (true) {
							local40 = this.method403(arg0, local40, local18, local44, local13.samples[this.end - 1]);
							if (this.anInt346 >= local18) {
								return;
							}
							local417 = (local23 - this.anInt346 - 1) / local33;
							if (local417 >= this.anInt350) {
								this.anInt346 += local33 * this.anInt350;
								this.anInt350 = 0;
								break;
							}
							this.anInt346 += local33 * local417;
							this.anInt350 -= local417;
						}
					} else {
						while (true) {
							local40 = this.method385(arg0, local40, local23, local44, local13.samples[this.start]);
							if (this.anInt346 < local23) {
								return;
							}
							local417 = (this.anInt346 - local18) / local33;
							if (local417 >= this.anInt350) {
								this.anInt346 -= local33 * this.anInt350;
								this.anInt350 = 0;
								break;
							}
							this.anInt346 -= local33 * local417;
							this.anInt350 -= local417;
						}
					}
				}
			}
			if (this.anInt342 < 0) {
				this.method403(arg0, local40, 0, local44, 0);
				if (this.anInt346 < 0) {
					this.anInt346 = -1;
					this.method406();
					this.unlink();
				}
			} else {
				this.method385(arg0, local40, local29, local44, 0);
				if (this.anInt346 >= local29) {
					this.anInt346 = local29;
					this.method406();
					this.unlink();
				}
			}
		} else if (this.aBoolean14) {
			if (this.anInt342 < 0) {
				local40 = this.method403(arg0, arg1, local18, local44, local13.samples[this.start]);
				if (this.anInt346 >= local18) {
					return;
				}
				this.anInt346 = local18 + local18 - this.anInt346 - 1;
				this.anInt342 = -this.anInt342;
			}
			while (true) {
				local40 = this.method385(arg0, local40, local23, local44, local13.samples[this.end - 1]);
				if (this.anInt346 < local23) {
					return;
				}
				this.anInt346 = local23 + local23 - this.anInt346 - 1;
				this.anInt342 = -this.anInt342;
				local40 = this.method403(arg0, local40, local18, local44, local13.samples[this.start]);
				if (this.anInt346 >= local18) {
					return;
				}
				this.anInt346 = local18 + local18 - this.anInt346 - 1;
				this.anInt342 = -this.anInt342;
			}
		} else if (this.anInt342 < 0) {
			while (true) {
				local40 = this.method403(arg0, local40, local18, local44, local13.samples[this.end - 1]);
				if (this.anInt346 >= local18) {
					return;
				}
				this.anInt346 = local23 - (local23 - 1 - this.anInt346) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method385(arg0, local40, local23, local44, local13.samples[this.start]);
				if (this.anInt346 < local23) {
					return;
				}
				this.anInt346 = local18 + (this.anInt346 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "()Z")
	private boolean method383() {
		@Pc(2) int local2 = this.volume;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = method419(local2, this.pan);
			local8 = method421(local2, this.pan);
		}
		if (this.anInt348 != local2 || this.anInt355 != local10 || this.anInt352 != local8) {
			if (this.anInt348 < local2) {
				this.anInt344 = 1;
				this.anInt351 = local2 - this.anInt348;
			} else if (this.anInt348 > local2) {
				this.anInt344 = -1;
				this.anInt351 = this.anInt348 - local2;
			} else {
				this.anInt344 = 0;
			}
			if (this.anInt355 < local10) {
				this.anInt347 = 1;
				if (this.anInt351 == 0 || this.anInt351 > local10 - this.anInt355) {
					this.anInt351 = local10 - this.anInt355;
				}
			} else if (this.anInt355 > local10) {
				this.anInt347 = -1;
				if (this.anInt351 == 0 || this.anInt351 > this.anInt355 - local10) {
					this.anInt351 = this.anInt355 - local10;
				}
			} else {
				this.anInt347 = 0;
			}
			if (this.anInt352 < local8) {
				this.anInt354 = 1;
				if (this.anInt351 == 0 || this.anInt351 > local8 - this.anInt352) {
					this.anInt351 = local8 - this.anInt352;
				}
			} else if (this.anInt352 > local8) {
				this.anInt354 = -1;
				if (this.anInt351 == 0 || this.anInt351 > this.anInt352 - local8) {
					this.anInt351 = this.anInt352 - local8;
				}
			} else {
				this.anInt354 = 0;
			}
			return false;
		} else if (this.volume == Integer.MIN_VALUE) {
			this.volume = 0;
			this.anInt348 = this.anInt355 = this.anInt352 = 0;
			this.unlink();
			return true;
		} else {
			this.method416();
			return false;
		}
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V")
	public final synchronized void method384(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method397();
			this.unlink();
		} else if (this.anInt355 == 0 && this.anInt352 == 0) {
			this.anInt351 = 0;
			this.volume = 0;
			this.anInt348 = 0;
			this.unlink();
		} else {
			@Pc(31) int local31 = -this.anInt348;
			if (this.anInt348 > local31) {
				local31 = this.anInt348;
			}
			if (-this.anInt355 > local31) {
				local31 = -this.anInt355;
			}
			if (this.anInt355 > local31) {
				local31 = this.anInt355;
			}
			if (-this.anInt352 > local31) {
				local31 = -this.anInt352;
			}
			if (this.anInt352 > local31) {
				local31 = this.anInt352;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt351 = arg0;
			this.volume = Integer.MIN_VALUE;
			this.anInt344 = -this.anInt348 / arg0;
			this.anInt347 = -this.anInt355 / arg0;
			this.anInt354 = -this.anInt352 / arg0;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([IIIII)I")
	private int method385(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt351 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt351;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt351 += arg1;
				if (this.anInt342 == 256 && (this.anInt346 & 0xFF) == 0) {
					if (AudioChannel.stereo) {
						arg1 = method393(((PcmSound) this.sound).samples, arg0, this.anInt346, arg1, this.anInt355, this.anInt352, this.anInt347, this.anInt354, local7, arg2, this);
					} else {
						arg1 = method395(((PcmSound) this.sound).samples, arg0, this.anInt346, arg1, this.anInt348, this.anInt344, local7, arg2, this);
					}
				} else if (AudioChannel.stereo) {
					arg1 = method388(((PcmSound) this.sound).samples, arg0, this.anInt346, arg1, this.anInt355, this.anInt352, this.anInt347, this.anInt354, local7, arg2, this, this.anInt342, arg4);
				} else {
					arg1 = method389(((PcmSound) this.sound).samples, arg0, this.anInt346, arg1, this.anInt348, this.anInt344, local7, arg2, this, this.anInt342, arg4);
				}
				this.anInt351 -= arg1;
				if (this.anInt351 != 0) {
					return arg1;
				}
				if (!this.method383()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt342 == 256 && (this.anInt346 & 0xFF) == 0) {
				if (AudioChannel.stereo) {
					return method387(((PcmSound) this.sound).samples, arg0, this.anInt346, arg1, this.anInt355, this.anInt352, arg3, arg2, this);
				}
				return method391(((PcmSound) this.sound).samples, arg0, this.anInt346, arg1, this.anInt348, arg3, arg2, this);
			}
			if (AudioChannel.stereo) {
				return method400(((PcmSound) this.sound).samples, arg0, this.anInt346, arg1, this.anInt355, this.anInt352, arg3, arg2, this, this.anInt342, arg4);
			}
			return method422(((PcmSound) this.sound).samples, arg0, this.anInt346, arg1, this.anInt348, arg3, arg2, this, this.anInt342, arg4);
		}
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(I)V")
	public final synchronized void setVolume(@OriginalArg(0) int arg0) {
		this.method408(arg0 << 6, this.getPan());
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "()I")
	@Override
	public final int method4407() {
		@Pc(6) int local6 = this.anInt348 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt350 == 0) {
			local6 -= local6 * this.anInt346 / (((PcmSound) this.sound).samples.length << 8);
		} else if (this.anInt350 >= 0) {
			local6 -= local6 * this.start / ((PcmSound) this.sound).samples.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "()I")
	@Override
	public final int method4404() {
		return this.volume == 0 && this.anInt351 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "()I")
	public final synchronized int getVolume() {
		return this.volume == Integer.MIN_VALUE ? 0 : this.volume;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
	@Override
	public final synchronized void skip(@OriginalArg(0) int arg0) {
		if (this.anInt351 > 0) {
			if (arg0 >= this.anInt351) {
				if (this.volume == Integer.MIN_VALUE) {
					this.volume = 0;
					this.anInt348 = this.anInt355 = this.anInt352 = 0;
					this.unlink();
					arg0 = this.anInt351;
				}
				this.anInt351 = 0;
				this.method416();
			} else {
				this.anInt348 += this.anInt344 * arg0;
				this.anInt355 += this.anInt347 * arg0;
				this.anInt352 += this.anInt354 * arg0;
				this.anInt351 -= arg0;
			}
		}
		@Pc(71) PcmSound local71 = (PcmSound) this.sound;
		@Pc(76) int local76 = this.start << 8;
		@Pc(81) int local81 = this.end << 8;
		@Pc(87) int local87 = local71.samples.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt350 = 0;
		}
		if (this.anInt346 < 0) {
			if (this.anInt342 <= 0) {
				this.method406();
				this.unlink();
				return;
			}
			this.anInt346 = 0;
		}
		if (this.anInt346 >= local87) {
			if (this.anInt342 >= 0) {
				this.method406();
				this.unlink();
				return;
			}
			this.anInt346 = local87 - 1;
		}
		this.anInt346 += this.anInt342 * arg0;
		if (this.anInt350 >= 0) {
			if (this.anInt350 > 0) {
				if (this.aBoolean14) {
					label121:
					{
						if (this.anInt342 < 0) {
							if (this.anInt346 >= local76) {
								return;
							}
							this.anInt346 = local76 + local76 - this.anInt346 - 1;
							this.anInt342 = -this.anInt342;
							if (--this.anInt350 == 0) {
								break label121;
							}
						}
						do {
							if (this.anInt346 < local81) {
								return;
							}
							this.anInt346 = local81 + local81 - this.anInt346 - 1;
							this.anInt342 = -this.anInt342;
							if (--this.anInt350 == 0) {
								break;
							}
							if (this.anInt346 >= local76) {
								return;
							}
							this.anInt346 = local76 + local76 - this.anInt346 - 1;
							this.anInt342 = -this.anInt342;
						} while (--this.anInt350 != 0);
					}
				} else {
					label153:
					{
						@Pc(362) int local362;
						if (this.anInt342 < 0) {
							if (this.anInt346 >= local76) {
								return;
							}
							local362 = (local81 - this.anInt346 - 1) / local91;
							if (local362 >= this.anInt350) {
								this.anInt346 += local91 * this.anInt350;
								this.anInt350 = 0;
								break label153;
							}
							this.anInt346 += local91 * local362;
							this.anInt350 -= local362;
						} else if (this.anInt346 >= local81) {
							local362 = (this.anInt346 - local76) / local91;
							if (local362 >= this.anInt350) {
								this.anInt346 -= local91 * this.anInt350;
								this.anInt350 = 0;
								break label153;
							}
							this.anInt346 -= local91 * local362;
							this.anInt350 -= local362;
						} else {
							return;
						}
						return;
					}
				}
			}
			if (this.anInt342 < 0) {
				if (this.anInt346 < 0) {
					this.anInt346 = -1;
					this.method406();
					this.unlink();
				}
			} else if (this.anInt346 >= local87) {
				this.anInt346 = local87;
				this.method406();
				this.unlink();
			}
		} else if (this.aBoolean14) {
			if (this.anInt342 < 0) {
				if (this.anInt346 >= local76) {
					return;
				}
				this.anInt346 = local76 + local76 - this.anInt346 - 1;
				this.anInt342 = -this.anInt342;
			}
			while (this.anInt346 >= local81) {
				this.anInt346 = local81 + local81 - this.anInt346 - 1;
				this.anInt342 = -this.anInt342;
				if (this.anInt346 >= local76) {
					return;
				}
				this.anInt346 = local76 + local76 - this.anInt346 - 1;
				this.anInt342 = -this.anInt342;
			}
		} else if (this.anInt342 < 0) {
			if (this.anInt346 >= local76) {
				return;
			}
			this.anInt346 = local81 - (local81 - 1 - this.anInt346) % local91 - 1;
		} else if (this.anInt346 >= local81) {
			this.anInt346 = local76 + (this.anInt346 - local76) % local91;
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "(I)V")
	public final synchronized void setLoops(@OriginalArg(0) int arg0) {
		this.anInt350 = arg0;
	}

	@OriginalMember(owner = "client!b", name = "g", descriptor = "(I)V")
	private synchronized void method397() {
		this.method408(0, this.getPan());
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(II)V")
	public final synchronized void method398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method417(arg0, arg1, this.getPan());
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "()Lclient!qb;")
	@Override
	public final PcmStream firstSubStream() {
		return null;
	}

	@OriginalMember(owner = "client!b", name = "h", descriptor = "(I)V")
	public final synchronized void method401(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((PcmSound) this.sound).samples.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt346 = arg0;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "([IIIII)I")
	private int method403(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt351 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt351;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt351 += arg1;
				if (this.anInt342 == -256 && (this.anInt346 & 0xFF) == 0) {
					if (AudioChannel.stereo) {
						arg1 = method402(((PcmSound) this.sound).samples, arg0, this.anInt346, arg1, this.anInt355, this.anInt352, this.anInt347, this.anInt354, local7, arg2, this);
					} else {
						arg1 = method394(((PcmSound) this.sound).samples, arg0, this.anInt346, arg1, this.anInt348, this.anInt344, local7, arg2, this);
					}
				} else if (AudioChannel.stereo) {
					arg1 = method407(((PcmSound) this.sound).samples, arg0, this.anInt346, arg1, this.anInt355, this.anInt352, this.anInt347, this.anInt354, local7, arg2, this, this.anInt342, arg4);
				} else {
					arg1 = method415(((PcmSound) this.sound).samples, arg0, this.anInt346, arg1, this.anInt348, this.anInt344, local7, arg2, this, this.anInt342, arg4);
				}
				this.anInt351 -= arg1;
				if (this.anInt351 != 0) {
					return arg1;
				}
				if (!this.method383()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt342 == -256 && (this.anInt346 & 0xFF) == 0) {
				if (AudioChannel.stereo) {
					return method414(((PcmSound) this.sound).samples, arg0, this.anInt346, arg1, this.anInt355, this.anInt352, arg3, arg2, this);
				}
				return method413(((PcmSound) this.sound).samples, arg0, this.anInt346, arg1, this.anInt348, arg3, arg2, this);
			}
			if (AudioChannel.stereo) {
				return method420(((PcmSound) this.sound).samples, arg0, this.anInt346, arg1, this.anInt355, this.anInt352, arg3, arg2, this, this.anInt342, arg4);
			}
			return method390(((PcmSound) this.sound).samples, arg0, this.anInt346, arg1, this.anInt348, arg3, arg2, this, this.anInt342, arg4);
		}
	}

	@OriginalMember(owner = "client!b", name = "g", descriptor = "()I")
	public final synchronized int method405() {
		return this.anInt342 < 0 ? -this.anInt342 : this.anInt342;
	}

	@OriginalMember(owner = "client!b", name = "h", descriptor = "()V")
	private void method406() {
		if (this.anInt351 == 0) {
			return;
		}
		if (this.volume == Integer.MIN_VALUE) {
			this.volume = 0;
		}
		this.anInt351 = 0;
		this.method416();
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(II)V")
	private synchronized void method408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.volume = arg0;
		this.pan = arg1;
		this.anInt351 = 0;
		this.method416();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V")
	public final synchronized void method409() {
		this.anInt342 = (this.anInt342 ^ this.anInt342 >> 31) + (this.anInt342 >>> 31);
		this.anInt342 = -this.anInt342;
	}

	@OriginalMember(owner = "client!b", name = "i", descriptor = "(I)V")
	public final synchronized void method410(@OriginalArg(0) int arg0) {
		if (this.anInt342 < 0) {
			this.anInt342 = -arg0;
		} else {
			this.anInt342 = arg0;
		}
	}

	@OriginalMember(owner = "client!b", name = "i", descriptor = "()Z")
	public final boolean method411() {
		return this.anInt346 < 0 || this.anInt346 >= ((PcmSound) this.sound).samples.length << 8;
	}

	@OriginalMember(owner = "client!b", name = "j", descriptor = "()Z")
	public final boolean method412() {
		return this.anInt351 != 0;
	}

	@OriginalMember(owner = "client!b", name = "k", descriptor = "()V")
	private void method416() {
		this.anInt348 = this.volume;
		this.anInt355 = method419(this.volume, this.pan);
		this.anInt352 = method421(this.volume, this.pan);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III)V")
	public final synchronized void method417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method408(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = method419(arg1, arg2);
		@Pc(14) int local14 = method421(arg1, arg2);
		if (this.anInt355 == local10 && this.anInt352 == local14) {
			this.anInt351 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt348;
		if (this.anInt348 - arg1 > local31) {
			local31 = this.anInt348 - arg1;
		}
		if (local10 - this.anInt355 > local31) {
			local31 = local10 - this.anInt355;
		}
		if (this.anInt355 - local10 > local31) {
			local31 = this.anInt355 - local10;
		}
		if (local14 - this.anInt352 > local31) {
			local31 = local14 - this.anInt352;
		}
		if (this.anInt352 - local14 > local31) {
			local31 = this.anInt352 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt351 = arg0;
		this.volume = arg1;
		this.pan = arg2;
		this.anInt344 = (arg1 - this.anInt348) / arg0;
		this.anInt347 = (local10 - this.anInt355) / arg0;
		this.anInt354 = (local14 - this.anInt352) / arg0;
	}

	@OriginalMember(owner = "client!b", name = "l", descriptor = "()I")
	public final synchronized int getPan() {
		return this.pan < 0 ? -1 : this.pan;
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "()Lclient!qb;")
	@Override
	public final PcmStream nextSubStream() {
		return null;
	}
}
