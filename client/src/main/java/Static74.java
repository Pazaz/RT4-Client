import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!fn", name = "X", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!fn", name = "Z", descriptor = "Lclient!na;")
	public static final JagString aClass100_461 = Static28.parse(")1 ");

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method1623(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == arg6) {
			Static152.method2826(arg0, arg2, arg5, arg6, arg1, arg4);
		} else if (arg1 - arg6 >= Static172.anInt4164 && arg6 + arg1 <= Static224.anInt5063 && Static267.anInt5773 <= arg2 - arg3 && Static106.anInt2869 >= arg2 + arg3) {
			Static270.method4594(arg5, arg1, arg2, arg4, arg6, arg3, arg0);
		} else {
			Static231.method3981(arg6, arg5, arg4, arg0, arg2, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BIIIII)V")
	public static void method1624(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static241.aClass36Array16[0].method3336(arg2, arg3);
		Static241.aClass36Array16[1].method3336(arg2, arg4 + arg3 - 16);
		@Pc(35) int local35 = arg4 * (arg4 - 32) / arg1;
		if (local35 < 8) {
			local35 = 8;
		}
		@Pc(54) int local54 = arg0 * (arg4 - local35 - 32) / (arg1 - arg4);
		if (!GlRenderer.enabled) {
			Static129.method2495(arg2, arg3 + 16, 16, arg4 - 32, Static182.anInt4306);
			Static129.method2495(arg2, local54 + arg3 + 16, 16, local35, Static53.anInt1704);
			Static129.method2490(arg2, local54 + arg3 + 16, local35, Static219.anInt4938);
			Static129.method2490(arg2 + 1, local54 + 16 + arg3, local35, Static219.anInt4938);
			Static129.method2489(arg2, arg3 + local54 + 16, 16, Static219.anInt4938);
			Static129.method2489(arg2, arg3 + local54 + 17, 16, Static219.anInt4938);
			Static129.method2490(arg2 + 15, local54 + 16 + arg3, local35, Static20.anInt671);
			Static129.method2490(arg2 + 14, arg3 - -17 - -local54, local35 - 1, Static20.anInt671);
			Static129.method2489(arg2, local35 + arg3 + local54 + 15, 16, Static20.anInt671);
			Static129.method2489(arg2 + 1, local35 + arg3 - (-local54 + -14), 15, Static20.anInt671);
			return;
		}
		Static46.method1186(arg2, arg3 + 16, 16, arg4 - 32, Static182.anInt4306);
		Static46.method1186(arg2, arg3 + local54 + 16, 16, local35, Static53.anInt1704);
		Static46.method1176(arg2, local54 + arg3 + 16, local35, Static219.anInt4938);
		Static46.method1176(arg2 + 1, local54 + 16 + arg3, local35, Static219.anInt4938);
		Static46.method1174(arg2, local54 + arg3 + 16, 16, Static219.anInt4938);
		Static46.method1174(arg2, local54 + arg3 + 17, 16, Static219.anInt4938);
		Static46.method1176(arg2 + 15, arg3 + (16 - -local54), local35, Static20.anInt671);
		Static46.method1176(arg2 + 14, arg3 - -local54 + 17, local35 - 1, Static20.anInt671);
		Static46.method1174(arg2, local35 + arg3 + local54 + 15, 16, Static20.anInt671);
		Static46.method1174(arg2 + 1, arg3 + 14 - -local54 + local35, 15, Static20.anInt671);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!be;)V")
	public static void method1625(@OriginalArg(1) Component arg0) {
		@Pc(7) Component local7 = Static280.method4668(arg0);
		@Pc(19) int local19;
		@Pc(17) int local17;
		if (local7 == null) {
			local17 = Static254.anInt5554;
			local19 = Static48.anInt1448;
		} else {
			local17 = local7.anInt459;
			local19 = local7.anInt445;
		}
		Static150.method2801(local17, local19, arg0, false);
		Static111.method2291(arg0, local17, local19);
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(II)V")
	public static void method1626(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static245.load(arg0)) {
			return;
		}
		@Pc(31) Component[] local31 = Static241.components[arg0];
		for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
			@Pc(41) Component local41 = local31[local33];
			if (local41.anObjectArray3 != null) {
				@Pc(50) HookRequest local50 = new HookRequest();
				local50.anObjectArray31 = local41.anObjectArray3;
				local50.source = local41;
				Static88.method1818(2000000, local50);
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!ve;Lclient!ve;Z)I")
	public static int method1628(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method4506(Static166.anInt4049)) {
			local5++;
		}
		if (arg0.method4506(Static130.anInt3161)) {
			local5++;
		}
		if (arg0.method4506(Static73.anInt2077)) {
			local5++;
		}
		if (arg1.method4506(Static166.anInt4049)) {
			local5++;
		}
		if (arg1.method4506(Static130.anInt3161)) {
			local5++;
		}
		if (arg1.method4506(Static73.anInt2077)) {
			local5++;
		}
		return local5;
	}
}
