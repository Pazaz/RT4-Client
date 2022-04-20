import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "[Lclient!qf;")
	public static Sprite[] aClass3_Sub2_Sub1Array3;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "Lclient!na;")
	public static final JagString aClass100_583 = Static28.parse("(Y<)4col>");

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
	public static int anInt2951 = 0;

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
	public static int anInt2952 = 0;

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
	public static int anInt2954 = -1;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
	public static int anInt2961 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!ve;I)Lclient!jk;")
	public static MidiInstrument method2320(@OriginalArg(1) Js5 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) byte[] local9 = arg0.method4500(arg1);
		return local9 == null ? null : new MidiInstrument(local9);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)V")
	public static void method2325(@OriginalArg(1) boolean arg0) {
		Static90.aByteArrayArrayArray8 = null;
		Static83.anIntArrayArrayArray3 = null;
		Static24.component = null;
		Static34.aByteArrayArrayArray3 = null;
		Static145.anIntArray330 = null;
		Static125.aByteArrayArrayArray10 = null;
		if (arg0 && Static269.aClass3_Sub2_Sub4_2 != null) {
			Static153.aClass100_724 = Static269.aClass3_Sub2_Sub4_2.aClass100_138;
		} else {
			Static153.aClass100_724 = null;
		}
		Static70.aByteArrayArrayArray7 = null;
		Static229.aByteArrayArrayArray12 = null;
		Static58.anIntArrayArrayArray5 = null;
		Static248.anIntArrayArrayArray17 = null;
		Static41.anInt1309 = 0;
		Static269.aClass3_Sub2_Sub4_2 = null;
		Static145.aClass69_84.method2278();
		Static203.aClass134_1 = null;
		Static217.anInt4901 = -1;
		Static130.aClass41_2 = null;
		Static160.aClass41_4 = null;
		Static152.aClass41_3 = null;
		Static270.aClass41_9 = null;
		Static273.aClass41_7 = null;
		Static169.aClass41_5 = null;
		Static130.aClass41_1 = null;
		Static203.aClass41_8 = null;
		Static70.aClass3_Sub2_Sub1_2 = null;
		Static142.anInt3482 = -1;
		Static153.aClass3_Sub2_Sub1_Sub1_2 = null;
	}
}
