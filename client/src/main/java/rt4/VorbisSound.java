package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class VorbisSound extends Node {

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "[F")
	public static float[] trigB1;
	@OriginalMember(owner = "client!jc", name = "q", descriptor = "[F")
	public static float[] trigC1;
	@OriginalMember(owner = "client!jc", name = "t", descriptor = "[I")
	public static int[] bitReverse0;
	@OriginalMember(owner = "client!jc", name = "u", descriptor = "[Lclient!vb;")
	public static VorbisResidue[] residues;
	@OriginalMember(owner = "client!jc", name = "v", descriptor = "[Z")
	public static boolean[] modeBlockFlags;
	@OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
	public static int blockSize1;
	@OriginalMember(owner = "client!jc", name = "A", descriptor = "[Lclient!uk;")
	public static VorbisMapping[] mappings;
	@OriginalMember(owner = "client!jc", name = "B", descriptor = "[F")
	public static float[] trigA1;
	@OriginalMember(owner = "client!jc", name = "C", descriptor = "[F")
	public static float[] trigA0;
	@OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
	public static int blockSize0;
	@OriginalMember(owner = "client!jc", name = "F", descriptor = "[F")
	public static float[] vector;
	@OriginalMember(owner = "client!jc", name = "I", descriptor = "[Lclient!ji;")
	public static VorbisCodebook[] codebooks;
	@OriginalMember(owner = "client!jc", name = "J", descriptor = "[Lclient!ie;")
	public static VorbisFloor[] floors;
	@OriginalMember(owner = "client!jc", name = "L", descriptor = "[I")
	public static int[] bitReverse1;
	@OriginalMember(owner = "client!jc", name = "P", descriptor = "[F")
	public static float[] trigB0;
	@OriginalMember(owner = "client!jc", name = "S", descriptor = "[F")
	public static float[] trigC0;
	@OriginalMember(owner = "client!jc", name = "W", descriptor = "[I")
	public static int[] modeMappings;
	@OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
	private static int position;
	@OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
	private static int bitPosition;
	@OriginalMember(owner = "client!jc", name = "T", descriptor = "[B")
	private static byte[] bytes;
	@OriginalMember(owner = "client!jc", name = "H", descriptor = "Z")
	private static boolean aBoolean149 = false;
	@OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
	private int prevN;

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
	private int samplesLen;

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "[F")
	private float[] prevVector;

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "Z")
	private boolean aBoolean148;

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
	private int start;

	@OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
	private int end;

	@OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
	private int rate;

	@OriginalMember(owner = "client!jc", name = "M", descriptor = "[[B")
	private byte[][] packets;

	@OriginalMember(owner = "client!jc", name = "N", descriptor = "Z")
	private boolean prevNoResidue;

	@OriginalMember(owner = "client!jc", name = "O", descriptor = "I")
	private int prevQuarter;

	@OriginalMember(owner = "client!jc", name = "R", descriptor = "[B")
	private byte[] samples;

	@OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
	private int packetIndex;

	@OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
	private int sampleIndex;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([B)V")
	public VorbisSound(@OriginalArg(0) byte[] bytes) {
		this.decode(bytes);
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)F")
	public static float float32Unpack(@OriginalArg(0) int x) {
		@Pc(3) int mantissa = x & 0x1FFFFF;
		@Pc(7) int sign = x & Integer.MIN_VALUE;
		@Pc(13) int exponent = x >> 21 & 0x3FF;
		if (sign != 0) {
			mantissa = -mantissa;
		}
		return (float) ((double) mantissa * Math.pow(2.0D, exponent - 788));
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ve;)Z")
	private static boolean method2344(@OriginalArg(0) Js5 arg0) {
		if (!aBoolean149) {
			@Pc(7) byte[] local7 = arg0.fetchFile(0, 0);
			if (local7 == null) {
				return false;
			}
			method2349(local7);
			aBoolean149 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ve;II)Lclient!jc;")
	public static VorbisSound create(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method2344(arg0)) {
			@Pc(16) byte[] local16 = arg0.fetchFile(arg1, arg2);
			return local16 == null ? null : new VorbisSound(local16);
		} else {
			arg0.isFileReady(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "()I")
	public static int readBit() {
		@Pc(7) int local7 = bytes[position] >> bitPosition & 0x1;
		bitPosition++;
		position += bitPosition >> 3;
		bitPosition &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([BI)V")
	public static void setBytes(@OriginalArg(0) byte[] arg0) {
		bytes = arg0;
		position = 0;
		bitPosition = 0;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "([B)V")
	private static void method2349(@OriginalArg(0) byte[] arg0) {
		setBytes(arg0);
		blockSize0 = 0x1 << readBits(4);
		blockSize1 = 0x1 << readBits(4);
		vector = new float[blockSize1];
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		for (local17 = 0; local17 < 2; local17++) {
			local26 = local17 == 0 ? blockSize0 : blockSize1;
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
			@Pc(193) int local193 = IntUtils.bitCount(local38 - 1);
			for (@Pc(195) int local195 = 0; local195 < local38; local195++) {
				local187[local195] = IntUtils.bitReverse(local193, local195);
			}
			if (local17 == 0) {
				trigA0 = local41;
				trigB0 = local86;
				trigC0 = local138;
				bitReverse0 = local187;
			} else {
				trigA1 = local41;
				trigB1 = local86;
				trigC1 = local138;
				bitReverse1 = local187;
			}
		}
		local17 = readBits(8) + 1;
		codebooks = new VorbisCodebook[local17];
		for (local26 = 0; local26 < local17; local26++) {
			codebooks[local26] = new VorbisCodebook();
		}
		local26 = readBits(6) + 1;
		for (local30 = 0; local30 < local26; local30++) {
			readBits(16);
		}
		local26 = readBits(6) + 1;
		floors = new VorbisFloor[local26];
		for (local30 = 0; local30 < local26; local30++) {
			floors[local30] = new VorbisFloor();
		}
		local30 = readBits(6) + 1;
		residues = new VorbisResidue[local30];
		for (local34 = 0; local34 < local30; local34++) {
			residues[local34] = new VorbisResidue();
		}
		local34 = readBits(6) + 1;
		mappings = new VorbisMapping[local34];
		for (local38 = 0; local38 < local34; local38++) {
			mappings[local38] = new VorbisMapping();
		}
		local38 = readBits(6) + 1;
		modeBlockFlags = new boolean[local38];
		modeMappings = new int[local38];
		for (@Pc(340) int local340 = 0; local340 < local38; local340++) {
			modeBlockFlags[local340] = readBit() != 0;
			readBits(16);
			readBits(16);
			modeMappings[local340] = readBits(8);
		}
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)I")
	public static int readBits(@OriginalArg(0) int len) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(12) int local12;
		while (len >= 8 - bitPosition) {
			local12 = 8 - bitPosition;
			@Pc(18) int local18 = (0x1 << local12) - 1;
			local1 += (bytes[position] >> bitPosition & local18) << local3;
			bitPosition = 0;
			position++;
			local3 += local12;
			len -= local12;
		}
		if (len > 0) {
			local12 = (0x1 << len) - 1;
			local1 += (bytes[position] >> bitPosition & local12) << local3;
			bitPosition += len;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([I)Lclient!kj;")
	public final PcmSound toPcmSound(@OriginalArg(0) int[] arg0) {
		if (arg0 != null && arg0[0] <= 0) {
			return null;
		}
		if (this.samples == null) {
			this.prevN = 0;
			this.prevVector = new float[blockSize1];
			this.samples = new byte[this.samplesLen];
			this.sampleIndex = 0;
			this.packetIndex = 0;
		}
		while (this.packetIndex < this.packets.length) {
			if (arg0 != null && arg0[0] <= 0) {
				return null;
			}
			@Pc(47) float[] local47 = this.decodePacket(this.packetIndex);
			if (local47 != null) {
				@Pc(52) int local52 = this.sampleIndex;
				@Pc(55) int local55 = local47.length;
				if (local55 > this.samplesLen - local52) {
					local55 = this.samplesLen - local52;
				}
				for (@Pc(68) int local68 = 0; local68 < local55; local68++) {
					@Pc(80) int local80 = (int) (local47[local68] * 128.0F + 128.0F);
					if ((local80 & 0xFFFFFF00) != 0) {
						local80 = ~local80 >> 31;
					}
					this.samples[local52++] = (byte) (local80 - 128);
				}
				if (arg0 != null) {
					arg0[0] -= local52 - this.sampleIndex;
				}
				this.sampleIndex = local52;
			}
			this.packetIndex++;
		}
		this.prevVector = null;
		@Pc(129) byte[] local129 = this.samples;
		this.samples = null;
		return new PcmSound(this.rate, local129, this.start, this.end, this.aBoolean148);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([B)V")
	private void decode(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Buffer buffer = new Buffer(arg0);
		this.rate = buffer.g4();
		this.samplesLen = buffer.g4();
		this.start = buffer.g4();
		this.end = buffer.g4();
		if (this.end < 0) {
			this.end = ~this.end;
			this.aBoolean148 = true;
		}
		@Pc(40) int packetsLen = buffer.g4();
		this.packets = new byte[packetsLen][];
		for (@Pc(46) int i = 0; i < packetsLen; i++) {
			@Pc(51) int len = 0;
			@Pc(55) int n;
			do {
				n = buffer.g1();
				len += n;
			} while (n >= 255);
			@Pc(67) byte[] packet = new byte[len];
			buffer.gdata(len, packet);
			this.packets[i] = packet;
		}
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)[F")
	private float[] decodePacket(@OriginalArg(0) int index) {
		setBytes(this.packets[index]);
		readBit();
		@Pc(15) int modeNumber = readBits(IntUtils.bitCount(modeMappings.length - 1));
		@Pc(19) boolean modeBlockFlag = modeBlockFlags[modeNumber];
		@Pc(25) int n = modeBlockFlag ? blockSize1 : blockSize0;
		@Pc(27) boolean previousWindowFlag = false;
		@Pc(29) boolean nextWindowFlag = false;
		if (modeBlockFlag) {
			previousWindowFlag = readBit() != 0;
			nextWindowFlag = readBit() != 0;
		}
		@Pc(47) int windowCenter = n >> 1;
		@Pc(59) int leftWindowStart;
		@Pc(67) int leftWindowEnd;
		@Pc(71) int leftN;
		if (modeBlockFlag && !previousWindowFlag) {
			leftWindowStart = (n >> 2) - (blockSize0 >> 2);
			leftWindowEnd = (n >> 2) + (blockSize0 >> 2);
			leftN = blockSize0 >> 1;
		} else {
			leftWindowStart = 0;
			leftWindowEnd = windowCenter;
			leftN = n >> 1;
		}
		@Pc(94) int rightWindowStart;
		@Pc(104) int rightWindowEnd;
		@Pc(108) int rightN;
		if (modeBlockFlag && !nextWindowFlag) {
			rightWindowStart = n - (n >> 2) - (blockSize0 >> 2);
			rightWindowEnd = n + (blockSize0 >> 2) - (n >> 2);
			rightN = blockSize0 >> 1;
		} else {
			rightWindowStart = windowCenter;
			rightWindowEnd = n;
			rightN = n >> 1;
		}
		@Pc(123) VorbisMapping mapping = mappings[modeMappings[modeNumber]];
		@Pc(126) int submapNumber = mapping.mux;
		@Pc(131) int floorNumber = mapping.submapFloor[submapNumber];
		@Pc(140) boolean noResidue = !floors[floorNumber].decodePacket();
		for (@Pc(144) int local144 = 0; local144 < mapping.submaps; local144++) {
			@Pc(155) VorbisResidue residue = residues[mapping.submapResidue[local144]];
			@Pc(157) float[] vector = VorbisSound.vector;
			residue.synthesize(vector, n >> 1, noResidue);
		}
		@Pc(176) int floorNumber2;
		if (!noResidue) {
			floorNumber = mapping.mux;
			floorNumber2 = mapping.submapFloor[floorNumber];
			floors[floorNumber2].synthesize(vector, n >> 1);
		}
		@Pc(212) int local212;
		if (noResidue) {
			for (floorNumber = n >> 1; floorNumber < n; floorNumber++) {
				vector[floorNumber] = 0.0F;
			}
		} else {
			int n2 = n >> 1;
			int n4 = n >> 2;
			int n8 = n >> 3;
			@Pc(214) float[] vector = VorbisSound.vector;
			for (int k = 0; k < n2; k++) {
				vector[k] *= 0.5F;
			}
			for (int k = n2; k < n; k++) {
				vector[k] = -vector[n - k - 1];
			}
			@Pc(252) float[] local252 = modeBlockFlag ? trigA1 : trigA0;
			@Pc(258) float[] local258 = modeBlockFlag ? trigB1 : trigB0;
			@Pc(264) float[] local264 = modeBlockFlag ? trigC1 : trigC0;
			@Pc(270) int[] local270 = modeBlockFlag ? bitReverse1 : bitReverse0;
			@Pc(272) int k;
			@Pc(291) float a;
			@Pc(309) float b;
			@Pc(315) float c;
			@Pc(323) float d;
			for (k = 0; k < n4; k++) {
				a = vector[k * 4] - vector[n - k * 4 - 1];
				b = vector[k * 4 + 2] - vector[n - k * 4 - 3];
				c = local252[k * 2];
				d = local252[k * 2 + 1];
				vector[n - k * 4 - 1] = a * c - b * d;
				vector[n - k * 4 - 3] = a * d + b * c;
			}
			@Pc(432) float e;
			@Pc(442) float f;
			for (k = 0; k < n8; k++) {
				a = vector[n2 + k * 4 + 3];
				b = vector[n2 + k * 4 + 1];
				c = vector[k * 4 + 3];
				d = vector[k * 4 + 1];
				vector[n2 + k * 4 + 3] = a + c;
				vector[n2 + k * 4 + 1] = b + d;
				e = local252[n2 - k * 4 - 4];
				f = local252[n2 - k * 4 - 3];
				vector[k * 4 + 3] = (a - c) * e - (b - d) * f;
				vector[k * 4 + 1] = (b - d) * e + (a - c) * f;
			}
			int logN = IntUtils.bitCount(n - 1);
			@Pc(488) int l;
			@Pc(499) int k0;
			@Pc(503) int k1;
			@Pc(505) int s;
			for (l = 0; l < logN - 3; l++) {
				k0 = n >> l + 2;
				k1 = 0x8 << l;
				for (s = 0; s < 0x2 << l; s++) {
					@Pc(518) int local518 = n - k0 * 2 * s;
					@Pc(528) int local528 = n - k0 * (s * 2 + 1);
					for (@Pc(530) int local530 = 0; local530 < n >> l + 4; local530++) {
						@Pc(541) int local541 = local530 * 4;
						@Pc(549) float local549 = vector[local518 - local541 - 1];
						@Pc(557) float local557 = vector[local518 - local541 - 3];
						@Pc(565) float local565 = vector[local528 - local541 - 1];
						@Pc(573) float local573 = vector[local528 - local541 - 3];
						vector[local518 - local541 - 1] = local549 + local565;
						vector[local518 - local541 - 3] = local557 + local573;
						@Pc(599) float local599 = local252[local530 * k1];
						@Pc(607) float local607 = local252[local530 * k1 + 1];
						vector[local528 - local541 - 1] = (local549 - local565) * local599 - (local557 - local573) * local607;
						vector[local528 - local541 - 3] = (local557 - local573) * local599 + (local549 - local565) * local607;
					}
				}
			}
			for (l = 1; l < n8 - 1; l++) {
				k0 = local270[l];
				if (l < k0) {
					k1 = l * 8;
					s = k0 * 8;
					e = vector[k1 + 1];
					vector[k1 + 1] = vector[s + 1];
					vector[s + 1] = e;
					e = vector[k1 + 3];
					vector[k1 + 3] = vector[s + 3];
					vector[s + 3] = e;
					e = vector[k1 + 5];
					vector[k1 + 5] = vector[s + 5];
					vector[s + 5] = e;
					e = vector[k1 + 7];
					vector[k1 + 7] = vector[s + 7];
					vector[s + 7] = e;
				}
			}
			for (l = 0; l < n2; l++) {
				vector[l] = vector[l * 2 + 1];
			}
			for (l = 0; l < n8; l++) {
				vector[n - l * 2 - 1] = vector[l * 4];
				vector[n - l * 2 - 2] = vector[l * 4 + 1];
				vector[n - n4 - l * 2 - 1] = vector[l * 4 + 2];
				vector[n - n4 - l * 2 - 2] = vector[l * 4 + 3];
			}
			for (l = 0; l < n8; l++) {
				b = local264[l * 2];
				c = local264[l * 2 + 1];
				d = vector[n2 + l * 2];
				e = vector[n2 + l * 2 + 1];
				f = vector[n - l * 2 - 2];
				@Pc(908) float local908 = vector[n - l * 2 - 1];
				@Pc(920) float local920 = c * (d - f) + b * (e + local908);
				vector[n2 + l * 2] = (d + f + local920) * 0.5F;
				vector[n - l * 2 - 2] = (d + f - local920) * 0.5F;
				@Pc(962) float local962 = c * (e + local908) - b * (d - f);
				vector[n2 + l * 2 + 1] = (e + local962 - local908) * 0.5F;
				vector[n - l * 2 - 1] = (local908 + local962 - e) * 0.5F;
			}
			for (l = 0; l < n4; l++) {
				vector[l] = vector[l * 2 + n2] * local258[l * 2] + vector[l * 2 + n2 + 1] * local258[l * 2 + 1];
				vector[n2 - l - 1] = vector[l * 2 + n2] * local258[l * 2 + 1] - vector[l * 2 + n2 + 1] * local258[l * 2];
			}
			for (l = 0; l < n4; l++) {
				vector[n + l - n4] = -vector[l];
			}
			for (l = 0; l < n4; l++) {
				vector[l] = vector[n4 + l];
			}
			for (l = 0; l < n4; l++) {
				vector[n4 + l] = -vector[n4 - l - 1];
			}
			for (l = 0; l < n4; l++) {
				vector[n2 + l] = vector[n - l - 1];
			}
			for (l = leftWindowStart; l < leftWindowEnd; l++) {
				b = (float) Math.sin(((double) (l - leftWindowStart) + 0.5D) / (double) leftN * 0.5D * 3.141592653589793D);
				VorbisSound.vector[l] *= (float) Math.sin((double) b * 1.5707963267948966D * (double) b);
			}
			for (l = rightWindowStart; l < rightWindowEnd; l++) {
				b = (float) Math.sin(((double) (l - rightWindowStart) + 0.5D) / (double) rightN * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				VorbisSound.vector[l] *= (float) Math.sin((double) b * 1.5707963267948966D * (double) b);
			}
		}
		@Pc(1228) float[] local1228 = null;
		if (this.prevN > 0) {
			floorNumber2 = this.prevN + n >> 2;
			local1228 = new float[floorNumber2];
			@Pc(1257) int local1257;
			if (!this.prevNoResidue) {
				for (local212 = 0; local212 < this.prevQuarter; local212++) {
					local1257 = (this.prevN >> 1) + local212;
					local1228[local212] += this.prevVector[local1257];
				}
			}
			if (!noResidue) {
				for (local212 = leftWindowStart; local212 < n >> 1; local212++) {
					local1257 = local1228.length + local212 - (n >> 1);
					local1228[local1257] += vector[local212];
				}
			}
		}
		@Pc(1301) float[] local1301 = this.prevVector;
		this.prevVector = vector;
		vector = local1301;
		this.prevN = n;
		this.prevQuarter = rightWindowEnd - (n >> 1);
		this.prevNoResidue = noResidue;
		return local1228;
	}
}
