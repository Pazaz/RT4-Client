import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class MidiDecoder {

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "[I")
	public int[] anIntArray310;

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "[I")
	private int[] anIntArray311;

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
	public int anInt3303;

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "[I")
	private int[] anIntArray312;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "J")
	private long aLong117;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "[I")
	private int[] anIntArray313;

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
	private int anInt3304;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "Lclient!wa;")
	private final Buffer aClass3_Sub15_6 = new Buffer(null);

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
	public MidiDecoder() {
	}

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "([B)V")
	public MidiDecoder(@OriginalArg(0) byte[] arg0) {
		this.method2635(arg0);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)J")
	public final long method2625(@OriginalArg(0) int arg0) {
		return this.aLong117 + (long) arg0 * (long) this.anInt3304;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "()Z")
	public final boolean method2626() {
		@Pc(3) int local3 = this.anIntArray311.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray311[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(J)V")
	public final void method2627(@OriginalArg(0) long arg0) {
		this.aLong117 = arg0;
		@Pc(6) int local6 = this.anIntArray311.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray310[local8] = 0;
			this.anIntArray313[local8] = 0;
			this.aClass3_Sub15_6.offset = this.anIntArray312[local8];
			this.method2632(local8);
			this.anIntArray311[local8] = this.aClass3_Sub15_6.offset;
		}
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "()Z")
	public final boolean method2628() {
		return this.aClass3_Sub15_6.data != null;
	}

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "()I")
	public final int method2629() {
		return this.anIntArray311.length;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)I")
	public final int method2630(@OriginalArg(0) int arg0) {
		return this.method2634(arg0);
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
	public final void method2631(@OriginalArg(0) int arg0) {
		this.aClass3_Sub15_6.offset = this.anIntArray311[arg0];
	}

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)V")
	public final void method2632(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub15_6.gVarInt();
		this.anIntArray310[arg0] += local4;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)I")
	private int method2633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static135.aByteArray46[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub15_6.g1() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub15_6.g1() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub15_6.g1();
		local12 = this.aClass3_Sub15_6.gVarInt();
		if (local7 == 47) {
			this.aClass3_Sub15_6.offset += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub15_6.g3();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray310[arg0];
			this.aLong117 += (long) local38 * (long) (this.anInt3304 - local32);
			this.anInt3304 = local32;
			this.aClass3_Sub15_6.offset += local12;
			return 2;
		} else {
			this.aClass3_Sub15_6.offset += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)I")
	private int method2634(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub15_6.data[this.aClass3_Sub15_6.offset];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray313[arg0] = local13;
			this.aClass3_Sub15_6.offset++;
		} else {
			local13 = this.anIntArray313[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2633(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub15_6.gVarInt();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub15_6.data[this.aClass3_Sub15_6.offset] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub15_6.offset++;
				this.anIntArray313[arg0] = local57;
				return this.method2633(arg0, local57);
			}
		}
		this.aClass3_Sub15_6.offset += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "([B)V")
	public final void method2635(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub15_6.data = arg0;
		this.aClass3_Sub15_6.offset = 10;
		@Pc(12) int local12 = this.aClass3_Sub15_6.g2();
		this.anInt3303 = this.aClass3_Sub15_6.g2();
		this.anInt3304 = 500000;
		this.anIntArray312 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(35) int local35 = this.aClass3_Sub15_6.g4();
			@Pc(40) int local40 = this.aClass3_Sub15_6.g4();
			if (local35 == 1297379947) {
				this.anIntArray312[local27] = this.aClass3_Sub15_6.offset;
				local27++;
			}
			this.aClass3_Sub15_6.offset += local40;
		}
		this.aLong117 = 0L;
		this.anIntArray311 = new int[local12];
		for (local27 = 0; local27 < local12; local27++) {
			this.anIntArray311[local27] = this.anIntArray312[local27];
		}
		this.anIntArray310 = new int[local12];
		this.anIntArray313 = new int[local12];
	}

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)V")
	public final void method2636(@OriginalArg(0) int arg0) {
		this.anIntArray311[arg0] = this.aClass3_Sub15_6.offset;
	}

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "()I")
	public final int method2637() {
		@Pc(3) int local3 = this.anIntArray311.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray311[local9] >= 0 && this.anIntArray310[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray310[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "()V")
	public final void method2638() {
		this.aClass3_Sub15_6.data = null;
		this.anIntArray312 = null;
		this.anIntArray311 = null;
		this.anIntArray310 = null;
		this.anIntArray313 = null;
	}

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "()V")
	public final void method2639() {
		this.aClass3_Sub15_6.offset = -1;
	}
}
