import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!si", name = "R", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!si", name = "S", descriptor = "[Lclient!na;")
	public static JagString[] aClass100Array156;

	@OriginalMember(owner = "client!si", name = "ab", descriptor = "I")
	public static int anInt5138;

	@OriginalMember(owner = "client!si", name = "cb", descriptor = "[B")
	public static byte[] aByteArray70;

	@OriginalMember(owner = "client!si", name = "X", descriptor = "[Lclient!sg;")
	public static final StockMarketOffer[] aClass136Array1 = new StockMarketOffer[6];

	@OriginalMember(owner = "client!si", name = "Z", descriptor = "Lclient!na;")
	public static final JagString aClass100_972 = Static28.parse("<col=ffb000>");

	@OriginalMember(owner = "client!si", name = "eb", descriptor = "I")
	public static volatile int anInt5140 = 0;

	@OriginalMember(owner = "client!si", name = "gb", descriptor = "Lclient!na;")
	public static final JagString aClass100_974 = Static28.parse("<br>(X");

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZB)I")
	public static int method3933(@OriginalArg(1) byte arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)V")
	public static void method3935(@OriginalArg(0) int arg0) {
		Static161.method3060(Static161.anInt3923, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
		Static161.method3063(-50.0F, -60.0F, -50.0F);
		Static161.method3062(Static161.anInt3922, 0);
		Static161.method3058();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BLclient!na;)I")
	public static int method3937(@OriginalArg(1) JagString arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(IIB)V")
	public static void method3938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) DelayedStateChange local16 = Static238.method4143(12, arg1);
		local16.method1017();
		local16.intArg1 = arg0;
	}
}
