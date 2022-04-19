import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
	public static int anInt5765;

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "Lclient!dd;")
	public static Class3_Sub2_Sub9_Sub1 aClass3_Sub2_Sub9_Sub1_2;

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "Lclient!na;")
	private static final Class100 aClass100_1084 = Static28.method790("Connecting to update server");

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "Lclient!na;")
	public static Class100 aClass100_1083 = aClass100_1084;

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "Lclient!na;")
	public static final Class100 aClass100_1085 = Static28.method790("Chargement des fichiers config )2 ");

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "Lclient!na;")
	public static final Class100 aClass100_1086 = Static28.method790("_labels");

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)J")
	public static long method4521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub5 local7 = Static130.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass77_1 == null ? 0L : local7.aClass77_1.aLong107;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIILclient!ve;)[Lclient!mm;")
	public static Class3_Sub2_Sub1_Sub1[] method4523(@OriginalArg(2) int arg0, @OriginalArg(3) Class153 arg1) {
		return Static234.method4016(arg1, 0, arg0) ? Static14.method474() : null;
	}
}
