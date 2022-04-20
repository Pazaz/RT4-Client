import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
	public static int anInt2161;

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "Lclient!n;")
	public static final SoftLruHashTable aClass99_11 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "[I")
	public static int[] anIntArray205 = new int[2];

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
	public static int anInt2157 = 0;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIZIZZ)V")
	public static void method1697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg2 <= arg4) {
			return;
		}
		@Pc(13) int local13 = (arg2 + arg4) / 2;
		@Pc(15) int local15 = arg4;
		@Pc(19) World local19 = Static101.aClass10_Sub1Array1[local13];
		Static101.aClass10_Sub1Array1[local13] = Static101.aClass10_Sub1Array1[arg2];
		Static101.aClass10_Sub1Array1[arg2] = local19;
		for (@Pc(31) int local31 = arg4; local31 < arg2; local31++) {
			if (Static164.method3115(local19, Static101.aClass10_Sub1Array1[local31], arg0, arg1, arg3, arg5) <= 0) {
				@Pc(53) World local53 = Static101.aClass10_Sub1Array1[local31];
				Static101.aClass10_Sub1Array1[local31] = Static101.aClass10_Sub1Array1[local15];
				Static101.aClass10_Sub1Array1[local15++] = local53;
			}
		}
		Static101.aClass10_Sub1Array1[arg2] = Static101.aClass10_Sub1Array1[local15];
		Static101.aClass10_Sub1Array1[local15] = local19;
		method1697(arg0, arg1, local15 - 1, arg3, arg4, arg5);
		method1697(arg0, arg1, arg2, arg3, local15 + 1, arg5);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 1 || arg4 < 1 || arg1 > 102 || arg4 > 102) {
			return;
		}
		@Pc(39) int local39;
		if (!Static138.method2697() && (Static12.aByteArrayArrayArray2[0][arg1][arg4] & 0x2) == 0) {
			local39 = arg2;
			if ((Static12.aByteArrayArrayArray2[arg2][arg1][arg4] & 0x8) != 0) {
				local39 = 0;
			}
			if (local39 != Static41.anInt1316) {
				return;
			}
		}
		local39 = arg2;
		if (arg2 < 3 && (Static12.aByteArrayArrayArray2[1][arg1][arg4] & 0x2) == 2) {
			local39 = arg2 + 1;
		}
		Static43.method1144(arg4, arg1, arg2, arg6, local39, Static148.aClass97Array1[arg2]);
		if (arg0 >= 0) {
			@Pc(92) boolean local92 = Static250.aBoolean283;
			Static250.aBoolean283 = true;
			Static185.method3397(local39, false, arg2, false, Static148.aClass97Array1[arg2], arg0, arg5, arg1, arg4, arg3);
			Static250.aBoolean283 = local92;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IJ)Lclient!na;")
	public static JagString decode37(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			@Pc(34) long local34 = arg0;
			while (local34 != 0L) {
				local34 /= 37L;
				local32++;
			}
			@Pc(48) byte[] local48 = new byte[local32];
			while (arg0 != 0L) {
				@Pc(65) long local65 = arg0;
				arg0 /= 37L;
				local32--;
				local48[local32] = Static31.aByteArray12[(int) (local65 - arg0 * 37L)];
			}
			@Pc(88) JagString local88 = new JagString();
			local88.aByteArray52 = local48;
			local88.anInt4030 = local48.length;
			return local88;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLclient!ve;)V")
	public static void method1703(@OriginalArg(1) Js5 arg0) {
		Static167.aClass153_62 = arg0;
	}
}
