import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static199 {

	@OriginalMember(owner = "client!qc", name = "cb", descriptor = "I")
	public static int anInt4675;

	@OriginalMember(owner = "client!qc", name = "K", descriptor = "Lclient!sc;")
	public static HashTable aClass133_20 = new HashTable(16);

	@OriginalMember(owner = "client!qc", name = "U", descriptor = "I")
	public static int rectDebug = 0;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)I")
	public static int method3594(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

}
