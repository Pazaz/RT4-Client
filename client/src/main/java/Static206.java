import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "[I")
	public static int[] anIntArray427;

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "Lclient!ma;")
	public static BufferedSocket js5Socket;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "Lclient!na;")
	public static final JagString aClass100_899 = Static28.parse("0(U");

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "Lclient!na;")
	public static final JagString aClass100_900 = Static28.parse("tbrefresh");

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
	public static int anInt4773 = 0;

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
	public static int anInt4774 = 0;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZIIIIFII)[I")
	public static int[] method3679(@OriginalArg(5) float arg0) {
		@Pc(11) int[] local11 = new int[2048];
		@Pc(15) TextureOp4 local15 = new TextureOp4();
		local15.anInt646 = 8;
		local15.anInt642 = 4;
		local15.anInt650 = 35;
		local15.anInt641 = 8;
		local15.anInt648 = (int) (arg0 * 4096.0F);
		local15.aBoolean44 = true;
		local15.method4630();
		Static10.method348(1, 2048);
		local15.method584(0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLclient!wa;)Lclient!j;")
	public static TextureOp method3680(@OriginalArg(1) Buffer arg0) {
		arg0.g1();
		@Pc(13) int local13 = arg0.g1();
		@Pc(17) TextureOp local17 = Static223.method3860(local13);
		local17.anInt5840 = arg0.g1();
		@Pc(26) int local26 = arg0.g1();
		for (@Pc(34) int local34 = 0; local34 < local26; local34++) {
			@Pc(41) int local41 = arg0.g1();
			local17.method4629(local41, arg0);
		}
		local17.method4630();
		return local17;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZI)I")
	public static int method3681(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
