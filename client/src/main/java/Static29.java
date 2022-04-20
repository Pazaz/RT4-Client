import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "Lclient!ve;")
	public static Js5 aClass153_19;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[B)Lclient!rk;")
	public static Font method799(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(27) Font local27;
		if (GlRenderer.enabled) {
			local27 = new GlFont(arg0, Static274.anIntArray440, Static269.anIntArray252, Static254.anIntArray488, Static26.anIntArray66, Static7.aByteArrayArray5);
		} else {
			local27 = new SoftwareFont(arg0, Static274.anIntArray440, Static269.anIntArray252, Static254.anIntArray488, Static26.anIntArray66, Static7.aByteArrayArray5);
		}
		Static75.method1631();
		return local27;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) Class3_Sub7 local9 = null;
		for (@Pc(14) Class3_Sub7 local14 = (Class3_Sub7) Static26.aClass69_27.method2289(); local14 != null; local14 = (Class3_Sub7) Static26.aClass69_27.method2288()) {
			if (local14.anInt918 == arg0 && arg3 == local14.anInt928 && local14.anInt916 == arg1 && arg6 == local14.anInt927) {
				local9 = local14;
				break;
			}
		}
		if (local9 == null) {
			local9 = new Class3_Sub7();
			local9.anInt928 = arg3;
			local9.anInt916 = arg1;
			local9.anInt918 = arg0;
			local9.anInt927 = arg6;
			Static226.method3898(local9);
			Static26.aClass69_27.method2282(local9);
		}
		local9.anInt926 = arg7;
		local9.anInt925 = arg8;
		local9.anInt924 = arg4;
		local9.anInt929 = arg5;
		local9.anInt922 = arg2;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V")
	public static void method801() {
		Static253.anInt5527 = 0;
		Static226.anInt5085 = -1;
		Static14.anInt441 = 1;
		Static57.anInt1757 = 2;
		Static72.aBoolean116 = false;
		Static172.aClass153_70 = null;
		Static277.anInt5853 = -1;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBI)Lclient!bn;")
	public static Map method803(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(10) Map local10 = (Map) Static228.aClass69_120.method2289(); local10 != null; local10 = (Map) Static228.aClass69_120.method2288()) {
			if (local10.aBoolean50 && local10.method664(arg1, arg0)) {
				return local10;
			}
		}
		return null;
	}
}
