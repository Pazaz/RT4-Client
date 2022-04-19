import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "Lclient!qf;")
	public static Sprite aClass3_Sub2_Sub1_6;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
	public static int anInt2430 = 0;

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "Lclient!na;")
	private static final Class100 aClass100_511 = Static28.method790(" has logged out)3");

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "Lclient!na;")
	public static Class100 aClass100_507 = aClass100_511;

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "Lclient!na;")
	private static final Class100 aClass100_509 = Static28.method790("purple:");

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "Lclient!na;")
	public static Class100 aClass100_508 = aClass100_509;

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "[J")
	public static final long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
	public static int anInt2433 = 0;

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "Lclient!na;")
	public static final Class100 aClass100_510 = Static28.method790("null");

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "Lclient!na;")
	public static final Class100 aClass100_512 = aClass100_509;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1881(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 0 || arg3 < 0 || arg5 >= 103 || arg3 >= 103) {
			return;
		}
		@Pc(38) int local38;
		if (arg4 == 0) {
			@Pc(28) Class77 local28 = Static262.method4509(arg0, arg5, arg3);
			if (local28 != null) {
				local38 = Integer.MAX_VALUE & (int) (local28.aLong107 >>> 32);
				if (arg2 == 2) {
					local28.aClass8_5 = new Class8_Sub3(local38, 2, arg1 + 4, arg0, arg5, arg3, arg6, false, local28.aClass8_5);
					local28.aClass8_6 = new Class8_Sub3(local38, 2, arg1 + 1 & 0x3, arg0, arg5, arg3, arg6, false, local28.aClass8_6);
				} else {
					local28.aClass8_5 = new Class8_Sub3(local38, arg2, arg1, arg0, arg5, arg3, arg6, false, local28.aClass8_5);
				}
			}
		}
		if (arg4 == 1) {
			@Pc(106) WallDecor local106 = Static83.method435(arg0, arg5, arg3);
			if (local106 != null) {
				local38 = (int) (local106.aLong52 >>> 32) & Integer.MAX_VALUE;
				if (arg2 == 4 || arg2 == 5) {
					local106.aClass8_3 = new Class8_Sub3(local38, 4, arg1, arg0, arg5, arg3, arg6, false, local106.aClass8_3);
				} else if (arg2 == 6) {
					local106.aClass8_3 = new Class8_Sub3(local38, 4, arg1 + 4, arg0, arg5, arg3, arg6, false, local106.aClass8_3);
				} else if (arg2 == 7) {
					local106.aClass8_3 = new Class8_Sub3(local38, 4, (arg1 + 2 & 0x3) + 4, arg0, arg5, arg3, arg6, false, local106.aClass8_3);
				} else if (arg2 == 8) {
					local106.aClass8_3 = new Class8_Sub3(local38, 4, arg1 + 4, arg0, arg5, arg3, arg6, false, local106.aClass8_3);
					local106.aClass8_2 = new Class8_Sub3(local38, 4, (arg1 + 2 & 0x3) + 4, arg0, arg5, arg3, arg6, false, local106.aClass8_2);
				}
			}
		}
		if (arg4 == 2) {
			if (arg2 == 11) {
				arg2 = 10;
			}
			@Pc(255) Scenery local255 = Static133.method4008(arg0, arg5, arg3);
			if (local255 != null) {
				local255.aClass8_4 = new Class8_Sub3((int) (local255.aLong56 >>> 32) & Integer.MAX_VALUE, arg2, arg1, arg0, arg5, arg3, arg6, false, local255.aClass8_4);
			}
		}
		if (arg4 == 3) {
			@Pc(290) GroundDecor local290 = Static269.method2210(arg0, arg5, arg3);
			if (local290 != null) {
				local290.aClass8_1 = new Class8_Sub3(Integer.MAX_VALUE & (int) (local290.aLong26 >>> 32), 22, arg1, arg0, arg5, arg3, arg6, false, local290.aClass8_1);
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	public static void method1882() {
		Static220.aClass99_28.method3103();
	}
}
