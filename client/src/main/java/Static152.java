import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
	public static int anInt3594;

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "Lclient!fd;")
	public static WorldMapFont aClass41_3;

	@OriginalMember(owner = "client!ma", name = "x", descriptor = "Lclient!ih;")
	public static final LinkedList aClass69_87 = new LinkedList();

	@OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
	public static int anInt3604 = -1;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIBIIII)V")
	public static void method2826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 - arg3 >= Static172.anInt4164 && Static224.anInt5063 >= arg4 + arg3 && Static267.anInt5773 <= arg1 - arg3 && Static106.anInt2869 >= arg3 + arg1) {
			Static8.method120(arg5, arg0, arg1, arg2, arg3, arg4);
		} else {
			Static280.method4670(arg2, arg1, arg3, arg5, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([IIIIII)V")
	public static void method2835(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Tile local7 = Static130.aClass3_Sub5ArrayArrayArray1[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) PlainTile local13 = local7.aClass131_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt4871;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) ShapedTile local58 = local7.aClass43_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt1966;
		@Pc(67) int local67 = local58.anInt1967;
		@Pc(70) int local70 = local58.anInt1969;
		@Pc(73) int local73 = local58.anInt1968;
		@Pc(77) int[] local77 = Static132.anIntArrayArray24[local23];
		@Pc(81) int[] local81 = Static271.anIntArrayArray46[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!tk;IIZI)V")
	public static void method2836(@OriginalArg(0) int arg0, @OriginalArg(1) SeqType arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static189.anInt4451 >= 50 || (arg1.anIntArrayArray38 == null || arg4 >= arg1.anIntArrayArray38.length || arg1.anIntArrayArray38[arg4] == null)) {
			return;
		}
		@Pc(36) int local36 = arg1.anIntArrayArray38[arg4][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(57) int local57;
		if (arg1.anIntArrayArray38[arg4].length > 1) {
			local57 = (int) ((double) arg1.anIntArrayArray38[arg4].length * Math.random());
			if (local57 > 0) {
				local40 = arg1.anIntArrayArray38[arg4][local57];
			}
		}
		@Pc(73) int local73 = local36 >> 5 & 0x7;
		@Pc(77) int local77 = local36 & 0x1F;
		if (local77 == 0) {
			if (arg3) {
				Static26.method744(local73, local40, 0);
			}
		} else if (Static30.anInt978 != 0) {
			Static200.anIntArray421[Static189.anInt4451] = local40;
			Static276.anIntArray563[Static189.anInt4451] = local73;
			@Pc(111) int local111 = (arg0 - 64) / 128;
			local57 = (arg2 - 64) / 128;
			Static164.anIntArray362[Static189.anInt4451] = 0;
			Static173.aClass138Array1[Static189.anInt4451] = null;
			Static26.anIntArray68[Static189.anInt4451] = local77 + (local57 << 16) + (local111 << 8);
			Static189.anInt4451++;
		}
	}
}
