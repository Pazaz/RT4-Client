import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!km", name = "sc", descriptor = "[Lclient!qf;")
	public static Sprite[] aClass3_Sub2_Sub1Array5;

	@OriginalMember(owner = "client!km", name = "uc", descriptor = "F")
	public static float aFloat14;

	@OriginalMember(owner = "client!km", name = "Nc", descriptor = "Lclient!ve;")
	public static Js5 aClass153_50;

	@OriginalMember(owner = "client!km", name = "Oc", descriptor = "Lclient!ve;")
	public static Js5 aClass153_51;

	@OriginalMember(owner = "client!km", name = "Pc", descriptor = "I")
	public static int anInt3439;

	@OriginalMember(owner = "client!km", name = "Yc", descriptor = "I")
	public static int anInt3443;

	@OriginalMember(owner = "client!km", name = "pc", descriptor = "Z")
	public static boolean aBoolean172 = false;

	@OriginalMember(owner = "client!km", name = "tc", descriptor = "Lclient!na;")
	private static final JagString aClass100_641 = Static28.parse("Dec");

	@OriginalMember(owner = "client!km", name = "vc", descriptor = "Lclient!na;")
	private static final JagString aClass100_642 = Static28.parse("Jul");

	@OriginalMember(owner = "client!km", name = "xc", descriptor = "Lclient!na;")
	private static final JagString aClass100_644 = Static28.parse("May");

	@OriginalMember(owner = "client!km", name = "yc", descriptor = "Lclient!na;")
	private static final JagString aClass100_645 = Static28.parse("Nov");

	@OriginalMember(owner = "client!km", name = "zc", descriptor = "Lclient!na;")
	private static final JagString aClass100_646 = Static28.parse("Mar");

	@OriginalMember(owner = "client!km", name = "Gc", descriptor = "Lclient!na;")
	private static final JagString aClass100_649 = Static28.parse("Jan");

	@OriginalMember(owner = "client!km", name = "Hc", descriptor = "Lclient!na;")
	private static final JagString aClass100_650 = Static28.parse("Feb");

	@OriginalMember(owner = "client!km", name = "Tc", descriptor = "Lclient!na;")
	private static final JagString aClass100_655 = Static28.parse("Apr");

	@OriginalMember(owner = "client!km", name = "Wc", descriptor = "Lclient!na;")
	private static final JagString aClass100_656 = Static28.parse("Jun");

	@OriginalMember(owner = "client!km", name = "Qc", descriptor = "Lclient!na;")
	private static final JagString aClass100_653 = Static28.parse("Aug");

	@OriginalMember(owner = "client!km", name = "cd", descriptor = "Lclient!na;")
	private static final JagString aClass100_657 = Static28.parse("Sep");

	@OriginalMember(owner = "client!km", name = "dd", descriptor = "Lclient!na;")
	private static final JagString aClass100_658 = Static28.parse("Oct");

	@OriginalMember(owner = "client!km", name = "Ac", descriptor = "[Lclient!na;")
	public static final JagString[] aClass100Array102 = new JagString[] { aClass100_649, aClass100_650, aClass100_646, aClass100_655, aClass100_644, aClass100_656, aClass100_642, aClass100_653, aClass100_657, aClass100_658, aClass100_645, aClass100_641 };

	@OriginalMember(owner = "client!km", name = "Bc", descriptor = "[I")
	public static final int[] updatedVarcs = new int[32];

	@OriginalMember(owner = "client!km", name = "Mc", descriptor = "Lclient!na;")
	public static final JagString aClass100_652 = Static28.parse("loginscreen");

	@OriginalMember(owner = "client!km", name = "Rc", descriptor = "[I")
	public static final int[] anIntArray324 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!km", name = "Sc", descriptor = "Lclient!na;")
	public static final JagString aClass100_654 = Static28.parse(":trade:");

	@OriginalMember(owner = "client!km", name = "ad", descriptor = "I")
	public static int anInt3445 = 0;

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(III)I")
	public static int method2695(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local14 ^ local14 << 13;
		@Pc(34) int local34 = Integer.MAX_VALUE & (local20 * local20 * 15731 + 789221) * local20 + 1376312589;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILjava/lang/Object;Z)[B")
	public static byte[] method2696(@OriginalArg(1) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(14) byte[] local14 = (byte[]) arg0;
			return arg1 ? Static23.method648(local14) : local14;
		} else if (arg0 instanceof ByteArray) {
			@Pc(34) ByteArray local34 = (ByteArray) arg0;
			return local34.method4236();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!km", name = "f", descriptor = "(I)Z")
	public static boolean method2697() {
		return GlRenderer.enabled ? true : Static162.aBoolean190;
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(Z)Z")
	public static boolean method2699() {
		try {
			if (Static14.anInt441 == 2) {
				if (Static144.aClass3_Sub29_1 == null) {
					Static144.aClass3_Sub29_1 = Static291.method3742(Static172.aClass153_70, Static277.anInt5853, Static226.anInt5085);
					if (Static144.aClass3_Sub29_1 == null) {
						return false;
					}
				}
				if (Static27.aClass89_1 == null) {
					Static27.aClass89_1 = new SoundBank(Static78.aClass153_32, Static252.aClass153_103);
				}
				if (Static172.aClass3_Sub3_Sub4_2.method4411(Static144.aClass3_Sub29_1, Static210.aClass153_87, Static27.aClass89_1)) {
					Static172.aClass3_Sub3_Sub4_2.method4412();
					Static172.aClass3_Sub3_Sub4_2.method4447(Static253.anInt5527);
					Static172.aClass3_Sub3_Sub4_2.method4431(Static72.aBoolean116, Static144.aClass3_Sub29_1);
					Static14.anInt441 = 0;
					Static144.aClass3_Sub29_1 = null;
					Static27.aClass89_1 = null;
					Static172.aClass153_70 = null;
					return true;
				}
			}
		} catch (@Pc(68) Exception local68) {
			local68.printStackTrace();
			Static172.aClass3_Sub3_Sub4_2.method4446();
			Static172.aClass153_70 = null;
			Static144.aClass3_Sub29_1 = null;
			Static14.anInt441 = 0;
			Static27.aClass89_1 = null;
		}
		return false;
	}
}
