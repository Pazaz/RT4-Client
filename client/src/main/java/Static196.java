import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "[Lclient!ba;")
	public static World[] aClass10_Sub1Array2;

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "[I")
	public static final int[] anIntArray408 = new int[500];

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "Lclient!na;")
	public static final JagString aClass100_863 = Static28.parse(":tradereq:");

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
	public static int anInt4587 = 0;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)V")
	public static void setGameState(@OriginalArg(0) int arg0) {
		if (client.gameState == arg0) {
			return;
		}
		if (client.gameState == 0) {
			Static163.method3097();
		}
		if (arg0 == 40) {
			Static49.method1208();
		}
		@Pc(37) boolean local37 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		if (arg0 != 40 && Static233.aClass95_4 != null) {
			Static233.aClass95_4.close();
			Static233.aClass95_4 = null;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static271.anInt5804 = 0;
			Static230.anInt5150 = 1;
			Static233.loadingScreenState = 0;
			Static38.anInt1196 = 1;
			Static175.mapFilesMissingCount = 0;
			Static116.clear(true);
		}
		if (arg0 == 25 || arg0 == 10) {
			Static123.topBannerRefresh();
		}
		if (arg0 == 5) {
			Static181.load(Static209.js5Archive8);
		} else {
			Static119.method2381();
		}
		@Pc(106) boolean local106 = client.gameState == 5 || client.gameState == 10 || client.gameState == 28;
		if (local106 != local37) {
			if (local37) {
				Static221.anInt4363 = Static250.titleSong;
				if (Preferences.musicVolume == 0) {
					Static29.method801();
				} else {
					Static257.method526(Static250.titleSong, Static130.js5Archive6, 255);
				}
				client.js5NetQueue.method2322(false);
			} else {
				Static29.method801();
				client.js5NetQueue.method2322(true);
			}
		}
		if (GlRenderer.enabled && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
			GlRenderer.method4160();
		}
		client.gameState = arg0;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZI)V")
	public static void method3535(@OriginalArg(0) boolean arg0) {
		Static221.anIntArray376 = new int[104];
		Static139.anIntArray325 = new int[104];
		Static146.anInt3508 = 99;
		Static251.anIntArray479 = new int[104];
		@Pc(14) byte local14;
		if (arg0) {
			local14 = 1;
		} else {
			local14 = 4;
		}
		Static163.aByteArrayArrayArray11 = new byte[local14][104][104];
		Static128.anIntArray293 = new int[104];
		Static60.anIntArrayArrayArray6 = new int[local14][105][105];
		Static118.aByteArrayArrayArray9 = new byte[local14][105][105];
		Static240.aByteArrayArrayArray14 = new byte[local14][104][104];
		Static279.anIntArray568 = new int[104];
		Static4.aByteArrayArrayArray1 = new byte[local14][104][104];
		Static253.aByteArrayArrayArray16 = new byte[local14][104][104];
	}

}
