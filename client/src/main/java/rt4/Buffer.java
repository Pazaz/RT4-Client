package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.math.BigInteger;

// Buffer access nomenclature:
// Endianness (optional)
//   (none) - big (DCBA)
//   i - "inverse" (little) (ABCD)
//   m - "middle" (CDAB) - not an authentic name, no clue on original
//   im - "inverse-middle" (reverse) (BADC) - not an authentic name, jagex may call this "_alt3"
// Operation
//   g - get
//   p - put
//   rsadec - Decrypt RSA
//   tinydec - Decrypt XTEA
// Type
//   # of bytes or special type i.e. 8, VarLong, Float, jstr, ...
// Signedness (optional)
//   (none) - unsigned
//   b / s - "byte" / signed (both allow overflow) - jagex mixed usage i.e. gsmarts and g1b...
// Transformation (optional)
//   (none) - no change
//   add - add 128 to the lowest byte
//   sub - subtract lowest byte from 128
//   neg - negate, only used on bytes

@OriginalClass("client!wa")
public class Buffer extends Node {

	@OriginalMember(owner = "client!wi", name = "X", descriptor = "[[B")
	public static final byte[][] allocatedMin = new byte[1000][];

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "[[B")
	public static final byte[][] allocatedMid = new byte[250][];

	@OriginalMember(owner = "client!dc", name = "db", descriptor = "[[B")
	public static final byte[][] allocatedMax = new byte[50][];

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "[I")
	public static final int[] CRC32_TABLE = new int[256];

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "[J")
	public static final long[] CRC64_TABLE = new long[256];

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
	public static int allocatedMinCount = 0;

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
	public static int allocatedMidCount = 0;

	@OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
	public static int allocatedMaxCount = 0;

	@OriginalMember(owner = "client!wa", name = "y", descriptor = "[B")
	public byte[] data;

	@OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
	public int offset;

	static {
		for (@Pc(4) int i = 0; i < 256; i++) {
			@Pc(9) int temp = i;
			for (@Pc(11) int j = 0; j < 8; j++) {
				if ((temp & 0x1) == 1) {
					temp = temp >>> 1 ^ 0xEDB88320;
				} else {
					temp >>>= 0x1;
				}
			}
			CRC32_TABLE[i] = temp;
		}

		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(10) long local10 = local4;
			for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
				if ((local10 & 0x1L) == 1L) {
					local10 = local10 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local10 >>>= 0x1;
				}
			}
			CRC64_TABLE[local4] = local10;
		}
	}

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V")
	public Buffer(@OriginalArg(0) int size) {
		this.data = allocate(size);
		this.offset = 0;
	}

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "([B)V")
	public Buffer(@OriginalArg(0) byte[] src) {
		this.offset = 0;
		this.data = src;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] allocate(@OriginalArg(1) int length) {
		@Pc(22) byte[] data;
		if (length == 100 && allocatedMinCount > 0) {
			data = allocatedMin[--allocatedMinCount];
			allocatedMin[allocatedMinCount] = null;
			return data;
		} else if (length == 5000 && allocatedMidCount > 0) {
			data = allocatedMid[--allocatedMidCount];
			allocatedMid[allocatedMidCount] = null;
			return data;
		} else if (length == 30000 && allocatedMaxCount > 0) {
			data = allocatedMax[--allocatedMaxCount];
			allocatedMax[allocatedMaxCount] = null;
			return data;
		} else {
			return new byte[length];
		}
	}


	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[BB)I")
	public static int crc32(@OriginalArg(0) int offset, @OriginalArg(1) int size, @OriginalArg(2) byte[] src) {
		@Pc(5) int crc = -1;
		for (@Pc(15) int i = offset; i < size; i++) {
			crc = crc >>> 8 ^ CRC32_TABLE[(crc ^ src[i]) & 0xFF];
		}
		return ~crc;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "([BIZ)I")
	public static int crc32(@OriginalArg(0) byte[] src, @OriginalArg(1) int size) {
		return crc32(0, size, src);
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(BI)I")
	public final int addcrc(@OriginalArg(1) int off) {
		@Pc(16) int checksum = crc32(off, this.offset, this.data);
		this.p4(checksum);
		return checksum;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([IIII)V")
	public final void tinydec(@OriginalArg(0) int[] key, @OriginalArg(3) int len) {
		@Pc(6) int start = this.offset;
		this.offset = 5;
		@Pc(16) int blocks = (len - 5) / 8;
		for (@Pc(18) int i = 0; i < blocks; i++) {
			@Pc(23) int sum = 0xc6ef3720;
			@Pc(27) int v0 = this.g4();
			@Pc(31) int v1 = this.g4();
			@Pc(33) int rounds = 32;
			while (rounds-- > 0) {
				v1 -= key[sum >>> 11 & 0x3] + sum ^ v0 + (v0 >>> 5 ^ v0 << 4);
				sum -= 0x9e3779b9;
				v0 -= (v1 >>> 5 ^ v1 << 4) + v1 ^ key[sum & 0x3] + sum;
			}
			this.offset -= 8;
			this.p4(v0);
			this.p4(v1);
		}
		this.offset = start;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void rsaenc(@OriginalArg(0) BigInteger exp, @OriginalArg(1) BigInteger mod) {
		@Pc(2) int len = this.offset;
		this.offset = 0;
		@Pc(8) byte[] plaintextBytes = new byte[len];
		this.gdata(len, plaintextBytes);
		@Pc(23) BigInteger plaintext = new BigInteger(plaintextBytes);
		@Pc(28) BigInteger ciphertext = plaintext.modPow(exp, mod);
		@Pc(38) byte[] ciphertextBytes = ciphertext.toByteArray();
		this.offset = 0;
		this.p1(ciphertextBytes.length);
		this.pdata(ciphertextBytes, ciphertextBytes.length);
	}

	// get (read) methods

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "(B)I")
	public final int g1() {
		return this.data[this.offset++] & 0xFF;
	}

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "(B)I")
	public final int g1add() {
		return this.data[this.offset++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "(Z)I")
	public final int g1neg() {
		return -this.data[this.offset++] & 0xFF;
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(Z)B")
	public final byte g1b() {
		return this.data[this.offset++];
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(Z)I")
	public final int g1sub() {
		return 128 - this.data[this.offset++] & 0xFF;
	}

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "(I)B")
	public final byte g1badd() {
		return (byte) (this.data[this.offset++] - 128);
	}

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "(B)B")
	public final byte g1bneg() {
		return (byte) -this.data[this.offset++];
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(Z)B")
	public final byte g1bsub() {
		return (byte) (128 - this.data[this.offset++]);
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)I")
	public final int g2() {
		this.offset += 2;
		return ((this.data[this.offset - 2] & 0xFF) << 8) + (this.data[this.offset - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "(I)I")
	public final int g2add() {
		this.offset += 2;
		return ((this.data[this.offset - 2] & 0xFF) << 8) + (this.data[this.offset - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "(B)I")
	public final int g2b() {
		this.offset += 2;
		@Pc(27) int value = ((this.data[this.offset - 2] & 0xFF) << 8) + (this.data[this.offset - 1] & 0xFF);
		if (value > 32767) {
			value -= 0x10000;
		}
		return value;
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)I")
	public final int g2badd() {
		this.offset += 2;
		@Pc(34) int value = ((this.data[this.offset - 2] & 0xFF) << 8) + (this.data[this.offset - 1] - 128 & 0xFF);
		if (value > 32767) {
			value -= 0x10000;
		}
		return value;
	}

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "(I)I")
	public final int ig2() {
		this.offset += 2;
		return ((this.data[this.offset - 1] & 0xFF) << 8) + (this.data[this.offset - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "(B)I")
	public final int ig2b() {
		this.offset += 2;
		@Pc(38) int value = (this.data[this.offset - 2] & 0xFF) + ((this.data[this.offset - 1] & 0xFF) << 8);
		if (value > 32767) {
			value -= 0x10000;
		}
		return value;
	}

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "(B)I")
	public final int ig2add() {
		this.offset += 2;
		return ((this.data[this.offset - 1] & 0xFF) << 8) + (this.data[this.offset - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "(I)I")
	public final int ig2badd() {
		this.offset += 2;
		@Pc(34) int value = ((this.data[this.offset - 1] & 0xFF) << 8) + (this.data[this.offset - 2] - 128 & 0xFF);
		if (value > 32767) {
			value -= 0x10000;
		}
		return value;
	}

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "(B)I")
	public final int g3() {
		this.offset += 3;
		return ((this.data[this.offset - 3] & 0xFF) << 16) + ((this.data[this.offset - 2] << 8 & 0xFF00) + (this.data[this.offset - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "(B)I")
	public final int ig3() {
		this.offset += 3;
		return (((this.data[this.offset - 1] & 0xFF) << 16) + (this.data[this.offset - 2] & 0xFF) << 8) + (this.data[this.offset - 3] & 0xFF);
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)I")
	public final int g4() {
		this.offset += 4;
		return ((this.data[this.offset - 4] & 0xFF) << 24) + ((this.data[this.offset - 3] & 0xFF) << 16) + ((this.data[this.offset - 2] & 0xFF) << 8) + (this.data[this.offset - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "(I)I")
	public final int ig4() {
		this.offset += 4;
		return ((this.data[this.offset - 1] & 0xFF) << 24) + ((this.data[this.offset - 2] & 0xFF) << 16) + ((this.data[this.offset - 3] & 0xFF) << 8) + (this.data[this.offset - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "(B)I")
	public final int mg4() {
		this.offset += 4;
		return ((this.data[this.offset - 3] & 0xFF) << 24) + ((this.data[this.offset - 4] & 0xFF) << 16) + ((this.data[this.offset - 1] & 0xFF) << 8) + (this.data[this.offset - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "(I)I")
	public final int img4() {
		this.offset += 4;
		return ((this.data[this.offset - 2] & 0xFF) << 24) + ((this.data[this.offset - 1] & 0xFF) << 16) + ((this.data[this.offset - 4] & 0xFF) << 8) + (this.data[this.offset - 3] & 0xFF);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(FB)V")
	public final void gFloat(@OriginalArg(0) float value) {
		@Pc(2) int valueInt = Float.floatToRawIntBits(value);
		this.data[this.offset++] = (byte) valueInt;
		this.data[this.offset++] = (byte) (valueInt >> 8);
		this.data[this.offset++] = (byte) (valueInt >> 16);
		this.data[this.offset++] = (byte) (valueInt >> 24);
	}

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)J")
	public final long g8() {
		@Pc(11) long low = (long) this.g4() & 0xFFFFFFFFL;
		@Pc(18) long high = (long) this.g4() & 0xFFFFFFFFL;
		return high + (low << 32);
	}

	// range: -16384 to 16383
	@OriginalMember(owner = "client!wa", name = "p", descriptor = "(I)I")
	public final int gsmart() {
		@Pc(11) int value = this.data[this.offset] & 0xFF;
		return value < 128 ? this.g1() - 64 : this.g2() - 0xc000;
	}

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "(Z)I")
	public final int gsmarts() {
		@Pc(17) int value = this.data[this.offset] & 0xFF;
		return value >= 128 ? this.g2() - 0x8000 : this.g1();
	}

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "(B)I")
	public final int gVarSmart() {
		@Pc(14) int value = this.gsmarts();
		@Pc(16) int value2 = 0;
		while (value == 32767) {
			value = this.gsmarts();
			value2 += 32767;
		}
		return value2 + value;
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(B)I")
	public final int gVarInt() {
		@Pc(12) byte b = this.data[this.offset++];
		@Pc(24) int value = 0;
		while (b < 0) {
			value = (b & 0x7F | value) << 7;
			b = this.data[this.offset++];
		}
		return b | value;
	}

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "(II)J")
	public final long gVarLong(@OriginalArg(0) int len) {
		@Pc(2) int bytes = len - 1;
		if (bytes < 0 || bytes > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(21) long value = 0L;
		for (@Pc(25) int shift = bytes * 8; shift >= 0; shift -= 8) {
			value |= ((long) this.data[this.offset++] & 0xFFL) << shift;
		}
		return value;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[BB)V")
	public final void gdata(@OriginalArg(1) int len, @OriginalArg(2) byte[] dest) {
		for (@Pc(8) int i = 0; i < len; i++) {
			dest[i] = this.data[this.offset++];
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[BI)V")
	public final void igdata(@OriginalArg(1) int offset, @OriginalArg(2) byte[] dest) {
		for (@Pc(12) int i = offset - 1; i >= 0; i--) {
			dest[i] = this.data[this.offset++];
		}
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(Z)Lclient!na;")
	public final JagString gjstr() {
		@Pc(12) int start = this.offset;
		while (this.data[this.offset++] != 0) ;
		return JagString.decodeString(this.data, this.offset - start - 1, start);
	}

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "(I)Lclient!na;")
	public final JagString gjstr2() {
		@Pc(10) byte version = this.data[this.offset++];
		if (version != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(32) int off = this.offset;
		while (this.data[this.offset++] != 0) ;
		return JagString.decodeString(this.data, this.offset - off - 1, off);
	}

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "(B)Lclient!na;")
	public final JagString fastgjstr() {
		if (this.data[this.offset] == 0) {
			this.offset++;
			return null;
		} else {
			return this.gjstr();
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BLclient!na;)I")
	public static int gjstrlen(@OriginalArg(1) JagString str) {
		return str.length() + 1;
	}

	// put (write) methods

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)V")
	public final void p1(@OriginalArg(1) int value) {
		this.data[this.offset++] = (byte) value;
	}

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "(II)V")
	public final void p1add(@OriginalArg(0) int value) {
		this.data[this.offset++] = (byte) (value + 128);
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(II)V")
	public final void p1sub(@OriginalArg(1) int value) {
		this.data[this.offset++] = (byte) (128 - value);
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(BI)V")
	public final void psize1(@OriginalArg(1) int length) {
		this.data[this.offset - length - 1] = (byte) length;
	}

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "(II)V")
	public final void p2(@OriginalArg(1) int value) {
		this.data[this.offset++] = (byte) (value >> 8);
		this.data[this.offset++] = (byte) value;
	}

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "(II)V")
	public final void p2add(@OriginalArg(0) int value) {
		this.data[this.offset++] = (byte) (value >> 8);
		this.data[this.offset++] = (byte) (value + 128);
	}

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "(II)V")
	public final void ip2(@OriginalArg(1) int value) {
		this.data[this.offset++] = (byte) value;
		this.data[this.offset++] = (byte) (value >> 8);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)V")
	public final void ip2add(@OriginalArg(0) int value) {
		this.data[this.offset++] = (byte) (value + 128);
		this.data[this.offset++] = (byte) (value >> 8);
	}

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "(II)V")
	public final void p3(@OriginalArg(0) int value) {
		this.data[this.offset++] = (byte) (value >> 16);
		this.data[this.offset++] = (byte) (value >> 8);
		this.data[this.offset++] = (byte) value;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)V")
	public final void p4(@OriginalArg(1) int value) {
		this.data[this.offset++] = (byte) (value >> 24);
		this.data[this.offset++] = (byte) (value >> 16);
		this.data[this.offset++] = (byte) (value >> 8);
		this.data[this.offset++] = (byte) value;
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(II)V")
	public final void ip4(@OriginalArg(0) int value) {
		this.data[this.offset++] = (byte) value;
		this.data[this.offset++] = (byte) (value >> 8);
		this.data[this.offset++] = (byte) (value >> 16);
		this.data[this.offset++] = (byte) (value >> 24);
	}

	// duplicate function:
//	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(IB)V")
//	public final void ip4(@OriginalArg(0) int value) {
//		this.data[this.offset++] = (byte) value;
//		this.data[this.offset++] = (byte) (value >> 8);
//		this.data[this.offset++] = (byte) (value >> 16);
//		this.data[this.offset++] = (byte) (value >> 24);
//	}

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "(II)V")
	public final void mp4(@OriginalArg(1) int value) {
		this.data[this.offset++] = (byte) (value >> 16);
		this.data[this.offset++] = (byte) (value >> 24);
		this.data[this.offset++] = (byte) value;
		this.data[this.offset++] = (byte) (value >> 8);
	}

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "(II)V")
	public final void imp4(@OriginalArg(0) int value) {
		this.data[this.offset++] = (byte) (value >> 8);
		this.data[this.offset++] = (byte) value;
		this.data[this.offset++] = (byte) (value >> 24);
		this.data[this.offset++] = (byte) (value >> 16);
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(II)V")
	public final void psize4(@OriginalArg(1) int len) {
		this.data[this.offset - len - 4] = (byte) (len >> 24);
		this.data[this.offset - len - 3] = (byte) (len >> 16);
		this.data[this.offset - len - 2] = (byte) (len >> 8);
		this.data[this.offset - len - 1] = (byte) len;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IF)V")
	public final void pFloat(@OriginalArg(1) float value) {
		@Pc(6) int floatInt = Float.floatToRawIntBits(value);
		this.data[this.offset++] = (byte) (floatInt >> 24);
		this.data[this.offset++] = (byte) (floatInt >> 16);
		this.data[this.offset++] = (byte) (floatInt >> 8);
		this.data[this.offset++] = (byte) floatInt;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(JI)V")
	public final void p8(@OriginalArg(0) long value) {
		this.data[this.offset++] = (byte) (value >> 56);
		this.data[this.offset++] = (byte) (value >> 48);
		this.data[this.offset++] = (byte) (value >> 40);
		this.data[this.offset++] = (byte) (value >> 32);
		this.data[this.offset++] = (byte) (value >> 24);
		this.data[this.offset++] = (byte) (value >> 16);
		this.data[this.offset++] = (byte) (value >> 8);
		this.data[this.offset++] = (byte) value;
	}

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "(II)V")
	public final void pVarInt(@OriginalArg(1) int value) {
		if ((value & 0xffffff80) != 0) {
			if ((value & 0xffffc000) != 0) {
				if ((value & 0xFFE00000) != 0) {
					if ((value & 0xF0000000) != 0) {
						this.p1(value >>> 28 | 0x80);
					}
					this.p1(value >>> 21 | 0x80);
				}
				this.p1(value >>> 14 | 0x80);
			}
			this.p1(value >>> 7 | 0x80);
		}
		this.p1(value & 0x7F);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIJ)V")
	public final void pVarLong(@OriginalArg(1) int size, @OriginalArg(2) long value) {
		@Pc(2) int bytes = size - 1;
		if (bytes < 0 || bytes > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(27) int shift = bytes * 8; shift >= 0; shift -= 8) {
			this.data[this.offset++] = (byte) (value >> shift);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!na;)V")
	public final void pjstr(@OriginalArg(1) JagString value) {
		this.offset += value.encodeString(this.data, this.offset, value.length());
		this.data[this.offset++] = 0;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([BIII)V")
	public final void pdata(@OriginalArg(0) byte[] src, @OriginalArg(2) int len) {
		for (@Pc(7) int i = 0; i < len; i++) {
			this.data[this.offset++] = src[i];
		}
	}

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "(II)V")
	public final void psmarts(@OriginalArg(1) int value) {
		if (value >= 0 && value < 128) {
			this.p1(value);
		} else if (value >= 0 && value < 0x8000) {
			this.p2(value + 0x8000);
		} else {
			throw new IllegalArgumentException("psmarts out of range: " + value);
		}
	}

}
