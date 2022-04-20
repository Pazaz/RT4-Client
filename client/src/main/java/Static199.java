import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!qc", name = "bb", descriptor = "[Lclient!kl;")
	public static Class3_Sub22[] aClass3_Sub22Array1;

	@OriginalMember(owner = "client!qc", name = "cb", descriptor = "I")
	public static int anInt4675;

	@OriginalMember(owner = "client!qc", name = "K", descriptor = "Lclient!sc;")
	public static HashTable aClass133_20 = new HashTable(16);

	@OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
	public static int anInt4670 = 10;

	@OriginalMember(owner = "client!qc", name = "U", descriptor = "I")
	public static int anInt4672 = 0;

	@OriginalMember(owner = "client!qc", name = "ab", descriptor = "[I")
	public static final int[] anIntArray417 = new int[1000];

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI)Lclient!ni;")
	public static FluType method3593(@OriginalArg(1) int arg0) {
		@Pc(10) FluType local10 = (FluType) Static83.aClass99_3.method3106((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static182.aClass153_77.method4495(1, arg0);
		local10 = new FluType();
		if (local27 != null) {
			local10.method3217(arg0, new Buffer(local27));
		}
		Static83.aClass99_3.method3095(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)I")
	public static int method3594(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLclient!ve;)V")
	public static void method3595(@OriginalArg(1) Js5 arg0) {
		Static35.aClass153_22 = arg0;
		Static98.anInt2510 = Static35.aClass153_22.method4504(4);
	}
}
