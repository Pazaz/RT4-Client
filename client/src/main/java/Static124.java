import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!jk", name = "x", descriptor = "I")
	public static int anInt3080;

	@OriginalMember(owner = "client!jk", name = "B", descriptor = "Lclient!ma;")
	public static BufferedSocket socket;

	@OriginalMember(owner = "client!jk", name = "J", descriptor = "I")
	public static int anInt3083;

	@OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
	public static int anInt3075 = -1;

	@OriginalMember(owner = "client!jk", name = "y", descriptor = "Z")
	public static boolean aBoolean156 = false;

	@OriginalMember(owner = "client!jk", name = "z", descriptor = "Lclient!n;")
	public static final SoftLruHashTable aClass99_17 = new SoftLruHashTable(50);

	@OriginalMember(owner = "client!jk", name = "F", descriptor = "Lclient!na;")
	public static final JagString aClass100_596 = Static28.parse("::tween");

	@OriginalMember(owner = "client!jk", name = "G", descriptor = "Z")
	public static boolean aBoolean157 = false;

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "(B)V")
	public static void method2433() {
		Static262.aClass99_34.method3104();
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILclient!na;)Lclient!bn;")
	public static Map method2434(@OriginalArg(1) JagString arg0) {
		for (@Pc(15) Map local15 = (Map) Static228.aClass69_120.method2289(); local15 != null; local15 = (Map) Static228.aClass69_120.method2288()) {
			if (local15.aClass100_138.method3108(arg0)) {
				return local15;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZ[BII[Lclient!mj;)V")
	public static void method2437(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) CollisionMap[] arg4) {
		@Pc(10) Buffer local10 = new Buffer(arg2);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.gVarSmart();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(31) int local31 = local10.gSmart1or2();
				if (local31 == 0) {
					break;
				}
				local27 += local31 - 1;
				@Pc(46) int local46 = local27 & 0x3F;
				@Pc(50) int local50 = local27 >> 12;
				@Pc(56) int local56 = local27 >> 6 & 0x3F;
				@Pc(60) int local60 = local10.g1();
				@Pc(64) int local64 = local60 >> 2;
				@Pc(68) int local68 = local60 & 0x3;
				@Pc(72) int local72 = arg0 + local56;
				@Pc(76) int local76 = local46 + arg3;
				if (local72 > 0 && local76 > 0 && local72 < 103 && local76 < 103) {
					@Pc(90) CollisionMap local90 = null;
					if (!arg1) {
						@Pc(95) int local95 = local50;
						if ((Static12.aByteArrayArrayArray2[1][local72][local76] & 0x2) == 2) {
							local95 = local50 - 1;
						}
						if (local95 >= 0) {
							local90 = arg4[local95];
						}
					}
					Static185.method3397(local50, !arg1, local50, arg1, local90, local12, local64, local72, local76, local68);
				}
			}
		}
	}
}
