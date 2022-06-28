package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class VorbisFloor {

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "[I")
	public static final int[] RANGES = new int[]{256, 128, 86, 64};
	@OriginalMember(owner = "client!ie", name = "l", descriptor = "[F")
	public static final float[] INVERSE_DB_TABLE = new float[]{1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F, 1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F, 1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F, 2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F, 2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F, 3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F, 4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F, 6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F, 7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F, 1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F, 1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F, 1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F, 2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F, 2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F, 3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F, 4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F, 5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F, 7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F, 1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F, 1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F, 1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F, 2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F, 2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F, 3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F, 4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F, 6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F, 7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F, 1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F, 1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F, 1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F, 2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F, 2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F, 3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F, 4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F, 5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F, 7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F, 9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F, 0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F, 0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F, 0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F, 0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F, 0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F, 0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F, 0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F, 0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F, 0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F, 0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F, 0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F, 0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F, 0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F, 0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F, 0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F, 0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F, 0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F, 0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F, 0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F, 0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F, 0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F, 0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F, 0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F, 0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F};
	@OriginalMember(owner = "client!ie", name = "b", descriptor = "[Z")
	public static boolean[] step2Flag;
	@OriginalMember(owner = "client!ie", name = "h", descriptor = "[I")
	public static int[] currentXList;
	@OriginalMember(owner = "client!ie", name = "j", descriptor = "[I")
	public static int[] y;
	@OriginalMember(owner = "client!ie", name = "e", descriptor = "[I")
	private final int[] classList;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "[I")
	private final int[] classDimensions;

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "[I")
	private final int[] subclasses;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "[I")
	private final int[] classMasterBooks;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "[[I")
	private final int[][] subclassBooks;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
	private final int multiplier;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "[I")
	private final int[] xList;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
	public VorbisFloor() {
		@Pc(4) int type = VorbisSound.readBits(16);
		if (type != 1) {
			throw new RuntimeException();
		}
		@Pc(14) int local14 = VorbisSound.readBits(5);
		@Pc(16) int local16 = 0;
		this.classList = new int[local14];
		@Pc(22) int local22;
		@Pc(28) int local28;
		for (local22 = 0; local22 < local14; local22++) {
			local28 = VorbisSound.readBits(4);
			this.classList[local22] = local28;
			if (local28 >= local16) {
				local16 = local28 + 1;
			}
		}
		this.classDimensions = new int[local16];
		this.subclasses = new int[local16];
		this.classMasterBooks = new int[local16];
		this.subclassBooks = new int[local16][];
		@Pc(101) int local101;
		for (local22 = 0; local22 < local16; local22++) {
			this.classDimensions[local22] = VorbisSound.readBits(3) + 1;
			local28 = this.subclasses[local22] = VorbisSound.readBits(2);
			if (local28 != 0) {
				this.classMasterBooks[local22] = VorbisSound.readBits(8);
			}
			local28 = 0x1 << local28;
			@Pc(94) int[] local94 = new int[local28];
			this.subclassBooks[local22] = local94;
			for (local101 = 0; local101 < local28; local101++) {
				local94[local101] = VorbisSound.readBits(8) - 1;
			}
		}
		this.multiplier = VorbisSound.readBits(2) + 1;
		local22 = VorbisSound.readBits(4);
		local28 = 2;
		@Pc(128) int local128;
		for (local128 = 0; local128 < local14; local128++) {
			local28 += this.classDimensions[this.classList[local128]];
		}
		this.xList = new int[local28];
		this.xList[0] = 0;
		this.xList[1] = 0x1 << local22;
		local28 = 2;
		for (local128 = 0; local128 < local14; local128++) {
			local101 = this.classList[local128];
			for (@Pc(173) int local173 = 0; local173 < this.classDimensions[local101]; local173++) {
				this.xList[local28++] = VorbisSound.readBits(local22);
			}
		}
		if (currentXList == null || currentXList.length < local28) {
			currentXList = new int[local28];
			y = new int[local28];
			step2Flag = new boolean[local28];
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([II)I")
	public static int lowNeighbour(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0[arg1];
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MIN_VALUE;
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			@Pc(16) int local16 = arg0[local9];
			if (local16 < local3 && local16 > local7) {
				local5 = local9;
				local7 = local16;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "([II)I")
	public static int highNeighbour(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0[arg1];
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			@Pc(16) int local16 = arg0[local9];
			if (local16 > local3 && local16 < local7) {
				local5 = local9;
				local7 = local16;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIII[FI)V")
	private void renderLine(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		@Pc(43) int local43 = local14 - (local18 < 0 ? -local18 : local18) * local7;
		arg4[arg0] *= INVERSE_DB_TABLE[arg1];
		if (arg2 > arg5) {
			arg2 = arg5;
		}
		for (@Pc(61) int local61 = arg0 + 1; local61 < arg2; local61++) {
			local22 += local43;
			if (local22 >= local7) {
				local22 -= local7;
				local20 += local32;
			} else {
				local20 += local18;
			}
			arg4[local61] *= INVERSE_DB_TABLE[local20];
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
	private void sort(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(5) int local5 = arg0;
		@Pc(9) int local9 = currentXList[arg0];
		@Pc(13) int local13 = y[arg0];
		@Pc(17) boolean local17 = step2Flag[arg0];
		for (@Pc(21) int local21 = arg0 + 1; local21 <= arg1; local21++) {
			@Pc(28) int local28 = currentXList[local21];
			if (local28 < local9) {
				currentXList[local5] = local28;
				y[local5] = y[local21];
				step2Flag[local5] = step2Flag[local21];
				local5++;
				currentXList[local21] = currentXList[local5];
				y[local21] = y[local5];
				step2Flag[local21] = step2Flag[local5];
			}
		}
		currentXList[local5] = local9;
		y[local5] = local13;
		step2Flag[local5] = local17;
		this.sort(arg0, local5 - 1);
		this.sort(local5 + 1, arg1);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIII)I")
	private int renderPoint(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([FI)V")
	public final void synthesize(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = this.xList.length;
		@Pc(10) int local10 = RANGES[this.multiplier - 1];
		step2Flag[0] = step2Flag[1] = true;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(49) int local49;
		@Pc(53) int local53;
		for (local20 = 2; local20 < local3; local20++) {
			local27 = lowNeighbour(currentXList, local20);
			local31 = highNeighbour(currentXList, local20);
			local49 = this.renderPoint(currentXList[local27], y[local27], currentXList[local31], y[local31], currentXList[local20]);
			local53 = y[local20];
			@Pc(57) int local57 = local10 - local49;
			@Pc(68) int local68 = (local57 < local49 ? local57 : local49) << 1;
			if (local53 == 0) {
				step2Flag[local20] = false;
				y[local20] = local49;
			} else {
				step2Flag[local27] = step2Flag[local31] = true;
				step2Flag[local20] = true;
				if (local53 >= local68) {
					y[local20] = local57 > local49 ? local53 + local49 - local49 : local49 - local53 + local57 - 1;
				} else {
					y[local20] = (local53 & 0x1) == 0 ? local49 + local53 / 2 : local49 - (local53 + 1) / 2;
				}
			}
		}
		this.sort(0, local3 - 1);
		local20 = 0;
		local27 = y[0] * this.multiplier;
		for (local31 = 1; local31 < local3; local31++) {
			if (step2Flag[local31]) {
				local49 = currentXList[local31];
				local53 = y[local31] * this.multiplier;
				this.renderLine(local20, local27, local49, local53, arg0, arg1);
				if (local49 >= arg1) {
					return;
				}
				local20 = local49;
				local27 = local53;
			}
		}
		@Pc(193) float local193 = INVERSE_DB_TABLE[local27];
		for (local49 = local20; local49 < arg1; local49++) {
			arg0[local49] *= local193;
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "()Z")
	public final boolean decodePacket() {
		@Pc(5) boolean local5 = VorbisSound.readBit() != 0;
		if (!local5) {
			return false;
		}
		@Pc(13) int local13 = this.xList.length;
		@Pc(15) int local15;
		for (local15 = 0; local15 < local13; local15++) {
			currentXList[local15] = this.xList[local15];
		}
		local15 = RANGES[this.multiplier - 1];
		@Pc(40) int local40 = IntUtils.bitCount(local15 - 1);
		y[0] = VorbisSound.readBits(local40);
		y[1] = VorbisSound.readBits(local40);
		@Pc(52) int local52 = 2;
		for (@Pc(54) int local54 = 0; local54 < this.classList.length; local54++) {
			@Pc(64) int local64 = this.classList[local54];
			@Pc(69) int local69 = this.classDimensions[local64];
			@Pc(74) int local74 = this.subclasses[local64];
			@Pc(80) int local80 = (0x1 << local74) - 1;
			@Pc(82) int local82 = 0;
			if (local74 > 0) {
				local82 = VorbisSound.codebooks[this.classMasterBooks[local64]].decodeScalar();
			}
			for (@Pc(94) int local94 = 0; local94 < local69; local94++) {
				@Pc(106) int local106 = this.subclassBooks[local64][local82 & local80];
				local82 >>>= local74;
				y[local52++] = local106 >= 0 ? VorbisSound.codebooks[local106].decodeScalar() : 0;
			}
		}
		return true;
	}
}
