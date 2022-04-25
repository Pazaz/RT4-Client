import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

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
	public static void clear(@OriginalArg(1) boolean arg0) {
		WorldMap.aByteArrayArrayArray8 = null;
		WorldMap.underlayColors = null;
		Static24.component = null;
		WorldMap.aByteArrayArrayArray3 = null;
		WorldMap.overlayColors = null;
		WorldMap.aByteArrayArrayArray10 = null;
		if (arg0 && WorldMap.currentMap != null) {
			Static153.aClass100_724 = WorldMap.currentMap.group;
		} else {
			Static153.aClass100_724 = null;
		}
		WorldMap.aByteArrayArrayArray7 = null;
		WorldMap.aByteArrayArrayArray12 = null;
		WorldMap.scenery = null;
		WorldMap.anIntArrayArrayArray17 = null;
		WorldMap.loadPercentage = 0;
		WorldMap.currentMap = null;
		WorldMap.mapElements.clear();
		WorldMap.labels = null;
		WorldMap.anInt4901 = -1;
		WorldMap.font22 = null;
		WorldMap.font30 = null;
		WorldMap.font12 = null;
		WorldMap.font26 = null;
		WorldMap.font11 = null;
		WorldMap.font14 = null;
		WorldMap.font17 = null;
		WorldMap.font19 = null;
		Static70.aClass3_Sub2_Sub1_2 = null;
		WorldMap.anInt3482 = -1;
		Static153.aClass3_Sub2_Sub1_Sub1_2 = null;
	}
}
