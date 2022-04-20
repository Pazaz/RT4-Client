import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
	public static int defaultPort;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
	public static int anInt5804 = 0;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray46 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "[B")
	public static final byte[] aByteArray79 = new byte[520];

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!e;I)V")
	public static void method4597(@OriginalArg(0) Player arg0) {
		@Pc(10) AreaSound local10 = (AreaSound) Static93.aClass133_7.method3863(arg0.aClass100_364.encode37());
		if (local10 == null) {
			return;
		}
		if (local10.aClass3_Sub3_Sub1_1 != null) {
			Static204.aClass3_Sub3_Sub2_1.method1347(local10.aClass3_Sub3_Sub1_1);
			local10.aClass3_Sub3_Sub1_1 = null;
		}
		local10.method4658();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!wa;I)V")
	public static void method4598(@OriginalArg(0) Buffer arg0) {
		if (Static121.uid != null) {
			try {
				Static121.uid.method1459(0L);
				Static121.uid.method1458(arg0.data, arg0.offset, 24);
			} catch (@Pc(16) Exception local16) {
			}
		}
		arg0.offset += 24;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZI)V")
	public static void method4600(@OriginalArg(1) int arg0) {
		@Pc(8) DelayedStateChange local8 = Static238.method4143(4, arg0);
		local8.method1007();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Lclient!pb;")
	public static LocType method4601(@OriginalArg(1) int arg0) {
		@Pc(15) LocType local15 = (LocType) Static179.aClass99_25.method3106((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(30) byte[] local30 = Static146.aClass153_54.method4495(Static253.method4328(arg0), Static33.method872(arg0));
		local15 = new LocType();
		local15.anInt4426 = arg0;
		if (local30 != null) {
			local15.method3424(new Buffer(local30));
		}
		local15.method3421();
		if (!Static30.aBoolean61 && local15.aBoolean208) {
			local15.aClass100Array130 = null;
		}
		if (local15.aBoolean210) {
			local15.anInt4435 = 0;
			local15.aBoolean207 = false;
		}
		Static179.aClass99_25.method3095(local15, (long) arg0);
		return local15;
	}
}
