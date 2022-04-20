import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
	public static int anInt3038;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
	public static int anInt3039;

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "Lclient!en;")
	public static BufferedFile uid;

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
	public static int anInt3041;

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "Lclient!ve;")
	public static Js5 aClass153_45;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "Z")
	public static boolean aBoolean154 = false;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)[Lclient!ek;")
	public static SoftwareIndexedSprite[] method2406() {
		@Pc(2) SoftwareIndexedSprite[] local2 = new SoftwareIndexedSprite[Static165.anInt4038];
		for (@Pc(8) int local8 = 0; local8 < Static165.anInt4038; local8++) {
			local2[local8] = new SoftwareIndexedSprite(Static124.anInt3080, Static227.anInt5091, Static274.anIntArray440[local8], Static269.anIntArray252[local8], Static254.anIntArray488[local8], Static26.anIntArray66[local8], Static7.aByteArrayArray5[local8], Static259.anIntArray513);
		}
		Static75.method1631();
		return local2;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBIII)V")
	public static void method2407(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static24.anInt766; local3++) {
			if (arg0 < Static264.anIntArray410[local3] + Static224.anIntArray443[local3] && arg0 + arg3 > Static264.anIntArray410[local3] && Static50.anIntArray133[local3] + Static67.anIntArray320[local3] > arg1 && Static50.anIntArray133[local3] < arg2 + arg1) {
				Static31.aBooleanArray29[local3] = true;
			}
		}
	}
}
