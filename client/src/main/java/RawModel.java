import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class RawModel extends Entity {

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "S")
	private short aShort13;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "[S")
	public short[] aShortArray20;

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "[I")
	public int[] anIntArray192;

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "S")
	private short aShort14;

	@OriginalMember(owner = "client!gb", name = "A", descriptor = "[S")
	public short[] aShortArray21;

	@OriginalMember(owner = "client!gb", name = "B", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!gb", name = "D", descriptor = "S")
	private short aShort15;

	@OriginalMember(owner = "client!gb", name = "E", descriptor = "[S")
	public short[] aShortArray22;

	@OriginalMember(owner = "client!gb", name = "F", descriptor = "[[I")
	public int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!gb", name = "G", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!gb", name = "H", descriptor = "[S")
	public short[] aShortArray23;

	@OriginalMember(owner = "client!gb", name = "I", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!gb", name = "J", descriptor = "[I")
	public int[] anIntArray193;

	@OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
	public int anInt2137;

	@OriginalMember(owner = "client!gb", name = "O", descriptor = "[I")
	public int[] anIntArray196;

	@OriginalMember(owner = "client!gb", name = "P", descriptor = "[I")
	public int[] anIntArray197;

	@OriginalMember(owner = "client!gb", name = "Q", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!gb", name = "R", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!gb", name = "T", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!gb", name = "U", descriptor = "[S")
	public short[] aShortArray24;

	@OriginalMember(owner = "client!gb", name = "W", descriptor = "[Lclient!hd;")
	public Class57[] aClass57Array1;

	@OriginalMember(owner = "client!gb", name = "X", descriptor = "S")
	private short aShort16;

	@OriginalMember(owner = "client!gb", name = "Y", descriptor = "S")
	private short aShort17;

	@OriginalMember(owner = "client!gb", name = "ab", descriptor = "S")
	public short aShort18;

	@OriginalMember(owner = "client!gb", name = "bb", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!gb", name = "cb", descriptor = "[I")
	public int[] anIntArray200;

	@OriginalMember(owner = "client!gb", name = "db", descriptor = "S")
	public short aShort19;

	@OriginalMember(owner = "client!gb", name = "eb", descriptor = "S")
	private short aShort20;

	@OriginalMember(owner = "client!gb", name = "fb", descriptor = "[I")
	public int[] anIntArray201;

	@OriginalMember(owner = "client!gb", name = "gb", descriptor = "[S")
	public short[] aShortArray25;

	@OriginalMember(owner = "client!gb", name = "hb", descriptor = "[Lclient!hd;")
	public Class57[] aClass57Array2;

	@OriginalMember(owner = "client!gb", name = "ib", descriptor = "[S")
	public short[] aShortArray26;

	@OriginalMember(owner = "client!gb", name = "jb", descriptor = "[I")
	public int[] anIntArray202;

	@OriginalMember(owner = "client!gb", name = "kb", descriptor = "[Lclient!qj;")
	public TriangleNormal[] aClass126Array1;

	@OriginalMember(owner = "client!gb", name = "mb", descriptor = "[S")
	public short[] aShortArray27;

	@OriginalMember(owner = "client!gb", name = "nb", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!gb", name = "ob", descriptor = "[[I")
	public int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!gb", name = "pb", descriptor = "[S")
	public short[] aShortArray28;

	@OriginalMember(owner = "client!gb", name = "qb", descriptor = "[I")
	public int[] anIntArray203;

	@OriginalMember(owner = "client!gb", name = "rb", descriptor = "[S")
	public short[] aShortArray29;

	@OriginalMember(owner = "client!gb", name = "C", descriptor = "Z")
	private boolean aBoolean121 = false;

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
	public int anInt2136 = 0;

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "B")
	public byte aByte7 = 0;

	@OriginalMember(owner = "client!gb", name = "lb", descriptor = "I")
	public int anInt2139 = 0;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	private RawModel() {
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([B)V")
	public RawModel(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1674(arg0);
		} else {
			this.method1688(arg0);
		}
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(III)V")
	public RawModel(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray202 = new int[arg0];
		this.anIntArray201 = new int[arg0];
		this.anIntArray203 = new int[arg0];
		this.anIntArray193 = new int[arg0];
		this.anIntArray197 = new int[arg1];
		this.anIntArray200 = new int[arg1];
		this.anIntArray196 = new int[arg1];
		this.aByteArray30 = new byte[arg1];
		this.aByteArray35 = new byte[arg1];
		this.aByteArray26 = new byte[arg1];
		this.aShortArray24 = new short[arg1];
		this.aShortArray23 = new short[arg1];
		this.aByteArray31 = new byte[arg1];
		this.anIntArray192 = new int[arg1];
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([Lclient!gb;I)V")
	public RawModel(@OriginalArg(0) RawModel[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt2139 = 0;
		this.anInt2136 = 0;
		this.anInt2137 = 0;
		this.aByte7 = -1;
		@Pc(43) int local43;
		for (local43 = 0; local43 < arg1; local43++) {
			@Pc(50) RawModel local50 = arg0[local43];
			if (local50 != null) {
				this.anInt2139 += local50.anInt2139;
				this.anInt2136 += local50.anInt2136;
				this.anInt2137 += local50.anInt2137;
				if (local50.aByteArray35 == null) {
					if (this.aByte7 == -1) {
						this.aByte7 = local50.aByte7;
					}
					if (this.aByte7 != local50.aByte7) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local50.aByteArray30 != null;
				local19 |= local50.aByteArray26 != null;
				local21 |= local50.anIntArray192 != null;
				local23 |= local50.aShortArray23 != null;
				local25 |= local50.aByteArray31 != null;
			}
		}
		this.anIntArray202 = new int[this.anInt2139];
		this.anIntArray201 = new int[this.anInt2139];
		this.anIntArray203 = new int[this.anInt2139];
		this.anIntArray193 = new int[this.anInt2139];
		this.aShortArray29 = new short[this.anInt2139];
		this.anIntArray197 = new int[this.anInt2136];
		this.anIntArray200 = new int[this.anInt2136];
		this.anIntArray196 = new int[this.anInt2136];
		if (local15) {
			this.aByteArray30 = new byte[this.anInt2136];
		}
		if (local17) {
			this.aByteArray35 = new byte[this.anInt2136];
		}
		if (local19) {
			this.aByteArray26 = new byte[this.anInt2136];
		}
		if (local21) {
			this.anIntArray192 = new int[this.anInt2136];
		}
		if (local23) {
			this.aShortArray23 = new short[this.anInt2136];
		}
		if (local25) {
			this.aByteArray31 = new byte[this.anInt2136];
		}
		this.aShortArray24 = new short[this.anInt2136];
		this.aShortArray22 = new short[this.anInt2136];
		if (this.anInt2137 > 0) {
			this.aByteArray29 = new byte[this.anInt2137];
			this.aShortArray26 = new short[this.anInt2137];
			this.aShortArray20 = new short[this.anInt2137];
			this.aShortArray28 = new short[this.anInt2137];
			this.aShortArray27 = new short[this.anInt2137];
			this.aShortArray25 = new short[this.anInt2137];
			this.aShortArray21 = new short[this.anInt2137];
			this.aByteArray27 = new byte[this.anInt2137];
			this.aByteArray32 = new byte[this.anInt2137];
			this.aByteArray34 = new byte[this.anInt2137];
			this.aByteArray28 = new byte[this.anInt2137];
			this.aByteArray33 = new byte[this.anInt2137];
		}
		this.anInt2139 = 0;
		this.anInt2136 = 0;
		this.anInt2137 = 0;
		for (local43 = 0; local43 < arg1; local43++) {
			@Pc(323) short local323 = (short) (0x1 << local43);
			@Pc(327) RawModel local327 = arg0[local43];
			if (local327 != null) {
				@Pc(331) int local331;
				for (local331 = 0; local331 < local327.anInt2136; local331++) {
					if (local15 && local327.aByteArray30 != null) {
						this.aByteArray30[this.anInt2136] = local327.aByteArray30[local331];
					}
					if (local17) {
						if (local327.aByteArray35 == null) {
							this.aByteArray35[this.anInt2136] = local327.aByte7;
						} else {
							this.aByteArray35[this.anInt2136] = local327.aByteArray35[local331];
						}
					}
					if (local19 && local327.aByteArray26 != null) {
						this.aByteArray26[this.anInt2136] = local327.aByteArray26[local331];
					}
					if (local21 && local327.anIntArray192 != null) {
						this.anIntArray192[this.anInt2136] = local327.anIntArray192[local331];
					}
					if (local23) {
						if (local327.aShortArray23 == null) {
							this.aShortArray23[this.anInt2136] = -1;
						} else {
							this.aShortArray23[this.anInt2136] = local327.aShortArray23[local331];
						}
					}
					if (local25) {
						if (local327.aByteArray31 == null || local327.aByteArray31[local331] == -1) {
							this.aByteArray31[this.anInt2136] = -1;
						} else {
							this.aByteArray31[this.anInt2136] = (byte) (local327.aByteArray31[local331] + this.anInt2137);
						}
					}
					this.aShortArray24[this.anInt2136] = local327.aShortArray24[local331];
					this.aShortArray22[this.anInt2136] = local323;
					this.anIntArray197[this.anInt2136] = this.method1666(local327, local327.anIntArray197[local331], local323);
					this.anIntArray200[this.anInt2136] = this.method1666(local327, local327.anIntArray200[local331], local323);
					this.anIntArray196[this.anInt2136] = this.method1666(local327, local327.anIntArray196[local331], local323);
					this.anInt2136++;
				}
				for (local331 = 0; local331 < local327.anInt2137; local331++) {
					@Pc(530) byte local530 = this.aByteArray29[this.anInt2137] = local327.aByteArray29[local331];
					if (local530 == 0) {
						this.aShortArray26[this.anInt2137] = (short) this.method1666(local327, local327.aShortArray26[local331], local323);
						this.aShortArray20[this.anInt2137] = (short) this.method1666(local327, local327.aShortArray20[local331], local323);
						this.aShortArray28[this.anInt2137] = (short) this.method1666(local327, local327.aShortArray28[local331], local323);
					}
					if (local530 >= 1 && local530 <= 3) {
						this.aShortArray26[this.anInt2137] = local327.aShortArray26[local331];
						this.aShortArray20[this.anInt2137] = local327.aShortArray20[local331];
						this.aShortArray28[this.anInt2137] = local327.aShortArray28[local331];
						this.aShortArray27[this.anInt2137] = local327.aShortArray27[local331];
						this.aShortArray25[this.anInt2137] = local327.aShortArray25[local331];
						this.aShortArray21[this.anInt2137] = local327.aShortArray21[local331];
						this.aByteArray27[this.anInt2137] = local327.aByteArray27[local331];
						this.aByteArray32[this.anInt2137] = local327.aByteArray32[local331];
						this.aByteArray34[this.anInt2137] = local327.aByteArray34[local331];
					}
					if (local530 == 2) {
						this.aByteArray28[this.anInt2137] = local327.aByteArray28[local331];
						this.aByteArray33[this.anInt2137] = local327.aByteArray33[local331];
					}
					this.anInt2137++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!gb;ZZZZ)V")
	public RawModel(@OriginalArg(0) RawModel arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2139 = arg0.anInt2139;
		this.anInt2136 = arg0.anInt2136;
		this.anInt2137 = arg0.anInt2137;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray202 = arg0.anIntArray202;
			this.anIntArray201 = arg0.anIntArray201;
			this.anIntArray203 = arg0.anIntArray203;
		} else {
			this.anIntArray202 = new int[this.anInt2139];
			this.anIntArray201 = new int[this.anInt2139];
			this.anIntArray203 = new int[this.anInt2139];
			for (local57 = 0; local57 < this.anInt2139; local57++) {
				this.anIntArray202[local57] = arg0.anIntArray202[local57];
				this.anIntArray201[local57] = arg0.anIntArray201[local57];
				this.anIntArray203[local57] = arg0.anIntArray203[local57];
			}
		}
		if (arg2) {
			this.aShortArray24 = arg0.aShortArray24;
		} else {
			this.aShortArray24 = new short[this.anInt2136];
			for (local57 = 0; local57 < this.anInt2136; local57++) {
				this.aShortArray24[local57] = arg0.aShortArray24[local57];
			}
		}
		if (arg3 || arg0.aShortArray23 == null) {
			this.aShortArray23 = arg0.aShortArray23;
		} else {
			this.aShortArray23 = new short[this.anInt2136];
			for (local57 = 0; local57 < this.anInt2136; local57++) {
				this.aShortArray23[local57] = arg0.aShortArray23[local57];
			}
		}
		this.aByteArray26 = arg0.aByteArray26;
		this.anIntArray197 = arg0.anIntArray197;
		this.anIntArray200 = arg0.anIntArray200;
		this.anIntArray196 = arg0.anIntArray196;
		this.aByteArray30 = arg0.aByteArray30;
		this.aByteArray35 = arg0.aByteArray35;
		this.aByteArray31 = arg0.aByteArray31;
		this.aByte7 = arg0.aByte7;
		this.aByteArray29 = arg0.aByteArray29;
		this.aShortArray26 = arg0.aShortArray26;
		this.aShortArray20 = arg0.aShortArray20;
		this.aShortArray28 = arg0.aShortArray28;
		this.aShortArray27 = arg0.aShortArray27;
		this.aShortArray25 = arg0.aShortArray25;
		this.aShortArray21 = arg0.aShortArray21;
		this.aByteArray27 = arg0.aByteArray27;
		this.aByteArray32 = arg0.aByteArray32;
		this.aByteArray34 = arg0.aByteArray34;
		this.aByteArray28 = arg0.aByteArray28;
		this.aByteArray33 = arg0.aByteArray33;
		this.anIntArray193 = arg0.anIntArray193;
		this.anIntArray192 = arg0.anIntArray192;
		this.anIntArrayArray16 = arg0.anIntArrayArray16;
		this.anIntArrayArray15 = arg0.anIntArrayArray15;
		this.aClass57Array1 = arg0.aClass57Array1;
		this.aClass126Array1 = arg0.aClass126Array1;
		this.aClass57Array2 = arg0.aClass57Array2;
		this.aShort19 = arg0.aShort19;
		this.aShort18 = arg0.aShort18;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "()V")
	public final void method1660() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2139; local1++) {
			this.anIntArray202[local1] = -this.anIntArray202[local1];
			this.anIntArray203[local1] = -this.anIntArray203[local1];
		}
		this.method1678();
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "()V")
	public final void method1662() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2139; local1++) {
			@Pc(10) int local10 = this.anIntArray202[local1];
			this.anIntArray202[local1] = this.anIntArray203[local1];
			this.anIntArray203[local1] = -local10;
		}
		this.method1678();
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
	private void method1663(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static77.anIntArray198[arg0];
		@Pc(7) int local7 = Static77.anIntArray195[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2139; local9++) {
			@Pc(29) int local29 = this.anIntArray201[local9] * local3 + this.anIntArray202[local9] * local7 >> 16;
			this.anIntArray201[local9] = this.anIntArray201[local9] * local7 - this.anIntArray202[local9] * local3 >> 16;
			this.anIntArray202[local9] = local29;
		}
		this.method1678();
	}

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "()V")
	private void method1664() {
		if (this.aBoolean121) {
			return;
		}
		this.aBoolean121 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt2139; local20++) {
			@Pc(29) int local29 = this.anIntArray202[local20];
			@Pc(34) int local34 = this.anIntArray201[local20];
			@Pc(39) int local39 = this.anIntArray203[local20];
			if (local29 < local8) {
				local8 = local29;
			}
			if (local29 > local14) {
				local14 = local29;
			}
			if (local34 < local10) {
				local10 = local34;
			}
			if (local34 > local16) {
				local16 = local34;
			}
			if (local39 < local12) {
				local12 = local39;
			}
			if (local39 > local18) {
				local18 = local39;
			}
		}
		this.aShort14 = (short) local8;
		this.aShort16 = (short) local14;
		this.aShort15 = (short) local10;
		this.aShort13 = (short) local16;
		this.aShort20 = (short) local12;
		this.aShort17 = (short) local18;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(III)V")
	public final void method1665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2139; local1++) {
			this.anIntArray202[local1] = this.anIntArray202[local1] * arg0 / 128;
			this.anIntArray201[local1] = this.anIntArray201[local1] * arg1 / 128;
			this.anIntArray203[local1] = this.anIntArray203[local1] * arg2 / 128;
		}
		this.method1678();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)Lclient!th;")
	@Override
	public final Entity method4539() {
		return this.method1679(this.aShort19, this.aShort18, -50, -10, -50);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!gb;IS)I")
	private int method1666(@OriginalArg(0) RawModel arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		@Pc(4) int local4 = arg0.anIntArray202[arg1];
		@Pc(9) int local9 = arg0.anIntArray201[arg1];
		@Pc(14) int local14 = arg0.anIntArray203[arg1];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2139; local16++) {
			if (local4 == this.anIntArray202[local16] && local9 == this.anIntArray201[local16] && local14 == this.anIntArray203[local16]) {
				this.aShortArray29[local16] |= arg2;
				return local16;
			}
		}
		this.anIntArray202[this.anInt2139] = local4;
		this.anIntArray201[this.anInt2139] = local9;
		this.anIntArray203[this.anInt2139] = local14;
		this.aShortArray29[this.anInt2139] = arg2;
		if (arg0.anIntArray193 != null) {
			this.anIntArray193[this.anInt2139] = arg0.anIntArray193[arg1];
		}
		return this.anInt2139++;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([[IIIIII)V")
	private void method1667(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static77.method1680(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static77.method1680(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static77.method1680(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static77.method1680(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		if (arg5 != 0) {
			@Pc(120) int local120 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
			if (local120 != 0) {
				this.method1677(local120);
			}
		}
		if (arg4 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
			if (local140 != 0) {
				this.method1663(local140);
			}
		}
		@Pc(149) int local149 = local24 + local77;
		if (local42 + local60 < local149) {
			local149 = local42 + local60;
		}
		local149 = (local149 >> 1) - arg2;
		if (local149 != 0) {
			this.method1672(0, local149, 0);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIIIJILclient!ga;)V")
	@Override
	public final void method4546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) ParticleSystem arg10) {
	}

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "()V")
	public final void method1668() {
		if (this.aClass57Array1 != null) {
			return;
		}
		this.aClass57Array1 = new Class57[this.anInt2139];
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt2139; local10++) {
			this.aClass57Array1[local10] = new Class57();
		}
		for (local10 = 0; local10 < this.anInt2136; local10++) {
			@Pc(34) int local34 = this.anIntArray197[local10];
			@Pc(39) int local39 = this.anIntArray200[local10];
			@Pc(44) int local44 = this.anIntArray196[local10];
			@Pc(54) int local54 = this.anIntArray202[local39] - this.anIntArray202[local34];
			@Pc(64) int local64 = this.anIntArray201[local39] - this.anIntArray201[local34];
			@Pc(74) int local74 = this.anIntArray203[local39] - this.anIntArray203[local34];
			@Pc(84) int local84 = this.anIntArray202[local44] - this.anIntArray202[local34];
			@Pc(94) int local94 = this.anIntArray201[local44] - this.anIntArray201[local34];
			@Pc(104) int local104 = this.anIntArray203[local44] - this.anIntArray203[local34];
			@Pc(112) int local112 = local64 * local104 - local94 * local74;
			@Pc(120) int local120 = local74 * local84 - local104 * local54;
			@Pc(128) int local128;
			for (local128 = local54 * local94 - local84 * local64; local112 > 8192 || local120 > 8192 || local128 > 8192 || local112 < -8192 || local120 < -8192 || local128 < -8192; local128 >>= 0x1) {
				local112 >>= 0x1;
				local120 >>= 0x1;
			}
			@Pc(174) int local174 = (int) Math.sqrt((double) (local112 * local112 + local120 * local120 + local128 * local128));
			if (local174 <= 0) {
				local174 = 1;
			}
			local112 = local112 * 256 / local174;
			local120 = local120 * 256 / local174;
			local128 = local128 * 256 / local174;
			@Pc(201) byte local201;
			if (this.aByteArray30 == null) {
				local201 = 0;
			} else {
				local201 = this.aByteArray30[local10];
			}
			if (local201 == 0) {
				@Pc(214) Class57 local214 = this.aClass57Array1[local34];
				local214.anInt2437 += local112;
				local214.anInt2431 += local120;
				local214.anInt2436 += local128;
				local214.anInt2432++;
				@Pc(243) Class57 local243 = this.aClass57Array1[local39];
				local243.anInt2437 += local112;
				local243.anInt2431 += local120;
				local243.anInt2436 += local128;
				local243.anInt2432++;
				@Pc(272) Class57 local272 = this.aClass57Array1[local44];
				local272.anInt2437 += local112;
				local272.anInt2431 += local120;
				local272.anInt2436 += local128;
				local272.anInt2432++;
			} else if (local201 == 1) {
				if (this.aClass126Array1 == null) {
					this.aClass126Array1 = new TriangleNormal[this.anInt2136];
				}
				@Pc(317) TriangleNormal local317 = this.aClass126Array1[local10] = new TriangleNormal();
				local317.anInt4769 = local112;
				local317.anInt4770 = local120;
				local317.anInt4767 = local128;
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(SS)V")
	public final void method1669(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray23 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt2136; local5++) {
			if (this.aShortArray23[local5] == arg0) {
				this.aShortArray23[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II[[I[[IIIIZZ)Lclient!gb;")
	public final RawModel method1670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method1664();
		@Pc(6) int local6 = arg4 + this.aShort14;
		@Pc(11) int local11 = arg4 + this.aShort16;
		@Pc(16) int local16 = arg6 + this.aShort20;
		@Pc(21) int local21 = arg6 + this.aShort17;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local6 < 0 || local11 + 128 >> 7 >= arg2.length || local16 < 0 || local21 + 128 >> 7 >= arg2[0].length)) {
			return this;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return this;
			}
			if (local6 < 0 || local11 + 128 >> 7 >= arg3.length || local16 < 0 || local21 + 128 >> 7 >= arg3[0].length) {
				return this;
			}
		} else {
			local6 >>= 0x7;
			local11 = local11 + 127 >> 7;
			local16 >>= 0x7;
			local21 = local21 + 127 >> 7;
			if (arg2[local6][local16] == arg5 && arg2[local11][local16] == arg5 && arg2[local6][local21] == arg5 && arg2[local11][local21] == arg5) {
				return this;
			}
		}
		@Pc(147) RawModel local147 = new RawModel();
		local147.anInt2139 = this.anInt2139;
		local147.anInt2136 = this.anInt2136;
		local147.anInt2137 = this.anInt2137;
		local147.anIntArray197 = this.anIntArray197;
		local147.anIntArray200 = this.anIntArray200;
		local147.anIntArray196 = this.anIntArray196;
		local147.aByteArray30 = this.aByteArray30;
		local147.aByteArray35 = this.aByteArray35;
		local147.aByteArray26 = this.aByteArray26;
		local147.aByteArray31 = this.aByteArray31;
		local147.aShortArray24 = this.aShortArray24;
		local147.aShortArray23 = this.aShortArray23;
		local147.aByte7 = this.aByte7;
		local147.aByteArray29 = this.aByteArray29;
		local147.aShortArray26 = this.aShortArray26;
		local147.aShortArray20 = this.aShortArray20;
		local147.aShortArray28 = this.aShortArray28;
		local147.aShortArray27 = this.aShortArray27;
		local147.aShortArray25 = this.aShortArray25;
		local147.aShortArray21 = this.aShortArray21;
		local147.aByteArray27 = this.aByteArray27;
		local147.aByteArray32 = this.aByteArray32;
		local147.aByteArray34 = this.aByteArray34;
		local147.aByteArray28 = this.aByteArray28;
		local147.aByteArray33 = this.aByteArray33;
		local147.anIntArray193 = this.anIntArray193;
		local147.anIntArray192 = this.anIntArray192;
		local147.anIntArrayArray16 = this.anIntArrayArray16;
		local147.anIntArrayArray15 = this.anIntArrayArray15;
		local147.aShort19 = this.aShort19;
		local147.aShort18 = this.aShort18;
		local147.aClass57Array1 = this.aClass57Array1;
		local147.aClass126Array1 = this.aClass126Array1;
		local147.aClass57Array2 = this.aClass57Array2;
		if (arg0 == 3) {
			local147.anIntArray202 = Static115.method2308(this.anIntArray202);
			local147.anIntArray201 = Static115.method2308(this.anIntArray201);
			local147.anIntArray203 = Static115.method2308(this.anIntArray203);
		} else {
			local147.anIntArray202 = this.anIntArray202;
			local147.anIntArray201 = new int[local147.anInt2139];
			local147.anIntArray203 = this.anIntArray203;
		}
		@Pc(326) int local326;
		@Pc(337) int local337;
		@Pc(344) int local344;
		@Pc(348) int local348;
		@Pc(352) int local352;
		@Pc(356) int local356;
		@Pc(360) int local360;
		@Pc(382) int local382;
		@Pc(408) int local408;
		@Pc(420) int local420;
		if (arg0 == 1) {
			for (local326 = 0; local326 < local147.anInt2139; local326++) {
				local337 = this.anIntArray202[local326] + arg4;
				local344 = this.anIntArray203[local326] + arg6;
				local348 = local337 & 0x7F;
				local352 = local344 & 0x7F;
				local356 = local337 >> 7;
				local360 = local344 >> 7;
				local382 = arg2[local356][local360] * (128 - local348) + arg2[local356 + 1][local360] * local348 >> 7;
				local408 = arg2[local356][local360 + 1] * (128 - local348) + arg2[local356 + 1][local360 + 1] * local348 >> 7;
				local420 = local382 * (128 - local352) + local408 * local352 >> 7;
				local147.anIntArray201[local326] = this.anIntArray201[local326] + local420 - arg5;
			}
		} else {
			@Pc(547) int local547;
			if (arg0 == 2) {
				for (local326 = 0; local326 < local147.anInt2139; local326++) {
					local337 = (this.anIntArray201[local326] << 16) / this.aShort15;
					if (local337 < arg1) {
						local344 = this.anIntArray202[local326] + arg4;
						local348 = this.anIntArray203[local326] + arg6;
						local352 = local344 & 0x7F;
						local356 = local348 & 0x7F;
						local360 = local344 >> 7;
						local382 = local348 >> 7;
						local408 = arg2[local360][local382] * (128 - local352) + arg2[local360 + 1][local382] * local352 >> 7;
						local420 = arg2[local360][local382 + 1] * (128 - local352) + arg2[local360 + 1][local382 + 1] * local352 >> 7;
						local547 = local408 * (128 - local356) + local420 * local356 >> 7;
						local147.anIntArray201[local326] = this.anIntArray201[local326] + (local547 - arg5) * (arg1 - local337) / arg1;
					} else {
						local147.anIntArray201[local326] = this.anIntArray201[local326];
					}
				}
			} else if (arg0 == 3) {
				local326 = (arg1 & 0xFF) * 4;
				local337 = (arg1 >> 8 & 0xFF) * 4;
				this.method1667(arg2, arg4, arg5, arg6, local326, local337);
			} else if (arg0 == 4) {
				local326 = this.aShort13 - this.aShort15;
				for (local337 = 0; local337 < this.anInt2139; local337++) {
					local344 = this.anIntArray202[local337] + arg4;
					local348 = this.anIntArray203[local337] + arg6;
					local352 = local344 & 0x7F;
					local356 = local348 & 0x7F;
					local360 = local344 >> 7;
					local382 = local348 >> 7;
					local408 = arg3[local360][local382] * (128 - local352) + arg3[local360 + 1][local382] * local352 >> 7;
					local420 = arg3[local360][local382 + 1] * (128 - local352) + arg3[local360 + 1][local382 + 1] * local352 >> 7;
					local547 = local408 * (128 - local356) + local420 * local356 >> 7;
					local147.anIntArray201[local337] = this.anIntArray201[local337] + local547 + local326 - arg5;
				}
			} else if (arg0 == 5) {
				local326 = this.aShort13 - this.aShort15;
				for (local337 = 0; local337 < this.anInt2139; local337++) {
					local344 = this.anIntArray202[local337] + arg4;
					local348 = this.anIntArray203[local337] + arg6;
					local352 = local344 & 0x7F;
					local356 = local348 & 0x7F;
					local360 = local344 >> 7;
					local382 = local348 >> 7;
					local408 = arg2[local360][local382] * (128 - local352) + arg2[local360 + 1][local382] * local352 >> 7;
					local420 = arg2[local360][local382 + 1] * (128 - local352) + arg2[local360 + 1][local382 + 1] * local352 >> 7;
					local547 = local408 * (128 - local356) + local420 * local356 >> 7;
					local408 = arg3[local360][local382] * (128 - local352) + arg3[local360 + 1][local382] * local352 >> 7;
					local420 = arg3[local360][local382 + 1] * (128 - local352) + arg3[local360 + 1][local382 + 1] * local352 >> 7;
					@Pc(890) int local890 = local408 * (128 - local356) + local420 * local356 >> 7;
					@Pc(894) int local894 = local547 - local890;
					local147.anIntArray201[local337] = ((this.anIntArray201[local337] << 8) / local326 * local894 >> 8) - (arg5 - local547);
				}
			}
		}
		this.aBoolean121 = false;
		return local147;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIII)Lclient!w;")
	public final SoftwareModel method1671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new SoftwareModel(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method4545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(III)V")
	public final void method1672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2139; local1++) {
			this.anIntArray202[local1] += arg0;
			this.anIntArray201[local1] += arg1;
			this.anIntArray203[local1] += arg2;
		}
		this.method1678();
	}

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "()V")
	public final void method1673() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt2139; local1++) {
			this.anIntArray203[local1] = -this.anIntArray203[local1];
		}
		for (local1 = 0; local1 < this.anInt2136; local1++) {
			@Pc(27) int local27 = this.anIntArray197[local1];
			this.anIntArray197[local1] = this.anIntArray196[local1];
			this.anIntArray196[local1] = local27;
		}
		this.method1678();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "()Z")
	@Override
	public final boolean method4543() {
		return true;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([B)V")
	private void method1674(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Buffer local4 = new Buffer(arg0);
		@Pc(9) Buffer local9 = new Buffer(arg0);
		@Pc(14) Buffer local14 = new Buffer(arg0);
		@Pc(19) Buffer local19 = new Buffer(arg0);
		@Pc(24) Buffer local24 = new Buffer(arg0);
		@Pc(29) Buffer local29 = new Buffer(arg0);
		@Pc(34) Buffer local34 = new Buffer(arg0);
		local4.offset = arg0.length - 23;
		@Pc(44) int local44 = local4.g2();
		@Pc(48) int local48 = local4.g2();
		@Pc(52) int local52 = local4.g1();
		@Pc(56) int local56 = local4.g1();
		@Pc(65) boolean local65 = (local56 & 0x1) == 1;
		@Pc(74) boolean local74 = (local56 & 0x2) == 2;
		@Pc(78) int local78 = local4.g1();
		@Pc(82) int local82 = local4.g1();
		@Pc(86) int local86 = local4.g1();
		@Pc(90) int local90 = local4.g1();
		@Pc(94) int local94 = local4.g1();
		@Pc(98) int local98 = local4.g2();
		@Pc(102) int local102 = local4.g2();
		@Pc(106) int local106 = local4.g2();
		@Pc(110) int local110 = local4.g2();
		@Pc(114) int local114 = local4.g2();
		@Pc(116) int local116 = 0;
		@Pc(118) int local118 = 0;
		@Pc(120) int local120 = 0;
		@Pc(131) int local131;
		if (local52 > 0) {
			this.aByteArray29 = new byte[local52];
			local4.offset = 0;
			for (local131 = 0; local131 < local52; local131++) {
				@Pc(143) byte local143 = this.aByteArray29[local131] = local4.g1s();
				if (local143 == 0) {
					local116++;
				}
				if (local143 >= 1 && local143 <= 3) {
					local118++;
				}
				if (local143 == 2) {
					local120++;
				}
			}
		}
		local131 = local52 + local44;
		@Pc(169) int local169 = local131;
		if (local65) {
			local131 += local48;
		}
		@Pc(177) int local177 = local131;
		local131 += local48;
		@Pc(183) int local183 = local131;
		if (local78 == 255) {
			local131 += local48;
		}
		@Pc(192) int local192 = local131;
		if (local86 == 1) {
			local131 += local48;
		}
		@Pc(201) int local201 = local131;
		if (local94 == 1) {
			local131 += local44;
		}
		@Pc(210) int local210 = local131;
		if (local82 == 1) {
			local131 += local48;
		}
		@Pc(219) int local219 = local131;
		local131 += local110;
		@Pc(225) int local225 = local131;
		if (local90 == 1) {
			local131 += local48 * 2;
		}
		@Pc(236) int local236 = local131;
		local131 += local114;
		@Pc(242) int local242 = local131;
		local131 += local48 * 2;
		@Pc(250) int local250 = local131;
		local131 += local98;
		@Pc(256) int local256 = local131;
		local131 += local102;
		@Pc(262) int local262 = local131;
		local131 += local106;
		@Pc(268) int local268 = local131;
		local131 += local116 * 6;
		@Pc(276) int local276 = local131;
		local131 += local118 * 6;
		@Pc(284) int local284 = local131;
		local131 += local118 * 6;
		@Pc(292) int local292 = local131;
		local131 += local118;
		@Pc(298) int local298 = local131;
		local131 += local118;
		@Pc(304) int local304 = local131;
		local131 += local118 + local120 * 2;
		this.anInt2139 = local44;
		this.anInt2136 = local48;
		this.anInt2137 = local52;
		this.anIntArray202 = new int[local44];
		this.anIntArray201 = new int[local44];
		this.anIntArray203 = new int[local44];
		this.anIntArray197 = new int[local48];
		this.anIntArray200 = new int[local48];
		this.anIntArray196 = new int[local48];
		if (local94 == 1) {
			this.anIntArray193 = new int[local44];
		}
		if (local65) {
			this.aByteArray30 = new byte[local48];
		}
		if (local78 == 255) {
			this.aByteArray35 = new byte[local48];
		} else {
			this.aByte7 = (byte) local78;
		}
		if (local82 == 1) {
			this.aByteArray26 = new byte[local48];
		}
		if (local86 == 1) {
			this.anIntArray192 = new int[local48];
		}
		if (local90 == 1) {
			this.aShortArray23 = new short[local48];
		}
		if (local90 == 1 && local52 > 0) {
			this.aByteArray31 = new byte[local48];
		}
		this.aShortArray24 = new short[local48];
		if (local52 > 0) {
			this.aShortArray26 = new short[local52];
			this.aShortArray20 = new short[local52];
			this.aShortArray28 = new short[local52];
			if (local118 > 0) {
				this.aShortArray27 = new short[local118];
				this.aShortArray25 = new short[local118];
				this.aShortArray21 = new short[local118];
				this.aByteArray27 = new byte[local118];
				this.aByteArray32 = new byte[local118];
				this.aByteArray34 = new byte[local118];
			}
			if (local120 > 0) {
				this.aByteArray28 = new byte[local120];
				this.aByteArray33 = new byte[local120];
			}
		}
		local4.offset = local52;
		local9.offset = local250;
		local14.offset = local256;
		local19.offset = local262;
		local24.offset = local201;
		@Pc(473) int local473 = 0;
		@Pc(475) int local475 = 0;
		@Pc(477) int local477 = 0;
		@Pc(479) int local479;
		@Pc(486) int local486;
		@Pc(488) int local488;
		@Pc(498) int local498;
		@Pc(508) int local508;
		for (local479 = 0; local479 < local44; local479++) {
			local486 = local4.g1();
			local488 = 0;
			if ((local486 & 0x1) != 0) {
				local488 = local9.gSmart1or2s();
			}
			local498 = 0;
			if ((local486 & 0x2) != 0) {
				local498 = local14.gSmart1or2s();
			}
			local508 = 0;
			if ((local486 & 0x4) != 0) {
				local508 = local19.gSmart1or2s();
			}
			this.anIntArray202[local479] = local473 + local488;
			this.anIntArray201[local479] = local475 + local498;
			this.anIntArray203[local479] = local477 + local508;
			local473 = this.anIntArray202[local479];
			local475 = this.anIntArray201[local479];
			local477 = this.anIntArray203[local479];
			if (local94 == 1) {
				this.anIntArray193[local479] = local24.g1();
			}
		}
		local4.offset = local242;
		local9.offset = local169;
		local14.offset = local183;
		local19.offset = local210;
		local24.offset = local192;
		local29.offset = local225;
		local34.offset = local236;
		for (local479 = 0; local479 < local48; local479++) {
			this.aShortArray24[local479] = (short) local4.g2();
			if (local65) {
				this.aByteArray30[local479] = local9.g1s();
			}
			if (local78 == 255) {
				this.aByteArray35[local479] = local14.g1s();
			}
			if (local82 == 1) {
				this.aByteArray26[local479] = local19.g1s();
			}
			if (local86 == 1) {
				this.anIntArray192[local479] = local24.g1();
			}
			if (local90 == 1) {
				this.aShortArray23[local479] = (short) (local29.g2() - 1);
			}
			if (this.aByteArray31 != null) {
				if (this.aShortArray23[local479] == -1) {
					this.aByteArray31[local479] = -1;
				} else {
					this.aByteArray31[local479] = (byte) (local34.g1() - 1);
				}
			}
		}
		local4.offset = local219;
		local9.offset = local177;
		local479 = 0;
		local486 = 0;
		local488 = 0;
		local498 = 0;
		@Pc(700) int local700;
		for (local508 = 0; local508 < local48; local508++) {
			local700 = local9.g1();
			if (local700 == 1) {
				local479 = local4.gSmart1or2s() + local498;
				local486 = local4.gSmart1or2s() + local479;
				local488 = local4.gSmart1or2s() + local486;
				local498 = local488;
				this.anIntArray197[local508] = local479;
				this.anIntArray200[local508] = local486;
				this.anIntArray196[local508] = local488;
			}
			if (local700 == 2) {
				local486 = local488;
				local488 = local4.gSmart1or2s() + local498;
				local498 = local488;
				this.anIntArray197[local508] = local479;
				this.anIntArray200[local508] = local486;
				this.anIntArray196[local508] = local488;
			}
			if (local700 == 3) {
				local479 = local488;
				local488 = local4.gSmart1or2s() + local498;
				local498 = local488;
				this.anIntArray197[local508] = local479;
				this.anIntArray200[local508] = local486;
				this.anIntArray196[local508] = local488;
			}
			if (local700 == 4) {
				@Pc(803) int local803 = local479;
				local479 = local486;
				local486 = local803;
				local488 = local4.gSmart1or2s() + local498;
				local498 = local488;
				this.anIntArray197[local508] = local479;
				this.anIntArray200[local508] = local803;
				this.anIntArray196[local508] = local488;
			}
		}
		local4.offset = local268;
		local9.offset = local276;
		local14.offset = local284;
		local19.offset = local292;
		local24.offset = local298;
		local29.offset = local304;
		for (local508 = 0; local508 < local52; local508++) {
			local700 = this.aByteArray29[local508] & 0xFF;
			if (local700 == 0) {
				this.aShortArray26[local508] = (short) local4.g2();
				this.aShortArray20[local508] = (short) local4.g2();
				this.aShortArray28[local508] = (short) local4.g2();
			}
			if (local700 == 1) {
				this.aShortArray26[local508] = (short) local9.g2();
				this.aShortArray20[local508] = (short) local9.g2();
				this.aShortArray28[local508] = (short) local9.g2();
				this.aShortArray27[local508] = (short) local14.g2();
				this.aShortArray25[local508] = (short) local14.g2();
				this.aShortArray21[local508] = (short) local14.g2();
				this.aByteArray27[local508] = local19.g1s();
				this.aByteArray32[local508] = local24.g1s();
				this.aByteArray34[local508] = local29.g1s();
			}
			if (local700 == 2) {
				this.aShortArray26[local508] = (short) local9.g2();
				this.aShortArray20[local508] = (short) local9.g2();
				this.aShortArray28[local508] = (short) local9.g2();
				this.aShortArray27[local508] = (short) local14.g2();
				this.aShortArray25[local508] = (short) local14.g2();
				this.aShortArray21[local508] = (short) local14.g2();
				this.aByteArray27[local508] = local19.g1s();
				this.aByteArray32[local508] = local24.g1s();
				this.aByteArray34[local508] = local29.g1s();
				this.aByteArray28[local508] = local29.g1s();
				this.aByteArray33[local508] = local29.g1s();
			}
			if (local700 == 3) {
				this.aShortArray26[local508] = (short) local9.g2();
				this.aShortArray20[local508] = (short) local9.g2();
				this.aShortArray28[local508] = (short) local9.g2();
				this.aShortArray27[local508] = (short) local14.g2();
				this.aShortArray25[local508] = (short) local14.g2();
				this.aShortArray21[local508] = (short) local14.g2();
				this.aByteArray27[local508] = local19.g1s();
				this.aByteArray32[local508] = local24.g1s();
				this.aByteArray34[local508] = local29.g1s();
			}
		}
		if (!local74) {
			return;
		}
		local4.offset = local131;
		local508 = local4.g1();
		if (local508 > 0) {
			local4.offset += local508 * 4;
		}
		local700 = local4.g1();
		if (local700 > 0) {
			local4.offset += local700 * 4;
		}
	}

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "()Lclient!gb;")
	public final RawModel method1675() {
		@Pc(3) RawModel local3 = new RawModel();
		if (this.aByteArray30 != null) {
			local3.aByteArray30 = new byte[this.anInt2136];
			for (@Pc(13) int local13 = 0; local13 < this.anInt2136; local13++) {
				local3.aByteArray30[local13] = this.aByteArray30[local13];
			}
		}
		local3.anInt2139 = this.anInt2139;
		local3.anInt2136 = this.anInt2136;
		local3.anInt2137 = this.anInt2137;
		local3.anIntArray202 = this.anIntArray202;
		local3.anIntArray201 = this.anIntArray201;
		local3.anIntArray203 = this.anIntArray203;
		local3.anIntArray197 = this.anIntArray197;
		local3.anIntArray200 = this.anIntArray200;
		local3.anIntArray196 = this.anIntArray196;
		local3.aByteArray35 = this.aByteArray35;
		local3.aByteArray26 = this.aByteArray26;
		local3.aByteArray31 = this.aByteArray31;
		local3.aShortArray24 = this.aShortArray24;
		local3.aShortArray23 = this.aShortArray23;
		local3.aByte7 = this.aByte7;
		local3.aByteArray29 = this.aByteArray29;
		local3.aShortArray26 = this.aShortArray26;
		local3.aShortArray20 = this.aShortArray20;
		local3.aShortArray28 = this.aShortArray28;
		local3.aShortArray27 = this.aShortArray27;
		local3.aShortArray25 = this.aShortArray25;
		local3.aShortArray21 = this.aShortArray21;
		local3.aByteArray27 = this.aByteArray27;
		local3.aByteArray32 = this.aByteArray32;
		local3.aByteArray34 = this.aByteArray34;
		local3.aByteArray28 = this.aByteArray28;
		local3.aByteArray33 = this.aByteArray33;
		local3.anIntArray193 = this.anIntArray193;
		local3.anIntArray192 = this.anIntArray192;
		local3.anIntArrayArray16 = this.anIntArrayArray16;
		local3.anIntArrayArray15 = this.anIntArrayArray15;
		local3.aClass57Array1 = this.aClass57Array1;
		local3.aClass126Array1 = this.aClass126Array1;
		local3.aShort19 = this.aShort19;
		local3.aShort18 = this.aShort18;
		return local3;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIBSB)I")
	public final int method1676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) byte arg4) {
		this.anIntArray197[this.anInt2136] = arg0;
		this.anIntArray200[this.anInt2136] = arg1;
		this.anIntArray196[this.anInt2136] = arg2;
		this.aByteArray30[this.anInt2136] = 1;
		this.aByteArray31[this.anInt2136] = -1;
		this.aShortArray24[this.anInt2136] = arg3;
		this.aShortArray23[this.anInt2136] = -1;
		this.aByteArray26[this.anInt2136] = arg4;
		return this.anInt2136++;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
	private void method1677(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static77.anIntArray198[arg0];
		@Pc(7) int local7 = Static77.anIntArray195[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2139; local9++) {
			@Pc(29) int local29 = this.anIntArray201[local9] * local7 - this.anIntArray203[local9] * local3 >> 16;
			this.anIntArray203[local9] = this.anIntArray201[local9] * local3 + this.anIntArray203[local9] * local7 >> 16;
			this.anIntArray201[local9] = local29;
		}
		this.method1678();
	}

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "()V")
	private void method1678() {
		this.aClass57Array1 = null;
		this.aClass57Array2 = null;
		this.aClass126Array1 = null;
		this.aBoolean121 = false;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(IIIII)Lclient!ak;")
	public final Model method1679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (GlRenderer.enabled) {
			@Pc(9) GlModel local9 = new GlModel(this, arg0, arg1, true);
			local9.method4099();
			return local9;
		} else {
			return new SoftwareModel(this, arg0, arg1, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "()I")
	@Override
	public final int method4549() {
		if (!this.aBoolean121) {
			this.method1664();
		}
		return this.aShort15;
	}

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "()V")
	public final void method1681() {
		this.anIntArray193 = null;
		this.anIntArray192 = null;
		this.anIntArrayArray16 = null;
		this.anIntArrayArray15 = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!th;IIIZ)V")
	@Override
	public final void method4544(@OriginalArg(0) Entity arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) RawModel local2 = (RawModel) arg0;
		local2.method1664();
		local2.method1668();
		Static77.anInt2138++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray202;
		@Pc(18) int local18 = local2.anInt2139;
		@Pc(20) int local20;
		for (local20 = 0; local20 < this.anInt2139; local20++) {
			@Pc(29) Class57 local29 = this.aClass57Array1[local20];
			if (local29.anInt2432 != 0) {
				@Pc(40) int local40 = this.anIntArray201[local20] - arg2;
				if (local40 >= local2.aShort15 && local40 <= local2.aShort13) {
					@Pc(56) int local56 = this.anIntArray202[local20] - arg1;
					if (local56 >= local2.aShort14 && local56 <= local2.aShort16) {
						@Pc(72) int local72 = this.anIntArray203[local20] - arg3;
						if (local72 >= local2.aShort20 && local72 <= local2.aShort17) {
							for (@Pc(83) int local83 = 0; local83 < local18; local83++) {
								@Pc(91) Class57 local91 = local2.aClass57Array1[local83];
								if (local56 == local15[local83] && local72 == local2.anIntArray203[local83] && local40 == local2.anIntArray201[local83] && local91.anInt2432 != 0) {
									if (this.aClass57Array2 == null) {
										this.aClass57Array2 = new Class57[this.anInt2139];
									}
									if (local2.aClass57Array2 == null) {
										local2.aClass57Array2 = new Class57[local18];
									}
									@Pc(131) Class57 local131 = this.aClass57Array2[local20];
									if (local131 == null) {
										local131 = this.aClass57Array2[local20] = new Class57(local29);
									}
									@Pc(148) Class57 local148 = local2.aClass57Array2[local83];
									if (local148 == null) {
										local148 = local2.aClass57Array2[local83] = new Class57(local91);
									}
									local131.anInt2437 += local91.anInt2437;
									local131.anInt2431 += local91.anInt2431;
									local131.anInt2436 += local91.anInt2436;
									local131.anInt2432 += local91.anInt2432;
									local148.anInt2437 += local29.anInt2437;
									local148.anInt2431 += local29.anInt2431;
									local148.anInt2436 += local29.anInt2436;
									local148.anInt2432 += local29.anInt2432;
									local12++;
									Static77.anIntArray194[local20] = Static77.anInt2138;
									Static77.anIntArray199[local83] = Static77.anInt2138;
								}
							}
						}
					}
				}
			}
		}
		if (local12 < 3 || !arg4) {
			return;
		}
		for (local20 = 0; local20 < this.anInt2136; local20++) {
			if (Static77.anIntArray194[this.anIntArray197[local20]] == Static77.anInt2138 && Static77.anIntArray194[this.anIntArray200[local20]] == Static77.anInt2138 && Static77.anIntArray194[this.anIntArray196[local20]] == Static77.anInt2138) {
				if (this.aByteArray30 == null) {
					this.aByteArray30 = new byte[this.anInt2136];
				}
				this.aByteArray30[local20] = 2;
			}
		}
		for (local20 = 0; local20 < local2.anInt2136; local20++) {
			if (Static77.anIntArray199[local2.anIntArray197[local20]] == Static77.anInt2138 && Static77.anIntArray199[local2.anIntArray200[local20]] == Static77.anInt2138 && Static77.anIntArray199[local2.anIntArray196[local20]] == Static77.anInt2138) {
				if (local2.aByteArray30 == null) {
					local2.aByteArray30 = new byte[local2.anInt2136];
				}
				local2.aByteArray30[local20] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
	public final void method1682() {
		@Pc(3) int local3 = Static77.anIntArray198[256];
		@Pc(7) int local7 = Static77.anIntArray195[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2139; local9++) {
			@Pc(29) int local29 = this.anIntArray203[local9] * local3 + this.anIntArray202[local9] * local7 >> 16;
			this.anIntArray203[local9] = this.anIntArray203[local9] * local7 - this.anIntArray202[local9] * local3 >> 16;
			this.anIntArray202[local9] = local29;
		}
		this.method1678();
	}

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "()V")
	public final void method1683() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(22) int local22;
		@Pc(9) int local9;
		@Pc(18) int local18;
		if (this.anIntArray193 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2139; local9++) {
				local18 = this.anIntArray193[local9];
				local22 = local5[local18]++;
				if (local18 > local7) {
					local7 = local18;
				}
			}
			this.anIntArrayArray16 = new int[local7 + 1][];
			for (local9 = 0; local9 <= local7; local9++) {
				this.anIntArrayArray16[local9] = new int[local5[local9]];
				local5[local9] = 0;
			}
			local9 = 0;
			while (local9 < this.anInt2139) {
				local18 = this.anIntArray193[local9];
				this.anIntArrayArray16[local18][local5[local18]++] = local9++;
			}
			this.anIntArray193 = null;
		}
		if (this.anIntArray192 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2136; local9++) {
			local18 = this.anIntArray192[local9];
			local22 = local5[local18]++;
			if (local18 > local7) {
				local7 = local18;
			}
		}
		this.anIntArrayArray15 = new int[local7 + 1][];
		for (local9 = 0; local9 <= local7; local9++) {
			this.anIntArrayArray15[local9] = new int[local5[local9]];
			local5[local9] = 0;
		}
		local9 = 0;
		while (local9 < this.anInt2136) {
			local18 = this.anIntArray192[local9];
			this.anIntArrayArray15[local18][local5[local18]++] = local9++;
		}
		this.anIntArray192 = null;
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(III)V")
	public final void method1684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5;
		@Pc(9) int local9;
		@Pc(11) int local11;
		@Pc(31) int local31;
		if (arg2 != 0) {
			local5 = Static77.anIntArray198[arg2];
			local9 = Static77.anIntArray195[arg2];
			for (local11 = 0; local11 < this.anInt2139; local11++) {
				local31 = this.anIntArray201[local11] * local5 + this.anIntArray202[local11] * local9 >> 16;
				this.anIntArray201[local11] = this.anIntArray201[local11] * local9 - this.anIntArray202[local11] * local5 >> 16;
				this.anIntArray202[local11] = local31;
			}
		}
		if (arg0 != 0) {
			local5 = Static77.anIntArray198[arg0];
			local9 = Static77.anIntArray195[arg0];
			for (local11 = 0; local11 < this.anInt2139; local11++) {
				local31 = this.anIntArray201[local11] * local9 - this.anIntArray203[local11] * local5 >> 16;
				this.anIntArray203[local11] = this.anIntArray201[local11] * local5 + this.anIntArray203[local11] * local9 >> 16;
				this.anIntArray201[local11] = local31;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local5 = Static77.anIntArray198[arg1];
		local9 = Static77.anIntArray195[arg1];
		for (local11 = 0; local11 < this.anInt2139; local11++) {
			local31 = this.anIntArray203[local11] * local5 + this.anIntArray202[local11] * local9 >> 16;
			this.anIntArray203[local11] = this.anIntArray203[local11] * local9 - this.anIntArray202[local11] * local5 >> 16;
			this.anIntArray202[local11] = local31;
		}
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(III)I")
	public final int method1685(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2139; local1++) {
			if (this.anIntArray202[local1] == arg0 && this.anIntArray201[local1] == 0 && this.anIntArray203[local1] == arg1) {
				return local1;
			}
		}
		this.anIntArray202[this.anInt2139] = arg0;
		this.anIntArray201[this.anInt2139] = 0;
		this.anIntArray203[this.anInt2139] = arg1;
		return this.anInt2139++;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(SS)V")
	public final void method1687(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2136; local1++) {
			if (this.aShortArray24[local1] == arg0) {
				this.aShortArray24[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "([B)V")
	private void method1688(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Buffer local8 = new Buffer(arg0);
		@Pc(13) Buffer local13 = new Buffer(arg0);
		@Pc(18) Buffer local18 = new Buffer(arg0);
		@Pc(23) Buffer local23 = new Buffer(arg0);
		@Pc(28) Buffer local28 = new Buffer(arg0);
		local8.offset = arg0.length - 18;
		@Pc(38) int local38 = local8.g2();
		@Pc(42) int local42 = local8.g2();
		@Pc(46) int local46 = local8.g1();
		@Pc(50) int local50 = local8.g1();
		@Pc(54) int local54 = local8.g1();
		@Pc(58) int local58 = local8.g1();
		@Pc(62) int local62 = local8.g1();
		@Pc(66) int local66 = local8.g1();
		@Pc(70) int local70 = local8.g2();
		@Pc(74) int local74 = local8.g2();
		@Pc(78) int local78 = local8.g2();
		@Pc(82) int local82 = local8.g2();
		@Pc(90) int local90 = local38;
		@Pc(92) int local92 = local90;
		local90 += local42;
		@Pc(98) int local98 = local90;
		if (local54 == 255) {
			local90 += local42;
		}
		@Pc(107) int local107 = local90;
		if (local62 == 1) {
			local90 += local42;
		}
		@Pc(116) int local116 = local90;
		if (local50 == 1) {
			local90 += local42;
		}
		@Pc(125) int local125 = local90;
		if (local66 == 1) {
			local90 += local38;
		}
		@Pc(134) int local134 = local90;
		if (local58 == 1) {
			local90 += local42;
		}
		@Pc(143) int local143 = local90;
		local90 += local82;
		@Pc(149) int local149 = local90;
		local90 += local42 * 2;
		@Pc(157) int local157 = local90;
		local90 += local46 * 6;
		@Pc(165) int local165 = local90;
		local90 += local70;
		@Pc(171) int local171 = local90;
		local90 += local74;
		this.anInt2139 = local38;
		this.anInt2136 = local42;
		this.anInt2137 = local46;
		this.anIntArray202 = new int[local38];
		this.anIntArray201 = new int[local38];
		this.anIntArray203 = new int[local38];
		this.anIntArray197 = new int[local42];
		this.anIntArray200 = new int[local42];
		this.anIntArray196 = new int[local42];
		if (local46 > 0) {
			this.aByteArray29 = new byte[local46];
			this.aShortArray26 = new short[local46];
			this.aShortArray20 = new short[local46];
			this.aShortArray28 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray193 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray30 = new byte[local42];
			this.aByteArray31 = new byte[local42];
			this.aShortArray23 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray35 = new byte[local42];
		} else {
			this.aByte7 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray26 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray192 = new int[local42];
		}
		this.aShortArray24 = new short[local42];
		local8.offset = 0;
		local13.offset = local165;
		local18.offset = local171;
		local23.offset = local90;
		local28.offset = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(307) int local307;
		@Pc(314) int local314;
		@Pc(316) int local316;
		@Pc(326) int local326;
		@Pc(336) int local336;
		for (local307 = 0; local307 < local38; local307++) {
			local314 = local8.g1();
			local316 = 0;
			if ((local314 & 0x1) != 0) {
				local316 = local13.gSmart1or2s();
			}
			local326 = 0;
			if ((local314 & 0x2) != 0) {
				local326 = local18.gSmart1or2s();
			}
			local336 = 0;
			if ((local314 & 0x4) != 0) {
				local336 = local23.gSmart1or2s();
			}
			this.anIntArray202[local307] = local301 + local316;
			this.anIntArray201[local307] = local303 + local326;
			this.anIntArray203[local307] = local305 + local336;
			local301 = this.anIntArray202[local307];
			local303 = this.anIntArray201[local307];
			local305 = this.anIntArray203[local307];
			if (local66 == 1) {
				this.anIntArray193[local307] = local28.g1();
			}
		}
		local8.offset = local149;
		local13.offset = local116;
		local18.offset = local98;
		local23.offset = local134;
		local28.offset = local107;
		for (local307 = 0; local307 < local42; local307++) {
			this.aShortArray24[local307] = (short) local8.g2();
			if (local50 == 1) {
				local314 = local13.g1();
				if ((local314 & 0x1) == 1) {
					this.aByteArray30[local307] = 1;
					local1 = true;
				} else {
					this.aByteArray30[local307] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray31[local307] = (byte) (local314 >> 2);
					this.aShortArray23[local307] = this.aShortArray24[local307];
					this.aShortArray24[local307] = 127;
					if (this.aShortArray23[local307] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray31[local307] = -1;
					this.aShortArray23[local307] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray35[local307] = local18.g1s();
			}
			if (local58 == 1) {
				this.aByteArray26[local307] = local23.g1s();
			}
			if (local62 == 1) {
				this.anIntArray192[local307] = local28.g1();
			}
		}
		local8.offset = local143;
		local13.offset = local92;
		local307 = 0;
		local314 = 0;
		local316 = 0;
		local326 = 0;
		@Pc(545) int local545;
		@Pc(648) int local648;
		for (local336 = 0; local336 < local42; local336++) {
			local545 = local13.g1();
			if (local545 == 1) {
				local307 = local8.gSmart1or2s() + local326;
				local314 = local8.gSmart1or2s() + local307;
				local316 = local8.gSmart1or2s() + local314;
				local326 = local316;
				this.anIntArray197[local336] = local307;
				this.anIntArray200[local336] = local314;
				this.anIntArray196[local336] = local316;
			}
			if (local545 == 2) {
				local314 = local316;
				local316 = local8.gSmart1or2s() + local326;
				local326 = local316;
				this.anIntArray197[local336] = local307;
				this.anIntArray200[local336] = local314;
				this.anIntArray196[local336] = local316;
			}
			if (local545 == 3) {
				local307 = local316;
				local316 = local8.gSmart1or2s() + local326;
				local326 = local316;
				this.anIntArray197[local336] = local307;
				this.anIntArray200[local336] = local314;
				this.anIntArray196[local336] = local316;
			}
			if (local545 == 4) {
				local648 = local307;
				local307 = local314;
				local314 = local648;
				local316 = local8.gSmart1or2s() + local326;
				local326 = local316;
				this.anIntArray197[local336] = local307;
				this.anIntArray200[local336] = local648;
				this.anIntArray196[local336] = local316;
			}
		}
		local8.offset = local157;
		for (local336 = 0; local336 < local46; local336++) {
			this.aByteArray29[local336] = 0;
			this.aShortArray26[local336] = (short) local8.g2();
			this.aShortArray20[local336] = (short) local8.g2();
			this.aShortArray28[local336] = (short) local8.g2();
		}
		if (this.aByteArray31 != null) {
			@Pc(721) boolean local721 = false;
			for (local545 = 0; local545 < local42; local545++) {
				local648 = this.aByteArray31[local545] & 0xFF;
				if (local648 != 255) {
					if ((this.aShortArray26[local648] & 0xFFFF) == this.anIntArray197[local545] && (this.aShortArray20[local648] & 0xFFFF) == this.anIntArray200[local545] && (this.aShortArray28[local648] & 0xFFFF) == this.anIntArray196[local545]) {
						this.aByteArray31[local545] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray31 = null;
			}
		}
		if (!local3) {
			this.aShortArray23 = null;
		}
		if (!local1) {
			this.aByteArray30 = null;
		}
	}

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "()V")
	public final void method1689() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2139; local1++) {
			@Pc(10) int local10 = this.anIntArray203[local1];
			this.anIntArray203[local1] = this.anIntArray202[local1];
			this.anIntArray202[local1] = -local10;
		}
		this.method1678();
	}
}
