import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!fl", name = "u", descriptor = "Z")
	public static boolean aBoolean116;

	@OriginalMember(owner = "client!fl", name = "C", descriptor = "Lsignlink!im;")
	public static PrivilegedRequest aClass212_3;

	@OriginalMember(owner = "client!fl", name = "D", descriptor = "[[I")
	public static int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!fl", name = "U", descriptor = "I")
	public static int anInt2046;

	@OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
	public static int anInt2031 = 128;

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "J")
	public static long aLong74 = 0L;

	@OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
	public static int updatedVarcstrsWriterIndex = 0;

	@OriginalMember(owner = "client!fl", name = "H", descriptor = "Lclient!na;")
	public static final JagString aClass100_446 = Static28.parse("<img=0>");

	@OriginalMember(owner = "client!fl", name = "P", descriptor = "I")
	public static int anInt2043 = 0;

	@OriginalMember(owner = "client!fl", name = "Q", descriptor = "Lclient!na;")
	public static final JagString aClass100_447 = Static28.parse("");

	@OriginalMember(owner = "client!fl", name = "V", descriptor = "Lclient!na;")
	public static final JagString aClass100_448 = Static28.parse("(Y");

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)Lclient!cl;")
	public static AnimFrameset method1566(@OriginalArg(0) int arg0) {
		@Pc(19) AnimFrameset local19 = (AnimFrameset) Static267.aClass99_37.method3106((long) arg0);
		if (local19 != null) {
			return local19;
		}
		local19 = Static87.method1803(Static225.aClass153_92, Static5.aClass153_1, arg0);
		if (local19 != null) {
			Static267.aClass99_37.method3095(local19, (long) arg0);
		}
		return local19;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIII)V")
	public static void method1568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static131.method2576(Static71.anIntArrayArray10[arg0], arg1 - arg2, arg2 + arg1, arg4);
		@Pc(17) int local17 = 0;
		@Pc(21) int local21 = arg2 * arg2;
		@Pc(25) int local25 = arg3 * arg3;
		@Pc(27) int local27 = arg3;
		@Pc(31) int local31 = local25 << 1;
		@Pc(35) int local35 = local21 << 1;
		@Pc(39) int local39 = arg3 << 1;
		@Pc(48) int local48 = local31 + (1 - local39) * local21;
		@Pc(56) int local56 = local25 - local35 * (local39 - 1);
		@Pc(60) int local60 = local21 << 2;
		@Pc(70) int local70 = local25 << 2;
		@Pc(78) int local78 = local31 * 3;
		@Pc(86) int local86 = local35 * ((arg3 << 1) - 3);
		@Pc(92) int local92 = local70;
		@Pc(98) int local98 = local60 * (arg3 - 1);
		while (local27 > 0) {
			local27--;
			@Pc(105) int local105 = local27 + arg0;
			@Pc(109) int local109 = arg0 - local27;
			if (local48 < 0) {
				while (local48 < 0) {
					local17++;
					local48 += local78;
					local56 += local92;
					local92 += local70;
					local78 += local70;
				}
			}
			if (local56 < 0) {
				local48 += local78;
				local78 += local70;
				local56 += local92;
				local17++;
				local92 += local70;
			}
			@Pc(160) int local160 = local17 + arg1;
			local56 += -local86;
			local86 -= local60;
			local48 += -local98;
			@Pc(179) int local179 = arg1 - local17;
			local98 -= local60;
			Static131.method2576(Static71.anIntArrayArray10[local109], local179, local160, arg4);
			Static131.method2576(Static71.anIntArrayArray10[local105], local179, local160, arg4);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)V")
	public static void method1570() {
		Static142.aClass99_23.method3102(5);
		Static267.aClass99_37.method3102(5);
	}
}
