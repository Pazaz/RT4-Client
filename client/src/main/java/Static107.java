import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static107 {

	@OriginalMember(owner = "client!id", name = "i", descriptor = "[[[I")
	public static int[][][] surfaceTileHeightMap;

	@OriginalMember(owner = "client!id", name = "k", descriptor = "I")
	public static int anInt2878;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "Lclient!jb;")
	public static Js5NetQueue js5NetQueue;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "I")
	public static int anInt2875 = -1;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "Lclient!na;")
	public static final JagString aClass100_566 = Static28.parse("::fpson");

	@OriginalMember(owner = "client!id", name = "d", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray9 = new int[2][][];

	@OriginalMember(owner = "client!id", name = "e", descriptor = "[I")
	public static final int[] anIntArray259 = new int[14];

	@OriginalMember(owner = "client!id", name = "f", descriptor = "Z")
	public static boolean clean = false;

	@OriginalMember(owner = "client!id", name = "j", descriptor = "Lclient!of;")
	public static QuickChatCommandDecoder anInterface3_1 = null;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public static void loop() {
		if (Static147.soundChannel != null) {
			Static147.soundChannel.loop();
		}
		if (Static11.musicChannel != null) {
			Static11.musicChannel.loop();
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIBII)V")
	public static void method2263(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1) {
		Static224.anInt5063 = arg1;
		Static172.anInt4164 = 0;
		Static267.anInt5773 = 0;
		Static106.anInt2869 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!ve;B)V")
	public static void init(@OriginalArg(0) Js5 arg0) {
		Static85.aClass153_36 = arg0;
	}
}
