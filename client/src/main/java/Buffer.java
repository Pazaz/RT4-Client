import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

// Buffer access nomenclature:
// Operation
//   g - get
//   p - put
// Type
//   bytes or special type i.e. 8, VarLong, Bytes, jstr, ...
// Endianness (optional)
//   (none) - Big Endian
//   le - Little Endian
//   me - "Middle" Endian, only used with ints
//   rme - "Reverse-Middle" Endian, only used with ints
// Signedness
//   (none) - Unsigned
//   s - Signed
// Transformation (optional)
//   add - add 128 to the lowest byte
//   sub - subtract lowest byte from 128
//   neg - negate, only used on bytes
//   Rev - reverse, only used on byte arrays

// Types:
//  1 - byte
//  2 - short
//  3 - medium
//  4 - int
//  8 - long
//  Float - 4-byte float
//  Smart1or2 - byte if below 128, short otherwise, holds exactly half the capacity (0-128, 0-32768)
//  Bytes - byte array
//  jstr - Jagex string (null terminated)
//  VarLong - variable long
//  VarInt - variable int
//  Crc32 - checksum

@OriginalClass("client!wa")
public class Buffer extends Node {

	@OriginalMember(owner = "client!wa", name = "y", descriptor = "[B")
	public byte[] data;

	@OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
	public int offset;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V")
	public Buffer(@OriginalArg(0) int size) {
		this.data = Static228.allocate(size);
		this.offset = 0;
	}

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "([B)V")
	public Buffer(@OriginalArg(0) byte[] src) {
		this.offset = 0;
		this.data = src;
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)I")
	public final int g2() {
		this.offset += 2;
		return ((this.data[this.offset - 2] & 0xFF) << 8) + (this.data[this.offset - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)V")
	public final void p4(@OriginalArg(1) int value) {
		this.data[this.offset++] = (byte) (value >> 24);
		this.data[this.offset++] = (byte) (value >> 16);
		this.data[this.offset++] = (byte) (value >> 8);
		this.data[this.offset++] = (byte) value;
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

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(II)V")
	public final void p4len(@OriginalArg(1) int len) {
		this.data[this.offset - len - 4] = (byte) (len >> 24);
		this.data[this.offset - len - 3] = (byte) (len >> 16);
		this.data[this.offset - len - 2] = (byte) (len >> 8);
		this.data[this.offset - len - 1] = (byte) len;
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(II)V")
	public final void p1sub(@OriginalArg(1) int value) {
		this.data[this.offset++] = (byte) (128 - value);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!na;)V")
	public final void pjstr(@OriginalArg(1) JagString value) {
		this.offset += value.encodeString(this.data, this.offset, value.length());
		this.data[this.offset++] = 0;
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)I")
	public final int g2sadd() {
		this.offset += 2;
		@Pc(34) int value = ((this.data[this.offset - 2] & 0xFF) << 8) + (this.data[this.offset - 1] - 128 & 0xFF);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)I")
	public final int g4() {
		this.offset += 4;
		return ((this.data[this.offset - 4] & 0xFF) << 24) + ((this.data[this.offset - 3] & 0xFF) << 16) + ((this.data[this.offset - 2] & 0xFF) << 8) + (this.data[this.offset - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(Z)B")
	public final byte g1sub() {
		return (byte) (128 - this.data[this.offset++]);
	}

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "(B)Lclient!na;")
	public final JagString gjstrFast() {
		if (this.data[this.offset] == 0) {
			this.offset++;
			return null;
		} else {
			return this.gjstr();
		}
	}

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "(B)I")
	public final int g1add() {
		return this.data[this.offset++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)V")
	public final void p1(@OriginalArg(1) int value) {
		this.data[this.offset++] = (byte) value;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([BIII)V")
	public final void pBytes(@OriginalArg(0) byte[] src, @OriginalArg(2) int len) {
		for (@Pc(7) int i = 0; i < len; i++) {
			this.data[this.offset++] = src[i];
		}
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(Z)I")
	public final int g1ssub() {
		return 128 - this.data[this.offset++] & 0xFF;
	}

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "(B)I")
	public final int g3le() {
		this.offset += 3;
		return (((this.data[this.offset - 1] & 0xFF) << 16) + (this.data[this.offset - 2] & 0xFF) << 8) + (this.data[this.offset - 3] & 0xFF);
	}

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)J")
	public final long g8() {
		@Pc(11) long low = (long) this.g4() & 0xFFFFFFFFL;
		@Pc(18) long high = (long) this.g4() & 0xFFFFFFFFL;
		return high + (low << 32);
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(II)V")
	public final void p4le(@OriginalArg(0) int value) {
		this.data[this.offset++] = (byte) value;
		this.data[this.offset++] = (byte) (value >> 8);
		this.data[this.offset++] = (byte) (value >> 16);
		this.data[this.offset++] = (byte) (value >> 24);
	}

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "(I)I")
	public final int g2sub() {
		this.offset += 2;
		return ((this.data[this.offset - 2] & 0xFF) << 8) + (this.data[this.offset - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "(II)V")
	public final void p4me(@OriginalArg(1) int value) {
		this.data[this.offset++] = (byte) (value >> 16);
		this.data[this.offset++] = (byte) (value >> 24);
		this.data[this.offset++] = (byte) value;
		this.data[this.offset++] = (byte) (value >> 8);
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(Z)B")
	public final byte g1s() {
		return this.data[this.offset++];
	}

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "(I)Lclient!na;")
	public final JagString gjstr2() {
		@Pc(10) byte version = this.data[this.offset++];
		if (version != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(32) int off = this.offset;
		while (this.data[this.offset++] != 0) {
		}
		return Static10.decodeString(this.data, this.offset - off - 1, off);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(FB)V")
	public final void gFloat(@OriginalArg(0) float value) {
		@Pc(2) int valueInt = Float.floatToRawIntBits(value);
		this.data[this.offset++] = (byte) valueInt;
		this.data[this.offset++] = (byte) (valueInt >> 8);
		this.data[this.offset++] = (byte) (valueInt >> 16);
		this.data[this.offset++] = (byte) (valueInt >> 24);
	}

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "(B)B")
	public final byte g1neg() {
		return (byte) -this.data[this.offset++];
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[BB)V")
	public final void gBytes(@OriginalArg(1) int len, @OriginalArg(2) byte[] dest) {
		for (@Pc(8) int i = 0; i < len; i++) {
			dest[i] = this.data[this.offset++];
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)V")
	public final void p2leadd(@OriginalArg(0) int value) {
		this.data[this.offset++] = (byte) (value + 128);
		this.data[this.offset++] = (byte) (value >> 8);
	}

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "(I)I")
	public final int g2le() {
		this.offset += 2;
		return ((this.data[this.offset - 1] & 0xFF) << 8) + (this.data[this.offset - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "(II)V")
	public final void pSmart1or2(@OriginalArg(1) int value) {
		if (value >= 0 && value < 128) {
			this.p1(value);
		} else if (value >= 0 && value < 0x8000) {
			this.p2(value + 0x8000);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(BI)V")
	public final void p1len(@OriginalArg(1) int length) {
		this.data[this.offset - length - 1] = (byte) length;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([IIII)V")
	public final void decryptXtea(@OriginalArg(0) int[] key, @OriginalArg(3) int len) {
		@Pc(6) int start = this.offset;
		this.offset = 5;
		@Pc(16) int blocks = (len - 5) / 8;
		for (@Pc(18) int i = 0; i < blocks; i++) {
			@Pc(23) int sum = -957401312;
			@Pc(27) int v0 = this.g4();
			@Pc(31) int v1 = this.g4();
			@Pc(33) int rounds = 32;
			while (rounds-- > 0) {
				v1 -= key[sum >>> 11 & 0x3] + sum ^ v0 + (v0 >>> 5 ^ v0 << 4);
				sum -= -1640531527;
				v0 -= (v1 >>> 5 ^ v1 << 4) + v1 ^ key[sum & 0x3] + sum;
			}
			this.offset -= 8;
			this.p4(v0);
			this.p4(v1);
		}
		this.offset = start;
	}

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "(II)V")
	public final void pVarInt(@OriginalArg(1) int value) {
		if ((value & 0xFFFFFF80) != 0) {
			if ((-16384 & value) != 0) {
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

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "(B)I")
	public final int gVarSmart() {
		@Pc(14) int value = this.gSmart1or2();
		@Pc(16) int value2 = 0;
		while (value == 32767) {
			value = this.gSmart1or2();
			value2 += 32767;
		}
		return value2 + value;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[BI)V")
	public final void gBytesRev(@OriginalArg(1) int offset, @OriginalArg(2) byte[] dest) {
		for (@Pc(12) int i = offset - 1; i >= 0; i--) {
			dest[i] = this.data[this.offset++];
		}
	}

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "(II)V")
	public final void p4rme(@OriginalArg(0) int value) {
		this.data[this.offset++] = (byte) (value >> 8);
		this.data[this.offset++] = (byte) value;
		this.data[this.offset++] = (byte) (value >> 24);
		this.data[this.offset++] = (byte) (value >> 16);
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(Z)Lclient!na;")
	public final JagString gjstr() {
		@Pc(12) int start = this.offset;
		while (this.data[this.offset++] != 0) {
		}
		return Static10.decodeString(this.data, this.offset - start - 1, start);
	}

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "(Z)I")
	public final int gSmart1or2() {
		@Pc(17) int value = this.data[this.offset] & 0xFF;
		return value >= 128 ? this.g2() - 0x8000 : this.g1();
	}

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "(II)V")
	public final void p3(@OriginalArg(0) int value) {
		this.data[this.offset++] = (byte) (value >> 16);
		this.data[this.offset++] = (byte) (value >> 8);
		this.data[this.offset++] = (byte) value;
	}

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "(I)I")
	public final int g4rme() {
		this.offset += 4;
		return ((this.data[this.offset - 2] & 0xFF) << 24) + ((this.data[this.offset - 1] & 0xFF) << 16) + ((this.data[this.offset - 4] & 0xFF) << 8) + (this.data[this.offset - 3] & 0xFF);
	}

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "(B)I")
	public final int g2leadd() {
		this.offset += 2;
		return ((this.data[this.offset - 1] & 0xFF) << 8) + (this.data[this.offset - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "(I)I")
	public final int g4me() {
		this.offset += 4;
		return ((this.data[this.offset - 2] & 0xFF) << 16) + ((this.data[this.offset - 1] & 0xFF) << 24) + ((this.data[this.offset - 3] & 0xFF) << 8) + (this.data[this.offset - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "(II)V")
	public final void p2add(@OriginalArg(0) int value) {
		this.data[this.offset++] = (byte) (value >> 8);
		this.data[this.offset++] = (byte) (value + 128);
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(IB)V")
	public final void p4le2(@OriginalArg(0) int value) {
		this.data[this.offset++] = (byte) value;
		this.data[this.offset++] = (byte) (value >> 8);
		this.data[this.offset++] = (byte) (value >> 16);
		this.data[this.offset++] = (byte) (value >> 24);
	}

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "(Z)I")
	public final int p1neg() {
		return -this.data[this.offset++] & 0xFF;
	}

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "(B)I")
	public final int g2s() {
		this.offset += 2;
		@Pc(27) int value = ((this.data[this.offset - 2] & 0xFF) << 8) + (this.data[this.offset - 1] & 0xFF);
		if (value > 32767) {
			value -= 0x10000;
		}
		return value;
	}

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "(I)I")
	public final int g2lesadd() {
		this.offset += 2;
		@Pc(34) int value = ((this.data[this.offset - 1] & 0xFF) << 8) + (this.data[this.offset - 2] - 128 & 0xFF);
		if (value > 32767) {
			value -= 0x10000;
		}
		return value;
	}

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "(I)B")
	public final byte p1sub() {
		return (byte) (this.data[this.offset++] - 128);
	}

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "(II)V")
	public final void p1a(@OriginalArg(0) int value) {
		this.data[this.offset++] = (byte) (value + 128);
	}

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "(B)I")
	public final int g2les() {
		this.offset += 2;
		@Pc(38) int value = (this.data[this.offset - 2] & 0xFF) + ((this.data[this.offset - 1] & 0xFF) << 8);
		if (value > 32767) {
			value -= 0x10000;
		}
		return value;
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(BI)I")
	public final int pCrc32(@OriginalArg(1) int off) {
		@Pc(16) int checksum = Static169.crc32(off, this.offset, this.data);
		this.p4(checksum);
		return checksum;
	}

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "(B)I")
	public final int g3() {
		this.offset += 3;
		return ((this.data[this.offset - 3] & 0xFF) << 16) + ((this.data[this.offset - 2] << 8 & 0xFF00) + (this.data[this.offset - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "(II)V")
	public final void p2le(@OriginalArg(1) int value) {
		this.data[this.offset++] = (byte) value;
		this.data[this.offset++] = (byte) (value >> 8);
	}

	// range: -16384 to 16383
	@OriginalMember(owner = "client!wa", name = "p", descriptor = "(I)I")
	public final int gSmart1or2s() {
		@Pc(11) int value = this.data[this.offset] & 0xFF;
		return value < 128 ? this.g1() - 64 : this.g2() - 0xc000;
	}

	// reverse "middle-endian"
	@OriginalMember(owner = "client!wa", name = "o", descriptor = "(B)I")
	public final int p4rme() {
		this.offset += 4;
		return ((this.data[this.offset - 3] & 0xFF) << 24) + ((this.data[this.offset - 4] & 0xFF) << 16) + ((this.data[this.offset - 1] & 0xFF) << 8) + (this.data[this.offset - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void encryptRsa(@OriginalArg(0) BigInteger exp, @OriginalArg(1) BigInteger mod) {
		@Pc(2) int len = this.offset;
		this.offset = 0;
		@Pc(8) byte[] plaintextBytes = new byte[len];
		this.gBytes(len, plaintextBytes);
		@Pc(23) BigInteger plaintext = new BigInteger(plaintextBytes);
		@Pc(28) BigInteger ciphertext = plaintext.modPow(exp, mod);
		@Pc(38) byte[] ciphertextBytes = ciphertext.toByteArray();
		this.offset = 0;
		this.p1(ciphertextBytes.length);
		this.pBytes(ciphertextBytes, ciphertextBytes.length);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IF)V")
	public final void pFloat(@OriginalArg(1) float value) {
		@Pc(6) int floatInt = Float.floatToRawIntBits(value);
		this.data[this.offset++] = (byte) (floatInt >> 24);
		this.data[this.offset++] = (byte) (floatInt >> 16);
		this.data[this.offset++] = (byte) (floatInt >> 8);
		this.data[this.offset++] = (byte) floatInt;
	}

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "(B)I")
	public final int g1() {
		return this.data[this.offset++] & 0xFF;
	}

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "(II)V")
	public final void p2(@OriginalArg(1) int value) {
		this.data[this.offset++] = (byte) (value >> 8);
		this.data[this.offset++] = (byte) value;
	}
}
