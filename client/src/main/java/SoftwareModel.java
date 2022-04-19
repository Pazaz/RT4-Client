import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class SoftwareModel extends Model {

	@OriginalMember(owner = "client!w", name = "t", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!w", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!w", name = "v", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!w", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!w", name = "x", descriptor = "S")
	private short aShort31;

	@OriginalMember(owner = "client!w", name = "y", descriptor = "[I")
	private int[] anIntArray523;

	@OriginalMember(owner = "client!w", name = "A", descriptor = "[I")
	private int[] anIntArray524;

	@OriginalMember(owner = "client!w", name = "C", descriptor = "S")
	private short aShort32;

	@OriginalMember(owner = "client!w", name = "D", descriptor = "S")
	private short aShort33;

	@OriginalMember(owner = "client!w", name = "E", descriptor = "[B")
	private byte[] aByteArray73;

	@OriginalMember(owner = "client!w", name = "F", descriptor = "[I")
	private int[] anIntArray525;

	@OriginalMember(owner = "client!w", name = "G", descriptor = "[I")
	private int[] anIntArray526;

	@OriginalMember(owner = "client!w", name = "H", descriptor = "[I")
	public int[] anIntArray527;

	@OriginalMember(owner = "client!w", name = "I", descriptor = "S")
	private short aShort34;

	@OriginalMember(owner = "client!w", name = "J", descriptor = "[I")
	public int[] anIntArray528;

	@OriginalMember(owner = "client!w", name = "K", descriptor = "S")
	private short aShort35;

	@OriginalMember(owner = "client!w", name = "L", descriptor = "[I")
	private int[] anIntArray529;

	@OriginalMember(owner = "client!w", name = "M", descriptor = "S")
	private short aShort36;

	@OriginalMember(owner = "client!w", name = "O", descriptor = "[I")
	private int[] anIntArray530;

	@OriginalMember(owner = "client!w", name = "Q", descriptor = "S")
	private short aShort37;

	@OriginalMember(owner = "client!w", name = "R", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!w", name = "S", descriptor = "S")
	private short aShort38;

	@OriginalMember(owner = "client!w", name = "T", descriptor = "[I")
	public int[] anIntArray531;

	@OriginalMember(owner = "client!w", name = "U", descriptor = "[I")
	private int[] anIntArray532;

	@OriginalMember(owner = "client!w", name = "W", descriptor = "[I")
	private int[] anIntArray533;

	@OriginalMember(owner = "client!w", name = "X", descriptor = "[B")
	private byte[] aByteArray74;

	@OriginalMember(owner = "client!w", name = "Z", descriptor = "[I")
	private int[] anIntArray534;

	@OriginalMember(owner = "client!w", name = "bb", descriptor = "[B")
	private byte[] aByteArray75;

	@OriginalMember(owner = "client!w", name = "gb", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!w", name = "z", descriptor = "B")
	private byte aByte20 = 0;

	@OriginalMember(owner = "client!w", name = "V", descriptor = "Z")
	public boolean aBoolean305 = false;

	@OriginalMember(owner = "client!w", name = "P", descriptor = "I")
	public int anInt5788 = 0;

	@OriginalMember(owner = "client!w", name = "N", descriptor = "I")
	private int anInt5787 = 0;

	@OriginalMember(owner = "client!w", name = "Y", descriptor = "I")
	private int anInt5789 = 0;

	@OriginalMember(owner = "client!w", name = "B", descriptor = "Z")
	private boolean aBoolean304 = false;

	static {
		if (Static268.aBoolean307) {
			Static268.anIntArray550 = new int[4096];
			Static268.anIntArray549 = new int[4096];
		} else {
			Static268.anIntArray558 = new int[1600];
			Static268.anIntArrayArray44 = new int[1600][64];
			Static268.anIntArray552 = new int[32];
			Static268.anIntArrayArray43 = new int[32][512];
		}
	}

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
	public SoftwareModel() {
	}

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!gb;IIIII)V")
	public SoftwareModel(@OriginalArg(0) RawModel arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method1668();
		arg0.method1683();
		this.anInt5788 = arg0.anInt2139;
		this.anIntArray528 = arg0.anIntArray202;
		this.anIntArray527 = arg0.anIntArray201;
		this.anIntArray531 = arg0.anIntArray203;
		this.anInt5787 = arg0.anInt2136;
		this.anIntArray534 = arg0.anIntArray197;
		this.anIntArray524 = arg0.anIntArray200;
		this.anIntArray529 = arg0.anIntArray196;
		this.aByteArray73 = arg0.aByteArray35;
		this.aByteArray75 = arg0.aByteArray26;
		this.aByte20 = arg0.aByte7;
		this.aShortArray89 = arg0.aShortArray24;
		this.anIntArrayArray41 = arg0.anIntArrayArray16;
		this.anIntArrayArray42 = arg0.anIntArrayArray15;
		this.aShortArray90 = arg0.aShortArray22;
		this.aShortArray91 = arg0.aShortArray29;
		@Pc(102) int local102 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(108) int local108 = arg2 * local102 >> 8;
		this.anIntArray533 = new int[this.anInt5787];
		this.anIntArray523 = new int[this.anInt5787];
		this.anIntArray532 = new int[this.anInt5787];
		@Pc(133) int local133;
		if (arg0.aShortArray23 == null) {
			this.aShortArray92 = null;
		} else {
			this.aShortArray92 = new short[this.anInt5787];
			for (local133 = 0; local133 < this.anInt5787; local133++) {
				@Pc(142) short local142 = arg0.aShortArray23[local133];
				if (local142 != -1 && Rasteriser.anInterface1_2.method3236(local142)) {
					this.aShortArray92[local133] = local142;
				} else {
					this.aShortArray92[local133] = -1;
				}
			}
		}
		if (arg0.anInt2137 > 0 && arg0.aByteArray31 != null) {
			@Pc(177) int[] local177 = new int[arg0.anInt2137];
			@Pc(179) int local179;
			for (local179 = 0; local179 < this.anInt5787; local179++) {
				if (arg0.aByteArray31[local179] != -1) {
					local177[arg0.aByteArray31[local179] & 0xFF]++;
				}
			}
			this.anInt5789 = 0;
			for (local179 = 0; local179 < arg0.anInt2137; local179++) {
				if (local177[local179] > 0 && arg0.aByteArray29[local179] == 0) {
					this.anInt5789++;
				}
			}
			this.anIntArray526 = new int[this.anInt5789];
			this.anIntArray530 = new int[this.anInt5789];
			this.anIntArray525 = new int[this.anInt5789];
			local179 = 0;
			@Pc(248) int local248;
			for (local248 = 0; local248 < arg0.anInt2137; local248++) {
				if (local177[local248] > 0 && arg0.aByteArray29[local248] == 0) {
					this.anIntArray526[local179] = arg0.aShortArray26[local248] & 0xFFFF;
					this.anIntArray530[local179] = arg0.aShortArray20[local248] & 0xFFFF;
					this.anIntArray525[local179] = arg0.aShortArray28[local248] & 0xFFFF;
					local177[local248] = local179++;
				} else {
					local177[local248] = -1;
				}
			}
			this.aByteArray74 = new byte[this.anInt5787];
			for (local248 = 0; local248 < this.anInt5787; local248++) {
				if (arg0.aByteArray31[local248] == -1) {
					this.aByteArray74[local248] = -1;
				} else {
					this.aByteArray74[local248] = (byte) local177[arg0.aByteArray31[local248] & 0xFF];
					if (this.aByteArray74[local248] == -1 && this.aShortArray92 != null) {
						this.aShortArray92[local248] = -1;
					}
				}
			}
		}
		for (local133 = 0; local133 < this.anInt5787; local133++) {
			@Pc(366) byte local366;
			if (arg0.aByteArray30 == null) {
				local366 = 0;
			} else {
				local366 = arg0.aByteArray30[local133];
			}
			@Pc(377) byte local377;
			if (arg0.aByteArray26 == null) {
				local377 = 0;
			} else {
				local377 = arg0.aByteArray26[local133];
			}
			@Pc(388) short local388;
			if (this.aShortArray92 == null) {
				local388 = -1;
			} else {
				local388 = this.aShortArray92[local133];
			}
			if (local377 == -2) {
				local366 = 3;
			}
			if (local377 == -1) {
				local366 = 2;
			}
			@Pc(435) Class57 local435;
			@Pc(468) int local468;
			@Pc(614) TriangleNormal local614;
			if (local388 == -1) {
				if (local366 == 0) {
					@Pc(416) int local416 = arg0.aShortArray24[local133] & 0xFFFF;
					if (arg0.aClass57Array2 == null || arg0.aClass57Array2[this.anIntArray534[local133]] == null) {
						local435 = arg0.aClass57Array1[this.anIntArray534[local133]];
					} else {
						local435 = arg0.aClass57Array2[this.anIntArray534[local133]];
					}
					local468 = arg1 + (arg3 * local435.anInt2437 + arg4 * local435.anInt2431 + arg5 * local435.anInt2436) / (local108 * local435.anInt2432) << 17;
					this.anIntArray533[local133] = local468 | Static268.method4585(local416, local468 >> 17);
					if (arg0.aClass57Array2 == null || arg0.aClass57Array2[this.anIntArray524[local133]] == null) {
						local435 = arg0.aClass57Array1[this.anIntArray524[local133]];
					} else {
						local435 = arg0.aClass57Array2[this.anIntArray524[local133]];
					}
					local468 = arg1 + (arg3 * local435.anInt2437 + arg4 * local435.anInt2431 + arg5 * local435.anInt2436) / (local108 * local435.anInt2432) << 17;
					this.anIntArray523[local133] = local468 | Static268.method4585(local416, local468 >> 17);
					if (arg0.aClass57Array2 == null || arg0.aClass57Array2[this.anIntArray529[local133]] == null) {
						local435 = arg0.aClass57Array1[this.anIntArray529[local133]];
					} else {
						local435 = arg0.aClass57Array2[this.anIntArray529[local133]];
					}
					local468 = arg1 + (arg3 * local435.anInt2437 + arg4 * local435.anInt2431 + arg5 * local435.anInt2436) / (local108 * local435.anInt2432) << 17;
					this.anIntArray532[local133] = local468 | Static268.method4585(local416, local468 >> 17);
				} else if (local366 == 1) {
					local614 = arg0.aClass126Array1[local133];
					local468 = arg1 + (arg3 * local614.anInt4769 + arg4 * local614.anInt4770 + arg5 * local614.anInt4767) / (local108 + local108 / 2) << 17;
					this.anIntArray533[local133] = local468 | Static268.method4585(arg0.aShortArray24[local133] & 0xFFFF, local468 >> 17);
					this.anIntArray532[local133] = -1;
				} else if (local366 == 3) {
					this.anIntArray533[local133] = 128;
					this.anIntArray532[local133] = -1;
				} else {
					this.anIntArray532[local133] = -2;
				}
			} else if (local366 == 0) {
				if (arg0.aClass57Array2 == null || arg0.aClass57Array2[this.anIntArray534[local133]] == null) {
					local435 = arg0.aClass57Array1[this.anIntArray534[local133]];
				} else {
					local435 = arg0.aClass57Array2[this.anIntArray534[local133]];
				}
				local468 = arg1 + (arg3 * local435.anInt2437 + arg4 * local435.anInt2431 + arg5 * local435.anInt2436) / (local108 * local435.anInt2432);
				this.anIntArray533[local133] = Static268.method4582(local468);
				if (arg0.aClass57Array2 == null || arg0.aClass57Array2[this.anIntArray524[local133]] == null) {
					local435 = arg0.aClass57Array1[this.anIntArray524[local133]];
				} else {
					local435 = arg0.aClass57Array2[this.anIntArray524[local133]];
				}
				local468 = arg1 + (arg3 * local435.anInt2437 + arg4 * local435.anInt2431 + arg5 * local435.anInt2436) / (local108 * local435.anInt2432);
				this.anIntArray523[local133] = Static268.method4582(local468);
				if (arg0.aClass57Array2 == null || arg0.aClass57Array2[this.anIntArray529[local133]] == null) {
					local435 = arg0.aClass57Array1[this.anIntArray529[local133]];
				} else {
					local435 = arg0.aClass57Array2[this.anIntArray529[local133]];
				}
				local468 = arg1 + (arg3 * local435.anInt2437 + arg4 * local435.anInt2431 + arg5 * local435.anInt2436) / (local108 * local435.anInt2432);
				this.anIntArray532[local133] = Static268.method4582(local468);
			} else if (local366 == 1) {
				local614 = arg0.aClass126Array1[local133];
				local468 = arg1 + (arg3 * local614.anInt4769 + arg4 * local614.anInt4770 + arg5 * local614.anInt4767) / (local108 + local108 / 2);
				this.anIntArray533[local133] = Static268.method4582(local468);
				this.anIntArray532[local133] = -1;
			} else {
				this.anIntArray532[local133] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "([Lclient!w;I)V")
	private SoftwareModel(@OriginalArg(0) SoftwareModel[] arg0, @OriginalArg(1) int arg1) {
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		@Pc(27) boolean local27 = false;
		this.anInt5788 = 0;
		this.anInt5787 = 0;
		this.anInt5789 = 0;
		this.aByte20 = -1;
		@Pc(45) int local45;
		@Pc(52) SoftwareModel local52;
		for (local45 = 0; local45 < arg1; local45++) {
			local52 = arg0[local45];
			if (local52 != null) {
				this.anInt5788 += local52.anInt5788;
				this.anInt5787 += local52.anInt5787;
				this.anInt5789 += local52.anInt5789;
				if (local52.aByteArray73 == null) {
					if (this.aByte20 == -1) {
						this.aByte20 = local52.aByte20;
					}
					if (this.aByte20 != local52.aByte20) {
						local21 = true;
					}
				} else {
					local21 = true;
				}
				local23 |= local52.aByteArray75 != null;
				local25 |= local52.aShortArray92 != null;
				local27 |= local52.aByteArray74 != null;
			}
		}
		this.anIntArray528 = new int[this.anInt5788];
		this.anIntArray527 = new int[this.anInt5788];
		this.anIntArray531 = new int[this.anInt5788];
		this.anIntArray534 = new int[this.anInt5787];
		this.anIntArray524 = new int[this.anInt5787];
		this.anIntArray529 = new int[this.anInt5787];
		this.anIntArray533 = new int[this.anInt5787];
		this.anIntArray523 = new int[this.anInt5787];
		this.anIntArray532 = new int[this.anInt5787];
		if (local21) {
			this.aByteArray73 = new byte[this.anInt5787];
		}
		if (local23) {
			this.aByteArray75 = new byte[this.anInt5787];
		}
		if (local25) {
			this.aShortArray92 = new short[this.anInt5787];
		}
		if (local27) {
			this.aByteArray74 = new byte[this.anInt5787];
		}
		if (this.anInt5789 > 0) {
			this.anIntArray526 = new int[this.anInt5789];
			this.anIntArray530 = new int[this.anInt5789];
			this.anIntArray525 = new int[this.anInt5789];
		}
		this.aShortArray89 = new short[this.anInt5787];
		this.anInt5788 = 0;
		this.anInt5787 = 0;
		this.anInt5789 = 0;
		for (local45 = 0; local45 < arg1; local45++) {
			local52 = arg0[local45];
			if (local52 != null) {
				@Pc(251) int local251;
				for (local251 = 0; local251 < local52.anInt5787; local251++) {
					this.anIntArray534[this.anInt5787] = local52.anIntArray534[local251] + this.anInt5788;
					this.anIntArray524[this.anInt5787] = local52.anIntArray524[local251] + this.anInt5788;
					this.anIntArray529[this.anInt5787] = local52.anIntArray529[local251] + this.anInt5788;
					this.anIntArray533[this.anInt5787] = local52.anIntArray533[local251];
					this.anIntArray523[this.anInt5787] = local52.anIntArray523[local251];
					this.anIntArray532[this.anInt5787] = local52.anIntArray532[local251];
					this.aShortArray89[this.anInt5787] = local52.aShortArray89[local251];
					if (local21) {
						if (local52.aByteArray73 == null) {
							this.aByteArray73[this.anInt5787] = local52.aByte20;
						} else {
							this.aByteArray73[this.anInt5787] = local52.aByteArray73[local251];
						}
					}
					if (local23 && local52.aByteArray75 != null) {
						this.aByteArray75[this.anInt5787] = local52.aByteArray75[local251];
					}
					if (local25) {
						if (local52.aShortArray92 == null) {
							this.aShortArray92[this.anInt5787] = -1;
						} else {
							this.aShortArray92[this.anInt5787] = local52.aShortArray92[local251];
						}
					}
					if (local27) {
						if (local52.aByteArray74 == null || local52.aByteArray74[local251] == -1) {
							this.aByteArray74[this.anInt5787] = -1;
						} else {
							this.aByteArray74[this.anInt5787] = (byte) (local52.aByteArray74[local251] + this.anInt5789);
						}
					}
					this.anInt5787++;
				}
				for (local251 = 0; local251 < local52.anInt5789; local251++) {
					this.anIntArray526[this.anInt5789] = local52.anIntArray526[local251] + this.anInt5788;
					this.anIntArray530[this.anInt5789] = local52.anIntArray530[local251] + this.anInt5788;
					this.anIntArray525[this.anInt5789] = local52.anIntArray525[local251] + this.anInt5788;
					this.anInt5789++;
				}
				for (local251 = 0; local251 < local52.anInt5788; local251++) {
					this.anIntArray528[this.anInt5788] = local52.anIntArray528[local251];
					this.anIntArray527[this.anInt5788] = local52.anIntArray527[local251];
					this.anIntArray531[this.anInt5788] = local52.anIntArray531[local251];
					this.anInt5788++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
	private void method4579(@OriginalArg(0) int arg0) {
		if (Static268.aBooleanArray132[arg0]) {
			this.method4587(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray534[arg0];
		@Pc(17) int local17 = this.anIntArray524[arg0];
		@Pc(22) int local22 = this.anIntArray529[arg0];
		Rasteriser.aBoolean138 = Static268.aBooleanArray133[arg0];
		if (this.aByteArray75 == null) {
			Rasteriser.anInt2473 = 0;
		} else {
			Rasteriser.anInt2473 = this.aByteArray75[arg0] & 0xFF;
		}
		if (this.aShortArray92 != null && this.aShortArray92[arg0] != -1) {
			@Pc(141) int local141;
			@Pc(146) int local146;
			@Pc(151) int local151;
			if (this.aByteArray74 == null || this.aByteArray74[arg0] == -1) {
				local141 = local12;
				local146 = local17;
				local151 = local22;
			} else {
				@Pc(136) int local136 = this.aByteArray74[arg0] & 0xFF;
				local141 = this.anIntArray526[local136];
				local146 = this.anIntArray530[local136];
				local151 = this.anIntArray525[local136];
			}
			if (this.anIntArray532[arg0] == -1) {
				Rasteriser.method1912(Static268.anIntArray551[local12], Static268.anIntArray551[local17], Static268.anIntArray551[local22], Static268.anIntArray556[local12], Static268.anIntArray556[local17], Static268.anIntArray556[local22], this.anIntArray533[arg0], this.anIntArray533[arg0], this.anIntArray533[arg0], Static268.anIntArray560[local141], Static268.anIntArray560[local146], Static268.anIntArray560[local151], Static268.anIntArray548[local141], Static268.anIntArray548[local146], Static268.anIntArray548[local151], Static268.anIntArray544[local141], Static268.anIntArray544[local146], Static268.anIntArray544[local151], this.aShortArray92[arg0]);
			} else {
				Rasteriser.method1912(Static268.anIntArray551[local12], Static268.anIntArray551[local17], Static268.anIntArray551[local22], Static268.anIntArray556[local12], Static268.anIntArray556[local17], Static268.anIntArray556[local22], this.anIntArray533[arg0], this.anIntArray523[arg0], this.anIntArray532[arg0], Static268.anIntArray560[local141], Static268.anIntArray560[local146], Static268.anIntArray560[local151], Static268.anIntArray548[local141], Static268.anIntArray548[local146], Static268.anIntArray548[local151], Static268.anIntArray544[local141], Static268.anIntArray544[local146], Static268.anIntArray544[local151], this.aShortArray92[arg0]);
			}
		} else if (this.anIntArray532[arg0] == -1) {
			Rasteriser.method1918(Static268.anIntArray551[local12], Static268.anIntArray551[local17], Static268.anIntArray551[local22], Static268.anIntArray556[local12], Static268.anIntArray556[local17], Static268.anIntArray556[local22], Rasteriser.anIntArray220[this.anIntArray533[arg0] & 0xFFFF]);
		} else {
			Rasteriser.method1928(Static268.anIntArray551[local12], Static268.anIntArray551[local17], Static268.anIntArray551[local22], Static268.anIntArray556[local12], Static268.anIntArray556[local17], Static268.anIntArray556[local22], this.anIntArray533[arg0] & 0xFFFF, this.anIntArray523[arg0] & 0xFFFF, this.anIntArray532[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "()V")
	@Override
	public final void method4552() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5788; local1++) {
			this.anIntArray528[local1] = -this.anIntArray528[local1];
			this.anIntArray531[local1] = -this.anIntArray531[local1];
		}
		this.aBoolean305 = false;
	}

	@OriginalMember(owner = "client!w", name = "n", descriptor = "()V")
	private void method4581() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5787; local1++) {
			@Pc(15) short local15 = this.aShortArray92 == null ? -1 : this.aShortArray92[local1];
			if (local15 == -1) {
				@Pc(25) int local25 = this.aShortArray89[local1] & 0xFFFF;
				@Pc(38) int local38;
				if (this.anIntArray532[local1] == -1) {
					local38 = this.anIntArray533[local1] & 0xFFFE0000;
					this.anIntArray533[local1] = local38 | Static268.method4585(local25, local38 >> 17);
				} else if (this.anIntArray532[local1] != -2) {
					local38 = this.anIntArray533[local1] & 0xFFFE0000;
					this.anIntArray533[local1] = local38 | Static268.method4585(local25, local38 >> 17);
					local38 = this.anIntArray523[local1] & 0xFFFE0000;
					this.anIntArray523[local1] = local38 | Static268.method4585(local25, local38 >> 17);
					local38 = this.anIntArray532[local1] & 0xFFFE0000;
					this.anIntArray532[local1] = local38 | Static268.method4585(local25, local38 >> 17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "k", descriptor = "()I")
	@Override
	public final int method4576() {
		if (!this.aBoolean305) {
			this.method4592();
		}
		return this.aShort33;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()I")
	@Override
	public final int method4549() {
		if (!this.aBoolean305) {
			this.method4592();
		}
		return this.aShort38;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZZLclient!w;[B[S[I[I[I)Lclient!ak;")
	private Model method4584(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) SoftwareModel arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		arg2.anInt5788 = this.anInt5788;
		arg2.anInt5787 = this.anInt5787;
		arg2.anInt5789 = this.anInt5789;
		if (arg2.anIntArray528 == null || arg2.anIntArray528.length < this.anInt5788) {
			arg2.anIntArray528 = new int[this.anInt5788 + 100];
			arg2.anIntArray527 = new int[this.anInt5788 + 100];
			arg2.anIntArray531 = new int[this.anInt5788 + 100];
		}
		@Pc(43) int local43;
		for (local43 = 0; local43 < this.anInt5788; local43++) {
			arg2.anIntArray528[local43] = this.anIntArray528[local43];
			arg2.anIntArray527[local43] = this.anIntArray527[local43];
			arg2.anIntArray531[local43] = this.anIntArray531[local43];
		}
		if (arg0) {
			arg2.aByteArray75 = this.aByteArray75;
		} else {
			arg2.aByteArray75 = arg3;
			if (this.aByteArray75 == null) {
				for (local43 = 0; local43 < this.anInt5787; local43++) {
					arg2.aByteArray75[local43] = 0;
				}
			} else {
				for (local43 = 0; local43 < this.anInt5787; local43++) {
					arg2.aByteArray75[local43] = this.aByteArray75[local43];
				}
			}
		}
		if (arg1) {
			arg2.aShortArray89 = this.aShortArray89;
			arg2.anIntArray533 = this.anIntArray533;
			arg2.anIntArray523 = this.anIntArray523;
			arg2.anIntArray532 = this.anIntArray532;
		} else {
			arg2.aShortArray89 = arg4;
			arg2.anIntArray533 = arg5;
			arg2.anIntArray523 = arg6;
			arg2.anIntArray532 = arg7;
			for (local43 = 0; local43 < this.anInt5787; local43++) {
				arg2.aShortArray89[local43] = this.aShortArray89[local43];
				arg2.anIntArray533[local43] = this.anIntArray533[local43];
				arg2.anIntArray523[local43] = this.anIntArray523[local43];
				arg2.anIntArray532[local43] = this.anIntArray532[local43];
			}
		}
		arg2.anIntArray534 = this.anIntArray534;
		arg2.anIntArray524 = this.anIntArray524;
		arg2.anIntArray529 = this.anIntArray529;
		arg2.aByteArray73 = this.aByteArray73;
		arg2.aByteArray74 = this.aByteArray74;
		arg2.aShortArray92 = this.aShortArray92;
		arg2.aByte20 = this.aByte20;
		arg2.anIntArray526 = this.anIntArray526;
		arg2.anIntArray530 = this.anIntArray530;
		arg2.anIntArray525 = this.anIntArray525;
		arg2.anIntArrayArray41 = this.anIntArrayArray41;
		arg2.anIntArrayArray42 = this.anIntArrayArray42;
		arg2.aShortArray91 = this.aShortArray91;
		arg2.aShortArray90 = this.aShortArray90;
		arg2.aBoolean303 = this.aBoolean303;
		arg2.aBoolean305 = false;
		return arg2;
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
	@Override
	public final void method4574(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = MathUtils.anIntArray223[arg0];
		@Pc(7) int local7 = MathUtils.anIntArray225[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5788; local9++) {
			@Pc(29) int local29 = this.anIntArray527[local9] * local7 - this.anIntArray531[local9] * local3 >> 16;
			this.anIntArray531[local9] = this.anIntArray527[local9] * local3 + this.anIntArray531[local9] * local7 >> 16;
			this.anIntArray527[local9] = local29;
		}
		this.aBoolean305 = false;
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "()Z")
	@Override
	protected final boolean method4551() {
		if (this.anIntArrayArray41 == null) {
			return false;
		} else {
			Static268.anInt5793 = 0;
			Static268.anInt5791 = 0;
			Static268.anInt5792 = 0;
			return true;
		}
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
	@Override
	public final void method4564(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = MathUtils.anIntArray223[arg0];
		@Pc(7) int local7 = MathUtils.anIntArray225[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5788; local9++) {
			@Pc(29) int local29 = this.anIntArray527[local9] * local3 + this.anIntArray528[local9] * local7 >> 16;
			this.anIntArray527[local9] = this.anIntArray527[local9] * local7 - this.anIntArray528[local9] * local3 >> 16;
			this.anIntArray528[local9] = local29;
		}
		this.aBoolean305 = false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIJILclient!ga;)V")
	@Override
	public final void method4546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) ParticleSystem arg10) {
		if (!this.aBoolean305) {
			this.method4592();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort34 * arg2 + this.aShort37 * arg1 >> 16);
		@Pc(53) int local53 = local24 + (-this.aShort34 * arg2 + this.aShort38 * arg1 >> 16);
		if (local38 <= 50 || local53 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + this.aShort34 << 9;
		if (local78 / local38 <= Static240.anInt5334) {
			return;
		}
		@Pc(91) int local91 = local71 - this.aShort34 << 9;
		if (local91 / local38 >= Static247.anInt5405) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (this.aShort34 * arg1 + this.aShort37 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static1.anInt4) {
			return;
		}
		@Pc(146) int local146 = local107 + (-this.aShort34 * arg1 + this.aShort38 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static148.anInt3535) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local53 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt5789 > 0;
		@Pc(172) int local172 = Rasteriser.anInt2471;
		@Pc(174) int local174 = Rasteriser.anInt2469;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = MathUtils.anIntArray223[arg0];
			local178 = MathUtils.anIntArray225[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		if (arg8 > 0L && Static39.aBoolean77 && local53 > 0) {
			if (local71 > 0) {
				local204 = local91 / local38;
				local208 = local78 / local53;
			} else {
				local204 = local91 / local53;
				local208 = local78 / local38;
			}
			if (local107 > 0) {
				local223 = local146 / local38;
				local227 = local123 / local53;
			} else {
				local223 = local146 / local53;
				local227 = local123 / local38;
			}
			if (Static150.anInt3582 >= local204 && Static150.anInt3582 <= local208 && Static34.anInt1053 >= local223 && Static34.anInt1053 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(299) int[] local299 = new int[] { this.aShort31, this.aShort32, this.aShort31, this.aShort32, this.aShort31, this.aShort32, this.aShort31, this.aShort32 };
				@Pc(342) int[] local342 = new int[] { this.aShort33, this.aShort33, this.aShort36, this.aShort36, this.aShort33, this.aShort33, this.aShort36, this.aShort36 };
				@Pc(385) int[] local385 = new int[] { this.aShort38, this.aShort38, this.aShort38, this.aShort38, this.aShort37, this.aShort37, this.aShort37, this.aShort37 };
				for (@Pc(387) int local387 = 0; local387 < 8; local387++) {
					@Pc(394) int local394 = local299[local387];
					@Pc(398) int local398 = local385[local387];
					@Pc(402) int local402 = local342[local387];
					@Pc(414) int local414;
					if (arg0 != 0) {
						local414 = local402 * local176 + local394 * local178 >> 16;
						local402 = local402 * local178 - local394 * local176 >> 16;
						local394 = local414;
					}
					local394 += arg5;
					local398 += arg6;
					local402 += arg7;
					local414 = local402 * arg3 + local394 * arg4 >> 16;
					local402 = local402 * arg4 - local394 * arg3 >> 16;
					local394 = local414;
					local414 = local398 * arg2 - local402 * arg1 >> 16;
					local402 = local398 * arg1 + local402 * arg2 >> 16;
					if (local402 > 0) {
						@Pc(490) int local490 = (local394 << 9) / local402;
						@Pc(496) int local496 = (local414 << 9) / local402;
						if (local490 < local204) {
							local204 = local490;
						}
						if (local490 > local208) {
							local208 = local490;
						}
						if (local496 < local223) {
							local223 = local496;
						}
						if (local496 > local227) {
							local227 = local496;
						}
					}
				}
				if (Static150.anInt3582 >= local204 && Static150.anInt3582 <= local208 && Static34.anInt1053 >= local223 && Static34.anInt1053 <= local227) {
					if (this.aBoolean303) {
						Static259.aLongArray11[Static2.anInt7++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < this.anInt5788; local204++) {
			local223 = this.anIntArray528[local204];
			local208 = this.anIntArray527[local204];
			local227 = this.anIntArray531[local204];
			@Pc(577) int local577;
			if (arg0 != 0) {
				local577 = local227 * local176 + local223 * local178 >> 16;
				local227 = local227 * local178 - local223 * local176 >> 16;
				local223 = local577;
			}
			local223 += arg5;
			local208 += arg6;
			local227 += arg7;
			local577 = local227 * arg3 + local223 * arg4 >> 16;
			local227 = local227 * arg4 - local223 * arg3 >> 16;
			local223 = local577;
			local577 = local208 * arg2 - local227 * arg1 >> 16;
			local227 = local208 * arg1 + local227 * arg2 >> 16;
			Static268.anIntArray543[local204] = local227 - local24;
			if (local227 >= 50) {
				Static268.anIntArray556[local204] = local172 + (local223 << 9) / local227;
				Static268.anIntArray551[local204] = local174 + (local577 << 9) / local227;
			} else {
				Static268.anIntArray556[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static268.anIntArray560[local204] = local223;
				Static268.anIntArray548[local204] = local577;
				Static268.anIntArray544[local204] = local227;
			}
		}
		try {
			this.method4590(local154, local190, arg8, local24 - local53, local38 - local53 + 2, arg10);
		} catch (@Pc(713) Exception local713) {
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II[[I[[IIIIZ)Lclient!w;")
	public final SoftwareModel method4586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (!this.aBoolean305) {
			this.method4592();
		}
		@Pc(9) int local9 = arg4 + this.aShort31;
		@Pc(14) int local14 = arg4 + this.aShort32;
		@Pc(19) int local19 = arg6 + this.aShort33;
		@Pc(24) int local24 = arg6 + this.aShort36;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + 128 >> 7 >= arg2.length || local19 < 0 || local24 + 128 >> 7 >= arg2[0].length)) {
			return this;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return this;
			}
			if (local9 < 0 || local14 + 128 >> 7 >= arg3.length || local19 < 0 || local24 + 128 >> 7 >= arg3[0].length) {
				return this;
			}
		} else {
			local9 >>= 0x7;
			local14 = local14 + 127 >> 7;
			local19 >>= 0x7;
			local24 = local24 + 127 >> 7;
			if (arg2[local9][local19] == arg5 && arg2[local14][local19] == arg5 && arg2[local9][local24] == arg5 && arg2[local14][local24] == arg5) {
				return this;
			}
		}
		@Pc(150) SoftwareModel local150;
		if (arg7) {
			local150 = new SoftwareModel();
			local150.anInt5788 = this.anInt5788;
			local150.anInt5787 = this.anInt5787;
			local150.anInt5789 = this.anInt5789;
			local150.anIntArray534 = this.anIntArray534;
			local150.anIntArray524 = this.anIntArray524;
			local150.anIntArray529 = this.anIntArray529;
			local150.anIntArray533 = this.anIntArray533;
			local150.anIntArray523 = this.anIntArray523;
			local150.anIntArray532 = this.anIntArray532;
			local150.aByteArray73 = this.aByteArray73;
			local150.aByteArray74 = this.aByteArray74;
			local150.aShortArray92 = this.aShortArray92;
			local150.aShortArray89 = this.aShortArray89;
			local150.aByteArray75 = this.aByteArray75;
			local150.aByte20 = this.aByte20;
			local150.anIntArray526 = this.anIntArray526;
			local150.anIntArray530 = this.anIntArray530;
			local150.anIntArray525 = this.anIntArray525;
			local150.anIntArrayArray41 = this.anIntArrayArray41;
			local150.anIntArrayArray42 = this.anIntArrayArray42;
			local150.aShortArray91 = this.aShortArray91;
			local150.aShortArray90 = this.aShortArray90;
			local150.aBoolean303 = this.aBoolean303;
			if (arg0 == 3) {
				local150.anIntArray528 = Static115.method2308(this.anIntArray528);
				local150.anIntArray527 = Static115.method2308(this.anIntArray527);
				local150.anIntArray531 = Static115.method2308(this.anIntArray531);
			} else {
				local150.anIntArray528 = this.anIntArray528;
				local150.anIntArray527 = new int[local150.anInt5788];
				local150.anIntArray531 = this.anIntArray531;
			}
		} else {
			local150 = this;
		}
		@Pc(285) int local285;
		@Pc(296) int local296;
		@Pc(303) int local303;
		@Pc(307) int local307;
		@Pc(311) int local311;
		@Pc(315) int local315;
		@Pc(319) int local319;
		@Pc(341) int local341;
		@Pc(367) int local367;
		@Pc(379) int local379;
		if (arg0 == 1) {
			for (local285 = 0; local285 < local150.anInt5788; local285++) {
				local296 = this.anIntArray528[local285] + arg4;
				local303 = this.anIntArray531[local285] + arg6;
				local307 = local296 & 0x7F;
				local311 = local303 & 0x7F;
				local315 = local296 >> 7;
				local319 = local303 >> 7;
				local341 = arg2[local315][local319] * (128 - local307) + arg2[local315 + 1][local319] * local307 >> 7;
				local367 = arg2[local315][local319 + 1] * (128 - local307) + arg2[local315 + 1][local319 + 1] * local307 >> 7;
				local379 = local341 * (128 - local311) + local367 * local311 >> 7;
				local150.anIntArray527[local285] = this.anIntArray527[local285] + local379 - arg5;
			}
		} else {
			@Pc(506) int local506;
			if (arg0 == 2) {
				for (local285 = 0; local285 < local150.anInt5788; local285++) {
					local296 = (this.anIntArray527[local285] << 16) / this.aShort38;
					if (local296 < arg1) {
						local303 = this.anIntArray528[local285] + arg4;
						local307 = this.anIntArray531[local285] + arg6;
						local311 = local303 & 0x7F;
						local315 = local307 & 0x7F;
						local319 = local303 >> 7;
						local341 = local307 >> 7;
						local367 = arg2[local319][local341] * (128 - local311) + arg2[local319 + 1][local341] * local311 >> 7;
						local379 = arg2[local319][local341 + 1] * (128 - local311) + arg2[local319 + 1][local341 + 1] * local311 >> 7;
						local506 = local367 * (128 - local315) + local379 * local315 >> 7;
						local150.anIntArray527[local285] = this.anIntArray527[local285] + (local506 - arg5) * (arg1 - local296) / arg1;
					} else {
						local150.anIntArray527[local285] = this.anIntArray527[local285];
					}
				}
			} else if (arg0 == 3) {
				local285 = (arg1 & 0xFF) * 4;
				local296 = (arg1 >> 8 & 0xFF) * 4;
				local150.method4573(arg2, arg4, arg5, arg6, local285, local296);
			} else if (arg0 == 4) {
				local285 = this.aShort37 - this.aShort38;
				for (local296 = 0; local296 < this.anInt5788; local296++) {
					local303 = this.anIntArray528[local296] + arg4;
					local307 = this.anIntArray531[local296] + arg6;
					local311 = local303 & 0x7F;
					local315 = local307 & 0x7F;
					local319 = local303 >> 7;
					local341 = local307 >> 7;
					local367 = arg3[local319][local341] * (128 - local311) + arg3[local319 + 1][local341] * local311 >> 7;
					local379 = arg3[local319][local341 + 1] * (128 - local311) + arg3[local319 + 1][local341 + 1] * local311 >> 7;
					local506 = local367 * (128 - local315) + local379 * local315 >> 7;
					local150.anIntArray527[local296] = this.anIntArray527[local296] + local506 + local285 - arg5;
				}
			} else if (arg0 == 5) {
				local285 = this.aShort37 - this.aShort38;
				for (local296 = 0; local296 < this.anInt5788; local296++) {
					local303 = this.anIntArray528[local296] + arg4;
					local307 = this.anIntArray531[local296] + arg6;
					local311 = local303 & 0x7F;
					local315 = local307 & 0x7F;
					local319 = local303 >> 7;
					local341 = local307 >> 7;
					local367 = arg2[local319][local341] * (128 - local311) + arg2[local319 + 1][local341] * local311 >> 7;
					local379 = arg2[local319][local341 + 1] * (128 - local311) + arg2[local319 + 1][local341 + 1] * local311 >> 7;
					local506 = local367 * (128 - local315) + local379 * local315 >> 7;
					local367 = arg3[local319][local341] * (128 - local311) + arg3[local319 + 1][local341] * local311 >> 7;
					local379 = arg3[local319][local341 + 1] * (128 - local311) + arg3[local319 + 1][local341 + 1] * local311 >> 7;
					@Pc(849) int local849 = local367 * (128 - local315) + local379 * local315 >> 7;
					@Pc(853) int local853 = local506 - local849;
					local150.anIntArray527[local296] = ((this.anIntArray527[local296] << 8) / local285 * local853 >> 8) - (arg5 - local506);
				}
			}
		}
		local150.aBoolean305 = false;
		return local150;
	}

	@OriginalMember(owner = "client!w", name = "i", descriptor = "()V")
	@Override
	public final void method4563() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5788; local1++) {
			@Pc(10) int local10 = this.anIntArray528[local1];
			this.anIntArray528[local1] = this.anIntArray531[local1];
			this.anIntArray531[local1] = -local10;
		}
		this.aBoolean305 = false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public final void method4571(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		try {
			if (!this.aBoolean305) {
				this.method4592();
			}
			@Pc(6) int local6 = Rasteriser.anInt2471;
			@Pc(8) int local8 = Rasteriser.anInt2469;
			@Pc(12) int local12 = MathUtils.anIntArray223[0];
			@Pc(16) int local16 = MathUtils.anIntArray225[0];
			@Pc(20) int local20 = MathUtils.anIntArray223[arg0];
			@Pc(24) int local24 = MathUtils.anIntArray225[arg0];
			@Pc(28) int local28 = MathUtils.anIntArray223[arg1];
			@Pc(32) int local32 = MathUtils.anIntArray225[arg1];
			@Pc(36) int local36 = MathUtils.anIntArray223[arg2];
			@Pc(40) int local40 = MathUtils.anIntArray225[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt5788; local52++) {
				@Pc(61) int local61 = this.anIntArray528[local52];
				@Pc(66) int local66 = this.anIntArray527[local52];
				@Pc(71) int local71 = this.anIntArray531[local52];
				@Pc(83) int local83;
				if (arg1 != 0) {
					local83 = local66 * local28 + local61 * local32 >> 16;
					local66 = local66 * local32 - local61 * local28 >> 16;
					local61 = local83;
				}
				if (arg0 != 0) {
					local83 = local71 * local20 + local61 * local24 >> 16;
					local71 = local71 * local24 - local61 * local20 >> 16;
					local61 = local83;
				}
				local61 += arg3;
				local66 += arg4;
				local71 += arg5;
				local83 = local66 * local40 - local71 * local36 >> 16;
				local71 = local66 * local36 + local71 * local40 >> 16;
				Static268.anIntArray543[local52] = local71 - local50;
				Static268.anIntArray556[local52] = local6 + (local61 << 9) / local71;
				Static268.anIntArray551[local52] = local8 + (local83 << 9) / local71;
				if (this.anInt5789 > 0) {
					Static268.anIntArray560[local52] = local61;
					Static268.anIntArray548[local52] = local83;
					Static268.anIntArray544[local52] = local71;
				}
			}
			this.method4590(false, arg6 >= 0L, arg6, this.aShort35, this.aShort35 << 1, null);
		} catch (@Pc(240) RuntimeException local240) {
		}
	}

	@OriginalMember(owner = "client!w", name = "g", descriptor = "(I)V")
	private void method4587(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Rasteriser.anInt2471;
		@Pc(3) int local3 = Rasteriser.anInt2469;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray534[arg0];
		@Pc(15) int local15 = this.anIntArray524[arg0];
		@Pc(20) int local20 = this.anIntArray529[arg0];
		@Pc(24) int local24 = Static268.anIntArray544[local10];
		@Pc(28) int local28 = Static268.anIntArray544[local15];
		@Pc(32) int local32 = Static268.anIntArray544[local20];
		if (this.aByteArray75 == null) {
			Rasteriser.anInt2473 = 0;
		} else {
			Rasteriser.anInt2473 = this.aByteArray75[arg0] & 0xFF;
		}
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(99) int local99;
		if (local24 >= 50) {
			Static268.anIntArray542[0] = Static268.anIntArray556[local10];
			Static268.anIntArray547[0] = Static268.anIntArray551[local10];
			local5++;
			Static268.anIntArray553[0] = this.anIntArray533[arg0] & 0xFFFF;
		} else {
			local75 = Static268.anIntArray560[local10];
			local79 = Static268.anIntArray548[local10];
			local86 = this.anIntArray533[arg0] & 0xFFFF;
			if (local32 >= 50) {
				local99 = (50 - local24) * MathUtils.anIntArray224[local32 - local24];
				Static268.anIntArray542[0] = local1 + (local75 + ((Static268.anIntArray560[local20] - local75) * local99 >> 16) << 9) / 50;
				Static268.anIntArray547[0] = local3 + (local79 + ((Static268.anIntArray548[local20] - local79) * local99 >> 16) << 9) / 50;
				local5++;
				Static268.anIntArray553[0] = local86 + (((this.anIntArray532[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local28 >= 50) {
				local99 = (50 - local24) * MathUtils.anIntArray224[local28 - local24];
				Static268.anIntArray542[local5] = local1 + (local75 + ((Static268.anIntArray560[local15] - local75) * local99 >> 16) << 9) / 50;
				Static268.anIntArray547[local5] = local3 + (local79 + ((Static268.anIntArray548[local15] - local79) * local99 >> 16) << 9) / 50;
				Static268.anIntArray553[local5++] = local86 + (((this.anIntArray523[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local28 >= 50) {
			Static268.anIntArray542[local5] = Static268.anIntArray556[local15];
			Static268.anIntArray547[local5] = Static268.anIntArray551[local15];
			Static268.anIntArray553[local5++] = this.anIntArray523[arg0] & 0xFFFF;
		} else {
			local75 = Static268.anIntArray560[local15];
			local79 = Static268.anIntArray548[local15];
			local86 = this.anIntArray523[arg0] & 0xFFFF;
			if (local24 >= 50) {
				local99 = (50 - local28) * MathUtils.anIntArray224[local24 - local28];
				Static268.anIntArray542[local5] = local1 + (local75 + ((Static268.anIntArray560[local10] - local75) * local99 >> 16) << 9) / 50;
				Static268.anIntArray547[local5] = local3 + (local79 + ((Static268.anIntArray548[local10] - local79) * local99 >> 16) << 9) / 50;
				Static268.anIntArray553[local5++] = local86 + (((this.anIntArray533[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local32 >= 50) {
				local99 = (50 - local28) * MathUtils.anIntArray224[local32 - local28];
				Static268.anIntArray542[local5] = local1 + (local75 + ((Static268.anIntArray560[local20] - local75) * local99 >> 16) << 9) / 50;
				Static268.anIntArray547[local5] = local3 + (local79 + ((Static268.anIntArray548[local20] - local79) * local99 >> 16) << 9) / 50;
				Static268.anIntArray553[local5++] = local86 + (((this.anIntArray532[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local32 >= 50) {
			Static268.anIntArray542[local5] = Static268.anIntArray556[local20];
			Static268.anIntArray547[local5] = Static268.anIntArray551[local20];
			Static268.anIntArray553[local5++] = this.anIntArray532[arg0] & 0xFFFF;
		} else {
			local75 = Static268.anIntArray560[local20];
			local79 = Static268.anIntArray548[local20];
			local86 = this.anIntArray532[arg0] & 0xFFFF;
			if (local28 >= 50) {
				local99 = (50 - local32) * MathUtils.anIntArray224[local28 - local32];
				Static268.anIntArray542[local5] = local1 + (local75 + ((Static268.anIntArray560[local15] - local75) * local99 >> 16) << 9) / 50;
				Static268.anIntArray547[local5] = local3 + (local79 + ((Static268.anIntArray548[local15] - local79) * local99 >> 16) << 9) / 50;
				Static268.anIntArray553[local5++] = local86 + (((this.anIntArray523[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local24 >= 50) {
				local99 = (50 - local32) * MathUtils.anIntArray224[local24 - local32];
				Static268.anIntArray542[local5] = local1 + (local75 + ((Static268.anIntArray560[local10] - local75) * local99 >> 16) << 9) / 50;
				Static268.anIntArray547[local5] = local3 + (local79 + ((Static268.anIntArray548[local10] - local79) * local99 >> 16) << 9) / 50;
				Static268.anIntArray553[local5++] = local86 + (((this.anIntArray533[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		local75 = Static268.anIntArray542[0];
		local79 = Static268.anIntArray542[1];
		local86 = Static268.anIntArray542[2];
		local99 = Static268.anIntArray547[0];
		@Pc(614) int local614 = Static268.anIntArray547[1];
		@Pc(618) int local618 = Static268.anIntArray547[2];
		Rasteriser.aBoolean138 = false;
		@Pc(709) int local709;
		@Pc(714) int local714;
		@Pc(719) int local719;
		@Pc(704) int local704;
		if (local5 == 3) {
			if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Rasteriser.anInt2472 || local79 > Rasteriser.anInt2472 || local86 > Rasteriser.anInt2472) {
				Rasteriser.aBoolean138 = true;
			}
			if (this.aShortArray92 != null && this.aShortArray92[arg0] != -1) {
				if (this.aByteArray74 == null || this.aByteArray74[arg0] == -1) {
					local709 = local10;
					local714 = local15;
					local719 = local20;
				} else {
					local704 = this.aByteArray74[arg0] & 0xFF;
					local709 = this.anIntArray526[local704];
					local714 = this.anIntArray530[local704];
					local719 = this.anIntArray525[local704];
				}
				if (this.anIntArray532[arg0] == -1) {
					Rasteriser.method1912(local99, local614, local618, local75, local79, local86, this.anIntArray533[arg0], this.anIntArray533[arg0], this.anIntArray533[arg0], Static268.anIntArray560[local709], Static268.anIntArray560[local714], Static268.anIntArray560[local719], Static268.anIntArray548[local709], Static268.anIntArray548[local714], Static268.anIntArray548[local719], Static268.anIntArray544[local709], Static268.anIntArray544[local714], Static268.anIntArray544[local719], this.aShortArray92[arg0]);
				} else {
					Rasteriser.method1912(local99, local614, local618, local75, local79, local86, Static268.anIntArray553[0], Static268.anIntArray553[1], Static268.anIntArray553[2], Static268.anIntArray560[local709], Static268.anIntArray560[local714], Static268.anIntArray560[local719], Static268.anIntArray548[local709], Static268.anIntArray548[local714], Static268.anIntArray548[local719], Static268.anIntArray544[local709], Static268.anIntArray544[local714], Static268.anIntArray544[local719], this.aShortArray92[arg0]);
				}
			} else if (this.anIntArray532[arg0] == -1) {
				Rasteriser.method1918(local99, local614, local618, local75, local79, local86, Rasteriser.anIntArray220[this.anIntArray533[arg0] & 0xFFFF]);
			} else {
				Rasteriser.method1928(local99, local614, local618, local75, local79, local86, Static268.anIntArray553[0], Static268.anIntArray553[1], Static268.anIntArray553[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Rasteriser.anInt2472 || local79 > Rasteriser.anInt2472 || local86 > Rasteriser.anInt2472 || Static268.anIntArray542[3] < 0 || Static268.anIntArray542[3] > Rasteriser.anInt2472) {
			Rasteriser.aBoolean138 = true;
		}
		if (this.aShortArray92 != null && this.aShortArray92[arg0] != -1) {
			if (this.aByteArray74 == null || this.aByteArray74[arg0] == -1) {
				local709 = local10;
				local714 = local15;
				local719 = local20;
			} else {
				local704 = this.aByteArray74[arg0] & 0xFF;
				local709 = this.anIntArray526[local704];
				local714 = this.anIntArray530[local704];
				local719 = this.anIntArray525[local704];
			}
			@Pc(984) short local984 = this.aShortArray92[arg0];
			if (this.anIntArray532[arg0] == -1) {
				Rasteriser.method1912(local99, local614, local618, local75, local79, local86, this.anIntArray533[arg0], this.anIntArray533[arg0], this.anIntArray533[arg0], Static268.anIntArray560[local709], Static268.anIntArray560[local714], Static268.anIntArray560[local719], Static268.anIntArray548[local709], Static268.anIntArray548[local714], Static268.anIntArray548[local719], Static268.anIntArray544[local709], Static268.anIntArray544[local714], Static268.anIntArray544[local719], local984);
				Rasteriser.method1912(local99, local618, Static268.anIntArray547[3], local75, local86, Static268.anIntArray542[3], this.anIntArray533[arg0], this.anIntArray533[arg0], this.anIntArray533[arg0], Static268.anIntArray560[local709], Static268.anIntArray560[local714], Static268.anIntArray560[local719], Static268.anIntArray548[local709], Static268.anIntArray548[local714], Static268.anIntArray548[local719], Static268.anIntArray544[local709], Static268.anIntArray544[local714], Static268.anIntArray544[local719], local984);
			} else {
				Rasteriser.method1912(local99, local614, local618, local75, local79, local86, Static268.anIntArray553[0], Static268.anIntArray553[1], Static268.anIntArray553[2], Static268.anIntArray560[local709], Static268.anIntArray560[local714], Static268.anIntArray560[local719], Static268.anIntArray548[local709], Static268.anIntArray548[local714], Static268.anIntArray548[local719], Static268.anIntArray544[local709], Static268.anIntArray544[local714], Static268.anIntArray544[local719], local984);
				Rasteriser.method1912(local99, local618, Static268.anIntArray547[3], local75, local86, Static268.anIntArray542[3], Static268.anIntArray553[0], Static268.anIntArray553[2], Static268.anIntArray553[3], Static268.anIntArray560[local709], Static268.anIntArray560[local714], Static268.anIntArray560[local719], Static268.anIntArray548[local709], Static268.anIntArray548[local714], Static268.anIntArray548[local719], Static268.anIntArray544[local709], Static268.anIntArray544[local714], Static268.anIntArray544[local719], local984);
			}
		} else if (this.anIntArray532[arg0] == -1) {
			local709 = Rasteriser.anIntArray220[this.anIntArray533[arg0] & 0xFFFF];
			Rasteriser.method1918(local99, local614, local618, local75, local79, local86, local709);
			Rasteriser.method1918(local99, local618, Static268.anIntArray547[3], local75, local86, Static268.anIntArray542[3], local709);
		} else {
			Rasteriser.method1928(local99, local614, local618, local75, local79, local86, Static268.anIntArray553[0], Static268.anIntArray553[1], Static268.anIntArray553[2]);
			Rasteriser.method1928(local99, local618, Static268.anIntArray547[3], local75, local86, Static268.anIntArray542[3], Static268.anIntArray553[0], Static268.anIntArray553[2], Static268.anIntArray553[3]);
		}
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "()I")
	@Override
	public final int method4550() {
		if (!this.aBoolean305) {
			this.method4592();
		}
		return this.aShort36;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(III)V")
	@Override
	public final void method4559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5788; local1++) {
			this.anIntArray528[local1] = this.anIntArray528[local1] * arg0 / 128;
			this.anIntArray527[local1] = this.anIntArray527[local1] * arg1 / 128;
			this.anIntArray531[local1] = this.anIntArray531[local1] * arg2 / 128;
		}
		this.aBoolean305 = false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZZZ)Lclient!ak;")
	@Override
	public final Model method4560(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static268.aByteArray77.length < this.anInt5787) {
			Static268.aByteArray77 = new byte[this.anInt5787 + 100];
		}
		if (!arg1 && Static268.aShortArray94.length < this.anInt5787) {
			Static268.anIntArray539 = new int[this.anInt5787 + 100];
			Static268.anIntArray540 = new int[this.anInt5787 + 100];
			Static268.anIntArray538 = new int[this.anInt5787 + 100];
			Static268.aShortArray94 = new short[this.anInt5787 + 100];
		}
		return this.method4584(arg0, arg1, Static268.aClass8_Sub1_Sub2_2, Static268.aByteArray77, Static268.aShortArray94, Static268.anIntArray539, Static268.anIntArray540, Static268.anIntArray538);
	}

	@OriginalMember(owner = "client!w", name = "j", descriptor = "()I")
	@Override
	public final int method4566() {
		if (!this.aBoolean305) {
			this.method4592();
		}
		return this.aShort34;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ak;)Lclient!ak;")
	public final Model method4588(@OriginalArg(0) Model arg0) {
		return new SoftwareModel(new SoftwareModel[] { this, (SoftwareModel) arg0 }, 2);
	}

	@OriginalMember(owner = "client!w", name = "g", descriptor = "()I")
	@Override
	public final int method4561() {
		if (!this.aBoolean305) {
			this.method4592();
		}
		return this.aShort32;
	}

	@OriginalMember(owner = "client!w", name = "f", descriptor = "()V")
	@Override
	protected final void method4557() {
		if (this.aBoolean304) {
			this.method4581();
			this.aBoolean304 = false;
		}
		this.aBoolean305 = false;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	@Override
	public final void method4554(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = MathUtils.anIntArray223[arg0];
		@Pc(7) int local7 = MathUtils.anIntArray225[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5788; local9++) {
			@Pc(29) int local29 = this.anIntArray531[local9] * local3 + this.anIntArray528[local9] * local7 >> 16;
			this.anIntArray531[local9] = this.anIntArray531[local9] * local7 - this.anIntArray528[local9] * local3 >> 16;
			this.anIntArray528[local9] = local29;
		}
		this.aBoolean305 = false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected final void method4569(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		if (arg0 == 0) {
			local6 = 0;
			Static268.anInt5793 = 0;
			Static268.anInt5791 = 0;
			Static268.anInt5792 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(21) int local21 = arg1[local14];
				if (local21 < this.anIntArrayArray41.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray41[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						Static268.anInt5793 += this.anIntArray528[local41];
						Static268.anInt5791 += this.anIntArray527[local41];
						Static268.anInt5792 += this.anIntArray531[local41];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static268.anInt5793 = Static268.anInt5793 / local6 + arg2;
				Static268.anInt5791 = Static268.anInt5791 / local6 + arg3;
				Static268.anInt5792 = Static268.anInt5792 / local6 + arg4;
			} else {
				Static268.anInt5793 = arg2;
				Static268.anInt5791 = arg3;
				Static268.anInt5792 = arg4;
			}
			return;
		}
		@Pc(117) int[] local117;
		@Pc(119) int local119;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray41.length) {
					local117 = this.anIntArrayArray41[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray528[local33] += arg2;
						this.anIntArray527[local33] += arg3;
						this.anIntArray531[local33] += arg4;
					}
				}
			}
			return;
		}
		@Pc(222) int local222;
		@Pc(240) int local240;
		if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray41.length) {
					local117 = this.anIntArrayArray41[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray528[local33] -= Static268.anInt5793;
						this.anIntArray527[local33] -= Static268.anInt5791;
						this.anIntArray531[local33] -= Static268.anInt5792;
						if (arg4 != 0) {
							local41 = MathUtils.anIntArray223[arg4];
							local222 = MathUtils.anIntArray225[arg4];
							local240 = this.anIntArray527[local33] * local41 + this.anIntArray528[local33] * local222 + 32767 >> 16;
							this.anIntArray527[local33] = this.anIntArray527[local33] * local222 + 32767 - this.anIntArray528[local33] * local41 >> 16;
							this.anIntArray528[local33] = local240;
						}
						if (arg2 != 0) {
							local41 = MathUtils.anIntArray223[arg2];
							local222 = MathUtils.anIntArray225[arg2];
							local240 = this.anIntArray527[local33] * local222 + 32767 - this.anIntArray531[local33] * local41 >> 16;
							this.anIntArray531[local33] = this.anIntArray527[local33] * local41 + this.anIntArray531[local33] * local222 + 32767 >> 16;
							this.anIntArray527[local33] = local240;
						}
						if (arg3 != 0) {
							local41 = MathUtils.anIntArray223[arg3];
							local222 = MathUtils.anIntArray225[arg3];
							local240 = this.anIntArray531[local33] * local41 + this.anIntArray528[local33] * local222 + 32767 >> 16;
							this.anIntArray531[local33] = this.anIntArray531[local33] * local222 + 32767 - this.anIntArray528[local33] * local41 >> 16;
							this.anIntArray528[local33] = local240;
						}
						this.anIntArray528[local33] += Static268.anInt5793;
						this.anIntArray527[local33] += Static268.anInt5791;
						this.anIntArray531[local33] += Static268.anInt5792;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray41.length) {
					local117 = this.anIntArrayArray41[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray528[local33] -= Static268.anInt5793;
						this.anIntArray527[local33] -= Static268.anInt5791;
						this.anIntArray531[local33] -= Static268.anInt5792;
						this.anIntArray528[local33] = this.anIntArray528[local33] * arg2 / 128;
						this.anIntArray527[local33] = this.anIntArray527[local33] * arg3 / 128;
						this.anIntArray531[local33] = this.anIntArray531[local33] * arg4 / 128;
						this.anIntArray528[local33] += Static268.anInt5793;
						this.anIntArray527[local33] += Static268.anInt5791;
						this.anIntArray531[local33] += Static268.anInt5792;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray42 != null && this.aByteArray75 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray42.length) {
						local117 = this.anIntArrayArray42[local14];
						for (local119 = 0; local119 < local117.length; local119++) {
							local33 = local117[local119];
							local41 = (this.aByteArray75[local33] & 0xFF) + arg2 * 8;
							if (local41 < 0) {
								local41 = 0;
							} else if (local41 > 255) {
								local41 = 255;
							}
							this.aByteArray75[local33] = (byte) local41;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray42 != null) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray42.length) {
					local117 = this.anIntArrayArray42[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						local41 = this.aShortArray89[local33] & 0xFFFF;
						local222 = local41 >> 10 & 0x3F;
						local240 = local41 >> 7 & 0x7;
						@Pc(652) int local652 = local41 & 0x7F;
						@Pc(658) int local658 = local222 + arg2 & 0x3F;
						local240 += arg3;
						if (local240 < 0) {
							local240 = 0;
						} else if (local240 > 7) {
							local240 = 7;
						}
						local652 += arg4;
						if (local652 < 0) {
							local652 = 0;
						} else if (local652 > 127) {
							local652 = 127;
						}
						this.aShortArray89[local33] = (short) (local658 << 10 | local240 << 7 | local652);
					}
					this.aBoolean304 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method4589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(ZZZ)Lclient!ak;")
	@Override
	public final Model method4572(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static268.aByteArray76.length < this.anInt5787) {
			Static268.aByteArray76 = new byte[this.anInt5787 + 100];
		}
		if (!arg1 && Static268.aShortArray93.length < this.anInt5787) {
			Static268.anIntArray536 = new int[this.anInt5787 + 100];
			Static268.anIntArray537 = new int[this.anInt5787 + 100];
			Static268.anIntArray535 = new int[this.anInt5787 + 100];
			Static268.aShortArray93 = new short[this.anInt5787 + 100];
		}
		return this.method4584(arg0, arg1, Static268.aClass8_Sub1_Sub2_1, Static268.aByteArray76, Static268.aShortArray93, Static268.anIntArray536, Static268.anIntArray537, Static268.anIntArray535);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZZJIILclient!ga;)V")
	private void method4590(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) ParticleSystem arg5) {
		if (arg4 >= 1600) {
			return;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		if (!Static268.aBoolean307) {
			for (local11 = 0; local11 < 1600; local11++) {
				Static268.anIntArray558[local11] = 0;
			}
			for (local11 = 0; local11 < 32; local11++) {
				Static268.anIntArray552[local11] = 0;
			}
			Static268.anInt5790 = 0;
		}
		@Pc(51) int local51;
		@Pc(56) int local56;
		@Pc(61) int local61;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(96) int local96;
		@Pc(104) int local104;
		for (local11 = 0; local11 < this.anInt5787; local11++) {
			if (this.anIntArray532[local11] != -2) {
				local51 = this.anIntArray534[local11];
				local56 = this.anIntArray524[local11];
				local61 = this.anIntArray529[local11];
				local65 = Static268.anIntArray556[local51];
				local69 = Static268.anIntArray556[local56];
				@Pc(73) int local73 = Static268.anIntArray556[local61];
				if (arg0 && (local65 == -5000 || local69 == -5000 || local73 == -5000)) {
					local88 = Static268.anIntArray560[local51];
					local92 = Static268.anIntArray560[local56];
					local96 = Static268.anIntArray560[local61];
					@Pc(100) int local100 = Static268.anIntArray548[local51];
					local104 = Static268.anIntArray548[local56];
					@Pc(108) int local108 = Static268.anIntArray548[local61];
					@Pc(112) int local112 = Static268.anIntArray544[local51];
					@Pc(116) int local116 = Static268.anIntArray544[local56];
					@Pc(120) int local120 = Static268.anIntArray544[local61];
					local88 -= local92;
					@Pc(128) int local128 = local96 - local92;
					@Pc(132) int local132 = local100 - local104;
					@Pc(136) int local136 = local108 - local104;
					@Pc(140) int local140 = local112 - local116;
					@Pc(144) int local144 = local120 - local116;
					@Pc(152) int local152 = local132 * local144 - local140 * local136;
					@Pc(160) int local160 = local140 * local128 - local88 * local144;
					@Pc(168) int local168 = local88 * local136 - local132 * local128;
					if (local92 * local152 + local104 * local160 + local116 * local168 > 0) {
						Static268.aBooleanArray132[local11] = true;
						if (Static268.aBoolean307) {
							Static268.anIntArray550[local5] = (Static268.anIntArray543[local51] + Static268.anIntArray543[local56] + Static268.anIntArray543[local61]) / 3;
							Static268.anIntArray549[local5++] = local11;
						} else {
							@Pc(224) int local224 = (Static268.anIntArray543[local51] + Static268.anIntArray543[local56] + Static268.anIntArray543[local61]) / 3 + arg3;
							if (Static268.anIntArray558[local224] < 64) {
								Static268.anIntArrayArray44[local224][Static268.anIntArray558[local224]++] = local11;
							} else {
								@Pc(247) int local247 = Static268.anIntArray558[local224];
								if (local247 == 64) {
									if (Static268.anInt5790 == 512) {
										continue;
									}
									Static268.anIntArray558[local224] = local247 = Static268.anInt5790++ + 65;
								}
								local247 -= 65;
								Static268.anIntArrayArray43[local247][Static268.anIntArray552[local247]++] = local11;
							}
						}
					}
				} else {
					if (arg1 && this.method4589(Static150.anInt3582 + Rasteriser.anInt2471, Static34.anInt1053 + Rasteriser.anInt2469, Static268.anIntArray551[local51], Static268.anIntArray551[local56], Static268.anIntArray551[local61], local65, local69, local73)) {
						Static259.aLongArray11[Static2.anInt7++] = arg2;
						arg1 = false;
					}
					if ((local65 - local69) * (Static268.anIntArray551[local61] - Static268.anIntArray551[local56]) - (Static268.anIntArray551[local51] - Static268.anIntArray551[local56]) * (local73 - local69) > 0) {
						Static268.aBooleanArray132[local11] = false;
						if (local65 >= 0 && local69 >= 0 && local73 >= 0 && local65 <= Rasteriser.anInt2472 && local69 <= Rasteriser.anInt2472 && local73 <= Rasteriser.anInt2472) {
							Static268.aBooleanArray133[local11] = false;
						} else {
							Static268.aBooleanArray133[local11] = true;
						}
						if (Static268.aBoolean307) {
							Static268.anIntArray550[local5] = (Static268.anIntArray543[local51] + Static268.anIntArray543[local56] + Static268.anIntArray543[local61]) / 3;
							Static268.anIntArray549[local5++] = local11;
						} else {
							local88 = (Static268.anIntArray543[local51] + Static268.anIntArray543[local56] + Static268.anIntArray543[local61]) / 3 + arg3;
							if (Static268.anIntArray558[local88] < 64) {
								Static268.anIntArrayArray44[local88][Static268.anIntArray558[local88]++] = local11;
							} else {
								local92 = Static268.anIntArray558[local88];
								if (local92 == 64) {
									if (Static268.anInt5790 == 512) {
										continue;
									}
									Static268.anIntArray558[local88] = local92 = Static268.anInt5790++ + 65;
								}
								local92 -= 65;
								Static268.anIntArrayArray43[local92][Static268.anIntArray552[local92]++] = local11;
							}
						}
					}
				}
			}
		}
		if (Static268.aBoolean307) {
			Static172.method3223(0, local5 - 1, Static268.anIntArray550, Static268.anIntArray549);
			if (this.aByteArray73 == null) {
				for (local11 = 0; local11 < local5; local11++) {
					this.method4579(Static268.anIntArray549[local11]);
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static268.anIntArray541[local11] = 0;
				Static268.anIntArray557[local11] = 0;
			}
			for (local11 = 0; local11 < local5; local11++) {
				local51 = Static268.anIntArray549[local11];
				local56 = Static268.anIntArray550[local11];
				@Pc(523) byte local523 = this.aByteArray73[local51];
				local65 = Static268.anIntArray541[local523]++;
				Static268.anIntArrayArray45[local523][local65] = local51;
				if (local523 < 10) {
					Static268.anIntArray557[local523] += local56;
				} else if (local523 == 10) {
					Static268.anIntArray545[local65] = local56;
				} else {
					Static268.anIntArray555[local65] = local56;
				}
			}
		} else {
			@Pc(590) int[] local590;
			if (this.aByteArray73 == null) {
				for (local11 = arg4 - 1; local11 >= 0; local11--) {
					local51 = Static268.anIntArray558[local11];
					if (local51 > 0) {
						local56 = local51 > 64 ? 64 : local51;
						local590 = Static268.anIntArrayArray44[local11];
						for (local65 = 0; local65 < local56; local65++) {
							local69 = local590[local65];
							if (local69 < 65536) {
								this.method4579(local590[local65]);
							}
						}
					}
					if (local51 > 64) {
						local56 = Static268.anIntArray558[local11] - 64 - 1;
						local590 = Static268.anIntArrayArray43[local56];
						for (local65 = 0; local65 < Static268.anIntArray552[local56]; local65++) {
							local69 = local590[local65];
							if (local69 < 65536) {
								this.method4579(local590[local65]);
							}
						}
					}
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static268.anIntArray541[local11] = 0;
				Static268.anIntArray557[local11] = 0;
			}
			for (local11 = arg4 - 1; local11 >= 0; local11--) {
				local51 = Static268.anIntArray558[local11];
				@Pc(704) byte local704;
				if (local51 > 0) {
					if (local51 > 64) {
						local56 = 64;
					} else {
						local56 = local51;
					}
					local590 = Static268.anIntArrayArray44[local11];
					for (local65 = 0; local65 < local56; local65++) {
						local69 = local590[local65];
						if (local69 < 65536) {
							local704 = this.aByteArray73[local69];
							local88 = Static268.anIntArray541[local704]++;
							Static268.anIntArrayArray45[local704][local88] = local69;
							if (local704 < 10) {
								Static268.anIntArray557[local704] += local11;
							} else if (local704 == 10) {
								Static268.anIntArray545[local88] = local11;
							} else {
								Static268.anIntArray555[local88] = local11;
							}
						} else {
							Static268.anIntArray561[local7++] = (local69 >> 16) - 1;
						}
					}
				}
				if (local51 > 64) {
					local56 = Static268.anIntArray558[local11] - 64 - 1;
					local590 = Static268.anIntArrayArray43[local56];
					for (local65 = 0; local65 < Static268.anIntArray552[local56]; local65++) {
						local69 = local590[local65];
						if (local69 < 65536) {
							local704 = this.aByteArray73[local69];
							local88 = Static268.anIntArray541[local704]++;
							Static268.anIntArrayArray45[local704][local88] = local69;
							if (local704 < 10) {
								Static268.anIntArray557[local704] += local11;
							} else if (local704 == 10) {
								Static268.anIntArray545[local88] = local11;
							} else {
								Static268.anIntArray555[local88] = local11;
							}
						} else {
							Static268.anIntArray561[local7++] = (local69 >> 16) - 1;
						}
					}
				}
			}
		}
		local11 = 0;
		if (Static268.anIntArray541[1] > 0 || Static268.anIntArray541[2] > 0) {
			local11 = (Static268.anIntArray557[1] + Static268.anIntArray557[2]) / (Static268.anIntArray541[1] + Static268.anIntArray541[2]);
		}
		local51 = 0;
		if (Static268.anIntArray541[3] > 0 || Static268.anIntArray541[4] > 0) {
			local51 = (Static268.anIntArray557[3] + Static268.anIntArray557[4]) / (Static268.anIntArray541[3] + Static268.anIntArray541[4]);
		}
		local56 = 0;
		if (Static268.anIntArray541[6] > 0 || Static268.anIntArray541[8] > 0) {
			local56 = (Static268.anIntArray557[6] + Static268.anIntArray557[8]) / (Static268.anIntArray541[6] + Static268.anIntArray541[8]);
		}
		local65 = 0;
		local69 = Static268.anIntArray541[10];
		@Pc(928) int[] local928 = Static268.anIntArrayArray45[10];
		@Pc(930) int[] local930 = Static268.anIntArray545;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static268.anIntArray541[11];
			local928 = Static268.anIntArrayArray45[11];
			local930 = Static268.anIntArray555;
		}
		if (local69 > 0) {
			local61 = local930[0];
		} else {
			local61 = -1000;
		}
		for (local92 = 0; local92 < 10; local92++) {
			while (local92 == 0 && local61 > local11) {
				this.method4579(local928[local65++]);
				if (local65 == local69 && local928 != Static268.anIntArrayArray45[11]) {
					local65 = 0;
					local69 = Static268.anIntArray541[11];
					local928 = Static268.anIntArrayArray45[11];
					local930 = Static268.anIntArray555;
				}
				if (local65 < local69) {
					local61 = local930[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local92 == 3 && local61 > local51) {
				this.method4579(local928[local65++]);
				if (local65 == local69 && local928 != Static268.anIntArrayArray45[11]) {
					local65 = 0;
					local69 = Static268.anIntArray541[11];
					local928 = Static268.anIntArrayArray45[11];
					local930 = Static268.anIntArray555;
				}
				if (local65 < local69) {
					local61 = local930[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local92 == 5 && local61 > local56) {
				this.method4579(local928[local65++]);
				if (local65 == local69 && local928 != Static268.anIntArrayArray45[11]) {
					local65 = 0;
					local69 = Static268.anIntArray541[11];
					local928 = Static268.anIntArrayArray45[11];
					local930 = Static268.anIntArray555;
				}
				if (local65 < local69) {
					local61 = local930[local65];
				} else {
					local61 = -1000;
				}
			}
			local96 = Static268.anIntArray541[local92];
			@Pc(1096) int[] local1096 = Static268.anIntArrayArray45[local92];
			for (local104 = 0; local104 < local96; local104++) {
				this.method4579(local1096[local104]);
			}
		}
		while (local61 != -1000) {
			this.method4579(local928[local65++]);
			if (local65 == local69 && local928 != Static268.anIntArrayArray45[11]) {
				local65 = 0;
				local928 = Static268.anIntArrayArray45[11];
				local69 = Static268.anIntArray541[11];
				local930 = Static268.anIntArray555;
			}
			if (local65 < local69) {
				local61 = local930[local65];
			} else {
				local61 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "l", descriptor = "()V")
	@Override
	public final void method4578() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5788; local1++) {
			@Pc(10) int local10 = this.anIntArray531[local1];
			this.anIntArray531[local1] = this.anIntArray528[local1];
			this.anIntArray528[local1] = -local10;
		}
		this.aBoolean305 = false;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(IIIIIIII)V")
	public final void method4591(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean305) {
				this.method4592();
			}
			@Pc(6) int local6 = Rasteriser.anInt2471;
			@Pc(8) int local8 = Rasteriser.anInt2469;
			@Pc(12) int local12 = MathUtils.anIntArray223[0];
			@Pc(16) int local16 = MathUtils.anIntArray225[0];
			@Pc(20) int local20 = MathUtils.anIntArray223[arg0];
			@Pc(24) int local24 = MathUtils.anIntArray225[arg0];
			@Pc(28) int local28 = MathUtils.anIntArray223[arg1];
			@Pc(32) int local32 = MathUtils.anIntArray225[arg1];
			@Pc(36) int local36 = MathUtils.anIntArray223[arg2];
			@Pc(40) int local40 = MathUtils.anIntArray225[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt5788; local52++) {
				@Pc(61) int local61 = this.anIntArray528[local52];
				@Pc(66) int local66 = this.anIntArray527[local52];
				@Pc(71) int local71 = this.anIntArray531[local52];
				@Pc(83) int local83;
				if (arg1 != 0) {
					local83 = local66 * local28 + local61 * local32 >> 16;
					local66 = local66 * local32 - local61 * local28 >> 16;
					local61 = local83;
				}
				if (arg0 != 0) {
					local83 = local71 * local20 + local61 * local24 >> 16;
					local71 = local71 * local24 - local61 * local20 >> 16;
					local61 = local83;
				}
				local61 += arg3;
				local66 += arg4;
				local71 += arg5;
				local83 = local66 * local40 - local71 * local36 >> 16;
				local71 = local66 * local36 + local71 * local40 >> 16;
				Static268.anIntArray543[local52] = local71 - local50;
				Static268.anIntArray556[local52] = local6 + (local61 << 9) / arg6;
				Static268.anIntArray551[local52] = local8 + (local83 << 9) / arg6;
				if (this.anInt5789 > 0) {
					Static268.anIntArray560[local52] = local61;
					Static268.anIntArray548[local52] = local83;
					Static268.anIntArray544[local52] = local71;
				}
			}
			this.method4590(false, false, 0L, this.aShort35, this.aShort35 << 1, null);
		} catch (@Pc(234) RuntimeException local234) {
		}
	}

	@OriginalMember(owner = "client!w", name = "p", descriptor = "()V")
	private void method4592() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt5788; local17++) {
			@Pc(26) int local26 = this.anIntArray528[local17];
			@Pc(31) int local31 = this.anIntArray527[local17];
			@Pc(36) int local36 = this.anIntArray531[local17];
			if (local26 < local1) {
				local1 = local26;
			}
			if (local26 > local7) {
				local7 = local26;
			}
			if (local31 < local3) {
				local3 = local31;
			}
			if (local31 > local9) {
				local9 = local31;
			}
			if (local36 < local5) {
				local5 = local36;
			}
			if (local36 > local11) {
				local11 = local36;
			}
			@Pc(74) int local74 = local26 * local26 + local36 * local36;
			if (local74 > local13) {
				local13 = local74;
			}
			local74 += local31 * local31;
			if (local74 > local15) {
				local15 = local74;
			}
		}
		this.aShort31 = (short) local1;
		this.aShort32 = (short) local7;
		this.aShort38 = (short) local3;
		this.aShort37 = (short) local9;
		this.aShort33 = (short) local5;
		this.aShort36 = (short) local11;
		this.aShort34 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort35 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean305 = true;
	}

	@OriginalMember(owner = "client!w", name = "h", descriptor = "()I")
	@Override
	public final int method4562() {
		if (!this.aBoolean305) {
			this.method4592();
		}
		return this.aShort31;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected final void method4577(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		@Pc(21) int local21;
		if (arg0 == 0) {
			local6 = 0;
			Static268.anInt5793 = 0;
			Static268.anInt5791 = 0;
			Static268.anInt5792 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				local21 = arg1[local14];
				if (local21 < this.anIntArrayArray41.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray41[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						if (this.aShortArray91 == null || (arg6 & this.aShortArray91[local41]) != 0) {
							Static268.anInt5793 += this.anIntArray528[local41];
							Static268.anInt5791 += this.anIntArray527[local41];
							Static268.anInt5792 += this.anIntArray531[local41];
							local6++;
						}
					}
				}
			}
			if (local6 > 0) {
				Static268.anInt5793 = Static268.anInt5793 / local6 + arg2;
				Static268.anInt5791 = Static268.anInt5791 / local6 + arg3;
				Static268.anInt5792 = Static268.anInt5792 / local6 + arg4;
				Static268.aBoolean306 = true;
			} else {
				Static268.anInt5793 = arg2;
				Static268.anInt5791 = arg3;
				Static268.anInt5792 = arg4;
			}
			return;
		}
		@Pc(204) int[] local204;
		@Pc(206) int local206;
		if (arg0 == 1) {
			if (arg7 != null) {
				local6 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 16384 >> 15;
				local14 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 16384 >> 15;
				local21 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 16384 >> 15;
				arg2 = local6;
				arg3 = local14;
				arg4 = local21;
			}
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray41.length) {
					local204 = this.anIntArrayArray41[local14];
					for (local206 = 0; local206 < local204.length; local206++) {
						local33 = local204[local206];
						if (this.aShortArray91 == null || (arg6 & this.aShortArray91[local33]) != 0) {
							this.anIntArray528[local33] += arg2;
							this.anIntArray527[local33] += arg3;
							this.anIntArray531[local33] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(307) int local307;
		@Pc(329) int local329;
		@Pc(351) int local351;
		@Pc(392) int local392;
		@Pc(398) int local398;
		@Pc(404) int local404;
		@Pc(410) int local410;
		@Pc(418) int local418;
		@Pc(426) int local426;
		@Pc(579) int local579;
		@Pc(604) int local604;
		@Pc(608) int local608;
		@Pc(616) int local616;
		@Pc(621) int local621;
		@Pc(626) int local626;
		@Pc(631) int local631;
		@Pc(753) int[] local753;
		@Pc(755) int local755;
		@Pc(760) int local760;
		@Pc(765) int local765;
		@Pc(767) int local767;
		@Pc(893) int local893;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray41.length) {
						local204 = this.anIntArrayArray41[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray91 == null || (arg6 & this.aShortArray91[local33]) != 0) {
								this.anIntArray528[local33] -= Static268.anInt5793;
								this.anIntArray527[local33] -= Static268.anInt5791;
								this.anIntArray531[local33] -= Static268.anInt5792;
								if (arg4 != 0) {
									local41 = MathUtils.anIntArray223[arg4];
									local307 = MathUtils.anIntArray225[arg4];
									local329 = this.anIntArray527[local33] * local41 + this.anIntArray528[local33] * local307 + 32767 >> 16;
									this.anIntArray527[local33] = this.anIntArray527[local33] * local307 + 32767 - this.anIntArray528[local33] * local41 >> 16;
									this.anIntArray528[local33] = local329;
								}
								if (arg2 != 0) {
									local41 = MathUtils.anIntArray223[arg2];
									local307 = MathUtils.anIntArray225[arg2];
									local329 = this.anIntArray527[local33] * local307 + 32767 - this.anIntArray531[local33] * local41 >> 16;
									this.anIntArray531[local33] = this.anIntArray527[local33] * local41 + this.anIntArray531[local33] * local307 + 32767 >> 16;
									this.anIntArray527[local33] = local329;
								}
								if (arg3 != 0) {
									local41 = MathUtils.anIntArray223[arg3];
									local307 = MathUtils.anIntArray225[arg3];
									local329 = this.anIntArray531[local33] * local41 + this.anIntArray528[local33] * local307 + 32767 >> 16;
									this.anIntArray531[local33] = this.anIntArray531[local33] * local307 + 32767 - this.anIntArray528[local33] * local41 >> 16;
									this.anIntArray528[local33] = local329;
								}
								this.anIntArray528[local33] += Static268.anInt5793;
								this.anIntArray527[local33] += Static268.anInt5791;
								this.anIntArray531[local33] += Static268.anInt5792;
							}
						}
					}
				}
			} else {
				local6 = arg7[9];
				local14 = arg7[10];
				local21 = arg7[11];
				local206 = arg7[12];
				local33 = arg7[13];
				local41 = arg7[14];
				if (Static268.aBoolean306) {
					local307 = arg7[0] * Static268.anInt5793 + arg7[3] * Static268.anInt5791 + arg7[6] * Static268.anInt5792 + 16384 >> 15;
					local329 = arg7[1] * Static268.anInt5793 + arg7[4] * Static268.anInt5791 + arg7[7] * Static268.anInt5792 + 16384 >> 15;
					local351 = arg7[2] * Static268.anInt5793 + arg7[5] * Static268.anInt5791 + arg7[8] * Static268.anInt5792 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static268.anInt5793 = local307;
					Static268.anInt5791 = local329;
					Static268.anInt5792 = local351;
					Static268.aBoolean306 = false;
				}
				@Pc(374) int[] local374 = new int[9];
				local329 = MathUtils.anIntArray225[arg2] >> 1;
				local351 = MathUtils.anIntArray223[arg2] >> 1;
				local392 = MathUtils.anIntArray225[arg3] >> 1;
				local398 = MathUtils.anIntArray223[arg3] >> 1;
				local404 = MathUtils.anIntArray225[arg4] >> 1;
				local410 = MathUtils.anIntArray223[arg4] >> 1;
				local418 = local351 * local404 + 16384 >> 15;
				local426 = local351 * local410 + 16384 >> 15;
				local374[0] = local392 * local404 + local398 * local426 + 16384 >> 15;
				local374[1] = -local392 * local410 + local398 * local418 + 16384 >> 15;
				local374[2] = local398 * local329 + 16384 >> 15;
				local374[3] = local329 * local410 + 16384 >> 15;
				local374[4] = local329 * local404 + 16384 >> 15;
				local374[5] = -local351;
				local374[6] = -local398 * local404 + local392 * local426 + 16384 >> 15;
				local374[7] = local398 * local410 + local392 * local418 + 16384 >> 15;
				local374[8] = local392 * local329 + 16384 >> 15;
				@Pc(554) int local554 = local374[0] * -Static268.anInt5793 + local374[1] * -Static268.anInt5791 + local374[2] * -Static268.anInt5792 + 16384 >> 15;
				local579 = local374[3] * -Static268.anInt5793 + local374[4] * -Static268.anInt5791 + local374[5] * -Static268.anInt5792 + 16384 >> 15;
				local604 = local374[6] * -Static268.anInt5793 + local374[7] * -Static268.anInt5791 + local374[8] * -Static268.anInt5792 + 16384 >> 15;
				local608 = local554 + Static268.anInt5793;
				@Pc(612) int local612 = local579 + Static268.anInt5791;
				local616 = local604 + Static268.anInt5792;
				@Pc(619) int[] local619 = new int[9];
				for (local621 = 0; local621 < 3; local621++) {
					for (local626 = 0; local626 < 3; local626++) {
						local631 = 0;
						for (@Pc(633) int local633 = 0; local633 < 3; local633++) {
							local631 += local374[local621 * 3 + local633] * arg7[local626 * 3 + local633];
						}
						local619[local621 * 3 + local626] = local631 + 16384 >> 15;
					}
				}
				local621 = local374[0] * local206 + local374[1] * local33 + local374[2] * local41 + 16384 >> 15;
				local626 = local374[3] * local206 + local374[4] * local33 + local374[5] * local41 + 16384 >> 15;
				local631 = local374[6] * local206 + local374[7] * local33 + local374[8] * local41 + 16384 >> 15;
				local621 += local608;
				local626 += local612;
				local631 += local616;
				local753 = new int[9];
				for (local755 = 0; local755 < 3; local755++) {
					for (local760 = 0; local760 < 3; local760++) {
						local765 = 0;
						for (local767 = 0; local767 < 3; local767++) {
							local765 += arg7[local755 * 3 + local767] * local619[local760 + local767 * 3];
						}
						local753[local755 * 3 + local760] = local765 + 16384 >> 15;
					}
				}
				local755 = arg7[0] * local621 + arg7[1] * local626 + arg7[2] * local631 + 16384 >> 15;
				local760 = arg7[3] * local621 + arg7[4] * local626 + arg7[5] * local631 + 16384 >> 15;
				local765 = arg7[6] * local621 + arg7[7] * local626 + arg7[8] * local631 + 16384 >> 15;
				local755 += local6;
				local760 += local14;
				local765 += local21;
				for (local767 = 0; local767 < local2; local767++) {
					local893 = arg1[local767];
					if (local893 < this.anIntArrayArray41.length) {
						@Pc(903) int[] local903 = this.anIntArrayArray41[local893];
						for (@Pc(905) int local905 = 0; local905 < local903.length; local905++) {
							@Pc(913) int local913 = local903[local905];
							if (this.aShortArray91 == null || (arg6 & this.aShortArray91[local913]) != 0) {
								@Pc(955) int local955 = local753[0] * this.anIntArray528[local913] + local753[1] * this.anIntArray527[local913] + local753[2] * this.anIntArray531[local913] + 16384 >> 15;
								@Pc(986) int local986 = local753[3] * this.anIntArray528[local913] + local753[4] * this.anIntArray527[local913] + local753[5] * this.anIntArray531[local913] + 16384 >> 15;
								@Pc(1017) int local1017 = local753[6] * this.anIntArray528[local913] + local753[7] * this.anIntArray527[local913] + local753[8] * this.anIntArray531[local913] + 16384 >> 15;
								@Pc(1021) int local1021 = local955 + local755;
								@Pc(1025) int local1025 = local986 + local760;
								@Pc(1029) int local1029 = local1017 + local765;
								this.anIntArray528[local913] = local1021;
								this.anIntArray527[local913] = local1025;
								this.anIntArray531[local913] = local1029;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray41.length) {
						local204 = this.anIntArrayArray41[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray91 == null || (arg6 & this.aShortArray91[local33]) != 0) {
								this.anIntArray528[local33] -= Static268.anInt5793;
								this.anIntArray527[local33] -= Static268.anInt5791;
								this.anIntArray531[local33] -= Static268.anInt5792;
								this.anIntArray528[local33] = this.anIntArray528[local33] * arg2 / 128;
								this.anIntArray527[local33] = this.anIntArray527[local33] * arg3 / 128;
								this.anIntArray531[local33] = this.anIntArray531[local33] * arg4 / 128;
								this.anIntArray528[local33] += Static268.anInt5793;
								this.anIntArray527[local33] += Static268.anInt5791;
								this.anIntArray531[local33] += Static268.anInt5792;
							}
						}
					}
				}
			} else {
				local6 = arg7[9];
				local14 = arg7[10];
				local21 = arg7[11];
				local206 = arg7[12];
				local33 = arg7[13];
				local41 = arg7[14];
				if (Static268.aBoolean306) {
					local307 = arg7[0] * Static268.anInt5793 + arg7[3] * Static268.anInt5791 + arg7[6] * Static268.anInt5792 + 16384 >> 15;
					local329 = arg7[1] * Static268.anInt5793 + arg7[4] * Static268.anInt5791 + arg7[7] * Static268.anInt5792 + 16384 >> 15;
					local351 = arg7[2] * Static268.anInt5793 + arg7[5] * Static268.anInt5791 + arg7[8] * Static268.anInt5792 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static268.anInt5793 = local307;
					Static268.anInt5791 = local329;
					Static268.anInt5792 = local351;
					Static268.aBoolean306 = false;
				}
				local307 = arg2 << 15 >> 7;
				local329 = arg3 << 15 >> 7;
				local351 = arg4 << 15 >> 7;
				local392 = local307 * -Static268.anInt5793 + 16384 >> 15;
				local398 = local329 * -Static268.anInt5791 + 16384 >> 15;
				local404 = local351 * -Static268.anInt5792 + 16384 >> 15;
				local410 = local392 + Static268.anInt5793;
				local418 = local398 + Static268.anInt5791;
				local426 = local404 + Static268.anInt5792;
				@Pc(1481) int[] local1481 = new int[] { local307 * arg7[0] + 16384 >> 15, local307 * arg7[3] + 16384 >> 15, local307 * arg7[6] + 16384 >> 15, local329 * arg7[1] + 16384 >> 15, local329 * arg7[4] + 16384 >> 15, local329 * arg7[7] + 16384 >> 15, local351 * arg7[2] + 16384 >> 15, local351 * arg7[5] + 16384 >> 15, local351 * arg7[8] + 16384 >> 15 };
				local579 = local307 * local206 + 16384 >> 15;
				local604 = local329 * local33 + 16384 >> 15;
				local608 = local351 * local41 + 16384 >> 15;
				@Pc(1617) int local1617 = local579 + local410;
				@Pc(1621) int local1621 = local604 + local418;
				@Pc(1625) int local1625 = local608 + local426;
				@Pc(1628) int[] local1628 = new int[9];
				@Pc(1635) int local1635;
				for (local616 = 0; local616 < 3; local616++) {
					for (local1635 = 0; local1635 < 3; local1635++) {
						local621 = 0;
						for (local626 = 0; local626 < 3; local626++) {
							local621 += arg7[local616 * 3 + local626] * local1481[local1635 + local626 * 3];
						}
						local1628[local616 * 3 + local1635] = local621 + 16384 >> 15;
					}
				}
				local616 = arg7[0] * local1617 + arg7[1] * local1621 + arg7[2] * local1625 + 16384 >> 15;
				local1635 = arg7[3] * local1617 + arg7[4] * local1621 + arg7[5] * local1625 + 16384 >> 15;
				local621 = arg7[6] * local1617 + arg7[7] * local1621 + arg7[8] * local1625 + 16384 >> 15;
				local616 += local6;
				local1635 += local14;
				local621 += local21;
				for (local626 = 0; local626 < local2; local626++) {
					local631 = arg1[local626];
					if (local631 < this.anIntArrayArray41.length) {
						local753 = this.anIntArrayArray41[local631];
						for (local755 = 0; local755 < local753.length; local755++) {
							local760 = local753[local755];
							if (this.aShortArray91 == null || (arg6 & this.aShortArray91[local760]) != 0) {
								local765 = local1628[0] * this.anIntArray528[local760] + local1628[1] * this.anIntArray527[local760] + local1628[2] * this.anIntArray531[local760] + 16384 >> 15;
								local767 = local1628[3] * this.anIntArray528[local760] + local1628[4] * this.anIntArray527[local760] + local1628[5] * this.anIntArray531[local760] + 16384 >> 15;
								local893 = local1628[6] * this.anIntArray528[local760] + local1628[7] * this.anIntArray527[local760] + local1628[8] * this.anIntArray531[local760] + 16384 >> 15;
								@Pc(1896) int local1896 = local765 + local616;
								@Pc(1900) int local1900 = local767 + local1635;
								@Pc(1904) int local1904 = local893 + local621;
								this.anIntArray528[local760] = local1896;
								this.anIntArray527[local760] = local1900;
								this.anIntArray531[local760] = local1904;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray42 != null && this.aByteArray75 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray42.length) {
						local204 = this.anIntArrayArray42[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray90 == null || (arg6 & this.aShortArray90[local33]) != 0) {
								local41 = (this.aByteArray75[local33] & 0xFF) + arg2 * 8;
								if (local41 < 0) {
									local41 = 0;
								} else if (local41 > 255) {
									local41 = 255;
								}
								this.aByteArray75[local33] = (byte) local41;
							}
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray42 != null) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray42.length) {
					local204 = this.anIntArrayArray42[local14];
					for (local206 = 0; local206 < local204.length; local206++) {
						local33 = local204[local206];
						if (this.aShortArray90 == null || (arg6 & this.aShortArray90[local33]) != 0) {
							local41 = this.aShortArray89[local33] & 0xFFFF;
							local307 = local41 >> 10 & 0x3F;
							local329 = local41 >> 7 & 0x7;
							local351 = local41 & 0x7F;
							@Pc(2209) int local2209 = local307 + arg2 & 0x3F;
							local329 += arg3;
							if (local329 < 0) {
								local329 = 0;
							} else if (local329 > 7) {
								local329 = 7;
							}
							local351 += arg4;
							if (local351 < 0) {
								local351 = 0;
							} else if (local351 > 127) {
								local351 = 127;
							}
							this.aShortArray89[local33] = (short) (local2209 << 10 | local329 << 7 | local351);
						}
					}
					this.aBoolean304 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)V")
	@Override
	protected final void method4567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static268.anInt5793 = 0;
			Static268.anInt5791 = 0;
			Static268.anInt5792 = 0;
			for (local11 = 0; local11 < this.anInt5788; local11++) {
				Static268.anInt5793 += this.anIntArray528[local11];
				Static268.anInt5791 += this.anIntArray527[local11];
				Static268.anInt5792 += this.anIntArray531[local11];
				local3++;
			}
			if (local3 > 0) {
				Static268.anInt5793 = Static268.anInt5793 / local3 + arg1;
				Static268.anInt5791 = Static268.anInt5791 / local3 + arg2;
				Static268.anInt5792 = Static268.anInt5792 / local3 + arg3;
			} else {
				Static268.anInt5793 = arg1;
				Static268.anInt5791 = arg2;
				Static268.anInt5792 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt5788; local3++) {
				this.anIntArray528[local3] += arg1;
				this.anIntArray527[local3] += arg2;
				this.anIntArray531[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt5788; local3++) {
					this.anIntArray528[local3] -= Static268.anInt5793;
					this.anIntArray527[local3] -= Static268.anInt5791;
					this.anIntArray531[local3] -= Static268.anInt5792;
					if (arg3 != 0) {
						local11 = MathUtils.anIntArray223[arg3];
						local146 = MathUtils.anIntArray225[arg3];
						local164 = this.anIntArray527[local3] * local11 + this.anIntArray528[local3] * local146 + 32767 >> 16;
						this.anIntArray527[local3] = this.anIntArray527[local3] * local146 + 32767 - this.anIntArray528[local3] * local11 >> 16;
						this.anIntArray528[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = MathUtils.anIntArray223[arg1];
						local146 = MathUtils.anIntArray225[arg1];
						local164 = this.anIntArray527[local3] * local146 + 32767 - this.anIntArray531[local3] * local11 >> 16;
						this.anIntArray531[local3] = this.anIntArray527[local3] * local11 + this.anIntArray531[local3] * local146 + 32767 >> 16;
						this.anIntArray527[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = MathUtils.anIntArray223[arg2];
						local146 = MathUtils.anIntArray225[arg2];
						local164 = this.anIntArray531[local3] * local11 + this.anIntArray528[local3] * local146 + 32767 >> 16;
						this.anIntArray531[local3] = this.anIntArray531[local3] * local146 + 32767 - this.anIntArray528[local3] * local11 >> 16;
						this.anIntArray528[local3] = local164;
					}
					this.anIntArray528[local3] += Static268.anInt5793;
					this.anIntArray527[local3] += Static268.anInt5791;
					this.anIntArray531[local3] += Static268.anInt5792;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt5788; local3++) {
					this.anIntArray528[local3] -= Static268.anInt5793;
					this.anIntArray527[local3] -= Static268.anInt5791;
					this.anIntArray531[local3] -= Static268.anInt5792;
					this.anIntArray528[local3] = this.anIntArray528[local3] * arg1 / 128;
					this.anIntArray527[local3] = this.anIntArray527[local3] * arg2 / 128;
					this.anIntArray531[local3] = this.anIntArray531[local3] * arg3 / 128;
					this.anIntArray528[local3] += Static268.anInt5793;
					this.anIntArray527[local3] += Static268.anInt5791;
					this.anIntArray531[local3] += Static268.anInt5792;
				}
			} else if (arg0 == 5) {
				for (local3 = 0; local3 < this.anInt5787; local3++) {
					local11 = (this.aByteArray75[local3] & 0xFF) + arg1 * 8;
					if (local11 < 0) {
						local11 = 0;
					} else if (local11 > 255) {
						local11 = 255;
					}
					this.aByteArray75[local3] = (byte) local11;
				}
			} else if (arg0 == 7) {
				for (local3 = 0; local3 < this.anInt5787; local3++) {
					local11 = this.aShortArray89[local3] & 0xFFFF;
					local146 = local11 >> 10 & 0x3F;
					local164 = local11 >> 7 & 0x7;
					@Pc(492) int local492 = local11 & 0x7F;
					@Pc(498) int local498 = local146 + arg1 & 0x3F;
					local164 += arg2;
					if (local164 < 0) {
						local164 = 0;
					} else if (local164 > 7) {
						local164 = 7;
					}
					local492 += arg3;
					if (local492 < 0) {
						local492 = 0;
					} else if (local492 > 127) {
						local492 = 127;
					}
					this.aShortArray89[local3] = (short) (local498 << 10 | local164 << 7 | local492);
				}
				this.aBoolean304 = true;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(III)V")
	@Override
	public final void method4575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5788; local1++) {
			this.anIntArray528[local1] += arg0;
			this.anIntArray527[local1] += arg1;
			this.anIntArray531[local1] += arg2;
		}
		this.aBoolean305 = false;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(ZZZ)Lclient!ak;")
	@Override
	public final Model method4568(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static268.aByteArray78.length < this.anInt5787) {
			Static268.aByteArray78 = new byte[this.anInt5787 + 100];
		}
		if (!arg1 && Static268.aShortArray95.length < this.anInt5787) {
			Static268.anIntArray554 = new int[this.anInt5787 + 100];
			Static268.anIntArray559 = new int[this.anInt5787 + 100];
			Static268.anIntArray546 = new int[this.anInt5787 + 100];
			Static268.aShortArray95 = new short[this.anInt5787 + 100];
		}
		return this.method4584(arg0, arg1, Static268.aClass8_Sub1_Sub2_3, Static268.aByteArray78, Static268.aShortArray95, Static268.anIntArray554, Static268.anIntArray559, Static268.anIntArray546);
	}
}
