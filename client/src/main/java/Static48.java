import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
	public static int anInt1448;

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
	public static int anInt1449;

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
	public static int anInt1447 = 0;

	@OriginalMember(owner = "client!dl", name = "j", descriptor = "Lclient!na;")
	private static final JagString aClass100_346 = Static28.method790("Opened title screen");

	@OriginalMember(owner = "client!dl", name = "k", descriptor = "Lclient!na;")
	public static JagString aClass100_347 = aClass100_346;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(13) int local13 = arg2 - arg6;
		@Pc(17) int local17 = arg3 - arg7;
		@Pc(26) int local26 = (arg0 - arg1 << 16) / local13;
		@Pc(35) int local35 = (arg4 - arg5 << 16) / local17;
		Static232.method3991(arg1, arg3, arg2, local35, arg6, local26, arg7, arg5);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)Lclient!wa;")
	public static Buffer method1196() {
		@Pc(4) Buffer local4 = new Buffer(34);
		local4.method2178(11);
		local4.method2178(Static113.anInt4609);
		local4.method2178(Static162.aBoolean190 ? 1 : 0);
		local4.method2178(Static80.aBoolean231 ? 1 : 0);
		local4.method2178(Static250.aBoolean283 ? 1 : 0);
		local4.method2178(Static53.aBoolean99 ? 1 : 0);
		local4.method2178(Static15.aBoolean33 ? 1 : 0);
		local4.method2178(Static11.aBoolean15 ? 1 : 0);
		local4.method2178(Static159.aBoolean189 ? 1 : 0);
		local4.method2178(Static209.aBoolean240 ? 1 : 0);
		local4.method2178(Static139.anInt3451);
		local4.method2178(Static178.aBoolean202 ? 1 : 0);
		local4.method2178(Static220.aBoolean244 ? 1 : 0);
		local4.method2178(Static71.aBoolean107 ? 1 : 0);
		local4.method2178(Static102.anInt2679);
		local4.method2178(Static99.aBoolean143 ? 1 : 0);
		local4.method2178(Static125.anInt3104);
		local4.method2178(Static12.anInt391);
		local4.method2178(Static30.anInt978);
		local4.method2230(Static114.anInt5831);
		local4.method2230(Static22.anInt729);
		local4.method2178(Static76.method1644());
		local4.method2164(Static164.anInt3988);
		local4.method2178(Static214.anInt5581);
		local4.method2178(Static164.aBoolean191 ? 1 : 0);
		local4.method2178(Static33.aBoolean63 ? 1 : 0);
		local4.method2178(Static141.anInt3474);
		local4.method2178(Static127.aBoolean159 ? 1 : 0);
		local4.method2178(Static64.aBoolean111 ? 1 : 0);
		return local4;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V")
	public static void method1197(@OriginalArg(1) int arg0) {
		@Pc(10) Mouse local10 = Static93.aClass150_1;
		synchronized (Static93.aClass150_1) {
			Static93.anInt2467 = arg0;
		}
	}
}
