import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
	public static int anInt3947;

	@OriginalMember(owner = "client!ml", name = "Q", descriptor = "I")
	public static int anInt3953 = 0;

	@OriginalMember(owner = "client!ml", name = "ab", descriptor = "Z")
	public static boolean aBoolean190 = true;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BILclient!ve;)[Lclient!ek;")
	public static SoftwareIndexedSprite[] method3088(@OriginalArg(1) int arg0, @OriginalArg(2) Js5 arg1) {
		return Static254.method4346(arg1, arg0) ? Static121.method2406() : null;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B[B)[B")
	public static byte[] method3092(@OriginalArg(1) byte[] arg0) {
		@Pc(17) Buffer local17 = new Buffer(arg0);
		@Pc(21) int local21 = local17.g1();
		@Pc(25) int local25 = local17.g4();
		if (local25 < 0 || Static133.anInt5233 != 0 && Static133.anInt5233 < local25) {
			throw new RuntimeException();
		} else if (local21 == 0) {
			@Pc(53) byte[] local53 = new byte[local25];
			local17.gBytes(local25, local53);
			return local53;
		} else {
			@Pc(65) int local65 = local17.g4();
			if (local65 < 0 || Static133.anInt5233 != 0 && Static133.anInt5233 < local65) {
				throw new RuntimeException();
			}
			@Pc(85) byte[] local85 = new byte[local65];
			if (local21 == 1) {
				Bzip2Decompressor.method3316(local85, local65, arg0, local25);
			} else {
				Static156.aClass56_1.method1842(local85, local17);
			}
			return local85;
		}
	}
}
